package dev.amb.uima.flowControl;


import java.util.ArrayList;

import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.text.AnnotationIndex;
import org.apache.uima.flow.FinalStep;
import org.apache.uima.flow.JCasFlow_ImplBase;
import org.apache.uima.flow.SimpleStep;
import org.apache.uima.flow.Step;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;

import dev.amb.uima.typeSystem.metaData.DocInfo;

public class DocTypeFlow extends JCasFlow_ImplBase {

	private JCas jcas = null;
	private ArrayList<String> aeList = null;

	private String docType = null;

	private int numAEsExecuted = 0;

	private boolean flowListCreated = false;


	// Constructor with jcas and list of AEs so instance of this class can track AE execution and build logic on CAS content
	public DocTypeFlow(JCas jcasIn, ArrayList<String> aeListIn) {
		this.aeList = aeListIn;
		this.jcas = jcasIn;
	}

	// this works
	//	@Override
	//	public Step next() throws AnalysisEngineProcessException {
	//		try {
	//			if(this.aeList != null && this.aeList.isEmpty() == false) {
	//				String aeKey = aeList.get(0);
	//				
	//				// now remove the AE key from the list to stop duplicate AE execution
	//				aeList.remove(0);
	//				aeList.trimToSize();
	//				
	//				return new SimpleStep(aeKey);
	//			}  else {
	//				return new FinalStep();
	//			}
	//		} catch (Exception e) {
	//			e.printStackTrace();
	//			throw new AnalysisEngineProcessException();
	//		}
	//	}
	@Override
	public Step next() throws AnalysisEngineProcessException {
		System.out.println("INFO: Number of AEs executed so far :: " + this.numAEsExecuted);
		// assume we are done, unless we set a simple step that is either DocType annotator or one of the AEs for type1 or type2 flow
		Step step = new FinalStep();

		try {

			if(numAEsExecuted==0) {

				System.out.println("Seeking to run the DocType annotator ::" + this.numAEsExecuted);
				// run the DocInfo annotator
				// DocType AE is at 0 index at this stage
				System.out.println("\tCreated step for DocType AE :: " + this.aeList.get(0) );
				step = new SimpleStep(this.aeList.get(0));

				// DocType AE removed from AE list
				this.aeList.remove(0);
				this.aeList.trimToSize();

			} else {


				if(this.docType == null) {
					// we have run the AE, but not grabbed the value from the CAS
					AnnotationIndex<Annotation> iter = this.jcas.getAnnotationIndex(DocInfo.type);

					// Now set DocType from DocInfo annotation
					if(iter.size() > 1) {
						System.out.println("\tWARN: Found more than 1 DocInfo annotation");
					}

					for(Annotation an : iter) {
						if(an instanceof DocInfo) {
							DocInfo di = (DocInfo) an;
							this.docType = di.getAttrValue();

						} else {
							// this would be real funky!
							throw new AnalysisEngineProcessException();
						}
						System.out.println("INFO: Document Type set to :: " + this.docType);

						// make sure we only modify the list of AEs for the flow once
						if(this.flowListCreated == false) {
							this.aeList = this.createFlowList(this.docType, this.aeList);
						}
						step = this.listStep(aeList);
					} 
				} else {
					step = this.listStep(aeList);
				}
			}
			
			this.numAEsExecuted++;
			return step;
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new AnalysisEngineProcessException(e);
		}
	}

	// should only be called once
	private ArrayList<String> createFlowList(String docTypeIn, ArrayList<String> aeListIn) {
		ArrayList<String> flowList = new ArrayList<String>();
		
		if(docType.equals("type1")) {
			if(aeListIn != null && aeListIn.isEmpty() == false) {
				for(String aeKey : aeListIn) {
					// type1 flow has names and org AE
					if(aeKey.contains("Name")) {
						System.out.println("Adding Name annotator :: " + aeKey + " to flow1 list");
						flowList.add(aeKey);
					} else if(aeKey.contains("Org")) {
						System.out.println("Adding Org annotator :: " + aeKey + " to flow1 list");
						flowList.add(aeKey);
					}
				}
				flowList.trimToSize();
			}

		} else if(docType.equals("type2")) {
			if(aeListIn != null && aeListIn.isEmpty() == false) {
				for(String aeKey : aeListIn) {
					// type2 flow has places
					if(aeKey.contains("Place")) {
						System.out.println("Adding Place annotator :: " + aeKey + " to flow2 list");
						flowList.add(aeKey);
					}
				}
				flowList.trimToSize();
			}
		}
		this.flowListCreated = true;
		System.out.println("Created flow list for type2 docs:: " + flowList.size());
		return flowList;
	}

	private Step listStep(ArrayList<String> list) throws AnalysisEngineProcessException {
		try {
			if(list.isEmpty() == true) {
				System.out.println("INFO: Created a FinalStep for this CAS");
				return new FinalStep();
			} else {
				// get the key & create step
				String aeKey = list.get(0);
				Step step = new SimpleStep(aeKey);

				// now remove the AE key from the list to stop duplicate AE execution
				list.remove(0);
				list.trimToSize();

				// set the CAS instance aeList to the new reduced list
				this.aeList = list;

				System.out.println("\tCreated step for the AE :: " + aeKey);
				return step;
			}
		} catch(Exception e) {
			e.printStackTrace();
			throw new AnalysisEngineProcessException(e);
		}
	}

}

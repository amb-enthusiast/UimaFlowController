package dev.amb.uima.flowControl;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.analysis_engine.metadata.AnalysisEngineMetaData;
import org.apache.uima.flow.Flow;
import org.apache.uima.flow.FlowControllerContext;
import org.apache.uima.flow.JCasFlowController_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;

public class DocTypeFlowController extends JCasFlowController_ImplBase {

	private ArrayList<String> aeList = new ArrayList<String>();
	
	@Override
	public Flow computeFlow(JCas jcas) throws AnalysisEngineProcessException {
		try {
			FlowControllerContext aContext = getContext();

			if(aContext != null && aContext.getAggregateMetadata() != null && aContext.getAnalysisEngineMetaDataMap().entrySet() != null) {
				Set<Entry<String, AnalysisEngineMetaData>> aeMetaDataSet = aContext.getAnalysisEngineMetaDataMap().entrySet();
				
				System.out.println("Setting up AE meta data from context:: " + aeMetaDataSet.size());
				
				this.aeList = this.createOrderedAEs(aContext);
				
				this.aeList.trimToSize();
			}

			System.out.println("Number of AEs = " + this.aeList.size());

			DocTypeFlow flow = new DocTypeFlow(jcas, this.aeList);
			return flow;
		} catch(Exception e) {
			e.printStackTrace();
			throw new AnalysisEngineProcessException(e);
		}
	}

	// create ordered list of AEs
	private ArrayList<String> createOrderedAEs(FlowControllerContext aContext) throws ResourceInitializationException {
		try {
			
			ArrayList<String> list = new ArrayList<String>();
			System.out.println("INFO:: size of original AE list = " + list.size());

			for(String key : aContext.getAnalysisEngineMetaDataMap().keySet()) {
				list.add(key);
			}
			
			ArrayList<String> orderedList = (ArrayList<String>) list.clone();
			
			for(String key : list) {
			System.out.println("INFO:: AE key = " + key );
				// hard wire key order in list
				if(key.contains("DocType")) {
					orderedList.set(0, key);
				} else if(key.contains("Name")) {
					orderedList.set(1, key);
				} else if(key.contains("Org")) {
					orderedList.set(2, key);
				} else if(key.contains("Place")) {
					orderedList.set(3, key);
				}
			}
			list = null;
			System.out.println("AE list::\n" + orderedList);
			return orderedList;

		} catch(Exception e) {
			e.printStackTrace();
			throw new ResourceInitializationException(e);
		}
	}
}

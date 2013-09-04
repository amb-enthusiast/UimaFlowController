package dev.amb.uima.annotators;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;

import dev.amb.uima.typeSystem.metaData.DocInfo;

public class DocTypeAnnotator extends JCasAnnotator_ImplBase {

	@Override
	public void process(JCas jcas) throws AnalysisEngineProcessException {
		try {
			if(jcas.getDocumentText().contains("Report")) {
				DocInfo info = new DocInfo(jcas);
				info.setKey("type");
				info.setAttrValue("type1");
				info.setBegin(0);
				info.setEnd(56);
				info.addToIndexes();
				
			} else {
				DocInfo info = new DocInfo(jcas);
				info.setKey("type");
				info.setAttrValue("type2");
				info.setBegin(0);
				info.setEnd(56);
				info.addToIndexes();
			}


		} catch (Exception e) {
			throw new AnalysisEngineProcessException(e);
		}
	}
}

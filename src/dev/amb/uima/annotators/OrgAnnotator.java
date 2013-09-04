package dev.amb.uima.annotators;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;

import dev.amb.uima.typeSystem.semantic.Organisation;

public class OrgAnnotator extends JCasAnnotator_ImplBase {

	@Override
	public void process(JCas jcas) throws AnalysisEngineProcessException {
		try {
			String text = jcas.getDocumentText();
			/*
			 * Assume noddy sample sentence:
			 * Report: Ant went to Denver on DeveloperInc business.
			 */
			
			if(text.contains("DeveloperInc")) {
				Organisation org = new Organisation(jcas);
				org.setBegin(30);
				org.setEnd(42);
				org.addToIndexes();
			}
			
		} catch (Exception e) {
			throw new AnalysisEngineProcessException(e);
		}
		
	}

}

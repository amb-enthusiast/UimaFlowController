package dev.amb.uima.annotators;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;

import dev.amb.uima.typeSystem.semantic.Location;

public class PlaceAnnotator extends JCasAnnotator_ImplBase {

	@Override
	public void process(JCas jcas) throws AnalysisEngineProcessException {
		try {
			String text = jcas.getDocumentText();
			/*
			 * Assume noddy sample sentence:
			 * Report: Ant went to Denver on DeveloperInc business.
			 */
			if(text.contains("Denver")) {
				Location loc = new Location(jcas);
				loc.setBegin(20);
				loc.setEnd(26);
				loc.addToIndexes();
			}
			
		} catch (Exception e) {
			throw new AnalysisEngineProcessException(e);
		}
		
	}

}

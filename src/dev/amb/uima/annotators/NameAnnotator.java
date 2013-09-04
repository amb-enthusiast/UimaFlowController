package dev.amb.uima.annotators;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;

import dev.amb.uima.typeSystem.semantic.Person;

public class NameAnnotator extends JCasAnnotator_ImplBase {

	@Override
	public void process(JCas jcas) throws AnalysisEngineProcessException {
		try {
			String text = jcas.getDocumentText();
			/*
			 * Assume noddy sample sentence:
			 * Report: Ant went to Denver on DeveloperInc business.
			 */
			if(text.contains("Ant")) {
				Person p = new Person(jcas);
				p.setBegin(8);
				p.setEnd(11);
				p.addToIndexes();
				
			}
			
		} catch (Exception e) {
			throw new AnalysisEngineProcessException(e);
		}
		
	}

}

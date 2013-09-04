
/* First created by JCasGen Tue Sep 03 22:19:52 MDT 2013 */
package dev.amb.uima.typeSystem.semantic;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Tue Sep 03 22:19:52 MDT 2013
 * @generated */
public class EntitySentencePair_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (EntitySentencePair_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = EntitySentencePair_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new EntitySentencePair(addr, EntitySentencePair_Type.this);
  			   EntitySentencePair_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new EntitySentencePair(addr, EntitySentencePair_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = EntitySentencePair.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("dev.amb.uima.typeSystem.semantic.EntitySentencePair");
 
  /** @generated */
  final Feature casFeat_entity1;
  /** @generated */
  final int     casFeatCode_entity1;
  /** @generated */ 
  public int getEntity1(int addr) {
        if (featOkTst && casFeat_entity1 == null)
      jcas.throwFeatMissing("entity1", "dev.amb.uima.typeSystem.semantic.EntitySentencePair");
    return ll_cas.ll_getRefValue(addr, casFeatCode_entity1);
  }
  /** @generated */    
  public void setEntity1(int addr, int v) {
        if (featOkTst && casFeat_entity1 == null)
      jcas.throwFeatMissing("entity1", "dev.amb.uima.typeSystem.semantic.EntitySentencePair");
    ll_cas.ll_setRefValue(addr, casFeatCode_entity1, v);}
    
  
 
  /** @generated */
  final Feature casFeat_entity2;
  /** @generated */
  final int     casFeatCode_entity2;
  /** @generated */ 
  public int getEntity2(int addr) {
        if (featOkTst && casFeat_entity2 == null)
      jcas.throwFeatMissing("entity2", "dev.amb.uima.typeSystem.semantic.EntitySentencePair");
    return ll_cas.ll_getRefValue(addr, casFeatCode_entity2);
  }
  /** @generated */    
  public void setEntity2(int addr, int v) {
        if (featOkTst && casFeat_entity2 == null)
      jcas.throwFeatMissing("entity2", "dev.amb.uima.typeSystem.semantic.EntitySentencePair");
    ll_cas.ll_setRefValue(addr, casFeatCode_entity2, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sentence;
  /** @generated */
  final int     casFeatCode_sentence;
  /** @generated */ 
  public int getSentence(int addr) {
        if (featOkTst && casFeat_sentence == null)
      jcas.throwFeatMissing("sentence", "dev.amb.uima.typeSystem.semantic.EntitySentencePair");
    return ll_cas.ll_getRefValue(addr, casFeatCode_sentence);
  }
  /** @generated */    
  public void setSentence(int addr, int v) {
        if (featOkTst && casFeat_sentence == null)
      jcas.throwFeatMissing("sentence", "dev.amb.uima.typeSystem.semantic.EntitySentencePair");
    ll_cas.ll_setRefValue(addr, casFeatCode_sentence, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public EntitySentencePair_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_entity1 = jcas.getRequiredFeatureDE(casType, "entity1", "dev.amb.uima.typeSystem.semantic.Entity", featOkTst);
    casFeatCode_entity1  = (null == casFeat_entity1) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_entity1).getCode();

 
    casFeat_entity2 = jcas.getRequiredFeatureDE(casType, "entity2", "dev.amb.uima.typeSystem.semantic.Entity", featOkTst);
    casFeatCode_entity2  = (null == casFeat_entity2) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_entity2).getCode();

 
    casFeat_sentence = jcas.getRequiredFeatureDE(casType, "sentence", "dev.amb.uima.typeSystem.language.Sentence", featOkTst);
    casFeatCode_sentence  = (null == casFeat_sentence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sentence).getCode();

  }
}



    
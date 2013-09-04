
/* First created by JCasGen Tue Sep 03 22:19:52 MDT 2013 */
package dev.amb.uima.typeSystem.language;

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
public class Sentence_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Sentence_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Sentence_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Sentence(addr, Sentence_Type.this);
  			   Sentence_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Sentence(addr, Sentence_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Sentence.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("dev.amb.uima.typeSystem.language.Sentence");
 
  /** @generated */
  final Feature casFeat_documentOrder;
  /** @generated */
  final int     casFeatCode_documentOrder;
  /** @generated */ 
  public int getDocumentOrder(int addr) {
        if (featOkTst && casFeat_documentOrder == null)
      jcas.throwFeatMissing("documentOrder", "dev.amb.uima.typeSystem.language.Sentence");
    return ll_cas.ll_getIntValue(addr, casFeatCode_documentOrder);
  }
  /** @generated */    
  public void setDocumentOrder(int addr, int v) {
        if (featOkTst && casFeat_documentOrder == null)
      jcas.throwFeatMissing("documentOrder", "dev.amb.uima.typeSystem.language.Sentence");
    ll_cas.ll_setIntValue(addr, casFeatCode_documentOrder, v);}
    
  
 
  /** @generated */
  final Feature casFeat_wordTokens;
  /** @generated */
  final int     casFeatCode_wordTokens;
  /** @generated */ 
  public int getWordTokens(int addr) {
        if (featOkTst && casFeat_wordTokens == null)
      jcas.throwFeatMissing("wordTokens", "dev.amb.uima.typeSystem.language.Sentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_wordTokens);
  }
  /** @generated */    
  public void setWordTokens(int addr, int v) {
        if (featOkTst && casFeat_wordTokens == null)
      jcas.throwFeatMissing("wordTokens", "dev.amb.uima.typeSystem.language.Sentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_wordTokens, v);}
    
   /** @generated */
  public int getWordTokens(int addr, int i) {
        if (featOkTst && casFeat_wordTokens == null)
      jcas.throwFeatMissing("wordTokens", "dev.amb.uima.typeSystem.language.Sentence");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_wordTokens), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_wordTokens), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_wordTokens), i);
  }
   
  /** @generated */ 
  public void setWordTokens(int addr, int i, int v) {
        if (featOkTst && casFeat_wordTokens == null)
      jcas.throwFeatMissing("wordTokens", "dev.amb.uima.typeSystem.language.Sentence");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_wordTokens), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_wordTokens), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_wordTokens), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_phraseChunks;
  /** @generated */
  final int     casFeatCode_phraseChunks;
  /** @generated */ 
  public int getPhraseChunks(int addr) {
        if (featOkTst && casFeat_phraseChunks == null)
      jcas.throwFeatMissing("phraseChunks", "dev.amb.uima.typeSystem.language.Sentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_phraseChunks);
  }
  /** @generated */    
  public void setPhraseChunks(int addr, int v) {
        if (featOkTst && casFeat_phraseChunks == null)
      jcas.throwFeatMissing("phraseChunks", "dev.amb.uima.typeSystem.language.Sentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_phraseChunks, v);}
    
   /** @generated */
  public int getPhraseChunks(int addr, int i) {
        if (featOkTst && casFeat_phraseChunks == null)
      jcas.throwFeatMissing("phraseChunks", "dev.amb.uima.typeSystem.language.Sentence");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_phraseChunks), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_phraseChunks), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_phraseChunks), i);
  }
   
  /** @generated */ 
  public void setPhraseChunks(int addr, int i, int v) {
        if (featOkTst && casFeat_phraseChunks == null)
      jcas.throwFeatMissing("phraseChunks", "dev.amb.uima.typeSystem.language.Sentence");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_phraseChunks), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_phraseChunks), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_phraseChunks), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_entityPairs;
  /** @generated */
  final int     casFeatCode_entityPairs;
  /** @generated */ 
  public int getEntityPairs(int addr) {
        if (featOkTst && casFeat_entityPairs == null)
      jcas.throwFeatMissing("entityPairs", "dev.amb.uima.typeSystem.language.Sentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_entityPairs);
  }
  /** @generated */    
  public void setEntityPairs(int addr, int v) {
        if (featOkTst && casFeat_entityPairs == null)
      jcas.throwFeatMissing("entityPairs", "dev.amb.uima.typeSystem.language.Sentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_entityPairs, v);}
    
   /** @generated */
  public int getEntityPairs(int addr, int i) {
        if (featOkTst && casFeat_entityPairs == null)
      jcas.throwFeatMissing("entityPairs", "dev.amb.uima.typeSystem.language.Sentence");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_entityPairs), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_entityPairs), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_entityPairs), i);
  }
   
  /** @generated */ 
  public void setEntityPairs(int addr, int i, int v) {
        if (featOkTst && casFeat_entityPairs == null)
      jcas.throwFeatMissing("entityPairs", "dev.amb.uima.typeSystem.language.Sentence");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_entityPairs), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_entityPairs), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_entityPairs), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Sentence_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_documentOrder = jcas.getRequiredFeatureDE(casType, "documentOrder", "uima.cas.Integer", featOkTst);
    casFeatCode_documentOrder  = (null == casFeat_documentOrder) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_documentOrder).getCode();

 
    casFeat_wordTokens = jcas.getRequiredFeatureDE(casType, "wordTokens", "uima.cas.FSArray", featOkTst);
    casFeatCode_wordTokens  = (null == casFeat_wordTokens) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_wordTokens).getCode();

 
    casFeat_phraseChunks = jcas.getRequiredFeatureDE(casType, "phraseChunks", "uima.cas.FSArray", featOkTst);
    casFeatCode_phraseChunks  = (null == casFeat_phraseChunks) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_phraseChunks).getCode();

 
    casFeat_entityPairs = jcas.getRequiredFeatureDE(casType, "entityPairs", "uima.cas.FSArray", featOkTst);
    casFeatCode_entityPairs  = (null == casFeat_entityPairs) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_entityPairs).getCode();

  }
}



    
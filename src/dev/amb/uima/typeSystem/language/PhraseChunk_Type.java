
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
public class PhraseChunk_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (PhraseChunk_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = PhraseChunk_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new PhraseChunk(addr, PhraseChunk_Type.this);
  			   PhraseChunk_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new PhraseChunk(addr, PhraseChunk_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = PhraseChunk.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("dev.amb.uima.typeSystem.language.PhraseChunk");
 
  /** @generated */
  final Feature casFeat_chunkType;
  /** @generated */
  final int     casFeatCode_chunkType;
  /** @generated */ 
  public String getChunkType(int addr) {
        if (featOkTst && casFeat_chunkType == null)
      jcas.throwFeatMissing("chunkType", "dev.amb.uima.typeSystem.language.PhraseChunk");
    return ll_cas.ll_getStringValue(addr, casFeatCode_chunkType);
  }
  /** @generated */    
  public void setChunkType(int addr, String v) {
        if (featOkTst && casFeat_chunkType == null)
      jcas.throwFeatMissing("chunkType", "dev.amb.uima.typeSystem.language.PhraseChunk");
    ll_cas.ll_setStringValue(addr, casFeatCode_chunkType, v);}
    
  
 
  /** @generated */
  final Feature casFeat_chunkWords;
  /** @generated */
  final int     casFeatCode_chunkWords;
  /** @generated */ 
  public int getChunkWords(int addr) {
        if (featOkTst && casFeat_chunkWords == null)
      jcas.throwFeatMissing("chunkWords", "dev.amb.uima.typeSystem.language.PhraseChunk");
    return ll_cas.ll_getRefValue(addr, casFeatCode_chunkWords);
  }
  /** @generated */    
  public void setChunkWords(int addr, int v) {
        if (featOkTst && casFeat_chunkWords == null)
      jcas.throwFeatMissing("chunkWords", "dev.amb.uima.typeSystem.language.PhraseChunk");
    ll_cas.ll_setRefValue(addr, casFeatCode_chunkWords, v);}
    
   /** @generated */
  public int getChunkWords(int addr, int i) {
        if (featOkTst && casFeat_chunkWords == null)
      jcas.throwFeatMissing("chunkWords", "dev.amb.uima.typeSystem.language.PhraseChunk");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_chunkWords), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_chunkWords), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_chunkWords), i);
  }
   
  /** @generated */ 
  public void setChunkWords(int addr, int i, int v) {
        if (featOkTst && casFeat_chunkWords == null)
      jcas.throwFeatMissing("chunkWords", "dev.amb.uima.typeSystem.language.PhraseChunk");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_chunkWords), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_chunkWords), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_chunkWords), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_headPhrase;
  /** @generated */
  final int     casFeatCode_headPhrase;
  /** @generated */ 
  public int getHeadPhrase(int addr) {
        if (featOkTst && casFeat_headPhrase == null)
      jcas.throwFeatMissing("headPhrase", "dev.amb.uima.typeSystem.language.PhraseChunk");
    return ll_cas.ll_getRefValue(addr, casFeatCode_headPhrase);
  }
  /** @generated */    
  public void setHeadPhrase(int addr, int v) {
        if (featOkTst && casFeat_headPhrase == null)
      jcas.throwFeatMissing("headPhrase", "dev.amb.uima.typeSystem.language.PhraseChunk");
    ll_cas.ll_setRefValue(addr, casFeatCode_headPhrase, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public PhraseChunk_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_chunkType = jcas.getRequiredFeatureDE(casType, "chunkType", "uima.cas.String", featOkTst);
    casFeatCode_chunkType  = (null == casFeat_chunkType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_chunkType).getCode();

 
    casFeat_chunkWords = jcas.getRequiredFeatureDE(casType, "chunkWords", "uima.cas.FSArray", featOkTst);
    casFeatCode_chunkWords  = (null == casFeat_chunkWords) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_chunkWords).getCode();

 
    casFeat_headPhrase = jcas.getRequiredFeatureDE(casType, "headPhrase", "dev.amb.uima.typeSystem.language.PhraseChunk", featOkTst);
    casFeatCode_headPhrase  = (null == casFeat_headPhrase) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_headPhrase).getCode();

  }
}



    

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
public class WordToken_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (WordToken_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = WordToken_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new WordToken(addr, WordToken_Type.this);
  			   WordToken_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new WordToken(addr, WordToken_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = WordToken.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("dev.amb.uima.typeSystem.language.WordToken");
 
  /** @generated */
  final Feature casFeat_startIndex;
  /** @generated */
  final int     casFeatCode_startIndex;
  /** @generated */ 
  public long getStartIndex(int addr) {
        if (featOkTst && casFeat_startIndex == null)
      jcas.throwFeatMissing("startIndex", "dev.amb.uima.typeSystem.language.WordToken");
    return ll_cas.ll_getLongValue(addr, casFeatCode_startIndex);
  }
  /** @generated */    
  public void setStartIndex(int addr, long v) {
        if (featOkTst && casFeat_startIndex == null)
      jcas.throwFeatMissing("startIndex", "dev.amb.uima.typeSystem.language.WordToken");
    ll_cas.ll_setLongValue(addr, casFeatCode_startIndex, v);}
    
  
 
  /** @generated */
  final Feature casFeat_endIndex;
  /** @generated */
  final int     casFeatCode_endIndex;
  /** @generated */ 
  public long getEndIndex(int addr) {
        if (featOkTst && casFeat_endIndex == null)
      jcas.throwFeatMissing("endIndex", "dev.amb.uima.typeSystem.language.WordToken");
    return ll_cas.ll_getLongValue(addr, casFeatCode_endIndex);
  }
  /** @generated */    
  public void setEndIndex(int addr, long v) {
        if (featOkTst && casFeat_endIndex == null)
      jcas.throwFeatMissing("endIndex", "dev.amb.uima.typeSystem.language.WordToken");
    ll_cas.ll_setLongValue(addr, casFeatCode_endIndex, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sourceStartIndex;
  /** @generated */
  final int     casFeatCode_sourceStartIndex;
  /** @generated */ 
  public long getSourceStartIndex(int addr) {
        if (featOkTst && casFeat_sourceStartIndex == null)
      jcas.throwFeatMissing("sourceStartIndex", "dev.amb.uima.typeSystem.language.WordToken");
    return ll_cas.ll_getLongValue(addr, casFeatCode_sourceStartIndex);
  }
  /** @generated */    
  public void setSourceStartIndex(int addr, long v) {
        if (featOkTst && casFeat_sourceStartIndex == null)
      jcas.throwFeatMissing("sourceStartIndex", "dev.amb.uima.typeSystem.language.WordToken");
    ll_cas.ll_setLongValue(addr, casFeatCode_sourceStartIndex, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sourceEndIndex;
  /** @generated */
  final int     casFeatCode_sourceEndIndex;
  /** @generated */ 
  public long getSourceEndIndex(int addr) {
        if (featOkTst && casFeat_sourceEndIndex == null)
      jcas.throwFeatMissing("sourceEndIndex", "dev.amb.uima.typeSystem.language.WordToken");
    return ll_cas.ll_getLongValue(addr, casFeatCode_sourceEndIndex);
  }
  /** @generated */    
  public void setSourceEndIndex(int addr, long v) {
        if (featOkTst && casFeat_sourceEndIndex == null)
      jcas.throwFeatMissing("sourceEndIndex", "dev.amb.uima.typeSystem.language.WordToken");
    ll_cas.ll_setLongValue(addr, casFeatCode_sourceEndIndex, v);}
    
  
 
  /** @generated */
  final Feature casFeat_partOfSpeech;
  /** @generated */
  final int     casFeatCode_partOfSpeech;
  /** @generated */ 
  public String getPartOfSpeech(int addr) {
        if (featOkTst && casFeat_partOfSpeech == null)
      jcas.throwFeatMissing("partOfSpeech", "dev.amb.uima.typeSystem.language.WordToken");
    return ll_cas.ll_getStringValue(addr, casFeatCode_partOfSpeech);
  }
  /** @generated */    
  public void setPartOfSpeech(int addr, String v) {
        if (featOkTst && casFeat_partOfSpeech == null)
      jcas.throwFeatMissing("partOfSpeech", "dev.amb.uima.typeSystem.language.WordToken");
    ll_cas.ll_setStringValue(addr, casFeatCode_partOfSpeech, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sentenceOrder;
  /** @generated */
  final int     casFeatCode_sentenceOrder;
  /** @generated */ 
  public int getSentenceOrder(int addr) {
        if (featOkTst && casFeat_sentenceOrder == null)
      jcas.throwFeatMissing("sentenceOrder", "dev.amb.uima.typeSystem.language.WordToken");
    return ll_cas.ll_getIntValue(addr, casFeatCode_sentenceOrder);
  }
  /** @generated */    
  public void setSentenceOrder(int addr, int v) {
        if (featOkTst && casFeat_sentenceOrder == null)
      jcas.throwFeatMissing("sentenceOrder", "dev.amb.uima.typeSystem.language.WordToken");
    ll_cas.ll_setIntValue(addr, casFeatCode_sentenceOrder, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public WordToken_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_startIndex = jcas.getRequiredFeatureDE(casType, "startIndex", "uima.cas.Long", featOkTst);
    casFeatCode_startIndex  = (null == casFeat_startIndex) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_startIndex).getCode();

 
    casFeat_endIndex = jcas.getRequiredFeatureDE(casType, "endIndex", "uima.cas.Long", featOkTst);
    casFeatCode_endIndex  = (null == casFeat_endIndex) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_endIndex).getCode();

 
    casFeat_sourceStartIndex = jcas.getRequiredFeatureDE(casType, "sourceStartIndex", "uima.cas.Long", featOkTst);
    casFeatCode_sourceStartIndex  = (null == casFeat_sourceStartIndex) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sourceStartIndex).getCode();

 
    casFeat_sourceEndIndex = jcas.getRequiredFeatureDE(casType, "sourceEndIndex", "uima.cas.Long", featOkTst);
    casFeatCode_sourceEndIndex  = (null == casFeat_sourceEndIndex) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sourceEndIndex).getCode();

 
    casFeat_partOfSpeech = jcas.getRequiredFeatureDE(casType, "partOfSpeech", "uima.cas.String", featOkTst);
    casFeatCode_partOfSpeech  = (null == casFeat_partOfSpeech) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_partOfSpeech).getCode();

 
    casFeat_sentenceOrder = jcas.getRequiredFeatureDE(casType, "sentenceOrder", "uima.cas.Integer", featOkTst);
    casFeatCode_sentenceOrder  = (null == casFeat_sentenceOrder) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sentenceOrder).getCode();

  }
}



    
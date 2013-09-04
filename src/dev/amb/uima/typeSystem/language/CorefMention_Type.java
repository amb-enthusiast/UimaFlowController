
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
import dev.amb.uima.typeSystem.semantic.Entity_Type;

/** 
 * Updated by JCasGen Tue Sep 03 22:19:52 MDT 2013
 * @generated */
public class CorefMention_Type extends Entity_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (CorefMention_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = CorefMention_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new CorefMention(addr, CorefMention_Type.this);
  			   CorefMention_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new CorefMention(addr, CorefMention_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = CorefMention.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("dev.amb.uima.typeSystem.language.CorefMention");
 
  /** @generated */
  final Feature casFeat_mentionWords;
  /** @generated */
  final int     casFeatCode_mentionWords;
  /** @generated */ 
  public int getMentionWords(int addr) {
        if (featOkTst && casFeat_mentionWords == null)
      jcas.throwFeatMissing("mentionWords", "dev.amb.uima.typeSystem.language.CorefMention");
    return ll_cas.ll_getRefValue(addr, casFeatCode_mentionWords);
  }
  /** @generated */    
  public void setMentionWords(int addr, int v) {
        if (featOkTst && casFeat_mentionWords == null)
      jcas.throwFeatMissing("mentionWords", "dev.amb.uima.typeSystem.language.CorefMention");
    ll_cas.ll_setRefValue(addr, casFeatCode_mentionWords, v);}
    
   /** @generated */
  public int getMentionWords(int addr, int i) {
        if (featOkTst && casFeat_mentionWords == null)
      jcas.throwFeatMissing("mentionWords", "dev.amb.uima.typeSystem.language.CorefMention");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mentionWords), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_mentionWords), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mentionWords), i);
  }
   
  /** @generated */ 
  public void setMentionWords(int addr, int i, int v) {
        if (featOkTst && casFeat_mentionWords == null)
      jcas.throwFeatMissing("mentionWords", "dev.amb.uima.typeSystem.language.CorefMention");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mentionWords), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_mentionWords), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mentionWords), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_mentionLevel;
  /** @generated */
  final int     casFeatCode_mentionLevel;
  /** @generated */ 
  public String getMentionLevel(int addr) {
        if (featOkTst && casFeat_mentionLevel == null)
      jcas.throwFeatMissing("mentionLevel", "dev.amb.uima.typeSystem.language.CorefMention");
    return ll_cas.ll_getStringValue(addr, casFeatCode_mentionLevel);
  }
  /** @generated */    
  public void setMentionLevel(int addr, String v) {
        if (featOkTst && casFeat_mentionLevel == null)
      jcas.throwFeatMissing("mentionLevel", "dev.amb.uima.typeSystem.language.CorefMention");
    ll_cas.ll_setStringValue(addr, casFeatCode_mentionLevel, v);}
    
  
 
  /** @generated */
  final Feature casFeat_aceUid;
  /** @generated */
  final int     casFeatCode_aceUid;
  /** @generated */ 
  public String getAceUid(int addr) {
        if (featOkTst && casFeat_aceUid == null)
      jcas.throwFeatMissing("aceUid", "dev.amb.uima.typeSystem.language.CorefMention");
    return ll_cas.ll_getStringValue(addr, casFeatCode_aceUid);
  }
  /** @generated */    
  public void setAceUid(int addr, String v) {
        if (featOkTst && casFeat_aceUid == null)
      jcas.throwFeatMissing("aceUid", "dev.amb.uima.typeSystem.language.CorefMention");
    ll_cas.ll_setStringValue(addr, casFeatCode_aceUid, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public CorefMention_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_mentionWords = jcas.getRequiredFeatureDE(casType, "mentionWords", "uima.cas.FSArray", featOkTst);
    casFeatCode_mentionWords  = (null == casFeat_mentionWords) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_mentionWords).getCode();

 
    casFeat_mentionLevel = jcas.getRequiredFeatureDE(casType, "mentionLevel", "uima.cas.String", featOkTst);
    casFeatCode_mentionLevel  = (null == casFeat_mentionLevel) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_mentionLevel).getCode();

 
    casFeat_aceUid = jcas.getRequiredFeatureDE(casType, "aceUid", "uima.cas.String", featOkTst);
    casFeatCode_aceUid  = (null == casFeat_aceUid) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_aceUid).getCode();

  }
}



    

/* First created by JCasGen Tue Sep 03 22:19:52 MDT 2013 */
package dev.amb.uima.typeSystem.metaData;

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
public class DocInfo_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (DocInfo_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = DocInfo_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new DocInfo(addr, DocInfo_Type.this);
  			   DocInfo_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new DocInfo(addr, DocInfo_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = DocInfo.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("dev.amb.uima.typeSystem.metaData.DocInfo");
 
  /** @generated */
  final Feature casFeat_key;
  /** @generated */
  final int     casFeatCode_key;
  /** @generated */ 
  public String getKey(int addr) {
        if (featOkTst && casFeat_key == null)
      jcas.throwFeatMissing("key", "dev.amb.uima.typeSystem.metaData.DocInfo");
    return ll_cas.ll_getStringValue(addr, casFeatCode_key);
  }
  /** @generated */    
  public void setKey(int addr, String v) {
        if (featOkTst && casFeat_key == null)
      jcas.throwFeatMissing("key", "dev.amb.uima.typeSystem.metaData.DocInfo");
    ll_cas.ll_setStringValue(addr, casFeatCode_key, v);}
    
  
 
  /** @generated */
  final Feature casFeat_attrValue;
  /** @generated */
  final int     casFeatCode_attrValue;
  /** @generated */ 
  public String getAttrValue(int addr) {
        if (featOkTst && casFeat_attrValue == null)
      jcas.throwFeatMissing("attrValue", "dev.amb.uima.typeSystem.metaData.DocInfo");
    return ll_cas.ll_getStringValue(addr, casFeatCode_attrValue);
  }
  /** @generated */    
  public void setAttrValue(int addr, String v) {
        if (featOkTst && casFeat_attrValue == null)
      jcas.throwFeatMissing("attrValue", "dev.amb.uima.typeSystem.metaData.DocInfo");
    ll_cas.ll_setStringValue(addr, casFeatCode_attrValue, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public DocInfo_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_key = jcas.getRequiredFeatureDE(casType, "key", "uima.cas.String", featOkTst);
    casFeatCode_key  = (null == casFeat_key) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_key).getCode();

 
    casFeat_attrValue = jcas.getRequiredFeatureDE(casType, "attrValue", "uima.cas.String", featOkTst);
    casFeatCode_attrValue  = (null == casFeat_attrValue) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_attrValue).getCode();

  }
}



    
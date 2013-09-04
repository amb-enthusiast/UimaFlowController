
/* First created by JCasGen Tue Sep 03 22:19:52 MDT 2013 */
package dev.amb.uima.typeSystem;

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
public class AceDocument_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (AceDocument_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = AceDocument_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new AceDocument(addr, AceDocument_Type.this);
  			   AceDocument_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new AceDocument(addr, AceDocument_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AceDocument.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("dev.amb.uima.typeSystem.AceDocument");
 
  /** @generated */
  final Feature casFeat_AceUri;
  /** @generated */
  final int     casFeatCode_AceUri;
  /** @generated */ 
  public String getAceUri(int addr) {
        if (featOkTst && casFeat_AceUri == null)
      jcas.throwFeatMissing("AceUri", "dev.amb.uima.typeSystem.AceDocument");
    return ll_cas.ll_getStringValue(addr, casFeatCode_AceUri);
  }
  /** @generated */    
  public void setAceUri(int addr, String v) {
        if (featOkTst && casFeat_AceUri == null)
      jcas.throwFeatMissing("AceUri", "dev.amb.uima.typeSystem.AceDocument");
    ll_cas.ll_setStringValue(addr, casFeatCode_AceUri, v);}
    
  
 
  /** @generated */
  final Feature casFeat_AceSource;
  /** @generated */
  final int     casFeatCode_AceSource;
  /** @generated */ 
  public String getAceSource(int addr) {
        if (featOkTst && casFeat_AceSource == null)
      jcas.throwFeatMissing("AceSource", "dev.amb.uima.typeSystem.AceDocument");
    return ll_cas.ll_getStringValue(addr, casFeatCode_AceSource);
  }
  /** @generated */    
  public void setAceSource(int addr, String v) {
        if (featOkTst && casFeat_AceSource == null)
      jcas.throwFeatMissing("AceSource", "dev.amb.uima.typeSystem.AceDocument");
    ll_cas.ll_setStringValue(addr, casFeatCode_AceSource, v);}
    
  
 
  /** @generated */
  final Feature casFeat_AceType;
  /** @generated */
  final int     casFeatCode_AceType;
  /** @generated */ 
  public String getAceType(int addr) {
        if (featOkTst && casFeat_AceType == null)
      jcas.throwFeatMissing("AceType", "dev.amb.uima.typeSystem.AceDocument");
    return ll_cas.ll_getStringValue(addr, casFeatCode_AceType);
  }
  /** @generated */    
  public void setAceType(int addr, String v) {
        if (featOkTst && casFeat_AceType == null)
      jcas.throwFeatMissing("AceType", "dev.amb.uima.typeSystem.AceDocument");
    ll_cas.ll_setStringValue(addr, casFeatCode_AceType, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public AceDocument_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_AceUri = jcas.getRequiredFeatureDE(casType, "AceUri", "uima.cas.String", featOkTst);
    casFeatCode_AceUri  = (null == casFeat_AceUri) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_AceUri).getCode();

 
    casFeat_AceSource = jcas.getRequiredFeatureDE(casType, "AceSource", "uima.cas.String", featOkTst);
    casFeatCode_AceSource  = (null == casFeat_AceSource) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_AceSource).getCode();

 
    casFeat_AceType = jcas.getRequiredFeatureDE(casType, "AceType", "uima.cas.String", featOkTst);
    casFeatCode_AceType  = (null == casFeat_AceType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_AceType).getCode();

  }
}



    
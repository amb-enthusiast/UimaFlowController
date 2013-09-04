
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
public class Relationship_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Relationship_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Relationship_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Relationship(addr, Relationship_Type.this);
  			   Relationship_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Relationship(addr, Relationship_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Relationship.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("dev.amb.uima.typeSystem.semantic.Relationship");
 
  /** @generated */
  final Feature casFeat_startEntity;
  /** @generated */
  final int     casFeatCode_startEntity;
  /** @generated */ 
  public int getStartEntity(int addr) {
        if (featOkTst && casFeat_startEntity == null)
      jcas.throwFeatMissing("startEntity", "dev.amb.uima.typeSystem.semantic.Relationship");
    return ll_cas.ll_getRefValue(addr, casFeatCode_startEntity);
  }
  /** @generated */    
  public void setStartEntity(int addr, int v) {
        if (featOkTst && casFeat_startEntity == null)
      jcas.throwFeatMissing("startEntity", "dev.amb.uima.typeSystem.semantic.Relationship");
    ll_cas.ll_setRefValue(addr, casFeatCode_startEntity, v);}
    
  
 
  /** @generated */
  final Feature casFeat_endEntity;
  /** @generated */
  final int     casFeatCode_endEntity;
  /** @generated */ 
  public int getEndEntity(int addr) {
        if (featOkTst && casFeat_endEntity == null)
      jcas.throwFeatMissing("endEntity", "dev.amb.uima.typeSystem.semantic.Relationship");
    return ll_cas.ll_getRefValue(addr, casFeatCode_endEntity);
  }
  /** @generated */    
  public void setEndEntity(int addr, int v) {
        if (featOkTst && casFeat_endEntity == null)
      jcas.throwFeatMissing("endEntity", "dev.amb.uima.typeSystem.semantic.Relationship");
    ll_cas.ll_setRefValue(addr, casFeatCode_endEntity, v);}
    
  
 
  /** @generated */
  final Feature casFeat_relationType;
  /** @generated */
  final int     casFeatCode_relationType;
  /** @generated */ 
  public String getRelationType(int addr) {
        if (featOkTst && casFeat_relationType == null)
      jcas.throwFeatMissing("relationType", "dev.amb.uima.typeSystem.semantic.Relationship");
    return ll_cas.ll_getStringValue(addr, casFeatCode_relationType);
  }
  /** @generated */    
  public void setRelationType(int addr, String v) {
        if (featOkTst && casFeat_relationType == null)
      jcas.throwFeatMissing("relationType", "dev.amb.uima.typeSystem.semantic.Relationship");
    ll_cas.ll_setStringValue(addr, casFeatCode_relationType, v);}
    
  
 
  /** @generated */
  final Feature casFeat_relationSubType;
  /** @generated */
  final int     casFeatCode_relationSubType;
  /** @generated */ 
  public String getRelationSubType(int addr) {
        if (featOkTst && casFeat_relationSubType == null)
      jcas.throwFeatMissing("relationSubType", "dev.amb.uima.typeSystem.semantic.Relationship");
    return ll_cas.ll_getStringValue(addr, casFeatCode_relationSubType);
  }
  /** @generated */    
  public void setRelationSubType(int addr, String v) {
        if (featOkTst && casFeat_relationSubType == null)
      jcas.throwFeatMissing("relationSubType", "dev.amb.uima.typeSystem.semantic.Relationship");
    ll_cas.ll_setStringValue(addr, casFeatCode_relationSubType, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Relationship_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_startEntity = jcas.getRequiredFeatureDE(casType, "startEntity", "dev.amb.uima.typeSystem.semantic.Entity", featOkTst);
    casFeatCode_startEntity  = (null == casFeat_startEntity) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_startEntity).getCode();

 
    casFeat_endEntity = jcas.getRequiredFeatureDE(casType, "endEntity", "dev.amb.uima.typeSystem.semantic.Entity", featOkTst);
    casFeatCode_endEntity  = (null == casFeat_endEntity) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_endEntity).getCode();

 
    casFeat_relationType = jcas.getRequiredFeatureDE(casType, "relationType", "uima.cas.String", featOkTst);
    casFeatCode_relationType  = (null == casFeat_relationType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_relationType).getCode();

 
    casFeat_relationSubType = jcas.getRequiredFeatureDE(casType, "relationSubType", "uima.cas.String", featOkTst);
    casFeatCode_relationSubType  = (null == casFeat_relationSubType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_relationSubType).getCode();

  }
}



    
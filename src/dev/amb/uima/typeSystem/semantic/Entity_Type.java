
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
public class Entity_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Entity_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Entity_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Entity(addr, Entity_Type.this);
  			   Entity_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Entity(addr, Entity_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Entity.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("dev.amb.uima.typeSystem.semantic.Entity");
 
  /** @generated */
  final Feature casFeat_entityMentions;
  /** @generated */
  final int     casFeatCode_entityMentions;
  /** @generated */ 
  public int getEntityMentions(int addr) {
        if (featOkTst && casFeat_entityMentions == null)
      jcas.throwFeatMissing("entityMentions", "dev.amb.uima.typeSystem.semantic.Entity");
    return ll_cas.ll_getRefValue(addr, casFeatCode_entityMentions);
  }
  /** @generated */    
  public void setEntityMentions(int addr, int v) {
        if (featOkTst && casFeat_entityMentions == null)
      jcas.throwFeatMissing("entityMentions", "dev.amb.uima.typeSystem.semantic.Entity");
    ll_cas.ll_setRefValue(addr, casFeatCode_entityMentions, v);}
    
   /** @generated */
  public int getEntityMentions(int addr, int i) {
        if (featOkTst && casFeat_entityMentions == null)
      jcas.throwFeatMissing("entityMentions", "dev.amb.uima.typeSystem.semantic.Entity");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_entityMentions), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_entityMentions), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_entityMentions), i);
  }
   
  /** @generated */ 
  public void setEntityMentions(int addr, int i, int v) {
        if (featOkTst && casFeat_entityMentions == null)
      jcas.throwFeatMissing("entityMentions", "dev.amb.uima.typeSystem.semantic.Entity");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_entityMentions), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_entityMentions), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_entityMentions), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_entityWords;
  /** @generated */
  final int     casFeatCode_entityWords;
  /** @generated */ 
  public int getEntityWords(int addr) {
        if (featOkTst && casFeat_entityWords == null)
      jcas.throwFeatMissing("entityWords", "dev.amb.uima.typeSystem.semantic.Entity");
    return ll_cas.ll_getRefValue(addr, casFeatCode_entityWords);
  }
  /** @generated */    
  public void setEntityWords(int addr, int v) {
        if (featOkTst && casFeat_entityWords == null)
      jcas.throwFeatMissing("entityWords", "dev.amb.uima.typeSystem.semantic.Entity");
    ll_cas.ll_setRefValue(addr, casFeatCode_entityWords, v);}
    
   /** @generated */
  public int getEntityWords(int addr, int i) {
        if (featOkTst && casFeat_entityWords == null)
      jcas.throwFeatMissing("entityWords", "dev.amb.uima.typeSystem.semantic.Entity");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_entityWords), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_entityWords), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_entityWords), i);
  }
   
  /** @generated */ 
  public void setEntityWords(int addr, int i, int v) {
        if (featOkTst && casFeat_entityWords == null)
      jcas.throwFeatMissing("entityWords", "dev.amb.uima.typeSystem.semantic.Entity");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_entityWords), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_entityWords), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_entityWords), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_entityType;
  /** @generated */
  final int     casFeatCode_entityType;
  /** @generated */ 
  public String getEntityType(int addr) {
        if (featOkTst && casFeat_entityType == null)
      jcas.throwFeatMissing("entityType", "dev.amb.uima.typeSystem.semantic.Entity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_entityType);
  }
  /** @generated */    
  public void setEntityType(int addr, String v) {
        if (featOkTst && casFeat_entityType == null)
      jcas.throwFeatMissing("entityType", "dev.amb.uima.typeSystem.semantic.Entity");
    ll_cas.ll_setStringValue(addr, casFeatCode_entityType, v);}
    
  
 
  /** @generated */
  final Feature casFeat_aceUid;
  /** @generated */
  final int     casFeatCode_aceUid;
  /** @generated */ 
  public String getAceUid(int addr) {
        if (featOkTst && casFeat_aceUid == null)
      jcas.throwFeatMissing("aceUid", "dev.amb.uima.typeSystem.semantic.Entity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_aceUid);
  }
  /** @generated */    
  public void setAceUid(int addr, String v) {
        if (featOkTst && casFeat_aceUid == null)
      jcas.throwFeatMissing("aceUid", "dev.amb.uima.typeSystem.semantic.Entity");
    ll_cas.ll_setStringValue(addr, casFeatCode_aceUid, v);}
    
  
 
  /** @generated */
  final Feature casFeat_aceMentionType;
  /** @generated */
  final int     casFeatCode_aceMentionType;
  /** @generated */ 
  public String getAceMentionType(int addr) {
        if (featOkTst && casFeat_aceMentionType == null)
      jcas.throwFeatMissing("aceMentionType", "dev.amb.uima.typeSystem.semantic.Entity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_aceMentionType);
  }
  /** @generated */    
  public void setAceMentionType(int addr, String v) {
        if (featOkTst && casFeat_aceMentionType == null)
      jcas.throwFeatMissing("aceMentionType", "dev.amb.uima.typeSystem.semantic.Entity");
    ll_cas.ll_setStringValue(addr, casFeatCode_aceMentionType, v);}
    
  
 
  /** @generated */
  final Feature casFeat_aceExplicitEntity;
  /** @generated */
  final int     casFeatCode_aceExplicitEntity;
  /** @generated */ 
  public String getAceExplicitEntity(int addr) {
        if (featOkTst && casFeat_aceExplicitEntity == null)
      jcas.throwFeatMissing("aceExplicitEntity", "dev.amb.uima.typeSystem.semantic.Entity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_aceExplicitEntity);
  }
  /** @generated */    
  public void setAceExplicitEntity(int addr, String v) {
        if (featOkTst && casFeat_aceExplicitEntity == null)
      jcas.throwFeatMissing("aceExplicitEntity", "dev.amb.uima.typeSystem.semantic.Entity");
    ll_cas.ll_setStringValue(addr, casFeatCode_aceExplicitEntity, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Entity_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_entityMentions = jcas.getRequiredFeatureDE(casType, "entityMentions", "uima.cas.FSArray", featOkTst);
    casFeatCode_entityMentions  = (null == casFeat_entityMentions) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_entityMentions).getCode();

 
    casFeat_entityWords = jcas.getRequiredFeatureDE(casType, "entityWords", "uima.cas.FSArray", featOkTst);
    casFeatCode_entityWords  = (null == casFeat_entityWords) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_entityWords).getCode();

 
    casFeat_entityType = jcas.getRequiredFeatureDE(casType, "entityType", "uima.cas.String", featOkTst);
    casFeatCode_entityType  = (null == casFeat_entityType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_entityType).getCode();

 
    casFeat_aceUid = jcas.getRequiredFeatureDE(casType, "aceUid", "uima.cas.String", featOkTst);
    casFeatCode_aceUid  = (null == casFeat_aceUid) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_aceUid).getCode();

 
    casFeat_aceMentionType = jcas.getRequiredFeatureDE(casType, "aceMentionType", "uima.cas.String", featOkTst);
    casFeatCode_aceMentionType  = (null == casFeat_aceMentionType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_aceMentionType).getCode();

 
    casFeat_aceExplicitEntity = jcas.getRequiredFeatureDE(casType, "aceExplicitEntity", "uima.cas.String", featOkTst);
    casFeatCode_aceExplicitEntity  = (null == casFeat_aceExplicitEntity) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_aceExplicitEntity).getCode();

  }
}



    
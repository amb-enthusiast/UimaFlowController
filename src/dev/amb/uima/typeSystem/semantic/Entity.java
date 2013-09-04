

/* First created by JCasGen Tue Sep 03 22:19:52 MDT 2013 */
package dev.amb.uima.typeSystem.semantic;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import dev.amb.uima.typeSystem.language.WordToken;
import org.apache.uima.jcas.tcas.Annotation;
import dev.amb.uima.typeSystem.language.CorefMention;


/** 
 * Updated by JCasGen Tue Sep 03 22:19:52 MDT 2013
 * XML source: /Users/amb/dev/workspaces/eclipse/uimaWorkspace/FlowController/desc/devTypeSystemDescriptor.xml
 * @generated */
public class Entity extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Entity.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Entity() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Entity(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Entity(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Entity(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: entityMentions

  /** getter for entityMentions - gets 
   * @generated */
  public FSArray getEntityMentions() {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_entityMentions == null)
      jcasType.jcas.throwFeatMissing("entityMentions", "dev.amb.uima.typeSystem.semantic.Entity");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Entity_Type)jcasType).casFeatCode_entityMentions)));}
    
  /** setter for entityMentions - sets  
   * @generated */
  public void setEntityMentions(FSArray v) {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_entityMentions == null)
      jcasType.jcas.throwFeatMissing("entityMentions", "dev.amb.uima.typeSystem.semantic.Entity");
    jcasType.ll_cas.ll_setRefValue(addr, ((Entity_Type)jcasType).casFeatCode_entityMentions, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for entityMentions - gets an indexed value - 
   * @generated */
  public CorefMention getEntityMentions(int i) {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_entityMentions == null)
      jcasType.jcas.throwFeatMissing("entityMentions", "dev.amb.uima.typeSystem.semantic.Entity");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Entity_Type)jcasType).casFeatCode_entityMentions), i);
    return (CorefMention)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Entity_Type)jcasType).casFeatCode_entityMentions), i)));}

  /** indexed setter for entityMentions - sets an indexed value - 
   * @generated */
  public void setEntityMentions(int i, CorefMention v) { 
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_entityMentions == null)
      jcasType.jcas.throwFeatMissing("entityMentions", "dev.amb.uima.typeSystem.semantic.Entity");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Entity_Type)jcasType).casFeatCode_entityMentions), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Entity_Type)jcasType).casFeatCode_entityMentions), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: entityWords

  /** getter for entityWords - gets 
   * @generated */
  public FSArray getEntityWords() {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_entityWords == null)
      jcasType.jcas.throwFeatMissing("entityWords", "dev.amb.uima.typeSystem.semantic.Entity");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Entity_Type)jcasType).casFeatCode_entityWords)));}
    
  /** setter for entityWords - sets  
   * @generated */
  public void setEntityWords(FSArray v) {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_entityWords == null)
      jcasType.jcas.throwFeatMissing("entityWords", "dev.amb.uima.typeSystem.semantic.Entity");
    jcasType.ll_cas.ll_setRefValue(addr, ((Entity_Type)jcasType).casFeatCode_entityWords, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for entityWords - gets an indexed value - 
   * @generated */
  public WordToken getEntityWords(int i) {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_entityWords == null)
      jcasType.jcas.throwFeatMissing("entityWords", "dev.amb.uima.typeSystem.semantic.Entity");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Entity_Type)jcasType).casFeatCode_entityWords), i);
    return (WordToken)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Entity_Type)jcasType).casFeatCode_entityWords), i)));}

  /** indexed setter for entityWords - sets an indexed value - 
   * @generated */
  public void setEntityWords(int i, WordToken v) { 
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_entityWords == null)
      jcasType.jcas.throwFeatMissing("entityWords", "dev.amb.uima.typeSystem.semantic.Entity");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Entity_Type)jcasType).casFeatCode_entityWords), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Entity_Type)jcasType).casFeatCode_entityWords), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: entityType

  /** getter for entityType - gets 
   * @generated */
  public String getEntityType() {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_entityType == null)
      jcasType.jcas.throwFeatMissing("entityType", "dev.amb.uima.typeSystem.semantic.Entity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Entity_Type)jcasType).casFeatCode_entityType);}
    
  /** setter for entityType - sets  
   * @generated */
  public void setEntityType(String v) {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_entityType == null)
      jcasType.jcas.throwFeatMissing("entityType", "dev.amb.uima.typeSystem.semantic.Entity");
    jcasType.ll_cas.ll_setStringValue(addr, ((Entity_Type)jcasType).casFeatCode_entityType, v);}    
   
    
  //*--------------*
  //* Feature: aceUid

  /** getter for aceUid - gets 
   * @generated */
  public String getAceUid() {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_aceUid == null)
      jcasType.jcas.throwFeatMissing("aceUid", "dev.amb.uima.typeSystem.semantic.Entity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Entity_Type)jcasType).casFeatCode_aceUid);}
    
  /** setter for aceUid - sets  
   * @generated */
  public void setAceUid(String v) {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_aceUid == null)
      jcasType.jcas.throwFeatMissing("aceUid", "dev.amb.uima.typeSystem.semantic.Entity");
    jcasType.ll_cas.ll_setStringValue(addr, ((Entity_Type)jcasType).casFeatCode_aceUid, v);}    
   
    
  //*--------------*
  //* Feature: aceMentionType

  /** getter for aceMentionType - gets 
   * @generated */
  public String getAceMentionType() {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_aceMentionType == null)
      jcasType.jcas.throwFeatMissing("aceMentionType", "dev.amb.uima.typeSystem.semantic.Entity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Entity_Type)jcasType).casFeatCode_aceMentionType);}
    
  /** setter for aceMentionType - sets  
   * @generated */
  public void setAceMentionType(String v) {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_aceMentionType == null)
      jcasType.jcas.throwFeatMissing("aceMentionType", "dev.amb.uima.typeSystem.semantic.Entity");
    jcasType.ll_cas.ll_setStringValue(addr, ((Entity_Type)jcasType).casFeatCode_aceMentionType, v);}    
   
    
  //*--------------*
  //* Feature: aceExplicitEntity

  /** getter for aceExplicitEntity - gets 
   * @generated */
  public String getAceExplicitEntity() {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_aceExplicitEntity == null)
      jcasType.jcas.throwFeatMissing("aceExplicitEntity", "dev.amb.uima.typeSystem.semantic.Entity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Entity_Type)jcasType).casFeatCode_aceExplicitEntity);}
    
  /** setter for aceExplicitEntity - sets  
   * @generated */
  public void setAceExplicitEntity(String v) {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_aceExplicitEntity == null)
      jcasType.jcas.throwFeatMissing("aceExplicitEntity", "dev.amb.uima.typeSystem.semantic.Entity");
    jcasType.ll_cas.ll_setStringValue(addr, ((Entity_Type)jcasType).casFeatCode_aceExplicitEntity, v);}    
  }

    


/* First created by JCasGen Tue Sep 03 22:19:52 MDT 2013 */
package dev.amb.uima.typeSystem.semantic;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 03 22:19:52 MDT 2013
 * XML source: /Users/amb/dev/workspaces/eclipse/uimaWorkspace/FlowController/desc/devTypeSystemDescriptor.xml
 * @generated */
public class Relationship extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Relationship.class);
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
  protected Relationship() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Relationship(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Relationship(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Relationship(JCas jcas, int begin, int end) {
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
  //* Feature: startEntity

  /** getter for startEntity - gets 
   * @generated */
  public Entity getStartEntity() {
    if (Relationship_Type.featOkTst && ((Relationship_Type)jcasType).casFeat_startEntity == null)
      jcasType.jcas.throwFeatMissing("startEntity", "dev.amb.uima.typeSystem.semantic.Relationship");
    return (Entity)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Relationship_Type)jcasType).casFeatCode_startEntity)));}
    
  /** setter for startEntity - sets  
   * @generated */
  public void setStartEntity(Entity v) {
    if (Relationship_Type.featOkTst && ((Relationship_Type)jcasType).casFeat_startEntity == null)
      jcasType.jcas.throwFeatMissing("startEntity", "dev.amb.uima.typeSystem.semantic.Relationship");
    jcasType.ll_cas.ll_setRefValue(addr, ((Relationship_Type)jcasType).casFeatCode_startEntity, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: endEntity

  /** getter for endEntity - gets 
   * @generated */
  public Entity getEndEntity() {
    if (Relationship_Type.featOkTst && ((Relationship_Type)jcasType).casFeat_endEntity == null)
      jcasType.jcas.throwFeatMissing("endEntity", "dev.amb.uima.typeSystem.semantic.Relationship");
    return (Entity)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Relationship_Type)jcasType).casFeatCode_endEntity)));}
    
  /** setter for endEntity - sets  
   * @generated */
  public void setEndEntity(Entity v) {
    if (Relationship_Type.featOkTst && ((Relationship_Type)jcasType).casFeat_endEntity == null)
      jcasType.jcas.throwFeatMissing("endEntity", "dev.amb.uima.typeSystem.semantic.Relationship");
    jcasType.ll_cas.ll_setRefValue(addr, ((Relationship_Type)jcasType).casFeatCode_endEntity, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: relationType

  /** getter for relationType - gets 
   * @generated */
  public String getRelationType() {
    if (Relationship_Type.featOkTst && ((Relationship_Type)jcasType).casFeat_relationType == null)
      jcasType.jcas.throwFeatMissing("relationType", "dev.amb.uima.typeSystem.semantic.Relationship");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Relationship_Type)jcasType).casFeatCode_relationType);}
    
  /** setter for relationType - sets  
   * @generated */
  public void setRelationType(String v) {
    if (Relationship_Type.featOkTst && ((Relationship_Type)jcasType).casFeat_relationType == null)
      jcasType.jcas.throwFeatMissing("relationType", "dev.amb.uima.typeSystem.semantic.Relationship");
    jcasType.ll_cas.ll_setStringValue(addr, ((Relationship_Type)jcasType).casFeatCode_relationType, v);}    
   
    
  //*--------------*
  //* Feature: relationSubType

  /** getter for relationSubType - gets 
   * @generated */
  public String getRelationSubType() {
    if (Relationship_Type.featOkTst && ((Relationship_Type)jcasType).casFeat_relationSubType == null)
      jcasType.jcas.throwFeatMissing("relationSubType", "dev.amb.uima.typeSystem.semantic.Relationship");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Relationship_Type)jcasType).casFeatCode_relationSubType);}
    
  /** setter for relationSubType - sets  
   * @generated */
  public void setRelationSubType(String v) {
    if (Relationship_Type.featOkTst && ((Relationship_Type)jcasType).casFeat_relationSubType == null)
      jcasType.jcas.throwFeatMissing("relationSubType", "dev.amb.uima.typeSystem.semantic.Relationship");
    jcasType.ll_cas.ll_setStringValue(addr, ((Relationship_Type)jcasType).casFeatCode_relationSubType, v);}    
  }

    
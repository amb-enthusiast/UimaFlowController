

/* First created by JCasGen Tue Sep 03 22:19:52 MDT 2013 */
package dev.amb.uima.typeSystem.semantic;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import dev.amb.uima.typeSystem.language.Sentence;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 03 22:19:52 MDT 2013
 * XML source: /Users/amb/dev/workspaces/eclipse/uimaWorkspace/FlowController/desc/devTypeSystemDescriptor.xml
 * @generated */
public class EntitySentencePair extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(EntitySentencePair.class);
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
  protected EntitySentencePair() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public EntitySentencePair(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public EntitySentencePair(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public EntitySentencePair(JCas jcas, int begin, int end) {
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
  //* Feature: entity1

  /** getter for entity1 - gets 
   * @generated */
  public Entity getEntity1() {
    if (EntitySentencePair_Type.featOkTst && ((EntitySentencePair_Type)jcasType).casFeat_entity1 == null)
      jcasType.jcas.throwFeatMissing("entity1", "dev.amb.uima.typeSystem.semantic.EntitySentencePair");
    return (Entity)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EntitySentencePair_Type)jcasType).casFeatCode_entity1)));}
    
  /** setter for entity1 - sets  
   * @generated */
  public void setEntity1(Entity v) {
    if (EntitySentencePair_Type.featOkTst && ((EntitySentencePair_Type)jcasType).casFeat_entity1 == null)
      jcasType.jcas.throwFeatMissing("entity1", "dev.amb.uima.typeSystem.semantic.EntitySentencePair");
    jcasType.ll_cas.ll_setRefValue(addr, ((EntitySentencePair_Type)jcasType).casFeatCode_entity1, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: entity2

  /** getter for entity2 - gets 
   * @generated */
  public Entity getEntity2() {
    if (EntitySentencePair_Type.featOkTst && ((EntitySentencePair_Type)jcasType).casFeat_entity2 == null)
      jcasType.jcas.throwFeatMissing("entity2", "dev.amb.uima.typeSystem.semantic.EntitySentencePair");
    return (Entity)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EntitySentencePair_Type)jcasType).casFeatCode_entity2)));}
    
  /** setter for entity2 - sets  
   * @generated */
  public void setEntity2(Entity v) {
    if (EntitySentencePair_Type.featOkTst && ((EntitySentencePair_Type)jcasType).casFeat_entity2 == null)
      jcasType.jcas.throwFeatMissing("entity2", "dev.amb.uima.typeSystem.semantic.EntitySentencePair");
    jcasType.ll_cas.ll_setRefValue(addr, ((EntitySentencePair_Type)jcasType).casFeatCode_entity2, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: sentence

  /** getter for sentence - gets 
   * @generated */
  public Sentence getSentence() {
    if (EntitySentencePair_Type.featOkTst && ((EntitySentencePair_Type)jcasType).casFeat_sentence == null)
      jcasType.jcas.throwFeatMissing("sentence", "dev.amb.uima.typeSystem.semantic.EntitySentencePair");
    return (Sentence)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EntitySentencePair_Type)jcasType).casFeatCode_sentence)));}
    
  /** setter for sentence - sets  
   * @generated */
  public void setSentence(Sentence v) {
    if (EntitySentencePair_Type.featOkTst && ((EntitySentencePair_Type)jcasType).casFeat_sentence == null)
      jcasType.jcas.throwFeatMissing("sentence", "dev.amb.uima.typeSystem.semantic.EntitySentencePair");
    jcasType.ll_cas.ll_setRefValue(addr, ((EntitySentencePair_Type)jcasType).casFeatCode_sentence, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    
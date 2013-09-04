

/* First created by JCasGen Tue Sep 03 22:19:52 MDT 2013 */
package dev.amb.uima.typeSystem.language;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import dev.amb.uima.typeSystem.semantic.Entity;


/** 
 * Updated by JCasGen Tue Sep 03 22:19:52 MDT 2013
 * XML source: /Users/amb/dev/workspaces/eclipse/uimaWorkspace/FlowController/desc/devTypeSystemDescriptor.xml
 * @generated */
public class CorefMention extends Entity {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(CorefMention.class);
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
  protected CorefMention() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public CorefMention(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public CorefMention(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public CorefMention(JCas jcas, int begin, int end) {
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
  //* Feature: mentionWords

  /** getter for mentionWords - gets 
   * @generated */
  public FSArray getMentionWords() {
    if (CorefMention_Type.featOkTst && ((CorefMention_Type)jcasType).casFeat_mentionWords == null)
      jcasType.jcas.throwFeatMissing("mentionWords", "dev.amb.uima.typeSystem.language.CorefMention");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((CorefMention_Type)jcasType).casFeatCode_mentionWords)));}
    
  /** setter for mentionWords - sets  
   * @generated */
  public void setMentionWords(FSArray v) {
    if (CorefMention_Type.featOkTst && ((CorefMention_Type)jcasType).casFeat_mentionWords == null)
      jcasType.jcas.throwFeatMissing("mentionWords", "dev.amb.uima.typeSystem.language.CorefMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((CorefMention_Type)jcasType).casFeatCode_mentionWords, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for mentionWords - gets an indexed value - 
   * @generated */
  public WordToken getMentionWords(int i) {
    if (CorefMention_Type.featOkTst && ((CorefMention_Type)jcasType).casFeat_mentionWords == null)
      jcasType.jcas.throwFeatMissing("mentionWords", "dev.amb.uima.typeSystem.language.CorefMention");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((CorefMention_Type)jcasType).casFeatCode_mentionWords), i);
    return (WordToken)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((CorefMention_Type)jcasType).casFeatCode_mentionWords), i)));}

  /** indexed setter for mentionWords - sets an indexed value - 
   * @generated */
  public void setMentionWords(int i, WordToken v) { 
    if (CorefMention_Type.featOkTst && ((CorefMention_Type)jcasType).casFeat_mentionWords == null)
      jcasType.jcas.throwFeatMissing("mentionWords", "dev.amb.uima.typeSystem.language.CorefMention");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((CorefMention_Type)jcasType).casFeatCode_mentionWords), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((CorefMention_Type)jcasType).casFeatCode_mentionWords), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: mentionLevel

  /** getter for mentionLevel - gets 
   * @generated */
  public String getMentionLevel() {
    if (CorefMention_Type.featOkTst && ((CorefMention_Type)jcasType).casFeat_mentionLevel == null)
      jcasType.jcas.throwFeatMissing("mentionLevel", "dev.amb.uima.typeSystem.language.CorefMention");
    return jcasType.ll_cas.ll_getStringValue(addr, ((CorefMention_Type)jcasType).casFeatCode_mentionLevel);}
    
  /** setter for mentionLevel - sets  
   * @generated */
  public void setMentionLevel(String v) {
    if (CorefMention_Type.featOkTst && ((CorefMention_Type)jcasType).casFeat_mentionLevel == null)
      jcasType.jcas.throwFeatMissing("mentionLevel", "dev.amb.uima.typeSystem.language.CorefMention");
    jcasType.ll_cas.ll_setStringValue(addr, ((CorefMention_Type)jcasType).casFeatCode_mentionLevel, v);}    
   
    
  //*--------------*
  //* Feature: aceUid

  /** getter for aceUid - gets 
   * @generated */
  public String getAceUid() {
    if (CorefMention_Type.featOkTst && ((CorefMention_Type)jcasType).casFeat_aceUid == null)
      jcasType.jcas.throwFeatMissing("aceUid", "dev.amb.uima.typeSystem.language.CorefMention");
    return jcasType.ll_cas.ll_getStringValue(addr, ((CorefMention_Type)jcasType).casFeatCode_aceUid);}
    
  /** setter for aceUid - sets  
   * @generated */
  public void setAceUid(String v) {
    if (CorefMention_Type.featOkTst && ((CorefMention_Type)jcasType).casFeat_aceUid == null)
      jcasType.jcas.throwFeatMissing("aceUid", "dev.amb.uima.typeSystem.language.CorefMention");
    jcasType.ll_cas.ll_setStringValue(addr, ((CorefMention_Type)jcasType).casFeatCode_aceUid, v);}    
  }

    
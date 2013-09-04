

/* First created by JCasGen Tue Sep 03 22:19:52 MDT 2013 */
package dev.amb.uima.typeSystem.language;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;
import dev.amb.uima.typeSystem.semantic.EntitySentencePair;


/** 
 * Updated by JCasGen Tue Sep 03 22:19:52 MDT 2013
 * XML source: /Users/amb/dev/workspaces/eclipse/uimaWorkspace/FlowController/desc/devTypeSystemDescriptor.xml
 * @generated */
public class Sentence extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Sentence.class);
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
  protected Sentence() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Sentence(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Sentence(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Sentence(JCas jcas, int begin, int end) {
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
  //* Feature: documentOrder

  /** getter for documentOrder - gets 
   * @generated */
  public int getDocumentOrder() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_documentOrder == null)
      jcasType.jcas.throwFeatMissing("documentOrder", "dev.amb.uima.typeSystem.language.Sentence");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Sentence_Type)jcasType).casFeatCode_documentOrder);}
    
  /** setter for documentOrder - sets  
   * @generated */
  public void setDocumentOrder(int v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_documentOrder == null)
      jcasType.jcas.throwFeatMissing("documentOrder", "dev.amb.uima.typeSystem.language.Sentence");
    jcasType.ll_cas.ll_setIntValue(addr, ((Sentence_Type)jcasType).casFeatCode_documentOrder, v);}    
   
    
  //*--------------*
  //* Feature: wordTokens

  /** getter for wordTokens - gets 
   * @generated */
  public FSArray getWordTokens() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_wordTokens == null)
      jcasType.jcas.throwFeatMissing("wordTokens", "dev.amb.uima.typeSystem.language.Sentence");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_wordTokens)));}
    
  /** setter for wordTokens - sets  
   * @generated */
  public void setWordTokens(FSArray v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_wordTokens == null)
      jcasType.jcas.throwFeatMissing("wordTokens", "dev.amb.uima.typeSystem.language.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_wordTokens, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for wordTokens - gets an indexed value - 
   * @generated */
  public WordToken getWordTokens(int i) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_wordTokens == null)
      jcasType.jcas.throwFeatMissing("wordTokens", "dev.amb.uima.typeSystem.language.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_wordTokens), i);
    return (WordToken)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_wordTokens), i)));}

  /** indexed setter for wordTokens - sets an indexed value - 
   * @generated */
  public void setWordTokens(int i, WordToken v) { 
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_wordTokens == null)
      jcasType.jcas.throwFeatMissing("wordTokens", "dev.amb.uima.typeSystem.language.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_wordTokens), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_wordTokens), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: phraseChunks

  /** getter for phraseChunks - gets 
   * @generated */
  public FSArray getPhraseChunks() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_phraseChunks == null)
      jcasType.jcas.throwFeatMissing("phraseChunks", "dev.amb.uima.typeSystem.language.Sentence");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_phraseChunks)));}
    
  /** setter for phraseChunks - sets  
   * @generated */
  public void setPhraseChunks(FSArray v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_phraseChunks == null)
      jcasType.jcas.throwFeatMissing("phraseChunks", "dev.amb.uima.typeSystem.language.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_phraseChunks, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for phraseChunks - gets an indexed value - 
   * @generated */
  public PhraseChunk getPhraseChunks(int i) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_phraseChunks == null)
      jcasType.jcas.throwFeatMissing("phraseChunks", "dev.amb.uima.typeSystem.language.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_phraseChunks), i);
    return (PhraseChunk)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_phraseChunks), i)));}

  /** indexed setter for phraseChunks - sets an indexed value - 
   * @generated */
  public void setPhraseChunks(int i, PhraseChunk v) { 
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_phraseChunks == null)
      jcasType.jcas.throwFeatMissing("phraseChunks", "dev.amb.uima.typeSystem.language.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_phraseChunks), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_phraseChunks), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: entityPairs

  /** getter for entityPairs - gets 
   * @generated */
  public FSArray getEntityPairs() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_entityPairs == null)
      jcasType.jcas.throwFeatMissing("entityPairs", "dev.amb.uima.typeSystem.language.Sentence");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_entityPairs)));}
    
  /** setter for entityPairs - sets  
   * @generated */
  public void setEntityPairs(FSArray v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_entityPairs == null)
      jcasType.jcas.throwFeatMissing("entityPairs", "dev.amb.uima.typeSystem.language.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_entityPairs, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for entityPairs - gets an indexed value - 
   * @generated */
  public EntitySentencePair getEntityPairs(int i) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_entityPairs == null)
      jcasType.jcas.throwFeatMissing("entityPairs", "dev.amb.uima.typeSystem.language.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_entityPairs), i);
    return (EntitySentencePair)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_entityPairs), i)));}

  /** indexed setter for entityPairs - sets an indexed value - 
   * @generated */
  public void setEntityPairs(int i, EntitySentencePair v) { 
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_entityPairs == null)
      jcasType.jcas.throwFeatMissing("entityPairs", "dev.amb.uima.typeSystem.language.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_entityPairs), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_entityPairs), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    
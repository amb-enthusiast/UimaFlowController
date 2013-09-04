

/* First created by JCasGen Tue Sep 03 22:19:52 MDT 2013 */
package dev.amb.uima.typeSystem.language;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 03 22:19:52 MDT 2013
 * XML source: /Users/amb/dev/workspaces/eclipse/uimaWorkspace/FlowController/desc/devTypeSystemDescriptor.xml
 * @generated */
public class WordToken extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(WordToken.class);
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
  protected WordToken() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public WordToken(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public WordToken(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public WordToken(JCas jcas, int begin, int end) {
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
  //* Feature: startIndex

  /** getter for startIndex - gets Start index in input text
   * @generated */
  public long getStartIndex() {
    if (WordToken_Type.featOkTst && ((WordToken_Type)jcasType).casFeat_startIndex == null)
      jcasType.jcas.throwFeatMissing("startIndex", "dev.amb.uima.typeSystem.language.WordToken");
    return jcasType.ll_cas.ll_getLongValue(addr, ((WordToken_Type)jcasType).casFeatCode_startIndex);}
    
  /** setter for startIndex - sets Start index in input text 
   * @generated */
  public void setStartIndex(long v) {
    if (WordToken_Type.featOkTst && ((WordToken_Type)jcasType).casFeat_startIndex == null)
      jcasType.jcas.throwFeatMissing("startIndex", "dev.amb.uima.typeSystem.language.WordToken");
    jcasType.ll_cas.ll_setLongValue(addr, ((WordToken_Type)jcasType).casFeatCode_startIndex, v);}    
   
    
  //*--------------*
  //* Feature: endIndex

  /** getter for endIndex - gets end index in input text
   * @generated */
  public long getEndIndex() {
    if (WordToken_Type.featOkTst && ((WordToken_Type)jcasType).casFeat_endIndex == null)
      jcasType.jcas.throwFeatMissing("endIndex", "dev.amb.uima.typeSystem.language.WordToken");
    return jcasType.ll_cas.ll_getLongValue(addr, ((WordToken_Type)jcasType).casFeatCode_endIndex);}
    
  /** setter for endIndex - sets end index in input text 
   * @generated */
  public void setEndIndex(long v) {
    if (WordToken_Type.featOkTst && ((WordToken_Type)jcasType).casFeat_endIndex == null)
      jcasType.jcas.throwFeatMissing("endIndex", "dev.amb.uima.typeSystem.language.WordToken");
    jcasType.ll_cas.ll_setLongValue(addr, ((WordToken_Type)jcasType).casFeatCode_endIndex, v);}    
   
    
  //*--------------*
  //* Feature: sourceStartIndex

  /** getter for sourceStartIndex - gets The absolute start index in the source document - used when processing multiple sentences to store index position of word token in source document
   * @generated */
  public long getSourceStartIndex() {
    if (WordToken_Type.featOkTst && ((WordToken_Type)jcasType).casFeat_sourceStartIndex == null)
      jcasType.jcas.throwFeatMissing("sourceStartIndex", "dev.amb.uima.typeSystem.language.WordToken");
    return jcasType.ll_cas.ll_getLongValue(addr, ((WordToken_Type)jcasType).casFeatCode_sourceStartIndex);}
    
  /** setter for sourceStartIndex - sets The absolute start index in the source document - used when processing multiple sentences to store index position of word token in source document 
   * @generated */
  public void setSourceStartIndex(long v) {
    if (WordToken_Type.featOkTst && ((WordToken_Type)jcasType).casFeat_sourceStartIndex == null)
      jcasType.jcas.throwFeatMissing("sourceStartIndex", "dev.amb.uima.typeSystem.language.WordToken");
    jcasType.ll_cas.ll_setLongValue(addr, ((WordToken_Type)jcasType).casFeatCode_sourceStartIndex, v);}    
   
    
  //*--------------*
  //* Feature: sourceEndIndex

  /** getter for sourceEndIndex - gets Absolute end index of token in source document - used when processing multiple sentences to store index position of word token in source document
   * @generated */
  public long getSourceEndIndex() {
    if (WordToken_Type.featOkTst && ((WordToken_Type)jcasType).casFeat_sourceEndIndex == null)
      jcasType.jcas.throwFeatMissing("sourceEndIndex", "dev.amb.uima.typeSystem.language.WordToken");
    return jcasType.ll_cas.ll_getLongValue(addr, ((WordToken_Type)jcasType).casFeatCode_sourceEndIndex);}
    
  /** setter for sourceEndIndex - sets Absolute end index of token in source document - used when processing multiple sentences to store index position of word token in source document 
   * @generated */
  public void setSourceEndIndex(long v) {
    if (WordToken_Type.featOkTst && ((WordToken_Type)jcasType).casFeat_sourceEndIndex == null)
      jcasType.jcas.throwFeatMissing("sourceEndIndex", "dev.amb.uima.typeSystem.language.WordToken");
    jcasType.ll_cas.ll_setLongValue(addr, ((WordToken_Type)jcasType).casFeatCode_sourceEndIndex, v);}    
   
    
  //*--------------*
  //* Feature: partOfSpeech

  /** getter for partOfSpeech - gets 
   * @generated */
  public String getPartOfSpeech() {
    if (WordToken_Type.featOkTst && ((WordToken_Type)jcasType).casFeat_partOfSpeech == null)
      jcasType.jcas.throwFeatMissing("partOfSpeech", "dev.amb.uima.typeSystem.language.WordToken");
    return jcasType.ll_cas.ll_getStringValue(addr, ((WordToken_Type)jcasType).casFeatCode_partOfSpeech);}
    
  /** setter for partOfSpeech - sets  
   * @generated */
  public void setPartOfSpeech(String v) {
    if (WordToken_Type.featOkTst && ((WordToken_Type)jcasType).casFeat_partOfSpeech == null)
      jcasType.jcas.throwFeatMissing("partOfSpeech", "dev.amb.uima.typeSystem.language.WordToken");
    jcasType.ll_cas.ll_setStringValue(addr, ((WordToken_Type)jcasType).casFeatCode_partOfSpeech, v);}    
   
    
  //*--------------*
  //* Feature: sentenceOrder

  /** getter for sentenceOrder - gets 
   * @generated */
  public int getSentenceOrder() {
    if (WordToken_Type.featOkTst && ((WordToken_Type)jcasType).casFeat_sentenceOrder == null)
      jcasType.jcas.throwFeatMissing("sentenceOrder", "dev.amb.uima.typeSystem.language.WordToken");
    return jcasType.ll_cas.ll_getIntValue(addr, ((WordToken_Type)jcasType).casFeatCode_sentenceOrder);}
    
  /** setter for sentenceOrder - sets  
   * @generated */
  public void setSentenceOrder(int v) {
    if (WordToken_Type.featOkTst && ((WordToken_Type)jcasType).casFeat_sentenceOrder == null)
      jcasType.jcas.throwFeatMissing("sentenceOrder", "dev.amb.uima.typeSystem.language.WordToken");
    jcasType.ll_cas.ll_setIntValue(addr, ((WordToken_Type)jcasType).casFeatCode_sentenceOrder, v);}    
  }

    
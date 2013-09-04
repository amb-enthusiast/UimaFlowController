

/* First created by JCasGen Tue Sep 03 22:19:52 MDT 2013 */
package dev.amb.uima.typeSystem.language;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 03 22:19:52 MDT 2013
 * XML source: /Users/amb/dev/workspaces/eclipse/uimaWorkspace/FlowController/desc/devTypeSystemDescriptor.xml
 * @generated */
public class PhraseChunk extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(PhraseChunk.class);
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
  protected PhraseChunk() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public PhraseChunk(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public PhraseChunk(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public PhraseChunk(JCas jcas, int begin, int end) {
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
  //* Feature: chunkType

  /** getter for chunkType - gets 
   * @generated */
  public String getChunkType() {
    if (PhraseChunk_Type.featOkTst && ((PhraseChunk_Type)jcasType).casFeat_chunkType == null)
      jcasType.jcas.throwFeatMissing("chunkType", "dev.amb.uima.typeSystem.language.PhraseChunk");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PhraseChunk_Type)jcasType).casFeatCode_chunkType);}
    
  /** setter for chunkType - sets  
   * @generated */
  public void setChunkType(String v) {
    if (PhraseChunk_Type.featOkTst && ((PhraseChunk_Type)jcasType).casFeat_chunkType == null)
      jcasType.jcas.throwFeatMissing("chunkType", "dev.amb.uima.typeSystem.language.PhraseChunk");
    jcasType.ll_cas.ll_setStringValue(addr, ((PhraseChunk_Type)jcasType).casFeatCode_chunkType, v);}    
   
    
  //*--------------*
  //* Feature: chunkWords

  /** getter for chunkWords - gets 
   * @generated */
  public FSArray getChunkWords() {
    if (PhraseChunk_Type.featOkTst && ((PhraseChunk_Type)jcasType).casFeat_chunkWords == null)
      jcasType.jcas.throwFeatMissing("chunkWords", "dev.amb.uima.typeSystem.language.PhraseChunk");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((PhraseChunk_Type)jcasType).casFeatCode_chunkWords)));}
    
  /** setter for chunkWords - sets  
   * @generated */
  public void setChunkWords(FSArray v) {
    if (PhraseChunk_Type.featOkTst && ((PhraseChunk_Type)jcasType).casFeat_chunkWords == null)
      jcasType.jcas.throwFeatMissing("chunkWords", "dev.amb.uima.typeSystem.language.PhraseChunk");
    jcasType.ll_cas.ll_setRefValue(addr, ((PhraseChunk_Type)jcasType).casFeatCode_chunkWords, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for chunkWords - gets an indexed value - 
   * @generated */
  public WordToken getChunkWords(int i) {
    if (PhraseChunk_Type.featOkTst && ((PhraseChunk_Type)jcasType).casFeat_chunkWords == null)
      jcasType.jcas.throwFeatMissing("chunkWords", "dev.amb.uima.typeSystem.language.PhraseChunk");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((PhraseChunk_Type)jcasType).casFeatCode_chunkWords), i);
    return (WordToken)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((PhraseChunk_Type)jcasType).casFeatCode_chunkWords), i)));}

  /** indexed setter for chunkWords - sets an indexed value - 
   * @generated */
  public void setChunkWords(int i, WordToken v) { 
    if (PhraseChunk_Type.featOkTst && ((PhraseChunk_Type)jcasType).casFeat_chunkWords == null)
      jcasType.jcas.throwFeatMissing("chunkWords", "dev.amb.uima.typeSystem.language.PhraseChunk");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((PhraseChunk_Type)jcasType).casFeatCode_chunkWords), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((PhraseChunk_Type)jcasType).casFeatCode_chunkWords), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: headPhrase

  /** getter for headPhrase - gets 
   * @generated */
  public PhraseChunk getHeadPhrase() {
    if (PhraseChunk_Type.featOkTst && ((PhraseChunk_Type)jcasType).casFeat_headPhrase == null)
      jcasType.jcas.throwFeatMissing("headPhrase", "dev.amb.uima.typeSystem.language.PhraseChunk");
    return (PhraseChunk)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((PhraseChunk_Type)jcasType).casFeatCode_headPhrase)));}
    
  /** setter for headPhrase - sets  
   * @generated */
  public void setHeadPhrase(PhraseChunk v) {
    if (PhraseChunk_Type.featOkTst && ((PhraseChunk_Type)jcasType).casFeat_headPhrase == null)
      jcasType.jcas.throwFeatMissing("headPhrase", "dev.amb.uima.typeSystem.language.PhraseChunk");
    jcasType.ll_cas.ll_setRefValue(addr, ((PhraseChunk_Type)jcasType).casFeatCode_headPhrase, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    
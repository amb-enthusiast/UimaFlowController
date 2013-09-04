

/* First created by JCasGen Tue Sep 03 22:19:52 MDT 2013 */
package dev.amb.uima.typeSystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 03 22:19:52 MDT 2013
 * XML source: /Users/amb/dev/workspaces/eclipse/uimaWorkspace/FlowController/desc/devTypeSystemDescriptor.xml
 * @generated */
public class AceDocument extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AceDocument.class);
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
  protected AceDocument() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AceDocument(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AceDocument(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public AceDocument(JCas jcas, int begin, int end) {
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
  //* Feature: AceUri

  /** getter for AceUri - gets 
   * @generated */
  public String getAceUri() {
    if (AceDocument_Type.featOkTst && ((AceDocument_Type)jcasType).casFeat_AceUri == null)
      jcasType.jcas.throwFeatMissing("AceUri", "dev.amb.uima.typeSystem.AceDocument");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AceDocument_Type)jcasType).casFeatCode_AceUri);}
    
  /** setter for AceUri - sets  
   * @generated */
  public void setAceUri(String v) {
    if (AceDocument_Type.featOkTst && ((AceDocument_Type)jcasType).casFeat_AceUri == null)
      jcasType.jcas.throwFeatMissing("AceUri", "dev.amb.uima.typeSystem.AceDocument");
    jcasType.ll_cas.ll_setStringValue(addr, ((AceDocument_Type)jcasType).casFeatCode_AceUri, v);}    
   
    
  //*--------------*
  //* Feature: AceSource

  /** getter for AceSource - gets 
   * @generated */
  public String getAceSource() {
    if (AceDocument_Type.featOkTst && ((AceDocument_Type)jcasType).casFeat_AceSource == null)
      jcasType.jcas.throwFeatMissing("AceSource", "dev.amb.uima.typeSystem.AceDocument");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AceDocument_Type)jcasType).casFeatCode_AceSource);}
    
  /** setter for AceSource - sets  
   * @generated */
  public void setAceSource(String v) {
    if (AceDocument_Type.featOkTst && ((AceDocument_Type)jcasType).casFeat_AceSource == null)
      jcasType.jcas.throwFeatMissing("AceSource", "dev.amb.uima.typeSystem.AceDocument");
    jcasType.ll_cas.ll_setStringValue(addr, ((AceDocument_Type)jcasType).casFeatCode_AceSource, v);}    
   
    
  //*--------------*
  //* Feature: AceType

  /** getter for AceType - gets 
   * @generated */
  public String getAceType() {
    if (AceDocument_Type.featOkTst && ((AceDocument_Type)jcasType).casFeat_AceType == null)
      jcasType.jcas.throwFeatMissing("AceType", "dev.amb.uima.typeSystem.AceDocument");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AceDocument_Type)jcasType).casFeatCode_AceType);}
    
  /** setter for AceType - sets  
   * @generated */
  public void setAceType(String v) {
    if (AceDocument_Type.featOkTst && ((AceDocument_Type)jcasType).casFeat_AceType == null)
      jcasType.jcas.throwFeatMissing("AceType", "dev.amb.uima.typeSystem.AceDocument");
    jcasType.ll_cas.ll_setStringValue(addr, ((AceDocument_Type)jcasType).casFeatCode_AceType, v);}    
  }

    
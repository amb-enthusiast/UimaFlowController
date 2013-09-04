

/* First created by JCasGen Tue Sep 03 22:19:52 MDT 2013 */
package dev.amb.uima.typeSystem.metaData;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 03 22:19:52 MDT 2013
 * XML source: /Users/amb/dev/workspaces/eclipse/uimaWorkspace/FlowController/desc/devTypeSystemDescriptor.xml
 * @generated */
public class DocInfo extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DocInfo.class);
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
  protected DocInfo() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public DocInfo(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public DocInfo(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public DocInfo(JCas jcas, int begin, int end) {
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
  //* Feature: key

  /** getter for key - gets 
   * @generated */
  public String getKey() {
    if (DocInfo_Type.featOkTst && ((DocInfo_Type)jcasType).casFeat_key == null)
      jcasType.jcas.throwFeatMissing("key", "dev.amb.uima.typeSystem.metaData.DocInfo");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocInfo_Type)jcasType).casFeatCode_key);}
    
  /** setter for key - sets  
   * @generated */
  public void setKey(String v) {
    if (DocInfo_Type.featOkTst && ((DocInfo_Type)jcasType).casFeat_key == null)
      jcasType.jcas.throwFeatMissing("key", "dev.amb.uima.typeSystem.metaData.DocInfo");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocInfo_Type)jcasType).casFeatCode_key, v);}    
   
    
  //*--------------*
  //* Feature: attrValue

  /** getter for attrValue - gets 
   * @generated */
  public String getAttrValue() {
    if (DocInfo_Type.featOkTst && ((DocInfo_Type)jcasType).casFeat_attrValue == null)
      jcasType.jcas.throwFeatMissing("attrValue", "dev.amb.uima.typeSystem.metaData.DocInfo");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocInfo_Type)jcasType).casFeatCode_attrValue);}
    
  /** setter for attrValue - sets  
   * @generated */
  public void setAttrValue(String v) {
    if (DocInfo_Type.featOkTst && ((DocInfo_Type)jcasType).casFeat_attrValue == null)
      jcasType.jcas.throwFeatMissing("attrValue", "dev.amb.uima.typeSystem.metaData.DocInfo");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocInfo_Type)jcasType).casFeatCode_attrValue, v);}    
  }

    
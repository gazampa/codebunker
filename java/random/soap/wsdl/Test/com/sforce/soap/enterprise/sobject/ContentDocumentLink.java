/**
 * ContentDocumentLink.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class ContentDocumentLink  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.sobject.ContentDocument contentDocument;

    private java.lang.String contentDocumentId;

    private java.lang.Boolean isDeleted;

    private com.sforce.soap.enterprise.sobject.Name linkedEntity;

    private java.lang.String linkedEntityId;

    private java.lang.String shareType;

    private java.util.Calendar systemModstamp;

    public ContentDocumentLink() {
    }

    public ContentDocumentLink(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.sobject.ContentDocument contentDocument,
           java.lang.String contentDocumentId,
           java.lang.Boolean isDeleted,
           com.sforce.soap.enterprise.sobject.Name linkedEntity,
           java.lang.String linkedEntityId,
           java.lang.String shareType,
           java.util.Calendar systemModstamp) {
        super(
            fieldsToNull,
            id);
        this.contentDocument = contentDocument;
        this.contentDocumentId = contentDocumentId;
        this.isDeleted = isDeleted;
        this.linkedEntity = linkedEntity;
        this.linkedEntityId = linkedEntityId;
        this.shareType = shareType;
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the contentDocument value for this ContentDocumentLink.
     * 
     * @return contentDocument
     */
    public com.sforce.soap.enterprise.sobject.ContentDocument getContentDocument() {
        return contentDocument;
    }


    /**
     * Sets the contentDocument value for this ContentDocumentLink.
     * 
     * @param contentDocument
     */
    public void setContentDocument(com.sforce.soap.enterprise.sobject.ContentDocument contentDocument) {
        this.contentDocument = contentDocument;
    }


    /**
     * Gets the contentDocumentId value for this ContentDocumentLink.
     * 
     * @return contentDocumentId
     */
    public java.lang.String getContentDocumentId() {
        return contentDocumentId;
    }


    /**
     * Sets the contentDocumentId value for this ContentDocumentLink.
     * 
     * @param contentDocumentId
     */
    public void setContentDocumentId(java.lang.String contentDocumentId) {
        this.contentDocumentId = contentDocumentId;
    }


    /**
     * Gets the isDeleted value for this ContentDocumentLink.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this ContentDocumentLink.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the linkedEntity value for this ContentDocumentLink.
     * 
     * @return linkedEntity
     */
    public com.sforce.soap.enterprise.sobject.Name getLinkedEntity() {
        return linkedEntity;
    }


    /**
     * Sets the linkedEntity value for this ContentDocumentLink.
     * 
     * @param linkedEntity
     */
    public void setLinkedEntity(com.sforce.soap.enterprise.sobject.Name linkedEntity) {
        this.linkedEntity = linkedEntity;
    }


    /**
     * Gets the linkedEntityId value for this ContentDocumentLink.
     * 
     * @return linkedEntityId
     */
    public java.lang.String getLinkedEntityId() {
        return linkedEntityId;
    }


    /**
     * Sets the linkedEntityId value for this ContentDocumentLink.
     * 
     * @param linkedEntityId
     */
    public void setLinkedEntityId(java.lang.String linkedEntityId) {
        this.linkedEntityId = linkedEntityId;
    }


    /**
     * Gets the shareType value for this ContentDocumentLink.
     * 
     * @return shareType
     */
    public java.lang.String getShareType() {
        return shareType;
    }


    /**
     * Sets the shareType value for this ContentDocumentLink.
     * 
     * @param shareType
     */
    public void setShareType(java.lang.String shareType) {
        this.shareType = shareType;
    }


    /**
     * Gets the systemModstamp value for this ContentDocumentLink.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this ContentDocumentLink.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContentDocumentLink)) return false;
        ContentDocumentLink other = (ContentDocumentLink) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.contentDocument==null && other.getContentDocument()==null) || 
             (this.contentDocument!=null &&
              this.contentDocument.equals(other.getContentDocument()))) &&
            ((this.contentDocumentId==null && other.getContentDocumentId()==null) || 
             (this.contentDocumentId!=null &&
              this.contentDocumentId.equals(other.getContentDocumentId()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.linkedEntity==null && other.getLinkedEntity()==null) || 
             (this.linkedEntity!=null &&
              this.linkedEntity.equals(other.getLinkedEntity()))) &&
            ((this.linkedEntityId==null && other.getLinkedEntityId()==null) || 
             (this.linkedEntityId!=null &&
              this.linkedEntityId.equals(other.getLinkedEntityId()))) &&
            ((this.shareType==null && other.getShareType()==null) || 
             (this.shareType!=null &&
              this.shareType.equals(other.getShareType()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getContentDocument() != null) {
            _hashCode += getContentDocument().hashCode();
        }
        if (getContentDocumentId() != null) {
            _hashCode += getContentDocumentId().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getLinkedEntity() != null) {
            _hashCode += getLinkedEntity().hashCode();
        }
        if (getLinkedEntityId() != null) {
            _hashCode += getLinkedEntityId().hashCode();
        }
        if (getShareType() != null) {
            _hashCode += getShareType().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContentDocumentLink.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentDocumentLink"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentDocument");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentDocument"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentDocument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentDocumentId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentDocumentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDeleted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDeleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkedEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LinkedEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkedEntityId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LinkedEntityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shareType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ShareType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemModstamp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SystemModstamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

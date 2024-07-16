/**
 * ContentWorkspaceDoc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class ContentWorkspaceDoc  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.sobject.ContentDocument contentDocument;

    private java.lang.String contentDocumentId;

    private com.sforce.soap.enterprise.sobject.ContentWorkspace contentWorkspace;

    private java.lang.String contentWorkspaceId;

    private java.util.Calendar createdDate;

    private java.lang.Boolean isDeleted;

    private java.lang.Boolean isOwner;

    private java.util.Calendar systemModstamp;

    public ContentWorkspaceDoc() {
    }

    public ContentWorkspaceDoc(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.sobject.ContentDocument contentDocument,
           java.lang.String contentDocumentId,
           com.sforce.soap.enterprise.sobject.ContentWorkspace contentWorkspace,
           java.lang.String contentWorkspaceId,
           java.util.Calendar createdDate,
           java.lang.Boolean isDeleted,
           java.lang.Boolean isOwner,
           java.util.Calendar systemModstamp) {
        super(
            fieldsToNull,
            id);
        this.contentDocument = contentDocument;
        this.contentDocumentId = contentDocumentId;
        this.contentWorkspace = contentWorkspace;
        this.contentWorkspaceId = contentWorkspaceId;
        this.createdDate = createdDate;
        this.isDeleted = isDeleted;
        this.isOwner = isOwner;
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the contentDocument value for this ContentWorkspaceDoc.
     * 
     * @return contentDocument
     */
    public com.sforce.soap.enterprise.sobject.ContentDocument getContentDocument() {
        return contentDocument;
    }


    /**
     * Sets the contentDocument value for this ContentWorkspaceDoc.
     * 
     * @param contentDocument
     */
    public void setContentDocument(com.sforce.soap.enterprise.sobject.ContentDocument contentDocument) {
        this.contentDocument = contentDocument;
    }


    /**
     * Gets the contentDocumentId value for this ContentWorkspaceDoc.
     * 
     * @return contentDocumentId
     */
    public java.lang.String getContentDocumentId() {
        return contentDocumentId;
    }


    /**
     * Sets the contentDocumentId value for this ContentWorkspaceDoc.
     * 
     * @param contentDocumentId
     */
    public void setContentDocumentId(java.lang.String contentDocumentId) {
        this.contentDocumentId = contentDocumentId;
    }


    /**
     * Gets the contentWorkspace value for this ContentWorkspaceDoc.
     * 
     * @return contentWorkspace
     */
    public com.sforce.soap.enterprise.sobject.ContentWorkspace getContentWorkspace() {
        return contentWorkspace;
    }


    /**
     * Sets the contentWorkspace value for this ContentWorkspaceDoc.
     * 
     * @param contentWorkspace
     */
    public void setContentWorkspace(com.sforce.soap.enterprise.sobject.ContentWorkspace contentWorkspace) {
        this.contentWorkspace = contentWorkspace;
    }


    /**
     * Gets the contentWorkspaceId value for this ContentWorkspaceDoc.
     * 
     * @return contentWorkspaceId
     */
    public java.lang.String getContentWorkspaceId() {
        return contentWorkspaceId;
    }


    /**
     * Sets the contentWorkspaceId value for this ContentWorkspaceDoc.
     * 
     * @param contentWorkspaceId
     */
    public void setContentWorkspaceId(java.lang.String contentWorkspaceId) {
        this.contentWorkspaceId = contentWorkspaceId;
    }


    /**
     * Gets the createdDate value for this ContentWorkspaceDoc.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this ContentWorkspaceDoc.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the isDeleted value for this ContentWorkspaceDoc.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this ContentWorkspaceDoc.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the isOwner value for this ContentWorkspaceDoc.
     * 
     * @return isOwner
     */
    public java.lang.Boolean getIsOwner() {
        return isOwner;
    }


    /**
     * Sets the isOwner value for this ContentWorkspaceDoc.
     * 
     * @param isOwner
     */
    public void setIsOwner(java.lang.Boolean isOwner) {
        this.isOwner = isOwner;
    }


    /**
     * Gets the systemModstamp value for this ContentWorkspaceDoc.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this ContentWorkspaceDoc.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContentWorkspaceDoc)) return false;
        ContentWorkspaceDoc other = (ContentWorkspaceDoc) obj;
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
            ((this.contentWorkspace==null && other.getContentWorkspace()==null) || 
             (this.contentWorkspace!=null &&
              this.contentWorkspace.equals(other.getContentWorkspace()))) &&
            ((this.contentWorkspaceId==null && other.getContentWorkspaceId()==null) || 
             (this.contentWorkspaceId!=null &&
              this.contentWorkspaceId.equals(other.getContentWorkspaceId()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.isOwner==null && other.getIsOwner()==null) || 
             (this.isOwner!=null &&
              this.isOwner.equals(other.getIsOwner()))) &&
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
        if (getContentWorkspace() != null) {
            _hashCode += getContentWorkspace().hashCode();
        }
        if (getContentWorkspaceId() != null) {
            _hashCode += getContentWorkspaceId().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getIsOwner() != null) {
            _hashCode += getIsOwner().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContentWorkspaceDoc.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentWorkspaceDoc"));
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
        elemField.setFieldName("contentWorkspace");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentWorkspace"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentWorkspace"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentWorkspaceId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentWorkspaceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CreatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("isOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

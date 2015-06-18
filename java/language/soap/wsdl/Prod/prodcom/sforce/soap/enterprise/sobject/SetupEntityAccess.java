/**
 * SetupEntityAccess.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class SetupEntityAccess  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.sobject.PermissionSet parent;

    private java.lang.String parentId;

    private java.lang.String setupEntityId;

    private java.lang.String setupEntityType;

    private java.util.Calendar systemModstamp;

    public SetupEntityAccess() {
    }

    public SetupEntityAccess(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.sobject.PermissionSet parent,
           java.lang.String parentId,
           java.lang.String setupEntityId,
           java.lang.String setupEntityType,
           java.util.Calendar systemModstamp) {
        super(
            fieldsToNull,
            id);
        this.parent = parent;
        this.parentId = parentId;
        this.setupEntityId = setupEntityId;
        this.setupEntityType = setupEntityType;
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the parent value for this SetupEntityAccess.
     * 
     * @return parent
     */
    public com.sforce.soap.enterprise.sobject.PermissionSet getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this SetupEntityAccess.
     * 
     * @param parent
     */
    public void setParent(com.sforce.soap.enterprise.sobject.PermissionSet parent) {
        this.parent = parent;
    }


    /**
     * Gets the parentId value for this SetupEntityAccess.
     * 
     * @return parentId
     */
    public java.lang.String getParentId() {
        return parentId;
    }


    /**
     * Sets the parentId value for this SetupEntityAccess.
     * 
     * @param parentId
     */
    public void setParentId(java.lang.String parentId) {
        this.parentId = parentId;
    }


    /**
     * Gets the setupEntityId value for this SetupEntityAccess.
     * 
     * @return setupEntityId
     */
    public java.lang.String getSetupEntityId() {
        return setupEntityId;
    }


    /**
     * Sets the setupEntityId value for this SetupEntityAccess.
     * 
     * @param setupEntityId
     */
    public void setSetupEntityId(java.lang.String setupEntityId) {
        this.setupEntityId = setupEntityId;
    }


    /**
     * Gets the setupEntityType value for this SetupEntityAccess.
     * 
     * @return setupEntityType
     */
    public java.lang.String getSetupEntityType() {
        return setupEntityType;
    }


    /**
     * Sets the setupEntityType value for this SetupEntityAccess.
     * 
     * @param setupEntityType
     */
    public void setSetupEntityType(java.lang.String setupEntityType) {
        this.setupEntityType = setupEntityType;
    }


    /**
     * Gets the systemModstamp value for this SetupEntityAccess.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this SetupEntityAccess.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetupEntityAccess)) return false;
        SetupEntityAccess other = (SetupEntityAccess) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.parentId==null && other.getParentId()==null) || 
             (this.parentId!=null &&
              this.parentId.equals(other.getParentId()))) &&
            ((this.setupEntityId==null && other.getSetupEntityId()==null) || 
             (this.setupEntityId!=null &&
              this.setupEntityId.equals(other.getSetupEntityId()))) &&
            ((this.setupEntityType==null && other.getSetupEntityType()==null) || 
             (this.setupEntityType!=null &&
              this.setupEntityType.equals(other.getSetupEntityType()))) &&
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
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getParentId() != null) {
            _hashCode += getParentId().hashCode();
        }
        if (getSetupEntityId() != null) {
            _hashCode += getSetupEntityId().hashCode();
        }
        if (getSetupEntityType() != null) {
            _hashCode += getSetupEntityType().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetupEntityAccess.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SetupEntityAccess"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionSet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ParentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setupEntityId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SetupEntityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setupEntityType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SetupEntityType"));
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

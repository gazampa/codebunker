/**
 * UserRecordAccess.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class UserRecordAccess  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.Boolean hasAllAccess;

    private java.lang.Boolean hasDeleteAccess;

    private java.lang.Boolean hasEditAccess;

    private java.lang.Boolean hasReadAccess;

    private java.lang.Boolean hasTransferAccess;

    private java.lang.String maxAccessLevel;

    private java.lang.String recordId;

    private java.lang.String userId;

    public UserRecordAccess() {
    }

    public UserRecordAccess(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.Boolean hasAllAccess,
           java.lang.Boolean hasDeleteAccess,
           java.lang.Boolean hasEditAccess,
           java.lang.Boolean hasReadAccess,
           java.lang.Boolean hasTransferAccess,
           java.lang.String maxAccessLevel,
           java.lang.String recordId,
           java.lang.String userId) {
        super(
            fieldsToNull,
            id);
        this.hasAllAccess = hasAllAccess;
        this.hasDeleteAccess = hasDeleteAccess;
        this.hasEditAccess = hasEditAccess;
        this.hasReadAccess = hasReadAccess;
        this.hasTransferAccess = hasTransferAccess;
        this.maxAccessLevel = maxAccessLevel;
        this.recordId = recordId;
        this.userId = userId;
    }


    /**
     * Gets the hasAllAccess value for this UserRecordAccess.
     * 
     * @return hasAllAccess
     */
    public java.lang.Boolean getHasAllAccess() {
        return hasAllAccess;
    }


    /**
     * Sets the hasAllAccess value for this UserRecordAccess.
     * 
     * @param hasAllAccess
     */
    public void setHasAllAccess(java.lang.Boolean hasAllAccess) {
        this.hasAllAccess = hasAllAccess;
    }


    /**
     * Gets the hasDeleteAccess value for this UserRecordAccess.
     * 
     * @return hasDeleteAccess
     */
    public java.lang.Boolean getHasDeleteAccess() {
        return hasDeleteAccess;
    }


    /**
     * Sets the hasDeleteAccess value for this UserRecordAccess.
     * 
     * @param hasDeleteAccess
     */
    public void setHasDeleteAccess(java.lang.Boolean hasDeleteAccess) {
        this.hasDeleteAccess = hasDeleteAccess;
    }


    /**
     * Gets the hasEditAccess value for this UserRecordAccess.
     * 
     * @return hasEditAccess
     */
    public java.lang.Boolean getHasEditAccess() {
        return hasEditAccess;
    }


    /**
     * Sets the hasEditAccess value for this UserRecordAccess.
     * 
     * @param hasEditAccess
     */
    public void setHasEditAccess(java.lang.Boolean hasEditAccess) {
        this.hasEditAccess = hasEditAccess;
    }


    /**
     * Gets the hasReadAccess value for this UserRecordAccess.
     * 
     * @return hasReadAccess
     */
    public java.lang.Boolean getHasReadAccess() {
        return hasReadAccess;
    }


    /**
     * Sets the hasReadAccess value for this UserRecordAccess.
     * 
     * @param hasReadAccess
     */
    public void setHasReadAccess(java.lang.Boolean hasReadAccess) {
        this.hasReadAccess = hasReadAccess;
    }


    /**
     * Gets the hasTransferAccess value for this UserRecordAccess.
     * 
     * @return hasTransferAccess
     */
    public java.lang.Boolean getHasTransferAccess() {
        return hasTransferAccess;
    }


    /**
     * Sets the hasTransferAccess value for this UserRecordAccess.
     * 
     * @param hasTransferAccess
     */
    public void setHasTransferAccess(java.lang.Boolean hasTransferAccess) {
        this.hasTransferAccess = hasTransferAccess;
    }


    /**
     * Gets the maxAccessLevel value for this UserRecordAccess.
     * 
     * @return maxAccessLevel
     */
    public java.lang.String getMaxAccessLevel() {
        return maxAccessLevel;
    }


    /**
     * Sets the maxAccessLevel value for this UserRecordAccess.
     * 
     * @param maxAccessLevel
     */
    public void setMaxAccessLevel(java.lang.String maxAccessLevel) {
        this.maxAccessLevel = maxAccessLevel;
    }


    /**
     * Gets the recordId value for this UserRecordAccess.
     * 
     * @return recordId
     */
    public java.lang.String getRecordId() {
        return recordId;
    }


    /**
     * Sets the recordId value for this UserRecordAccess.
     * 
     * @param recordId
     */
    public void setRecordId(java.lang.String recordId) {
        this.recordId = recordId;
    }


    /**
     * Gets the userId value for this UserRecordAccess.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this UserRecordAccess.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserRecordAccess)) return false;
        UserRecordAccess other = (UserRecordAccess) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hasAllAccess==null && other.getHasAllAccess()==null) || 
             (this.hasAllAccess!=null &&
              this.hasAllAccess.equals(other.getHasAllAccess()))) &&
            ((this.hasDeleteAccess==null && other.getHasDeleteAccess()==null) || 
             (this.hasDeleteAccess!=null &&
              this.hasDeleteAccess.equals(other.getHasDeleteAccess()))) &&
            ((this.hasEditAccess==null && other.getHasEditAccess()==null) || 
             (this.hasEditAccess!=null &&
              this.hasEditAccess.equals(other.getHasEditAccess()))) &&
            ((this.hasReadAccess==null && other.getHasReadAccess()==null) || 
             (this.hasReadAccess!=null &&
              this.hasReadAccess.equals(other.getHasReadAccess()))) &&
            ((this.hasTransferAccess==null && other.getHasTransferAccess()==null) || 
             (this.hasTransferAccess!=null &&
              this.hasTransferAccess.equals(other.getHasTransferAccess()))) &&
            ((this.maxAccessLevel==null && other.getMaxAccessLevel()==null) || 
             (this.maxAccessLevel!=null &&
              this.maxAccessLevel.equals(other.getMaxAccessLevel()))) &&
            ((this.recordId==null && other.getRecordId()==null) || 
             (this.recordId!=null &&
              this.recordId.equals(other.getRecordId()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId())));
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
        if (getHasAllAccess() != null) {
            _hashCode += getHasAllAccess().hashCode();
        }
        if (getHasDeleteAccess() != null) {
            _hashCode += getHasDeleteAccess().hashCode();
        }
        if (getHasEditAccess() != null) {
            _hashCode += getHasEditAccess().hashCode();
        }
        if (getHasReadAccess() != null) {
            _hashCode += getHasReadAccess().hashCode();
        }
        if (getHasTransferAccess() != null) {
            _hashCode += getHasTransferAccess().hashCode();
        }
        if (getMaxAccessLevel() != null) {
            _hashCode += getMaxAccessLevel().hashCode();
        }
        if (getRecordId() != null) {
            _hashCode += getRecordId().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserRecordAccess.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserRecordAccess"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasAllAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HasAllAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasDeleteAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HasDeleteAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasEditAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HasEditAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasReadAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HasReadAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasTransferAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HasTransferAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxAccessLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaxAccessLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecordId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

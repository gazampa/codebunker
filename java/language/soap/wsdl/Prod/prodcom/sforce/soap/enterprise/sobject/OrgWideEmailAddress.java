/**
 * OrgWideEmailAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class OrgWideEmailAddress  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String address;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String displayName;

    private java.lang.Boolean isAllowAllProfiles;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.util.Calendar systemModstamp;

    public OrgWideEmailAddress() {
    }

    public OrgWideEmailAddress(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String address,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String displayName,
           java.lang.Boolean isAllowAllProfiles,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.util.Calendar systemModstamp) {
        super(
            fieldsToNull,
            id);
        this.address = address;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.displayName = displayName;
        this.isAllowAllProfiles = isAllowAllProfiles;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the address value for this OrgWideEmailAddress.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this OrgWideEmailAddress.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the createdBy value for this OrgWideEmailAddress.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this OrgWideEmailAddress.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this OrgWideEmailAddress.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this OrgWideEmailAddress.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this OrgWideEmailAddress.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this OrgWideEmailAddress.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the displayName value for this OrgWideEmailAddress.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this OrgWideEmailAddress.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the isAllowAllProfiles value for this OrgWideEmailAddress.
     * 
     * @return isAllowAllProfiles
     */
    public java.lang.Boolean getIsAllowAllProfiles() {
        return isAllowAllProfiles;
    }


    /**
     * Sets the isAllowAllProfiles value for this OrgWideEmailAddress.
     * 
     * @param isAllowAllProfiles
     */
    public void setIsAllowAllProfiles(java.lang.Boolean isAllowAllProfiles) {
        this.isAllowAllProfiles = isAllowAllProfiles;
    }


    /**
     * Gets the lastModifiedBy value for this OrgWideEmailAddress.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this OrgWideEmailAddress.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this OrgWideEmailAddress.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this OrgWideEmailAddress.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this OrgWideEmailAddress.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this OrgWideEmailAddress.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the systemModstamp value for this OrgWideEmailAddress.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this OrgWideEmailAddress.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrgWideEmailAddress)) return false;
        OrgWideEmailAddress other = (OrgWideEmailAddress) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.isAllowAllProfiles==null && other.getIsAllowAllProfiles()==null) || 
             (this.isAllowAllProfiles!=null &&
              this.isAllowAllProfiles.equals(other.getIsAllowAllProfiles()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getCreatedById() != null) {
            _hashCode += getCreatedById().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getIsAllowAllProfiles() != null) {
            _hashCode += getIsAllowAllProfiles().hashCode();
        }
        if (getLastModifiedBy() != null) {
            _hashCode += getLastModifiedBy().hashCode();
        }
        if (getLastModifiedById() != null) {
            _hashCode += getLastModifiedById().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrgWideEmailAddress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OrgWideEmailAddress"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdById");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CreatedById"));
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
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DisplayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAllowAllProfiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsAllowAllProfiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastModifiedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedById");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastModifiedById"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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

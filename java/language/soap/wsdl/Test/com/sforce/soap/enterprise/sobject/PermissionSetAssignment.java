/**
 * PermissionSetAssignment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class PermissionSetAssignment  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.sobject.User assignee;

    private java.lang.String assigneeId;

    private com.sforce.soap.enterprise.sobject.PermissionSet permissionSet;

    private java.lang.String permissionSetId;

    private java.util.Calendar systemModstamp;

    public PermissionSetAssignment() {
    }

    public PermissionSetAssignment(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.sobject.User assignee,
           java.lang.String assigneeId,
           com.sforce.soap.enterprise.sobject.PermissionSet permissionSet,
           java.lang.String permissionSetId,
           java.util.Calendar systemModstamp) {
        super(
            fieldsToNull,
            id);
        this.assignee = assignee;
        this.assigneeId = assigneeId;
        this.permissionSet = permissionSet;
        this.permissionSetId = permissionSetId;
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the assignee value for this PermissionSetAssignment.
     * 
     * @return assignee
     */
    public com.sforce.soap.enterprise.sobject.User getAssignee() {
        return assignee;
    }


    /**
     * Sets the assignee value for this PermissionSetAssignment.
     * 
     * @param assignee
     */
    public void setAssignee(com.sforce.soap.enterprise.sobject.User assignee) {
        this.assignee = assignee;
    }


    /**
     * Gets the assigneeId value for this PermissionSetAssignment.
     * 
     * @return assigneeId
     */
    public java.lang.String getAssigneeId() {
        return assigneeId;
    }


    /**
     * Sets the assigneeId value for this PermissionSetAssignment.
     * 
     * @param assigneeId
     */
    public void setAssigneeId(java.lang.String assigneeId) {
        this.assigneeId = assigneeId;
    }


    /**
     * Gets the permissionSet value for this PermissionSetAssignment.
     * 
     * @return permissionSet
     */
    public com.sforce.soap.enterprise.sobject.PermissionSet getPermissionSet() {
        return permissionSet;
    }


    /**
     * Sets the permissionSet value for this PermissionSetAssignment.
     * 
     * @param permissionSet
     */
    public void setPermissionSet(com.sforce.soap.enterprise.sobject.PermissionSet permissionSet) {
        this.permissionSet = permissionSet;
    }


    /**
     * Gets the permissionSetId value for this PermissionSetAssignment.
     * 
     * @return permissionSetId
     */
    public java.lang.String getPermissionSetId() {
        return permissionSetId;
    }


    /**
     * Sets the permissionSetId value for this PermissionSetAssignment.
     * 
     * @param permissionSetId
     */
    public void setPermissionSetId(java.lang.String permissionSetId) {
        this.permissionSetId = permissionSetId;
    }


    /**
     * Gets the systemModstamp value for this PermissionSetAssignment.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this PermissionSetAssignment.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PermissionSetAssignment)) return false;
        PermissionSetAssignment other = (PermissionSetAssignment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.assignee==null && other.getAssignee()==null) || 
             (this.assignee!=null &&
              this.assignee.equals(other.getAssignee()))) &&
            ((this.assigneeId==null && other.getAssigneeId()==null) || 
             (this.assigneeId!=null &&
              this.assigneeId.equals(other.getAssigneeId()))) &&
            ((this.permissionSet==null && other.getPermissionSet()==null) || 
             (this.permissionSet!=null &&
              this.permissionSet.equals(other.getPermissionSet()))) &&
            ((this.permissionSetId==null && other.getPermissionSetId()==null) || 
             (this.permissionSetId!=null &&
              this.permissionSetId.equals(other.getPermissionSetId()))) &&
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
        if (getAssignee() != null) {
            _hashCode += getAssignee().hashCode();
        }
        if (getAssigneeId() != null) {
            _hashCode += getAssigneeId().hashCode();
        }
        if (getPermissionSet() != null) {
            _hashCode += getPermissionSet().hashCode();
        }
        if (getPermissionSetId() != null) {
            _hashCode += getPermissionSetId().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PermissionSetAssignment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionSetAssignment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Assignee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assigneeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AssigneeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionSet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionSet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionSetId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionSetId"));
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

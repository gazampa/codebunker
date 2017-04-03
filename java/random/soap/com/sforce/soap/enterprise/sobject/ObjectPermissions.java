/**
 * ObjectPermissions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class ObjectPermissions  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private com.sforce.soap.enterprise.sobject.PermissionSet parent;

    private java.lang.String parentId;

    private java.lang.Boolean permissionsCreate;

    private java.lang.Boolean permissionsDelete;

    private java.lang.Boolean permissionsEdit;

    private java.lang.Boolean permissionsModifyAllRecords;

    private java.lang.Boolean permissionsRead;

    private java.lang.Boolean permissionsViewAllRecords;

    private java.lang.String sobjectType;

    private java.util.Calendar systemModstamp;

    public ObjectPermissions() {
    }

    public ObjectPermissions(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           com.sforce.soap.enterprise.sobject.PermissionSet parent,
           java.lang.String parentId,
           java.lang.Boolean permissionsCreate,
           java.lang.Boolean permissionsDelete,
           java.lang.Boolean permissionsEdit,
           java.lang.Boolean permissionsModifyAllRecords,
           java.lang.Boolean permissionsRead,
           java.lang.Boolean permissionsViewAllRecords,
           java.lang.String sobjectType,
           java.util.Calendar systemModstamp) {
        super(
            fieldsToNull,
            id);
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.parent = parent;
        this.parentId = parentId;
        this.permissionsCreate = permissionsCreate;
        this.permissionsDelete = permissionsDelete;
        this.permissionsEdit = permissionsEdit;
        this.permissionsModifyAllRecords = permissionsModifyAllRecords;
        this.permissionsRead = permissionsRead;
        this.permissionsViewAllRecords = permissionsViewAllRecords;
        this.sobjectType = sobjectType;
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the createdBy value for this ObjectPermissions.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this ObjectPermissions.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this ObjectPermissions.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this ObjectPermissions.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this ObjectPermissions.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this ObjectPermissions.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the lastModifiedBy value for this ObjectPermissions.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this ObjectPermissions.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this ObjectPermissions.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this ObjectPermissions.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this ObjectPermissions.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this ObjectPermissions.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the parent value for this ObjectPermissions.
     * 
     * @return parent
     */
    public com.sforce.soap.enterprise.sobject.PermissionSet getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this ObjectPermissions.
     * 
     * @param parent
     */
    public void setParent(com.sforce.soap.enterprise.sobject.PermissionSet parent) {
        this.parent = parent;
    }


    /**
     * Gets the parentId value for this ObjectPermissions.
     * 
     * @return parentId
     */
    public java.lang.String getParentId() {
        return parentId;
    }


    /**
     * Sets the parentId value for this ObjectPermissions.
     * 
     * @param parentId
     */
    public void setParentId(java.lang.String parentId) {
        this.parentId = parentId;
    }


    /**
     * Gets the permissionsCreate value for this ObjectPermissions.
     * 
     * @return permissionsCreate
     */
    public java.lang.Boolean getPermissionsCreate() {
        return permissionsCreate;
    }


    /**
     * Sets the permissionsCreate value for this ObjectPermissions.
     * 
     * @param permissionsCreate
     */
    public void setPermissionsCreate(java.lang.Boolean permissionsCreate) {
        this.permissionsCreate = permissionsCreate;
    }


    /**
     * Gets the permissionsDelete value for this ObjectPermissions.
     * 
     * @return permissionsDelete
     */
    public java.lang.Boolean getPermissionsDelete() {
        return permissionsDelete;
    }


    /**
     * Sets the permissionsDelete value for this ObjectPermissions.
     * 
     * @param permissionsDelete
     */
    public void setPermissionsDelete(java.lang.Boolean permissionsDelete) {
        this.permissionsDelete = permissionsDelete;
    }


    /**
     * Gets the permissionsEdit value for this ObjectPermissions.
     * 
     * @return permissionsEdit
     */
    public java.lang.Boolean getPermissionsEdit() {
        return permissionsEdit;
    }


    /**
     * Sets the permissionsEdit value for this ObjectPermissions.
     * 
     * @param permissionsEdit
     */
    public void setPermissionsEdit(java.lang.Boolean permissionsEdit) {
        this.permissionsEdit = permissionsEdit;
    }


    /**
     * Gets the permissionsModifyAllRecords value for this ObjectPermissions.
     * 
     * @return permissionsModifyAllRecords
     */
    public java.lang.Boolean getPermissionsModifyAllRecords() {
        return permissionsModifyAllRecords;
    }


    /**
     * Sets the permissionsModifyAllRecords value for this ObjectPermissions.
     * 
     * @param permissionsModifyAllRecords
     */
    public void setPermissionsModifyAllRecords(java.lang.Boolean permissionsModifyAllRecords) {
        this.permissionsModifyAllRecords = permissionsModifyAllRecords;
    }


    /**
     * Gets the permissionsRead value for this ObjectPermissions.
     * 
     * @return permissionsRead
     */
    public java.lang.Boolean getPermissionsRead() {
        return permissionsRead;
    }


    /**
     * Sets the permissionsRead value for this ObjectPermissions.
     * 
     * @param permissionsRead
     */
    public void setPermissionsRead(java.lang.Boolean permissionsRead) {
        this.permissionsRead = permissionsRead;
    }


    /**
     * Gets the permissionsViewAllRecords value for this ObjectPermissions.
     * 
     * @return permissionsViewAllRecords
     */
    public java.lang.Boolean getPermissionsViewAllRecords() {
        return permissionsViewAllRecords;
    }


    /**
     * Sets the permissionsViewAllRecords value for this ObjectPermissions.
     * 
     * @param permissionsViewAllRecords
     */
    public void setPermissionsViewAllRecords(java.lang.Boolean permissionsViewAllRecords) {
        this.permissionsViewAllRecords = permissionsViewAllRecords;
    }


    /**
     * Gets the sobjectType value for this ObjectPermissions.
     * 
     * @return sobjectType
     */
    public java.lang.String getSobjectType() {
        return sobjectType;
    }


    /**
     * Sets the sobjectType value for this ObjectPermissions.
     * 
     * @param sobjectType
     */
    public void setSobjectType(java.lang.String sobjectType) {
        this.sobjectType = sobjectType;
    }


    /**
     * Gets the systemModstamp value for this ObjectPermissions.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this ObjectPermissions.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjectPermissions)) return false;
        ObjectPermissions other = (ObjectPermissions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.parentId==null && other.getParentId()==null) || 
             (this.parentId!=null &&
              this.parentId.equals(other.getParentId()))) &&
            ((this.permissionsCreate==null && other.getPermissionsCreate()==null) || 
             (this.permissionsCreate!=null &&
              this.permissionsCreate.equals(other.getPermissionsCreate()))) &&
            ((this.permissionsDelete==null && other.getPermissionsDelete()==null) || 
             (this.permissionsDelete!=null &&
              this.permissionsDelete.equals(other.getPermissionsDelete()))) &&
            ((this.permissionsEdit==null && other.getPermissionsEdit()==null) || 
             (this.permissionsEdit!=null &&
              this.permissionsEdit.equals(other.getPermissionsEdit()))) &&
            ((this.permissionsModifyAllRecords==null && other.getPermissionsModifyAllRecords()==null) || 
             (this.permissionsModifyAllRecords!=null &&
              this.permissionsModifyAllRecords.equals(other.getPermissionsModifyAllRecords()))) &&
            ((this.permissionsRead==null && other.getPermissionsRead()==null) || 
             (this.permissionsRead!=null &&
              this.permissionsRead.equals(other.getPermissionsRead()))) &&
            ((this.permissionsViewAllRecords==null && other.getPermissionsViewAllRecords()==null) || 
             (this.permissionsViewAllRecords!=null &&
              this.permissionsViewAllRecords.equals(other.getPermissionsViewAllRecords()))) &&
            ((this.sobjectType==null && other.getSobjectType()==null) || 
             (this.sobjectType!=null &&
              this.sobjectType.equals(other.getSobjectType()))) &&
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
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getCreatedById() != null) {
            _hashCode += getCreatedById().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
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
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getParentId() != null) {
            _hashCode += getParentId().hashCode();
        }
        if (getPermissionsCreate() != null) {
            _hashCode += getPermissionsCreate().hashCode();
        }
        if (getPermissionsDelete() != null) {
            _hashCode += getPermissionsDelete().hashCode();
        }
        if (getPermissionsEdit() != null) {
            _hashCode += getPermissionsEdit().hashCode();
        }
        if (getPermissionsModifyAllRecords() != null) {
            _hashCode += getPermissionsModifyAllRecords().hashCode();
        }
        if (getPermissionsRead() != null) {
            _hashCode += getPermissionsRead().hashCode();
        }
        if (getPermissionsViewAllRecords() != null) {
            _hashCode += getPermissionsViewAllRecords().hashCode();
        }
        if (getSobjectType() != null) {
            _hashCode += getSobjectType().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjectPermissions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ObjectPermissions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("permissionsCreate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsCreate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsDelete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsDelete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEdit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEdit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsModifyAllRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsModifyAllRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsRead");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsRead"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsViewAllRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsViewAllRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sobjectType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SobjectType"));
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

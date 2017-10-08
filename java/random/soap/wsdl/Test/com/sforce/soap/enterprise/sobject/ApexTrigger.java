/**
 * ApexTrigger.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class ApexTrigger  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.Double apiVersion;

    private java.lang.String body;

    private java.lang.Double bodyCrc;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.Boolean isValid;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.Integer lengthWithoutComments;

    private java.lang.String name;

    private java.lang.String namespacePrefix;

    private java.lang.String status;

    private java.util.Calendar systemModstamp;

    private java.lang.String tableEnumOrId;

    private java.lang.Boolean usageAfterDelete;

    private java.lang.Boolean usageAfterInsert;

    private java.lang.Boolean usageAfterUndelete;

    private java.lang.Boolean usageAfterUpdate;

    private java.lang.Boolean usageBeforeDelete;

    private java.lang.Boolean usageBeforeInsert;

    private java.lang.Boolean usageBeforeUpdate;

    private java.lang.Boolean usageIsBulk;

    public ApexTrigger() {
    }

    public ApexTrigger(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.Double apiVersion,
           java.lang.String body,
           java.lang.Double bodyCrc,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.Boolean isValid,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.Integer lengthWithoutComments,
           java.lang.String name,
           java.lang.String namespacePrefix,
           java.lang.String status,
           java.util.Calendar systemModstamp,
           java.lang.String tableEnumOrId,
           java.lang.Boolean usageAfterDelete,
           java.lang.Boolean usageAfterInsert,
           java.lang.Boolean usageAfterUndelete,
           java.lang.Boolean usageAfterUpdate,
           java.lang.Boolean usageBeforeDelete,
           java.lang.Boolean usageBeforeInsert,
           java.lang.Boolean usageBeforeUpdate,
           java.lang.Boolean usageIsBulk) {
        super(
            fieldsToNull,
            id);
        this.apiVersion = apiVersion;
        this.body = body;
        this.bodyCrc = bodyCrc;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.isValid = isValid;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.lengthWithoutComments = lengthWithoutComments;
        this.name = name;
        this.namespacePrefix = namespacePrefix;
        this.status = status;
        this.systemModstamp = systemModstamp;
        this.tableEnumOrId = tableEnumOrId;
        this.usageAfterDelete = usageAfterDelete;
        this.usageAfterInsert = usageAfterInsert;
        this.usageAfterUndelete = usageAfterUndelete;
        this.usageAfterUpdate = usageAfterUpdate;
        this.usageBeforeDelete = usageBeforeDelete;
        this.usageBeforeInsert = usageBeforeInsert;
        this.usageBeforeUpdate = usageBeforeUpdate;
        this.usageIsBulk = usageIsBulk;
    }


    /**
     * Gets the apiVersion value for this ApexTrigger.
     * 
     * @return apiVersion
     */
    public java.lang.Double getApiVersion() {
        return apiVersion;
    }


    /**
     * Sets the apiVersion value for this ApexTrigger.
     * 
     * @param apiVersion
     */
    public void setApiVersion(java.lang.Double apiVersion) {
        this.apiVersion = apiVersion;
    }


    /**
     * Gets the body value for this ApexTrigger.
     * 
     * @return body
     */
    public java.lang.String getBody() {
        return body;
    }


    /**
     * Sets the body value for this ApexTrigger.
     * 
     * @param body
     */
    public void setBody(java.lang.String body) {
        this.body = body;
    }


    /**
     * Gets the bodyCrc value for this ApexTrigger.
     * 
     * @return bodyCrc
     */
    public java.lang.Double getBodyCrc() {
        return bodyCrc;
    }


    /**
     * Sets the bodyCrc value for this ApexTrigger.
     * 
     * @param bodyCrc
     */
    public void setBodyCrc(java.lang.Double bodyCrc) {
        this.bodyCrc = bodyCrc;
    }


    /**
     * Gets the createdBy value for this ApexTrigger.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this ApexTrigger.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this ApexTrigger.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this ApexTrigger.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this ApexTrigger.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this ApexTrigger.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the isValid value for this ApexTrigger.
     * 
     * @return isValid
     */
    public java.lang.Boolean getIsValid() {
        return isValid;
    }


    /**
     * Sets the isValid value for this ApexTrigger.
     * 
     * @param isValid
     */
    public void setIsValid(java.lang.Boolean isValid) {
        this.isValid = isValid;
    }


    /**
     * Gets the lastModifiedBy value for this ApexTrigger.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this ApexTrigger.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this ApexTrigger.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this ApexTrigger.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this ApexTrigger.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this ApexTrigger.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lengthWithoutComments value for this ApexTrigger.
     * 
     * @return lengthWithoutComments
     */
    public java.lang.Integer getLengthWithoutComments() {
        return lengthWithoutComments;
    }


    /**
     * Sets the lengthWithoutComments value for this ApexTrigger.
     * 
     * @param lengthWithoutComments
     */
    public void setLengthWithoutComments(java.lang.Integer lengthWithoutComments) {
        this.lengthWithoutComments = lengthWithoutComments;
    }


    /**
     * Gets the name value for this ApexTrigger.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ApexTrigger.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the namespacePrefix value for this ApexTrigger.
     * 
     * @return namespacePrefix
     */
    public java.lang.String getNamespacePrefix() {
        return namespacePrefix;
    }


    /**
     * Sets the namespacePrefix value for this ApexTrigger.
     * 
     * @param namespacePrefix
     */
    public void setNamespacePrefix(java.lang.String namespacePrefix) {
        this.namespacePrefix = namespacePrefix;
    }


    /**
     * Gets the status value for this ApexTrigger.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ApexTrigger.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the systemModstamp value for this ApexTrigger.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this ApexTrigger.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tableEnumOrId value for this ApexTrigger.
     * 
     * @return tableEnumOrId
     */
    public java.lang.String getTableEnumOrId() {
        return tableEnumOrId;
    }


    /**
     * Sets the tableEnumOrId value for this ApexTrigger.
     * 
     * @param tableEnumOrId
     */
    public void setTableEnumOrId(java.lang.String tableEnumOrId) {
        this.tableEnumOrId = tableEnumOrId;
    }


    /**
     * Gets the usageAfterDelete value for this ApexTrigger.
     * 
     * @return usageAfterDelete
     */
    public java.lang.Boolean getUsageAfterDelete() {
        return usageAfterDelete;
    }


    /**
     * Sets the usageAfterDelete value for this ApexTrigger.
     * 
     * @param usageAfterDelete
     */
    public void setUsageAfterDelete(java.lang.Boolean usageAfterDelete) {
        this.usageAfterDelete = usageAfterDelete;
    }


    /**
     * Gets the usageAfterInsert value for this ApexTrigger.
     * 
     * @return usageAfterInsert
     */
    public java.lang.Boolean getUsageAfterInsert() {
        return usageAfterInsert;
    }


    /**
     * Sets the usageAfterInsert value for this ApexTrigger.
     * 
     * @param usageAfterInsert
     */
    public void setUsageAfterInsert(java.lang.Boolean usageAfterInsert) {
        this.usageAfterInsert = usageAfterInsert;
    }


    /**
     * Gets the usageAfterUndelete value for this ApexTrigger.
     * 
     * @return usageAfterUndelete
     */
    public java.lang.Boolean getUsageAfterUndelete() {
        return usageAfterUndelete;
    }


    /**
     * Sets the usageAfterUndelete value for this ApexTrigger.
     * 
     * @param usageAfterUndelete
     */
    public void setUsageAfterUndelete(java.lang.Boolean usageAfterUndelete) {
        this.usageAfterUndelete = usageAfterUndelete;
    }


    /**
     * Gets the usageAfterUpdate value for this ApexTrigger.
     * 
     * @return usageAfterUpdate
     */
    public java.lang.Boolean getUsageAfterUpdate() {
        return usageAfterUpdate;
    }


    /**
     * Sets the usageAfterUpdate value for this ApexTrigger.
     * 
     * @param usageAfterUpdate
     */
    public void setUsageAfterUpdate(java.lang.Boolean usageAfterUpdate) {
        this.usageAfterUpdate = usageAfterUpdate;
    }


    /**
     * Gets the usageBeforeDelete value for this ApexTrigger.
     * 
     * @return usageBeforeDelete
     */
    public java.lang.Boolean getUsageBeforeDelete() {
        return usageBeforeDelete;
    }


    /**
     * Sets the usageBeforeDelete value for this ApexTrigger.
     * 
     * @param usageBeforeDelete
     */
    public void setUsageBeforeDelete(java.lang.Boolean usageBeforeDelete) {
        this.usageBeforeDelete = usageBeforeDelete;
    }


    /**
     * Gets the usageBeforeInsert value for this ApexTrigger.
     * 
     * @return usageBeforeInsert
     */
    public java.lang.Boolean getUsageBeforeInsert() {
        return usageBeforeInsert;
    }


    /**
     * Sets the usageBeforeInsert value for this ApexTrigger.
     * 
     * @param usageBeforeInsert
     */
    public void setUsageBeforeInsert(java.lang.Boolean usageBeforeInsert) {
        this.usageBeforeInsert = usageBeforeInsert;
    }


    /**
     * Gets the usageBeforeUpdate value for this ApexTrigger.
     * 
     * @return usageBeforeUpdate
     */
    public java.lang.Boolean getUsageBeforeUpdate() {
        return usageBeforeUpdate;
    }


    /**
     * Sets the usageBeforeUpdate value for this ApexTrigger.
     * 
     * @param usageBeforeUpdate
     */
    public void setUsageBeforeUpdate(java.lang.Boolean usageBeforeUpdate) {
        this.usageBeforeUpdate = usageBeforeUpdate;
    }


    /**
     * Gets the usageIsBulk value for this ApexTrigger.
     * 
     * @return usageIsBulk
     */
    public java.lang.Boolean getUsageIsBulk() {
        return usageIsBulk;
    }


    /**
     * Sets the usageIsBulk value for this ApexTrigger.
     * 
     * @param usageIsBulk
     */
    public void setUsageIsBulk(java.lang.Boolean usageIsBulk) {
        this.usageIsBulk = usageIsBulk;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApexTrigger)) return false;
        ApexTrigger other = (ApexTrigger) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.apiVersion==null && other.getApiVersion()==null) || 
             (this.apiVersion!=null &&
              this.apiVersion.equals(other.getApiVersion()))) &&
            ((this.body==null && other.getBody()==null) || 
             (this.body!=null &&
              this.body.equals(other.getBody()))) &&
            ((this.bodyCrc==null && other.getBodyCrc()==null) || 
             (this.bodyCrc!=null &&
              this.bodyCrc.equals(other.getBodyCrc()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.isValid==null && other.getIsValid()==null) || 
             (this.isValid!=null &&
              this.isValid.equals(other.getIsValid()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.lengthWithoutComments==null && other.getLengthWithoutComments()==null) || 
             (this.lengthWithoutComments!=null &&
              this.lengthWithoutComments.equals(other.getLengthWithoutComments()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.namespacePrefix==null && other.getNamespacePrefix()==null) || 
             (this.namespacePrefix!=null &&
              this.namespacePrefix.equals(other.getNamespacePrefix()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tableEnumOrId==null && other.getTableEnumOrId()==null) || 
             (this.tableEnumOrId!=null &&
              this.tableEnumOrId.equals(other.getTableEnumOrId()))) &&
            ((this.usageAfterDelete==null && other.getUsageAfterDelete()==null) || 
             (this.usageAfterDelete!=null &&
              this.usageAfterDelete.equals(other.getUsageAfterDelete()))) &&
            ((this.usageAfterInsert==null && other.getUsageAfterInsert()==null) || 
             (this.usageAfterInsert!=null &&
              this.usageAfterInsert.equals(other.getUsageAfterInsert()))) &&
            ((this.usageAfterUndelete==null && other.getUsageAfterUndelete()==null) || 
             (this.usageAfterUndelete!=null &&
              this.usageAfterUndelete.equals(other.getUsageAfterUndelete()))) &&
            ((this.usageAfterUpdate==null && other.getUsageAfterUpdate()==null) || 
             (this.usageAfterUpdate!=null &&
              this.usageAfterUpdate.equals(other.getUsageAfterUpdate()))) &&
            ((this.usageBeforeDelete==null && other.getUsageBeforeDelete()==null) || 
             (this.usageBeforeDelete!=null &&
              this.usageBeforeDelete.equals(other.getUsageBeforeDelete()))) &&
            ((this.usageBeforeInsert==null && other.getUsageBeforeInsert()==null) || 
             (this.usageBeforeInsert!=null &&
              this.usageBeforeInsert.equals(other.getUsageBeforeInsert()))) &&
            ((this.usageBeforeUpdate==null && other.getUsageBeforeUpdate()==null) || 
             (this.usageBeforeUpdate!=null &&
              this.usageBeforeUpdate.equals(other.getUsageBeforeUpdate()))) &&
            ((this.usageIsBulk==null && other.getUsageIsBulk()==null) || 
             (this.usageIsBulk!=null &&
              this.usageIsBulk.equals(other.getUsageIsBulk())));
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
        if (getApiVersion() != null) {
            _hashCode += getApiVersion().hashCode();
        }
        if (getBody() != null) {
            _hashCode += getBody().hashCode();
        }
        if (getBodyCrc() != null) {
            _hashCode += getBodyCrc().hashCode();
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
        if (getIsValid() != null) {
            _hashCode += getIsValid().hashCode();
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
        if (getLengthWithoutComments() != null) {
            _hashCode += getLengthWithoutComments().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNamespacePrefix() != null) {
            _hashCode += getNamespacePrefix().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTableEnumOrId() != null) {
            _hashCode += getTableEnumOrId().hashCode();
        }
        if (getUsageAfterDelete() != null) {
            _hashCode += getUsageAfterDelete().hashCode();
        }
        if (getUsageAfterInsert() != null) {
            _hashCode += getUsageAfterInsert().hashCode();
        }
        if (getUsageAfterUndelete() != null) {
            _hashCode += getUsageAfterUndelete().hashCode();
        }
        if (getUsageAfterUpdate() != null) {
            _hashCode += getUsageAfterUpdate().hashCode();
        }
        if (getUsageBeforeDelete() != null) {
            _hashCode += getUsageBeforeDelete().hashCode();
        }
        if (getUsageBeforeInsert() != null) {
            _hashCode += getUsageBeforeInsert().hashCode();
        }
        if (getUsageBeforeUpdate() != null) {
            _hashCode += getUsageBeforeUpdate().hashCode();
        }
        if (getUsageIsBulk() != null) {
            _hashCode += getUsageIsBulk().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApexTrigger.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApexTrigger"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApiVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("body");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Body"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bodyCrc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BodyCrc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("isValid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsValid"));
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
        elemField.setFieldName("lengthWithoutComments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LengthWithoutComments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namespacePrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NamespacePrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tableEnumOrId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TableEnumOrId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageAfterDelete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UsageAfterDelete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageAfterInsert");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UsageAfterInsert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageAfterUndelete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UsageAfterUndelete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageAfterUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UsageAfterUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageBeforeDelete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UsageBeforeDelete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageBeforeInsert");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UsageBeforeInsert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageBeforeUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UsageBeforeUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageIsBulk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UsageIsBulk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

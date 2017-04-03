/**
 * AsyncApexJob.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class AsyncApexJob  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.sobject.ApexClass apexClass;

    private java.lang.String apexClassId;

    private java.util.Calendar completedDate;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String extendedStatus;

    private java.lang.Integer jobItemsProcessed;

    private java.lang.String jobType;

    private java.lang.String lastProcessed;

    private java.lang.Integer lastProcessedOffset;

    private java.lang.String methodName;

    private java.lang.Integer numberOfErrors;

    private java.lang.String parentJobId;

    private java.lang.String status;

    private java.lang.Integer totalJobItems;

    public AsyncApexJob() {
    }

    public AsyncApexJob(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.sobject.ApexClass apexClass,
           java.lang.String apexClassId,
           java.util.Calendar completedDate,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String extendedStatus,
           java.lang.Integer jobItemsProcessed,
           java.lang.String jobType,
           java.lang.String lastProcessed,
           java.lang.Integer lastProcessedOffset,
           java.lang.String methodName,
           java.lang.Integer numberOfErrors,
           java.lang.String parentJobId,
           java.lang.String status,
           java.lang.Integer totalJobItems) {
        super(
            fieldsToNull,
            id);
        this.apexClass = apexClass;
        this.apexClassId = apexClassId;
        this.completedDate = completedDate;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.extendedStatus = extendedStatus;
        this.jobItemsProcessed = jobItemsProcessed;
        this.jobType = jobType;
        this.lastProcessed = lastProcessed;
        this.lastProcessedOffset = lastProcessedOffset;
        this.methodName = methodName;
        this.numberOfErrors = numberOfErrors;
        this.parentJobId = parentJobId;
        this.status = status;
        this.totalJobItems = totalJobItems;
    }


    /**
     * Gets the apexClass value for this AsyncApexJob.
     * 
     * @return apexClass
     */
    public com.sforce.soap.enterprise.sobject.ApexClass getApexClass() {
        return apexClass;
    }


    /**
     * Sets the apexClass value for this AsyncApexJob.
     * 
     * @param apexClass
     */
    public void setApexClass(com.sforce.soap.enterprise.sobject.ApexClass apexClass) {
        this.apexClass = apexClass;
    }


    /**
     * Gets the apexClassId value for this AsyncApexJob.
     * 
     * @return apexClassId
     */
    public java.lang.String getApexClassId() {
        return apexClassId;
    }


    /**
     * Sets the apexClassId value for this AsyncApexJob.
     * 
     * @param apexClassId
     */
    public void setApexClassId(java.lang.String apexClassId) {
        this.apexClassId = apexClassId;
    }


    /**
     * Gets the completedDate value for this AsyncApexJob.
     * 
     * @return completedDate
     */
    public java.util.Calendar getCompletedDate() {
        return completedDate;
    }


    /**
     * Sets the completedDate value for this AsyncApexJob.
     * 
     * @param completedDate
     */
    public void setCompletedDate(java.util.Calendar completedDate) {
        this.completedDate = completedDate;
    }


    /**
     * Gets the createdBy value for this AsyncApexJob.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this AsyncApexJob.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this AsyncApexJob.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this AsyncApexJob.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this AsyncApexJob.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this AsyncApexJob.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the extendedStatus value for this AsyncApexJob.
     * 
     * @return extendedStatus
     */
    public java.lang.String getExtendedStatus() {
        return extendedStatus;
    }


    /**
     * Sets the extendedStatus value for this AsyncApexJob.
     * 
     * @param extendedStatus
     */
    public void setExtendedStatus(java.lang.String extendedStatus) {
        this.extendedStatus = extendedStatus;
    }


    /**
     * Gets the jobItemsProcessed value for this AsyncApexJob.
     * 
     * @return jobItemsProcessed
     */
    public java.lang.Integer getJobItemsProcessed() {
        return jobItemsProcessed;
    }


    /**
     * Sets the jobItemsProcessed value for this AsyncApexJob.
     * 
     * @param jobItemsProcessed
     */
    public void setJobItemsProcessed(java.lang.Integer jobItemsProcessed) {
        this.jobItemsProcessed = jobItemsProcessed;
    }


    /**
     * Gets the jobType value for this AsyncApexJob.
     * 
     * @return jobType
     */
    public java.lang.String getJobType() {
        return jobType;
    }


    /**
     * Sets the jobType value for this AsyncApexJob.
     * 
     * @param jobType
     */
    public void setJobType(java.lang.String jobType) {
        this.jobType = jobType;
    }


    /**
     * Gets the lastProcessed value for this AsyncApexJob.
     * 
     * @return lastProcessed
     */
    public java.lang.String getLastProcessed() {
        return lastProcessed;
    }


    /**
     * Sets the lastProcessed value for this AsyncApexJob.
     * 
     * @param lastProcessed
     */
    public void setLastProcessed(java.lang.String lastProcessed) {
        this.lastProcessed = lastProcessed;
    }


    /**
     * Gets the lastProcessedOffset value for this AsyncApexJob.
     * 
     * @return lastProcessedOffset
     */
    public java.lang.Integer getLastProcessedOffset() {
        return lastProcessedOffset;
    }


    /**
     * Sets the lastProcessedOffset value for this AsyncApexJob.
     * 
     * @param lastProcessedOffset
     */
    public void setLastProcessedOffset(java.lang.Integer lastProcessedOffset) {
        this.lastProcessedOffset = lastProcessedOffset;
    }


    /**
     * Gets the methodName value for this AsyncApexJob.
     * 
     * @return methodName
     */
    public java.lang.String getMethodName() {
        return methodName;
    }


    /**
     * Sets the methodName value for this AsyncApexJob.
     * 
     * @param methodName
     */
    public void setMethodName(java.lang.String methodName) {
        this.methodName = methodName;
    }


    /**
     * Gets the numberOfErrors value for this AsyncApexJob.
     * 
     * @return numberOfErrors
     */
    public java.lang.Integer getNumberOfErrors() {
        return numberOfErrors;
    }


    /**
     * Sets the numberOfErrors value for this AsyncApexJob.
     * 
     * @param numberOfErrors
     */
    public void setNumberOfErrors(java.lang.Integer numberOfErrors) {
        this.numberOfErrors = numberOfErrors;
    }


    /**
     * Gets the parentJobId value for this AsyncApexJob.
     * 
     * @return parentJobId
     */
    public java.lang.String getParentJobId() {
        return parentJobId;
    }


    /**
     * Sets the parentJobId value for this AsyncApexJob.
     * 
     * @param parentJobId
     */
    public void setParentJobId(java.lang.String parentJobId) {
        this.parentJobId = parentJobId;
    }


    /**
     * Gets the status value for this AsyncApexJob.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this AsyncApexJob.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the totalJobItems value for this AsyncApexJob.
     * 
     * @return totalJobItems
     */
    public java.lang.Integer getTotalJobItems() {
        return totalJobItems;
    }


    /**
     * Sets the totalJobItems value for this AsyncApexJob.
     * 
     * @param totalJobItems
     */
    public void setTotalJobItems(java.lang.Integer totalJobItems) {
        this.totalJobItems = totalJobItems;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AsyncApexJob)) return false;
        AsyncApexJob other = (AsyncApexJob) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.apexClass==null && other.getApexClass()==null) || 
             (this.apexClass!=null &&
              this.apexClass.equals(other.getApexClass()))) &&
            ((this.apexClassId==null && other.getApexClassId()==null) || 
             (this.apexClassId!=null &&
              this.apexClassId.equals(other.getApexClassId()))) &&
            ((this.completedDate==null && other.getCompletedDate()==null) || 
             (this.completedDate!=null &&
              this.completedDate.equals(other.getCompletedDate()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.extendedStatus==null && other.getExtendedStatus()==null) || 
             (this.extendedStatus!=null &&
              this.extendedStatus.equals(other.getExtendedStatus()))) &&
            ((this.jobItemsProcessed==null && other.getJobItemsProcessed()==null) || 
             (this.jobItemsProcessed!=null &&
              this.jobItemsProcessed.equals(other.getJobItemsProcessed()))) &&
            ((this.jobType==null && other.getJobType()==null) || 
             (this.jobType!=null &&
              this.jobType.equals(other.getJobType()))) &&
            ((this.lastProcessed==null && other.getLastProcessed()==null) || 
             (this.lastProcessed!=null &&
              this.lastProcessed.equals(other.getLastProcessed()))) &&
            ((this.lastProcessedOffset==null && other.getLastProcessedOffset()==null) || 
             (this.lastProcessedOffset!=null &&
              this.lastProcessedOffset.equals(other.getLastProcessedOffset()))) &&
            ((this.methodName==null && other.getMethodName()==null) || 
             (this.methodName!=null &&
              this.methodName.equals(other.getMethodName()))) &&
            ((this.numberOfErrors==null && other.getNumberOfErrors()==null) || 
             (this.numberOfErrors!=null &&
              this.numberOfErrors.equals(other.getNumberOfErrors()))) &&
            ((this.parentJobId==null && other.getParentJobId()==null) || 
             (this.parentJobId!=null &&
              this.parentJobId.equals(other.getParentJobId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.totalJobItems==null && other.getTotalJobItems()==null) || 
             (this.totalJobItems!=null &&
              this.totalJobItems.equals(other.getTotalJobItems())));
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
        if (getApexClass() != null) {
            _hashCode += getApexClass().hashCode();
        }
        if (getApexClassId() != null) {
            _hashCode += getApexClassId().hashCode();
        }
        if (getCompletedDate() != null) {
            _hashCode += getCompletedDate().hashCode();
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
        if (getExtendedStatus() != null) {
            _hashCode += getExtendedStatus().hashCode();
        }
        if (getJobItemsProcessed() != null) {
            _hashCode += getJobItemsProcessed().hashCode();
        }
        if (getJobType() != null) {
            _hashCode += getJobType().hashCode();
        }
        if (getLastProcessed() != null) {
            _hashCode += getLastProcessed().hashCode();
        }
        if (getLastProcessedOffset() != null) {
            _hashCode += getLastProcessedOffset().hashCode();
        }
        if (getMethodName() != null) {
            _hashCode += getMethodName().hashCode();
        }
        if (getNumberOfErrors() != null) {
            _hashCode += getNumberOfErrors().hashCode();
        }
        if (getParentJobId() != null) {
            _hashCode += getParentJobId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTotalJobItems() != null) {
            _hashCode += getTotalJobItems().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AsyncApexJob.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AsyncApexJob"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apexClass");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApexClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApexClass"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apexClassId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApexClassId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CompletedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("extendedStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ExtendedStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobItemsProcessed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "JobItemsProcessed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "JobType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastProcessed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastProcessed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastProcessedOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastProcessedOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("methodName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MethodName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NumberOfErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentJobId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ParentJobId"));
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
        elemField.setFieldName("totalJobItems");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TotalJobItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

/**
 * ApexTestResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class ApexTestResult  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.sobject.ApexClass apexClass;

    private java.lang.String apexClassId;

    private com.sforce.soap.enterprise.sobject.ApexLog apexLog;

    private java.lang.String apexLogId;

    private com.sforce.soap.enterprise.sobject.AsyncApexJob asyncApexJob;

    private java.lang.String asyncApexJobId;

    private java.lang.String message;

    private java.lang.String methodName;

    private java.lang.String outcome;

    private com.sforce.soap.enterprise.sobject.ApexTestQueueItem queueItem;

    private java.lang.String queueItemId;

    private java.lang.String stackTrace;

    private java.util.Calendar systemModstamp;

    private java.util.Calendar testTimestamp;

    public ApexTestResult() {
    }

    public ApexTestResult(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.sobject.ApexClass apexClass,
           java.lang.String apexClassId,
           com.sforce.soap.enterprise.sobject.ApexLog apexLog,
           java.lang.String apexLogId,
           com.sforce.soap.enterprise.sobject.AsyncApexJob asyncApexJob,
           java.lang.String asyncApexJobId,
           java.lang.String message,
           java.lang.String methodName,
           java.lang.String outcome,
           com.sforce.soap.enterprise.sobject.ApexTestQueueItem queueItem,
           java.lang.String queueItemId,
           java.lang.String stackTrace,
           java.util.Calendar systemModstamp,
           java.util.Calendar testTimestamp) {
        super(
            fieldsToNull,
            id);
        this.apexClass = apexClass;
        this.apexClassId = apexClassId;
        this.apexLog = apexLog;
        this.apexLogId = apexLogId;
        this.asyncApexJob = asyncApexJob;
        this.asyncApexJobId = asyncApexJobId;
        this.message = message;
        this.methodName = methodName;
        this.outcome = outcome;
        this.queueItem = queueItem;
        this.queueItemId = queueItemId;
        this.stackTrace = stackTrace;
        this.systemModstamp = systemModstamp;
        this.testTimestamp = testTimestamp;
    }


    /**
     * Gets the apexClass value for this ApexTestResult.
     * 
     * @return apexClass
     */
    public com.sforce.soap.enterprise.sobject.ApexClass getApexClass() {
        return apexClass;
    }


    /**
     * Sets the apexClass value for this ApexTestResult.
     * 
     * @param apexClass
     */
    public void setApexClass(com.sforce.soap.enterprise.sobject.ApexClass apexClass) {
        this.apexClass = apexClass;
    }


    /**
     * Gets the apexClassId value for this ApexTestResult.
     * 
     * @return apexClassId
     */
    public java.lang.String getApexClassId() {
        return apexClassId;
    }


    /**
     * Sets the apexClassId value for this ApexTestResult.
     * 
     * @param apexClassId
     */
    public void setApexClassId(java.lang.String apexClassId) {
        this.apexClassId = apexClassId;
    }


    /**
     * Gets the apexLog value for this ApexTestResult.
     * 
     * @return apexLog
     */
    public com.sforce.soap.enterprise.sobject.ApexLog getApexLog() {
        return apexLog;
    }


    /**
     * Sets the apexLog value for this ApexTestResult.
     * 
     * @param apexLog
     */
    public void setApexLog(com.sforce.soap.enterprise.sobject.ApexLog apexLog) {
        this.apexLog = apexLog;
    }


    /**
     * Gets the apexLogId value for this ApexTestResult.
     * 
     * @return apexLogId
     */
    public java.lang.String getApexLogId() {
        return apexLogId;
    }


    /**
     * Sets the apexLogId value for this ApexTestResult.
     * 
     * @param apexLogId
     */
    public void setApexLogId(java.lang.String apexLogId) {
        this.apexLogId = apexLogId;
    }


    /**
     * Gets the asyncApexJob value for this ApexTestResult.
     * 
     * @return asyncApexJob
     */
    public com.sforce.soap.enterprise.sobject.AsyncApexJob getAsyncApexJob() {
        return asyncApexJob;
    }


    /**
     * Sets the asyncApexJob value for this ApexTestResult.
     * 
     * @param asyncApexJob
     */
    public void setAsyncApexJob(com.sforce.soap.enterprise.sobject.AsyncApexJob asyncApexJob) {
        this.asyncApexJob = asyncApexJob;
    }


    /**
     * Gets the asyncApexJobId value for this ApexTestResult.
     * 
     * @return asyncApexJobId
     */
    public java.lang.String getAsyncApexJobId() {
        return asyncApexJobId;
    }


    /**
     * Sets the asyncApexJobId value for this ApexTestResult.
     * 
     * @param asyncApexJobId
     */
    public void setAsyncApexJobId(java.lang.String asyncApexJobId) {
        this.asyncApexJobId = asyncApexJobId;
    }


    /**
     * Gets the message value for this ApexTestResult.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ApexTestResult.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the methodName value for this ApexTestResult.
     * 
     * @return methodName
     */
    public java.lang.String getMethodName() {
        return methodName;
    }


    /**
     * Sets the methodName value for this ApexTestResult.
     * 
     * @param methodName
     */
    public void setMethodName(java.lang.String methodName) {
        this.methodName = methodName;
    }


    /**
     * Gets the outcome value for this ApexTestResult.
     * 
     * @return outcome
     */
    public java.lang.String getOutcome() {
        return outcome;
    }


    /**
     * Sets the outcome value for this ApexTestResult.
     * 
     * @param outcome
     */
    public void setOutcome(java.lang.String outcome) {
        this.outcome = outcome;
    }


    /**
     * Gets the queueItem value for this ApexTestResult.
     * 
     * @return queueItem
     */
    public com.sforce.soap.enterprise.sobject.ApexTestQueueItem getQueueItem() {
        return queueItem;
    }


    /**
     * Sets the queueItem value for this ApexTestResult.
     * 
     * @param queueItem
     */
    public void setQueueItem(com.sforce.soap.enterprise.sobject.ApexTestQueueItem queueItem) {
        this.queueItem = queueItem;
    }


    /**
     * Gets the queueItemId value for this ApexTestResult.
     * 
     * @return queueItemId
     */
    public java.lang.String getQueueItemId() {
        return queueItemId;
    }


    /**
     * Sets the queueItemId value for this ApexTestResult.
     * 
     * @param queueItemId
     */
    public void setQueueItemId(java.lang.String queueItemId) {
        this.queueItemId = queueItemId;
    }


    /**
     * Gets the stackTrace value for this ApexTestResult.
     * 
     * @return stackTrace
     */
    public java.lang.String getStackTrace() {
        return stackTrace;
    }


    /**
     * Sets the stackTrace value for this ApexTestResult.
     * 
     * @param stackTrace
     */
    public void setStackTrace(java.lang.String stackTrace) {
        this.stackTrace = stackTrace;
    }


    /**
     * Gets the systemModstamp value for this ApexTestResult.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this ApexTestResult.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the testTimestamp value for this ApexTestResult.
     * 
     * @return testTimestamp
     */
    public java.util.Calendar getTestTimestamp() {
        return testTimestamp;
    }


    /**
     * Sets the testTimestamp value for this ApexTestResult.
     * 
     * @param testTimestamp
     */
    public void setTestTimestamp(java.util.Calendar testTimestamp) {
        this.testTimestamp = testTimestamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApexTestResult)) return false;
        ApexTestResult other = (ApexTestResult) obj;
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
            ((this.apexLog==null && other.getApexLog()==null) || 
             (this.apexLog!=null &&
              this.apexLog.equals(other.getApexLog()))) &&
            ((this.apexLogId==null && other.getApexLogId()==null) || 
             (this.apexLogId!=null &&
              this.apexLogId.equals(other.getApexLogId()))) &&
            ((this.asyncApexJob==null && other.getAsyncApexJob()==null) || 
             (this.asyncApexJob!=null &&
              this.asyncApexJob.equals(other.getAsyncApexJob()))) &&
            ((this.asyncApexJobId==null && other.getAsyncApexJobId()==null) || 
             (this.asyncApexJobId!=null &&
              this.asyncApexJobId.equals(other.getAsyncApexJobId()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.methodName==null && other.getMethodName()==null) || 
             (this.methodName!=null &&
              this.methodName.equals(other.getMethodName()))) &&
            ((this.outcome==null && other.getOutcome()==null) || 
             (this.outcome!=null &&
              this.outcome.equals(other.getOutcome()))) &&
            ((this.queueItem==null && other.getQueueItem()==null) || 
             (this.queueItem!=null &&
              this.queueItem.equals(other.getQueueItem()))) &&
            ((this.queueItemId==null && other.getQueueItemId()==null) || 
             (this.queueItemId!=null &&
              this.queueItemId.equals(other.getQueueItemId()))) &&
            ((this.stackTrace==null && other.getStackTrace()==null) || 
             (this.stackTrace!=null &&
              this.stackTrace.equals(other.getStackTrace()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.testTimestamp==null && other.getTestTimestamp()==null) || 
             (this.testTimestamp!=null &&
              this.testTimestamp.equals(other.getTestTimestamp())));
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
        if (getApexLog() != null) {
            _hashCode += getApexLog().hashCode();
        }
        if (getApexLogId() != null) {
            _hashCode += getApexLogId().hashCode();
        }
        if (getAsyncApexJob() != null) {
            _hashCode += getAsyncApexJob().hashCode();
        }
        if (getAsyncApexJobId() != null) {
            _hashCode += getAsyncApexJobId().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getMethodName() != null) {
            _hashCode += getMethodName().hashCode();
        }
        if (getOutcome() != null) {
            _hashCode += getOutcome().hashCode();
        }
        if (getQueueItem() != null) {
            _hashCode += getQueueItem().hashCode();
        }
        if (getQueueItemId() != null) {
            _hashCode += getQueueItemId().hashCode();
        }
        if (getStackTrace() != null) {
            _hashCode += getStackTrace().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTestTimestamp() != null) {
            _hashCode += getTestTimestamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApexTestResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApexTestResult"));
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
        elemField.setFieldName("apexLog");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApexLog"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApexLog"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apexLogId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApexLogId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asyncApexJob");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AsyncApexJob"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AsyncApexJob"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asyncApexJobId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AsyncApexJobId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("outcome");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Outcome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queueItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "QueueItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApexTestQueueItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queueItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "QueueItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stackTrace");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "StackTrace"));
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
        elemField.setFieldName("testTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TestTimestamp"));
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

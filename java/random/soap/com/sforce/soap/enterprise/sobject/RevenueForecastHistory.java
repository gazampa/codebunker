/**
 * RevenueForecastHistory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class RevenueForecastHistory  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.Double closed;

    private java.lang.Double commit;

    private java.lang.String commitComments;

    private java.lang.Boolean commitOverridden;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private com.sforce.soap.enterprise.sobject.RevenueForecast forecastOverride;

    private java.lang.String forecastOverrideId;

    private java.lang.Double pipeline;

    private java.lang.Double quota;

    private java.util.Calendar systemModstamp;

    private java.lang.Double upside;

    private java.lang.String upsideComments;

    private java.lang.Boolean upsideOverridden;

    public RevenueForecastHistory() {
    }

    public RevenueForecastHistory(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.Double closed,
           java.lang.Double commit,
           java.lang.String commitComments,
           java.lang.Boolean commitOverridden,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           com.sforce.soap.enterprise.sobject.RevenueForecast forecastOverride,
           java.lang.String forecastOverrideId,
           java.lang.Double pipeline,
           java.lang.Double quota,
           java.util.Calendar systemModstamp,
           java.lang.Double upside,
           java.lang.String upsideComments,
           java.lang.Boolean upsideOverridden) {
        super(
            fieldsToNull,
            id);
        this.closed = closed;
        this.commit = commit;
        this.commitComments = commitComments;
        this.commitOverridden = commitOverridden;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.forecastOverride = forecastOverride;
        this.forecastOverrideId = forecastOverrideId;
        this.pipeline = pipeline;
        this.quota = quota;
        this.systemModstamp = systemModstamp;
        this.upside = upside;
        this.upsideComments = upsideComments;
        this.upsideOverridden = upsideOverridden;
    }


    /**
     * Gets the closed value for this RevenueForecastHistory.
     * 
     * @return closed
     */
    public java.lang.Double getClosed() {
        return closed;
    }


    /**
     * Sets the closed value for this RevenueForecastHistory.
     * 
     * @param closed
     */
    public void setClosed(java.lang.Double closed) {
        this.closed = closed;
    }


    /**
     * Gets the commit value for this RevenueForecastHistory.
     * 
     * @return commit
     */
    public java.lang.Double getCommit() {
        return commit;
    }


    /**
     * Sets the commit value for this RevenueForecastHistory.
     * 
     * @param commit
     */
    public void setCommit(java.lang.Double commit) {
        this.commit = commit;
    }


    /**
     * Gets the commitComments value for this RevenueForecastHistory.
     * 
     * @return commitComments
     */
    public java.lang.String getCommitComments() {
        return commitComments;
    }


    /**
     * Sets the commitComments value for this RevenueForecastHistory.
     * 
     * @param commitComments
     */
    public void setCommitComments(java.lang.String commitComments) {
        this.commitComments = commitComments;
    }


    /**
     * Gets the commitOverridden value for this RevenueForecastHistory.
     * 
     * @return commitOverridden
     */
    public java.lang.Boolean getCommitOverridden() {
        return commitOverridden;
    }


    /**
     * Sets the commitOverridden value for this RevenueForecastHistory.
     * 
     * @param commitOverridden
     */
    public void setCommitOverridden(java.lang.Boolean commitOverridden) {
        this.commitOverridden = commitOverridden;
    }


    /**
     * Gets the createdBy value for this RevenueForecastHistory.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this RevenueForecastHistory.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this RevenueForecastHistory.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this RevenueForecastHistory.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this RevenueForecastHistory.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this RevenueForecastHistory.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the forecastOverride value for this RevenueForecastHistory.
     * 
     * @return forecastOverride
     */
    public com.sforce.soap.enterprise.sobject.RevenueForecast getForecastOverride() {
        return forecastOverride;
    }


    /**
     * Sets the forecastOverride value for this RevenueForecastHistory.
     * 
     * @param forecastOverride
     */
    public void setForecastOverride(com.sforce.soap.enterprise.sobject.RevenueForecast forecastOverride) {
        this.forecastOverride = forecastOverride;
    }


    /**
     * Gets the forecastOverrideId value for this RevenueForecastHistory.
     * 
     * @return forecastOverrideId
     */
    public java.lang.String getForecastOverrideId() {
        return forecastOverrideId;
    }


    /**
     * Sets the forecastOverrideId value for this RevenueForecastHistory.
     * 
     * @param forecastOverrideId
     */
    public void setForecastOverrideId(java.lang.String forecastOverrideId) {
        this.forecastOverrideId = forecastOverrideId;
    }


    /**
     * Gets the pipeline value for this RevenueForecastHistory.
     * 
     * @return pipeline
     */
    public java.lang.Double getPipeline() {
        return pipeline;
    }


    /**
     * Sets the pipeline value for this RevenueForecastHistory.
     * 
     * @param pipeline
     */
    public void setPipeline(java.lang.Double pipeline) {
        this.pipeline = pipeline;
    }


    /**
     * Gets the quota value for this RevenueForecastHistory.
     * 
     * @return quota
     */
    public java.lang.Double getQuota() {
        return quota;
    }


    /**
     * Sets the quota value for this RevenueForecastHistory.
     * 
     * @param quota
     */
    public void setQuota(java.lang.Double quota) {
        this.quota = quota;
    }


    /**
     * Gets the systemModstamp value for this RevenueForecastHistory.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this RevenueForecastHistory.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the upside value for this RevenueForecastHistory.
     * 
     * @return upside
     */
    public java.lang.Double getUpside() {
        return upside;
    }


    /**
     * Sets the upside value for this RevenueForecastHistory.
     * 
     * @param upside
     */
    public void setUpside(java.lang.Double upside) {
        this.upside = upside;
    }


    /**
     * Gets the upsideComments value for this RevenueForecastHistory.
     * 
     * @return upsideComments
     */
    public java.lang.String getUpsideComments() {
        return upsideComments;
    }


    /**
     * Sets the upsideComments value for this RevenueForecastHistory.
     * 
     * @param upsideComments
     */
    public void setUpsideComments(java.lang.String upsideComments) {
        this.upsideComments = upsideComments;
    }


    /**
     * Gets the upsideOverridden value for this RevenueForecastHistory.
     * 
     * @return upsideOverridden
     */
    public java.lang.Boolean getUpsideOverridden() {
        return upsideOverridden;
    }


    /**
     * Sets the upsideOverridden value for this RevenueForecastHistory.
     * 
     * @param upsideOverridden
     */
    public void setUpsideOverridden(java.lang.Boolean upsideOverridden) {
        this.upsideOverridden = upsideOverridden;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RevenueForecastHistory)) return false;
        RevenueForecastHistory other = (RevenueForecastHistory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.closed==null && other.getClosed()==null) || 
             (this.closed!=null &&
              this.closed.equals(other.getClosed()))) &&
            ((this.commit==null && other.getCommit()==null) || 
             (this.commit!=null &&
              this.commit.equals(other.getCommit()))) &&
            ((this.commitComments==null && other.getCommitComments()==null) || 
             (this.commitComments!=null &&
              this.commitComments.equals(other.getCommitComments()))) &&
            ((this.commitOverridden==null && other.getCommitOverridden()==null) || 
             (this.commitOverridden!=null &&
              this.commitOverridden.equals(other.getCommitOverridden()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.forecastOverride==null && other.getForecastOverride()==null) || 
             (this.forecastOverride!=null &&
              this.forecastOverride.equals(other.getForecastOverride()))) &&
            ((this.forecastOverrideId==null && other.getForecastOverrideId()==null) || 
             (this.forecastOverrideId!=null &&
              this.forecastOverrideId.equals(other.getForecastOverrideId()))) &&
            ((this.pipeline==null && other.getPipeline()==null) || 
             (this.pipeline!=null &&
              this.pipeline.equals(other.getPipeline()))) &&
            ((this.quota==null && other.getQuota()==null) || 
             (this.quota!=null &&
              this.quota.equals(other.getQuota()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.upside==null && other.getUpside()==null) || 
             (this.upside!=null &&
              this.upside.equals(other.getUpside()))) &&
            ((this.upsideComments==null && other.getUpsideComments()==null) || 
             (this.upsideComments!=null &&
              this.upsideComments.equals(other.getUpsideComments()))) &&
            ((this.upsideOverridden==null && other.getUpsideOverridden()==null) || 
             (this.upsideOverridden!=null &&
              this.upsideOverridden.equals(other.getUpsideOverridden())));
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
        if (getClosed() != null) {
            _hashCode += getClosed().hashCode();
        }
        if (getCommit() != null) {
            _hashCode += getCommit().hashCode();
        }
        if (getCommitComments() != null) {
            _hashCode += getCommitComments().hashCode();
        }
        if (getCommitOverridden() != null) {
            _hashCode += getCommitOverridden().hashCode();
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
        if (getForecastOverride() != null) {
            _hashCode += getForecastOverride().hashCode();
        }
        if (getForecastOverrideId() != null) {
            _hashCode += getForecastOverrideId().hashCode();
        }
        if (getPipeline() != null) {
            _hashCode += getPipeline().hashCode();
        }
        if (getQuota() != null) {
            _hashCode += getQuota().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getUpside() != null) {
            _hashCode += getUpside().hashCode();
        }
        if (getUpsideComments() != null) {
            _hashCode += getUpsideComments().hashCode();
        }
        if (getUpsideOverridden() != null) {
            _hashCode += getUpsideOverridden().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RevenueForecastHistory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RevenueForecastHistory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Closed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Commit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commitComments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CommitComments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commitOverridden");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CommitOverridden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("forecastOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ForecastOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RevenueForecast"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forecastOverrideId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ForecastOverrideId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pipeline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pipeline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quota");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Quota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("upside");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Upside"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upsideComments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UpsideComments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upsideOverridden");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UpsideOverridden"));
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

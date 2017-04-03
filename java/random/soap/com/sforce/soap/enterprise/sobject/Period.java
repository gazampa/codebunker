/**
 * Period.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Period  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.util.Date endDate;

    private com.sforce.soap.enterprise.sobject.FiscalYearSettings fiscalYearSettings;

    private java.lang.String fiscalYearSettingsId;

    private java.lang.Boolean isForecastPeriod;

    private java.lang.Integer number;

    private java.lang.String periodLabel;

    private java.lang.String quarterLabel;

    private java.util.Date startDate;

    private java.util.Calendar systemModstamp;

    private java.lang.String type;

    public Period() {
    }

    public Period(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.util.Date endDate,
           com.sforce.soap.enterprise.sobject.FiscalYearSettings fiscalYearSettings,
           java.lang.String fiscalYearSettingsId,
           java.lang.Boolean isForecastPeriod,
           java.lang.Integer number,
           java.lang.String periodLabel,
           java.lang.String quarterLabel,
           java.util.Date startDate,
           java.util.Calendar systemModstamp,
           java.lang.String type) {
        super(
            fieldsToNull,
            id);
        this.endDate = endDate;
        this.fiscalYearSettings = fiscalYearSettings;
        this.fiscalYearSettingsId = fiscalYearSettingsId;
        this.isForecastPeriod = isForecastPeriod;
        this.number = number;
        this.periodLabel = periodLabel;
        this.quarterLabel = quarterLabel;
        this.startDate = startDate;
        this.systemModstamp = systemModstamp;
        this.type = type;
    }


    /**
     * Gets the endDate value for this Period.
     * 
     * @return endDate
     */
    public java.util.Date getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this Period.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the fiscalYearSettings value for this Period.
     * 
     * @return fiscalYearSettings
     */
    public com.sforce.soap.enterprise.sobject.FiscalYearSettings getFiscalYearSettings() {
        return fiscalYearSettings;
    }


    /**
     * Sets the fiscalYearSettings value for this Period.
     * 
     * @param fiscalYearSettings
     */
    public void setFiscalYearSettings(com.sforce.soap.enterprise.sobject.FiscalYearSettings fiscalYearSettings) {
        this.fiscalYearSettings = fiscalYearSettings;
    }


    /**
     * Gets the fiscalYearSettingsId value for this Period.
     * 
     * @return fiscalYearSettingsId
     */
    public java.lang.String getFiscalYearSettingsId() {
        return fiscalYearSettingsId;
    }


    /**
     * Sets the fiscalYearSettingsId value for this Period.
     * 
     * @param fiscalYearSettingsId
     */
    public void setFiscalYearSettingsId(java.lang.String fiscalYearSettingsId) {
        this.fiscalYearSettingsId = fiscalYearSettingsId;
    }


    /**
     * Gets the isForecastPeriod value for this Period.
     * 
     * @return isForecastPeriod
     */
    public java.lang.Boolean getIsForecastPeriod() {
        return isForecastPeriod;
    }


    /**
     * Sets the isForecastPeriod value for this Period.
     * 
     * @param isForecastPeriod
     */
    public void setIsForecastPeriod(java.lang.Boolean isForecastPeriod) {
        this.isForecastPeriod = isForecastPeriod;
    }


    /**
     * Gets the number value for this Period.
     * 
     * @return number
     */
    public java.lang.Integer getNumber() {
        return number;
    }


    /**
     * Sets the number value for this Period.
     * 
     * @param number
     */
    public void setNumber(java.lang.Integer number) {
        this.number = number;
    }


    /**
     * Gets the periodLabel value for this Period.
     * 
     * @return periodLabel
     */
    public java.lang.String getPeriodLabel() {
        return periodLabel;
    }


    /**
     * Sets the periodLabel value for this Period.
     * 
     * @param periodLabel
     */
    public void setPeriodLabel(java.lang.String periodLabel) {
        this.periodLabel = periodLabel;
    }


    /**
     * Gets the quarterLabel value for this Period.
     * 
     * @return quarterLabel
     */
    public java.lang.String getQuarterLabel() {
        return quarterLabel;
    }


    /**
     * Sets the quarterLabel value for this Period.
     * 
     * @param quarterLabel
     */
    public void setQuarterLabel(java.lang.String quarterLabel) {
        this.quarterLabel = quarterLabel;
    }


    /**
     * Gets the startDate value for this Period.
     * 
     * @return startDate
     */
    public java.util.Date getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this Period.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the systemModstamp value for this Period.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Period.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the type value for this Period.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Period.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Period)) return false;
        Period other = (Period) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.fiscalYearSettings==null && other.getFiscalYearSettings()==null) || 
             (this.fiscalYearSettings!=null &&
              this.fiscalYearSettings.equals(other.getFiscalYearSettings()))) &&
            ((this.fiscalYearSettingsId==null && other.getFiscalYearSettingsId()==null) || 
             (this.fiscalYearSettingsId!=null &&
              this.fiscalYearSettingsId.equals(other.getFiscalYearSettingsId()))) &&
            ((this.isForecastPeriod==null && other.getIsForecastPeriod()==null) || 
             (this.isForecastPeriod!=null &&
              this.isForecastPeriod.equals(other.getIsForecastPeriod()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.periodLabel==null && other.getPeriodLabel()==null) || 
             (this.periodLabel!=null &&
              this.periodLabel.equals(other.getPeriodLabel()))) &&
            ((this.quarterLabel==null && other.getQuarterLabel()==null) || 
             (this.quarterLabel!=null &&
              this.quarterLabel.equals(other.getQuarterLabel()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getFiscalYearSettings() != null) {
            _hashCode += getFiscalYearSettings().hashCode();
        }
        if (getFiscalYearSettingsId() != null) {
            _hashCode += getFiscalYearSettingsId().hashCode();
        }
        if (getIsForecastPeriod() != null) {
            _hashCode += getIsForecastPeriod().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getPeriodLabel() != null) {
            _hashCode += getPeriodLabel().hashCode();
        }
        if (getQuarterLabel() != null) {
            _hashCode += getQuarterLabel().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Period.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Period"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fiscalYearSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FiscalYearSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FiscalYearSettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fiscalYearSettingsId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FiscalYearSettingsId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isForecastPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsForecastPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PeriodLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quarterLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "QuarterLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Type"));
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

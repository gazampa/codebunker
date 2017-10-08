/**
 * FiscalYearSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class FiscalYearSettings  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String description;

    private java.util.Date endDate;

    private java.lang.Boolean isStandardYear;

    private java.lang.String name;

    private java.lang.String periodId;

    private java.lang.String periodLabelScheme;

    private java.lang.String periodPrefix;

    private com.sforce.soap.enterprise.QueryResult periods;

    private java.lang.String quarterLabelScheme;

    private java.lang.String quarterPrefix;

    private java.util.Date startDate;

    private java.util.Calendar systemModstamp;

    private java.lang.String weekLabelScheme;

    private java.lang.Integer weekStartDay;

    private java.lang.String yearType;

    public FiscalYearSettings() {
    }

    public FiscalYearSettings(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String description,
           java.util.Date endDate,
           java.lang.Boolean isStandardYear,
           java.lang.String name,
           java.lang.String periodId,
           java.lang.String periodLabelScheme,
           java.lang.String periodPrefix,
           com.sforce.soap.enterprise.QueryResult periods,
           java.lang.String quarterLabelScheme,
           java.lang.String quarterPrefix,
           java.util.Date startDate,
           java.util.Calendar systemModstamp,
           java.lang.String weekLabelScheme,
           java.lang.Integer weekStartDay,
           java.lang.String yearType) {
        super(
            fieldsToNull,
            id);
        this.description = description;
        this.endDate = endDate;
        this.isStandardYear = isStandardYear;
        this.name = name;
        this.periodId = periodId;
        this.periodLabelScheme = periodLabelScheme;
        this.periodPrefix = periodPrefix;
        this.periods = periods;
        this.quarterLabelScheme = quarterLabelScheme;
        this.quarterPrefix = quarterPrefix;
        this.startDate = startDate;
        this.systemModstamp = systemModstamp;
        this.weekLabelScheme = weekLabelScheme;
        this.weekStartDay = weekStartDay;
        this.yearType = yearType;
    }


    /**
     * Gets the description value for this FiscalYearSettings.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this FiscalYearSettings.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the endDate value for this FiscalYearSettings.
     * 
     * @return endDate
     */
    public java.util.Date getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this FiscalYearSettings.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the isStandardYear value for this FiscalYearSettings.
     * 
     * @return isStandardYear
     */
    public java.lang.Boolean getIsStandardYear() {
        return isStandardYear;
    }


    /**
     * Sets the isStandardYear value for this FiscalYearSettings.
     * 
     * @param isStandardYear
     */
    public void setIsStandardYear(java.lang.Boolean isStandardYear) {
        this.isStandardYear = isStandardYear;
    }


    /**
     * Gets the name value for this FiscalYearSettings.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this FiscalYearSettings.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the periodId value for this FiscalYearSettings.
     * 
     * @return periodId
     */
    public java.lang.String getPeriodId() {
        return periodId;
    }


    /**
     * Sets the periodId value for this FiscalYearSettings.
     * 
     * @param periodId
     */
    public void setPeriodId(java.lang.String periodId) {
        this.periodId = periodId;
    }


    /**
     * Gets the periodLabelScheme value for this FiscalYearSettings.
     * 
     * @return periodLabelScheme
     */
    public java.lang.String getPeriodLabelScheme() {
        return periodLabelScheme;
    }


    /**
     * Sets the periodLabelScheme value for this FiscalYearSettings.
     * 
     * @param periodLabelScheme
     */
    public void setPeriodLabelScheme(java.lang.String periodLabelScheme) {
        this.periodLabelScheme = periodLabelScheme;
    }


    /**
     * Gets the periodPrefix value for this FiscalYearSettings.
     * 
     * @return periodPrefix
     */
    public java.lang.String getPeriodPrefix() {
        return periodPrefix;
    }


    /**
     * Sets the periodPrefix value for this FiscalYearSettings.
     * 
     * @param periodPrefix
     */
    public void setPeriodPrefix(java.lang.String periodPrefix) {
        this.periodPrefix = periodPrefix;
    }


    /**
     * Gets the periods value for this FiscalYearSettings.
     * 
     * @return periods
     */
    public com.sforce.soap.enterprise.QueryResult getPeriods() {
        return periods;
    }


    /**
     * Sets the periods value for this FiscalYearSettings.
     * 
     * @param periods
     */
    public void setPeriods(com.sforce.soap.enterprise.QueryResult periods) {
        this.periods = periods;
    }


    /**
     * Gets the quarterLabelScheme value for this FiscalYearSettings.
     * 
     * @return quarterLabelScheme
     */
    public java.lang.String getQuarterLabelScheme() {
        return quarterLabelScheme;
    }


    /**
     * Sets the quarterLabelScheme value for this FiscalYearSettings.
     * 
     * @param quarterLabelScheme
     */
    public void setQuarterLabelScheme(java.lang.String quarterLabelScheme) {
        this.quarterLabelScheme = quarterLabelScheme;
    }


    /**
     * Gets the quarterPrefix value for this FiscalYearSettings.
     * 
     * @return quarterPrefix
     */
    public java.lang.String getQuarterPrefix() {
        return quarterPrefix;
    }


    /**
     * Sets the quarterPrefix value for this FiscalYearSettings.
     * 
     * @param quarterPrefix
     */
    public void setQuarterPrefix(java.lang.String quarterPrefix) {
        this.quarterPrefix = quarterPrefix;
    }


    /**
     * Gets the startDate value for this FiscalYearSettings.
     * 
     * @return startDate
     */
    public java.util.Date getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this FiscalYearSettings.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the systemModstamp value for this FiscalYearSettings.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this FiscalYearSettings.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the weekLabelScheme value for this FiscalYearSettings.
     * 
     * @return weekLabelScheme
     */
    public java.lang.String getWeekLabelScheme() {
        return weekLabelScheme;
    }


    /**
     * Sets the weekLabelScheme value for this FiscalYearSettings.
     * 
     * @param weekLabelScheme
     */
    public void setWeekLabelScheme(java.lang.String weekLabelScheme) {
        this.weekLabelScheme = weekLabelScheme;
    }


    /**
     * Gets the weekStartDay value for this FiscalYearSettings.
     * 
     * @return weekStartDay
     */
    public java.lang.Integer getWeekStartDay() {
        return weekStartDay;
    }


    /**
     * Sets the weekStartDay value for this FiscalYearSettings.
     * 
     * @param weekStartDay
     */
    public void setWeekStartDay(java.lang.Integer weekStartDay) {
        this.weekStartDay = weekStartDay;
    }


    /**
     * Gets the yearType value for this FiscalYearSettings.
     * 
     * @return yearType
     */
    public java.lang.String getYearType() {
        return yearType;
    }


    /**
     * Sets the yearType value for this FiscalYearSettings.
     * 
     * @param yearType
     */
    public void setYearType(java.lang.String yearType) {
        this.yearType = yearType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FiscalYearSettings)) return false;
        FiscalYearSettings other = (FiscalYearSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.isStandardYear==null && other.getIsStandardYear()==null) || 
             (this.isStandardYear!=null &&
              this.isStandardYear.equals(other.getIsStandardYear()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.periodId==null && other.getPeriodId()==null) || 
             (this.periodId!=null &&
              this.periodId.equals(other.getPeriodId()))) &&
            ((this.periodLabelScheme==null && other.getPeriodLabelScheme()==null) || 
             (this.periodLabelScheme!=null &&
              this.periodLabelScheme.equals(other.getPeriodLabelScheme()))) &&
            ((this.periodPrefix==null && other.getPeriodPrefix()==null) || 
             (this.periodPrefix!=null &&
              this.periodPrefix.equals(other.getPeriodPrefix()))) &&
            ((this.periods==null && other.getPeriods()==null) || 
             (this.periods!=null &&
              this.periods.equals(other.getPeriods()))) &&
            ((this.quarterLabelScheme==null && other.getQuarterLabelScheme()==null) || 
             (this.quarterLabelScheme!=null &&
              this.quarterLabelScheme.equals(other.getQuarterLabelScheme()))) &&
            ((this.quarterPrefix==null && other.getQuarterPrefix()==null) || 
             (this.quarterPrefix!=null &&
              this.quarterPrefix.equals(other.getQuarterPrefix()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.weekLabelScheme==null && other.getWeekLabelScheme()==null) || 
             (this.weekLabelScheme!=null &&
              this.weekLabelScheme.equals(other.getWeekLabelScheme()))) &&
            ((this.weekStartDay==null && other.getWeekStartDay()==null) || 
             (this.weekStartDay!=null &&
              this.weekStartDay.equals(other.getWeekStartDay()))) &&
            ((this.yearType==null && other.getYearType()==null) || 
             (this.yearType!=null &&
              this.yearType.equals(other.getYearType())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getIsStandardYear() != null) {
            _hashCode += getIsStandardYear().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPeriodId() != null) {
            _hashCode += getPeriodId().hashCode();
        }
        if (getPeriodLabelScheme() != null) {
            _hashCode += getPeriodLabelScheme().hashCode();
        }
        if (getPeriodPrefix() != null) {
            _hashCode += getPeriodPrefix().hashCode();
        }
        if (getPeriods() != null) {
            _hashCode += getPeriods().hashCode();
        }
        if (getQuarterLabelScheme() != null) {
            _hashCode += getQuarterLabelScheme().hashCode();
        }
        if (getQuarterPrefix() != null) {
            _hashCode += getQuarterPrefix().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getWeekLabelScheme() != null) {
            _hashCode += getWeekLabelScheme().hashCode();
        }
        if (getWeekStartDay() != null) {
            _hashCode += getWeekStartDay().hashCode();
        }
        if (getYearType() != null) {
            _hashCode += getYearType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FiscalYearSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FiscalYearSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isStandardYear");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsStandardYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("periodId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PeriodId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodLabelScheme");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PeriodLabelScheme"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PeriodPrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periods");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Periods"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quarterLabelScheme");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "QuarterLabelScheme"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quarterPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "QuarterPrefix"));
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
        elemField.setFieldName("weekLabelScheme");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "WeekLabelScheme"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weekStartDay");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "WeekStartDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yearType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "YearType"));
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

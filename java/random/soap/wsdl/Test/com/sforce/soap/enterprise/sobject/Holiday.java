/**
 * Holiday.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Holiday  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.util.Date activityDate;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String description;

    private java.lang.Integer endTimeInMinutes;

    private java.lang.Boolean isAllDay;

    private java.lang.Boolean isRecurrence;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String name;

    private java.lang.Integer recurrenceDayOfMonth;

    private java.lang.Integer recurrenceDayOfWeekMask;

    private java.util.Date recurrenceEndDateOnly;

    private java.lang.String recurrenceInstance;

    private java.lang.Integer recurrenceInterval;

    private java.lang.String recurrenceMonthOfYear;

    private java.util.Date recurrenceStartDate;

    private java.lang.String recurrenceType;

    private java.lang.Integer startTimeInMinutes;

    private java.util.Calendar systemModstamp;

    public Holiday() {
    }

    public Holiday(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.util.Date activityDate,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String description,
           java.lang.Integer endTimeInMinutes,
           java.lang.Boolean isAllDay,
           java.lang.Boolean isRecurrence,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String name,
           java.lang.Integer recurrenceDayOfMonth,
           java.lang.Integer recurrenceDayOfWeekMask,
           java.util.Date recurrenceEndDateOnly,
           java.lang.String recurrenceInstance,
           java.lang.Integer recurrenceInterval,
           java.lang.String recurrenceMonthOfYear,
           java.util.Date recurrenceStartDate,
           java.lang.String recurrenceType,
           java.lang.Integer startTimeInMinutes,
           java.util.Calendar systemModstamp) {
        super(
            fieldsToNull,
            id);
        this.activityDate = activityDate;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.description = description;
        this.endTimeInMinutes = endTimeInMinutes;
        this.isAllDay = isAllDay;
        this.isRecurrence = isRecurrence;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.name = name;
        this.recurrenceDayOfMonth = recurrenceDayOfMonth;
        this.recurrenceDayOfWeekMask = recurrenceDayOfWeekMask;
        this.recurrenceEndDateOnly = recurrenceEndDateOnly;
        this.recurrenceInstance = recurrenceInstance;
        this.recurrenceInterval = recurrenceInterval;
        this.recurrenceMonthOfYear = recurrenceMonthOfYear;
        this.recurrenceStartDate = recurrenceStartDate;
        this.recurrenceType = recurrenceType;
        this.startTimeInMinutes = startTimeInMinutes;
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the activityDate value for this Holiday.
     * 
     * @return activityDate
     */
    public java.util.Date getActivityDate() {
        return activityDate;
    }


    /**
     * Sets the activityDate value for this Holiday.
     * 
     * @param activityDate
     */
    public void setActivityDate(java.util.Date activityDate) {
        this.activityDate = activityDate;
    }


    /**
     * Gets the createdBy value for this Holiday.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Holiday.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Holiday.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Holiday.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Holiday.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Holiday.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the description value for this Holiday.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Holiday.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the endTimeInMinutes value for this Holiday.
     * 
     * @return endTimeInMinutes
     */
    public java.lang.Integer getEndTimeInMinutes() {
        return endTimeInMinutes;
    }


    /**
     * Sets the endTimeInMinutes value for this Holiday.
     * 
     * @param endTimeInMinutes
     */
    public void setEndTimeInMinutes(java.lang.Integer endTimeInMinutes) {
        this.endTimeInMinutes = endTimeInMinutes;
    }


    /**
     * Gets the isAllDay value for this Holiday.
     * 
     * @return isAllDay
     */
    public java.lang.Boolean getIsAllDay() {
        return isAllDay;
    }


    /**
     * Sets the isAllDay value for this Holiday.
     * 
     * @param isAllDay
     */
    public void setIsAllDay(java.lang.Boolean isAllDay) {
        this.isAllDay = isAllDay;
    }


    /**
     * Gets the isRecurrence value for this Holiday.
     * 
     * @return isRecurrence
     */
    public java.lang.Boolean getIsRecurrence() {
        return isRecurrence;
    }


    /**
     * Sets the isRecurrence value for this Holiday.
     * 
     * @param isRecurrence
     */
    public void setIsRecurrence(java.lang.Boolean isRecurrence) {
        this.isRecurrence = isRecurrence;
    }


    /**
     * Gets the lastModifiedBy value for this Holiday.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Holiday.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Holiday.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Holiday.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Holiday.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Holiday.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this Holiday.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Holiday.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the recurrenceDayOfMonth value for this Holiday.
     * 
     * @return recurrenceDayOfMonth
     */
    public java.lang.Integer getRecurrenceDayOfMonth() {
        return recurrenceDayOfMonth;
    }


    /**
     * Sets the recurrenceDayOfMonth value for this Holiday.
     * 
     * @param recurrenceDayOfMonth
     */
    public void setRecurrenceDayOfMonth(java.lang.Integer recurrenceDayOfMonth) {
        this.recurrenceDayOfMonth = recurrenceDayOfMonth;
    }


    /**
     * Gets the recurrenceDayOfWeekMask value for this Holiday.
     * 
     * @return recurrenceDayOfWeekMask
     */
    public java.lang.Integer getRecurrenceDayOfWeekMask() {
        return recurrenceDayOfWeekMask;
    }


    /**
     * Sets the recurrenceDayOfWeekMask value for this Holiday.
     * 
     * @param recurrenceDayOfWeekMask
     */
    public void setRecurrenceDayOfWeekMask(java.lang.Integer recurrenceDayOfWeekMask) {
        this.recurrenceDayOfWeekMask = recurrenceDayOfWeekMask;
    }


    /**
     * Gets the recurrenceEndDateOnly value for this Holiday.
     * 
     * @return recurrenceEndDateOnly
     */
    public java.util.Date getRecurrenceEndDateOnly() {
        return recurrenceEndDateOnly;
    }


    /**
     * Sets the recurrenceEndDateOnly value for this Holiday.
     * 
     * @param recurrenceEndDateOnly
     */
    public void setRecurrenceEndDateOnly(java.util.Date recurrenceEndDateOnly) {
        this.recurrenceEndDateOnly = recurrenceEndDateOnly;
    }


    /**
     * Gets the recurrenceInstance value for this Holiday.
     * 
     * @return recurrenceInstance
     */
    public java.lang.String getRecurrenceInstance() {
        return recurrenceInstance;
    }


    /**
     * Sets the recurrenceInstance value for this Holiday.
     * 
     * @param recurrenceInstance
     */
    public void setRecurrenceInstance(java.lang.String recurrenceInstance) {
        this.recurrenceInstance = recurrenceInstance;
    }


    /**
     * Gets the recurrenceInterval value for this Holiday.
     * 
     * @return recurrenceInterval
     */
    public java.lang.Integer getRecurrenceInterval() {
        return recurrenceInterval;
    }


    /**
     * Sets the recurrenceInterval value for this Holiday.
     * 
     * @param recurrenceInterval
     */
    public void setRecurrenceInterval(java.lang.Integer recurrenceInterval) {
        this.recurrenceInterval = recurrenceInterval;
    }


    /**
     * Gets the recurrenceMonthOfYear value for this Holiday.
     * 
     * @return recurrenceMonthOfYear
     */
    public java.lang.String getRecurrenceMonthOfYear() {
        return recurrenceMonthOfYear;
    }


    /**
     * Sets the recurrenceMonthOfYear value for this Holiday.
     * 
     * @param recurrenceMonthOfYear
     */
    public void setRecurrenceMonthOfYear(java.lang.String recurrenceMonthOfYear) {
        this.recurrenceMonthOfYear = recurrenceMonthOfYear;
    }


    /**
     * Gets the recurrenceStartDate value for this Holiday.
     * 
     * @return recurrenceStartDate
     */
    public java.util.Date getRecurrenceStartDate() {
        return recurrenceStartDate;
    }


    /**
     * Sets the recurrenceStartDate value for this Holiday.
     * 
     * @param recurrenceStartDate
     */
    public void setRecurrenceStartDate(java.util.Date recurrenceStartDate) {
        this.recurrenceStartDate = recurrenceStartDate;
    }


    /**
     * Gets the recurrenceType value for this Holiday.
     * 
     * @return recurrenceType
     */
    public java.lang.String getRecurrenceType() {
        return recurrenceType;
    }


    /**
     * Sets the recurrenceType value for this Holiday.
     * 
     * @param recurrenceType
     */
    public void setRecurrenceType(java.lang.String recurrenceType) {
        this.recurrenceType = recurrenceType;
    }


    /**
     * Gets the startTimeInMinutes value for this Holiday.
     * 
     * @return startTimeInMinutes
     */
    public java.lang.Integer getStartTimeInMinutes() {
        return startTimeInMinutes;
    }


    /**
     * Sets the startTimeInMinutes value for this Holiday.
     * 
     * @param startTimeInMinutes
     */
    public void setStartTimeInMinutes(java.lang.Integer startTimeInMinutes) {
        this.startTimeInMinutes = startTimeInMinutes;
    }


    /**
     * Gets the systemModstamp value for this Holiday.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Holiday.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Holiday)) return false;
        Holiday other = (Holiday) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.activityDate==null && other.getActivityDate()==null) || 
             (this.activityDate!=null &&
              this.activityDate.equals(other.getActivityDate()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.endTimeInMinutes==null && other.getEndTimeInMinutes()==null) || 
             (this.endTimeInMinutes!=null &&
              this.endTimeInMinutes.equals(other.getEndTimeInMinutes()))) &&
            ((this.isAllDay==null && other.getIsAllDay()==null) || 
             (this.isAllDay!=null &&
              this.isAllDay.equals(other.getIsAllDay()))) &&
            ((this.isRecurrence==null && other.getIsRecurrence()==null) || 
             (this.isRecurrence!=null &&
              this.isRecurrence.equals(other.getIsRecurrence()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.recurrenceDayOfMonth==null && other.getRecurrenceDayOfMonth()==null) || 
             (this.recurrenceDayOfMonth!=null &&
              this.recurrenceDayOfMonth.equals(other.getRecurrenceDayOfMonth()))) &&
            ((this.recurrenceDayOfWeekMask==null && other.getRecurrenceDayOfWeekMask()==null) || 
             (this.recurrenceDayOfWeekMask!=null &&
              this.recurrenceDayOfWeekMask.equals(other.getRecurrenceDayOfWeekMask()))) &&
            ((this.recurrenceEndDateOnly==null && other.getRecurrenceEndDateOnly()==null) || 
             (this.recurrenceEndDateOnly!=null &&
              this.recurrenceEndDateOnly.equals(other.getRecurrenceEndDateOnly()))) &&
            ((this.recurrenceInstance==null && other.getRecurrenceInstance()==null) || 
             (this.recurrenceInstance!=null &&
              this.recurrenceInstance.equals(other.getRecurrenceInstance()))) &&
            ((this.recurrenceInterval==null && other.getRecurrenceInterval()==null) || 
             (this.recurrenceInterval!=null &&
              this.recurrenceInterval.equals(other.getRecurrenceInterval()))) &&
            ((this.recurrenceMonthOfYear==null && other.getRecurrenceMonthOfYear()==null) || 
             (this.recurrenceMonthOfYear!=null &&
              this.recurrenceMonthOfYear.equals(other.getRecurrenceMonthOfYear()))) &&
            ((this.recurrenceStartDate==null && other.getRecurrenceStartDate()==null) || 
             (this.recurrenceStartDate!=null &&
              this.recurrenceStartDate.equals(other.getRecurrenceStartDate()))) &&
            ((this.recurrenceType==null && other.getRecurrenceType()==null) || 
             (this.recurrenceType!=null &&
              this.recurrenceType.equals(other.getRecurrenceType()))) &&
            ((this.startTimeInMinutes==null && other.getStartTimeInMinutes()==null) || 
             (this.startTimeInMinutes!=null &&
              this.startTimeInMinutes.equals(other.getStartTimeInMinutes()))) &&
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
        if (getActivityDate() != null) {
            _hashCode += getActivityDate().hashCode();
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEndTimeInMinutes() != null) {
            _hashCode += getEndTimeInMinutes().hashCode();
        }
        if (getIsAllDay() != null) {
            _hashCode += getIsAllDay().hashCode();
        }
        if (getIsRecurrence() != null) {
            _hashCode += getIsRecurrence().hashCode();
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRecurrenceDayOfMonth() != null) {
            _hashCode += getRecurrenceDayOfMonth().hashCode();
        }
        if (getRecurrenceDayOfWeekMask() != null) {
            _hashCode += getRecurrenceDayOfWeekMask().hashCode();
        }
        if (getRecurrenceEndDateOnly() != null) {
            _hashCode += getRecurrenceEndDateOnly().hashCode();
        }
        if (getRecurrenceInstance() != null) {
            _hashCode += getRecurrenceInstance().hashCode();
        }
        if (getRecurrenceInterval() != null) {
            _hashCode += getRecurrenceInterval().hashCode();
        }
        if (getRecurrenceMonthOfYear() != null) {
            _hashCode += getRecurrenceMonthOfYear().hashCode();
        }
        if (getRecurrenceStartDate() != null) {
            _hashCode += getRecurrenceStartDate().hashCode();
        }
        if (getRecurrenceType() != null) {
            _hashCode += getRecurrenceType().hashCode();
        }
        if (getStartTimeInMinutes() != null) {
            _hashCode += getStartTimeInMinutes().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Holiday.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Holiday"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActivityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTimeInMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EndTimeInMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAllDay");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsAllDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRecurrence");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsRecurrence"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceDayOfMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecurrenceDayOfMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceDayOfWeekMask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecurrenceDayOfWeekMask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceEndDateOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecurrenceEndDateOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceInstance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecurrenceInstance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecurrenceInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceMonthOfYear");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecurrenceMonthOfYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecurrenceStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecurrenceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTimeInMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "StartTimeInMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

/**
 * BusinessHours.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class BusinessHours  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult cases;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private org.apache.axis.types.Time fridayEndTime;

    private org.apache.axis.types.Time fridayStartTime;

    private java.lang.Boolean isActive;

    private java.lang.Boolean isDefault;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private org.apache.axis.types.Time mondayEndTime;

    private org.apache.axis.types.Time mondayStartTime;

    private java.lang.String name;

    private org.apache.axis.types.Time saturdayEndTime;

    private org.apache.axis.types.Time saturdayStartTime;

    private org.apache.axis.types.Time sundayEndTime;

    private org.apache.axis.types.Time sundayStartTime;

    private java.util.Calendar systemModstamp;

    private org.apache.axis.types.Time thursdayEndTime;

    private org.apache.axis.types.Time thursdayStartTime;

    private java.lang.String timeZoneSidKey;

    private org.apache.axis.types.Time tuesdayEndTime;

    private org.apache.axis.types.Time tuesdayStartTime;

    private org.apache.axis.types.Time wednesdayEndTime;

    private org.apache.axis.types.Time wednesdayStartTime;

    public BusinessHours() {
    }

    public BusinessHours(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult cases,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           org.apache.axis.types.Time fridayEndTime,
           org.apache.axis.types.Time fridayStartTime,
           java.lang.Boolean isActive,
           java.lang.Boolean isDefault,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           org.apache.axis.types.Time mondayEndTime,
           org.apache.axis.types.Time mondayStartTime,
           java.lang.String name,
           org.apache.axis.types.Time saturdayEndTime,
           org.apache.axis.types.Time saturdayStartTime,
           org.apache.axis.types.Time sundayEndTime,
           org.apache.axis.types.Time sundayStartTime,
           java.util.Calendar systemModstamp,
           org.apache.axis.types.Time thursdayEndTime,
           org.apache.axis.types.Time thursdayStartTime,
           java.lang.String timeZoneSidKey,
           org.apache.axis.types.Time tuesdayEndTime,
           org.apache.axis.types.Time tuesdayStartTime,
           org.apache.axis.types.Time wednesdayEndTime,
           org.apache.axis.types.Time wednesdayStartTime) {
        super(
            fieldsToNull,
            id);
        this.cases = cases;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.fridayEndTime = fridayEndTime;
        this.fridayStartTime = fridayStartTime;
        this.isActive = isActive;
        this.isDefault = isDefault;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.mondayEndTime = mondayEndTime;
        this.mondayStartTime = mondayStartTime;
        this.name = name;
        this.saturdayEndTime = saturdayEndTime;
        this.saturdayStartTime = saturdayStartTime;
        this.sundayEndTime = sundayEndTime;
        this.sundayStartTime = sundayStartTime;
        this.systemModstamp = systemModstamp;
        this.thursdayEndTime = thursdayEndTime;
        this.thursdayStartTime = thursdayStartTime;
        this.timeZoneSidKey = timeZoneSidKey;
        this.tuesdayEndTime = tuesdayEndTime;
        this.tuesdayStartTime = tuesdayStartTime;
        this.wednesdayEndTime = wednesdayEndTime;
        this.wednesdayStartTime = wednesdayStartTime;
    }


    /**
     * Gets the cases value for this BusinessHours.
     * 
     * @return cases
     */
    public com.sforce.soap.enterprise.QueryResult getCases() {
        return cases;
    }


    /**
     * Sets the cases value for this BusinessHours.
     * 
     * @param cases
     */
    public void setCases(com.sforce.soap.enterprise.QueryResult cases) {
        this.cases = cases;
    }


    /**
     * Gets the createdBy value for this BusinessHours.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this BusinessHours.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this BusinessHours.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this BusinessHours.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this BusinessHours.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this BusinessHours.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the fridayEndTime value for this BusinessHours.
     * 
     * @return fridayEndTime
     */
    public org.apache.axis.types.Time getFridayEndTime() {
        return fridayEndTime;
    }


    /**
     * Sets the fridayEndTime value for this BusinessHours.
     * 
     * @param fridayEndTime
     */
    public void setFridayEndTime(org.apache.axis.types.Time fridayEndTime) {
        this.fridayEndTime = fridayEndTime;
    }


    /**
     * Gets the fridayStartTime value for this BusinessHours.
     * 
     * @return fridayStartTime
     */
    public org.apache.axis.types.Time getFridayStartTime() {
        return fridayStartTime;
    }


    /**
     * Sets the fridayStartTime value for this BusinessHours.
     * 
     * @param fridayStartTime
     */
    public void setFridayStartTime(org.apache.axis.types.Time fridayStartTime) {
        this.fridayStartTime = fridayStartTime;
    }


    /**
     * Gets the isActive value for this BusinessHours.
     * 
     * @return isActive
     */
    public java.lang.Boolean getIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this BusinessHours.
     * 
     * @param isActive
     */
    public void setIsActive(java.lang.Boolean isActive) {
        this.isActive = isActive;
    }


    /**
     * Gets the isDefault value for this BusinessHours.
     * 
     * @return isDefault
     */
    public java.lang.Boolean getIsDefault() {
        return isDefault;
    }


    /**
     * Sets the isDefault value for this BusinessHours.
     * 
     * @param isDefault
     */
    public void setIsDefault(java.lang.Boolean isDefault) {
        this.isDefault = isDefault;
    }


    /**
     * Gets the lastModifiedBy value for this BusinessHours.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this BusinessHours.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this BusinessHours.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this BusinessHours.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this BusinessHours.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this BusinessHours.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the mondayEndTime value for this BusinessHours.
     * 
     * @return mondayEndTime
     */
    public org.apache.axis.types.Time getMondayEndTime() {
        return mondayEndTime;
    }


    /**
     * Sets the mondayEndTime value for this BusinessHours.
     * 
     * @param mondayEndTime
     */
    public void setMondayEndTime(org.apache.axis.types.Time mondayEndTime) {
        this.mondayEndTime = mondayEndTime;
    }


    /**
     * Gets the mondayStartTime value for this BusinessHours.
     * 
     * @return mondayStartTime
     */
    public org.apache.axis.types.Time getMondayStartTime() {
        return mondayStartTime;
    }


    /**
     * Sets the mondayStartTime value for this BusinessHours.
     * 
     * @param mondayStartTime
     */
    public void setMondayStartTime(org.apache.axis.types.Time mondayStartTime) {
        this.mondayStartTime = mondayStartTime;
    }


    /**
     * Gets the name value for this BusinessHours.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this BusinessHours.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the saturdayEndTime value for this BusinessHours.
     * 
     * @return saturdayEndTime
     */
    public org.apache.axis.types.Time getSaturdayEndTime() {
        return saturdayEndTime;
    }


    /**
     * Sets the saturdayEndTime value for this BusinessHours.
     * 
     * @param saturdayEndTime
     */
    public void setSaturdayEndTime(org.apache.axis.types.Time saturdayEndTime) {
        this.saturdayEndTime = saturdayEndTime;
    }


    /**
     * Gets the saturdayStartTime value for this BusinessHours.
     * 
     * @return saturdayStartTime
     */
    public org.apache.axis.types.Time getSaturdayStartTime() {
        return saturdayStartTime;
    }


    /**
     * Sets the saturdayStartTime value for this BusinessHours.
     * 
     * @param saturdayStartTime
     */
    public void setSaturdayStartTime(org.apache.axis.types.Time saturdayStartTime) {
        this.saturdayStartTime = saturdayStartTime;
    }


    /**
     * Gets the sundayEndTime value for this BusinessHours.
     * 
     * @return sundayEndTime
     */
    public org.apache.axis.types.Time getSundayEndTime() {
        return sundayEndTime;
    }


    /**
     * Sets the sundayEndTime value for this BusinessHours.
     * 
     * @param sundayEndTime
     */
    public void setSundayEndTime(org.apache.axis.types.Time sundayEndTime) {
        this.sundayEndTime = sundayEndTime;
    }


    /**
     * Gets the sundayStartTime value for this BusinessHours.
     * 
     * @return sundayStartTime
     */
    public org.apache.axis.types.Time getSundayStartTime() {
        return sundayStartTime;
    }


    /**
     * Sets the sundayStartTime value for this BusinessHours.
     * 
     * @param sundayStartTime
     */
    public void setSundayStartTime(org.apache.axis.types.Time sundayStartTime) {
        this.sundayStartTime = sundayStartTime;
    }


    /**
     * Gets the systemModstamp value for this BusinessHours.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this BusinessHours.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the thursdayEndTime value for this BusinessHours.
     * 
     * @return thursdayEndTime
     */
    public org.apache.axis.types.Time getThursdayEndTime() {
        return thursdayEndTime;
    }


    /**
     * Sets the thursdayEndTime value for this BusinessHours.
     * 
     * @param thursdayEndTime
     */
    public void setThursdayEndTime(org.apache.axis.types.Time thursdayEndTime) {
        this.thursdayEndTime = thursdayEndTime;
    }


    /**
     * Gets the thursdayStartTime value for this BusinessHours.
     * 
     * @return thursdayStartTime
     */
    public org.apache.axis.types.Time getThursdayStartTime() {
        return thursdayStartTime;
    }


    /**
     * Sets the thursdayStartTime value for this BusinessHours.
     * 
     * @param thursdayStartTime
     */
    public void setThursdayStartTime(org.apache.axis.types.Time thursdayStartTime) {
        this.thursdayStartTime = thursdayStartTime;
    }


    /**
     * Gets the timeZoneSidKey value for this BusinessHours.
     * 
     * @return timeZoneSidKey
     */
    public java.lang.String getTimeZoneSidKey() {
        return timeZoneSidKey;
    }


    /**
     * Sets the timeZoneSidKey value for this BusinessHours.
     * 
     * @param timeZoneSidKey
     */
    public void setTimeZoneSidKey(java.lang.String timeZoneSidKey) {
        this.timeZoneSidKey = timeZoneSidKey;
    }


    /**
     * Gets the tuesdayEndTime value for this BusinessHours.
     * 
     * @return tuesdayEndTime
     */
    public org.apache.axis.types.Time getTuesdayEndTime() {
        return tuesdayEndTime;
    }


    /**
     * Sets the tuesdayEndTime value for this BusinessHours.
     * 
     * @param tuesdayEndTime
     */
    public void setTuesdayEndTime(org.apache.axis.types.Time tuesdayEndTime) {
        this.tuesdayEndTime = tuesdayEndTime;
    }


    /**
     * Gets the tuesdayStartTime value for this BusinessHours.
     * 
     * @return tuesdayStartTime
     */
    public org.apache.axis.types.Time getTuesdayStartTime() {
        return tuesdayStartTime;
    }


    /**
     * Sets the tuesdayStartTime value for this BusinessHours.
     * 
     * @param tuesdayStartTime
     */
    public void setTuesdayStartTime(org.apache.axis.types.Time tuesdayStartTime) {
        this.tuesdayStartTime = tuesdayStartTime;
    }


    /**
     * Gets the wednesdayEndTime value for this BusinessHours.
     * 
     * @return wednesdayEndTime
     */
    public org.apache.axis.types.Time getWednesdayEndTime() {
        return wednesdayEndTime;
    }


    /**
     * Sets the wednesdayEndTime value for this BusinessHours.
     * 
     * @param wednesdayEndTime
     */
    public void setWednesdayEndTime(org.apache.axis.types.Time wednesdayEndTime) {
        this.wednesdayEndTime = wednesdayEndTime;
    }


    /**
     * Gets the wednesdayStartTime value for this BusinessHours.
     * 
     * @return wednesdayStartTime
     */
    public org.apache.axis.types.Time getWednesdayStartTime() {
        return wednesdayStartTime;
    }


    /**
     * Sets the wednesdayStartTime value for this BusinessHours.
     * 
     * @param wednesdayStartTime
     */
    public void setWednesdayStartTime(org.apache.axis.types.Time wednesdayStartTime) {
        this.wednesdayStartTime = wednesdayStartTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessHours)) return false;
        BusinessHours other = (BusinessHours) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cases==null && other.getCases()==null) || 
             (this.cases!=null &&
              this.cases.equals(other.getCases()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.fridayEndTime==null && other.getFridayEndTime()==null) || 
             (this.fridayEndTime!=null &&
              this.fridayEndTime.equals(other.getFridayEndTime()))) &&
            ((this.fridayStartTime==null && other.getFridayStartTime()==null) || 
             (this.fridayStartTime!=null &&
              this.fridayStartTime.equals(other.getFridayStartTime()))) &&
            ((this.isActive==null && other.getIsActive()==null) || 
             (this.isActive!=null &&
              this.isActive.equals(other.getIsActive()))) &&
            ((this.isDefault==null && other.getIsDefault()==null) || 
             (this.isDefault!=null &&
              this.isDefault.equals(other.getIsDefault()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.mondayEndTime==null && other.getMondayEndTime()==null) || 
             (this.mondayEndTime!=null &&
              this.mondayEndTime.equals(other.getMondayEndTime()))) &&
            ((this.mondayStartTime==null && other.getMondayStartTime()==null) || 
             (this.mondayStartTime!=null &&
              this.mondayStartTime.equals(other.getMondayStartTime()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.saturdayEndTime==null && other.getSaturdayEndTime()==null) || 
             (this.saturdayEndTime!=null &&
              this.saturdayEndTime.equals(other.getSaturdayEndTime()))) &&
            ((this.saturdayStartTime==null && other.getSaturdayStartTime()==null) || 
             (this.saturdayStartTime!=null &&
              this.saturdayStartTime.equals(other.getSaturdayStartTime()))) &&
            ((this.sundayEndTime==null && other.getSundayEndTime()==null) || 
             (this.sundayEndTime!=null &&
              this.sundayEndTime.equals(other.getSundayEndTime()))) &&
            ((this.sundayStartTime==null && other.getSundayStartTime()==null) || 
             (this.sundayStartTime!=null &&
              this.sundayStartTime.equals(other.getSundayStartTime()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.thursdayEndTime==null && other.getThursdayEndTime()==null) || 
             (this.thursdayEndTime!=null &&
              this.thursdayEndTime.equals(other.getThursdayEndTime()))) &&
            ((this.thursdayStartTime==null && other.getThursdayStartTime()==null) || 
             (this.thursdayStartTime!=null &&
              this.thursdayStartTime.equals(other.getThursdayStartTime()))) &&
            ((this.timeZoneSidKey==null && other.getTimeZoneSidKey()==null) || 
             (this.timeZoneSidKey!=null &&
              this.timeZoneSidKey.equals(other.getTimeZoneSidKey()))) &&
            ((this.tuesdayEndTime==null && other.getTuesdayEndTime()==null) || 
             (this.tuesdayEndTime!=null &&
              this.tuesdayEndTime.equals(other.getTuesdayEndTime()))) &&
            ((this.tuesdayStartTime==null && other.getTuesdayStartTime()==null) || 
             (this.tuesdayStartTime!=null &&
              this.tuesdayStartTime.equals(other.getTuesdayStartTime()))) &&
            ((this.wednesdayEndTime==null && other.getWednesdayEndTime()==null) || 
             (this.wednesdayEndTime!=null &&
              this.wednesdayEndTime.equals(other.getWednesdayEndTime()))) &&
            ((this.wednesdayStartTime==null && other.getWednesdayStartTime()==null) || 
             (this.wednesdayStartTime!=null &&
              this.wednesdayStartTime.equals(other.getWednesdayStartTime())));
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
        if (getCases() != null) {
            _hashCode += getCases().hashCode();
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
        if (getFridayEndTime() != null) {
            _hashCode += getFridayEndTime().hashCode();
        }
        if (getFridayStartTime() != null) {
            _hashCode += getFridayStartTime().hashCode();
        }
        if (getIsActive() != null) {
            _hashCode += getIsActive().hashCode();
        }
        if (getIsDefault() != null) {
            _hashCode += getIsDefault().hashCode();
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
        if (getMondayEndTime() != null) {
            _hashCode += getMondayEndTime().hashCode();
        }
        if (getMondayStartTime() != null) {
            _hashCode += getMondayStartTime().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSaturdayEndTime() != null) {
            _hashCode += getSaturdayEndTime().hashCode();
        }
        if (getSaturdayStartTime() != null) {
            _hashCode += getSaturdayStartTime().hashCode();
        }
        if (getSundayEndTime() != null) {
            _hashCode += getSundayEndTime().hashCode();
        }
        if (getSundayStartTime() != null) {
            _hashCode += getSundayStartTime().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getThursdayEndTime() != null) {
            _hashCode += getThursdayEndTime().hashCode();
        }
        if (getThursdayStartTime() != null) {
            _hashCode += getThursdayStartTime().hashCode();
        }
        if (getTimeZoneSidKey() != null) {
            _hashCode += getTimeZoneSidKey().hashCode();
        }
        if (getTuesdayEndTime() != null) {
            _hashCode += getTuesdayEndTime().hashCode();
        }
        if (getTuesdayStartTime() != null) {
            _hashCode += getTuesdayStartTime().hashCode();
        }
        if (getWednesdayEndTime() != null) {
            _hashCode += getWednesdayEndTime().hashCode();
        }
        if (getWednesdayStartTime() != null) {
            _hashCode += getWednesdayStartTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusinessHours.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BusinessHours"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cases");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Cases"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("fridayEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FridayEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fridayStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FridayStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isActive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDefault"));
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
        elemField.setFieldName("mondayEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MondayEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mondayStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MondayStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
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
        elemField.setFieldName("saturdayEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SaturdayEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saturdayStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SaturdayStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sundayEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SundayEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sundayStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SundayStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
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
        elemField.setFieldName("thursdayEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ThursdayEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thursdayStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ThursdayStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZoneSidKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TimeZoneSidKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tuesdayEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TuesdayEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tuesdayStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TuesdayStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wednesdayEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "WednesdayEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wednesdayStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "WednesdayStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
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

/**
 * Case_Settings__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Case_Settings__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.Boolean apply_Assignment_Rules_On_Insert__c;

    private java.lang.Boolean apply_Assignment_Rules_On_Update__c;

    private java.lang.String business_Hours_Name__c;

    private java.lang.Boolean calculate_SLA__c;

    private java.lang.Boolean create_Case_Comments__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.lang.Double follow_Up_Response_Time_In_Minutes__c;

    private java.lang.Boolean isDeleted;

    private java.lang.Boolean is_VisibleI_n_Self_Service__c;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String name;

    private java.lang.String owner_Name__c;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.String recordTypeId__c;

    private java.lang.Boolean SLA_Uses_Priority__c;

    private com.sforce.soap.enterprise.sobject.Name setupOwner;

    private java.lang.String setupOwnerId;

    private java.util.Calendar systemModstamp;

    private java.lang.Boolean is_CS_RecordType__c;

    public Case_Settings__c() {
    }

    public Case_Settings__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.Boolean apply_Assignment_Rules_On_Insert__c,
           java.lang.Boolean apply_Assignment_Rules_On_Update__c,
           java.lang.String business_Hours_Name__c,
           java.lang.Boolean calculate_SLA__c,
           java.lang.Boolean create_Case_Comments__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.lang.Double follow_Up_Response_Time_In_Minutes__c,
           java.lang.Boolean isDeleted,
           java.lang.Boolean is_VisibleI_n_Self_Service__c,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String name,
           java.lang.String owner_Name__c,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.String recordTypeId__c,
           java.lang.Boolean SLA_Uses_Priority__c,
           com.sforce.soap.enterprise.sobject.Name setupOwner,
           java.lang.String setupOwnerId,
           java.util.Calendar systemModstamp,
           java.lang.Boolean is_CS_RecordType__c) {
        super(
            fieldsToNull,
            id);
        this.apply_Assignment_Rules_On_Insert__c = apply_Assignment_Rules_On_Insert__c;
        this.apply_Assignment_Rules_On_Update__c = apply_Assignment_Rules_On_Update__c;
        this.business_Hours_Name__c = business_Hours_Name__c;
        this.calculate_SLA__c = calculate_SLA__c;
        this.create_Case_Comments__c = create_Case_Comments__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.follow_Up_Response_Time_In_Minutes__c = follow_Up_Response_Time_In_Minutes__c;
        this.isDeleted = isDeleted;
        this.is_VisibleI_n_Self_Service__c = is_VisibleI_n_Self_Service__c;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.name = name;
        this.owner_Name__c = owner_Name__c;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.recordTypeId__c = recordTypeId__c;
        this.SLA_Uses_Priority__c = SLA_Uses_Priority__c;
        this.setupOwner = setupOwner;
        this.setupOwnerId = setupOwnerId;
        this.systemModstamp = systemModstamp;
        this.is_CS_RecordType__c = is_CS_RecordType__c;
    }


    /**
     * Gets the apply_Assignment_Rules_On_Insert__c value for this Case_Settings__c.
     * 
     * @return apply_Assignment_Rules_On_Insert__c
     */
    public java.lang.Boolean getApply_Assignment_Rules_On_Insert__c() {
        return apply_Assignment_Rules_On_Insert__c;
    }


    /**
     * Sets the apply_Assignment_Rules_On_Insert__c value for this Case_Settings__c.
     * 
     * @param apply_Assignment_Rules_On_Insert__c
     */
    public void setApply_Assignment_Rules_On_Insert__c(java.lang.Boolean apply_Assignment_Rules_On_Insert__c) {
        this.apply_Assignment_Rules_On_Insert__c = apply_Assignment_Rules_On_Insert__c;
    }


    /**
     * Gets the apply_Assignment_Rules_On_Update__c value for this Case_Settings__c.
     * 
     * @return apply_Assignment_Rules_On_Update__c
     */
    public java.lang.Boolean getApply_Assignment_Rules_On_Update__c() {
        return apply_Assignment_Rules_On_Update__c;
    }


    /**
     * Sets the apply_Assignment_Rules_On_Update__c value for this Case_Settings__c.
     * 
     * @param apply_Assignment_Rules_On_Update__c
     */
    public void setApply_Assignment_Rules_On_Update__c(java.lang.Boolean apply_Assignment_Rules_On_Update__c) {
        this.apply_Assignment_Rules_On_Update__c = apply_Assignment_Rules_On_Update__c;
    }


    /**
     * Gets the business_Hours_Name__c value for this Case_Settings__c.
     * 
     * @return business_Hours_Name__c
     */
    public java.lang.String getBusiness_Hours_Name__c() {
        return business_Hours_Name__c;
    }


    /**
     * Sets the business_Hours_Name__c value for this Case_Settings__c.
     * 
     * @param business_Hours_Name__c
     */
    public void setBusiness_Hours_Name__c(java.lang.String business_Hours_Name__c) {
        this.business_Hours_Name__c = business_Hours_Name__c;
    }


    /**
     * Gets the calculate_SLA__c value for this Case_Settings__c.
     * 
     * @return calculate_SLA__c
     */
    public java.lang.Boolean getCalculate_SLA__c() {
        return calculate_SLA__c;
    }


    /**
     * Sets the calculate_SLA__c value for this Case_Settings__c.
     * 
     * @param calculate_SLA__c
     */
    public void setCalculate_SLA__c(java.lang.Boolean calculate_SLA__c) {
        this.calculate_SLA__c = calculate_SLA__c;
    }


    /**
     * Gets the create_Case_Comments__c value for this Case_Settings__c.
     * 
     * @return create_Case_Comments__c
     */
    public java.lang.Boolean getCreate_Case_Comments__c() {
        return create_Case_Comments__c;
    }


    /**
     * Sets the create_Case_Comments__c value for this Case_Settings__c.
     * 
     * @param create_Case_Comments__c
     */
    public void setCreate_Case_Comments__c(java.lang.Boolean create_Case_Comments__c) {
        this.create_Case_Comments__c = create_Case_Comments__c;
    }


    /**
     * Gets the createdBy value for this Case_Settings__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Case_Settings__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Case_Settings__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Case_Settings__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Case_Settings__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Case_Settings__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Case_Settings__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Case_Settings__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the follow_Up_Response_Time_In_Minutes__c value for this Case_Settings__c.
     * 
     * @return follow_Up_Response_Time_In_Minutes__c
     */
    public java.lang.Double getFollow_Up_Response_Time_In_Minutes__c() {
        return follow_Up_Response_Time_In_Minutes__c;
    }


    /**
     * Sets the follow_Up_Response_Time_In_Minutes__c value for this Case_Settings__c.
     * 
     * @param follow_Up_Response_Time_In_Minutes__c
     */
    public void setFollow_Up_Response_Time_In_Minutes__c(java.lang.Double follow_Up_Response_Time_In_Minutes__c) {
        this.follow_Up_Response_Time_In_Minutes__c = follow_Up_Response_Time_In_Minutes__c;
    }


    /**
     * Gets the isDeleted value for this Case_Settings__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Case_Settings__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the is_VisibleI_n_Self_Service__c value for this Case_Settings__c.
     * 
     * @return is_VisibleI_n_Self_Service__c
     */
    public java.lang.Boolean getIs_VisibleI_n_Self_Service__c() {
        return is_VisibleI_n_Self_Service__c;
    }


    /**
     * Sets the is_VisibleI_n_Self_Service__c value for this Case_Settings__c.
     * 
     * @param is_VisibleI_n_Self_Service__c
     */
    public void setIs_VisibleI_n_Self_Service__c(java.lang.Boolean is_VisibleI_n_Self_Service__c) {
        this.is_VisibleI_n_Self_Service__c = is_VisibleI_n_Self_Service__c;
    }


    /**
     * Gets the lastModifiedBy value for this Case_Settings__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Case_Settings__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Case_Settings__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Case_Settings__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Case_Settings__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Case_Settings__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this Case_Settings__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Case_Settings__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the owner_Name__c value for this Case_Settings__c.
     * 
     * @return owner_Name__c
     */
    public java.lang.String getOwner_Name__c() {
        return owner_Name__c;
    }


    /**
     * Sets the owner_Name__c value for this Case_Settings__c.
     * 
     * @param owner_Name__c
     */
    public void setOwner_Name__c(java.lang.String owner_Name__c) {
        this.owner_Name__c = owner_Name__c;
    }


    /**
     * Gets the processInstances value for this Case_Settings__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Case_Settings__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Case_Settings__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Case_Settings__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the recordTypeId__c value for this Case_Settings__c.
     * 
     * @return recordTypeId__c
     */
    public java.lang.String getRecordTypeId__c() {
        return recordTypeId__c;
    }


    /**
     * Sets the recordTypeId__c value for this Case_Settings__c.
     * 
     * @param recordTypeId__c
     */
    public void setRecordTypeId__c(java.lang.String recordTypeId__c) {
        this.recordTypeId__c = recordTypeId__c;
    }


    /**
     * Gets the SLA_Uses_Priority__c value for this Case_Settings__c.
     * 
     * @return SLA_Uses_Priority__c
     */
    public java.lang.Boolean getSLA_Uses_Priority__c() {
        return SLA_Uses_Priority__c;
    }


    /**
     * Sets the SLA_Uses_Priority__c value for this Case_Settings__c.
     * 
     * @param SLA_Uses_Priority__c
     */
    public void setSLA_Uses_Priority__c(java.lang.Boolean SLA_Uses_Priority__c) {
        this.SLA_Uses_Priority__c = SLA_Uses_Priority__c;
    }


    /**
     * Gets the setupOwner value for this Case_Settings__c.
     * 
     * @return setupOwner
     */
    public com.sforce.soap.enterprise.sobject.Name getSetupOwner() {
        return setupOwner;
    }


    /**
     * Sets the setupOwner value for this Case_Settings__c.
     * 
     * @param setupOwner
     */
    public void setSetupOwner(com.sforce.soap.enterprise.sobject.Name setupOwner) {
        this.setupOwner = setupOwner;
    }


    /**
     * Gets the setupOwnerId value for this Case_Settings__c.
     * 
     * @return setupOwnerId
     */
    public java.lang.String getSetupOwnerId() {
        return setupOwnerId;
    }


    /**
     * Sets the setupOwnerId value for this Case_Settings__c.
     * 
     * @param setupOwnerId
     */
    public void setSetupOwnerId(java.lang.String setupOwnerId) {
        this.setupOwnerId = setupOwnerId;
    }


    /**
     * Gets the systemModstamp value for this Case_Settings__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Case_Settings__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the is_CS_RecordType__c value for this Case_Settings__c.
     * 
     * @return is_CS_RecordType__c
     */
    public java.lang.Boolean getIs_CS_RecordType__c() {
        return is_CS_RecordType__c;
    }


    /**
     * Sets the is_CS_RecordType__c value for this Case_Settings__c.
     * 
     * @param is_CS_RecordType__c
     */
    public void setIs_CS_RecordType__c(java.lang.Boolean is_CS_RecordType__c) {
        this.is_CS_RecordType__c = is_CS_RecordType__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Case_Settings__c)) return false;
        Case_Settings__c other = (Case_Settings__c) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.apply_Assignment_Rules_On_Insert__c==null && other.getApply_Assignment_Rules_On_Insert__c()==null) || 
             (this.apply_Assignment_Rules_On_Insert__c!=null &&
              this.apply_Assignment_Rules_On_Insert__c.equals(other.getApply_Assignment_Rules_On_Insert__c()))) &&
            ((this.apply_Assignment_Rules_On_Update__c==null && other.getApply_Assignment_Rules_On_Update__c()==null) || 
             (this.apply_Assignment_Rules_On_Update__c!=null &&
              this.apply_Assignment_Rules_On_Update__c.equals(other.getApply_Assignment_Rules_On_Update__c()))) &&
            ((this.business_Hours_Name__c==null && other.getBusiness_Hours_Name__c()==null) || 
             (this.business_Hours_Name__c!=null &&
              this.business_Hours_Name__c.equals(other.getBusiness_Hours_Name__c()))) &&
            ((this.calculate_SLA__c==null && other.getCalculate_SLA__c()==null) || 
             (this.calculate_SLA__c!=null &&
              this.calculate_SLA__c.equals(other.getCalculate_SLA__c()))) &&
            ((this.create_Case_Comments__c==null && other.getCreate_Case_Comments__c()==null) || 
             (this.create_Case_Comments__c!=null &&
              this.create_Case_Comments__c.equals(other.getCreate_Case_Comments__c()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.follow_Up_Response_Time_In_Minutes__c==null && other.getFollow_Up_Response_Time_In_Minutes__c()==null) || 
             (this.follow_Up_Response_Time_In_Minutes__c!=null &&
              this.follow_Up_Response_Time_In_Minutes__c.equals(other.getFollow_Up_Response_Time_In_Minutes__c()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.is_VisibleI_n_Self_Service__c==null && other.getIs_VisibleI_n_Self_Service__c()==null) || 
             (this.is_VisibleI_n_Self_Service__c!=null &&
              this.is_VisibleI_n_Self_Service__c.equals(other.getIs_VisibleI_n_Self_Service__c()))) &&
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
            ((this.owner_Name__c==null && other.getOwner_Name__c()==null) || 
             (this.owner_Name__c!=null &&
              this.owner_Name__c.equals(other.getOwner_Name__c()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.recordTypeId__c==null && other.getRecordTypeId__c()==null) || 
             (this.recordTypeId__c!=null &&
              this.recordTypeId__c.equals(other.getRecordTypeId__c()))) &&
            ((this.SLA_Uses_Priority__c==null && other.getSLA_Uses_Priority__c()==null) || 
             (this.SLA_Uses_Priority__c!=null &&
              this.SLA_Uses_Priority__c.equals(other.getSLA_Uses_Priority__c()))) &&
            ((this.setupOwner==null && other.getSetupOwner()==null) || 
             (this.setupOwner!=null &&
              this.setupOwner.equals(other.getSetupOwner()))) &&
            ((this.setupOwnerId==null && other.getSetupOwnerId()==null) || 
             (this.setupOwnerId!=null &&
              this.setupOwnerId.equals(other.getSetupOwnerId()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.is_CS_RecordType__c==null && other.getIs_CS_RecordType__c()==null) || 
             (this.is_CS_RecordType__c!=null &&
              this.is_CS_RecordType__c.equals(other.getIs_CS_RecordType__c())));
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
        if (getApply_Assignment_Rules_On_Insert__c() != null) {
            _hashCode += getApply_Assignment_Rules_On_Insert__c().hashCode();
        }
        if (getApply_Assignment_Rules_On_Update__c() != null) {
            _hashCode += getApply_Assignment_Rules_On_Update__c().hashCode();
        }
        if (getBusiness_Hours_Name__c() != null) {
            _hashCode += getBusiness_Hours_Name__c().hashCode();
        }
        if (getCalculate_SLA__c() != null) {
            _hashCode += getCalculate_SLA__c().hashCode();
        }
        if (getCreate_Case_Comments__c() != null) {
            _hashCode += getCreate_Case_Comments__c().hashCode();
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
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getFollow_Up_Response_Time_In_Minutes__c() != null) {
            _hashCode += getFollow_Up_Response_Time_In_Minutes__c().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getIs_VisibleI_n_Self_Service__c() != null) {
            _hashCode += getIs_VisibleI_n_Self_Service__c().hashCode();
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
        if (getOwner_Name__c() != null) {
            _hashCode += getOwner_Name__c().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getRecordTypeId__c() != null) {
            _hashCode += getRecordTypeId__c().hashCode();
        }
        if (getSLA_Uses_Priority__c() != null) {
            _hashCode += getSLA_Uses_Priority__c().hashCode();
        }
        if (getSetupOwner() != null) {
            _hashCode += getSetupOwner().hashCode();
        }
        if (getSetupOwnerId() != null) {
            _hashCode += getSetupOwnerId().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getIs_CS_RecordType__c() != null) {
            _hashCode += getIs_CS_RecordType__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Case_Settings__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case_Settings__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apply_Assignment_Rules_On_Insert__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Apply_Assignment_Rules_On_Insert__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apply_Assignment_Rules_On_Update__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Apply_Assignment_Rules_On_Update__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("business_Hours_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Business_Hours_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calculate_SLA__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Calculate_SLA__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("create_Case_Comments__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Create_Case_Comments__c"));
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
        elemField.setFieldName("feedSubscriptionsForEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedSubscriptionsForEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("follow_Up_Response_Time_In_Minutes__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Follow_Up_Response_Time_In_Minutes__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDeleted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDeleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("is_VisibleI_n_Self_Service__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Is_VisibleI_n_Self_Service__c"));
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
        elemField.setFieldName("owner_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Owner_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processInstances");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessInstances"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processSteps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessSteps"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordTypeId__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecordTypeId__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SLA_Uses_Priority__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SLA_Uses_Priority__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setupOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SetupOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setupOwnerId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SetupOwnerId"));
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
        elemField.setFieldName("is_CS_RecordType__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "is_CS_RecordType__c"));
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

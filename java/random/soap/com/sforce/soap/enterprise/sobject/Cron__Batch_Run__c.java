/**
 * Cron__Batch_Run__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Cron__Batch_Run__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult attachments;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.lang.Boolean isDeleted;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.util.Calendar systemModstamp;

    private java.lang.String cron__Batch_Job_Name__c;

    private java.lang.String cron__Batch_Job_Type__c;

    private java.lang.String cron__Batch_Job__c;

    private com.sforce.soap.enterprise.sobject.Cron__Batch_Job__c cron__Batch_Job__r;

    private java.util.Calendar cron__Completed__c;

    private java.lang.String cron__Result__c;

    private java.lang.String cron__Results__c;

    private java.lang.String cron__Run_Every_Units__c;

    private java.lang.Double cron__Run_Every__c;

    private java.lang.String cron__Schedule_Status__c;

    private java.util.Calendar cron__Scheduled_To_Run__c;

    private java.lang.String cron__Status__c;

    private java.lang.Boolean cron__Trigger_Batch_Run__c;

    private java.lang.Boolean cron__Trigger_Scheduler_1__c;

    private java.lang.Boolean cron__Trigger_Scheduler_2__c;

    public Cron__Batch_Run__c() {
    }

    public Cron__Batch_Run__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult attachments,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.lang.Boolean isDeleted,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.util.Calendar systemModstamp,
           java.lang.String cron__Batch_Job_Name__c,
           java.lang.String cron__Batch_Job_Type__c,
           java.lang.String cron__Batch_Job__c,
           com.sforce.soap.enterprise.sobject.Cron__Batch_Job__c cron__Batch_Job__r,
           java.util.Calendar cron__Completed__c,
           java.lang.String cron__Result__c,
           java.lang.String cron__Results__c,
           java.lang.String cron__Run_Every_Units__c,
           java.lang.Double cron__Run_Every__c,
           java.lang.String cron__Schedule_Status__c,
           java.util.Calendar cron__Scheduled_To_Run__c,
           java.lang.String cron__Status__c,
           java.lang.Boolean cron__Trigger_Batch_Run__c,
           java.lang.Boolean cron__Trigger_Scheduler_1__c,
           java.lang.Boolean cron__Trigger_Scheduler_2__c) {
        super(
            fieldsToNull,
            id);
        this.attachments = attachments;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.isDeleted = isDeleted;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.systemModstamp = systemModstamp;
        this.cron__Batch_Job_Name__c = cron__Batch_Job_Name__c;
        this.cron__Batch_Job_Type__c = cron__Batch_Job_Type__c;
        this.cron__Batch_Job__c = cron__Batch_Job__c;
        this.cron__Batch_Job__r = cron__Batch_Job__r;
        this.cron__Completed__c = cron__Completed__c;
        this.cron__Result__c = cron__Result__c;
        this.cron__Results__c = cron__Results__c;
        this.cron__Run_Every_Units__c = cron__Run_Every_Units__c;
        this.cron__Run_Every__c = cron__Run_Every__c;
        this.cron__Schedule_Status__c = cron__Schedule_Status__c;
        this.cron__Scheduled_To_Run__c = cron__Scheduled_To_Run__c;
        this.cron__Status__c = cron__Status__c;
        this.cron__Trigger_Batch_Run__c = cron__Trigger_Batch_Run__c;
        this.cron__Trigger_Scheduler_1__c = cron__Trigger_Scheduler_1__c;
        this.cron__Trigger_Scheduler_2__c = cron__Trigger_Scheduler_2__c;
    }


    /**
     * Gets the attachments value for this Cron__Batch_Run__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Cron__Batch_Run__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the createdBy value for this Cron__Batch_Run__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Cron__Batch_Run__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Cron__Batch_Run__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Cron__Batch_Run__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Cron__Batch_Run__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Cron__Batch_Run__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Cron__Batch_Run__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Cron__Batch_Run__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the isDeleted value for this Cron__Batch_Run__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Cron__Batch_Run__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this Cron__Batch_Run__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Cron__Batch_Run__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Cron__Batch_Run__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Cron__Batch_Run__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Cron__Batch_Run__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Cron__Batch_Run__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this Cron__Batch_Run__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Cron__Batch_Run__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Cron__Batch_Run__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Cron__Batch_Run__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Cron__Batch_Run__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Cron__Batch_Run__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the processInstances value for this Cron__Batch_Run__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Cron__Batch_Run__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Cron__Batch_Run__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Cron__Batch_Run__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the systemModstamp value for this Cron__Batch_Run__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Cron__Batch_Run__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the cron__Batch_Job_Name__c value for this Cron__Batch_Run__c.
     * 
     * @return cron__Batch_Job_Name__c
     */
    public java.lang.String getCron__Batch_Job_Name__c() {
        return cron__Batch_Job_Name__c;
    }


    /**
     * Sets the cron__Batch_Job_Name__c value for this Cron__Batch_Run__c.
     * 
     * @param cron__Batch_Job_Name__c
     */
    public void setCron__Batch_Job_Name__c(java.lang.String cron__Batch_Job_Name__c) {
        this.cron__Batch_Job_Name__c = cron__Batch_Job_Name__c;
    }


    /**
     * Gets the cron__Batch_Job_Type__c value for this Cron__Batch_Run__c.
     * 
     * @return cron__Batch_Job_Type__c
     */
    public java.lang.String getCron__Batch_Job_Type__c() {
        return cron__Batch_Job_Type__c;
    }


    /**
     * Sets the cron__Batch_Job_Type__c value for this Cron__Batch_Run__c.
     * 
     * @param cron__Batch_Job_Type__c
     */
    public void setCron__Batch_Job_Type__c(java.lang.String cron__Batch_Job_Type__c) {
        this.cron__Batch_Job_Type__c = cron__Batch_Job_Type__c;
    }


    /**
     * Gets the cron__Batch_Job__c value for this Cron__Batch_Run__c.
     * 
     * @return cron__Batch_Job__c
     */
    public java.lang.String getCron__Batch_Job__c() {
        return cron__Batch_Job__c;
    }


    /**
     * Sets the cron__Batch_Job__c value for this Cron__Batch_Run__c.
     * 
     * @param cron__Batch_Job__c
     */
    public void setCron__Batch_Job__c(java.lang.String cron__Batch_Job__c) {
        this.cron__Batch_Job__c = cron__Batch_Job__c;
    }


    /**
     * Gets the cron__Batch_Job__r value for this Cron__Batch_Run__c.
     * 
     * @return cron__Batch_Job__r
     */
    public com.sforce.soap.enterprise.sobject.Cron__Batch_Job__c getCron__Batch_Job__r() {
        return cron__Batch_Job__r;
    }


    /**
     * Sets the cron__Batch_Job__r value for this Cron__Batch_Run__c.
     * 
     * @param cron__Batch_Job__r
     */
    public void setCron__Batch_Job__r(com.sforce.soap.enterprise.sobject.Cron__Batch_Job__c cron__Batch_Job__r) {
        this.cron__Batch_Job__r = cron__Batch_Job__r;
    }


    /**
     * Gets the cron__Completed__c value for this Cron__Batch_Run__c.
     * 
     * @return cron__Completed__c
     */
    public java.util.Calendar getCron__Completed__c() {
        return cron__Completed__c;
    }


    /**
     * Sets the cron__Completed__c value for this Cron__Batch_Run__c.
     * 
     * @param cron__Completed__c
     */
    public void setCron__Completed__c(java.util.Calendar cron__Completed__c) {
        this.cron__Completed__c = cron__Completed__c;
    }


    /**
     * Gets the cron__Result__c value for this Cron__Batch_Run__c.
     * 
     * @return cron__Result__c
     */
    public java.lang.String getCron__Result__c() {
        return cron__Result__c;
    }


    /**
     * Sets the cron__Result__c value for this Cron__Batch_Run__c.
     * 
     * @param cron__Result__c
     */
    public void setCron__Result__c(java.lang.String cron__Result__c) {
        this.cron__Result__c = cron__Result__c;
    }


    /**
     * Gets the cron__Results__c value for this Cron__Batch_Run__c.
     * 
     * @return cron__Results__c
     */
    public java.lang.String getCron__Results__c() {
        return cron__Results__c;
    }


    /**
     * Sets the cron__Results__c value for this Cron__Batch_Run__c.
     * 
     * @param cron__Results__c
     */
    public void setCron__Results__c(java.lang.String cron__Results__c) {
        this.cron__Results__c = cron__Results__c;
    }


    /**
     * Gets the cron__Run_Every_Units__c value for this Cron__Batch_Run__c.
     * 
     * @return cron__Run_Every_Units__c
     */
    public java.lang.String getCron__Run_Every_Units__c() {
        return cron__Run_Every_Units__c;
    }


    /**
     * Sets the cron__Run_Every_Units__c value for this Cron__Batch_Run__c.
     * 
     * @param cron__Run_Every_Units__c
     */
    public void setCron__Run_Every_Units__c(java.lang.String cron__Run_Every_Units__c) {
        this.cron__Run_Every_Units__c = cron__Run_Every_Units__c;
    }


    /**
     * Gets the cron__Run_Every__c value for this Cron__Batch_Run__c.
     * 
     * @return cron__Run_Every__c
     */
    public java.lang.Double getCron__Run_Every__c() {
        return cron__Run_Every__c;
    }


    /**
     * Sets the cron__Run_Every__c value for this Cron__Batch_Run__c.
     * 
     * @param cron__Run_Every__c
     */
    public void setCron__Run_Every__c(java.lang.Double cron__Run_Every__c) {
        this.cron__Run_Every__c = cron__Run_Every__c;
    }


    /**
     * Gets the cron__Schedule_Status__c value for this Cron__Batch_Run__c.
     * 
     * @return cron__Schedule_Status__c
     */
    public java.lang.String getCron__Schedule_Status__c() {
        return cron__Schedule_Status__c;
    }


    /**
     * Sets the cron__Schedule_Status__c value for this Cron__Batch_Run__c.
     * 
     * @param cron__Schedule_Status__c
     */
    public void setCron__Schedule_Status__c(java.lang.String cron__Schedule_Status__c) {
        this.cron__Schedule_Status__c = cron__Schedule_Status__c;
    }


    /**
     * Gets the cron__Scheduled_To_Run__c value for this Cron__Batch_Run__c.
     * 
     * @return cron__Scheduled_To_Run__c
     */
    public java.util.Calendar getCron__Scheduled_To_Run__c() {
        return cron__Scheduled_To_Run__c;
    }


    /**
     * Sets the cron__Scheduled_To_Run__c value for this Cron__Batch_Run__c.
     * 
     * @param cron__Scheduled_To_Run__c
     */
    public void setCron__Scheduled_To_Run__c(java.util.Calendar cron__Scheduled_To_Run__c) {
        this.cron__Scheduled_To_Run__c = cron__Scheduled_To_Run__c;
    }


    /**
     * Gets the cron__Status__c value for this Cron__Batch_Run__c.
     * 
     * @return cron__Status__c
     */
    public java.lang.String getCron__Status__c() {
        return cron__Status__c;
    }


    /**
     * Sets the cron__Status__c value for this Cron__Batch_Run__c.
     * 
     * @param cron__Status__c
     */
    public void setCron__Status__c(java.lang.String cron__Status__c) {
        this.cron__Status__c = cron__Status__c;
    }


    /**
     * Gets the cron__Trigger_Batch_Run__c value for this Cron__Batch_Run__c.
     * 
     * @return cron__Trigger_Batch_Run__c
     */
    public java.lang.Boolean getCron__Trigger_Batch_Run__c() {
        return cron__Trigger_Batch_Run__c;
    }


    /**
     * Sets the cron__Trigger_Batch_Run__c value for this Cron__Batch_Run__c.
     * 
     * @param cron__Trigger_Batch_Run__c
     */
    public void setCron__Trigger_Batch_Run__c(java.lang.Boolean cron__Trigger_Batch_Run__c) {
        this.cron__Trigger_Batch_Run__c = cron__Trigger_Batch_Run__c;
    }


    /**
     * Gets the cron__Trigger_Scheduler_1__c value for this Cron__Batch_Run__c.
     * 
     * @return cron__Trigger_Scheduler_1__c
     */
    public java.lang.Boolean getCron__Trigger_Scheduler_1__c() {
        return cron__Trigger_Scheduler_1__c;
    }


    /**
     * Sets the cron__Trigger_Scheduler_1__c value for this Cron__Batch_Run__c.
     * 
     * @param cron__Trigger_Scheduler_1__c
     */
    public void setCron__Trigger_Scheduler_1__c(java.lang.Boolean cron__Trigger_Scheduler_1__c) {
        this.cron__Trigger_Scheduler_1__c = cron__Trigger_Scheduler_1__c;
    }


    /**
     * Gets the cron__Trigger_Scheduler_2__c value for this Cron__Batch_Run__c.
     * 
     * @return cron__Trigger_Scheduler_2__c
     */
    public java.lang.Boolean getCron__Trigger_Scheduler_2__c() {
        return cron__Trigger_Scheduler_2__c;
    }


    /**
     * Sets the cron__Trigger_Scheduler_2__c value for this Cron__Batch_Run__c.
     * 
     * @param cron__Trigger_Scheduler_2__c
     */
    public void setCron__Trigger_Scheduler_2__c(java.lang.Boolean cron__Trigger_Scheduler_2__c) {
        this.cron__Trigger_Scheduler_2__c = cron__Trigger_Scheduler_2__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cron__Batch_Run__c)) return false;
        Cron__Batch_Run__c other = (Cron__Batch_Run__c) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
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
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
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
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.cron__Batch_Job_Name__c==null && other.getCron__Batch_Job_Name__c()==null) || 
             (this.cron__Batch_Job_Name__c!=null &&
              this.cron__Batch_Job_Name__c.equals(other.getCron__Batch_Job_Name__c()))) &&
            ((this.cron__Batch_Job_Type__c==null && other.getCron__Batch_Job_Type__c()==null) || 
             (this.cron__Batch_Job_Type__c!=null &&
              this.cron__Batch_Job_Type__c.equals(other.getCron__Batch_Job_Type__c()))) &&
            ((this.cron__Batch_Job__c==null && other.getCron__Batch_Job__c()==null) || 
             (this.cron__Batch_Job__c!=null &&
              this.cron__Batch_Job__c.equals(other.getCron__Batch_Job__c()))) &&
            ((this.cron__Batch_Job__r==null && other.getCron__Batch_Job__r()==null) || 
             (this.cron__Batch_Job__r!=null &&
              this.cron__Batch_Job__r.equals(other.getCron__Batch_Job__r()))) &&
            ((this.cron__Completed__c==null && other.getCron__Completed__c()==null) || 
             (this.cron__Completed__c!=null &&
              this.cron__Completed__c.equals(other.getCron__Completed__c()))) &&
            ((this.cron__Result__c==null && other.getCron__Result__c()==null) || 
             (this.cron__Result__c!=null &&
              this.cron__Result__c.equals(other.getCron__Result__c()))) &&
            ((this.cron__Results__c==null && other.getCron__Results__c()==null) || 
             (this.cron__Results__c!=null &&
              this.cron__Results__c.equals(other.getCron__Results__c()))) &&
            ((this.cron__Run_Every_Units__c==null && other.getCron__Run_Every_Units__c()==null) || 
             (this.cron__Run_Every_Units__c!=null &&
              this.cron__Run_Every_Units__c.equals(other.getCron__Run_Every_Units__c()))) &&
            ((this.cron__Run_Every__c==null && other.getCron__Run_Every__c()==null) || 
             (this.cron__Run_Every__c!=null &&
              this.cron__Run_Every__c.equals(other.getCron__Run_Every__c()))) &&
            ((this.cron__Schedule_Status__c==null && other.getCron__Schedule_Status__c()==null) || 
             (this.cron__Schedule_Status__c!=null &&
              this.cron__Schedule_Status__c.equals(other.getCron__Schedule_Status__c()))) &&
            ((this.cron__Scheduled_To_Run__c==null && other.getCron__Scheduled_To_Run__c()==null) || 
             (this.cron__Scheduled_To_Run__c!=null &&
              this.cron__Scheduled_To_Run__c.equals(other.getCron__Scheduled_To_Run__c()))) &&
            ((this.cron__Status__c==null && other.getCron__Status__c()==null) || 
             (this.cron__Status__c!=null &&
              this.cron__Status__c.equals(other.getCron__Status__c()))) &&
            ((this.cron__Trigger_Batch_Run__c==null && other.getCron__Trigger_Batch_Run__c()==null) || 
             (this.cron__Trigger_Batch_Run__c!=null &&
              this.cron__Trigger_Batch_Run__c.equals(other.getCron__Trigger_Batch_Run__c()))) &&
            ((this.cron__Trigger_Scheduler_1__c==null && other.getCron__Trigger_Scheduler_1__c()==null) || 
             (this.cron__Trigger_Scheduler_1__c!=null &&
              this.cron__Trigger_Scheduler_1__c.equals(other.getCron__Trigger_Scheduler_1__c()))) &&
            ((this.cron__Trigger_Scheduler_2__c==null && other.getCron__Trigger_Scheduler_2__c()==null) || 
             (this.cron__Trigger_Scheduler_2__c!=null &&
              this.cron__Trigger_Scheduler_2__c.equals(other.getCron__Trigger_Scheduler_2__c())));
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
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
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
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
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
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getNotesAndAttachments() != null) {
            _hashCode += getNotesAndAttachments().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getCron__Batch_Job_Name__c() != null) {
            _hashCode += getCron__Batch_Job_Name__c().hashCode();
        }
        if (getCron__Batch_Job_Type__c() != null) {
            _hashCode += getCron__Batch_Job_Type__c().hashCode();
        }
        if (getCron__Batch_Job__c() != null) {
            _hashCode += getCron__Batch_Job__c().hashCode();
        }
        if (getCron__Batch_Job__r() != null) {
            _hashCode += getCron__Batch_Job__r().hashCode();
        }
        if (getCron__Completed__c() != null) {
            _hashCode += getCron__Completed__c().hashCode();
        }
        if (getCron__Result__c() != null) {
            _hashCode += getCron__Result__c().hashCode();
        }
        if (getCron__Results__c() != null) {
            _hashCode += getCron__Results__c().hashCode();
        }
        if (getCron__Run_Every_Units__c() != null) {
            _hashCode += getCron__Run_Every_Units__c().hashCode();
        }
        if (getCron__Run_Every__c() != null) {
            _hashCode += getCron__Run_Every__c().hashCode();
        }
        if (getCron__Schedule_Status__c() != null) {
            _hashCode += getCron__Schedule_Status__c().hashCode();
        }
        if (getCron__Scheduled_To_Run__c() != null) {
            _hashCode += getCron__Scheduled_To_Run__c().hashCode();
        }
        if (getCron__Status__c() != null) {
            _hashCode += getCron__Status__c().hashCode();
        }
        if (getCron__Trigger_Batch_Run__c() != null) {
            _hashCode += getCron__Trigger_Batch_Run__c().hashCode();
        }
        if (getCron__Trigger_Scheduler_1__c() != null) {
            _hashCode += getCron__Trigger_Scheduler_1__c().hashCode();
        }
        if (getCron__Trigger_Scheduler_2__c() != null) {
            _hashCode += getCron__Trigger_Scheduler_2__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cron__Batch_Run__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "cron__Batch_Run__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attachments"));
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
        elemField.setFieldName("feedSubscriptionsForEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedSubscriptionsForEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notesAndAttachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NotesAndAttachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("systemModstamp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SystemModstamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cron__Batch_Job_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "cron__Batch_Job_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cron__Batch_Job_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "cron__Batch_Job_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cron__Batch_Job__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "cron__Batch_Job__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cron__Batch_Job__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "cron__Batch_Job__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "cron__Batch_Job__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cron__Completed__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "cron__Completed__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cron__Result__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "cron__Result__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cron__Results__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "cron__Results__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cron__Run_Every_Units__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "cron__Run_Every_Units__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cron__Run_Every__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "cron__Run_Every__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cron__Schedule_Status__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "cron__Schedule_Status__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cron__Scheduled_To_Run__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "cron__Scheduled_To_Run__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cron__Status__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "cron__Status__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cron__Trigger_Batch_Run__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "cron__Trigger_Batch_Run__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cron__Trigger_Scheduler_1__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "cron__Trigger_Scheduler_1__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cron__Trigger_Scheduler_2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "cron__Trigger_Scheduler_2__c"));
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

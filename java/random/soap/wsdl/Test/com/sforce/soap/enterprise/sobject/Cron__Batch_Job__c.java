/**
 * Cron__Batch_Job__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Cron__Batch_Job__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private com.sforce.soap.enterprise.QueryResult events;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.lang.Boolean isDeleted;

    private java.util.Date lastActivityDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private com.sforce.soap.enterprise.QueryResult openActivities;

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    private java.lang.String cron__Batch_Job_Type__c;

    private com.sforce.soap.enterprise.QueryResult cron__Batch_Runs__r;

    private java.lang.Double cron__Completed_Runs__c;

    private java.lang.String cron__Description__c;

    private java.lang.String cron__Field_for_Age_Cutoff__c;

    private java.lang.Double cron__Number_of_Days__c;

    private java.lang.String cron__Record_Matching_String__c;

    private java.lang.String cron__Record_Name_Filter__c;

    private java.lang.String cron__Records_To_Clean__c;

    private java.lang.String cron__Run_Every_Units__c;

    private java.lang.Double cron__Run_Every__c;

    private java.lang.String cron__Task_Status_Filter__c;

    private java.lang.Double cron__Unfinished_Runs__c;

    public Cron__Batch_Job__c() {
    }

    public Cron__Batch_Job__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           com.sforce.soap.enterprise.QueryResult attachments,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           com.sforce.soap.enterprise.QueryResult events,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.lang.Boolean isDeleted,
           java.util.Date lastActivityDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           com.sforce.soap.enterprise.QueryResult openActivities,
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks,
           java.lang.String cron__Batch_Job_Type__c,
           com.sforce.soap.enterprise.QueryResult cron__Batch_Runs__r,
           java.lang.Double cron__Completed_Runs__c,
           java.lang.String cron__Description__c,
           java.lang.String cron__Field_for_Age_Cutoff__c,
           java.lang.Double cron__Number_of_Days__c,
           java.lang.String cron__Record_Matching_String__c,
           java.lang.String cron__Record_Name_Filter__c,
           java.lang.String cron__Records_To_Clean__c,
           java.lang.String cron__Run_Every_Units__c,
           java.lang.Double cron__Run_Every__c,
           java.lang.String cron__Task_Status_Filter__c,
           java.lang.Double cron__Unfinished_Runs__c) {
        super(
            fieldsToNull,
            id);
        this.activityHistories = activityHistories;
        this.attachments = attachments;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.events = events;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.isDeleted = isDeleted;
        this.lastActivityDate = lastActivityDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.openActivities = openActivities;
        this.owner = owner;
        this.ownerId = ownerId;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
        this.cron__Batch_Job_Type__c = cron__Batch_Job_Type__c;
        this.cron__Batch_Runs__r = cron__Batch_Runs__r;
        this.cron__Completed_Runs__c = cron__Completed_Runs__c;
        this.cron__Description__c = cron__Description__c;
        this.cron__Field_for_Age_Cutoff__c = cron__Field_for_Age_Cutoff__c;
        this.cron__Number_of_Days__c = cron__Number_of_Days__c;
        this.cron__Record_Matching_String__c = cron__Record_Matching_String__c;
        this.cron__Record_Name_Filter__c = cron__Record_Name_Filter__c;
        this.cron__Records_To_Clean__c = cron__Records_To_Clean__c;
        this.cron__Run_Every_Units__c = cron__Run_Every_Units__c;
        this.cron__Run_Every__c = cron__Run_Every__c;
        this.cron__Task_Status_Filter__c = cron__Task_Status_Filter__c;
        this.cron__Unfinished_Runs__c = cron__Unfinished_Runs__c;
    }


    /**
     * Gets the activityHistories value for this Cron__Batch_Job__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this Cron__Batch_Job__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the attachments value for this Cron__Batch_Job__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Cron__Batch_Job__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the createdBy value for this Cron__Batch_Job__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Cron__Batch_Job__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Cron__Batch_Job__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Cron__Batch_Job__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Cron__Batch_Job__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Cron__Batch_Job__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the events value for this Cron__Batch_Job__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Cron__Batch_Job__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Cron__Batch_Job__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Cron__Batch_Job__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the isDeleted value for this Cron__Batch_Job__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Cron__Batch_Job__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastActivityDate value for this Cron__Batch_Job__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Cron__Batch_Job__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this Cron__Batch_Job__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Cron__Batch_Job__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Cron__Batch_Job__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Cron__Batch_Job__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Cron__Batch_Job__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Cron__Batch_Job__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this Cron__Batch_Job__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Cron__Batch_Job__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Cron__Batch_Job__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Cron__Batch_Job__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Cron__Batch_Job__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Cron__Batch_Job__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the openActivities value for this Cron__Batch_Job__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this Cron__Batch_Job__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the owner value for this Cron__Batch_Job__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Cron__Batch_Job__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Cron__Batch_Job__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Cron__Batch_Job__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this Cron__Batch_Job__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Cron__Batch_Job__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Cron__Batch_Job__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Cron__Batch_Job__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the systemModstamp value for this Cron__Batch_Job__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Cron__Batch_Job__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this Cron__Batch_Job__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Cron__Batch_Job__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the cron__Batch_Job_Type__c value for this Cron__Batch_Job__c.
     * 
     * @return cron__Batch_Job_Type__c
     */
    public java.lang.String getCron__Batch_Job_Type__c() {
        return cron__Batch_Job_Type__c;
    }


    /**
     * Sets the cron__Batch_Job_Type__c value for this Cron__Batch_Job__c.
     * 
     * @param cron__Batch_Job_Type__c
     */
    public void setCron__Batch_Job_Type__c(java.lang.String cron__Batch_Job_Type__c) {
        this.cron__Batch_Job_Type__c = cron__Batch_Job_Type__c;
    }


    /**
     * Gets the cron__Batch_Runs__r value for this Cron__Batch_Job__c.
     * 
     * @return cron__Batch_Runs__r
     */
    public com.sforce.soap.enterprise.QueryResult getCron__Batch_Runs__r() {
        return cron__Batch_Runs__r;
    }


    /**
     * Sets the cron__Batch_Runs__r value for this Cron__Batch_Job__c.
     * 
     * @param cron__Batch_Runs__r
     */
    public void setCron__Batch_Runs__r(com.sforce.soap.enterprise.QueryResult cron__Batch_Runs__r) {
        this.cron__Batch_Runs__r = cron__Batch_Runs__r;
    }


    /**
     * Gets the cron__Completed_Runs__c value for this Cron__Batch_Job__c.
     * 
     * @return cron__Completed_Runs__c
     */
    public java.lang.Double getCron__Completed_Runs__c() {
        return cron__Completed_Runs__c;
    }


    /**
     * Sets the cron__Completed_Runs__c value for this Cron__Batch_Job__c.
     * 
     * @param cron__Completed_Runs__c
     */
    public void setCron__Completed_Runs__c(java.lang.Double cron__Completed_Runs__c) {
        this.cron__Completed_Runs__c = cron__Completed_Runs__c;
    }


    /**
     * Gets the cron__Description__c value for this Cron__Batch_Job__c.
     * 
     * @return cron__Description__c
     */
    public java.lang.String getCron__Description__c() {
        return cron__Description__c;
    }


    /**
     * Sets the cron__Description__c value for this Cron__Batch_Job__c.
     * 
     * @param cron__Description__c
     */
    public void setCron__Description__c(java.lang.String cron__Description__c) {
        this.cron__Description__c = cron__Description__c;
    }


    /**
     * Gets the cron__Field_for_Age_Cutoff__c value for this Cron__Batch_Job__c.
     * 
     * @return cron__Field_for_Age_Cutoff__c
     */
    public java.lang.String getCron__Field_for_Age_Cutoff__c() {
        return cron__Field_for_Age_Cutoff__c;
    }


    /**
     * Sets the cron__Field_for_Age_Cutoff__c value for this Cron__Batch_Job__c.
     * 
     * @param cron__Field_for_Age_Cutoff__c
     */
    public void setCron__Field_for_Age_Cutoff__c(java.lang.String cron__Field_for_Age_Cutoff__c) {
        this.cron__Field_for_Age_Cutoff__c = cron__Field_for_Age_Cutoff__c;
    }


    /**
     * Gets the cron__Number_of_Days__c value for this Cron__Batch_Job__c.
     * 
     * @return cron__Number_of_Days__c
     */
    public java.lang.Double getCron__Number_of_Days__c() {
        return cron__Number_of_Days__c;
    }


    /**
     * Sets the cron__Number_of_Days__c value for this Cron__Batch_Job__c.
     * 
     * @param cron__Number_of_Days__c
     */
    public void setCron__Number_of_Days__c(java.lang.Double cron__Number_of_Days__c) {
        this.cron__Number_of_Days__c = cron__Number_of_Days__c;
    }


    /**
     * Gets the cron__Record_Matching_String__c value for this Cron__Batch_Job__c.
     * 
     * @return cron__Record_Matching_String__c
     */
    public java.lang.String getCron__Record_Matching_String__c() {
        return cron__Record_Matching_String__c;
    }


    /**
     * Sets the cron__Record_Matching_String__c value for this Cron__Batch_Job__c.
     * 
     * @param cron__Record_Matching_String__c
     */
    public void setCron__Record_Matching_String__c(java.lang.String cron__Record_Matching_String__c) {
        this.cron__Record_Matching_String__c = cron__Record_Matching_String__c;
    }


    /**
     * Gets the cron__Record_Name_Filter__c value for this Cron__Batch_Job__c.
     * 
     * @return cron__Record_Name_Filter__c
     */
    public java.lang.String getCron__Record_Name_Filter__c() {
        return cron__Record_Name_Filter__c;
    }


    /**
     * Sets the cron__Record_Name_Filter__c value for this Cron__Batch_Job__c.
     * 
     * @param cron__Record_Name_Filter__c
     */
    public void setCron__Record_Name_Filter__c(java.lang.String cron__Record_Name_Filter__c) {
        this.cron__Record_Name_Filter__c = cron__Record_Name_Filter__c;
    }


    /**
     * Gets the cron__Records_To_Clean__c value for this Cron__Batch_Job__c.
     * 
     * @return cron__Records_To_Clean__c
     */
    public java.lang.String getCron__Records_To_Clean__c() {
        return cron__Records_To_Clean__c;
    }


    /**
     * Sets the cron__Records_To_Clean__c value for this Cron__Batch_Job__c.
     * 
     * @param cron__Records_To_Clean__c
     */
    public void setCron__Records_To_Clean__c(java.lang.String cron__Records_To_Clean__c) {
        this.cron__Records_To_Clean__c = cron__Records_To_Clean__c;
    }


    /**
     * Gets the cron__Run_Every_Units__c value for this Cron__Batch_Job__c.
     * 
     * @return cron__Run_Every_Units__c
     */
    public java.lang.String getCron__Run_Every_Units__c() {
        return cron__Run_Every_Units__c;
    }


    /**
     * Sets the cron__Run_Every_Units__c value for this Cron__Batch_Job__c.
     * 
     * @param cron__Run_Every_Units__c
     */
    public void setCron__Run_Every_Units__c(java.lang.String cron__Run_Every_Units__c) {
        this.cron__Run_Every_Units__c = cron__Run_Every_Units__c;
    }


    /**
     * Gets the cron__Run_Every__c value for this Cron__Batch_Job__c.
     * 
     * @return cron__Run_Every__c
     */
    public java.lang.Double getCron__Run_Every__c() {
        return cron__Run_Every__c;
    }


    /**
     * Sets the cron__Run_Every__c value for this Cron__Batch_Job__c.
     * 
     * @param cron__Run_Every__c
     */
    public void setCron__Run_Every__c(java.lang.Double cron__Run_Every__c) {
        this.cron__Run_Every__c = cron__Run_Every__c;
    }


    /**
     * Gets the cron__Task_Status_Filter__c value for this Cron__Batch_Job__c.
     * 
     * @return cron__Task_Status_Filter__c
     */
    public java.lang.String getCron__Task_Status_Filter__c() {
        return cron__Task_Status_Filter__c;
    }


    /**
     * Sets the cron__Task_Status_Filter__c value for this Cron__Batch_Job__c.
     * 
     * @param cron__Task_Status_Filter__c
     */
    public void setCron__Task_Status_Filter__c(java.lang.String cron__Task_Status_Filter__c) {
        this.cron__Task_Status_Filter__c = cron__Task_Status_Filter__c;
    }


    /**
     * Gets the cron__Unfinished_Runs__c value for this Cron__Batch_Job__c.
     * 
     * @return cron__Unfinished_Runs__c
     */
    public java.lang.Double getCron__Unfinished_Runs__c() {
        return cron__Unfinished_Runs__c;
    }


    /**
     * Sets the cron__Unfinished_Runs__c value for this Cron__Batch_Job__c.
     * 
     * @param cron__Unfinished_Runs__c
     */
    public void setCron__Unfinished_Runs__c(java.lang.Double cron__Unfinished_Runs__c) {
        this.cron__Unfinished_Runs__c = cron__Unfinished_Runs__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cron__Batch_Job__c)) return false;
        Cron__Batch_Job__c other = (Cron__Batch_Job__c) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.activityHistories==null && other.getActivityHistories()==null) || 
             (this.activityHistories!=null &&
              this.activityHistories.equals(other.getActivityHistories()))) &&
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
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              this.events.equals(other.getEvents()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.lastActivityDate==null && other.getLastActivityDate()==null) || 
             (this.lastActivityDate!=null &&
              this.lastActivityDate.equals(other.getLastActivityDate()))) &&
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
            ((this.openActivities==null && other.getOpenActivities()==null) || 
             (this.openActivities!=null &&
              this.openActivities.equals(other.getOpenActivities()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              this.tasks.equals(other.getTasks()))) &&
            ((this.cron__Batch_Job_Type__c==null && other.getCron__Batch_Job_Type__c()==null) || 
             (this.cron__Batch_Job_Type__c!=null &&
              this.cron__Batch_Job_Type__c.equals(other.getCron__Batch_Job_Type__c()))) &&
            ((this.cron__Batch_Runs__r==null && other.getCron__Batch_Runs__r()==null) || 
             (this.cron__Batch_Runs__r!=null &&
              this.cron__Batch_Runs__r.equals(other.getCron__Batch_Runs__r()))) &&
            ((this.cron__Completed_Runs__c==null && other.getCron__Completed_Runs__c()==null) || 
             (this.cron__Completed_Runs__c!=null &&
              this.cron__Completed_Runs__c.equals(other.getCron__Completed_Runs__c()))) &&
            ((this.cron__Description__c==null && other.getCron__Description__c()==null) || 
             (this.cron__Description__c!=null &&
              this.cron__Description__c.equals(other.getCron__Description__c()))) &&
            ((this.cron__Field_for_Age_Cutoff__c==null && other.getCron__Field_for_Age_Cutoff__c()==null) || 
             (this.cron__Field_for_Age_Cutoff__c!=null &&
              this.cron__Field_for_Age_Cutoff__c.equals(other.getCron__Field_for_Age_Cutoff__c()))) &&
            ((this.cron__Number_of_Days__c==null && other.getCron__Number_of_Days__c()==null) || 
             (this.cron__Number_of_Days__c!=null &&
              this.cron__Number_of_Days__c.equals(other.getCron__Number_of_Days__c()))) &&
            ((this.cron__Record_Matching_String__c==null && other.getCron__Record_Matching_String__c()==null) || 
             (this.cron__Record_Matching_String__c!=null &&
              this.cron__Record_Matching_String__c.equals(other.getCron__Record_Matching_String__c()))) &&
            ((this.cron__Record_Name_Filter__c==null && other.getCron__Record_Name_Filter__c()==null) || 
             (this.cron__Record_Name_Filter__c!=null &&
              this.cron__Record_Name_Filter__c.equals(other.getCron__Record_Name_Filter__c()))) &&
            ((this.cron__Records_To_Clean__c==null && other.getCron__Records_To_Clean__c()==null) || 
             (this.cron__Records_To_Clean__c!=null &&
              this.cron__Records_To_Clean__c.equals(other.getCron__Records_To_Clean__c()))) &&
            ((this.cron__Run_Every_Units__c==null && other.getCron__Run_Every_Units__c()==null) || 
             (this.cron__Run_Every_Units__c!=null &&
              this.cron__Run_Every_Units__c.equals(other.getCron__Run_Every_Units__c()))) &&
            ((this.cron__Run_Every__c==null && other.getCron__Run_Every__c()==null) || 
             (this.cron__Run_Every__c!=null &&
              this.cron__Run_Every__c.equals(other.getCron__Run_Every__c()))) &&
            ((this.cron__Task_Status_Filter__c==null && other.getCron__Task_Status_Filter__c()==null) || 
             (this.cron__Task_Status_Filter__c!=null &&
              this.cron__Task_Status_Filter__c.equals(other.getCron__Task_Status_Filter__c()))) &&
            ((this.cron__Unfinished_Runs__c==null && other.getCron__Unfinished_Runs__c()==null) || 
             (this.cron__Unfinished_Runs__c!=null &&
              this.cron__Unfinished_Runs__c.equals(other.getCron__Unfinished_Runs__c())));
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
        if (getActivityHistories() != null) {
            _hashCode += getActivityHistories().hashCode();
        }
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
        if (getEvents() != null) {
            _hashCode += getEvents().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getLastActivityDate() != null) {
            _hashCode += getLastActivityDate().hashCode();
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
        if (getOpenActivities() != null) {
            _hashCode += getOpenActivities().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
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
        if (getTasks() != null) {
            _hashCode += getTasks().hashCode();
        }
        if (getCron__Batch_Job_Type__c() != null) {
            _hashCode += getCron__Batch_Job_Type__c().hashCode();
        }
        if (getCron__Batch_Runs__r() != null) {
            _hashCode += getCron__Batch_Runs__r().hashCode();
        }
        if (getCron__Completed_Runs__c() != null) {
            _hashCode += getCron__Completed_Runs__c().hashCode();
        }
        if (getCron__Description__c() != null) {
            _hashCode += getCron__Description__c().hashCode();
        }
        if (getCron__Field_for_Age_Cutoff__c() != null) {
            _hashCode += getCron__Field_for_Age_Cutoff__c().hashCode();
        }
        if (getCron__Number_of_Days__c() != null) {
            _hashCode += getCron__Number_of_Days__c().hashCode();
        }
        if (getCron__Record_Matching_String__c() != null) {
            _hashCode += getCron__Record_Matching_String__c().hashCode();
        }
        if (getCron__Record_Name_Filter__c() != null) {
            _hashCode += getCron__Record_Name_Filter__c().hashCode();
        }
        if (getCron__Records_To_Clean__c() != null) {
            _hashCode += getCron__Records_To_Clean__c().hashCode();
        }
        if (getCron__Run_Every_Units__c() != null) {
            _hashCode += getCron__Run_Every_Units__c().hashCode();
        }
        if (getCron__Run_Every__c() != null) {
            _hashCode += getCron__Run_Every__c().hashCode();
        }
        if (getCron__Task_Status_Filter__c() != null) {
            _hashCode += getCron__Task_Status_Filter__c().hashCode();
        }
        if (getCron__Unfinished_Runs__c() != null) {
            _hashCode += getCron__Unfinished_Runs__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cron__Batch_Job__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "cron__Batch_Job__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityHistories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActivityHistories"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("events");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Events"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("lastActivityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastActivityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("openActivities");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpenActivities"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OwnerId"));
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
        elemField.setFieldName("systemModstamp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SystemModstamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tasks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("cron__Batch_Runs__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "cron__Batch_Runs__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cron__Completed_Runs__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "cron__Completed_Runs__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cron__Description__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "cron__Description__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cron__Field_for_Age_Cutoff__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "cron__Field_for_Age_Cutoff__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cron__Number_of_Days__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "cron__Number_of_Days__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cron__Record_Matching_String__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "cron__Record_Matching_String__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cron__Record_Name_Filter__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "cron__Record_Name_Filter__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cron__Records_To_Clean__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "cron__Records_To_Clean__c"));
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
        elemField.setFieldName("cron__Task_Status_Filter__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "cron__Task_Status_Filter__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cron__Unfinished_Runs__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "cron__Unfinished_Runs__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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

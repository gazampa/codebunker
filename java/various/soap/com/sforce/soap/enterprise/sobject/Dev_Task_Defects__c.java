/**
 * Dev_Task_Defects__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Dev_Task_Defects__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private java.util.Date actual_End_Date__c;

    private java.lang.Double actual_Hours__c;

    private java.lang.String application_Part__c;

    private java.lang.String associated_Project__c;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.Boolean breaking__c;

    private java.lang.String category__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String current_Status_Notes__c;

    private java.lang.String defect_Status__c;

    private java.lang.String defect_Type__c;

    private java.lang.String defects_Artifact_ID_s__c;

    private java.lang.Boolean dependent_On_Third_Party__c;

    private java.lang.String description__c;

    private java.lang.String dev_Priority__c;

    private com.sforce.soap.enterprise.QueryResult dominu_Tasks__r;

    private java.lang.String error_Message__c;

    private java.lang.Double est_Hours_High__c;

    private java.lang.Double est_Hours_Low__c;

    private java.lang.Double est_Hours__c;

    private com.sforce.soap.enterprise.QueryResult events;

    private java.lang.String feature__c;

    private com.sforce.soap.enterprise.sobject.Feature__c feature__r;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.lang.String fixed_By__c;

    private com.sforce.soap.enterprise.sobject.User fixed_By__r;

    private java.util.Date fixed_Date__c;

    private java.lang.Double hours_Spent_Week_Before_Complete__c;

    private java.lang.Double hours__c;

    private java.lang.Boolean isDeleted;

    private java.lang.Boolean is_Production_Defect__c;

    private java.lang.String keywords__c;

    private java.util.Date lastActivityDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String level_of_Initial_Dev_Effort__c;

    private java.lang.String name;

    private java.lang.String name__c;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private java.lang.String notes__c;

    private com.sforce.soap.enterprise.QueryResult openActivities;

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private java.lang.String priority__c;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.String project__c;

    private java.util.Date projected_End_Date__c;

    private com.sforce.soap.enterprise.sobject.RecordType recordType;

    private java.lang.String recordTypeId;

    private java.lang.Boolean regression__c;

    private java.lang.String related_Dominus_Task__c;

    private com.sforce.soap.enterprise.sobject.Dev_Task_Defects__c related_Dominus_Task__r;

    private java.lang.String release_Project__c;

    private com.sforce.soap.enterprise.sobject.Release__c release_Project__r;

    private java.lang.String requested_By__c;

    private java.lang.String return__c;

    private java.lang.Boolean send_Notification_Email__c;

    private java.lang.String severity__c;

    private java.lang.String short_Task_Name__c;

    private java.lang.String status__c;

    private java.lang.String steps_To_Reproduce__c;

    private java.util.Calendar systemModstamp;

    private java.lang.String system_Created_By__c;

    private java.util.Calendar system_Created_On__c;

    private java.lang.String system_Last_Modified_B__c;

    private java.util.Calendar system_Last_Modified_On__c;

    private java.lang.String task_Defect_Name__c;

    private java.lang.String task__c;

    private com.sforce.soap.enterprise.QueryResult tasks;

    private java.lang.String test_Case_QA_Validation__c;

    private java.lang.String tested_By__c;

    private com.sforce.soap.enterprise.sobject.User tested_By__r;

    private java.util.Date tested_Date__c;

    private java.lang.String type__c;

    private java.lang.String URL__c;

    private java.lang.String user__c;

    private com.sforce.soap.enterprise.sobject.User user__r;

    private java.lang.String version_Found__c;

    private java.lang.String version_Released__c;

    private java.lang.String version_s_Performed__c;

    public Dev_Task_Defects__c() {
    }

    public Dev_Task_Defects__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           java.util.Date actual_End_Date__c,
           java.lang.Double actual_Hours__c,
           java.lang.String application_Part__c,
           java.lang.String associated_Project__c,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.Boolean breaking__c,
           java.lang.String category__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String current_Status_Notes__c,
           java.lang.String defect_Status__c,
           java.lang.String defect_Type__c,
           java.lang.String defects_Artifact_ID_s__c,
           java.lang.Boolean dependent_On_Third_Party__c,
           java.lang.String description__c,
           java.lang.String dev_Priority__c,
           com.sforce.soap.enterprise.QueryResult dominu_Tasks__r,
           java.lang.String error_Message__c,
           java.lang.Double est_Hours_High__c,
           java.lang.Double est_Hours_Low__c,
           java.lang.Double est_Hours__c,
           com.sforce.soap.enterprise.QueryResult events,
           java.lang.String feature__c,
           com.sforce.soap.enterprise.sobject.Feature__c feature__r,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.lang.String fixed_By__c,
           com.sforce.soap.enterprise.sobject.User fixed_By__r,
           java.util.Date fixed_Date__c,
           java.lang.Double hours_Spent_Week_Before_Complete__c,
           java.lang.Double hours__c,
           java.lang.Boolean isDeleted,
           java.lang.Boolean is_Production_Defect__c,
           java.lang.String keywords__c,
           java.util.Date lastActivityDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String level_of_Initial_Dev_Effort__c,
           java.lang.String name,
           java.lang.String name__c,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           java.lang.String notes__c,
           com.sforce.soap.enterprise.QueryResult openActivities,
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           java.lang.String priority__c,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.String project__c,
           java.util.Date projected_End_Date__c,
           com.sforce.soap.enterprise.sobject.RecordType recordType,
           java.lang.String recordTypeId,
           java.lang.Boolean regression__c,
           java.lang.String related_Dominus_Task__c,
           com.sforce.soap.enterprise.sobject.Dev_Task_Defects__c related_Dominus_Task__r,
           java.lang.String release_Project__c,
           com.sforce.soap.enterprise.sobject.Release__c release_Project__r,
           java.lang.String requested_By__c,
           java.lang.String return__c,
           java.lang.Boolean send_Notification_Email__c,
           java.lang.String severity__c,
           java.lang.String short_Task_Name__c,
           java.lang.String status__c,
           java.lang.String steps_To_Reproduce__c,
           java.util.Calendar systemModstamp,
           java.lang.String system_Created_By__c,
           java.util.Calendar system_Created_On__c,
           java.lang.String system_Last_Modified_B__c,
           java.util.Calendar system_Last_Modified_On__c,
           java.lang.String task_Defect_Name__c,
           java.lang.String task__c,
           com.sforce.soap.enterprise.QueryResult tasks,
           java.lang.String test_Case_QA_Validation__c,
           java.lang.String tested_By__c,
           com.sforce.soap.enterprise.sobject.User tested_By__r,
           java.util.Date tested_Date__c,
           java.lang.String type__c,
           java.lang.String URL__c,
           java.lang.String user__c,
           com.sforce.soap.enterprise.sobject.User user__r,
           java.lang.String version_Found__c,
           java.lang.String version_Released__c,
           java.lang.String version_s_Performed__c) {
        super(
            fieldsToNull,
            id);
        this.activityHistories = activityHistories;
        this.actual_End_Date__c = actual_End_Date__c;
        this.actual_Hours__c = actual_Hours__c;
        this.application_Part__c = application_Part__c;
        this.associated_Project__c = associated_Project__c;
        this.attachments = attachments;
        this.breaking__c = breaking__c;
        this.category__c = category__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.current_Status_Notes__c = current_Status_Notes__c;
        this.defect_Status__c = defect_Status__c;
        this.defect_Type__c = defect_Type__c;
        this.defects_Artifact_ID_s__c = defects_Artifact_ID_s__c;
        this.dependent_On_Third_Party__c = dependent_On_Third_Party__c;
        this.description__c = description__c;
        this.dev_Priority__c = dev_Priority__c;
        this.dominu_Tasks__r = dominu_Tasks__r;
        this.error_Message__c = error_Message__c;
        this.est_Hours_High__c = est_Hours_High__c;
        this.est_Hours_Low__c = est_Hours_Low__c;
        this.est_Hours__c = est_Hours__c;
        this.events = events;
        this.feature__c = feature__c;
        this.feature__r = feature__r;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.fixed_By__c = fixed_By__c;
        this.fixed_By__r = fixed_By__r;
        this.fixed_Date__c = fixed_Date__c;
        this.hours_Spent_Week_Before_Complete__c = hours_Spent_Week_Before_Complete__c;
        this.hours__c = hours__c;
        this.isDeleted = isDeleted;
        this.is_Production_Defect__c = is_Production_Defect__c;
        this.keywords__c = keywords__c;
        this.lastActivityDate = lastActivityDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.level_of_Initial_Dev_Effort__c = level_of_Initial_Dev_Effort__c;
        this.name = name;
        this.name__c = name__c;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.notes__c = notes__c;
        this.openActivities = openActivities;
        this.owner = owner;
        this.ownerId = ownerId;
        this.priority__c = priority__c;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.project__c = project__c;
        this.projected_End_Date__c = projected_End_Date__c;
        this.recordType = recordType;
        this.recordTypeId = recordTypeId;
        this.regression__c = regression__c;
        this.related_Dominus_Task__c = related_Dominus_Task__c;
        this.related_Dominus_Task__r = related_Dominus_Task__r;
        this.release_Project__c = release_Project__c;
        this.release_Project__r = release_Project__r;
        this.requested_By__c = requested_By__c;
        this.return__c = return__c;
        this.send_Notification_Email__c = send_Notification_Email__c;
        this.severity__c = severity__c;
        this.short_Task_Name__c = short_Task_Name__c;
        this.status__c = status__c;
        this.steps_To_Reproduce__c = steps_To_Reproduce__c;
        this.systemModstamp = systemModstamp;
        this.system_Created_By__c = system_Created_By__c;
        this.system_Created_On__c = system_Created_On__c;
        this.system_Last_Modified_B__c = system_Last_Modified_B__c;
        this.system_Last_Modified_On__c = system_Last_Modified_On__c;
        this.task_Defect_Name__c = task_Defect_Name__c;
        this.task__c = task__c;
        this.tasks = tasks;
        this.test_Case_QA_Validation__c = test_Case_QA_Validation__c;
        this.tested_By__c = tested_By__c;
        this.tested_By__r = tested_By__r;
        this.tested_Date__c = tested_Date__c;
        this.type__c = type__c;
        this.URL__c = URL__c;
        this.user__c = user__c;
        this.user__r = user__r;
        this.version_Found__c = version_Found__c;
        this.version_Released__c = version_Released__c;
        this.version_s_Performed__c = version_s_Performed__c;
    }


    /**
     * Gets the activityHistories value for this Dev_Task_Defects__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this Dev_Task_Defects__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the actual_End_Date__c value for this Dev_Task_Defects__c.
     * 
     * @return actual_End_Date__c
     */
    public java.util.Date getActual_End_Date__c() {
        return actual_End_Date__c;
    }


    /**
     * Sets the actual_End_Date__c value for this Dev_Task_Defects__c.
     * 
     * @param actual_End_Date__c
     */
    public void setActual_End_Date__c(java.util.Date actual_End_Date__c) {
        this.actual_End_Date__c = actual_End_Date__c;
    }


    /**
     * Gets the actual_Hours__c value for this Dev_Task_Defects__c.
     * 
     * @return actual_Hours__c
     */
    public java.lang.Double getActual_Hours__c() {
        return actual_Hours__c;
    }


    /**
     * Sets the actual_Hours__c value for this Dev_Task_Defects__c.
     * 
     * @param actual_Hours__c
     */
    public void setActual_Hours__c(java.lang.Double actual_Hours__c) {
        this.actual_Hours__c = actual_Hours__c;
    }


    /**
     * Gets the application_Part__c value for this Dev_Task_Defects__c.
     * 
     * @return application_Part__c
     */
    public java.lang.String getApplication_Part__c() {
        return application_Part__c;
    }


    /**
     * Sets the application_Part__c value for this Dev_Task_Defects__c.
     * 
     * @param application_Part__c
     */
    public void setApplication_Part__c(java.lang.String application_Part__c) {
        this.application_Part__c = application_Part__c;
    }


    /**
     * Gets the associated_Project__c value for this Dev_Task_Defects__c.
     * 
     * @return associated_Project__c
     */
    public java.lang.String getAssociated_Project__c() {
        return associated_Project__c;
    }


    /**
     * Sets the associated_Project__c value for this Dev_Task_Defects__c.
     * 
     * @param associated_Project__c
     */
    public void setAssociated_Project__c(java.lang.String associated_Project__c) {
        this.associated_Project__c = associated_Project__c;
    }


    /**
     * Gets the attachments value for this Dev_Task_Defects__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Dev_Task_Defects__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the breaking__c value for this Dev_Task_Defects__c.
     * 
     * @return breaking__c
     */
    public java.lang.Boolean getBreaking__c() {
        return breaking__c;
    }


    /**
     * Sets the breaking__c value for this Dev_Task_Defects__c.
     * 
     * @param breaking__c
     */
    public void setBreaking__c(java.lang.Boolean breaking__c) {
        this.breaking__c = breaking__c;
    }


    /**
     * Gets the category__c value for this Dev_Task_Defects__c.
     * 
     * @return category__c
     */
    public java.lang.String getCategory__c() {
        return category__c;
    }


    /**
     * Sets the category__c value for this Dev_Task_Defects__c.
     * 
     * @param category__c
     */
    public void setCategory__c(java.lang.String category__c) {
        this.category__c = category__c;
    }


    /**
     * Gets the createdBy value for this Dev_Task_Defects__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Dev_Task_Defects__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Dev_Task_Defects__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Dev_Task_Defects__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Dev_Task_Defects__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Dev_Task_Defects__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the current_Status_Notes__c value for this Dev_Task_Defects__c.
     * 
     * @return current_Status_Notes__c
     */
    public java.lang.String getCurrent_Status_Notes__c() {
        return current_Status_Notes__c;
    }


    /**
     * Sets the current_Status_Notes__c value for this Dev_Task_Defects__c.
     * 
     * @param current_Status_Notes__c
     */
    public void setCurrent_Status_Notes__c(java.lang.String current_Status_Notes__c) {
        this.current_Status_Notes__c = current_Status_Notes__c;
    }


    /**
     * Gets the defect_Status__c value for this Dev_Task_Defects__c.
     * 
     * @return defect_Status__c
     */
    public java.lang.String getDefect_Status__c() {
        return defect_Status__c;
    }


    /**
     * Sets the defect_Status__c value for this Dev_Task_Defects__c.
     * 
     * @param defect_Status__c
     */
    public void setDefect_Status__c(java.lang.String defect_Status__c) {
        this.defect_Status__c = defect_Status__c;
    }


    /**
     * Gets the defect_Type__c value for this Dev_Task_Defects__c.
     * 
     * @return defect_Type__c
     */
    public java.lang.String getDefect_Type__c() {
        return defect_Type__c;
    }


    /**
     * Sets the defect_Type__c value for this Dev_Task_Defects__c.
     * 
     * @param defect_Type__c
     */
    public void setDefect_Type__c(java.lang.String defect_Type__c) {
        this.defect_Type__c = defect_Type__c;
    }


    /**
     * Gets the defects_Artifact_ID_s__c value for this Dev_Task_Defects__c.
     * 
     * @return defects_Artifact_ID_s__c
     */
    public java.lang.String getDefects_Artifact_ID_s__c() {
        return defects_Artifact_ID_s__c;
    }


    /**
     * Sets the defects_Artifact_ID_s__c value for this Dev_Task_Defects__c.
     * 
     * @param defects_Artifact_ID_s__c
     */
    public void setDefects_Artifact_ID_s__c(java.lang.String defects_Artifact_ID_s__c) {
        this.defects_Artifact_ID_s__c = defects_Artifact_ID_s__c;
    }


    /**
     * Gets the dependent_On_Third_Party__c value for this Dev_Task_Defects__c.
     * 
     * @return dependent_On_Third_Party__c
     */
    public java.lang.Boolean getDependent_On_Third_Party__c() {
        return dependent_On_Third_Party__c;
    }


    /**
     * Sets the dependent_On_Third_Party__c value for this Dev_Task_Defects__c.
     * 
     * @param dependent_On_Third_Party__c
     */
    public void setDependent_On_Third_Party__c(java.lang.Boolean dependent_On_Third_Party__c) {
        this.dependent_On_Third_Party__c = dependent_On_Third_Party__c;
    }


    /**
     * Gets the description__c value for this Dev_Task_Defects__c.
     * 
     * @return description__c
     */
    public java.lang.String getDescription__c() {
        return description__c;
    }


    /**
     * Sets the description__c value for this Dev_Task_Defects__c.
     * 
     * @param description__c
     */
    public void setDescription__c(java.lang.String description__c) {
        this.description__c = description__c;
    }


    /**
     * Gets the dev_Priority__c value for this Dev_Task_Defects__c.
     * 
     * @return dev_Priority__c
     */
    public java.lang.String getDev_Priority__c() {
        return dev_Priority__c;
    }


    /**
     * Sets the dev_Priority__c value for this Dev_Task_Defects__c.
     * 
     * @param dev_Priority__c
     */
    public void setDev_Priority__c(java.lang.String dev_Priority__c) {
        this.dev_Priority__c = dev_Priority__c;
    }


    /**
     * Gets the dominu_Tasks__r value for this Dev_Task_Defects__c.
     * 
     * @return dominu_Tasks__r
     */
    public com.sforce.soap.enterprise.QueryResult getDominu_Tasks__r() {
        return dominu_Tasks__r;
    }


    /**
     * Sets the dominu_Tasks__r value for this Dev_Task_Defects__c.
     * 
     * @param dominu_Tasks__r
     */
    public void setDominu_Tasks__r(com.sforce.soap.enterprise.QueryResult dominu_Tasks__r) {
        this.dominu_Tasks__r = dominu_Tasks__r;
    }


    /**
     * Gets the error_Message__c value for this Dev_Task_Defects__c.
     * 
     * @return error_Message__c
     */
    public java.lang.String getError_Message__c() {
        return error_Message__c;
    }


    /**
     * Sets the error_Message__c value for this Dev_Task_Defects__c.
     * 
     * @param error_Message__c
     */
    public void setError_Message__c(java.lang.String error_Message__c) {
        this.error_Message__c = error_Message__c;
    }


    /**
     * Gets the est_Hours_High__c value for this Dev_Task_Defects__c.
     * 
     * @return est_Hours_High__c
     */
    public java.lang.Double getEst_Hours_High__c() {
        return est_Hours_High__c;
    }


    /**
     * Sets the est_Hours_High__c value for this Dev_Task_Defects__c.
     * 
     * @param est_Hours_High__c
     */
    public void setEst_Hours_High__c(java.lang.Double est_Hours_High__c) {
        this.est_Hours_High__c = est_Hours_High__c;
    }


    /**
     * Gets the est_Hours_Low__c value for this Dev_Task_Defects__c.
     * 
     * @return est_Hours_Low__c
     */
    public java.lang.Double getEst_Hours_Low__c() {
        return est_Hours_Low__c;
    }


    /**
     * Sets the est_Hours_Low__c value for this Dev_Task_Defects__c.
     * 
     * @param est_Hours_Low__c
     */
    public void setEst_Hours_Low__c(java.lang.Double est_Hours_Low__c) {
        this.est_Hours_Low__c = est_Hours_Low__c;
    }


    /**
     * Gets the est_Hours__c value for this Dev_Task_Defects__c.
     * 
     * @return est_Hours__c
     */
    public java.lang.Double getEst_Hours__c() {
        return est_Hours__c;
    }


    /**
     * Sets the est_Hours__c value for this Dev_Task_Defects__c.
     * 
     * @param est_Hours__c
     */
    public void setEst_Hours__c(java.lang.Double est_Hours__c) {
        this.est_Hours__c = est_Hours__c;
    }


    /**
     * Gets the events value for this Dev_Task_Defects__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Dev_Task_Defects__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the feature__c value for this Dev_Task_Defects__c.
     * 
     * @return feature__c
     */
    public java.lang.String getFeature__c() {
        return feature__c;
    }


    /**
     * Sets the feature__c value for this Dev_Task_Defects__c.
     * 
     * @param feature__c
     */
    public void setFeature__c(java.lang.String feature__c) {
        this.feature__c = feature__c;
    }


    /**
     * Gets the feature__r value for this Dev_Task_Defects__c.
     * 
     * @return feature__r
     */
    public com.sforce.soap.enterprise.sobject.Feature__c getFeature__r() {
        return feature__r;
    }


    /**
     * Sets the feature__r value for this Dev_Task_Defects__c.
     * 
     * @param feature__r
     */
    public void setFeature__r(com.sforce.soap.enterprise.sobject.Feature__c feature__r) {
        this.feature__r = feature__r;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Dev_Task_Defects__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Dev_Task_Defects__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the fixed_By__c value for this Dev_Task_Defects__c.
     * 
     * @return fixed_By__c
     */
    public java.lang.String getFixed_By__c() {
        return fixed_By__c;
    }


    /**
     * Sets the fixed_By__c value for this Dev_Task_Defects__c.
     * 
     * @param fixed_By__c
     */
    public void setFixed_By__c(java.lang.String fixed_By__c) {
        this.fixed_By__c = fixed_By__c;
    }


    /**
     * Gets the fixed_By__r value for this Dev_Task_Defects__c.
     * 
     * @return fixed_By__r
     */
    public com.sforce.soap.enterprise.sobject.User getFixed_By__r() {
        return fixed_By__r;
    }


    /**
     * Sets the fixed_By__r value for this Dev_Task_Defects__c.
     * 
     * @param fixed_By__r
     */
    public void setFixed_By__r(com.sforce.soap.enterprise.sobject.User fixed_By__r) {
        this.fixed_By__r = fixed_By__r;
    }


    /**
     * Gets the fixed_Date__c value for this Dev_Task_Defects__c.
     * 
     * @return fixed_Date__c
     */
    public java.util.Date getFixed_Date__c() {
        return fixed_Date__c;
    }


    /**
     * Sets the fixed_Date__c value for this Dev_Task_Defects__c.
     * 
     * @param fixed_Date__c
     */
    public void setFixed_Date__c(java.util.Date fixed_Date__c) {
        this.fixed_Date__c = fixed_Date__c;
    }


    /**
     * Gets the hours_Spent_Week_Before_Complete__c value for this Dev_Task_Defects__c.
     * 
     * @return hours_Spent_Week_Before_Complete__c
     */
    public java.lang.Double getHours_Spent_Week_Before_Complete__c() {
        return hours_Spent_Week_Before_Complete__c;
    }


    /**
     * Sets the hours_Spent_Week_Before_Complete__c value for this Dev_Task_Defects__c.
     * 
     * @param hours_Spent_Week_Before_Complete__c
     */
    public void setHours_Spent_Week_Before_Complete__c(java.lang.Double hours_Spent_Week_Before_Complete__c) {
        this.hours_Spent_Week_Before_Complete__c = hours_Spent_Week_Before_Complete__c;
    }


    /**
     * Gets the hours__c value for this Dev_Task_Defects__c.
     * 
     * @return hours__c
     */
    public java.lang.Double getHours__c() {
        return hours__c;
    }


    /**
     * Sets the hours__c value for this Dev_Task_Defects__c.
     * 
     * @param hours__c
     */
    public void setHours__c(java.lang.Double hours__c) {
        this.hours__c = hours__c;
    }


    /**
     * Gets the isDeleted value for this Dev_Task_Defects__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Dev_Task_Defects__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the is_Production_Defect__c value for this Dev_Task_Defects__c.
     * 
     * @return is_Production_Defect__c
     */
    public java.lang.Boolean getIs_Production_Defect__c() {
        return is_Production_Defect__c;
    }


    /**
     * Sets the is_Production_Defect__c value for this Dev_Task_Defects__c.
     * 
     * @param is_Production_Defect__c
     */
    public void setIs_Production_Defect__c(java.lang.Boolean is_Production_Defect__c) {
        this.is_Production_Defect__c = is_Production_Defect__c;
    }


    /**
     * Gets the keywords__c value for this Dev_Task_Defects__c.
     * 
     * @return keywords__c
     */
    public java.lang.String getKeywords__c() {
        return keywords__c;
    }


    /**
     * Sets the keywords__c value for this Dev_Task_Defects__c.
     * 
     * @param keywords__c
     */
    public void setKeywords__c(java.lang.String keywords__c) {
        this.keywords__c = keywords__c;
    }


    /**
     * Gets the lastActivityDate value for this Dev_Task_Defects__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Dev_Task_Defects__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this Dev_Task_Defects__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Dev_Task_Defects__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Dev_Task_Defects__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Dev_Task_Defects__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Dev_Task_Defects__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Dev_Task_Defects__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the level_of_Initial_Dev_Effort__c value for this Dev_Task_Defects__c.
     * 
     * @return level_of_Initial_Dev_Effort__c
     */
    public java.lang.String getLevel_of_Initial_Dev_Effort__c() {
        return level_of_Initial_Dev_Effort__c;
    }


    /**
     * Sets the level_of_Initial_Dev_Effort__c value for this Dev_Task_Defects__c.
     * 
     * @param level_of_Initial_Dev_Effort__c
     */
    public void setLevel_of_Initial_Dev_Effort__c(java.lang.String level_of_Initial_Dev_Effort__c) {
        this.level_of_Initial_Dev_Effort__c = level_of_Initial_Dev_Effort__c;
    }


    /**
     * Gets the name value for this Dev_Task_Defects__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Dev_Task_Defects__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the name__c value for this Dev_Task_Defects__c.
     * 
     * @return name__c
     */
    public java.lang.String getName__c() {
        return name__c;
    }


    /**
     * Sets the name__c value for this Dev_Task_Defects__c.
     * 
     * @param name__c
     */
    public void setName__c(java.lang.String name__c) {
        this.name__c = name__c;
    }


    /**
     * Gets the notes value for this Dev_Task_Defects__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Dev_Task_Defects__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Dev_Task_Defects__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Dev_Task_Defects__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the notes__c value for this Dev_Task_Defects__c.
     * 
     * @return notes__c
     */
    public java.lang.String getNotes__c() {
        return notes__c;
    }


    /**
     * Sets the notes__c value for this Dev_Task_Defects__c.
     * 
     * @param notes__c
     */
    public void setNotes__c(java.lang.String notes__c) {
        this.notes__c = notes__c;
    }


    /**
     * Gets the openActivities value for this Dev_Task_Defects__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this Dev_Task_Defects__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the owner value for this Dev_Task_Defects__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Dev_Task_Defects__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Dev_Task_Defects__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Dev_Task_Defects__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the priority__c value for this Dev_Task_Defects__c.
     * 
     * @return priority__c
     */
    public java.lang.String getPriority__c() {
        return priority__c;
    }


    /**
     * Sets the priority__c value for this Dev_Task_Defects__c.
     * 
     * @param priority__c
     */
    public void setPriority__c(java.lang.String priority__c) {
        this.priority__c = priority__c;
    }


    /**
     * Gets the processInstances value for this Dev_Task_Defects__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Dev_Task_Defects__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Dev_Task_Defects__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Dev_Task_Defects__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the project__c value for this Dev_Task_Defects__c.
     * 
     * @return project__c
     */
    public java.lang.String getProject__c() {
        return project__c;
    }


    /**
     * Sets the project__c value for this Dev_Task_Defects__c.
     * 
     * @param project__c
     */
    public void setProject__c(java.lang.String project__c) {
        this.project__c = project__c;
    }


    /**
     * Gets the projected_End_Date__c value for this Dev_Task_Defects__c.
     * 
     * @return projected_End_Date__c
     */
    public java.util.Date getProjected_End_Date__c() {
        return projected_End_Date__c;
    }


    /**
     * Sets the projected_End_Date__c value for this Dev_Task_Defects__c.
     * 
     * @param projected_End_Date__c
     */
    public void setProjected_End_Date__c(java.util.Date projected_End_Date__c) {
        this.projected_End_Date__c = projected_End_Date__c;
    }


    /**
     * Gets the recordType value for this Dev_Task_Defects__c.
     * 
     * @return recordType
     */
    public com.sforce.soap.enterprise.sobject.RecordType getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this Dev_Task_Defects__c.
     * 
     * @param recordType
     */
    public void setRecordType(com.sforce.soap.enterprise.sobject.RecordType recordType) {
        this.recordType = recordType;
    }


    /**
     * Gets the recordTypeId value for this Dev_Task_Defects__c.
     * 
     * @return recordTypeId
     */
    public java.lang.String getRecordTypeId() {
        return recordTypeId;
    }


    /**
     * Sets the recordTypeId value for this Dev_Task_Defects__c.
     * 
     * @param recordTypeId
     */
    public void setRecordTypeId(java.lang.String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }


    /**
     * Gets the regression__c value for this Dev_Task_Defects__c.
     * 
     * @return regression__c
     */
    public java.lang.Boolean getRegression__c() {
        return regression__c;
    }


    /**
     * Sets the regression__c value for this Dev_Task_Defects__c.
     * 
     * @param regression__c
     */
    public void setRegression__c(java.lang.Boolean regression__c) {
        this.regression__c = regression__c;
    }


    /**
     * Gets the related_Dominus_Task__c value for this Dev_Task_Defects__c.
     * 
     * @return related_Dominus_Task__c
     */
    public java.lang.String getRelated_Dominus_Task__c() {
        return related_Dominus_Task__c;
    }


    /**
     * Sets the related_Dominus_Task__c value for this Dev_Task_Defects__c.
     * 
     * @param related_Dominus_Task__c
     */
    public void setRelated_Dominus_Task__c(java.lang.String related_Dominus_Task__c) {
        this.related_Dominus_Task__c = related_Dominus_Task__c;
    }


    /**
     * Gets the related_Dominus_Task__r value for this Dev_Task_Defects__c.
     * 
     * @return related_Dominus_Task__r
     */
    public com.sforce.soap.enterprise.sobject.Dev_Task_Defects__c getRelated_Dominus_Task__r() {
        return related_Dominus_Task__r;
    }


    /**
     * Sets the related_Dominus_Task__r value for this Dev_Task_Defects__c.
     * 
     * @param related_Dominus_Task__r
     */
    public void setRelated_Dominus_Task__r(com.sforce.soap.enterprise.sobject.Dev_Task_Defects__c related_Dominus_Task__r) {
        this.related_Dominus_Task__r = related_Dominus_Task__r;
    }


    /**
     * Gets the release_Project__c value for this Dev_Task_Defects__c.
     * 
     * @return release_Project__c
     */
    public java.lang.String getRelease_Project__c() {
        return release_Project__c;
    }


    /**
     * Sets the release_Project__c value for this Dev_Task_Defects__c.
     * 
     * @param release_Project__c
     */
    public void setRelease_Project__c(java.lang.String release_Project__c) {
        this.release_Project__c = release_Project__c;
    }


    /**
     * Gets the release_Project__r value for this Dev_Task_Defects__c.
     * 
     * @return release_Project__r
     */
    public com.sforce.soap.enterprise.sobject.Release__c getRelease_Project__r() {
        return release_Project__r;
    }


    /**
     * Sets the release_Project__r value for this Dev_Task_Defects__c.
     * 
     * @param release_Project__r
     */
    public void setRelease_Project__r(com.sforce.soap.enterprise.sobject.Release__c release_Project__r) {
        this.release_Project__r = release_Project__r;
    }


    /**
     * Gets the requested_By__c value for this Dev_Task_Defects__c.
     * 
     * @return requested_By__c
     */
    public java.lang.String getRequested_By__c() {
        return requested_By__c;
    }


    /**
     * Sets the requested_By__c value for this Dev_Task_Defects__c.
     * 
     * @param requested_By__c
     */
    public void setRequested_By__c(java.lang.String requested_By__c) {
        this.requested_By__c = requested_By__c;
    }


    /**
     * Gets the return__c value for this Dev_Task_Defects__c.
     * 
     * @return return__c
     */
    public java.lang.String getReturn__c() {
        return return__c;
    }


    /**
     * Sets the return__c value for this Dev_Task_Defects__c.
     * 
     * @param return__c
     */
    public void setReturn__c(java.lang.String return__c) {
        this.return__c = return__c;
    }


    /**
     * Gets the send_Notification_Email__c value for this Dev_Task_Defects__c.
     * 
     * @return send_Notification_Email__c
     */
    public java.lang.Boolean getSend_Notification_Email__c() {
        return send_Notification_Email__c;
    }


    /**
     * Sets the send_Notification_Email__c value for this Dev_Task_Defects__c.
     * 
     * @param send_Notification_Email__c
     */
    public void setSend_Notification_Email__c(java.lang.Boolean send_Notification_Email__c) {
        this.send_Notification_Email__c = send_Notification_Email__c;
    }


    /**
     * Gets the severity__c value for this Dev_Task_Defects__c.
     * 
     * @return severity__c
     */
    public java.lang.String getSeverity__c() {
        return severity__c;
    }


    /**
     * Sets the severity__c value for this Dev_Task_Defects__c.
     * 
     * @param severity__c
     */
    public void setSeverity__c(java.lang.String severity__c) {
        this.severity__c = severity__c;
    }


    /**
     * Gets the short_Task_Name__c value for this Dev_Task_Defects__c.
     * 
     * @return short_Task_Name__c
     */
    public java.lang.String getShort_Task_Name__c() {
        return short_Task_Name__c;
    }


    /**
     * Sets the short_Task_Name__c value for this Dev_Task_Defects__c.
     * 
     * @param short_Task_Name__c
     */
    public void setShort_Task_Name__c(java.lang.String short_Task_Name__c) {
        this.short_Task_Name__c = short_Task_Name__c;
    }


    /**
     * Gets the status__c value for this Dev_Task_Defects__c.
     * 
     * @return status__c
     */
    public java.lang.String getStatus__c() {
        return status__c;
    }


    /**
     * Sets the status__c value for this Dev_Task_Defects__c.
     * 
     * @param status__c
     */
    public void setStatus__c(java.lang.String status__c) {
        this.status__c = status__c;
    }


    /**
     * Gets the steps_To_Reproduce__c value for this Dev_Task_Defects__c.
     * 
     * @return steps_To_Reproduce__c
     */
    public java.lang.String getSteps_To_Reproduce__c() {
        return steps_To_Reproduce__c;
    }


    /**
     * Sets the steps_To_Reproduce__c value for this Dev_Task_Defects__c.
     * 
     * @param steps_To_Reproduce__c
     */
    public void setSteps_To_Reproduce__c(java.lang.String steps_To_Reproduce__c) {
        this.steps_To_Reproduce__c = steps_To_Reproduce__c;
    }


    /**
     * Gets the systemModstamp value for this Dev_Task_Defects__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Dev_Task_Defects__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the system_Created_By__c value for this Dev_Task_Defects__c.
     * 
     * @return system_Created_By__c
     */
    public java.lang.String getSystem_Created_By__c() {
        return system_Created_By__c;
    }


    /**
     * Sets the system_Created_By__c value for this Dev_Task_Defects__c.
     * 
     * @param system_Created_By__c
     */
    public void setSystem_Created_By__c(java.lang.String system_Created_By__c) {
        this.system_Created_By__c = system_Created_By__c;
    }


    /**
     * Gets the system_Created_On__c value for this Dev_Task_Defects__c.
     * 
     * @return system_Created_On__c
     */
    public java.util.Calendar getSystem_Created_On__c() {
        return system_Created_On__c;
    }


    /**
     * Sets the system_Created_On__c value for this Dev_Task_Defects__c.
     * 
     * @param system_Created_On__c
     */
    public void setSystem_Created_On__c(java.util.Calendar system_Created_On__c) {
        this.system_Created_On__c = system_Created_On__c;
    }


    /**
     * Gets the system_Last_Modified_B__c value for this Dev_Task_Defects__c.
     * 
     * @return system_Last_Modified_B__c
     */
    public java.lang.String getSystem_Last_Modified_B__c() {
        return system_Last_Modified_B__c;
    }


    /**
     * Sets the system_Last_Modified_B__c value for this Dev_Task_Defects__c.
     * 
     * @param system_Last_Modified_B__c
     */
    public void setSystem_Last_Modified_B__c(java.lang.String system_Last_Modified_B__c) {
        this.system_Last_Modified_B__c = system_Last_Modified_B__c;
    }


    /**
     * Gets the system_Last_Modified_On__c value for this Dev_Task_Defects__c.
     * 
     * @return system_Last_Modified_On__c
     */
    public java.util.Calendar getSystem_Last_Modified_On__c() {
        return system_Last_Modified_On__c;
    }


    /**
     * Sets the system_Last_Modified_On__c value for this Dev_Task_Defects__c.
     * 
     * @param system_Last_Modified_On__c
     */
    public void setSystem_Last_Modified_On__c(java.util.Calendar system_Last_Modified_On__c) {
        this.system_Last_Modified_On__c = system_Last_Modified_On__c;
    }


    /**
     * Gets the task_Defect_Name__c value for this Dev_Task_Defects__c.
     * 
     * @return task_Defect_Name__c
     */
    public java.lang.String getTask_Defect_Name__c() {
        return task_Defect_Name__c;
    }


    /**
     * Sets the task_Defect_Name__c value for this Dev_Task_Defects__c.
     * 
     * @param task_Defect_Name__c
     */
    public void setTask_Defect_Name__c(java.lang.String task_Defect_Name__c) {
        this.task_Defect_Name__c = task_Defect_Name__c;
    }


    /**
     * Gets the task__c value for this Dev_Task_Defects__c.
     * 
     * @return task__c
     */
    public java.lang.String getTask__c() {
        return task__c;
    }


    /**
     * Sets the task__c value for this Dev_Task_Defects__c.
     * 
     * @param task__c
     */
    public void setTask__c(java.lang.String task__c) {
        this.task__c = task__c;
    }


    /**
     * Gets the tasks value for this Dev_Task_Defects__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Dev_Task_Defects__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the test_Case_QA_Validation__c value for this Dev_Task_Defects__c.
     * 
     * @return test_Case_QA_Validation__c
     */
    public java.lang.String getTest_Case_QA_Validation__c() {
        return test_Case_QA_Validation__c;
    }


    /**
     * Sets the test_Case_QA_Validation__c value for this Dev_Task_Defects__c.
     * 
     * @param test_Case_QA_Validation__c
     */
    public void setTest_Case_QA_Validation__c(java.lang.String test_Case_QA_Validation__c) {
        this.test_Case_QA_Validation__c = test_Case_QA_Validation__c;
    }


    /**
     * Gets the tested_By__c value for this Dev_Task_Defects__c.
     * 
     * @return tested_By__c
     */
    public java.lang.String getTested_By__c() {
        return tested_By__c;
    }


    /**
     * Sets the tested_By__c value for this Dev_Task_Defects__c.
     * 
     * @param tested_By__c
     */
    public void setTested_By__c(java.lang.String tested_By__c) {
        this.tested_By__c = tested_By__c;
    }


    /**
     * Gets the tested_By__r value for this Dev_Task_Defects__c.
     * 
     * @return tested_By__r
     */
    public com.sforce.soap.enterprise.sobject.User getTested_By__r() {
        return tested_By__r;
    }


    /**
     * Sets the tested_By__r value for this Dev_Task_Defects__c.
     * 
     * @param tested_By__r
     */
    public void setTested_By__r(com.sforce.soap.enterprise.sobject.User tested_By__r) {
        this.tested_By__r = tested_By__r;
    }


    /**
     * Gets the tested_Date__c value for this Dev_Task_Defects__c.
     * 
     * @return tested_Date__c
     */
    public java.util.Date getTested_Date__c() {
        return tested_Date__c;
    }


    /**
     * Sets the tested_Date__c value for this Dev_Task_Defects__c.
     * 
     * @param tested_Date__c
     */
    public void setTested_Date__c(java.util.Date tested_Date__c) {
        this.tested_Date__c = tested_Date__c;
    }


    /**
     * Gets the type__c value for this Dev_Task_Defects__c.
     * 
     * @return type__c
     */
    public java.lang.String getType__c() {
        return type__c;
    }


    /**
     * Sets the type__c value for this Dev_Task_Defects__c.
     * 
     * @param type__c
     */
    public void setType__c(java.lang.String type__c) {
        this.type__c = type__c;
    }


    /**
     * Gets the URL__c value for this Dev_Task_Defects__c.
     * 
     * @return URL__c
     */
    public java.lang.String getURL__c() {
        return URL__c;
    }


    /**
     * Sets the URL__c value for this Dev_Task_Defects__c.
     * 
     * @param URL__c
     */
    public void setURL__c(java.lang.String URL__c) {
        this.URL__c = URL__c;
    }


    /**
     * Gets the user__c value for this Dev_Task_Defects__c.
     * 
     * @return user__c
     */
    public java.lang.String getUser__c() {
        return user__c;
    }


    /**
     * Sets the user__c value for this Dev_Task_Defects__c.
     * 
     * @param user__c
     */
    public void setUser__c(java.lang.String user__c) {
        this.user__c = user__c;
    }


    /**
     * Gets the user__r value for this Dev_Task_Defects__c.
     * 
     * @return user__r
     */
    public com.sforce.soap.enterprise.sobject.User getUser__r() {
        return user__r;
    }


    /**
     * Sets the user__r value for this Dev_Task_Defects__c.
     * 
     * @param user__r
     */
    public void setUser__r(com.sforce.soap.enterprise.sobject.User user__r) {
        this.user__r = user__r;
    }


    /**
     * Gets the version_Found__c value for this Dev_Task_Defects__c.
     * 
     * @return version_Found__c
     */
    public java.lang.String getVersion_Found__c() {
        return version_Found__c;
    }


    /**
     * Sets the version_Found__c value for this Dev_Task_Defects__c.
     * 
     * @param version_Found__c
     */
    public void setVersion_Found__c(java.lang.String version_Found__c) {
        this.version_Found__c = version_Found__c;
    }


    /**
     * Gets the version_Released__c value for this Dev_Task_Defects__c.
     * 
     * @return version_Released__c
     */
    public java.lang.String getVersion_Released__c() {
        return version_Released__c;
    }


    /**
     * Sets the version_Released__c value for this Dev_Task_Defects__c.
     * 
     * @param version_Released__c
     */
    public void setVersion_Released__c(java.lang.String version_Released__c) {
        this.version_Released__c = version_Released__c;
    }


    /**
     * Gets the version_s_Performed__c value for this Dev_Task_Defects__c.
     * 
     * @return version_s_Performed__c
     */
    public java.lang.String getVersion_s_Performed__c() {
        return version_s_Performed__c;
    }


    /**
     * Sets the version_s_Performed__c value for this Dev_Task_Defects__c.
     * 
     * @param version_s_Performed__c
     */
    public void setVersion_s_Performed__c(java.lang.String version_s_Performed__c) {
        this.version_s_Performed__c = version_s_Performed__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Dev_Task_Defects__c)) return false;
        Dev_Task_Defects__c other = (Dev_Task_Defects__c) obj;
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
            ((this.actual_End_Date__c==null && other.getActual_End_Date__c()==null) || 
             (this.actual_End_Date__c!=null &&
              this.actual_End_Date__c.equals(other.getActual_End_Date__c()))) &&
            ((this.actual_Hours__c==null && other.getActual_Hours__c()==null) || 
             (this.actual_Hours__c!=null &&
              this.actual_Hours__c.equals(other.getActual_Hours__c()))) &&
            ((this.application_Part__c==null && other.getApplication_Part__c()==null) || 
             (this.application_Part__c!=null &&
              this.application_Part__c.equals(other.getApplication_Part__c()))) &&
            ((this.associated_Project__c==null && other.getAssociated_Project__c()==null) || 
             (this.associated_Project__c!=null &&
              this.associated_Project__c.equals(other.getAssociated_Project__c()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.breaking__c==null && other.getBreaking__c()==null) || 
             (this.breaking__c!=null &&
              this.breaking__c.equals(other.getBreaking__c()))) &&
            ((this.category__c==null && other.getCategory__c()==null) || 
             (this.category__c!=null &&
              this.category__c.equals(other.getCategory__c()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.current_Status_Notes__c==null && other.getCurrent_Status_Notes__c()==null) || 
             (this.current_Status_Notes__c!=null &&
              this.current_Status_Notes__c.equals(other.getCurrent_Status_Notes__c()))) &&
            ((this.defect_Status__c==null && other.getDefect_Status__c()==null) || 
             (this.defect_Status__c!=null &&
              this.defect_Status__c.equals(other.getDefect_Status__c()))) &&
            ((this.defect_Type__c==null && other.getDefect_Type__c()==null) || 
             (this.defect_Type__c!=null &&
              this.defect_Type__c.equals(other.getDefect_Type__c()))) &&
            ((this.defects_Artifact_ID_s__c==null && other.getDefects_Artifact_ID_s__c()==null) || 
             (this.defects_Artifact_ID_s__c!=null &&
              this.defects_Artifact_ID_s__c.equals(other.getDefects_Artifact_ID_s__c()))) &&
            ((this.dependent_On_Third_Party__c==null && other.getDependent_On_Third_Party__c()==null) || 
             (this.dependent_On_Third_Party__c!=null &&
              this.dependent_On_Third_Party__c.equals(other.getDependent_On_Third_Party__c()))) &&
            ((this.description__c==null && other.getDescription__c()==null) || 
             (this.description__c!=null &&
              this.description__c.equals(other.getDescription__c()))) &&
            ((this.dev_Priority__c==null && other.getDev_Priority__c()==null) || 
             (this.dev_Priority__c!=null &&
              this.dev_Priority__c.equals(other.getDev_Priority__c()))) &&
            ((this.dominu_Tasks__r==null && other.getDominu_Tasks__r()==null) || 
             (this.dominu_Tasks__r!=null &&
              this.dominu_Tasks__r.equals(other.getDominu_Tasks__r()))) &&
            ((this.error_Message__c==null && other.getError_Message__c()==null) || 
             (this.error_Message__c!=null &&
              this.error_Message__c.equals(other.getError_Message__c()))) &&
            ((this.est_Hours_High__c==null && other.getEst_Hours_High__c()==null) || 
             (this.est_Hours_High__c!=null &&
              this.est_Hours_High__c.equals(other.getEst_Hours_High__c()))) &&
            ((this.est_Hours_Low__c==null && other.getEst_Hours_Low__c()==null) || 
             (this.est_Hours_Low__c!=null &&
              this.est_Hours_Low__c.equals(other.getEst_Hours_Low__c()))) &&
            ((this.est_Hours__c==null && other.getEst_Hours__c()==null) || 
             (this.est_Hours__c!=null &&
              this.est_Hours__c.equals(other.getEst_Hours__c()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              this.events.equals(other.getEvents()))) &&
            ((this.feature__c==null && other.getFeature__c()==null) || 
             (this.feature__c!=null &&
              this.feature__c.equals(other.getFeature__c()))) &&
            ((this.feature__r==null && other.getFeature__r()==null) || 
             (this.feature__r!=null &&
              this.feature__r.equals(other.getFeature__r()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.fixed_By__c==null && other.getFixed_By__c()==null) || 
             (this.fixed_By__c!=null &&
              this.fixed_By__c.equals(other.getFixed_By__c()))) &&
            ((this.fixed_By__r==null && other.getFixed_By__r()==null) || 
             (this.fixed_By__r!=null &&
              this.fixed_By__r.equals(other.getFixed_By__r()))) &&
            ((this.fixed_Date__c==null && other.getFixed_Date__c()==null) || 
             (this.fixed_Date__c!=null &&
              this.fixed_Date__c.equals(other.getFixed_Date__c()))) &&
            ((this.hours_Spent_Week_Before_Complete__c==null && other.getHours_Spent_Week_Before_Complete__c()==null) || 
             (this.hours_Spent_Week_Before_Complete__c!=null &&
              this.hours_Spent_Week_Before_Complete__c.equals(other.getHours_Spent_Week_Before_Complete__c()))) &&
            ((this.hours__c==null && other.getHours__c()==null) || 
             (this.hours__c!=null &&
              this.hours__c.equals(other.getHours__c()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.is_Production_Defect__c==null && other.getIs_Production_Defect__c()==null) || 
             (this.is_Production_Defect__c!=null &&
              this.is_Production_Defect__c.equals(other.getIs_Production_Defect__c()))) &&
            ((this.keywords__c==null && other.getKeywords__c()==null) || 
             (this.keywords__c!=null &&
              this.keywords__c.equals(other.getKeywords__c()))) &&
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
            ((this.level_of_Initial_Dev_Effort__c==null && other.getLevel_of_Initial_Dev_Effort__c()==null) || 
             (this.level_of_Initial_Dev_Effort__c!=null &&
              this.level_of_Initial_Dev_Effort__c.equals(other.getLevel_of_Initial_Dev_Effort__c()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.name__c==null && other.getName__c()==null) || 
             (this.name__c!=null &&
              this.name__c.equals(other.getName__c()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.notes__c==null && other.getNotes__c()==null) || 
             (this.notes__c!=null &&
              this.notes__c.equals(other.getNotes__c()))) &&
            ((this.openActivities==null && other.getOpenActivities()==null) || 
             (this.openActivities!=null &&
              this.openActivities.equals(other.getOpenActivities()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.priority__c==null && other.getPriority__c()==null) || 
             (this.priority__c!=null &&
              this.priority__c.equals(other.getPriority__c()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.project__c==null && other.getProject__c()==null) || 
             (this.project__c!=null &&
              this.project__c.equals(other.getProject__c()))) &&
            ((this.projected_End_Date__c==null && other.getProjected_End_Date__c()==null) || 
             (this.projected_End_Date__c!=null &&
              this.projected_End_Date__c.equals(other.getProjected_End_Date__c()))) &&
            ((this.recordType==null && other.getRecordType()==null) || 
             (this.recordType!=null &&
              this.recordType.equals(other.getRecordType()))) &&
            ((this.recordTypeId==null && other.getRecordTypeId()==null) || 
             (this.recordTypeId!=null &&
              this.recordTypeId.equals(other.getRecordTypeId()))) &&
            ((this.regression__c==null && other.getRegression__c()==null) || 
             (this.regression__c!=null &&
              this.regression__c.equals(other.getRegression__c()))) &&
            ((this.related_Dominus_Task__c==null && other.getRelated_Dominus_Task__c()==null) || 
             (this.related_Dominus_Task__c!=null &&
              this.related_Dominus_Task__c.equals(other.getRelated_Dominus_Task__c()))) &&
            ((this.related_Dominus_Task__r==null && other.getRelated_Dominus_Task__r()==null) || 
             (this.related_Dominus_Task__r!=null &&
              this.related_Dominus_Task__r.equals(other.getRelated_Dominus_Task__r()))) &&
            ((this.release_Project__c==null && other.getRelease_Project__c()==null) || 
             (this.release_Project__c!=null &&
              this.release_Project__c.equals(other.getRelease_Project__c()))) &&
            ((this.release_Project__r==null && other.getRelease_Project__r()==null) || 
             (this.release_Project__r!=null &&
              this.release_Project__r.equals(other.getRelease_Project__r()))) &&
            ((this.requested_By__c==null && other.getRequested_By__c()==null) || 
             (this.requested_By__c!=null &&
              this.requested_By__c.equals(other.getRequested_By__c()))) &&
            ((this.return__c==null && other.getReturn__c()==null) || 
             (this.return__c!=null &&
              this.return__c.equals(other.getReturn__c()))) &&
            ((this.send_Notification_Email__c==null && other.getSend_Notification_Email__c()==null) || 
             (this.send_Notification_Email__c!=null &&
              this.send_Notification_Email__c.equals(other.getSend_Notification_Email__c()))) &&
            ((this.severity__c==null && other.getSeverity__c()==null) || 
             (this.severity__c!=null &&
              this.severity__c.equals(other.getSeverity__c()))) &&
            ((this.short_Task_Name__c==null && other.getShort_Task_Name__c()==null) || 
             (this.short_Task_Name__c!=null &&
              this.short_Task_Name__c.equals(other.getShort_Task_Name__c()))) &&
            ((this.status__c==null && other.getStatus__c()==null) || 
             (this.status__c!=null &&
              this.status__c.equals(other.getStatus__c()))) &&
            ((this.steps_To_Reproduce__c==null && other.getSteps_To_Reproduce__c()==null) || 
             (this.steps_To_Reproduce__c!=null &&
              this.steps_To_Reproduce__c.equals(other.getSteps_To_Reproduce__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.system_Created_By__c==null && other.getSystem_Created_By__c()==null) || 
             (this.system_Created_By__c!=null &&
              this.system_Created_By__c.equals(other.getSystem_Created_By__c()))) &&
            ((this.system_Created_On__c==null && other.getSystem_Created_On__c()==null) || 
             (this.system_Created_On__c!=null &&
              this.system_Created_On__c.equals(other.getSystem_Created_On__c()))) &&
            ((this.system_Last_Modified_B__c==null && other.getSystem_Last_Modified_B__c()==null) || 
             (this.system_Last_Modified_B__c!=null &&
              this.system_Last_Modified_B__c.equals(other.getSystem_Last_Modified_B__c()))) &&
            ((this.system_Last_Modified_On__c==null && other.getSystem_Last_Modified_On__c()==null) || 
             (this.system_Last_Modified_On__c!=null &&
              this.system_Last_Modified_On__c.equals(other.getSystem_Last_Modified_On__c()))) &&
            ((this.task_Defect_Name__c==null && other.getTask_Defect_Name__c()==null) || 
             (this.task_Defect_Name__c!=null &&
              this.task_Defect_Name__c.equals(other.getTask_Defect_Name__c()))) &&
            ((this.task__c==null && other.getTask__c()==null) || 
             (this.task__c!=null &&
              this.task__c.equals(other.getTask__c()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              this.tasks.equals(other.getTasks()))) &&
            ((this.test_Case_QA_Validation__c==null && other.getTest_Case_QA_Validation__c()==null) || 
             (this.test_Case_QA_Validation__c!=null &&
              this.test_Case_QA_Validation__c.equals(other.getTest_Case_QA_Validation__c()))) &&
            ((this.tested_By__c==null && other.getTested_By__c()==null) || 
             (this.tested_By__c!=null &&
              this.tested_By__c.equals(other.getTested_By__c()))) &&
            ((this.tested_By__r==null && other.getTested_By__r()==null) || 
             (this.tested_By__r!=null &&
              this.tested_By__r.equals(other.getTested_By__r()))) &&
            ((this.tested_Date__c==null && other.getTested_Date__c()==null) || 
             (this.tested_Date__c!=null &&
              this.tested_Date__c.equals(other.getTested_Date__c()))) &&
            ((this.type__c==null && other.getType__c()==null) || 
             (this.type__c!=null &&
              this.type__c.equals(other.getType__c()))) &&
            ((this.URL__c==null && other.getURL__c()==null) || 
             (this.URL__c!=null &&
              this.URL__c.equals(other.getURL__c()))) &&
            ((this.user__c==null && other.getUser__c()==null) || 
             (this.user__c!=null &&
              this.user__c.equals(other.getUser__c()))) &&
            ((this.user__r==null && other.getUser__r()==null) || 
             (this.user__r!=null &&
              this.user__r.equals(other.getUser__r()))) &&
            ((this.version_Found__c==null && other.getVersion_Found__c()==null) || 
             (this.version_Found__c!=null &&
              this.version_Found__c.equals(other.getVersion_Found__c()))) &&
            ((this.version_Released__c==null && other.getVersion_Released__c()==null) || 
             (this.version_Released__c!=null &&
              this.version_Released__c.equals(other.getVersion_Released__c()))) &&
            ((this.version_s_Performed__c==null && other.getVersion_s_Performed__c()==null) || 
             (this.version_s_Performed__c!=null &&
              this.version_s_Performed__c.equals(other.getVersion_s_Performed__c())));
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
        if (getActual_End_Date__c() != null) {
            _hashCode += getActual_End_Date__c().hashCode();
        }
        if (getActual_Hours__c() != null) {
            _hashCode += getActual_Hours__c().hashCode();
        }
        if (getApplication_Part__c() != null) {
            _hashCode += getApplication_Part__c().hashCode();
        }
        if (getAssociated_Project__c() != null) {
            _hashCode += getAssociated_Project__c().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getBreaking__c() != null) {
            _hashCode += getBreaking__c().hashCode();
        }
        if (getCategory__c() != null) {
            _hashCode += getCategory__c().hashCode();
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
        if (getCurrent_Status_Notes__c() != null) {
            _hashCode += getCurrent_Status_Notes__c().hashCode();
        }
        if (getDefect_Status__c() != null) {
            _hashCode += getDefect_Status__c().hashCode();
        }
        if (getDefect_Type__c() != null) {
            _hashCode += getDefect_Type__c().hashCode();
        }
        if (getDefects_Artifact_ID_s__c() != null) {
            _hashCode += getDefects_Artifact_ID_s__c().hashCode();
        }
        if (getDependent_On_Third_Party__c() != null) {
            _hashCode += getDependent_On_Third_Party__c().hashCode();
        }
        if (getDescription__c() != null) {
            _hashCode += getDescription__c().hashCode();
        }
        if (getDev_Priority__c() != null) {
            _hashCode += getDev_Priority__c().hashCode();
        }
        if (getDominu_Tasks__r() != null) {
            _hashCode += getDominu_Tasks__r().hashCode();
        }
        if (getError_Message__c() != null) {
            _hashCode += getError_Message__c().hashCode();
        }
        if (getEst_Hours_High__c() != null) {
            _hashCode += getEst_Hours_High__c().hashCode();
        }
        if (getEst_Hours_Low__c() != null) {
            _hashCode += getEst_Hours_Low__c().hashCode();
        }
        if (getEst_Hours__c() != null) {
            _hashCode += getEst_Hours__c().hashCode();
        }
        if (getEvents() != null) {
            _hashCode += getEvents().hashCode();
        }
        if (getFeature__c() != null) {
            _hashCode += getFeature__c().hashCode();
        }
        if (getFeature__r() != null) {
            _hashCode += getFeature__r().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getFixed_By__c() != null) {
            _hashCode += getFixed_By__c().hashCode();
        }
        if (getFixed_By__r() != null) {
            _hashCode += getFixed_By__r().hashCode();
        }
        if (getFixed_Date__c() != null) {
            _hashCode += getFixed_Date__c().hashCode();
        }
        if (getHours_Spent_Week_Before_Complete__c() != null) {
            _hashCode += getHours_Spent_Week_Before_Complete__c().hashCode();
        }
        if (getHours__c() != null) {
            _hashCode += getHours__c().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getIs_Production_Defect__c() != null) {
            _hashCode += getIs_Production_Defect__c().hashCode();
        }
        if (getKeywords__c() != null) {
            _hashCode += getKeywords__c().hashCode();
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
        if (getLevel_of_Initial_Dev_Effort__c() != null) {
            _hashCode += getLevel_of_Initial_Dev_Effort__c().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getName__c() != null) {
            _hashCode += getName__c().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getNotesAndAttachments() != null) {
            _hashCode += getNotesAndAttachments().hashCode();
        }
        if (getNotes__c() != null) {
            _hashCode += getNotes__c().hashCode();
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
        if (getPriority__c() != null) {
            _hashCode += getPriority__c().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getProject__c() != null) {
            _hashCode += getProject__c().hashCode();
        }
        if (getProjected_End_Date__c() != null) {
            _hashCode += getProjected_End_Date__c().hashCode();
        }
        if (getRecordType() != null) {
            _hashCode += getRecordType().hashCode();
        }
        if (getRecordTypeId() != null) {
            _hashCode += getRecordTypeId().hashCode();
        }
        if (getRegression__c() != null) {
            _hashCode += getRegression__c().hashCode();
        }
        if (getRelated_Dominus_Task__c() != null) {
            _hashCode += getRelated_Dominus_Task__c().hashCode();
        }
        if (getRelated_Dominus_Task__r() != null) {
            _hashCode += getRelated_Dominus_Task__r().hashCode();
        }
        if (getRelease_Project__c() != null) {
            _hashCode += getRelease_Project__c().hashCode();
        }
        if (getRelease_Project__r() != null) {
            _hashCode += getRelease_Project__r().hashCode();
        }
        if (getRequested_By__c() != null) {
            _hashCode += getRequested_By__c().hashCode();
        }
        if (getReturn__c() != null) {
            _hashCode += getReturn__c().hashCode();
        }
        if (getSend_Notification_Email__c() != null) {
            _hashCode += getSend_Notification_Email__c().hashCode();
        }
        if (getSeverity__c() != null) {
            _hashCode += getSeverity__c().hashCode();
        }
        if (getShort_Task_Name__c() != null) {
            _hashCode += getShort_Task_Name__c().hashCode();
        }
        if (getStatus__c() != null) {
            _hashCode += getStatus__c().hashCode();
        }
        if (getSteps_To_Reproduce__c() != null) {
            _hashCode += getSteps_To_Reproduce__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getSystem_Created_By__c() != null) {
            _hashCode += getSystem_Created_By__c().hashCode();
        }
        if (getSystem_Created_On__c() != null) {
            _hashCode += getSystem_Created_On__c().hashCode();
        }
        if (getSystem_Last_Modified_B__c() != null) {
            _hashCode += getSystem_Last_Modified_B__c().hashCode();
        }
        if (getSystem_Last_Modified_On__c() != null) {
            _hashCode += getSystem_Last_Modified_On__c().hashCode();
        }
        if (getTask_Defect_Name__c() != null) {
            _hashCode += getTask_Defect_Name__c().hashCode();
        }
        if (getTask__c() != null) {
            _hashCode += getTask__c().hashCode();
        }
        if (getTasks() != null) {
            _hashCode += getTasks().hashCode();
        }
        if (getTest_Case_QA_Validation__c() != null) {
            _hashCode += getTest_Case_QA_Validation__c().hashCode();
        }
        if (getTested_By__c() != null) {
            _hashCode += getTested_By__c().hashCode();
        }
        if (getTested_By__r() != null) {
            _hashCode += getTested_By__r().hashCode();
        }
        if (getTested_Date__c() != null) {
            _hashCode += getTested_Date__c().hashCode();
        }
        if (getType__c() != null) {
            _hashCode += getType__c().hashCode();
        }
        if (getURL__c() != null) {
            _hashCode += getURL__c().hashCode();
        }
        if (getUser__c() != null) {
            _hashCode += getUser__c().hashCode();
        }
        if (getUser__r() != null) {
            _hashCode += getUser__r().hashCode();
        }
        if (getVersion_Found__c() != null) {
            _hashCode += getVersion_Found__c().hashCode();
        }
        if (getVersion_Released__c() != null) {
            _hashCode += getVersion_Released__c().hashCode();
        }
        if (getVersion_s_Performed__c() != null) {
            _hashCode += getVersion_s_Performed__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Dev_Task_Defects__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dev_Task_Defects__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityHistories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActivityHistories"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actual_End_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Actual_End_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actual_Hours__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Actual_Hours__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("application_Part__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Application_Part__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associated_Project__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Associated_Project__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("breaking__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Breaking__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Category__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("current_Status_Notes__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Current_Status_Notes__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defect_Status__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Defect_Status__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defect_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Defect_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defects_Artifact_ID_s__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Defects_Artifact_ID_s__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dependent_On_Third_Party__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dependent_On_Third_Party__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Description__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dev_Priority__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dev_Priority__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dominu_Tasks__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dominu_Tasks__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error_Message__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Error_Message__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("est_Hours_High__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Est_Hours_High__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("est_Hours_Low__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Est_Hours_Low__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("est_Hours__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Est_Hours__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("feature__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Feature__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feature__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Feature__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Feature__c"));
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
        elemField.setFieldName("fixed_By__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fixed_By__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixed_By__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fixed_By__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixed_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fixed_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hours_Spent_Week_Before_Complete__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Hours_Spent_Week_Before_Complete__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hours__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Hours__c"));
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
        elemField.setFieldName("is_Production_Defect__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Is_Production_Defect__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywords__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Keywords__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("level_of_Initial_Dev_Effort__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Level_of_Initial_Dev_Effort__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name__c"));
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
        elemField.setFieldName("notes__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Notes__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("priority__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Priority__c"));
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
        elemField.setFieldName("project__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Project__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projected_End_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Projected_End_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecordType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecordType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecordTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regression__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Regression__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("related_Dominus_Task__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Related_Dominus_Task__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("related_Dominus_Task__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Related_Dominus_Task__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dev_Task_Defects__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("release_Project__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Release_Project__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("release_Project__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Release_Project__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Release__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requested_By__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Requested_By__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("return__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Return__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("send_Notification_Email__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Send_Notification_Email__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severity__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Severity__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("short_Task_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Short_Task_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("steps_To_Reproduce__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Steps_To_Reproduce__c"));
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
        elemField.setFieldName("system_Created_By__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "System_Created_By__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("system_Created_On__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "System_Created_On__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("system_Last_Modified_B__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "System_Last_Modified_B__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("system_Last_Modified_On__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "System_Last_Modified_On__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("task_Defect_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Task_Defect_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("task__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Task__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("test_Case_QA_Validation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Test_Case_QA_Validation__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tested_By__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tested_By__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tested_By__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tested_By__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tested_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tested_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URL__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "URL__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version_Found__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Version_Found__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version_Released__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Version_Released__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version_s_Performed__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Version_s_Performed__c"));
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

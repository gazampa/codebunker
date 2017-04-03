/**
 * SFDC_Project__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class SFDC_Project__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.util.Date date_Completed__c;

    private java.lang.String department_Priority__c;

    private java.lang.String department__c;

    private java.util.Date estimated_Completion_Dae__c;

    private java.lang.Double estimated_Hours__c;

    private com.sforce.soap.enterprise.QueryResult events;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.Boolean isDeleted;

    private java.util.Date lastActivityDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private com.sforce.soap.enterprise.QueryResult openActivities;

    private java.lang.String originator__c;

    private com.sforce.soap.enterprise.sobject.Contact originator__r;

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.String project_Description__c;

    private java.lang.String project_Notes__c;

    private java.lang.String related_SFDC_Project__c;

    private com.sforce.soap.enterprise.sobject.SFDC_Project__c related_SFDC_Project__r;

    private java.lang.String riptide_Difficulty_Level_Estimate__c;

    private com.sforce.soap.enterprise.QueryResult SFDC_Projects__r;

    private java.lang.String status__c;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    private java.lang.String ticket__c;

    private com.sforce.soap.enterprise.sobject._case ticket__r;

    private java.lang.String kCura_Priority__c;

    private java.lang.String kCura_Project_Contact__c;

    private com.sforce.soap.enterprise.sobject.User kCura_Project_Contact__r;

    public SFDC_Project__c() {
    }

    public SFDC_Project__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           com.sforce.soap.enterprise.QueryResult attachments,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.util.Date date_Completed__c,
           java.lang.String department_Priority__c,
           java.lang.String department__c,
           java.util.Date estimated_Completion_Dae__c,
           java.lang.Double estimated_Hours__c,
           com.sforce.soap.enterprise.QueryResult events,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.Boolean isDeleted,
           java.util.Date lastActivityDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           com.sforce.soap.enterprise.QueryResult openActivities,
           java.lang.String originator__c,
           com.sforce.soap.enterprise.sobject.Contact originator__r,
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.String project_Description__c,
           java.lang.String project_Notes__c,
           java.lang.String related_SFDC_Project__c,
           com.sforce.soap.enterprise.sobject.SFDC_Project__c related_SFDC_Project__r,
           java.lang.String riptide_Difficulty_Level_Estimate__c,
           com.sforce.soap.enterprise.QueryResult SFDC_Projects__r,
           java.lang.String status__c,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks,
           java.lang.String ticket__c,
           com.sforce.soap.enterprise.sobject._case ticket__r,
           java.lang.String kCura_Priority__c,
           java.lang.String kCura_Project_Contact__c,
           com.sforce.soap.enterprise.sobject.User kCura_Project_Contact__r) {
        super(
            fieldsToNull,
            id);
        this.activityHistories = activityHistories;
        this.attachments = attachments;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.date_Completed__c = date_Completed__c;
        this.department_Priority__c = department_Priority__c;
        this.department__c = department__c;
        this.estimated_Completion_Dae__c = estimated_Completion_Dae__c;
        this.estimated_Hours__c = estimated_Hours__c;
        this.events = events;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.histories = histories;
        this.isDeleted = isDeleted;
        this.lastActivityDate = lastActivityDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.openActivities = openActivities;
        this.originator__c = originator__c;
        this.originator__r = originator__r;
        this.owner = owner;
        this.ownerId = ownerId;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.project_Description__c = project_Description__c;
        this.project_Notes__c = project_Notes__c;
        this.related_SFDC_Project__c = related_SFDC_Project__c;
        this.related_SFDC_Project__r = related_SFDC_Project__r;
        this.riptide_Difficulty_Level_Estimate__c = riptide_Difficulty_Level_Estimate__c;
        this.SFDC_Projects__r = SFDC_Projects__r;
        this.status__c = status__c;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
        this.ticket__c = ticket__c;
        this.ticket__r = ticket__r;
        this.kCura_Priority__c = kCura_Priority__c;
        this.kCura_Project_Contact__c = kCura_Project_Contact__c;
        this.kCura_Project_Contact__r = kCura_Project_Contact__r;
    }


    /**
     * Gets the activityHistories value for this SFDC_Project__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this SFDC_Project__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the attachments value for this SFDC_Project__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this SFDC_Project__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the createdBy value for this SFDC_Project__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this SFDC_Project__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this SFDC_Project__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this SFDC_Project__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this SFDC_Project__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this SFDC_Project__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the date_Completed__c value for this SFDC_Project__c.
     * 
     * @return date_Completed__c
     */
    public java.util.Date getDate_Completed__c() {
        return date_Completed__c;
    }


    /**
     * Sets the date_Completed__c value for this SFDC_Project__c.
     * 
     * @param date_Completed__c
     */
    public void setDate_Completed__c(java.util.Date date_Completed__c) {
        this.date_Completed__c = date_Completed__c;
    }


    /**
     * Gets the department_Priority__c value for this SFDC_Project__c.
     * 
     * @return department_Priority__c
     */
    public java.lang.String getDepartment_Priority__c() {
        return department_Priority__c;
    }


    /**
     * Sets the department_Priority__c value for this SFDC_Project__c.
     * 
     * @param department_Priority__c
     */
    public void setDepartment_Priority__c(java.lang.String department_Priority__c) {
        this.department_Priority__c = department_Priority__c;
    }


    /**
     * Gets the department__c value for this SFDC_Project__c.
     * 
     * @return department__c
     */
    public java.lang.String getDepartment__c() {
        return department__c;
    }


    /**
     * Sets the department__c value for this SFDC_Project__c.
     * 
     * @param department__c
     */
    public void setDepartment__c(java.lang.String department__c) {
        this.department__c = department__c;
    }


    /**
     * Gets the estimated_Completion_Dae__c value for this SFDC_Project__c.
     * 
     * @return estimated_Completion_Dae__c
     */
    public java.util.Date getEstimated_Completion_Dae__c() {
        return estimated_Completion_Dae__c;
    }


    /**
     * Sets the estimated_Completion_Dae__c value for this SFDC_Project__c.
     * 
     * @param estimated_Completion_Dae__c
     */
    public void setEstimated_Completion_Dae__c(java.util.Date estimated_Completion_Dae__c) {
        this.estimated_Completion_Dae__c = estimated_Completion_Dae__c;
    }


    /**
     * Gets the estimated_Hours__c value for this SFDC_Project__c.
     * 
     * @return estimated_Hours__c
     */
    public java.lang.Double getEstimated_Hours__c() {
        return estimated_Hours__c;
    }


    /**
     * Sets the estimated_Hours__c value for this SFDC_Project__c.
     * 
     * @param estimated_Hours__c
     */
    public void setEstimated_Hours__c(java.lang.Double estimated_Hours__c) {
        this.estimated_Hours__c = estimated_Hours__c;
    }


    /**
     * Gets the events value for this SFDC_Project__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this SFDC_Project__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this SFDC_Project__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this SFDC_Project__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the histories value for this SFDC_Project__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this SFDC_Project__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the isDeleted value for this SFDC_Project__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this SFDC_Project__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastActivityDate value for this SFDC_Project__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this SFDC_Project__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this SFDC_Project__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this SFDC_Project__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this SFDC_Project__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this SFDC_Project__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this SFDC_Project__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this SFDC_Project__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this SFDC_Project__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this SFDC_Project__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this SFDC_Project__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this SFDC_Project__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this SFDC_Project__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this SFDC_Project__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the openActivities value for this SFDC_Project__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this SFDC_Project__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the originator__c value for this SFDC_Project__c.
     * 
     * @return originator__c
     */
    public java.lang.String getOriginator__c() {
        return originator__c;
    }


    /**
     * Sets the originator__c value for this SFDC_Project__c.
     * 
     * @param originator__c
     */
    public void setOriginator__c(java.lang.String originator__c) {
        this.originator__c = originator__c;
    }


    /**
     * Gets the originator__r value for this SFDC_Project__c.
     * 
     * @return originator__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getOriginator__r() {
        return originator__r;
    }


    /**
     * Sets the originator__r value for this SFDC_Project__c.
     * 
     * @param originator__r
     */
    public void setOriginator__r(com.sforce.soap.enterprise.sobject.Contact originator__r) {
        this.originator__r = originator__r;
    }


    /**
     * Gets the owner value for this SFDC_Project__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this SFDC_Project__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this SFDC_Project__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this SFDC_Project__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this SFDC_Project__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this SFDC_Project__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this SFDC_Project__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this SFDC_Project__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the project_Description__c value for this SFDC_Project__c.
     * 
     * @return project_Description__c
     */
    public java.lang.String getProject_Description__c() {
        return project_Description__c;
    }


    /**
     * Sets the project_Description__c value for this SFDC_Project__c.
     * 
     * @param project_Description__c
     */
    public void setProject_Description__c(java.lang.String project_Description__c) {
        this.project_Description__c = project_Description__c;
    }


    /**
     * Gets the project_Notes__c value for this SFDC_Project__c.
     * 
     * @return project_Notes__c
     */
    public java.lang.String getProject_Notes__c() {
        return project_Notes__c;
    }


    /**
     * Sets the project_Notes__c value for this SFDC_Project__c.
     * 
     * @param project_Notes__c
     */
    public void setProject_Notes__c(java.lang.String project_Notes__c) {
        this.project_Notes__c = project_Notes__c;
    }


    /**
     * Gets the related_SFDC_Project__c value for this SFDC_Project__c.
     * 
     * @return related_SFDC_Project__c
     */
    public java.lang.String getRelated_SFDC_Project__c() {
        return related_SFDC_Project__c;
    }


    /**
     * Sets the related_SFDC_Project__c value for this SFDC_Project__c.
     * 
     * @param related_SFDC_Project__c
     */
    public void setRelated_SFDC_Project__c(java.lang.String related_SFDC_Project__c) {
        this.related_SFDC_Project__c = related_SFDC_Project__c;
    }


    /**
     * Gets the related_SFDC_Project__r value for this SFDC_Project__c.
     * 
     * @return related_SFDC_Project__r
     */
    public com.sforce.soap.enterprise.sobject.SFDC_Project__c getRelated_SFDC_Project__r() {
        return related_SFDC_Project__r;
    }


    /**
     * Sets the related_SFDC_Project__r value for this SFDC_Project__c.
     * 
     * @param related_SFDC_Project__r
     */
    public void setRelated_SFDC_Project__r(com.sforce.soap.enterprise.sobject.SFDC_Project__c related_SFDC_Project__r) {
        this.related_SFDC_Project__r = related_SFDC_Project__r;
    }


    /**
     * Gets the riptide_Difficulty_Level_Estimate__c value for this SFDC_Project__c.
     * 
     * @return riptide_Difficulty_Level_Estimate__c
     */
    public java.lang.String getRiptide_Difficulty_Level_Estimate__c() {
        return riptide_Difficulty_Level_Estimate__c;
    }


    /**
     * Sets the riptide_Difficulty_Level_Estimate__c value for this SFDC_Project__c.
     * 
     * @param riptide_Difficulty_Level_Estimate__c
     */
    public void setRiptide_Difficulty_Level_Estimate__c(java.lang.String riptide_Difficulty_Level_Estimate__c) {
        this.riptide_Difficulty_Level_Estimate__c = riptide_Difficulty_Level_Estimate__c;
    }


    /**
     * Gets the SFDC_Projects__r value for this SFDC_Project__c.
     * 
     * @return SFDC_Projects__r
     */
    public com.sforce.soap.enterprise.QueryResult getSFDC_Projects__r() {
        return SFDC_Projects__r;
    }


    /**
     * Sets the SFDC_Projects__r value for this SFDC_Project__c.
     * 
     * @param SFDC_Projects__r
     */
    public void setSFDC_Projects__r(com.sforce.soap.enterprise.QueryResult SFDC_Projects__r) {
        this.SFDC_Projects__r = SFDC_Projects__r;
    }


    /**
     * Gets the status__c value for this SFDC_Project__c.
     * 
     * @return status__c
     */
    public java.lang.String getStatus__c() {
        return status__c;
    }


    /**
     * Sets the status__c value for this SFDC_Project__c.
     * 
     * @param status__c
     */
    public void setStatus__c(java.lang.String status__c) {
        this.status__c = status__c;
    }


    /**
     * Gets the systemModstamp value for this SFDC_Project__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this SFDC_Project__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this SFDC_Project__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this SFDC_Project__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the ticket__c value for this SFDC_Project__c.
     * 
     * @return ticket__c
     */
    public java.lang.String getTicket__c() {
        return ticket__c;
    }


    /**
     * Sets the ticket__c value for this SFDC_Project__c.
     * 
     * @param ticket__c
     */
    public void setTicket__c(java.lang.String ticket__c) {
        this.ticket__c = ticket__c;
    }


    /**
     * Gets the ticket__r value for this SFDC_Project__c.
     * 
     * @return ticket__r
     */
    public com.sforce.soap.enterprise.sobject._case getTicket__r() {
        return ticket__r;
    }


    /**
     * Sets the ticket__r value for this SFDC_Project__c.
     * 
     * @param ticket__r
     */
    public void setTicket__r(com.sforce.soap.enterprise.sobject._case ticket__r) {
        this.ticket__r = ticket__r;
    }


    /**
     * Gets the kCura_Priority__c value for this SFDC_Project__c.
     * 
     * @return kCura_Priority__c
     */
    public java.lang.String getKCura_Priority__c() {
        return kCura_Priority__c;
    }


    /**
     * Sets the kCura_Priority__c value for this SFDC_Project__c.
     * 
     * @param kCura_Priority__c
     */
    public void setKCura_Priority__c(java.lang.String kCura_Priority__c) {
        this.kCura_Priority__c = kCura_Priority__c;
    }


    /**
     * Gets the kCura_Project_Contact__c value for this SFDC_Project__c.
     * 
     * @return kCura_Project_Contact__c
     */
    public java.lang.String getKCura_Project_Contact__c() {
        return kCura_Project_Contact__c;
    }


    /**
     * Sets the kCura_Project_Contact__c value for this SFDC_Project__c.
     * 
     * @param kCura_Project_Contact__c
     */
    public void setKCura_Project_Contact__c(java.lang.String kCura_Project_Contact__c) {
        this.kCura_Project_Contact__c = kCura_Project_Contact__c;
    }


    /**
     * Gets the kCura_Project_Contact__r value for this SFDC_Project__c.
     * 
     * @return kCura_Project_Contact__r
     */
    public com.sforce.soap.enterprise.sobject.User getKCura_Project_Contact__r() {
        return kCura_Project_Contact__r;
    }


    /**
     * Sets the kCura_Project_Contact__r value for this SFDC_Project__c.
     * 
     * @param kCura_Project_Contact__r
     */
    public void setKCura_Project_Contact__r(com.sforce.soap.enterprise.sobject.User kCura_Project_Contact__r) {
        this.kCura_Project_Contact__r = kCura_Project_Contact__r;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SFDC_Project__c)) return false;
        SFDC_Project__c other = (SFDC_Project__c) obj;
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
            ((this.date_Completed__c==null && other.getDate_Completed__c()==null) || 
             (this.date_Completed__c!=null &&
              this.date_Completed__c.equals(other.getDate_Completed__c()))) &&
            ((this.department_Priority__c==null && other.getDepartment_Priority__c()==null) || 
             (this.department_Priority__c!=null &&
              this.department_Priority__c.equals(other.getDepartment_Priority__c()))) &&
            ((this.department__c==null && other.getDepartment__c()==null) || 
             (this.department__c!=null &&
              this.department__c.equals(other.getDepartment__c()))) &&
            ((this.estimated_Completion_Dae__c==null && other.getEstimated_Completion_Dae__c()==null) || 
             (this.estimated_Completion_Dae__c!=null &&
              this.estimated_Completion_Dae__c.equals(other.getEstimated_Completion_Dae__c()))) &&
            ((this.estimated_Hours__c==null && other.getEstimated_Hours__c()==null) || 
             (this.estimated_Hours__c!=null &&
              this.estimated_Hours__c.equals(other.getEstimated_Hours__c()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              this.events.equals(other.getEvents()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
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
            ((this.originator__c==null && other.getOriginator__c()==null) || 
             (this.originator__c!=null &&
              this.originator__c.equals(other.getOriginator__c()))) &&
            ((this.originator__r==null && other.getOriginator__r()==null) || 
             (this.originator__r!=null &&
              this.originator__r.equals(other.getOriginator__r()))) &&
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
            ((this.project_Description__c==null && other.getProject_Description__c()==null) || 
             (this.project_Description__c!=null &&
              this.project_Description__c.equals(other.getProject_Description__c()))) &&
            ((this.project_Notes__c==null && other.getProject_Notes__c()==null) || 
             (this.project_Notes__c!=null &&
              this.project_Notes__c.equals(other.getProject_Notes__c()))) &&
            ((this.related_SFDC_Project__c==null && other.getRelated_SFDC_Project__c()==null) || 
             (this.related_SFDC_Project__c!=null &&
              this.related_SFDC_Project__c.equals(other.getRelated_SFDC_Project__c()))) &&
            ((this.related_SFDC_Project__r==null && other.getRelated_SFDC_Project__r()==null) || 
             (this.related_SFDC_Project__r!=null &&
              this.related_SFDC_Project__r.equals(other.getRelated_SFDC_Project__r()))) &&
            ((this.riptide_Difficulty_Level_Estimate__c==null && other.getRiptide_Difficulty_Level_Estimate__c()==null) || 
             (this.riptide_Difficulty_Level_Estimate__c!=null &&
              this.riptide_Difficulty_Level_Estimate__c.equals(other.getRiptide_Difficulty_Level_Estimate__c()))) &&
            ((this.SFDC_Projects__r==null && other.getSFDC_Projects__r()==null) || 
             (this.SFDC_Projects__r!=null &&
              this.SFDC_Projects__r.equals(other.getSFDC_Projects__r()))) &&
            ((this.status__c==null && other.getStatus__c()==null) || 
             (this.status__c!=null &&
              this.status__c.equals(other.getStatus__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              this.tasks.equals(other.getTasks()))) &&
            ((this.ticket__c==null && other.getTicket__c()==null) || 
             (this.ticket__c!=null &&
              this.ticket__c.equals(other.getTicket__c()))) &&
            ((this.ticket__r==null && other.getTicket__r()==null) || 
             (this.ticket__r!=null &&
              this.ticket__r.equals(other.getTicket__r()))) &&
            ((this.kCura_Priority__c==null && other.getKCura_Priority__c()==null) || 
             (this.kCura_Priority__c!=null &&
              this.kCura_Priority__c.equals(other.getKCura_Priority__c()))) &&
            ((this.kCura_Project_Contact__c==null && other.getKCura_Project_Contact__c()==null) || 
             (this.kCura_Project_Contact__c!=null &&
              this.kCura_Project_Contact__c.equals(other.getKCura_Project_Contact__c()))) &&
            ((this.kCura_Project_Contact__r==null && other.getKCura_Project_Contact__r()==null) || 
             (this.kCura_Project_Contact__r!=null &&
              this.kCura_Project_Contact__r.equals(other.getKCura_Project_Contact__r())));
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
        if (getDate_Completed__c() != null) {
            _hashCode += getDate_Completed__c().hashCode();
        }
        if (getDepartment_Priority__c() != null) {
            _hashCode += getDepartment_Priority__c().hashCode();
        }
        if (getDepartment__c() != null) {
            _hashCode += getDepartment__c().hashCode();
        }
        if (getEstimated_Completion_Dae__c() != null) {
            _hashCode += getEstimated_Completion_Dae__c().hashCode();
        }
        if (getEstimated_Hours__c() != null) {
            _hashCode += getEstimated_Hours__c().hashCode();
        }
        if (getEvents() != null) {
            _hashCode += getEvents().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getHistories() != null) {
            _hashCode += getHistories().hashCode();
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
        if (getOriginator__c() != null) {
            _hashCode += getOriginator__c().hashCode();
        }
        if (getOriginator__r() != null) {
            _hashCode += getOriginator__r().hashCode();
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
        if (getProject_Description__c() != null) {
            _hashCode += getProject_Description__c().hashCode();
        }
        if (getProject_Notes__c() != null) {
            _hashCode += getProject_Notes__c().hashCode();
        }
        if (getRelated_SFDC_Project__c() != null) {
            _hashCode += getRelated_SFDC_Project__c().hashCode();
        }
        if (getRelated_SFDC_Project__r() != null) {
            _hashCode += getRelated_SFDC_Project__r().hashCode();
        }
        if (getRiptide_Difficulty_Level_Estimate__c() != null) {
            _hashCode += getRiptide_Difficulty_Level_Estimate__c().hashCode();
        }
        if (getSFDC_Projects__r() != null) {
            _hashCode += getSFDC_Projects__r().hashCode();
        }
        if (getStatus__c() != null) {
            _hashCode += getStatus__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTasks() != null) {
            _hashCode += getTasks().hashCode();
        }
        if (getTicket__c() != null) {
            _hashCode += getTicket__c().hashCode();
        }
        if (getTicket__r() != null) {
            _hashCode += getTicket__r().hashCode();
        }
        if (getKCura_Priority__c() != null) {
            _hashCode += getKCura_Priority__c().hashCode();
        }
        if (getKCura_Project_Contact__c() != null) {
            _hashCode += getKCura_Project_Contact__c().hashCode();
        }
        if (getKCura_Project_Contact__r() != null) {
            _hashCode += getKCura_Project_Contact__r().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SFDC_Project__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SFDC_Project__c"));
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
        elemField.setFieldName("date_Completed__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Completed__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department_Priority__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Department_Priority__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Department__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimated_Completion_Dae__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Estimated_Completion_Dae__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimated_Hours__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Estimated_Hours__c"));
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
        elemField.setFieldName("feedSubscriptionsForEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedSubscriptionsForEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("histories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Histories"));
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
        elemField.setFieldName("originator__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Originator__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originator__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Originator__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
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
        elemField.setFieldName("project_Description__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Project_Description__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project_Notes__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Project_Notes__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("related_SFDC_Project__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Related_SFDC_Project__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("related_SFDC_Project__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Related_SFDC_Project__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SFDC_Project__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("riptide_Difficulty_Level_Estimate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Riptide_Difficulty_Level_Estimate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SFDC_Projects__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SFDC_Projects__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("ticket__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Ticket__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticket__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Ticket__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KCura_Priority__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "kCura_Priority__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KCura_Project_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "kCura_Project_Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KCura_Project_Contact__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "kCura_Project_Contact__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
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

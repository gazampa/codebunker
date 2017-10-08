/**
 * CS_Goals__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class CS_Goals__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private java.lang.Double articles_Recipes_Created_Goal__c;

    private java.lang.Double articles_Submitted__c;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.Double average_Case_Time_Per_Day__c;

    private java.lang.Double average_Case_Time_per_Day_Goal__c;

    private java.lang.Double catastrophic_Ticket_Aging_Goal__c;

    private java.lang.Double closed_Tickets_w_Articles_Attached_Goal__c;

    private java.lang.Double closed_Tickets_with_Articles_Attached__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.Double critical_Ticket_Aging_Goal__c;

    private com.sforce.soap.enterprise.QueryResult events;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.Boolean isDeleted;

    private java.util.Date lastActivityDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.Double minor_Ticket_Aging_Goal__c;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private com.sforce.soap.enterprise.QueryResult openActivities;

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private java.lang.Double positive_Ticket_Surveys_Goal__c;

    private java.lang.Double positive_Ticket_Surveys__c;

    private java.lang.Double positive_Training_Surveys_Goal__c;

    private java.lang.Double positive_Training_Surveys__c;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.Double SLA_Met_Goals__c;

    private java.lang.Double SLAs_Met__c;

    private java.lang.Double serious_Ticket_Aging_Goal__c;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    private java.lang.String team__c;

    private java.lang.Double ticket_Age_Catastrophic__c;

    private java.lang.Double ticket_Age_Critical__c;

    private java.lang.Double ticket_Age_Minor__c;

    private java.lang.Double ticket_Age_Serious__c;

    private java.lang.Double ticket_QC_Goal__c;

    private java.lang.Double ticket_QC__c;

    public CS_Goals__c() {
    }

    public CS_Goals__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           java.lang.Double articles_Recipes_Created_Goal__c,
           java.lang.Double articles_Submitted__c,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.Double average_Case_Time_Per_Day__c,
           java.lang.Double average_Case_Time_per_Day_Goal__c,
           java.lang.Double catastrophic_Ticket_Aging_Goal__c,
           java.lang.Double closed_Tickets_w_Articles_Attached_Goal__c,
           java.lang.Double closed_Tickets_with_Articles_Attached__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.Double critical_Ticket_Aging_Goal__c,
           com.sforce.soap.enterprise.QueryResult events,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.Boolean isDeleted,
           java.util.Date lastActivityDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.Double minor_Ticket_Aging_Goal__c,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           com.sforce.soap.enterprise.QueryResult openActivities,
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           java.lang.Double positive_Ticket_Surveys_Goal__c,
           java.lang.Double positive_Ticket_Surveys__c,
           java.lang.Double positive_Training_Surveys_Goal__c,
           java.lang.Double positive_Training_Surveys__c,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.Double SLA_Met_Goals__c,
           java.lang.Double SLAs_Met__c,
           java.lang.Double serious_Ticket_Aging_Goal__c,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks,
           java.lang.String team__c,
           java.lang.Double ticket_Age_Catastrophic__c,
           java.lang.Double ticket_Age_Critical__c,
           java.lang.Double ticket_Age_Minor__c,
           java.lang.Double ticket_Age_Serious__c,
           java.lang.Double ticket_QC_Goal__c,
           java.lang.Double ticket_QC__c) {
        super(
            fieldsToNull,
            id);
        this.activityHistories = activityHistories;
        this.articles_Recipes_Created_Goal__c = articles_Recipes_Created_Goal__c;
        this.articles_Submitted__c = articles_Submitted__c;
        this.attachments = attachments;
        this.average_Case_Time_Per_Day__c = average_Case_Time_Per_Day__c;
        this.average_Case_Time_per_Day_Goal__c = average_Case_Time_per_Day_Goal__c;
        this.catastrophic_Ticket_Aging_Goal__c = catastrophic_Ticket_Aging_Goal__c;
        this.closed_Tickets_w_Articles_Attached_Goal__c = closed_Tickets_w_Articles_Attached_Goal__c;
        this.closed_Tickets_with_Articles_Attached__c = closed_Tickets_with_Articles_Attached__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.critical_Ticket_Aging_Goal__c = critical_Ticket_Aging_Goal__c;
        this.events = events;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.histories = histories;
        this.isDeleted = isDeleted;
        this.lastActivityDate = lastActivityDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.minor_Ticket_Aging_Goal__c = minor_Ticket_Aging_Goal__c;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.openActivities = openActivities;
        this.owner = owner;
        this.ownerId = ownerId;
        this.positive_Ticket_Surveys_Goal__c = positive_Ticket_Surveys_Goal__c;
        this.positive_Ticket_Surveys__c = positive_Ticket_Surveys__c;
        this.positive_Training_Surveys_Goal__c = positive_Training_Surveys_Goal__c;
        this.positive_Training_Surveys__c = positive_Training_Surveys__c;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.SLA_Met_Goals__c = SLA_Met_Goals__c;
        this.SLAs_Met__c = SLAs_Met__c;
        this.serious_Ticket_Aging_Goal__c = serious_Ticket_Aging_Goal__c;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
        this.team__c = team__c;
        this.ticket_Age_Catastrophic__c = ticket_Age_Catastrophic__c;
        this.ticket_Age_Critical__c = ticket_Age_Critical__c;
        this.ticket_Age_Minor__c = ticket_Age_Minor__c;
        this.ticket_Age_Serious__c = ticket_Age_Serious__c;
        this.ticket_QC_Goal__c = ticket_QC_Goal__c;
        this.ticket_QC__c = ticket_QC__c;
    }


    /**
     * Gets the activityHistories value for this CS_Goals__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this CS_Goals__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the articles_Recipes_Created_Goal__c value for this CS_Goals__c.
     * 
     * @return articles_Recipes_Created_Goal__c
     */
    public java.lang.Double getArticles_Recipes_Created_Goal__c() {
        return articles_Recipes_Created_Goal__c;
    }


    /**
     * Sets the articles_Recipes_Created_Goal__c value for this CS_Goals__c.
     * 
     * @param articles_Recipes_Created_Goal__c
     */
    public void setArticles_Recipes_Created_Goal__c(java.lang.Double articles_Recipes_Created_Goal__c) {
        this.articles_Recipes_Created_Goal__c = articles_Recipes_Created_Goal__c;
    }


    /**
     * Gets the articles_Submitted__c value for this CS_Goals__c.
     * 
     * @return articles_Submitted__c
     */
    public java.lang.Double getArticles_Submitted__c() {
        return articles_Submitted__c;
    }


    /**
     * Sets the articles_Submitted__c value for this CS_Goals__c.
     * 
     * @param articles_Submitted__c
     */
    public void setArticles_Submitted__c(java.lang.Double articles_Submitted__c) {
        this.articles_Submitted__c = articles_Submitted__c;
    }


    /**
     * Gets the attachments value for this CS_Goals__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this CS_Goals__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the average_Case_Time_Per_Day__c value for this CS_Goals__c.
     * 
     * @return average_Case_Time_Per_Day__c
     */
    public java.lang.Double getAverage_Case_Time_Per_Day__c() {
        return average_Case_Time_Per_Day__c;
    }


    /**
     * Sets the average_Case_Time_Per_Day__c value for this CS_Goals__c.
     * 
     * @param average_Case_Time_Per_Day__c
     */
    public void setAverage_Case_Time_Per_Day__c(java.lang.Double average_Case_Time_Per_Day__c) {
        this.average_Case_Time_Per_Day__c = average_Case_Time_Per_Day__c;
    }


    /**
     * Gets the average_Case_Time_per_Day_Goal__c value for this CS_Goals__c.
     * 
     * @return average_Case_Time_per_Day_Goal__c
     */
    public java.lang.Double getAverage_Case_Time_per_Day_Goal__c() {
        return average_Case_Time_per_Day_Goal__c;
    }


    /**
     * Sets the average_Case_Time_per_Day_Goal__c value for this CS_Goals__c.
     * 
     * @param average_Case_Time_per_Day_Goal__c
     */
    public void setAverage_Case_Time_per_Day_Goal__c(java.lang.Double average_Case_Time_per_Day_Goal__c) {
        this.average_Case_Time_per_Day_Goal__c = average_Case_Time_per_Day_Goal__c;
    }


    /**
     * Gets the catastrophic_Ticket_Aging_Goal__c value for this CS_Goals__c.
     * 
     * @return catastrophic_Ticket_Aging_Goal__c
     */
    public java.lang.Double getCatastrophic_Ticket_Aging_Goal__c() {
        return catastrophic_Ticket_Aging_Goal__c;
    }


    /**
     * Sets the catastrophic_Ticket_Aging_Goal__c value for this CS_Goals__c.
     * 
     * @param catastrophic_Ticket_Aging_Goal__c
     */
    public void setCatastrophic_Ticket_Aging_Goal__c(java.lang.Double catastrophic_Ticket_Aging_Goal__c) {
        this.catastrophic_Ticket_Aging_Goal__c = catastrophic_Ticket_Aging_Goal__c;
    }


    /**
     * Gets the closed_Tickets_w_Articles_Attached_Goal__c value for this CS_Goals__c.
     * 
     * @return closed_Tickets_w_Articles_Attached_Goal__c
     */
    public java.lang.Double getClosed_Tickets_w_Articles_Attached_Goal__c() {
        return closed_Tickets_w_Articles_Attached_Goal__c;
    }


    /**
     * Sets the closed_Tickets_w_Articles_Attached_Goal__c value for this CS_Goals__c.
     * 
     * @param closed_Tickets_w_Articles_Attached_Goal__c
     */
    public void setClosed_Tickets_w_Articles_Attached_Goal__c(java.lang.Double closed_Tickets_w_Articles_Attached_Goal__c) {
        this.closed_Tickets_w_Articles_Attached_Goal__c = closed_Tickets_w_Articles_Attached_Goal__c;
    }


    /**
     * Gets the closed_Tickets_with_Articles_Attached__c value for this CS_Goals__c.
     * 
     * @return closed_Tickets_with_Articles_Attached__c
     */
    public java.lang.Double getClosed_Tickets_with_Articles_Attached__c() {
        return closed_Tickets_with_Articles_Attached__c;
    }


    /**
     * Sets the closed_Tickets_with_Articles_Attached__c value for this CS_Goals__c.
     * 
     * @param closed_Tickets_with_Articles_Attached__c
     */
    public void setClosed_Tickets_with_Articles_Attached__c(java.lang.Double closed_Tickets_with_Articles_Attached__c) {
        this.closed_Tickets_with_Articles_Attached__c = closed_Tickets_with_Articles_Attached__c;
    }


    /**
     * Gets the createdBy value for this CS_Goals__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this CS_Goals__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this CS_Goals__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this CS_Goals__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this CS_Goals__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CS_Goals__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the critical_Ticket_Aging_Goal__c value for this CS_Goals__c.
     * 
     * @return critical_Ticket_Aging_Goal__c
     */
    public java.lang.Double getCritical_Ticket_Aging_Goal__c() {
        return critical_Ticket_Aging_Goal__c;
    }


    /**
     * Sets the critical_Ticket_Aging_Goal__c value for this CS_Goals__c.
     * 
     * @param critical_Ticket_Aging_Goal__c
     */
    public void setCritical_Ticket_Aging_Goal__c(java.lang.Double critical_Ticket_Aging_Goal__c) {
        this.critical_Ticket_Aging_Goal__c = critical_Ticket_Aging_Goal__c;
    }


    /**
     * Gets the events value for this CS_Goals__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this CS_Goals__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this CS_Goals__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this CS_Goals__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the histories value for this CS_Goals__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this CS_Goals__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the isDeleted value for this CS_Goals__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this CS_Goals__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastActivityDate value for this CS_Goals__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this CS_Goals__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this CS_Goals__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this CS_Goals__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this CS_Goals__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this CS_Goals__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this CS_Goals__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CS_Goals__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the minor_Ticket_Aging_Goal__c value for this CS_Goals__c.
     * 
     * @return minor_Ticket_Aging_Goal__c
     */
    public java.lang.Double getMinor_Ticket_Aging_Goal__c() {
        return minor_Ticket_Aging_Goal__c;
    }


    /**
     * Sets the minor_Ticket_Aging_Goal__c value for this CS_Goals__c.
     * 
     * @param minor_Ticket_Aging_Goal__c
     */
    public void setMinor_Ticket_Aging_Goal__c(java.lang.Double minor_Ticket_Aging_Goal__c) {
        this.minor_Ticket_Aging_Goal__c = minor_Ticket_Aging_Goal__c;
    }


    /**
     * Gets the name value for this CS_Goals__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CS_Goals__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this CS_Goals__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this CS_Goals__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this CS_Goals__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this CS_Goals__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the openActivities value for this CS_Goals__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this CS_Goals__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the owner value for this CS_Goals__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this CS_Goals__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this CS_Goals__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this CS_Goals__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the positive_Ticket_Surveys_Goal__c value for this CS_Goals__c.
     * 
     * @return positive_Ticket_Surveys_Goal__c
     */
    public java.lang.Double getPositive_Ticket_Surveys_Goal__c() {
        return positive_Ticket_Surveys_Goal__c;
    }


    /**
     * Sets the positive_Ticket_Surveys_Goal__c value for this CS_Goals__c.
     * 
     * @param positive_Ticket_Surveys_Goal__c
     */
    public void setPositive_Ticket_Surveys_Goal__c(java.lang.Double positive_Ticket_Surveys_Goal__c) {
        this.positive_Ticket_Surveys_Goal__c = positive_Ticket_Surveys_Goal__c;
    }


    /**
     * Gets the positive_Ticket_Surveys__c value for this CS_Goals__c.
     * 
     * @return positive_Ticket_Surveys__c
     */
    public java.lang.Double getPositive_Ticket_Surveys__c() {
        return positive_Ticket_Surveys__c;
    }


    /**
     * Sets the positive_Ticket_Surveys__c value for this CS_Goals__c.
     * 
     * @param positive_Ticket_Surveys__c
     */
    public void setPositive_Ticket_Surveys__c(java.lang.Double positive_Ticket_Surveys__c) {
        this.positive_Ticket_Surveys__c = positive_Ticket_Surveys__c;
    }


    /**
     * Gets the positive_Training_Surveys_Goal__c value for this CS_Goals__c.
     * 
     * @return positive_Training_Surveys_Goal__c
     */
    public java.lang.Double getPositive_Training_Surveys_Goal__c() {
        return positive_Training_Surveys_Goal__c;
    }


    /**
     * Sets the positive_Training_Surveys_Goal__c value for this CS_Goals__c.
     * 
     * @param positive_Training_Surveys_Goal__c
     */
    public void setPositive_Training_Surveys_Goal__c(java.lang.Double positive_Training_Surveys_Goal__c) {
        this.positive_Training_Surveys_Goal__c = positive_Training_Surveys_Goal__c;
    }


    /**
     * Gets the positive_Training_Surveys__c value for this CS_Goals__c.
     * 
     * @return positive_Training_Surveys__c
     */
    public java.lang.Double getPositive_Training_Surveys__c() {
        return positive_Training_Surveys__c;
    }


    /**
     * Sets the positive_Training_Surveys__c value for this CS_Goals__c.
     * 
     * @param positive_Training_Surveys__c
     */
    public void setPositive_Training_Surveys__c(java.lang.Double positive_Training_Surveys__c) {
        this.positive_Training_Surveys__c = positive_Training_Surveys__c;
    }


    /**
     * Gets the processInstances value for this CS_Goals__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this CS_Goals__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this CS_Goals__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this CS_Goals__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the SLA_Met_Goals__c value for this CS_Goals__c.
     * 
     * @return SLA_Met_Goals__c
     */
    public java.lang.Double getSLA_Met_Goals__c() {
        return SLA_Met_Goals__c;
    }


    /**
     * Sets the SLA_Met_Goals__c value for this CS_Goals__c.
     * 
     * @param SLA_Met_Goals__c
     */
    public void setSLA_Met_Goals__c(java.lang.Double SLA_Met_Goals__c) {
        this.SLA_Met_Goals__c = SLA_Met_Goals__c;
    }


    /**
     * Gets the SLAs_Met__c value for this CS_Goals__c.
     * 
     * @return SLAs_Met__c
     */
    public java.lang.Double getSLAs_Met__c() {
        return SLAs_Met__c;
    }


    /**
     * Sets the SLAs_Met__c value for this CS_Goals__c.
     * 
     * @param SLAs_Met__c
     */
    public void setSLAs_Met__c(java.lang.Double SLAs_Met__c) {
        this.SLAs_Met__c = SLAs_Met__c;
    }


    /**
     * Gets the serious_Ticket_Aging_Goal__c value for this CS_Goals__c.
     * 
     * @return serious_Ticket_Aging_Goal__c
     */
    public java.lang.Double getSerious_Ticket_Aging_Goal__c() {
        return serious_Ticket_Aging_Goal__c;
    }


    /**
     * Sets the serious_Ticket_Aging_Goal__c value for this CS_Goals__c.
     * 
     * @param serious_Ticket_Aging_Goal__c
     */
    public void setSerious_Ticket_Aging_Goal__c(java.lang.Double serious_Ticket_Aging_Goal__c) {
        this.serious_Ticket_Aging_Goal__c = serious_Ticket_Aging_Goal__c;
    }


    /**
     * Gets the systemModstamp value for this CS_Goals__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this CS_Goals__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this CS_Goals__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this CS_Goals__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the team__c value for this CS_Goals__c.
     * 
     * @return team__c
     */
    public java.lang.String getTeam__c() {
        return team__c;
    }


    /**
     * Sets the team__c value for this CS_Goals__c.
     * 
     * @param team__c
     */
    public void setTeam__c(java.lang.String team__c) {
        this.team__c = team__c;
    }


    /**
     * Gets the ticket_Age_Catastrophic__c value for this CS_Goals__c.
     * 
     * @return ticket_Age_Catastrophic__c
     */
    public java.lang.Double getTicket_Age_Catastrophic__c() {
        return ticket_Age_Catastrophic__c;
    }


    /**
     * Sets the ticket_Age_Catastrophic__c value for this CS_Goals__c.
     * 
     * @param ticket_Age_Catastrophic__c
     */
    public void setTicket_Age_Catastrophic__c(java.lang.Double ticket_Age_Catastrophic__c) {
        this.ticket_Age_Catastrophic__c = ticket_Age_Catastrophic__c;
    }


    /**
     * Gets the ticket_Age_Critical__c value for this CS_Goals__c.
     * 
     * @return ticket_Age_Critical__c
     */
    public java.lang.Double getTicket_Age_Critical__c() {
        return ticket_Age_Critical__c;
    }


    /**
     * Sets the ticket_Age_Critical__c value for this CS_Goals__c.
     * 
     * @param ticket_Age_Critical__c
     */
    public void setTicket_Age_Critical__c(java.lang.Double ticket_Age_Critical__c) {
        this.ticket_Age_Critical__c = ticket_Age_Critical__c;
    }


    /**
     * Gets the ticket_Age_Minor__c value for this CS_Goals__c.
     * 
     * @return ticket_Age_Minor__c
     */
    public java.lang.Double getTicket_Age_Minor__c() {
        return ticket_Age_Minor__c;
    }


    /**
     * Sets the ticket_Age_Minor__c value for this CS_Goals__c.
     * 
     * @param ticket_Age_Minor__c
     */
    public void setTicket_Age_Minor__c(java.lang.Double ticket_Age_Minor__c) {
        this.ticket_Age_Minor__c = ticket_Age_Minor__c;
    }


    /**
     * Gets the ticket_Age_Serious__c value for this CS_Goals__c.
     * 
     * @return ticket_Age_Serious__c
     */
    public java.lang.Double getTicket_Age_Serious__c() {
        return ticket_Age_Serious__c;
    }


    /**
     * Sets the ticket_Age_Serious__c value for this CS_Goals__c.
     * 
     * @param ticket_Age_Serious__c
     */
    public void setTicket_Age_Serious__c(java.lang.Double ticket_Age_Serious__c) {
        this.ticket_Age_Serious__c = ticket_Age_Serious__c;
    }


    /**
     * Gets the ticket_QC_Goal__c value for this CS_Goals__c.
     * 
     * @return ticket_QC_Goal__c
     */
    public java.lang.Double getTicket_QC_Goal__c() {
        return ticket_QC_Goal__c;
    }


    /**
     * Sets the ticket_QC_Goal__c value for this CS_Goals__c.
     * 
     * @param ticket_QC_Goal__c
     */
    public void setTicket_QC_Goal__c(java.lang.Double ticket_QC_Goal__c) {
        this.ticket_QC_Goal__c = ticket_QC_Goal__c;
    }


    /**
     * Gets the ticket_QC__c value for this CS_Goals__c.
     * 
     * @return ticket_QC__c
     */
    public java.lang.Double getTicket_QC__c() {
        return ticket_QC__c;
    }


    /**
     * Sets the ticket_QC__c value for this CS_Goals__c.
     * 
     * @param ticket_QC__c
     */
    public void setTicket_QC__c(java.lang.Double ticket_QC__c) {
        this.ticket_QC__c = ticket_QC__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CS_Goals__c)) return false;
        CS_Goals__c other = (CS_Goals__c) obj;
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
            ((this.articles_Recipes_Created_Goal__c==null && other.getArticles_Recipes_Created_Goal__c()==null) || 
             (this.articles_Recipes_Created_Goal__c!=null &&
              this.articles_Recipes_Created_Goal__c.equals(other.getArticles_Recipes_Created_Goal__c()))) &&
            ((this.articles_Submitted__c==null && other.getArticles_Submitted__c()==null) || 
             (this.articles_Submitted__c!=null &&
              this.articles_Submitted__c.equals(other.getArticles_Submitted__c()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.average_Case_Time_Per_Day__c==null && other.getAverage_Case_Time_Per_Day__c()==null) || 
             (this.average_Case_Time_Per_Day__c!=null &&
              this.average_Case_Time_Per_Day__c.equals(other.getAverage_Case_Time_Per_Day__c()))) &&
            ((this.average_Case_Time_per_Day_Goal__c==null && other.getAverage_Case_Time_per_Day_Goal__c()==null) || 
             (this.average_Case_Time_per_Day_Goal__c!=null &&
              this.average_Case_Time_per_Day_Goal__c.equals(other.getAverage_Case_Time_per_Day_Goal__c()))) &&
            ((this.catastrophic_Ticket_Aging_Goal__c==null && other.getCatastrophic_Ticket_Aging_Goal__c()==null) || 
             (this.catastrophic_Ticket_Aging_Goal__c!=null &&
              this.catastrophic_Ticket_Aging_Goal__c.equals(other.getCatastrophic_Ticket_Aging_Goal__c()))) &&
            ((this.closed_Tickets_w_Articles_Attached_Goal__c==null && other.getClosed_Tickets_w_Articles_Attached_Goal__c()==null) || 
             (this.closed_Tickets_w_Articles_Attached_Goal__c!=null &&
              this.closed_Tickets_w_Articles_Attached_Goal__c.equals(other.getClosed_Tickets_w_Articles_Attached_Goal__c()))) &&
            ((this.closed_Tickets_with_Articles_Attached__c==null && other.getClosed_Tickets_with_Articles_Attached__c()==null) || 
             (this.closed_Tickets_with_Articles_Attached__c!=null &&
              this.closed_Tickets_with_Articles_Attached__c.equals(other.getClosed_Tickets_with_Articles_Attached__c()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.critical_Ticket_Aging_Goal__c==null && other.getCritical_Ticket_Aging_Goal__c()==null) || 
             (this.critical_Ticket_Aging_Goal__c!=null &&
              this.critical_Ticket_Aging_Goal__c.equals(other.getCritical_Ticket_Aging_Goal__c()))) &&
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
            ((this.minor_Ticket_Aging_Goal__c==null && other.getMinor_Ticket_Aging_Goal__c()==null) || 
             (this.minor_Ticket_Aging_Goal__c!=null &&
              this.minor_Ticket_Aging_Goal__c.equals(other.getMinor_Ticket_Aging_Goal__c()))) &&
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
            ((this.positive_Ticket_Surveys_Goal__c==null && other.getPositive_Ticket_Surveys_Goal__c()==null) || 
             (this.positive_Ticket_Surveys_Goal__c!=null &&
              this.positive_Ticket_Surveys_Goal__c.equals(other.getPositive_Ticket_Surveys_Goal__c()))) &&
            ((this.positive_Ticket_Surveys__c==null && other.getPositive_Ticket_Surveys__c()==null) || 
             (this.positive_Ticket_Surveys__c!=null &&
              this.positive_Ticket_Surveys__c.equals(other.getPositive_Ticket_Surveys__c()))) &&
            ((this.positive_Training_Surveys_Goal__c==null && other.getPositive_Training_Surveys_Goal__c()==null) || 
             (this.positive_Training_Surveys_Goal__c!=null &&
              this.positive_Training_Surveys_Goal__c.equals(other.getPositive_Training_Surveys_Goal__c()))) &&
            ((this.positive_Training_Surveys__c==null && other.getPositive_Training_Surveys__c()==null) || 
             (this.positive_Training_Surveys__c!=null &&
              this.positive_Training_Surveys__c.equals(other.getPositive_Training_Surveys__c()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.SLA_Met_Goals__c==null && other.getSLA_Met_Goals__c()==null) || 
             (this.SLA_Met_Goals__c!=null &&
              this.SLA_Met_Goals__c.equals(other.getSLA_Met_Goals__c()))) &&
            ((this.SLAs_Met__c==null && other.getSLAs_Met__c()==null) || 
             (this.SLAs_Met__c!=null &&
              this.SLAs_Met__c.equals(other.getSLAs_Met__c()))) &&
            ((this.serious_Ticket_Aging_Goal__c==null && other.getSerious_Ticket_Aging_Goal__c()==null) || 
             (this.serious_Ticket_Aging_Goal__c!=null &&
              this.serious_Ticket_Aging_Goal__c.equals(other.getSerious_Ticket_Aging_Goal__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              this.tasks.equals(other.getTasks()))) &&
            ((this.team__c==null && other.getTeam__c()==null) || 
             (this.team__c!=null &&
              this.team__c.equals(other.getTeam__c()))) &&
            ((this.ticket_Age_Catastrophic__c==null && other.getTicket_Age_Catastrophic__c()==null) || 
             (this.ticket_Age_Catastrophic__c!=null &&
              this.ticket_Age_Catastrophic__c.equals(other.getTicket_Age_Catastrophic__c()))) &&
            ((this.ticket_Age_Critical__c==null && other.getTicket_Age_Critical__c()==null) || 
             (this.ticket_Age_Critical__c!=null &&
              this.ticket_Age_Critical__c.equals(other.getTicket_Age_Critical__c()))) &&
            ((this.ticket_Age_Minor__c==null && other.getTicket_Age_Minor__c()==null) || 
             (this.ticket_Age_Minor__c!=null &&
              this.ticket_Age_Minor__c.equals(other.getTicket_Age_Minor__c()))) &&
            ((this.ticket_Age_Serious__c==null && other.getTicket_Age_Serious__c()==null) || 
             (this.ticket_Age_Serious__c!=null &&
              this.ticket_Age_Serious__c.equals(other.getTicket_Age_Serious__c()))) &&
            ((this.ticket_QC_Goal__c==null && other.getTicket_QC_Goal__c()==null) || 
             (this.ticket_QC_Goal__c!=null &&
              this.ticket_QC_Goal__c.equals(other.getTicket_QC_Goal__c()))) &&
            ((this.ticket_QC__c==null && other.getTicket_QC__c()==null) || 
             (this.ticket_QC__c!=null &&
              this.ticket_QC__c.equals(other.getTicket_QC__c())));
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
        if (getArticles_Recipes_Created_Goal__c() != null) {
            _hashCode += getArticles_Recipes_Created_Goal__c().hashCode();
        }
        if (getArticles_Submitted__c() != null) {
            _hashCode += getArticles_Submitted__c().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getAverage_Case_Time_Per_Day__c() != null) {
            _hashCode += getAverage_Case_Time_Per_Day__c().hashCode();
        }
        if (getAverage_Case_Time_per_Day_Goal__c() != null) {
            _hashCode += getAverage_Case_Time_per_Day_Goal__c().hashCode();
        }
        if (getCatastrophic_Ticket_Aging_Goal__c() != null) {
            _hashCode += getCatastrophic_Ticket_Aging_Goal__c().hashCode();
        }
        if (getClosed_Tickets_w_Articles_Attached_Goal__c() != null) {
            _hashCode += getClosed_Tickets_w_Articles_Attached_Goal__c().hashCode();
        }
        if (getClosed_Tickets_with_Articles_Attached__c() != null) {
            _hashCode += getClosed_Tickets_with_Articles_Attached__c().hashCode();
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
        if (getCritical_Ticket_Aging_Goal__c() != null) {
            _hashCode += getCritical_Ticket_Aging_Goal__c().hashCode();
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
        if (getMinor_Ticket_Aging_Goal__c() != null) {
            _hashCode += getMinor_Ticket_Aging_Goal__c().hashCode();
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
        if (getPositive_Ticket_Surveys_Goal__c() != null) {
            _hashCode += getPositive_Ticket_Surveys_Goal__c().hashCode();
        }
        if (getPositive_Ticket_Surveys__c() != null) {
            _hashCode += getPositive_Ticket_Surveys__c().hashCode();
        }
        if (getPositive_Training_Surveys_Goal__c() != null) {
            _hashCode += getPositive_Training_Surveys_Goal__c().hashCode();
        }
        if (getPositive_Training_Surveys__c() != null) {
            _hashCode += getPositive_Training_Surveys__c().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getSLA_Met_Goals__c() != null) {
            _hashCode += getSLA_Met_Goals__c().hashCode();
        }
        if (getSLAs_Met__c() != null) {
            _hashCode += getSLAs_Met__c().hashCode();
        }
        if (getSerious_Ticket_Aging_Goal__c() != null) {
            _hashCode += getSerious_Ticket_Aging_Goal__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTasks() != null) {
            _hashCode += getTasks().hashCode();
        }
        if (getTeam__c() != null) {
            _hashCode += getTeam__c().hashCode();
        }
        if (getTicket_Age_Catastrophic__c() != null) {
            _hashCode += getTicket_Age_Catastrophic__c().hashCode();
        }
        if (getTicket_Age_Critical__c() != null) {
            _hashCode += getTicket_Age_Critical__c().hashCode();
        }
        if (getTicket_Age_Minor__c() != null) {
            _hashCode += getTicket_Age_Minor__c().hashCode();
        }
        if (getTicket_Age_Serious__c() != null) {
            _hashCode += getTicket_Age_Serious__c().hashCode();
        }
        if (getTicket_QC_Goal__c() != null) {
            _hashCode += getTicket_QC_Goal__c().hashCode();
        }
        if (getTicket_QC__c() != null) {
            _hashCode += getTicket_QC__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CS_Goals__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CS_Goals__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityHistories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActivityHistories"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articles_Recipes_Created_Goal__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Articles_Recipes_Created_Goal__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articles_Submitted__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Articles_Submitted__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("average_Case_Time_Per_Day__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Average_Case_Time_Per_Day__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("average_Case_Time_per_Day_Goal__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Average_Case_Time_per_Day_Goal__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catastrophic_Ticket_Aging_Goal__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Catastrophic_Ticket_Aging_Goal__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closed_Tickets_w_Articles_Attached_Goal__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Closed_Tickets_w_Articles_Attached_Goal__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closed_Tickets_with_Articles_Attached__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Closed_Tickets_with_Articles_Attached__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("critical_Ticket_Aging_Goal__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Critical_Ticket_Aging_Goal__c"));
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
        elemField.setFieldName("minor_Ticket_Aging_Goal__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Minor_Ticket_Aging_Goal__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("positive_Ticket_Surveys_Goal__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Positive_Ticket_Surveys_Goal__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("positive_Ticket_Surveys__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Positive_Ticket_Surveys__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("positive_Training_Surveys_Goal__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Positive_Training_Surveys_Goal__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("positive_Training_Surveys__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Positive_Training_Surveys__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("SLA_Met_Goals__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SLA_Met_Goals__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SLAs_Met__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SLAs_Met__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serious_Ticket_Aging_Goal__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Serious_Ticket_Aging_Goal__c"));
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
        elemField.setFieldName("tasks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("team__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Team__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticket_Age_Catastrophic__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Ticket_Age_Catastrophic__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticket_Age_Critical__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Ticket_Age_Critical__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticket_Age_Minor__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Ticket_Age_Minor__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticket_Age_Serious__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Ticket_Age_Serious__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticket_QC_Goal__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Ticket_QC_Goal__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticket_QC__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Ticket_QC__c"));
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

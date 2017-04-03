/**
 * Ideas_Projects__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Ideas_Projects__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String business_Justification__c;

    private java.lang.Boolean communicated__c;

    private java.lang.String communication_Plan__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String department__c;

    private java.util.Date estimated_Completion_Date__c;

    private com.sforce.soap.enterprise.QueryResult events;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.lang.String group__c;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.String idea__c;

    private com.sforce.soap.enterprise.sobject.Idea idea__r;

    private java.lang.String ideas_in_Action_Update__c;

    private java.lang.Boolean initial_Plan__c;

    private java.lang.Boolean isDeleted;

    private java.util.Date lastActivityDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String level_of_Effort__c;

    private java.lang.String milestones__c;

    private java.lang.String name;

    private java.lang.String note_1__c;

    private java.lang.String note_2__c;

    private java.lang.String note_3__c;

    private java.lang.String note_4__c;

    private java.lang.String note_5__c;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private com.sforce.soap.enterprise.QueryResult openActivities;

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private java.lang.Double percent_Complete__c;

    private java.lang.Boolean plan_Defined__c;

    private java.lang.Boolean plan_Executed__c;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.String project_Description__c;

    private java.lang.String project_Priority__c;

    private java.lang.String project_Stage__c;

    private java.lang.String project_Status__c;

    private com.sforce.soap.enterprise.QueryResult related_Ideas__r;

    private java.lang.Boolean resourced__c;

    private java.lang.Double score1__c;

    private java.lang.Double score2__c;

    private java.lang.Double score3__c;

    private java.lang.Double score4__c;

    private java.lang.Double score5__c;

    private java.lang.String stage__c;

    private java.lang.String status_Flag__c;

    private java.lang.String success_Factors__c;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    private java.lang.String type_of_Project__c;

    public Ideas_Projects__c() {
    }

    public Ideas_Projects__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String business_Justification__c,
           java.lang.Boolean communicated__c,
           java.lang.String communication_Plan__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String department__c,
           java.util.Date estimated_Completion_Date__c,
           com.sforce.soap.enterprise.QueryResult events,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.lang.String group__c,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.String idea__c,
           com.sforce.soap.enterprise.sobject.Idea idea__r,
           java.lang.String ideas_in_Action_Update__c,
           java.lang.Boolean initial_Plan__c,
           java.lang.Boolean isDeleted,
           java.util.Date lastActivityDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String level_of_Effort__c,
           java.lang.String milestones__c,
           java.lang.String name,
           java.lang.String note_1__c,
           java.lang.String note_2__c,
           java.lang.String note_3__c,
           java.lang.String note_4__c,
           java.lang.String note_5__c,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           com.sforce.soap.enterprise.QueryResult openActivities,
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           java.lang.Double percent_Complete__c,
           java.lang.Boolean plan_Defined__c,
           java.lang.Boolean plan_Executed__c,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.String project_Description__c,
           java.lang.String project_Priority__c,
           java.lang.String project_Stage__c,
           java.lang.String project_Status__c,
           com.sforce.soap.enterprise.QueryResult related_Ideas__r,
           java.lang.Boolean resourced__c,
           java.lang.Double score1__c,
           java.lang.Double score2__c,
           java.lang.Double score3__c,
           java.lang.Double score4__c,
           java.lang.Double score5__c,
           java.lang.String stage__c,
           java.lang.String status_Flag__c,
           java.lang.String success_Factors__c,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks,
           java.lang.String type_of_Project__c) {
        super(
            fieldsToNull,
            id);
        this.activityHistories = activityHistories;
        this.attachments = attachments;
        this.business_Justification__c = business_Justification__c;
        this.communicated__c = communicated__c;
        this.communication_Plan__c = communication_Plan__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.department__c = department__c;
        this.estimated_Completion_Date__c = estimated_Completion_Date__c;
        this.events = events;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.group__c = group__c;
        this.histories = histories;
        this.idea__c = idea__c;
        this.idea__r = idea__r;
        this.ideas_in_Action_Update__c = ideas_in_Action_Update__c;
        this.initial_Plan__c = initial_Plan__c;
        this.isDeleted = isDeleted;
        this.lastActivityDate = lastActivityDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.level_of_Effort__c = level_of_Effort__c;
        this.milestones__c = milestones__c;
        this.name = name;
        this.note_1__c = note_1__c;
        this.note_2__c = note_2__c;
        this.note_3__c = note_3__c;
        this.note_4__c = note_4__c;
        this.note_5__c = note_5__c;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.openActivities = openActivities;
        this.owner = owner;
        this.ownerId = ownerId;
        this.percent_Complete__c = percent_Complete__c;
        this.plan_Defined__c = plan_Defined__c;
        this.plan_Executed__c = plan_Executed__c;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.project_Description__c = project_Description__c;
        this.project_Priority__c = project_Priority__c;
        this.project_Stage__c = project_Stage__c;
        this.project_Status__c = project_Status__c;
        this.related_Ideas__r = related_Ideas__r;
        this.resourced__c = resourced__c;
        this.score1__c = score1__c;
        this.score2__c = score2__c;
        this.score3__c = score3__c;
        this.score4__c = score4__c;
        this.score5__c = score5__c;
        this.stage__c = stage__c;
        this.status_Flag__c = status_Flag__c;
        this.success_Factors__c = success_Factors__c;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
        this.type_of_Project__c = type_of_Project__c;
    }


    /**
     * Gets the activityHistories value for this Ideas_Projects__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this Ideas_Projects__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the attachments value for this Ideas_Projects__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Ideas_Projects__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the business_Justification__c value for this Ideas_Projects__c.
     * 
     * @return business_Justification__c
     */
    public java.lang.String getBusiness_Justification__c() {
        return business_Justification__c;
    }


    /**
     * Sets the business_Justification__c value for this Ideas_Projects__c.
     * 
     * @param business_Justification__c
     */
    public void setBusiness_Justification__c(java.lang.String business_Justification__c) {
        this.business_Justification__c = business_Justification__c;
    }


    /**
     * Gets the communicated__c value for this Ideas_Projects__c.
     * 
     * @return communicated__c
     */
    public java.lang.Boolean getCommunicated__c() {
        return communicated__c;
    }


    /**
     * Sets the communicated__c value for this Ideas_Projects__c.
     * 
     * @param communicated__c
     */
    public void setCommunicated__c(java.lang.Boolean communicated__c) {
        this.communicated__c = communicated__c;
    }


    /**
     * Gets the communication_Plan__c value for this Ideas_Projects__c.
     * 
     * @return communication_Plan__c
     */
    public java.lang.String getCommunication_Plan__c() {
        return communication_Plan__c;
    }


    /**
     * Sets the communication_Plan__c value for this Ideas_Projects__c.
     * 
     * @param communication_Plan__c
     */
    public void setCommunication_Plan__c(java.lang.String communication_Plan__c) {
        this.communication_Plan__c = communication_Plan__c;
    }


    /**
     * Gets the createdBy value for this Ideas_Projects__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Ideas_Projects__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Ideas_Projects__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Ideas_Projects__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Ideas_Projects__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Ideas_Projects__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the department__c value for this Ideas_Projects__c.
     * 
     * @return department__c
     */
    public java.lang.String getDepartment__c() {
        return department__c;
    }


    /**
     * Sets the department__c value for this Ideas_Projects__c.
     * 
     * @param department__c
     */
    public void setDepartment__c(java.lang.String department__c) {
        this.department__c = department__c;
    }


    /**
     * Gets the estimated_Completion_Date__c value for this Ideas_Projects__c.
     * 
     * @return estimated_Completion_Date__c
     */
    public java.util.Date getEstimated_Completion_Date__c() {
        return estimated_Completion_Date__c;
    }


    /**
     * Sets the estimated_Completion_Date__c value for this Ideas_Projects__c.
     * 
     * @param estimated_Completion_Date__c
     */
    public void setEstimated_Completion_Date__c(java.util.Date estimated_Completion_Date__c) {
        this.estimated_Completion_Date__c = estimated_Completion_Date__c;
    }


    /**
     * Gets the events value for this Ideas_Projects__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Ideas_Projects__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Ideas_Projects__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Ideas_Projects__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the group__c value for this Ideas_Projects__c.
     * 
     * @return group__c
     */
    public java.lang.String getGroup__c() {
        return group__c;
    }


    /**
     * Sets the group__c value for this Ideas_Projects__c.
     * 
     * @param group__c
     */
    public void setGroup__c(java.lang.String group__c) {
        this.group__c = group__c;
    }


    /**
     * Gets the histories value for this Ideas_Projects__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Ideas_Projects__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the idea__c value for this Ideas_Projects__c.
     * 
     * @return idea__c
     */
    public java.lang.String getIdea__c() {
        return idea__c;
    }


    /**
     * Sets the idea__c value for this Ideas_Projects__c.
     * 
     * @param idea__c
     */
    public void setIdea__c(java.lang.String idea__c) {
        this.idea__c = idea__c;
    }


    /**
     * Gets the idea__r value for this Ideas_Projects__c.
     * 
     * @return idea__r
     */
    public com.sforce.soap.enterprise.sobject.Idea getIdea__r() {
        return idea__r;
    }


    /**
     * Sets the idea__r value for this Ideas_Projects__c.
     * 
     * @param idea__r
     */
    public void setIdea__r(com.sforce.soap.enterprise.sobject.Idea idea__r) {
        this.idea__r = idea__r;
    }


    /**
     * Gets the ideas_in_Action_Update__c value for this Ideas_Projects__c.
     * 
     * @return ideas_in_Action_Update__c
     */
    public java.lang.String getIdeas_in_Action_Update__c() {
        return ideas_in_Action_Update__c;
    }


    /**
     * Sets the ideas_in_Action_Update__c value for this Ideas_Projects__c.
     * 
     * @param ideas_in_Action_Update__c
     */
    public void setIdeas_in_Action_Update__c(java.lang.String ideas_in_Action_Update__c) {
        this.ideas_in_Action_Update__c = ideas_in_Action_Update__c;
    }


    /**
     * Gets the initial_Plan__c value for this Ideas_Projects__c.
     * 
     * @return initial_Plan__c
     */
    public java.lang.Boolean getInitial_Plan__c() {
        return initial_Plan__c;
    }


    /**
     * Sets the initial_Plan__c value for this Ideas_Projects__c.
     * 
     * @param initial_Plan__c
     */
    public void setInitial_Plan__c(java.lang.Boolean initial_Plan__c) {
        this.initial_Plan__c = initial_Plan__c;
    }


    /**
     * Gets the isDeleted value for this Ideas_Projects__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Ideas_Projects__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastActivityDate value for this Ideas_Projects__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Ideas_Projects__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this Ideas_Projects__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Ideas_Projects__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Ideas_Projects__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Ideas_Projects__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Ideas_Projects__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Ideas_Projects__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the level_of_Effort__c value for this Ideas_Projects__c.
     * 
     * @return level_of_Effort__c
     */
    public java.lang.String getLevel_of_Effort__c() {
        return level_of_Effort__c;
    }


    /**
     * Sets the level_of_Effort__c value for this Ideas_Projects__c.
     * 
     * @param level_of_Effort__c
     */
    public void setLevel_of_Effort__c(java.lang.String level_of_Effort__c) {
        this.level_of_Effort__c = level_of_Effort__c;
    }


    /**
     * Gets the milestones__c value for this Ideas_Projects__c.
     * 
     * @return milestones__c
     */
    public java.lang.String getMilestones__c() {
        return milestones__c;
    }


    /**
     * Sets the milestones__c value for this Ideas_Projects__c.
     * 
     * @param milestones__c
     */
    public void setMilestones__c(java.lang.String milestones__c) {
        this.milestones__c = milestones__c;
    }


    /**
     * Gets the name value for this Ideas_Projects__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Ideas_Projects__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the note_1__c value for this Ideas_Projects__c.
     * 
     * @return note_1__c
     */
    public java.lang.String getNote_1__c() {
        return note_1__c;
    }


    /**
     * Sets the note_1__c value for this Ideas_Projects__c.
     * 
     * @param note_1__c
     */
    public void setNote_1__c(java.lang.String note_1__c) {
        this.note_1__c = note_1__c;
    }


    /**
     * Gets the note_2__c value for this Ideas_Projects__c.
     * 
     * @return note_2__c
     */
    public java.lang.String getNote_2__c() {
        return note_2__c;
    }


    /**
     * Sets the note_2__c value for this Ideas_Projects__c.
     * 
     * @param note_2__c
     */
    public void setNote_2__c(java.lang.String note_2__c) {
        this.note_2__c = note_2__c;
    }


    /**
     * Gets the note_3__c value for this Ideas_Projects__c.
     * 
     * @return note_3__c
     */
    public java.lang.String getNote_3__c() {
        return note_3__c;
    }


    /**
     * Sets the note_3__c value for this Ideas_Projects__c.
     * 
     * @param note_3__c
     */
    public void setNote_3__c(java.lang.String note_3__c) {
        this.note_3__c = note_3__c;
    }


    /**
     * Gets the note_4__c value for this Ideas_Projects__c.
     * 
     * @return note_4__c
     */
    public java.lang.String getNote_4__c() {
        return note_4__c;
    }


    /**
     * Sets the note_4__c value for this Ideas_Projects__c.
     * 
     * @param note_4__c
     */
    public void setNote_4__c(java.lang.String note_4__c) {
        this.note_4__c = note_4__c;
    }


    /**
     * Gets the note_5__c value for this Ideas_Projects__c.
     * 
     * @return note_5__c
     */
    public java.lang.String getNote_5__c() {
        return note_5__c;
    }


    /**
     * Sets the note_5__c value for this Ideas_Projects__c.
     * 
     * @param note_5__c
     */
    public void setNote_5__c(java.lang.String note_5__c) {
        this.note_5__c = note_5__c;
    }


    /**
     * Gets the notes value for this Ideas_Projects__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Ideas_Projects__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Ideas_Projects__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Ideas_Projects__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the openActivities value for this Ideas_Projects__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this Ideas_Projects__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the owner value for this Ideas_Projects__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Ideas_Projects__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Ideas_Projects__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Ideas_Projects__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the percent_Complete__c value for this Ideas_Projects__c.
     * 
     * @return percent_Complete__c
     */
    public java.lang.Double getPercent_Complete__c() {
        return percent_Complete__c;
    }


    /**
     * Sets the percent_Complete__c value for this Ideas_Projects__c.
     * 
     * @param percent_Complete__c
     */
    public void setPercent_Complete__c(java.lang.Double percent_Complete__c) {
        this.percent_Complete__c = percent_Complete__c;
    }


    /**
     * Gets the plan_Defined__c value for this Ideas_Projects__c.
     * 
     * @return plan_Defined__c
     */
    public java.lang.Boolean getPlan_Defined__c() {
        return plan_Defined__c;
    }


    /**
     * Sets the plan_Defined__c value for this Ideas_Projects__c.
     * 
     * @param plan_Defined__c
     */
    public void setPlan_Defined__c(java.lang.Boolean plan_Defined__c) {
        this.plan_Defined__c = plan_Defined__c;
    }


    /**
     * Gets the plan_Executed__c value for this Ideas_Projects__c.
     * 
     * @return plan_Executed__c
     */
    public java.lang.Boolean getPlan_Executed__c() {
        return plan_Executed__c;
    }


    /**
     * Sets the plan_Executed__c value for this Ideas_Projects__c.
     * 
     * @param plan_Executed__c
     */
    public void setPlan_Executed__c(java.lang.Boolean plan_Executed__c) {
        this.plan_Executed__c = plan_Executed__c;
    }


    /**
     * Gets the processInstances value for this Ideas_Projects__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Ideas_Projects__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Ideas_Projects__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Ideas_Projects__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the project_Description__c value for this Ideas_Projects__c.
     * 
     * @return project_Description__c
     */
    public java.lang.String getProject_Description__c() {
        return project_Description__c;
    }


    /**
     * Sets the project_Description__c value for this Ideas_Projects__c.
     * 
     * @param project_Description__c
     */
    public void setProject_Description__c(java.lang.String project_Description__c) {
        this.project_Description__c = project_Description__c;
    }


    /**
     * Gets the project_Priority__c value for this Ideas_Projects__c.
     * 
     * @return project_Priority__c
     */
    public java.lang.String getProject_Priority__c() {
        return project_Priority__c;
    }


    /**
     * Sets the project_Priority__c value for this Ideas_Projects__c.
     * 
     * @param project_Priority__c
     */
    public void setProject_Priority__c(java.lang.String project_Priority__c) {
        this.project_Priority__c = project_Priority__c;
    }


    /**
     * Gets the project_Stage__c value for this Ideas_Projects__c.
     * 
     * @return project_Stage__c
     */
    public java.lang.String getProject_Stage__c() {
        return project_Stage__c;
    }


    /**
     * Sets the project_Stage__c value for this Ideas_Projects__c.
     * 
     * @param project_Stage__c
     */
    public void setProject_Stage__c(java.lang.String project_Stage__c) {
        this.project_Stage__c = project_Stage__c;
    }


    /**
     * Gets the project_Status__c value for this Ideas_Projects__c.
     * 
     * @return project_Status__c
     */
    public java.lang.String getProject_Status__c() {
        return project_Status__c;
    }


    /**
     * Sets the project_Status__c value for this Ideas_Projects__c.
     * 
     * @param project_Status__c
     */
    public void setProject_Status__c(java.lang.String project_Status__c) {
        this.project_Status__c = project_Status__c;
    }


    /**
     * Gets the related_Ideas__r value for this Ideas_Projects__c.
     * 
     * @return related_Ideas__r
     */
    public com.sforce.soap.enterprise.QueryResult getRelated_Ideas__r() {
        return related_Ideas__r;
    }


    /**
     * Sets the related_Ideas__r value for this Ideas_Projects__c.
     * 
     * @param related_Ideas__r
     */
    public void setRelated_Ideas__r(com.sforce.soap.enterprise.QueryResult related_Ideas__r) {
        this.related_Ideas__r = related_Ideas__r;
    }


    /**
     * Gets the resourced__c value for this Ideas_Projects__c.
     * 
     * @return resourced__c
     */
    public java.lang.Boolean getResourced__c() {
        return resourced__c;
    }


    /**
     * Sets the resourced__c value for this Ideas_Projects__c.
     * 
     * @param resourced__c
     */
    public void setResourced__c(java.lang.Boolean resourced__c) {
        this.resourced__c = resourced__c;
    }


    /**
     * Gets the score1__c value for this Ideas_Projects__c.
     * 
     * @return score1__c
     */
    public java.lang.Double getScore1__c() {
        return score1__c;
    }


    /**
     * Sets the score1__c value for this Ideas_Projects__c.
     * 
     * @param score1__c
     */
    public void setScore1__c(java.lang.Double score1__c) {
        this.score1__c = score1__c;
    }


    /**
     * Gets the score2__c value for this Ideas_Projects__c.
     * 
     * @return score2__c
     */
    public java.lang.Double getScore2__c() {
        return score2__c;
    }


    /**
     * Sets the score2__c value for this Ideas_Projects__c.
     * 
     * @param score2__c
     */
    public void setScore2__c(java.lang.Double score2__c) {
        this.score2__c = score2__c;
    }


    /**
     * Gets the score3__c value for this Ideas_Projects__c.
     * 
     * @return score3__c
     */
    public java.lang.Double getScore3__c() {
        return score3__c;
    }


    /**
     * Sets the score3__c value for this Ideas_Projects__c.
     * 
     * @param score3__c
     */
    public void setScore3__c(java.lang.Double score3__c) {
        this.score3__c = score3__c;
    }


    /**
     * Gets the score4__c value for this Ideas_Projects__c.
     * 
     * @return score4__c
     */
    public java.lang.Double getScore4__c() {
        return score4__c;
    }


    /**
     * Sets the score4__c value for this Ideas_Projects__c.
     * 
     * @param score4__c
     */
    public void setScore4__c(java.lang.Double score4__c) {
        this.score4__c = score4__c;
    }


    /**
     * Gets the score5__c value for this Ideas_Projects__c.
     * 
     * @return score5__c
     */
    public java.lang.Double getScore5__c() {
        return score5__c;
    }


    /**
     * Sets the score5__c value for this Ideas_Projects__c.
     * 
     * @param score5__c
     */
    public void setScore5__c(java.lang.Double score5__c) {
        this.score5__c = score5__c;
    }


    /**
     * Gets the stage__c value for this Ideas_Projects__c.
     * 
     * @return stage__c
     */
    public java.lang.String getStage__c() {
        return stage__c;
    }


    /**
     * Sets the stage__c value for this Ideas_Projects__c.
     * 
     * @param stage__c
     */
    public void setStage__c(java.lang.String stage__c) {
        this.stage__c = stage__c;
    }


    /**
     * Gets the status_Flag__c value for this Ideas_Projects__c.
     * 
     * @return status_Flag__c
     */
    public java.lang.String getStatus_Flag__c() {
        return status_Flag__c;
    }


    /**
     * Sets the status_Flag__c value for this Ideas_Projects__c.
     * 
     * @param status_Flag__c
     */
    public void setStatus_Flag__c(java.lang.String status_Flag__c) {
        this.status_Flag__c = status_Flag__c;
    }


    /**
     * Gets the success_Factors__c value for this Ideas_Projects__c.
     * 
     * @return success_Factors__c
     */
    public java.lang.String getSuccess_Factors__c() {
        return success_Factors__c;
    }


    /**
     * Sets the success_Factors__c value for this Ideas_Projects__c.
     * 
     * @param success_Factors__c
     */
    public void setSuccess_Factors__c(java.lang.String success_Factors__c) {
        this.success_Factors__c = success_Factors__c;
    }


    /**
     * Gets the systemModstamp value for this Ideas_Projects__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Ideas_Projects__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this Ideas_Projects__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Ideas_Projects__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the type_of_Project__c value for this Ideas_Projects__c.
     * 
     * @return type_of_Project__c
     */
    public java.lang.String getType_of_Project__c() {
        return type_of_Project__c;
    }


    /**
     * Sets the type_of_Project__c value for this Ideas_Projects__c.
     * 
     * @param type_of_Project__c
     */
    public void setType_of_Project__c(java.lang.String type_of_Project__c) {
        this.type_of_Project__c = type_of_Project__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ideas_Projects__c)) return false;
        Ideas_Projects__c other = (Ideas_Projects__c) obj;
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
            ((this.business_Justification__c==null && other.getBusiness_Justification__c()==null) || 
             (this.business_Justification__c!=null &&
              this.business_Justification__c.equals(other.getBusiness_Justification__c()))) &&
            ((this.communicated__c==null && other.getCommunicated__c()==null) || 
             (this.communicated__c!=null &&
              this.communicated__c.equals(other.getCommunicated__c()))) &&
            ((this.communication_Plan__c==null && other.getCommunication_Plan__c()==null) || 
             (this.communication_Plan__c!=null &&
              this.communication_Plan__c.equals(other.getCommunication_Plan__c()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.department__c==null && other.getDepartment__c()==null) || 
             (this.department__c!=null &&
              this.department__c.equals(other.getDepartment__c()))) &&
            ((this.estimated_Completion_Date__c==null && other.getEstimated_Completion_Date__c()==null) || 
             (this.estimated_Completion_Date__c!=null &&
              this.estimated_Completion_Date__c.equals(other.getEstimated_Completion_Date__c()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              this.events.equals(other.getEvents()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.group__c==null && other.getGroup__c()==null) || 
             (this.group__c!=null &&
              this.group__c.equals(other.getGroup__c()))) &&
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
            ((this.idea__c==null && other.getIdea__c()==null) || 
             (this.idea__c!=null &&
              this.idea__c.equals(other.getIdea__c()))) &&
            ((this.idea__r==null && other.getIdea__r()==null) || 
             (this.idea__r!=null &&
              this.idea__r.equals(other.getIdea__r()))) &&
            ((this.ideas_in_Action_Update__c==null && other.getIdeas_in_Action_Update__c()==null) || 
             (this.ideas_in_Action_Update__c!=null &&
              this.ideas_in_Action_Update__c.equals(other.getIdeas_in_Action_Update__c()))) &&
            ((this.initial_Plan__c==null && other.getInitial_Plan__c()==null) || 
             (this.initial_Plan__c!=null &&
              this.initial_Plan__c.equals(other.getInitial_Plan__c()))) &&
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
            ((this.level_of_Effort__c==null && other.getLevel_of_Effort__c()==null) || 
             (this.level_of_Effort__c!=null &&
              this.level_of_Effort__c.equals(other.getLevel_of_Effort__c()))) &&
            ((this.milestones__c==null && other.getMilestones__c()==null) || 
             (this.milestones__c!=null &&
              this.milestones__c.equals(other.getMilestones__c()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.note_1__c==null && other.getNote_1__c()==null) || 
             (this.note_1__c!=null &&
              this.note_1__c.equals(other.getNote_1__c()))) &&
            ((this.note_2__c==null && other.getNote_2__c()==null) || 
             (this.note_2__c!=null &&
              this.note_2__c.equals(other.getNote_2__c()))) &&
            ((this.note_3__c==null && other.getNote_3__c()==null) || 
             (this.note_3__c!=null &&
              this.note_3__c.equals(other.getNote_3__c()))) &&
            ((this.note_4__c==null && other.getNote_4__c()==null) || 
             (this.note_4__c!=null &&
              this.note_4__c.equals(other.getNote_4__c()))) &&
            ((this.note_5__c==null && other.getNote_5__c()==null) || 
             (this.note_5__c!=null &&
              this.note_5__c.equals(other.getNote_5__c()))) &&
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
            ((this.percent_Complete__c==null && other.getPercent_Complete__c()==null) || 
             (this.percent_Complete__c!=null &&
              this.percent_Complete__c.equals(other.getPercent_Complete__c()))) &&
            ((this.plan_Defined__c==null && other.getPlan_Defined__c()==null) || 
             (this.plan_Defined__c!=null &&
              this.plan_Defined__c.equals(other.getPlan_Defined__c()))) &&
            ((this.plan_Executed__c==null && other.getPlan_Executed__c()==null) || 
             (this.plan_Executed__c!=null &&
              this.plan_Executed__c.equals(other.getPlan_Executed__c()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.project_Description__c==null && other.getProject_Description__c()==null) || 
             (this.project_Description__c!=null &&
              this.project_Description__c.equals(other.getProject_Description__c()))) &&
            ((this.project_Priority__c==null && other.getProject_Priority__c()==null) || 
             (this.project_Priority__c!=null &&
              this.project_Priority__c.equals(other.getProject_Priority__c()))) &&
            ((this.project_Stage__c==null && other.getProject_Stage__c()==null) || 
             (this.project_Stage__c!=null &&
              this.project_Stage__c.equals(other.getProject_Stage__c()))) &&
            ((this.project_Status__c==null && other.getProject_Status__c()==null) || 
             (this.project_Status__c!=null &&
              this.project_Status__c.equals(other.getProject_Status__c()))) &&
            ((this.related_Ideas__r==null && other.getRelated_Ideas__r()==null) || 
             (this.related_Ideas__r!=null &&
              this.related_Ideas__r.equals(other.getRelated_Ideas__r()))) &&
            ((this.resourced__c==null && other.getResourced__c()==null) || 
             (this.resourced__c!=null &&
              this.resourced__c.equals(other.getResourced__c()))) &&
            ((this.score1__c==null && other.getScore1__c()==null) || 
             (this.score1__c!=null &&
              this.score1__c.equals(other.getScore1__c()))) &&
            ((this.score2__c==null && other.getScore2__c()==null) || 
             (this.score2__c!=null &&
              this.score2__c.equals(other.getScore2__c()))) &&
            ((this.score3__c==null && other.getScore3__c()==null) || 
             (this.score3__c!=null &&
              this.score3__c.equals(other.getScore3__c()))) &&
            ((this.score4__c==null && other.getScore4__c()==null) || 
             (this.score4__c!=null &&
              this.score4__c.equals(other.getScore4__c()))) &&
            ((this.score5__c==null && other.getScore5__c()==null) || 
             (this.score5__c!=null &&
              this.score5__c.equals(other.getScore5__c()))) &&
            ((this.stage__c==null && other.getStage__c()==null) || 
             (this.stage__c!=null &&
              this.stage__c.equals(other.getStage__c()))) &&
            ((this.status_Flag__c==null && other.getStatus_Flag__c()==null) || 
             (this.status_Flag__c!=null &&
              this.status_Flag__c.equals(other.getStatus_Flag__c()))) &&
            ((this.success_Factors__c==null && other.getSuccess_Factors__c()==null) || 
             (this.success_Factors__c!=null &&
              this.success_Factors__c.equals(other.getSuccess_Factors__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              this.tasks.equals(other.getTasks()))) &&
            ((this.type_of_Project__c==null && other.getType_of_Project__c()==null) || 
             (this.type_of_Project__c!=null &&
              this.type_of_Project__c.equals(other.getType_of_Project__c())));
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
        if (getBusiness_Justification__c() != null) {
            _hashCode += getBusiness_Justification__c().hashCode();
        }
        if (getCommunicated__c() != null) {
            _hashCode += getCommunicated__c().hashCode();
        }
        if (getCommunication_Plan__c() != null) {
            _hashCode += getCommunication_Plan__c().hashCode();
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
        if (getDepartment__c() != null) {
            _hashCode += getDepartment__c().hashCode();
        }
        if (getEstimated_Completion_Date__c() != null) {
            _hashCode += getEstimated_Completion_Date__c().hashCode();
        }
        if (getEvents() != null) {
            _hashCode += getEvents().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getGroup__c() != null) {
            _hashCode += getGroup__c().hashCode();
        }
        if (getHistories() != null) {
            _hashCode += getHistories().hashCode();
        }
        if (getIdea__c() != null) {
            _hashCode += getIdea__c().hashCode();
        }
        if (getIdea__r() != null) {
            _hashCode += getIdea__r().hashCode();
        }
        if (getIdeas_in_Action_Update__c() != null) {
            _hashCode += getIdeas_in_Action_Update__c().hashCode();
        }
        if (getInitial_Plan__c() != null) {
            _hashCode += getInitial_Plan__c().hashCode();
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
        if (getLevel_of_Effort__c() != null) {
            _hashCode += getLevel_of_Effort__c().hashCode();
        }
        if (getMilestones__c() != null) {
            _hashCode += getMilestones__c().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNote_1__c() != null) {
            _hashCode += getNote_1__c().hashCode();
        }
        if (getNote_2__c() != null) {
            _hashCode += getNote_2__c().hashCode();
        }
        if (getNote_3__c() != null) {
            _hashCode += getNote_3__c().hashCode();
        }
        if (getNote_4__c() != null) {
            _hashCode += getNote_4__c().hashCode();
        }
        if (getNote_5__c() != null) {
            _hashCode += getNote_5__c().hashCode();
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
        if (getPercent_Complete__c() != null) {
            _hashCode += getPercent_Complete__c().hashCode();
        }
        if (getPlan_Defined__c() != null) {
            _hashCode += getPlan_Defined__c().hashCode();
        }
        if (getPlan_Executed__c() != null) {
            _hashCode += getPlan_Executed__c().hashCode();
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
        if (getProject_Priority__c() != null) {
            _hashCode += getProject_Priority__c().hashCode();
        }
        if (getProject_Stage__c() != null) {
            _hashCode += getProject_Stage__c().hashCode();
        }
        if (getProject_Status__c() != null) {
            _hashCode += getProject_Status__c().hashCode();
        }
        if (getRelated_Ideas__r() != null) {
            _hashCode += getRelated_Ideas__r().hashCode();
        }
        if (getResourced__c() != null) {
            _hashCode += getResourced__c().hashCode();
        }
        if (getScore1__c() != null) {
            _hashCode += getScore1__c().hashCode();
        }
        if (getScore2__c() != null) {
            _hashCode += getScore2__c().hashCode();
        }
        if (getScore3__c() != null) {
            _hashCode += getScore3__c().hashCode();
        }
        if (getScore4__c() != null) {
            _hashCode += getScore4__c().hashCode();
        }
        if (getScore5__c() != null) {
            _hashCode += getScore5__c().hashCode();
        }
        if (getStage__c() != null) {
            _hashCode += getStage__c().hashCode();
        }
        if (getStatus_Flag__c() != null) {
            _hashCode += getStatus_Flag__c().hashCode();
        }
        if (getSuccess_Factors__c() != null) {
            _hashCode += getSuccess_Factors__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTasks() != null) {
            _hashCode += getTasks().hashCode();
        }
        if (getType_of_Project__c() != null) {
            _hashCode += getType_of_Project__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ideas_Projects__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Ideas_Projects__c"));
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
        elemField.setFieldName("business_Justification__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Business_Justification__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communicated__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Communicated__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communication_Plan__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Communication_Plan__c"));
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
        elemField.setFieldName("department__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Department__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimated_Completion_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Estimated_Completion_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("group__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Group__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("idea__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Idea__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idea__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Idea__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Idea"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ideas_in_Action_Update__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Ideas_in_Action_Update__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initial_Plan__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Initial_Plan__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("level_of_Effort__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Level_of_Effort__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("milestones__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Milestones__c"));
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
        elemField.setFieldName("note_1__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Note_1__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note_2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Note_2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note_3__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Note_3__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note_4__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Note_4__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note_5__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Note_5__c"));
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
        elemField.setFieldName("percent_Complete__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Percent_Complete__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plan_Defined__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Plan_Defined__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plan_Executed__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Plan_Executed__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("project_Priority__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Project_Priority__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project_Stage__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Project_Stage__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project_Status__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Project_Status__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("related_Ideas__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Related_Ideas__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourced__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Resourced__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score1__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Score1__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Score2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score3__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Score3__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score4__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Score4__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score5__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Score5__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stage__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Stage__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status_Flag__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status_Flag__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success_Factors__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Success_Factors__c"));
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
        elemField.setFieldName("type_of_Project__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Type_of_Project__c"));
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

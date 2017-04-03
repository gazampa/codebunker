/**
 * Status_Meeting__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Status_Meeting__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String account_Name__c;

    private java.lang.String account__c;

    private com.sforce.soap.enterprise.sobject.Account account__r;

    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private java.lang.String agenda__c;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String conference_Audio_Code__c;

    private java.lang.String conference_PIN__c;

    private java.lang.String conference_Phone__c;

    private java.lang.String conference_URL__c;

    private java.lang.String contact__c;

    private com.sforce.soap.enterprise.sobject.Contact contact__r;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String day_of_Month__c;

    private java.lang.String day_of_Week__c;

    private java.lang.String department__c;

    private java.lang.String description__c;

    private java.lang.Double duration__c;

    private java.lang.String end_Time__c;

    private java.util.Calendar end__c;

    private java.lang.String eventId__c;

    private com.sforce.soap.enterprise.QueryResult events;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.String host_Email__c;

    private java.lang.String host_Phone__c;

    private java.lang.Boolean initial_Meeting__c;

    private java.lang.Boolean insert_Flag__c;

    private java.lang.String instructions__c;

    private java.lang.Boolean invite_Flag__c;

    private java.lang.Boolean isDeleted;

    private java.util.Date lastActivityDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String location__c;

    private java.lang.String meeting_Host__c;

    private java.lang.String more_Information__c;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private java.lang.String notes__c;

    private com.sforce.soap.enterprise.QueryResult openActivities;

    private java.lang.String parent_Event_ID__c;

    private java.lang.String parent_Event_Link__c;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.util.Date recurring_End_Date__c;

    private java.lang.String recurring_Frequency__c;

    private java.lang.Double recurring_Interval__c;

    private java.lang.Boolean recurring__c;

    private java.lang.Double reminder_Minutes__c;

    private java.lang.Boolean reminder__c;

    private java.lang.String start_Time__c;

    private java.util.Calendar start__c;

    private com.sforce.soap.enterprise.QueryResult status_Meeting_Attendees__r;

    private java.lang.String subject__c;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    private com.sforce.soap.enterprise.QueryResult tickets__r;

    private java.lang.Double update_Count__c;

    private java.lang.Boolean update_Flag__c;

    private java.lang.Boolean hasScheduledTicket__c;

    public Status_Meeting__c() {
    }

    public Status_Meeting__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String account_Name__c,
           java.lang.String account__c,
           com.sforce.soap.enterprise.sobject.Account account__r,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           java.lang.String agenda__c,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String conference_Audio_Code__c,
           java.lang.String conference_PIN__c,
           java.lang.String conference_Phone__c,
           java.lang.String conference_URL__c,
           java.lang.String contact__c,
           com.sforce.soap.enterprise.sobject.Contact contact__r,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String day_of_Month__c,
           java.lang.String day_of_Week__c,
           java.lang.String department__c,
           java.lang.String description__c,
           java.lang.Double duration__c,
           java.lang.String end_Time__c,
           java.util.Calendar end__c,
           java.lang.String eventId__c,
           com.sforce.soap.enterprise.QueryResult events,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.String host_Email__c,
           java.lang.String host_Phone__c,
           java.lang.Boolean initial_Meeting__c,
           java.lang.Boolean insert_Flag__c,
           java.lang.String instructions__c,
           java.lang.Boolean invite_Flag__c,
           java.lang.Boolean isDeleted,
           java.util.Date lastActivityDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String location__c,
           java.lang.String meeting_Host__c,
           java.lang.String more_Information__c,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           java.lang.String notes__c,
           com.sforce.soap.enterprise.QueryResult openActivities,
           java.lang.String parent_Event_ID__c,
           java.lang.String parent_Event_Link__c,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.util.Date recurring_End_Date__c,
           java.lang.String recurring_Frequency__c,
           java.lang.Double recurring_Interval__c,
           java.lang.Boolean recurring__c,
           java.lang.Double reminder_Minutes__c,
           java.lang.Boolean reminder__c,
           java.lang.String start_Time__c,
           java.util.Calendar start__c,
           com.sforce.soap.enterprise.QueryResult status_Meeting_Attendees__r,
           java.lang.String subject__c,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks,
           com.sforce.soap.enterprise.QueryResult tickets__r,
           java.lang.Double update_Count__c,
           java.lang.Boolean update_Flag__c,
           java.lang.Boolean hasScheduledTicket__c) {
        super(
            fieldsToNull,
            id);
        this.account_Name__c = account_Name__c;
        this.account__c = account__c;
        this.account__r = account__r;
        this.activityHistories = activityHistories;
        this.agenda__c = agenda__c;
        this.attachments = attachments;
        this.conference_Audio_Code__c = conference_Audio_Code__c;
        this.conference_PIN__c = conference_PIN__c;
        this.conference_Phone__c = conference_Phone__c;
        this.conference_URL__c = conference_URL__c;
        this.contact__c = contact__c;
        this.contact__r = contact__r;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.day_of_Month__c = day_of_Month__c;
        this.day_of_Week__c = day_of_Week__c;
        this.department__c = department__c;
        this.description__c = description__c;
        this.duration__c = duration__c;
        this.end_Time__c = end_Time__c;
        this.end__c = end__c;
        this.eventId__c = eventId__c;
        this.events = events;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.histories = histories;
        this.host_Email__c = host_Email__c;
        this.host_Phone__c = host_Phone__c;
        this.initial_Meeting__c = initial_Meeting__c;
        this.insert_Flag__c = insert_Flag__c;
        this.instructions__c = instructions__c;
        this.invite_Flag__c = invite_Flag__c;
        this.isDeleted = isDeleted;
        this.lastActivityDate = lastActivityDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.location__c = location__c;
        this.meeting_Host__c = meeting_Host__c;
        this.more_Information__c = more_Information__c;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.notes__c = notes__c;
        this.openActivities = openActivities;
        this.parent_Event_ID__c = parent_Event_ID__c;
        this.parent_Event_Link__c = parent_Event_Link__c;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.recurring_End_Date__c = recurring_End_Date__c;
        this.recurring_Frequency__c = recurring_Frequency__c;
        this.recurring_Interval__c = recurring_Interval__c;
        this.recurring__c = recurring__c;
        this.reminder_Minutes__c = reminder_Minutes__c;
        this.reminder__c = reminder__c;
        this.start_Time__c = start_Time__c;
        this.start__c = start__c;
        this.status_Meeting_Attendees__r = status_Meeting_Attendees__r;
        this.subject__c = subject__c;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
        this.tickets__r = tickets__r;
        this.update_Count__c = update_Count__c;
        this.update_Flag__c = update_Flag__c;
        this.hasScheduledTicket__c = hasScheduledTicket__c;
    }


    /**
     * Gets the account_Name__c value for this Status_Meeting__c.
     * 
     * @return account_Name__c
     */
    public java.lang.String getAccount_Name__c() {
        return account_Name__c;
    }


    /**
     * Sets the account_Name__c value for this Status_Meeting__c.
     * 
     * @param account_Name__c
     */
    public void setAccount_Name__c(java.lang.String account_Name__c) {
        this.account_Name__c = account_Name__c;
    }


    /**
     * Gets the account__c value for this Status_Meeting__c.
     * 
     * @return account__c
     */
    public java.lang.String getAccount__c() {
        return account__c;
    }


    /**
     * Sets the account__c value for this Status_Meeting__c.
     * 
     * @param account__c
     */
    public void setAccount__c(java.lang.String account__c) {
        this.account__c = account__c;
    }


    /**
     * Gets the account__r value for this Status_Meeting__c.
     * 
     * @return account__r
     */
    public com.sforce.soap.enterprise.sobject.Account getAccount__r() {
        return account__r;
    }


    /**
     * Sets the account__r value for this Status_Meeting__c.
     * 
     * @param account__r
     */
    public void setAccount__r(com.sforce.soap.enterprise.sobject.Account account__r) {
        this.account__r = account__r;
    }


    /**
     * Gets the activityHistories value for this Status_Meeting__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this Status_Meeting__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the agenda__c value for this Status_Meeting__c.
     * 
     * @return agenda__c
     */
    public java.lang.String getAgenda__c() {
        return agenda__c;
    }


    /**
     * Sets the agenda__c value for this Status_Meeting__c.
     * 
     * @param agenda__c
     */
    public void setAgenda__c(java.lang.String agenda__c) {
        this.agenda__c = agenda__c;
    }


    /**
     * Gets the attachments value for this Status_Meeting__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Status_Meeting__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the conference_Audio_Code__c value for this Status_Meeting__c.
     * 
     * @return conference_Audio_Code__c
     */
    public java.lang.String getConference_Audio_Code__c() {
        return conference_Audio_Code__c;
    }


    /**
     * Sets the conference_Audio_Code__c value for this Status_Meeting__c.
     * 
     * @param conference_Audio_Code__c
     */
    public void setConference_Audio_Code__c(java.lang.String conference_Audio_Code__c) {
        this.conference_Audio_Code__c = conference_Audio_Code__c;
    }


    /**
     * Gets the conference_PIN__c value for this Status_Meeting__c.
     * 
     * @return conference_PIN__c
     */
    public java.lang.String getConference_PIN__c() {
        return conference_PIN__c;
    }


    /**
     * Sets the conference_PIN__c value for this Status_Meeting__c.
     * 
     * @param conference_PIN__c
     */
    public void setConference_PIN__c(java.lang.String conference_PIN__c) {
        this.conference_PIN__c = conference_PIN__c;
    }


    /**
     * Gets the conference_Phone__c value for this Status_Meeting__c.
     * 
     * @return conference_Phone__c
     */
    public java.lang.String getConference_Phone__c() {
        return conference_Phone__c;
    }


    /**
     * Sets the conference_Phone__c value for this Status_Meeting__c.
     * 
     * @param conference_Phone__c
     */
    public void setConference_Phone__c(java.lang.String conference_Phone__c) {
        this.conference_Phone__c = conference_Phone__c;
    }


    /**
     * Gets the conference_URL__c value for this Status_Meeting__c.
     * 
     * @return conference_URL__c
     */
    public java.lang.String getConference_URL__c() {
        return conference_URL__c;
    }


    /**
     * Sets the conference_URL__c value for this Status_Meeting__c.
     * 
     * @param conference_URL__c
     */
    public void setConference_URL__c(java.lang.String conference_URL__c) {
        this.conference_URL__c = conference_URL__c;
    }


    /**
     * Gets the contact__c value for this Status_Meeting__c.
     * 
     * @return contact__c
     */
    public java.lang.String getContact__c() {
        return contact__c;
    }


    /**
     * Sets the contact__c value for this Status_Meeting__c.
     * 
     * @param contact__c
     */
    public void setContact__c(java.lang.String contact__c) {
        this.contact__c = contact__c;
    }


    /**
     * Gets the contact__r value for this Status_Meeting__c.
     * 
     * @return contact__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getContact__r() {
        return contact__r;
    }


    /**
     * Sets the contact__r value for this Status_Meeting__c.
     * 
     * @param contact__r
     */
    public void setContact__r(com.sforce.soap.enterprise.sobject.Contact contact__r) {
        this.contact__r = contact__r;
    }


    /**
     * Gets the createdBy value for this Status_Meeting__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Status_Meeting__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Status_Meeting__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Status_Meeting__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Status_Meeting__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Status_Meeting__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the day_of_Month__c value for this Status_Meeting__c.
     * 
     * @return day_of_Month__c
     */
    public java.lang.String getDay_of_Month__c() {
        return day_of_Month__c;
    }


    /**
     * Sets the day_of_Month__c value for this Status_Meeting__c.
     * 
     * @param day_of_Month__c
     */
    public void setDay_of_Month__c(java.lang.String day_of_Month__c) {
        this.day_of_Month__c = day_of_Month__c;
    }


    /**
     * Gets the day_of_Week__c value for this Status_Meeting__c.
     * 
     * @return day_of_Week__c
     */
    public java.lang.String getDay_of_Week__c() {
        return day_of_Week__c;
    }


    /**
     * Sets the day_of_Week__c value for this Status_Meeting__c.
     * 
     * @param day_of_Week__c
     */
    public void setDay_of_Week__c(java.lang.String day_of_Week__c) {
        this.day_of_Week__c = day_of_Week__c;
    }


    /**
     * Gets the department__c value for this Status_Meeting__c.
     * 
     * @return department__c
     */
    public java.lang.String getDepartment__c() {
        return department__c;
    }


    /**
     * Sets the department__c value for this Status_Meeting__c.
     * 
     * @param department__c
     */
    public void setDepartment__c(java.lang.String department__c) {
        this.department__c = department__c;
    }


    /**
     * Gets the description__c value for this Status_Meeting__c.
     * 
     * @return description__c
     */
    public java.lang.String getDescription__c() {
        return description__c;
    }


    /**
     * Sets the description__c value for this Status_Meeting__c.
     * 
     * @param description__c
     */
    public void setDescription__c(java.lang.String description__c) {
        this.description__c = description__c;
    }


    /**
     * Gets the duration__c value for this Status_Meeting__c.
     * 
     * @return duration__c
     */
    public java.lang.Double getDuration__c() {
        return duration__c;
    }


    /**
     * Sets the duration__c value for this Status_Meeting__c.
     * 
     * @param duration__c
     */
    public void setDuration__c(java.lang.Double duration__c) {
        this.duration__c = duration__c;
    }


    /**
     * Gets the end_Time__c value for this Status_Meeting__c.
     * 
     * @return end_Time__c
     */
    public java.lang.String getEnd_Time__c() {
        return end_Time__c;
    }


    /**
     * Sets the end_Time__c value for this Status_Meeting__c.
     * 
     * @param end_Time__c
     */
    public void setEnd_Time__c(java.lang.String end_Time__c) {
        this.end_Time__c = end_Time__c;
    }


    /**
     * Gets the end__c value for this Status_Meeting__c.
     * 
     * @return end__c
     */
    public java.util.Calendar getEnd__c() {
        return end__c;
    }


    /**
     * Sets the end__c value for this Status_Meeting__c.
     * 
     * @param end__c
     */
    public void setEnd__c(java.util.Calendar end__c) {
        this.end__c = end__c;
    }


    /**
     * Gets the eventId__c value for this Status_Meeting__c.
     * 
     * @return eventId__c
     */
    public java.lang.String getEventId__c() {
        return eventId__c;
    }


    /**
     * Sets the eventId__c value for this Status_Meeting__c.
     * 
     * @param eventId__c
     */
    public void setEventId__c(java.lang.String eventId__c) {
        this.eventId__c = eventId__c;
    }


    /**
     * Gets the events value for this Status_Meeting__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Status_Meeting__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Status_Meeting__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Status_Meeting__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the histories value for this Status_Meeting__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Status_Meeting__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the host_Email__c value for this Status_Meeting__c.
     * 
     * @return host_Email__c
     */
    public java.lang.String getHost_Email__c() {
        return host_Email__c;
    }


    /**
     * Sets the host_Email__c value for this Status_Meeting__c.
     * 
     * @param host_Email__c
     */
    public void setHost_Email__c(java.lang.String host_Email__c) {
        this.host_Email__c = host_Email__c;
    }


    /**
     * Gets the host_Phone__c value for this Status_Meeting__c.
     * 
     * @return host_Phone__c
     */
    public java.lang.String getHost_Phone__c() {
        return host_Phone__c;
    }


    /**
     * Sets the host_Phone__c value for this Status_Meeting__c.
     * 
     * @param host_Phone__c
     */
    public void setHost_Phone__c(java.lang.String host_Phone__c) {
        this.host_Phone__c = host_Phone__c;
    }


    /**
     * Gets the initial_Meeting__c value for this Status_Meeting__c.
     * 
     * @return initial_Meeting__c
     */
    public java.lang.Boolean getInitial_Meeting__c() {
        return initial_Meeting__c;
    }


    /**
     * Sets the initial_Meeting__c value for this Status_Meeting__c.
     * 
     * @param initial_Meeting__c
     */
    public void setInitial_Meeting__c(java.lang.Boolean initial_Meeting__c) {
        this.initial_Meeting__c = initial_Meeting__c;
    }


    /**
     * Gets the insert_Flag__c value for this Status_Meeting__c.
     * 
     * @return insert_Flag__c
     */
    public java.lang.Boolean getInsert_Flag__c() {
        return insert_Flag__c;
    }


    /**
     * Sets the insert_Flag__c value for this Status_Meeting__c.
     * 
     * @param insert_Flag__c
     */
    public void setInsert_Flag__c(java.lang.Boolean insert_Flag__c) {
        this.insert_Flag__c = insert_Flag__c;
    }


    /**
     * Gets the instructions__c value for this Status_Meeting__c.
     * 
     * @return instructions__c
     */
    public java.lang.String getInstructions__c() {
        return instructions__c;
    }


    /**
     * Sets the instructions__c value for this Status_Meeting__c.
     * 
     * @param instructions__c
     */
    public void setInstructions__c(java.lang.String instructions__c) {
        this.instructions__c = instructions__c;
    }


    /**
     * Gets the invite_Flag__c value for this Status_Meeting__c.
     * 
     * @return invite_Flag__c
     */
    public java.lang.Boolean getInvite_Flag__c() {
        return invite_Flag__c;
    }


    /**
     * Sets the invite_Flag__c value for this Status_Meeting__c.
     * 
     * @param invite_Flag__c
     */
    public void setInvite_Flag__c(java.lang.Boolean invite_Flag__c) {
        this.invite_Flag__c = invite_Flag__c;
    }


    /**
     * Gets the isDeleted value for this Status_Meeting__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Status_Meeting__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastActivityDate value for this Status_Meeting__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Status_Meeting__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this Status_Meeting__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Status_Meeting__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Status_Meeting__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Status_Meeting__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Status_Meeting__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Status_Meeting__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the location__c value for this Status_Meeting__c.
     * 
     * @return location__c
     */
    public java.lang.String getLocation__c() {
        return location__c;
    }


    /**
     * Sets the location__c value for this Status_Meeting__c.
     * 
     * @param location__c
     */
    public void setLocation__c(java.lang.String location__c) {
        this.location__c = location__c;
    }


    /**
     * Gets the meeting_Host__c value for this Status_Meeting__c.
     * 
     * @return meeting_Host__c
     */
    public java.lang.String getMeeting_Host__c() {
        return meeting_Host__c;
    }


    /**
     * Sets the meeting_Host__c value for this Status_Meeting__c.
     * 
     * @param meeting_Host__c
     */
    public void setMeeting_Host__c(java.lang.String meeting_Host__c) {
        this.meeting_Host__c = meeting_Host__c;
    }


    /**
     * Gets the more_Information__c value for this Status_Meeting__c.
     * 
     * @return more_Information__c
     */
    public java.lang.String getMore_Information__c() {
        return more_Information__c;
    }


    /**
     * Sets the more_Information__c value for this Status_Meeting__c.
     * 
     * @param more_Information__c
     */
    public void setMore_Information__c(java.lang.String more_Information__c) {
        this.more_Information__c = more_Information__c;
    }


    /**
     * Gets the name value for this Status_Meeting__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Status_Meeting__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Status_Meeting__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Status_Meeting__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Status_Meeting__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Status_Meeting__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the notes__c value for this Status_Meeting__c.
     * 
     * @return notes__c
     */
    public java.lang.String getNotes__c() {
        return notes__c;
    }


    /**
     * Sets the notes__c value for this Status_Meeting__c.
     * 
     * @param notes__c
     */
    public void setNotes__c(java.lang.String notes__c) {
        this.notes__c = notes__c;
    }


    /**
     * Gets the openActivities value for this Status_Meeting__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this Status_Meeting__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the parent_Event_ID__c value for this Status_Meeting__c.
     * 
     * @return parent_Event_ID__c
     */
    public java.lang.String getParent_Event_ID__c() {
        return parent_Event_ID__c;
    }


    /**
     * Sets the parent_Event_ID__c value for this Status_Meeting__c.
     * 
     * @param parent_Event_ID__c
     */
    public void setParent_Event_ID__c(java.lang.String parent_Event_ID__c) {
        this.parent_Event_ID__c = parent_Event_ID__c;
    }


    /**
     * Gets the parent_Event_Link__c value for this Status_Meeting__c.
     * 
     * @return parent_Event_Link__c
     */
    public java.lang.String getParent_Event_Link__c() {
        return parent_Event_Link__c;
    }


    /**
     * Sets the parent_Event_Link__c value for this Status_Meeting__c.
     * 
     * @param parent_Event_Link__c
     */
    public void setParent_Event_Link__c(java.lang.String parent_Event_Link__c) {
        this.parent_Event_Link__c = parent_Event_Link__c;
    }


    /**
     * Gets the processInstances value for this Status_Meeting__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Status_Meeting__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Status_Meeting__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Status_Meeting__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the recurring_End_Date__c value for this Status_Meeting__c.
     * 
     * @return recurring_End_Date__c
     */
    public java.util.Date getRecurring_End_Date__c() {
        return recurring_End_Date__c;
    }


    /**
     * Sets the recurring_End_Date__c value for this Status_Meeting__c.
     * 
     * @param recurring_End_Date__c
     */
    public void setRecurring_End_Date__c(java.util.Date recurring_End_Date__c) {
        this.recurring_End_Date__c = recurring_End_Date__c;
    }


    /**
     * Gets the recurring_Frequency__c value for this Status_Meeting__c.
     * 
     * @return recurring_Frequency__c
     */
    public java.lang.String getRecurring_Frequency__c() {
        return recurring_Frequency__c;
    }


    /**
     * Sets the recurring_Frequency__c value for this Status_Meeting__c.
     * 
     * @param recurring_Frequency__c
     */
    public void setRecurring_Frequency__c(java.lang.String recurring_Frequency__c) {
        this.recurring_Frequency__c = recurring_Frequency__c;
    }


    /**
     * Gets the recurring_Interval__c value for this Status_Meeting__c.
     * 
     * @return recurring_Interval__c
     */
    public java.lang.Double getRecurring_Interval__c() {
        return recurring_Interval__c;
    }


    /**
     * Sets the recurring_Interval__c value for this Status_Meeting__c.
     * 
     * @param recurring_Interval__c
     */
    public void setRecurring_Interval__c(java.lang.Double recurring_Interval__c) {
        this.recurring_Interval__c = recurring_Interval__c;
    }


    /**
     * Gets the recurring__c value for this Status_Meeting__c.
     * 
     * @return recurring__c
     */
    public java.lang.Boolean getRecurring__c() {
        return recurring__c;
    }


    /**
     * Sets the recurring__c value for this Status_Meeting__c.
     * 
     * @param recurring__c
     */
    public void setRecurring__c(java.lang.Boolean recurring__c) {
        this.recurring__c = recurring__c;
    }


    /**
     * Gets the reminder_Minutes__c value for this Status_Meeting__c.
     * 
     * @return reminder_Minutes__c
     */
    public java.lang.Double getReminder_Minutes__c() {
        return reminder_Minutes__c;
    }


    /**
     * Sets the reminder_Minutes__c value for this Status_Meeting__c.
     * 
     * @param reminder_Minutes__c
     */
    public void setReminder_Minutes__c(java.lang.Double reminder_Minutes__c) {
        this.reminder_Minutes__c = reminder_Minutes__c;
    }


    /**
     * Gets the reminder__c value for this Status_Meeting__c.
     * 
     * @return reminder__c
     */
    public java.lang.Boolean getReminder__c() {
        return reminder__c;
    }


    /**
     * Sets the reminder__c value for this Status_Meeting__c.
     * 
     * @param reminder__c
     */
    public void setReminder__c(java.lang.Boolean reminder__c) {
        this.reminder__c = reminder__c;
    }


    /**
     * Gets the start_Time__c value for this Status_Meeting__c.
     * 
     * @return start_Time__c
     */
    public java.lang.String getStart_Time__c() {
        return start_Time__c;
    }


    /**
     * Sets the start_Time__c value for this Status_Meeting__c.
     * 
     * @param start_Time__c
     */
    public void setStart_Time__c(java.lang.String start_Time__c) {
        this.start_Time__c = start_Time__c;
    }


    /**
     * Gets the start__c value for this Status_Meeting__c.
     * 
     * @return start__c
     */
    public java.util.Calendar getStart__c() {
        return start__c;
    }


    /**
     * Sets the start__c value for this Status_Meeting__c.
     * 
     * @param start__c
     */
    public void setStart__c(java.util.Calendar start__c) {
        this.start__c = start__c;
    }


    /**
     * Gets the status_Meeting_Attendees__r value for this Status_Meeting__c.
     * 
     * @return status_Meeting_Attendees__r
     */
    public com.sforce.soap.enterprise.QueryResult getStatus_Meeting_Attendees__r() {
        return status_Meeting_Attendees__r;
    }


    /**
     * Sets the status_Meeting_Attendees__r value for this Status_Meeting__c.
     * 
     * @param status_Meeting_Attendees__r
     */
    public void setStatus_Meeting_Attendees__r(com.sforce.soap.enterprise.QueryResult status_Meeting_Attendees__r) {
        this.status_Meeting_Attendees__r = status_Meeting_Attendees__r;
    }


    /**
     * Gets the subject__c value for this Status_Meeting__c.
     * 
     * @return subject__c
     */
    public java.lang.String getSubject__c() {
        return subject__c;
    }


    /**
     * Sets the subject__c value for this Status_Meeting__c.
     * 
     * @param subject__c
     */
    public void setSubject__c(java.lang.String subject__c) {
        this.subject__c = subject__c;
    }


    /**
     * Gets the systemModstamp value for this Status_Meeting__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Status_Meeting__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this Status_Meeting__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Status_Meeting__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the tickets__r value for this Status_Meeting__c.
     * 
     * @return tickets__r
     */
    public com.sforce.soap.enterprise.QueryResult getTickets__r() {
        return tickets__r;
    }


    /**
     * Sets the tickets__r value for this Status_Meeting__c.
     * 
     * @param tickets__r
     */
    public void setTickets__r(com.sforce.soap.enterprise.QueryResult tickets__r) {
        this.tickets__r = tickets__r;
    }


    /**
     * Gets the update_Count__c value for this Status_Meeting__c.
     * 
     * @return update_Count__c
     */
    public java.lang.Double getUpdate_Count__c() {
        return update_Count__c;
    }


    /**
     * Sets the update_Count__c value for this Status_Meeting__c.
     * 
     * @param update_Count__c
     */
    public void setUpdate_Count__c(java.lang.Double update_Count__c) {
        this.update_Count__c = update_Count__c;
    }


    /**
     * Gets the update_Flag__c value for this Status_Meeting__c.
     * 
     * @return update_Flag__c
     */
    public java.lang.Boolean getUpdate_Flag__c() {
        return update_Flag__c;
    }


    /**
     * Sets the update_Flag__c value for this Status_Meeting__c.
     * 
     * @param update_Flag__c
     */
    public void setUpdate_Flag__c(java.lang.Boolean update_Flag__c) {
        this.update_Flag__c = update_Flag__c;
    }


    /**
     * Gets the hasScheduledTicket__c value for this Status_Meeting__c.
     * 
     * @return hasScheduledTicket__c
     */
    public java.lang.Boolean getHasScheduledTicket__c() {
        return hasScheduledTicket__c;
    }


    /**
     * Sets the hasScheduledTicket__c value for this Status_Meeting__c.
     * 
     * @param hasScheduledTicket__c
     */
    public void setHasScheduledTicket__c(java.lang.Boolean hasScheduledTicket__c) {
        this.hasScheduledTicket__c = hasScheduledTicket__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Status_Meeting__c)) return false;
        Status_Meeting__c other = (Status_Meeting__c) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.account_Name__c==null && other.getAccount_Name__c()==null) || 
             (this.account_Name__c!=null &&
              this.account_Name__c.equals(other.getAccount_Name__c()))) &&
            ((this.account__c==null && other.getAccount__c()==null) || 
             (this.account__c!=null &&
              this.account__c.equals(other.getAccount__c()))) &&
            ((this.account__r==null && other.getAccount__r()==null) || 
             (this.account__r!=null &&
              this.account__r.equals(other.getAccount__r()))) &&
            ((this.activityHistories==null && other.getActivityHistories()==null) || 
             (this.activityHistories!=null &&
              this.activityHistories.equals(other.getActivityHistories()))) &&
            ((this.agenda__c==null && other.getAgenda__c()==null) || 
             (this.agenda__c!=null &&
              this.agenda__c.equals(other.getAgenda__c()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.conference_Audio_Code__c==null && other.getConference_Audio_Code__c()==null) || 
             (this.conference_Audio_Code__c!=null &&
              this.conference_Audio_Code__c.equals(other.getConference_Audio_Code__c()))) &&
            ((this.conference_PIN__c==null && other.getConference_PIN__c()==null) || 
             (this.conference_PIN__c!=null &&
              this.conference_PIN__c.equals(other.getConference_PIN__c()))) &&
            ((this.conference_Phone__c==null && other.getConference_Phone__c()==null) || 
             (this.conference_Phone__c!=null &&
              this.conference_Phone__c.equals(other.getConference_Phone__c()))) &&
            ((this.conference_URL__c==null && other.getConference_URL__c()==null) || 
             (this.conference_URL__c!=null &&
              this.conference_URL__c.equals(other.getConference_URL__c()))) &&
            ((this.contact__c==null && other.getContact__c()==null) || 
             (this.contact__c!=null &&
              this.contact__c.equals(other.getContact__c()))) &&
            ((this.contact__r==null && other.getContact__r()==null) || 
             (this.contact__r!=null &&
              this.contact__r.equals(other.getContact__r()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.day_of_Month__c==null && other.getDay_of_Month__c()==null) || 
             (this.day_of_Month__c!=null &&
              this.day_of_Month__c.equals(other.getDay_of_Month__c()))) &&
            ((this.day_of_Week__c==null && other.getDay_of_Week__c()==null) || 
             (this.day_of_Week__c!=null &&
              this.day_of_Week__c.equals(other.getDay_of_Week__c()))) &&
            ((this.department__c==null && other.getDepartment__c()==null) || 
             (this.department__c!=null &&
              this.department__c.equals(other.getDepartment__c()))) &&
            ((this.description__c==null && other.getDescription__c()==null) || 
             (this.description__c!=null &&
              this.description__c.equals(other.getDescription__c()))) &&
            ((this.duration__c==null && other.getDuration__c()==null) || 
             (this.duration__c!=null &&
              this.duration__c.equals(other.getDuration__c()))) &&
            ((this.end_Time__c==null && other.getEnd_Time__c()==null) || 
             (this.end_Time__c!=null &&
              this.end_Time__c.equals(other.getEnd_Time__c()))) &&
            ((this.end__c==null && other.getEnd__c()==null) || 
             (this.end__c!=null &&
              this.end__c.equals(other.getEnd__c()))) &&
            ((this.eventId__c==null && other.getEventId__c()==null) || 
             (this.eventId__c!=null &&
              this.eventId__c.equals(other.getEventId__c()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              this.events.equals(other.getEvents()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
            ((this.host_Email__c==null && other.getHost_Email__c()==null) || 
             (this.host_Email__c!=null &&
              this.host_Email__c.equals(other.getHost_Email__c()))) &&
            ((this.host_Phone__c==null && other.getHost_Phone__c()==null) || 
             (this.host_Phone__c!=null &&
              this.host_Phone__c.equals(other.getHost_Phone__c()))) &&
            ((this.initial_Meeting__c==null && other.getInitial_Meeting__c()==null) || 
             (this.initial_Meeting__c!=null &&
              this.initial_Meeting__c.equals(other.getInitial_Meeting__c()))) &&
            ((this.insert_Flag__c==null && other.getInsert_Flag__c()==null) || 
             (this.insert_Flag__c!=null &&
              this.insert_Flag__c.equals(other.getInsert_Flag__c()))) &&
            ((this.instructions__c==null && other.getInstructions__c()==null) || 
             (this.instructions__c!=null &&
              this.instructions__c.equals(other.getInstructions__c()))) &&
            ((this.invite_Flag__c==null && other.getInvite_Flag__c()==null) || 
             (this.invite_Flag__c!=null &&
              this.invite_Flag__c.equals(other.getInvite_Flag__c()))) &&
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
            ((this.location__c==null && other.getLocation__c()==null) || 
             (this.location__c!=null &&
              this.location__c.equals(other.getLocation__c()))) &&
            ((this.meeting_Host__c==null && other.getMeeting_Host__c()==null) || 
             (this.meeting_Host__c!=null &&
              this.meeting_Host__c.equals(other.getMeeting_Host__c()))) &&
            ((this.more_Information__c==null && other.getMore_Information__c()==null) || 
             (this.more_Information__c!=null &&
              this.more_Information__c.equals(other.getMore_Information__c()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
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
            ((this.parent_Event_ID__c==null && other.getParent_Event_ID__c()==null) || 
             (this.parent_Event_ID__c!=null &&
              this.parent_Event_ID__c.equals(other.getParent_Event_ID__c()))) &&
            ((this.parent_Event_Link__c==null && other.getParent_Event_Link__c()==null) || 
             (this.parent_Event_Link__c!=null &&
              this.parent_Event_Link__c.equals(other.getParent_Event_Link__c()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.recurring_End_Date__c==null && other.getRecurring_End_Date__c()==null) || 
             (this.recurring_End_Date__c!=null &&
              this.recurring_End_Date__c.equals(other.getRecurring_End_Date__c()))) &&
            ((this.recurring_Frequency__c==null && other.getRecurring_Frequency__c()==null) || 
             (this.recurring_Frequency__c!=null &&
              this.recurring_Frequency__c.equals(other.getRecurring_Frequency__c()))) &&
            ((this.recurring_Interval__c==null && other.getRecurring_Interval__c()==null) || 
             (this.recurring_Interval__c!=null &&
              this.recurring_Interval__c.equals(other.getRecurring_Interval__c()))) &&
            ((this.recurring__c==null && other.getRecurring__c()==null) || 
             (this.recurring__c!=null &&
              this.recurring__c.equals(other.getRecurring__c()))) &&
            ((this.reminder_Minutes__c==null && other.getReminder_Minutes__c()==null) || 
             (this.reminder_Minutes__c!=null &&
              this.reminder_Minutes__c.equals(other.getReminder_Minutes__c()))) &&
            ((this.reminder__c==null && other.getReminder__c()==null) || 
             (this.reminder__c!=null &&
              this.reminder__c.equals(other.getReminder__c()))) &&
            ((this.start_Time__c==null && other.getStart_Time__c()==null) || 
             (this.start_Time__c!=null &&
              this.start_Time__c.equals(other.getStart_Time__c()))) &&
            ((this.start__c==null && other.getStart__c()==null) || 
             (this.start__c!=null &&
              this.start__c.equals(other.getStart__c()))) &&
            ((this.status_Meeting_Attendees__r==null && other.getStatus_Meeting_Attendees__r()==null) || 
             (this.status_Meeting_Attendees__r!=null &&
              this.status_Meeting_Attendees__r.equals(other.getStatus_Meeting_Attendees__r()))) &&
            ((this.subject__c==null && other.getSubject__c()==null) || 
             (this.subject__c!=null &&
              this.subject__c.equals(other.getSubject__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              this.tasks.equals(other.getTasks()))) &&
            ((this.tickets__r==null && other.getTickets__r()==null) || 
             (this.tickets__r!=null &&
              this.tickets__r.equals(other.getTickets__r()))) &&
            ((this.update_Count__c==null && other.getUpdate_Count__c()==null) || 
             (this.update_Count__c!=null &&
              this.update_Count__c.equals(other.getUpdate_Count__c()))) &&
            ((this.update_Flag__c==null && other.getUpdate_Flag__c()==null) || 
             (this.update_Flag__c!=null &&
              this.update_Flag__c.equals(other.getUpdate_Flag__c()))) &&
            ((this.hasScheduledTicket__c==null && other.getHasScheduledTicket__c()==null) || 
             (this.hasScheduledTicket__c!=null &&
              this.hasScheduledTicket__c.equals(other.getHasScheduledTicket__c())));
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
        if (getAccount_Name__c() != null) {
            _hashCode += getAccount_Name__c().hashCode();
        }
        if (getAccount__c() != null) {
            _hashCode += getAccount__c().hashCode();
        }
        if (getAccount__r() != null) {
            _hashCode += getAccount__r().hashCode();
        }
        if (getActivityHistories() != null) {
            _hashCode += getActivityHistories().hashCode();
        }
        if (getAgenda__c() != null) {
            _hashCode += getAgenda__c().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getConference_Audio_Code__c() != null) {
            _hashCode += getConference_Audio_Code__c().hashCode();
        }
        if (getConference_PIN__c() != null) {
            _hashCode += getConference_PIN__c().hashCode();
        }
        if (getConference_Phone__c() != null) {
            _hashCode += getConference_Phone__c().hashCode();
        }
        if (getConference_URL__c() != null) {
            _hashCode += getConference_URL__c().hashCode();
        }
        if (getContact__c() != null) {
            _hashCode += getContact__c().hashCode();
        }
        if (getContact__r() != null) {
            _hashCode += getContact__r().hashCode();
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
        if (getDay_of_Month__c() != null) {
            _hashCode += getDay_of_Month__c().hashCode();
        }
        if (getDay_of_Week__c() != null) {
            _hashCode += getDay_of_Week__c().hashCode();
        }
        if (getDepartment__c() != null) {
            _hashCode += getDepartment__c().hashCode();
        }
        if (getDescription__c() != null) {
            _hashCode += getDescription__c().hashCode();
        }
        if (getDuration__c() != null) {
            _hashCode += getDuration__c().hashCode();
        }
        if (getEnd_Time__c() != null) {
            _hashCode += getEnd_Time__c().hashCode();
        }
        if (getEnd__c() != null) {
            _hashCode += getEnd__c().hashCode();
        }
        if (getEventId__c() != null) {
            _hashCode += getEventId__c().hashCode();
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
        if (getHost_Email__c() != null) {
            _hashCode += getHost_Email__c().hashCode();
        }
        if (getHost_Phone__c() != null) {
            _hashCode += getHost_Phone__c().hashCode();
        }
        if (getInitial_Meeting__c() != null) {
            _hashCode += getInitial_Meeting__c().hashCode();
        }
        if (getInsert_Flag__c() != null) {
            _hashCode += getInsert_Flag__c().hashCode();
        }
        if (getInstructions__c() != null) {
            _hashCode += getInstructions__c().hashCode();
        }
        if (getInvite_Flag__c() != null) {
            _hashCode += getInvite_Flag__c().hashCode();
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
        if (getLocation__c() != null) {
            _hashCode += getLocation__c().hashCode();
        }
        if (getMeeting_Host__c() != null) {
            _hashCode += getMeeting_Host__c().hashCode();
        }
        if (getMore_Information__c() != null) {
            _hashCode += getMore_Information__c().hashCode();
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
        if (getNotes__c() != null) {
            _hashCode += getNotes__c().hashCode();
        }
        if (getOpenActivities() != null) {
            _hashCode += getOpenActivities().hashCode();
        }
        if (getParent_Event_ID__c() != null) {
            _hashCode += getParent_Event_ID__c().hashCode();
        }
        if (getParent_Event_Link__c() != null) {
            _hashCode += getParent_Event_Link__c().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getRecurring_End_Date__c() != null) {
            _hashCode += getRecurring_End_Date__c().hashCode();
        }
        if (getRecurring_Frequency__c() != null) {
            _hashCode += getRecurring_Frequency__c().hashCode();
        }
        if (getRecurring_Interval__c() != null) {
            _hashCode += getRecurring_Interval__c().hashCode();
        }
        if (getRecurring__c() != null) {
            _hashCode += getRecurring__c().hashCode();
        }
        if (getReminder_Minutes__c() != null) {
            _hashCode += getReminder_Minutes__c().hashCode();
        }
        if (getReminder__c() != null) {
            _hashCode += getReminder__c().hashCode();
        }
        if (getStart_Time__c() != null) {
            _hashCode += getStart_Time__c().hashCode();
        }
        if (getStart__c() != null) {
            _hashCode += getStart__c().hashCode();
        }
        if (getStatus_Meeting_Attendees__r() != null) {
            _hashCode += getStatus_Meeting_Attendees__r().hashCode();
        }
        if (getSubject__c() != null) {
            _hashCode += getSubject__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTasks() != null) {
            _hashCode += getTasks().hashCode();
        }
        if (getTickets__r() != null) {
            _hashCode += getTickets__r().hashCode();
        }
        if (getUpdate_Count__c() != null) {
            _hashCode += getUpdate_Count__c().hashCode();
        }
        if (getUpdate_Flag__c() != null) {
            _hashCode += getUpdate_Flag__c().hashCode();
        }
        if (getHasScheduledTicket__c() != null) {
            _hashCode += getHasScheduledTicket__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Status_Meeting__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status_Meeting__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityHistories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActivityHistories"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agenda__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Agenda__c"));
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
        elemField.setFieldName("conference_Audio_Code__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Conference_Audio_Code__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conference_PIN__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Conference_PIN__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conference_Phone__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Conference_Phone__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conference_URL__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Conference_URL__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
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
        elemField.setFieldName("day_of_Month__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Day_of_Month__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("day_of_Week__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Day_of_Week__c"));
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
        elemField.setFieldName("description__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Description__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Duration__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("end_Time__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "End_Time__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("end__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "End__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventId__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EventId__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("host_Email__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Host_Email__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host_Phone__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Host_Phone__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initial_Meeting__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Initial_Meeting__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insert_Flag__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Insert_Flag__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instructions__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Instructions__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invite_Flag__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Invite_Flag__c"));
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
        elemField.setFieldName("location__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Location__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meeting_Host__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Meeting_Host__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("more_Information__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "More_Information__c"));
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
        elemField.setFieldName("parent_Event_ID__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Parent_Event_ID__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent_Event_Link__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Parent_Event_Link__c"));
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
        elemField.setFieldName("recurring_End_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Recurring_End_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurring_Frequency__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Recurring_Frequency__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurring_Interval__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Recurring_Interval__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurring__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Recurring__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reminder_Minutes__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Reminder_Minutes__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reminder__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Reminder__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start_Time__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Start_Time__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Start__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status_Meeting_Attendees__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status_Meeting_Attendees__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Subject__c"));
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
        elemField.setFieldName("tickets__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tickets__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("update_Count__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Update_Count__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("update_Flag__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Update_Flag__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasScheduledTicket__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "hasScheduledTicket__c"));
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

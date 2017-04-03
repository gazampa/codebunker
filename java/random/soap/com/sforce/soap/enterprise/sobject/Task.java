/**
 * Task.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Task  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.sobject.Account account;

    private java.lang.String accountId;

    private java.lang.String account__c;

    private java.util.Date activityDate;

    private java.lang.Double actual_Time__c;

    private java.lang.String agenda_Link__c;

    private java.lang.String agenda__c;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String callDisposition;

    private java.lang.Integer callDurationInSeconds;

    private java.lang.String callObject;

    private java.lang.String callType;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String department__c;

    private java.lang.String description;

    private java.lang.Double estimated_Time__c;

    private java.lang.String event_Audio__c;

    private java.lang.String event_Link__c;

    private java.lang.String event_PIN__c;

    private java.lang.String event_Phone__c;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult feeds;

    private java.lang.String instructions__c;

    private java.lang.Boolean isArchived;

    private java.lang.Boolean isClosed;

    private java.lang.Boolean isDeleted;

    private java.lang.Boolean isRecurrence;

    private java.lang.Boolean isReminderSet;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String more_Information_Link__c;

    private java.lang.String notes_Link__c;

    private java.lang.String notes__c;

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private java.lang.String priority;

    private java.lang.String recurrenceActivityId;

    private java.lang.Integer recurrenceDayOfMonth;

    private java.lang.Integer recurrenceDayOfWeekMask;

    private java.util.Date recurrenceEndDateOnly;

    private java.lang.String recurrenceInstance;

    private java.lang.Integer recurrenceInterval;

    private java.lang.String recurrenceMonthOfYear;

    private java.util.Date recurrenceStartDateOnly;

    private java.lang.String recurrenceTimeZoneSidKey;

    private java.lang.String recurrenceType;

    private com.sforce.soap.enterprise.QueryResult recurringTasks;

    private java.util.Calendar reminderDateTime;

    private java.lang.String status;

    private java.lang.String status_P__c;

    private java.lang.String status__c;

    private java.lang.String subject;

    private java.util.Calendar systemModstamp;

    private java.lang.String trainer__c;

    private com.sforce.soap.enterprise.sobject.Name what;

    private java.lang.String whatId;

    private com.sforce.soap.enterprise.sobject.Name who;

    private java.lang.String whoId;

    public Task() {
    }

    public Task(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.sobject.Account account,
           java.lang.String accountId,
           java.lang.String account__c,
           java.util.Date activityDate,
           java.lang.Double actual_Time__c,
           java.lang.String agenda_Link__c,
           java.lang.String agenda__c,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String callDisposition,
           java.lang.Integer callDurationInSeconds,
           java.lang.String callObject,
           java.lang.String callType,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String department__c,
           java.lang.String description,
           java.lang.Double estimated_Time__c,
           java.lang.String event_Audio__c,
           java.lang.String event_Link__c,
           java.lang.String event_PIN__c,
           java.lang.String event_Phone__c,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult feeds,
           java.lang.String instructions__c,
           java.lang.Boolean isArchived,
           java.lang.Boolean isClosed,
           java.lang.Boolean isDeleted,
           java.lang.Boolean isRecurrence,
           java.lang.Boolean isReminderSet,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String more_Information_Link__c,
           java.lang.String notes_Link__c,
           java.lang.String notes__c,
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           java.lang.String priority,
           java.lang.String recurrenceActivityId,
           java.lang.Integer recurrenceDayOfMonth,
           java.lang.Integer recurrenceDayOfWeekMask,
           java.util.Date recurrenceEndDateOnly,
           java.lang.String recurrenceInstance,
           java.lang.Integer recurrenceInterval,
           java.lang.String recurrenceMonthOfYear,
           java.util.Date recurrenceStartDateOnly,
           java.lang.String recurrenceTimeZoneSidKey,
           java.lang.String recurrenceType,
           com.sforce.soap.enterprise.QueryResult recurringTasks,
           java.util.Calendar reminderDateTime,
           java.lang.String status,
           java.lang.String status_P__c,
           java.lang.String status__c,
           java.lang.String subject,
           java.util.Calendar systemModstamp,
           java.lang.String trainer__c,
           com.sforce.soap.enterprise.sobject.Name what,
           java.lang.String whatId,
           com.sforce.soap.enterprise.sobject.Name who,
           java.lang.String whoId) {
        super(
            fieldsToNull,
            id);
        this.account = account;
        this.accountId = accountId;
        this.account__c = account__c;
        this.activityDate = activityDate;
        this.actual_Time__c = actual_Time__c;
        this.agenda_Link__c = agenda_Link__c;
        this.agenda__c = agenda__c;
        this.attachments = attachments;
        this.callDisposition = callDisposition;
        this.callDurationInSeconds = callDurationInSeconds;
        this.callObject = callObject;
        this.callType = callType;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.department__c = department__c;
        this.description = description;
        this.estimated_Time__c = estimated_Time__c;
        this.event_Audio__c = event_Audio__c;
        this.event_Link__c = event_Link__c;
        this.event_PIN__c = event_PIN__c;
        this.event_Phone__c = event_Phone__c;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.feeds = feeds;
        this.instructions__c = instructions__c;
        this.isArchived = isArchived;
        this.isClosed = isClosed;
        this.isDeleted = isDeleted;
        this.isRecurrence = isRecurrence;
        this.isReminderSet = isReminderSet;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.more_Information_Link__c = more_Information_Link__c;
        this.notes_Link__c = notes_Link__c;
        this.notes__c = notes__c;
        this.owner = owner;
        this.ownerId = ownerId;
        this.priority = priority;
        this.recurrenceActivityId = recurrenceActivityId;
        this.recurrenceDayOfMonth = recurrenceDayOfMonth;
        this.recurrenceDayOfWeekMask = recurrenceDayOfWeekMask;
        this.recurrenceEndDateOnly = recurrenceEndDateOnly;
        this.recurrenceInstance = recurrenceInstance;
        this.recurrenceInterval = recurrenceInterval;
        this.recurrenceMonthOfYear = recurrenceMonthOfYear;
        this.recurrenceStartDateOnly = recurrenceStartDateOnly;
        this.recurrenceTimeZoneSidKey = recurrenceTimeZoneSidKey;
        this.recurrenceType = recurrenceType;
        this.recurringTasks = recurringTasks;
        this.reminderDateTime = reminderDateTime;
        this.status = status;
        this.status_P__c = status_P__c;
        this.status__c = status__c;
        this.subject = subject;
        this.systemModstamp = systemModstamp;
        this.trainer__c = trainer__c;
        this.what = what;
        this.whatId = whatId;
        this.who = who;
        this.whoId = whoId;
    }


    /**
     * Gets the account value for this Task.
     * 
     * @return account
     */
    public com.sforce.soap.enterprise.sobject.Account getAccount() {
        return account;
    }


    /**
     * Sets the account value for this Task.
     * 
     * @param account
     */
    public void setAccount(com.sforce.soap.enterprise.sobject.Account account) {
        this.account = account;
    }


    /**
     * Gets the accountId value for this Task.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this Task.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the account__c value for this Task.
     * 
     * @return account__c
     */
    public java.lang.String getAccount__c() {
        return account__c;
    }


    /**
     * Sets the account__c value for this Task.
     * 
     * @param account__c
     */
    public void setAccount__c(java.lang.String account__c) {
        this.account__c = account__c;
    }


    /**
     * Gets the activityDate value for this Task.
     * 
     * @return activityDate
     */
    public java.util.Date getActivityDate() {
        return activityDate;
    }


    /**
     * Sets the activityDate value for this Task.
     * 
     * @param activityDate
     */
    public void setActivityDate(java.util.Date activityDate) {
        this.activityDate = activityDate;
    }


    /**
     * Gets the actual_Time__c value for this Task.
     * 
     * @return actual_Time__c
     */
    public java.lang.Double getActual_Time__c() {
        return actual_Time__c;
    }


    /**
     * Sets the actual_Time__c value for this Task.
     * 
     * @param actual_Time__c
     */
    public void setActual_Time__c(java.lang.Double actual_Time__c) {
        this.actual_Time__c = actual_Time__c;
    }


    /**
     * Gets the agenda_Link__c value for this Task.
     * 
     * @return agenda_Link__c
     */
    public java.lang.String getAgenda_Link__c() {
        return agenda_Link__c;
    }


    /**
     * Sets the agenda_Link__c value for this Task.
     * 
     * @param agenda_Link__c
     */
    public void setAgenda_Link__c(java.lang.String agenda_Link__c) {
        this.agenda_Link__c = agenda_Link__c;
    }


    /**
     * Gets the agenda__c value for this Task.
     * 
     * @return agenda__c
     */
    public java.lang.String getAgenda__c() {
        return agenda__c;
    }


    /**
     * Sets the agenda__c value for this Task.
     * 
     * @param agenda__c
     */
    public void setAgenda__c(java.lang.String agenda__c) {
        this.agenda__c = agenda__c;
    }


    /**
     * Gets the attachments value for this Task.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Task.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the callDisposition value for this Task.
     * 
     * @return callDisposition
     */
    public java.lang.String getCallDisposition() {
        return callDisposition;
    }


    /**
     * Sets the callDisposition value for this Task.
     * 
     * @param callDisposition
     */
    public void setCallDisposition(java.lang.String callDisposition) {
        this.callDisposition = callDisposition;
    }


    /**
     * Gets the callDurationInSeconds value for this Task.
     * 
     * @return callDurationInSeconds
     */
    public java.lang.Integer getCallDurationInSeconds() {
        return callDurationInSeconds;
    }


    /**
     * Sets the callDurationInSeconds value for this Task.
     * 
     * @param callDurationInSeconds
     */
    public void setCallDurationInSeconds(java.lang.Integer callDurationInSeconds) {
        this.callDurationInSeconds = callDurationInSeconds;
    }


    /**
     * Gets the callObject value for this Task.
     * 
     * @return callObject
     */
    public java.lang.String getCallObject() {
        return callObject;
    }


    /**
     * Sets the callObject value for this Task.
     * 
     * @param callObject
     */
    public void setCallObject(java.lang.String callObject) {
        this.callObject = callObject;
    }


    /**
     * Gets the callType value for this Task.
     * 
     * @return callType
     */
    public java.lang.String getCallType() {
        return callType;
    }


    /**
     * Sets the callType value for this Task.
     * 
     * @param callType
     */
    public void setCallType(java.lang.String callType) {
        this.callType = callType;
    }


    /**
     * Gets the createdBy value for this Task.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Task.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Task.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Task.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Task.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Task.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the department__c value for this Task.
     * 
     * @return department__c
     */
    public java.lang.String getDepartment__c() {
        return department__c;
    }


    /**
     * Sets the department__c value for this Task.
     * 
     * @param department__c
     */
    public void setDepartment__c(java.lang.String department__c) {
        this.department__c = department__c;
    }


    /**
     * Gets the description value for this Task.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Task.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the estimated_Time__c value for this Task.
     * 
     * @return estimated_Time__c
     */
    public java.lang.Double getEstimated_Time__c() {
        return estimated_Time__c;
    }


    /**
     * Sets the estimated_Time__c value for this Task.
     * 
     * @param estimated_Time__c
     */
    public void setEstimated_Time__c(java.lang.Double estimated_Time__c) {
        this.estimated_Time__c = estimated_Time__c;
    }


    /**
     * Gets the event_Audio__c value for this Task.
     * 
     * @return event_Audio__c
     */
    public java.lang.String getEvent_Audio__c() {
        return event_Audio__c;
    }


    /**
     * Sets the event_Audio__c value for this Task.
     * 
     * @param event_Audio__c
     */
    public void setEvent_Audio__c(java.lang.String event_Audio__c) {
        this.event_Audio__c = event_Audio__c;
    }


    /**
     * Gets the event_Link__c value for this Task.
     * 
     * @return event_Link__c
     */
    public java.lang.String getEvent_Link__c() {
        return event_Link__c;
    }


    /**
     * Sets the event_Link__c value for this Task.
     * 
     * @param event_Link__c
     */
    public void setEvent_Link__c(java.lang.String event_Link__c) {
        this.event_Link__c = event_Link__c;
    }


    /**
     * Gets the event_PIN__c value for this Task.
     * 
     * @return event_PIN__c
     */
    public java.lang.String getEvent_PIN__c() {
        return event_PIN__c;
    }


    /**
     * Sets the event_PIN__c value for this Task.
     * 
     * @param event_PIN__c
     */
    public void setEvent_PIN__c(java.lang.String event_PIN__c) {
        this.event_PIN__c = event_PIN__c;
    }


    /**
     * Gets the event_Phone__c value for this Task.
     * 
     * @return event_Phone__c
     */
    public java.lang.String getEvent_Phone__c() {
        return event_Phone__c;
    }


    /**
     * Sets the event_Phone__c value for this Task.
     * 
     * @param event_Phone__c
     */
    public void setEvent_Phone__c(java.lang.String event_Phone__c) {
        this.event_Phone__c = event_Phone__c;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Task.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Task.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the feeds value for this Task.
     * 
     * @return feeds
     */
    public com.sforce.soap.enterprise.QueryResult getFeeds() {
        return feeds;
    }


    /**
     * Sets the feeds value for this Task.
     * 
     * @param feeds
     */
    public void setFeeds(com.sforce.soap.enterprise.QueryResult feeds) {
        this.feeds = feeds;
    }


    /**
     * Gets the instructions__c value for this Task.
     * 
     * @return instructions__c
     */
    public java.lang.String getInstructions__c() {
        return instructions__c;
    }


    /**
     * Sets the instructions__c value for this Task.
     * 
     * @param instructions__c
     */
    public void setInstructions__c(java.lang.String instructions__c) {
        this.instructions__c = instructions__c;
    }


    /**
     * Gets the isArchived value for this Task.
     * 
     * @return isArchived
     */
    public java.lang.Boolean getIsArchived() {
        return isArchived;
    }


    /**
     * Sets the isArchived value for this Task.
     * 
     * @param isArchived
     */
    public void setIsArchived(java.lang.Boolean isArchived) {
        this.isArchived = isArchived;
    }


    /**
     * Gets the isClosed value for this Task.
     * 
     * @return isClosed
     */
    public java.lang.Boolean getIsClosed() {
        return isClosed;
    }


    /**
     * Sets the isClosed value for this Task.
     * 
     * @param isClosed
     */
    public void setIsClosed(java.lang.Boolean isClosed) {
        this.isClosed = isClosed;
    }


    /**
     * Gets the isDeleted value for this Task.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Task.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the isRecurrence value for this Task.
     * 
     * @return isRecurrence
     */
    public java.lang.Boolean getIsRecurrence() {
        return isRecurrence;
    }


    /**
     * Sets the isRecurrence value for this Task.
     * 
     * @param isRecurrence
     */
    public void setIsRecurrence(java.lang.Boolean isRecurrence) {
        this.isRecurrence = isRecurrence;
    }


    /**
     * Gets the isReminderSet value for this Task.
     * 
     * @return isReminderSet
     */
    public java.lang.Boolean getIsReminderSet() {
        return isReminderSet;
    }


    /**
     * Sets the isReminderSet value for this Task.
     * 
     * @param isReminderSet
     */
    public void setIsReminderSet(java.lang.Boolean isReminderSet) {
        this.isReminderSet = isReminderSet;
    }


    /**
     * Gets the lastModifiedBy value for this Task.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Task.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Task.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Task.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Task.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Task.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the more_Information_Link__c value for this Task.
     * 
     * @return more_Information_Link__c
     */
    public java.lang.String getMore_Information_Link__c() {
        return more_Information_Link__c;
    }


    /**
     * Sets the more_Information_Link__c value for this Task.
     * 
     * @param more_Information_Link__c
     */
    public void setMore_Information_Link__c(java.lang.String more_Information_Link__c) {
        this.more_Information_Link__c = more_Information_Link__c;
    }


    /**
     * Gets the notes_Link__c value for this Task.
     * 
     * @return notes_Link__c
     */
    public java.lang.String getNotes_Link__c() {
        return notes_Link__c;
    }


    /**
     * Sets the notes_Link__c value for this Task.
     * 
     * @param notes_Link__c
     */
    public void setNotes_Link__c(java.lang.String notes_Link__c) {
        this.notes_Link__c = notes_Link__c;
    }


    /**
     * Gets the notes__c value for this Task.
     * 
     * @return notes__c
     */
    public java.lang.String getNotes__c() {
        return notes__c;
    }


    /**
     * Sets the notes__c value for this Task.
     * 
     * @param notes__c
     */
    public void setNotes__c(java.lang.String notes__c) {
        this.notes__c = notes__c;
    }


    /**
     * Gets the owner value for this Task.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Task.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Task.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Task.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the priority value for this Task.
     * 
     * @return priority
     */
    public java.lang.String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Task.
     * 
     * @param priority
     */
    public void setPriority(java.lang.String priority) {
        this.priority = priority;
    }


    /**
     * Gets the recurrenceActivityId value for this Task.
     * 
     * @return recurrenceActivityId
     */
    public java.lang.String getRecurrenceActivityId() {
        return recurrenceActivityId;
    }


    /**
     * Sets the recurrenceActivityId value for this Task.
     * 
     * @param recurrenceActivityId
     */
    public void setRecurrenceActivityId(java.lang.String recurrenceActivityId) {
        this.recurrenceActivityId = recurrenceActivityId;
    }


    /**
     * Gets the recurrenceDayOfMonth value for this Task.
     * 
     * @return recurrenceDayOfMonth
     */
    public java.lang.Integer getRecurrenceDayOfMonth() {
        return recurrenceDayOfMonth;
    }


    /**
     * Sets the recurrenceDayOfMonth value for this Task.
     * 
     * @param recurrenceDayOfMonth
     */
    public void setRecurrenceDayOfMonth(java.lang.Integer recurrenceDayOfMonth) {
        this.recurrenceDayOfMonth = recurrenceDayOfMonth;
    }


    /**
     * Gets the recurrenceDayOfWeekMask value for this Task.
     * 
     * @return recurrenceDayOfWeekMask
     */
    public java.lang.Integer getRecurrenceDayOfWeekMask() {
        return recurrenceDayOfWeekMask;
    }


    /**
     * Sets the recurrenceDayOfWeekMask value for this Task.
     * 
     * @param recurrenceDayOfWeekMask
     */
    public void setRecurrenceDayOfWeekMask(java.lang.Integer recurrenceDayOfWeekMask) {
        this.recurrenceDayOfWeekMask = recurrenceDayOfWeekMask;
    }


    /**
     * Gets the recurrenceEndDateOnly value for this Task.
     * 
     * @return recurrenceEndDateOnly
     */
    public java.util.Date getRecurrenceEndDateOnly() {
        return recurrenceEndDateOnly;
    }


    /**
     * Sets the recurrenceEndDateOnly value for this Task.
     * 
     * @param recurrenceEndDateOnly
     */
    public void setRecurrenceEndDateOnly(java.util.Date recurrenceEndDateOnly) {
        this.recurrenceEndDateOnly = recurrenceEndDateOnly;
    }


    /**
     * Gets the recurrenceInstance value for this Task.
     * 
     * @return recurrenceInstance
     */
    public java.lang.String getRecurrenceInstance() {
        return recurrenceInstance;
    }


    /**
     * Sets the recurrenceInstance value for this Task.
     * 
     * @param recurrenceInstance
     */
    public void setRecurrenceInstance(java.lang.String recurrenceInstance) {
        this.recurrenceInstance = recurrenceInstance;
    }


    /**
     * Gets the recurrenceInterval value for this Task.
     * 
     * @return recurrenceInterval
     */
    public java.lang.Integer getRecurrenceInterval() {
        return recurrenceInterval;
    }


    /**
     * Sets the recurrenceInterval value for this Task.
     * 
     * @param recurrenceInterval
     */
    public void setRecurrenceInterval(java.lang.Integer recurrenceInterval) {
        this.recurrenceInterval = recurrenceInterval;
    }


    /**
     * Gets the recurrenceMonthOfYear value for this Task.
     * 
     * @return recurrenceMonthOfYear
     */
    public java.lang.String getRecurrenceMonthOfYear() {
        return recurrenceMonthOfYear;
    }


    /**
     * Sets the recurrenceMonthOfYear value for this Task.
     * 
     * @param recurrenceMonthOfYear
     */
    public void setRecurrenceMonthOfYear(java.lang.String recurrenceMonthOfYear) {
        this.recurrenceMonthOfYear = recurrenceMonthOfYear;
    }


    /**
     * Gets the recurrenceStartDateOnly value for this Task.
     * 
     * @return recurrenceStartDateOnly
     */
    public java.util.Date getRecurrenceStartDateOnly() {
        return recurrenceStartDateOnly;
    }


    /**
     * Sets the recurrenceStartDateOnly value for this Task.
     * 
     * @param recurrenceStartDateOnly
     */
    public void setRecurrenceStartDateOnly(java.util.Date recurrenceStartDateOnly) {
        this.recurrenceStartDateOnly = recurrenceStartDateOnly;
    }


    /**
     * Gets the recurrenceTimeZoneSidKey value for this Task.
     * 
     * @return recurrenceTimeZoneSidKey
     */
    public java.lang.String getRecurrenceTimeZoneSidKey() {
        return recurrenceTimeZoneSidKey;
    }


    /**
     * Sets the recurrenceTimeZoneSidKey value for this Task.
     * 
     * @param recurrenceTimeZoneSidKey
     */
    public void setRecurrenceTimeZoneSidKey(java.lang.String recurrenceTimeZoneSidKey) {
        this.recurrenceTimeZoneSidKey = recurrenceTimeZoneSidKey;
    }


    /**
     * Gets the recurrenceType value for this Task.
     * 
     * @return recurrenceType
     */
    public java.lang.String getRecurrenceType() {
        return recurrenceType;
    }


    /**
     * Sets the recurrenceType value for this Task.
     * 
     * @param recurrenceType
     */
    public void setRecurrenceType(java.lang.String recurrenceType) {
        this.recurrenceType = recurrenceType;
    }


    /**
     * Gets the recurringTasks value for this Task.
     * 
     * @return recurringTasks
     */
    public com.sforce.soap.enterprise.QueryResult getRecurringTasks() {
        return recurringTasks;
    }


    /**
     * Sets the recurringTasks value for this Task.
     * 
     * @param recurringTasks
     */
    public void setRecurringTasks(com.sforce.soap.enterprise.QueryResult recurringTasks) {
        this.recurringTasks = recurringTasks;
    }


    /**
     * Gets the reminderDateTime value for this Task.
     * 
     * @return reminderDateTime
     */
    public java.util.Calendar getReminderDateTime() {
        return reminderDateTime;
    }


    /**
     * Sets the reminderDateTime value for this Task.
     * 
     * @param reminderDateTime
     */
    public void setReminderDateTime(java.util.Calendar reminderDateTime) {
        this.reminderDateTime = reminderDateTime;
    }


    /**
     * Gets the status value for this Task.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Task.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the status_P__c value for this Task.
     * 
     * @return status_P__c
     */
    public java.lang.String getStatus_P__c() {
        return status_P__c;
    }


    /**
     * Sets the status_P__c value for this Task.
     * 
     * @param status_P__c
     */
    public void setStatus_P__c(java.lang.String status_P__c) {
        this.status_P__c = status_P__c;
    }


    /**
     * Gets the status__c value for this Task.
     * 
     * @return status__c
     */
    public java.lang.String getStatus__c() {
        return status__c;
    }


    /**
     * Sets the status__c value for this Task.
     * 
     * @param status__c
     */
    public void setStatus__c(java.lang.String status__c) {
        this.status__c = status__c;
    }


    /**
     * Gets the subject value for this Task.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this Task.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the systemModstamp value for this Task.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Task.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the trainer__c value for this Task.
     * 
     * @return trainer__c
     */
    public java.lang.String getTrainer__c() {
        return trainer__c;
    }


    /**
     * Sets the trainer__c value for this Task.
     * 
     * @param trainer__c
     */
    public void setTrainer__c(java.lang.String trainer__c) {
        this.trainer__c = trainer__c;
    }


    /**
     * Gets the what value for this Task.
     * 
     * @return what
     */
    public com.sforce.soap.enterprise.sobject.Name getWhat() {
        return what;
    }


    /**
     * Sets the what value for this Task.
     * 
     * @param what
     */
    public void setWhat(com.sforce.soap.enterprise.sobject.Name what) {
        this.what = what;
    }


    /**
     * Gets the whatId value for this Task.
     * 
     * @return whatId
     */
    public java.lang.String getWhatId() {
        return whatId;
    }


    /**
     * Sets the whatId value for this Task.
     * 
     * @param whatId
     */
    public void setWhatId(java.lang.String whatId) {
        this.whatId = whatId;
    }


    /**
     * Gets the who value for this Task.
     * 
     * @return who
     */
    public com.sforce.soap.enterprise.sobject.Name getWho() {
        return who;
    }


    /**
     * Sets the who value for this Task.
     * 
     * @param who
     */
    public void setWho(com.sforce.soap.enterprise.sobject.Name who) {
        this.who = who;
    }


    /**
     * Gets the whoId value for this Task.
     * 
     * @return whoId
     */
    public java.lang.String getWhoId() {
        return whoId;
    }


    /**
     * Sets the whoId value for this Task.
     * 
     * @param whoId
     */
    public void setWhoId(java.lang.String whoId) {
        this.whoId = whoId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Task)) return false;
        Task other = (Task) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.account__c==null && other.getAccount__c()==null) || 
             (this.account__c!=null &&
              this.account__c.equals(other.getAccount__c()))) &&
            ((this.activityDate==null && other.getActivityDate()==null) || 
             (this.activityDate!=null &&
              this.activityDate.equals(other.getActivityDate()))) &&
            ((this.actual_Time__c==null && other.getActual_Time__c()==null) || 
             (this.actual_Time__c!=null &&
              this.actual_Time__c.equals(other.getActual_Time__c()))) &&
            ((this.agenda_Link__c==null && other.getAgenda_Link__c()==null) || 
             (this.agenda_Link__c!=null &&
              this.agenda_Link__c.equals(other.getAgenda_Link__c()))) &&
            ((this.agenda__c==null && other.getAgenda__c()==null) || 
             (this.agenda__c!=null &&
              this.agenda__c.equals(other.getAgenda__c()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.callDisposition==null && other.getCallDisposition()==null) || 
             (this.callDisposition!=null &&
              this.callDisposition.equals(other.getCallDisposition()))) &&
            ((this.callDurationInSeconds==null && other.getCallDurationInSeconds()==null) || 
             (this.callDurationInSeconds!=null &&
              this.callDurationInSeconds.equals(other.getCallDurationInSeconds()))) &&
            ((this.callObject==null && other.getCallObject()==null) || 
             (this.callObject!=null &&
              this.callObject.equals(other.getCallObject()))) &&
            ((this.callType==null && other.getCallType()==null) || 
             (this.callType!=null &&
              this.callType.equals(other.getCallType()))) &&
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
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.estimated_Time__c==null && other.getEstimated_Time__c()==null) || 
             (this.estimated_Time__c!=null &&
              this.estimated_Time__c.equals(other.getEstimated_Time__c()))) &&
            ((this.event_Audio__c==null && other.getEvent_Audio__c()==null) || 
             (this.event_Audio__c!=null &&
              this.event_Audio__c.equals(other.getEvent_Audio__c()))) &&
            ((this.event_Link__c==null && other.getEvent_Link__c()==null) || 
             (this.event_Link__c!=null &&
              this.event_Link__c.equals(other.getEvent_Link__c()))) &&
            ((this.event_PIN__c==null && other.getEvent_PIN__c()==null) || 
             (this.event_PIN__c!=null &&
              this.event_PIN__c.equals(other.getEvent_PIN__c()))) &&
            ((this.event_Phone__c==null && other.getEvent_Phone__c()==null) || 
             (this.event_Phone__c!=null &&
              this.event_Phone__c.equals(other.getEvent_Phone__c()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.feeds==null && other.getFeeds()==null) || 
             (this.feeds!=null &&
              this.feeds.equals(other.getFeeds()))) &&
            ((this.instructions__c==null && other.getInstructions__c()==null) || 
             (this.instructions__c!=null &&
              this.instructions__c.equals(other.getInstructions__c()))) &&
            ((this.isArchived==null && other.getIsArchived()==null) || 
             (this.isArchived!=null &&
              this.isArchived.equals(other.getIsArchived()))) &&
            ((this.isClosed==null && other.getIsClosed()==null) || 
             (this.isClosed!=null &&
              this.isClosed.equals(other.getIsClosed()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.isRecurrence==null && other.getIsRecurrence()==null) || 
             (this.isRecurrence!=null &&
              this.isRecurrence.equals(other.getIsRecurrence()))) &&
            ((this.isReminderSet==null && other.getIsReminderSet()==null) || 
             (this.isReminderSet!=null &&
              this.isReminderSet.equals(other.getIsReminderSet()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.more_Information_Link__c==null && other.getMore_Information_Link__c()==null) || 
             (this.more_Information_Link__c!=null &&
              this.more_Information_Link__c.equals(other.getMore_Information_Link__c()))) &&
            ((this.notes_Link__c==null && other.getNotes_Link__c()==null) || 
             (this.notes_Link__c!=null &&
              this.notes_Link__c.equals(other.getNotes_Link__c()))) &&
            ((this.notes__c==null && other.getNotes__c()==null) || 
             (this.notes__c!=null &&
              this.notes__c.equals(other.getNotes__c()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.recurrenceActivityId==null && other.getRecurrenceActivityId()==null) || 
             (this.recurrenceActivityId!=null &&
              this.recurrenceActivityId.equals(other.getRecurrenceActivityId()))) &&
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
            ((this.recurrenceStartDateOnly==null && other.getRecurrenceStartDateOnly()==null) || 
             (this.recurrenceStartDateOnly!=null &&
              this.recurrenceStartDateOnly.equals(other.getRecurrenceStartDateOnly()))) &&
            ((this.recurrenceTimeZoneSidKey==null && other.getRecurrenceTimeZoneSidKey()==null) || 
             (this.recurrenceTimeZoneSidKey!=null &&
              this.recurrenceTimeZoneSidKey.equals(other.getRecurrenceTimeZoneSidKey()))) &&
            ((this.recurrenceType==null && other.getRecurrenceType()==null) || 
             (this.recurrenceType!=null &&
              this.recurrenceType.equals(other.getRecurrenceType()))) &&
            ((this.recurringTasks==null && other.getRecurringTasks()==null) || 
             (this.recurringTasks!=null &&
              this.recurringTasks.equals(other.getRecurringTasks()))) &&
            ((this.reminderDateTime==null && other.getReminderDateTime()==null) || 
             (this.reminderDateTime!=null &&
              this.reminderDateTime.equals(other.getReminderDateTime()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.status_P__c==null && other.getStatus_P__c()==null) || 
             (this.status_P__c!=null &&
              this.status_P__c.equals(other.getStatus_P__c()))) &&
            ((this.status__c==null && other.getStatus__c()==null) || 
             (this.status__c!=null &&
              this.status__c.equals(other.getStatus__c()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.trainer__c==null && other.getTrainer__c()==null) || 
             (this.trainer__c!=null &&
              this.trainer__c.equals(other.getTrainer__c()))) &&
            ((this.what==null && other.getWhat()==null) || 
             (this.what!=null &&
              this.what.equals(other.getWhat()))) &&
            ((this.whatId==null && other.getWhatId()==null) || 
             (this.whatId!=null &&
              this.whatId.equals(other.getWhatId()))) &&
            ((this.who==null && other.getWho()==null) || 
             (this.who!=null &&
              this.who.equals(other.getWho()))) &&
            ((this.whoId==null && other.getWhoId()==null) || 
             (this.whoId!=null &&
              this.whoId.equals(other.getWhoId())));
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
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getAccount__c() != null) {
            _hashCode += getAccount__c().hashCode();
        }
        if (getActivityDate() != null) {
            _hashCode += getActivityDate().hashCode();
        }
        if (getActual_Time__c() != null) {
            _hashCode += getActual_Time__c().hashCode();
        }
        if (getAgenda_Link__c() != null) {
            _hashCode += getAgenda_Link__c().hashCode();
        }
        if (getAgenda__c() != null) {
            _hashCode += getAgenda__c().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getCallDisposition() != null) {
            _hashCode += getCallDisposition().hashCode();
        }
        if (getCallDurationInSeconds() != null) {
            _hashCode += getCallDurationInSeconds().hashCode();
        }
        if (getCallObject() != null) {
            _hashCode += getCallObject().hashCode();
        }
        if (getCallType() != null) {
            _hashCode += getCallType().hashCode();
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEstimated_Time__c() != null) {
            _hashCode += getEstimated_Time__c().hashCode();
        }
        if (getEvent_Audio__c() != null) {
            _hashCode += getEvent_Audio__c().hashCode();
        }
        if (getEvent_Link__c() != null) {
            _hashCode += getEvent_Link__c().hashCode();
        }
        if (getEvent_PIN__c() != null) {
            _hashCode += getEvent_PIN__c().hashCode();
        }
        if (getEvent_Phone__c() != null) {
            _hashCode += getEvent_Phone__c().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getFeeds() != null) {
            _hashCode += getFeeds().hashCode();
        }
        if (getInstructions__c() != null) {
            _hashCode += getInstructions__c().hashCode();
        }
        if (getIsArchived() != null) {
            _hashCode += getIsArchived().hashCode();
        }
        if (getIsClosed() != null) {
            _hashCode += getIsClosed().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getIsRecurrence() != null) {
            _hashCode += getIsRecurrence().hashCode();
        }
        if (getIsReminderSet() != null) {
            _hashCode += getIsReminderSet().hashCode();
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
        if (getMore_Information_Link__c() != null) {
            _hashCode += getMore_Information_Link__c().hashCode();
        }
        if (getNotes_Link__c() != null) {
            _hashCode += getNotes_Link__c().hashCode();
        }
        if (getNotes__c() != null) {
            _hashCode += getNotes__c().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getRecurrenceActivityId() != null) {
            _hashCode += getRecurrenceActivityId().hashCode();
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
        if (getRecurrenceStartDateOnly() != null) {
            _hashCode += getRecurrenceStartDateOnly().hashCode();
        }
        if (getRecurrenceTimeZoneSidKey() != null) {
            _hashCode += getRecurrenceTimeZoneSidKey().hashCode();
        }
        if (getRecurrenceType() != null) {
            _hashCode += getRecurrenceType().hashCode();
        }
        if (getRecurringTasks() != null) {
            _hashCode += getRecurringTasks().hashCode();
        }
        if (getReminderDateTime() != null) {
            _hashCode += getReminderDateTime().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStatus_P__c() != null) {
            _hashCode += getStatus_P__c().hashCode();
        }
        if (getStatus__c() != null) {
            _hashCode += getStatus__c().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTrainer__c() != null) {
            _hashCode += getTrainer__c().hashCode();
        }
        if (getWhat() != null) {
            _hashCode += getWhat().hashCode();
        }
        if (getWhatId() != null) {
            _hashCode += getWhatId().hashCode();
        }
        if (getWho() != null) {
            _hashCode += getWho().hashCode();
        }
        if (getWhoId() != null) {
            _hashCode += getWhoId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Task.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Task"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccountId"));
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
        elemField.setFieldName("activityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActivityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actual_Time__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Actual_Time__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agenda_Link__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Agenda_Link__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("callDisposition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CallDisposition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callDurationInSeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CallDurationInSeconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callObject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CallObject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CallType"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimated_Time__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Estimated_Time__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("event_Audio__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Event_Audio__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("event_Link__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Event_Link__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("event_PIN__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Event_PIN__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("event_Phone__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Event_Phone__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("feeds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Feeds"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("isArchived");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsArchived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isClosed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsClosed"));
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
        elemField.setFieldName("isRecurrence");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsRecurrence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReminderSet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsReminderSet"));
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
        elemField.setFieldName("more_Information_Link__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "More_Information_Link__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes_Link__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Notes_Link__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceActivityId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecurrenceActivityId"));
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
        elemField.setFieldName("recurrenceStartDateOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecurrenceStartDateOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceTimeZoneSidKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecurrenceTimeZoneSidKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("recurringTasks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecurringTasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reminderDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ReminderDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status_P__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status_P__c"));
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
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Subject"));
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
        elemField.setFieldName("trainer__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Trainer__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("what");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "What"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("whatId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "WhatId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("who");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Who"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("whoId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "WhoId"));
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

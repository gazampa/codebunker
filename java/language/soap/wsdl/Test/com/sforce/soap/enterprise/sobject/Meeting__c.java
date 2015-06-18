/**
 * Meeting__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Meeting__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String account_Owner__c;

    private java.lang.String account__c;

    private com.sforce.soap.enterprise.sobject.Account account__r;

    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private java.lang.String agenda__c;

    private java.lang.String any_Next_Steps__c;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String campaign__c;

    private com.sforce.soap.enterprise.sobject.Campaign campaign__r;

    private java.lang.String channel_Mgr_Outline__c;

    private com.sforce.soap.enterprise.sobject.Channel_Mgr_Outline__c channel_Mgr_Outline__r;

    private java.lang.String client_Type__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.util.Calendar date_Time__c;

    private java.util.Date date_only__c;

    private java.lang.String demo__c;

    private com.sforce.soap.enterprise.sobject.Demo__c demo__r;

    private java.lang.String desired_Outcome__c;

    private com.sforce.soap.enterprise.QueryResult events;

    private java.lang.String external_Attendee__c;

    private com.sforce.soap.enterprise.sobject.Contact external_Attendee__r;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult feeds;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.Boolean isDeleted;

    private java.lang.String items_Discussed__c;

    private java.util.Date lastActivityDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String location__c;

    private java.lang.Double meeting_Hours__c;

    private java.lang.String meeting_Rank__c;

    private java.lang.String name;

    private java.lang.Boolean non_kCura_Attendee__c;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private com.sforce.soap.enterprise.QueryResult onsite_Visit_Attendees__r;

    private com.sforce.soap.enterprise.QueryResult openActivities;

    private java.lang.String opportunity__c;

    private com.sforce.soap.enterprise.sobject.Opportunity opportunity__r;

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.String roundtable__c;

    private com.sforce.soap.enterprise.QueryResult shares;

    private java.lang.String status__c;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    private java.lang.String type__c;

    private java.lang.Boolean kCura_Attendee__c;

    public Meeting__c() {
    }

    public Meeting__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String account_Owner__c,
           java.lang.String account__c,
           com.sforce.soap.enterprise.sobject.Account account__r,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           java.lang.String agenda__c,
           java.lang.String any_Next_Steps__c,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String campaign__c,
           com.sforce.soap.enterprise.sobject.Campaign campaign__r,
           java.lang.String channel_Mgr_Outline__c,
           com.sforce.soap.enterprise.sobject.Channel_Mgr_Outline__c channel_Mgr_Outline__r,
           java.lang.String client_Type__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.util.Calendar date_Time__c,
           java.util.Date date_only__c,
           java.lang.String demo__c,
           com.sforce.soap.enterprise.sobject.Demo__c demo__r,
           java.lang.String desired_Outcome__c,
           com.sforce.soap.enterprise.QueryResult events,
           java.lang.String external_Attendee__c,
           com.sforce.soap.enterprise.sobject.Contact external_Attendee__r,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult feeds,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.Boolean isDeleted,
           java.lang.String items_Discussed__c,
           java.util.Date lastActivityDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String location__c,
           java.lang.Double meeting_Hours__c,
           java.lang.String meeting_Rank__c,
           java.lang.String name,
           java.lang.Boolean non_kCura_Attendee__c,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           com.sforce.soap.enterprise.QueryResult onsite_Visit_Attendees__r,
           com.sforce.soap.enterprise.QueryResult openActivities,
           java.lang.String opportunity__c,
           com.sforce.soap.enterprise.sobject.Opportunity opportunity__r,
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.String roundtable__c,
           com.sforce.soap.enterprise.QueryResult shares,
           java.lang.String status__c,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks,
           java.lang.String type__c,
           java.lang.Boolean kCura_Attendee__c) {
        super(
            fieldsToNull,
            id);
        this.account_Owner__c = account_Owner__c;
        this.account__c = account__c;
        this.account__r = account__r;
        this.activityHistories = activityHistories;
        this.agenda__c = agenda__c;
        this.any_Next_Steps__c = any_Next_Steps__c;
        this.attachments = attachments;
        this.campaign__c = campaign__c;
        this.campaign__r = campaign__r;
        this.channel_Mgr_Outline__c = channel_Mgr_Outline__c;
        this.channel_Mgr_Outline__r = channel_Mgr_Outline__r;
        this.client_Type__c = client_Type__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.date_Time__c = date_Time__c;
        this.date_only__c = date_only__c;
        this.demo__c = demo__c;
        this.demo__r = demo__r;
        this.desired_Outcome__c = desired_Outcome__c;
        this.events = events;
        this.external_Attendee__c = external_Attendee__c;
        this.external_Attendee__r = external_Attendee__r;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.feeds = feeds;
        this.histories = histories;
        this.isDeleted = isDeleted;
        this.items_Discussed__c = items_Discussed__c;
        this.lastActivityDate = lastActivityDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.location__c = location__c;
        this.meeting_Hours__c = meeting_Hours__c;
        this.meeting_Rank__c = meeting_Rank__c;
        this.name = name;
        this.non_kCura_Attendee__c = non_kCura_Attendee__c;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.onsite_Visit_Attendees__r = onsite_Visit_Attendees__r;
        this.openActivities = openActivities;
        this.opportunity__c = opportunity__c;
        this.opportunity__r = opportunity__r;
        this.owner = owner;
        this.ownerId = ownerId;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.roundtable__c = roundtable__c;
        this.shares = shares;
        this.status__c = status__c;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
        this.type__c = type__c;
        this.kCura_Attendee__c = kCura_Attendee__c;
    }


    /**
     * Gets the account_Owner__c value for this Meeting__c.
     * 
     * @return account_Owner__c
     */
    public java.lang.String getAccount_Owner__c() {
        return account_Owner__c;
    }


    /**
     * Sets the account_Owner__c value for this Meeting__c.
     * 
     * @param account_Owner__c
     */
    public void setAccount_Owner__c(java.lang.String account_Owner__c) {
        this.account_Owner__c = account_Owner__c;
    }


    /**
     * Gets the account__c value for this Meeting__c.
     * 
     * @return account__c
     */
    public java.lang.String getAccount__c() {
        return account__c;
    }


    /**
     * Sets the account__c value for this Meeting__c.
     * 
     * @param account__c
     */
    public void setAccount__c(java.lang.String account__c) {
        this.account__c = account__c;
    }


    /**
     * Gets the account__r value for this Meeting__c.
     * 
     * @return account__r
     */
    public com.sforce.soap.enterprise.sobject.Account getAccount__r() {
        return account__r;
    }


    /**
     * Sets the account__r value for this Meeting__c.
     * 
     * @param account__r
     */
    public void setAccount__r(com.sforce.soap.enterprise.sobject.Account account__r) {
        this.account__r = account__r;
    }


    /**
     * Gets the activityHistories value for this Meeting__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this Meeting__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the agenda__c value for this Meeting__c.
     * 
     * @return agenda__c
     */
    public java.lang.String getAgenda__c() {
        return agenda__c;
    }


    /**
     * Sets the agenda__c value for this Meeting__c.
     * 
     * @param agenda__c
     */
    public void setAgenda__c(java.lang.String agenda__c) {
        this.agenda__c = agenda__c;
    }


    /**
     * Gets the any_Next_Steps__c value for this Meeting__c.
     * 
     * @return any_Next_Steps__c
     */
    public java.lang.String getAny_Next_Steps__c() {
        return any_Next_Steps__c;
    }


    /**
     * Sets the any_Next_Steps__c value for this Meeting__c.
     * 
     * @param any_Next_Steps__c
     */
    public void setAny_Next_Steps__c(java.lang.String any_Next_Steps__c) {
        this.any_Next_Steps__c = any_Next_Steps__c;
    }


    /**
     * Gets the attachments value for this Meeting__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Meeting__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the campaign__c value for this Meeting__c.
     * 
     * @return campaign__c
     */
    public java.lang.String getCampaign__c() {
        return campaign__c;
    }


    /**
     * Sets the campaign__c value for this Meeting__c.
     * 
     * @param campaign__c
     */
    public void setCampaign__c(java.lang.String campaign__c) {
        this.campaign__c = campaign__c;
    }


    /**
     * Gets the campaign__r value for this Meeting__c.
     * 
     * @return campaign__r
     */
    public com.sforce.soap.enterprise.sobject.Campaign getCampaign__r() {
        return campaign__r;
    }


    /**
     * Sets the campaign__r value for this Meeting__c.
     * 
     * @param campaign__r
     */
    public void setCampaign__r(com.sforce.soap.enterprise.sobject.Campaign campaign__r) {
        this.campaign__r = campaign__r;
    }


    /**
     * Gets the channel_Mgr_Outline__c value for this Meeting__c.
     * 
     * @return channel_Mgr_Outline__c
     */
    public java.lang.String getChannel_Mgr_Outline__c() {
        return channel_Mgr_Outline__c;
    }


    /**
     * Sets the channel_Mgr_Outline__c value for this Meeting__c.
     * 
     * @param channel_Mgr_Outline__c
     */
    public void setChannel_Mgr_Outline__c(java.lang.String channel_Mgr_Outline__c) {
        this.channel_Mgr_Outline__c = channel_Mgr_Outline__c;
    }


    /**
     * Gets the channel_Mgr_Outline__r value for this Meeting__c.
     * 
     * @return channel_Mgr_Outline__r
     */
    public com.sforce.soap.enterprise.sobject.Channel_Mgr_Outline__c getChannel_Mgr_Outline__r() {
        return channel_Mgr_Outline__r;
    }


    /**
     * Sets the channel_Mgr_Outline__r value for this Meeting__c.
     * 
     * @param channel_Mgr_Outline__r
     */
    public void setChannel_Mgr_Outline__r(com.sforce.soap.enterprise.sobject.Channel_Mgr_Outline__c channel_Mgr_Outline__r) {
        this.channel_Mgr_Outline__r = channel_Mgr_Outline__r;
    }


    /**
     * Gets the client_Type__c value for this Meeting__c.
     * 
     * @return client_Type__c
     */
    public java.lang.String getClient_Type__c() {
        return client_Type__c;
    }


    /**
     * Sets the client_Type__c value for this Meeting__c.
     * 
     * @param client_Type__c
     */
    public void setClient_Type__c(java.lang.String client_Type__c) {
        this.client_Type__c = client_Type__c;
    }


    /**
     * Gets the createdBy value for this Meeting__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Meeting__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Meeting__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Meeting__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Meeting__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Meeting__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the date_Time__c value for this Meeting__c.
     * 
     * @return date_Time__c
     */
    public java.util.Calendar getDate_Time__c() {
        return date_Time__c;
    }


    /**
     * Sets the date_Time__c value for this Meeting__c.
     * 
     * @param date_Time__c
     */
    public void setDate_Time__c(java.util.Calendar date_Time__c) {
        this.date_Time__c = date_Time__c;
    }


    /**
     * Gets the date_only__c value for this Meeting__c.
     * 
     * @return date_only__c
     */
    public java.util.Date getDate_only__c() {
        return date_only__c;
    }


    /**
     * Sets the date_only__c value for this Meeting__c.
     * 
     * @param date_only__c
     */
    public void setDate_only__c(java.util.Date date_only__c) {
        this.date_only__c = date_only__c;
    }


    /**
     * Gets the demo__c value for this Meeting__c.
     * 
     * @return demo__c
     */
    public java.lang.String getDemo__c() {
        return demo__c;
    }


    /**
     * Sets the demo__c value for this Meeting__c.
     * 
     * @param demo__c
     */
    public void setDemo__c(java.lang.String demo__c) {
        this.demo__c = demo__c;
    }


    /**
     * Gets the demo__r value for this Meeting__c.
     * 
     * @return demo__r
     */
    public com.sforce.soap.enterprise.sobject.Demo__c getDemo__r() {
        return demo__r;
    }


    /**
     * Sets the demo__r value for this Meeting__c.
     * 
     * @param demo__r
     */
    public void setDemo__r(com.sforce.soap.enterprise.sobject.Demo__c demo__r) {
        this.demo__r = demo__r;
    }


    /**
     * Gets the desired_Outcome__c value for this Meeting__c.
     * 
     * @return desired_Outcome__c
     */
    public java.lang.String getDesired_Outcome__c() {
        return desired_Outcome__c;
    }


    /**
     * Sets the desired_Outcome__c value for this Meeting__c.
     * 
     * @param desired_Outcome__c
     */
    public void setDesired_Outcome__c(java.lang.String desired_Outcome__c) {
        this.desired_Outcome__c = desired_Outcome__c;
    }


    /**
     * Gets the events value for this Meeting__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Meeting__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the external_Attendee__c value for this Meeting__c.
     * 
     * @return external_Attendee__c
     */
    public java.lang.String getExternal_Attendee__c() {
        return external_Attendee__c;
    }


    /**
     * Sets the external_Attendee__c value for this Meeting__c.
     * 
     * @param external_Attendee__c
     */
    public void setExternal_Attendee__c(java.lang.String external_Attendee__c) {
        this.external_Attendee__c = external_Attendee__c;
    }


    /**
     * Gets the external_Attendee__r value for this Meeting__c.
     * 
     * @return external_Attendee__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getExternal_Attendee__r() {
        return external_Attendee__r;
    }


    /**
     * Sets the external_Attendee__r value for this Meeting__c.
     * 
     * @param external_Attendee__r
     */
    public void setExternal_Attendee__r(com.sforce.soap.enterprise.sobject.Contact external_Attendee__r) {
        this.external_Attendee__r = external_Attendee__r;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Meeting__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Meeting__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the feeds value for this Meeting__c.
     * 
     * @return feeds
     */
    public com.sforce.soap.enterprise.QueryResult getFeeds() {
        return feeds;
    }


    /**
     * Sets the feeds value for this Meeting__c.
     * 
     * @param feeds
     */
    public void setFeeds(com.sforce.soap.enterprise.QueryResult feeds) {
        this.feeds = feeds;
    }


    /**
     * Gets the histories value for this Meeting__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Meeting__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the isDeleted value for this Meeting__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Meeting__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the items_Discussed__c value for this Meeting__c.
     * 
     * @return items_Discussed__c
     */
    public java.lang.String getItems_Discussed__c() {
        return items_Discussed__c;
    }


    /**
     * Sets the items_Discussed__c value for this Meeting__c.
     * 
     * @param items_Discussed__c
     */
    public void setItems_Discussed__c(java.lang.String items_Discussed__c) {
        this.items_Discussed__c = items_Discussed__c;
    }


    /**
     * Gets the lastActivityDate value for this Meeting__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Meeting__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this Meeting__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Meeting__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Meeting__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Meeting__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Meeting__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Meeting__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the location__c value for this Meeting__c.
     * 
     * @return location__c
     */
    public java.lang.String getLocation__c() {
        return location__c;
    }


    /**
     * Sets the location__c value for this Meeting__c.
     * 
     * @param location__c
     */
    public void setLocation__c(java.lang.String location__c) {
        this.location__c = location__c;
    }


    /**
     * Gets the meeting_Hours__c value for this Meeting__c.
     * 
     * @return meeting_Hours__c
     */
    public java.lang.Double getMeeting_Hours__c() {
        return meeting_Hours__c;
    }


    /**
     * Sets the meeting_Hours__c value for this Meeting__c.
     * 
     * @param meeting_Hours__c
     */
    public void setMeeting_Hours__c(java.lang.Double meeting_Hours__c) {
        this.meeting_Hours__c = meeting_Hours__c;
    }


    /**
     * Gets the meeting_Rank__c value for this Meeting__c.
     * 
     * @return meeting_Rank__c
     */
    public java.lang.String getMeeting_Rank__c() {
        return meeting_Rank__c;
    }


    /**
     * Sets the meeting_Rank__c value for this Meeting__c.
     * 
     * @param meeting_Rank__c
     */
    public void setMeeting_Rank__c(java.lang.String meeting_Rank__c) {
        this.meeting_Rank__c = meeting_Rank__c;
    }


    /**
     * Gets the name value for this Meeting__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Meeting__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the non_kCura_Attendee__c value for this Meeting__c.
     * 
     * @return non_kCura_Attendee__c
     */
    public java.lang.Boolean getNon_kCura_Attendee__c() {
        return non_kCura_Attendee__c;
    }


    /**
     * Sets the non_kCura_Attendee__c value for this Meeting__c.
     * 
     * @param non_kCura_Attendee__c
     */
    public void setNon_kCura_Attendee__c(java.lang.Boolean non_kCura_Attendee__c) {
        this.non_kCura_Attendee__c = non_kCura_Attendee__c;
    }


    /**
     * Gets the notes value for this Meeting__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Meeting__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Meeting__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Meeting__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the onsite_Visit_Attendees__r value for this Meeting__c.
     * 
     * @return onsite_Visit_Attendees__r
     */
    public com.sforce.soap.enterprise.QueryResult getOnsite_Visit_Attendees__r() {
        return onsite_Visit_Attendees__r;
    }


    /**
     * Sets the onsite_Visit_Attendees__r value for this Meeting__c.
     * 
     * @param onsite_Visit_Attendees__r
     */
    public void setOnsite_Visit_Attendees__r(com.sforce.soap.enterprise.QueryResult onsite_Visit_Attendees__r) {
        this.onsite_Visit_Attendees__r = onsite_Visit_Attendees__r;
    }


    /**
     * Gets the openActivities value for this Meeting__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this Meeting__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the opportunity__c value for this Meeting__c.
     * 
     * @return opportunity__c
     */
    public java.lang.String getOpportunity__c() {
        return opportunity__c;
    }


    /**
     * Sets the opportunity__c value for this Meeting__c.
     * 
     * @param opportunity__c
     */
    public void setOpportunity__c(java.lang.String opportunity__c) {
        this.opportunity__c = opportunity__c;
    }


    /**
     * Gets the opportunity__r value for this Meeting__c.
     * 
     * @return opportunity__r
     */
    public com.sforce.soap.enterprise.sobject.Opportunity getOpportunity__r() {
        return opportunity__r;
    }


    /**
     * Sets the opportunity__r value for this Meeting__c.
     * 
     * @param opportunity__r
     */
    public void setOpportunity__r(com.sforce.soap.enterprise.sobject.Opportunity opportunity__r) {
        this.opportunity__r = opportunity__r;
    }


    /**
     * Gets the owner value for this Meeting__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Meeting__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Meeting__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Meeting__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this Meeting__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Meeting__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Meeting__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Meeting__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the roundtable__c value for this Meeting__c.
     * 
     * @return roundtable__c
     */
    public java.lang.String getRoundtable__c() {
        return roundtable__c;
    }


    /**
     * Sets the roundtable__c value for this Meeting__c.
     * 
     * @param roundtable__c
     */
    public void setRoundtable__c(java.lang.String roundtable__c) {
        this.roundtable__c = roundtable__c;
    }


    /**
     * Gets the shares value for this Meeting__c.
     * 
     * @return shares
     */
    public com.sforce.soap.enterprise.QueryResult getShares() {
        return shares;
    }


    /**
     * Sets the shares value for this Meeting__c.
     * 
     * @param shares
     */
    public void setShares(com.sforce.soap.enterprise.QueryResult shares) {
        this.shares = shares;
    }


    /**
     * Gets the status__c value for this Meeting__c.
     * 
     * @return status__c
     */
    public java.lang.String getStatus__c() {
        return status__c;
    }


    /**
     * Sets the status__c value for this Meeting__c.
     * 
     * @param status__c
     */
    public void setStatus__c(java.lang.String status__c) {
        this.status__c = status__c;
    }


    /**
     * Gets the systemModstamp value for this Meeting__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Meeting__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this Meeting__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Meeting__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the type__c value for this Meeting__c.
     * 
     * @return type__c
     */
    public java.lang.String getType__c() {
        return type__c;
    }


    /**
     * Sets the type__c value for this Meeting__c.
     * 
     * @param type__c
     */
    public void setType__c(java.lang.String type__c) {
        this.type__c = type__c;
    }


    /**
     * Gets the kCura_Attendee__c value for this Meeting__c.
     * 
     * @return kCura_Attendee__c
     */
    public java.lang.Boolean getKCura_Attendee__c() {
        return kCura_Attendee__c;
    }


    /**
     * Sets the kCura_Attendee__c value for this Meeting__c.
     * 
     * @param kCura_Attendee__c
     */
    public void setKCura_Attendee__c(java.lang.Boolean kCura_Attendee__c) {
        this.kCura_Attendee__c = kCura_Attendee__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Meeting__c)) return false;
        Meeting__c other = (Meeting__c) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.account_Owner__c==null && other.getAccount_Owner__c()==null) || 
             (this.account_Owner__c!=null &&
              this.account_Owner__c.equals(other.getAccount_Owner__c()))) &&
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
            ((this.any_Next_Steps__c==null && other.getAny_Next_Steps__c()==null) || 
             (this.any_Next_Steps__c!=null &&
              this.any_Next_Steps__c.equals(other.getAny_Next_Steps__c()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.campaign__c==null && other.getCampaign__c()==null) || 
             (this.campaign__c!=null &&
              this.campaign__c.equals(other.getCampaign__c()))) &&
            ((this.campaign__r==null && other.getCampaign__r()==null) || 
             (this.campaign__r!=null &&
              this.campaign__r.equals(other.getCampaign__r()))) &&
            ((this.channel_Mgr_Outline__c==null && other.getChannel_Mgr_Outline__c()==null) || 
             (this.channel_Mgr_Outline__c!=null &&
              this.channel_Mgr_Outline__c.equals(other.getChannel_Mgr_Outline__c()))) &&
            ((this.channel_Mgr_Outline__r==null && other.getChannel_Mgr_Outline__r()==null) || 
             (this.channel_Mgr_Outline__r!=null &&
              this.channel_Mgr_Outline__r.equals(other.getChannel_Mgr_Outline__r()))) &&
            ((this.client_Type__c==null && other.getClient_Type__c()==null) || 
             (this.client_Type__c!=null &&
              this.client_Type__c.equals(other.getClient_Type__c()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.date_Time__c==null && other.getDate_Time__c()==null) || 
             (this.date_Time__c!=null &&
              this.date_Time__c.equals(other.getDate_Time__c()))) &&
            ((this.date_only__c==null && other.getDate_only__c()==null) || 
             (this.date_only__c!=null &&
              this.date_only__c.equals(other.getDate_only__c()))) &&
            ((this.demo__c==null && other.getDemo__c()==null) || 
             (this.demo__c!=null &&
              this.demo__c.equals(other.getDemo__c()))) &&
            ((this.demo__r==null && other.getDemo__r()==null) || 
             (this.demo__r!=null &&
              this.demo__r.equals(other.getDemo__r()))) &&
            ((this.desired_Outcome__c==null && other.getDesired_Outcome__c()==null) || 
             (this.desired_Outcome__c!=null &&
              this.desired_Outcome__c.equals(other.getDesired_Outcome__c()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              this.events.equals(other.getEvents()))) &&
            ((this.external_Attendee__c==null && other.getExternal_Attendee__c()==null) || 
             (this.external_Attendee__c!=null &&
              this.external_Attendee__c.equals(other.getExternal_Attendee__c()))) &&
            ((this.external_Attendee__r==null && other.getExternal_Attendee__r()==null) || 
             (this.external_Attendee__r!=null &&
              this.external_Attendee__r.equals(other.getExternal_Attendee__r()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.feeds==null && other.getFeeds()==null) || 
             (this.feeds!=null &&
              this.feeds.equals(other.getFeeds()))) &&
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.items_Discussed__c==null && other.getItems_Discussed__c()==null) || 
             (this.items_Discussed__c!=null &&
              this.items_Discussed__c.equals(other.getItems_Discussed__c()))) &&
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
            ((this.meeting_Hours__c==null && other.getMeeting_Hours__c()==null) || 
             (this.meeting_Hours__c!=null &&
              this.meeting_Hours__c.equals(other.getMeeting_Hours__c()))) &&
            ((this.meeting_Rank__c==null && other.getMeeting_Rank__c()==null) || 
             (this.meeting_Rank__c!=null &&
              this.meeting_Rank__c.equals(other.getMeeting_Rank__c()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.non_kCura_Attendee__c==null && other.getNon_kCura_Attendee__c()==null) || 
             (this.non_kCura_Attendee__c!=null &&
              this.non_kCura_Attendee__c.equals(other.getNon_kCura_Attendee__c()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.onsite_Visit_Attendees__r==null && other.getOnsite_Visit_Attendees__r()==null) || 
             (this.onsite_Visit_Attendees__r!=null &&
              this.onsite_Visit_Attendees__r.equals(other.getOnsite_Visit_Attendees__r()))) &&
            ((this.openActivities==null && other.getOpenActivities()==null) || 
             (this.openActivities!=null &&
              this.openActivities.equals(other.getOpenActivities()))) &&
            ((this.opportunity__c==null && other.getOpportunity__c()==null) || 
             (this.opportunity__c!=null &&
              this.opportunity__c.equals(other.getOpportunity__c()))) &&
            ((this.opportunity__r==null && other.getOpportunity__r()==null) || 
             (this.opportunity__r!=null &&
              this.opportunity__r.equals(other.getOpportunity__r()))) &&
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
            ((this.roundtable__c==null && other.getRoundtable__c()==null) || 
             (this.roundtable__c!=null &&
              this.roundtable__c.equals(other.getRoundtable__c()))) &&
            ((this.shares==null && other.getShares()==null) || 
             (this.shares!=null &&
              this.shares.equals(other.getShares()))) &&
            ((this.status__c==null && other.getStatus__c()==null) || 
             (this.status__c!=null &&
              this.status__c.equals(other.getStatus__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              this.tasks.equals(other.getTasks()))) &&
            ((this.type__c==null && other.getType__c()==null) || 
             (this.type__c!=null &&
              this.type__c.equals(other.getType__c()))) &&
            ((this.kCura_Attendee__c==null && other.getKCura_Attendee__c()==null) || 
             (this.kCura_Attendee__c!=null &&
              this.kCura_Attendee__c.equals(other.getKCura_Attendee__c())));
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
        if (getAccount_Owner__c() != null) {
            _hashCode += getAccount_Owner__c().hashCode();
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
        if (getAny_Next_Steps__c() != null) {
            _hashCode += getAny_Next_Steps__c().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getCampaign__c() != null) {
            _hashCode += getCampaign__c().hashCode();
        }
        if (getCampaign__r() != null) {
            _hashCode += getCampaign__r().hashCode();
        }
        if (getChannel_Mgr_Outline__c() != null) {
            _hashCode += getChannel_Mgr_Outline__c().hashCode();
        }
        if (getChannel_Mgr_Outline__r() != null) {
            _hashCode += getChannel_Mgr_Outline__r().hashCode();
        }
        if (getClient_Type__c() != null) {
            _hashCode += getClient_Type__c().hashCode();
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
        if (getDate_Time__c() != null) {
            _hashCode += getDate_Time__c().hashCode();
        }
        if (getDate_only__c() != null) {
            _hashCode += getDate_only__c().hashCode();
        }
        if (getDemo__c() != null) {
            _hashCode += getDemo__c().hashCode();
        }
        if (getDemo__r() != null) {
            _hashCode += getDemo__r().hashCode();
        }
        if (getDesired_Outcome__c() != null) {
            _hashCode += getDesired_Outcome__c().hashCode();
        }
        if (getEvents() != null) {
            _hashCode += getEvents().hashCode();
        }
        if (getExternal_Attendee__c() != null) {
            _hashCode += getExternal_Attendee__c().hashCode();
        }
        if (getExternal_Attendee__r() != null) {
            _hashCode += getExternal_Attendee__r().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getFeeds() != null) {
            _hashCode += getFeeds().hashCode();
        }
        if (getHistories() != null) {
            _hashCode += getHistories().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getItems_Discussed__c() != null) {
            _hashCode += getItems_Discussed__c().hashCode();
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
        if (getMeeting_Hours__c() != null) {
            _hashCode += getMeeting_Hours__c().hashCode();
        }
        if (getMeeting_Rank__c() != null) {
            _hashCode += getMeeting_Rank__c().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNon_kCura_Attendee__c() != null) {
            _hashCode += getNon_kCura_Attendee__c().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getNotesAndAttachments() != null) {
            _hashCode += getNotesAndAttachments().hashCode();
        }
        if (getOnsite_Visit_Attendees__r() != null) {
            _hashCode += getOnsite_Visit_Attendees__r().hashCode();
        }
        if (getOpenActivities() != null) {
            _hashCode += getOpenActivities().hashCode();
        }
        if (getOpportunity__c() != null) {
            _hashCode += getOpportunity__c().hashCode();
        }
        if (getOpportunity__r() != null) {
            _hashCode += getOpportunity__r().hashCode();
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
        if (getRoundtable__c() != null) {
            _hashCode += getRoundtable__c().hashCode();
        }
        if (getShares() != null) {
            _hashCode += getShares().hashCode();
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
        if (getType__c() != null) {
            _hashCode += getType__c().hashCode();
        }
        if (getKCura_Attendee__c() != null) {
            _hashCode += getKCura_Attendee__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Meeting__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Meeting__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account_Owner__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account_Owner__c"));
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
        elemField.setFieldName("any_Next_Steps__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Any_Next_Steps__c"));
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
        elemField.setFieldName("campaign__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Campaign__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaign__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Campaign__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Campaign"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel_Mgr_Outline__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Channel_Mgr_Outline__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel_Mgr_Outline__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Channel_Mgr_Outline__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Channel_Mgr_Outline__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("client_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Client_Type__c"));
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
        elemField.setFieldName("date_Time__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Time__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_only__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_only__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("demo__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Demo__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("demo__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Demo__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Demo__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desired_Outcome__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Desired_Outcome__c"));
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
        elemField.setFieldName("external_Attendee__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "External_Attendee__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("external_Attendee__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "External_Attendee__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
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
        elemField.setFieldName("items_Discussed__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Items_Discussed__c"));
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
        elemField.setFieldName("location__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Location__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meeting_Hours__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Meeting_Hours__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meeting_Rank__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Meeting_Rank__c"));
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
        elemField.setFieldName("non_kCura_Attendee__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Non_kCura_Attendee__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("onsite_Visit_Attendees__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Onsite_Visit_Attendees__r"));
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
        elemField.setFieldName("opportunity__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Opportunity__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunity__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Opportunity__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Opportunity"));
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
        elemField.setFieldName("roundtable__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Roundtable__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shares");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Shares"));
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
        elemField.setFieldName("type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KCura_Attendee__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "kCura_Attendee__c"));
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

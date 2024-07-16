/**
 * Demo__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Demo__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String call_Information__c;

    private java.lang.String campaign__c;

    private com.sforce.soap.enterprise.sobject.Campaign campaign__r;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.util.Calendar date_Time__c;

    private com.sforce.soap.enterprise.QueryResult demo_Survey_Results__r;

    private java.lang.Boolean do_Not_Send_Survey__c;

    private java.lang.Boolean emailSent__c;

    private com.sforce.soap.enterprise.QueryResult events;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.lang.String follow_up__c;

    private java.lang.String functions_Presented__c;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.Boolean isDeleted;

    private java.util.Date lastActivityDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private com.sforce.soap.enterprise.QueryResult leads__r;

    private java.lang.String meeting_URL__c;

    private com.sforce.soap.enterprise.QueryResult meetings__r;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private java.lang.String onsite_Visit__c;

    private com.sforce.soap.enterprise.sobject.Old_Onsite_Visit__c onsite_Visit__r;

    private com.sforce.soap.enterprise.QueryResult openActivities;

    private java.lang.String opportunity__c;

    private com.sforce.soap.enterprise.sobject.Opportunity opportunity__r;

    private java.lang.String overall__c;

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private java.lang.String partner__c;

    private com.sforce.soap.enterprise.sobject.Account partner__r;

    private java.lang.String post_Demo_Notes__c;

    private java.lang.String presenter__c;

    private com.sforce.soap.enterprise.sobject.Contact presenter__r;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.String prospect__c;

    private com.sforce.soap.enterprise.sobject.Account prospect__r;

    private java.lang.String reason_for_No_Survey__c;

    private com.sforce.soap.enterprise.sobject.RecordType recordType;

    private java.lang.String recordTypeId;

    private java.lang.Double release__c;

    private java.lang.String service_Used__c;

    private java.lang.String status__c;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    private java.lang.String type__c;

    private java.lang.String voice__c;

    private java.lang.String web_Conference_Comments__c;

    private java.lang.String web__c;

    public Demo__c() {
    }

    public Demo__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String call_Information__c,
           java.lang.String campaign__c,
           com.sforce.soap.enterprise.sobject.Campaign campaign__r,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.util.Calendar date_Time__c,
           com.sforce.soap.enterprise.QueryResult demo_Survey_Results__r,
           java.lang.Boolean do_Not_Send_Survey__c,
           java.lang.Boolean emailSent__c,
           com.sforce.soap.enterprise.QueryResult events,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.lang.String follow_up__c,
           java.lang.String functions_Presented__c,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.Boolean isDeleted,
           java.util.Date lastActivityDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           com.sforce.soap.enterprise.QueryResult leads__r,
           java.lang.String meeting_URL__c,
           com.sforce.soap.enterprise.QueryResult meetings__r,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           java.lang.String onsite_Visit__c,
           com.sforce.soap.enterprise.sobject.Old_Onsite_Visit__c onsite_Visit__r,
           com.sforce.soap.enterprise.QueryResult openActivities,
           java.lang.String opportunity__c,
           com.sforce.soap.enterprise.sobject.Opportunity opportunity__r,
           java.lang.String overall__c,
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           java.lang.String partner__c,
           com.sforce.soap.enterprise.sobject.Account partner__r,
           java.lang.String post_Demo_Notes__c,
           java.lang.String presenter__c,
           com.sforce.soap.enterprise.sobject.Contact presenter__r,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.String prospect__c,
           com.sforce.soap.enterprise.sobject.Account prospect__r,
           java.lang.String reason_for_No_Survey__c,
           com.sforce.soap.enterprise.sobject.RecordType recordType,
           java.lang.String recordTypeId,
           java.lang.Double release__c,
           java.lang.String service_Used__c,
           java.lang.String status__c,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks,
           java.lang.String type__c,
           java.lang.String voice__c,
           java.lang.String web_Conference_Comments__c,
           java.lang.String web__c) {
        super(
            fieldsToNull,
            id);
        this.activityHistories = activityHistories;
        this.attachments = attachments;
        this.call_Information__c = call_Information__c;
        this.campaign__c = campaign__c;
        this.campaign__r = campaign__r;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.date_Time__c = date_Time__c;
        this.demo_Survey_Results__r = demo_Survey_Results__r;
        this.do_Not_Send_Survey__c = do_Not_Send_Survey__c;
        this.emailSent__c = emailSent__c;
        this.events = events;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.follow_up__c = follow_up__c;
        this.functions_Presented__c = functions_Presented__c;
        this.histories = histories;
        this.isDeleted = isDeleted;
        this.lastActivityDate = lastActivityDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.leads__r = leads__r;
        this.meeting_URL__c = meeting_URL__c;
        this.meetings__r = meetings__r;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.onsite_Visit__c = onsite_Visit__c;
        this.onsite_Visit__r = onsite_Visit__r;
        this.openActivities = openActivities;
        this.opportunity__c = opportunity__c;
        this.opportunity__r = opportunity__r;
        this.overall__c = overall__c;
        this.owner = owner;
        this.ownerId = ownerId;
        this.partner__c = partner__c;
        this.partner__r = partner__r;
        this.post_Demo_Notes__c = post_Demo_Notes__c;
        this.presenter__c = presenter__c;
        this.presenter__r = presenter__r;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.prospect__c = prospect__c;
        this.prospect__r = prospect__r;
        this.reason_for_No_Survey__c = reason_for_No_Survey__c;
        this.recordType = recordType;
        this.recordTypeId = recordTypeId;
        this.release__c = release__c;
        this.service_Used__c = service_Used__c;
        this.status__c = status__c;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
        this.type__c = type__c;
        this.voice__c = voice__c;
        this.web_Conference_Comments__c = web_Conference_Comments__c;
        this.web__c = web__c;
    }


    /**
     * Gets the activityHistories value for this Demo__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this Demo__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the attachments value for this Demo__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Demo__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the call_Information__c value for this Demo__c.
     * 
     * @return call_Information__c
     */
    public java.lang.String getCall_Information__c() {
        return call_Information__c;
    }


    /**
     * Sets the call_Information__c value for this Demo__c.
     * 
     * @param call_Information__c
     */
    public void setCall_Information__c(java.lang.String call_Information__c) {
        this.call_Information__c = call_Information__c;
    }


    /**
     * Gets the campaign__c value for this Demo__c.
     * 
     * @return campaign__c
     */
    public java.lang.String getCampaign__c() {
        return campaign__c;
    }


    /**
     * Sets the campaign__c value for this Demo__c.
     * 
     * @param campaign__c
     */
    public void setCampaign__c(java.lang.String campaign__c) {
        this.campaign__c = campaign__c;
    }


    /**
     * Gets the campaign__r value for this Demo__c.
     * 
     * @return campaign__r
     */
    public com.sforce.soap.enterprise.sobject.Campaign getCampaign__r() {
        return campaign__r;
    }


    /**
     * Sets the campaign__r value for this Demo__c.
     * 
     * @param campaign__r
     */
    public void setCampaign__r(com.sforce.soap.enterprise.sobject.Campaign campaign__r) {
        this.campaign__r = campaign__r;
    }


    /**
     * Gets the createdBy value for this Demo__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Demo__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Demo__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Demo__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Demo__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Demo__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the date_Time__c value for this Demo__c.
     * 
     * @return date_Time__c
     */
    public java.util.Calendar getDate_Time__c() {
        return date_Time__c;
    }


    /**
     * Sets the date_Time__c value for this Demo__c.
     * 
     * @param date_Time__c
     */
    public void setDate_Time__c(java.util.Calendar date_Time__c) {
        this.date_Time__c = date_Time__c;
    }


    /**
     * Gets the demo_Survey_Results__r value for this Demo__c.
     * 
     * @return demo_Survey_Results__r
     */
    public com.sforce.soap.enterprise.QueryResult getDemo_Survey_Results__r() {
        return demo_Survey_Results__r;
    }


    /**
     * Sets the demo_Survey_Results__r value for this Demo__c.
     * 
     * @param demo_Survey_Results__r
     */
    public void setDemo_Survey_Results__r(com.sforce.soap.enterprise.QueryResult demo_Survey_Results__r) {
        this.demo_Survey_Results__r = demo_Survey_Results__r;
    }


    /**
     * Gets the do_Not_Send_Survey__c value for this Demo__c.
     * 
     * @return do_Not_Send_Survey__c
     */
    public java.lang.Boolean getDo_Not_Send_Survey__c() {
        return do_Not_Send_Survey__c;
    }


    /**
     * Sets the do_Not_Send_Survey__c value for this Demo__c.
     * 
     * @param do_Not_Send_Survey__c
     */
    public void setDo_Not_Send_Survey__c(java.lang.Boolean do_Not_Send_Survey__c) {
        this.do_Not_Send_Survey__c = do_Not_Send_Survey__c;
    }


    /**
     * Gets the emailSent__c value for this Demo__c.
     * 
     * @return emailSent__c
     */
    public java.lang.Boolean getEmailSent__c() {
        return emailSent__c;
    }


    /**
     * Sets the emailSent__c value for this Demo__c.
     * 
     * @param emailSent__c
     */
    public void setEmailSent__c(java.lang.Boolean emailSent__c) {
        this.emailSent__c = emailSent__c;
    }


    /**
     * Gets the events value for this Demo__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Demo__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Demo__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Demo__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the follow_up__c value for this Demo__c.
     * 
     * @return follow_up__c
     */
    public java.lang.String getFollow_up__c() {
        return follow_up__c;
    }


    /**
     * Sets the follow_up__c value for this Demo__c.
     * 
     * @param follow_up__c
     */
    public void setFollow_up__c(java.lang.String follow_up__c) {
        this.follow_up__c = follow_up__c;
    }


    /**
     * Gets the functions_Presented__c value for this Demo__c.
     * 
     * @return functions_Presented__c
     */
    public java.lang.String getFunctions_Presented__c() {
        return functions_Presented__c;
    }


    /**
     * Sets the functions_Presented__c value for this Demo__c.
     * 
     * @param functions_Presented__c
     */
    public void setFunctions_Presented__c(java.lang.String functions_Presented__c) {
        this.functions_Presented__c = functions_Presented__c;
    }


    /**
     * Gets the histories value for this Demo__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Demo__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the isDeleted value for this Demo__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Demo__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastActivityDate value for this Demo__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Demo__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this Demo__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Demo__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Demo__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Demo__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Demo__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Demo__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the leads__r value for this Demo__c.
     * 
     * @return leads__r
     */
    public com.sforce.soap.enterprise.QueryResult getLeads__r() {
        return leads__r;
    }


    /**
     * Sets the leads__r value for this Demo__c.
     * 
     * @param leads__r
     */
    public void setLeads__r(com.sforce.soap.enterprise.QueryResult leads__r) {
        this.leads__r = leads__r;
    }


    /**
     * Gets the meeting_URL__c value for this Demo__c.
     * 
     * @return meeting_URL__c
     */
    public java.lang.String getMeeting_URL__c() {
        return meeting_URL__c;
    }


    /**
     * Sets the meeting_URL__c value for this Demo__c.
     * 
     * @param meeting_URL__c
     */
    public void setMeeting_URL__c(java.lang.String meeting_URL__c) {
        this.meeting_URL__c = meeting_URL__c;
    }


    /**
     * Gets the meetings__r value for this Demo__c.
     * 
     * @return meetings__r
     */
    public com.sforce.soap.enterprise.QueryResult getMeetings__r() {
        return meetings__r;
    }


    /**
     * Sets the meetings__r value for this Demo__c.
     * 
     * @param meetings__r
     */
    public void setMeetings__r(com.sforce.soap.enterprise.QueryResult meetings__r) {
        this.meetings__r = meetings__r;
    }


    /**
     * Gets the name value for this Demo__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Demo__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Demo__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Demo__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Demo__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Demo__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the onsite_Visit__c value for this Demo__c.
     * 
     * @return onsite_Visit__c
     */
    public java.lang.String getOnsite_Visit__c() {
        return onsite_Visit__c;
    }


    /**
     * Sets the onsite_Visit__c value for this Demo__c.
     * 
     * @param onsite_Visit__c
     */
    public void setOnsite_Visit__c(java.lang.String onsite_Visit__c) {
        this.onsite_Visit__c = onsite_Visit__c;
    }


    /**
     * Gets the onsite_Visit__r value for this Demo__c.
     * 
     * @return onsite_Visit__r
     */
    public com.sforce.soap.enterprise.sobject.Old_Onsite_Visit__c getOnsite_Visit__r() {
        return onsite_Visit__r;
    }


    /**
     * Sets the onsite_Visit__r value for this Demo__c.
     * 
     * @param onsite_Visit__r
     */
    public void setOnsite_Visit__r(com.sforce.soap.enterprise.sobject.Old_Onsite_Visit__c onsite_Visit__r) {
        this.onsite_Visit__r = onsite_Visit__r;
    }


    /**
     * Gets the openActivities value for this Demo__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this Demo__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the opportunity__c value for this Demo__c.
     * 
     * @return opportunity__c
     */
    public java.lang.String getOpportunity__c() {
        return opportunity__c;
    }


    /**
     * Sets the opportunity__c value for this Demo__c.
     * 
     * @param opportunity__c
     */
    public void setOpportunity__c(java.lang.String opportunity__c) {
        this.opportunity__c = opportunity__c;
    }


    /**
     * Gets the opportunity__r value for this Demo__c.
     * 
     * @return opportunity__r
     */
    public com.sforce.soap.enterprise.sobject.Opportunity getOpportunity__r() {
        return opportunity__r;
    }


    /**
     * Sets the opportunity__r value for this Demo__c.
     * 
     * @param opportunity__r
     */
    public void setOpportunity__r(com.sforce.soap.enterprise.sobject.Opportunity opportunity__r) {
        this.opportunity__r = opportunity__r;
    }


    /**
     * Gets the overall__c value for this Demo__c.
     * 
     * @return overall__c
     */
    public java.lang.String getOverall__c() {
        return overall__c;
    }


    /**
     * Sets the overall__c value for this Demo__c.
     * 
     * @param overall__c
     */
    public void setOverall__c(java.lang.String overall__c) {
        this.overall__c = overall__c;
    }


    /**
     * Gets the owner value for this Demo__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Demo__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Demo__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Demo__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the partner__c value for this Demo__c.
     * 
     * @return partner__c
     */
    public java.lang.String getPartner__c() {
        return partner__c;
    }


    /**
     * Sets the partner__c value for this Demo__c.
     * 
     * @param partner__c
     */
    public void setPartner__c(java.lang.String partner__c) {
        this.partner__c = partner__c;
    }


    /**
     * Gets the partner__r value for this Demo__c.
     * 
     * @return partner__r
     */
    public com.sforce.soap.enterprise.sobject.Account getPartner__r() {
        return partner__r;
    }


    /**
     * Sets the partner__r value for this Demo__c.
     * 
     * @param partner__r
     */
    public void setPartner__r(com.sforce.soap.enterprise.sobject.Account partner__r) {
        this.partner__r = partner__r;
    }


    /**
     * Gets the post_Demo_Notes__c value for this Demo__c.
     * 
     * @return post_Demo_Notes__c
     */
    public java.lang.String getPost_Demo_Notes__c() {
        return post_Demo_Notes__c;
    }


    /**
     * Sets the post_Demo_Notes__c value for this Demo__c.
     * 
     * @param post_Demo_Notes__c
     */
    public void setPost_Demo_Notes__c(java.lang.String post_Demo_Notes__c) {
        this.post_Demo_Notes__c = post_Demo_Notes__c;
    }


    /**
     * Gets the presenter__c value for this Demo__c.
     * 
     * @return presenter__c
     */
    public java.lang.String getPresenter__c() {
        return presenter__c;
    }


    /**
     * Sets the presenter__c value for this Demo__c.
     * 
     * @param presenter__c
     */
    public void setPresenter__c(java.lang.String presenter__c) {
        this.presenter__c = presenter__c;
    }


    /**
     * Gets the presenter__r value for this Demo__c.
     * 
     * @return presenter__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getPresenter__r() {
        return presenter__r;
    }


    /**
     * Sets the presenter__r value for this Demo__c.
     * 
     * @param presenter__r
     */
    public void setPresenter__r(com.sforce.soap.enterprise.sobject.Contact presenter__r) {
        this.presenter__r = presenter__r;
    }


    /**
     * Gets the processInstances value for this Demo__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Demo__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Demo__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Demo__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the prospect__c value for this Demo__c.
     * 
     * @return prospect__c
     */
    public java.lang.String getProspect__c() {
        return prospect__c;
    }


    /**
     * Sets the prospect__c value for this Demo__c.
     * 
     * @param prospect__c
     */
    public void setProspect__c(java.lang.String prospect__c) {
        this.prospect__c = prospect__c;
    }


    /**
     * Gets the prospect__r value for this Demo__c.
     * 
     * @return prospect__r
     */
    public com.sforce.soap.enterprise.sobject.Account getProspect__r() {
        return prospect__r;
    }


    /**
     * Sets the prospect__r value for this Demo__c.
     * 
     * @param prospect__r
     */
    public void setProspect__r(com.sforce.soap.enterprise.sobject.Account prospect__r) {
        this.prospect__r = prospect__r;
    }


    /**
     * Gets the reason_for_No_Survey__c value for this Demo__c.
     * 
     * @return reason_for_No_Survey__c
     */
    public java.lang.String getReason_for_No_Survey__c() {
        return reason_for_No_Survey__c;
    }


    /**
     * Sets the reason_for_No_Survey__c value for this Demo__c.
     * 
     * @param reason_for_No_Survey__c
     */
    public void setReason_for_No_Survey__c(java.lang.String reason_for_No_Survey__c) {
        this.reason_for_No_Survey__c = reason_for_No_Survey__c;
    }


    /**
     * Gets the recordType value for this Demo__c.
     * 
     * @return recordType
     */
    public com.sforce.soap.enterprise.sobject.RecordType getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this Demo__c.
     * 
     * @param recordType
     */
    public void setRecordType(com.sforce.soap.enterprise.sobject.RecordType recordType) {
        this.recordType = recordType;
    }


    /**
     * Gets the recordTypeId value for this Demo__c.
     * 
     * @return recordTypeId
     */
    public java.lang.String getRecordTypeId() {
        return recordTypeId;
    }


    /**
     * Sets the recordTypeId value for this Demo__c.
     * 
     * @param recordTypeId
     */
    public void setRecordTypeId(java.lang.String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }


    /**
     * Gets the release__c value for this Demo__c.
     * 
     * @return release__c
     */
    public java.lang.Double getRelease__c() {
        return release__c;
    }


    /**
     * Sets the release__c value for this Demo__c.
     * 
     * @param release__c
     */
    public void setRelease__c(java.lang.Double release__c) {
        this.release__c = release__c;
    }


    /**
     * Gets the service_Used__c value for this Demo__c.
     * 
     * @return service_Used__c
     */
    public java.lang.String getService_Used__c() {
        return service_Used__c;
    }


    /**
     * Sets the service_Used__c value for this Demo__c.
     * 
     * @param service_Used__c
     */
    public void setService_Used__c(java.lang.String service_Used__c) {
        this.service_Used__c = service_Used__c;
    }


    /**
     * Gets the status__c value for this Demo__c.
     * 
     * @return status__c
     */
    public java.lang.String getStatus__c() {
        return status__c;
    }


    /**
     * Sets the status__c value for this Demo__c.
     * 
     * @param status__c
     */
    public void setStatus__c(java.lang.String status__c) {
        this.status__c = status__c;
    }


    /**
     * Gets the systemModstamp value for this Demo__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Demo__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this Demo__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Demo__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the type__c value for this Demo__c.
     * 
     * @return type__c
     */
    public java.lang.String getType__c() {
        return type__c;
    }


    /**
     * Sets the type__c value for this Demo__c.
     * 
     * @param type__c
     */
    public void setType__c(java.lang.String type__c) {
        this.type__c = type__c;
    }


    /**
     * Gets the voice__c value for this Demo__c.
     * 
     * @return voice__c
     */
    public java.lang.String getVoice__c() {
        return voice__c;
    }


    /**
     * Sets the voice__c value for this Demo__c.
     * 
     * @param voice__c
     */
    public void setVoice__c(java.lang.String voice__c) {
        this.voice__c = voice__c;
    }


    /**
     * Gets the web_Conference_Comments__c value for this Demo__c.
     * 
     * @return web_Conference_Comments__c
     */
    public java.lang.String getWeb_Conference_Comments__c() {
        return web_Conference_Comments__c;
    }


    /**
     * Sets the web_Conference_Comments__c value for this Demo__c.
     * 
     * @param web_Conference_Comments__c
     */
    public void setWeb_Conference_Comments__c(java.lang.String web_Conference_Comments__c) {
        this.web_Conference_Comments__c = web_Conference_Comments__c;
    }


    /**
     * Gets the web__c value for this Demo__c.
     * 
     * @return web__c
     */
    public java.lang.String getWeb__c() {
        return web__c;
    }


    /**
     * Sets the web__c value for this Demo__c.
     * 
     * @param web__c
     */
    public void setWeb__c(java.lang.String web__c) {
        this.web__c = web__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Demo__c)) return false;
        Demo__c other = (Demo__c) obj;
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
            ((this.call_Information__c==null && other.getCall_Information__c()==null) || 
             (this.call_Information__c!=null &&
              this.call_Information__c.equals(other.getCall_Information__c()))) &&
            ((this.campaign__c==null && other.getCampaign__c()==null) || 
             (this.campaign__c!=null &&
              this.campaign__c.equals(other.getCampaign__c()))) &&
            ((this.campaign__r==null && other.getCampaign__r()==null) || 
             (this.campaign__r!=null &&
              this.campaign__r.equals(other.getCampaign__r()))) &&
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
            ((this.demo_Survey_Results__r==null && other.getDemo_Survey_Results__r()==null) || 
             (this.demo_Survey_Results__r!=null &&
              this.demo_Survey_Results__r.equals(other.getDemo_Survey_Results__r()))) &&
            ((this.do_Not_Send_Survey__c==null && other.getDo_Not_Send_Survey__c()==null) || 
             (this.do_Not_Send_Survey__c!=null &&
              this.do_Not_Send_Survey__c.equals(other.getDo_Not_Send_Survey__c()))) &&
            ((this.emailSent__c==null && other.getEmailSent__c()==null) || 
             (this.emailSent__c!=null &&
              this.emailSent__c.equals(other.getEmailSent__c()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              this.events.equals(other.getEvents()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.follow_up__c==null && other.getFollow_up__c()==null) || 
             (this.follow_up__c!=null &&
              this.follow_up__c.equals(other.getFollow_up__c()))) &&
            ((this.functions_Presented__c==null && other.getFunctions_Presented__c()==null) || 
             (this.functions_Presented__c!=null &&
              this.functions_Presented__c.equals(other.getFunctions_Presented__c()))) &&
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
            ((this.leads__r==null && other.getLeads__r()==null) || 
             (this.leads__r!=null &&
              this.leads__r.equals(other.getLeads__r()))) &&
            ((this.meeting_URL__c==null && other.getMeeting_URL__c()==null) || 
             (this.meeting_URL__c!=null &&
              this.meeting_URL__c.equals(other.getMeeting_URL__c()))) &&
            ((this.meetings__r==null && other.getMeetings__r()==null) || 
             (this.meetings__r!=null &&
              this.meetings__r.equals(other.getMeetings__r()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.onsite_Visit__c==null && other.getOnsite_Visit__c()==null) || 
             (this.onsite_Visit__c!=null &&
              this.onsite_Visit__c.equals(other.getOnsite_Visit__c()))) &&
            ((this.onsite_Visit__r==null && other.getOnsite_Visit__r()==null) || 
             (this.onsite_Visit__r!=null &&
              this.onsite_Visit__r.equals(other.getOnsite_Visit__r()))) &&
            ((this.openActivities==null && other.getOpenActivities()==null) || 
             (this.openActivities!=null &&
              this.openActivities.equals(other.getOpenActivities()))) &&
            ((this.opportunity__c==null && other.getOpportunity__c()==null) || 
             (this.opportunity__c!=null &&
              this.opportunity__c.equals(other.getOpportunity__c()))) &&
            ((this.opportunity__r==null && other.getOpportunity__r()==null) || 
             (this.opportunity__r!=null &&
              this.opportunity__r.equals(other.getOpportunity__r()))) &&
            ((this.overall__c==null && other.getOverall__c()==null) || 
             (this.overall__c!=null &&
              this.overall__c.equals(other.getOverall__c()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.partner__c==null && other.getPartner__c()==null) || 
             (this.partner__c!=null &&
              this.partner__c.equals(other.getPartner__c()))) &&
            ((this.partner__r==null && other.getPartner__r()==null) || 
             (this.partner__r!=null &&
              this.partner__r.equals(other.getPartner__r()))) &&
            ((this.post_Demo_Notes__c==null && other.getPost_Demo_Notes__c()==null) || 
             (this.post_Demo_Notes__c!=null &&
              this.post_Demo_Notes__c.equals(other.getPost_Demo_Notes__c()))) &&
            ((this.presenter__c==null && other.getPresenter__c()==null) || 
             (this.presenter__c!=null &&
              this.presenter__c.equals(other.getPresenter__c()))) &&
            ((this.presenter__r==null && other.getPresenter__r()==null) || 
             (this.presenter__r!=null &&
              this.presenter__r.equals(other.getPresenter__r()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.prospect__c==null && other.getProspect__c()==null) || 
             (this.prospect__c!=null &&
              this.prospect__c.equals(other.getProspect__c()))) &&
            ((this.prospect__r==null && other.getProspect__r()==null) || 
             (this.prospect__r!=null &&
              this.prospect__r.equals(other.getProspect__r()))) &&
            ((this.reason_for_No_Survey__c==null && other.getReason_for_No_Survey__c()==null) || 
             (this.reason_for_No_Survey__c!=null &&
              this.reason_for_No_Survey__c.equals(other.getReason_for_No_Survey__c()))) &&
            ((this.recordType==null && other.getRecordType()==null) || 
             (this.recordType!=null &&
              this.recordType.equals(other.getRecordType()))) &&
            ((this.recordTypeId==null && other.getRecordTypeId()==null) || 
             (this.recordTypeId!=null &&
              this.recordTypeId.equals(other.getRecordTypeId()))) &&
            ((this.release__c==null && other.getRelease__c()==null) || 
             (this.release__c!=null &&
              this.release__c.equals(other.getRelease__c()))) &&
            ((this.service_Used__c==null && other.getService_Used__c()==null) || 
             (this.service_Used__c!=null &&
              this.service_Used__c.equals(other.getService_Used__c()))) &&
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
            ((this.voice__c==null && other.getVoice__c()==null) || 
             (this.voice__c!=null &&
              this.voice__c.equals(other.getVoice__c()))) &&
            ((this.web_Conference_Comments__c==null && other.getWeb_Conference_Comments__c()==null) || 
             (this.web_Conference_Comments__c!=null &&
              this.web_Conference_Comments__c.equals(other.getWeb_Conference_Comments__c()))) &&
            ((this.web__c==null && other.getWeb__c()==null) || 
             (this.web__c!=null &&
              this.web__c.equals(other.getWeb__c())));
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
        if (getCall_Information__c() != null) {
            _hashCode += getCall_Information__c().hashCode();
        }
        if (getCampaign__c() != null) {
            _hashCode += getCampaign__c().hashCode();
        }
        if (getCampaign__r() != null) {
            _hashCode += getCampaign__r().hashCode();
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
        if (getDemo_Survey_Results__r() != null) {
            _hashCode += getDemo_Survey_Results__r().hashCode();
        }
        if (getDo_Not_Send_Survey__c() != null) {
            _hashCode += getDo_Not_Send_Survey__c().hashCode();
        }
        if (getEmailSent__c() != null) {
            _hashCode += getEmailSent__c().hashCode();
        }
        if (getEvents() != null) {
            _hashCode += getEvents().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getFollow_up__c() != null) {
            _hashCode += getFollow_up__c().hashCode();
        }
        if (getFunctions_Presented__c() != null) {
            _hashCode += getFunctions_Presented__c().hashCode();
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
        if (getLeads__r() != null) {
            _hashCode += getLeads__r().hashCode();
        }
        if (getMeeting_URL__c() != null) {
            _hashCode += getMeeting_URL__c().hashCode();
        }
        if (getMeetings__r() != null) {
            _hashCode += getMeetings__r().hashCode();
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
        if (getOnsite_Visit__c() != null) {
            _hashCode += getOnsite_Visit__c().hashCode();
        }
        if (getOnsite_Visit__r() != null) {
            _hashCode += getOnsite_Visit__r().hashCode();
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
        if (getOverall__c() != null) {
            _hashCode += getOverall__c().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getPartner__c() != null) {
            _hashCode += getPartner__c().hashCode();
        }
        if (getPartner__r() != null) {
            _hashCode += getPartner__r().hashCode();
        }
        if (getPost_Demo_Notes__c() != null) {
            _hashCode += getPost_Demo_Notes__c().hashCode();
        }
        if (getPresenter__c() != null) {
            _hashCode += getPresenter__c().hashCode();
        }
        if (getPresenter__r() != null) {
            _hashCode += getPresenter__r().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getProspect__c() != null) {
            _hashCode += getProspect__c().hashCode();
        }
        if (getProspect__r() != null) {
            _hashCode += getProspect__r().hashCode();
        }
        if (getReason_for_No_Survey__c() != null) {
            _hashCode += getReason_for_No_Survey__c().hashCode();
        }
        if (getRecordType() != null) {
            _hashCode += getRecordType().hashCode();
        }
        if (getRecordTypeId() != null) {
            _hashCode += getRecordTypeId().hashCode();
        }
        if (getRelease__c() != null) {
            _hashCode += getRelease__c().hashCode();
        }
        if (getService_Used__c() != null) {
            _hashCode += getService_Used__c().hashCode();
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
        if (getVoice__c() != null) {
            _hashCode += getVoice__c().hashCode();
        }
        if (getWeb_Conference_Comments__c() != null) {
            _hashCode += getWeb_Conference_Comments__c().hashCode();
        }
        if (getWeb__c() != null) {
            _hashCode += getWeb__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Demo__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Demo__c"));
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
        elemField.setFieldName("call_Information__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Call_Information__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("demo_Survey_Results__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Demo_Survey_Results__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("do_Not_Send_Survey__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Do_Not_Send_Survey__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailSent__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailSent__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("follow_up__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Follow_up__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("functions_Presented__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Functions_Presented__c"));
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
        elemField.setFieldName("leads__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Leads__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meeting_URL__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Meeting_URL__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meetings__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Meetings__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("onsite_Visit__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Onsite_Visit__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onsite_Visit__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Onsite_Visit__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Old_Onsite_Visit__c"));
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
        elemField.setFieldName("overall__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Overall__c"));
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
        elemField.setFieldName("partner__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Partner__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partner__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Partner__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("post_Demo_Notes__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Post_Demo_Notes__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presenter__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Presenter__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presenter__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Presenter__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
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
        elemField.setFieldName("prospect__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Prospect__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prospect__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Prospect__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason_for_No_Survey__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Reason_for_No_Survey__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("release__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Release__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service_Used__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Service_Used__c"));
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
        elemField.setFieldName("voice__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Voice__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("web_Conference_Comments__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Web_Conference_Comments__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("web__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Web__c"));
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

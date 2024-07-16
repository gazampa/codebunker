/**
 * Concurforce__CT_REPORT_CHATTER__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Concurforce__CT_REPORT_CHATTER__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String concurforce__ADDENDUM_REPORT_ID__c;

    private com.sforce.soap.enterprise.sobject.Concurforce__CT_REPORT_CHATTER__c concurforce__ADDENDUM_REPORT_ID__r;

    private java.lang.String concurforce__APPROVER_APS_KEY__c;

    private com.sforce.soap.enterprise.sobject.Concurforce__CT_APS_STATUS__c concurforce__APPROVER_APS_KEY__r;

    private java.lang.String concurforce__APPROVER_FORWARD_LOGIN_ID__c;

    private com.sforce.soap.enterprise.sobject.User concurforce__APPROVER_FORWARD_LOGIN_ID__r;

    private java.lang.String concurforce__APPROVER_FORWARD_RPT_KEY__c;

    private java.lang.String concurforce__APPROVER_LOGIN_ID__c;

    private com.sforce.soap.enterprise.sobject.User concurforce__APPROVER_LOGIN_ID__r;

    private java.lang.String concurforce__APPROVER_RPT_KEY__c;

    private java.lang.String concurforce__APS_KEY__c;

    private com.sforce.soap.enterprise.sobject.Concurforce__CT_APS_STATUS__c concurforce__APS_KEY__r;

    private com.sforce.soap.enterprise.QueryResult concurforce__Expenses__r;

    private java.lang.String concurforce__PAY_KEY__c;

    private com.sforce.soap.enterprise.sobject.Concurforce__CT_PAY_STATUS__c concurforce__PAY_KEY__r;

    private java.lang.String concurforce__RPT_ACTION__c;

    private java.lang.String concurforce__RPT_KEY__c;

    private java.lang.String concurforce__RPT_SENT_BACK_COMMENTS__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private com.sforce.soap.enterprise.QueryResult events;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult feeds;

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

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private com.sforce.soap.enterprise.QueryResult shares;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    public Concurforce__CT_REPORT_CHATTER__c() {
    }

    public Concurforce__CT_REPORT_CHATTER__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String concurforce__ADDENDUM_REPORT_ID__c,
           com.sforce.soap.enterprise.sobject.Concurforce__CT_REPORT_CHATTER__c concurforce__ADDENDUM_REPORT_ID__r,
           java.lang.String concurforce__APPROVER_APS_KEY__c,
           com.sforce.soap.enterprise.sobject.Concurforce__CT_APS_STATUS__c concurforce__APPROVER_APS_KEY__r,
           java.lang.String concurforce__APPROVER_FORWARD_LOGIN_ID__c,
           com.sforce.soap.enterprise.sobject.User concurforce__APPROVER_FORWARD_LOGIN_ID__r,
           java.lang.String concurforce__APPROVER_FORWARD_RPT_KEY__c,
           java.lang.String concurforce__APPROVER_LOGIN_ID__c,
           com.sforce.soap.enterprise.sobject.User concurforce__APPROVER_LOGIN_ID__r,
           java.lang.String concurforce__APPROVER_RPT_KEY__c,
           java.lang.String concurforce__APS_KEY__c,
           com.sforce.soap.enterprise.sobject.Concurforce__CT_APS_STATUS__c concurforce__APS_KEY__r,
           com.sforce.soap.enterprise.QueryResult concurforce__Expenses__r,
           java.lang.String concurforce__PAY_KEY__c,
           com.sforce.soap.enterprise.sobject.Concurforce__CT_PAY_STATUS__c concurforce__PAY_KEY__r,
           java.lang.String concurforce__RPT_ACTION__c,
           java.lang.String concurforce__RPT_KEY__c,
           java.lang.String concurforce__RPT_SENT_BACK_COMMENTS__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           com.sforce.soap.enterprise.QueryResult events,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult feeds,
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
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           com.sforce.soap.enterprise.QueryResult shares,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks) {
        super(
            fieldsToNull,
            id);
        this.activityHistories = activityHistories;
        this.attachments = attachments;
        this.concurforce__ADDENDUM_REPORT_ID__c = concurforce__ADDENDUM_REPORT_ID__c;
        this.concurforce__ADDENDUM_REPORT_ID__r = concurforce__ADDENDUM_REPORT_ID__r;
        this.concurforce__APPROVER_APS_KEY__c = concurforce__APPROVER_APS_KEY__c;
        this.concurforce__APPROVER_APS_KEY__r = concurforce__APPROVER_APS_KEY__r;
        this.concurforce__APPROVER_FORWARD_LOGIN_ID__c = concurforce__APPROVER_FORWARD_LOGIN_ID__c;
        this.concurforce__APPROVER_FORWARD_LOGIN_ID__r = concurforce__APPROVER_FORWARD_LOGIN_ID__r;
        this.concurforce__APPROVER_FORWARD_RPT_KEY__c = concurforce__APPROVER_FORWARD_RPT_KEY__c;
        this.concurforce__APPROVER_LOGIN_ID__c = concurforce__APPROVER_LOGIN_ID__c;
        this.concurforce__APPROVER_LOGIN_ID__r = concurforce__APPROVER_LOGIN_ID__r;
        this.concurforce__APPROVER_RPT_KEY__c = concurforce__APPROVER_RPT_KEY__c;
        this.concurforce__APS_KEY__c = concurforce__APS_KEY__c;
        this.concurforce__APS_KEY__r = concurforce__APS_KEY__r;
        this.concurforce__Expenses__r = concurforce__Expenses__r;
        this.concurforce__PAY_KEY__c = concurforce__PAY_KEY__c;
        this.concurforce__PAY_KEY__r = concurforce__PAY_KEY__r;
        this.concurforce__RPT_ACTION__c = concurforce__RPT_ACTION__c;
        this.concurforce__RPT_KEY__c = concurforce__RPT_KEY__c;
        this.concurforce__RPT_SENT_BACK_COMMENTS__c = concurforce__RPT_SENT_BACK_COMMENTS__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.events = events;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.feeds = feeds;
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
        this.owner = owner;
        this.ownerId = ownerId;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.shares = shares;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
    }


    /**
     * Gets the activityHistories value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the attachments value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the concurforce__ADDENDUM_REPORT_ID__c value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return concurforce__ADDENDUM_REPORT_ID__c
     */
    public java.lang.String getConcurforce__ADDENDUM_REPORT_ID__c() {
        return concurforce__ADDENDUM_REPORT_ID__c;
    }


    /**
     * Sets the concurforce__ADDENDUM_REPORT_ID__c value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param concurforce__ADDENDUM_REPORT_ID__c
     */
    public void setConcurforce__ADDENDUM_REPORT_ID__c(java.lang.String concurforce__ADDENDUM_REPORT_ID__c) {
        this.concurforce__ADDENDUM_REPORT_ID__c = concurforce__ADDENDUM_REPORT_ID__c;
    }


    /**
     * Gets the concurforce__ADDENDUM_REPORT_ID__r value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return concurforce__ADDENDUM_REPORT_ID__r
     */
    public com.sforce.soap.enterprise.sobject.Concurforce__CT_REPORT_CHATTER__c getConcurforce__ADDENDUM_REPORT_ID__r() {
        return concurforce__ADDENDUM_REPORT_ID__r;
    }


    /**
     * Sets the concurforce__ADDENDUM_REPORT_ID__r value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param concurforce__ADDENDUM_REPORT_ID__r
     */
    public void setConcurforce__ADDENDUM_REPORT_ID__r(com.sforce.soap.enterprise.sobject.Concurforce__CT_REPORT_CHATTER__c concurforce__ADDENDUM_REPORT_ID__r) {
        this.concurforce__ADDENDUM_REPORT_ID__r = concurforce__ADDENDUM_REPORT_ID__r;
    }


    /**
     * Gets the concurforce__APPROVER_APS_KEY__c value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return concurforce__APPROVER_APS_KEY__c
     */
    public java.lang.String getConcurforce__APPROVER_APS_KEY__c() {
        return concurforce__APPROVER_APS_KEY__c;
    }


    /**
     * Sets the concurforce__APPROVER_APS_KEY__c value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param concurforce__APPROVER_APS_KEY__c
     */
    public void setConcurforce__APPROVER_APS_KEY__c(java.lang.String concurforce__APPROVER_APS_KEY__c) {
        this.concurforce__APPROVER_APS_KEY__c = concurforce__APPROVER_APS_KEY__c;
    }


    /**
     * Gets the concurforce__APPROVER_APS_KEY__r value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return concurforce__APPROVER_APS_KEY__r
     */
    public com.sforce.soap.enterprise.sobject.Concurforce__CT_APS_STATUS__c getConcurforce__APPROVER_APS_KEY__r() {
        return concurforce__APPROVER_APS_KEY__r;
    }


    /**
     * Sets the concurforce__APPROVER_APS_KEY__r value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param concurforce__APPROVER_APS_KEY__r
     */
    public void setConcurforce__APPROVER_APS_KEY__r(com.sforce.soap.enterprise.sobject.Concurforce__CT_APS_STATUS__c concurforce__APPROVER_APS_KEY__r) {
        this.concurforce__APPROVER_APS_KEY__r = concurforce__APPROVER_APS_KEY__r;
    }


    /**
     * Gets the concurforce__APPROVER_FORWARD_LOGIN_ID__c value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return concurforce__APPROVER_FORWARD_LOGIN_ID__c
     */
    public java.lang.String getConcurforce__APPROVER_FORWARD_LOGIN_ID__c() {
        return concurforce__APPROVER_FORWARD_LOGIN_ID__c;
    }


    /**
     * Sets the concurforce__APPROVER_FORWARD_LOGIN_ID__c value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param concurforce__APPROVER_FORWARD_LOGIN_ID__c
     */
    public void setConcurforce__APPROVER_FORWARD_LOGIN_ID__c(java.lang.String concurforce__APPROVER_FORWARD_LOGIN_ID__c) {
        this.concurforce__APPROVER_FORWARD_LOGIN_ID__c = concurforce__APPROVER_FORWARD_LOGIN_ID__c;
    }


    /**
     * Gets the concurforce__APPROVER_FORWARD_LOGIN_ID__r value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return concurforce__APPROVER_FORWARD_LOGIN_ID__r
     */
    public com.sforce.soap.enterprise.sobject.User getConcurforce__APPROVER_FORWARD_LOGIN_ID__r() {
        return concurforce__APPROVER_FORWARD_LOGIN_ID__r;
    }


    /**
     * Sets the concurforce__APPROVER_FORWARD_LOGIN_ID__r value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param concurforce__APPROVER_FORWARD_LOGIN_ID__r
     */
    public void setConcurforce__APPROVER_FORWARD_LOGIN_ID__r(com.sforce.soap.enterprise.sobject.User concurforce__APPROVER_FORWARD_LOGIN_ID__r) {
        this.concurforce__APPROVER_FORWARD_LOGIN_ID__r = concurforce__APPROVER_FORWARD_LOGIN_ID__r;
    }


    /**
     * Gets the concurforce__APPROVER_FORWARD_RPT_KEY__c value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return concurforce__APPROVER_FORWARD_RPT_KEY__c
     */
    public java.lang.String getConcurforce__APPROVER_FORWARD_RPT_KEY__c() {
        return concurforce__APPROVER_FORWARD_RPT_KEY__c;
    }


    /**
     * Sets the concurforce__APPROVER_FORWARD_RPT_KEY__c value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param concurforce__APPROVER_FORWARD_RPT_KEY__c
     */
    public void setConcurforce__APPROVER_FORWARD_RPT_KEY__c(java.lang.String concurforce__APPROVER_FORWARD_RPT_KEY__c) {
        this.concurforce__APPROVER_FORWARD_RPT_KEY__c = concurforce__APPROVER_FORWARD_RPT_KEY__c;
    }


    /**
     * Gets the concurforce__APPROVER_LOGIN_ID__c value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return concurforce__APPROVER_LOGIN_ID__c
     */
    public java.lang.String getConcurforce__APPROVER_LOGIN_ID__c() {
        return concurforce__APPROVER_LOGIN_ID__c;
    }


    /**
     * Sets the concurforce__APPROVER_LOGIN_ID__c value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param concurforce__APPROVER_LOGIN_ID__c
     */
    public void setConcurforce__APPROVER_LOGIN_ID__c(java.lang.String concurforce__APPROVER_LOGIN_ID__c) {
        this.concurforce__APPROVER_LOGIN_ID__c = concurforce__APPROVER_LOGIN_ID__c;
    }


    /**
     * Gets the concurforce__APPROVER_LOGIN_ID__r value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return concurforce__APPROVER_LOGIN_ID__r
     */
    public com.sforce.soap.enterprise.sobject.User getConcurforce__APPROVER_LOGIN_ID__r() {
        return concurforce__APPROVER_LOGIN_ID__r;
    }


    /**
     * Sets the concurforce__APPROVER_LOGIN_ID__r value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param concurforce__APPROVER_LOGIN_ID__r
     */
    public void setConcurforce__APPROVER_LOGIN_ID__r(com.sforce.soap.enterprise.sobject.User concurforce__APPROVER_LOGIN_ID__r) {
        this.concurforce__APPROVER_LOGIN_ID__r = concurforce__APPROVER_LOGIN_ID__r;
    }


    /**
     * Gets the concurforce__APPROVER_RPT_KEY__c value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return concurforce__APPROVER_RPT_KEY__c
     */
    public java.lang.String getConcurforce__APPROVER_RPT_KEY__c() {
        return concurforce__APPROVER_RPT_KEY__c;
    }


    /**
     * Sets the concurforce__APPROVER_RPT_KEY__c value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param concurforce__APPROVER_RPT_KEY__c
     */
    public void setConcurforce__APPROVER_RPT_KEY__c(java.lang.String concurforce__APPROVER_RPT_KEY__c) {
        this.concurforce__APPROVER_RPT_KEY__c = concurforce__APPROVER_RPT_KEY__c;
    }


    /**
     * Gets the concurforce__APS_KEY__c value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return concurforce__APS_KEY__c
     */
    public java.lang.String getConcurforce__APS_KEY__c() {
        return concurforce__APS_KEY__c;
    }


    /**
     * Sets the concurforce__APS_KEY__c value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param concurforce__APS_KEY__c
     */
    public void setConcurforce__APS_KEY__c(java.lang.String concurforce__APS_KEY__c) {
        this.concurforce__APS_KEY__c = concurforce__APS_KEY__c;
    }


    /**
     * Gets the concurforce__APS_KEY__r value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return concurforce__APS_KEY__r
     */
    public com.sforce.soap.enterprise.sobject.Concurforce__CT_APS_STATUS__c getConcurforce__APS_KEY__r() {
        return concurforce__APS_KEY__r;
    }


    /**
     * Sets the concurforce__APS_KEY__r value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param concurforce__APS_KEY__r
     */
    public void setConcurforce__APS_KEY__r(com.sforce.soap.enterprise.sobject.Concurforce__CT_APS_STATUS__c concurforce__APS_KEY__r) {
        this.concurforce__APS_KEY__r = concurforce__APS_KEY__r;
    }


    /**
     * Gets the concurforce__Expenses__r value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return concurforce__Expenses__r
     */
    public com.sforce.soap.enterprise.QueryResult getConcurforce__Expenses__r() {
        return concurforce__Expenses__r;
    }


    /**
     * Sets the concurforce__Expenses__r value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param concurforce__Expenses__r
     */
    public void setConcurforce__Expenses__r(com.sforce.soap.enterprise.QueryResult concurforce__Expenses__r) {
        this.concurforce__Expenses__r = concurforce__Expenses__r;
    }


    /**
     * Gets the concurforce__PAY_KEY__c value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return concurforce__PAY_KEY__c
     */
    public java.lang.String getConcurforce__PAY_KEY__c() {
        return concurforce__PAY_KEY__c;
    }


    /**
     * Sets the concurforce__PAY_KEY__c value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param concurforce__PAY_KEY__c
     */
    public void setConcurforce__PAY_KEY__c(java.lang.String concurforce__PAY_KEY__c) {
        this.concurforce__PAY_KEY__c = concurforce__PAY_KEY__c;
    }


    /**
     * Gets the concurforce__PAY_KEY__r value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return concurforce__PAY_KEY__r
     */
    public com.sforce.soap.enterprise.sobject.Concurforce__CT_PAY_STATUS__c getConcurforce__PAY_KEY__r() {
        return concurforce__PAY_KEY__r;
    }


    /**
     * Sets the concurforce__PAY_KEY__r value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param concurforce__PAY_KEY__r
     */
    public void setConcurforce__PAY_KEY__r(com.sforce.soap.enterprise.sobject.Concurforce__CT_PAY_STATUS__c concurforce__PAY_KEY__r) {
        this.concurforce__PAY_KEY__r = concurforce__PAY_KEY__r;
    }


    /**
     * Gets the concurforce__RPT_ACTION__c value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return concurforce__RPT_ACTION__c
     */
    public java.lang.String getConcurforce__RPT_ACTION__c() {
        return concurforce__RPT_ACTION__c;
    }


    /**
     * Sets the concurforce__RPT_ACTION__c value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param concurforce__RPT_ACTION__c
     */
    public void setConcurforce__RPT_ACTION__c(java.lang.String concurforce__RPT_ACTION__c) {
        this.concurforce__RPT_ACTION__c = concurforce__RPT_ACTION__c;
    }


    /**
     * Gets the concurforce__RPT_KEY__c value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return concurforce__RPT_KEY__c
     */
    public java.lang.String getConcurforce__RPT_KEY__c() {
        return concurforce__RPT_KEY__c;
    }


    /**
     * Sets the concurforce__RPT_KEY__c value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param concurforce__RPT_KEY__c
     */
    public void setConcurforce__RPT_KEY__c(java.lang.String concurforce__RPT_KEY__c) {
        this.concurforce__RPT_KEY__c = concurforce__RPT_KEY__c;
    }


    /**
     * Gets the concurforce__RPT_SENT_BACK_COMMENTS__c value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return concurforce__RPT_SENT_BACK_COMMENTS__c
     */
    public java.lang.String getConcurforce__RPT_SENT_BACK_COMMENTS__c() {
        return concurforce__RPT_SENT_BACK_COMMENTS__c;
    }


    /**
     * Sets the concurforce__RPT_SENT_BACK_COMMENTS__c value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param concurforce__RPT_SENT_BACK_COMMENTS__c
     */
    public void setConcurforce__RPT_SENT_BACK_COMMENTS__c(java.lang.String concurforce__RPT_SENT_BACK_COMMENTS__c) {
        this.concurforce__RPT_SENT_BACK_COMMENTS__c = concurforce__RPT_SENT_BACK_COMMENTS__c;
    }


    /**
     * Gets the createdBy value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the events value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the feeds value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return feeds
     */
    public com.sforce.soap.enterprise.QueryResult getFeeds() {
        return feeds;
    }


    /**
     * Sets the feeds value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param feeds
     */
    public void setFeeds(com.sforce.soap.enterprise.QueryResult feeds) {
        this.feeds = feeds;
    }


    /**
     * Gets the histories value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the isDeleted value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastActivityDate value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the openActivities value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the owner value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the shares value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return shares
     */
    public com.sforce.soap.enterprise.QueryResult getShares() {
        return shares;
    }


    /**
     * Sets the shares value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param shares
     */
    public void setShares(com.sforce.soap.enterprise.QueryResult shares) {
        this.shares = shares;
    }


    /**
     * Gets the systemModstamp value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Concurforce__CT_REPORT_CHATTER__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Concurforce__CT_REPORT_CHATTER__c)) return false;
        Concurforce__CT_REPORT_CHATTER__c other = (Concurforce__CT_REPORT_CHATTER__c) obj;
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
            ((this.concurforce__ADDENDUM_REPORT_ID__c==null && other.getConcurforce__ADDENDUM_REPORT_ID__c()==null) || 
             (this.concurforce__ADDENDUM_REPORT_ID__c!=null &&
              this.concurforce__ADDENDUM_REPORT_ID__c.equals(other.getConcurforce__ADDENDUM_REPORT_ID__c()))) &&
            ((this.concurforce__ADDENDUM_REPORT_ID__r==null && other.getConcurforce__ADDENDUM_REPORT_ID__r()==null) || 
             (this.concurforce__ADDENDUM_REPORT_ID__r!=null &&
              this.concurforce__ADDENDUM_REPORT_ID__r.equals(other.getConcurforce__ADDENDUM_REPORT_ID__r()))) &&
            ((this.concurforce__APPROVER_APS_KEY__c==null && other.getConcurforce__APPROVER_APS_KEY__c()==null) || 
             (this.concurforce__APPROVER_APS_KEY__c!=null &&
              this.concurforce__APPROVER_APS_KEY__c.equals(other.getConcurforce__APPROVER_APS_KEY__c()))) &&
            ((this.concurforce__APPROVER_APS_KEY__r==null && other.getConcurforce__APPROVER_APS_KEY__r()==null) || 
             (this.concurforce__APPROVER_APS_KEY__r!=null &&
              this.concurforce__APPROVER_APS_KEY__r.equals(other.getConcurforce__APPROVER_APS_KEY__r()))) &&
            ((this.concurforce__APPROVER_FORWARD_LOGIN_ID__c==null && other.getConcurforce__APPROVER_FORWARD_LOGIN_ID__c()==null) || 
             (this.concurforce__APPROVER_FORWARD_LOGIN_ID__c!=null &&
              this.concurforce__APPROVER_FORWARD_LOGIN_ID__c.equals(other.getConcurforce__APPROVER_FORWARD_LOGIN_ID__c()))) &&
            ((this.concurforce__APPROVER_FORWARD_LOGIN_ID__r==null && other.getConcurforce__APPROVER_FORWARD_LOGIN_ID__r()==null) || 
             (this.concurforce__APPROVER_FORWARD_LOGIN_ID__r!=null &&
              this.concurforce__APPROVER_FORWARD_LOGIN_ID__r.equals(other.getConcurforce__APPROVER_FORWARD_LOGIN_ID__r()))) &&
            ((this.concurforce__APPROVER_FORWARD_RPT_KEY__c==null && other.getConcurforce__APPROVER_FORWARD_RPT_KEY__c()==null) || 
             (this.concurforce__APPROVER_FORWARD_RPT_KEY__c!=null &&
              this.concurforce__APPROVER_FORWARD_RPT_KEY__c.equals(other.getConcurforce__APPROVER_FORWARD_RPT_KEY__c()))) &&
            ((this.concurforce__APPROVER_LOGIN_ID__c==null && other.getConcurforce__APPROVER_LOGIN_ID__c()==null) || 
             (this.concurforce__APPROVER_LOGIN_ID__c!=null &&
              this.concurforce__APPROVER_LOGIN_ID__c.equals(other.getConcurforce__APPROVER_LOGIN_ID__c()))) &&
            ((this.concurforce__APPROVER_LOGIN_ID__r==null && other.getConcurforce__APPROVER_LOGIN_ID__r()==null) || 
             (this.concurforce__APPROVER_LOGIN_ID__r!=null &&
              this.concurforce__APPROVER_LOGIN_ID__r.equals(other.getConcurforce__APPROVER_LOGIN_ID__r()))) &&
            ((this.concurforce__APPROVER_RPT_KEY__c==null && other.getConcurforce__APPROVER_RPT_KEY__c()==null) || 
             (this.concurforce__APPROVER_RPT_KEY__c!=null &&
              this.concurforce__APPROVER_RPT_KEY__c.equals(other.getConcurforce__APPROVER_RPT_KEY__c()))) &&
            ((this.concurforce__APS_KEY__c==null && other.getConcurforce__APS_KEY__c()==null) || 
             (this.concurforce__APS_KEY__c!=null &&
              this.concurforce__APS_KEY__c.equals(other.getConcurforce__APS_KEY__c()))) &&
            ((this.concurforce__APS_KEY__r==null && other.getConcurforce__APS_KEY__r()==null) || 
             (this.concurforce__APS_KEY__r!=null &&
              this.concurforce__APS_KEY__r.equals(other.getConcurforce__APS_KEY__r()))) &&
            ((this.concurforce__Expenses__r==null && other.getConcurforce__Expenses__r()==null) || 
             (this.concurforce__Expenses__r!=null &&
              this.concurforce__Expenses__r.equals(other.getConcurforce__Expenses__r()))) &&
            ((this.concurforce__PAY_KEY__c==null && other.getConcurforce__PAY_KEY__c()==null) || 
             (this.concurforce__PAY_KEY__c!=null &&
              this.concurforce__PAY_KEY__c.equals(other.getConcurforce__PAY_KEY__c()))) &&
            ((this.concurforce__PAY_KEY__r==null && other.getConcurforce__PAY_KEY__r()==null) || 
             (this.concurforce__PAY_KEY__r!=null &&
              this.concurforce__PAY_KEY__r.equals(other.getConcurforce__PAY_KEY__r()))) &&
            ((this.concurforce__RPT_ACTION__c==null && other.getConcurforce__RPT_ACTION__c()==null) || 
             (this.concurforce__RPT_ACTION__c!=null &&
              this.concurforce__RPT_ACTION__c.equals(other.getConcurforce__RPT_ACTION__c()))) &&
            ((this.concurforce__RPT_KEY__c==null && other.getConcurforce__RPT_KEY__c()==null) || 
             (this.concurforce__RPT_KEY__c!=null &&
              this.concurforce__RPT_KEY__c.equals(other.getConcurforce__RPT_KEY__c()))) &&
            ((this.concurforce__RPT_SENT_BACK_COMMENTS__c==null && other.getConcurforce__RPT_SENT_BACK_COMMENTS__c()==null) || 
             (this.concurforce__RPT_SENT_BACK_COMMENTS__c!=null &&
              this.concurforce__RPT_SENT_BACK_COMMENTS__c.equals(other.getConcurforce__RPT_SENT_BACK_COMMENTS__c()))) &&
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
            ((this.feeds==null && other.getFeeds()==null) || 
             (this.feeds!=null &&
              this.feeds.equals(other.getFeeds()))) &&
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
            ((this.shares==null && other.getShares()==null) || 
             (this.shares!=null &&
              this.shares.equals(other.getShares()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              this.tasks.equals(other.getTasks())));
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
        if (getConcurforce__ADDENDUM_REPORT_ID__c() != null) {
            _hashCode += getConcurforce__ADDENDUM_REPORT_ID__c().hashCode();
        }
        if (getConcurforce__ADDENDUM_REPORT_ID__r() != null) {
            _hashCode += getConcurforce__ADDENDUM_REPORT_ID__r().hashCode();
        }
        if (getConcurforce__APPROVER_APS_KEY__c() != null) {
            _hashCode += getConcurforce__APPROVER_APS_KEY__c().hashCode();
        }
        if (getConcurforce__APPROVER_APS_KEY__r() != null) {
            _hashCode += getConcurforce__APPROVER_APS_KEY__r().hashCode();
        }
        if (getConcurforce__APPROVER_FORWARD_LOGIN_ID__c() != null) {
            _hashCode += getConcurforce__APPROVER_FORWARD_LOGIN_ID__c().hashCode();
        }
        if (getConcurforce__APPROVER_FORWARD_LOGIN_ID__r() != null) {
            _hashCode += getConcurforce__APPROVER_FORWARD_LOGIN_ID__r().hashCode();
        }
        if (getConcurforce__APPROVER_FORWARD_RPT_KEY__c() != null) {
            _hashCode += getConcurforce__APPROVER_FORWARD_RPT_KEY__c().hashCode();
        }
        if (getConcurforce__APPROVER_LOGIN_ID__c() != null) {
            _hashCode += getConcurforce__APPROVER_LOGIN_ID__c().hashCode();
        }
        if (getConcurforce__APPROVER_LOGIN_ID__r() != null) {
            _hashCode += getConcurforce__APPROVER_LOGIN_ID__r().hashCode();
        }
        if (getConcurforce__APPROVER_RPT_KEY__c() != null) {
            _hashCode += getConcurforce__APPROVER_RPT_KEY__c().hashCode();
        }
        if (getConcurforce__APS_KEY__c() != null) {
            _hashCode += getConcurforce__APS_KEY__c().hashCode();
        }
        if (getConcurforce__APS_KEY__r() != null) {
            _hashCode += getConcurforce__APS_KEY__r().hashCode();
        }
        if (getConcurforce__Expenses__r() != null) {
            _hashCode += getConcurforce__Expenses__r().hashCode();
        }
        if (getConcurforce__PAY_KEY__c() != null) {
            _hashCode += getConcurforce__PAY_KEY__c().hashCode();
        }
        if (getConcurforce__PAY_KEY__r() != null) {
            _hashCode += getConcurforce__PAY_KEY__r().hashCode();
        }
        if (getConcurforce__RPT_ACTION__c() != null) {
            _hashCode += getConcurforce__RPT_ACTION__c().hashCode();
        }
        if (getConcurforce__RPT_KEY__c() != null) {
            _hashCode += getConcurforce__RPT_KEY__c().hashCode();
        }
        if (getConcurforce__RPT_SENT_BACK_COMMENTS__c() != null) {
            _hashCode += getConcurforce__RPT_SENT_BACK_COMMENTS__c().hashCode();
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
        if (getFeeds() != null) {
            _hashCode += getFeeds().hashCode();
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
        if (getShares() != null) {
            _hashCode += getShares().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTasks() != null) {
            _hashCode += getTasks().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Concurforce__CT_REPORT_CHATTER__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__CT_REPORT_CHATTER__c"));
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
        elemField.setFieldName("concurforce__ADDENDUM_REPORT_ID__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__ADDENDUM_REPORT_ID__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__ADDENDUM_REPORT_ID__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__ADDENDUM_REPORT_ID__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__CT_REPORT_CHATTER__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__APPROVER_APS_KEY__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__APPROVER_APS_KEY__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__APPROVER_APS_KEY__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__APPROVER_APS_KEY__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__CT_APS_STATUS__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__APPROVER_FORWARD_LOGIN_ID__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__APPROVER_FORWARD_LOGIN_ID__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__APPROVER_FORWARD_LOGIN_ID__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__APPROVER_FORWARD_LOGIN_ID__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__APPROVER_FORWARD_RPT_KEY__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__APPROVER_FORWARD_RPT_KEY__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__APPROVER_LOGIN_ID__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__APPROVER_LOGIN_ID__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__APPROVER_LOGIN_ID__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__APPROVER_LOGIN_ID__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__APPROVER_RPT_KEY__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__APPROVER_RPT_KEY__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__APS_KEY__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__APS_KEY__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__APS_KEY__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__APS_KEY__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__CT_APS_STATUS__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__Expenses__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__Expenses__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__PAY_KEY__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__PAY_KEY__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__PAY_KEY__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__PAY_KEY__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__CT_PAY_STATUS__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__RPT_ACTION__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__RPT_ACTION__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__RPT_KEY__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__RPT_KEY__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__RPT_SENT_BACK_COMMENTS__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__RPT_SENT_BACK_COMMENTS__c"));
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
        elemField.setFieldName("shares");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Shares"));
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

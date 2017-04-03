/**
 * Concurforce__CT_EXPENSE_SUMMARY__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Concurforce__CT_EXPENSE_SUMMARY__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String concurforce__ACCOUNT_ID__c;

    private com.sforce.soap.enterprise.sobject.Account concurforce__ACCOUNT_ID__r;

    private java.lang.Double concurforce__APPROVED_AMOUNT__c;

    private com.sforce.soap.enterprise.QueryResult concurforce__Allocations__r;

    private com.sforce.soap.enterprise.QueryResult concurforce__Attendee__r;

    private java.lang.Double concurforce__CLAIMED_AMOUNT__c;

    private java.lang.String concurforce__CRN_ALPHA_CODE__c;

    private java.lang.String concurforce__EXP_KEY__c;

    private com.sforce.soap.enterprise.sobject.Concurforce__CT_EXPENSE_TYPE__c concurforce__EXP_KEY__r;

    private java.lang.String concurforce__OPPORTUNITY_ID__c;

    private com.sforce.soap.enterprise.sobject.Opportunity concurforce__OPPORTUNITY_ID__r;

    private java.lang.Double concurforce__PAID_AMOUNT__c;

    private java.lang.String concurforce__PAY_KEY__c;

    private java.lang.String concurforce__RPE_SYNC_GUID__c;

    private java.lang.String concurforce__SF_RPT_KEY__c;

    private com.sforce.soap.enterprise.sobject.Concurforce__CT_REPORT_BATCH__c concurforce__SF_RPT_KEY__r;

    private java.lang.String concurforce__SPD_CAT__c;

    private com.sforce.soap.enterprise.sobject.Concurforce__CT_SPEND_CATEGORY__c concurforce__SPD_CAT__r;

    private java.util.Date concurforce__TRANSACTION_DATE__c;

    private java.lang.Double concurforce__UNPAID_AMOUNT__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

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

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    public Concurforce__CT_EXPENSE_SUMMARY__c() {
    }

    public Concurforce__CT_EXPENSE_SUMMARY__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String concurforce__ACCOUNT_ID__c,
           com.sforce.soap.enterprise.sobject.Account concurforce__ACCOUNT_ID__r,
           java.lang.Double concurforce__APPROVED_AMOUNT__c,
           com.sforce.soap.enterprise.QueryResult concurforce__Allocations__r,
           com.sforce.soap.enterprise.QueryResult concurforce__Attendee__r,
           java.lang.Double concurforce__CLAIMED_AMOUNT__c,
           java.lang.String concurforce__CRN_ALPHA_CODE__c,
           java.lang.String concurforce__EXP_KEY__c,
           com.sforce.soap.enterprise.sobject.Concurforce__CT_EXPENSE_TYPE__c concurforce__EXP_KEY__r,
           java.lang.String concurforce__OPPORTUNITY_ID__c,
           com.sforce.soap.enterprise.sobject.Opportunity concurforce__OPPORTUNITY_ID__r,
           java.lang.Double concurforce__PAID_AMOUNT__c,
           java.lang.String concurforce__PAY_KEY__c,
           java.lang.String concurforce__RPE_SYNC_GUID__c,
           java.lang.String concurforce__SF_RPT_KEY__c,
           com.sforce.soap.enterprise.sobject.Concurforce__CT_REPORT_BATCH__c concurforce__SF_RPT_KEY__r,
           java.lang.String concurforce__SPD_CAT__c,
           com.sforce.soap.enterprise.sobject.Concurforce__CT_SPEND_CATEGORY__c concurforce__SPD_CAT__r,
           java.util.Date concurforce__TRANSACTION_DATE__c,
           java.lang.Double concurforce__UNPAID_AMOUNT__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
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
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks) {
        super(
            fieldsToNull,
            id);
        this.activityHistories = activityHistories;
        this.attachments = attachments;
        this.concurforce__ACCOUNT_ID__c = concurforce__ACCOUNT_ID__c;
        this.concurforce__ACCOUNT_ID__r = concurforce__ACCOUNT_ID__r;
        this.concurforce__APPROVED_AMOUNT__c = concurforce__APPROVED_AMOUNT__c;
        this.concurforce__Allocations__r = concurforce__Allocations__r;
        this.concurforce__Attendee__r = concurforce__Attendee__r;
        this.concurforce__CLAIMED_AMOUNT__c = concurforce__CLAIMED_AMOUNT__c;
        this.concurforce__CRN_ALPHA_CODE__c = concurforce__CRN_ALPHA_CODE__c;
        this.concurforce__EXP_KEY__c = concurforce__EXP_KEY__c;
        this.concurforce__EXP_KEY__r = concurforce__EXP_KEY__r;
        this.concurforce__OPPORTUNITY_ID__c = concurforce__OPPORTUNITY_ID__c;
        this.concurforce__OPPORTUNITY_ID__r = concurforce__OPPORTUNITY_ID__r;
        this.concurforce__PAID_AMOUNT__c = concurforce__PAID_AMOUNT__c;
        this.concurforce__PAY_KEY__c = concurforce__PAY_KEY__c;
        this.concurforce__RPE_SYNC_GUID__c = concurforce__RPE_SYNC_GUID__c;
        this.concurforce__SF_RPT_KEY__c = concurforce__SF_RPT_KEY__c;
        this.concurforce__SF_RPT_KEY__r = concurforce__SF_RPT_KEY__r;
        this.concurforce__SPD_CAT__c = concurforce__SPD_CAT__c;
        this.concurforce__SPD_CAT__r = concurforce__SPD_CAT__r;
        this.concurforce__TRANSACTION_DATE__c = concurforce__TRANSACTION_DATE__c;
        this.concurforce__UNPAID_AMOUNT__c = concurforce__UNPAID_AMOUNT__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
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
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
    }


    /**
     * Gets the activityHistories value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the attachments value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the concurforce__ACCOUNT_ID__c value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return concurforce__ACCOUNT_ID__c
     */
    public java.lang.String getConcurforce__ACCOUNT_ID__c() {
        return concurforce__ACCOUNT_ID__c;
    }


    /**
     * Sets the concurforce__ACCOUNT_ID__c value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param concurforce__ACCOUNT_ID__c
     */
    public void setConcurforce__ACCOUNT_ID__c(java.lang.String concurforce__ACCOUNT_ID__c) {
        this.concurforce__ACCOUNT_ID__c = concurforce__ACCOUNT_ID__c;
    }


    /**
     * Gets the concurforce__ACCOUNT_ID__r value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return concurforce__ACCOUNT_ID__r
     */
    public com.sforce.soap.enterprise.sobject.Account getConcurforce__ACCOUNT_ID__r() {
        return concurforce__ACCOUNT_ID__r;
    }


    /**
     * Sets the concurforce__ACCOUNT_ID__r value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param concurforce__ACCOUNT_ID__r
     */
    public void setConcurforce__ACCOUNT_ID__r(com.sforce.soap.enterprise.sobject.Account concurforce__ACCOUNT_ID__r) {
        this.concurforce__ACCOUNT_ID__r = concurforce__ACCOUNT_ID__r;
    }


    /**
     * Gets the concurforce__APPROVED_AMOUNT__c value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return concurforce__APPROVED_AMOUNT__c
     */
    public java.lang.Double getConcurforce__APPROVED_AMOUNT__c() {
        return concurforce__APPROVED_AMOUNT__c;
    }


    /**
     * Sets the concurforce__APPROVED_AMOUNT__c value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param concurforce__APPROVED_AMOUNT__c
     */
    public void setConcurforce__APPROVED_AMOUNT__c(java.lang.Double concurforce__APPROVED_AMOUNT__c) {
        this.concurforce__APPROVED_AMOUNT__c = concurforce__APPROVED_AMOUNT__c;
    }


    /**
     * Gets the concurforce__Allocations__r value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return concurforce__Allocations__r
     */
    public com.sforce.soap.enterprise.QueryResult getConcurforce__Allocations__r() {
        return concurforce__Allocations__r;
    }


    /**
     * Sets the concurforce__Allocations__r value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param concurforce__Allocations__r
     */
    public void setConcurforce__Allocations__r(com.sforce.soap.enterprise.QueryResult concurforce__Allocations__r) {
        this.concurforce__Allocations__r = concurforce__Allocations__r;
    }


    /**
     * Gets the concurforce__Attendee__r value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return concurforce__Attendee__r
     */
    public com.sforce.soap.enterprise.QueryResult getConcurforce__Attendee__r() {
        return concurforce__Attendee__r;
    }


    /**
     * Sets the concurforce__Attendee__r value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param concurforce__Attendee__r
     */
    public void setConcurforce__Attendee__r(com.sforce.soap.enterprise.QueryResult concurforce__Attendee__r) {
        this.concurforce__Attendee__r = concurforce__Attendee__r;
    }


    /**
     * Gets the concurforce__CLAIMED_AMOUNT__c value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return concurforce__CLAIMED_AMOUNT__c
     */
    public java.lang.Double getConcurforce__CLAIMED_AMOUNT__c() {
        return concurforce__CLAIMED_AMOUNT__c;
    }


    /**
     * Sets the concurforce__CLAIMED_AMOUNT__c value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param concurforce__CLAIMED_AMOUNT__c
     */
    public void setConcurforce__CLAIMED_AMOUNT__c(java.lang.Double concurforce__CLAIMED_AMOUNT__c) {
        this.concurforce__CLAIMED_AMOUNT__c = concurforce__CLAIMED_AMOUNT__c;
    }


    /**
     * Gets the concurforce__CRN_ALPHA_CODE__c value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return concurforce__CRN_ALPHA_CODE__c
     */
    public java.lang.String getConcurforce__CRN_ALPHA_CODE__c() {
        return concurforce__CRN_ALPHA_CODE__c;
    }


    /**
     * Sets the concurforce__CRN_ALPHA_CODE__c value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param concurforce__CRN_ALPHA_CODE__c
     */
    public void setConcurforce__CRN_ALPHA_CODE__c(java.lang.String concurforce__CRN_ALPHA_CODE__c) {
        this.concurforce__CRN_ALPHA_CODE__c = concurforce__CRN_ALPHA_CODE__c;
    }


    /**
     * Gets the concurforce__EXP_KEY__c value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return concurforce__EXP_KEY__c
     */
    public java.lang.String getConcurforce__EXP_KEY__c() {
        return concurforce__EXP_KEY__c;
    }


    /**
     * Sets the concurforce__EXP_KEY__c value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param concurforce__EXP_KEY__c
     */
    public void setConcurforce__EXP_KEY__c(java.lang.String concurforce__EXP_KEY__c) {
        this.concurforce__EXP_KEY__c = concurforce__EXP_KEY__c;
    }


    /**
     * Gets the concurforce__EXP_KEY__r value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return concurforce__EXP_KEY__r
     */
    public com.sforce.soap.enterprise.sobject.Concurforce__CT_EXPENSE_TYPE__c getConcurforce__EXP_KEY__r() {
        return concurforce__EXP_KEY__r;
    }


    /**
     * Sets the concurforce__EXP_KEY__r value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param concurforce__EXP_KEY__r
     */
    public void setConcurforce__EXP_KEY__r(com.sforce.soap.enterprise.sobject.Concurforce__CT_EXPENSE_TYPE__c concurforce__EXP_KEY__r) {
        this.concurforce__EXP_KEY__r = concurforce__EXP_KEY__r;
    }


    /**
     * Gets the concurforce__OPPORTUNITY_ID__c value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return concurforce__OPPORTUNITY_ID__c
     */
    public java.lang.String getConcurforce__OPPORTUNITY_ID__c() {
        return concurforce__OPPORTUNITY_ID__c;
    }


    /**
     * Sets the concurforce__OPPORTUNITY_ID__c value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param concurforce__OPPORTUNITY_ID__c
     */
    public void setConcurforce__OPPORTUNITY_ID__c(java.lang.String concurforce__OPPORTUNITY_ID__c) {
        this.concurforce__OPPORTUNITY_ID__c = concurforce__OPPORTUNITY_ID__c;
    }


    /**
     * Gets the concurforce__OPPORTUNITY_ID__r value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return concurforce__OPPORTUNITY_ID__r
     */
    public com.sforce.soap.enterprise.sobject.Opportunity getConcurforce__OPPORTUNITY_ID__r() {
        return concurforce__OPPORTUNITY_ID__r;
    }


    /**
     * Sets the concurforce__OPPORTUNITY_ID__r value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param concurforce__OPPORTUNITY_ID__r
     */
    public void setConcurforce__OPPORTUNITY_ID__r(com.sforce.soap.enterprise.sobject.Opportunity concurforce__OPPORTUNITY_ID__r) {
        this.concurforce__OPPORTUNITY_ID__r = concurforce__OPPORTUNITY_ID__r;
    }


    /**
     * Gets the concurforce__PAID_AMOUNT__c value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return concurforce__PAID_AMOUNT__c
     */
    public java.lang.Double getConcurforce__PAID_AMOUNT__c() {
        return concurforce__PAID_AMOUNT__c;
    }


    /**
     * Sets the concurforce__PAID_AMOUNT__c value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param concurforce__PAID_AMOUNT__c
     */
    public void setConcurforce__PAID_AMOUNT__c(java.lang.Double concurforce__PAID_AMOUNT__c) {
        this.concurforce__PAID_AMOUNT__c = concurforce__PAID_AMOUNT__c;
    }


    /**
     * Gets the concurforce__PAY_KEY__c value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return concurforce__PAY_KEY__c
     */
    public java.lang.String getConcurforce__PAY_KEY__c() {
        return concurforce__PAY_KEY__c;
    }


    /**
     * Sets the concurforce__PAY_KEY__c value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param concurforce__PAY_KEY__c
     */
    public void setConcurforce__PAY_KEY__c(java.lang.String concurforce__PAY_KEY__c) {
        this.concurforce__PAY_KEY__c = concurforce__PAY_KEY__c;
    }


    /**
     * Gets the concurforce__RPE_SYNC_GUID__c value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return concurforce__RPE_SYNC_GUID__c
     */
    public java.lang.String getConcurforce__RPE_SYNC_GUID__c() {
        return concurforce__RPE_SYNC_GUID__c;
    }


    /**
     * Sets the concurforce__RPE_SYNC_GUID__c value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param concurforce__RPE_SYNC_GUID__c
     */
    public void setConcurforce__RPE_SYNC_GUID__c(java.lang.String concurforce__RPE_SYNC_GUID__c) {
        this.concurforce__RPE_SYNC_GUID__c = concurforce__RPE_SYNC_GUID__c;
    }


    /**
     * Gets the concurforce__SF_RPT_KEY__c value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return concurforce__SF_RPT_KEY__c
     */
    public java.lang.String getConcurforce__SF_RPT_KEY__c() {
        return concurforce__SF_RPT_KEY__c;
    }


    /**
     * Sets the concurforce__SF_RPT_KEY__c value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param concurforce__SF_RPT_KEY__c
     */
    public void setConcurforce__SF_RPT_KEY__c(java.lang.String concurforce__SF_RPT_KEY__c) {
        this.concurforce__SF_RPT_KEY__c = concurforce__SF_RPT_KEY__c;
    }


    /**
     * Gets the concurforce__SF_RPT_KEY__r value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return concurforce__SF_RPT_KEY__r
     */
    public com.sforce.soap.enterprise.sobject.Concurforce__CT_REPORT_BATCH__c getConcurforce__SF_RPT_KEY__r() {
        return concurforce__SF_RPT_KEY__r;
    }


    /**
     * Sets the concurforce__SF_RPT_KEY__r value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param concurforce__SF_RPT_KEY__r
     */
    public void setConcurforce__SF_RPT_KEY__r(com.sforce.soap.enterprise.sobject.Concurforce__CT_REPORT_BATCH__c concurforce__SF_RPT_KEY__r) {
        this.concurforce__SF_RPT_KEY__r = concurforce__SF_RPT_KEY__r;
    }


    /**
     * Gets the concurforce__SPD_CAT__c value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return concurforce__SPD_CAT__c
     */
    public java.lang.String getConcurforce__SPD_CAT__c() {
        return concurforce__SPD_CAT__c;
    }


    /**
     * Sets the concurforce__SPD_CAT__c value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param concurforce__SPD_CAT__c
     */
    public void setConcurforce__SPD_CAT__c(java.lang.String concurforce__SPD_CAT__c) {
        this.concurforce__SPD_CAT__c = concurforce__SPD_CAT__c;
    }


    /**
     * Gets the concurforce__SPD_CAT__r value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return concurforce__SPD_CAT__r
     */
    public com.sforce.soap.enterprise.sobject.Concurforce__CT_SPEND_CATEGORY__c getConcurforce__SPD_CAT__r() {
        return concurforce__SPD_CAT__r;
    }


    /**
     * Sets the concurforce__SPD_CAT__r value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param concurforce__SPD_CAT__r
     */
    public void setConcurforce__SPD_CAT__r(com.sforce.soap.enterprise.sobject.Concurforce__CT_SPEND_CATEGORY__c concurforce__SPD_CAT__r) {
        this.concurforce__SPD_CAT__r = concurforce__SPD_CAT__r;
    }


    /**
     * Gets the concurforce__TRANSACTION_DATE__c value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return concurforce__TRANSACTION_DATE__c
     */
    public java.util.Date getConcurforce__TRANSACTION_DATE__c() {
        return concurforce__TRANSACTION_DATE__c;
    }


    /**
     * Sets the concurforce__TRANSACTION_DATE__c value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param concurforce__TRANSACTION_DATE__c
     */
    public void setConcurforce__TRANSACTION_DATE__c(java.util.Date concurforce__TRANSACTION_DATE__c) {
        this.concurforce__TRANSACTION_DATE__c = concurforce__TRANSACTION_DATE__c;
    }


    /**
     * Gets the concurforce__UNPAID_AMOUNT__c value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return concurforce__UNPAID_AMOUNT__c
     */
    public java.lang.Double getConcurforce__UNPAID_AMOUNT__c() {
        return concurforce__UNPAID_AMOUNT__c;
    }


    /**
     * Sets the concurforce__UNPAID_AMOUNT__c value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param concurforce__UNPAID_AMOUNT__c
     */
    public void setConcurforce__UNPAID_AMOUNT__c(java.lang.Double concurforce__UNPAID_AMOUNT__c) {
        this.concurforce__UNPAID_AMOUNT__c = concurforce__UNPAID_AMOUNT__c;
    }


    /**
     * Gets the createdBy value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the events value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the histories value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the isDeleted value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastActivityDate value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the openActivities value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the processInstances value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the systemModstamp value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Concurforce__CT_EXPENSE_SUMMARY__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Concurforce__CT_EXPENSE_SUMMARY__c)) return false;
        Concurforce__CT_EXPENSE_SUMMARY__c other = (Concurforce__CT_EXPENSE_SUMMARY__c) obj;
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
            ((this.concurforce__ACCOUNT_ID__c==null && other.getConcurforce__ACCOUNT_ID__c()==null) || 
             (this.concurforce__ACCOUNT_ID__c!=null &&
              this.concurforce__ACCOUNT_ID__c.equals(other.getConcurforce__ACCOUNT_ID__c()))) &&
            ((this.concurforce__ACCOUNT_ID__r==null && other.getConcurforce__ACCOUNT_ID__r()==null) || 
             (this.concurforce__ACCOUNT_ID__r!=null &&
              this.concurforce__ACCOUNT_ID__r.equals(other.getConcurforce__ACCOUNT_ID__r()))) &&
            ((this.concurforce__APPROVED_AMOUNT__c==null && other.getConcurforce__APPROVED_AMOUNT__c()==null) || 
             (this.concurforce__APPROVED_AMOUNT__c!=null &&
              this.concurforce__APPROVED_AMOUNT__c.equals(other.getConcurforce__APPROVED_AMOUNT__c()))) &&
            ((this.concurforce__Allocations__r==null && other.getConcurforce__Allocations__r()==null) || 
             (this.concurforce__Allocations__r!=null &&
              this.concurforce__Allocations__r.equals(other.getConcurforce__Allocations__r()))) &&
            ((this.concurforce__Attendee__r==null && other.getConcurforce__Attendee__r()==null) || 
             (this.concurforce__Attendee__r!=null &&
              this.concurforce__Attendee__r.equals(other.getConcurforce__Attendee__r()))) &&
            ((this.concurforce__CLAIMED_AMOUNT__c==null && other.getConcurforce__CLAIMED_AMOUNT__c()==null) || 
             (this.concurforce__CLAIMED_AMOUNT__c!=null &&
              this.concurforce__CLAIMED_AMOUNT__c.equals(other.getConcurforce__CLAIMED_AMOUNT__c()))) &&
            ((this.concurforce__CRN_ALPHA_CODE__c==null && other.getConcurforce__CRN_ALPHA_CODE__c()==null) || 
             (this.concurforce__CRN_ALPHA_CODE__c!=null &&
              this.concurforce__CRN_ALPHA_CODE__c.equals(other.getConcurforce__CRN_ALPHA_CODE__c()))) &&
            ((this.concurforce__EXP_KEY__c==null && other.getConcurforce__EXP_KEY__c()==null) || 
             (this.concurforce__EXP_KEY__c!=null &&
              this.concurforce__EXP_KEY__c.equals(other.getConcurforce__EXP_KEY__c()))) &&
            ((this.concurforce__EXP_KEY__r==null && other.getConcurforce__EXP_KEY__r()==null) || 
             (this.concurforce__EXP_KEY__r!=null &&
              this.concurforce__EXP_KEY__r.equals(other.getConcurforce__EXP_KEY__r()))) &&
            ((this.concurforce__OPPORTUNITY_ID__c==null && other.getConcurforce__OPPORTUNITY_ID__c()==null) || 
             (this.concurforce__OPPORTUNITY_ID__c!=null &&
              this.concurforce__OPPORTUNITY_ID__c.equals(other.getConcurforce__OPPORTUNITY_ID__c()))) &&
            ((this.concurforce__OPPORTUNITY_ID__r==null && other.getConcurforce__OPPORTUNITY_ID__r()==null) || 
             (this.concurforce__OPPORTUNITY_ID__r!=null &&
              this.concurforce__OPPORTUNITY_ID__r.equals(other.getConcurforce__OPPORTUNITY_ID__r()))) &&
            ((this.concurforce__PAID_AMOUNT__c==null && other.getConcurforce__PAID_AMOUNT__c()==null) || 
             (this.concurforce__PAID_AMOUNT__c!=null &&
              this.concurforce__PAID_AMOUNT__c.equals(other.getConcurforce__PAID_AMOUNT__c()))) &&
            ((this.concurforce__PAY_KEY__c==null && other.getConcurforce__PAY_KEY__c()==null) || 
             (this.concurforce__PAY_KEY__c!=null &&
              this.concurforce__PAY_KEY__c.equals(other.getConcurforce__PAY_KEY__c()))) &&
            ((this.concurforce__RPE_SYNC_GUID__c==null && other.getConcurforce__RPE_SYNC_GUID__c()==null) || 
             (this.concurforce__RPE_SYNC_GUID__c!=null &&
              this.concurforce__RPE_SYNC_GUID__c.equals(other.getConcurforce__RPE_SYNC_GUID__c()))) &&
            ((this.concurforce__SF_RPT_KEY__c==null && other.getConcurforce__SF_RPT_KEY__c()==null) || 
             (this.concurforce__SF_RPT_KEY__c!=null &&
              this.concurforce__SF_RPT_KEY__c.equals(other.getConcurforce__SF_RPT_KEY__c()))) &&
            ((this.concurforce__SF_RPT_KEY__r==null && other.getConcurforce__SF_RPT_KEY__r()==null) || 
             (this.concurforce__SF_RPT_KEY__r!=null &&
              this.concurforce__SF_RPT_KEY__r.equals(other.getConcurforce__SF_RPT_KEY__r()))) &&
            ((this.concurforce__SPD_CAT__c==null && other.getConcurforce__SPD_CAT__c()==null) || 
             (this.concurforce__SPD_CAT__c!=null &&
              this.concurforce__SPD_CAT__c.equals(other.getConcurforce__SPD_CAT__c()))) &&
            ((this.concurforce__SPD_CAT__r==null && other.getConcurforce__SPD_CAT__r()==null) || 
             (this.concurforce__SPD_CAT__r!=null &&
              this.concurforce__SPD_CAT__r.equals(other.getConcurforce__SPD_CAT__r()))) &&
            ((this.concurforce__TRANSACTION_DATE__c==null && other.getConcurforce__TRANSACTION_DATE__c()==null) || 
             (this.concurforce__TRANSACTION_DATE__c!=null &&
              this.concurforce__TRANSACTION_DATE__c.equals(other.getConcurforce__TRANSACTION_DATE__c()))) &&
            ((this.concurforce__UNPAID_AMOUNT__c==null && other.getConcurforce__UNPAID_AMOUNT__c()==null) || 
             (this.concurforce__UNPAID_AMOUNT__c!=null &&
              this.concurforce__UNPAID_AMOUNT__c.equals(other.getConcurforce__UNPAID_AMOUNT__c()))) &&
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
        if (getConcurforce__ACCOUNT_ID__c() != null) {
            _hashCode += getConcurforce__ACCOUNT_ID__c().hashCode();
        }
        if (getConcurforce__ACCOUNT_ID__r() != null) {
            _hashCode += getConcurforce__ACCOUNT_ID__r().hashCode();
        }
        if (getConcurforce__APPROVED_AMOUNT__c() != null) {
            _hashCode += getConcurforce__APPROVED_AMOUNT__c().hashCode();
        }
        if (getConcurforce__Allocations__r() != null) {
            _hashCode += getConcurforce__Allocations__r().hashCode();
        }
        if (getConcurforce__Attendee__r() != null) {
            _hashCode += getConcurforce__Attendee__r().hashCode();
        }
        if (getConcurforce__CLAIMED_AMOUNT__c() != null) {
            _hashCode += getConcurforce__CLAIMED_AMOUNT__c().hashCode();
        }
        if (getConcurforce__CRN_ALPHA_CODE__c() != null) {
            _hashCode += getConcurforce__CRN_ALPHA_CODE__c().hashCode();
        }
        if (getConcurforce__EXP_KEY__c() != null) {
            _hashCode += getConcurforce__EXP_KEY__c().hashCode();
        }
        if (getConcurforce__EXP_KEY__r() != null) {
            _hashCode += getConcurforce__EXP_KEY__r().hashCode();
        }
        if (getConcurforce__OPPORTUNITY_ID__c() != null) {
            _hashCode += getConcurforce__OPPORTUNITY_ID__c().hashCode();
        }
        if (getConcurforce__OPPORTUNITY_ID__r() != null) {
            _hashCode += getConcurforce__OPPORTUNITY_ID__r().hashCode();
        }
        if (getConcurforce__PAID_AMOUNT__c() != null) {
            _hashCode += getConcurforce__PAID_AMOUNT__c().hashCode();
        }
        if (getConcurforce__PAY_KEY__c() != null) {
            _hashCode += getConcurforce__PAY_KEY__c().hashCode();
        }
        if (getConcurforce__RPE_SYNC_GUID__c() != null) {
            _hashCode += getConcurforce__RPE_SYNC_GUID__c().hashCode();
        }
        if (getConcurforce__SF_RPT_KEY__c() != null) {
            _hashCode += getConcurforce__SF_RPT_KEY__c().hashCode();
        }
        if (getConcurforce__SF_RPT_KEY__r() != null) {
            _hashCode += getConcurforce__SF_RPT_KEY__r().hashCode();
        }
        if (getConcurforce__SPD_CAT__c() != null) {
            _hashCode += getConcurforce__SPD_CAT__c().hashCode();
        }
        if (getConcurforce__SPD_CAT__r() != null) {
            _hashCode += getConcurforce__SPD_CAT__r().hashCode();
        }
        if (getConcurforce__TRANSACTION_DATE__c() != null) {
            _hashCode += getConcurforce__TRANSACTION_DATE__c().hashCode();
        }
        if (getConcurforce__UNPAID_AMOUNT__c() != null) {
            _hashCode += getConcurforce__UNPAID_AMOUNT__c().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Concurforce__CT_EXPENSE_SUMMARY__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__CT_EXPENSE_SUMMARY__c"));
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
        elemField.setFieldName("concurforce__ACCOUNT_ID__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__ACCOUNT_ID__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__ACCOUNT_ID__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__ACCOUNT_ID__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__APPROVED_AMOUNT__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__APPROVED_AMOUNT__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__Allocations__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__Allocations__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__Attendee__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__Attendee__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__CLAIMED_AMOUNT__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__CLAIMED_AMOUNT__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__CRN_ALPHA_CODE__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__CRN_ALPHA_CODE__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__EXP_KEY__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__EXP_KEY__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__EXP_KEY__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__EXP_KEY__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__CT_EXPENSE_TYPE__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__OPPORTUNITY_ID__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__OPPORTUNITY_ID__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__OPPORTUNITY_ID__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__OPPORTUNITY_ID__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Opportunity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__PAID_AMOUNT__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__PAID_AMOUNT__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("concurforce__RPE_SYNC_GUID__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__RPE_SYNC_GUID__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__SF_RPT_KEY__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__SF_RPT_KEY__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__SF_RPT_KEY__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__SF_RPT_KEY__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__CT_REPORT_BATCH__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__SPD_CAT__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__SPD_CAT__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__SPD_CAT__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__SPD_CAT__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__CT_SPEND_CATEGORY__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__TRANSACTION_DATE__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__TRANSACTION_DATE__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__UNPAID_AMOUNT__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__UNPAID_AMOUNT__c"));
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

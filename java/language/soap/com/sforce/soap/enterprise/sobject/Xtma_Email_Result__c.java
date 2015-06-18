/**
 * Xtma_Email_Result__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Xtma_Email_Result__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.Double bounce_Rate__c;

    private java.lang.String campaign__c;

    private com.sforce.soap.enterprise.sobject.Campaign campaign__r;

    private java.lang.Double click_Through_Rate__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.util.Calendar date_Sent__c;

    private java.lang.Double deliverability_Rate__c;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.lang.String from_Address__c;

    private java.lang.String from_Name__c;

    private java.lang.Double invalid_Addresses__c;

    private java.lang.Boolean isDeleted;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private java.lang.Double number_Bounced__c;

    private java.lang.Double number_Delivered__c;

    private java.lang.Double number_Not_Opened__c;

    private java.lang.Double number_Sent__c;

    private java.lang.Double number_Unsubscribed__c;

    private java.lang.Double number_of_Contacts__c;

    private java.lang.Double number_of_Existing_Undeliverables__c;

    private java.lang.Double number_of_Existing_Unsubscribes__c;

    private java.lang.Double number_of_Hard_Bounces__c;

    private java.lang.Double number_of_Leads__c;

    private java.lang.Double number_of_Soft_Bounces__c;

    private java.lang.Double number_of_Subscribers_Forwarding_Email__c;

    private java.lang.Double number_of_Unique_Clicks__c;

    private java.lang.Double number_of_Unique_Opens__c;

    private java.lang.Double open_Rate__c;

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.Double records_without_Addresses__c;

    private java.lang.String report_Name__c;

    private java.lang.String subject__c;

    private java.util.Calendar systemModstamp;

    private java.lang.Double total_Number_of_Records__c;

    private java.lang.Double unsubscribe_Rate__c;

    public Xtma_Email_Result__c() {
    }

    public Xtma_Email_Result__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.Double bounce_Rate__c,
           java.lang.String campaign__c,
           com.sforce.soap.enterprise.sobject.Campaign campaign__r,
           java.lang.Double click_Through_Rate__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.util.Calendar date_Sent__c,
           java.lang.Double deliverability_Rate__c,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.lang.String from_Address__c,
           java.lang.String from_Name__c,
           java.lang.Double invalid_Addresses__c,
           java.lang.Boolean isDeleted,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           java.lang.Double number_Bounced__c,
           java.lang.Double number_Delivered__c,
           java.lang.Double number_Not_Opened__c,
           java.lang.Double number_Sent__c,
           java.lang.Double number_Unsubscribed__c,
           java.lang.Double number_of_Contacts__c,
           java.lang.Double number_of_Existing_Undeliverables__c,
           java.lang.Double number_of_Existing_Unsubscribes__c,
           java.lang.Double number_of_Hard_Bounces__c,
           java.lang.Double number_of_Leads__c,
           java.lang.Double number_of_Soft_Bounces__c,
           java.lang.Double number_of_Subscribers_Forwarding_Email__c,
           java.lang.Double number_of_Unique_Clicks__c,
           java.lang.Double number_of_Unique_Opens__c,
           java.lang.Double open_Rate__c,
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.Double records_without_Addresses__c,
           java.lang.String report_Name__c,
           java.lang.String subject__c,
           java.util.Calendar systemModstamp,
           java.lang.Double total_Number_of_Records__c,
           java.lang.Double unsubscribe_Rate__c) {
        super(
            fieldsToNull,
            id);
        this.attachments = attachments;
        this.bounce_Rate__c = bounce_Rate__c;
        this.campaign__c = campaign__c;
        this.campaign__r = campaign__r;
        this.click_Through_Rate__c = click_Through_Rate__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.date_Sent__c = date_Sent__c;
        this.deliverability_Rate__c = deliverability_Rate__c;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.from_Address__c = from_Address__c;
        this.from_Name__c = from_Name__c;
        this.invalid_Addresses__c = invalid_Addresses__c;
        this.isDeleted = isDeleted;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.number_Bounced__c = number_Bounced__c;
        this.number_Delivered__c = number_Delivered__c;
        this.number_Not_Opened__c = number_Not_Opened__c;
        this.number_Sent__c = number_Sent__c;
        this.number_Unsubscribed__c = number_Unsubscribed__c;
        this.number_of_Contacts__c = number_of_Contacts__c;
        this.number_of_Existing_Undeliverables__c = number_of_Existing_Undeliverables__c;
        this.number_of_Existing_Unsubscribes__c = number_of_Existing_Unsubscribes__c;
        this.number_of_Hard_Bounces__c = number_of_Hard_Bounces__c;
        this.number_of_Leads__c = number_of_Leads__c;
        this.number_of_Soft_Bounces__c = number_of_Soft_Bounces__c;
        this.number_of_Subscribers_Forwarding_Email__c = number_of_Subscribers_Forwarding_Email__c;
        this.number_of_Unique_Clicks__c = number_of_Unique_Clicks__c;
        this.number_of_Unique_Opens__c = number_of_Unique_Opens__c;
        this.open_Rate__c = open_Rate__c;
        this.owner = owner;
        this.ownerId = ownerId;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.records_without_Addresses__c = records_without_Addresses__c;
        this.report_Name__c = report_Name__c;
        this.subject__c = subject__c;
        this.systemModstamp = systemModstamp;
        this.total_Number_of_Records__c = total_Number_of_Records__c;
        this.unsubscribe_Rate__c = unsubscribe_Rate__c;
    }


    /**
     * Gets the attachments value for this Xtma_Email_Result__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Xtma_Email_Result__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the bounce_Rate__c value for this Xtma_Email_Result__c.
     * 
     * @return bounce_Rate__c
     */
    public java.lang.Double getBounce_Rate__c() {
        return bounce_Rate__c;
    }


    /**
     * Sets the bounce_Rate__c value for this Xtma_Email_Result__c.
     * 
     * @param bounce_Rate__c
     */
    public void setBounce_Rate__c(java.lang.Double bounce_Rate__c) {
        this.bounce_Rate__c = bounce_Rate__c;
    }


    /**
     * Gets the campaign__c value for this Xtma_Email_Result__c.
     * 
     * @return campaign__c
     */
    public java.lang.String getCampaign__c() {
        return campaign__c;
    }


    /**
     * Sets the campaign__c value for this Xtma_Email_Result__c.
     * 
     * @param campaign__c
     */
    public void setCampaign__c(java.lang.String campaign__c) {
        this.campaign__c = campaign__c;
    }


    /**
     * Gets the campaign__r value for this Xtma_Email_Result__c.
     * 
     * @return campaign__r
     */
    public com.sforce.soap.enterprise.sobject.Campaign getCampaign__r() {
        return campaign__r;
    }


    /**
     * Sets the campaign__r value for this Xtma_Email_Result__c.
     * 
     * @param campaign__r
     */
    public void setCampaign__r(com.sforce.soap.enterprise.sobject.Campaign campaign__r) {
        this.campaign__r = campaign__r;
    }


    /**
     * Gets the click_Through_Rate__c value for this Xtma_Email_Result__c.
     * 
     * @return click_Through_Rate__c
     */
    public java.lang.Double getClick_Through_Rate__c() {
        return click_Through_Rate__c;
    }


    /**
     * Sets the click_Through_Rate__c value for this Xtma_Email_Result__c.
     * 
     * @param click_Through_Rate__c
     */
    public void setClick_Through_Rate__c(java.lang.Double click_Through_Rate__c) {
        this.click_Through_Rate__c = click_Through_Rate__c;
    }


    /**
     * Gets the createdBy value for this Xtma_Email_Result__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Xtma_Email_Result__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Xtma_Email_Result__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Xtma_Email_Result__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Xtma_Email_Result__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Xtma_Email_Result__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the date_Sent__c value for this Xtma_Email_Result__c.
     * 
     * @return date_Sent__c
     */
    public java.util.Calendar getDate_Sent__c() {
        return date_Sent__c;
    }


    /**
     * Sets the date_Sent__c value for this Xtma_Email_Result__c.
     * 
     * @param date_Sent__c
     */
    public void setDate_Sent__c(java.util.Calendar date_Sent__c) {
        this.date_Sent__c = date_Sent__c;
    }


    /**
     * Gets the deliverability_Rate__c value for this Xtma_Email_Result__c.
     * 
     * @return deliverability_Rate__c
     */
    public java.lang.Double getDeliverability_Rate__c() {
        return deliverability_Rate__c;
    }


    /**
     * Sets the deliverability_Rate__c value for this Xtma_Email_Result__c.
     * 
     * @param deliverability_Rate__c
     */
    public void setDeliverability_Rate__c(java.lang.Double deliverability_Rate__c) {
        this.deliverability_Rate__c = deliverability_Rate__c;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Xtma_Email_Result__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Xtma_Email_Result__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the from_Address__c value for this Xtma_Email_Result__c.
     * 
     * @return from_Address__c
     */
    public java.lang.String getFrom_Address__c() {
        return from_Address__c;
    }


    /**
     * Sets the from_Address__c value for this Xtma_Email_Result__c.
     * 
     * @param from_Address__c
     */
    public void setFrom_Address__c(java.lang.String from_Address__c) {
        this.from_Address__c = from_Address__c;
    }


    /**
     * Gets the from_Name__c value for this Xtma_Email_Result__c.
     * 
     * @return from_Name__c
     */
    public java.lang.String getFrom_Name__c() {
        return from_Name__c;
    }


    /**
     * Sets the from_Name__c value for this Xtma_Email_Result__c.
     * 
     * @param from_Name__c
     */
    public void setFrom_Name__c(java.lang.String from_Name__c) {
        this.from_Name__c = from_Name__c;
    }


    /**
     * Gets the invalid_Addresses__c value for this Xtma_Email_Result__c.
     * 
     * @return invalid_Addresses__c
     */
    public java.lang.Double getInvalid_Addresses__c() {
        return invalid_Addresses__c;
    }


    /**
     * Sets the invalid_Addresses__c value for this Xtma_Email_Result__c.
     * 
     * @param invalid_Addresses__c
     */
    public void setInvalid_Addresses__c(java.lang.Double invalid_Addresses__c) {
        this.invalid_Addresses__c = invalid_Addresses__c;
    }


    /**
     * Gets the isDeleted value for this Xtma_Email_Result__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Xtma_Email_Result__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this Xtma_Email_Result__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Xtma_Email_Result__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Xtma_Email_Result__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Xtma_Email_Result__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Xtma_Email_Result__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Xtma_Email_Result__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this Xtma_Email_Result__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Xtma_Email_Result__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Xtma_Email_Result__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Xtma_Email_Result__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Xtma_Email_Result__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Xtma_Email_Result__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the number_Bounced__c value for this Xtma_Email_Result__c.
     * 
     * @return number_Bounced__c
     */
    public java.lang.Double getNumber_Bounced__c() {
        return number_Bounced__c;
    }


    /**
     * Sets the number_Bounced__c value for this Xtma_Email_Result__c.
     * 
     * @param number_Bounced__c
     */
    public void setNumber_Bounced__c(java.lang.Double number_Bounced__c) {
        this.number_Bounced__c = number_Bounced__c;
    }


    /**
     * Gets the number_Delivered__c value for this Xtma_Email_Result__c.
     * 
     * @return number_Delivered__c
     */
    public java.lang.Double getNumber_Delivered__c() {
        return number_Delivered__c;
    }


    /**
     * Sets the number_Delivered__c value for this Xtma_Email_Result__c.
     * 
     * @param number_Delivered__c
     */
    public void setNumber_Delivered__c(java.lang.Double number_Delivered__c) {
        this.number_Delivered__c = number_Delivered__c;
    }


    /**
     * Gets the number_Not_Opened__c value for this Xtma_Email_Result__c.
     * 
     * @return number_Not_Opened__c
     */
    public java.lang.Double getNumber_Not_Opened__c() {
        return number_Not_Opened__c;
    }


    /**
     * Sets the number_Not_Opened__c value for this Xtma_Email_Result__c.
     * 
     * @param number_Not_Opened__c
     */
    public void setNumber_Not_Opened__c(java.lang.Double number_Not_Opened__c) {
        this.number_Not_Opened__c = number_Not_Opened__c;
    }


    /**
     * Gets the number_Sent__c value for this Xtma_Email_Result__c.
     * 
     * @return number_Sent__c
     */
    public java.lang.Double getNumber_Sent__c() {
        return number_Sent__c;
    }


    /**
     * Sets the number_Sent__c value for this Xtma_Email_Result__c.
     * 
     * @param number_Sent__c
     */
    public void setNumber_Sent__c(java.lang.Double number_Sent__c) {
        this.number_Sent__c = number_Sent__c;
    }


    /**
     * Gets the number_Unsubscribed__c value for this Xtma_Email_Result__c.
     * 
     * @return number_Unsubscribed__c
     */
    public java.lang.Double getNumber_Unsubscribed__c() {
        return number_Unsubscribed__c;
    }


    /**
     * Sets the number_Unsubscribed__c value for this Xtma_Email_Result__c.
     * 
     * @param number_Unsubscribed__c
     */
    public void setNumber_Unsubscribed__c(java.lang.Double number_Unsubscribed__c) {
        this.number_Unsubscribed__c = number_Unsubscribed__c;
    }


    /**
     * Gets the number_of_Contacts__c value for this Xtma_Email_Result__c.
     * 
     * @return number_of_Contacts__c
     */
    public java.lang.Double getNumber_of_Contacts__c() {
        return number_of_Contacts__c;
    }


    /**
     * Sets the number_of_Contacts__c value for this Xtma_Email_Result__c.
     * 
     * @param number_of_Contacts__c
     */
    public void setNumber_of_Contacts__c(java.lang.Double number_of_Contacts__c) {
        this.number_of_Contacts__c = number_of_Contacts__c;
    }


    /**
     * Gets the number_of_Existing_Undeliverables__c value for this Xtma_Email_Result__c.
     * 
     * @return number_of_Existing_Undeliverables__c
     */
    public java.lang.Double getNumber_of_Existing_Undeliverables__c() {
        return number_of_Existing_Undeliverables__c;
    }


    /**
     * Sets the number_of_Existing_Undeliverables__c value for this Xtma_Email_Result__c.
     * 
     * @param number_of_Existing_Undeliverables__c
     */
    public void setNumber_of_Existing_Undeliverables__c(java.lang.Double number_of_Existing_Undeliverables__c) {
        this.number_of_Existing_Undeliverables__c = number_of_Existing_Undeliverables__c;
    }


    /**
     * Gets the number_of_Existing_Unsubscribes__c value for this Xtma_Email_Result__c.
     * 
     * @return number_of_Existing_Unsubscribes__c
     */
    public java.lang.Double getNumber_of_Existing_Unsubscribes__c() {
        return number_of_Existing_Unsubscribes__c;
    }


    /**
     * Sets the number_of_Existing_Unsubscribes__c value for this Xtma_Email_Result__c.
     * 
     * @param number_of_Existing_Unsubscribes__c
     */
    public void setNumber_of_Existing_Unsubscribes__c(java.lang.Double number_of_Existing_Unsubscribes__c) {
        this.number_of_Existing_Unsubscribes__c = number_of_Existing_Unsubscribes__c;
    }


    /**
     * Gets the number_of_Hard_Bounces__c value for this Xtma_Email_Result__c.
     * 
     * @return number_of_Hard_Bounces__c
     */
    public java.lang.Double getNumber_of_Hard_Bounces__c() {
        return number_of_Hard_Bounces__c;
    }


    /**
     * Sets the number_of_Hard_Bounces__c value for this Xtma_Email_Result__c.
     * 
     * @param number_of_Hard_Bounces__c
     */
    public void setNumber_of_Hard_Bounces__c(java.lang.Double number_of_Hard_Bounces__c) {
        this.number_of_Hard_Bounces__c = number_of_Hard_Bounces__c;
    }


    /**
     * Gets the number_of_Leads__c value for this Xtma_Email_Result__c.
     * 
     * @return number_of_Leads__c
     */
    public java.lang.Double getNumber_of_Leads__c() {
        return number_of_Leads__c;
    }


    /**
     * Sets the number_of_Leads__c value for this Xtma_Email_Result__c.
     * 
     * @param number_of_Leads__c
     */
    public void setNumber_of_Leads__c(java.lang.Double number_of_Leads__c) {
        this.number_of_Leads__c = number_of_Leads__c;
    }


    /**
     * Gets the number_of_Soft_Bounces__c value for this Xtma_Email_Result__c.
     * 
     * @return number_of_Soft_Bounces__c
     */
    public java.lang.Double getNumber_of_Soft_Bounces__c() {
        return number_of_Soft_Bounces__c;
    }


    /**
     * Sets the number_of_Soft_Bounces__c value for this Xtma_Email_Result__c.
     * 
     * @param number_of_Soft_Bounces__c
     */
    public void setNumber_of_Soft_Bounces__c(java.lang.Double number_of_Soft_Bounces__c) {
        this.number_of_Soft_Bounces__c = number_of_Soft_Bounces__c;
    }


    /**
     * Gets the number_of_Subscribers_Forwarding_Email__c value for this Xtma_Email_Result__c.
     * 
     * @return number_of_Subscribers_Forwarding_Email__c
     */
    public java.lang.Double getNumber_of_Subscribers_Forwarding_Email__c() {
        return number_of_Subscribers_Forwarding_Email__c;
    }


    /**
     * Sets the number_of_Subscribers_Forwarding_Email__c value for this Xtma_Email_Result__c.
     * 
     * @param number_of_Subscribers_Forwarding_Email__c
     */
    public void setNumber_of_Subscribers_Forwarding_Email__c(java.lang.Double number_of_Subscribers_Forwarding_Email__c) {
        this.number_of_Subscribers_Forwarding_Email__c = number_of_Subscribers_Forwarding_Email__c;
    }


    /**
     * Gets the number_of_Unique_Clicks__c value for this Xtma_Email_Result__c.
     * 
     * @return number_of_Unique_Clicks__c
     */
    public java.lang.Double getNumber_of_Unique_Clicks__c() {
        return number_of_Unique_Clicks__c;
    }


    /**
     * Sets the number_of_Unique_Clicks__c value for this Xtma_Email_Result__c.
     * 
     * @param number_of_Unique_Clicks__c
     */
    public void setNumber_of_Unique_Clicks__c(java.lang.Double number_of_Unique_Clicks__c) {
        this.number_of_Unique_Clicks__c = number_of_Unique_Clicks__c;
    }


    /**
     * Gets the number_of_Unique_Opens__c value for this Xtma_Email_Result__c.
     * 
     * @return number_of_Unique_Opens__c
     */
    public java.lang.Double getNumber_of_Unique_Opens__c() {
        return number_of_Unique_Opens__c;
    }


    /**
     * Sets the number_of_Unique_Opens__c value for this Xtma_Email_Result__c.
     * 
     * @param number_of_Unique_Opens__c
     */
    public void setNumber_of_Unique_Opens__c(java.lang.Double number_of_Unique_Opens__c) {
        this.number_of_Unique_Opens__c = number_of_Unique_Opens__c;
    }


    /**
     * Gets the open_Rate__c value for this Xtma_Email_Result__c.
     * 
     * @return open_Rate__c
     */
    public java.lang.Double getOpen_Rate__c() {
        return open_Rate__c;
    }


    /**
     * Sets the open_Rate__c value for this Xtma_Email_Result__c.
     * 
     * @param open_Rate__c
     */
    public void setOpen_Rate__c(java.lang.Double open_Rate__c) {
        this.open_Rate__c = open_Rate__c;
    }


    /**
     * Gets the owner value for this Xtma_Email_Result__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Xtma_Email_Result__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Xtma_Email_Result__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Xtma_Email_Result__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this Xtma_Email_Result__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Xtma_Email_Result__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Xtma_Email_Result__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Xtma_Email_Result__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the records_without_Addresses__c value for this Xtma_Email_Result__c.
     * 
     * @return records_without_Addresses__c
     */
    public java.lang.Double getRecords_without_Addresses__c() {
        return records_without_Addresses__c;
    }


    /**
     * Sets the records_without_Addresses__c value for this Xtma_Email_Result__c.
     * 
     * @param records_without_Addresses__c
     */
    public void setRecords_without_Addresses__c(java.lang.Double records_without_Addresses__c) {
        this.records_without_Addresses__c = records_without_Addresses__c;
    }


    /**
     * Gets the report_Name__c value for this Xtma_Email_Result__c.
     * 
     * @return report_Name__c
     */
    public java.lang.String getReport_Name__c() {
        return report_Name__c;
    }


    /**
     * Sets the report_Name__c value for this Xtma_Email_Result__c.
     * 
     * @param report_Name__c
     */
    public void setReport_Name__c(java.lang.String report_Name__c) {
        this.report_Name__c = report_Name__c;
    }


    /**
     * Gets the subject__c value for this Xtma_Email_Result__c.
     * 
     * @return subject__c
     */
    public java.lang.String getSubject__c() {
        return subject__c;
    }


    /**
     * Sets the subject__c value for this Xtma_Email_Result__c.
     * 
     * @param subject__c
     */
    public void setSubject__c(java.lang.String subject__c) {
        this.subject__c = subject__c;
    }


    /**
     * Gets the systemModstamp value for this Xtma_Email_Result__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Xtma_Email_Result__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the total_Number_of_Records__c value for this Xtma_Email_Result__c.
     * 
     * @return total_Number_of_Records__c
     */
    public java.lang.Double getTotal_Number_of_Records__c() {
        return total_Number_of_Records__c;
    }


    /**
     * Sets the total_Number_of_Records__c value for this Xtma_Email_Result__c.
     * 
     * @param total_Number_of_Records__c
     */
    public void setTotal_Number_of_Records__c(java.lang.Double total_Number_of_Records__c) {
        this.total_Number_of_Records__c = total_Number_of_Records__c;
    }


    /**
     * Gets the unsubscribe_Rate__c value for this Xtma_Email_Result__c.
     * 
     * @return unsubscribe_Rate__c
     */
    public java.lang.Double getUnsubscribe_Rate__c() {
        return unsubscribe_Rate__c;
    }


    /**
     * Sets the unsubscribe_Rate__c value for this Xtma_Email_Result__c.
     * 
     * @param unsubscribe_Rate__c
     */
    public void setUnsubscribe_Rate__c(java.lang.Double unsubscribe_Rate__c) {
        this.unsubscribe_Rate__c = unsubscribe_Rate__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Xtma_Email_Result__c)) return false;
        Xtma_Email_Result__c other = (Xtma_Email_Result__c) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.bounce_Rate__c==null && other.getBounce_Rate__c()==null) || 
             (this.bounce_Rate__c!=null &&
              this.bounce_Rate__c.equals(other.getBounce_Rate__c()))) &&
            ((this.campaign__c==null && other.getCampaign__c()==null) || 
             (this.campaign__c!=null &&
              this.campaign__c.equals(other.getCampaign__c()))) &&
            ((this.campaign__r==null && other.getCampaign__r()==null) || 
             (this.campaign__r!=null &&
              this.campaign__r.equals(other.getCampaign__r()))) &&
            ((this.click_Through_Rate__c==null && other.getClick_Through_Rate__c()==null) || 
             (this.click_Through_Rate__c!=null &&
              this.click_Through_Rate__c.equals(other.getClick_Through_Rate__c()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.date_Sent__c==null && other.getDate_Sent__c()==null) || 
             (this.date_Sent__c!=null &&
              this.date_Sent__c.equals(other.getDate_Sent__c()))) &&
            ((this.deliverability_Rate__c==null && other.getDeliverability_Rate__c()==null) || 
             (this.deliverability_Rate__c!=null &&
              this.deliverability_Rate__c.equals(other.getDeliverability_Rate__c()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.from_Address__c==null && other.getFrom_Address__c()==null) || 
             (this.from_Address__c!=null &&
              this.from_Address__c.equals(other.getFrom_Address__c()))) &&
            ((this.from_Name__c==null && other.getFrom_Name__c()==null) || 
             (this.from_Name__c!=null &&
              this.from_Name__c.equals(other.getFrom_Name__c()))) &&
            ((this.invalid_Addresses__c==null && other.getInvalid_Addresses__c()==null) || 
             (this.invalid_Addresses__c!=null &&
              this.invalid_Addresses__c.equals(other.getInvalid_Addresses__c()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
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
            ((this.number_Bounced__c==null && other.getNumber_Bounced__c()==null) || 
             (this.number_Bounced__c!=null &&
              this.number_Bounced__c.equals(other.getNumber_Bounced__c()))) &&
            ((this.number_Delivered__c==null && other.getNumber_Delivered__c()==null) || 
             (this.number_Delivered__c!=null &&
              this.number_Delivered__c.equals(other.getNumber_Delivered__c()))) &&
            ((this.number_Not_Opened__c==null && other.getNumber_Not_Opened__c()==null) || 
             (this.number_Not_Opened__c!=null &&
              this.number_Not_Opened__c.equals(other.getNumber_Not_Opened__c()))) &&
            ((this.number_Sent__c==null && other.getNumber_Sent__c()==null) || 
             (this.number_Sent__c!=null &&
              this.number_Sent__c.equals(other.getNumber_Sent__c()))) &&
            ((this.number_Unsubscribed__c==null && other.getNumber_Unsubscribed__c()==null) || 
             (this.number_Unsubscribed__c!=null &&
              this.number_Unsubscribed__c.equals(other.getNumber_Unsubscribed__c()))) &&
            ((this.number_of_Contacts__c==null && other.getNumber_of_Contacts__c()==null) || 
             (this.number_of_Contacts__c!=null &&
              this.number_of_Contacts__c.equals(other.getNumber_of_Contacts__c()))) &&
            ((this.number_of_Existing_Undeliverables__c==null && other.getNumber_of_Existing_Undeliverables__c()==null) || 
             (this.number_of_Existing_Undeliverables__c!=null &&
              this.number_of_Existing_Undeliverables__c.equals(other.getNumber_of_Existing_Undeliverables__c()))) &&
            ((this.number_of_Existing_Unsubscribes__c==null && other.getNumber_of_Existing_Unsubscribes__c()==null) || 
             (this.number_of_Existing_Unsubscribes__c!=null &&
              this.number_of_Existing_Unsubscribes__c.equals(other.getNumber_of_Existing_Unsubscribes__c()))) &&
            ((this.number_of_Hard_Bounces__c==null && other.getNumber_of_Hard_Bounces__c()==null) || 
             (this.number_of_Hard_Bounces__c!=null &&
              this.number_of_Hard_Bounces__c.equals(other.getNumber_of_Hard_Bounces__c()))) &&
            ((this.number_of_Leads__c==null && other.getNumber_of_Leads__c()==null) || 
             (this.number_of_Leads__c!=null &&
              this.number_of_Leads__c.equals(other.getNumber_of_Leads__c()))) &&
            ((this.number_of_Soft_Bounces__c==null && other.getNumber_of_Soft_Bounces__c()==null) || 
             (this.number_of_Soft_Bounces__c!=null &&
              this.number_of_Soft_Bounces__c.equals(other.getNumber_of_Soft_Bounces__c()))) &&
            ((this.number_of_Subscribers_Forwarding_Email__c==null && other.getNumber_of_Subscribers_Forwarding_Email__c()==null) || 
             (this.number_of_Subscribers_Forwarding_Email__c!=null &&
              this.number_of_Subscribers_Forwarding_Email__c.equals(other.getNumber_of_Subscribers_Forwarding_Email__c()))) &&
            ((this.number_of_Unique_Clicks__c==null && other.getNumber_of_Unique_Clicks__c()==null) || 
             (this.number_of_Unique_Clicks__c!=null &&
              this.number_of_Unique_Clicks__c.equals(other.getNumber_of_Unique_Clicks__c()))) &&
            ((this.number_of_Unique_Opens__c==null && other.getNumber_of_Unique_Opens__c()==null) || 
             (this.number_of_Unique_Opens__c!=null &&
              this.number_of_Unique_Opens__c.equals(other.getNumber_of_Unique_Opens__c()))) &&
            ((this.open_Rate__c==null && other.getOpen_Rate__c()==null) || 
             (this.open_Rate__c!=null &&
              this.open_Rate__c.equals(other.getOpen_Rate__c()))) &&
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
            ((this.records_without_Addresses__c==null && other.getRecords_without_Addresses__c()==null) || 
             (this.records_without_Addresses__c!=null &&
              this.records_without_Addresses__c.equals(other.getRecords_without_Addresses__c()))) &&
            ((this.report_Name__c==null && other.getReport_Name__c()==null) || 
             (this.report_Name__c!=null &&
              this.report_Name__c.equals(other.getReport_Name__c()))) &&
            ((this.subject__c==null && other.getSubject__c()==null) || 
             (this.subject__c!=null &&
              this.subject__c.equals(other.getSubject__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.total_Number_of_Records__c==null && other.getTotal_Number_of_Records__c()==null) || 
             (this.total_Number_of_Records__c!=null &&
              this.total_Number_of_Records__c.equals(other.getTotal_Number_of_Records__c()))) &&
            ((this.unsubscribe_Rate__c==null && other.getUnsubscribe_Rate__c()==null) || 
             (this.unsubscribe_Rate__c!=null &&
              this.unsubscribe_Rate__c.equals(other.getUnsubscribe_Rate__c())));
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
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getBounce_Rate__c() != null) {
            _hashCode += getBounce_Rate__c().hashCode();
        }
        if (getCampaign__c() != null) {
            _hashCode += getCampaign__c().hashCode();
        }
        if (getCampaign__r() != null) {
            _hashCode += getCampaign__r().hashCode();
        }
        if (getClick_Through_Rate__c() != null) {
            _hashCode += getClick_Through_Rate__c().hashCode();
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
        if (getDate_Sent__c() != null) {
            _hashCode += getDate_Sent__c().hashCode();
        }
        if (getDeliverability_Rate__c() != null) {
            _hashCode += getDeliverability_Rate__c().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getFrom_Address__c() != null) {
            _hashCode += getFrom_Address__c().hashCode();
        }
        if (getFrom_Name__c() != null) {
            _hashCode += getFrom_Name__c().hashCode();
        }
        if (getInvalid_Addresses__c() != null) {
            _hashCode += getInvalid_Addresses__c().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
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
        if (getNumber_Bounced__c() != null) {
            _hashCode += getNumber_Bounced__c().hashCode();
        }
        if (getNumber_Delivered__c() != null) {
            _hashCode += getNumber_Delivered__c().hashCode();
        }
        if (getNumber_Not_Opened__c() != null) {
            _hashCode += getNumber_Not_Opened__c().hashCode();
        }
        if (getNumber_Sent__c() != null) {
            _hashCode += getNumber_Sent__c().hashCode();
        }
        if (getNumber_Unsubscribed__c() != null) {
            _hashCode += getNumber_Unsubscribed__c().hashCode();
        }
        if (getNumber_of_Contacts__c() != null) {
            _hashCode += getNumber_of_Contacts__c().hashCode();
        }
        if (getNumber_of_Existing_Undeliverables__c() != null) {
            _hashCode += getNumber_of_Existing_Undeliverables__c().hashCode();
        }
        if (getNumber_of_Existing_Unsubscribes__c() != null) {
            _hashCode += getNumber_of_Existing_Unsubscribes__c().hashCode();
        }
        if (getNumber_of_Hard_Bounces__c() != null) {
            _hashCode += getNumber_of_Hard_Bounces__c().hashCode();
        }
        if (getNumber_of_Leads__c() != null) {
            _hashCode += getNumber_of_Leads__c().hashCode();
        }
        if (getNumber_of_Soft_Bounces__c() != null) {
            _hashCode += getNumber_of_Soft_Bounces__c().hashCode();
        }
        if (getNumber_of_Subscribers_Forwarding_Email__c() != null) {
            _hashCode += getNumber_of_Subscribers_Forwarding_Email__c().hashCode();
        }
        if (getNumber_of_Unique_Clicks__c() != null) {
            _hashCode += getNumber_of_Unique_Clicks__c().hashCode();
        }
        if (getNumber_of_Unique_Opens__c() != null) {
            _hashCode += getNumber_of_Unique_Opens__c().hashCode();
        }
        if (getOpen_Rate__c() != null) {
            _hashCode += getOpen_Rate__c().hashCode();
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
        if (getRecords_without_Addresses__c() != null) {
            _hashCode += getRecords_without_Addresses__c().hashCode();
        }
        if (getReport_Name__c() != null) {
            _hashCode += getReport_Name__c().hashCode();
        }
        if (getSubject__c() != null) {
            _hashCode += getSubject__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTotal_Number_of_Records__c() != null) {
            _hashCode += getTotal_Number_of_Records__c().hashCode();
        }
        if (getUnsubscribe_Rate__c() != null) {
            _hashCode += getUnsubscribe_Rate__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Xtma_Email_Result__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "xtma_Email_Result__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bounce_Rate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Bounce_Rate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("click_Through_Rate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Click_Through_Rate__c"));
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
        elemField.setFieldName("date_Sent__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Sent__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliverability_Rate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Deliverability_Rate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("from_Address__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "From_Address__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("from_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "From_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invalid_Addresses__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Invalid_Addresses__c"));
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
        elemField.setFieldName("number_Bounced__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Number_Bounced__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number_Delivered__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Number_Delivered__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number_Not_Opened__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Number_Not_Opened__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number_Sent__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Number_Sent__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number_Unsubscribed__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Number_Unsubscribed__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number_of_Contacts__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Number_of_Contacts__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number_of_Existing_Undeliverables__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Number_of_Existing_Undeliverables__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number_of_Existing_Unsubscribes__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Number_of_Existing_Unsubscribes__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number_of_Hard_Bounces__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Number_of_Hard_Bounces__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number_of_Leads__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Number_of_Leads__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number_of_Soft_Bounces__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Number_of_Soft_Bounces__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number_of_Subscribers_Forwarding_Email__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Number_of_Subscribers_Forwarding_Email__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number_of_Unique_Clicks__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Number_of_Unique_Clicks__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number_of_Unique_Opens__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Number_of_Unique_Opens__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("open_Rate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Open_Rate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("records_without_Addresses__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Records_without_Addresses__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("report_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Report_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("total_Number_of_Records__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Total_Number_of_Records__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unsubscribe_Rate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Unsubscribe_Rate__c"));
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

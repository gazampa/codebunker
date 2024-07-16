/**
 * Analytic_Snapshot__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Analytic_Snapshot__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String account__c;

    private com.sforce.soap.enterprise.sobject.Account account__r;

    private java.lang.String article_Number__c;

    private java.lang.String article_Stat_ID__c;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String channel__c;

    private java.lang.String contact__c;

    private com.sforce.soap.enterprise.sobject.Contact contact__r;

    private java.lang.Double content_Downloads__c;

    private java.lang.Double content_Negative_Votes__c;

    private java.lang.Double content_Overall_Rating__c;

    private java.lang.Double content_Positive_Votes__c;

    private java.lang.Double content_Subscriptions__c;

    private java.lang.String content_Title__c;

    private java.lang.String content_Type__c;

    private java.lang.Double content_Versions__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String created_By__c;

    private java.util.Date created_Date__c;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.util.Calendar first_Published_Date__c;

    private java.lang.Boolean isDeleted;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.util.Calendar last_Published_Date__c;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private java.util.Calendar portal_User_Individual_Login_Date_Time__c;

    private java.util.Date portal_User_Individual_Login_Date__c;

    private java.lang.String portal_User_Login_Month__c;

    private java.util.Calendar portal_User_Monthly_Last_Login_Date__c;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private com.sforce.soap.enterprise.sobject.RecordType recordType;

    private java.lang.String recordTypeId;

    private java.lang.Double score__c;

    private java.util.Calendar systemModstamp;

    private java.lang.Double ticket_Association_Count__c;

    private java.lang.String user_Full_Name__c;

    private com.sforce.soap.enterprise.sobject.User user_Full_Name__r;

    private java.lang.Double views__c;

    private java.lang.Boolean visible_in_Internal_App__c;

    public Analytic_Snapshot__c() {
    }

    public Analytic_Snapshot__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String account__c,
           com.sforce.soap.enterprise.sobject.Account account__r,
           java.lang.String article_Number__c,
           java.lang.String article_Stat_ID__c,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String channel__c,
           java.lang.String contact__c,
           com.sforce.soap.enterprise.sobject.Contact contact__r,
           java.lang.Double content_Downloads__c,
           java.lang.Double content_Negative_Votes__c,
           java.lang.Double content_Overall_Rating__c,
           java.lang.Double content_Positive_Votes__c,
           java.lang.Double content_Subscriptions__c,
           java.lang.String content_Title__c,
           java.lang.String content_Type__c,
           java.lang.Double content_Versions__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String created_By__c,
           java.util.Date created_Date__c,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.util.Calendar first_Published_Date__c,
           java.lang.Boolean isDeleted,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.util.Calendar last_Published_Date__c,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           java.util.Calendar portal_User_Individual_Login_Date_Time__c,
           java.util.Date portal_User_Individual_Login_Date__c,
           java.lang.String portal_User_Login_Month__c,
           java.util.Calendar portal_User_Monthly_Last_Login_Date__c,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           com.sforce.soap.enterprise.sobject.RecordType recordType,
           java.lang.String recordTypeId,
           java.lang.Double score__c,
           java.util.Calendar systemModstamp,
           java.lang.Double ticket_Association_Count__c,
           java.lang.String user_Full_Name__c,
           com.sforce.soap.enterprise.sobject.User user_Full_Name__r,
           java.lang.Double views__c,
           java.lang.Boolean visible_in_Internal_App__c) {
        super(
            fieldsToNull,
            id);
        this.account__c = account__c;
        this.account__r = account__r;
        this.article_Number__c = article_Number__c;
        this.article_Stat_ID__c = article_Stat_ID__c;
        this.attachments = attachments;
        this.channel__c = channel__c;
        this.contact__c = contact__c;
        this.contact__r = contact__r;
        this.content_Downloads__c = content_Downloads__c;
        this.content_Negative_Votes__c = content_Negative_Votes__c;
        this.content_Overall_Rating__c = content_Overall_Rating__c;
        this.content_Positive_Votes__c = content_Positive_Votes__c;
        this.content_Subscriptions__c = content_Subscriptions__c;
        this.content_Title__c = content_Title__c;
        this.content_Type__c = content_Type__c;
        this.content_Versions__c = content_Versions__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.created_By__c = created_By__c;
        this.created_Date__c = created_Date__c;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.first_Published_Date__c = first_Published_Date__c;
        this.isDeleted = isDeleted;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.last_Published_Date__c = last_Published_Date__c;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.owner = owner;
        this.ownerId = ownerId;
        this.portal_User_Individual_Login_Date_Time__c = portal_User_Individual_Login_Date_Time__c;
        this.portal_User_Individual_Login_Date__c = portal_User_Individual_Login_Date__c;
        this.portal_User_Login_Month__c = portal_User_Login_Month__c;
        this.portal_User_Monthly_Last_Login_Date__c = portal_User_Monthly_Last_Login_Date__c;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.recordType = recordType;
        this.recordTypeId = recordTypeId;
        this.score__c = score__c;
        this.systemModstamp = systemModstamp;
        this.ticket_Association_Count__c = ticket_Association_Count__c;
        this.user_Full_Name__c = user_Full_Name__c;
        this.user_Full_Name__r = user_Full_Name__r;
        this.views__c = views__c;
        this.visible_in_Internal_App__c = visible_in_Internal_App__c;
    }


    /**
     * Gets the account__c value for this Analytic_Snapshot__c.
     * 
     * @return account__c
     */
    public java.lang.String getAccount__c() {
        return account__c;
    }


    /**
     * Sets the account__c value for this Analytic_Snapshot__c.
     * 
     * @param account__c
     */
    public void setAccount__c(java.lang.String account__c) {
        this.account__c = account__c;
    }


    /**
     * Gets the account__r value for this Analytic_Snapshot__c.
     * 
     * @return account__r
     */
    public com.sforce.soap.enterprise.sobject.Account getAccount__r() {
        return account__r;
    }


    /**
     * Sets the account__r value for this Analytic_Snapshot__c.
     * 
     * @param account__r
     */
    public void setAccount__r(com.sforce.soap.enterprise.sobject.Account account__r) {
        this.account__r = account__r;
    }


    /**
     * Gets the article_Number__c value for this Analytic_Snapshot__c.
     * 
     * @return article_Number__c
     */
    public java.lang.String getArticle_Number__c() {
        return article_Number__c;
    }


    /**
     * Sets the article_Number__c value for this Analytic_Snapshot__c.
     * 
     * @param article_Number__c
     */
    public void setArticle_Number__c(java.lang.String article_Number__c) {
        this.article_Number__c = article_Number__c;
    }


    /**
     * Gets the article_Stat_ID__c value for this Analytic_Snapshot__c.
     * 
     * @return article_Stat_ID__c
     */
    public java.lang.String getArticle_Stat_ID__c() {
        return article_Stat_ID__c;
    }


    /**
     * Sets the article_Stat_ID__c value for this Analytic_Snapshot__c.
     * 
     * @param article_Stat_ID__c
     */
    public void setArticle_Stat_ID__c(java.lang.String article_Stat_ID__c) {
        this.article_Stat_ID__c = article_Stat_ID__c;
    }


    /**
     * Gets the attachments value for this Analytic_Snapshot__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Analytic_Snapshot__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the channel__c value for this Analytic_Snapshot__c.
     * 
     * @return channel__c
     */
    public java.lang.String getChannel__c() {
        return channel__c;
    }


    /**
     * Sets the channel__c value for this Analytic_Snapshot__c.
     * 
     * @param channel__c
     */
    public void setChannel__c(java.lang.String channel__c) {
        this.channel__c = channel__c;
    }


    /**
     * Gets the contact__c value for this Analytic_Snapshot__c.
     * 
     * @return contact__c
     */
    public java.lang.String getContact__c() {
        return contact__c;
    }


    /**
     * Sets the contact__c value for this Analytic_Snapshot__c.
     * 
     * @param contact__c
     */
    public void setContact__c(java.lang.String contact__c) {
        this.contact__c = contact__c;
    }


    /**
     * Gets the contact__r value for this Analytic_Snapshot__c.
     * 
     * @return contact__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getContact__r() {
        return contact__r;
    }


    /**
     * Sets the contact__r value for this Analytic_Snapshot__c.
     * 
     * @param contact__r
     */
    public void setContact__r(com.sforce.soap.enterprise.sobject.Contact contact__r) {
        this.contact__r = contact__r;
    }


    /**
     * Gets the content_Downloads__c value for this Analytic_Snapshot__c.
     * 
     * @return content_Downloads__c
     */
    public java.lang.Double getContent_Downloads__c() {
        return content_Downloads__c;
    }


    /**
     * Sets the content_Downloads__c value for this Analytic_Snapshot__c.
     * 
     * @param content_Downloads__c
     */
    public void setContent_Downloads__c(java.lang.Double content_Downloads__c) {
        this.content_Downloads__c = content_Downloads__c;
    }


    /**
     * Gets the content_Negative_Votes__c value for this Analytic_Snapshot__c.
     * 
     * @return content_Negative_Votes__c
     */
    public java.lang.Double getContent_Negative_Votes__c() {
        return content_Negative_Votes__c;
    }


    /**
     * Sets the content_Negative_Votes__c value for this Analytic_Snapshot__c.
     * 
     * @param content_Negative_Votes__c
     */
    public void setContent_Negative_Votes__c(java.lang.Double content_Negative_Votes__c) {
        this.content_Negative_Votes__c = content_Negative_Votes__c;
    }


    /**
     * Gets the content_Overall_Rating__c value for this Analytic_Snapshot__c.
     * 
     * @return content_Overall_Rating__c
     */
    public java.lang.Double getContent_Overall_Rating__c() {
        return content_Overall_Rating__c;
    }


    /**
     * Sets the content_Overall_Rating__c value for this Analytic_Snapshot__c.
     * 
     * @param content_Overall_Rating__c
     */
    public void setContent_Overall_Rating__c(java.lang.Double content_Overall_Rating__c) {
        this.content_Overall_Rating__c = content_Overall_Rating__c;
    }


    /**
     * Gets the content_Positive_Votes__c value for this Analytic_Snapshot__c.
     * 
     * @return content_Positive_Votes__c
     */
    public java.lang.Double getContent_Positive_Votes__c() {
        return content_Positive_Votes__c;
    }


    /**
     * Sets the content_Positive_Votes__c value for this Analytic_Snapshot__c.
     * 
     * @param content_Positive_Votes__c
     */
    public void setContent_Positive_Votes__c(java.lang.Double content_Positive_Votes__c) {
        this.content_Positive_Votes__c = content_Positive_Votes__c;
    }


    /**
     * Gets the content_Subscriptions__c value for this Analytic_Snapshot__c.
     * 
     * @return content_Subscriptions__c
     */
    public java.lang.Double getContent_Subscriptions__c() {
        return content_Subscriptions__c;
    }


    /**
     * Sets the content_Subscriptions__c value for this Analytic_Snapshot__c.
     * 
     * @param content_Subscriptions__c
     */
    public void setContent_Subscriptions__c(java.lang.Double content_Subscriptions__c) {
        this.content_Subscriptions__c = content_Subscriptions__c;
    }


    /**
     * Gets the content_Title__c value for this Analytic_Snapshot__c.
     * 
     * @return content_Title__c
     */
    public java.lang.String getContent_Title__c() {
        return content_Title__c;
    }


    /**
     * Sets the content_Title__c value for this Analytic_Snapshot__c.
     * 
     * @param content_Title__c
     */
    public void setContent_Title__c(java.lang.String content_Title__c) {
        this.content_Title__c = content_Title__c;
    }


    /**
     * Gets the content_Type__c value for this Analytic_Snapshot__c.
     * 
     * @return content_Type__c
     */
    public java.lang.String getContent_Type__c() {
        return content_Type__c;
    }


    /**
     * Sets the content_Type__c value for this Analytic_Snapshot__c.
     * 
     * @param content_Type__c
     */
    public void setContent_Type__c(java.lang.String content_Type__c) {
        this.content_Type__c = content_Type__c;
    }


    /**
     * Gets the content_Versions__c value for this Analytic_Snapshot__c.
     * 
     * @return content_Versions__c
     */
    public java.lang.Double getContent_Versions__c() {
        return content_Versions__c;
    }


    /**
     * Sets the content_Versions__c value for this Analytic_Snapshot__c.
     * 
     * @param content_Versions__c
     */
    public void setContent_Versions__c(java.lang.Double content_Versions__c) {
        this.content_Versions__c = content_Versions__c;
    }


    /**
     * Gets the createdBy value for this Analytic_Snapshot__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Analytic_Snapshot__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Analytic_Snapshot__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Analytic_Snapshot__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Analytic_Snapshot__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Analytic_Snapshot__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the created_By__c value for this Analytic_Snapshot__c.
     * 
     * @return created_By__c
     */
    public java.lang.String getCreated_By__c() {
        return created_By__c;
    }


    /**
     * Sets the created_By__c value for this Analytic_Snapshot__c.
     * 
     * @param created_By__c
     */
    public void setCreated_By__c(java.lang.String created_By__c) {
        this.created_By__c = created_By__c;
    }


    /**
     * Gets the created_Date__c value for this Analytic_Snapshot__c.
     * 
     * @return created_Date__c
     */
    public java.util.Date getCreated_Date__c() {
        return created_Date__c;
    }


    /**
     * Sets the created_Date__c value for this Analytic_Snapshot__c.
     * 
     * @param created_Date__c
     */
    public void setCreated_Date__c(java.util.Date created_Date__c) {
        this.created_Date__c = created_Date__c;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Analytic_Snapshot__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Analytic_Snapshot__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the first_Published_Date__c value for this Analytic_Snapshot__c.
     * 
     * @return first_Published_Date__c
     */
    public java.util.Calendar getFirst_Published_Date__c() {
        return first_Published_Date__c;
    }


    /**
     * Sets the first_Published_Date__c value for this Analytic_Snapshot__c.
     * 
     * @param first_Published_Date__c
     */
    public void setFirst_Published_Date__c(java.util.Calendar first_Published_Date__c) {
        this.first_Published_Date__c = first_Published_Date__c;
    }


    /**
     * Gets the isDeleted value for this Analytic_Snapshot__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Analytic_Snapshot__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this Analytic_Snapshot__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Analytic_Snapshot__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Analytic_Snapshot__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Analytic_Snapshot__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Analytic_Snapshot__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Analytic_Snapshot__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the last_Published_Date__c value for this Analytic_Snapshot__c.
     * 
     * @return last_Published_Date__c
     */
    public java.util.Calendar getLast_Published_Date__c() {
        return last_Published_Date__c;
    }


    /**
     * Sets the last_Published_Date__c value for this Analytic_Snapshot__c.
     * 
     * @param last_Published_Date__c
     */
    public void setLast_Published_Date__c(java.util.Calendar last_Published_Date__c) {
        this.last_Published_Date__c = last_Published_Date__c;
    }


    /**
     * Gets the name value for this Analytic_Snapshot__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Analytic_Snapshot__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Analytic_Snapshot__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Analytic_Snapshot__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Analytic_Snapshot__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Analytic_Snapshot__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the owner value for this Analytic_Snapshot__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Analytic_Snapshot__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Analytic_Snapshot__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Analytic_Snapshot__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the portal_User_Individual_Login_Date_Time__c value for this Analytic_Snapshot__c.
     * 
     * @return portal_User_Individual_Login_Date_Time__c
     */
    public java.util.Calendar getPortal_User_Individual_Login_Date_Time__c() {
        return portal_User_Individual_Login_Date_Time__c;
    }


    /**
     * Sets the portal_User_Individual_Login_Date_Time__c value for this Analytic_Snapshot__c.
     * 
     * @param portal_User_Individual_Login_Date_Time__c
     */
    public void setPortal_User_Individual_Login_Date_Time__c(java.util.Calendar portal_User_Individual_Login_Date_Time__c) {
        this.portal_User_Individual_Login_Date_Time__c = portal_User_Individual_Login_Date_Time__c;
    }


    /**
     * Gets the portal_User_Individual_Login_Date__c value for this Analytic_Snapshot__c.
     * 
     * @return portal_User_Individual_Login_Date__c
     */
    public java.util.Date getPortal_User_Individual_Login_Date__c() {
        return portal_User_Individual_Login_Date__c;
    }


    /**
     * Sets the portal_User_Individual_Login_Date__c value for this Analytic_Snapshot__c.
     * 
     * @param portal_User_Individual_Login_Date__c
     */
    public void setPortal_User_Individual_Login_Date__c(java.util.Date portal_User_Individual_Login_Date__c) {
        this.portal_User_Individual_Login_Date__c = portal_User_Individual_Login_Date__c;
    }


    /**
     * Gets the portal_User_Login_Month__c value for this Analytic_Snapshot__c.
     * 
     * @return portal_User_Login_Month__c
     */
    public java.lang.String getPortal_User_Login_Month__c() {
        return portal_User_Login_Month__c;
    }


    /**
     * Sets the portal_User_Login_Month__c value for this Analytic_Snapshot__c.
     * 
     * @param portal_User_Login_Month__c
     */
    public void setPortal_User_Login_Month__c(java.lang.String portal_User_Login_Month__c) {
        this.portal_User_Login_Month__c = portal_User_Login_Month__c;
    }


    /**
     * Gets the portal_User_Monthly_Last_Login_Date__c value for this Analytic_Snapshot__c.
     * 
     * @return portal_User_Monthly_Last_Login_Date__c
     */
    public java.util.Calendar getPortal_User_Monthly_Last_Login_Date__c() {
        return portal_User_Monthly_Last_Login_Date__c;
    }


    /**
     * Sets the portal_User_Monthly_Last_Login_Date__c value for this Analytic_Snapshot__c.
     * 
     * @param portal_User_Monthly_Last_Login_Date__c
     */
    public void setPortal_User_Monthly_Last_Login_Date__c(java.util.Calendar portal_User_Monthly_Last_Login_Date__c) {
        this.portal_User_Monthly_Last_Login_Date__c = portal_User_Monthly_Last_Login_Date__c;
    }


    /**
     * Gets the processInstances value for this Analytic_Snapshot__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Analytic_Snapshot__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Analytic_Snapshot__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Analytic_Snapshot__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the recordType value for this Analytic_Snapshot__c.
     * 
     * @return recordType
     */
    public com.sforce.soap.enterprise.sobject.RecordType getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this Analytic_Snapshot__c.
     * 
     * @param recordType
     */
    public void setRecordType(com.sforce.soap.enterprise.sobject.RecordType recordType) {
        this.recordType = recordType;
    }


    /**
     * Gets the recordTypeId value for this Analytic_Snapshot__c.
     * 
     * @return recordTypeId
     */
    public java.lang.String getRecordTypeId() {
        return recordTypeId;
    }


    /**
     * Sets the recordTypeId value for this Analytic_Snapshot__c.
     * 
     * @param recordTypeId
     */
    public void setRecordTypeId(java.lang.String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }


    /**
     * Gets the score__c value for this Analytic_Snapshot__c.
     * 
     * @return score__c
     */
    public java.lang.Double getScore__c() {
        return score__c;
    }


    /**
     * Sets the score__c value for this Analytic_Snapshot__c.
     * 
     * @param score__c
     */
    public void setScore__c(java.lang.Double score__c) {
        this.score__c = score__c;
    }


    /**
     * Gets the systemModstamp value for this Analytic_Snapshot__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Analytic_Snapshot__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the ticket_Association_Count__c value for this Analytic_Snapshot__c.
     * 
     * @return ticket_Association_Count__c
     */
    public java.lang.Double getTicket_Association_Count__c() {
        return ticket_Association_Count__c;
    }


    /**
     * Sets the ticket_Association_Count__c value for this Analytic_Snapshot__c.
     * 
     * @param ticket_Association_Count__c
     */
    public void setTicket_Association_Count__c(java.lang.Double ticket_Association_Count__c) {
        this.ticket_Association_Count__c = ticket_Association_Count__c;
    }


    /**
     * Gets the user_Full_Name__c value for this Analytic_Snapshot__c.
     * 
     * @return user_Full_Name__c
     */
    public java.lang.String getUser_Full_Name__c() {
        return user_Full_Name__c;
    }


    /**
     * Sets the user_Full_Name__c value for this Analytic_Snapshot__c.
     * 
     * @param user_Full_Name__c
     */
    public void setUser_Full_Name__c(java.lang.String user_Full_Name__c) {
        this.user_Full_Name__c = user_Full_Name__c;
    }


    /**
     * Gets the user_Full_Name__r value for this Analytic_Snapshot__c.
     * 
     * @return user_Full_Name__r
     */
    public com.sforce.soap.enterprise.sobject.User getUser_Full_Name__r() {
        return user_Full_Name__r;
    }


    /**
     * Sets the user_Full_Name__r value for this Analytic_Snapshot__c.
     * 
     * @param user_Full_Name__r
     */
    public void setUser_Full_Name__r(com.sforce.soap.enterprise.sobject.User user_Full_Name__r) {
        this.user_Full_Name__r = user_Full_Name__r;
    }


    /**
     * Gets the views__c value for this Analytic_Snapshot__c.
     * 
     * @return views__c
     */
    public java.lang.Double getViews__c() {
        return views__c;
    }


    /**
     * Sets the views__c value for this Analytic_Snapshot__c.
     * 
     * @param views__c
     */
    public void setViews__c(java.lang.Double views__c) {
        this.views__c = views__c;
    }


    /**
     * Gets the visible_in_Internal_App__c value for this Analytic_Snapshot__c.
     * 
     * @return visible_in_Internal_App__c
     */
    public java.lang.Boolean getVisible_in_Internal_App__c() {
        return visible_in_Internal_App__c;
    }


    /**
     * Sets the visible_in_Internal_App__c value for this Analytic_Snapshot__c.
     * 
     * @param visible_in_Internal_App__c
     */
    public void setVisible_in_Internal_App__c(java.lang.Boolean visible_in_Internal_App__c) {
        this.visible_in_Internal_App__c = visible_in_Internal_App__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Analytic_Snapshot__c)) return false;
        Analytic_Snapshot__c other = (Analytic_Snapshot__c) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.account__c==null && other.getAccount__c()==null) || 
             (this.account__c!=null &&
              this.account__c.equals(other.getAccount__c()))) &&
            ((this.account__r==null && other.getAccount__r()==null) || 
             (this.account__r!=null &&
              this.account__r.equals(other.getAccount__r()))) &&
            ((this.article_Number__c==null && other.getArticle_Number__c()==null) || 
             (this.article_Number__c!=null &&
              this.article_Number__c.equals(other.getArticle_Number__c()))) &&
            ((this.article_Stat_ID__c==null && other.getArticle_Stat_ID__c()==null) || 
             (this.article_Stat_ID__c!=null &&
              this.article_Stat_ID__c.equals(other.getArticle_Stat_ID__c()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.channel__c==null && other.getChannel__c()==null) || 
             (this.channel__c!=null &&
              this.channel__c.equals(other.getChannel__c()))) &&
            ((this.contact__c==null && other.getContact__c()==null) || 
             (this.contact__c!=null &&
              this.contact__c.equals(other.getContact__c()))) &&
            ((this.contact__r==null && other.getContact__r()==null) || 
             (this.contact__r!=null &&
              this.contact__r.equals(other.getContact__r()))) &&
            ((this.content_Downloads__c==null && other.getContent_Downloads__c()==null) || 
             (this.content_Downloads__c!=null &&
              this.content_Downloads__c.equals(other.getContent_Downloads__c()))) &&
            ((this.content_Negative_Votes__c==null && other.getContent_Negative_Votes__c()==null) || 
             (this.content_Negative_Votes__c!=null &&
              this.content_Negative_Votes__c.equals(other.getContent_Negative_Votes__c()))) &&
            ((this.content_Overall_Rating__c==null && other.getContent_Overall_Rating__c()==null) || 
             (this.content_Overall_Rating__c!=null &&
              this.content_Overall_Rating__c.equals(other.getContent_Overall_Rating__c()))) &&
            ((this.content_Positive_Votes__c==null && other.getContent_Positive_Votes__c()==null) || 
             (this.content_Positive_Votes__c!=null &&
              this.content_Positive_Votes__c.equals(other.getContent_Positive_Votes__c()))) &&
            ((this.content_Subscriptions__c==null && other.getContent_Subscriptions__c()==null) || 
             (this.content_Subscriptions__c!=null &&
              this.content_Subscriptions__c.equals(other.getContent_Subscriptions__c()))) &&
            ((this.content_Title__c==null && other.getContent_Title__c()==null) || 
             (this.content_Title__c!=null &&
              this.content_Title__c.equals(other.getContent_Title__c()))) &&
            ((this.content_Type__c==null && other.getContent_Type__c()==null) || 
             (this.content_Type__c!=null &&
              this.content_Type__c.equals(other.getContent_Type__c()))) &&
            ((this.content_Versions__c==null && other.getContent_Versions__c()==null) || 
             (this.content_Versions__c!=null &&
              this.content_Versions__c.equals(other.getContent_Versions__c()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.created_By__c==null && other.getCreated_By__c()==null) || 
             (this.created_By__c!=null &&
              this.created_By__c.equals(other.getCreated_By__c()))) &&
            ((this.created_Date__c==null && other.getCreated_Date__c()==null) || 
             (this.created_Date__c!=null &&
              this.created_Date__c.equals(other.getCreated_Date__c()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.first_Published_Date__c==null && other.getFirst_Published_Date__c()==null) || 
             (this.first_Published_Date__c!=null &&
              this.first_Published_Date__c.equals(other.getFirst_Published_Date__c()))) &&
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
            ((this.last_Published_Date__c==null && other.getLast_Published_Date__c()==null) || 
             (this.last_Published_Date__c!=null &&
              this.last_Published_Date__c.equals(other.getLast_Published_Date__c()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.portal_User_Individual_Login_Date_Time__c==null && other.getPortal_User_Individual_Login_Date_Time__c()==null) || 
             (this.portal_User_Individual_Login_Date_Time__c!=null &&
              this.portal_User_Individual_Login_Date_Time__c.equals(other.getPortal_User_Individual_Login_Date_Time__c()))) &&
            ((this.portal_User_Individual_Login_Date__c==null && other.getPortal_User_Individual_Login_Date__c()==null) || 
             (this.portal_User_Individual_Login_Date__c!=null &&
              this.portal_User_Individual_Login_Date__c.equals(other.getPortal_User_Individual_Login_Date__c()))) &&
            ((this.portal_User_Login_Month__c==null && other.getPortal_User_Login_Month__c()==null) || 
             (this.portal_User_Login_Month__c!=null &&
              this.portal_User_Login_Month__c.equals(other.getPortal_User_Login_Month__c()))) &&
            ((this.portal_User_Monthly_Last_Login_Date__c==null && other.getPortal_User_Monthly_Last_Login_Date__c()==null) || 
             (this.portal_User_Monthly_Last_Login_Date__c!=null &&
              this.portal_User_Monthly_Last_Login_Date__c.equals(other.getPortal_User_Monthly_Last_Login_Date__c()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.recordType==null && other.getRecordType()==null) || 
             (this.recordType!=null &&
              this.recordType.equals(other.getRecordType()))) &&
            ((this.recordTypeId==null && other.getRecordTypeId()==null) || 
             (this.recordTypeId!=null &&
              this.recordTypeId.equals(other.getRecordTypeId()))) &&
            ((this.score__c==null && other.getScore__c()==null) || 
             (this.score__c!=null &&
              this.score__c.equals(other.getScore__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.ticket_Association_Count__c==null && other.getTicket_Association_Count__c()==null) || 
             (this.ticket_Association_Count__c!=null &&
              this.ticket_Association_Count__c.equals(other.getTicket_Association_Count__c()))) &&
            ((this.user_Full_Name__c==null && other.getUser_Full_Name__c()==null) || 
             (this.user_Full_Name__c!=null &&
              this.user_Full_Name__c.equals(other.getUser_Full_Name__c()))) &&
            ((this.user_Full_Name__r==null && other.getUser_Full_Name__r()==null) || 
             (this.user_Full_Name__r!=null &&
              this.user_Full_Name__r.equals(other.getUser_Full_Name__r()))) &&
            ((this.views__c==null && other.getViews__c()==null) || 
             (this.views__c!=null &&
              this.views__c.equals(other.getViews__c()))) &&
            ((this.visible_in_Internal_App__c==null && other.getVisible_in_Internal_App__c()==null) || 
             (this.visible_in_Internal_App__c!=null &&
              this.visible_in_Internal_App__c.equals(other.getVisible_in_Internal_App__c())));
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
        if (getAccount__c() != null) {
            _hashCode += getAccount__c().hashCode();
        }
        if (getAccount__r() != null) {
            _hashCode += getAccount__r().hashCode();
        }
        if (getArticle_Number__c() != null) {
            _hashCode += getArticle_Number__c().hashCode();
        }
        if (getArticle_Stat_ID__c() != null) {
            _hashCode += getArticle_Stat_ID__c().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getChannel__c() != null) {
            _hashCode += getChannel__c().hashCode();
        }
        if (getContact__c() != null) {
            _hashCode += getContact__c().hashCode();
        }
        if (getContact__r() != null) {
            _hashCode += getContact__r().hashCode();
        }
        if (getContent_Downloads__c() != null) {
            _hashCode += getContent_Downloads__c().hashCode();
        }
        if (getContent_Negative_Votes__c() != null) {
            _hashCode += getContent_Negative_Votes__c().hashCode();
        }
        if (getContent_Overall_Rating__c() != null) {
            _hashCode += getContent_Overall_Rating__c().hashCode();
        }
        if (getContent_Positive_Votes__c() != null) {
            _hashCode += getContent_Positive_Votes__c().hashCode();
        }
        if (getContent_Subscriptions__c() != null) {
            _hashCode += getContent_Subscriptions__c().hashCode();
        }
        if (getContent_Title__c() != null) {
            _hashCode += getContent_Title__c().hashCode();
        }
        if (getContent_Type__c() != null) {
            _hashCode += getContent_Type__c().hashCode();
        }
        if (getContent_Versions__c() != null) {
            _hashCode += getContent_Versions__c().hashCode();
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
        if (getCreated_By__c() != null) {
            _hashCode += getCreated_By__c().hashCode();
        }
        if (getCreated_Date__c() != null) {
            _hashCode += getCreated_Date__c().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getFirst_Published_Date__c() != null) {
            _hashCode += getFirst_Published_Date__c().hashCode();
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
        if (getLast_Published_Date__c() != null) {
            _hashCode += getLast_Published_Date__c().hashCode();
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
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getPortal_User_Individual_Login_Date_Time__c() != null) {
            _hashCode += getPortal_User_Individual_Login_Date_Time__c().hashCode();
        }
        if (getPortal_User_Individual_Login_Date__c() != null) {
            _hashCode += getPortal_User_Individual_Login_Date__c().hashCode();
        }
        if (getPortal_User_Login_Month__c() != null) {
            _hashCode += getPortal_User_Login_Month__c().hashCode();
        }
        if (getPortal_User_Monthly_Last_Login_Date__c() != null) {
            _hashCode += getPortal_User_Monthly_Last_Login_Date__c().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getRecordType() != null) {
            _hashCode += getRecordType().hashCode();
        }
        if (getRecordTypeId() != null) {
            _hashCode += getRecordTypeId().hashCode();
        }
        if (getScore__c() != null) {
            _hashCode += getScore__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTicket_Association_Count__c() != null) {
            _hashCode += getTicket_Association_Count__c().hashCode();
        }
        if (getUser_Full_Name__c() != null) {
            _hashCode += getUser_Full_Name__c().hashCode();
        }
        if (getUser_Full_Name__r() != null) {
            _hashCode += getUser_Full_Name__r().hashCode();
        }
        if (getViews__c() != null) {
            _hashCode += getViews__c().hashCode();
        }
        if (getVisible_in_Internal_App__c() != null) {
            _hashCode += getVisible_in_Internal_App__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Analytic_Snapshot__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Analytic_Snapshot__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("article_Number__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Article_Number__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("article_Stat_ID__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Article_Stat_ID__c"));
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
        elemField.setFieldName("channel__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Channel__c"));
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
        elemField.setFieldName("content_Downloads__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Content_Downloads__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content_Negative_Votes__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Content_Negative_Votes__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content_Overall_Rating__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Content_Overall_Rating__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content_Positive_Votes__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Content_Positive_Votes__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content_Subscriptions__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Content_Subscriptions__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content_Title__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Content_Title__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Content_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content_Versions__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Content_Versions__c"));
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
        elemField.setFieldName("created_By__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Created_By__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Created_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("first_Published_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "First_Published_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("last_Published_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Last_Published_Date__c"));
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
        elemField.setFieldName("portal_User_Individual_Login_Date_Time__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Portal_User_Individual_Login_Date_Time__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portal_User_Individual_Login_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Portal_User_Individual_Login_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portal_User_Login_Month__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Portal_User_Login_Month__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portal_User_Monthly_Last_Login_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Portal_User_Monthly_Last_Login_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Score__c"));
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
        elemField.setFieldName("ticket_Association_Count__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Ticket_Association_Count__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_Full_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User_Full_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_Full_Name__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User_Full_Name__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("views__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Views__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visible_in_Internal_App__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Visible_in_Internal_App__c"));
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

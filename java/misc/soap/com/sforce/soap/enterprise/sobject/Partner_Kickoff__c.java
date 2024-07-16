/**
 * Partner_Kickoff__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Partner_Kickoff__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String account__c;

    private com.sforce.soap.enterprise.sobject.Account account__r;

    private java.lang.String activities_Completed__c;

    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private java.lang.Boolean admin_Contact__c;

    private java.lang.String admin_Training__c;

    private com.sforce.soap.enterprise.sobject.Training_Relativity__c admin_Training__r;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.Boolean billing_Contact__c;

    private java.lang.String co_branded_Collateral_Sent__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String cust_Invoice_Summary_Sent_to_Acct__c;

    private java.lang.String deployment_Completed__c;

    private java.util.Date deployment_Date__c;

    private java.lang.String deployment_Scheduled__c;

    private com.sforce.soap.enterprise.QueryResult events;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.String infrastructure_Scheduled__c;

    private java.lang.Boolean isDeleted;

    private java.lang.String is_Partner_Kick_Off_Complete__c;

    private java.util.Date lastActivityDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String marketing_Owner__c;

    private com.sforce.soap.enterprise.sobject.User marketing_Owner__r;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private com.sforce.soap.enterprise.QueryResult onsite_Visits__r;

    private com.sforce.soap.enterprise.QueryResult openActivities;

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private java.lang.String partner_Added_to_Complete_Vendor_List__c;

    private java.lang.String press_Release__c;

    private com.sforce.soap.enterprise.QueryResult primary_Contacts__r;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private com.sforce.soap.enterprise.sobject.RecordType recordType;

    private java.lang.String recordTypeId;

    private java.lang.String relativity_Analytics_Scheduled__c;

    private java.lang.Boolean sales_Contact__c;

    private java.lang.String sales_Training_Attendees__c;

    private java.util.Date sales_Training_Date__c;

    private java.lang.String sales_Training_Post_Training_Notes__c;

    private java.lang.String sales_Training_Scheduled__c;

    private java.lang.String sales_login_to_Website_Created__c;

    private java.lang.String salt_vs_Pepper_Deployed__c;

    private java.lang.String salt_vs_Pepper_Ticket__c;

    private com.sforce.soap.enterprise.sobject._case salt_vs_Pepper_Ticket__r;

    private java.lang.String salt_vs_Pepper__c;

    private java.lang.String smokeTestSvP__c;

    private com.sforce.soap.enterprise.sobject.User smokeTestSvP__r;

    private java.lang.String svP_Migrated__c;

    private java.lang.String svP_Ticket_Status__c;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    private com.sforce.soap.enterprise.QueryResult training__r;

    private com.sforce.soap.enterprise.QueryResult trainings__r;

    private java.lang.String update_Sales_Deck_Presentation__c;

    private java.lang.String website_activities_complete__c;

    private java.lang.String x2_day_Admin_Training_Completed__c;

    private java.util.Date x2_day_Admin_Training_Date__c;

    private java.lang.String x2_day_Admin_Training_Location__c;

    private java.lang.String x2_day_Admin_Training_Notes__c;

    private java.lang.String x2_day_Admin_Training_Scheduled__c;

    public Partner_Kickoff__c() {
    }

    public Partner_Kickoff__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String account__c,
           com.sforce.soap.enterprise.sobject.Account account__r,
           java.lang.String activities_Completed__c,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           java.lang.Boolean admin_Contact__c,
           java.lang.String admin_Training__c,
           com.sforce.soap.enterprise.sobject.Training_Relativity__c admin_Training__r,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.Boolean billing_Contact__c,
           java.lang.String co_branded_Collateral_Sent__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String cust_Invoice_Summary_Sent_to_Acct__c,
           java.lang.String deployment_Completed__c,
           java.util.Date deployment_Date__c,
           java.lang.String deployment_Scheduled__c,
           com.sforce.soap.enterprise.QueryResult events,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.String infrastructure_Scheduled__c,
           java.lang.Boolean isDeleted,
           java.lang.String is_Partner_Kick_Off_Complete__c,
           java.util.Date lastActivityDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String marketing_Owner__c,
           com.sforce.soap.enterprise.sobject.User marketing_Owner__r,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           com.sforce.soap.enterprise.QueryResult onsite_Visits__r,
           com.sforce.soap.enterprise.QueryResult openActivities,
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           java.lang.String partner_Added_to_Complete_Vendor_List__c,
           java.lang.String press_Release__c,
           com.sforce.soap.enterprise.QueryResult primary_Contacts__r,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           com.sforce.soap.enterprise.sobject.RecordType recordType,
           java.lang.String recordTypeId,
           java.lang.String relativity_Analytics_Scheduled__c,
           java.lang.Boolean sales_Contact__c,
           java.lang.String sales_Training_Attendees__c,
           java.util.Date sales_Training_Date__c,
           java.lang.String sales_Training_Post_Training_Notes__c,
           java.lang.String sales_Training_Scheduled__c,
           java.lang.String sales_login_to_Website_Created__c,
           java.lang.String salt_vs_Pepper_Deployed__c,
           java.lang.String salt_vs_Pepper_Ticket__c,
           com.sforce.soap.enterprise.sobject._case salt_vs_Pepper_Ticket__r,
           java.lang.String salt_vs_Pepper__c,
           java.lang.String smokeTestSvP__c,
           com.sforce.soap.enterprise.sobject.User smokeTestSvP__r,
           java.lang.String svP_Migrated__c,
           java.lang.String svP_Ticket_Status__c,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks,
           com.sforce.soap.enterprise.QueryResult training__r,
           com.sforce.soap.enterprise.QueryResult trainings__r,
           java.lang.String update_Sales_Deck_Presentation__c,
           java.lang.String website_activities_complete__c,
           java.lang.String x2_day_Admin_Training_Completed__c,
           java.util.Date x2_day_Admin_Training_Date__c,
           java.lang.String x2_day_Admin_Training_Location__c,
           java.lang.String x2_day_Admin_Training_Notes__c,
           java.lang.String x2_day_Admin_Training_Scheduled__c) {
        super(
            fieldsToNull,
            id);
        this.account__c = account__c;
        this.account__r = account__r;
        this.activities_Completed__c = activities_Completed__c;
        this.activityHistories = activityHistories;
        this.admin_Contact__c = admin_Contact__c;
        this.admin_Training__c = admin_Training__c;
        this.admin_Training__r = admin_Training__r;
        this.attachments = attachments;
        this.billing_Contact__c = billing_Contact__c;
        this.co_branded_Collateral_Sent__c = co_branded_Collateral_Sent__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.cust_Invoice_Summary_Sent_to_Acct__c = cust_Invoice_Summary_Sent_to_Acct__c;
        this.deployment_Completed__c = deployment_Completed__c;
        this.deployment_Date__c = deployment_Date__c;
        this.deployment_Scheduled__c = deployment_Scheduled__c;
        this.events = events;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.histories = histories;
        this.infrastructure_Scheduled__c = infrastructure_Scheduled__c;
        this.isDeleted = isDeleted;
        this.is_Partner_Kick_Off_Complete__c = is_Partner_Kick_Off_Complete__c;
        this.lastActivityDate = lastActivityDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.marketing_Owner__c = marketing_Owner__c;
        this.marketing_Owner__r = marketing_Owner__r;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.onsite_Visits__r = onsite_Visits__r;
        this.openActivities = openActivities;
        this.owner = owner;
        this.ownerId = ownerId;
        this.partner_Added_to_Complete_Vendor_List__c = partner_Added_to_Complete_Vendor_List__c;
        this.press_Release__c = press_Release__c;
        this.primary_Contacts__r = primary_Contacts__r;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.recordType = recordType;
        this.recordTypeId = recordTypeId;
        this.relativity_Analytics_Scheduled__c = relativity_Analytics_Scheduled__c;
        this.sales_Contact__c = sales_Contact__c;
        this.sales_Training_Attendees__c = sales_Training_Attendees__c;
        this.sales_Training_Date__c = sales_Training_Date__c;
        this.sales_Training_Post_Training_Notes__c = sales_Training_Post_Training_Notes__c;
        this.sales_Training_Scheduled__c = sales_Training_Scheduled__c;
        this.sales_login_to_Website_Created__c = sales_login_to_Website_Created__c;
        this.salt_vs_Pepper_Deployed__c = salt_vs_Pepper_Deployed__c;
        this.salt_vs_Pepper_Ticket__c = salt_vs_Pepper_Ticket__c;
        this.salt_vs_Pepper_Ticket__r = salt_vs_Pepper_Ticket__r;
        this.salt_vs_Pepper__c = salt_vs_Pepper__c;
        this.smokeTestSvP__c = smokeTestSvP__c;
        this.smokeTestSvP__r = smokeTestSvP__r;
        this.svP_Migrated__c = svP_Migrated__c;
        this.svP_Ticket_Status__c = svP_Ticket_Status__c;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
        this.training__r = training__r;
        this.trainings__r = trainings__r;
        this.update_Sales_Deck_Presentation__c = update_Sales_Deck_Presentation__c;
        this.website_activities_complete__c = website_activities_complete__c;
        this.x2_day_Admin_Training_Completed__c = x2_day_Admin_Training_Completed__c;
        this.x2_day_Admin_Training_Date__c = x2_day_Admin_Training_Date__c;
        this.x2_day_Admin_Training_Location__c = x2_day_Admin_Training_Location__c;
        this.x2_day_Admin_Training_Notes__c = x2_day_Admin_Training_Notes__c;
        this.x2_day_Admin_Training_Scheduled__c = x2_day_Admin_Training_Scheduled__c;
    }


    /**
     * Gets the account__c value for this Partner_Kickoff__c.
     * 
     * @return account__c
     */
    public java.lang.String getAccount__c() {
        return account__c;
    }


    /**
     * Sets the account__c value for this Partner_Kickoff__c.
     * 
     * @param account__c
     */
    public void setAccount__c(java.lang.String account__c) {
        this.account__c = account__c;
    }


    /**
     * Gets the account__r value for this Partner_Kickoff__c.
     * 
     * @return account__r
     */
    public com.sforce.soap.enterprise.sobject.Account getAccount__r() {
        return account__r;
    }


    /**
     * Sets the account__r value for this Partner_Kickoff__c.
     * 
     * @param account__r
     */
    public void setAccount__r(com.sforce.soap.enterprise.sobject.Account account__r) {
        this.account__r = account__r;
    }


    /**
     * Gets the activities_Completed__c value for this Partner_Kickoff__c.
     * 
     * @return activities_Completed__c
     */
    public java.lang.String getActivities_Completed__c() {
        return activities_Completed__c;
    }


    /**
     * Sets the activities_Completed__c value for this Partner_Kickoff__c.
     * 
     * @param activities_Completed__c
     */
    public void setActivities_Completed__c(java.lang.String activities_Completed__c) {
        this.activities_Completed__c = activities_Completed__c;
    }


    /**
     * Gets the activityHistories value for this Partner_Kickoff__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this Partner_Kickoff__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the admin_Contact__c value for this Partner_Kickoff__c.
     * 
     * @return admin_Contact__c
     */
    public java.lang.Boolean getAdmin_Contact__c() {
        return admin_Contact__c;
    }


    /**
     * Sets the admin_Contact__c value for this Partner_Kickoff__c.
     * 
     * @param admin_Contact__c
     */
    public void setAdmin_Contact__c(java.lang.Boolean admin_Contact__c) {
        this.admin_Contact__c = admin_Contact__c;
    }


    /**
     * Gets the admin_Training__c value for this Partner_Kickoff__c.
     * 
     * @return admin_Training__c
     */
    public java.lang.String getAdmin_Training__c() {
        return admin_Training__c;
    }


    /**
     * Sets the admin_Training__c value for this Partner_Kickoff__c.
     * 
     * @param admin_Training__c
     */
    public void setAdmin_Training__c(java.lang.String admin_Training__c) {
        this.admin_Training__c = admin_Training__c;
    }


    /**
     * Gets the admin_Training__r value for this Partner_Kickoff__c.
     * 
     * @return admin_Training__r
     */
    public com.sforce.soap.enterprise.sobject.Training_Relativity__c getAdmin_Training__r() {
        return admin_Training__r;
    }


    /**
     * Sets the admin_Training__r value for this Partner_Kickoff__c.
     * 
     * @param admin_Training__r
     */
    public void setAdmin_Training__r(com.sforce.soap.enterprise.sobject.Training_Relativity__c admin_Training__r) {
        this.admin_Training__r = admin_Training__r;
    }


    /**
     * Gets the attachments value for this Partner_Kickoff__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Partner_Kickoff__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the billing_Contact__c value for this Partner_Kickoff__c.
     * 
     * @return billing_Contact__c
     */
    public java.lang.Boolean getBilling_Contact__c() {
        return billing_Contact__c;
    }


    /**
     * Sets the billing_Contact__c value for this Partner_Kickoff__c.
     * 
     * @param billing_Contact__c
     */
    public void setBilling_Contact__c(java.lang.Boolean billing_Contact__c) {
        this.billing_Contact__c = billing_Contact__c;
    }


    /**
     * Gets the co_branded_Collateral_Sent__c value for this Partner_Kickoff__c.
     * 
     * @return co_branded_Collateral_Sent__c
     */
    public java.lang.String getCo_branded_Collateral_Sent__c() {
        return co_branded_Collateral_Sent__c;
    }


    /**
     * Sets the co_branded_Collateral_Sent__c value for this Partner_Kickoff__c.
     * 
     * @param co_branded_Collateral_Sent__c
     */
    public void setCo_branded_Collateral_Sent__c(java.lang.String co_branded_Collateral_Sent__c) {
        this.co_branded_Collateral_Sent__c = co_branded_Collateral_Sent__c;
    }


    /**
     * Gets the createdBy value for this Partner_Kickoff__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Partner_Kickoff__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Partner_Kickoff__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Partner_Kickoff__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Partner_Kickoff__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Partner_Kickoff__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the cust_Invoice_Summary_Sent_to_Acct__c value for this Partner_Kickoff__c.
     * 
     * @return cust_Invoice_Summary_Sent_to_Acct__c
     */
    public java.lang.String getCust_Invoice_Summary_Sent_to_Acct__c() {
        return cust_Invoice_Summary_Sent_to_Acct__c;
    }


    /**
     * Sets the cust_Invoice_Summary_Sent_to_Acct__c value for this Partner_Kickoff__c.
     * 
     * @param cust_Invoice_Summary_Sent_to_Acct__c
     */
    public void setCust_Invoice_Summary_Sent_to_Acct__c(java.lang.String cust_Invoice_Summary_Sent_to_Acct__c) {
        this.cust_Invoice_Summary_Sent_to_Acct__c = cust_Invoice_Summary_Sent_to_Acct__c;
    }


    /**
     * Gets the deployment_Completed__c value for this Partner_Kickoff__c.
     * 
     * @return deployment_Completed__c
     */
    public java.lang.String getDeployment_Completed__c() {
        return deployment_Completed__c;
    }


    /**
     * Sets the deployment_Completed__c value for this Partner_Kickoff__c.
     * 
     * @param deployment_Completed__c
     */
    public void setDeployment_Completed__c(java.lang.String deployment_Completed__c) {
        this.deployment_Completed__c = deployment_Completed__c;
    }


    /**
     * Gets the deployment_Date__c value for this Partner_Kickoff__c.
     * 
     * @return deployment_Date__c
     */
    public java.util.Date getDeployment_Date__c() {
        return deployment_Date__c;
    }


    /**
     * Sets the deployment_Date__c value for this Partner_Kickoff__c.
     * 
     * @param deployment_Date__c
     */
    public void setDeployment_Date__c(java.util.Date deployment_Date__c) {
        this.deployment_Date__c = deployment_Date__c;
    }


    /**
     * Gets the deployment_Scheduled__c value for this Partner_Kickoff__c.
     * 
     * @return deployment_Scheduled__c
     */
    public java.lang.String getDeployment_Scheduled__c() {
        return deployment_Scheduled__c;
    }


    /**
     * Sets the deployment_Scheduled__c value for this Partner_Kickoff__c.
     * 
     * @param deployment_Scheduled__c
     */
    public void setDeployment_Scheduled__c(java.lang.String deployment_Scheduled__c) {
        this.deployment_Scheduled__c = deployment_Scheduled__c;
    }


    /**
     * Gets the events value for this Partner_Kickoff__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Partner_Kickoff__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Partner_Kickoff__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Partner_Kickoff__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the histories value for this Partner_Kickoff__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Partner_Kickoff__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the infrastructure_Scheduled__c value for this Partner_Kickoff__c.
     * 
     * @return infrastructure_Scheduled__c
     */
    public java.lang.String getInfrastructure_Scheduled__c() {
        return infrastructure_Scheduled__c;
    }


    /**
     * Sets the infrastructure_Scheduled__c value for this Partner_Kickoff__c.
     * 
     * @param infrastructure_Scheduled__c
     */
    public void setInfrastructure_Scheduled__c(java.lang.String infrastructure_Scheduled__c) {
        this.infrastructure_Scheduled__c = infrastructure_Scheduled__c;
    }


    /**
     * Gets the isDeleted value for this Partner_Kickoff__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Partner_Kickoff__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the is_Partner_Kick_Off_Complete__c value for this Partner_Kickoff__c.
     * 
     * @return is_Partner_Kick_Off_Complete__c
     */
    public java.lang.String getIs_Partner_Kick_Off_Complete__c() {
        return is_Partner_Kick_Off_Complete__c;
    }


    /**
     * Sets the is_Partner_Kick_Off_Complete__c value for this Partner_Kickoff__c.
     * 
     * @param is_Partner_Kick_Off_Complete__c
     */
    public void setIs_Partner_Kick_Off_Complete__c(java.lang.String is_Partner_Kick_Off_Complete__c) {
        this.is_Partner_Kick_Off_Complete__c = is_Partner_Kick_Off_Complete__c;
    }


    /**
     * Gets the lastActivityDate value for this Partner_Kickoff__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Partner_Kickoff__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this Partner_Kickoff__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Partner_Kickoff__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Partner_Kickoff__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Partner_Kickoff__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Partner_Kickoff__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Partner_Kickoff__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the marketing_Owner__c value for this Partner_Kickoff__c.
     * 
     * @return marketing_Owner__c
     */
    public java.lang.String getMarketing_Owner__c() {
        return marketing_Owner__c;
    }


    /**
     * Sets the marketing_Owner__c value for this Partner_Kickoff__c.
     * 
     * @param marketing_Owner__c
     */
    public void setMarketing_Owner__c(java.lang.String marketing_Owner__c) {
        this.marketing_Owner__c = marketing_Owner__c;
    }


    /**
     * Gets the marketing_Owner__r value for this Partner_Kickoff__c.
     * 
     * @return marketing_Owner__r
     */
    public com.sforce.soap.enterprise.sobject.User getMarketing_Owner__r() {
        return marketing_Owner__r;
    }


    /**
     * Sets the marketing_Owner__r value for this Partner_Kickoff__c.
     * 
     * @param marketing_Owner__r
     */
    public void setMarketing_Owner__r(com.sforce.soap.enterprise.sobject.User marketing_Owner__r) {
        this.marketing_Owner__r = marketing_Owner__r;
    }


    /**
     * Gets the name value for this Partner_Kickoff__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Partner_Kickoff__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Partner_Kickoff__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Partner_Kickoff__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Partner_Kickoff__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Partner_Kickoff__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the onsite_Visits__r value for this Partner_Kickoff__c.
     * 
     * @return onsite_Visits__r
     */
    public com.sforce.soap.enterprise.QueryResult getOnsite_Visits__r() {
        return onsite_Visits__r;
    }


    /**
     * Sets the onsite_Visits__r value for this Partner_Kickoff__c.
     * 
     * @param onsite_Visits__r
     */
    public void setOnsite_Visits__r(com.sforce.soap.enterprise.QueryResult onsite_Visits__r) {
        this.onsite_Visits__r = onsite_Visits__r;
    }


    /**
     * Gets the openActivities value for this Partner_Kickoff__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this Partner_Kickoff__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the owner value for this Partner_Kickoff__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Partner_Kickoff__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Partner_Kickoff__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Partner_Kickoff__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the partner_Added_to_Complete_Vendor_List__c value for this Partner_Kickoff__c.
     * 
     * @return partner_Added_to_Complete_Vendor_List__c
     */
    public java.lang.String getPartner_Added_to_Complete_Vendor_List__c() {
        return partner_Added_to_Complete_Vendor_List__c;
    }


    /**
     * Sets the partner_Added_to_Complete_Vendor_List__c value for this Partner_Kickoff__c.
     * 
     * @param partner_Added_to_Complete_Vendor_List__c
     */
    public void setPartner_Added_to_Complete_Vendor_List__c(java.lang.String partner_Added_to_Complete_Vendor_List__c) {
        this.partner_Added_to_Complete_Vendor_List__c = partner_Added_to_Complete_Vendor_List__c;
    }


    /**
     * Gets the press_Release__c value for this Partner_Kickoff__c.
     * 
     * @return press_Release__c
     */
    public java.lang.String getPress_Release__c() {
        return press_Release__c;
    }


    /**
     * Sets the press_Release__c value for this Partner_Kickoff__c.
     * 
     * @param press_Release__c
     */
    public void setPress_Release__c(java.lang.String press_Release__c) {
        this.press_Release__c = press_Release__c;
    }


    /**
     * Gets the primary_Contacts__r value for this Partner_Kickoff__c.
     * 
     * @return primary_Contacts__r
     */
    public com.sforce.soap.enterprise.QueryResult getPrimary_Contacts__r() {
        return primary_Contacts__r;
    }


    /**
     * Sets the primary_Contacts__r value for this Partner_Kickoff__c.
     * 
     * @param primary_Contacts__r
     */
    public void setPrimary_Contacts__r(com.sforce.soap.enterprise.QueryResult primary_Contacts__r) {
        this.primary_Contacts__r = primary_Contacts__r;
    }


    /**
     * Gets the processInstances value for this Partner_Kickoff__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Partner_Kickoff__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Partner_Kickoff__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Partner_Kickoff__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the recordType value for this Partner_Kickoff__c.
     * 
     * @return recordType
     */
    public com.sforce.soap.enterprise.sobject.RecordType getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this Partner_Kickoff__c.
     * 
     * @param recordType
     */
    public void setRecordType(com.sforce.soap.enterprise.sobject.RecordType recordType) {
        this.recordType = recordType;
    }


    /**
     * Gets the recordTypeId value for this Partner_Kickoff__c.
     * 
     * @return recordTypeId
     */
    public java.lang.String getRecordTypeId() {
        return recordTypeId;
    }


    /**
     * Sets the recordTypeId value for this Partner_Kickoff__c.
     * 
     * @param recordTypeId
     */
    public void setRecordTypeId(java.lang.String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }


    /**
     * Gets the relativity_Analytics_Scheduled__c value for this Partner_Kickoff__c.
     * 
     * @return relativity_Analytics_Scheduled__c
     */
    public java.lang.String getRelativity_Analytics_Scheduled__c() {
        return relativity_Analytics_Scheduled__c;
    }


    /**
     * Sets the relativity_Analytics_Scheduled__c value for this Partner_Kickoff__c.
     * 
     * @param relativity_Analytics_Scheduled__c
     */
    public void setRelativity_Analytics_Scheduled__c(java.lang.String relativity_Analytics_Scheduled__c) {
        this.relativity_Analytics_Scheduled__c = relativity_Analytics_Scheduled__c;
    }


    /**
     * Gets the sales_Contact__c value for this Partner_Kickoff__c.
     * 
     * @return sales_Contact__c
     */
    public java.lang.Boolean getSales_Contact__c() {
        return sales_Contact__c;
    }


    /**
     * Sets the sales_Contact__c value for this Partner_Kickoff__c.
     * 
     * @param sales_Contact__c
     */
    public void setSales_Contact__c(java.lang.Boolean sales_Contact__c) {
        this.sales_Contact__c = sales_Contact__c;
    }


    /**
     * Gets the sales_Training_Attendees__c value for this Partner_Kickoff__c.
     * 
     * @return sales_Training_Attendees__c
     */
    public java.lang.String getSales_Training_Attendees__c() {
        return sales_Training_Attendees__c;
    }


    /**
     * Sets the sales_Training_Attendees__c value for this Partner_Kickoff__c.
     * 
     * @param sales_Training_Attendees__c
     */
    public void setSales_Training_Attendees__c(java.lang.String sales_Training_Attendees__c) {
        this.sales_Training_Attendees__c = sales_Training_Attendees__c;
    }


    /**
     * Gets the sales_Training_Date__c value for this Partner_Kickoff__c.
     * 
     * @return sales_Training_Date__c
     */
    public java.util.Date getSales_Training_Date__c() {
        return sales_Training_Date__c;
    }


    /**
     * Sets the sales_Training_Date__c value for this Partner_Kickoff__c.
     * 
     * @param sales_Training_Date__c
     */
    public void setSales_Training_Date__c(java.util.Date sales_Training_Date__c) {
        this.sales_Training_Date__c = sales_Training_Date__c;
    }


    /**
     * Gets the sales_Training_Post_Training_Notes__c value for this Partner_Kickoff__c.
     * 
     * @return sales_Training_Post_Training_Notes__c
     */
    public java.lang.String getSales_Training_Post_Training_Notes__c() {
        return sales_Training_Post_Training_Notes__c;
    }


    /**
     * Sets the sales_Training_Post_Training_Notes__c value for this Partner_Kickoff__c.
     * 
     * @param sales_Training_Post_Training_Notes__c
     */
    public void setSales_Training_Post_Training_Notes__c(java.lang.String sales_Training_Post_Training_Notes__c) {
        this.sales_Training_Post_Training_Notes__c = sales_Training_Post_Training_Notes__c;
    }


    /**
     * Gets the sales_Training_Scheduled__c value for this Partner_Kickoff__c.
     * 
     * @return sales_Training_Scheduled__c
     */
    public java.lang.String getSales_Training_Scheduled__c() {
        return sales_Training_Scheduled__c;
    }


    /**
     * Sets the sales_Training_Scheduled__c value for this Partner_Kickoff__c.
     * 
     * @param sales_Training_Scheduled__c
     */
    public void setSales_Training_Scheduled__c(java.lang.String sales_Training_Scheduled__c) {
        this.sales_Training_Scheduled__c = sales_Training_Scheduled__c;
    }


    /**
     * Gets the sales_login_to_Website_Created__c value for this Partner_Kickoff__c.
     * 
     * @return sales_login_to_Website_Created__c
     */
    public java.lang.String getSales_login_to_Website_Created__c() {
        return sales_login_to_Website_Created__c;
    }


    /**
     * Sets the sales_login_to_Website_Created__c value for this Partner_Kickoff__c.
     * 
     * @param sales_login_to_Website_Created__c
     */
    public void setSales_login_to_Website_Created__c(java.lang.String sales_login_to_Website_Created__c) {
        this.sales_login_to_Website_Created__c = sales_login_to_Website_Created__c;
    }


    /**
     * Gets the salt_vs_Pepper_Deployed__c value for this Partner_Kickoff__c.
     * 
     * @return salt_vs_Pepper_Deployed__c
     */
    public java.lang.String getSalt_vs_Pepper_Deployed__c() {
        return salt_vs_Pepper_Deployed__c;
    }


    /**
     * Sets the salt_vs_Pepper_Deployed__c value for this Partner_Kickoff__c.
     * 
     * @param salt_vs_Pepper_Deployed__c
     */
    public void setSalt_vs_Pepper_Deployed__c(java.lang.String salt_vs_Pepper_Deployed__c) {
        this.salt_vs_Pepper_Deployed__c = salt_vs_Pepper_Deployed__c;
    }


    /**
     * Gets the salt_vs_Pepper_Ticket__c value for this Partner_Kickoff__c.
     * 
     * @return salt_vs_Pepper_Ticket__c
     */
    public java.lang.String getSalt_vs_Pepper_Ticket__c() {
        return salt_vs_Pepper_Ticket__c;
    }


    /**
     * Sets the salt_vs_Pepper_Ticket__c value for this Partner_Kickoff__c.
     * 
     * @param salt_vs_Pepper_Ticket__c
     */
    public void setSalt_vs_Pepper_Ticket__c(java.lang.String salt_vs_Pepper_Ticket__c) {
        this.salt_vs_Pepper_Ticket__c = salt_vs_Pepper_Ticket__c;
    }


    /**
     * Gets the salt_vs_Pepper_Ticket__r value for this Partner_Kickoff__c.
     * 
     * @return salt_vs_Pepper_Ticket__r
     */
    public com.sforce.soap.enterprise.sobject._case getSalt_vs_Pepper_Ticket__r() {
        return salt_vs_Pepper_Ticket__r;
    }


    /**
     * Sets the salt_vs_Pepper_Ticket__r value for this Partner_Kickoff__c.
     * 
     * @param salt_vs_Pepper_Ticket__r
     */
    public void setSalt_vs_Pepper_Ticket__r(com.sforce.soap.enterprise.sobject._case salt_vs_Pepper_Ticket__r) {
        this.salt_vs_Pepper_Ticket__r = salt_vs_Pepper_Ticket__r;
    }


    /**
     * Gets the salt_vs_Pepper__c value for this Partner_Kickoff__c.
     * 
     * @return salt_vs_Pepper__c
     */
    public java.lang.String getSalt_vs_Pepper__c() {
        return salt_vs_Pepper__c;
    }


    /**
     * Sets the salt_vs_Pepper__c value for this Partner_Kickoff__c.
     * 
     * @param salt_vs_Pepper__c
     */
    public void setSalt_vs_Pepper__c(java.lang.String salt_vs_Pepper__c) {
        this.salt_vs_Pepper__c = salt_vs_Pepper__c;
    }


    /**
     * Gets the smokeTestSvP__c value for this Partner_Kickoff__c.
     * 
     * @return smokeTestSvP__c
     */
    public java.lang.String getSmokeTestSvP__c() {
        return smokeTestSvP__c;
    }


    /**
     * Sets the smokeTestSvP__c value for this Partner_Kickoff__c.
     * 
     * @param smokeTestSvP__c
     */
    public void setSmokeTestSvP__c(java.lang.String smokeTestSvP__c) {
        this.smokeTestSvP__c = smokeTestSvP__c;
    }


    /**
     * Gets the smokeTestSvP__r value for this Partner_Kickoff__c.
     * 
     * @return smokeTestSvP__r
     */
    public com.sforce.soap.enterprise.sobject.User getSmokeTestSvP__r() {
        return smokeTestSvP__r;
    }


    /**
     * Sets the smokeTestSvP__r value for this Partner_Kickoff__c.
     * 
     * @param smokeTestSvP__r
     */
    public void setSmokeTestSvP__r(com.sforce.soap.enterprise.sobject.User smokeTestSvP__r) {
        this.smokeTestSvP__r = smokeTestSvP__r;
    }


    /**
     * Gets the svP_Migrated__c value for this Partner_Kickoff__c.
     * 
     * @return svP_Migrated__c
     */
    public java.lang.String getSvP_Migrated__c() {
        return svP_Migrated__c;
    }


    /**
     * Sets the svP_Migrated__c value for this Partner_Kickoff__c.
     * 
     * @param svP_Migrated__c
     */
    public void setSvP_Migrated__c(java.lang.String svP_Migrated__c) {
        this.svP_Migrated__c = svP_Migrated__c;
    }


    /**
     * Gets the svP_Ticket_Status__c value for this Partner_Kickoff__c.
     * 
     * @return svP_Ticket_Status__c
     */
    public java.lang.String getSvP_Ticket_Status__c() {
        return svP_Ticket_Status__c;
    }


    /**
     * Sets the svP_Ticket_Status__c value for this Partner_Kickoff__c.
     * 
     * @param svP_Ticket_Status__c
     */
    public void setSvP_Ticket_Status__c(java.lang.String svP_Ticket_Status__c) {
        this.svP_Ticket_Status__c = svP_Ticket_Status__c;
    }


    /**
     * Gets the systemModstamp value for this Partner_Kickoff__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Partner_Kickoff__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this Partner_Kickoff__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Partner_Kickoff__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the training__r value for this Partner_Kickoff__c.
     * 
     * @return training__r
     */
    public com.sforce.soap.enterprise.QueryResult getTraining__r() {
        return training__r;
    }


    /**
     * Sets the training__r value for this Partner_Kickoff__c.
     * 
     * @param training__r
     */
    public void setTraining__r(com.sforce.soap.enterprise.QueryResult training__r) {
        this.training__r = training__r;
    }


    /**
     * Gets the trainings__r value for this Partner_Kickoff__c.
     * 
     * @return trainings__r
     */
    public com.sforce.soap.enterprise.QueryResult getTrainings__r() {
        return trainings__r;
    }


    /**
     * Sets the trainings__r value for this Partner_Kickoff__c.
     * 
     * @param trainings__r
     */
    public void setTrainings__r(com.sforce.soap.enterprise.QueryResult trainings__r) {
        this.trainings__r = trainings__r;
    }


    /**
     * Gets the update_Sales_Deck_Presentation__c value for this Partner_Kickoff__c.
     * 
     * @return update_Sales_Deck_Presentation__c
     */
    public java.lang.String getUpdate_Sales_Deck_Presentation__c() {
        return update_Sales_Deck_Presentation__c;
    }


    /**
     * Sets the update_Sales_Deck_Presentation__c value for this Partner_Kickoff__c.
     * 
     * @param update_Sales_Deck_Presentation__c
     */
    public void setUpdate_Sales_Deck_Presentation__c(java.lang.String update_Sales_Deck_Presentation__c) {
        this.update_Sales_Deck_Presentation__c = update_Sales_Deck_Presentation__c;
    }


    /**
     * Gets the website_activities_complete__c value for this Partner_Kickoff__c.
     * 
     * @return website_activities_complete__c
     */
    public java.lang.String getWebsite_activities_complete__c() {
        return website_activities_complete__c;
    }


    /**
     * Sets the website_activities_complete__c value for this Partner_Kickoff__c.
     * 
     * @param website_activities_complete__c
     */
    public void setWebsite_activities_complete__c(java.lang.String website_activities_complete__c) {
        this.website_activities_complete__c = website_activities_complete__c;
    }


    /**
     * Gets the x2_day_Admin_Training_Completed__c value for this Partner_Kickoff__c.
     * 
     * @return x2_day_Admin_Training_Completed__c
     */
    public java.lang.String getX2_day_Admin_Training_Completed__c() {
        return x2_day_Admin_Training_Completed__c;
    }


    /**
     * Sets the x2_day_Admin_Training_Completed__c value for this Partner_Kickoff__c.
     * 
     * @param x2_day_Admin_Training_Completed__c
     */
    public void setX2_day_Admin_Training_Completed__c(java.lang.String x2_day_Admin_Training_Completed__c) {
        this.x2_day_Admin_Training_Completed__c = x2_day_Admin_Training_Completed__c;
    }


    /**
     * Gets the x2_day_Admin_Training_Date__c value for this Partner_Kickoff__c.
     * 
     * @return x2_day_Admin_Training_Date__c
     */
    public java.util.Date getX2_day_Admin_Training_Date__c() {
        return x2_day_Admin_Training_Date__c;
    }


    /**
     * Sets the x2_day_Admin_Training_Date__c value for this Partner_Kickoff__c.
     * 
     * @param x2_day_Admin_Training_Date__c
     */
    public void setX2_day_Admin_Training_Date__c(java.util.Date x2_day_Admin_Training_Date__c) {
        this.x2_day_Admin_Training_Date__c = x2_day_Admin_Training_Date__c;
    }


    /**
     * Gets the x2_day_Admin_Training_Location__c value for this Partner_Kickoff__c.
     * 
     * @return x2_day_Admin_Training_Location__c
     */
    public java.lang.String getX2_day_Admin_Training_Location__c() {
        return x2_day_Admin_Training_Location__c;
    }


    /**
     * Sets the x2_day_Admin_Training_Location__c value for this Partner_Kickoff__c.
     * 
     * @param x2_day_Admin_Training_Location__c
     */
    public void setX2_day_Admin_Training_Location__c(java.lang.String x2_day_Admin_Training_Location__c) {
        this.x2_day_Admin_Training_Location__c = x2_day_Admin_Training_Location__c;
    }


    /**
     * Gets the x2_day_Admin_Training_Notes__c value for this Partner_Kickoff__c.
     * 
     * @return x2_day_Admin_Training_Notes__c
     */
    public java.lang.String getX2_day_Admin_Training_Notes__c() {
        return x2_day_Admin_Training_Notes__c;
    }


    /**
     * Sets the x2_day_Admin_Training_Notes__c value for this Partner_Kickoff__c.
     * 
     * @param x2_day_Admin_Training_Notes__c
     */
    public void setX2_day_Admin_Training_Notes__c(java.lang.String x2_day_Admin_Training_Notes__c) {
        this.x2_day_Admin_Training_Notes__c = x2_day_Admin_Training_Notes__c;
    }


    /**
     * Gets the x2_day_Admin_Training_Scheduled__c value for this Partner_Kickoff__c.
     * 
     * @return x2_day_Admin_Training_Scheduled__c
     */
    public java.lang.String getX2_day_Admin_Training_Scheduled__c() {
        return x2_day_Admin_Training_Scheduled__c;
    }


    /**
     * Sets the x2_day_Admin_Training_Scheduled__c value for this Partner_Kickoff__c.
     * 
     * @param x2_day_Admin_Training_Scheduled__c
     */
    public void setX2_day_Admin_Training_Scheduled__c(java.lang.String x2_day_Admin_Training_Scheduled__c) {
        this.x2_day_Admin_Training_Scheduled__c = x2_day_Admin_Training_Scheduled__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Partner_Kickoff__c)) return false;
        Partner_Kickoff__c other = (Partner_Kickoff__c) obj;
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
            ((this.activities_Completed__c==null && other.getActivities_Completed__c()==null) || 
             (this.activities_Completed__c!=null &&
              this.activities_Completed__c.equals(other.getActivities_Completed__c()))) &&
            ((this.activityHistories==null && other.getActivityHistories()==null) || 
             (this.activityHistories!=null &&
              this.activityHistories.equals(other.getActivityHistories()))) &&
            ((this.admin_Contact__c==null && other.getAdmin_Contact__c()==null) || 
             (this.admin_Contact__c!=null &&
              this.admin_Contact__c.equals(other.getAdmin_Contact__c()))) &&
            ((this.admin_Training__c==null && other.getAdmin_Training__c()==null) || 
             (this.admin_Training__c!=null &&
              this.admin_Training__c.equals(other.getAdmin_Training__c()))) &&
            ((this.admin_Training__r==null && other.getAdmin_Training__r()==null) || 
             (this.admin_Training__r!=null &&
              this.admin_Training__r.equals(other.getAdmin_Training__r()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.billing_Contact__c==null && other.getBilling_Contact__c()==null) || 
             (this.billing_Contact__c!=null &&
              this.billing_Contact__c.equals(other.getBilling_Contact__c()))) &&
            ((this.co_branded_Collateral_Sent__c==null && other.getCo_branded_Collateral_Sent__c()==null) || 
             (this.co_branded_Collateral_Sent__c!=null &&
              this.co_branded_Collateral_Sent__c.equals(other.getCo_branded_Collateral_Sent__c()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.cust_Invoice_Summary_Sent_to_Acct__c==null && other.getCust_Invoice_Summary_Sent_to_Acct__c()==null) || 
             (this.cust_Invoice_Summary_Sent_to_Acct__c!=null &&
              this.cust_Invoice_Summary_Sent_to_Acct__c.equals(other.getCust_Invoice_Summary_Sent_to_Acct__c()))) &&
            ((this.deployment_Completed__c==null && other.getDeployment_Completed__c()==null) || 
             (this.deployment_Completed__c!=null &&
              this.deployment_Completed__c.equals(other.getDeployment_Completed__c()))) &&
            ((this.deployment_Date__c==null && other.getDeployment_Date__c()==null) || 
             (this.deployment_Date__c!=null &&
              this.deployment_Date__c.equals(other.getDeployment_Date__c()))) &&
            ((this.deployment_Scheduled__c==null && other.getDeployment_Scheduled__c()==null) || 
             (this.deployment_Scheduled__c!=null &&
              this.deployment_Scheduled__c.equals(other.getDeployment_Scheduled__c()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              this.events.equals(other.getEvents()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
            ((this.infrastructure_Scheduled__c==null && other.getInfrastructure_Scheduled__c()==null) || 
             (this.infrastructure_Scheduled__c!=null &&
              this.infrastructure_Scheduled__c.equals(other.getInfrastructure_Scheduled__c()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.is_Partner_Kick_Off_Complete__c==null && other.getIs_Partner_Kick_Off_Complete__c()==null) || 
             (this.is_Partner_Kick_Off_Complete__c!=null &&
              this.is_Partner_Kick_Off_Complete__c.equals(other.getIs_Partner_Kick_Off_Complete__c()))) &&
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
            ((this.marketing_Owner__c==null && other.getMarketing_Owner__c()==null) || 
             (this.marketing_Owner__c!=null &&
              this.marketing_Owner__c.equals(other.getMarketing_Owner__c()))) &&
            ((this.marketing_Owner__r==null && other.getMarketing_Owner__r()==null) || 
             (this.marketing_Owner__r!=null &&
              this.marketing_Owner__r.equals(other.getMarketing_Owner__r()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.onsite_Visits__r==null && other.getOnsite_Visits__r()==null) || 
             (this.onsite_Visits__r!=null &&
              this.onsite_Visits__r.equals(other.getOnsite_Visits__r()))) &&
            ((this.openActivities==null && other.getOpenActivities()==null) || 
             (this.openActivities!=null &&
              this.openActivities.equals(other.getOpenActivities()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.partner_Added_to_Complete_Vendor_List__c==null && other.getPartner_Added_to_Complete_Vendor_List__c()==null) || 
             (this.partner_Added_to_Complete_Vendor_List__c!=null &&
              this.partner_Added_to_Complete_Vendor_List__c.equals(other.getPartner_Added_to_Complete_Vendor_List__c()))) &&
            ((this.press_Release__c==null && other.getPress_Release__c()==null) || 
             (this.press_Release__c!=null &&
              this.press_Release__c.equals(other.getPress_Release__c()))) &&
            ((this.primary_Contacts__r==null && other.getPrimary_Contacts__r()==null) || 
             (this.primary_Contacts__r!=null &&
              this.primary_Contacts__r.equals(other.getPrimary_Contacts__r()))) &&
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
            ((this.relativity_Analytics_Scheduled__c==null && other.getRelativity_Analytics_Scheduled__c()==null) || 
             (this.relativity_Analytics_Scheduled__c!=null &&
              this.relativity_Analytics_Scheduled__c.equals(other.getRelativity_Analytics_Scheduled__c()))) &&
            ((this.sales_Contact__c==null && other.getSales_Contact__c()==null) || 
             (this.sales_Contact__c!=null &&
              this.sales_Contact__c.equals(other.getSales_Contact__c()))) &&
            ((this.sales_Training_Attendees__c==null && other.getSales_Training_Attendees__c()==null) || 
             (this.sales_Training_Attendees__c!=null &&
              this.sales_Training_Attendees__c.equals(other.getSales_Training_Attendees__c()))) &&
            ((this.sales_Training_Date__c==null && other.getSales_Training_Date__c()==null) || 
             (this.sales_Training_Date__c!=null &&
              this.sales_Training_Date__c.equals(other.getSales_Training_Date__c()))) &&
            ((this.sales_Training_Post_Training_Notes__c==null && other.getSales_Training_Post_Training_Notes__c()==null) || 
             (this.sales_Training_Post_Training_Notes__c!=null &&
              this.sales_Training_Post_Training_Notes__c.equals(other.getSales_Training_Post_Training_Notes__c()))) &&
            ((this.sales_Training_Scheduled__c==null && other.getSales_Training_Scheduled__c()==null) || 
             (this.sales_Training_Scheduled__c!=null &&
              this.sales_Training_Scheduled__c.equals(other.getSales_Training_Scheduled__c()))) &&
            ((this.sales_login_to_Website_Created__c==null && other.getSales_login_to_Website_Created__c()==null) || 
             (this.sales_login_to_Website_Created__c!=null &&
              this.sales_login_to_Website_Created__c.equals(other.getSales_login_to_Website_Created__c()))) &&
            ((this.salt_vs_Pepper_Deployed__c==null && other.getSalt_vs_Pepper_Deployed__c()==null) || 
             (this.salt_vs_Pepper_Deployed__c!=null &&
              this.salt_vs_Pepper_Deployed__c.equals(other.getSalt_vs_Pepper_Deployed__c()))) &&
            ((this.salt_vs_Pepper_Ticket__c==null && other.getSalt_vs_Pepper_Ticket__c()==null) || 
             (this.salt_vs_Pepper_Ticket__c!=null &&
              this.salt_vs_Pepper_Ticket__c.equals(other.getSalt_vs_Pepper_Ticket__c()))) &&
            ((this.salt_vs_Pepper_Ticket__r==null && other.getSalt_vs_Pepper_Ticket__r()==null) || 
             (this.salt_vs_Pepper_Ticket__r!=null &&
              this.salt_vs_Pepper_Ticket__r.equals(other.getSalt_vs_Pepper_Ticket__r()))) &&
            ((this.salt_vs_Pepper__c==null && other.getSalt_vs_Pepper__c()==null) || 
             (this.salt_vs_Pepper__c!=null &&
              this.salt_vs_Pepper__c.equals(other.getSalt_vs_Pepper__c()))) &&
            ((this.smokeTestSvP__c==null && other.getSmokeTestSvP__c()==null) || 
             (this.smokeTestSvP__c!=null &&
              this.smokeTestSvP__c.equals(other.getSmokeTestSvP__c()))) &&
            ((this.smokeTestSvP__r==null && other.getSmokeTestSvP__r()==null) || 
             (this.smokeTestSvP__r!=null &&
              this.smokeTestSvP__r.equals(other.getSmokeTestSvP__r()))) &&
            ((this.svP_Migrated__c==null && other.getSvP_Migrated__c()==null) || 
             (this.svP_Migrated__c!=null &&
              this.svP_Migrated__c.equals(other.getSvP_Migrated__c()))) &&
            ((this.svP_Ticket_Status__c==null && other.getSvP_Ticket_Status__c()==null) || 
             (this.svP_Ticket_Status__c!=null &&
              this.svP_Ticket_Status__c.equals(other.getSvP_Ticket_Status__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              this.tasks.equals(other.getTasks()))) &&
            ((this.training__r==null && other.getTraining__r()==null) || 
             (this.training__r!=null &&
              this.training__r.equals(other.getTraining__r()))) &&
            ((this.trainings__r==null && other.getTrainings__r()==null) || 
             (this.trainings__r!=null &&
              this.trainings__r.equals(other.getTrainings__r()))) &&
            ((this.update_Sales_Deck_Presentation__c==null && other.getUpdate_Sales_Deck_Presentation__c()==null) || 
             (this.update_Sales_Deck_Presentation__c!=null &&
              this.update_Sales_Deck_Presentation__c.equals(other.getUpdate_Sales_Deck_Presentation__c()))) &&
            ((this.website_activities_complete__c==null && other.getWebsite_activities_complete__c()==null) || 
             (this.website_activities_complete__c!=null &&
              this.website_activities_complete__c.equals(other.getWebsite_activities_complete__c()))) &&
            ((this.x2_day_Admin_Training_Completed__c==null && other.getX2_day_Admin_Training_Completed__c()==null) || 
             (this.x2_day_Admin_Training_Completed__c!=null &&
              this.x2_day_Admin_Training_Completed__c.equals(other.getX2_day_Admin_Training_Completed__c()))) &&
            ((this.x2_day_Admin_Training_Date__c==null && other.getX2_day_Admin_Training_Date__c()==null) || 
             (this.x2_day_Admin_Training_Date__c!=null &&
              this.x2_day_Admin_Training_Date__c.equals(other.getX2_day_Admin_Training_Date__c()))) &&
            ((this.x2_day_Admin_Training_Location__c==null && other.getX2_day_Admin_Training_Location__c()==null) || 
             (this.x2_day_Admin_Training_Location__c!=null &&
              this.x2_day_Admin_Training_Location__c.equals(other.getX2_day_Admin_Training_Location__c()))) &&
            ((this.x2_day_Admin_Training_Notes__c==null && other.getX2_day_Admin_Training_Notes__c()==null) || 
             (this.x2_day_Admin_Training_Notes__c!=null &&
              this.x2_day_Admin_Training_Notes__c.equals(other.getX2_day_Admin_Training_Notes__c()))) &&
            ((this.x2_day_Admin_Training_Scheduled__c==null && other.getX2_day_Admin_Training_Scheduled__c()==null) || 
             (this.x2_day_Admin_Training_Scheduled__c!=null &&
              this.x2_day_Admin_Training_Scheduled__c.equals(other.getX2_day_Admin_Training_Scheduled__c())));
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
        if (getActivities_Completed__c() != null) {
            _hashCode += getActivities_Completed__c().hashCode();
        }
        if (getActivityHistories() != null) {
            _hashCode += getActivityHistories().hashCode();
        }
        if (getAdmin_Contact__c() != null) {
            _hashCode += getAdmin_Contact__c().hashCode();
        }
        if (getAdmin_Training__c() != null) {
            _hashCode += getAdmin_Training__c().hashCode();
        }
        if (getAdmin_Training__r() != null) {
            _hashCode += getAdmin_Training__r().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getBilling_Contact__c() != null) {
            _hashCode += getBilling_Contact__c().hashCode();
        }
        if (getCo_branded_Collateral_Sent__c() != null) {
            _hashCode += getCo_branded_Collateral_Sent__c().hashCode();
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
        if (getCust_Invoice_Summary_Sent_to_Acct__c() != null) {
            _hashCode += getCust_Invoice_Summary_Sent_to_Acct__c().hashCode();
        }
        if (getDeployment_Completed__c() != null) {
            _hashCode += getDeployment_Completed__c().hashCode();
        }
        if (getDeployment_Date__c() != null) {
            _hashCode += getDeployment_Date__c().hashCode();
        }
        if (getDeployment_Scheduled__c() != null) {
            _hashCode += getDeployment_Scheduled__c().hashCode();
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
        if (getInfrastructure_Scheduled__c() != null) {
            _hashCode += getInfrastructure_Scheduled__c().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getIs_Partner_Kick_Off_Complete__c() != null) {
            _hashCode += getIs_Partner_Kick_Off_Complete__c().hashCode();
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
        if (getMarketing_Owner__c() != null) {
            _hashCode += getMarketing_Owner__c().hashCode();
        }
        if (getMarketing_Owner__r() != null) {
            _hashCode += getMarketing_Owner__r().hashCode();
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
        if (getOnsite_Visits__r() != null) {
            _hashCode += getOnsite_Visits__r().hashCode();
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
        if (getPartner_Added_to_Complete_Vendor_List__c() != null) {
            _hashCode += getPartner_Added_to_Complete_Vendor_List__c().hashCode();
        }
        if (getPress_Release__c() != null) {
            _hashCode += getPress_Release__c().hashCode();
        }
        if (getPrimary_Contacts__r() != null) {
            _hashCode += getPrimary_Contacts__r().hashCode();
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
        if (getRelativity_Analytics_Scheduled__c() != null) {
            _hashCode += getRelativity_Analytics_Scheduled__c().hashCode();
        }
        if (getSales_Contact__c() != null) {
            _hashCode += getSales_Contact__c().hashCode();
        }
        if (getSales_Training_Attendees__c() != null) {
            _hashCode += getSales_Training_Attendees__c().hashCode();
        }
        if (getSales_Training_Date__c() != null) {
            _hashCode += getSales_Training_Date__c().hashCode();
        }
        if (getSales_Training_Post_Training_Notes__c() != null) {
            _hashCode += getSales_Training_Post_Training_Notes__c().hashCode();
        }
        if (getSales_Training_Scheduled__c() != null) {
            _hashCode += getSales_Training_Scheduled__c().hashCode();
        }
        if (getSales_login_to_Website_Created__c() != null) {
            _hashCode += getSales_login_to_Website_Created__c().hashCode();
        }
        if (getSalt_vs_Pepper_Deployed__c() != null) {
            _hashCode += getSalt_vs_Pepper_Deployed__c().hashCode();
        }
        if (getSalt_vs_Pepper_Ticket__c() != null) {
            _hashCode += getSalt_vs_Pepper_Ticket__c().hashCode();
        }
        if (getSalt_vs_Pepper_Ticket__r() != null) {
            _hashCode += getSalt_vs_Pepper_Ticket__r().hashCode();
        }
        if (getSalt_vs_Pepper__c() != null) {
            _hashCode += getSalt_vs_Pepper__c().hashCode();
        }
        if (getSmokeTestSvP__c() != null) {
            _hashCode += getSmokeTestSvP__c().hashCode();
        }
        if (getSmokeTestSvP__r() != null) {
            _hashCode += getSmokeTestSvP__r().hashCode();
        }
        if (getSvP_Migrated__c() != null) {
            _hashCode += getSvP_Migrated__c().hashCode();
        }
        if (getSvP_Ticket_Status__c() != null) {
            _hashCode += getSvP_Ticket_Status__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTasks() != null) {
            _hashCode += getTasks().hashCode();
        }
        if (getTraining__r() != null) {
            _hashCode += getTraining__r().hashCode();
        }
        if (getTrainings__r() != null) {
            _hashCode += getTrainings__r().hashCode();
        }
        if (getUpdate_Sales_Deck_Presentation__c() != null) {
            _hashCode += getUpdate_Sales_Deck_Presentation__c().hashCode();
        }
        if (getWebsite_activities_complete__c() != null) {
            _hashCode += getWebsite_activities_complete__c().hashCode();
        }
        if (getX2_day_Admin_Training_Completed__c() != null) {
            _hashCode += getX2_day_Admin_Training_Completed__c().hashCode();
        }
        if (getX2_day_Admin_Training_Date__c() != null) {
            _hashCode += getX2_day_Admin_Training_Date__c().hashCode();
        }
        if (getX2_day_Admin_Training_Location__c() != null) {
            _hashCode += getX2_day_Admin_Training_Location__c().hashCode();
        }
        if (getX2_day_Admin_Training_Notes__c() != null) {
            _hashCode += getX2_day_Admin_Training_Notes__c().hashCode();
        }
        if (getX2_day_Admin_Training_Scheduled__c() != null) {
            _hashCode += getX2_day_Admin_Training_Scheduled__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Partner_Kickoff__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Partner_Kickoff__c"));
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
        elemField.setFieldName("activities_Completed__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Activities_Completed__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("admin_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Admin_Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("admin_Training__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Admin_Training__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("admin_Training__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Admin_Training__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Relativity__c"));
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
        elemField.setFieldName("billing_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Billing_Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("co_branded_Collateral_Sent__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Co_branded_Collateral_Sent__c"));
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
        elemField.setFieldName("cust_Invoice_Summary_Sent_to_Acct__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Cust_Invoice_Summary_Sent_to_Acct__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deployment_Completed__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Deployment_Completed__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deployment_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Deployment_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deployment_Scheduled__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Deployment_Scheduled__c"));
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
        elemField.setFieldName("infrastructure_Scheduled__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Infrastructure_Scheduled__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("is_Partner_Kick_Off_Complete__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Is_Partner_Kick_Off_Complete__c"));
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
        elemField.setFieldName("marketing_Owner__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Marketing_Owner__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketing_Owner__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Marketing_Owner__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
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
        elemField.setFieldName("onsite_Visits__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Onsite_Visits__r"));
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
        elemField.setFieldName("partner_Added_to_Complete_Vendor_List__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Partner_Added_to_Complete_Vendor_List__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("press_Release__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Press_Release__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primary_Contacts__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Primary_Contacts__r"));
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
        elemField.setFieldName("relativity_Analytics_Scheduled__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relativity_Analytics_Scheduled__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sales_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Sales_Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sales_Training_Attendees__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Sales_Training_Attendees__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sales_Training_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Sales_Training_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sales_Training_Post_Training_Notes__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Sales_Training_Post_Training_Notes__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sales_Training_Scheduled__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Sales_Training_Scheduled__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sales_login_to_Website_Created__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Sales_login_to_Website_Created__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salt_vs_Pepper_Deployed__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Salt_vs_Pepper_Deployed__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salt_vs_Pepper_Ticket__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Salt_vs_Pepper_Ticket__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salt_vs_Pepper_Ticket__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Salt_vs_Pepper_Ticket__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salt_vs_Pepper__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Salt_vs_Pepper__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smokeTestSvP__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SmokeTestSvP__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smokeTestSvP__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SmokeTestSvP__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svP_Migrated__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SvP_Migrated__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svP_Ticket_Status__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SvP_Ticket_Status__c"));
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
        elemField.setFieldName("training__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trainings__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Trainings__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("update_Sales_Deck_Presentation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Update_Sales_Deck_Presentation__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("website_activities_complete__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Website_activities_complete__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("x2_day_Admin_Training_Completed__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "X2_day_Admin_Training_Completed__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("x2_day_Admin_Training_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "X2_day_Admin_Training_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("x2_day_Admin_Training_Location__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "X2_day_Admin_Training_Location__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("x2_day_Admin_Training_Notes__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "X2_day_Admin_Training_Notes__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("x2_day_Admin_Training_Scheduled__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "X2_day_Admin_Training_Scheduled__c"));
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

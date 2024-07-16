/**
 * Channel_Mgr_Outline__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Channel_Mgr_Outline__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String account__c;

    private com.sforce.soap.enterprise.sobject.Account account__r;

    private java.lang.String activities_Completed__c;

    private java.lang.String admin_Training_Completed__c;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private com.sforce.soap.enterprise.QueryResult channel_Mgr_Outline_Contacts__r;

    private java.lang.String collection_Issue__c;

    private java.util.Date collections_Last_Modified_Date__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String deployment_Completed__c;

    private java.util.Date deployment_Date__c;

    private java.lang.String deployment_Scheduled__c;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.lang.String finance_Contact__c;

    private com.sforce.soap.enterprise.sobject.Contact finance_Contact__r;

    private java.lang.String had_great_partner_Discussion_with__c;

    private com.sforce.soap.enterprise.sobject.Contact had_great_partner_Discussion_with__r;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.String infrastructure_Scheduled__c;

    private java.lang.Boolean intro_Call_w_CS_Pod_Manager_Completed__c;

    private java.lang.Boolean isDeleted;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String marketing_Owner__c;

    private com.sforce.soap.enterprise.sobject.User marketing_Owner__r;

    private com.sforce.soap.enterprise.QueryResult meetings__r;

    private java.lang.Double mid_Size_Partner_Complete__c;

    private com.sforce.soap.enterprise.QueryResult monthly_Billings__r;

    private java.lang.String name;

    private java.lang.Double new_Partner_Complete__c;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private com.sforce.soap.enterprise.QueryResult other_Review_Solutions__r;

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private java.lang.Boolean partner_Manual_Sent__c;

    private java.lang.String partner_Type__c;

    private com.sforce.soap.enterprise.QueryResult primary_Contacts__r;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private com.sforce.soap.enterprise.sobject.RecordType recordType;

    private java.lang.String recordTypeId;

    private java.lang.String relationship_Metric__c;

    private java.lang.String relativity_Analytics_Scheduled__c;

    private java.util.Date sales_Training_Date__c;

    private java.lang.String sales_Training_Scheduled__c;

    private java.lang.String salt_vs_Pepper_Deployed__c;

    private java.lang.String smoke_Test_SvP__c;

    private com.sforce.soap.enterprise.sobject.User smoke_Test_SvP__r;

    private java.lang.Boolean status_Call_Scheduled__c;

    private java.util.Calendar systemModstamp;

    private java.lang.String what_do_they_want_to_achieve_in_3_months__c;

    private java.lang.String what_do_they_want_to_achieve_in_6_months__c;

    private java.lang.String what_do_they_want_to_achieve_in_9_months__c;

    private java.lang.String what_is_unique_value_proposition__c;

    public Channel_Mgr_Outline__c() {
    }

    public Channel_Mgr_Outline__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String account__c,
           com.sforce.soap.enterprise.sobject.Account account__r,
           java.lang.String activities_Completed__c,
           java.lang.String admin_Training_Completed__c,
           com.sforce.soap.enterprise.QueryResult attachments,
           com.sforce.soap.enterprise.QueryResult channel_Mgr_Outline_Contacts__r,
           java.lang.String collection_Issue__c,
           java.util.Date collections_Last_Modified_Date__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String deployment_Completed__c,
           java.util.Date deployment_Date__c,
           java.lang.String deployment_Scheduled__c,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.lang.String finance_Contact__c,
           com.sforce.soap.enterprise.sobject.Contact finance_Contact__r,
           java.lang.String had_great_partner_Discussion_with__c,
           com.sforce.soap.enterprise.sobject.Contact had_great_partner_Discussion_with__r,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.String infrastructure_Scheduled__c,
           java.lang.Boolean intro_Call_w_CS_Pod_Manager_Completed__c,
           java.lang.Boolean isDeleted,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String marketing_Owner__c,
           com.sforce.soap.enterprise.sobject.User marketing_Owner__r,
           com.sforce.soap.enterprise.QueryResult meetings__r,
           java.lang.Double mid_Size_Partner_Complete__c,
           com.sforce.soap.enterprise.QueryResult monthly_Billings__r,
           java.lang.String name,
           java.lang.Double new_Partner_Complete__c,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           com.sforce.soap.enterprise.QueryResult other_Review_Solutions__r,
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           java.lang.Boolean partner_Manual_Sent__c,
           java.lang.String partner_Type__c,
           com.sforce.soap.enterprise.QueryResult primary_Contacts__r,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           com.sforce.soap.enterprise.sobject.RecordType recordType,
           java.lang.String recordTypeId,
           java.lang.String relationship_Metric__c,
           java.lang.String relativity_Analytics_Scheduled__c,
           java.util.Date sales_Training_Date__c,
           java.lang.String sales_Training_Scheduled__c,
           java.lang.String salt_vs_Pepper_Deployed__c,
           java.lang.String smoke_Test_SvP__c,
           com.sforce.soap.enterprise.sobject.User smoke_Test_SvP__r,
           java.lang.Boolean status_Call_Scheduled__c,
           java.util.Calendar systemModstamp,
           java.lang.String what_do_they_want_to_achieve_in_3_months__c,
           java.lang.String what_do_they_want_to_achieve_in_6_months__c,
           java.lang.String what_do_they_want_to_achieve_in_9_months__c,
           java.lang.String what_is_unique_value_proposition__c) {
        super(
            fieldsToNull,
            id);
        this.account__c = account__c;
        this.account__r = account__r;
        this.activities_Completed__c = activities_Completed__c;
        this.admin_Training_Completed__c = admin_Training_Completed__c;
        this.attachments = attachments;
        this.channel_Mgr_Outline_Contacts__r = channel_Mgr_Outline_Contacts__r;
        this.collection_Issue__c = collection_Issue__c;
        this.collections_Last_Modified_Date__c = collections_Last_Modified_Date__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.deployment_Completed__c = deployment_Completed__c;
        this.deployment_Date__c = deployment_Date__c;
        this.deployment_Scheduled__c = deployment_Scheduled__c;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.finance_Contact__c = finance_Contact__c;
        this.finance_Contact__r = finance_Contact__r;
        this.had_great_partner_Discussion_with__c = had_great_partner_Discussion_with__c;
        this.had_great_partner_Discussion_with__r = had_great_partner_Discussion_with__r;
        this.histories = histories;
        this.infrastructure_Scheduled__c = infrastructure_Scheduled__c;
        this.intro_Call_w_CS_Pod_Manager_Completed__c = intro_Call_w_CS_Pod_Manager_Completed__c;
        this.isDeleted = isDeleted;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.marketing_Owner__c = marketing_Owner__c;
        this.marketing_Owner__r = marketing_Owner__r;
        this.meetings__r = meetings__r;
        this.mid_Size_Partner_Complete__c = mid_Size_Partner_Complete__c;
        this.monthly_Billings__r = monthly_Billings__r;
        this.name = name;
        this.new_Partner_Complete__c = new_Partner_Complete__c;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.other_Review_Solutions__r = other_Review_Solutions__r;
        this.owner = owner;
        this.ownerId = ownerId;
        this.partner_Manual_Sent__c = partner_Manual_Sent__c;
        this.partner_Type__c = partner_Type__c;
        this.primary_Contacts__r = primary_Contacts__r;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.recordType = recordType;
        this.recordTypeId = recordTypeId;
        this.relationship_Metric__c = relationship_Metric__c;
        this.relativity_Analytics_Scheduled__c = relativity_Analytics_Scheduled__c;
        this.sales_Training_Date__c = sales_Training_Date__c;
        this.sales_Training_Scheduled__c = sales_Training_Scheduled__c;
        this.salt_vs_Pepper_Deployed__c = salt_vs_Pepper_Deployed__c;
        this.smoke_Test_SvP__c = smoke_Test_SvP__c;
        this.smoke_Test_SvP__r = smoke_Test_SvP__r;
        this.status_Call_Scheduled__c = status_Call_Scheduled__c;
        this.systemModstamp = systemModstamp;
        this.what_do_they_want_to_achieve_in_3_months__c = what_do_they_want_to_achieve_in_3_months__c;
        this.what_do_they_want_to_achieve_in_6_months__c = what_do_they_want_to_achieve_in_6_months__c;
        this.what_do_they_want_to_achieve_in_9_months__c = what_do_they_want_to_achieve_in_9_months__c;
        this.what_is_unique_value_proposition__c = what_is_unique_value_proposition__c;
    }


    /**
     * Gets the account__c value for this Channel_Mgr_Outline__c.
     * 
     * @return account__c
     */
    public java.lang.String getAccount__c() {
        return account__c;
    }


    /**
     * Sets the account__c value for this Channel_Mgr_Outline__c.
     * 
     * @param account__c
     */
    public void setAccount__c(java.lang.String account__c) {
        this.account__c = account__c;
    }


    /**
     * Gets the account__r value for this Channel_Mgr_Outline__c.
     * 
     * @return account__r
     */
    public com.sforce.soap.enterprise.sobject.Account getAccount__r() {
        return account__r;
    }


    /**
     * Sets the account__r value for this Channel_Mgr_Outline__c.
     * 
     * @param account__r
     */
    public void setAccount__r(com.sforce.soap.enterprise.sobject.Account account__r) {
        this.account__r = account__r;
    }


    /**
     * Gets the activities_Completed__c value for this Channel_Mgr_Outline__c.
     * 
     * @return activities_Completed__c
     */
    public java.lang.String getActivities_Completed__c() {
        return activities_Completed__c;
    }


    /**
     * Sets the activities_Completed__c value for this Channel_Mgr_Outline__c.
     * 
     * @param activities_Completed__c
     */
    public void setActivities_Completed__c(java.lang.String activities_Completed__c) {
        this.activities_Completed__c = activities_Completed__c;
    }


    /**
     * Gets the admin_Training_Completed__c value for this Channel_Mgr_Outline__c.
     * 
     * @return admin_Training_Completed__c
     */
    public java.lang.String getAdmin_Training_Completed__c() {
        return admin_Training_Completed__c;
    }


    /**
     * Sets the admin_Training_Completed__c value for this Channel_Mgr_Outline__c.
     * 
     * @param admin_Training_Completed__c
     */
    public void setAdmin_Training_Completed__c(java.lang.String admin_Training_Completed__c) {
        this.admin_Training_Completed__c = admin_Training_Completed__c;
    }


    /**
     * Gets the attachments value for this Channel_Mgr_Outline__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Channel_Mgr_Outline__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the channel_Mgr_Outline_Contacts__r value for this Channel_Mgr_Outline__c.
     * 
     * @return channel_Mgr_Outline_Contacts__r
     */
    public com.sforce.soap.enterprise.QueryResult getChannel_Mgr_Outline_Contacts__r() {
        return channel_Mgr_Outline_Contacts__r;
    }


    /**
     * Sets the channel_Mgr_Outline_Contacts__r value for this Channel_Mgr_Outline__c.
     * 
     * @param channel_Mgr_Outline_Contacts__r
     */
    public void setChannel_Mgr_Outline_Contacts__r(com.sforce.soap.enterprise.QueryResult channel_Mgr_Outline_Contacts__r) {
        this.channel_Mgr_Outline_Contacts__r = channel_Mgr_Outline_Contacts__r;
    }


    /**
     * Gets the collection_Issue__c value for this Channel_Mgr_Outline__c.
     * 
     * @return collection_Issue__c
     */
    public java.lang.String getCollection_Issue__c() {
        return collection_Issue__c;
    }


    /**
     * Sets the collection_Issue__c value for this Channel_Mgr_Outline__c.
     * 
     * @param collection_Issue__c
     */
    public void setCollection_Issue__c(java.lang.String collection_Issue__c) {
        this.collection_Issue__c = collection_Issue__c;
    }


    /**
     * Gets the collections_Last_Modified_Date__c value for this Channel_Mgr_Outline__c.
     * 
     * @return collections_Last_Modified_Date__c
     */
    public java.util.Date getCollections_Last_Modified_Date__c() {
        return collections_Last_Modified_Date__c;
    }


    /**
     * Sets the collections_Last_Modified_Date__c value for this Channel_Mgr_Outline__c.
     * 
     * @param collections_Last_Modified_Date__c
     */
    public void setCollections_Last_Modified_Date__c(java.util.Date collections_Last_Modified_Date__c) {
        this.collections_Last_Modified_Date__c = collections_Last_Modified_Date__c;
    }


    /**
     * Gets the createdBy value for this Channel_Mgr_Outline__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Channel_Mgr_Outline__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Channel_Mgr_Outline__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Channel_Mgr_Outline__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Channel_Mgr_Outline__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Channel_Mgr_Outline__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the deployment_Completed__c value for this Channel_Mgr_Outline__c.
     * 
     * @return deployment_Completed__c
     */
    public java.lang.String getDeployment_Completed__c() {
        return deployment_Completed__c;
    }


    /**
     * Sets the deployment_Completed__c value for this Channel_Mgr_Outline__c.
     * 
     * @param deployment_Completed__c
     */
    public void setDeployment_Completed__c(java.lang.String deployment_Completed__c) {
        this.deployment_Completed__c = deployment_Completed__c;
    }


    /**
     * Gets the deployment_Date__c value for this Channel_Mgr_Outline__c.
     * 
     * @return deployment_Date__c
     */
    public java.util.Date getDeployment_Date__c() {
        return deployment_Date__c;
    }


    /**
     * Sets the deployment_Date__c value for this Channel_Mgr_Outline__c.
     * 
     * @param deployment_Date__c
     */
    public void setDeployment_Date__c(java.util.Date deployment_Date__c) {
        this.deployment_Date__c = deployment_Date__c;
    }


    /**
     * Gets the deployment_Scheduled__c value for this Channel_Mgr_Outline__c.
     * 
     * @return deployment_Scheduled__c
     */
    public java.lang.String getDeployment_Scheduled__c() {
        return deployment_Scheduled__c;
    }


    /**
     * Sets the deployment_Scheduled__c value for this Channel_Mgr_Outline__c.
     * 
     * @param deployment_Scheduled__c
     */
    public void setDeployment_Scheduled__c(java.lang.String deployment_Scheduled__c) {
        this.deployment_Scheduled__c = deployment_Scheduled__c;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Channel_Mgr_Outline__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Channel_Mgr_Outline__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the finance_Contact__c value for this Channel_Mgr_Outline__c.
     * 
     * @return finance_Contact__c
     */
    public java.lang.String getFinance_Contact__c() {
        return finance_Contact__c;
    }


    /**
     * Sets the finance_Contact__c value for this Channel_Mgr_Outline__c.
     * 
     * @param finance_Contact__c
     */
    public void setFinance_Contact__c(java.lang.String finance_Contact__c) {
        this.finance_Contact__c = finance_Contact__c;
    }


    /**
     * Gets the finance_Contact__r value for this Channel_Mgr_Outline__c.
     * 
     * @return finance_Contact__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getFinance_Contact__r() {
        return finance_Contact__r;
    }


    /**
     * Sets the finance_Contact__r value for this Channel_Mgr_Outline__c.
     * 
     * @param finance_Contact__r
     */
    public void setFinance_Contact__r(com.sforce.soap.enterprise.sobject.Contact finance_Contact__r) {
        this.finance_Contact__r = finance_Contact__r;
    }


    /**
     * Gets the had_great_partner_Discussion_with__c value for this Channel_Mgr_Outline__c.
     * 
     * @return had_great_partner_Discussion_with__c
     */
    public java.lang.String getHad_great_partner_Discussion_with__c() {
        return had_great_partner_Discussion_with__c;
    }


    /**
     * Sets the had_great_partner_Discussion_with__c value for this Channel_Mgr_Outline__c.
     * 
     * @param had_great_partner_Discussion_with__c
     */
    public void setHad_great_partner_Discussion_with__c(java.lang.String had_great_partner_Discussion_with__c) {
        this.had_great_partner_Discussion_with__c = had_great_partner_Discussion_with__c;
    }


    /**
     * Gets the had_great_partner_Discussion_with__r value for this Channel_Mgr_Outline__c.
     * 
     * @return had_great_partner_Discussion_with__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getHad_great_partner_Discussion_with__r() {
        return had_great_partner_Discussion_with__r;
    }


    /**
     * Sets the had_great_partner_Discussion_with__r value for this Channel_Mgr_Outline__c.
     * 
     * @param had_great_partner_Discussion_with__r
     */
    public void setHad_great_partner_Discussion_with__r(com.sforce.soap.enterprise.sobject.Contact had_great_partner_Discussion_with__r) {
        this.had_great_partner_Discussion_with__r = had_great_partner_Discussion_with__r;
    }


    /**
     * Gets the histories value for this Channel_Mgr_Outline__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Channel_Mgr_Outline__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the infrastructure_Scheduled__c value for this Channel_Mgr_Outline__c.
     * 
     * @return infrastructure_Scheduled__c
     */
    public java.lang.String getInfrastructure_Scheduled__c() {
        return infrastructure_Scheduled__c;
    }


    /**
     * Sets the infrastructure_Scheduled__c value for this Channel_Mgr_Outline__c.
     * 
     * @param infrastructure_Scheduled__c
     */
    public void setInfrastructure_Scheduled__c(java.lang.String infrastructure_Scheduled__c) {
        this.infrastructure_Scheduled__c = infrastructure_Scheduled__c;
    }


    /**
     * Gets the intro_Call_w_CS_Pod_Manager_Completed__c value for this Channel_Mgr_Outline__c.
     * 
     * @return intro_Call_w_CS_Pod_Manager_Completed__c
     */
    public java.lang.Boolean getIntro_Call_w_CS_Pod_Manager_Completed__c() {
        return intro_Call_w_CS_Pod_Manager_Completed__c;
    }


    /**
     * Sets the intro_Call_w_CS_Pod_Manager_Completed__c value for this Channel_Mgr_Outline__c.
     * 
     * @param intro_Call_w_CS_Pod_Manager_Completed__c
     */
    public void setIntro_Call_w_CS_Pod_Manager_Completed__c(java.lang.Boolean intro_Call_w_CS_Pod_Manager_Completed__c) {
        this.intro_Call_w_CS_Pod_Manager_Completed__c = intro_Call_w_CS_Pod_Manager_Completed__c;
    }


    /**
     * Gets the isDeleted value for this Channel_Mgr_Outline__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Channel_Mgr_Outline__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this Channel_Mgr_Outline__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Channel_Mgr_Outline__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Channel_Mgr_Outline__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Channel_Mgr_Outline__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Channel_Mgr_Outline__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Channel_Mgr_Outline__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the marketing_Owner__c value for this Channel_Mgr_Outline__c.
     * 
     * @return marketing_Owner__c
     */
    public java.lang.String getMarketing_Owner__c() {
        return marketing_Owner__c;
    }


    /**
     * Sets the marketing_Owner__c value for this Channel_Mgr_Outline__c.
     * 
     * @param marketing_Owner__c
     */
    public void setMarketing_Owner__c(java.lang.String marketing_Owner__c) {
        this.marketing_Owner__c = marketing_Owner__c;
    }


    /**
     * Gets the marketing_Owner__r value for this Channel_Mgr_Outline__c.
     * 
     * @return marketing_Owner__r
     */
    public com.sforce.soap.enterprise.sobject.User getMarketing_Owner__r() {
        return marketing_Owner__r;
    }


    /**
     * Sets the marketing_Owner__r value for this Channel_Mgr_Outline__c.
     * 
     * @param marketing_Owner__r
     */
    public void setMarketing_Owner__r(com.sforce.soap.enterprise.sobject.User marketing_Owner__r) {
        this.marketing_Owner__r = marketing_Owner__r;
    }


    /**
     * Gets the meetings__r value for this Channel_Mgr_Outline__c.
     * 
     * @return meetings__r
     */
    public com.sforce.soap.enterprise.QueryResult getMeetings__r() {
        return meetings__r;
    }


    /**
     * Sets the meetings__r value for this Channel_Mgr_Outline__c.
     * 
     * @param meetings__r
     */
    public void setMeetings__r(com.sforce.soap.enterprise.QueryResult meetings__r) {
        this.meetings__r = meetings__r;
    }


    /**
     * Gets the mid_Size_Partner_Complete__c value for this Channel_Mgr_Outline__c.
     * 
     * @return mid_Size_Partner_Complete__c
     */
    public java.lang.Double getMid_Size_Partner_Complete__c() {
        return mid_Size_Partner_Complete__c;
    }


    /**
     * Sets the mid_Size_Partner_Complete__c value for this Channel_Mgr_Outline__c.
     * 
     * @param mid_Size_Partner_Complete__c
     */
    public void setMid_Size_Partner_Complete__c(java.lang.Double mid_Size_Partner_Complete__c) {
        this.mid_Size_Partner_Complete__c = mid_Size_Partner_Complete__c;
    }


    /**
     * Gets the monthly_Billings__r value for this Channel_Mgr_Outline__c.
     * 
     * @return monthly_Billings__r
     */
    public com.sforce.soap.enterprise.QueryResult getMonthly_Billings__r() {
        return monthly_Billings__r;
    }


    /**
     * Sets the monthly_Billings__r value for this Channel_Mgr_Outline__c.
     * 
     * @param monthly_Billings__r
     */
    public void setMonthly_Billings__r(com.sforce.soap.enterprise.QueryResult monthly_Billings__r) {
        this.monthly_Billings__r = monthly_Billings__r;
    }


    /**
     * Gets the name value for this Channel_Mgr_Outline__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Channel_Mgr_Outline__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the new_Partner_Complete__c value for this Channel_Mgr_Outline__c.
     * 
     * @return new_Partner_Complete__c
     */
    public java.lang.Double getNew_Partner_Complete__c() {
        return new_Partner_Complete__c;
    }


    /**
     * Sets the new_Partner_Complete__c value for this Channel_Mgr_Outline__c.
     * 
     * @param new_Partner_Complete__c
     */
    public void setNew_Partner_Complete__c(java.lang.Double new_Partner_Complete__c) {
        this.new_Partner_Complete__c = new_Partner_Complete__c;
    }


    /**
     * Gets the notes value for this Channel_Mgr_Outline__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Channel_Mgr_Outline__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Channel_Mgr_Outline__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Channel_Mgr_Outline__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the other_Review_Solutions__r value for this Channel_Mgr_Outline__c.
     * 
     * @return other_Review_Solutions__r
     */
    public com.sforce.soap.enterprise.QueryResult getOther_Review_Solutions__r() {
        return other_Review_Solutions__r;
    }


    /**
     * Sets the other_Review_Solutions__r value for this Channel_Mgr_Outline__c.
     * 
     * @param other_Review_Solutions__r
     */
    public void setOther_Review_Solutions__r(com.sforce.soap.enterprise.QueryResult other_Review_Solutions__r) {
        this.other_Review_Solutions__r = other_Review_Solutions__r;
    }


    /**
     * Gets the owner value for this Channel_Mgr_Outline__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Channel_Mgr_Outline__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Channel_Mgr_Outline__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Channel_Mgr_Outline__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the partner_Manual_Sent__c value for this Channel_Mgr_Outline__c.
     * 
     * @return partner_Manual_Sent__c
     */
    public java.lang.Boolean getPartner_Manual_Sent__c() {
        return partner_Manual_Sent__c;
    }


    /**
     * Sets the partner_Manual_Sent__c value for this Channel_Mgr_Outline__c.
     * 
     * @param partner_Manual_Sent__c
     */
    public void setPartner_Manual_Sent__c(java.lang.Boolean partner_Manual_Sent__c) {
        this.partner_Manual_Sent__c = partner_Manual_Sent__c;
    }


    /**
     * Gets the partner_Type__c value for this Channel_Mgr_Outline__c.
     * 
     * @return partner_Type__c
     */
    public java.lang.String getPartner_Type__c() {
        return partner_Type__c;
    }


    /**
     * Sets the partner_Type__c value for this Channel_Mgr_Outline__c.
     * 
     * @param partner_Type__c
     */
    public void setPartner_Type__c(java.lang.String partner_Type__c) {
        this.partner_Type__c = partner_Type__c;
    }


    /**
     * Gets the primary_Contacts__r value for this Channel_Mgr_Outline__c.
     * 
     * @return primary_Contacts__r
     */
    public com.sforce.soap.enterprise.QueryResult getPrimary_Contacts__r() {
        return primary_Contacts__r;
    }


    /**
     * Sets the primary_Contacts__r value for this Channel_Mgr_Outline__c.
     * 
     * @param primary_Contacts__r
     */
    public void setPrimary_Contacts__r(com.sforce.soap.enterprise.QueryResult primary_Contacts__r) {
        this.primary_Contacts__r = primary_Contacts__r;
    }


    /**
     * Gets the processInstances value for this Channel_Mgr_Outline__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Channel_Mgr_Outline__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Channel_Mgr_Outline__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Channel_Mgr_Outline__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the recordType value for this Channel_Mgr_Outline__c.
     * 
     * @return recordType
     */
    public com.sforce.soap.enterprise.sobject.RecordType getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this Channel_Mgr_Outline__c.
     * 
     * @param recordType
     */
    public void setRecordType(com.sforce.soap.enterprise.sobject.RecordType recordType) {
        this.recordType = recordType;
    }


    /**
     * Gets the recordTypeId value for this Channel_Mgr_Outline__c.
     * 
     * @return recordTypeId
     */
    public java.lang.String getRecordTypeId() {
        return recordTypeId;
    }


    /**
     * Sets the recordTypeId value for this Channel_Mgr_Outline__c.
     * 
     * @param recordTypeId
     */
    public void setRecordTypeId(java.lang.String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }


    /**
     * Gets the relationship_Metric__c value for this Channel_Mgr_Outline__c.
     * 
     * @return relationship_Metric__c
     */
    public java.lang.String getRelationship_Metric__c() {
        return relationship_Metric__c;
    }


    /**
     * Sets the relationship_Metric__c value for this Channel_Mgr_Outline__c.
     * 
     * @param relationship_Metric__c
     */
    public void setRelationship_Metric__c(java.lang.String relationship_Metric__c) {
        this.relationship_Metric__c = relationship_Metric__c;
    }


    /**
     * Gets the relativity_Analytics_Scheduled__c value for this Channel_Mgr_Outline__c.
     * 
     * @return relativity_Analytics_Scheduled__c
     */
    public java.lang.String getRelativity_Analytics_Scheduled__c() {
        return relativity_Analytics_Scheduled__c;
    }


    /**
     * Sets the relativity_Analytics_Scheduled__c value for this Channel_Mgr_Outline__c.
     * 
     * @param relativity_Analytics_Scheduled__c
     */
    public void setRelativity_Analytics_Scheduled__c(java.lang.String relativity_Analytics_Scheduled__c) {
        this.relativity_Analytics_Scheduled__c = relativity_Analytics_Scheduled__c;
    }


    /**
     * Gets the sales_Training_Date__c value for this Channel_Mgr_Outline__c.
     * 
     * @return sales_Training_Date__c
     */
    public java.util.Date getSales_Training_Date__c() {
        return sales_Training_Date__c;
    }


    /**
     * Sets the sales_Training_Date__c value for this Channel_Mgr_Outline__c.
     * 
     * @param sales_Training_Date__c
     */
    public void setSales_Training_Date__c(java.util.Date sales_Training_Date__c) {
        this.sales_Training_Date__c = sales_Training_Date__c;
    }


    /**
     * Gets the sales_Training_Scheduled__c value for this Channel_Mgr_Outline__c.
     * 
     * @return sales_Training_Scheduled__c
     */
    public java.lang.String getSales_Training_Scheduled__c() {
        return sales_Training_Scheduled__c;
    }


    /**
     * Sets the sales_Training_Scheduled__c value for this Channel_Mgr_Outline__c.
     * 
     * @param sales_Training_Scheduled__c
     */
    public void setSales_Training_Scheduled__c(java.lang.String sales_Training_Scheduled__c) {
        this.sales_Training_Scheduled__c = sales_Training_Scheduled__c;
    }


    /**
     * Gets the salt_vs_Pepper_Deployed__c value for this Channel_Mgr_Outline__c.
     * 
     * @return salt_vs_Pepper_Deployed__c
     */
    public java.lang.String getSalt_vs_Pepper_Deployed__c() {
        return salt_vs_Pepper_Deployed__c;
    }


    /**
     * Sets the salt_vs_Pepper_Deployed__c value for this Channel_Mgr_Outline__c.
     * 
     * @param salt_vs_Pepper_Deployed__c
     */
    public void setSalt_vs_Pepper_Deployed__c(java.lang.String salt_vs_Pepper_Deployed__c) {
        this.salt_vs_Pepper_Deployed__c = salt_vs_Pepper_Deployed__c;
    }


    /**
     * Gets the smoke_Test_SvP__c value for this Channel_Mgr_Outline__c.
     * 
     * @return smoke_Test_SvP__c
     */
    public java.lang.String getSmoke_Test_SvP__c() {
        return smoke_Test_SvP__c;
    }


    /**
     * Sets the smoke_Test_SvP__c value for this Channel_Mgr_Outline__c.
     * 
     * @param smoke_Test_SvP__c
     */
    public void setSmoke_Test_SvP__c(java.lang.String smoke_Test_SvP__c) {
        this.smoke_Test_SvP__c = smoke_Test_SvP__c;
    }


    /**
     * Gets the smoke_Test_SvP__r value for this Channel_Mgr_Outline__c.
     * 
     * @return smoke_Test_SvP__r
     */
    public com.sforce.soap.enterprise.sobject.User getSmoke_Test_SvP__r() {
        return smoke_Test_SvP__r;
    }


    /**
     * Sets the smoke_Test_SvP__r value for this Channel_Mgr_Outline__c.
     * 
     * @param smoke_Test_SvP__r
     */
    public void setSmoke_Test_SvP__r(com.sforce.soap.enterprise.sobject.User smoke_Test_SvP__r) {
        this.smoke_Test_SvP__r = smoke_Test_SvP__r;
    }


    /**
     * Gets the status_Call_Scheduled__c value for this Channel_Mgr_Outline__c.
     * 
     * @return status_Call_Scheduled__c
     */
    public java.lang.Boolean getStatus_Call_Scheduled__c() {
        return status_Call_Scheduled__c;
    }


    /**
     * Sets the status_Call_Scheduled__c value for this Channel_Mgr_Outline__c.
     * 
     * @param status_Call_Scheduled__c
     */
    public void setStatus_Call_Scheduled__c(java.lang.Boolean status_Call_Scheduled__c) {
        this.status_Call_Scheduled__c = status_Call_Scheduled__c;
    }


    /**
     * Gets the systemModstamp value for this Channel_Mgr_Outline__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Channel_Mgr_Outline__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the what_do_they_want_to_achieve_in_3_months__c value for this Channel_Mgr_Outline__c.
     * 
     * @return what_do_they_want_to_achieve_in_3_months__c
     */
    public java.lang.String getWhat_do_they_want_to_achieve_in_3_months__c() {
        return what_do_they_want_to_achieve_in_3_months__c;
    }


    /**
     * Sets the what_do_they_want_to_achieve_in_3_months__c value for this Channel_Mgr_Outline__c.
     * 
     * @param what_do_they_want_to_achieve_in_3_months__c
     */
    public void setWhat_do_they_want_to_achieve_in_3_months__c(java.lang.String what_do_they_want_to_achieve_in_3_months__c) {
        this.what_do_they_want_to_achieve_in_3_months__c = what_do_they_want_to_achieve_in_3_months__c;
    }


    /**
     * Gets the what_do_they_want_to_achieve_in_6_months__c value for this Channel_Mgr_Outline__c.
     * 
     * @return what_do_they_want_to_achieve_in_6_months__c
     */
    public java.lang.String getWhat_do_they_want_to_achieve_in_6_months__c() {
        return what_do_they_want_to_achieve_in_6_months__c;
    }


    /**
     * Sets the what_do_they_want_to_achieve_in_6_months__c value for this Channel_Mgr_Outline__c.
     * 
     * @param what_do_they_want_to_achieve_in_6_months__c
     */
    public void setWhat_do_they_want_to_achieve_in_6_months__c(java.lang.String what_do_they_want_to_achieve_in_6_months__c) {
        this.what_do_they_want_to_achieve_in_6_months__c = what_do_they_want_to_achieve_in_6_months__c;
    }


    /**
     * Gets the what_do_they_want_to_achieve_in_9_months__c value for this Channel_Mgr_Outline__c.
     * 
     * @return what_do_they_want_to_achieve_in_9_months__c
     */
    public java.lang.String getWhat_do_they_want_to_achieve_in_9_months__c() {
        return what_do_they_want_to_achieve_in_9_months__c;
    }


    /**
     * Sets the what_do_they_want_to_achieve_in_9_months__c value for this Channel_Mgr_Outline__c.
     * 
     * @param what_do_they_want_to_achieve_in_9_months__c
     */
    public void setWhat_do_they_want_to_achieve_in_9_months__c(java.lang.String what_do_they_want_to_achieve_in_9_months__c) {
        this.what_do_they_want_to_achieve_in_9_months__c = what_do_they_want_to_achieve_in_9_months__c;
    }


    /**
     * Gets the what_is_unique_value_proposition__c value for this Channel_Mgr_Outline__c.
     * 
     * @return what_is_unique_value_proposition__c
     */
    public java.lang.String getWhat_is_unique_value_proposition__c() {
        return what_is_unique_value_proposition__c;
    }


    /**
     * Sets the what_is_unique_value_proposition__c value for this Channel_Mgr_Outline__c.
     * 
     * @param what_is_unique_value_proposition__c
     */
    public void setWhat_is_unique_value_proposition__c(java.lang.String what_is_unique_value_proposition__c) {
        this.what_is_unique_value_proposition__c = what_is_unique_value_proposition__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Channel_Mgr_Outline__c)) return false;
        Channel_Mgr_Outline__c other = (Channel_Mgr_Outline__c) obj;
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
            ((this.admin_Training_Completed__c==null && other.getAdmin_Training_Completed__c()==null) || 
             (this.admin_Training_Completed__c!=null &&
              this.admin_Training_Completed__c.equals(other.getAdmin_Training_Completed__c()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.channel_Mgr_Outline_Contacts__r==null && other.getChannel_Mgr_Outline_Contacts__r()==null) || 
             (this.channel_Mgr_Outline_Contacts__r!=null &&
              this.channel_Mgr_Outline_Contacts__r.equals(other.getChannel_Mgr_Outline_Contacts__r()))) &&
            ((this.collection_Issue__c==null && other.getCollection_Issue__c()==null) || 
             (this.collection_Issue__c!=null &&
              this.collection_Issue__c.equals(other.getCollection_Issue__c()))) &&
            ((this.collections_Last_Modified_Date__c==null && other.getCollections_Last_Modified_Date__c()==null) || 
             (this.collections_Last_Modified_Date__c!=null &&
              this.collections_Last_Modified_Date__c.equals(other.getCollections_Last_Modified_Date__c()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.deployment_Completed__c==null && other.getDeployment_Completed__c()==null) || 
             (this.deployment_Completed__c!=null &&
              this.deployment_Completed__c.equals(other.getDeployment_Completed__c()))) &&
            ((this.deployment_Date__c==null && other.getDeployment_Date__c()==null) || 
             (this.deployment_Date__c!=null &&
              this.deployment_Date__c.equals(other.getDeployment_Date__c()))) &&
            ((this.deployment_Scheduled__c==null && other.getDeployment_Scheduled__c()==null) || 
             (this.deployment_Scheduled__c!=null &&
              this.deployment_Scheduled__c.equals(other.getDeployment_Scheduled__c()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.finance_Contact__c==null && other.getFinance_Contact__c()==null) || 
             (this.finance_Contact__c!=null &&
              this.finance_Contact__c.equals(other.getFinance_Contact__c()))) &&
            ((this.finance_Contact__r==null && other.getFinance_Contact__r()==null) || 
             (this.finance_Contact__r!=null &&
              this.finance_Contact__r.equals(other.getFinance_Contact__r()))) &&
            ((this.had_great_partner_Discussion_with__c==null && other.getHad_great_partner_Discussion_with__c()==null) || 
             (this.had_great_partner_Discussion_with__c!=null &&
              this.had_great_partner_Discussion_with__c.equals(other.getHad_great_partner_Discussion_with__c()))) &&
            ((this.had_great_partner_Discussion_with__r==null && other.getHad_great_partner_Discussion_with__r()==null) || 
             (this.had_great_partner_Discussion_with__r!=null &&
              this.had_great_partner_Discussion_with__r.equals(other.getHad_great_partner_Discussion_with__r()))) &&
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
            ((this.infrastructure_Scheduled__c==null && other.getInfrastructure_Scheduled__c()==null) || 
             (this.infrastructure_Scheduled__c!=null &&
              this.infrastructure_Scheduled__c.equals(other.getInfrastructure_Scheduled__c()))) &&
            ((this.intro_Call_w_CS_Pod_Manager_Completed__c==null && other.getIntro_Call_w_CS_Pod_Manager_Completed__c()==null) || 
             (this.intro_Call_w_CS_Pod_Manager_Completed__c!=null &&
              this.intro_Call_w_CS_Pod_Manager_Completed__c.equals(other.getIntro_Call_w_CS_Pod_Manager_Completed__c()))) &&
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
            ((this.marketing_Owner__c==null && other.getMarketing_Owner__c()==null) || 
             (this.marketing_Owner__c!=null &&
              this.marketing_Owner__c.equals(other.getMarketing_Owner__c()))) &&
            ((this.marketing_Owner__r==null && other.getMarketing_Owner__r()==null) || 
             (this.marketing_Owner__r!=null &&
              this.marketing_Owner__r.equals(other.getMarketing_Owner__r()))) &&
            ((this.meetings__r==null && other.getMeetings__r()==null) || 
             (this.meetings__r!=null &&
              this.meetings__r.equals(other.getMeetings__r()))) &&
            ((this.mid_Size_Partner_Complete__c==null && other.getMid_Size_Partner_Complete__c()==null) || 
             (this.mid_Size_Partner_Complete__c!=null &&
              this.mid_Size_Partner_Complete__c.equals(other.getMid_Size_Partner_Complete__c()))) &&
            ((this.monthly_Billings__r==null && other.getMonthly_Billings__r()==null) || 
             (this.monthly_Billings__r!=null &&
              this.monthly_Billings__r.equals(other.getMonthly_Billings__r()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.new_Partner_Complete__c==null && other.getNew_Partner_Complete__c()==null) || 
             (this.new_Partner_Complete__c!=null &&
              this.new_Partner_Complete__c.equals(other.getNew_Partner_Complete__c()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.other_Review_Solutions__r==null && other.getOther_Review_Solutions__r()==null) || 
             (this.other_Review_Solutions__r!=null &&
              this.other_Review_Solutions__r.equals(other.getOther_Review_Solutions__r()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.partner_Manual_Sent__c==null && other.getPartner_Manual_Sent__c()==null) || 
             (this.partner_Manual_Sent__c!=null &&
              this.partner_Manual_Sent__c.equals(other.getPartner_Manual_Sent__c()))) &&
            ((this.partner_Type__c==null && other.getPartner_Type__c()==null) || 
             (this.partner_Type__c!=null &&
              this.partner_Type__c.equals(other.getPartner_Type__c()))) &&
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
            ((this.relationship_Metric__c==null && other.getRelationship_Metric__c()==null) || 
             (this.relationship_Metric__c!=null &&
              this.relationship_Metric__c.equals(other.getRelationship_Metric__c()))) &&
            ((this.relativity_Analytics_Scheduled__c==null && other.getRelativity_Analytics_Scheduled__c()==null) || 
             (this.relativity_Analytics_Scheduled__c!=null &&
              this.relativity_Analytics_Scheduled__c.equals(other.getRelativity_Analytics_Scheduled__c()))) &&
            ((this.sales_Training_Date__c==null && other.getSales_Training_Date__c()==null) || 
             (this.sales_Training_Date__c!=null &&
              this.sales_Training_Date__c.equals(other.getSales_Training_Date__c()))) &&
            ((this.sales_Training_Scheduled__c==null && other.getSales_Training_Scheduled__c()==null) || 
             (this.sales_Training_Scheduled__c!=null &&
              this.sales_Training_Scheduled__c.equals(other.getSales_Training_Scheduled__c()))) &&
            ((this.salt_vs_Pepper_Deployed__c==null && other.getSalt_vs_Pepper_Deployed__c()==null) || 
             (this.salt_vs_Pepper_Deployed__c!=null &&
              this.salt_vs_Pepper_Deployed__c.equals(other.getSalt_vs_Pepper_Deployed__c()))) &&
            ((this.smoke_Test_SvP__c==null && other.getSmoke_Test_SvP__c()==null) || 
             (this.smoke_Test_SvP__c!=null &&
              this.smoke_Test_SvP__c.equals(other.getSmoke_Test_SvP__c()))) &&
            ((this.smoke_Test_SvP__r==null && other.getSmoke_Test_SvP__r()==null) || 
             (this.smoke_Test_SvP__r!=null &&
              this.smoke_Test_SvP__r.equals(other.getSmoke_Test_SvP__r()))) &&
            ((this.status_Call_Scheduled__c==null && other.getStatus_Call_Scheduled__c()==null) || 
             (this.status_Call_Scheduled__c!=null &&
              this.status_Call_Scheduled__c.equals(other.getStatus_Call_Scheduled__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.what_do_they_want_to_achieve_in_3_months__c==null && other.getWhat_do_they_want_to_achieve_in_3_months__c()==null) || 
             (this.what_do_they_want_to_achieve_in_3_months__c!=null &&
              this.what_do_they_want_to_achieve_in_3_months__c.equals(other.getWhat_do_they_want_to_achieve_in_3_months__c()))) &&
            ((this.what_do_they_want_to_achieve_in_6_months__c==null && other.getWhat_do_they_want_to_achieve_in_6_months__c()==null) || 
             (this.what_do_they_want_to_achieve_in_6_months__c!=null &&
              this.what_do_they_want_to_achieve_in_6_months__c.equals(other.getWhat_do_they_want_to_achieve_in_6_months__c()))) &&
            ((this.what_do_they_want_to_achieve_in_9_months__c==null && other.getWhat_do_they_want_to_achieve_in_9_months__c()==null) || 
             (this.what_do_they_want_to_achieve_in_9_months__c!=null &&
              this.what_do_they_want_to_achieve_in_9_months__c.equals(other.getWhat_do_they_want_to_achieve_in_9_months__c()))) &&
            ((this.what_is_unique_value_proposition__c==null && other.getWhat_is_unique_value_proposition__c()==null) || 
             (this.what_is_unique_value_proposition__c!=null &&
              this.what_is_unique_value_proposition__c.equals(other.getWhat_is_unique_value_proposition__c())));
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
        if (getAdmin_Training_Completed__c() != null) {
            _hashCode += getAdmin_Training_Completed__c().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getChannel_Mgr_Outline_Contacts__r() != null) {
            _hashCode += getChannel_Mgr_Outline_Contacts__r().hashCode();
        }
        if (getCollection_Issue__c() != null) {
            _hashCode += getCollection_Issue__c().hashCode();
        }
        if (getCollections_Last_Modified_Date__c() != null) {
            _hashCode += getCollections_Last_Modified_Date__c().hashCode();
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
        if (getDeployment_Completed__c() != null) {
            _hashCode += getDeployment_Completed__c().hashCode();
        }
        if (getDeployment_Date__c() != null) {
            _hashCode += getDeployment_Date__c().hashCode();
        }
        if (getDeployment_Scheduled__c() != null) {
            _hashCode += getDeployment_Scheduled__c().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getFinance_Contact__c() != null) {
            _hashCode += getFinance_Contact__c().hashCode();
        }
        if (getFinance_Contact__r() != null) {
            _hashCode += getFinance_Contact__r().hashCode();
        }
        if (getHad_great_partner_Discussion_with__c() != null) {
            _hashCode += getHad_great_partner_Discussion_with__c().hashCode();
        }
        if (getHad_great_partner_Discussion_with__r() != null) {
            _hashCode += getHad_great_partner_Discussion_with__r().hashCode();
        }
        if (getHistories() != null) {
            _hashCode += getHistories().hashCode();
        }
        if (getInfrastructure_Scheduled__c() != null) {
            _hashCode += getInfrastructure_Scheduled__c().hashCode();
        }
        if (getIntro_Call_w_CS_Pod_Manager_Completed__c() != null) {
            _hashCode += getIntro_Call_w_CS_Pod_Manager_Completed__c().hashCode();
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
        if (getMarketing_Owner__c() != null) {
            _hashCode += getMarketing_Owner__c().hashCode();
        }
        if (getMarketing_Owner__r() != null) {
            _hashCode += getMarketing_Owner__r().hashCode();
        }
        if (getMeetings__r() != null) {
            _hashCode += getMeetings__r().hashCode();
        }
        if (getMid_Size_Partner_Complete__c() != null) {
            _hashCode += getMid_Size_Partner_Complete__c().hashCode();
        }
        if (getMonthly_Billings__r() != null) {
            _hashCode += getMonthly_Billings__r().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNew_Partner_Complete__c() != null) {
            _hashCode += getNew_Partner_Complete__c().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getNotesAndAttachments() != null) {
            _hashCode += getNotesAndAttachments().hashCode();
        }
        if (getOther_Review_Solutions__r() != null) {
            _hashCode += getOther_Review_Solutions__r().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getPartner_Manual_Sent__c() != null) {
            _hashCode += getPartner_Manual_Sent__c().hashCode();
        }
        if (getPartner_Type__c() != null) {
            _hashCode += getPartner_Type__c().hashCode();
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
        if (getRelationship_Metric__c() != null) {
            _hashCode += getRelationship_Metric__c().hashCode();
        }
        if (getRelativity_Analytics_Scheduled__c() != null) {
            _hashCode += getRelativity_Analytics_Scheduled__c().hashCode();
        }
        if (getSales_Training_Date__c() != null) {
            _hashCode += getSales_Training_Date__c().hashCode();
        }
        if (getSales_Training_Scheduled__c() != null) {
            _hashCode += getSales_Training_Scheduled__c().hashCode();
        }
        if (getSalt_vs_Pepper_Deployed__c() != null) {
            _hashCode += getSalt_vs_Pepper_Deployed__c().hashCode();
        }
        if (getSmoke_Test_SvP__c() != null) {
            _hashCode += getSmoke_Test_SvP__c().hashCode();
        }
        if (getSmoke_Test_SvP__r() != null) {
            _hashCode += getSmoke_Test_SvP__r().hashCode();
        }
        if (getStatus_Call_Scheduled__c() != null) {
            _hashCode += getStatus_Call_Scheduled__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getWhat_do_they_want_to_achieve_in_3_months__c() != null) {
            _hashCode += getWhat_do_they_want_to_achieve_in_3_months__c().hashCode();
        }
        if (getWhat_do_they_want_to_achieve_in_6_months__c() != null) {
            _hashCode += getWhat_do_they_want_to_achieve_in_6_months__c().hashCode();
        }
        if (getWhat_do_they_want_to_achieve_in_9_months__c() != null) {
            _hashCode += getWhat_do_they_want_to_achieve_in_9_months__c().hashCode();
        }
        if (getWhat_is_unique_value_proposition__c() != null) {
            _hashCode += getWhat_is_unique_value_proposition__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Channel_Mgr_Outline__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Channel_Mgr_Outline__c"));
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
        elemField.setFieldName("admin_Training_Completed__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Admin_Training_Completed__c"));
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
        elemField.setFieldName("channel_Mgr_Outline_Contacts__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Channel_Mgr_Outline_Contacts__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collection_Issue__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Collection_Issue__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collections_Last_Modified_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Collections_Last_Modified_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("feedSubscriptionsForEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedSubscriptionsForEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finance_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Finance_Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finance_Contact__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Finance_Contact__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("had_great_partner_Discussion_with__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Had_great_partner_Discussion_with__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("had_great_partner_Discussion_with__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Had_great_partner_Discussion_with__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
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
        elemField.setFieldName("intro_Call_w_CS_Pod_Manager_Completed__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Intro_Call_w_CS_Pod_Manager_Completed__c"));
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
        elemField.setFieldName("meetings__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Meetings__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mid_Size_Partner_Complete__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Mid_Size_Partner_Complete__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthly_Billings__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Monthly_Billings__r"));
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
        elemField.setFieldName("new_Partner_Complete__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "New_Partner_Complete__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("other_Review_Solutions__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Other_Review_Solutions__r"));
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
        elemField.setFieldName("partner_Manual_Sent__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Partner_Manual_Sent__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partner_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Partner_Type__c"));
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
        elemField.setFieldName("relationship_Metric__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relationship_Metric__c"));
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
        elemField.setFieldName("sales_Training_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Sales_Training_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("salt_vs_Pepper_Deployed__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Salt_vs_Pepper_Deployed__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smoke_Test_SvP__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Smoke_Test_SvP__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smoke_Test_SvP__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Smoke_Test_SvP__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status_Call_Scheduled__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status_Call_Scheduled__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("what_do_they_want_to_achieve_in_3_months__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "What_do_they_want_to_achieve_in_3_months__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("what_do_they_want_to_achieve_in_6_months__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "What_do_they_want_to_achieve_in_6_months__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("what_do_they_want_to_achieve_in_9_months__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "What_do_they_want_to_achieve_in_9_months__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("what_is_unique_value_proposition__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "What_is_unique_value_proposition__c"));
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

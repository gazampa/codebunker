/**
 * Campaign.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Campaign  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private java.lang.Double actualCost;

    private java.lang.Double amountAllOpportunities;

    private java.lang.Double amountWonOpportunities;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.Double budgetedCost;

    private java.lang.String campaignMemberRecordTypeId;

    private com.sforce.soap.enterprise.QueryResult campaignMembers;

    private com.sforce.soap.enterprise.QueryResult childCampaigns;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private com.sforce.soap.enterprise.QueryResult demos__r;

    private java.lang.String description;

    private java.util.Date endDate;

    private com.sforce.soap.enterprise.QueryResult events;

    private java.lang.Double expectedResponse;

    private java.lang.Double expectedRevenue;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult feeds;

    private com.sforce.soap.enterprise.QueryResult individual_Email_Results__r;

    private java.lang.Boolean isActive;

    private java.lang.Boolean isDeleted;

    private java.util.Date lastActivityDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String name;

    private java.lang.Integer numberOfContacts;

    private java.lang.Integer numberOfConvertedLeads;

    private java.lang.Integer numberOfLeads;

    private java.lang.Integer numberOfOpportunities;

    private java.lang.Integer numberOfResponses;

    private java.lang.Integer numberOfWonOpportunities;

    private java.lang.Double numberSent;

    private java.lang.Double number_of_Press_Mentions__c;

    private com.sforce.soap.enterprise.QueryResult onsite_Visits__r;

    private com.sforce.soap.enterprise.QueryResult openActivities;

    private com.sforce.soap.enterprise.QueryResult opportunities;

    private com.sforce.soap.enterprise.sobject.User owner;

    private java.lang.String ownerId;

    private com.sforce.soap.enterprise.QueryResult press_Mentions__r;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private com.sforce.soap.enterprise.QueryResult shares;

    private java.util.Date startDate;

    private java.lang.String status;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    private java.lang.String type;

    public Campaign() {
    }

    public Campaign(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           java.lang.Double actualCost,
           java.lang.Double amountAllOpportunities,
           java.lang.Double amountWonOpportunities,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.Double budgetedCost,
           java.lang.String campaignMemberRecordTypeId,
           com.sforce.soap.enterprise.QueryResult campaignMembers,
           com.sforce.soap.enterprise.QueryResult childCampaigns,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           com.sforce.soap.enterprise.QueryResult demos__r,
           java.lang.String description,
           java.util.Date endDate,
           com.sforce.soap.enterprise.QueryResult events,
           java.lang.Double expectedResponse,
           java.lang.Double expectedRevenue,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult feeds,
           com.sforce.soap.enterprise.QueryResult individual_Email_Results__r,
           java.lang.Boolean isActive,
           java.lang.Boolean isDeleted,
           java.util.Date lastActivityDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String name,
           java.lang.Integer numberOfContacts,
           java.lang.Integer numberOfConvertedLeads,
           java.lang.Integer numberOfLeads,
           java.lang.Integer numberOfOpportunities,
           java.lang.Integer numberOfResponses,
           java.lang.Integer numberOfWonOpportunities,
           java.lang.Double numberSent,
           java.lang.Double number_of_Press_Mentions__c,
           com.sforce.soap.enterprise.QueryResult onsite_Visits__r,
           com.sforce.soap.enterprise.QueryResult openActivities,
           com.sforce.soap.enterprise.QueryResult opportunities,
           com.sforce.soap.enterprise.sobject.User owner,
           java.lang.String ownerId,
           com.sforce.soap.enterprise.QueryResult press_Mentions__r,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           com.sforce.soap.enterprise.QueryResult shares,
           java.util.Date startDate,
           java.lang.String status,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks,
           java.lang.String type) {
        super(
            fieldsToNull,
            id);
        this.activityHistories = activityHistories;
        this.actualCost = actualCost;
        this.amountAllOpportunities = amountAllOpportunities;
        this.amountWonOpportunities = amountWonOpportunities;
        this.attachments = attachments;
        this.budgetedCost = budgetedCost;
        this.campaignMemberRecordTypeId = campaignMemberRecordTypeId;
        this.campaignMembers = campaignMembers;
        this.childCampaigns = childCampaigns;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.demos__r = demos__r;
        this.description = description;
        this.endDate = endDate;
        this.events = events;
        this.expectedResponse = expectedResponse;
        this.expectedRevenue = expectedRevenue;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.feeds = feeds;
        this.individual_Email_Results__r = individual_Email_Results__r;
        this.isActive = isActive;
        this.isDeleted = isDeleted;
        this.lastActivityDate = lastActivityDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.name = name;
        this.numberOfContacts = numberOfContacts;
        this.numberOfConvertedLeads = numberOfConvertedLeads;
        this.numberOfLeads = numberOfLeads;
        this.numberOfOpportunities = numberOfOpportunities;
        this.numberOfResponses = numberOfResponses;
        this.numberOfWonOpportunities = numberOfWonOpportunities;
        this.numberSent = numberSent;
        this.number_of_Press_Mentions__c = number_of_Press_Mentions__c;
        this.onsite_Visits__r = onsite_Visits__r;
        this.openActivities = openActivities;
        this.opportunities = opportunities;
        this.owner = owner;
        this.ownerId = ownerId;
        this.press_Mentions__r = press_Mentions__r;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.shares = shares;
        this.startDate = startDate;
        this.status = status;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
        this.type = type;
    }


    /**
     * Gets the activityHistories value for this Campaign.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this Campaign.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the actualCost value for this Campaign.
     * 
     * @return actualCost
     */
    public java.lang.Double getActualCost() {
        return actualCost;
    }


    /**
     * Sets the actualCost value for this Campaign.
     * 
     * @param actualCost
     */
    public void setActualCost(java.lang.Double actualCost) {
        this.actualCost = actualCost;
    }


    /**
     * Gets the amountAllOpportunities value for this Campaign.
     * 
     * @return amountAllOpportunities
     */
    public java.lang.Double getAmountAllOpportunities() {
        return amountAllOpportunities;
    }


    /**
     * Sets the amountAllOpportunities value for this Campaign.
     * 
     * @param amountAllOpportunities
     */
    public void setAmountAllOpportunities(java.lang.Double amountAllOpportunities) {
        this.amountAllOpportunities = amountAllOpportunities;
    }


    /**
     * Gets the amountWonOpportunities value for this Campaign.
     * 
     * @return amountWonOpportunities
     */
    public java.lang.Double getAmountWonOpportunities() {
        return amountWonOpportunities;
    }


    /**
     * Sets the amountWonOpportunities value for this Campaign.
     * 
     * @param amountWonOpportunities
     */
    public void setAmountWonOpportunities(java.lang.Double amountWonOpportunities) {
        this.amountWonOpportunities = amountWonOpportunities;
    }


    /**
     * Gets the attachments value for this Campaign.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Campaign.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the budgetedCost value for this Campaign.
     * 
     * @return budgetedCost
     */
    public java.lang.Double getBudgetedCost() {
        return budgetedCost;
    }


    /**
     * Sets the budgetedCost value for this Campaign.
     * 
     * @param budgetedCost
     */
    public void setBudgetedCost(java.lang.Double budgetedCost) {
        this.budgetedCost = budgetedCost;
    }


    /**
     * Gets the campaignMemberRecordTypeId value for this Campaign.
     * 
     * @return campaignMemberRecordTypeId
     */
    public java.lang.String getCampaignMemberRecordTypeId() {
        return campaignMemberRecordTypeId;
    }


    /**
     * Sets the campaignMemberRecordTypeId value for this Campaign.
     * 
     * @param campaignMemberRecordTypeId
     */
    public void setCampaignMemberRecordTypeId(java.lang.String campaignMemberRecordTypeId) {
        this.campaignMemberRecordTypeId = campaignMemberRecordTypeId;
    }


    /**
     * Gets the campaignMembers value for this Campaign.
     * 
     * @return campaignMembers
     */
    public com.sforce.soap.enterprise.QueryResult getCampaignMembers() {
        return campaignMembers;
    }


    /**
     * Sets the campaignMembers value for this Campaign.
     * 
     * @param campaignMembers
     */
    public void setCampaignMembers(com.sforce.soap.enterprise.QueryResult campaignMembers) {
        this.campaignMembers = campaignMembers;
    }


    /**
     * Gets the childCampaigns value for this Campaign.
     * 
     * @return childCampaigns
     */
    public com.sforce.soap.enterprise.QueryResult getChildCampaigns() {
        return childCampaigns;
    }


    /**
     * Sets the childCampaigns value for this Campaign.
     * 
     * @param childCampaigns
     */
    public void setChildCampaigns(com.sforce.soap.enterprise.QueryResult childCampaigns) {
        this.childCampaigns = childCampaigns;
    }


    /**
     * Gets the createdBy value for this Campaign.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Campaign.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Campaign.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Campaign.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Campaign.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Campaign.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the demos__r value for this Campaign.
     * 
     * @return demos__r
     */
    public com.sforce.soap.enterprise.QueryResult getDemos__r() {
        return demos__r;
    }


    /**
     * Sets the demos__r value for this Campaign.
     * 
     * @param demos__r
     */
    public void setDemos__r(com.sforce.soap.enterprise.QueryResult demos__r) {
        this.demos__r = demos__r;
    }


    /**
     * Gets the description value for this Campaign.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Campaign.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the endDate value for this Campaign.
     * 
     * @return endDate
     */
    public java.util.Date getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this Campaign.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the events value for this Campaign.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Campaign.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the expectedResponse value for this Campaign.
     * 
     * @return expectedResponse
     */
    public java.lang.Double getExpectedResponse() {
        return expectedResponse;
    }


    /**
     * Sets the expectedResponse value for this Campaign.
     * 
     * @param expectedResponse
     */
    public void setExpectedResponse(java.lang.Double expectedResponse) {
        this.expectedResponse = expectedResponse;
    }


    /**
     * Gets the expectedRevenue value for this Campaign.
     * 
     * @return expectedRevenue
     */
    public java.lang.Double getExpectedRevenue() {
        return expectedRevenue;
    }


    /**
     * Sets the expectedRevenue value for this Campaign.
     * 
     * @param expectedRevenue
     */
    public void setExpectedRevenue(java.lang.Double expectedRevenue) {
        this.expectedRevenue = expectedRevenue;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Campaign.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Campaign.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the feeds value for this Campaign.
     * 
     * @return feeds
     */
    public com.sforce.soap.enterprise.QueryResult getFeeds() {
        return feeds;
    }


    /**
     * Sets the feeds value for this Campaign.
     * 
     * @param feeds
     */
    public void setFeeds(com.sforce.soap.enterprise.QueryResult feeds) {
        this.feeds = feeds;
    }


    /**
     * Gets the individual_Email_Results__r value for this Campaign.
     * 
     * @return individual_Email_Results__r
     */
    public com.sforce.soap.enterprise.QueryResult getIndividual_Email_Results__r() {
        return individual_Email_Results__r;
    }


    /**
     * Sets the individual_Email_Results__r value for this Campaign.
     * 
     * @param individual_Email_Results__r
     */
    public void setIndividual_Email_Results__r(com.sforce.soap.enterprise.QueryResult individual_Email_Results__r) {
        this.individual_Email_Results__r = individual_Email_Results__r;
    }


    /**
     * Gets the isActive value for this Campaign.
     * 
     * @return isActive
     */
    public java.lang.Boolean getIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this Campaign.
     * 
     * @param isActive
     */
    public void setIsActive(java.lang.Boolean isActive) {
        this.isActive = isActive;
    }


    /**
     * Gets the isDeleted value for this Campaign.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Campaign.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastActivityDate value for this Campaign.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Campaign.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this Campaign.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Campaign.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Campaign.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Campaign.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Campaign.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Campaign.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this Campaign.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Campaign.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the numberOfContacts value for this Campaign.
     * 
     * @return numberOfContacts
     */
    public java.lang.Integer getNumberOfContacts() {
        return numberOfContacts;
    }


    /**
     * Sets the numberOfContacts value for this Campaign.
     * 
     * @param numberOfContacts
     */
    public void setNumberOfContacts(java.lang.Integer numberOfContacts) {
        this.numberOfContacts = numberOfContacts;
    }


    /**
     * Gets the numberOfConvertedLeads value for this Campaign.
     * 
     * @return numberOfConvertedLeads
     */
    public java.lang.Integer getNumberOfConvertedLeads() {
        return numberOfConvertedLeads;
    }


    /**
     * Sets the numberOfConvertedLeads value for this Campaign.
     * 
     * @param numberOfConvertedLeads
     */
    public void setNumberOfConvertedLeads(java.lang.Integer numberOfConvertedLeads) {
        this.numberOfConvertedLeads = numberOfConvertedLeads;
    }


    /**
     * Gets the numberOfLeads value for this Campaign.
     * 
     * @return numberOfLeads
     */
    public java.lang.Integer getNumberOfLeads() {
        return numberOfLeads;
    }


    /**
     * Sets the numberOfLeads value for this Campaign.
     * 
     * @param numberOfLeads
     */
    public void setNumberOfLeads(java.lang.Integer numberOfLeads) {
        this.numberOfLeads = numberOfLeads;
    }


    /**
     * Gets the numberOfOpportunities value for this Campaign.
     * 
     * @return numberOfOpportunities
     */
    public java.lang.Integer getNumberOfOpportunities() {
        return numberOfOpportunities;
    }


    /**
     * Sets the numberOfOpportunities value for this Campaign.
     * 
     * @param numberOfOpportunities
     */
    public void setNumberOfOpportunities(java.lang.Integer numberOfOpportunities) {
        this.numberOfOpportunities = numberOfOpportunities;
    }


    /**
     * Gets the numberOfResponses value for this Campaign.
     * 
     * @return numberOfResponses
     */
    public java.lang.Integer getNumberOfResponses() {
        return numberOfResponses;
    }


    /**
     * Sets the numberOfResponses value for this Campaign.
     * 
     * @param numberOfResponses
     */
    public void setNumberOfResponses(java.lang.Integer numberOfResponses) {
        this.numberOfResponses = numberOfResponses;
    }


    /**
     * Gets the numberOfWonOpportunities value for this Campaign.
     * 
     * @return numberOfWonOpportunities
     */
    public java.lang.Integer getNumberOfWonOpportunities() {
        return numberOfWonOpportunities;
    }


    /**
     * Sets the numberOfWonOpportunities value for this Campaign.
     * 
     * @param numberOfWonOpportunities
     */
    public void setNumberOfWonOpportunities(java.lang.Integer numberOfWonOpportunities) {
        this.numberOfWonOpportunities = numberOfWonOpportunities;
    }


    /**
     * Gets the numberSent value for this Campaign.
     * 
     * @return numberSent
     */
    public java.lang.Double getNumberSent() {
        return numberSent;
    }


    /**
     * Sets the numberSent value for this Campaign.
     * 
     * @param numberSent
     */
    public void setNumberSent(java.lang.Double numberSent) {
        this.numberSent = numberSent;
    }


    /**
     * Gets the number_of_Press_Mentions__c value for this Campaign.
     * 
     * @return number_of_Press_Mentions__c
     */
    public java.lang.Double getNumber_of_Press_Mentions__c() {
        return number_of_Press_Mentions__c;
    }


    /**
     * Sets the number_of_Press_Mentions__c value for this Campaign.
     * 
     * @param number_of_Press_Mentions__c
     */
    public void setNumber_of_Press_Mentions__c(java.lang.Double number_of_Press_Mentions__c) {
        this.number_of_Press_Mentions__c = number_of_Press_Mentions__c;
    }


    /**
     * Gets the onsite_Visits__r value for this Campaign.
     * 
     * @return onsite_Visits__r
     */
    public com.sforce.soap.enterprise.QueryResult getOnsite_Visits__r() {
        return onsite_Visits__r;
    }


    /**
     * Sets the onsite_Visits__r value for this Campaign.
     * 
     * @param onsite_Visits__r
     */
    public void setOnsite_Visits__r(com.sforce.soap.enterprise.QueryResult onsite_Visits__r) {
        this.onsite_Visits__r = onsite_Visits__r;
    }


    /**
     * Gets the openActivities value for this Campaign.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this Campaign.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the opportunities value for this Campaign.
     * 
     * @return opportunities
     */
    public com.sforce.soap.enterprise.QueryResult getOpportunities() {
        return opportunities;
    }


    /**
     * Sets the opportunities value for this Campaign.
     * 
     * @param opportunities
     */
    public void setOpportunities(com.sforce.soap.enterprise.QueryResult opportunities) {
        this.opportunities = opportunities;
    }


    /**
     * Gets the owner value for this Campaign.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.User getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Campaign.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.User owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Campaign.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Campaign.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the press_Mentions__r value for this Campaign.
     * 
     * @return press_Mentions__r
     */
    public com.sforce.soap.enterprise.QueryResult getPress_Mentions__r() {
        return press_Mentions__r;
    }


    /**
     * Sets the press_Mentions__r value for this Campaign.
     * 
     * @param press_Mentions__r
     */
    public void setPress_Mentions__r(com.sforce.soap.enterprise.QueryResult press_Mentions__r) {
        this.press_Mentions__r = press_Mentions__r;
    }


    /**
     * Gets the processInstances value for this Campaign.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Campaign.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Campaign.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Campaign.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the shares value for this Campaign.
     * 
     * @return shares
     */
    public com.sforce.soap.enterprise.QueryResult getShares() {
        return shares;
    }


    /**
     * Sets the shares value for this Campaign.
     * 
     * @param shares
     */
    public void setShares(com.sforce.soap.enterprise.QueryResult shares) {
        this.shares = shares;
    }


    /**
     * Gets the startDate value for this Campaign.
     * 
     * @return startDate
     */
    public java.util.Date getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this Campaign.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the status value for this Campaign.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Campaign.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the systemModstamp value for this Campaign.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Campaign.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this Campaign.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Campaign.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the type value for this Campaign.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Campaign.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Campaign)) return false;
        Campaign other = (Campaign) obj;
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
            ((this.actualCost==null && other.getActualCost()==null) || 
             (this.actualCost!=null &&
              this.actualCost.equals(other.getActualCost()))) &&
            ((this.amountAllOpportunities==null && other.getAmountAllOpportunities()==null) || 
             (this.amountAllOpportunities!=null &&
              this.amountAllOpportunities.equals(other.getAmountAllOpportunities()))) &&
            ((this.amountWonOpportunities==null && other.getAmountWonOpportunities()==null) || 
             (this.amountWonOpportunities!=null &&
              this.amountWonOpportunities.equals(other.getAmountWonOpportunities()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.budgetedCost==null && other.getBudgetedCost()==null) || 
             (this.budgetedCost!=null &&
              this.budgetedCost.equals(other.getBudgetedCost()))) &&
            ((this.campaignMemberRecordTypeId==null && other.getCampaignMemberRecordTypeId()==null) || 
             (this.campaignMemberRecordTypeId!=null &&
              this.campaignMemberRecordTypeId.equals(other.getCampaignMemberRecordTypeId()))) &&
            ((this.campaignMembers==null && other.getCampaignMembers()==null) || 
             (this.campaignMembers!=null &&
              this.campaignMembers.equals(other.getCampaignMembers()))) &&
            ((this.childCampaigns==null && other.getChildCampaigns()==null) || 
             (this.childCampaigns!=null &&
              this.childCampaigns.equals(other.getChildCampaigns()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.demos__r==null && other.getDemos__r()==null) || 
             (this.demos__r!=null &&
              this.demos__r.equals(other.getDemos__r()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              this.events.equals(other.getEvents()))) &&
            ((this.expectedResponse==null && other.getExpectedResponse()==null) || 
             (this.expectedResponse!=null &&
              this.expectedResponse.equals(other.getExpectedResponse()))) &&
            ((this.expectedRevenue==null && other.getExpectedRevenue()==null) || 
             (this.expectedRevenue!=null &&
              this.expectedRevenue.equals(other.getExpectedRevenue()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.feeds==null && other.getFeeds()==null) || 
             (this.feeds!=null &&
              this.feeds.equals(other.getFeeds()))) &&
            ((this.individual_Email_Results__r==null && other.getIndividual_Email_Results__r()==null) || 
             (this.individual_Email_Results__r!=null &&
              this.individual_Email_Results__r.equals(other.getIndividual_Email_Results__r()))) &&
            ((this.isActive==null && other.getIsActive()==null) || 
             (this.isActive!=null &&
              this.isActive.equals(other.getIsActive()))) &&
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
            ((this.numberOfContacts==null && other.getNumberOfContacts()==null) || 
             (this.numberOfContacts!=null &&
              this.numberOfContacts.equals(other.getNumberOfContacts()))) &&
            ((this.numberOfConvertedLeads==null && other.getNumberOfConvertedLeads()==null) || 
             (this.numberOfConvertedLeads!=null &&
              this.numberOfConvertedLeads.equals(other.getNumberOfConvertedLeads()))) &&
            ((this.numberOfLeads==null && other.getNumberOfLeads()==null) || 
             (this.numberOfLeads!=null &&
              this.numberOfLeads.equals(other.getNumberOfLeads()))) &&
            ((this.numberOfOpportunities==null && other.getNumberOfOpportunities()==null) || 
             (this.numberOfOpportunities!=null &&
              this.numberOfOpportunities.equals(other.getNumberOfOpportunities()))) &&
            ((this.numberOfResponses==null && other.getNumberOfResponses()==null) || 
             (this.numberOfResponses!=null &&
              this.numberOfResponses.equals(other.getNumberOfResponses()))) &&
            ((this.numberOfWonOpportunities==null && other.getNumberOfWonOpportunities()==null) || 
             (this.numberOfWonOpportunities!=null &&
              this.numberOfWonOpportunities.equals(other.getNumberOfWonOpportunities()))) &&
            ((this.numberSent==null && other.getNumberSent()==null) || 
             (this.numberSent!=null &&
              this.numberSent.equals(other.getNumberSent()))) &&
            ((this.number_of_Press_Mentions__c==null && other.getNumber_of_Press_Mentions__c()==null) || 
             (this.number_of_Press_Mentions__c!=null &&
              this.number_of_Press_Mentions__c.equals(other.getNumber_of_Press_Mentions__c()))) &&
            ((this.onsite_Visits__r==null && other.getOnsite_Visits__r()==null) || 
             (this.onsite_Visits__r!=null &&
              this.onsite_Visits__r.equals(other.getOnsite_Visits__r()))) &&
            ((this.openActivities==null && other.getOpenActivities()==null) || 
             (this.openActivities!=null &&
              this.openActivities.equals(other.getOpenActivities()))) &&
            ((this.opportunities==null && other.getOpportunities()==null) || 
             (this.opportunities!=null &&
              this.opportunities.equals(other.getOpportunities()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.press_Mentions__r==null && other.getPress_Mentions__r()==null) || 
             (this.press_Mentions__r!=null &&
              this.press_Mentions__r.equals(other.getPress_Mentions__r()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.shares==null && other.getShares()==null) || 
             (this.shares!=null &&
              this.shares.equals(other.getShares()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              this.tasks.equals(other.getTasks()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getActualCost() != null) {
            _hashCode += getActualCost().hashCode();
        }
        if (getAmountAllOpportunities() != null) {
            _hashCode += getAmountAllOpportunities().hashCode();
        }
        if (getAmountWonOpportunities() != null) {
            _hashCode += getAmountWonOpportunities().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getBudgetedCost() != null) {
            _hashCode += getBudgetedCost().hashCode();
        }
        if (getCampaignMemberRecordTypeId() != null) {
            _hashCode += getCampaignMemberRecordTypeId().hashCode();
        }
        if (getCampaignMembers() != null) {
            _hashCode += getCampaignMembers().hashCode();
        }
        if (getChildCampaigns() != null) {
            _hashCode += getChildCampaigns().hashCode();
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
        if (getDemos__r() != null) {
            _hashCode += getDemos__r().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getEvents() != null) {
            _hashCode += getEvents().hashCode();
        }
        if (getExpectedResponse() != null) {
            _hashCode += getExpectedResponse().hashCode();
        }
        if (getExpectedRevenue() != null) {
            _hashCode += getExpectedRevenue().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getFeeds() != null) {
            _hashCode += getFeeds().hashCode();
        }
        if (getIndividual_Email_Results__r() != null) {
            _hashCode += getIndividual_Email_Results__r().hashCode();
        }
        if (getIsActive() != null) {
            _hashCode += getIsActive().hashCode();
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
        if (getNumberOfContacts() != null) {
            _hashCode += getNumberOfContacts().hashCode();
        }
        if (getNumberOfConvertedLeads() != null) {
            _hashCode += getNumberOfConvertedLeads().hashCode();
        }
        if (getNumberOfLeads() != null) {
            _hashCode += getNumberOfLeads().hashCode();
        }
        if (getNumberOfOpportunities() != null) {
            _hashCode += getNumberOfOpportunities().hashCode();
        }
        if (getNumberOfResponses() != null) {
            _hashCode += getNumberOfResponses().hashCode();
        }
        if (getNumberOfWonOpportunities() != null) {
            _hashCode += getNumberOfWonOpportunities().hashCode();
        }
        if (getNumberSent() != null) {
            _hashCode += getNumberSent().hashCode();
        }
        if (getNumber_of_Press_Mentions__c() != null) {
            _hashCode += getNumber_of_Press_Mentions__c().hashCode();
        }
        if (getOnsite_Visits__r() != null) {
            _hashCode += getOnsite_Visits__r().hashCode();
        }
        if (getOpenActivities() != null) {
            _hashCode += getOpenActivities().hashCode();
        }
        if (getOpportunities() != null) {
            _hashCode += getOpportunities().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getPress_Mentions__r() != null) {
            _hashCode += getPress_Mentions__r().hashCode();
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
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTasks() != null) {
            _hashCode += getTasks().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Campaign.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Campaign"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityHistories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActivityHistories"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActualCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountAllOpportunities");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AmountAllOpportunities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountWonOpportunities");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AmountWonOpportunities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("budgetedCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BudgetedCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignMemberRecordTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CampaignMemberRecordTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignMembers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CampaignMembers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childCampaigns");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ChildCampaigns"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("demos__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Demos__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("expectedResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ExpectedResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ExpectedRevenue"));
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
        elemField.setFieldName("feeds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Feeds"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("individual_Email_Results__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Individual_Email_Results__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isActive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsActive"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfContacts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NumberOfContacts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfConvertedLeads");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NumberOfConvertedLeads"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfLeads");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NumberOfLeads"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfOpportunities");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NumberOfOpportunities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfResponses");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NumberOfResponses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfWonOpportunities");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NumberOfWonOpportunities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberSent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NumberSent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number_of_Press_Mentions__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Number_of_Press_Mentions__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("opportunities");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Opportunities"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
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
        elemField.setFieldName("press_Mentions__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Press_Mentions__r"));
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
        elemField.setFieldName("shares");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Shares"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Type"));
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

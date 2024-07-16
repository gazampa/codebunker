/**
 * Opportunity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Opportunity  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.Double AM_Law_Ranking__c;

    private com.sforce.soap.enterprise.sobject.Account account;

    private java.lang.String accountId;

    private com.sforce.soap.enterprise.QueryResult accountPartners;

    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private java.lang.Double amount;

    private java.lang.Double annual_Amount__c;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String billing_City__c;

    private java.lang.Double CP_Case_Opp__c;

    private com.sforce.soap.enterprise.sobject.Campaign campaign;

    private java.lang.String campaignId;

    private java.util.Date closeDate;

    private com.sforce.soap.enterprise.QueryResult competitor__r;

    private java.lang.Double concurforce__AccruedUnApprovedExpenseTotal__c;

    private java.lang.Double concurforce__AccruedUnApprovedExpenses__c;

    private com.sforce.soap.enterprise.QueryResult concurforce__Allocations__r;

    private com.sforce.soap.enterprise.QueryResult concurforce__CT_Object_Lookups__r;

    private com.sforce.soap.enterprise.QueryResult concurforce__Expense_Total_Oppty__r;

    private java.lang.Double concurforce__FinalExpenseTotal__c;

    private java.lang.Double concurforce__FinalExpense__c;

    private java.lang.Boolean convert_from_CP_to_PHP__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.Double custom_Product_Opp__c;

    private java.lang.String deal_Type__c;

    private com.sforce.soap.enterprise.QueryResult demos__r;

    private java.lang.String description;

    private java.lang.Double desired_Seats__c;

    private com.sforce.soap.enterprise.QueryResult events;

    private java.lang.Double expectedRevenue;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult feeds;

    private java.lang.String fiscal;

    private java.lang.Integer fiscalQuarter;

    private java.lang.Integer fiscalYear;

    private java.lang.String forecastCategory;

    private java.lang.String forecastCategoryName;

    private java.lang.Double gigs__c;

    private java.lang.Double govt_Maintenance_Amount__c;

    private java.lang.Double govt_Pricing__c;

    private java.lang.Boolean hasOpportunityLineItem;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.Double initial_Amount__c;

    private java.lang.Boolean isClosed;

    private java.lang.Boolean isDeleted;

    private java.lang.Boolean isWon;

    private java.util.Date lastActivityDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String leadSource;

    private com.sforce.soap.enterprise.QueryResult meetings__r;

    private java.lang.Boolean minimum_Commitment__c;

    private java.lang.Double monthly_Amount__c;

    private java.lang.String name;

    private java.lang.String next_Steps__c;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private java.lang.Double number_of_CP_Fee_Products__c;

    private java.lang.String onsite_Visit__c;

    private com.sforce.soap.enterprise.sobject.Old_Onsite_Visit__c onsite_Visit__r;

    private com.sforce.soap.enterprise.QueryResult openActivities;

    private com.sforce.soap.enterprise.QueryResult opportunityCompetitors;

    private com.sforce.soap.enterprise.QueryResult opportunityContactRoles;

    private com.sforce.soap.enterprise.QueryResult opportunityHistories;

    private com.sforce.soap.enterprise.QueryResult opportunityLineItems;

    private com.sforce.soap.enterprise.QueryResult opportunityPartnersFrom;

    private com.sforce.soap.enterprise.sobject.User owner;

    private java.lang.String ownerId;

    private com.sforce.soap.enterprise.QueryResult partners;

    private com.sforce.soap.enterprise.QueryResult pilots1__r;

    private com.sforce.soap.enterprise.sobject.Pricebook2 pricebook2;

    private java.lang.String pricebook2Id;

    private java.lang.Double probability;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.util.Date prospecting_to_Process_Established_Date__c;

    private com.sforce.soap.enterprise.sobject.RecordType recordType;

    private java.lang.String recordTypeId;

    private java.lang.String referring_Partner__c;

    private com.sforce.soap.enterprise.sobject.Account referring_Partner__r;

    private java.lang.String reseller_Partner__c;

    private com.sforce.soap.enterprise.sobject.Account reseller_Partner__r;

    private java.lang.Boolean reseller__c;

    private com.sforce.soap.enterprise.QueryResult shares;

    private java.lang.String stageName;

    private java.util.Calendar status_Last_Modified__c;

    private java.lang.String status__c;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    private java.lang.Double temp_Instance_Opp__c;

    private java.lang.Double term_Length__c;

    private com.sforce.soap.enterprise.QueryResult tickets__r;

    private java.lang.Double total_Amount__c;

    private java.lang.Double total_Processing_Products__c;

    private java.lang.Double total_Users__c;

    private java.lang.String trial_Contact_Name__c;

    private java.lang.Double trial_Period__c;

    private java.lang.String type;

    private java.lang.Double users__c;

    public Opportunity() {
    }

    public Opportunity(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.Double AM_Law_Ranking__c,
           com.sforce.soap.enterprise.sobject.Account account,
           java.lang.String accountId,
           com.sforce.soap.enterprise.QueryResult accountPartners,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           java.lang.Double amount,
           java.lang.Double annual_Amount__c,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String billing_City__c,
           java.lang.Double CP_Case_Opp__c,
           com.sforce.soap.enterprise.sobject.Campaign campaign,
           java.lang.String campaignId,
           java.util.Date closeDate,
           com.sforce.soap.enterprise.QueryResult competitor__r,
           java.lang.Double concurforce__AccruedUnApprovedExpenseTotal__c,
           java.lang.Double concurforce__AccruedUnApprovedExpenses__c,
           com.sforce.soap.enterprise.QueryResult concurforce__Allocations__r,
           com.sforce.soap.enterprise.QueryResult concurforce__CT_Object_Lookups__r,
           com.sforce.soap.enterprise.QueryResult concurforce__Expense_Total_Oppty__r,
           java.lang.Double concurforce__FinalExpenseTotal__c,
           java.lang.Double concurforce__FinalExpense__c,
           java.lang.Boolean convert_from_CP_to_PHP__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.Double custom_Product_Opp__c,
           java.lang.String deal_Type__c,
           com.sforce.soap.enterprise.QueryResult demos__r,
           java.lang.String description,
           java.lang.Double desired_Seats__c,
           com.sforce.soap.enterprise.QueryResult events,
           java.lang.Double expectedRevenue,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult feeds,
           java.lang.String fiscal,
           java.lang.Integer fiscalQuarter,
           java.lang.Integer fiscalYear,
           java.lang.String forecastCategory,
           java.lang.String forecastCategoryName,
           java.lang.Double gigs__c,
           java.lang.Double govt_Maintenance_Amount__c,
           java.lang.Double govt_Pricing__c,
           java.lang.Boolean hasOpportunityLineItem,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.Double initial_Amount__c,
           java.lang.Boolean isClosed,
           java.lang.Boolean isDeleted,
           java.lang.Boolean isWon,
           java.util.Date lastActivityDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String leadSource,
           com.sforce.soap.enterprise.QueryResult meetings__r,
           java.lang.Boolean minimum_Commitment__c,
           java.lang.Double monthly_Amount__c,
           java.lang.String name,
           java.lang.String next_Steps__c,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           java.lang.Double number_of_CP_Fee_Products__c,
           java.lang.String onsite_Visit__c,
           com.sforce.soap.enterprise.sobject.Old_Onsite_Visit__c onsite_Visit__r,
           com.sforce.soap.enterprise.QueryResult openActivities,
           com.sforce.soap.enterprise.QueryResult opportunityCompetitors,
           com.sforce.soap.enterprise.QueryResult opportunityContactRoles,
           com.sforce.soap.enterprise.QueryResult opportunityHistories,
           com.sforce.soap.enterprise.QueryResult opportunityLineItems,
           com.sforce.soap.enterprise.QueryResult opportunityPartnersFrom,
           com.sforce.soap.enterprise.sobject.User owner,
           java.lang.String ownerId,
           com.sforce.soap.enterprise.QueryResult partners,
           com.sforce.soap.enterprise.QueryResult pilots1__r,
           com.sforce.soap.enterprise.sobject.Pricebook2 pricebook2,
           java.lang.String pricebook2Id,
           java.lang.Double probability,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.util.Date prospecting_to_Process_Established_Date__c,
           com.sforce.soap.enterprise.sobject.RecordType recordType,
           java.lang.String recordTypeId,
           java.lang.String referring_Partner__c,
           com.sforce.soap.enterprise.sobject.Account referring_Partner__r,
           java.lang.String reseller_Partner__c,
           com.sforce.soap.enterprise.sobject.Account reseller_Partner__r,
           java.lang.Boolean reseller__c,
           com.sforce.soap.enterprise.QueryResult shares,
           java.lang.String stageName,
           java.util.Calendar status_Last_Modified__c,
           java.lang.String status__c,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks,
           java.lang.Double temp_Instance_Opp__c,
           java.lang.Double term_Length__c,
           com.sforce.soap.enterprise.QueryResult tickets__r,
           java.lang.Double total_Amount__c,
           java.lang.Double total_Processing_Products__c,
           java.lang.Double total_Users__c,
           java.lang.String trial_Contact_Name__c,
           java.lang.Double trial_Period__c,
           java.lang.String type,
           java.lang.Double users__c) {
        super(
            fieldsToNull,
            id);
        this.AM_Law_Ranking__c = AM_Law_Ranking__c;
        this.account = account;
        this.accountId = accountId;
        this.accountPartners = accountPartners;
        this.activityHistories = activityHistories;
        this.amount = amount;
        this.annual_Amount__c = annual_Amount__c;
        this.attachments = attachments;
        this.billing_City__c = billing_City__c;
        this.CP_Case_Opp__c = CP_Case_Opp__c;
        this.campaign = campaign;
        this.campaignId = campaignId;
        this.closeDate = closeDate;
        this.competitor__r = competitor__r;
        this.concurforce__AccruedUnApprovedExpenseTotal__c = concurforce__AccruedUnApprovedExpenseTotal__c;
        this.concurforce__AccruedUnApprovedExpenses__c = concurforce__AccruedUnApprovedExpenses__c;
        this.concurforce__Allocations__r = concurforce__Allocations__r;
        this.concurforce__CT_Object_Lookups__r = concurforce__CT_Object_Lookups__r;
        this.concurforce__Expense_Total_Oppty__r = concurforce__Expense_Total_Oppty__r;
        this.concurforce__FinalExpenseTotal__c = concurforce__FinalExpenseTotal__c;
        this.concurforce__FinalExpense__c = concurforce__FinalExpense__c;
        this.convert_from_CP_to_PHP__c = convert_from_CP_to_PHP__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.custom_Product_Opp__c = custom_Product_Opp__c;
        this.deal_Type__c = deal_Type__c;
        this.demos__r = demos__r;
        this.description = description;
        this.desired_Seats__c = desired_Seats__c;
        this.events = events;
        this.expectedRevenue = expectedRevenue;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.feeds = feeds;
        this.fiscal = fiscal;
        this.fiscalQuarter = fiscalQuarter;
        this.fiscalYear = fiscalYear;
        this.forecastCategory = forecastCategory;
        this.forecastCategoryName = forecastCategoryName;
        this.gigs__c = gigs__c;
        this.govt_Maintenance_Amount__c = govt_Maintenance_Amount__c;
        this.govt_Pricing__c = govt_Pricing__c;
        this.hasOpportunityLineItem = hasOpportunityLineItem;
        this.histories = histories;
        this.initial_Amount__c = initial_Amount__c;
        this.isClosed = isClosed;
        this.isDeleted = isDeleted;
        this.isWon = isWon;
        this.lastActivityDate = lastActivityDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.leadSource = leadSource;
        this.meetings__r = meetings__r;
        this.minimum_Commitment__c = minimum_Commitment__c;
        this.monthly_Amount__c = monthly_Amount__c;
        this.name = name;
        this.next_Steps__c = next_Steps__c;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.number_of_CP_Fee_Products__c = number_of_CP_Fee_Products__c;
        this.onsite_Visit__c = onsite_Visit__c;
        this.onsite_Visit__r = onsite_Visit__r;
        this.openActivities = openActivities;
        this.opportunityCompetitors = opportunityCompetitors;
        this.opportunityContactRoles = opportunityContactRoles;
        this.opportunityHistories = opportunityHistories;
        this.opportunityLineItems = opportunityLineItems;
        this.opportunityPartnersFrom = opportunityPartnersFrom;
        this.owner = owner;
        this.ownerId = ownerId;
        this.partners = partners;
        this.pilots1__r = pilots1__r;
        this.pricebook2 = pricebook2;
        this.pricebook2Id = pricebook2Id;
        this.probability = probability;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.prospecting_to_Process_Established_Date__c = prospecting_to_Process_Established_Date__c;
        this.recordType = recordType;
        this.recordTypeId = recordTypeId;
        this.referring_Partner__c = referring_Partner__c;
        this.referring_Partner__r = referring_Partner__r;
        this.reseller_Partner__c = reseller_Partner__c;
        this.reseller_Partner__r = reseller_Partner__r;
        this.reseller__c = reseller__c;
        this.shares = shares;
        this.stageName = stageName;
        this.status_Last_Modified__c = status_Last_Modified__c;
        this.status__c = status__c;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
        this.temp_Instance_Opp__c = temp_Instance_Opp__c;
        this.term_Length__c = term_Length__c;
        this.tickets__r = tickets__r;
        this.total_Amount__c = total_Amount__c;
        this.total_Processing_Products__c = total_Processing_Products__c;
        this.total_Users__c = total_Users__c;
        this.trial_Contact_Name__c = trial_Contact_Name__c;
        this.trial_Period__c = trial_Period__c;
        this.type = type;
        this.users__c = users__c;
    }


    /**
     * Gets the AM_Law_Ranking__c value for this Opportunity.
     * 
     * @return AM_Law_Ranking__c
     */
    public java.lang.Double getAM_Law_Ranking__c() {
        return AM_Law_Ranking__c;
    }


    /**
     * Sets the AM_Law_Ranking__c value for this Opportunity.
     * 
     * @param AM_Law_Ranking__c
     */
    public void setAM_Law_Ranking__c(java.lang.Double AM_Law_Ranking__c) {
        this.AM_Law_Ranking__c = AM_Law_Ranking__c;
    }


    /**
     * Gets the account value for this Opportunity.
     * 
     * @return account
     */
    public com.sforce.soap.enterprise.sobject.Account getAccount() {
        return account;
    }


    /**
     * Sets the account value for this Opportunity.
     * 
     * @param account
     */
    public void setAccount(com.sforce.soap.enterprise.sobject.Account account) {
        this.account = account;
    }


    /**
     * Gets the accountId value for this Opportunity.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this Opportunity.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the accountPartners value for this Opportunity.
     * 
     * @return accountPartners
     */
    public com.sforce.soap.enterprise.QueryResult getAccountPartners() {
        return accountPartners;
    }


    /**
     * Sets the accountPartners value for this Opportunity.
     * 
     * @param accountPartners
     */
    public void setAccountPartners(com.sforce.soap.enterprise.QueryResult accountPartners) {
        this.accountPartners = accountPartners;
    }


    /**
     * Gets the activityHistories value for this Opportunity.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this Opportunity.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the amount value for this Opportunity.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this Opportunity.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }


    /**
     * Gets the annual_Amount__c value for this Opportunity.
     * 
     * @return annual_Amount__c
     */
    public java.lang.Double getAnnual_Amount__c() {
        return annual_Amount__c;
    }


    /**
     * Sets the annual_Amount__c value for this Opportunity.
     * 
     * @param annual_Amount__c
     */
    public void setAnnual_Amount__c(java.lang.Double annual_Amount__c) {
        this.annual_Amount__c = annual_Amount__c;
    }


    /**
     * Gets the attachments value for this Opportunity.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Opportunity.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the billing_City__c value for this Opportunity.
     * 
     * @return billing_City__c
     */
    public java.lang.String getBilling_City__c() {
        return billing_City__c;
    }


    /**
     * Sets the billing_City__c value for this Opportunity.
     * 
     * @param billing_City__c
     */
    public void setBilling_City__c(java.lang.String billing_City__c) {
        this.billing_City__c = billing_City__c;
    }


    /**
     * Gets the CP_Case_Opp__c value for this Opportunity.
     * 
     * @return CP_Case_Opp__c
     */
    public java.lang.Double getCP_Case_Opp__c() {
        return CP_Case_Opp__c;
    }


    /**
     * Sets the CP_Case_Opp__c value for this Opportunity.
     * 
     * @param CP_Case_Opp__c
     */
    public void setCP_Case_Opp__c(java.lang.Double CP_Case_Opp__c) {
        this.CP_Case_Opp__c = CP_Case_Opp__c;
    }


    /**
     * Gets the campaign value for this Opportunity.
     * 
     * @return campaign
     */
    public com.sforce.soap.enterprise.sobject.Campaign getCampaign() {
        return campaign;
    }


    /**
     * Sets the campaign value for this Opportunity.
     * 
     * @param campaign
     */
    public void setCampaign(com.sforce.soap.enterprise.sobject.Campaign campaign) {
        this.campaign = campaign;
    }


    /**
     * Gets the campaignId value for this Opportunity.
     * 
     * @return campaignId
     */
    public java.lang.String getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this Opportunity.
     * 
     * @param campaignId
     */
    public void setCampaignId(java.lang.String campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the closeDate value for this Opportunity.
     * 
     * @return closeDate
     */
    public java.util.Date getCloseDate() {
        return closeDate;
    }


    /**
     * Sets the closeDate value for this Opportunity.
     * 
     * @param closeDate
     */
    public void setCloseDate(java.util.Date closeDate) {
        this.closeDate = closeDate;
    }


    /**
     * Gets the competitor__r value for this Opportunity.
     * 
     * @return competitor__r
     */
    public com.sforce.soap.enterprise.QueryResult getCompetitor__r() {
        return competitor__r;
    }


    /**
     * Sets the competitor__r value for this Opportunity.
     * 
     * @param competitor__r
     */
    public void setCompetitor__r(com.sforce.soap.enterprise.QueryResult competitor__r) {
        this.competitor__r = competitor__r;
    }


    /**
     * Gets the concurforce__AccruedUnApprovedExpenseTotal__c value for this Opportunity.
     * 
     * @return concurforce__AccruedUnApprovedExpenseTotal__c
     */
    public java.lang.Double getConcurforce__AccruedUnApprovedExpenseTotal__c() {
        return concurforce__AccruedUnApprovedExpenseTotal__c;
    }


    /**
     * Sets the concurforce__AccruedUnApprovedExpenseTotal__c value for this Opportunity.
     * 
     * @param concurforce__AccruedUnApprovedExpenseTotal__c
     */
    public void setConcurforce__AccruedUnApprovedExpenseTotal__c(java.lang.Double concurforce__AccruedUnApprovedExpenseTotal__c) {
        this.concurforce__AccruedUnApprovedExpenseTotal__c = concurforce__AccruedUnApprovedExpenseTotal__c;
    }


    /**
     * Gets the concurforce__AccruedUnApprovedExpenses__c value for this Opportunity.
     * 
     * @return concurforce__AccruedUnApprovedExpenses__c
     */
    public java.lang.Double getConcurforce__AccruedUnApprovedExpenses__c() {
        return concurforce__AccruedUnApprovedExpenses__c;
    }


    /**
     * Sets the concurforce__AccruedUnApprovedExpenses__c value for this Opportunity.
     * 
     * @param concurforce__AccruedUnApprovedExpenses__c
     */
    public void setConcurforce__AccruedUnApprovedExpenses__c(java.lang.Double concurforce__AccruedUnApprovedExpenses__c) {
        this.concurforce__AccruedUnApprovedExpenses__c = concurforce__AccruedUnApprovedExpenses__c;
    }


    /**
     * Gets the concurforce__Allocations__r value for this Opportunity.
     * 
     * @return concurforce__Allocations__r
     */
    public com.sforce.soap.enterprise.QueryResult getConcurforce__Allocations__r() {
        return concurforce__Allocations__r;
    }


    /**
     * Sets the concurforce__Allocations__r value for this Opportunity.
     * 
     * @param concurforce__Allocations__r
     */
    public void setConcurforce__Allocations__r(com.sforce.soap.enterprise.QueryResult concurforce__Allocations__r) {
        this.concurforce__Allocations__r = concurforce__Allocations__r;
    }


    /**
     * Gets the concurforce__CT_Object_Lookups__r value for this Opportunity.
     * 
     * @return concurforce__CT_Object_Lookups__r
     */
    public com.sforce.soap.enterprise.QueryResult getConcurforce__CT_Object_Lookups__r() {
        return concurforce__CT_Object_Lookups__r;
    }


    /**
     * Sets the concurforce__CT_Object_Lookups__r value for this Opportunity.
     * 
     * @param concurforce__CT_Object_Lookups__r
     */
    public void setConcurforce__CT_Object_Lookups__r(com.sforce.soap.enterprise.QueryResult concurforce__CT_Object_Lookups__r) {
        this.concurforce__CT_Object_Lookups__r = concurforce__CT_Object_Lookups__r;
    }


    /**
     * Gets the concurforce__Expense_Total_Oppty__r value for this Opportunity.
     * 
     * @return concurforce__Expense_Total_Oppty__r
     */
    public com.sforce.soap.enterprise.QueryResult getConcurforce__Expense_Total_Oppty__r() {
        return concurforce__Expense_Total_Oppty__r;
    }


    /**
     * Sets the concurforce__Expense_Total_Oppty__r value for this Opportunity.
     * 
     * @param concurforce__Expense_Total_Oppty__r
     */
    public void setConcurforce__Expense_Total_Oppty__r(com.sforce.soap.enterprise.QueryResult concurforce__Expense_Total_Oppty__r) {
        this.concurforce__Expense_Total_Oppty__r = concurforce__Expense_Total_Oppty__r;
    }


    /**
     * Gets the concurforce__FinalExpenseTotal__c value for this Opportunity.
     * 
     * @return concurforce__FinalExpenseTotal__c
     */
    public java.lang.Double getConcurforce__FinalExpenseTotal__c() {
        return concurforce__FinalExpenseTotal__c;
    }


    /**
     * Sets the concurforce__FinalExpenseTotal__c value for this Opportunity.
     * 
     * @param concurforce__FinalExpenseTotal__c
     */
    public void setConcurforce__FinalExpenseTotal__c(java.lang.Double concurforce__FinalExpenseTotal__c) {
        this.concurforce__FinalExpenseTotal__c = concurforce__FinalExpenseTotal__c;
    }


    /**
     * Gets the concurforce__FinalExpense__c value for this Opportunity.
     * 
     * @return concurforce__FinalExpense__c
     */
    public java.lang.Double getConcurforce__FinalExpense__c() {
        return concurforce__FinalExpense__c;
    }


    /**
     * Sets the concurforce__FinalExpense__c value for this Opportunity.
     * 
     * @param concurforce__FinalExpense__c
     */
    public void setConcurforce__FinalExpense__c(java.lang.Double concurforce__FinalExpense__c) {
        this.concurforce__FinalExpense__c = concurforce__FinalExpense__c;
    }


    /**
     * Gets the convert_from_CP_to_PHP__c value for this Opportunity.
     * 
     * @return convert_from_CP_to_PHP__c
     */
    public java.lang.Boolean getConvert_from_CP_to_PHP__c() {
        return convert_from_CP_to_PHP__c;
    }


    /**
     * Sets the convert_from_CP_to_PHP__c value for this Opportunity.
     * 
     * @param convert_from_CP_to_PHP__c
     */
    public void setConvert_from_CP_to_PHP__c(java.lang.Boolean convert_from_CP_to_PHP__c) {
        this.convert_from_CP_to_PHP__c = convert_from_CP_to_PHP__c;
    }


    /**
     * Gets the createdBy value for this Opportunity.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Opportunity.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Opportunity.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Opportunity.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Opportunity.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Opportunity.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the custom_Product_Opp__c value for this Opportunity.
     * 
     * @return custom_Product_Opp__c
     */
    public java.lang.Double getCustom_Product_Opp__c() {
        return custom_Product_Opp__c;
    }


    /**
     * Sets the custom_Product_Opp__c value for this Opportunity.
     * 
     * @param custom_Product_Opp__c
     */
    public void setCustom_Product_Opp__c(java.lang.Double custom_Product_Opp__c) {
        this.custom_Product_Opp__c = custom_Product_Opp__c;
    }


    /**
     * Gets the deal_Type__c value for this Opportunity.
     * 
     * @return deal_Type__c
     */
    public java.lang.String getDeal_Type__c() {
        return deal_Type__c;
    }


    /**
     * Sets the deal_Type__c value for this Opportunity.
     * 
     * @param deal_Type__c
     */
    public void setDeal_Type__c(java.lang.String deal_Type__c) {
        this.deal_Type__c = deal_Type__c;
    }


    /**
     * Gets the demos__r value for this Opportunity.
     * 
     * @return demos__r
     */
    public com.sforce.soap.enterprise.QueryResult getDemos__r() {
        return demos__r;
    }


    /**
     * Sets the demos__r value for this Opportunity.
     * 
     * @param demos__r
     */
    public void setDemos__r(com.sforce.soap.enterprise.QueryResult demos__r) {
        this.demos__r = demos__r;
    }


    /**
     * Gets the description value for this Opportunity.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Opportunity.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the desired_Seats__c value for this Opportunity.
     * 
     * @return desired_Seats__c
     */
    public java.lang.Double getDesired_Seats__c() {
        return desired_Seats__c;
    }


    /**
     * Sets the desired_Seats__c value for this Opportunity.
     * 
     * @param desired_Seats__c
     */
    public void setDesired_Seats__c(java.lang.Double desired_Seats__c) {
        this.desired_Seats__c = desired_Seats__c;
    }


    /**
     * Gets the events value for this Opportunity.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Opportunity.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the expectedRevenue value for this Opportunity.
     * 
     * @return expectedRevenue
     */
    public java.lang.Double getExpectedRevenue() {
        return expectedRevenue;
    }


    /**
     * Sets the expectedRevenue value for this Opportunity.
     * 
     * @param expectedRevenue
     */
    public void setExpectedRevenue(java.lang.Double expectedRevenue) {
        this.expectedRevenue = expectedRevenue;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Opportunity.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Opportunity.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the feeds value for this Opportunity.
     * 
     * @return feeds
     */
    public com.sforce.soap.enterprise.QueryResult getFeeds() {
        return feeds;
    }


    /**
     * Sets the feeds value for this Opportunity.
     * 
     * @param feeds
     */
    public void setFeeds(com.sforce.soap.enterprise.QueryResult feeds) {
        this.feeds = feeds;
    }


    /**
     * Gets the fiscal value for this Opportunity.
     * 
     * @return fiscal
     */
    public java.lang.String getFiscal() {
        return fiscal;
    }


    /**
     * Sets the fiscal value for this Opportunity.
     * 
     * @param fiscal
     */
    public void setFiscal(java.lang.String fiscal) {
        this.fiscal = fiscal;
    }


    /**
     * Gets the fiscalQuarter value for this Opportunity.
     * 
     * @return fiscalQuarter
     */
    public java.lang.Integer getFiscalQuarter() {
        return fiscalQuarter;
    }


    /**
     * Sets the fiscalQuarter value for this Opportunity.
     * 
     * @param fiscalQuarter
     */
    public void setFiscalQuarter(java.lang.Integer fiscalQuarter) {
        this.fiscalQuarter = fiscalQuarter;
    }


    /**
     * Gets the fiscalYear value for this Opportunity.
     * 
     * @return fiscalYear
     */
    public java.lang.Integer getFiscalYear() {
        return fiscalYear;
    }


    /**
     * Sets the fiscalYear value for this Opportunity.
     * 
     * @param fiscalYear
     */
    public void setFiscalYear(java.lang.Integer fiscalYear) {
        this.fiscalYear = fiscalYear;
    }


    /**
     * Gets the forecastCategory value for this Opportunity.
     * 
     * @return forecastCategory
     */
    public java.lang.String getForecastCategory() {
        return forecastCategory;
    }


    /**
     * Sets the forecastCategory value for this Opportunity.
     * 
     * @param forecastCategory
     */
    public void setForecastCategory(java.lang.String forecastCategory) {
        this.forecastCategory = forecastCategory;
    }


    /**
     * Gets the forecastCategoryName value for this Opportunity.
     * 
     * @return forecastCategoryName
     */
    public java.lang.String getForecastCategoryName() {
        return forecastCategoryName;
    }


    /**
     * Sets the forecastCategoryName value for this Opportunity.
     * 
     * @param forecastCategoryName
     */
    public void setForecastCategoryName(java.lang.String forecastCategoryName) {
        this.forecastCategoryName = forecastCategoryName;
    }


    /**
     * Gets the gigs__c value for this Opportunity.
     * 
     * @return gigs__c
     */
    public java.lang.Double getGigs__c() {
        return gigs__c;
    }


    /**
     * Sets the gigs__c value for this Opportunity.
     * 
     * @param gigs__c
     */
    public void setGigs__c(java.lang.Double gigs__c) {
        this.gigs__c = gigs__c;
    }


    /**
     * Gets the govt_Maintenance_Amount__c value for this Opportunity.
     * 
     * @return govt_Maintenance_Amount__c
     */
    public java.lang.Double getGovt_Maintenance_Amount__c() {
        return govt_Maintenance_Amount__c;
    }


    /**
     * Sets the govt_Maintenance_Amount__c value for this Opportunity.
     * 
     * @param govt_Maintenance_Amount__c
     */
    public void setGovt_Maintenance_Amount__c(java.lang.Double govt_Maintenance_Amount__c) {
        this.govt_Maintenance_Amount__c = govt_Maintenance_Amount__c;
    }


    /**
     * Gets the govt_Pricing__c value for this Opportunity.
     * 
     * @return govt_Pricing__c
     */
    public java.lang.Double getGovt_Pricing__c() {
        return govt_Pricing__c;
    }


    /**
     * Sets the govt_Pricing__c value for this Opportunity.
     * 
     * @param govt_Pricing__c
     */
    public void setGovt_Pricing__c(java.lang.Double govt_Pricing__c) {
        this.govt_Pricing__c = govt_Pricing__c;
    }


    /**
     * Gets the hasOpportunityLineItem value for this Opportunity.
     * 
     * @return hasOpportunityLineItem
     */
    public java.lang.Boolean getHasOpportunityLineItem() {
        return hasOpportunityLineItem;
    }


    /**
     * Sets the hasOpportunityLineItem value for this Opportunity.
     * 
     * @param hasOpportunityLineItem
     */
    public void setHasOpportunityLineItem(java.lang.Boolean hasOpportunityLineItem) {
        this.hasOpportunityLineItem = hasOpportunityLineItem;
    }


    /**
     * Gets the histories value for this Opportunity.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Opportunity.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the initial_Amount__c value for this Opportunity.
     * 
     * @return initial_Amount__c
     */
    public java.lang.Double getInitial_Amount__c() {
        return initial_Amount__c;
    }


    /**
     * Sets the initial_Amount__c value for this Opportunity.
     * 
     * @param initial_Amount__c
     */
    public void setInitial_Amount__c(java.lang.Double initial_Amount__c) {
        this.initial_Amount__c = initial_Amount__c;
    }


    /**
     * Gets the isClosed value for this Opportunity.
     * 
     * @return isClosed
     */
    public java.lang.Boolean getIsClosed() {
        return isClosed;
    }


    /**
     * Sets the isClosed value for this Opportunity.
     * 
     * @param isClosed
     */
    public void setIsClosed(java.lang.Boolean isClosed) {
        this.isClosed = isClosed;
    }


    /**
     * Gets the isDeleted value for this Opportunity.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Opportunity.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the isWon value for this Opportunity.
     * 
     * @return isWon
     */
    public java.lang.Boolean getIsWon() {
        return isWon;
    }


    /**
     * Sets the isWon value for this Opportunity.
     * 
     * @param isWon
     */
    public void setIsWon(java.lang.Boolean isWon) {
        this.isWon = isWon;
    }


    /**
     * Gets the lastActivityDate value for this Opportunity.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Opportunity.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this Opportunity.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Opportunity.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Opportunity.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Opportunity.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Opportunity.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Opportunity.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the leadSource value for this Opportunity.
     * 
     * @return leadSource
     */
    public java.lang.String getLeadSource() {
        return leadSource;
    }


    /**
     * Sets the leadSource value for this Opportunity.
     * 
     * @param leadSource
     */
    public void setLeadSource(java.lang.String leadSource) {
        this.leadSource = leadSource;
    }


    /**
     * Gets the meetings__r value for this Opportunity.
     * 
     * @return meetings__r
     */
    public com.sforce.soap.enterprise.QueryResult getMeetings__r() {
        return meetings__r;
    }


    /**
     * Sets the meetings__r value for this Opportunity.
     * 
     * @param meetings__r
     */
    public void setMeetings__r(com.sforce.soap.enterprise.QueryResult meetings__r) {
        this.meetings__r = meetings__r;
    }


    /**
     * Gets the minimum_Commitment__c value for this Opportunity.
     * 
     * @return minimum_Commitment__c
     */
    public java.lang.Boolean getMinimum_Commitment__c() {
        return minimum_Commitment__c;
    }


    /**
     * Sets the minimum_Commitment__c value for this Opportunity.
     * 
     * @param minimum_Commitment__c
     */
    public void setMinimum_Commitment__c(java.lang.Boolean minimum_Commitment__c) {
        this.minimum_Commitment__c = minimum_Commitment__c;
    }


    /**
     * Gets the monthly_Amount__c value for this Opportunity.
     * 
     * @return monthly_Amount__c
     */
    public java.lang.Double getMonthly_Amount__c() {
        return monthly_Amount__c;
    }


    /**
     * Sets the monthly_Amount__c value for this Opportunity.
     * 
     * @param monthly_Amount__c
     */
    public void setMonthly_Amount__c(java.lang.Double monthly_Amount__c) {
        this.monthly_Amount__c = monthly_Amount__c;
    }


    /**
     * Gets the name value for this Opportunity.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Opportunity.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the next_Steps__c value for this Opportunity.
     * 
     * @return next_Steps__c
     */
    public java.lang.String getNext_Steps__c() {
        return next_Steps__c;
    }


    /**
     * Sets the next_Steps__c value for this Opportunity.
     * 
     * @param next_Steps__c
     */
    public void setNext_Steps__c(java.lang.String next_Steps__c) {
        this.next_Steps__c = next_Steps__c;
    }


    /**
     * Gets the notes value for this Opportunity.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Opportunity.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Opportunity.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Opportunity.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the number_of_CP_Fee_Products__c value for this Opportunity.
     * 
     * @return number_of_CP_Fee_Products__c
     */
    public java.lang.Double getNumber_of_CP_Fee_Products__c() {
        return number_of_CP_Fee_Products__c;
    }


    /**
     * Sets the number_of_CP_Fee_Products__c value for this Opportunity.
     * 
     * @param number_of_CP_Fee_Products__c
     */
    public void setNumber_of_CP_Fee_Products__c(java.lang.Double number_of_CP_Fee_Products__c) {
        this.number_of_CP_Fee_Products__c = number_of_CP_Fee_Products__c;
    }


    /**
     * Gets the onsite_Visit__c value for this Opportunity.
     * 
     * @return onsite_Visit__c
     */
    public java.lang.String getOnsite_Visit__c() {
        return onsite_Visit__c;
    }


    /**
     * Sets the onsite_Visit__c value for this Opportunity.
     * 
     * @param onsite_Visit__c
     */
    public void setOnsite_Visit__c(java.lang.String onsite_Visit__c) {
        this.onsite_Visit__c = onsite_Visit__c;
    }


    /**
     * Gets the onsite_Visit__r value for this Opportunity.
     * 
     * @return onsite_Visit__r
     */
    public com.sforce.soap.enterprise.sobject.Old_Onsite_Visit__c getOnsite_Visit__r() {
        return onsite_Visit__r;
    }


    /**
     * Sets the onsite_Visit__r value for this Opportunity.
     * 
     * @param onsite_Visit__r
     */
    public void setOnsite_Visit__r(com.sforce.soap.enterprise.sobject.Old_Onsite_Visit__c onsite_Visit__r) {
        this.onsite_Visit__r = onsite_Visit__r;
    }


    /**
     * Gets the openActivities value for this Opportunity.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this Opportunity.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the opportunityCompetitors value for this Opportunity.
     * 
     * @return opportunityCompetitors
     */
    public com.sforce.soap.enterprise.QueryResult getOpportunityCompetitors() {
        return opportunityCompetitors;
    }


    /**
     * Sets the opportunityCompetitors value for this Opportunity.
     * 
     * @param opportunityCompetitors
     */
    public void setOpportunityCompetitors(com.sforce.soap.enterprise.QueryResult opportunityCompetitors) {
        this.opportunityCompetitors = opportunityCompetitors;
    }


    /**
     * Gets the opportunityContactRoles value for this Opportunity.
     * 
     * @return opportunityContactRoles
     */
    public com.sforce.soap.enterprise.QueryResult getOpportunityContactRoles() {
        return opportunityContactRoles;
    }


    /**
     * Sets the opportunityContactRoles value for this Opportunity.
     * 
     * @param opportunityContactRoles
     */
    public void setOpportunityContactRoles(com.sforce.soap.enterprise.QueryResult opportunityContactRoles) {
        this.opportunityContactRoles = opportunityContactRoles;
    }


    /**
     * Gets the opportunityHistories value for this Opportunity.
     * 
     * @return opportunityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getOpportunityHistories() {
        return opportunityHistories;
    }


    /**
     * Sets the opportunityHistories value for this Opportunity.
     * 
     * @param opportunityHistories
     */
    public void setOpportunityHistories(com.sforce.soap.enterprise.QueryResult opportunityHistories) {
        this.opportunityHistories = opportunityHistories;
    }


    /**
     * Gets the opportunityLineItems value for this Opportunity.
     * 
     * @return opportunityLineItems
     */
    public com.sforce.soap.enterprise.QueryResult getOpportunityLineItems() {
        return opportunityLineItems;
    }


    /**
     * Sets the opportunityLineItems value for this Opportunity.
     * 
     * @param opportunityLineItems
     */
    public void setOpportunityLineItems(com.sforce.soap.enterprise.QueryResult opportunityLineItems) {
        this.opportunityLineItems = opportunityLineItems;
    }


    /**
     * Gets the opportunityPartnersFrom value for this Opportunity.
     * 
     * @return opportunityPartnersFrom
     */
    public com.sforce.soap.enterprise.QueryResult getOpportunityPartnersFrom() {
        return opportunityPartnersFrom;
    }


    /**
     * Sets the opportunityPartnersFrom value for this Opportunity.
     * 
     * @param opportunityPartnersFrom
     */
    public void setOpportunityPartnersFrom(com.sforce.soap.enterprise.QueryResult opportunityPartnersFrom) {
        this.opportunityPartnersFrom = opportunityPartnersFrom;
    }


    /**
     * Gets the owner value for this Opportunity.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.User getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Opportunity.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.User owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Opportunity.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Opportunity.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the partners value for this Opportunity.
     * 
     * @return partners
     */
    public com.sforce.soap.enterprise.QueryResult getPartners() {
        return partners;
    }


    /**
     * Sets the partners value for this Opportunity.
     * 
     * @param partners
     */
    public void setPartners(com.sforce.soap.enterprise.QueryResult partners) {
        this.partners = partners;
    }


    /**
     * Gets the pilots1__r value for this Opportunity.
     * 
     * @return pilots1__r
     */
    public com.sforce.soap.enterprise.QueryResult getPilots1__r() {
        return pilots1__r;
    }


    /**
     * Sets the pilots1__r value for this Opportunity.
     * 
     * @param pilots1__r
     */
    public void setPilots1__r(com.sforce.soap.enterprise.QueryResult pilots1__r) {
        this.pilots1__r = pilots1__r;
    }


    /**
     * Gets the pricebook2 value for this Opportunity.
     * 
     * @return pricebook2
     */
    public com.sforce.soap.enterprise.sobject.Pricebook2 getPricebook2() {
        return pricebook2;
    }


    /**
     * Sets the pricebook2 value for this Opportunity.
     * 
     * @param pricebook2
     */
    public void setPricebook2(com.sforce.soap.enterprise.sobject.Pricebook2 pricebook2) {
        this.pricebook2 = pricebook2;
    }


    /**
     * Gets the pricebook2Id value for this Opportunity.
     * 
     * @return pricebook2Id
     */
    public java.lang.String getPricebook2Id() {
        return pricebook2Id;
    }


    /**
     * Sets the pricebook2Id value for this Opportunity.
     * 
     * @param pricebook2Id
     */
    public void setPricebook2Id(java.lang.String pricebook2Id) {
        this.pricebook2Id = pricebook2Id;
    }


    /**
     * Gets the probability value for this Opportunity.
     * 
     * @return probability
     */
    public java.lang.Double getProbability() {
        return probability;
    }


    /**
     * Sets the probability value for this Opportunity.
     * 
     * @param probability
     */
    public void setProbability(java.lang.Double probability) {
        this.probability = probability;
    }


    /**
     * Gets the processInstances value for this Opportunity.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Opportunity.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Opportunity.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Opportunity.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the prospecting_to_Process_Established_Date__c value for this Opportunity.
     * 
     * @return prospecting_to_Process_Established_Date__c
     */
    public java.util.Date getProspecting_to_Process_Established_Date__c() {
        return prospecting_to_Process_Established_Date__c;
    }


    /**
     * Sets the prospecting_to_Process_Established_Date__c value for this Opportunity.
     * 
     * @param prospecting_to_Process_Established_Date__c
     */
    public void setProspecting_to_Process_Established_Date__c(java.util.Date prospecting_to_Process_Established_Date__c) {
        this.prospecting_to_Process_Established_Date__c = prospecting_to_Process_Established_Date__c;
    }


    /**
     * Gets the recordType value for this Opportunity.
     * 
     * @return recordType
     */
    public com.sforce.soap.enterprise.sobject.RecordType getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this Opportunity.
     * 
     * @param recordType
     */
    public void setRecordType(com.sforce.soap.enterprise.sobject.RecordType recordType) {
        this.recordType = recordType;
    }


    /**
     * Gets the recordTypeId value for this Opportunity.
     * 
     * @return recordTypeId
     */
    public java.lang.String getRecordTypeId() {
        return recordTypeId;
    }


    /**
     * Sets the recordTypeId value for this Opportunity.
     * 
     * @param recordTypeId
     */
    public void setRecordTypeId(java.lang.String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }


    /**
     * Gets the referring_Partner__c value for this Opportunity.
     * 
     * @return referring_Partner__c
     */
    public java.lang.String getReferring_Partner__c() {
        return referring_Partner__c;
    }


    /**
     * Sets the referring_Partner__c value for this Opportunity.
     * 
     * @param referring_Partner__c
     */
    public void setReferring_Partner__c(java.lang.String referring_Partner__c) {
        this.referring_Partner__c = referring_Partner__c;
    }


    /**
     * Gets the referring_Partner__r value for this Opportunity.
     * 
     * @return referring_Partner__r
     */
    public com.sforce.soap.enterprise.sobject.Account getReferring_Partner__r() {
        return referring_Partner__r;
    }


    /**
     * Sets the referring_Partner__r value for this Opportunity.
     * 
     * @param referring_Partner__r
     */
    public void setReferring_Partner__r(com.sforce.soap.enterprise.sobject.Account referring_Partner__r) {
        this.referring_Partner__r = referring_Partner__r;
    }


    /**
     * Gets the reseller_Partner__c value for this Opportunity.
     * 
     * @return reseller_Partner__c
     */
    public java.lang.String getReseller_Partner__c() {
        return reseller_Partner__c;
    }


    /**
     * Sets the reseller_Partner__c value for this Opportunity.
     * 
     * @param reseller_Partner__c
     */
    public void setReseller_Partner__c(java.lang.String reseller_Partner__c) {
        this.reseller_Partner__c = reseller_Partner__c;
    }


    /**
     * Gets the reseller_Partner__r value for this Opportunity.
     * 
     * @return reseller_Partner__r
     */
    public com.sforce.soap.enterprise.sobject.Account getReseller_Partner__r() {
        return reseller_Partner__r;
    }


    /**
     * Sets the reseller_Partner__r value for this Opportunity.
     * 
     * @param reseller_Partner__r
     */
    public void setReseller_Partner__r(com.sforce.soap.enterprise.sobject.Account reseller_Partner__r) {
        this.reseller_Partner__r = reseller_Partner__r;
    }


    /**
     * Gets the reseller__c value for this Opportunity.
     * 
     * @return reseller__c
     */
    public java.lang.Boolean getReseller__c() {
        return reseller__c;
    }


    /**
     * Sets the reseller__c value for this Opportunity.
     * 
     * @param reseller__c
     */
    public void setReseller__c(java.lang.Boolean reseller__c) {
        this.reseller__c = reseller__c;
    }


    /**
     * Gets the shares value for this Opportunity.
     * 
     * @return shares
     */
    public com.sforce.soap.enterprise.QueryResult getShares() {
        return shares;
    }


    /**
     * Sets the shares value for this Opportunity.
     * 
     * @param shares
     */
    public void setShares(com.sforce.soap.enterprise.QueryResult shares) {
        this.shares = shares;
    }


    /**
     * Gets the stageName value for this Opportunity.
     * 
     * @return stageName
     */
    public java.lang.String getStageName() {
        return stageName;
    }


    /**
     * Sets the stageName value for this Opportunity.
     * 
     * @param stageName
     */
    public void setStageName(java.lang.String stageName) {
        this.stageName = stageName;
    }


    /**
     * Gets the status_Last_Modified__c value for this Opportunity.
     * 
     * @return status_Last_Modified__c
     */
    public java.util.Calendar getStatus_Last_Modified__c() {
        return status_Last_Modified__c;
    }


    /**
     * Sets the status_Last_Modified__c value for this Opportunity.
     * 
     * @param status_Last_Modified__c
     */
    public void setStatus_Last_Modified__c(java.util.Calendar status_Last_Modified__c) {
        this.status_Last_Modified__c = status_Last_Modified__c;
    }


    /**
     * Gets the status__c value for this Opportunity.
     * 
     * @return status__c
     */
    public java.lang.String getStatus__c() {
        return status__c;
    }


    /**
     * Sets the status__c value for this Opportunity.
     * 
     * @param status__c
     */
    public void setStatus__c(java.lang.String status__c) {
        this.status__c = status__c;
    }


    /**
     * Gets the systemModstamp value for this Opportunity.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Opportunity.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this Opportunity.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Opportunity.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the temp_Instance_Opp__c value for this Opportunity.
     * 
     * @return temp_Instance_Opp__c
     */
    public java.lang.Double getTemp_Instance_Opp__c() {
        return temp_Instance_Opp__c;
    }


    /**
     * Sets the temp_Instance_Opp__c value for this Opportunity.
     * 
     * @param temp_Instance_Opp__c
     */
    public void setTemp_Instance_Opp__c(java.lang.Double temp_Instance_Opp__c) {
        this.temp_Instance_Opp__c = temp_Instance_Opp__c;
    }


    /**
     * Gets the term_Length__c value for this Opportunity.
     * 
     * @return term_Length__c
     */
    public java.lang.Double getTerm_Length__c() {
        return term_Length__c;
    }


    /**
     * Sets the term_Length__c value for this Opportunity.
     * 
     * @param term_Length__c
     */
    public void setTerm_Length__c(java.lang.Double term_Length__c) {
        this.term_Length__c = term_Length__c;
    }


    /**
     * Gets the tickets__r value for this Opportunity.
     * 
     * @return tickets__r
     */
    public com.sforce.soap.enterprise.QueryResult getTickets__r() {
        return tickets__r;
    }


    /**
     * Sets the tickets__r value for this Opportunity.
     * 
     * @param tickets__r
     */
    public void setTickets__r(com.sforce.soap.enterprise.QueryResult tickets__r) {
        this.tickets__r = tickets__r;
    }


    /**
     * Gets the total_Amount__c value for this Opportunity.
     * 
     * @return total_Amount__c
     */
    public java.lang.Double getTotal_Amount__c() {
        return total_Amount__c;
    }


    /**
     * Sets the total_Amount__c value for this Opportunity.
     * 
     * @param total_Amount__c
     */
    public void setTotal_Amount__c(java.lang.Double total_Amount__c) {
        this.total_Amount__c = total_Amount__c;
    }


    /**
     * Gets the total_Processing_Products__c value for this Opportunity.
     * 
     * @return total_Processing_Products__c
     */
    public java.lang.Double getTotal_Processing_Products__c() {
        return total_Processing_Products__c;
    }


    /**
     * Sets the total_Processing_Products__c value for this Opportunity.
     * 
     * @param total_Processing_Products__c
     */
    public void setTotal_Processing_Products__c(java.lang.Double total_Processing_Products__c) {
        this.total_Processing_Products__c = total_Processing_Products__c;
    }


    /**
     * Gets the total_Users__c value for this Opportunity.
     * 
     * @return total_Users__c
     */
    public java.lang.Double getTotal_Users__c() {
        return total_Users__c;
    }


    /**
     * Sets the total_Users__c value for this Opportunity.
     * 
     * @param total_Users__c
     */
    public void setTotal_Users__c(java.lang.Double total_Users__c) {
        this.total_Users__c = total_Users__c;
    }


    /**
     * Gets the trial_Contact_Name__c value for this Opportunity.
     * 
     * @return trial_Contact_Name__c
     */
    public java.lang.String getTrial_Contact_Name__c() {
        return trial_Contact_Name__c;
    }


    /**
     * Sets the trial_Contact_Name__c value for this Opportunity.
     * 
     * @param trial_Contact_Name__c
     */
    public void setTrial_Contact_Name__c(java.lang.String trial_Contact_Name__c) {
        this.trial_Contact_Name__c = trial_Contact_Name__c;
    }


    /**
     * Gets the trial_Period__c value for this Opportunity.
     * 
     * @return trial_Period__c
     */
    public java.lang.Double getTrial_Period__c() {
        return trial_Period__c;
    }


    /**
     * Sets the trial_Period__c value for this Opportunity.
     * 
     * @param trial_Period__c
     */
    public void setTrial_Period__c(java.lang.Double trial_Period__c) {
        this.trial_Period__c = trial_Period__c;
    }


    /**
     * Gets the type value for this Opportunity.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Opportunity.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the users__c value for this Opportunity.
     * 
     * @return users__c
     */
    public java.lang.Double getUsers__c() {
        return users__c;
    }


    /**
     * Sets the users__c value for this Opportunity.
     * 
     * @param users__c
     */
    public void setUsers__c(java.lang.Double users__c) {
        this.users__c = users__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Opportunity)) return false;
        Opportunity other = (Opportunity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.AM_Law_Ranking__c==null && other.getAM_Law_Ranking__c()==null) || 
             (this.AM_Law_Ranking__c!=null &&
              this.AM_Law_Ranking__c.equals(other.getAM_Law_Ranking__c()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.accountPartners==null && other.getAccountPartners()==null) || 
             (this.accountPartners!=null &&
              this.accountPartners.equals(other.getAccountPartners()))) &&
            ((this.activityHistories==null && other.getActivityHistories()==null) || 
             (this.activityHistories!=null &&
              this.activityHistories.equals(other.getActivityHistories()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.annual_Amount__c==null && other.getAnnual_Amount__c()==null) || 
             (this.annual_Amount__c!=null &&
              this.annual_Amount__c.equals(other.getAnnual_Amount__c()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.billing_City__c==null && other.getBilling_City__c()==null) || 
             (this.billing_City__c!=null &&
              this.billing_City__c.equals(other.getBilling_City__c()))) &&
            ((this.CP_Case_Opp__c==null && other.getCP_Case_Opp__c()==null) || 
             (this.CP_Case_Opp__c!=null &&
              this.CP_Case_Opp__c.equals(other.getCP_Case_Opp__c()))) &&
            ((this.campaign==null && other.getCampaign()==null) || 
             (this.campaign!=null &&
              this.campaign.equals(other.getCampaign()))) &&
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId()))) &&
            ((this.closeDate==null && other.getCloseDate()==null) || 
             (this.closeDate!=null &&
              this.closeDate.equals(other.getCloseDate()))) &&
            ((this.competitor__r==null && other.getCompetitor__r()==null) || 
             (this.competitor__r!=null &&
              this.competitor__r.equals(other.getCompetitor__r()))) &&
            ((this.concurforce__AccruedUnApprovedExpenseTotal__c==null && other.getConcurforce__AccruedUnApprovedExpenseTotal__c()==null) || 
             (this.concurforce__AccruedUnApprovedExpenseTotal__c!=null &&
              this.concurforce__AccruedUnApprovedExpenseTotal__c.equals(other.getConcurforce__AccruedUnApprovedExpenseTotal__c()))) &&
            ((this.concurforce__AccruedUnApprovedExpenses__c==null && other.getConcurforce__AccruedUnApprovedExpenses__c()==null) || 
             (this.concurforce__AccruedUnApprovedExpenses__c!=null &&
              this.concurforce__AccruedUnApprovedExpenses__c.equals(other.getConcurforce__AccruedUnApprovedExpenses__c()))) &&
            ((this.concurforce__Allocations__r==null && other.getConcurforce__Allocations__r()==null) || 
             (this.concurforce__Allocations__r!=null &&
              this.concurforce__Allocations__r.equals(other.getConcurforce__Allocations__r()))) &&
            ((this.concurforce__CT_Object_Lookups__r==null && other.getConcurforce__CT_Object_Lookups__r()==null) || 
             (this.concurforce__CT_Object_Lookups__r!=null &&
              this.concurforce__CT_Object_Lookups__r.equals(other.getConcurforce__CT_Object_Lookups__r()))) &&
            ((this.concurforce__Expense_Total_Oppty__r==null && other.getConcurforce__Expense_Total_Oppty__r()==null) || 
             (this.concurforce__Expense_Total_Oppty__r!=null &&
              this.concurforce__Expense_Total_Oppty__r.equals(other.getConcurforce__Expense_Total_Oppty__r()))) &&
            ((this.concurforce__FinalExpenseTotal__c==null && other.getConcurforce__FinalExpenseTotal__c()==null) || 
             (this.concurforce__FinalExpenseTotal__c!=null &&
              this.concurforce__FinalExpenseTotal__c.equals(other.getConcurforce__FinalExpenseTotal__c()))) &&
            ((this.concurforce__FinalExpense__c==null && other.getConcurforce__FinalExpense__c()==null) || 
             (this.concurforce__FinalExpense__c!=null &&
              this.concurforce__FinalExpense__c.equals(other.getConcurforce__FinalExpense__c()))) &&
            ((this.convert_from_CP_to_PHP__c==null && other.getConvert_from_CP_to_PHP__c()==null) || 
             (this.convert_from_CP_to_PHP__c!=null &&
              this.convert_from_CP_to_PHP__c.equals(other.getConvert_from_CP_to_PHP__c()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.custom_Product_Opp__c==null && other.getCustom_Product_Opp__c()==null) || 
             (this.custom_Product_Opp__c!=null &&
              this.custom_Product_Opp__c.equals(other.getCustom_Product_Opp__c()))) &&
            ((this.deal_Type__c==null && other.getDeal_Type__c()==null) || 
             (this.deal_Type__c!=null &&
              this.deal_Type__c.equals(other.getDeal_Type__c()))) &&
            ((this.demos__r==null && other.getDemos__r()==null) || 
             (this.demos__r!=null &&
              this.demos__r.equals(other.getDemos__r()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.desired_Seats__c==null && other.getDesired_Seats__c()==null) || 
             (this.desired_Seats__c!=null &&
              this.desired_Seats__c.equals(other.getDesired_Seats__c()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              this.events.equals(other.getEvents()))) &&
            ((this.expectedRevenue==null && other.getExpectedRevenue()==null) || 
             (this.expectedRevenue!=null &&
              this.expectedRevenue.equals(other.getExpectedRevenue()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.feeds==null && other.getFeeds()==null) || 
             (this.feeds!=null &&
              this.feeds.equals(other.getFeeds()))) &&
            ((this.fiscal==null && other.getFiscal()==null) || 
             (this.fiscal!=null &&
              this.fiscal.equals(other.getFiscal()))) &&
            ((this.fiscalQuarter==null && other.getFiscalQuarter()==null) || 
             (this.fiscalQuarter!=null &&
              this.fiscalQuarter.equals(other.getFiscalQuarter()))) &&
            ((this.fiscalYear==null && other.getFiscalYear()==null) || 
             (this.fiscalYear!=null &&
              this.fiscalYear.equals(other.getFiscalYear()))) &&
            ((this.forecastCategory==null && other.getForecastCategory()==null) || 
             (this.forecastCategory!=null &&
              this.forecastCategory.equals(other.getForecastCategory()))) &&
            ((this.forecastCategoryName==null && other.getForecastCategoryName()==null) || 
             (this.forecastCategoryName!=null &&
              this.forecastCategoryName.equals(other.getForecastCategoryName()))) &&
            ((this.gigs__c==null && other.getGigs__c()==null) || 
             (this.gigs__c!=null &&
              this.gigs__c.equals(other.getGigs__c()))) &&
            ((this.govt_Maintenance_Amount__c==null && other.getGovt_Maintenance_Amount__c()==null) || 
             (this.govt_Maintenance_Amount__c!=null &&
              this.govt_Maintenance_Amount__c.equals(other.getGovt_Maintenance_Amount__c()))) &&
            ((this.govt_Pricing__c==null && other.getGovt_Pricing__c()==null) || 
             (this.govt_Pricing__c!=null &&
              this.govt_Pricing__c.equals(other.getGovt_Pricing__c()))) &&
            ((this.hasOpportunityLineItem==null && other.getHasOpportunityLineItem()==null) || 
             (this.hasOpportunityLineItem!=null &&
              this.hasOpportunityLineItem.equals(other.getHasOpportunityLineItem()))) &&
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
            ((this.initial_Amount__c==null && other.getInitial_Amount__c()==null) || 
             (this.initial_Amount__c!=null &&
              this.initial_Amount__c.equals(other.getInitial_Amount__c()))) &&
            ((this.isClosed==null && other.getIsClosed()==null) || 
             (this.isClosed!=null &&
              this.isClosed.equals(other.getIsClosed()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.isWon==null && other.getIsWon()==null) || 
             (this.isWon!=null &&
              this.isWon.equals(other.getIsWon()))) &&
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
            ((this.leadSource==null && other.getLeadSource()==null) || 
             (this.leadSource!=null &&
              this.leadSource.equals(other.getLeadSource()))) &&
            ((this.meetings__r==null && other.getMeetings__r()==null) || 
             (this.meetings__r!=null &&
              this.meetings__r.equals(other.getMeetings__r()))) &&
            ((this.minimum_Commitment__c==null && other.getMinimum_Commitment__c()==null) || 
             (this.minimum_Commitment__c!=null &&
              this.minimum_Commitment__c.equals(other.getMinimum_Commitment__c()))) &&
            ((this.monthly_Amount__c==null && other.getMonthly_Amount__c()==null) || 
             (this.monthly_Amount__c!=null &&
              this.monthly_Amount__c.equals(other.getMonthly_Amount__c()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.next_Steps__c==null && other.getNext_Steps__c()==null) || 
             (this.next_Steps__c!=null &&
              this.next_Steps__c.equals(other.getNext_Steps__c()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.number_of_CP_Fee_Products__c==null && other.getNumber_of_CP_Fee_Products__c()==null) || 
             (this.number_of_CP_Fee_Products__c!=null &&
              this.number_of_CP_Fee_Products__c.equals(other.getNumber_of_CP_Fee_Products__c()))) &&
            ((this.onsite_Visit__c==null && other.getOnsite_Visit__c()==null) || 
             (this.onsite_Visit__c!=null &&
              this.onsite_Visit__c.equals(other.getOnsite_Visit__c()))) &&
            ((this.onsite_Visit__r==null && other.getOnsite_Visit__r()==null) || 
             (this.onsite_Visit__r!=null &&
              this.onsite_Visit__r.equals(other.getOnsite_Visit__r()))) &&
            ((this.openActivities==null && other.getOpenActivities()==null) || 
             (this.openActivities!=null &&
              this.openActivities.equals(other.getOpenActivities()))) &&
            ((this.opportunityCompetitors==null && other.getOpportunityCompetitors()==null) || 
             (this.opportunityCompetitors!=null &&
              this.opportunityCompetitors.equals(other.getOpportunityCompetitors()))) &&
            ((this.opportunityContactRoles==null && other.getOpportunityContactRoles()==null) || 
             (this.opportunityContactRoles!=null &&
              this.opportunityContactRoles.equals(other.getOpportunityContactRoles()))) &&
            ((this.opportunityHistories==null && other.getOpportunityHistories()==null) || 
             (this.opportunityHistories!=null &&
              this.opportunityHistories.equals(other.getOpportunityHistories()))) &&
            ((this.opportunityLineItems==null && other.getOpportunityLineItems()==null) || 
             (this.opportunityLineItems!=null &&
              this.opportunityLineItems.equals(other.getOpportunityLineItems()))) &&
            ((this.opportunityPartnersFrom==null && other.getOpportunityPartnersFrom()==null) || 
             (this.opportunityPartnersFrom!=null &&
              this.opportunityPartnersFrom.equals(other.getOpportunityPartnersFrom()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.partners==null && other.getPartners()==null) || 
             (this.partners!=null &&
              this.partners.equals(other.getPartners()))) &&
            ((this.pilots1__r==null && other.getPilots1__r()==null) || 
             (this.pilots1__r!=null &&
              this.pilots1__r.equals(other.getPilots1__r()))) &&
            ((this.pricebook2==null && other.getPricebook2()==null) || 
             (this.pricebook2!=null &&
              this.pricebook2.equals(other.getPricebook2()))) &&
            ((this.pricebook2Id==null && other.getPricebook2Id()==null) || 
             (this.pricebook2Id!=null &&
              this.pricebook2Id.equals(other.getPricebook2Id()))) &&
            ((this.probability==null && other.getProbability()==null) || 
             (this.probability!=null &&
              this.probability.equals(other.getProbability()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.prospecting_to_Process_Established_Date__c==null && other.getProspecting_to_Process_Established_Date__c()==null) || 
             (this.prospecting_to_Process_Established_Date__c!=null &&
              this.prospecting_to_Process_Established_Date__c.equals(other.getProspecting_to_Process_Established_Date__c()))) &&
            ((this.recordType==null && other.getRecordType()==null) || 
             (this.recordType!=null &&
              this.recordType.equals(other.getRecordType()))) &&
            ((this.recordTypeId==null && other.getRecordTypeId()==null) || 
             (this.recordTypeId!=null &&
              this.recordTypeId.equals(other.getRecordTypeId()))) &&
            ((this.referring_Partner__c==null && other.getReferring_Partner__c()==null) || 
             (this.referring_Partner__c!=null &&
              this.referring_Partner__c.equals(other.getReferring_Partner__c()))) &&
            ((this.referring_Partner__r==null && other.getReferring_Partner__r()==null) || 
             (this.referring_Partner__r!=null &&
              this.referring_Partner__r.equals(other.getReferring_Partner__r()))) &&
            ((this.reseller_Partner__c==null && other.getReseller_Partner__c()==null) || 
             (this.reseller_Partner__c!=null &&
              this.reseller_Partner__c.equals(other.getReseller_Partner__c()))) &&
            ((this.reseller_Partner__r==null && other.getReseller_Partner__r()==null) || 
             (this.reseller_Partner__r!=null &&
              this.reseller_Partner__r.equals(other.getReseller_Partner__r()))) &&
            ((this.reseller__c==null && other.getReseller__c()==null) || 
             (this.reseller__c!=null &&
              this.reseller__c.equals(other.getReseller__c()))) &&
            ((this.shares==null && other.getShares()==null) || 
             (this.shares!=null &&
              this.shares.equals(other.getShares()))) &&
            ((this.stageName==null && other.getStageName()==null) || 
             (this.stageName!=null &&
              this.stageName.equals(other.getStageName()))) &&
            ((this.status_Last_Modified__c==null && other.getStatus_Last_Modified__c()==null) || 
             (this.status_Last_Modified__c!=null &&
              this.status_Last_Modified__c.equals(other.getStatus_Last_Modified__c()))) &&
            ((this.status__c==null && other.getStatus__c()==null) || 
             (this.status__c!=null &&
              this.status__c.equals(other.getStatus__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              this.tasks.equals(other.getTasks()))) &&
            ((this.temp_Instance_Opp__c==null && other.getTemp_Instance_Opp__c()==null) || 
             (this.temp_Instance_Opp__c!=null &&
              this.temp_Instance_Opp__c.equals(other.getTemp_Instance_Opp__c()))) &&
            ((this.term_Length__c==null && other.getTerm_Length__c()==null) || 
             (this.term_Length__c!=null &&
              this.term_Length__c.equals(other.getTerm_Length__c()))) &&
            ((this.tickets__r==null && other.getTickets__r()==null) || 
             (this.tickets__r!=null &&
              this.tickets__r.equals(other.getTickets__r()))) &&
            ((this.total_Amount__c==null && other.getTotal_Amount__c()==null) || 
             (this.total_Amount__c!=null &&
              this.total_Amount__c.equals(other.getTotal_Amount__c()))) &&
            ((this.total_Processing_Products__c==null && other.getTotal_Processing_Products__c()==null) || 
             (this.total_Processing_Products__c!=null &&
              this.total_Processing_Products__c.equals(other.getTotal_Processing_Products__c()))) &&
            ((this.total_Users__c==null && other.getTotal_Users__c()==null) || 
             (this.total_Users__c!=null &&
              this.total_Users__c.equals(other.getTotal_Users__c()))) &&
            ((this.trial_Contact_Name__c==null && other.getTrial_Contact_Name__c()==null) || 
             (this.trial_Contact_Name__c!=null &&
              this.trial_Contact_Name__c.equals(other.getTrial_Contact_Name__c()))) &&
            ((this.trial_Period__c==null && other.getTrial_Period__c()==null) || 
             (this.trial_Period__c!=null &&
              this.trial_Period__c.equals(other.getTrial_Period__c()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.users__c==null && other.getUsers__c()==null) || 
             (this.users__c!=null &&
              this.users__c.equals(other.getUsers__c())));
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
        if (getAM_Law_Ranking__c() != null) {
            _hashCode += getAM_Law_Ranking__c().hashCode();
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getAccountPartners() != null) {
            _hashCode += getAccountPartners().hashCode();
        }
        if (getActivityHistories() != null) {
            _hashCode += getActivityHistories().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getAnnual_Amount__c() != null) {
            _hashCode += getAnnual_Amount__c().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getBilling_City__c() != null) {
            _hashCode += getBilling_City__c().hashCode();
        }
        if (getCP_Case_Opp__c() != null) {
            _hashCode += getCP_Case_Opp__c().hashCode();
        }
        if (getCampaign() != null) {
            _hashCode += getCampaign().hashCode();
        }
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        if (getCloseDate() != null) {
            _hashCode += getCloseDate().hashCode();
        }
        if (getCompetitor__r() != null) {
            _hashCode += getCompetitor__r().hashCode();
        }
        if (getConcurforce__AccruedUnApprovedExpenseTotal__c() != null) {
            _hashCode += getConcurforce__AccruedUnApprovedExpenseTotal__c().hashCode();
        }
        if (getConcurforce__AccruedUnApprovedExpenses__c() != null) {
            _hashCode += getConcurforce__AccruedUnApprovedExpenses__c().hashCode();
        }
        if (getConcurforce__Allocations__r() != null) {
            _hashCode += getConcurforce__Allocations__r().hashCode();
        }
        if (getConcurforce__CT_Object_Lookups__r() != null) {
            _hashCode += getConcurforce__CT_Object_Lookups__r().hashCode();
        }
        if (getConcurforce__Expense_Total_Oppty__r() != null) {
            _hashCode += getConcurforce__Expense_Total_Oppty__r().hashCode();
        }
        if (getConcurforce__FinalExpenseTotal__c() != null) {
            _hashCode += getConcurforce__FinalExpenseTotal__c().hashCode();
        }
        if (getConcurforce__FinalExpense__c() != null) {
            _hashCode += getConcurforce__FinalExpense__c().hashCode();
        }
        if (getConvert_from_CP_to_PHP__c() != null) {
            _hashCode += getConvert_from_CP_to_PHP__c().hashCode();
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
        if (getCustom_Product_Opp__c() != null) {
            _hashCode += getCustom_Product_Opp__c().hashCode();
        }
        if (getDeal_Type__c() != null) {
            _hashCode += getDeal_Type__c().hashCode();
        }
        if (getDemos__r() != null) {
            _hashCode += getDemos__r().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDesired_Seats__c() != null) {
            _hashCode += getDesired_Seats__c().hashCode();
        }
        if (getEvents() != null) {
            _hashCode += getEvents().hashCode();
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
        if (getFiscal() != null) {
            _hashCode += getFiscal().hashCode();
        }
        if (getFiscalQuarter() != null) {
            _hashCode += getFiscalQuarter().hashCode();
        }
        if (getFiscalYear() != null) {
            _hashCode += getFiscalYear().hashCode();
        }
        if (getForecastCategory() != null) {
            _hashCode += getForecastCategory().hashCode();
        }
        if (getForecastCategoryName() != null) {
            _hashCode += getForecastCategoryName().hashCode();
        }
        if (getGigs__c() != null) {
            _hashCode += getGigs__c().hashCode();
        }
        if (getGovt_Maintenance_Amount__c() != null) {
            _hashCode += getGovt_Maintenance_Amount__c().hashCode();
        }
        if (getGovt_Pricing__c() != null) {
            _hashCode += getGovt_Pricing__c().hashCode();
        }
        if (getHasOpportunityLineItem() != null) {
            _hashCode += getHasOpportunityLineItem().hashCode();
        }
        if (getHistories() != null) {
            _hashCode += getHistories().hashCode();
        }
        if (getInitial_Amount__c() != null) {
            _hashCode += getInitial_Amount__c().hashCode();
        }
        if (getIsClosed() != null) {
            _hashCode += getIsClosed().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getIsWon() != null) {
            _hashCode += getIsWon().hashCode();
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
        if (getLeadSource() != null) {
            _hashCode += getLeadSource().hashCode();
        }
        if (getMeetings__r() != null) {
            _hashCode += getMeetings__r().hashCode();
        }
        if (getMinimum_Commitment__c() != null) {
            _hashCode += getMinimum_Commitment__c().hashCode();
        }
        if (getMonthly_Amount__c() != null) {
            _hashCode += getMonthly_Amount__c().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNext_Steps__c() != null) {
            _hashCode += getNext_Steps__c().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getNotesAndAttachments() != null) {
            _hashCode += getNotesAndAttachments().hashCode();
        }
        if (getNumber_of_CP_Fee_Products__c() != null) {
            _hashCode += getNumber_of_CP_Fee_Products__c().hashCode();
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
        if (getOpportunityCompetitors() != null) {
            _hashCode += getOpportunityCompetitors().hashCode();
        }
        if (getOpportunityContactRoles() != null) {
            _hashCode += getOpportunityContactRoles().hashCode();
        }
        if (getOpportunityHistories() != null) {
            _hashCode += getOpportunityHistories().hashCode();
        }
        if (getOpportunityLineItems() != null) {
            _hashCode += getOpportunityLineItems().hashCode();
        }
        if (getOpportunityPartnersFrom() != null) {
            _hashCode += getOpportunityPartnersFrom().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getPartners() != null) {
            _hashCode += getPartners().hashCode();
        }
        if (getPilots1__r() != null) {
            _hashCode += getPilots1__r().hashCode();
        }
        if (getPricebook2() != null) {
            _hashCode += getPricebook2().hashCode();
        }
        if (getPricebook2Id() != null) {
            _hashCode += getPricebook2Id().hashCode();
        }
        if (getProbability() != null) {
            _hashCode += getProbability().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getProspecting_to_Process_Established_Date__c() != null) {
            _hashCode += getProspecting_to_Process_Established_Date__c().hashCode();
        }
        if (getRecordType() != null) {
            _hashCode += getRecordType().hashCode();
        }
        if (getRecordTypeId() != null) {
            _hashCode += getRecordTypeId().hashCode();
        }
        if (getReferring_Partner__c() != null) {
            _hashCode += getReferring_Partner__c().hashCode();
        }
        if (getReferring_Partner__r() != null) {
            _hashCode += getReferring_Partner__r().hashCode();
        }
        if (getReseller_Partner__c() != null) {
            _hashCode += getReseller_Partner__c().hashCode();
        }
        if (getReseller_Partner__r() != null) {
            _hashCode += getReseller_Partner__r().hashCode();
        }
        if (getReseller__c() != null) {
            _hashCode += getReseller__c().hashCode();
        }
        if (getShares() != null) {
            _hashCode += getShares().hashCode();
        }
        if (getStageName() != null) {
            _hashCode += getStageName().hashCode();
        }
        if (getStatus_Last_Modified__c() != null) {
            _hashCode += getStatus_Last_Modified__c().hashCode();
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
        if (getTemp_Instance_Opp__c() != null) {
            _hashCode += getTemp_Instance_Opp__c().hashCode();
        }
        if (getTerm_Length__c() != null) {
            _hashCode += getTerm_Length__c().hashCode();
        }
        if (getTickets__r() != null) {
            _hashCode += getTickets__r().hashCode();
        }
        if (getTotal_Amount__c() != null) {
            _hashCode += getTotal_Amount__c().hashCode();
        }
        if (getTotal_Processing_Products__c() != null) {
            _hashCode += getTotal_Processing_Products__c().hashCode();
        }
        if (getTotal_Users__c() != null) {
            _hashCode += getTotal_Users__c().hashCode();
        }
        if (getTrial_Contact_Name__c() != null) {
            _hashCode += getTrial_Contact_Name__c().hashCode();
        }
        if (getTrial_Period__c() != null) {
            _hashCode += getTrial_Period__c().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUsers__c() != null) {
            _hashCode += getUsers__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Opportunity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Opportunity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AM_Law_Ranking__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AM_Law_Ranking__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("accountPartners");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccountPartners"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annual_Amount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Annual_Amount__c"));
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
        elemField.setFieldName("billing_City__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Billing_City__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CP_Case_Opp__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CP_Case_Opp__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaign");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Campaign"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Campaign"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CampaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CloseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("competitor__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Competitor__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__AccruedUnApprovedExpenseTotal__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__AccruedUnApprovedExpenseTotal__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__AccruedUnApprovedExpenses__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__AccruedUnApprovedExpenses__c"));
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
        elemField.setFieldName("concurforce__CT_Object_Lookups__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__CT_Object_Lookups__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__Expense_Total_Oppty__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__Expense_Total_Oppty__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__FinalExpenseTotal__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__FinalExpenseTotal__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__FinalExpense__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__FinalExpense__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("convert_from_CP_to_PHP__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Convert_from_CP_to_PHP__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("custom_Product_Opp__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Custom_Product_Opp__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deal_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Deal_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("desired_Seats__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Desired_Seats__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("fiscal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fiscal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fiscalQuarter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FiscalQuarter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fiscalYear");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FiscalYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forecastCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ForecastCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forecastCategoryName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ForecastCategoryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gigs__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Gigs__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("govt_Maintenance_Amount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Govt_Maintenance_Amount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("govt_Pricing__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Govt_Pricing__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasOpportunityLineItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HasOpportunityLineItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("initial_Amount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Initial_Amount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("isWon");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsWon"));
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
        elemField.setFieldName("leadSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LeadSource"));
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
        elemField.setFieldName("minimum_Commitment__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Minimum_Commitment__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthly_Amount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Monthly_Amount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("next_Steps__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Next_Steps__c"));
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
        elemField.setFieldName("number_of_CP_Fee_Products__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Number_of_CP_Fee_Products__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("opportunityCompetitors");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityCompetitors"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityContactRoles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityContactRoles"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityHistories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityHistories"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityLineItems");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityLineItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityPartnersFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityPartnersFrom"));
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
        elemField.setFieldName("partners");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Partners"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pilots1__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pilots1__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricebook2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pricebook2"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pricebook2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricebook2Id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pricebook2Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("probability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Probability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("prospecting_to_Process_Established_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Prospecting_to_Process_Established_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("referring_Partner__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Referring_Partner__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referring_Partner__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Referring_Partner__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reseller_Partner__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Reseller_Partner__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reseller_Partner__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Reseller_Partner__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reseller__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Reseller__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("stageName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "StageName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status_Last_Modified__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status_Last_Modified__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("temp_Instance_Opp__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Temp_Instance_Opp__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("term_Length__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Term_Length__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tickets__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tickets__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_Amount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Total_Amount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_Processing_Products__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Total_Processing_Products__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_Users__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Total_Users__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trial_Contact_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Trial_Contact_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trial_Period__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Trial_Period__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("users__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Users__c"));
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

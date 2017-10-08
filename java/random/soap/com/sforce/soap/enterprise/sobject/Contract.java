/**
 * Contract.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Contract  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.sobject.Account account;

    private java.lang.String accountId;

    private com.sforce.soap.enterprise.sobject.User activatedBy;

    private java.lang.String activatedById;

    private java.util.Calendar activatedDate;

    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private java.util.Date analytics_Subscription_End_Date__c;

    private java.lang.Double annual_License_Fee__c;

    private com.sforce.soap.enterprise.QueryResult approvals;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String billed_General_Support__c;

    private java.lang.String billingCity;

    private java.lang.String billingCountry;

    private java.lang.String billingPostalCode;

    private java.lang.String billingState;

    private java.lang.String billingStreet;

    private com.sforce.soap.enterprise.QueryResult billing_Dates__r;

    private java.lang.Boolean case_Study_Free_User_Licenses__c;

    private com.sforce.soap.enterprise.sobject.User companySigned;

    private java.util.Date companySignedDate;

    private java.lang.String companySignedId;

    private java.lang.String content_Analyst_Included__c;

    private com.sforce.soap.enterprise.QueryResult contractContactRoles;

    private java.lang.String contractNumber;

    private java.lang.Integer contractTerm;

    private java.util.Date contract_End_Date_Formula__c;

    private java.lang.String contract_Name__c;

    private java.lang.String contract_Type__c;

    private com.sforce.soap.enterprise.QueryResult contracts__r;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private com.sforce.soap.enterprise.sobject.Contact customerSigned;

    private java.util.Date customerSignedDate;

    private java.lang.String customerSignedId;

    private java.lang.String customerSignedTitle;

    private java.lang.String description;

    private java.lang.Double development_Consulting_Rate_per_Hour__c;

    private java.lang.String domain__c;

    private java.util.Date endDate;

    private java.util.Date end_Date__c;

    private com.sforce.soap.enterprise.QueryResult events;

    private java.lang.String excluded_Users_Email__c;

    private com.sforce.soap.enterprise.QueryResult excluded_Users__r;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult feeds;

    private java.lang.Double free_Users__c;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.Double inactive__c;

    private java.lang.Double initial_License_Fee__c;

    private java.lang.Double initial_Storage_Credit__c;

    private com.sforce.soap.enterprise.QueryResult instances__r;

    private java.lang.String invoice_Required_Per_Case__c;

    private java.lang.Boolean isDeleted;

    private java.util.Date lastActivityDate;

    private java.util.Calendar lastApprovedDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String license_Type__c;

    private java.lang.String method_Subscription__c;

    private java.lang.String missing_FE_Docs__c;

    private java.lang.Double monthly_Storage_Credit_GB__c;

    private java.lang.String multi_Instance_Billing__c;

    private java.lang.Boolean new_Analytics_Pricing_Enterprise__c;

    private java.lang.String next_Contract__c;

    private com.sforce.soap.enterprise.sobject.Contract next_Contract__r;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private java.lang.String notes__c;

    private com.sforce.soap.enterprise.QueryResult openActivities;

    private com.sforce.soap.enterprise.sobject.User owner;

    private java.lang.String ownerExpirationNotice;

    private java.lang.String ownerId;

    private java.util.Date post_Contract_End_Date__c;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.Double professional_Service_Credit__c;

    private java.lang.Double professional_Services_Rate__c;

    private java.lang.String RA_Contract_Type__c;

    private java.lang.Double RA_GBs_Remaining__c;

    private com.sforce.soap.enterprise.QueryResult RA_Rollups__r;

    private java.lang.Double RA_Subscribed_GBs__c;

    private java.lang.Double RA_Tier_1__c;

    private java.lang.Double RA_Tier_2__c;

    private java.lang.Double RA_Tier_3__c;

    private java.lang.Double rate_Archive_Per_GB__c;

    private java.lang.Double rate_For_CA_Per_GB_of_Native_Files__c;

    private java.lang.Double rate_Per_Document_OCR_Text__c;

    private java.lang.Double rate_Per_Excess_User__c;

    private java.lang.Double rate_Storage_Per_GB_InactiveCases__c;

    private java.lang.Double rate_Storage_Per_GB__c;

    private java.lang.Double rate__c;

    private com.sforce.soap.enterprise.sobject.RecordType recordType;

    private java.lang.String recordTypeId;

    private java.util.Date renewal_Date__c;

    private java.lang.String renewal_Payment_Terms__c;

    private java.lang.String reseller_Account__c;

    private com.sforce.soap.enterprise.sobject.Account reseller_Account__r;

    private java.lang.Boolean reseller_Contract__c;

    private java.lang.String shippingCity;

    private java.lang.String shippingCountry;

    private java.lang.String shippingPostalCode;

    private java.lang.String shippingState;

    private java.lang.String shippingStreet;

    private java.lang.String specialTerms;

    private java.util.Date startDate;

    private java.lang.String status;

    private java.lang.String statusCode;

    private java.lang.Double support_Rate_per_Hour__c;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    private java.lang.String terms_of_Invoice__c;

    private java.lang.String tier__c;

    private com.sforce.soap.enterprise.QueryResult transactions__r;

    private java.lang.Double unique_Users_Included__c;

    private java.lang.String user_Billing_Model__c;

    private java.lang.Boolean users_Excluded__c;

    private java.lang.Double x0_to_1000_GB__c;

    private java.lang.Double x0_to_100_GB__c;

    private java.lang.Double x1000_GB__c;

    private java.lang.Double x100_to_500_GB__c;

    private java.lang.Double x500_to_1000_GB__c;

    public Contract() {
    }

    public Contract(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.sobject.Account account,
           java.lang.String accountId,
           com.sforce.soap.enterprise.sobject.User activatedBy,
           java.lang.String activatedById,
           java.util.Calendar activatedDate,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           java.util.Date analytics_Subscription_End_Date__c,
           java.lang.Double annual_License_Fee__c,
           com.sforce.soap.enterprise.QueryResult approvals,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String billed_General_Support__c,
           java.lang.String billingCity,
           java.lang.String billingCountry,
           java.lang.String billingPostalCode,
           java.lang.String billingState,
           java.lang.String billingStreet,
           com.sforce.soap.enterprise.QueryResult billing_Dates__r,
           java.lang.Boolean case_Study_Free_User_Licenses__c,
           com.sforce.soap.enterprise.sobject.User companySigned,
           java.util.Date companySignedDate,
           java.lang.String companySignedId,
           java.lang.String content_Analyst_Included__c,
           com.sforce.soap.enterprise.QueryResult contractContactRoles,
           java.lang.String contractNumber,
           java.lang.Integer contractTerm,
           java.util.Date contract_End_Date_Formula__c,
           java.lang.String contract_Name__c,
           java.lang.String contract_Type__c,
           com.sforce.soap.enterprise.QueryResult contracts__r,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           com.sforce.soap.enterprise.sobject.Contact customerSigned,
           java.util.Date customerSignedDate,
           java.lang.String customerSignedId,
           java.lang.String customerSignedTitle,
           java.lang.String description,
           java.lang.Double development_Consulting_Rate_per_Hour__c,
           java.lang.String domain__c,
           java.util.Date endDate,
           java.util.Date end_Date__c,
           com.sforce.soap.enterprise.QueryResult events,
           java.lang.String excluded_Users_Email__c,
           com.sforce.soap.enterprise.QueryResult excluded_Users__r,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult feeds,
           java.lang.Double free_Users__c,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.Double inactive__c,
           java.lang.Double initial_License_Fee__c,
           java.lang.Double initial_Storage_Credit__c,
           com.sforce.soap.enterprise.QueryResult instances__r,
           java.lang.String invoice_Required_Per_Case__c,
           java.lang.Boolean isDeleted,
           java.util.Date lastActivityDate,
           java.util.Calendar lastApprovedDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String license_Type__c,
           java.lang.String method_Subscription__c,
           java.lang.String missing_FE_Docs__c,
           java.lang.Double monthly_Storage_Credit_GB__c,
           java.lang.String multi_Instance_Billing__c,
           java.lang.Boolean new_Analytics_Pricing_Enterprise__c,
           java.lang.String next_Contract__c,
           com.sforce.soap.enterprise.sobject.Contract next_Contract__r,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           java.lang.String notes__c,
           com.sforce.soap.enterprise.QueryResult openActivities,
           com.sforce.soap.enterprise.sobject.User owner,
           java.lang.String ownerExpirationNotice,
           java.lang.String ownerId,
           java.util.Date post_Contract_End_Date__c,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.Double professional_Service_Credit__c,
           java.lang.Double professional_Services_Rate__c,
           java.lang.String RA_Contract_Type__c,
           java.lang.Double RA_GBs_Remaining__c,
           com.sforce.soap.enterprise.QueryResult RA_Rollups__r,
           java.lang.Double RA_Subscribed_GBs__c,
           java.lang.Double RA_Tier_1__c,
           java.lang.Double RA_Tier_2__c,
           java.lang.Double RA_Tier_3__c,
           java.lang.Double rate_Archive_Per_GB__c,
           java.lang.Double rate_For_CA_Per_GB_of_Native_Files__c,
           java.lang.Double rate_Per_Document_OCR_Text__c,
           java.lang.Double rate_Per_Excess_User__c,
           java.lang.Double rate_Storage_Per_GB_InactiveCases__c,
           java.lang.Double rate_Storage_Per_GB__c,
           java.lang.Double rate__c,
           com.sforce.soap.enterprise.sobject.RecordType recordType,
           java.lang.String recordTypeId,
           java.util.Date renewal_Date__c,
           java.lang.String renewal_Payment_Terms__c,
           java.lang.String reseller_Account__c,
           com.sforce.soap.enterprise.sobject.Account reseller_Account__r,
           java.lang.Boolean reseller_Contract__c,
           java.lang.String shippingCity,
           java.lang.String shippingCountry,
           java.lang.String shippingPostalCode,
           java.lang.String shippingState,
           java.lang.String shippingStreet,
           java.lang.String specialTerms,
           java.util.Date startDate,
           java.lang.String status,
           java.lang.String statusCode,
           java.lang.Double support_Rate_per_Hour__c,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks,
           java.lang.String terms_of_Invoice__c,
           java.lang.String tier__c,
           com.sforce.soap.enterprise.QueryResult transactions__r,
           java.lang.Double unique_Users_Included__c,
           java.lang.String user_Billing_Model__c,
           java.lang.Boolean users_Excluded__c,
           java.lang.Double x0_to_1000_GB__c,
           java.lang.Double x0_to_100_GB__c,
           java.lang.Double x1000_GB__c,
           java.lang.Double x100_to_500_GB__c,
           java.lang.Double x500_to_1000_GB__c) {
        super(
            fieldsToNull,
            id);
        this.account = account;
        this.accountId = accountId;
        this.activatedBy = activatedBy;
        this.activatedById = activatedById;
        this.activatedDate = activatedDate;
        this.activityHistories = activityHistories;
        this.analytics_Subscription_End_Date__c = analytics_Subscription_End_Date__c;
        this.annual_License_Fee__c = annual_License_Fee__c;
        this.approvals = approvals;
        this.attachments = attachments;
        this.billed_General_Support__c = billed_General_Support__c;
        this.billingCity = billingCity;
        this.billingCountry = billingCountry;
        this.billingPostalCode = billingPostalCode;
        this.billingState = billingState;
        this.billingStreet = billingStreet;
        this.billing_Dates__r = billing_Dates__r;
        this.case_Study_Free_User_Licenses__c = case_Study_Free_User_Licenses__c;
        this.companySigned = companySigned;
        this.companySignedDate = companySignedDate;
        this.companySignedId = companySignedId;
        this.content_Analyst_Included__c = content_Analyst_Included__c;
        this.contractContactRoles = contractContactRoles;
        this.contractNumber = contractNumber;
        this.contractTerm = contractTerm;
        this.contract_End_Date_Formula__c = contract_End_Date_Formula__c;
        this.contract_Name__c = contract_Name__c;
        this.contract_Type__c = contract_Type__c;
        this.contracts__r = contracts__r;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.customerSigned = customerSigned;
        this.customerSignedDate = customerSignedDate;
        this.customerSignedId = customerSignedId;
        this.customerSignedTitle = customerSignedTitle;
        this.description = description;
        this.development_Consulting_Rate_per_Hour__c = development_Consulting_Rate_per_Hour__c;
        this.domain__c = domain__c;
        this.endDate = endDate;
        this.end_Date__c = end_Date__c;
        this.events = events;
        this.excluded_Users_Email__c = excluded_Users_Email__c;
        this.excluded_Users__r = excluded_Users__r;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.feeds = feeds;
        this.free_Users__c = free_Users__c;
        this.histories = histories;
        this.inactive__c = inactive__c;
        this.initial_License_Fee__c = initial_License_Fee__c;
        this.initial_Storage_Credit__c = initial_Storage_Credit__c;
        this.instances__r = instances__r;
        this.invoice_Required_Per_Case__c = invoice_Required_Per_Case__c;
        this.isDeleted = isDeleted;
        this.lastActivityDate = lastActivityDate;
        this.lastApprovedDate = lastApprovedDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.license_Type__c = license_Type__c;
        this.method_Subscription__c = method_Subscription__c;
        this.missing_FE_Docs__c = missing_FE_Docs__c;
        this.monthly_Storage_Credit_GB__c = monthly_Storage_Credit_GB__c;
        this.multi_Instance_Billing__c = multi_Instance_Billing__c;
        this.new_Analytics_Pricing_Enterprise__c = new_Analytics_Pricing_Enterprise__c;
        this.next_Contract__c = next_Contract__c;
        this.next_Contract__r = next_Contract__r;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.notes__c = notes__c;
        this.openActivities = openActivities;
        this.owner = owner;
        this.ownerExpirationNotice = ownerExpirationNotice;
        this.ownerId = ownerId;
        this.post_Contract_End_Date__c = post_Contract_End_Date__c;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.professional_Service_Credit__c = professional_Service_Credit__c;
        this.professional_Services_Rate__c = professional_Services_Rate__c;
        this.RA_Contract_Type__c = RA_Contract_Type__c;
        this.RA_GBs_Remaining__c = RA_GBs_Remaining__c;
        this.RA_Rollups__r = RA_Rollups__r;
        this.RA_Subscribed_GBs__c = RA_Subscribed_GBs__c;
        this.RA_Tier_1__c = RA_Tier_1__c;
        this.RA_Tier_2__c = RA_Tier_2__c;
        this.RA_Tier_3__c = RA_Tier_3__c;
        this.rate_Archive_Per_GB__c = rate_Archive_Per_GB__c;
        this.rate_For_CA_Per_GB_of_Native_Files__c = rate_For_CA_Per_GB_of_Native_Files__c;
        this.rate_Per_Document_OCR_Text__c = rate_Per_Document_OCR_Text__c;
        this.rate_Per_Excess_User__c = rate_Per_Excess_User__c;
        this.rate_Storage_Per_GB_InactiveCases__c = rate_Storage_Per_GB_InactiveCases__c;
        this.rate_Storage_Per_GB__c = rate_Storage_Per_GB__c;
        this.rate__c = rate__c;
        this.recordType = recordType;
        this.recordTypeId = recordTypeId;
        this.renewal_Date__c = renewal_Date__c;
        this.renewal_Payment_Terms__c = renewal_Payment_Terms__c;
        this.reseller_Account__c = reseller_Account__c;
        this.reseller_Account__r = reseller_Account__r;
        this.reseller_Contract__c = reseller_Contract__c;
        this.shippingCity = shippingCity;
        this.shippingCountry = shippingCountry;
        this.shippingPostalCode = shippingPostalCode;
        this.shippingState = shippingState;
        this.shippingStreet = shippingStreet;
        this.specialTerms = specialTerms;
        this.startDate = startDate;
        this.status = status;
        this.statusCode = statusCode;
        this.support_Rate_per_Hour__c = support_Rate_per_Hour__c;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
        this.terms_of_Invoice__c = terms_of_Invoice__c;
        this.tier__c = tier__c;
        this.transactions__r = transactions__r;
        this.unique_Users_Included__c = unique_Users_Included__c;
        this.user_Billing_Model__c = user_Billing_Model__c;
        this.users_Excluded__c = users_Excluded__c;
        this.x0_to_1000_GB__c = x0_to_1000_GB__c;
        this.x0_to_100_GB__c = x0_to_100_GB__c;
        this.x1000_GB__c = x1000_GB__c;
        this.x100_to_500_GB__c = x100_to_500_GB__c;
        this.x500_to_1000_GB__c = x500_to_1000_GB__c;
    }


    /**
     * Gets the account value for this Contract.
     * 
     * @return account
     */
    public com.sforce.soap.enterprise.sobject.Account getAccount() {
        return account;
    }


    /**
     * Sets the account value for this Contract.
     * 
     * @param account
     */
    public void setAccount(com.sforce.soap.enterprise.sobject.Account account) {
        this.account = account;
    }


    /**
     * Gets the accountId value for this Contract.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this Contract.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the activatedBy value for this Contract.
     * 
     * @return activatedBy
     */
    public com.sforce.soap.enterprise.sobject.User getActivatedBy() {
        return activatedBy;
    }


    /**
     * Sets the activatedBy value for this Contract.
     * 
     * @param activatedBy
     */
    public void setActivatedBy(com.sforce.soap.enterprise.sobject.User activatedBy) {
        this.activatedBy = activatedBy;
    }


    /**
     * Gets the activatedById value for this Contract.
     * 
     * @return activatedById
     */
    public java.lang.String getActivatedById() {
        return activatedById;
    }


    /**
     * Sets the activatedById value for this Contract.
     * 
     * @param activatedById
     */
    public void setActivatedById(java.lang.String activatedById) {
        this.activatedById = activatedById;
    }


    /**
     * Gets the activatedDate value for this Contract.
     * 
     * @return activatedDate
     */
    public java.util.Calendar getActivatedDate() {
        return activatedDate;
    }


    /**
     * Sets the activatedDate value for this Contract.
     * 
     * @param activatedDate
     */
    public void setActivatedDate(java.util.Calendar activatedDate) {
        this.activatedDate = activatedDate;
    }


    /**
     * Gets the activityHistories value for this Contract.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this Contract.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the analytics_Subscription_End_Date__c value for this Contract.
     * 
     * @return analytics_Subscription_End_Date__c
     */
    public java.util.Date getAnalytics_Subscription_End_Date__c() {
        return analytics_Subscription_End_Date__c;
    }


    /**
     * Sets the analytics_Subscription_End_Date__c value for this Contract.
     * 
     * @param analytics_Subscription_End_Date__c
     */
    public void setAnalytics_Subscription_End_Date__c(java.util.Date analytics_Subscription_End_Date__c) {
        this.analytics_Subscription_End_Date__c = analytics_Subscription_End_Date__c;
    }


    /**
     * Gets the annual_License_Fee__c value for this Contract.
     * 
     * @return annual_License_Fee__c
     */
    public java.lang.Double getAnnual_License_Fee__c() {
        return annual_License_Fee__c;
    }


    /**
     * Sets the annual_License_Fee__c value for this Contract.
     * 
     * @param annual_License_Fee__c
     */
    public void setAnnual_License_Fee__c(java.lang.Double annual_License_Fee__c) {
        this.annual_License_Fee__c = annual_License_Fee__c;
    }


    /**
     * Gets the approvals value for this Contract.
     * 
     * @return approvals
     */
    public com.sforce.soap.enterprise.QueryResult getApprovals() {
        return approvals;
    }


    /**
     * Sets the approvals value for this Contract.
     * 
     * @param approvals
     */
    public void setApprovals(com.sforce.soap.enterprise.QueryResult approvals) {
        this.approvals = approvals;
    }


    /**
     * Gets the attachments value for this Contract.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Contract.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the billed_General_Support__c value for this Contract.
     * 
     * @return billed_General_Support__c
     */
    public java.lang.String getBilled_General_Support__c() {
        return billed_General_Support__c;
    }


    /**
     * Sets the billed_General_Support__c value for this Contract.
     * 
     * @param billed_General_Support__c
     */
    public void setBilled_General_Support__c(java.lang.String billed_General_Support__c) {
        this.billed_General_Support__c = billed_General_Support__c;
    }


    /**
     * Gets the billingCity value for this Contract.
     * 
     * @return billingCity
     */
    public java.lang.String getBillingCity() {
        return billingCity;
    }


    /**
     * Sets the billingCity value for this Contract.
     * 
     * @param billingCity
     */
    public void setBillingCity(java.lang.String billingCity) {
        this.billingCity = billingCity;
    }


    /**
     * Gets the billingCountry value for this Contract.
     * 
     * @return billingCountry
     */
    public java.lang.String getBillingCountry() {
        return billingCountry;
    }


    /**
     * Sets the billingCountry value for this Contract.
     * 
     * @param billingCountry
     */
    public void setBillingCountry(java.lang.String billingCountry) {
        this.billingCountry = billingCountry;
    }


    /**
     * Gets the billingPostalCode value for this Contract.
     * 
     * @return billingPostalCode
     */
    public java.lang.String getBillingPostalCode() {
        return billingPostalCode;
    }


    /**
     * Sets the billingPostalCode value for this Contract.
     * 
     * @param billingPostalCode
     */
    public void setBillingPostalCode(java.lang.String billingPostalCode) {
        this.billingPostalCode = billingPostalCode;
    }


    /**
     * Gets the billingState value for this Contract.
     * 
     * @return billingState
     */
    public java.lang.String getBillingState() {
        return billingState;
    }


    /**
     * Sets the billingState value for this Contract.
     * 
     * @param billingState
     */
    public void setBillingState(java.lang.String billingState) {
        this.billingState = billingState;
    }


    /**
     * Gets the billingStreet value for this Contract.
     * 
     * @return billingStreet
     */
    public java.lang.String getBillingStreet() {
        return billingStreet;
    }


    /**
     * Sets the billingStreet value for this Contract.
     * 
     * @param billingStreet
     */
    public void setBillingStreet(java.lang.String billingStreet) {
        this.billingStreet = billingStreet;
    }


    /**
     * Gets the billing_Dates__r value for this Contract.
     * 
     * @return billing_Dates__r
     */
    public com.sforce.soap.enterprise.QueryResult getBilling_Dates__r() {
        return billing_Dates__r;
    }


    /**
     * Sets the billing_Dates__r value for this Contract.
     * 
     * @param billing_Dates__r
     */
    public void setBilling_Dates__r(com.sforce.soap.enterprise.QueryResult billing_Dates__r) {
        this.billing_Dates__r = billing_Dates__r;
    }


    /**
     * Gets the case_Study_Free_User_Licenses__c value for this Contract.
     * 
     * @return case_Study_Free_User_Licenses__c
     */
    public java.lang.Boolean getCase_Study_Free_User_Licenses__c() {
        return case_Study_Free_User_Licenses__c;
    }


    /**
     * Sets the case_Study_Free_User_Licenses__c value for this Contract.
     * 
     * @param case_Study_Free_User_Licenses__c
     */
    public void setCase_Study_Free_User_Licenses__c(java.lang.Boolean case_Study_Free_User_Licenses__c) {
        this.case_Study_Free_User_Licenses__c = case_Study_Free_User_Licenses__c;
    }


    /**
     * Gets the companySigned value for this Contract.
     * 
     * @return companySigned
     */
    public com.sforce.soap.enterprise.sobject.User getCompanySigned() {
        return companySigned;
    }


    /**
     * Sets the companySigned value for this Contract.
     * 
     * @param companySigned
     */
    public void setCompanySigned(com.sforce.soap.enterprise.sobject.User companySigned) {
        this.companySigned = companySigned;
    }


    /**
     * Gets the companySignedDate value for this Contract.
     * 
     * @return companySignedDate
     */
    public java.util.Date getCompanySignedDate() {
        return companySignedDate;
    }


    /**
     * Sets the companySignedDate value for this Contract.
     * 
     * @param companySignedDate
     */
    public void setCompanySignedDate(java.util.Date companySignedDate) {
        this.companySignedDate = companySignedDate;
    }


    /**
     * Gets the companySignedId value for this Contract.
     * 
     * @return companySignedId
     */
    public java.lang.String getCompanySignedId() {
        return companySignedId;
    }


    /**
     * Sets the companySignedId value for this Contract.
     * 
     * @param companySignedId
     */
    public void setCompanySignedId(java.lang.String companySignedId) {
        this.companySignedId = companySignedId;
    }


    /**
     * Gets the content_Analyst_Included__c value for this Contract.
     * 
     * @return content_Analyst_Included__c
     */
    public java.lang.String getContent_Analyst_Included__c() {
        return content_Analyst_Included__c;
    }


    /**
     * Sets the content_Analyst_Included__c value for this Contract.
     * 
     * @param content_Analyst_Included__c
     */
    public void setContent_Analyst_Included__c(java.lang.String content_Analyst_Included__c) {
        this.content_Analyst_Included__c = content_Analyst_Included__c;
    }


    /**
     * Gets the contractContactRoles value for this Contract.
     * 
     * @return contractContactRoles
     */
    public com.sforce.soap.enterprise.QueryResult getContractContactRoles() {
        return contractContactRoles;
    }


    /**
     * Sets the contractContactRoles value for this Contract.
     * 
     * @param contractContactRoles
     */
    public void setContractContactRoles(com.sforce.soap.enterprise.QueryResult contractContactRoles) {
        this.contractContactRoles = contractContactRoles;
    }


    /**
     * Gets the contractNumber value for this Contract.
     * 
     * @return contractNumber
     */
    public java.lang.String getContractNumber() {
        return contractNumber;
    }


    /**
     * Sets the contractNumber value for this Contract.
     * 
     * @param contractNumber
     */
    public void setContractNumber(java.lang.String contractNumber) {
        this.contractNumber = contractNumber;
    }


    /**
     * Gets the contractTerm value for this Contract.
     * 
     * @return contractTerm
     */
    public java.lang.Integer getContractTerm() {
        return contractTerm;
    }


    /**
     * Sets the contractTerm value for this Contract.
     * 
     * @param contractTerm
     */
    public void setContractTerm(java.lang.Integer contractTerm) {
        this.contractTerm = contractTerm;
    }


    /**
     * Gets the contract_End_Date_Formula__c value for this Contract.
     * 
     * @return contract_End_Date_Formula__c
     */
    public java.util.Date getContract_End_Date_Formula__c() {
        return contract_End_Date_Formula__c;
    }


    /**
     * Sets the contract_End_Date_Formula__c value for this Contract.
     * 
     * @param contract_End_Date_Formula__c
     */
    public void setContract_End_Date_Formula__c(java.util.Date contract_End_Date_Formula__c) {
        this.contract_End_Date_Formula__c = contract_End_Date_Formula__c;
    }


    /**
     * Gets the contract_Name__c value for this Contract.
     * 
     * @return contract_Name__c
     */
    public java.lang.String getContract_Name__c() {
        return contract_Name__c;
    }


    /**
     * Sets the contract_Name__c value for this Contract.
     * 
     * @param contract_Name__c
     */
    public void setContract_Name__c(java.lang.String contract_Name__c) {
        this.contract_Name__c = contract_Name__c;
    }


    /**
     * Gets the contract_Type__c value for this Contract.
     * 
     * @return contract_Type__c
     */
    public java.lang.String getContract_Type__c() {
        return contract_Type__c;
    }


    /**
     * Sets the contract_Type__c value for this Contract.
     * 
     * @param contract_Type__c
     */
    public void setContract_Type__c(java.lang.String contract_Type__c) {
        this.contract_Type__c = contract_Type__c;
    }


    /**
     * Gets the contracts__r value for this Contract.
     * 
     * @return contracts__r
     */
    public com.sforce.soap.enterprise.QueryResult getContracts__r() {
        return contracts__r;
    }


    /**
     * Sets the contracts__r value for this Contract.
     * 
     * @param contracts__r
     */
    public void setContracts__r(com.sforce.soap.enterprise.QueryResult contracts__r) {
        this.contracts__r = contracts__r;
    }


    /**
     * Gets the createdBy value for this Contract.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Contract.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Contract.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Contract.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Contract.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Contract.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the customerSigned value for this Contract.
     * 
     * @return customerSigned
     */
    public com.sforce.soap.enterprise.sobject.Contact getCustomerSigned() {
        return customerSigned;
    }


    /**
     * Sets the customerSigned value for this Contract.
     * 
     * @param customerSigned
     */
    public void setCustomerSigned(com.sforce.soap.enterprise.sobject.Contact customerSigned) {
        this.customerSigned = customerSigned;
    }


    /**
     * Gets the customerSignedDate value for this Contract.
     * 
     * @return customerSignedDate
     */
    public java.util.Date getCustomerSignedDate() {
        return customerSignedDate;
    }


    /**
     * Sets the customerSignedDate value for this Contract.
     * 
     * @param customerSignedDate
     */
    public void setCustomerSignedDate(java.util.Date customerSignedDate) {
        this.customerSignedDate = customerSignedDate;
    }


    /**
     * Gets the customerSignedId value for this Contract.
     * 
     * @return customerSignedId
     */
    public java.lang.String getCustomerSignedId() {
        return customerSignedId;
    }


    /**
     * Sets the customerSignedId value for this Contract.
     * 
     * @param customerSignedId
     */
    public void setCustomerSignedId(java.lang.String customerSignedId) {
        this.customerSignedId = customerSignedId;
    }


    /**
     * Gets the customerSignedTitle value for this Contract.
     * 
     * @return customerSignedTitle
     */
    public java.lang.String getCustomerSignedTitle() {
        return customerSignedTitle;
    }


    /**
     * Sets the customerSignedTitle value for this Contract.
     * 
     * @param customerSignedTitle
     */
    public void setCustomerSignedTitle(java.lang.String customerSignedTitle) {
        this.customerSignedTitle = customerSignedTitle;
    }


    /**
     * Gets the description value for this Contract.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Contract.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the development_Consulting_Rate_per_Hour__c value for this Contract.
     * 
     * @return development_Consulting_Rate_per_Hour__c
     */
    public java.lang.Double getDevelopment_Consulting_Rate_per_Hour__c() {
        return development_Consulting_Rate_per_Hour__c;
    }


    /**
     * Sets the development_Consulting_Rate_per_Hour__c value for this Contract.
     * 
     * @param development_Consulting_Rate_per_Hour__c
     */
    public void setDevelopment_Consulting_Rate_per_Hour__c(java.lang.Double development_Consulting_Rate_per_Hour__c) {
        this.development_Consulting_Rate_per_Hour__c = development_Consulting_Rate_per_Hour__c;
    }


    /**
     * Gets the domain__c value for this Contract.
     * 
     * @return domain__c
     */
    public java.lang.String getDomain__c() {
        return domain__c;
    }


    /**
     * Sets the domain__c value for this Contract.
     * 
     * @param domain__c
     */
    public void setDomain__c(java.lang.String domain__c) {
        this.domain__c = domain__c;
    }


    /**
     * Gets the endDate value for this Contract.
     * 
     * @return endDate
     */
    public java.util.Date getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this Contract.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the end_Date__c value for this Contract.
     * 
     * @return end_Date__c
     */
    public java.util.Date getEnd_Date__c() {
        return end_Date__c;
    }


    /**
     * Sets the end_Date__c value for this Contract.
     * 
     * @param end_Date__c
     */
    public void setEnd_Date__c(java.util.Date end_Date__c) {
        this.end_Date__c = end_Date__c;
    }


    /**
     * Gets the events value for this Contract.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Contract.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the excluded_Users_Email__c value for this Contract.
     * 
     * @return excluded_Users_Email__c
     */
    public java.lang.String getExcluded_Users_Email__c() {
        return excluded_Users_Email__c;
    }


    /**
     * Sets the excluded_Users_Email__c value for this Contract.
     * 
     * @param excluded_Users_Email__c
     */
    public void setExcluded_Users_Email__c(java.lang.String excluded_Users_Email__c) {
        this.excluded_Users_Email__c = excluded_Users_Email__c;
    }


    /**
     * Gets the excluded_Users__r value for this Contract.
     * 
     * @return excluded_Users__r
     */
    public com.sforce.soap.enterprise.QueryResult getExcluded_Users__r() {
        return excluded_Users__r;
    }


    /**
     * Sets the excluded_Users__r value for this Contract.
     * 
     * @param excluded_Users__r
     */
    public void setExcluded_Users__r(com.sforce.soap.enterprise.QueryResult excluded_Users__r) {
        this.excluded_Users__r = excluded_Users__r;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Contract.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Contract.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the feeds value for this Contract.
     * 
     * @return feeds
     */
    public com.sforce.soap.enterprise.QueryResult getFeeds() {
        return feeds;
    }


    /**
     * Sets the feeds value for this Contract.
     * 
     * @param feeds
     */
    public void setFeeds(com.sforce.soap.enterprise.QueryResult feeds) {
        this.feeds = feeds;
    }


    /**
     * Gets the free_Users__c value for this Contract.
     * 
     * @return free_Users__c
     */
    public java.lang.Double getFree_Users__c() {
        return free_Users__c;
    }


    /**
     * Sets the free_Users__c value for this Contract.
     * 
     * @param free_Users__c
     */
    public void setFree_Users__c(java.lang.Double free_Users__c) {
        this.free_Users__c = free_Users__c;
    }


    /**
     * Gets the histories value for this Contract.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Contract.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the inactive__c value for this Contract.
     * 
     * @return inactive__c
     */
    public java.lang.Double getInactive__c() {
        return inactive__c;
    }


    /**
     * Sets the inactive__c value for this Contract.
     * 
     * @param inactive__c
     */
    public void setInactive__c(java.lang.Double inactive__c) {
        this.inactive__c = inactive__c;
    }


    /**
     * Gets the initial_License_Fee__c value for this Contract.
     * 
     * @return initial_License_Fee__c
     */
    public java.lang.Double getInitial_License_Fee__c() {
        return initial_License_Fee__c;
    }


    /**
     * Sets the initial_License_Fee__c value for this Contract.
     * 
     * @param initial_License_Fee__c
     */
    public void setInitial_License_Fee__c(java.lang.Double initial_License_Fee__c) {
        this.initial_License_Fee__c = initial_License_Fee__c;
    }


    /**
     * Gets the initial_Storage_Credit__c value for this Contract.
     * 
     * @return initial_Storage_Credit__c
     */
    public java.lang.Double getInitial_Storage_Credit__c() {
        return initial_Storage_Credit__c;
    }


    /**
     * Sets the initial_Storage_Credit__c value for this Contract.
     * 
     * @param initial_Storage_Credit__c
     */
    public void setInitial_Storage_Credit__c(java.lang.Double initial_Storage_Credit__c) {
        this.initial_Storage_Credit__c = initial_Storage_Credit__c;
    }


    /**
     * Gets the instances__r value for this Contract.
     * 
     * @return instances__r
     */
    public com.sforce.soap.enterprise.QueryResult getInstances__r() {
        return instances__r;
    }


    /**
     * Sets the instances__r value for this Contract.
     * 
     * @param instances__r
     */
    public void setInstances__r(com.sforce.soap.enterprise.QueryResult instances__r) {
        this.instances__r = instances__r;
    }


    /**
     * Gets the invoice_Required_Per_Case__c value for this Contract.
     * 
     * @return invoice_Required_Per_Case__c
     */
    public java.lang.String getInvoice_Required_Per_Case__c() {
        return invoice_Required_Per_Case__c;
    }


    /**
     * Sets the invoice_Required_Per_Case__c value for this Contract.
     * 
     * @param invoice_Required_Per_Case__c
     */
    public void setInvoice_Required_Per_Case__c(java.lang.String invoice_Required_Per_Case__c) {
        this.invoice_Required_Per_Case__c = invoice_Required_Per_Case__c;
    }


    /**
     * Gets the isDeleted value for this Contract.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Contract.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastActivityDate value for this Contract.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Contract.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastApprovedDate value for this Contract.
     * 
     * @return lastApprovedDate
     */
    public java.util.Calendar getLastApprovedDate() {
        return lastApprovedDate;
    }


    /**
     * Sets the lastApprovedDate value for this Contract.
     * 
     * @param lastApprovedDate
     */
    public void setLastApprovedDate(java.util.Calendar lastApprovedDate) {
        this.lastApprovedDate = lastApprovedDate;
    }


    /**
     * Gets the lastModifiedBy value for this Contract.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Contract.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Contract.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Contract.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Contract.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Contract.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the license_Type__c value for this Contract.
     * 
     * @return license_Type__c
     */
    public java.lang.String getLicense_Type__c() {
        return license_Type__c;
    }


    /**
     * Sets the license_Type__c value for this Contract.
     * 
     * @param license_Type__c
     */
    public void setLicense_Type__c(java.lang.String license_Type__c) {
        this.license_Type__c = license_Type__c;
    }


    /**
     * Gets the method_Subscription__c value for this Contract.
     * 
     * @return method_Subscription__c
     */
    public java.lang.String getMethod_Subscription__c() {
        return method_Subscription__c;
    }


    /**
     * Sets the method_Subscription__c value for this Contract.
     * 
     * @param method_Subscription__c
     */
    public void setMethod_Subscription__c(java.lang.String method_Subscription__c) {
        this.method_Subscription__c = method_Subscription__c;
    }


    /**
     * Gets the missing_FE_Docs__c value for this Contract.
     * 
     * @return missing_FE_Docs__c
     */
    public java.lang.String getMissing_FE_Docs__c() {
        return missing_FE_Docs__c;
    }


    /**
     * Sets the missing_FE_Docs__c value for this Contract.
     * 
     * @param missing_FE_Docs__c
     */
    public void setMissing_FE_Docs__c(java.lang.String missing_FE_Docs__c) {
        this.missing_FE_Docs__c = missing_FE_Docs__c;
    }


    /**
     * Gets the monthly_Storage_Credit_GB__c value for this Contract.
     * 
     * @return monthly_Storage_Credit_GB__c
     */
    public java.lang.Double getMonthly_Storage_Credit_GB__c() {
        return monthly_Storage_Credit_GB__c;
    }


    /**
     * Sets the monthly_Storage_Credit_GB__c value for this Contract.
     * 
     * @param monthly_Storage_Credit_GB__c
     */
    public void setMonthly_Storage_Credit_GB__c(java.lang.Double monthly_Storage_Credit_GB__c) {
        this.monthly_Storage_Credit_GB__c = monthly_Storage_Credit_GB__c;
    }


    /**
     * Gets the multi_Instance_Billing__c value for this Contract.
     * 
     * @return multi_Instance_Billing__c
     */
    public java.lang.String getMulti_Instance_Billing__c() {
        return multi_Instance_Billing__c;
    }


    /**
     * Sets the multi_Instance_Billing__c value for this Contract.
     * 
     * @param multi_Instance_Billing__c
     */
    public void setMulti_Instance_Billing__c(java.lang.String multi_Instance_Billing__c) {
        this.multi_Instance_Billing__c = multi_Instance_Billing__c;
    }


    /**
     * Gets the new_Analytics_Pricing_Enterprise__c value for this Contract.
     * 
     * @return new_Analytics_Pricing_Enterprise__c
     */
    public java.lang.Boolean getNew_Analytics_Pricing_Enterprise__c() {
        return new_Analytics_Pricing_Enterprise__c;
    }


    /**
     * Sets the new_Analytics_Pricing_Enterprise__c value for this Contract.
     * 
     * @param new_Analytics_Pricing_Enterprise__c
     */
    public void setNew_Analytics_Pricing_Enterprise__c(java.lang.Boolean new_Analytics_Pricing_Enterprise__c) {
        this.new_Analytics_Pricing_Enterprise__c = new_Analytics_Pricing_Enterprise__c;
    }


    /**
     * Gets the next_Contract__c value for this Contract.
     * 
     * @return next_Contract__c
     */
    public java.lang.String getNext_Contract__c() {
        return next_Contract__c;
    }


    /**
     * Sets the next_Contract__c value for this Contract.
     * 
     * @param next_Contract__c
     */
    public void setNext_Contract__c(java.lang.String next_Contract__c) {
        this.next_Contract__c = next_Contract__c;
    }


    /**
     * Gets the next_Contract__r value for this Contract.
     * 
     * @return next_Contract__r
     */
    public com.sforce.soap.enterprise.sobject.Contract getNext_Contract__r() {
        return next_Contract__r;
    }


    /**
     * Sets the next_Contract__r value for this Contract.
     * 
     * @param next_Contract__r
     */
    public void setNext_Contract__r(com.sforce.soap.enterprise.sobject.Contract next_Contract__r) {
        this.next_Contract__r = next_Contract__r;
    }


    /**
     * Gets the notes value for this Contract.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Contract.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Contract.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Contract.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the notes__c value for this Contract.
     * 
     * @return notes__c
     */
    public java.lang.String getNotes__c() {
        return notes__c;
    }


    /**
     * Sets the notes__c value for this Contract.
     * 
     * @param notes__c
     */
    public void setNotes__c(java.lang.String notes__c) {
        this.notes__c = notes__c;
    }


    /**
     * Gets the openActivities value for this Contract.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this Contract.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the owner value for this Contract.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.User getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Contract.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.User owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerExpirationNotice value for this Contract.
     * 
     * @return ownerExpirationNotice
     */
    public java.lang.String getOwnerExpirationNotice() {
        return ownerExpirationNotice;
    }


    /**
     * Sets the ownerExpirationNotice value for this Contract.
     * 
     * @param ownerExpirationNotice
     */
    public void setOwnerExpirationNotice(java.lang.String ownerExpirationNotice) {
        this.ownerExpirationNotice = ownerExpirationNotice;
    }


    /**
     * Gets the ownerId value for this Contract.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Contract.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the post_Contract_End_Date__c value for this Contract.
     * 
     * @return post_Contract_End_Date__c
     */
    public java.util.Date getPost_Contract_End_Date__c() {
        return post_Contract_End_Date__c;
    }


    /**
     * Sets the post_Contract_End_Date__c value for this Contract.
     * 
     * @param post_Contract_End_Date__c
     */
    public void setPost_Contract_End_Date__c(java.util.Date post_Contract_End_Date__c) {
        this.post_Contract_End_Date__c = post_Contract_End_Date__c;
    }


    /**
     * Gets the processInstances value for this Contract.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Contract.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Contract.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Contract.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the professional_Service_Credit__c value for this Contract.
     * 
     * @return professional_Service_Credit__c
     */
    public java.lang.Double getProfessional_Service_Credit__c() {
        return professional_Service_Credit__c;
    }


    /**
     * Sets the professional_Service_Credit__c value for this Contract.
     * 
     * @param professional_Service_Credit__c
     */
    public void setProfessional_Service_Credit__c(java.lang.Double professional_Service_Credit__c) {
        this.professional_Service_Credit__c = professional_Service_Credit__c;
    }


    /**
     * Gets the professional_Services_Rate__c value for this Contract.
     * 
     * @return professional_Services_Rate__c
     */
    public java.lang.Double getProfessional_Services_Rate__c() {
        return professional_Services_Rate__c;
    }


    /**
     * Sets the professional_Services_Rate__c value for this Contract.
     * 
     * @param professional_Services_Rate__c
     */
    public void setProfessional_Services_Rate__c(java.lang.Double professional_Services_Rate__c) {
        this.professional_Services_Rate__c = professional_Services_Rate__c;
    }


    /**
     * Gets the RA_Contract_Type__c value for this Contract.
     * 
     * @return RA_Contract_Type__c
     */
    public java.lang.String getRA_Contract_Type__c() {
        return RA_Contract_Type__c;
    }


    /**
     * Sets the RA_Contract_Type__c value for this Contract.
     * 
     * @param RA_Contract_Type__c
     */
    public void setRA_Contract_Type__c(java.lang.String RA_Contract_Type__c) {
        this.RA_Contract_Type__c = RA_Contract_Type__c;
    }


    /**
     * Gets the RA_GBs_Remaining__c value for this Contract.
     * 
     * @return RA_GBs_Remaining__c
     */
    public java.lang.Double getRA_GBs_Remaining__c() {
        return RA_GBs_Remaining__c;
    }


    /**
     * Sets the RA_GBs_Remaining__c value for this Contract.
     * 
     * @param RA_GBs_Remaining__c
     */
    public void setRA_GBs_Remaining__c(java.lang.Double RA_GBs_Remaining__c) {
        this.RA_GBs_Remaining__c = RA_GBs_Remaining__c;
    }


    /**
     * Gets the RA_Rollups__r value for this Contract.
     * 
     * @return RA_Rollups__r
     */
    public com.sforce.soap.enterprise.QueryResult getRA_Rollups__r() {
        return RA_Rollups__r;
    }


    /**
     * Sets the RA_Rollups__r value for this Contract.
     * 
     * @param RA_Rollups__r
     */
    public void setRA_Rollups__r(com.sforce.soap.enterprise.QueryResult RA_Rollups__r) {
        this.RA_Rollups__r = RA_Rollups__r;
    }


    /**
     * Gets the RA_Subscribed_GBs__c value for this Contract.
     * 
     * @return RA_Subscribed_GBs__c
     */
    public java.lang.Double getRA_Subscribed_GBs__c() {
        return RA_Subscribed_GBs__c;
    }


    /**
     * Sets the RA_Subscribed_GBs__c value for this Contract.
     * 
     * @param RA_Subscribed_GBs__c
     */
    public void setRA_Subscribed_GBs__c(java.lang.Double RA_Subscribed_GBs__c) {
        this.RA_Subscribed_GBs__c = RA_Subscribed_GBs__c;
    }


    /**
     * Gets the RA_Tier_1__c value for this Contract.
     * 
     * @return RA_Tier_1__c
     */
    public java.lang.Double getRA_Tier_1__c() {
        return RA_Tier_1__c;
    }


    /**
     * Sets the RA_Tier_1__c value for this Contract.
     * 
     * @param RA_Tier_1__c
     */
    public void setRA_Tier_1__c(java.lang.Double RA_Tier_1__c) {
        this.RA_Tier_1__c = RA_Tier_1__c;
    }


    /**
     * Gets the RA_Tier_2__c value for this Contract.
     * 
     * @return RA_Tier_2__c
     */
    public java.lang.Double getRA_Tier_2__c() {
        return RA_Tier_2__c;
    }


    /**
     * Sets the RA_Tier_2__c value for this Contract.
     * 
     * @param RA_Tier_2__c
     */
    public void setRA_Tier_2__c(java.lang.Double RA_Tier_2__c) {
        this.RA_Tier_2__c = RA_Tier_2__c;
    }


    /**
     * Gets the RA_Tier_3__c value for this Contract.
     * 
     * @return RA_Tier_3__c
     */
    public java.lang.Double getRA_Tier_3__c() {
        return RA_Tier_3__c;
    }


    /**
     * Sets the RA_Tier_3__c value for this Contract.
     * 
     * @param RA_Tier_3__c
     */
    public void setRA_Tier_3__c(java.lang.Double RA_Tier_3__c) {
        this.RA_Tier_3__c = RA_Tier_3__c;
    }


    /**
     * Gets the rate_Archive_Per_GB__c value for this Contract.
     * 
     * @return rate_Archive_Per_GB__c
     */
    public java.lang.Double getRate_Archive_Per_GB__c() {
        return rate_Archive_Per_GB__c;
    }


    /**
     * Sets the rate_Archive_Per_GB__c value for this Contract.
     * 
     * @param rate_Archive_Per_GB__c
     */
    public void setRate_Archive_Per_GB__c(java.lang.Double rate_Archive_Per_GB__c) {
        this.rate_Archive_Per_GB__c = rate_Archive_Per_GB__c;
    }


    /**
     * Gets the rate_For_CA_Per_GB_of_Native_Files__c value for this Contract.
     * 
     * @return rate_For_CA_Per_GB_of_Native_Files__c
     */
    public java.lang.Double getRate_For_CA_Per_GB_of_Native_Files__c() {
        return rate_For_CA_Per_GB_of_Native_Files__c;
    }


    /**
     * Sets the rate_For_CA_Per_GB_of_Native_Files__c value for this Contract.
     * 
     * @param rate_For_CA_Per_GB_of_Native_Files__c
     */
    public void setRate_For_CA_Per_GB_of_Native_Files__c(java.lang.Double rate_For_CA_Per_GB_of_Native_Files__c) {
        this.rate_For_CA_Per_GB_of_Native_Files__c = rate_For_CA_Per_GB_of_Native_Files__c;
    }


    /**
     * Gets the rate_Per_Document_OCR_Text__c value for this Contract.
     * 
     * @return rate_Per_Document_OCR_Text__c
     */
    public java.lang.Double getRate_Per_Document_OCR_Text__c() {
        return rate_Per_Document_OCR_Text__c;
    }


    /**
     * Sets the rate_Per_Document_OCR_Text__c value for this Contract.
     * 
     * @param rate_Per_Document_OCR_Text__c
     */
    public void setRate_Per_Document_OCR_Text__c(java.lang.Double rate_Per_Document_OCR_Text__c) {
        this.rate_Per_Document_OCR_Text__c = rate_Per_Document_OCR_Text__c;
    }


    /**
     * Gets the rate_Per_Excess_User__c value for this Contract.
     * 
     * @return rate_Per_Excess_User__c
     */
    public java.lang.Double getRate_Per_Excess_User__c() {
        return rate_Per_Excess_User__c;
    }


    /**
     * Sets the rate_Per_Excess_User__c value for this Contract.
     * 
     * @param rate_Per_Excess_User__c
     */
    public void setRate_Per_Excess_User__c(java.lang.Double rate_Per_Excess_User__c) {
        this.rate_Per_Excess_User__c = rate_Per_Excess_User__c;
    }


    /**
     * Gets the rate_Storage_Per_GB_InactiveCases__c value for this Contract.
     * 
     * @return rate_Storage_Per_GB_InactiveCases__c
     */
    public java.lang.Double getRate_Storage_Per_GB_InactiveCases__c() {
        return rate_Storage_Per_GB_InactiveCases__c;
    }


    /**
     * Sets the rate_Storage_Per_GB_InactiveCases__c value for this Contract.
     * 
     * @param rate_Storage_Per_GB_InactiveCases__c
     */
    public void setRate_Storage_Per_GB_InactiveCases__c(java.lang.Double rate_Storage_Per_GB_InactiveCases__c) {
        this.rate_Storage_Per_GB_InactiveCases__c = rate_Storage_Per_GB_InactiveCases__c;
    }


    /**
     * Gets the rate_Storage_Per_GB__c value for this Contract.
     * 
     * @return rate_Storage_Per_GB__c
     */
    public java.lang.Double getRate_Storage_Per_GB__c() {
        return rate_Storage_Per_GB__c;
    }


    /**
     * Sets the rate_Storage_Per_GB__c value for this Contract.
     * 
     * @param rate_Storage_Per_GB__c
     */
    public void setRate_Storage_Per_GB__c(java.lang.Double rate_Storage_Per_GB__c) {
        this.rate_Storage_Per_GB__c = rate_Storage_Per_GB__c;
    }


    /**
     * Gets the rate__c value for this Contract.
     * 
     * @return rate__c
     */
    public java.lang.Double getRate__c() {
        return rate__c;
    }


    /**
     * Sets the rate__c value for this Contract.
     * 
     * @param rate__c
     */
    public void setRate__c(java.lang.Double rate__c) {
        this.rate__c = rate__c;
    }


    /**
     * Gets the recordType value for this Contract.
     * 
     * @return recordType
     */
    public com.sforce.soap.enterprise.sobject.RecordType getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this Contract.
     * 
     * @param recordType
     */
    public void setRecordType(com.sforce.soap.enterprise.sobject.RecordType recordType) {
        this.recordType = recordType;
    }


    /**
     * Gets the recordTypeId value for this Contract.
     * 
     * @return recordTypeId
     */
    public java.lang.String getRecordTypeId() {
        return recordTypeId;
    }


    /**
     * Sets the recordTypeId value for this Contract.
     * 
     * @param recordTypeId
     */
    public void setRecordTypeId(java.lang.String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }


    /**
     * Gets the renewal_Date__c value for this Contract.
     * 
     * @return renewal_Date__c
     */
    public java.util.Date getRenewal_Date__c() {
        return renewal_Date__c;
    }


    /**
     * Sets the renewal_Date__c value for this Contract.
     * 
     * @param renewal_Date__c
     */
    public void setRenewal_Date__c(java.util.Date renewal_Date__c) {
        this.renewal_Date__c = renewal_Date__c;
    }


    /**
     * Gets the renewal_Payment_Terms__c value for this Contract.
     * 
     * @return renewal_Payment_Terms__c
     */
    public java.lang.String getRenewal_Payment_Terms__c() {
        return renewal_Payment_Terms__c;
    }


    /**
     * Sets the renewal_Payment_Terms__c value for this Contract.
     * 
     * @param renewal_Payment_Terms__c
     */
    public void setRenewal_Payment_Terms__c(java.lang.String renewal_Payment_Terms__c) {
        this.renewal_Payment_Terms__c = renewal_Payment_Terms__c;
    }


    /**
     * Gets the reseller_Account__c value for this Contract.
     * 
     * @return reseller_Account__c
     */
    public java.lang.String getReseller_Account__c() {
        return reseller_Account__c;
    }


    /**
     * Sets the reseller_Account__c value for this Contract.
     * 
     * @param reseller_Account__c
     */
    public void setReseller_Account__c(java.lang.String reseller_Account__c) {
        this.reseller_Account__c = reseller_Account__c;
    }


    /**
     * Gets the reseller_Account__r value for this Contract.
     * 
     * @return reseller_Account__r
     */
    public com.sforce.soap.enterprise.sobject.Account getReseller_Account__r() {
        return reseller_Account__r;
    }


    /**
     * Sets the reseller_Account__r value for this Contract.
     * 
     * @param reseller_Account__r
     */
    public void setReseller_Account__r(com.sforce.soap.enterprise.sobject.Account reseller_Account__r) {
        this.reseller_Account__r = reseller_Account__r;
    }


    /**
     * Gets the reseller_Contract__c value for this Contract.
     * 
     * @return reseller_Contract__c
     */
    public java.lang.Boolean getReseller_Contract__c() {
        return reseller_Contract__c;
    }


    /**
     * Sets the reseller_Contract__c value for this Contract.
     * 
     * @param reseller_Contract__c
     */
    public void setReseller_Contract__c(java.lang.Boolean reseller_Contract__c) {
        this.reseller_Contract__c = reseller_Contract__c;
    }


    /**
     * Gets the shippingCity value for this Contract.
     * 
     * @return shippingCity
     */
    public java.lang.String getShippingCity() {
        return shippingCity;
    }


    /**
     * Sets the shippingCity value for this Contract.
     * 
     * @param shippingCity
     */
    public void setShippingCity(java.lang.String shippingCity) {
        this.shippingCity = shippingCity;
    }


    /**
     * Gets the shippingCountry value for this Contract.
     * 
     * @return shippingCountry
     */
    public java.lang.String getShippingCountry() {
        return shippingCountry;
    }


    /**
     * Sets the shippingCountry value for this Contract.
     * 
     * @param shippingCountry
     */
    public void setShippingCountry(java.lang.String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }


    /**
     * Gets the shippingPostalCode value for this Contract.
     * 
     * @return shippingPostalCode
     */
    public java.lang.String getShippingPostalCode() {
        return shippingPostalCode;
    }


    /**
     * Sets the shippingPostalCode value for this Contract.
     * 
     * @param shippingPostalCode
     */
    public void setShippingPostalCode(java.lang.String shippingPostalCode) {
        this.shippingPostalCode = shippingPostalCode;
    }


    /**
     * Gets the shippingState value for this Contract.
     * 
     * @return shippingState
     */
    public java.lang.String getShippingState() {
        return shippingState;
    }


    /**
     * Sets the shippingState value for this Contract.
     * 
     * @param shippingState
     */
    public void setShippingState(java.lang.String shippingState) {
        this.shippingState = shippingState;
    }


    /**
     * Gets the shippingStreet value for this Contract.
     * 
     * @return shippingStreet
     */
    public java.lang.String getShippingStreet() {
        return shippingStreet;
    }


    /**
     * Sets the shippingStreet value for this Contract.
     * 
     * @param shippingStreet
     */
    public void setShippingStreet(java.lang.String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }


    /**
     * Gets the specialTerms value for this Contract.
     * 
     * @return specialTerms
     */
    public java.lang.String getSpecialTerms() {
        return specialTerms;
    }


    /**
     * Sets the specialTerms value for this Contract.
     * 
     * @param specialTerms
     */
    public void setSpecialTerms(java.lang.String specialTerms) {
        this.specialTerms = specialTerms;
    }


    /**
     * Gets the startDate value for this Contract.
     * 
     * @return startDate
     */
    public java.util.Date getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this Contract.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the status value for this Contract.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Contract.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the statusCode value for this Contract.
     * 
     * @return statusCode
     */
    public java.lang.String getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this Contract.
     * 
     * @param statusCode
     */
    public void setStatusCode(java.lang.String statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the support_Rate_per_Hour__c value for this Contract.
     * 
     * @return support_Rate_per_Hour__c
     */
    public java.lang.Double getSupport_Rate_per_Hour__c() {
        return support_Rate_per_Hour__c;
    }


    /**
     * Sets the support_Rate_per_Hour__c value for this Contract.
     * 
     * @param support_Rate_per_Hour__c
     */
    public void setSupport_Rate_per_Hour__c(java.lang.Double support_Rate_per_Hour__c) {
        this.support_Rate_per_Hour__c = support_Rate_per_Hour__c;
    }


    /**
     * Gets the systemModstamp value for this Contract.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Contract.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this Contract.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Contract.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the terms_of_Invoice__c value for this Contract.
     * 
     * @return terms_of_Invoice__c
     */
    public java.lang.String getTerms_of_Invoice__c() {
        return terms_of_Invoice__c;
    }


    /**
     * Sets the terms_of_Invoice__c value for this Contract.
     * 
     * @param terms_of_Invoice__c
     */
    public void setTerms_of_Invoice__c(java.lang.String terms_of_Invoice__c) {
        this.terms_of_Invoice__c = terms_of_Invoice__c;
    }


    /**
     * Gets the tier__c value for this Contract.
     * 
     * @return tier__c
     */
    public java.lang.String getTier__c() {
        return tier__c;
    }


    /**
     * Sets the tier__c value for this Contract.
     * 
     * @param tier__c
     */
    public void setTier__c(java.lang.String tier__c) {
        this.tier__c = tier__c;
    }


    /**
     * Gets the transactions__r value for this Contract.
     * 
     * @return transactions__r
     */
    public com.sforce.soap.enterprise.QueryResult getTransactions__r() {
        return transactions__r;
    }


    /**
     * Sets the transactions__r value for this Contract.
     * 
     * @param transactions__r
     */
    public void setTransactions__r(com.sforce.soap.enterprise.QueryResult transactions__r) {
        this.transactions__r = transactions__r;
    }


    /**
     * Gets the unique_Users_Included__c value for this Contract.
     * 
     * @return unique_Users_Included__c
     */
    public java.lang.Double getUnique_Users_Included__c() {
        return unique_Users_Included__c;
    }


    /**
     * Sets the unique_Users_Included__c value for this Contract.
     * 
     * @param unique_Users_Included__c
     */
    public void setUnique_Users_Included__c(java.lang.Double unique_Users_Included__c) {
        this.unique_Users_Included__c = unique_Users_Included__c;
    }


    /**
     * Gets the user_Billing_Model__c value for this Contract.
     * 
     * @return user_Billing_Model__c
     */
    public java.lang.String getUser_Billing_Model__c() {
        return user_Billing_Model__c;
    }


    /**
     * Sets the user_Billing_Model__c value for this Contract.
     * 
     * @param user_Billing_Model__c
     */
    public void setUser_Billing_Model__c(java.lang.String user_Billing_Model__c) {
        this.user_Billing_Model__c = user_Billing_Model__c;
    }


    /**
     * Gets the users_Excluded__c value for this Contract.
     * 
     * @return users_Excluded__c
     */
    public java.lang.Boolean getUsers_Excluded__c() {
        return users_Excluded__c;
    }


    /**
     * Sets the users_Excluded__c value for this Contract.
     * 
     * @param users_Excluded__c
     */
    public void setUsers_Excluded__c(java.lang.Boolean users_Excluded__c) {
        this.users_Excluded__c = users_Excluded__c;
    }


    /**
     * Gets the x0_to_1000_GB__c value for this Contract.
     * 
     * @return x0_to_1000_GB__c
     */
    public java.lang.Double getX0_to_1000_GB__c() {
        return x0_to_1000_GB__c;
    }


    /**
     * Sets the x0_to_1000_GB__c value for this Contract.
     * 
     * @param x0_to_1000_GB__c
     */
    public void setX0_to_1000_GB__c(java.lang.Double x0_to_1000_GB__c) {
        this.x0_to_1000_GB__c = x0_to_1000_GB__c;
    }


    /**
     * Gets the x0_to_100_GB__c value for this Contract.
     * 
     * @return x0_to_100_GB__c
     */
    public java.lang.Double getX0_to_100_GB__c() {
        return x0_to_100_GB__c;
    }


    /**
     * Sets the x0_to_100_GB__c value for this Contract.
     * 
     * @param x0_to_100_GB__c
     */
    public void setX0_to_100_GB__c(java.lang.Double x0_to_100_GB__c) {
        this.x0_to_100_GB__c = x0_to_100_GB__c;
    }


    /**
     * Gets the x1000_GB__c value for this Contract.
     * 
     * @return x1000_GB__c
     */
    public java.lang.Double getX1000_GB__c() {
        return x1000_GB__c;
    }


    /**
     * Sets the x1000_GB__c value for this Contract.
     * 
     * @param x1000_GB__c
     */
    public void setX1000_GB__c(java.lang.Double x1000_GB__c) {
        this.x1000_GB__c = x1000_GB__c;
    }


    /**
     * Gets the x100_to_500_GB__c value for this Contract.
     * 
     * @return x100_to_500_GB__c
     */
    public java.lang.Double getX100_to_500_GB__c() {
        return x100_to_500_GB__c;
    }


    /**
     * Sets the x100_to_500_GB__c value for this Contract.
     * 
     * @param x100_to_500_GB__c
     */
    public void setX100_to_500_GB__c(java.lang.Double x100_to_500_GB__c) {
        this.x100_to_500_GB__c = x100_to_500_GB__c;
    }


    /**
     * Gets the x500_to_1000_GB__c value for this Contract.
     * 
     * @return x500_to_1000_GB__c
     */
    public java.lang.Double getX500_to_1000_GB__c() {
        return x500_to_1000_GB__c;
    }


    /**
     * Sets the x500_to_1000_GB__c value for this Contract.
     * 
     * @param x500_to_1000_GB__c
     */
    public void setX500_to_1000_GB__c(java.lang.Double x500_to_1000_GB__c) {
        this.x500_to_1000_GB__c = x500_to_1000_GB__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Contract)) return false;
        Contract other = (Contract) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.activatedBy==null && other.getActivatedBy()==null) || 
             (this.activatedBy!=null &&
              this.activatedBy.equals(other.getActivatedBy()))) &&
            ((this.activatedById==null && other.getActivatedById()==null) || 
             (this.activatedById!=null &&
              this.activatedById.equals(other.getActivatedById()))) &&
            ((this.activatedDate==null && other.getActivatedDate()==null) || 
             (this.activatedDate!=null &&
              this.activatedDate.equals(other.getActivatedDate()))) &&
            ((this.activityHistories==null && other.getActivityHistories()==null) || 
             (this.activityHistories!=null &&
              this.activityHistories.equals(other.getActivityHistories()))) &&
            ((this.analytics_Subscription_End_Date__c==null && other.getAnalytics_Subscription_End_Date__c()==null) || 
             (this.analytics_Subscription_End_Date__c!=null &&
              this.analytics_Subscription_End_Date__c.equals(other.getAnalytics_Subscription_End_Date__c()))) &&
            ((this.annual_License_Fee__c==null && other.getAnnual_License_Fee__c()==null) || 
             (this.annual_License_Fee__c!=null &&
              this.annual_License_Fee__c.equals(other.getAnnual_License_Fee__c()))) &&
            ((this.approvals==null && other.getApprovals()==null) || 
             (this.approvals!=null &&
              this.approvals.equals(other.getApprovals()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.billed_General_Support__c==null && other.getBilled_General_Support__c()==null) || 
             (this.billed_General_Support__c!=null &&
              this.billed_General_Support__c.equals(other.getBilled_General_Support__c()))) &&
            ((this.billingCity==null && other.getBillingCity()==null) || 
             (this.billingCity!=null &&
              this.billingCity.equals(other.getBillingCity()))) &&
            ((this.billingCountry==null && other.getBillingCountry()==null) || 
             (this.billingCountry!=null &&
              this.billingCountry.equals(other.getBillingCountry()))) &&
            ((this.billingPostalCode==null && other.getBillingPostalCode()==null) || 
             (this.billingPostalCode!=null &&
              this.billingPostalCode.equals(other.getBillingPostalCode()))) &&
            ((this.billingState==null && other.getBillingState()==null) || 
             (this.billingState!=null &&
              this.billingState.equals(other.getBillingState()))) &&
            ((this.billingStreet==null && other.getBillingStreet()==null) || 
             (this.billingStreet!=null &&
              this.billingStreet.equals(other.getBillingStreet()))) &&
            ((this.billing_Dates__r==null && other.getBilling_Dates__r()==null) || 
             (this.billing_Dates__r!=null &&
              this.billing_Dates__r.equals(other.getBilling_Dates__r()))) &&
            ((this.case_Study_Free_User_Licenses__c==null && other.getCase_Study_Free_User_Licenses__c()==null) || 
             (this.case_Study_Free_User_Licenses__c!=null &&
              this.case_Study_Free_User_Licenses__c.equals(other.getCase_Study_Free_User_Licenses__c()))) &&
            ((this.companySigned==null && other.getCompanySigned()==null) || 
             (this.companySigned!=null &&
              this.companySigned.equals(other.getCompanySigned()))) &&
            ((this.companySignedDate==null && other.getCompanySignedDate()==null) || 
             (this.companySignedDate!=null &&
              this.companySignedDate.equals(other.getCompanySignedDate()))) &&
            ((this.companySignedId==null && other.getCompanySignedId()==null) || 
             (this.companySignedId!=null &&
              this.companySignedId.equals(other.getCompanySignedId()))) &&
            ((this.content_Analyst_Included__c==null && other.getContent_Analyst_Included__c()==null) || 
             (this.content_Analyst_Included__c!=null &&
              this.content_Analyst_Included__c.equals(other.getContent_Analyst_Included__c()))) &&
            ((this.contractContactRoles==null && other.getContractContactRoles()==null) || 
             (this.contractContactRoles!=null &&
              this.contractContactRoles.equals(other.getContractContactRoles()))) &&
            ((this.contractNumber==null && other.getContractNumber()==null) || 
             (this.contractNumber!=null &&
              this.contractNumber.equals(other.getContractNumber()))) &&
            ((this.contractTerm==null && other.getContractTerm()==null) || 
             (this.contractTerm!=null &&
              this.contractTerm.equals(other.getContractTerm()))) &&
            ((this.contract_End_Date_Formula__c==null && other.getContract_End_Date_Formula__c()==null) || 
             (this.contract_End_Date_Formula__c!=null &&
              this.contract_End_Date_Formula__c.equals(other.getContract_End_Date_Formula__c()))) &&
            ((this.contract_Name__c==null && other.getContract_Name__c()==null) || 
             (this.contract_Name__c!=null &&
              this.contract_Name__c.equals(other.getContract_Name__c()))) &&
            ((this.contract_Type__c==null && other.getContract_Type__c()==null) || 
             (this.contract_Type__c!=null &&
              this.contract_Type__c.equals(other.getContract_Type__c()))) &&
            ((this.contracts__r==null && other.getContracts__r()==null) || 
             (this.contracts__r!=null &&
              this.contracts__r.equals(other.getContracts__r()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.customerSigned==null && other.getCustomerSigned()==null) || 
             (this.customerSigned!=null &&
              this.customerSigned.equals(other.getCustomerSigned()))) &&
            ((this.customerSignedDate==null && other.getCustomerSignedDate()==null) || 
             (this.customerSignedDate!=null &&
              this.customerSignedDate.equals(other.getCustomerSignedDate()))) &&
            ((this.customerSignedId==null && other.getCustomerSignedId()==null) || 
             (this.customerSignedId!=null &&
              this.customerSignedId.equals(other.getCustomerSignedId()))) &&
            ((this.customerSignedTitle==null && other.getCustomerSignedTitle()==null) || 
             (this.customerSignedTitle!=null &&
              this.customerSignedTitle.equals(other.getCustomerSignedTitle()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.development_Consulting_Rate_per_Hour__c==null && other.getDevelopment_Consulting_Rate_per_Hour__c()==null) || 
             (this.development_Consulting_Rate_per_Hour__c!=null &&
              this.development_Consulting_Rate_per_Hour__c.equals(other.getDevelopment_Consulting_Rate_per_Hour__c()))) &&
            ((this.domain__c==null && other.getDomain__c()==null) || 
             (this.domain__c!=null &&
              this.domain__c.equals(other.getDomain__c()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.end_Date__c==null && other.getEnd_Date__c()==null) || 
             (this.end_Date__c!=null &&
              this.end_Date__c.equals(other.getEnd_Date__c()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              this.events.equals(other.getEvents()))) &&
            ((this.excluded_Users_Email__c==null && other.getExcluded_Users_Email__c()==null) || 
             (this.excluded_Users_Email__c!=null &&
              this.excluded_Users_Email__c.equals(other.getExcluded_Users_Email__c()))) &&
            ((this.excluded_Users__r==null && other.getExcluded_Users__r()==null) || 
             (this.excluded_Users__r!=null &&
              this.excluded_Users__r.equals(other.getExcluded_Users__r()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.feeds==null && other.getFeeds()==null) || 
             (this.feeds!=null &&
              this.feeds.equals(other.getFeeds()))) &&
            ((this.free_Users__c==null && other.getFree_Users__c()==null) || 
             (this.free_Users__c!=null &&
              this.free_Users__c.equals(other.getFree_Users__c()))) &&
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
            ((this.inactive__c==null && other.getInactive__c()==null) || 
             (this.inactive__c!=null &&
              this.inactive__c.equals(other.getInactive__c()))) &&
            ((this.initial_License_Fee__c==null && other.getInitial_License_Fee__c()==null) || 
             (this.initial_License_Fee__c!=null &&
              this.initial_License_Fee__c.equals(other.getInitial_License_Fee__c()))) &&
            ((this.initial_Storage_Credit__c==null && other.getInitial_Storage_Credit__c()==null) || 
             (this.initial_Storage_Credit__c!=null &&
              this.initial_Storage_Credit__c.equals(other.getInitial_Storage_Credit__c()))) &&
            ((this.instances__r==null && other.getInstances__r()==null) || 
             (this.instances__r!=null &&
              this.instances__r.equals(other.getInstances__r()))) &&
            ((this.invoice_Required_Per_Case__c==null && other.getInvoice_Required_Per_Case__c()==null) || 
             (this.invoice_Required_Per_Case__c!=null &&
              this.invoice_Required_Per_Case__c.equals(other.getInvoice_Required_Per_Case__c()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.lastActivityDate==null && other.getLastActivityDate()==null) || 
             (this.lastActivityDate!=null &&
              this.lastActivityDate.equals(other.getLastActivityDate()))) &&
            ((this.lastApprovedDate==null && other.getLastApprovedDate()==null) || 
             (this.lastApprovedDate!=null &&
              this.lastApprovedDate.equals(other.getLastApprovedDate()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.license_Type__c==null && other.getLicense_Type__c()==null) || 
             (this.license_Type__c!=null &&
              this.license_Type__c.equals(other.getLicense_Type__c()))) &&
            ((this.method_Subscription__c==null && other.getMethod_Subscription__c()==null) || 
             (this.method_Subscription__c!=null &&
              this.method_Subscription__c.equals(other.getMethod_Subscription__c()))) &&
            ((this.missing_FE_Docs__c==null && other.getMissing_FE_Docs__c()==null) || 
             (this.missing_FE_Docs__c!=null &&
              this.missing_FE_Docs__c.equals(other.getMissing_FE_Docs__c()))) &&
            ((this.monthly_Storage_Credit_GB__c==null && other.getMonthly_Storage_Credit_GB__c()==null) || 
             (this.monthly_Storage_Credit_GB__c!=null &&
              this.monthly_Storage_Credit_GB__c.equals(other.getMonthly_Storage_Credit_GB__c()))) &&
            ((this.multi_Instance_Billing__c==null && other.getMulti_Instance_Billing__c()==null) || 
             (this.multi_Instance_Billing__c!=null &&
              this.multi_Instance_Billing__c.equals(other.getMulti_Instance_Billing__c()))) &&
            ((this.new_Analytics_Pricing_Enterprise__c==null && other.getNew_Analytics_Pricing_Enterprise__c()==null) || 
             (this.new_Analytics_Pricing_Enterprise__c!=null &&
              this.new_Analytics_Pricing_Enterprise__c.equals(other.getNew_Analytics_Pricing_Enterprise__c()))) &&
            ((this.next_Contract__c==null && other.getNext_Contract__c()==null) || 
             (this.next_Contract__c!=null &&
              this.next_Contract__c.equals(other.getNext_Contract__c()))) &&
            ((this.next_Contract__r==null && other.getNext_Contract__r()==null) || 
             (this.next_Contract__r!=null &&
              this.next_Contract__r.equals(other.getNext_Contract__r()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.notes__c==null && other.getNotes__c()==null) || 
             (this.notes__c!=null &&
              this.notes__c.equals(other.getNotes__c()))) &&
            ((this.openActivities==null && other.getOpenActivities()==null) || 
             (this.openActivities!=null &&
              this.openActivities.equals(other.getOpenActivities()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerExpirationNotice==null && other.getOwnerExpirationNotice()==null) || 
             (this.ownerExpirationNotice!=null &&
              this.ownerExpirationNotice.equals(other.getOwnerExpirationNotice()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.post_Contract_End_Date__c==null && other.getPost_Contract_End_Date__c()==null) || 
             (this.post_Contract_End_Date__c!=null &&
              this.post_Contract_End_Date__c.equals(other.getPost_Contract_End_Date__c()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.professional_Service_Credit__c==null && other.getProfessional_Service_Credit__c()==null) || 
             (this.professional_Service_Credit__c!=null &&
              this.professional_Service_Credit__c.equals(other.getProfessional_Service_Credit__c()))) &&
            ((this.professional_Services_Rate__c==null && other.getProfessional_Services_Rate__c()==null) || 
             (this.professional_Services_Rate__c!=null &&
              this.professional_Services_Rate__c.equals(other.getProfessional_Services_Rate__c()))) &&
            ((this.RA_Contract_Type__c==null && other.getRA_Contract_Type__c()==null) || 
             (this.RA_Contract_Type__c!=null &&
              this.RA_Contract_Type__c.equals(other.getRA_Contract_Type__c()))) &&
            ((this.RA_GBs_Remaining__c==null && other.getRA_GBs_Remaining__c()==null) || 
             (this.RA_GBs_Remaining__c!=null &&
              this.RA_GBs_Remaining__c.equals(other.getRA_GBs_Remaining__c()))) &&
            ((this.RA_Rollups__r==null && other.getRA_Rollups__r()==null) || 
             (this.RA_Rollups__r!=null &&
              this.RA_Rollups__r.equals(other.getRA_Rollups__r()))) &&
            ((this.RA_Subscribed_GBs__c==null && other.getRA_Subscribed_GBs__c()==null) || 
             (this.RA_Subscribed_GBs__c!=null &&
              this.RA_Subscribed_GBs__c.equals(other.getRA_Subscribed_GBs__c()))) &&
            ((this.RA_Tier_1__c==null && other.getRA_Tier_1__c()==null) || 
             (this.RA_Tier_1__c!=null &&
              this.RA_Tier_1__c.equals(other.getRA_Tier_1__c()))) &&
            ((this.RA_Tier_2__c==null && other.getRA_Tier_2__c()==null) || 
             (this.RA_Tier_2__c!=null &&
              this.RA_Tier_2__c.equals(other.getRA_Tier_2__c()))) &&
            ((this.RA_Tier_3__c==null && other.getRA_Tier_3__c()==null) || 
             (this.RA_Tier_3__c!=null &&
              this.RA_Tier_3__c.equals(other.getRA_Tier_3__c()))) &&
            ((this.rate_Archive_Per_GB__c==null && other.getRate_Archive_Per_GB__c()==null) || 
             (this.rate_Archive_Per_GB__c!=null &&
              this.rate_Archive_Per_GB__c.equals(other.getRate_Archive_Per_GB__c()))) &&
            ((this.rate_For_CA_Per_GB_of_Native_Files__c==null && other.getRate_For_CA_Per_GB_of_Native_Files__c()==null) || 
             (this.rate_For_CA_Per_GB_of_Native_Files__c!=null &&
              this.rate_For_CA_Per_GB_of_Native_Files__c.equals(other.getRate_For_CA_Per_GB_of_Native_Files__c()))) &&
            ((this.rate_Per_Document_OCR_Text__c==null && other.getRate_Per_Document_OCR_Text__c()==null) || 
             (this.rate_Per_Document_OCR_Text__c!=null &&
              this.rate_Per_Document_OCR_Text__c.equals(other.getRate_Per_Document_OCR_Text__c()))) &&
            ((this.rate_Per_Excess_User__c==null && other.getRate_Per_Excess_User__c()==null) || 
             (this.rate_Per_Excess_User__c!=null &&
              this.rate_Per_Excess_User__c.equals(other.getRate_Per_Excess_User__c()))) &&
            ((this.rate_Storage_Per_GB_InactiveCases__c==null && other.getRate_Storage_Per_GB_InactiveCases__c()==null) || 
             (this.rate_Storage_Per_GB_InactiveCases__c!=null &&
              this.rate_Storage_Per_GB_InactiveCases__c.equals(other.getRate_Storage_Per_GB_InactiveCases__c()))) &&
            ((this.rate_Storage_Per_GB__c==null && other.getRate_Storage_Per_GB__c()==null) || 
             (this.rate_Storage_Per_GB__c!=null &&
              this.rate_Storage_Per_GB__c.equals(other.getRate_Storage_Per_GB__c()))) &&
            ((this.rate__c==null && other.getRate__c()==null) || 
             (this.rate__c!=null &&
              this.rate__c.equals(other.getRate__c()))) &&
            ((this.recordType==null && other.getRecordType()==null) || 
             (this.recordType!=null &&
              this.recordType.equals(other.getRecordType()))) &&
            ((this.recordTypeId==null && other.getRecordTypeId()==null) || 
             (this.recordTypeId!=null &&
              this.recordTypeId.equals(other.getRecordTypeId()))) &&
            ((this.renewal_Date__c==null && other.getRenewal_Date__c()==null) || 
             (this.renewal_Date__c!=null &&
              this.renewal_Date__c.equals(other.getRenewal_Date__c()))) &&
            ((this.renewal_Payment_Terms__c==null && other.getRenewal_Payment_Terms__c()==null) || 
             (this.renewal_Payment_Terms__c!=null &&
              this.renewal_Payment_Terms__c.equals(other.getRenewal_Payment_Terms__c()))) &&
            ((this.reseller_Account__c==null && other.getReseller_Account__c()==null) || 
             (this.reseller_Account__c!=null &&
              this.reseller_Account__c.equals(other.getReseller_Account__c()))) &&
            ((this.reseller_Account__r==null && other.getReseller_Account__r()==null) || 
             (this.reseller_Account__r!=null &&
              this.reseller_Account__r.equals(other.getReseller_Account__r()))) &&
            ((this.reseller_Contract__c==null && other.getReseller_Contract__c()==null) || 
             (this.reseller_Contract__c!=null &&
              this.reseller_Contract__c.equals(other.getReseller_Contract__c()))) &&
            ((this.shippingCity==null && other.getShippingCity()==null) || 
             (this.shippingCity!=null &&
              this.shippingCity.equals(other.getShippingCity()))) &&
            ((this.shippingCountry==null && other.getShippingCountry()==null) || 
             (this.shippingCountry!=null &&
              this.shippingCountry.equals(other.getShippingCountry()))) &&
            ((this.shippingPostalCode==null && other.getShippingPostalCode()==null) || 
             (this.shippingPostalCode!=null &&
              this.shippingPostalCode.equals(other.getShippingPostalCode()))) &&
            ((this.shippingState==null && other.getShippingState()==null) || 
             (this.shippingState!=null &&
              this.shippingState.equals(other.getShippingState()))) &&
            ((this.shippingStreet==null && other.getShippingStreet()==null) || 
             (this.shippingStreet!=null &&
              this.shippingStreet.equals(other.getShippingStreet()))) &&
            ((this.specialTerms==null && other.getSpecialTerms()==null) || 
             (this.specialTerms!=null &&
              this.specialTerms.equals(other.getSpecialTerms()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.statusCode==null && other.getStatusCode()==null) || 
             (this.statusCode!=null &&
              this.statusCode.equals(other.getStatusCode()))) &&
            ((this.support_Rate_per_Hour__c==null && other.getSupport_Rate_per_Hour__c()==null) || 
             (this.support_Rate_per_Hour__c!=null &&
              this.support_Rate_per_Hour__c.equals(other.getSupport_Rate_per_Hour__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              this.tasks.equals(other.getTasks()))) &&
            ((this.terms_of_Invoice__c==null && other.getTerms_of_Invoice__c()==null) || 
             (this.terms_of_Invoice__c!=null &&
              this.terms_of_Invoice__c.equals(other.getTerms_of_Invoice__c()))) &&
            ((this.tier__c==null && other.getTier__c()==null) || 
             (this.tier__c!=null &&
              this.tier__c.equals(other.getTier__c()))) &&
            ((this.transactions__r==null && other.getTransactions__r()==null) || 
             (this.transactions__r!=null &&
              this.transactions__r.equals(other.getTransactions__r()))) &&
            ((this.unique_Users_Included__c==null && other.getUnique_Users_Included__c()==null) || 
             (this.unique_Users_Included__c!=null &&
              this.unique_Users_Included__c.equals(other.getUnique_Users_Included__c()))) &&
            ((this.user_Billing_Model__c==null && other.getUser_Billing_Model__c()==null) || 
             (this.user_Billing_Model__c!=null &&
              this.user_Billing_Model__c.equals(other.getUser_Billing_Model__c()))) &&
            ((this.users_Excluded__c==null && other.getUsers_Excluded__c()==null) || 
             (this.users_Excluded__c!=null &&
              this.users_Excluded__c.equals(other.getUsers_Excluded__c()))) &&
            ((this.x0_to_1000_GB__c==null && other.getX0_to_1000_GB__c()==null) || 
             (this.x0_to_1000_GB__c!=null &&
              this.x0_to_1000_GB__c.equals(other.getX0_to_1000_GB__c()))) &&
            ((this.x0_to_100_GB__c==null && other.getX0_to_100_GB__c()==null) || 
             (this.x0_to_100_GB__c!=null &&
              this.x0_to_100_GB__c.equals(other.getX0_to_100_GB__c()))) &&
            ((this.x1000_GB__c==null && other.getX1000_GB__c()==null) || 
             (this.x1000_GB__c!=null &&
              this.x1000_GB__c.equals(other.getX1000_GB__c()))) &&
            ((this.x100_to_500_GB__c==null && other.getX100_to_500_GB__c()==null) || 
             (this.x100_to_500_GB__c!=null &&
              this.x100_to_500_GB__c.equals(other.getX100_to_500_GB__c()))) &&
            ((this.x500_to_1000_GB__c==null && other.getX500_to_1000_GB__c()==null) || 
             (this.x500_to_1000_GB__c!=null &&
              this.x500_to_1000_GB__c.equals(other.getX500_to_1000_GB__c())));
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
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getActivatedBy() != null) {
            _hashCode += getActivatedBy().hashCode();
        }
        if (getActivatedById() != null) {
            _hashCode += getActivatedById().hashCode();
        }
        if (getActivatedDate() != null) {
            _hashCode += getActivatedDate().hashCode();
        }
        if (getActivityHistories() != null) {
            _hashCode += getActivityHistories().hashCode();
        }
        if (getAnalytics_Subscription_End_Date__c() != null) {
            _hashCode += getAnalytics_Subscription_End_Date__c().hashCode();
        }
        if (getAnnual_License_Fee__c() != null) {
            _hashCode += getAnnual_License_Fee__c().hashCode();
        }
        if (getApprovals() != null) {
            _hashCode += getApprovals().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getBilled_General_Support__c() != null) {
            _hashCode += getBilled_General_Support__c().hashCode();
        }
        if (getBillingCity() != null) {
            _hashCode += getBillingCity().hashCode();
        }
        if (getBillingCountry() != null) {
            _hashCode += getBillingCountry().hashCode();
        }
        if (getBillingPostalCode() != null) {
            _hashCode += getBillingPostalCode().hashCode();
        }
        if (getBillingState() != null) {
            _hashCode += getBillingState().hashCode();
        }
        if (getBillingStreet() != null) {
            _hashCode += getBillingStreet().hashCode();
        }
        if (getBilling_Dates__r() != null) {
            _hashCode += getBilling_Dates__r().hashCode();
        }
        if (getCase_Study_Free_User_Licenses__c() != null) {
            _hashCode += getCase_Study_Free_User_Licenses__c().hashCode();
        }
        if (getCompanySigned() != null) {
            _hashCode += getCompanySigned().hashCode();
        }
        if (getCompanySignedDate() != null) {
            _hashCode += getCompanySignedDate().hashCode();
        }
        if (getCompanySignedId() != null) {
            _hashCode += getCompanySignedId().hashCode();
        }
        if (getContent_Analyst_Included__c() != null) {
            _hashCode += getContent_Analyst_Included__c().hashCode();
        }
        if (getContractContactRoles() != null) {
            _hashCode += getContractContactRoles().hashCode();
        }
        if (getContractNumber() != null) {
            _hashCode += getContractNumber().hashCode();
        }
        if (getContractTerm() != null) {
            _hashCode += getContractTerm().hashCode();
        }
        if (getContract_End_Date_Formula__c() != null) {
            _hashCode += getContract_End_Date_Formula__c().hashCode();
        }
        if (getContract_Name__c() != null) {
            _hashCode += getContract_Name__c().hashCode();
        }
        if (getContract_Type__c() != null) {
            _hashCode += getContract_Type__c().hashCode();
        }
        if (getContracts__r() != null) {
            _hashCode += getContracts__r().hashCode();
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
        if (getCustomerSigned() != null) {
            _hashCode += getCustomerSigned().hashCode();
        }
        if (getCustomerSignedDate() != null) {
            _hashCode += getCustomerSignedDate().hashCode();
        }
        if (getCustomerSignedId() != null) {
            _hashCode += getCustomerSignedId().hashCode();
        }
        if (getCustomerSignedTitle() != null) {
            _hashCode += getCustomerSignedTitle().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDevelopment_Consulting_Rate_per_Hour__c() != null) {
            _hashCode += getDevelopment_Consulting_Rate_per_Hour__c().hashCode();
        }
        if (getDomain__c() != null) {
            _hashCode += getDomain__c().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getEnd_Date__c() != null) {
            _hashCode += getEnd_Date__c().hashCode();
        }
        if (getEvents() != null) {
            _hashCode += getEvents().hashCode();
        }
        if (getExcluded_Users_Email__c() != null) {
            _hashCode += getExcluded_Users_Email__c().hashCode();
        }
        if (getExcluded_Users__r() != null) {
            _hashCode += getExcluded_Users__r().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getFeeds() != null) {
            _hashCode += getFeeds().hashCode();
        }
        if (getFree_Users__c() != null) {
            _hashCode += getFree_Users__c().hashCode();
        }
        if (getHistories() != null) {
            _hashCode += getHistories().hashCode();
        }
        if (getInactive__c() != null) {
            _hashCode += getInactive__c().hashCode();
        }
        if (getInitial_License_Fee__c() != null) {
            _hashCode += getInitial_License_Fee__c().hashCode();
        }
        if (getInitial_Storage_Credit__c() != null) {
            _hashCode += getInitial_Storage_Credit__c().hashCode();
        }
        if (getInstances__r() != null) {
            _hashCode += getInstances__r().hashCode();
        }
        if (getInvoice_Required_Per_Case__c() != null) {
            _hashCode += getInvoice_Required_Per_Case__c().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getLastActivityDate() != null) {
            _hashCode += getLastActivityDate().hashCode();
        }
        if (getLastApprovedDate() != null) {
            _hashCode += getLastApprovedDate().hashCode();
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
        if (getLicense_Type__c() != null) {
            _hashCode += getLicense_Type__c().hashCode();
        }
        if (getMethod_Subscription__c() != null) {
            _hashCode += getMethod_Subscription__c().hashCode();
        }
        if (getMissing_FE_Docs__c() != null) {
            _hashCode += getMissing_FE_Docs__c().hashCode();
        }
        if (getMonthly_Storage_Credit_GB__c() != null) {
            _hashCode += getMonthly_Storage_Credit_GB__c().hashCode();
        }
        if (getMulti_Instance_Billing__c() != null) {
            _hashCode += getMulti_Instance_Billing__c().hashCode();
        }
        if (getNew_Analytics_Pricing_Enterprise__c() != null) {
            _hashCode += getNew_Analytics_Pricing_Enterprise__c().hashCode();
        }
        if (getNext_Contract__c() != null) {
            _hashCode += getNext_Contract__c().hashCode();
        }
        if (getNext_Contract__r() != null) {
            _hashCode += getNext_Contract__r().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getNotesAndAttachments() != null) {
            _hashCode += getNotesAndAttachments().hashCode();
        }
        if (getNotes__c() != null) {
            _hashCode += getNotes__c().hashCode();
        }
        if (getOpenActivities() != null) {
            _hashCode += getOpenActivities().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerExpirationNotice() != null) {
            _hashCode += getOwnerExpirationNotice().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getPost_Contract_End_Date__c() != null) {
            _hashCode += getPost_Contract_End_Date__c().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getProfessional_Service_Credit__c() != null) {
            _hashCode += getProfessional_Service_Credit__c().hashCode();
        }
        if (getProfessional_Services_Rate__c() != null) {
            _hashCode += getProfessional_Services_Rate__c().hashCode();
        }
        if (getRA_Contract_Type__c() != null) {
            _hashCode += getRA_Contract_Type__c().hashCode();
        }
        if (getRA_GBs_Remaining__c() != null) {
            _hashCode += getRA_GBs_Remaining__c().hashCode();
        }
        if (getRA_Rollups__r() != null) {
            _hashCode += getRA_Rollups__r().hashCode();
        }
        if (getRA_Subscribed_GBs__c() != null) {
            _hashCode += getRA_Subscribed_GBs__c().hashCode();
        }
        if (getRA_Tier_1__c() != null) {
            _hashCode += getRA_Tier_1__c().hashCode();
        }
        if (getRA_Tier_2__c() != null) {
            _hashCode += getRA_Tier_2__c().hashCode();
        }
        if (getRA_Tier_3__c() != null) {
            _hashCode += getRA_Tier_3__c().hashCode();
        }
        if (getRate_Archive_Per_GB__c() != null) {
            _hashCode += getRate_Archive_Per_GB__c().hashCode();
        }
        if (getRate_For_CA_Per_GB_of_Native_Files__c() != null) {
            _hashCode += getRate_For_CA_Per_GB_of_Native_Files__c().hashCode();
        }
        if (getRate_Per_Document_OCR_Text__c() != null) {
            _hashCode += getRate_Per_Document_OCR_Text__c().hashCode();
        }
        if (getRate_Per_Excess_User__c() != null) {
            _hashCode += getRate_Per_Excess_User__c().hashCode();
        }
        if (getRate_Storage_Per_GB_InactiveCases__c() != null) {
            _hashCode += getRate_Storage_Per_GB_InactiveCases__c().hashCode();
        }
        if (getRate_Storage_Per_GB__c() != null) {
            _hashCode += getRate_Storage_Per_GB__c().hashCode();
        }
        if (getRate__c() != null) {
            _hashCode += getRate__c().hashCode();
        }
        if (getRecordType() != null) {
            _hashCode += getRecordType().hashCode();
        }
        if (getRecordTypeId() != null) {
            _hashCode += getRecordTypeId().hashCode();
        }
        if (getRenewal_Date__c() != null) {
            _hashCode += getRenewal_Date__c().hashCode();
        }
        if (getRenewal_Payment_Terms__c() != null) {
            _hashCode += getRenewal_Payment_Terms__c().hashCode();
        }
        if (getReseller_Account__c() != null) {
            _hashCode += getReseller_Account__c().hashCode();
        }
        if (getReseller_Account__r() != null) {
            _hashCode += getReseller_Account__r().hashCode();
        }
        if (getReseller_Contract__c() != null) {
            _hashCode += getReseller_Contract__c().hashCode();
        }
        if (getShippingCity() != null) {
            _hashCode += getShippingCity().hashCode();
        }
        if (getShippingCountry() != null) {
            _hashCode += getShippingCountry().hashCode();
        }
        if (getShippingPostalCode() != null) {
            _hashCode += getShippingPostalCode().hashCode();
        }
        if (getShippingState() != null) {
            _hashCode += getShippingState().hashCode();
        }
        if (getShippingStreet() != null) {
            _hashCode += getShippingStreet().hashCode();
        }
        if (getSpecialTerms() != null) {
            _hashCode += getSpecialTerms().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStatusCode() != null) {
            _hashCode += getStatusCode().hashCode();
        }
        if (getSupport_Rate_per_Hour__c() != null) {
            _hashCode += getSupport_Rate_per_Hour__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTasks() != null) {
            _hashCode += getTasks().hashCode();
        }
        if (getTerms_of_Invoice__c() != null) {
            _hashCode += getTerms_of_Invoice__c().hashCode();
        }
        if (getTier__c() != null) {
            _hashCode += getTier__c().hashCode();
        }
        if (getTransactions__r() != null) {
            _hashCode += getTransactions__r().hashCode();
        }
        if (getUnique_Users_Included__c() != null) {
            _hashCode += getUnique_Users_Included__c().hashCode();
        }
        if (getUser_Billing_Model__c() != null) {
            _hashCode += getUser_Billing_Model__c().hashCode();
        }
        if (getUsers_Excluded__c() != null) {
            _hashCode += getUsers_Excluded__c().hashCode();
        }
        if (getX0_to_1000_GB__c() != null) {
            _hashCode += getX0_to_1000_GB__c().hashCode();
        }
        if (getX0_to_100_GB__c() != null) {
            _hashCode += getX0_to_100_GB__c().hashCode();
        }
        if (getX1000_GB__c() != null) {
            _hashCode += getX1000_GB__c().hashCode();
        }
        if (getX100_to_500_GB__c() != null) {
            _hashCode += getX100_to_500_GB__c().hashCode();
        }
        if (getX500_to_1000_GB__c() != null) {
            _hashCode += getX500_to_1000_GB__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Contract.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contract"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("activatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActivatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activatedById");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActivatedById"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activatedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActivatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("analytics_Subscription_End_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Analytics_Subscription_End_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annual_License_Fee__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Annual_License_Fee__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvals");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Approvals"));
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
        elemField.setFieldName("billed_General_Support__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Billed_General_Support__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BillingCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BillingCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingPostalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BillingPostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BillingState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingStreet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BillingStreet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billing_Dates__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Billing_Dates__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("case_Study_Free_User_Licenses__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case_Study_Free_User_Licenses__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companySigned");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CompanySigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companySignedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CompanySignedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companySignedId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CompanySignedId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content_Analyst_Included__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Content_Analyst_Included__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractContactRoles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContractContactRoles"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContractNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractTerm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContractTerm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contract_End_Date_Formula__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contract_End_Date_Formula__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contract_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contract_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contract_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contract_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contracts__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contracts__r"));
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
        elemField.setFieldName("customerSigned");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CustomerSigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerSignedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CustomerSignedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerSignedId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CustomerSignedId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerSignedTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CustomerSignedTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("development_Consulting_Rate_per_Hour__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Development_Consulting_Rate_per_Hour__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Domain__c"));
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
        elemField.setFieldName("end_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "End_Date__c"));
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
        elemField.setFieldName("excluded_Users_Email__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Excluded_Users_Email__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excluded_Users__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Excluded_Users__r"));
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
        elemField.setFieldName("free_Users__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Free_Users__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("inactive__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Inactive__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initial_License_Fee__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Initial_License_Fee__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initial_Storage_Credit__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Initial_Storage_Credit__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instances__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Instances__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoice_Required_Per_Case__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Invoice_Required_Per_Case__c"));
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
        elemField.setFieldName("lastActivityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastActivityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastApprovedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastApprovedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("license_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "License_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("method_Subscription__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Method_Subscription__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("missing_FE_Docs__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Missing_FE_Docs__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthly_Storage_Credit_GB__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Monthly_Storage_Credit_GB__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multi_Instance_Billing__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Multi_Instance_Billing__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("new_Analytics_Pricing_Enterprise__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "New_Analytics_Pricing_Enterprise__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("next_Contract__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Next_Contract__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("next_Contract__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Next_Contract__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contract"));
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
        elemField.setFieldName("notes__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Notes__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerExpirationNotice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OwnerExpirationNotice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("post_Contract_End_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Post_Contract_End_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("professional_Service_Credit__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Professional_Service_Credit__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("professional_Services_Rate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Professional_Services_Rate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RA_Contract_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RA_Contract_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RA_GBs_Remaining__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RA_GBs_Remaining__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RA_Rollups__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RA_Rollups__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RA_Subscribed_GBs__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RA_Subscribed_GBs__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RA_Tier_1__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RA_Tier_1__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RA_Tier_2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RA_Tier_2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RA_Tier_3__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RA_Tier_3__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate_Archive_Per_GB__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Rate_Archive_Per_GB__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate_For_CA_Per_GB_of_Native_Files__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Rate_For_CA_Per_GB_of_Native_Files__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate_Per_Document_OCR_Text__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Rate_Per_Document_OCR_Text__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate_Per_Excess_User__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Rate_Per_Excess_User__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate_Storage_Per_GB_InactiveCases__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Rate_Storage_Per_GB_InactiveCases__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate_Storage_Per_GB__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Rate_Storage_Per_GB__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Rate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("renewal_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Renewal_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("renewal_Payment_Terms__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Renewal_Payment_Terms__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reseller_Account__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Reseller_Account__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reseller_Account__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Reseller_Account__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reseller_Contract__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Reseller_Contract__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ShippingCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ShippingCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingPostalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ShippingPostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ShippingState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingStreet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ShippingStreet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialTerms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SpecialTerms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("statusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "StatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("support_Rate_per_Hour__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Support_Rate_per_Hour__c"));
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
        elemField.setFieldName("tasks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terms_of_Invoice__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Terms_of_Invoice__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tier__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tier__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactions__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Transactions__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unique_Users_Included__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Unique_Users_Included__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_Billing_Model__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User_Billing_Model__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("users_Excluded__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Users_Excluded__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("x0_to_1000_GB__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "X0_to_1000_GB__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("x0_to_100_GB__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "X0_to_100_GB__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("x1000_GB__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "X1000_GB__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("x100_to_500_GB__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "X100_to_500_GB__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("x500_to_1000_GB__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "X500_to_1000_GB__c"));
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

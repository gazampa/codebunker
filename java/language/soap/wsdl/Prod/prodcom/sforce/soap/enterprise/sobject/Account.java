/**
 * Account.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Account  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult AMLAW_Rankings__r;

    private java.lang.Double AM_Law_Ranking_2009__c;

    private java.lang.Double AM_Law_Ranking_2010__c;

    private com.sforce.soap.enterprise.QueryResult accountContactRoles;

    private com.sforce.soap.enterprise.QueryResult accountPartnersFrom;

    private com.sforce.soap.enterprise.QueryResult accountPartnersTo;

    private java.lang.String accountSource;

    private java.lang.String account_Alert__c;

    private java.lang.Double account_Count__c;

    private java.lang.String acct_Owner__c;

    private com.sforce.soap.enterprise.sobject.User acct_Owner__r;

    private java.lang.Boolean active_kPlex_Client__c;

    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private com.sforce.soap.enterprise.QueryResult admin_Certifications__r;

    private com.sforce.soap.enterprise.QueryResult analytic_Snapshots__r;

    private com.sforce.soap.enterprise.QueryResult assets;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private com.sforce.soap.enterprise.QueryResult best_In_Services1__r;

    private java.lang.Boolean best_in_Service__c;

    private com.sforce.soap.enterprise.QueryResult best_in_Service__r;

    private java.util.Date biS_End_Date__c;

    private java.util.Date biS_Start_Date__c;

    private java.lang.String billingCity;

    private java.lang.String billingCountry;

    private java.lang.String billingPostalCode;

    private java.lang.String billingState;

    private java.lang.String billingStreet;

    private com.sforce.soap.enterprise.QueryResult cases;

    private java.lang.String category__c;

    private com.sforce.soap.enterprise.QueryResult channel_Manager_Outlines__r;

    private java.util.Date client_Since__c;

    private java.lang.Double client_Testimonials__c;

    private java.lang.String client_Type_Analytic_Snapshot__c;

    private java.lang.String client_Type__c;

    private java.lang.Boolean collection_Issue__c;

    private java.util.Date collections_Last_Modified_Date__c;

    private java.lang.Double concurforce__AccruedUnApprovedExpenseTotal__c;

    private com.sforce.soap.enterprise.QueryResult concurforce__Allocations__r;

    private com.sforce.soap.enterprise.QueryResult concurforce__CT_Object_Lookups__r;

    private com.sforce.soap.enterprise.QueryResult concurforce__Expense_Total_Account__r;

    private java.lang.Double concurforce__FinalExpenseTotal__c;

    private com.sforce.soap.enterprise.QueryResult contacts;

    private com.sforce.soap.enterprise.QueryResult content__r;

    private com.sforce.soap.enterprise.QueryResult contracts;

    private com.sforce.soap.enterprise.QueryResult contracts__r;

    private java.lang.String country__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.Double current_AMLAW_Ranking__c;

    private java.util.Date date_Became_PHP__c;

    private java.lang.Boolean db_SQL_Environment_Email__c;

    private com.sforce.soap.enterprise.QueryResult demos1__r;

    private com.sforce.soap.enterprise.QueryResult demos__r;

    private java.lang.String description;

    private java.lang.String dunsNumber;

    private java.lang.String evaluation_Type__c;

    private com.sforce.soap.enterprise.QueryResult events;

    private java.lang.String FTP_Login__c;

    private java.lang.String FTP_Password__c;

    private java.lang.Boolean FTP_Preferred__c;

    private java.lang.String fax;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult feeds;

    private java.lang.Double fortune_Ranking__c;

    private java.lang.Double functional_Trial__c;

    private java.lang.String global_Account__c;

    private java.lang.String has_Custom_Solution__c;

    private java.lang.Boolean has_Non_Licensing_DLLs__c;

    private java.lang.Boolean has_Test_Instance__c;

    private java.lang.String have_Client_Logo__c;

    private java.lang.String have_Client_Testimonial__c;

    private com.sforce.soap.enterprise.QueryResult histories;

    private com.sforce.soap.enterprise.QueryResult ideas_Site_Setups__r;

    private java.lang.String industry__c;

    private com.sforce.soap.enterprise.sobject.Industry__c industry__r;

    private com.sforce.soap.enterprise.QueryResult instances__r;

    private java.lang.String integration_Notes__c;

    private java.lang.Boolean international_Client__c;

    private java.lang.Boolean isCustomerPortal;

    private java.lang.Boolean isDeleted;

    private java.lang.String jigsaw;

    private java.lang.String jigsawCompanyId;

    private java.util.Date lastActivityDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String legal_Entity__c;

    private com.sforce.soap.enterprise.QueryResult logo_Testimonial_Trackings__r;

    private com.sforce.soap.enterprise.sobject.Account masterRecord;

    private java.lang.String masterRecordId;

    private com.sforce.soap.enterprise.QueryResult meetings__r;

    private java.lang.String naicsCode;

    private java.lang.String naicsDesc;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private java.lang.String notes__c;

    private java.lang.Double number_Count__c;

    private java.lang.Double number_of_Pilot_Opportunites__c;

    private com.sforce.soap.enterprise.QueryResult openActivities;

    private com.sforce.soap.enterprise.QueryResult opportunities;

    private com.sforce.soap.enterprise.QueryResult opportunityPartnersTo;

    private java.lang.Double opportunity_AM_Law_Ranking__c;

    private com.sforce.soap.enterprise.QueryResult opportunity__r;

    private com.sforce.soap.enterprise.sobject.User owner;

    private java.lang.String ownerId;

    private java.lang.String POC_s__c;

    private com.sforce.soap.enterprise.sobject.Account parent;

    private java.lang.String parentId;

    private com.sforce.soap.enterprise.QueryResult partnersFrom;

    private com.sforce.soap.enterprise.QueryResult partnersTo;

    private java.lang.String phone;

    private java.lang.Double pilot__c;

    private java.lang.String pod_Extension__c;

    private java.lang.String pod__c;

    private java.lang.String primary_Contact_Email_Address__c;

    private java.lang.String primary_Contact__c;

    private com.sforce.soap.enterprise.sobject.Contact primary_Contact__r;

    private java.util.Date primary_Instance_Go_Live__c;

    private java.lang.String primary_Instance_Version1__c;

    private java.lang.String primary_Instance__c;

    private com.sforce.soap.enterprise.sobject.Instance__c primary_Instance__r;

    private java.lang.String primary_Marketing_Contact_Email__c;

    private java.lang.String primary_Marketing_Contact__c;

    private com.sforce.soap.enterprise.sobject.Contact primary_Marketing_Contact__r;

    private java.lang.String primary_Relativity_Version__c;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.String product_Name__c;

    private com.sforce.soap.enterprise.QueryResult purchase_Orders__r;

    private com.sforce.soap.enterprise.QueryResult RAR_DLs__r;

    private com.sforce.soap.enterprise.QueryResult RA_Monthly_Usages__r;

    private com.sforce.soap.enterprise.QueryResult RA_Rollups__r;

    private java.lang.String region__c;

    private java.lang.Double related_Instances__c;

    private java.lang.String relativity_URL__c;

    private java.lang.String relativity_Version__c;

    private com.sforce.soap.enterprise.sobject.Release__c relativity_Version__r;

    private com.sforce.soap.enterprise.QueryResult reseller_Opportunities__r;

    private java.lang.Boolean reseller_Partner__c;

    private java.lang.String reseller_Tier__c;

    private java.lang.String sales_Contact_Email__c;

    private java.lang.String sales_Contact__c;

    private java.lang.Boolean sales_Distribution_List__c;

    private java.lang.String sales_Support_Login__c;

    private java.lang.String sales_Support_Password__c;

    private com.sforce.soap.enterprise.QueryResult shares;

    private java.lang.String sicDesc;

    private java.lang.String software_Solutions__c;

    private com.sforce.soap.enterprise.QueryResult status_Meetings__r;

    private java.lang.String support_CC_Emails__c;

    private java.lang.String support_Contact_Email__c;

    private java.lang.String support_Contact__c;

    private java.lang.Boolean support_Distribution_List__c;

    private java.lang.String support_Hours__c;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    private java.lang.String tradestyle;

    private com.sforce.soap.enterprise.QueryResult trainings__r;

    private com.sforce.soap.enterprise.QueryResult transactions__r;

    private java.lang.String type;

    private java.lang.String type_Analytic_Snapshot__c;

    private java.lang.String URL_of_CoBranded_Collateral__c;

    private com.sforce.soap.enterprise.QueryResult unique_Users__r;

    private java.lang.String user_License__c;

    private com.sforce.soap.enterprise.QueryResult VM_Instances__r;

    private java.lang.Boolean verto_Beta_User__c;

    private java.lang.String website;

    private java.lang.Double won_and_Consulting__c;

    private java.lang.Double won_and_Corporation__c;

    private java.lang.Double won_and_Government__c;

    private java.lang.Double won_and_ISV__c;

    private java.lang.Double won_and_Law_Firm__c;

    private java.lang.Double won_and_Premium__c;

    private java.lang.Boolean works_With_GeorgeJon__c;

    private java.lang.String yearStarted;

    private java.lang.Double won_and_reseller__c;

    public Account() {
    }

    public Account(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult AMLAW_Rankings__r,
           java.lang.Double AM_Law_Ranking_2009__c,
           java.lang.Double AM_Law_Ranking_2010__c,
           com.sforce.soap.enterprise.QueryResult accountContactRoles,
           com.sforce.soap.enterprise.QueryResult accountPartnersFrom,
           com.sforce.soap.enterprise.QueryResult accountPartnersTo,
           java.lang.String accountSource,
           java.lang.String account_Alert__c,
           java.lang.Double account_Count__c,
           java.lang.String acct_Owner__c,
           com.sforce.soap.enterprise.sobject.User acct_Owner__r,
           java.lang.Boolean active_kPlex_Client__c,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           com.sforce.soap.enterprise.QueryResult admin_Certifications__r,
           com.sforce.soap.enterprise.QueryResult analytic_Snapshots__r,
           com.sforce.soap.enterprise.QueryResult assets,
           com.sforce.soap.enterprise.QueryResult attachments,
           com.sforce.soap.enterprise.QueryResult best_In_Services1__r,
           java.lang.Boolean best_in_Service__c,
           com.sforce.soap.enterprise.QueryResult best_in_Service__r,
           java.util.Date biS_End_Date__c,
           java.util.Date biS_Start_Date__c,
           java.lang.String billingCity,
           java.lang.String billingCountry,
           java.lang.String billingPostalCode,
           java.lang.String billingState,
           java.lang.String billingStreet,
           com.sforce.soap.enterprise.QueryResult cases,
           java.lang.String category__c,
           com.sforce.soap.enterprise.QueryResult channel_Manager_Outlines__r,
           java.util.Date client_Since__c,
           java.lang.Double client_Testimonials__c,
           java.lang.String client_Type_Analytic_Snapshot__c,
           java.lang.String client_Type__c,
           java.lang.Boolean collection_Issue__c,
           java.util.Date collections_Last_Modified_Date__c,
           java.lang.Double concurforce__AccruedUnApprovedExpenseTotal__c,
           com.sforce.soap.enterprise.QueryResult concurforce__Allocations__r,
           com.sforce.soap.enterprise.QueryResult concurforce__CT_Object_Lookups__r,
           com.sforce.soap.enterprise.QueryResult concurforce__Expense_Total_Account__r,
           java.lang.Double concurforce__FinalExpenseTotal__c,
           com.sforce.soap.enterprise.QueryResult contacts,
           com.sforce.soap.enterprise.QueryResult content__r,
           com.sforce.soap.enterprise.QueryResult contracts,
           com.sforce.soap.enterprise.QueryResult contracts__r,
           java.lang.String country__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.Double current_AMLAW_Ranking__c,
           java.util.Date date_Became_PHP__c,
           java.lang.Boolean db_SQL_Environment_Email__c,
           com.sforce.soap.enterprise.QueryResult demos1__r,
           com.sforce.soap.enterprise.QueryResult demos__r,
           java.lang.String description,
           java.lang.String dunsNumber,
           java.lang.String evaluation_Type__c,
           com.sforce.soap.enterprise.QueryResult events,
           java.lang.String FTP_Login__c,
           java.lang.String FTP_Password__c,
           java.lang.Boolean FTP_Preferred__c,
           java.lang.String fax,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult feeds,
           java.lang.Double fortune_Ranking__c,
           java.lang.Double functional_Trial__c,
           java.lang.String global_Account__c,
           java.lang.String has_Custom_Solution__c,
           java.lang.Boolean has_Non_Licensing_DLLs__c,
           java.lang.Boolean has_Test_Instance__c,
           java.lang.String have_Client_Logo__c,
           java.lang.String have_Client_Testimonial__c,
           com.sforce.soap.enterprise.QueryResult histories,
           com.sforce.soap.enterprise.QueryResult ideas_Site_Setups__r,
           java.lang.String industry__c,
           com.sforce.soap.enterprise.sobject.Industry__c industry__r,
           com.sforce.soap.enterprise.QueryResult instances__r,
           java.lang.String integration_Notes__c,
           java.lang.Boolean international_Client__c,
           java.lang.Boolean isCustomerPortal,
           java.lang.Boolean isDeleted,
           java.lang.String jigsaw,
           java.lang.String jigsawCompanyId,
           java.util.Date lastActivityDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String legal_Entity__c,
           com.sforce.soap.enterprise.QueryResult logo_Testimonial_Trackings__r,
           com.sforce.soap.enterprise.sobject.Account masterRecord,
           java.lang.String masterRecordId,
           com.sforce.soap.enterprise.QueryResult meetings__r,
           java.lang.String naicsCode,
           java.lang.String naicsDesc,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           java.lang.String notes__c,
           java.lang.Double number_Count__c,
           java.lang.Double number_of_Pilot_Opportunites__c,
           com.sforce.soap.enterprise.QueryResult openActivities,
           com.sforce.soap.enterprise.QueryResult opportunities,
           com.sforce.soap.enterprise.QueryResult opportunityPartnersTo,
           java.lang.Double opportunity_AM_Law_Ranking__c,
           com.sforce.soap.enterprise.QueryResult opportunity__r,
           com.sforce.soap.enterprise.sobject.User owner,
           java.lang.String ownerId,
           java.lang.String POC_s__c,
           com.sforce.soap.enterprise.sobject.Account parent,
           java.lang.String parentId,
           com.sforce.soap.enterprise.QueryResult partnersFrom,
           com.sforce.soap.enterprise.QueryResult partnersTo,
           java.lang.String phone,
           java.lang.Double pilot__c,
           java.lang.String pod_Extension__c,
           java.lang.String pod__c,
           java.lang.String primary_Contact_Email_Address__c,
           java.lang.String primary_Contact__c,
           com.sforce.soap.enterprise.sobject.Contact primary_Contact__r,
           java.util.Date primary_Instance_Go_Live__c,
           java.lang.String primary_Instance_Version1__c,
           java.lang.String primary_Instance__c,
           com.sforce.soap.enterprise.sobject.Instance__c primary_Instance__r,
           java.lang.String primary_Marketing_Contact_Email__c,
           java.lang.String primary_Marketing_Contact__c,
           com.sforce.soap.enterprise.sobject.Contact primary_Marketing_Contact__r,
           java.lang.String primary_Relativity_Version__c,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.String product_Name__c,
           com.sforce.soap.enterprise.QueryResult purchase_Orders__r,
           com.sforce.soap.enterprise.QueryResult RAR_DLs__r,
           com.sforce.soap.enterprise.QueryResult RA_Monthly_Usages__r,
           com.sforce.soap.enterprise.QueryResult RA_Rollups__r,
           java.lang.String region__c,
           java.lang.Double related_Instances__c,
           java.lang.String relativity_URL__c,
           java.lang.String relativity_Version__c,
           com.sforce.soap.enterprise.sobject.Release__c relativity_Version__r,
           com.sforce.soap.enterprise.QueryResult reseller_Opportunities__r,
           java.lang.Boolean reseller_Partner__c,
           java.lang.String reseller_Tier__c,
           java.lang.String sales_Contact_Email__c,
           java.lang.String sales_Contact__c,
           java.lang.Boolean sales_Distribution_List__c,
           java.lang.String sales_Support_Login__c,
           java.lang.String sales_Support_Password__c,
           com.sforce.soap.enterprise.QueryResult shares,
           java.lang.String sicDesc,
           java.lang.String software_Solutions__c,
           com.sforce.soap.enterprise.QueryResult status_Meetings__r,
           java.lang.String support_CC_Emails__c,
           java.lang.String support_Contact_Email__c,
           java.lang.String support_Contact__c,
           java.lang.Boolean support_Distribution_List__c,
           java.lang.String support_Hours__c,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks,
           java.lang.String tradestyle,
           com.sforce.soap.enterprise.QueryResult trainings__r,
           com.sforce.soap.enterprise.QueryResult transactions__r,
           java.lang.String type,
           java.lang.String type_Analytic_Snapshot__c,
           java.lang.String URL_of_CoBranded_Collateral__c,
           com.sforce.soap.enterprise.QueryResult unique_Users__r,
           java.lang.String user_License__c,
           com.sforce.soap.enterprise.QueryResult VM_Instances__r,
           java.lang.Boolean verto_Beta_User__c,
           java.lang.String website,
           java.lang.Double won_and_Consulting__c,
           java.lang.Double won_and_Corporation__c,
           java.lang.Double won_and_Government__c,
           java.lang.Double won_and_ISV__c,
           java.lang.Double won_and_Law_Firm__c,
           java.lang.Double won_and_Premium__c,
           java.lang.Boolean works_With_GeorgeJon__c,
           java.lang.String yearStarted,
           java.lang.Double won_and_reseller__c) {
        super(
            fieldsToNull,
            id);
        this.AMLAW_Rankings__r = AMLAW_Rankings__r;
        this.AM_Law_Ranking_2009__c = AM_Law_Ranking_2009__c;
        this.AM_Law_Ranking_2010__c = AM_Law_Ranking_2010__c;
        this.accountContactRoles = accountContactRoles;
        this.accountPartnersFrom = accountPartnersFrom;
        this.accountPartnersTo = accountPartnersTo;
        this.accountSource = accountSource;
        this.account_Alert__c = account_Alert__c;
        this.account_Count__c = account_Count__c;
        this.acct_Owner__c = acct_Owner__c;
        this.acct_Owner__r = acct_Owner__r;
        this.active_kPlex_Client__c = active_kPlex_Client__c;
        this.activityHistories = activityHistories;
        this.admin_Certifications__r = admin_Certifications__r;
        this.analytic_Snapshots__r = analytic_Snapshots__r;
        this.assets = assets;
        this.attachments = attachments;
        this.best_In_Services1__r = best_In_Services1__r;
        this.best_in_Service__c = best_in_Service__c;
        this.best_in_Service__r = best_in_Service__r;
        this.biS_End_Date__c = biS_End_Date__c;
        this.biS_Start_Date__c = biS_Start_Date__c;
        this.billingCity = billingCity;
        this.billingCountry = billingCountry;
        this.billingPostalCode = billingPostalCode;
        this.billingState = billingState;
        this.billingStreet = billingStreet;
        this.cases = cases;
        this.category__c = category__c;
        this.channel_Manager_Outlines__r = channel_Manager_Outlines__r;
        this.client_Since__c = client_Since__c;
        this.client_Testimonials__c = client_Testimonials__c;
        this.client_Type_Analytic_Snapshot__c = client_Type_Analytic_Snapshot__c;
        this.client_Type__c = client_Type__c;
        this.collection_Issue__c = collection_Issue__c;
        this.collections_Last_Modified_Date__c = collections_Last_Modified_Date__c;
        this.concurforce__AccruedUnApprovedExpenseTotal__c = concurforce__AccruedUnApprovedExpenseTotal__c;
        this.concurforce__Allocations__r = concurforce__Allocations__r;
        this.concurforce__CT_Object_Lookups__r = concurforce__CT_Object_Lookups__r;
        this.concurforce__Expense_Total_Account__r = concurforce__Expense_Total_Account__r;
        this.concurforce__FinalExpenseTotal__c = concurforce__FinalExpenseTotal__c;
        this.contacts = contacts;
        this.content__r = content__r;
        this.contracts = contracts;
        this.contracts__r = contracts__r;
        this.country__c = country__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.current_AMLAW_Ranking__c = current_AMLAW_Ranking__c;
        this.date_Became_PHP__c = date_Became_PHP__c;
        this.db_SQL_Environment_Email__c = db_SQL_Environment_Email__c;
        this.demos1__r = demos1__r;
        this.demos__r = demos__r;
        this.description = description;
        this.dunsNumber = dunsNumber;
        this.evaluation_Type__c = evaluation_Type__c;
        this.events = events;
        this.FTP_Login__c = FTP_Login__c;
        this.FTP_Password__c = FTP_Password__c;
        this.FTP_Preferred__c = FTP_Preferred__c;
        this.fax = fax;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.feeds = feeds;
        this.fortune_Ranking__c = fortune_Ranking__c;
        this.functional_Trial__c = functional_Trial__c;
        this.global_Account__c = global_Account__c;
        this.has_Custom_Solution__c = has_Custom_Solution__c;
        this.has_Non_Licensing_DLLs__c = has_Non_Licensing_DLLs__c;
        this.has_Test_Instance__c = has_Test_Instance__c;
        this.have_Client_Logo__c = have_Client_Logo__c;
        this.have_Client_Testimonial__c = have_Client_Testimonial__c;
        this.histories = histories;
        this.ideas_Site_Setups__r = ideas_Site_Setups__r;
        this.industry__c = industry__c;
        this.industry__r = industry__r;
        this.instances__r = instances__r;
        this.integration_Notes__c = integration_Notes__c;
        this.international_Client__c = international_Client__c;
        this.isCustomerPortal = isCustomerPortal;
        this.isDeleted = isDeleted;
        this.jigsaw = jigsaw;
        this.jigsawCompanyId = jigsawCompanyId;
        this.lastActivityDate = lastActivityDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.legal_Entity__c = legal_Entity__c;
        this.logo_Testimonial_Trackings__r = logo_Testimonial_Trackings__r;
        this.masterRecord = masterRecord;
        this.masterRecordId = masterRecordId;
        this.meetings__r = meetings__r;
        this.naicsCode = naicsCode;
        this.naicsDesc = naicsDesc;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.notes__c = notes__c;
        this.number_Count__c = number_Count__c;
        this.number_of_Pilot_Opportunites__c = number_of_Pilot_Opportunites__c;
        this.openActivities = openActivities;
        this.opportunities = opportunities;
        this.opportunityPartnersTo = opportunityPartnersTo;
        this.opportunity_AM_Law_Ranking__c = opportunity_AM_Law_Ranking__c;
        this.opportunity__r = opportunity__r;
        this.owner = owner;
        this.ownerId = ownerId;
        this.POC_s__c = POC_s__c;
        this.parent = parent;
        this.parentId = parentId;
        this.partnersFrom = partnersFrom;
        this.partnersTo = partnersTo;
        this.phone = phone;
        this.pilot__c = pilot__c;
        this.pod_Extension__c = pod_Extension__c;
        this.pod__c = pod__c;
        this.primary_Contact_Email_Address__c = primary_Contact_Email_Address__c;
        this.primary_Contact__c = primary_Contact__c;
        this.primary_Contact__r = primary_Contact__r;
        this.primary_Instance_Go_Live__c = primary_Instance_Go_Live__c;
        this.primary_Instance_Version1__c = primary_Instance_Version1__c;
        this.primary_Instance__c = primary_Instance__c;
        this.primary_Instance__r = primary_Instance__r;
        this.primary_Marketing_Contact_Email__c = primary_Marketing_Contact_Email__c;
        this.primary_Marketing_Contact__c = primary_Marketing_Contact__c;
        this.primary_Marketing_Contact__r = primary_Marketing_Contact__r;
        this.primary_Relativity_Version__c = primary_Relativity_Version__c;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.product_Name__c = product_Name__c;
        this.purchase_Orders__r = purchase_Orders__r;
        this.RAR_DLs__r = RAR_DLs__r;
        this.RA_Monthly_Usages__r = RA_Monthly_Usages__r;
        this.RA_Rollups__r = RA_Rollups__r;
        this.region__c = region__c;
        this.related_Instances__c = related_Instances__c;
        this.relativity_URL__c = relativity_URL__c;
        this.relativity_Version__c = relativity_Version__c;
        this.relativity_Version__r = relativity_Version__r;
        this.reseller_Opportunities__r = reseller_Opportunities__r;
        this.reseller_Partner__c = reseller_Partner__c;
        this.reseller_Tier__c = reseller_Tier__c;
        this.sales_Contact_Email__c = sales_Contact_Email__c;
        this.sales_Contact__c = sales_Contact__c;
        this.sales_Distribution_List__c = sales_Distribution_List__c;
        this.sales_Support_Login__c = sales_Support_Login__c;
        this.sales_Support_Password__c = sales_Support_Password__c;
        this.shares = shares;
        this.sicDesc = sicDesc;
        this.software_Solutions__c = software_Solutions__c;
        this.status_Meetings__r = status_Meetings__r;
        this.support_CC_Emails__c = support_CC_Emails__c;
        this.support_Contact_Email__c = support_Contact_Email__c;
        this.support_Contact__c = support_Contact__c;
        this.support_Distribution_List__c = support_Distribution_List__c;
        this.support_Hours__c = support_Hours__c;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
        this.tradestyle = tradestyle;
        this.trainings__r = trainings__r;
        this.transactions__r = transactions__r;
        this.type = type;
        this.type_Analytic_Snapshot__c = type_Analytic_Snapshot__c;
        this.URL_of_CoBranded_Collateral__c = URL_of_CoBranded_Collateral__c;
        this.unique_Users__r = unique_Users__r;
        this.user_License__c = user_License__c;
        this.VM_Instances__r = VM_Instances__r;
        this.verto_Beta_User__c = verto_Beta_User__c;
        this.website = website;
        this.won_and_Consulting__c = won_and_Consulting__c;
        this.won_and_Corporation__c = won_and_Corporation__c;
        this.won_and_Government__c = won_and_Government__c;
        this.won_and_ISV__c = won_and_ISV__c;
        this.won_and_Law_Firm__c = won_and_Law_Firm__c;
        this.won_and_Premium__c = won_and_Premium__c;
        this.works_With_GeorgeJon__c = works_With_GeorgeJon__c;
        this.yearStarted = yearStarted;
        this.won_and_reseller__c = won_and_reseller__c;
    }


    /**
     * Gets the AMLAW_Rankings__r value for this Account.
     * 
     * @return AMLAW_Rankings__r
     */
    public com.sforce.soap.enterprise.QueryResult getAMLAW_Rankings__r() {
        return AMLAW_Rankings__r;
    }


    /**
     * Sets the AMLAW_Rankings__r value for this Account.
     * 
     * @param AMLAW_Rankings__r
     */
    public void setAMLAW_Rankings__r(com.sforce.soap.enterprise.QueryResult AMLAW_Rankings__r) {
        this.AMLAW_Rankings__r = AMLAW_Rankings__r;
    }


    /**
     * Gets the AM_Law_Ranking_2009__c value for this Account.
     * 
     * @return AM_Law_Ranking_2009__c
     */
    public java.lang.Double getAM_Law_Ranking_2009__c() {
        return AM_Law_Ranking_2009__c;
    }


    /**
     * Sets the AM_Law_Ranking_2009__c value for this Account.
     * 
     * @param AM_Law_Ranking_2009__c
     */
    public void setAM_Law_Ranking_2009__c(java.lang.Double AM_Law_Ranking_2009__c) {
        this.AM_Law_Ranking_2009__c = AM_Law_Ranking_2009__c;
    }


    /**
     * Gets the AM_Law_Ranking_2010__c value for this Account.
     * 
     * @return AM_Law_Ranking_2010__c
     */
    public java.lang.Double getAM_Law_Ranking_2010__c() {
        return AM_Law_Ranking_2010__c;
    }


    /**
     * Sets the AM_Law_Ranking_2010__c value for this Account.
     * 
     * @param AM_Law_Ranking_2010__c
     */
    public void setAM_Law_Ranking_2010__c(java.lang.Double AM_Law_Ranking_2010__c) {
        this.AM_Law_Ranking_2010__c = AM_Law_Ranking_2010__c;
    }


    /**
     * Gets the accountContactRoles value for this Account.
     * 
     * @return accountContactRoles
     */
    public com.sforce.soap.enterprise.QueryResult getAccountContactRoles() {
        return accountContactRoles;
    }


    /**
     * Sets the accountContactRoles value for this Account.
     * 
     * @param accountContactRoles
     */
    public void setAccountContactRoles(com.sforce.soap.enterprise.QueryResult accountContactRoles) {
        this.accountContactRoles = accountContactRoles;
    }


    /**
     * Gets the accountPartnersFrom value for this Account.
     * 
     * @return accountPartnersFrom
     */
    public com.sforce.soap.enterprise.QueryResult getAccountPartnersFrom() {
        return accountPartnersFrom;
    }


    /**
     * Sets the accountPartnersFrom value for this Account.
     * 
     * @param accountPartnersFrom
     */
    public void setAccountPartnersFrom(com.sforce.soap.enterprise.QueryResult accountPartnersFrom) {
        this.accountPartnersFrom = accountPartnersFrom;
    }


    /**
     * Gets the accountPartnersTo value for this Account.
     * 
     * @return accountPartnersTo
     */
    public com.sforce.soap.enterprise.QueryResult getAccountPartnersTo() {
        return accountPartnersTo;
    }


    /**
     * Sets the accountPartnersTo value for this Account.
     * 
     * @param accountPartnersTo
     */
    public void setAccountPartnersTo(com.sforce.soap.enterprise.QueryResult accountPartnersTo) {
        this.accountPartnersTo = accountPartnersTo;
    }


    /**
     * Gets the accountSource value for this Account.
     * 
     * @return accountSource
     */
    public java.lang.String getAccountSource() {
        return accountSource;
    }


    /**
     * Sets the accountSource value for this Account.
     * 
     * @param accountSource
     */
    public void setAccountSource(java.lang.String accountSource) {
        this.accountSource = accountSource;
    }


    /**
     * Gets the account_Alert__c value for this Account.
     * 
     * @return account_Alert__c
     */
    public java.lang.String getAccount_Alert__c() {
        return account_Alert__c;
    }


    /**
     * Sets the account_Alert__c value for this Account.
     * 
     * @param account_Alert__c
     */
    public void setAccount_Alert__c(java.lang.String account_Alert__c) {
        this.account_Alert__c = account_Alert__c;
    }


    /**
     * Gets the account_Count__c value for this Account.
     * 
     * @return account_Count__c
     */
    public java.lang.Double getAccount_Count__c() {
        return account_Count__c;
    }


    /**
     * Sets the account_Count__c value for this Account.
     * 
     * @param account_Count__c
     */
    public void setAccount_Count__c(java.lang.Double account_Count__c) {
        this.account_Count__c = account_Count__c;
    }


    /**
     * Gets the acct_Owner__c value for this Account.
     * 
     * @return acct_Owner__c
     */
    public java.lang.String getAcct_Owner__c() {
        return acct_Owner__c;
    }


    /**
     * Sets the acct_Owner__c value for this Account.
     * 
     * @param acct_Owner__c
     */
    public void setAcct_Owner__c(java.lang.String acct_Owner__c) {
        this.acct_Owner__c = acct_Owner__c;
    }


    /**
     * Gets the acct_Owner__r value for this Account.
     * 
     * @return acct_Owner__r
     */
    public com.sforce.soap.enterprise.sobject.User getAcct_Owner__r() {
        return acct_Owner__r;
    }


    /**
     * Sets the acct_Owner__r value for this Account.
     * 
     * @param acct_Owner__r
     */
    public void setAcct_Owner__r(com.sforce.soap.enterprise.sobject.User acct_Owner__r) {
        this.acct_Owner__r = acct_Owner__r;
    }


    /**
     * Gets the active_kPlex_Client__c value for this Account.
     * 
     * @return active_kPlex_Client__c
     */
    public java.lang.Boolean getActive_kPlex_Client__c() {
        return active_kPlex_Client__c;
    }


    /**
     * Sets the active_kPlex_Client__c value for this Account.
     * 
     * @param active_kPlex_Client__c
     */
    public void setActive_kPlex_Client__c(java.lang.Boolean active_kPlex_Client__c) {
        this.active_kPlex_Client__c = active_kPlex_Client__c;
    }


    /**
     * Gets the activityHistories value for this Account.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this Account.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the admin_Certifications__r value for this Account.
     * 
     * @return admin_Certifications__r
     */
    public com.sforce.soap.enterprise.QueryResult getAdmin_Certifications__r() {
        return admin_Certifications__r;
    }


    /**
     * Sets the admin_Certifications__r value for this Account.
     * 
     * @param admin_Certifications__r
     */
    public void setAdmin_Certifications__r(com.sforce.soap.enterprise.QueryResult admin_Certifications__r) {
        this.admin_Certifications__r = admin_Certifications__r;
    }


    /**
     * Gets the analytic_Snapshots__r value for this Account.
     * 
     * @return analytic_Snapshots__r
     */
    public com.sforce.soap.enterprise.QueryResult getAnalytic_Snapshots__r() {
        return analytic_Snapshots__r;
    }


    /**
     * Sets the analytic_Snapshots__r value for this Account.
     * 
     * @param analytic_Snapshots__r
     */
    public void setAnalytic_Snapshots__r(com.sforce.soap.enterprise.QueryResult analytic_Snapshots__r) {
        this.analytic_Snapshots__r = analytic_Snapshots__r;
    }


    /**
     * Gets the assets value for this Account.
     * 
     * @return assets
     */
    public com.sforce.soap.enterprise.QueryResult getAssets() {
        return assets;
    }


    /**
     * Sets the assets value for this Account.
     * 
     * @param assets
     */
    public void setAssets(com.sforce.soap.enterprise.QueryResult assets) {
        this.assets = assets;
    }


    /**
     * Gets the attachments value for this Account.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Account.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the best_In_Services1__r value for this Account.
     * 
     * @return best_In_Services1__r
     */
    public com.sforce.soap.enterprise.QueryResult getBest_In_Services1__r() {
        return best_In_Services1__r;
    }


    /**
     * Sets the best_In_Services1__r value for this Account.
     * 
     * @param best_In_Services1__r
     */
    public void setBest_In_Services1__r(com.sforce.soap.enterprise.QueryResult best_In_Services1__r) {
        this.best_In_Services1__r = best_In_Services1__r;
    }


    /**
     * Gets the best_in_Service__c value for this Account.
     * 
     * @return best_in_Service__c
     */
    public java.lang.Boolean getBest_in_Service__c() {
        return best_in_Service__c;
    }


    /**
     * Sets the best_in_Service__c value for this Account.
     * 
     * @param best_in_Service__c
     */
    public void setBest_in_Service__c(java.lang.Boolean best_in_Service__c) {
        this.best_in_Service__c = best_in_Service__c;
    }


    /**
     * Gets the best_in_Service__r value for this Account.
     * 
     * @return best_in_Service__r
     */
    public com.sforce.soap.enterprise.QueryResult getBest_in_Service__r() {
        return best_in_Service__r;
    }


    /**
     * Sets the best_in_Service__r value for this Account.
     * 
     * @param best_in_Service__r
     */
    public void setBest_in_Service__r(com.sforce.soap.enterprise.QueryResult best_in_Service__r) {
        this.best_in_Service__r = best_in_Service__r;
    }


    /**
     * Gets the biS_End_Date__c value for this Account.
     * 
     * @return biS_End_Date__c
     */
    public java.util.Date getBiS_End_Date__c() {
        return biS_End_Date__c;
    }


    /**
     * Sets the biS_End_Date__c value for this Account.
     * 
     * @param biS_End_Date__c
     */
    public void setBiS_End_Date__c(java.util.Date biS_End_Date__c) {
        this.biS_End_Date__c = biS_End_Date__c;
    }


    /**
     * Gets the biS_Start_Date__c value for this Account.
     * 
     * @return biS_Start_Date__c
     */
    public java.util.Date getBiS_Start_Date__c() {
        return biS_Start_Date__c;
    }


    /**
     * Sets the biS_Start_Date__c value for this Account.
     * 
     * @param biS_Start_Date__c
     */
    public void setBiS_Start_Date__c(java.util.Date biS_Start_Date__c) {
        this.biS_Start_Date__c = biS_Start_Date__c;
    }


    /**
     * Gets the billingCity value for this Account.
     * 
     * @return billingCity
     */
    public java.lang.String getBillingCity() {
        return billingCity;
    }


    /**
     * Sets the billingCity value for this Account.
     * 
     * @param billingCity
     */
    public void setBillingCity(java.lang.String billingCity) {
        this.billingCity = billingCity;
    }


    /**
     * Gets the billingCountry value for this Account.
     * 
     * @return billingCountry
     */
    public java.lang.String getBillingCountry() {
        return billingCountry;
    }


    /**
     * Sets the billingCountry value for this Account.
     * 
     * @param billingCountry
     */
    public void setBillingCountry(java.lang.String billingCountry) {
        this.billingCountry = billingCountry;
    }


    /**
     * Gets the billingPostalCode value for this Account.
     * 
     * @return billingPostalCode
     */
    public java.lang.String getBillingPostalCode() {
        return billingPostalCode;
    }


    /**
     * Sets the billingPostalCode value for this Account.
     * 
     * @param billingPostalCode
     */
    public void setBillingPostalCode(java.lang.String billingPostalCode) {
        this.billingPostalCode = billingPostalCode;
    }


    /**
     * Gets the billingState value for this Account.
     * 
     * @return billingState
     */
    public java.lang.String getBillingState() {
        return billingState;
    }


    /**
     * Sets the billingState value for this Account.
     * 
     * @param billingState
     */
    public void setBillingState(java.lang.String billingState) {
        this.billingState = billingState;
    }


    /**
     * Gets the billingStreet value for this Account.
     * 
     * @return billingStreet
     */
    public java.lang.String getBillingStreet() {
        return billingStreet;
    }


    /**
     * Sets the billingStreet value for this Account.
     * 
     * @param billingStreet
     */
    public void setBillingStreet(java.lang.String billingStreet) {
        this.billingStreet = billingStreet;
    }


    /**
     * Gets the cases value for this Account.
     * 
     * @return cases
     */
    public com.sforce.soap.enterprise.QueryResult getCases() {
        return cases;
    }


    /**
     * Sets the cases value for this Account.
     * 
     * @param cases
     */
    public void setCases(com.sforce.soap.enterprise.QueryResult cases) {
        this.cases = cases;
    }


    /**
     * Gets the category__c value for this Account.
     * 
     * @return category__c
     */
    public java.lang.String getCategory__c() {
        return category__c;
    }


    /**
     * Sets the category__c value for this Account.
     * 
     * @param category__c
     */
    public void setCategory__c(java.lang.String category__c) {
        this.category__c = category__c;
    }


    /**
     * Gets the channel_Manager_Outlines__r value for this Account.
     * 
     * @return channel_Manager_Outlines__r
     */
    public com.sforce.soap.enterprise.QueryResult getChannel_Manager_Outlines__r() {
        return channel_Manager_Outlines__r;
    }


    /**
     * Sets the channel_Manager_Outlines__r value for this Account.
     * 
     * @param channel_Manager_Outlines__r
     */
    public void setChannel_Manager_Outlines__r(com.sforce.soap.enterprise.QueryResult channel_Manager_Outlines__r) {
        this.channel_Manager_Outlines__r = channel_Manager_Outlines__r;
    }


    /**
     * Gets the client_Since__c value for this Account.
     * 
     * @return client_Since__c
     */
    public java.util.Date getClient_Since__c() {
        return client_Since__c;
    }


    /**
     * Sets the client_Since__c value for this Account.
     * 
     * @param client_Since__c
     */
    public void setClient_Since__c(java.util.Date client_Since__c) {
        this.client_Since__c = client_Since__c;
    }


    /**
     * Gets the client_Testimonials__c value for this Account.
     * 
     * @return client_Testimonials__c
     */
    public java.lang.Double getClient_Testimonials__c() {
        return client_Testimonials__c;
    }


    /**
     * Sets the client_Testimonials__c value for this Account.
     * 
     * @param client_Testimonials__c
     */
    public void setClient_Testimonials__c(java.lang.Double client_Testimonials__c) {
        this.client_Testimonials__c = client_Testimonials__c;
    }


    /**
     * Gets the client_Type_Analytic_Snapshot__c value for this Account.
     * 
     * @return client_Type_Analytic_Snapshot__c
     */
    public java.lang.String getClient_Type_Analytic_Snapshot__c() {
        return client_Type_Analytic_Snapshot__c;
    }


    /**
     * Sets the client_Type_Analytic_Snapshot__c value for this Account.
     * 
     * @param client_Type_Analytic_Snapshot__c
     */
    public void setClient_Type_Analytic_Snapshot__c(java.lang.String client_Type_Analytic_Snapshot__c) {
        this.client_Type_Analytic_Snapshot__c = client_Type_Analytic_Snapshot__c;
    }


    /**
     * Gets the client_Type__c value for this Account.
     * 
     * @return client_Type__c
     */
    public java.lang.String getClient_Type__c() {
        return client_Type__c;
    }


    /**
     * Sets the client_Type__c value for this Account.
     * 
     * @param client_Type__c
     */
    public void setClient_Type__c(java.lang.String client_Type__c) {
        this.client_Type__c = client_Type__c;
    }


    /**
     * Gets the collection_Issue__c value for this Account.
     * 
     * @return collection_Issue__c
     */
    public java.lang.Boolean getCollection_Issue__c() {
        return collection_Issue__c;
    }


    /**
     * Sets the collection_Issue__c value for this Account.
     * 
     * @param collection_Issue__c
     */
    public void setCollection_Issue__c(java.lang.Boolean collection_Issue__c) {
        this.collection_Issue__c = collection_Issue__c;
    }


    /**
     * Gets the collections_Last_Modified_Date__c value for this Account.
     * 
     * @return collections_Last_Modified_Date__c
     */
    public java.util.Date getCollections_Last_Modified_Date__c() {
        return collections_Last_Modified_Date__c;
    }


    /**
     * Sets the collections_Last_Modified_Date__c value for this Account.
     * 
     * @param collections_Last_Modified_Date__c
     */
    public void setCollections_Last_Modified_Date__c(java.util.Date collections_Last_Modified_Date__c) {
        this.collections_Last_Modified_Date__c = collections_Last_Modified_Date__c;
    }


    /**
     * Gets the concurforce__AccruedUnApprovedExpenseTotal__c value for this Account.
     * 
     * @return concurforce__AccruedUnApprovedExpenseTotal__c
     */
    public java.lang.Double getConcurforce__AccruedUnApprovedExpenseTotal__c() {
        return concurforce__AccruedUnApprovedExpenseTotal__c;
    }


    /**
     * Sets the concurforce__AccruedUnApprovedExpenseTotal__c value for this Account.
     * 
     * @param concurforce__AccruedUnApprovedExpenseTotal__c
     */
    public void setConcurforce__AccruedUnApprovedExpenseTotal__c(java.lang.Double concurforce__AccruedUnApprovedExpenseTotal__c) {
        this.concurforce__AccruedUnApprovedExpenseTotal__c = concurforce__AccruedUnApprovedExpenseTotal__c;
    }


    /**
     * Gets the concurforce__Allocations__r value for this Account.
     * 
     * @return concurforce__Allocations__r
     */
    public com.sforce.soap.enterprise.QueryResult getConcurforce__Allocations__r() {
        return concurforce__Allocations__r;
    }


    /**
     * Sets the concurforce__Allocations__r value for this Account.
     * 
     * @param concurforce__Allocations__r
     */
    public void setConcurforce__Allocations__r(com.sforce.soap.enterprise.QueryResult concurforce__Allocations__r) {
        this.concurforce__Allocations__r = concurforce__Allocations__r;
    }


    /**
     * Gets the concurforce__CT_Object_Lookups__r value for this Account.
     * 
     * @return concurforce__CT_Object_Lookups__r
     */
    public com.sforce.soap.enterprise.QueryResult getConcurforce__CT_Object_Lookups__r() {
        return concurforce__CT_Object_Lookups__r;
    }


    /**
     * Sets the concurforce__CT_Object_Lookups__r value for this Account.
     * 
     * @param concurforce__CT_Object_Lookups__r
     */
    public void setConcurforce__CT_Object_Lookups__r(com.sforce.soap.enterprise.QueryResult concurforce__CT_Object_Lookups__r) {
        this.concurforce__CT_Object_Lookups__r = concurforce__CT_Object_Lookups__r;
    }


    /**
     * Gets the concurforce__Expense_Total_Account__r value for this Account.
     * 
     * @return concurforce__Expense_Total_Account__r
     */
    public com.sforce.soap.enterprise.QueryResult getConcurforce__Expense_Total_Account__r() {
        return concurforce__Expense_Total_Account__r;
    }


    /**
     * Sets the concurforce__Expense_Total_Account__r value for this Account.
     * 
     * @param concurforce__Expense_Total_Account__r
     */
    public void setConcurforce__Expense_Total_Account__r(com.sforce.soap.enterprise.QueryResult concurforce__Expense_Total_Account__r) {
        this.concurforce__Expense_Total_Account__r = concurforce__Expense_Total_Account__r;
    }


    /**
     * Gets the concurforce__FinalExpenseTotal__c value for this Account.
     * 
     * @return concurforce__FinalExpenseTotal__c
     */
    public java.lang.Double getConcurforce__FinalExpenseTotal__c() {
        return concurforce__FinalExpenseTotal__c;
    }


    /**
     * Sets the concurforce__FinalExpenseTotal__c value for this Account.
     * 
     * @param concurforce__FinalExpenseTotal__c
     */
    public void setConcurforce__FinalExpenseTotal__c(java.lang.Double concurforce__FinalExpenseTotal__c) {
        this.concurforce__FinalExpenseTotal__c = concurforce__FinalExpenseTotal__c;
    }


    /**
     * Gets the contacts value for this Account.
     * 
     * @return contacts
     */
    public com.sforce.soap.enterprise.QueryResult getContacts() {
        return contacts;
    }


    /**
     * Sets the contacts value for this Account.
     * 
     * @param contacts
     */
    public void setContacts(com.sforce.soap.enterprise.QueryResult contacts) {
        this.contacts = contacts;
    }


    /**
     * Gets the content__r value for this Account.
     * 
     * @return content__r
     */
    public com.sforce.soap.enterprise.QueryResult getContent__r() {
        return content__r;
    }


    /**
     * Sets the content__r value for this Account.
     * 
     * @param content__r
     */
    public void setContent__r(com.sforce.soap.enterprise.QueryResult content__r) {
        this.content__r = content__r;
    }


    /**
     * Gets the contracts value for this Account.
     * 
     * @return contracts
     */
    public com.sforce.soap.enterprise.QueryResult getContracts() {
        return contracts;
    }


    /**
     * Sets the contracts value for this Account.
     * 
     * @param contracts
     */
    public void setContracts(com.sforce.soap.enterprise.QueryResult contracts) {
        this.contracts = contracts;
    }


    /**
     * Gets the contracts__r value for this Account.
     * 
     * @return contracts__r
     */
    public com.sforce.soap.enterprise.QueryResult getContracts__r() {
        return contracts__r;
    }


    /**
     * Sets the contracts__r value for this Account.
     * 
     * @param contracts__r
     */
    public void setContracts__r(com.sforce.soap.enterprise.QueryResult contracts__r) {
        this.contracts__r = contracts__r;
    }


    /**
     * Gets the country__c value for this Account.
     * 
     * @return country__c
     */
    public java.lang.String getCountry__c() {
        return country__c;
    }


    /**
     * Sets the country__c value for this Account.
     * 
     * @param country__c
     */
    public void setCountry__c(java.lang.String country__c) {
        this.country__c = country__c;
    }


    /**
     * Gets the createdBy value for this Account.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Account.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Account.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Account.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Account.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Account.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the current_AMLAW_Ranking__c value for this Account.
     * 
     * @return current_AMLAW_Ranking__c
     */
    public java.lang.Double getCurrent_AMLAW_Ranking__c() {
        return current_AMLAW_Ranking__c;
    }


    /**
     * Sets the current_AMLAW_Ranking__c value for this Account.
     * 
     * @param current_AMLAW_Ranking__c
     */
    public void setCurrent_AMLAW_Ranking__c(java.lang.Double current_AMLAW_Ranking__c) {
        this.current_AMLAW_Ranking__c = current_AMLAW_Ranking__c;
    }


    /**
     * Gets the date_Became_PHP__c value for this Account.
     * 
     * @return date_Became_PHP__c
     */
    public java.util.Date getDate_Became_PHP__c() {
        return date_Became_PHP__c;
    }


    /**
     * Sets the date_Became_PHP__c value for this Account.
     * 
     * @param date_Became_PHP__c
     */
    public void setDate_Became_PHP__c(java.util.Date date_Became_PHP__c) {
        this.date_Became_PHP__c = date_Became_PHP__c;
    }


    /**
     * Gets the db_SQL_Environment_Email__c value for this Account.
     * 
     * @return db_SQL_Environment_Email__c
     */
    public java.lang.Boolean getDb_SQL_Environment_Email__c() {
        return db_SQL_Environment_Email__c;
    }


    /**
     * Sets the db_SQL_Environment_Email__c value for this Account.
     * 
     * @param db_SQL_Environment_Email__c
     */
    public void setDb_SQL_Environment_Email__c(java.lang.Boolean db_SQL_Environment_Email__c) {
        this.db_SQL_Environment_Email__c = db_SQL_Environment_Email__c;
    }


    /**
     * Gets the demos1__r value for this Account.
     * 
     * @return demos1__r
     */
    public com.sforce.soap.enterprise.QueryResult getDemos1__r() {
        return demos1__r;
    }


    /**
     * Sets the demos1__r value for this Account.
     * 
     * @param demos1__r
     */
    public void setDemos1__r(com.sforce.soap.enterprise.QueryResult demos1__r) {
        this.demos1__r = demos1__r;
    }


    /**
     * Gets the demos__r value for this Account.
     * 
     * @return demos__r
     */
    public com.sforce.soap.enterprise.QueryResult getDemos__r() {
        return demos__r;
    }


    /**
     * Sets the demos__r value for this Account.
     * 
     * @param demos__r
     */
    public void setDemos__r(com.sforce.soap.enterprise.QueryResult demos__r) {
        this.demos__r = demos__r;
    }


    /**
     * Gets the description value for this Account.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Account.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the dunsNumber value for this Account.
     * 
     * @return dunsNumber
     */
    public java.lang.String getDunsNumber() {
        return dunsNumber;
    }


    /**
     * Sets the dunsNumber value for this Account.
     * 
     * @param dunsNumber
     */
    public void setDunsNumber(java.lang.String dunsNumber) {
        this.dunsNumber = dunsNumber;
    }


    /**
     * Gets the evaluation_Type__c value for this Account.
     * 
     * @return evaluation_Type__c
     */
    public java.lang.String getEvaluation_Type__c() {
        return evaluation_Type__c;
    }


    /**
     * Sets the evaluation_Type__c value for this Account.
     * 
     * @param evaluation_Type__c
     */
    public void setEvaluation_Type__c(java.lang.String evaluation_Type__c) {
        this.evaluation_Type__c = evaluation_Type__c;
    }


    /**
     * Gets the events value for this Account.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Account.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the FTP_Login__c value for this Account.
     * 
     * @return FTP_Login__c
     */
    public java.lang.String getFTP_Login__c() {
        return FTP_Login__c;
    }


    /**
     * Sets the FTP_Login__c value for this Account.
     * 
     * @param FTP_Login__c
     */
    public void setFTP_Login__c(java.lang.String FTP_Login__c) {
        this.FTP_Login__c = FTP_Login__c;
    }


    /**
     * Gets the FTP_Password__c value for this Account.
     * 
     * @return FTP_Password__c
     */
    public java.lang.String getFTP_Password__c() {
        return FTP_Password__c;
    }


    /**
     * Sets the FTP_Password__c value for this Account.
     * 
     * @param FTP_Password__c
     */
    public void setFTP_Password__c(java.lang.String FTP_Password__c) {
        this.FTP_Password__c = FTP_Password__c;
    }


    /**
     * Gets the FTP_Preferred__c value for this Account.
     * 
     * @return FTP_Preferred__c
     */
    public java.lang.Boolean getFTP_Preferred__c() {
        return FTP_Preferred__c;
    }


    /**
     * Sets the FTP_Preferred__c value for this Account.
     * 
     * @param FTP_Preferred__c
     */
    public void setFTP_Preferred__c(java.lang.Boolean FTP_Preferred__c) {
        this.FTP_Preferred__c = FTP_Preferred__c;
    }


    /**
     * Gets the fax value for this Account.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this Account.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Account.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Account.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the feeds value for this Account.
     * 
     * @return feeds
     */
    public com.sforce.soap.enterprise.QueryResult getFeeds() {
        return feeds;
    }


    /**
     * Sets the feeds value for this Account.
     * 
     * @param feeds
     */
    public void setFeeds(com.sforce.soap.enterprise.QueryResult feeds) {
        this.feeds = feeds;
    }


    /**
     * Gets the fortune_Ranking__c value for this Account.
     * 
     * @return fortune_Ranking__c
     */
    public java.lang.Double getFortune_Ranking__c() {
        return fortune_Ranking__c;
    }


    /**
     * Sets the fortune_Ranking__c value for this Account.
     * 
     * @param fortune_Ranking__c
     */
    public void setFortune_Ranking__c(java.lang.Double fortune_Ranking__c) {
        this.fortune_Ranking__c = fortune_Ranking__c;
    }


    /**
     * Gets the functional_Trial__c value for this Account.
     * 
     * @return functional_Trial__c
     */
    public java.lang.Double getFunctional_Trial__c() {
        return functional_Trial__c;
    }


    /**
     * Sets the functional_Trial__c value for this Account.
     * 
     * @param functional_Trial__c
     */
    public void setFunctional_Trial__c(java.lang.Double functional_Trial__c) {
        this.functional_Trial__c = functional_Trial__c;
    }


    /**
     * Gets the global_Account__c value for this Account.
     * 
     * @return global_Account__c
     */
    public java.lang.String getGlobal_Account__c() {
        return global_Account__c;
    }


    /**
     * Sets the global_Account__c value for this Account.
     * 
     * @param global_Account__c
     */
    public void setGlobal_Account__c(java.lang.String global_Account__c) {
        this.global_Account__c = global_Account__c;
    }


    /**
     * Gets the has_Custom_Solution__c value for this Account.
     * 
     * @return has_Custom_Solution__c
     */
    public java.lang.String getHas_Custom_Solution__c() {
        return has_Custom_Solution__c;
    }


    /**
     * Sets the has_Custom_Solution__c value for this Account.
     * 
     * @param has_Custom_Solution__c
     */
    public void setHas_Custom_Solution__c(java.lang.String has_Custom_Solution__c) {
        this.has_Custom_Solution__c = has_Custom_Solution__c;
    }


    /**
     * Gets the has_Non_Licensing_DLLs__c value for this Account.
     * 
     * @return has_Non_Licensing_DLLs__c
     */
    public java.lang.Boolean getHas_Non_Licensing_DLLs__c() {
        return has_Non_Licensing_DLLs__c;
    }


    /**
     * Sets the has_Non_Licensing_DLLs__c value for this Account.
     * 
     * @param has_Non_Licensing_DLLs__c
     */
    public void setHas_Non_Licensing_DLLs__c(java.lang.Boolean has_Non_Licensing_DLLs__c) {
        this.has_Non_Licensing_DLLs__c = has_Non_Licensing_DLLs__c;
    }


    /**
     * Gets the has_Test_Instance__c value for this Account.
     * 
     * @return has_Test_Instance__c
     */
    public java.lang.Boolean getHas_Test_Instance__c() {
        return has_Test_Instance__c;
    }


    /**
     * Sets the has_Test_Instance__c value for this Account.
     * 
     * @param has_Test_Instance__c
     */
    public void setHas_Test_Instance__c(java.lang.Boolean has_Test_Instance__c) {
        this.has_Test_Instance__c = has_Test_Instance__c;
    }


    /**
     * Gets the have_Client_Logo__c value for this Account.
     * 
     * @return have_Client_Logo__c
     */
    public java.lang.String getHave_Client_Logo__c() {
        return have_Client_Logo__c;
    }


    /**
     * Sets the have_Client_Logo__c value for this Account.
     * 
     * @param have_Client_Logo__c
     */
    public void setHave_Client_Logo__c(java.lang.String have_Client_Logo__c) {
        this.have_Client_Logo__c = have_Client_Logo__c;
    }


    /**
     * Gets the have_Client_Testimonial__c value for this Account.
     * 
     * @return have_Client_Testimonial__c
     */
    public java.lang.String getHave_Client_Testimonial__c() {
        return have_Client_Testimonial__c;
    }


    /**
     * Sets the have_Client_Testimonial__c value for this Account.
     * 
     * @param have_Client_Testimonial__c
     */
    public void setHave_Client_Testimonial__c(java.lang.String have_Client_Testimonial__c) {
        this.have_Client_Testimonial__c = have_Client_Testimonial__c;
    }


    /**
     * Gets the histories value for this Account.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Account.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the ideas_Site_Setups__r value for this Account.
     * 
     * @return ideas_Site_Setups__r
     */
    public com.sforce.soap.enterprise.QueryResult getIdeas_Site_Setups__r() {
        return ideas_Site_Setups__r;
    }


    /**
     * Sets the ideas_Site_Setups__r value for this Account.
     * 
     * @param ideas_Site_Setups__r
     */
    public void setIdeas_Site_Setups__r(com.sforce.soap.enterprise.QueryResult ideas_Site_Setups__r) {
        this.ideas_Site_Setups__r = ideas_Site_Setups__r;
    }


    /**
     * Gets the industry__c value for this Account.
     * 
     * @return industry__c
     */
    public java.lang.String getIndustry__c() {
        return industry__c;
    }


    /**
     * Sets the industry__c value for this Account.
     * 
     * @param industry__c
     */
    public void setIndustry__c(java.lang.String industry__c) {
        this.industry__c = industry__c;
    }


    /**
     * Gets the industry__r value for this Account.
     * 
     * @return industry__r
     */
    public com.sforce.soap.enterprise.sobject.Industry__c getIndustry__r() {
        return industry__r;
    }


    /**
     * Sets the industry__r value for this Account.
     * 
     * @param industry__r
     */
    public void setIndustry__r(com.sforce.soap.enterprise.sobject.Industry__c industry__r) {
        this.industry__r = industry__r;
    }


    /**
     * Gets the instances__r value for this Account.
     * 
     * @return instances__r
     */
    public com.sforce.soap.enterprise.QueryResult getInstances__r() {
        return instances__r;
    }


    /**
     * Sets the instances__r value for this Account.
     * 
     * @param instances__r
     */
    public void setInstances__r(com.sforce.soap.enterprise.QueryResult instances__r) {
        this.instances__r = instances__r;
    }


    /**
     * Gets the integration_Notes__c value for this Account.
     * 
     * @return integration_Notes__c
     */
    public java.lang.String getIntegration_Notes__c() {
        return integration_Notes__c;
    }


    /**
     * Sets the integration_Notes__c value for this Account.
     * 
     * @param integration_Notes__c
     */
    public void setIntegration_Notes__c(java.lang.String integration_Notes__c) {
        this.integration_Notes__c = integration_Notes__c;
    }


    /**
     * Gets the international_Client__c value for this Account.
     * 
     * @return international_Client__c
     */
    public java.lang.Boolean getInternational_Client__c() {
        return international_Client__c;
    }


    /**
     * Sets the international_Client__c value for this Account.
     * 
     * @param international_Client__c
     */
    public void setInternational_Client__c(java.lang.Boolean international_Client__c) {
        this.international_Client__c = international_Client__c;
    }


    /**
     * Gets the isCustomerPortal value for this Account.
     * 
     * @return isCustomerPortal
     */
    public java.lang.Boolean getIsCustomerPortal() {
        return isCustomerPortal;
    }


    /**
     * Sets the isCustomerPortal value for this Account.
     * 
     * @param isCustomerPortal
     */
    public void setIsCustomerPortal(java.lang.Boolean isCustomerPortal) {
        this.isCustomerPortal = isCustomerPortal;
    }


    /**
     * Gets the isDeleted value for this Account.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Account.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the jigsaw value for this Account.
     * 
     * @return jigsaw
     */
    public java.lang.String getJigsaw() {
        return jigsaw;
    }


    /**
     * Sets the jigsaw value for this Account.
     * 
     * @param jigsaw
     */
    public void setJigsaw(java.lang.String jigsaw) {
        this.jigsaw = jigsaw;
    }


    /**
     * Gets the jigsawCompanyId value for this Account.
     * 
     * @return jigsawCompanyId
     */
    public java.lang.String getJigsawCompanyId() {
        return jigsawCompanyId;
    }


    /**
     * Sets the jigsawCompanyId value for this Account.
     * 
     * @param jigsawCompanyId
     */
    public void setJigsawCompanyId(java.lang.String jigsawCompanyId) {
        this.jigsawCompanyId = jigsawCompanyId;
    }


    /**
     * Gets the lastActivityDate value for this Account.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Account.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this Account.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Account.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Account.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Account.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Account.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Account.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the legal_Entity__c value for this Account.
     * 
     * @return legal_Entity__c
     */
    public java.lang.String getLegal_Entity__c() {
        return legal_Entity__c;
    }


    /**
     * Sets the legal_Entity__c value for this Account.
     * 
     * @param legal_Entity__c
     */
    public void setLegal_Entity__c(java.lang.String legal_Entity__c) {
        this.legal_Entity__c = legal_Entity__c;
    }


    /**
     * Gets the logo_Testimonial_Trackings__r value for this Account.
     * 
     * @return logo_Testimonial_Trackings__r
     */
    public com.sforce.soap.enterprise.QueryResult getLogo_Testimonial_Trackings__r() {
        return logo_Testimonial_Trackings__r;
    }


    /**
     * Sets the logo_Testimonial_Trackings__r value for this Account.
     * 
     * @param logo_Testimonial_Trackings__r
     */
    public void setLogo_Testimonial_Trackings__r(com.sforce.soap.enterprise.QueryResult logo_Testimonial_Trackings__r) {
        this.logo_Testimonial_Trackings__r = logo_Testimonial_Trackings__r;
    }


    /**
     * Gets the masterRecord value for this Account.
     * 
     * @return masterRecord
     */
    public com.sforce.soap.enterprise.sobject.Account getMasterRecord() {
        return masterRecord;
    }


    /**
     * Sets the masterRecord value for this Account.
     * 
     * @param masterRecord
     */
    public void setMasterRecord(com.sforce.soap.enterprise.sobject.Account masterRecord) {
        this.masterRecord = masterRecord;
    }


    /**
     * Gets the masterRecordId value for this Account.
     * 
     * @return masterRecordId
     */
    public java.lang.String getMasterRecordId() {
        return masterRecordId;
    }


    /**
     * Sets the masterRecordId value for this Account.
     * 
     * @param masterRecordId
     */
    public void setMasterRecordId(java.lang.String masterRecordId) {
        this.masterRecordId = masterRecordId;
    }


    /**
     * Gets the meetings__r value for this Account.
     * 
     * @return meetings__r
     */
    public com.sforce.soap.enterprise.QueryResult getMeetings__r() {
        return meetings__r;
    }


    /**
     * Sets the meetings__r value for this Account.
     * 
     * @param meetings__r
     */
    public void setMeetings__r(com.sforce.soap.enterprise.QueryResult meetings__r) {
        this.meetings__r = meetings__r;
    }


    /**
     * Gets the naicsCode value for this Account.
     * 
     * @return naicsCode
     */
    public java.lang.String getNaicsCode() {
        return naicsCode;
    }


    /**
     * Sets the naicsCode value for this Account.
     * 
     * @param naicsCode
     */
    public void setNaicsCode(java.lang.String naicsCode) {
        this.naicsCode = naicsCode;
    }


    /**
     * Gets the naicsDesc value for this Account.
     * 
     * @return naicsDesc
     */
    public java.lang.String getNaicsDesc() {
        return naicsDesc;
    }


    /**
     * Sets the naicsDesc value for this Account.
     * 
     * @param naicsDesc
     */
    public void setNaicsDesc(java.lang.String naicsDesc) {
        this.naicsDesc = naicsDesc;
    }


    /**
     * Gets the name value for this Account.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Account.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Account.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Account.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Account.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Account.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the notes__c value for this Account.
     * 
     * @return notes__c
     */
    public java.lang.String getNotes__c() {
        return notes__c;
    }


    /**
     * Sets the notes__c value for this Account.
     * 
     * @param notes__c
     */
    public void setNotes__c(java.lang.String notes__c) {
        this.notes__c = notes__c;
    }


    /**
     * Gets the number_Count__c value for this Account.
     * 
     * @return number_Count__c
     */
    public java.lang.Double getNumber_Count__c() {
        return number_Count__c;
    }


    /**
     * Sets the number_Count__c value for this Account.
     * 
     * @param number_Count__c
     */
    public void setNumber_Count__c(java.lang.Double number_Count__c) {
        this.number_Count__c = number_Count__c;
    }


    /**
     * Gets the number_of_Pilot_Opportunites__c value for this Account.
     * 
     * @return number_of_Pilot_Opportunites__c
     */
    public java.lang.Double getNumber_of_Pilot_Opportunites__c() {
        return number_of_Pilot_Opportunites__c;
    }


    /**
     * Sets the number_of_Pilot_Opportunites__c value for this Account.
     * 
     * @param number_of_Pilot_Opportunites__c
     */
    public void setNumber_of_Pilot_Opportunites__c(java.lang.Double number_of_Pilot_Opportunites__c) {
        this.number_of_Pilot_Opportunites__c = number_of_Pilot_Opportunites__c;
    }


    /**
     * Gets the openActivities value for this Account.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this Account.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the opportunities value for this Account.
     * 
     * @return opportunities
     */
    public com.sforce.soap.enterprise.QueryResult getOpportunities() {
        return opportunities;
    }


    /**
     * Sets the opportunities value for this Account.
     * 
     * @param opportunities
     */
    public void setOpportunities(com.sforce.soap.enterprise.QueryResult opportunities) {
        this.opportunities = opportunities;
    }


    /**
     * Gets the opportunityPartnersTo value for this Account.
     * 
     * @return opportunityPartnersTo
     */
    public com.sforce.soap.enterprise.QueryResult getOpportunityPartnersTo() {
        return opportunityPartnersTo;
    }


    /**
     * Sets the opportunityPartnersTo value for this Account.
     * 
     * @param opportunityPartnersTo
     */
    public void setOpportunityPartnersTo(com.sforce.soap.enterprise.QueryResult opportunityPartnersTo) {
        this.opportunityPartnersTo = opportunityPartnersTo;
    }


    /**
     * Gets the opportunity_AM_Law_Ranking__c value for this Account.
     * 
     * @return opportunity_AM_Law_Ranking__c
     */
    public java.lang.Double getOpportunity_AM_Law_Ranking__c() {
        return opportunity_AM_Law_Ranking__c;
    }


    /**
     * Sets the opportunity_AM_Law_Ranking__c value for this Account.
     * 
     * @param opportunity_AM_Law_Ranking__c
     */
    public void setOpportunity_AM_Law_Ranking__c(java.lang.Double opportunity_AM_Law_Ranking__c) {
        this.opportunity_AM_Law_Ranking__c = opportunity_AM_Law_Ranking__c;
    }


    /**
     * Gets the opportunity__r value for this Account.
     * 
     * @return opportunity__r
     */
    public com.sforce.soap.enterprise.QueryResult getOpportunity__r() {
        return opportunity__r;
    }


    /**
     * Sets the opportunity__r value for this Account.
     * 
     * @param opportunity__r
     */
    public void setOpportunity__r(com.sforce.soap.enterprise.QueryResult opportunity__r) {
        this.opportunity__r = opportunity__r;
    }


    /**
     * Gets the owner value for this Account.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.User getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Account.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.User owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Account.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Account.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the POC_s__c value for this Account.
     * 
     * @return POC_s__c
     */
    public java.lang.String getPOC_s__c() {
        return POC_s__c;
    }


    /**
     * Sets the POC_s__c value for this Account.
     * 
     * @param POC_s__c
     */
    public void setPOC_s__c(java.lang.String POC_s__c) {
        this.POC_s__c = POC_s__c;
    }


    /**
     * Gets the parent value for this Account.
     * 
     * @return parent
     */
    public com.sforce.soap.enterprise.sobject.Account getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this Account.
     * 
     * @param parent
     */
    public void setParent(com.sforce.soap.enterprise.sobject.Account parent) {
        this.parent = parent;
    }


    /**
     * Gets the parentId value for this Account.
     * 
     * @return parentId
     */
    public java.lang.String getParentId() {
        return parentId;
    }


    /**
     * Sets the parentId value for this Account.
     * 
     * @param parentId
     */
    public void setParentId(java.lang.String parentId) {
        this.parentId = parentId;
    }


    /**
     * Gets the partnersFrom value for this Account.
     * 
     * @return partnersFrom
     */
    public com.sforce.soap.enterprise.QueryResult getPartnersFrom() {
        return partnersFrom;
    }


    /**
     * Sets the partnersFrom value for this Account.
     * 
     * @param partnersFrom
     */
    public void setPartnersFrom(com.sforce.soap.enterprise.QueryResult partnersFrom) {
        this.partnersFrom = partnersFrom;
    }


    /**
     * Gets the partnersTo value for this Account.
     * 
     * @return partnersTo
     */
    public com.sforce.soap.enterprise.QueryResult getPartnersTo() {
        return partnersTo;
    }


    /**
     * Sets the partnersTo value for this Account.
     * 
     * @param partnersTo
     */
    public void setPartnersTo(com.sforce.soap.enterprise.QueryResult partnersTo) {
        this.partnersTo = partnersTo;
    }


    /**
     * Gets the phone value for this Account.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this Account.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the pilot__c value for this Account.
     * 
     * @return pilot__c
     */
    public java.lang.Double getPilot__c() {
        return pilot__c;
    }


    /**
     * Sets the pilot__c value for this Account.
     * 
     * @param pilot__c
     */
    public void setPilot__c(java.lang.Double pilot__c) {
        this.pilot__c = pilot__c;
    }


    /**
     * Gets the pod_Extension__c value for this Account.
     * 
     * @return pod_Extension__c
     */
    public java.lang.String getPod_Extension__c() {
        return pod_Extension__c;
    }


    /**
     * Sets the pod_Extension__c value for this Account.
     * 
     * @param pod_Extension__c
     */
    public void setPod_Extension__c(java.lang.String pod_Extension__c) {
        this.pod_Extension__c = pod_Extension__c;
    }


    /**
     * Gets the pod__c value for this Account.
     * 
     * @return pod__c
     */
    public java.lang.String getPod__c() {
        return pod__c;
    }


    /**
     * Sets the pod__c value for this Account.
     * 
     * @param pod__c
     */
    public void setPod__c(java.lang.String pod__c) {
        this.pod__c = pod__c;
    }


    /**
     * Gets the primary_Contact_Email_Address__c value for this Account.
     * 
     * @return primary_Contact_Email_Address__c
     */
    public java.lang.String getPrimary_Contact_Email_Address__c() {
        return primary_Contact_Email_Address__c;
    }


    /**
     * Sets the primary_Contact_Email_Address__c value for this Account.
     * 
     * @param primary_Contact_Email_Address__c
     */
    public void setPrimary_Contact_Email_Address__c(java.lang.String primary_Contact_Email_Address__c) {
        this.primary_Contact_Email_Address__c = primary_Contact_Email_Address__c;
    }


    /**
     * Gets the primary_Contact__c value for this Account.
     * 
     * @return primary_Contact__c
     */
    public java.lang.String getPrimary_Contact__c() {
        return primary_Contact__c;
    }


    /**
     * Sets the primary_Contact__c value for this Account.
     * 
     * @param primary_Contact__c
     */
    public void setPrimary_Contact__c(java.lang.String primary_Contact__c) {
        this.primary_Contact__c = primary_Contact__c;
    }


    /**
     * Gets the primary_Contact__r value for this Account.
     * 
     * @return primary_Contact__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getPrimary_Contact__r() {
        return primary_Contact__r;
    }


    /**
     * Sets the primary_Contact__r value for this Account.
     * 
     * @param primary_Contact__r
     */
    public void setPrimary_Contact__r(com.sforce.soap.enterprise.sobject.Contact primary_Contact__r) {
        this.primary_Contact__r = primary_Contact__r;
    }


    /**
     * Gets the primary_Instance_Go_Live__c value for this Account.
     * 
     * @return primary_Instance_Go_Live__c
     */
    public java.util.Date getPrimary_Instance_Go_Live__c() {
        return primary_Instance_Go_Live__c;
    }


    /**
     * Sets the primary_Instance_Go_Live__c value for this Account.
     * 
     * @param primary_Instance_Go_Live__c
     */
    public void setPrimary_Instance_Go_Live__c(java.util.Date primary_Instance_Go_Live__c) {
        this.primary_Instance_Go_Live__c = primary_Instance_Go_Live__c;
    }


    /**
     * Gets the primary_Instance_Version1__c value for this Account.
     * 
     * @return primary_Instance_Version1__c
     */
    public java.lang.String getPrimary_Instance_Version1__c() {
        return primary_Instance_Version1__c;
    }


    /**
     * Sets the primary_Instance_Version1__c value for this Account.
     * 
     * @param primary_Instance_Version1__c
     */
    public void setPrimary_Instance_Version1__c(java.lang.String primary_Instance_Version1__c) {
        this.primary_Instance_Version1__c = primary_Instance_Version1__c;
    }


    /**
     * Gets the primary_Instance__c value for this Account.
     * 
     * @return primary_Instance__c
     */
    public java.lang.String getPrimary_Instance__c() {
        return primary_Instance__c;
    }


    /**
     * Sets the primary_Instance__c value for this Account.
     * 
     * @param primary_Instance__c
     */
    public void setPrimary_Instance__c(java.lang.String primary_Instance__c) {
        this.primary_Instance__c = primary_Instance__c;
    }


    /**
     * Gets the primary_Instance__r value for this Account.
     * 
     * @return primary_Instance__r
     */
    public com.sforce.soap.enterprise.sobject.Instance__c getPrimary_Instance__r() {
        return primary_Instance__r;
    }


    /**
     * Sets the primary_Instance__r value for this Account.
     * 
     * @param primary_Instance__r
     */
    public void setPrimary_Instance__r(com.sforce.soap.enterprise.sobject.Instance__c primary_Instance__r) {
        this.primary_Instance__r = primary_Instance__r;
    }


    /**
     * Gets the primary_Marketing_Contact_Email__c value for this Account.
     * 
     * @return primary_Marketing_Contact_Email__c
     */
    public java.lang.String getPrimary_Marketing_Contact_Email__c() {
        return primary_Marketing_Contact_Email__c;
    }


    /**
     * Sets the primary_Marketing_Contact_Email__c value for this Account.
     * 
     * @param primary_Marketing_Contact_Email__c
     */
    public void setPrimary_Marketing_Contact_Email__c(java.lang.String primary_Marketing_Contact_Email__c) {
        this.primary_Marketing_Contact_Email__c = primary_Marketing_Contact_Email__c;
    }


    /**
     * Gets the primary_Marketing_Contact__c value for this Account.
     * 
     * @return primary_Marketing_Contact__c
     */
    public java.lang.String getPrimary_Marketing_Contact__c() {
        return primary_Marketing_Contact__c;
    }


    /**
     * Sets the primary_Marketing_Contact__c value for this Account.
     * 
     * @param primary_Marketing_Contact__c
     */
    public void setPrimary_Marketing_Contact__c(java.lang.String primary_Marketing_Contact__c) {
        this.primary_Marketing_Contact__c = primary_Marketing_Contact__c;
    }


    /**
     * Gets the primary_Marketing_Contact__r value for this Account.
     * 
     * @return primary_Marketing_Contact__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getPrimary_Marketing_Contact__r() {
        return primary_Marketing_Contact__r;
    }


    /**
     * Sets the primary_Marketing_Contact__r value for this Account.
     * 
     * @param primary_Marketing_Contact__r
     */
    public void setPrimary_Marketing_Contact__r(com.sforce.soap.enterprise.sobject.Contact primary_Marketing_Contact__r) {
        this.primary_Marketing_Contact__r = primary_Marketing_Contact__r;
    }


    /**
     * Gets the primary_Relativity_Version__c value for this Account.
     * 
     * @return primary_Relativity_Version__c
     */
    public java.lang.String getPrimary_Relativity_Version__c() {
        return primary_Relativity_Version__c;
    }


    /**
     * Sets the primary_Relativity_Version__c value for this Account.
     * 
     * @param primary_Relativity_Version__c
     */
    public void setPrimary_Relativity_Version__c(java.lang.String primary_Relativity_Version__c) {
        this.primary_Relativity_Version__c = primary_Relativity_Version__c;
    }


    /**
     * Gets the processInstances value for this Account.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Account.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Account.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Account.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the product_Name__c value for this Account.
     * 
     * @return product_Name__c
     */
    public java.lang.String getProduct_Name__c() {
        return product_Name__c;
    }


    /**
     * Sets the product_Name__c value for this Account.
     * 
     * @param product_Name__c
     */
    public void setProduct_Name__c(java.lang.String product_Name__c) {
        this.product_Name__c = product_Name__c;
    }


    /**
     * Gets the purchase_Orders__r value for this Account.
     * 
     * @return purchase_Orders__r
     */
    public com.sforce.soap.enterprise.QueryResult getPurchase_Orders__r() {
        return purchase_Orders__r;
    }


    /**
     * Sets the purchase_Orders__r value for this Account.
     * 
     * @param purchase_Orders__r
     */
    public void setPurchase_Orders__r(com.sforce.soap.enterprise.QueryResult purchase_Orders__r) {
        this.purchase_Orders__r = purchase_Orders__r;
    }


    /**
     * Gets the RAR_DLs__r value for this Account.
     * 
     * @return RAR_DLs__r
     */
    public com.sforce.soap.enterprise.QueryResult getRAR_DLs__r() {
        return RAR_DLs__r;
    }


    /**
     * Sets the RAR_DLs__r value for this Account.
     * 
     * @param RAR_DLs__r
     */
    public void setRAR_DLs__r(com.sforce.soap.enterprise.QueryResult RAR_DLs__r) {
        this.RAR_DLs__r = RAR_DLs__r;
    }


    /**
     * Gets the RA_Monthly_Usages__r value for this Account.
     * 
     * @return RA_Monthly_Usages__r
     */
    public com.sforce.soap.enterprise.QueryResult getRA_Monthly_Usages__r() {
        return RA_Monthly_Usages__r;
    }


    /**
     * Sets the RA_Monthly_Usages__r value for this Account.
     * 
     * @param RA_Monthly_Usages__r
     */
    public void setRA_Monthly_Usages__r(com.sforce.soap.enterprise.QueryResult RA_Monthly_Usages__r) {
        this.RA_Monthly_Usages__r = RA_Monthly_Usages__r;
    }


    /**
     * Gets the RA_Rollups__r value for this Account.
     * 
     * @return RA_Rollups__r
     */
    public com.sforce.soap.enterprise.QueryResult getRA_Rollups__r() {
        return RA_Rollups__r;
    }


    /**
     * Sets the RA_Rollups__r value for this Account.
     * 
     * @param RA_Rollups__r
     */
    public void setRA_Rollups__r(com.sforce.soap.enterprise.QueryResult RA_Rollups__r) {
        this.RA_Rollups__r = RA_Rollups__r;
    }


    /**
     * Gets the region__c value for this Account.
     * 
     * @return region__c
     */
    public java.lang.String getRegion__c() {
        return region__c;
    }


    /**
     * Sets the region__c value for this Account.
     * 
     * @param region__c
     */
    public void setRegion__c(java.lang.String region__c) {
        this.region__c = region__c;
    }


    /**
     * Gets the related_Instances__c value for this Account.
     * 
     * @return related_Instances__c
     */
    public java.lang.Double getRelated_Instances__c() {
        return related_Instances__c;
    }


    /**
     * Sets the related_Instances__c value for this Account.
     * 
     * @param related_Instances__c
     */
    public void setRelated_Instances__c(java.lang.Double related_Instances__c) {
        this.related_Instances__c = related_Instances__c;
    }


    /**
     * Gets the relativity_URL__c value for this Account.
     * 
     * @return relativity_URL__c
     */
    public java.lang.String getRelativity_URL__c() {
        return relativity_URL__c;
    }


    /**
     * Sets the relativity_URL__c value for this Account.
     * 
     * @param relativity_URL__c
     */
    public void setRelativity_URL__c(java.lang.String relativity_URL__c) {
        this.relativity_URL__c = relativity_URL__c;
    }


    /**
     * Gets the relativity_Version__c value for this Account.
     * 
     * @return relativity_Version__c
     */
    public java.lang.String getRelativity_Version__c() {
        return relativity_Version__c;
    }


    /**
     * Sets the relativity_Version__c value for this Account.
     * 
     * @param relativity_Version__c
     */
    public void setRelativity_Version__c(java.lang.String relativity_Version__c) {
        this.relativity_Version__c = relativity_Version__c;
    }


    /**
     * Gets the relativity_Version__r value for this Account.
     * 
     * @return relativity_Version__r
     */
    public com.sforce.soap.enterprise.sobject.Release__c getRelativity_Version__r() {
        return relativity_Version__r;
    }


    /**
     * Sets the relativity_Version__r value for this Account.
     * 
     * @param relativity_Version__r
     */
    public void setRelativity_Version__r(com.sforce.soap.enterprise.sobject.Release__c relativity_Version__r) {
        this.relativity_Version__r = relativity_Version__r;
    }


    /**
     * Gets the reseller_Opportunities__r value for this Account.
     * 
     * @return reseller_Opportunities__r
     */
    public com.sforce.soap.enterprise.QueryResult getReseller_Opportunities__r() {
        return reseller_Opportunities__r;
    }


    /**
     * Sets the reseller_Opportunities__r value for this Account.
     * 
     * @param reseller_Opportunities__r
     */
    public void setReseller_Opportunities__r(com.sforce.soap.enterprise.QueryResult reseller_Opportunities__r) {
        this.reseller_Opportunities__r = reseller_Opportunities__r;
    }


    /**
     * Gets the reseller_Partner__c value for this Account.
     * 
     * @return reseller_Partner__c
     */
    public java.lang.Boolean getReseller_Partner__c() {
        return reseller_Partner__c;
    }


    /**
     * Sets the reseller_Partner__c value for this Account.
     * 
     * @param reseller_Partner__c
     */
    public void setReseller_Partner__c(java.lang.Boolean reseller_Partner__c) {
        this.reseller_Partner__c = reseller_Partner__c;
    }


    /**
     * Gets the reseller_Tier__c value for this Account.
     * 
     * @return reseller_Tier__c
     */
    public java.lang.String getReseller_Tier__c() {
        return reseller_Tier__c;
    }


    /**
     * Sets the reseller_Tier__c value for this Account.
     * 
     * @param reseller_Tier__c
     */
    public void setReseller_Tier__c(java.lang.String reseller_Tier__c) {
        this.reseller_Tier__c = reseller_Tier__c;
    }


    /**
     * Gets the sales_Contact_Email__c value for this Account.
     * 
     * @return sales_Contact_Email__c
     */
    public java.lang.String getSales_Contact_Email__c() {
        return sales_Contact_Email__c;
    }


    /**
     * Sets the sales_Contact_Email__c value for this Account.
     * 
     * @param sales_Contact_Email__c
     */
    public void setSales_Contact_Email__c(java.lang.String sales_Contact_Email__c) {
        this.sales_Contact_Email__c = sales_Contact_Email__c;
    }


    /**
     * Gets the sales_Contact__c value for this Account.
     * 
     * @return sales_Contact__c
     */
    public java.lang.String getSales_Contact__c() {
        return sales_Contact__c;
    }


    /**
     * Sets the sales_Contact__c value for this Account.
     * 
     * @param sales_Contact__c
     */
    public void setSales_Contact__c(java.lang.String sales_Contact__c) {
        this.sales_Contact__c = sales_Contact__c;
    }


    /**
     * Gets the sales_Distribution_List__c value for this Account.
     * 
     * @return sales_Distribution_List__c
     */
    public java.lang.Boolean getSales_Distribution_List__c() {
        return sales_Distribution_List__c;
    }


    /**
     * Sets the sales_Distribution_List__c value for this Account.
     * 
     * @param sales_Distribution_List__c
     */
    public void setSales_Distribution_List__c(java.lang.Boolean sales_Distribution_List__c) {
        this.sales_Distribution_List__c = sales_Distribution_List__c;
    }


    /**
     * Gets the sales_Support_Login__c value for this Account.
     * 
     * @return sales_Support_Login__c
     */
    public java.lang.String getSales_Support_Login__c() {
        return sales_Support_Login__c;
    }


    /**
     * Sets the sales_Support_Login__c value for this Account.
     * 
     * @param sales_Support_Login__c
     */
    public void setSales_Support_Login__c(java.lang.String sales_Support_Login__c) {
        this.sales_Support_Login__c = sales_Support_Login__c;
    }


    /**
     * Gets the sales_Support_Password__c value for this Account.
     * 
     * @return sales_Support_Password__c
     */
    public java.lang.String getSales_Support_Password__c() {
        return sales_Support_Password__c;
    }


    /**
     * Sets the sales_Support_Password__c value for this Account.
     * 
     * @param sales_Support_Password__c
     */
    public void setSales_Support_Password__c(java.lang.String sales_Support_Password__c) {
        this.sales_Support_Password__c = sales_Support_Password__c;
    }


    /**
     * Gets the shares value for this Account.
     * 
     * @return shares
     */
    public com.sforce.soap.enterprise.QueryResult getShares() {
        return shares;
    }


    /**
     * Sets the shares value for this Account.
     * 
     * @param shares
     */
    public void setShares(com.sforce.soap.enterprise.QueryResult shares) {
        this.shares = shares;
    }


    /**
     * Gets the sicDesc value for this Account.
     * 
     * @return sicDesc
     */
    public java.lang.String getSicDesc() {
        return sicDesc;
    }


    /**
     * Sets the sicDesc value for this Account.
     * 
     * @param sicDesc
     */
    public void setSicDesc(java.lang.String sicDesc) {
        this.sicDesc = sicDesc;
    }


    /**
     * Gets the software_Solutions__c value for this Account.
     * 
     * @return software_Solutions__c
     */
    public java.lang.String getSoftware_Solutions__c() {
        return software_Solutions__c;
    }


    /**
     * Sets the software_Solutions__c value for this Account.
     * 
     * @param software_Solutions__c
     */
    public void setSoftware_Solutions__c(java.lang.String software_Solutions__c) {
        this.software_Solutions__c = software_Solutions__c;
    }


    /**
     * Gets the status_Meetings__r value for this Account.
     * 
     * @return status_Meetings__r
     */
    public com.sforce.soap.enterprise.QueryResult getStatus_Meetings__r() {
        return status_Meetings__r;
    }


    /**
     * Sets the status_Meetings__r value for this Account.
     * 
     * @param status_Meetings__r
     */
    public void setStatus_Meetings__r(com.sforce.soap.enterprise.QueryResult status_Meetings__r) {
        this.status_Meetings__r = status_Meetings__r;
    }


    /**
     * Gets the support_CC_Emails__c value for this Account.
     * 
     * @return support_CC_Emails__c
     */
    public java.lang.String getSupport_CC_Emails__c() {
        return support_CC_Emails__c;
    }


    /**
     * Sets the support_CC_Emails__c value for this Account.
     * 
     * @param support_CC_Emails__c
     */
    public void setSupport_CC_Emails__c(java.lang.String support_CC_Emails__c) {
        this.support_CC_Emails__c = support_CC_Emails__c;
    }


    /**
     * Gets the support_Contact_Email__c value for this Account.
     * 
     * @return support_Contact_Email__c
     */
    public java.lang.String getSupport_Contact_Email__c() {
        return support_Contact_Email__c;
    }


    /**
     * Sets the support_Contact_Email__c value for this Account.
     * 
     * @param support_Contact_Email__c
     */
    public void setSupport_Contact_Email__c(java.lang.String support_Contact_Email__c) {
        this.support_Contact_Email__c = support_Contact_Email__c;
    }


    /**
     * Gets the support_Contact__c value for this Account.
     * 
     * @return support_Contact__c
     */
    public java.lang.String getSupport_Contact__c() {
        return support_Contact__c;
    }


    /**
     * Sets the support_Contact__c value for this Account.
     * 
     * @param support_Contact__c
     */
    public void setSupport_Contact__c(java.lang.String support_Contact__c) {
        this.support_Contact__c = support_Contact__c;
    }


    /**
     * Gets the support_Distribution_List__c value for this Account.
     * 
     * @return support_Distribution_List__c
     */
    public java.lang.Boolean getSupport_Distribution_List__c() {
        return support_Distribution_List__c;
    }


    /**
     * Sets the support_Distribution_List__c value for this Account.
     * 
     * @param support_Distribution_List__c
     */
    public void setSupport_Distribution_List__c(java.lang.Boolean support_Distribution_List__c) {
        this.support_Distribution_List__c = support_Distribution_List__c;
    }


    /**
     * Gets the support_Hours__c value for this Account.
     * 
     * @return support_Hours__c
     */
    public java.lang.String getSupport_Hours__c() {
        return support_Hours__c;
    }


    /**
     * Sets the support_Hours__c value for this Account.
     * 
     * @param support_Hours__c
     */
    public void setSupport_Hours__c(java.lang.String support_Hours__c) {
        this.support_Hours__c = support_Hours__c;
    }


    /**
     * Gets the systemModstamp value for this Account.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Account.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this Account.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Account.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the tradestyle value for this Account.
     * 
     * @return tradestyle
     */
    public java.lang.String getTradestyle() {
        return tradestyle;
    }


    /**
     * Sets the tradestyle value for this Account.
     * 
     * @param tradestyle
     */
    public void setTradestyle(java.lang.String tradestyle) {
        this.tradestyle = tradestyle;
    }


    /**
     * Gets the trainings__r value for this Account.
     * 
     * @return trainings__r
     */
    public com.sforce.soap.enterprise.QueryResult getTrainings__r() {
        return trainings__r;
    }


    /**
     * Sets the trainings__r value for this Account.
     * 
     * @param trainings__r
     */
    public void setTrainings__r(com.sforce.soap.enterprise.QueryResult trainings__r) {
        this.trainings__r = trainings__r;
    }


    /**
     * Gets the transactions__r value for this Account.
     * 
     * @return transactions__r
     */
    public com.sforce.soap.enterprise.QueryResult getTransactions__r() {
        return transactions__r;
    }


    /**
     * Sets the transactions__r value for this Account.
     * 
     * @param transactions__r
     */
    public void setTransactions__r(com.sforce.soap.enterprise.QueryResult transactions__r) {
        this.transactions__r = transactions__r;
    }


    /**
     * Gets the type value for this Account.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Account.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the type_Analytic_Snapshot__c value for this Account.
     * 
     * @return type_Analytic_Snapshot__c
     */
    public java.lang.String getType_Analytic_Snapshot__c() {
        return type_Analytic_Snapshot__c;
    }


    /**
     * Sets the type_Analytic_Snapshot__c value for this Account.
     * 
     * @param type_Analytic_Snapshot__c
     */
    public void setType_Analytic_Snapshot__c(java.lang.String type_Analytic_Snapshot__c) {
        this.type_Analytic_Snapshot__c = type_Analytic_Snapshot__c;
    }


    /**
     * Gets the URL_of_CoBranded_Collateral__c value for this Account.
     * 
     * @return URL_of_CoBranded_Collateral__c
     */
    public java.lang.String getURL_of_CoBranded_Collateral__c() {
        return URL_of_CoBranded_Collateral__c;
    }


    /**
     * Sets the URL_of_CoBranded_Collateral__c value for this Account.
     * 
     * @param URL_of_CoBranded_Collateral__c
     */
    public void setURL_of_CoBranded_Collateral__c(java.lang.String URL_of_CoBranded_Collateral__c) {
        this.URL_of_CoBranded_Collateral__c = URL_of_CoBranded_Collateral__c;
    }


    /**
     * Gets the unique_Users__r value for this Account.
     * 
     * @return unique_Users__r
     */
    public com.sforce.soap.enterprise.QueryResult getUnique_Users__r() {
        return unique_Users__r;
    }


    /**
     * Sets the unique_Users__r value for this Account.
     * 
     * @param unique_Users__r
     */
    public void setUnique_Users__r(com.sforce.soap.enterprise.QueryResult unique_Users__r) {
        this.unique_Users__r = unique_Users__r;
    }


    /**
     * Gets the user_License__c value for this Account.
     * 
     * @return user_License__c
     */
    public java.lang.String getUser_License__c() {
        return user_License__c;
    }


    /**
     * Sets the user_License__c value for this Account.
     * 
     * @param user_License__c
     */
    public void setUser_License__c(java.lang.String user_License__c) {
        this.user_License__c = user_License__c;
    }


    /**
     * Gets the VM_Instances__r value for this Account.
     * 
     * @return VM_Instances__r
     */
    public com.sforce.soap.enterprise.QueryResult getVM_Instances__r() {
        return VM_Instances__r;
    }


    /**
     * Sets the VM_Instances__r value for this Account.
     * 
     * @param VM_Instances__r
     */
    public void setVM_Instances__r(com.sforce.soap.enterprise.QueryResult VM_Instances__r) {
        this.VM_Instances__r = VM_Instances__r;
    }


    /**
     * Gets the verto_Beta_User__c value for this Account.
     * 
     * @return verto_Beta_User__c
     */
    public java.lang.Boolean getVerto_Beta_User__c() {
        return verto_Beta_User__c;
    }


    /**
     * Sets the verto_Beta_User__c value for this Account.
     * 
     * @param verto_Beta_User__c
     */
    public void setVerto_Beta_User__c(java.lang.Boolean verto_Beta_User__c) {
        this.verto_Beta_User__c = verto_Beta_User__c;
    }


    /**
     * Gets the website value for this Account.
     * 
     * @return website
     */
    public java.lang.String getWebsite() {
        return website;
    }


    /**
     * Sets the website value for this Account.
     * 
     * @param website
     */
    public void setWebsite(java.lang.String website) {
        this.website = website;
    }


    /**
     * Gets the won_and_Consulting__c value for this Account.
     * 
     * @return won_and_Consulting__c
     */
    public java.lang.Double getWon_and_Consulting__c() {
        return won_and_Consulting__c;
    }


    /**
     * Sets the won_and_Consulting__c value for this Account.
     * 
     * @param won_and_Consulting__c
     */
    public void setWon_and_Consulting__c(java.lang.Double won_and_Consulting__c) {
        this.won_and_Consulting__c = won_and_Consulting__c;
    }


    /**
     * Gets the won_and_Corporation__c value for this Account.
     * 
     * @return won_and_Corporation__c
     */
    public java.lang.Double getWon_and_Corporation__c() {
        return won_and_Corporation__c;
    }


    /**
     * Sets the won_and_Corporation__c value for this Account.
     * 
     * @param won_and_Corporation__c
     */
    public void setWon_and_Corporation__c(java.lang.Double won_and_Corporation__c) {
        this.won_and_Corporation__c = won_and_Corporation__c;
    }


    /**
     * Gets the won_and_Government__c value for this Account.
     * 
     * @return won_and_Government__c
     */
    public java.lang.Double getWon_and_Government__c() {
        return won_and_Government__c;
    }


    /**
     * Sets the won_and_Government__c value for this Account.
     * 
     * @param won_and_Government__c
     */
    public void setWon_and_Government__c(java.lang.Double won_and_Government__c) {
        this.won_and_Government__c = won_and_Government__c;
    }


    /**
     * Gets the won_and_ISV__c value for this Account.
     * 
     * @return won_and_ISV__c
     */
    public java.lang.Double getWon_and_ISV__c() {
        return won_and_ISV__c;
    }


    /**
     * Sets the won_and_ISV__c value for this Account.
     * 
     * @param won_and_ISV__c
     */
    public void setWon_and_ISV__c(java.lang.Double won_and_ISV__c) {
        this.won_and_ISV__c = won_and_ISV__c;
    }


    /**
     * Gets the won_and_Law_Firm__c value for this Account.
     * 
     * @return won_and_Law_Firm__c
     */
    public java.lang.Double getWon_and_Law_Firm__c() {
        return won_and_Law_Firm__c;
    }


    /**
     * Sets the won_and_Law_Firm__c value for this Account.
     * 
     * @param won_and_Law_Firm__c
     */
    public void setWon_and_Law_Firm__c(java.lang.Double won_and_Law_Firm__c) {
        this.won_and_Law_Firm__c = won_and_Law_Firm__c;
    }


    /**
     * Gets the won_and_Premium__c value for this Account.
     * 
     * @return won_and_Premium__c
     */
    public java.lang.Double getWon_and_Premium__c() {
        return won_and_Premium__c;
    }


    /**
     * Sets the won_and_Premium__c value for this Account.
     * 
     * @param won_and_Premium__c
     */
    public void setWon_and_Premium__c(java.lang.Double won_and_Premium__c) {
        this.won_and_Premium__c = won_and_Premium__c;
    }


    /**
     * Gets the works_With_GeorgeJon__c value for this Account.
     * 
     * @return works_With_GeorgeJon__c
     */
    public java.lang.Boolean getWorks_With_GeorgeJon__c() {
        return works_With_GeorgeJon__c;
    }


    /**
     * Sets the works_With_GeorgeJon__c value for this Account.
     * 
     * @param works_With_GeorgeJon__c
     */
    public void setWorks_With_GeorgeJon__c(java.lang.Boolean works_With_GeorgeJon__c) {
        this.works_With_GeorgeJon__c = works_With_GeorgeJon__c;
    }


    /**
     * Gets the yearStarted value for this Account.
     * 
     * @return yearStarted
     */
    public java.lang.String getYearStarted() {
        return yearStarted;
    }


    /**
     * Sets the yearStarted value for this Account.
     * 
     * @param yearStarted
     */
    public void setYearStarted(java.lang.String yearStarted) {
        this.yearStarted = yearStarted;
    }


    /**
     * Gets the won_and_reseller__c value for this Account.
     * 
     * @return won_and_reseller__c
     */
    public java.lang.Double getWon_and_reseller__c() {
        return won_and_reseller__c;
    }


    /**
     * Sets the won_and_reseller__c value for this Account.
     * 
     * @param won_and_reseller__c
     */
    public void setWon_and_reseller__c(java.lang.Double won_and_reseller__c) {
        this.won_and_reseller__c = won_and_reseller__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Account)) return false;
        Account other = (Account) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.AMLAW_Rankings__r==null && other.getAMLAW_Rankings__r()==null) || 
             (this.AMLAW_Rankings__r!=null &&
              this.AMLAW_Rankings__r.equals(other.getAMLAW_Rankings__r()))) &&
            ((this.AM_Law_Ranking_2009__c==null && other.getAM_Law_Ranking_2009__c()==null) || 
             (this.AM_Law_Ranking_2009__c!=null &&
              this.AM_Law_Ranking_2009__c.equals(other.getAM_Law_Ranking_2009__c()))) &&
            ((this.AM_Law_Ranking_2010__c==null && other.getAM_Law_Ranking_2010__c()==null) || 
             (this.AM_Law_Ranking_2010__c!=null &&
              this.AM_Law_Ranking_2010__c.equals(other.getAM_Law_Ranking_2010__c()))) &&
            ((this.accountContactRoles==null && other.getAccountContactRoles()==null) || 
             (this.accountContactRoles!=null &&
              this.accountContactRoles.equals(other.getAccountContactRoles()))) &&
            ((this.accountPartnersFrom==null && other.getAccountPartnersFrom()==null) || 
             (this.accountPartnersFrom!=null &&
              this.accountPartnersFrom.equals(other.getAccountPartnersFrom()))) &&
            ((this.accountPartnersTo==null && other.getAccountPartnersTo()==null) || 
             (this.accountPartnersTo!=null &&
              this.accountPartnersTo.equals(other.getAccountPartnersTo()))) &&
            ((this.accountSource==null && other.getAccountSource()==null) || 
             (this.accountSource!=null &&
              this.accountSource.equals(other.getAccountSource()))) &&
            ((this.account_Alert__c==null && other.getAccount_Alert__c()==null) || 
             (this.account_Alert__c!=null &&
              this.account_Alert__c.equals(other.getAccount_Alert__c()))) &&
            ((this.account_Count__c==null && other.getAccount_Count__c()==null) || 
             (this.account_Count__c!=null &&
              this.account_Count__c.equals(other.getAccount_Count__c()))) &&
            ((this.acct_Owner__c==null && other.getAcct_Owner__c()==null) || 
             (this.acct_Owner__c!=null &&
              this.acct_Owner__c.equals(other.getAcct_Owner__c()))) &&
            ((this.acct_Owner__r==null && other.getAcct_Owner__r()==null) || 
             (this.acct_Owner__r!=null &&
              this.acct_Owner__r.equals(other.getAcct_Owner__r()))) &&
            ((this.active_kPlex_Client__c==null && other.getActive_kPlex_Client__c()==null) || 
             (this.active_kPlex_Client__c!=null &&
              this.active_kPlex_Client__c.equals(other.getActive_kPlex_Client__c()))) &&
            ((this.activityHistories==null && other.getActivityHistories()==null) || 
             (this.activityHistories!=null &&
              this.activityHistories.equals(other.getActivityHistories()))) &&
            ((this.admin_Certifications__r==null && other.getAdmin_Certifications__r()==null) || 
             (this.admin_Certifications__r!=null &&
              this.admin_Certifications__r.equals(other.getAdmin_Certifications__r()))) &&
            ((this.analytic_Snapshots__r==null && other.getAnalytic_Snapshots__r()==null) || 
             (this.analytic_Snapshots__r!=null &&
              this.analytic_Snapshots__r.equals(other.getAnalytic_Snapshots__r()))) &&
            ((this.assets==null && other.getAssets()==null) || 
             (this.assets!=null &&
              this.assets.equals(other.getAssets()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.best_In_Services1__r==null && other.getBest_In_Services1__r()==null) || 
             (this.best_In_Services1__r!=null &&
              this.best_In_Services1__r.equals(other.getBest_In_Services1__r()))) &&
            ((this.best_in_Service__c==null && other.getBest_in_Service__c()==null) || 
             (this.best_in_Service__c!=null &&
              this.best_in_Service__c.equals(other.getBest_in_Service__c()))) &&
            ((this.best_in_Service__r==null && other.getBest_in_Service__r()==null) || 
             (this.best_in_Service__r!=null &&
              this.best_in_Service__r.equals(other.getBest_in_Service__r()))) &&
            ((this.biS_End_Date__c==null && other.getBiS_End_Date__c()==null) || 
             (this.biS_End_Date__c!=null &&
              this.biS_End_Date__c.equals(other.getBiS_End_Date__c()))) &&
            ((this.biS_Start_Date__c==null && other.getBiS_Start_Date__c()==null) || 
             (this.biS_Start_Date__c!=null &&
              this.biS_Start_Date__c.equals(other.getBiS_Start_Date__c()))) &&
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
            ((this.cases==null && other.getCases()==null) || 
             (this.cases!=null &&
              this.cases.equals(other.getCases()))) &&
            ((this.category__c==null && other.getCategory__c()==null) || 
             (this.category__c!=null &&
              this.category__c.equals(other.getCategory__c()))) &&
            ((this.channel_Manager_Outlines__r==null && other.getChannel_Manager_Outlines__r()==null) || 
             (this.channel_Manager_Outlines__r!=null &&
              this.channel_Manager_Outlines__r.equals(other.getChannel_Manager_Outlines__r()))) &&
            ((this.client_Since__c==null && other.getClient_Since__c()==null) || 
             (this.client_Since__c!=null &&
              this.client_Since__c.equals(other.getClient_Since__c()))) &&
            ((this.client_Testimonials__c==null && other.getClient_Testimonials__c()==null) || 
             (this.client_Testimonials__c!=null &&
              this.client_Testimonials__c.equals(other.getClient_Testimonials__c()))) &&
            ((this.client_Type_Analytic_Snapshot__c==null && other.getClient_Type_Analytic_Snapshot__c()==null) || 
             (this.client_Type_Analytic_Snapshot__c!=null &&
              this.client_Type_Analytic_Snapshot__c.equals(other.getClient_Type_Analytic_Snapshot__c()))) &&
            ((this.client_Type__c==null && other.getClient_Type__c()==null) || 
             (this.client_Type__c!=null &&
              this.client_Type__c.equals(other.getClient_Type__c()))) &&
            ((this.collection_Issue__c==null && other.getCollection_Issue__c()==null) || 
             (this.collection_Issue__c!=null &&
              this.collection_Issue__c.equals(other.getCollection_Issue__c()))) &&
            ((this.collections_Last_Modified_Date__c==null && other.getCollections_Last_Modified_Date__c()==null) || 
             (this.collections_Last_Modified_Date__c!=null &&
              this.collections_Last_Modified_Date__c.equals(other.getCollections_Last_Modified_Date__c()))) &&
            ((this.concurforce__AccruedUnApprovedExpenseTotal__c==null && other.getConcurforce__AccruedUnApprovedExpenseTotal__c()==null) || 
             (this.concurforce__AccruedUnApprovedExpenseTotal__c!=null &&
              this.concurforce__AccruedUnApprovedExpenseTotal__c.equals(other.getConcurforce__AccruedUnApprovedExpenseTotal__c()))) &&
            ((this.concurforce__Allocations__r==null && other.getConcurforce__Allocations__r()==null) || 
             (this.concurforce__Allocations__r!=null &&
              this.concurforce__Allocations__r.equals(other.getConcurforce__Allocations__r()))) &&
            ((this.concurforce__CT_Object_Lookups__r==null && other.getConcurforce__CT_Object_Lookups__r()==null) || 
             (this.concurforce__CT_Object_Lookups__r!=null &&
              this.concurforce__CT_Object_Lookups__r.equals(other.getConcurforce__CT_Object_Lookups__r()))) &&
            ((this.concurforce__Expense_Total_Account__r==null && other.getConcurforce__Expense_Total_Account__r()==null) || 
             (this.concurforce__Expense_Total_Account__r!=null &&
              this.concurforce__Expense_Total_Account__r.equals(other.getConcurforce__Expense_Total_Account__r()))) &&
            ((this.concurforce__FinalExpenseTotal__c==null && other.getConcurforce__FinalExpenseTotal__c()==null) || 
             (this.concurforce__FinalExpenseTotal__c!=null &&
              this.concurforce__FinalExpenseTotal__c.equals(other.getConcurforce__FinalExpenseTotal__c()))) &&
            ((this.contacts==null && other.getContacts()==null) || 
             (this.contacts!=null &&
              this.contacts.equals(other.getContacts()))) &&
            ((this.content__r==null && other.getContent__r()==null) || 
             (this.content__r!=null &&
              this.content__r.equals(other.getContent__r()))) &&
            ((this.contracts==null && other.getContracts()==null) || 
             (this.contracts!=null &&
              this.contracts.equals(other.getContracts()))) &&
            ((this.contracts__r==null && other.getContracts__r()==null) || 
             (this.contracts__r!=null &&
              this.contracts__r.equals(other.getContracts__r()))) &&
            ((this.country__c==null && other.getCountry__c()==null) || 
             (this.country__c!=null &&
              this.country__c.equals(other.getCountry__c()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.current_AMLAW_Ranking__c==null && other.getCurrent_AMLAW_Ranking__c()==null) || 
             (this.current_AMLAW_Ranking__c!=null &&
              this.current_AMLAW_Ranking__c.equals(other.getCurrent_AMLAW_Ranking__c()))) &&
            ((this.date_Became_PHP__c==null && other.getDate_Became_PHP__c()==null) || 
             (this.date_Became_PHP__c!=null &&
              this.date_Became_PHP__c.equals(other.getDate_Became_PHP__c()))) &&
            ((this.db_SQL_Environment_Email__c==null && other.getDb_SQL_Environment_Email__c()==null) || 
             (this.db_SQL_Environment_Email__c!=null &&
              this.db_SQL_Environment_Email__c.equals(other.getDb_SQL_Environment_Email__c()))) &&
            ((this.demos1__r==null && other.getDemos1__r()==null) || 
             (this.demos1__r!=null &&
              this.demos1__r.equals(other.getDemos1__r()))) &&
            ((this.demos__r==null && other.getDemos__r()==null) || 
             (this.demos__r!=null &&
              this.demos__r.equals(other.getDemos__r()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.dunsNumber==null && other.getDunsNumber()==null) || 
             (this.dunsNumber!=null &&
              this.dunsNumber.equals(other.getDunsNumber()))) &&
            ((this.evaluation_Type__c==null && other.getEvaluation_Type__c()==null) || 
             (this.evaluation_Type__c!=null &&
              this.evaluation_Type__c.equals(other.getEvaluation_Type__c()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              this.events.equals(other.getEvents()))) &&
            ((this.FTP_Login__c==null && other.getFTP_Login__c()==null) || 
             (this.FTP_Login__c!=null &&
              this.FTP_Login__c.equals(other.getFTP_Login__c()))) &&
            ((this.FTP_Password__c==null && other.getFTP_Password__c()==null) || 
             (this.FTP_Password__c!=null &&
              this.FTP_Password__c.equals(other.getFTP_Password__c()))) &&
            ((this.FTP_Preferred__c==null && other.getFTP_Preferred__c()==null) || 
             (this.FTP_Preferred__c!=null &&
              this.FTP_Preferred__c.equals(other.getFTP_Preferred__c()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.feeds==null && other.getFeeds()==null) || 
             (this.feeds!=null &&
              this.feeds.equals(other.getFeeds()))) &&
            ((this.fortune_Ranking__c==null && other.getFortune_Ranking__c()==null) || 
             (this.fortune_Ranking__c!=null &&
              this.fortune_Ranking__c.equals(other.getFortune_Ranking__c()))) &&
            ((this.functional_Trial__c==null && other.getFunctional_Trial__c()==null) || 
             (this.functional_Trial__c!=null &&
              this.functional_Trial__c.equals(other.getFunctional_Trial__c()))) &&
            ((this.global_Account__c==null && other.getGlobal_Account__c()==null) || 
             (this.global_Account__c!=null &&
              this.global_Account__c.equals(other.getGlobal_Account__c()))) &&
            ((this.has_Custom_Solution__c==null && other.getHas_Custom_Solution__c()==null) || 
             (this.has_Custom_Solution__c!=null &&
              this.has_Custom_Solution__c.equals(other.getHas_Custom_Solution__c()))) &&
            ((this.has_Non_Licensing_DLLs__c==null && other.getHas_Non_Licensing_DLLs__c()==null) || 
             (this.has_Non_Licensing_DLLs__c!=null &&
              this.has_Non_Licensing_DLLs__c.equals(other.getHas_Non_Licensing_DLLs__c()))) &&
            ((this.has_Test_Instance__c==null && other.getHas_Test_Instance__c()==null) || 
             (this.has_Test_Instance__c!=null &&
              this.has_Test_Instance__c.equals(other.getHas_Test_Instance__c()))) &&
            ((this.have_Client_Logo__c==null && other.getHave_Client_Logo__c()==null) || 
             (this.have_Client_Logo__c!=null &&
              this.have_Client_Logo__c.equals(other.getHave_Client_Logo__c()))) &&
            ((this.have_Client_Testimonial__c==null && other.getHave_Client_Testimonial__c()==null) || 
             (this.have_Client_Testimonial__c!=null &&
              this.have_Client_Testimonial__c.equals(other.getHave_Client_Testimonial__c()))) &&
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
            ((this.ideas_Site_Setups__r==null && other.getIdeas_Site_Setups__r()==null) || 
             (this.ideas_Site_Setups__r!=null &&
              this.ideas_Site_Setups__r.equals(other.getIdeas_Site_Setups__r()))) &&
            ((this.industry__c==null && other.getIndustry__c()==null) || 
             (this.industry__c!=null &&
              this.industry__c.equals(other.getIndustry__c()))) &&
            ((this.industry__r==null && other.getIndustry__r()==null) || 
             (this.industry__r!=null &&
              this.industry__r.equals(other.getIndustry__r()))) &&
            ((this.instances__r==null && other.getInstances__r()==null) || 
             (this.instances__r!=null &&
              this.instances__r.equals(other.getInstances__r()))) &&
            ((this.integration_Notes__c==null && other.getIntegration_Notes__c()==null) || 
             (this.integration_Notes__c!=null &&
              this.integration_Notes__c.equals(other.getIntegration_Notes__c()))) &&
            ((this.international_Client__c==null && other.getInternational_Client__c()==null) || 
             (this.international_Client__c!=null &&
              this.international_Client__c.equals(other.getInternational_Client__c()))) &&
            ((this.isCustomerPortal==null && other.getIsCustomerPortal()==null) || 
             (this.isCustomerPortal!=null &&
              this.isCustomerPortal.equals(other.getIsCustomerPortal()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.jigsaw==null && other.getJigsaw()==null) || 
             (this.jigsaw!=null &&
              this.jigsaw.equals(other.getJigsaw()))) &&
            ((this.jigsawCompanyId==null && other.getJigsawCompanyId()==null) || 
             (this.jigsawCompanyId!=null &&
              this.jigsawCompanyId.equals(other.getJigsawCompanyId()))) &&
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
            ((this.legal_Entity__c==null && other.getLegal_Entity__c()==null) || 
             (this.legal_Entity__c!=null &&
              this.legal_Entity__c.equals(other.getLegal_Entity__c()))) &&
            ((this.logo_Testimonial_Trackings__r==null && other.getLogo_Testimonial_Trackings__r()==null) || 
             (this.logo_Testimonial_Trackings__r!=null &&
              this.logo_Testimonial_Trackings__r.equals(other.getLogo_Testimonial_Trackings__r()))) &&
            ((this.masterRecord==null && other.getMasterRecord()==null) || 
             (this.masterRecord!=null &&
              this.masterRecord.equals(other.getMasterRecord()))) &&
            ((this.masterRecordId==null && other.getMasterRecordId()==null) || 
             (this.masterRecordId!=null &&
              this.masterRecordId.equals(other.getMasterRecordId()))) &&
            ((this.meetings__r==null && other.getMeetings__r()==null) || 
             (this.meetings__r!=null &&
              this.meetings__r.equals(other.getMeetings__r()))) &&
            ((this.naicsCode==null && other.getNaicsCode()==null) || 
             (this.naicsCode!=null &&
              this.naicsCode.equals(other.getNaicsCode()))) &&
            ((this.naicsDesc==null && other.getNaicsDesc()==null) || 
             (this.naicsDesc!=null &&
              this.naicsDesc.equals(other.getNaicsDesc()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.notes__c==null && other.getNotes__c()==null) || 
             (this.notes__c!=null &&
              this.notes__c.equals(other.getNotes__c()))) &&
            ((this.number_Count__c==null && other.getNumber_Count__c()==null) || 
             (this.number_Count__c!=null &&
              this.number_Count__c.equals(other.getNumber_Count__c()))) &&
            ((this.number_of_Pilot_Opportunites__c==null && other.getNumber_of_Pilot_Opportunites__c()==null) || 
             (this.number_of_Pilot_Opportunites__c!=null &&
              this.number_of_Pilot_Opportunites__c.equals(other.getNumber_of_Pilot_Opportunites__c()))) &&
            ((this.openActivities==null && other.getOpenActivities()==null) || 
             (this.openActivities!=null &&
              this.openActivities.equals(other.getOpenActivities()))) &&
            ((this.opportunities==null && other.getOpportunities()==null) || 
             (this.opportunities!=null &&
              this.opportunities.equals(other.getOpportunities()))) &&
            ((this.opportunityPartnersTo==null && other.getOpportunityPartnersTo()==null) || 
             (this.opportunityPartnersTo!=null &&
              this.opportunityPartnersTo.equals(other.getOpportunityPartnersTo()))) &&
            ((this.opportunity_AM_Law_Ranking__c==null && other.getOpportunity_AM_Law_Ranking__c()==null) || 
             (this.opportunity_AM_Law_Ranking__c!=null &&
              this.opportunity_AM_Law_Ranking__c.equals(other.getOpportunity_AM_Law_Ranking__c()))) &&
            ((this.opportunity__r==null && other.getOpportunity__r()==null) || 
             (this.opportunity__r!=null &&
              this.opportunity__r.equals(other.getOpportunity__r()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.POC_s__c==null && other.getPOC_s__c()==null) || 
             (this.POC_s__c!=null &&
              this.POC_s__c.equals(other.getPOC_s__c()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.parentId==null && other.getParentId()==null) || 
             (this.parentId!=null &&
              this.parentId.equals(other.getParentId()))) &&
            ((this.partnersFrom==null && other.getPartnersFrom()==null) || 
             (this.partnersFrom!=null &&
              this.partnersFrom.equals(other.getPartnersFrom()))) &&
            ((this.partnersTo==null && other.getPartnersTo()==null) || 
             (this.partnersTo!=null &&
              this.partnersTo.equals(other.getPartnersTo()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.pilot__c==null && other.getPilot__c()==null) || 
             (this.pilot__c!=null &&
              this.pilot__c.equals(other.getPilot__c()))) &&
            ((this.pod_Extension__c==null && other.getPod_Extension__c()==null) || 
             (this.pod_Extension__c!=null &&
              this.pod_Extension__c.equals(other.getPod_Extension__c()))) &&
            ((this.pod__c==null && other.getPod__c()==null) || 
             (this.pod__c!=null &&
              this.pod__c.equals(other.getPod__c()))) &&
            ((this.primary_Contact_Email_Address__c==null && other.getPrimary_Contact_Email_Address__c()==null) || 
             (this.primary_Contact_Email_Address__c!=null &&
              this.primary_Contact_Email_Address__c.equals(other.getPrimary_Contact_Email_Address__c()))) &&
            ((this.primary_Contact__c==null && other.getPrimary_Contact__c()==null) || 
             (this.primary_Contact__c!=null &&
              this.primary_Contact__c.equals(other.getPrimary_Contact__c()))) &&
            ((this.primary_Contact__r==null && other.getPrimary_Contact__r()==null) || 
             (this.primary_Contact__r!=null &&
              this.primary_Contact__r.equals(other.getPrimary_Contact__r()))) &&
            ((this.primary_Instance_Go_Live__c==null && other.getPrimary_Instance_Go_Live__c()==null) || 
             (this.primary_Instance_Go_Live__c!=null &&
              this.primary_Instance_Go_Live__c.equals(other.getPrimary_Instance_Go_Live__c()))) &&
            ((this.primary_Instance_Version1__c==null && other.getPrimary_Instance_Version1__c()==null) || 
             (this.primary_Instance_Version1__c!=null &&
              this.primary_Instance_Version1__c.equals(other.getPrimary_Instance_Version1__c()))) &&
            ((this.primary_Instance__c==null && other.getPrimary_Instance__c()==null) || 
             (this.primary_Instance__c!=null &&
              this.primary_Instance__c.equals(other.getPrimary_Instance__c()))) &&
            ((this.primary_Instance__r==null && other.getPrimary_Instance__r()==null) || 
             (this.primary_Instance__r!=null &&
              this.primary_Instance__r.equals(other.getPrimary_Instance__r()))) &&
            ((this.primary_Marketing_Contact_Email__c==null && other.getPrimary_Marketing_Contact_Email__c()==null) || 
             (this.primary_Marketing_Contact_Email__c!=null &&
              this.primary_Marketing_Contact_Email__c.equals(other.getPrimary_Marketing_Contact_Email__c()))) &&
            ((this.primary_Marketing_Contact__c==null && other.getPrimary_Marketing_Contact__c()==null) || 
             (this.primary_Marketing_Contact__c!=null &&
              this.primary_Marketing_Contact__c.equals(other.getPrimary_Marketing_Contact__c()))) &&
            ((this.primary_Marketing_Contact__r==null && other.getPrimary_Marketing_Contact__r()==null) || 
             (this.primary_Marketing_Contact__r!=null &&
              this.primary_Marketing_Contact__r.equals(other.getPrimary_Marketing_Contact__r()))) &&
            ((this.primary_Relativity_Version__c==null && other.getPrimary_Relativity_Version__c()==null) || 
             (this.primary_Relativity_Version__c!=null &&
              this.primary_Relativity_Version__c.equals(other.getPrimary_Relativity_Version__c()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.product_Name__c==null && other.getProduct_Name__c()==null) || 
             (this.product_Name__c!=null &&
              this.product_Name__c.equals(other.getProduct_Name__c()))) &&
            ((this.purchase_Orders__r==null && other.getPurchase_Orders__r()==null) || 
             (this.purchase_Orders__r!=null &&
              this.purchase_Orders__r.equals(other.getPurchase_Orders__r()))) &&
            ((this.RAR_DLs__r==null && other.getRAR_DLs__r()==null) || 
             (this.RAR_DLs__r!=null &&
              this.RAR_DLs__r.equals(other.getRAR_DLs__r()))) &&
            ((this.RA_Monthly_Usages__r==null && other.getRA_Monthly_Usages__r()==null) || 
             (this.RA_Monthly_Usages__r!=null &&
              this.RA_Monthly_Usages__r.equals(other.getRA_Monthly_Usages__r()))) &&
            ((this.RA_Rollups__r==null && other.getRA_Rollups__r()==null) || 
             (this.RA_Rollups__r!=null &&
              this.RA_Rollups__r.equals(other.getRA_Rollups__r()))) &&
            ((this.region__c==null && other.getRegion__c()==null) || 
             (this.region__c!=null &&
              this.region__c.equals(other.getRegion__c()))) &&
            ((this.related_Instances__c==null && other.getRelated_Instances__c()==null) || 
             (this.related_Instances__c!=null &&
              this.related_Instances__c.equals(other.getRelated_Instances__c()))) &&
            ((this.relativity_URL__c==null && other.getRelativity_URL__c()==null) || 
             (this.relativity_URL__c!=null &&
              this.relativity_URL__c.equals(other.getRelativity_URL__c()))) &&
            ((this.relativity_Version__c==null && other.getRelativity_Version__c()==null) || 
             (this.relativity_Version__c!=null &&
              this.relativity_Version__c.equals(other.getRelativity_Version__c()))) &&
            ((this.relativity_Version__r==null && other.getRelativity_Version__r()==null) || 
             (this.relativity_Version__r!=null &&
              this.relativity_Version__r.equals(other.getRelativity_Version__r()))) &&
            ((this.reseller_Opportunities__r==null && other.getReseller_Opportunities__r()==null) || 
             (this.reseller_Opportunities__r!=null &&
              this.reseller_Opportunities__r.equals(other.getReseller_Opportunities__r()))) &&
            ((this.reseller_Partner__c==null && other.getReseller_Partner__c()==null) || 
             (this.reseller_Partner__c!=null &&
              this.reseller_Partner__c.equals(other.getReseller_Partner__c()))) &&
            ((this.reseller_Tier__c==null && other.getReseller_Tier__c()==null) || 
             (this.reseller_Tier__c!=null &&
              this.reseller_Tier__c.equals(other.getReseller_Tier__c()))) &&
            ((this.sales_Contact_Email__c==null && other.getSales_Contact_Email__c()==null) || 
             (this.sales_Contact_Email__c!=null &&
              this.sales_Contact_Email__c.equals(other.getSales_Contact_Email__c()))) &&
            ((this.sales_Contact__c==null && other.getSales_Contact__c()==null) || 
             (this.sales_Contact__c!=null &&
              this.sales_Contact__c.equals(other.getSales_Contact__c()))) &&
            ((this.sales_Distribution_List__c==null && other.getSales_Distribution_List__c()==null) || 
             (this.sales_Distribution_List__c!=null &&
              this.sales_Distribution_List__c.equals(other.getSales_Distribution_List__c()))) &&
            ((this.sales_Support_Login__c==null && other.getSales_Support_Login__c()==null) || 
             (this.sales_Support_Login__c!=null &&
              this.sales_Support_Login__c.equals(other.getSales_Support_Login__c()))) &&
            ((this.sales_Support_Password__c==null && other.getSales_Support_Password__c()==null) || 
             (this.sales_Support_Password__c!=null &&
              this.sales_Support_Password__c.equals(other.getSales_Support_Password__c()))) &&
            ((this.shares==null && other.getShares()==null) || 
             (this.shares!=null &&
              this.shares.equals(other.getShares()))) &&
            ((this.sicDesc==null && other.getSicDesc()==null) || 
             (this.sicDesc!=null &&
              this.sicDesc.equals(other.getSicDesc()))) &&
            ((this.software_Solutions__c==null && other.getSoftware_Solutions__c()==null) || 
             (this.software_Solutions__c!=null &&
              this.software_Solutions__c.equals(other.getSoftware_Solutions__c()))) &&
            ((this.status_Meetings__r==null && other.getStatus_Meetings__r()==null) || 
             (this.status_Meetings__r!=null &&
              this.status_Meetings__r.equals(other.getStatus_Meetings__r()))) &&
            ((this.support_CC_Emails__c==null && other.getSupport_CC_Emails__c()==null) || 
             (this.support_CC_Emails__c!=null &&
              this.support_CC_Emails__c.equals(other.getSupport_CC_Emails__c()))) &&
            ((this.support_Contact_Email__c==null && other.getSupport_Contact_Email__c()==null) || 
             (this.support_Contact_Email__c!=null &&
              this.support_Contact_Email__c.equals(other.getSupport_Contact_Email__c()))) &&
            ((this.support_Contact__c==null && other.getSupport_Contact__c()==null) || 
             (this.support_Contact__c!=null &&
              this.support_Contact__c.equals(other.getSupport_Contact__c()))) &&
            ((this.support_Distribution_List__c==null && other.getSupport_Distribution_List__c()==null) || 
             (this.support_Distribution_List__c!=null &&
              this.support_Distribution_List__c.equals(other.getSupport_Distribution_List__c()))) &&
            ((this.support_Hours__c==null && other.getSupport_Hours__c()==null) || 
             (this.support_Hours__c!=null &&
              this.support_Hours__c.equals(other.getSupport_Hours__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              this.tasks.equals(other.getTasks()))) &&
            ((this.tradestyle==null && other.getTradestyle()==null) || 
             (this.tradestyle!=null &&
              this.tradestyle.equals(other.getTradestyle()))) &&
            ((this.trainings__r==null && other.getTrainings__r()==null) || 
             (this.trainings__r!=null &&
              this.trainings__r.equals(other.getTrainings__r()))) &&
            ((this.transactions__r==null && other.getTransactions__r()==null) || 
             (this.transactions__r!=null &&
              this.transactions__r.equals(other.getTransactions__r()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.type_Analytic_Snapshot__c==null && other.getType_Analytic_Snapshot__c()==null) || 
             (this.type_Analytic_Snapshot__c!=null &&
              this.type_Analytic_Snapshot__c.equals(other.getType_Analytic_Snapshot__c()))) &&
            ((this.URL_of_CoBranded_Collateral__c==null && other.getURL_of_CoBranded_Collateral__c()==null) || 
             (this.URL_of_CoBranded_Collateral__c!=null &&
              this.URL_of_CoBranded_Collateral__c.equals(other.getURL_of_CoBranded_Collateral__c()))) &&
            ((this.unique_Users__r==null && other.getUnique_Users__r()==null) || 
             (this.unique_Users__r!=null &&
              this.unique_Users__r.equals(other.getUnique_Users__r()))) &&
            ((this.user_License__c==null && other.getUser_License__c()==null) || 
             (this.user_License__c!=null &&
              this.user_License__c.equals(other.getUser_License__c()))) &&
            ((this.VM_Instances__r==null && other.getVM_Instances__r()==null) || 
             (this.VM_Instances__r!=null &&
              this.VM_Instances__r.equals(other.getVM_Instances__r()))) &&
            ((this.verto_Beta_User__c==null && other.getVerto_Beta_User__c()==null) || 
             (this.verto_Beta_User__c!=null &&
              this.verto_Beta_User__c.equals(other.getVerto_Beta_User__c()))) &&
            ((this.website==null && other.getWebsite()==null) || 
             (this.website!=null &&
              this.website.equals(other.getWebsite()))) &&
            ((this.won_and_Consulting__c==null && other.getWon_and_Consulting__c()==null) || 
             (this.won_and_Consulting__c!=null &&
              this.won_and_Consulting__c.equals(other.getWon_and_Consulting__c()))) &&
            ((this.won_and_Corporation__c==null && other.getWon_and_Corporation__c()==null) || 
             (this.won_and_Corporation__c!=null &&
              this.won_and_Corporation__c.equals(other.getWon_and_Corporation__c()))) &&
            ((this.won_and_Government__c==null && other.getWon_and_Government__c()==null) || 
             (this.won_and_Government__c!=null &&
              this.won_and_Government__c.equals(other.getWon_and_Government__c()))) &&
            ((this.won_and_ISV__c==null && other.getWon_and_ISV__c()==null) || 
             (this.won_and_ISV__c!=null &&
              this.won_and_ISV__c.equals(other.getWon_and_ISV__c()))) &&
            ((this.won_and_Law_Firm__c==null && other.getWon_and_Law_Firm__c()==null) || 
             (this.won_and_Law_Firm__c!=null &&
              this.won_and_Law_Firm__c.equals(other.getWon_and_Law_Firm__c()))) &&
            ((this.won_and_Premium__c==null && other.getWon_and_Premium__c()==null) || 
             (this.won_and_Premium__c!=null &&
              this.won_and_Premium__c.equals(other.getWon_and_Premium__c()))) &&
            ((this.works_With_GeorgeJon__c==null && other.getWorks_With_GeorgeJon__c()==null) || 
             (this.works_With_GeorgeJon__c!=null &&
              this.works_With_GeorgeJon__c.equals(other.getWorks_With_GeorgeJon__c()))) &&
            ((this.yearStarted==null && other.getYearStarted()==null) || 
             (this.yearStarted!=null &&
              this.yearStarted.equals(other.getYearStarted()))) &&
            ((this.won_and_reseller__c==null && other.getWon_and_reseller__c()==null) || 
             (this.won_and_reseller__c!=null &&
              this.won_and_reseller__c.equals(other.getWon_and_reseller__c())));
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
        if (getAMLAW_Rankings__r() != null) {
            _hashCode += getAMLAW_Rankings__r().hashCode();
        }
        if (getAM_Law_Ranking_2009__c() != null) {
            _hashCode += getAM_Law_Ranking_2009__c().hashCode();
        }
        if (getAM_Law_Ranking_2010__c() != null) {
            _hashCode += getAM_Law_Ranking_2010__c().hashCode();
        }
        if (getAccountContactRoles() != null) {
            _hashCode += getAccountContactRoles().hashCode();
        }
        if (getAccountPartnersFrom() != null) {
            _hashCode += getAccountPartnersFrom().hashCode();
        }
        if (getAccountPartnersTo() != null) {
            _hashCode += getAccountPartnersTo().hashCode();
        }
        if (getAccountSource() != null) {
            _hashCode += getAccountSource().hashCode();
        }
        if (getAccount_Alert__c() != null) {
            _hashCode += getAccount_Alert__c().hashCode();
        }
        if (getAccount_Count__c() != null) {
            _hashCode += getAccount_Count__c().hashCode();
        }
        if (getAcct_Owner__c() != null) {
            _hashCode += getAcct_Owner__c().hashCode();
        }
        if (getAcct_Owner__r() != null) {
            _hashCode += getAcct_Owner__r().hashCode();
        }
        if (getActive_kPlex_Client__c() != null) {
            _hashCode += getActive_kPlex_Client__c().hashCode();
        }
        if (getActivityHistories() != null) {
            _hashCode += getActivityHistories().hashCode();
        }
        if (getAdmin_Certifications__r() != null) {
            _hashCode += getAdmin_Certifications__r().hashCode();
        }
        if (getAnalytic_Snapshots__r() != null) {
            _hashCode += getAnalytic_Snapshots__r().hashCode();
        }
        if (getAssets() != null) {
            _hashCode += getAssets().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getBest_In_Services1__r() != null) {
            _hashCode += getBest_In_Services1__r().hashCode();
        }
        if (getBest_in_Service__c() != null) {
            _hashCode += getBest_in_Service__c().hashCode();
        }
        if (getBest_in_Service__r() != null) {
            _hashCode += getBest_in_Service__r().hashCode();
        }
        if (getBiS_End_Date__c() != null) {
            _hashCode += getBiS_End_Date__c().hashCode();
        }
        if (getBiS_Start_Date__c() != null) {
            _hashCode += getBiS_Start_Date__c().hashCode();
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
        if (getCases() != null) {
            _hashCode += getCases().hashCode();
        }
        if (getCategory__c() != null) {
            _hashCode += getCategory__c().hashCode();
        }
        if (getChannel_Manager_Outlines__r() != null) {
            _hashCode += getChannel_Manager_Outlines__r().hashCode();
        }
        if (getClient_Since__c() != null) {
            _hashCode += getClient_Since__c().hashCode();
        }
        if (getClient_Testimonials__c() != null) {
            _hashCode += getClient_Testimonials__c().hashCode();
        }
        if (getClient_Type_Analytic_Snapshot__c() != null) {
            _hashCode += getClient_Type_Analytic_Snapshot__c().hashCode();
        }
        if (getClient_Type__c() != null) {
            _hashCode += getClient_Type__c().hashCode();
        }
        if (getCollection_Issue__c() != null) {
            _hashCode += getCollection_Issue__c().hashCode();
        }
        if (getCollections_Last_Modified_Date__c() != null) {
            _hashCode += getCollections_Last_Modified_Date__c().hashCode();
        }
        if (getConcurforce__AccruedUnApprovedExpenseTotal__c() != null) {
            _hashCode += getConcurforce__AccruedUnApprovedExpenseTotal__c().hashCode();
        }
        if (getConcurforce__Allocations__r() != null) {
            _hashCode += getConcurforce__Allocations__r().hashCode();
        }
        if (getConcurforce__CT_Object_Lookups__r() != null) {
            _hashCode += getConcurforce__CT_Object_Lookups__r().hashCode();
        }
        if (getConcurforce__Expense_Total_Account__r() != null) {
            _hashCode += getConcurforce__Expense_Total_Account__r().hashCode();
        }
        if (getConcurforce__FinalExpenseTotal__c() != null) {
            _hashCode += getConcurforce__FinalExpenseTotal__c().hashCode();
        }
        if (getContacts() != null) {
            _hashCode += getContacts().hashCode();
        }
        if (getContent__r() != null) {
            _hashCode += getContent__r().hashCode();
        }
        if (getContracts() != null) {
            _hashCode += getContracts().hashCode();
        }
        if (getContracts__r() != null) {
            _hashCode += getContracts__r().hashCode();
        }
        if (getCountry__c() != null) {
            _hashCode += getCountry__c().hashCode();
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
        if (getCurrent_AMLAW_Ranking__c() != null) {
            _hashCode += getCurrent_AMLAW_Ranking__c().hashCode();
        }
        if (getDate_Became_PHP__c() != null) {
            _hashCode += getDate_Became_PHP__c().hashCode();
        }
        if (getDb_SQL_Environment_Email__c() != null) {
            _hashCode += getDb_SQL_Environment_Email__c().hashCode();
        }
        if (getDemos1__r() != null) {
            _hashCode += getDemos1__r().hashCode();
        }
        if (getDemos__r() != null) {
            _hashCode += getDemos__r().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDunsNumber() != null) {
            _hashCode += getDunsNumber().hashCode();
        }
        if (getEvaluation_Type__c() != null) {
            _hashCode += getEvaluation_Type__c().hashCode();
        }
        if (getEvents() != null) {
            _hashCode += getEvents().hashCode();
        }
        if (getFTP_Login__c() != null) {
            _hashCode += getFTP_Login__c().hashCode();
        }
        if (getFTP_Password__c() != null) {
            _hashCode += getFTP_Password__c().hashCode();
        }
        if (getFTP_Preferred__c() != null) {
            _hashCode += getFTP_Preferred__c().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getFeeds() != null) {
            _hashCode += getFeeds().hashCode();
        }
        if (getFortune_Ranking__c() != null) {
            _hashCode += getFortune_Ranking__c().hashCode();
        }
        if (getFunctional_Trial__c() != null) {
            _hashCode += getFunctional_Trial__c().hashCode();
        }
        if (getGlobal_Account__c() != null) {
            _hashCode += getGlobal_Account__c().hashCode();
        }
        if (getHas_Custom_Solution__c() != null) {
            _hashCode += getHas_Custom_Solution__c().hashCode();
        }
        if (getHas_Non_Licensing_DLLs__c() != null) {
            _hashCode += getHas_Non_Licensing_DLLs__c().hashCode();
        }
        if (getHas_Test_Instance__c() != null) {
            _hashCode += getHas_Test_Instance__c().hashCode();
        }
        if (getHave_Client_Logo__c() != null) {
            _hashCode += getHave_Client_Logo__c().hashCode();
        }
        if (getHave_Client_Testimonial__c() != null) {
            _hashCode += getHave_Client_Testimonial__c().hashCode();
        }
        if (getHistories() != null) {
            _hashCode += getHistories().hashCode();
        }
        if (getIdeas_Site_Setups__r() != null) {
            _hashCode += getIdeas_Site_Setups__r().hashCode();
        }
        if (getIndustry__c() != null) {
            _hashCode += getIndustry__c().hashCode();
        }
        if (getIndustry__r() != null) {
            _hashCode += getIndustry__r().hashCode();
        }
        if (getInstances__r() != null) {
            _hashCode += getInstances__r().hashCode();
        }
        if (getIntegration_Notes__c() != null) {
            _hashCode += getIntegration_Notes__c().hashCode();
        }
        if (getInternational_Client__c() != null) {
            _hashCode += getInternational_Client__c().hashCode();
        }
        if (getIsCustomerPortal() != null) {
            _hashCode += getIsCustomerPortal().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getJigsaw() != null) {
            _hashCode += getJigsaw().hashCode();
        }
        if (getJigsawCompanyId() != null) {
            _hashCode += getJigsawCompanyId().hashCode();
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
        if (getLegal_Entity__c() != null) {
            _hashCode += getLegal_Entity__c().hashCode();
        }
        if (getLogo_Testimonial_Trackings__r() != null) {
            _hashCode += getLogo_Testimonial_Trackings__r().hashCode();
        }
        if (getMasterRecord() != null) {
            _hashCode += getMasterRecord().hashCode();
        }
        if (getMasterRecordId() != null) {
            _hashCode += getMasterRecordId().hashCode();
        }
        if (getMeetings__r() != null) {
            _hashCode += getMeetings__r().hashCode();
        }
        if (getNaicsCode() != null) {
            _hashCode += getNaicsCode().hashCode();
        }
        if (getNaicsDesc() != null) {
            _hashCode += getNaicsDesc().hashCode();
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
        if (getNotes__c() != null) {
            _hashCode += getNotes__c().hashCode();
        }
        if (getNumber_Count__c() != null) {
            _hashCode += getNumber_Count__c().hashCode();
        }
        if (getNumber_of_Pilot_Opportunites__c() != null) {
            _hashCode += getNumber_of_Pilot_Opportunites__c().hashCode();
        }
        if (getOpenActivities() != null) {
            _hashCode += getOpenActivities().hashCode();
        }
        if (getOpportunities() != null) {
            _hashCode += getOpportunities().hashCode();
        }
        if (getOpportunityPartnersTo() != null) {
            _hashCode += getOpportunityPartnersTo().hashCode();
        }
        if (getOpportunity_AM_Law_Ranking__c() != null) {
            _hashCode += getOpportunity_AM_Law_Ranking__c().hashCode();
        }
        if (getOpportunity__r() != null) {
            _hashCode += getOpportunity__r().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getPOC_s__c() != null) {
            _hashCode += getPOC_s__c().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getParentId() != null) {
            _hashCode += getParentId().hashCode();
        }
        if (getPartnersFrom() != null) {
            _hashCode += getPartnersFrom().hashCode();
        }
        if (getPartnersTo() != null) {
            _hashCode += getPartnersTo().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getPilot__c() != null) {
            _hashCode += getPilot__c().hashCode();
        }
        if (getPod_Extension__c() != null) {
            _hashCode += getPod_Extension__c().hashCode();
        }
        if (getPod__c() != null) {
            _hashCode += getPod__c().hashCode();
        }
        if (getPrimary_Contact_Email_Address__c() != null) {
            _hashCode += getPrimary_Contact_Email_Address__c().hashCode();
        }
        if (getPrimary_Contact__c() != null) {
            _hashCode += getPrimary_Contact__c().hashCode();
        }
        if (getPrimary_Contact__r() != null) {
            _hashCode += getPrimary_Contact__r().hashCode();
        }
        if (getPrimary_Instance_Go_Live__c() != null) {
            _hashCode += getPrimary_Instance_Go_Live__c().hashCode();
        }
        if (getPrimary_Instance_Version1__c() != null) {
            _hashCode += getPrimary_Instance_Version1__c().hashCode();
        }
        if (getPrimary_Instance__c() != null) {
            _hashCode += getPrimary_Instance__c().hashCode();
        }
        if (getPrimary_Instance__r() != null) {
            _hashCode += getPrimary_Instance__r().hashCode();
        }
        if (getPrimary_Marketing_Contact_Email__c() != null) {
            _hashCode += getPrimary_Marketing_Contact_Email__c().hashCode();
        }
        if (getPrimary_Marketing_Contact__c() != null) {
            _hashCode += getPrimary_Marketing_Contact__c().hashCode();
        }
        if (getPrimary_Marketing_Contact__r() != null) {
            _hashCode += getPrimary_Marketing_Contact__r().hashCode();
        }
        if (getPrimary_Relativity_Version__c() != null) {
            _hashCode += getPrimary_Relativity_Version__c().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getProduct_Name__c() != null) {
            _hashCode += getProduct_Name__c().hashCode();
        }
        if (getPurchase_Orders__r() != null) {
            _hashCode += getPurchase_Orders__r().hashCode();
        }
        if (getRAR_DLs__r() != null) {
            _hashCode += getRAR_DLs__r().hashCode();
        }
        if (getRA_Monthly_Usages__r() != null) {
            _hashCode += getRA_Monthly_Usages__r().hashCode();
        }
        if (getRA_Rollups__r() != null) {
            _hashCode += getRA_Rollups__r().hashCode();
        }
        if (getRegion__c() != null) {
            _hashCode += getRegion__c().hashCode();
        }
        if (getRelated_Instances__c() != null) {
            _hashCode += getRelated_Instances__c().hashCode();
        }
        if (getRelativity_URL__c() != null) {
            _hashCode += getRelativity_URL__c().hashCode();
        }
        if (getRelativity_Version__c() != null) {
            _hashCode += getRelativity_Version__c().hashCode();
        }
        if (getRelativity_Version__r() != null) {
            _hashCode += getRelativity_Version__r().hashCode();
        }
        if (getReseller_Opportunities__r() != null) {
            _hashCode += getReseller_Opportunities__r().hashCode();
        }
        if (getReseller_Partner__c() != null) {
            _hashCode += getReseller_Partner__c().hashCode();
        }
        if (getReseller_Tier__c() != null) {
            _hashCode += getReseller_Tier__c().hashCode();
        }
        if (getSales_Contact_Email__c() != null) {
            _hashCode += getSales_Contact_Email__c().hashCode();
        }
        if (getSales_Contact__c() != null) {
            _hashCode += getSales_Contact__c().hashCode();
        }
        if (getSales_Distribution_List__c() != null) {
            _hashCode += getSales_Distribution_List__c().hashCode();
        }
        if (getSales_Support_Login__c() != null) {
            _hashCode += getSales_Support_Login__c().hashCode();
        }
        if (getSales_Support_Password__c() != null) {
            _hashCode += getSales_Support_Password__c().hashCode();
        }
        if (getShares() != null) {
            _hashCode += getShares().hashCode();
        }
        if (getSicDesc() != null) {
            _hashCode += getSicDesc().hashCode();
        }
        if (getSoftware_Solutions__c() != null) {
            _hashCode += getSoftware_Solutions__c().hashCode();
        }
        if (getStatus_Meetings__r() != null) {
            _hashCode += getStatus_Meetings__r().hashCode();
        }
        if (getSupport_CC_Emails__c() != null) {
            _hashCode += getSupport_CC_Emails__c().hashCode();
        }
        if (getSupport_Contact_Email__c() != null) {
            _hashCode += getSupport_Contact_Email__c().hashCode();
        }
        if (getSupport_Contact__c() != null) {
            _hashCode += getSupport_Contact__c().hashCode();
        }
        if (getSupport_Distribution_List__c() != null) {
            _hashCode += getSupport_Distribution_List__c().hashCode();
        }
        if (getSupport_Hours__c() != null) {
            _hashCode += getSupport_Hours__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTasks() != null) {
            _hashCode += getTasks().hashCode();
        }
        if (getTradestyle() != null) {
            _hashCode += getTradestyle().hashCode();
        }
        if (getTrainings__r() != null) {
            _hashCode += getTrainings__r().hashCode();
        }
        if (getTransactions__r() != null) {
            _hashCode += getTransactions__r().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getType_Analytic_Snapshot__c() != null) {
            _hashCode += getType_Analytic_Snapshot__c().hashCode();
        }
        if (getURL_of_CoBranded_Collateral__c() != null) {
            _hashCode += getURL_of_CoBranded_Collateral__c().hashCode();
        }
        if (getUnique_Users__r() != null) {
            _hashCode += getUnique_Users__r().hashCode();
        }
        if (getUser_License__c() != null) {
            _hashCode += getUser_License__c().hashCode();
        }
        if (getVM_Instances__r() != null) {
            _hashCode += getVM_Instances__r().hashCode();
        }
        if (getVerto_Beta_User__c() != null) {
            _hashCode += getVerto_Beta_User__c().hashCode();
        }
        if (getWebsite() != null) {
            _hashCode += getWebsite().hashCode();
        }
        if (getWon_and_Consulting__c() != null) {
            _hashCode += getWon_and_Consulting__c().hashCode();
        }
        if (getWon_and_Corporation__c() != null) {
            _hashCode += getWon_and_Corporation__c().hashCode();
        }
        if (getWon_and_Government__c() != null) {
            _hashCode += getWon_and_Government__c().hashCode();
        }
        if (getWon_and_ISV__c() != null) {
            _hashCode += getWon_and_ISV__c().hashCode();
        }
        if (getWon_and_Law_Firm__c() != null) {
            _hashCode += getWon_and_Law_Firm__c().hashCode();
        }
        if (getWon_and_Premium__c() != null) {
            _hashCode += getWon_and_Premium__c().hashCode();
        }
        if (getWorks_With_GeorgeJon__c() != null) {
            _hashCode += getWorks_With_GeorgeJon__c().hashCode();
        }
        if (getYearStarted() != null) {
            _hashCode += getYearStarted().hashCode();
        }
        if (getWon_and_reseller__c() != null) {
            _hashCode += getWon_and_reseller__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Account.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AMLAW_Rankings__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AMLAW_Rankings__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AM_Law_Ranking_2009__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AM_Law_Ranking_2009__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AM_Law_Ranking_2010__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AM_Law_Ranking_2010__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountContactRoles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccountContactRoles"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountPartnersFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccountPartnersFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountPartnersTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccountPartnersTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccountSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account_Alert__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account_Alert__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account_Count__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account_Count__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acct_Owner__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Acct_Owner__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acct_Owner__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Acct_Owner__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active_kPlex_Client__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Active_kPlex_Client__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("admin_Certifications__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Admin_Certifications__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("analytic_Snapshots__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Analytic_Snapshots__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assets");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Assets"));
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
        elemField.setFieldName("best_In_Services1__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Best_In_Services1__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("best_in_Service__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Best_in_Service__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("best_in_Service__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Best_in_Service__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biS_End_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BiS_End_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biS_Start_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BiS_Start_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("cases");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Cases"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Category__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel_Manager_Outlines__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Channel_Manager_Outlines__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("client_Since__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Client_Since__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("client_Testimonials__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Client_Testimonials__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("client_Type_Analytic_Snapshot__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Client_Type_Analytic_Snapshot__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("client_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Client_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collection_Issue__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Collection_Issue__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("concurforce__AccruedUnApprovedExpenseTotal__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__AccruedUnApprovedExpenseTotal__c"));
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
        elemField.setFieldName("concurforce__Expense_Total_Account__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__Expense_Total_Account__r"));
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
        elemField.setFieldName("contacts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contacts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Content__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contracts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contracts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("country__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Country__c"));
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
        elemField.setFieldName("current_AMLAW_Ranking__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Current_AMLAW_Ranking__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_Became_PHP__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Became_PHP__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("db_SQL_Environment_Email__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Db_SQL_Environment_Email__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("demos1__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Demos1__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("dunsNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DunsNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evaluation_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Evaluation_Type__c"));
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
        elemField.setFieldName("FTP_Login__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FTP_Login__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FTP_Password__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FTP_Password__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FTP_Preferred__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FTP_Preferred__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fax"));
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
        elemField.setFieldName("feeds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Feeds"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fortune_Ranking__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fortune_Ranking__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("functional_Trial__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Functional_Trial__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("global_Account__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Global_Account__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("has_Custom_Solution__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Has_Custom_Solution__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("has_Non_Licensing_DLLs__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Has_Non_Licensing_DLLs__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("has_Test_Instance__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Has_Test_Instance__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("have_Client_Logo__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Have_Client_Logo__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("have_Client_Testimonial__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Have_Client_Testimonial__c"));
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
        elemField.setFieldName("ideas_Site_Setups__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Ideas_Site_Setups__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industry__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Industry__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industry__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Industry__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Industry__c"));
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
        elemField.setFieldName("integration_Notes__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Integration_Notes__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("international_Client__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "International_Client__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCustomerPortal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsCustomerPortal"));
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
        elemField.setFieldName("jigsaw");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Jigsaw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jigsawCompanyId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "JigsawCompanyId"));
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
        elemField.setFieldName("legal_Entity__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Legal_Entity__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logo_Testimonial_Trackings__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Logo_Testimonial_Trackings__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MasterRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterRecordId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MasterRecordId"));
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
        elemField.setFieldName("naicsCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NaicsCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("naicsDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NaicsDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("notes__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Notes__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number_Count__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Number_Count__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number_of_Pilot_Opportunites__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Number_of_Pilot_Opportunites__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("opportunityPartnersTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityPartnersTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunity_AM_Law_Ranking__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Opportunity_AM_Law_Ranking__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunity__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Opportunity__r"));
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
        elemField.setFieldName("POC_s__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "POC_s__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ParentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnersFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PartnersFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnersTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PartnersTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pilot__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pilot__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pod_Extension__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pod_Extension__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pod__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pod__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primary_Contact_Email_Address__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Primary_Contact_Email_Address__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primary_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Primary_Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primary_Contact__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Primary_Contact__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primary_Instance_Go_Live__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Primary_Instance_Go_Live__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primary_Instance_Version1__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Primary_Instance_Version1__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primary_Instance__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Primary_Instance__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primary_Instance__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Primary_Instance__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Instance__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primary_Marketing_Contact_Email__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Primary_Marketing_Contact_Email__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primary_Marketing_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Primary_Marketing_Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primary_Marketing_Contact__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Primary_Marketing_Contact__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primary_Relativity_Version__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Primary_Relativity_Version__c"));
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
        elemField.setFieldName("product_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Product_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchase_Orders__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Purchase_Orders__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RAR_DLs__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RAR_DLs__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RA_Monthly_Usages__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RA_Monthly_Usages__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("region__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Region__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("related_Instances__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Related_Instances__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relativity_URL__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relativity_URL__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relativity_Version__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relativity_Version__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relativity_Version__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relativity_Version__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Release__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reseller_Opportunities__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Reseller_Opportunities__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reseller_Partner__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Reseller_Partner__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reseller_Tier__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Reseller_Tier__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sales_Contact_Email__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Sales_Contact_Email__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sales_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Sales_Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sales_Distribution_List__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Sales_Distribution_List__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sales_Support_Login__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Sales_Support_Login__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sales_Support_Password__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Sales_Support_Password__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("sicDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SicDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("software_Solutions__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Software_Solutions__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status_Meetings__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status_Meetings__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("support_CC_Emails__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Support_CC_Emails__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("support_Contact_Email__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Support_Contact_Email__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("support_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Support_Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("support_Distribution_List__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Support_Distribution_List__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("support_Hours__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Support_Hours__c"));
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
        elemField.setFieldName("tradestyle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tradestyle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("transactions__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Transactions__r"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type_Analytic_Snapshot__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Type_Analytic_Snapshot__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URL_of_CoBranded_Collateral__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "URL_of_CoBranded_Collateral__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unique_Users__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Unique_Users__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_License__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User_License__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VM_Instances__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "VM_Instances__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verto_Beta_User__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Verto_Beta_User__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("website");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Website"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("won_and_Consulting__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Won_and_Consulting__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("won_and_Corporation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Won_and_Corporation__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("won_and_Government__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Won_and_Government__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("won_and_ISV__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Won_and_ISV__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("won_and_Law_Firm__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Won_and_Law_Firm__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("won_and_Premium__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Won_and_Premium__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("works_With_GeorgeJon__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Works_With_GeorgeJon__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yearStarted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "YearStarted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("won_and_reseller__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "won_and_reseller__c"));
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

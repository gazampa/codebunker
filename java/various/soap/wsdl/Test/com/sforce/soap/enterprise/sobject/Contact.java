/**
 * Contact.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Contact  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.sobject.Account account;

    private com.sforce.soap.enterprise.QueryResult accountContactRoles;

    private java.lang.String accountId;

    private com.sforce.soap.enterprise.QueryResult accounts1__r;

    private com.sforce.soap.enterprise.QueryResult accounts__r;

    private java.lang.String active_Contact__c;

    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private com.sforce.soap.enterprise.QueryResult admin_Certifications__r;

    private java.lang.String admin_Contact__c;

    private java.lang.Boolean adminsitrative_Contact__c;

    private java.lang.String alert__c;

    private com.sforce.soap.enterprise.QueryResult analytic_Snapshots__r;

    private java.lang.Double analytics_Training_Test_Score__c;

    private java.lang.Boolean answer_Digest_Opt_Out__c;

    private com.sforce.soap.enterprise.QueryResult answer_Digest_Subscribed_Categories__r;

    private java.lang.String answer_Digest_Subscription_Type__c;

    private com.sforce.soap.enterprise.QueryResult assets;

    private java.lang.Boolean assisted_Review_Newsletter_Opt_Out__c;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String attended_Relativity_Analytics_Overview__c;

    private java.lang.String attended_Relativity_Sales_Training__c;

    private java.lang.String attended_Reseller_Sales_Training__c;

    private java.lang.String best_Time_to_Contact__c;

    private java.lang.String best_Way_to_Contact__c;

    private com.sforce.soap.enterprise.QueryResult campaignMembers;

    private com.sforce.soap.enterprise.QueryResult caseContactRoles;

    private com.sforce.soap.enterprise.QueryResult cases;

    private com.sforce.soap.enterprise.QueryResult cases1__r;

    private com.sforce.soap.enterprise.QueryResult cases__r;

    private java.lang.String certification_Contact__c;

    private com.sforce.soap.enterprise.sobject.Certification_Contact__c certification_Contact__r;

    private java.lang.Double certification_Updates__c;

    private java.lang.Boolean certified_Admin__c;

    private com.sforce.soap.enterprise.QueryResult channel_Mgr_Outline_Contacts__r;

    private com.sforce.soap.enterprise.QueryResult channel_Mgr_Outlines1__r;

    private com.sforce.soap.enterprise.QueryResult channel_Mgr_Outlines__r;

    private java.lang.String conference_Special_Needs__c;

    private java.lang.String contact_CC_Email__c;

    private java.lang.String contact_Types__c;

    private com.sforce.soap.enterprise.QueryResult contact__r;

    private com.sforce.soap.enterprise.QueryResult contractContactRoles;

    private com.sforce.soap.enterprise.QueryResult contractsSigned;

    private com.sforce.soap.enterprise.QueryResult courier1__Recipients__r;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String current_RCA__c;

    private com.sforce.soap.enterprise.QueryResult demo_Certifications__r;

    private com.sforce.soap.enterprise.QueryResult demos__r;

    private java.lang.String description;

    private java.lang.String email;

    private java.util.Calendar emailBouncedDate;

    private java.lang.String emailBouncedReason;

    private com.sforce.soap.enterprise.QueryResult emailStatuses;

    private java.lang.String email_Recipient__c;

    private com.sforce.soap.enterprise.QueryResult eventRelations;

    private com.sforce.soap.enterprise.QueryResult event_Attendees__r;

    private com.sforce.soap.enterprise.QueryResult events;

    private com.sforce.soap.enterprise.QueryResult exam_Attendees__r;

    private java.lang.Boolean executive_Contact__c;

    private java.lang.String executive__c;

    private java.lang.String fax;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult feeds;

    private java.lang.Boolean fest_Newsletter_Opt_Out__c;

    private java.lang.String firstName;

    private java.lang.String food_Allergies_Needs__c;

    private java.lang.Boolean hasOptedOutOfEmail;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.Boolean idea_Digest_Opt_Out__c;

    private java.lang.String idea_Digest_Subscription_Type__c;

    private com.sforce.soap.enterprise.QueryResult instances1__r;

    private com.sforce.soap.enterprise.QueryResult instances__r;

    private java.lang.String internal_Department_Sub__c;

    private java.lang.String internal_Department__c;

    private java.lang.Boolean isDeleted;

    private java.lang.String jigsaw;

    private java.lang.String jigsawContactId;

    private java.util.Date lastActivityDate;

    private java.util.Calendar lastCURequestDate;

    private java.util.Calendar lastCUUpdateDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String lastName;

    private com.sforce.soap.enterprise.QueryResult logo_Testimonial_Trackings__r;

    private java.lang.String mailingCity;

    private java.lang.String mailingCountry;

    private java.lang.String mailingPostalCode;

    private java.lang.String mailingState;

    private java.lang.String mailingStreet;

    private java.lang.String marketing__c;

    private com.sforce.soap.enterprise.sobject.Contact masterRecord;

    private java.lang.String masterRecordId;

    private com.sforce.soap.enterprise.QueryResult meetings__r;

    private java.lang.String mobilePhone;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private java.lang.Double number_of_Related_Contacts__c;

    private java.lang.Double number_of_Times_Renewed__c;

    private com.sforce.soap.enterprise.QueryResult onsite_Visit_Attendees__r;

    private com.sforce.soap.enterprise.QueryResult openActivities;

    private com.sforce.soap.enterprise.QueryResult opportunities;

    private com.sforce.soap.enterprise.QueryResult opportunityContactRoles;

    private java.lang.String otherCity;

    private java.lang.String otherCountry;

    private java.lang.String otherPhone;

    private java.lang.String otherPostalCode;

    private java.lang.String otherState;

    private java.lang.String otherStreet;

    private com.sforce.soap.enterprise.sobject.User owner;

    private java.lang.String ownerId;

    private java.lang.String phone;

    private com.sforce.soap.enterprise.QueryResult pilots1__r;

    private com.sforce.soap.enterprise.QueryResult pilots2__r;

    private com.sforce.soap.enterprise.QueryResult pilots__r;

    private java.lang.String platform_Enhancements__c;

    private java.lang.String preferred_Method_of_Contact__c;

    private java.lang.String primary_Admin_Contact__c;

    private com.sforce.soap.enterprise.QueryResult primary_Contacts1__r;

    private com.sforce.soap.enterprise.QueryResult primary_Contacts__r;

    private java.lang.Boolean primary_Marketing_Contact__c;

    private java.lang.Boolean primary_Sales_Contact__c;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private com.sforce.soap.enterprise.QueryResult RAR_DLs__r;

    private java.lang.String RCA_2__c;

    private java.util.Date RCA_Certification_End_Date__c;

    private java.util.Date RCA_Certified_Date__c;

    private java.lang.String RCA_Contact__c;

    private com.sforce.soap.enterprise.sobject.Contact RCA_Contact__r;

    private java.util.Date RCA_End_Date__c;

    private java.util.Date RCA_Start_Date__c;

    private java.lang.Boolean RCA__c;

    private java.lang.Double RCE_Credit_Total__c;

    private com.sforce.soap.enterprise.QueryResult RCE_Credits__r;

    private java.lang.Double RCE_Credits_for_Current_Year__c;

    private java.lang.String RCSP_Certified__c;

    private java.lang.Boolean RCSP__c;

    private java.lang.Boolean registered_for_Relativity_Fest_2012__c;

    private java.lang.String registered_for_Userfest_2010__c;

    private java.lang.String relativity_Assisted_Review_Newsletter__c;

    private java.lang.String relativity_Fest_Newsletter__c;

    private java.lang.Boolean reseller_Point_of_Contact__c;

    private java.lang.Double reseller_Sales_Training_Test_Score__c;

    private com.sforce.soap.enterprise.QueryResult SFDC_Projects__r;

    private com.sforce.soap.enterprise.QueryResult SWAG__r;

    private java.lang.Boolean sales_Distribution_List__c;

    private com.sforce.soap.enterprise.QueryResult sales_Training_Surveys__r;

    private java.lang.Double sales_Training_Test_Score__c;

    private java.lang.String sales__c;

    private java.lang.String salutation;

    private java.lang.Boolean script_Xchg_Digest_Opt_Out__c;

    private java.lang.String script_Xchg_Digest_Subscription_Type__c;

    private java.lang.Boolean send_Email__c;

    private java.lang.Boolean send_RCA_Credit_Email__c;

    private java.lang.Boolean send_Sales_Cert_Survey__c;

    private com.sforce.soap.enterprise.QueryResult shares;

    private java.lang.String shirt_Size__c;

    private com.sforce.soap.enterprise.QueryResult status_Meeting_Attendees__r;

    private com.sforce.soap.enterprise.QueryResult status_Meetings__r;

    private java.lang.Boolean support_Distribution_List__c;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    private com.sforce.soap.enterprise.QueryResult tickets1__r;

    private com.sforce.soap.enterprise.QueryResult tickets2__r;

    private com.sforce.soap.enterprise.QueryResult tickets3__r;

    private com.sforce.soap.enterprise.QueryResult tickets4__r;

    private com.sforce.soap.enterprise.QueryResult tickets5__r;

    private com.sforce.soap.enterprise.QueryResult tickets__r;

    private java.lang.String time_Zone__c;

    private java.lang.String title;

    private com.sforce.soap.enterprise.QueryResult to_Persistant_Contact__r;

    private com.sforce.soap.enterprise.QueryResult training_Attendees__r;

    private com.sforce.soap.enterprise.QueryResult training_Questions__r;

    private com.sforce.soap.enterprise.QueryResult trainings1__r;

    private com.sforce.soap.enterprise.QueryResult trainings__r;

    private java.lang.String blonk_News_and_Press__c;

    public Contact() {
    }

    public Contact(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.sobject.Account account,
           com.sforce.soap.enterprise.QueryResult accountContactRoles,
           java.lang.String accountId,
           com.sforce.soap.enterprise.QueryResult accounts1__r,
           com.sforce.soap.enterprise.QueryResult accounts__r,
           java.lang.String active_Contact__c,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           com.sforce.soap.enterprise.QueryResult admin_Certifications__r,
           java.lang.String admin_Contact__c,
           java.lang.Boolean adminsitrative_Contact__c,
           java.lang.String alert__c,
           com.sforce.soap.enterprise.QueryResult analytic_Snapshots__r,
           java.lang.Double analytics_Training_Test_Score__c,
           java.lang.Boolean answer_Digest_Opt_Out__c,
           com.sforce.soap.enterprise.QueryResult answer_Digest_Subscribed_Categories__r,
           java.lang.String answer_Digest_Subscription_Type__c,
           com.sforce.soap.enterprise.QueryResult assets,
           java.lang.Boolean assisted_Review_Newsletter_Opt_Out__c,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String attended_Relativity_Analytics_Overview__c,
           java.lang.String attended_Relativity_Sales_Training__c,
           java.lang.String attended_Reseller_Sales_Training__c,
           java.lang.String best_Time_to_Contact__c,
           java.lang.String best_Way_to_Contact__c,
           com.sforce.soap.enterprise.QueryResult campaignMembers,
           com.sforce.soap.enterprise.QueryResult caseContactRoles,
           com.sforce.soap.enterprise.QueryResult cases,
           com.sforce.soap.enterprise.QueryResult cases1__r,
           com.sforce.soap.enterprise.QueryResult cases__r,
           java.lang.String certification_Contact__c,
           com.sforce.soap.enterprise.sobject.Certification_Contact__c certification_Contact__r,
           java.lang.Double certification_Updates__c,
           java.lang.Boolean certified_Admin__c,
           com.sforce.soap.enterprise.QueryResult channel_Mgr_Outline_Contacts__r,
           com.sforce.soap.enterprise.QueryResult channel_Mgr_Outlines1__r,
           com.sforce.soap.enterprise.QueryResult channel_Mgr_Outlines__r,
           java.lang.String conference_Special_Needs__c,
           java.lang.String contact_CC_Email__c,
           java.lang.String contact_Types__c,
           com.sforce.soap.enterprise.QueryResult contact__r,
           com.sforce.soap.enterprise.QueryResult contractContactRoles,
           com.sforce.soap.enterprise.QueryResult contractsSigned,
           com.sforce.soap.enterprise.QueryResult courier1__Recipients__r,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String current_RCA__c,
           com.sforce.soap.enterprise.QueryResult demo_Certifications__r,
           com.sforce.soap.enterprise.QueryResult demos__r,
           java.lang.String description,
           java.lang.String email,
           java.util.Calendar emailBouncedDate,
           java.lang.String emailBouncedReason,
           com.sforce.soap.enterprise.QueryResult emailStatuses,
           java.lang.String email_Recipient__c,
           com.sforce.soap.enterprise.QueryResult eventRelations,
           com.sforce.soap.enterprise.QueryResult event_Attendees__r,
           com.sforce.soap.enterprise.QueryResult events,
           com.sforce.soap.enterprise.QueryResult exam_Attendees__r,
           java.lang.Boolean executive_Contact__c,
           java.lang.String executive__c,
           java.lang.String fax,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult feeds,
           java.lang.Boolean fest_Newsletter_Opt_Out__c,
           java.lang.String firstName,
           java.lang.String food_Allergies_Needs__c,
           java.lang.Boolean hasOptedOutOfEmail,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.Boolean idea_Digest_Opt_Out__c,
           java.lang.String idea_Digest_Subscription_Type__c,
           com.sforce.soap.enterprise.QueryResult instances1__r,
           com.sforce.soap.enterprise.QueryResult instances__r,
           java.lang.String internal_Department_Sub__c,
           java.lang.String internal_Department__c,
           java.lang.Boolean isDeleted,
           java.lang.String jigsaw,
           java.lang.String jigsawContactId,
           java.util.Date lastActivityDate,
           java.util.Calendar lastCURequestDate,
           java.util.Calendar lastCUUpdateDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String lastName,
           com.sforce.soap.enterprise.QueryResult logo_Testimonial_Trackings__r,
           java.lang.String mailingCity,
           java.lang.String mailingCountry,
           java.lang.String mailingPostalCode,
           java.lang.String mailingState,
           java.lang.String mailingStreet,
           java.lang.String marketing__c,
           com.sforce.soap.enterprise.sobject.Contact masterRecord,
           java.lang.String masterRecordId,
           com.sforce.soap.enterprise.QueryResult meetings__r,
           java.lang.String mobilePhone,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           java.lang.Double number_of_Related_Contacts__c,
           java.lang.Double number_of_Times_Renewed__c,
           com.sforce.soap.enterprise.QueryResult onsite_Visit_Attendees__r,
           com.sforce.soap.enterprise.QueryResult openActivities,
           com.sforce.soap.enterprise.QueryResult opportunities,
           com.sforce.soap.enterprise.QueryResult opportunityContactRoles,
           java.lang.String otherCity,
           java.lang.String otherCountry,
           java.lang.String otherPhone,
           java.lang.String otherPostalCode,
           java.lang.String otherState,
           java.lang.String otherStreet,
           com.sforce.soap.enterprise.sobject.User owner,
           java.lang.String ownerId,
           java.lang.String phone,
           com.sforce.soap.enterprise.QueryResult pilots1__r,
           com.sforce.soap.enterprise.QueryResult pilots2__r,
           com.sforce.soap.enterprise.QueryResult pilots__r,
           java.lang.String platform_Enhancements__c,
           java.lang.String preferred_Method_of_Contact__c,
           java.lang.String primary_Admin_Contact__c,
           com.sforce.soap.enterprise.QueryResult primary_Contacts1__r,
           com.sforce.soap.enterprise.QueryResult primary_Contacts__r,
           java.lang.Boolean primary_Marketing_Contact__c,
           java.lang.Boolean primary_Sales_Contact__c,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           com.sforce.soap.enterprise.QueryResult RAR_DLs__r,
           java.lang.String RCA_2__c,
           java.util.Date RCA_Certification_End_Date__c,
           java.util.Date RCA_Certified_Date__c,
           java.lang.String RCA_Contact__c,
           com.sforce.soap.enterprise.sobject.Contact RCA_Contact__r,
           java.util.Date RCA_End_Date__c,
           java.util.Date RCA_Start_Date__c,
           java.lang.Boolean RCA__c,
           java.lang.Double RCE_Credit_Total__c,
           com.sforce.soap.enterprise.QueryResult RCE_Credits__r,
           java.lang.Double RCE_Credits_for_Current_Year__c,
           java.lang.String RCSP_Certified__c,
           java.lang.Boolean RCSP__c,
           java.lang.Boolean registered_for_Relativity_Fest_2012__c,
           java.lang.String registered_for_Userfest_2010__c,
           java.lang.String relativity_Assisted_Review_Newsletter__c,
           java.lang.String relativity_Fest_Newsletter__c,
           java.lang.Boolean reseller_Point_of_Contact__c,
           java.lang.Double reseller_Sales_Training_Test_Score__c,
           com.sforce.soap.enterprise.QueryResult SFDC_Projects__r,
           com.sforce.soap.enterprise.QueryResult SWAG__r,
           java.lang.Boolean sales_Distribution_List__c,
           com.sforce.soap.enterprise.QueryResult sales_Training_Surveys__r,
           java.lang.Double sales_Training_Test_Score__c,
           java.lang.String sales__c,
           java.lang.String salutation,
           java.lang.Boolean script_Xchg_Digest_Opt_Out__c,
           java.lang.String script_Xchg_Digest_Subscription_Type__c,
           java.lang.Boolean send_Email__c,
           java.lang.Boolean send_RCA_Credit_Email__c,
           java.lang.Boolean send_Sales_Cert_Survey__c,
           com.sforce.soap.enterprise.QueryResult shares,
           java.lang.String shirt_Size__c,
           com.sforce.soap.enterprise.QueryResult status_Meeting_Attendees__r,
           com.sforce.soap.enterprise.QueryResult status_Meetings__r,
           java.lang.Boolean support_Distribution_List__c,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks,
           com.sforce.soap.enterprise.QueryResult tickets1__r,
           com.sforce.soap.enterprise.QueryResult tickets2__r,
           com.sforce.soap.enterprise.QueryResult tickets3__r,
           com.sforce.soap.enterprise.QueryResult tickets4__r,
           com.sforce.soap.enterprise.QueryResult tickets5__r,
           com.sforce.soap.enterprise.QueryResult tickets__r,
           java.lang.String time_Zone__c,
           java.lang.String title,
           com.sforce.soap.enterprise.QueryResult to_Persistant_Contact__r,
           com.sforce.soap.enterprise.QueryResult training_Attendees__r,
           com.sforce.soap.enterprise.QueryResult training_Questions__r,
           com.sforce.soap.enterprise.QueryResult trainings1__r,
           com.sforce.soap.enterprise.QueryResult trainings__r,
           java.lang.String blonk_News_and_Press__c) {
        super(
            fieldsToNull,
            id);
        this.account = account;
        this.accountContactRoles = accountContactRoles;
        this.accountId = accountId;
        this.accounts1__r = accounts1__r;
        this.accounts__r = accounts__r;
        this.active_Contact__c = active_Contact__c;
        this.activityHistories = activityHistories;
        this.admin_Certifications__r = admin_Certifications__r;
        this.admin_Contact__c = admin_Contact__c;
        this.adminsitrative_Contact__c = adminsitrative_Contact__c;
        this.alert__c = alert__c;
        this.analytic_Snapshots__r = analytic_Snapshots__r;
        this.analytics_Training_Test_Score__c = analytics_Training_Test_Score__c;
        this.answer_Digest_Opt_Out__c = answer_Digest_Opt_Out__c;
        this.answer_Digest_Subscribed_Categories__r = answer_Digest_Subscribed_Categories__r;
        this.answer_Digest_Subscription_Type__c = answer_Digest_Subscription_Type__c;
        this.assets = assets;
        this.assisted_Review_Newsletter_Opt_Out__c = assisted_Review_Newsletter_Opt_Out__c;
        this.attachments = attachments;
        this.attended_Relativity_Analytics_Overview__c = attended_Relativity_Analytics_Overview__c;
        this.attended_Relativity_Sales_Training__c = attended_Relativity_Sales_Training__c;
        this.attended_Reseller_Sales_Training__c = attended_Reseller_Sales_Training__c;
        this.best_Time_to_Contact__c = best_Time_to_Contact__c;
        this.best_Way_to_Contact__c = best_Way_to_Contact__c;
        this.campaignMembers = campaignMembers;
        this.caseContactRoles = caseContactRoles;
        this.cases = cases;
        this.cases1__r = cases1__r;
        this.cases__r = cases__r;
        this.certification_Contact__c = certification_Contact__c;
        this.certification_Contact__r = certification_Contact__r;
        this.certification_Updates__c = certification_Updates__c;
        this.certified_Admin__c = certified_Admin__c;
        this.channel_Mgr_Outline_Contacts__r = channel_Mgr_Outline_Contacts__r;
        this.channel_Mgr_Outlines1__r = channel_Mgr_Outlines1__r;
        this.channel_Mgr_Outlines__r = channel_Mgr_Outlines__r;
        this.conference_Special_Needs__c = conference_Special_Needs__c;
        this.contact_CC_Email__c = contact_CC_Email__c;
        this.contact_Types__c = contact_Types__c;
        this.contact__r = contact__r;
        this.contractContactRoles = contractContactRoles;
        this.contractsSigned = contractsSigned;
        this.courier1__Recipients__r = courier1__Recipients__r;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.current_RCA__c = current_RCA__c;
        this.demo_Certifications__r = demo_Certifications__r;
        this.demos__r = demos__r;
        this.description = description;
        this.email = email;
        this.emailBouncedDate = emailBouncedDate;
        this.emailBouncedReason = emailBouncedReason;
        this.emailStatuses = emailStatuses;
        this.email_Recipient__c = email_Recipient__c;
        this.eventRelations = eventRelations;
        this.event_Attendees__r = event_Attendees__r;
        this.events = events;
        this.exam_Attendees__r = exam_Attendees__r;
        this.executive_Contact__c = executive_Contact__c;
        this.executive__c = executive__c;
        this.fax = fax;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.feeds = feeds;
        this.fest_Newsletter_Opt_Out__c = fest_Newsletter_Opt_Out__c;
        this.firstName = firstName;
        this.food_Allergies_Needs__c = food_Allergies_Needs__c;
        this.hasOptedOutOfEmail = hasOptedOutOfEmail;
        this.histories = histories;
        this.idea_Digest_Opt_Out__c = idea_Digest_Opt_Out__c;
        this.idea_Digest_Subscription_Type__c = idea_Digest_Subscription_Type__c;
        this.instances1__r = instances1__r;
        this.instances__r = instances__r;
        this.internal_Department_Sub__c = internal_Department_Sub__c;
        this.internal_Department__c = internal_Department__c;
        this.isDeleted = isDeleted;
        this.jigsaw = jigsaw;
        this.jigsawContactId = jigsawContactId;
        this.lastActivityDate = lastActivityDate;
        this.lastCURequestDate = lastCURequestDate;
        this.lastCUUpdateDate = lastCUUpdateDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.lastName = lastName;
        this.logo_Testimonial_Trackings__r = logo_Testimonial_Trackings__r;
        this.mailingCity = mailingCity;
        this.mailingCountry = mailingCountry;
        this.mailingPostalCode = mailingPostalCode;
        this.mailingState = mailingState;
        this.mailingStreet = mailingStreet;
        this.marketing__c = marketing__c;
        this.masterRecord = masterRecord;
        this.masterRecordId = masterRecordId;
        this.meetings__r = meetings__r;
        this.mobilePhone = mobilePhone;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.number_of_Related_Contacts__c = number_of_Related_Contacts__c;
        this.number_of_Times_Renewed__c = number_of_Times_Renewed__c;
        this.onsite_Visit_Attendees__r = onsite_Visit_Attendees__r;
        this.openActivities = openActivities;
        this.opportunities = opportunities;
        this.opportunityContactRoles = opportunityContactRoles;
        this.otherCity = otherCity;
        this.otherCountry = otherCountry;
        this.otherPhone = otherPhone;
        this.otherPostalCode = otherPostalCode;
        this.otherState = otherState;
        this.otherStreet = otherStreet;
        this.owner = owner;
        this.ownerId = ownerId;
        this.phone = phone;
        this.pilots1__r = pilots1__r;
        this.pilots2__r = pilots2__r;
        this.pilots__r = pilots__r;
        this.platform_Enhancements__c = platform_Enhancements__c;
        this.preferred_Method_of_Contact__c = preferred_Method_of_Contact__c;
        this.primary_Admin_Contact__c = primary_Admin_Contact__c;
        this.primary_Contacts1__r = primary_Contacts1__r;
        this.primary_Contacts__r = primary_Contacts__r;
        this.primary_Marketing_Contact__c = primary_Marketing_Contact__c;
        this.primary_Sales_Contact__c = primary_Sales_Contact__c;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.RAR_DLs__r = RAR_DLs__r;
        this.RCA_2__c = RCA_2__c;
        this.RCA_Certification_End_Date__c = RCA_Certification_End_Date__c;
        this.RCA_Certified_Date__c = RCA_Certified_Date__c;
        this.RCA_Contact__c = RCA_Contact__c;
        this.RCA_Contact__r = RCA_Contact__r;
        this.RCA_End_Date__c = RCA_End_Date__c;
        this.RCA_Start_Date__c = RCA_Start_Date__c;
        this.RCA__c = RCA__c;
        this.RCE_Credit_Total__c = RCE_Credit_Total__c;
        this.RCE_Credits__r = RCE_Credits__r;
        this.RCE_Credits_for_Current_Year__c = RCE_Credits_for_Current_Year__c;
        this.RCSP_Certified__c = RCSP_Certified__c;
        this.RCSP__c = RCSP__c;
        this.registered_for_Relativity_Fest_2012__c = registered_for_Relativity_Fest_2012__c;
        this.registered_for_Userfest_2010__c = registered_for_Userfest_2010__c;
        this.relativity_Assisted_Review_Newsletter__c = relativity_Assisted_Review_Newsletter__c;
        this.relativity_Fest_Newsletter__c = relativity_Fest_Newsletter__c;
        this.reseller_Point_of_Contact__c = reseller_Point_of_Contact__c;
        this.reseller_Sales_Training_Test_Score__c = reseller_Sales_Training_Test_Score__c;
        this.SFDC_Projects__r = SFDC_Projects__r;
        this.SWAG__r = SWAG__r;
        this.sales_Distribution_List__c = sales_Distribution_List__c;
        this.sales_Training_Surveys__r = sales_Training_Surveys__r;
        this.sales_Training_Test_Score__c = sales_Training_Test_Score__c;
        this.sales__c = sales__c;
        this.salutation = salutation;
        this.script_Xchg_Digest_Opt_Out__c = script_Xchg_Digest_Opt_Out__c;
        this.script_Xchg_Digest_Subscription_Type__c = script_Xchg_Digest_Subscription_Type__c;
        this.send_Email__c = send_Email__c;
        this.send_RCA_Credit_Email__c = send_RCA_Credit_Email__c;
        this.send_Sales_Cert_Survey__c = send_Sales_Cert_Survey__c;
        this.shares = shares;
        this.shirt_Size__c = shirt_Size__c;
        this.status_Meeting_Attendees__r = status_Meeting_Attendees__r;
        this.status_Meetings__r = status_Meetings__r;
        this.support_Distribution_List__c = support_Distribution_List__c;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
        this.tickets1__r = tickets1__r;
        this.tickets2__r = tickets2__r;
        this.tickets3__r = tickets3__r;
        this.tickets4__r = tickets4__r;
        this.tickets5__r = tickets5__r;
        this.tickets__r = tickets__r;
        this.time_Zone__c = time_Zone__c;
        this.title = title;
        this.to_Persistant_Contact__r = to_Persistant_Contact__r;
        this.training_Attendees__r = training_Attendees__r;
        this.training_Questions__r = training_Questions__r;
        this.trainings1__r = trainings1__r;
        this.trainings__r = trainings__r;
        this.blonk_News_and_Press__c = blonk_News_and_Press__c;
    }


    /**
     * Gets the account value for this Contact.
     * 
     * @return account
     */
    public com.sforce.soap.enterprise.sobject.Account getAccount() {
        return account;
    }


    /**
     * Sets the account value for this Contact.
     * 
     * @param account
     */
    public void setAccount(com.sforce.soap.enterprise.sobject.Account account) {
        this.account = account;
    }


    /**
     * Gets the accountContactRoles value for this Contact.
     * 
     * @return accountContactRoles
     */
    public com.sforce.soap.enterprise.QueryResult getAccountContactRoles() {
        return accountContactRoles;
    }


    /**
     * Sets the accountContactRoles value for this Contact.
     * 
     * @param accountContactRoles
     */
    public void setAccountContactRoles(com.sforce.soap.enterprise.QueryResult accountContactRoles) {
        this.accountContactRoles = accountContactRoles;
    }


    /**
     * Gets the accountId value for this Contact.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this Contact.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the accounts1__r value for this Contact.
     * 
     * @return accounts1__r
     */
    public com.sforce.soap.enterprise.QueryResult getAccounts1__r() {
        return accounts1__r;
    }


    /**
     * Sets the accounts1__r value for this Contact.
     * 
     * @param accounts1__r
     */
    public void setAccounts1__r(com.sforce.soap.enterprise.QueryResult accounts1__r) {
        this.accounts1__r = accounts1__r;
    }


    /**
     * Gets the accounts__r value for this Contact.
     * 
     * @return accounts__r
     */
    public com.sforce.soap.enterprise.QueryResult getAccounts__r() {
        return accounts__r;
    }


    /**
     * Sets the accounts__r value for this Contact.
     * 
     * @param accounts__r
     */
    public void setAccounts__r(com.sforce.soap.enterprise.QueryResult accounts__r) {
        this.accounts__r = accounts__r;
    }


    /**
     * Gets the active_Contact__c value for this Contact.
     * 
     * @return active_Contact__c
     */
    public java.lang.String getActive_Contact__c() {
        return active_Contact__c;
    }


    /**
     * Sets the active_Contact__c value for this Contact.
     * 
     * @param active_Contact__c
     */
    public void setActive_Contact__c(java.lang.String active_Contact__c) {
        this.active_Contact__c = active_Contact__c;
    }


    /**
     * Gets the activityHistories value for this Contact.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this Contact.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the admin_Certifications__r value for this Contact.
     * 
     * @return admin_Certifications__r
     */
    public com.sforce.soap.enterprise.QueryResult getAdmin_Certifications__r() {
        return admin_Certifications__r;
    }


    /**
     * Sets the admin_Certifications__r value for this Contact.
     * 
     * @param admin_Certifications__r
     */
    public void setAdmin_Certifications__r(com.sforce.soap.enterprise.QueryResult admin_Certifications__r) {
        this.admin_Certifications__r = admin_Certifications__r;
    }


    /**
     * Gets the admin_Contact__c value for this Contact.
     * 
     * @return admin_Contact__c
     */
    public java.lang.String getAdmin_Contact__c() {
        return admin_Contact__c;
    }


    /**
     * Sets the admin_Contact__c value for this Contact.
     * 
     * @param admin_Contact__c
     */
    public void setAdmin_Contact__c(java.lang.String admin_Contact__c) {
        this.admin_Contact__c = admin_Contact__c;
    }


    /**
     * Gets the adminsitrative_Contact__c value for this Contact.
     * 
     * @return adminsitrative_Contact__c
     */
    public java.lang.Boolean getAdminsitrative_Contact__c() {
        return adminsitrative_Contact__c;
    }


    /**
     * Sets the adminsitrative_Contact__c value for this Contact.
     * 
     * @param adminsitrative_Contact__c
     */
    public void setAdminsitrative_Contact__c(java.lang.Boolean adminsitrative_Contact__c) {
        this.adminsitrative_Contact__c = adminsitrative_Contact__c;
    }


    /**
     * Gets the alert__c value for this Contact.
     * 
     * @return alert__c
     */
    public java.lang.String getAlert__c() {
        return alert__c;
    }


    /**
     * Sets the alert__c value for this Contact.
     * 
     * @param alert__c
     */
    public void setAlert__c(java.lang.String alert__c) {
        this.alert__c = alert__c;
    }


    /**
     * Gets the analytic_Snapshots__r value for this Contact.
     * 
     * @return analytic_Snapshots__r
     */
    public com.sforce.soap.enterprise.QueryResult getAnalytic_Snapshots__r() {
        return analytic_Snapshots__r;
    }


    /**
     * Sets the analytic_Snapshots__r value for this Contact.
     * 
     * @param analytic_Snapshots__r
     */
    public void setAnalytic_Snapshots__r(com.sforce.soap.enterprise.QueryResult analytic_Snapshots__r) {
        this.analytic_Snapshots__r = analytic_Snapshots__r;
    }


    /**
     * Gets the analytics_Training_Test_Score__c value for this Contact.
     * 
     * @return analytics_Training_Test_Score__c
     */
    public java.lang.Double getAnalytics_Training_Test_Score__c() {
        return analytics_Training_Test_Score__c;
    }


    /**
     * Sets the analytics_Training_Test_Score__c value for this Contact.
     * 
     * @param analytics_Training_Test_Score__c
     */
    public void setAnalytics_Training_Test_Score__c(java.lang.Double analytics_Training_Test_Score__c) {
        this.analytics_Training_Test_Score__c = analytics_Training_Test_Score__c;
    }


    /**
     * Gets the answer_Digest_Opt_Out__c value for this Contact.
     * 
     * @return answer_Digest_Opt_Out__c
     */
    public java.lang.Boolean getAnswer_Digest_Opt_Out__c() {
        return answer_Digest_Opt_Out__c;
    }


    /**
     * Sets the answer_Digest_Opt_Out__c value for this Contact.
     * 
     * @param answer_Digest_Opt_Out__c
     */
    public void setAnswer_Digest_Opt_Out__c(java.lang.Boolean answer_Digest_Opt_Out__c) {
        this.answer_Digest_Opt_Out__c = answer_Digest_Opt_Out__c;
    }


    /**
     * Gets the answer_Digest_Subscribed_Categories__r value for this Contact.
     * 
     * @return answer_Digest_Subscribed_Categories__r
     */
    public com.sforce.soap.enterprise.QueryResult getAnswer_Digest_Subscribed_Categories__r() {
        return answer_Digest_Subscribed_Categories__r;
    }


    /**
     * Sets the answer_Digest_Subscribed_Categories__r value for this Contact.
     * 
     * @param answer_Digest_Subscribed_Categories__r
     */
    public void setAnswer_Digest_Subscribed_Categories__r(com.sforce.soap.enterprise.QueryResult answer_Digest_Subscribed_Categories__r) {
        this.answer_Digest_Subscribed_Categories__r = answer_Digest_Subscribed_Categories__r;
    }


    /**
     * Gets the answer_Digest_Subscription_Type__c value for this Contact.
     * 
     * @return answer_Digest_Subscription_Type__c
     */
    public java.lang.String getAnswer_Digest_Subscription_Type__c() {
        return answer_Digest_Subscription_Type__c;
    }


    /**
     * Sets the answer_Digest_Subscription_Type__c value for this Contact.
     * 
     * @param answer_Digest_Subscription_Type__c
     */
    public void setAnswer_Digest_Subscription_Type__c(java.lang.String answer_Digest_Subscription_Type__c) {
        this.answer_Digest_Subscription_Type__c = answer_Digest_Subscription_Type__c;
    }


    /**
     * Gets the assets value for this Contact.
     * 
     * @return assets
     */
    public com.sforce.soap.enterprise.QueryResult getAssets() {
        return assets;
    }


    /**
     * Sets the assets value for this Contact.
     * 
     * @param assets
     */
    public void setAssets(com.sforce.soap.enterprise.QueryResult assets) {
        this.assets = assets;
    }


    /**
     * Gets the assisted_Review_Newsletter_Opt_Out__c value for this Contact.
     * 
     * @return assisted_Review_Newsletter_Opt_Out__c
     */
    public java.lang.Boolean getAssisted_Review_Newsletter_Opt_Out__c() {
        return assisted_Review_Newsletter_Opt_Out__c;
    }


    /**
     * Sets the assisted_Review_Newsletter_Opt_Out__c value for this Contact.
     * 
     * @param assisted_Review_Newsletter_Opt_Out__c
     */
    public void setAssisted_Review_Newsletter_Opt_Out__c(java.lang.Boolean assisted_Review_Newsletter_Opt_Out__c) {
        this.assisted_Review_Newsletter_Opt_Out__c = assisted_Review_Newsletter_Opt_Out__c;
    }


    /**
     * Gets the attachments value for this Contact.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Contact.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the attended_Relativity_Analytics_Overview__c value for this Contact.
     * 
     * @return attended_Relativity_Analytics_Overview__c
     */
    public java.lang.String getAttended_Relativity_Analytics_Overview__c() {
        return attended_Relativity_Analytics_Overview__c;
    }


    /**
     * Sets the attended_Relativity_Analytics_Overview__c value for this Contact.
     * 
     * @param attended_Relativity_Analytics_Overview__c
     */
    public void setAttended_Relativity_Analytics_Overview__c(java.lang.String attended_Relativity_Analytics_Overview__c) {
        this.attended_Relativity_Analytics_Overview__c = attended_Relativity_Analytics_Overview__c;
    }


    /**
     * Gets the attended_Relativity_Sales_Training__c value for this Contact.
     * 
     * @return attended_Relativity_Sales_Training__c
     */
    public java.lang.String getAttended_Relativity_Sales_Training__c() {
        return attended_Relativity_Sales_Training__c;
    }


    /**
     * Sets the attended_Relativity_Sales_Training__c value for this Contact.
     * 
     * @param attended_Relativity_Sales_Training__c
     */
    public void setAttended_Relativity_Sales_Training__c(java.lang.String attended_Relativity_Sales_Training__c) {
        this.attended_Relativity_Sales_Training__c = attended_Relativity_Sales_Training__c;
    }


    /**
     * Gets the attended_Reseller_Sales_Training__c value for this Contact.
     * 
     * @return attended_Reseller_Sales_Training__c
     */
    public java.lang.String getAttended_Reseller_Sales_Training__c() {
        return attended_Reseller_Sales_Training__c;
    }


    /**
     * Sets the attended_Reseller_Sales_Training__c value for this Contact.
     * 
     * @param attended_Reseller_Sales_Training__c
     */
    public void setAttended_Reseller_Sales_Training__c(java.lang.String attended_Reseller_Sales_Training__c) {
        this.attended_Reseller_Sales_Training__c = attended_Reseller_Sales_Training__c;
    }


    /**
     * Gets the best_Time_to_Contact__c value for this Contact.
     * 
     * @return best_Time_to_Contact__c
     */
    public java.lang.String getBest_Time_to_Contact__c() {
        return best_Time_to_Contact__c;
    }


    /**
     * Sets the best_Time_to_Contact__c value for this Contact.
     * 
     * @param best_Time_to_Contact__c
     */
    public void setBest_Time_to_Contact__c(java.lang.String best_Time_to_Contact__c) {
        this.best_Time_to_Contact__c = best_Time_to_Contact__c;
    }


    /**
     * Gets the best_Way_to_Contact__c value for this Contact.
     * 
     * @return best_Way_to_Contact__c
     */
    public java.lang.String getBest_Way_to_Contact__c() {
        return best_Way_to_Contact__c;
    }


    /**
     * Sets the best_Way_to_Contact__c value for this Contact.
     * 
     * @param best_Way_to_Contact__c
     */
    public void setBest_Way_to_Contact__c(java.lang.String best_Way_to_Contact__c) {
        this.best_Way_to_Contact__c = best_Way_to_Contact__c;
    }


    /**
     * Gets the campaignMembers value for this Contact.
     * 
     * @return campaignMembers
     */
    public com.sforce.soap.enterprise.QueryResult getCampaignMembers() {
        return campaignMembers;
    }


    /**
     * Sets the campaignMembers value for this Contact.
     * 
     * @param campaignMembers
     */
    public void setCampaignMembers(com.sforce.soap.enterprise.QueryResult campaignMembers) {
        this.campaignMembers = campaignMembers;
    }


    /**
     * Gets the caseContactRoles value for this Contact.
     * 
     * @return caseContactRoles
     */
    public com.sforce.soap.enterprise.QueryResult getCaseContactRoles() {
        return caseContactRoles;
    }


    /**
     * Sets the caseContactRoles value for this Contact.
     * 
     * @param caseContactRoles
     */
    public void setCaseContactRoles(com.sforce.soap.enterprise.QueryResult caseContactRoles) {
        this.caseContactRoles = caseContactRoles;
    }


    /**
     * Gets the cases value for this Contact.
     * 
     * @return cases
     */
    public com.sforce.soap.enterprise.QueryResult getCases() {
        return cases;
    }


    /**
     * Sets the cases value for this Contact.
     * 
     * @param cases
     */
    public void setCases(com.sforce.soap.enterprise.QueryResult cases) {
        this.cases = cases;
    }


    /**
     * Gets the cases1__r value for this Contact.
     * 
     * @return cases1__r
     */
    public com.sforce.soap.enterprise.QueryResult getCases1__r() {
        return cases1__r;
    }


    /**
     * Sets the cases1__r value for this Contact.
     * 
     * @param cases1__r
     */
    public void setCases1__r(com.sforce.soap.enterprise.QueryResult cases1__r) {
        this.cases1__r = cases1__r;
    }


    /**
     * Gets the cases__r value for this Contact.
     * 
     * @return cases__r
     */
    public com.sforce.soap.enterprise.QueryResult getCases__r() {
        return cases__r;
    }


    /**
     * Sets the cases__r value for this Contact.
     * 
     * @param cases__r
     */
    public void setCases__r(com.sforce.soap.enterprise.QueryResult cases__r) {
        this.cases__r = cases__r;
    }


    /**
     * Gets the certification_Contact__c value for this Contact.
     * 
     * @return certification_Contact__c
     */
    public java.lang.String getCertification_Contact__c() {
        return certification_Contact__c;
    }


    /**
     * Sets the certification_Contact__c value for this Contact.
     * 
     * @param certification_Contact__c
     */
    public void setCertification_Contact__c(java.lang.String certification_Contact__c) {
        this.certification_Contact__c = certification_Contact__c;
    }


    /**
     * Gets the certification_Contact__r value for this Contact.
     * 
     * @return certification_Contact__r
     */
    public com.sforce.soap.enterprise.sobject.Certification_Contact__c getCertification_Contact__r() {
        return certification_Contact__r;
    }


    /**
     * Sets the certification_Contact__r value for this Contact.
     * 
     * @param certification_Contact__r
     */
    public void setCertification_Contact__r(com.sforce.soap.enterprise.sobject.Certification_Contact__c certification_Contact__r) {
        this.certification_Contact__r = certification_Contact__r;
    }


    /**
     * Gets the certification_Updates__c value for this Contact.
     * 
     * @return certification_Updates__c
     */
    public java.lang.Double getCertification_Updates__c() {
        return certification_Updates__c;
    }


    /**
     * Sets the certification_Updates__c value for this Contact.
     * 
     * @param certification_Updates__c
     */
    public void setCertification_Updates__c(java.lang.Double certification_Updates__c) {
        this.certification_Updates__c = certification_Updates__c;
    }


    /**
     * Gets the certified_Admin__c value for this Contact.
     * 
     * @return certified_Admin__c
     */
    public java.lang.Boolean getCertified_Admin__c() {
        return certified_Admin__c;
    }


    /**
     * Sets the certified_Admin__c value for this Contact.
     * 
     * @param certified_Admin__c
     */
    public void setCertified_Admin__c(java.lang.Boolean certified_Admin__c) {
        this.certified_Admin__c = certified_Admin__c;
    }


    /**
     * Gets the channel_Mgr_Outline_Contacts__r value for this Contact.
     * 
     * @return channel_Mgr_Outline_Contacts__r
     */
    public com.sforce.soap.enterprise.QueryResult getChannel_Mgr_Outline_Contacts__r() {
        return channel_Mgr_Outline_Contacts__r;
    }


    /**
     * Sets the channel_Mgr_Outline_Contacts__r value for this Contact.
     * 
     * @param channel_Mgr_Outline_Contacts__r
     */
    public void setChannel_Mgr_Outline_Contacts__r(com.sforce.soap.enterprise.QueryResult channel_Mgr_Outline_Contacts__r) {
        this.channel_Mgr_Outline_Contacts__r = channel_Mgr_Outline_Contacts__r;
    }


    /**
     * Gets the channel_Mgr_Outlines1__r value for this Contact.
     * 
     * @return channel_Mgr_Outlines1__r
     */
    public com.sforce.soap.enterprise.QueryResult getChannel_Mgr_Outlines1__r() {
        return channel_Mgr_Outlines1__r;
    }


    /**
     * Sets the channel_Mgr_Outlines1__r value for this Contact.
     * 
     * @param channel_Mgr_Outlines1__r
     */
    public void setChannel_Mgr_Outlines1__r(com.sforce.soap.enterprise.QueryResult channel_Mgr_Outlines1__r) {
        this.channel_Mgr_Outlines1__r = channel_Mgr_Outlines1__r;
    }


    /**
     * Gets the channel_Mgr_Outlines__r value for this Contact.
     * 
     * @return channel_Mgr_Outlines__r
     */
    public com.sforce.soap.enterprise.QueryResult getChannel_Mgr_Outlines__r() {
        return channel_Mgr_Outlines__r;
    }


    /**
     * Sets the channel_Mgr_Outlines__r value for this Contact.
     * 
     * @param channel_Mgr_Outlines__r
     */
    public void setChannel_Mgr_Outlines__r(com.sforce.soap.enterprise.QueryResult channel_Mgr_Outlines__r) {
        this.channel_Mgr_Outlines__r = channel_Mgr_Outlines__r;
    }


    /**
     * Gets the conference_Special_Needs__c value for this Contact.
     * 
     * @return conference_Special_Needs__c
     */
    public java.lang.String getConference_Special_Needs__c() {
        return conference_Special_Needs__c;
    }


    /**
     * Sets the conference_Special_Needs__c value for this Contact.
     * 
     * @param conference_Special_Needs__c
     */
    public void setConference_Special_Needs__c(java.lang.String conference_Special_Needs__c) {
        this.conference_Special_Needs__c = conference_Special_Needs__c;
    }


    /**
     * Gets the contact_CC_Email__c value for this Contact.
     * 
     * @return contact_CC_Email__c
     */
    public java.lang.String getContact_CC_Email__c() {
        return contact_CC_Email__c;
    }


    /**
     * Sets the contact_CC_Email__c value for this Contact.
     * 
     * @param contact_CC_Email__c
     */
    public void setContact_CC_Email__c(java.lang.String contact_CC_Email__c) {
        this.contact_CC_Email__c = contact_CC_Email__c;
    }


    /**
     * Gets the contact_Types__c value for this Contact.
     * 
     * @return contact_Types__c
     */
    public java.lang.String getContact_Types__c() {
        return contact_Types__c;
    }


    /**
     * Sets the contact_Types__c value for this Contact.
     * 
     * @param contact_Types__c
     */
    public void setContact_Types__c(java.lang.String contact_Types__c) {
        this.contact_Types__c = contact_Types__c;
    }


    /**
     * Gets the contact__r value for this Contact.
     * 
     * @return contact__r
     */
    public com.sforce.soap.enterprise.QueryResult getContact__r() {
        return contact__r;
    }


    /**
     * Sets the contact__r value for this Contact.
     * 
     * @param contact__r
     */
    public void setContact__r(com.sforce.soap.enterprise.QueryResult contact__r) {
        this.contact__r = contact__r;
    }


    /**
     * Gets the contractContactRoles value for this Contact.
     * 
     * @return contractContactRoles
     */
    public com.sforce.soap.enterprise.QueryResult getContractContactRoles() {
        return contractContactRoles;
    }


    /**
     * Sets the contractContactRoles value for this Contact.
     * 
     * @param contractContactRoles
     */
    public void setContractContactRoles(com.sforce.soap.enterprise.QueryResult contractContactRoles) {
        this.contractContactRoles = contractContactRoles;
    }


    /**
     * Gets the contractsSigned value for this Contact.
     * 
     * @return contractsSigned
     */
    public com.sforce.soap.enterprise.QueryResult getContractsSigned() {
        return contractsSigned;
    }


    /**
     * Sets the contractsSigned value for this Contact.
     * 
     * @param contractsSigned
     */
    public void setContractsSigned(com.sforce.soap.enterprise.QueryResult contractsSigned) {
        this.contractsSigned = contractsSigned;
    }


    /**
     * Gets the courier1__Recipients__r value for this Contact.
     * 
     * @return courier1__Recipients__r
     */
    public com.sforce.soap.enterprise.QueryResult getCourier1__Recipients__r() {
        return courier1__Recipients__r;
    }


    /**
     * Sets the courier1__Recipients__r value for this Contact.
     * 
     * @param courier1__Recipients__r
     */
    public void setCourier1__Recipients__r(com.sforce.soap.enterprise.QueryResult courier1__Recipients__r) {
        this.courier1__Recipients__r = courier1__Recipients__r;
    }


    /**
     * Gets the createdBy value for this Contact.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Contact.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Contact.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Contact.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Contact.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Contact.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the current_RCA__c value for this Contact.
     * 
     * @return current_RCA__c
     */
    public java.lang.String getCurrent_RCA__c() {
        return current_RCA__c;
    }


    /**
     * Sets the current_RCA__c value for this Contact.
     * 
     * @param current_RCA__c
     */
    public void setCurrent_RCA__c(java.lang.String current_RCA__c) {
        this.current_RCA__c = current_RCA__c;
    }


    /**
     * Gets the demo_Certifications__r value for this Contact.
     * 
     * @return demo_Certifications__r
     */
    public com.sforce.soap.enterprise.QueryResult getDemo_Certifications__r() {
        return demo_Certifications__r;
    }


    /**
     * Sets the demo_Certifications__r value for this Contact.
     * 
     * @param demo_Certifications__r
     */
    public void setDemo_Certifications__r(com.sforce.soap.enterprise.QueryResult demo_Certifications__r) {
        this.demo_Certifications__r = demo_Certifications__r;
    }


    /**
     * Gets the demos__r value for this Contact.
     * 
     * @return demos__r
     */
    public com.sforce.soap.enterprise.QueryResult getDemos__r() {
        return demos__r;
    }


    /**
     * Sets the demos__r value for this Contact.
     * 
     * @param demos__r
     */
    public void setDemos__r(com.sforce.soap.enterprise.QueryResult demos__r) {
        this.demos__r = demos__r;
    }


    /**
     * Gets the description value for this Contact.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Contact.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the email value for this Contact.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Contact.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the emailBouncedDate value for this Contact.
     * 
     * @return emailBouncedDate
     */
    public java.util.Calendar getEmailBouncedDate() {
        return emailBouncedDate;
    }


    /**
     * Sets the emailBouncedDate value for this Contact.
     * 
     * @param emailBouncedDate
     */
    public void setEmailBouncedDate(java.util.Calendar emailBouncedDate) {
        this.emailBouncedDate = emailBouncedDate;
    }


    /**
     * Gets the emailBouncedReason value for this Contact.
     * 
     * @return emailBouncedReason
     */
    public java.lang.String getEmailBouncedReason() {
        return emailBouncedReason;
    }


    /**
     * Sets the emailBouncedReason value for this Contact.
     * 
     * @param emailBouncedReason
     */
    public void setEmailBouncedReason(java.lang.String emailBouncedReason) {
        this.emailBouncedReason = emailBouncedReason;
    }


    /**
     * Gets the emailStatuses value for this Contact.
     * 
     * @return emailStatuses
     */
    public com.sforce.soap.enterprise.QueryResult getEmailStatuses() {
        return emailStatuses;
    }


    /**
     * Sets the emailStatuses value for this Contact.
     * 
     * @param emailStatuses
     */
    public void setEmailStatuses(com.sforce.soap.enterprise.QueryResult emailStatuses) {
        this.emailStatuses = emailStatuses;
    }


    /**
     * Gets the email_Recipient__c value for this Contact.
     * 
     * @return email_Recipient__c
     */
    public java.lang.String getEmail_Recipient__c() {
        return email_Recipient__c;
    }


    /**
     * Sets the email_Recipient__c value for this Contact.
     * 
     * @param email_Recipient__c
     */
    public void setEmail_Recipient__c(java.lang.String email_Recipient__c) {
        this.email_Recipient__c = email_Recipient__c;
    }


    /**
     * Gets the eventRelations value for this Contact.
     * 
     * @return eventRelations
     */
    public com.sforce.soap.enterprise.QueryResult getEventRelations() {
        return eventRelations;
    }


    /**
     * Sets the eventRelations value for this Contact.
     * 
     * @param eventRelations
     */
    public void setEventRelations(com.sforce.soap.enterprise.QueryResult eventRelations) {
        this.eventRelations = eventRelations;
    }


    /**
     * Gets the event_Attendees__r value for this Contact.
     * 
     * @return event_Attendees__r
     */
    public com.sforce.soap.enterprise.QueryResult getEvent_Attendees__r() {
        return event_Attendees__r;
    }


    /**
     * Sets the event_Attendees__r value for this Contact.
     * 
     * @param event_Attendees__r
     */
    public void setEvent_Attendees__r(com.sforce.soap.enterprise.QueryResult event_Attendees__r) {
        this.event_Attendees__r = event_Attendees__r;
    }


    /**
     * Gets the events value for this Contact.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Contact.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the exam_Attendees__r value for this Contact.
     * 
     * @return exam_Attendees__r
     */
    public com.sforce.soap.enterprise.QueryResult getExam_Attendees__r() {
        return exam_Attendees__r;
    }


    /**
     * Sets the exam_Attendees__r value for this Contact.
     * 
     * @param exam_Attendees__r
     */
    public void setExam_Attendees__r(com.sforce.soap.enterprise.QueryResult exam_Attendees__r) {
        this.exam_Attendees__r = exam_Attendees__r;
    }


    /**
     * Gets the executive_Contact__c value for this Contact.
     * 
     * @return executive_Contact__c
     */
    public java.lang.Boolean getExecutive_Contact__c() {
        return executive_Contact__c;
    }


    /**
     * Sets the executive_Contact__c value for this Contact.
     * 
     * @param executive_Contact__c
     */
    public void setExecutive_Contact__c(java.lang.Boolean executive_Contact__c) {
        this.executive_Contact__c = executive_Contact__c;
    }


    /**
     * Gets the executive__c value for this Contact.
     * 
     * @return executive__c
     */
    public java.lang.String getExecutive__c() {
        return executive__c;
    }


    /**
     * Sets the executive__c value for this Contact.
     * 
     * @param executive__c
     */
    public void setExecutive__c(java.lang.String executive__c) {
        this.executive__c = executive__c;
    }


    /**
     * Gets the fax value for this Contact.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this Contact.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Contact.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Contact.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the feeds value for this Contact.
     * 
     * @return feeds
     */
    public com.sforce.soap.enterprise.QueryResult getFeeds() {
        return feeds;
    }


    /**
     * Sets the feeds value for this Contact.
     * 
     * @param feeds
     */
    public void setFeeds(com.sforce.soap.enterprise.QueryResult feeds) {
        this.feeds = feeds;
    }


    /**
     * Gets the fest_Newsletter_Opt_Out__c value for this Contact.
     * 
     * @return fest_Newsletter_Opt_Out__c
     */
    public java.lang.Boolean getFest_Newsletter_Opt_Out__c() {
        return fest_Newsletter_Opt_Out__c;
    }


    /**
     * Sets the fest_Newsletter_Opt_Out__c value for this Contact.
     * 
     * @param fest_Newsletter_Opt_Out__c
     */
    public void setFest_Newsletter_Opt_Out__c(java.lang.Boolean fest_Newsletter_Opt_Out__c) {
        this.fest_Newsletter_Opt_Out__c = fest_Newsletter_Opt_Out__c;
    }


    /**
     * Gets the firstName value for this Contact.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this Contact.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the food_Allergies_Needs__c value for this Contact.
     * 
     * @return food_Allergies_Needs__c
     */
    public java.lang.String getFood_Allergies_Needs__c() {
        return food_Allergies_Needs__c;
    }


    /**
     * Sets the food_Allergies_Needs__c value for this Contact.
     * 
     * @param food_Allergies_Needs__c
     */
    public void setFood_Allergies_Needs__c(java.lang.String food_Allergies_Needs__c) {
        this.food_Allergies_Needs__c = food_Allergies_Needs__c;
    }


    /**
     * Gets the hasOptedOutOfEmail value for this Contact.
     * 
     * @return hasOptedOutOfEmail
     */
    public java.lang.Boolean getHasOptedOutOfEmail() {
        return hasOptedOutOfEmail;
    }


    /**
     * Sets the hasOptedOutOfEmail value for this Contact.
     * 
     * @param hasOptedOutOfEmail
     */
    public void setHasOptedOutOfEmail(java.lang.Boolean hasOptedOutOfEmail) {
        this.hasOptedOutOfEmail = hasOptedOutOfEmail;
    }


    /**
     * Gets the histories value for this Contact.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Contact.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the idea_Digest_Opt_Out__c value for this Contact.
     * 
     * @return idea_Digest_Opt_Out__c
     */
    public java.lang.Boolean getIdea_Digest_Opt_Out__c() {
        return idea_Digest_Opt_Out__c;
    }


    /**
     * Sets the idea_Digest_Opt_Out__c value for this Contact.
     * 
     * @param idea_Digest_Opt_Out__c
     */
    public void setIdea_Digest_Opt_Out__c(java.lang.Boolean idea_Digest_Opt_Out__c) {
        this.idea_Digest_Opt_Out__c = idea_Digest_Opt_Out__c;
    }


    /**
     * Gets the idea_Digest_Subscription_Type__c value for this Contact.
     * 
     * @return idea_Digest_Subscription_Type__c
     */
    public java.lang.String getIdea_Digest_Subscription_Type__c() {
        return idea_Digest_Subscription_Type__c;
    }


    /**
     * Sets the idea_Digest_Subscription_Type__c value for this Contact.
     * 
     * @param idea_Digest_Subscription_Type__c
     */
    public void setIdea_Digest_Subscription_Type__c(java.lang.String idea_Digest_Subscription_Type__c) {
        this.idea_Digest_Subscription_Type__c = idea_Digest_Subscription_Type__c;
    }


    /**
     * Gets the instances1__r value for this Contact.
     * 
     * @return instances1__r
     */
    public com.sforce.soap.enterprise.QueryResult getInstances1__r() {
        return instances1__r;
    }


    /**
     * Sets the instances1__r value for this Contact.
     * 
     * @param instances1__r
     */
    public void setInstances1__r(com.sforce.soap.enterprise.QueryResult instances1__r) {
        this.instances1__r = instances1__r;
    }


    /**
     * Gets the instances__r value for this Contact.
     * 
     * @return instances__r
     */
    public com.sforce.soap.enterprise.QueryResult getInstances__r() {
        return instances__r;
    }


    /**
     * Sets the instances__r value for this Contact.
     * 
     * @param instances__r
     */
    public void setInstances__r(com.sforce.soap.enterprise.QueryResult instances__r) {
        this.instances__r = instances__r;
    }


    /**
     * Gets the internal_Department_Sub__c value for this Contact.
     * 
     * @return internal_Department_Sub__c
     */
    public java.lang.String getInternal_Department_Sub__c() {
        return internal_Department_Sub__c;
    }


    /**
     * Sets the internal_Department_Sub__c value for this Contact.
     * 
     * @param internal_Department_Sub__c
     */
    public void setInternal_Department_Sub__c(java.lang.String internal_Department_Sub__c) {
        this.internal_Department_Sub__c = internal_Department_Sub__c;
    }


    /**
     * Gets the internal_Department__c value for this Contact.
     * 
     * @return internal_Department__c
     */
    public java.lang.String getInternal_Department__c() {
        return internal_Department__c;
    }


    /**
     * Sets the internal_Department__c value for this Contact.
     * 
     * @param internal_Department__c
     */
    public void setInternal_Department__c(java.lang.String internal_Department__c) {
        this.internal_Department__c = internal_Department__c;
    }


    /**
     * Gets the isDeleted value for this Contact.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Contact.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the jigsaw value for this Contact.
     * 
     * @return jigsaw
     */
    public java.lang.String getJigsaw() {
        return jigsaw;
    }


    /**
     * Sets the jigsaw value for this Contact.
     * 
     * @param jigsaw
     */
    public void setJigsaw(java.lang.String jigsaw) {
        this.jigsaw = jigsaw;
    }


    /**
     * Gets the jigsawContactId value for this Contact.
     * 
     * @return jigsawContactId
     */
    public java.lang.String getJigsawContactId() {
        return jigsawContactId;
    }


    /**
     * Sets the jigsawContactId value for this Contact.
     * 
     * @param jigsawContactId
     */
    public void setJigsawContactId(java.lang.String jigsawContactId) {
        this.jigsawContactId = jigsawContactId;
    }


    /**
     * Gets the lastActivityDate value for this Contact.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Contact.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastCURequestDate value for this Contact.
     * 
     * @return lastCURequestDate
     */
    public java.util.Calendar getLastCURequestDate() {
        return lastCURequestDate;
    }


    /**
     * Sets the lastCURequestDate value for this Contact.
     * 
     * @param lastCURequestDate
     */
    public void setLastCURequestDate(java.util.Calendar lastCURequestDate) {
        this.lastCURequestDate = lastCURequestDate;
    }


    /**
     * Gets the lastCUUpdateDate value for this Contact.
     * 
     * @return lastCUUpdateDate
     */
    public java.util.Calendar getLastCUUpdateDate() {
        return lastCUUpdateDate;
    }


    /**
     * Sets the lastCUUpdateDate value for this Contact.
     * 
     * @param lastCUUpdateDate
     */
    public void setLastCUUpdateDate(java.util.Calendar lastCUUpdateDate) {
        this.lastCUUpdateDate = lastCUUpdateDate;
    }


    /**
     * Gets the lastModifiedBy value for this Contact.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Contact.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Contact.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Contact.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Contact.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Contact.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lastName value for this Contact.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this Contact.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the logo_Testimonial_Trackings__r value for this Contact.
     * 
     * @return logo_Testimonial_Trackings__r
     */
    public com.sforce.soap.enterprise.QueryResult getLogo_Testimonial_Trackings__r() {
        return logo_Testimonial_Trackings__r;
    }


    /**
     * Sets the logo_Testimonial_Trackings__r value for this Contact.
     * 
     * @param logo_Testimonial_Trackings__r
     */
    public void setLogo_Testimonial_Trackings__r(com.sforce.soap.enterprise.QueryResult logo_Testimonial_Trackings__r) {
        this.logo_Testimonial_Trackings__r = logo_Testimonial_Trackings__r;
    }


    /**
     * Gets the mailingCity value for this Contact.
     * 
     * @return mailingCity
     */
    public java.lang.String getMailingCity() {
        return mailingCity;
    }


    /**
     * Sets the mailingCity value for this Contact.
     * 
     * @param mailingCity
     */
    public void setMailingCity(java.lang.String mailingCity) {
        this.mailingCity = mailingCity;
    }


    /**
     * Gets the mailingCountry value for this Contact.
     * 
     * @return mailingCountry
     */
    public java.lang.String getMailingCountry() {
        return mailingCountry;
    }


    /**
     * Sets the mailingCountry value for this Contact.
     * 
     * @param mailingCountry
     */
    public void setMailingCountry(java.lang.String mailingCountry) {
        this.mailingCountry = mailingCountry;
    }


    /**
     * Gets the mailingPostalCode value for this Contact.
     * 
     * @return mailingPostalCode
     */
    public java.lang.String getMailingPostalCode() {
        return mailingPostalCode;
    }


    /**
     * Sets the mailingPostalCode value for this Contact.
     * 
     * @param mailingPostalCode
     */
    public void setMailingPostalCode(java.lang.String mailingPostalCode) {
        this.mailingPostalCode = mailingPostalCode;
    }


    /**
     * Gets the mailingState value for this Contact.
     * 
     * @return mailingState
     */
    public java.lang.String getMailingState() {
        return mailingState;
    }


    /**
     * Sets the mailingState value for this Contact.
     * 
     * @param mailingState
     */
    public void setMailingState(java.lang.String mailingState) {
        this.mailingState = mailingState;
    }


    /**
     * Gets the mailingStreet value for this Contact.
     * 
     * @return mailingStreet
     */
    public java.lang.String getMailingStreet() {
        return mailingStreet;
    }


    /**
     * Sets the mailingStreet value for this Contact.
     * 
     * @param mailingStreet
     */
    public void setMailingStreet(java.lang.String mailingStreet) {
        this.mailingStreet = mailingStreet;
    }


    /**
     * Gets the marketing__c value for this Contact.
     * 
     * @return marketing__c
     */
    public java.lang.String getMarketing__c() {
        return marketing__c;
    }


    /**
     * Sets the marketing__c value for this Contact.
     * 
     * @param marketing__c
     */
    public void setMarketing__c(java.lang.String marketing__c) {
        this.marketing__c = marketing__c;
    }


    /**
     * Gets the masterRecord value for this Contact.
     * 
     * @return masterRecord
     */
    public com.sforce.soap.enterprise.sobject.Contact getMasterRecord() {
        return masterRecord;
    }


    /**
     * Sets the masterRecord value for this Contact.
     * 
     * @param masterRecord
     */
    public void setMasterRecord(com.sforce.soap.enterprise.sobject.Contact masterRecord) {
        this.masterRecord = masterRecord;
    }


    /**
     * Gets the masterRecordId value for this Contact.
     * 
     * @return masterRecordId
     */
    public java.lang.String getMasterRecordId() {
        return masterRecordId;
    }


    /**
     * Sets the masterRecordId value for this Contact.
     * 
     * @param masterRecordId
     */
    public void setMasterRecordId(java.lang.String masterRecordId) {
        this.masterRecordId = masterRecordId;
    }


    /**
     * Gets the meetings__r value for this Contact.
     * 
     * @return meetings__r
     */
    public com.sforce.soap.enterprise.QueryResult getMeetings__r() {
        return meetings__r;
    }


    /**
     * Sets the meetings__r value for this Contact.
     * 
     * @param meetings__r
     */
    public void setMeetings__r(com.sforce.soap.enterprise.QueryResult meetings__r) {
        this.meetings__r = meetings__r;
    }


    /**
     * Gets the mobilePhone value for this Contact.
     * 
     * @return mobilePhone
     */
    public java.lang.String getMobilePhone() {
        return mobilePhone;
    }


    /**
     * Sets the mobilePhone value for this Contact.
     * 
     * @param mobilePhone
     */
    public void setMobilePhone(java.lang.String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }


    /**
     * Gets the name value for this Contact.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Contact.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Contact.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Contact.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Contact.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Contact.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the number_of_Related_Contacts__c value for this Contact.
     * 
     * @return number_of_Related_Contacts__c
     */
    public java.lang.Double getNumber_of_Related_Contacts__c() {
        return number_of_Related_Contacts__c;
    }


    /**
     * Sets the number_of_Related_Contacts__c value for this Contact.
     * 
     * @param number_of_Related_Contacts__c
     */
    public void setNumber_of_Related_Contacts__c(java.lang.Double number_of_Related_Contacts__c) {
        this.number_of_Related_Contacts__c = number_of_Related_Contacts__c;
    }


    /**
     * Gets the number_of_Times_Renewed__c value for this Contact.
     * 
     * @return number_of_Times_Renewed__c
     */
    public java.lang.Double getNumber_of_Times_Renewed__c() {
        return number_of_Times_Renewed__c;
    }


    /**
     * Sets the number_of_Times_Renewed__c value for this Contact.
     * 
     * @param number_of_Times_Renewed__c
     */
    public void setNumber_of_Times_Renewed__c(java.lang.Double number_of_Times_Renewed__c) {
        this.number_of_Times_Renewed__c = number_of_Times_Renewed__c;
    }


    /**
     * Gets the onsite_Visit_Attendees__r value for this Contact.
     * 
     * @return onsite_Visit_Attendees__r
     */
    public com.sforce.soap.enterprise.QueryResult getOnsite_Visit_Attendees__r() {
        return onsite_Visit_Attendees__r;
    }


    /**
     * Sets the onsite_Visit_Attendees__r value for this Contact.
     * 
     * @param onsite_Visit_Attendees__r
     */
    public void setOnsite_Visit_Attendees__r(com.sforce.soap.enterprise.QueryResult onsite_Visit_Attendees__r) {
        this.onsite_Visit_Attendees__r = onsite_Visit_Attendees__r;
    }


    /**
     * Gets the openActivities value for this Contact.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this Contact.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the opportunities value for this Contact.
     * 
     * @return opportunities
     */
    public com.sforce.soap.enterprise.QueryResult getOpportunities() {
        return opportunities;
    }


    /**
     * Sets the opportunities value for this Contact.
     * 
     * @param opportunities
     */
    public void setOpportunities(com.sforce.soap.enterprise.QueryResult opportunities) {
        this.opportunities = opportunities;
    }


    /**
     * Gets the opportunityContactRoles value for this Contact.
     * 
     * @return opportunityContactRoles
     */
    public com.sforce.soap.enterprise.QueryResult getOpportunityContactRoles() {
        return opportunityContactRoles;
    }


    /**
     * Sets the opportunityContactRoles value for this Contact.
     * 
     * @param opportunityContactRoles
     */
    public void setOpportunityContactRoles(com.sforce.soap.enterprise.QueryResult opportunityContactRoles) {
        this.opportunityContactRoles = opportunityContactRoles;
    }


    /**
     * Gets the otherCity value for this Contact.
     * 
     * @return otherCity
     */
    public java.lang.String getOtherCity() {
        return otherCity;
    }


    /**
     * Sets the otherCity value for this Contact.
     * 
     * @param otherCity
     */
    public void setOtherCity(java.lang.String otherCity) {
        this.otherCity = otherCity;
    }


    /**
     * Gets the otherCountry value for this Contact.
     * 
     * @return otherCountry
     */
    public java.lang.String getOtherCountry() {
        return otherCountry;
    }


    /**
     * Sets the otherCountry value for this Contact.
     * 
     * @param otherCountry
     */
    public void setOtherCountry(java.lang.String otherCountry) {
        this.otherCountry = otherCountry;
    }


    /**
     * Gets the otherPhone value for this Contact.
     * 
     * @return otherPhone
     */
    public java.lang.String getOtherPhone() {
        return otherPhone;
    }


    /**
     * Sets the otherPhone value for this Contact.
     * 
     * @param otherPhone
     */
    public void setOtherPhone(java.lang.String otherPhone) {
        this.otherPhone = otherPhone;
    }


    /**
     * Gets the otherPostalCode value for this Contact.
     * 
     * @return otherPostalCode
     */
    public java.lang.String getOtherPostalCode() {
        return otherPostalCode;
    }


    /**
     * Sets the otherPostalCode value for this Contact.
     * 
     * @param otherPostalCode
     */
    public void setOtherPostalCode(java.lang.String otherPostalCode) {
        this.otherPostalCode = otherPostalCode;
    }


    /**
     * Gets the otherState value for this Contact.
     * 
     * @return otherState
     */
    public java.lang.String getOtherState() {
        return otherState;
    }


    /**
     * Sets the otherState value for this Contact.
     * 
     * @param otherState
     */
    public void setOtherState(java.lang.String otherState) {
        this.otherState = otherState;
    }


    /**
     * Gets the otherStreet value for this Contact.
     * 
     * @return otherStreet
     */
    public java.lang.String getOtherStreet() {
        return otherStreet;
    }


    /**
     * Sets the otherStreet value for this Contact.
     * 
     * @param otherStreet
     */
    public void setOtherStreet(java.lang.String otherStreet) {
        this.otherStreet = otherStreet;
    }


    /**
     * Gets the owner value for this Contact.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.User getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Contact.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.User owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Contact.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Contact.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the phone value for this Contact.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this Contact.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the pilots1__r value for this Contact.
     * 
     * @return pilots1__r
     */
    public com.sforce.soap.enterprise.QueryResult getPilots1__r() {
        return pilots1__r;
    }


    /**
     * Sets the pilots1__r value for this Contact.
     * 
     * @param pilots1__r
     */
    public void setPilots1__r(com.sforce.soap.enterprise.QueryResult pilots1__r) {
        this.pilots1__r = pilots1__r;
    }


    /**
     * Gets the pilots2__r value for this Contact.
     * 
     * @return pilots2__r
     */
    public com.sforce.soap.enterprise.QueryResult getPilots2__r() {
        return pilots2__r;
    }


    /**
     * Sets the pilots2__r value for this Contact.
     * 
     * @param pilots2__r
     */
    public void setPilots2__r(com.sforce.soap.enterprise.QueryResult pilots2__r) {
        this.pilots2__r = pilots2__r;
    }


    /**
     * Gets the pilots__r value for this Contact.
     * 
     * @return pilots__r
     */
    public com.sforce.soap.enterprise.QueryResult getPilots__r() {
        return pilots__r;
    }


    /**
     * Sets the pilots__r value for this Contact.
     * 
     * @param pilots__r
     */
    public void setPilots__r(com.sforce.soap.enterprise.QueryResult pilots__r) {
        this.pilots__r = pilots__r;
    }


    /**
     * Gets the platform_Enhancements__c value for this Contact.
     * 
     * @return platform_Enhancements__c
     */
    public java.lang.String getPlatform_Enhancements__c() {
        return platform_Enhancements__c;
    }


    /**
     * Sets the platform_Enhancements__c value for this Contact.
     * 
     * @param platform_Enhancements__c
     */
    public void setPlatform_Enhancements__c(java.lang.String platform_Enhancements__c) {
        this.platform_Enhancements__c = platform_Enhancements__c;
    }


    /**
     * Gets the preferred_Method_of_Contact__c value for this Contact.
     * 
     * @return preferred_Method_of_Contact__c
     */
    public java.lang.String getPreferred_Method_of_Contact__c() {
        return preferred_Method_of_Contact__c;
    }


    /**
     * Sets the preferred_Method_of_Contact__c value for this Contact.
     * 
     * @param preferred_Method_of_Contact__c
     */
    public void setPreferred_Method_of_Contact__c(java.lang.String preferred_Method_of_Contact__c) {
        this.preferred_Method_of_Contact__c = preferred_Method_of_Contact__c;
    }


    /**
     * Gets the primary_Admin_Contact__c value for this Contact.
     * 
     * @return primary_Admin_Contact__c
     */
    public java.lang.String getPrimary_Admin_Contact__c() {
        return primary_Admin_Contact__c;
    }


    /**
     * Sets the primary_Admin_Contact__c value for this Contact.
     * 
     * @param primary_Admin_Contact__c
     */
    public void setPrimary_Admin_Contact__c(java.lang.String primary_Admin_Contact__c) {
        this.primary_Admin_Contact__c = primary_Admin_Contact__c;
    }


    /**
     * Gets the primary_Contacts1__r value for this Contact.
     * 
     * @return primary_Contacts1__r
     */
    public com.sforce.soap.enterprise.QueryResult getPrimary_Contacts1__r() {
        return primary_Contacts1__r;
    }


    /**
     * Sets the primary_Contacts1__r value for this Contact.
     * 
     * @param primary_Contacts1__r
     */
    public void setPrimary_Contacts1__r(com.sforce.soap.enterprise.QueryResult primary_Contacts1__r) {
        this.primary_Contacts1__r = primary_Contacts1__r;
    }


    /**
     * Gets the primary_Contacts__r value for this Contact.
     * 
     * @return primary_Contacts__r
     */
    public com.sforce.soap.enterprise.QueryResult getPrimary_Contacts__r() {
        return primary_Contacts__r;
    }


    /**
     * Sets the primary_Contacts__r value for this Contact.
     * 
     * @param primary_Contacts__r
     */
    public void setPrimary_Contacts__r(com.sforce.soap.enterprise.QueryResult primary_Contacts__r) {
        this.primary_Contacts__r = primary_Contacts__r;
    }


    /**
     * Gets the primary_Marketing_Contact__c value for this Contact.
     * 
     * @return primary_Marketing_Contact__c
     */
    public java.lang.Boolean getPrimary_Marketing_Contact__c() {
        return primary_Marketing_Contact__c;
    }


    /**
     * Sets the primary_Marketing_Contact__c value for this Contact.
     * 
     * @param primary_Marketing_Contact__c
     */
    public void setPrimary_Marketing_Contact__c(java.lang.Boolean primary_Marketing_Contact__c) {
        this.primary_Marketing_Contact__c = primary_Marketing_Contact__c;
    }


    /**
     * Gets the primary_Sales_Contact__c value for this Contact.
     * 
     * @return primary_Sales_Contact__c
     */
    public java.lang.Boolean getPrimary_Sales_Contact__c() {
        return primary_Sales_Contact__c;
    }


    /**
     * Sets the primary_Sales_Contact__c value for this Contact.
     * 
     * @param primary_Sales_Contact__c
     */
    public void setPrimary_Sales_Contact__c(java.lang.Boolean primary_Sales_Contact__c) {
        this.primary_Sales_Contact__c = primary_Sales_Contact__c;
    }


    /**
     * Gets the processInstances value for this Contact.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Contact.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Contact.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Contact.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the RAR_DLs__r value for this Contact.
     * 
     * @return RAR_DLs__r
     */
    public com.sforce.soap.enterprise.QueryResult getRAR_DLs__r() {
        return RAR_DLs__r;
    }


    /**
     * Sets the RAR_DLs__r value for this Contact.
     * 
     * @param RAR_DLs__r
     */
    public void setRAR_DLs__r(com.sforce.soap.enterprise.QueryResult RAR_DLs__r) {
        this.RAR_DLs__r = RAR_DLs__r;
    }


    /**
     * Gets the RCA_2__c value for this Contact.
     * 
     * @return RCA_2__c
     */
    public java.lang.String getRCA_2__c() {
        return RCA_2__c;
    }


    /**
     * Sets the RCA_2__c value for this Contact.
     * 
     * @param RCA_2__c
     */
    public void setRCA_2__c(java.lang.String RCA_2__c) {
        this.RCA_2__c = RCA_2__c;
    }


    /**
     * Gets the RCA_Certification_End_Date__c value for this Contact.
     * 
     * @return RCA_Certification_End_Date__c
     */
    public java.util.Date getRCA_Certification_End_Date__c() {
        return RCA_Certification_End_Date__c;
    }


    /**
     * Sets the RCA_Certification_End_Date__c value for this Contact.
     * 
     * @param RCA_Certification_End_Date__c
     */
    public void setRCA_Certification_End_Date__c(java.util.Date RCA_Certification_End_Date__c) {
        this.RCA_Certification_End_Date__c = RCA_Certification_End_Date__c;
    }


    /**
     * Gets the RCA_Certified_Date__c value for this Contact.
     * 
     * @return RCA_Certified_Date__c
     */
    public java.util.Date getRCA_Certified_Date__c() {
        return RCA_Certified_Date__c;
    }


    /**
     * Sets the RCA_Certified_Date__c value for this Contact.
     * 
     * @param RCA_Certified_Date__c
     */
    public void setRCA_Certified_Date__c(java.util.Date RCA_Certified_Date__c) {
        this.RCA_Certified_Date__c = RCA_Certified_Date__c;
    }


    /**
     * Gets the RCA_Contact__c value for this Contact.
     * 
     * @return RCA_Contact__c
     */
    public java.lang.String getRCA_Contact__c() {
        return RCA_Contact__c;
    }


    /**
     * Sets the RCA_Contact__c value for this Contact.
     * 
     * @param RCA_Contact__c
     */
    public void setRCA_Contact__c(java.lang.String RCA_Contact__c) {
        this.RCA_Contact__c = RCA_Contact__c;
    }


    /**
     * Gets the RCA_Contact__r value for this Contact.
     * 
     * @return RCA_Contact__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getRCA_Contact__r() {
        return RCA_Contact__r;
    }


    /**
     * Sets the RCA_Contact__r value for this Contact.
     * 
     * @param RCA_Contact__r
     */
    public void setRCA_Contact__r(com.sforce.soap.enterprise.sobject.Contact RCA_Contact__r) {
        this.RCA_Contact__r = RCA_Contact__r;
    }


    /**
     * Gets the RCA_End_Date__c value for this Contact.
     * 
     * @return RCA_End_Date__c
     */
    public java.util.Date getRCA_End_Date__c() {
        return RCA_End_Date__c;
    }


    /**
     * Sets the RCA_End_Date__c value for this Contact.
     * 
     * @param RCA_End_Date__c
     */
    public void setRCA_End_Date__c(java.util.Date RCA_End_Date__c) {
        this.RCA_End_Date__c = RCA_End_Date__c;
    }


    /**
     * Gets the RCA_Start_Date__c value for this Contact.
     * 
     * @return RCA_Start_Date__c
     */
    public java.util.Date getRCA_Start_Date__c() {
        return RCA_Start_Date__c;
    }


    /**
     * Sets the RCA_Start_Date__c value for this Contact.
     * 
     * @param RCA_Start_Date__c
     */
    public void setRCA_Start_Date__c(java.util.Date RCA_Start_Date__c) {
        this.RCA_Start_Date__c = RCA_Start_Date__c;
    }


    /**
     * Gets the RCA__c value for this Contact.
     * 
     * @return RCA__c
     */
    public java.lang.Boolean getRCA__c() {
        return RCA__c;
    }


    /**
     * Sets the RCA__c value for this Contact.
     * 
     * @param RCA__c
     */
    public void setRCA__c(java.lang.Boolean RCA__c) {
        this.RCA__c = RCA__c;
    }


    /**
     * Gets the RCE_Credit_Total__c value for this Contact.
     * 
     * @return RCE_Credit_Total__c
     */
    public java.lang.Double getRCE_Credit_Total__c() {
        return RCE_Credit_Total__c;
    }


    /**
     * Sets the RCE_Credit_Total__c value for this Contact.
     * 
     * @param RCE_Credit_Total__c
     */
    public void setRCE_Credit_Total__c(java.lang.Double RCE_Credit_Total__c) {
        this.RCE_Credit_Total__c = RCE_Credit_Total__c;
    }


    /**
     * Gets the RCE_Credits__r value for this Contact.
     * 
     * @return RCE_Credits__r
     */
    public com.sforce.soap.enterprise.QueryResult getRCE_Credits__r() {
        return RCE_Credits__r;
    }


    /**
     * Sets the RCE_Credits__r value for this Contact.
     * 
     * @param RCE_Credits__r
     */
    public void setRCE_Credits__r(com.sforce.soap.enterprise.QueryResult RCE_Credits__r) {
        this.RCE_Credits__r = RCE_Credits__r;
    }


    /**
     * Gets the RCE_Credits_for_Current_Year__c value for this Contact.
     * 
     * @return RCE_Credits_for_Current_Year__c
     */
    public java.lang.Double getRCE_Credits_for_Current_Year__c() {
        return RCE_Credits_for_Current_Year__c;
    }


    /**
     * Sets the RCE_Credits_for_Current_Year__c value for this Contact.
     * 
     * @param RCE_Credits_for_Current_Year__c
     */
    public void setRCE_Credits_for_Current_Year__c(java.lang.Double RCE_Credits_for_Current_Year__c) {
        this.RCE_Credits_for_Current_Year__c = RCE_Credits_for_Current_Year__c;
    }


    /**
     * Gets the RCSP_Certified__c value for this Contact.
     * 
     * @return RCSP_Certified__c
     */
    public java.lang.String getRCSP_Certified__c() {
        return RCSP_Certified__c;
    }


    /**
     * Sets the RCSP_Certified__c value for this Contact.
     * 
     * @param RCSP_Certified__c
     */
    public void setRCSP_Certified__c(java.lang.String RCSP_Certified__c) {
        this.RCSP_Certified__c = RCSP_Certified__c;
    }


    /**
     * Gets the RCSP__c value for this Contact.
     * 
     * @return RCSP__c
     */
    public java.lang.Boolean getRCSP__c() {
        return RCSP__c;
    }


    /**
     * Sets the RCSP__c value for this Contact.
     * 
     * @param RCSP__c
     */
    public void setRCSP__c(java.lang.Boolean RCSP__c) {
        this.RCSP__c = RCSP__c;
    }


    /**
     * Gets the registered_for_Relativity_Fest_2012__c value for this Contact.
     * 
     * @return registered_for_Relativity_Fest_2012__c
     */
    public java.lang.Boolean getRegistered_for_Relativity_Fest_2012__c() {
        return registered_for_Relativity_Fest_2012__c;
    }


    /**
     * Sets the registered_for_Relativity_Fest_2012__c value for this Contact.
     * 
     * @param registered_for_Relativity_Fest_2012__c
     */
    public void setRegistered_for_Relativity_Fest_2012__c(java.lang.Boolean registered_for_Relativity_Fest_2012__c) {
        this.registered_for_Relativity_Fest_2012__c = registered_for_Relativity_Fest_2012__c;
    }


    /**
     * Gets the registered_for_Userfest_2010__c value for this Contact.
     * 
     * @return registered_for_Userfest_2010__c
     */
    public java.lang.String getRegistered_for_Userfest_2010__c() {
        return registered_for_Userfest_2010__c;
    }


    /**
     * Sets the registered_for_Userfest_2010__c value for this Contact.
     * 
     * @param registered_for_Userfest_2010__c
     */
    public void setRegistered_for_Userfest_2010__c(java.lang.String registered_for_Userfest_2010__c) {
        this.registered_for_Userfest_2010__c = registered_for_Userfest_2010__c;
    }


    /**
     * Gets the relativity_Assisted_Review_Newsletter__c value for this Contact.
     * 
     * @return relativity_Assisted_Review_Newsletter__c
     */
    public java.lang.String getRelativity_Assisted_Review_Newsletter__c() {
        return relativity_Assisted_Review_Newsletter__c;
    }


    /**
     * Sets the relativity_Assisted_Review_Newsletter__c value for this Contact.
     * 
     * @param relativity_Assisted_Review_Newsletter__c
     */
    public void setRelativity_Assisted_Review_Newsletter__c(java.lang.String relativity_Assisted_Review_Newsletter__c) {
        this.relativity_Assisted_Review_Newsletter__c = relativity_Assisted_Review_Newsletter__c;
    }


    /**
     * Gets the relativity_Fest_Newsletter__c value for this Contact.
     * 
     * @return relativity_Fest_Newsletter__c
     */
    public java.lang.String getRelativity_Fest_Newsletter__c() {
        return relativity_Fest_Newsletter__c;
    }


    /**
     * Sets the relativity_Fest_Newsletter__c value for this Contact.
     * 
     * @param relativity_Fest_Newsletter__c
     */
    public void setRelativity_Fest_Newsletter__c(java.lang.String relativity_Fest_Newsletter__c) {
        this.relativity_Fest_Newsletter__c = relativity_Fest_Newsletter__c;
    }


    /**
     * Gets the reseller_Point_of_Contact__c value for this Contact.
     * 
     * @return reseller_Point_of_Contact__c
     */
    public java.lang.Boolean getReseller_Point_of_Contact__c() {
        return reseller_Point_of_Contact__c;
    }


    /**
     * Sets the reseller_Point_of_Contact__c value for this Contact.
     * 
     * @param reseller_Point_of_Contact__c
     */
    public void setReseller_Point_of_Contact__c(java.lang.Boolean reseller_Point_of_Contact__c) {
        this.reseller_Point_of_Contact__c = reseller_Point_of_Contact__c;
    }


    /**
     * Gets the reseller_Sales_Training_Test_Score__c value for this Contact.
     * 
     * @return reseller_Sales_Training_Test_Score__c
     */
    public java.lang.Double getReseller_Sales_Training_Test_Score__c() {
        return reseller_Sales_Training_Test_Score__c;
    }


    /**
     * Sets the reseller_Sales_Training_Test_Score__c value for this Contact.
     * 
     * @param reseller_Sales_Training_Test_Score__c
     */
    public void setReseller_Sales_Training_Test_Score__c(java.lang.Double reseller_Sales_Training_Test_Score__c) {
        this.reseller_Sales_Training_Test_Score__c = reseller_Sales_Training_Test_Score__c;
    }


    /**
     * Gets the SFDC_Projects__r value for this Contact.
     * 
     * @return SFDC_Projects__r
     */
    public com.sforce.soap.enterprise.QueryResult getSFDC_Projects__r() {
        return SFDC_Projects__r;
    }


    /**
     * Sets the SFDC_Projects__r value for this Contact.
     * 
     * @param SFDC_Projects__r
     */
    public void setSFDC_Projects__r(com.sforce.soap.enterprise.QueryResult SFDC_Projects__r) {
        this.SFDC_Projects__r = SFDC_Projects__r;
    }


    /**
     * Gets the SWAG__r value for this Contact.
     * 
     * @return SWAG__r
     */
    public com.sforce.soap.enterprise.QueryResult getSWAG__r() {
        return SWAG__r;
    }


    /**
     * Sets the SWAG__r value for this Contact.
     * 
     * @param SWAG__r
     */
    public void setSWAG__r(com.sforce.soap.enterprise.QueryResult SWAG__r) {
        this.SWAG__r = SWAG__r;
    }


    /**
     * Gets the sales_Distribution_List__c value for this Contact.
     * 
     * @return sales_Distribution_List__c
     */
    public java.lang.Boolean getSales_Distribution_List__c() {
        return sales_Distribution_List__c;
    }


    /**
     * Sets the sales_Distribution_List__c value for this Contact.
     * 
     * @param sales_Distribution_List__c
     */
    public void setSales_Distribution_List__c(java.lang.Boolean sales_Distribution_List__c) {
        this.sales_Distribution_List__c = sales_Distribution_List__c;
    }


    /**
     * Gets the sales_Training_Surveys__r value for this Contact.
     * 
     * @return sales_Training_Surveys__r
     */
    public com.sforce.soap.enterprise.QueryResult getSales_Training_Surveys__r() {
        return sales_Training_Surveys__r;
    }


    /**
     * Sets the sales_Training_Surveys__r value for this Contact.
     * 
     * @param sales_Training_Surveys__r
     */
    public void setSales_Training_Surveys__r(com.sforce.soap.enterprise.QueryResult sales_Training_Surveys__r) {
        this.sales_Training_Surveys__r = sales_Training_Surveys__r;
    }


    /**
     * Gets the sales_Training_Test_Score__c value for this Contact.
     * 
     * @return sales_Training_Test_Score__c
     */
    public java.lang.Double getSales_Training_Test_Score__c() {
        return sales_Training_Test_Score__c;
    }


    /**
     * Sets the sales_Training_Test_Score__c value for this Contact.
     * 
     * @param sales_Training_Test_Score__c
     */
    public void setSales_Training_Test_Score__c(java.lang.Double sales_Training_Test_Score__c) {
        this.sales_Training_Test_Score__c = sales_Training_Test_Score__c;
    }


    /**
     * Gets the sales__c value for this Contact.
     * 
     * @return sales__c
     */
    public java.lang.String getSales__c() {
        return sales__c;
    }


    /**
     * Sets the sales__c value for this Contact.
     * 
     * @param sales__c
     */
    public void setSales__c(java.lang.String sales__c) {
        this.sales__c = sales__c;
    }


    /**
     * Gets the salutation value for this Contact.
     * 
     * @return salutation
     */
    public java.lang.String getSalutation() {
        return salutation;
    }


    /**
     * Sets the salutation value for this Contact.
     * 
     * @param salutation
     */
    public void setSalutation(java.lang.String salutation) {
        this.salutation = salutation;
    }


    /**
     * Gets the script_Xchg_Digest_Opt_Out__c value for this Contact.
     * 
     * @return script_Xchg_Digest_Opt_Out__c
     */
    public java.lang.Boolean getScript_Xchg_Digest_Opt_Out__c() {
        return script_Xchg_Digest_Opt_Out__c;
    }


    /**
     * Sets the script_Xchg_Digest_Opt_Out__c value for this Contact.
     * 
     * @param script_Xchg_Digest_Opt_Out__c
     */
    public void setScript_Xchg_Digest_Opt_Out__c(java.lang.Boolean script_Xchg_Digest_Opt_Out__c) {
        this.script_Xchg_Digest_Opt_Out__c = script_Xchg_Digest_Opt_Out__c;
    }


    /**
     * Gets the script_Xchg_Digest_Subscription_Type__c value for this Contact.
     * 
     * @return script_Xchg_Digest_Subscription_Type__c
     */
    public java.lang.String getScript_Xchg_Digest_Subscription_Type__c() {
        return script_Xchg_Digest_Subscription_Type__c;
    }


    /**
     * Sets the script_Xchg_Digest_Subscription_Type__c value for this Contact.
     * 
     * @param script_Xchg_Digest_Subscription_Type__c
     */
    public void setScript_Xchg_Digest_Subscription_Type__c(java.lang.String script_Xchg_Digest_Subscription_Type__c) {
        this.script_Xchg_Digest_Subscription_Type__c = script_Xchg_Digest_Subscription_Type__c;
    }


    /**
     * Gets the send_Email__c value for this Contact.
     * 
     * @return send_Email__c
     */
    public java.lang.Boolean getSend_Email__c() {
        return send_Email__c;
    }


    /**
     * Sets the send_Email__c value for this Contact.
     * 
     * @param send_Email__c
     */
    public void setSend_Email__c(java.lang.Boolean send_Email__c) {
        this.send_Email__c = send_Email__c;
    }


    /**
     * Gets the send_RCA_Credit_Email__c value for this Contact.
     * 
     * @return send_RCA_Credit_Email__c
     */
    public java.lang.Boolean getSend_RCA_Credit_Email__c() {
        return send_RCA_Credit_Email__c;
    }


    /**
     * Sets the send_RCA_Credit_Email__c value for this Contact.
     * 
     * @param send_RCA_Credit_Email__c
     */
    public void setSend_RCA_Credit_Email__c(java.lang.Boolean send_RCA_Credit_Email__c) {
        this.send_RCA_Credit_Email__c = send_RCA_Credit_Email__c;
    }


    /**
     * Gets the send_Sales_Cert_Survey__c value for this Contact.
     * 
     * @return send_Sales_Cert_Survey__c
     */
    public java.lang.Boolean getSend_Sales_Cert_Survey__c() {
        return send_Sales_Cert_Survey__c;
    }


    /**
     * Sets the send_Sales_Cert_Survey__c value for this Contact.
     * 
     * @param send_Sales_Cert_Survey__c
     */
    public void setSend_Sales_Cert_Survey__c(java.lang.Boolean send_Sales_Cert_Survey__c) {
        this.send_Sales_Cert_Survey__c = send_Sales_Cert_Survey__c;
    }


    /**
     * Gets the shares value for this Contact.
     * 
     * @return shares
     */
    public com.sforce.soap.enterprise.QueryResult getShares() {
        return shares;
    }


    /**
     * Sets the shares value for this Contact.
     * 
     * @param shares
     */
    public void setShares(com.sforce.soap.enterprise.QueryResult shares) {
        this.shares = shares;
    }


    /**
     * Gets the shirt_Size__c value for this Contact.
     * 
     * @return shirt_Size__c
     */
    public java.lang.String getShirt_Size__c() {
        return shirt_Size__c;
    }


    /**
     * Sets the shirt_Size__c value for this Contact.
     * 
     * @param shirt_Size__c
     */
    public void setShirt_Size__c(java.lang.String shirt_Size__c) {
        this.shirt_Size__c = shirt_Size__c;
    }


    /**
     * Gets the status_Meeting_Attendees__r value for this Contact.
     * 
     * @return status_Meeting_Attendees__r
     */
    public com.sforce.soap.enterprise.QueryResult getStatus_Meeting_Attendees__r() {
        return status_Meeting_Attendees__r;
    }


    /**
     * Sets the status_Meeting_Attendees__r value for this Contact.
     * 
     * @param status_Meeting_Attendees__r
     */
    public void setStatus_Meeting_Attendees__r(com.sforce.soap.enterprise.QueryResult status_Meeting_Attendees__r) {
        this.status_Meeting_Attendees__r = status_Meeting_Attendees__r;
    }


    /**
     * Gets the status_Meetings__r value for this Contact.
     * 
     * @return status_Meetings__r
     */
    public com.sforce.soap.enterprise.QueryResult getStatus_Meetings__r() {
        return status_Meetings__r;
    }


    /**
     * Sets the status_Meetings__r value for this Contact.
     * 
     * @param status_Meetings__r
     */
    public void setStatus_Meetings__r(com.sforce.soap.enterprise.QueryResult status_Meetings__r) {
        this.status_Meetings__r = status_Meetings__r;
    }


    /**
     * Gets the support_Distribution_List__c value for this Contact.
     * 
     * @return support_Distribution_List__c
     */
    public java.lang.Boolean getSupport_Distribution_List__c() {
        return support_Distribution_List__c;
    }


    /**
     * Sets the support_Distribution_List__c value for this Contact.
     * 
     * @param support_Distribution_List__c
     */
    public void setSupport_Distribution_List__c(java.lang.Boolean support_Distribution_List__c) {
        this.support_Distribution_List__c = support_Distribution_List__c;
    }


    /**
     * Gets the systemModstamp value for this Contact.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Contact.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this Contact.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Contact.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the tickets1__r value for this Contact.
     * 
     * @return tickets1__r
     */
    public com.sforce.soap.enterprise.QueryResult getTickets1__r() {
        return tickets1__r;
    }


    /**
     * Sets the tickets1__r value for this Contact.
     * 
     * @param tickets1__r
     */
    public void setTickets1__r(com.sforce.soap.enterprise.QueryResult tickets1__r) {
        this.tickets1__r = tickets1__r;
    }


    /**
     * Gets the tickets2__r value for this Contact.
     * 
     * @return tickets2__r
     */
    public com.sforce.soap.enterprise.QueryResult getTickets2__r() {
        return tickets2__r;
    }


    /**
     * Sets the tickets2__r value for this Contact.
     * 
     * @param tickets2__r
     */
    public void setTickets2__r(com.sforce.soap.enterprise.QueryResult tickets2__r) {
        this.tickets2__r = tickets2__r;
    }


    /**
     * Gets the tickets3__r value for this Contact.
     * 
     * @return tickets3__r
     */
    public com.sforce.soap.enterprise.QueryResult getTickets3__r() {
        return tickets3__r;
    }


    /**
     * Sets the tickets3__r value for this Contact.
     * 
     * @param tickets3__r
     */
    public void setTickets3__r(com.sforce.soap.enterprise.QueryResult tickets3__r) {
        this.tickets3__r = tickets3__r;
    }


    /**
     * Gets the tickets4__r value for this Contact.
     * 
     * @return tickets4__r
     */
    public com.sforce.soap.enterprise.QueryResult getTickets4__r() {
        return tickets4__r;
    }


    /**
     * Sets the tickets4__r value for this Contact.
     * 
     * @param tickets4__r
     */
    public void setTickets4__r(com.sforce.soap.enterprise.QueryResult tickets4__r) {
        this.tickets4__r = tickets4__r;
    }


    /**
     * Gets the tickets5__r value for this Contact.
     * 
     * @return tickets5__r
     */
    public com.sforce.soap.enterprise.QueryResult getTickets5__r() {
        return tickets5__r;
    }


    /**
     * Sets the tickets5__r value for this Contact.
     * 
     * @param tickets5__r
     */
    public void setTickets5__r(com.sforce.soap.enterprise.QueryResult tickets5__r) {
        this.tickets5__r = tickets5__r;
    }


    /**
     * Gets the tickets__r value for this Contact.
     * 
     * @return tickets__r
     */
    public com.sforce.soap.enterprise.QueryResult getTickets__r() {
        return tickets__r;
    }


    /**
     * Sets the tickets__r value for this Contact.
     * 
     * @param tickets__r
     */
    public void setTickets__r(com.sforce.soap.enterprise.QueryResult tickets__r) {
        this.tickets__r = tickets__r;
    }


    /**
     * Gets the time_Zone__c value for this Contact.
     * 
     * @return time_Zone__c
     */
    public java.lang.String getTime_Zone__c() {
        return time_Zone__c;
    }


    /**
     * Sets the time_Zone__c value for this Contact.
     * 
     * @param time_Zone__c
     */
    public void setTime_Zone__c(java.lang.String time_Zone__c) {
        this.time_Zone__c = time_Zone__c;
    }


    /**
     * Gets the title value for this Contact.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Contact.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the to_Persistant_Contact__r value for this Contact.
     * 
     * @return to_Persistant_Contact__r
     */
    public com.sforce.soap.enterprise.QueryResult getTo_Persistant_Contact__r() {
        return to_Persistant_Contact__r;
    }


    /**
     * Sets the to_Persistant_Contact__r value for this Contact.
     * 
     * @param to_Persistant_Contact__r
     */
    public void setTo_Persistant_Contact__r(com.sforce.soap.enterprise.QueryResult to_Persistant_Contact__r) {
        this.to_Persistant_Contact__r = to_Persistant_Contact__r;
    }


    /**
     * Gets the training_Attendees__r value for this Contact.
     * 
     * @return training_Attendees__r
     */
    public com.sforce.soap.enterprise.QueryResult getTraining_Attendees__r() {
        return training_Attendees__r;
    }


    /**
     * Sets the training_Attendees__r value for this Contact.
     * 
     * @param training_Attendees__r
     */
    public void setTraining_Attendees__r(com.sforce.soap.enterprise.QueryResult training_Attendees__r) {
        this.training_Attendees__r = training_Attendees__r;
    }


    /**
     * Gets the training_Questions__r value for this Contact.
     * 
     * @return training_Questions__r
     */
    public com.sforce.soap.enterprise.QueryResult getTraining_Questions__r() {
        return training_Questions__r;
    }


    /**
     * Sets the training_Questions__r value for this Contact.
     * 
     * @param training_Questions__r
     */
    public void setTraining_Questions__r(com.sforce.soap.enterprise.QueryResult training_Questions__r) {
        this.training_Questions__r = training_Questions__r;
    }


    /**
     * Gets the trainings1__r value for this Contact.
     * 
     * @return trainings1__r
     */
    public com.sforce.soap.enterprise.QueryResult getTrainings1__r() {
        return trainings1__r;
    }


    /**
     * Sets the trainings1__r value for this Contact.
     * 
     * @param trainings1__r
     */
    public void setTrainings1__r(com.sforce.soap.enterprise.QueryResult trainings1__r) {
        this.trainings1__r = trainings1__r;
    }


    /**
     * Gets the trainings__r value for this Contact.
     * 
     * @return trainings__r
     */
    public com.sforce.soap.enterprise.QueryResult getTrainings__r() {
        return trainings__r;
    }


    /**
     * Sets the trainings__r value for this Contact.
     * 
     * @param trainings__r
     */
    public void setTrainings__r(com.sforce.soap.enterprise.QueryResult trainings__r) {
        this.trainings__r = trainings__r;
    }


    /**
     * Gets the blonk_News_and_Press__c value for this Contact.
     * 
     * @return blonk_News_and_Press__c
     */
    public java.lang.String getKCura_News_and_Press__c() {
        return blonk_News_and_Press__c;
    }


    /**
     * Sets the blonk_News_and_Press__c value for this Contact.
     * 
     * @param blonk_News_and_Press__c
     */
    public void setKCura_News_and_Press__c(java.lang.String blonk_News_and_Press__c) {
        this.blonk_News_and_Press__c = blonk_News_and_Press__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Contact)) return false;
        Contact other = (Contact) obj;
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
            ((this.accountContactRoles==null && other.getAccountContactRoles()==null) || 
             (this.accountContactRoles!=null &&
              this.accountContactRoles.equals(other.getAccountContactRoles()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.accounts1__r==null && other.getAccounts1__r()==null) || 
             (this.accounts1__r!=null &&
              this.accounts1__r.equals(other.getAccounts1__r()))) &&
            ((this.accounts__r==null && other.getAccounts__r()==null) || 
             (this.accounts__r!=null &&
              this.accounts__r.equals(other.getAccounts__r()))) &&
            ((this.active_Contact__c==null && other.getActive_Contact__c()==null) || 
             (this.active_Contact__c!=null &&
              this.active_Contact__c.equals(other.getActive_Contact__c()))) &&
            ((this.activityHistories==null && other.getActivityHistories()==null) || 
             (this.activityHistories!=null &&
              this.activityHistories.equals(other.getActivityHistories()))) &&
            ((this.admin_Certifications__r==null && other.getAdmin_Certifications__r()==null) || 
             (this.admin_Certifications__r!=null &&
              this.admin_Certifications__r.equals(other.getAdmin_Certifications__r()))) &&
            ((this.admin_Contact__c==null && other.getAdmin_Contact__c()==null) || 
             (this.admin_Contact__c!=null &&
              this.admin_Contact__c.equals(other.getAdmin_Contact__c()))) &&
            ((this.adminsitrative_Contact__c==null && other.getAdminsitrative_Contact__c()==null) || 
             (this.adminsitrative_Contact__c!=null &&
              this.adminsitrative_Contact__c.equals(other.getAdminsitrative_Contact__c()))) &&
            ((this.alert__c==null && other.getAlert__c()==null) || 
             (this.alert__c!=null &&
              this.alert__c.equals(other.getAlert__c()))) &&
            ((this.analytic_Snapshots__r==null && other.getAnalytic_Snapshots__r()==null) || 
             (this.analytic_Snapshots__r!=null &&
              this.analytic_Snapshots__r.equals(other.getAnalytic_Snapshots__r()))) &&
            ((this.analytics_Training_Test_Score__c==null && other.getAnalytics_Training_Test_Score__c()==null) || 
             (this.analytics_Training_Test_Score__c!=null &&
              this.analytics_Training_Test_Score__c.equals(other.getAnalytics_Training_Test_Score__c()))) &&
            ((this.answer_Digest_Opt_Out__c==null && other.getAnswer_Digest_Opt_Out__c()==null) || 
             (this.answer_Digest_Opt_Out__c!=null &&
              this.answer_Digest_Opt_Out__c.equals(other.getAnswer_Digest_Opt_Out__c()))) &&
            ((this.answer_Digest_Subscribed_Categories__r==null && other.getAnswer_Digest_Subscribed_Categories__r()==null) || 
             (this.answer_Digest_Subscribed_Categories__r!=null &&
              this.answer_Digest_Subscribed_Categories__r.equals(other.getAnswer_Digest_Subscribed_Categories__r()))) &&
            ((this.answer_Digest_Subscription_Type__c==null && other.getAnswer_Digest_Subscription_Type__c()==null) || 
             (this.answer_Digest_Subscription_Type__c!=null &&
              this.answer_Digest_Subscription_Type__c.equals(other.getAnswer_Digest_Subscription_Type__c()))) &&
            ((this.assets==null && other.getAssets()==null) || 
             (this.assets!=null &&
              this.assets.equals(other.getAssets()))) &&
            ((this.assisted_Review_Newsletter_Opt_Out__c==null && other.getAssisted_Review_Newsletter_Opt_Out__c()==null) || 
             (this.assisted_Review_Newsletter_Opt_Out__c!=null &&
              this.assisted_Review_Newsletter_Opt_Out__c.equals(other.getAssisted_Review_Newsletter_Opt_Out__c()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.attended_Relativity_Analytics_Overview__c==null && other.getAttended_Relativity_Analytics_Overview__c()==null) || 
             (this.attended_Relativity_Analytics_Overview__c!=null &&
              this.attended_Relativity_Analytics_Overview__c.equals(other.getAttended_Relativity_Analytics_Overview__c()))) &&
            ((this.attended_Relativity_Sales_Training__c==null && other.getAttended_Relativity_Sales_Training__c()==null) || 
             (this.attended_Relativity_Sales_Training__c!=null &&
              this.attended_Relativity_Sales_Training__c.equals(other.getAttended_Relativity_Sales_Training__c()))) &&
            ((this.attended_Reseller_Sales_Training__c==null && other.getAttended_Reseller_Sales_Training__c()==null) || 
             (this.attended_Reseller_Sales_Training__c!=null &&
              this.attended_Reseller_Sales_Training__c.equals(other.getAttended_Reseller_Sales_Training__c()))) &&
            ((this.best_Time_to_Contact__c==null && other.getBest_Time_to_Contact__c()==null) || 
             (this.best_Time_to_Contact__c!=null &&
              this.best_Time_to_Contact__c.equals(other.getBest_Time_to_Contact__c()))) &&
            ((this.best_Way_to_Contact__c==null && other.getBest_Way_to_Contact__c()==null) || 
             (this.best_Way_to_Contact__c!=null &&
              this.best_Way_to_Contact__c.equals(other.getBest_Way_to_Contact__c()))) &&
            ((this.campaignMembers==null && other.getCampaignMembers()==null) || 
             (this.campaignMembers!=null &&
              this.campaignMembers.equals(other.getCampaignMembers()))) &&
            ((this.caseContactRoles==null && other.getCaseContactRoles()==null) || 
             (this.caseContactRoles!=null &&
              this.caseContactRoles.equals(other.getCaseContactRoles()))) &&
            ((this.cases==null && other.getCases()==null) || 
             (this.cases!=null &&
              this.cases.equals(other.getCases()))) &&
            ((this.cases1__r==null && other.getCases1__r()==null) || 
             (this.cases1__r!=null &&
              this.cases1__r.equals(other.getCases1__r()))) &&
            ((this.cases__r==null && other.getCases__r()==null) || 
             (this.cases__r!=null &&
              this.cases__r.equals(other.getCases__r()))) &&
            ((this.certification_Contact__c==null && other.getCertification_Contact__c()==null) || 
             (this.certification_Contact__c!=null &&
              this.certification_Contact__c.equals(other.getCertification_Contact__c()))) &&
            ((this.certification_Contact__r==null && other.getCertification_Contact__r()==null) || 
             (this.certification_Contact__r!=null &&
              this.certification_Contact__r.equals(other.getCertification_Contact__r()))) &&
            ((this.certification_Updates__c==null && other.getCertification_Updates__c()==null) || 
             (this.certification_Updates__c!=null &&
              this.certification_Updates__c.equals(other.getCertification_Updates__c()))) &&
            ((this.certified_Admin__c==null && other.getCertified_Admin__c()==null) || 
             (this.certified_Admin__c!=null &&
              this.certified_Admin__c.equals(other.getCertified_Admin__c()))) &&
            ((this.channel_Mgr_Outline_Contacts__r==null && other.getChannel_Mgr_Outline_Contacts__r()==null) || 
             (this.channel_Mgr_Outline_Contacts__r!=null &&
              this.channel_Mgr_Outline_Contacts__r.equals(other.getChannel_Mgr_Outline_Contacts__r()))) &&
            ((this.channel_Mgr_Outlines1__r==null && other.getChannel_Mgr_Outlines1__r()==null) || 
             (this.channel_Mgr_Outlines1__r!=null &&
              this.channel_Mgr_Outlines1__r.equals(other.getChannel_Mgr_Outlines1__r()))) &&
            ((this.channel_Mgr_Outlines__r==null && other.getChannel_Mgr_Outlines__r()==null) || 
             (this.channel_Mgr_Outlines__r!=null &&
              this.channel_Mgr_Outlines__r.equals(other.getChannel_Mgr_Outlines__r()))) &&
            ((this.conference_Special_Needs__c==null && other.getConference_Special_Needs__c()==null) || 
             (this.conference_Special_Needs__c!=null &&
              this.conference_Special_Needs__c.equals(other.getConference_Special_Needs__c()))) &&
            ((this.contact_CC_Email__c==null && other.getContact_CC_Email__c()==null) || 
             (this.contact_CC_Email__c!=null &&
              this.contact_CC_Email__c.equals(other.getContact_CC_Email__c()))) &&
            ((this.contact_Types__c==null && other.getContact_Types__c()==null) || 
             (this.contact_Types__c!=null &&
              this.contact_Types__c.equals(other.getContact_Types__c()))) &&
            ((this.contact__r==null && other.getContact__r()==null) || 
             (this.contact__r!=null &&
              this.contact__r.equals(other.getContact__r()))) &&
            ((this.contractContactRoles==null && other.getContractContactRoles()==null) || 
             (this.contractContactRoles!=null &&
              this.contractContactRoles.equals(other.getContractContactRoles()))) &&
            ((this.contractsSigned==null && other.getContractsSigned()==null) || 
             (this.contractsSigned!=null &&
              this.contractsSigned.equals(other.getContractsSigned()))) &&
            ((this.courier1__Recipients__r==null && other.getCourier1__Recipients__r()==null) || 
             (this.courier1__Recipients__r!=null &&
              this.courier1__Recipients__r.equals(other.getCourier1__Recipients__r()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.current_RCA__c==null && other.getCurrent_RCA__c()==null) || 
             (this.current_RCA__c!=null &&
              this.current_RCA__c.equals(other.getCurrent_RCA__c()))) &&
            ((this.demo_Certifications__r==null && other.getDemo_Certifications__r()==null) || 
             (this.demo_Certifications__r!=null &&
              this.demo_Certifications__r.equals(other.getDemo_Certifications__r()))) &&
            ((this.demos__r==null && other.getDemos__r()==null) || 
             (this.demos__r!=null &&
              this.demos__r.equals(other.getDemos__r()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.emailBouncedDate==null && other.getEmailBouncedDate()==null) || 
             (this.emailBouncedDate!=null &&
              this.emailBouncedDate.equals(other.getEmailBouncedDate()))) &&
            ((this.emailBouncedReason==null && other.getEmailBouncedReason()==null) || 
             (this.emailBouncedReason!=null &&
              this.emailBouncedReason.equals(other.getEmailBouncedReason()))) &&
            ((this.emailStatuses==null && other.getEmailStatuses()==null) || 
             (this.emailStatuses!=null &&
              this.emailStatuses.equals(other.getEmailStatuses()))) &&
            ((this.email_Recipient__c==null && other.getEmail_Recipient__c()==null) || 
             (this.email_Recipient__c!=null &&
              this.email_Recipient__c.equals(other.getEmail_Recipient__c()))) &&
            ((this.eventRelations==null && other.getEventRelations()==null) || 
             (this.eventRelations!=null &&
              this.eventRelations.equals(other.getEventRelations()))) &&
            ((this.event_Attendees__r==null && other.getEvent_Attendees__r()==null) || 
             (this.event_Attendees__r!=null &&
              this.event_Attendees__r.equals(other.getEvent_Attendees__r()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              this.events.equals(other.getEvents()))) &&
            ((this.exam_Attendees__r==null && other.getExam_Attendees__r()==null) || 
             (this.exam_Attendees__r!=null &&
              this.exam_Attendees__r.equals(other.getExam_Attendees__r()))) &&
            ((this.executive_Contact__c==null && other.getExecutive_Contact__c()==null) || 
             (this.executive_Contact__c!=null &&
              this.executive_Contact__c.equals(other.getExecutive_Contact__c()))) &&
            ((this.executive__c==null && other.getExecutive__c()==null) || 
             (this.executive__c!=null &&
              this.executive__c.equals(other.getExecutive__c()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.feeds==null && other.getFeeds()==null) || 
             (this.feeds!=null &&
              this.feeds.equals(other.getFeeds()))) &&
            ((this.fest_Newsletter_Opt_Out__c==null && other.getFest_Newsletter_Opt_Out__c()==null) || 
             (this.fest_Newsletter_Opt_Out__c!=null &&
              this.fest_Newsletter_Opt_Out__c.equals(other.getFest_Newsletter_Opt_Out__c()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.food_Allergies_Needs__c==null && other.getFood_Allergies_Needs__c()==null) || 
             (this.food_Allergies_Needs__c!=null &&
              this.food_Allergies_Needs__c.equals(other.getFood_Allergies_Needs__c()))) &&
            ((this.hasOptedOutOfEmail==null && other.getHasOptedOutOfEmail()==null) || 
             (this.hasOptedOutOfEmail!=null &&
              this.hasOptedOutOfEmail.equals(other.getHasOptedOutOfEmail()))) &&
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
            ((this.idea_Digest_Opt_Out__c==null && other.getIdea_Digest_Opt_Out__c()==null) || 
             (this.idea_Digest_Opt_Out__c!=null &&
              this.idea_Digest_Opt_Out__c.equals(other.getIdea_Digest_Opt_Out__c()))) &&
            ((this.idea_Digest_Subscription_Type__c==null && other.getIdea_Digest_Subscription_Type__c()==null) || 
             (this.idea_Digest_Subscription_Type__c!=null &&
              this.idea_Digest_Subscription_Type__c.equals(other.getIdea_Digest_Subscription_Type__c()))) &&
            ((this.instances1__r==null && other.getInstances1__r()==null) || 
             (this.instances1__r!=null &&
              this.instances1__r.equals(other.getInstances1__r()))) &&
            ((this.instances__r==null && other.getInstances__r()==null) || 
             (this.instances__r!=null &&
              this.instances__r.equals(other.getInstances__r()))) &&
            ((this.internal_Department_Sub__c==null && other.getInternal_Department_Sub__c()==null) || 
             (this.internal_Department_Sub__c!=null &&
              this.internal_Department_Sub__c.equals(other.getInternal_Department_Sub__c()))) &&
            ((this.internal_Department__c==null && other.getInternal_Department__c()==null) || 
             (this.internal_Department__c!=null &&
              this.internal_Department__c.equals(other.getInternal_Department__c()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.jigsaw==null && other.getJigsaw()==null) || 
             (this.jigsaw!=null &&
              this.jigsaw.equals(other.getJigsaw()))) &&
            ((this.jigsawContactId==null && other.getJigsawContactId()==null) || 
             (this.jigsawContactId!=null &&
              this.jigsawContactId.equals(other.getJigsawContactId()))) &&
            ((this.lastActivityDate==null && other.getLastActivityDate()==null) || 
             (this.lastActivityDate!=null &&
              this.lastActivityDate.equals(other.getLastActivityDate()))) &&
            ((this.lastCURequestDate==null && other.getLastCURequestDate()==null) || 
             (this.lastCURequestDate!=null &&
              this.lastCURequestDate.equals(other.getLastCURequestDate()))) &&
            ((this.lastCUUpdateDate==null && other.getLastCUUpdateDate()==null) || 
             (this.lastCUUpdateDate!=null &&
              this.lastCUUpdateDate.equals(other.getLastCUUpdateDate()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.logo_Testimonial_Trackings__r==null && other.getLogo_Testimonial_Trackings__r()==null) || 
             (this.logo_Testimonial_Trackings__r!=null &&
              this.logo_Testimonial_Trackings__r.equals(other.getLogo_Testimonial_Trackings__r()))) &&
            ((this.mailingCity==null && other.getMailingCity()==null) || 
             (this.mailingCity!=null &&
              this.mailingCity.equals(other.getMailingCity()))) &&
            ((this.mailingCountry==null && other.getMailingCountry()==null) || 
             (this.mailingCountry!=null &&
              this.mailingCountry.equals(other.getMailingCountry()))) &&
            ((this.mailingPostalCode==null && other.getMailingPostalCode()==null) || 
             (this.mailingPostalCode!=null &&
              this.mailingPostalCode.equals(other.getMailingPostalCode()))) &&
            ((this.mailingState==null && other.getMailingState()==null) || 
             (this.mailingState!=null &&
              this.mailingState.equals(other.getMailingState()))) &&
            ((this.mailingStreet==null && other.getMailingStreet()==null) || 
             (this.mailingStreet!=null &&
              this.mailingStreet.equals(other.getMailingStreet()))) &&
            ((this.marketing__c==null && other.getMarketing__c()==null) || 
             (this.marketing__c!=null &&
              this.marketing__c.equals(other.getMarketing__c()))) &&
            ((this.masterRecord==null && other.getMasterRecord()==null) || 
             (this.masterRecord!=null &&
              this.masterRecord.equals(other.getMasterRecord()))) &&
            ((this.masterRecordId==null && other.getMasterRecordId()==null) || 
             (this.masterRecordId!=null &&
              this.masterRecordId.equals(other.getMasterRecordId()))) &&
            ((this.meetings__r==null && other.getMeetings__r()==null) || 
             (this.meetings__r!=null &&
              this.meetings__r.equals(other.getMeetings__r()))) &&
            ((this.mobilePhone==null && other.getMobilePhone()==null) || 
             (this.mobilePhone!=null &&
              this.mobilePhone.equals(other.getMobilePhone()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.number_of_Related_Contacts__c==null && other.getNumber_of_Related_Contacts__c()==null) || 
             (this.number_of_Related_Contacts__c!=null &&
              this.number_of_Related_Contacts__c.equals(other.getNumber_of_Related_Contacts__c()))) &&
            ((this.number_of_Times_Renewed__c==null && other.getNumber_of_Times_Renewed__c()==null) || 
             (this.number_of_Times_Renewed__c!=null &&
              this.number_of_Times_Renewed__c.equals(other.getNumber_of_Times_Renewed__c()))) &&
            ((this.onsite_Visit_Attendees__r==null && other.getOnsite_Visit_Attendees__r()==null) || 
             (this.onsite_Visit_Attendees__r!=null &&
              this.onsite_Visit_Attendees__r.equals(other.getOnsite_Visit_Attendees__r()))) &&
            ((this.openActivities==null && other.getOpenActivities()==null) || 
             (this.openActivities!=null &&
              this.openActivities.equals(other.getOpenActivities()))) &&
            ((this.opportunities==null && other.getOpportunities()==null) || 
             (this.opportunities!=null &&
              this.opportunities.equals(other.getOpportunities()))) &&
            ((this.opportunityContactRoles==null && other.getOpportunityContactRoles()==null) || 
             (this.opportunityContactRoles!=null &&
              this.opportunityContactRoles.equals(other.getOpportunityContactRoles()))) &&
            ((this.otherCity==null && other.getOtherCity()==null) || 
             (this.otherCity!=null &&
              this.otherCity.equals(other.getOtherCity()))) &&
            ((this.otherCountry==null && other.getOtherCountry()==null) || 
             (this.otherCountry!=null &&
              this.otherCountry.equals(other.getOtherCountry()))) &&
            ((this.otherPhone==null && other.getOtherPhone()==null) || 
             (this.otherPhone!=null &&
              this.otherPhone.equals(other.getOtherPhone()))) &&
            ((this.otherPostalCode==null && other.getOtherPostalCode()==null) || 
             (this.otherPostalCode!=null &&
              this.otherPostalCode.equals(other.getOtherPostalCode()))) &&
            ((this.otherState==null && other.getOtherState()==null) || 
             (this.otherState!=null &&
              this.otherState.equals(other.getOtherState()))) &&
            ((this.otherStreet==null && other.getOtherStreet()==null) || 
             (this.otherStreet!=null &&
              this.otherStreet.equals(other.getOtherStreet()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.pilots1__r==null && other.getPilots1__r()==null) || 
             (this.pilots1__r!=null &&
              this.pilots1__r.equals(other.getPilots1__r()))) &&
            ((this.pilots2__r==null && other.getPilots2__r()==null) || 
             (this.pilots2__r!=null &&
              this.pilots2__r.equals(other.getPilots2__r()))) &&
            ((this.pilots__r==null && other.getPilots__r()==null) || 
             (this.pilots__r!=null &&
              this.pilots__r.equals(other.getPilots__r()))) &&
            ((this.platform_Enhancements__c==null && other.getPlatform_Enhancements__c()==null) || 
             (this.platform_Enhancements__c!=null &&
              this.platform_Enhancements__c.equals(other.getPlatform_Enhancements__c()))) &&
            ((this.preferred_Method_of_Contact__c==null && other.getPreferred_Method_of_Contact__c()==null) || 
             (this.preferred_Method_of_Contact__c!=null &&
              this.preferred_Method_of_Contact__c.equals(other.getPreferred_Method_of_Contact__c()))) &&
            ((this.primary_Admin_Contact__c==null && other.getPrimary_Admin_Contact__c()==null) || 
             (this.primary_Admin_Contact__c!=null &&
              this.primary_Admin_Contact__c.equals(other.getPrimary_Admin_Contact__c()))) &&
            ((this.primary_Contacts1__r==null && other.getPrimary_Contacts1__r()==null) || 
             (this.primary_Contacts1__r!=null &&
              this.primary_Contacts1__r.equals(other.getPrimary_Contacts1__r()))) &&
            ((this.primary_Contacts__r==null && other.getPrimary_Contacts__r()==null) || 
             (this.primary_Contacts__r!=null &&
              this.primary_Contacts__r.equals(other.getPrimary_Contacts__r()))) &&
            ((this.primary_Marketing_Contact__c==null && other.getPrimary_Marketing_Contact__c()==null) || 
             (this.primary_Marketing_Contact__c!=null &&
              this.primary_Marketing_Contact__c.equals(other.getPrimary_Marketing_Contact__c()))) &&
            ((this.primary_Sales_Contact__c==null && other.getPrimary_Sales_Contact__c()==null) || 
             (this.primary_Sales_Contact__c!=null &&
              this.primary_Sales_Contact__c.equals(other.getPrimary_Sales_Contact__c()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.RAR_DLs__r==null && other.getRAR_DLs__r()==null) || 
             (this.RAR_DLs__r!=null &&
              this.RAR_DLs__r.equals(other.getRAR_DLs__r()))) &&
            ((this.RCA_2__c==null && other.getRCA_2__c()==null) || 
             (this.RCA_2__c!=null &&
              this.RCA_2__c.equals(other.getRCA_2__c()))) &&
            ((this.RCA_Certification_End_Date__c==null && other.getRCA_Certification_End_Date__c()==null) || 
             (this.RCA_Certification_End_Date__c!=null &&
              this.RCA_Certification_End_Date__c.equals(other.getRCA_Certification_End_Date__c()))) &&
            ((this.RCA_Certified_Date__c==null && other.getRCA_Certified_Date__c()==null) || 
             (this.RCA_Certified_Date__c!=null &&
              this.RCA_Certified_Date__c.equals(other.getRCA_Certified_Date__c()))) &&
            ((this.RCA_Contact__c==null && other.getRCA_Contact__c()==null) || 
             (this.RCA_Contact__c!=null &&
              this.RCA_Contact__c.equals(other.getRCA_Contact__c()))) &&
            ((this.RCA_Contact__r==null && other.getRCA_Contact__r()==null) || 
             (this.RCA_Contact__r!=null &&
              this.RCA_Contact__r.equals(other.getRCA_Contact__r()))) &&
            ((this.RCA_End_Date__c==null && other.getRCA_End_Date__c()==null) || 
             (this.RCA_End_Date__c!=null &&
              this.RCA_End_Date__c.equals(other.getRCA_End_Date__c()))) &&
            ((this.RCA_Start_Date__c==null && other.getRCA_Start_Date__c()==null) || 
             (this.RCA_Start_Date__c!=null &&
              this.RCA_Start_Date__c.equals(other.getRCA_Start_Date__c()))) &&
            ((this.RCA__c==null && other.getRCA__c()==null) || 
             (this.RCA__c!=null &&
              this.RCA__c.equals(other.getRCA__c()))) &&
            ((this.RCE_Credit_Total__c==null && other.getRCE_Credit_Total__c()==null) || 
             (this.RCE_Credit_Total__c!=null &&
              this.RCE_Credit_Total__c.equals(other.getRCE_Credit_Total__c()))) &&
            ((this.RCE_Credits__r==null && other.getRCE_Credits__r()==null) || 
             (this.RCE_Credits__r!=null &&
              this.RCE_Credits__r.equals(other.getRCE_Credits__r()))) &&
            ((this.RCE_Credits_for_Current_Year__c==null && other.getRCE_Credits_for_Current_Year__c()==null) || 
             (this.RCE_Credits_for_Current_Year__c!=null &&
              this.RCE_Credits_for_Current_Year__c.equals(other.getRCE_Credits_for_Current_Year__c()))) &&
            ((this.RCSP_Certified__c==null && other.getRCSP_Certified__c()==null) || 
             (this.RCSP_Certified__c!=null &&
              this.RCSP_Certified__c.equals(other.getRCSP_Certified__c()))) &&
            ((this.RCSP__c==null && other.getRCSP__c()==null) || 
             (this.RCSP__c!=null &&
              this.RCSP__c.equals(other.getRCSP__c()))) &&
            ((this.registered_for_Relativity_Fest_2012__c==null && other.getRegistered_for_Relativity_Fest_2012__c()==null) || 
             (this.registered_for_Relativity_Fest_2012__c!=null &&
              this.registered_for_Relativity_Fest_2012__c.equals(other.getRegistered_for_Relativity_Fest_2012__c()))) &&
            ((this.registered_for_Userfest_2010__c==null && other.getRegistered_for_Userfest_2010__c()==null) || 
             (this.registered_for_Userfest_2010__c!=null &&
              this.registered_for_Userfest_2010__c.equals(other.getRegistered_for_Userfest_2010__c()))) &&
            ((this.relativity_Assisted_Review_Newsletter__c==null && other.getRelativity_Assisted_Review_Newsletter__c()==null) || 
             (this.relativity_Assisted_Review_Newsletter__c!=null &&
              this.relativity_Assisted_Review_Newsletter__c.equals(other.getRelativity_Assisted_Review_Newsletter__c()))) &&
            ((this.relativity_Fest_Newsletter__c==null && other.getRelativity_Fest_Newsletter__c()==null) || 
             (this.relativity_Fest_Newsletter__c!=null &&
              this.relativity_Fest_Newsletter__c.equals(other.getRelativity_Fest_Newsletter__c()))) &&
            ((this.reseller_Point_of_Contact__c==null && other.getReseller_Point_of_Contact__c()==null) || 
             (this.reseller_Point_of_Contact__c!=null &&
              this.reseller_Point_of_Contact__c.equals(other.getReseller_Point_of_Contact__c()))) &&
            ((this.reseller_Sales_Training_Test_Score__c==null && other.getReseller_Sales_Training_Test_Score__c()==null) || 
             (this.reseller_Sales_Training_Test_Score__c!=null &&
              this.reseller_Sales_Training_Test_Score__c.equals(other.getReseller_Sales_Training_Test_Score__c()))) &&
            ((this.SFDC_Projects__r==null && other.getSFDC_Projects__r()==null) || 
             (this.SFDC_Projects__r!=null &&
              this.SFDC_Projects__r.equals(other.getSFDC_Projects__r()))) &&
            ((this.SWAG__r==null && other.getSWAG__r()==null) || 
             (this.SWAG__r!=null &&
              this.SWAG__r.equals(other.getSWAG__r()))) &&
            ((this.sales_Distribution_List__c==null && other.getSales_Distribution_List__c()==null) || 
             (this.sales_Distribution_List__c!=null &&
              this.sales_Distribution_List__c.equals(other.getSales_Distribution_List__c()))) &&
            ((this.sales_Training_Surveys__r==null && other.getSales_Training_Surveys__r()==null) || 
             (this.sales_Training_Surveys__r!=null &&
              this.sales_Training_Surveys__r.equals(other.getSales_Training_Surveys__r()))) &&
            ((this.sales_Training_Test_Score__c==null && other.getSales_Training_Test_Score__c()==null) || 
             (this.sales_Training_Test_Score__c!=null &&
              this.sales_Training_Test_Score__c.equals(other.getSales_Training_Test_Score__c()))) &&
            ((this.sales__c==null && other.getSales__c()==null) || 
             (this.sales__c!=null &&
              this.sales__c.equals(other.getSales__c()))) &&
            ((this.salutation==null && other.getSalutation()==null) || 
             (this.salutation!=null &&
              this.salutation.equals(other.getSalutation()))) &&
            ((this.script_Xchg_Digest_Opt_Out__c==null && other.getScript_Xchg_Digest_Opt_Out__c()==null) || 
             (this.script_Xchg_Digest_Opt_Out__c!=null &&
              this.script_Xchg_Digest_Opt_Out__c.equals(other.getScript_Xchg_Digest_Opt_Out__c()))) &&
            ((this.script_Xchg_Digest_Subscription_Type__c==null && other.getScript_Xchg_Digest_Subscription_Type__c()==null) || 
             (this.script_Xchg_Digest_Subscription_Type__c!=null &&
              this.script_Xchg_Digest_Subscription_Type__c.equals(other.getScript_Xchg_Digest_Subscription_Type__c()))) &&
            ((this.send_Email__c==null && other.getSend_Email__c()==null) || 
             (this.send_Email__c!=null &&
              this.send_Email__c.equals(other.getSend_Email__c()))) &&
            ((this.send_RCA_Credit_Email__c==null && other.getSend_RCA_Credit_Email__c()==null) || 
             (this.send_RCA_Credit_Email__c!=null &&
              this.send_RCA_Credit_Email__c.equals(other.getSend_RCA_Credit_Email__c()))) &&
            ((this.send_Sales_Cert_Survey__c==null && other.getSend_Sales_Cert_Survey__c()==null) || 
             (this.send_Sales_Cert_Survey__c!=null &&
              this.send_Sales_Cert_Survey__c.equals(other.getSend_Sales_Cert_Survey__c()))) &&
            ((this.shares==null && other.getShares()==null) || 
             (this.shares!=null &&
              this.shares.equals(other.getShares()))) &&
            ((this.shirt_Size__c==null && other.getShirt_Size__c()==null) || 
             (this.shirt_Size__c!=null &&
              this.shirt_Size__c.equals(other.getShirt_Size__c()))) &&
            ((this.status_Meeting_Attendees__r==null && other.getStatus_Meeting_Attendees__r()==null) || 
             (this.status_Meeting_Attendees__r!=null &&
              this.status_Meeting_Attendees__r.equals(other.getStatus_Meeting_Attendees__r()))) &&
            ((this.status_Meetings__r==null && other.getStatus_Meetings__r()==null) || 
             (this.status_Meetings__r!=null &&
              this.status_Meetings__r.equals(other.getStatus_Meetings__r()))) &&
            ((this.support_Distribution_List__c==null && other.getSupport_Distribution_List__c()==null) || 
             (this.support_Distribution_List__c!=null &&
              this.support_Distribution_List__c.equals(other.getSupport_Distribution_List__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              this.tasks.equals(other.getTasks()))) &&
            ((this.tickets1__r==null && other.getTickets1__r()==null) || 
             (this.tickets1__r!=null &&
              this.tickets1__r.equals(other.getTickets1__r()))) &&
            ((this.tickets2__r==null && other.getTickets2__r()==null) || 
             (this.tickets2__r!=null &&
              this.tickets2__r.equals(other.getTickets2__r()))) &&
            ((this.tickets3__r==null && other.getTickets3__r()==null) || 
             (this.tickets3__r!=null &&
              this.tickets3__r.equals(other.getTickets3__r()))) &&
            ((this.tickets4__r==null && other.getTickets4__r()==null) || 
             (this.tickets4__r!=null &&
              this.tickets4__r.equals(other.getTickets4__r()))) &&
            ((this.tickets5__r==null && other.getTickets5__r()==null) || 
             (this.tickets5__r!=null &&
              this.tickets5__r.equals(other.getTickets5__r()))) &&
            ((this.tickets__r==null && other.getTickets__r()==null) || 
             (this.tickets__r!=null &&
              this.tickets__r.equals(other.getTickets__r()))) &&
            ((this.time_Zone__c==null && other.getTime_Zone__c()==null) || 
             (this.time_Zone__c!=null &&
              this.time_Zone__c.equals(other.getTime_Zone__c()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.to_Persistant_Contact__r==null && other.getTo_Persistant_Contact__r()==null) || 
             (this.to_Persistant_Contact__r!=null &&
              this.to_Persistant_Contact__r.equals(other.getTo_Persistant_Contact__r()))) &&
            ((this.training_Attendees__r==null && other.getTraining_Attendees__r()==null) || 
             (this.training_Attendees__r!=null &&
              this.training_Attendees__r.equals(other.getTraining_Attendees__r()))) &&
            ((this.training_Questions__r==null && other.getTraining_Questions__r()==null) || 
             (this.training_Questions__r!=null &&
              this.training_Questions__r.equals(other.getTraining_Questions__r()))) &&
            ((this.trainings1__r==null && other.getTrainings1__r()==null) || 
             (this.trainings1__r!=null &&
              this.trainings1__r.equals(other.getTrainings1__r()))) &&
            ((this.trainings__r==null && other.getTrainings__r()==null) || 
             (this.trainings__r!=null &&
              this.trainings__r.equals(other.getTrainings__r()))) &&
            ((this.blonk_News_and_Press__c==null && other.getKCura_News_and_Press__c()==null) || 
             (this.blonk_News_and_Press__c!=null &&
              this.blonk_News_and_Press__c.equals(other.getKCura_News_and_Press__c())));
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
        if (getAccountContactRoles() != null) {
            _hashCode += getAccountContactRoles().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getAccounts1__r() != null) {
            _hashCode += getAccounts1__r().hashCode();
        }
        if (getAccounts__r() != null) {
            _hashCode += getAccounts__r().hashCode();
        }
        if (getActive_Contact__c() != null) {
            _hashCode += getActive_Contact__c().hashCode();
        }
        if (getActivityHistories() != null) {
            _hashCode += getActivityHistories().hashCode();
        }
        if (getAdmin_Certifications__r() != null) {
            _hashCode += getAdmin_Certifications__r().hashCode();
        }
        if (getAdmin_Contact__c() != null) {
            _hashCode += getAdmin_Contact__c().hashCode();
        }
        if (getAdminsitrative_Contact__c() != null) {
            _hashCode += getAdminsitrative_Contact__c().hashCode();
        }
        if (getAlert__c() != null) {
            _hashCode += getAlert__c().hashCode();
        }
        if (getAnalytic_Snapshots__r() != null) {
            _hashCode += getAnalytic_Snapshots__r().hashCode();
        }
        if (getAnalytics_Training_Test_Score__c() != null) {
            _hashCode += getAnalytics_Training_Test_Score__c().hashCode();
        }
        if (getAnswer_Digest_Opt_Out__c() != null) {
            _hashCode += getAnswer_Digest_Opt_Out__c().hashCode();
        }
        if (getAnswer_Digest_Subscribed_Categories__r() != null) {
            _hashCode += getAnswer_Digest_Subscribed_Categories__r().hashCode();
        }
        if (getAnswer_Digest_Subscription_Type__c() != null) {
            _hashCode += getAnswer_Digest_Subscription_Type__c().hashCode();
        }
        if (getAssets() != null) {
            _hashCode += getAssets().hashCode();
        }
        if (getAssisted_Review_Newsletter_Opt_Out__c() != null) {
            _hashCode += getAssisted_Review_Newsletter_Opt_Out__c().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getAttended_Relativity_Analytics_Overview__c() != null) {
            _hashCode += getAttended_Relativity_Analytics_Overview__c().hashCode();
        }
        if (getAttended_Relativity_Sales_Training__c() != null) {
            _hashCode += getAttended_Relativity_Sales_Training__c().hashCode();
        }
        if (getAttended_Reseller_Sales_Training__c() != null) {
            _hashCode += getAttended_Reseller_Sales_Training__c().hashCode();
        }
        if (getBest_Time_to_Contact__c() != null) {
            _hashCode += getBest_Time_to_Contact__c().hashCode();
        }
        if (getBest_Way_to_Contact__c() != null) {
            _hashCode += getBest_Way_to_Contact__c().hashCode();
        }
        if (getCampaignMembers() != null) {
            _hashCode += getCampaignMembers().hashCode();
        }
        if (getCaseContactRoles() != null) {
            _hashCode += getCaseContactRoles().hashCode();
        }
        if (getCases() != null) {
            _hashCode += getCases().hashCode();
        }
        if (getCases1__r() != null) {
            _hashCode += getCases1__r().hashCode();
        }
        if (getCases__r() != null) {
            _hashCode += getCases__r().hashCode();
        }
        if (getCertification_Contact__c() != null) {
            _hashCode += getCertification_Contact__c().hashCode();
        }
        if (getCertification_Contact__r() != null) {
            _hashCode += getCertification_Contact__r().hashCode();
        }
        if (getCertification_Updates__c() != null) {
            _hashCode += getCertification_Updates__c().hashCode();
        }
        if (getCertified_Admin__c() != null) {
            _hashCode += getCertified_Admin__c().hashCode();
        }
        if (getChannel_Mgr_Outline_Contacts__r() != null) {
            _hashCode += getChannel_Mgr_Outline_Contacts__r().hashCode();
        }
        if (getChannel_Mgr_Outlines1__r() != null) {
            _hashCode += getChannel_Mgr_Outlines1__r().hashCode();
        }
        if (getChannel_Mgr_Outlines__r() != null) {
            _hashCode += getChannel_Mgr_Outlines__r().hashCode();
        }
        if (getConference_Special_Needs__c() != null) {
            _hashCode += getConference_Special_Needs__c().hashCode();
        }
        if (getContact_CC_Email__c() != null) {
            _hashCode += getContact_CC_Email__c().hashCode();
        }
        if (getContact_Types__c() != null) {
            _hashCode += getContact_Types__c().hashCode();
        }
        if (getContact__r() != null) {
            _hashCode += getContact__r().hashCode();
        }
        if (getContractContactRoles() != null) {
            _hashCode += getContractContactRoles().hashCode();
        }
        if (getContractsSigned() != null) {
            _hashCode += getContractsSigned().hashCode();
        }
        if (getCourier1__Recipients__r() != null) {
            _hashCode += getCourier1__Recipients__r().hashCode();
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
        if (getCurrent_RCA__c() != null) {
            _hashCode += getCurrent_RCA__c().hashCode();
        }
        if (getDemo_Certifications__r() != null) {
            _hashCode += getDemo_Certifications__r().hashCode();
        }
        if (getDemos__r() != null) {
            _hashCode += getDemos__r().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getEmailBouncedDate() != null) {
            _hashCode += getEmailBouncedDate().hashCode();
        }
        if (getEmailBouncedReason() != null) {
            _hashCode += getEmailBouncedReason().hashCode();
        }
        if (getEmailStatuses() != null) {
            _hashCode += getEmailStatuses().hashCode();
        }
        if (getEmail_Recipient__c() != null) {
            _hashCode += getEmail_Recipient__c().hashCode();
        }
        if (getEventRelations() != null) {
            _hashCode += getEventRelations().hashCode();
        }
        if (getEvent_Attendees__r() != null) {
            _hashCode += getEvent_Attendees__r().hashCode();
        }
        if (getEvents() != null) {
            _hashCode += getEvents().hashCode();
        }
        if (getExam_Attendees__r() != null) {
            _hashCode += getExam_Attendees__r().hashCode();
        }
        if (getExecutive_Contact__c() != null) {
            _hashCode += getExecutive_Contact__c().hashCode();
        }
        if (getExecutive__c() != null) {
            _hashCode += getExecutive__c().hashCode();
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
        if (getFest_Newsletter_Opt_Out__c() != null) {
            _hashCode += getFest_Newsletter_Opt_Out__c().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getFood_Allergies_Needs__c() != null) {
            _hashCode += getFood_Allergies_Needs__c().hashCode();
        }
        if (getHasOptedOutOfEmail() != null) {
            _hashCode += getHasOptedOutOfEmail().hashCode();
        }
        if (getHistories() != null) {
            _hashCode += getHistories().hashCode();
        }
        if (getIdea_Digest_Opt_Out__c() != null) {
            _hashCode += getIdea_Digest_Opt_Out__c().hashCode();
        }
        if (getIdea_Digest_Subscription_Type__c() != null) {
            _hashCode += getIdea_Digest_Subscription_Type__c().hashCode();
        }
        if (getInstances1__r() != null) {
            _hashCode += getInstances1__r().hashCode();
        }
        if (getInstances__r() != null) {
            _hashCode += getInstances__r().hashCode();
        }
        if (getInternal_Department_Sub__c() != null) {
            _hashCode += getInternal_Department_Sub__c().hashCode();
        }
        if (getInternal_Department__c() != null) {
            _hashCode += getInternal_Department__c().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getJigsaw() != null) {
            _hashCode += getJigsaw().hashCode();
        }
        if (getJigsawContactId() != null) {
            _hashCode += getJigsawContactId().hashCode();
        }
        if (getLastActivityDate() != null) {
            _hashCode += getLastActivityDate().hashCode();
        }
        if (getLastCURequestDate() != null) {
            _hashCode += getLastCURequestDate().hashCode();
        }
        if (getLastCUUpdateDate() != null) {
            _hashCode += getLastCUUpdateDate().hashCode();
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
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getLogo_Testimonial_Trackings__r() != null) {
            _hashCode += getLogo_Testimonial_Trackings__r().hashCode();
        }
        if (getMailingCity() != null) {
            _hashCode += getMailingCity().hashCode();
        }
        if (getMailingCountry() != null) {
            _hashCode += getMailingCountry().hashCode();
        }
        if (getMailingPostalCode() != null) {
            _hashCode += getMailingPostalCode().hashCode();
        }
        if (getMailingState() != null) {
            _hashCode += getMailingState().hashCode();
        }
        if (getMailingStreet() != null) {
            _hashCode += getMailingStreet().hashCode();
        }
        if (getMarketing__c() != null) {
            _hashCode += getMarketing__c().hashCode();
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
        if (getMobilePhone() != null) {
            _hashCode += getMobilePhone().hashCode();
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
        if (getNumber_of_Related_Contacts__c() != null) {
            _hashCode += getNumber_of_Related_Contacts__c().hashCode();
        }
        if (getNumber_of_Times_Renewed__c() != null) {
            _hashCode += getNumber_of_Times_Renewed__c().hashCode();
        }
        if (getOnsite_Visit_Attendees__r() != null) {
            _hashCode += getOnsite_Visit_Attendees__r().hashCode();
        }
        if (getOpenActivities() != null) {
            _hashCode += getOpenActivities().hashCode();
        }
        if (getOpportunities() != null) {
            _hashCode += getOpportunities().hashCode();
        }
        if (getOpportunityContactRoles() != null) {
            _hashCode += getOpportunityContactRoles().hashCode();
        }
        if (getOtherCity() != null) {
            _hashCode += getOtherCity().hashCode();
        }
        if (getOtherCountry() != null) {
            _hashCode += getOtherCountry().hashCode();
        }
        if (getOtherPhone() != null) {
            _hashCode += getOtherPhone().hashCode();
        }
        if (getOtherPostalCode() != null) {
            _hashCode += getOtherPostalCode().hashCode();
        }
        if (getOtherState() != null) {
            _hashCode += getOtherState().hashCode();
        }
        if (getOtherStreet() != null) {
            _hashCode += getOtherStreet().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getPilots1__r() != null) {
            _hashCode += getPilots1__r().hashCode();
        }
        if (getPilots2__r() != null) {
            _hashCode += getPilots2__r().hashCode();
        }
        if (getPilots__r() != null) {
            _hashCode += getPilots__r().hashCode();
        }
        if (getPlatform_Enhancements__c() != null) {
            _hashCode += getPlatform_Enhancements__c().hashCode();
        }
        if (getPreferred_Method_of_Contact__c() != null) {
            _hashCode += getPreferred_Method_of_Contact__c().hashCode();
        }
        if (getPrimary_Admin_Contact__c() != null) {
            _hashCode += getPrimary_Admin_Contact__c().hashCode();
        }
        if (getPrimary_Contacts1__r() != null) {
            _hashCode += getPrimary_Contacts1__r().hashCode();
        }
        if (getPrimary_Contacts__r() != null) {
            _hashCode += getPrimary_Contacts__r().hashCode();
        }
        if (getPrimary_Marketing_Contact__c() != null) {
            _hashCode += getPrimary_Marketing_Contact__c().hashCode();
        }
        if (getPrimary_Sales_Contact__c() != null) {
            _hashCode += getPrimary_Sales_Contact__c().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getRAR_DLs__r() != null) {
            _hashCode += getRAR_DLs__r().hashCode();
        }
        if (getRCA_2__c() != null) {
            _hashCode += getRCA_2__c().hashCode();
        }
        if (getRCA_Certification_End_Date__c() != null) {
            _hashCode += getRCA_Certification_End_Date__c().hashCode();
        }
        if (getRCA_Certified_Date__c() != null) {
            _hashCode += getRCA_Certified_Date__c().hashCode();
        }
        if (getRCA_Contact__c() != null) {
            _hashCode += getRCA_Contact__c().hashCode();
        }
        if (getRCA_Contact__r() != null) {
            _hashCode += getRCA_Contact__r().hashCode();
        }
        if (getRCA_End_Date__c() != null) {
            _hashCode += getRCA_End_Date__c().hashCode();
        }
        if (getRCA_Start_Date__c() != null) {
            _hashCode += getRCA_Start_Date__c().hashCode();
        }
        if (getRCA__c() != null) {
            _hashCode += getRCA__c().hashCode();
        }
        if (getRCE_Credit_Total__c() != null) {
            _hashCode += getRCE_Credit_Total__c().hashCode();
        }
        if (getRCE_Credits__r() != null) {
            _hashCode += getRCE_Credits__r().hashCode();
        }
        if (getRCE_Credits_for_Current_Year__c() != null) {
            _hashCode += getRCE_Credits_for_Current_Year__c().hashCode();
        }
        if (getRCSP_Certified__c() != null) {
            _hashCode += getRCSP_Certified__c().hashCode();
        }
        if (getRCSP__c() != null) {
            _hashCode += getRCSP__c().hashCode();
        }
        if (getRegistered_for_Relativity_Fest_2012__c() != null) {
            _hashCode += getRegistered_for_Relativity_Fest_2012__c().hashCode();
        }
        if (getRegistered_for_Userfest_2010__c() != null) {
            _hashCode += getRegistered_for_Userfest_2010__c().hashCode();
        }
        if (getRelativity_Assisted_Review_Newsletter__c() != null) {
            _hashCode += getRelativity_Assisted_Review_Newsletter__c().hashCode();
        }
        if (getRelativity_Fest_Newsletter__c() != null) {
            _hashCode += getRelativity_Fest_Newsletter__c().hashCode();
        }
        if (getReseller_Point_of_Contact__c() != null) {
            _hashCode += getReseller_Point_of_Contact__c().hashCode();
        }
        if (getReseller_Sales_Training_Test_Score__c() != null) {
            _hashCode += getReseller_Sales_Training_Test_Score__c().hashCode();
        }
        if (getSFDC_Projects__r() != null) {
            _hashCode += getSFDC_Projects__r().hashCode();
        }
        if (getSWAG__r() != null) {
            _hashCode += getSWAG__r().hashCode();
        }
        if (getSales_Distribution_List__c() != null) {
            _hashCode += getSales_Distribution_List__c().hashCode();
        }
        if (getSales_Training_Surveys__r() != null) {
            _hashCode += getSales_Training_Surveys__r().hashCode();
        }
        if (getSales_Training_Test_Score__c() != null) {
            _hashCode += getSales_Training_Test_Score__c().hashCode();
        }
        if (getSales__c() != null) {
            _hashCode += getSales__c().hashCode();
        }
        if (getSalutation() != null) {
            _hashCode += getSalutation().hashCode();
        }
        if (getScript_Xchg_Digest_Opt_Out__c() != null) {
            _hashCode += getScript_Xchg_Digest_Opt_Out__c().hashCode();
        }
        if (getScript_Xchg_Digest_Subscription_Type__c() != null) {
            _hashCode += getScript_Xchg_Digest_Subscription_Type__c().hashCode();
        }
        if (getSend_Email__c() != null) {
            _hashCode += getSend_Email__c().hashCode();
        }
        if (getSend_RCA_Credit_Email__c() != null) {
            _hashCode += getSend_RCA_Credit_Email__c().hashCode();
        }
        if (getSend_Sales_Cert_Survey__c() != null) {
            _hashCode += getSend_Sales_Cert_Survey__c().hashCode();
        }
        if (getShares() != null) {
            _hashCode += getShares().hashCode();
        }
        if (getShirt_Size__c() != null) {
            _hashCode += getShirt_Size__c().hashCode();
        }
        if (getStatus_Meeting_Attendees__r() != null) {
            _hashCode += getStatus_Meeting_Attendees__r().hashCode();
        }
        if (getStatus_Meetings__r() != null) {
            _hashCode += getStatus_Meetings__r().hashCode();
        }
        if (getSupport_Distribution_List__c() != null) {
            _hashCode += getSupport_Distribution_List__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTasks() != null) {
            _hashCode += getTasks().hashCode();
        }
        if (getTickets1__r() != null) {
            _hashCode += getTickets1__r().hashCode();
        }
        if (getTickets2__r() != null) {
            _hashCode += getTickets2__r().hashCode();
        }
        if (getTickets3__r() != null) {
            _hashCode += getTickets3__r().hashCode();
        }
        if (getTickets4__r() != null) {
            _hashCode += getTickets4__r().hashCode();
        }
        if (getTickets5__r() != null) {
            _hashCode += getTickets5__r().hashCode();
        }
        if (getTickets__r() != null) {
            _hashCode += getTickets__r().hashCode();
        }
        if (getTime_Zone__c() != null) {
            _hashCode += getTime_Zone__c().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getTo_Persistant_Contact__r() != null) {
            _hashCode += getTo_Persistant_Contact__r().hashCode();
        }
        if (getTraining_Attendees__r() != null) {
            _hashCode += getTraining_Attendees__r().hashCode();
        }
        if (getTraining_Questions__r() != null) {
            _hashCode += getTraining_Questions__r().hashCode();
        }
        if (getTrainings1__r() != null) {
            _hashCode += getTrainings1__r().hashCode();
        }
        if (getTrainings__r() != null) {
            _hashCode += getTrainings__r().hashCode();
        }
        if (getKCura_News_and_Press__c() != null) {
            _hashCode += getKCura_News_and_Press__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Contact.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account"));
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
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accounts1__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Accounts1__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accounts__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Accounts__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Active_Contact__c"));
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
        elemField.setFieldName("admin_Certifications__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Admin_Certifications__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("admin_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Admin_Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adminsitrative_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Adminsitrative_Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alert__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Alert__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("analytics_Training_Test_Score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Analytics_Training_Test_Score__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answer_Digest_Opt_Out__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Answer_Digest_Opt_Out__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answer_Digest_Subscribed_Categories__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Answer_Digest_Subscribed_Categories__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answer_Digest_Subscription_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Answer_Digest_Subscription_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("assisted_Review_Newsletter_Opt_Out__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Assisted_Review_Newsletter_Opt_Out__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("attended_Relativity_Analytics_Overview__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attended_Relativity_Analytics_Overview__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attended_Relativity_Sales_Training__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attended_Relativity_Sales_Training__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attended_Reseller_Sales_Training__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attended_Reseller_Sales_Training__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("best_Time_to_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Best_Time_to_Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("best_Way_to_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Best_Way_to_Contact__c"));
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
        elemField.setFieldName("caseContactRoles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseContactRoles"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("cases1__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Cases1__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cases__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Cases__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certification_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certification_Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certification_Contact__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certification_Contact__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certification_Contact__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certification_Updates__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certification_Updates__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certified_Admin__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certified_Admin__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("channel_Mgr_Outlines1__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Channel_Mgr_Outlines1__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel_Mgr_Outlines__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Channel_Mgr_Outlines__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conference_Special_Needs__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Conference_Special_Needs__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact_CC_Email__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact_CC_Email__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact_Types__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact_Types__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("contractsSigned");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContractsSigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Recipients__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Recipients__r"));
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
        elemField.setFieldName("current_RCA__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Current_RCA__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("demo_Certifications__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Demo_Certifications__r"));
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
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailBouncedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailBouncedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailBouncedReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailBouncedReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailStatuses");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailStatuses"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email_Recipient__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Email_Recipient__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventRelations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EventRelations"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("event_Attendees__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Event_Attendees__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("exam_Attendees__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Exam_Attendees__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executive_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Executive_Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executive__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Executive__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("fest_Newsletter_Opt_Out__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fest_Newsletter_Opt_Out__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("food_Allergies_Needs__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Food_Allergies_Needs__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasOptedOutOfEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HasOptedOutOfEmail"));
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
        elemField.setFieldName("idea_Digest_Opt_Out__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Idea_Digest_Opt_Out__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idea_Digest_Subscription_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Idea_Digest_Subscription_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instances1__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Instances1__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("internal_Department_Sub__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Internal_Department_Sub__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internal_Department__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Internal_Department__c"));
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
        elemField.setFieldName("jigsaw");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Jigsaw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jigsawContactId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "JigsawContactId"));
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
        elemField.setFieldName("lastCURequestDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastCURequestDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastCUUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastCUUpdateDate"));
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
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastName"));
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
        elemField.setFieldName("mailingCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MailingCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailingCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MailingCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailingPostalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MailingPostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailingState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MailingState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailingStreet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MailingStreet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketing__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Marketing__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MasterRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
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
        elemField.setFieldName("mobilePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MobilePhone"));
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
        elemField.setFieldName("number_of_Related_Contacts__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Number_of_Related_Contacts__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number_of_Times_Renewed__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Number_of_Times_Renewed__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onsite_Visit_Attendees__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Onsite_Visit_Attendees__r"));
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
        elemField.setFieldName("opportunityContactRoles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityContactRoles"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OtherCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OtherCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OtherPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherPostalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OtherPostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OtherState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherStreet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OtherStreet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("pilots2__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pilots2__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pilots__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pilots__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("platform_Enhancements__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Platform_Enhancements__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferred_Method_of_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Preferred_Method_of_Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primary_Admin_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Primary_Admin_Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primary_Contacts1__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Primary_Contacts1__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("primary_Marketing_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Primary_Marketing_Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primary_Sales_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Primary_Sales_Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("RAR_DLs__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RAR_DLs__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RCA_2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCA_2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RCA_Certification_End_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCA_Certification_End_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RCA_Certified_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCA_Certified_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RCA_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCA_Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RCA_Contact__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCA_Contact__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RCA_End_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCA_End_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RCA_Start_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCA_Start_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RCA__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCA__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RCE_Credit_Total__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCE_Credit_Total__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RCE_Credits__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCE_Credits__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RCE_Credits_for_Current_Year__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCE_Credits_for_Current_Year__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RCSP_Certified__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCSP_Certified__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RCSP__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCSP__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registered_for_Relativity_Fest_2012__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Registered_for_Relativity_Fest_2012__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registered_for_Userfest_2010__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Registered_for_Userfest_2010__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relativity_Assisted_Review_Newsletter__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relativity_Assisted_Review_Newsletter__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relativity_Fest_Newsletter__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relativity_Fest_Newsletter__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reseller_Point_of_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Reseller_Point_of_Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reseller_Sales_Training_Test_Score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Reseller_Sales_Training_Test_Score__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SFDC_Projects__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SFDC_Projects__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SWAG__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SWAG__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("sales_Training_Surveys__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Sales_Training_Surveys__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sales_Training_Test_Score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Sales_Training_Test_Score__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sales__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Sales__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salutation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Salutation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("script_Xchg_Digest_Opt_Out__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Script_Xchg_Digest_Opt_Out__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("script_Xchg_Digest_Subscription_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Script_Xchg_Digest_Subscription_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("send_Email__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Send_Email__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("send_RCA_Credit_Email__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Send_RCA_Credit_Email__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("send_Sales_Cert_Survey__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Send_Sales_Cert_Survey__c"));
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
        elemField.setFieldName("shirt_Size__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Shirt_Size__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status_Meeting_Attendees__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status_Meeting_Attendees__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("support_Distribution_List__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Support_Distribution_List__c"));
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
        elemField.setFieldName("tasks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tickets1__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tickets1__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tickets2__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tickets2__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tickets3__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tickets3__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tickets4__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tickets4__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tickets5__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tickets5__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("time_Zone__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Time_Zone__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("to_Persistant_Contact__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "To_Persistant_Contact__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("training_Attendees__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Attendees__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("training_Questions__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Questions__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trainings1__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Trainings1__r"));
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
        elemField.setFieldName("KCura_News_and_Press__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "blonk_News_and_Press__c"));
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

/**
 * Training_Relativity__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Training_Relativity__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String account__c;

    private com.sforce.soap.enterprise.sobject.Account account__r;

    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private java.lang.Double anonymous_Atttendees__c;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String billable__c;

    private java.lang.String billing_Complete__c;

    private java.lang.String billing_Method__c;

    private java.lang.String billing_Notes__c;

    private java.lang.String call_Info__c;

    private java.lang.String channel_Manager__c;

    private com.sforce.soap.enterprise.sobject.User channel_Manager__r;

    private com.sforce.soap.enterprise.QueryResult checklists__r;

    private java.lang.Double class_Size__c;

    private java.lang.String client_Login_Credentials__c;

    private java.lang.String client_Relativity_URL__c;

    private java.lang.String conference_Room__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String delivery_Method__c;

    private java.lang.String end_Date_Full__c;

    private java.util.Date end_Date_Only__c;

    private java.util.Calendar end_Date__c;

    private java.lang.String environment__c;

    private com.sforce.soap.enterprise.QueryResult events;

    private com.sforce.soap.enterprise.QueryResult feature_Requests__r;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.lang.String goTo_Meeting_Account__c;

    private com.sforce.soap.enterprise.sobject.User goTo_Meeting_Account__r;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.Boolean hosts_Added__c;

    private java.lang.String hotel_Information__c;

    private java.util.Calendar ICal_Day_After_Start__c;

    private java.lang.String includes_Technical_Backend_Training__c;

    private java.lang.String invoice_Created__c;

    private java.lang.Boolean isDeleted;

    private java.lang.String laptop_Information__c;

    private java.lang.Boolean laptops_Provided__c;

    private java.util.Date lastActivityDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String location_City_State__c;

    private java.lang.String location__c;

    private java.lang.String main_Contact__c;

    private com.sforce.soap.enterprise.sobject.Contact main_Contact__r;

    private java.lang.String meeting_URL__c;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private java.lang.String notes__c;

    private java.lang.Double number_of_Unanswered_Questions__c;

    private java.lang.String on_Site_Contact__c;

    private com.sforce.soap.enterprise.sobject.Contact on_Site_Contact__r;

    private java.lang.String onsite_Address__c;

    private java.lang.String onsite_Visit__c;

    private com.sforce.soap.enterprise.sobject.Old_Onsite_Visit__c onsite_Visit__r;

    private com.sforce.soap.enterprise.QueryResult openActivities;

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private java.lang.String partner_Kickoff__c;

    private com.sforce.soap.enterprise.QueryResult partner_Kickoff__r;

    private com.sforce.soap.enterprise.QueryResult partner_Kickoffs__r;

    private java.lang.Double power_of_One__c;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.Double RCE_Credits__c;

    private com.sforce.soap.enterprise.QueryResult RCE_Credits__r;

    private java.lang.Double rate__c;

    private com.sforce.soap.enterprise.QueryResult SWAG__r;

    private java.lang.Boolean sendEmail__c;

    private java.lang.String session_Type__c;

    private com.sforce.soap.enterprise.QueryResult shares;

    private java.lang.String start_Date_Full__c;

    private java.util.Date start_Date_Only__c;

    private java.util.Calendar start_Date__c;

    private java.lang.String status__c;

    private java.lang.String survey_Feedback__c;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    private java.lang.String team_Teaching__c;

    private com.sforce.soap.enterprise.sobject.User team_Teaching__r;

    private java.lang.String test__c;

    private java.lang.Double total_Attendee__c;

    private java.lang.Double total_Attendees__c;

    private java.lang.Double total_Attendees_with_Anonymous_Ones__c;

    private java.lang.Double total_on_Waitlist__c;

    private java.lang.String trainer_Role__c;

    private java.lang.String trainer__c;

    private com.sforce.soap.enterprise.sobject.User trainer__r;

    private com.sforce.soap.enterprise.QueryResult training_Attendees__r;

    private java.lang.String training_Bill__c;

    private java.lang.String training_Expenses__c;

    private java.lang.Double training_Hours__c;

    private java.lang.String training_QC_Comments__c;

    private java.lang.String training_QC_Status__c;

    private com.sforce.soap.enterprise.QueryResult training_Questions__r;

    private java.lang.Double training_Random_Sample__c;

    private com.sforce.soap.enterprise.QueryResult training_Survey_Results1__r;

    private java.lang.String training_Type_Full_Name__c;

    private java.lang.String travel_Billable__c;

    private java.lang.String travel_Information__c;

    private java.lang.String type_Sub__c;

    private java.lang.String type__c;

    public Training_Relativity__c() {
    }

    public Training_Relativity__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String account__c,
           com.sforce.soap.enterprise.sobject.Account account__r,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           java.lang.Double anonymous_Atttendees__c,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String billable__c,
           java.lang.String billing_Complete__c,
           java.lang.String billing_Method__c,
           java.lang.String billing_Notes__c,
           java.lang.String call_Info__c,
           java.lang.String channel_Manager__c,
           com.sforce.soap.enterprise.sobject.User channel_Manager__r,
           com.sforce.soap.enterprise.QueryResult checklists__r,
           java.lang.Double class_Size__c,
           java.lang.String client_Login_Credentials__c,
           java.lang.String client_Relativity_URL__c,
           java.lang.String conference_Room__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String delivery_Method__c,
           java.lang.String end_Date_Full__c,
           java.util.Date end_Date_Only__c,
           java.util.Calendar end_Date__c,
           java.lang.String environment__c,
           com.sforce.soap.enterprise.QueryResult events,
           com.sforce.soap.enterprise.QueryResult feature_Requests__r,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.lang.String goTo_Meeting_Account__c,
           com.sforce.soap.enterprise.sobject.User goTo_Meeting_Account__r,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.Boolean hosts_Added__c,
           java.lang.String hotel_Information__c,
           java.util.Calendar ICal_Day_After_Start__c,
           java.lang.String includes_Technical_Backend_Training__c,
           java.lang.String invoice_Created__c,
           java.lang.Boolean isDeleted,
           java.lang.String laptop_Information__c,
           java.lang.Boolean laptops_Provided__c,
           java.util.Date lastActivityDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String location_City_State__c,
           java.lang.String location__c,
           java.lang.String main_Contact__c,
           com.sforce.soap.enterprise.sobject.Contact main_Contact__r,
           java.lang.String meeting_URL__c,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           java.lang.String notes__c,
           java.lang.Double number_of_Unanswered_Questions__c,
           java.lang.String on_Site_Contact__c,
           com.sforce.soap.enterprise.sobject.Contact on_Site_Contact__r,
           java.lang.String onsite_Address__c,
           java.lang.String onsite_Visit__c,
           com.sforce.soap.enterprise.sobject.Old_Onsite_Visit__c onsite_Visit__r,
           com.sforce.soap.enterprise.QueryResult openActivities,
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           java.lang.String partner_Kickoff__c,
           com.sforce.soap.enterprise.QueryResult partner_Kickoff__r,
           com.sforce.soap.enterprise.QueryResult partner_Kickoffs__r,
           java.lang.Double power_of_One__c,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.Double RCE_Credits__c,
           com.sforce.soap.enterprise.QueryResult RCE_Credits__r,
           java.lang.Double rate__c,
           com.sforce.soap.enterprise.QueryResult SWAG__r,
           java.lang.Boolean sendEmail__c,
           java.lang.String session_Type__c,
           com.sforce.soap.enterprise.QueryResult shares,
           java.lang.String start_Date_Full__c,
           java.util.Date start_Date_Only__c,
           java.util.Calendar start_Date__c,
           java.lang.String status__c,
           java.lang.String survey_Feedback__c,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks,
           java.lang.String team_Teaching__c,
           com.sforce.soap.enterprise.sobject.User team_Teaching__r,
           java.lang.String test__c,
           java.lang.Double total_Attendee__c,
           java.lang.Double total_Attendees__c,
           java.lang.Double total_Attendees_with_Anonymous_Ones__c,
           java.lang.Double total_on_Waitlist__c,
           java.lang.String trainer_Role__c,
           java.lang.String trainer__c,
           com.sforce.soap.enterprise.sobject.User trainer__r,
           com.sforce.soap.enterprise.QueryResult training_Attendees__r,
           java.lang.String training_Bill__c,
           java.lang.String training_Expenses__c,
           java.lang.Double training_Hours__c,
           java.lang.String training_QC_Comments__c,
           java.lang.String training_QC_Status__c,
           com.sforce.soap.enterprise.QueryResult training_Questions__r,
           java.lang.Double training_Random_Sample__c,
           com.sforce.soap.enterprise.QueryResult training_Survey_Results1__r,
           java.lang.String training_Type_Full_Name__c,
           java.lang.String travel_Billable__c,
           java.lang.String travel_Information__c,
           java.lang.String type_Sub__c,
           java.lang.String type__c) {
        super(
            fieldsToNull,
            id);
        this.account__c = account__c;
        this.account__r = account__r;
        this.activityHistories = activityHistories;
        this.anonymous_Atttendees__c = anonymous_Atttendees__c;
        this.attachments = attachments;
        this.billable__c = billable__c;
        this.billing_Complete__c = billing_Complete__c;
        this.billing_Method__c = billing_Method__c;
        this.billing_Notes__c = billing_Notes__c;
        this.call_Info__c = call_Info__c;
        this.channel_Manager__c = channel_Manager__c;
        this.channel_Manager__r = channel_Manager__r;
        this.checklists__r = checklists__r;
        this.class_Size__c = class_Size__c;
        this.client_Login_Credentials__c = client_Login_Credentials__c;
        this.client_Relativity_URL__c = client_Relativity_URL__c;
        this.conference_Room__c = conference_Room__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.delivery_Method__c = delivery_Method__c;
        this.end_Date_Full__c = end_Date_Full__c;
        this.end_Date_Only__c = end_Date_Only__c;
        this.end_Date__c = end_Date__c;
        this.environment__c = environment__c;
        this.events = events;
        this.feature_Requests__r = feature_Requests__r;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.goTo_Meeting_Account__c = goTo_Meeting_Account__c;
        this.goTo_Meeting_Account__r = goTo_Meeting_Account__r;
        this.histories = histories;
        this.hosts_Added__c = hosts_Added__c;
        this.hotel_Information__c = hotel_Information__c;
        this.ICal_Day_After_Start__c = ICal_Day_After_Start__c;
        this.includes_Technical_Backend_Training__c = includes_Technical_Backend_Training__c;
        this.invoice_Created__c = invoice_Created__c;
        this.isDeleted = isDeleted;
        this.laptop_Information__c = laptop_Information__c;
        this.laptops_Provided__c = laptops_Provided__c;
        this.lastActivityDate = lastActivityDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.location_City_State__c = location_City_State__c;
        this.location__c = location__c;
        this.main_Contact__c = main_Contact__c;
        this.main_Contact__r = main_Contact__r;
        this.meeting_URL__c = meeting_URL__c;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.notes__c = notes__c;
        this.number_of_Unanswered_Questions__c = number_of_Unanswered_Questions__c;
        this.on_Site_Contact__c = on_Site_Contact__c;
        this.on_Site_Contact__r = on_Site_Contact__r;
        this.onsite_Address__c = onsite_Address__c;
        this.onsite_Visit__c = onsite_Visit__c;
        this.onsite_Visit__r = onsite_Visit__r;
        this.openActivities = openActivities;
        this.owner = owner;
        this.ownerId = ownerId;
        this.partner_Kickoff__c = partner_Kickoff__c;
        this.partner_Kickoff__r = partner_Kickoff__r;
        this.partner_Kickoffs__r = partner_Kickoffs__r;
        this.power_of_One__c = power_of_One__c;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.RCE_Credits__c = RCE_Credits__c;
        this.RCE_Credits__r = RCE_Credits__r;
        this.rate__c = rate__c;
        this.SWAG__r = SWAG__r;
        this.sendEmail__c = sendEmail__c;
        this.session_Type__c = session_Type__c;
        this.shares = shares;
        this.start_Date_Full__c = start_Date_Full__c;
        this.start_Date_Only__c = start_Date_Only__c;
        this.start_Date__c = start_Date__c;
        this.status__c = status__c;
        this.survey_Feedback__c = survey_Feedback__c;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
        this.team_Teaching__c = team_Teaching__c;
        this.team_Teaching__r = team_Teaching__r;
        this.test__c = test__c;
        this.total_Attendee__c = total_Attendee__c;
        this.total_Attendees__c = total_Attendees__c;
        this.total_Attendees_with_Anonymous_Ones__c = total_Attendees_with_Anonymous_Ones__c;
        this.total_on_Waitlist__c = total_on_Waitlist__c;
        this.trainer_Role__c = trainer_Role__c;
        this.trainer__c = trainer__c;
        this.trainer__r = trainer__r;
        this.training_Attendees__r = training_Attendees__r;
        this.training_Bill__c = training_Bill__c;
        this.training_Expenses__c = training_Expenses__c;
        this.training_Hours__c = training_Hours__c;
        this.training_QC_Comments__c = training_QC_Comments__c;
        this.training_QC_Status__c = training_QC_Status__c;
        this.training_Questions__r = training_Questions__r;
        this.training_Random_Sample__c = training_Random_Sample__c;
        this.training_Survey_Results1__r = training_Survey_Results1__r;
        this.training_Type_Full_Name__c = training_Type_Full_Name__c;
        this.travel_Billable__c = travel_Billable__c;
        this.travel_Information__c = travel_Information__c;
        this.type_Sub__c = type_Sub__c;
        this.type__c = type__c;
    }


    /**
     * Gets the account__c value for this Training_Relativity__c.
     * 
     * @return account__c
     */
    public java.lang.String getAccount__c() {
        return account__c;
    }


    /**
     * Sets the account__c value for this Training_Relativity__c.
     * 
     * @param account__c
     */
    public void setAccount__c(java.lang.String account__c) {
        this.account__c = account__c;
    }


    /**
     * Gets the account__r value for this Training_Relativity__c.
     * 
     * @return account__r
     */
    public com.sforce.soap.enterprise.sobject.Account getAccount__r() {
        return account__r;
    }


    /**
     * Sets the account__r value for this Training_Relativity__c.
     * 
     * @param account__r
     */
    public void setAccount__r(com.sforce.soap.enterprise.sobject.Account account__r) {
        this.account__r = account__r;
    }


    /**
     * Gets the activityHistories value for this Training_Relativity__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this Training_Relativity__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the anonymous_Atttendees__c value for this Training_Relativity__c.
     * 
     * @return anonymous_Atttendees__c
     */
    public java.lang.Double getAnonymous_Atttendees__c() {
        return anonymous_Atttendees__c;
    }


    /**
     * Sets the anonymous_Atttendees__c value for this Training_Relativity__c.
     * 
     * @param anonymous_Atttendees__c
     */
    public void setAnonymous_Atttendees__c(java.lang.Double anonymous_Atttendees__c) {
        this.anonymous_Atttendees__c = anonymous_Atttendees__c;
    }


    /**
     * Gets the attachments value for this Training_Relativity__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Training_Relativity__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the billable__c value for this Training_Relativity__c.
     * 
     * @return billable__c
     */
    public java.lang.String getBillable__c() {
        return billable__c;
    }


    /**
     * Sets the billable__c value for this Training_Relativity__c.
     * 
     * @param billable__c
     */
    public void setBillable__c(java.lang.String billable__c) {
        this.billable__c = billable__c;
    }


    /**
     * Gets the billing_Complete__c value for this Training_Relativity__c.
     * 
     * @return billing_Complete__c
     */
    public java.lang.String getBilling_Complete__c() {
        return billing_Complete__c;
    }


    /**
     * Sets the billing_Complete__c value for this Training_Relativity__c.
     * 
     * @param billing_Complete__c
     */
    public void setBilling_Complete__c(java.lang.String billing_Complete__c) {
        this.billing_Complete__c = billing_Complete__c;
    }


    /**
     * Gets the billing_Method__c value for this Training_Relativity__c.
     * 
     * @return billing_Method__c
     */
    public java.lang.String getBilling_Method__c() {
        return billing_Method__c;
    }


    /**
     * Sets the billing_Method__c value for this Training_Relativity__c.
     * 
     * @param billing_Method__c
     */
    public void setBilling_Method__c(java.lang.String billing_Method__c) {
        this.billing_Method__c = billing_Method__c;
    }


    /**
     * Gets the billing_Notes__c value for this Training_Relativity__c.
     * 
     * @return billing_Notes__c
     */
    public java.lang.String getBilling_Notes__c() {
        return billing_Notes__c;
    }


    /**
     * Sets the billing_Notes__c value for this Training_Relativity__c.
     * 
     * @param billing_Notes__c
     */
    public void setBilling_Notes__c(java.lang.String billing_Notes__c) {
        this.billing_Notes__c = billing_Notes__c;
    }


    /**
     * Gets the call_Info__c value for this Training_Relativity__c.
     * 
     * @return call_Info__c
     */
    public java.lang.String getCall_Info__c() {
        return call_Info__c;
    }


    /**
     * Sets the call_Info__c value for this Training_Relativity__c.
     * 
     * @param call_Info__c
     */
    public void setCall_Info__c(java.lang.String call_Info__c) {
        this.call_Info__c = call_Info__c;
    }


    /**
     * Gets the channel_Manager__c value for this Training_Relativity__c.
     * 
     * @return channel_Manager__c
     */
    public java.lang.String getChannel_Manager__c() {
        return channel_Manager__c;
    }


    /**
     * Sets the channel_Manager__c value for this Training_Relativity__c.
     * 
     * @param channel_Manager__c
     */
    public void setChannel_Manager__c(java.lang.String channel_Manager__c) {
        this.channel_Manager__c = channel_Manager__c;
    }


    /**
     * Gets the channel_Manager__r value for this Training_Relativity__c.
     * 
     * @return channel_Manager__r
     */
    public com.sforce.soap.enterprise.sobject.User getChannel_Manager__r() {
        return channel_Manager__r;
    }


    /**
     * Sets the channel_Manager__r value for this Training_Relativity__c.
     * 
     * @param channel_Manager__r
     */
    public void setChannel_Manager__r(com.sforce.soap.enterprise.sobject.User channel_Manager__r) {
        this.channel_Manager__r = channel_Manager__r;
    }


    /**
     * Gets the checklists__r value for this Training_Relativity__c.
     * 
     * @return checklists__r
     */
    public com.sforce.soap.enterprise.QueryResult getChecklists__r() {
        return checklists__r;
    }


    /**
     * Sets the checklists__r value for this Training_Relativity__c.
     * 
     * @param checklists__r
     */
    public void setChecklists__r(com.sforce.soap.enterprise.QueryResult checklists__r) {
        this.checklists__r = checklists__r;
    }


    /**
     * Gets the class_Size__c value for this Training_Relativity__c.
     * 
     * @return class_Size__c
     */
    public java.lang.Double getClass_Size__c() {
        return class_Size__c;
    }


    /**
     * Sets the class_Size__c value for this Training_Relativity__c.
     * 
     * @param class_Size__c
     */
    public void setClass_Size__c(java.lang.Double class_Size__c) {
        this.class_Size__c = class_Size__c;
    }


    /**
     * Gets the client_Login_Credentials__c value for this Training_Relativity__c.
     * 
     * @return client_Login_Credentials__c
     */
    public java.lang.String getClient_Login_Credentials__c() {
        return client_Login_Credentials__c;
    }


    /**
     * Sets the client_Login_Credentials__c value for this Training_Relativity__c.
     * 
     * @param client_Login_Credentials__c
     */
    public void setClient_Login_Credentials__c(java.lang.String client_Login_Credentials__c) {
        this.client_Login_Credentials__c = client_Login_Credentials__c;
    }


    /**
     * Gets the client_Relativity_URL__c value for this Training_Relativity__c.
     * 
     * @return client_Relativity_URL__c
     */
    public java.lang.String getClient_Relativity_URL__c() {
        return client_Relativity_URL__c;
    }


    /**
     * Sets the client_Relativity_URL__c value for this Training_Relativity__c.
     * 
     * @param client_Relativity_URL__c
     */
    public void setClient_Relativity_URL__c(java.lang.String client_Relativity_URL__c) {
        this.client_Relativity_URL__c = client_Relativity_URL__c;
    }


    /**
     * Gets the conference_Room__c value for this Training_Relativity__c.
     * 
     * @return conference_Room__c
     */
    public java.lang.String getConference_Room__c() {
        return conference_Room__c;
    }


    /**
     * Sets the conference_Room__c value for this Training_Relativity__c.
     * 
     * @param conference_Room__c
     */
    public void setConference_Room__c(java.lang.String conference_Room__c) {
        this.conference_Room__c = conference_Room__c;
    }


    /**
     * Gets the createdBy value for this Training_Relativity__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Training_Relativity__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Training_Relativity__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Training_Relativity__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Training_Relativity__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Training_Relativity__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the delivery_Method__c value for this Training_Relativity__c.
     * 
     * @return delivery_Method__c
     */
    public java.lang.String getDelivery_Method__c() {
        return delivery_Method__c;
    }


    /**
     * Sets the delivery_Method__c value for this Training_Relativity__c.
     * 
     * @param delivery_Method__c
     */
    public void setDelivery_Method__c(java.lang.String delivery_Method__c) {
        this.delivery_Method__c = delivery_Method__c;
    }


    /**
     * Gets the end_Date_Full__c value for this Training_Relativity__c.
     * 
     * @return end_Date_Full__c
     */
    public java.lang.String getEnd_Date_Full__c() {
        return end_Date_Full__c;
    }


    /**
     * Sets the end_Date_Full__c value for this Training_Relativity__c.
     * 
     * @param end_Date_Full__c
     */
    public void setEnd_Date_Full__c(java.lang.String end_Date_Full__c) {
        this.end_Date_Full__c = end_Date_Full__c;
    }


    /**
     * Gets the end_Date_Only__c value for this Training_Relativity__c.
     * 
     * @return end_Date_Only__c
     */
    public java.util.Date getEnd_Date_Only__c() {
        return end_Date_Only__c;
    }


    /**
     * Sets the end_Date_Only__c value for this Training_Relativity__c.
     * 
     * @param end_Date_Only__c
     */
    public void setEnd_Date_Only__c(java.util.Date end_Date_Only__c) {
        this.end_Date_Only__c = end_Date_Only__c;
    }


    /**
     * Gets the end_Date__c value for this Training_Relativity__c.
     * 
     * @return end_Date__c
     */
    public java.util.Calendar getEnd_Date__c() {
        return end_Date__c;
    }


    /**
     * Sets the end_Date__c value for this Training_Relativity__c.
     * 
     * @param end_Date__c
     */
    public void setEnd_Date__c(java.util.Calendar end_Date__c) {
        this.end_Date__c = end_Date__c;
    }


    /**
     * Gets the environment__c value for this Training_Relativity__c.
     * 
     * @return environment__c
     */
    public java.lang.String getEnvironment__c() {
        return environment__c;
    }


    /**
     * Sets the environment__c value for this Training_Relativity__c.
     * 
     * @param environment__c
     */
    public void setEnvironment__c(java.lang.String environment__c) {
        this.environment__c = environment__c;
    }


    /**
     * Gets the events value for this Training_Relativity__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Training_Relativity__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the feature_Requests__r value for this Training_Relativity__c.
     * 
     * @return feature_Requests__r
     */
    public com.sforce.soap.enterprise.QueryResult getFeature_Requests__r() {
        return feature_Requests__r;
    }


    /**
     * Sets the feature_Requests__r value for this Training_Relativity__c.
     * 
     * @param feature_Requests__r
     */
    public void setFeature_Requests__r(com.sforce.soap.enterprise.QueryResult feature_Requests__r) {
        this.feature_Requests__r = feature_Requests__r;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Training_Relativity__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Training_Relativity__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the goTo_Meeting_Account__c value for this Training_Relativity__c.
     * 
     * @return goTo_Meeting_Account__c
     */
    public java.lang.String getGoTo_Meeting_Account__c() {
        return goTo_Meeting_Account__c;
    }


    /**
     * Sets the goTo_Meeting_Account__c value for this Training_Relativity__c.
     * 
     * @param goTo_Meeting_Account__c
     */
    public void setGoTo_Meeting_Account__c(java.lang.String goTo_Meeting_Account__c) {
        this.goTo_Meeting_Account__c = goTo_Meeting_Account__c;
    }


    /**
     * Gets the goTo_Meeting_Account__r value for this Training_Relativity__c.
     * 
     * @return goTo_Meeting_Account__r
     */
    public com.sforce.soap.enterprise.sobject.User getGoTo_Meeting_Account__r() {
        return goTo_Meeting_Account__r;
    }


    /**
     * Sets the goTo_Meeting_Account__r value for this Training_Relativity__c.
     * 
     * @param goTo_Meeting_Account__r
     */
    public void setGoTo_Meeting_Account__r(com.sforce.soap.enterprise.sobject.User goTo_Meeting_Account__r) {
        this.goTo_Meeting_Account__r = goTo_Meeting_Account__r;
    }


    /**
     * Gets the histories value for this Training_Relativity__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Training_Relativity__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the hosts_Added__c value for this Training_Relativity__c.
     * 
     * @return hosts_Added__c
     */
    public java.lang.Boolean getHosts_Added__c() {
        return hosts_Added__c;
    }


    /**
     * Sets the hosts_Added__c value for this Training_Relativity__c.
     * 
     * @param hosts_Added__c
     */
    public void setHosts_Added__c(java.lang.Boolean hosts_Added__c) {
        this.hosts_Added__c = hosts_Added__c;
    }


    /**
     * Gets the hotel_Information__c value for this Training_Relativity__c.
     * 
     * @return hotel_Information__c
     */
    public java.lang.String getHotel_Information__c() {
        return hotel_Information__c;
    }


    /**
     * Sets the hotel_Information__c value for this Training_Relativity__c.
     * 
     * @param hotel_Information__c
     */
    public void setHotel_Information__c(java.lang.String hotel_Information__c) {
        this.hotel_Information__c = hotel_Information__c;
    }


    /**
     * Gets the ICal_Day_After_Start__c value for this Training_Relativity__c.
     * 
     * @return ICal_Day_After_Start__c
     */
    public java.util.Calendar getICal_Day_After_Start__c() {
        return ICal_Day_After_Start__c;
    }


    /**
     * Sets the ICal_Day_After_Start__c value for this Training_Relativity__c.
     * 
     * @param ICal_Day_After_Start__c
     */
    public void setICal_Day_After_Start__c(java.util.Calendar ICal_Day_After_Start__c) {
        this.ICal_Day_After_Start__c = ICal_Day_After_Start__c;
    }


    /**
     * Gets the includes_Technical_Backend_Training__c value for this Training_Relativity__c.
     * 
     * @return includes_Technical_Backend_Training__c
     */
    public java.lang.String getIncludes_Technical_Backend_Training__c() {
        return includes_Technical_Backend_Training__c;
    }


    /**
     * Sets the includes_Technical_Backend_Training__c value for this Training_Relativity__c.
     * 
     * @param includes_Technical_Backend_Training__c
     */
    public void setIncludes_Technical_Backend_Training__c(java.lang.String includes_Technical_Backend_Training__c) {
        this.includes_Technical_Backend_Training__c = includes_Technical_Backend_Training__c;
    }


    /**
     * Gets the invoice_Created__c value for this Training_Relativity__c.
     * 
     * @return invoice_Created__c
     */
    public java.lang.String getInvoice_Created__c() {
        return invoice_Created__c;
    }


    /**
     * Sets the invoice_Created__c value for this Training_Relativity__c.
     * 
     * @param invoice_Created__c
     */
    public void setInvoice_Created__c(java.lang.String invoice_Created__c) {
        this.invoice_Created__c = invoice_Created__c;
    }


    /**
     * Gets the isDeleted value for this Training_Relativity__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Training_Relativity__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the laptop_Information__c value for this Training_Relativity__c.
     * 
     * @return laptop_Information__c
     */
    public java.lang.String getLaptop_Information__c() {
        return laptop_Information__c;
    }


    /**
     * Sets the laptop_Information__c value for this Training_Relativity__c.
     * 
     * @param laptop_Information__c
     */
    public void setLaptop_Information__c(java.lang.String laptop_Information__c) {
        this.laptop_Information__c = laptop_Information__c;
    }


    /**
     * Gets the laptops_Provided__c value for this Training_Relativity__c.
     * 
     * @return laptops_Provided__c
     */
    public java.lang.Boolean getLaptops_Provided__c() {
        return laptops_Provided__c;
    }


    /**
     * Sets the laptops_Provided__c value for this Training_Relativity__c.
     * 
     * @param laptops_Provided__c
     */
    public void setLaptops_Provided__c(java.lang.Boolean laptops_Provided__c) {
        this.laptops_Provided__c = laptops_Provided__c;
    }


    /**
     * Gets the lastActivityDate value for this Training_Relativity__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Training_Relativity__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this Training_Relativity__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Training_Relativity__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Training_Relativity__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Training_Relativity__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Training_Relativity__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Training_Relativity__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the location_City_State__c value for this Training_Relativity__c.
     * 
     * @return location_City_State__c
     */
    public java.lang.String getLocation_City_State__c() {
        return location_City_State__c;
    }


    /**
     * Sets the location_City_State__c value for this Training_Relativity__c.
     * 
     * @param location_City_State__c
     */
    public void setLocation_City_State__c(java.lang.String location_City_State__c) {
        this.location_City_State__c = location_City_State__c;
    }


    /**
     * Gets the location__c value for this Training_Relativity__c.
     * 
     * @return location__c
     */
    public java.lang.String getLocation__c() {
        return location__c;
    }


    /**
     * Sets the location__c value for this Training_Relativity__c.
     * 
     * @param location__c
     */
    public void setLocation__c(java.lang.String location__c) {
        this.location__c = location__c;
    }


    /**
     * Gets the main_Contact__c value for this Training_Relativity__c.
     * 
     * @return main_Contact__c
     */
    public java.lang.String getMain_Contact__c() {
        return main_Contact__c;
    }


    /**
     * Sets the main_Contact__c value for this Training_Relativity__c.
     * 
     * @param main_Contact__c
     */
    public void setMain_Contact__c(java.lang.String main_Contact__c) {
        this.main_Contact__c = main_Contact__c;
    }


    /**
     * Gets the main_Contact__r value for this Training_Relativity__c.
     * 
     * @return main_Contact__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getMain_Contact__r() {
        return main_Contact__r;
    }


    /**
     * Sets the main_Contact__r value for this Training_Relativity__c.
     * 
     * @param main_Contact__r
     */
    public void setMain_Contact__r(com.sforce.soap.enterprise.sobject.Contact main_Contact__r) {
        this.main_Contact__r = main_Contact__r;
    }


    /**
     * Gets the meeting_URL__c value for this Training_Relativity__c.
     * 
     * @return meeting_URL__c
     */
    public java.lang.String getMeeting_URL__c() {
        return meeting_URL__c;
    }


    /**
     * Sets the meeting_URL__c value for this Training_Relativity__c.
     * 
     * @param meeting_URL__c
     */
    public void setMeeting_URL__c(java.lang.String meeting_URL__c) {
        this.meeting_URL__c = meeting_URL__c;
    }


    /**
     * Gets the name value for this Training_Relativity__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Training_Relativity__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Training_Relativity__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Training_Relativity__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Training_Relativity__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Training_Relativity__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the notes__c value for this Training_Relativity__c.
     * 
     * @return notes__c
     */
    public java.lang.String getNotes__c() {
        return notes__c;
    }


    /**
     * Sets the notes__c value for this Training_Relativity__c.
     * 
     * @param notes__c
     */
    public void setNotes__c(java.lang.String notes__c) {
        this.notes__c = notes__c;
    }


    /**
     * Gets the number_of_Unanswered_Questions__c value for this Training_Relativity__c.
     * 
     * @return number_of_Unanswered_Questions__c
     */
    public java.lang.Double getNumber_of_Unanswered_Questions__c() {
        return number_of_Unanswered_Questions__c;
    }


    /**
     * Sets the number_of_Unanswered_Questions__c value for this Training_Relativity__c.
     * 
     * @param number_of_Unanswered_Questions__c
     */
    public void setNumber_of_Unanswered_Questions__c(java.lang.Double number_of_Unanswered_Questions__c) {
        this.number_of_Unanswered_Questions__c = number_of_Unanswered_Questions__c;
    }


    /**
     * Gets the on_Site_Contact__c value for this Training_Relativity__c.
     * 
     * @return on_Site_Contact__c
     */
    public java.lang.String getOn_Site_Contact__c() {
        return on_Site_Contact__c;
    }


    /**
     * Sets the on_Site_Contact__c value for this Training_Relativity__c.
     * 
     * @param on_Site_Contact__c
     */
    public void setOn_Site_Contact__c(java.lang.String on_Site_Contact__c) {
        this.on_Site_Contact__c = on_Site_Contact__c;
    }


    /**
     * Gets the on_Site_Contact__r value for this Training_Relativity__c.
     * 
     * @return on_Site_Contact__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getOn_Site_Contact__r() {
        return on_Site_Contact__r;
    }


    /**
     * Sets the on_Site_Contact__r value for this Training_Relativity__c.
     * 
     * @param on_Site_Contact__r
     */
    public void setOn_Site_Contact__r(com.sforce.soap.enterprise.sobject.Contact on_Site_Contact__r) {
        this.on_Site_Contact__r = on_Site_Contact__r;
    }


    /**
     * Gets the onsite_Address__c value for this Training_Relativity__c.
     * 
     * @return onsite_Address__c
     */
    public java.lang.String getOnsite_Address__c() {
        return onsite_Address__c;
    }


    /**
     * Sets the onsite_Address__c value for this Training_Relativity__c.
     * 
     * @param onsite_Address__c
     */
    public void setOnsite_Address__c(java.lang.String onsite_Address__c) {
        this.onsite_Address__c = onsite_Address__c;
    }


    /**
     * Gets the onsite_Visit__c value for this Training_Relativity__c.
     * 
     * @return onsite_Visit__c
     */
    public java.lang.String getOnsite_Visit__c() {
        return onsite_Visit__c;
    }


    /**
     * Sets the onsite_Visit__c value for this Training_Relativity__c.
     * 
     * @param onsite_Visit__c
     */
    public void setOnsite_Visit__c(java.lang.String onsite_Visit__c) {
        this.onsite_Visit__c = onsite_Visit__c;
    }


    /**
     * Gets the onsite_Visit__r value for this Training_Relativity__c.
     * 
     * @return onsite_Visit__r
     */
    public com.sforce.soap.enterprise.sobject.Old_Onsite_Visit__c getOnsite_Visit__r() {
        return onsite_Visit__r;
    }


    /**
     * Sets the onsite_Visit__r value for this Training_Relativity__c.
     * 
     * @param onsite_Visit__r
     */
    public void setOnsite_Visit__r(com.sforce.soap.enterprise.sobject.Old_Onsite_Visit__c onsite_Visit__r) {
        this.onsite_Visit__r = onsite_Visit__r;
    }


    /**
     * Gets the openActivities value for this Training_Relativity__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this Training_Relativity__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the owner value for this Training_Relativity__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Training_Relativity__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Training_Relativity__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Training_Relativity__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the partner_Kickoff__c value for this Training_Relativity__c.
     * 
     * @return partner_Kickoff__c
     */
    public java.lang.String getPartner_Kickoff__c() {
        return partner_Kickoff__c;
    }


    /**
     * Sets the partner_Kickoff__c value for this Training_Relativity__c.
     * 
     * @param partner_Kickoff__c
     */
    public void setPartner_Kickoff__c(java.lang.String partner_Kickoff__c) {
        this.partner_Kickoff__c = partner_Kickoff__c;
    }


    /**
     * Gets the partner_Kickoff__r value for this Training_Relativity__c.
     * 
     * @return partner_Kickoff__r
     */
    public com.sforce.soap.enterprise.QueryResult getPartner_Kickoff__r() {
        return partner_Kickoff__r;
    }


    /**
     * Sets the partner_Kickoff__r value for this Training_Relativity__c.
     * 
     * @param partner_Kickoff__r
     */
    public void setPartner_Kickoff__r(com.sforce.soap.enterprise.QueryResult partner_Kickoff__r) {
        this.partner_Kickoff__r = partner_Kickoff__r;
    }


    /**
     * Gets the partner_Kickoffs__r value for this Training_Relativity__c.
     * 
     * @return partner_Kickoffs__r
     */
    public com.sforce.soap.enterprise.QueryResult getPartner_Kickoffs__r() {
        return partner_Kickoffs__r;
    }


    /**
     * Sets the partner_Kickoffs__r value for this Training_Relativity__c.
     * 
     * @param partner_Kickoffs__r
     */
    public void setPartner_Kickoffs__r(com.sforce.soap.enterprise.QueryResult partner_Kickoffs__r) {
        this.partner_Kickoffs__r = partner_Kickoffs__r;
    }


    /**
     * Gets the power_of_One__c value for this Training_Relativity__c.
     * 
     * @return power_of_One__c
     */
    public java.lang.Double getPower_of_One__c() {
        return power_of_One__c;
    }


    /**
     * Sets the power_of_One__c value for this Training_Relativity__c.
     * 
     * @param power_of_One__c
     */
    public void setPower_of_One__c(java.lang.Double power_of_One__c) {
        this.power_of_One__c = power_of_One__c;
    }


    /**
     * Gets the processInstances value for this Training_Relativity__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Training_Relativity__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Training_Relativity__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Training_Relativity__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the RCE_Credits__c value for this Training_Relativity__c.
     * 
     * @return RCE_Credits__c
     */
    public java.lang.Double getRCE_Credits__c() {
        return RCE_Credits__c;
    }


    /**
     * Sets the RCE_Credits__c value for this Training_Relativity__c.
     * 
     * @param RCE_Credits__c
     */
    public void setRCE_Credits__c(java.lang.Double RCE_Credits__c) {
        this.RCE_Credits__c = RCE_Credits__c;
    }


    /**
     * Gets the RCE_Credits__r value for this Training_Relativity__c.
     * 
     * @return RCE_Credits__r
     */
    public com.sforce.soap.enterprise.QueryResult getRCE_Credits__r() {
        return RCE_Credits__r;
    }


    /**
     * Sets the RCE_Credits__r value for this Training_Relativity__c.
     * 
     * @param RCE_Credits__r
     */
    public void setRCE_Credits__r(com.sforce.soap.enterprise.QueryResult RCE_Credits__r) {
        this.RCE_Credits__r = RCE_Credits__r;
    }


    /**
     * Gets the rate__c value for this Training_Relativity__c.
     * 
     * @return rate__c
     */
    public java.lang.Double getRate__c() {
        return rate__c;
    }


    /**
     * Sets the rate__c value for this Training_Relativity__c.
     * 
     * @param rate__c
     */
    public void setRate__c(java.lang.Double rate__c) {
        this.rate__c = rate__c;
    }


    /**
     * Gets the SWAG__r value for this Training_Relativity__c.
     * 
     * @return SWAG__r
     */
    public com.sforce.soap.enterprise.QueryResult getSWAG__r() {
        return SWAG__r;
    }


    /**
     * Sets the SWAG__r value for this Training_Relativity__c.
     * 
     * @param SWAG__r
     */
    public void setSWAG__r(com.sforce.soap.enterprise.QueryResult SWAG__r) {
        this.SWAG__r = SWAG__r;
    }


    /**
     * Gets the sendEmail__c value for this Training_Relativity__c.
     * 
     * @return sendEmail__c
     */
    public java.lang.Boolean getSendEmail__c() {
        return sendEmail__c;
    }


    /**
     * Sets the sendEmail__c value for this Training_Relativity__c.
     * 
     * @param sendEmail__c
     */
    public void setSendEmail__c(java.lang.Boolean sendEmail__c) {
        this.sendEmail__c = sendEmail__c;
    }


    /**
     * Gets the session_Type__c value for this Training_Relativity__c.
     * 
     * @return session_Type__c
     */
    public java.lang.String getSession_Type__c() {
        return session_Type__c;
    }


    /**
     * Sets the session_Type__c value for this Training_Relativity__c.
     * 
     * @param session_Type__c
     */
    public void setSession_Type__c(java.lang.String session_Type__c) {
        this.session_Type__c = session_Type__c;
    }


    /**
     * Gets the shares value for this Training_Relativity__c.
     * 
     * @return shares
     */
    public com.sforce.soap.enterprise.QueryResult getShares() {
        return shares;
    }


    /**
     * Sets the shares value for this Training_Relativity__c.
     * 
     * @param shares
     */
    public void setShares(com.sforce.soap.enterprise.QueryResult shares) {
        this.shares = shares;
    }


    /**
     * Gets the start_Date_Full__c value for this Training_Relativity__c.
     * 
     * @return start_Date_Full__c
     */
    public java.lang.String getStart_Date_Full__c() {
        return start_Date_Full__c;
    }


    /**
     * Sets the start_Date_Full__c value for this Training_Relativity__c.
     * 
     * @param start_Date_Full__c
     */
    public void setStart_Date_Full__c(java.lang.String start_Date_Full__c) {
        this.start_Date_Full__c = start_Date_Full__c;
    }


    /**
     * Gets the start_Date_Only__c value for this Training_Relativity__c.
     * 
     * @return start_Date_Only__c
     */
    public java.util.Date getStart_Date_Only__c() {
        return start_Date_Only__c;
    }


    /**
     * Sets the start_Date_Only__c value for this Training_Relativity__c.
     * 
     * @param start_Date_Only__c
     */
    public void setStart_Date_Only__c(java.util.Date start_Date_Only__c) {
        this.start_Date_Only__c = start_Date_Only__c;
    }


    /**
     * Gets the start_Date__c value for this Training_Relativity__c.
     * 
     * @return start_Date__c
     */
    public java.util.Calendar getStart_Date__c() {
        return start_Date__c;
    }


    /**
     * Sets the start_Date__c value for this Training_Relativity__c.
     * 
     * @param start_Date__c
     */
    public void setStart_Date__c(java.util.Calendar start_Date__c) {
        this.start_Date__c = start_Date__c;
    }


    /**
     * Gets the status__c value for this Training_Relativity__c.
     * 
     * @return status__c
     */
    public java.lang.String getStatus__c() {
        return status__c;
    }


    /**
     * Sets the status__c value for this Training_Relativity__c.
     * 
     * @param status__c
     */
    public void setStatus__c(java.lang.String status__c) {
        this.status__c = status__c;
    }


    /**
     * Gets the survey_Feedback__c value for this Training_Relativity__c.
     * 
     * @return survey_Feedback__c
     */
    public java.lang.String getSurvey_Feedback__c() {
        return survey_Feedback__c;
    }


    /**
     * Sets the survey_Feedback__c value for this Training_Relativity__c.
     * 
     * @param survey_Feedback__c
     */
    public void setSurvey_Feedback__c(java.lang.String survey_Feedback__c) {
        this.survey_Feedback__c = survey_Feedback__c;
    }


    /**
     * Gets the systemModstamp value for this Training_Relativity__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Training_Relativity__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this Training_Relativity__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Training_Relativity__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the team_Teaching__c value for this Training_Relativity__c.
     * 
     * @return team_Teaching__c
     */
    public java.lang.String getTeam_Teaching__c() {
        return team_Teaching__c;
    }


    /**
     * Sets the team_Teaching__c value for this Training_Relativity__c.
     * 
     * @param team_Teaching__c
     */
    public void setTeam_Teaching__c(java.lang.String team_Teaching__c) {
        this.team_Teaching__c = team_Teaching__c;
    }


    /**
     * Gets the team_Teaching__r value for this Training_Relativity__c.
     * 
     * @return team_Teaching__r
     */
    public com.sforce.soap.enterprise.sobject.User getTeam_Teaching__r() {
        return team_Teaching__r;
    }


    /**
     * Sets the team_Teaching__r value for this Training_Relativity__c.
     * 
     * @param team_Teaching__r
     */
    public void setTeam_Teaching__r(com.sforce.soap.enterprise.sobject.User team_Teaching__r) {
        this.team_Teaching__r = team_Teaching__r;
    }


    /**
     * Gets the test__c value for this Training_Relativity__c.
     * 
     * @return test__c
     */
    public java.lang.String getTest__c() {
        return test__c;
    }


    /**
     * Sets the test__c value for this Training_Relativity__c.
     * 
     * @param test__c
     */
    public void setTest__c(java.lang.String test__c) {
        this.test__c = test__c;
    }


    /**
     * Gets the total_Attendee__c value for this Training_Relativity__c.
     * 
     * @return total_Attendee__c
     */
    public java.lang.Double getTotal_Attendee__c() {
        return total_Attendee__c;
    }


    /**
     * Sets the total_Attendee__c value for this Training_Relativity__c.
     * 
     * @param total_Attendee__c
     */
    public void setTotal_Attendee__c(java.lang.Double total_Attendee__c) {
        this.total_Attendee__c = total_Attendee__c;
    }


    /**
     * Gets the total_Attendees__c value for this Training_Relativity__c.
     * 
     * @return total_Attendees__c
     */
    public java.lang.Double getTotal_Attendees__c() {
        return total_Attendees__c;
    }


    /**
     * Sets the total_Attendees__c value for this Training_Relativity__c.
     * 
     * @param total_Attendees__c
     */
    public void setTotal_Attendees__c(java.lang.Double total_Attendees__c) {
        this.total_Attendees__c = total_Attendees__c;
    }


    /**
     * Gets the total_Attendees_with_Anonymous_Ones__c value for this Training_Relativity__c.
     * 
     * @return total_Attendees_with_Anonymous_Ones__c
     */
    public java.lang.Double getTotal_Attendees_with_Anonymous_Ones__c() {
        return total_Attendees_with_Anonymous_Ones__c;
    }


    /**
     * Sets the total_Attendees_with_Anonymous_Ones__c value for this Training_Relativity__c.
     * 
     * @param total_Attendees_with_Anonymous_Ones__c
     */
    public void setTotal_Attendees_with_Anonymous_Ones__c(java.lang.Double total_Attendees_with_Anonymous_Ones__c) {
        this.total_Attendees_with_Anonymous_Ones__c = total_Attendees_with_Anonymous_Ones__c;
    }


    /**
     * Gets the total_on_Waitlist__c value for this Training_Relativity__c.
     * 
     * @return total_on_Waitlist__c
     */
    public java.lang.Double getTotal_on_Waitlist__c() {
        return total_on_Waitlist__c;
    }


    /**
     * Sets the total_on_Waitlist__c value for this Training_Relativity__c.
     * 
     * @param total_on_Waitlist__c
     */
    public void setTotal_on_Waitlist__c(java.lang.Double total_on_Waitlist__c) {
        this.total_on_Waitlist__c = total_on_Waitlist__c;
    }


    /**
     * Gets the trainer_Role__c value for this Training_Relativity__c.
     * 
     * @return trainer_Role__c
     */
    public java.lang.String getTrainer_Role__c() {
        return trainer_Role__c;
    }


    /**
     * Sets the trainer_Role__c value for this Training_Relativity__c.
     * 
     * @param trainer_Role__c
     */
    public void setTrainer_Role__c(java.lang.String trainer_Role__c) {
        this.trainer_Role__c = trainer_Role__c;
    }


    /**
     * Gets the trainer__c value for this Training_Relativity__c.
     * 
     * @return trainer__c
     */
    public java.lang.String getTrainer__c() {
        return trainer__c;
    }


    /**
     * Sets the trainer__c value for this Training_Relativity__c.
     * 
     * @param trainer__c
     */
    public void setTrainer__c(java.lang.String trainer__c) {
        this.trainer__c = trainer__c;
    }


    /**
     * Gets the trainer__r value for this Training_Relativity__c.
     * 
     * @return trainer__r
     */
    public com.sforce.soap.enterprise.sobject.User getTrainer__r() {
        return trainer__r;
    }


    /**
     * Sets the trainer__r value for this Training_Relativity__c.
     * 
     * @param trainer__r
     */
    public void setTrainer__r(com.sforce.soap.enterprise.sobject.User trainer__r) {
        this.trainer__r = trainer__r;
    }


    /**
     * Gets the training_Attendees__r value for this Training_Relativity__c.
     * 
     * @return training_Attendees__r
     */
    public com.sforce.soap.enterprise.QueryResult getTraining_Attendees__r() {
        return training_Attendees__r;
    }


    /**
     * Sets the training_Attendees__r value for this Training_Relativity__c.
     * 
     * @param training_Attendees__r
     */
    public void setTraining_Attendees__r(com.sforce.soap.enterprise.QueryResult training_Attendees__r) {
        this.training_Attendees__r = training_Attendees__r;
    }


    /**
     * Gets the training_Bill__c value for this Training_Relativity__c.
     * 
     * @return training_Bill__c
     */
    public java.lang.String getTraining_Bill__c() {
        return training_Bill__c;
    }


    /**
     * Sets the training_Bill__c value for this Training_Relativity__c.
     * 
     * @param training_Bill__c
     */
    public void setTraining_Bill__c(java.lang.String training_Bill__c) {
        this.training_Bill__c = training_Bill__c;
    }


    /**
     * Gets the training_Expenses__c value for this Training_Relativity__c.
     * 
     * @return training_Expenses__c
     */
    public java.lang.String getTraining_Expenses__c() {
        return training_Expenses__c;
    }


    /**
     * Sets the training_Expenses__c value for this Training_Relativity__c.
     * 
     * @param training_Expenses__c
     */
    public void setTraining_Expenses__c(java.lang.String training_Expenses__c) {
        this.training_Expenses__c = training_Expenses__c;
    }


    /**
     * Gets the training_Hours__c value for this Training_Relativity__c.
     * 
     * @return training_Hours__c
     */
    public java.lang.Double getTraining_Hours__c() {
        return training_Hours__c;
    }


    /**
     * Sets the training_Hours__c value for this Training_Relativity__c.
     * 
     * @param training_Hours__c
     */
    public void setTraining_Hours__c(java.lang.Double training_Hours__c) {
        this.training_Hours__c = training_Hours__c;
    }


    /**
     * Gets the training_QC_Comments__c value for this Training_Relativity__c.
     * 
     * @return training_QC_Comments__c
     */
    public java.lang.String getTraining_QC_Comments__c() {
        return training_QC_Comments__c;
    }


    /**
     * Sets the training_QC_Comments__c value for this Training_Relativity__c.
     * 
     * @param training_QC_Comments__c
     */
    public void setTraining_QC_Comments__c(java.lang.String training_QC_Comments__c) {
        this.training_QC_Comments__c = training_QC_Comments__c;
    }


    /**
     * Gets the training_QC_Status__c value for this Training_Relativity__c.
     * 
     * @return training_QC_Status__c
     */
    public java.lang.String getTraining_QC_Status__c() {
        return training_QC_Status__c;
    }


    /**
     * Sets the training_QC_Status__c value for this Training_Relativity__c.
     * 
     * @param training_QC_Status__c
     */
    public void setTraining_QC_Status__c(java.lang.String training_QC_Status__c) {
        this.training_QC_Status__c = training_QC_Status__c;
    }


    /**
     * Gets the training_Questions__r value for this Training_Relativity__c.
     * 
     * @return training_Questions__r
     */
    public com.sforce.soap.enterprise.QueryResult getTraining_Questions__r() {
        return training_Questions__r;
    }


    /**
     * Sets the training_Questions__r value for this Training_Relativity__c.
     * 
     * @param training_Questions__r
     */
    public void setTraining_Questions__r(com.sforce.soap.enterprise.QueryResult training_Questions__r) {
        this.training_Questions__r = training_Questions__r;
    }


    /**
     * Gets the training_Random_Sample__c value for this Training_Relativity__c.
     * 
     * @return training_Random_Sample__c
     */
    public java.lang.Double getTraining_Random_Sample__c() {
        return training_Random_Sample__c;
    }


    /**
     * Sets the training_Random_Sample__c value for this Training_Relativity__c.
     * 
     * @param training_Random_Sample__c
     */
    public void setTraining_Random_Sample__c(java.lang.Double training_Random_Sample__c) {
        this.training_Random_Sample__c = training_Random_Sample__c;
    }


    /**
     * Gets the training_Survey_Results1__r value for this Training_Relativity__c.
     * 
     * @return training_Survey_Results1__r
     */
    public com.sforce.soap.enterprise.QueryResult getTraining_Survey_Results1__r() {
        return training_Survey_Results1__r;
    }


    /**
     * Sets the training_Survey_Results1__r value for this Training_Relativity__c.
     * 
     * @param training_Survey_Results1__r
     */
    public void setTraining_Survey_Results1__r(com.sforce.soap.enterprise.QueryResult training_Survey_Results1__r) {
        this.training_Survey_Results1__r = training_Survey_Results1__r;
    }


    /**
     * Gets the training_Type_Full_Name__c value for this Training_Relativity__c.
     * 
     * @return training_Type_Full_Name__c
     */
    public java.lang.String getTraining_Type_Full_Name__c() {
        return training_Type_Full_Name__c;
    }


    /**
     * Sets the training_Type_Full_Name__c value for this Training_Relativity__c.
     * 
     * @param training_Type_Full_Name__c
     */
    public void setTraining_Type_Full_Name__c(java.lang.String training_Type_Full_Name__c) {
        this.training_Type_Full_Name__c = training_Type_Full_Name__c;
    }


    /**
     * Gets the travel_Billable__c value for this Training_Relativity__c.
     * 
     * @return travel_Billable__c
     */
    public java.lang.String getTravel_Billable__c() {
        return travel_Billable__c;
    }


    /**
     * Sets the travel_Billable__c value for this Training_Relativity__c.
     * 
     * @param travel_Billable__c
     */
    public void setTravel_Billable__c(java.lang.String travel_Billable__c) {
        this.travel_Billable__c = travel_Billable__c;
    }


    /**
     * Gets the travel_Information__c value for this Training_Relativity__c.
     * 
     * @return travel_Information__c
     */
    public java.lang.String getTravel_Information__c() {
        return travel_Information__c;
    }


    /**
     * Sets the travel_Information__c value for this Training_Relativity__c.
     * 
     * @param travel_Information__c
     */
    public void setTravel_Information__c(java.lang.String travel_Information__c) {
        this.travel_Information__c = travel_Information__c;
    }


    /**
     * Gets the type_Sub__c value for this Training_Relativity__c.
     * 
     * @return type_Sub__c
     */
    public java.lang.String getType_Sub__c() {
        return type_Sub__c;
    }


    /**
     * Sets the type_Sub__c value for this Training_Relativity__c.
     * 
     * @param type_Sub__c
     */
    public void setType_Sub__c(java.lang.String type_Sub__c) {
        this.type_Sub__c = type_Sub__c;
    }


    /**
     * Gets the type__c value for this Training_Relativity__c.
     * 
     * @return type__c
     */
    public java.lang.String getType__c() {
        return type__c;
    }


    /**
     * Sets the type__c value for this Training_Relativity__c.
     * 
     * @param type__c
     */
    public void setType__c(java.lang.String type__c) {
        this.type__c = type__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Training_Relativity__c)) return false;
        Training_Relativity__c other = (Training_Relativity__c) obj;
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
            ((this.activityHistories==null && other.getActivityHistories()==null) || 
             (this.activityHistories!=null &&
              this.activityHistories.equals(other.getActivityHistories()))) &&
            ((this.anonymous_Atttendees__c==null && other.getAnonymous_Atttendees__c()==null) || 
             (this.anonymous_Atttendees__c!=null &&
              this.anonymous_Atttendees__c.equals(other.getAnonymous_Atttendees__c()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.billable__c==null && other.getBillable__c()==null) || 
             (this.billable__c!=null &&
              this.billable__c.equals(other.getBillable__c()))) &&
            ((this.billing_Complete__c==null && other.getBilling_Complete__c()==null) || 
             (this.billing_Complete__c!=null &&
              this.billing_Complete__c.equals(other.getBilling_Complete__c()))) &&
            ((this.billing_Method__c==null && other.getBilling_Method__c()==null) || 
             (this.billing_Method__c!=null &&
              this.billing_Method__c.equals(other.getBilling_Method__c()))) &&
            ((this.billing_Notes__c==null && other.getBilling_Notes__c()==null) || 
             (this.billing_Notes__c!=null &&
              this.billing_Notes__c.equals(other.getBilling_Notes__c()))) &&
            ((this.call_Info__c==null && other.getCall_Info__c()==null) || 
             (this.call_Info__c!=null &&
              this.call_Info__c.equals(other.getCall_Info__c()))) &&
            ((this.channel_Manager__c==null && other.getChannel_Manager__c()==null) || 
             (this.channel_Manager__c!=null &&
              this.channel_Manager__c.equals(other.getChannel_Manager__c()))) &&
            ((this.channel_Manager__r==null && other.getChannel_Manager__r()==null) || 
             (this.channel_Manager__r!=null &&
              this.channel_Manager__r.equals(other.getChannel_Manager__r()))) &&
            ((this.checklists__r==null && other.getChecklists__r()==null) || 
             (this.checklists__r!=null &&
              this.checklists__r.equals(other.getChecklists__r()))) &&
            ((this.class_Size__c==null && other.getClass_Size__c()==null) || 
             (this.class_Size__c!=null &&
              this.class_Size__c.equals(other.getClass_Size__c()))) &&
            ((this.client_Login_Credentials__c==null && other.getClient_Login_Credentials__c()==null) || 
             (this.client_Login_Credentials__c!=null &&
              this.client_Login_Credentials__c.equals(other.getClient_Login_Credentials__c()))) &&
            ((this.client_Relativity_URL__c==null && other.getClient_Relativity_URL__c()==null) || 
             (this.client_Relativity_URL__c!=null &&
              this.client_Relativity_URL__c.equals(other.getClient_Relativity_URL__c()))) &&
            ((this.conference_Room__c==null && other.getConference_Room__c()==null) || 
             (this.conference_Room__c!=null &&
              this.conference_Room__c.equals(other.getConference_Room__c()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.delivery_Method__c==null && other.getDelivery_Method__c()==null) || 
             (this.delivery_Method__c!=null &&
              this.delivery_Method__c.equals(other.getDelivery_Method__c()))) &&
            ((this.end_Date_Full__c==null && other.getEnd_Date_Full__c()==null) || 
             (this.end_Date_Full__c!=null &&
              this.end_Date_Full__c.equals(other.getEnd_Date_Full__c()))) &&
            ((this.end_Date_Only__c==null && other.getEnd_Date_Only__c()==null) || 
             (this.end_Date_Only__c!=null &&
              this.end_Date_Only__c.equals(other.getEnd_Date_Only__c()))) &&
            ((this.end_Date__c==null && other.getEnd_Date__c()==null) || 
             (this.end_Date__c!=null &&
              this.end_Date__c.equals(other.getEnd_Date__c()))) &&
            ((this.environment__c==null && other.getEnvironment__c()==null) || 
             (this.environment__c!=null &&
              this.environment__c.equals(other.getEnvironment__c()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              this.events.equals(other.getEvents()))) &&
            ((this.feature_Requests__r==null && other.getFeature_Requests__r()==null) || 
             (this.feature_Requests__r!=null &&
              this.feature_Requests__r.equals(other.getFeature_Requests__r()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.goTo_Meeting_Account__c==null && other.getGoTo_Meeting_Account__c()==null) || 
             (this.goTo_Meeting_Account__c!=null &&
              this.goTo_Meeting_Account__c.equals(other.getGoTo_Meeting_Account__c()))) &&
            ((this.goTo_Meeting_Account__r==null && other.getGoTo_Meeting_Account__r()==null) || 
             (this.goTo_Meeting_Account__r!=null &&
              this.goTo_Meeting_Account__r.equals(other.getGoTo_Meeting_Account__r()))) &&
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
            ((this.hosts_Added__c==null && other.getHosts_Added__c()==null) || 
             (this.hosts_Added__c!=null &&
              this.hosts_Added__c.equals(other.getHosts_Added__c()))) &&
            ((this.hotel_Information__c==null && other.getHotel_Information__c()==null) || 
             (this.hotel_Information__c!=null &&
              this.hotel_Information__c.equals(other.getHotel_Information__c()))) &&
            ((this.ICal_Day_After_Start__c==null && other.getICal_Day_After_Start__c()==null) || 
             (this.ICal_Day_After_Start__c!=null &&
              this.ICal_Day_After_Start__c.equals(other.getICal_Day_After_Start__c()))) &&
            ((this.includes_Technical_Backend_Training__c==null && other.getIncludes_Technical_Backend_Training__c()==null) || 
             (this.includes_Technical_Backend_Training__c!=null &&
              this.includes_Technical_Backend_Training__c.equals(other.getIncludes_Technical_Backend_Training__c()))) &&
            ((this.invoice_Created__c==null && other.getInvoice_Created__c()==null) || 
             (this.invoice_Created__c!=null &&
              this.invoice_Created__c.equals(other.getInvoice_Created__c()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.laptop_Information__c==null && other.getLaptop_Information__c()==null) || 
             (this.laptop_Information__c!=null &&
              this.laptop_Information__c.equals(other.getLaptop_Information__c()))) &&
            ((this.laptops_Provided__c==null && other.getLaptops_Provided__c()==null) || 
             (this.laptops_Provided__c!=null &&
              this.laptops_Provided__c.equals(other.getLaptops_Provided__c()))) &&
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
            ((this.location_City_State__c==null && other.getLocation_City_State__c()==null) || 
             (this.location_City_State__c!=null &&
              this.location_City_State__c.equals(other.getLocation_City_State__c()))) &&
            ((this.location__c==null && other.getLocation__c()==null) || 
             (this.location__c!=null &&
              this.location__c.equals(other.getLocation__c()))) &&
            ((this.main_Contact__c==null && other.getMain_Contact__c()==null) || 
             (this.main_Contact__c!=null &&
              this.main_Contact__c.equals(other.getMain_Contact__c()))) &&
            ((this.main_Contact__r==null && other.getMain_Contact__r()==null) || 
             (this.main_Contact__r!=null &&
              this.main_Contact__r.equals(other.getMain_Contact__r()))) &&
            ((this.meeting_URL__c==null && other.getMeeting_URL__c()==null) || 
             (this.meeting_URL__c!=null &&
              this.meeting_URL__c.equals(other.getMeeting_URL__c()))) &&
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
            ((this.number_of_Unanswered_Questions__c==null && other.getNumber_of_Unanswered_Questions__c()==null) || 
             (this.number_of_Unanswered_Questions__c!=null &&
              this.number_of_Unanswered_Questions__c.equals(other.getNumber_of_Unanswered_Questions__c()))) &&
            ((this.on_Site_Contact__c==null && other.getOn_Site_Contact__c()==null) || 
             (this.on_Site_Contact__c!=null &&
              this.on_Site_Contact__c.equals(other.getOn_Site_Contact__c()))) &&
            ((this.on_Site_Contact__r==null && other.getOn_Site_Contact__r()==null) || 
             (this.on_Site_Contact__r!=null &&
              this.on_Site_Contact__r.equals(other.getOn_Site_Contact__r()))) &&
            ((this.onsite_Address__c==null && other.getOnsite_Address__c()==null) || 
             (this.onsite_Address__c!=null &&
              this.onsite_Address__c.equals(other.getOnsite_Address__c()))) &&
            ((this.onsite_Visit__c==null && other.getOnsite_Visit__c()==null) || 
             (this.onsite_Visit__c!=null &&
              this.onsite_Visit__c.equals(other.getOnsite_Visit__c()))) &&
            ((this.onsite_Visit__r==null && other.getOnsite_Visit__r()==null) || 
             (this.onsite_Visit__r!=null &&
              this.onsite_Visit__r.equals(other.getOnsite_Visit__r()))) &&
            ((this.openActivities==null && other.getOpenActivities()==null) || 
             (this.openActivities!=null &&
              this.openActivities.equals(other.getOpenActivities()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.partner_Kickoff__c==null && other.getPartner_Kickoff__c()==null) || 
             (this.partner_Kickoff__c!=null &&
              this.partner_Kickoff__c.equals(other.getPartner_Kickoff__c()))) &&
            ((this.partner_Kickoff__r==null && other.getPartner_Kickoff__r()==null) || 
             (this.partner_Kickoff__r!=null &&
              this.partner_Kickoff__r.equals(other.getPartner_Kickoff__r()))) &&
            ((this.partner_Kickoffs__r==null && other.getPartner_Kickoffs__r()==null) || 
             (this.partner_Kickoffs__r!=null &&
              this.partner_Kickoffs__r.equals(other.getPartner_Kickoffs__r()))) &&
            ((this.power_of_One__c==null && other.getPower_of_One__c()==null) || 
             (this.power_of_One__c!=null &&
              this.power_of_One__c.equals(other.getPower_of_One__c()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.RCE_Credits__c==null && other.getRCE_Credits__c()==null) || 
             (this.RCE_Credits__c!=null &&
              this.RCE_Credits__c.equals(other.getRCE_Credits__c()))) &&
            ((this.RCE_Credits__r==null && other.getRCE_Credits__r()==null) || 
             (this.RCE_Credits__r!=null &&
              this.RCE_Credits__r.equals(other.getRCE_Credits__r()))) &&
            ((this.rate__c==null && other.getRate__c()==null) || 
             (this.rate__c!=null &&
              this.rate__c.equals(other.getRate__c()))) &&
            ((this.SWAG__r==null && other.getSWAG__r()==null) || 
             (this.SWAG__r!=null &&
              this.SWAG__r.equals(other.getSWAG__r()))) &&
            ((this.sendEmail__c==null && other.getSendEmail__c()==null) || 
             (this.sendEmail__c!=null &&
              this.sendEmail__c.equals(other.getSendEmail__c()))) &&
            ((this.session_Type__c==null && other.getSession_Type__c()==null) || 
             (this.session_Type__c!=null &&
              this.session_Type__c.equals(other.getSession_Type__c()))) &&
            ((this.shares==null && other.getShares()==null) || 
             (this.shares!=null &&
              this.shares.equals(other.getShares()))) &&
            ((this.start_Date_Full__c==null && other.getStart_Date_Full__c()==null) || 
             (this.start_Date_Full__c!=null &&
              this.start_Date_Full__c.equals(other.getStart_Date_Full__c()))) &&
            ((this.start_Date_Only__c==null && other.getStart_Date_Only__c()==null) || 
             (this.start_Date_Only__c!=null &&
              this.start_Date_Only__c.equals(other.getStart_Date_Only__c()))) &&
            ((this.start_Date__c==null && other.getStart_Date__c()==null) || 
             (this.start_Date__c!=null &&
              this.start_Date__c.equals(other.getStart_Date__c()))) &&
            ((this.status__c==null && other.getStatus__c()==null) || 
             (this.status__c!=null &&
              this.status__c.equals(other.getStatus__c()))) &&
            ((this.survey_Feedback__c==null && other.getSurvey_Feedback__c()==null) || 
             (this.survey_Feedback__c!=null &&
              this.survey_Feedback__c.equals(other.getSurvey_Feedback__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              this.tasks.equals(other.getTasks()))) &&
            ((this.team_Teaching__c==null && other.getTeam_Teaching__c()==null) || 
             (this.team_Teaching__c!=null &&
              this.team_Teaching__c.equals(other.getTeam_Teaching__c()))) &&
            ((this.team_Teaching__r==null && other.getTeam_Teaching__r()==null) || 
             (this.team_Teaching__r!=null &&
              this.team_Teaching__r.equals(other.getTeam_Teaching__r()))) &&
            ((this.test__c==null && other.getTest__c()==null) || 
             (this.test__c!=null &&
              this.test__c.equals(other.getTest__c()))) &&
            ((this.total_Attendee__c==null && other.getTotal_Attendee__c()==null) || 
             (this.total_Attendee__c!=null &&
              this.total_Attendee__c.equals(other.getTotal_Attendee__c()))) &&
            ((this.total_Attendees__c==null && other.getTotal_Attendees__c()==null) || 
             (this.total_Attendees__c!=null &&
              this.total_Attendees__c.equals(other.getTotal_Attendees__c()))) &&
            ((this.total_Attendees_with_Anonymous_Ones__c==null && other.getTotal_Attendees_with_Anonymous_Ones__c()==null) || 
             (this.total_Attendees_with_Anonymous_Ones__c!=null &&
              this.total_Attendees_with_Anonymous_Ones__c.equals(other.getTotal_Attendees_with_Anonymous_Ones__c()))) &&
            ((this.total_on_Waitlist__c==null && other.getTotal_on_Waitlist__c()==null) || 
             (this.total_on_Waitlist__c!=null &&
              this.total_on_Waitlist__c.equals(other.getTotal_on_Waitlist__c()))) &&
            ((this.trainer_Role__c==null && other.getTrainer_Role__c()==null) || 
             (this.trainer_Role__c!=null &&
              this.trainer_Role__c.equals(other.getTrainer_Role__c()))) &&
            ((this.trainer__c==null && other.getTrainer__c()==null) || 
             (this.trainer__c!=null &&
              this.trainer__c.equals(other.getTrainer__c()))) &&
            ((this.trainer__r==null && other.getTrainer__r()==null) || 
             (this.trainer__r!=null &&
              this.trainer__r.equals(other.getTrainer__r()))) &&
            ((this.training_Attendees__r==null && other.getTraining_Attendees__r()==null) || 
             (this.training_Attendees__r!=null &&
              this.training_Attendees__r.equals(other.getTraining_Attendees__r()))) &&
            ((this.training_Bill__c==null && other.getTraining_Bill__c()==null) || 
             (this.training_Bill__c!=null &&
              this.training_Bill__c.equals(other.getTraining_Bill__c()))) &&
            ((this.training_Expenses__c==null && other.getTraining_Expenses__c()==null) || 
             (this.training_Expenses__c!=null &&
              this.training_Expenses__c.equals(other.getTraining_Expenses__c()))) &&
            ((this.training_Hours__c==null && other.getTraining_Hours__c()==null) || 
             (this.training_Hours__c!=null &&
              this.training_Hours__c.equals(other.getTraining_Hours__c()))) &&
            ((this.training_QC_Comments__c==null && other.getTraining_QC_Comments__c()==null) || 
             (this.training_QC_Comments__c!=null &&
              this.training_QC_Comments__c.equals(other.getTraining_QC_Comments__c()))) &&
            ((this.training_QC_Status__c==null && other.getTraining_QC_Status__c()==null) || 
             (this.training_QC_Status__c!=null &&
              this.training_QC_Status__c.equals(other.getTraining_QC_Status__c()))) &&
            ((this.training_Questions__r==null && other.getTraining_Questions__r()==null) || 
             (this.training_Questions__r!=null &&
              this.training_Questions__r.equals(other.getTraining_Questions__r()))) &&
            ((this.training_Random_Sample__c==null && other.getTraining_Random_Sample__c()==null) || 
             (this.training_Random_Sample__c!=null &&
              this.training_Random_Sample__c.equals(other.getTraining_Random_Sample__c()))) &&
            ((this.training_Survey_Results1__r==null && other.getTraining_Survey_Results1__r()==null) || 
             (this.training_Survey_Results1__r!=null &&
              this.training_Survey_Results1__r.equals(other.getTraining_Survey_Results1__r()))) &&
            ((this.training_Type_Full_Name__c==null && other.getTraining_Type_Full_Name__c()==null) || 
             (this.training_Type_Full_Name__c!=null &&
              this.training_Type_Full_Name__c.equals(other.getTraining_Type_Full_Name__c()))) &&
            ((this.travel_Billable__c==null && other.getTravel_Billable__c()==null) || 
             (this.travel_Billable__c!=null &&
              this.travel_Billable__c.equals(other.getTravel_Billable__c()))) &&
            ((this.travel_Information__c==null && other.getTravel_Information__c()==null) || 
             (this.travel_Information__c!=null &&
              this.travel_Information__c.equals(other.getTravel_Information__c()))) &&
            ((this.type_Sub__c==null && other.getType_Sub__c()==null) || 
             (this.type_Sub__c!=null &&
              this.type_Sub__c.equals(other.getType_Sub__c()))) &&
            ((this.type__c==null && other.getType__c()==null) || 
             (this.type__c!=null &&
              this.type__c.equals(other.getType__c())));
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
        if (getActivityHistories() != null) {
            _hashCode += getActivityHistories().hashCode();
        }
        if (getAnonymous_Atttendees__c() != null) {
            _hashCode += getAnonymous_Atttendees__c().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getBillable__c() != null) {
            _hashCode += getBillable__c().hashCode();
        }
        if (getBilling_Complete__c() != null) {
            _hashCode += getBilling_Complete__c().hashCode();
        }
        if (getBilling_Method__c() != null) {
            _hashCode += getBilling_Method__c().hashCode();
        }
        if (getBilling_Notes__c() != null) {
            _hashCode += getBilling_Notes__c().hashCode();
        }
        if (getCall_Info__c() != null) {
            _hashCode += getCall_Info__c().hashCode();
        }
        if (getChannel_Manager__c() != null) {
            _hashCode += getChannel_Manager__c().hashCode();
        }
        if (getChannel_Manager__r() != null) {
            _hashCode += getChannel_Manager__r().hashCode();
        }
        if (getChecklists__r() != null) {
            _hashCode += getChecklists__r().hashCode();
        }
        if (getClass_Size__c() != null) {
            _hashCode += getClass_Size__c().hashCode();
        }
        if (getClient_Login_Credentials__c() != null) {
            _hashCode += getClient_Login_Credentials__c().hashCode();
        }
        if (getClient_Relativity_URL__c() != null) {
            _hashCode += getClient_Relativity_URL__c().hashCode();
        }
        if (getConference_Room__c() != null) {
            _hashCode += getConference_Room__c().hashCode();
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
        if (getDelivery_Method__c() != null) {
            _hashCode += getDelivery_Method__c().hashCode();
        }
        if (getEnd_Date_Full__c() != null) {
            _hashCode += getEnd_Date_Full__c().hashCode();
        }
        if (getEnd_Date_Only__c() != null) {
            _hashCode += getEnd_Date_Only__c().hashCode();
        }
        if (getEnd_Date__c() != null) {
            _hashCode += getEnd_Date__c().hashCode();
        }
        if (getEnvironment__c() != null) {
            _hashCode += getEnvironment__c().hashCode();
        }
        if (getEvents() != null) {
            _hashCode += getEvents().hashCode();
        }
        if (getFeature_Requests__r() != null) {
            _hashCode += getFeature_Requests__r().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getGoTo_Meeting_Account__c() != null) {
            _hashCode += getGoTo_Meeting_Account__c().hashCode();
        }
        if (getGoTo_Meeting_Account__r() != null) {
            _hashCode += getGoTo_Meeting_Account__r().hashCode();
        }
        if (getHistories() != null) {
            _hashCode += getHistories().hashCode();
        }
        if (getHosts_Added__c() != null) {
            _hashCode += getHosts_Added__c().hashCode();
        }
        if (getHotel_Information__c() != null) {
            _hashCode += getHotel_Information__c().hashCode();
        }
        if (getICal_Day_After_Start__c() != null) {
            _hashCode += getICal_Day_After_Start__c().hashCode();
        }
        if (getIncludes_Technical_Backend_Training__c() != null) {
            _hashCode += getIncludes_Technical_Backend_Training__c().hashCode();
        }
        if (getInvoice_Created__c() != null) {
            _hashCode += getInvoice_Created__c().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getLaptop_Information__c() != null) {
            _hashCode += getLaptop_Information__c().hashCode();
        }
        if (getLaptops_Provided__c() != null) {
            _hashCode += getLaptops_Provided__c().hashCode();
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
        if (getLocation_City_State__c() != null) {
            _hashCode += getLocation_City_State__c().hashCode();
        }
        if (getLocation__c() != null) {
            _hashCode += getLocation__c().hashCode();
        }
        if (getMain_Contact__c() != null) {
            _hashCode += getMain_Contact__c().hashCode();
        }
        if (getMain_Contact__r() != null) {
            _hashCode += getMain_Contact__r().hashCode();
        }
        if (getMeeting_URL__c() != null) {
            _hashCode += getMeeting_URL__c().hashCode();
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
        if (getNumber_of_Unanswered_Questions__c() != null) {
            _hashCode += getNumber_of_Unanswered_Questions__c().hashCode();
        }
        if (getOn_Site_Contact__c() != null) {
            _hashCode += getOn_Site_Contact__c().hashCode();
        }
        if (getOn_Site_Contact__r() != null) {
            _hashCode += getOn_Site_Contact__r().hashCode();
        }
        if (getOnsite_Address__c() != null) {
            _hashCode += getOnsite_Address__c().hashCode();
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
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getPartner_Kickoff__c() != null) {
            _hashCode += getPartner_Kickoff__c().hashCode();
        }
        if (getPartner_Kickoff__r() != null) {
            _hashCode += getPartner_Kickoff__r().hashCode();
        }
        if (getPartner_Kickoffs__r() != null) {
            _hashCode += getPartner_Kickoffs__r().hashCode();
        }
        if (getPower_of_One__c() != null) {
            _hashCode += getPower_of_One__c().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getRCE_Credits__c() != null) {
            _hashCode += getRCE_Credits__c().hashCode();
        }
        if (getRCE_Credits__r() != null) {
            _hashCode += getRCE_Credits__r().hashCode();
        }
        if (getRate__c() != null) {
            _hashCode += getRate__c().hashCode();
        }
        if (getSWAG__r() != null) {
            _hashCode += getSWAG__r().hashCode();
        }
        if (getSendEmail__c() != null) {
            _hashCode += getSendEmail__c().hashCode();
        }
        if (getSession_Type__c() != null) {
            _hashCode += getSession_Type__c().hashCode();
        }
        if (getShares() != null) {
            _hashCode += getShares().hashCode();
        }
        if (getStart_Date_Full__c() != null) {
            _hashCode += getStart_Date_Full__c().hashCode();
        }
        if (getStart_Date_Only__c() != null) {
            _hashCode += getStart_Date_Only__c().hashCode();
        }
        if (getStart_Date__c() != null) {
            _hashCode += getStart_Date__c().hashCode();
        }
        if (getStatus__c() != null) {
            _hashCode += getStatus__c().hashCode();
        }
        if (getSurvey_Feedback__c() != null) {
            _hashCode += getSurvey_Feedback__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTasks() != null) {
            _hashCode += getTasks().hashCode();
        }
        if (getTeam_Teaching__c() != null) {
            _hashCode += getTeam_Teaching__c().hashCode();
        }
        if (getTeam_Teaching__r() != null) {
            _hashCode += getTeam_Teaching__r().hashCode();
        }
        if (getTest__c() != null) {
            _hashCode += getTest__c().hashCode();
        }
        if (getTotal_Attendee__c() != null) {
            _hashCode += getTotal_Attendee__c().hashCode();
        }
        if (getTotal_Attendees__c() != null) {
            _hashCode += getTotal_Attendees__c().hashCode();
        }
        if (getTotal_Attendees_with_Anonymous_Ones__c() != null) {
            _hashCode += getTotal_Attendees_with_Anonymous_Ones__c().hashCode();
        }
        if (getTotal_on_Waitlist__c() != null) {
            _hashCode += getTotal_on_Waitlist__c().hashCode();
        }
        if (getTrainer_Role__c() != null) {
            _hashCode += getTrainer_Role__c().hashCode();
        }
        if (getTrainer__c() != null) {
            _hashCode += getTrainer__c().hashCode();
        }
        if (getTrainer__r() != null) {
            _hashCode += getTrainer__r().hashCode();
        }
        if (getTraining_Attendees__r() != null) {
            _hashCode += getTraining_Attendees__r().hashCode();
        }
        if (getTraining_Bill__c() != null) {
            _hashCode += getTraining_Bill__c().hashCode();
        }
        if (getTraining_Expenses__c() != null) {
            _hashCode += getTraining_Expenses__c().hashCode();
        }
        if (getTraining_Hours__c() != null) {
            _hashCode += getTraining_Hours__c().hashCode();
        }
        if (getTraining_QC_Comments__c() != null) {
            _hashCode += getTraining_QC_Comments__c().hashCode();
        }
        if (getTraining_QC_Status__c() != null) {
            _hashCode += getTraining_QC_Status__c().hashCode();
        }
        if (getTraining_Questions__r() != null) {
            _hashCode += getTraining_Questions__r().hashCode();
        }
        if (getTraining_Random_Sample__c() != null) {
            _hashCode += getTraining_Random_Sample__c().hashCode();
        }
        if (getTraining_Survey_Results1__r() != null) {
            _hashCode += getTraining_Survey_Results1__r().hashCode();
        }
        if (getTraining_Type_Full_Name__c() != null) {
            _hashCode += getTraining_Type_Full_Name__c().hashCode();
        }
        if (getTravel_Billable__c() != null) {
            _hashCode += getTravel_Billable__c().hashCode();
        }
        if (getTravel_Information__c() != null) {
            _hashCode += getTravel_Information__c().hashCode();
        }
        if (getType_Sub__c() != null) {
            _hashCode += getType_Sub__c().hashCode();
        }
        if (getType__c() != null) {
            _hashCode += getType__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Training_Relativity__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Relativity__c"));
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
        elemField.setFieldName("activityHistories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActivityHistories"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anonymous_Atttendees__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Anonymous_Atttendees__c"));
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
        elemField.setFieldName("billable__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Billable__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billing_Complete__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Billing_Complete__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billing_Method__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Billing_Method__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billing_Notes__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Billing_Notes__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("call_Info__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Call_Info__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel_Manager__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Channel_Manager__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel_Manager__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Channel_Manager__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checklists__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Checklists__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("class_Size__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Class_Size__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("client_Login_Credentials__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Client_Login_Credentials__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("client_Relativity_URL__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Client_Relativity_URL__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conference_Room__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Conference_Room__c"));
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
        elemField.setFieldName("delivery_Method__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Delivery_Method__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("end_Date_Full__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "End_Date_Full__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("end_Date_Only__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "End_Date_Only__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("end_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "End_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environment__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Environment__c"));
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
        elemField.setFieldName("feature_Requests__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Feature_Requests__r"));
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
        elemField.setFieldName("goTo_Meeting_Account__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "GoTo_Meeting_Account__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("goTo_Meeting_Account__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "GoTo_Meeting_Account__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
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
        elemField.setFieldName("hosts_Added__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Hosts_Added__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotel_Information__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Hotel_Information__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ICal_Day_After_Start__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ICal_Day_After_Start__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includes_Technical_Backend_Training__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Includes_Technical_Backend_Training__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoice_Created__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Invoice_Created__c"));
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
        elemField.setFieldName("laptop_Information__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Laptop_Information__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("laptops_Provided__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Laptops_Provided__c"));
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
        elemField.setFieldName("location_City_State__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Location_City_State__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Location__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("main_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Main_Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("main_Contact__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Main_Contact__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meeting_URL__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Meeting_URL__c"));
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
        elemField.setFieldName("number_of_Unanswered_Questions__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Number_of_Unanswered_Questions__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("on_Site_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "On_Site_Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("on_Site_Contact__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "On_Site_Contact__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onsite_Address__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Onsite_Address__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("partner_Kickoff__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Partner_Kickoff__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partner_Kickoff__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Partner_Kickoff__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partner_Kickoffs__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Partner_Kickoffs__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("power_of_One__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Power_of_One__c"));
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
        elemField.setFieldName("RCE_Credits__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCE_Credits__c"));
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
        elemField.setFieldName("rate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Rate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("sendEmail__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SendEmail__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("session_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Session_Type__c"));
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
        elemField.setFieldName("start_Date_Full__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Start_Date_Full__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start_Date_Only__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Start_Date_Only__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Start_Date__c"));
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
        elemField.setFieldName("survey_Feedback__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Survey_Feedback__c"));
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
        elemField.setFieldName("team_Teaching__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Team_Teaching__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("team_Teaching__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Team_Teaching__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("test__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Test__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_Attendee__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Total_Attendee__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_Attendees__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Total_Attendees__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_Attendees_with_Anonymous_Ones__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Total_Attendees_with_Anonymous_Ones__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_on_Waitlist__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Total_on_Waitlist__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trainer_Role__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Trainer_Role__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trainer__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Trainer__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trainer__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Trainer__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
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
        elemField.setFieldName("training_Bill__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Bill__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("training_Expenses__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Expenses__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("training_Hours__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Hours__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("training_QC_Comments__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_QC_Comments__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("training_QC_Status__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_QC_Status__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("training_Random_Sample__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Random_Sample__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("training_Survey_Results1__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Survey_Results1__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("training_Type_Full_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Type_Full_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("travel_Billable__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Travel_Billable__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("travel_Information__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Travel_Information__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type_Sub__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Type_Sub__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Type__c"));
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

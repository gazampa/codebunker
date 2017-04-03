/**
 * Feedback__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Feedback__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String account_Type__c;

    private java.lang.String account__c;

    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.Double breakout_session_content_useful__c;

    private java.lang.String CS_Manager_Owner__c;

    private java.lang.String case__c;

    private com.sforce.soap.enterprise.sobject._case case__r;

    private java.lang.String client_Service_Rep__c;

    private com.sforce.soap.enterprise.sobject.User client_Service_Rep__r;

    private java.lang.String comments__c;

    private java.lang.String contact__c;

    private java.lang.Double courtesy_and_Professionalism__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.Double dev_Courtesy_and_Professionalism__c;

    private java.lang.String dev_Owner__c;

    private java.lang.Double dev_Product_Knowledge__c;

    private java.lang.Double dev_Qlty_of_Problem_Resolution__c;

    private java.lang.Double dev_Technical_Skill__c;

    private java.lang.Double dev_Understanding_Issue_Business_Impac__c;

    private java.lang.String did_you_attempt_to_use_Client_Portal__c;

    private com.sforce.soap.enterprise.QueryResult events;

    private java.lang.Double excited_for_what_I_learned_about_8__c;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.lang.Double feedback_Score__c;

    private java.lang.Double format_of_the_Event__c;

    private java.lang.String further_Follow_up_Required__c;

    private java.lang.Boolean isDeleted;

    private java.lang.String issue_that_Caused_Negative_Rating__c;

    private java.lang.Double KCD_Solution_Documentation__c;

    private java.lang.Double KCD_Solution_Effectiveness__c;

    private java.lang.Double KCD_Solution_Use__c;

    private java.lang.Double keynote_presentation_content_useful__c;

    private java.util.Date lastActivityDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String length_of_Time__c;

    private java.lang.Double length_of_the_Event__c;

    private java.lang.String length_of_time_to_resolve_case__c;

    private java.lang.Double location_of_the_Venue__c;

    private java.lang.Double mgr_Courtesy_and_Professionalism__c;

    private java.lang.Double mgr_Product_Knowledge__c;

    private java.lang.Double mgr_Qlty_of_Problem_Resolution__c;

    private java.lang.Double mgr_Technical_Skill__c;

    private java.lang.Double mgr_Understanding_Issue_Impact__c;

    private java.lang.String name;

    private java.lang.String name__c;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private java.lang.String on_breakout_sessions__c;

    private java.lang.String on_event_overall__c;

    private java.lang.String on_keynote_presentation__c;

    private com.sforce.soap.enterprise.QueryResult openActivities;

    private java.lang.Double overall_Event__c;

    private java.lang.String overall_Satisfaction__c;

    private java.lang.String overall_satisfied_with_this_event__c;

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.Double product_Knowledge__c;

    private java.lang.Double quality_of_problem_resolution__c;

    private java.lang.String recommend_this_event_to_your_colleagues__c;

    private com.sforce.soap.enterprise.sobject.RecordType recordType;

    private java.lang.String recordTypeId;

    private java.lang.String record_Type__c;

    private java.lang.String subject__c;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    private java.lang.Double technical_Skill__c;

    private java.util.Calendar ticket_Close_Date__c;

    private java.lang.String ticket_Owner_Role__c;

    private java.lang.String ticket_Owner__c;

    private java.lang.Double tier_1_Courtesy_and_Professionalism__c;

    private java.lang.Double tier_1_Product_Knowledge__c;

    private java.lang.Double tier_1_Qlty_of_Problem_Resolution__c;

    private java.lang.String tier_1_Rep__c;

    private java.lang.Double tier_1_Technical_Skill__c;

    private java.lang.Double tier_1_Understanding_Issue_Impact__c;

    private java.lang.Double tier_2_Courtesy_and_Professionalism__c;

    private java.lang.Double tier_2_Product_Knowledge__c;

    private java.lang.Double tier_2_Qlty_of_Problem_Resolution__c;

    private java.lang.String tier_2_Rep__c;

    private java.lang.Double tier_2_Technical_Skill__c;

    private java.lang.Double tier_2_Understanding_Issue_Impact__c;

    private java.lang.Double time_to_receive_a_response__c;

    private java.lang.Double understanding_issue_and_business_impact__c;

    private java.lang.String what_could_have_been_done_better__c;

    private java.lang.String would_you_attend_another_similar_event__c;

    public Feedback__c() {
    }

    public Feedback__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String account_Type__c,
           java.lang.String account__c,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.Double breakout_session_content_useful__c,
           java.lang.String CS_Manager_Owner__c,
           java.lang.String case__c,
           com.sforce.soap.enterprise.sobject._case case__r,
           java.lang.String client_Service_Rep__c,
           com.sforce.soap.enterprise.sobject.User client_Service_Rep__r,
           java.lang.String comments__c,
           java.lang.String contact__c,
           java.lang.Double courtesy_and_Professionalism__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.Double dev_Courtesy_and_Professionalism__c,
           java.lang.String dev_Owner__c,
           java.lang.Double dev_Product_Knowledge__c,
           java.lang.Double dev_Qlty_of_Problem_Resolution__c,
           java.lang.Double dev_Technical_Skill__c,
           java.lang.Double dev_Understanding_Issue_Business_Impac__c,
           java.lang.String did_you_attempt_to_use_Client_Portal__c,
           com.sforce.soap.enterprise.QueryResult events,
           java.lang.Double excited_for_what_I_learned_about_8__c,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.lang.Double feedback_Score__c,
           java.lang.Double format_of_the_Event__c,
           java.lang.String further_Follow_up_Required__c,
           java.lang.Boolean isDeleted,
           java.lang.String issue_that_Caused_Negative_Rating__c,
           java.lang.Double KCD_Solution_Documentation__c,
           java.lang.Double KCD_Solution_Effectiveness__c,
           java.lang.Double KCD_Solution_Use__c,
           java.lang.Double keynote_presentation_content_useful__c,
           java.util.Date lastActivityDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String length_of_Time__c,
           java.lang.Double length_of_the_Event__c,
           java.lang.String length_of_time_to_resolve_case__c,
           java.lang.Double location_of_the_Venue__c,
           java.lang.Double mgr_Courtesy_and_Professionalism__c,
           java.lang.Double mgr_Product_Knowledge__c,
           java.lang.Double mgr_Qlty_of_Problem_Resolution__c,
           java.lang.Double mgr_Technical_Skill__c,
           java.lang.Double mgr_Understanding_Issue_Impact__c,
           java.lang.String name,
           java.lang.String name__c,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           java.lang.String on_breakout_sessions__c,
           java.lang.String on_event_overall__c,
           java.lang.String on_keynote_presentation__c,
           com.sforce.soap.enterprise.QueryResult openActivities,
           java.lang.Double overall_Event__c,
           java.lang.String overall_Satisfaction__c,
           java.lang.String overall_satisfied_with_this_event__c,
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.Double product_Knowledge__c,
           java.lang.Double quality_of_problem_resolution__c,
           java.lang.String recommend_this_event_to_your_colleagues__c,
           com.sforce.soap.enterprise.sobject.RecordType recordType,
           java.lang.String recordTypeId,
           java.lang.String record_Type__c,
           java.lang.String subject__c,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks,
           java.lang.Double technical_Skill__c,
           java.util.Calendar ticket_Close_Date__c,
           java.lang.String ticket_Owner_Role__c,
           java.lang.String ticket_Owner__c,
           java.lang.Double tier_1_Courtesy_and_Professionalism__c,
           java.lang.Double tier_1_Product_Knowledge__c,
           java.lang.Double tier_1_Qlty_of_Problem_Resolution__c,
           java.lang.String tier_1_Rep__c,
           java.lang.Double tier_1_Technical_Skill__c,
           java.lang.Double tier_1_Understanding_Issue_Impact__c,
           java.lang.Double tier_2_Courtesy_and_Professionalism__c,
           java.lang.Double tier_2_Product_Knowledge__c,
           java.lang.Double tier_2_Qlty_of_Problem_Resolution__c,
           java.lang.String tier_2_Rep__c,
           java.lang.Double tier_2_Technical_Skill__c,
           java.lang.Double tier_2_Understanding_Issue_Impact__c,
           java.lang.Double time_to_receive_a_response__c,
           java.lang.Double understanding_issue_and_business_impact__c,
           java.lang.String what_could_have_been_done_better__c,
           java.lang.String would_you_attend_another_similar_event__c) {
        super(
            fieldsToNull,
            id);
        this.account_Type__c = account_Type__c;
        this.account__c = account__c;
        this.activityHistories = activityHistories;
        this.attachments = attachments;
        this.breakout_session_content_useful__c = breakout_session_content_useful__c;
        this.CS_Manager_Owner__c = CS_Manager_Owner__c;
        this.case__c = case__c;
        this.case__r = case__r;
        this.client_Service_Rep__c = client_Service_Rep__c;
        this.client_Service_Rep__r = client_Service_Rep__r;
        this.comments__c = comments__c;
        this.contact__c = contact__c;
        this.courtesy_and_Professionalism__c = courtesy_and_Professionalism__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.dev_Courtesy_and_Professionalism__c = dev_Courtesy_and_Professionalism__c;
        this.dev_Owner__c = dev_Owner__c;
        this.dev_Product_Knowledge__c = dev_Product_Knowledge__c;
        this.dev_Qlty_of_Problem_Resolution__c = dev_Qlty_of_Problem_Resolution__c;
        this.dev_Technical_Skill__c = dev_Technical_Skill__c;
        this.dev_Understanding_Issue_Business_Impac__c = dev_Understanding_Issue_Business_Impac__c;
        this.did_you_attempt_to_use_Client_Portal__c = did_you_attempt_to_use_Client_Portal__c;
        this.events = events;
        this.excited_for_what_I_learned_about_8__c = excited_for_what_I_learned_about_8__c;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.feedback_Score__c = feedback_Score__c;
        this.format_of_the_Event__c = format_of_the_Event__c;
        this.further_Follow_up_Required__c = further_Follow_up_Required__c;
        this.isDeleted = isDeleted;
        this.issue_that_Caused_Negative_Rating__c = issue_that_Caused_Negative_Rating__c;
        this.KCD_Solution_Documentation__c = KCD_Solution_Documentation__c;
        this.KCD_Solution_Effectiveness__c = KCD_Solution_Effectiveness__c;
        this.KCD_Solution_Use__c = KCD_Solution_Use__c;
        this.keynote_presentation_content_useful__c = keynote_presentation_content_useful__c;
        this.lastActivityDate = lastActivityDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.length_of_Time__c = length_of_Time__c;
        this.length_of_the_Event__c = length_of_the_Event__c;
        this.length_of_time_to_resolve_case__c = length_of_time_to_resolve_case__c;
        this.location_of_the_Venue__c = location_of_the_Venue__c;
        this.mgr_Courtesy_and_Professionalism__c = mgr_Courtesy_and_Professionalism__c;
        this.mgr_Product_Knowledge__c = mgr_Product_Knowledge__c;
        this.mgr_Qlty_of_Problem_Resolution__c = mgr_Qlty_of_Problem_Resolution__c;
        this.mgr_Technical_Skill__c = mgr_Technical_Skill__c;
        this.mgr_Understanding_Issue_Impact__c = mgr_Understanding_Issue_Impact__c;
        this.name = name;
        this.name__c = name__c;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.on_breakout_sessions__c = on_breakout_sessions__c;
        this.on_event_overall__c = on_event_overall__c;
        this.on_keynote_presentation__c = on_keynote_presentation__c;
        this.openActivities = openActivities;
        this.overall_Event__c = overall_Event__c;
        this.overall_Satisfaction__c = overall_Satisfaction__c;
        this.overall_satisfied_with_this_event__c = overall_satisfied_with_this_event__c;
        this.owner = owner;
        this.ownerId = ownerId;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.product_Knowledge__c = product_Knowledge__c;
        this.quality_of_problem_resolution__c = quality_of_problem_resolution__c;
        this.recommend_this_event_to_your_colleagues__c = recommend_this_event_to_your_colleagues__c;
        this.recordType = recordType;
        this.recordTypeId = recordTypeId;
        this.record_Type__c = record_Type__c;
        this.subject__c = subject__c;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
        this.technical_Skill__c = technical_Skill__c;
        this.ticket_Close_Date__c = ticket_Close_Date__c;
        this.ticket_Owner_Role__c = ticket_Owner_Role__c;
        this.ticket_Owner__c = ticket_Owner__c;
        this.tier_1_Courtesy_and_Professionalism__c = tier_1_Courtesy_and_Professionalism__c;
        this.tier_1_Product_Knowledge__c = tier_1_Product_Knowledge__c;
        this.tier_1_Qlty_of_Problem_Resolution__c = tier_1_Qlty_of_Problem_Resolution__c;
        this.tier_1_Rep__c = tier_1_Rep__c;
        this.tier_1_Technical_Skill__c = tier_1_Technical_Skill__c;
        this.tier_1_Understanding_Issue_Impact__c = tier_1_Understanding_Issue_Impact__c;
        this.tier_2_Courtesy_and_Professionalism__c = tier_2_Courtesy_and_Professionalism__c;
        this.tier_2_Product_Knowledge__c = tier_2_Product_Knowledge__c;
        this.tier_2_Qlty_of_Problem_Resolution__c = tier_2_Qlty_of_Problem_Resolution__c;
        this.tier_2_Rep__c = tier_2_Rep__c;
        this.tier_2_Technical_Skill__c = tier_2_Technical_Skill__c;
        this.tier_2_Understanding_Issue_Impact__c = tier_2_Understanding_Issue_Impact__c;
        this.time_to_receive_a_response__c = time_to_receive_a_response__c;
        this.understanding_issue_and_business_impact__c = understanding_issue_and_business_impact__c;
        this.what_could_have_been_done_better__c = what_could_have_been_done_better__c;
        this.would_you_attend_another_similar_event__c = would_you_attend_another_similar_event__c;
    }


    /**
     * Gets the account_Type__c value for this Feedback__c.
     * 
     * @return account_Type__c
     */
    public java.lang.String getAccount_Type__c() {
        return account_Type__c;
    }


    /**
     * Sets the account_Type__c value for this Feedback__c.
     * 
     * @param account_Type__c
     */
    public void setAccount_Type__c(java.lang.String account_Type__c) {
        this.account_Type__c = account_Type__c;
    }


    /**
     * Gets the account__c value for this Feedback__c.
     * 
     * @return account__c
     */
    public java.lang.String getAccount__c() {
        return account__c;
    }


    /**
     * Sets the account__c value for this Feedback__c.
     * 
     * @param account__c
     */
    public void setAccount__c(java.lang.String account__c) {
        this.account__c = account__c;
    }


    /**
     * Gets the activityHistories value for this Feedback__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this Feedback__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the attachments value for this Feedback__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Feedback__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the breakout_session_content_useful__c value for this Feedback__c.
     * 
     * @return breakout_session_content_useful__c
     */
    public java.lang.Double getBreakout_session_content_useful__c() {
        return breakout_session_content_useful__c;
    }


    /**
     * Sets the breakout_session_content_useful__c value for this Feedback__c.
     * 
     * @param breakout_session_content_useful__c
     */
    public void setBreakout_session_content_useful__c(java.lang.Double breakout_session_content_useful__c) {
        this.breakout_session_content_useful__c = breakout_session_content_useful__c;
    }


    /**
     * Gets the CS_Manager_Owner__c value for this Feedback__c.
     * 
     * @return CS_Manager_Owner__c
     */
    public java.lang.String getCS_Manager_Owner__c() {
        return CS_Manager_Owner__c;
    }


    /**
     * Sets the CS_Manager_Owner__c value for this Feedback__c.
     * 
     * @param CS_Manager_Owner__c
     */
    public void setCS_Manager_Owner__c(java.lang.String CS_Manager_Owner__c) {
        this.CS_Manager_Owner__c = CS_Manager_Owner__c;
    }


    /**
     * Gets the case__c value for this Feedback__c.
     * 
     * @return case__c
     */
    public java.lang.String getCase__c() {
        return case__c;
    }


    /**
     * Sets the case__c value for this Feedback__c.
     * 
     * @param case__c
     */
    public void setCase__c(java.lang.String case__c) {
        this.case__c = case__c;
    }


    /**
     * Gets the case__r value for this Feedback__c.
     * 
     * @return case__r
     */
    public com.sforce.soap.enterprise.sobject._case getCase__r() {
        return case__r;
    }


    /**
     * Sets the case__r value for this Feedback__c.
     * 
     * @param case__r
     */
    public void setCase__r(com.sforce.soap.enterprise.sobject._case case__r) {
        this.case__r = case__r;
    }


    /**
     * Gets the client_Service_Rep__c value for this Feedback__c.
     * 
     * @return client_Service_Rep__c
     */
    public java.lang.String getClient_Service_Rep__c() {
        return client_Service_Rep__c;
    }


    /**
     * Sets the client_Service_Rep__c value for this Feedback__c.
     * 
     * @param client_Service_Rep__c
     */
    public void setClient_Service_Rep__c(java.lang.String client_Service_Rep__c) {
        this.client_Service_Rep__c = client_Service_Rep__c;
    }


    /**
     * Gets the client_Service_Rep__r value for this Feedback__c.
     * 
     * @return client_Service_Rep__r
     */
    public com.sforce.soap.enterprise.sobject.User getClient_Service_Rep__r() {
        return client_Service_Rep__r;
    }


    /**
     * Sets the client_Service_Rep__r value for this Feedback__c.
     * 
     * @param client_Service_Rep__r
     */
    public void setClient_Service_Rep__r(com.sforce.soap.enterprise.sobject.User client_Service_Rep__r) {
        this.client_Service_Rep__r = client_Service_Rep__r;
    }


    /**
     * Gets the comments__c value for this Feedback__c.
     * 
     * @return comments__c
     */
    public java.lang.String getComments__c() {
        return comments__c;
    }


    /**
     * Sets the comments__c value for this Feedback__c.
     * 
     * @param comments__c
     */
    public void setComments__c(java.lang.String comments__c) {
        this.comments__c = comments__c;
    }


    /**
     * Gets the contact__c value for this Feedback__c.
     * 
     * @return contact__c
     */
    public java.lang.String getContact__c() {
        return contact__c;
    }


    /**
     * Sets the contact__c value for this Feedback__c.
     * 
     * @param contact__c
     */
    public void setContact__c(java.lang.String contact__c) {
        this.contact__c = contact__c;
    }


    /**
     * Gets the courtesy_and_Professionalism__c value for this Feedback__c.
     * 
     * @return courtesy_and_Professionalism__c
     */
    public java.lang.Double getCourtesy_and_Professionalism__c() {
        return courtesy_and_Professionalism__c;
    }


    /**
     * Sets the courtesy_and_Professionalism__c value for this Feedback__c.
     * 
     * @param courtesy_and_Professionalism__c
     */
    public void setCourtesy_and_Professionalism__c(java.lang.Double courtesy_and_Professionalism__c) {
        this.courtesy_and_Professionalism__c = courtesy_and_Professionalism__c;
    }


    /**
     * Gets the createdBy value for this Feedback__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Feedback__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Feedback__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Feedback__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Feedback__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Feedback__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the dev_Courtesy_and_Professionalism__c value for this Feedback__c.
     * 
     * @return dev_Courtesy_and_Professionalism__c
     */
    public java.lang.Double getDev_Courtesy_and_Professionalism__c() {
        return dev_Courtesy_and_Professionalism__c;
    }


    /**
     * Sets the dev_Courtesy_and_Professionalism__c value for this Feedback__c.
     * 
     * @param dev_Courtesy_and_Professionalism__c
     */
    public void setDev_Courtesy_and_Professionalism__c(java.lang.Double dev_Courtesy_and_Professionalism__c) {
        this.dev_Courtesy_and_Professionalism__c = dev_Courtesy_and_Professionalism__c;
    }


    /**
     * Gets the dev_Owner__c value for this Feedback__c.
     * 
     * @return dev_Owner__c
     */
    public java.lang.String getDev_Owner__c() {
        return dev_Owner__c;
    }


    /**
     * Sets the dev_Owner__c value for this Feedback__c.
     * 
     * @param dev_Owner__c
     */
    public void setDev_Owner__c(java.lang.String dev_Owner__c) {
        this.dev_Owner__c = dev_Owner__c;
    }


    /**
     * Gets the dev_Product_Knowledge__c value for this Feedback__c.
     * 
     * @return dev_Product_Knowledge__c
     */
    public java.lang.Double getDev_Product_Knowledge__c() {
        return dev_Product_Knowledge__c;
    }


    /**
     * Sets the dev_Product_Knowledge__c value for this Feedback__c.
     * 
     * @param dev_Product_Knowledge__c
     */
    public void setDev_Product_Knowledge__c(java.lang.Double dev_Product_Knowledge__c) {
        this.dev_Product_Knowledge__c = dev_Product_Knowledge__c;
    }


    /**
     * Gets the dev_Qlty_of_Problem_Resolution__c value for this Feedback__c.
     * 
     * @return dev_Qlty_of_Problem_Resolution__c
     */
    public java.lang.Double getDev_Qlty_of_Problem_Resolution__c() {
        return dev_Qlty_of_Problem_Resolution__c;
    }


    /**
     * Sets the dev_Qlty_of_Problem_Resolution__c value for this Feedback__c.
     * 
     * @param dev_Qlty_of_Problem_Resolution__c
     */
    public void setDev_Qlty_of_Problem_Resolution__c(java.lang.Double dev_Qlty_of_Problem_Resolution__c) {
        this.dev_Qlty_of_Problem_Resolution__c = dev_Qlty_of_Problem_Resolution__c;
    }


    /**
     * Gets the dev_Technical_Skill__c value for this Feedback__c.
     * 
     * @return dev_Technical_Skill__c
     */
    public java.lang.Double getDev_Technical_Skill__c() {
        return dev_Technical_Skill__c;
    }


    /**
     * Sets the dev_Technical_Skill__c value for this Feedback__c.
     * 
     * @param dev_Technical_Skill__c
     */
    public void setDev_Technical_Skill__c(java.lang.Double dev_Technical_Skill__c) {
        this.dev_Technical_Skill__c = dev_Technical_Skill__c;
    }


    /**
     * Gets the dev_Understanding_Issue_Business_Impac__c value for this Feedback__c.
     * 
     * @return dev_Understanding_Issue_Business_Impac__c
     */
    public java.lang.Double getDev_Understanding_Issue_Business_Impac__c() {
        return dev_Understanding_Issue_Business_Impac__c;
    }


    /**
     * Sets the dev_Understanding_Issue_Business_Impac__c value for this Feedback__c.
     * 
     * @param dev_Understanding_Issue_Business_Impac__c
     */
    public void setDev_Understanding_Issue_Business_Impac__c(java.lang.Double dev_Understanding_Issue_Business_Impac__c) {
        this.dev_Understanding_Issue_Business_Impac__c = dev_Understanding_Issue_Business_Impac__c;
    }


    /**
     * Gets the did_you_attempt_to_use_Client_Portal__c value for this Feedback__c.
     * 
     * @return did_you_attempt_to_use_Client_Portal__c
     */
    public java.lang.String getDid_you_attempt_to_use_Client_Portal__c() {
        return did_you_attempt_to_use_Client_Portal__c;
    }


    /**
     * Sets the did_you_attempt_to_use_Client_Portal__c value for this Feedback__c.
     * 
     * @param did_you_attempt_to_use_Client_Portal__c
     */
    public void setDid_you_attempt_to_use_Client_Portal__c(java.lang.String did_you_attempt_to_use_Client_Portal__c) {
        this.did_you_attempt_to_use_Client_Portal__c = did_you_attempt_to_use_Client_Portal__c;
    }


    /**
     * Gets the events value for this Feedback__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Feedback__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the excited_for_what_I_learned_about_8__c value for this Feedback__c.
     * 
     * @return excited_for_what_I_learned_about_8__c
     */
    public java.lang.Double getExcited_for_what_I_learned_about_8__c() {
        return excited_for_what_I_learned_about_8__c;
    }


    /**
     * Sets the excited_for_what_I_learned_about_8__c value for this Feedback__c.
     * 
     * @param excited_for_what_I_learned_about_8__c
     */
    public void setExcited_for_what_I_learned_about_8__c(java.lang.Double excited_for_what_I_learned_about_8__c) {
        this.excited_for_what_I_learned_about_8__c = excited_for_what_I_learned_about_8__c;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Feedback__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Feedback__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the feedback_Score__c value for this Feedback__c.
     * 
     * @return feedback_Score__c
     */
    public java.lang.Double getFeedback_Score__c() {
        return feedback_Score__c;
    }


    /**
     * Sets the feedback_Score__c value for this Feedback__c.
     * 
     * @param feedback_Score__c
     */
    public void setFeedback_Score__c(java.lang.Double feedback_Score__c) {
        this.feedback_Score__c = feedback_Score__c;
    }


    /**
     * Gets the format_of_the_Event__c value for this Feedback__c.
     * 
     * @return format_of_the_Event__c
     */
    public java.lang.Double getFormat_of_the_Event__c() {
        return format_of_the_Event__c;
    }


    /**
     * Sets the format_of_the_Event__c value for this Feedback__c.
     * 
     * @param format_of_the_Event__c
     */
    public void setFormat_of_the_Event__c(java.lang.Double format_of_the_Event__c) {
        this.format_of_the_Event__c = format_of_the_Event__c;
    }


    /**
     * Gets the further_Follow_up_Required__c value for this Feedback__c.
     * 
     * @return further_Follow_up_Required__c
     */
    public java.lang.String getFurther_Follow_up_Required__c() {
        return further_Follow_up_Required__c;
    }


    /**
     * Sets the further_Follow_up_Required__c value for this Feedback__c.
     * 
     * @param further_Follow_up_Required__c
     */
    public void setFurther_Follow_up_Required__c(java.lang.String further_Follow_up_Required__c) {
        this.further_Follow_up_Required__c = further_Follow_up_Required__c;
    }


    /**
     * Gets the isDeleted value for this Feedback__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Feedback__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the issue_that_Caused_Negative_Rating__c value for this Feedback__c.
     * 
     * @return issue_that_Caused_Negative_Rating__c
     */
    public java.lang.String getIssue_that_Caused_Negative_Rating__c() {
        return issue_that_Caused_Negative_Rating__c;
    }


    /**
     * Sets the issue_that_Caused_Negative_Rating__c value for this Feedback__c.
     * 
     * @param issue_that_Caused_Negative_Rating__c
     */
    public void setIssue_that_Caused_Negative_Rating__c(java.lang.String issue_that_Caused_Negative_Rating__c) {
        this.issue_that_Caused_Negative_Rating__c = issue_that_Caused_Negative_Rating__c;
    }


    /**
     * Gets the KCD_Solution_Documentation__c value for this Feedback__c.
     * 
     * @return KCD_Solution_Documentation__c
     */
    public java.lang.Double getKCD_Solution_Documentation__c() {
        return KCD_Solution_Documentation__c;
    }


    /**
     * Sets the KCD_Solution_Documentation__c value for this Feedback__c.
     * 
     * @param KCD_Solution_Documentation__c
     */
    public void setKCD_Solution_Documentation__c(java.lang.Double KCD_Solution_Documentation__c) {
        this.KCD_Solution_Documentation__c = KCD_Solution_Documentation__c;
    }


    /**
     * Gets the KCD_Solution_Effectiveness__c value for this Feedback__c.
     * 
     * @return KCD_Solution_Effectiveness__c
     */
    public java.lang.Double getKCD_Solution_Effectiveness__c() {
        return KCD_Solution_Effectiveness__c;
    }


    /**
     * Sets the KCD_Solution_Effectiveness__c value for this Feedback__c.
     * 
     * @param KCD_Solution_Effectiveness__c
     */
    public void setKCD_Solution_Effectiveness__c(java.lang.Double KCD_Solution_Effectiveness__c) {
        this.KCD_Solution_Effectiveness__c = KCD_Solution_Effectiveness__c;
    }


    /**
     * Gets the KCD_Solution_Use__c value for this Feedback__c.
     * 
     * @return KCD_Solution_Use__c
     */
    public java.lang.Double getKCD_Solution_Use__c() {
        return KCD_Solution_Use__c;
    }


    /**
     * Sets the KCD_Solution_Use__c value for this Feedback__c.
     * 
     * @param KCD_Solution_Use__c
     */
    public void setKCD_Solution_Use__c(java.lang.Double KCD_Solution_Use__c) {
        this.KCD_Solution_Use__c = KCD_Solution_Use__c;
    }


    /**
     * Gets the keynote_presentation_content_useful__c value for this Feedback__c.
     * 
     * @return keynote_presentation_content_useful__c
     */
    public java.lang.Double getKeynote_presentation_content_useful__c() {
        return keynote_presentation_content_useful__c;
    }


    /**
     * Sets the keynote_presentation_content_useful__c value for this Feedback__c.
     * 
     * @param keynote_presentation_content_useful__c
     */
    public void setKeynote_presentation_content_useful__c(java.lang.Double keynote_presentation_content_useful__c) {
        this.keynote_presentation_content_useful__c = keynote_presentation_content_useful__c;
    }


    /**
     * Gets the lastActivityDate value for this Feedback__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Feedback__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this Feedback__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Feedback__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Feedback__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Feedback__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Feedback__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Feedback__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the length_of_Time__c value for this Feedback__c.
     * 
     * @return length_of_Time__c
     */
    public java.lang.String getLength_of_Time__c() {
        return length_of_Time__c;
    }


    /**
     * Sets the length_of_Time__c value for this Feedback__c.
     * 
     * @param length_of_Time__c
     */
    public void setLength_of_Time__c(java.lang.String length_of_Time__c) {
        this.length_of_Time__c = length_of_Time__c;
    }


    /**
     * Gets the length_of_the_Event__c value for this Feedback__c.
     * 
     * @return length_of_the_Event__c
     */
    public java.lang.Double getLength_of_the_Event__c() {
        return length_of_the_Event__c;
    }


    /**
     * Sets the length_of_the_Event__c value for this Feedback__c.
     * 
     * @param length_of_the_Event__c
     */
    public void setLength_of_the_Event__c(java.lang.Double length_of_the_Event__c) {
        this.length_of_the_Event__c = length_of_the_Event__c;
    }


    /**
     * Gets the length_of_time_to_resolve_case__c value for this Feedback__c.
     * 
     * @return length_of_time_to_resolve_case__c
     */
    public java.lang.String getLength_of_time_to_resolve_case__c() {
        return length_of_time_to_resolve_case__c;
    }


    /**
     * Sets the length_of_time_to_resolve_case__c value for this Feedback__c.
     * 
     * @param length_of_time_to_resolve_case__c
     */
    public void setLength_of_time_to_resolve_case__c(java.lang.String length_of_time_to_resolve_case__c) {
        this.length_of_time_to_resolve_case__c = length_of_time_to_resolve_case__c;
    }


    /**
     * Gets the location_of_the_Venue__c value for this Feedback__c.
     * 
     * @return location_of_the_Venue__c
     */
    public java.lang.Double getLocation_of_the_Venue__c() {
        return location_of_the_Venue__c;
    }


    /**
     * Sets the location_of_the_Venue__c value for this Feedback__c.
     * 
     * @param location_of_the_Venue__c
     */
    public void setLocation_of_the_Venue__c(java.lang.Double location_of_the_Venue__c) {
        this.location_of_the_Venue__c = location_of_the_Venue__c;
    }


    /**
     * Gets the mgr_Courtesy_and_Professionalism__c value for this Feedback__c.
     * 
     * @return mgr_Courtesy_and_Professionalism__c
     */
    public java.lang.Double getMgr_Courtesy_and_Professionalism__c() {
        return mgr_Courtesy_and_Professionalism__c;
    }


    /**
     * Sets the mgr_Courtesy_and_Professionalism__c value for this Feedback__c.
     * 
     * @param mgr_Courtesy_and_Professionalism__c
     */
    public void setMgr_Courtesy_and_Professionalism__c(java.lang.Double mgr_Courtesy_and_Professionalism__c) {
        this.mgr_Courtesy_and_Professionalism__c = mgr_Courtesy_and_Professionalism__c;
    }


    /**
     * Gets the mgr_Product_Knowledge__c value for this Feedback__c.
     * 
     * @return mgr_Product_Knowledge__c
     */
    public java.lang.Double getMgr_Product_Knowledge__c() {
        return mgr_Product_Knowledge__c;
    }


    /**
     * Sets the mgr_Product_Knowledge__c value for this Feedback__c.
     * 
     * @param mgr_Product_Knowledge__c
     */
    public void setMgr_Product_Knowledge__c(java.lang.Double mgr_Product_Knowledge__c) {
        this.mgr_Product_Knowledge__c = mgr_Product_Knowledge__c;
    }


    /**
     * Gets the mgr_Qlty_of_Problem_Resolution__c value for this Feedback__c.
     * 
     * @return mgr_Qlty_of_Problem_Resolution__c
     */
    public java.lang.Double getMgr_Qlty_of_Problem_Resolution__c() {
        return mgr_Qlty_of_Problem_Resolution__c;
    }


    /**
     * Sets the mgr_Qlty_of_Problem_Resolution__c value for this Feedback__c.
     * 
     * @param mgr_Qlty_of_Problem_Resolution__c
     */
    public void setMgr_Qlty_of_Problem_Resolution__c(java.lang.Double mgr_Qlty_of_Problem_Resolution__c) {
        this.mgr_Qlty_of_Problem_Resolution__c = mgr_Qlty_of_Problem_Resolution__c;
    }


    /**
     * Gets the mgr_Technical_Skill__c value for this Feedback__c.
     * 
     * @return mgr_Technical_Skill__c
     */
    public java.lang.Double getMgr_Technical_Skill__c() {
        return mgr_Technical_Skill__c;
    }


    /**
     * Sets the mgr_Technical_Skill__c value for this Feedback__c.
     * 
     * @param mgr_Technical_Skill__c
     */
    public void setMgr_Technical_Skill__c(java.lang.Double mgr_Technical_Skill__c) {
        this.mgr_Technical_Skill__c = mgr_Technical_Skill__c;
    }


    /**
     * Gets the mgr_Understanding_Issue_Impact__c value for this Feedback__c.
     * 
     * @return mgr_Understanding_Issue_Impact__c
     */
    public java.lang.Double getMgr_Understanding_Issue_Impact__c() {
        return mgr_Understanding_Issue_Impact__c;
    }


    /**
     * Sets the mgr_Understanding_Issue_Impact__c value for this Feedback__c.
     * 
     * @param mgr_Understanding_Issue_Impact__c
     */
    public void setMgr_Understanding_Issue_Impact__c(java.lang.Double mgr_Understanding_Issue_Impact__c) {
        this.mgr_Understanding_Issue_Impact__c = mgr_Understanding_Issue_Impact__c;
    }


    /**
     * Gets the name value for this Feedback__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Feedback__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the name__c value for this Feedback__c.
     * 
     * @return name__c
     */
    public java.lang.String getName__c() {
        return name__c;
    }


    /**
     * Sets the name__c value for this Feedback__c.
     * 
     * @param name__c
     */
    public void setName__c(java.lang.String name__c) {
        this.name__c = name__c;
    }


    /**
     * Gets the notes value for this Feedback__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Feedback__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Feedback__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Feedback__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the on_breakout_sessions__c value for this Feedback__c.
     * 
     * @return on_breakout_sessions__c
     */
    public java.lang.String getOn_breakout_sessions__c() {
        return on_breakout_sessions__c;
    }


    /**
     * Sets the on_breakout_sessions__c value for this Feedback__c.
     * 
     * @param on_breakout_sessions__c
     */
    public void setOn_breakout_sessions__c(java.lang.String on_breakout_sessions__c) {
        this.on_breakout_sessions__c = on_breakout_sessions__c;
    }


    /**
     * Gets the on_event_overall__c value for this Feedback__c.
     * 
     * @return on_event_overall__c
     */
    public java.lang.String getOn_event_overall__c() {
        return on_event_overall__c;
    }


    /**
     * Sets the on_event_overall__c value for this Feedback__c.
     * 
     * @param on_event_overall__c
     */
    public void setOn_event_overall__c(java.lang.String on_event_overall__c) {
        this.on_event_overall__c = on_event_overall__c;
    }


    /**
     * Gets the on_keynote_presentation__c value for this Feedback__c.
     * 
     * @return on_keynote_presentation__c
     */
    public java.lang.String getOn_keynote_presentation__c() {
        return on_keynote_presentation__c;
    }


    /**
     * Sets the on_keynote_presentation__c value for this Feedback__c.
     * 
     * @param on_keynote_presentation__c
     */
    public void setOn_keynote_presentation__c(java.lang.String on_keynote_presentation__c) {
        this.on_keynote_presentation__c = on_keynote_presentation__c;
    }


    /**
     * Gets the openActivities value for this Feedback__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this Feedback__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the overall_Event__c value for this Feedback__c.
     * 
     * @return overall_Event__c
     */
    public java.lang.Double getOverall_Event__c() {
        return overall_Event__c;
    }


    /**
     * Sets the overall_Event__c value for this Feedback__c.
     * 
     * @param overall_Event__c
     */
    public void setOverall_Event__c(java.lang.Double overall_Event__c) {
        this.overall_Event__c = overall_Event__c;
    }


    /**
     * Gets the overall_Satisfaction__c value for this Feedback__c.
     * 
     * @return overall_Satisfaction__c
     */
    public java.lang.String getOverall_Satisfaction__c() {
        return overall_Satisfaction__c;
    }


    /**
     * Sets the overall_Satisfaction__c value for this Feedback__c.
     * 
     * @param overall_Satisfaction__c
     */
    public void setOverall_Satisfaction__c(java.lang.String overall_Satisfaction__c) {
        this.overall_Satisfaction__c = overall_Satisfaction__c;
    }


    /**
     * Gets the overall_satisfied_with_this_event__c value for this Feedback__c.
     * 
     * @return overall_satisfied_with_this_event__c
     */
    public java.lang.String getOverall_satisfied_with_this_event__c() {
        return overall_satisfied_with_this_event__c;
    }


    /**
     * Sets the overall_satisfied_with_this_event__c value for this Feedback__c.
     * 
     * @param overall_satisfied_with_this_event__c
     */
    public void setOverall_satisfied_with_this_event__c(java.lang.String overall_satisfied_with_this_event__c) {
        this.overall_satisfied_with_this_event__c = overall_satisfied_with_this_event__c;
    }


    /**
     * Gets the owner value for this Feedback__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Feedback__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Feedback__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Feedback__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this Feedback__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Feedback__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Feedback__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Feedback__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the product_Knowledge__c value for this Feedback__c.
     * 
     * @return product_Knowledge__c
     */
    public java.lang.Double getProduct_Knowledge__c() {
        return product_Knowledge__c;
    }


    /**
     * Sets the product_Knowledge__c value for this Feedback__c.
     * 
     * @param product_Knowledge__c
     */
    public void setProduct_Knowledge__c(java.lang.Double product_Knowledge__c) {
        this.product_Knowledge__c = product_Knowledge__c;
    }


    /**
     * Gets the quality_of_problem_resolution__c value for this Feedback__c.
     * 
     * @return quality_of_problem_resolution__c
     */
    public java.lang.Double getQuality_of_problem_resolution__c() {
        return quality_of_problem_resolution__c;
    }


    /**
     * Sets the quality_of_problem_resolution__c value for this Feedback__c.
     * 
     * @param quality_of_problem_resolution__c
     */
    public void setQuality_of_problem_resolution__c(java.lang.Double quality_of_problem_resolution__c) {
        this.quality_of_problem_resolution__c = quality_of_problem_resolution__c;
    }


    /**
     * Gets the recommend_this_event_to_your_colleagues__c value for this Feedback__c.
     * 
     * @return recommend_this_event_to_your_colleagues__c
     */
    public java.lang.String getRecommend_this_event_to_your_colleagues__c() {
        return recommend_this_event_to_your_colleagues__c;
    }


    /**
     * Sets the recommend_this_event_to_your_colleagues__c value for this Feedback__c.
     * 
     * @param recommend_this_event_to_your_colleagues__c
     */
    public void setRecommend_this_event_to_your_colleagues__c(java.lang.String recommend_this_event_to_your_colleagues__c) {
        this.recommend_this_event_to_your_colleagues__c = recommend_this_event_to_your_colleagues__c;
    }


    /**
     * Gets the recordType value for this Feedback__c.
     * 
     * @return recordType
     */
    public com.sforce.soap.enterprise.sobject.RecordType getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this Feedback__c.
     * 
     * @param recordType
     */
    public void setRecordType(com.sforce.soap.enterprise.sobject.RecordType recordType) {
        this.recordType = recordType;
    }


    /**
     * Gets the recordTypeId value for this Feedback__c.
     * 
     * @return recordTypeId
     */
    public java.lang.String getRecordTypeId() {
        return recordTypeId;
    }


    /**
     * Sets the recordTypeId value for this Feedback__c.
     * 
     * @param recordTypeId
     */
    public void setRecordTypeId(java.lang.String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }


    /**
     * Gets the record_Type__c value for this Feedback__c.
     * 
     * @return record_Type__c
     */
    public java.lang.String getRecord_Type__c() {
        return record_Type__c;
    }


    /**
     * Sets the record_Type__c value for this Feedback__c.
     * 
     * @param record_Type__c
     */
    public void setRecord_Type__c(java.lang.String record_Type__c) {
        this.record_Type__c = record_Type__c;
    }


    /**
     * Gets the subject__c value for this Feedback__c.
     * 
     * @return subject__c
     */
    public java.lang.String getSubject__c() {
        return subject__c;
    }


    /**
     * Sets the subject__c value for this Feedback__c.
     * 
     * @param subject__c
     */
    public void setSubject__c(java.lang.String subject__c) {
        this.subject__c = subject__c;
    }


    /**
     * Gets the systemModstamp value for this Feedback__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Feedback__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this Feedback__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Feedback__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the technical_Skill__c value for this Feedback__c.
     * 
     * @return technical_Skill__c
     */
    public java.lang.Double getTechnical_Skill__c() {
        return technical_Skill__c;
    }


    /**
     * Sets the technical_Skill__c value for this Feedback__c.
     * 
     * @param technical_Skill__c
     */
    public void setTechnical_Skill__c(java.lang.Double technical_Skill__c) {
        this.technical_Skill__c = technical_Skill__c;
    }


    /**
     * Gets the ticket_Close_Date__c value for this Feedback__c.
     * 
     * @return ticket_Close_Date__c
     */
    public java.util.Calendar getTicket_Close_Date__c() {
        return ticket_Close_Date__c;
    }


    /**
     * Sets the ticket_Close_Date__c value for this Feedback__c.
     * 
     * @param ticket_Close_Date__c
     */
    public void setTicket_Close_Date__c(java.util.Calendar ticket_Close_Date__c) {
        this.ticket_Close_Date__c = ticket_Close_Date__c;
    }


    /**
     * Gets the ticket_Owner_Role__c value for this Feedback__c.
     * 
     * @return ticket_Owner_Role__c
     */
    public java.lang.String getTicket_Owner_Role__c() {
        return ticket_Owner_Role__c;
    }


    /**
     * Sets the ticket_Owner_Role__c value for this Feedback__c.
     * 
     * @param ticket_Owner_Role__c
     */
    public void setTicket_Owner_Role__c(java.lang.String ticket_Owner_Role__c) {
        this.ticket_Owner_Role__c = ticket_Owner_Role__c;
    }


    /**
     * Gets the ticket_Owner__c value for this Feedback__c.
     * 
     * @return ticket_Owner__c
     */
    public java.lang.String getTicket_Owner__c() {
        return ticket_Owner__c;
    }


    /**
     * Sets the ticket_Owner__c value for this Feedback__c.
     * 
     * @param ticket_Owner__c
     */
    public void setTicket_Owner__c(java.lang.String ticket_Owner__c) {
        this.ticket_Owner__c = ticket_Owner__c;
    }


    /**
     * Gets the tier_1_Courtesy_and_Professionalism__c value for this Feedback__c.
     * 
     * @return tier_1_Courtesy_and_Professionalism__c
     */
    public java.lang.Double getTier_1_Courtesy_and_Professionalism__c() {
        return tier_1_Courtesy_and_Professionalism__c;
    }


    /**
     * Sets the tier_1_Courtesy_and_Professionalism__c value for this Feedback__c.
     * 
     * @param tier_1_Courtesy_and_Professionalism__c
     */
    public void setTier_1_Courtesy_and_Professionalism__c(java.lang.Double tier_1_Courtesy_and_Professionalism__c) {
        this.tier_1_Courtesy_and_Professionalism__c = tier_1_Courtesy_and_Professionalism__c;
    }


    /**
     * Gets the tier_1_Product_Knowledge__c value for this Feedback__c.
     * 
     * @return tier_1_Product_Knowledge__c
     */
    public java.lang.Double getTier_1_Product_Knowledge__c() {
        return tier_1_Product_Knowledge__c;
    }


    /**
     * Sets the tier_1_Product_Knowledge__c value for this Feedback__c.
     * 
     * @param tier_1_Product_Knowledge__c
     */
    public void setTier_1_Product_Knowledge__c(java.lang.Double tier_1_Product_Knowledge__c) {
        this.tier_1_Product_Knowledge__c = tier_1_Product_Knowledge__c;
    }


    /**
     * Gets the tier_1_Qlty_of_Problem_Resolution__c value for this Feedback__c.
     * 
     * @return tier_1_Qlty_of_Problem_Resolution__c
     */
    public java.lang.Double getTier_1_Qlty_of_Problem_Resolution__c() {
        return tier_1_Qlty_of_Problem_Resolution__c;
    }


    /**
     * Sets the tier_1_Qlty_of_Problem_Resolution__c value for this Feedback__c.
     * 
     * @param tier_1_Qlty_of_Problem_Resolution__c
     */
    public void setTier_1_Qlty_of_Problem_Resolution__c(java.lang.Double tier_1_Qlty_of_Problem_Resolution__c) {
        this.tier_1_Qlty_of_Problem_Resolution__c = tier_1_Qlty_of_Problem_Resolution__c;
    }


    /**
     * Gets the tier_1_Rep__c value for this Feedback__c.
     * 
     * @return tier_1_Rep__c
     */
    public java.lang.String getTier_1_Rep__c() {
        return tier_1_Rep__c;
    }


    /**
     * Sets the tier_1_Rep__c value for this Feedback__c.
     * 
     * @param tier_1_Rep__c
     */
    public void setTier_1_Rep__c(java.lang.String tier_1_Rep__c) {
        this.tier_1_Rep__c = tier_1_Rep__c;
    }


    /**
     * Gets the tier_1_Technical_Skill__c value for this Feedback__c.
     * 
     * @return tier_1_Technical_Skill__c
     */
    public java.lang.Double getTier_1_Technical_Skill__c() {
        return tier_1_Technical_Skill__c;
    }


    /**
     * Sets the tier_1_Technical_Skill__c value for this Feedback__c.
     * 
     * @param tier_1_Technical_Skill__c
     */
    public void setTier_1_Technical_Skill__c(java.lang.Double tier_1_Technical_Skill__c) {
        this.tier_1_Technical_Skill__c = tier_1_Technical_Skill__c;
    }


    /**
     * Gets the tier_1_Understanding_Issue_Impact__c value for this Feedback__c.
     * 
     * @return tier_1_Understanding_Issue_Impact__c
     */
    public java.lang.Double getTier_1_Understanding_Issue_Impact__c() {
        return tier_1_Understanding_Issue_Impact__c;
    }


    /**
     * Sets the tier_1_Understanding_Issue_Impact__c value for this Feedback__c.
     * 
     * @param tier_1_Understanding_Issue_Impact__c
     */
    public void setTier_1_Understanding_Issue_Impact__c(java.lang.Double tier_1_Understanding_Issue_Impact__c) {
        this.tier_1_Understanding_Issue_Impact__c = tier_1_Understanding_Issue_Impact__c;
    }


    /**
     * Gets the tier_2_Courtesy_and_Professionalism__c value for this Feedback__c.
     * 
     * @return tier_2_Courtesy_and_Professionalism__c
     */
    public java.lang.Double getTier_2_Courtesy_and_Professionalism__c() {
        return tier_2_Courtesy_and_Professionalism__c;
    }


    /**
     * Sets the tier_2_Courtesy_and_Professionalism__c value for this Feedback__c.
     * 
     * @param tier_2_Courtesy_and_Professionalism__c
     */
    public void setTier_2_Courtesy_and_Professionalism__c(java.lang.Double tier_2_Courtesy_and_Professionalism__c) {
        this.tier_2_Courtesy_and_Professionalism__c = tier_2_Courtesy_and_Professionalism__c;
    }


    /**
     * Gets the tier_2_Product_Knowledge__c value for this Feedback__c.
     * 
     * @return tier_2_Product_Knowledge__c
     */
    public java.lang.Double getTier_2_Product_Knowledge__c() {
        return tier_2_Product_Knowledge__c;
    }


    /**
     * Sets the tier_2_Product_Knowledge__c value for this Feedback__c.
     * 
     * @param tier_2_Product_Knowledge__c
     */
    public void setTier_2_Product_Knowledge__c(java.lang.Double tier_2_Product_Knowledge__c) {
        this.tier_2_Product_Knowledge__c = tier_2_Product_Knowledge__c;
    }


    /**
     * Gets the tier_2_Qlty_of_Problem_Resolution__c value for this Feedback__c.
     * 
     * @return tier_2_Qlty_of_Problem_Resolution__c
     */
    public java.lang.Double getTier_2_Qlty_of_Problem_Resolution__c() {
        return tier_2_Qlty_of_Problem_Resolution__c;
    }


    /**
     * Sets the tier_2_Qlty_of_Problem_Resolution__c value for this Feedback__c.
     * 
     * @param tier_2_Qlty_of_Problem_Resolution__c
     */
    public void setTier_2_Qlty_of_Problem_Resolution__c(java.lang.Double tier_2_Qlty_of_Problem_Resolution__c) {
        this.tier_2_Qlty_of_Problem_Resolution__c = tier_2_Qlty_of_Problem_Resolution__c;
    }


    /**
     * Gets the tier_2_Rep__c value for this Feedback__c.
     * 
     * @return tier_2_Rep__c
     */
    public java.lang.String getTier_2_Rep__c() {
        return tier_2_Rep__c;
    }


    /**
     * Sets the tier_2_Rep__c value for this Feedback__c.
     * 
     * @param tier_2_Rep__c
     */
    public void setTier_2_Rep__c(java.lang.String tier_2_Rep__c) {
        this.tier_2_Rep__c = tier_2_Rep__c;
    }


    /**
     * Gets the tier_2_Technical_Skill__c value for this Feedback__c.
     * 
     * @return tier_2_Technical_Skill__c
     */
    public java.lang.Double getTier_2_Technical_Skill__c() {
        return tier_2_Technical_Skill__c;
    }


    /**
     * Sets the tier_2_Technical_Skill__c value for this Feedback__c.
     * 
     * @param tier_2_Technical_Skill__c
     */
    public void setTier_2_Technical_Skill__c(java.lang.Double tier_2_Technical_Skill__c) {
        this.tier_2_Technical_Skill__c = tier_2_Technical_Skill__c;
    }


    /**
     * Gets the tier_2_Understanding_Issue_Impact__c value for this Feedback__c.
     * 
     * @return tier_2_Understanding_Issue_Impact__c
     */
    public java.lang.Double getTier_2_Understanding_Issue_Impact__c() {
        return tier_2_Understanding_Issue_Impact__c;
    }


    /**
     * Sets the tier_2_Understanding_Issue_Impact__c value for this Feedback__c.
     * 
     * @param tier_2_Understanding_Issue_Impact__c
     */
    public void setTier_2_Understanding_Issue_Impact__c(java.lang.Double tier_2_Understanding_Issue_Impact__c) {
        this.tier_2_Understanding_Issue_Impact__c = tier_2_Understanding_Issue_Impact__c;
    }


    /**
     * Gets the time_to_receive_a_response__c value for this Feedback__c.
     * 
     * @return time_to_receive_a_response__c
     */
    public java.lang.Double getTime_to_receive_a_response__c() {
        return time_to_receive_a_response__c;
    }


    /**
     * Sets the time_to_receive_a_response__c value for this Feedback__c.
     * 
     * @param time_to_receive_a_response__c
     */
    public void setTime_to_receive_a_response__c(java.lang.Double time_to_receive_a_response__c) {
        this.time_to_receive_a_response__c = time_to_receive_a_response__c;
    }


    /**
     * Gets the understanding_issue_and_business_impact__c value for this Feedback__c.
     * 
     * @return understanding_issue_and_business_impact__c
     */
    public java.lang.Double getUnderstanding_issue_and_business_impact__c() {
        return understanding_issue_and_business_impact__c;
    }


    /**
     * Sets the understanding_issue_and_business_impact__c value for this Feedback__c.
     * 
     * @param understanding_issue_and_business_impact__c
     */
    public void setUnderstanding_issue_and_business_impact__c(java.lang.Double understanding_issue_and_business_impact__c) {
        this.understanding_issue_and_business_impact__c = understanding_issue_and_business_impact__c;
    }


    /**
     * Gets the what_could_have_been_done_better__c value for this Feedback__c.
     * 
     * @return what_could_have_been_done_better__c
     */
    public java.lang.String getWhat_could_have_been_done_better__c() {
        return what_could_have_been_done_better__c;
    }


    /**
     * Sets the what_could_have_been_done_better__c value for this Feedback__c.
     * 
     * @param what_could_have_been_done_better__c
     */
    public void setWhat_could_have_been_done_better__c(java.lang.String what_could_have_been_done_better__c) {
        this.what_could_have_been_done_better__c = what_could_have_been_done_better__c;
    }


    /**
     * Gets the would_you_attend_another_similar_event__c value for this Feedback__c.
     * 
     * @return would_you_attend_another_similar_event__c
     */
    public java.lang.String getWould_you_attend_another_similar_event__c() {
        return would_you_attend_another_similar_event__c;
    }


    /**
     * Sets the would_you_attend_another_similar_event__c value for this Feedback__c.
     * 
     * @param would_you_attend_another_similar_event__c
     */
    public void setWould_you_attend_another_similar_event__c(java.lang.String would_you_attend_another_similar_event__c) {
        this.would_you_attend_another_similar_event__c = would_you_attend_another_similar_event__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Feedback__c)) return false;
        Feedback__c other = (Feedback__c) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.account_Type__c==null && other.getAccount_Type__c()==null) || 
             (this.account_Type__c!=null &&
              this.account_Type__c.equals(other.getAccount_Type__c()))) &&
            ((this.account__c==null && other.getAccount__c()==null) || 
             (this.account__c!=null &&
              this.account__c.equals(other.getAccount__c()))) &&
            ((this.activityHistories==null && other.getActivityHistories()==null) || 
             (this.activityHistories!=null &&
              this.activityHistories.equals(other.getActivityHistories()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.breakout_session_content_useful__c==null && other.getBreakout_session_content_useful__c()==null) || 
             (this.breakout_session_content_useful__c!=null &&
              this.breakout_session_content_useful__c.equals(other.getBreakout_session_content_useful__c()))) &&
            ((this.CS_Manager_Owner__c==null && other.getCS_Manager_Owner__c()==null) || 
             (this.CS_Manager_Owner__c!=null &&
              this.CS_Manager_Owner__c.equals(other.getCS_Manager_Owner__c()))) &&
            ((this.case__c==null && other.getCase__c()==null) || 
             (this.case__c!=null &&
              this.case__c.equals(other.getCase__c()))) &&
            ((this.case__r==null && other.getCase__r()==null) || 
             (this.case__r!=null &&
              this.case__r.equals(other.getCase__r()))) &&
            ((this.client_Service_Rep__c==null && other.getClient_Service_Rep__c()==null) || 
             (this.client_Service_Rep__c!=null &&
              this.client_Service_Rep__c.equals(other.getClient_Service_Rep__c()))) &&
            ((this.client_Service_Rep__r==null && other.getClient_Service_Rep__r()==null) || 
             (this.client_Service_Rep__r!=null &&
              this.client_Service_Rep__r.equals(other.getClient_Service_Rep__r()))) &&
            ((this.comments__c==null && other.getComments__c()==null) || 
             (this.comments__c!=null &&
              this.comments__c.equals(other.getComments__c()))) &&
            ((this.contact__c==null && other.getContact__c()==null) || 
             (this.contact__c!=null &&
              this.contact__c.equals(other.getContact__c()))) &&
            ((this.courtesy_and_Professionalism__c==null && other.getCourtesy_and_Professionalism__c()==null) || 
             (this.courtesy_and_Professionalism__c!=null &&
              this.courtesy_and_Professionalism__c.equals(other.getCourtesy_and_Professionalism__c()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.dev_Courtesy_and_Professionalism__c==null && other.getDev_Courtesy_and_Professionalism__c()==null) || 
             (this.dev_Courtesy_and_Professionalism__c!=null &&
              this.dev_Courtesy_and_Professionalism__c.equals(other.getDev_Courtesy_and_Professionalism__c()))) &&
            ((this.dev_Owner__c==null && other.getDev_Owner__c()==null) || 
             (this.dev_Owner__c!=null &&
              this.dev_Owner__c.equals(other.getDev_Owner__c()))) &&
            ((this.dev_Product_Knowledge__c==null && other.getDev_Product_Knowledge__c()==null) || 
             (this.dev_Product_Knowledge__c!=null &&
              this.dev_Product_Knowledge__c.equals(other.getDev_Product_Knowledge__c()))) &&
            ((this.dev_Qlty_of_Problem_Resolution__c==null && other.getDev_Qlty_of_Problem_Resolution__c()==null) || 
             (this.dev_Qlty_of_Problem_Resolution__c!=null &&
              this.dev_Qlty_of_Problem_Resolution__c.equals(other.getDev_Qlty_of_Problem_Resolution__c()))) &&
            ((this.dev_Technical_Skill__c==null && other.getDev_Technical_Skill__c()==null) || 
             (this.dev_Technical_Skill__c!=null &&
              this.dev_Technical_Skill__c.equals(other.getDev_Technical_Skill__c()))) &&
            ((this.dev_Understanding_Issue_Business_Impac__c==null && other.getDev_Understanding_Issue_Business_Impac__c()==null) || 
             (this.dev_Understanding_Issue_Business_Impac__c!=null &&
              this.dev_Understanding_Issue_Business_Impac__c.equals(other.getDev_Understanding_Issue_Business_Impac__c()))) &&
            ((this.did_you_attempt_to_use_Client_Portal__c==null && other.getDid_you_attempt_to_use_Client_Portal__c()==null) || 
             (this.did_you_attempt_to_use_Client_Portal__c!=null &&
              this.did_you_attempt_to_use_Client_Portal__c.equals(other.getDid_you_attempt_to_use_Client_Portal__c()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              this.events.equals(other.getEvents()))) &&
            ((this.excited_for_what_I_learned_about_8__c==null && other.getExcited_for_what_I_learned_about_8__c()==null) || 
             (this.excited_for_what_I_learned_about_8__c!=null &&
              this.excited_for_what_I_learned_about_8__c.equals(other.getExcited_for_what_I_learned_about_8__c()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.feedback_Score__c==null && other.getFeedback_Score__c()==null) || 
             (this.feedback_Score__c!=null &&
              this.feedback_Score__c.equals(other.getFeedback_Score__c()))) &&
            ((this.format_of_the_Event__c==null && other.getFormat_of_the_Event__c()==null) || 
             (this.format_of_the_Event__c!=null &&
              this.format_of_the_Event__c.equals(other.getFormat_of_the_Event__c()))) &&
            ((this.further_Follow_up_Required__c==null && other.getFurther_Follow_up_Required__c()==null) || 
             (this.further_Follow_up_Required__c!=null &&
              this.further_Follow_up_Required__c.equals(other.getFurther_Follow_up_Required__c()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.issue_that_Caused_Negative_Rating__c==null && other.getIssue_that_Caused_Negative_Rating__c()==null) || 
             (this.issue_that_Caused_Negative_Rating__c!=null &&
              this.issue_that_Caused_Negative_Rating__c.equals(other.getIssue_that_Caused_Negative_Rating__c()))) &&
            ((this.KCD_Solution_Documentation__c==null && other.getKCD_Solution_Documentation__c()==null) || 
             (this.KCD_Solution_Documentation__c!=null &&
              this.KCD_Solution_Documentation__c.equals(other.getKCD_Solution_Documentation__c()))) &&
            ((this.KCD_Solution_Effectiveness__c==null && other.getKCD_Solution_Effectiveness__c()==null) || 
             (this.KCD_Solution_Effectiveness__c!=null &&
              this.KCD_Solution_Effectiveness__c.equals(other.getKCD_Solution_Effectiveness__c()))) &&
            ((this.KCD_Solution_Use__c==null && other.getKCD_Solution_Use__c()==null) || 
             (this.KCD_Solution_Use__c!=null &&
              this.KCD_Solution_Use__c.equals(other.getKCD_Solution_Use__c()))) &&
            ((this.keynote_presentation_content_useful__c==null && other.getKeynote_presentation_content_useful__c()==null) || 
             (this.keynote_presentation_content_useful__c!=null &&
              this.keynote_presentation_content_useful__c.equals(other.getKeynote_presentation_content_useful__c()))) &&
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
            ((this.length_of_Time__c==null && other.getLength_of_Time__c()==null) || 
             (this.length_of_Time__c!=null &&
              this.length_of_Time__c.equals(other.getLength_of_Time__c()))) &&
            ((this.length_of_the_Event__c==null && other.getLength_of_the_Event__c()==null) || 
             (this.length_of_the_Event__c!=null &&
              this.length_of_the_Event__c.equals(other.getLength_of_the_Event__c()))) &&
            ((this.length_of_time_to_resolve_case__c==null && other.getLength_of_time_to_resolve_case__c()==null) || 
             (this.length_of_time_to_resolve_case__c!=null &&
              this.length_of_time_to_resolve_case__c.equals(other.getLength_of_time_to_resolve_case__c()))) &&
            ((this.location_of_the_Venue__c==null && other.getLocation_of_the_Venue__c()==null) || 
             (this.location_of_the_Venue__c!=null &&
              this.location_of_the_Venue__c.equals(other.getLocation_of_the_Venue__c()))) &&
            ((this.mgr_Courtesy_and_Professionalism__c==null && other.getMgr_Courtesy_and_Professionalism__c()==null) || 
             (this.mgr_Courtesy_and_Professionalism__c!=null &&
              this.mgr_Courtesy_and_Professionalism__c.equals(other.getMgr_Courtesy_and_Professionalism__c()))) &&
            ((this.mgr_Product_Knowledge__c==null && other.getMgr_Product_Knowledge__c()==null) || 
             (this.mgr_Product_Knowledge__c!=null &&
              this.mgr_Product_Knowledge__c.equals(other.getMgr_Product_Knowledge__c()))) &&
            ((this.mgr_Qlty_of_Problem_Resolution__c==null && other.getMgr_Qlty_of_Problem_Resolution__c()==null) || 
             (this.mgr_Qlty_of_Problem_Resolution__c!=null &&
              this.mgr_Qlty_of_Problem_Resolution__c.equals(other.getMgr_Qlty_of_Problem_Resolution__c()))) &&
            ((this.mgr_Technical_Skill__c==null && other.getMgr_Technical_Skill__c()==null) || 
             (this.mgr_Technical_Skill__c!=null &&
              this.mgr_Technical_Skill__c.equals(other.getMgr_Technical_Skill__c()))) &&
            ((this.mgr_Understanding_Issue_Impact__c==null && other.getMgr_Understanding_Issue_Impact__c()==null) || 
             (this.mgr_Understanding_Issue_Impact__c!=null &&
              this.mgr_Understanding_Issue_Impact__c.equals(other.getMgr_Understanding_Issue_Impact__c()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.name__c==null && other.getName__c()==null) || 
             (this.name__c!=null &&
              this.name__c.equals(other.getName__c()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.on_breakout_sessions__c==null && other.getOn_breakout_sessions__c()==null) || 
             (this.on_breakout_sessions__c!=null &&
              this.on_breakout_sessions__c.equals(other.getOn_breakout_sessions__c()))) &&
            ((this.on_event_overall__c==null && other.getOn_event_overall__c()==null) || 
             (this.on_event_overall__c!=null &&
              this.on_event_overall__c.equals(other.getOn_event_overall__c()))) &&
            ((this.on_keynote_presentation__c==null && other.getOn_keynote_presentation__c()==null) || 
             (this.on_keynote_presentation__c!=null &&
              this.on_keynote_presentation__c.equals(other.getOn_keynote_presentation__c()))) &&
            ((this.openActivities==null && other.getOpenActivities()==null) || 
             (this.openActivities!=null &&
              this.openActivities.equals(other.getOpenActivities()))) &&
            ((this.overall_Event__c==null && other.getOverall_Event__c()==null) || 
             (this.overall_Event__c!=null &&
              this.overall_Event__c.equals(other.getOverall_Event__c()))) &&
            ((this.overall_Satisfaction__c==null && other.getOverall_Satisfaction__c()==null) || 
             (this.overall_Satisfaction__c!=null &&
              this.overall_Satisfaction__c.equals(other.getOverall_Satisfaction__c()))) &&
            ((this.overall_satisfied_with_this_event__c==null && other.getOverall_satisfied_with_this_event__c()==null) || 
             (this.overall_satisfied_with_this_event__c!=null &&
              this.overall_satisfied_with_this_event__c.equals(other.getOverall_satisfied_with_this_event__c()))) &&
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
            ((this.product_Knowledge__c==null && other.getProduct_Knowledge__c()==null) || 
             (this.product_Knowledge__c!=null &&
              this.product_Knowledge__c.equals(other.getProduct_Knowledge__c()))) &&
            ((this.quality_of_problem_resolution__c==null && other.getQuality_of_problem_resolution__c()==null) || 
             (this.quality_of_problem_resolution__c!=null &&
              this.quality_of_problem_resolution__c.equals(other.getQuality_of_problem_resolution__c()))) &&
            ((this.recommend_this_event_to_your_colleagues__c==null && other.getRecommend_this_event_to_your_colleagues__c()==null) || 
             (this.recommend_this_event_to_your_colleagues__c!=null &&
              this.recommend_this_event_to_your_colleagues__c.equals(other.getRecommend_this_event_to_your_colleagues__c()))) &&
            ((this.recordType==null && other.getRecordType()==null) || 
             (this.recordType!=null &&
              this.recordType.equals(other.getRecordType()))) &&
            ((this.recordTypeId==null && other.getRecordTypeId()==null) || 
             (this.recordTypeId!=null &&
              this.recordTypeId.equals(other.getRecordTypeId()))) &&
            ((this.record_Type__c==null && other.getRecord_Type__c()==null) || 
             (this.record_Type__c!=null &&
              this.record_Type__c.equals(other.getRecord_Type__c()))) &&
            ((this.subject__c==null && other.getSubject__c()==null) || 
             (this.subject__c!=null &&
              this.subject__c.equals(other.getSubject__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              this.tasks.equals(other.getTasks()))) &&
            ((this.technical_Skill__c==null && other.getTechnical_Skill__c()==null) || 
             (this.technical_Skill__c!=null &&
              this.technical_Skill__c.equals(other.getTechnical_Skill__c()))) &&
            ((this.ticket_Close_Date__c==null && other.getTicket_Close_Date__c()==null) || 
             (this.ticket_Close_Date__c!=null &&
              this.ticket_Close_Date__c.equals(other.getTicket_Close_Date__c()))) &&
            ((this.ticket_Owner_Role__c==null && other.getTicket_Owner_Role__c()==null) || 
             (this.ticket_Owner_Role__c!=null &&
              this.ticket_Owner_Role__c.equals(other.getTicket_Owner_Role__c()))) &&
            ((this.ticket_Owner__c==null && other.getTicket_Owner__c()==null) || 
             (this.ticket_Owner__c!=null &&
              this.ticket_Owner__c.equals(other.getTicket_Owner__c()))) &&
            ((this.tier_1_Courtesy_and_Professionalism__c==null && other.getTier_1_Courtesy_and_Professionalism__c()==null) || 
             (this.tier_1_Courtesy_and_Professionalism__c!=null &&
              this.tier_1_Courtesy_and_Professionalism__c.equals(other.getTier_1_Courtesy_and_Professionalism__c()))) &&
            ((this.tier_1_Product_Knowledge__c==null && other.getTier_1_Product_Knowledge__c()==null) || 
             (this.tier_1_Product_Knowledge__c!=null &&
              this.tier_1_Product_Knowledge__c.equals(other.getTier_1_Product_Knowledge__c()))) &&
            ((this.tier_1_Qlty_of_Problem_Resolution__c==null && other.getTier_1_Qlty_of_Problem_Resolution__c()==null) || 
             (this.tier_1_Qlty_of_Problem_Resolution__c!=null &&
              this.tier_1_Qlty_of_Problem_Resolution__c.equals(other.getTier_1_Qlty_of_Problem_Resolution__c()))) &&
            ((this.tier_1_Rep__c==null && other.getTier_1_Rep__c()==null) || 
             (this.tier_1_Rep__c!=null &&
              this.tier_1_Rep__c.equals(other.getTier_1_Rep__c()))) &&
            ((this.tier_1_Technical_Skill__c==null && other.getTier_1_Technical_Skill__c()==null) || 
             (this.tier_1_Technical_Skill__c!=null &&
              this.tier_1_Technical_Skill__c.equals(other.getTier_1_Technical_Skill__c()))) &&
            ((this.tier_1_Understanding_Issue_Impact__c==null && other.getTier_1_Understanding_Issue_Impact__c()==null) || 
             (this.tier_1_Understanding_Issue_Impact__c!=null &&
              this.tier_1_Understanding_Issue_Impact__c.equals(other.getTier_1_Understanding_Issue_Impact__c()))) &&
            ((this.tier_2_Courtesy_and_Professionalism__c==null && other.getTier_2_Courtesy_and_Professionalism__c()==null) || 
             (this.tier_2_Courtesy_and_Professionalism__c!=null &&
              this.tier_2_Courtesy_and_Professionalism__c.equals(other.getTier_2_Courtesy_and_Professionalism__c()))) &&
            ((this.tier_2_Product_Knowledge__c==null && other.getTier_2_Product_Knowledge__c()==null) || 
             (this.tier_2_Product_Knowledge__c!=null &&
              this.tier_2_Product_Knowledge__c.equals(other.getTier_2_Product_Knowledge__c()))) &&
            ((this.tier_2_Qlty_of_Problem_Resolution__c==null && other.getTier_2_Qlty_of_Problem_Resolution__c()==null) || 
             (this.tier_2_Qlty_of_Problem_Resolution__c!=null &&
              this.tier_2_Qlty_of_Problem_Resolution__c.equals(other.getTier_2_Qlty_of_Problem_Resolution__c()))) &&
            ((this.tier_2_Rep__c==null && other.getTier_2_Rep__c()==null) || 
             (this.tier_2_Rep__c!=null &&
              this.tier_2_Rep__c.equals(other.getTier_2_Rep__c()))) &&
            ((this.tier_2_Technical_Skill__c==null && other.getTier_2_Technical_Skill__c()==null) || 
             (this.tier_2_Technical_Skill__c!=null &&
              this.tier_2_Technical_Skill__c.equals(other.getTier_2_Technical_Skill__c()))) &&
            ((this.tier_2_Understanding_Issue_Impact__c==null && other.getTier_2_Understanding_Issue_Impact__c()==null) || 
             (this.tier_2_Understanding_Issue_Impact__c!=null &&
              this.tier_2_Understanding_Issue_Impact__c.equals(other.getTier_2_Understanding_Issue_Impact__c()))) &&
            ((this.time_to_receive_a_response__c==null && other.getTime_to_receive_a_response__c()==null) || 
             (this.time_to_receive_a_response__c!=null &&
              this.time_to_receive_a_response__c.equals(other.getTime_to_receive_a_response__c()))) &&
            ((this.understanding_issue_and_business_impact__c==null && other.getUnderstanding_issue_and_business_impact__c()==null) || 
             (this.understanding_issue_and_business_impact__c!=null &&
              this.understanding_issue_and_business_impact__c.equals(other.getUnderstanding_issue_and_business_impact__c()))) &&
            ((this.what_could_have_been_done_better__c==null && other.getWhat_could_have_been_done_better__c()==null) || 
             (this.what_could_have_been_done_better__c!=null &&
              this.what_could_have_been_done_better__c.equals(other.getWhat_could_have_been_done_better__c()))) &&
            ((this.would_you_attend_another_similar_event__c==null && other.getWould_you_attend_another_similar_event__c()==null) || 
             (this.would_you_attend_another_similar_event__c!=null &&
              this.would_you_attend_another_similar_event__c.equals(other.getWould_you_attend_another_similar_event__c())));
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
        if (getAccount_Type__c() != null) {
            _hashCode += getAccount_Type__c().hashCode();
        }
        if (getAccount__c() != null) {
            _hashCode += getAccount__c().hashCode();
        }
        if (getActivityHistories() != null) {
            _hashCode += getActivityHistories().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getBreakout_session_content_useful__c() != null) {
            _hashCode += getBreakout_session_content_useful__c().hashCode();
        }
        if (getCS_Manager_Owner__c() != null) {
            _hashCode += getCS_Manager_Owner__c().hashCode();
        }
        if (getCase__c() != null) {
            _hashCode += getCase__c().hashCode();
        }
        if (getCase__r() != null) {
            _hashCode += getCase__r().hashCode();
        }
        if (getClient_Service_Rep__c() != null) {
            _hashCode += getClient_Service_Rep__c().hashCode();
        }
        if (getClient_Service_Rep__r() != null) {
            _hashCode += getClient_Service_Rep__r().hashCode();
        }
        if (getComments__c() != null) {
            _hashCode += getComments__c().hashCode();
        }
        if (getContact__c() != null) {
            _hashCode += getContact__c().hashCode();
        }
        if (getCourtesy_and_Professionalism__c() != null) {
            _hashCode += getCourtesy_and_Professionalism__c().hashCode();
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
        if (getDev_Courtesy_and_Professionalism__c() != null) {
            _hashCode += getDev_Courtesy_and_Professionalism__c().hashCode();
        }
        if (getDev_Owner__c() != null) {
            _hashCode += getDev_Owner__c().hashCode();
        }
        if (getDev_Product_Knowledge__c() != null) {
            _hashCode += getDev_Product_Knowledge__c().hashCode();
        }
        if (getDev_Qlty_of_Problem_Resolution__c() != null) {
            _hashCode += getDev_Qlty_of_Problem_Resolution__c().hashCode();
        }
        if (getDev_Technical_Skill__c() != null) {
            _hashCode += getDev_Technical_Skill__c().hashCode();
        }
        if (getDev_Understanding_Issue_Business_Impac__c() != null) {
            _hashCode += getDev_Understanding_Issue_Business_Impac__c().hashCode();
        }
        if (getDid_you_attempt_to_use_Client_Portal__c() != null) {
            _hashCode += getDid_you_attempt_to_use_Client_Portal__c().hashCode();
        }
        if (getEvents() != null) {
            _hashCode += getEvents().hashCode();
        }
        if (getExcited_for_what_I_learned_about_8__c() != null) {
            _hashCode += getExcited_for_what_I_learned_about_8__c().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getFeedback_Score__c() != null) {
            _hashCode += getFeedback_Score__c().hashCode();
        }
        if (getFormat_of_the_Event__c() != null) {
            _hashCode += getFormat_of_the_Event__c().hashCode();
        }
        if (getFurther_Follow_up_Required__c() != null) {
            _hashCode += getFurther_Follow_up_Required__c().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getIssue_that_Caused_Negative_Rating__c() != null) {
            _hashCode += getIssue_that_Caused_Negative_Rating__c().hashCode();
        }
        if (getKCD_Solution_Documentation__c() != null) {
            _hashCode += getKCD_Solution_Documentation__c().hashCode();
        }
        if (getKCD_Solution_Effectiveness__c() != null) {
            _hashCode += getKCD_Solution_Effectiveness__c().hashCode();
        }
        if (getKCD_Solution_Use__c() != null) {
            _hashCode += getKCD_Solution_Use__c().hashCode();
        }
        if (getKeynote_presentation_content_useful__c() != null) {
            _hashCode += getKeynote_presentation_content_useful__c().hashCode();
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
        if (getLength_of_Time__c() != null) {
            _hashCode += getLength_of_Time__c().hashCode();
        }
        if (getLength_of_the_Event__c() != null) {
            _hashCode += getLength_of_the_Event__c().hashCode();
        }
        if (getLength_of_time_to_resolve_case__c() != null) {
            _hashCode += getLength_of_time_to_resolve_case__c().hashCode();
        }
        if (getLocation_of_the_Venue__c() != null) {
            _hashCode += getLocation_of_the_Venue__c().hashCode();
        }
        if (getMgr_Courtesy_and_Professionalism__c() != null) {
            _hashCode += getMgr_Courtesy_and_Professionalism__c().hashCode();
        }
        if (getMgr_Product_Knowledge__c() != null) {
            _hashCode += getMgr_Product_Knowledge__c().hashCode();
        }
        if (getMgr_Qlty_of_Problem_Resolution__c() != null) {
            _hashCode += getMgr_Qlty_of_Problem_Resolution__c().hashCode();
        }
        if (getMgr_Technical_Skill__c() != null) {
            _hashCode += getMgr_Technical_Skill__c().hashCode();
        }
        if (getMgr_Understanding_Issue_Impact__c() != null) {
            _hashCode += getMgr_Understanding_Issue_Impact__c().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getName__c() != null) {
            _hashCode += getName__c().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getNotesAndAttachments() != null) {
            _hashCode += getNotesAndAttachments().hashCode();
        }
        if (getOn_breakout_sessions__c() != null) {
            _hashCode += getOn_breakout_sessions__c().hashCode();
        }
        if (getOn_event_overall__c() != null) {
            _hashCode += getOn_event_overall__c().hashCode();
        }
        if (getOn_keynote_presentation__c() != null) {
            _hashCode += getOn_keynote_presentation__c().hashCode();
        }
        if (getOpenActivities() != null) {
            _hashCode += getOpenActivities().hashCode();
        }
        if (getOverall_Event__c() != null) {
            _hashCode += getOverall_Event__c().hashCode();
        }
        if (getOverall_Satisfaction__c() != null) {
            _hashCode += getOverall_Satisfaction__c().hashCode();
        }
        if (getOverall_satisfied_with_this_event__c() != null) {
            _hashCode += getOverall_satisfied_with_this_event__c().hashCode();
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
        if (getProduct_Knowledge__c() != null) {
            _hashCode += getProduct_Knowledge__c().hashCode();
        }
        if (getQuality_of_problem_resolution__c() != null) {
            _hashCode += getQuality_of_problem_resolution__c().hashCode();
        }
        if (getRecommend_this_event_to_your_colleagues__c() != null) {
            _hashCode += getRecommend_this_event_to_your_colleagues__c().hashCode();
        }
        if (getRecordType() != null) {
            _hashCode += getRecordType().hashCode();
        }
        if (getRecordTypeId() != null) {
            _hashCode += getRecordTypeId().hashCode();
        }
        if (getRecord_Type__c() != null) {
            _hashCode += getRecord_Type__c().hashCode();
        }
        if (getSubject__c() != null) {
            _hashCode += getSubject__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTasks() != null) {
            _hashCode += getTasks().hashCode();
        }
        if (getTechnical_Skill__c() != null) {
            _hashCode += getTechnical_Skill__c().hashCode();
        }
        if (getTicket_Close_Date__c() != null) {
            _hashCode += getTicket_Close_Date__c().hashCode();
        }
        if (getTicket_Owner_Role__c() != null) {
            _hashCode += getTicket_Owner_Role__c().hashCode();
        }
        if (getTicket_Owner__c() != null) {
            _hashCode += getTicket_Owner__c().hashCode();
        }
        if (getTier_1_Courtesy_and_Professionalism__c() != null) {
            _hashCode += getTier_1_Courtesy_and_Professionalism__c().hashCode();
        }
        if (getTier_1_Product_Knowledge__c() != null) {
            _hashCode += getTier_1_Product_Knowledge__c().hashCode();
        }
        if (getTier_1_Qlty_of_Problem_Resolution__c() != null) {
            _hashCode += getTier_1_Qlty_of_Problem_Resolution__c().hashCode();
        }
        if (getTier_1_Rep__c() != null) {
            _hashCode += getTier_1_Rep__c().hashCode();
        }
        if (getTier_1_Technical_Skill__c() != null) {
            _hashCode += getTier_1_Technical_Skill__c().hashCode();
        }
        if (getTier_1_Understanding_Issue_Impact__c() != null) {
            _hashCode += getTier_1_Understanding_Issue_Impact__c().hashCode();
        }
        if (getTier_2_Courtesy_and_Professionalism__c() != null) {
            _hashCode += getTier_2_Courtesy_and_Professionalism__c().hashCode();
        }
        if (getTier_2_Product_Knowledge__c() != null) {
            _hashCode += getTier_2_Product_Knowledge__c().hashCode();
        }
        if (getTier_2_Qlty_of_Problem_Resolution__c() != null) {
            _hashCode += getTier_2_Qlty_of_Problem_Resolution__c().hashCode();
        }
        if (getTier_2_Rep__c() != null) {
            _hashCode += getTier_2_Rep__c().hashCode();
        }
        if (getTier_2_Technical_Skill__c() != null) {
            _hashCode += getTier_2_Technical_Skill__c().hashCode();
        }
        if (getTier_2_Understanding_Issue_Impact__c() != null) {
            _hashCode += getTier_2_Understanding_Issue_Impact__c().hashCode();
        }
        if (getTime_to_receive_a_response__c() != null) {
            _hashCode += getTime_to_receive_a_response__c().hashCode();
        }
        if (getUnderstanding_issue_and_business_impact__c() != null) {
            _hashCode += getUnderstanding_issue_and_business_impact__c().hashCode();
        }
        if (getWhat_could_have_been_done_better__c() != null) {
            _hashCode += getWhat_could_have_been_done_better__c().hashCode();
        }
        if (getWould_you_attend_another_similar_event__c() != null) {
            _hashCode += getWould_you_attend_another_similar_event__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Feedback__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Feedback__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account__c"));
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
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("breakout_session_content_useful__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Breakout_session_content_useful__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CS_Manager_Owner__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CS_Manager_Owner__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("case__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("case__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("client_Service_Rep__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Client_Service_Rep__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("client_Service_Rep__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Client_Service_Rep__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Comments__c"));
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
        elemField.setFieldName("courtesy_and_Professionalism__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courtesy_and_Professionalism__c"));
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
        elemField.setFieldName("dev_Courtesy_and_Professionalism__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dev_Courtesy_and_Professionalism__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dev_Owner__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dev_Owner__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dev_Product_Knowledge__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dev_Product_Knowledge__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dev_Qlty_of_Problem_Resolution__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dev_Qlty_of_Problem_Resolution__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dev_Technical_Skill__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dev_Technical_Skill__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dev_Understanding_Issue_Business_Impac__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dev_Understanding_Issue_Business_Impac__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("did_you_attempt_to_use_Client_Portal__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Did_you_attempt_to_use_Client_Portal__c"));
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
        elemField.setFieldName("excited_for_what_I_learned_about_8__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Excited_for_what_I_learned_about_8__c"));
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
        elemField.setFieldName("feedback_Score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Feedback_Score__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format_of_the_Event__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Format_of_the_Event__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("further_Follow_up_Required__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Further_Follow_up_Required__c"));
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
        elemField.setFieldName("issue_that_Caused_Negative_Rating__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Issue_that_Caused_Negative_Rating__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KCD_Solution_Documentation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "KCD_Solution_Documentation__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KCD_Solution_Effectiveness__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "KCD_Solution_Effectiveness__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KCD_Solution_Use__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "KCD_Solution_Use__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keynote_presentation_content_useful__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Keynote_presentation_content_useful__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("length_of_Time__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Length_of_Time__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length_of_the_Event__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Length_of_the_Event__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length_of_time_to_resolve_case__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Length_of_time_to_resolve_case__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location_of_the_Venue__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Location_of_the_Venue__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mgr_Courtesy_and_Professionalism__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Mgr_Courtesy_and_Professionalism__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mgr_Product_Knowledge__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Mgr_Product_Knowledge__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mgr_Qlty_of_Problem_Resolution__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Mgr_Qlty_of_Problem_Resolution__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mgr_Technical_Skill__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Mgr_Technical_Skill__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mgr_Understanding_Issue_Impact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Mgr_Understanding_Issue_Impact__c"));
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
        elemField.setFieldName("name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name__c"));
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
        elemField.setFieldName("on_breakout_sessions__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "On_breakout_sessions__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("on_event_overall__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "On_event_overall__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("on_keynote_presentation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "On_keynote_presentation__c"));
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
        elemField.setFieldName("overall_Event__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Overall_Event__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overall_Satisfaction__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Overall_Satisfaction__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overall_satisfied_with_this_event__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Overall_satisfied_with_this_event__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("product_Knowledge__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Product_Knowledge__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quality_of_problem_resolution__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Quality_of_problem_resolution__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recommend_this_event_to_your_colleagues__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Recommend_this_event_to_your_colleagues__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("record_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Record_Type__c"));
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
        elemField.setFieldName("tasks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("technical_Skill__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Technical_Skill__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticket_Close_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Ticket_Close_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticket_Owner_Role__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Ticket_Owner_Role__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticket_Owner__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Ticket_Owner__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tier_1_Courtesy_and_Professionalism__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tier_1_Courtesy_and_Professionalism__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tier_1_Product_Knowledge__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tier_1_Product_Knowledge__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tier_1_Qlty_of_Problem_Resolution__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tier_1_Qlty_of_Problem_Resolution__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tier_1_Rep__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tier_1_Rep__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tier_1_Technical_Skill__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tier_1_Technical_Skill__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tier_1_Understanding_Issue_Impact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tier_1_Understanding_Issue_Impact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tier_2_Courtesy_and_Professionalism__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tier_2_Courtesy_and_Professionalism__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tier_2_Product_Knowledge__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tier_2_Product_Knowledge__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tier_2_Qlty_of_Problem_Resolution__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tier_2_Qlty_of_Problem_Resolution__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tier_2_Rep__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tier_2_Rep__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tier_2_Technical_Skill__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tier_2_Technical_Skill__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tier_2_Understanding_Issue_Impact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tier_2_Understanding_Issue_Impact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time_to_receive_a_response__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Time_to_receive_a_response__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("understanding_issue_and_business_impact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Understanding_issue_and_business_impact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("what_could_have_been_done_better__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "What_could_have_been_done_better__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("would_you_attend_another_similar_event__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Would_you_attend_another_similar_event__c"));
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

/**
 * Best_in_Service_Main__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Best_in_Service_Main__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String account_Owner__c;

    private java.lang.String account__c;

    private com.sforce.soap.enterprise.sobject.Account account__r;

    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private java.lang.Boolean appeal_Form_Received__c;

    private java.lang.Boolean appeal_Form_Sent__c;

    private java.lang.String application_Type__c;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.Double average_users__c;

    private java.util.Date BIS_Second_Audit_Due_Date__c;

    private java.lang.Boolean banner_Sent__c;

    private com.sforce.soap.enterprise.QueryResult best_In_Service_Surveys__r;

    private java.util.Date biS_Audit_Due_Date__c;

    private com.sforce.soap.enterprise.QueryResult biS_Contact__r;

    private com.sforce.soap.enterprise.QueryResult biS_Quarterly_Audits__r;

    private java.util.Date biS_Start_Date__c;

    private java.util.Date bis_Third_Audit_Date__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.util.Date data_Returned_Date__c;

    private java.util.Date date_Appeal_Form_Received__c;

    private java.util.Date date_Appeal_Form_Sent__c;

    private java.util.Date date_Banner_Sent__c;

    private java.util.Date date_Became_PHP__c;

    private java.util.Date date_Marketing_Was_Notified_by_QC__c;

    private java.util.Date date_Partner_Was_Notified__c;

    private java.util.Date date_Plaque_Sent__c;

    private java.util.Date environment_Analysis_Begin_Date__c;

    private java.util.Date environment_Analysis_End_Date__c;

    private java.lang.String environment_Analysis_Summary__c;

    private java.lang.String environment_Analysis_Ticket__c;

    private com.sforce.soap.enterprise.sobject._case environment_Analysis_Ticket__r;

    private java.util.Date environment_Eval_Begin_Date__c;

    private java.util.Date environment_Eval_End_Date__c;

    private java.lang.String environment_Eval_Escalation_Summary__c;

    private java.lang.Double environment_Eval_Escalation_Ticket_old__c;

    private java.lang.String environment_Evaluation_Ticket__c;

    private com.sforce.soap.enterprise.sobject._case environment_Evaluation_Ticket__r;

    private java.util.Date escalation_Call_Date__c;

    private java.util.Date escalation_Date__c;

    private com.sforce.soap.enterprise.QueryResult events;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.lang.String financial_Status__c;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.String instances_on_Major_Release__c;

    private java.lang.Boolean isDeleted;

    private java.util.Date lastActivityDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String latest_Version_of_PD_DFG__c;

    private java.lang.Double month_Pass_Fail__c;

    private java.util.Date mou_Received_Date__c;

    private java.util.Date mou_Sent_Date__c;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private com.sforce.soap.enterprise.QueryResult openActivities;

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private java.util.Date PHP_Partner__c;

    private java.lang.String POE_Comments__c;

    private java.lang.String POE_Ticket_Number__c;

    private com.sforce.soap.enterprise.sobject._case POE_Ticket_Number__r;

    private java.lang.String POE_Ticket_Number_old__c;

    private java.util.Date POE_Ticket_Opened__c;

    private java.lang.String partner_ID__c;

    private java.lang.String pass_Fail__c;

    private java.lang.Boolean plaque_Sent__c;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.String RCAs__c;

    private java.lang.String RCSPs__c;

    private java.lang.String reason_for_Fail__c;

    private java.lang.String reference_List__c;

    private java.util.Date results_Given_On__c;

    private java.lang.String short_Term_Call_Notes__c;

    private java.lang.String status_Description__c;

    private java.lang.String status__c;

    private java.util.Date surveys_Sent__c;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    private java.util.Date ticket_Sent_Date__c;

    private java.lang.String tier__c;

    private java.lang.String kIE_Owner__c;

    private com.sforce.soap.enterprise.sobject.Contact kIE_Owner__r;

    public Best_in_Service_Main__c() {
    }

    public Best_in_Service_Main__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String account_Owner__c,
           java.lang.String account__c,
           com.sforce.soap.enterprise.sobject.Account account__r,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           java.lang.Boolean appeal_Form_Received__c,
           java.lang.Boolean appeal_Form_Sent__c,
           java.lang.String application_Type__c,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.Double average_users__c,
           java.util.Date BIS_Second_Audit_Due_Date__c,
           java.lang.Boolean banner_Sent__c,
           com.sforce.soap.enterprise.QueryResult best_In_Service_Surveys__r,
           java.util.Date biS_Audit_Due_Date__c,
           com.sforce.soap.enterprise.QueryResult biS_Contact__r,
           com.sforce.soap.enterprise.QueryResult biS_Quarterly_Audits__r,
           java.util.Date biS_Start_Date__c,
           java.util.Date bis_Third_Audit_Date__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.util.Date data_Returned_Date__c,
           java.util.Date date_Appeal_Form_Received__c,
           java.util.Date date_Appeal_Form_Sent__c,
           java.util.Date date_Banner_Sent__c,
           java.util.Date date_Became_PHP__c,
           java.util.Date date_Marketing_Was_Notified_by_QC__c,
           java.util.Date date_Partner_Was_Notified__c,
           java.util.Date date_Plaque_Sent__c,
           java.util.Date environment_Analysis_Begin_Date__c,
           java.util.Date environment_Analysis_End_Date__c,
           java.lang.String environment_Analysis_Summary__c,
           java.lang.String environment_Analysis_Ticket__c,
           com.sforce.soap.enterprise.sobject._case environment_Analysis_Ticket__r,
           java.util.Date environment_Eval_Begin_Date__c,
           java.util.Date environment_Eval_End_Date__c,
           java.lang.String environment_Eval_Escalation_Summary__c,
           java.lang.Double environment_Eval_Escalation_Ticket_old__c,
           java.lang.String environment_Evaluation_Ticket__c,
           com.sforce.soap.enterprise.sobject._case environment_Evaluation_Ticket__r,
           java.util.Date escalation_Call_Date__c,
           java.util.Date escalation_Date__c,
           com.sforce.soap.enterprise.QueryResult events,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.lang.String financial_Status__c,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.String instances_on_Major_Release__c,
           java.lang.Boolean isDeleted,
           java.util.Date lastActivityDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String latest_Version_of_PD_DFG__c,
           java.lang.Double month_Pass_Fail__c,
           java.util.Date mou_Received_Date__c,
           java.util.Date mou_Sent_Date__c,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           com.sforce.soap.enterprise.QueryResult openActivities,
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           java.util.Date PHP_Partner__c,
           java.lang.String POE_Comments__c,
           java.lang.String POE_Ticket_Number__c,
           com.sforce.soap.enterprise.sobject._case POE_Ticket_Number__r,
           java.lang.String POE_Ticket_Number_old__c,
           java.util.Date POE_Ticket_Opened__c,
           java.lang.String partner_ID__c,
           java.lang.String pass_Fail__c,
           java.lang.Boolean plaque_Sent__c,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.String RCAs__c,
           java.lang.String RCSPs__c,
           java.lang.String reason_for_Fail__c,
           java.lang.String reference_List__c,
           java.util.Date results_Given_On__c,
           java.lang.String short_Term_Call_Notes__c,
           java.lang.String status_Description__c,
           java.lang.String status__c,
           java.util.Date surveys_Sent__c,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks,
           java.util.Date ticket_Sent_Date__c,
           java.lang.String tier__c,
           java.lang.String kIE_Owner__c,
           com.sforce.soap.enterprise.sobject.Contact kIE_Owner__r) {
        super(
            fieldsToNull,
            id);
        this.account_Owner__c = account_Owner__c;
        this.account__c = account__c;
        this.account__r = account__r;
        this.activityHistories = activityHistories;
        this.appeal_Form_Received__c = appeal_Form_Received__c;
        this.appeal_Form_Sent__c = appeal_Form_Sent__c;
        this.application_Type__c = application_Type__c;
        this.attachments = attachments;
        this.average_users__c = average_users__c;
        this.BIS_Second_Audit_Due_Date__c = BIS_Second_Audit_Due_Date__c;
        this.banner_Sent__c = banner_Sent__c;
        this.best_In_Service_Surveys__r = best_In_Service_Surveys__r;
        this.biS_Audit_Due_Date__c = biS_Audit_Due_Date__c;
        this.biS_Contact__r = biS_Contact__r;
        this.biS_Quarterly_Audits__r = biS_Quarterly_Audits__r;
        this.biS_Start_Date__c = biS_Start_Date__c;
        this.bis_Third_Audit_Date__c = bis_Third_Audit_Date__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.data_Returned_Date__c = data_Returned_Date__c;
        this.date_Appeal_Form_Received__c = date_Appeal_Form_Received__c;
        this.date_Appeal_Form_Sent__c = date_Appeal_Form_Sent__c;
        this.date_Banner_Sent__c = date_Banner_Sent__c;
        this.date_Became_PHP__c = date_Became_PHP__c;
        this.date_Marketing_Was_Notified_by_QC__c = date_Marketing_Was_Notified_by_QC__c;
        this.date_Partner_Was_Notified__c = date_Partner_Was_Notified__c;
        this.date_Plaque_Sent__c = date_Plaque_Sent__c;
        this.environment_Analysis_Begin_Date__c = environment_Analysis_Begin_Date__c;
        this.environment_Analysis_End_Date__c = environment_Analysis_End_Date__c;
        this.environment_Analysis_Summary__c = environment_Analysis_Summary__c;
        this.environment_Analysis_Ticket__c = environment_Analysis_Ticket__c;
        this.environment_Analysis_Ticket__r = environment_Analysis_Ticket__r;
        this.environment_Eval_Begin_Date__c = environment_Eval_Begin_Date__c;
        this.environment_Eval_End_Date__c = environment_Eval_End_Date__c;
        this.environment_Eval_Escalation_Summary__c = environment_Eval_Escalation_Summary__c;
        this.environment_Eval_Escalation_Ticket_old__c = environment_Eval_Escalation_Ticket_old__c;
        this.environment_Evaluation_Ticket__c = environment_Evaluation_Ticket__c;
        this.environment_Evaluation_Ticket__r = environment_Evaluation_Ticket__r;
        this.escalation_Call_Date__c = escalation_Call_Date__c;
        this.escalation_Date__c = escalation_Date__c;
        this.events = events;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.financial_Status__c = financial_Status__c;
        this.histories = histories;
        this.instances_on_Major_Release__c = instances_on_Major_Release__c;
        this.isDeleted = isDeleted;
        this.lastActivityDate = lastActivityDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.latest_Version_of_PD_DFG__c = latest_Version_of_PD_DFG__c;
        this.month_Pass_Fail__c = month_Pass_Fail__c;
        this.mou_Received_Date__c = mou_Received_Date__c;
        this.mou_Sent_Date__c = mou_Sent_Date__c;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.openActivities = openActivities;
        this.owner = owner;
        this.ownerId = ownerId;
        this.PHP_Partner__c = PHP_Partner__c;
        this.POE_Comments__c = POE_Comments__c;
        this.POE_Ticket_Number__c = POE_Ticket_Number__c;
        this.POE_Ticket_Number__r = POE_Ticket_Number__r;
        this.POE_Ticket_Number_old__c = POE_Ticket_Number_old__c;
        this.POE_Ticket_Opened__c = POE_Ticket_Opened__c;
        this.partner_ID__c = partner_ID__c;
        this.pass_Fail__c = pass_Fail__c;
        this.plaque_Sent__c = plaque_Sent__c;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.RCAs__c = RCAs__c;
        this.RCSPs__c = RCSPs__c;
        this.reason_for_Fail__c = reason_for_Fail__c;
        this.reference_List__c = reference_List__c;
        this.results_Given_On__c = results_Given_On__c;
        this.short_Term_Call_Notes__c = short_Term_Call_Notes__c;
        this.status_Description__c = status_Description__c;
        this.status__c = status__c;
        this.surveys_Sent__c = surveys_Sent__c;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
        this.ticket_Sent_Date__c = ticket_Sent_Date__c;
        this.tier__c = tier__c;
        this.kIE_Owner__c = kIE_Owner__c;
        this.kIE_Owner__r = kIE_Owner__r;
    }


    /**
     * Gets the account_Owner__c value for this Best_in_Service_Main__c.
     * 
     * @return account_Owner__c
     */
    public java.lang.String getAccount_Owner__c() {
        return account_Owner__c;
    }


    /**
     * Sets the account_Owner__c value for this Best_in_Service_Main__c.
     * 
     * @param account_Owner__c
     */
    public void setAccount_Owner__c(java.lang.String account_Owner__c) {
        this.account_Owner__c = account_Owner__c;
    }


    /**
     * Gets the account__c value for this Best_in_Service_Main__c.
     * 
     * @return account__c
     */
    public java.lang.String getAccount__c() {
        return account__c;
    }


    /**
     * Sets the account__c value for this Best_in_Service_Main__c.
     * 
     * @param account__c
     */
    public void setAccount__c(java.lang.String account__c) {
        this.account__c = account__c;
    }


    /**
     * Gets the account__r value for this Best_in_Service_Main__c.
     * 
     * @return account__r
     */
    public com.sforce.soap.enterprise.sobject.Account getAccount__r() {
        return account__r;
    }


    /**
     * Sets the account__r value for this Best_in_Service_Main__c.
     * 
     * @param account__r
     */
    public void setAccount__r(com.sforce.soap.enterprise.sobject.Account account__r) {
        this.account__r = account__r;
    }


    /**
     * Gets the activityHistories value for this Best_in_Service_Main__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this Best_in_Service_Main__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the appeal_Form_Received__c value for this Best_in_Service_Main__c.
     * 
     * @return appeal_Form_Received__c
     */
    public java.lang.Boolean getAppeal_Form_Received__c() {
        return appeal_Form_Received__c;
    }


    /**
     * Sets the appeal_Form_Received__c value for this Best_in_Service_Main__c.
     * 
     * @param appeal_Form_Received__c
     */
    public void setAppeal_Form_Received__c(java.lang.Boolean appeal_Form_Received__c) {
        this.appeal_Form_Received__c = appeal_Form_Received__c;
    }


    /**
     * Gets the appeal_Form_Sent__c value for this Best_in_Service_Main__c.
     * 
     * @return appeal_Form_Sent__c
     */
    public java.lang.Boolean getAppeal_Form_Sent__c() {
        return appeal_Form_Sent__c;
    }


    /**
     * Sets the appeal_Form_Sent__c value for this Best_in_Service_Main__c.
     * 
     * @param appeal_Form_Sent__c
     */
    public void setAppeal_Form_Sent__c(java.lang.Boolean appeal_Form_Sent__c) {
        this.appeal_Form_Sent__c = appeal_Form_Sent__c;
    }


    /**
     * Gets the application_Type__c value for this Best_in_Service_Main__c.
     * 
     * @return application_Type__c
     */
    public java.lang.String getApplication_Type__c() {
        return application_Type__c;
    }


    /**
     * Sets the application_Type__c value for this Best_in_Service_Main__c.
     * 
     * @param application_Type__c
     */
    public void setApplication_Type__c(java.lang.String application_Type__c) {
        this.application_Type__c = application_Type__c;
    }


    /**
     * Gets the attachments value for this Best_in_Service_Main__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Best_in_Service_Main__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the average_users__c value for this Best_in_Service_Main__c.
     * 
     * @return average_users__c
     */
    public java.lang.Double getAverage_users__c() {
        return average_users__c;
    }


    /**
     * Sets the average_users__c value for this Best_in_Service_Main__c.
     * 
     * @param average_users__c
     */
    public void setAverage_users__c(java.lang.Double average_users__c) {
        this.average_users__c = average_users__c;
    }


    /**
     * Gets the BIS_Second_Audit_Due_Date__c value for this Best_in_Service_Main__c.
     * 
     * @return BIS_Second_Audit_Due_Date__c
     */
    public java.util.Date getBIS_Second_Audit_Due_Date__c() {
        return BIS_Second_Audit_Due_Date__c;
    }


    /**
     * Sets the BIS_Second_Audit_Due_Date__c value for this Best_in_Service_Main__c.
     * 
     * @param BIS_Second_Audit_Due_Date__c
     */
    public void setBIS_Second_Audit_Due_Date__c(java.util.Date BIS_Second_Audit_Due_Date__c) {
        this.BIS_Second_Audit_Due_Date__c = BIS_Second_Audit_Due_Date__c;
    }


    /**
     * Gets the banner_Sent__c value for this Best_in_Service_Main__c.
     * 
     * @return banner_Sent__c
     */
    public java.lang.Boolean getBanner_Sent__c() {
        return banner_Sent__c;
    }


    /**
     * Sets the banner_Sent__c value for this Best_in_Service_Main__c.
     * 
     * @param banner_Sent__c
     */
    public void setBanner_Sent__c(java.lang.Boolean banner_Sent__c) {
        this.banner_Sent__c = banner_Sent__c;
    }


    /**
     * Gets the best_In_Service_Surveys__r value for this Best_in_Service_Main__c.
     * 
     * @return best_In_Service_Surveys__r
     */
    public com.sforce.soap.enterprise.QueryResult getBest_In_Service_Surveys__r() {
        return best_In_Service_Surveys__r;
    }


    /**
     * Sets the best_In_Service_Surveys__r value for this Best_in_Service_Main__c.
     * 
     * @param best_In_Service_Surveys__r
     */
    public void setBest_In_Service_Surveys__r(com.sforce.soap.enterprise.QueryResult best_In_Service_Surveys__r) {
        this.best_In_Service_Surveys__r = best_In_Service_Surveys__r;
    }


    /**
     * Gets the biS_Audit_Due_Date__c value for this Best_in_Service_Main__c.
     * 
     * @return biS_Audit_Due_Date__c
     */
    public java.util.Date getBiS_Audit_Due_Date__c() {
        return biS_Audit_Due_Date__c;
    }


    /**
     * Sets the biS_Audit_Due_Date__c value for this Best_in_Service_Main__c.
     * 
     * @param biS_Audit_Due_Date__c
     */
    public void setBiS_Audit_Due_Date__c(java.util.Date biS_Audit_Due_Date__c) {
        this.biS_Audit_Due_Date__c = biS_Audit_Due_Date__c;
    }


    /**
     * Gets the biS_Contact__r value for this Best_in_Service_Main__c.
     * 
     * @return biS_Contact__r
     */
    public com.sforce.soap.enterprise.QueryResult getBiS_Contact__r() {
        return biS_Contact__r;
    }


    /**
     * Sets the biS_Contact__r value for this Best_in_Service_Main__c.
     * 
     * @param biS_Contact__r
     */
    public void setBiS_Contact__r(com.sforce.soap.enterprise.QueryResult biS_Contact__r) {
        this.biS_Contact__r = biS_Contact__r;
    }


    /**
     * Gets the biS_Quarterly_Audits__r value for this Best_in_Service_Main__c.
     * 
     * @return biS_Quarterly_Audits__r
     */
    public com.sforce.soap.enterprise.QueryResult getBiS_Quarterly_Audits__r() {
        return biS_Quarterly_Audits__r;
    }


    /**
     * Sets the biS_Quarterly_Audits__r value for this Best_in_Service_Main__c.
     * 
     * @param biS_Quarterly_Audits__r
     */
    public void setBiS_Quarterly_Audits__r(com.sforce.soap.enterprise.QueryResult biS_Quarterly_Audits__r) {
        this.biS_Quarterly_Audits__r = biS_Quarterly_Audits__r;
    }


    /**
     * Gets the biS_Start_Date__c value for this Best_in_Service_Main__c.
     * 
     * @return biS_Start_Date__c
     */
    public java.util.Date getBiS_Start_Date__c() {
        return biS_Start_Date__c;
    }


    /**
     * Sets the biS_Start_Date__c value for this Best_in_Service_Main__c.
     * 
     * @param biS_Start_Date__c
     */
    public void setBiS_Start_Date__c(java.util.Date biS_Start_Date__c) {
        this.biS_Start_Date__c = biS_Start_Date__c;
    }


    /**
     * Gets the bis_Third_Audit_Date__c value for this Best_in_Service_Main__c.
     * 
     * @return bis_Third_Audit_Date__c
     */
    public java.util.Date getBis_Third_Audit_Date__c() {
        return bis_Third_Audit_Date__c;
    }


    /**
     * Sets the bis_Third_Audit_Date__c value for this Best_in_Service_Main__c.
     * 
     * @param bis_Third_Audit_Date__c
     */
    public void setBis_Third_Audit_Date__c(java.util.Date bis_Third_Audit_Date__c) {
        this.bis_Third_Audit_Date__c = bis_Third_Audit_Date__c;
    }


    /**
     * Gets the createdBy value for this Best_in_Service_Main__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Best_in_Service_Main__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Best_in_Service_Main__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Best_in_Service_Main__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Best_in_Service_Main__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Best_in_Service_Main__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the data_Returned_Date__c value for this Best_in_Service_Main__c.
     * 
     * @return data_Returned_Date__c
     */
    public java.util.Date getData_Returned_Date__c() {
        return data_Returned_Date__c;
    }


    /**
     * Sets the data_Returned_Date__c value for this Best_in_Service_Main__c.
     * 
     * @param data_Returned_Date__c
     */
    public void setData_Returned_Date__c(java.util.Date data_Returned_Date__c) {
        this.data_Returned_Date__c = data_Returned_Date__c;
    }


    /**
     * Gets the date_Appeal_Form_Received__c value for this Best_in_Service_Main__c.
     * 
     * @return date_Appeal_Form_Received__c
     */
    public java.util.Date getDate_Appeal_Form_Received__c() {
        return date_Appeal_Form_Received__c;
    }


    /**
     * Sets the date_Appeal_Form_Received__c value for this Best_in_Service_Main__c.
     * 
     * @param date_Appeal_Form_Received__c
     */
    public void setDate_Appeal_Form_Received__c(java.util.Date date_Appeal_Form_Received__c) {
        this.date_Appeal_Form_Received__c = date_Appeal_Form_Received__c;
    }


    /**
     * Gets the date_Appeal_Form_Sent__c value for this Best_in_Service_Main__c.
     * 
     * @return date_Appeal_Form_Sent__c
     */
    public java.util.Date getDate_Appeal_Form_Sent__c() {
        return date_Appeal_Form_Sent__c;
    }


    /**
     * Sets the date_Appeal_Form_Sent__c value for this Best_in_Service_Main__c.
     * 
     * @param date_Appeal_Form_Sent__c
     */
    public void setDate_Appeal_Form_Sent__c(java.util.Date date_Appeal_Form_Sent__c) {
        this.date_Appeal_Form_Sent__c = date_Appeal_Form_Sent__c;
    }


    /**
     * Gets the date_Banner_Sent__c value for this Best_in_Service_Main__c.
     * 
     * @return date_Banner_Sent__c
     */
    public java.util.Date getDate_Banner_Sent__c() {
        return date_Banner_Sent__c;
    }


    /**
     * Sets the date_Banner_Sent__c value for this Best_in_Service_Main__c.
     * 
     * @param date_Banner_Sent__c
     */
    public void setDate_Banner_Sent__c(java.util.Date date_Banner_Sent__c) {
        this.date_Banner_Sent__c = date_Banner_Sent__c;
    }


    /**
     * Gets the date_Became_PHP__c value for this Best_in_Service_Main__c.
     * 
     * @return date_Became_PHP__c
     */
    public java.util.Date getDate_Became_PHP__c() {
        return date_Became_PHP__c;
    }


    /**
     * Sets the date_Became_PHP__c value for this Best_in_Service_Main__c.
     * 
     * @param date_Became_PHP__c
     */
    public void setDate_Became_PHP__c(java.util.Date date_Became_PHP__c) {
        this.date_Became_PHP__c = date_Became_PHP__c;
    }


    /**
     * Gets the date_Marketing_Was_Notified_by_QC__c value for this Best_in_Service_Main__c.
     * 
     * @return date_Marketing_Was_Notified_by_QC__c
     */
    public java.util.Date getDate_Marketing_Was_Notified_by_QC__c() {
        return date_Marketing_Was_Notified_by_QC__c;
    }


    /**
     * Sets the date_Marketing_Was_Notified_by_QC__c value for this Best_in_Service_Main__c.
     * 
     * @param date_Marketing_Was_Notified_by_QC__c
     */
    public void setDate_Marketing_Was_Notified_by_QC__c(java.util.Date date_Marketing_Was_Notified_by_QC__c) {
        this.date_Marketing_Was_Notified_by_QC__c = date_Marketing_Was_Notified_by_QC__c;
    }


    /**
     * Gets the date_Partner_Was_Notified__c value for this Best_in_Service_Main__c.
     * 
     * @return date_Partner_Was_Notified__c
     */
    public java.util.Date getDate_Partner_Was_Notified__c() {
        return date_Partner_Was_Notified__c;
    }


    /**
     * Sets the date_Partner_Was_Notified__c value for this Best_in_Service_Main__c.
     * 
     * @param date_Partner_Was_Notified__c
     */
    public void setDate_Partner_Was_Notified__c(java.util.Date date_Partner_Was_Notified__c) {
        this.date_Partner_Was_Notified__c = date_Partner_Was_Notified__c;
    }


    /**
     * Gets the date_Plaque_Sent__c value for this Best_in_Service_Main__c.
     * 
     * @return date_Plaque_Sent__c
     */
    public java.util.Date getDate_Plaque_Sent__c() {
        return date_Plaque_Sent__c;
    }


    /**
     * Sets the date_Plaque_Sent__c value for this Best_in_Service_Main__c.
     * 
     * @param date_Plaque_Sent__c
     */
    public void setDate_Plaque_Sent__c(java.util.Date date_Plaque_Sent__c) {
        this.date_Plaque_Sent__c = date_Plaque_Sent__c;
    }


    /**
     * Gets the environment_Analysis_Begin_Date__c value for this Best_in_Service_Main__c.
     * 
     * @return environment_Analysis_Begin_Date__c
     */
    public java.util.Date getEnvironment_Analysis_Begin_Date__c() {
        return environment_Analysis_Begin_Date__c;
    }


    /**
     * Sets the environment_Analysis_Begin_Date__c value for this Best_in_Service_Main__c.
     * 
     * @param environment_Analysis_Begin_Date__c
     */
    public void setEnvironment_Analysis_Begin_Date__c(java.util.Date environment_Analysis_Begin_Date__c) {
        this.environment_Analysis_Begin_Date__c = environment_Analysis_Begin_Date__c;
    }


    /**
     * Gets the environment_Analysis_End_Date__c value for this Best_in_Service_Main__c.
     * 
     * @return environment_Analysis_End_Date__c
     */
    public java.util.Date getEnvironment_Analysis_End_Date__c() {
        return environment_Analysis_End_Date__c;
    }


    /**
     * Sets the environment_Analysis_End_Date__c value for this Best_in_Service_Main__c.
     * 
     * @param environment_Analysis_End_Date__c
     */
    public void setEnvironment_Analysis_End_Date__c(java.util.Date environment_Analysis_End_Date__c) {
        this.environment_Analysis_End_Date__c = environment_Analysis_End_Date__c;
    }


    /**
     * Gets the environment_Analysis_Summary__c value for this Best_in_Service_Main__c.
     * 
     * @return environment_Analysis_Summary__c
     */
    public java.lang.String getEnvironment_Analysis_Summary__c() {
        return environment_Analysis_Summary__c;
    }


    /**
     * Sets the environment_Analysis_Summary__c value for this Best_in_Service_Main__c.
     * 
     * @param environment_Analysis_Summary__c
     */
    public void setEnvironment_Analysis_Summary__c(java.lang.String environment_Analysis_Summary__c) {
        this.environment_Analysis_Summary__c = environment_Analysis_Summary__c;
    }


    /**
     * Gets the environment_Analysis_Ticket__c value for this Best_in_Service_Main__c.
     * 
     * @return environment_Analysis_Ticket__c
     */
    public java.lang.String getEnvironment_Analysis_Ticket__c() {
        return environment_Analysis_Ticket__c;
    }


    /**
     * Sets the environment_Analysis_Ticket__c value for this Best_in_Service_Main__c.
     * 
     * @param environment_Analysis_Ticket__c
     */
    public void setEnvironment_Analysis_Ticket__c(java.lang.String environment_Analysis_Ticket__c) {
        this.environment_Analysis_Ticket__c = environment_Analysis_Ticket__c;
    }


    /**
     * Gets the environment_Analysis_Ticket__r value for this Best_in_Service_Main__c.
     * 
     * @return environment_Analysis_Ticket__r
     */
    public com.sforce.soap.enterprise.sobject._case getEnvironment_Analysis_Ticket__r() {
        return environment_Analysis_Ticket__r;
    }


    /**
     * Sets the environment_Analysis_Ticket__r value for this Best_in_Service_Main__c.
     * 
     * @param environment_Analysis_Ticket__r
     */
    public void setEnvironment_Analysis_Ticket__r(com.sforce.soap.enterprise.sobject._case environment_Analysis_Ticket__r) {
        this.environment_Analysis_Ticket__r = environment_Analysis_Ticket__r;
    }


    /**
     * Gets the environment_Eval_Begin_Date__c value for this Best_in_Service_Main__c.
     * 
     * @return environment_Eval_Begin_Date__c
     */
    public java.util.Date getEnvironment_Eval_Begin_Date__c() {
        return environment_Eval_Begin_Date__c;
    }


    /**
     * Sets the environment_Eval_Begin_Date__c value for this Best_in_Service_Main__c.
     * 
     * @param environment_Eval_Begin_Date__c
     */
    public void setEnvironment_Eval_Begin_Date__c(java.util.Date environment_Eval_Begin_Date__c) {
        this.environment_Eval_Begin_Date__c = environment_Eval_Begin_Date__c;
    }


    /**
     * Gets the environment_Eval_End_Date__c value for this Best_in_Service_Main__c.
     * 
     * @return environment_Eval_End_Date__c
     */
    public java.util.Date getEnvironment_Eval_End_Date__c() {
        return environment_Eval_End_Date__c;
    }


    /**
     * Sets the environment_Eval_End_Date__c value for this Best_in_Service_Main__c.
     * 
     * @param environment_Eval_End_Date__c
     */
    public void setEnvironment_Eval_End_Date__c(java.util.Date environment_Eval_End_Date__c) {
        this.environment_Eval_End_Date__c = environment_Eval_End_Date__c;
    }


    /**
     * Gets the environment_Eval_Escalation_Summary__c value for this Best_in_Service_Main__c.
     * 
     * @return environment_Eval_Escalation_Summary__c
     */
    public java.lang.String getEnvironment_Eval_Escalation_Summary__c() {
        return environment_Eval_Escalation_Summary__c;
    }


    /**
     * Sets the environment_Eval_Escalation_Summary__c value for this Best_in_Service_Main__c.
     * 
     * @param environment_Eval_Escalation_Summary__c
     */
    public void setEnvironment_Eval_Escalation_Summary__c(java.lang.String environment_Eval_Escalation_Summary__c) {
        this.environment_Eval_Escalation_Summary__c = environment_Eval_Escalation_Summary__c;
    }


    /**
     * Gets the environment_Eval_Escalation_Ticket_old__c value for this Best_in_Service_Main__c.
     * 
     * @return environment_Eval_Escalation_Ticket_old__c
     */
    public java.lang.Double getEnvironment_Eval_Escalation_Ticket_old__c() {
        return environment_Eval_Escalation_Ticket_old__c;
    }


    /**
     * Sets the environment_Eval_Escalation_Ticket_old__c value for this Best_in_Service_Main__c.
     * 
     * @param environment_Eval_Escalation_Ticket_old__c
     */
    public void setEnvironment_Eval_Escalation_Ticket_old__c(java.lang.Double environment_Eval_Escalation_Ticket_old__c) {
        this.environment_Eval_Escalation_Ticket_old__c = environment_Eval_Escalation_Ticket_old__c;
    }


    /**
     * Gets the environment_Evaluation_Ticket__c value for this Best_in_Service_Main__c.
     * 
     * @return environment_Evaluation_Ticket__c
     */
    public java.lang.String getEnvironment_Evaluation_Ticket__c() {
        return environment_Evaluation_Ticket__c;
    }


    /**
     * Sets the environment_Evaluation_Ticket__c value for this Best_in_Service_Main__c.
     * 
     * @param environment_Evaluation_Ticket__c
     */
    public void setEnvironment_Evaluation_Ticket__c(java.lang.String environment_Evaluation_Ticket__c) {
        this.environment_Evaluation_Ticket__c = environment_Evaluation_Ticket__c;
    }


    /**
     * Gets the environment_Evaluation_Ticket__r value for this Best_in_Service_Main__c.
     * 
     * @return environment_Evaluation_Ticket__r
     */
    public com.sforce.soap.enterprise.sobject._case getEnvironment_Evaluation_Ticket__r() {
        return environment_Evaluation_Ticket__r;
    }


    /**
     * Sets the environment_Evaluation_Ticket__r value for this Best_in_Service_Main__c.
     * 
     * @param environment_Evaluation_Ticket__r
     */
    public void setEnvironment_Evaluation_Ticket__r(com.sforce.soap.enterprise.sobject._case environment_Evaluation_Ticket__r) {
        this.environment_Evaluation_Ticket__r = environment_Evaluation_Ticket__r;
    }


    /**
     * Gets the escalation_Call_Date__c value for this Best_in_Service_Main__c.
     * 
     * @return escalation_Call_Date__c
     */
    public java.util.Date getEscalation_Call_Date__c() {
        return escalation_Call_Date__c;
    }


    /**
     * Sets the escalation_Call_Date__c value for this Best_in_Service_Main__c.
     * 
     * @param escalation_Call_Date__c
     */
    public void setEscalation_Call_Date__c(java.util.Date escalation_Call_Date__c) {
        this.escalation_Call_Date__c = escalation_Call_Date__c;
    }


    /**
     * Gets the escalation_Date__c value for this Best_in_Service_Main__c.
     * 
     * @return escalation_Date__c
     */
    public java.util.Date getEscalation_Date__c() {
        return escalation_Date__c;
    }


    /**
     * Sets the escalation_Date__c value for this Best_in_Service_Main__c.
     * 
     * @param escalation_Date__c
     */
    public void setEscalation_Date__c(java.util.Date escalation_Date__c) {
        this.escalation_Date__c = escalation_Date__c;
    }


    /**
     * Gets the events value for this Best_in_Service_Main__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Best_in_Service_Main__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Best_in_Service_Main__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Best_in_Service_Main__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the financial_Status__c value for this Best_in_Service_Main__c.
     * 
     * @return financial_Status__c
     */
    public java.lang.String getFinancial_Status__c() {
        return financial_Status__c;
    }


    /**
     * Sets the financial_Status__c value for this Best_in_Service_Main__c.
     * 
     * @param financial_Status__c
     */
    public void setFinancial_Status__c(java.lang.String financial_Status__c) {
        this.financial_Status__c = financial_Status__c;
    }


    /**
     * Gets the histories value for this Best_in_Service_Main__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Best_in_Service_Main__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the instances_on_Major_Release__c value for this Best_in_Service_Main__c.
     * 
     * @return instances_on_Major_Release__c
     */
    public java.lang.String getInstances_on_Major_Release__c() {
        return instances_on_Major_Release__c;
    }


    /**
     * Sets the instances_on_Major_Release__c value for this Best_in_Service_Main__c.
     * 
     * @param instances_on_Major_Release__c
     */
    public void setInstances_on_Major_Release__c(java.lang.String instances_on_Major_Release__c) {
        this.instances_on_Major_Release__c = instances_on_Major_Release__c;
    }


    /**
     * Gets the isDeleted value for this Best_in_Service_Main__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Best_in_Service_Main__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastActivityDate value for this Best_in_Service_Main__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Best_in_Service_Main__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this Best_in_Service_Main__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Best_in_Service_Main__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Best_in_Service_Main__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Best_in_Service_Main__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Best_in_Service_Main__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Best_in_Service_Main__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the latest_Version_of_PD_DFG__c value for this Best_in_Service_Main__c.
     * 
     * @return latest_Version_of_PD_DFG__c
     */
    public java.lang.String getLatest_Version_of_PD_DFG__c() {
        return latest_Version_of_PD_DFG__c;
    }


    /**
     * Sets the latest_Version_of_PD_DFG__c value for this Best_in_Service_Main__c.
     * 
     * @param latest_Version_of_PD_DFG__c
     */
    public void setLatest_Version_of_PD_DFG__c(java.lang.String latest_Version_of_PD_DFG__c) {
        this.latest_Version_of_PD_DFG__c = latest_Version_of_PD_DFG__c;
    }


    /**
     * Gets the month_Pass_Fail__c value for this Best_in_Service_Main__c.
     * 
     * @return month_Pass_Fail__c
     */
    public java.lang.Double getMonth_Pass_Fail__c() {
        return month_Pass_Fail__c;
    }


    /**
     * Sets the month_Pass_Fail__c value for this Best_in_Service_Main__c.
     * 
     * @param month_Pass_Fail__c
     */
    public void setMonth_Pass_Fail__c(java.lang.Double month_Pass_Fail__c) {
        this.month_Pass_Fail__c = month_Pass_Fail__c;
    }


    /**
     * Gets the mou_Received_Date__c value for this Best_in_Service_Main__c.
     * 
     * @return mou_Received_Date__c
     */
    public java.util.Date getMou_Received_Date__c() {
        return mou_Received_Date__c;
    }


    /**
     * Sets the mou_Received_Date__c value for this Best_in_Service_Main__c.
     * 
     * @param mou_Received_Date__c
     */
    public void setMou_Received_Date__c(java.util.Date mou_Received_Date__c) {
        this.mou_Received_Date__c = mou_Received_Date__c;
    }


    /**
     * Gets the mou_Sent_Date__c value for this Best_in_Service_Main__c.
     * 
     * @return mou_Sent_Date__c
     */
    public java.util.Date getMou_Sent_Date__c() {
        return mou_Sent_Date__c;
    }


    /**
     * Sets the mou_Sent_Date__c value for this Best_in_Service_Main__c.
     * 
     * @param mou_Sent_Date__c
     */
    public void setMou_Sent_Date__c(java.util.Date mou_Sent_Date__c) {
        this.mou_Sent_Date__c = mou_Sent_Date__c;
    }


    /**
     * Gets the name value for this Best_in_Service_Main__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Best_in_Service_Main__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Best_in_Service_Main__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Best_in_Service_Main__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Best_in_Service_Main__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Best_in_Service_Main__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the openActivities value for this Best_in_Service_Main__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this Best_in_Service_Main__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the owner value for this Best_in_Service_Main__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Best_in_Service_Main__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Best_in_Service_Main__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Best_in_Service_Main__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the PHP_Partner__c value for this Best_in_Service_Main__c.
     * 
     * @return PHP_Partner__c
     */
    public java.util.Date getPHP_Partner__c() {
        return PHP_Partner__c;
    }


    /**
     * Sets the PHP_Partner__c value for this Best_in_Service_Main__c.
     * 
     * @param PHP_Partner__c
     */
    public void setPHP_Partner__c(java.util.Date PHP_Partner__c) {
        this.PHP_Partner__c = PHP_Partner__c;
    }


    /**
     * Gets the POE_Comments__c value for this Best_in_Service_Main__c.
     * 
     * @return POE_Comments__c
     */
    public java.lang.String getPOE_Comments__c() {
        return POE_Comments__c;
    }


    /**
     * Sets the POE_Comments__c value for this Best_in_Service_Main__c.
     * 
     * @param POE_Comments__c
     */
    public void setPOE_Comments__c(java.lang.String POE_Comments__c) {
        this.POE_Comments__c = POE_Comments__c;
    }


    /**
     * Gets the POE_Ticket_Number__c value for this Best_in_Service_Main__c.
     * 
     * @return POE_Ticket_Number__c
     */
    public java.lang.String getPOE_Ticket_Number__c() {
        return POE_Ticket_Number__c;
    }


    /**
     * Sets the POE_Ticket_Number__c value for this Best_in_Service_Main__c.
     * 
     * @param POE_Ticket_Number__c
     */
    public void setPOE_Ticket_Number__c(java.lang.String POE_Ticket_Number__c) {
        this.POE_Ticket_Number__c = POE_Ticket_Number__c;
    }


    /**
     * Gets the POE_Ticket_Number__r value for this Best_in_Service_Main__c.
     * 
     * @return POE_Ticket_Number__r
     */
    public com.sforce.soap.enterprise.sobject._case getPOE_Ticket_Number__r() {
        return POE_Ticket_Number__r;
    }


    /**
     * Sets the POE_Ticket_Number__r value for this Best_in_Service_Main__c.
     * 
     * @param POE_Ticket_Number__r
     */
    public void setPOE_Ticket_Number__r(com.sforce.soap.enterprise.sobject._case POE_Ticket_Number__r) {
        this.POE_Ticket_Number__r = POE_Ticket_Number__r;
    }


    /**
     * Gets the POE_Ticket_Number_old__c value for this Best_in_Service_Main__c.
     * 
     * @return POE_Ticket_Number_old__c
     */
    public java.lang.String getPOE_Ticket_Number_old__c() {
        return POE_Ticket_Number_old__c;
    }


    /**
     * Sets the POE_Ticket_Number_old__c value for this Best_in_Service_Main__c.
     * 
     * @param POE_Ticket_Number_old__c
     */
    public void setPOE_Ticket_Number_old__c(java.lang.String POE_Ticket_Number_old__c) {
        this.POE_Ticket_Number_old__c = POE_Ticket_Number_old__c;
    }


    /**
     * Gets the POE_Ticket_Opened__c value for this Best_in_Service_Main__c.
     * 
     * @return POE_Ticket_Opened__c
     */
    public java.util.Date getPOE_Ticket_Opened__c() {
        return POE_Ticket_Opened__c;
    }


    /**
     * Sets the POE_Ticket_Opened__c value for this Best_in_Service_Main__c.
     * 
     * @param POE_Ticket_Opened__c
     */
    public void setPOE_Ticket_Opened__c(java.util.Date POE_Ticket_Opened__c) {
        this.POE_Ticket_Opened__c = POE_Ticket_Opened__c;
    }


    /**
     * Gets the partner_ID__c value for this Best_in_Service_Main__c.
     * 
     * @return partner_ID__c
     */
    public java.lang.String getPartner_ID__c() {
        return partner_ID__c;
    }


    /**
     * Sets the partner_ID__c value for this Best_in_Service_Main__c.
     * 
     * @param partner_ID__c
     */
    public void setPartner_ID__c(java.lang.String partner_ID__c) {
        this.partner_ID__c = partner_ID__c;
    }


    /**
     * Gets the pass_Fail__c value for this Best_in_Service_Main__c.
     * 
     * @return pass_Fail__c
     */
    public java.lang.String getPass_Fail__c() {
        return pass_Fail__c;
    }


    /**
     * Sets the pass_Fail__c value for this Best_in_Service_Main__c.
     * 
     * @param pass_Fail__c
     */
    public void setPass_Fail__c(java.lang.String pass_Fail__c) {
        this.pass_Fail__c = pass_Fail__c;
    }


    /**
     * Gets the plaque_Sent__c value for this Best_in_Service_Main__c.
     * 
     * @return plaque_Sent__c
     */
    public java.lang.Boolean getPlaque_Sent__c() {
        return plaque_Sent__c;
    }


    /**
     * Sets the plaque_Sent__c value for this Best_in_Service_Main__c.
     * 
     * @param plaque_Sent__c
     */
    public void setPlaque_Sent__c(java.lang.Boolean plaque_Sent__c) {
        this.plaque_Sent__c = plaque_Sent__c;
    }


    /**
     * Gets the processInstances value for this Best_in_Service_Main__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Best_in_Service_Main__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Best_in_Service_Main__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Best_in_Service_Main__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the RCAs__c value for this Best_in_Service_Main__c.
     * 
     * @return RCAs__c
     */
    public java.lang.String getRCAs__c() {
        return RCAs__c;
    }


    /**
     * Sets the RCAs__c value for this Best_in_Service_Main__c.
     * 
     * @param RCAs__c
     */
    public void setRCAs__c(java.lang.String RCAs__c) {
        this.RCAs__c = RCAs__c;
    }


    /**
     * Gets the RCSPs__c value for this Best_in_Service_Main__c.
     * 
     * @return RCSPs__c
     */
    public java.lang.String getRCSPs__c() {
        return RCSPs__c;
    }


    /**
     * Sets the RCSPs__c value for this Best_in_Service_Main__c.
     * 
     * @param RCSPs__c
     */
    public void setRCSPs__c(java.lang.String RCSPs__c) {
        this.RCSPs__c = RCSPs__c;
    }


    /**
     * Gets the reason_for_Fail__c value for this Best_in_Service_Main__c.
     * 
     * @return reason_for_Fail__c
     */
    public java.lang.String getReason_for_Fail__c() {
        return reason_for_Fail__c;
    }


    /**
     * Sets the reason_for_Fail__c value for this Best_in_Service_Main__c.
     * 
     * @param reason_for_Fail__c
     */
    public void setReason_for_Fail__c(java.lang.String reason_for_Fail__c) {
        this.reason_for_Fail__c = reason_for_Fail__c;
    }


    /**
     * Gets the reference_List__c value for this Best_in_Service_Main__c.
     * 
     * @return reference_List__c
     */
    public java.lang.String getReference_List__c() {
        return reference_List__c;
    }


    /**
     * Sets the reference_List__c value for this Best_in_Service_Main__c.
     * 
     * @param reference_List__c
     */
    public void setReference_List__c(java.lang.String reference_List__c) {
        this.reference_List__c = reference_List__c;
    }


    /**
     * Gets the results_Given_On__c value for this Best_in_Service_Main__c.
     * 
     * @return results_Given_On__c
     */
    public java.util.Date getResults_Given_On__c() {
        return results_Given_On__c;
    }


    /**
     * Sets the results_Given_On__c value for this Best_in_Service_Main__c.
     * 
     * @param results_Given_On__c
     */
    public void setResults_Given_On__c(java.util.Date results_Given_On__c) {
        this.results_Given_On__c = results_Given_On__c;
    }


    /**
     * Gets the short_Term_Call_Notes__c value for this Best_in_Service_Main__c.
     * 
     * @return short_Term_Call_Notes__c
     */
    public java.lang.String getShort_Term_Call_Notes__c() {
        return short_Term_Call_Notes__c;
    }


    /**
     * Sets the short_Term_Call_Notes__c value for this Best_in_Service_Main__c.
     * 
     * @param short_Term_Call_Notes__c
     */
    public void setShort_Term_Call_Notes__c(java.lang.String short_Term_Call_Notes__c) {
        this.short_Term_Call_Notes__c = short_Term_Call_Notes__c;
    }


    /**
     * Gets the status_Description__c value for this Best_in_Service_Main__c.
     * 
     * @return status_Description__c
     */
    public java.lang.String getStatus_Description__c() {
        return status_Description__c;
    }


    /**
     * Sets the status_Description__c value for this Best_in_Service_Main__c.
     * 
     * @param status_Description__c
     */
    public void setStatus_Description__c(java.lang.String status_Description__c) {
        this.status_Description__c = status_Description__c;
    }


    /**
     * Gets the status__c value for this Best_in_Service_Main__c.
     * 
     * @return status__c
     */
    public java.lang.String getStatus__c() {
        return status__c;
    }


    /**
     * Sets the status__c value for this Best_in_Service_Main__c.
     * 
     * @param status__c
     */
    public void setStatus__c(java.lang.String status__c) {
        this.status__c = status__c;
    }


    /**
     * Gets the surveys_Sent__c value for this Best_in_Service_Main__c.
     * 
     * @return surveys_Sent__c
     */
    public java.util.Date getSurveys_Sent__c() {
        return surveys_Sent__c;
    }


    /**
     * Sets the surveys_Sent__c value for this Best_in_Service_Main__c.
     * 
     * @param surveys_Sent__c
     */
    public void setSurveys_Sent__c(java.util.Date surveys_Sent__c) {
        this.surveys_Sent__c = surveys_Sent__c;
    }


    /**
     * Gets the systemModstamp value for this Best_in_Service_Main__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Best_in_Service_Main__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this Best_in_Service_Main__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Best_in_Service_Main__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the ticket_Sent_Date__c value for this Best_in_Service_Main__c.
     * 
     * @return ticket_Sent_Date__c
     */
    public java.util.Date getTicket_Sent_Date__c() {
        return ticket_Sent_Date__c;
    }


    /**
     * Sets the ticket_Sent_Date__c value for this Best_in_Service_Main__c.
     * 
     * @param ticket_Sent_Date__c
     */
    public void setTicket_Sent_Date__c(java.util.Date ticket_Sent_Date__c) {
        this.ticket_Sent_Date__c = ticket_Sent_Date__c;
    }


    /**
     * Gets the tier__c value for this Best_in_Service_Main__c.
     * 
     * @return tier__c
     */
    public java.lang.String getTier__c() {
        return tier__c;
    }


    /**
     * Sets the tier__c value for this Best_in_Service_Main__c.
     * 
     * @param tier__c
     */
    public void setTier__c(java.lang.String tier__c) {
        this.tier__c = tier__c;
    }


    /**
     * Gets the kIE_Owner__c value for this Best_in_Service_Main__c.
     * 
     * @return kIE_Owner__c
     */
    public java.lang.String getKIE_Owner__c() {
        return kIE_Owner__c;
    }


    /**
     * Sets the kIE_Owner__c value for this Best_in_Service_Main__c.
     * 
     * @param kIE_Owner__c
     */
    public void setKIE_Owner__c(java.lang.String kIE_Owner__c) {
        this.kIE_Owner__c = kIE_Owner__c;
    }


    /**
     * Gets the kIE_Owner__r value for this Best_in_Service_Main__c.
     * 
     * @return kIE_Owner__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getKIE_Owner__r() {
        return kIE_Owner__r;
    }


    /**
     * Sets the kIE_Owner__r value for this Best_in_Service_Main__c.
     * 
     * @param kIE_Owner__r
     */
    public void setKIE_Owner__r(com.sforce.soap.enterprise.sobject.Contact kIE_Owner__r) {
        this.kIE_Owner__r = kIE_Owner__r;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Best_in_Service_Main__c)) return false;
        Best_in_Service_Main__c other = (Best_in_Service_Main__c) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.account_Owner__c==null && other.getAccount_Owner__c()==null) || 
             (this.account_Owner__c!=null &&
              this.account_Owner__c.equals(other.getAccount_Owner__c()))) &&
            ((this.account__c==null && other.getAccount__c()==null) || 
             (this.account__c!=null &&
              this.account__c.equals(other.getAccount__c()))) &&
            ((this.account__r==null && other.getAccount__r()==null) || 
             (this.account__r!=null &&
              this.account__r.equals(other.getAccount__r()))) &&
            ((this.activityHistories==null && other.getActivityHistories()==null) || 
             (this.activityHistories!=null &&
              this.activityHistories.equals(other.getActivityHistories()))) &&
            ((this.appeal_Form_Received__c==null && other.getAppeal_Form_Received__c()==null) || 
             (this.appeal_Form_Received__c!=null &&
              this.appeal_Form_Received__c.equals(other.getAppeal_Form_Received__c()))) &&
            ((this.appeal_Form_Sent__c==null && other.getAppeal_Form_Sent__c()==null) || 
             (this.appeal_Form_Sent__c!=null &&
              this.appeal_Form_Sent__c.equals(other.getAppeal_Form_Sent__c()))) &&
            ((this.application_Type__c==null && other.getApplication_Type__c()==null) || 
             (this.application_Type__c!=null &&
              this.application_Type__c.equals(other.getApplication_Type__c()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.average_users__c==null && other.getAverage_users__c()==null) || 
             (this.average_users__c!=null &&
              this.average_users__c.equals(other.getAverage_users__c()))) &&
            ((this.BIS_Second_Audit_Due_Date__c==null && other.getBIS_Second_Audit_Due_Date__c()==null) || 
             (this.BIS_Second_Audit_Due_Date__c!=null &&
              this.BIS_Second_Audit_Due_Date__c.equals(other.getBIS_Second_Audit_Due_Date__c()))) &&
            ((this.banner_Sent__c==null && other.getBanner_Sent__c()==null) || 
             (this.banner_Sent__c!=null &&
              this.banner_Sent__c.equals(other.getBanner_Sent__c()))) &&
            ((this.best_In_Service_Surveys__r==null && other.getBest_In_Service_Surveys__r()==null) || 
             (this.best_In_Service_Surveys__r!=null &&
              this.best_In_Service_Surveys__r.equals(other.getBest_In_Service_Surveys__r()))) &&
            ((this.biS_Audit_Due_Date__c==null && other.getBiS_Audit_Due_Date__c()==null) || 
             (this.biS_Audit_Due_Date__c!=null &&
              this.biS_Audit_Due_Date__c.equals(other.getBiS_Audit_Due_Date__c()))) &&
            ((this.biS_Contact__r==null && other.getBiS_Contact__r()==null) || 
             (this.biS_Contact__r!=null &&
              this.biS_Contact__r.equals(other.getBiS_Contact__r()))) &&
            ((this.biS_Quarterly_Audits__r==null && other.getBiS_Quarterly_Audits__r()==null) || 
             (this.biS_Quarterly_Audits__r!=null &&
              this.biS_Quarterly_Audits__r.equals(other.getBiS_Quarterly_Audits__r()))) &&
            ((this.biS_Start_Date__c==null && other.getBiS_Start_Date__c()==null) || 
             (this.biS_Start_Date__c!=null &&
              this.biS_Start_Date__c.equals(other.getBiS_Start_Date__c()))) &&
            ((this.bis_Third_Audit_Date__c==null && other.getBis_Third_Audit_Date__c()==null) || 
             (this.bis_Third_Audit_Date__c!=null &&
              this.bis_Third_Audit_Date__c.equals(other.getBis_Third_Audit_Date__c()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.data_Returned_Date__c==null && other.getData_Returned_Date__c()==null) || 
             (this.data_Returned_Date__c!=null &&
              this.data_Returned_Date__c.equals(other.getData_Returned_Date__c()))) &&
            ((this.date_Appeal_Form_Received__c==null && other.getDate_Appeal_Form_Received__c()==null) || 
             (this.date_Appeal_Form_Received__c!=null &&
              this.date_Appeal_Form_Received__c.equals(other.getDate_Appeal_Form_Received__c()))) &&
            ((this.date_Appeal_Form_Sent__c==null && other.getDate_Appeal_Form_Sent__c()==null) || 
             (this.date_Appeal_Form_Sent__c!=null &&
              this.date_Appeal_Form_Sent__c.equals(other.getDate_Appeal_Form_Sent__c()))) &&
            ((this.date_Banner_Sent__c==null && other.getDate_Banner_Sent__c()==null) || 
             (this.date_Banner_Sent__c!=null &&
              this.date_Banner_Sent__c.equals(other.getDate_Banner_Sent__c()))) &&
            ((this.date_Became_PHP__c==null && other.getDate_Became_PHP__c()==null) || 
             (this.date_Became_PHP__c!=null &&
              this.date_Became_PHP__c.equals(other.getDate_Became_PHP__c()))) &&
            ((this.date_Marketing_Was_Notified_by_QC__c==null && other.getDate_Marketing_Was_Notified_by_QC__c()==null) || 
             (this.date_Marketing_Was_Notified_by_QC__c!=null &&
              this.date_Marketing_Was_Notified_by_QC__c.equals(other.getDate_Marketing_Was_Notified_by_QC__c()))) &&
            ((this.date_Partner_Was_Notified__c==null && other.getDate_Partner_Was_Notified__c()==null) || 
             (this.date_Partner_Was_Notified__c!=null &&
              this.date_Partner_Was_Notified__c.equals(other.getDate_Partner_Was_Notified__c()))) &&
            ((this.date_Plaque_Sent__c==null && other.getDate_Plaque_Sent__c()==null) || 
             (this.date_Plaque_Sent__c!=null &&
              this.date_Plaque_Sent__c.equals(other.getDate_Plaque_Sent__c()))) &&
            ((this.environment_Analysis_Begin_Date__c==null && other.getEnvironment_Analysis_Begin_Date__c()==null) || 
             (this.environment_Analysis_Begin_Date__c!=null &&
              this.environment_Analysis_Begin_Date__c.equals(other.getEnvironment_Analysis_Begin_Date__c()))) &&
            ((this.environment_Analysis_End_Date__c==null && other.getEnvironment_Analysis_End_Date__c()==null) || 
             (this.environment_Analysis_End_Date__c!=null &&
              this.environment_Analysis_End_Date__c.equals(other.getEnvironment_Analysis_End_Date__c()))) &&
            ((this.environment_Analysis_Summary__c==null && other.getEnvironment_Analysis_Summary__c()==null) || 
             (this.environment_Analysis_Summary__c!=null &&
              this.environment_Analysis_Summary__c.equals(other.getEnvironment_Analysis_Summary__c()))) &&
            ((this.environment_Analysis_Ticket__c==null && other.getEnvironment_Analysis_Ticket__c()==null) || 
             (this.environment_Analysis_Ticket__c!=null &&
              this.environment_Analysis_Ticket__c.equals(other.getEnvironment_Analysis_Ticket__c()))) &&
            ((this.environment_Analysis_Ticket__r==null && other.getEnvironment_Analysis_Ticket__r()==null) || 
             (this.environment_Analysis_Ticket__r!=null &&
              this.environment_Analysis_Ticket__r.equals(other.getEnvironment_Analysis_Ticket__r()))) &&
            ((this.environment_Eval_Begin_Date__c==null && other.getEnvironment_Eval_Begin_Date__c()==null) || 
             (this.environment_Eval_Begin_Date__c!=null &&
              this.environment_Eval_Begin_Date__c.equals(other.getEnvironment_Eval_Begin_Date__c()))) &&
            ((this.environment_Eval_End_Date__c==null && other.getEnvironment_Eval_End_Date__c()==null) || 
             (this.environment_Eval_End_Date__c!=null &&
              this.environment_Eval_End_Date__c.equals(other.getEnvironment_Eval_End_Date__c()))) &&
            ((this.environment_Eval_Escalation_Summary__c==null && other.getEnvironment_Eval_Escalation_Summary__c()==null) || 
             (this.environment_Eval_Escalation_Summary__c!=null &&
              this.environment_Eval_Escalation_Summary__c.equals(other.getEnvironment_Eval_Escalation_Summary__c()))) &&
            ((this.environment_Eval_Escalation_Ticket_old__c==null && other.getEnvironment_Eval_Escalation_Ticket_old__c()==null) || 
             (this.environment_Eval_Escalation_Ticket_old__c!=null &&
              this.environment_Eval_Escalation_Ticket_old__c.equals(other.getEnvironment_Eval_Escalation_Ticket_old__c()))) &&
            ((this.environment_Evaluation_Ticket__c==null && other.getEnvironment_Evaluation_Ticket__c()==null) || 
             (this.environment_Evaluation_Ticket__c!=null &&
              this.environment_Evaluation_Ticket__c.equals(other.getEnvironment_Evaluation_Ticket__c()))) &&
            ((this.environment_Evaluation_Ticket__r==null && other.getEnvironment_Evaluation_Ticket__r()==null) || 
             (this.environment_Evaluation_Ticket__r!=null &&
              this.environment_Evaluation_Ticket__r.equals(other.getEnvironment_Evaluation_Ticket__r()))) &&
            ((this.escalation_Call_Date__c==null && other.getEscalation_Call_Date__c()==null) || 
             (this.escalation_Call_Date__c!=null &&
              this.escalation_Call_Date__c.equals(other.getEscalation_Call_Date__c()))) &&
            ((this.escalation_Date__c==null && other.getEscalation_Date__c()==null) || 
             (this.escalation_Date__c!=null &&
              this.escalation_Date__c.equals(other.getEscalation_Date__c()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              this.events.equals(other.getEvents()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.financial_Status__c==null && other.getFinancial_Status__c()==null) || 
             (this.financial_Status__c!=null &&
              this.financial_Status__c.equals(other.getFinancial_Status__c()))) &&
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
            ((this.instances_on_Major_Release__c==null && other.getInstances_on_Major_Release__c()==null) || 
             (this.instances_on_Major_Release__c!=null &&
              this.instances_on_Major_Release__c.equals(other.getInstances_on_Major_Release__c()))) &&
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
            ((this.latest_Version_of_PD_DFG__c==null && other.getLatest_Version_of_PD_DFG__c()==null) || 
             (this.latest_Version_of_PD_DFG__c!=null &&
              this.latest_Version_of_PD_DFG__c.equals(other.getLatest_Version_of_PD_DFG__c()))) &&
            ((this.month_Pass_Fail__c==null && other.getMonth_Pass_Fail__c()==null) || 
             (this.month_Pass_Fail__c!=null &&
              this.month_Pass_Fail__c.equals(other.getMonth_Pass_Fail__c()))) &&
            ((this.mou_Received_Date__c==null && other.getMou_Received_Date__c()==null) || 
             (this.mou_Received_Date__c!=null &&
              this.mou_Received_Date__c.equals(other.getMou_Received_Date__c()))) &&
            ((this.mou_Sent_Date__c==null && other.getMou_Sent_Date__c()==null) || 
             (this.mou_Sent_Date__c!=null &&
              this.mou_Sent_Date__c.equals(other.getMou_Sent_Date__c()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.openActivities==null && other.getOpenActivities()==null) || 
             (this.openActivities!=null &&
              this.openActivities.equals(other.getOpenActivities()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.PHP_Partner__c==null && other.getPHP_Partner__c()==null) || 
             (this.PHP_Partner__c!=null &&
              this.PHP_Partner__c.equals(other.getPHP_Partner__c()))) &&
            ((this.POE_Comments__c==null && other.getPOE_Comments__c()==null) || 
             (this.POE_Comments__c!=null &&
              this.POE_Comments__c.equals(other.getPOE_Comments__c()))) &&
            ((this.POE_Ticket_Number__c==null && other.getPOE_Ticket_Number__c()==null) || 
             (this.POE_Ticket_Number__c!=null &&
              this.POE_Ticket_Number__c.equals(other.getPOE_Ticket_Number__c()))) &&
            ((this.POE_Ticket_Number__r==null && other.getPOE_Ticket_Number__r()==null) || 
             (this.POE_Ticket_Number__r!=null &&
              this.POE_Ticket_Number__r.equals(other.getPOE_Ticket_Number__r()))) &&
            ((this.POE_Ticket_Number_old__c==null && other.getPOE_Ticket_Number_old__c()==null) || 
             (this.POE_Ticket_Number_old__c!=null &&
              this.POE_Ticket_Number_old__c.equals(other.getPOE_Ticket_Number_old__c()))) &&
            ((this.POE_Ticket_Opened__c==null && other.getPOE_Ticket_Opened__c()==null) || 
             (this.POE_Ticket_Opened__c!=null &&
              this.POE_Ticket_Opened__c.equals(other.getPOE_Ticket_Opened__c()))) &&
            ((this.partner_ID__c==null && other.getPartner_ID__c()==null) || 
             (this.partner_ID__c!=null &&
              this.partner_ID__c.equals(other.getPartner_ID__c()))) &&
            ((this.pass_Fail__c==null && other.getPass_Fail__c()==null) || 
             (this.pass_Fail__c!=null &&
              this.pass_Fail__c.equals(other.getPass_Fail__c()))) &&
            ((this.plaque_Sent__c==null && other.getPlaque_Sent__c()==null) || 
             (this.plaque_Sent__c!=null &&
              this.plaque_Sent__c.equals(other.getPlaque_Sent__c()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.RCAs__c==null && other.getRCAs__c()==null) || 
             (this.RCAs__c!=null &&
              this.RCAs__c.equals(other.getRCAs__c()))) &&
            ((this.RCSPs__c==null && other.getRCSPs__c()==null) || 
             (this.RCSPs__c!=null &&
              this.RCSPs__c.equals(other.getRCSPs__c()))) &&
            ((this.reason_for_Fail__c==null && other.getReason_for_Fail__c()==null) || 
             (this.reason_for_Fail__c!=null &&
              this.reason_for_Fail__c.equals(other.getReason_for_Fail__c()))) &&
            ((this.reference_List__c==null && other.getReference_List__c()==null) || 
             (this.reference_List__c!=null &&
              this.reference_List__c.equals(other.getReference_List__c()))) &&
            ((this.results_Given_On__c==null && other.getResults_Given_On__c()==null) || 
             (this.results_Given_On__c!=null &&
              this.results_Given_On__c.equals(other.getResults_Given_On__c()))) &&
            ((this.short_Term_Call_Notes__c==null && other.getShort_Term_Call_Notes__c()==null) || 
             (this.short_Term_Call_Notes__c!=null &&
              this.short_Term_Call_Notes__c.equals(other.getShort_Term_Call_Notes__c()))) &&
            ((this.status_Description__c==null && other.getStatus_Description__c()==null) || 
             (this.status_Description__c!=null &&
              this.status_Description__c.equals(other.getStatus_Description__c()))) &&
            ((this.status__c==null && other.getStatus__c()==null) || 
             (this.status__c!=null &&
              this.status__c.equals(other.getStatus__c()))) &&
            ((this.surveys_Sent__c==null && other.getSurveys_Sent__c()==null) || 
             (this.surveys_Sent__c!=null &&
              this.surveys_Sent__c.equals(other.getSurveys_Sent__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              this.tasks.equals(other.getTasks()))) &&
            ((this.ticket_Sent_Date__c==null && other.getTicket_Sent_Date__c()==null) || 
             (this.ticket_Sent_Date__c!=null &&
              this.ticket_Sent_Date__c.equals(other.getTicket_Sent_Date__c()))) &&
            ((this.tier__c==null && other.getTier__c()==null) || 
             (this.tier__c!=null &&
              this.tier__c.equals(other.getTier__c()))) &&
            ((this.kIE_Owner__c==null && other.getKIE_Owner__c()==null) || 
             (this.kIE_Owner__c!=null &&
              this.kIE_Owner__c.equals(other.getKIE_Owner__c()))) &&
            ((this.kIE_Owner__r==null && other.getKIE_Owner__r()==null) || 
             (this.kIE_Owner__r!=null &&
              this.kIE_Owner__r.equals(other.getKIE_Owner__r())));
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
        if (getAccount_Owner__c() != null) {
            _hashCode += getAccount_Owner__c().hashCode();
        }
        if (getAccount__c() != null) {
            _hashCode += getAccount__c().hashCode();
        }
        if (getAccount__r() != null) {
            _hashCode += getAccount__r().hashCode();
        }
        if (getActivityHistories() != null) {
            _hashCode += getActivityHistories().hashCode();
        }
        if (getAppeal_Form_Received__c() != null) {
            _hashCode += getAppeal_Form_Received__c().hashCode();
        }
        if (getAppeal_Form_Sent__c() != null) {
            _hashCode += getAppeal_Form_Sent__c().hashCode();
        }
        if (getApplication_Type__c() != null) {
            _hashCode += getApplication_Type__c().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getAverage_users__c() != null) {
            _hashCode += getAverage_users__c().hashCode();
        }
        if (getBIS_Second_Audit_Due_Date__c() != null) {
            _hashCode += getBIS_Second_Audit_Due_Date__c().hashCode();
        }
        if (getBanner_Sent__c() != null) {
            _hashCode += getBanner_Sent__c().hashCode();
        }
        if (getBest_In_Service_Surveys__r() != null) {
            _hashCode += getBest_In_Service_Surveys__r().hashCode();
        }
        if (getBiS_Audit_Due_Date__c() != null) {
            _hashCode += getBiS_Audit_Due_Date__c().hashCode();
        }
        if (getBiS_Contact__r() != null) {
            _hashCode += getBiS_Contact__r().hashCode();
        }
        if (getBiS_Quarterly_Audits__r() != null) {
            _hashCode += getBiS_Quarterly_Audits__r().hashCode();
        }
        if (getBiS_Start_Date__c() != null) {
            _hashCode += getBiS_Start_Date__c().hashCode();
        }
        if (getBis_Third_Audit_Date__c() != null) {
            _hashCode += getBis_Third_Audit_Date__c().hashCode();
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
        if (getData_Returned_Date__c() != null) {
            _hashCode += getData_Returned_Date__c().hashCode();
        }
        if (getDate_Appeal_Form_Received__c() != null) {
            _hashCode += getDate_Appeal_Form_Received__c().hashCode();
        }
        if (getDate_Appeal_Form_Sent__c() != null) {
            _hashCode += getDate_Appeal_Form_Sent__c().hashCode();
        }
        if (getDate_Banner_Sent__c() != null) {
            _hashCode += getDate_Banner_Sent__c().hashCode();
        }
        if (getDate_Became_PHP__c() != null) {
            _hashCode += getDate_Became_PHP__c().hashCode();
        }
        if (getDate_Marketing_Was_Notified_by_QC__c() != null) {
            _hashCode += getDate_Marketing_Was_Notified_by_QC__c().hashCode();
        }
        if (getDate_Partner_Was_Notified__c() != null) {
            _hashCode += getDate_Partner_Was_Notified__c().hashCode();
        }
        if (getDate_Plaque_Sent__c() != null) {
            _hashCode += getDate_Plaque_Sent__c().hashCode();
        }
        if (getEnvironment_Analysis_Begin_Date__c() != null) {
            _hashCode += getEnvironment_Analysis_Begin_Date__c().hashCode();
        }
        if (getEnvironment_Analysis_End_Date__c() != null) {
            _hashCode += getEnvironment_Analysis_End_Date__c().hashCode();
        }
        if (getEnvironment_Analysis_Summary__c() != null) {
            _hashCode += getEnvironment_Analysis_Summary__c().hashCode();
        }
        if (getEnvironment_Analysis_Ticket__c() != null) {
            _hashCode += getEnvironment_Analysis_Ticket__c().hashCode();
        }
        if (getEnvironment_Analysis_Ticket__r() != null) {
            _hashCode += getEnvironment_Analysis_Ticket__r().hashCode();
        }
        if (getEnvironment_Eval_Begin_Date__c() != null) {
            _hashCode += getEnvironment_Eval_Begin_Date__c().hashCode();
        }
        if (getEnvironment_Eval_End_Date__c() != null) {
            _hashCode += getEnvironment_Eval_End_Date__c().hashCode();
        }
        if (getEnvironment_Eval_Escalation_Summary__c() != null) {
            _hashCode += getEnvironment_Eval_Escalation_Summary__c().hashCode();
        }
        if (getEnvironment_Eval_Escalation_Ticket_old__c() != null) {
            _hashCode += getEnvironment_Eval_Escalation_Ticket_old__c().hashCode();
        }
        if (getEnvironment_Evaluation_Ticket__c() != null) {
            _hashCode += getEnvironment_Evaluation_Ticket__c().hashCode();
        }
        if (getEnvironment_Evaluation_Ticket__r() != null) {
            _hashCode += getEnvironment_Evaluation_Ticket__r().hashCode();
        }
        if (getEscalation_Call_Date__c() != null) {
            _hashCode += getEscalation_Call_Date__c().hashCode();
        }
        if (getEscalation_Date__c() != null) {
            _hashCode += getEscalation_Date__c().hashCode();
        }
        if (getEvents() != null) {
            _hashCode += getEvents().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getFinancial_Status__c() != null) {
            _hashCode += getFinancial_Status__c().hashCode();
        }
        if (getHistories() != null) {
            _hashCode += getHistories().hashCode();
        }
        if (getInstances_on_Major_Release__c() != null) {
            _hashCode += getInstances_on_Major_Release__c().hashCode();
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
        if (getLatest_Version_of_PD_DFG__c() != null) {
            _hashCode += getLatest_Version_of_PD_DFG__c().hashCode();
        }
        if (getMonth_Pass_Fail__c() != null) {
            _hashCode += getMonth_Pass_Fail__c().hashCode();
        }
        if (getMou_Received_Date__c() != null) {
            _hashCode += getMou_Received_Date__c().hashCode();
        }
        if (getMou_Sent_Date__c() != null) {
            _hashCode += getMou_Sent_Date__c().hashCode();
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
        if (getOpenActivities() != null) {
            _hashCode += getOpenActivities().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getPHP_Partner__c() != null) {
            _hashCode += getPHP_Partner__c().hashCode();
        }
        if (getPOE_Comments__c() != null) {
            _hashCode += getPOE_Comments__c().hashCode();
        }
        if (getPOE_Ticket_Number__c() != null) {
            _hashCode += getPOE_Ticket_Number__c().hashCode();
        }
        if (getPOE_Ticket_Number__r() != null) {
            _hashCode += getPOE_Ticket_Number__r().hashCode();
        }
        if (getPOE_Ticket_Number_old__c() != null) {
            _hashCode += getPOE_Ticket_Number_old__c().hashCode();
        }
        if (getPOE_Ticket_Opened__c() != null) {
            _hashCode += getPOE_Ticket_Opened__c().hashCode();
        }
        if (getPartner_ID__c() != null) {
            _hashCode += getPartner_ID__c().hashCode();
        }
        if (getPass_Fail__c() != null) {
            _hashCode += getPass_Fail__c().hashCode();
        }
        if (getPlaque_Sent__c() != null) {
            _hashCode += getPlaque_Sent__c().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getRCAs__c() != null) {
            _hashCode += getRCAs__c().hashCode();
        }
        if (getRCSPs__c() != null) {
            _hashCode += getRCSPs__c().hashCode();
        }
        if (getReason_for_Fail__c() != null) {
            _hashCode += getReason_for_Fail__c().hashCode();
        }
        if (getReference_List__c() != null) {
            _hashCode += getReference_List__c().hashCode();
        }
        if (getResults_Given_On__c() != null) {
            _hashCode += getResults_Given_On__c().hashCode();
        }
        if (getShort_Term_Call_Notes__c() != null) {
            _hashCode += getShort_Term_Call_Notes__c().hashCode();
        }
        if (getStatus_Description__c() != null) {
            _hashCode += getStatus_Description__c().hashCode();
        }
        if (getStatus__c() != null) {
            _hashCode += getStatus__c().hashCode();
        }
        if (getSurveys_Sent__c() != null) {
            _hashCode += getSurveys_Sent__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTasks() != null) {
            _hashCode += getTasks().hashCode();
        }
        if (getTicket_Sent_Date__c() != null) {
            _hashCode += getTicket_Sent_Date__c().hashCode();
        }
        if (getTier__c() != null) {
            _hashCode += getTier__c().hashCode();
        }
        if (getKIE_Owner__c() != null) {
            _hashCode += getKIE_Owner__c().hashCode();
        }
        if (getKIE_Owner__r() != null) {
            _hashCode += getKIE_Owner__r().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Best_in_Service_Main__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Best_in_Service_Main__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account_Owner__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account_Owner__c"));
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
        elemField.setFieldName("appeal_Form_Received__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Appeal_Form_Received__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appeal_Form_Sent__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Appeal_Form_Sent__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("application_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Application_Type__c"));
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
        elemField.setFieldName("average_users__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Average_users__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BIS_Second_Audit_Due_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BIS_Second_Audit_Due_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("banner_Sent__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Banner_Sent__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("best_In_Service_Surveys__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Best_In_Service_Surveys__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biS_Audit_Due_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BiS_Audit_Due_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biS_Contact__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BiS_Contact__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biS_Quarterly_Audits__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BiS_Quarterly_Audits__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("bis_Third_Audit_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Bis_Third_Audit_Date__c"));
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
        elemField.setFieldName("data_Returned_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Data_Returned_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_Appeal_Form_Received__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Appeal_Form_Received__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_Appeal_Form_Sent__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Appeal_Form_Sent__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_Banner_Sent__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Banner_Sent__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("date_Marketing_Was_Notified_by_QC__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Marketing_Was_Notified_by_QC__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_Partner_Was_Notified__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Partner_Was_Notified__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_Plaque_Sent__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Plaque_Sent__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environment_Analysis_Begin_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Environment_Analysis_Begin_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environment_Analysis_End_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Environment_Analysis_End_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environment_Analysis_Summary__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Environment_Analysis_Summary__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environment_Analysis_Ticket__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Environment_Analysis_Ticket__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environment_Analysis_Ticket__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Environment_Analysis_Ticket__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environment_Eval_Begin_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Environment_Eval_Begin_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environment_Eval_End_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Environment_Eval_End_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environment_Eval_Escalation_Summary__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Environment_Eval_Escalation_Summary__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environment_Eval_Escalation_Ticket_old__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Environment_Eval_Escalation_Ticket_old__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environment_Evaluation_Ticket__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Environment_Evaluation_Ticket__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environment_Evaluation_Ticket__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Environment_Evaluation_Ticket__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalation_Call_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Escalation_Call_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalation_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Escalation_Date__c"));
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
        elemField.setFieldName("feedSubscriptionsForEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedSubscriptionsForEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("financial_Status__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Financial_Status__c"));
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
        elemField.setFieldName("instances_on_Major_Release__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Instances_on_Major_Release__c"));
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
        elemField.setFieldName("latest_Version_of_PD_DFG__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Latest_Version_of_PD_DFG__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("month_Pass_Fail__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Month_Pass_Fail__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mou_Received_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Mou_Received_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mou_Sent_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Mou_Sent_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("PHP_Partner__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PHP_Partner__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POE_Comments__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "POE_Comments__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POE_Ticket_Number__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "POE_Ticket_Number__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POE_Ticket_Number__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "POE_Ticket_Number__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POE_Ticket_Number_old__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "POE_Ticket_Number_old__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POE_Ticket_Opened__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "POE_Ticket_Opened__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partner_ID__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Partner_ID__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pass_Fail__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pass_Fail__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plaque_Sent__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Plaque_Sent__c"));
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
        elemField.setFieldName("RCAs__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCAs__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RCSPs__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCSPs__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason_for_Fail__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Reason_for_Fail__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference_List__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Reference_List__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("results_Given_On__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Results_Given_On__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("short_Term_Call_Notes__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Short_Term_Call_Notes__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status_Description__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status_Description__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("surveys_Sent__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Surveys_Sent__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("ticket_Sent_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Ticket_Sent_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("KIE_Owner__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "kIE_Owner__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KIE_Owner__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "kIE_Owner__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
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

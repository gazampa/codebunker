/**
 * Courier1__Courier_Schedule__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Courier1__Courier_Schedule__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.Double courier1__Approx_Executions_Per_Month__c;

    private java.lang.String courier1__Attachment_Extension__c;

    private java.lang.String courier1__Description__c;

    private java.lang.Boolean courier1__Don_t_Run_on_Weekends__c;

    private java.lang.String courier1__Email_Body__c;

    private java.lang.String courier1__Email_Format__c;

    private java.lang.String courier1__Email_Reply_To_Address__c;

    private java.lang.String courier1__Email_Reply_To_Name__c;

    private java.lang.String courier1__Email_Subject__c;

    private java.lang.Boolean courier1__Enabled__c;

    private java.util.Calendar courier1__Last_Run_Date_Display__c;

    private java.util.Calendar courier1__Last_Run_Date__c;

    private java.lang.String courier1__Last_Run_Status__c;

    private java.lang.String courier1__Merge_Output_File_Type__c;

    private java.lang.String courier1__Merge_Template_Id_Display__c;

    private java.lang.String courier1__Merge_Template_Id__c;

    private java.lang.String courier1__Merge_Template_Name_Display__c;

    private java.lang.String courier1__Merge_Template_Name__c;

    private java.util.Calendar courier1__Next_Run_Date__c;

    private java.util.Calendar courier1__Queued_Run_Date_Display__c;

    private java.util.Calendar courier1__Queued_Run_Date__c;

    private java.lang.Boolean courier1__Ready_to_Fire__c;

    private java.lang.String courier1__Recipient_Source__c;

    private com.sforce.soap.enterprise.QueryResult courier1__Recipients__r;

    private java.lang.String courier1__Report_Folder_Display__c;

    private java.lang.String courier1__Report_Folder__c;

    private java.lang.String courier1__Report_Id_Display__c;

    private java.lang.String courier1__Report_Id__c;

    private java.lang.String courier1__Report_Name_Display__c;

    private java.lang.String courier1__Report_Name_Report_Id__c;

    private java.lang.String courier1__Report_Name__c;

    private java.lang.String courier1__Report_Parameter__c;

    private java.lang.String courier1__Run_As__c;

    private java.lang.String courier1__Schedule_Title__c;

    private java.lang.String courier1__Start_Hour__c;

    private java.lang.String courier1__Stop_Hour__c;

    private java.lang.String courier1__Trigger_Hourly_Interval__c;

    private java.lang.String courier1__Trigger_Interval__c;

    private java.lang.String courier1__Trigger_Run_Day__c;

    private java.lang.String courier1__Trigger_Run_Time__c;

    private java.lang.String courier1__User_Location_Id__c;

    private java.lang.String courier1__Version__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private com.sforce.soap.enterprise.QueryResult events;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.lang.Boolean isDeleted;

    private java.util.Date lastActivityDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private com.sforce.soap.enterprise.QueryResult openActivities;

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    public Courier1__Courier_Schedule__c() {
    }

    public Courier1__Courier_Schedule__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.Double courier1__Approx_Executions_Per_Month__c,
           java.lang.String courier1__Attachment_Extension__c,
           java.lang.String courier1__Description__c,
           java.lang.Boolean courier1__Don_t_Run_on_Weekends__c,
           java.lang.String courier1__Email_Body__c,
           java.lang.String courier1__Email_Format__c,
           java.lang.String courier1__Email_Reply_To_Address__c,
           java.lang.String courier1__Email_Reply_To_Name__c,
           java.lang.String courier1__Email_Subject__c,
           java.lang.Boolean courier1__Enabled__c,
           java.util.Calendar courier1__Last_Run_Date_Display__c,
           java.util.Calendar courier1__Last_Run_Date__c,
           java.lang.String courier1__Last_Run_Status__c,
           java.lang.String courier1__Merge_Output_File_Type__c,
           java.lang.String courier1__Merge_Template_Id_Display__c,
           java.lang.String courier1__Merge_Template_Id__c,
           java.lang.String courier1__Merge_Template_Name_Display__c,
           java.lang.String courier1__Merge_Template_Name__c,
           java.util.Calendar courier1__Next_Run_Date__c,
           java.util.Calendar courier1__Queued_Run_Date_Display__c,
           java.util.Calendar courier1__Queued_Run_Date__c,
           java.lang.Boolean courier1__Ready_to_Fire__c,
           java.lang.String courier1__Recipient_Source__c,
           com.sforce.soap.enterprise.QueryResult courier1__Recipients__r,
           java.lang.String courier1__Report_Folder_Display__c,
           java.lang.String courier1__Report_Folder__c,
           java.lang.String courier1__Report_Id_Display__c,
           java.lang.String courier1__Report_Id__c,
           java.lang.String courier1__Report_Name_Display__c,
           java.lang.String courier1__Report_Name_Report_Id__c,
           java.lang.String courier1__Report_Name__c,
           java.lang.String courier1__Report_Parameter__c,
           java.lang.String courier1__Run_As__c,
           java.lang.String courier1__Schedule_Title__c,
           java.lang.String courier1__Start_Hour__c,
           java.lang.String courier1__Stop_Hour__c,
           java.lang.String courier1__Trigger_Hourly_Interval__c,
           java.lang.String courier1__Trigger_Interval__c,
           java.lang.String courier1__Trigger_Run_Day__c,
           java.lang.String courier1__Trigger_Run_Time__c,
           java.lang.String courier1__User_Location_Id__c,
           java.lang.String courier1__Version__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           com.sforce.soap.enterprise.QueryResult events,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.lang.Boolean isDeleted,
           java.util.Date lastActivityDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           com.sforce.soap.enterprise.QueryResult openActivities,
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks) {
        super(
            fieldsToNull,
            id);
        this.activityHistories = activityHistories;
        this.attachments = attachments;
        this.courier1__Approx_Executions_Per_Month__c = courier1__Approx_Executions_Per_Month__c;
        this.courier1__Attachment_Extension__c = courier1__Attachment_Extension__c;
        this.courier1__Description__c = courier1__Description__c;
        this.courier1__Don_t_Run_on_Weekends__c = courier1__Don_t_Run_on_Weekends__c;
        this.courier1__Email_Body__c = courier1__Email_Body__c;
        this.courier1__Email_Format__c = courier1__Email_Format__c;
        this.courier1__Email_Reply_To_Address__c = courier1__Email_Reply_To_Address__c;
        this.courier1__Email_Reply_To_Name__c = courier1__Email_Reply_To_Name__c;
        this.courier1__Email_Subject__c = courier1__Email_Subject__c;
        this.courier1__Enabled__c = courier1__Enabled__c;
        this.courier1__Last_Run_Date_Display__c = courier1__Last_Run_Date_Display__c;
        this.courier1__Last_Run_Date__c = courier1__Last_Run_Date__c;
        this.courier1__Last_Run_Status__c = courier1__Last_Run_Status__c;
        this.courier1__Merge_Output_File_Type__c = courier1__Merge_Output_File_Type__c;
        this.courier1__Merge_Template_Id_Display__c = courier1__Merge_Template_Id_Display__c;
        this.courier1__Merge_Template_Id__c = courier1__Merge_Template_Id__c;
        this.courier1__Merge_Template_Name_Display__c = courier1__Merge_Template_Name_Display__c;
        this.courier1__Merge_Template_Name__c = courier1__Merge_Template_Name__c;
        this.courier1__Next_Run_Date__c = courier1__Next_Run_Date__c;
        this.courier1__Queued_Run_Date_Display__c = courier1__Queued_Run_Date_Display__c;
        this.courier1__Queued_Run_Date__c = courier1__Queued_Run_Date__c;
        this.courier1__Ready_to_Fire__c = courier1__Ready_to_Fire__c;
        this.courier1__Recipient_Source__c = courier1__Recipient_Source__c;
        this.courier1__Recipients__r = courier1__Recipients__r;
        this.courier1__Report_Folder_Display__c = courier1__Report_Folder_Display__c;
        this.courier1__Report_Folder__c = courier1__Report_Folder__c;
        this.courier1__Report_Id_Display__c = courier1__Report_Id_Display__c;
        this.courier1__Report_Id__c = courier1__Report_Id__c;
        this.courier1__Report_Name_Display__c = courier1__Report_Name_Display__c;
        this.courier1__Report_Name_Report_Id__c = courier1__Report_Name_Report_Id__c;
        this.courier1__Report_Name__c = courier1__Report_Name__c;
        this.courier1__Report_Parameter__c = courier1__Report_Parameter__c;
        this.courier1__Run_As__c = courier1__Run_As__c;
        this.courier1__Schedule_Title__c = courier1__Schedule_Title__c;
        this.courier1__Start_Hour__c = courier1__Start_Hour__c;
        this.courier1__Stop_Hour__c = courier1__Stop_Hour__c;
        this.courier1__Trigger_Hourly_Interval__c = courier1__Trigger_Hourly_Interval__c;
        this.courier1__Trigger_Interval__c = courier1__Trigger_Interval__c;
        this.courier1__Trigger_Run_Day__c = courier1__Trigger_Run_Day__c;
        this.courier1__Trigger_Run_Time__c = courier1__Trigger_Run_Time__c;
        this.courier1__User_Location_Id__c = courier1__User_Location_Id__c;
        this.courier1__Version__c = courier1__Version__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.events = events;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.isDeleted = isDeleted;
        this.lastActivityDate = lastActivityDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.openActivities = openActivities;
        this.owner = owner;
        this.ownerId = ownerId;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
    }


    /**
     * Gets the activityHistories value for this Courier1__Courier_Schedule__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this Courier1__Courier_Schedule__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the attachments value for this Courier1__Courier_Schedule__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Courier1__Courier_Schedule__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the courier1__Approx_Executions_Per_Month__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Approx_Executions_Per_Month__c
     */
    public java.lang.Double getCourier1__Approx_Executions_Per_Month__c() {
        return courier1__Approx_Executions_Per_Month__c;
    }


    /**
     * Sets the courier1__Approx_Executions_Per_Month__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Approx_Executions_Per_Month__c
     */
    public void setCourier1__Approx_Executions_Per_Month__c(java.lang.Double courier1__Approx_Executions_Per_Month__c) {
        this.courier1__Approx_Executions_Per_Month__c = courier1__Approx_Executions_Per_Month__c;
    }


    /**
     * Gets the courier1__Attachment_Extension__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Attachment_Extension__c
     */
    public java.lang.String getCourier1__Attachment_Extension__c() {
        return courier1__Attachment_Extension__c;
    }


    /**
     * Sets the courier1__Attachment_Extension__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Attachment_Extension__c
     */
    public void setCourier1__Attachment_Extension__c(java.lang.String courier1__Attachment_Extension__c) {
        this.courier1__Attachment_Extension__c = courier1__Attachment_Extension__c;
    }


    /**
     * Gets the courier1__Description__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Description__c
     */
    public java.lang.String getCourier1__Description__c() {
        return courier1__Description__c;
    }


    /**
     * Sets the courier1__Description__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Description__c
     */
    public void setCourier1__Description__c(java.lang.String courier1__Description__c) {
        this.courier1__Description__c = courier1__Description__c;
    }


    /**
     * Gets the courier1__Don_t_Run_on_Weekends__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Don_t_Run_on_Weekends__c
     */
    public java.lang.Boolean getCourier1__Don_t_Run_on_Weekends__c() {
        return courier1__Don_t_Run_on_Weekends__c;
    }


    /**
     * Sets the courier1__Don_t_Run_on_Weekends__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Don_t_Run_on_Weekends__c
     */
    public void setCourier1__Don_t_Run_on_Weekends__c(java.lang.Boolean courier1__Don_t_Run_on_Weekends__c) {
        this.courier1__Don_t_Run_on_Weekends__c = courier1__Don_t_Run_on_Weekends__c;
    }


    /**
     * Gets the courier1__Email_Body__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Email_Body__c
     */
    public java.lang.String getCourier1__Email_Body__c() {
        return courier1__Email_Body__c;
    }


    /**
     * Sets the courier1__Email_Body__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Email_Body__c
     */
    public void setCourier1__Email_Body__c(java.lang.String courier1__Email_Body__c) {
        this.courier1__Email_Body__c = courier1__Email_Body__c;
    }


    /**
     * Gets the courier1__Email_Format__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Email_Format__c
     */
    public java.lang.String getCourier1__Email_Format__c() {
        return courier1__Email_Format__c;
    }


    /**
     * Sets the courier1__Email_Format__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Email_Format__c
     */
    public void setCourier1__Email_Format__c(java.lang.String courier1__Email_Format__c) {
        this.courier1__Email_Format__c = courier1__Email_Format__c;
    }


    /**
     * Gets the courier1__Email_Reply_To_Address__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Email_Reply_To_Address__c
     */
    public java.lang.String getCourier1__Email_Reply_To_Address__c() {
        return courier1__Email_Reply_To_Address__c;
    }


    /**
     * Sets the courier1__Email_Reply_To_Address__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Email_Reply_To_Address__c
     */
    public void setCourier1__Email_Reply_To_Address__c(java.lang.String courier1__Email_Reply_To_Address__c) {
        this.courier1__Email_Reply_To_Address__c = courier1__Email_Reply_To_Address__c;
    }


    /**
     * Gets the courier1__Email_Reply_To_Name__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Email_Reply_To_Name__c
     */
    public java.lang.String getCourier1__Email_Reply_To_Name__c() {
        return courier1__Email_Reply_To_Name__c;
    }


    /**
     * Sets the courier1__Email_Reply_To_Name__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Email_Reply_To_Name__c
     */
    public void setCourier1__Email_Reply_To_Name__c(java.lang.String courier1__Email_Reply_To_Name__c) {
        this.courier1__Email_Reply_To_Name__c = courier1__Email_Reply_To_Name__c;
    }


    /**
     * Gets the courier1__Email_Subject__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Email_Subject__c
     */
    public java.lang.String getCourier1__Email_Subject__c() {
        return courier1__Email_Subject__c;
    }


    /**
     * Sets the courier1__Email_Subject__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Email_Subject__c
     */
    public void setCourier1__Email_Subject__c(java.lang.String courier1__Email_Subject__c) {
        this.courier1__Email_Subject__c = courier1__Email_Subject__c;
    }


    /**
     * Gets the courier1__Enabled__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Enabled__c
     */
    public java.lang.Boolean getCourier1__Enabled__c() {
        return courier1__Enabled__c;
    }


    /**
     * Sets the courier1__Enabled__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Enabled__c
     */
    public void setCourier1__Enabled__c(java.lang.Boolean courier1__Enabled__c) {
        this.courier1__Enabled__c = courier1__Enabled__c;
    }


    /**
     * Gets the courier1__Last_Run_Date_Display__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Last_Run_Date_Display__c
     */
    public java.util.Calendar getCourier1__Last_Run_Date_Display__c() {
        return courier1__Last_Run_Date_Display__c;
    }


    /**
     * Sets the courier1__Last_Run_Date_Display__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Last_Run_Date_Display__c
     */
    public void setCourier1__Last_Run_Date_Display__c(java.util.Calendar courier1__Last_Run_Date_Display__c) {
        this.courier1__Last_Run_Date_Display__c = courier1__Last_Run_Date_Display__c;
    }


    /**
     * Gets the courier1__Last_Run_Date__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Last_Run_Date__c
     */
    public java.util.Calendar getCourier1__Last_Run_Date__c() {
        return courier1__Last_Run_Date__c;
    }


    /**
     * Sets the courier1__Last_Run_Date__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Last_Run_Date__c
     */
    public void setCourier1__Last_Run_Date__c(java.util.Calendar courier1__Last_Run_Date__c) {
        this.courier1__Last_Run_Date__c = courier1__Last_Run_Date__c;
    }


    /**
     * Gets the courier1__Last_Run_Status__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Last_Run_Status__c
     */
    public java.lang.String getCourier1__Last_Run_Status__c() {
        return courier1__Last_Run_Status__c;
    }


    /**
     * Sets the courier1__Last_Run_Status__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Last_Run_Status__c
     */
    public void setCourier1__Last_Run_Status__c(java.lang.String courier1__Last_Run_Status__c) {
        this.courier1__Last_Run_Status__c = courier1__Last_Run_Status__c;
    }


    /**
     * Gets the courier1__Merge_Output_File_Type__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Merge_Output_File_Type__c
     */
    public java.lang.String getCourier1__Merge_Output_File_Type__c() {
        return courier1__Merge_Output_File_Type__c;
    }


    /**
     * Sets the courier1__Merge_Output_File_Type__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Merge_Output_File_Type__c
     */
    public void setCourier1__Merge_Output_File_Type__c(java.lang.String courier1__Merge_Output_File_Type__c) {
        this.courier1__Merge_Output_File_Type__c = courier1__Merge_Output_File_Type__c;
    }


    /**
     * Gets the courier1__Merge_Template_Id_Display__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Merge_Template_Id_Display__c
     */
    public java.lang.String getCourier1__Merge_Template_Id_Display__c() {
        return courier1__Merge_Template_Id_Display__c;
    }


    /**
     * Sets the courier1__Merge_Template_Id_Display__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Merge_Template_Id_Display__c
     */
    public void setCourier1__Merge_Template_Id_Display__c(java.lang.String courier1__Merge_Template_Id_Display__c) {
        this.courier1__Merge_Template_Id_Display__c = courier1__Merge_Template_Id_Display__c;
    }


    /**
     * Gets the courier1__Merge_Template_Id__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Merge_Template_Id__c
     */
    public java.lang.String getCourier1__Merge_Template_Id__c() {
        return courier1__Merge_Template_Id__c;
    }


    /**
     * Sets the courier1__Merge_Template_Id__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Merge_Template_Id__c
     */
    public void setCourier1__Merge_Template_Id__c(java.lang.String courier1__Merge_Template_Id__c) {
        this.courier1__Merge_Template_Id__c = courier1__Merge_Template_Id__c;
    }


    /**
     * Gets the courier1__Merge_Template_Name_Display__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Merge_Template_Name_Display__c
     */
    public java.lang.String getCourier1__Merge_Template_Name_Display__c() {
        return courier1__Merge_Template_Name_Display__c;
    }


    /**
     * Sets the courier1__Merge_Template_Name_Display__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Merge_Template_Name_Display__c
     */
    public void setCourier1__Merge_Template_Name_Display__c(java.lang.String courier1__Merge_Template_Name_Display__c) {
        this.courier1__Merge_Template_Name_Display__c = courier1__Merge_Template_Name_Display__c;
    }


    /**
     * Gets the courier1__Merge_Template_Name__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Merge_Template_Name__c
     */
    public java.lang.String getCourier1__Merge_Template_Name__c() {
        return courier1__Merge_Template_Name__c;
    }


    /**
     * Sets the courier1__Merge_Template_Name__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Merge_Template_Name__c
     */
    public void setCourier1__Merge_Template_Name__c(java.lang.String courier1__Merge_Template_Name__c) {
        this.courier1__Merge_Template_Name__c = courier1__Merge_Template_Name__c;
    }


    /**
     * Gets the courier1__Next_Run_Date__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Next_Run_Date__c
     */
    public java.util.Calendar getCourier1__Next_Run_Date__c() {
        return courier1__Next_Run_Date__c;
    }


    /**
     * Sets the courier1__Next_Run_Date__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Next_Run_Date__c
     */
    public void setCourier1__Next_Run_Date__c(java.util.Calendar courier1__Next_Run_Date__c) {
        this.courier1__Next_Run_Date__c = courier1__Next_Run_Date__c;
    }


    /**
     * Gets the courier1__Queued_Run_Date_Display__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Queued_Run_Date_Display__c
     */
    public java.util.Calendar getCourier1__Queued_Run_Date_Display__c() {
        return courier1__Queued_Run_Date_Display__c;
    }


    /**
     * Sets the courier1__Queued_Run_Date_Display__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Queued_Run_Date_Display__c
     */
    public void setCourier1__Queued_Run_Date_Display__c(java.util.Calendar courier1__Queued_Run_Date_Display__c) {
        this.courier1__Queued_Run_Date_Display__c = courier1__Queued_Run_Date_Display__c;
    }


    /**
     * Gets the courier1__Queued_Run_Date__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Queued_Run_Date__c
     */
    public java.util.Calendar getCourier1__Queued_Run_Date__c() {
        return courier1__Queued_Run_Date__c;
    }


    /**
     * Sets the courier1__Queued_Run_Date__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Queued_Run_Date__c
     */
    public void setCourier1__Queued_Run_Date__c(java.util.Calendar courier1__Queued_Run_Date__c) {
        this.courier1__Queued_Run_Date__c = courier1__Queued_Run_Date__c;
    }


    /**
     * Gets the courier1__Ready_to_Fire__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Ready_to_Fire__c
     */
    public java.lang.Boolean getCourier1__Ready_to_Fire__c() {
        return courier1__Ready_to_Fire__c;
    }


    /**
     * Sets the courier1__Ready_to_Fire__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Ready_to_Fire__c
     */
    public void setCourier1__Ready_to_Fire__c(java.lang.Boolean courier1__Ready_to_Fire__c) {
        this.courier1__Ready_to_Fire__c = courier1__Ready_to_Fire__c;
    }


    /**
     * Gets the courier1__Recipient_Source__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Recipient_Source__c
     */
    public java.lang.String getCourier1__Recipient_Source__c() {
        return courier1__Recipient_Source__c;
    }


    /**
     * Sets the courier1__Recipient_Source__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Recipient_Source__c
     */
    public void setCourier1__Recipient_Source__c(java.lang.String courier1__Recipient_Source__c) {
        this.courier1__Recipient_Source__c = courier1__Recipient_Source__c;
    }


    /**
     * Gets the courier1__Recipients__r value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Recipients__r
     */
    public com.sforce.soap.enterprise.QueryResult getCourier1__Recipients__r() {
        return courier1__Recipients__r;
    }


    /**
     * Sets the courier1__Recipients__r value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Recipients__r
     */
    public void setCourier1__Recipients__r(com.sforce.soap.enterprise.QueryResult courier1__Recipients__r) {
        this.courier1__Recipients__r = courier1__Recipients__r;
    }


    /**
     * Gets the courier1__Report_Folder_Display__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Report_Folder_Display__c
     */
    public java.lang.String getCourier1__Report_Folder_Display__c() {
        return courier1__Report_Folder_Display__c;
    }


    /**
     * Sets the courier1__Report_Folder_Display__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Report_Folder_Display__c
     */
    public void setCourier1__Report_Folder_Display__c(java.lang.String courier1__Report_Folder_Display__c) {
        this.courier1__Report_Folder_Display__c = courier1__Report_Folder_Display__c;
    }


    /**
     * Gets the courier1__Report_Folder__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Report_Folder__c
     */
    public java.lang.String getCourier1__Report_Folder__c() {
        return courier1__Report_Folder__c;
    }


    /**
     * Sets the courier1__Report_Folder__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Report_Folder__c
     */
    public void setCourier1__Report_Folder__c(java.lang.String courier1__Report_Folder__c) {
        this.courier1__Report_Folder__c = courier1__Report_Folder__c;
    }


    /**
     * Gets the courier1__Report_Id_Display__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Report_Id_Display__c
     */
    public java.lang.String getCourier1__Report_Id_Display__c() {
        return courier1__Report_Id_Display__c;
    }


    /**
     * Sets the courier1__Report_Id_Display__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Report_Id_Display__c
     */
    public void setCourier1__Report_Id_Display__c(java.lang.String courier1__Report_Id_Display__c) {
        this.courier1__Report_Id_Display__c = courier1__Report_Id_Display__c;
    }


    /**
     * Gets the courier1__Report_Id__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Report_Id__c
     */
    public java.lang.String getCourier1__Report_Id__c() {
        return courier1__Report_Id__c;
    }


    /**
     * Sets the courier1__Report_Id__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Report_Id__c
     */
    public void setCourier1__Report_Id__c(java.lang.String courier1__Report_Id__c) {
        this.courier1__Report_Id__c = courier1__Report_Id__c;
    }


    /**
     * Gets the courier1__Report_Name_Display__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Report_Name_Display__c
     */
    public java.lang.String getCourier1__Report_Name_Display__c() {
        return courier1__Report_Name_Display__c;
    }


    /**
     * Sets the courier1__Report_Name_Display__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Report_Name_Display__c
     */
    public void setCourier1__Report_Name_Display__c(java.lang.String courier1__Report_Name_Display__c) {
        this.courier1__Report_Name_Display__c = courier1__Report_Name_Display__c;
    }


    /**
     * Gets the courier1__Report_Name_Report_Id__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Report_Name_Report_Id__c
     */
    public java.lang.String getCourier1__Report_Name_Report_Id__c() {
        return courier1__Report_Name_Report_Id__c;
    }


    /**
     * Sets the courier1__Report_Name_Report_Id__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Report_Name_Report_Id__c
     */
    public void setCourier1__Report_Name_Report_Id__c(java.lang.String courier1__Report_Name_Report_Id__c) {
        this.courier1__Report_Name_Report_Id__c = courier1__Report_Name_Report_Id__c;
    }


    /**
     * Gets the courier1__Report_Name__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Report_Name__c
     */
    public java.lang.String getCourier1__Report_Name__c() {
        return courier1__Report_Name__c;
    }


    /**
     * Sets the courier1__Report_Name__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Report_Name__c
     */
    public void setCourier1__Report_Name__c(java.lang.String courier1__Report_Name__c) {
        this.courier1__Report_Name__c = courier1__Report_Name__c;
    }


    /**
     * Gets the courier1__Report_Parameter__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Report_Parameter__c
     */
    public java.lang.String getCourier1__Report_Parameter__c() {
        return courier1__Report_Parameter__c;
    }


    /**
     * Sets the courier1__Report_Parameter__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Report_Parameter__c
     */
    public void setCourier1__Report_Parameter__c(java.lang.String courier1__Report_Parameter__c) {
        this.courier1__Report_Parameter__c = courier1__Report_Parameter__c;
    }


    /**
     * Gets the courier1__Run_As__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Run_As__c
     */
    public java.lang.String getCourier1__Run_As__c() {
        return courier1__Run_As__c;
    }


    /**
     * Sets the courier1__Run_As__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Run_As__c
     */
    public void setCourier1__Run_As__c(java.lang.String courier1__Run_As__c) {
        this.courier1__Run_As__c = courier1__Run_As__c;
    }


    /**
     * Gets the courier1__Schedule_Title__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Schedule_Title__c
     */
    public java.lang.String getCourier1__Schedule_Title__c() {
        return courier1__Schedule_Title__c;
    }


    /**
     * Sets the courier1__Schedule_Title__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Schedule_Title__c
     */
    public void setCourier1__Schedule_Title__c(java.lang.String courier1__Schedule_Title__c) {
        this.courier1__Schedule_Title__c = courier1__Schedule_Title__c;
    }


    /**
     * Gets the courier1__Start_Hour__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Start_Hour__c
     */
    public java.lang.String getCourier1__Start_Hour__c() {
        return courier1__Start_Hour__c;
    }


    /**
     * Sets the courier1__Start_Hour__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Start_Hour__c
     */
    public void setCourier1__Start_Hour__c(java.lang.String courier1__Start_Hour__c) {
        this.courier1__Start_Hour__c = courier1__Start_Hour__c;
    }


    /**
     * Gets the courier1__Stop_Hour__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Stop_Hour__c
     */
    public java.lang.String getCourier1__Stop_Hour__c() {
        return courier1__Stop_Hour__c;
    }


    /**
     * Sets the courier1__Stop_Hour__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Stop_Hour__c
     */
    public void setCourier1__Stop_Hour__c(java.lang.String courier1__Stop_Hour__c) {
        this.courier1__Stop_Hour__c = courier1__Stop_Hour__c;
    }


    /**
     * Gets the courier1__Trigger_Hourly_Interval__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Trigger_Hourly_Interval__c
     */
    public java.lang.String getCourier1__Trigger_Hourly_Interval__c() {
        return courier1__Trigger_Hourly_Interval__c;
    }


    /**
     * Sets the courier1__Trigger_Hourly_Interval__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Trigger_Hourly_Interval__c
     */
    public void setCourier1__Trigger_Hourly_Interval__c(java.lang.String courier1__Trigger_Hourly_Interval__c) {
        this.courier1__Trigger_Hourly_Interval__c = courier1__Trigger_Hourly_Interval__c;
    }


    /**
     * Gets the courier1__Trigger_Interval__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Trigger_Interval__c
     */
    public java.lang.String getCourier1__Trigger_Interval__c() {
        return courier1__Trigger_Interval__c;
    }


    /**
     * Sets the courier1__Trigger_Interval__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Trigger_Interval__c
     */
    public void setCourier1__Trigger_Interval__c(java.lang.String courier1__Trigger_Interval__c) {
        this.courier1__Trigger_Interval__c = courier1__Trigger_Interval__c;
    }


    /**
     * Gets the courier1__Trigger_Run_Day__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Trigger_Run_Day__c
     */
    public java.lang.String getCourier1__Trigger_Run_Day__c() {
        return courier1__Trigger_Run_Day__c;
    }


    /**
     * Sets the courier1__Trigger_Run_Day__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Trigger_Run_Day__c
     */
    public void setCourier1__Trigger_Run_Day__c(java.lang.String courier1__Trigger_Run_Day__c) {
        this.courier1__Trigger_Run_Day__c = courier1__Trigger_Run_Day__c;
    }


    /**
     * Gets the courier1__Trigger_Run_Time__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Trigger_Run_Time__c
     */
    public java.lang.String getCourier1__Trigger_Run_Time__c() {
        return courier1__Trigger_Run_Time__c;
    }


    /**
     * Sets the courier1__Trigger_Run_Time__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Trigger_Run_Time__c
     */
    public void setCourier1__Trigger_Run_Time__c(java.lang.String courier1__Trigger_Run_Time__c) {
        this.courier1__Trigger_Run_Time__c = courier1__Trigger_Run_Time__c;
    }


    /**
     * Gets the courier1__User_Location_Id__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__User_Location_Id__c
     */
    public java.lang.String getCourier1__User_Location_Id__c() {
        return courier1__User_Location_Id__c;
    }


    /**
     * Sets the courier1__User_Location_Id__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__User_Location_Id__c
     */
    public void setCourier1__User_Location_Id__c(java.lang.String courier1__User_Location_Id__c) {
        this.courier1__User_Location_Id__c = courier1__User_Location_Id__c;
    }


    /**
     * Gets the courier1__Version__c value for this Courier1__Courier_Schedule__c.
     * 
     * @return courier1__Version__c
     */
    public java.lang.String getCourier1__Version__c() {
        return courier1__Version__c;
    }


    /**
     * Sets the courier1__Version__c value for this Courier1__Courier_Schedule__c.
     * 
     * @param courier1__Version__c
     */
    public void setCourier1__Version__c(java.lang.String courier1__Version__c) {
        this.courier1__Version__c = courier1__Version__c;
    }


    /**
     * Gets the createdBy value for this Courier1__Courier_Schedule__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Courier1__Courier_Schedule__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Courier1__Courier_Schedule__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Courier1__Courier_Schedule__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Courier1__Courier_Schedule__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Courier1__Courier_Schedule__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the events value for this Courier1__Courier_Schedule__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Courier1__Courier_Schedule__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Courier1__Courier_Schedule__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Courier1__Courier_Schedule__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the isDeleted value for this Courier1__Courier_Schedule__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Courier1__Courier_Schedule__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastActivityDate value for this Courier1__Courier_Schedule__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Courier1__Courier_Schedule__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this Courier1__Courier_Schedule__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Courier1__Courier_Schedule__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Courier1__Courier_Schedule__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Courier1__Courier_Schedule__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Courier1__Courier_Schedule__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Courier1__Courier_Schedule__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this Courier1__Courier_Schedule__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Courier1__Courier_Schedule__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Courier1__Courier_Schedule__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Courier1__Courier_Schedule__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Courier1__Courier_Schedule__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Courier1__Courier_Schedule__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the openActivities value for this Courier1__Courier_Schedule__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this Courier1__Courier_Schedule__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the owner value for this Courier1__Courier_Schedule__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Courier1__Courier_Schedule__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Courier1__Courier_Schedule__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Courier1__Courier_Schedule__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this Courier1__Courier_Schedule__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Courier1__Courier_Schedule__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Courier1__Courier_Schedule__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Courier1__Courier_Schedule__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the systemModstamp value for this Courier1__Courier_Schedule__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Courier1__Courier_Schedule__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this Courier1__Courier_Schedule__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Courier1__Courier_Schedule__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Courier1__Courier_Schedule__c)) return false;
        Courier1__Courier_Schedule__c other = (Courier1__Courier_Schedule__c) obj;
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
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.courier1__Approx_Executions_Per_Month__c==null && other.getCourier1__Approx_Executions_Per_Month__c()==null) || 
             (this.courier1__Approx_Executions_Per_Month__c!=null &&
              this.courier1__Approx_Executions_Per_Month__c.equals(other.getCourier1__Approx_Executions_Per_Month__c()))) &&
            ((this.courier1__Attachment_Extension__c==null && other.getCourier1__Attachment_Extension__c()==null) || 
             (this.courier1__Attachment_Extension__c!=null &&
              this.courier1__Attachment_Extension__c.equals(other.getCourier1__Attachment_Extension__c()))) &&
            ((this.courier1__Description__c==null && other.getCourier1__Description__c()==null) || 
             (this.courier1__Description__c!=null &&
              this.courier1__Description__c.equals(other.getCourier1__Description__c()))) &&
            ((this.courier1__Don_t_Run_on_Weekends__c==null && other.getCourier1__Don_t_Run_on_Weekends__c()==null) || 
             (this.courier1__Don_t_Run_on_Weekends__c!=null &&
              this.courier1__Don_t_Run_on_Weekends__c.equals(other.getCourier1__Don_t_Run_on_Weekends__c()))) &&
            ((this.courier1__Email_Body__c==null && other.getCourier1__Email_Body__c()==null) || 
             (this.courier1__Email_Body__c!=null &&
              this.courier1__Email_Body__c.equals(other.getCourier1__Email_Body__c()))) &&
            ((this.courier1__Email_Format__c==null && other.getCourier1__Email_Format__c()==null) || 
             (this.courier1__Email_Format__c!=null &&
              this.courier1__Email_Format__c.equals(other.getCourier1__Email_Format__c()))) &&
            ((this.courier1__Email_Reply_To_Address__c==null && other.getCourier1__Email_Reply_To_Address__c()==null) || 
             (this.courier1__Email_Reply_To_Address__c!=null &&
              this.courier1__Email_Reply_To_Address__c.equals(other.getCourier1__Email_Reply_To_Address__c()))) &&
            ((this.courier1__Email_Reply_To_Name__c==null && other.getCourier1__Email_Reply_To_Name__c()==null) || 
             (this.courier1__Email_Reply_To_Name__c!=null &&
              this.courier1__Email_Reply_To_Name__c.equals(other.getCourier1__Email_Reply_To_Name__c()))) &&
            ((this.courier1__Email_Subject__c==null && other.getCourier1__Email_Subject__c()==null) || 
             (this.courier1__Email_Subject__c!=null &&
              this.courier1__Email_Subject__c.equals(other.getCourier1__Email_Subject__c()))) &&
            ((this.courier1__Enabled__c==null && other.getCourier1__Enabled__c()==null) || 
             (this.courier1__Enabled__c!=null &&
              this.courier1__Enabled__c.equals(other.getCourier1__Enabled__c()))) &&
            ((this.courier1__Last_Run_Date_Display__c==null && other.getCourier1__Last_Run_Date_Display__c()==null) || 
             (this.courier1__Last_Run_Date_Display__c!=null &&
              this.courier1__Last_Run_Date_Display__c.equals(other.getCourier1__Last_Run_Date_Display__c()))) &&
            ((this.courier1__Last_Run_Date__c==null && other.getCourier1__Last_Run_Date__c()==null) || 
             (this.courier1__Last_Run_Date__c!=null &&
              this.courier1__Last_Run_Date__c.equals(other.getCourier1__Last_Run_Date__c()))) &&
            ((this.courier1__Last_Run_Status__c==null && other.getCourier1__Last_Run_Status__c()==null) || 
             (this.courier1__Last_Run_Status__c!=null &&
              this.courier1__Last_Run_Status__c.equals(other.getCourier1__Last_Run_Status__c()))) &&
            ((this.courier1__Merge_Output_File_Type__c==null && other.getCourier1__Merge_Output_File_Type__c()==null) || 
             (this.courier1__Merge_Output_File_Type__c!=null &&
              this.courier1__Merge_Output_File_Type__c.equals(other.getCourier1__Merge_Output_File_Type__c()))) &&
            ((this.courier1__Merge_Template_Id_Display__c==null && other.getCourier1__Merge_Template_Id_Display__c()==null) || 
             (this.courier1__Merge_Template_Id_Display__c!=null &&
              this.courier1__Merge_Template_Id_Display__c.equals(other.getCourier1__Merge_Template_Id_Display__c()))) &&
            ((this.courier1__Merge_Template_Id__c==null && other.getCourier1__Merge_Template_Id__c()==null) || 
             (this.courier1__Merge_Template_Id__c!=null &&
              this.courier1__Merge_Template_Id__c.equals(other.getCourier1__Merge_Template_Id__c()))) &&
            ((this.courier1__Merge_Template_Name_Display__c==null && other.getCourier1__Merge_Template_Name_Display__c()==null) || 
             (this.courier1__Merge_Template_Name_Display__c!=null &&
              this.courier1__Merge_Template_Name_Display__c.equals(other.getCourier1__Merge_Template_Name_Display__c()))) &&
            ((this.courier1__Merge_Template_Name__c==null && other.getCourier1__Merge_Template_Name__c()==null) || 
             (this.courier1__Merge_Template_Name__c!=null &&
              this.courier1__Merge_Template_Name__c.equals(other.getCourier1__Merge_Template_Name__c()))) &&
            ((this.courier1__Next_Run_Date__c==null && other.getCourier1__Next_Run_Date__c()==null) || 
             (this.courier1__Next_Run_Date__c!=null &&
              this.courier1__Next_Run_Date__c.equals(other.getCourier1__Next_Run_Date__c()))) &&
            ((this.courier1__Queued_Run_Date_Display__c==null && other.getCourier1__Queued_Run_Date_Display__c()==null) || 
             (this.courier1__Queued_Run_Date_Display__c!=null &&
              this.courier1__Queued_Run_Date_Display__c.equals(other.getCourier1__Queued_Run_Date_Display__c()))) &&
            ((this.courier1__Queued_Run_Date__c==null && other.getCourier1__Queued_Run_Date__c()==null) || 
             (this.courier1__Queued_Run_Date__c!=null &&
              this.courier1__Queued_Run_Date__c.equals(other.getCourier1__Queued_Run_Date__c()))) &&
            ((this.courier1__Ready_to_Fire__c==null && other.getCourier1__Ready_to_Fire__c()==null) || 
             (this.courier1__Ready_to_Fire__c!=null &&
              this.courier1__Ready_to_Fire__c.equals(other.getCourier1__Ready_to_Fire__c()))) &&
            ((this.courier1__Recipient_Source__c==null && other.getCourier1__Recipient_Source__c()==null) || 
             (this.courier1__Recipient_Source__c!=null &&
              this.courier1__Recipient_Source__c.equals(other.getCourier1__Recipient_Source__c()))) &&
            ((this.courier1__Recipients__r==null && other.getCourier1__Recipients__r()==null) || 
             (this.courier1__Recipients__r!=null &&
              this.courier1__Recipients__r.equals(other.getCourier1__Recipients__r()))) &&
            ((this.courier1__Report_Folder_Display__c==null && other.getCourier1__Report_Folder_Display__c()==null) || 
             (this.courier1__Report_Folder_Display__c!=null &&
              this.courier1__Report_Folder_Display__c.equals(other.getCourier1__Report_Folder_Display__c()))) &&
            ((this.courier1__Report_Folder__c==null && other.getCourier1__Report_Folder__c()==null) || 
             (this.courier1__Report_Folder__c!=null &&
              this.courier1__Report_Folder__c.equals(other.getCourier1__Report_Folder__c()))) &&
            ((this.courier1__Report_Id_Display__c==null && other.getCourier1__Report_Id_Display__c()==null) || 
             (this.courier1__Report_Id_Display__c!=null &&
              this.courier1__Report_Id_Display__c.equals(other.getCourier1__Report_Id_Display__c()))) &&
            ((this.courier1__Report_Id__c==null && other.getCourier1__Report_Id__c()==null) || 
             (this.courier1__Report_Id__c!=null &&
              this.courier1__Report_Id__c.equals(other.getCourier1__Report_Id__c()))) &&
            ((this.courier1__Report_Name_Display__c==null && other.getCourier1__Report_Name_Display__c()==null) || 
             (this.courier1__Report_Name_Display__c!=null &&
              this.courier1__Report_Name_Display__c.equals(other.getCourier1__Report_Name_Display__c()))) &&
            ((this.courier1__Report_Name_Report_Id__c==null && other.getCourier1__Report_Name_Report_Id__c()==null) || 
             (this.courier1__Report_Name_Report_Id__c!=null &&
              this.courier1__Report_Name_Report_Id__c.equals(other.getCourier1__Report_Name_Report_Id__c()))) &&
            ((this.courier1__Report_Name__c==null && other.getCourier1__Report_Name__c()==null) || 
             (this.courier1__Report_Name__c!=null &&
              this.courier1__Report_Name__c.equals(other.getCourier1__Report_Name__c()))) &&
            ((this.courier1__Report_Parameter__c==null && other.getCourier1__Report_Parameter__c()==null) || 
             (this.courier1__Report_Parameter__c!=null &&
              this.courier1__Report_Parameter__c.equals(other.getCourier1__Report_Parameter__c()))) &&
            ((this.courier1__Run_As__c==null && other.getCourier1__Run_As__c()==null) || 
             (this.courier1__Run_As__c!=null &&
              this.courier1__Run_As__c.equals(other.getCourier1__Run_As__c()))) &&
            ((this.courier1__Schedule_Title__c==null && other.getCourier1__Schedule_Title__c()==null) || 
             (this.courier1__Schedule_Title__c!=null &&
              this.courier1__Schedule_Title__c.equals(other.getCourier1__Schedule_Title__c()))) &&
            ((this.courier1__Start_Hour__c==null && other.getCourier1__Start_Hour__c()==null) || 
             (this.courier1__Start_Hour__c!=null &&
              this.courier1__Start_Hour__c.equals(other.getCourier1__Start_Hour__c()))) &&
            ((this.courier1__Stop_Hour__c==null && other.getCourier1__Stop_Hour__c()==null) || 
             (this.courier1__Stop_Hour__c!=null &&
              this.courier1__Stop_Hour__c.equals(other.getCourier1__Stop_Hour__c()))) &&
            ((this.courier1__Trigger_Hourly_Interval__c==null && other.getCourier1__Trigger_Hourly_Interval__c()==null) || 
             (this.courier1__Trigger_Hourly_Interval__c!=null &&
              this.courier1__Trigger_Hourly_Interval__c.equals(other.getCourier1__Trigger_Hourly_Interval__c()))) &&
            ((this.courier1__Trigger_Interval__c==null && other.getCourier1__Trigger_Interval__c()==null) || 
             (this.courier1__Trigger_Interval__c!=null &&
              this.courier1__Trigger_Interval__c.equals(other.getCourier1__Trigger_Interval__c()))) &&
            ((this.courier1__Trigger_Run_Day__c==null && other.getCourier1__Trigger_Run_Day__c()==null) || 
             (this.courier1__Trigger_Run_Day__c!=null &&
              this.courier1__Trigger_Run_Day__c.equals(other.getCourier1__Trigger_Run_Day__c()))) &&
            ((this.courier1__Trigger_Run_Time__c==null && other.getCourier1__Trigger_Run_Time__c()==null) || 
             (this.courier1__Trigger_Run_Time__c!=null &&
              this.courier1__Trigger_Run_Time__c.equals(other.getCourier1__Trigger_Run_Time__c()))) &&
            ((this.courier1__User_Location_Id__c==null && other.getCourier1__User_Location_Id__c()==null) || 
             (this.courier1__User_Location_Id__c!=null &&
              this.courier1__User_Location_Id__c.equals(other.getCourier1__User_Location_Id__c()))) &&
            ((this.courier1__Version__c==null && other.getCourier1__Version__c()==null) || 
             (this.courier1__Version__c!=null &&
              this.courier1__Version__c.equals(other.getCourier1__Version__c()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              this.events.equals(other.getEvents()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
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
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              this.tasks.equals(other.getTasks())));
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
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getCourier1__Approx_Executions_Per_Month__c() != null) {
            _hashCode += getCourier1__Approx_Executions_Per_Month__c().hashCode();
        }
        if (getCourier1__Attachment_Extension__c() != null) {
            _hashCode += getCourier1__Attachment_Extension__c().hashCode();
        }
        if (getCourier1__Description__c() != null) {
            _hashCode += getCourier1__Description__c().hashCode();
        }
        if (getCourier1__Don_t_Run_on_Weekends__c() != null) {
            _hashCode += getCourier1__Don_t_Run_on_Weekends__c().hashCode();
        }
        if (getCourier1__Email_Body__c() != null) {
            _hashCode += getCourier1__Email_Body__c().hashCode();
        }
        if (getCourier1__Email_Format__c() != null) {
            _hashCode += getCourier1__Email_Format__c().hashCode();
        }
        if (getCourier1__Email_Reply_To_Address__c() != null) {
            _hashCode += getCourier1__Email_Reply_To_Address__c().hashCode();
        }
        if (getCourier1__Email_Reply_To_Name__c() != null) {
            _hashCode += getCourier1__Email_Reply_To_Name__c().hashCode();
        }
        if (getCourier1__Email_Subject__c() != null) {
            _hashCode += getCourier1__Email_Subject__c().hashCode();
        }
        if (getCourier1__Enabled__c() != null) {
            _hashCode += getCourier1__Enabled__c().hashCode();
        }
        if (getCourier1__Last_Run_Date_Display__c() != null) {
            _hashCode += getCourier1__Last_Run_Date_Display__c().hashCode();
        }
        if (getCourier1__Last_Run_Date__c() != null) {
            _hashCode += getCourier1__Last_Run_Date__c().hashCode();
        }
        if (getCourier1__Last_Run_Status__c() != null) {
            _hashCode += getCourier1__Last_Run_Status__c().hashCode();
        }
        if (getCourier1__Merge_Output_File_Type__c() != null) {
            _hashCode += getCourier1__Merge_Output_File_Type__c().hashCode();
        }
        if (getCourier1__Merge_Template_Id_Display__c() != null) {
            _hashCode += getCourier1__Merge_Template_Id_Display__c().hashCode();
        }
        if (getCourier1__Merge_Template_Id__c() != null) {
            _hashCode += getCourier1__Merge_Template_Id__c().hashCode();
        }
        if (getCourier1__Merge_Template_Name_Display__c() != null) {
            _hashCode += getCourier1__Merge_Template_Name_Display__c().hashCode();
        }
        if (getCourier1__Merge_Template_Name__c() != null) {
            _hashCode += getCourier1__Merge_Template_Name__c().hashCode();
        }
        if (getCourier1__Next_Run_Date__c() != null) {
            _hashCode += getCourier1__Next_Run_Date__c().hashCode();
        }
        if (getCourier1__Queued_Run_Date_Display__c() != null) {
            _hashCode += getCourier1__Queued_Run_Date_Display__c().hashCode();
        }
        if (getCourier1__Queued_Run_Date__c() != null) {
            _hashCode += getCourier1__Queued_Run_Date__c().hashCode();
        }
        if (getCourier1__Ready_to_Fire__c() != null) {
            _hashCode += getCourier1__Ready_to_Fire__c().hashCode();
        }
        if (getCourier1__Recipient_Source__c() != null) {
            _hashCode += getCourier1__Recipient_Source__c().hashCode();
        }
        if (getCourier1__Recipients__r() != null) {
            _hashCode += getCourier1__Recipients__r().hashCode();
        }
        if (getCourier1__Report_Folder_Display__c() != null) {
            _hashCode += getCourier1__Report_Folder_Display__c().hashCode();
        }
        if (getCourier1__Report_Folder__c() != null) {
            _hashCode += getCourier1__Report_Folder__c().hashCode();
        }
        if (getCourier1__Report_Id_Display__c() != null) {
            _hashCode += getCourier1__Report_Id_Display__c().hashCode();
        }
        if (getCourier1__Report_Id__c() != null) {
            _hashCode += getCourier1__Report_Id__c().hashCode();
        }
        if (getCourier1__Report_Name_Display__c() != null) {
            _hashCode += getCourier1__Report_Name_Display__c().hashCode();
        }
        if (getCourier1__Report_Name_Report_Id__c() != null) {
            _hashCode += getCourier1__Report_Name_Report_Id__c().hashCode();
        }
        if (getCourier1__Report_Name__c() != null) {
            _hashCode += getCourier1__Report_Name__c().hashCode();
        }
        if (getCourier1__Report_Parameter__c() != null) {
            _hashCode += getCourier1__Report_Parameter__c().hashCode();
        }
        if (getCourier1__Run_As__c() != null) {
            _hashCode += getCourier1__Run_As__c().hashCode();
        }
        if (getCourier1__Schedule_Title__c() != null) {
            _hashCode += getCourier1__Schedule_Title__c().hashCode();
        }
        if (getCourier1__Start_Hour__c() != null) {
            _hashCode += getCourier1__Start_Hour__c().hashCode();
        }
        if (getCourier1__Stop_Hour__c() != null) {
            _hashCode += getCourier1__Stop_Hour__c().hashCode();
        }
        if (getCourier1__Trigger_Hourly_Interval__c() != null) {
            _hashCode += getCourier1__Trigger_Hourly_Interval__c().hashCode();
        }
        if (getCourier1__Trigger_Interval__c() != null) {
            _hashCode += getCourier1__Trigger_Interval__c().hashCode();
        }
        if (getCourier1__Trigger_Run_Day__c() != null) {
            _hashCode += getCourier1__Trigger_Run_Day__c().hashCode();
        }
        if (getCourier1__Trigger_Run_Time__c() != null) {
            _hashCode += getCourier1__Trigger_Run_Time__c().hashCode();
        }
        if (getCourier1__User_Location_Id__c() != null) {
            _hashCode += getCourier1__User_Location_Id__c().hashCode();
        }
        if (getCourier1__Version__c() != null) {
            _hashCode += getCourier1__Version__c().hashCode();
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
        if (getEvents() != null) {
            _hashCode += getEvents().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
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
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTasks() != null) {
            _hashCode += getTasks().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Courier1__Courier_Schedule__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Courier_Schedule__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("courier1__Approx_Executions_Per_Month__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Approx_Executions_Per_Month__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Attachment_Extension__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Attachment_Extension__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Description__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Description__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Don_t_Run_on_Weekends__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Don_t_Run_on_Weekends__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Email_Body__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Email_Body__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Email_Format__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Email_Format__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Email_Reply_To_Address__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Email_Reply_To_Address__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Email_Reply_To_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Email_Reply_To_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Email_Subject__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Email_Subject__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Enabled__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Enabled__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Last_Run_Date_Display__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Last_Run_Date_Display__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Last_Run_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Last_Run_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Last_Run_Status__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Last_Run_Status__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Merge_Output_File_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Merge_Output_File_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Merge_Template_Id_Display__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Merge_Template_Id_Display__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Merge_Template_Id__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Merge_Template_Id__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Merge_Template_Name_Display__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Merge_Template_Name_Display__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Merge_Template_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Merge_Template_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Next_Run_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Next_Run_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Queued_Run_Date_Display__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Queued_Run_Date_Display__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Queued_Run_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Queued_Run_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Ready_to_Fire__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Ready_to_Fire__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Recipient_Source__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Recipient_Source__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("courier1__Report_Folder_Display__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Report_Folder_Display__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Report_Folder__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Report_Folder__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Report_Id_Display__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Report_Id_Display__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Report_Id__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Report_Id__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Report_Name_Display__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Report_Name_Display__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Report_Name_Report_Id__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Report_Name_Report_Id__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Report_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Report_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Report_Parameter__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Report_Parameter__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Run_As__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Run_As__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Schedule_Title__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Schedule_Title__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Start_Hour__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Start_Hour__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Stop_Hour__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Stop_Hour__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Trigger_Hourly_Interval__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Trigger_Hourly_Interval__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Trigger_Interval__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Trigger_Interval__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Trigger_Run_Day__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Trigger_Run_Day__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Trigger_Run_Time__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Trigger_Run_Time__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__User_Location_Id__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__User_Location_Id__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Version__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Version__c"));
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

/**
 * Exam_Attendees__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Exam_Attendees__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String account__c;

    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private java.lang.String admin_Cerification__c;

    private com.sforce.soap.enterprise.sobject.Admin_Certification__c admin_Cerification__r;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String attendee_Email__c;

    private java.lang.String attendee_First_Name__c;

    private java.lang.String attendee_Name__c;

    private java.lang.Boolean bill_Immediately__c;

    private java.lang.String bill_amount__c;

    private java.lang.String billing_Address__c;

    private java.lang.String billing_City__c;

    private java.lang.String billing_Country__c;

    private java.lang.String billing_Email__c;

    private java.lang.String billing_Method__c;

    private java.lang.String billing_State_Province__c;

    private java.lang.String billing_Zip_Postal_Code__c;

    private com.sforce.soap.enterprise.QueryResult certification_Contacts__r;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private com.sforce.soap.enterprise.QueryResult events;

    private java.lang.String exam_Attendee__c;

    private com.sforce.soap.enterprise.sobject.Contact exam_Attendee__r;

    private java.lang.String exam_Result__c;

    private java.util.Calendar exam_Start_Date_Time__c;

    private java.lang.Double exercise_ID__c;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.lang.Double hands_On__c;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.Boolean host_Seat__c;

    private java.lang.String invoice__c;

    private java.lang.Boolean isDeleted;

    private java.util.Date lastActivityDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String name;

    private java.util.Calendar no_Show_Date__c;

    private java.lang.Boolean no_Show__c;

    private java.lang.Boolean not_Billable__c;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private java.lang.String notes__c;

    private com.sforce.soap.enterprise.QueryResult openActivities;

    private java.lang.Boolean paid__c;

    private java.lang.String password__c;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.Double quiz__c;

    private java.lang.Boolean RCA_Certificate_Sent__c;

    private java.lang.Double score__c;

    private java.lang.Boolean send_Survey__c;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    private java.lang.String upgrade_Exam_Old__c;

    private java.lang.Boolean upgrade_Exam__c;

    private java.lang.String VM__c;

    private java.lang.Boolean waitlist__c;

    public Exam_Attendees__c() {
    }

    public Exam_Attendees__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String account__c,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           java.lang.String admin_Cerification__c,
           com.sforce.soap.enterprise.sobject.Admin_Certification__c admin_Cerification__r,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String attendee_Email__c,
           java.lang.String attendee_First_Name__c,
           java.lang.String attendee_Name__c,
           java.lang.Boolean bill_Immediately__c,
           java.lang.String bill_amount__c,
           java.lang.String billing_Address__c,
           java.lang.String billing_City__c,
           java.lang.String billing_Country__c,
           java.lang.String billing_Email__c,
           java.lang.String billing_Method__c,
           java.lang.String billing_State_Province__c,
           java.lang.String billing_Zip_Postal_Code__c,
           com.sforce.soap.enterprise.QueryResult certification_Contacts__r,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           com.sforce.soap.enterprise.QueryResult events,
           java.lang.String exam_Attendee__c,
           com.sforce.soap.enterprise.sobject.Contact exam_Attendee__r,
           java.lang.String exam_Result__c,
           java.util.Calendar exam_Start_Date_Time__c,
           java.lang.Double exercise_ID__c,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.lang.Double hands_On__c,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.Boolean host_Seat__c,
           java.lang.String invoice__c,
           java.lang.Boolean isDeleted,
           java.util.Date lastActivityDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String name,
           java.util.Calendar no_Show_Date__c,
           java.lang.Boolean no_Show__c,
           java.lang.Boolean not_Billable__c,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           java.lang.String notes__c,
           com.sforce.soap.enterprise.QueryResult openActivities,
           java.lang.Boolean paid__c,
           java.lang.String password__c,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.Double quiz__c,
           java.lang.Boolean RCA_Certificate_Sent__c,
           java.lang.Double score__c,
           java.lang.Boolean send_Survey__c,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks,
           java.lang.String upgrade_Exam_Old__c,
           java.lang.Boolean upgrade_Exam__c,
           java.lang.String VM__c,
           java.lang.Boolean waitlist__c) {
        super(
            fieldsToNull,
            id);
        this.account__c = account__c;
        this.activityHistories = activityHistories;
        this.admin_Cerification__c = admin_Cerification__c;
        this.admin_Cerification__r = admin_Cerification__r;
        this.attachments = attachments;
        this.attendee_Email__c = attendee_Email__c;
        this.attendee_First_Name__c = attendee_First_Name__c;
        this.attendee_Name__c = attendee_Name__c;
        this.bill_Immediately__c = bill_Immediately__c;
        this.bill_amount__c = bill_amount__c;
        this.billing_Address__c = billing_Address__c;
        this.billing_City__c = billing_City__c;
        this.billing_Country__c = billing_Country__c;
        this.billing_Email__c = billing_Email__c;
        this.billing_Method__c = billing_Method__c;
        this.billing_State_Province__c = billing_State_Province__c;
        this.billing_Zip_Postal_Code__c = billing_Zip_Postal_Code__c;
        this.certification_Contacts__r = certification_Contacts__r;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.events = events;
        this.exam_Attendee__c = exam_Attendee__c;
        this.exam_Attendee__r = exam_Attendee__r;
        this.exam_Result__c = exam_Result__c;
        this.exam_Start_Date_Time__c = exam_Start_Date_Time__c;
        this.exercise_ID__c = exercise_ID__c;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.hands_On__c = hands_On__c;
        this.histories = histories;
        this.host_Seat__c = host_Seat__c;
        this.invoice__c = invoice__c;
        this.isDeleted = isDeleted;
        this.lastActivityDate = lastActivityDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.name = name;
        this.no_Show_Date__c = no_Show_Date__c;
        this.no_Show__c = no_Show__c;
        this.not_Billable__c = not_Billable__c;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.notes__c = notes__c;
        this.openActivities = openActivities;
        this.paid__c = paid__c;
        this.password__c = password__c;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.quiz__c = quiz__c;
        this.RCA_Certificate_Sent__c = RCA_Certificate_Sent__c;
        this.score__c = score__c;
        this.send_Survey__c = send_Survey__c;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
        this.upgrade_Exam_Old__c = upgrade_Exam_Old__c;
        this.upgrade_Exam__c = upgrade_Exam__c;
        this.VM__c = VM__c;
        this.waitlist__c = waitlist__c;
    }


    /**
     * Gets the account__c value for this Exam_Attendees__c.
     * 
     * @return account__c
     */
    public java.lang.String getAccount__c() {
        return account__c;
    }


    /**
     * Sets the account__c value for this Exam_Attendees__c.
     * 
     * @param account__c
     */
    public void setAccount__c(java.lang.String account__c) {
        this.account__c = account__c;
    }


    /**
     * Gets the activityHistories value for this Exam_Attendees__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this Exam_Attendees__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the admin_Cerification__c value for this Exam_Attendees__c.
     * 
     * @return admin_Cerification__c
     */
    public java.lang.String getAdmin_Cerification__c() {
        return admin_Cerification__c;
    }


    /**
     * Sets the admin_Cerification__c value for this Exam_Attendees__c.
     * 
     * @param admin_Cerification__c
     */
    public void setAdmin_Cerification__c(java.lang.String admin_Cerification__c) {
        this.admin_Cerification__c = admin_Cerification__c;
    }


    /**
     * Gets the admin_Cerification__r value for this Exam_Attendees__c.
     * 
     * @return admin_Cerification__r
     */
    public com.sforce.soap.enterprise.sobject.Admin_Certification__c getAdmin_Cerification__r() {
        return admin_Cerification__r;
    }


    /**
     * Sets the admin_Cerification__r value for this Exam_Attendees__c.
     * 
     * @param admin_Cerification__r
     */
    public void setAdmin_Cerification__r(com.sforce.soap.enterprise.sobject.Admin_Certification__c admin_Cerification__r) {
        this.admin_Cerification__r = admin_Cerification__r;
    }


    /**
     * Gets the attachments value for this Exam_Attendees__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Exam_Attendees__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the attendee_Email__c value for this Exam_Attendees__c.
     * 
     * @return attendee_Email__c
     */
    public java.lang.String getAttendee_Email__c() {
        return attendee_Email__c;
    }


    /**
     * Sets the attendee_Email__c value for this Exam_Attendees__c.
     * 
     * @param attendee_Email__c
     */
    public void setAttendee_Email__c(java.lang.String attendee_Email__c) {
        this.attendee_Email__c = attendee_Email__c;
    }


    /**
     * Gets the attendee_First_Name__c value for this Exam_Attendees__c.
     * 
     * @return attendee_First_Name__c
     */
    public java.lang.String getAttendee_First_Name__c() {
        return attendee_First_Name__c;
    }


    /**
     * Sets the attendee_First_Name__c value for this Exam_Attendees__c.
     * 
     * @param attendee_First_Name__c
     */
    public void setAttendee_First_Name__c(java.lang.String attendee_First_Name__c) {
        this.attendee_First_Name__c = attendee_First_Name__c;
    }


    /**
     * Gets the attendee_Name__c value for this Exam_Attendees__c.
     * 
     * @return attendee_Name__c
     */
    public java.lang.String getAttendee_Name__c() {
        return attendee_Name__c;
    }


    /**
     * Sets the attendee_Name__c value for this Exam_Attendees__c.
     * 
     * @param attendee_Name__c
     */
    public void setAttendee_Name__c(java.lang.String attendee_Name__c) {
        this.attendee_Name__c = attendee_Name__c;
    }


    /**
     * Gets the bill_Immediately__c value for this Exam_Attendees__c.
     * 
     * @return bill_Immediately__c
     */
    public java.lang.Boolean getBill_Immediately__c() {
        return bill_Immediately__c;
    }


    /**
     * Sets the bill_Immediately__c value for this Exam_Attendees__c.
     * 
     * @param bill_Immediately__c
     */
    public void setBill_Immediately__c(java.lang.Boolean bill_Immediately__c) {
        this.bill_Immediately__c = bill_Immediately__c;
    }


    /**
     * Gets the bill_amount__c value for this Exam_Attendees__c.
     * 
     * @return bill_amount__c
     */
    public java.lang.String getBill_amount__c() {
        return bill_amount__c;
    }


    /**
     * Sets the bill_amount__c value for this Exam_Attendees__c.
     * 
     * @param bill_amount__c
     */
    public void setBill_amount__c(java.lang.String bill_amount__c) {
        this.bill_amount__c = bill_amount__c;
    }


    /**
     * Gets the billing_Address__c value for this Exam_Attendees__c.
     * 
     * @return billing_Address__c
     */
    public java.lang.String getBilling_Address__c() {
        return billing_Address__c;
    }


    /**
     * Sets the billing_Address__c value for this Exam_Attendees__c.
     * 
     * @param billing_Address__c
     */
    public void setBilling_Address__c(java.lang.String billing_Address__c) {
        this.billing_Address__c = billing_Address__c;
    }


    /**
     * Gets the billing_City__c value for this Exam_Attendees__c.
     * 
     * @return billing_City__c
     */
    public java.lang.String getBilling_City__c() {
        return billing_City__c;
    }


    /**
     * Sets the billing_City__c value for this Exam_Attendees__c.
     * 
     * @param billing_City__c
     */
    public void setBilling_City__c(java.lang.String billing_City__c) {
        this.billing_City__c = billing_City__c;
    }


    /**
     * Gets the billing_Country__c value for this Exam_Attendees__c.
     * 
     * @return billing_Country__c
     */
    public java.lang.String getBilling_Country__c() {
        return billing_Country__c;
    }


    /**
     * Sets the billing_Country__c value for this Exam_Attendees__c.
     * 
     * @param billing_Country__c
     */
    public void setBilling_Country__c(java.lang.String billing_Country__c) {
        this.billing_Country__c = billing_Country__c;
    }


    /**
     * Gets the billing_Email__c value for this Exam_Attendees__c.
     * 
     * @return billing_Email__c
     */
    public java.lang.String getBilling_Email__c() {
        return billing_Email__c;
    }


    /**
     * Sets the billing_Email__c value for this Exam_Attendees__c.
     * 
     * @param billing_Email__c
     */
    public void setBilling_Email__c(java.lang.String billing_Email__c) {
        this.billing_Email__c = billing_Email__c;
    }


    /**
     * Gets the billing_Method__c value for this Exam_Attendees__c.
     * 
     * @return billing_Method__c
     */
    public java.lang.String getBilling_Method__c() {
        return billing_Method__c;
    }


    /**
     * Sets the billing_Method__c value for this Exam_Attendees__c.
     * 
     * @param billing_Method__c
     */
    public void setBilling_Method__c(java.lang.String billing_Method__c) {
        this.billing_Method__c = billing_Method__c;
    }


    /**
     * Gets the billing_State_Province__c value for this Exam_Attendees__c.
     * 
     * @return billing_State_Province__c
     */
    public java.lang.String getBilling_State_Province__c() {
        return billing_State_Province__c;
    }


    /**
     * Sets the billing_State_Province__c value for this Exam_Attendees__c.
     * 
     * @param billing_State_Province__c
     */
    public void setBilling_State_Province__c(java.lang.String billing_State_Province__c) {
        this.billing_State_Province__c = billing_State_Province__c;
    }


    /**
     * Gets the billing_Zip_Postal_Code__c value for this Exam_Attendees__c.
     * 
     * @return billing_Zip_Postal_Code__c
     */
    public java.lang.String getBilling_Zip_Postal_Code__c() {
        return billing_Zip_Postal_Code__c;
    }


    /**
     * Sets the billing_Zip_Postal_Code__c value for this Exam_Attendees__c.
     * 
     * @param billing_Zip_Postal_Code__c
     */
    public void setBilling_Zip_Postal_Code__c(java.lang.String billing_Zip_Postal_Code__c) {
        this.billing_Zip_Postal_Code__c = billing_Zip_Postal_Code__c;
    }


    /**
     * Gets the certification_Contacts__r value for this Exam_Attendees__c.
     * 
     * @return certification_Contacts__r
     */
    public com.sforce.soap.enterprise.QueryResult getCertification_Contacts__r() {
        return certification_Contacts__r;
    }


    /**
     * Sets the certification_Contacts__r value for this Exam_Attendees__c.
     * 
     * @param certification_Contacts__r
     */
    public void setCertification_Contacts__r(com.sforce.soap.enterprise.QueryResult certification_Contacts__r) {
        this.certification_Contacts__r = certification_Contacts__r;
    }


    /**
     * Gets the createdBy value for this Exam_Attendees__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Exam_Attendees__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Exam_Attendees__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Exam_Attendees__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Exam_Attendees__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Exam_Attendees__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the events value for this Exam_Attendees__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Exam_Attendees__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the exam_Attendee__c value for this Exam_Attendees__c.
     * 
     * @return exam_Attendee__c
     */
    public java.lang.String getExam_Attendee__c() {
        return exam_Attendee__c;
    }


    /**
     * Sets the exam_Attendee__c value for this Exam_Attendees__c.
     * 
     * @param exam_Attendee__c
     */
    public void setExam_Attendee__c(java.lang.String exam_Attendee__c) {
        this.exam_Attendee__c = exam_Attendee__c;
    }


    /**
     * Gets the exam_Attendee__r value for this Exam_Attendees__c.
     * 
     * @return exam_Attendee__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getExam_Attendee__r() {
        return exam_Attendee__r;
    }


    /**
     * Sets the exam_Attendee__r value for this Exam_Attendees__c.
     * 
     * @param exam_Attendee__r
     */
    public void setExam_Attendee__r(com.sforce.soap.enterprise.sobject.Contact exam_Attendee__r) {
        this.exam_Attendee__r = exam_Attendee__r;
    }


    /**
     * Gets the exam_Result__c value for this Exam_Attendees__c.
     * 
     * @return exam_Result__c
     */
    public java.lang.String getExam_Result__c() {
        return exam_Result__c;
    }


    /**
     * Sets the exam_Result__c value for this Exam_Attendees__c.
     * 
     * @param exam_Result__c
     */
    public void setExam_Result__c(java.lang.String exam_Result__c) {
        this.exam_Result__c = exam_Result__c;
    }


    /**
     * Gets the exam_Start_Date_Time__c value for this Exam_Attendees__c.
     * 
     * @return exam_Start_Date_Time__c
     */
    public java.util.Calendar getExam_Start_Date_Time__c() {
        return exam_Start_Date_Time__c;
    }


    /**
     * Sets the exam_Start_Date_Time__c value for this Exam_Attendees__c.
     * 
     * @param exam_Start_Date_Time__c
     */
    public void setExam_Start_Date_Time__c(java.util.Calendar exam_Start_Date_Time__c) {
        this.exam_Start_Date_Time__c = exam_Start_Date_Time__c;
    }


    /**
     * Gets the exercise_ID__c value for this Exam_Attendees__c.
     * 
     * @return exercise_ID__c
     */
    public java.lang.Double getExercise_ID__c() {
        return exercise_ID__c;
    }


    /**
     * Sets the exercise_ID__c value for this Exam_Attendees__c.
     * 
     * @param exercise_ID__c
     */
    public void setExercise_ID__c(java.lang.Double exercise_ID__c) {
        this.exercise_ID__c = exercise_ID__c;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Exam_Attendees__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Exam_Attendees__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the hands_On__c value for this Exam_Attendees__c.
     * 
     * @return hands_On__c
     */
    public java.lang.Double getHands_On__c() {
        return hands_On__c;
    }


    /**
     * Sets the hands_On__c value for this Exam_Attendees__c.
     * 
     * @param hands_On__c
     */
    public void setHands_On__c(java.lang.Double hands_On__c) {
        this.hands_On__c = hands_On__c;
    }


    /**
     * Gets the histories value for this Exam_Attendees__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Exam_Attendees__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the host_Seat__c value for this Exam_Attendees__c.
     * 
     * @return host_Seat__c
     */
    public java.lang.Boolean getHost_Seat__c() {
        return host_Seat__c;
    }


    /**
     * Sets the host_Seat__c value for this Exam_Attendees__c.
     * 
     * @param host_Seat__c
     */
    public void setHost_Seat__c(java.lang.Boolean host_Seat__c) {
        this.host_Seat__c = host_Seat__c;
    }


    /**
     * Gets the invoice__c value for this Exam_Attendees__c.
     * 
     * @return invoice__c
     */
    public java.lang.String getInvoice__c() {
        return invoice__c;
    }


    /**
     * Sets the invoice__c value for this Exam_Attendees__c.
     * 
     * @param invoice__c
     */
    public void setInvoice__c(java.lang.String invoice__c) {
        this.invoice__c = invoice__c;
    }


    /**
     * Gets the isDeleted value for this Exam_Attendees__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Exam_Attendees__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastActivityDate value for this Exam_Attendees__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Exam_Attendees__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this Exam_Attendees__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Exam_Attendees__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Exam_Attendees__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Exam_Attendees__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Exam_Attendees__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Exam_Attendees__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this Exam_Attendees__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Exam_Attendees__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the no_Show_Date__c value for this Exam_Attendees__c.
     * 
     * @return no_Show_Date__c
     */
    public java.util.Calendar getNo_Show_Date__c() {
        return no_Show_Date__c;
    }


    /**
     * Sets the no_Show_Date__c value for this Exam_Attendees__c.
     * 
     * @param no_Show_Date__c
     */
    public void setNo_Show_Date__c(java.util.Calendar no_Show_Date__c) {
        this.no_Show_Date__c = no_Show_Date__c;
    }


    /**
     * Gets the no_Show__c value for this Exam_Attendees__c.
     * 
     * @return no_Show__c
     */
    public java.lang.Boolean getNo_Show__c() {
        return no_Show__c;
    }


    /**
     * Sets the no_Show__c value for this Exam_Attendees__c.
     * 
     * @param no_Show__c
     */
    public void setNo_Show__c(java.lang.Boolean no_Show__c) {
        this.no_Show__c = no_Show__c;
    }


    /**
     * Gets the not_Billable__c value for this Exam_Attendees__c.
     * 
     * @return not_Billable__c
     */
    public java.lang.Boolean getNot_Billable__c() {
        return not_Billable__c;
    }


    /**
     * Sets the not_Billable__c value for this Exam_Attendees__c.
     * 
     * @param not_Billable__c
     */
    public void setNot_Billable__c(java.lang.Boolean not_Billable__c) {
        this.not_Billable__c = not_Billable__c;
    }


    /**
     * Gets the notes value for this Exam_Attendees__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Exam_Attendees__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Exam_Attendees__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Exam_Attendees__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the notes__c value for this Exam_Attendees__c.
     * 
     * @return notes__c
     */
    public java.lang.String getNotes__c() {
        return notes__c;
    }


    /**
     * Sets the notes__c value for this Exam_Attendees__c.
     * 
     * @param notes__c
     */
    public void setNotes__c(java.lang.String notes__c) {
        this.notes__c = notes__c;
    }


    /**
     * Gets the openActivities value for this Exam_Attendees__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this Exam_Attendees__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the paid__c value for this Exam_Attendees__c.
     * 
     * @return paid__c
     */
    public java.lang.Boolean getPaid__c() {
        return paid__c;
    }


    /**
     * Sets the paid__c value for this Exam_Attendees__c.
     * 
     * @param paid__c
     */
    public void setPaid__c(java.lang.Boolean paid__c) {
        this.paid__c = paid__c;
    }


    /**
     * Gets the password__c value for this Exam_Attendees__c.
     * 
     * @return password__c
     */
    public java.lang.String getPassword__c() {
        return password__c;
    }


    /**
     * Sets the password__c value for this Exam_Attendees__c.
     * 
     * @param password__c
     */
    public void setPassword__c(java.lang.String password__c) {
        this.password__c = password__c;
    }


    /**
     * Gets the processInstances value for this Exam_Attendees__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Exam_Attendees__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Exam_Attendees__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Exam_Attendees__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the quiz__c value for this Exam_Attendees__c.
     * 
     * @return quiz__c
     */
    public java.lang.Double getQuiz__c() {
        return quiz__c;
    }


    /**
     * Sets the quiz__c value for this Exam_Attendees__c.
     * 
     * @param quiz__c
     */
    public void setQuiz__c(java.lang.Double quiz__c) {
        this.quiz__c = quiz__c;
    }


    /**
     * Gets the RCA_Certificate_Sent__c value for this Exam_Attendees__c.
     * 
     * @return RCA_Certificate_Sent__c
     */
    public java.lang.Boolean getRCA_Certificate_Sent__c() {
        return RCA_Certificate_Sent__c;
    }


    /**
     * Sets the RCA_Certificate_Sent__c value for this Exam_Attendees__c.
     * 
     * @param RCA_Certificate_Sent__c
     */
    public void setRCA_Certificate_Sent__c(java.lang.Boolean RCA_Certificate_Sent__c) {
        this.RCA_Certificate_Sent__c = RCA_Certificate_Sent__c;
    }


    /**
     * Gets the score__c value for this Exam_Attendees__c.
     * 
     * @return score__c
     */
    public java.lang.Double getScore__c() {
        return score__c;
    }


    /**
     * Sets the score__c value for this Exam_Attendees__c.
     * 
     * @param score__c
     */
    public void setScore__c(java.lang.Double score__c) {
        this.score__c = score__c;
    }


    /**
     * Gets the send_Survey__c value for this Exam_Attendees__c.
     * 
     * @return send_Survey__c
     */
    public java.lang.Boolean getSend_Survey__c() {
        return send_Survey__c;
    }


    /**
     * Sets the send_Survey__c value for this Exam_Attendees__c.
     * 
     * @param send_Survey__c
     */
    public void setSend_Survey__c(java.lang.Boolean send_Survey__c) {
        this.send_Survey__c = send_Survey__c;
    }


    /**
     * Gets the systemModstamp value for this Exam_Attendees__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Exam_Attendees__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this Exam_Attendees__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Exam_Attendees__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the upgrade_Exam_Old__c value for this Exam_Attendees__c.
     * 
     * @return upgrade_Exam_Old__c
     */
    public java.lang.String getUpgrade_Exam_Old__c() {
        return upgrade_Exam_Old__c;
    }


    /**
     * Sets the upgrade_Exam_Old__c value for this Exam_Attendees__c.
     * 
     * @param upgrade_Exam_Old__c
     */
    public void setUpgrade_Exam_Old__c(java.lang.String upgrade_Exam_Old__c) {
        this.upgrade_Exam_Old__c = upgrade_Exam_Old__c;
    }


    /**
     * Gets the upgrade_Exam__c value for this Exam_Attendees__c.
     * 
     * @return upgrade_Exam__c
     */
    public java.lang.Boolean getUpgrade_Exam__c() {
        return upgrade_Exam__c;
    }


    /**
     * Sets the upgrade_Exam__c value for this Exam_Attendees__c.
     * 
     * @param upgrade_Exam__c
     */
    public void setUpgrade_Exam__c(java.lang.Boolean upgrade_Exam__c) {
        this.upgrade_Exam__c = upgrade_Exam__c;
    }


    /**
     * Gets the VM__c value for this Exam_Attendees__c.
     * 
     * @return VM__c
     */
    public java.lang.String getVM__c() {
        return VM__c;
    }


    /**
     * Sets the VM__c value for this Exam_Attendees__c.
     * 
     * @param VM__c
     */
    public void setVM__c(java.lang.String VM__c) {
        this.VM__c = VM__c;
    }


    /**
     * Gets the waitlist__c value for this Exam_Attendees__c.
     * 
     * @return waitlist__c
     */
    public java.lang.Boolean getWaitlist__c() {
        return waitlist__c;
    }


    /**
     * Sets the waitlist__c value for this Exam_Attendees__c.
     * 
     * @param waitlist__c
     */
    public void setWaitlist__c(java.lang.Boolean waitlist__c) {
        this.waitlist__c = waitlist__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Exam_Attendees__c)) return false;
        Exam_Attendees__c other = (Exam_Attendees__c) obj;
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
            ((this.activityHistories==null && other.getActivityHistories()==null) || 
             (this.activityHistories!=null &&
              this.activityHistories.equals(other.getActivityHistories()))) &&
            ((this.admin_Cerification__c==null && other.getAdmin_Cerification__c()==null) || 
             (this.admin_Cerification__c!=null &&
              this.admin_Cerification__c.equals(other.getAdmin_Cerification__c()))) &&
            ((this.admin_Cerification__r==null && other.getAdmin_Cerification__r()==null) || 
             (this.admin_Cerification__r!=null &&
              this.admin_Cerification__r.equals(other.getAdmin_Cerification__r()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.attendee_Email__c==null && other.getAttendee_Email__c()==null) || 
             (this.attendee_Email__c!=null &&
              this.attendee_Email__c.equals(other.getAttendee_Email__c()))) &&
            ((this.attendee_First_Name__c==null && other.getAttendee_First_Name__c()==null) || 
             (this.attendee_First_Name__c!=null &&
              this.attendee_First_Name__c.equals(other.getAttendee_First_Name__c()))) &&
            ((this.attendee_Name__c==null && other.getAttendee_Name__c()==null) || 
             (this.attendee_Name__c!=null &&
              this.attendee_Name__c.equals(other.getAttendee_Name__c()))) &&
            ((this.bill_Immediately__c==null && other.getBill_Immediately__c()==null) || 
             (this.bill_Immediately__c!=null &&
              this.bill_Immediately__c.equals(other.getBill_Immediately__c()))) &&
            ((this.bill_amount__c==null && other.getBill_amount__c()==null) || 
             (this.bill_amount__c!=null &&
              this.bill_amount__c.equals(other.getBill_amount__c()))) &&
            ((this.billing_Address__c==null && other.getBilling_Address__c()==null) || 
             (this.billing_Address__c!=null &&
              this.billing_Address__c.equals(other.getBilling_Address__c()))) &&
            ((this.billing_City__c==null && other.getBilling_City__c()==null) || 
             (this.billing_City__c!=null &&
              this.billing_City__c.equals(other.getBilling_City__c()))) &&
            ((this.billing_Country__c==null && other.getBilling_Country__c()==null) || 
             (this.billing_Country__c!=null &&
              this.billing_Country__c.equals(other.getBilling_Country__c()))) &&
            ((this.billing_Email__c==null && other.getBilling_Email__c()==null) || 
             (this.billing_Email__c!=null &&
              this.billing_Email__c.equals(other.getBilling_Email__c()))) &&
            ((this.billing_Method__c==null && other.getBilling_Method__c()==null) || 
             (this.billing_Method__c!=null &&
              this.billing_Method__c.equals(other.getBilling_Method__c()))) &&
            ((this.billing_State_Province__c==null && other.getBilling_State_Province__c()==null) || 
             (this.billing_State_Province__c!=null &&
              this.billing_State_Province__c.equals(other.getBilling_State_Province__c()))) &&
            ((this.billing_Zip_Postal_Code__c==null && other.getBilling_Zip_Postal_Code__c()==null) || 
             (this.billing_Zip_Postal_Code__c!=null &&
              this.billing_Zip_Postal_Code__c.equals(other.getBilling_Zip_Postal_Code__c()))) &&
            ((this.certification_Contacts__r==null && other.getCertification_Contacts__r()==null) || 
             (this.certification_Contacts__r!=null &&
              this.certification_Contacts__r.equals(other.getCertification_Contacts__r()))) &&
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
            ((this.exam_Attendee__c==null && other.getExam_Attendee__c()==null) || 
             (this.exam_Attendee__c!=null &&
              this.exam_Attendee__c.equals(other.getExam_Attendee__c()))) &&
            ((this.exam_Attendee__r==null && other.getExam_Attendee__r()==null) || 
             (this.exam_Attendee__r!=null &&
              this.exam_Attendee__r.equals(other.getExam_Attendee__r()))) &&
            ((this.exam_Result__c==null && other.getExam_Result__c()==null) || 
             (this.exam_Result__c!=null &&
              this.exam_Result__c.equals(other.getExam_Result__c()))) &&
            ((this.exam_Start_Date_Time__c==null && other.getExam_Start_Date_Time__c()==null) || 
             (this.exam_Start_Date_Time__c!=null &&
              this.exam_Start_Date_Time__c.equals(other.getExam_Start_Date_Time__c()))) &&
            ((this.exercise_ID__c==null && other.getExercise_ID__c()==null) || 
             (this.exercise_ID__c!=null &&
              this.exercise_ID__c.equals(other.getExercise_ID__c()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.hands_On__c==null && other.getHands_On__c()==null) || 
             (this.hands_On__c!=null &&
              this.hands_On__c.equals(other.getHands_On__c()))) &&
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
            ((this.host_Seat__c==null && other.getHost_Seat__c()==null) || 
             (this.host_Seat__c!=null &&
              this.host_Seat__c.equals(other.getHost_Seat__c()))) &&
            ((this.invoice__c==null && other.getInvoice__c()==null) || 
             (this.invoice__c!=null &&
              this.invoice__c.equals(other.getInvoice__c()))) &&
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
            ((this.no_Show_Date__c==null && other.getNo_Show_Date__c()==null) || 
             (this.no_Show_Date__c!=null &&
              this.no_Show_Date__c.equals(other.getNo_Show_Date__c()))) &&
            ((this.no_Show__c==null && other.getNo_Show__c()==null) || 
             (this.no_Show__c!=null &&
              this.no_Show__c.equals(other.getNo_Show__c()))) &&
            ((this.not_Billable__c==null && other.getNot_Billable__c()==null) || 
             (this.not_Billable__c!=null &&
              this.not_Billable__c.equals(other.getNot_Billable__c()))) &&
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
            ((this.paid__c==null && other.getPaid__c()==null) || 
             (this.paid__c!=null &&
              this.paid__c.equals(other.getPaid__c()))) &&
            ((this.password__c==null && other.getPassword__c()==null) || 
             (this.password__c!=null &&
              this.password__c.equals(other.getPassword__c()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.quiz__c==null && other.getQuiz__c()==null) || 
             (this.quiz__c!=null &&
              this.quiz__c.equals(other.getQuiz__c()))) &&
            ((this.RCA_Certificate_Sent__c==null && other.getRCA_Certificate_Sent__c()==null) || 
             (this.RCA_Certificate_Sent__c!=null &&
              this.RCA_Certificate_Sent__c.equals(other.getRCA_Certificate_Sent__c()))) &&
            ((this.score__c==null && other.getScore__c()==null) || 
             (this.score__c!=null &&
              this.score__c.equals(other.getScore__c()))) &&
            ((this.send_Survey__c==null && other.getSend_Survey__c()==null) || 
             (this.send_Survey__c!=null &&
              this.send_Survey__c.equals(other.getSend_Survey__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              this.tasks.equals(other.getTasks()))) &&
            ((this.upgrade_Exam_Old__c==null && other.getUpgrade_Exam_Old__c()==null) || 
             (this.upgrade_Exam_Old__c!=null &&
              this.upgrade_Exam_Old__c.equals(other.getUpgrade_Exam_Old__c()))) &&
            ((this.upgrade_Exam__c==null && other.getUpgrade_Exam__c()==null) || 
             (this.upgrade_Exam__c!=null &&
              this.upgrade_Exam__c.equals(other.getUpgrade_Exam__c()))) &&
            ((this.VM__c==null && other.getVM__c()==null) || 
             (this.VM__c!=null &&
              this.VM__c.equals(other.getVM__c()))) &&
            ((this.waitlist__c==null && other.getWaitlist__c()==null) || 
             (this.waitlist__c!=null &&
              this.waitlist__c.equals(other.getWaitlist__c())));
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
        if (getActivityHistories() != null) {
            _hashCode += getActivityHistories().hashCode();
        }
        if (getAdmin_Cerification__c() != null) {
            _hashCode += getAdmin_Cerification__c().hashCode();
        }
        if (getAdmin_Cerification__r() != null) {
            _hashCode += getAdmin_Cerification__r().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getAttendee_Email__c() != null) {
            _hashCode += getAttendee_Email__c().hashCode();
        }
        if (getAttendee_First_Name__c() != null) {
            _hashCode += getAttendee_First_Name__c().hashCode();
        }
        if (getAttendee_Name__c() != null) {
            _hashCode += getAttendee_Name__c().hashCode();
        }
        if (getBill_Immediately__c() != null) {
            _hashCode += getBill_Immediately__c().hashCode();
        }
        if (getBill_amount__c() != null) {
            _hashCode += getBill_amount__c().hashCode();
        }
        if (getBilling_Address__c() != null) {
            _hashCode += getBilling_Address__c().hashCode();
        }
        if (getBilling_City__c() != null) {
            _hashCode += getBilling_City__c().hashCode();
        }
        if (getBilling_Country__c() != null) {
            _hashCode += getBilling_Country__c().hashCode();
        }
        if (getBilling_Email__c() != null) {
            _hashCode += getBilling_Email__c().hashCode();
        }
        if (getBilling_Method__c() != null) {
            _hashCode += getBilling_Method__c().hashCode();
        }
        if (getBilling_State_Province__c() != null) {
            _hashCode += getBilling_State_Province__c().hashCode();
        }
        if (getBilling_Zip_Postal_Code__c() != null) {
            _hashCode += getBilling_Zip_Postal_Code__c().hashCode();
        }
        if (getCertification_Contacts__r() != null) {
            _hashCode += getCertification_Contacts__r().hashCode();
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
        if (getExam_Attendee__c() != null) {
            _hashCode += getExam_Attendee__c().hashCode();
        }
        if (getExam_Attendee__r() != null) {
            _hashCode += getExam_Attendee__r().hashCode();
        }
        if (getExam_Result__c() != null) {
            _hashCode += getExam_Result__c().hashCode();
        }
        if (getExam_Start_Date_Time__c() != null) {
            _hashCode += getExam_Start_Date_Time__c().hashCode();
        }
        if (getExercise_ID__c() != null) {
            _hashCode += getExercise_ID__c().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getHands_On__c() != null) {
            _hashCode += getHands_On__c().hashCode();
        }
        if (getHistories() != null) {
            _hashCode += getHistories().hashCode();
        }
        if (getHost_Seat__c() != null) {
            _hashCode += getHost_Seat__c().hashCode();
        }
        if (getInvoice__c() != null) {
            _hashCode += getInvoice__c().hashCode();
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
        if (getNo_Show_Date__c() != null) {
            _hashCode += getNo_Show_Date__c().hashCode();
        }
        if (getNo_Show__c() != null) {
            _hashCode += getNo_Show__c().hashCode();
        }
        if (getNot_Billable__c() != null) {
            _hashCode += getNot_Billable__c().hashCode();
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
        if (getPaid__c() != null) {
            _hashCode += getPaid__c().hashCode();
        }
        if (getPassword__c() != null) {
            _hashCode += getPassword__c().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getQuiz__c() != null) {
            _hashCode += getQuiz__c().hashCode();
        }
        if (getRCA_Certificate_Sent__c() != null) {
            _hashCode += getRCA_Certificate_Sent__c().hashCode();
        }
        if (getScore__c() != null) {
            _hashCode += getScore__c().hashCode();
        }
        if (getSend_Survey__c() != null) {
            _hashCode += getSend_Survey__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTasks() != null) {
            _hashCode += getTasks().hashCode();
        }
        if (getUpgrade_Exam_Old__c() != null) {
            _hashCode += getUpgrade_Exam_Old__c().hashCode();
        }
        if (getUpgrade_Exam__c() != null) {
            _hashCode += getUpgrade_Exam__c().hashCode();
        }
        if (getVM__c() != null) {
            _hashCode += getVM__c().hashCode();
        }
        if (getWaitlist__c() != null) {
            _hashCode += getWaitlist__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Exam_Attendees__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Exam_Attendees__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("admin_Cerification__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Admin_Cerification__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("admin_Cerification__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Admin_Cerification__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Admin_Certification__c"));
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
        elemField.setFieldName("attendee_Email__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attendee_Email__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attendee_First_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attendee_First_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attendee_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attendee_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bill_Immediately__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Bill_Immediately__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bill_amount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Bill_amount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billing_Address__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Billing_Address__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("billing_Country__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Billing_Country__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billing_Email__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Billing_Email__c"));
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
        elemField.setFieldName("billing_State_Province__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Billing_State_Province__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billing_Zip_Postal_Code__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Billing_Zip_Postal_Code__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certification_Contacts__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certification_Contacts__r"));
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
        elemField.setFieldName("events");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Events"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exam_Attendee__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Exam_Attendee__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exam_Attendee__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Exam_Attendee__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exam_Result__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Exam_Result__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exam_Start_Date_Time__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Exam_Start_Date_Time__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exercise_ID__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Exercise_ID__c"));
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
        elemField.setFieldName("hands_On__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Hands_On__c"));
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
        elemField.setFieldName("host_Seat__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Host_Seat__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoice__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Invoice__c"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("no_Show_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "No_Show_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("no_Show__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "No_Show__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("not_Billable__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Not_Billable__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("paid__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Paid__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Password__c"));
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
        elemField.setFieldName("quiz__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Quiz__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RCA_Certificate_Sent__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCA_Certificate_Sent__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Score__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("send_Survey__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Send_Survey__c"));
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
        elemField.setFieldName("upgrade_Exam_Old__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Upgrade_Exam_Old__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upgrade_Exam__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Upgrade_Exam__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VM__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "VM__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("waitlist__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Waitlist__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

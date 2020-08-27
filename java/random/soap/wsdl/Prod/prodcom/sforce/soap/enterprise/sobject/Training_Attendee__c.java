/**
 * Training_Attendee__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Training_Attendee__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String account__c;

    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.Boolean bill_Immediately__c;

    private java.lang.String billing_Address__c;

    private java.lang.String billing_City__c;

    private java.lang.String billing_Country__c;

    private java.lang.String billing_Email__c;

    private java.lang.String billing_Method__c;

    private java.lang.String billing_State_Province__c;

    private java.lang.String billing_Zip_Postal_Code__c;

    private java.lang.String contact_First_Name__c;

    private java.lang.String contact__c;

    private com.sforce.soap.enterprise.sobject.Contact contact__r;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private com.sforce.soap.enterprise.QueryResult events;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.Boolean host_Seat__c;

    private java.lang.String invoice_Created__c;

    private java.lang.String invoice_Number__c;

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

    private com.sforce.soap.enterprise.QueryResult openActivities;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.Boolean SWAG__c;

    private java.lang.Boolean sendEmail__c;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    private java.lang.Boolean training_Completed__c;

    private java.util.Calendar training_Date__c;

    private java.lang.String training_Status__c;

    private com.sforce.soap.enterprise.QueryResult training_Survey_Results__r;

    private java.lang.String training__c;

    private com.sforce.soap.enterprise.sobject.Training_Relativity__c training__r;

    private java.lang.Boolean waitlist__c;

    private java.lang.Double blonk__c;

    public Training_Attendee__c() {
    }

    public Training_Attendee__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String account__c,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.Boolean bill_Immediately__c,
           java.lang.String billing_Address__c,
           java.lang.String billing_City__c,
           java.lang.String billing_Country__c,
           java.lang.String billing_Email__c,
           java.lang.String billing_Method__c,
           java.lang.String billing_State_Province__c,
           java.lang.String billing_Zip_Postal_Code__c,
           java.lang.String contact_First_Name__c,
           java.lang.String contact__c,
           com.sforce.soap.enterprise.sobject.Contact contact__r,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           com.sforce.soap.enterprise.QueryResult events,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.Boolean host_Seat__c,
           java.lang.String invoice_Created__c,
           java.lang.String invoice_Number__c,
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
           com.sforce.soap.enterprise.QueryResult openActivities,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.Boolean SWAG__c,
           java.lang.Boolean sendEmail__c,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks,
           java.lang.Boolean training_Completed__c,
           java.util.Calendar training_Date__c,
           java.lang.String training_Status__c,
           com.sforce.soap.enterprise.QueryResult training_Survey_Results__r,
           java.lang.String training__c,
           com.sforce.soap.enterprise.sobject.Training_Relativity__c training__r,
           java.lang.Boolean waitlist__c,
           java.lang.Double blonk__c) {
        super(
            fieldsToNull,
            id);
        this.account__c = account__c;
        this.activityHistories = activityHistories;
        this.attachments = attachments;
        this.bill_Immediately__c = bill_Immediately__c;
        this.billing_Address__c = billing_Address__c;
        this.billing_City__c = billing_City__c;
        this.billing_Country__c = billing_Country__c;
        this.billing_Email__c = billing_Email__c;
        this.billing_Method__c = billing_Method__c;
        this.billing_State_Province__c = billing_State_Province__c;
        this.billing_Zip_Postal_Code__c = billing_Zip_Postal_Code__c;
        this.contact_First_Name__c = contact_First_Name__c;
        this.contact__c = contact__c;
        this.contact__r = contact__r;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.events = events;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.histories = histories;
        this.host_Seat__c = host_Seat__c;
        this.invoice_Created__c = invoice_Created__c;
        this.invoice_Number__c = invoice_Number__c;
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
        this.openActivities = openActivities;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.SWAG__c = SWAG__c;
        this.sendEmail__c = sendEmail__c;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
        this.training_Completed__c = training_Completed__c;
        this.training_Date__c = training_Date__c;
        this.training_Status__c = training_Status__c;
        this.training_Survey_Results__r = training_Survey_Results__r;
        this.training__c = training__c;
        this.training__r = training__r;
        this.waitlist__c = waitlist__c;
        this.blonk__c = blonk__c;
    }


    /**
     * Gets the account__c value for this Training_Attendee__c.
     * 
     * @return account__c
     */
    public java.lang.String getAccount__c() {
        return account__c;
    }


    /**
     * Sets the account__c value for this Training_Attendee__c.
     * 
     * @param account__c
     */
    public void setAccount__c(java.lang.String account__c) {
        this.account__c = account__c;
    }


    /**
     * Gets the activityHistories value for this Training_Attendee__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this Training_Attendee__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the attachments value for this Training_Attendee__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Training_Attendee__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the bill_Immediately__c value for this Training_Attendee__c.
     * 
     * @return bill_Immediately__c
     */
    public java.lang.Boolean getBill_Immediately__c() {
        return bill_Immediately__c;
    }


    /**
     * Sets the bill_Immediately__c value for this Training_Attendee__c.
     * 
     * @param bill_Immediately__c
     */
    public void setBill_Immediately__c(java.lang.Boolean bill_Immediately__c) {
        this.bill_Immediately__c = bill_Immediately__c;
    }


    /**
     * Gets the billing_Address__c value for this Training_Attendee__c.
     * 
     * @return billing_Address__c
     */
    public java.lang.String getBilling_Address__c() {
        return billing_Address__c;
    }


    /**
     * Sets the billing_Address__c value for this Training_Attendee__c.
     * 
     * @param billing_Address__c
     */
    public void setBilling_Address__c(java.lang.String billing_Address__c) {
        this.billing_Address__c = billing_Address__c;
    }


    /**
     * Gets the billing_City__c value for this Training_Attendee__c.
     * 
     * @return billing_City__c
     */
    public java.lang.String getBilling_City__c() {
        return billing_City__c;
    }


    /**
     * Sets the billing_City__c value for this Training_Attendee__c.
     * 
     * @param billing_City__c
     */
    public void setBilling_City__c(java.lang.String billing_City__c) {
        this.billing_City__c = billing_City__c;
    }


    /**
     * Gets the billing_Country__c value for this Training_Attendee__c.
     * 
     * @return billing_Country__c
     */
    public java.lang.String getBilling_Country__c() {
        return billing_Country__c;
    }


    /**
     * Sets the billing_Country__c value for this Training_Attendee__c.
     * 
     * @param billing_Country__c
     */
    public void setBilling_Country__c(java.lang.String billing_Country__c) {
        this.billing_Country__c = billing_Country__c;
    }


    /**
     * Gets the billing_Email__c value for this Training_Attendee__c.
     * 
     * @return billing_Email__c
     */
    public java.lang.String getBilling_Email__c() {
        return billing_Email__c;
    }


    /**
     * Sets the billing_Email__c value for this Training_Attendee__c.
     * 
     * @param billing_Email__c
     */
    public void setBilling_Email__c(java.lang.String billing_Email__c) {
        this.billing_Email__c = billing_Email__c;
    }


    /**
     * Gets the billing_Method__c value for this Training_Attendee__c.
     * 
     * @return billing_Method__c
     */
    public java.lang.String getBilling_Method__c() {
        return billing_Method__c;
    }


    /**
     * Sets the billing_Method__c value for this Training_Attendee__c.
     * 
     * @param billing_Method__c
     */
    public void setBilling_Method__c(java.lang.String billing_Method__c) {
        this.billing_Method__c = billing_Method__c;
    }


    /**
     * Gets the billing_State_Province__c value for this Training_Attendee__c.
     * 
     * @return billing_State_Province__c
     */
    public java.lang.String getBilling_State_Province__c() {
        return billing_State_Province__c;
    }


    /**
     * Sets the billing_State_Province__c value for this Training_Attendee__c.
     * 
     * @param billing_State_Province__c
     */
    public void setBilling_State_Province__c(java.lang.String billing_State_Province__c) {
        this.billing_State_Province__c = billing_State_Province__c;
    }


    /**
     * Gets the billing_Zip_Postal_Code__c value for this Training_Attendee__c.
     * 
     * @return billing_Zip_Postal_Code__c
     */
    public java.lang.String getBilling_Zip_Postal_Code__c() {
        return billing_Zip_Postal_Code__c;
    }


    /**
     * Sets the billing_Zip_Postal_Code__c value for this Training_Attendee__c.
     * 
     * @param billing_Zip_Postal_Code__c
     */
    public void setBilling_Zip_Postal_Code__c(java.lang.String billing_Zip_Postal_Code__c) {
        this.billing_Zip_Postal_Code__c = billing_Zip_Postal_Code__c;
    }


    /**
     * Gets the contact_First_Name__c value for this Training_Attendee__c.
     * 
     * @return contact_First_Name__c
     */
    public java.lang.String getContact_First_Name__c() {
        return contact_First_Name__c;
    }


    /**
     * Sets the contact_First_Name__c value for this Training_Attendee__c.
     * 
     * @param contact_First_Name__c
     */
    public void setContact_First_Name__c(java.lang.String contact_First_Name__c) {
        this.contact_First_Name__c = contact_First_Name__c;
    }


    /**
     * Gets the contact__c value for this Training_Attendee__c.
     * 
     * @return contact__c
     */
    public java.lang.String getContact__c() {
        return contact__c;
    }


    /**
     * Sets the contact__c value for this Training_Attendee__c.
     * 
     * @param contact__c
     */
    public void setContact__c(java.lang.String contact__c) {
        this.contact__c = contact__c;
    }


    /**
     * Gets the contact__r value for this Training_Attendee__c.
     * 
     * @return contact__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getContact__r() {
        return contact__r;
    }


    /**
     * Sets the contact__r value for this Training_Attendee__c.
     * 
     * @param contact__r
     */
    public void setContact__r(com.sforce.soap.enterprise.sobject.Contact contact__r) {
        this.contact__r = contact__r;
    }


    /**
     * Gets the createdBy value for this Training_Attendee__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Training_Attendee__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Training_Attendee__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Training_Attendee__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Training_Attendee__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Training_Attendee__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the events value for this Training_Attendee__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Training_Attendee__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Training_Attendee__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Training_Attendee__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the histories value for this Training_Attendee__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Training_Attendee__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the host_Seat__c value for this Training_Attendee__c.
     * 
     * @return host_Seat__c
     */
    public java.lang.Boolean getHost_Seat__c() {
        return host_Seat__c;
    }


    /**
     * Sets the host_Seat__c value for this Training_Attendee__c.
     * 
     * @param host_Seat__c
     */
    public void setHost_Seat__c(java.lang.Boolean host_Seat__c) {
        this.host_Seat__c = host_Seat__c;
    }


    /**
     * Gets the invoice_Created__c value for this Training_Attendee__c.
     * 
     * @return invoice_Created__c
     */
    public java.lang.String getInvoice_Created__c() {
        return invoice_Created__c;
    }


    /**
     * Sets the invoice_Created__c value for this Training_Attendee__c.
     * 
     * @param invoice_Created__c
     */
    public void setInvoice_Created__c(java.lang.String invoice_Created__c) {
        this.invoice_Created__c = invoice_Created__c;
    }


    /**
     * Gets the invoice_Number__c value for this Training_Attendee__c.
     * 
     * @return invoice_Number__c
     */
    public java.lang.String getInvoice_Number__c() {
        return invoice_Number__c;
    }


    /**
     * Sets the invoice_Number__c value for this Training_Attendee__c.
     * 
     * @param invoice_Number__c
     */
    public void setInvoice_Number__c(java.lang.String invoice_Number__c) {
        this.invoice_Number__c = invoice_Number__c;
    }


    /**
     * Gets the isDeleted value for this Training_Attendee__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Training_Attendee__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastActivityDate value for this Training_Attendee__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Training_Attendee__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this Training_Attendee__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Training_Attendee__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Training_Attendee__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Training_Attendee__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Training_Attendee__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Training_Attendee__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this Training_Attendee__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Training_Attendee__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the no_Show_Date__c value for this Training_Attendee__c.
     * 
     * @return no_Show_Date__c
     */
    public java.util.Calendar getNo_Show_Date__c() {
        return no_Show_Date__c;
    }


    /**
     * Sets the no_Show_Date__c value for this Training_Attendee__c.
     * 
     * @param no_Show_Date__c
     */
    public void setNo_Show_Date__c(java.util.Calendar no_Show_Date__c) {
        this.no_Show_Date__c = no_Show_Date__c;
    }


    /**
     * Gets the no_Show__c value for this Training_Attendee__c.
     * 
     * @return no_Show__c
     */
    public java.lang.Boolean getNo_Show__c() {
        return no_Show__c;
    }


    /**
     * Sets the no_Show__c value for this Training_Attendee__c.
     * 
     * @param no_Show__c
     */
    public void setNo_Show__c(java.lang.Boolean no_Show__c) {
        this.no_Show__c = no_Show__c;
    }


    /**
     * Gets the not_Billable__c value for this Training_Attendee__c.
     * 
     * @return not_Billable__c
     */
    public java.lang.Boolean getNot_Billable__c() {
        return not_Billable__c;
    }


    /**
     * Sets the not_Billable__c value for this Training_Attendee__c.
     * 
     * @param not_Billable__c
     */
    public void setNot_Billable__c(java.lang.Boolean not_Billable__c) {
        this.not_Billable__c = not_Billable__c;
    }


    /**
     * Gets the notes value for this Training_Attendee__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Training_Attendee__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Training_Attendee__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Training_Attendee__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the openActivities value for this Training_Attendee__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this Training_Attendee__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the processInstances value for this Training_Attendee__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Training_Attendee__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Training_Attendee__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Training_Attendee__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the SWAG__c value for this Training_Attendee__c.
     * 
     * @return SWAG__c
     */
    public java.lang.Boolean getSWAG__c() {
        return SWAG__c;
    }


    /**
     * Sets the SWAG__c value for this Training_Attendee__c.
     * 
     * @param SWAG__c
     */
    public void setSWAG__c(java.lang.Boolean SWAG__c) {
        this.SWAG__c = SWAG__c;
    }


    /**
     * Gets the sendEmail__c value for this Training_Attendee__c.
     * 
     * @return sendEmail__c
     */
    public java.lang.Boolean getSendEmail__c() {
        return sendEmail__c;
    }


    /**
     * Sets the sendEmail__c value for this Training_Attendee__c.
     * 
     * @param sendEmail__c
     */
    public void setSendEmail__c(java.lang.Boolean sendEmail__c) {
        this.sendEmail__c = sendEmail__c;
    }


    /**
     * Gets the systemModstamp value for this Training_Attendee__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Training_Attendee__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this Training_Attendee__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Training_Attendee__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the training_Completed__c value for this Training_Attendee__c.
     * 
     * @return training_Completed__c
     */
    public java.lang.Boolean getTraining_Completed__c() {
        return training_Completed__c;
    }


    /**
     * Sets the training_Completed__c value for this Training_Attendee__c.
     * 
     * @param training_Completed__c
     */
    public void setTraining_Completed__c(java.lang.Boolean training_Completed__c) {
        this.training_Completed__c = training_Completed__c;
    }


    /**
     * Gets the training_Date__c value for this Training_Attendee__c.
     * 
     * @return training_Date__c
     */
    public java.util.Calendar getTraining_Date__c() {
        return training_Date__c;
    }


    /**
     * Sets the training_Date__c value for this Training_Attendee__c.
     * 
     * @param training_Date__c
     */
    public void setTraining_Date__c(java.util.Calendar training_Date__c) {
        this.training_Date__c = training_Date__c;
    }


    /**
     * Gets the training_Status__c value for this Training_Attendee__c.
     * 
     * @return training_Status__c
     */
    public java.lang.String getTraining_Status__c() {
        return training_Status__c;
    }


    /**
     * Sets the training_Status__c value for this Training_Attendee__c.
     * 
     * @param training_Status__c
     */
    public void setTraining_Status__c(java.lang.String training_Status__c) {
        this.training_Status__c = training_Status__c;
    }


    /**
     * Gets the training_Survey_Results__r value for this Training_Attendee__c.
     * 
     * @return training_Survey_Results__r
     */
    public com.sforce.soap.enterprise.QueryResult getTraining_Survey_Results__r() {
        return training_Survey_Results__r;
    }


    /**
     * Sets the training_Survey_Results__r value for this Training_Attendee__c.
     * 
     * @param training_Survey_Results__r
     */
    public void setTraining_Survey_Results__r(com.sforce.soap.enterprise.QueryResult training_Survey_Results__r) {
        this.training_Survey_Results__r = training_Survey_Results__r;
    }


    /**
     * Gets the training__c value for this Training_Attendee__c.
     * 
     * @return training__c
     */
    public java.lang.String getTraining__c() {
        return training__c;
    }


    /**
     * Sets the training__c value for this Training_Attendee__c.
     * 
     * @param training__c
     */
    public void setTraining__c(java.lang.String training__c) {
        this.training__c = training__c;
    }


    /**
     * Gets the training__r value for this Training_Attendee__c.
     * 
     * @return training__r
     */
    public com.sforce.soap.enterprise.sobject.Training_Relativity__c getTraining__r() {
        return training__r;
    }


    /**
     * Sets the training__r value for this Training_Attendee__c.
     * 
     * @param training__r
     */
    public void setTraining__r(com.sforce.soap.enterprise.sobject.Training_Relativity__c training__r) {
        this.training__r = training__r;
    }


    /**
     * Gets the waitlist__c value for this Training_Attendee__c.
     * 
     * @return waitlist__c
     */
    public java.lang.Boolean getWaitlist__c() {
        return waitlist__c;
    }


    /**
     * Sets the waitlist__c value for this Training_Attendee__c.
     * 
     * @param waitlist__c
     */
    public void setWaitlist__c(java.lang.Boolean waitlist__c) {
        this.waitlist__c = waitlist__c;
    }


    /**
     * Gets the blonk__c value for this Training_Attendee__c.
     * 
     * @return blonk__c
     */
    public java.lang.Double getKCura__c() {
        return blonk__c;
    }


    /**
     * Sets the blonk__c value for this Training_Attendee__c.
     * 
     * @param blonk__c
     */
    public void setKCura__c(java.lang.Double blonk__c) {
        this.blonk__c = blonk__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Training_Attendee__c)) return false;
        Training_Attendee__c other = (Training_Attendee__c) obj;
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
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.bill_Immediately__c==null && other.getBill_Immediately__c()==null) || 
             (this.bill_Immediately__c!=null &&
              this.bill_Immediately__c.equals(other.getBill_Immediately__c()))) &&
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
            ((this.contact_First_Name__c==null && other.getContact_First_Name__c()==null) || 
             (this.contact_First_Name__c!=null &&
              this.contact_First_Name__c.equals(other.getContact_First_Name__c()))) &&
            ((this.contact__c==null && other.getContact__c()==null) || 
             (this.contact__c!=null &&
              this.contact__c.equals(other.getContact__c()))) &&
            ((this.contact__r==null && other.getContact__r()==null) || 
             (this.contact__r!=null &&
              this.contact__r.equals(other.getContact__r()))) &&
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
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
            ((this.host_Seat__c==null && other.getHost_Seat__c()==null) || 
             (this.host_Seat__c!=null &&
              this.host_Seat__c.equals(other.getHost_Seat__c()))) &&
            ((this.invoice_Created__c==null && other.getInvoice_Created__c()==null) || 
             (this.invoice_Created__c!=null &&
              this.invoice_Created__c.equals(other.getInvoice_Created__c()))) &&
            ((this.invoice_Number__c==null && other.getInvoice_Number__c()==null) || 
             (this.invoice_Number__c!=null &&
              this.invoice_Number__c.equals(other.getInvoice_Number__c()))) &&
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
            ((this.openActivities==null && other.getOpenActivities()==null) || 
             (this.openActivities!=null &&
              this.openActivities.equals(other.getOpenActivities()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.SWAG__c==null && other.getSWAG__c()==null) || 
             (this.SWAG__c!=null &&
              this.SWAG__c.equals(other.getSWAG__c()))) &&
            ((this.sendEmail__c==null && other.getSendEmail__c()==null) || 
             (this.sendEmail__c!=null &&
              this.sendEmail__c.equals(other.getSendEmail__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              this.tasks.equals(other.getTasks()))) &&
            ((this.training_Completed__c==null && other.getTraining_Completed__c()==null) || 
             (this.training_Completed__c!=null &&
              this.training_Completed__c.equals(other.getTraining_Completed__c()))) &&
            ((this.training_Date__c==null && other.getTraining_Date__c()==null) || 
             (this.training_Date__c!=null &&
              this.training_Date__c.equals(other.getTraining_Date__c()))) &&
            ((this.training_Status__c==null && other.getTraining_Status__c()==null) || 
             (this.training_Status__c!=null &&
              this.training_Status__c.equals(other.getTraining_Status__c()))) &&
            ((this.training_Survey_Results__r==null && other.getTraining_Survey_Results__r()==null) || 
             (this.training_Survey_Results__r!=null &&
              this.training_Survey_Results__r.equals(other.getTraining_Survey_Results__r()))) &&
            ((this.training__c==null && other.getTraining__c()==null) || 
             (this.training__c!=null &&
              this.training__c.equals(other.getTraining__c()))) &&
            ((this.training__r==null && other.getTraining__r()==null) || 
             (this.training__r!=null &&
              this.training__r.equals(other.getTraining__r()))) &&
            ((this.waitlist__c==null && other.getWaitlist__c()==null) || 
             (this.waitlist__c!=null &&
              this.waitlist__c.equals(other.getWaitlist__c()))) &&
            ((this.blonk__c==null && other.getKCura__c()==null) || 
             (this.blonk__c!=null &&
              this.blonk__c.equals(other.getKCura__c())));
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
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getBill_Immediately__c() != null) {
            _hashCode += getBill_Immediately__c().hashCode();
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
        if (getContact_First_Name__c() != null) {
            _hashCode += getContact_First_Name__c().hashCode();
        }
        if (getContact__c() != null) {
            _hashCode += getContact__c().hashCode();
        }
        if (getContact__r() != null) {
            _hashCode += getContact__r().hashCode();
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
        if (getHistories() != null) {
            _hashCode += getHistories().hashCode();
        }
        if (getHost_Seat__c() != null) {
            _hashCode += getHost_Seat__c().hashCode();
        }
        if (getInvoice_Created__c() != null) {
            _hashCode += getInvoice_Created__c().hashCode();
        }
        if (getInvoice_Number__c() != null) {
            _hashCode += getInvoice_Number__c().hashCode();
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
        if (getOpenActivities() != null) {
            _hashCode += getOpenActivities().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getSWAG__c() != null) {
            _hashCode += getSWAG__c().hashCode();
        }
        if (getSendEmail__c() != null) {
            _hashCode += getSendEmail__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTasks() != null) {
            _hashCode += getTasks().hashCode();
        }
        if (getTraining_Completed__c() != null) {
            _hashCode += getTraining_Completed__c().hashCode();
        }
        if (getTraining_Date__c() != null) {
            _hashCode += getTraining_Date__c().hashCode();
        }
        if (getTraining_Status__c() != null) {
            _hashCode += getTraining_Status__c().hashCode();
        }
        if (getTraining_Survey_Results__r() != null) {
            _hashCode += getTraining_Survey_Results__r().hashCode();
        }
        if (getTraining__c() != null) {
            _hashCode += getTraining__c().hashCode();
        }
        if (getTraining__r() != null) {
            _hashCode += getTraining__r().hashCode();
        }
        if (getWaitlist__c() != null) {
            _hashCode += getWaitlist__c().hashCode();
        }
        if (getKCura__c() != null) {
            _hashCode += getKCura__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Training_Attendee__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Attendee__c"));
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
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("contact_First_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact_First_Name__c"));
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
        elemField.setFieldName("contact__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
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
        elemField.setFieldName("invoice_Created__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Invoice_Created__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoice_Number__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Invoice_Number__c"));
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
        elemField.setFieldName("openActivities");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpenActivities"));
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
        elemField.setFieldName("SWAG__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SWAG__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("training_Completed__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Completed__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("training_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("training_Status__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Status__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("training_Survey_Results__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Survey_Results__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("training__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("training__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Relativity__c"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KCura__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "blonk__c"));
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

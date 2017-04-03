/**
 * RegOnline__RegOnlineContact__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class RegOnline__RegOnlineContact__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private com.sforce.soap.enterprise.QueryResult events;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult histories;

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

    private java.lang.String regOnline__City__c;

    private java.lang.String regOnline__Company__c;

    private java.lang.String regOnline__Country__c;

    private java.lang.String regOnline__Custom_Fields__c;

    private java.lang.String regOnline__Email__c;

    private java.lang.String regOnline__Fax__c;

    private java.lang.String regOnline__First_Name__c;

    private java.lang.String regOnline__Last_Name__c;

    private java.lang.Boolean regOnline__Merged__c;

    private java.lang.String regOnline__Mobile_Phone__c;

    private java.lang.String regOnline__Phone__c;

    private java.lang.String regOnline__Postal_Code__c;

    private java.lang.String regOnline__Salutation__c;

    private java.lang.String regOnline__State__c;

    private java.lang.String regOnline__Street__c;

    private java.lang.String regOnline__Title__c;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    private java.lang.String test__c;

    public RegOnline__RegOnlineContact__c() {
    }

    public RegOnline__RegOnlineContact__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           com.sforce.soap.enterprise.QueryResult attachments,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           com.sforce.soap.enterprise.QueryResult events,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult histories,
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
           java.lang.String regOnline__City__c,
           java.lang.String regOnline__Company__c,
           java.lang.String regOnline__Country__c,
           java.lang.String regOnline__Custom_Fields__c,
           java.lang.String regOnline__Email__c,
           java.lang.String regOnline__Fax__c,
           java.lang.String regOnline__First_Name__c,
           java.lang.String regOnline__Last_Name__c,
           java.lang.Boolean regOnline__Merged__c,
           java.lang.String regOnline__Mobile_Phone__c,
           java.lang.String regOnline__Phone__c,
           java.lang.String regOnline__Postal_Code__c,
           java.lang.String regOnline__Salutation__c,
           java.lang.String regOnline__State__c,
           java.lang.String regOnline__Street__c,
           java.lang.String regOnline__Title__c,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks,
           java.lang.String test__c) {
        super(
            fieldsToNull,
            id);
        this.activityHistories = activityHistories;
        this.attachments = attachments;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.events = events;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.histories = histories;
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
        this.regOnline__City__c = regOnline__City__c;
        this.regOnline__Company__c = regOnline__Company__c;
        this.regOnline__Country__c = regOnline__Country__c;
        this.regOnline__Custom_Fields__c = regOnline__Custom_Fields__c;
        this.regOnline__Email__c = regOnline__Email__c;
        this.regOnline__Fax__c = regOnline__Fax__c;
        this.regOnline__First_Name__c = regOnline__First_Name__c;
        this.regOnline__Last_Name__c = regOnline__Last_Name__c;
        this.regOnline__Merged__c = regOnline__Merged__c;
        this.regOnline__Mobile_Phone__c = regOnline__Mobile_Phone__c;
        this.regOnline__Phone__c = regOnline__Phone__c;
        this.regOnline__Postal_Code__c = regOnline__Postal_Code__c;
        this.regOnline__Salutation__c = regOnline__Salutation__c;
        this.regOnline__State__c = regOnline__State__c;
        this.regOnline__Street__c = regOnline__Street__c;
        this.regOnline__Title__c = regOnline__Title__c;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
        this.test__c = test__c;
    }


    /**
     * Gets the activityHistories value for this RegOnline__RegOnlineContact__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this RegOnline__RegOnlineContact__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the attachments value for this RegOnline__RegOnlineContact__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this RegOnline__RegOnlineContact__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the createdBy value for this RegOnline__RegOnlineContact__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this RegOnline__RegOnlineContact__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this RegOnline__RegOnlineContact__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this RegOnline__RegOnlineContact__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this RegOnline__RegOnlineContact__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this RegOnline__RegOnlineContact__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the events value for this RegOnline__RegOnlineContact__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this RegOnline__RegOnlineContact__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this RegOnline__RegOnlineContact__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this RegOnline__RegOnlineContact__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the histories value for this RegOnline__RegOnlineContact__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this RegOnline__RegOnlineContact__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the isDeleted value for this RegOnline__RegOnlineContact__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this RegOnline__RegOnlineContact__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastActivityDate value for this RegOnline__RegOnlineContact__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this RegOnline__RegOnlineContact__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this RegOnline__RegOnlineContact__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this RegOnline__RegOnlineContact__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this RegOnline__RegOnlineContact__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this RegOnline__RegOnlineContact__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this RegOnline__RegOnlineContact__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this RegOnline__RegOnlineContact__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this RegOnline__RegOnlineContact__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this RegOnline__RegOnlineContact__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this RegOnline__RegOnlineContact__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this RegOnline__RegOnlineContact__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this RegOnline__RegOnlineContact__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this RegOnline__RegOnlineContact__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the openActivities value for this RegOnline__RegOnlineContact__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this RegOnline__RegOnlineContact__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the owner value for this RegOnline__RegOnlineContact__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this RegOnline__RegOnlineContact__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this RegOnline__RegOnlineContact__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this RegOnline__RegOnlineContact__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this RegOnline__RegOnlineContact__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this RegOnline__RegOnlineContact__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this RegOnline__RegOnlineContact__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this RegOnline__RegOnlineContact__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the regOnline__City__c value for this RegOnline__RegOnlineContact__c.
     * 
     * @return regOnline__City__c
     */
    public java.lang.String getRegOnline__City__c() {
        return regOnline__City__c;
    }


    /**
     * Sets the regOnline__City__c value for this RegOnline__RegOnlineContact__c.
     * 
     * @param regOnline__City__c
     */
    public void setRegOnline__City__c(java.lang.String regOnline__City__c) {
        this.regOnline__City__c = regOnline__City__c;
    }


    /**
     * Gets the regOnline__Company__c value for this RegOnline__RegOnlineContact__c.
     * 
     * @return regOnline__Company__c
     */
    public java.lang.String getRegOnline__Company__c() {
        return regOnline__Company__c;
    }


    /**
     * Sets the regOnline__Company__c value for this RegOnline__RegOnlineContact__c.
     * 
     * @param regOnline__Company__c
     */
    public void setRegOnline__Company__c(java.lang.String regOnline__Company__c) {
        this.regOnline__Company__c = regOnline__Company__c;
    }


    /**
     * Gets the regOnline__Country__c value for this RegOnline__RegOnlineContact__c.
     * 
     * @return regOnline__Country__c
     */
    public java.lang.String getRegOnline__Country__c() {
        return regOnline__Country__c;
    }


    /**
     * Sets the regOnline__Country__c value for this RegOnline__RegOnlineContact__c.
     * 
     * @param regOnline__Country__c
     */
    public void setRegOnline__Country__c(java.lang.String regOnline__Country__c) {
        this.regOnline__Country__c = regOnline__Country__c;
    }


    /**
     * Gets the regOnline__Custom_Fields__c value for this RegOnline__RegOnlineContact__c.
     * 
     * @return regOnline__Custom_Fields__c
     */
    public java.lang.String getRegOnline__Custom_Fields__c() {
        return regOnline__Custom_Fields__c;
    }


    /**
     * Sets the regOnline__Custom_Fields__c value for this RegOnline__RegOnlineContact__c.
     * 
     * @param regOnline__Custom_Fields__c
     */
    public void setRegOnline__Custom_Fields__c(java.lang.String regOnline__Custom_Fields__c) {
        this.regOnline__Custom_Fields__c = regOnline__Custom_Fields__c;
    }


    /**
     * Gets the regOnline__Email__c value for this RegOnline__RegOnlineContact__c.
     * 
     * @return regOnline__Email__c
     */
    public java.lang.String getRegOnline__Email__c() {
        return regOnline__Email__c;
    }


    /**
     * Sets the regOnline__Email__c value for this RegOnline__RegOnlineContact__c.
     * 
     * @param regOnline__Email__c
     */
    public void setRegOnline__Email__c(java.lang.String regOnline__Email__c) {
        this.regOnline__Email__c = regOnline__Email__c;
    }


    /**
     * Gets the regOnline__Fax__c value for this RegOnline__RegOnlineContact__c.
     * 
     * @return regOnline__Fax__c
     */
    public java.lang.String getRegOnline__Fax__c() {
        return regOnline__Fax__c;
    }


    /**
     * Sets the regOnline__Fax__c value for this RegOnline__RegOnlineContact__c.
     * 
     * @param regOnline__Fax__c
     */
    public void setRegOnline__Fax__c(java.lang.String regOnline__Fax__c) {
        this.regOnline__Fax__c = regOnline__Fax__c;
    }


    /**
     * Gets the regOnline__First_Name__c value for this RegOnline__RegOnlineContact__c.
     * 
     * @return regOnline__First_Name__c
     */
    public java.lang.String getRegOnline__First_Name__c() {
        return regOnline__First_Name__c;
    }


    /**
     * Sets the regOnline__First_Name__c value for this RegOnline__RegOnlineContact__c.
     * 
     * @param regOnline__First_Name__c
     */
    public void setRegOnline__First_Name__c(java.lang.String regOnline__First_Name__c) {
        this.regOnline__First_Name__c = regOnline__First_Name__c;
    }


    /**
     * Gets the regOnline__Last_Name__c value for this RegOnline__RegOnlineContact__c.
     * 
     * @return regOnline__Last_Name__c
     */
    public java.lang.String getRegOnline__Last_Name__c() {
        return regOnline__Last_Name__c;
    }


    /**
     * Sets the regOnline__Last_Name__c value for this RegOnline__RegOnlineContact__c.
     * 
     * @param regOnline__Last_Name__c
     */
    public void setRegOnline__Last_Name__c(java.lang.String regOnline__Last_Name__c) {
        this.regOnline__Last_Name__c = regOnline__Last_Name__c;
    }


    /**
     * Gets the regOnline__Merged__c value for this RegOnline__RegOnlineContact__c.
     * 
     * @return regOnline__Merged__c
     */
    public java.lang.Boolean getRegOnline__Merged__c() {
        return regOnline__Merged__c;
    }


    /**
     * Sets the regOnline__Merged__c value for this RegOnline__RegOnlineContact__c.
     * 
     * @param regOnline__Merged__c
     */
    public void setRegOnline__Merged__c(java.lang.Boolean regOnline__Merged__c) {
        this.regOnline__Merged__c = regOnline__Merged__c;
    }


    /**
     * Gets the regOnline__Mobile_Phone__c value for this RegOnline__RegOnlineContact__c.
     * 
     * @return regOnline__Mobile_Phone__c
     */
    public java.lang.String getRegOnline__Mobile_Phone__c() {
        return regOnline__Mobile_Phone__c;
    }


    /**
     * Sets the regOnline__Mobile_Phone__c value for this RegOnline__RegOnlineContact__c.
     * 
     * @param regOnline__Mobile_Phone__c
     */
    public void setRegOnline__Mobile_Phone__c(java.lang.String regOnline__Mobile_Phone__c) {
        this.regOnline__Mobile_Phone__c = regOnline__Mobile_Phone__c;
    }


    /**
     * Gets the regOnline__Phone__c value for this RegOnline__RegOnlineContact__c.
     * 
     * @return regOnline__Phone__c
     */
    public java.lang.String getRegOnline__Phone__c() {
        return regOnline__Phone__c;
    }


    /**
     * Sets the regOnline__Phone__c value for this RegOnline__RegOnlineContact__c.
     * 
     * @param regOnline__Phone__c
     */
    public void setRegOnline__Phone__c(java.lang.String regOnline__Phone__c) {
        this.regOnline__Phone__c = regOnline__Phone__c;
    }


    /**
     * Gets the regOnline__Postal_Code__c value for this RegOnline__RegOnlineContact__c.
     * 
     * @return regOnline__Postal_Code__c
     */
    public java.lang.String getRegOnline__Postal_Code__c() {
        return regOnline__Postal_Code__c;
    }


    /**
     * Sets the regOnline__Postal_Code__c value for this RegOnline__RegOnlineContact__c.
     * 
     * @param regOnline__Postal_Code__c
     */
    public void setRegOnline__Postal_Code__c(java.lang.String regOnline__Postal_Code__c) {
        this.regOnline__Postal_Code__c = regOnline__Postal_Code__c;
    }


    /**
     * Gets the regOnline__Salutation__c value for this RegOnline__RegOnlineContact__c.
     * 
     * @return regOnline__Salutation__c
     */
    public java.lang.String getRegOnline__Salutation__c() {
        return regOnline__Salutation__c;
    }


    /**
     * Sets the regOnline__Salutation__c value for this RegOnline__RegOnlineContact__c.
     * 
     * @param regOnline__Salutation__c
     */
    public void setRegOnline__Salutation__c(java.lang.String regOnline__Salutation__c) {
        this.regOnline__Salutation__c = regOnline__Salutation__c;
    }


    /**
     * Gets the regOnline__State__c value for this RegOnline__RegOnlineContact__c.
     * 
     * @return regOnline__State__c
     */
    public java.lang.String getRegOnline__State__c() {
        return regOnline__State__c;
    }


    /**
     * Sets the regOnline__State__c value for this RegOnline__RegOnlineContact__c.
     * 
     * @param regOnline__State__c
     */
    public void setRegOnline__State__c(java.lang.String regOnline__State__c) {
        this.regOnline__State__c = regOnline__State__c;
    }


    /**
     * Gets the regOnline__Street__c value for this RegOnline__RegOnlineContact__c.
     * 
     * @return regOnline__Street__c
     */
    public java.lang.String getRegOnline__Street__c() {
        return regOnline__Street__c;
    }


    /**
     * Sets the regOnline__Street__c value for this RegOnline__RegOnlineContact__c.
     * 
     * @param regOnline__Street__c
     */
    public void setRegOnline__Street__c(java.lang.String regOnline__Street__c) {
        this.regOnline__Street__c = regOnline__Street__c;
    }


    /**
     * Gets the regOnline__Title__c value for this RegOnline__RegOnlineContact__c.
     * 
     * @return regOnline__Title__c
     */
    public java.lang.String getRegOnline__Title__c() {
        return regOnline__Title__c;
    }


    /**
     * Sets the regOnline__Title__c value for this RegOnline__RegOnlineContact__c.
     * 
     * @param regOnline__Title__c
     */
    public void setRegOnline__Title__c(java.lang.String regOnline__Title__c) {
        this.regOnline__Title__c = regOnline__Title__c;
    }


    /**
     * Gets the systemModstamp value for this RegOnline__RegOnlineContact__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this RegOnline__RegOnlineContact__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this RegOnline__RegOnlineContact__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this RegOnline__RegOnlineContact__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the test__c value for this RegOnline__RegOnlineContact__c.
     * 
     * @return test__c
     */
    public java.lang.String getTest__c() {
        return test__c;
    }


    /**
     * Sets the test__c value for this RegOnline__RegOnlineContact__c.
     * 
     * @param test__c
     */
    public void setTest__c(java.lang.String test__c) {
        this.test__c = test__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegOnline__RegOnlineContact__c)) return false;
        RegOnline__RegOnlineContact__c other = (RegOnline__RegOnlineContact__c) obj;
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
            ((this.regOnline__City__c==null && other.getRegOnline__City__c()==null) || 
             (this.regOnline__City__c!=null &&
              this.regOnline__City__c.equals(other.getRegOnline__City__c()))) &&
            ((this.regOnline__Company__c==null && other.getRegOnline__Company__c()==null) || 
             (this.regOnline__Company__c!=null &&
              this.regOnline__Company__c.equals(other.getRegOnline__Company__c()))) &&
            ((this.regOnline__Country__c==null && other.getRegOnline__Country__c()==null) || 
             (this.regOnline__Country__c!=null &&
              this.regOnline__Country__c.equals(other.getRegOnline__Country__c()))) &&
            ((this.regOnline__Custom_Fields__c==null && other.getRegOnline__Custom_Fields__c()==null) || 
             (this.regOnline__Custom_Fields__c!=null &&
              this.regOnline__Custom_Fields__c.equals(other.getRegOnline__Custom_Fields__c()))) &&
            ((this.regOnline__Email__c==null && other.getRegOnline__Email__c()==null) || 
             (this.regOnline__Email__c!=null &&
              this.regOnline__Email__c.equals(other.getRegOnline__Email__c()))) &&
            ((this.regOnline__Fax__c==null && other.getRegOnline__Fax__c()==null) || 
             (this.regOnline__Fax__c!=null &&
              this.regOnline__Fax__c.equals(other.getRegOnline__Fax__c()))) &&
            ((this.regOnline__First_Name__c==null && other.getRegOnline__First_Name__c()==null) || 
             (this.regOnline__First_Name__c!=null &&
              this.regOnline__First_Name__c.equals(other.getRegOnline__First_Name__c()))) &&
            ((this.regOnline__Last_Name__c==null && other.getRegOnline__Last_Name__c()==null) || 
             (this.regOnline__Last_Name__c!=null &&
              this.regOnline__Last_Name__c.equals(other.getRegOnline__Last_Name__c()))) &&
            ((this.regOnline__Merged__c==null && other.getRegOnline__Merged__c()==null) || 
             (this.regOnline__Merged__c!=null &&
              this.regOnline__Merged__c.equals(other.getRegOnline__Merged__c()))) &&
            ((this.regOnline__Mobile_Phone__c==null && other.getRegOnline__Mobile_Phone__c()==null) || 
             (this.regOnline__Mobile_Phone__c!=null &&
              this.regOnline__Mobile_Phone__c.equals(other.getRegOnline__Mobile_Phone__c()))) &&
            ((this.regOnline__Phone__c==null && other.getRegOnline__Phone__c()==null) || 
             (this.regOnline__Phone__c!=null &&
              this.regOnline__Phone__c.equals(other.getRegOnline__Phone__c()))) &&
            ((this.regOnline__Postal_Code__c==null && other.getRegOnline__Postal_Code__c()==null) || 
             (this.regOnline__Postal_Code__c!=null &&
              this.regOnline__Postal_Code__c.equals(other.getRegOnline__Postal_Code__c()))) &&
            ((this.regOnline__Salutation__c==null && other.getRegOnline__Salutation__c()==null) || 
             (this.regOnline__Salutation__c!=null &&
              this.regOnline__Salutation__c.equals(other.getRegOnline__Salutation__c()))) &&
            ((this.regOnline__State__c==null && other.getRegOnline__State__c()==null) || 
             (this.regOnline__State__c!=null &&
              this.regOnline__State__c.equals(other.getRegOnline__State__c()))) &&
            ((this.regOnline__Street__c==null && other.getRegOnline__Street__c()==null) || 
             (this.regOnline__Street__c!=null &&
              this.regOnline__Street__c.equals(other.getRegOnline__Street__c()))) &&
            ((this.regOnline__Title__c==null && other.getRegOnline__Title__c()==null) || 
             (this.regOnline__Title__c!=null &&
              this.regOnline__Title__c.equals(other.getRegOnline__Title__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              this.tasks.equals(other.getTasks()))) &&
            ((this.test__c==null && other.getTest__c()==null) || 
             (this.test__c!=null &&
              this.test__c.equals(other.getTest__c())));
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
        if (getRegOnline__City__c() != null) {
            _hashCode += getRegOnline__City__c().hashCode();
        }
        if (getRegOnline__Company__c() != null) {
            _hashCode += getRegOnline__Company__c().hashCode();
        }
        if (getRegOnline__Country__c() != null) {
            _hashCode += getRegOnline__Country__c().hashCode();
        }
        if (getRegOnline__Custom_Fields__c() != null) {
            _hashCode += getRegOnline__Custom_Fields__c().hashCode();
        }
        if (getRegOnline__Email__c() != null) {
            _hashCode += getRegOnline__Email__c().hashCode();
        }
        if (getRegOnline__Fax__c() != null) {
            _hashCode += getRegOnline__Fax__c().hashCode();
        }
        if (getRegOnline__First_Name__c() != null) {
            _hashCode += getRegOnline__First_Name__c().hashCode();
        }
        if (getRegOnline__Last_Name__c() != null) {
            _hashCode += getRegOnline__Last_Name__c().hashCode();
        }
        if (getRegOnline__Merged__c() != null) {
            _hashCode += getRegOnline__Merged__c().hashCode();
        }
        if (getRegOnline__Mobile_Phone__c() != null) {
            _hashCode += getRegOnline__Mobile_Phone__c().hashCode();
        }
        if (getRegOnline__Phone__c() != null) {
            _hashCode += getRegOnline__Phone__c().hashCode();
        }
        if (getRegOnline__Postal_Code__c() != null) {
            _hashCode += getRegOnline__Postal_Code__c().hashCode();
        }
        if (getRegOnline__Salutation__c() != null) {
            _hashCode += getRegOnline__Salutation__c().hashCode();
        }
        if (getRegOnline__State__c() != null) {
            _hashCode += getRegOnline__State__c().hashCode();
        }
        if (getRegOnline__Street__c() != null) {
            _hashCode += getRegOnline__Street__c().hashCode();
        }
        if (getRegOnline__Title__c() != null) {
            _hashCode += getRegOnline__Title__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTasks() != null) {
            _hashCode += getTasks().hashCode();
        }
        if (getTest__c() != null) {
            _hashCode += getTest__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegOnline__RegOnlineContact__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RegOnline__RegOnlineContact__c"));
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
        elemField.setFieldName("regOnline__City__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RegOnline__City__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regOnline__Company__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RegOnline__Company__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regOnline__Country__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RegOnline__Country__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regOnline__Custom_Fields__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RegOnline__Custom_Fields__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regOnline__Email__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RegOnline__Email__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regOnline__Fax__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RegOnline__Fax__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regOnline__First_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RegOnline__First_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regOnline__Last_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RegOnline__Last_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regOnline__Merged__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RegOnline__Merged__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regOnline__Mobile_Phone__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RegOnline__Mobile_Phone__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regOnline__Phone__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RegOnline__Phone__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regOnline__Postal_Code__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RegOnline__Postal_Code__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regOnline__Salutation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RegOnline__Salutation__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regOnline__State__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RegOnline__State__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regOnline__Street__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RegOnline__Street__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regOnline__Title__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RegOnline__Title__c"));
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
        elemField.setFieldName("test__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Test__c"));
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

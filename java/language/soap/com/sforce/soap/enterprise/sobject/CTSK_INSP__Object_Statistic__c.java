/**
 * CTSK_INSP__Object_Statistic__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class CTSK_INSP__Object_Statistic__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String CTSK_INSP__Custom_Object_Text__c;

    private java.lang.Boolean CTSK_INSP__Custom_Object__c;

    private com.sforce.soap.enterprise.QueryResult CTSK_INSP__Field_Statistics__r;

    private java.lang.Boolean CTSK_INSP__Last_Run__c;

    private java.lang.Double CTSK_INSP__Number_Fields__c;

    private java.lang.Double CTSK_INSP__Number_Records__c;

    private java.lang.String CTSK_INSP__Object__c;

    private java.util.Date CTSK_INSP__Record_First_Created_Date__c;

    private java.util.Date CTSK_INSP__Record_Last_Created_Date__c;

    private java.util.Date CTSK_INSP__Record_Last_Modified_Date__c;

    private java.util.Calendar CTSK_INSP__Request_End__c;

    private java.util.Calendar CTSK_INSP__Request_Start__c;

    private java.lang.Double CTSK_INSP__Request_Time__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.lang.Boolean isDeleted;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private com.sforce.soap.enterprise.QueryResult shares;

    private java.util.Calendar systemModstamp;

    public CTSK_INSP__Object_Statistic__c() {
    }

    public CTSK_INSP__Object_Statistic__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String CTSK_INSP__Custom_Object_Text__c,
           java.lang.Boolean CTSK_INSP__Custom_Object__c,
           com.sforce.soap.enterprise.QueryResult CTSK_INSP__Field_Statistics__r,
           java.lang.Boolean CTSK_INSP__Last_Run__c,
           java.lang.Double CTSK_INSP__Number_Fields__c,
           java.lang.Double CTSK_INSP__Number_Records__c,
           java.lang.String CTSK_INSP__Object__c,
           java.util.Date CTSK_INSP__Record_First_Created_Date__c,
           java.util.Date CTSK_INSP__Record_Last_Created_Date__c,
           java.util.Date CTSK_INSP__Record_Last_Modified_Date__c,
           java.util.Calendar CTSK_INSP__Request_End__c,
           java.util.Calendar CTSK_INSP__Request_Start__c,
           java.lang.Double CTSK_INSP__Request_Time__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.lang.Boolean isDeleted,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           com.sforce.soap.enterprise.QueryResult shares,
           java.util.Calendar systemModstamp) {
        super(
            fieldsToNull,
            id);
        this.attachments = attachments;
        this.CTSK_INSP__Custom_Object_Text__c = CTSK_INSP__Custom_Object_Text__c;
        this.CTSK_INSP__Custom_Object__c = CTSK_INSP__Custom_Object__c;
        this.CTSK_INSP__Field_Statistics__r = CTSK_INSP__Field_Statistics__r;
        this.CTSK_INSP__Last_Run__c = CTSK_INSP__Last_Run__c;
        this.CTSK_INSP__Number_Fields__c = CTSK_INSP__Number_Fields__c;
        this.CTSK_INSP__Number_Records__c = CTSK_INSP__Number_Records__c;
        this.CTSK_INSP__Object__c = CTSK_INSP__Object__c;
        this.CTSK_INSP__Record_First_Created_Date__c = CTSK_INSP__Record_First_Created_Date__c;
        this.CTSK_INSP__Record_Last_Created_Date__c = CTSK_INSP__Record_Last_Created_Date__c;
        this.CTSK_INSP__Record_Last_Modified_Date__c = CTSK_INSP__Record_Last_Modified_Date__c;
        this.CTSK_INSP__Request_End__c = CTSK_INSP__Request_End__c;
        this.CTSK_INSP__Request_Start__c = CTSK_INSP__Request_Start__c;
        this.CTSK_INSP__Request_Time__c = CTSK_INSP__Request_Time__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.isDeleted = isDeleted;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.owner = owner;
        this.ownerId = ownerId;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.shares = shares;
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the attachments value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the CTSK_INSP__Custom_Object_Text__c value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @return CTSK_INSP__Custom_Object_Text__c
     */
    public java.lang.String getCTSK_INSP__Custom_Object_Text__c() {
        return CTSK_INSP__Custom_Object_Text__c;
    }


    /**
     * Sets the CTSK_INSP__Custom_Object_Text__c value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @param CTSK_INSP__Custom_Object_Text__c
     */
    public void setCTSK_INSP__Custom_Object_Text__c(java.lang.String CTSK_INSP__Custom_Object_Text__c) {
        this.CTSK_INSP__Custom_Object_Text__c = CTSK_INSP__Custom_Object_Text__c;
    }


    /**
     * Gets the CTSK_INSP__Custom_Object__c value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @return CTSK_INSP__Custom_Object__c
     */
    public java.lang.Boolean getCTSK_INSP__Custom_Object__c() {
        return CTSK_INSP__Custom_Object__c;
    }


    /**
     * Sets the CTSK_INSP__Custom_Object__c value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @param CTSK_INSP__Custom_Object__c
     */
    public void setCTSK_INSP__Custom_Object__c(java.lang.Boolean CTSK_INSP__Custom_Object__c) {
        this.CTSK_INSP__Custom_Object__c = CTSK_INSP__Custom_Object__c;
    }


    /**
     * Gets the CTSK_INSP__Field_Statistics__r value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @return CTSK_INSP__Field_Statistics__r
     */
    public com.sforce.soap.enterprise.QueryResult getCTSK_INSP__Field_Statistics__r() {
        return CTSK_INSP__Field_Statistics__r;
    }


    /**
     * Sets the CTSK_INSP__Field_Statistics__r value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @param CTSK_INSP__Field_Statistics__r
     */
    public void setCTSK_INSP__Field_Statistics__r(com.sforce.soap.enterprise.QueryResult CTSK_INSP__Field_Statistics__r) {
        this.CTSK_INSP__Field_Statistics__r = CTSK_INSP__Field_Statistics__r;
    }


    /**
     * Gets the CTSK_INSP__Last_Run__c value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @return CTSK_INSP__Last_Run__c
     */
    public java.lang.Boolean getCTSK_INSP__Last_Run__c() {
        return CTSK_INSP__Last_Run__c;
    }


    /**
     * Sets the CTSK_INSP__Last_Run__c value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @param CTSK_INSP__Last_Run__c
     */
    public void setCTSK_INSP__Last_Run__c(java.lang.Boolean CTSK_INSP__Last_Run__c) {
        this.CTSK_INSP__Last_Run__c = CTSK_INSP__Last_Run__c;
    }


    /**
     * Gets the CTSK_INSP__Number_Fields__c value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @return CTSK_INSP__Number_Fields__c
     */
    public java.lang.Double getCTSK_INSP__Number_Fields__c() {
        return CTSK_INSP__Number_Fields__c;
    }


    /**
     * Sets the CTSK_INSP__Number_Fields__c value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @param CTSK_INSP__Number_Fields__c
     */
    public void setCTSK_INSP__Number_Fields__c(java.lang.Double CTSK_INSP__Number_Fields__c) {
        this.CTSK_INSP__Number_Fields__c = CTSK_INSP__Number_Fields__c;
    }


    /**
     * Gets the CTSK_INSP__Number_Records__c value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @return CTSK_INSP__Number_Records__c
     */
    public java.lang.Double getCTSK_INSP__Number_Records__c() {
        return CTSK_INSP__Number_Records__c;
    }


    /**
     * Sets the CTSK_INSP__Number_Records__c value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @param CTSK_INSP__Number_Records__c
     */
    public void setCTSK_INSP__Number_Records__c(java.lang.Double CTSK_INSP__Number_Records__c) {
        this.CTSK_INSP__Number_Records__c = CTSK_INSP__Number_Records__c;
    }


    /**
     * Gets the CTSK_INSP__Object__c value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @return CTSK_INSP__Object__c
     */
    public java.lang.String getCTSK_INSP__Object__c() {
        return CTSK_INSP__Object__c;
    }


    /**
     * Sets the CTSK_INSP__Object__c value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @param CTSK_INSP__Object__c
     */
    public void setCTSK_INSP__Object__c(java.lang.String CTSK_INSP__Object__c) {
        this.CTSK_INSP__Object__c = CTSK_INSP__Object__c;
    }


    /**
     * Gets the CTSK_INSP__Record_First_Created_Date__c value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @return CTSK_INSP__Record_First_Created_Date__c
     */
    public java.util.Date getCTSK_INSP__Record_First_Created_Date__c() {
        return CTSK_INSP__Record_First_Created_Date__c;
    }


    /**
     * Sets the CTSK_INSP__Record_First_Created_Date__c value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @param CTSK_INSP__Record_First_Created_Date__c
     */
    public void setCTSK_INSP__Record_First_Created_Date__c(java.util.Date CTSK_INSP__Record_First_Created_Date__c) {
        this.CTSK_INSP__Record_First_Created_Date__c = CTSK_INSP__Record_First_Created_Date__c;
    }


    /**
     * Gets the CTSK_INSP__Record_Last_Created_Date__c value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @return CTSK_INSP__Record_Last_Created_Date__c
     */
    public java.util.Date getCTSK_INSP__Record_Last_Created_Date__c() {
        return CTSK_INSP__Record_Last_Created_Date__c;
    }


    /**
     * Sets the CTSK_INSP__Record_Last_Created_Date__c value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @param CTSK_INSP__Record_Last_Created_Date__c
     */
    public void setCTSK_INSP__Record_Last_Created_Date__c(java.util.Date CTSK_INSP__Record_Last_Created_Date__c) {
        this.CTSK_INSP__Record_Last_Created_Date__c = CTSK_INSP__Record_Last_Created_Date__c;
    }


    /**
     * Gets the CTSK_INSP__Record_Last_Modified_Date__c value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @return CTSK_INSP__Record_Last_Modified_Date__c
     */
    public java.util.Date getCTSK_INSP__Record_Last_Modified_Date__c() {
        return CTSK_INSP__Record_Last_Modified_Date__c;
    }


    /**
     * Sets the CTSK_INSP__Record_Last_Modified_Date__c value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @param CTSK_INSP__Record_Last_Modified_Date__c
     */
    public void setCTSK_INSP__Record_Last_Modified_Date__c(java.util.Date CTSK_INSP__Record_Last_Modified_Date__c) {
        this.CTSK_INSP__Record_Last_Modified_Date__c = CTSK_INSP__Record_Last_Modified_Date__c;
    }


    /**
     * Gets the CTSK_INSP__Request_End__c value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @return CTSK_INSP__Request_End__c
     */
    public java.util.Calendar getCTSK_INSP__Request_End__c() {
        return CTSK_INSP__Request_End__c;
    }


    /**
     * Sets the CTSK_INSP__Request_End__c value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @param CTSK_INSP__Request_End__c
     */
    public void setCTSK_INSP__Request_End__c(java.util.Calendar CTSK_INSP__Request_End__c) {
        this.CTSK_INSP__Request_End__c = CTSK_INSP__Request_End__c;
    }


    /**
     * Gets the CTSK_INSP__Request_Start__c value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @return CTSK_INSP__Request_Start__c
     */
    public java.util.Calendar getCTSK_INSP__Request_Start__c() {
        return CTSK_INSP__Request_Start__c;
    }


    /**
     * Sets the CTSK_INSP__Request_Start__c value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @param CTSK_INSP__Request_Start__c
     */
    public void setCTSK_INSP__Request_Start__c(java.util.Calendar CTSK_INSP__Request_Start__c) {
        this.CTSK_INSP__Request_Start__c = CTSK_INSP__Request_Start__c;
    }


    /**
     * Gets the CTSK_INSP__Request_Time__c value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @return CTSK_INSP__Request_Time__c
     */
    public java.lang.Double getCTSK_INSP__Request_Time__c() {
        return CTSK_INSP__Request_Time__c;
    }


    /**
     * Sets the CTSK_INSP__Request_Time__c value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @param CTSK_INSP__Request_Time__c
     */
    public void setCTSK_INSP__Request_Time__c(java.lang.Double CTSK_INSP__Request_Time__c) {
        this.CTSK_INSP__Request_Time__c = CTSK_INSP__Request_Time__c;
    }


    /**
     * Gets the createdBy value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the isDeleted value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the owner value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the shares value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @return shares
     */
    public com.sforce.soap.enterprise.QueryResult getShares() {
        return shares;
    }


    /**
     * Sets the shares value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @param shares
     */
    public void setShares(com.sforce.soap.enterprise.QueryResult shares) {
        this.shares = shares;
    }


    /**
     * Gets the systemModstamp value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this CTSK_INSP__Object_Statistic__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CTSK_INSP__Object_Statistic__c)) return false;
        CTSK_INSP__Object_Statistic__c other = (CTSK_INSP__Object_Statistic__c) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.CTSK_INSP__Custom_Object_Text__c==null && other.getCTSK_INSP__Custom_Object_Text__c()==null) || 
             (this.CTSK_INSP__Custom_Object_Text__c!=null &&
              this.CTSK_INSP__Custom_Object_Text__c.equals(other.getCTSK_INSP__Custom_Object_Text__c()))) &&
            ((this.CTSK_INSP__Custom_Object__c==null && other.getCTSK_INSP__Custom_Object__c()==null) || 
             (this.CTSK_INSP__Custom_Object__c!=null &&
              this.CTSK_INSP__Custom_Object__c.equals(other.getCTSK_INSP__Custom_Object__c()))) &&
            ((this.CTSK_INSP__Field_Statistics__r==null && other.getCTSK_INSP__Field_Statistics__r()==null) || 
             (this.CTSK_INSP__Field_Statistics__r!=null &&
              this.CTSK_INSP__Field_Statistics__r.equals(other.getCTSK_INSP__Field_Statistics__r()))) &&
            ((this.CTSK_INSP__Last_Run__c==null && other.getCTSK_INSP__Last_Run__c()==null) || 
             (this.CTSK_INSP__Last_Run__c!=null &&
              this.CTSK_INSP__Last_Run__c.equals(other.getCTSK_INSP__Last_Run__c()))) &&
            ((this.CTSK_INSP__Number_Fields__c==null && other.getCTSK_INSP__Number_Fields__c()==null) || 
             (this.CTSK_INSP__Number_Fields__c!=null &&
              this.CTSK_INSP__Number_Fields__c.equals(other.getCTSK_INSP__Number_Fields__c()))) &&
            ((this.CTSK_INSP__Number_Records__c==null && other.getCTSK_INSP__Number_Records__c()==null) || 
             (this.CTSK_INSP__Number_Records__c!=null &&
              this.CTSK_INSP__Number_Records__c.equals(other.getCTSK_INSP__Number_Records__c()))) &&
            ((this.CTSK_INSP__Object__c==null && other.getCTSK_INSP__Object__c()==null) || 
             (this.CTSK_INSP__Object__c!=null &&
              this.CTSK_INSP__Object__c.equals(other.getCTSK_INSP__Object__c()))) &&
            ((this.CTSK_INSP__Record_First_Created_Date__c==null && other.getCTSK_INSP__Record_First_Created_Date__c()==null) || 
             (this.CTSK_INSP__Record_First_Created_Date__c!=null &&
              this.CTSK_INSP__Record_First_Created_Date__c.equals(other.getCTSK_INSP__Record_First_Created_Date__c()))) &&
            ((this.CTSK_INSP__Record_Last_Created_Date__c==null && other.getCTSK_INSP__Record_Last_Created_Date__c()==null) || 
             (this.CTSK_INSP__Record_Last_Created_Date__c!=null &&
              this.CTSK_INSP__Record_Last_Created_Date__c.equals(other.getCTSK_INSP__Record_Last_Created_Date__c()))) &&
            ((this.CTSK_INSP__Record_Last_Modified_Date__c==null && other.getCTSK_INSP__Record_Last_Modified_Date__c()==null) || 
             (this.CTSK_INSP__Record_Last_Modified_Date__c!=null &&
              this.CTSK_INSP__Record_Last_Modified_Date__c.equals(other.getCTSK_INSP__Record_Last_Modified_Date__c()))) &&
            ((this.CTSK_INSP__Request_End__c==null && other.getCTSK_INSP__Request_End__c()==null) || 
             (this.CTSK_INSP__Request_End__c!=null &&
              this.CTSK_INSP__Request_End__c.equals(other.getCTSK_INSP__Request_End__c()))) &&
            ((this.CTSK_INSP__Request_Start__c==null && other.getCTSK_INSP__Request_Start__c()==null) || 
             (this.CTSK_INSP__Request_Start__c!=null &&
              this.CTSK_INSP__Request_Start__c.equals(other.getCTSK_INSP__Request_Start__c()))) &&
            ((this.CTSK_INSP__Request_Time__c==null && other.getCTSK_INSP__Request_Time__c()==null) || 
             (this.CTSK_INSP__Request_Time__c!=null &&
              this.CTSK_INSP__Request_Time__c.equals(other.getCTSK_INSP__Request_Time__c()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
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
            ((this.shares==null && other.getShares()==null) || 
             (this.shares!=null &&
              this.shares.equals(other.getShares()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp())));
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
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getCTSK_INSP__Custom_Object_Text__c() != null) {
            _hashCode += getCTSK_INSP__Custom_Object_Text__c().hashCode();
        }
        if (getCTSK_INSP__Custom_Object__c() != null) {
            _hashCode += getCTSK_INSP__Custom_Object__c().hashCode();
        }
        if (getCTSK_INSP__Field_Statistics__r() != null) {
            _hashCode += getCTSK_INSP__Field_Statistics__r().hashCode();
        }
        if (getCTSK_INSP__Last_Run__c() != null) {
            _hashCode += getCTSK_INSP__Last_Run__c().hashCode();
        }
        if (getCTSK_INSP__Number_Fields__c() != null) {
            _hashCode += getCTSK_INSP__Number_Fields__c().hashCode();
        }
        if (getCTSK_INSP__Number_Records__c() != null) {
            _hashCode += getCTSK_INSP__Number_Records__c().hashCode();
        }
        if (getCTSK_INSP__Object__c() != null) {
            _hashCode += getCTSK_INSP__Object__c().hashCode();
        }
        if (getCTSK_INSP__Record_First_Created_Date__c() != null) {
            _hashCode += getCTSK_INSP__Record_First_Created_Date__c().hashCode();
        }
        if (getCTSK_INSP__Record_Last_Created_Date__c() != null) {
            _hashCode += getCTSK_INSP__Record_Last_Created_Date__c().hashCode();
        }
        if (getCTSK_INSP__Record_Last_Modified_Date__c() != null) {
            _hashCode += getCTSK_INSP__Record_Last_Modified_Date__c().hashCode();
        }
        if (getCTSK_INSP__Request_End__c() != null) {
            _hashCode += getCTSK_INSP__Request_End__c().hashCode();
        }
        if (getCTSK_INSP__Request_Start__c() != null) {
            _hashCode += getCTSK_INSP__Request_Start__c().hashCode();
        }
        if (getCTSK_INSP__Request_Time__c() != null) {
            _hashCode += getCTSK_INSP__Request_Time__c().hashCode();
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
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
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
        if (getShares() != null) {
            _hashCode += getShares().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CTSK_INSP__Object_Statistic__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CTSK_INSP__Object_Statistic__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CTSK_INSP__Custom_Object_Text__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CTSK_INSP__Custom_Object_Text__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CTSK_INSP__Custom_Object__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CTSK_INSP__Custom_Object__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CTSK_INSP__Field_Statistics__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CTSK_INSP__Field_Statistics__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CTSK_INSP__Last_Run__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CTSK_INSP__Last_Run__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CTSK_INSP__Number_Fields__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CTSK_INSP__Number_Fields__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CTSK_INSP__Number_Records__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CTSK_INSP__Number_Records__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CTSK_INSP__Object__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CTSK_INSP__Object__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CTSK_INSP__Record_First_Created_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CTSK_INSP__Record_First_Created_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CTSK_INSP__Record_Last_Created_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CTSK_INSP__Record_Last_Created_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CTSK_INSP__Record_Last_Modified_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CTSK_INSP__Record_Last_Modified_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CTSK_INSP__Request_End__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CTSK_INSP__Request_End__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CTSK_INSP__Request_Start__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CTSK_INSP__Request_Start__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CTSK_INSP__Request_Time__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CTSK_INSP__Request_Time__c"));
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
        elemField.setFieldName("shares");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Shares"));
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

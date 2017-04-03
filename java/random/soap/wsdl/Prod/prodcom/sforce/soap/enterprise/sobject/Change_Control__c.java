/**
 * Change_Control__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Change_Control__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.util.Calendar actual_Complete__c;

    private java.util.Calendar actual_Start__c;

    private java.lang.String all_kCura_Email_Needed__c;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private com.sforce.soap.enterprise.QueryResult changeControlTicketAssociation__r;

    private java.lang.String change_Request_Type__c;

    private com.sforce.soap.enterprise.QueryResult checklists__r;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String digital_Signature__c;

    private java.util.Date due_Date__c;

    private java.lang.String environment__c;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.String internal_Communication__c;

    private java.lang.Boolean isDeleted;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String location__c;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private java.util.Calendar outage_End_Time__c;

    private java.util.Calendar outage_Start_Time__c;

    private java.lang.String outage_Type__c;

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private java.lang.Boolean performed_SmokeTest__c;

    private java.lang.String potential_Impact__c;

    private java.lang.String priority__c;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private com.sforce.soap.enterprise.sobject.RecordType recordType;

    private java.lang.String recordTypeId;

    private java.lang.String requested_By__c;

    private com.sforce.soap.enterprise.sobject.User requested_By__r;

    private java.lang.String resolution__c;

    private java.lang.String rollback_Plan__c;

    private java.lang.String root_Cause__c;

    private java.util.Calendar scheduled_Complete__c;

    private java.util.Calendar scheduled_Start__c;

    private com.sforce.soap.enterprise.QueryResult shares;

    private java.lang.String status__c;

    private java.util.Calendar systemModstamp;

    private java.lang.String system_Sub__c;

    private java.lang.String system__c;

    private java.lang.String what__c;

    private java.lang.String who_Performs_Work__c;

    private com.sforce.soap.enterprise.sobject.User who_Performs_Work__r;

    private java.lang.String who_Sends_Communication__c;

    private com.sforce.soap.enterprise.sobject.User who_Sends_Communication__r;

    private java.lang.String why__c;

    public Change_Control__c() {
    }

    public Change_Control__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.util.Calendar actual_Complete__c,
           java.util.Calendar actual_Start__c,
           java.lang.String all_kCura_Email_Needed__c,
           com.sforce.soap.enterprise.QueryResult attachments,
           com.sforce.soap.enterprise.QueryResult changeControlTicketAssociation__r,
           java.lang.String change_Request_Type__c,
           com.sforce.soap.enterprise.QueryResult checklists__r,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String digital_Signature__c,
           java.util.Date due_Date__c,
           java.lang.String environment__c,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.String internal_Communication__c,
           java.lang.Boolean isDeleted,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String location__c,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           java.util.Calendar outage_End_Time__c,
           java.util.Calendar outage_Start_Time__c,
           java.lang.String outage_Type__c,
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           java.lang.Boolean performed_SmokeTest__c,
           java.lang.String potential_Impact__c,
           java.lang.String priority__c,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           com.sforce.soap.enterprise.sobject.RecordType recordType,
           java.lang.String recordTypeId,
           java.lang.String requested_By__c,
           com.sforce.soap.enterprise.sobject.User requested_By__r,
           java.lang.String resolution__c,
           java.lang.String rollback_Plan__c,
           java.lang.String root_Cause__c,
           java.util.Calendar scheduled_Complete__c,
           java.util.Calendar scheduled_Start__c,
           com.sforce.soap.enterprise.QueryResult shares,
           java.lang.String status__c,
           java.util.Calendar systemModstamp,
           java.lang.String system_Sub__c,
           java.lang.String system__c,
           java.lang.String what__c,
           java.lang.String who_Performs_Work__c,
           com.sforce.soap.enterprise.sobject.User who_Performs_Work__r,
           java.lang.String who_Sends_Communication__c,
           com.sforce.soap.enterprise.sobject.User who_Sends_Communication__r,
           java.lang.String why__c) {
        super(
            fieldsToNull,
            id);
        this.actual_Complete__c = actual_Complete__c;
        this.actual_Start__c = actual_Start__c;
        this.all_kCura_Email_Needed__c = all_kCura_Email_Needed__c;
        this.attachments = attachments;
        this.changeControlTicketAssociation__r = changeControlTicketAssociation__r;
        this.change_Request_Type__c = change_Request_Type__c;
        this.checklists__r = checklists__r;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.digital_Signature__c = digital_Signature__c;
        this.due_Date__c = due_Date__c;
        this.environment__c = environment__c;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.histories = histories;
        this.internal_Communication__c = internal_Communication__c;
        this.isDeleted = isDeleted;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.location__c = location__c;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.outage_End_Time__c = outage_End_Time__c;
        this.outage_Start_Time__c = outage_Start_Time__c;
        this.outage_Type__c = outage_Type__c;
        this.owner = owner;
        this.ownerId = ownerId;
        this.performed_SmokeTest__c = performed_SmokeTest__c;
        this.potential_Impact__c = potential_Impact__c;
        this.priority__c = priority__c;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.recordType = recordType;
        this.recordTypeId = recordTypeId;
        this.requested_By__c = requested_By__c;
        this.requested_By__r = requested_By__r;
        this.resolution__c = resolution__c;
        this.rollback_Plan__c = rollback_Plan__c;
        this.root_Cause__c = root_Cause__c;
        this.scheduled_Complete__c = scheduled_Complete__c;
        this.scheduled_Start__c = scheduled_Start__c;
        this.shares = shares;
        this.status__c = status__c;
        this.systemModstamp = systemModstamp;
        this.system_Sub__c = system_Sub__c;
        this.system__c = system__c;
        this.what__c = what__c;
        this.who_Performs_Work__c = who_Performs_Work__c;
        this.who_Performs_Work__r = who_Performs_Work__r;
        this.who_Sends_Communication__c = who_Sends_Communication__c;
        this.who_Sends_Communication__r = who_Sends_Communication__r;
        this.why__c = why__c;
    }


    /**
     * Gets the actual_Complete__c value for this Change_Control__c.
     * 
     * @return actual_Complete__c
     */
    public java.util.Calendar getActual_Complete__c() {
        return actual_Complete__c;
    }


    /**
     * Sets the actual_Complete__c value for this Change_Control__c.
     * 
     * @param actual_Complete__c
     */
    public void setActual_Complete__c(java.util.Calendar actual_Complete__c) {
        this.actual_Complete__c = actual_Complete__c;
    }


    /**
     * Gets the actual_Start__c value for this Change_Control__c.
     * 
     * @return actual_Start__c
     */
    public java.util.Calendar getActual_Start__c() {
        return actual_Start__c;
    }


    /**
     * Sets the actual_Start__c value for this Change_Control__c.
     * 
     * @param actual_Start__c
     */
    public void setActual_Start__c(java.util.Calendar actual_Start__c) {
        this.actual_Start__c = actual_Start__c;
    }


    /**
     * Gets the all_kCura_Email_Needed__c value for this Change_Control__c.
     * 
     * @return all_kCura_Email_Needed__c
     */
    public java.lang.String getAll_kCura_Email_Needed__c() {
        return all_kCura_Email_Needed__c;
    }


    /**
     * Sets the all_kCura_Email_Needed__c value for this Change_Control__c.
     * 
     * @param all_kCura_Email_Needed__c
     */
    public void setAll_kCura_Email_Needed__c(java.lang.String all_kCura_Email_Needed__c) {
        this.all_kCura_Email_Needed__c = all_kCura_Email_Needed__c;
    }


    /**
     * Gets the attachments value for this Change_Control__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Change_Control__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the changeControlTicketAssociation__r value for this Change_Control__c.
     * 
     * @return changeControlTicketAssociation__r
     */
    public com.sforce.soap.enterprise.QueryResult getChangeControlTicketAssociation__r() {
        return changeControlTicketAssociation__r;
    }


    /**
     * Sets the changeControlTicketAssociation__r value for this Change_Control__c.
     * 
     * @param changeControlTicketAssociation__r
     */
    public void setChangeControlTicketAssociation__r(com.sforce.soap.enterprise.QueryResult changeControlTicketAssociation__r) {
        this.changeControlTicketAssociation__r = changeControlTicketAssociation__r;
    }


    /**
     * Gets the change_Request_Type__c value for this Change_Control__c.
     * 
     * @return change_Request_Type__c
     */
    public java.lang.String getChange_Request_Type__c() {
        return change_Request_Type__c;
    }


    /**
     * Sets the change_Request_Type__c value for this Change_Control__c.
     * 
     * @param change_Request_Type__c
     */
    public void setChange_Request_Type__c(java.lang.String change_Request_Type__c) {
        this.change_Request_Type__c = change_Request_Type__c;
    }


    /**
     * Gets the checklists__r value for this Change_Control__c.
     * 
     * @return checklists__r
     */
    public com.sforce.soap.enterprise.QueryResult getChecklists__r() {
        return checklists__r;
    }


    /**
     * Sets the checklists__r value for this Change_Control__c.
     * 
     * @param checklists__r
     */
    public void setChecklists__r(com.sforce.soap.enterprise.QueryResult checklists__r) {
        this.checklists__r = checklists__r;
    }


    /**
     * Gets the createdBy value for this Change_Control__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Change_Control__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Change_Control__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Change_Control__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Change_Control__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Change_Control__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the digital_Signature__c value for this Change_Control__c.
     * 
     * @return digital_Signature__c
     */
    public java.lang.String getDigital_Signature__c() {
        return digital_Signature__c;
    }


    /**
     * Sets the digital_Signature__c value for this Change_Control__c.
     * 
     * @param digital_Signature__c
     */
    public void setDigital_Signature__c(java.lang.String digital_Signature__c) {
        this.digital_Signature__c = digital_Signature__c;
    }


    /**
     * Gets the due_Date__c value for this Change_Control__c.
     * 
     * @return due_Date__c
     */
    public java.util.Date getDue_Date__c() {
        return due_Date__c;
    }


    /**
     * Sets the due_Date__c value for this Change_Control__c.
     * 
     * @param due_Date__c
     */
    public void setDue_Date__c(java.util.Date due_Date__c) {
        this.due_Date__c = due_Date__c;
    }


    /**
     * Gets the environment__c value for this Change_Control__c.
     * 
     * @return environment__c
     */
    public java.lang.String getEnvironment__c() {
        return environment__c;
    }


    /**
     * Sets the environment__c value for this Change_Control__c.
     * 
     * @param environment__c
     */
    public void setEnvironment__c(java.lang.String environment__c) {
        this.environment__c = environment__c;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Change_Control__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Change_Control__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the histories value for this Change_Control__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Change_Control__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the internal_Communication__c value for this Change_Control__c.
     * 
     * @return internal_Communication__c
     */
    public java.lang.String getInternal_Communication__c() {
        return internal_Communication__c;
    }


    /**
     * Sets the internal_Communication__c value for this Change_Control__c.
     * 
     * @param internal_Communication__c
     */
    public void setInternal_Communication__c(java.lang.String internal_Communication__c) {
        this.internal_Communication__c = internal_Communication__c;
    }


    /**
     * Gets the isDeleted value for this Change_Control__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Change_Control__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this Change_Control__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Change_Control__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Change_Control__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Change_Control__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Change_Control__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Change_Control__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the location__c value for this Change_Control__c.
     * 
     * @return location__c
     */
    public java.lang.String getLocation__c() {
        return location__c;
    }


    /**
     * Sets the location__c value for this Change_Control__c.
     * 
     * @param location__c
     */
    public void setLocation__c(java.lang.String location__c) {
        this.location__c = location__c;
    }


    /**
     * Gets the name value for this Change_Control__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Change_Control__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Change_Control__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Change_Control__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Change_Control__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Change_Control__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the outage_End_Time__c value for this Change_Control__c.
     * 
     * @return outage_End_Time__c
     */
    public java.util.Calendar getOutage_End_Time__c() {
        return outage_End_Time__c;
    }


    /**
     * Sets the outage_End_Time__c value for this Change_Control__c.
     * 
     * @param outage_End_Time__c
     */
    public void setOutage_End_Time__c(java.util.Calendar outage_End_Time__c) {
        this.outage_End_Time__c = outage_End_Time__c;
    }


    /**
     * Gets the outage_Start_Time__c value for this Change_Control__c.
     * 
     * @return outage_Start_Time__c
     */
    public java.util.Calendar getOutage_Start_Time__c() {
        return outage_Start_Time__c;
    }


    /**
     * Sets the outage_Start_Time__c value for this Change_Control__c.
     * 
     * @param outage_Start_Time__c
     */
    public void setOutage_Start_Time__c(java.util.Calendar outage_Start_Time__c) {
        this.outage_Start_Time__c = outage_Start_Time__c;
    }


    /**
     * Gets the outage_Type__c value for this Change_Control__c.
     * 
     * @return outage_Type__c
     */
    public java.lang.String getOutage_Type__c() {
        return outage_Type__c;
    }


    /**
     * Sets the outage_Type__c value for this Change_Control__c.
     * 
     * @param outage_Type__c
     */
    public void setOutage_Type__c(java.lang.String outage_Type__c) {
        this.outage_Type__c = outage_Type__c;
    }


    /**
     * Gets the owner value for this Change_Control__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Change_Control__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Change_Control__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Change_Control__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the performed_SmokeTest__c value for this Change_Control__c.
     * 
     * @return performed_SmokeTest__c
     */
    public java.lang.Boolean getPerformed_SmokeTest__c() {
        return performed_SmokeTest__c;
    }


    /**
     * Sets the performed_SmokeTest__c value for this Change_Control__c.
     * 
     * @param performed_SmokeTest__c
     */
    public void setPerformed_SmokeTest__c(java.lang.Boolean performed_SmokeTest__c) {
        this.performed_SmokeTest__c = performed_SmokeTest__c;
    }


    /**
     * Gets the potential_Impact__c value for this Change_Control__c.
     * 
     * @return potential_Impact__c
     */
    public java.lang.String getPotential_Impact__c() {
        return potential_Impact__c;
    }


    /**
     * Sets the potential_Impact__c value for this Change_Control__c.
     * 
     * @param potential_Impact__c
     */
    public void setPotential_Impact__c(java.lang.String potential_Impact__c) {
        this.potential_Impact__c = potential_Impact__c;
    }


    /**
     * Gets the priority__c value for this Change_Control__c.
     * 
     * @return priority__c
     */
    public java.lang.String getPriority__c() {
        return priority__c;
    }


    /**
     * Sets the priority__c value for this Change_Control__c.
     * 
     * @param priority__c
     */
    public void setPriority__c(java.lang.String priority__c) {
        this.priority__c = priority__c;
    }


    /**
     * Gets the processInstances value for this Change_Control__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Change_Control__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Change_Control__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Change_Control__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the recordType value for this Change_Control__c.
     * 
     * @return recordType
     */
    public com.sforce.soap.enterprise.sobject.RecordType getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this Change_Control__c.
     * 
     * @param recordType
     */
    public void setRecordType(com.sforce.soap.enterprise.sobject.RecordType recordType) {
        this.recordType = recordType;
    }


    /**
     * Gets the recordTypeId value for this Change_Control__c.
     * 
     * @return recordTypeId
     */
    public java.lang.String getRecordTypeId() {
        return recordTypeId;
    }


    /**
     * Sets the recordTypeId value for this Change_Control__c.
     * 
     * @param recordTypeId
     */
    public void setRecordTypeId(java.lang.String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }


    /**
     * Gets the requested_By__c value for this Change_Control__c.
     * 
     * @return requested_By__c
     */
    public java.lang.String getRequested_By__c() {
        return requested_By__c;
    }


    /**
     * Sets the requested_By__c value for this Change_Control__c.
     * 
     * @param requested_By__c
     */
    public void setRequested_By__c(java.lang.String requested_By__c) {
        this.requested_By__c = requested_By__c;
    }


    /**
     * Gets the requested_By__r value for this Change_Control__c.
     * 
     * @return requested_By__r
     */
    public com.sforce.soap.enterprise.sobject.User getRequested_By__r() {
        return requested_By__r;
    }


    /**
     * Sets the requested_By__r value for this Change_Control__c.
     * 
     * @param requested_By__r
     */
    public void setRequested_By__r(com.sforce.soap.enterprise.sobject.User requested_By__r) {
        this.requested_By__r = requested_By__r;
    }


    /**
     * Gets the resolution__c value for this Change_Control__c.
     * 
     * @return resolution__c
     */
    public java.lang.String getResolution__c() {
        return resolution__c;
    }


    /**
     * Sets the resolution__c value for this Change_Control__c.
     * 
     * @param resolution__c
     */
    public void setResolution__c(java.lang.String resolution__c) {
        this.resolution__c = resolution__c;
    }


    /**
     * Gets the rollback_Plan__c value for this Change_Control__c.
     * 
     * @return rollback_Plan__c
     */
    public java.lang.String getRollback_Plan__c() {
        return rollback_Plan__c;
    }


    /**
     * Sets the rollback_Plan__c value for this Change_Control__c.
     * 
     * @param rollback_Plan__c
     */
    public void setRollback_Plan__c(java.lang.String rollback_Plan__c) {
        this.rollback_Plan__c = rollback_Plan__c;
    }


    /**
     * Gets the root_Cause__c value for this Change_Control__c.
     * 
     * @return root_Cause__c
     */
    public java.lang.String getRoot_Cause__c() {
        return root_Cause__c;
    }


    /**
     * Sets the root_Cause__c value for this Change_Control__c.
     * 
     * @param root_Cause__c
     */
    public void setRoot_Cause__c(java.lang.String root_Cause__c) {
        this.root_Cause__c = root_Cause__c;
    }


    /**
     * Gets the scheduled_Complete__c value for this Change_Control__c.
     * 
     * @return scheduled_Complete__c
     */
    public java.util.Calendar getScheduled_Complete__c() {
        return scheduled_Complete__c;
    }


    /**
     * Sets the scheduled_Complete__c value for this Change_Control__c.
     * 
     * @param scheduled_Complete__c
     */
    public void setScheduled_Complete__c(java.util.Calendar scheduled_Complete__c) {
        this.scheduled_Complete__c = scheduled_Complete__c;
    }


    /**
     * Gets the scheduled_Start__c value for this Change_Control__c.
     * 
     * @return scheduled_Start__c
     */
    public java.util.Calendar getScheduled_Start__c() {
        return scheduled_Start__c;
    }


    /**
     * Sets the scheduled_Start__c value for this Change_Control__c.
     * 
     * @param scheduled_Start__c
     */
    public void setScheduled_Start__c(java.util.Calendar scheduled_Start__c) {
        this.scheduled_Start__c = scheduled_Start__c;
    }


    /**
     * Gets the shares value for this Change_Control__c.
     * 
     * @return shares
     */
    public com.sforce.soap.enterprise.QueryResult getShares() {
        return shares;
    }


    /**
     * Sets the shares value for this Change_Control__c.
     * 
     * @param shares
     */
    public void setShares(com.sforce.soap.enterprise.QueryResult shares) {
        this.shares = shares;
    }


    /**
     * Gets the status__c value for this Change_Control__c.
     * 
     * @return status__c
     */
    public java.lang.String getStatus__c() {
        return status__c;
    }


    /**
     * Sets the status__c value for this Change_Control__c.
     * 
     * @param status__c
     */
    public void setStatus__c(java.lang.String status__c) {
        this.status__c = status__c;
    }


    /**
     * Gets the systemModstamp value for this Change_Control__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Change_Control__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the system_Sub__c value for this Change_Control__c.
     * 
     * @return system_Sub__c
     */
    public java.lang.String getSystem_Sub__c() {
        return system_Sub__c;
    }


    /**
     * Sets the system_Sub__c value for this Change_Control__c.
     * 
     * @param system_Sub__c
     */
    public void setSystem_Sub__c(java.lang.String system_Sub__c) {
        this.system_Sub__c = system_Sub__c;
    }


    /**
     * Gets the system__c value for this Change_Control__c.
     * 
     * @return system__c
     */
    public java.lang.String getSystem__c() {
        return system__c;
    }


    /**
     * Sets the system__c value for this Change_Control__c.
     * 
     * @param system__c
     */
    public void setSystem__c(java.lang.String system__c) {
        this.system__c = system__c;
    }


    /**
     * Gets the what__c value for this Change_Control__c.
     * 
     * @return what__c
     */
    public java.lang.String getWhat__c() {
        return what__c;
    }


    /**
     * Sets the what__c value for this Change_Control__c.
     * 
     * @param what__c
     */
    public void setWhat__c(java.lang.String what__c) {
        this.what__c = what__c;
    }


    /**
     * Gets the who_Performs_Work__c value for this Change_Control__c.
     * 
     * @return who_Performs_Work__c
     */
    public java.lang.String getWho_Performs_Work__c() {
        return who_Performs_Work__c;
    }


    /**
     * Sets the who_Performs_Work__c value for this Change_Control__c.
     * 
     * @param who_Performs_Work__c
     */
    public void setWho_Performs_Work__c(java.lang.String who_Performs_Work__c) {
        this.who_Performs_Work__c = who_Performs_Work__c;
    }


    /**
     * Gets the who_Performs_Work__r value for this Change_Control__c.
     * 
     * @return who_Performs_Work__r
     */
    public com.sforce.soap.enterprise.sobject.User getWho_Performs_Work__r() {
        return who_Performs_Work__r;
    }


    /**
     * Sets the who_Performs_Work__r value for this Change_Control__c.
     * 
     * @param who_Performs_Work__r
     */
    public void setWho_Performs_Work__r(com.sforce.soap.enterprise.sobject.User who_Performs_Work__r) {
        this.who_Performs_Work__r = who_Performs_Work__r;
    }


    /**
     * Gets the who_Sends_Communication__c value for this Change_Control__c.
     * 
     * @return who_Sends_Communication__c
     */
    public java.lang.String getWho_Sends_Communication__c() {
        return who_Sends_Communication__c;
    }


    /**
     * Sets the who_Sends_Communication__c value for this Change_Control__c.
     * 
     * @param who_Sends_Communication__c
     */
    public void setWho_Sends_Communication__c(java.lang.String who_Sends_Communication__c) {
        this.who_Sends_Communication__c = who_Sends_Communication__c;
    }


    /**
     * Gets the who_Sends_Communication__r value for this Change_Control__c.
     * 
     * @return who_Sends_Communication__r
     */
    public com.sforce.soap.enterprise.sobject.User getWho_Sends_Communication__r() {
        return who_Sends_Communication__r;
    }


    /**
     * Sets the who_Sends_Communication__r value for this Change_Control__c.
     * 
     * @param who_Sends_Communication__r
     */
    public void setWho_Sends_Communication__r(com.sforce.soap.enterprise.sobject.User who_Sends_Communication__r) {
        this.who_Sends_Communication__r = who_Sends_Communication__r;
    }


    /**
     * Gets the why__c value for this Change_Control__c.
     * 
     * @return why__c
     */
    public java.lang.String getWhy__c() {
        return why__c;
    }


    /**
     * Sets the why__c value for this Change_Control__c.
     * 
     * @param why__c
     */
    public void setWhy__c(java.lang.String why__c) {
        this.why__c = why__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Change_Control__c)) return false;
        Change_Control__c other = (Change_Control__c) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actual_Complete__c==null && other.getActual_Complete__c()==null) || 
             (this.actual_Complete__c!=null &&
              this.actual_Complete__c.equals(other.getActual_Complete__c()))) &&
            ((this.actual_Start__c==null && other.getActual_Start__c()==null) || 
             (this.actual_Start__c!=null &&
              this.actual_Start__c.equals(other.getActual_Start__c()))) &&
            ((this.all_kCura_Email_Needed__c==null && other.getAll_kCura_Email_Needed__c()==null) || 
             (this.all_kCura_Email_Needed__c!=null &&
              this.all_kCura_Email_Needed__c.equals(other.getAll_kCura_Email_Needed__c()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.changeControlTicketAssociation__r==null && other.getChangeControlTicketAssociation__r()==null) || 
             (this.changeControlTicketAssociation__r!=null &&
              this.changeControlTicketAssociation__r.equals(other.getChangeControlTicketAssociation__r()))) &&
            ((this.change_Request_Type__c==null && other.getChange_Request_Type__c()==null) || 
             (this.change_Request_Type__c!=null &&
              this.change_Request_Type__c.equals(other.getChange_Request_Type__c()))) &&
            ((this.checklists__r==null && other.getChecklists__r()==null) || 
             (this.checklists__r!=null &&
              this.checklists__r.equals(other.getChecklists__r()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.digital_Signature__c==null && other.getDigital_Signature__c()==null) || 
             (this.digital_Signature__c!=null &&
              this.digital_Signature__c.equals(other.getDigital_Signature__c()))) &&
            ((this.due_Date__c==null && other.getDue_Date__c()==null) || 
             (this.due_Date__c!=null &&
              this.due_Date__c.equals(other.getDue_Date__c()))) &&
            ((this.environment__c==null && other.getEnvironment__c()==null) || 
             (this.environment__c!=null &&
              this.environment__c.equals(other.getEnvironment__c()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
            ((this.internal_Communication__c==null && other.getInternal_Communication__c()==null) || 
             (this.internal_Communication__c!=null &&
              this.internal_Communication__c.equals(other.getInternal_Communication__c()))) &&
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
            ((this.location__c==null && other.getLocation__c()==null) || 
             (this.location__c!=null &&
              this.location__c.equals(other.getLocation__c()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.outage_End_Time__c==null && other.getOutage_End_Time__c()==null) || 
             (this.outage_End_Time__c!=null &&
              this.outage_End_Time__c.equals(other.getOutage_End_Time__c()))) &&
            ((this.outage_Start_Time__c==null && other.getOutage_Start_Time__c()==null) || 
             (this.outage_Start_Time__c!=null &&
              this.outage_Start_Time__c.equals(other.getOutage_Start_Time__c()))) &&
            ((this.outage_Type__c==null && other.getOutage_Type__c()==null) || 
             (this.outage_Type__c!=null &&
              this.outage_Type__c.equals(other.getOutage_Type__c()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.performed_SmokeTest__c==null && other.getPerformed_SmokeTest__c()==null) || 
             (this.performed_SmokeTest__c!=null &&
              this.performed_SmokeTest__c.equals(other.getPerformed_SmokeTest__c()))) &&
            ((this.potential_Impact__c==null && other.getPotential_Impact__c()==null) || 
             (this.potential_Impact__c!=null &&
              this.potential_Impact__c.equals(other.getPotential_Impact__c()))) &&
            ((this.priority__c==null && other.getPriority__c()==null) || 
             (this.priority__c!=null &&
              this.priority__c.equals(other.getPriority__c()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.recordType==null && other.getRecordType()==null) || 
             (this.recordType!=null &&
              this.recordType.equals(other.getRecordType()))) &&
            ((this.recordTypeId==null && other.getRecordTypeId()==null) || 
             (this.recordTypeId!=null &&
              this.recordTypeId.equals(other.getRecordTypeId()))) &&
            ((this.requested_By__c==null && other.getRequested_By__c()==null) || 
             (this.requested_By__c!=null &&
              this.requested_By__c.equals(other.getRequested_By__c()))) &&
            ((this.requested_By__r==null && other.getRequested_By__r()==null) || 
             (this.requested_By__r!=null &&
              this.requested_By__r.equals(other.getRequested_By__r()))) &&
            ((this.resolution__c==null && other.getResolution__c()==null) || 
             (this.resolution__c!=null &&
              this.resolution__c.equals(other.getResolution__c()))) &&
            ((this.rollback_Plan__c==null && other.getRollback_Plan__c()==null) || 
             (this.rollback_Plan__c!=null &&
              this.rollback_Plan__c.equals(other.getRollback_Plan__c()))) &&
            ((this.root_Cause__c==null && other.getRoot_Cause__c()==null) || 
             (this.root_Cause__c!=null &&
              this.root_Cause__c.equals(other.getRoot_Cause__c()))) &&
            ((this.scheduled_Complete__c==null && other.getScheduled_Complete__c()==null) || 
             (this.scheduled_Complete__c!=null &&
              this.scheduled_Complete__c.equals(other.getScheduled_Complete__c()))) &&
            ((this.scheduled_Start__c==null && other.getScheduled_Start__c()==null) || 
             (this.scheduled_Start__c!=null &&
              this.scheduled_Start__c.equals(other.getScheduled_Start__c()))) &&
            ((this.shares==null && other.getShares()==null) || 
             (this.shares!=null &&
              this.shares.equals(other.getShares()))) &&
            ((this.status__c==null && other.getStatus__c()==null) || 
             (this.status__c!=null &&
              this.status__c.equals(other.getStatus__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.system_Sub__c==null && other.getSystem_Sub__c()==null) || 
             (this.system_Sub__c!=null &&
              this.system_Sub__c.equals(other.getSystem_Sub__c()))) &&
            ((this.system__c==null && other.getSystem__c()==null) || 
             (this.system__c!=null &&
              this.system__c.equals(other.getSystem__c()))) &&
            ((this.what__c==null && other.getWhat__c()==null) || 
             (this.what__c!=null &&
              this.what__c.equals(other.getWhat__c()))) &&
            ((this.who_Performs_Work__c==null && other.getWho_Performs_Work__c()==null) || 
             (this.who_Performs_Work__c!=null &&
              this.who_Performs_Work__c.equals(other.getWho_Performs_Work__c()))) &&
            ((this.who_Performs_Work__r==null && other.getWho_Performs_Work__r()==null) || 
             (this.who_Performs_Work__r!=null &&
              this.who_Performs_Work__r.equals(other.getWho_Performs_Work__r()))) &&
            ((this.who_Sends_Communication__c==null && other.getWho_Sends_Communication__c()==null) || 
             (this.who_Sends_Communication__c!=null &&
              this.who_Sends_Communication__c.equals(other.getWho_Sends_Communication__c()))) &&
            ((this.who_Sends_Communication__r==null && other.getWho_Sends_Communication__r()==null) || 
             (this.who_Sends_Communication__r!=null &&
              this.who_Sends_Communication__r.equals(other.getWho_Sends_Communication__r()))) &&
            ((this.why__c==null && other.getWhy__c()==null) || 
             (this.why__c!=null &&
              this.why__c.equals(other.getWhy__c())));
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
        if (getActual_Complete__c() != null) {
            _hashCode += getActual_Complete__c().hashCode();
        }
        if (getActual_Start__c() != null) {
            _hashCode += getActual_Start__c().hashCode();
        }
        if (getAll_kCura_Email_Needed__c() != null) {
            _hashCode += getAll_kCura_Email_Needed__c().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getChangeControlTicketAssociation__r() != null) {
            _hashCode += getChangeControlTicketAssociation__r().hashCode();
        }
        if (getChange_Request_Type__c() != null) {
            _hashCode += getChange_Request_Type__c().hashCode();
        }
        if (getChecklists__r() != null) {
            _hashCode += getChecklists__r().hashCode();
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
        if (getDigital_Signature__c() != null) {
            _hashCode += getDigital_Signature__c().hashCode();
        }
        if (getDue_Date__c() != null) {
            _hashCode += getDue_Date__c().hashCode();
        }
        if (getEnvironment__c() != null) {
            _hashCode += getEnvironment__c().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getHistories() != null) {
            _hashCode += getHistories().hashCode();
        }
        if (getInternal_Communication__c() != null) {
            _hashCode += getInternal_Communication__c().hashCode();
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
        if (getLocation__c() != null) {
            _hashCode += getLocation__c().hashCode();
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
        if (getOutage_End_Time__c() != null) {
            _hashCode += getOutage_End_Time__c().hashCode();
        }
        if (getOutage_Start_Time__c() != null) {
            _hashCode += getOutage_Start_Time__c().hashCode();
        }
        if (getOutage_Type__c() != null) {
            _hashCode += getOutage_Type__c().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getPerformed_SmokeTest__c() != null) {
            _hashCode += getPerformed_SmokeTest__c().hashCode();
        }
        if (getPotential_Impact__c() != null) {
            _hashCode += getPotential_Impact__c().hashCode();
        }
        if (getPriority__c() != null) {
            _hashCode += getPriority__c().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getRecordType() != null) {
            _hashCode += getRecordType().hashCode();
        }
        if (getRecordTypeId() != null) {
            _hashCode += getRecordTypeId().hashCode();
        }
        if (getRequested_By__c() != null) {
            _hashCode += getRequested_By__c().hashCode();
        }
        if (getRequested_By__r() != null) {
            _hashCode += getRequested_By__r().hashCode();
        }
        if (getResolution__c() != null) {
            _hashCode += getResolution__c().hashCode();
        }
        if (getRollback_Plan__c() != null) {
            _hashCode += getRollback_Plan__c().hashCode();
        }
        if (getRoot_Cause__c() != null) {
            _hashCode += getRoot_Cause__c().hashCode();
        }
        if (getScheduled_Complete__c() != null) {
            _hashCode += getScheduled_Complete__c().hashCode();
        }
        if (getScheduled_Start__c() != null) {
            _hashCode += getScheduled_Start__c().hashCode();
        }
        if (getShares() != null) {
            _hashCode += getShares().hashCode();
        }
        if (getStatus__c() != null) {
            _hashCode += getStatus__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getSystem_Sub__c() != null) {
            _hashCode += getSystem_Sub__c().hashCode();
        }
        if (getSystem__c() != null) {
            _hashCode += getSystem__c().hashCode();
        }
        if (getWhat__c() != null) {
            _hashCode += getWhat__c().hashCode();
        }
        if (getWho_Performs_Work__c() != null) {
            _hashCode += getWho_Performs_Work__c().hashCode();
        }
        if (getWho_Performs_Work__r() != null) {
            _hashCode += getWho_Performs_Work__r().hashCode();
        }
        if (getWho_Sends_Communication__c() != null) {
            _hashCode += getWho_Sends_Communication__c().hashCode();
        }
        if (getWho_Sends_Communication__r() != null) {
            _hashCode += getWho_Sends_Communication__r().hashCode();
        }
        if (getWhy__c() != null) {
            _hashCode += getWhy__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Change_Control__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Change_Control__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actual_Complete__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Actual_Complete__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actual_Start__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Actual_Start__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("all_kCura_Email_Needed__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "All_kCura_Email_Needed__c"));
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
        elemField.setFieldName("changeControlTicketAssociation__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ChangeControlTicketAssociation__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("change_Request_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Change_Request_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("digital_Signature__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Digital_Signature__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("due_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Due_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("internal_Communication__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Internal_Communication__c"));
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
        elemField.setFieldName("location__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Location__c"));
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
        elemField.setFieldName("outage_End_Time__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Outage_End_Time__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outage_Start_Time__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Outage_Start_Time__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outage_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Outage_Type__c"));
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
        elemField.setFieldName("performed_SmokeTest__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Performed_SmokeTest__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("potential_Impact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Potential_Impact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Priority__c"));
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
        elemField.setFieldName("requested_By__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Requested_By__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requested_By__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Requested_By__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolution__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Resolution__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rollback_Plan__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Rollback_Plan__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("root_Cause__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Root_Cause__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduled_Complete__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Scheduled_Complete__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduled_Start__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Scheduled_Start__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("status__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status__c"));
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
        elemField.setFieldName("system_Sub__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "System_Sub__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("system__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "System__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("what__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "What__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("who_Performs_Work__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Who_Performs_Work__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("who_Performs_Work__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Who_Performs_Work__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("who_Sends_Communication__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Who_Sends_Communication__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("who_Sends_Communication__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Who_Sends_Communication__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("why__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Why__c"));
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

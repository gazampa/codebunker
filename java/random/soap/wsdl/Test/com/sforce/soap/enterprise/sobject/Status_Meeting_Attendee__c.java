/**
 * Status_Meeting_Attendee__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Status_Meeting_Attendee__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String attendee_ID__c;

    private java.lang.String contact__c;

    private com.sforce.soap.enterprise.sobject.Contact contact__r;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String email__c;

    private java.lang.Double emails_Sent__c;

    private java.lang.String event_Attendee_ID__c;

    private java.lang.String event_ID__c;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.util.Calendar first_Invitation__c;

    private java.lang.Boolean isDeleted;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String name;

    private java.lang.String name__c;

    private java.lang.Boolean no_Show__c;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private java.lang.String object_Type__c;

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private com.sforce.soap.enterprise.QueryResult shares;

    private java.lang.String status_Meeting__c;

    private com.sforce.soap.enterprise.sobject.Status_Meeting__c status_Meeting__r;

    private java.util.Calendar systemModstamp;

    private java.lang.String user__c;

    private com.sforce.soap.enterprise.sobject.User user__r;

    public Status_Meeting_Attendee__c() {
    }

    public Status_Meeting_Attendee__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String attendee_ID__c,
           java.lang.String contact__c,
           com.sforce.soap.enterprise.sobject.Contact contact__r,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String email__c,
           java.lang.Double emails_Sent__c,
           java.lang.String event_Attendee_ID__c,
           java.lang.String event_ID__c,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.util.Calendar first_Invitation__c,
           java.lang.Boolean isDeleted,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String name,
           java.lang.String name__c,
           java.lang.Boolean no_Show__c,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           java.lang.String object_Type__c,
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           com.sforce.soap.enterprise.QueryResult shares,
           java.lang.String status_Meeting__c,
           com.sforce.soap.enterprise.sobject.Status_Meeting__c status_Meeting__r,
           java.util.Calendar systemModstamp,
           java.lang.String user__c,
           com.sforce.soap.enterprise.sobject.User user__r) {
        super(
            fieldsToNull,
            id);
        this.attachments = attachments;
        this.attendee_ID__c = attendee_ID__c;
        this.contact__c = contact__c;
        this.contact__r = contact__r;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.email__c = email__c;
        this.emails_Sent__c = emails_Sent__c;
        this.event_Attendee_ID__c = event_Attendee_ID__c;
        this.event_ID__c = event_ID__c;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.first_Invitation__c = first_Invitation__c;
        this.isDeleted = isDeleted;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.name = name;
        this.name__c = name__c;
        this.no_Show__c = no_Show__c;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.object_Type__c = object_Type__c;
        this.owner = owner;
        this.ownerId = ownerId;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.shares = shares;
        this.status_Meeting__c = status_Meeting__c;
        this.status_Meeting__r = status_Meeting__r;
        this.systemModstamp = systemModstamp;
        this.user__c = user__c;
        this.user__r = user__r;
    }


    /**
     * Gets the attachments value for this Status_Meeting_Attendee__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Status_Meeting_Attendee__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the attendee_ID__c value for this Status_Meeting_Attendee__c.
     * 
     * @return attendee_ID__c
     */
    public java.lang.String getAttendee_ID__c() {
        return attendee_ID__c;
    }


    /**
     * Sets the attendee_ID__c value for this Status_Meeting_Attendee__c.
     * 
     * @param attendee_ID__c
     */
    public void setAttendee_ID__c(java.lang.String attendee_ID__c) {
        this.attendee_ID__c = attendee_ID__c;
    }


    /**
     * Gets the contact__c value for this Status_Meeting_Attendee__c.
     * 
     * @return contact__c
     */
    public java.lang.String getContact__c() {
        return contact__c;
    }


    /**
     * Sets the contact__c value for this Status_Meeting_Attendee__c.
     * 
     * @param contact__c
     */
    public void setContact__c(java.lang.String contact__c) {
        this.contact__c = contact__c;
    }


    /**
     * Gets the contact__r value for this Status_Meeting_Attendee__c.
     * 
     * @return contact__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getContact__r() {
        return contact__r;
    }


    /**
     * Sets the contact__r value for this Status_Meeting_Attendee__c.
     * 
     * @param contact__r
     */
    public void setContact__r(com.sforce.soap.enterprise.sobject.Contact contact__r) {
        this.contact__r = contact__r;
    }


    /**
     * Gets the createdBy value for this Status_Meeting_Attendee__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Status_Meeting_Attendee__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Status_Meeting_Attendee__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Status_Meeting_Attendee__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Status_Meeting_Attendee__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Status_Meeting_Attendee__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the email__c value for this Status_Meeting_Attendee__c.
     * 
     * @return email__c
     */
    public java.lang.String getEmail__c() {
        return email__c;
    }


    /**
     * Sets the email__c value for this Status_Meeting_Attendee__c.
     * 
     * @param email__c
     */
    public void setEmail__c(java.lang.String email__c) {
        this.email__c = email__c;
    }


    /**
     * Gets the emails_Sent__c value for this Status_Meeting_Attendee__c.
     * 
     * @return emails_Sent__c
     */
    public java.lang.Double getEmails_Sent__c() {
        return emails_Sent__c;
    }


    /**
     * Sets the emails_Sent__c value for this Status_Meeting_Attendee__c.
     * 
     * @param emails_Sent__c
     */
    public void setEmails_Sent__c(java.lang.Double emails_Sent__c) {
        this.emails_Sent__c = emails_Sent__c;
    }


    /**
     * Gets the event_Attendee_ID__c value for this Status_Meeting_Attendee__c.
     * 
     * @return event_Attendee_ID__c
     */
    public java.lang.String getEvent_Attendee_ID__c() {
        return event_Attendee_ID__c;
    }


    /**
     * Sets the event_Attendee_ID__c value for this Status_Meeting_Attendee__c.
     * 
     * @param event_Attendee_ID__c
     */
    public void setEvent_Attendee_ID__c(java.lang.String event_Attendee_ID__c) {
        this.event_Attendee_ID__c = event_Attendee_ID__c;
    }


    /**
     * Gets the event_ID__c value for this Status_Meeting_Attendee__c.
     * 
     * @return event_ID__c
     */
    public java.lang.String getEvent_ID__c() {
        return event_ID__c;
    }


    /**
     * Sets the event_ID__c value for this Status_Meeting_Attendee__c.
     * 
     * @param event_ID__c
     */
    public void setEvent_ID__c(java.lang.String event_ID__c) {
        this.event_ID__c = event_ID__c;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Status_Meeting_Attendee__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Status_Meeting_Attendee__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the first_Invitation__c value for this Status_Meeting_Attendee__c.
     * 
     * @return first_Invitation__c
     */
    public java.util.Calendar getFirst_Invitation__c() {
        return first_Invitation__c;
    }


    /**
     * Sets the first_Invitation__c value for this Status_Meeting_Attendee__c.
     * 
     * @param first_Invitation__c
     */
    public void setFirst_Invitation__c(java.util.Calendar first_Invitation__c) {
        this.first_Invitation__c = first_Invitation__c;
    }


    /**
     * Gets the isDeleted value for this Status_Meeting_Attendee__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Status_Meeting_Attendee__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this Status_Meeting_Attendee__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Status_Meeting_Attendee__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Status_Meeting_Attendee__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Status_Meeting_Attendee__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Status_Meeting_Attendee__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Status_Meeting_Attendee__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this Status_Meeting_Attendee__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Status_Meeting_Attendee__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the name__c value for this Status_Meeting_Attendee__c.
     * 
     * @return name__c
     */
    public java.lang.String getName__c() {
        return name__c;
    }


    /**
     * Sets the name__c value for this Status_Meeting_Attendee__c.
     * 
     * @param name__c
     */
    public void setName__c(java.lang.String name__c) {
        this.name__c = name__c;
    }


    /**
     * Gets the no_Show__c value for this Status_Meeting_Attendee__c.
     * 
     * @return no_Show__c
     */
    public java.lang.Boolean getNo_Show__c() {
        return no_Show__c;
    }


    /**
     * Sets the no_Show__c value for this Status_Meeting_Attendee__c.
     * 
     * @param no_Show__c
     */
    public void setNo_Show__c(java.lang.Boolean no_Show__c) {
        this.no_Show__c = no_Show__c;
    }


    /**
     * Gets the notes value for this Status_Meeting_Attendee__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Status_Meeting_Attendee__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Status_Meeting_Attendee__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Status_Meeting_Attendee__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the object_Type__c value for this Status_Meeting_Attendee__c.
     * 
     * @return object_Type__c
     */
    public java.lang.String getObject_Type__c() {
        return object_Type__c;
    }


    /**
     * Sets the object_Type__c value for this Status_Meeting_Attendee__c.
     * 
     * @param object_Type__c
     */
    public void setObject_Type__c(java.lang.String object_Type__c) {
        this.object_Type__c = object_Type__c;
    }


    /**
     * Gets the owner value for this Status_Meeting_Attendee__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Status_Meeting_Attendee__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Status_Meeting_Attendee__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Status_Meeting_Attendee__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this Status_Meeting_Attendee__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Status_Meeting_Attendee__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Status_Meeting_Attendee__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Status_Meeting_Attendee__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the shares value for this Status_Meeting_Attendee__c.
     * 
     * @return shares
     */
    public com.sforce.soap.enterprise.QueryResult getShares() {
        return shares;
    }


    /**
     * Sets the shares value for this Status_Meeting_Attendee__c.
     * 
     * @param shares
     */
    public void setShares(com.sforce.soap.enterprise.QueryResult shares) {
        this.shares = shares;
    }


    /**
     * Gets the status_Meeting__c value for this Status_Meeting_Attendee__c.
     * 
     * @return status_Meeting__c
     */
    public java.lang.String getStatus_Meeting__c() {
        return status_Meeting__c;
    }


    /**
     * Sets the status_Meeting__c value for this Status_Meeting_Attendee__c.
     * 
     * @param status_Meeting__c
     */
    public void setStatus_Meeting__c(java.lang.String status_Meeting__c) {
        this.status_Meeting__c = status_Meeting__c;
    }


    /**
     * Gets the status_Meeting__r value for this Status_Meeting_Attendee__c.
     * 
     * @return status_Meeting__r
     */
    public com.sforce.soap.enterprise.sobject.Status_Meeting__c getStatus_Meeting__r() {
        return status_Meeting__r;
    }


    /**
     * Sets the status_Meeting__r value for this Status_Meeting_Attendee__c.
     * 
     * @param status_Meeting__r
     */
    public void setStatus_Meeting__r(com.sforce.soap.enterprise.sobject.Status_Meeting__c status_Meeting__r) {
        this.status_Meeting__r = status_Meeting__r;
    }


    /**
     * Gets the systemModstamp value for this Status_Meeting_Attendee__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Status_Meeting_Attendee__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the user__c value for this Status_Meeting_Attendee__c.
     * 
     * @return user__c
     */
    public java.lang.String getUser__c() {
        return user__c;
    }


    /**
     * Sets the user__c value for this Status_Meeting_Attendee__c.
     * 
     * @param user__c
     */
    public void setUser__c(java.lang.String user__c) {
        this.user__c = user__c;
    }


    /**
     * Gets the user__r value for this Status_Meeting_Attendee__c.
     * 
     * @return user__r
     */
    public com.sforce.soap.enterprise.sobject.User getUser__r() {
        return user__r;
    }


    /**
     * Sets the user__r value for this Status_Meeting_Attendee__c.
     * 
     * @param user__r
     */
    public void setUser__r(com.sforce.soap.enterprise.sobject.User user__r) {
        this.user__r = user__r;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Status_Meeting_Attendee__c)) return false;
        Status_Meeting_Attendee__c other = (Status_Meeting_Attendee__c) obj;
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
            ((this.attendee_ID__c==null && other.getAttendee_ID__c()==null) || 
             (this.attendee_ID__c!=null &&
              this.attendee_ID__c.equals(other.getAttendee_ID__c()))) &&
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
            ((this.email__c==null && other.getEmail__c()==null) || 
             (this.email__c!=null &&
              this.email__c.equals(other.getEmail__c()))) &&
            ((this.emails_Sent__c==null && other.getEmails_Sent__c()==null) || 
             (this.emails_Sent__c!=null &&
              this.emails_Sent__c.equals(other.getEmails_Sent__c()))) &&
            ((this.event_Attendee_ID__c==null && other.getEvent_Attendee_ID__c()==null) || 
             (this.event_Attendee_ID__c!=null &&
              this.event_Attendee_ID__c.equals(other.getEvent_Attendee_ID__c()))) &&
            ((this.event_ID__c==null && other.getEvent_ID__c()==null) || 
             (this.event_ID__c!=null &&
              this.event_ID__c.equals(other.getEvent_ID__c()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.first_Invitation__c==null && other.getFirst_Invitation__c()==null) || 
             (this.first_Invitation__c!=null &&
              this.first_Invitation__c.equals(other.getFirst_Invitation__c()))) &&
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
            ((this.name__c==null && other.getName__c()==null) || 
             (this.name__c!=null &&
              this.name__c.equals(other.getName__c()))) &&
            ((this.no_Show__c==null && other.getNo_Show__c()==null) || 
             (this.no_Show__c!=null &&
              this.no_Show__c.equals(other.getNo_Show__c()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.object_Type__c==null && other.getObject_Type__c()==null) || 
             (this.object_Type__c!=null &&
              this.object_Type__c.equals(other.getObject_Type__c()))) &&
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
            ((this.status_Meeting__c==null && other.getStatus_Meeting__c()==null) || 
             (this.status_Meeting__c!=null &&
              this.status_Meeting__c.equals(other.getStatus_Meeting__c()))) &&
            ((this.status_Meeting__r==null && other.getStatus_Meeting__r()==null) || 
             (this.status_Meeting__r!=null &&
              this.status_Meeting__r.equals(other.getStatus_Meeting__r()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.user__c==null && other.getUser__c()==null) || 
             (this.user__c!=null &&
              this.user__c.equals(other.getUser__c()))) &&
            ((this.user__r==null && other.getUser__r()==null) || 
             (this.user__r!=null &&
              this.user__r.equals(other.getUser__r())));
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
        if (getAttendee_ID__c() != null) {
            _hashCode += getAttendee_ID__c().hashCode();
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
        if (getEmail__c() != null) {
            _hashCode += getEmail__c().hashCode();
        }
        if (getEmails_Sent__c() != null) {
            _hashCode += getEmails_Sent__c().hashCode();
        }
        if (getEvent_Attendee_ID__c() != null) {
            _hashCode += getEvent_Attendee_ID__c().hashCode();
        }
        if (getEvent_ID__c() != null) {
            _hashCode += getEvent_ID__c().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getFirst_Invitation__c() != null) {
            _hashCode += getFirst_Invitation__c().hashCode();
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
        if (getName__c() != null) {
            _hashCode += getName__c().hashCode();
        }
        if (getNo_Show__c() != null) {
            _hashCode += getNo_Show__c().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getNotesAndAttachments() != null) {
            _hashCode += getNotesAndAttachments().hashCode();
        }
        if (getObject_Type__c() != null) {
            _hashCode += getObject_Type__c().hashCode();
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
        if (getStatus_Meeting__c() != null) {
            _hashCode += getStatus_Meeting__c().hashCode();
        }
        if (getStatus_Meeting__r() != null) {
            _hashCode += getStatus_Meeting__r().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getUser__c() != null) {
            _hashCode += getUser__c().hashCode();
        }
        if (getUser__r() != null) {
            _hashCode += getUser__r().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Status_Meeting_Attendee__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status_Meeting_Attendee__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attendee_ID__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attendee_ID__c"));
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
        elemField.setFieldName("email__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Email__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emails_Sent__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Emails_Sent__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("event_Attendee_ID__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Event_Attendee_ID__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("event_ID__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Event_ID__c"));
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
        elemField.setFieldName("first_Invitation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "First_Invitation__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("object_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Object_Type__c"));
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
        elemField.setFieldName("shares");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Shares"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status_Meeting__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status_Meeting__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status_Meeting__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status_Meeting__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status_Meeting__c"));
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
        elemField.setFieldName("user__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
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

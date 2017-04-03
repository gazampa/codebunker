/**
 * Test_Case__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Test_Case__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult attachments;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.Boolean email_Notification__c;

    private java.lang.String estimated_Hours_High__c;

    private java.lang.String estimated__c;

    private java.lang.String feature__c;

    private com.sforce.soap.enterprise.sobject.Feature__c feature__r;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.lang.String instructions__c;

    private java.lang.Boolean isDeleted;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String link_1__c;

    private java.lang.String link_2__c;

    private java.lang.String link_3__c;

    private java.lang.String link_4__c;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private java.lang.String parent_Test_Case__c;

    private com.sforce.soap.enterprise.sobject.Test_Case__c parent_Test_Case__r;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.util.Calendar systemModstamp;

    private java.lang.String test_Case_Name__c;

    private java.lang.String test_Case_Number__c;

    private com.sforce.soap.enterprise.QueryResult test_Cases1__r;

    public Test_Case__c() {
    }

    public Test_Case__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult attachments,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.Boolean email_Notification__c,
           java.lang.String estimated_Hours_High__c,
           java.lang.String estimated__c,
           java.lang.String feature__c,
           com.sforce.soap.enterprise.sobject.Feature__c feature__r,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.lang.String instructions__c,
           java.lang.Boolean isDeleted,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String link_1__c,
           java.lang.String link_2__c,
           java.lang.String link_3__c,
           java.lang.String link_4__c,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           java.lang.String parent_Test_Case__c,
           com.sforce.soap.enterprise.sobject.Test_Case__c parent_Test_Case__r,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.util.Calendar systemModstamp,
           java.lang.String test_Case_Name__c,
           java.lang.String test_Case_Number__c,
           com.sforce.soap.enterprise.QueryResult test_Cases1__r) {
        super(
            fieldsToNull,
            id);
        this.attachments = attachments;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.email_Notification__c = email_Notification__c;
        this.estimated_Hours_High__c = estimated_Hours_High__c;
        this.estimated__c = estimated__c;
        this.feature__c = feature__c;
        this.feature__r = feature__r;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.instructions__c = instructions__c;
        this.isDeleted = isDeleted;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.link_1__c = link_1__c;
        this.link_2__c = link_2__c;
        this.link_3__c = link_3__c;
        this.link_4__c = link_4__c;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.owner = owner;
        this.ownerId = ownerId;
        this.parent_Test_Case__c = parent_Test_Case__c;
        this.parent_Test_Case__r = parent_Test_Case__r;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.systemModstamp = systemModstamp;
        this.test_Case_Name__c = test_Case_Name__c;
        this.test_Case_Number__c = test_Case_Number__c;
        this.test_Cases1__r = test_Cases1__r;
    }


    /**
     * Gets the attachments value for this Test_Case__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Test_Case__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the createdBy value for this Test_Case__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Test_Case__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Test_Case__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Test_Case__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Test_Case__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Test_Case__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the email_Notification__c value for this Test_Case__c.
     * 
     * @return email_Notification__c
     */
    public java.lang.Boolean getEmail_Notification__c() {
        return email_Notification__c;
    }


    /**
     * Sets the email_Notification__c value for this Test_Case__c.
     * 
     * @param email_Notification__c
     */
    public void setEmail_Notification__c(java.lang.Boolean email_Notification__c) {
        this.email_Notification__c = email_Notification__c;
    }


    /**
     * Gets the estimated_Hours_High__c value for this Test_Case__c.
     * 
     * @return estimated_Hours_High__c
     */
    public java.lang.String getEstimated_Hours_High__c() {
        return estimated_Hours_High__c;
    }


    /**
     * Sets the estimated_Hours_High__c value for this Test_Case__c.
     * 
     * @param estimated_Hours_High__c
     */
    public void setEstimated_Hours_High__c(java.lang.String estimated_Hours_High__c) {
        this.estimated_Hours_High__c = estimated_Hours_High__c;
    }


    /**
     * Gets the estimated__c value for this Test_Case__c.
     * 
     * @return estimated__c
     */
    public java.lang.String getEstimated__c() {
        return estimated__c;
    }


    /**
     * Sets the estimated__c value for this Test_Case__c.
     * 
     * @param estimated__c
     */
    public void setEstimated__c(java.lang.String estimated__c) {
        this.estimated__c = estimated__c;
    }


    /**
     * Gets the feature__c value for this Test_Case__c.
     * 
     * @return feature__c
     */
    public java.lang.String getFeature__c() {
        return feature__c;
    }


    /**
     * Sets the feature__c value for this Test_Case__c.
     * 
     * @param feature__c
     */
    public void setFeature__c(java.lang.String feature__c) {
        this.feature__c = feature__c;
    }


    /**
     * Gets the feature__r value for this Test_Case__c.
     * 
     * @return feature__r
     */
    public com.sforce.soap.enterprise.sobject.Feature__c getFeature__r() {
        return feature__r;
    }


    /**
     * Sets the feature__r value for this Test_Case__c.
     * 
     * @param feature__r
     */
    public void setFeature__r(com.sforce.soap.enterprise.sobject.Feature__c feature__r) {
        this.feature__r = feature__r;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Test_Case__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Test_Case__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the instructions__c value for this Test_Case__c.
     * 
     * @return instructions__c
     */
    public java.lang.String getInstructions__c() {
        return instructions__c;
    }


    /**
     * Sets the instructions__c value for this Test_Case__c.
     * 
     * @param instructions__c
     */
    public void setInstructions__c(java.lang.String instructions__c) {
        this.instructions__c = instructions__c;
    }


    /**
     * Gets the isDeleted value for this Test_Case__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Test_Case__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this Test_Case__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Test_Case__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Test_Case__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Test_Case__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Test_Case__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Test_Case__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the link_1__c value for this Test_Case__c.
     * 
     * @return link_1__c
     */
    public java.lang.String getLink_1__c() {
        return link_1__c;
    }


    /**
     * Sets the link_1__c value for this Test_Case__c.
     * 
     * @param link_1__c
     */
    public void setLink_1__c(java.lang.String link_1__c) {
        this.link_1__c = link_1__c;
    }


    /**
     * Gets the link_2__c value for this Test_Case__c.
     * 
     * @return link_2__c
     */
    public java.lang.String getLink_2__c() {
        return link_2__c;
    }


    /**
     * Sets the link_2__c value for this Test_Case__c.
     * 
     * @param link_2__c
     */
    public void setLink_2__c(java.lang.String link_2__c) {
        this.link_2__c = link_2__c;
    }


    /**
     * Gets the link_3__c value for this Test_Case__c.
     * 
     * @return link_3__c
     */
    public java.lang.String getLink_3__c() {
        return link_3__c;
    }


    /**
     * Sets the link_3__c value for this Test_Case__c.
     * 
     * @param link_3__c
     */
    public void setLink_3__c(java.lang.String link_3__c) {
        this.link_3__c = link_3__c;
    }


    /**
     * Gets the link_4__c value for this Test_Case__c.
     * 
     * @return link_4__c
     */
    public java.lang.String getLink_4__c() {
        return link_4__c;
    }


    /**
     * Sets the link_4__c value for this Test_Case__c.
     * 
     * @param link_4__c
     */
    public void setLink_4__c(java.lang.String link_4__c) {
        this.link_4__c = link_4__c;
    }


    /**
     * Gets the name value for this Test_Case__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Test_Case__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Test_Case__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Test_Case__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Test_Case__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Test_Case__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the owner value for this Test_Case__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Test_Case__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Test_Case__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Test_Case__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the parent_Test_Case__c value for this Test_Case__c.
     * 
     * @return parent_Test_Case__c
     */
    public java.lang.String getParent_Test_Case__c() {
        return parent_Test_Case__c;
    }


    /**
     * Sets the parent_Test_Case__c value for this Test_Case__c.
     * 
     * @param parent_Test_Case__c
     */
    public void setParent_Test_Case__c(java.lang.String parent_Test_Case__c) {
        this.parent_Test_Case__c = parent_Test_Case__c;
    }


    /**
     * Gets the parent_Test_Case__r value for this Test_Case__c.
     * 
     * @return parent_Test_Case__r
     */
    public com.sforce.soap.enterprise.sobject.Test_Case__c getParent_Test_Case__r() {
        return parent_Test_Case__r;
    }


    /**
     * Sets the parent_Test_Case__r value for this Test_Case__c.
     * 
     * @param parent_Test_Case__r
     */
    public void setParent_Test_Case__r(com.sforce.soap.enterprise.sobject.Test_Case__c parent_Test_Case__r) {
        this.parent_Test_Case__r = parent_Test_Case__r;
    }


    /**
     * Gets the processInstances value for this Test_Case__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Test_Case__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Test_Case__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Test_Case__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the systemModstamp value for this Test_Case__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Test_Case__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the test_Case_Name__c value for this Test_Case__c.
     * 
     * @return test_Case_Name__c
     */
    public java.lang.String getTest_Case_Name__c() {
        return test_Case_Name__c;
    }


    /**
     * Sets the test_Case_Name__c value for this Test_Case__c.
     * 
     * @param test_Case_Name__c
     */
    public void setTest_Case_Name__c(java.lang.String test_Case_Name__c) {
        this.test_Case_Name__c = test_Case_Name__c;
    }


    /**
     * Gets the test_Case_Number__c value for this Test_Case__c.
     * 
     * @return test_Case_Number__c
     */
    public java.lang.String getTest_Case_Number__c() {
        return test_Case_Number__c;
    }


    /**
     * Sets the test_Case_Number__c value for this Test_Case__c.
     * 
     * @param test_Case_Number__c
     */
    public void setTest_Case_Number__c(java.lang.String test_Case_Number__c) {
        this.test_Case_Number__c = test_Case_Number__c;
    }


    /**
     * Gets the test_Cases1__r value for this Test_Case__c.
     * 
     * @return test_Cases1__r
     */
    public com.sforce.soap.enterprise.QueryResult getTest_Cases1__r() {
        return test_Cases1__r;
    }


    /**
     * Sets the test_Cases1__r value for this Test_Case__c.
     * 
     * @param test_Cases1__r
     */
    public void setTest_Cases1__r(com.sforce.soap.enterprise.QueryResult test_Cases1__r) {
        this.test_Cases1__r = test_Cases1__r;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Test_Case__c)) return false;
        Test_Case__c other = (Test_Case__c) obj;
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
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.email_Notification__c==null && other.getEmail_Notification__c()==null) || 
             (this.email_Notification__c!=null &&
              this.email_Notification__c.equals(other.getEmail_Notification__c()))) &&
            ((this.estimated_Hours_High__c==null && other.getEstimated_Hours_High__c()==null) || 
             (this.estimated_Hours_High__c!=null &&
              this.estimated_Hours_High__c.equals(other.getEstimated_Hours_High__c()))) &&
            ((this.estimated__c==null && other.getEstimated__c()==null) || 
             (this.estimated__c!=null &&
              this.estimated__c.equals(other.getEstimated__c()))) &&
            ((this.feature__c==null && other.getFeature__c()==null) || 
             (this.feature__c!=null &&
              this.feature__c.equals(other.getFeature__c()))) &&
            ((this.feature__r==null && other.getFeature__r()==null) || 
             (this.feature__r!=null &&
              this.feature__r.equals(other.getFeature__r()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.instructions__c==null && other.getInstructions__c()==null) || 
             (this.instructions__c!=null &&
              this.instructions__c.equals(other.getInstructions__c()))) &&
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
            ((this.link_1__c==null && other.getLink_1__c()==null) || 
             (this.link_1__c!=null &&
              this.link_1__c.equals(other.getLink_1__c()))) &&
            ((this.link_2__c==null && other.getLink_2__c()==null) || 
             (this.link_2__c!=null &&
              this.link_2__c.equals(other.getLink_2__c()))) &&
            ((this.link_3__c==null && other.getLink_3__c()==null) || 
             (this.link_3__c!=null &&
              this.link_3__c.equals(other.getLink_3__c()))) &&
            ((this.link_4__c==null && other.getLink_4__c()==null) || 
             (this.link_4__c!=null &&
              this.link_4__c.equals(other.getLink_4__c()))) &&
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
            ((this.parent_Test_Case__c==null && other.getParent_Test_Case__c()==null) || 
             (this.parent_Test_Case__c!=null &&
              this.parent_Test_Case__c.equals(other.getParent_Test_Case__c()))) &&
            ((this.parent_Test_Case__r==null && other.getParent_Test_Case__r()==null) || 
             (this.parent_Test_Case__r!=null &&
              this.parent_Test_Case__r.equals(other.getParent_Test_Case__r()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.test_Case_Name__c==null && other.getTest_Case_Name__c()==null) || 
             (this.test_Case_Name__c!=null &&
              this.test_Case_Name__c.equals(other.getTest_Case_Name__c()))) &&
            ((this.test_Case_Number__c==null && other.getTest_Case_Number__c()==null) || 
             (this.test_Case_Number__c!=null &&
              this.test_Case_Number__c.equals(other.getTest_Case_Number__c()))) &&
            ((this.test_Cases1__r==null && other.getTest_Cases1__r()==null) || 
             (this.test_Cases1__r!=null &&
              this.test_Cases1__r.equals(other.getTest_Cases1__r())));
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
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getCreatedById() != null) {
            _hashCode += getCreatedById().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getEmail_Notification__c() != null) {
            _hashCode += getEmail_Notification__c().hashCode();
        }
        if (getEstimated_Hours_High__c() != null) {
            _hashCode += getEstimated_Hours_High__c().hashCode();
        }
        if (getEstimated__c() != null) {
            _hashCode += getEstimated__c().hashCode();
        }
        if (getFeature__c() != null) {
            _hashCode += getFeature__c().hashCode();
        }
        if (getFeature__r() != null) {
            _hashCode += getFeature__r().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getInstructions__c() != null) {
            _hashCode += getInstructions__c().hashCode();
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
        if (getLink_1__c() != null) {
            _hashCode += getLink_1__c().hashCode();
        }
        if (getLink_2__c() != null) {
            _hashCode += getLink_2__c().hashCode();
        }
        if (getLink_3__c() != null) {
            _hashCode += getLink_3__c().hashCode();
        }
        if (getLink_4__c() != null) {
            _hashCode += getLink_4__c().hashCode();
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
        if (getParent_Test_Case__c() != null) {
            _hashCode += getParent_Test_Case__c().hashCode();
        }
        if (getParent_Test_Case__r() != null) {
            _hashCode += getParent_Test_Case__r().hashCode();
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
        if (getTest_Case_Name__c() != null) {
            _hashCode += getTest_Case_Name__c().hashCode();
        }
        if (getTest_Case_Number__c() != null) {
            _hashCode += getTest_Case_Number__c().hashCode();
        }
        if (getTest_Cases1__r() != null) {
            _hashCode += getTest_Cases1__r().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Test_Case__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Test_Case__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("email_Notification__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Email_Notification__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimated_Hours_High__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Estimated_Hours_High__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimated__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Estimated__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feature__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Feature__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feature__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Feature__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Feature__c"));
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
        elemField.setFieldName("instructions__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Instructions__c"));
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
        elemField.setFieldName("link_1__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Link_1__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("link_2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Link_2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("link_3__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Link_3__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("link_4__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Link_4__c"));
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
        elemField.setFieldName("parent_Test_Case__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Parent_Test_Case__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent_Test_Case__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Parent_Test_Case__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Test_Case__c"));
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
        elemField.setFieldName("test_Case_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Test_Case_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("test_Case_Number__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Test_Case_Number__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("test_Cases1__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Test_Cases1__r"));
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

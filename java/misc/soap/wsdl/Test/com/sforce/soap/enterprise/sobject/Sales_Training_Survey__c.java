/**
 * Sales_Training_Survey__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Sales_Training_Survey__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String contact_Name__c;

    private java.lang.String contact__c;

    private com.sforce.soap.enterprise.sobject.Contact contact__r;

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

    private java.lang.Double q10_Score__c;

    private java.lang.String q10__c;

    private java.lang.Double q11_Score__c;

    private java.lang.String q11__c;

    private java.lang.Double q12_Score__c;

    private java.lang.String q12__c;

    private java.lang.Double q13_Score__c;

    private java.lang.String q13__c;

    private java.lang.Double q14_Score__c;

    private java.lang.String q14__c;

    private java.lang.Double q15_Score__c;

    private java.lang.String q15__c;

    private java.lang.Double q16_Score__c;

    private java.lang.String q16__c;

    private java.lang.Double q17_Score__c;

    private java.lang.String q17__c;

    private java.lang.Double q18_Score__c;

    private java.lang.String q18__c;

    private java.lang.Double q19_Score__c;

    private java.lang.String q19__c;

    private java.lang.Double q1_Score__c;

    private java.lang.String q1__c;

    private java.lang.Double q20_Score__c;

    private java.lang.String q20__c;

    private java.lang.Double q21_Score__c;

    private java.lang.String q21__c;

    private java.lang.Double q22_Score__c;

    private java.lang.String q22__c;

    private java.lang.Double q23_Score__c;

    private java.lang.String q23__c;

    private java.lang.Double q24_Score__c;

    private java.lang.String q24__c;

    private java.lang.Double q25_Score__c;

    private java.lang.String q25__c;

    private java.lang.Double q2_Score__c;

    private java.lang.String q2__c;

    private java.lang.Double q3_Score__c;

    private java.lang.String q3__c;

    private java.lang.Double q4_Score__c;

    private java.lang.String q4__c;

    private java.lang.Double q5_Score__c;

    private java.lang.String q5__c;

    private java.lang.Double q6_Score__c;

    private java.lang.String q6__c;

    private java.lang.Double q7_Score__c;

    private java.lang.String q7__c;

    private java.lang.Double q8_Score__c;

    private java.lang.String q8__c;

    private java.lang.Double q9_Score__c;

    private java.lang.String q9__c;

    private java.lang.Double score__c;

    private java.util.Calendar systemModstamp;

    public Sales_Training_Survey__c() {
    }

    public Sales_Training_Survey__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String contact_Name__c,
           java.lang.String contact__c,
           com.sforce.soap.enterprise.sobject.Contact contact__r,
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
           java.lang.Double q10_Score__c,
           java.lang.String q10__c,
           java.lang.Double q11_Score__c,
           java.lang.String q11__c,
           java.lang.Double q12_Score__c,
           java.lang.String q12__c,
           java.lang.Double q13_Score__c,
           java.lang.String q13__c,
           java.lang.Double q14_Score__c,
           java.lang.String q14__c,
           java.lang.Double q15_Score__c,
           java.lang.String q15__c,
           java.lang.Double q16_Score__c,
           java.lang.String q16__c,
           java.lang.Double q17_Score__c,
           java.lang.String q17__c,
           java.lang.Double q18_Score__c,
           java.lang.String q18__c,
           java.lang.Double q19_Score__c,
           java.lang.String q19__c,
           java.lang.Double q1_Score__c,
           java.lang.String q1__c,
           java.lang.Double q20_Score__c,
           java.lang.String q20__c,
           java.lang.Double q21_Score__c,
           java.lang.String q21__c,
           java.lang.Double q22_Score__c,
           java.lang.String q22__c,
           java.lang.Double q23_Score__c,
           java.lang.String q23__c,
           java.lang.Double q24_Score__c,
           java.lang.String q24__c,
           java.lang.Double q25_Score__c,
           java.lang.String q25__c,
           java.lang.Double q2_Score__c,
           java.lang.String q2__c,
           java.lang.Double q3_Score__c,
           java.lang.String q3__c,
           java.lang.Double q4_Score__c,
           java.lang.String q4__c,
           java.lang.Double q5_Score__c,
           java.lang.String q5__c,
           java.lang.Double q6_Score__c,
           java.lang.String q6__c,
           java.lang.Double q7_Score__c,
           java.lang.String q7__c,
           java.lang.Double q8_Score__c,
           java.lang.String q8__c,
           java.lang.Double q9_Score__c,
           java.lang.String q9__c,
           java.lang.Double score__c,
           java.util.Calendar systemModstamp) {
        super(
            fieldsToNull,
            id);
        this.attachments = attachments;
        this.contact_Name__c = contact_Name__c;
        this.contact__c = contact__c;
        this.contact__r = contact__r;
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
        this.q10_Score__c = q10_Score__c;
        this.q10__c = q10__c;
        this.q11_Score__c = q11_Score__c;
        this.q11__c = q11__c;
        this.q12_Score__c = q12_Score__c;
        this.q12__c = q12__c;
        this.q13_Score__c = q13_Score__c;
        this.q13__c = q13__c;
        this.q14_Score__c = q14_Score__c;
        this.q14__c = q14__c;
        this.q15_Score__c = q15_Score__c;
        this.q15__c = q15__c;
        this.q16_Score__c = q16_Score__c;
        this.q16__c = q16__c;
        this.q17_Score__c = q17_Score__c;
        this.q17__c = q17__c;
        this.q18_Score__c = q18_Score__c;
        this.q18__c = q18__c;
        this.q19_Score__c = q19_Score__c;
        this.q19__c = q19__c;
        this.q1_Score__c = q1_Score__c;
        this.q1__c = q1__c;
        this.q20_Score__c = q20_Score__c;
        this.q20__c = q20__c;
        this.q21_Score__c = q21_Score__c;
        this.q21__c = q21__c;
        this.q22_Score__c = q22_Score__c;
        this.q22__c = q22__c;
        this.q23_Score__c = q23_Score__c;
        this.q23__c = q23__c;
        this.q24_Score__c = q24_Score__c;
        this.q24__c = q24__c;
        this.q25_Score__c = q25_Score__c;
        this.q25__c = q25__c;
        this.q2_Score__c = q2_Score__c;
        this.q2__c = q2__c;
        this.q3_Score__c = q3_Score__c;
        this.q3__c = q3__c;
        this.q4_Score__c = q4_Score__c;
        this.q4__c = q4__c;
        this.q5_Score__c = q5_Score__c;
        this.q5__c = q5__c;
        this.q6_Score__c = q6_Score__c;
        this.q6__c = q6__c;
        this.q7_Score__c = q7_Score__c;
        this.q7__c = q7__c;
        this.q8_Score__c = q8_Score__c;
        this.q8__c = q8__c;
        this.q9_Score__c = q9_Score__c;
        this.q9__c = q9__c;
        this.score__c = score__c;
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the attachments value for this Sales_Training_Survey__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Sales_Training_Survey__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the contact_Name__c value for this Sales_Training_Survey__c.
     * 
     * @return contact_Name__c
     */
    public java.lang.String getContact_Name__c() {
        return contact_Name__c;
    }


    /**
     * Sets the contact_Name__c value for this Sales_Training_Survey__c.
     * 
     * @param contact_Name__c
     */
    public void setContact_Name__c(java.lang.String contact_Name__c) {
        this.contact_Name__c = contact_Name__c;
    }


    /**
     * Gets the contact__c value for this Sales_Training_Survey__c.
     * 
     * @return contact__c
     */
    public java.lang.String getContact__c() {
        return contact__c;
    }


    /**
     * Sets the contact__c value for this Sales_Training_Survey__c.
     * 
     * @param contact__c
     */
    public void setContact__c(java.lang.String contact__c) {
        this.contact__c = contact__c;
    }


    /**
     * Gets the contact__r value for this Sales_Training_Survey__c.
     * 
     * @return contact__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getContact__r() {
        return contact__r;
    }


    /**
     * Sets the contact__r value for this Sales_Training_Survey__c.
     * 
     * @param contact__r
     */
    public void setContact__r(com.sforce.soap.enterprise.sobject.Contact contact__r) {
        this.contact__r = contact__r;
    }


    /**
     * Gets the createdBy value for this Sales_Training_Survey__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Sales_Training_Survey__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Sales_Training_Survey__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Sales_Training_Survey__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Sales_Training_Survey__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Sales_Training_Survey__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Sales_Training_Survey__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Sales_Training_Survey__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the isDeleted value for this Sales_Training_Survey__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Sales_Training_Survey__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this Sales_Training_Survey__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Sales_Training_Survey__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Sales_Training_Survey__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Sales_Training_Survey__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Sales_Training_Survey__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Sales_Training_Survey__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this Sales_Training_Survey__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Sales_Training_Survey__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Sales_Training_Survey__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Sales_Training_Survey__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Sales_Training_Survey__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Sales_Training_Survey__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the owner value for this Sales_Training_Survey__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Sales_Training_Survey__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Sales_Training_Survey__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Sales_Training_Survey__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this Sales_Training_Survey__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Sales_Training_Survey__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Sales_Training_Survey__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Sales_Training_Survey__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the q10_Score__c value for this Sales_Training_Survey__c.
     * 
     * @return q10_Score__c
     */
    public java.lang.Double getQ10_Score__c() {
        return q10_Score__c;
    }


    /**
     * Sets the q10_Score__c value for this Sales_Training_Survey__c.
     * 
     * @param q10_Score__c
     */
    public void setQ10_Score__c(java.lang.Double q10_Score__c) {
        this.q10_Score__c = q10_Score__c;
    }


    /**
     * Gets the q10__c value for this Sales_Training_Survey__c.
     * 
     * @return q10__c
     */
    public java.lang.String getQ10__c() {
        return q10__c;
    }


    /**
     * Sets the q10__c value for this Sales_Training_Survey__c.
     * 
     * @param q10__c
     */
    public void setQ10__c(java.lang.String q10__c) {
        this.q10__c = q10__c;
    }


    /**
     * Gets the q11_Score__c value for this Sales_Training_Survey__c.
     * 
     * @return q11_Score__c
     */
    public java.lang.Double getQ11_Score__c() {
        return q11_Score__c;
    }


    /**
     * Sets the q11_Score__c value for this Sales_Training_Survey__c.
     * 
     * @param q11_Score__c
     */
    public void setQ11_Score__c(java.lang.Double q11_Score__c) {
        this.q11_Score__c = q11_Score__c;
    }


    /**
     * Gets the q11__c value for this Sales_Training_Survey__c.
     * 
     * @return q11__c
     */
    public java.lang.String getQ11__c() {
        return q11__c;
    }


    /**
     * Sets the q11__c value for this Sales_Training_Survey__c.
     * 
     * @param q11__c
     */
    public void setQ11__c(java.lang.String q11__c) {
        this.q11__c = q11__c;
    }


    /**
     * Gets the q12_Score__c value for this Sales_Training_Survey__c.
     * 
     * @return q12_Score__c
     */
    public java.lang.Double getQ12_Score__c() {
        return q12_Score__c;
    }


    /**
     * Sets the q12_Score__c value for this Sales_Training_Survey__c.
     * 
     * @param q12_Score__c
     */
    public void setQ12_Score__c(java.lang.Double q12_Score__c) {
        this.q12_Score__c = q12_Score__c;
    }


    /**
     * Gets the q12__c value for this Sales_Training_Survey__c.
     * 
     * @return q12__c
     */
    public java.lang.String getQ12__c() {
        return q12__c;
    }


    /**
     * Sets the q12__c value for this Sales_Training_Survey__c.
     * 
     * @param q12__c
     */
    public void setQ12__c(java.lang.String q12__c) {
        this.q12__c = q12__c;
    }


    /**
     * Gets the q13_Score__c value for this Sales_Training_Survey__c.
     * 
     * @return q13_Score__c
     */
    public java.lang.Double getQ13_Score__c() {
        return q13_Score__c;
    }


    /**
     * Sets the q13_Score__c value for this Sales_Training_Survey__c.
     * 
     * @param q13_Score__c
     */
    public void setQ13_Score__c(java.lang.Double q13_Score__c) {
        this.q13_Score__c = q13_Score__c;
    }


    /**
     * Gets the q13__c value for this Sales_Training_Survey__c.
     * 
     * @return q13__c
     */
    public java.lang.String getQ13__c() {
        return q13__c;
    }


    /**
     * Sets the q13__c value for this Sales_Training_Survey__c.
     * 
     * @param q13__c
     */
    public void setQ13__c(java.lang.String q13__c) {
        this.q13__c = q13__c;
    }


    /**
     * Gets the q14_Score__c value for this Sales_Training_Survey__c.
     * 
     * @return q14_Score__c
     */
    public java.lang.Double getQ14_Score__c() {
        return q14_Score__c;
    }


    /**
     * Sets the q14_Score__c value for this Sales_Training_Survey__c.
     * 
     * @param q14_Score__c
     */
    public void setQ14_Score__c(java.lang.Double q14_Score__c) {
        this.q14_Score__c = q14_Score__c;
    }


    /**
     * Gets the q14__c value for this Sales_Training_Survey__c.
     * 
     * @return q14__c
     */
    public java.lang.String getQ14__c() {
        return q14__c;
    }


    /**
     * Sets the q14__c value for this Sales_Training_Survey__c.
     * 
     * @param q14__c
     */
    public void setQ14__c(java.lang.String q14__c) {
        this.q14__c = q14__c;
    }


    /**
     * Gets the q15_Score__c value for this Sales_Training_Survey__c.
     * 
     * @return q15_Score__c
     */
    public java.lang.Double getQ15_Score__c() {
        return q15_Score__c;
    }


    /**
     * Sets the q15_Score__c value for this Sales_Training_Survey__c.
     * 
     * @param q15_Score__c
     */
    public void setQ15_Score__c(java.lang.Double q15_Score__c) {
        this.q15_Score__c = q15_Score__c;
    }


    /**
     * Gets the q15__c value for this Sales_Training_Survey__c.
     * 
     * @return q15__c
     */
    public java.lang.String getQ15__c() {
        return q15__c;
    }


    /**
     * Sets the q15__c value for this Sales_Training_Survey__c.
     * 
     * @param q15__c
     */
    public void setQ15__c(java.lang.String q15__c) {
        this.q15__c = q15__c;
    }


    /**
     * Gets the q16_Score__c value for this Sales_Training_Survey__c.
     * 
     * @return q16_Score__c
     */
    public java.lang.Double getQ16_Score__c() {
        return q16_Score__c;
    }


    /**
     * Sets the q16_Score__c value for this Sales_Training_Survey__c.
     * 
     * @param q16_Score__c
     */
    public void setQ16_Score__c(java.lang.Double q16_Score__c) {
        this.q16_Score__c = q16_Score__c;
    }


    /**
     * Gets the q16__c value for this Sales_Training_Survey__c.
     * 
     * @return q16__c
     */
    public java.lang.String getQ16__c() {
        return q16__c;
    }


    /**
     * Sets the q16__c value for this Sales_Training_Survey__c.
     * 
     * @param q16__c
     */
    public void setQ16__c(java.lang.String q16__c) {
        this.q16__c = q16__c;
    }


    /**
     * Gets the q17_Score__c value for this Sales_Training_Survey__c.
     * 
     * @return q17_Score__c
     */
    public java.lang.Double getQ17_Score__c() {
        return q17_Score__c;
    }


    /**
     * Sets the q17_Score__c value for this Sales_Training_Survey__c.
     * 
     * @param q17_Score__c
     */
    public void setQ17_Score__c(java.lang.Double q17_Score__c) {
        this.q17_Score__c = q17_Score__c;
    }


    /**
     * Gets the q17__c value for this Sales_Training_Survey__c.
     * 
     * @return q17__c
     */
    public java.lang.String getQ17__c() {
        return q17__c;
    }


    /**
     * Sets the q17__c value for this Sales_Training_Survey__c.
     * 
     * @param q17__c
     */
    public void setQ17__c(java.lang.String q17__c) {
        this.q17__c = q17__c;
    }


    /**
     * Gets the q18_Score__c value for this Sales_Training_Survey__c.
     * 
     * @return q18_Score__c
     */
    public java.lang.Double getQ18_Score__c() {
        return q18_Score__c;
    }


    /**
     * Sets the q18_Score__c value for this Sales_Training_Survey__c.
     * 
     * @param q18_Score__c
     */
    public void setQ18_Score__c(java.lang.Double q18_Score__c) {
        this.q18_Score__c = q18_Score__c;
    }


    /**
     * Gets the q18__c value for this Sales_Training_Survey__c.
     * 
     * @return q18__c
     */
    public java.lang.String getQ18__c() {
        return q18__c;
    }


    /**
     * Sets the q18__c value for this Sales_Training_Survey__c.
     * 
     * @param q18__c
     */
    public void setQ18__c(java.lang.String q18__c) {
        this.q18__c = q18__c;
    }


    /**
     * Gets the q19_Score__c value for this Sales_Training_Survey__c.
     * 
     * @return q19_Score__c
     */
    public java.lang.Double getQ19_Score__c() {
        return q19_Score__c;
    }


    /**
     * Sets the q19_Score__c value for this Sales_Training_Survey__c.
     * 
     * @param q19_Score__c
     */
    public void setQ19_Score__c(java.lang.Double q19_Score__c) {
        this.q19_Score__c = q19_Score__c;
    }


    /**
     * Gets the q19__c value for this Sales_Training_Survey__c.
     * 
     * @return q19__c
     */
    public java.lang.String getQ19__c() {
        return q19__c;
    }


    /**
     * Sets the q19__c value for this Sales_Training_Survey__c.
     * 
     * @param q19__c
     */
    public void setQ19__c(java.lang.String q19__c) {
        this.q19__c = q19__c;
    }


    /**
     * Gets the q1_Score__c value for this Sales_Training_Survey__c.
     * 
     * @return q1_Score__c
     */
    public java.lang.Double getQ1_Score__c() {
        return q1_Score__c;
    }


    /**
     * Sets the q1_Score__c value for this Sales_Training_Survey__c.
     * 
     * @param q1_Score__c
     */
    public void setQ1_Score__c(java.lang.Double q1_Score__c) {
        this.q1_Score__c = q1_Score__c;
    }


    /**
     * Gets the q1__c value for this Sales_Training_Survey__c.
     * 
     * @return q1__c
     */
    public java.lang.String getQ1__c() {
        return q1__c;
    }


    /**
     * Sets the q1__c value for this Sales_Training_Survey__c.
     * 
     * @param q1__c
     */
    public void setQ1__c(java.lang.String q1__c) {
        this.q1__c = q1__c;
    }


    /**
     * Gets the q20_Score__c value for this Sales_Training_Survey__c.
     * 
     * @return q20_Score__c
     */
    public java.lang.Double getQ20_Score__c() {
        return q20_Score__c;
    }


    /**
     * Sets the q20_Score__c value for this Sales_Training_Survey__c.
     * 
     * @param q20_Score__c
     */
    public void setQ20_Score__c(java.lang.Double q20_Score__c) {
        this.q20_Score__c = q20_Score__c;
    }


    /**
     * Gets the q20__c value for this Sales_Training_Survey__c.
     * 
     * @return q20__c
     */
    public java.lang.String getQ20__c() {
        return q20__c;
    }


    /**
     * Sets the q20__c value for this Sales_Training_Survey__c.
     * 
     * @param q20__c
     */
    public void setQ20__c(java.lang.String q20__c) {
        this.q20__c = q20__c;
    }


    /**
     * Gets the q21_Score__c value for this Sales_Training_Survey__c.
     * 
     * @return q21_Score__c
     */
    public java.lang.Double getQ21_Score__c() {
        return q21_Score__c;
    }


    /**
     * Sets the q21_Score__c value for this Sales_Training_Survey__c.
     * 
     * @param q21_Score__c
     */
    public void setQ21_Score__c(java.lang.Double q21_Score__c) {
        this.q21_Score__c = q21_Score__c;
    }


    /**
     * Gets the q21__c value for this Sales_Training_Survey__c.
     * 
     * @return q21__c
     */
    public java.lang.String getQ21__c() {
        return q21__c;
    }


    /**
     * Sets the q21__c value for this Sales_Training_Survey__c.
     * 
     * @param q21__c
     */
    public void setQ21__c(java.lang.String q21__c) {
        this.q21__c = q21__c;
    }


    /**
     * Gets the q22_Score__c value for this Sales_Training_Survey__c.
     * 
     * @return q22_Score__c
     */
    public java.lang.Double getQ22_Score__c() {
        return q22_Score__c;
    }


    /**
     * Sets the q22_Score__c value for this Sales_Training_Survey__c.
     * 
     * @param q22_Score__c
     */
    public void setQ22_Score__c(java.lang.Double q22_Score__c) {
        this.q22_Score__c = q22_Score__c;
    }


    /**
     * Gets the q22__c value for this Sales_Training_Survey__c.
     * 
     * @return q22__c
     */
    public java.lang.String getQ22__c() {
        return q22__c;
    }


    /**
     * Sets the q22__c value for this Sales_Training_Survey__c.
     * 
     * @param q22__c
     */
    public void setQ22__c(java.lang.String q22__c) {
        this.q22__c = q22__c;
    }


    /**
     * Gets the q23_Score__c value for this Sales_Training_Survey__c.
     * 
     * @return q23_Score__c
     */
    public java.lang.Double getQ23_Score__c() {
        return q23_Score__c;
    }


    /**
     * Sets the q23_Score__c value for this Sales_Training_Survey__c.
     * 
     * @param q23_Score__c
     */
    public void setQ23_Score__c(java.lang.Double q23_Score__c) {
        this.q23_Score__c = q23_Score__c;
    }


    /**
     * Gets the q23__c value for this Sales_Training_Survey__c.
     * 
     * @return q23__c
     */
    public java.lang.String getQ23__c() {
        return q23__c;
    }


    /**
     * Sets the q23__c value for this Sales_Training_Survey__c.
     * 
     * @param q23__c
     */
    public void setQ23__c(java.lang.String q23__c) {
        this.q23__c = q23__c;
    }


    /**
     * Gets the q24_Score__c value for this Sales_Training_Survey__c.
     * 
     * @return q24_Score__c
     */
    public java.lang.Double getQ24_Score__c() {
        return q24_Score__c;
    }


    /**
     * Sets the q24_Score__c value for this Sales_Training_Survey__c.
     * 
     * @param q24_Score__c
     */
    public void setQ24_Score__c(java.lang.Double q24_Score__c) {
        this.q24_Score__c = q24_Score__c;
    }


    /**
     * Gets the q24__c value for this Sales_Training_Survey__c.
     * 
     * @return q24__c
     */
    public java.lang.String getQ24__c() {
        return q24__c;
    }


    /**
     * Sets the q24__c value for this Sales_Training_Survey__c.
     * 
     * @param q24__c
     */
    public void setQ24__c(java.lang.String q24__c) {
        this.q24__c = q24__c;
    }


    /**
     * Gets the q25_Score__c value for this Sales_Training_Survey__c.
     * 
     * @return q25_Score__c
     */
    public java.lang.Double getQ25_Score__c() {
        return q25_Score__c;
    }


    /**
     * Sets the q25_Score__c value for this Sales_Training_Survey__c.
     * 
     * @param q25_Score__c
     */
    public void setQ25_Score__c(java.lang.Double q25_Score__c) {
        this.q25_Score__c = q25_Score__c;
    }


    /**
     * Gets the q25__c value for this Sales_Training_Survey__c.
     * 
     * @return q25__c
     */
    public java.lang.String getQ25__c() {
        return q25__c;
    }


    /**
     * Sets the q25__c value for this Sales_Training_Survey__c.
     * 
     * @param q25__c
     */
    public void setQ25__c(java.lang.String q25__c) {
        this.q25__c = q25__c;
    }


    /**
     * Gets the q2_Score__c value for this Sales_Training_Survey__c.
     * 
     * @return q2_Score__c
     */
    public java.lang.Double getQ2_Score__c() {
        return q2_Score__c;
    }


    /**
     * Sets the q2_Score__c value for this Sales_Training_Survey__c.
     * 
     * @param q2_Score__c
     */
    public void setQ2_Score__c(java.lang.Double q2_Score__c) {
        this.q2_Score__c = q2_Score__c;
    }


    /**
     * Gets the q2__c value for this Sales_Training_Survey__c.
     * 
     * @return q2__c
     */
    public java.lang.String getQ2__c() {
        return q2__c;
    }


    /**
     * Sets the q2__c value for this Sales_Training_Survey__c.
     * 
     * @param q2__c
     */
    public void setQ2__c(java.lang.String q2__c) {
        this.q2__c = q2__c;
    }


    /**
     * Gets the q3_Score__c value for this Sales_Training_Survey__c.
     * 
     * @return q3_Score__c
     */
    public java.lang.Double getQ3_Score__c() {
        return q3_Score__c;
    }


    /**
     * Sets the q3_Score__c value for this Sales_Training_Survey__c.
     * 
     * @param q3_Score__c
     */
    public void setQ3_Score__c(java.lang.Double q3_Score__c) {
        this.q3_Score__c = q3_Score__c;
    }


    /**
     * Gets the q3__c value for this Sales_Training_Survey__c.
     * 
     * @return q3__c
     */
    public java.lang.String getQ3__c() {
        return q3__c;
    }


    /**
     * Sets the q3__c value for this Sales_Training_Survey__c.
     * 
     * @param q3__c
     */
    public void setQ3__c(java.lang.String q3__c) {
        this.q3__c = q3__c;
    }


    /**
     * Gets the q4_Score__c value for this Sales_Training_Survey__c.
     * 
     * @return q4_Score__c
     */
    public java.lang.Double getQ4_Score__c() {
        return q4_Score__c;
    }


    /**
     * Sets the q4_Score__c value for this Sales_Training_Survey__c.
     * 
     * @param q4_Score__c
     */
    public void setQ4_Score__c(java.lang.Double q4_Score__c) {
        this.q4_Score__c = q4_Score__c;
    }


    /**
     * Gets the q4__c value for this Sales_Training_Survey__c.
     * 
     * @return q4__c
     */
    public java.lang.String getQ4__c() {
        return q4__c;
    }


    /**
     * Sets the q4__c value for this Sales_Training_Survey__c.
     * 
     * @param q4__c
     */
    public void setQ4__c(java.lang.String q4__c) {
        this.q4__c = q4__c;
    }


    /**
     * Gets the q5_Score__c value for this Sales_Training_Survey__c.
     * 
     * @return q5_Score__c
     */
    public java.lang.Double getQ5_Score__c() {
        return q5_Score__c;
    }


    /**
     * Sets the q5_Score__c value for this Sales_Training_Survey__c.
     * 
     * @param q5_Score__c
     */
    public void setQ5_Score__c(java.lang.Double q5_Score__c) {
        this.q5_Score__c = q5_Score__c;
    }


    /**
     * Gets the q5__c value for this Sales_Training_Survey__c.
     * 
     * @return q5__c
     */
    public java.lang.String getQ5__c() {
        return q5__c;
    }


    /**
     * Sets the q5__c value for this Sales_Training_Survey__c.
     * 
     * @param q5__c
     */
    public void setQ5__c(java.lang.String q5__c) {
        this.q5__c = q5__c;
    }


    /**
     * Gets the q6_Score__c value for this Sales_Training_Survey__c.
     * 
     * @return q6_Score__c
     */
    public java.lang.Double getQ6_Score__c() {
        return q6_Score__c;
    }


    /**
     * Sets the q6_Score__c value for this Sales_Training_Survey__c.
     * 
     * @param q6_Score__c
     */
    public void setQ6_Score__c(java.lang.Double q6_Score__c) {
        this.q6_Score__c = q6_Score__c;
    }


    /**
     * Gets the q6__c value for this Sales_Training_Survey__c.
     * 
     * @return q6__c
     */
    public java.lang.String getQ6__c() {
        return q6__c;
    }


    /**
     * Sets the q6__c value for this Sales_Training_Survey__c.
     * 
     * @param q6__c
     */
    public void setQ6__c(java.lang.String q6__c) {
        this.q6__c = q6__c;
    }


    /**
     * Gets the q7_Score__c value for this Sales_Training_Survey__c.
     * 
     * @return q7_Score__c
     */
    public java.lang.Double getQ7_Score__c() {
        return q7_Score__c;
    }


    /**
     * Sets the q7_Score__c value for this Sales_Training_Survey__c.
     * 
     * @param q7_Score__c
     */
    public void setQ7_Score__c(java.lang.Double q7_Score__c) {
        this.q7_Score__c = q7_Score__c;
    }


    /**
     * Gets the q7__c value for this Sales_Training_Survey__c.
     * 
     * @return q7__c
     */
    public java.lang.String getQ7__c() {
        return q7__c;
    }


    /**
     * Sets the q7__c value for this Sales_Training_Survey__c.
     * 
     * @param q7__c
     */
    public void setQ7__c(java.lang.String q7__c) {
        this.q7__c = q7__c;
    }


    /**
     * Gets the q8_Score__c value for this Sales_Training_Survey__c.
     * 
     * @return q8_Score__c
     */
    public java.lang.Double getQ8_Score__c() {
        return q8_Score__c;
    }


    /**
     * Sets the q8_Score__c value for this Sales_Training_Survey__c.
     * 
     * @param q8_Score__c
     */
    public void setQ8_Score__c(java.lang.Double q8_Score__c) {
        this.q8_Score__c = q8_Score__c;
    }


    /**
     * Gets the q8__c value for this Sales_Training_Survey__c.
     * 
     * @return q8__c
     */
    public java.lang.String getQ8__c() {
        return q8__c;
    }


    /**
     * Sets the q8__c value for this Sales_Training_Survey__c.
     * 
     * @param q8__c
     */
    public void setQ8__c(java.lang.String q8__c) {
        this.q8__c = q8__c;
    }


    /**
     * Gets the q9_Score__c value for this Sales_Training_Survey__c.
     * 
     * @return q9_Score__c
     */
    public java.lang.Double getQ9_Score__c() {
        return q9_Score__c;
    }


    /**
     * Sets the q9_Score__c value for this Sales_Training_Survey__c.
     * 
     * @param q9_Score__c
     */
    public void setQ9_Score__c(java.lang.Double q9_Score__c) {
        this.q9_Score__c = q9_Score__c;
    }


    /**
     * Gets the q9__c value for this Sales_Training_Survey__c.
     * 
     * @return q9__c
     */
    public java.lang.String getQ9__c() {
        return q9__c;
    }


    /**
     * Sets the q9__c value for this Sales_Training_Survey__c.
     * 
     * @param q9__c
     */
    public void setQ9__c(java.lang.String q9__c) {
        this.q9__c = q9__c;
    }


    /**
     * Gets the score__c value for this Sales_Training_Survey__c.
     * 
     * @return score__c
     */
    public java.lang.Double getScore__c() {
        return score__c;
    }


    /**
     * Sets the score__c value for this Sales_Training_Survey__c.
     * 
     * @param score__c
     */
    public void setScore__c(java.lang.Double score__c) {
        this.score__c = score__c;
    }


    /**
     * Gets the systemModstamp value for this Sales_Training_Survey__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Sales_Training_Survey__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sales_Training_Survey__c)) return false;
        Sales_Training_Survey__c other = (Sales_Training_Survey__c) obj;
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
            ((this.contact_Name__c==null && other.getContact_Name__c()==null) || 
             (this.contact_Name__c!=null &&
              this.contact_Name__c.equals(other.getContact_Name__c()))) &&
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
            ((this.q10_Score__c==null && other.getQ10_Score__c()==null) || 
             (this.q10_Score__c!=null &&
              this.q10_Score__c.equals(other.getQ10_Score__c()))) &&
            ((this.q10__c==null && other.getQ10__c()==null) || 
             (this.q10__c!=null &&
              this.q10__c.equals(other.getQ10__c()))) &&
            ((this.q11_Score__c==null && other.getQ11_Score__c()==null) || 
             (this.q11_Score__c!=null &&
              this.q11_Score__c.equals(other.getQ11_Score__c()))) &&
            ((this.q11__c==null && other.getQ11__c()==null) || 
             (this.q11__c!=null &&
              this.q11__c.equals(other.getQ11__c()))) &&
            ((this.q12_Score__c==null && other.getQ12_Score__c()==null) || 
             (this.q12_Score__c!=null &&
              this.q12_Score__c.equals(other.getQ12_Score__c()))) &&
            ((this.q12__c==null && other.getQ12__c()==null) || 
             (this.q12__c!=null &&
              this.q12__c.equals(other.getQ12__c()))) &&
            ((this.q13_Score__c==null && other.getQ13_Score__c()==null) || 
             (this.q13_Score__c!=null &&
              this.q13_Score__c.equals(other.getQ13_Score__c()))) &&
            ((this.q13__c==null && other.getQ13__c()==null) || 
             (this.q13__c!=null &&
              this.q13__c.equals(other.getQ13__c()))) &&
            ((this.q14_Score__c==null && other.getQ14_Score__c()==null) || 
             (this.q14_Score__c!=null &&
              this.q14_Score__c.equals(other.getQ14_Score__c()))) &&
            ((this.q14__c==null && other.getQ14__c()==null) || 
             (this.q14__c!=null &&
              this.q14__c.equals(other.getQ14__c()))) &&
            ((this.q15_Score__c==null && other.getQ15_Score__c()==null) || 
             (this.q15_Score__c!=null &&
              this.q15_Score__c.equals(other.getQ15_Score__c()))) &&
            ((this.q15__c==null && other.getQ15__c()==null) || 
             (this.q15__c!=null &&
              this.q15__c.equals(other.getQ15__c()))) &&
            ((this.q16_Score__c==null && other.getQ16_Score__c()==null) || 
             (this.q16_Score__c!=null &&
              this.q16_Score__c.equals(other.getQ16_Score__c()))) &&
            ((this.q16__c==null && other.getQ16__c()==null) || 
             (this.q16__c!=null &&
              this.q16__c.equals(other.getQ16__c()))) &&
            ((this.q17_Score__c==null && other.getQ17_Score__c()==null) || 
             (this.q17_Score__c!=null &&
              this.q17_Score__c.equals(other.getQ17_Score__c()))) &&
            ((this.q17__c==null && other.getQ17__c()==null) || 
             (this.q17__c!=null &&
              this.q17__c.equals(other.getQ17__c()))) &&
            ((this.q18_Score__c==null && other.getQ18_Score__c()==null) || 
             (this.q18_Score__c!=null &&
              this.q18_Score__c.equals(other.getQ18_Score__c()))) &&
            ((this.q18__c==null && other.getQ18__c()==null) || 
             (this.q18__c!=null &&
              this.q18__c.equals(other.getQ18__c()))) &&
            ((this.q19_Score__c==null && other.getQ19_Score__c()==null) || 
             (this.q19_Score__c!=null &&
              this.q19_Score__c.equals(other.getQ19_Score__c()))) &&
            ((this.q19__c==null && other.getQ19__c()==null) || 
             (this.q19__c!=null &&
              this.q19__c.equals(other.getQ19__c()))) &&
            ((this.q1_Score__c==null && other.getQ1_Score__c()==null) || 
             (this.q1_Score__c!=null &&
              this.q1_Score__c.equals(other.getQ1_Score__c()))) &&
            ((this.q1__c==null && other.getQ1__c()==null) || 
             (this.q1__c!=null &&
              this.q1__c.equals(other.getQ1__c()))) &&
            ((this.q20_Score__c==null && other.getQ20_Score__c()==null) || 
             (this.q20_Score__c!=null &&
              this.q20_Score__c.equals(other.getQ20_Score__c()))) &&
            ((this.q20__c==null && other.getQ20__c()==null) || 
             (this.q20__c!=null &&
              this.q20__c.equals(other.getQ20__c()))) &&
            ((this.q21_Score__c==null && other.getQ21_Score__c()==null) || 
             (this.q21_Score__c!=null &&
              this.q21_Score__c.equals(other.getQ21_Score__c()))) &&
            ((this.q21__c==null && other.getQ21__c()==null) || 
             (this.q21__c!=null &&
              this.q21__c.equals(other.getQ21__c()))) &&
            ((this.q22_Score__c==null && other.getQ22_Score__c()==null) || 
             (this.q22_Score__c!=null &&
              this.q22_Score__c.equals(other.getQ22_Score__c()))) &&
            ((this.q22__c==null && other.getQ22__c()==null) || 
             (this.q22__c!=null &&
              this.q22__c.equals(other.getQ22__c()))) &&
            ((this.q23_Score__c==null && other.getQ23_Score__c()==null) || 
             (this.q23_Score__c!=null &&
              this.q23_Score__c.equals(other.getQ23_Score__c()))) &&
            ((this.q23__c==null && other.getQ23__c()==null) || 
             (this.q23__c!=null &&
              this.q23__c.equals(other.getQ23__c()))) &&
            ((this.q24_Score__c==null && other.getQ24_Score__c()==null) || 
             (this.q24_Score__c!=null &&
              this.q24_Score__c.equals(other.getQ24_Score__c()))) &&
            ((this.q24__c==null && other.getQ24__c()==null) || 
             (this.q24__c!=null &&
              this.q24__c.equals(other.getQ24__c()))) &&
            ((this.q25_Score__c==null && other.getQ25_Score__c()==null) || 
             (this.q25_Score__c!=null &&
              this.q25_Score__c.equals(other.getQ25_Score__c()))) &&
            ((this.q25__c==null && other.getQ25__c()==null) || 
             (this.q25__c!=null &&
              this.q25__c.equals(other.getQ25__c()))) &&
            ((this.q2_Score__c==null && other.getQ2_Score__c()==null) || 
             (this.q2_Score__c!=null &&
              this.q2_Score__c.equals(other.getQ2_Score__c()))) &&
            ((this.q2__c==null && other.getQ2__c()==null) || 
             (this.q2__c!=null &&
              this.q2__c.equals(other.getQ2__c()))) &&
            ((this.q3_Score__c==null && other.getQ3_Score__c()==null) || 
             (this.q3_Score__c!=null &&
              this.q3_Score__c.equals(other.getQ3_Score__c()))) &&
            ((this.q3__c==null && other.getQ3__c()==null) || 
             (this.q3__c!=null &&
              this.q3__c.equals(other.getQ3__c()))) &&
            ((this.q4_Score__c==null && other.getQ4_Score__c()==null) || 
             (this.q4_Score__c!=null &&
              this.q4_Score__c.equals(other.getQ4_Score__c()))) &&
            ((this.q4__c==null && other.getQ4__c()==null) || 
             (this.q4__c!=null &&
              this.q4__c.equals(other.getQ4__c()))) &&
            ((this.q5_Score__c==null && other.getQ5_Score__c()==null) || 
             (this.q5_Score__c!=null &&
              this.q5_Score__c.equals(other.getQ5_Score__c()))) &&
            ((this.q5__c==null && other.getQ5__c()==null) || 
             (this.q5__c!=null &&
              this.q5__c.equals(other.getQ5__c()))) &&
            ((this.q6_Score__c==null && other.getQ6_Score__c()==null) || 
             (this.q6_Score__c!=null &&
              this.q6_Score__c.equals(other.getQ6_Score__c()))) &&
            ((this.q6__c==null && other.getQ6__c()==null) || 
             (this.q6__c!=null &&
              this.q6__c.equals(other.getQ6__c()))) &&
            ((this.q7_Score__c==null && other.getQ7_Score__c()==null) || 
             (this.q7_Score__c!=null &&
              this.q7_Score__c.equals(other.getQ7_Score__c()))) &&
            ((this.q7__c==null && other.getQ7__c()==null) || 
             (this.q7__c!=null &&
              this.q7__c.equals(other.getQ7__c()))) &&
            ((this.q8_Score__c==null && other.getQ8_Score__c()==null) || 
             (this.q8_Score__c!=null &&
              this.q8_Score__c.equals(other.getQ8_Score__c()))) &&
            ((this.q8__c==null && other.getQ8__c()==null) || 
             (this.q8__c!=null &&
              this.q8__c.equals(other.getQ8__c()))) &&
            ((this.q9_Score__c==null && other.getQ9_Score__c()==null) || 
             (this.q9_Score__c!=null &&
              this.q9_Score__c.equals(other.getQ9_Score__c()))) &&
            ((this.q9__c==null && other.getQ9__c()==null) || 
             (this.q9__c!=null &&
              this.q9__c.equals(other.getQ9__c()))) &&
            ((this.score__c==null && other.getScore__c()==null) || 
             (this.score__c!=null &&
              this.score__c.equals(other.getScore__c()))) &&
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
        if (getContact_Name__c() != null) {
            _hashCode += getContact_Name__c().hashCode();
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
        if (getQ10_Score__c() != null) {
            _hashCode += getQ10_Score__c().hashCode();
        }
        if (getQ10__c() != null) {
            _hashCode += getQ10__c().hashCode();
        }
        if (getQ11_Score__c() != null) {
            _hashCode += getQ11_Score__c().hashCode();
        }
        if (getQ11__c() != null) {
            _hashCode += getQ11__c().hashCode();
        }
        if (getQ12_Score__c() != null) {
            _hashCode += getQ12_Score__c().hashCode();
        }
        if (getQ12__c() != null) {
            _hashCode += getQ12__c().hashCode();
        }
        if (getQ13_Score__c() != null) {
            _hashCode += getQ13_Score__c().hashCode();
        }
        if (getQ13__c() != null) {
            _hashCode += getQ13__c().hashCode();
        }
        if (getQ14_Score__c() != null) {
            _hashCode += getQ14_Score__c().hashCode();
        }
        if (getQ14__c() != null) {
            _hashCode += getQ14__c().hashCode();
        }
        if (getQ15_Score__c() != null) {
            _hashCode += getQ15_Score__c().hashCode();
        }
        if (getQ15__c() != null) {
            _hashCode += getQ15__c().hashCode();
        }
        if (getQ16_Score__c() != null) {
            _hashCode += getQ16_Score__c().hashCode();
        }
        if (getQ16__c() != null) {
            _hashCode += getQ16__c().hashCode();
        }
        if (getQ17_Score__c() != null) {
            _hashCode += getQ17_Score__c().hashCode();
        }
        if (getQ17__c() != null) {
            _hashCode += getQ17__c().hashCode();
        }
        if (getQ18_Score__c() != null) {
            _hashCode += getQ18_Score__c().hashCode();
        }
        if (getQ18__c() != null) {
            _hashCode += getQ18__c().hashCode();
        }
        if (getQ19_Score__c() != null) {
            _hashCode += getQ19_Score__c().hashCode();
        }
        if (getQ19__c() != null) {
            _hashCode += getQ19__c().hashCode();
        }
        if (getQ1_Score__c() != null) {
            _hashCode += getQ1_Score__c().hashCode();
        }
        if (getQ1__c() != null) {
            _hashCode += getQ1__c().hashCode();
        }
        if (getQ20_Score__c() != null) {
            _hashCode += getQ20_Score__c().hashCode();
        }
        if (getQ20__c() != null) {
            _hashCode += getQ20__c().hashCode();
        }
        if (getQ21_Score__c() != null) {
            _hashCode += getQ21_Score__c().hashCode();
        }
        if (getQ21__c() != null) {
            _hashCode += getQ21__c().hashCode();
        }
        if (getQ22_Score__c() != null) {
            _hashCode += getQ22_Score__c().hashCode();
        }
        if (getQ22__c() != null) {
            _hashCode += getQ22__c().hashCode();
        }
        if (getQ23_Score__c() != null) {
            _hashCode += getQ23_Score__c().hashCode();
        }
        if (getQ23__c() != null) {
            _hashCode += getQ23__c().hashCode();
        }
        if (getQ24_Score__c() != null) {
            _hashCode += getQ24_Score__c().hashCode();
        }
        if (getQ24__c() != null) {
            _hashCode += getQ24__c().hashCode();
        }
        if (getQ25_Score__c() != null) {
            _hashCode += getQ25_Score__c().hashCode();
        }
        if (getQ25__c() != null) {
            _hashCode += getQ25__c().hashCode();
        }
        if (getQ2_Score__c() != null) {
            _hashCode += getQ2_Score__c().hashCode();
        }
        if (getQ2__c() != null) {
            _hashCode += getQ2__c().hashCode();
        }
        if (getQ3_Score__c() != null) {
            _hashCode += getQ3_Score__c().hashCode();
        }
        if (getQ3__c() != null) {
            _hashCode += getQ3__c().hashCode();
        }
        if (getQ4_Score__c() != null) {
            _hashCode += getQ4_Score__c().hashCode();
        }
        if (getQ4__c() != null) {
            _hashCode += getQ4__c().hashCode();
        }
        if (getQ5_Score__c() != null) {
            _hashCode += getQ5_Score__c().hashCode();
        }
        if (getQ5__c() != null) {
            _hashCode += getQ5__c().hashCode();
        }
        if (getQ6_Score__c() != null) {
            _hashCode += getQ6_Score__c().hashCode();
        }
        if (getQ6__c() != null) {
            _hashCode += getQ6__c().hashCode();
        }
        if (getQ7_Score__c() != null) {
            _hashCode += getQ7_Score__c().hashCode();
        }
        if (getQ7__c() != null) {
            _hashCode += getQ7__c().hashCode();
        }
        if (getQ8_Score__c() != null) {
            _hashCode += getQ8_Score__c().hashCode();
        }
        if (getQ8__c() != null) {
            _hashCode += getQ8__c().hashCode();
        }
        if (getQ9_Score__c() != null) {
            _hashCode += getQ9_Score__c().hashCode();
        }
        if (getQ9__c() != null) {
            _hashCode += getQ9__c().hashCode();
        }
        if (getScore__c() != null) {
            _hashCode += getScore__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Sales_Training_Survey__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Sales_Training_Survey__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact_Name__c"));
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
        elemField.setFieldName("q10_Score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q10_Score__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q10__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q10__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q11_Score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q11_Score__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q11__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q11__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q12_Score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q12_Score__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q12__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q12__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q13_Score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q13_Score__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q13__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q13__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q14_Score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q14_Score__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q14__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q14__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q15_Score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q15_Score__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q15__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q15__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q16_Score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q16_Score__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q16__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q16__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q17_Score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q17_Score__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q17__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q17__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q18_Score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q18_Score__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q18__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q18__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q19_Score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q19_Score__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q19__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q19__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q1_Score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q1_Score__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q1__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q1__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q20_Score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q20_Score__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q20__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q20__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q21_Score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q21_Score__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q21__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q21__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q22_Score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q22_Score__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q22__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q22__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q23_Score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q23_Score__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q23__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q23__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q24_Score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q24_Score__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q24__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q24__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q25_Score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q25_Score__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q25__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q25__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q2_Score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q2_Score__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q3_Score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q3_Score__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q3__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q3__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q4_Score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q4_Score__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q4__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q4__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q5_Score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q5_Score__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q5__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q5__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q6_Score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q6_Score__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q6__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q6__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q7_Score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q7_Score__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q7__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q7__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q8_Score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q8_Score__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q8__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q8__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q9_Score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q9_Score__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q9__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q9__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

/**
 * Xtma_Individual_Email_Result__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Xtma_Individual_Email_Result__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String campaign__c;

    private com.sforce.soap.enterprise.sobject.Campaign campaign__r;

    private java.lang.String contact__c;

    private com.sforce.soap.enterprise.sobject.Contact contact__r;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.util.Calendar date_Bounced__c;

    private java.util.Calendar date_Time_Opened__c;

    private java.util.Calendar date_Time_Sent__c;

    private java.util.Calendar date_Unsubscribed__c;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.lang.String from_Address__c;

    private java.lang.String from_Name__c;

    private java.lang.Boolean isDeleted;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String lead__c;

    private com.sforce.soap.enterprise.sobject.Lead lead__r;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private java.lang.Double number_of_Total_Clicks__c;

    private java.lang.Double number_of_Unique_Clicks__c;

    private java.lang.Boolean opened__c;

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.String report_Name__c;

    private java.lang.String subject_Line__c;

    private java.util.Calendar systemModstamp;

    public Xtma_Individual_Email_Result__c() {
    }

    public Xtma_Individual_Email_Result__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String campaign__c,
           com.sforce.soap.enterprise.sobject.Campaign campaign__r,
           java.lang.String contact__c,
           com.sforce.soap.enterprise.sobject.Contact contact__r,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.util.Calendar date_Bounced__c,
           java.util.Calendar date_Time_Opened__c,
           java.util.Calendar date_Time_Sent__c,
           java.util.Calendar date_Unsubscribed__c,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.lang.String from_Address__c,
           java.lang.String from_Name__c,
           java.lang.Boolean isDeleted,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String lead__c,
           com.sforce.soap.enterprise.sobject.Lead lead__r,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           java.lang.Double number_of_Total_Clicks__c,
           java.lang.Double number_of_Unique_Clicks__c,
           java.lang.Boolean opened__c,
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.String report_Name__c,
           java.lang.String subject_Line__c,
           java.util.Calendar systemModstamp) {
        super(
            fieldsToNull,
            id);
        this.attachments = attachments;
        this.campaign__c = campaign__c;
        this.campaign__r = campaign__r;
        this.contact__c = contact__c;
        this.contact__r = contact__r;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.date_Bounced__c = date_Bounced__c;
        this.date_Time_Opened__c = date_Time_Opened__c;
        this.date_Time_Sent__c = date_Time_Sent__c;
        this.date_Unsubscribed__c = date_Unsubscribed__c;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.from_Address__c = from_Address__c;
        this.from_Name__c = from_Name__c;
        this.isDeleted = isDeleted;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.lead__c = lead__c;
        this.lead__r = lead__r;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.number_of_Total_Clicks__c = number_of_Total_Clicks__c;
        this.number_of_Unique_Clicks__c = number_of_Unique_Clicks__c;
        this.opened__c = opened__c;
        this.owner = owner;
        this.ownerId = ownerId;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.report_Name__c = report_Name__c;
        this.subject_Line__c = subject_Line__c;
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the attachments value for this Xtma_Individual_Email_Result__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Xtma_Individual_Email_Result__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the campaign__c value for this Xtma_Individual_Email_Result__c.
     * 
     * @return campaign__c
     */
    public java.lang.String getCampaign__c() {
        return campaign__c;
    }


    /**
     * Sets the campaign__c value for this Xtma_Individual_Email_Result__c.
     * 
     * @param campaign__c
     */
    public void setCampaign__c(java.lang.String campaign__c) {
        this.campaign__c = campaign__c;
    }


    /**
     * Gets the campaign__r value for this Xtma_Individual_Email_Result__c.
     * 
     * @return campaign__r
     */
    public com.sforce.soap.enterprise.sobject.Campaign getCampaign__r() {
        return campaign__r;
    }


    /**
     * Sets the campaign__r value for this Xtma_Individual_Email_Result__c.
     * 
     * @param campaign__r
     */
    public void setCampaign__r(com.sforce.soap.enterprise.sobject.Campaign campaign__r) {
        this.campaign__r = campaign__r;
    }


    /**
     * Gets the contact__c value for this Xtma_Individual_Email_Result__c.
     * 
     * @return contact__c
     */
    public java.lang.String getContact__c() {
        return contact__c;
    }


    /**
     * Sets the contact__c value for this Xtma_Individual_Email_Result__c.
     * 
     * @param contact__c
     */
    public void setContact__c(java.lang.String contact__c) {
        this.contact__c = contact__c;
    }


    /**
     * Gets the contact__r value for this Xtma_Individual_Email_Result__c.
     * 
     * @return contact__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getContact__r() {
        return contact__r;
    }


    /**
     * Sets the contact__r value for this Xtma_Individual_Email_Result__c.
     * 
     * @param contact__r
     */
    public void setContact__r(com.sforce.soap.enterprise.sobject.Contact contact__r) {
        this.contact__r = contact__r;
    }


    /**
     * Gets the createdBy value for this Xtma_Individual_Email_Result__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Xtma_Individual_Email_Result__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Xtma_Individual_Email_Result__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Xtma_Individual_Email_Result__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Xtma_Individual_Email_Result__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Xtma_Individual_Email_Result__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the date_Bounced__c value for this Xtma_Individual_Email_Result__c.
     * 
     * @return date_Bounced__c
     */
    public java.util.Calendar getDate_Bounced__c() {
        return date_Bounced__c;
    }


    /**
     * Sets the date_Bounced__c value for this Xtma_Individual_Email_Result__c.
     * 
     * @param date_Bounced__c
     */
    public void setDate_Bounced__c(java.util.Calendar date_Bounced__c) {
        this.date_Bounced__c = date_Bounced__c;
    }


    /**
     * Gets the date_Time_Opened__c value for this Xtma_Individual_Email_Result__c.
     * 
     * @return date_Time_Opened__c
     */
    public java.util.Calendar getDate_Time_Opened__c() {
        return date_Time_Opened__c;
    }


    /**
     * Sets the date_Time_Opened__c value for this Xtma_Individual_Email_Result__c.
     * 
     * @param date_Time_Opened__c
     */
    public void setDate_Time_Opened__c(java.util.Calendar date_Time_Opened__c) {
        this.date_Time_Opened__c = date_Time_Opened__c;
    }


    /**
     * Gets the date_Time_Sent__c value for this Xtma_Individual_Email_Result__c.
     * 
     * @return date_Time_Sent__c
     */
    public java.util.Calendar getDate_Time_Sent__c() {
        return date_Time_Sent__c;
    }


    /**
     * Sets the date_Time_Sent__c value for this Xtma_Individual_Email_Result__c.
     * 
     * @param date_Time_Sent__c
     */
    public void setDate_Time_Sent__c(java.util.Calendar date_Time_Sent__c) {
        this.date_Time_Sent__c = date_Time_Sent__c;
    }


    /**
     * Gets the date_Unsubscribed__c value for this Xtma_Individual_Email_Result__c.
     * 
     * @return date_Unsubscribed__c
     */
    public java.util.Calendar getDate_Unsubscribed__c() {
        return date_Unsubscribed__c;
    }


    /**
     * Sets the date_Unsubscribed__c value for this Xtma_Individual_Email_Result__c.
     * 
     * @param date_Unsubscribed__c
     */
    public void setDate_Unsubscribed__c(java.util.Calendar date_Unsubscribed__c) {
        this.date_Unsubscribed__c = date_Unsubscribed__c;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Xtma_Individual_Email_Result__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Xtma_Individual_Email_Result__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the from_Address__c value for this Xtma_Individual_Email_Result__c.
     * 
     * @return from_Address__c
     */
    public java.lang.String getFrom_Address__c() {
        return from_Address__c;
    }


    /**
     * Sets the from_Address__c value for this Xtma_Individual_Email_Result__c.
     * 
     * @param from_Address__c
     */
    public void setFrom_Address__c(java.lang.String from_Address__c) {
        this.from_Address__c = from_Address__c;
    }


    /**
     * Gets the from_Name__c value for this Xtma_Individual_Email_Result__c.
     * 
     * @return from_Name__c
     */
    public java.lang.String getFrom_Name__c() {
        return from_Name__c;
    }


    /**
     * Sets the from_Name__c value for this Xtma_Individual_Email_Result__c.
     * 
     * @param from_Name__c
     */
    public void setFrom_Name__c(java.lang.String from_Name__c) {
        this.from_Name__c = from_Name__c;
    }


    /**
     * Gets the isDeleted value for this Xtma_Individual_Email_Result__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Xtma_Individual_Email_Result__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this Xtma_Individual_Email_Result__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Xtma_Individual_Email_Result__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Xtma_Individual_Email_Result__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Xtma_Individual_Email_Result__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Xtma_Individual_Email_Result__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Xtma_Individual_Email_Result__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lead__c value for this Xtma_Individual_Email_Result__c.
     * 
     * @return lead__c
     */
    public java.lang.String getLead__c() {
        return lead__c;
    }


    /**
     * Sets the lead__c value for this Xtma_Individual_Email_Result__c.
     * 
     * @param lead__c
     */
    public void setLead__c(java.lang.String lead__c) {
        this.lead__c = lead__c;
    }


    /**
     * Gets the lead__r value for this Xtma_Individual_Email_Result__c.
     * 
     * @return lead__r
     */
    public com.sforce.soap.enterprise.sobject.Lead getLead__r() {
        return lead__r;
    }


    /**
     * Sets the lead__r value for this Xtma_Individual_Email_Result__c.
     * 
     * @param lead__r
     */
    public void setLead__r(com.sforce.soap.enterprise.sobject.Lead lead__r) {
        this.lead__r = lead__r;
    }


    /**
     * Gets the name value for this Xtma_Individual_Email_Result__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Xtma_Individual_Email_Result__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Xtma_Individual_Email_Result__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Xtma_Individual_Email_Result__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Xtma_Individual_Email_Result__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Xtma_Individual_Email_Result__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the number_of_Total_Clicks__c value for this Xtma_Individual_Email_Result__c.
     * 
     * @return number_of_Total_Clicks__c
     */
    public java.lang.Double getNumber_of_Total_Clicks__c() {
        return number_of_Total_Clicks__c;
    }


    /**
     * Sets the number_of_Total_Clicks__c value for this Xtma_Individual_Email_Result__c.
     * 
     * @param number_of_Total_Clicks__c
     */
    public void setNumber_of_Total_Clicks__c(java.lang.Double number_of_Total_Clicks__c) {
        this.number_of_Total_Clicks__c = number_of_Total_Clicks__c;
    }


    /**
     * Gets the number_of_Unique_Clicks__c value for this Xtma_Individual_Email_Result__c.
     * 
     * @return number_of_Unique_Clicks__c
     */
    public java.lang.Double getNumber_of_Unique_Clicks__c() {
        return number_of_Unique_Clicks__c;
    }


    /**
     * Sets the number_of_Unique_Clicks__c value for this Xtma_Individual_Email_Result__c.
     * 
     * @param number_of_Unique_Clicks__c
     */
    public void setNumber_of_Unique_Clicks__c(java.lang.Double number_of_Unique_Clicks__c) {
        this.number_of_Unique_Clicks__c = number_of_Unique_Clicks__c;
    }


    /**
     * Gets the opened__c value for this Xtma_Individual_Email_Result__c.
     * 
     * @return opened__c
     */
    public java.lang.Boolean getOpened__c() {
        return opened__c;
    }


    /**
     * Sets the opened__c value for this Xtma_Individual_Email_Result__c.
     * 
     * @param opened__c
     */
    public void setOpened__c(java.lang.Boolean opened__c) {
        this.opened__c = opened__c;
    }


    /**
     * Gets the owner value for this Xtma_Individual_Email_Result__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Xtma_Individual_Email_Result__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Xtma_Individual_Email_Result__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Xtma_Individual_Email_Result__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this Xtma_Individual_Email_Result__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Xtma_Individual_Email_Result__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Xtma_Individual_Email_Result__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Xtma_Individual_Email_Result__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the report_Name__c value for this Xtma_Individual_Email_Result__c.
     * 
     * @return report_Name__c
     */
    public java.lang.String getReport_Name__c() {
        return report_Name__c;
    }


    /**
     * Sets the report_Name__c value for this Xtma_Individual_Email_Result__c.
     * 
     * @param report_Name__c
     */
    public void setReport_Name__c(java.lang.String report_Name__c) {
        this.report_Name__c = report_Name__c;
    }


    /**
     * Gets the subject_Line__c value for this Xtma_Individual_Email_Result__c.
     * 
     * @return subject_Line__c
     */
    public java.lang.String getSubject_Line__c() {
        return subject_Line__c;
    }


    /**
     * Sets the subject_Line__c value for this Xtma_Individual_Email_Result__c.
     * 
     * @param subject_Line__c
     */
    public void setSubject_Line__c(java.lang.String subject_Line__c) {
        this.subject_Line__c = subject_Line__c;
    }


    /**
     * Gets the systemModstamp value for this Xtma_Individual_Email_Result__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Xtma_Individual_Email_Result__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Xtma_Individual_Email_Result__c)) return false;
        Xtma_Individual_Email_Result__c other = (Xtma_Individual_Email_Result__c) obj;
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
            ((this.campaign__c==null && other.getCampaign__c()==null) || 
             (this.campaign__c!=null &&
              this.campaign__c.equals(other.getCampaign__c()))) &&
            ((this.campaign__r==null && other.getCampaign__r()==null) || 
             (this.campaign__r!=null &&
              this.campaign__r.equals(other.getCampaign__r()))) &&
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
            ((this.date_Bounced__c==null && other.getDate_Bounced__c()==null) || 
             (this.date_Bounced__c!=null &&
              this.date_Bounced__c.equals(other.getDate_Bounced__c()))) &&
            ((this.date_Time_Opened__c==null && other.getDate_Time_Opened__c()==null) || 
             (this.date_Time_Opened__c!=null &&
              this.date_Time_Opened__c.equals(other.getDate_Time_Opened__c()))) &&
            ((this.date_Time_Sent__c==null && other.getDate_Time_Sent__c()==null) || 
             (this.date_Time_Sent__c!=null &&
              this.date_Time_Sent__c.equals(other.getDate_Time_Sent__c()))) &&
            ((this.date_Unsubscribed__c==null && other.getDate_Unsubscribed__c()==null) || 
             (this.date_Unsubscribed__c!=null &&
              this.date_Unsubscribed__c.equals(other.getDate_Unsubscribed__c()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.from_Address__c==null && other.getFrom_Address__c()==null) || 
             (this.from_Address__c!=null &&
              this.from_Address__c.equals(other.getFrom_Address__c()))) &&
            ((this.from_Name__c==null && other.getFrom_Name__c()==null) || 
             (this.from_Name__c!=null &&
              this.from_Name__c.equals(other.getFrom_Name__c()))) &&
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
            ((this.lead__c==null && other.getLead__c()==null) || 
             (this.lead__c!=null &&
              this.lead__c.equals(other.getLead__c()))) &&
            ((this.lead__r==null && other.getLead__r()==null) || 
             (this.lead__r!=null &&
              this.lead__r.equals(other.getLead__r()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.number_of_Total_Clicks__c==null && other.getNumber_of_Total_Clicks__c()==null) || 
             (this.number_of_Total_Clicks__c!=null &&
              this.number_of_Total_Clicks__c.equals(other.getNumber_of_Total_Clicks__c()))) &&
            ((this.number_of_Unique_Clicks__c==null && other.getNumber_of_Unique_Clicks__c()==null) || 
             (this.number_of_Unique_Clicks__c!=null &&
              this.number_of_Unique_Clicks__c.equals(other.getNumber_of_Unique_Clicks__c()))) &&
            ((this.opened__c==null && other.getOpened__c()==null) || 
             (this.opened__c!=null &&
              this.opened__c.equals(other.getOpened__c()))) &&
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
            ((this.report_Name__c==null && other.getReport_Name__c()==null) || 
             (this.report_Name__c!=null &&
              this.report_Name__c.equals(other.getReport_Name__c()))) &&
            ((this.subject_Line__c==null && other.getSubject_Line__c()==null) || 
             (this.subject_Line__c!=null &&
              this.subject_Line__c.equals(other.getSubject_Line__c()))) &&
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
        if (getCampaign__c() != null) {
            _hashCode += getCampaign__c().hashCode();
        }
        if (getCampaign__r() != null) {
            _hashCode += getCampaign__r().hashCode();
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
        if (getDate_Bounced__c() != null) {
            _hashCode += getDate_Bounced__c().hashCode();
        }
        if (getDate_Time_Opened__c() != null) {
            _hashCode += getDate_Time_Opened__c().hashCode();
        }
        if (getDate_Time_Sent__c() != null) {
            _hashCode += getDate_Time_Sent__c().hashCode();
        }
        if (getDate_Unsubscribed__c() != null) {
            _hashCode += getDate_Unsubscribed__c().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getFrom_Address__c() != null) {
            _hashCode += getFrom_Address__c().hashCode();
        }
        if (getFrom_Name__c() != null) {
            _hashCode += getFrom_Name__c().hashCode();
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
        if (getLead__c() != null) {
            _hashCode += getLead__c().hashCode();
        }
        if (getLead__r() != null) {
            _hashCode += getLead__r().hashCode();
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
        if (getNumber_of_Total_Clicks__c() != null) {
            _hashCode += getNumber_of_Total_Clicks__c().hashCode();
        }
        if (getNumber_of_Unique_Clicks__c() != null) {
            _hashCode += getNumber_of_Unique_Clicks__c().hashCode();
        }
        if (getOpened__c() != null) {
            _hashCode += getOpened__c().hashCode();
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
        if (getReport_Name__c() != null) {
            _hashCode += getReport_Name__c().hashCode();
        }
        if (getSubject_Line__c() != null) {
            _hashCode += getSubject_Line__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Xtma_Individual_Email_Result__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "xtma_Individual_Email_Result__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaign__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Campaign__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaign__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Campaign__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Campaign"));
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
        elemField.setFieldName("date_Bounced__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Bounced__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_Time_Opened__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Time_Opened__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_Time_Sent__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Time_Sent__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_Unsubscribed__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Unsubscribed__c"));
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
        elemField.setFieldName("from_Address__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "From_Address__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("from_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "From_Name__c"));
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
        elemField.setFieldName("lead__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Lead__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lead__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Lead__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Lead"));
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
        elemField.setFieldName("number_of_Total_Clicks__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Number_of_Total_Clicks__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number_of_Unique_Clicks__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Number_of_Unique_Clicks__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opened__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Opened__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("report_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Report_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject_Line__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Subject_Line__c"));
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

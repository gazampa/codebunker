/**
 * Courier1__Recipient__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Courier1__Recipient__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String courier1__Contact_Name__c;

    private java.lang.String courier1__Contact__c;

    private com.sforce.soap.enterprise.sobject.Contact courier1__Contact__r;

    private java.lang.String courier1__Courier_Schedule__c;

    private com.sforce.soap.enterprise.sobject.Courier1__Courier_Schedule__c courier1__Courier_Schedule__r;

    private java.lang.String courier1__Group_Name__c;

    private java.lang.String courier1__Group__c;

    private java.lang.String courier1__Name__c;

    private java.lang.String courier1__Profile_Name__c;

    private java.lang.String courier1__Profile__c;

    private java.lang.String courier1__Report_Name__c;

    private java.lang.String courier1__Report__c;

    private java.lang.String courier1__Role_Name__c;

    private java.lang.String courier1__Role__c;

    private java.lang.String courier1__Type__c;

    private java.lang.String courier1__User_Name__c;

    private java.lang.String courier1__User__c;

    private com.sforce.soap.enterprise.sobject.User courier1__User__r;

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

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.util.Calendar systemModstamp;

    public Courier1__Recipient__c() {
    }

    public Courier1__Recipient__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String courier1__Contact_Name__c,
           java.lang.String courier1__Contact__c,
           com.sforce.soap.enterprise.sobject.Contact courier1__Contact__r,
           java.lang.String courier1__Courier_Schedule__c,
           com.sforce.soap.enterprise.sobject.Courier1__Courier_Schedule__c courier1__Courier_Schedule__r,
           java.lang.String courier1__Group_Name__c,
           java.lang.String courier1__Group__c,
           java.lang.String courier1__Name__c,
           java.lang.String courier1__Profile_Name__c,
           java.lang.String courier1__Profile__c,
           java.lang.String courier1__Report_Name__c,
           java.lang.String courier1__Report__c,
           java.lang.String courier1__Role_Name__c,
           java.lang.String courier1__Role__c,
           java.lang.String courier1__Type__c,
           java.lang.String courier1__User_Name__c,
           java.lang.String courier1__User__c,
           com.sforce.soap.enterprise.sobject.User courier1__User__r,
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
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.util.Calendar systemModstamp) {
        super(
            fieldsToNull,
            id);
        this.attachments = attachments;
        this.courier1__Contact_Name__c = courier1__Contact_Name__c;
        this.courier1__Contact__c = courier1__Contact__c;
        this.courier1__Contact__r = courier1__Contact__r;
        this.courier1__Courier_Schedule__c = courier1__Courier_Schedule__c;
        this.courier1__Courier_Schedule__r = courier1__Courier_Schedule__r;
        this.courier1__Group_Name__c = courier1__Group_Name__c;
        this.courier1__Group__c = courier1__Group__c;
        this.courier1__Name__c = courier1__Name__c;
        this.courier1__Profile_Name__c = courier1__Profile_Name__c;
        this.courier1__Profile__c = courier1__Profile__c;
        this.courier1__Report_Name__c = courier1__Report_Name__c;
        this.courier1__Report__c = courier1__Report__c;
        this.courier1__Role_Name__c = courier1__Role_Name__c;
        this.courier1__Role__c = courier1__Role__c;
        this.courier1__Type__c = courier1__Type__c;
        this.courier1__User_Name__c = courier1__User_Name__c;
        this.courier1__User__c = courier1__User__c;
        this.courier1__User__r = courier1__User__r;
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
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the attachments value for this Courier1__Recipient__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Courier1__Recipient__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the courier1__Contact_Name__c value for this Courier1__Recipient__c.
     * 
     * @return courier1__Contact_Name__c
     */
    public java.lang.String getCourier1__Contact_Name__c() {
        return courier1__Contact_Name__c;
    }


    /**
     * Sets the courier1__Contact_Name__c value for this Courier1__Recipient__c.
     * 
     * @param courier1__Contact_Name__c
     */
    public void setCourier1__Contact_Name__c(java.lang.String courier1__Contact_Name__c) {
        this.courier1__Contact_Name__c = courier1__Contact_Name__c;
    }


    /**
     * Gets the courier1__Contact__c value for this Courier1__Recipient__c.
     * 
     * @return courier1__Contact__c
     */
    public java.lang.String getCourier1__Contact__c() {
        return courier1__Contact__c;
    }


    /**
     * Sets the courier1__Contact__c value for this Courier1__Recipient__c.
     * 
     * @param courier1__Contact__c
     */
    public void setCourier1__Contact__c(java.lang.String courier1__Contact__c) {
        this.courier1__Contact__c = courier1__Contact__c;
    }


    /**
     * Gets the courier1__Contact__r value for this Courier1__Recipient__c.
     * 
     * @return courier1__Contact__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getCourier1__Contact__r() {
        return courier1__Contact__r;
    }


    /**
     * Sets the courier1__Contact__r value for this Courier1__Recipient__c.
     * 
     * @param courier1__Contact__r
     */
    public void setCourier1__Contact__r(com.sforce.soap.enterprise.sobject.Contact courier1__Contact__r) {
        this.courier1__Contact__r = courier1__Contact__r;
    }


    /**
     * Gets the courier1__Courier_Schedule__c value for this Courier1__Recipient__c.
     * 
     * @return courier1__Courier_Schedule__c
     */
    public java.lang.String getCourier1__Courier_Schedule__c() {
        return courier1__Courier_Schedule__c;
    }


    /**
     * Sets the courier1__Courier_Schedule__c value for this Courier1__Recipient__c.
     * 
     * @param courier1__Courier_Schedule__c
     */
    public void setCourier1__Courier_Schedule__c(java.lang.String courier1__Courier_Schedule__c) {
        this.courier1__Courier_Schedule__c = courier1__Courier_Schedule__c;
    }


    /**
     * Gets the courier1__Courier_Schedule__r value for this Courier1__Recipient__c.
     * 
     * @return courier1__Courier_Schedule__r
     */
    public com.sforce.soap.enterprise.sobject.Courier1__Courier_Schedule__c getCourier1__Courier_Schedule__r() {
        return courier1__Courier_Schedule__r;
    }


    /**
     * Sets the courier1__Courier_Schedule__r value for this Courier1__Recipient__c.
     * 
     * @param courier1__Courier_Schedule__r
     */
    public void setCourier1__Courier_Schedule__r(com.sforce.soap.enterprise.sobject.Courier1__Courier_Schedule__c courier1__Courier_Schedule__r) {
        this.courier1__Courier_Schedule__r = courier1__Courier_Schedule__r;
    }


    /**
     * Gets the courier1__Group_Name__c value for this Courier1__Recipient__c.
     * 
     * @return courier1__Group_Name__c
     */
    public java.lang.String getCourier1__Group_Name__c() {
        return courier1__Group_Name__c;
    }


    /**
     * Sets the courier1__Group_Name__c value for this Courier1__Recipient__c.
     * 
     * @param courier1__Group_Name__c
     */
    public void setCourier1__Group_Name__c(java.lang.String courier1__Group_Name__c) {
        this.courier1__Group_Name__c = courier1__Group_Name__c;
    }


    /**
     * Gets the courier1__Group__c value for this Courier1__Recipient__c.
     * 
     * @return courier1__Group__c
     */
    public java.lang.String getCourier1__Group__c() {
        return courier1__Group__c;
    }


    /**
     * Sets the courier1__Group__c value for this Courier1__Recipient__c.
     * 
     * @param courier1__Group__c
     */
    public void setCourier1__Group__c(java.lang.String courier1__Group__c) {
        this.courier1__Group__c = courier1__Group__c;
    }


    /**
     * Gets the courier1__Name__c value for this Courier1__Recipient__c.
     * 
     * @return courier1__Name__c
     */
    public java.lang.String getCourier1__Name__c() {
        return courier1__Name__c;
    }


    /**
     * Sets the courier1__Name__c value for this Courier1__Recipient__c.
     * 
     * @param courier1__Name__c
     */
    public void setCourier1__Name__c(java.lang.String courier1__Name__c) {
        this.courier1__Name__c = courier1__Name__c;
    }


    /**
     * Gets the courier1__Profile_Name__c value for this Courier1__Recipient__c.
     * 
     * @return courier1__Profile_Name__c
     */
    public java.lang.String getCourier1__Profile_Name__c() {
        return courier1__Profile_Name__c;
    }


    /**
     * Sets the courier1__Profile_Name__c value for this Courier1__Recipient__c.
     * 
     * @param courier1__Profile_Name__c
     */
    public void setCourier1__Profile_Name__c(java.lang.String courier1__Profile_Name__c) {
        this.courier1__Profile_Name__c = courier1__Profile_Name__c;
    }


    /**
     * Gets the courier1__Profile__c value for this Courier1__Recipient__c.
     * 
     * @return courier1__Profile__c
     */
    public java.lang.String getCourier1__Profile__c() {
        return courier1__Profile__c;
    }


    /**
     * Sets the courier1__Profile__c value for this Courier1__Recipient__c.
     * 
     * @param courier1__Profile__c
     */
    public void setCourier1__Profile__c(java.lang.String courier1__Profile__c) {
        this.courier1__Profile__c = courier1__Profile__c;
    }


    /**
     * Gets the courier1__Report_Name__c value for this Courier1__Recipient__c.
     * 
     * @return courier1__Report_Name__c
     */
    public java.lang.String getCourier1__Report_Name__c() {
        return courier1__Report_Name__c;
    }


    /**
     * Sets the courier1__Report_Name__c value for this Courier1__Recipient__c.
     * 
     * @param courier1__Report_Name__c
     */
    public void setCourier1__Report_Name__c(java.lang.String courier1__Report_Name__c) {
        this.courier1__Report_Name__c = courier1__Report_Name__c;
    }


    /**
     * Gets the courier1__Report__c value for this Courier1__Recipient__c.
     * 
     * @return courier1__Report__c
     */
    public java.lang.String getCourier1__Report__c() {
        return courier1__Report__c;
    }


    /**
     * Sets the courier1__Report__c value for this Courier1__Recipient__c.
     * 
     * @param courier1__Report__c
     */
    public void setCourier1__Report__c(java.lang.String courier1__Report__c) {
        this.courier1__Report__c = courier1__Report__c;
    }


    /**
     * Gets the courier1__Role_Name__c value for this Courier1__Recipient__c.
     * 
     * @return courier1__Role_Name__c
     */
    public java.lang.String getCourier1__Role_Name__c() {
        return courier1__Role_Name__c;
    }


    /**
     * Sets the courier1__Role_Name__c value for this Courier1__Recipient__c.
     * 
     * @param courier1__Role_Name__c
     */
    public void setCourier1__Role_Name__c(java.lang.String courier1__Role_Name__c) {
        this.courier1__Role_Name__c = courier1__Role_Name__c;
    }


    /**
     * Gets the courier1__Role__c value for this Courier1__Recipient__c.
     * 
     * @return courier1__Role__c
     */
    public java.lang.String getCourier1__Role__c() {
        return courier1__Role__c;
    }


    /**
     * Sets the courier1__Role__c value for this Courier1__Recipient__c.
     * 
     * @param courier1__Role__c
     */
    public void setCourier1__Role__c(java.lang.String courier1__Role__c) {
        this.courier1__Role__c = courier1__Role__c;
    }


    /**
     * Gets the courier1__Type__c value for this Courier1__Recipient__c.
     * 
     * @return courier1__Type__c
     */
    public java.lang.String getCourier1__Type__c() {
        return courier1__Type__c;
    }


    /**
     * Sets the courier1__Type__c value for this Courier1__Recipient__c.
     * 
     * @param courier1__Type__c
     */
    public void setCourier1__Type__c(java.lang.String courier1__Type__c) {
        this.courier1__Type__c = courier1__Type__c;
    }


    /**
     * Gets the courier1__User_Name__c value for this Courier1__Recipient__c.
     * 
     * @return courier1__User_Name__c
     */
    public java.lang.String getCourier1__User_Name__c() {
        return courier1__User_Name__c;
    }


    /**
     * Sets the courier1__User_Name__c value for this Courier1__Recipient__c.
     * 
     * @param courier1__User_Name__c
     */
    public void setCourier1__User_Name__c(java.lang.String courier1__User_Name__c) {
        this.courier1__User_Name__c = courier1__User_Name__c;
    }


    /**
     * Gets the courier1__User__c value for this Courier1__Recipient__c.
     * 
     * @return courier1__User__c
     */
    public java.lang.String getCourier1__User__c() {
        return courier1__User__c;
    }


    /**
     * Sets the courier1__User__c value for this Courier1__Recipient__c.
     * 
     * @param courier1__User__c
     */
    public void setCourier1__User__c(java.lang.String courier1__User__c) {
        this.courier1__User__c = courier1__User__c;
    }


    /**
     * Gets the courier1__User__r value for this Courier1__Recipient__c.
     * 
     * @return courier1__User__r
     */
    public com.sforce.soap.enterprise.sobject.User getCourier1__User__r() {
        return courier1__User__r;
    }


    /**
     * Sets the courier1__User__r value for this Courier1__Recipient__c.
     * 
     * @param courier1__User__r
     */
    public void setCourier1__User__r(com.sforce.soap.enterprise.sobject.User courier1__User__r) {
        this.courier1__User__r = courier1__User__r;
    }


    /**
     * Gets the createdBy value for this Courier1__Recipient__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Courier1__Recipient__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Courier1__Recipient__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Courier1__Recipient__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Courier1__Recipient__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Courier1__Recipient__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Courier1__Recipient__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Courier1__Recipient__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the isDeleted value for this Courier1__Recipient__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Courier1__Recipient__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this Courier1__Recipient__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Courier1__Recipient__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Courier1__Recipient__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Courier1__Recipient__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Courier1__Recipient__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Courier1__Recipient__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this Courier1__Recipient__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Courier1__Recipient__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Courier1__Recipient__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Courier1__Recipient__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Courier1__Recipient__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Courier1__Recipient__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the processInstances value for this Courier1__Recipient__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Courier1__Recipient__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Courier1__Recipient__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Courier1__Recipient__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the systemModstamp value for this Courier1__Recipient__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Courier1__Recipient__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Courier1__Recipient__c)) return false;
        Courier1__Recipient__c other = (Courier1__Recipient__c) obj;
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
            ((this.courier1__Contact_Name__c==null && other.getCourier1__Contact_Name__c()==null) || 
             (this.courier1__Contact_Name__c!=null &&
              this.courier1__Contact_Name__c.equals(other.getCourier1__Contact_Name__c()))) &&
            ((this.courier1__Contact__c==null && other.getCourier1__Contact__c()==null) || 
             (this.courier1__Contact__c!=null &&
              this.courier1__Contact__c.equals(other.getCourier1__Contact__c()))) &&
            ((this.courier1__Contact__r==null && other.getCourier1__Contact__r()==null) || 
             (this.courier1__Contact__r!=null &&
              this.courier1__Contact__r.equals(other.getCourier1__Contact__r()))) &&
            ((this.courier1__Courier_Schedule__c==null && other.getCourier1__Courier_Schedule__c()==null) || 
             (this.courier1__Courier_Schedule__c!=null &&
              this.courier1__Courier_Schedule__c.equals(other.getCourier1__Courier_Schedule__c()))) &&
            ((this.courier1__Courier_Schedule__r==null && other.getCourier1__Courier_Schedule__r()==null) || 
             (this.courier1__Courier_Schedule__r!=null &&
              this.courier1__Courier_Schedule__r.equals(other.getCourier1__Courier_Schedule__r()))) &&
            ((this.courier1__Group_Name__c==null && other.getCourier1__Group_Name__c()==null) || 
             (this.courier1__Group_Name__c!=null &&
              this.courier1__Group_Name__c.equals(other.getCourier1__Group_Name__c()))) &&
            ((this.courier1__Group__c==null && other.getCourier1__Group__c()==null) || 
             (this.courier1__Group__c!=null &&
              this.courier1__Group__c.equals(other.getCourier1__Group__c()))) &&
            ((this.courier1__Name__c==null && other.getCourier1__Name__c()==null) || 
             (this.courier1__Name__c!=null &&
              this.courier1__Name__c.equals(other.getCourier1__Name__c()))) &&
            ((this.courier1__Profile_Name__c==null && other.getCourier1__Profile_Name__c()==null) || 
             (this.courier1__Profile_Name__c!=null &&
              this.courier1__Profile_Name__c.equals(other.getCourier1__Profile_Name__c()))) &&
            ((this.courier1__Profile__c==null && other.getCourier1__Profile__c()==null) || 
             (this.courier1__Profile__c!=null &&
              this.courier1__Profile__c.equals(other.getCourier1__Profile__c()))) &&
            ((this.courier1__Report_Name__c==null && other.getCourier1__Report_Name__c()==null) || 
             (this.courier1__Report_Name__c!=null &&
              this.courier1__Report_Name__c.equals(other.getCourier1__Report_Name__c()))) &&
            ((this.courier1__Report__c==null && other.getCourier1__Report__c()==null) || 
             (this.courier1__Report__c!=null &&
              this.courier1__Report__c.equals(other.getCourier1__Report__c()))) &&
            ((this.courier1__Role_Name__c==null && other.getCourier1__Role_Name__c()==null) || 
             (this.courier1__Role_Name__c!=null &&
              this.courier1__Role_Name__c.equals(other.getCourier1__Role_Name__c()))) &&
            ((this.courier1__Role__c==null && other.getCourier1__Role__c()==null) || 
             (this.courier1__Role__c!=null &&
              this.courier1__Role__c.equals(other.getCourier1__Role__c()))) &&
            ((this.courier1__Type__c==null && other.getCourier1__Type__c()==null) || 
             (this.courier1__Type__c!=null &&
              this.courier1__Type__c.equals(other.getCourier1__Type__c()))) &&
            ((this.courier1__User_Name__c==null && other.getCourier1__User_Name__c()==null) || 
             (this.courier1__User_Name__c!=null &&
              this.courier1__User_Name__c.equals(other.getCourier1__User_Name__c()))) &&
            ((this.courier1__User__c==null && other.getCourier1__User__c()==null) || 
             (this.courier1__User__c!=null &&
              this.courier1__User__c.equals(other.getCourier1__User__c()))) &&
            ((this.courier1__User__r==null && other.getCourier1__User__r()==null) || 
             (this.courier1__User__r!=null &&
              this.courier1__User__r.equals(other.getCourier1__User__r()))) &&
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
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
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
        if (getCourier1__Contact_Name__c() != null) {
            _hashCode += getCourier1__Contact_Name__c().hashCode();
        }
        if (getCourier1__Contact__c() != null) {
            _hashCode += getCourier1__Contact__c().hashCode();
        }
        if (getCourier1__Contact__r() != null) {
            _hashCode += getCourier1__Contact__r().hashCode();
        }
        if (getCourier1__Courier_Schedule__c() != null) {
            _hashCode += getCourier1__Courier_Schedule__c().hashCode();
        }
        if (getCourier1__Courier_Schedule__r() != null) {
            _hashCode += getCourier1__Courier_Schedule__r().hashCode();
        }
        if (getCourier1__Group_Name__c() != null) {
            _hashCode += getCourier1__Group_Name__c().hashCode();
        }
        if (getCourier1__Group__c() != null) {
            _hashCode += getCourier1__Group__c().hashCode();
        }
        if (getCourier1__Name__c() != null) {
            _hashCode += getCourier1__Name__c().hashCode();
        }
        if (getCourier1__Profile_Name__c() != null) {
            _hashCode += getCourier1__Profile_Name__c().hashCode();
        }
        if (getCourier1__Profile__c() != null) {
            _hashCode += getCourier1__Profile__c().hashCode();
        }
        if (getCourier1__Report_Name__c() != null) {
            _hashCode += getCourier1__Report_Name__c().hashCode();
        }
        if (getCourier1__Report__c() != null) {
            _hashCode += getCourier1__Report__c().hashCode();
        }
        if (getCourier1__Role_Name__c() != null) {
            _hashCode += getCourier1__Role_Name__c().hashCode();
        }
        if (getCourier1__Role__c() != null) {
            _hashCode += getCourier1__Role__c().hashCode();
        }
        if (getCourier1__Type__c() != null) {
            _hashCode += getCourier1__Type__c().hashCode();
        }
        if (getCourier1__User_Name__c() != null) {
            _hashCode += getCourier1__User_Name__c().hashCode();
        }
        if (getCourier1__User__c() != null) {
            _hashCode += getCourier1__User__c().hashCode();
        }
        if (getCourier1__User__r() != null) {
            _hashCode += getCourier1__User__r().hashCode();
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
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Courier1__Recipient__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Recipient__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Contact_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Contact_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Contact__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Contact__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Courier_Schedule__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Courier_Schedule__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Courier_Schedule__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Courier_Schedule__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Courier_Schedule__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Group_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Group_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Group__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Group__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Profile_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Profile_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Profile__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Profile__c"));
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
        elemField.setFieldName("courier1__Report__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Report__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Role_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Role_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Role__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Role__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__User_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__User_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__User__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__User__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__User__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__User__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
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

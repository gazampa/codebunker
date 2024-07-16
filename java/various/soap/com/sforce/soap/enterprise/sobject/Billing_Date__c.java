/**
 * Billing_Date__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Billing_Date__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String account_Name__c;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.Double bill_Amount__c;

    private java.lang.String contract_Year__c;

    private java.lang.String contract__c;

    private com.sforce.soap.enterprise.sobject.Contract contract__r;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.util.Date GAAP_End_Date__c;

    private java.util.Date GAAP_Start_Date__c;

    private java.util.Date invoice_Date__c;

    private java.lang.String invoice_Number__c;

    private java.lang.Boolean invoice_Sent__c;

    private java.lang.Boolean isDeleted;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private java.lang.String notes__c;

    private java.lang.Double number_of_Users_GBs__c;

    private java.lang.String payment_Category__c;

    private java.lang.String payment_Type__c;

    private java.lang.Boolean post_Contract_End_Date__c;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.util.Calendar systemModstamp;

    public Billing_Date__c() {
    }

    public Billing_Date__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String account_Name__c,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.Double bill_Amount__c,
           java.lang.String contract_Year__c,
           java.lang.String contract__c,
           com.sforce.soap.enterprise.sobject.Contract contract__r,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.util.Date GAAP_End_Date__c,
           java.util.Date GAAP_Start_Date__c,
           java.util.Date invoice_Date__c,
           java.lang.String invoice_Number__c,
           java.lang.Boolean invoice_Sent__c,
           java.lang.Boolean isDeleted,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           java.lang.String notes__c,
           java.lang.Double number_of_Users_GBs__c,
           java.lang.String payment_Category__c,
           java.lang.String payment_Type__c,
           java.lang.Boolean post_Contract_End_Date__c,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.util.Calendar systemModstamp) {
        super(
            fieldsToNull,
            id);
        this.account_Name__c = account_Name__c;
        this.attachments = attachments;
        this.bill_Amount__c = bill_Amount__c;
        this.contract_Year__c = contract_Year__c;
        this.contract__c = contract__c;
        this.contract__r = contract__r;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.GAAP_End_Date__c = GAAP_End_Date__c;
        this.GAAP_Start_Date__c = GAAP_Start_Date__c;
        this.invoice_Date__c = invoice_Date__c;
        this.invoice_Number__c = invoice_Number__c;
        this.invoice_Sent__c = invoice_Sent__c;
        this.isDeleted = isDeleted;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.notes__c = notes__c;
        this.number_of_Users_GBs__c = number_of_Users_GBs__c;
        this.payment_Category__c = payment_Category__c;
        this.payment_Type__c = payment_Type__c;
        this.post_Contract_End_Date__c = post_Contract_End_Date__c;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the account_Name__c value for this Billing_Date__c.
     * 
     * @return account_Name__c
     */
    public java.lang.String getAccount_Name__c() {
        return account_Name__c;
    }


    /**
     * Sets the account_Name__c value for this Billing_Date__c.
     * 
     * @param account_Name__c
     */
    public void setAccount_Name__c(java.lang.String account_Name__c) {
        this.account_Name__c = account_Name__c;
    }


    /**
     * Gets the attachments value for this Billing_Date__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Billing_Date__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the bill_Amount__c value for this Billing_Date__c.
     * 
     * @return bill_Amount__c
     */
    public java.lang.Double getBill_Amount__c() {
        return bill_Amount__c;
    }


    /**
     * Sets the bill_Amount__c value for this Billing_Date__c.
     * 
     * @param bill_Amount__c
     */
    public void setBill_Amount__c(java.lang.Double bill_Amount__c) {
        this.bill_Amount__c = bill_Amount__c;
    }


    /**
     * Gets the contract_Year__c value for this Billing_Date__c.
     * 
     * @return contract_Year__c
     */
    public java.lang.String getContract_Year__c() {
        return contract_Year__c;
    }


    /**
     * Sets the contract_Year__c value for this Billing_Date__c.
     * 
     * @param contract_Year__c
     */
    public void setContract_Year__c(java.lang.String contract_Year__c) {
        this.contract_Year__c = contract_Year__c;
    }


    /**
     * Gets the contract__c value for this Billing_Date__c.
     * 
     * @return contract__c
     */
    public java.lang.String getContract__c() {
        return contract__c;
    }


    /**
     * Sets the contract__c value for this Billing_Date__c.
     * 
     * @param contract__c
     */
    public void setContract__c(java.lang.String contract__c) {
        this.contract__c = contract__c;
    }


    /**
     * Gets the contract__r value for this Billing_Date__c.
     * 
     * @return contract__r
     */
    public com.sforce.soap.enterprise.sobject.Contract getContract__r() {
        return contract__r;
    }


    /**
     * Sets the contract__r value for this Billing_Date__c.
     * 
     * @param contract__r
     */
    public void setContract__r(com.sforce.soap.enterprise.sobject.Contract contract__r) {
        this.contract__r = contract__r;
    }


    /**
     * Gets the createdBy value for this Billing_Date__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Billing_Date__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Billing_Date__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Billing_Date__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Billing_Date__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Billing_Date__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Billing_Date__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Billing_Date__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the GAAP_End_Date__c value for this Billing_Date__c.
     * 
     * @return GAAP_End_Date__c
     */
    public java.util.Date getGAAP_End_Date__c() {
        return GAAP_End_Date__c;
    }


    /**
     * Sets the GAAP_End_Date__c value for this Billing_Date__c.
     * 
     * @param GAAP_End_Date__c
     */
    public void setGAAP_End_Date__c(java.util.Date GAAP_End_Date__c) {
        this.GAAP_End_Date__c = GAAP_End_Date__c;
    }


    /**
     * Gets the GAAP_Start_Date__c value for this Billing_Date__c.
     * 
     * @return GAAP_Start_Date__c
     */
    public java.util.Date getGAAP_Start_Date__c() {
        return GAAP_Start_Date__c;
    }


    /**
     * Sets the GAAP_Start_Date__c value for this Billing_Date__c.
     * 
     * @param GAAP_Start_Date__c
     */
    public void setGAAP_Start_Date__c(java.util.Date GAAP_Start_Date__c) {
        this.GAAP_Start_Date__c = GAAP_Start_Date__c;
    }


    /**
     * Gets the invoice_Date__c value for this Billing_Date__c.
     * 
     * @return invoice_Date__c
     */
    public java.util.Date getInvoice_Date__c() {
        return invoice_Date__c;
    }


    /**
     * Sets the invoice_Date__c value for this Billing_Date__c.
     * 
     * @param invoice_Date__c
     */
    public void setInvoice_Date__c(java.util.Date invoice_Date__c) {
        this.invoice_Date__c = invoice_Date__c;
    }


    /**
     * Gets the invoice_Number__c value for this Billing_Date__c.
     * 
     * @return invoice_Number__c
     */
    public java.lang.String getInvoice_Number__c() {
        return invoice_Number__c;
    }


    /**
     * Sets the invoice_Number__c value for this Billing_Date__c.
     * 
     * @param invoice_Number__c
     */
    public void setInvoice_Number__c(java.lang.String invoice_Number__c) {
        this.invoice_Number__c = invoice_Number__c;
    }


    /**
     * Gets the invoice_Sent__c value for this Billing_Date__c.
     * 
     * @return invoice_Sent__c
     */
    public java.lang.Boolean getInvoice_Sent__c() {
        return invoice_Sent__c;
    }


    /**
     * Sets the invoice_Sent__c value for this Billing_Date__c.
     * 
     * @param invoice_Sent__c
     */
    public void setInvoice_Sent__c(java.lang.Boolean invoice_Sent__c) {
        this.invoice_Sent__c = invoice_Sent__c;
    }


    /**
     * Gets the isDeleted value for this Billing_Date__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Billing_Date__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this Billing_Date__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Billing_Date__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Billing_Date__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Billing_Date__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Billing_Date__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Billing_Date__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this Billing_Date__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Billing_Date__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Billing_Date__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Billing_Date__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Billing_Date__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Billing_Date__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the notes__c value for this Billing_Date__c.
     * 
     * @return notes__c
     */
    public java.lang.String getNotes__c() {
        return notes__c;
    }


    /**
     * Sets the notes__c value for this Billing_Date__c.
     * 
     * @param notes__c
     */
    public void setNotes__c(java.lang.String notes__c) {
        this.notes__c = notes__c;
    }


    /**
     * Gets the number_of_Users_GBs__c value for this Billing_Date__c.
     * 
     * @return number_of_Users_GBs__c
     */
    public java.lang.Double getNumber_of_Users_GBs__c() {
        return number_of_Users_GBs__c;
    }


    /**
     * Sets the number_of_Users_GBs__c value for this Billing_Date__c.
     * 
     * @param number_of_Users_GBs__c
     */
    public void setNumber_of_Users_GBs__c(java.lang.Double number_of_Users_GBs__c) {
        this.number_of_Users_GBs__c = number_of_Users_GBs__c;
    }


    /**
     * Gets the payment_Category__c value for this Billing_Date__c.
     * 
     * @return payment_Category__c
     */
    public java.lang.String getPayment_Category__c() {
        return payment_Category__c;
    }


    /**
     * Sets the payment_Category__c value for this Billing_Date__c.
     * 
     * @param payment_Category__c
     */
    public void setPayment_Category__c(java.lang.String payment_Category__c) {
        this.payment_Category__c = payment_Category__c;
    }


    /**
     * Gets the payment_Type__c value for this Billing_Date__c.
     * 
     * @return payment_Type__c
     */
    public java.lang.String getPayment_Type__c() {
        return payment_Type__c;
    }


    /**
     * Sets the payment_Type__c value for this Billing_Date__c.
     * 
     * @param payment_Type__c
     */
    public void setPayment_Type__c(java.lang.String payment_Type__c) {
        this.payment_Type__c = payment_Type__c;
    }


    /**
     * Gets the post_Contract_End_Date__c value for this Billing_Date__c.
     * 
     * @return post_Contract_End_Date__c
     */
    public java.lang.Boolean getPost_Contract_End_Date__c() {
        return post_Contract_End_Date__c;
    }


    /**
     * Sets the post_Contract_End_Date__c value for this Billing_Date__c.
     * 
     * @param post_Contract_End_Date__c
     */
    public void setPost_Contract_End_Date__c(java.lang.Boolean post_Contract_End_Date__c) {
        this.post_Contract_End_Date__c = post_Contract_End_Date__c;
    }


    /**
     * Gets the processInstances value for this Billing_Date__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Billing_Date__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Billing_Date__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Billing_Date__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the systemModstamp value for this Billing_Date__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Billing_Date__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Billing_Date__c)) return false;
        Billing_Date__c other = (Billing_Date__c) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.account_Name__c==null && other.getAccount_Name__c()==null) || 
             (this.account_Name__c!=null &&
              this.account_Name__c.equals(other.getAccount_Name__c()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.bill_Amount__c==null && other.getBill_Amount__c()==null) || 
             (this.bill_Amount__c!=null &&
              this.bill_Amount__c.equals(other.getBill_Amount__c()))) &&
            ((this.contract_Year__c==null && other.getContract_Year__c()==null) || 
             (this.contract_Year__c!=null &&
              this.contract_Year__c.equals(other.getContract_Year__c()))) &&
            ((this.contract__c==null && other.getContract__c()==null) || 
             (this.contract__c!=null &&
              this.contract__c.equals(other.getContract__c()))) &&
            ((this.contract__r==null && other.getContract__r()==null) || 
             (this.contract__r!=null &&
              this.contract__r.equals(other.getContract__r()))) &&
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
            ((this.GAAP_End_Date__c==null && other.getGAAP_End_Date__c()==null) || 
             (this.GAAP_End_Date__c!=null &&
              this.GAAP_End_Date__c.equals(other.getGAAP_End_Date__c()))) &&
            ((this.GAAP_Start_Date__c==null && other.getGAAP_Start_Date__c()==null) || 
             (this.GAAP_Start_Date__c!=null &&
              this.GAAP_Start_Date__c.equals(other.getGAAP_Start_Date__c()))) &&
            ((this.invoice_Date__c==null && other.getInvoice_Date__c()==null) || 
             (this.invoice_Date__c!=null &&
              this.invoice_Date__c.equals(other.getInvoice_Date__c()))) &&
            ((this.invoice_Number__c==null && other.getInvoice_Number__c()==null) || 
             (this.invoice_Number__c!=null &&
              this.invoice_Number__c.equals(other.getInvoice_Number__c()))) &&
            ((this.invoice_Sent__c==null && other.getInvoice_Sent__c()==null) || 
             (this.invoice_Sent__c!=null &&
              this.invoice_Sent__c.equals(other.getInvoice_Sent__c()))) &&
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
            ((this.notes__c==null && other.getNotes__c()==null) || 
             (this.notes__c!=null &&
              this.notes__c.equals(other.getNotes__c()))) &&
            ((this.number_of_Users_GBs__c==null && other.getNumber_of_Users_GBs__c()==null) || 
             (this.number_of_Users_GBs__c!=null &&
              this.number_of_Users_GBs__c.equals(other.getNumber_of_Users_GBs__c()))) &&
            ((this.payment_Category__c==null && other.getPayment_Category__c()==null) || 
             (this.payment_Category__c!=null &&
              this.payment_Category__c.equals(other.getPayment_Category__c()))) &&
            ((this.payment_Type__c==null && other.getPayment_Type__c()==null) || 
             (this.payment_Type__c!=null &&
              this.payment_Type__c.equals(other.getPayment_Type__c()))) &&
            ((this.post_Contract_End_Date__c==null && other.getPost_Contract_End_Date__c()==null) || 
             (this.post_Contract_End_Date__c!=null &&
              this.post_Contract_End_Date__c.equals(other.getPost_Contract_End_Date__c()))) &&
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
        if (getAccount_Name__c() != null) {
            _hashCode += getAccount_Name__c().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getBill_Amount__c() != null) {
            _hashCode += getBill_Amount__c().hashCode();
        }
        if (getContract_Year__c() != null) {
            _hashCode += getContract_Year__c().hashCode();
        }
        if (getContract__c() != null) {
            _hashCode += getContract__c().hashCode();
        }
        if (getContract__r() != null) {
            _hashCode += getContract__r().hashCode();
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
        if (getGAAP_End_Date__c() != null) {
            _hashCode += getGAAP_End_Date__c().hashCode();
        }
        if (getGAAP_Start_Date__c() != null) {
            _hashCode += getGAAP_Start_Date__c().hashCode();
        }
        if (getInvoice_Date__c() != null) {
            _hashCode += getInvoice_Date__c().hashCode();
        }
        if (getInvoice_Number__c() != null) {
            _hashCode += getInvoice_Number__c().hashCode();
        }
        if (getInvoice_Sent__c() != null) {
            _hashCode += getInvoice_Sent__c().hashCode();
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
        if (getNotes__c() != null) {
            _hashCode += getNotes__c().hashCode();
        }
        if (getNumber_of_Users_GBs__c() != null) {
            _hashCode += getNumber_of_Users_GBs__c().hashCode();
        }
        if (getPayment_Category__c() != null) {
            _hashCode += getPayment_Category__c().hashCode();
        }
        if (getPayment_Type__c() != null) {
            _hashCode += getPayment_Type__c().hashCode();
        }
        if (getPost_Contract_End_Date__c() != null) {
            _hashCode += getPost_Contract_End_Date__c().hashCode();
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
        new org.apache.axis.description.TypeDesc(Billing_Date__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Billing_Date__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account_Name__c"));
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
        elemField.setFieldName("bill_Amount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Bill_Amount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contract_Year__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contract_Year__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contract__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contract__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contract__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contract__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contract"));
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
        elemField.setFieldName("GAAP_End_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "GAAP_End_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GAAP_Start_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "GAAP_Start_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoice_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Invoice_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("invoice_Sent__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Invoice_Sent__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("notes__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Notes__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number_of_Users_GBs__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Number_of_Users_GBs__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment_Category__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Payment_Category__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Payment_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("post_Contract_End_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Post_Contract_End_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

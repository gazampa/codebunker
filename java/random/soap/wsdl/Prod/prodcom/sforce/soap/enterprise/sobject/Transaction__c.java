/**
 * Transaction__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Transaction__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String account_Owner__c;

    private com.sforce.soap.enterprise.sobject.User account_Owner__r;

    private java.lang.String account__c;

    private com.sforce.soap.enterprise.sobject.Account account__r;

    private java.lang.Boolean approval_Override__c;

    private java.lang.Boolean approved__c;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.Double balance_Due__c;

    private java.lang.String billTo__c;

    private java.util.Date bill_Date__c;

    private java.lang.String case_Status__c;

    private java.lang.String class__c;

    private java.lang.String contract_Name__c;

    private java.lang.String contract_Notes__c;

    private java.lang.String contract__c;

    private com.sforce.soap.enterprise.sobject.Contract contract__r;

    private java.lang.Double contracted_Users__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.String INV_Number__c;

    private java.lang.String invoice_Contacts__c;

    private java.lang.Boolean isDeleted;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private java.lang.String notes__c;

    private java.lang.Double payments_Credits__c;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.String project__c;

    private java.lang.String RA_Contract_Type__c;

    private java.lang.String relativity_Case__c;

    private com.sforce.soap.enterprise.sobject.Relativity_Case__c relativity_Case__r;

    private java.lang.String status__c;

    private java.util.Calendar systemModstamp;

    private java.lang.String terms__c;

    private java.lang.Double total_Analytics__c;

    private java.lang.Double total_Cases__c;

    private java.lang.Double total_Paid_Users__c;

    private java.lang.Double total_RA_GBs_Remaining__c;

    private java.lang.Double total__c;

    private com.sforce.soap.enterprise.QueryResult transaction_Instances__r;

    private com.sforce.soap.enterprise.QueryResult transaction_Line_Items__r;

    private java.lang.String transaction_Type__c;

    private com.sforce.soap.enterprise.QueryResult transaction__r;

    private java.lang.Double unique_Named_Users__c;

    private java.lang.Double unique_User_Count__c;

    private com.sforce.soap.enterprise.QueryResult unique_Users__r;

    private java.lang.String year_Month__c;

    public Transaction__c() {
    }

    public Transaction__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String account_Owner__c,
           com.sforce.soap.enterprise.sobject.User account_Owner__r,
           java.lang.String account__c,
           com.sforce.soap.enterprise.sobject.Account account__r,
           java.lang.Boolean approval_Override__c,
           java.lang.Boolean approved__c,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.Double balance_Due__c,
           java.lang.String billTo__c,
           java.util.Date bill_Date__c,
           java.lang.String case_Status__c,
           java.lang.String class__c,
           java.lang.String contract_Name__c,
           java.lang.String contract_Notes__c,
           java.lang.String contract__c,
           com.sforce.soap.enterprise.sobject.Contract contract__r,
           java.lang.Double contracted_Users__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.String INV_Number__c,
           java.lang.String invoice_Contacts__c,
           java.lang.Boolean isDeleted,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           java.lang.String notes__c,
           java.lang.Double payments_Credits__c,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.String project__c,
           java.lang.String RA_Contract_Type__c,
           java.lang.String relativity_Case__c,
           com.sforce.soap.enterprise.sobject.Relativity_Case__c relativity_Case__r,
           java.lang.String status__c,
           java.util.Calendar systemModstamp,
           java.lang.String terms__c,
           java.lang.Double total_Analytics__c,
           java.lang.Double total_Cases__c,
           java.lang.Double total_Paid_Users__c,
           java.lang.Double total_RA_GBs_Remaining__c,
           java.lang.Double total__c,
           com.sforce.soap.enterprise.QueryResult transaction_Instances__r,
           com.sforce.soap.enterprise.QueryResult transaction_Line_Items__r,
           java.lang.String transaction_Type__c,
           com.sforce.soap.enterprise.QueryResult transaction__r,
           java.lang.Double unique_Named_Users__c,
           java.lang.Double unique_User_Count__c,
           com.sforce.soap.enterprise.QueryResult unique_Users__r,
           java.lang.String year_Month__c) {
        super(
            fieldsToNull,
            id);
        this.account_Owner__c = account_Owner__c;
        this.account_Owner__r = account_Owner__r;
        this.account__c = account__c;
        this.account__r = account__r;
        this.approval_Override__c = approval_Override__c;
        this.approved__c = approved__c;
        this.attachments = attachments;
        this.balance_Due__c = balance_Due__c;
        this.billTo__c = billTo__c;
        this.bill_Date__c = bill_Date__c;
        this.case_Status__c = case_Status__c;
        this.class__c = class__c;
        this.contract_Name__c = contract_Name__c;
        this.contract_Notes__c = contract_Notes__c;
        this.contract__c = contract__c;
        this.contract__r = contract__r;
        this.contracted_Users__c = contracted_Users__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.histories = histories;
        this.INV_Number__c = INV_Number__c;
        this.invoice_Contacts__c = invoice_Contacts__c;
        this.isDeleted = isDeleted;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.notes__c = notes__c;
        this.payments_Credits__c = payments_Credits__c;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.project__c = project__c;
        this.RA_Contract_Type__c = RA_Contract_Type__c;
        this.relativity_Case__c = relativity_Case__c;
        this.relativity_Case__r = relativity_Case__r;
        this.status__c = status__c;
        this.systemModstamp = systemModstamp;
        this.terms__c = terms__c;
        this.total_Analytics__c = total_Analytics__c;
        this.total_Cases__c = total_Cases__c;
        this.total_Paid_Users__c = total_Paid_Users__c;
        this.total_RA_GBs_Remaining__c = total_RA_GBs_Remaining__c;
        this.total__c = total__c;
        this.transaction_Instances__r = transaction_Instances__r;
        this.transaction_Line_Items__r = transaction_Line_Items__r;
        this.transaction_Type__c = transaction_Type__c;
        this.transaction__r = transaction__r;
        this.unique_Named_Users__c = unique_Named_Users__c;
        this.unique_User_Count__c = unique_User_Count__c;
        this.unique_Users__r = unique_Users__r;
        this.year_Month__c = year_Month__c;
    }


    /**
     * Gets the account_Owner__c value for this Transaction__c.
     * 
     * @return account_Owner__c
     */
    public java.lang.String getAccount_Owner__c() {
        return account_Owner__c;
    }


    /**
     * Sets the account_Owner__c value for this Transaction__c.
     * 
     * @param account_Owner__c
     */
    public void setAccount_Owner__c(java.lang.String account_Owner__c) {
        this.account_Owner__c = account_Owner__c;
    }


    /**
     * Gets the account_Owner__r value for this Transaction__c.
     * 
     * @return account_Owner__r
     */
    public com.sforce.soap.enterprise.sobject.User getAccount_Owner__r() {
        return account_Owner__r;
    }


    /**
     * Sets the account_Owner__r value for this Transaction__c.
     * 
     * @param account_Owner__r
     */
    public void setAccount_Owner__r(com.sforce.soap.enterprise.sobject.User account_Owner__r) {
        this.account_Owner__r = account_Owner__r;
    }


    /**
     * Gets the account__c value for this Transaction__c.
     * 
     * @return account__c
     */
    public java.lang.String getAccount__c() {
        return account__c;
    }


    /**
     * Sets the account__c value for this Transaction__c.
     * 
     * @param account__c
     */
    public void setAccount__c(java.lang.String account__c) {
        this.account__c = account__c;
    }


    /**
     * Gets the account__r value for this Transaction__c.
     * 
     * @return account__r
     */
    public com.sforce.soap.enterprise.sobject.Account getAccount__r() {
        return account__r;
    }


    /**
     * Sets the account__r value for this Transaction__c.
     * 
     * @param account__r
     */
    public void setAccount__r(com.sforce.soap.enterprise.sobject.Account account__r) {
        this.account__r = account__r;
    }


    /**
     * Gets the approval_Override__c value for this Transaction__c.
     * 
     * @return approval_Override__c
     */
    public java.lang.Boolean getApproval_Override__c() {
        return approval_Override__c;
    }


    /**
     * Sets the approval_Override__c value for this Transaction__c.
     * 
     * @param approval_Override__c
     */
    public void setApproval_Override__c(java.lang.Boolean approval_Override__c) {
        this.approval_Override__c = approval_Override__c;
    }


    /**
     * Gets the approved__c value for this Transaction__c.
     * 
     * @return approved__c
     */
    public java.lang.Boolean getApproved__c() {
        return approved__c;
    }


    /**
     * Sets the approved__c value for this Transaction__c.
     * 
     * @param approved__c
     */
    public void setApproved__c(java.lang.Boolean approved__c) {
        this.approved__c = approved__c;
    }


    /**
     * Gets the attachments value for this Transaction__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Transaction__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the balance_Due__c value for this Transaction__c.
     * 
     * @return balance_Due__c
     */
    public java.lang.Double getBalance_Due__c() {
        return balance_Due__c;
    }


    /**
     * Sets the balance_Due__c value for this Transaction__c.
     * 
     * @param balance_Due__c
     */
    public void setBalance_Due__c(java.lang.Double balance_Due__c) {
        this.balance_Due__c = balance_Due__c;
    }


    /**
     * Gets the billTo__c value for this Transaction__c.
     * 
     * @return billTo__c
     */
    public java.lang.String getBillTo__c() {
        return billTo__c;
    }


    /**
     * Sets the billTo__c value for this Transaction__c.
     * 
     * @param billTo__c
     */
    public void setBillTo__c(java.lang.String billTo__c) {
        this.billTo__c = billTo__c;
    }


    /**
     * Gets the bill_Date__c value for this Transaction__c.
     * 
     * @return bill_Date__c
     */
    public java.util.Date getBill_Date__c() {
        return bill_Date__c;
    }


    /**
     * Sets the bill_Date__c value for this Transaction__c.
     * 
     * @param bill_Date__c
     */
    public void setBill_Date__c(java.util.Date bill_Date__c) {
        this.bill_Date__c = bill_Date__c;
    }


    /**
     * Gets the case_Status__c value for this Transaction__c.
     * 
     * @return case_Status__c
     */
    public java.lang.String getCase_Status__c() {
        return case_Status__c;
    }


    /**
     * Sets the case_Status__c value for this Transaction__c.
     * 
     * @param case_Status__c
     */
    public void setCase_Status__c(java.lang.String case_Status__c) {
        this.case_Status__c = case_Status__c;
    }


    /**
     * Gets the class__c value for this Transaction__c.
     * 
     * @return class__c
     */
    public java.lang.String getClass__c() {
        return class__c;
    }


    /**
     * Sets the class__c value for this Transaction__c.
     * 
     * @param class__c
     */
    public void setClass__c(java.lang.String class__c) {
        this.class__c = class__c;
    }


    /**
     * Gets the contract_Name__c value for this Transaction__c.
     * 
     * @return contract_Name__c
     */
    public java.lang.String getContract_Name__c() {
        return contract_Name__c;
    }


    /**
     * Sets the contract_Name__c value for this Transaction__c.
     * 
     * @param contract_Name__c
     */
    public void setContract_Name__c(java.lang.String contract_Name__c) {
        this.contract_Name__c = contract_Name__c;
    }


    /**
     * Gets the contract_Notes__c value for this Transaction__c.
     * 
     * @return contract_Notes__c
     */
    public java.lang.String getContract_Notes__c() {
        return contract_Notes__c;
    }


    /**
     * Sets the contract_Notes__c value for this Transaction__c.
     * 
     * @param contract_Notes__c
     */
    public void setContract_Notes__c(java.lang.String contract_Notes__c) {
        this.contract_Notes__c = contract_Notes__c;
    }


    /**
     * Gets the contract__c value for this Transaction__c.
     * 
     * @return contract__c
     */
    public java.lang.String getContract__c() {
        return contract__c;
    }


    /**
     * Sets the contract__c value for this Transaction__c.
     * 
     * @param contract__c
     */
    public void setContract__c(java.lang.String contract__c) {
        this.contract__c = contract__c;
    }


    /**
     * Gets the contract__r value for this Transaction__c.
     * 
     * @return contract__r
     */
    public com.sforce.soap.enterprise.sobject.Contract getContract__r() {
        return contract__r;
    }


    /**
     * Sets the contract__r value for this Transaction__c.
     * 
     * @param contract__r
     */
    public void setContract__r(com.sforce.soap.enterprise.sobject.Contract contract__r) {
        this.contract__r = contract__r;
    }


    /**
     * Gets the contracted_Users__c value for this Transaction__c.
     * 
     * @return contracted_Users__c
     */
    public java.lang.Double getContracted_Users__c() {
        return contracted_Users__c;
    }


    /**
     * Sets the contracted_Users__c value for this Transaction__c.
     * 
     * @param contracted_Users__c
     */
    public void setContracted_Users__c(java.lang.Double contracted_Users__c) {
        this.contracted_Users__c = contracted_Users__c;
    }


    /**
     * Gets the createdBy value for this Transaction__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Transaction__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Transaction__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Transaction__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Transaction__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Transaction__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Transaction__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Transaction__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the histories value for this Transaction__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Transaction__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the INV_Number__c value for this Transaction__c.
     * 
     * @return INV_Number__c
     */
    public java.lang.String getINV_Number__c() {
        return INV_Number__c;
    }


    /**
     * Sets the INV_Number__c value for this Transaction__c.
     * 
     * @param INV_Number__c
     */
    public void setINV_Number__c(java.lang.String INV_Number__c) {
        this.INV_Number__c = INV_Number__c;
    }


    /**
     * Gets the invoice_Contacts__c value for this Transaction__c.
     * 
     * @return invoice_Contacts__c
     */
    public java.lang.String getInvoice_Contacts__c() {
        return invoice_Contacts__c;
    }


    /**
     * Sets the invoice_Contacts__c value for this Transaction__c.
     * 
     * @param invoice_Contacts__c
     */
    public void setInvoice_Contacts__c(java.lang.String invoice_Contacts__c) {
        this.invoice_Contacts__c = invoice_Contacts__c;
    }


    /**
     * Gets the isDeleted value for this Transaction__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Transaction__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this Transaction__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Transaction__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Transaction__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Transaction__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Transaction__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Transaction__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this Transaction__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Transaction__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Transaction__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Transaction__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Transaction__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Transaction__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the notes__c value for this Transaction__c.
     * 
     * @return notes__c
     */
    public java.lang.String getNotes__c() {
        return notes__c;
    }


    /**
     * Sets the notes__c value for this Transaction__c.
     * 
     * @param notes__c
     */
    public void setNotes__c(java.lang.String notes__c) {
        this.notes__c = notes__c;
    }


    /**
     * Gets the payments_Credits__c value for this Transaction__c.
     * 
     * @return payments_Credits__c
     */
    public java.lang.Double getPayments_Credits__c() {
        return payments_Credits__c;
    }


    /**
     * Sets the payments_Credits__c value for this Transaction__c.
     * 
     * @param payments_Credits__c
     */
    public void setPayments_Credits__c(java.lang.Double payments_Credits__c) {
        this.payments_Credits__c = payments_Credits__c;
    }


    /**
     * Gets the processInstances value for this Transaction__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Transaction__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Transaction__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Transaction__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the project__c value for this Transaction__c.
     * 
     * @return project__c
     */
    public java.lang.String getProject__c() {
        return project__c;
    }


    /**
     * Sets the project__c value for this Transaction__c.
     * 
     * @param project__c
     */
    public void setProject__c(java.lang.String project__c) {
        this.project__c = project__c;
    }


    /**
     * Gets the RA_Contract_Type__c value for this Transaction__c.
     * 
     * @return RA_Contract_Type__c
     */
    public java.lang.String getRA_Contract_Type__c() {
        return RA_Contract_Type__c;
    }


    /**
     * Sets the RA_Contract_Type__c value for this Transaction__c.
     * 
     * @param RA_Contract_Type__c
     */
    public void setRA_Contract_Type__c(java.lang.String RA_Contract_Type__c) {
        this.RA_Contract_Type__c = RA_Contract_Type__c;
    }


    /**
     * Gets the relativity_Case__c value for this Transaction__c.
     * 
     * @return relativity_Case__c
     */
    public java.lang.String getRelativity_Case__c() {
        return relativity_Case__c;
    }


    /**
     * Sets the relativity_Case__c value for this Transaction__c.
     * 
     * @param relativity_Case__c
     */
    public void setRelativity_Case__c(java.lang.String relativity_Case__c) {
        this.relativity_Case__c = relativity_Case__c;
    }


    /**
     * Gets the relativity_Case__r value for this Transaction__c.
     * 
     * @return relativity_Case__r
     */
    public com.sforce.soap.enterprise.sobject.Relativity_Case__c getRelativity_Case__r() {
        return relativity_Case__r;
    }


    /**
     * Sets the relativity_Case__r value for this Transaction__c.
     * 
     * @param relativity_Case__r
     */
    public void setRelativity_Case__r(com.sforce.soap.enterprise.sobject.Relativity_Case__c relativity_Case__r) {
        this.relativity_Case__r = relativity_Case__r;
    }


    /**
     * Gets the status__c value for this Transaction__c.
     * 
     * @return status__c
     */
    public java.lang.String getStatus__c() {
        return status__c;
    }


    /**
     * Sets the status__c value for this Transaction__c.
     * 
     * @param status__c
     */
    public void setStatus__c(java.lang.String status__c) {
        this.status__c = status__c;
    }


    /**
     * Gets the systemModstamp value for this Transaction__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Transaction__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the terms__c value for this Transaction__c.
     * 
     * @return terms__c
     */
    public java.lang.String getTerms__c() {
        return terms__c;
    }


    /**
     * Sets the terms__c value for this Transaction__c.
     * 
     * @param terms__c
     */
    public void setTerms__c(java.lang.String terms__c) {
        this.terms__c = terms__c;
    }


    /**
     * Gets the total_Analytics__c value for this Transaction__c.
     * 
     * @return total_Analytics__c
     */
    public java.lang.Double getTotal_Analytics__c() {
        return total_Analytics__c;
    }


    /**
     * Sets the total_Analytics__c value for this Transaction__c.
     * 
     * @param total_Analytics__c
     */
    public void setTotal_Analytics__c(java.lang.Double total_Analytics__c) {
        this.total_Analytics__c = total_Analytics__c;
    }


    /**
     * Gets the total_Cases__c value for this Transaction__c.
     * 
     * @return total_Cases__c
     */
    public java.lang.Double getTotal_Cases__c() {
        return total_Cases__c;
    }


    /**
     * Sets the total_Cases__c value for this Transaction__c.
     * 
     * @param total_Cases__c
     */
    public void setTotal_Cases__c(java.lang.Double total_Cases__c) {
        this.total_Cases__c = total_Cases__c;
    }


    /**
     * Gets the total_Paid_Users__c value for this Transaction__c.
     * 
     * @return total_Paid_Users__c
     */
    public java.lang.Double getTotal_Paid_Users__c() {
        return total_Paid_Users__c;
    }


    /**
     * Sets the total_Paid_Users__c value for this Transaction__c.
     * 
     * @param total_Paid_Users__c
     */
    public void setTotal_Paid_Users__c(java.lang.Double total_Paid_Users__c) {
        this.total_Paid_Users__c = total_Paid_Users__c;
    }


    /**
     * Gets the total_RA_GBs_Remaining__c value for this Transaction__c.
     * 
     * @return total_RA_GBs_Remaining__c
     */
    public java.lang.Double getTotal_RA_GBs_Remaining__c() {
        return total_RA_GBs_Remaining__c;
    }


    /**
     * Sets the total_RA_GBs_Remaining__c value for this Transaction__c.
     * 
     * @param total_RA_GBs_Remaining__c
     */
    public void setTotal_RA_GBs_Remaining__c(java.lang.Double total_RA_GBs_Remaining__c) {
        this.total_RA_GBs_Remaining__c = total_RA_GBs_Remaining__c;
    }


    /**
     * Gets the total__c value for this Transaction__c.
     * 
     * @return total__c
     */
    public java.lang.Double getTotal__c() {
        return total__c;
    }


    /**
     * Sets the total__c value for this Transaction__c.
     * 
     * @param total__c
     */
    public void setTotal__c(java.lang.Double total__c) {
        this.total__c = total__c;
    }


    /**
     * Gets the transaction_Instances__r value for this Transaction__c.
     * 
     * @return transaction_Instances__r
     */
    public com.sforce.soap.enterprise.QueryResult getTransaction_Instances__r() {
        return transaction_Instances__r;
    }


    /**
     * Sets the transaction_Instances__r value for this Transaction__c.
     * 
     * @param transaction_Instances__r
     */
    public void setTransaction_Instances__r(com.sforce.soap.enterprise.QueryResult transaction_Instances__r) {
        this.transaction_Instances__r = transaction_Instances__r;
    }


    /**
     * Gets the transaction_Line_Items__r value for this Transaction__c.
     * 
     * @return transaction_Line_Items__r
     */
    public com.sforce.soap.enterprise.QueryResult getTransaction_Line_Items__r() {
        return transaction_Line_Items__r;
    }


    /**
     * Sets the transaction_Line_Items__r value for this Transaction__c.
     * 
     * @param transaction_Line_Items__r
     */
    public void setTransaction_Line_Items__r(com.sforce.soap.enterprise.QueryResult transaction_Line_Items__r) {
        this.transaction_Line_Items__r = transaction_Line_Items__r;
    }


    /**
     * Gets the transaction_Type__c value for this Transaction__c.
     * 
     * @return transaction_Type__c
     */
    public java.lang.String getTransaction_Type__c() {
        return transaction_Type__c;
    }


    /**
     * Sets the transaction_Type__c value for this Transaction__c.
     * 
     * @param transaction_Type__c
     */
    public void setTransaction_Type__c(java.lang.String transaction_Type__c) {
        this.transaction_Type__c = transaction_Type__c;
    }


    /**
     * Gets the transaction__r value for this Transaction__c.
     * 
     * @return transaction__r
     */
    public com.sforce.soap.enterprise.QueryResult getTransaction__r() {
        return transaction__r;
    }


    /**
     * Sets the transaction__r value for this Transaction__c.
     * 
     * @param transaction__r
     */
    public void setTransaction__r(com.sforce.soap.enterprise.QueryResult transaction__r) {
        this.transaction__r = transaction__r;
    }


    /**
     * Gets the unique_Named_Users__c value for this Transaction__c.
     * 
     * @return unique_Named_Users__c
     */
    public java.lang.Double getUnique_Named_Users__c() {
        return unique_Named_Users__c;
    }


    /**
     * Sets the unique_Named_Users__c value for this Transaction__c.
     * 
     * @param unique_Named_Users__c
     */
    public void setUnique_Named_Users__c(java.lang.Double unique_Named_Users__c) {
        this.unique_Named_Users__c = unique_Named_Users__c;
    }


    /**
     * Gets the unique_User_Count__c value for this Transaction__c.
     * 
     * @return unique_User_Count__c
     */
    public java.lang.Double getUnique_User_Count__c() {
        return unique_User_Count__c;
    }


    /**
     * Sets the unique_User_Count__c value for this Transaction__c.
     * 
     * @param unique_User_Count__c
     */
    public void setUnique_User_Count__c(java.lang.Double unique_User_Count__c) {
        this.unique_User_Count__c = unique_User_Count__c;
    }


    /**
     * Gets the unique_Users__r value for this Transaction__c.
     * 
     * @return unique_Users__r
     */
    public com.sforce.soap.enterprise.QueryResult getUnique_Users__r() {
        return unique_Users__r;
    }


    /**
     * Sets the unique_Users__r value for this Transaction__c.
     * 
     * @param unique_Users__r
     */
    public void setUnique_Users__r(com.sforce.soap.enterprise.QueryResult unique_Users__r) {
        this.unique_Users__r = unique_Users__r;
    }


    /**
     * Gets the year_Month__c value for this Transaction__c.
     * 
     * @return year_Month__c
     */
    public java.lang.String getYear_Month__c() {
        return year_Month__c;
    }


    /**
     * Sets the year_Month__c value for this Transaction__c.
     * 
     * @param year_Month__c
     */
    public void setYear_Month__c(java.lang.String year_Month__c) {
        this.year_Month__c = year_Month__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Transaction__c)) return false;
        Transaction__c other = (Transaction__c) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.account_Owner__c==null && other.getAccount_Owner__c()==null) || 
             (this.account_Owner__c!=null &&
              this.account_Owner__c.equals(other.getAccount_Owner__c()))) &&
            ((this.account_Owner__r==null && other.getAccount_Owner__r()==null) || 
             (this.account_Owner__r!=null &&
              this.account_Owner__r.equals(other.getAccount_Owner__r()))) &&
            ((this.account__c==null && other.getAccount__c()==null) || 
             (this.account__c!=null &&
              this.account__c.equals(other.getAccount__c()))) &&
            ((this.account__r==null && other.getAccount__r()==null) || 
             (this.account__r!=null &&
              this.account__r.equals(other.getAccount__r()))) &&
            ((this.approval_Override__c==null && other.getApproval_Override__c()==null) || 
             (this.approval_Override__c!=null &&
              this.approval_Override__c.equals(other.getApproval_Override__c()))) &&
            ((this.approved__c==null && other.getApproved__c()==null) || 
             (this.approved__c!=null &&
              this.approved__c.equals(other.getApproved__c()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.balance_Due__c==null && other.getBalance_Due__c()==null) || 
             (this.balance_Due__c!=null &&
              this.balance_Due__c.equals(other.getBalance_Due__c()))) &&
            ((this.billTo__c==null && other.getBillTo__c()==null) || 
             (this.billTo__c!=null &&
              this.billTo__c.equals(other.getBillTo__c()))) &&
            ((this.bill_Date__c==null && other.getBill_Date__c()==null) || 
             (this.bill_Date__c!=null &&
              this.bill_Date__c.equals(other.getBill_Date__c()))) &&
            ((this.case_Status__c==null && other.getCase_Status__c()==null) || 
             (this.case_Status__c!=null &&
              this.case_Status__c.equals(other.getCase_Status__c()))) &&
            ((this.class__c==null && other.getClass__c()==null) || 
             (this.class__c!=null &&
              this.class__c.equals(other.getClass__c()))) &&
            ((this.contract_Name__c==null && other.getContract_Name__c()==null) || 
             (this.contract_Name__c!=null &&
              this.contract_Name__c.equals(other.getContract_Name__c()))) &&
            ((this.contract_Notes__c==null && other.getContract_Notes__c()==null) || 
             (this.contract_Notes__c!=null &&
              this.contract_Notes__c.equals(other.getContract_Notes__c()))) &&
            ((this.contract__c==null && other.getContract__c()==null) || 
             (this.contract__c!=null &&
              this.contract__c.equals(other.getContract__c()))) &&
            ((this.contract__r==null && other.getContract__r()==null) || 
             (this.contract__r!=null &&
              this.contract__r.equals(other.getContract__r()))) &&
            ((this.contracted_Users__c==null && other.getContracted_Users__c()==null) || 
             (this.contracted_Users__c!=null &&
              this.contracted_Users__c.equals(other.getContracted_Users__c()))) &&
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
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
            ((this.INV_Number__c==null && other.getINV_Number__c()==null) || 
             (this.INV_Number__c!=null &&
              this.INV_Number__c.equals(other.getINV_Number__c()))) &&
            ((this.invoice_Contacts__c==null && other.getInvoice_Contacts__c()==null) || 
             (this.invoice_Contacts__c!=null &&
              this.invoice_Contacts__c.equals(other.getInvoice_Contacts__c()))) &&
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
            ((this.payments_Credits__c==null && other.getPayments_Credits__c()==null) || 
             (this.payments_Credits__c!=null &&
              this.payments_Credits__c.equals(other.getPayments_Credits__c()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.project__c==null && other.getProject__c()==null) || 
             (this.project__c!=null &&
              this.project__c.equals(other.getProject__c()))) &&
            ((this.RA_Contract_Type__c==null && other.getRA_Contract_Type__c()==null) || 
             (this.RA_Contract_Type__c!=null &&
              this.RA_Contract_Type__c.equals(other.getRA_Contract_Type__c()))) &&
            ((this.relativity_Case__c==null && other.getRelativity_Case__c()==null) || 
             (this.relativity_Case__c!=null &&
              this.relativity_Case__c.equals(other.getRelativity_Case__c()))) &&
            ((this.relativity_Case__r==null && other.getRelativity_Case__r()==null) || 
             (this.relativity_Case__r!=null &&
              this.relativity_Case__r.equals(other.getRelativity_Case__r()))) &&
            ((this.status__c==null && other.getStatus__c()==null) || 
             (this.status__c!=null &&
              this.status__c.equals(other.getStatus__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.terms__c==null && other.getTerms__c()==null) || 
             (this.terms__c!=null &&
              this.terms__c.equals(other.getTerms__c()))) &&
            ((this.total_Analytics__c==null && other.getTotal_Analytics__c()==null) || 
             (this.total_Analytics__c!=null &&
              this.total_Analytics__c.equals(other.getTotal_Analytics__c()))) &&
            ((this.total_Cases__c==null && other.getTotal_Cases__c()==null) || 
             (this.total_Cases__c!=null &&
              this.total_Cases__c.equals(other.getTotal_Cases__c()))) &&
            ((this.total_Paid_Users__c==null && other.getTotal_Paid_Users__c()==null) || 
             (this.total_Paid_Users__c!=null &&
              this.total_Paid_Users__c.equals(other.getTotal_Paid_Users__c()))) &&
            ((this.total_RA_GBs_Remaining__c==null && other.getTotal_RA_GBs_Remaining__c()==null) || 
             (this.total_RA_GBs_Remaining__c!=null &&
              this.total_RA_GBs_Remaining__c.equals(other.getTotal_RA_GBs_Remaining__c()))) &&
            ((this.total__c==null && other.getTotal__c()==null) || 
             (this.total__c!=null &&
              this.total__c.equals(other.getTotal__c()))) &&
            ((this.transaction_Instances__r==null && other.getTransaction_Instances__r()==null) || 
             (this.transaction_Instances__r!=null &&
              this.transaction_Instances__r.equals(other.getTransaction_Instances__r()))) &&
            ((this.transaction_Line_Items__r==null && other.getTransaction_Line_Items__r()==null) || 
             (this.transaction_Line_Items__r!=null &&
              this.transaction_Line_Items__r.equals(other.getTransaction_Line_Items__r()))) &&
            ((this.transaction_Type__c==null && other.getTransaction_Type__c()==null) || 
             (this.transaction_Type__c!=null &&
              this.transaction_Type__c.equals(other.getTransaction_Type__c()))) &&
            ((this.transaction__r==null && other.getTransaction__r()==null) || 
             (this.transaction__r!=null &&
              this.transaction__r.equals(other.getTransaction__r()))) &&
            ((this.unique_Named_Users__c==null && other.getUnique_Named_Users__c()==null) || 
             (this.unique_Named_Users__c!=null &&
              this.unique_Named_Users__c.equals(other.getUnique_Named_Users__c()))) &&
            ((this.unique_User_Count__c==null && other.getUnique_User_Count__c()==null) || 
             (this.unique_User_Count__c!=null &&
              this.unique_User_Count__c.equals(other.getUnique_User_Count__c()))) &&
            ((this.unique_Users__r==null && other.getUnique_Users__r()==null) || 
             (this.unique_Users__r!=null &&
              this.unique_Users__r.equals(other.getUnique_Users__r()))) &&
            ((this.year_Month__c==null && other.getYear_Month__c()==null) || 
             (this.year_Month__c!=null &&
              this.year_Month__c.equals(other.getYear_Month__c())));
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
        if (getAccount_Owner__c() != null) {
            _hashCode += getAccount_Owner__c().hashCode();
        }
        if (getAccount_Owner__r() != null) {
            _hashCode += getAccount_Owner__r().hashCode();
        }
        if (getAccount__c() != null) {
            _hashCode += getAccount__c().hashCode();
        }
        if (getAccount__r() != null) {
            _hashCode += getAccount__r().hashCode();
        }
        if (getApproval_Override__c() != null) {
            _hashCode += getApproval_Override__c().hashCode();
        }
        if (getApproved__c() != null) {
            _hashCode += getApproved__c().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getBalance_Due__c() != null) {
            _hashCode += getBalance_Due__c().hashCode();
        }
        if (getBillTo__c() != null) {
            _hashCode += getBillTo__c().hashCode();
        }
        if (getBill_Date__c() != null) {
            _hashCode += getBill_Date__c().hashCode();
        }
        if (getCase_Status__c() != null) {
            _hashCode += getCase_Status__c().hashCode();
        }
        if (getClass__c() != null) {
            _hashCode += getClass__c().hashCode();
        }
        if (getContract_Name__c() != null) {
            _hashCode += getContract_Name__c().hashCode();
        }
        if (getContract_Notes__c() != null) {
            _hashCode += getContract_Notes__c().hashCode();
        }
        if (getContract__c() != null) {
            _hashCode += getContract__c().hashCode();
        }
        if (getContract__r() != null) {
            _hashCode += getContract__r().hashCode();
        }
        if (getContracted_Users__c() != null) {
            _hashCode += getContracted_Users__c().hashCode();
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
        if (getHistories() != null) {
            _hashCode += getHistories().hashCode();
        }
        if (getINV_Number__c() != null) {
            _hashCode += getINV_Number__c().hashCode();
        }
        if (getInvoice_Contacts__c() != null) {
            _hashCode += getInvoice_Contacts__c().hashCode();
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
        if (getPayments_Credits__c() != null) {
            _hashCode += getPayments_Credits__c().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getProject__c() != null) {
            _hashCode += getProject__c().hashCode();
        }
        if (getRA_Contract_Type__c() != null) {
            _hashCode += getRA_Contract_Type__c().hashCode();
        }
        if (getRelativity_Case__c() != null) {
            _hashCode += getRelativity_Case__c().hashCode();
        }
        if (getRelativity_Case__r() != null) {
            _hashCode += getRelativity_Case__r().hashCode();
        }
        if (getStatus__c() != null) {
            _hashCode += getStatus__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTerms__c() != null) {
            _hashCode += getTerms__c().hashCode();
        }
        if (getTotal_Analytics__c() != null) {
            _hashCode += getTotal_Analytics__c().hashCode();
        }
        if (getTotal_Cases__c() != null) {
            _hashCode += getTotal_Cases__c().hashCode();
        }
        if (getTotal_Paid_Users__c() != null) {
            _hashCode += getTotal_Paid_Users__c().hashCode();
        }
        if (getTotal_RA_GBs_Remaining__c() != null) {
            _hashCode += getTotal_RA_GBs_Remaining__c().hashCode();
        }
        if (getTotal__c() != null) {
            _hashCode += getTotal__c().hashCode();
        }
        if (getTransaction_Instances__r() != null) {
            _hashCode += getTransaction_Instances__r().hashCode();
        }
        if (getTransaction_Line_Items__r() != null) {
            _hashCode += getTransaction_Line_Items__r().hashCode();
        }
        if (getTransaction_Type__c() != null) {
            _hashCode += getTransaction_Type__c().hashCode();
        }
        if (getTransaction__r() != null) {
            _hashCode += getTransaction__r().hashCode();
        }
        if (getUnique_Named_Users__c() != null) {
            _hashCode += getUnique_Named_Users__c().hashCode();
        }
        if (getUnique_User_Count__c() != null) {
            _hashCode += getUnique_User_Count__c().hashCode();
        }
        if (getUnique_Users__r() != null) {
            _hashCode += getUnique_Users__r().hashCode();
        }
        if (getYear_Month__c() != null) {
            _hashCode += getYear_Month__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Transaction__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Transaction__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account_Owner__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account_Owner__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account_Owner__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account_Owner__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approval_Override__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Approval_Override__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approved__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Approved__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("balance_Due__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Balance_Due__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billTo__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BillTo__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bill_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Bill_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("case_Status__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case_Status__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("class__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Class__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contract_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contract_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contract_Notes__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contract_Notes__c"));
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
        elemField.setFieldName("contracted_Users__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contracted_Users__c"));
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
        elemField.setFieldName("histories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Histories"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INV_Number__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "INV_Number__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoice_Contacts__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Invoice_Contacts__c"));
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
        elemField.setFieldName("payments_Credits__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Payments_Credits__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("project__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Project__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RA_Contract_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RA_Contract_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relativity_Case__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relativity_Case__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relativity_Case__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relativity_Case__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relativity_Case__c"));
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
        elemField.setFieldName("terms__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Terms__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_Analytics__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Total_Analytics__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_Cases__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Total_Cases__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_Paid_Users__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Total_Paid_Users__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_RA_GBs_Remaining__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Total_RA_GBs_Remaining__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Total__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaction_Instances__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Transaction_Instances__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaction_Line_Items__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Transaction_Line_Items__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaction_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Transaction_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaction__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Transaction__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unique_Named_Users__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Unique_Named_Users__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unique_User_Count__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Unique_User_Count__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unique_Users__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Unique_Users__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("year_Month__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Year_Month__c"));
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

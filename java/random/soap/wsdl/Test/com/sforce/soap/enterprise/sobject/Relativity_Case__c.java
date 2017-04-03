/**
 * Relativity_Case__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Relativity_Case__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String account__c;

    private com.sforce.soap.enterprise.sobject.Account account__r;

    private java.lang.Double artifact_ID__c;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.Boolean CA_Enabled__c;

    private java.lang.String case_ID__c;

    private com.sforce.soap.enterprise.QueryResult cases__r;

    private java.lang.String client_Status__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.String instance__c;

    private com.sforce.soap.enterprise.sobject.Instance__c instance__r;

    private java.lang.Boolean isDeleted;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String name;

    private java.lang.Boolean not_Billable__c;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.String relativity_Case_Name__c;

    private java.lang.String status__c;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tickets__r;

    private com.sforce.soap.enterprise.QueryResult transaction_Line_Items__r;

    private com.sforce.soap.enterprise.QueryResult transactions__r;

    private com.sforce.soap.enterprise.QueryResult unique_Users__r;

    private java.lang.String kPlex_Formula__c;

    private java.lang.Boolean kPlex__c;

    public Relativity_Case__c() {
    }

    public Relativity_Case__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String account__c,
           com.sforce.soap.enterprise.sobject.Account account__r,
           java.lang.Double artifact_ID__c,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.Boolean CA_Enabled__c,
           java.lang.String case_ID__c,
           com.sforce.soap.enterprise.QueryResult cases__r,
           java.lang.String client_Status__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.String instance__c,
           com.sforce.soap.enterprise.sobject.Instance__c instance__r,
           java.lang.Boolean isDeleted,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String name,
           java.lang.Boolean not_Billable__c,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.String relativity_Case_Name__c,
           java.lang.String status__c,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tickets__r,
           com.sforce.soap.enterprise.QueryResult transaction_Line_Items__r,
           com.sforce.soap.enterprise.QueryResult transactions__r,
           com.sforce.soap.enterprise.QueryResult unique_Users__r,
           java.lang.String kPlex_Formula__c,
           java.lang.Boolean kPlex__c) {
        super(
            fieldsToNull,
            id);
        this.account__c = account__c;
        this.account__r = account__r;
        this.artifact_ID__c = artifact_ID__c;
        this.attachments = attachments;
        this.CA_Enabled__c = CA_Enabled__c;
        this.case_ID__c = case_ID__c;
        this.cases__r = cases__r;
        this.client_Status__c = client_Status__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.histories = histories;
        this.instance__c = instance__c;
        this.instance__r = instance__r;
        this.isDeleted = isDeleted;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.name = name;
        this.not_Billable__c = not_Billable__c;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.relativity_Case_Name__c = relativity_Case_Name__c;
        this.status__c = status__c;
        this.systemModstamp = systemModstamp;
        this.tickets__r = tickets__r;
        this.transaction_Line_Items__r = transaction_Line_Items__r;
        this.transactions__r = transactions__r;
        this.unique_Users__r = unique_Users__r;
        this.kPlex_Formula__c = kPlex_Formula__c;
        this.kPlex__c = kPlex__c;
    }


    /**
     * Gets the account__c value for this Relativity_Case__c.
     * 
     * @return account__c
     */
    public java.lang.String getAccount__c() {
        return account__c;
    }


    /**
     * Sets the account__c value for this Relativity_Case__c.
     * 
     * @param account__c
     */
    public void setAccount__c(java.lang.String account__c) {
        this.account__c = account__c;
    }


    /**
     * Gets the account__r value for this Relativity_Case__c.
     * 
     * @return account__r
     */
    public com.sforce.soap.enterprise.sobject.Account getAccount__r() {
        return account__r;
    }


    /**
     * Sets the account__r value for this Relativity_Case__c.
     * 
     * @param account__r
     */
    public void setAccount__r(com.sforce.soap.enterprise.sobject.Account account__r) {
        this.account__r = account__r;
    }


    /**
     * Gets the artifact_ID__c value for this Relativity_Case__c.
     * 
     * @return artifact_ID__c
     */
    public java.lang.Double getArtifact_ID__c() {
        return artifact_ID__c;
    }


    /**
     * Sets the artifact_ID__c value for this Relativity_Case__c.
     * 
     * @param artifact_ID__c
     */
    public void setArtifact_ID__c(java.lang.Double artifact_ID__c) {
        this.artifact_ID__c = artifact_ID__c;
    }


    /**
     * Gets the attachments value for this Relativity_Case__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Relativity_Case__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the CA_Enabled__c value for this Relativity_Case__c.
     * 
     * @return CA_Enabled__c
     */
    public java.lang.Boolean getCA_Enabled__c() {
        return CA_Enabled__c;
    }


    /**
     * Sets the CA_Enabled__c value for this Relativity_Case__c.
     * 
     * @param CA_Enabled__c
     */
    public void setCA_Enabled__c(java.lang.Boolean CA_Enabled__c) {
        this.CA_Enabled__c = CA_Enabled__c;
    }


    /**
     * Gets the case_ID__c value for this Relativity_Case__c.
     * 
     * @return case_ID__c
     */
    public java.lang.String getCase_ID__c() {
        return case_ID__c;
    }


    /**
     * Sets the case_ID__c value for this Relativity_Case__c.
     * 
     * @param case_ID__c
     */
    public void setCase_ID__c(java.lang.String case_ID__c) {
        this.case_ID__c = case_ID__c;
    }


    /**
     * Gets the cases__r value for this Relativity_Case__c.
     * 
     * @return cases__r
     */
    public com.sforce.soap.enterprise.QueryResult getCases__r() {
        return cases__r;
    }


    /**
     * Sets the cases__r value for this Relativity_Case__c.
     * 
     * @param cases__r
     */
    public void setCases__r(com.sforce.soap.enterprise.QueryResult cases__r) {
        this.cases__r = cases__r;
    }


    /**
     * Gets the client_Status__c value for this Relativity_Case__c.
     * 
     * @return client_Status__c
     */
    public java.lang.String getClient_Status__c() {
        return client_Status__c;
    }


    /**
     * Sets the client_Status__c value for this Relativity_Case__c.
     * 
     * @param client_Status__c
     */
    public void setClient_Status__c(java.lang.String client_Status__c) {
        this.client_Status__c = client_Status__c;
    }


    /**
     * Gets the createdBy value for this Relativity_Case__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Relativity_Case__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Relativity_Case__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Relativity_Case__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Relativity_Case__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Relativity_Case__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Relativity_Case__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Relativity_Case__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the histories value for this Relativity_Case__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Relativity_Case__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the instance__c value for this Relativity_Case__c.
     * 
     * @return instance__c
     */
    public java.lang.String getInstance__c() {
        return instance__c;
    }


    /**
     * Sets the instance__c value for this Relativity_Case__c.
     * 
     * @param instance__c
     */
    public void setInstance__c(java.lang.String instance__c) {
        this.instance__c = instance__c;
    }


    /**
     * Gets the instance__r value for this Relativity_Case__c.
     * 
     * @return instance__r
     */
    public com.sforce.soap.enterprise.sobject.Instance__c getInstance__r() {
        return instance__r;
    }


    /**
     * Sets the instance__r value for this Relativity_Case__c.
     * 
     * @param instance__r
     */
    public void setInstance__r(com.sforce.soap.enterprise.sobject.Instance__c instance__r) {
        this.instance__r = instance__r;
    }


    /**
     * Gets the isDeleted value for this Relativity_Case__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Relativity_Case__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this Relativity_Case__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Relativity_Case__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Relativity_Case__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Relativity_Case__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Relativity_Case__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Relativity_Case__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this Relativity_Case__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Relativity_Case__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the not_Billable__c value for this Relativity_Case__c.
     * 
     * @return not_Billable__c
     */
    public java.lang.Boolean getNot_Billable__c() {
        return not_Billable__c;
    }


    /**
     * Sets the not_Billable__c value for this Relativity_Case__c.
     * 
     * @param not_Billable__c
     */
    public void setNot_Billable__c(java.lang.Boolean not_Billable__c) {
        this.not_Billable__c = not_Billable__c;
    }


    /**
     * Gets the notes value for this Relativity_Case__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Relativity_Case__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Relativity_Case__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Relativity_Case__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the processInstances value for this Relativity_Case__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Relativity_Case__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Relativity_Case__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Relativity_Case__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the relativity_Case_Name__c value for this Relativity_Case__c.
     * 
     * @return relativity_Case_Name__c
     */
    public java.lang.String getRelativity_Case_Name__c() {
        return relativity_Case_Name__c;
    }


    /**
     * Sets the relativity_Case_Name__c value for this Relativity_Case__c.
     * 
     * @param relativity_Case_Name__c
     */
    public void setRelativity_Case_Name__c(java.lang.String relativity_Case_Name__c) {
        this.relativity_Case_Name__c = relativity_Case_Name__c;
    }


    /**
     * Gets the status__c value for this Relativity_Case__c.
     * 
     * @return status__c
     */
    public java.lang.String getStatus__c() {
        return status__c;
    }


    /**
     * Sets the status__c value for this Relativity_Case__c.
     * 
     * @param status__c
     */
    public void setStatus__c(java.lang.String status__c) {
        this.status__c = status__c;
    }


    /**
     * Gets the systemModstamp value for this Relativity_Case__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Relativity_Case__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tickets__r value for this Relativity_Case__c.
     * 
     * @return tickets__r
     */
    public com.sforce.soap.enterprise.QueryResult getTickets__r() {
        return tickets__r;
    }


    /**
     * Sets the tickets__r value for this Relativity_Case__c.
     * 
     * @param tickets__r
     */
    public void setTickets__r(com.sforce.soap.enterprise.QueryResult tickets__r) {
        this.tickets__r = tickets__r;
    }


    /**
     * Gets the transaction_Line_Items__r value for this Relativity_Case__c.
     * 
     * @return transaction_Line_Items__r
     */
    public com.sforce.soap.enterprise.QueryResult getTransaction_Line_Items__r() {
        return transaction_Line_Items__r;
    }


    /**
     * Sets the transaction_Line_Items__r value for this Relativity_Case__c.
     * 
     * @param transaction_Line_Items__r
     */
    public void setTransaction_Line_Items__r(com.sforce.soap.enterprise.QueryResult transaction_Line_Items__r) {
        this.transaction_Line_Items__r = transaction_Line_Items__r;
    }


    /**
     * Gets the transactions__r value for this Relativity_Case__c.
     * 
     * @return transactions__r
     */
    public com.sforce.soap.enterprise.QueryResult getTransactions__r() {
        return transactions__r;
    }


    /**
     * Sets the transactions__r value for this Relativity_Case__c.
     * 
     * @param transactions__r
     */
    public void setTransactions__r(com.sforce.soap.enterprise.QueryResult transactions__r) {
        this.transactions__r = transactions__r;
    }


    /**
     * Gets the unique_Users__r value for this Relativity_Case__c.
     * 
     * @return unique_Users__r
     */
    public com.sforce.soap.enterprise.QueryResult getUnique_Users__r() {
        return unique_Users__r;
    }


    /**
     * Sets the unique_Users__r value for this Relativity_Case__c.
     * 
     * @param unique_Users__r
     */
    public void setUnique_Users__r(com.sforce.soap.enterprise.QueryResult unique_Users__r) {
        this.unique_Users__r = unique_Users__r;
    }


    /**
     * Gets the kPlex_Formula__c value for this Relativity_Case__c.
     * 
     * @return kPlex_Formula__c
     */
    public java.lang.String getKPlex_Formula__c() {
        return kPlex_Formula__c;
    }


    /**
     * Sets the kPlex_Formula__c value for this Relativity_Case__c.
     * 
     * @param kPlex_Formula__c
     */
    public void setKPlex_Formula__c(java.lang.String kPlex_Formula__c) {
        this.kPlex_Formula__c = kPlex_Formula__c;
    }


    /**
     * Gets the kPlex__c value for this Relativity_Case__c.
     * 
     * @return kPlex__c
     */
    public java.lang.Boolean getKPlex__c() {
        return kPlex__c;
    }


    /**
     * Sets the kPlex__c value for this Relativity_Case__c.
     * 
     * @param kPlex__c
     */
    public void setKPlex__c(java.lang.Boolean kPlex__c) {
        this.kPlex__c = kPlex__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Relativity_Case__c)) return false;
        Relativity_Case__c other = (Relativity_Case__c) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.account__c==null && other.getAccount__c()==null) || 
             (this.account__c!=null &&
              this.account__c.equals(other.getAccount__c()))) &&
            ((this.account__r==null && other.getAccount__r()==null) || 
             (this.account__r!=null &&
              this.account__r.equals(other.getAccount__r()))) &&
            ((this.artifact_ID__c==null && other.getArtifact_ID__c()==null) || 
             (this.artifact_ID__c!=null &&
              this.artifact_ID__c.equals(other.getArtifact_ID__c()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.CA_Enabled__c==null && other.getCA_Enabled__c()==null) || 
             (this.CA_Enabled__c!=null &&
              this.CA_Enabled__c.equals(other.getCA_Enabled__c()))) &&
            ((this.case_ID__c==null && other.getCase_ID__c()==null) || 
             (this.case_ID__c!=null &&
              this.case_ID__c.equals(other.getCase_ID__c()))) &&
            ((this.cases__r==null && other.getCases__r()==null) || 
             (this.cases__r!=null &&
              this.cases__r.equals(other.getCases__r()))) &&
            ((this.client_Status__c==null && other.getClient_Status__c()==null) || 
             (this.client_Status__c!=null &&
              this.client_Status__c.equals(other.getClient_Status__c()))) &&
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
            ((this.instance__c==null && other.getInstance__c()==null) || 
             (this.instance__c!=null &&
              this.instance__c.equals(other.getInstance__c()))) &&
            ((this.instance__r==null && other.getInstance__r()==null) || 
             (this.instance__r!=null &&
              this.instance__r.equals(other.getInstance__r()))) &&
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
            ((this.not_Billable__c==null && other.getNot_Billable__c()==null) || 
             (this.not_Billable__c!=null &&
              this.not_Billable__c.equals(other.getNot_Billable__c()))) &&
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
            ((this.relativity_Case_Name__c==null && other.getRelativity_Case_Name__c()==null) || 
             (this.relativity_Case_Name__c!=null &&
              this.relativity_Case_Name__c.equals(other.getRelativity_Case_Name__c()))) &&
            ((this.status__c==null && other.getStatus__c()==null) || 
             (this.status__c!=null &&
              this.status__c.equals(other.getStatus__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tickets__r==null && other.getTickets__r()==null) || 
             (this.tickets__r!=null &&
              this.tickets__r.equals(other.getTickets__r()))) &&
            ((this.transaction_Line_Items__r==null && other.getTransaction_Line_Items__r()==null) || 
             (this.transaction_Line_Items__r!=null &&
              this.transaction_Line_Items__r.equals(other.getTransaction_Line_Items__r()))) &&
            ((this.transactions__r==null && other.getTransactions__r()==null) || 
             (this.transactions__r!=null &&
              this.transactions__r.equals(other.getTransactions__r()))) &&
            ((this.unique_Users__r==null && other.getUnique_Users__r()==null) || 
             (this.unique_Users__r!=null &&
              this.unique_Users__r.equals(other.getUnique_Users__r()))) &&
            ((this.kPlex_Formula__c==null && other.getKPlex_Formula__c()==null) || 
             (this.kPlex_Formula__c!=null &&
              this.kPlex_Formula__c.equals(other.getKPlex_Formula__c()))) &&
            ((this.kPlex__c==null && other.getKPlex__c()==null) || 
             (this.kPlex__c!=null &&
              this.kPlex__c.equals(other.getKPlex__c())));
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
        if (getAccount__c() != null) {
            _hashCode += getAccount__c().hashCode();
        }
        if (getAccount__r() != null) {
            _hashCode += getAccount__r().hashCode();
        }
        if (getArtifact_ID__c() != null) {
            _hashCode += getArtifact_ID__c().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getCA_Enabled__c() != null) {
            _hashCode += getCA_Enabled__c().hashCode();
        }
        if (getCase_ID__c() != null) {
            _hashCode += getCase_ID__c().hashCode();
        }
        if (getCases__r() != null) {
            _hashCode += getCases__r().hashCode();
        }
        if (getClient_Status__c() != null) {
            _hashCode += getClient_Status__c().hashCode();
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
        if (getInstance__c() != null) {
            _hashCode += getInstance__c().hashCode();
        }
        if (getInstance__r() != null) {
            _hashCode += getInstance__r().hashCode();
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
        if (getNot_Billable__c() != null) {
            _hashCode += getNot_Billable__c().hashCode();
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
        if (getRelativity_Case_Name__c() != null) {
            _hashCode += getRelativity_Case_Name__c().hashCode();
        }
        if (getStatus__c() != null) {
            _hashCode += getStatus__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTickets__r() != null) {
            _hashCode += getTickets__r().hashCode();
        }
        if (getTransaction_Line_Items__r() != null) {
            _hashCode += getTransaction_Line_Items__r().hashCode();
        }
        if (getTransactions__r() != null) {
            _hashCode += getTransactions__r().hashCode();
        }
        if (getUnique_Users__r() != null) {
            _hashCode += getUnique_Users__r().hashCode();
        }
        if (getKPlex_Formula__c() != null) {
            _hashCode += getKPlex_Formula__c().hashCode();
        }
        if (getKPlex__c() != null) {
            _hashCode += getKPlex__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Relativity_Case__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relativity_Case__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("artifact_ID__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Artifact_ID__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("CA_Enabled__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CA_Enabled__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("case_ID__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case_ID__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cases__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Cases__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("client_Status__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Client_Status__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("instance__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Instance__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instance__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Instance__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Instance__c"));
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
        elemField.setFieldName("not_Billable__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Not_Billable__c"));
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
        elemField.setFieldName("relativity_Case_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relativity_Case_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("tickets__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tickets__r"));
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
        elemField.setFieldName("transactions__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Transactions__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("KPlex_Formula__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "kPlex_Formula__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KPlex__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "kPlex__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

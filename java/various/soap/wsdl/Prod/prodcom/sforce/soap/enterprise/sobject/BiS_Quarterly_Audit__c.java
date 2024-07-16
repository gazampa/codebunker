/**
 * BiS_Quarterly_Audit__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class BiS_Quarterly_Audit__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String audit_Notes__c;

    private java.lang.String best_in_Service__c;

    private com.sforce.soap.enterprise.sobject.Best_in_Service_Main__c best_in_Service__r;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.util.Date data_Returned_Date__c;

    private java.util.Date environment_Analysis_Begin_Date__c;

    private java.util.Date environment_Analysis_End_Date__c;

    private java.lang.String environment_Analysis_TicketTicket__c;

    private com.sforce.soap.enterprise.sobject._case environment_Analysis_TicketTicket__r;

    private java.lang.String environment_Analysis_Ticket__c;

    private com.sforce.soap.enterprise.sobject._case environment_Analysis_Ticket__r;

    private java.util.Date escalation_Date__c;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.Boolean isDeleted;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private java.lang.String partner_ID__c;

    private java.lang.String pass_Fail__c;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.String quarter__c;

    private java.util.Date quarterly_Audit_Date__c;

    private java.lang.String reason_for_Fail__c;

    private java.util.Date results_Given_On__c;

    private java.util.Calendar systemModstamp;

    private java.util.Date ticket_Sent_Date__c;

    public BiS_Quarterly_Audit__c() {
    }

    public BiS_Quarterly_Audit__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String audit_Notes__c,
           java.lang.String best_in_Service__c,
           com.sforce.soap.enterprise.sobject.Best_in_Service_Main__c best_in_Service__r,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.util.Date data_Returned_Date__c,
           java.util.Date environment_Analysis_Begin_Date__c,
           java.util.Date environment_Analysis_End_Date__c,
           java.lang.String environment_Analysis_TicketTicket__c,
           com.sforce.soap.enterprise.sobject._case environment_Analysis_TicketTicket__r,
           java.lang.String environment_Analysis_Ticket__c,
           com.sforce.soap.enterprise.sobject._case environment_Analysis_Ticket__r,
           java.util.Date escalation_Date__c,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.Boolean isDeleted,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           java.lang.String partner_ID__c,
           java.lang.String pass_Fail__c,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.String quarter__c,
           java.util.Date quarterly_Audit_Date__c,
           java.lang.String reason_for_Fail__c,
           java.util.Date results_Given_On__c,
           java.util.Calendar systemModstamp,
           java.util.Date ticket_Sent_Date__c) {
        super(
            fieldsToNull,
            id);
        this.attachments = attachments;
        this.audit_Notes__c = audit_Notes__c;
        this.best_in_Service__c = best_in_Service__c;
        this.best_in_Service__r = best_in_Service__r;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.data_Returned_Date__c = data_Returned_Date__c;
        this.environment_Analysis_Begin_Date__c = environment_Analysis_Begin_Date__c;
        this.environment_Analysis_End_Date__c = environment_Analysis_End_Date__c;
        this.environment_Analysis_TicketTicket__c = environment_Analysis_TicketTicket__c;
        this.environment_Analysis_TicketTicket__r = environment_Analysis_TicketTicket__r;
        this.environment_Analysis_Ticket__c = environment_Analysis_Ticket__c;
        this.environment_Analysis_Ticket__r = environment_Analysis_Ticket__r;
        this.escalation_Date__c = escalation_Date__c;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.histories = histories;
        this.isDeleted = isDeleted;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.partner_ID__c = partner_ID__c;
        this.pass_Fail__c = pass_Fail__c;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.quarter__c = quarter__c;
        this.quarterly_Audit_Date__c = quarterly_Audit_Date__c;
        this.reason_for_Fail__c = reason_for_Fail__c;
        this.results_Given_On__c = results_Given_On__c;
        this.systemModstamp = systemModstamp;
        this.ticket_Sent_Date__c = ticket_Sent_Date__c;
    }


    /**
     * Gets the attachments value for this BiS_Quarterly_Audit__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this BiS_Quarterly_Audit__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the audit_Notes__c value for this BiS_Quarterly_Audit__c.
     * 
     * @return audit_Notes__c
     */
    public java.lang.String getAudit_Notes__c() {
        return audit_Notes__c;
    }


    /**
     * Sets the audit_Notes__c value for this BiS_Quarterly_Audit__c.
     * 
     * @param audit_Notes__c
     */
    public void setAudit_Notes__c(java.lang.String audit_Notes__c) {
        this.audit_Notes__c = audit_Notes__c;
    }


    /**
     * Gets the best_in_Service__c value for this BiS_Quarterly_Audit__c.
     * 
     * @return best_in_Service__c
     */
    public java.lang.String getBest_in_Service__c() {
        return best_in_Service__c;
    }


    /**
     * Sets the best_in_Service__c value for this BiS_Quarterly_Audit__c.
     * 
     * @param best_in_Service__c
     */
    public void setBest_in_Service__c(java.lang.String best_in_Service__c) {
        this.best_in_Service__c = best_in_Service__c;
    }


    /**
     * Gets the best_in_Service__r value for this BiS_Quarterly_Audit__c.
     * 
     * @return best_in_Service__r
     */
    public com.sforce.soap.enterprise.sobject.Best_in_Service_Main__c getBest_in_Service__r() {
        return best_in_Service__r;
    }


    /**
     * Sets the best_in_Service__r value for this BiS_Quarterly_Audit__c.
     * 
     * @param best_in_Service__r
     */
    public void setBest_in_Service__r(com.sforce.soap.enterprise.sobject.Best_in_Service_Main__c best_in_Service__r) {
        this.best_in_Service__r = best_in_Service__r;
    }


    /**
     * Gets the createdBy value for this BiS_Quarterly_Audit__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this BiS_Quarterly_Audit__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this BiS_Quarterly_Audit__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this BiS_Quarterly_Audit__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this BiS_Quarterly_Audit__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this BiS_Quarterly_Audit__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the data_Returned_Date__c value for this BiS_Quarterly_Audit__c.
     * 
     * @return data_Returned_Date__c
     */
    public java.util.Date getData_Returned_Date__c() {
        return data_Returned_Date__c;
    }


    /**
     * Sets the data_Returned_Date__c value for this BiS_Quarterly_Audit__c.
     * 
     * @param data_Returned_Date__c
     */
    public void setData_Returned_Date__c(java.util.Date data_Returned_Date__c) {
        this.data_Returned_Date__c = data_Returned_Date__c;
    }


    /**
     * Gets the environment_Analysis_Begin_Date__c value for this BiS_Quarterly_Audit__c.
     * 
     * @return environment_Analysis_Begin_Date__c
     */
    public java.util.Date getEnvironment_Analysis_Begin_Date__c() {
        return environment_Analysis_Begin_Date__c;
    }


    /**
     * Sets the environment_Analysis_Begin_Date__c value for this BiS_Quarterly_Audit__c.
     * 
     * @param environment_Analysis_Begin_Date__c
     */
    public void setEnvironment_Analysis_Begin_Date__c(java.util.Date environment_Analysis_Begin_Date__c) {
        this.environment_Analysis_Begin_Date__c = environment_Analysis_Begin_Date__c;
    }


    /**
     * Gets the environment_Analysis_End_Date__c value for this BiS_Quarterly_Audit__c.
     * 
     * @return environment_Analysis_End_Date__c
     */
    public java.util.Date getEnvironment_Analysis_End_Date__c() {
        return environment_Analysis_End_Date__c;
    }


    /**
     * Sets the environment_Analysis_End_Date__c value for this BiS_Quarterly_Audit__c.
     * 
     * @param environment_Analysis_End_Date__c
     */
    public void setEnvironment_Analysis_End_Date__c(java.util.Date environment_Analysis_End_Date__c) {
        this.environment_Analysis_End_Date__c = environment_Analysis_End_Date__c;
    }


    /**
     * Gets the environment_Analysis_TicketTicket__c value for this BiS_Quarterly_Audit__c.
     * 
     * @return environment_Analysis_TicketTicket__c
     */
    public java.lang.String getEnvironment_Analysis_TicketTicket__c() {
        return environment_Analysis_TicketTicket__c;
    }


    /**
     * Sets the environment_Analysis_TicketTicket__c value for this BiS_Quarterly_Audit__c.
     * 
     * @param environment_Analysis_TicketTicket__c
     */
    public void setEnvironment_Analysis_TicketTicket__c(java.lang.String environment_Analysis_TicketTicket__c) {
        this.environment_Analysis_TicketTicket__c = environment_Analysis_TicketTicket__c;
    }


    /**
     * Gets the environment_Analysis_TicketTicket__r value for this BiS_Quarterly_Audit__c.
     * 
     * @return environment_Analysis_TicketTicket__r
     */
    public com.sforce.soap.enterprise.sobject._case getEnvironment_Analysis_TicketTicket__r() {
        return environment_Analysis_TicketTicket__r;
    }


    /**
     * Sets the environment_Analysis_TicketTicket__r value for this BiS_Quarterly_Audit__c.
     * 
     * @param environment_Analysis_TicketTicket__r
     */
    public void setEnvironment_Analysis_TicketTicket__r(com.sforce.soap.enterprise.sobject._case environment_Analysis_TicketTicket__r) {
        this.environment_Analysis_TicketTicket__r = environment_Analysis_TicketTicket__r;
    }


    /**
     * Gets the environment_Analysis_Ticket__c value for this BiS_Quarterly_Audit__c.
     * 
     * @return environment_Analysis_Ticket__c
     */
    public java.lang.String getEnvironment_Analysis_Ticket__c() {
        return environment_Analysis_Ticket__c;
    }


    /**
     * Sets the environment_Analysis_Ticket__c value for this BiS_Quarterly_Audit__c.
     * 
     * @param environment_Analysis_Ticket__c
     */
    public void setEnvironment_Analysis_Ticket__c(java.lang.String environment_Analysis_Ticket__c) {
        this.environment_Analysis_Ticket__c = environment_Analysis_Ticket__c;
    }


    /**
     * Gets the environment_Analysis_Ticket__r value for this BiS_Quarterly_Audit__c.
     * 
     * @return environment_Analysis_Ticket__r
     */
    public com.sforce.soap.enterprise.sobject._case getEnvironment_Analysis_Ticket__r() {
        return environment_Analysis_Ticket__r;
    }


    /**
     * Sets the environment_Analysis_Ticket__r value for this BiS_Quarterly_Audit__c.
     * 
     * @param environment_Analysis_Ticket__r
     */
    public void setEnvironment_Analysis_Ticket__r(com.sforce.soap.enterprise.sobject._case environment_Analysis_Ticket__r) {
        this.environment_Analysis_Ticket__r = environment_Analysis_Ticket__r;
    }


    /**
     * Gets the escalation_Date__c value for this BiS_Quarterly_Audit__c.
     * 
     * @return escalation_Date__c
     */
    public java.util.Date getEscalation_Date__c() {
        return escalation_Date__c;
    }


    /**
     * Sets the escalation_Date__c value for this BiS_Quarterly_Audit__c.
     * 
     * @param escalation_Date__c
     */
    public void setEscalation_Date__c(java.util.Date escalation_Date__c) {
        this.escalation_Date__c = escalation_Date__c;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this BiS_Quarterly_Audit__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this BiS_Quarterly_Audit__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the histories value for this BiS_Quarterly_Audit__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this BiS_Quarterly_Audit__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the isDeleted value for this BiS_Quarterly_Audit__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this BiS_Quarterly_Audit__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this BiS_Quarterly_Audit__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this BiS_Quarterly_Audit__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this BiS_Quarterly_Audit__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this BiS_Quarterly_Audit__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this BiS_Quarterly_Audit__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this BiS_Quarterly_Audit__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this BiS_Quarterly_Audit__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this BiS_Quarterly_Audit__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this BiS_Quarterly_Audit__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this BiS_Quarterly_Audit__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this BiS_Quarterly_Audit__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this BiS_Quarterly_Audit__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the partner_ID__c value for this BiS_Quarterly_Audit__c.
     * 
     * @return partner_ID__c
     */
    public java.lang.String getPartner_ID__c() {
        return partner_ID__c;
    }


    /**
     * Sets the partner_ID__c value for this BiS_Quarterly_Audit__c.
     * 
     * @param partner_ID__c
     */
    public void setPartner_ID__c(java.lang.String partner_ID__c) {
        this.partner_ID__c = partner_ID__c;
    }


    /**
     * Gets the pass_Fail__c value for this BiS_Quarterly_Audit__c.
     * 
     * @return pass_Fail__c
     */
    public java.lang.String getPass_Fail__c() {
        return pass_Fail__c;
    }


    /**
     * Sets the pass_Fail__c value for this BiS_Quarterly_Audit__c.
     * 
     * @param pass_Fail__c
     */
    public void setPass_Fail__c(java.lang.String pass_Fail__c) {
        this.pass_Fail__c = pass_Fail__c;
    }


    /**
     * Gets the processInstances value for this BiS_Quarterly_Audit__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this BiS_Quarterly_Audit__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this BiS_Quarterly_Audit__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this BiS_Quarterly_Audit__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the quarter__c value for this BiS_Quarterly_Audit__c.
     * 
     * @return quarter__c
     */
    public java.lang.String getQuarter__c() {
        return quarter__c;
    }


    /**
     * Sets the quarter__c value for this BiS_Quarterly_Audit__c.
     * 
     * @param quarter__c
     */
    public void setQuarter__c(java.lang.String quarter__c) {
        this.quarter__c = quarter__c;
    }


    /**
     * Gets the quarterly_Audit_Date__c value for this BiS_Quarterly_Audit__c.
     * 
     * @return quarterly_Audit_Date__c
     */
    public java.util.Date getQuarterly_Audit_Date__c() {
        return quarterly_Audit_Date__c;
    }


    /**
     * Sets the quarterly_Audit_Date__c value for this BiS_Quarterly_Audit__c.
     * 
     * @param quarterly_Audit_Date__c
     */
    public void setQuarterly_Audit_Date__c(java.util.Date quarterly_Audit_Date__c) {
        this.quarterly_Audit_Date__c = quarterly_Audit_Date__c;
    }


    /**
     * Gets the reason_for_Fail__c value for this BiS_Quarterly_Audit__c.
     * 
     * @return reason_for_Fail__c
     */
    public java.lang.String getReason_for_Fail__c() {
        return reason_for_Fail__c;
    }


    /**
     * Sets the reason_for_Fail__c value for this BiS_Quarterly_Audit__c.
     * 
     * @param reason_for_Fail__c
     */
    public void setReason_for_Fail__c(java.lang.String reason_for_Fail__c) {
        this.reason_for_Fail__c = reason_for_Fail__c;
    }


    /**
     * Gets the results_Given_On__c value for this BiS_Quarterly_Audit__c.
     * 
     * @return results_Given_On__c
     */
    public java.util.Date getResults_Given_On__c() {
        return results_Given_On__c;
    }


    /**
     * Sets the results_Given_On__c value for this BiS_Quarterly_Audit__c.
     * 
     * @param results_Given_On__c
     */
    public void setResults_Given_On__c(java.util.Date results_Given_On__c) {
        this.results_Given_On__c = results_Given_On__c;
    }


    /**
     * Gets the systemModstamp value for this BiS_Quarterly_Audit__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this BiS_Quarterly_Audit__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the ticket_Sent_Date__c value for this BiS_Quarterly_Audit__c.
     * 
     * @return ticket_Sent_Date__c
     */
    public java.util.Date getTicket_Sent_Date__c() {
        return ticket_Sent_Date__c;
    }


    /**
     * Sets the ticket_Sent_Date__c value for this BiS_Quarterly_Audit__c.
     * 
     * @param ticket_Sent_Date__c
     */
    public void setTicket_Sent_Date__c(java.util.Date ticket_Sent_Date__c) {
        this.ticket_Sent_Date__c = ticket_Sent_Date__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiS_Quarterly_Audit__c)) return false;
        BiS_Quarterly_Audit__c other = (BiS_Quarterly_Audit__c) obj;
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
            ((this.audit_Notes__c==null && other.getAudit_Notes__c()==null) || 
             (this.audit_Notes__c!=null &&
              this.audit_Notes__c.equals(other.getAudit_Notes__c()))) &&
            ((this.best_in_Service__c==null && other.getBest_in_Service__c()==null) || 
             (this.best_in_Service__c!=null &&
              this.best_in_Service__c.equals(other.getBest_in_Service__c()))) &&
            ((this.best_in_Service__r==null && other.getBest_in_Service__r()==null) || 
             (this.best_in_Service__r!=null &&
              this.best_in_Service__r.equals(other.getBest_in_Service__r()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.data_Returned_Date__c==null && other.getData_Returned_Date__c()==null) || 
             (this.data_Returned_Date__c!=null &&
              this.data_Returned_Date__c.equals(other.getData_Returned_Date__c()))) &&
            ((this.environment_Analysis_Begin_Date__c==null && other.getEnvironment_Analysis_Begin_Date__c()==null) || 
             (this.environment_Analysis_Begin_Date__c!=null &&
              this.environment_Analysis_Begin_Date__c.equals(other.getEnvironment_Analysis_Begin_Date__c()))) &&
            ((this.environment_Analysis_End_Date__c==null && other.getEnvironment_Analysis_End_Date__c()==null) || 
             (this.environment_Analysis_End_Date__c!=null &&
              this.environment_Analysis_End_Date__c.equals(other.getEnvironment_Analysis_End_Date__c()))) &&
            ((this.environment_Analysis_TicketTicket__c==null && other.getEnvironment_Analysis_TicketTicket__c()==null) || 
             (this.environment_Analysis_TicketTicket__c!=null &&
              this.environment_Analysis_TicketTicket__c.equals(other.getEnvironment_Analysis_TicketTicket__c()))) &&
            ((this.environment_Analysis_TicketTicket__r==null && other.getEnvironment_Analysis_TicketTicket__r()==null) || 
             (this.environment_Analysis_TicketTicket__r!=null &&
              this.environment_Analysis_TicketTicket__r.equals(other.getEnvironment_Analysis_TicketTicket__r()))) &&
            ((this.environment_Analysis_Ticket__c==null && other.getEnvironment_Analysis_Ticket__c()==null) || 
             (this.environment_Analysis_Ticket__c!=null &&
              this.environment_Analysis_Ticket__c.equals(other.getEnvironment_Analysis_Ticket__c()))) &&
            ((this.environment_Analysis_Ticket__r==null && other.getEnvironment_Analysis_Ticket__r()==null) || 
             (this.environment_Analysis_Ticket__r!=null &&
              this.environment_Analysis_Ticket__r.equals(other.getEnvironment_Analysis_Ticket__r()))) &&
            ((this.escalation_Date__c==null && other.getEscalation_Date__c()==null) || 
             (this.escalation_Date__c!=null &&
              this.escalation_Date__c.equals(other.getEscalation_Date__c()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
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
            ((this.partner_ID__c==null && other.getPartner_ID__c()==null) || 
             (this.partner_ID__c!=null &&
              this.partner_ID__c.equals(other.getPartner_ID__c()))) &&
            ((this.pass_Fail__c==null && other.getPass_Fail__c()==null) || 
             (this.pass_Fail__c!=null &&
              this.pass_Fail__c.equals(other.getPass_Fail__c()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.quarter__c==null && other.getQuarter__c()==null) || 
             (this.quarter__c!=null &&
              this.quarter__c.equals(other.getQuarter__c()))) &&
            ((this.quarterly_Audit_Date__c==null && other.getQuarterly_Audit_Date__c()==null) || 
             (this.quarterly_Audit_Date__c!=null &&
              this.quarterly_Audit_Date__c.equals(other.getQuarterly_Audit_Date__c()))) &&
            ((this.reason_for_Fail__c==null && other.getReason_for_Fail__c()==null) || 
             (this.reason_for_Fail__c!=null &&
              this.reason_for_Fail__c.equals(other.getReason_for_Fail__c()))) &&
            ((this.results_Given_On__c==null && other.getResults_Given_On__c()==null) || 
             (this.results_Given_On__c!=null &&
              this.results_Given_On__c.equals(other.getResults_Given_On__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.ticket_Sent_Date__c==null && other.getTicket_Sent_Date__c()==null) || 
             (this.ticket_Sent_Date__c!=null &&
              this.ticket_Sent_Date__c.equals(other.getTicket_Sent_Date__c())));
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
        if (getAudit_Notes__c() != null) {
            _hashCode += getAudit_Notes__c().hashCode();
        }
        if (getBest_in_Service__c() != null) {
            _hashCode += getBest_in_Service__c().hashCode();
        }
        if (getBest_in_Service__r() != null) {
            _hashCode += getBest_in_Service__r().hashCode();
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
        if (getData_Returned_Date__c() != null) {
            _hashCode += getData_Returned_Date__c().hashCode();
        }
        if (getEnvironment_Analysis_Begin_Date__c() != null) {
            _hashCode += getEnvironment_Analysis_Begin_Date__c().hashCode();
        }
        if (getEnvironment_Analysis_End_Date__c() != null) {
            _hashCode += getEnvironment_Analysis_End_Date__c().hashCode();
        }
        if (getEnvironment_Analysis_TicketTicket__c() != null) {
            _hashCode += getEnvironment_Analysis_TicketTicket__c().hashCode();
        }
        if (getEnvironment_Analysis_TicketTicket__r() != null) {
            _hashCode += getEnvironment_Analysis_TicketTicket__r().hashCode();
        }
        if (getEnvironment_Analysis_Ticket__c() != null) {
            _hashCode += getEnvironment_Analysis_Ticket__c().hashCode();
        }
        if (getEnvironment_Analysis_Ticket__r() != null) {
            _hashCode += getEnvironment_Analysis_Ticket__r().hashCode();
        }
        if (getEscalation_Date__c() != null) {
            _hashCode += getEscalation_Date__c().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getHistories() != null) {
            _hashCode += getHistories().hashCode();
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
        if (getPartner_ID__c() != null) {
            _hashCode += getPartner_ID__c().hashCode();
        }
        if (getPass_Fail__c() != null) {
            _hashCode += getPass_Fail__c().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getQuarter__c() != null) {
            _hashCode += getQuarter__c().hashCode();
        }
        if (getQuarterly_Audit_Date__c() != null) {
            _hashCode += getQuarterly_Audit_Date__c().hashCode();
        }
        if (getReason_for_Fail__c() != null) {
            _hashCode += getReason_for_Fail__c().hashCode();
        }
        if (getResults_Given_On__c() != null) {
            _hashCode += getResults_Given_On__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTicket_Sent_Date__c() != null) {
            _hashCode += getTicket_Sent_Date__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiS_Quarterly_Audit__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BiS_Quarterly_Audit__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audit_Notes__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Audit_Notes__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("best_in_Service__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Best_in_Service__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("best_in_Service__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Best_in_Service__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Best_in_Service_Main__c"));
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
        elemField.setFieldName("data_Returned_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Data_Returned_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environment_Analysis_Begin_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Environment_Analysis_Begin_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environment_Analysis_End_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Environment_Analysis_End_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environment_Analysis_TicketTicket__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Environment_Analysis_TicketTicket__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environment_Analysis_TicketTicket__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Environment_Analysis_TicketTicket__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environment_Analysis_Ticket__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Environment_Analysis_Ticket__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environment_Analysis_Ticket__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Environment_Analysis_Ticket__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalation_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Escalation_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("partner_ID__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Partner_ID__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pass_Fail__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pass_Fail__c"));
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
        elemField.setFieldName("quarter__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Quarter__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quarterly_Audit_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Quarterly_Audit_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason_for_Fail__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Reason_for_Fail__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("results_Given_On__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Results_Given_On__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("ticket_Sent_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Ticket_Sent_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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

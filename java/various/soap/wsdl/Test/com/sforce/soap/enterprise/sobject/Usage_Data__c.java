/**
 * Usage_Data__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Usage_Data__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String activity_Status__c;

    private java.lang.Double administrative_Contacts__c;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.Double billable_Data_Size__c;

    private java.lang.Double billable_Users__c;

    private java.lang.Double billable_and_Excluded_Users__c;

    private java.lang.Double CA_Native_Documents__c;

    private java.lang.Double CA_Native_Size_GB__c;

    private java.lang.Double CA_Total_Documents__c;

    private java.lang.Double CA_Total_GBs__c;

    private java.lang.Double CA_non_Native_Documents__c;

    private java.lang.Double CP_CA_Doc_Charges__c;

    private java.lang.Double CP_CA_Gig_Charge__c;

    private java.lang.Double CP_Non_Recurring_Charge__c;

    private java.lang.Double CP_Recurring_Charge__c;

    private java.lang.Double CP_Storage_Charge__c;

    private java.lang.Double CP_Total_Charge__c;

    private java.lang.Double CP_User_Charges__c;

    private java.lang.Double create_Count__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.Double DT_Search__c;

    private java.lang.Double delete_Count__c;

    private java.lang.Double document_Count__c;

    private java.lang.Double edit_Count__c;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.lang.Double file_Count__c;

    private java.lang.Double file_Size__c;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.Boolean isDeleted;

    private java.lang.Double LDF__c;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.Double MDF_Size_GB__c;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private java.lang.String notes__c;

    private java.lang.Double number_of_Excluded_Users__c;

    private java.lang.Double number_of_Reviewers__c;

    private java.lang.Double number_of_Users__c;

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private java.lang.String peak_Status__c;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.String relativity_Case__c;

    private com.sforce.soap.enterprise.sobject.Relativity_Case__c relativity_Case__r;

    private java.lang.String relativity_Version__c;

    private java.lang.Double SQL_FT__c;

    private com.sforce.soap.enterprise.QueryResult shares;

    private java.util.Calendar systemModstamp;

    private java.util.Date usage_Date__c;

    private java.lang.String usage_Month__c;

    private java.lang.String usage_Year__c;

    private java.lang.Boolean uses_New_Data_Format__c;

    private java.lang.Double view_Count__c;

    private java.lang.String year_Month__c;

    public Usage_Data__c() {
    }

    public Usage_Data__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String activity_Status__c,
           java.lang.Double administrative_Contacts__c,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.Double billable_Data_Size__c,
           java.lang.Double billable_Users__c,
           java.lang.Double billable_and_Excluded_Users__c,
           java.lang.Double CA_Native_Documents__c,
           java.lang.Double CA_Native_Size_GB__c,
           java.lang.Double CA_Total_Documents__c,
           java.lang.Double CA_Total_GBs__c,
           java.lang.Double CA_non_Native_Documents__c,
           java.lang.Double CP_CA_Doc_Charges__c,
           java.lang.Double CP_CA_Gig_Charge__c,
           java.lang.Double CP_Non_Recurring_Charge__c,
           java.lang.Double CP_Recurring_Charge__c,
           java.lang.Double CP_Storage_Charge__c,
           java.lang.Double CP_Total_Charge__c,
           java.lang.Double CP_User_Charges__c,
           java.lang.Double create_Count__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.Double DT_Search__c,
           java.lang.Double delete_Count__c,
           java.lang.Double document_Count__c,
           java.lang.Double edit_Count__c,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.lang.Double file_Count__c,
           java.lang.Double file_Size__c,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.Boolean isDeleted,
           java.lang.Double LDF__c,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.Double MDF_Size_GB__c,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           java.lang.String notes__c,
           java.lang.Double number_of_Excluded_Users__c,
           java.lang.Double number_of_Reviewers__c,
           java.lang.Double number_of_Users__c,
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           java.lang.String peak_Status__c,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.String relativity_Case__c,
           com.sforce.soap.enterprise.sobject.Relativity_Case__c relativity_Case__r,
           java.lang.String relativity_Version__c,
           java.lang.Double SQL_FT__c,
           com.sforce.soap.enterprise.QueryResult shares,
           java.util.Calendar systemModstamp,
           java.util.Date usage_Date__c,
           java.lang.String usage_Month__c,
           java.lang.String usage_Year__c,
           java.lang.Boolean uses_New_Data_Format__c,
           java.lang.Double view_Count__c,
           java.lang.String year_Month__c) {
        super(
            fieldsToNull,
            id);
        this.activity_Status__c = activity_Status__c;
        this.administrative_Contacts__c = administrative_Contacts__c;
        this.attachments = attachments;
        this.billable_Data_Size__c = billable_Data_Size__c;
        this.billable_Users__c = billable_Users__c;
        this.billable_and_Excluded_Users__c = billable_and_Excluded_Users__c;
        this.CA_Native_Documents__c = CA_Native_Documents__c;
        this.CA_Native_Size_GB__c = CA_Native_Size_GB__c;
        this.CA_Total_Documents__c = CA_Total_Documents__c;
        this.CA_Total_GBs__c = CA_Total_GBs__c;
        this.CA_non_Native_Documents__c = CA_non_Native_Documents__c;
        this.CP_CA_Doc_Charges__c = CP_CA_Doc_Charges__c;
        this.CP_CA_Gig_Charge__c = CP_CA_Gig_Charge__c;
        this.CP_Non_Recurring_Charge__c = CP_Non_Recurring_Charge__c;
        this.CP_Recurring_Charge__c = CP_Recurring_Charge__c;
        this.CP_Storage_Charge__c = CP_Storage_Charge__c;
        this.CP_Total_Charge__c = CP_Total_Charge__c;
        this.CP_User_Charges__c = CP_User_Charges__c;
        this.create_Count__c = create_Count__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.DT_Search__c = DT_Search__c;
        this.delete_Count__c = delete_Count__c;
        this.document_Count__c = document_Count__c;
        this.edit_Count__c = edit_Count__c;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.file_Count__c = file_Count__c;
        this.file_Size__c = file_Size__c;
        this.histories = histories;
        this.isDeleted = isDeleted;
        this.LDF__c = LDF__c;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.MDF_Size_GB__c = MDF_Size_GB__c;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.notes__c = notes__c;
        this.number_of_Excluded_Users__c = number_of_Excluded_Users__c;
        this.number_of_Reviewers__c = number_of_Reviewers__c;
        this.number_of_Users__c = number_of_Users__c;
        this.owner = owner;
        this.ownerId = ownerId;
        this.peak_Status__c = peak_Status__c;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.relativity_Case__c = relativity_Case__c;
        this.relativity_Case__r = relativity_Case__r;
        this.relativity_Version__c = relativity_Version__c;
        this.SQL_FT__c = SQL_FT__c;
        this.shares = shares;
        this.systemModstamp = systemModstamp;
        this.usage_Date__c = usage_Date__c;
        this.usage_Month__c = usage_Month__c;
        this.usage_Year__c = usage_Year__c;
        this.uses_New_Data_Format__c = uses_New_Data_Format__c;
        this.view_Count__c = view_Count__c;
        this.year_Month__c = year_Month__c;
    }


    /**
     * Gets the activity_Status__c value for this Usage_Data__c.
     * 
     * @return activity_Status__c
     */
    public java.lang.String getActivity_Status__c() {
        return activity_Status__c;
    }


    /**
     * Sets the activity_Status__c value for this Usage_Data__c.
     * 
     * @param activity_Status__c
     */
    public void setActivity_Status__c(java.lang.String activity_Status__c) {
        this.activity_Status__c = activity_Status__c;
    }


    /**
     * Gets the administrative_Contacts__c value for this Usage_Data__c.
     * 
     * @return administrative_Contacts__c
     */
    public java.lang.Double getAdministrative_Contacts__c() {
        return administrative_Contacts__c;
    }


    /**
     * Sets the administrative_Contacts__c value for this Usage_Data__c.
     * 
     * @param administrative_Contacts__c
     */
    public void setAdministrative_Contacts__c(java.lang.Double administrative_Contacts__c) {
        this.administrative_Contacts__c = administrative_Contacts__c;
    }


    /**
     * Gets the attachments value for this Usage_Data__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Usage_Data__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the billable_Data_Size__c value for this Usage_Data__c.
     * 
     * @return billable_Data_Size__c
     */
    public java.lang.Double getBillable_Data_Size__c() {
        return billable_Data_Size__c;
    }


    /**
     * Sets the billable_Data_Size__c value for this Usage_Data__c.
     * 
     * @param billable_Data_Size__c
     */
    public void setBillable_Data_Size__c(java.lang.Double billable_Data_Size__c) {
        this.billable_Data_Size__c = billable_Data_Size__c;
    }


    /**
     * Gets the billable_Users__c value for this Usage_Data__c.
     * 
     * @return billable_Users__c
     */
    public java.lang.Double getBillable_Users__c() {
        return billable_Users__c;
    }


    /**
     * Sets the billable_Users__c value for this Usage_Data__c.
     * 
     * @param billable_Users__c
     */
    public void setBillable_Users__c(java.lang.Double billable_Users__c) {
        this.billable_Users__c = billable_Users__c;
    }


    /**
     * Gets the billable_and_Excluded_Users__c value for this Usage_Data__c.
     * 
     * @return billable_and_Excluded_Users__c
     */
    public java.lang.Double getBillable_and_Excluded_Users__c() {
        return billable_and_Excluded_Users__c;
    }


    /**
     * Sets the billable_and_Excluded_Users__c value for this Usage_Data__c.
     * 
     * @param billable_and_Excluded_Users__c
     */
    public void setBillable_and_Excluded_Users__c(java.lang.Double billable_and_Excluded_Users__c) {
        this.billable_and_Excluded_Users__c = billable_and_Excluded_Users__c;
    }


    /**
     * Gets the CA_Native_Documents__c value for this Usage_Data__c.
     * 
     * @return CA_Native_Documents__c
     */
    public java.lang.Double getCA_Native_Documents__c() {
        return CA_Native_Documents__c;
    }


    /**
     * Sets the CA_Native_Documents__c value for this Usage_Data__c.
     * 
     * @param CA_Native_Documents__c
     */
    public void setCA_Native_Documents__c(java.lang.Double CA_Native_Documents__c) {
        this.CA_Native_Documents__c = CA_Native_Documents__c;
    }


    /**
     * Gets the CA_Native_Size_GB__c value for this Usage_Data__c.
     * 
     * @return CA_Native_Size_GB__c
     */
    public java.lang.Double getCA_Native_Size_GB__c() {
        return CA_Native_Size_GB__c;
    }


    /**
     * Sets the CA_Native_Size_GB__c value for this Usage_Data__c.
     * 
     * @param CA_Native_Size_GB__c
     */
    public void setCA_Native_Size_GB__c(java.lang.Double CA_Native_Size_GB__c) {
        this.CA_Native_Size_GB__c = CA_Native_Size_GB__c;
    }


    /**
     * Gets the CA_Total_Documents__c value for this Usage_Data__c.
     * 
     * @return CA_Total_Documents__c
     */
    public java.lang.Double getCA_Total_Documents__c() {
        return CA_Total_Documents__c;
    }


    /**
     * Sets the CA_Total_Documents__c value for this Usage_Data__c.
     * 
     * @param CA_Total_Documents__c
     */
    public void setCA_Total_Documents__c(java.lang.Double CA_Total_Documents__c) {
        this.CA_Total_Documents__c = CA_Total_Documents__c;
    }


    /**
     * Gets the CA_Total_GBs__c value for this Usage_Data__c.
     * 
     * @return CA_Total_GBs__c
     */
    public java.lang.Double getCA_Total_GBs__c() {
        return CA_Total_GBs__c;
    }


    /**
     * Sets the CA_Total_GBs__c value for this Usage_Data__c.
     * 
     * @param CA_Total_GBs__c
     */
    public void setCA_Total_GBs__c(java.lang.Double CA_Total_GBs__c) {
        this.CA_Total_GBs__c = CA_Total_GBs__c;
    }


    /**
     * Gets the CA_non_Native_Documents__c value for this Usage_Data__c.
     * 
     * @return CA_non_Native_Documents__c
     */
    public java.lang.Double getCA_non_Native_Documents__c() {
        return CA_non_Native_Documents__c;
    }


    /**
     * Sets the CA_non_Native_Documents__c value for this Usage_Data__c.
     * 
     * @param CA_non_Native_Documents__c
     */
    public void setCA_non_Native_Documents__c(java.lang.Double CA_non_Native_Documents__c) {
        this.CA_non_Native_Documents__c = CA_non_Native_Documents__c;
    }


    /**
     * Gets the CP_CA_Doc_Charges__c value for this Usage_Data__c.
     * 
     * @return CP_CA_Doc_Charges__c
     */
    public java.lang.Double getCP_CA_Doc_Charges__c() {
        return CP_CA_Doc_Charges__c;
    }


    /**
     * Sets the CP_CA_Doc_Charges__c value for this Usage_Data__c.
     * 
     * @param CP_CA_Doc_Charges__c
     */
    public void setCP_CA_Doc_Charges__c(java.lang.Double CP_CA_Doc_Charges__c) {
        this.CP_CA_Doc_Charges__c = CP_CA_Doc_Charges__c;
    }


    /**
     * Gets the CP_CA_Gig_Charge__c value for this Usage_Data__c.
     * 
     * @return CP_CA_Gig_Charge__c
     */
    public java.lang.Double getCP_CA_Gig_Charge__c() {
        return CP_CA_Gig_Charge__c;
    }


    /**
     * Sets the CP_CA_Gig_Charge__c value for this Usage_Data__c.
     * 
     * @param CP_CA_Gig_Charge__c
     */
    public void setCP_CA_Gig_Charge__c(java.lang.Double CP_CA_Gig_Charge__c) {
        this.CP_CA_Gig_Charge__c = CP_CA_Gig_Charge__c;
    }


    /**
     * Gets the CP_Non_Recurring_Charge__c value for this Usage_Data__c.
     * 
     * @return CP_Non_Recurring_Charge__c
     */
    public java.lang.Double getCP_Non_Recurring_Charge__c() {
        return CP_Non_Recurring_Charge__c;
    }


    /**
     * Sets the CP_Non_Recurring_Charge__c value for this Usage_Data__c.
     * 
     * @param CP_Non_Recurring_Charge__c
     */
    public void setCP_Non_Recurring_Charge__c(java.lang.Double CP_Non_Recurring_Charge__c) {
        this.CP_Non_Recurring_Charge__c = CP_Non_Recurring_Charge__c;
    }


    /**
     * Gets the CP_Recurring_Charge__c value for this Usage_Data__c.
     * 
     * @return CP_Recurring_Charge__c
     */
    public java.lang.Double getCP_Recurring_Charge__c() {
        return CP_Recurring_Charge__c;
    }


    /**
     * Sets the CP_Recurring_Charge__c value for this Usage_Data__c.
     * 
     * @param CP_Recurring_Charge__c
     */
    public void setCP_Recurring_Charge__c(java.lang.Double CP_Recurring_Charge__c) {
        this.CP_Recurring_Charge__c = CP_Recurring_Charge__c;
    }


    /**
     * Gets the CP_Storage_Charge__c value for this Usage_Data__c.
     * 
     * @return CP_Storage_Charge__c
     */
    public java.lang.Double getCP_Storage_Charge__c() {
        return CP_Storage_Charge__c;
    }


    /**
     * Sets the CP_Storage_Charge__c value for this Usage_Data__c.
     * 
     * @param CP_Storage_Charge__c
     */
    public void setCP_Storage_Charge__c(java.lang.Double CP_Storage_Charge__c) {
        this.CP_Storage_Charge__c = CP_Storage_Charge__c;
    }


    /**
     * Gets the CP_Total_Charge__c value for this Usage_Data__c.
     * 
     * @return CP_Total_Charge__c
     */
    public java.lang.Double getCP_Total_Charge__c() {
        return CP_Total_Charge__c;
    }


    /**
     * Sets the CP_Total_Charge__c value for this Usage_Data__c.
     * 
     * @param CP_Total_Charge__c
     */
    public void setCP_Total_Charge__c(java.lang.Double CP_Total_Charge__c) {
        this.CP_Total_Charge__c = CP_Total_Charge__c;
    }


    /**
     * Gets the CP_User_Charges__c value for this Usage_Data__c.
     * 
     * @return CP_User_Charges__c
     */
    public java.lang.Double getCP_User_Charges__c() {
        return CP_User_Charges__c;
    }


    /**
     * Sets the CP_User_Charges__c value for this Usage_Data__c.
     * 
     * @param CP_User_Charges__c
     */
    public void setCP_User_Charges__c(java.lang.Double CP_User_Charges__c) {
        this.CP_User_Charges__c = CP_User_Charges__c;
    }


    /**
     * Gets the create_Count__c value for this Usage_Data__c.
     * 
     * @return create_Count__c
     */
    public java.lang.Double getCreate_Count__c() {
        return create_Count__c;
    }


    /**
     * Sets the create_Count__c value for this Usage_Data__c.
     * 
     * @param create_Count__c
     */
    public void setCreate_Count__c(java.lang.Double create_Count__c) {
        this.create_Count__c = create_Count__c;
    }


    /**
     * Gets the createdBy value for this Usage_Data__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Usage_Data__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Usage_Data__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Usage_Data__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Usage_Data__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Usage_Data__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the DT_Search__c value for this Usage_Data__c.
     * 
     * @return DT_Search__c
     */
    public java.lang.Double getDT_Search__c() {
        return DT_Search__c;
    }


    /**
     * Sets the DT_Search__c value for this Usage_Data__c.
     * 
     * @param DT_Search__c
     */
    public void setDT_Search__c(java.lang.Double DT_Search__c) {
        this.DT_Search__c = DT_Search__c;
    }


    /**
     * Gets the delete_Count__c value for this Usage_Data__c.
     * 
     * @return delete_Count__c
     */
    public java.lang.Double getDelete_Count__c() {
        return delete_Count__c;
    }


    /**
     * Sets the delete_Count__c value for this Usage_Data__c.
     * 
     * @param delete_Count__c
     */
    public void setDelete_Count__c(java.lang.Double delete_Count__c) {
        this.delete_Count__c = delete_Count__c;
    }


    /**
     * Gets the document_Count__c value for this Usage_Data__c.
     * 
     * @return document_Count__c
     */
    public java.lang.Double getDocument_Count__c() {
        return document_Count__c;
    }


    /**
     * Sets the document_Count__c value for this Usage_Data__c.
     * 
     * @param document_Count__c
     */
    public void setDocument_Count__c(java.lang.Double document_Count__c) {
        this.document_Count__c = document_Count__c;
    }


    /**
     * Gets the edit_Count__c value for this Usage_Data__c.
     * 
     * @return edit_Count__c
     */
    public java.lang.Double getEdit_Count__c() {
        return edit_Count__c;
    }


    /**
     * Sets the edit_Count__c value for this Usage_Data__c.
     * 
     * @param edit_Count__c
     */
    public void setEdit_Count__c(java.lang.Double edit_Count__c) {
        this.edit_Count__c = edit_Count__c;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Usage_Data__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Usage_Data__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the file_Count__c value for this Usage_Data__c.
     * 
     * @return file_Count__c
     */
    public java.lang.Double getFile_Count__c() {
        return file_Count__c;
    }


    /**
     * Sets the file_Count__c value for this Usage_Data__c.
     * 
     * @param file_Count__c
     */
    public void setFile_Count__c(java.lang.Double file_Count__c) {
        this.file_Count__c = file_Count__c;
    }


    /**
     * Gets the file_Size__c value for this Usage_Data__c.
     * 
     * @return file_Size__c
     */
    public java.lang.Double getFile_Size__c() {
        return file_Size__c;
    }


    /**
     * Sets the file_Size__c value for this Usage_Data__c.
     * 
     * @param file_Size__c
     */
    public void setFile_Size__c(java.lang.Double file_Size__c) {
        this.file_Size__c = file_Size__c;
    }


    /**
     * Gets the histories value for this Usage_Data__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Usage_Data__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the isDeleted value for this Usage_Data__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Usage_Data__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the LDF__c value for this Usage_Data__c.
     * 
     * @return LDF__c
     */
    public java.lang.Double getLDF__c() {
        return LDF__c;
    }


    /**
     * Sets the LDF__c value for this Usage_Data__c.
     * 
     * @param LDF__c
     */
    public void setLDF__c(java.lang.Double LDF__c) {
        this.LDF__c = LDF__c;
    }


    /**
     * Gets the lastModifiedBy value for this Usage_Data__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Usage_Data__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Usage_Data__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Usage_Data__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Usage_Data__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Usage_Data__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the MDF_Size_GB__c value for this Usage_Data__c.
     * 
     * @return MDF_Size_GB__c
     */
    public java.lang.Double getMDF_Size_GB__c() {
        return MDF_Size_GB__c;
    }


    /**
     * Sets the MDF_Size_GB__c value for this Usage_Data__c.
     * 
     * @param MDF_Size_GB__c
     */
    public void setMDF_Size_GB__c(java.lang.Double MDF_Size_GB__c) {
        this.MDF_Size_GB__c = MDF_Size_GB__c;
    }


    /**
     * Gets the name value for this Usage_Data__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Usage_Data__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Usage_Data__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Usage_Data__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Usage_Data__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Usage_Data__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the notes__c value for this Usage_Data__c.
     * 
     * @return notes__c
     */
    public java.lang.String getNotes__c() {
        return notes__c;
    }


    /**
     * Sets the notes__c value for this Usage_Data__c.
     * 
     * @param notes__c
     */
    public void setNotes__c(java.lang.String notes__c) {
        this.notes__c = notes__c;
    }


    /**
     * Gets the number_of_Excluded_Users__c value for this Usage_Data__c.
     * 
     * @return number_of_Excluded_Users__c
     */
    public java.lang.Double getNumber_of_Excluded_Users__c() {
        return number_of_Excluded_Users__c;
    }


    /**
     * Sets the number_of_Excluded_Users__c value for this Usage_Data__c.
     * 
     * @param number_of_Excluded_Users__c
     */
    public void setNumber_of_Excluded_Users__c(java.lang.Double number_of_Excluded_Users__c) {
        this.number_of_Excluded_Users__c = number_of_Excluded_Users__c;
    }


    /**
     * Gets the number_of_Reviewers__c value for this Usage_Data__c.
     * 
     * @return number_of_Reviewers__c
     */
    public java.lang.Double getNumber_of_Reviewers__c() {
        return number_of_Reviewers__c;
    }


    /**
     * Sets the number_of_Reviewers__c value for this Usage_Data__c.
     * 
     * @param number_of_Reviewers__c
     */
    public void setNumber_of_Reviewers__c(java.lang.Double number_of_Reviewers__c) {
        this.number_of_Reviewers__c = number_of_Reviewers__c;
    }


    /**
     * Gets the number_of_Users__c value for this Usage_Data__c.
     * 
     * @return number_of_Users__c
     */
    public java.lang.Double getNumber_of_Users__c() {
        return number_of_Users__c;
    }


    /**
     * Sets the number_of_Users__c value for this Usage_Data__c.
     * 
     * @param number_of_Users__c
     */
    public void setNumber_of_Users__c(java.lang.Double number_of_Users__c) {
        this.number_of_Users__c = number_of_Users__c;
    }


    /**
     * Gets the owner value for this Usage_Data__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Usage_Data__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Usage_Data__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Usage_Data__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the peak_Status__c value for this Usage_Data__c.
     * 
     * @return peak_Status__c
     */
    public java.lang.String getPeak_Status__c() {
        return peak_Status__c;
    }


    /**
     * Sets the peak_Status__c value for this Usage_Data__c.
     * 
     * @param peak_Status__c
     */
    public void setPeak_Status__c(java.lang.String peak_Status__c) {
        this.peak_Status__c = peak_Status__c;
    }


    /**
     * Gets the processInstances value for this Usage_Data__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Usage_Data__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Usage_Data__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Usage_Data__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the relativity_Case__c value for this Usage_Data__c.
     * 
     * @return relativity_Case__c
     */
    public java.lang.String getRelativity_Case__c() {
        return relativity_Case__c;
    }


    /**
     * Sets the relativity_Case__c value for this Usage_Data__c.
     * 
     * @param relativity_Case__c
     */
    public void setRelativity_Case__c(java.lang.String relativity_Case__c) {
        this.relativity_Case__c = relativity_Case__c;
    }


    /**
     * Gets the relativity_Case__r value for this Usage_Data__c.
     * 
     * @return relativity_Case__r
     */
    public com.sforce.soap.enterprise.sobject.Relativity_Case__c getRelativity_Case__r() {
        return relativity_Case__r;
    }


    /**
     * Sets the relativity_Case__r value for this Usage_Data__c.
     * 
     * @param relativity_Case__r
     */
    public void setRelativity_Case__r(com.sforce.soap.enterprise.sobject.Relativity_Case__c relativity_Case__r) {
        this.relativity_Case__r = relativity_Case__r;
    }


    /**
     * Gets the relativity_Version__c value for this Usage_Data__c.
     * 
     * @return relativity_Version__c
     */
    public java.lang.String getRelativity_Version__c() {
        return relativity_Version__c;
    }


    /**
     * Sets the relativity_Version__c value for this Usage_Data__c.
     * 
     * @param relativity_Version__c
     */
    public void setRelativity_Version__c(java.lang.String relativity_Version__c) {
        this.relativity_Version__c = relativity_Version__c;
    }


    /**
     * Gets the SQL_FT__c value for this Usage_Data__c.
     * 
     * @return SQL_FT__c
     */
    public java.lang.Double getSQL_FT__c() {
        return SQL_FT__c;
    }


    /**
     * Sets the SQL_FT__c value for this Usage_Data__c.
     * 
     * @param SQL_FT__c
     */
    public void setSQL_FT__c(java.lang.Double SQL_FT__c) {
        this.SQL_FT__c = SQL_FT__c;
    }


    /**
     * Gets the shares value for this Usage_Data__c.
     * 
     * @return shares
     */
    public com.sforce.soap.enterprise.QueryResult getShares() {
        return shares;
    }


    /**
     * Sets the shares value for this Usage_Data__c.
     * 
     * @param shares
     */
    public void setShares(com.sforce.soap.enterprise.QueryResult shares) {
        this.shares = shares;
    }


    /**
     * Gets the systemModstamp value for this Usage_Data__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Usage_Data__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the usage_Date__c value for this Usage_Data__c.
     * 
     * @return usage_Date__c
     */
    public java.util.Date getUsage_Date__c() {
        return usage_Date__c;
    }


    /**
     * Sets the usage_Date__c value for this Usage_Data__c.
     * 
     * @param usage_Date__c
     */
    public void setUsage_Date__c(java.util.Date usage_Date__c) {
        this.usage_Date__c = usage_Date__c;
    }


    /**
     * Gets the usage_Month__c value for this Usage_Data__c.
     * 
     * @return usage_Month__c
     */
    public java.lang.String getUsage_Month__c() {
        return usage_Month__c;
    }


    /**
     * Sets the usage_Month__c value for this Usage_Data__c.
     * 
     * @param usage_Month__c
     */
    public void setUsage_Month__c(java.lang.String usage_Month__c) {
        this.usage_Month__c = usage_Month__c;
    }


    /**
     * Gets the usage_Year__c value for this Usage_Data__c.
     * 
     * @return usage_Year__c
     */
    public java.lang.String getUsage_Year__c() {
        return usage_Year__c;
    }


    /**
     * Sets the usage_Year__c value for this Usage_Data__c.
     * 
     * @param usage_Year__c
     */
    public void setUsage_Year__c(java.lang.String usage_Year__c) {
        this.usage_Year__c = usage_Year__c;
    }


    /**
     * Gets the uses_New_Data_Format__c value for this Usage_Data__c.
     * 
     * @return uses_New_Data_Format__c
     */
    public java.lang.Boolean getUses_New_Data_Format__c() {
        return uses_New_Data_Format__c;
    }


    /**
     * Sets the uses_New_Data_Format__c value for this Usage_Data__c.
     * 
     * @param uses_New_Data_Format__c
     */
    public void setUses_New_Data_Format__c(java.lang.Boolean uses_New_Data_Format__c) {
        this.uses_New_Data_Format__c = uses_New_Data_Format__c;
    }


    /**
     * Gets the view_Count__c value for this Usage_Data__c.
     * 
     * @return view_Count__c
     */
    public java.lang.Double getView_Count__c() {
        return view_Count__c;
    }


    /**
     * Sets the view_Count__c value for this Usage_Data__c.
     * 
     * @param view_Count__c
     */
    public void setView_Count__c(java.lang.Double view_Count__c) {
        this.view_Count__c = view_Count__c;
    }


    /**
     * Gets the year_Month__c value for this Usage_Data__c.
     * 
     * @return year_Month__c
     */
    public java.lang.String getYear_Month__c() {
        return year_Month__c;
    }


    /**
     * Sets the year_Month__c value for this Usage_Data__c.
     * 
     * @param year_Month__c
     */
    public void setYear_Month__c(java.lang.String year_Month__c) {
        this.year_Month__c = year_Month__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Usage_Data__c)) return false;
        Usage_Data__c other = (Usage_Data__c) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.activity_Status__c==null && other.getActivity_Status__c()==null) || 
             (this.activity_Status__c!=null &&
              this.activity_Status__c.equals(other.getActivity_Status__c()))) &&
            ((this.administrative_Contacts__c==null && other.getAdministrative_Contacts__c()==null) || 
             (this.administrative_Contacts__c!=null &&
              this.administrative_Contacts__c.equals(other.getAdministrative_Contacts__c()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.billable_Data_Size__c==null && other.getBillable_Data_Size__c()==null) || 
             (this.billable_Data_Size__c!=null &&
              this.billable_Data_Size__c.equals(other.getBillable_Data_Size__c()))) &&
            ((this.billable_Users__c==null && other.getBillable_Users__c()==null) || 
             (this.billable_Users__c!=null &&
              this.billable_Users__c.equals(other.getBillable_Users__c()))) &&
            ((this.billable_and_Excluded_Users__c==null && other.getBillable_and_Excluded_Users__c()==null) || 
             (this.billable_and_Excluded_Users__c!=null &&
              this.billable_and_Excluded_Users__c.equals(other.getBillable_and_Excluded_Users__c()))) &&
            ((this.CA_Native_Documents__c==null && other.getCA_Native_Documents__c()==null) || 
             (this.CA_Native_Documents__c!=null &&
              this.CA_Native_Documents__c.equals(other.getCA_Native_Documents__c()))) &&
            ((this.CA_Native_Size_GB__c==null && other.getCA_Native_Size_GB__c()==null) || 
             (this.CA_Native_Size_GB__c!=null &&
              this.CA_Native_Size_GB__c.equals(other.getCA_Native_Size_GB__c()))) &&
            ((this.CA_Total_Documents__c==null && other.getCA_Total_Documents__c()==null) || 
             (this.CA_Total_Documents__c!=null &&
              this.CA_Total_Documents__c.equals(other.getCA_Total_Documents__c()))) &&
            ((this.CA_Total_GBs__c==null && other.getCA_Total_GBs__c()==null) || 
             (this.CA_Total_GBs__c!=null &&
              this.CA_Total_GBs__c.equals(other.getCA_Total_GBs__c()))) &&
            ((this.CA_non_Native_Documents__c==null && other.getCA_non_Native_Documents__c()==null) || 
             (this.CA_non_Native_Documents__c!=null &&
              this.CA_non_Native_Documents__c.equals(other.getCA_non_Native_Documents__c()))) &&
            ((this.CP_CA_Doc_Charges__c==null && other.getCP_CA_Doc_Charges__c()==null) || 
             (this.CP_CA_Doc_Charges__c!=null &&
              this.CP_CA_Doc_Charges__c.equals(other.getCP_CA_Doc_Charges__c()))) &&
            ((this.CP_CA_Gig_Charge__c==null && other.getCP_CA_Gig_Charge__c()==null) || 
             (this.CP_CA_Gig_Charge__c!=null &&
              this.CP_CA_Gig_Charge__c.equals(other.getCP_CA_Gig_Charge__c()))) &&
            ((this.CP_Non_Recurring_Charge__c==null && other.getCP_Non_Recurring_Charge__c()==null) || 
             (this.CP_Non_Recurring_Charge__c!=null &&
              this.CP_Non_Recurring_Charge__c.equals(other.getCP_Non_Recurring_Charge__c()))) &&
            ((this.CP_Recurring_Charge__c==null && other.getCP_Recurring_Charge__c()==null) || 
             (this.CP_Recurring_Charge__c!=null &&
              this.CP_Recurring_Charge__c.equals(other.getCP_Recurring_Charge__c()))) &&
            ((this.CP_Storage_Charge__c==null && other.getCP_Storage_Charge__c()==null) || 
             (this.CP_Storage_Charge__c!=null &&
              this.CP_Storage_Charge__c.equals(other.getCP_Storage_Charge__c()))) &&
            ((this.CP_Total_Charge__c==null && other.getCP_Total_Charge__c()==null) || 
             (this.CP_Total_Charge__c!=null &&
              this.CP_Total_Charge__c.equals(other.getCP_Total_Charge__c()))) &&
            ((this.CP_User_Charges__c==null && other.getCP_User_Charges__c()==null) || 
             (this.CP_User_Charges__c!=null &&
              this.CP_User_Charges__c.equals(other.getCP_User_Charges__c()))) &&
            ((this.create_Count__c==null && other.getCreate_Count__c()==null) || 
             (this.create_Count__c!=null &&
              this.create_Count__c.equals(other.getCreate_Count__c()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.DT_Search__c==null && other.getDT_Search__c()==null) || 
             (this.DT_Search__c!=null &&
              this.DT_Search__c.equals(other.getDT_Search__c()))) &&
            ((this.delete_Count__c==null && other.getDelete_Count__c()==null) || 
             (this.delete_Count__c!=null &&
              this.delete_Count__c.equals(other.getDelete_Count__c()))) &&
            ((this.document_Count__c==null && other.getDocument_Count__c()==null) || 
             (this.document_Count__c!=null &&
              this.document_Count__c.equals(other.getDocument_Count__c()))) &&
            ((this.edit_Count__c==null && other.getEdit_Count__c()==null) || 
             (this.edit_Count__c!=null &&
              this.edit_Count__c.equals(other.getEdit_Count__c()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.file_Count__c==null && other.getFile_Count__c()==null) || 
             (this.file_Count__c!=null &&
              this.file_Count__c.equals(other.getFile_Count__c()))) &&
            ((this.file_Size__c==null && other.getFile_Size__c()==null) || 
             (this.file_Size__c!=null &&
              this.file_Size__c.equals(other.getFile_Size__c()))) &&
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.LDF__c==null && other.getLDF__c()==null) || 
             (this.LDF__c!=null &&
              this.LDF__c.equals(other.getLDF__c()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.MDF_Size_GB__c==null && other.getMDF_Size_GB__c()==null) || 
             (this.MDF_Size_GB__c!=null &&
              this.MDF_Size_GB__c.equals(other.getMDF_Size_GB__c()))) &&
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
            ((this.number_of_Excluded_Users__c==null && other.getNumber_of_Excluded_Users__c()==null) || 
             (this.number_of_Excluded_Users__c!=null &&
              this.number_of_Excluded_Users__c.equals(other.getNumber_of_Excluded_Users__c()))) &&
            ((this.number_of_Reviewers__c==null && other.getNumber_of_Reviewers__c()==null) || 
             (this.number_of_Reviewers__c!=null &&
              this.number_of_Reviewers__c.equals(other.getNumber_of_Reviewers__c()))) &&
            ((this.number_of_Users__c==null && other.getNumber_of_Users__c()==null) || 
             (this.number_of_Users__c!=null &&
              this.number_of_Users__c.equals(other.getNumber_of_Users__c()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.peak_Status__c==null && other.getPeak_Status__c()==null) || 
             (this.peak_Status__c!=null &&
              this.peak_Status__c.equals(other.getPeak_Status__c()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.relativity_Case__c==null && other.getRelativity_Case__c()==null) || 
             (this.relativity_Case__c!=null &&
              this.relativity_Case__c.equals(other.getRelativity_Case__c()))) &&
            ((this.relativity_Case__r==null && other.getRelativity_Case__r()==null) || 
             (this.relativity_Case__r!=null &&
              this.relativity_Case__r.equals(other.getRelativity_Case__r()))) &&
            ((this.relativity_Version__c==null && other.getRelativity_Version__c()==null) || 
             (this.relativity_Version__c!=null &&
              this.relativity_Version__c.equals(other.getRelativity_Version__c()))) &&
            ((this.SQL_FT__c==null && other.getSQL_FT__c()==null) || 
             (this.SQL_FT__c!=null &&
              this.SQL_FT__c.equals(other.getSQL_FT__c()))) &&
            ((this.shares==null && other.getShares()==null) || 
             (this.shares!=null &&
              this.shares.equals(other.getShares()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.usage_Date__c==null && other.getUsage_Date__c()==null) || 
             (this.usage_Date__c!=null &&
              this.usage_Date__c.equals(other.getUsage_Date__c()))) &&
            ((this.usage_Month__c==null && other.getUsage_Month__c()==null) || 
             (this.usage_Month__c!=null &&
              this.usage_Month__c.equals(other.getUsage_Month__c()))) &&
            ((this.usage_Year__c==null && other.getUsage_Year__c()==null) || 
             (this.usage_Year__c!=null &&
              this.usage_Year__c.equals(other.getUsage_Year__c()))) &&
            ((this.uses_New_Data_Format__c==null && other.getUses_New_Data_Format__c()==null) || 
             (this.uses_New_Data_Format__c!=null &&
              this.uses_New_Data_Format__c.equals(other.getUses_New_Data_Format__c()))) &&
            ((this.view_Count__c==null && other.getView_Count__c()==null) || 
             (this.view_Count__c!=null &&
              this.view_Count__c.equals(other.getView_Count__c()))) &&
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
        if (getActivity_Status__c() != null) {
            _hashCode += getActivity_Status__c().hashCode();
        }
        if (getAdministrative_Contacts__c() != null) {
            _hashCode += getAdministrative_Contacts__c().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getBillable_Data_Size__c() != null) {
            _hashCode += getBillable_Data_Size__c().hashCode();
        }
        if (getBillable_Users__c() != null) {
            _hashCode += getBillable_Users__c().hashCode();
        }
        if (getBillable_and_Excluded_Users__c() != null) {
            _hashCode += getBillable_and_Excluded_Users__c().hashCode();
        }
        if (getCA_Native_Documents__c() != null) {
            _hashCode += getCA_Native_Documents__c().hashCode();
        }
        if (getCA_Native_Size_GB__c() != null) {
            _hashCode += getCA_Native_Size_GB__c().hashCode();
        }
        if (getCA_Total_Documents__c() != null) {
            _hashCode += getCA_Total_Documents__c().hashCode();
        }
        if (getCA_Total_GBs__c() != null) {
            _hashCode += getCA_Total_GBs__c().hashCode();
        }
        if (getCA_non_Native_Documents__c() != null) {
            _hashCode += getCA_non_Native_Documents__c().hashCode();
        }
        if (getCP_CA_Doc_Charges__c() != null) {
            _hashCode += getCP_CA_Doc_Charges__c().hashCode();
        }
        if (getCP_CA_Gig_Charge__c() != null) {
            _hashCode += getCP_CA_Gig_Charge__c().hashCode();
        }
        if (getCP_Non_Recurring_Charge__c() != null) {
            _hashCode += getCP_Non_Recurring_Charge__c().hashCode();
        }
        if (getCP_Recurring_Charge__c() != null) {
            _hashCode += getCP_Recurring_Charge__c().hashCode();
        }
        if (getCP_Storage_Charge__c() != null) {
            _hashCode += getCP_Storage_Charge__c().hashCode();
        }
        if (getCP_Total_Charge__c() != null) {
            _hashCode += getCP_Total_Charge__c().hashCode();
        }
        if (getCP_User_Charges__c() != null) {
            _hashCode += getCP_User_Charges__c().hashCode();
        }
        if (getCreate_Count__c() != null) {
            _hashCode += getCreate_Count__c().hashCode();
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
        if (getDT_Search__c() != null) {
            _hashCode += getDT_Search__c().hashCode();
        }
        if (getDelete_Count__c() != null) {
            _hashCode += getDelete_Count__c().hashCode();
        }
        if (getDocument_Count__c() != null) {
            _hashCode += getDocument_Count__c().hashCode();
        }
        if (getEdit_Count__c() != null) {
            _hashCode += getEdit_Count__c().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getFile_Count__c() != null) {
            _hashCode += getFile_Count__c().hashCode();
        }
        if (getFile_Size__c() != null) {
            _hashCode += getFile_Size__c().hashCode();
        }
        if (getHistories() != null) {
            _hashCode += getHistories().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getLDF__c() != null) {
            _hashCode += getLDF__c().hashCode();
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
        if (getMDF_Size_GB__c() != null) {
            _hashCode += getMDF_Size_GB__c().hashCode();
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
        if (getNumber_of_Excluded_Users__c() != null) {
            _hashCode += getNumber_of_Excluded_Users__c().hashCode();
        }
        if (getNumber_of_Reviewers__c() != null) {
            _hashCode += getNumber_of_Reviewers__c().hashCode();
        }
        if (getNumber_of_Users__c() != null) {
            _hashCode += getNumber_of_Users__c().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getPeak_Status__c() != null) {
            _hashCode += getPeak_Status__c().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getRelativity_Case__c() != null) {
            _hashCode += getRelativity_Case__c().hashCode();
        }
        if (getRelativity_Case__r() != null) {
            _hashCode += getRelativity_Case__r().hashCode();
        }
        if (getRelativity_Version__c() != null) {
            _hashCode += getRelativity_Version__c().hashCode();
        }
        if (getSQL_FT__c() != null) {
            _hashCode += getSQL_FT__c().hashCode();
        }
        if (getShares() != null) {
            _hashCode += getShares().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getUsage_Date__c() != null) {
            _hashCode += getUsage_Date__c().hashCode();
        }
        if (getUsage_Month__c() != null) {
            _hashCode += getUsage_Month__c().hashCode();
        }
        if (getUsage_Year__c() != null) {
            _hashCode += getUsage_Year__c().hashCode();
        }
        if (getUses_New_Data_Format__c() != null) {
            _hashCode += getUses_New_Data_Format__c().hashCode();
        }
        if (getView_Count__c() != null) {
            _hashCode += getView_Count__c().hashCode();
        }
        if (getYear_Month__c() != null) {
            _hashCode += getYear_Month__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Usage_Data__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Usage_Data__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activity_Status__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Activity_Status__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("administrative_Contacts__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Administrative_Contacts__c"));
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
        elemField.setFieldName("billable_Data_Size__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Billable_Data_Size__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billable_Users__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Billable_Users__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billable_and_Excluded_Users__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Billable_and_Excluded_Users__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CA_Native_Documents__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CA_Native_Documents__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CA_Native_Size_GB__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CA_Native_Size_GB__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CA_Total_Documents__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CA_Total_Documents__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CA_Total_GBs__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CA_Total_GBs__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CA_non_Native_Documents__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CA_non_Native_Documents__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CP_CA_Doc_Charges__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CP_CA_Doc_Charges__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CP_CA_Gig_Charge__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CP_CA_Gig_Charge__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CP_Non_Recurring_Charge__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CP_Non_Recurring_Charge__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CP_Recurring_Charge__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CP_Recurring_Charge__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CP_Storage_Charge__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CP_Storage_Charge__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CP_Total_Charge__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CP_Total_Charge__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CP_User_Charges__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CP_User_Charges__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("create_Count__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Create_Count__c"));
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
        elemField.setFieldName("DT_Search__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DT_Search__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delete_Count__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Delete_Count__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("document_Count__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Document_Count__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("edit_Count__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Edit_Count__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("file_Count__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "File_Count__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file_Size__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "File_Size__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("LDF__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LDF__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("MDF_Size_GB__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MDF_Size_GB__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("number_of_Excluded_Users__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Number_of_Excluded_Users__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number_of_Reviewers__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Number_of_Reviewers__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number_of_Users__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Number_of_Users__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("peak_Status__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Peak_Status__c"));
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
        elemField.setFieldName("relativity_Version__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relativity_Version__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SQL_FT__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SQL_FT__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("systemModstamp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SystemModstamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usage_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Usage_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usage_Month__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Usage_Month__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usage_Year__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Usage_Year__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uses_New_Data_Format__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Uses_New_Data_Format__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("view_Count__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "View_Count__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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

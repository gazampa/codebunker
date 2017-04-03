/**
 * Data_File__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Data_File__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String beginning_Bates__c;

    private java.lang.String copy_Files_to_Repository__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String data_Load_File_Status__c;

    private java.lang.String data_Load_Source_Encoding__c;

    private java.lang.String error_File_Location__c;

    private java.lang.String extracted_Text_Included_in_Load__c;

    private java.lang.String extracted_Text_Source_Encoding__c;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.lang.String first_Line_Contains_Column_Names__c;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.String image_File_Included__c;

    private java.lang.String image_File_Type__c;

    private java.lang.String image_Load_File_Name__c;

    private java.lang.Boolean isDeleted;

    private java.lang.String KWE_File_Name__c;

    private java.lang.String KWE_Included__c;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String load_Extracted_Text_with_Image__c;

    private java.lang.String location_of_Data_to_Load__c;

    private java.lang.String location_of_Image_File_Data__c;

    private java.lang.String name;

    private java.lang.String natives_Included_in_Load__c;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.String production_Import__c;

    private java.lang.String production_Name__c;

    private java.lang.String relative_File_Path_Used_for_Images__c;

    private java.lang.String relative_File_Paths_Used__c;

    private java.util.Calendar systemModstamp;

    private java.lang.String ticket__c;

    private com.sforce.soap.enterprise.sobject._case ticket__r;

    private java.lang.String type_of_Data_Import__c;

    private java.lang.String type_of_Image_Import__c;

    private java.lang.String user_Image_Auto_Number__c;

    public Data_File__c() {
    }

    public Data_File__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String beginning_Bates__c,
           java.lang.String copy_Files_to_Repository__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String data_Load_File_Status__c,
           java.lang.String data_Load_Source_Encoding__c,
           java.lang.String error_File_Location__c,
           java.lang.String extracted_Text_Included_in_Load__c,
           java.lang.String extracted_Text_Source_Encoding__c,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.lang.String first_Line_Contains_Column_Names__c,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.String image_File_Included__c,
           java.lang.String image_File_Type__c,
           java.lang.String image_Load_File_Name__c,
           java.lang.Boolean isDeleted,
           java.lang.String KWE_File_Name__c,
           java.lang.String KWE_Included__c,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String load_Extracted_Text_with_Image__c,
           java.lang.String location_of_Data_to_Load__c,
           java.lang.String location_of_Image_File_Data__c,
           java.lang.String name,
           java.lang.String natives_Included_in_Load__c,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.String production_Import__c,
           java.lang.String production_Name__c,
           java.lang.String relative_File_Path_Used_for_Images__c,
           java.lang.String relative_File_Paths_Used__c,
           java.util.Calendar systemModstamp,
           java.lang.String ticket__c,
           com.sforce.soap.enterprise.sobject._case ticket__r,
           java.lang.String type_of_Data_Import__c,
           java.lang.String type_of_Image_Import__c,
           java.lang.String user_Image_Auto_Number__c) {
        super(
            fieldsToNull,
            id);
        this.attachments = attachments;
        this.beginning_Bates__c = beginning_Bates__c;
        this.copy_Files_to_Repository__c = copy_Files_to_Repository__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.data_Load_File_Status__c = data_Load_File_Status__c;
        this.data_Load_Source_Encoding__c = data_Load_Source_Encoding__c;
        this.error_File_Location__c = error_File_Location__c;
        this.extracted_Text_Included_in_Load__c = extracted_Text_Included_in_Load__c;
        this.extracted_Text_Source_Encoding__c = extracted_Text_Source_Encoding__c;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.first_Line_Contains_Column_Names__c = first_Line_Contains_Column_Names__c;
        this.histories = histories;
        this.image_File_Included__c = image_File_Included__c;
        this.image_File_Type__c = image_File_Type__c;
        this.image_Load_File_Name__c = image_Load_File_Name__c;
        this.isDeleted = isDeleted;
        this.KWE_File_Name__c = KWE_File_Name__c;
        this.KWE_Included__c = KWE_Included__c;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.load_Extracted_Text_with_Image__c = load_Extracted_Text_with_Image__c;
        this.location_of_Data_to_Load__c = location_of_Data_to_Load__c;
        this.location_of_Image_File_Data__c = location_of_Image_File_Data__c;
        this.name = name;
        this.natives_Included_in_Load__c = natives_Included_in_Load__c;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.production_Import__c = production_Import__c;
        this.production_Name__c = production_Name__c;
        this.relative_File_Path_Used_for_Images__c = relative_File_Path_Used_for_Images__c;
        this.relative_File_Paths_Used__c = relative_File_Paths_Used__c;
        this.systemModstamp = systemModstamp;
        this.ticket__c = ticket__c;
        this.ticket__r = ticket__r;
        this.type_of_Data_Import__c = type_of_Data_Import__c;
        this.type_of_Image_Import__c = type_of_Image_Import__c;
        this.user_Image_Auto_Number__c = user_Image_Auto_Number__c;
    }


    /**
     * Gets the attachments value for this Data_File__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Data_File__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the beginning_Bates__c value for this Data_File__c.
     * 
     * @return beginning_Bates__c
     */
    public java.lang.String getBeginning_Bates__c() {
        return beginning_Bates__c;
    }


    /**
     * Sets the beginning_Bates__c value for this Data_File__c.
     * 
     * @param beginning_Bates__c
     */
    public void setBeginning_Bates__c(java.lang.String beginning_Bates__c) {
        this.beginning_Bates__c = beginning_Bates__c;
    }


    /**
     * Gets the copy_Files_to_Repository__c value for this Data_File__c.
     * 
     * @return copy_Files_to_Repository__c
     */
    public java.lang.String getCopy_Files_to_Repository__c() {
        return copy_Files_to_Repository__c;
    }


    /**
     * Sets the copy_Files_to_Repository__c value for this Data_File__c.
     * 
     * @param copy_Files_to_Repository__c
     */
    public void setCopy_Files_to_Repository__c(java.lang.String copy_Files_to_Repository__c) {
        this.copy_Files_to_Repository__c = copy_Files_to_Repository__c;
    }


    /**
     * Gets the createdBy value for this Data_File__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Data_File__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Data_File__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Data_File__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Data_File__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Data_File__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the data_Load_File_Status__c value for this Data_File__c.
     * 
     * @return data_Load_File_Status__c
     */
    public java.lang.String getData_Load_File_Status__c() {
        return data_Load_File_Status__c;
    }


    /**
     * Sets the data_Load_File_Status__c value for this Data_File__c.
     * 
     * @param data_Load_File_Status__c
     */
    public void setData_Load_File_Status__c(java.lang.String data_Load_File_Status__c) {
        this.data_Load_File_Status__c = data_Load_File_Status__c;
    }


    /**
     * Gets the data_Load_Source_Encoding__c value for this Data_File__c.
     * 
     * @return data_Load_Source_Encoding__c
     */
    public java.lang.String getData_Load_Source_Encoding__c() {
        return data_Load_Source_Encoding__c;
    }


    /**
     * Sets the data_Load_Source_Encoding__c value for this Data_File__c.
     * 
     * @param data_Load_Source_Encoding__c
     */
    public void setData_Load_Source_Encoding__c(java.lang.String data_Load_Source_Encoding__c) {
        this.data_Load_Source_Encoding__c = data_Load_Source_Encoding__c;
    }


    /**
     * Gets the error_File_Location__c value for this Data_File__c.
     * 
     * @return error_File_Location__c
     */
    public java.lang.String getError_File_Location__c() {
        return error_File_Location__c;
    }


    /**
     * Sets the error_File_Location__c value for this Data_File__c.
     * 
     * @param error_File_Location__c
     */
    public void setError_File_Location__c(java.lang.String error_File_Location__c) {
        this.error_File_Location__c = error_File_Location__c;
    }


    /**
     * Gets the extracted_Text_Included_in_Load__c value for this Data_File__c.
     * 
     * @return extracted_Text_Included_in_Load__c
     */
    public java.lang.String getExtracted_Text_Included_in_Load__c() {
        return extracted_Text_Included_in_Load__c;
    }


    /**
     * Sets the extracted_Text_Included_in_Load__c value for this Data_File__c.
     * 
     * @param extracted_Text_Included_in_Load__c
     */
    public void setExtracted_Text_Included_in_Load__c(java.lang.String extracted_Text_Included_in_Load__c) {
        this.extracted_Text_Included_in_Load__c = extracted_Text_Included_in_Load__c;
    }


    /**
     * Gets the extracted_Text_Source_Encoding__c value for this Data_File__c.
     * 
     * @return extracted_Text_Source_Encoding__c
     */
    public java.lang.String getExtracted_Text_Source_Encoding__c() {
        return extracted_Text_Source_Encoding__c;
    }


    /**
     * Sets the extracted_Text_Source_Encoding__c value for this Data_File__c.
     * 
     * @param extracted_Text_Source_Encoding__c
     */
    public void setExtracted_Text_Source_Encoding__c(java.lang.String extracted_Text_Source_Encoding__c) {
        this.extracted_Text_Source_Encoding__c = extracted_Text_Source_Encoding__c;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Data_File__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Data_File__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the first_Line_Contains_Column_Names__c value for this Data_File__c.
     * 
     * @return first_Line_Contains_Column_Names__c
     */
    public java.lang.String getFirst_Line_Contains_Column_Names__c() {
        return first_Line_Contains_Column_Names__c;
    }


    /**
     * Sets the first_Line_Contains_Column_Names__c value for this Data_File__c.
     * 
     * @param first_Line_Contains_Column_Names__c
     */
    public void setFirst_Line_Contains_Column_Names__c(java.lang.String first_Line_Contains_Column_Names__c) {
        this.first_Line_Contains_Column_Names__c = first_Line_Contains_Column_Names__c;
    }


    /**
     * Gets the histories value for this Data_File__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Data_File__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the image_File_Included__c value for this Data_File__c.
     * 
     * @return image_File_Included__c
     */
    public java.lang.String getImage_File_Included__c() {
        return image_File_Included__c;
    }


    /**
     * Sets the image_File_Included__c value for this Data_File__c.
     * 
     * @param image_File_Included__c
     */
    public void setImage_File_Included__c(java.lang.String image_File_Included__c) {
        this.image_File_Included__c = image_File_Included__c;
    }


    /**
     * Gets the image_File_Type__c value for this Data_File__c.
     * 
     * @return image_File_Type__c
     */
    public java.lang.String getImage_File_Type__c() {
        return image_File_Type__c;
    }


    /**
     * Sets the image_File_Type__c value for this Data_File__c.
     * 
     * @param image_File_Type__c
     */
    public void setImage_File_Type__c(java.lang.String image_File_Type__c) {
        this.image_File_Type__c = image_File_Type__c;
    }


    /**
     * Gets the image_Load_File_Name__c value for this Data_File__c.
     * 
     * @return image_Load_File_Name__c
     */
    public java.lang.String getImage_Load_File_Name__c() {
        return image_Load_File_Name__c;
    }


    /**
     * Sets the image_Load_File_Name__c value for this Data_File__c.
     * 
     * @param image_Load_File_Name__c
     */
    public void setImage_Load_File_Name__c(java.lang.String image_Load_File_Name__c) {
        this.image_Load_File_Name__c = image_Load_File_Name__c;
    }


    /**
     * Gets the isDeleted value for this Data_File__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Data_File__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the KWE_File_Name__c value for this Data_File__c.
     * 
     * @return KWE_File_Name__c
     */
    public java.lang.String getKWE_File_Name__c() {
        return KWE_File_Name__c;
    }


    /**
     * Sets the KWE_File_Name__c value for this Data_File__c.
     * 
     * @param KWE_File_Name__c
     */
    public void setKWE_File_Name__c(java.lang.String KWE_File_Name__c) {
        this.KWE_File_Name__c = KWE_File_Name__c;
    }


    /**
     * Gets the KWE_Included__c value for this Data_File__c.
     * 
     * @return KWE_Included__c
     */
    public java.lang.String getKWE_Included__c() {
        return KWE_Included__c;
    }


    /**
     * Sets the KWE_Included__c value for this Data_File__c.
     * 
     * @param KWE_Included__c
     */
    public void setKWE_Included__c(java.lang.String KWE_Included__c) {
        this.KWE_Included__c = KWE_Included__c;
    }


    /**
     * Gets the lastModifiedBy value for this Data_File__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Data_File__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Data_File__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Data_File__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Data_File__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Data_File__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the load_Extracted_Text_with_Image__c value for this Data_File__c.
     * 
     * @return load_Extracted_Text_with_Image__c
     */
    public java.lang.String getLoad_Extracted_Text_with_Image__c() {
        return load_Extracted_Text_with_Image__c;
    }


    /**
     * Sets the load_Extracted_Text_with_Image__c value for this Data_File__c.
     * 
     * @param load_Extracted_Text_with_Image__c
     */
    public void setLoad_Extracted_Text_with_Image__c(java.lang.String load_Extracted_Text_with_Image__c) {
        this.load_Extracted_Text_with_Image__c = load_Extracted_Text_with_Image__c;
    }


    /**
     * Gets the location_of_Data_to_Load__c value for this Data_File__c.
     * 
     * @return location_of_Data_to_Load__c
     */
    public java.lang.String getLocation_of_Data_to_Load__c() {
        return location_of_Data_to_Load__c;
    }


    /**
     * Sets the location_of_Data_to_Load__c value for this Data_File__c.
     * 
     * @param location_of_Data_to_Load__c
     */
    public void setLocation_of_Data_to_Load__c(java.lang.String location_of_Data_to_Load__c) {
        this.location_of_Data_to_Load__c = location_of_Data_to_Load__c;
    }


    /**
     * Gets the location_of_Image_File_Data__c value for this Data_File__c.
     * 
     * @return location_of_Image_File_Data__c
     */
    public java.lang.String getLocation_of_Image_File_Data__c() {
        return location_of_Image_File_Data__c;
    }


    /**
     * Sets the location_of_Image_File_Data__c value for this Data_File__c.
     * 
     * @param location_of_Image_File_Data__c
     */
    public void setLocation_of_Image_File_Data__c(java.lang.String location_of_Image_File_Data__c) {
        this.location_of_Image_File_Data__c = location_of_Image_File_Data__c;
    }


    /**
     * Gets the name value for this Data_File__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Data_File__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the natives_Included_in_Load__c value for this Data_File__c.
     * 
     * @return natives_Included_in_Load__c
     */
    public java.lang.String getNatives_Included_in_Load__c() {
        return natives_Included_in_Load__c;
    }


    /**
     * Sets the natives_Included_in_Load__c value for this Data_File__c.
     * 
     * @param natives_Included_in_Load__c
     */
    public void setNatives_Included_in_Load__c(java.lang.String natives_Included_in_Load__c) {
        this.natives_Included_in_Load__c = natives_Included_in_Load__c;
    }


    /**
     * Gets the notes value for this Data_File__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Data_File__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Data_File__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Data_File__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the processInstances value for this Data_File__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Data_File__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Data_File__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Data_File__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the production_Import__c value for this Data_File__c.
     * 
     * @return production_Import__c
     */
    public java.lang.String getProduction_Import__c() {
        return production_Import__c;
    }


    /**
     * Sets the production_Import__c value for this Data_File__c.
     * 
     * @param production_Import__c
     */
    public void setProduction_Import__c(java.lang.String production_Import__c) {
        this.production_Import__c = production_Import__c;
    }


    /**
     * Gets the production_Name__c value for this Data_File__c.
     * 
     * @return production_Name__c
     */
    public java.lang.String getProduction_Name__c() {
        return production_Name__c;
    }


    /**
     * Sets the production_Name__c value for this Data_File__c.
     * 
     * @param production_Name__c
     */
    public void setProduction_Name__c(java.lang.String production_Name__c) {
        this.production_Name__c = production_Name__c;
    }


    /**
     * Gets the relative_File_Path_Used_for_Images__c value for this Data_File__c.
     * 
     * @return relative_File_Path_Used_for_Images__c
     */
    public java.lang.String getRelative_File_Path_Used_for_Images__c() {
        return relative_File_Path_Used_for_Images__c;
    }


    /**
     * Sets the relative_File_Path_Used_for_Images__c value for this Data_File__c.
     * 
     * @param relative_File_Path_Used_for_Images__c
     */
    public void setRelative_File_Path_Used_for_Images__c(java.lang.String relative_File_Path_Used_for_Images__c) {
        this.relative_File_Path_Used_for_Images__c = relative_File_Path_Used_for_Images__c;
    }


    /**
     * Gets the relative_File_Paths_Used__c value for this Data_File__c.
     * 
     * @return relative_File_Paths_Used__c
     */
    public java.lang.String getRelative_File_Paths_Used__c() {
        return relative_File_Paths_Used__c;
    }


    /**
     * Sets the relative_File_Paths_Used__c value for this Data_File__c.
     * 
     * @param relative_File_Paths_Used__c
     */
    public void setRelative_File_Paths_Used__c(java.lang.String relative_File_Paths_Used__c) {
        this.relative_File_Paths_Used__c = relative_File_Paths_Used__c;
    }


    /**
     * Gets the systemModstamp value for this Data_File__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Data_File__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the ticket__c value for this Data_File__c.
     * 
     * @return ticket__c
     */
    public java.lang.String getTicket__c() {
        return ticket__c;
    }


    /**
     * Sets the ticket__c value for this Data_File__c.
     * 
     * @param ticket__c
     */
    public void setTicket__c(java.lang.String ticket__c) {
        this.ticket__c = ticket__c;
    }


    /**
     * Gets the ticket__r value for this Data_File__c.
     * 
     * @return ticket__r
     */
    public com.sforce.soap.enterprise.sobject._case getTicket__r() {
        return ticket__r;
    }


    /**
     * Sets the ticket__r value for this Data_File__c.
     * 
     * @param ticket__r
     */
    public void setTicket__r(com.sforce.soap.enterprise.sobject._case ticket__r) {
        this.ticket__r = ticket__r;
    }


    /**
     * Gets the type_of_Data_Import__c value for this Data_File__c.
     * 
     * @return type_of_Data_Import__c
     */
    public java.lang.String getType_of_Data_Import__c() {
        return type_of_Data_Import__c;
    }


    /**
     * Sets the type_of_Data_Import__c value for this Data_File__c.
     * 
     * @param type_of_Data_Import__c
     */
    public void setType_of_Data_Import__c(java.lang.String type_of_Data_Import__c) {
        this.type_of_Data_Import__c = type_of_Data_Import__c;
    }


    /**
     * Gets the type_of_Image_Import__c value for this Data_File__c.
     * 
     * @return type_of_Image_Import__c
     */
    public java.lang.String getType_of_Image_Import__c() {
        return type_of_Image_Import__c;
    }


    /**
     * Sets the type_of_Image_Import__c value for this Data_File__c.
     * 
     * @param type_of_Image_Import__c
     */
    public void setType_of_Image_Import__c(java.lang.String type_of_Image_Import__c) {
        this.type_of_Image_Import__c = type_of_Image_Import__c;
    }


    /**
     * Gets the user_Image_Auto_Number__c value for this Data_File__c.
     * 
     * @return user_Image_Auto_Number__c
     */
    public java.lang.String getUser_Image_Auto_Number__c() {
        return user_Image_Auto_Number__c;
    }


    /**
     * Sets the user_Image_Auto_Number__c value for this Data_File__c.
     * 
     * @param user_Image_Auto_Number__c
     */
    public void setUser_Image_Auto_Number__c(java.lang.String user_Image_Auto_Number__c) {
        this.user_Image_Auto_Number__c = user_Image_Auto_Number__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Data_File__c)) return false;
        Data_File__c other = (Data_File__c) obj;
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
            ((this.beginning_Bates__c==null && other.getBeginning_Bates__c()==null) || 
             (this.beginning_Bates__c!=null &&
              this.beginning_Bates__c.equals(other.getBeginning_Bates__c()))) &&
            ((this.copy_Files_to_Repository__c==null && other.getCopy_Files_to_Repository__c()==null) || 
             (this.copy_Files_to_Repository__c!=null &&
              this.copy_Files_to_Repository__c.equals(other.getCopy_Files_to_Repository__c()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.data_Load_File_Status__c==null && other.getData_Load_File_Status__c()==null) || 
             (this.data_Load_File_Status__c!=null &&
              this.data_Load_File_Status__c.equals(other.getData_Load_File_Status__c()))) &&
            ((this.data_Load_Source_Encoding__c==null && other.getData_Load_Source_Encoding__c()==null) || 
             (this.data_Load_Source_Encoding__c!=null &&
              this.data_Load_Source_Encoding__c.equals(other.getData_Load_Source_Encoding__c()))) &&
            ((this.error_File_Location__c==null && other.getError_File_Location__c()==null) || 
             (this.error_File_Location__c!=null &&
              this.error_File_Location__c.equals(other.getError_File_Location__c()))) &&
            ((this.extracted_Text_Included_in_Load__c==null && other.getExtracted_Text_Included_in_Load__c()==null) || 
             (this.extracted_Text_Included_in_Load__c!=null &&
              this.extracted_Text_Included_in_Load__c.equals(other.getExtracted_Text_Included_in_Load__c()))) &&
            ((this.extracted_Text_Source_Encoding__c==null && other.getExtracted_Text_Source_Encoding__c()==null) || 
             (this.extracted_Text_Source_Encoding__c!=null &&
              this.extracted_Text_Source_Encoding__c.equals(other.getExtracted_Text_Source_Encoding__c()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.first_Line_Contains_Column_Names__c==null && other.getFirst_Line_Contains_Column_Names__c()==null) || 
             (this.first_Line_Contains_Column_Names__c!=null &&
              this.first_Line_Contains_Column_Names__c.equals(other.getFirst_Line_Contains_Column_Names__c()))) &&
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
            ((this.image_File_Included__c==null && other.getImage_File_Included__c()==null) || 
             (this.image_File_Included__c!=null &&
              this.image_File_Included__c.equals(other.getImage_File_Included__c()))) &&
            ((this.image_File_Type__c==null && other.getImage_File_Type__c()==null) || 
             (this.image_File_Type__c!=null &&
              this.image_File_Type__c.equals(other.getImage_File_Type__c()))) &&
            ((this.image_Load_File_Name__c==null && other.getImage_Load_File_Name__c()==null) || 
             (this.image_Load_File_Name__c!=null &&
              this.image_Load_File_Name__c.equals(other.getImage_Load_File_Name__c()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.KWE_File_Name__c==null && other.getKWE_File_Name__c()==null) || 
             (this.KWE_File_Name__c!=null &&
              this.KWE_File_Name__c.equals(other.getKWE_File_Name__c()))) &&
            ((this.KWE_Included__c==null && other.getKWE_Included__c()==null) || 
             (this.KWE_Included__c!=null &&
              this.KWE_Included__c.equals(other.getKWE_Included__c()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.load_Extracted_Text_with_Image__c==null && other.getLoad_Extracted_Text_with_Image__c()==null) || 
             (this.load_Extracted_Text_with_Image__c!=null &&
              this.load_Extracted_Text_with_Image__c.equals(other.getLoad_Extracted_Text_with_Image__c()))) &&
            ((this.location_of_Data_to_Load__c==null && other.getLocation_of_Data_to_Load__c()==null) || 
             (this.location_of_Data_to_Load__c!=null &&
              this.location_of_Data_to_Load__c.equals(other.getLocation_of_Data_to_Load__c()))) &&
            ((this.location_of_Image_File_Data__c==null && other.getLocation_of_Image_File_Data__c()==null) || 
             (this.location_of_Image_File_Data__c!=null &&
              this.location_of_Image_File_Data__c.equals(other.getLocation_of_Image_File_Data__c()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.natives_Included_in_Load__c==null && other.getNatives_Included_in_Load__c()==null) || 
             (this.natives_Included_in_Load__c!=null &&
              this.natives_Included_in_Load__c.equals(other.getNatives_Included_in_Load__c()))) &&
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
            ((this.production_Import__c==null && other.getProduction_Import__c()==null) || 
             (this.production_Import__c!=null &&
              this.production_Import__c.equals(other.getProduction_Import__c()))) &&
            ((this.production_Name__c==null && other.getProduction_Name__c()==null) || 
             (this.production_Name__c!=null &&
              this.production_Name__c.equals(other.getProduction_Name__c()))) &&
            ((this.relative_File_Path_Used_for_Images__c==null && other.getRelative_File_Path_Used_for_Images__c()==null) || 
             (this.relative_File_Path_Used_for_Images__c!=null &&
              this.relative_File_Path_Used_for_Images__c.equals(other.getRelative_File_Path_Used_for_Images__c()))) &&
            ((this.relative_File_Paths_Used__c==null && other.getRelative_File_Paths_Used__c()==null) || 
             (this.relative_File_Paths_Used__c!=null &&
              this.relative_File_Paths_Used__c.equals(other.getRelative_File_Paths_Used__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.ticket__c==null && other.getTicket__c()==null) || 
             (this.ticket__c!=null &&
              this.ticket__c.equals(other.getTicket__c()))) &&
            ((this.ticket__r==null && other.getTicket__r()==null) || 
             (this.ticket__r!=null &&
              this.ticket__r.equals(other.getTicket__r()))) &&
            ((this.type_of_Data_Import__c==null && other.getType_of_Data_Import__c()==null) || 
             (this.type_of_Data_Import__c!=null &&
              this.type_of_Data_Import__c.equals(other.getType_of_Data_Import__c()))) &&
            ((this.type_of_Image_Import__c==null && other.getType_of_Image_Import__c()==null) || 
             (this.type_of_Image_Import__c!=null &&
              this.type_of_Image_Import__c.equals(other.getType_of_Image_Import__c()))) &&
            ((this.user_Image_Auto_Number__c==null && other.getUser_Image_Auto_Number__c()==null) || 
             (this.user_Image_Auto_Number__c!=null &&
              this.user_Image_Auto_Number__c.equals(other.getUser_Image_Auto_Number__c())));
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
        if (getBeginning_Bates__c() != null) {
            _hashCode += getBeginning_Bates__c().hashCode();
        }
        if (getCopy_Files_to_Repository__c() != null) {
            _hashCode += getCopy_Files_to_Repository__c().hashCode();
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
        if (getData_Load_File_Status__c() != null) {
            _hashCode += getData_Load_File_Status__c().hashCode();
        }
        if (getData_Load_Source_Encoding__c() != null) {
            _hashCode += getData_Load_Source_Encoding__c().hashCode();
        }
        if (getError_File_Location__c() != null) {
            _hashCode += getError_File_Location__c().hashCode();
        }
        if (getExtracted_Text_Included_in_Load__c() != null) {
            _hashCode += getExtracted_Text_Included_in_Load__c().hashCode();
        }
        if (getExtracted_Text_Source_Encoding__c() != null) {
            _hashCode += getExtracted_Text_Source_Encoding__c().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getFirst_Line_Contains_Column_Names__c() != null) {
            _hashCode += getFirst_Line_Contains_Column_Names__c().hashCode();
        }
        if (getHistories() != null) {
            _hashCode += getHistories().hashCode();
        }
        if (getImage_File_Included__c() != null) {
            _hashCode += getImage_File_Included__c().hashCode();
        }
        if (getImage_File_Type__c() != null) {
            _hashCode += getImage_File_Type__c().hashCode();
        }
        if (getImage_Load_File_Name__c() != null) {
            _hashCode += getImage_Load_File_Name__c().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getKWE_File_Name__c() != null) {
            _hashCode += getKWE_File_Name__c().hashCode();
        }
        if (getKWE_Included__c() != null) {
            _hashCode += getKWE_Included__c().hashCode();
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
        if (getLoad_Extracted_Text_with_Image__c() != null) {
            _hashCode += getLoad_Extracted_Text_with_Image__c().hashCode();
        }
        if (getLocation_of_Data_to_Load__c() != null) {
            _hashCode += getLocation_of_Data_to_Load__c().hashCode();
        }
        if (getLocation_of_Image_File_Data__c() != null) {
            _hashCode += getLocation_of_Image_File_Data__c().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNatives_Included_in_Load__c() != null) {
            _hashCode += getNatives_Included_in_Load__c().hashCode();
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
        if (getProduction_Import__c() != null) {
            _hashCode += getProduction_Import__c().hashCode();
        }
        if (getProduction_Name__c() != null) {
            _hashCode += getProduction_Name__c().hashCode();
        }
        if (getRelative_File_Path_Used_for_Images__c() != null) {
            _hashCode += getRelative_File_Path_Used_for_Images__c().hashCode();
        }
        if (getRelative_File_Paths_Used__c() != null) {
            _hashCode += getRelative_File_Paths_Used__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTicket__c() != null) {
            _hashCode += getTicket__c().hashCode();
        }
        if (getTicket__r() != null) {
            _hashCode += getTicket__r().hashCode();
        }
        if (getType_of_Data_Import__c() != null) {
            _hashCode += getType_of_Data_Import__c().hashCode();
        }
        if (getType_of_Image_Import__c() != null) {
            _hashCode += getType_of_Image_Import__c().hashCode();
        }
        if (getUser_Image_Auto_Number__c() != null) {
            _hashCode += getUser_Image_Auto_Number__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Data_File__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Data_File__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beginning_Bates__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Beginning_Bates__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copy_Files_to_Repository__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Copy_Files_to_Repository__c"));
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
        elemField.setFieldName("data_Load_File_Status__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Data_Load_File_Status__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data_Load_Source_Encoding__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Data_Load_Source_Encoding__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error_File_Location__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Error_File_Location__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extracted_Text_Included_in_Load__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Extracted_Text_Included_in_Load__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extracted_Text_Source_Encoding__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Extracted_Text_Source_Encoding__c"));
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
        elemField.setFieldName("first_Line_Contains_Column_Names__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "First_Line_Contains_Column_Names__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("image_File_Included__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Image_File_Included__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image_File_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Image_File_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image_Load_File_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Image_Load_File_Name__c"));
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
        elemField.setFieldName("KWE_File_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "KWE_File_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KWE_Included__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "KWE_Included__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("load_Extracted_Text_with_Image__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Load_Extracted_Text_with_Image__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location_of_Data_to_Load__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Location_of_Data_to_Load__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location_of_Image_File_Data__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Location_of_Image_File_Data__c"));
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
        elemField.setFieldName("natives_Included_in_Load__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Natives_Included_in_Load__c"));
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
        elemField.setFieldName("production_Import__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Production_Import__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("production_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Production_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relative_File_Path_Used_for_Images__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relative_File_Path_Used_for_Images__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relative_File_Paths_Used__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relative_File_Paths_Used__c"));
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
        elemField.setFieldName("ticket__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Ticket__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticket__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Ticket__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type_of_Data_Import__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Type_of_Data_Import__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type_of_Image_Import__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Type_of_Image_Import__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_Image_Auto_Number__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User_Image_Auto_Number__c"));
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

/**
 * Article_and_Category_Reporting__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Article_and_Category_Reporting__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String articleNumber__c;

    private java.lang.String article_Type__c;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.util.Calendar createdDate__c;

    private java.lang.String created_By_Name__c;

    private java.lang.String created_By__c;

    private com.sforce.soap.enterprise.sobject.User created_By__r;

    private java.lang.String creator_del__c;

    private java.lang.String details__c;

    private java.lang.String error_Text_2__c;

    private java.lang.String error_Text__c;

    private java.lang.String feature_Category__c;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.util.Calendar firstPublishedDate__c;

    private java.lang.Boolean isDeleted;

    private java.lang.Boolean isVisibleInApp__c;

    private java.lang.Boolean isVisibleInCsp__c;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.util.Calendar lastModifiedDate__c;

    private java.util.Calendar lastPublishedDate__c;

    private java.lang.String last_Modified_By__c;

    private com.sforce.soap.enterprise.sobject.User last_Modified_By__r;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.String product__c;

    private java.lang.String publishStatus__c;

    private java.lang.String solution_ID__c;

    private java.lang.String solution_Number__c;

    private java.lang.String summary__c;

    private java.util.Calendar systemModstamp;

    private java.lang.String title__c;

    public Article_and_Category_Reporting__c() {
    }

    public Article_and_Category_Reporting__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String articleNumber__c,
           java.lang.String article_Type__c,
           com.sforce.soap.enterprise.QueryResult attachments,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.util.Calendar createdDate__c,
           java.lang.String created_By_Name__c,
           java.lang.String created_By__c,
           com.sforce.soap.enterprise.sobject.User created_By__r,
           java.lang.String creator_del__c,
           java.lang.String details__c,
           java.lang.String error_Text_2__c,
           java.lang.String error_Text__c,
           java.lang.String feature_Category__c,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.util.Calendar firstPublishedDate__c,
           java.lang.Boolean isDeleted,
           java.lang.Boolean isVisibleInApp__c,
           java.lang.Boolean isVisibleInCsp__c,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.util.Calendar lastModifiedDate__c,
           java.util.Calendar lastPublishedDate__c,
           java.lang.String last_Modified_By__c,
           com.sforce.soap.enterprise.sobject.User last_Modified_By__r,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.String product__c,
           java.lang.String publishStatus__c,
           java.lang.String solution_ID__c,
           java.lang.String solution_Number__c,
           java.lang.String summary__c,
           java.util.Calendar systemModstamp,
           java.lang.String title__c) {
        super(
            fieldsToNull,
            id);
        this.articleNumber__c = articleNumber__c;
        this.article_Type__c = article_Type__c;
        this.attachments = attachments;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.createdDate__c = createdDate__c;
        this.created_By_Name__c = created_By_Name__c;
        this.created_By__c = created_By__c;
        this.created_By__r = created_By__r;
        this.creator_del__c = creator_del__c;
        this.details__c = details__c;
        this.error_Text_2__c = error_Text_2__c;
        this.error_Text__c = error_Text__c;
        this.feature_Category__c = feature_Category__c;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.firstPublishedDate__c = firstPublishedDate__c;
        this.isDeleted = isDeleted;
        this.isVisibleInApp__c = isVisibleInApp__c;
        this.isVisibleInCsp__c = isVisibleInCsp__c;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.lastModifiedDate__c = lastModifiedDate__c;
        this.lastPublishedDate__c = lastPublishedDate__c;
        this.last_Modified_By__c = last_Modified_By__c;
        this.last_Modified_By__r = last_Modified_By__r;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.owner = owner;
        this.ownerId = ownerId;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.product__c = product__c;
        this.publishStatus__c = publishStatus__c;
        this.solution_ID__c = solution_ID__c;
        this.solution_Number__c = solution_Number__c;
        this.summary__c = summary__c;
        this.systemModstamp = systemModstamp;
        this.title__c = title__c;
    }


    /**
     * Gets the articleNumber__c value for this Article_and_Category_Reporting__c.
     * 
     * @return articleNumber__c
     */
    public java.lang.String getArticleNumber__c() {
        return articleNumber__c;
    }


    /**
     * Sets the articleNumber__c value for this Article_and_Category_Reporting__c.
     * 
     * @param articleNumber__c
     */
    public void setArticleNumber__c(java.lang.String articleNumber__c) {
        this.articleNumber__c = articleNumber__c;
    }


    /**
     * Gets the article_Type__c value for this Article_and_Category_Reporting__c.
     * 
     * @return article_Type__c
     */
    public java.lang.String getArticle_Type__c() {
        return article_Type__c;
    }


    /**
     * Sets the article_Type__c value for this Article_and_Category_Reporting__c.
     * 
     * @param article_Type__c
     */
    public void setArticle_Type__c(java.lang.String article_Type__c) {
        this.article_Type__c = article_Type__c;
    }


    /**
     * Gets the attachments value for this Article_and_Category_Reporting__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Article_and_Category_Reporting__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the createdBy value for this Article_and_Category_Reporting__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Article_and_Category_Reporting__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Article_and_Category_Reporting__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Article_and_Category_Reporting__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Article_and_Category_Reporting__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Article_and_Category_Reporting__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the createdDate__c value for this Article_and_Category_Reporting__c.
     * 
     * @return createdDate__c
     */
    public java.util.Calendar getCreatedDate__c() {
        return createdDate__c;
    }


    /**
     * Sets the createdDate__c value for this Article_and_Category_Reporting__c.
     * 
     * @param createdDate__c
     */
    public void setCreatedDate__c(java.util.Calendar createdDate__c) {
        this.createdDate__c = createdDate__c;
    }


    /**
     * Gets the created_By_Name__c value for this Article_and_Category_Reporting__c.
     * 
     * @return created_By_Name__c
     */
    public java.lang.String getCreated_By_Name__c() {
        return created_By_Name__c;
    }


    /**
     * Sets the created_By_Name__c value for this Article_and_Category_Reporting__c.
     * 
     * @param created_By_Name__c
     */
    public void setCreated_By_Name__c(java.lang.String created_By_Name__c) {
        this.created_By_Name__c = created_By_Name__c;
    }


    /**
     * Gets the created_By__c value for this Article_and_Category_Reporting__c.
     * 
     * @return created_By__c
     */
    public java.lang.String getCreated_By__c() {
        return created_By__c;
    }


    /**
     * Sets the created_By__c value for this Article_and_Category_Reporting__c.
     * 
     * @param created_By__c
     */
    public void setCreated_By__c(java.lang.String created_By__c) {
        this.created_By__c = created_By__c;
    }


    /**
     * Gets the created_By__r value for this Article_and_Category_Reporting__c.
     * 
     * @return created_By__r
     */
    public com.sforce.soap.enterprise.sobject.User getCreated_By__r() {
        return created_By__r;
    }


    /**
     * Sets the created_By__r value for this Article_and_Category_Reporting__c.
     * 
     * @param created_By__r
     */
    public void setCreated_By__r(com.sforce.soap.enterprise.sobject.User created_By__r) {
        this.created_By__r = created_By__r;
    }


    /**
     * Gets the creator_del__c value for this Article_and_Category_Reporting__c.
     * 
     * @return creator_del__c
     */
    public java.lang.String getCreator_del__c() {
        return creator_del__c;
    }


    /**
     * Sets the creator_del__c value for this Article_and_Category_Reporting__c.
     * 
     * @param creator_del__c
     */
    public void setCreator_del__c(java.lang.String creator_del__c) {
        this.creator_del__c = creator_del__c;
    }


    /**
     * Gets the details__c value for this Article_and_Category_Reporting__c.
     * 
     * @return details__c
     */
    public java.lang.String getDetails__c() {
        return details__c;
    }


    /**
     * Sets the details__c value for this Article_and_Category_Reporting__c.
     * 
     * @param details__c
     */
    public void setDetails__c(java.lang.String details__c) {
        this.details__c = details__c;
    }


    /**
     * Gets the error_Text_2__c value for this Article_and_Category_Reporting__c.
     * 
     * @return error_Text_2__c
     */
    public java.lang.String getError_Text_2__c() {
        return error_Text_2__c;
    }


    /**
     * Sets the error_Text_2__c value for this Article_and_Category_Reporting__c.
     * 
     * @param error_Text_2__c
     */
    public void setError_Text_2__c(java.lang.String error_Text_2__c) {
        this.error_Text_2__c = error_Text_2__c;
    }


    /**
     * Gets the error_Text__c value for this Article_and_Category_Reporting__c.
     * 
     * @return error_Text__c
     */
    public java.lang.String getError_Text__c() {
        return error_Text__c;
    }


    /**
     * Sets the error_Text__c value for this Article_and_Category_Reporting__c.
     * 
     * @param error_Text__c
     */
    public void setError_Text__c(java.lang.String error_Text__c) {
        this.error_Text__c = error_Text__c;
    }


    /**
     * Gets the feature_Category__c value for this Article_and_Category_Reporting__c.
     * 
     * @return feature_Category__c
     */
    public java.lang.String getFeature_Category__c() {
        return feature_Category__c;
    }


    /**
     * Sets the feature_Category__c value for this Article_and_Category_Reporting__c.
     * 
     * @param feature_Category__c
     */
    public void setFeature_Category__c(java.lang.String feature_Category__c) {
        this.feature_Category__c = feature_Category__c;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Article_and_Category_Reporting__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Article_and_Category_Reporting__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the firstPublishedDate__c value for this Article_and_Category_Reporting__c.
     * 
     * @return firstPublishedDate__c
     */
    public java.util.Calendar getFirstPublishedDate__c() {
        return firstPublishedDate__c;
    }


    /**
     * Sets the firstPublishedDate__c value for this Article_and_Category_Reporting__c.
     * 
     * @param firstPublishedDate__c
     */
    public void setFirstPublishedDate__c(java.util.Calendar firstPublishedDate__c) {
        this.firstPublishedDate__c = firstPublishedDate__c;
    }


    /**
     * Gets the isDeleted value for this Article_and_Category_Reporting__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Article_and_Category_Reporting__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the isVisibleInApp__c value for this Article_and_Category_Reporting__c.
     * 
     * @return isVisibleInApp__c
     */
    public java.lang.Boolean getIsVisibleInApp__c() {
        return isVisibleInApp__c;
    }


    /**
     * Sets the isVisibleInApp__c value for this Article_and_Category_Reporting__c.
     * 
     * @param isVisibleInApp__c
     */
    public void setIsVisibleInApp__c(java.lang.Boolean isVisibleInApp__c) {
        this.isVisibleInApp__c = isVisibleInApp__c;
    }


    /**
     * Gets the isVisibleInCsp__c value for this Article_and_Category_Reporting__c.
     * 
     * @return isVisibleInCsp__c
     */
    public java.lang.Boolean getIsVisibleInCsp__c() {
        return isVisibleInCsp__c;
    }


    /**
     * Sets the isVisibleInCsp__c value for this Article_and_Category_Reporting__c.
     * 
     * @param isVisibleInCsp__c
     */
    public void setIsVisibleInCsp__c(java.lang.Boolean isVisibleInCsp__c) {
        this.isVisibleInCsp__c = isVisibleInCsp__c;
    }


    /**
     * Gets the lastModifiedBy value for this Article_and_Category_Reporting__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Article_and_Category_Reporting__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Article_and_Category_Reporting__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Article_and_Category_Reporting__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Article_and_Category_Reporting__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Article_and_Category_Reporting__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lastModifiedDate__c value for this Article_and_Category_Reporting__c.
     * 
     * @return lastModifiedDate__c
     */
    public java.util.Calendar getLastModifiedDate__c() {
        return lastModifiedDate__c;
    }


    /**
     * Sets the lastModifiedDate__c value for this Article_and_Category_Reporting__c.
     * 
     * @param lastModifiedDate__c
     */
    public void setLastModifiedDate__c(java.util.Calendar lastModifiedDate__c) {
        this.lastModifiedDate__c = lastModifiedDate__c;
    }


    /**
     * Gets the lastPublishedDate__c value for this Article_and_Category_Reporting__c.
     * 
     * @return lastPublishedDate__c
     */
    public java.util.Calendar getLastPublishedDate__c() {
        return lastPublishedDate__c;
    }


    /**
     * Sets the lastPublishedDate__c value for this Article_and_Category_Reporting__c.
     * 
     * @param lastPublishedDate__c
     */
    public void setLastPublishedDate__c(java.util.Calendar lastPublishedDate__c) {
        this.lastPublishedDate__c = lastPublishedDate__c;
    }


    /**
     * Gets the last_Modified_By__c value for this Article_and_Category_Reporting__c.
     * 
     * @return last_Modified_By__c
     */
    public java.lang.String getLast_Modified_By__c() {
        return last_Modified_By__c;
    }


    /**
     * Sets the last_Modified_By__c value for this Article_and_Category_Reporting__c.
     * 
     * @param last_Modified_By__c
     */
    public void setLast_Modified_By__c(java.lang.String last_Modified_By__c) {
        this.last_Modified_By__c = last_Modified_By__c;
    }


    /**
     * Gets the last_Modified_By__r value for this Article_and_Category_Reporting__c.
     * 
     * @return last_Modified_By__r
     */
    public com.sforce.soap.enterprise.sobject.User getLast_Modified_By__r() {
        return last_Modified_By__r;
    }


    /**
     * Sets the last_Modified_By__r value for this Article_and_Category_Reporting__c.
     * 
     * @param last_Modified_By__r
     */
    public void setLast_Modified_By__r(com.sforce.soap.enterprise.sobject.User last_Modified_By__r) {
        this.last_Modified_By__r = last_Modified_By__r;
    }


    /**
     * Gets the name value for this Article_and_Category_Reporting__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Article_and_Category_Reporting__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Article_and_Category_Reporting__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Article_and_Category_Reporting__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Article_and_Category_Reporting__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Article_and_Category_Reporting__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the owner value for this Article_and_Category_Reporting__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Article_and_Category_Reporting__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Article_and_Category_Reporting__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Article_and_Category_Reporting__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this Article_and_Category_Reporting__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Article_and_Category_Reporting__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Article_and_Category_Reporting__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Article_and_Category_Reporting__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the product__c value for this Article_and_Category_Reporting__c.
     * 
     * @return product__c
     */
    public java.lang.String getProduct__c() {
        return product__c;
    }


    /**
     * Sets the product__c value for this Article_and_Category_Reporting__c.
     * 
     * @param product__c
     */
    public void setProduct__c(java.lang.String product__c) {
        this.product__c = product__c;
    }


    /**
     * Gets the publishStatus__c value for this Article_and_Category_Reporting__c.
     * 
     * @return publishStatus__c
     */
    public java.lang.String getPublishStatus__c() {
        return publishStatus__c;
    }


    /**
     * Sets the publishStatus__c value for this Article_and_Category_Reporting__c.
     * 
     * @param publishStatus__c
     */
    public void setPublishStatus__c(java.lang.String publishStatus__c) {
        this.publishStatus__c = publishStatus__c;
    }


    /**
     * Gets the solution_ID__c value for this Article_and_Category_Reporting__c.
     * 
     * @return solution_ID__c
     */
    public java.lang.String getSolution_ID__c() {
        return solution_ID__c;
    }


    /**
     * Sets the solution_ID__c value for this Article_and_Category_Reporting__c.
     * 
     * @param solution_ID__c
     */
    public void setSolution_ID__c(java.lang.String solution_ID__c) {
        this.solution_ID__c = solution_ID__c;
    }


    /**
     * Gets the solution_Number__c value for this Article_and_Category_Reporting__c.
     * 
     * @return solution_Number__c
     */
    public java.lang.String getSolution_Number__c() {
        return solution_Number__c;
    }


    /**
     * Sets the solution_Number__c value for this Article_and_Category_Reporting__c.
     * 
     * @param solution_Number__c
     */
    public void setSolution_Number__c(java.lang.String solution_Number__c) {
        this.solution_Number__c = solution_Number__c;
    }


    /**
     * Gets the summary__c value for this Article_and_Category_Reporting__c.
     * 
     * @return summary__c
     */
    public java.lang.String getSummary__c() {
        return summary__c;
    }


    /**
     * Sets the summary__c value for this Article_and_Category_Reporting__c.
     * 
     * @param summary__c
     */
    public void setSummary__c(java.lang.String summary__c) {
        this.summary__c = summary__c;
    }


    /**
     * Gets the systemModstamp value for this Article_and_Category_Reporting__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Article_and_Category_Reporting__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the title__c value for this Article_and_Category_Reporting__c.
     * 
     * @return title__c
     */
    public java.lang.String getTitle__c() {
        return title__c;
    }


    /**
     * Sets the title__c value for this Article_and_Category_Reporting__c.
     * 
     * @param title__c
     */
    public void setTitle__c(java.lang.String title__c) {
        this.title__c = title__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Article_and_Category_Reporting__c)) return false;
        Article_and_Category_Reporting__c other = (Article_and_Category_Reporting__c) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.articleNumber__c==null && other.getArticleNumber__c()==null) || 
             (this.articleNumber__c!=null &&
              this.articleNumber__c.equals(other.getArticleNumber__c()))) &&
            ((this.article_Type__c==null && other.getArticle_Type__c()==null) || 
             (this.article_Type__c!=null &&
              this.article_Type__c.equals(other.getArticle_Type__c()))) &&
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
            ((this.createdDate__c==null && other.getCreatedDate__c()==null) || 
             (this.createdDate__c!=null &&
              this.createdDate__c.equals(other.getCreatedDate__c()))) &&
            ((this.created_By_Name__c==null && other.getCreated_By_Name__c()==null) || 
             (this.created_By_Name__c!=null &&
              this.created_By_Name__c.equals(other.getCreated_By_Name__c()))) &&
            ((this.created_By__c==null && other.getCreated_By__c()==null) || 
             (this.created_By__c!=null &&
              this.created_By__c.equals(other.getCreated_By__c()))) &&
            ((this.created_By__r==null && other.getCreated_By__r()==null) || 
             (this.created_By__r!=null &&
              this.created_By__r.equals(other.getCreated_By__r()))) &&
            ((this.creator_del__c==null && other.getCreator_del__c()==null) || 
             (this.creator_del__c!=null &&
              this.creator_del__c.equals(other.getCreator_del__c()))) &&
            ((this.details__c==null && other.getDetails__c()==null) || 
             (this.details__c!=null &&
              this.details__c.equals(other.getDetails__c()))) &&
            ((this.error_Text_2__c==null && other.getError_Text_2__c()==null) || 
             (this.error_Text_2__c!=null &&
              this.error_Text_2__c.equals(other.getError_Text_2__c()))) &&
            ((this.error_Text__c==null && other.getError_Text__c()==null) || 
             (this.error_Text__c!=null &&
              this.error_Text__c.equals(other.getError_Text__c()))) &&
            ((this.feature_Category__c==null && other.getFeature_Category__c()==null) || 
             (this.feature_Category__c!=null &&
              this.feature_Category__c.equals(other.getFeature_Category__c()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.firstPublishedDate__c==null && other.getFirstPublishedDate__c()==null) || 
             (this.firstPublishedDate__c!=null &&
              this.firstPublishedDate__c.equals(other.getFirstPublishedDate__c()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.isVisibleInApp__c==null && other.getIsVisibleInApp__c()==null) || 
             (this.isVisibleInApp__c!=null &&
              this.isVisibleInApp__c.equals(other.getIsVisibleInApp__c()))) &&
            ((this.isVisibleInCsp__c==null && other.getIsVisibleInCsp__c()==null) || 
             (this.isVisibleInCsp__c!=null &&
              this.isVisibleInCsp__c.equals(other.getIsVisibleInCsp__c()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.lastModifiedDate__c==null && other.getLastModifiedDate__c()==null) || 
             (this.lastModifiedDate__c!=null &&
              this.lastModifiedDate__c.equals(other.getLastModifiedDate__c()))) &&
            ((this.lastPublishedDate__c==null && other.getLastPublishedDate__c()==null) || 
             (this.lastPublishedDate__c!=null &&
              this.lastPublishedDate__c.equals(other.getLastPublishedDate__c()))) &&
            ((this.last_Modified_By__c==null && other.getLast_Modified_By__c()==null) || 
             (this.last_Modified_By__c!=null &&
              this.last_Modified_By__c.equals(other.getLast_Modified_By__c()))) &&
            ((this.last_Modified_By__r==null && other.getLast_Modified_By__r()==null) || 
             (this.last_Modified_By__r!=null &&
              this.last_Modified_By__r.equals(other.getLast_Modified_By__r()))) &&
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
            ((this.product__c==null && other.getProduct__c()==null) || 
             (this.product__c!=null &&
              this.product__c.equals(other.getProduct__c()))) &&
            ((this.publishStatus__c==null && other.getPublishStatus__c()==null) || 
             (this.publishStatus__c!=null &&
              this.publishStatus__c.equals(other.getPublishStatus__c()))) &&
            ((this.solution_ID__c==null && other.getSolution_ID__c()==null) || 
             (this.solution_ID__c!=null &&
              this.solution_ID__c.equals(other.getSolution_ID__c()))) &&
            ((this.solution_Number__c==null && other.getSolution_Number__c()==null) || 
             (this.solution_Number__c!=null &&
              this.solution_Number__c.equals(other.getSolution_Number__c()))) &&
            ((this.summary__c==null && other.getSummary__c()==null) || 
             (this.summary__c!=null &&
              this.summary__c.equals(other.getSummary__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.title__c==null && other.getTitle__c()==null) || 
             (this.title__c!=null &&
              this.title__c.equals(other.getTitle__c())));
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
        if (getArticleNumber__c() != null) {
            _hashCode += getArticleNumber__c().hashCode();
        }
        if (getArticle_Type__c() != null) {
            _hashCode += getArticle_Type__c().hashCode();
        }
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
        if (getCreatedDate__c() != null) {
            _hashCode += getCreatedDate__c().hashCode();
        }
        if (getCreated_By_Name__c() != null) {
            _hashCode += getCreated_By_Name__c().hashCode();
        }
        if (getCreated_By__c() != null) {
            _hashCode += getCreated_By__c().hashCode();
        }
        if (getCreated_By__r() != null) {
            _hashCode += getCreated_By__r().hashCode();
        }
        if (getCreator_del__c() != null) {
            _hashCode += getCreator_del__c().hashCode();
        }
        if (getDetails__c() != null) {
            _hashCode += getDetails__c().hashCode();
        }
        if (getError_Text_2__c() != null) {
            _hashCode += getError_Text_2__c().hashCode();
        }
        if (getError_Text__c() != null) {
            _hashCode += getError_Text__c().hashCode();
        }
        if (getFeature_Category__c() != null) {
            _hashCode += getFeature_Category__c().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getFirstPublishedDate__c() != null) {
            _hashCode += getFirstPublishedDate__c().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getIsVisibleInApp__c() != null) {
            _hashCode += getIsVisibleInApp__c().hashCode();
        }
        if (getIsVisibleInCsp__c() != null) {
            _hashCode += getIsVisibleInCsp__c().hashCode();
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
        if (getLastModifiedDate__c() != null) {
            _hashCode += getLastModifiedDate__c().hashCode();
        }
        if (getLastPublishedDate__c() != null) {
            _hashCode += getLastPublishedDate__c().hashCode();
        }
        if (getLast_Modified_By__c() != null) {
            _hashCode += getLast_Modified_By__c().hashCode();
        }
        if (getLast_Modified_By__r() != null) {
            _hashCode += getLast_Modified_By__r().hashCode();
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
        if (getProduct__c() != null) {
            _hashCode += getProduct__c().hashCode();
        }
        if (getPublishStatus__c() != null) {
            _hashCode += getPublishStatus__c().hashCode();
        }
        if (getSolution_ID__c() != null) {
            _hashCode += getSolution_ID__c().hashCode();
        }
        if (getSolution_Number__c() != null) {
            _hashCode += getSolution_Number__c().hashCode();
        }
        if (getSummary__c() != null) {
            _hashCode += getSummary__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTitle__c() != null) {
            _hashCode += getTitle__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Article_and_Category_Reporting__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Article_and_Category_Reporting__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articleNumber__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ArticleNumber__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("article_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Article_Type__c"));
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
        elemField.setFieldName("createdDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CreatedDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created_By_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Created_By_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created_By__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Created_By__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created_By__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Created_By__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creator_del__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Creator_del__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Details__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error_Text_2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Error_Text_2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error_Text__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Error_Text__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feature_Category__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Feature_Category__c"));
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
        elemField.setFieldName("firstPublishedDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FirstPublishedDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("isVisibleInApp__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsVisibleInApp__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isVisibleInCsp__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsVisibleInCsp__c"));
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
        elemField.setFieldName("lastModifiedDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastModifiedDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPublishedDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastPublishedDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last_Modified_By__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Last_Modified_By__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last_Modified_By__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Last_Modified_By__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
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
        elemField.setFieldName("product__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Product__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishStatus__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PublishStatus__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solution_ID__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Solution_ID__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solution_Number__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Solution_Number__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summary__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Summary__c"));
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
        elemField.setFieldName("title__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Title__c"));
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

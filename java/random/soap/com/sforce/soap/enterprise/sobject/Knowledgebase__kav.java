/**
 * Knowledgebase__kav.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Knowledgebase__kav  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String archivedById;

    private java.util.Calendar archivedDate;

    private java.lang.String articleNumber;

    private java.lang.String articleType;

    private java.lang.String contributor__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String creator__c;

    private com.sforce.soap.enterprise.QueryResult dataCategorySelections;

    private java.lang.String data_Migration_Comments__c;

    private java.lang.String details__c;

    private java.lang.String error_Text_2__c;

    private java.lang.String error_Text__c;

    private java.util.Calendar firstPublishedDate;

    private java.lang.Boolean isDeleted;

    private java.lang.Boolean isLatestVersion;

    private java.lang.Boolean isMasterLanguage;

    private java.lang.Boolean isVisibleInApp;

    private java.lang.Boolean isVisibleInCsp;

    private java.lang.Boolean isVisibleInPkb;

    private java.lang.Boolean isVisibleInPrm;

    private java.lang.String knowledgeArticleId;

    private java.lang.String language;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.util.Calendar lastPublishedDate;

    private java.lang.String masterVersionId;

    private java.lang.String ownerId;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.String publishStatus;

    private byte[] related_Attachment__Body__s;

    private java.lang.String related_Attachment__ContentType__s;

    private java.lang.Integer related_Attachment__Length__s;

    private java.lang.String related_Attachment__Name__s;

    private java.lang.String solution_Id__c;

    private java.lang.String solution_Number__c;

    private java.lang.String sourceId;

    private java.lang.String summary;

    private java.util.Calendar systemModstamp;

    private java.lang.String title;

    private java.lang.String urlName;

    private java.lang.Integer versionNumber;

    private java.lang.Double viewScore;

    private java.lang.Double voteScore;

    public Knowledgebase__kav() {
    }

    public Knowledgebase__kav(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String archivedById,
           java.util.Calendar archivedDate,
           java.lang.String articleNumber,
           java.lang.String articleType,
           java.lang.String contributor__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String creator__c,
           com.sforce.soap.enterprise.QueryResult dataCategorySelections,
           java.lang.String data_Migration_Comments__c,
           java.lang.String details__c,
           java.lang.String error_Text_2__c,
           java.lang.String error_Text__c,
           java.util.Calendar firstPublishedDate,
           java.lang.Boolean isDeleted,
           java.lang.Boolean isLatestVersion,
           java.lang.Boolean isMasterLanguage,
           java.lang.Boolean isVisibleInApp,
           java.lang.Boolean isVisibleInCsp,
           java.lang.Boolean isVisibleInPkb,
           java.lang.Boolean isVisibleInPrm,
           java.lang.String knowledgeArticleId,
           java.lang.String language,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.util.Calendar lastPublishedDate,
           java.lang.String masterVersionId,
           java.lang.String ownerId,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.String publishStatus,
           byte[] related_Attachment__Body__s,
           java.lang.String related_Attachment__ContentType__s,
           java.lang.Integer related_Attachment__Length__s,
           java.lang.String related_Attachment__Name__s,
           java.lang.String solution_Id__c,
           java.lang.String solution_Number__c,
           java.lang.String sourceId,
           java.lang.String summary,
           java.util.Calendar systemModstamp,
           java.lang.String title,
           java.lang.String urlName,
           java.lang.Integer versionNumber,
           java.lang.Double viewScore,
           java.lang.Double voteScore) {
        super(
            fieldsToNull,
            id);
        this.archivedById = archivedById;
        this.archivedDate = archivedDate;
        this.articleNumber = articleNumber;
        this.articleType = articleType;
        this.contributor__c = contributor__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.creator__c = creator__c;
        this.dataCategorySelections = dataCategorySelections;
        this.data_Migration_Comments__c = data_Migration_Comments__c;
        this.details__c = details__c;
        this.error_Text_2__c = error_Text_2__c;
        this.error_Text__c = error_Text__c;
        this.firstPublishedDate = firstPublishedDate;
        this.isDeleted = isDeleted;
        this.isLatestVersion = isLatestVersion;
        this.isMasterLanguage = isMasterLanguage;
        this.isVisibleInApp = isVisibleInApp;
        this.isVisibleInCsp = isVisibleInCsp;
        this.isVisibleInPkb = isVisibleInPkb;
        this.isVisibleInPrm = isVisibleInPrm;
        this.knowledgeArticleId = knowledgeArticleId;
        this.language = language;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.lastPublishedDate = lastPublishedDate;
        this.masterVersionId = masterVersionId;
        this.ownerId = ownerId;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.publishStatus = publishStatus;
        this.related_Attachment__Body__s = related_Attachment__Body__s;
        this.related_Attachment__ContentType__s = related_Attachment__ContentType__s;
        this.related_Attachment__Length__s = related_Attachment__Length__s;
        this.related_Attachment__Name__s = related_Attachment__Name__s;
        this.solution_Id__c = solution_Id__c;
        this.solution_Number__c = solution_Number__c;
        this.sourceId = sourceId;
        this.summary = summary;
        this.systemModstamp = systemModstamp;
        this.title = title;
        this.urlName = urlName;
        this.versionNumber = versionNumber;
        this.viewScore = viewScore;
        this.voteScore = voteScore;
    }


    /**
     * Gets the archivedById value for this Knowledgebase__kav.
     * 
     * @return archivedById
     */
    public java.lang.String getArchivedById() {
        return archivedById;
    }


    /**
     * Sets the archivedById value for this Knowledgebase__kav.
     * 
     * @param archivedById
     */
    public void setArchivedById(java.lang.String archivedById) {
        this.archivedById = archivedById;
    }


    /**
     * Gets the archivedDate value for this Knowledgebase__kav.
     * 
     * @return archivedDate
     */
    public java.util.Calendar getArchivedDate() {
        return archivedDate;
    }


    /**
     * Sets the archivedDate value for this Knowledgebase__kav.
     * 
     * @param archivedDate
     */
    public void setArchivedDate(java.util.Calendar archivedDate) {
        this.archivedDate = archivedDate;
    }


    /**
     * Gets the articleNumber value for this Knowledgebase__kav.
     * 
     * @return articleNumber
     */
    public java.lang.String getArticleNumber() {
        return articleNumber;
    }


    /**
     * Sets the articleNumber value for this Knowledgebase__kav.
     * 
     * @param articleNumber
     */
    public void setArticleNumber(java.lang.String articleNumber) {
        this.articleNumber = articleNumber;
    }


    /**
     * Gets the articleType value for this Knowledgebase__kav.
     * 
     * @return articleType
     */
    public java.lang.String getArticleType() {
        return articleType;
    }


    /**
     * Sets the articleType value for this Knowledgebase__kav.
     * 
     * @param articleType
     */
    public void setArticleType(java.lang.String articleType) {
        this.articleType = articleType;
    }


    /**
     * Gets the contributor__c value for this Knowledgebase__kav.
     * 
     * @return contributor__c
     */
    public java.lang.String getContributor__c() {
        return contributor__c;
    }


    /**
     * Sets the contributor__c value for this Knowledgebase__kav.
     * 
     * @param contributor__c
     */
    public void setContributor__c(java.lang.String contributor__c) {
        this.contributor__c = contributor__c;
    }


    /**
     * Gets the createdBy value for this Knowledgebase__kav.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Knowledgebase__kav.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Knowledgebase__kav.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Knowledgebase__kav.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Knowledgebase__kav.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Knowledgebase__kav.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the creator__c value for this Knowledgebase__kav.
     * 
     * @return creator__c
     */
    public java.lang.String getCreator__c() {
        return creator__c;
    }


    /**
     * Sets the creator__c value for this Knowledgebase__kav.
     * 
     * @param creator__c
     */
    public void setCreator__c(java.lang.String creator__c) {
        this.creator__c = creator__c;
    }


    /**
     * Gets the dataCategorySelections value for this Knowledgebase__kav.
     * 
     * @return dataCategorySelections
     */
    public com.sforce.soap.enterprise.QueryResult getDataCategorySelections() {
        return dataCategorySelections;
    }


    /**
     * Sets the dataCategorySelections value for this Knowledgebase__kav.
     * 
     * @param dataCategorySelections
     */
    public void setDataCategorySelections(com.sforce.soap.enterprise.QueryResult dataCategorySelections) {
        this.dataCategorySelections = dataCategorySelections;
    }


    /**
     * Gets the data_Migration_Comments__c value for this Knowledgebase__kav.
     * 
     * @return data_Migration_Comments__c
     */
    public java.lang.String getData_Migration_Comments__c() {
        return data_Migration_Comments__c;
    }


    /**
     * Sets the data_Migration_Comments__c value for this Knowledgebase__kav.
     * 
     * @param data_Migration_Comments__c
     */
    public void setData_Migration_Comments__c(java.lang.String data_Migration_Comments__c) {
        this.data_Migration_Comments__c = data_Migration_Comments__c;
    }


    /**
     * Gets the details__c value for this Knowledgebase__kav.
     * 
     * @return details__c
     */
    public java.lang.String getDetails__c() {
        return details__c;
    }


    /**
     * Sets the details__c value for this Knowledgebase__kav.
     * 
     * @param details__c
     */
    public void setDetails__c(java.lang.String details__c) {
        this.details__c = details__c;
    }


    /**
     * Gets the error_Text_2__c value for this Knowledgebase__kav.
     * 
     * @return error_Text_2__c
     */
    public java.lang.String getError_Text_2__c() {
        return error_Text_2__c;
    }


    /**
     * Sets the error_Text_2__c value for this Knowledgebase__kav.
     * 
     * @param error_Text_2__c
     */
    public void setError_Text_2__c(java.lang.String error_Text_2__c) {
        this.error_Text_2__c = error_Text_2__c;
    }


    /**
     * Gets the error_Text__c value for this Knowledgebase__kav.
     * 
     * @return error_Text__c
     */
    public java.lang.String getError_Text__c() {
        return error_Text__c;
    }


    /**
     * Sets the error_Text__c value for this Knowledgebase__kav.
     * 
     * @param error_Text__c
     */
    public void setError_Text__c(java.lang.String error_Text__c) {
        this.error_Text__c = error_Text__c;
    }


    /**
     * Gets the firstPublishedDate value for this Knowledgebase__kav.
     * 
     * @return firstPublishedDate
     */
    public java.util.Calendar getFirstPublishedDate() {
        return firstPublishedDate;
    }


    /**
     * Sets the firstPublishedDate value for this Knowledgebase__kav.
     * 
     * @param firstPublishedDate
     */
    public void setFirstPublishedDate(java.util.Calendar firstPublishedDate) {
        this.firstPublishedDate = firstPublishedDate;
    }


    /**
     * Gets the isDeleted value for this Knowledgebase__kav.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Knowledgebase__kav.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the isLatestVersion value for this Knowledgebase__kav.
     * 
     * @return isLatestVersion
     */
    public java.lang.Boolean getIsLatestVersion() {
        return isLatestVersion;
    }


    /**
     * Sets the isLatestVersion value for this Knowledgebase__kav.
     * 
     * @param isLatestVersion
     */
    public void setIsLatestVersion(java.lang.Boolean isLatestVersion) {
        this.isLatestVersion = isLatestVersion;
    }


    /**
     * Gets the isMasterLanguage value for this Knowledgebase__kav.
     * 
     * @return isMasterLanguage
     */
    public java.lang.Boolean getIsMasterLanguage() {
        return isMasterLanguage;
    }


    /**
     * Sets the isMasterLanguage value for this Knowledgebase__kav.
     * 
     * @param isMasterLanguage
     */
    public void setIsMasterLanguage(java.lang.Boolean isMasterLanguage) {
        this.isMasterLanguage = isMasterLanguage;
    }


    /**
     * Gets the isVisibleInApp value for this Knowledgebase__kav.
     * 
     * @return isVisibleInApp
     */
    public java.lang.Boolean getIsVisibleInApp() {
        return isVisibleInApp;
    }


    /**
     * Sets the isVisibleInApp value for this Knowledgebase__kav.
     * 
     * @param isVisibleInApp
     */
    public void setIsVisibleInApp(java.lang.Boolean isVisibleInApp) {
        this.isVisibleInApp = isVisibleInApp;
    }


    /**
     * Gets the isVisibleInCsp value for this Knowledgebase__kav.
     * 
     * @return isVisibleInCsp
     */
    public java.lang.Boolean getIsVisibleInCsp() {
        return isVisibleInCsp;
    }


    /**
     * Sets the isVisibleInCsp value for this Knowledgebase__kav.
     * 
     * @param isVisibleInCsp
     */
    public void setIsVisibleInCsp(java.lang.Boolean isVisibleInCsp) {
        this.isVisibleInCsp = isVisibleInCsp;
    }


    /**
     * Gets the isVisibleInPkb value for this Knowledgebase__kav.
     * 
     * @return isVisibleInPkb
     */
    public java.lang.Boolean getIsVisibleInPkb() {
        return isVisibleInPkb;
    }


    /**
     * Sets the isVisibleInPkb value for this Knowledgebase__kav.
     * 
     * @param isVisibleInPkb
     */
    public void setIsVisibleInPkb(java.lang.Boolean isVisibleInPkb) {
        this.isVisibleInPkb = isVisibleInPkb;
    }


    /**
     * Gets the isVisibleInPrm value for this Knowledgebase__kav.
     * 
     * @return isVisibleInPrm
     */
    public java.lang.Boolean getIsVisibleInPrm() {
        return isVisibleInPrm;
    }


    /**
     * Sets the isVisibleInPrm value for this Knowledgebase__kav.
     * 
     * @param isVisibleInPrm
     */
    public void setIsVisibleInPrm(java.lang.Boolean isVisibleInPrm) {
        this.isVisibleInPrm = isVisibleInPrm;
    }


    /**
     * Gets the knowledgeArticleId value for this Knowledgebase__kav.
     * 
     * @return knowledgeArticleId
     */
    public java.lang.String getKnowledgeArticleId() {
        return knowledgeArticleId;
    }


    /**
     * Sets the knowledgeArticleId value for this Knowledgebase__kav.
     * 
     * @param knowledgeArticleId
     */
    public void setKnowledgeArticleId(java.lang.String knowledgeArticleId) {
        this.knowledgeArticleId = knowledgeArticleId;
    }


    /**
     * Gets the language value for this Knowledgebase__kav.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this Knowledgebase__kav.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the lastModifiedBy value for this Knowledgebase__kav.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Knowledgebase__kav.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Knowledgebase__kav.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Knowledgebase__kav.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Knowledgebase__kav.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Knowledgebase__kav.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lastPublishedDate value for this Knowledgebase__kav.
     * 
     * @return lastPublishedDate
     */
    public java.util.Calendar getLastPublishedDate() {
        return lastPublishedDate;
    }


    /**
     * Sets the lastPublishedDate value for this Knowledgebase__kav.
     * 
     * @param lastPublishedDate
     */
    public void setLastPublishedDate(java.util.Calendar lastPublishedDate) {
        this.lastPublishedDate = lastPublishedDate;
    }


    /**
     * Gets the masterVersionId value for this Knowledgebase__kav.
     * 
     * @return masterVersionId
     */
    public java.lang.String getMasterVersionId() {
        return masterVersionId;
    }


    /**
     * Sets the masterVersionId value for this Knowledgebase__kav.
     * 
     * @param masterVersionId
     */
    public void setMasterVersionId(java.lang.String masterVersionId) {
        this.masterVersionId = masterVersionId;
    }


    /**
     * Gets the ownerId value for this Knowledgebase__kav.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Knowledgebase__kav.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this Knowledgebase__kav.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Knowledgebase__kav.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Knowledgebase__kav.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Knowledgebase__kav.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the publishStatus value for this Knowledgebase__kav.
     * 
     * @return publishStatus
     */
    public java.lang.String getPublishStatus() {
        return publishStatus;
    }


    /**
     * Sets the publishStatus value for this Knowledgebase__kav.
     * 
     * @param publishStatus
     */
    public void setPublishStatus(java.lang.String publishStatus) {
        this.publishStatus = publishStatus;
    }


    /**
     * Gets the related_Attachment__Body__s value for this Knowledgebase__kav.
     * 
     * @return related_Attachment__Body__s
     */
    public byte[] getRelated_Attachment__Body__s() {
        return related_Attachment__Body__s;
    }


    /**
     * Sets the related_Attachment__Body__s value for this Knowledgebase__kav.
     * 
     * @param related_Attachment__Body__s
     */
    public void setRelated_Attachment__Body__s(byte[] related_Attachment__Body__s) {
        this.related_Attachment__Body__s = related_Attachment__Body__s;
    }


    /**
     * Gets the related_Attachment__ContentType__s value for this Knowledgebase__kav.
     * 
     * @return related_Attachment__ContentType__s
     */
    public java.lang.String getRelated_Attachment__ContentType__s() {
        return related_Attachment__ContentType__s;
    }


    /**
     * Sets the related_Attachment__ContentType__s value for this Knowledgebase__kav.
     * 
     * @param related_Attachment__ContentType__s
     */
    public void setRelated_Attachment__ContentType__s(java.lang.String related_Attachment__ContentType__s) {
        this.related_Attachment__ContentType__s = related_Attachment__ContentType__s;
    }


    /**
     * Gets the related_Attachment__Length__s value for this Knowledgebase__kav.
     * 
     * @return related_Attachment__Length__s
     */
    public java.lang.Integer getRelated_Attachment__Length__s() {
        return related_Attachment__Length__s;
    }


    /**
     * Sets the related_Attachment__Length__s value for this Knowledgebase__kav.
     * 
     * @param related_Attachment__Length__s
     */
    public void setRelated_Attachment__Length__s(java.lang.Integer related_Attachment__Length__s) {
        this.related_Attachment__Length__s = related_Attachment__Length__s;
    }


    /**
     * Gets the related_Attachment__Name__s value for this Knowledgebase__kav.
     * 
     * @return related_Attachment__Name__s
     */
    public java.lang.String getRelated_Attachment__Name__s() {
        return related_Attachment__Name__s;
    }


    /**
     * Sets the related_Attachment__Name__s value for this Knowledgebase__kav.
     * 
     * @param related_Attachment__Name__s
     */
    public void setRelated_Attachment__Name__s(java.lang.String related_Attachment__Name__s) {
        this.related_Attachment__Name__s = related_Attachment__Name__s;
    }


    /**
     * Gets the solution_Id__c value for this Knowledgebase__kav.
     * 
     * @return solution_Id__c
     */
    public java.lang.String getSolution_Id__c() {
        return solution_Id__c;
    }


    /**
     * Sets the solution_Id__c value for this Knowledgebase__kav.
     * 
     * @param solution_Id__c
     */
    public void setSolution_Id__c(java.lang.String solution_Id__c) {
        this.solution_Id__c = solution_Id__c;
    }


    /**
     * Gets the solution_Number__c value for this Knowledgebase__kav.
     * 
     * @return solution_Number__c
     */
    public java.lang.String getSolution_Number__c() {
        return solution_Number__c;
    }


    /**
     * Sets the solution_Number__c value for this Knowledgebase__kav.
     * 
     * @param solution_Number__c
     */
    public void setSolution_Number__c(java.lang.String solution_Number__c) {
        this.solution_Number__c = solution_Number__c;
    }


    /**
     * Gets the sourceId value for this Knowledgebase__kav.
     * 
     * @return sourceId
     */
    public java.lang.String getSourceId() {
        return sourceId;
    }


    /**
     * Sets the sourceId value for this Knowledgebase__kav.
     * 
     * @param sourceId
     */
    public void setSourceId(java.lang.String sourceId) {
        this.sourceId = sourceId;
    }


    /**
     * Gets the summary value for this Knowledgebase__kav.
     * 
     * @return summary
     */
    public java.lang.String getSummary() {
        return summary;
    }


    /**
     * Sets the summary value for this Knowledgebase__kav.
     * 
     * @param summary
     */
    public void setSummary(java.lang.String summary) {
        this.summary = summary;
    }


    /**
     * Gets the systemModstamp value for this Knowledgebase__kav.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Knowledgebase__kav.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the title value for this Knowledgebase__kav.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Knowledgebase__kav.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the urlName value for this Knowledgebase__kav.
     * 
     * @return urlName
     */
    public java.lang.String getUrlName() {
        return urlName;
    }


    /**
     * Sets the urlName value for this Knowledgebase__kav.
     * 
     * @param urlName
     */
    public void setUrlName(java.lang.String urlName) {
        this.urlName = urlName;
    }


    /**
     * Gets the versionNumber value for this Knowledgebase__kav.
     * 
     * @return versionNumber
     */
    public java.lang.Integer getVersionNumber() {
        return versionNumber;
    }


    /**
     * Sets the versionNumber value for this Knowledgebase__kav.
     * 
     * @param versionNumber
     */
    public void setVersionNumber(java.lang.Integer versionNumber) {
        this.versionNumber = versionNumber;
    }


    /**
     * Gets the viewScore value for this Knowledgebase__kav.
     * 
     * @return viewScore
     */
    public java.lang.Double getViewScore() {
        return viewScore;
    }


    /**
     * Sets the viewScore value for this Knowledgebase__kav.
     * 
     * @param viewScore
     */
    public void setViewScore(java.lang.Double viewScore) {
        this.viewScore = viewScore;
    }


    /**
     * Gets the voteScore value for this Knowledgebase__kav.
     * 
     * @return voteScore
     */
    public java.lang.Double getVoteScore() {
        return voteScore;
    }


    /**
     * Sets the voteScore value for this Knowledgebase__kav.
     * 
     * @param voteScore
     */
    public void setVoteScore(java.lang.Double voteScore) {
        this.voteScore = voteScore;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Knowledgebase__kav)) return false;
        Knowledgebase__kav other = (Knowledgebase__kav) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.archivedById==null && other.getArchivedById()==null) || 
             (this.archivedById!=null &&
              this.archivedById.equals(other.getArchivedById()))) &&
            ((this.archivedDate==null && other.getArchivedDate()==null) || 
             (this.archivedDate!=null &&
              this.archivedDate.equals(other.getArchivedDate()))) &&
            ((this.articleNumber==null && other.getArticleNumber()==null) || 
             (this.articleNumber!=null &&
              this.articleNumber.equals(other.getArticleNumber()))) &&
            ((this.articleType==null && other.getArticleType()==null) || 
             (this.articleType!=null &&
              this.articleType.equals(other.getArticleType()))) &&
            ((this.contributor__c==null && other.getContributor__c()==null) || 
             (this.contributor__c!=null &&
              this.contributor__c.equals(other.getContributor__c()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.creator__c==null && other.getCreator__c()==null) || 
             (this.creator__c!=null &&
              this.creator__c.equals(other.getCreator__c()))) &&
            ((this.dataCategorySelections==null && other.getDataCategorySelections()==null) || 
             (this.dataCategorySelections!=null &&
              this.dataCategorySelections.equals(other.getDataCategorySelections()))) &&
            ((this.data_Migration_Comments__c==null && other.getData_Migration_Comments__c()==null) || 
             (this.data_Migration_Comments__c!=null &&
              this.data_Migration_Comments__c.equals(other.getData_Migration_Comments__c()))) &&
            ((this.details__c==null && other.getDetails__c()==null) || 
             (this.details__c!=null &&
              this.details__c.equals(other.getDetails__c()))) &&
            ((this.error_Text_2__c==null && other.getError_Text_2__c()==null) || 
             (this.error_Text_2__c!=null &&
              this.error_Text_2__c.equals(other.getError_Text_2__c()))) &&
            ((this.error_Text__c==null && other.getError_Text__c()==null) || 
             (this.error_Text__c!=null &&
              this.error_Text__c.equals(other.getError_Text__c()))) &&
            ((this.firstPublishedDate==null && other.getFirstPublishedDate()==null) || 
             (this.firstPublishedDate!=null &&
              this.firstPublishedDate.equals(other.getFirstPublishedDate()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.isLatestVersion==null && other.getIsLatestVersion()==null) || 
             (this.isLatestVersion!=null &&
              this.isLatestVersion.equals(other.getIsLatestVersion()))) &&
            ((this.isMasterLanguage==null && other.getIsMasterLanguage()==null) || 
             (this.isMasterLanguage!=null &&
              this.isMasterLanguage.equals(other.getIsMasterLanguage()))) &&
            ((this.isVisibleInApp==null && other.getIsVisibleInApp()==null) || 
             (this.isVisibleInApp!=null &&
              this.isVisibleInApp.equals(other.getIsVisibleInApp()))) &&
            ((this.isVisibleInCsp==null && other.getIsVisibleInCsp()==null) || 
             (this.isVisibleInCsp!=null &&
              this.isVisibleInCsp.equals(other.getIsVisibleInCsp()))) &&
            ((this.isVisibleInPkb==null && other.getIsVisibleInPkb()==null) || 
             (this.isVisibleInPkb!=null &&
              this.isVisibleInPkb.equals(other.getIsVisibleInPkb()))) &&
            ((this.isVisibleInPrm==null && other.getIsVisibleInPrm()==null) || 
             (this.isVisibleInPrm!=null &&
              this.isVisibleInPrm.equals(other.getIsVisibleInPrm()))) &&
            ((this.knowledgeArticleId==null && other.getKnowledgeArticleId()==null) || 
             (this.knowledgeArticleId!=null &&
              this.knowledgeArticleId.equals(other.getKnowledgeArticleId()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.lastPublishedDate==null && other.getLastPublishedDate()==null) || 
             (this.lastPublishedDate!=null &&
              this.lastPublishedDate.equals(other.getLastPublishedDate()))) &&
            ((this.masterVersionId==null && other.getMasterVersionId()==null) || 
             (this.masterVersionId!=null &&
              this.masterVersionId.equals(other.getMasterVersionId()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.publishStatus==null && other.getPublishStatus()==null) || 
             (this.publishStatus!=null &&
              this.publishStatus.equals(other.getPublishStatus()))) &&
            ((this.related_Attachment__Body__s==null && other.getRelated_Attachment__Body__s()==null) || 
             (this.related_Attachment__Body__s!=null &&
              java.util.Arrays.equals(this.related_Attachment__Body__s, other.getRelated_Attachment__Body__s()))) &&
            ((this.related_Attachment__ContentType__s==null && other.getRelated_Attachment__ContentType__s()==null) || 
             (this.related_Attachment__ContentType__s!=null &&
              this.related_Attachment__ContentType__s.equals(other.getRelated_Attachment__ContentType__s()))) &&
            ((this.related_Attachment__Length__s==null && other.getRelated_Attachment__Length__s()==null) || 
             (this.related_Attachment__Length__s!=null &&
              this.related_Attachment__Length__s.equals(other.getRelated_Attachment__Length__s()))) &&
            ((this.related_Attachment__Name__s==null && other.getRelated_Attachment__Name__s()==null) || 
             (this.related_Attachment__Name__s!=null &&
              this.related_Attachment__Name__s.equals(other.getRelated_Attachment__Name__s()))) &&
            ((this.solution_Id__c==null && other.getSolution_Id__c()==null) || 
             (this.solution_Id__c!=null &&
              this.solution_Id__c.equals(other.getSolution_Id__c()))) &&
            ((this.solution_Number__c==null && other.getSolution_Number__c()==null) || 
             (this.solution_Number__c!=null &&
              this.solution_Number__c.equals(other.getSolution_Number__c()))) &&
            ((this.sourceId==null && other.getSourceId()==null) || 
             (this.sourceId!=null &&
              this.sourceId.equals(other.getSourceId()))) &&
            ((this.summary==null && other.getSummary()==null) || 
             (this.summary!=null &&
              this.summary.equals(other.getSummary()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.urlName==null && other.getUrlName()==null) || 
             (this.urlName!=null &&
              this.urlName.equals(other.getUrlName()))) &&
            ((this.versionNumber==null && other.getVersionNumber()==null) || 
             (this.versionNumber!=null &&
              this.versionNumber.equals(other.getVersionNumber()))) &&
            ((this.viewScore==null && other.getViewScore()==null) || 
             (this.viewScore!=null &&
              this.viewScore.equals(other.getViewScore()))) &&
            ((this.voteScore==null && other.getVoteScore()==null) || 
             (this.voteScore!=null &&
              this.voteScore.equals(other.getVoteScore())));
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
        if (getArchivedById() != null) {
            _hashCode += getArchivedById().hashCode();
        }
        if (getArchivedDate() != null) {
            _hashCode += getArchivedDate().hashCode();
        }
        if (getArticleNumber() != null) {
            _hashCode += getArticleNumber().hashCode();
        }
        if (getArticleType() != null) {
            _hashCode += getArticleType().hashCode();
        }
        if (getContributor__c() != null) {
            _hashCode += getContributor__c().hashCode();
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
        if (getCreator__c() != null) {
            _hashCode += getCreator__c().hashCode();
        }
        if (getDataCategorySelections() != null) {
            _hashCode += getDataCategorySelections().hashCode();
        }
        if (getData_Migration_Comments__c() != null) {
            _hashCode += getData_Migration_Comments__c().hashCode();
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
        if (getFirstPublishedDate() != null) {
            _hashCode += getFirstPublishedDate().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getIsLatestVersion() != null) {
            _hashCode += getIsLatestVersion().hashCode();
        }
        if (getIsMasterLanguage() != null) {
            _hashCode += getIsMasterLanguage().hashCode();
        }
        if (getIsVisibleInApp() != null) {
            _hashCode += getIsVisibleInApp().hashCode();
        }
        if (getIsVisibleInCsp() != null) {
            _hashCode += getIsVisibleInCsp().hashCode();
        }
        if (getIsVisibleInPkb() != null) {
            _hashCode += getIsVisibleInPkb().hashCode();
        }
        if (getIsVisibleInPrm() != null) {
            _hashCode += getIsVisibleInPrm().hashCode();
        }
        if (getKnowledgeArticleId() != null) {
            _hashCode += getKnowledgeArticleId().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
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
        if (getLastPublishedDate() != null) {
            _hashCode += getLastPublishedDate().hashCode();
        }
        if (getMasterVersionId() != null) {
            _hashCode += getMasterVersionId().hashCode();
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
        if (getPublishStatus() != null) {
            _hashCode += getPublishStatus().hashCode();
        }
        if (getRelated_Attachment__Body__s() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRelated_Attachment__Body__s());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRelated_Attachment__Body__s(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRelated_Attachment__ContentType__s() != null) {
            _hashCode += getRelated_Attachment__ContentType__s().hashCode();
        }
        if (getRelated_Attachment__Length__s() != null) {
            _hashCode += getRelated_Attachment__Length__s().hashCode();
        }
        if (getRelated_Attachment__Name__s() != null) {
            _hashCode += getRelated_Attachment__Name__s().hashCode();
        }
        if (getSolution_Id__c() != null) {
            _hashCode += getSolution_Id__c().hashCode();
        }
        if (getSolution_Number__c() != null) {
            _hashCode += getSolution_Number__c().hashCode();
        }
        if (getSourceId() != null) {
            _hashCode += getSourceId().hashCode();
        }
        if (getSummary() != null) {
            _hashCode += getSummary().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getUrlName() != null) {
            _hashCode += getUrlName().hashCode();
        }
        if (getVersionNumber() != null) {
            _hashCode += getVersionNumber().hashCode();
        }
        if (getViewScore() != null) {
            _hashCode += getViewScore().hashCode();
        }
        if (getVoteScore() != null) {
            _hashCode += getVoteScore().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Knowledgebase__kav.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Knowledgebase__kav"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archivedById");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ArchivedById"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archivedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ArchivedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articleNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ArticleNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articleType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ArticleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contributor__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contributor__c"));
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
        elemField.setFieldName("creator__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Creator__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCategorySelections");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DataCategorySelections"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data_Migration_Comments__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Data_Migration_Comments__c"));
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
        elemField.setFieldName("firstPublishedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FirstPublishedDate"));
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
        elemField.setFieldName("isLatestVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsLatestVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isMasterLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsMasterLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isVisibleInApp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsVisibleInApp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isVisibleInCsp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsVisibleInCsp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isVisibleInPkb");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsVisibleInPkb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isVisibleInPrm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsVisibleInPrm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("knowledgeArticleId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "KnowledgeArticleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Language"));
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
        elemField.setFieldName("lastPublishedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastPublishedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterVersionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MasterVersionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("publishStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PublishStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("related_Attachment__Body__s");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Related_Attachment__Body__s"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("related_Attachment__ContentType__s");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Related_Attachment__ContentType__s"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("related_Attachment__Length__s");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Related_Attachment__Length__s"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("related_Attachment__Name__s");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Related_Attachment__Name__s"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solution_Id__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Solution_Id__c"));
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
        elemField.setFieldName("sourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Summary"));
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
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UrlName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "VersionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewScore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ViewScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voteScore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "VoteScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
/**
 * QuantityForecast.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class QuantityForecast  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.Double closed;

    private java.lang.Double commit;

    private java.lang.String commitComment;

    private java.lang.Double commitOverride;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.Double defaultRollupCommit;

    private java.lang.Double defaultRollupUpside;

    private java.util.Calendar invalidationDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String managerChoiceCommit;

    private java.lang.String managerChoiceUpside;

    private java.lang.Double managerClosed;

    private java.lang.Double managerCommit;

    private java.lang.Double managerCommitOverride;

    private java.lang.Double managerDefaultRollupCommit;

    private java.lang.Double managerDefaultRollupUpside;

    private java.lang.String managerId;

    private java.lang.Double managerOpportunityRollupCommit;

    private java.lang.Double managerOpportunityRollupUpside;

    private java.lang.Double managerPipeline;

    private java.lang.Double managerUpside;

    private java.lang.Double managerUpsideOverride;

    private java.lang.Double opportunityRollupClosed;

    private java.lang.Double opportunityRollupCommit;

    private java.lang.Double opportunityRollupPipeline;

    private java.lang.Double opportunityRollupUpside;

    private com.sforce.soap.enterprise.sobject.User owner;

    private java.lang.String ownerId;

    private java.lang.String periodId;

    private java.lang.Double pipeline;

    private java.lang.String productFamily;

    private com.sforce.soap.enterprise.QueryResult quantityForecastHistories;

    private java.lang.Double quota;

    private java.util.Date startDate;

    private java.util.Calendar systemModstamp;

    private java.lang.Double upside;

    private java.lang.String upsideComment;

    private java.lang.Double upsideOverride;

    public QuantityForecast() {
    }

    public QuantityForecast(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.Double closed,
           java.lang.Double commit,
           java.lang.String commitComment,
           java.lang.Double commitOverride,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.Double defaultRollupCommit,
           java.lang.Double defaultRollupUpside,
           java.util.Calendar invalidationDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String managerChoiceCommit,
           java.lang.String managerChoiceUpside,
           java.lang.Double managerClosed,
           java.lang.Double managerCommit,
           java.lang.Double managerCommitOverride,
           java.lang.Double managerDefaultRollupCommit,
           java.lang.Double managerDefaultRollupUpside,
           java.lang.String managerId,
           java.lang.Double managerOpportunityRollupCommit,
           java.lang.Double managerOpportunityRollupUpside,
           java.lang.Double managerPipeline,
           java.lang.Double managerUpside,
           java.lang.Double managerUpsideOverride,
           java.lang.Double opportunityRollupClosed,
           java.lang.Double opportunityRollupCommit,
           java.lang.Double opportunityRollupPipeline,
           java.lang.Double opportunityRollupUpside,
           com.sforce.soap.enterprise.sobject.User owner,
           java.lang.String ownerId,
           java.lang.String periodId,
           java.lang.Double pipeline,
           java.lang.String productFamily,
           com.sforce.soap.enterprise.QueryResult quantityForecastHistories,
           java.lang.Double quota,
           java.util.Date startDate,
           java.util.Calendar systemModstamp,
           java.lang.Double upside,
           java.lang.String upsideComment,
           java.lang.Double upsideOverride) {
        super(
            fieldsToNull,
            id);
        this.closed = closed;
        this.commit = commit;
        this.commitComment = commitComment;
        this.commitOverride = commitOverride;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.defaultRollupCommit = defaultRollupCommit;
        this.defaultRollupUpside = defaultRollupUpside;
        this.invalidationDate = invalidationDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.managerChoiceCommit = managerChoiceCommit;
        this.managerChoiceUpside = managerChoiceUpside;
        this.managerClosed = managerClosed;
        this.managerCommit = managerCommit;
        this.managerCommitOverride = managerCommitOverride;
        this.managerDefaultRollupCommit = managerDefaultRollupCommit;
        this.managerDefaultRollupUpside = managerDefaultRollupUpside;
        this.managerId = managerId;
        this.managerOpportunityRollupCommit = managerOpportunityRollupCommit;
        this.managerOpportunityRollupUpside = managerOpportunityRollupUpside;
        this.managerPipeline = managerPipeline;
        this.managerUpside = managerUpside;
        this.managerUpsideOverride = managerUpsideOverride;
        this.opportunityRollupClosed = opportunityRollupClosed;
        this.opportunityRollupCommit = opportunityRollupCommit;
        this.opportunityRollupPipeline = opportunityRollupPipeline;
        this.opportunityRollupUpside = opportunityRollupUpside;
        this.owner = owner;
        this.ownerId = ownerId;
        this.periodId = periodId;
        this.pipeline = pipeline;
        this.productFamily = productFamily;
        this.quantityForecastHistories = quantityForecastHistories;
        this.quota = quota;
        this.startDate = startDate;
        this.systemModstamp = systemModstamp;
        this.upside = upside;
        this.upsideComment = upsideComment;
        this.upsideOverride = upsideOverride;
    }


    /**
     * Gets the closed value for this QuantityForecast.
     * 
     * @return closed
     */
    public java.lang.Double getClosed() {
        return closed;
    }


    /**
     * Sets the closed value for this QuantityForecast.
     * 
     * @param closed
     */
    public void setClosed(java.lang.Double closed) {
        this.closed = closed;
    }


    /**
     * Gets the commit value for this QuantityForecast.
     * 
     * @return commit
     */
    public java.lang.Double getCommit() {
        return commit;
    }


    /**
     * Sets the commit value for this QuantityForecast.
     * 
     * @param commit
     */
    public void setCommit(java.lang.Double commit) {
        this.commit = commit;
    }


    /**
     * Gets the commitComment value for this QuantityForecast.
     * 
     * @return commitComment
     */
    public java.lang.String getCommitComment() {
        return commitComment;
    }


    /**
     * Sets the commitComment value for this QuantityForecast.
     * 
     * @param commitComment
     */
    public void setCommitComment(java.lang.String commitComment) {
        this.commitComment = commitComment;
    }


    /**
     * Gets the commitOverride value for this QuantityForecast.
     * 
     * @return commitOverride
     */
    public java.lang.Double getCommitOverride() {
        return commitOverride;
    }


    /**
     * Sets the commitOverride value for this QuantityForecast.
     * 
     * @param commitOverride
     */
    public void setCommitOverride(java.lang.Double commitOverride) {
        this.commitOverride = commitOverride;
    }


    /**
     * Gets the createdBy value for this QuantityForecast.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this QuantityForecast.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this QuantityForecast.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this QuantityForecast.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this QuantityForecast.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this QuantityForecast.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the defaultRollupCommit value for this QuantityForecast.
     * 
     * @return defaultRollupCommit
     */
    public java.lang.Double getDefaultRollupCommit() {
        return defaultRollupCommit;
    }


    /**
     * Sets the defaultRollupCommit value for this QuantityForecast.
     * 
     * @param defaultRollupCommit
     */
    public void setDefaultRollupCommit(java.lang.Double defaultRollupCommit) {
        this.defaultRollupCommit = defaultRollupCommit;
    }


    /**
     * Gets the defaultRollupUpside value for this QuantityForecast.
     * 
     * @return defaultRollupUpside
     */
    public java.lang.Double getDefaultRollupUpside() {
        return defaultRollupUpside;
    }


    /**
     * Sets the defaultRollupUpside value for this QuantityForecast.
     * 
     * @param defaultRollupUpside
     */
    public void setDefaultRollupUpside(java.lang.Double defaultRollupUpside) {
        this.defaultRollupUpside = defaultRollupUpside;
    }


    /**
     * Gets the invalidationDate value for this QuantityForecast.
     * 
     * @return invalidationDate
     */
    public java.util.Calendar getInvalidationDate() {
        return invalidationDate;
    }


    /**
     * Sets the invalidationDate value for this QuantityForecast.
     * 
     * @param invalidationDate
     */
    public void setInvalidationDate(java.util.Calendar invalidationDate) {
        this.invalidationDate = invalidationDate;
    }


    /**
     * Gets the lastModifiedBy value for this QuantityForecast.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this QuantityForecast.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this QuantityForecast.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this QuantityForecast.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this QuantityForecast.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this QuantityForecast.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the managerChoiceCommit value for this QuantityForecast.
     * 
     * @return managerChoiceCommit
     */
    public java.lang.String getManagerChoiceCommit() {
        return managerChoiceCommit;
    }


    /**
     * Sets the managerChoiceCommit value for this QuantityForecast.
     * 
     * @param managerChoiceCommit
     */
    public void setManagerChoiceCommit(java.lang.String managerChoiceCommit) {
        this.managerChoiceCommit = managerChoiceCommit;
    }


    /**
     * Gets the managerChoiceUpside value for this QuantityForecast.
     * 
     * @return managerChoiceUpside
     */
    public java.lang.String getManagerChoiceUpside() {
        return managerChoiceUpside;
    }


    /**
     * Sets the managerChoiceUpside value for this QuantityForecast.
     * 
     * @param managerChoiceUpside
     */
    public void setManagerChoiceUpside(java.lang.String managerChoiceUpside) {
        this.managerChoiceUpside = managerChoiceUpside;
    }


    /**
     * Gets the managerClosed value for this QuantityForecast.
     * 
     * @return managerClosed
     */
    public java.lang.Double getManagerClosed() {
        return managerClosed;
    }


    /**
     * Sets the managerClosed value for this QuantityForecast.
     * 
     * @param managerClosed
     */
    public void setManagerClosed(java.lang.Double managerClosed) {
        this.managerClosed = managerClosed;
    }


    /**
     * Gets the managerCommit value for this QuantityForecast.
     * 
     * @return managerCommit
     */
    public java.lang.Double getManagerCommit() {
        return managerCommit;
    }


    /**
     * Sets the managerCommit value for this QuantityForecast.
     * 
     * @param managerCommit
     */
    public void setManagerCommit(java.lang.Double managerCommit) {
        this.managerCommit = managerCommit;
    }


    /**
     * Gets the managerCommitOverride value for this QuantityForecast.
     * 
     * @return managerCommitOverride
     */
    public java.lang.Double getManagerCommitOverride() {
        return managerCommitOverride;
    }


    /**
     * Sets the managerCommitOverride value for this QuantityForecast.
     * 
     * @param managerCommitOverride
     */
    public void setManagerCommitOverride(java.lang.Double managerCommitOverride) {
        this.managerCommitOverride = managerCommitOverride;
    }


    /**
     * Gets the managerDefaultRollupCommit value for this QuantityForecast.
     * 
     * @return managerDefaultRollupCommit
     */
    public java.lang.Double getManagerDefaultRollupCommit() {
        return managerDefaultRollupCommit;
    }


    /**
     * Sets the managerDefaultRollupCommit value for this QuantityForecast.
     * 
     * @param managerDefaultRollupCommit
     */
    public void setManagerDefaultRollupCommit(java.lang.Double managerDefaultRollupCommit) {
        this.managerDefaultRollupCommit = managerDefaultRollupCommit;
    }


    /**
     * Gets the managerDefaultRollupUpside value for this QuantityForecast.
     * 
     * @return managerDefaultRollupUpside
     */
    public java.lang.Double getManagerDefaultRollupUpside() {
        return managerDefaultRollupUpside;
    }


    /**
     * Sets the managerDefaultRollupUpside value for this QuantityForecast.
     * 
     * @param managerDefaultRollupUpside
     */
    public void setManagerDefaultRollupUpside(java.lang.Double managerDefaultRollupUpside) {
        this.managerDefaultRollupUpside = managerDefaultRollupUpside;
    }


    /**
     * Gets the managerId value for this QuantityForecast.
     * 
     * @return managerId
     */
    public java.lang.String getManagerId() {
        return managerId;
    }


    /**
     * Sets the managerId value for this QuantityForecast.
     * 
     * @param managerId
     */
    public void setManagerId(java.lang.String managerId) {
        this.managerId = managerId;
    }


    /**
     * Gets the managerOpportunityRollupCommit value for this QuantityForecast.
     * 
     * @return managerOpportunityRollupCommit
     */
    public java.lang.Double getManagerOpportunityRollupCommit() {
        return managerOpportunityRollupCommit;
    }


    /**
     * Sets the managerOpportunityRollupCommit value for this QuantityForecast.
     * 
     * @param managerOpportunityRollupCommit
     */
    public void setManagerOpportunityRollupCommit(java.lang.Double managerOpportunityRollupCommit) {
        this.managerOpportunityRollupCommit = managerOpportunityRollupCommit;
    }


    /**
     * Gets the managerOpportunityRollupUpside value for this QuantityForecast.
     * 
     * @return managerOpportunityRollupUpside
     */
    public java.lang.Double getManagerOpportunityRollupUpside() {
        return managerOpportunityRollupUpside;
    }


    /**
     * Sets the managerOpportunityRollupUpside value for this QuantityForecast.
     * 
     * @param managerOpportunityRollupUpside
     */
    public void setManagerOpportunityRollupUpside(java.lang.Double managerOpportunityRollupUpside) {
        this.managerOpportunityRollupUpside = managerOpportunityRollupUpside;
    }


    /**
     * Gets the managerPipeline value for this QuantityForecast.
     * 
     * @return managerPipeline
     */
    public java.lang.Double getManagerPipeline() {
        return managerPipeline;
    }


    /**
     * Sets the managerPipeline value for this QuantityForecast.
     * 
     * @param managerPipeline
     */
    public void setManagerPipeline(java.lang.Double managerPipeline) {
        this.managerPipeline = managerPipeline;
    }


    /**
     * Gets the managerUpside value for this QuantityForecast.
     * 
     * @return managerUpside
     */
    public java.lang.Double getManagerUpside() {
        return managerUpside;
    }


    /**
     * Sets the managerUpside value for this QuantityForecast.
     * 
     * @param managerUpside
     */
    public void setManagerUpside(java.lang.Double managerUpside) {
        this.managerUpside = managerUpside;
    }


    /**
     * Gets the managerUpsideOverride value for this QuantityForecast.
     * 
     * @return managerUpsideOverride
     */
    public java.lang.Double getManagerUpsideOverride() {
        return managerUpsideOverride;
    }


    /**
     * Sets the managerUpsideOverride value for this QuantityForecast.
     * 
     * @param managerUpsideOverride
     */
    public void setManagerUpsideOverride(java.lang.Double managerUpsideOverride) {
        this.managerUpsideOverride = managerUpsideOverride;
    }


    /**
     * Gets the opportunityRollupClosed value for this QuantityForecast.
     * 
     * @return opportunityRollupClosed
     */
    public java.lang.Double getOpportunityRollupClosed() {
        return opportunityRollupClosed;
    }


    /**
     * Sets the opportunityRollupClosed value for this QuantityForecast.
     * 
     * @param opportunityRollupClosed
     */
    public void setOpportunityRollupClosed(java.lang.Double opportunityRollupClosed) {
        this.opportunityRollupClosed = opportunityRollupClosed;
    }


    /**
     * Gets the opportunityRollupCommit value for this QuantityForecast.
     * 
     * @return opportunityRollupCommit
     */
    public java.lang.Double getOpportunityRollupCommit() {
        return opportunityRollupCommit;
    }


    /**
     * Sets the opportunityRollupCommit value for this QuantityForecast.
     * 
     * @param opportunityRollupCommit
     */
    public void setOpportunityRollupCommit(java.lang.Double opportunityRollupCommit) {
        this.opportunityRollupCommit = opportunityRollupCommit;
    }


    /**
     * Gets the opportunityRollupPipeline value for this QuantityForecast.
     * 
     * @return opportunityRollupPipeline
     */
    public java.lang.Double getOpportunityRollupPipeline() {
        return opportunityRollupPipeline;
    }


    /**
     * Sets the opportunityRollupPipeline value for this QuantityForecast.
     * 
     * @param opportunityRollupPipeline
     */
    public void setOpportunityRollupPipeline(java.lang.Double opportunityRollupPipeline) {
        this.opportunityRollupPipeline = opportunityRollupPipeline;
    }


    /**
     * Gets the opportunityRollupUpside value for this QuantityForecast.
     * 
     * @return opportunityRollupUpside
     */
    public java.lang.Double getOpportunityRollupUpside() {
        return opportunityRollupUpside;
    }


    /**
     * Sets the opportunityRollupUpside value for this QuantityForecast.
     * 
     * @param opportunityRollupUpside
     */
    public void setOpportunityRollupUpside(java.lang.Double opportunityRollupUpside) {
        this.opportunityRollupUpside = opportunityRollupUpside;
    }


    /**
     * Gets the owner value for this QuantityForecast.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.User getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this QuantityForecast.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.User owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this QuantityForecast.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this QuantityForecast.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the periodId value for this QuantityForecast.
     * 
     * @return periodId
     */
    public java.lang.String getPeriodId() {
        return periodId;
    }


    /**
     * Sets the periodId value for this QuantityForecast.
     * 
     * @param periodId
     */
    public void setPeriodId(java.lang.String periodId) {
        this.periodId = periodId;
    }


    /**
     * Gets the pipeline value for this QuantityForecast.
     * 
     * @return pipeline
     */
    public java.lang.Double getPipeline() {
        return pipeline;
    }


    /**
     * Sets the pipeline value for this QuantityForecast.
     * 
     * @param pipeline
     */
    public void setPipeline(java.lang.Double pipeline) {
        this.pipeline = pipeline;
    }


    /**
     * Gets the productFamily value for this QuantityForecast.
     * 
     * @return productFamily
     */
    public java.lang.String getProductFamily() {
        return productFamily;
    }


    /**
     * Sets the productFamily value for this QuantityForecast.
     * 
     * @param productFamily
     */
    public void setProductFamily(java.lang.String productFamily) {
        this.productFamily = productFamily;
    }


    /**
     * Gets the quantityForecastHistories value for this QuantityForecast.
     * 
     * @return quantityForecastHistories
     */
    public com.sforce.soap.enterprise.QueryResult getQuantityForecastHistories() {
        return quantityForecastHistories;
    }


    /**
     * Sets the quantityForecastHistories value for this QuantityForecast.
     * 
     * @param quantityForecastHistories
     */
    public void setQuantityForecastHistories(com.sforce.soap.enterprise.QueryResult quantityForecastHistories) {
        this.quantityForecastHistories = quantityForecastHistories;
    }


    /**
     * Gets the quota value for this QuantityForecast.
     * 
     * @return quota
     */
    public java.lang.Double getQuota() {
        return quota;
    }


    /**
     * Sets the quota value for this QuantityForecast.
     * 
     * @param quota
     */
    public void setQuota(java.lang.Double quota) {
        this.quota = quota;
    }


    /**
     * Gets the startDate value for this QuantityForecast.
     * 
     * @return startDate
     */
    public java.util.Date getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this QuantityForecast.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the systemModstamp value for this QuantityForecast.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this QuantityForecast.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the upside value for this QuantityForecast.
     * 
     * @return upside
     */
    public java.lang.Double getUpside() {
        return upside;
    }


    /**
     * Sets the upside value for this QuantityForecast.
     * 
     * @param upside
     */
    public void setUpside(java.lang.Double upside) {
        this.upside = upside;
    }


    /**
     * Gets the upsideComment value for this QuantityForecast.
     * 
     * @return upsideComment
     */
    public java.lang.String getUpsideComment() {
        return upsideComment;
    }


    /**
     * Sets the upsideComment value for this QuantityForecast.
     * 
     * @param upsideComment
     */
    public void setUpsideComment(java.lang.String upsideComment) {
        this.upsideComment = upsideComment;
    }


    /**
     * Gets the upsideOverride value for this QuantityForecast.
     * 
     * @return upsideOverride
     */
    public java.lang.Double getUpsideOverride() {
        return upsideOverride;
    }


    /**
     * Sets the upsideOverride value for this QuantityForecast.
     * 
     * @param upsideOverride
     */
    public void setUpsideOverride(java.lang.Double upsideOverride) {
        this.upsideOverride = upsideOverride;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuantityForecast)) return false;
        QuantityForecast other = (QuantityForecast) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.closed==null && other.getClosed()==null) || 
             (this.closed!=null &&
              this.closed.equals(other.getClosed()))) &&
            ((this.commit==null && other.getCommit()==null) || 
             (this.commit!=null &&
              this.commit.equals(other.getCommit()))) &&
            ((this.commitComment==null && other.getCommitComment()==null) || 
             (this.commitComment!=null &&
              this.commitComment.equals(other.getCommitComment()))) &&
            ((this.commitOverride==null && other.getCommitOverride()==null) || 
             (this.commitOverride!=null &&
              this.commitOverride.equals(other.getCommitOverride()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.defaultRollupCommit==null && other.getDefaultRollupCommit()==null) || 
             (this.defaultRollupCommit!=null &&
              this.defaultRollupCommit.equals(other.getDefaultRollupCommit()))) &&
            ((this.defaultRollupUpside==null && other.getDefaultRollupUpside()==null) || 
             (this.defaultRollupUpside!=null &&
              this.defaultRollupUpside.equals(other.getDefaultRollupUpside()))) &&
            ((this.invalidationDate==null && other.getInvalidationDate()==null) || 
             (this.invalidationDate!=null &&
              this.invalidationDate.equals(other.getInvalidationDate()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.managerChoiceCommit==null && other.getManagerChoiceCommit()==null) || 
             (this.managerChoiceCommit!=null &&
              this.managerChoiceCommit.equals(other.getManagerChoiceCommit()))) &&
            ((this.managerChoiceUpside==null && other.getManagerChoiceUpside()==null) || 
             (this.managerChoiceUpside!=null &&
              this.managerChoiceUpside.equals(other.getManagerChoiceUpside()))) &&
            ((this.managerClosed==null && other.getManagerClosed()==null) || 
             (this.managerClosed!=null &&
              this.managerClosed.equals(other.getManagerClosed()))) &&
            ((this.managerCommit==null && other.getManagerCommit()==null) || 
             (this.managerCommit!=null &&
              this.managerCommit.equals(other.getManagerCommit()))) &&
            ((this.managerCommitOverride==null && other.getManagerCommitOverride()==null) || 
             (this.managerCommitOverride!=null &&
              this.managerCommitOverride.equals(other.getManagerCommitOverride()))) &&
            ((this.managerDefaultRollupCommit==null && other.getManagerDefaultRollupCommit()==null) || 
             (this.managerDefaultRollupCommit!=null &&
              this.managerDefaultRollupCommit.equals(other.getManagerDefaultRollupCommit()))) &&
            ((this.managerDefaultRollupUpside==null && other.getManagerDefaultRollupUpside()==null) || 
             (this.managerDefaultRollupUpside!=null &&
              this.managerDefaultRollupUpside.equals(other.getManagerDefaultRollupUpside()))) &&
            ((this.managerId==null && other.getManagerId()==null) || 
             (this.managerId!=null &&
              this.managerId.equals(other.getManagerId()))) &&
            ((this.managerOpportunityRollupCommit==null && other.getManagerOpportunityRollupCommit()==null) || 
             (this.managerOpportunityRollupCommit!=null &&
              this.managerOpportunityRollupCommit.equals(other.getManagerOpportunityRollupCommit()))) &&
            ((this.managerOpportunityRollupUpside==null && other.getManagerOpportunityRollupUpside()==null) || 
             (this.managerOpportunityRollupUpside!=null &&
              this.managerOpportunityRollupUpside.equals(other.getManagerOpportunityRollupUpside()))) &&
            ((this.managerPipeline==null && other.getManagerPipeline()==null) || 
             (this.managerPipeline!=null &&
              this.managerPipeline.equals(other.getManagerPipeline()))) &&
            ((this.managerUpside==null && other.getManagerUpside()==null) || 
             (this.managerUpside!=null &&
              this.managerUpside.equals(other.getManagerUpside()))) &&
            ((this.managerUpsideOverride==null && other.getManagerUpsideOverride()==null) || 
             (this.managerUpsideOverride!=null &&
              this.managerUpsideOverride.equals(other.getManagerUpsideOverride()))) &&
            ((this.opportunityRollupClosed==null && other.getOpportunityRollupClosed()==null) || 
             (this.opportunityRollupClosed!=null &&
              this.opportunityRollupClosed.equals(other.getOpportunityRollupClosed()))) &&
            ((this.opportunityRollupCommit==null && other.getOpportunityRollupCommit()==null) || 
             (this.opportunityRollupCommit!=null &&
              this.opportunityRollupCommit.equals(other.getOpportunityRollupCommit()))) &&
            ((this.opportunityRollupPipeline==null && other.getOpportunityRollupPipeline()==null) || 
             (this.opportunityRollupPipeline!=null &&
              this.opportunityRollupPipeline.equals(other.getOpportunityRollupPipeline()))) &&
            ((this.opportunityRollupUpside==null && other.getOpportunityRollupUpside()==null) || 
             (this.opportunityRollupUpside!=null &&
              this.opportunityRollupUpside.equals(other.getOpportunityRollupUpside()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.periodId==null && other.getPeriodId()==null) || 
             (this.periodId!=null &&
              this.periodId.equals(other.getPeriodId()))) &&
            ((this.pipeline==null && other.getPipeline()==null) || 
             (this.pipeline!=null &&
              this.pipeline.equals(other.getPipeline()))) &&
            ((this.productFamily==null && other.getProductFamily()==null) || 
             (this.productFamily!=null &&
              this.productFamily.equals(other.getProductFamily()))) &&
            ((this.quantityForecastHistories==null && other.getQuantityForecastHistories()==null) || 
             (this.quantityForecastHistories!=null &&
              this.quantityForecastHistories.equals(other.getQuantityForecastHistories()))) &&
            ((this.quota==null && other.getQuota()==null) || 
             (this.quota!=null &&
              this.quota.equals(other.getQuota()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.upside==null && other.getUpside()==null) || 
             (this.upside!=null &&
              this.upside.equals(other.getUpside()))) &&
            ((this.upsideComment==null && other.getUpsideComment()==null) || 
             (this.upsideComment!=null &&
              this.upsideComment.equals(other.getUpsideComment()))) &&
            ((this.upsideOverride==null && other.getUpsideOverride()==null) || 
             (this.upsideOverride!=null &&
              this.upsideOverride.equals(other.getUpsideOverride())));
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
        if (getClosed() != null) {
            _hashCode += getClosed().hashCode();
        }
        if (getCommit() != null) {
            _hashCode += getCommit().hashCode();
        }
        if (getCommitComment() != null) {
            _hashCode += getCommitComment().hashCode();
        }
        if (getCommitOverride() != null) {
            _hashCode += getCommitOverride().hashCode();
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
        if (getDefaultRollupCommit() != null) {
            _hashCode += getDefaultRollupCommit().hashCode();
        }
        if (getDefaultRollupUpside() != null) {
            _hashCode += getDefaultRollupUpside().hashCode();
        }
        if (getInvalidationDate() != null) {
            _hashCode += getInvalidationDate().hashCode();
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
        if (getManagerChoiceCommit() != null) {
            _hashCode += getManagerChoiceCommit().hashCode();
        }
        if (getManagerChoiceUpside() != null) {
            _hashCode += getManagerChoiceUpside().hashCode();
        }
        if (getManagerClosed() != null) {
            _hashCode += getManagerClosed().hashCode();
        }
        if (getManagerCommit() != null) {
            _hashCode += getManagerCommit().hashCode();
        }
        if (getManagerCommitOverride() != null) {
            _hashCode += getManagerCommitOverride().hashCode();
        }
        if (getManagerDefaultRollupCommit() != null) {
            _hashCode += getManagerDefaultRollupCommit().hashCode();
        }
        if (getManagerDefaultRollupUpside() != null) {
            _hashCode += getManagerDefaultRollupUpside().hashCode();
        }
        if (getManagerId() != null) {
            _hashCode += getManagerId().hashCode();
        }
        if (getManagerOpportunityRollupCommit() != null) {
            _hashCode += getManagerOpportunityRollupCommit().hashCode();
        }
        if (getManagerOpportunityRollupUpside() != null) {
            _hashCode += getManagerOpportunityRollupUpside().hashCode();
        }
        if (getManagerPipeline() != null) {
            _hashCode += getManagerPipeline().hashCode();
        }
        if (getManagerUpside() != null) {
            _hashCode += getManagerUpside().hashCode();
        }
        if (getManagerUpsideOverride() != null) {
            _hashCode += getManagerUpsideOverride().hashCode();
        }
        if (getOpportunityRollupClosed() != null) {
            _hashCode += getOpportunityRollupClosed().hashCode();
        }
        if (getOpportunityRollupCommit() != null) {
            _hashCode += getOpportunityRollupCommit().hashCode();
        }
        if (getOpportunityRollupPipeline() != null) {
            _hashCode += getOpportunityRollupPipeline().hashCode();
        }
        if (getOpportunityRollupUpside() != null) {
            _hashCode += getOpportunityRollupUpside().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getPeriodId() != null) {
            _hashCode += getPeriodId().hashCode();
        }
        if (getPipeline() != null) {
            _hashCode += getPipeline().hashCode();
        }
        if (getProductFamily() != null) {
            _hashCode += getProductFamily().hashCode();
        }
        if (getQuantityForecastHistories() != null) {
            _hashCode += getQuantityForecastHistories().hashCode();
        }
        if (getQuota() != null) {
            _hashCode += getQuota().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getUpside() != null) {
            _hashCode += getUpside().hashCode();
        }
        if (getUpsideComment() != null) {
            _hashCode += getUpsideComment().hashCode();
        }
        if (getUpsideOverride() != null) {
            _hashCode += getUpsideOverride().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuantityForecast.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "QuantityForecast"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Closed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Commit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commitComment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CommitComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commitOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CommitOverride"));
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
        elemField.setFieldName("defaultRollupCommit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DefaultRollupCommit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultRollupUpside");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DefaultRollupUpside"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invalidationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "InvalidationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("managerChoiceCommit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ManagerChoiceCommit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managerChoiceUpside");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ManagerChoiceUpside"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managerClosed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ManagerClosed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managerCommit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ManagerCommit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managerCommitOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ManagerCommitOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managerDefaultRollupCommit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ManagerDefaultRollupCommit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managerDefaultRollupUpside");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ManagerDefaultRollupUpside"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managerId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ManagerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managerOpportunityRollupCommit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ManagerOpportunityRollupCommit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managerOpportunityRollupUpside");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ManagerOpportunityRollupUpside"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managerPipeline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ManagerPipeline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managerUpside");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ManagerUpside"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managerUpsideOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ManagerUpsideOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityRollupClosed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityRollupClosed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityRollupCommit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityRollupCommit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityRollupPipeline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityRollupPipeline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityRollupUpside");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityRollupUpside"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
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
        elemField.setFieldName("periodId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PeriodId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pipeline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pipeline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productFamily");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProductFamily"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityForecastHistories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "QuantityForecastHistories"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quota");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Quota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "StartDate"));
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
        elemField.setFieldName("upside");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Upside"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upsideComment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UpsideComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upsideOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UpsideOverride"));
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

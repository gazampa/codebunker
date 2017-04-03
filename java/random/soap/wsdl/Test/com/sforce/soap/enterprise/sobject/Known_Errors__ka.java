/**
 * Known_Errors__ka.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Known_Errors__ka  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String archivedById;

    private java.util.Calendar archivedDate;

    private java.lang.String articleNumber;

    private com.sforce.soap.enterprise.QueryResult caseArticles;

    private java.lang.Integer caseAssociationCount;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String draftVersionId;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.util.Calendar firstPublishedDate;

    private java.lang.Boolean isDeleted;

    private java.lang.String lastArchivedVersionId;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.util.Calendar lastPublishedDate;

    private java.lang.String masterLanguage;

    private java.lang.String onlineVersionId;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.String securityId;

    private java.util.Calendar systemModstamp;

    private java.lang.String title;

    private com.sforce.soap.enterprise.QueryResult viewStats;

    private com.sforce.soap.enterprise.QueryResult voteStats;

    private com.sforce.soap.enterprise.QueryResult votes;

    public Known_Errors__ka() {
    }

    public Known_Errors__ka(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String archivedById,
           java.util.Calendar archivedDate,
           java.lang.String articleNumber,
           com.sforce.soap.enterprise.QueryResult caseArticles,
           java.lang.Integer caseAssociationCount,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String draftVersionId,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.util.Calendar firstPublishedDate,
           java.lang.Boolean isDeleted,
           java.lang.String lastArchivedVersionId,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.util.Calendar lastPublishedDate,
           java.lang.String masterLanguage,
           java.lang.String onlineVersionId,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.String securityId,
           java.util.Calendar systemModstamp,
           java.lang.String title,
           com.sforce.soap.enterprise.QueryResult viewStats,
           com.sforce.soap.enterprise.QueryResult voteStats,
           com.sforce.soap.enterprise.QueryResult votes) {
        super(
            fieldsToNull,
            id);
        this.archivedById = archivedById;
        this.archivedDate = archivedDate;
        this.articleNumber = articleNumber;
        this.caseArticles = caseArticles;
        this.caseAssociationCount = caseAssociationCount;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.draftVersionId = draftVersionId;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.firstPublishedDate = firstPublishedDate;
        this.isDeleted = isDeleted;
        this.lastArchivedVersionId = lastArchivedVersionId;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.lastPublishedDate = lastPublishedDate;
        this.masterLanguage = masterLanguage;
        this.onlineVersionId = onlineVersionId;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.securityId = securityId;
        this.systemModstamp = systemModstamp;
        this.title = title;
        this.viewStats = viewStats;
        this.voteStats = voteStats;
        this.votes = votes;
    }


    /**
     * Gets the archivedById value for this Known_Errors__ka.
     * 
     * @return archivedById
     */
    public java.lang.String getArchivedById() {
        return archivedById;
    }


    /**
     * Sets the archivedById value for this Known_Errors__ka.
     * 
     * @param archivedById
     */
    public void setArchivedById(java.lang.String archivedById) {
        this.archivedById = archivedById;
    }


    /**
     * Gets the archivedDate value for this Known_Errors__ka.
     * 
     * @return archivedDate
     */
    public java.util.Calendar getArchivedDate() {
        return archivedDate;
    }


    /**
     * Sets the archivedDate value for this Known_Errors__ka.
     * 
     * @param archivedDate
     */
    public void setArchivedDate(java.util.Calendar archivedDate) {
        this.archivedDate = archivedDate;
    }


    /**
     * Gets the articleNumber value for this Known_Errors__ka.
     * 
     * @return articleNumber
     */
    public java.lang.String getArticleNumber() {
        return articleNumber;
    }


    /**
     * Sets the articleNumber value for this Known_Errors__ka.
     * 
     * @param articleNumber
     */
    public void setArticleNumber(java.lang.String articleNumber) {
        this.articleNumber = articleNumber;
    }


    /**
     * Gets the caseArticles value for this Known_Errors__ka.
     * 
     * @return caseArticles
     */
    public com.sforce.soap.enterprise.QueryResult getCaseArticles() {
        return caseArticles;
    }


    /**
     * Sets the caseArticles value for this Known_Errors__ka.
     * 
     * @param caseArticles
     */
    public void setCaseArticles(com.sforce.soap.enterprise.QueryResult caseArticles) {
        this.caseArticles = caseArticles;
    }


    /**
     * Gets the caseAssociationCount value for this Known_Errors__ka.
     * 
     * @return caseAssociationCount
     */
    public java.lang.Integer getCaseAssociationCount() {
        return caseAssociationCount;
    }


    /**
     * Sets the caseAssociationCount value for this Known_Errors__ka.
     * 
     * @param caseAssociationCount
     */
    public void setCaseAssociationCount(java.lang.Integer caseAssociationCount) {
        this.caseAssociationCount = caseAssociationCount;
    }


    /**
     * Gets the createdBy value for this Known_Errors__ka.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Known_Errors__ka.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Known_Errors__ka.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Known_Errors__ka.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Known_Errors__ka.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Known_Errors__ka.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the draftVersionId value for this Known_Errors__ka.
     * 
     * @return draftVersionId
     */
    public java.lang.String getDraftVersionId() {
        return draftVersionId;
    }


    /**
     * Sets the draftVersionId value for this Known_Errors__ka.
     * 
     * @param draftVersionId
     */
    public void setDraftVersionId(java.lang.String draftVersionId) {
        this.draftVersionId = draftVersionId;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Known_Errors__ka.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Known_Errors__ka.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the firstPublishedDate value for this Known_Errors__ka.
     * 
     * @return firstPublishedDate
     */
    public java.util.Calendar getFirstPublishedDate() {
        return firstPublishedDate;
    }


    /**
     * Sets the firstPublishedDate value for this Known_Errors__ka.
     * 
     * @param firstPublishedDate
     */
    public void setFirstPublishedDate(java.util.Calendar firstPublishedDate) {
        this.firstPublishedDate = firstPublishedDate;
    }


    /**
     * Gets the isDeleted value for this Known_Errors__ka.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Known_Errors__ka.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastArchivedVersionId value for this Known_Errors__ka.
     * 
     * @return lastArchivedVersionId
     */
    public java.lang.String getLastArchivedVersionId() {
        return lastArchivedVersionId;
    }


    /**
     * Sets the lastArchivedVersionId value for this Known_Errors__ka.
     * 
     * @param lastArchivedVersionId
     */
    public void setLastArchivedVersionId(java.lang.String lastArchivedVersionId) {
        this.lastArchivedVersionId = lastArchivedVersionId;
    }


    /**
     * Gets the lastModifiedBy value for this Known_Errors__ka.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Known_Errors__ka.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Known_Errors__ka.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Known_Errors__ka.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Known_Errors__ka.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Known_Errors__ka.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lastPublishedDate value for this Known_Errors__ka.
     * 
     * @return lastPublishedDate
     */
    public java.util.Calendar getLastPublishedDate() {
        return lastPublishedDate;
    }


    /**
     * Sets the lastPublishedDate value for this Known_Errors__ka.
     * 
     * @param lastPublishedDate
     */
    public void setLastPublishedDate(java.util.Calendar lastPublishedDate) {
        this.lastPublishedDate = lastPublishedDate;
    }


    /**
     * Gets the masterLanguage value for this Known_Errors__ka.
     * 
     * @return masterLanguage
     */
    public java.lang.String getMasterLanguage() {
        return masterLanguage;
    }


    /**
     * Sets the masterLanguage value for this Known_Errors__ka.
     * 
     * @param masterLanguage
     */
    public void setMasterLanguage(java.lang.String masterLanguage) {
        this.masterLanguage = masterLanguage;
    }


    /**
     * Gets the onlineVersionId value for this Known_Errors__ka.
     * 
     * @return onlineVersionId
     */
    public java.lang.String getOnlineVersionId() {
        return onlineVersionId;
    }


    /**
     * Sets the onlineVersionId value for this Known_Errors__ka.
     * 
     * @param onlineVersionId
     */
    public void setOnlineVersionId(java.lang.String onlineVersionId) {
        this.onlineVersionId = onlineVersionId;
    }


    /**
     * Gets the processInstances value for this Known_Errors__ka.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Known_Errors__ka.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Known_Errors__ka.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Known_Errors__ka.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the securityId value for this Known_Errors__ka.
     * 
     * @return securityId
     */
    public java.lang.String getSecurityId() {
        return securityId;
    }


    /**
     * Sets the securityId value for this Known_Errors__ka.
     * 
     * @param securityId
     */
    public void setSecurityId(java.lang.String securityId) {
        this.securityId = securityId;
    }


    /**
     * Gets the systemModstamp value for this Known_Errors__ka.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Known_Errors__ka.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the title value for this Known_Errors__ka.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Known_Errors__ka.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the viewStats value for this Known_Errors__ka.
     * 
     * @return viewStats
     */
    public com.sforce.soap.enterprise.QueryResult getViewStats() {
        return viewStats;
    }


    /**
     * Sets the viewStats value for this Known_Errors__ka.
     * 
     * @param viewStats
     */
    public void setViewStats(com.sforce.soap.enterprise.QueryResult viewStats) {
        this.viewStats = viewStats;
    }


    /**
     * Gets the voteStats value for this Known_Errors__ka.
     * 
     * @return voteStats
     */
    public com.sforce.soap.enterprise.QueryResult getVoteStats() {
        return voteStats;
    }


    /**
     * Sets the voteStats value for this Known_Errors__ka.
     * 
     * @param voteStats
     */
    public void setVoteStats(com.sforce.soap.enterprise.QueryResult voteStats) {
        this.voteStats = voteStats;
    }


    /**
     * Gets the votes value for this Known_Errors__ka.
     * 
     * @return votes
     */
    public com.sforce.soap.enterprise.QueryResult getVotes() {
        return votes;
    }


    /**
     * Sets the votes value for this Known_Errors__ka.
     * 
     * @param votes
     */
    public void setVotes(com.sforce.soap.enterprise.QueryResult votes) {
        this.votes = votes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Known_Errors__ka)) return false;
        Known_Errors__ka other = (Known_Errors__ka) obj;
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
            ((this.caseArticles==null && other.getCaseArticles()==null) || 
             (this.caseArticles!=null &&
              this.caseArticles.equals(other.getCaseArticles()))) &&
            ((this.caseAssociationCount==null && other.getCaseAssociationCount()==null) || 
             (this.caseAssociationCount!=null &&
              this.caseAssociationCount.equals(other.getCaseAssociationCount()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.draftVersionId==null && other.getDraftVersionId()==null) || 
             (this.draftVersionId!=null &&
              this.draftVersionId.equals(other.getDraftVersionId()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.firstPublishedDate==null && other.getFirstPublishedDate()==null) || 
             (this.firstPublishedDate!=null &&
              this.firstPublishedDate.equals(other.getFirstPublishedDate()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.lastArchivedVersionId==null && other.getLastArchivedVersionId()==null) || 
             (this.lastArchivedVersionId!=null &&
              this.lastArchivedVersionId.equals(other.getLastArchivedVersionId()))) &&
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
            ((this.masterLanguage==null && other.getMasterLanguage()==null) || 
             (this.masterLanguage!=null &&
              this.masterLanguage.equals(other.getMasterLanguage()))) &&
            ((this.onlineVersionId==null && other.getOnlineVersionId()==null) || 
             (this.onlineVersionId!=null &&
              this.onlineVersionId.equals(other.getOnlineVersionId()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.securityId==null && other.getSecurityId()==null) || 
             (this.securityId!=null &&
              this.securityId.equals(other.getSecurityId()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.viewStats==null && other.getViewStats()==null) || 
             (this.viewStats!=null &&
              this.viewStats.equals(other.getViewStats()))) &&
            ((this.voteStats==null && other.getVoteStats()==null) || 
             (this.voteStats!=null &&
              this.voteStats.equals(other.getVoteStats()))) &&
            ((this.votes==null && other.getVotes()==null) || 
             (this.votes!=null &&
              this.votes.equals(other.getVotes())));
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
        if (getCaseArticles() != null) {
            _hashCode += getCaseArticles().hashCode();
        }
        if (getCaseAssociationCount() != null) {
            _hashCode += getCaseAssociationCount().hashCode();
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
        if (getDraftVersionId() != null) {
            _hashCode += getDraftVersionId().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getFirstPublishedDate() != null) {
            _hashCode += getFirstPublishedDate().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getLastArchivedVersionId() != null) {
            _hashCode += getLastArchivedVersionId().hashCode();
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
        if (getMasterLanguage() != null) {
            _hashCode += getMasterLanguage().hashCode();
        }
        if (getOnlineVersionId() != null) {
            _hashCode += getOnlineVersionId().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getSecurityId() != null) {
            _hashCode += getSecurityId().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getViewStats() != null) {
            _hashCode += getViewStats().hashCode();
        }
        if (getVoteStats() != null) {
            _hashCode += getVoteStats().hashCode();
        }
        if (getVotes() != null) {
            _hashCode += getVotes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Known_Errors__ka.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Known_Errors__ka"));
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
        elemField.setFieldName("caseArticles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseArticles"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseAssociationCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseAssociationCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("draftVersionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DraftVersionId"));
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
        elemField.setFieldName("lastArchivedVersionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastArchivedVersionId"));
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
        elemField.setFieldName("masterLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MasterLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onlineVersionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OnlineVersionId"));
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
        elemField.setFieldName("securityId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SecurityId"));
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
        elemField.setFieldName("viewStats");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ViewStats"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voteStats");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "VoteStats"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("votes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Votes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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

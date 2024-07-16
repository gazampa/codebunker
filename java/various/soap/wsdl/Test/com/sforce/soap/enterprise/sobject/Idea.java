/**
 * Idea.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Idea  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.Double age__c;

    private java.lang.String backlog_Status__c;

    private java.lang.String body;

    private java.lang.String categories;

    private java.lang.String category__c;

    private com.sforce.soap.enterprise.sobject.Category__c category__r;

    private com.sforce.soap.enterprise.QueryResult comments;

    private com.sforce.soap.enterprise.sobject.Community community;

    private java.lang.String communityId;

    private java.lang.String company_Name__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String department__c;

    private java.lang.String dominus_URL__c;

    private java.lang.String email_Contact__c;

    private java.lang.String feature__c;

    private com.sforce.soap.enterprise.sobject.Feature__c feature__r;

    private java.lang.String ideasInAction__c;

    private java.lang.Boolean isDeleted;

    private java.lang.Boolean isHtml;

    private java.lang.Boolean isMerged;

    private com.sforce.soap.enterprise.sobject.IdeaComment lastComment;

    private java.util.Calendar lastCommentDate;

    private java.lang.String lastCommentId;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.Integer numComments;

    private com.sforce.soap.enterprise.sobject.Idea parentIdea;

    private java.lang.String parentIdeaId;

    private java.lang.Boolean processed_By_Daily_Digest__c;

    private java.lang.Boolean processed_By_Weekly_Digest__c;

    private java.lang.String profile__c;

    private java.lang.String project__c;

    private com.sforce.soap.enterprise.sobject.Ideas_Projects__c project__r;

    private com.sforce.soap.enterprise.QueryResult r00N30000002SVCeEAO__r;

    private com.sforce.soap.enterprise.sobject.RecordType recordType;

    private java.lang.String recordTypeId;

    private java.lang.String related_Project__c;

    private com.sforce.soap.enterprise.sobject.KProject__c related_Project__r;

    private java.lang.String score__c;

    private java.lang.String status;

    private java.lang.String submitted_By__c;

    private java.util.Calendar systemModstamp;

    private java.lang.String title;

    private com.sforce.soap.enterprise.QueryResult user_Story_Idea__r;

    private java.lang.Double voteScore;

    private java.lang.Double voteTotal;

    private com.sforce.soap.enterprise.QueryResult votes;

    public Idea() {
    }

    public Idea(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.Double age__c,
           java.lang.String backlog_Status__c,
           java.lang.String body,
           java.lang.String categories,
           java.lang.String category__c,
           com.sforce.soap.enterprise.sobject.Category__c category__r,
           com.sforce.soap.enterprise.QueryResult comments,
           com.sforce.soap.enterprise.sobject.Community community,
           java.lang.String communityId,
           java.lang.String company_Name__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String department__c,
           java.lang.String dominus_URL__c,
           java.lang.String email_Contact__c,
           java.lang.String feature__c,
           com.sforce.soap.enterprise.sobject.Feature__c feature__r,
           java.lang.String ideasInAction__c,
           java.lang.Boolean isDeleted,
           java.lang.Boolean isHtml,
           java.lang.Boolean isMerged,
           com.sforce.soap.enterprise.sobject.IdeaComment lastComment,
           java.util.Calendar lastCommentDate,
           java.lang.String lastCommentId,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.Integer numComments,
           com.sforce.soap.enterprise.sobject.Idea parentIdea,
           java.lang.String parentIdeaId,
           java.lang.Boolean processed_By_Daily_Digest__c,
           java.lang.Boolean processed_By_Weekly_Digest__c,
           java.lang.String profile__c,
           java.lang.String project__c,
           com.sforce.soap.enterprise.sobject.Ideas_Projects__c project__r,
           com.sforce.soap.enterprise.QueryResult r00N30000002SVCeEAO__r,
           com.sforce.soap.enterprise.sobject.RecordType recordType,
           java.lang.String recordTypeId,
           java.lang.String related_Project__c,
           com.sforce.soap.enterprise.sobject.KProject__c related_Project__r,
           java.lang.String score__c,
           java.lang.String status,
           java.lang.String submitted_By__c,
           java.util.Calendar systemModstamp,
           java.lang.String title,
           com.sforce.soap.enterprise.QueryResult user_Story_Idea__r,
           java.lang.Double voteScore,
           java.lang.Double voteTotal,
           com.sforce.soap.enterprise.QueryResult votes) {
        super(
            fieldsToNull,
            id);
        this.age__c = age__c;
        this.backlog_Status__c = backlog_Status__c;
        this.body = body;
        this.categories = categories;
        this.category__c = category__c;
        this.category__r = category__r;
        this.comments = comments;
        this.community = community;
        this.communityId = communityId;
        this.company_Name__c = company_Name__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.department__c = department__c;
        this.dominus_URL__c = dominus_URL__c;
        this.email_Contact__c = email_Contact__c;
        this.feature__c = feature__c;
        this.feature__r = feature__r;
        this.ideasInAction__c = ideasInAction__c;
        this.isDeleted = isDeleted;
        this.isHtml = isHtml;
        this.isMerged = isMerged;
        this.lastComment = lastComment;
        this.lastCommentDate = lastCommentDate;
        this.lastCommentId = lastCommentId;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.numComments = numComments;
        this.parentIdea = parentIdea;
        this.parentIdeaId = parentIdeaId;
        this.processed_By_Daily_Digest__c = processed_By_Daily_Digest__c;
        this.processed_By_Weekly_Digest__c = processed_By_Weekly_Digest__c;
        this.profile__c = profile__c;
        this.project__c = project__c;
        this.project__r = project__r;
        this.r00N30000002SVCeEAO__r = r00N30000002SVCeEAO__r;
        this.recordType = recordType;
        this.recordTypeId = recordTypeId;
        this.related_Project__c = related_Project__c;
        this.related_Project__r = related_Project__r;
        this.score__c = score__c;
        this.status = status;
        this.submitted_By__c = submitted_By__c;
        this.systemModstamp = systemModstamp;
        this.title = title;
        this.user_Story_Idea__r = user_Story_Idea__r;
        this.voteScore = voteScore;
        this.voteTotal = voteTotal;
        this.votes = votes;
    }


    /**
     * Gets the age__c value for this Idea.
     * 
     * @return age__c
     */
    public java.lang.Double getAge__c() {
        return age__c;
    }


    /**
     * Sets the age__c value for this Idea.
     * 
     * @param age__c
     */
    public void setAge__c(java.lang.Double age__c) {
        this.age__c = age__c;
    }


    /**
     * Gets the backlog_Status__c value for this Idea.
     * 
     * @return backlog_Status__c
     */
    public java.lang.String getBacklog_Status__c() {
        return backlog_Status__c;
    }


    /**
     * Sets the backlog_Status__c value for this Idea.
     * 
     * @param backlog_Status__c
     */
    public void setBacklog_Status__c(java.lang.String backlog_Status__c) {
        this.backlog_Status__c = backlog_Status__c;
    }


    /**
     * Gets the body value for this Idea.
     * 
     * @return body
     */
    public java.lang.String getBody() {
        return body;
    }


    /**
     * Sets the body value for this Idea.
     * 
     * @param body
     */
    public void setBody(java.lang.String body) {
        this.body = body;
    }


    /**
     * Gets the categories value for this Idea.
     * 
     * @return categories
     */
    public java.lang.String getCategories() {
        return categories;
    }


    /**
     * Sets the categories value for this Idea.
     * 
     * @param categories
     */
    public void setCategories(java.lang.String categories) {
        this.categories = categories;
    }


    /**
     * Gets the category__c value for this Idea.
     * 
     * @return category__c
     */
    public java.lang.String getCategory__c() {
        return category__c;
    }


    /**
     * Sets the category__c value for this Idea.
     * 
     * @param category__c
     */
    public void setCategory__c(java.lang.String category__c) {
        this.category__c = category__c;
    }


    /**
     * Gets the category__r value for this Idea.
     * 
     * @return category__r
     */
    public com.sforce.soap.enterprise.sobject.Category__c getCategory__r() {
        return category__r;
    }


    /**
     * Sets the category__r value for this Idea.
     * 
     * @param category__r
     */
    public void setCategory__r(com.sforce.soap.enterprise.sobject.Category__c category__r) {
        this.category__r = category__r;
    }


    /**
     * Gets the comments value for this Idea.
     * 
     * @return comments
     */
    public com.sforce.soap.enterprise.QueryResult getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this Idea.
     * 
     * @param comments
     */
    public void setComments(com.sforce.soap.enterprise.QueryResult comments) {
        this.comments = comments;
    }


    /**
     * Gets the community value for this Idea.
     * 
     * @return community
     */
    public com.sforce.soap.enterprise.sobject.Community getCommunity() {
        return community;
    }


    /**
     * Sets the community value for this Idea.
     * 
     * @param community
     */
    public void setCommunity(com.sforce.soap.enterprise.sobject.Community community) {
        this.community = community;
    }


    /**
     * Gets the communityId value for this Idea.
     * 
     * @return communityId
     */
    public java.lang.String getCommunityId() {
        return communityId;
    }


    /**
     * Sets the communityId value for this Idea.
     * 
     * @param communityId
     */
    public void setCommunityId(java.lang.String communityId) {
        this.communityId = communityId;
    }


    /**
     * Gets the company_Name__c value for this Idea.
     * 
     * @return company_Name__c
     */
    public java.lang.String getCompany_Name__c() {
        return company_Name__c;
    }


    /**
     * Sets the company_Name__c value for this Idea.
     * 
     * @param company_Name__c
     */
    public void setCompany_Name__c(java.lang.String company_Name__c) {
        this.company_Name__c = company_Name__c;
    }


    /**
     * Gets the createdBy value for this Idea.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Idea.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Idea.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Idea.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Idea.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Idea.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the department__c value for this Idea.
     * 
     * @return department__c
     */
    public java.lang.String getDepartment__c() {
        return department__c;
    }


    /**
     * Sets the department__c value for this Idea.
     * 
     * @param department__c
     */
    public void setDepartment__c(java.lang.String department__c) {
        this.department__c = department__c;
    }


    /**
     * Gets the dominus_URL__c value for this Idea.
     * 
     * @return dominus_URL__c
     */
    public java.lang.String getDominus_URL__c() {
        return dominus_URL__c;
    }


    /**
     * Sets the dominus_URL__c value for this Idea.
     * 
     * @param dominus_URL__c
     */
    public void setDominus_URL__c(java.lang.String dominus_URL__c) {
        this.dominus_URL__c = dominus_URL__c;
    }


    /**
     * Gets the email_Contact__c value for this Idea.
     * 
     * @return email_Contact__c
     */
    public java.lang.String getEmail_Contact__c() {
        return email_Contact__c;
    }


    /**
     * Sets the email_Contact__c value for this Idea.
     * 
     * @param email_Contact__c
     */
    public void setEmail_Contact__c(java.lang.String email_Contact__c) {
        this.email_Contact__c = email_Contact__c;
    }


    /**
     * Gets the feature__c value for this Idea.
     * 
     * @return feature__c
     */
    public java.lang.String getFeature__c() {
        return feature__c;
    }


    /**
     * Sets the feature__c value for this Idea.
     * 
     * @param feature__c
     */
    public void setFeature__c(java.lang.String feature__c) {
        this.feature__c = feature__c;
    }


    /**
     * Gets the feature__r value for this Idea.
     * 
     * @return feature__r
     */
    public com.sforce.soap.enterprise.sobject.Feature__c getFeature__r() {
        return feature__r;
    }


    /**
     * Sets the feature__r value for this Idea.
     * 
     * @param feature__r
     */
    public void setFeature__r(com.sforce.soap.enterprise.sobject.Feature__c feature__r) {
        this.feature__r = feature__r;
    }


    /**
     * Gets the ideasInAction__c value for this Idea.
     * 
     * @return ideasInAction__c
     */
    public java.lang.String getIdeasInAction__c() {
        return ideasInAction__c;
    }


    /**
     * Sets the ideasInAction__c value for this Idea.
     * 
     * @param ideasInAction__c
     */
    public void setIdeasInAction__c(java.lang.String ideasInAction__c) {
        this.ideasInAction__c = ideasInAction__c;
    }


    /**
     * Gets the isDeleted value for this Idea.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Idea.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the isHtml value for this Idea.
     * 
     * @return isHtml
     */
    public java.lang.Boolean getIsHtml() {
        return isHtml;
    }


    /**
     * Sets the isHtml value for this Idea.
     * 
     * @param isHtml
     */
    public void setIsHtml(java.lang.Boolean isHtml) {
        this.isHtml = isHtml;
    }


    /**
     * Gets the isMerged value for this Idea.
     * 
     * @return isMerged
     */
    public java.lang.Boolean getIsMerged() {
        return isMerged;
    }


    /**
     * Sets the isMerged value for this Idea.
     * 
     * @param isMerged
     */
    public void setIsMerged(java.lang.Boolean isMerged) {
        this.isMerged = isMerged;
    }


    /**
     * Gets the lastComment value for this Idea.
     * 
     * @return lastComment
     */
    public com.sforce.soap.enterprise.sobject.IdeaComment getLastComment() {
        return lastComment;
    }


    /**
     * Sets the lastComment value for this Idea.
     * 
     * @param lastComment
     */
    public void setLastComment(com.sforce.soap.enterprise.sobject.IdeaComment lastComment) {
        this.lastComment = lastComment;
    }


    /**
     * Gets the lastCommentDate value for this Idea.
     * 
     * @return lastCommentDate
     */
    public java.util.Calendar getLastCommentDate() {
        return lastCommentDate;
    }


    /**
     * Sets the lastCommentDate value for this Idea.
     * 
     * @param lastCommentDate
     */
    public void setLastCommentDate(java.util.Calendar lastCommentDate) {
        this.lastCommentDate = lastCommentDate;
    }


    /**
     * Gets the lastCommentId value for this Idea.
     * 
     * @return lastCommentId
     */
    public java.lang.String getLastCommentId() {
        return lastCommentId;
    }


    /**
     * Sets the lastCommentId value for this Idea.
     * 
     * @param lastCommentId
     */
    public void setLastCommentId(java.lang.String lastCommentId) {
        this.lastCommentId = lastCommentId;
    }


    /**
     * Gets the lastModifiedBy value for this Idea.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Idea.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Idea.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Idea.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Idea.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Idea.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the numComments value for this Idea.
     * 
     * @return numComments
     */
    public java.lang.Integer getNumComments() {
        return numComments;
    }


    /**
     * Sets the numComments value for this Idea.
     * 
     * @param numComments
     */
    public void setNumComments(java.lang.Integer numComments) {
        this.numComments = numComments;
    }


    /**
     * Gets the parentIdea value for this Idea.
     * 
     * @return parentIdea
     */
    public com.sforce.soap.enterprise.sobject.Idea getParentIdea() {
        return parentIdea;
    }


    /**
     * Sets the parentIdea value for this Idea.
     * 
     * @param parentIdea
     */
    public void setParentIdea(com.sforce.soap.enterprise.sobject.Idea parentIdea) {
        this.parentIdea = parentIdea;
    }


    /**
     * Gets the parentIdeaId value for this Idea.
     * 
     * @return parentIdeaId
     */
    public java.lang.String getParentIdeaId() {
        return parentIdeaId;
    }


    /**
     * Sets the parentIdeaId value for this Idea.
     * 
     * @param parentIdeaId
     */
    public void setParentIdeaId(java.lang.String parentIdeaId) {
        this.parentIdeaId = parentIdeaId;
    }


    /**
     * Gets the processed_By_Daily_Digest__c value for this Idea.
     * 
     * @return processed_By_Daily_Digest__c
     */
    public java.lang.Boolean getProcessed_By_Daily_Digest__c() {
        return processed_By_Daily_Digest__c;
    }


    /**
     * Sets the processed_By_Daily_Digest__c value for this Idea.
     * 
     * @param processed_By_Daily_Digest__c
     */
    public void setProcessed_By_Daily_Digest__c(java.lang.Boolean processed_By_Daily_Digest__c) {
        this.processed_By_Daily_Digest__c = processed_By_Daily_Digest__c;
    }


    /**
     * Gets the processed_By_Weekly_Digest__c value for this Idea.
     * 
     * @return processed_By_Weekly_Digest__c
     */
    public java.lang.Boolean getProcessed_By_Weekly_Digest__c() {
        return processed_By_Weekly_Digest__c;
    }


    /**
     * Sets the processed_By_Weekly_Digest__c value for this Idea.
     * 
     * @param processed_By_Weekly_Digest__c
     */
    public void setProcessed_By_Weekly_Digest__c(java.lang.Boolean processed_By_Weekly_Digest__c) {
        this.processed_By_Weekly_Digest__c = processed_By_Weekly_Digest__c;
    }


    /**
     * Gets the profile__c value for this Idea.
     * 
     * @return profile__c
     */
    public java.lang.String getProfile__c() {
        return profile__c;
    }


    /**
     * Sets the profile__c value for this Idea.
     * 
     * @param profile__c
     */
    public void setProfile__c(java.lang.String profile__c) {
        this.profile__c = profile__c;
    }


    /**
     * Gets the project__c value for this Idea.
     * 
     * @return project__c
     */
    public java.lang.String getProject__c() {
        return project__c;
    }


    /**
     * Sets the project__c value for this Idea.
     * 
     * @param project__c
     */
    public void setProject__c(java.lang.String project__c) {
        this.project__c = project__c;
    }


    /**
     * Gets the project__r value for this Idea.
     * 
     * @return project__r
     */
    public com.sforce.soap.enterprise.sobject.Ideas_Projects__c getProject__r() {
        return project__r;
    }


    /**
     * Sets the project__r value for this Idea.
     * 
     * @param project__r
     */
    public void setProject__r(com.sforce.soap.enterprise.sobject.Ideas_Projects__c project__r) {
        this.project__r = project__r;
    }


    /**
     * Gets the r00N30000002SVCeEAO__r value for this Idea.
     * 
     * @return r00N30000002SVCeEAO__r
     */
    public com.sforce.soap.enterprise.QueryResult getR00N30000002SVCeEAO__r() {
        return r00N30000002SVCeEAO__r;
    }


    /**
     * Sets the r00N30000002SVCeEAO__r value for this Idea.
     * 
     * @param r00N30000002SVCeEAO__r
     */
    public void setR00N30000002SVCeEAO__r(com.sforce.soap.enterprise.QueryResult r00N30000002SVCeEAO__r) {
        this.r00N30000002SVCeEAO__r = r00N30000002SVCeEAO__r;
    }


    /**
     * Gets the recordType value for this Idea.
     * 
     * @return recordType
     */
    public com.sforce.soap.enterprise.sobject.RecordType getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this Idea.
     * 
     * @param recordType
     */
    public void setRecordType(com.sforce.soap.enterprise.sobject.RecordType recordType) {
        this.recordType = recordType;
    }


    /**
     * Gets the recordTypeId value for this Idea.
     * 
     * @return recordTypeId
     */
    public java.lang.String getRecordTypeId() {
        return recordTypeId;
    }


    /**
     * Sets the recordTypeId value for this Idea.
     * 
     * @param recordTypeId
     */
    public void setRecordTypeId(java.lang.String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }


    /**
     * Gets the related_Project__c value for this Idea.
     * 
     * @return related_Project__c
     */
    public java.lang.String getRelated_Project__c() {
        return related_Project__c;
    }


    /**
     * Sets the related_Project__c value for this Idea.
     * 
     * @param related_Project__c
     */
    public void setRelated_Project__c(java.lang.String related_Project__c) {
        this.related_Project__c = related_Project__c;
    }


    /**
     * Gets the related_Project__r value for this Idea.
     * 
     * @return related_Project__r
     */
    public com.sforce.soap.enterprise.sobject.KProject__c getRelated_Project__r() {
        return related_Project__r;
    }


    /**
     * Sets the related_Project__r value for this Idea.
     * 
     * @param related_Project__r
     */
    public void setRelated_Project__r(com.sforce.soap.enterprise.sobject.KProject__c related_Project__r) {
        this.related_Project__r = related_Project__r;
    }


    /**
     * Gets the score__c value for this Idea.
     * 
     * @return score__c
     */
    public java.lang.String getScore__c() {
        return score__c;
    }


    /**
     * Sets the score__c value for this Idea.
     * 
     * @param score__c
     */
    public void setScore__c(java.lang.String score__c) {
        this.score__c = score__c;
    }


    /**
     * Gets the status value for this Idea.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Idea.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the submitted_By__c value for this Idea.
     * 
     * @return submitted_By__c
     */
    public java.lang.String getSubmitted_By__c() {
        return submitted_By__c;
    }


    /**
     * Sets the submitted_By__c value for this Idea.
     * 
     * @param submitted_By__c
     */
    public void setSubmitted_By__c(java.lang.String submitted_By__c) {
        this.submitted_By__c = submitted_By__c;
    }


    /**
     * Gets the systemModstamp value for this Idea.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Idea.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the title value for this Idea.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Idea.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the user_Story_Idea__r value for this Idea.
     * 
     * @return user_Story_Idea__r
     */
    public com.sforce.soap.enterprise.QueryResult getUser_Story_Idea__r() {
        return user_Story_Idea__r;
    }


    /**
     * Sets the user_Story_Idea__r value for this Idea.
     * 
     * @param user_Story_Idea__r
     */
    public void setUser_Story_Idea__r(com.sforce.soap.enterprise.QueryResult user_Story_Idea__r) {
        this.user_Story_Idea__r = user_Story_Idea__r;
    }


    /**
     * Gets the voteScore value for this Idea.
     * 
     * @return voteScore
     */
    public java.lang.Double getVoteScore() {
        return voteScore;
    }


    /**
     * Sets the voteScore value for this Idea.
     * 
     * @param voteScore
     */
    public void setVoteScore(java.lang.Double voteScore) {
        this.voteScore = voteScore;
    }


    /**
     * Gets the voteTotal value for this Idea.
     * 
     * @return voteTotal
     */
    public java.lang.Double getVoteTotal() {
        return voteTotal;
    }


    /**
     * Sets the voteTotal value for this Idea.
     * 
     * @param voteTotal
     */
    public void setVoteTotal(java.lang.Double voteTotal) {
        this.voteTotal = voteTotal;
    }


    /**
     * Gets the votes value for this Idea.
     * 
     * @return votes
     */
    public com.sforce.soap.enterprise.QueryResult getVotes() {
        return votes;
    }


    /**
     * Sets the votes value for this Idea.
     * 
     * @param votes
     */
    public void setVotes(com.sforce.soap.enterprise.QueryResult votes) {
        this.votes = votes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Idea)) return false;
        Idea other = (Idea) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.age__c==null && other.getAge__c()==null) || 
             (this.age__c!=null &&
              this.age__c.equals(other.getAge__c()))) &&
            ((this.backlog_Status__c==null && other.getBacklog_Status__c()==null) || 
             (this.backlog_Status__c!=null &&
              this.backlog_Status__c.equals(other.getBacklog_Status__c()))) &&
            ((this.body==null && other.getBody()==null) || 
             (this.body!=null &&
              this.body.equals(other.getBody()))) &&
            ((this.categories==null && other.getCategories()==null) || 
             (this.categories!=null &&
              this.categories.equals(other.getCategories()))) &&
            ((this.category__c==null && other.getCategory__c()==null) || 
             (this.category__c!=null &&
              this.category__c.equals(other.getCategory__c()))) &&
            ((this.category__r==null && other.getCategory__r()==null) || 
             (this.category__r!=null &&
              this.category__r.equals(other.getCategory__r()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.community==null && other.getCommunity()==null) || 
             (this.community!=null &&
              this.community.equals(other.getCommunity()))) &&
            ((this.communityId==null && other.getCommunityId()==null) || 
             (this.communityId!=null &&
              this.communityId.equals(other.getCommunityId()))) &&
            ((this.company_Name__c==null && other.getCompany_Name__c()==null) || 
             (this.company_Name__c!=null &&
              this.company_Name__c.equals(other.getCompany_Name__c()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.department__c==null && other.getDepartment__c()==null) || 
             (this.department__c!=null &&
              this.department__c.equals(other.getDepartment__c()))) &&
            ((this.dominus_URL__c==null && other.getDominus_URL__c()==null) || 
             (this.dominus_URL__c!=null &&
              this.dominus_URL__c.equals(other.getDominus_URL__c()))) &&
            ((this.email_Contact__c==null && other.getEmail_Contact__c()==null) || 
             (this.email_Contact__c!=null &&
              this.email_Contact__c.equals(other.getEmail_Contact__c()))) &&
            ((this.feature__c==null && other.getFeature__c()==null) || 
             (this.feature__c!=null &&
              this.feature__c.equals(other.getFeature__c()))) &&
            ((this.feature__r==null && other.getFeature__r()==null) || 
             (this.feature__r!=null &&
              this.feature__r.equals(other.getFeature__r()))) &&
            ((this.ideasInAction__c==null && other.getIdeasInAction__c()==null) || 
             (this.ideasInAction__c!=null &&
              this.ideasInAction__c.equals(other.getIdeasInAction__c()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.isHtml==null && other.getIsHtml()==null) || 
             (this.isHtml!=null &&
              this.isHtml.equals(other.getIsHtml()))) &&
            ((this.isMerged==null && other.getIsMerged()==null) || 
             (this.isMerged!=null &&
              this.isMerged.equals(other.getIsMerged()))) &&
            ((this.lastComment==null && other.getLastComment()==null) || 
             (this.lastComment!=null &&
              this.lastComment.equals(other.getLastComment()))) &&
            ((this.lastCommentDate==null && other.getLastCommentDate()==null) || 
             (this.lastCommentDate!=null &&
              this.lastCommentDate.equals(other.getLastCommentDate()))) &&
            ((this.lastCommentId==null && other.getLastCommentId()==null) || 
             (this.lastCommentId!=null &&
              this.lastCommentId.equals(other.getLastCommentId()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.numComments==null && other.getNumComments()==null) || 
             (this.numComments!=null &&
              this.numComments.equals(other.getNumComments()))) &&
            ((this.parentIdea==null && other.getParentIdea()==null) || 
             (this.parentIdea!=null &&
              this.parentIdea.equals(other.getParentIdea()))) &&
            ((this.parentIdeaId==null && other.getParentIdeaId()==null) || 
             (this.parentIdeaId!=null &&
              this.parentIdeaId.equals(other.getParentIdeaId()))) &&
            ((this.processed_By_Daily_Digest__c==null && other.getProcessed_By_Daily_Digest__c()==null) || 
             (this.processed_By_Daily_Digest__c!=null &&
              this.processed_By_Daily_Digest__c.equals(other.getProcessed_By_Daily_Digest__c()))) &&
            ((this.processed_By_Weekly_Digest__c==null && other.getProcessed_By_Weekly_Digest__c()==null) || 
             (this.processed_By_Weekly_Digest__c!=null &&
              this.processed_By_Weekly_Digest__c.equals(other.getProcessed_By_Weekly_Digest__c()))) &&
            ((this.profile__c==null && other.getProfile__c()==null) || 
             (this.profile__c!=null &&
              this.profile__c.equals(other.getProfile__c()))) &&
            ((this.project__c==null && other.getProject__c()==null) || 
             (this.project__c!=null &&
              this.project__c.equals(other.getProject__c()))) &&
            ((this.project__r==null && other.getProject__r()==null) || 
             (this.project__r!=null &&
              this.project__r.equals(other.getProject__r()))) &&
            ((this.r00N30000002SVCeEAO__r==null && other.getR00N30000002SVCeEAO__r()==null) || 
             (this.r00N30000002SVCeEAO__r!=null &&
              this.r00N30000002SVCeEAO__r.equals(other.getR00N30000002SVCeEAO__r()))) &&
            ((this.recordType==null && other.getRecordType()==null) || 
             (this.recordType!=null &&
              this.recordType.equals(other.getRecordType()))) &&
            ((this.recordTypeId==null && other.getRecordTypeId()==null) || 
             (this.recordTypeId!=null &&
              this.recordTypeId.equals(other.getRecordTypeId()))) &&
            ((this.related_Project__c==null && other.getRelated_Project__c()==null) || 
             (this.related_Project__c!=null &&
              this.related_Project__c.equals(other.getRelated_Project__c()))) &&
            ((this.related_Project__r==null && other.getRelated_Project__r()==null) || 
             (this.related_Project__r!=null &&
              this.related_Project__r.equals(other.getRelated_Project__r()))) &&
            ((this.score__c==null && other.getScore__c()==null) || 
             (this.score__c!=null &&
              this.score__c.equals(other.getScore__c()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.submitted_By__c==null && other.getSubmitted_By__c()==null) || 
             (this.submitted_By__c!=null &&
              this.submitted_By__c.equals(other.getSubmitted_By__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.user_Story_Idea__r==null && other.getUser_Story_Idea__r()==null) || 
             (this.user_Story_Idea__r!=null &&
              this.user_Story_Idea__r.equals(other.getUser_Story_Idea__r()))) &&
            ((this.voteScore==null && other.getVoteScore()==null) || 
             (this.voteScore!=null &&
              this.voteScore.equals(other.getVoteScore()))) &&
            ((this.voteTotal==null && other.getVoteTotal()==null) || 
             (this.voteTotal!=null &&
              this.voteTotal.equals(other.getVoteTotal()))) &&
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
        if (getAge__c() != null) {
            _hashCode += getAge__c().hashCode();
        }
        if (getBacklog_Status__c() != null) {
            _hashCode += getBacklog_Status__c().hashCode();
        }
        if (getBody() != null) {
            _hashCode += getBody().hashCode();
        }
        if (getCategories() != null) {
            _hashCode += getCategories().hashCode();
        }
        if (getCategory__c() != null) {
            _hashCode += getCategory__c().hashCode();
        }
        if (getCategory__r() != null) {
            _hashCode += getCategory__r().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getCommunity() != null) {
            _hashCode += getCommunity().hashCode();
        }
        if (getCommunityId() != null) {
            _hashCode += getCommunityId().hashCode();
        }
        if (getCompany_Name__c() != null) {
            _hashCode += getCompany_Name__c().hashCode();
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
        if (getDepartment__c() != null) {
            _hashCode += getDepartment__c().hashCode();
        }
        if (getDominus_URL__c() != null) {
            _hashCode += getDominus_URL__c().hashCode();
        }
        if (getEmail_Contact__c() != null) {
            _hashCode += getEmail_Contact__c().hashCode();
        }
        if (getFeature__c() != null) {
            _hashCode += getFeature__c().hashCode();
        }
        if (getFeature__r() != null) {
            _hashCode += getFeature__r().hashCode();
        }
        if (getIdeasInAction__c() != null) {
            _hashCode += getIdeasInAction__c().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getIsHtml() != null) {
            _hashCode += getIsHtml().hashCode();
        }
        if (getIsMerged() != null) {
            _hashCode += getIsMerged().hashCode();
        }
        if (getLastComment() != null) {
            _hashCode += getLastComment().hashCode();
        }
        if (getLastCommentDate() != null) {
            _hashCode += getLastCommentDate().hashCode();
        }
        if (getLastCommentId() != null) {
            _hashCode += getLastCommentId().hashCode();
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
        if (getNumComments() != null) {
            _hashCode += getNumComments().hashCode();
        }
        if (getParentIdea() != null) {
            _hashCode += getParentIdea().hashCode();
        }
        if (getParentIdeaId() != null) {
            _hashCode += getParentIdeaId().hashCode();
        }
        if (getProcessed_By_Daily_Digest__c() != null) {
            _hashCode += getProcessed_By_Daily_Digest__c().hashCode();
        }
        if (getProcessed_By_Weekly_Digest__c() != null) {
            _hashCode += getProcessed_By_Weekly_Digest__c().hashCode();
        }
        if (getProfile__c() != null) {
            _hashCode += getProfile__c().hashCode();
        }
        if (getProject__c() != null) {
            _hashCode += getProject__c().hashCode();
        }
        if (getProject__r() != null) {
            _hashCode += getProject__r().hashCode();
        }
        if (getR00N30000002SVCeEAO__r() != null) {
            _hashCode += getR00N30000002SVCeEAO__r().hashCode();
        }
        if (getRecordType() != null) {
            _hashCode += getRecordType().hashCode();
        }
        if (getRecordTypeId() != null) {
            _hashCode += getRecordTypeId().hashCode();
        }
        if (getRelated_Project__c() != null) {
            _hashCode += getRelated_Project__c().hashCode();
        }
        if (getRelated_Project__r() != null) {
            _hashCode += getRelated_Project__r().hashCode();
        }
        if (getScore__c() != null) {
            _hashCode += getScore__c().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSubmitted_By__c() != null) {
            _hashCode += getSubmitted_By__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getUser_Story_Idea__r() != null) {
            _hashCode += getUser_Story_Idea__r().hashCode();
        }
        if (getVoteScore() != null) {
            _hashCode += getVoteScore().hashCode();
        }
        if (getVoteTotal() != null) {
            _hashCode += getVoteTotal().hashCode();
        }
        if (getVotes() != null) {
            _hashCode += getVotes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Idea.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Idea"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("age__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Age__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backlog_Status__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Backlog_Status__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("body");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Body"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Categories"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Category__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Category__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Category__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("community");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Community"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Community"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communityId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CommunityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Company_Name__c"));
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
        elemField.setFieldName("department__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Department__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dominus_URL__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dominus_URL__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Email_Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feature__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Feature__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feature__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Feature__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Feature__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ideasInAction__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IdeasInAction__c"));
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
        elemField.setFieldName("isHtml");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsHtml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isMerged");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsMerged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastComment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IdeaComment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastCommentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastCommentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastCommentId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastCommentId"));
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
        elemField.setFieldName("numComments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NumComments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentIdea");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ParentIdea"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Idea"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentIdeaId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ParentIdeaId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processed_By_Daily_Digest__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Processed_By_Daily_Digest__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processed_By_Weekly_Digest__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Processed_By_Weekly_Digest__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profile__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Profile__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("project__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Project__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Ideas_Projects__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("r00N30000002SVCeEAO__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "R00N30000002SVCeEAO__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecordType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecordType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecordTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("related_Project__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Related_Project__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("related_Project__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Related_Project__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "kProject__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Score__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitted_By__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Submitted_By__c"));
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
        elemField.setFieldName("user_Story_Idea__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User_Story_Idea__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voteTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "VoteTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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

/**
 * User_Conference_Survey_Result__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class User_Conference_Survey_Result__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String certification_Sessions__c;

    private java.lang.String conference_Subjects__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.lang.Double format_Hands_On_Count__c;

    private java.lang.Double format_One_on_One_Count__c;

    private java.lang.Double format_Panel_Count__c;

    private java.lang.Double format_RCA_Count__c;

    private java.lang.Double format_RC_Sales_Count__c;

    private java.lang.Double format_Roundtable_Count__c;

    private java.lang.Boolean isDeleted;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private java.lang.String other_Session_Format__c;

    private java.lang.String other_Subject__c;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.String session_Format__c;

    private java.lang.Double sessions_During_no_overlap_Count__c;

    private java.lang.Double sessions_During_w_Overlap_Count__c;

    private java.lang.Double sessions_Sunday_Count__c;

    private java.lang.Double sessions_Tuesday_after_Count__c;

    private java.lang.Double subjects_Analytics_Count__c;

    private java.lang.Double subjects_Benefits_of_Relativity_Count__c;

    private java.lang.Double subjects_Infrastructure_Count__c;

    private java.lang.Double subjects_Legal_Hold_Count__c;

    private java.lang.Double subjects_Other_Count__c;

    private java.lang.Double subjects_RDO_Count__c;

    private java.lang.Double subjects_Relativity_Experiences_Count__c;

    private java.lang.Double subjects_Reporting_Count__c;

    private java.lang.Double subjects_Roadmap_Count__c;

    private java.lang.Double subjects_Workflow_Management_Count__c;

    private java.util.Calendar systemModstamp;

    private java.lang.String user_Conference__c;

    private com.sforce.soap.enterprise.sobject.User_Conference__c user_Conference__r;

    public User_Conference_Survey_Result__c() {
    }

    public User_Conference_Survey_Result__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String certification_Sessions__c,
           java.lang.String conference_Subjects__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.lang.Double format_Hands_On_Count__c,
           java.lang.Double format_One_on_One_Count__c,
           java.lang.Double format_Panel_Count__c,
           java.lang.Double format_RCA_Count__c,
           java.lang.Double format_RC_Sales_Count__c,
           java.lang.Double format_Roundtable_Count__c,
           java.lang.Boolean isDeleted,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           java.lang.String other_Session_Format__c,
           java.lang.String other_Subject__c,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.String session_Format__c,
           java.lang.Double sessions_During_no_overlap_Count__c,
           java.lang.Double sessions_During_w_Overlap_Count__c,
           java.lang.Double sessions_Sunday_Count__c,
           java.lang.Double sessions_Tuesday_after_Count__c,
           java.lang.Double subjects_Analytics_Count__c,
           java.lang.Double subjects_Benefits_of_Relativity_Count__c,
           java.lang.Double subjects_Infrastructure_Count__c,
           java.lang.Double subjects_Legal_Hold_Count__c,
           java.lang.Double subjects_Other_Count__c,
           java.lang.Double subjects_RDO_Count__c,
           java.lang.Double subjects_Relativity_Experiences_Count__c,
           java.lang.Double subjects_Reporting_Count__c,
           java.lang.Double subjects_Roadmap_Count__c,
           java.lang.Double subjects_Workflow_Management_Count__c,
           java.util.Calendar systemModstamp,
           java.lang.String user_Conference__c,
           com.sforce.soap.enterprise.sobject.User_Conference__c user_Conference__r) {
        super(
            fieldsToNull,
            id);
        this.attachments = attachments;
        this.certification_Sessions__c = certification_Sessions__c;
        this.conference_Subjects__c = conference_Subjects__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.format_Hands_On_Count__c = format_Hands_On_Count__c;
        this.format_One_on_One_Count__c = format_One_on_One_Count__c;
        this.format_Panel_Count__c = format_Panel_Count__c;
        this.format_RCA_Count__c = format_RCA_Count__c;
        this.format_RC_Sales_Count__c = format_RC_Sales_Count__c;
        this.format_Roundtable_Count__c = format_Roundtable_Count__c;
        this.isDeleted = isDeleted;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.other_Session_Format__c = other_Session_Format__c;
        this.other_Subject__c = other_Subject__c;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.session_Format__c = session_Format__c;
        this.sessions_During_no_overlap_Count__c = sessions_During_no_overlap_Count__c;
        this.sessions_During_w_Overlap_Count__c = sessions_During_w_Overlap_Count__c;
        this.sessions_Sunday_Count__c = sessions_Sunday_Count__c;
        this.sessions_Tuesday_after_Count__c = sessions_Tuesday_after_Count__c;
        this.subjects_Analytics_Count__c = subjects_Analytics_Count__c;
        this.subjects_Benefits_of_Relativity_Count__c = subjects_Benefits_of_Relativity_Count__c;
        this.subjects_Infrastructure_Count__c = subjects_Infrastructure_Count__c;
        this.subjects_Legal_Hold_Count__c = subjects_Legal_Hold_Count__c;
        this.subjects_Other_Count__c = subjects_Other_Count__c;
        this.subjects_RDO_Count__c = subjects_RDO_Count__c;
        this.subjects_Relativity_Experiences_Count__c = subjects_Relativity_Experiences_Count__c;
        this.subjects_Reporting_Count__c = subjects_Reporting_Count__c;
        this.subjects_Roadmap_Count__c = subjects_Roadmap_Count__c;
        this.subjects_Workflow_Management_Count__c = subjects_Workflow_Management_Count__c;
        this.systemModstamp = systemModstamp;
        this.user_Conference__c = user_Conference__c;
        this.user_Conference__r = user_Conference__r;
    }


    /**
     * Gets the attachments value for this User_Conference_Survey_Result__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this User_Conference_Survey_Result__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the certification_Sessions__c value for this User_Conference_Survey_Result__c.
     * 
     * @return certification_Sessions__c
     */
    public java.lang.String getCertification_Sessions__c() {
        return certification_Sessions__c;
    }


    /**
     * Sets the certification_Sessions__c value for this User_Conference_Survey_Result__c.
     * 
     * @param certification_Sessions__c
     */
    public void setCertification_Sessions__c(java.lang.String certification_Sessions__c) {
        this.certification_Sessions__c = certification_Sessions__c;
    }


    /**
     * Gets the conference_Subjects__c value for this User_Conference_Survey_Result__c.
     * 
     * @return conference_Subjects__c
     */
    public java.lang.String getConference_Subjects__c() {
        return conference_Subjects__c;
    }


    /**
     * Sets the conference_Subjects__c value for this User_Conference_Survey_Result__c.
     * 
     * @param conference_Subjects__c
     */
    public void setConference_Subjects__c(java.lang.String conference_Subjects__c) {
        this.conference_Subjects__c = conference_Subjects__c;
    }


    /**
     * Gets the createdBy value for this User_Conference_Survey_Result__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this User_Conference_Survey_Result__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this User_Conference_Survey_Result__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this User_Conference_Survey_Result__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this User_Conference_Survey_Result__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this User_Conference_Survey_Result__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this User_Conference_Survey_Result__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this User_Conference_Survey_Result__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the format_Hands_On_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @return format_Hands_On_Count__c
     */
    public java.lang.Double getFormat_Hands_On_Count__c() {
        return format_Hands_On_Count__c;
    }


    /**
     * Sets the format_Hands_On_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @param format_Hands_On_Count__c
     */
    public void setFormat_Hands_On_Count__c(java.lang.Double format_Hands_On_Count__c) {
        this.format_Hands_On_Count__c = format_Hands_On_Count__c;
    }


    /**
     * Gets the format_One_on_One_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @return format_One_on_One_Count__c
     */
    public java.lang.Double getFormat_One_on_One_Count__c() {
        return format_One_on_One_Count__c;
    }


    /**
     * Sets the format_One_on_One_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @param format_One_on_One_Count__c
     */
    public void setFormat_One_on_One_Count__c(java.lang.Double format_One_on_One_Count__c) {
        this.format_One_on_One_Count__c = format_One_on_One_Count__c;
    }


    /**
     * Gets the format_Panel_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @return format_Panel_Count__c
     */
    public java.lang.Double getFormat_Panel_Count__c() {
        return format_Panel_Count__c;
    }


    /**
     * Sets the format_Panel_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @param format_Panel_Count__c
     */
    public void setFormat_Panel_Count__c(java.lang.Double format_Panel_Count__c) {
        this.format_Panel_Count__c = format_Panel_Count__c;
    }


    /**
     * Gets the format_RCA_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @return format_RCA_Count__c
     */
    public java.lang.Double getFormat_RCA_Count__c() {
        return format_RCA_Count__c;
    }


    /**
     * Sets the format_RCA_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @param format_RCA_Count__c
     */
    public void setFormat_RCA_Count__c(java.lang.Double format_RCA_Count__c) {
        this.format_RCA_Count__c = format_RCA_Count__c;
    }


    /**
     * Gets the format_RC_Sales_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @return format_RC_Sales_Count__c
     */
    public java.lang.Double getFormat_RC_Sales_Count__c() {
        return format_RC_Sales_Count__c;
    }


    /**
     * Sets the format_RC_Sales_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @param format_RC_Sales_Count__c
     */
    public void setFormat_RC_Sales_Count__c(java.lang.Double format_RC_Sales_Count__c) {
        this.format_RC_Sales_Count__c = format_RC_Sales_Count__c;
    }


    /**
     * Gets the format_Roundtable_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @return format_Roundtable_Count__c
     */
    public java.lang.Double getFormat_Roundtable_Count__c() {
        return format_Roundtable_Count__c;
    }


    /**
     * Sets the format_Roundtable_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @param format_Roundtable_Count__c
     */
    public void setFormat_Roundtable_Count__c(java.lang.Double format_Roundtable_Count__c) {
        this.format_Roundtable_Count__c = format_Roundtable_Count__c;
    }


    /**
     * Gets the isDeleted value for this User_Conference_Survey_Result__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this User_Conference_Survey_Result__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this User_Conference_Survey_Result__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this User_Conference_Survey_Result__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this User_Conference_Survey_Result__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this User_Conference_Survey_Result__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this User_Conference_Survey_Result__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this User_Conference_Survey_Result__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this User_Conference_Survey_Result__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this User_Conference_Survey_Result__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this User_Conference_Survey_Result__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this User_Conference_Survey_Result__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this User_Conference_Survey_Result__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this User_Conference_Survey_Result__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the other_Session_Format__c value for this User_Conference_Survey_Result__c.
     * 
     * @return other_Session_Format__c
     */
    public java.lang.String getOther_Session_Format__c() {
        return other_Session_Format__c;
    }


    /**
     * Sets the other_Session_Format__c value for this User_Conference_Survey_Result__c.
     * 
     * @param other_Session_Format__c
     */
    public void setOther_Session_Format__c(java.lang.String other_Session_Format__c) {
        this.other_Session_Format__c = other_Session_Format__c;
    }


    /**
     * Gets the other_Subject__c value for this User_Conference_Survey_Result__c.
     * 
     * @return other_Subject__c
     */
    public java.lang.String getOther_Subject__c() {
        return other_Subject__c;
    }


    /**
     * Sets the other_Subject__c value for this User_Conference_Survey_Result__c.
     * 
     * @param other_Subject__c
     */
    public void setOther_Subject__c(java.lang.String other_Subject__c) {
        this.other_Subject__c = other_Subject__c;
    }


    /**
     * Gets the processInstances value for this User_Conference_Survey_Result__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this User_Conference_Survey_Result__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this User_Conference_Survey_Result__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this User_Conference_Survey_Result__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the session_Format__c value for this User_Conference_Survey_Result__c.
     * 
     * @return session_Format__c
     */
    public java.lang.String getSession_Format__c() {
        return session_Format__c;
    }


    /**
     * Sets the session_Format__c value for this User_Conference_Survey_Result__c.
     * 
     * @param session_Format__c
     */
    public void setSession_Format__c(java.lang.String session_Format__c) {
        this.session_Format__c = session_Format__c;
    }


    /**
     * Gets the sessions_During_no_overlap_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @return sessions_During_no_overlap_Count__c
     */
    public java.lang.Double getSessions_During_no_overlap_Count__c() {
        return sessions_During_no_overlap_Count__c;
    }


    /**
     * Sets the sessions_During_no_overlap_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @param sessions_During_no_overlap_Count__c
     */
    public void setSessions_During_no_overlap_Count__c(java.lang.Double sessions_During_no_overlap_Count__c) {
        this.sessions_During_no_overlap_Count__c = sessions_During_no_overlap_Count__c;
    }


    /**
     * Gets the sessions_During_w_Overlap_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @return sessions_During_w_Overlap_Count__c
     */
    public java.lang.Double getSessions_During_w_Overlap_Count__c() {
        return sessions_During_w_Overlap_Count__c;
    }


    /**
     * Sets the sessions_During_w_Overlap_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @param sessions_During_w_Overlap_Count__c
     */
    public void setSessions_During_w_Overlap_Count__c(java.lang.Double sessions_During_w_Overlap_Count__c) {
        this.sessions_During_w_Overlap_Count__c = sessions_During_w_Overlap_Count__c;
    }


    /**
     * Gets the sessions_Sunday_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @return sessions_Sunday_Count__c
     */
    public java.lang.Double getSessions_Sunday_Count__c() {
        return sessions_Sunday_Count__c;
    }


    /**
     * Sets the sessions_Sunday_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @param sessions_Sunday_Count__c
     */
    public void setSessions_Sunday_Count__c(java.lang.Double sessions_Sunday_Count__c) {
        this.sessions_Sunday_Count__c = sessions_Sunday_Count__c;
    }


    /**
     * Gets the sessions_Tuesday_after_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @return sessions_Tuesday_after_Count__c
     */
    public java.lang.Double getSessions_Tuesday_after_Count__c() {
        return sessions_Tuesday_after_Count__c;
    }


    /**
     * Sets the sessions_Tuesday_after_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @param sessions_Tuesday_after_Count__c
     */
    public void setSessions_Tuesday_after_Count__c(java.lang.Double sessions_Tuesday_after_Count__c) {
        this.sessions_Tuesday_after_Count__c = sessions_Tuesday_after_Count__c;
    }


    /**
     * Gets the subjects_Analytics_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @return subjects_Analytics_Count__c
     */
    public java.lang.Double getSubjects_Analytics_Count__c() {
        return subjects_Analytics_Count__c;
    }


    /**
     * Sets the subjects_Analytics_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @param subjects_Analytics_Count__c
     */
    public void setSubjects_Analytics_Count__c(java.lang.Double subjects_Analytics_Count__c) {
        this.subjects_Analytics_Count__c = subjects_Analytics_Count__c;
    }


    /**
     * Gets the subjects_Benefits_of_Relativity_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @return subjects_Benefits_of_Relativity_Count__c
     */
    public java.lang.Double getSubjects_Benefits_of_Relativity_Count__c() {
        return subjects_Benefits_of_Relativity_Count__c;
    }


    /**
     * Sets the subjects_Benefits_of_Relativity_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @param subjects_Benefits_of_Relativity_Count__c
     */
    public void setSubjects_Benefits_of_Relativity_Count__c(java.lang.Double subjects_Benefits_of_Relativity_Count__c) {
        this.subjects_Benefits_of_Relativity_Count__c = subjects_Benefits_of_Relativity_Count__c;
    }


    /**
     * Gets the subjects_Infrastructure_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @return subjects_Infrastructure_Count__c
     */
    public java.lang.Double getSubjects_Infrastructure_Count__c() {
        return subjects_Infrastructure_Count__c;
    }


    /**
     * Sets the subjects_Infrastructure_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @param subjects_Infrastructure_Count__c
     */
    public void setSubjects_Infrastructure_Count__c(java.lang.Double subjects_Infrastructure_Count__c) {
        this.subjects_Infrastructure_Count__c = subjects_Infrastructure_Count__c;
    }


    /**
     * Gets the subjects_Legal_Hold_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @return subjects_Legal_Hold_Count__c
     */
    public java.lang.Double getSubjects_Legal_Hold_Count__c() {
        return subjects_Legal_Hold_Count__c;
    }


    /**
     * Sets the subjects_Legal_Hold_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @param subjects_Legal_Hold_Count__c
     */
    public void setSubjects_Legal_Hold_Count__c(java.lang.Double subjects_Legal_Hold_Count__c) {
        this.subjects_Legal_Hold_Count__c = subjects_Legal_Hold_Count__c;
    }


    /**
     * Gets the subjects_Other_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @return subjects_Other_Count__c
     */
    public java.lang.Double getSubjects_Other_Count__c() {
        return subjects_Other_Count__c;
    }


    /**
     * Sets the subjects_Other_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @param subjects_Other_Count__c
     */
    public void setSubjects_Other_Count__c(java.lang.Double subjects_Other_Count__c) {
        this.subjects_Other_Count__c = subjects_Other_Count__c;
    }


    /**
     * Gets the subjects_RDO_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @return subjects_RDO_Count__c
     */
    public java.lang.Double getSubjects_RDO_Count__c() {
        return subjects_RDO_Count__c;
    }


    /**
     * Sets the subjects_RDO_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @param subjects_RDO_Count__c
     */
    public void setSubjects_RDO_Count__c(java.lang.Double subjects_RDO_Count__c) {
        this.subjects_RDO_Count__c = subjects_RDO_Count__c;
    }


    /**
     * Gets the subjects_Relativity_Experiences_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @return subjects_Relativity_Experiences_Count__c
     */
    public java.lang.Double getSubjects_Relativity_Experiences_Count__c() {
        return subjects_Relativity_Experiences_Count__c;
    }


    /**
     * Sets the subjects_Relativity_Experiences_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @param subjects_Relativity_Experiences_Count__c
     */
    public void setSubjects_Relativity_Experiences_Count__c(java.lang.Double subjects_Relativity_Experiences_Count__c) {
        this.subjects_Relativity_Experiences_Count__c = subjects_Relativity_Experiences_Count__c;
    }


    /**
     * Gets the subjects_Reporting_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @return subjects_Reporting_Count__c
     */
    public java.lang.Double getSubjects_Reporting_Count__c() {
        return subjects_Reporting_Count__c;
    }


    /**
     * Sets the subjects_Reporting_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @param subjects_Reporting_Count__c
     */
    public void setSubjects_Reporting_Count__c(java.lang.Double subjects_Reporting_Count__c) {
        this.subjects_Reporting_Count__c = subjects_Reporting_Count__c;
    }


    /**
     * Gets the subjects_Roadmap_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @return subjects_Roadmap_Count__c
     */
    public java.lang.Double getSubjects_Roadmap_Count__c() {
        return subjects_Roadmap_Count__c;
    }


    /**
     * Sets the subjects_Roadmap_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @param subjects_Roadmap_Count__c
     */
    public void setSubjects_Roadmap_Count__c(java.lang.Double subjects_Roadmap_Count__c) {
        this.subjects_Roadmap_Count__c = subjects_Roadmap_Count__c;
    }


    /**
     * Gets the subjects_Workflow_Management_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @return subjects_Workflow_Management_Count__c
     */
    public java.lang.Double getSubjects_Workflow_Management_Count__c() {
        return subjects_Workflow_Management_Count__c;
    }


    /**
     * Sets the subjects_Workflow_Management_Count__c value for this User_Conference_Survey_Result__c.
     * 
     * @param subjects_Workflow_Management_Count__c
     */
    public void setSubjects_Workflow_Management_Count__c(java.lang.Double subjects_Workflow_Management_Count__c) {
        this.subjects_Workflow_Management_Count__c = subjects_Workflow_Management_Count__c;
    }


    /**
     * Gets the systemModstamp value for this User_Conference_Survey_Result__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this User_Conference_Survey_Result__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the user_Conference__c value for this User_Conference_Survey_Result__c.
     * 
     * @return user_Conference__c
     */
    public java.lang.String getUser_Conference__c() {
        return user_Conference__c;
    }


    /**
     * Sets the user_Conference__c value for this User_Conference_Survey_Result__c.
     * 
     * @param user_Conference__c
     */
    public void setUser_Conference__c(java.lang.String user_Conference__c) {
        this.user_Conference__c = user_Conference__c;
    }


    /**
     * Gets the user_Conference__r value for this User_Conference_Survey_Result__c.
     * 
     * @return user_Conference__r
     */
    public com.sforce.soap.enterprise.sobject.User_Conference__c getUser_Conference__r() {
        return user_Conference__r;
    }


    /**
     * Sets the user_Conference__r value for this User_Conference_Survey_Result__c.
     * 
     * @param user_Conference__r
     */
    public void setUser_Conference__r(com.sforce.soap.enterprise.sobject.User_Conference__c user_Conference__r) {
        this.user_Conference__r = user_Conference__r;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof User_Conference_Survey_Result__c)) return false;
        User_Conference_Survey_Result__c other = (User_Conference_Survey_Result__c) obj;
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
            ((this.certification_Sessions__c==null && other.getCertification_Sessions__c()==null) || 
             (this.certification_Sessions__c!=null &&
              this.certification_Sessions__c.equals(other.getCertification_Sessions__c()))) &&
            ((this.conference_Subjects__c==null && other.getConference_Subjects__c()==null) || 
             (this.conference_Subjects__c!=null &&
              this.conference_Subjects__c.equals(other.getConference_Subjects__c()))) &&
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
            ((this.format_Hands_On_Count__c==null && other.getFormat_Hands_On_Count__c()==null) || 
             (this.format_Hands_On_Count__c!=null &&
              this.format_Hands_On_Count__c.equals(other.getFormat_Hands_On_Count__c()))) &&
            ((this.format_One_on_One_Count__c==null && other.getFormat_One_on_One_Count__c()==null) || 
             (this.format_One_on_One_Count__c!=null &&
              this.format_One_on_One_Count__c.equals(other.getFormat_One_on_One_Count__c()))) &&
            ((this.format_Panel_Count__c==null && other.getFormat_Panel_Count__c()==null) || 
             (this.format_Panel_Count__c!=null &&
              this.format_Panel_Count__c.equals(other.getFormat_Panel_Count__c()))) &&
            ((this.format_RCA_Count__c==null && other.getFormat_RCA_Count__c()==null) || 
             (this.format_RCA_Count__c!=null &&
              this.format_RCA_Count__c.equals(other.getFormat_RCA_Count__c()))) &&
            ((this.format_RC_Sales_Count__c==null && other.getFormat_RC_Sales_Count__c()==null) || 
             (this.format_RC_Sales_Count__c!=null &&
              this.format_RC_Sales_Count__c.equals(other.getFormat_RC_Sales_Count__c()))) &&
            ((this.format_Roundtable_Count__c==null && other.getFormat_Roundtable_Count__c()==null) || 
             (this.format_Roundtable_Count__c!=null &&
              this.format_Roundtable_Count__c.equals(other.getFormat_Roundtable_Count__c()))) &&
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
            ((this.other_Session_Format__c==null && other.getOther_Session_Format__c()==null) || 
             (this.other_Session_Format__c!=null &&
              this.other_Session_Format__c.equals(other.getOther_Session_Format__c()))) &&
            ((this.other_Subject__c==null && other.getOther_Subject__c()==null) || 
             (this.other_Subject__c!=null &&
              this.other_Subject__c.equals(other.getOther_Subject__c()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.session_Format__c==null && other.getSession_Format__c()==null) || 
             (this.session_Format__c!=null &&
              this.session_Format__c.equals(other.getSession_Format__c()))) &&
            ((this.sessions_During_no_overlap_Count__c==null && other.getSessions_During_no_overlap_Count__c()==null) || 
             (this.sessions_During_no_overlap_Count__c!=null &&
              this.sessions_During_no_overlap_Count__c.equals(other.getSessions_During_no_overlap_Count__c()))) &&
            ((this.sessions_During_w_Overlap_Count__c==null && other.getSessions_During_w_Overlap_Count__c()==null) || 
             (this.sessions_During_w_Overlap_Count__c!=null &&
              this.sessions_During_w_Overlap_Count__c.equals(other.getSessions_During_w_Overlap_Count__c()))) &&
            ((this.sessions_Sunday_Count__c==null && other.getSessions_Sunday_Count__c()==null) || 
             (this.sessions_Sunday_Count__c!=null &&
              this.sessions_Sunday_Count__c.equals(other.getSessions_Sunday_Count__c()))) &&
            ((this.sessions_Tuesday_after_Count__c==null && other.getSessions_Tuesday_after_Count__c()==null) || 
             (this.sessions_Tuesday_after_Count__c!=null &&
              this.sessions_Tuesday_after_Count__c.equals(other.getSessions_Tuesday_after_Count__c()))) &&
            ((this.subjects_Analytics_Count__c==null && other.getSubjects_Analytics_Count__c()==null) || 
             (this.subjects_Analytics_Count__c!=null &&
              this.subjects_Analytics_Count__c.equals(other.getSubjects_Analytics_Count__c()))) &&
            ((this.subjects_Benefits_of_Relativity_Count__c==null && other.getSubjects_Benefits_of_Relativity_Count__c()==null) || 
             (this.subjects_Benefits_of_Relativity_Count__c!=null &&
              this.subjects_Benefits_of_Relativity_Count__c.equals(other.getSubjects_Benefits_of_Relativity_Count__c()))) &&
            ((this.subjects_Infrastructure_Count__c==null && other.getSubjects_Infrastructure_Count__c()==null) || 
             (this.subjects_Infrastructure_Count__c!=null &&
              this.subjects_Infrastructure_Count__c.equals(other.getSubjects_Infrastructure_Count__c()))) &&
            ((this.subjects_Legal_Hold_Count__c==null && other.getSubjects_Legal_Hold_Count__c()==null) || 
             (this.subjects_Legal_Hold_Count__c!=null &&
              this.subjects_Legal_Hold_Count__c.equals(other.getSubjects_Legal_Hold_Count__c()))) &&
            ((this.subjects_Other_Count__c==null && other.getSubjects_Other_Count__c()==null) || 
             (this.subjects_Other_Count__c!=null &&
              this.subjects_Other_Count__c.equals(other.getSubjects_Other_Count__c()))) &&
            ((this.subjects_RDO_Count__c==null && other.getSubjects_RDO_Count__c()==null) || 
             (this.subjects_RDO_Count__c!=null &&
              this.subjects_RDO_Count__c.equals(other.getSubjects_RDO_Count__c()))) &&
            ((this.subjects_Relativity_Experiences_Count__c==null && other.getSubjects_Relativity_Experiences_Count__c()==null) || 
             (this.subjects_Relativity_Experiences_Count__c!=null &&
              this.subjects_Relativity_Experiences_Count__c.equals(other.getSubjects_Relativity_Experiences_Count__c()))) &&
            ((this.subjects_Reporting_Count__c==null && other.getSubjects_Reporting_Count__c()==null) || 
             (this.subjects_Reporting_Count__c!=null &&
              this.subjects_Reporting_Count__c.equals(other.getSubjects_Reporting_Count__c()))) &&
            ((this.subjects_Roadmap_Count__c==null && other.getSubjects_Roadmap_Count__c()==null) || 
             (this.subjects_Roadmap_Count__c!=null &&
              this.subjects_Roadmap_Count__c.equals(other.getSubjects_Roadmap_Count__c()))) &&
            ((this.subjects_Workflow_Management_Count__c==null && other.getSubjects_Workflow_Management_Count__c()==null) || 
             (this.subjects_Workflow_Management_Count__c!=null &&
              this.subjects_Workflow_Management_Count__c.equals(other.getSubjects_Workflow_Management_Count__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.user_Conference__c==null && other.getUser_Conference__c()==null) || 
             (this.user_Conference__c!=null &&
              this.user_Conference__c.equals(other.getUser_Conference__c()))) &&
            ((this.user_Conference__r==null && other.getUser_Conference__r()==null) || 
             (this.user_Conference__r!=null &&
              this.user_Conference__r.equals(other.getUser_Conference__r())));
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
        if (getCertification_Sessions__c() != null) {
            _hashCode += getCertification_Sessions__c().hashCode();
        }
        if (getConference_Subjects__c() != null) {
            _hashCode += getConference_Subjects__c().hashCode();
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
        if (getFormat_Hands_On_Count__c() != null) {
            _hashCode += getFormat_Hands_On_Count__c().hashCode();
        }
        if (getFormat_One_on_One_Count__c() != null) {
            _hashCode += getFormat_One_on_One_Count__c().hashCode();
        }
        if (getFormat_Panel_Count__c() != null) {
            _hashCode += getFormat_Panel_Count__c().hashCode();
        }
        if (getFormat_RCA_Count__c() != null) {
            _hashCode += getFormat_RCA_Count__c().hashCode();
        }
        if (getFormat_RC_Sales_Count__c() != null) {
            _hashCode += getFormat_RC_Sales_Count__c().hashCode();
        }
        if (getFormat_Roundtable_Count__c() != null) {
            _hashCode += getFormat_Roundtable_Count__c().hashCode();
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
        if (getOther_Session_Format__c() != null) {
            _hashCode += getOther_Session_Format__c().hashCode();
        }
        if (getOther_Subject__c() != null) {
            _hashCode += getOther_Subject__c().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getSession_Format__c() != null) {
            _hashCode += getSession_Format__c().hashCode();
        }
        if (getSessions_During_no_overlap_Count__c() != null) {
            _hashCode += getSessions_During_no_overlap_Count__c().hashCode();
        }
        if (getSessions_During_w_Overlap_Count__c() != null) {
            _hashCode += getSessions_During_w_Overlap_Count__c().hashCode();
        }
        if (getSessions_Sunday_Count__c() != null) {
            _hashCode += getSessions_Sunday_Count__c().hashCode();
        }
        if (getSessions_Tuesday_after_Count__c() != null) {
            _hashCode += getSessions_Tuesday_after_Count__c().hashCode();
        }
        if (getSubjects_Analytics_Count__c() != null) {
            _hashCode += getSubjects_Analytics_Count__c().hashCode();
        }
        if (getSubjects_Benefits_of_Relativity_Count__c() != null) {
            _hashCode += getSubjects_Benefits_of_Relativity_Count__c().hashCode();
        }
        if (getSubjects_Infrastructure_Count__c() != null) {
            _hashCode += getSubjects_Infrastructure_Count__c().hashCode();
        }
        if (getSubjects_Legal_Hold_Count__c() != null) {
            _hashCode += getSubjects_Legal_Hold_Count__c().hashCode();
        }
        if (getSubjects_Other_Count__c() != null) {
            _hashCode += getSubjects_Other_Count__c().hashCode();
        }
        if (getSubjects_RDO_Count__c() != null) {
            _hashCode += getSubjects_RDO_Count__c().hashCode();
        }
        if (getSubjects_Relativity_Experiences_Count__c() != null) {
            _hashCode += getSubjects_Relativity_Experiences_Count__c().hashCode();
        }
        if (getSubjects_Reporting_Count__c() != null) {
            _hashCode += getSubjects_Reporting_Count__c().hashCode();
        }
        if (getSubjects_Roadmap_Count__c() != null) {
            _hashCode += getSubjects_Roadmap_Count__c().hashCode();
        }
        if (getSubjects_Workflow_Management_Count__c() != null) {
            _hashCode += getSubjects_Workflow_Management_Count__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getUser_Conference__c() != null) {
            _hashCode += getUser_Conference__c().hashCode();
        }
        if (getUser_Conference__r() != null) {
            _hashCode += getUser_Conference__r().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(User_Conference_Survey_Result__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User_Conference_Survey_Result__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certification_Sessions__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certification_Sessions__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conference_Subjects__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Conference_Subjects__c"));
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
        elemField.setFieldName("format_Hands_On_Count__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Format_Hands_On_Count__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format_One_on_One_Count__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Format_One_on_One_Count__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format_Panel_Count__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Format_Panel_Count__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format_RCA_Count__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Format_RCA_Count__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format_RC_Sales_Count__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Format_RC_Sales_Count__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format_Roundtable_Count__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Format_Roundtable_Count__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("other_Session_Format__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Other_Session_Format__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("other_Subject__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Other_Subject__c"));
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
        elemField.setFieldName("session_Format__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Session_Format__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessions_During_no_overlap_Count__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Sessions_During_no_overlap_Count__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessions_During_w_Overlap_Count__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Sessions_During_w_Overlap_Count__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessions_Sunday_Count__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Sessions_Sunday_Count__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessions_Tuesday_after_Count__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Sessions_Tuesday_after_Count__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjects_Analytics_Count__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Subjects_Analytics_Count__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjects_Benefits_of_Relativity_Count__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Subjects_Benefits_of_Relativity_Count__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjects_Infrastructure_Count__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Subjects_Infrastructure_Count__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjects_Legal_Hold_Count__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Subjects_Legal_Hold_Count__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjects_Other_Count__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Subjects_Other_Count__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjects_RDO_Count__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Subjects_RDO_Count__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjects_Relativity_Experiences_Count__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Subjects_Relativity_Experiences_Count__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjects_Reporting_Count__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Subjects_Reporting_Count__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjects_Roadmap_Count__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Subjects_Roadmap_Count__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjects_Workflow_Management_Count__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Subjects_Workflow_Management_Count__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("user_Conference__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User_Conference__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_Conference__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User_Conference__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User_Conference__c"));
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

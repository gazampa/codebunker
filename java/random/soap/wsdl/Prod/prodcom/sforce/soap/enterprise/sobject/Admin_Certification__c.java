/**
 * Admin_Certification__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Admin_Certification__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String account_Manager__c;

    private java.lang.String account__c;

    private com.sforce.soap.enterprise.sobject.Account account__r;

    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String certification_Subtype__c;

    private com.sforce.soap.enterprise.sobject.Certification_Subtype__c certification_Subtype__r;

    private com.sforce.soap.enterprise.QueryResult checklists__r;

    private java.lang.String conference_Room__c;

    private java.lang.String contact__c;

    private com.sforce.soap.enterprise.sobject.Contact contact__r;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.util.Calendar end_Date_and_Time__c;

    private com.sforce.soap.enterprise.QueryResult events;

    private java.lang.Double exam_Attempts__c;

    private com.sforce.soap.enterprise.QueryResult exam_Attendees__r;

    private java.lang.String exam_Slots__c;

    private java.lang.Double fail__c;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.lang.String graded__c;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.Boolean hosts_Added__c;

    private java.lang.Boolean isDeleted;

    private java.util.Date lastActivityDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String local_Start_Date_and_Time__c;

    private java.lang.String location__c;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private java.lang.String notes__c;

    private java.lang.Double num_of_Exam_Takers__c;

    private java.lang.Double num_of_Scored_Exams__c;

    private java.lang.String off_site_Location__c;

    private com.sforce.soap.enterprise.QueryResult openActivities;

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private java.lang.Double pass__c;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.String proctor__c;

    private com.sforce.soap.enterprise.sobject.User proctor__r;

    private java.lang.String relativity_Version__c;

    private java.lang.String session_Type__c;

    private java.util.Calendar start_Date_and_Time__c;

    private java.lang.String status__c;

    private com.sforce.soap.enterprise.QueryResult survey_Results__r;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    private java.lang.String team_Teaching__c;

    private com.sforce.soap.enterprise.sobject.User team_Teaching__r;

    private java.lang.Double total_Waitlisted__c;

    private java.lang.String travel_Billable__c;

    public Admin_Certification__c() {
    }

    public Admin_Certification__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String account_Manager__c,
           java.lang.String account__c,
           com.sforce.soap.enterprise.sobject.Account account__r,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String certification_Subtype__c,
           com.sforce.soap.enterprise.sobject.Certification_Subtype__c certification_Subtype__r,
           com.sforce.soap.enterprise.QueryResult checklists__r,
           java.lang.String conference_Room__c,
           java.lang.String contact__c,
           com.sforce.soap.enterprise.sobject.Contact contact__r,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.util.Calendar end_Date_and_Time__c,
           com.sforce.soap.enterprise.QueryResult events,
           java.lang.Double exam_Attempts__c,
           com.sforce.soap.enterprise.QueryResult exam_Attendees__r,
           java.lang.String exam_Slots__c,
           java.lang.Double fail__c,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.lang.String graded__c,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.Boolean hosts_Added__c,
           java.lang.Boolean isDeleted,
           java.util.Date lastActivityDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String local_Start_Date_and_Time__c,
           java.lang.String location__c,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           java.lang.String notes__c,
           java.lang.Double num_of_Exam_Takers__c,
           java.lang.Double num_of_Scored_Exams__c,
           java.lang.String off_site_Location__c,
           com.sforce.soap.enterprise.QueryResult openActivities,
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           java.lang.Double pass__c,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.String proctor__c,
           com.sforce.soap.enterprise.sobject.User proctor__r,
           java.lang.String relativity_Version__c,
           java.lang.String session_Type__c,
           java.util.Calendar start_Date_and_Time__c,
           java.lang.String status__c,
           com.sforce.soap.enterprise.QueryResult survey_Results__r,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks,
           java.lang.String team_Teaching__c,
           com.sforce.soap.enterprise.sobject.User team_Teaching__r,
           java.lang.Double total_Waitlisted__c,
           java.lang.String travel_Billable__c) {
        super(
            fieldsToNull,
            id);
        this.account_Manager__c = account_Manager__c;
        this.account__c = account__c;
        this.account__r = account__r;
        this.activityHistories = activityHistories;
        this.attachments = attachments;
        this.certification_Subtype__c = certification_Subtype__c;
        this.certification_Subtype__r = certification_Subtype__r;
        this.checklists__r = checklists__r;
        this.conference_Room__c = conference_Room__c;
        this.contact__c = contact__c;
        this.contact__r = contact__r;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.end_Date_and_Time__c = end_Date_and_Time__c;
        this.events = events;
        this.exam_Attempts__c = exam_Attempts__c;
        this.exam_Attendees__r = exam_Attendees__r;
        this.exam_Slots__c = exam_Slots__c;
        this.fail__c = fail__c;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.graded__c = graded__c;
        this.histories = histories;
        this.hosts_Added__c = hosts_Added__c;
        this.isDeleted = isDeleted;
        this.lastActivityDate = lastActivityDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.local_Start_Date_and_Time__c = local_Start_Date_and_Time__c;
        this.location__c = location__c;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.notes__c = notes__c;
        this.num_of_Exam_Takers__c = num_of_Exam_Takers__c;
        this.num_of_Scored_Exams__c = num_of_Scored_Exams__c;
        this.off_site_Location__c = off_site_Location__c;
        this.openActivities = openActivities;
        this.owner = owner;
        this.ownerId = ownerId;
        this.pass__c = pass__c;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.proctor__c = proctor__c;
        this.proctor__r = proctor__r;
        this.relativity_Version__c = relativity_Version__c;
        this.session_Type__c = session_Type__c;
        this.start_Date_and_Time__c = start_Date_and_Time__c;
        this.status__c = status__c;
        this.survey_Results__r = survey_Results__r;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
        this.team_Teaching__c = team_Teaching__c;
        this.team_Teaching__r = team_Teaching__r;
        this.total_Waitlisted__c = total_Waitlisted__c;
        this.travel_Billable__c = travel_Billable__c;
    }


    /**
     * Gets the account_Manager__c value for this Admin_Certification__c.
     * 
     * @return account_Manager__c
     */
    public java.lang.String getAccount_Manager__c() {
        return account_Manager__c;
    }


    /**
     * Sets the account_Manager__c value for this Admin_Certification__c.
     * 
     * @param account_Manager__c
     */
    public void setAccount_Manager__c(java.lang.String account_Manager__c) {
        this.account_Manager__c = account_Manager__c;
    }


    /**
     * Gets the account__c value for this Admin_Certification__c.
     * 
     * @return account__c
     */
    public java.lang.String getAccount__c() {
        return account__c;
    }


    /**
     * Sets the account__c value for this Admin_Certification__c.
     * 
     * @param account__c
     */
    public void setAccount__c(java.lang.String account__c) {
        this.account__c = account__c;
    }


    /**
     * Gets the account__r value for this Admin_Certification__c.
     * 
     * @return account__r
     */
    public com.sforce.soap.enterprise.sobject.Account getAccount__r() {
        return account__r;
    }


    /**
     * Sets the account__r value for this Admin_Certification__c.
     * 
     * @param account__r
     */
    public void setAccount__r(com.sforce.soap.enterprise.sobject.Account account__r) {
        this.account__r = account__r;
    }


    /**
     * Gets the activityHistories value for this Admin_Certification__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this Admin_Certification__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the attachments value for this Admin_Certification__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Admin_Certification__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the certification_Subtype__c value for this Admin_Certification__c.
     * 
     * @return certification_Subtype__c
     */
    public java.lang.String getCertification_Subtype__c() {
        return certification_Subtype__c;
    }


    /**
     * Sets the certification_Subtype__c value for this Admin_Certification__c.
     * 
     * @param certification_Subtype__c
     */
    public void setCertification_Subtype__c(java.lang.String certification_Subtype__c) {
        this.certification_Subtype__c = certification_Subtype__c;
    }


    /**
     * Gets the certification_Subtype__r value for this Admin_Certification__c.
     * 
     * @return certification_Subtype__r
     */
    public com.sforce.soap.enterprise.sobject.Certification_Subtype__c getCertification_Subtype__r() {
        return certification_Subtype__r;
    }


    /**
     * Sets the certification_Subtype__r value for this Admin_Certification__c.
     * 
     * @param certification_Subtype__r
     */
    public void setCertification_Subtype__r(com.sforce.soap.enterprise.sobject.Certification_Subtype__c certification_Subtype__r) {
        this.certification_Subtype__r = certification_Subtype__r;
    }


    /**
     * Gets the checklists__r value for this Admin_Certification__c.
     * 
     * @return checklists__r
     */
    public com.sforce.soap.enterprise.QueryResult getChecklists__r() {
        return checklists__r;
    }


    /**
     * Sets the checklists__r value for this Admin_Certification__c.
     * 
     * @param checklists__r
     */
    public void setChecklists__r(com.sforce.soap.enterprise.QueryResult checklists__r) {
        this.checklists__r = checklists__r;
    }


    /**
     * Gets the conference_Room__c value for this Admin_Certification__c.
     * 
     * @return conference_Room__c
     */
    public java.lang.String getConference_Room__c() {
        return conference_Room__c;
    }


    /**
     * Sets the conference_Room__c value for this Admin_Certification__c.
     * 
     * @param conference_Room__c
     */
    public void setConference_Room__c(java.lang.String conference_Room__c) {
        this.conference_Room__c = conference_Room__c;
    }


    /**
     * Gets the contact__c value for this Admin_Certification__c.
     * 
     * @return contact__c
     */
    public java.lang.String getContact__c() {
        return contact__c;
    }


    /**
     * Sets the contact__c value for this Admin_Certification__c.
     * 
     * @param contact__c
     */
    public void setContact__c(java.lang.String contact__c) {
        this.contact__c = contact__c;
    }


    /**
     * Gets the contact__r value for this Admin_Certification__c.
     * 
     * @return contact__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getContact__r() {
        return contact__r;
    }


    /**
     * Sets the contact__r value for this Admin_Certification__c.
     * 
     * @param contact__r
     */
    public void setContact__r(com.sforce.soap.enterprise.sobject.Contact contact__r) {
        this.contact__r = contact__r;
    }


    /**
     * Gets the createdBy value for this Admin_Certification__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Admin_Certification__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Admin_Certification__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Admin_Certification__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Admin_Certification__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Admin_Certification__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the end_Date_and_Time__c value for this Admin_Certification__c.
     * 
     * @return end_Date_and_Time__c
     */
    public java.util.Calendar getEnd_Date_and_Time__c() {
        return end_Date_and_Time__c;
    }


    /**
     * Sets the end_Date_and_Time__c value for this Admin_Certification__c.
     * 
     * @param end_Date_and_Time__c
     */
    public void setEnd_Date_and_Time__c(java.util.Calendar end_Date_and_Time__c) {
        this.end_Date_and_Time__c = end_Date_and_Time__c;
    }


    /**
     * Gets the events value for this Admin_Certification__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Admin_Certification__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the exam_Attempts__c value for this Admin_Certification__c.
     * 
     * @return exam_Attempts__c
     */
    public java.lang.Double getExam_Attempts__c() {
        return exam_Attempts__c;
    }


    /**
     * Sets the exam_Attempts__c value for this Admin_Certification__c.
     * 
     * @param exam_Attempts__c
     */
    public void setExam_Attempts__c(java.lang.Double exam_Attempts__c) {
        this.exam_Attempts__c = exam_Attempts__c;
    }


    /**
     * Gets the exam_Attendees__r value for this Admin_Certification__c.
     * 
     * @return exam_Attendees__r
     */
    public com.sforce.soap.enterprise.QueryResult getExam_Attendees__r() {
        return exam_Attendees__r;
    }


    /**
     * Sets the exam_Attendees__r value for this Admin_Certification__c.
     * 
     * @param exam_Attendees__r
     */
    public void setExam_Attendees__r(com.sforce.soap.enterprise.QueryResult exam_Attendees__r) {
        this.exam_Attendees__r = exam_Attendees__r;
    }


    /**
     * Gets the exam_Slots__c value for this Admin_Certification__c.
     * 
     * @return exam_Slots__c
     */
    public java.lang.String getExam_Slots__c() {
        return exam_Slots__c;
    }


    /**
     * Sets the exam_Slots__c value for this Admin_Certification__c.
     * 
     * @param exam_Slots__c
     */
    public void setExam_Slots__c(java.lang.String exam_Slots__c) {
        this.exam_Slots__c = exam_Slots__c;
    }


    /**
     * Gets the fail__c value for this Admin_Certification__c.
     * 
     * @return fail__c
     */
    public java.lang.Double getFail__c() {
        return fail__c;
    }


    /**
     * Sets the fail__c value for this Admin_Certification__c.
     * 
     * @param fail__c
     */
    public void setFail__c(java.lang.Double fail__c) {
        this.fail__c = fail__c;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Admin_Certification__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Admin_Certification__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the graded__c value for this Admin_Certification__c.
     * 
     * @return graded__c
     */
    public java.lang.String getGraded__c() {
        return graded__c;
    }


    /**
     * Sets the graded__c value for this Admin_Certification__c.
     * 
     * @param graded__c
     */
    public void setGraded__c(java.lang.String graded__c) {
        this.graded__c = graded__c;
    }


    /**
     * Gets the histories value for this Admin_Certification__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Admin_Certification__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the hosts_Added__c value for this Admin_Certification__c.
     * 
     * @return hosts_Added__c
     */
    public java.lang.Boolean getHosts_Added__c() {
        return hosts_Added__c;
    }


    /**
     * Sets the hosts_Added__c value for this Admin_Certification__c.
     * 
     * @param hosts_Added__c
     */
    public void setHosts_Added__c(java.lang.Boolean hosts_Added__c) {
        this.hosts_Added__c = hosts_Added__c;
    }


    /**
     * Gets the isDeleted value for this Admin_Certification__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Admin_Certification__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastActivityDate value for this Admin_Certification__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Admin_Certification__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this Admin_Certification__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Admin_Certification__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Admin_Certification__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Admin_Certification__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Admin_Certification__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Admin_Certification__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the local_Start_Date_and_Time__c value for this Admin_Certification__c.
     * 
     * @return local_Start_Date_and_Time__c
     */
    public java.lang.String getLocal_Start_Date_and_Time__c() {
        return local_Start_Date_and_Time__c;
    }


    /**
     * Sets the local_Start_Date_and_Time__c value for this Admin_Certification__c.
     * 
     * @param local_Start_Date_and_Time__c
     */
    public void setLocal_Start_Date_and_Time__c(java.lang.String local_Start_Date_and_Time__c) {
        this.local_Start_Date_and_Time__c = local_Start_Date_and_Time__c;
    }


    /**
     * Gets the location__c value for this Admin_Certification__c.
     * 
     * @return location__c
     */
    public java.lang.String getLocation__c() {
        return location__c;
    }


    /**
     * Sets the location__c value for this Admin_Certification__c.
     * 
     * @param location__c
     */
    public void setLocation__c(java.lang.String location__c) {
        this.location__c = location__c;
    }


    /**
     * Gets the name value for this Admin_Certification__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Admin_Certification__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Admin_Certification__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Admin_Certification__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Admin_Certification__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Admin_Certification__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the notes__c value for this Admin_Certification__c.
     * 
     * @return notes__c
     */
    public java.lang.String getNotes__c() {
        return notes__c;
    }


    /**
     * Sets the notes__c value for this Admin_Certification__c.
     * 
     * @param notes__c
     */
    public void setNotes__c(java.lang.String notes__c) {
        this.notes__c = notes__c;
    }


    /**
     * Gets the num_of_Exam_Takers__c value for this Admin_Certification__c.
     * 
     * @return num_of_Exam_Takers__c
     */
    public java.lang.Double getNum_of_Exam_Takers__c() {
        return num_of_Exam_Takers__c;
    }


    /**
     * Sets the num_of_Exam_Takers__c value for this Admin_Certification__c.
     * 
     * @param num_of_Exam_Takers__c
     */
    public void setNum_of_Exam_Takers__c(java.lang.Double num_of_Exam_Takers__c) {
        this.num_of_Exam_Takers__c = num_of_Exam_Takers__c;
    }


    /**
     * Gets the num_of_Scored_Exams__c value for this Admin_Certification__c.
     * 
     * @return num_of_Scored_Exams__c
     */
    public java.lang.Double getNum_of_Scored_Exams__c() {
        return num_of_Scored_Exams__c;
    }


    /**
     * Sets the num_of_Scored_Exams__c value for this Admin_Certification__c.
     * 
     * @param num_of_Scored_Exams__c
     */
    public void setNum_of_Scored_Exams__c(java.lang.Double num_of_Scored_Exams__c) {
        this.num_of_Scored_Exams__c = num_of_Scored_Exams__c;
    }


    /**
     * Gets the off_site_Location__c value for this Admin_Certification__c.
     * 
     * @return off_site_Location__c
     */
    public java.lang.String getOff_site_Location__c() {
        return off_site_Location__c;
    }


    /**
     * Sets the off_site_Location__c value for this Admin_Certification__c.
     * 
     * @param off_site_Location__c
     */
    public void setOff_site_Location__c(java.lang.String off_site_Location__c) {
        this.off_site_Location__c = off_site_Location__c;
    }


    /**
     * Gets the openActivities value for this Admin_Certification__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this Admin_Certification__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the owner value for this Admin_Certification__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Admin_Certification__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Admin_Certification__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Admin_Certification__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the pass__c value for this Admin_Certification__c.
     * 
     * @return pass__c
     */
    public java.lang.Double getPass__c() {
        return pass__c;
    }


    /**
     * Sets the pass__c value for this Admin_Certification__c.
     * 
     * @param pass__c
     */
    public void setPass__c(java.lang.Double pass__c) {
        this.pass__c = pass__c;
    }


    /**
     * Gets the processInstances value for this Admin_Certification__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Admin_Certification__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Admin_Certification__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Admin_Certification__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the proctor__c value for this Admin_Certification__c.
     * 
     * @return proctor__c
     */
    public java.lang.String getProctor__c() {
        return proctor__c;
    }


    /**
     * Sets the proctor__c value for this Admin_Certification__c.
     * 
     * @param proctor__c
     */
    public void setProctor__c(java.lang.String proctor__c) {
        this.proctor__c = proctor__c;
    }


    /**
     * Gets the proctor__r value for this Admin_Certification__c.
     * 
     * @return proctor__r
     */
    public com.sforce.soap.enterprise.sobject.User getProctor__r() {
        return proctor__r;
    }


    /**
     * Sets the proctor__r value for this Admin_Certification__c.
     * 
     * @param proctor__r
     */
    public void setProctor__r(com.sforce.soap.enterprise.sobject.User proctor__r) {
        this.proctor__r = proctor__r;
    }


    /**
     * Gets the relativity_Version__c value for this Admin_Certification__c.
     * 
     * @return relativity_Version__c
     */
    public java.lang.String getRelativity_Version__c() {
        return relativity_Version__c;
    }


    /**
     * Sets the relativity_Version__c value for this Admin_Certification__c.
     * 
     * @param relativity_Version__c
     */
    public void setRelativity_Version__c(java.lang.String relativity_Version__c) {
        this.relativity_Version__c = relativity_Version__c;
    }


    /**
     * Gets the session_Type__c value for this Admin_Certification__c.
     * 
     * @return session_Type__c
     */
    public java.lang.String getSession_Type__c() {
        return session_Type__c;
    }


    /**
     * Sets the session_Type__c value for this Admin_Certification__c.
     * 
     * @param session_Type__c
     */
    public void setSession_Type__c(java.lang.String session_Type__c) {
        this.session_Type__c = session_Type__c;
    }


    /**
     * Gets the start_Date_and_Time__c value for this Admin_Certification__c.
     * 
     * @return start_Date_and_Time__c
     */
    public java.util.Calendar getStart_Date_and_Time__c() {
        return start_Date_and_Time__c;
    }


    /**
     * Sets the start_Date_and_Time__c value for this Admin_Certification__c.
     * 
     * @param start_Date_and_Time__c
     */
    public void setStart_Date_and_Time__c(java.util.Calendar start_Date_and_Time__c) {
        this.start_Date_and_Time__c = start_Date_and_Time__c;
    }


    /**
     * Gets the status__c value for this Admin_Certification__c.
     * 
     * @return status__c
     */
    public java.lang.String getStatus__c() {
        return status__c;
    }


    /**
     * Sets the status__c value for this Admin_Certification__c.
     * 
     * @param status__c
     */
    public void setStatus__c(java.lang.String status__c) {
        this.status__c = status__c;
    }


    /**
     * Gets the survey_Results__r value for this Admin_Certification__c.
     * 
     * @return survey_Results__r
     */
    public com.sforce.soap.enterprise.QueryResult getSurvey_Results__r() {
        return survey_Results__r;
    }


    /**
     * Sets the survey_Results__r value for this Admin_Certification__c.
     * 
     * @param survey_Results__r
     */
    public void setSurvey_Results__r(com.sforce.soap.enterprise.QueryResult survey_Results__r) {
        this.survey_Results__r = survey_Results__r;
    }


    /**
     * Gets the systemModstamp value for this Admin_Certification__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Admin_Certification__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this Admin_Certification__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Admin_Certification__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the team_Teaching__c value for this Admin_Certification__c.
     * 
     * @return team_Teaching__c
     */
    public java.lang.String getTeam_Teaching__c() {
        return team_Teaching__c;
    }


    /**
     * Sets the team_Teaching__c value for this Admin_Certification__c.
     * 
     * @param team_Teaching__c
     */
    public void setTeam_Teaching__c(java.lang.String team_Teaching__c) {
        this.team_Teaching__c = team_Teaching__c;
    }


    /**
     * Gets the team_Teaching__r value for this Admin_Certification__c.
     * 
     * @return team_Teaching__r
     */
    public com.sforce.soap.enterprise.sobject.User getTeam_Teaching__r() {
        return team_Teaching__r;
    }


    /**
     * Sets the team_Teaching__r value for this Admin_Certification__c.
     * 
     * @param team_Teaching__r
     */
    public void setTeam_Teaching__r(com.sforce.soap.enterprise.sobject.User team_Teaching__r) {
        this.team_Teaching__r = team_Teaching__r;
    }


    /**
     * Gets the total_Waitlisted__c value for this Admin_Certification__c.
     * 
     * @return total_Waitlisted__c
     */
    public java.lang.Double getTotal_Waitlisted__c() {
        return total_Waitlisted__c;
    }


    /**
     * Sets the total_Waitlisted__c value for this Admin_Certification__c.
     * 
     * @param total_Waitlisted__c
     */
    public void setTotal_Waitlisted__c(java.lang.Double total_Waitlisted__c) {
        this.total_Waitlisted__c = total_Waitlisted__c;
    }


    /**
     * Gets the travel_Billable__c value for this Admin_Certification__c.
     * 
     * @return travel_Billable__c
     */
    public java.lang.String getTravel_Billable__c() {
        return travel_Billable__c;
    }


    /**
     * Sets the travel_Billable__c value for this Admin_Certification__c.
     * 
     * @param travel_Billable__c
     */
    public void setTravel_Billable__c(java.lang.String travel_Billable__c) {
        this.travel_Billable__c = travel_Billable__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Admin_Certification__c)) return false;
        Admin_Certification__c other = (Admin_Certification__c) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.account_Manager__c==null && other.getAccount_Manager__c()==null) || 
             (this.account_Manager__c!=null &&
              this.account_Manager__c.equals(other.getAccount_Manager__c()))) &&
            ((this.account__c==null && other.getAccount__c()==null) || 
             (this.account__c!=null &&
              this.account__c.equals(other.getAccount__c()))) &&
            ((this.account__r==null && other.getAccount__r()==null) || 
             (this.account__r!=null &&
              this.account__r.equals(other.getAccount__r()))) &&
            ((this.activityHistories==null && other.getActivityHistories()==null) || 
             (this.activityHistories!=null &&
              this.activityHistories.equals(other.getActivityHistories()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.certification_Subtype__c==null && other.getCertification_Subtype__c()==null) || 
             (this.certification_Subtype__c!=null &&
              this.certification_Subtype__c.equals(other.getCertification_Subtype__c()))) &&
            ((this.certification_Subtype__r==null && other.getCertification_Subtype__r()==null) || 
             (this.certification_Subtype__r!=null &&
              this.certification_Subtype__r.equals(other.getCertification_Subtype__r()))) &&
            ((this.checklists__r==null && other.getChecklists__r()==null) || 
             (this.checklists__r!=null &&
              this.checklists__r.equals(other.getChecklists__r()))) &&
            ((this.conference_Room__c==null && other.getConference_Room__c()==null) || 
             (this.conference_Room__c!=null &&
              this.conference_Room__c.equals(other.getConference_Room__c()))) &&
            ((this.contact__c==null && other.getContact__c()==null) || 
             (this.contact__c!=null &&
              this.contact__c.equals(other.getContact__c()))) &&
            ((this.contact__r==null && other.getContact__r()==null) || 
             (this.contact__r!=null &&
              this.contact__r.equals(other.getContact__r()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.end_Date_and_Time__c==null && other.getEnd_Date_and_Time__c()==null) || 
             (this.end_Date_and_Time__c!=null &&
              this.end_Date_and_Time__c.equals(other.getEnd_Date_and_Time__c()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              this.events.equals(other.getEvents()))) &&
            ((this.exam_Attempts__c==null && other.getExam_Attempts__c()==null) || 
             (this.exam_Attempts__c!=null &&
              this.exam_Attempts__c.equals(other.getExam_Attempts__c()))) &&
            ((this.exam_Attendees__r==null && other.getExam_Attendees__r()==null) || 
             (this.exam_Attendees__r!=null &&
              this.exam_Attendees__r.equals(other.getExam_Attendees__r()))) &&
            ((this.exam_Slots__c==null && other.getExam_Slots__c()==null) || 
             (this.exam_Slots__c!=null &&
              this.exam_Slots__c.equals(other.getExam_Slots__c()))) &&
            ((this.fail__c==null && other.getFail__c()==null) || 
             (this.fail__c!=null &&
              this.fail__c.equals(other.getFail__c()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.graded__c==null && other.getGraded__c()==null) || 
             (this.graded__c!=null &&
              this.graded__c.equals(other.getGraded__c()))) &&
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
            ((this.hosts_Added__c==null && other.getHosts_Added__c()==null) || 
             (this.hosts_Added__c!=null &&
              this.hosts_Added__c.equals(other.getHosts_Added__c()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.lastActivityDate==null && other.getLastActivityDate()==null) || 
             (this.lastActivityDate!=null &&
              this.lastActivityDate.equals(other.getLastActivityDate()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.local_Start_Date_and_Time__c==null && other.getLocal_Start_Date_and_Time__c()==null) || 
             (this.local_Start_Date_and_Time__c!=null &&
              this.local_Start_Date_and_Time__c.equals(other.getLocal_Start_Date_and_Time__c()))) &&
            ((this.location__c==null && other.getLocation__c()==null) || 
             (this.location__c!=null &&
              this.location__c.equals(other.getLocation__c()))) &&
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
            ((this.num_of_Exam_Takers__c==null && other.getNum_of_Exam_Takers__c()==null) || 
             (this.num_of_Exam_Takers__c!=null &&
              this.num_of_Exam_Takers__c.equals(other.getNum_of_Exam_Takers__c()))) &&
            ((this.num_of_Scored_Exams__c==null && other.getNum_of_Scored_Exams__c()==null) || 
             (this.num_of_Scored_Exams__c!=null &&
              this.num_of_Scored_Exams__c.equals(other.getNum_of_Scored_Exams__c()))) &&
            ((this.off_site_Location__c==null && other.getOff_site_Location__c()==null) || 
             (this.off_site_Location__c!=null &&
              this.off_site_Location__c.equals(other.getOff_site_Location__c()))) &&
            ((this.openActivities==null && other.getOpenActivities()==null) || 
             (this.openActivities!=null &&
              this.openActivities.equals(other.getOpenActivities()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.pass__c==null && other.getPass__c()==null) || 
             (this.pass__c!=null &&
              this.pass__c.equals(other.getPass__c()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.proctor__c==null && other.getProctor__c()==null) || 
             (this.proctor__c!=null &&
              this.proctor__c.equals(other.getProctor__c()))) &&
            ((this.proctor__r==null && other.getProctor__r()==null) || 
             (this.proctor__r!=null &&
              this.proctor__r.equals(other.getProctor__r()))) &&
            ((this.relativity_Version__c==null && other.getRelativity_Version__c()==null) || 
             (this.relativity_Version__c!=null &&
              this.relativity_Version__c.equals(other.getRelativity_Version__c()))) &&
            ((this.session_Type__c==null && other.getSession_Type__c()==null) || 
             (this.session_Type__c!=null &&
              this.session_Type__c.equals(other.getSession_Type__c()))) &&
            ((this.start_Date_and_Time__c==null && other.getStart_Date_and_Time__c()==null) || 
             (this.start_Date_and_Time__c!=null &&
              this.start_Date_and_Time__c.equals(other.getStart_Date_and_Time__c()))) &&
            ((this.status__c==null && other.getStatus__c()==null) || 
             (this.status__c!=null &&
              this.status__c.equals(other.getStatus__c()))) &&
            ((this.survey_Results__r==null && other.getSurvey_Results__r()==null) || 
             (this.survey_Results__r!=null &&
              this.survey_Results__r.equals(other.getSurvey_Results__r()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              this.tasks.equals(other.getTasks()))) &&
            ((this.team_Teaching__c==null && other.getTeam_Teaching__c()==null) || 
             (this.team_Teaching__c!=null &&
              this.team_Teaching__c.equals(other.getTeam_Teaching__c()))) &&
            ((this.team_Teaching__r==null && other.getTeam_Teaching__r()==null) || 
             (this.team_Teaching__r!=null &&
              this.team_Teaching__r.equals(other.getTeam_Teaching__r()))) &&
            ((this.total_Waitlisted__c==null && other.getTotal_Waitlisted__c()==null) || 
             (this.total_Waitlisted__c!=null &&
              this.total_Waitlisted__c.equals(other.getTotal_Waitlisted__c()))) &&
            ((this.travel_Billable__c==null && other.getTravel_Billable__c()==null) || 
             (this.travel_Billable__c!=null &&
              this.travel_Billable__c.equals(other.getTravel_Billable__c())));
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
        if (getAccount_Manager__c() != null) {
            _hashCode += getAccount_Manager__c().hashCode();
        }
        if (getAccount__c() != null) {
            _hashCode += getAccount__c().hashCode();
        }
        if (getAccount__r() != null) {
            _hashCode += getAccount__r().hashCode();
        }
        if (getActivityHistories() != null) {
            _hashCode += getActivityHistories().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getCertification_Subtype__c() != null) {
            _hashCode += getCertification_Subtype__c().hashCode();
        }
        if (getCertification_Subtype__r() != null) {
            _hashCode += getCertification_Subtype__r().hashCode();
        }
        if (getChecklists__r() != null) {
            _hashCode += getChecklists__r().hashCode();
        }
        if (getConference_Room__c() != null) {
            _hashCode += getConference_Room__c().hashCode();
        }
        if (getContact__c() != null) {
            _hashCode += getContact__c().hashCode();
        }
        if (getContact__r() != null) {
            _hashCode += getContact__r().hashCode();
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
        if (getEnd_Date_and_Time__c() != null) {
            _hashCode += getEnd_Date_and_Time__c().hashCode();
        }
        if (getEvents() != null) {
            _hashCode += getEvents().hashCode();
        }
        if (getExam_Attempts__c() != null) {
            _hashCode += getExam_Attempts__c().hashCode();
        }
        if (getExam_Attendees__r() != null) {
            _hashCode += getExam_Attendees__r().hashCode();
        }
        if (getExam_Slots__c() != null) {
            _hashCode += getExam_Slots__c().hashCode();
        }
        if (getFail__c() != null) {
            _hashCode += getFail__c().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getGraded__c() != null) {
            _hashCode += getGraded__c().hashCode();
        }
        if (getHistories() != null) {
            _hashCode += getHistories().hashCode();
        }
        if (getHosts_Added__c() != null) {
            _hashCode += getHosts_Added__c().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getLastActivityDate() != null) {
            _hashCode += getLastActivityDate().hashCode();
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
        if (getLocal_Start_Date_and_Time__c() != null) {
            _hashCode += getLocal_Start_Date_and_Time__c().hashCode();
        }
        if (getLocation__c() != null) {
            _hashCode += getLocation__c().hashCode();
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
        if (getNum_of_Exam_Takers__c() != null) {
            _hashCode += getNum_of_Exam_Takers__c().hashCode();
        }
        if (getNum_of_Scored_Exams__c() != null) {
            _hashCode += getNum_of_Scored_Exams__c().hashCode();
        }
        if (getOff_site_Location__c() != null) {
            _hashCode += getOff_site_Location__c().hashCode();
        }
        if (getOpenActivities() != null) {
            _hashCode += getOpenActivities().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getPass__c() != null) {
            _hashCode += getPass__c().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getProctor__c() != null) {
            _hashCode += getProctor__c().hashCode();
        }
        if (getProctor__r() != null) {
            _hashCode += getProctor__r().hashCode();
        }
        if (getRelativity_Version__c() != null) {
            _hashCode += getRelativity_Version__c().hashCode();
        }
        if (getSession_Type__c() != null) {
            _hashCode += getSession_Type__c().hashCode();
        }
        if (getStart_Date_and_Time__c() != null) {
            _hashCode += getStart_Date_and_Time__c().hashCode();
        }
        if (getStatus__c() != null) {
            _hashCode += getStatus__c().hashCode();
        }
        if (getSurvey_Results__r() != null) {
            _hashCode += getSurvey_Results__r().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTasks() != null) {
            _hashCode += getTasks().hashCode();
        }
        if (getTeam_Teaching__c() != null) {
            _hashCode += getTeam_Teaching__c().hashCode();
        }
        if (getTeam_Teaching__r() != null) {
            _hashCode += getTeam_Teaching__r().hashCode();
        }
        if (getTotal_Waitlisted__c() != null) {
            _hashCode += getTotal_Waitlisted__c().hashCode();
        }
        if (getTravel_Billable__c() != null) {
            _hashCode += getTravel_Billable__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Admin_Certification__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Admin_Certification__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account_Manager__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account_Manager__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("activityHistories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActivityHistories"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("certification_Subtype__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certification_Subtype__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certification_Subtype__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certification_Subtype__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certification_Subtype__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checklists__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Checklists__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conference_Room__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Conference_Room__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
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
        elemField.setFieldName("end_Date_and_Time__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "End_Date_and_Time__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("events");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Events"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exam_Attempts__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Exam_Attempts__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exam_Attendees__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Exam_Attendees__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exam_Slots__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Exam_Slots__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fail__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fail__c"));
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
        elemField.setFieldName("graded__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Graded__c"));
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
        elemField.setFieldName("hosts_Added__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Hosts_Added__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("lastActivityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastActivityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("local_Start_Date_and_Time__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Local_Start_Date_and_Time__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Location__c"));
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
        elemField.setFieldName("num_of_Exam_Takers__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Num_of_Exam_Takers__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("num_of_Scored_Exams__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Num_of_Scored_Exams__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("off_site_Location__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Off_site_Location__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openActivities");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpenActivities"));
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
        elemField.setFieldName("pass__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pass__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("proctor__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Proctor__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proctor__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Proctor__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
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
        elemField.setFieldName("session_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Session_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start_Date_and_Time__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Start_Date_and_Time__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("survey_Results__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Survey_Results__r"));
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
        elemField.setFieldName("tasks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("team_Teaching__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Team_Teaching__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("team_Teaching__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Team_Teaching__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_Waitlisted__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Total_Waitlisted__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("travel_Billable__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Travel_Billable__c"));
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

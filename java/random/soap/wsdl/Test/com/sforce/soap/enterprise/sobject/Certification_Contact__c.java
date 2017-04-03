/**
 * Certification_Contact__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Certification_Contact__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private java.lang.String address__c;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private com.sforce.soap.enterprise.QueryResult certification_Specializations__r;

    private java.lang.String certification__c;

    private com.sforce.soap.enterprise.sobject.Certification__c certification__r;

    private com.sforce.soap.enterprise.QueryResult certifications__r;

    private com.sforce.soap.enterprise.QueryResult contacts__r;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String demo_Certification__c;

    private com.sforce.soap.enterprise.sobject.Demo_Certification__c demo_Certification__r;

    private java.lang.String email__c;

    private com.sforce.soap.enterprise.QueryResult events;

    private java.lang.String exam_Attendee__c;

    private com.sforce.soap.enterprise.sobject.Exam_Attendees__c exam_Attendee__r;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.Boolean isDeleted;

    private java.util.Date lastActivityDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private com.sforce.soap.enterprise.QueryResult openActivities;

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private java.lang.String phone__c;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.String RCA_CC__c;

    private java.lang.Double RCA_Credits_for_Current_Year__c;

    private com.sforce.soap.enterprise.QueryResult RCA_Foriegn_Key__r;

    private java.lang.String RCA__c;

    private com.sforce.soap.enterprise.QueryResult RCE_Credits__r;

    private java.lang.Double RCSP_Credits_for_Current_Year__c;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    public Certification_Contact__c() {
    }

    public Certification_Contact__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           java.lang.String address__c,
           com.sforce.soap.enterprise.QueryResult attachments,
           com.sforce.soap.enterprise.QueryResult certification_Specializations__r,
           java.lang.String certification__c,
           com.sforce.soap.enterprise.sobject.Certification__c certification__r,
           com.sforce.soap.enterprise.QueryResult certifications__r,
           com.sforce.soap.enterprise.QueryResult contacts__r,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String demo_Certification__c,
           com.sforce.soap.enterprise.sobject.Demo_Certification__c demo_Certification__r,
           java.lang.String email__c,
           com.sforce.soap.enterprise.QueryResult events,
           java.lang.String exam_Attendee__c,
           com.sforce.soap.enterprise.sobject.Exam_Attendees__c exam_Attendee__r,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.Boolean isDeleted,
           java.util.Date lastActivityDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           com.sforce.soap.enterprise.QueryResult openActivities,
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           java.lang.String phone__c,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.String RCA_CC__c,
           java.lang.Double RCA_Credits_for_Current_Year__c,
           com.sforce.soap.enterprise.QueryResult RCA_Foriegn_Key__r,
           java.lang.String RCA__c,
           com.sforce.soap.enterprise.QueryResult RCE_Credits__r,
           java.lang.Double RCSP_Credits_for_Current_Year__c,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks) {
        super(
            fieldsToNull,
            id);
        this.activityHistories = activityHistories;
        this.address__c = address__c;
        this.attachments = attachments;
        this.certification_Specializations__r = certification_Specializations__r;
        this.certification__c = certification__c;
        this.certification__r = certification__r;
        this.certifications__r = certifications__r;
        this.contacts__r = contacts__r;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.demo_Certification__c = demo_Certification__c;
        this.demo_Certification__r = demo_Certification__r;
        this.email__c = email__c;
        this.events = events;
        this.exam_Attendee__c = exam_Attendee__c;
        this.exam_Attendee__r = exam_Attendee__r;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.histories = histories;
        this.isDeleted = isDeleted;
        this.lastActivityDate = lastActivityDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.openActivities = openActivities;
        this.owner = owner;
        this.ownerId = ownerId;
        this.phone__c = phone__c;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.RCA_CC__c = RCA_CC__c;
        this.RCA_Credits_for_Current_Year__c = RCA_Credits_for_Current_Year__c;
        this.RCA_Foriegn_Key__r = RCA_Foriegn_Key__r;
        this.RCA__c = RCA__c;
        this.RCE_Credits__r = RCE_Credits__r;
        this.RCSP_Credits_for_Current_Year__c = RCSP_Credits_for_Current_Year__c;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
    }


    /**
     * Gets the activityHistories value for this Certification_Contact__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this Certification_Contact__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the address__c value for this Certification_Contact__c.
     * 
     * @return address__c
     */
    public java.lang.String getAddress__c() {
        return address__c;
    }


    /**
     * Sets the address__c value for this Certification_Contact__c.
     * 
     * @param address__c
     */
    public void setAddress__c(java.lang.String address__c) {
        this.address__c = address__c;
    }


    /**
     * Gets the attachments value for this Certification_Contact__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Certification_Contact__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the certification_Specializations__r value for this Certification_Contact__c.
     * 
     * @return certification_Specializations__r
     */
    public com.sforce.soap.enterprise.QueryResult getCertification_Specializations__r() {
        return certification_Specializations__r;
    }


    /**
     * Sets the certification_Specializations__r value for this Certification_Contact__c.
     * 
     * @param certification_Specializations__r
     */
    public void setCertification_Specializations__r(com.sforce.soap.enterprise.QueryResult certification_Specializations__r) {
        this.certification_Specializations__r = certification_Specializations__r;
    }


    /**
     * Gets the certification__c value for this Certification_Contact__c.
     * 
     * @return certification__c
     */
    public java.lang.String getCertification__c() {
        return certification__c;
    }


    /**
     * Sets the certification__c value for this Certification_Contact__c.
     * 
     * @param certification__c
     */
    public void setCertification__c(java.lang.String certification__c) {
        this.certification__c = certification__c;
    }


    /**
     * Gets the certification__r value for this Certification_Contact__c.
     * 
     * @return certification__r
     */
    public com.sforce.soap.enterprise.sobject.Certification__c getCertification__r() {
        return certification__r;
    }


    /**
     * Sets the certification__r value for this Certification_Contact__c.
     * 
     * @param certification__r
     */
    public void setCertification__r(com.sforce.soap.enterprise.sobject.Certification__c certification__r) {
        this.certification__r = certification__r;
    }


    /**
     * Gets the certifications__r value for this Certification_Contact__c.
     * 
     * @return certifications__r
     */
    public com.sforce.soap.enterprise.QueryResult getCertifications__r() {
        return certifications__r;
    }


    /**
     * Sets the certifications__r value for this Certification_Contact__c.
     * 
     * @param certifications__r
     */
    public void setCertifications__r(com.sforce.soap.enterprise.QueryResult certifications__r) {
        this.certifications__r = certifications__r;
    }


    /**
     * Gets the contacts__r value for this Certification_Contact__c.
     * 
     * @return contacts__r
     */
    public com.sforce.soap.enterprise.QueryResult getContacts__r() {
        return contacts__r;
    }


    /**
     * Sets the contacts__r value for this Certification_Contact__c.
     * 
     * @param contacts__r
     */
    public void setContacts__r(com.sforce.soap.enterprise.QueryResult contacts__r) {
        this.contacts__r = contacts__r;
    }


    /**
     * Gets the createdBy value for this Certification_Contact__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Certification_Contact__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Certification_Contact__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Certification_Contact__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Certification_Contact__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Certification_Contact__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the demo_Certification__c value for this Certification_Contact__c.
     * 
     * @return demo_Certification__c
     */
    public java.lang.String getDemo_Certification__c() {
        return demo_Certification__c;
    }


    /**
     * Sets the demo_Certification__c value for this Certification_Contact__c.
     * 
     * @param demo_Certification__c
     */
    public void setDemo_Certification__c(java.lang.String demo_Certification__c) {
        this.demo_Certification__c = demo_Certification__c;
    }


    /**
     * Gets the demo_Certification__r value for this Certification_Contact__c.
     * 
     * @return demo_Certification__r
     */
    public com.sforce.soap.enterprise.sobject.Demo_Certification__c getDemo_Certification__r() {
        return demo_Certification__r;
    }


    /**
     * Sets the demo_Certification__r value for this Certification_Contact__c.
     * 
     * @param demo_Certification__r
     */
    public void setDemo_Certification__r(com.sforce.soap.enterprise.sobject.Demo_Certification__c demo_Certification__r) {
        this.demo_Certification__r = demo_Certification__r;
    }


    /**
     * Gets the email__c value for this Certification_Contact__c.
     * 
     * @return email__c
     */
    public java.lang.String getEmail__c() {
        return email__c;
    }


    /**
     * Sets the email__c value for this Certification_Contact__c.
     * 
     * @param email__c
     */
    public void setEmail__c(java.lang.String email__c) {
        this.email__c = email__c;
    }


    /**
     * Gets the events value for this Certification_Contact__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Certification_Contact__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the exam_Attendee__c value for this Certification_Contact__c.
     * 
     * @return exam_Attendee__c
     */
    public java.lang.String getExam_Attendee__c() {
        return exam_Attendee__c;
    }


    /**
     * Sets the exam_Attendee__c value for this Certification_Contact__c.
     * 
     * @param exam_Attendee__c
     */
    public void setExam_Attendee__c(java.lang.String exam_Attendee__c) {
        this.exam_Attendee__c = exam_Attendee__c;
    }


    /**
     * Gets the exam_Attendee__r value for this Certification_Contact__c.
     * 
     * @return exam_Attendee__r
     */
    public com.sforce.soap.enterprise.sobject.Exam_Attendees__c getExam_Attendee__r() {
        return exam_Attendee__r;
    }


    /**
     * Sets the exam_Attendee__r value for this Certification_Contact__c.
     * 
     * @param exam_Attendee__r
     */
    public void setExam_Attendee__r(com.sforce.soap.enterprise.sobject.Exam_Attendees__c exam_Attendee__r) {
        this.exam_Attendee__r = exam_Attendee__r;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Certification_Contact__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Certification_Contact__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the histories value for this Certification_Contact__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Certification_Contact__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the isDeleted value for this Certification_Contact__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Certification_Contact__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastActivityDate value for this Certification_Contact__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Certification_Contact__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this Certification_Contact__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Certification_Contact__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Certification_Contact__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Certification_Contact__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Certification_Contact__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Certification_Contact__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this Certification_Contact__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Certification_Contact__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Certification_Contact__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Certification_Contact__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Certification_Contact__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Certification_Contact__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the openActivities value for this Certification_Contact__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this Certification_Contact__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the owner value for this Certification_Contact__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Certification_Contact__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Certification_Contact__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Certification_Contact__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the phone__c value for this Certification_Contact__c.
     * 
     * @return phone__c
     */
    public java.lang.String getPhone__c() {
        return phone__c;
    }


    /**
     * Sets the phone__c value for this Certification_Contact__c.
     * 
     * @param phone__c
     */
    public void setPhone__c(java.lang.String phone__c) {
        this.phone__c = phone__c;
    }


    /**
     * Gets the processInstances value for this Certification_Contact__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Certification_Contact__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Certification_Contact__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Certification_Contact__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the RCA_CC__c value for this Certification_Contact__c.
     * 
     * @return RCA_CC__c
     */
    public java.lang.String getRCA_CC__c() {
        return RCA_CC__c;
    }


    /**
     * Sets the RCA_CC__c value for this Certification_Contact__c.
     * 
     * @param RCA_CC__c
     */
    public void setRCA_CC__c(java.lang.String RCA_CC__c) {
        this.RCA_CC__c = RCA_CC__c;
    }


    /**
     * Gets the RCA_Credits_for_Current_Year__c value for this Certification_Contact__c.
     * 
     * @return RCA_Credits_for_Current_Year__c
     */
    public java.lang.Double getRCA_Credits_for_Current_Year__c() {
        return RCA_Credits_for_Current_Year__c;
    }


    /**
     * Sets the RCA_Credits_for_Current_Year__c value for this Certification_Contact__c.
     * 
     * @param RCA_Credits_for_Current_Year__c
     */
    public void setRCA_Credits_for_Current_Year__c(java.lang.Double RCA_Credits_for_Current_Year__c) {
        this.RCA_Credits_for_Current_Year__c = RCA_Credits_for_Current_Year__c;
    }


    /**
     * Gets the RCA_Foriegn_Key__r value for this Certification_Contact__c.
     * 
     * @return RCA_Foriegn_Key__r
     */
    public com.sforce.soap.enterprise.QueryResult getRCA_Foriegn_Key__r() {
        return RCA_Foriegn_Key__r;
    }


    /**
     * Sets the RCA_Foriegn_Key__r value for this Certification_Contact__c.
     * 
     * @param RCA_Foriegn_Key__r
     */
    public void setRCA_Foriegn_Key__r(com.sforce.soap.enterprise.QueryResult RCA_Foriegn_Key__r) {
        this.RCA_Foriegn_Key__r = RCA_Foriegn_Key__r;
    }


    /**
     * Gets the RCA__c value for this Certification_Contact__c.
     * 
     * @return RCA__c
     */
    public java.lang.String getRCA__c() {
        return RCA__c;
    }


    /**
     * Sets the RCA__c value for this Certification_Contact__c.
     * 
     * @param RCA__c
     */
    public void setRCA__c(java.lang.String RCA__c) {
        this.RCA__c = RCA__c;
    }


    /**
     * Gets the RCE_Credits__r value for this Certification_Contact__c.
     * 
     * @return RCE_Credits__r
     */
    public com.sforce.soap.enterprise.QueryResult getRCE_Credits__r() {
        return RCE_Credits__r;
    }


    /**
     * Sets the RCE_Credits__r value for this Certification_Contact__c.
     * 
     * @param RCE_Credits__r
     */
    public void setRCE_Credits__r(com.sforce.soap.enterprise.QueryResult RCE_Credits__r) {
        this.RCE_Credits__r = RCE_Credits__r;
    }


    /**
     * Gets the RCSP_Credits_for_Current_Year__c value for this Certification_Contact__c.
     * 
     * @return RCSP_Credits_for_Current_Year__c
     */
    public java.lang.Double getRCSP_Credits_for_Current_Year__c() {
        return RCSP_Credits_for_Current_Year__c;
    }


    /**
     * Sets the RCSP_Credits_for_Current_Year__c value for this Certification_Contact__c.
     * 
     * @param RCSP_Credits_for_Current_Year__c
     */
    public void setRCSP_Credits_for_Current_Year__c(java.lang.Double RCSP_Credits_for_Current_Year__c) {
        this.RCSP_Credits_for_Current_Year__c = RCSP_Credits_for_Current_Year__c;
    }


    /**
     * Gets the systemModstamp value for this Certification_Contact__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Certification_Contact__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this Certification_Contact__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Certification_Contact__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Certification_Contact__c)) return false;
        Certification_Contact__c other = (Certification_Contact__c) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.activityHistories==null && other.getActivityHistories()==null) || 
             (this.activityHistories!=null &&
              this.activityHistories.equals(other.getActivityHistories()))) &&
            ((this.address__c==null && other.getAddress__c()==null) || 
             (this.address__c!=null &&
              this.address__c.equals(other.getAddress__c()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.certification_Specializations__r==null && other.getCertification_Specializations__r()==null) || 
             (this.certification_Specializations__r!=null &&
              this.certification_Specializations__r.equals(other.getCertification_Specializations__r()))) &&
            ((this.certification__c==null && other.getCertification__c()==null) || 
             (this.certification__c!=null &&
              this.certification__c.equals(other.getCertification__c()))) &&
            ((this.certification__r==null && other.getCertification__r()==null) || 
             (this.certification__r!=null &&
              this.certification__r.equals(other.getCertification__r()))) &&
            ((this.certifications__r==null && other.getCertifications__r()==null) || 
             (this.certifications__r!=null &&
              this.certifications__r.equals(other.getCertifications__r()))) &&
            ((this.contacts__r==null && other.getContacts__r()==null) || 
             (this.contacts__r!=null &&
              this.contacts__r.equals(other.getContacts__r()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.demo_Certification__c==null && other.getDemo_Certification__c()==null) || 
             (this.demo_Certification__c!=null &&
              this.demo_Certification__c.equals(other.getDemo_Certification__c()))) &&
            ((this.demo_Certification__r==null && other.getDemo_Certification__r()==null) || 
             (this.demo_Certification__r!=null &&
              this.demo_Certification__r.equals(other.getDemo_Certification__r()))) &&
            ((this.email__c==null && other.getEmail__c()==null) || 
             (this.email__c!=null &&
              this.email__c.equals(other.getEmail__c()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              this.events.equals(other.getEvents()))) &&
            ((this.exam_Attendee__c==null && other.getExam_Attendee__c()==null) || 
             (this.exam_Attendee__c!=null &&
              this.exam_Attendee__c.equals(other.getExam_Attendee__c()))) &&
            ((this.exam_Attendee__r==null && other.getExam_Attendee__r()==null) || 
             (this.exam_Attendee__r!=null &&
              this.exam_Attendee__r.equals(other.getExam_Attendee__r()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.openActivities==null && other.getOpenActivities()==null) || 
             (this.openActivities!=null &&
              this.openActivities.equals(other.getOpenActivities()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.phone__c==null && other.getPhone__c()==null) || 
             (this.phone__c!=null &&
              this.phone__c.equals(other.getPhone__c()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.RCA_CC__c==null && other.getRCA_CC__c()==null) || 
             (this.RCA_CC__c!=null &&
              this.RCA_CC__c.equals(other.getRCA_CC__c()))) &&
            ((this.RCA_Credits_for_Current_Year__c==null && other.getRCA_Credits_for_Current_Year__c()==null) || 
             (this.RCA_Credits_for_Current_Year__c!=null &&
              this.RCA_Credits_for_Current_Year__c.equals(other.getRCA_Credits_for_Current_Year__c()))) &&
            ((this.RCA_Foriegn_Key__r==null && other.getRCA_Foriegn_Key__r()==null) || 
             (this.RCA_Foriegn_Key__r!=null &&
              this.RCA_Foriegn_Key__r.equals(other.getRCA_Foriegn_Key__r()))) &&
            ((this.RCA__c==null && other.getRCA__c()==null) || 
             (this.RCA__c!=null &&
              this.RCA__c.equals(other.getRCA__c()))) &&
            ((this.RCE_Credits__r==null && other.getRCE_Credits__r()==null) || 
             (this.RCE_Credits__r!=null &&
              this.RCE_Credits__r.equals(other.getRCE_Credits__r()))) &&
            ((this.RCSP_Credits_for_Current_Year__c==null && other.getRCSP_Credits_for_Current_Year__c()==null) || 
             (this.RCSP_Credits_for_Current_Year__c!=null &&
              this.RCSP_Credits_for_Current_Year__c.equals(other.getRCSP_Credits_for_Current_Year__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              this.tasks.equals(other.getTasks())));
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
        if (getActivityHistories() != null) {
            _hashCode += getActivityHistories().hashCode();
        }
        if (getAddress__c() != null) {
            _hashCode += getAddress__c().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getCertification_Specializations__r() != null) {
            _hashCode += getCertification_Specializations__r().hashCode();
        }
        if (getCertification__c() != null) {
            _hashCode += getCertification__c().hashCode();
        }
        if (getCertification__r() != null) {
            _hashCode += getCertification__r().hashCode();
        }
        if (getCertifications__r() != null) {
            _hashCode += getCertifications__r().hashCode();
        }
        if (getContacts__r() != null) {
            _hashCode += getContacts__r().hashCode();
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
        if (getDemo_Certification__c() != null) {
            _hashCode += getDemo_Certification__c().hashCode();
        }
        if (getDemo_Certification__r() != null) {
            _hashCode += getDemo_Certification__r().hashCode();
        }
        if (getEmail__c() != null) {
            _hashCode += getEmail__c().hashCode();
        }
        if (getEvents() != null) {
            _hashCode += getEvents().hashCode();
        }
        if (getExam_Attendee__c() != null) {
            _hashCode += getExam_Attendee__c().hashCode();
        }
        if (getExam_Attendee__r() != null) {
            _hashCode += getExam_Attendee__r().hashCode();
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getNotesAndAttachments() != null) {
            _hashCode += getNotesAndAttachments().hashCode();
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
        if (getPhone__c() != null) {
            _hashCode += getPhone__c().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getRCA_CC__c() != null) {
            _hashCode += getRCA_CC__c().hashCode();
        }
        if (getRCA_Credits_for_Current_Year__c() != null) {
            _hashCode += getRCA_Credits_for_Current_Year__c().hashCode();
        }
        if (getRCA_Foriegn_Key__r() != null) {
            _hashCode += getRCA_Foriegn_Key__r().hashCode();
        }
        if (getRCA__c() != null) {
            _hashCode += getRCA__c().hashCode();
        }
        if (getRCE_Credits__r() != null) {
            _hashCode += getRCE_Credits__r().hashCode();
        }
        if (getRCSP_Credits_for_Current_Year__c() != null) {
            _hashCode += getRCSP_Credits_for_Current_Year__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTasks() != null) {
            _hashCode += getTasks().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Certification_Contact__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certification_Contact__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityHistories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActivityHistories"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Address__c"));
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
        elemField.setFieldName("certification_Specializations__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certification_Specializations__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certification__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certification__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certification__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certification__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certification__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certifications__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certifications__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contacts__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contacts__r"));
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
        elemField.setFieldName("demo_Certification__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Demo_Certification__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("demo_Certification__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Demo_Certification__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Demo_Certification__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Email__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("exam_Attendee__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Exam_Attendee__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exam_Attendee__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Exam_Attendee__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Exam_Attendees__c"));
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
        elemField.setFieldName("phone__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Phone__c"));
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
        elemField.setFieldName("RCA_CC__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCA_CC__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RCA_Credits_for_Current_Year__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCA_Credits_for_Current_Year__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RCA_Foriegn_Key__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCA_Foriegn_Key__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RCA__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCA__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RCE_Credits__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCE_Credits__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RCSP_Credits_for_Current_Year__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCSP_Credits_for_Current_Year__c"));
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
        elemField.setFieldName("tasks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tasks"));
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

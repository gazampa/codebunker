/**
 * Certification__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Certification__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String certification_Contact_Email_reference__c;

    private java.lang.String certification_Contact__c;

    private com.sforce.soap.enterprise.sobject.Certification_Contact__c certification_Contact__r;

    private com.sforce.soap.enterprise.QueryResult certification_Contacts__r;

    private java.util.Date certification_Extension_Date__c;

    private java.lang.Boolean certification_Renewed__c;

    private com.sforce.soap.enterprise.QueryResult certification_Specializations__r;

    private java.lang.String certification_Type__c;

    private com.sforce.soap.enterprise.sobject.Certification_Type__c certification_Type__r;

    private java.lang.String certified__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.util.Date end_Date__c;

    private com.sforce.soap.enterprise.QueryResult events;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.Boolean isDeleted;

    private java.util.Date lastActivityDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.Double manual_Credits__c;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private java.lang.Double number_of_Times_Renewed__c;

    private com.sforce.soap.enterprise.QueryResult openActivities;

    private java.util.Date original_Certification_Date__c;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.util.Date start_Date__c;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    private java.lang.Double total_RCA_Credits__c;

    public Certification__c() {
    }

    public Certification__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String certification_Contact_Email_reference__c,
           java.lang.String certification_Contact__c,
           com.sforce.soap.enterprise.sobject.Certification_Contact__c certification_Contact__r,
           com.sforce.soap.enterprise.QueryResult certification_Contacts__r,
           java.util.Date certification_Extension_Date__c,
           java.lang.Boolean certification_Renewed__c,
           com.sforce.soap.enterprise.QueryResult certification_Specializations__r,
           java.lang.String certification_Type__c,
           com.sforce.soap.enterprise.sobject.Certification_Type__c certification_Type__r,
           java.lang.String certified__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.util.Date end_Date__c,
           com.sforce.soap.enterprise.QueryResult events,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.Boolean isDeleted,
           java.util.Date lastActivityDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.Double manual_Credits__c,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           java.lang.Double number_of_Times_Renewed__c,
           com.sforce.soap.enterprise.QueryResult openActivities,
           java.util.Date original_Certification_Date__c,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.util.Date start_Date__c,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks,
           java.lang.Double total_RCA_Credits__c) {
        super(
            fieldsToNull,
            id);
        this.activityHistories = activityHistories;
        this.attachments = attachments;
        this.certification_Contact_Email_reference__c = certification_Contact_Email_reference__c;
        this.certification_Contact__c = certification_Contact__c;
        this.certification_Contact__r = certification_Contact__r;
        this.certification_Contacts__r = certification_Contacts__r;
        this.certification_Extension_Date__c = certification_Extension_Date__c;
        this.certification_Renewed__c = certification_Renewed__c;
        this.certification_Specializations__r = certification_Specializations__r;
        this.certification_Type__c = certification_Type__c;
        this.certification_Type__r = certification_Type__r;
        this.certified__c = certified__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.end_Date__c = end_Date__c;
        this.events = events;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.histories = histories;
        this.isDeleted = isDeleted;
        this.lastActivityDate = lastActivityDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.manual_Credits__c = manual_Credits__c;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.number_of_Times_Renewed__c = number_of_Times_Renewed__c;
        this.openActivities = openActivities;
        this.original_Certification_Date__c = original_Certification_Date__c;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.start_Date__c = start_Date__c;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
        this.total_RCA_Credits__c = total_RCA_Credits__c;
    }


    /**
     * Gets the activityHistories value for this Certification__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this Certification__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the attachments value for this Certification__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Certification__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the certification_Contact_Email_reference__c value for this Certification__c.
     * 
     * @return certification_Contact_Email_reference__c
     */
    public java.lang.String getCertification_Contact_Email_reference__c() {
        return certification_Contact_Email_reference__c;
    }


    /**
     * Sets the certification_Contact_Email_reference__c value for this Certification__c.
     * 
     * @param certification_Contact_Email_reference__c
     */
    public void setCertification_Contact_Email_reference__c(java.lang.String certification_Contact_Email_reference__c) {
        this.certification_Contact_Email_reference__c = certification_Contact_Email_reference__c;
    }


    /**
     * Gets the certification_Contact__c value for this Certification__c.
     * 
     * @return certification_Contact__c
     */
    public java.lang.String getCertification_Contact__c() {
        return certification_Contact__c;
    }


    /**
     * Sets the certification_Contact__c value for this Certification__c.
     * 
     * @param certification_Contact__c
     */
    public void setCertification_Contact__c(java.lang.String certification_Contact__c) {
        this.certification_Contact__c = certification_Contact__c;
    }


    /**
     * Gets the certification_Contact__r value for this Certification__c.
     * 
     * @return certification_Contact__r
     */
    public com.sforce.soap.enterprise.sobject.Certification_Contact__c getCertification_Contact__r() {
        return certification_Contact__r;
    }


    /**
     * Sets the certification_Contact__r value for this Certification__c.
     * 
     * @param certification_Contact__r
     */
    public void setCertification_Contact__r(com.sforce.soap.enterprise.sobject.Certification_Contact__c certification_Contact__r) {
        this.certification_Contact__r = certification_Contact__r;
    }


    /**
     * Gets the certification_Contacts__r value for this Certification__c.
     * 
     * @return certification_Contacts__r
     */
    public com.sforce.soap.enterprise.QueryResult getCertification_Contacts__r() {
        return certification_Contacts__r;
    }


    /**
     * Sets the certification_Contacts__r value for this Certification__c.
     * 
     * @param certification_Contacts__r
     */
    public void setCertification_Contacts__r(com.sforce.soap.enterprise.QueryResult certification_Contacts__r) {
        this.certification_Contacts__r = certification_Contacts__r;
    }


    /**
     * Gets the certification_Extension_Date__c value for this Certification__c.
     * 
     * @return certification_Extension_Date__c
     */
    public java.util.Date getCertification_Extension_Date__c() {
        return certification_Extension_Date__c;
    }


    /**
     * Sets the certification_Extension_Date__c value for this Certification__c.
     * 
     * @param certification_Extension_Date__c
     */
    public void setCertification_Extension_Date__c(java.util.Date certification_Extension_Date__c) {
        this.certification_Extension_Date__c = certification_Extension_Date__c;
    }


    /**
     * Gets the certification_Renewed__c value for this Certification__c.
     * 
     * @return certification_Renewed__c
     */
    public java.lang.Boolean getCertification_Renewed__c() {
        return certification_Renewed__c;
    }


    /**
     * Sets the certification_Renewed__c value for this Certification__c.
     * 
     * @param certification_Renewed__c
     */
    public void setCertification_Renewed__c(java.lang.Boolean certification_Renewed__c) {
        this.certification_Renewed__c = certification_Renewed__c;
    }


    /**
     * Gets the certification_Specializations__r value for this Certification__c.
     * 
     * @return certification_Specializations__r
     */
    public com.sforce.soap.enterprise.QueryResult getCertification_Specializations__r() {
        return certification_Specializations__r;
    }


    /**
     * Sets the certification_Specializations__r value for this Certification__c.
     * 
     * @param certification_Specializations__r
     */
    public void setCertification_Specializations__r(com.sforce.soap.enterprise.QueryResult certification_Specializations__r) {
        this.certification_Specializations__r = certification_Specializations__r;
    }


    /**
     * Gets the certification_Type__c value for this Certification__c.
     * 
     * @return certification_Type__c
     */
    public java.lang.String getCertification_Type__c() {
        return certification_Type__c;
    }


    /**
     * Sets the certification_Type__c value for this Certification__c.
     * 
     * @param certification_Type__c
     */
    public void setCertification_Type__c(java.lang.String certification_Type__c) {
        this.certification_Type__c = certification_Type__c;
    }


    /**
     * Gets the certification_Type__r value for this Certification__c.
     * 
     * @return certification_Type__r
     */
    public com.sforce.soap.enterprise.sobject.Certification_Type__c getCertification_Type__r() {
        return certification_Type__r;
    }


    /**
     * Sets the certification_Type__r value for this Certification__c.
     * 
     * @param certification_Type__r
     */
    public void setCertification_Type__r(com.sforce.soap.enterprise.sobject.Certification_Type__c certification_Type__r) {
        this.certification_Type__r = certification_Type__r;
    }


    /**
     * Gets the certified__c value for this Certification__c.
     * 
     * @return certified__c
     */
    public java.lang.String getCertified__c() {
        return certified__c;
    }


    /**
     * Sets the certified__c value for this Certification__c.
     * 
     * @param certified__c
     */
    public void setCertified__c(java.lang.String certified__c) {
        this.certified__c = certified__c;
    }


    /**
     * Gets the createdBy value for this Certification__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Certification__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Certification__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Certification__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Certification__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Certification__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the end_Date__c value for this Certification__c.
     * 
     * @return end_Date__c
     */
    public java.util.Date getEnd_Date__c() {
        return end_Date__c;
    }


    /**
     * Sets the end_Date__c value for this Certification__c.
     * 
     * @param end_Date__c
     */
    public void setEnd_Date__c(java.util.Date end_Date__c) {
        this.end_Date__c = end_Date__c;
    }


    /**
     * Gets the events value for this Certification__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Certification__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Certification__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Certification__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the histories value for this Certification__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Certification__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the isDeleted value for this Certification__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Certification__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastActivityDate value for this Certification__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Certification__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this Certification__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Certification__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Certification__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Certification__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Certification__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Certification__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the manual_Credits__c value for this Certification__c.
     * 
     * @return manual_Credits__c
     */
    public java.lang.Double getManual_Credits__c() {
        return manual_Credits__c;
    }


    /**
     * Sets the manual_Credits__c value for this Certification__c.
     * 
     * @param manual_Credits__c
     */
    public void setManual_Credits__c(java.lang.Double manual_Credits__c) {
        this.manual_Credits__c = manual_Credits__c;
    }


    /**
     * Gets the name value for this Certification__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Certification__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Certification__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Certification__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Certification__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Certification__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the number_of_Times_Renewed__c value for this Certification__c.
     * 
     * @return number_of_Times_Renewed__c
     */
    public java.lang.Double getNumber_of_Times_Renewed__c() {
        return number_of_Times_Renewed__c;
    }


    /**
     * Sets the number_of_Times_Renewed__c value for this Certification__c.
     * 
     * @param number_of_Times_Renewed__c
     */
    public void setNumber_of_Times_Renewed__c(java.lang.Double number_of_Times_Renewed__c) {
        this.number_of_Times_Renewed__c = number_of_Times_Renewed__c;
    }


    /**
     * Gets the openActivities value for this Certification__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this Certification__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the original_Certification_Date__c value for this Certification__c.
     * 
     * @return original_Certification_Date__c
     */
    public java.util.Date getOriginal_Certification_Date__c() {
        return original_Certification_Date__c;
    }


    /**
     * Sets the original_Certification_Date__c value for this Certification__c.
     * 
     * @param original_Certification_Date__c
     */
    public void setOriginal_Certification_Date__c(java.util.Date original_Certification_Date__c) {
        this.original_Certification_Date__c = original_Certification_Date__c;
    }


    /**
     * Gets the processInstances value for this Certification__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Certification__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Certification__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Certification__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the start_Date__c value for this Certification__c.
     * 
     * @return start_Date__c
     */
    public java.util.Date getStart_Date__c() {
        return start_Date__c;
    }


    /**
     * Sets the start_Date__c value for this Certification__c.
     * 
     * @param start_Date__c
     */
    public void setStart_Date__c(java.util.Date start_Date__c) {
        this.start_Date__c = start_Date__c;
    }


    /**
     * Gets the systemModstamp value for this Certification__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Certification__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this Certification__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Certification__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the total_RCA_Credits__c value for this Certification__c.
     * 
     * @return total_RCA_Credits__c
     */
    public java.lang.Double getTotal_RCA_Credits__c() {
        return total_RCA_Credits__c;
    }


    /**
     * Sets the total_RCA_Credits__c value for this Certification__c.
     * 
     * @param total_RCA_Credits__c
     */
    public void setTotal_RCA_Credits__c(java.lang.Double total_RCA_Credits__c) {
        this.total_RCA_Credits__c = total_RCA_Credits__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Certification__c)) return false;
        Certification__c other = (Certification__c) obj;
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
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.certification_Contact_Email_reference__c==null && other.getCertification_Contact_Email_reference__c()==null) || 
             (this.certification_Contact_Email_reference__c!=null &&
              this.certification_Contact_Email_reference__c.equals(other.getCertification_Contact_Email_reference__c()))) &&
            ((this.certification_Contact__c==null && other.getCertification_Contact__c()==null) || 
             (this.certification_Contact__c!=null &&
              this.certification_Contact__c.equals(other.getCertification_Contact__c()))) &&
            ((this.certification_Contact__r==null && other.getCertification_Contact__r()==null) || 
             (this.certification_Contact__r!=null &&
              this.certification_Contact__r.equals(other.getCertification_Contact__r()))) &&
            ((this.certification_Contacts__r==null && other.getCertification_Contacts__r()==null) || 
             (this.certification_Contacts__r!=null &&
              this.certification_Contacts__r.equals(other.getCertification_Contacts__r()))) &&
            ((this.certification_Extension_Date__c==null && other.getCertification_Extension_Date__c()==null) || 
             (this.certification_Extension_Date__c!=null &&
              this.certification_Extension_Date__c.equals(other.getCertification_Extension_Date__c()))) &&
            ((this.certification_Renewed__c==null && other.getCertification_Renewed__c()==null) || 
             (this.certification_Renewed__c!=null &&
              this.certification_Renewed__c.equals(other.getCertification_Renewed__c()))) &&
            ((this.certification_Specializations__r==null && other.getCertification_Specializations__r()==null) || 
             (this.certification_Specializations__r!=null &&
              this.certification_Specializations__r.equals(other.getCertification_Specializations__r()))) &&
            ((this.certification_Type__c==null && other.getCertification_Type__c()==null) || 
             (this.certification_Type__c!=null &&
              this.certification_Type__c.equals(other.getCertification_Type__c()))) &&
            ((this.certification_Type__r==null && other.getCertification_Type__r()==null) || 
             (this.certification_Type__r!=null &&
              this.certification_Type__r.equals(other.getCertification_Type__r()))) &&
            ((this.certified__c==null && other.getCertified__c()==null) || 
             (this.certified__c!=null &&
              this.certified__c.equals(other.getCertified__c()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.end_Date__c==null && other.getEnd_Date__c()==null) || 
             (this.end_Date__c!=null &&
              this.end_Date__c.equals(other.getEnd_Date__c()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              this.events.equals(other.getEvents()))) &&
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
            ((this.manual_Credits__c==null && other.getManual_Credits__c()==null) || 
             (this.manual_Credits__c!=null &&
              this.manual_Credits__c.equals(other.getManual_Credits__c()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.number_of_Times_Renewed__c==null && other.getNumber_of_Times_Renewed__c()==null) || 
             (this.number_of_Times_Renewed__c!=null &&
              this.number_of_Times_Renewed__c.equals(other.getNumber_of_Times_Renewed__c()))) &&
            ((this.openActivities==null && other.getOpenActivities()==null) || 
             (this.openActivities!=null &&
              this.openActivities.equals(other.getOpenActivities()))) &&
            ((this.original_Certification_Date__c==null && other.getOriginal_Certification_Date__c()==null) || 
             (this.original_Certification_Date__c!=null &&
              this.original_Certification_Date__c.equals(other.getOriginal_Certification_Date__c()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.start_Date__c==null && other.getStart_Date__c()==null) || 
             (this.start_Date__c!=null &&
              this.start_Date__c.equals(other.getStart_Date__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              this.tasks.equals(other.getTasks()))) &&
            ((this.total_RCA_Credits__c==null && other.getTotal_RCA_Credits__c()==null) || 
             (this.total_RCA_Credits__c!=null &&
              this.total_RCA_Credits__c.equals(other.getTotal_RCA_Credits__c())));
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
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getCertification_Contact_Email_reference__c() != null) {
            _hashCode += getCertification_Contact_Email_reference__c().hashCode();
        }
        if (getCertification_Contact__c() != null) {
            _hashCode += getCertification_Contact__c().hashCode();
        }
        if (getCertification_Contact__r() != null) {
            _hashCode += getCertification_Contact__r().hashCode();
        }
        if (getCertification_Contacts__r() != null) {
            _hashCode += getCertification_Contacts__r().hashCode();
        }
        if (getCertification_Extension_Date__c() != null) {
            _hashCode += getCertification_Extension_Date__c().hashCode();
        }
        if (getCertification_Renewed__c() != null) {
            _hashCode += getCertification_Renewed__c().hashCode();
        }
        if (getCertification_Specializations__r() != null) {
            _hashCode += getCertification_Specializations__r().hashCode();
        }
        if (getCertification_Type__c() != null) {
            _hashCode += getCertification_Type__c().hashCode();
        }
        if (getCertification_Type__r() != null) {
            _hashCode += getCertification_Type__r().hashCode();
        }
        if (getCertified__c() != null) {
            _hashCode += getCertified__c().hashCode();
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
        if (getEnd_Date__c() != null) {
            _hashCode += getEnd_Date__c().hashCode();
        }
        if (getEvents() != null) {
            _hashCode += getEvents().hashCode();
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
        if (getManual_Credits__c() != null) {
            _hashCode += getManual_Credits__c().hashCode();
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
        if (getNumber_of_Times_Renewed__c() != null) {
            _hashCode += getNumber_of_Times_Renewed__c().hashCode();
        }
        if (getOpenActivities() != null) {
            _hashCode += getOpenActivities().hashCode();
        }
        if (getOriginal_Certification_Date__c() != null) {
            _hashCode += getOriginal_Certification_Date__c().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getStart_Date__c() != null) {
            _hashCode += getStart_Date__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTasks() != null) {
            _hashCode += getTasks().hashCode();
        }
        if (getTotal_RCA_Credits__c() != null) {
            _hashCode += getTotal_RCA_Credits__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Certification__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certification__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("certification_Contact_Email_reference__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certification_Contact_Email_reference__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certification_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certification_Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certification_Contact__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certification_Contact__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certification_Contact__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certification_Contacts__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certification_Contacts__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certification_Extension_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certification_Extension_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certification_Renewed__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certification_Renewed__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("certification_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certification_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certification_Type__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certification_Type__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certification_Type__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certified__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certified__c"));
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
        elemField.setFieldName("end_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "End_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("manual_Credits__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Manual_Credits__c"));
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
        elemField.setFieldName("number_of_Times_Renewed__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Number_of_Times_Renewed__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("original_Certification_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Original_Certification_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("start_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Start_Date__c"));
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
        elemField.setFieldName("tasks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_RCA_Credits__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Total_RCA_Credits__c"));
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

/**
 * Unique_Users__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Unique_Users__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String account__c;

    private com.sforce.soap.enterprise.sobject.Account account__r;

    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private java.lang.Boolean administrative_Contact__c;

    private java.lang.String associated_Relativity_Case__c;

    private com.sforce.soap.enterprise.sobject.Relativity_Case__c associated_Relativity_Case__r;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private com.sforce.soap.enterprise.QueryResult events;

    private java.lang.Boolean excluded_User__c;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.String instance__c;

    private com.sforce.soap.enterprise.sobject.Instance__c instance__r;

    private java.lang.Boolean isDeleted;

    private java.lang.Boolean is_System_Admin__c;

    private java.util.Date lastActivityDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.util.Calendar last_Login__c;

    private java.lang.Boolean logged_In_This_Month__c;

    private java.lang.String name;

    private java.lang.Boolean notBillable__c;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private com.sforce.soap.enterprise.QueryResult openActivities;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.Double relativity_Cases__c;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    private java.lang.String transaction__c;

    private com.sforce.soap.enterprise.sobject.Transaction__c transaction__r;

    private java.util.Date usage_Date__c;

    private java.lang.String usage_Month__c;

    private java.lang.String usage_Year__c;

    private java.lang.Double user_Artifact_ID__c;

    private java.lang.Boolean uses_New_Data_Format__c;

    private java.lang.String year_Month__c;

    public Unique_Users__c() {
    }

    public Unique_Users__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String account__c,
           com.sforce.soap.enterprise.sobject.Account account__r,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           java.lang.Boolean administrative_Contact__c,
           java.lang.String associated_Relativity_Case__c,
           com.sforce.soap.enterprise.sobject.Relativity_Case__c associated_Relativity_Case__r,
           com.sforce.soap.enterprise.QueryResult attachments,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           com.sforce.soap.enterprise.QueryResult events,
           java.lang.Boolean excluded_User__c,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.String instance__c,
           com.sforce.soap.enterprise.sobject.Instance__c instance__r,
           java.lang.Boolean isDeleted,
           java.lang.Boolean is_System_Admin__c,
           java.util.Date lastActivityDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.util.Calendar last_Login__c,
           java.lang.Boolean logged_In_This_Month__c,
           java.lang.String name,
           java.lang.Boolean notBillable__c,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           com.sforce.soap.enterprise.QueryResult openActivities,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.Double relativity_Cases__c,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks,
           java.lang.String transaction__c,
           com.sforce.soap.enterprise.sobject.Transaction__c transaction__r,
           java.util.Date usage_Date__c,
           java.lang.String usage_Month__c,
           java.lang.String usage_Year__c,
           java.lang.Double user_Artifact_ID__c,
           java.lang.Boolean uses_New_Data_Format__c,
           java.lang.String year_Month__c) {
        super(
            fieldsToNull,
            id);
        this.account__c = account__c;
        this.account__r = account__r;
        this.activityHistories = activityHistories;
        this.administrative_Contact__c = administrative_Contact__c;
        this.associated_Relativity_Case__c = associated_Relativity_Case__c;
        this.associated_Relativity_Case__r = associated_Relativity_Case__r;
        this.attachments = attachments;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.events = events;
        this.excluded_User__c = excluded_User__c;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.histories = histories;
        this.instance__c = instance__c;
        this.instance__r = instance__r;
        this.isDeleted = isDeleted;
        this.is_System_Admin__c = is_System_Admin__c;
        this.lastActivityDate = lastActivityDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.last_Login__c = last_Login__c;
        this.logged_In_This_Month__c = logged_In_This_Month__c;
        this.name = name;
        this.notBillable__c = notBillable__c;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.openActivities = openActivities;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.relativity_Cases__c = relativity_Cases__c;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
        this.transaction__c = transaction__c;
        this.transaction__r = transaction__r;
        this.usage_Date__c = usage_Date__c;
        this.usage_Month__c = usage_Month__c;
        this.usage_Year__c = usage_Year__c;
        this.user_Artifact_ID__c = user_Artifact_ID__c;
        this.uses_New_Data_Format__c = uses_New_Data_Format__c;
        this.year_Month__c = year_Month__c;
    }


    /**
     * Gets the account__c value for this Unique_Users__c.
     * 
     * @return account__c
     */
    public java.lang.String getAccount__c() {
        return account__c;
    }


    /**
     * Sets the account__c value for this Unique_Users__c.
     * 
     * @param account__c
     */
    public void setAccount__c(java.lang.String account__c) {
        this.account__c = account__c;
    }


    /**
     * Gets the account__r value for this Unique_Users__c.
     * 
     * @return account__r
     */
    public com.sforce.soap.enterprise.sobject.Account getAccount__r() {
        return account__r;
    }


    /**
     * Sets the account__r value for this Unique_Users__c.
     * 
     * @param account__r
     */
    public void setAccount__r(com.sforce.soap.enterprise.sobject.Account account__r) {
        this.account__r = account__r;
    }


    /**
     * Gets the activityHistories value for this Unique_Users__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this Unique_Users__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the administrative_Contact__c value for this Unique_Users__c.
     * 
     * @return administrative_Contact__c
     */
    public java.lang.Boolean getAdministrative_Contact__c() {
        return administrative_Contact__c;
    }


    /**
     * Sets the administrative_Contact__c value for this Unique_Users__c.
     * 
     * @param administrative_Contact__c
     */
    public void setAdministrative_Contact__c(java.lang.Boolean administrative_Contact__c) {
        this.administrative_Contact__c = administrative_Contact__c;
    }


    /**
     * Gets the associated_Relativity_Case__c value for this Unique_Users__c.
     * 
     * @return associated_Relativity_Case__c
     */
    public java.lang.String getAssociated_Relativity_Case__c() {
        return associated_Relativity_Case__c;
    }


    /**
     * Sets the associated_Relativity_Case__c value for this Unique_Users__c.
     * 
     * @param associated_Relativity_Case__c
     */
    public void setAssociated_Relativity_Case__c(java.lang.String associated_Relativity_Case__c) {
        this.associated_Relativity_Case__c = associated_Relativity_Case__c;
    }


    /**
     * Gets the associated_Relativity_Case__r value for this Unique_Users__c.
     * 
     * @return associated_Relativity_Case__r
     */
    public com.sforce.soap.enterprise.sobject.Relativity_Case__c getAssociated_Relativity_Case__r() {
        return associated_Relativity_Case__r;
    }


    /**
     * Sets the associated_Relativity_Case__r value for this Unique_Users__c.
     * 
     * @param associated_Relativity_Case__r
     */
    public void setAssociated_Relativity_Case__r(com.sforce.soap.enterprise.sobject.Relativity_Case__c associated_Relativity_Case__r) {
        this.associated_Relativity_Case__r = associated_Relativity_Case__r;
    }


    /**
     * Gets the attachments value for this Unique_Users__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Unique_Users__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the createdBy value for this Unique_Users__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Unique_Users__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Unique_Users__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Unique_Users__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Unique_Users__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Unique_Users__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the events value for this Unique_Users__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Unique_Users__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the excluded_User__c value for this Unique_Users__c.
     * 
     * @return excluded_User__c
     */
    public java.lang.Boolean getExcluded_User__c() {
        return excluded_User__c;
    }


    /**
     * Sets the excluded_User__c value for this Unique_Users__c.
     * 
     * @param excluded_User__c
     */
    public void setExcluded_User__c(java.lang.Boolean excluded_User__c) {
        this.excluded_User__c = excluded_User__c;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Unique_Users__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Unique_Users__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the histories value for this Unique_Users__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Unique_Users__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the instance__c value for this Unique_Users__c.
     * 
     * @return instance__c
     */
    public java.lang.String getInstance__c() {
        return instance__c;
    }


    /**
     * Sets the instance__c value for this Unique_Users__c.
     * 
     * @param instance__c
     */
    public void setInstance__c(java.lang.String instance__c) {
        this.instance__c = instance__c;
    }


    /**
     * Gets the instance__r value for this Unique_Users__c.
     * 
     * @return instance__r
     */
    public com.sforce.soap.enterprise.sobject.Instance__c getInstance__r() {
        return instance__r;
    }


    /**
     * Sets the instance__r value for this Unique_Users__c.
     * 
     * @param instance__r
     */
    public void setInstance__r(com.sforce.soap.enterprise.sobject.Instance__c instance__r) {
        this.instance__r = instance__r;
    }


    /**
     * Gets the isDeleted value for this Unique_Users__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Unique_Users__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the is_System_Admin__c value for this Unique_Users__c.
     * 
     * @return is_System_Admin__c
     */
    public java.lang.Boolean getIs_System_Admin__c() {
        return is_System_Admin__c;
    }


    /**
     * Sets the is_System_Admin__c value for this Unique_Users__c.
     * 
     * @param is_System_Admin__c
     */
    public void setIs_System_Admin__c(java.lang.Boolean is_System_Admin__c) {
        this.is_System_Admin__c = is_System_Admin__c;
    }


    /**
     * Gets the lastActivityDate value for this Unique_Users__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Unique_Users__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this Unique_Users__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Unique_Users__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Unique_Users__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Unique_Users__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Unique_Users__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Unique_Users__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the last_Login__c value for this Unique_Users__c.
     * 
     * @return last_Login__c
     */
    public java.util.Calendar getLast_Login__c() {
        return last_Login__c;
    }


    /**
     * Sets the last_Login__c value for this Unique_Users__c.
     * 
     * @param last_Login__c
     */
    public void setLast_Login__c(java.util.Calendar last_Login__c) {
        this.last_Login__c = last_Login__c;
    }


    /**
     * Gets the logged_In_This_Month__c value for this Unique_Users__c.
     * 
     * @return logged_In_This_Month__c
     */
    public java.lang.Boolean getLogged_In_This_Month__c() {
        return logged_In_This_Month__c;
    }


    /**
     * Sets the logged_In_This_Month__c value for this Unique_Users__c.
     * 
     * @param logged_In_This_Month__c
     */
    public void setLogged_In_This_Month__c(java.lang.Boolean logged_In_This_Month__c) {
        this.logged_In_This_Month__c = logged_In_This_Month__c;
    }


    /**
     * Gets the name value for this Unique_Users__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Unique_Users__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notBillable__c value for this Unique_Users__c.
     * 
     * @return notBillable__c
     */
    public java.lang.Boolean getNotBillable__c() {
        return notBillable__c;
    }


    /**
     * Sets the notBillable__c value for this Unique_Users__c.
     * 
     * @param notBillable__c
     */
    public void setNotBillable__c(java.lang.Boolean notBillable__c) {
        this.notBillable__c = notBillable__c;
    }


    /**
     * Gets the notes value for this Unique_Users__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Unique_Users__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Unique_Users__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Unique_Users__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the openActivities value for this Unique_Users__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this Unique_Users__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the processInstances value for this Unique_Users__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Unique_Users__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Unique_Users__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Unique_Users__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the relativity_Cases__c value for this Unique_Users__c.
     * 
     * @return relativity_Cases__c
     */
    public java.lang.Double getRelativity_Cases__c() {
        return relativity_Cases__c;
    }


    /**
     * Sets the relativity_Cases__c value for this Unique_Users__c.
     * 
     * @param relativity_Cases__c
     */
    public void setRelativity_Cases__c(java.lang.Double relativity_Cases__c) {
        this.relativity_Cases__c = relativity_Cases__c;
    }


    /**
     * Gets the systemModstamp value for this Unique_Users__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Unique_Users__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this Unique_Users__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Unique_Users__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the transaction__c value for this Unique_Users__c.
     * 
     * @return transaction__c
     */
    public java.lang.String getTransaction__c() {
        return transaction__c;
    }


    /**
     * Sets the transaction__c value for this Unique_Users__c.
     * 
     * @param transaction__c
     */
    public void setTransaction__c(java.lang.String transaction__c) {
        this.transaction__c = transaction__c;
    }


    /**
     * Gets the transaction__r value for this Unique_Users__c.
     * 
     * @return transaction__r
     */
    public com.sforce.soap.enterprise.sobject.Transaction__c getTransaction__r() {
        return transaction__r;
    }


    /**
     * Sets the transaction__r value for this Unique_Users__c.
     * 
     * @param transaction__r
     */
    public void setTransaction__r(com.sforce.soap.enterprise.sobject.Transaction__c transaction__r) {
        this.transaction__r = transaction__r;
    }


    /**
     * Gets the usage_Date__c value for this Unique_Users__c.
     * 
     * @return usage_Date__c
     */
    public java.util.Date getUsage_Date__c() {
        return usage_Date__c;
    }


    /**
     * Sets the usage_Date__c value for this Unique_Users__c.
     * 
     * @param usage_Date__c
     */
    public void setUsage_Date__c(java.util.Date usage_Date__c) {
        this.usage_Date__c = usage_Date__c;
    }


    /**
     * Gets the usage_Month__c value for this Unique_Users__c.
     * 
     * @return usage_Month__c
     */
    public java.lang.String getUsage_Month__c() {
        return usage_Month__c;
    }


    /**
     * Sets the usage_Month__c value for this Unique_Users__c.
     * 
     * @param usage_Month__c
     */
    public void setUsage_Month__c(java.lang.String usage_Month__c) {
        this.usage_Month__c = usage_Month__c;
    }


    /**
     * Gets the usage_Year__c value for this Unique_Users__c.
     * 
     * @return usage_Year__c
     */
    public java.lang.String getUsage_Year__c() {
        return usage_Year__c;
    }


    /**
     * Sets the usage_Year__c value for this Unique_Users__c.
     * 
     * @param usage_Year__c
     */
    public void setUsage_Year__c(java.lang.String usage_Year__c) {
        this.usage_Year__c = usage_Year__c;
    }


    /**
     * Gets the user_Artifact_ID__c value for this Unique_Users__c.
     * 
     * @return user_Artifact_ID__c
     */
    public java.lang.Double getUser_Artifact_ID__c() {
        return user_Artifact_ID__c;
    }


    /**
     * Sets the user_Artifact_ID__c value for this Unique_Users__c.
     * 
     * @param user_Artifact_ID__c
     */
    public void setUser_Artifact_ID__c(java.lang.Double user_Artifact_ID__c) {
        this.user_Artifact_ID__c = user_Artifact_ID__c;
    }


    /**
     * Gets the uses_New_Data_Format__c value for this Unique_Users__c.
     * 
     * @return uses_New_Data_Format__c
     */
    public java.lang.Boolean getUses_New_Data_Format__c() {
        return uses_New_Data_Format__c;
    }


    /**
     * Sets the uses_New_Data_Format__c value for this Unique_Users__c.
     * 
     * @param uses_New_Data_Format__c
     */
    public void setUses_New_Data_Format__c(java.lang.Boolean uses_New_Data_Format__c) {
        this.uses_New_Data_Format__c = uses_New_Data_Format__c;
    }


    /**
     * Gets the year_Month__c value for this Unique_Users__c.
     * 
     * @return year_Month__c
     */
    public java.lang.String getYear_Month__c() {
        return year_Month__c;
    }


    /**
     * Sets the year_Month__c value for this Unique_Users__c.
     * 
     * @param year_Month__c
     */
    public void setYear_Month__c(java.lang.String year_Month__c) {
        this.year_Month__c = year_Month__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Unique_Users__c)) return false;
        Unique_Users__c other = (Unique_Users__c) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.account__c==null && other.getAccount__c()==null) || 
             (this.account__c!=null &&
              this.account__c.equals(other.getAccount__c()))) &&
            ((this.account__r==null && other.getAccount__r()==null) || 
             (this.account__r!=null &&
              this.account__r.equals(other.getAccount__r()))) &&
            ((this.activityHistories==null && other.getActivityHistories()==null) || 
             (this.activityHistories!=null &&
              this.activityHistories.equals(other.getActivityHistories()))) &&
            ((this.administrative_Contact__c==null && other.getAdministrative_Contact__c()==null) || 
             (this.administrative_Contact__c!=null &&
              this.administrative_Contact__c.equals(other.getAdministrative_Contact__c()))) &&
            ((this.associated_Relativity_Case__c==null && other.getAssociated_Relativity_Case__c()==null) || 
             (this.associated_Relativity_Case__c!=null &&
              this.associated_Relativity_Case__c.equals(other.getAssociated_Relativity_Case__c()))) &&
            ((this.associated_Relativity_Case__r==null && other.getAssociated_Relativity_Case__r()==null) || 
             (this.associated_Relativity_Case__r!=null &&
              this.associated_Relativity_Case__r.equals(other.getAssociated_Relativity_Case__r()))) &&
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
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              this.events.equals(other.getEvents()))) &&
            ((this.excluded_User__c==null && other.getExcluded_User__c()==null) || 
             (this.excluded_User__c!=null &&
              this.excluded_User__c.equals(other.getExcluded_User__c()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
            ((this.instance__c==null && other.getInstance__c()==null) || 
             (this.instance__c!=null &&
              this.instance__c.equals(other.getInstance__c()))) &&
            ((this.instance__r==null && other.getInstance__r()==null) || 
             (this.instance__r!=null &&
              this.instance__r.equals(other.getInstance__r()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.is_System_Admin__c==null && other.getIs_System_Admin__c()==null) || 
             (this.is_System_Admin__c!=null &&
              this.is_System_Admin__c.equals(other.getIs_System_Admin__c()))) &&
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
            ((this.last_Login__c==null && other.getLast_Login__c()==null) || 
             (this.last_Login__c!=null &&
              this.last_Login__c.equals(other.getLast_Login__c()))) &&
            ((this.logged_In_This_Month__c==null && other.getLogged_In_This_Month__c()==null) || 
             (this.logged_In_This_Month__c!=null &&
              this.logged_In_This_Month__c.equals(other.getLogged_In_This_Month__c()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.notBillable__c==null && other.getNotBillable__c()==null) || 
             (this.notBillable__c!=null &&
              this.notBillable__c.equals(other.getNotBillable__c()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.openActivities==null && other.getOpenActivities()==null) || 
             (this.openActivities!=null &&
              this.openActivities.equals(other.getOpenActivities()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.relativity_Cases__c==null && other.getRelativity_Cases__c()==null) || 
             (this.relativity_Cases__c!=null &&
              this.relativity_Cases__c.equals(other.getRelativity_Cases__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              this.tasks.equals(other.getTasks()))) &&
            ((this.transaction__c==null && other.getTransaction__c()==null) || 
             (this.transaction__c!=null &&
              this.transaction__c.equals(other.getTransaction__c()))) &&
            ((this.transaction__r==null && other.getTransaction__r()==null) || 
             (this.transaction__r!=null &&
              this.transaction__r.equals(other.getTransaction__r()))) &&
            ((this.usage_Date__c==null && other.getUsage_Date__c()==null) || 
             (this.usage_Date__c!=null &&
              this.usage_Date__c.equals(other.getUsage_Date__c()))) &&
            ((this.usage_Month__c==null && other.getUsage_Month__c()==null) || 
             (this.usage_Month__c!=null &&
              this.usage_Month__c.equals(other.getUsage_Month__c()))) &&
            ((this.usage_Year__c==null && other.getUsage_Year__c()==null) || 
             (this.usage_Year__c!=null &&
              this.usage_Year__c.equals(other.getUsage_Year__c()))) &&
            ((this.user_Artifact_ID__c==null && other.getUser_Artifact_ID__c()==null) || 
             (this.user_Artifact_ID__c!=null &&
              this.user_Artifact_ID__c.equals(other.getUser_Artifact_ID__c()))) &&
            ((this.uses_New_Data_Format__c==null && other.getUses_New_Data_Format__c()==null) || 
             (this.uses_New_Data_Format__c!=null &&
              this.uses_New_Data_Format__c.equals(other.getUses_New_Data_Format__c()))) &&
            ((this.year_Month__c==null && other.getYear_Month__c()==null) || 
             (this.year_Month__c!=null &&
              this.year_Month__c.equals(other.getYear_Month__c())));
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
        if (getAccount__c() != null) {
            _hashCode += getAccount__c().hashCode();
        }
        if (getAccount__r() != null) {
            _hashCode += getAccount__r().hashCode();
        }
        if (getActivityHistories() != null) {
            _hashCode += getActivityHistories().hashCode();
        }
        if (getAdministrative_Contact__c() != null) {
            _hashCode += getAdministrative_Contact__c().hashCode();
        }
        if (getAssociated_Relativity_Case__c() != null) {
            _hashCode += getAssociated_Relativity_Case__c().hashCode();
        }
        if (getAssociated_Relativity_Case__r() != null) {
            _hashCode += getAssociated_Relativity_Case__r().hashCode();
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
        if (getEvents() != null) {
            _hashCode += getEvents().hashCode();
        }
        if (getExcluded_User__c() != null) {
            _hashCode += getExcluded_User__c().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getHistories() != null) {
            _hashCode += getHistories().hashCode();
        }
        if (getInstance__c() != null) {
            _hashCode += getInstance__c().hashCode();
        }
        if (getInstance__r() != null) {
            _hashCode += getInstance__r().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getIs_System_Admin__c() != null) {
            _hashCode += getIs_System_Admin__c().hashCode();
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
        if (getLast_Login__c() != null) {
            _hashCode += getLast_Login__c().hashCode();
        }
        if (getLogged_In_This_Month__c() != null) {
            _hashCode += getLogged_In_This_Month__c().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNotBillable__c() != null) {
            _hashCode += getNotBillable__c().hashCode();
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
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getRelativity_Cases__c() != null) {
            _hashCode += getRelativity_Cases__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTasks() != null) {
            _hashCode += getTasks().hashCode();
        }
        if (getTransaction__c() != null) {
            _hashCode += getTransaction__c().hashCode();
        }
        if (getTransaction__r() != null) {
            _hashCode += getTransaction__r().hashCode();
        }
        if (getUsage_Date__c() != null) {
            _hashCode += getUsage_Date__c().hashCode();
        }
        if (getUsage_Month__c() != null) {
            _hashCode += getUsage_Month__c().hashCode();
        }
        if (getUsage_Year__c() != null) {
            _hashCode += getUsage_Year__c().hashCode();
        }
        if (getUser_Artifact_ID__c() != null) {
            _hashCode += getUser_Artifact_ID__c().hashCode();
        }
        if (getUses_New_Data_Format__c() != null) {
            _hashCode += getUses_New_Data_Format__c().hashCode();
        }
        if (getYear_Month__c() != null) {
            _hashCode += getYear_Month__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Unique_Users__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Unique_Users__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("administrative_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Administrative_Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associated_Relativity_Case__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Associated_Relativity_Case__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associated_Relativity_Case__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Associated_Relativity_Case__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relativity_Case__c"));
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
        elemField.setFieldName("events");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Events"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excluded_User__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Excluded_User__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("instance__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Instance__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instance__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Instance__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Instance__c"));
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
        elemField.setFieldName("is_System_Admin__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Is_System_Admin__c"));
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
        elemField.setFieldName("last_Login__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Last_Login__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logged_In_This_Month__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Logged_In_This_Month__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("notBillable__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NotBillable__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("relativity_Cases__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relativity_Cases__c"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaction__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Transaction__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaction__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Transaction__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Transaction__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usage_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Usage_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usage_Month__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Usage_Month__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usage_Year__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Usage_Year__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_Artifact_ID__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User_Artifact_ID__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uses_New_Data_Format__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Uses_New_Data_Format__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("year_Month__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Year_Month__c"));
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

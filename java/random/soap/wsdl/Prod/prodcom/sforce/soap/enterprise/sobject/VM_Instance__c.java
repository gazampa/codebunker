/**
 * VM_Instance__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class VM_Instance__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String access_for__c;

    private java.lang.String account__c;

    private com.sforce.soap.enterprise.sobject.Account account__r;

    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private java.lang.String additional_Software__c;

    private java.lang.String application_URL__c;

    private java.lang.String applications_Installed__c;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String backup_Policy__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String department__c;

    private java.lang.String domain__c;

    private java.lang.String EDDSADMINDBO_Password__c;

    private java.lang.String EDDSDBO_Password__c;

    private com.sforce.soap.enterprise.QueryResult events;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.lang.String friendly_Name__c;

    private java.lang.String HD_Space__c;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.String IP_Address__c;

    private java.lang.String IT_Installed_Apps__c;

    private java.lang.Boolean isDeleted;

    private java.lang.String justification__c;

    private java.util.Date lastActivityDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private java.lang.String notes__c;

    private java.lang.String OS__c;

    private com.sforce.soap.enterprise.QueryResult openActivities;

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.String processor__c;

    private java.lang.String purpose__c;

    private java.lang.String RAM__c;

    private java.lang.String relativity_Instance__c;

    private com.sforce.soap.enterprise.sobject.Instance__c relativity_Instance__r;

    private java.lang.String relativity_Ready__c;

    private java.lang.String relativity_Service_Account_Password__c;

    private java.lang.String relativity_Service_Account__c;

    private java.lang.String relativity_System_Admin_Account__c;

    private java.lang.String relativity_System_Admin_Password__c;

    private java.lang.String relativity_URL__c;

    private java.lang.String relativity_Version__c;

    private java.util.Date retention__c;

    private java.lang.String SA_Password__c;

    private java.lang.String status__c;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    private java.lang.Boolean VM_Hosted_on_Client_Site__c;

    private java.lang.String VM_Password__c;

    private java.lang.String VM_Username__c;

    public VM_Instance__c() {
    }

    public VM_Instance__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String access_for__c,
           java.lang.String account__c,
           com.sforce.soap.enterprise.sobject.Account account__r,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           java.lang.String additional_Software__c,
           java.lang.String application_URL__c,
           java.lang.String applications_Installed__c,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String backup_Policy__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String department__c,
           java.lang.String domain__c,
           java.lang.String EDDSADMINDBO_Password__c,
           java.lang.String EDDSDBO_Password__c,
           com.sforce.soap.enterprise.QueryResult events,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.lang.String friendly_Name__c,
           java.lang.String HD_Space__c,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.String IP_Address__c,
           java.lang.String IT_Installed_Apps__c,
           java.lang.Boolean isDeleted,
           java.lang.String justification__c,
           java.util.Date lastActivityDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           java.lang.String notes__c,
           java.lang.String OS__c,
           com.sforce.soap.enterprise.QueryResult openActivities,
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.String processor__c,
           java.lang.String purpose__c,
           java.lang.String RAM__c,
           java.lang.String relativity_Instance__c,
           com.sforce.soap.enterprise.sobject.Instance__c relativity_Instance__r,
           java.lang.String relativity_Ready__c,
           java.lang.String relativity_Service_Account_Password__c,
           java.lang.String relativity_Service_Account__c,
           java.lang.String relativity_System_Admin_Account__c,
           java.lang.String relativity_System_Admin_Password__c,
           java.lang.String relativity_URL__c,
           java.lang.String relativity_Version__c,
           java.util.Date retention__c,
           java.lang.String SA_Password__c,
           java.lang.String status__c,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks,
           java.lang.Boolean VM_Hosted_on_Client_Site__c,
           java.lang.String VM_Password__c,
           java.lang.String VM_Username__c) {
        super(
            fieldsToNull,
            id);
        this.access_for__c = access_for__c;
        this.account__c = account__c;
        this.account__r = account__r;
        this.activityHistories = activityHistories;
        this.additional_Software__c = additional_Software__c;
        this.application_URL__c = application_URL__c;
        this.applications_Installed__c = applications_Installed__c;
        this.attachments = attachments;
        this.backup_Policy__c = backup_Policy__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.department__c = department__c;
        this.domain__c = domain__c;
        this.EDDSADMINDBO_Password__c = EDDSADMINDBO_Password__c;
        this.EDDSDBO_Password__c = EDDSDBO_Password__c;
        this.events = events;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.friendly_Name__c = friendly_Name__c;
        this.HD_Space__c = HD_Space__c;
        this.histories = histories;
        this.IP_Address__c = IP_Address__c;
        this.IT_Installed_Apps__c = IT_Installed_Apps__c;
        this.isDeleted = isDeleted;
        this.justification__c = justification__c;
        this.lastActivityDate = lastActivityDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.notes__c = notes__c;
        this.OS__c = OS__c;
        this.openActivities = openActivities;
        this.owner = owner;
        this.ownerId = ownerId;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.processor__c = processor__c;
        this.purpose__c = purpose__c;
        this.RAM__c = RAM__c;
        this.relativity_Instance__c = relativity_Instance__c;
        this.relativity_Instance__r = relativity_Instance__r;
        this.relativity_Ready__c = relativity_Ready__c;
        this.relativity_Service_Account_Password__c = relativity_Service_Account_Password__c;
        this.relativity_Service_Account__c = relativity_Service_Account__c;
        this.relativity_System_Admin_Account__c = relativity_System_Admin_Account__c;
        this.relativity_System_Admin_Password__c = relativity_System_Admin_Password__c;
        this.relativity_URL__c = relativity_URL__c;
        this.relativity_Version__c = relativity_Version__c;
        this.retention__c = retention__c;
        this.SA_Password__c = SA_Password__c;
        this.status__c = status__c;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
        this.VM_Hosted_on_Client_Site__c = VM_Hosted_on_Client_Site__c;
        this.VM_Password__c = VM_Password__c;
        this.VM_Username__c = VM_Username__c;
    }


    /**
     * Gets the access_for__c value for this VM_Instance__c.
     * 
     * @return access_for__c
     */
    public java.lang.String getAccess_for__c() {
        return access_for__c;
    }


    /**
     * Sets the access_for__c value for this VM_Instance__c.
     * 
     * @param access_for__c
     */
    public void setAccess_for__c(java.lang.String access_for__c) {
        this.access_for__c = access_for__c;
    }


    /**
     * Gets the account__c value for this VM_Instance__c.
     * 
     * @return account__c
     */
    public java.lang.String getAccount__c() {
        return account__c;
    }


    /**
     * Sets the account__c value for this VM_Instance__c.
     * 
     * @param account__c
     */
    public void setAccount__c(java.lang.String account__c) {
        this.account__c = account__c;
    }


    /**
     * Gets the account__r value for this VM_Instance__c.
     * 
     * @return account__r
     */
    public com.sforce.soap.enterprise.sobject.Account getAccount__r() {
        return account__r;
    }


    /**
     * Sets the account__r value for this VM_Instance__c.
     * 
     * @param account__r
     */
    public void setAccount__r(com.sforce.soap.enterprise.sobject.Account account__r) {
        this.account__r = account__r;
    }


    /**
     * Gets the activityHistories value for this VM_Instance__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this VM_Instance__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the additional_Software__c value for this VM_Instance__c.
     * 
     * @return additional_Software__c
     */
    public java.lang.String getAdditional_Software__c() {
        return additional_Software__c;
    }


    /**
     * Sets the additional_Software__c value for this VM_Instance__c.
     * 
     * @param additional_Software__c
     */
    public void setAdditional_Software__c(java.lang.String additional_Software__c) {
        this.additional_Software__c = additional_Software__c;
    }


    /**
     * Gets the application_URL__c value for this VM_Instance__c.
     * 
     * @return application_URL__c
     */
    public java.lang.String getApplication_URL__c() {
        return application_URL__c;
    }


    /**
     * Sets the application_URL__c value for this VM_Instance__c.
     * 
     * @param application_URL__c
     */
    public void setApplication_URL__c(java.lang.String application_URL__c) {
        this.application_URL__c = application_URL__c;
    }


    /**
     * Gets the applications_Installed__c value for this VM_Instance__c.
     * 
     * @return applications_Installed__c
     */
    public java.lang.String getApplications_Installed__c() {
        return applications_Installed__c;
    }


    /**
     * Sets the applications_Installed__c value for this VM_Instance__c.
     * 
     * @param applications_Installed__c
     */
    public void setApplications_Installed__c(java.lang.String applications_Installed__c) {
        this.applications_Installed__c = applications_Installed__c;
    }


    /**
     * Gets the attachments value for this VM_Instance__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this VM_Instance__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the backup_Policy__c value for this VM_Instance__c.
     * 
     * @return backup_Policy__c
     */
    public java.lang.String getBackup_Policy__c() {
        return backup_Policy__c;
    }


    /**
     * Sets the backup_Policy__c value for this VM_Instance__c.
     * 
     * @param backup_Policy__c
     */
    public void setBackup_Policy__c(java.lang.String backup_Policy__c) {
        this.backup_Policy__c = backup_Policy__c;
    }


    /**
     * Gets the createdBy value for this VM_Instance__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this VM_Instance__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this VM_Instance__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this VM_Instance__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this VM_Instance__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this VM_Instance__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the department__c value for this VM_Instance__c.
     * 
     * @return department__c
     */
    public java.lang.String getDepartment__c() {
        return department__c;
    }


    /**
     * Sets the department__c value for this VM_Instance__c.
     * 
     * @param department__c
     */
    public void setDepartment__c(java.lang.String department__c) {
        this.department__c = department__c;
    }


    /**
     * Gets the domain__c value for this VM_Instance__c.
     * 
     * @return domain__c
     */
    public java.lang.String getDomain__c() {
        return domain__c;
    }


    /**
     * Sets the domain__c value for this VM_Instance__c.
     * 
     * @param domain__c
     */
    public void setDomain__c(java.lang.String domain__c) {
        this.domain__c = domain__c;
    }


    /**
     * Gets the EDDSADMINDBO_Password__c value for this VM_Instance__c.
     * 
     * @return EDDSADMINDBO_Password__c
     */
    public java.lang.String getEDDSADMINDBO_Password__c() {
        return EDDSADMINDBO_Password__c;
    }


    /**
     * Sets the EDDSADMINDBO_Password__c value for this VM_Instance__c.
     * 
     * @param EDDSADMINDBO_Password__c
     */
    public void setEDDSADMINDBO_Password__c(java.lang.String EDDSADMINDBO_Password__c) {
        this.EDDSADMINDBO_Password__c = EDDSADMINDBO_Password__c;
    }


    /**
     * Gets the EDDSDBO_Password__c value for this VM_Instance__c.
     * 
     * @return EDDSDBO_Password__c
     */
    public java.lang.String getEDDSDBO_Password__c() {
        return EDDSDBO_Password__c;
    }


    /**
     * Sets the EDDSDBO_Password__c value for this VM_Instance__c.
     * 
     * @param EDDSDBO_Password__c
     */
    public void setEDDSDBO_Password__c(java.lang.String EDDSDBO_Password__c) {
        this.EDDSDBO_Password__c = EDDSDBO_Password__c;
    }


    /**
     * Gets the events value for this VM_Instance__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this VM_Instance__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this VM_Instance__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this VM_Instance__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the friendly_Name__c value for this VM_Instance__c.
     * 
     * @return friendly_Name__c
     */
    public java.lang.String getFriendly_Name__c() {
        return friendly_Name__c;
    }


    /**
     * Sets the friendly_Name__c value for this VM_Instance__c.
     * 
     * @param friendly_Name__c
     */
    public void setFriendly_Name__c(java.lang.String friendly_Name__c) {
        this.friendly_Name__c = friendly_Name__c;
    }


    /**
     * Gets the HD_Space__c value for this VM_Instance__c.
     * 
     * @return HD_Space__c
     */
    public java.lang.String getHD_Space__c() {
        return HD_Space__c;
    }


    /**
     * Sets the HD_Space__c value for this VM_Instance__c.
     * 
     * @param HD_Space__c
     */
    public void setHD_Space__c(java.lang.String HD_Space__c) {
        this.HD_Space__c = HD_Space__c;
    }


    /**
     * Gets the histories value for this VM_Instance__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this VM_Instance__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the IP_Address__c value for this VM_Instance__c.
     * 
     * @return IP_Address__c
     */
    public java.lang.String getIP_Address__c() {
        return IP_Address__c;
    }


    /**
     * Sets the IP_Address__c value for this VM_Instance__c.
     * 
     * @param IP_Address__c
     */
    public void setIP_Address__c(java.lang.String IP_Address__c) {
        this.IP_Address__c = IP_Address__c;
    }


    /**
     * Gets the IT_Installed_Apps__c value for this VM_Instance__c.
     * 
     * @return IT_Installed_Apps__c
     */
    public java.lang.String getIT_Installed_Apps__c() {
        return IT_Installed_Apps__c;
    }


    /**
     * Sets the IT_Installed_Apps__c value for this VM_Instance__c.
     * 
     * @param IT_Installed_Apps__c
     */
    public void setIT_Installed_Apps__c(java.lang.String IT_Installed_Apps__c) {
        this.IT_Installed_Apps__c = IT_Installed_Apps__c;
    }


    /**
     * Gets the isDeleted value for this VM_Instance__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this VM_Instance__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the justification__c value for this VM_Instance__c.
     * 
     * @return justification__c
     */
    public java.lang.String getJustification__c() {
        return justification__c;
    }


    /**
     * Sets the justification__c value for this VM_Instance__c.
     * 
     * @param justification__c
     */
    public void setJustification__c(java.lang.String justification__c) {
        this.justification__c = justification__c;
    }


    /**
     * Gets the lastActivityDate value for this VM_Instance__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this VM_Instance__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this VM_Instance__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this VM_Instance__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this VM_Instance__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this VM_Instance__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this VM_Instance__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this VM_Instance__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this VM_Instance__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this VM_Instance__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this VM_Instance__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this VM_Instance__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this VM_Instance__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this VM_Instance__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the notes__c value for this VM_Instance__c.
     * 
     * @return notes__c
     */
    public java.lang.String getNotes__c() {
        return notes__c;
    }


    /**
     * Sets the notes__c value for this VM_Instance__c.
     * 
     * @param notes__c
     */
    public void setNotes__c(java.lang.String notes__c) {
        this.notes__c = notes__c;
    }


    /**
     * Gets the OS__c value for this VM_Instance__c.
     * 
     * @return OS__c
     */
    public java.lang.String getOS__c() {
        return OS__c;
    }


    /**
     * Sets the OS__c value for this VM_Instance__c.
     * 
     * @param OS__c
     */
    public void setOS__c(java.lang.String OS__c) {
        this.OS__c = OS__c;
    }


    /**
     * Gets the openActivities value for this VM_Instance__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this VM_Instance__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the owner value for this VM_Instance__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this VM_Instance__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this VM_Instance__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this VM_Instance__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this VM_Instance__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this VM_Instance__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this VM_Instance__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this VM_Instance__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the processor__c value for this VM_Instance__c.
     * 
     * @return processor__c
     */
    public java.lang.String getProcessor__c() {
        return processor__c;
    }


    /**
     * Sets the processor__c value for this VM_Instance__c.
     * 
     * @param processor__c
     */
    public void setProcessor__c(java.lang.String processor__c) {
        this.processor__c = processor__c;
    }


    /**
     * Gets the purpose__c value for this VM_Instance__c.
     * 
     * @return purpose__c
     */
    public java.lang.String getPurpose__c() {
        return purpose__c;
    }


    /**
     * Sets the purpose__c value for this VM_Instance__c.
     * 
     * @param purpose__c
     */
    public void setPurpose__c(java.lang.String purpose__c) {
        this.purpose__c = purpose__c;
    }


    /**
     * Gets the RAM__c value for this VM_Instance__c.
     * 
     * @return RAM__c
     */
    public java.lang.String getRAM__c() {
        return RAM__c;
    }


    /**
     * Sets the RAM__c value for this VM_Instance__c.
     * 
     * @param RAM__c
     */
    public void setRAM__c(java.lang.String RAM__c) {
        this.RAM__c = RAM__c;
    }


    /**
     * Gets the relativity_Instance__c value for this VM_Instance__c.
     * 
     * @return relativity_Instance__c
     */
    public java.lang.String getRelativity_Instance__c() {
        return relativity_Instance__c;
    }


    /**
     * Sets the relativity_Instance__c value for this VM_Instance__c.
     * 
     * @param relativity_Instance__c
     */
    public void setRelativity_Instance__c(java.lang.String relativity_Instance__c) {
        this.relativity_Instance__c = relativity_Instance__c;
    }


    /**
     * Gets the relativity_Instance__r value for this VM_Instance__c.
     * 
     * @return relativity_Instance__r
     */
    public com.sforce.soap.enterprise.sobject.Instance__c getRelativity_Instance__r() {
        return relativity_Instance__r;
    }


    /**
     * Sets the relativity_Instance__r value for this VM_Instance__c.
     * 
     * @param relativity_Instance__r
     */
    public void setRelativity_Instance__r(com.sforce.soap.enterprise.sobject.Instance__c relativity_Instance__r) {
        this.relativity_Instance__r = relativity_Instance__r;
    }


    /**
     * Gets the relativity_Ready__c value for this VM_Instance__c.
     * 
     * @return relativity_Ready__c
     */
    public java.lang.String getRelativity_Ready__c() {
        return relativity_Ready__c;
    }


    /**
     * Sets the relativity_Ready__c value for this VM_Instance__c.
     * 
     * @param relativity_Ready__c
     */
    public void setRelativity_Ready__c(java.lang.String relativity_Ready__c) {
        this.relativity_Ready__c = relativity_Ready__c;
    }


    /**
     * Gets the relativity_Service_Account_Password__c value for this VM_Instance__c.
     * 
     * @return relativity_Service_Account_Password__c
     */
    public java.lang.String getRelativity_Service_Account_Password__c() {
        return relativity_Service_Account_Password__c;
    }


    /**
     * Sets the relativity_Service_Account_Password__c value for this VM_Instance__c.
     * 
     * @param relativity_Service_Account_Password__c
     */
    public void setRelativity_Service_Account_Password__c(java.lang.String relativity_Service_Account_Password__c) {
        this.relativity_Service_Account_Password__c = relativity_Service_Account_Password__c;
    }


    /**
     * Gets the relativity_Service_Account__c value for this VM_Instance__c.
     * 
     * @return relativity_Service_Account__c
     */
    public java.lang.String getRelativity_Service_Account__c() {
        return relativity_Service_Account__c;
    }


    /**
     * Sets the relativity_Service_Account__c value for this VM_Instance__c.
     * 
     * @param relativity_Service_Account__c
     */
    public void setRelativity_Service_Account__c(java.lang.String relativity_Service_Account__c) {
        this.relativity_Service_Account__c = relativity_Service_Account__c;
    }


    /**
     * Gets the relativity_System_Admin_Account__c value for this VM_Instance__c.
     * 
     * @return relativity_System_Admin_Account__c
     */
    public java.lang.String getRelativity_System_Admin_Account__c() {
        return relativity_System_Admin_Account__c;
    }


    /**
     * Sets the relativity_System_Admin_Account__c value for this VM_Instance__c.
     * 
     * @param relativity_System_Admin_Account__c
     */
    public void setRelativity_System_Admin_Account__c(java.lang.String relativity_System_Admin_Account__c) {
        this.relativity_System_Admin_Account__c = relativity_System_Admin_Account__c;
    }


    /**
     * Gets the relativity_System_Admin_Password__c value for this VM_Instance__c.
     * 
     * @return relativity_System_Admin_Password__c
     */
    public java.lang.String getRelativity_System_Admin_Password__c() {
        return relativity_System_Admin_Password__c;
    }


    /**
     * Sets the relativity_System_Admin_Password__c value for this VM_Instance__c.
     * 
     * @param relativity_System_Admin_Password__c
     */
    public void setRelativity_System_Admin_Password__c(java.lang.String relativity_System_Admin_Password__c) {
        this.relativity_System_Admin_Password__c = relativity_System_Admin_Password__c;
    }


    /**
     * Gets the relativity_URL__c value for this VM_Instance__c.
     * 
     * @return relativity_URL__c
     */
    public java.lang.String getRelativity_URL__c() {
        return relativity_URL__c;
    }


    /**
     * Sets the relativity_URL__c value for this VM_Instance__c.
     * 
     * @param relativity_URL__c
     */
    public void setRelativity_URL__c(java.lang.String relativity_URL__c) {
        this.relativity_URL__c = relativity_URL__c;
    }


    /**
     * Gets the relativity_Version__c value for this VM_Instance__c.
     * 
     * @return relativity_Version__c
     */
    public java.lang.String getRelativity_Version__c() {
        return relativity_Version__c;
    }


    /**
     * Sets the relativity_Version__c value for this VM_Instance__c.
     * 
     * @param relativity_Version__c
     */
    public void setRelativity_Version__c(java.lang.String relativity_Version__c) {
        this.relativity_Version__c = relativity_Version__c;
    }


    /**
     * Gets the retention__c value for this VM_Instance__c.
     * 
     * @return retention__c
     */
    public java.util.Date getRetention__c() {
        return retention__c;
    }


    /**
     * Sets the retention__c value for this VM_Instance__c.
     * 
     * @param retention__c
     */
    public void setRetention__c(java.util.Date retention__c) {
        this.retention__c = retention__c;
    }


    /**
     * Gets the SA_Password__c value for this VM_Instance__c.
     * 
     * @return SA_Password__c
     */
    public java.lang.String getSA_Password__c() {
        return SA_Password__c;
    }


    /**
     * Sets the SA_Password__c value for this VM_Instance__c.
     * 
     * @param SA_Password__c
     */
    public void setSA_Password__c(java.lang.String SA_Password__c) {
        this.SA_Password__c = SA_Password__c;
    }


    /**
     * Gets the status__c value for this VM_Instance__c.
     * 
     * @return status__c
     */
    public java.lang.String getStatus__c() {
        return status__c;
    }


    /**
     * Sets the status__c value for this VM_Instance__c.
     * 
     * @param status__c
     */
    public void setStatus__c(java.lang.String status__c) {
        this.status__c = status__c;
    }


    /**
     * Gets the systemModstamp value for this VM_Instance__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this VM_Instance__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this VM_Instance__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this VM_Instance__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the VM_Hosted_on_Client_Site__c value for this VM_Instance__c.
     * 
     * @return VM_Hosted_on_Client_Site__c
     */
    public java.lang.Boolean getVM_Hosted_on_Client_Site__c() {
        return VM_Hosted_on_Client_Site__c;
    }


    /**
     * Sets the VM_Hosted_on_Client_Site__c value for this VM_Instance__c.
     * 
     * @param VM_Hosted_on_Client_Site__c
     */
    public void setVM_Hosted_on_Client_Site__c(java.lang.Boolean VM_Hosted_on_Client_Site__c) {
        this.VM_Hosted_on_Client_Site__c = VM_Hosted_on_Client_Site__c;
    }


    /**
     * Gets the VM_Password__c value for this VM_Instance__c.
     * 
     * @return VM_Password__c
     */
    public java.lang.String getVM_Password__c() {
        return VM_Password__c;
    }


    /**
     * Sets the VM_Password__c value for this VM_Instance__c.
     * 
     * @param VM_Password__c
     */
    public void setVM_Password__c(java.lang.String VM_Password__c) {
        this.VM_Password__c = VM_Password__c;
    }


    /**
     * Gets the VM_Username__c value for this VM_Instance__c.
     * 
     * @return VM_Username__c
     */
    public java.lang.String getVM_Username__c() {
        return VM_Username__c;
    }


    /**
     * Sets the VM_Username__c value for this VM_Instance__c.
     * 
     * @param VM_Username__c
     */
    public void setVM_Username__c(java.lang.String VM_Username__c) {
        this.VM_Username__c = VM_Username__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VM_Instance__c)) return false;
        VM_Instance__c other = (VM_Instance__c) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.access_for__c==null && other.getAccess_for__c()==null) || 
             (this.access_for__c!=null &&
              this.access_for__c.equals(other.getAccess_for__c()))) &&
            ((this.account__c==null && other.getAccount__c()==null) || 
             (this.account__c!=null &&
              this.account__c.equals(other.getAccount__c()))) &&
            ((this.account__r==null && other.getAccount__r()==null) || 
             (this.account__r!=null &&
              this.account__r.equals(other.getAccount__r()))) &&
            ((this.activityHistories==null && other.getActivityHistories()==null) || 
             (this.activityHistories!=null &&
              this.activityHistories.equals(other.getActivityHistories()))) &&
            ((this.additional_Software__c==null && other.getAdditional_Software__c()==null) || 
             (this.additional_Software__c!=null &&
              this.additional_Software__c.equals(other.getAdditional_Software__c()))) &&
            ((this.application_URL__c==null && other.getApplication_URL__c()==null) || 
             (this.application_URL__c!=null &&
              this.application_URL__c.equals(other.getApplication_URL__c()))) &&
            ((this.applications_Installed__c==null && other.getApplications_Installed__c()==null) || 
             (this.applications_Installed__c!=null &&
              this.applications_Installed__c.equals(other.getApplications_Installed__c()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.backup_Policy__c==null && other.getBackup_Policy__c()==null) || 
             (this.backup_Policy__c!=null &&
              this.backup_Policy__c.equals(other.getBackup_Policy__c()))) &&
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
            ((this.domain__c==null && other.getDomain__c()==null) || 
             (this.domain__c!=null &&
              this.domain__c.equals(other.getDomain__c()))) &&
            ((this.EDDSADMINDBO_Password__c==null && other.getEDDSADMINDBO_Password__c()==null) || 
             (this.EDDSADMINDBO_Password__c!=null &&
              this.EDDSADMINDBO_Password__c.equals(other.getEDDSADMINDBO_Password__c()))) &&
            ((this.EDDSDBO_Password__c==null && other.getEDDSDBO_Password__c()==null) || 
             (this.EDDSDBO_Password__c!=null &&
              this.EDDSDBO_Password__c.equals(other.getEDDSDBO_Password__c()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              this.events.equals(other.getEvents()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.friendly_Name__c==null && other.getFriendly_Name__c()==null) || 
             (this.friendly_Name__c!=null &&
              this.friendly_Name__c.equals(other.getFriendly_Name__c()))) &&
            ((this.HD_Space__c==null && other.getHD_Space__c()==null) || 
             (this.HD_Space__c!=null &&
              this.HD_Space__c.equals(other.getHD_Space__c()))) &&
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
            ((this.IP_Address__c==null && other.getIP_Address__c()==null) || 
             (this.IP_Address__c!=null &&
              this.IP_Address__c.equals(other.getIP_Address__c()))) &&
            ((this.IT_Installed_Apps__c==null && other.getIT_Installed_Apps__c()==null) || 
             (this.IT_Installed_Apps__c!=null &&
              this.IT_Installed_Apps__c.equals(other.getIT_Installed_Apps__c()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.justification__c==null && other.getJustification__c()==null) || 
             (this.justification__c!=null &&
              this.justification__c.equals(other.getJustification__c()))) &&
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
            ((this.notes__c==null && other.getNotes__c()==null) || 
             (this.notes__c!=null &&
              this.notes__c.equals(other.getNotes__c()))) &&
            ((this.OS__c==null && other.getOS__c()==null) || 
             (this.OS__c!=null &&
              this.OS__c.equals(other.getOS__c()))) &&
            ((this.openActivities==null && other.getOpenActivities()==null) || 
             (this.openActivities!=null &&
              this.openActivities.equals(other.getOpenActivities()))) &&
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
            ((this.processor__c==null && other.getProcessor__c()==null) || 
             (this.processor__c!=null &&
              this.processor__c.equals(other.getProcessor__c()))) &&
            ((this.purpose__c==null && other.getPurpose__c()==null) || 
             (this.purpose__c!=null &&
              this.purpose__c.equals(other.getPurpose__c()))) &&
            ((this.RAM__c==null && other.getRAM__c()==null) || 
             (this.RAM__c!=null &&
              this.RAM__c.equals(other.getRAM__c()))) &&
            ((this.relativity_Instance__c==null && other.getRelativity_Instance__c()==null) || 
             (this.relativity_Instance__c!=null &&
              this.relativity_Instance__c.equals(other.getRelativity_Instance__c()))) &&
            ((this.relativity_Instance__r==null && other.getRelativity_Instance__r()==null) || 
             (this.relativity_Instance__r!=null &&
              this.relativity_Instance__r.equals(other.getRelativity_Instance__r()))) &&
            ((this.relativity_Ready__c==null && other.getRelativity_Ready__c()==null) || 
             (this.relativity_Ready__c!=null &&
              this.relativity_Ready__c.equals(other.getRelativity_Ready__c()))) &&
            ((this.relativity_Service_Account_Password__c==null && other.getRelativity_Service_Account_Password__c()==null) || 
             (this.relativity_Service_Account_Password__c!=null &&
              this.relativity_Service_Account_Password__c.equals(other.getRelativity_Service_Account_Password__c()))) &&
            ((this.relativity_Service_Account__c==null && other.getRelativity_Service_Account__c()==null) || 
             (this.relativity_Service_Account__c!=null &&
              this.relativity_Service_Account__c.equals(other.getRelativity_Service_Account__c()))) &&
            ((this.relativity_System_Admin_Account__c==null && other.getRelativity_System_Admin_Account__c()==null) || 
             (this.relativity_System_Admin_Account__c!=null &&
              this.relativity_System_Admin_Account__c.equals(other.getRelativity_System_Admin_Account__c()))) &&
            ((this.relativity_System_Admin_Password__c==null && other.getRelativity_System_Admin_Password__c()==null) || 
             (this.relativity_System_Admin_Password__c!=null &&
              this.relativity_System_Admin_Password__c.equals(other.getRelativity_System_Admin_Password__c()))) &&
            ((this.relativity_URL__c==null && other.getRelativity_URL__c()==null) || 
             (this.relativity_URL__c!=null &&
              this.relativity_URL__c.equals(other.getRelativity_URL__c()))) &&
            ((this.relativity_Version__c==null && other.getRelativity_Version__c()==null) || 
             (this.relativity_Version__c!=null &&
              this.relativity_Version__c.equals(other.getRelativity_Version__c()))) &&
            ((this.retention__c==null && other.getRetention__c()==null) || 
             (this.retention__c!=null &&
              this.retention__c.equals(other.getRetention__c()))) &&
            ((this.SA_Password__c==null && other.getSA_Password__c()==null) || 
             (this.SA_Password__c!=null &&
              this.SA_Password__c.equals(other.getSA_Password__c()))) &&
            ((this.status__c==null && other.getStatus__c()==null) || 
             (this.status__c!=null &&
              this.status__c.equals(other.getStatus__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              this.tasks.equals(other.getTasks()))) &&
            ((this.VM_Hosted_on_Client_Site__c==null && other.getVM_Hosted_on_Client_Site__c()==null) || 
             (this.VM_Hosted_on_Client_Site__c!=null &&
              this.VM_Hosted_on_Client_Site__c.equals(other.getVM_Hosted_on_Client_Site__c()))) &&
            ((this.VM_Password__c==null && other.getVM_Password__c()==null) || 
             (this.VM_Password__c!=null &&
              this.VM_Password__c.equals(other.getVM_Password__c()))) &&
            ((this.VM_Username__c==null && other.getVM_Username__c()==null) || 
             (this.VM_Username__c!=null &&
              this.VM_Username__c.equals(other.getVM_Username__c())));
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
        if (getAccess_for__c() != null) {
            _hashCode += getAccess_for__c().hashCode();
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
        if (getAdditional_Software__c() != null) {
            _hashCode += getAdditional_Software__c().hashCode();
        }
        if (getApplication_URL__c() != null) {
            _hashCode += getApplication_URL__c().hashCode();
        }
        if (getApplications_Installed__c() != null) {
            _hashCode += getApplications_Installed__c().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getBackup_Policy__c() != null) {
            _hashCode += getBackup_Policy__c().hashCode();
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
        if (getDomain__c() != null) {
            _hashCode += getDomain__c().hashCode();
        }
        if (getEDDSADMINDBO_Password__c() != null) {
            _hashCode += getEDDSADMINDBO_Password__c().hashCode();
        }
        if (getEDDSDBO_Password__c() != null) {
            _hashCode += getEDDSDBO_Password__c().hashCode();
        }
        if (getEvents() != null) {
            _hashCode += getEvents().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getFriendly_Name__c() != null) {
            _hashCode += getFriendly_Name__c().hashCode();
        }
        if (getHD_Space__c() != null) {
            _hashCode += getHD_Space__c().hashCode();
        }
        if (getHistories() != null) {
            _hashCode += getHistories().hashCode();
        }
        if (getIP_Address__c() != null) {
            _hashCode += getIP_Address__c().hashCode();
        }
        if (getIT_Installed_Apps__c() != null) {
            _hashCode += getIT_Installed_Apps__c().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getJustification__c() != null) {
            _hashCode += getJustification__c().hashCode();
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
        if (getNotes__c() != null) {
            _hashCode += getNotes__c().hashCode();
        }
        if (getOS__c() != null) {
            _hashCode += getOS__c().hashCode();
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
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getProcessor__c() != null) {
            _hashCode += getProcessor__c().hashCode();
        }
        if (getPurpose__c() != null) {
            _hashCode += getPurpose__c().hashCode();
        }
        if (getRAM__c() != null) {
            _hashCode += getRAM__c().hashCode();
        }
        if (getRelativity_Instance__c() != null) {
            _hashCode += getRelativity_Instance__c().hashCode();
        }
        if (getRelativity_Instance__r() != null) {
            _hashCode += getRelativity_Instance__r().hashCode();
        }
        if (getRelativity_Ready__c() != null) {
            _hashCode += getRelativity_Ready__c().hashCode();
        }
        if (getRelativity_Service_Account_Password__c() != null) {
            _hashCode += getRelativity_Service_Account_Password__c().hashCode();
        }
        if (getRelativity_Service_Account__c() != null) {
            _hashCode += getRelativity_Service_Account__c().hashCode();
        }
        if (getRelativity_System_Admin_Account__c() != null) {
            _hashCode += getRelativity_System_Admin_Account__c().hashCode();
        }
        if (getRelativity_System_Admin_Password__c() != null) {
            _hashCode += getRelativity_System_Admin_Password__c().hashCode();
        }
        if (getRelativity_URL__c() != null) {
            _hashCode += getRelativity_URL__c().hashCode();
        }
        if (getRelativity_Version__c() != null) {
            _hashCode += getRelativity_Version__c().hashCode();
        }
        if (getRetention__c() != null) {
            _hashCode += getRetention__c().hashCode();
        }
        if (getSA_Password__c() != null) {
            _hashCode += getSA_Password__c().hashCode();
        }
        if (getStatus__c() != null) {
            _hashCode += getStatus__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTasks() != null) {
            _hashCode += getTasks().hashCode();
        }
        if (getVM_Hosted_on_Client_Site__c() != null) {
            _hashCode += getVM_Hosted_on_Client_Site__c().hashCode();
        }
        if (getVM_Password__c() != null) {
            _hashCode += getVM_Password__c().hashCode();
        }
        if (getVM_Username__c() != null) {
            _hashCode += getVM_Username__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VM_Instance__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "VM_Instance__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("access_for__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Access_for__c"));
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
        elemField.setFieldName("additional_Software__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Additional_Software__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("application_URL__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Application_URL__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applications_Installed__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Applications_Installed__c"));
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
        elemField.setFieldName("backup_Policy__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Backup_Policy__c"));
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
        elemField.setFieldName("domain__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Domain__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EDDSADMINDBO_Password__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EDDSADMINDBO_Password__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EDDSDBO_Password__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EDDSDBO_Password__c"));
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
        elemField.setFieldName("feedSubscriptionsForEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedSubscriptionsForEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("friendly_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Friendly_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HD_Space__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HD_Space__c"));
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
        elemField.setFieldName("IP_Address__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IP_Address__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IT_Installed_Apps__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IT_Installed_Apps__c"));
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
        elemField.setFieldName("justification__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Justification__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("notes__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Notes__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OS__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OS__c"));
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
        elemField.setFieldName("processor__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Processor__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purpose__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Purpose__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RAM__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RAM__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relativity_Instance__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relativity_Instance__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relativity_Instance__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relativity_Instance__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Instance__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relativity_Ready__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relativity_Ready__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relativity_Service_Account_Password__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relativity_Service_Account_Password__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relativity_Service_Account__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relativity_Service_Account__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relativity_System_Admin_Account__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relativity_System_Admin_Account__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relativity_System_Admin_Password__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relativity_System_Admin_Password__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relativity_URL__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relativity_URL__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("retention__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Retention__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SA_Password__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SA_Password__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("VM_Hosted_on_Client_Site__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "VM_Hosted_on_Client_Site__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VM_Password__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "VM_Password__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VM_Username__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "VM_Username__c"));
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

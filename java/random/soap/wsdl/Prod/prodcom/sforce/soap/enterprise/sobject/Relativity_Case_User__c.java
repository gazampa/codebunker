/**
 * Relativity_Case_User__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Relativity_Case_User__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.Boolean administrative_Contact__c;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String case_User_ID__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.util.Calendar date_Time_of_Job_Run__c;

    private java.lang.String domain_Match__c;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.lang.Boolean flag__c;

    private java.lang.Boolean isDeleted;

    private java.lang.Boolean isSystemAdmin__c;

    private java.lang.Boolean is_Excluded_User__c;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.util.Calendar last_Login__c;

    private java.lang.Boolean logged_In_This_Month__c;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private java.lang.String original_Email_Address__c;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.util.Calendar systemModstamp;

    private java.lang.String usage_ID__c;

    private com.sforce.soap.enterprise.sobject.Usage_Data__c usage_ID__r;

    private java.lang.Double user_Artifact_ID__c;

    private java.lang.Boolean uses_New_Data_Format__c;

    private java.lang.String email_domain__c;

    private java.lang.Boolean replace_username_with_hash_value__c;

    public Relativity_Case_User__c() {
    }

    public Relativity_Case_User__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.Boolean administrative_Contact__c,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String case_User_ID__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.util.Calendar date_Time_of_Job_Run__c,
           java.lang.String domain_Match__c,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.lang.Boolean flag__c,
           java.lang.Boolean isDeleted,
           java.lang.Boolean isSystemAdmin__c,
           java.lang.Boolean is_Excluded_User__c,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.util.Calendar last_Login__c,
           java.lang.Boolean logged_In_This_Month__c,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           java.lang.String original_Email_Address__c,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.util.Calendar systemModstamp,
           java.lang.String usage_ID__c,
           com.sforce.soap.enterprise.sobject.Usage_Data__c usage_ID__r,
           java.lang.Double user_Artifact_ID__c,
           java.lang.Boolean uses_New_Data_Format__c,
           java.lang.String email_domain__c,
           java.lang.Boolean replace_username_with_hash_value__c) {
        super(
            fieldsToNull,
            id);
        this.administrative_Contact__c = administrative_Contact__c;
        this.attachments = attachments;
        this.case_User_ID__c = case_User_ID__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.date_Time_of_Job_Run__c = date_Time_of_Job_Run__c;
        this.domain_Match__c = domain_Match__c;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.flag__c = flag__c;
        this.isDeleted = isDeleted;
        this.isSystemAdmin__c = isSystemAdmin__c;
        this.is_Excluded_User__c = is_Excluded_User__c;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.last_Login__c = last_Login__c;
        this.logged_In_This_Month__c = logged_In_This_Month__c;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.original_Email_Address__c = original_Email_Address__c;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.systemModstamp = systemModstamp;
        this.usage_ID__c = usage_ID__c;
        this.usage_ID__r = usage_ID__r;
        this.user_Artifact_ID__c = user_Artifact_ID__c;
        this.uses_New_Data_Format__c = uses_New_Data_Format__c;
        this.email_domain__c = email_domain__c;
        this.replace_username_with_hash_value__c = replace_username_with_hash_value__c;
    }


    /**
     * Gets the administrative_Contact__c value for this Relativity_Case_User__c.
     * 
     * @return administrative_Contact__c
     */
    public java.lang.Boolean getAdministrative_Contact__c() {
        return administrative_Contact__c;
    }


    /**
     * Sets the administrative_Contact__c value for this Relativity_Case_User__c.
     * 
     * @param administrative_Contact__c
     */
    public void setAdministrative_Contact__c(java.lang.Boolean administrative_Contact__c) {
        this.administrative_Contact__c = administrative_Contact__c;
    }


    /**
     * Gets the attachments value for this Relativity_Case_User__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Relativity_Case_User__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the case_User_ID__c value for this Relativity_Case_User__c.
     * 
     * @return case_User_ID__c
     */
    public java.lang.String getCase_User_ID__c() {
        return case_User_ID__c;
    }


    /**
     * Sets the case_User_ID__c value for this Relativity_Case_User__c.
     * 
     * @param case_User_ID__c
     */
    public void setCase_User_ID__c(java.lang.String case_User_ID__c) {
        this.case_User_ID__c = case_User_ID__c;
    }


    /**
     * Gets the createdBy value for this Relativity_Case_User__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Relativity_Case_User__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Relativity_Case_User__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Relativity_Case_User__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Relativity_Case_User__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Relativity_Case_User__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the date_Time_of_Job_Run__c value for this Relativity_Case_User__c.
     * 
     * @return date_Time_of_Job_Run__c
     */
    public java.util.Calendar getDate_Time_of_Job_Run__c() {
        return date_Time_of_Job_Run__c;
    }


    /**
     * Sets the date_Time_of_Job_Run__c value for this Relativity_Case_User__c.
     * 
     * @param date_Time_of_Job_Run__c
     */
    public void setDate_Time_of_Job_Run__c(java.util.Calendar date_Time_of_Job_Run__c) {
        this.date_Time_of_Job_Run__c = date_Time_of_Job_Run__c;
    }


    /**
     * Gets the domain_Match__c value for this Relativity_Case_User__c.
     * 
     * @return domain_Match__c
     */
    public java.lang.String getDomain_Match__c() {
        return domain_Match__c;
    }


    /**
     * Sets the domain_Match__c value for this Relativity_Case_User__c.
     * 
     * @param domain_Match__c
     */
    public void setDomain_Match__c(java.lang.String domain_Match__c) {
        this.domain_Match__c = domain_Match__c;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Relativity_Case_User__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Relativity_Case_User__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the flag__c value for this Relativity_Case_User__c.
     * 
     * @return flag__c
     */
    public java.lang.Boolean getFlag__c() {
        return flag__c;
    }


    /**
     * Sets the flag__c value for this Relativity_Case_User__c.
     * 
     * @param flag__c
     */
    public void setFlag__c(java.lang.Boolean flag__c) {
        this.flag__c = flag__c;
    }


    /**
     * Gets the isDeleted value for this Relativity_Case_User__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Relativity_Case_User__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the isSystemAdmin__c value for this Relativity_Case_User__c.
     * 
     * @return isSystemAdmin__c
     */
    public java.lang.Boolean getIsSystemAdmin__c() {
        return isSystemAdmin__c;
    }


    /**
     * Sets the isSystemAdmin__c value for this Relativity_Case_User__c.
     * 
     * @param isSystemAdmin__c
     */
    public void setIsSystemAdmin__c(java.lang.Boolean isSystemAdmin__c) {
        this.isSystemAdmin__c = isSystemAdmin__c;
    }


    /**
     * Gets the is_Excluded_User__c value for this Relativity_Case_User__c.
     * 
     * @return is_Excluded_User__c
     */
    public java.lang.Boolean getIs_Excluded_User__c() {
        return is_Excluded_User__c;
    }


    /**
     * Sets the is_Excluded_User__c value for this Relativity_Case_User__c.
     * 
     * @param is_Excluded_User__c
     */
    public void setIs_Excluded_User__c(java.lang.Boolean is_Excluded_User__c) {
        this.is_Excluded_User__c = is_Excluded_User__c;
    }


    /**
     * Gets the lastModifiedBy value for this Relativity_Case_User__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Relativity_Case_User__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Relativity_Case_User__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Relativity_Case_User__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Relativity_Case_User__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Relativity_Case_User__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the last_Login__c value for this Relativity_Case_User__c.
     * 
     * @return last_Login__c
     */
    public java.util.Calendar getLast_Login__c() {
        return last_Login__c;
    }


    /**
     * Sets the last_Login__c value for this Relativity_Case_User__c.
     * 
     * @param last_Login__c
     */
    public void setLast_Login__c(java.util.Calendar last_Login__c) {
        this.last_Login__c = last_Login__c;
    }


    /**
     * Gets the logged_In_This_Month__c value for this Relativity_Case_User__c.
     * 
     * @return logged_In_This_Month__c
     */
    public java.lang.Boolean getLogged_In_This_Month__c() {
        return logged_In_This_Month__c;
    }


    /**
     * Sets the logged_In_This_Month__c value for this Relativity_Case_User__c.
     * 
     * @param logged_In_This_Month__c
     */
    public void setLogged_In_This_Month__c(java.lang.Boolean logged_In_This_Month__c) {
        this.logged_In_This_Month__c = logged_In_This_Month__c;
    }


    /**
     * Gets the name value for this Relativity_Case_User__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Relativity_Case_User__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Relativity_Case_User__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Relativity_Case_User__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Relativity_Case_User__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Relativity_Case_User__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the original_Email_Address__c value for this Relativity_Case_User__c.
     * 
     * @return original_Email_Address__c
     */
    public java.lang.String getOriginal_Email_Address__c() {
        return original_Email_Address__c;
    }


    /**
     * Sets the original_Email_Address__c value for this Relativity_Case_User__c.
     * 
     * @param original_Email_Address__c
     */
    public void setOriginal_Email_Address__c(java.lang.String original_Email_Address__c) {
        this.original_Email_Address__c = original_Email_Address__c;
    }


    /**
     * Gets the processInstances value for this Relativity_Case_User__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Relativity_Case_User__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Relativity_Case_User__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Relativity_Case_User__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the systemModstamp value for this Relativity_Case_User__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Relativity_Case_User__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the usage_ID__c value for this Relativity_Case_User__c.
     * 
     * @return usage_ID__c
     */
    public java.lang.String getUsage_ID__c() {
        return usage_ID__c;
    }


    /**
     * Sets the usage_ID__c value for this Relativity_Case_User__c.
     * 
     * @param usage_ID__c
     */
    public void setUsage_ID__c(java.lang.String usage_ID__c) {
        this.usage_ID__c = usage_ID__c;
    }


    /**
     * Gets the usage_ID__r value for this Relativity_Case_User__c.
     * 
     * @return usage_ID__r
     */
    public com.sforce.soap.enterprise.sobject.Usage_Data__c getUsage_ID__r() {
        return usage_ID__r;
    }


    /**
     * Sets the usage_ID__r value for this Relativity_Case_User__c.
     * 
     * @param usage_ID__r
     */
    public void setUsage_ID__r(com.sforce.soap.enterprise.sobject.Usage_Data__c usage_ID__r) {
        this.usage_ID__r = usage_ID__r;
    }


    /**
     * Gets the user_Artifact_ID__c value for this Relativity_Case_User__c.
     * 
     * @return user_Artifact_ID__c
     */
    public java.lang.Double getUser_Artifact_ID__c() {
        return user_Artifact_ID__c;
    }


    /**
     * Sets the user_Artifact_ID__c value for this Relativity_Case_User__c.
     * 
     * @param user_Artifact_ID__c
     */
    public void setUser_Artifact_ID__c(java.lang.Double user_Artifact_ID__c) {
        this.user_Artifact_ID__c = user_Artifact_ID__c;
    }


    /**
     * Gets the uses_New_Data_Format__c value for this Relativity_Case_User__c.
     * 
     * @return uses_New_Data_Format__c
     */
    public java.lang.Boolean getUses_New_Data_Format__c() {
        return uses_New_Data_Format__c;
    }


    /**
     * Sets the uses_New_Data_Format__c value for this Relativity_Case_User__c.
     * 
     * @param uses_New_Data_Format__c
     */
    public void setUses_New_Data_Format__c(java.lang.Boolean uses_New_Data_Format__c) {
        this.uses_New_Data_Format__c = uses_New_Data_Format__c;
    }


    /**
     * Gets the email_domain__c value for this Relativity_Case_User__c.
     * 
     * @return email_domain__c
     */
    public java.lang.String getEmail_domain__c() {
        return email_domain__c;
    }


    /**
     * Sets the email_domain__c value for this Relativity_Case_User__c.
     * 
     * @param email_domain__c
     */
    public void setEmail_domain__c(java.lang.String email_domain__c) {
        this.email_domain__c = email_domain__c;
    }


    /**
     * Gets the replace_username_with_hash_value__c value for this Relativity_Case_User__c.
     * 
     * @return replace_username_with_hash_value__c
     */
    public java.lang.Boolean getReplace_username_with_hash_value__c() {
        return replace_username_with_hash_value__c;
    }


    /**
     * Sets the replace_username_with_hash_value__c value for this Relativity_Case_User__c.
     * 
     * @param replace_username_with_hash_value__c
     */
    public void setReplace_username_with_hash_value__c(java.lang.Boolean replace_username_with_hash_value__c) {
        this.replace_username_with_hash_value__c = replace_username_with_hash_value__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Relativity_Case_User__c)) return false;
        Relativity_Case_User__c other = (Relativity_Case_User__c) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.administrative_Contact__c==null && other.getAdministrative_Contact__c()==null) || 
             (this.administrative_Contact__c!=null &&
              this.administrative_Contact__c.equals(other.getAdministrative_Contact__c()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.case_User_ID__c==null && other.getCase_User_ID__c()==null) || 
             (this.case_User_ID__c!=null &&
              this.case_User_ID__c.equals(other.getCase_User_ID__c()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.date_Time_of_Job_Run__c==null && other.getDate_Time_of_Job_Run__c()==null) || 
             (this.date_Time_of_Job_Run__c!=null &&
              this.date_Time_of_Job_Run__c.equals(other.getDate_Time_of_Job_Run__c()))) &&
            ((this.domain_Match__c==null && other.getDomain_Match__c()==null) || 
             (this.domain_Match__c!=null &&
              this.domain_Match__c.equals(other.getDomain_Match__c()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.flag__c==null && other.getFlag__c()==null) || 
             (this.flag__c!=null &&
              this.flag__c.equals(other.getFlag__c()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.isSystemAdmin__c==null && other.getIsSystemAdmin__c()==null) || 
             (this.isSystemAdmin__c!=null &&
              this.isSystemAdmin__c.equals(other.getIsSystemAdmin__c()))) &&
            ((this.is_Excluded_User__c==null && other.getIs_Excluded_User__c()==null) || 
             (this.is_Excluded_User__c!=null &&
              this.is_Excluded_User__c.equals(other.getIs_Excluded_User__c()))) &&
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
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.original_Email_Address__c==null && other.getOriginal_Email_Address__c()==null) || 
             (this.original_Email_Address__c!=null &&
              this.original_Email_Address__c.equals(other.getOriginal_Email_Address__c()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.usage_ID__c==null && other.getUsage_ID__c()==null) || 
             (this.usage_ID__c!=null &&
              this.usage_ID__c.equals(other.getUsage_ID__c()))) &&
            ((this.usage_ID__r==null && other.getUsage_ID__r()==null) || 
             (this.usage_ID__r!=null &&
              this.usage_ID__r.equals(other.getUsage_ID__r()))) &&
            ((this.user_Artifact_ID__c==null && other.getUser_Artifact_ID__c()==null) || 
             (this.user_Artifact_ID__c!=null &&
              this.user_Artifact_ID__c.equals(other.getUser_Artifact_ID__c()))) &&
            ((this.uses_New_Data_Format__c==null && other.getUses_New_Data_Format__c()==null) || 
             (this.uses_New_Data_Format__c!=null &&
              this.uses_New_Data_Format__c.equals(other.getUses_New_Data_Format__c()))) &&
            ((this.email_domain__c==null && other.getEmail_domain__c()==null) || 
             (this.email_domain__c!=null &&
              this.email_domain__c.equals(other.getEmail_domain__c()))) &&
            ((this.replace_username_with_hash_value__c==null && other.getReplace_username_with_hash_value__c()==null) || 
             (this.replace_username_with_hash_value__c!=null &&
              this.replace_username_with_hash_value__c.equals(other.getReplace_username_with_hash_value__c())));
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
        if (getAdministrative_Contact__c() != null) {
            _hashCode += getAdministrative_Contact__c().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getCase_User_ID__c() != null) {
            _hashCode += getCase_User_ID__c().hashCode();
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
        if (getDate_Time_of_Job_Run__c() != null) {
            _hashCode += getDate_Time_of_Job_Run__c().hashCode();
        }
        if (getDomain_Match__c() != null) {
            _hashCode += getDomain_Match__c().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getFlag__c() != null) {
            _hashCode += getFlag__c().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getIsSystemAdmin__c() != null) {
            _hashCode += getIsSystemAdmin__c().hashCode();
        }
        if (getIs_Excluded_User__c() != null) {
            _hashCode += getIs_Excluded_User__c().hashCode();
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
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getNotesAndAttachments() != null) {
            _hashCode += getNotesAndAttachments().hashCode();
        }
        if (getOriginal_Email_Address__c() != null) {
            _hashCode += getOriginal_Email_Address__c().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getUsage_ID__c() != null) {
            _hashCode += getUsage_ID__c().hashCode();
        }
        if (getUsage_ID__r() != null) {
            _hashCode += getUsage_ID__r().hashCode();
        }
        if (getUser_Artifact_ID__c() != null) {
            _hashCode += getUser_Artifact_ID__c().hashCode();
        }
        if (getUses_New_Data_Format__c() != null) {
            _hashCode += getUses_New_Data_Format__c().hashCode();
        }
        if (getEmail_domain__c() != null) {
            _hashCode += getEmail_domain__c().hashCode();
        }
        if (getReplace_username_with_hash_value__c() != null) {
            _hashCode += getReplace_username_with_hash_value__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Relativity_Case_User__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relativity_Case_User__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("administrative_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Administrative_Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("case_User_ID__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case_User_ID__c"));
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
        elemField.setFieldName("date_Time_of_Job_Run__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Time_of_Job_Run__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain_Match__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Domain_Match__c"));
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
        elemField.setFieldName("flag__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Flag__c"));
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
        elemField.setFieldName("isSystemAdmin__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsSystemAdmin__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("is_Excluded_User__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Is_Excluded_User__c"));
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
        elemField.setFieldName("original_Email_Address__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Original_Email_Address__c"));
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
        elemField.setFieldName("systemModstamp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SystemModstamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usage_ID__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Usage_ID__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usage_ID__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Usage_ID__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Usage_Data__c"));
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
        elemField.setFieldName("email_domain__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "email_domain__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replace_username_with_hash_value__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "replace_username_with_hash_value__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

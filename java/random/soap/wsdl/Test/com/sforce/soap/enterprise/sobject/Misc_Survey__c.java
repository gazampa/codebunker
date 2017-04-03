/**
 * Misc_Survey__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Misc_Survey__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String access_documentation__c;

    private java.lang.String additional_Comments__c;

    private java.lang.String additional_Documentation__c;

    private java.lang.String additional_Stability_Info__c;

    private java.lang.String allow_reviewer_access_to_online_help__c;

    private java.lang.String are_tutorials_useful__c;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String company__c;

    private java.lang.String content_Download_Notification__c;

    private com.sforce.soap.enterprise.sobject.Content_Download_Notification__c content_Download_Notification__r;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.Double documentation__c;

    private java.lang.String EP_Survey_Type__c;

    private java.lang.String email_Address__c;

    private java.lang.Double FM_Date_entry_functionality__c;

    private java.lang.String features_Used__c;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.String how_do_you_use_Relativity__c;

    private java.lang.String how_long_have_you_been_using_Relativity__c;

    private java.lang.String how_often_do_you_read_release_notes__c;

    private java.lang.String how_often_do_you_watch_release_videos__c;

    private java.lang.Double intuitive_and_easy_to_use__c;

    private java.lang.Boolean isDeleted;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String least_Stable_Feature__c;

    private java.lang.String level_of_Customization__c;

    private java.lang.String name;

    private java.lang.String name__c;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private java.lang.String OK_to_Contact__c;

    private java.lang.String one_Thing_to_Make_More_Stable__c;

    private java.lang.String other_Features__c;

    private java.lang.String other_Products__c;

    private java.lang.String other_documentation_access__c;

    private java.lang.String other_tasks__c;

    private java.lang.Double overall_Satisfaction__c;

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private java.lang.String participate_in_online_community__c;

    private java.lang.String phone__c;

    private java.lang.String position__c;

    private java.lang.String preferred_contact_method__c;

    private java.lang.String problems_Installing_Fact_Manager__c;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.String product__c;

    private java.lang.String products_Used__c;

    private com.sforce.soap.enterprise.sobject.RecordType recordType;

    private java.lang.String recordTypeId;

    private java.lang.Double relativity_Stability__c;

    private java.lang.String relativity_Version__c;

    private java.lang.String relativity_training__c;

    private java.lang.Double reporting__c;

    private java.lang.String reused_Documentation__c;

    private java.util.Calendar systemModstamp;

    private java.lang.String tasks_performed_when_using_documentation__c;

    private java.lang.String user_Email__c;

    private java.lang.String user_name__c;

    private java.lang.String what_actions_to_improve_documentation__c;

    private java.lang.String workflow_Outside_of_Relativity__c;

    private java.lang.Double workspaces_Fact_Manager_installed_to__c;

    private java.lang.String workspaces_Installed_to__c;

    private java.lang.String has_helpful_graphics__c;

    private java.lang.String is_accurate__c;

    private java.lang.String is_complete__c;

    private java.lang.String is_easy_to_access__c;

    private java.lang.String is_easy_to_use__c;

    private java.lang.String is_well_organized__c;

    private java.lang.String use_a_feedback_system_to_comment__c;

    private java.lang.String use_a_feedback_system_to_rate_content__c;

    private java.lang.String use_online_help_in_Relativity__c;

    public Misc_Survey__c() {
    }

    public Misc_Survey__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String access_documentation__c,
           java.lang.String additional_Comments__c,
           java.lang.String additional_Documentation__c,
           java.lang.String additional_Stability_Info__c,
           java.lang.String allow_reviewer_access_to_online_help__c,
           java.lang.String are_tutorials_useful__c,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String company__c,
           java.lang.String content_Download_Notification__c,
           com.sforce.soap.enterprise.sobject.Content_Download_Notification__c content_Download_Notification__r,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.Double documentation__c,
           java.lang.String EP_Survey_Type__c,
           java.lang.String email_Address__c,
           java.lang.Double FM_Date_entry_functionality__c,
           java.lang.String features_Used__c,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.String how_do_you_use_Relativity__c,
           java.lang.String how_long_have_you_been_using_Relativity__c,
           java.lang.String how_often_do_you_read_release_notes__c,
           java.lang.String how_often_do_you_watch_release_videos__c,
           java.lang.Double intuitive_and_easy_to_use__c,
           java.lang.Boolean isDeleted,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String least_Stable_Feature__c,
           java.lang.String level_of_Customization__c,
           java.lang.String name,
           java.lang.String name__c,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           java.lang.String OK_to_Contact__c,
           java.lang.String one_Thing_to_Make_More_Stable__c,
           java.lang.String other_Features__c,
           java.lang.String other_Products__c,
           java.lang.String other_documentation_access__c,
           java.lang.String other_tasks__c,
           java.lang.Double overall_Satisfaction__c,
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           java.lang.String participate_in_online_community__c,
           java.lang.String phone__c,
           java.lang.String position__c,
           java.lang.String preferred_contact_method__c,
           java.lang.String problems_Installing_Fact_Manager__c,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.String product__c,
           java.lang.String products_Used__c,
           com.sforce.soap.enterprise.sobject.RecordType recordType,
           java.lang.String recordTypeId,
           java.lang.Double relativity_Stability__c,
           java.lang.String relativity_Version__c,
           java.lang.String relativity_training__c,
           java.lang.Double reporting__c,
           java.lang.String reused_Documentation__c,
           java.util.Calendar systemModstamp,
           java.lang.String tasks_performed_when_using_documentation__c,
           java.lang.String user_Email__c,
           java.lang.String user_name__c,
           java.lang.String what_actions_to_improve_documentation__c,
           java.lang.String workflow_Outside_of_Relativity__c,
           java.lang.Double workspaces_Fact_Manager_installed_to__c,
           java.lang.String workspaces_Installed_to__c,
           java.lang.String has_helpful_graphics__c,
           java.lang.String is_accurate__c,
           java.lang.String is_complete__c,
           java.lang.String is_easy_to_access__c,
           java.lang.String is_easy_to_use__c,
           java.lang.String is_well_organized__c,
           java.lang.String use_a_feedback_system_to_comment__c,
           java.lang.String use_a_feedback_system_to_rate_content__c,
           java.lang.String use_online_help_in_Relativity__c) {
        super(
            fieldsToNull,
            id);
        this.access_documentation__c = access_documentation__c;
        this.additional_Comments__c = additional_Comments__c;
        this.additional_Documentation__c = additional_Documentation__c;
        this.additional_Stability_Info__c = additional_Stability_Info__c;
        this.allow_reviewer_access_to_online_help__c = allow_reviewer_access_to_online_help__c;
        this.are_tutorials_useful__c = are_tutorials_useful__c;
        this.attachments = attachments;
        this.company__c = company__c;
        this.content_Download_Notification__c = content_Download_Notification__c;
        this.content_Download_Notification__r = content_Download_Notification__r;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.documentation__c = documentation__c;
        this.EP_Survey_Type__c = EP_Survey_Type__c;
        this.email_Address__c = email_Address__c;
        this.FM_Date_entry_functionality__c = FM_Date_entry_functionality__c;
        this.features_Used__c = features_Used__c;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.histories = histories;
        this.how_do_you_use_Relativity__c = how_do_you_use_Relativity__c;
        this.how_long_have_you_been_using_Relativity__c = how_long_have_you_been_using_Relativity__c;
        this.how_often_do_you_read_release_notes__c = how_often_do_you_read_release_notes__c;
        this.how_often_do_you_watch_release_videos__c = how_often_do_you_watch_release_videos__c;
        this.intuitive_and_easy_to_use__c = intuitive_and_easy_to_use__c;
        this.isDeleted = isDeleted;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.least_Stable_Feature__c = least_Stable_Feature__c;
        this.level_of_Customization__c = level_of_Customization__c;
        this.name = name;
        this.name__c = name__c;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.OK_to_Contact__c = OK_to_Contact__c;
        this.one_Thing_to_Make_More_Stable__c = one_Thing_to_Make_More_Stable__c;
        this.other_Features__c = other_Features__c;
        this.other_Products__c = other_Products__c;
        this.other_documentation_access__c = other_documentation_access__c;
        this.other_tasks__c = other_tasks__c;
        this.overall_Satisfaction__c = overall_Satisfaction__c;
        this.owner = owner;
        this.ownerId = ownerId;
        this.participate_in_online_community__c = participate_in_online_community__c;
        this.phone__c = phone__c;
        this.position__c = position__c;
        this.preferred_contact_method__c = preferred_contact_method__c;
        this.problems_Installing_Fact_Manager__c = problems_Installing_Fact_Manager__c;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.product__c = product__c;
        this.products_Used__c = products_Used__c;
        this.recordType = recordType;
        this.recordTypeId = recordTypeId;
        this.relativity_Stability__c = relativity_Stability__c;
        this.relativity_Version__c = relativity_Version__c;
        this.relativity_training__c = relativity_training__c;
        this.reporting__c = reporting__c;
        this.reused_Documentation__c = reused_Documentation__c;
        this.systemModstamp = systemModstamp;
        this.tasks_performed_when_using_documentation__c = tasks_performed_when_using_documentation__c;
        this.user_Email__c = user_Email__c;
        this.user_name__c = user_name__c;
        this.what_actions_to_improve_documentation__c = what_actions_to_improve_documentation__c;
        this.workflow_Outside_of_Relativity__c = workflow_Outside_of_Relativity__c;
        this.workspaces_Fact_Manager_installed_to__c = workspaces_Fact_Manager_installed_to__c;
        this.workspaces_Installed_to__c = workspaces_Installed_to__c;
        this.has_helpful_graphics__c = has_helpful_graphics__c;
        this.is_accurate__c = is_accurate__c;
        this.is_complete__c = is_complete__c;
        this.is_easy_to_access__c = is_easy_to_access__c;
        this.is_easy_to_use__c = is_easy_to_use__c;
        this.is_well_organized__c = is_well_organized__c;
        this.use_a_feedback_system_to_comment__c = use_a_feedback_system_to_comment__c;
        this.use_a_feedback_system_to_rate_content__c = use_a_feedback_system_to_rate_content__c;
        this.use_online_help_in_Relativity__c = use_online_help_in_Relativity__c;
    }


    /**
     * Gets the access_documentation__c value for this Misc_Survey__c.
     * 
     * @return access_documentation__c
     */
    public java.lang.String getAccess_documentation__c() {
        return access_documentation__c;
    }


    /**
     * Sets the access_documentation__c value for this Misc_Survey__c.
     * 
     * @param access_documentation__c
     */
    public void setAccess_documentation__c(java.lang.String access_documentation__c) {
        this.access_documentation__c = access_documentation__c;
    }


    /**
     * Gets the additional_Comments__c value for this Misc_Survey__c.
     * 
     * @return additional_Comments__c
     */
    public java.lang.String getAdditional_Comments__c() {
        return additional_Comments__c;
    }


    /**
     * Sets the additional_Comments__c value for this Misc_Survey__c.
     * 
     * @param additional_Comments__c
     */
    public void setAdditional_Comments__c(java.lang.String additional_Comments__c) {
        this.additional_Comments__c = additional_Comments__c;
    }


    /**
     * Gets the additional_Documentation__c value for this Misc_Survey__c.
     * 
     * @return additional_Documentation__c
     */
    public java.lang.String getAdditional_Documentation__c() {
        return additional_Documentation__c;
    }


    /**
     * Sets the additional_Documentation__c value for this Misc_Survey__c.
     * 
     * @param additional_Documentation__c
     */
    public void setAdditional_Documentation__c(java.lang.String additional_Documentation__c) {
        this.additional_Documentation__c = additional_Documentation__c;
    }


    /**
     * Gets the additional_Stability_Info__c value for this Misc_Survey__c.
     * 
     * @return additional_Stability_Info__c
     */
    public java.lang.String getAdditional_Stability_Info__c() {
        return additional_Stability_Info__c;
    }


    /**
     * Sets the additional_Stability_Info__c value for this Misc_Survey__c.
     * 
     * @param additional_Stability_Info__c
     */
    public void setAdditional_Stability_Info__c(java.lang.String additional_Stability_Info__c) {
        this.additional_Stability_Info__c = additional_Stability_Info__c;
    }


    /**
     * Gets the allow_reviewer_access_to_online_help__c value for this Misc_Survey__c.
     * 
     * @return allow_reviewer_access_to_online_help__c
     */
    public java.lang.String getAllow_reviewer_access_to_online_help__c() {
        return allow_reviewer_access_to_online_help__c;
    }


    /**
     * Sets the allow_reviewer_access_to_online_help__c value for this Misc_Survey__c.
     * 
     * @param allow_reviewer_access_to_online_help__c
     */
    public void setAllow_reviewer_access_to_online_help__c(java.lang.String allow_reviewer_access_to_online_help__c) {
        this.allow_reviewer_access_to_online_help__c = allow_reviewer_access_to_online_help__c;
    }


    /**
     * Gets the are_tutorials_useful__c value for this Misc_Survey__c.
     * 
     * @return are_tutorials_useful__c
     */
    public java.lang.String getAre_tutorials_useful__c() {
        return are_tutorials_useful__c;
    }


    /**
     * Sets the are_tutorials_useful__c value for this Misc_Survey__c.
     * 
     * @param are_tutorials_useful__c
     */
    public void setAre_tutorials_useful__c(java.lang.String are_tutorials_useful__c) {
        this.are_tutorials_useful__c = are_tutorials_useful__c;
    }


    /**
     * Gets the attachments value for this Misc_Survey__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Misc_Survey__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the company__c value for this Misc_Survey__c.
     * 
     * @return company__c
     */
    public java.lang.String getCompany__c() {
        return company__c;
    }


    /**
     * Sets the company__c value for this Misc_Survey__c.
     * 
     * @param company__c
     */
    public void setCompany__c(java.lang.String company__c) {
        this.company__c = company__c;
    }


    /**
     * Gets the content_Download_Notification__c value for this Misc_Survey__c.
     * 
     * @return content_Download_Notification__c
     */
    public java.lang.String getContent_Download_Notification__c() {
        return content_Download_Notification__c;
    }


    /**
     * Sets the content_Download_Notification__c value for this Misc_Survey__c.
     * 
     * @param content_Download_Notification__c
     */
    public void setContent_Download_Notification__c(java.lang.String content_Download_Notification__c) {
        this.content_Download_Notification__c = content_Download_Notification__c;
    }


    /**
     * Gets the content_Download_Notification__r value for this Misc_Survey__c.
     * 
     * @return content_Download_Notification__r
     */
    public com.sforce.soap.enterprise.sobject.Content_Download_Notification__c getContent_Download_Notification__r() {
        return content_Download_Notification__r;
    }


    /**
     * Sets the content_Download_Notification__r value for this Misc_Survey__c.
     * 
     * @param content_Download_Notification__r
     */
    public void setContent_Download_Notification__r(com.sforce.soap.enterprise.sobject.Content_Download_Notification__c content_Download_Notification__r) {
        this.content_Download_Notification__r = content_Download_Notification__r;
    }


    /**
     * Gets the createdBy value for this Misc_Survey__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Misc_Survey__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Misc_Survey__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Misc_Survey__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Misc_Survey__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Misc_Survey__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the documentation__c value for this Misc_Survey__c.
     * 
     * @return documentation__c
     */
    public java.lang.Double getDocumentation__c() {
        return documentation__c;
    }


    /**
     * Sets the documentation__c value for this Misc_Survey__c.
     * 
     * @param documentation__c
     */
    public void setDocumentation__c(java.lang.Double documentation__c) {
        this.documentation__c = documentation__c;
    }


    /**
     * Gets the EP_Survey_Type__c value for this Misc_Survey__c.
     * 
     * @return EP_Survey_Type__c
     */
    public java.lang.String getEP_Survey_Type__c() {
        return EP_Survey_Type__c;
    }


    /**
     * Sets the EP_Survey_Type__c value for this Misc_Survey__c.
     * 
     * @param EP_Survey_Type__c
     */
    public void setEP_Survey_Type__c(java.lang.String EP_Survey_Type__c) {
        this.EP_Survey_Type__c = EP_Survey_Type__c;
    }


    /**
     * Gets the email_Address__c value for this Misc_Survey__c.
     * 
     * @return email_Address__c
     */
    public java.lang.String getEmail_Address__c() {
        return email_Address__c;
    }


    /**
     * Sets the email_Address__c value for this Misc_Survey__c.
     * 
     * @param email_Address__c
     */
    public void setEmail_Address__c(java.lang.String email_Address__c) {
        this.email_Address__c = email_Address__c;
    }


    /**
     * Gets the FM_Date_entry_functionality__c value for this Misc_Survey__c.
     * 
     * @return FM_Date_entry_functionality__c
     */
    public java.lang.Double getFM_Date_entry_functionality__c() {
        return FM_Date_entry_functionality__c;
    }


    /**
     * Sets the FM_Date_entry_functionality__c value for this Misc_Survey__c.
     * 
     * @param FM_Date_entry_functionality__c
     */
    public void setFM_Date_entry_functionality__c(java.lang.Double FM_Date_entry_functionality__c) {
        this.FM_Date_entry_functionality__c = FM_Date_entry_functionality__c;
    }


    /**
     * Gets the features_Used__c value for this Misc_Survey__c.
     * 
     * @return features_Used__c
     */
    public java.lang.String getFeatures_Used__c() {
        return features_Used__c;
    }


    /**
     * Sets the features_Used__c value for this Misc_Survey__c.
     * 
     * @param features_Used__c
     */
    public void setFeatures_Used__c(java.lang.String features_Used__c) {
        this.features_Used__c = features_Used__c;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Misc_Survey__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Misc_Survey__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the histories value for this Misc_Survey__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Misc_Survey__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the how_do_you_use_Relativity__c value for this Misc_Survey__c.
     * 
     * @return how_do_you_use_Relativity__c
     */
    public java.lang.String getHow_do_you_use_Relativity__c() {
        return how_do_you_use_Relativity__c;
    }


    /**
     * Sets the how_do_you_use_Relativity__c value for this Misc_Survey__c.
     * 
     * @param how_do_you_use_Relativity__c
     */
    public void setHow_do_you_use_Relativity__c(java.lang.String how_do_you_use_Relativity__c) {
        this.how_do_you_use_Relativity__c = how_do_you_use_Relativity__c;
    }


    /**
     * Gets the how_long_have_you_been_using_Relativity__c value for this Misc_Survey__c.
     * 
     * @return how_long_have_you_been_using_Relativity__c
     */
    public java.lang.String getHow_long_have_you_been_using_Relativity__c() {
        return how_long_have_you_been_using_Relativity__c;
    }


    /**
     * Sets the how_long_have_you_been_using_Relativity__c value for this Misc_Survey__c.
     * 
     * @param how_long_have_you_been_using_Relativity__c
     */
    public void setHow_long_have_you_been_using_Relativity__c(java.lang.String how_long_have_you_been_using_Relativity__c) {
        this.how_long_have_you_been_using_Relativity__c = how_long_have_you_been_using_Relativity__c;
    }


    /**
     * Gets the how_often_do_you_read_release_notes__c value for this Misc_Survey__c.
     * 
     * @return how_often_do_you_read_release_notes__c
     */
    public java.lang.String getHow_often_do_you_read_release_notes__c() {
        return how_often_do_you_read_release_notes__c;
    }


    /**
     * Sets the how_often_do_you_read_release_notes__c value for this Misc_Survey__c.
     * 
     * @param how_often_do_you_read_release_notes__c
     */
    public void setHow_often_do_you_read_release_notes__c(java.lang.String how_often_do_you_read_release_notes__c) {
        this.how_often_do_you_read_release_notes__c = how_often_do_you_read_release_notes__c;
    }


    /**
     * Gets the how_often_do_you_watch_release_videos__c value for this Misc_Survey__c.
     * 
     * @return how_often_do_you_watch_release_videos__c
     */
    public java.lang.String getHow_often_do_you_watch_release_videos__c() {
        return how_often_do_you_watch_release_videos__c;
    }


    /**
     * Sets the how_often_do_you_watch_release_videos__c value for this Misc_Survey__c.
     * 
     * @param how_often_do_you_watch_release_videos__c
     */
    public void setHow_often_do_you_watch_release_videos__c(java.lang.String how_often_do_you_watch_release_videos__c) {
        this.how_often_do_you_watch_release_videos__c = how_often_do_you_watch_release_videos__c;
    }


    /**
     * Gets the intuitive_and_easy_to_use__c value for this Misc_Survey__c.
     * 
     * @return intuitive_and_easy_to_use__c
     */
    public java.lang.Double getIntuitive_and_easy_to_use__c() {
        return intuitive_and_easy_to_use__c;
    }


    /**
     * Sets the intuitive_and_easy_to_use__c value for this Misc_Survey__c.
     * 
     * @param intuitive_and_easy_to_use__c
     */
    public void setIntuitive_and_easy_to_use__c(java.lang.Double intuitive_and_easy_to_use__c) {
        this.intuitive_and_easy_to_use__c = intuitive_and_easy_to_use__c;
    }


    /**
     * Gets the isDeleted value for this Misc_Survey__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Misc_Survey__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this Misc_Survey__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Misc_Survey__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Misc_Survey__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Misc_Survey__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Misc_Survey__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Misc_Survey__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the least_Stable_Feature__c value for this Misc_Survey__c.
     * 
     * @return least_Stable_Feature__c
     */
    public java.lang.String getLeast_Stable_Feature__c() {
        return least_Stable_Feature__c;
    }


    /**
     * Sets the least_Stable_Feature__c value for this Misc_Survey__c.
     * 
     * @param least_Stable_Feature__c
     */
    public void setLeast_Stable_Feature__c(java.lang.String least_Stable_Feature__c) {
        this.least_Stable_Feature__c = least_Stable_Feature__c;
    }


    /**
     * Gets the level_of_Customization__c value for this Misc_Survey__c.
     * 
     * @return level_of_Customization__c
     */
    public java.lang.String getLevel_of_Customization__c() {
        return level_of_Customization__c;
    }


    /**
     * Sets the level_of_Customization__c value for this Misc_Survey__c.
     * 
     * @param level_of_Customization__c
     */
    public void setLevel_of_Customization__c(java.lang.String level_of_Customization__c) {
        this.level_of_Customization__c = level_of_Customization__c;
    }


    /**
     * Gets the name value for this Misc_Survey__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Misc_Survey__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the name__c value for this Misc_Survey__c.
     * 
     * @return name__c
     */
    public java.lang.String getName__c() {
        return name__c;
    }


    /**
     * Sets the name__c value for this Misc_Survey__c.
     * 
     * @param name__c
     */
    public void setName__c(java.lang.String name__c) {
        this.name__c = name__c;
    }


    /**
     * Gets the notes value for this Misc_Survey__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Misc_Survey__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Misc_Survey__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Misc_Survey__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the OK_to_Contact__c value for this Misc_Survey__c.
     * 
     * @return OK_to_Contact__c
     */
    public java.lang.String getOK_to_Contact__c() {
        return OK_to_Contact__c;
    }


    /**
     * Sets the OK_to_Contact__c value for this Misc_Survey__c.
     * 
     * @param OK_to_Contact__c
     */
    public void setOK_to_Contact__c(java.lang.String OK_to_Contact__c) {
        this.OK_to_Contact__c = OK_to_Contact__c;
    }


    /**
     * Gets the one_Thing_to_Make_More_Stable__c value for this Misc_Survey__c.
     * 
     * @return one_Thing_to_Make_More_Stable__c
     */
    public java.lang.String getOne_Thing_to_Make_More_Stable__c() {
        return one_Thing_to_Make_More_Stable__c;
    }


    /**
     * Sets the one_Thing_to_Make_More_Stable__c value for this Misc_Survey__c.
     * 
     * @param one_Thing_to_Make_More_Stable__c
     */
    public void setOne_Thing_to_Make_More_Stable__c(java.lang.String one_Thing_to_Make_More_Stable__c) {
        this.one_Thing_to_Make_More_Stable__c = one_Thing_to_Make_More_Stable__c;
    }


    /**
     * Gets the other_Features__c value for this Misc_Survey__c.
     * 
     * @return other_Features__c
     */
    public java.lang.String getOther_Features__c() {
        return other_Features__c;
    }


    /**
     * Sets the other_Features__c value for this Misc_Survey__c.
     * 
     * @param other_Features__c
     */
    public void setOther_Features__c(java.lang.String other_Features__c) {
        this.other_Features__c = other_Features__c;
    }


    /**
     * Gets the other_Products__c value for this Misc_Survey__c.
     * 
     * @return other_Products__c
     */
    public java.lang.String getOther_Products__c() {
        return other_Products__c;
    }


    /**
     * Sets the other_Products__c value for this Misc_Survey__c.
     * 
     * @param other_Products__c
     */
    public void setOther_Products__c(java.lang.String other_Products__c) {
        this.other_Products__c = other_Products__c;
    }


    /**
     * Gets the other_documentation_access__c value for this Misc_Survey__c.
     * 
     * @return other_documentation_access__c
     */
    public java.lang.String getOther_documentation_access__c() {
        return other_documentation_access__c;
    }


    /**
     * Sets the other_documentation_access__c value for this Misc_Survey__c.
     * 
     * @param other_documentation_access__c
     */
    public void setOther_documentation_access__c(java.lang.String other_documentation_access__c) {
        this.other_documentation_access__c = other_documentation_access__c;
    }


    /**
     * Gets the other_tasks__c value for this Misc_Survey__c.
     * 
     * @return other_tasks__c
     */
    public java.lang.String getOther_tasks__c() {
        return other_tasks__c;
    }


    /**
     * Sets the other_tasks__c value for this Misc_Survey__c.
     * 
     * @param other_tasks__c
     */
    public void setOther_tasks__c(java.lang.String other_tasks__c) {
        this.other_tasks__c = other_tasks__c;
    }


    /**
     * Gets the overall_Satisfaction__c value for this Misc_Survey__c.
     * 
     * @return overall_Satisfaction__c
     */
    public java.lang.Double getOverall_Satisfaction__c() {
        return overall_Satisfaction__c;
    }


    /**
     * Sets the overall_Satisfaction__c value for this Misc_Survey__c.
     * 
     * @param overall_Satisfaction__c
     */
    public void setOverall_Satisfaction__c(java.lang.Double overall_Satisfaction__c) {
        this.overall_Satisfaction__c = overall_Satisfaction__c;
    }


    /**
     * Gets the owner value for this Misc_Survey__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Misc_Survey__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Misc_Survey__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Misc_Survey__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the participate_in_online_community__c value for this Misc_Survey__c.
     * 
     * @return participate_in_online_community__c
     */
    public java.lang.String getParticipate_in_online_community__c() {
        return participate_in_online_community__c;
    }


    /**
     * Sets the participate_in_online_community__c value for this Misc_Survey__c.
     * 
     * @param participate_in_online_community__c
     */
    public void setParticipate_in_online_community__c(java.lang.String participate_in_online_community__c) {
        this.participate_in_online_community__c = participate_in_online_community__c;
    }


    /**
     * Gets the phone__c value for this Misc_Survey__c.
     * 
     * @return phone__c
     */
    public java.lang.String getPhone__c() {
        return phone__c;
    }


    /**
     * Sets the phone__c value for this Misc_Survey__c.
     * 
     * @param phone__c
     */
    public void setPhone__c(java.lang.String phone__c) {
        this.phone__c = phone__c;
    }


    /**
     * Gets the position__c value for this Misc_Survey__c.
     * 
     * @return position__c
     */
    public java.lang.String getPosition__c() {
        return position__c;
    }


    /**
     * Sets the position__c value for this Misc_Survey__c.
     * 
     * @param position__c
     */
    public void setPosition__c(java.lang.String position__c) {
        this.position__c = position__c;
    }


    /**
     * Gets the preferred_contact_method__c value for this Misc_Survey__c.
     * 
     * @return preferred_contact_method__c
     */
    public java.lang.String getPreferred_contact_method__c() {
        return preferred_contact_method__c;
    }


    /**
     * Sets the preferred_contact_method__c value for this Misc_Survey__c.
     * 
     * @param preferred_contact_method__c
     */
    public void setPreferred_contact_method__c(java.lang.String preferred_contact_method__c) {
        this.preferred_contact_method__c = preferred_contact_method__c;
    }


    /**
     * Gets the problems_Installing_Fact_Manager__c value for this Misc_Survey__c.
     * 
     * @return problems_Installing_Fact_Manager__c
     */
    public java.lang.String getProblems_Installing_Fact_Manager__c() {
        return problems_Installing_Fact_Manager__c;
    }


    /**
     * Sets the problems_Installing_Fact_Manager__c value for this Misc_Survey__c.
     * 
     * @param problems_Installing_Fact_Manager__c
     */
    public void setProblems_Installing_Fact_Manager__c(java.lang.String problems_Installing_Fact_Manager__c) {
        this.problems_Installing_Fact_Manager__c = problems_Installing_Fact_Manager__c;
    }


    /**
     * Gets the processInstances value for this Misc_Survey__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Misc_Survey__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Misc_Survey__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Misc_Survey__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the product__c value for this Misc_Survey__c.
     * 
     * @return product__c
     */
    public java.lang.String getProduct__c() {
        return product__c;
    }


    /**
     * Sets the product__c value for this Misc_Survey__c.
     * 
     * @param product__c
     */
    public void setProduct__c(java.lang.String product__c) {
        this.product__c = product__c;
    }


    /**
     * Gets the products_Used__c value for this Misc_Survey__c.
     * 
     * @return products_Used__c
     */
    public java.lang.String getProducts_Used__c() {
        return products_Used__c;
    }


    /**
     * Sets the products_Used__c value for this Misc_Survey__c.
     * 
     * @param products_Used__c
     */
    public void setProducts_Used__c(java.lang.String products_Used__c) {
        this.products_Used__c = products_Used__c;
    }


    /**
     * Gets the recordType value for this Misc_Survey__c.
     * 
     * @return recordType
     */
    public com.sforce.soap.enterprise.sobject.RecordType getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this Misc_Survey__c.
     * 
     * @param recordType
     */
    public void setRecordType(com.sforce.soap.enterprise.sobject.RecordType recordType) {
        this.recordType = recordType;
    }


    /**
     * Gets the recordTypeId value for this Misc_Survey__c.
     * 
     * @return recordTypeId
     */
    public java.lang.String getRecordTypeId() {
        return recordTypeId;
    }


    /**
     * Sets the recordTypeId value for this Misc_Survey__c.
     * 
     * @param recordTypeId
     */
    public void setRecordTypeId(java.lang.String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }


    /**
     * Gets the relativity_Stability__c value for this Misc_Survey__c.
     * 
     * @return relativity_Stability__c
     */
    public java.lang.Double getRelativity_Stability__c() {
        return relativity_Stability__c;
    }


    /**
     * Sets the relativity_Stability__c value for this Misc_Survey__c.
     * 
     * @param relativity_Stability__c
     */
    public void setRelativity_Stability__c(java.lang.Double relativity_Stability__c) {
        this.relativity_Stability__c = relativity_Stability__c;
    }


    /**
     * Gets the relativity_Version__c value for this Misc_Survey__c.
     * 
     * @return relativity_Version__c
     */
    public java.lang.String getRelativity_Version__c() {
        return relativity_Version__c;
    }


    /**
     * Sets the relativity_Version__c value for this Misc_Survey__c.
     * 
     * @param relativity_Version__c
     */
    public void setRelativity_Version__c(java.lang.String relativity_Version__c) {
        this.relativity_Version__c = relativity_Version__c;
    }


    /**
     * Gets the relativity_training__c value for this Misc_Survey__c.
     * 
     * @return relativity_training__c
     */
    public java.lang.String getRelativity_training__c() {
        return relativity_training__c;
    }


    /**
     * Sets the relativity_training__c value for this Misc_Survey__c.
     * 
     * @param relativity_training__c
     */
    public void setRelativity_training__c(java.lang.String relativity_training__c) {
        this.relativity_training__c = relativity_training__c;
    }


    /**
     * Gets the reporting__c value for this Misc_Survey__c.
     * 
     * @return reporting__c
     */
    public java.lang.Double getReporting__c() {
        return reporting__c;
    }


    /**
     * Sets the reporting__c value for this Misc_Survey__c.
     * 
     * @param reporting__c
     */
    public void setReporting__c(java.lang.Double reporting__c) {
        this.reporting__c = reporting__c;
    }


    /**
     * Gets the reused_Documentation__c value for this Misc_Survey__c.
     * 
     * @return reused_Documentation__c
     */
    public java.lang.String getReused_Documentation__c() {
        return reused_Documentation__c;
    }


    /**
     * Sets the reused_Documentation__c value for this Misc_Survey__c.
     * 
     * @param reused_Documentation__c
     */
    public void setReused_Documentation__c(java.lang.String reused_Documentation__c) {
        this.reused_Documentation__c = reused_Documentation__c;
    }


    /**
     * Gets the systemModstamp value for this Misc_Survey__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Misc_Survey__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks_performed_when_using_documentation__c value for this Misc_Survey__c.
     * 
     * @return tasks_performed_when_using_documentation__c
     */
    public java.lang.String getTasks_performed_when_using_documentation__c() {
        return tasks_performed_when_using_documentation__c;
    }


    /**
     * Sets the tasks_performed_when_using_documentation__c value for this Misc_Survey__c.
     * 
     * @param tasks_performed_when_using_documentation__c
     */
    public void setTasks_performed_when_using_documentation__c(java.lang.String tasks_performed_when_using_documentation__c) {
        this.tasks_performed_when_using_documentation__c = tasks_performed_when_using_documentation__c;
    }


    /**
     * Gets the user_Email__c value for this Misc_Survey__c.
     * 
     * @return user_Email__c
     */
    public java.lang.String getUser_Email__c() {
        return user_Email__c;
    }


    /**
     * Sets the user_Email__c value for this Misc_Survey__c.
     * 
     * @param user_Email__c
     */
    public void setUser_Email__c(java.lang.String user_Email__c) {
        this.user_Email__c = user_Email__c;
    }


    /**
     * Gets the user_name__c value for this Misc_Survey__c.
     * 
     * @return user_name__c
     */
    public java.lang.String getUser_name__c() {
        return user_name__c;
    }


    /**
     * Sets the user_name__c value for this Misc_Survey__c.
     * 
     * @param user_name__c
     */
    public void setUser_name__c(java.lang.String user_name__c) {
        this.user_name__c = user_name__c;
    }


    /**
     * Gets the what_actions_to_improve_documentation__c value for this Misc_Survey__c.
     * 
     * @return what_actions_to_improve_documentation__c
     */
    public java.lang.String getWhat_actions_to_improve_documentation__c() {
        return what_actions_to_improve_documentation__c;
    }


    /**
     * Sets the what_actions_to_improve_documentation__c value for this Misc_Survey__c.
     * 
     * @param what_actions_to_improve_documentation__c
     */
    public void setWhat_actions_to_improve_documentation__c(java.lang.String what_actions_to_improve_documentation__c) {
        this.what_actions_to_improve_documentation__c = what_actions_to_improve_documentation__c;
    }


    /**
     * Gets the workflow_Outside_of_Relativity__c value for this Misc_Survey__c.
     * 
     * @return workflow_Outside_of_Relativity__c
     */
    public java.lang.String getWorkflow_Outside_of_Relativity__c() {
        return workflow_Outside_of_Relativity__c;
    }


    /**
     * Sets the workflow_Outside_of_Relativity__c value for this Misc_Survey__c.
     * 
     * @param workflow_Outside_of_Relativity__c
     */
    public void setWorkflow_Outside_of_Relativity__c(java.lang.String workflow_Outside_of_Relativity__c) {
        this.workflow_Outside_of_Relativity__c = workflow_Outside_of_Relativity__c;
    }


    /**
     * Gets the workspaces_Fact_Manager_installed_to__c value for this Misc_Survey__c.
     * 
     * @return workspaces_Fact_Manager_installed_to__c
     */
    public java.lang.Double getWorkspaces_Fact_Manager_installed_to__c() {
        return workspaces_Fact_Manager_installed_to__c;
    }


    /**
     * Sets the workspaces_Fact_Manager_installed_to__c value for this Misc_Survey__c.
     * 
     * @param workspaces_Fact_Manager_installed_to__c
     */
    public void setWorkspaces_Fact_Manager_installed_to__c(java.lang.Double workspaces_Fact_Manager_installed_to__c) {
        this.workspaces_Fact_Manager_installed_to__c = workspaces_Fact_Manager_installed_to__c;
    }


    /**
     * Gets the workspaces_Installed_to__c value for this Misc_Survey__c.
     * 
     * @return workspaces_Installed_to__c
     */
    public java.lang.String getWorkspaces_Installed_to__c() {
        return workspaces_Installed_to__c;
    }


    /**
     * Sets the workspaces_Installed_to__c value for this Misc_Survey__c.
     * 
     * @param workspaces_Installed_to__c
     */
    public void setWorkspaces_Installed_to__c(java.lang.String workspaces_Installed_to__c) {
        this.workspaces_Installed_to__c = workspaces_Installed_to__c;
    }


    /**
     * Gets the has_helpful_graphics__c value for this Misc_Survey__c.
     * 
     * @return has_helpful_graphics__c
     */
    public java.lang.String getHas_helpful_graphics__c() {
        return has_helpful_graphics__c;
    }


    /**
     * Sets the has_helpful_graphics__c value for this Misc_Survey__c.
     * 
     * @param has_helpful_graphics__c
     */
    public void setHas_helpful_graphics__c(java.lang.String has_helpful_graphics__c) {
        this.has_helpful_graphics__c = has_helpful_graphics__c;
    }


    /**
     * Gets the is_accurate__c value for this Misc_Survey__c.
     * 
     * @return is_accurate__c
     */
    public java.lang.String getIs_accurate__c() {
        return is_accurate__c;
    }


    /**
     * Sets the is_accurate__c value for this Misc_Survey__c.
     * 
     * @param is_accurate__c
     */
    public void setIs_accurate__c(java.lang.String is_accurate__c) {
        this.is_accurate__c = is_accurate__c;
    }


    /**
     * Gets the is_complete__c value for this Misc_Survey__c.
     * 
     * @return is_complete__c
     */
    public java.lang.String getIs_complete__c() {
        return is_complete__c;
    }


    /**
     * Sets the is_complete__c value for this Misc_Survey__c.
     * 
     * @param is_complete__c
     */
    public void setIs_complete__c(java.lang.String is_complete__c) {
        this.is_complete__c = is_complete__c;
    }


    /**
     * Gets the is_easy_to_access__c value for this Misc_Survey__c.
     * 
     * @return is_easy_to_access__c
     */
    public java.lang.String getIs_easy_to_access__c() {
        return is_easy_to_access__c;
    }


    /**
     * Sets the is_easy_to_access__c value for this Misc_Survey__c.
     * 
     * @param is_easy_to_access__c
     */
    public void setIs_easy_to_access__c(java.lang.String is_easy_to_access__c) {
        this.is_easy_to_access__c = is_easy_to_access__c;
    }


    /**
     * Gets the is_easy_to_use__c value for this Misc_Survey__c.
     * 
     * @return is_easy_to_use__c
     */
    public java.lang.String getIs_easy_to_use__c() {
        return is_easy_to_use__c;
    }


    /**
     * Sets the is_easy_to_use__c value for this Misc_Survey__c.
     * 
     * @param is_easy_to_use__c
     */
    public void setIs_easy_to_use__c(java.lang.String is_easy_to_use__c) {
        this.is_easy_to_use__c = is_easy_to_use__c;
    }


    /**
     * Gets the is_well_organized__c value for this Misc_Survey__c.
     * 
     * @return is_well_organized__c
     */
    public java.lang.String getIs_well_organized__c() {
        return is_well_organized__c;
    }


    /**
     * Sets the is_well_organized__c value for this Misc_Survey__c.
     * 
     * @param is_well_organized__c
     */
    public void setIs_well_organized__c(java.lang.String is_well_organized__c) {
        this.is_well_organized__c = is_well_organized__c;
    }


    /**
     * Gets the use_a_feedback_system_to_comment__c value for this Misc_Survey__c.
     * 
     * @return use_a_feedback_system_to_comment__c
     */
    public java.lang.String getUse_a_feedback_system_to_comment__c() {
        return use_a_feedback_system_to_comment__c;
    }


    /**
     * Sets the use_a_feedback_system_to_comment__c value for this Misc_Survey__c.
     * 
     * @param use_a_feedback_system_to_comment__c
     */
    public void setUse_a_feedback_system_to_comment__c(java.lang.String use_a_feedback_system_to_comment__c) {
        this.use_a_feedback_system_to_comment__c = use_a_feedback_system_to_comment__c;
    }


    /**
     * Gets the use_a_feedback_system_to_rate_content__c value for this Misc_Survey__c.
     * 
     * @return use_a_feedback_system_to_rate_content__c
     */
    public java.lang.String getUse_a_feedback_system_to_rate_content__c() {
        return use_a_feedback_system_to_rate_content__c;
    }


    /**
     * Sets the use_a_feedback_system_to_rate_content__c value for this Misc_Survey__c.
     * 
     * @param use_a_feedback_system_to_rate_content__c
     */
    public void setUse_a_feedback_system_to_rate_content__c(java.lang.String use_a_feedback_system_to_rate_content__c) {
        this.use_a_feedback_system_to_rate_content__c = use_a_feedback_system_to_rate_content__c;
    }


    /**
     * Gets the use_online_help_in_Relativity__c value for this Misc_Survey__c.
     * 
     * @return use_online_help_in_Relativity__c
     */
    public java.lang.String getUse_online_help_in_Relativity__c() {
        return use_online_help_in_Relativity__c;
    }


    /**
     * Sets the use_online_help_in_Relativity__c value for this Misc_Survey__c.
     * 
     * @param use_online_help_in_Relativity__c
     */
    public void setUse_online_help_in_Relativity__c(java.lang.String use_online_help_in_Relativity__c) {
        this.use_online_help_in_Relativity__c = use_online_help_in_Relativity__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Misc_Survey__c)) return false;
        Misc_Survey__c other = (Misc_Survey__c) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.access_documentation__c==null && other.getAccess_documentation__c()==null) || 
             (this.access_documentation__c!=null &&
              this.access_documentation__c.equals(other.getAccess_documentation__c()))) &&
            ((this.additional_Comments__c==null && other.getAdditional_Comments__c()==null) || 
             (this.additional_Comments__c!=null &&
              this.additional_Comments__c.equals(other.getAdditional_Comments__c()))) &&
            ((this.additional_Documentation__c==null && other.getAdditional_Documentation__c()==null) || 
             (this.additional_Documentation__c!=null &&
              this.additional_Documentation__c.equals(other.getAdditional_Documentation__c()))) &&
            ((this.additional_Stability_Info__c==null && other.getAdditional_Stability_Info__c()==null) || 
             (this.additional_Stability_Info__c!=null &&
              this.additional_Stability_Info__c.equals(other.getAdditional_Stability_Info__c()))) &&
            ((this.allow_reviewer_access_to_online_help__c==null && other.getAllow_reviewer_access_to_online_help__c()==null) || 
             (this.allow_reviewer_access_to_online_help__c!=null &&
              this.allow_reviewer_access_to_online_help__c.equals(other.getAllow_reviewer_access_to_online_help__c()))) &&
            ((this.are_tutorials_useful__c==null && other.getAre_tutorials_useful__c()==null) || 
             (this.are_tutorials_useful__c!=null &&
              this.are_tutorials_useful__c.equals(other.getAre_tutorials_useful__c()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.company__c==null && other.getCompany__c()==null) || 
             (this.company__c!=null &&
              this.company__c.equals(other.getCompany__c()))) &&
            ((this.content_Download_Notification__c==null && other.getContent_Download_Notification__c()==null) || 
             (this.content_Download_Notification__c!=null &&
              this.content_Download_Notification__c.equals(other.getContent_Download_Notification__c()))) &&
            ((this.content_Download_Notification__r==null && other.getContent_Download_Notification__r()==null) || 
             (this.content_Download_Notification__r!=null &&
              this.content_Download_Notification__r.equals(other.getContent_Download_Notification__r()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.documentation__c==null && other.getDocumentation__c()==null) || 
             (this.documentation__c!=null &&
              this.documentation__c.equals(other.getDocumentation__c()))) &&
            ((this.EP_Survey_Type__c==null && other.getEP_Survey_Type__c()==null) || 
             (this.EP_Survey_Type__c!=null &&
              this.EP_Survey_Type__c.equals(other.getEP_Survey_Type__c()))) &&
            ((this.email_Address__c==null && other.getEmail_Address__c()==null) || 
             (this.email_Address__c!=null &&
              this.email_Address__c.equals(other.getEmail_Address__c()))) &&
            ((this.FM_Date_entry_functionality__c==null && other.getFM_Date_entry_functionality__c()==null) || 
             (this.FM_Date_entry_functionality__c!=null &&
              this.FM_Date_entry_functionality__c.equals(other.getFM_Date_entry_functionality__c()))) &&
            ((this.features_Used__c==null && other.getFeatures_Used__c()==null) || 
             (this.features_Used__c!=null &&
              this.features_Used__c.equals(other.getFeatures_Used__c()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
            ((this.how_do_you_use_Relativity__c==null && other.getHow_do_you_use_Relativity__c()==null) || 
             (this.how_do_you_use_Relativity__c!=null &&
              this.how_do_you_use_Relativity__c.equals(other.getHow_do_you_use_Relativity__c()))) &&
            ((this.how_long_have_you_been_using_Relativity__c==null && other.getHow_long_have_you_been_using_Relativity__c()==null) || 
             (this.how_long_have_you_been_using_Relativity__c!=null &&
              this.how_long_have_you_been_using_Relativity__c.equals(other.getHow_long_have_you_been_using_Relativity__c()))) &&
            ((this.how_often_do_you_read_release_notes__c==null && other.getHow_often_do_you_read_release_notes__c()==null) || 
             (this.how_often_do_you_read_release_notes__c!=null &&
              this.how_often_do_you_read_release_notes__c.equals(other.getHow_often_do_you_read_release_notes__c()))) &&
            ((this.how_often_do_you_watch_release_videos__c==null && other.getHow_often_do_you_watch_release_videos__c()==null) || 
             (this.how_often_do_you_watch_release_videos__c!=null &&
              this.how_often_do_you_watch_release_videos__c.equals(other.getHow_often_do_you_watch_release_videos__c()))) &&
            ((this.intuitive_and_easy_to_use__c==null && other.getIntuitive_and_easy_to_use__c()==null) || 
             (this.intuitive_and_easy_to_use__c!=null &&
              this.intuitive_and_easy_to_use__c.equals(other.getIntuitive_and_easy_to_use__c()))) &&
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
            ((this.least_Stable_Feature__c==null && other.getLeast_Stable_Feature__c()==null) || 
             (this.least_Stable_Feature__c!=null &&
              this.least_Stable_Feature__c.equals(other.getLeast_Stable_Feature__c()))) &&
            ((this.level_of_Customization__c==null && other.getLevel_of_Customization__c()==null) || 
             (this.level_of_Customization__c!=null &&
              this.level_of_Customization__c.equals(other.getLevel_of_Customization__c()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.name__c==null && other.getName__c()==null) || 
             (this.name__c!=null &&
              this.name__c.equals(other.getName__c()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.OK_to_Contact__c==null && other.getOK_to_Contact__c()==null) || 
             (this.OK_to_Contact__c!=null &&
              this.OK_to_Contact__c.equals(other.getOK_to_Contact__c()))) &&
            ((this.one_Thing_to_Make_More_Stable__c==null && other.getOne_Thing_to_Make_More_Stable__c()==null) || 
             (this.one_Thing_to_Make_More_Stable__c!=null &&
              this.one_Thing_to_Make_More_Stable__c.equals(other.getOne_Thing_to_Make_More_Stable__c()))) &&
            ((this.other_Features__c==null && other.getOther_Features__c()==null) || 
             (this.other_Features__c!=null &&
              this.other_Features__c.equals(other.getOther_Features__c()))) &&
            ((this.other_Products__c==null && other.getOther_Products__c()==null) || 
             (this.other_Products__c!=null &&
              this.other_Products__c.equals(other.getOther_Products__c()))) &&
            ((this.other_documentation_access__c==null && other.getOther_documentation_access__c()==null) || 
             (this.other_documentation_access__c!=null &&
              this.other_documentation_access__c.equals(other.getOther_documentation_access__c()))) &&
            ((this.other_tasks__c==null && other.getOther_tasks__c()==null) || 
             (this.other_tasks__c!=null &&
              this.other_tasks__c.equals(other.getOther_tasks__c()))) &&
            ((this.overall_Satisfaction__c==null && other.getOverall_Satisfaction__c()==null) || 
             (this.overall_Satisfaction__c!=null &&
              this.overall_Satisfaction__c.equals(other.getOverall_Satisfaction__c()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.participate_in_online_community__c==null && other.getParticipate_in_online_community__c()==null) || 
             (this.participate_in_online_community__c!=null &&
              this.participate_in_online_community__c.equals(other.getParticipate_in_online_community__c()))) &&
            ((this.phone__c==null && other.getPhone__c()==null) || 
             (this.phone__c!=null &&
              this.phone__c.equals(other.getPhone__c()))) &&
            ((this.position__c==null && other.getPosition__c()==null) || 
             (this.position__c!=null &&
              this.position__c.equals(other.getPosition__c()))) &&
            ((this.preferred_contact_method__c==null && other.getPreferred_contact_method__c()==null) || 
             (this.preferred_contact_method__c!=null &&
              this.preferred_contact_method__c.equals(other.getPreferred_contact_method__c()))) &&
            ((this.problems_Installing_Fact_Manager__c==null && other.getProblems_Installing_Fact_Manager__c()==null) || 
             (this.problems_Installing_Fact_Manager__c!=null &&
              this.problems_Installing_Fact_Manager__c.equals(other.getProblems_Installing_Fact_Manager__c()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.product__c==null && other.getProduct__c()==null) || 
             (this.product__c!=null &&
              this.product__c.equals(other.getProduct__c()))) &&
            ((this.products_Used__c==null && other.getProducts_Used__c()==null) || 
             (this.products_Used__c!=null &&
              this.products_Used__c.equals(other.getProducts_Used__c()))) &&
            ((this.recordType==null && other.getRecordType()==null) || 
             (this.recordType!=null &&
              this.recordType.equals(other.getRecordType()))) &&
            ((this.recordTypeId==null && other.getRecordTypeId()==null) || 
             (this.recordTypeId!=null &&
              this.recordTypeId.equals(other.getRecordTypeId()))) &&
            ((this.relativity_Stability__c==null && other.getRelativity_Stability__c()==null) || 
             (this.relativity_Stability__c!=null &&
              this.relativity_Stability__c.equals(other.getRelativity_Stability__c()))) &&
            ((this.relativity_Version__c==null && other.getRelativity_Version__c()==null) || 
             (this.relativity_Version__c!=null &&
              this.relativity_Version__c.equals(other.getRelativity_Version__c()))) &&
            ((this.relativity_training__c==null && other.getRelativity_training__c()==null) || 
             (this.relativity_training__c!=null &&
              this.relativity_training__c.equals(other.getRelativity_training__c()))) &&
            ((this.reporting__c==null && other.getReporting__c()==null) || 
             (this.reporting__c!=null &&
              this.reporting__c.equals(other.getReporting__c()))) &&
            ((this.reused_Documentation__c==null && other.getReused_Documentation__c()==null) || 
             (this.reused_Documentation__c!=null &&
              this.reused_Documentation__c.equals(other.getReused_Documentation__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tasks_performed_when_using_documentation__c==null && other.getTasks_performed_when_using_documentation__c()==null) || 
             (this.tasks_performed_when_using_documentation__c!=null &&
              this.tasks_performed_when_using_documentation__c.equals(other.getTasks_performed_when_using_documentation__c()))) &&
            ((this.user_Email__c==null && other.getUser_Email__c()==null) || 
             (this.user_Email__c!=null &&
              this.user_Email__c.equals(other.getUser_Email__c()))) &&
            ((this.user_name__c==null && other.getUser_name__c()==null) || 
             (this.user_name__c!=null &&
              this.user_name__c.equals(other.getUser_name__c()))) &&
            ((this.what_actions_to_improve_documentation__c==null && other.getWhat_actions_to_improve_documentation__c()==null) || 
             (this.what_actions_to_improve_documentation__c!=null &&
              this.what_actions_to_improve_documentation__c.equals(other.getWhat_actions_to_improve_documentation__c()))) &&
            ((this.workflow_Outside_of_Relativity__c==null && other.getWorkflow_Outside_of_Relativity__c()==null) || 
             (this.workflow_Outside_of_Relativity__c!=null &&
              this.workflow_Outside_of_Relativity__c.equals(other.getWorkflow_Outside_of_Relativity__c()))) &&
            ((this.workspaces_Fact_Manager_installed_to__c==null && other.getWorkspaces_Fact_Manager_installed_to__c()==null) || 
             (this.workspaces_Fact_Manager_installed_to__c!=null &&
              this.workspaces_Fact_Manager_installed_to__c.equals(other.getWorkspaces_Fact_Manager_installed_to__c()))) &&
            ((this.workspaces_Installed_to__c==null && other.getWorkspaces_Installed_to__c()==null) || 
             (this.workspaces_Installed_to__c!=null &&
              this.workspaces_Installed_to__c.equals(other.getWorkspaces_Installed_to__c()))) &&
            ((this.has_helpful_graphics__c==null && other.getHas_helpful_graphics__c()==null) || 
             (this.has_helpful_graphics__c!=null &&
              this.has_helpful_graphics__c.equals(other.getHas_helpful_graphics__c()))) &&
            ((this.is_accurate__c==null && other.getIs_accurate__c()==null) || 
             (this.is_accurate__c!=null &&
              this.is_accurate__c.equals(other.getIs_accurate__c()))) &&
            ((this.is_complete__c==null && other.getIs_complete__c()==null) || 
             (this.is_complete__c!=null &&
              this.is_complete__c.equals(other.getIs_complete__c()))) &&
            ((this.is_easy_to_access__c==null && other.getIs_easy_to_access__c()==null) || 
             (this.is_easy_to_access__c!=null &&
              this.is_easy_to_access__c.equals(other.getIs_easy_to_access__c()))) &&
            ((this.is_easy_to_use__c==null && other.getIs_easy_to_use__c()==null) || 
             (this.is_easy_to_use__c!=null &&
              this.is_easy_to_use__c.equals(other.getIs_easy_to_use__c()))) &&
            ((this.is_well_organized__c==null && other.getIs_well_organized__c()==null) || 
             (this.is_well_organized__c!=null &&
              this.is_well_organized__c.equals(other.getIs_well_organized__c()))) &&
            ((this.use_a_feedback_system_to_comment__c==null && other.getUse_a_feedback_system_to_comment__c()==null) || 
             (this.use_a_feedback_system_to_comment__c!=null &&
              this.use_a_feedback_system_to_comment__c.equals(other.getUse_a_feedback_system_to_comment__c()))) &&
            ((this.use_a_feedback_system_to_rate_content__c==null && other.getUse_a_feedback_system_to_rate_content__c()==null) || 
             (this.use_a_feedback_system_to_rate_content__c!=null &&
              this.use_a_feedback_system_to_rate_content__c.equals(other.getUse_a_feedback_system_to_rate_content__c()))) &&
            ((this.use_online_help_in_Relativity__c==null && other.getUse_online_help_in_Relativity__c()==null) || 
             (this.use_online_help_in_Relativity__c!=null &&
              this.use_online_help_in_Relativity__c.equals(other.getUse_online_help_in_Relativity__c())));
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
        if (getAccess_documentation__c() != null) {
            _hashCode += getAccess_documentation__c().hashCode();
        }
        if (getAdditional_Comments__c() != null) {
            _hashCode += getAdditional_Comments__c().hashCode();
        }
        if (getAdditional_Documentation__c() != null) {
            _hashCode += getAdditional_Documentation__c().hashCode();
        }
        if (getAdditional_Stability_Info__c() != null) {
            _hashCode += getAdditional_Stability_Info__c().hashCode();
        }
        if (getAllow_reviewer_access_to_online_help__c() != null) {
            _hashCode += getAllow_reviewer_access_to_online_help__c().hashCode();
        }
        if (getAre_tutorials_useful__c() != null) {
            _hashCode += getAre_tutorials_useful__c().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getCompany__c() != null) {
            _hashCode += getCompany__c().hashCode();
        }
        if (getContent_Download_Notification__c() != null) {
            _hashCode += getContent_Download_Notification__c().hashCode();
        }
        if (getContent_Download_Notification__r() != null) {
            _hashCode += getContent_Download_Notification__r().hashCode();
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
        if (getDocumentation__c() != null) {
            _hashCode += getDocumentation__c().hashCode();
        }
        if (getEP_Survey_Type__c() != null) {
            _hashCode += getEP_Survey_Type__c().hashCode();
        }
        if (getEmail_Address__c() != null) {
            _hashCode += getEmail_Address__c().hashCode();
        }
        if (getFM_Date_entry_functionality__c() != null) {
            _hashCode += getFM_Date_entry_functionality__c().hashCode();
        }
        if (getFeatures_Used__c() != null) {
            _hashCode += getFeatures_Used__c().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getHistories() != null) {
            _hashCode += getHistories().hashCode();
        }
        if (getHow_do_you_use_Relativity__c() != null) {
            _hashCode += getHow_do_you_use_Relativity__c().hashCode();
        }
        if (getHow_long_have_you_been_using_Relativity__c() != null) {
            _hashCode += getHow_long_have_you_been_using_Relativity__c().hashCode();
        }
        if (getHow_often_do_you_read_release_notes__c() != null) {
            _hashCode += getHow_often_do_you_read_release_notes__c().hashCode();
        }
        if (getHow_often_do_you_watch_release_videos__c() != null) {
            _hashCode += getHow_often_do_you_watch_release_videos__c().hashCode();
        }
        if (getIntuitive_and_easy_to_use__c() != null) {
            _hashCode += getIntuitive_and_easy_to_use__c().hashCode();
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
        if (getLeast_Stable_Feature__c() != null) {
            _hashCode += getLeast_Stable_Feature__c().hashCode();
        }
        if (getLevel_of_Customization__c() != null) {
            _hashCode += getLevel_of_Customization__c().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getName__c() != null) {
            _hashCode += getName__c().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getNotesAndAttachments() != null) {
            _hashCode += getNotesAndAttachments().hashCode();
        }
        if (getOK_to_Contact__c() != null) {
            _hashCode += getOK_to_Contact__c().hashCode();
        }
        if (getOne_Thing_to_Make_More_Stable__c() != null) {
            _hashCode += getOne_Thing_to_Make_More_Stable__c().hashCode();
        }
        if (getOther_Features__c() != null) {
            _hashCode += getOther_Features__c().hashCode();
        }
        if (getOther_Products__c() != null) {
            _hashCode += getOther_Products__c().hashCode();
        }
        if (getOther_documentation_access__c() != null) {
            _hashCode += getOther_documentation_access__c().hashCode();
        }
        if (getOther_tasks__c() != null) {
            _hashCode += getOther_tasks__c().hashCode();
        }
        if (getOverall_Satisfaction__c() != null) {
            _hashCode += getOverall_Satisfaction__c().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getParticipate_in_online_community__c() != null) {
            _hashCode += getParticipate_in_online_community__c().hashCode();
        }
        if (getPhone__c() != null) {
            _hashCode += getPhone__c().hashCode();
        }
        if (getPosition__c() != null) {
            _hashCode += getPosition__c().hashCode();
        }
        if (getPreferred_contact_method__c() != null) {
            _hashCode += getPreferred_contact_method__c().hashCode();
        }
        if (getProblems_Installing_Fact_Manager__c() != null) {
            _hashCode += getProblems_Installing_Fact_Manager__c().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getProduct__c() != null) {
            _hashCode += getProduct__c().hashCode();
        }
        if (getProducts_Used__c() != null) {
            _hashCode += getProducts_Used__c().hashCode();
        }
        if (getRecordType() != null) {
            _hashCode += getRecordType().hashCode();
        }
        if (getRecordTypeId() != null) {
            _hashCode += getRecordTypeId().hashCode();
        }
        if (getRelativity_Stability__c() != null) {
            _hashCode += getRelativity_Stability__c().hashCode();
        }
        if (getRelativity_Version__c() != null) {
            _hashCode += getRelativity_Version__c().hashCode();
        }
        if (getRelativity_training__c() != null) {
            _hashCode += getRelativity_training__c().hashCode();
        }
        if (getReporting__c() != null) {
            _hashCode += getReporting__c().hashCode();
        }
        if (getReused_Documentation__c() != null) {
            _hashCode += getReused_Documentation__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTasks_performed_when_using_documentation__c() != null) {
            _hashCode += getTasks_performed_when_using_documentation__c().hashCode();
        }
        if (getUser_Email__c() != null) {
            _hashCode += getUser_Email__c().hashCode();
        }
        if (getUser_name__c() != null) {
            _hashCode += getUser_name__c().hashCode();
        }
        if (getWhat_actions_to_improve_documentation__c() != null) {
            _hashCode += getWhat_actions_to_improve_documentation__c().hashCode();
        }
        if (getWorkflow_Outside_of_Relativity__c() != null) {
            _hashCode += getWorkflow_Outside_of_Relativity__c().hashCode();
        }
        if (getWorkspaces_Fact_Manager_installed_to__c() != null) {
            _hashCode += getWorkspaces_Fact_Manager_installed_to__c().hashCode();
        }
        if (getWorkspaces_Installed_to__c() != null) {
            _hashCode += getWorkspaces_Installed_to__c().hashCode();
        }
        if (getHas_helpful_graphics__c() != null) {
            _hashCode += getHas_helpful_graphics__c().hashCode();
        }
        if (getIs_accurate__c() != null) {
            _hashCode += getIs_accurate__c().hashCode();
        }
        if (getIs_complete__c() != null) {
            _hashCode += getIs_complete__c().hashCode();
        }
        if (getIs_easy_to_access__c() != null) {
            _hashCode += getIs_easy_to_access__c().hashCode();
        }
        if (getIs_easy_to_use__c() != null) {
            _hashCode += getIs_easy_to_use__c().hashCode();
        }
        if (getIs_well_organized__c() != null) {
            _hashCode += getIs_well_organized__c().hashCode();
        }
        if (getUse_a_feedback_system_to_comment__c() != null) {
            _hashCode += getUse_a_feedback_system_to_comment__c().hashCode();
        }
        if (getUse_a_feedback_system_to_rate_content__c() != null) {
            _hashCode += getUse_a_feedback_system_to_rate_content__c().hashCode();
        }
        if (getUse_online_help_in_Relativity__c() != null) {
            _hashCode += getUse_online_help_in_Relativity__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Misc_Survey__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Misc_Survey__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("access_documentation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Access_documentation__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additional_Comments__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Additional_Comments__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additional_Documentation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Additional_Documentation__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additional_Stability_Info__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Additional_Stability_Info__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allow_reviewer_access_to_online_help__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Allow_reviewer_access_to_online_help__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("are_tutorials_useful__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Are_tutorials_useful__c"));
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
        elemField.setFieldName("company__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Company__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content_Download_Notification__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Content_Download_Notification__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content_Download_Notification__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Content_Download_Notification__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Content_Download_Notification__c"));
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
        elemField.setFieldName("documentation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Documentation__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EP_Survey_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EP_Survey_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email_Address__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Email_Address__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FM_Date_entry_functionality__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FM_Date_entry_functionality__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("features_Used__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Features_Used__c"));
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
        elemField.setFieldName("histories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Histories"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("how_do_you_use_Relativity__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "How_do_you_use_Relativity__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("how_long_have_you_been_using_Relativity__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "How_long_have_you_been_using_Relativity__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("how_often_do_you_read_release_notes__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "How_often_do_you_read_release_notes__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("how_often_do_you_watch_release_videos__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "How_often_do_you_watch_release_videos__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intuitive_and_easy_to_use__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Intuitive_and_easy_to_use__c"));
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
        elemField.setFieldName("least_Stable_Feature__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Least_Stable_Feature__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("level_of_Customization__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Level_of_Customization__c"));
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
        elemField.setFieldName("name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name__c"));
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
        elemField.setFieldName("OK_to_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OK_to_Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("one_Thing_to_Make_More_Stable__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "One_Thing_to_Make_More_Stable__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("other_Features__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Other_Features__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("other_Products__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Other_Products__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("other_documentation_access__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Other_documentation_access__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("other_tasks__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Other_tasks__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overall_Satisfaction__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Overall_Satisfaction__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("participate_in_online_community__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Participate_in_online_community__c"));
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
        elemField.setFieldName("position__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Position__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferred_contact_method__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Preferred_contact_method__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("problems_Installing_Fact_Manager__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Problems_Installing_Fact_Manager__c"));
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
        elemField.setFieldName("product__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Product__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("products_Used__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Products_Used__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("relativity_Stability__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relativity_Stability__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("relativity_training__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relativity_training__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reporting__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Reporting__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reused_Documentation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Reused_Documentation__c"));
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
        elemField.setFieldName("tasks_performed_when_using_documentation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tasks_performed_when_using_documentation__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_Email__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User_Email__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User_name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("what_actions_to_improve_documentation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "What_actions_to_improve_documentation__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflow_Outside_of_Relativity__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Workflow_Outside_of_Relativity__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workspaces_Fact_Manager_installed_to__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Workspaces_Fact_Manager_installed_to__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workspaces_Installed_to__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Workspaces_Installed_to__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("has_helpful_graphics__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "has_helpful_graphics__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("is_accurate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "is_accurate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("is_complete__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "is_complete__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("is_easy_to_access__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "is_easy_to_access__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("is_easy_to_use__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "is_easy_to_use__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("is_well_organized__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "is_well_organized__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("use_a_feedback_system_to_comment__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "use_a_feedback_system_to_comment__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("use_a_feedback_system_to_rate_content__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "use_a_feedback_system_to_rate_content__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("use_online_help_in_Relativity__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "use_online_help_in_Relativity__c"));
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

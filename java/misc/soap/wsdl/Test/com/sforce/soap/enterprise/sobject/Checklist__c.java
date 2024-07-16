/**
 * Checklist__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Checklist__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String account_Comment__c;

    private java.lang.Boolean account__c;

    private java.lang.Boolean add_coded_doc_to_the_production_set__c;

    private java.lang.Boolean add_issues_field_to_object_layout__c;

    private java.lang.Boolean add_new_user_to_the_System_Admin_group__c;

    private java.lang.Boolean add_object_on_document_layout__c;

    private java.lang.Boolean add_the_field_to_the_layout__c;

    private java.lang.String area_Comment__c;

    private java.lang.String articles_Comment__c;

    private java.lang.String attachment_Comments__c;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.Boolean attachments_checkbox__c;

    private java.lang.String CLient_Last_Contacted_Comment__c;

    private java.lang.String case_Time_Comment__c;

    private java.lang.Boolean case_Time__c;

    private java.lang.String category_Comment__c;

    private java.lang.Boolean category__c;

    private java.lang.String change_Control__c;

    private com.sforce.soap.enterprise.sobject.Change_Control__c change_Control__r;

    private java.lang.Boolean check_the_user_tab__c;

    private java.lang.Boolean client_Last_Contacted_Comment_Checkbox__c;

    private java.lang.Boolean code_the_document_set_to_Responsive__c;

    private java.lang.String comments__c;

    private java.lang.Boolean compare_two_non_duplicate_docs__c;

    private java.lang.String contact_Comment__c;

    private java.lang.Boolean contact__c;

    private java.lang.Boolean create_Begin_Bates_and_End_Bates_fields__c;

    private java.lang.Boolean create_Similar_Documents__c;

    private java.lang.Boolean create_a_Production_Set__c;

    private java.lang.Boolean create_a_case__c;

    private java.lang.Boolean create_a_new_Analytics_Index__c;

    private java.lang.Boolean create_a_new_Case_object__c;

    private java.lang.Boolean create_a_new_Summary_Report__c;

    private java.lang.Boolean create_a_new_choice_for_the_above_field__c;

    private java.lang.Boolean create_a_new_dtSearch_index__c;

    private java.lang.Boolean create_a_new_field_single_choice__c;

    private java.lang.Boolean create_a_new_layout__c;

    private java.lang.Boolean create_a_new_markup_set__c;

    private java.lang.Boolean create_a_new_saved_search__c;

    private java.lang.Boolean create_a_new_user__c;

    private java.lang.Boolean create_a_new_view__c;

    private java.lang.Boolean create_and_run_a_search_term_report__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.Boolean date_Time_Outage_Started_Restored__c;

    private java.lang.String date_Time_out_Started_Restored_Commen__c;

    private java.util.Date date_of_Deployment__c;

    private java.util.Date date_of_First_Case_Load__c;

    private java.lang.Boolean delete_production_image__c;

    private java.lang.Boolean delete_the_Smoke_Test_Workspace__c;

    private java.lang.String description_Comment__c;

    private java.lang.Boolean description__c;

    private java.lang.String design_of_Documentations__c;

    private java.lang.String error_Comment__c;

    private java.lang.Boolean error__c;

    private java.lang.String escalation_Field_Comment__c;

    private java.lang.Boolean escalation_Field__c;

    private java.lang.Boolean export_production__c;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.Boolean image_the_native_document__c;

    private java.lang.Boolean isDeleted;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.Boolean NET_3_5_SP1_or_higher_is_installed__c;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private java.lang.Double number_of_Users_in_the_Case__c;

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private java.lang.String parent_Ticket_Comment__c;

    private java.lang.Boolean parent_Ticket__c;

    private java.lang.Boolean pivot__c;

    private java.lang.String points_of_Frustration_During_Setup__c;

    private java.lang.Boolean print_the_image_including_redactions__c;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.Boolean purge_Batches__c;

    private java.lang.Boolean QC_Articles_Checkbox__c;

    private com.sforce.soap.enterprise.sobject.RecordType recordType;

    private java.lang.String recordTypeId;

    private java.lang.Boolean redact_the_image_using_new_markup_set__c;

    private java.lang.String review_of_Templates__c;

    private java.lang.String root_Cause_Comment__c;

    private java.lang.Boolean root_Cause_checkbox__c;

    private java.lang.Boolean run_a_keyword_Search_for__c;

    private java.lang.Boolean run_a_mass_operation_to_Build_Word_Index__c;

    private java.lang.Boolean run_a_mass_operation_to_Cluster__c;

    private java.lang.Boolean run_a_search_using_the_Relativity_index__c;

    private java.lang.Boolean run_a_simple_keyword_search__c;

    private java.lang.Boolean run_the_production__c;

    private java.lang.Boolean select_to_include_family_for_the_view__c;

    private java.lang.Boolean set_up_auto_batch__c;

    private java.lang.Boolean setup_Transform_Set__c;

    private java.lang.String size_of_Case__c;

    private java.lang.String status_Comment__c;

    private java.lang.String status_Description_Comment__c;

    private java.lang.Boolean status_Description__c;

    private java.lang.Boolean status__c;

    private java.lang.String subject_Comment__c;

    private java.lang.Boolean subject__c;

    private java.lang.String success_with_Setup_and_Use__c;

    private java.util.Calendar systemModstamp;

    private java.lang.String system_Change__c;

    private com.sforce.soap.enterprise.sobject.System_Changes__c system_Change__r;

    private java.lang.String ticket_Origin_Comment__c;

    private java.lang.Boolean ticket_Origin__c;

    private java.lang.String ticket__c;

    private com.sforce.soap.enterprise.sobject._case ticket__r;

    private java.lang.String type_Comments__c;

    private java.lang.Boolean type__c;

    private java.lang.String type_of_Case__c;

    private java.lang.Boolean upgrading_5_09_read_help_arrow__c;

    private java.lang.Boolean upload_the_test_data__c;

    private java.lang.Boolean verify_all_actions_were_recorded__c;

    private java.lang.Boolean verify_documents_are_clustered__c;

    private java.lang.Boolean verify_that_the_correct_logo_displays__c;

    private java.lang.Boolean verify_that_the_disclaimer_is_working__c;

    private java.lang.Boolean verify_the_one_coded_doc_is_returned__c;

    private java.lang.Boolean verify_the_production_mode_is_now_active__c;

    private java.lang.Boolean verify_the_word_index_is_searchable__c;

    private java.util.Date date_of_1St_Case_Load__c;

    public Checklist__c() {
    }

    public Checklist__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String account_Comment__c,
           java.lang.Boolean account__c,
           java.lang.Boolean add_coded_doc_to_the_production_set__c,
           java.lang.Boolean add_issues_field_to_object_layout__c,
           java.lang.Boolean add_new_user_to_the_System_Admin_group__c,
           java.lang.Boolean add_object_on_document_layout__c,
           java.lang.Boolean add_the_field_to_the_layout__c,
           java.lang.String area_Comment__c,
           java.lang.String articles_Comment__c,
           java.lang.String attachment_Comments__c,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.Boolean attachments_checkbox__c,
           java.lang.String CLient_Last_Contacted_Comment__c,
           java.lang.String case_Time_Comment__c,
           java.lang.Boolean case_Time__c,
           java.lang.String category_Comment__c,
           java.lang.Boolean category__c,
           java.lang.String change_Control__c,
           com.sforce.soap.enterprise.sobject.Change_Control__c change_Control__r,
           java.lang.Boolean check_the_user_tab__c,
           java.lang.Boolean client_Last_Contacted_Comment_Checkbox__c,
           java.lang.Boolean code_the_document_set_to_Responsive__c,
           java.lang.String comments__c,
           java.lang.Boolean compare_two_non_duplicate_docs__c,
           java.lang.String contact_Comment__c,
           java.lang.Boolean contact__c,
           java.lang.Boolean create_Begin_Bates_and_End_Bates_fields__c,
           java.lang.Boolean create_Similar_Documents__c,
           java.lang.Boolean create_a_Production_Set__c,
           java.lang.Boolean create_a_case__c,
           java.lang.Boolean create_a_new_Analytics_Index__c,
           java.lang.Boolean create_a_new_Case_object__c,
           java.lang.Boolean create_a_new_Summary_Report__c,
           java.lang.Boolean create_a_new_choice_for_the_above_field__c,
           java.lang.Boolean create_a_new_dtSearch_index__c,
           java.lang.Boolean create_a_new_field_single_choice__c,
           java.lang.Boolean create_a_new_layout__c,
           java.lang.Boolean create_a_new_markup_set__c,
           java.lang.Boolean create_a_new_saved_search__c,
           java.lang.Boolean create_a_new_user__c,
           java.lang.Boolean create_a_new_view__c,
           java.lang.Boolean create_and_run_a_search_term_report__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.Boolean date_Time_Outage_Started_Restored__c,
           java.lang.String date_Time_out_Started_Restored_Commen__c,
           java.util.Date date_of_Deployment__c,
           java.util.Date date_of_First_Case_Load__c,
           java.lang.Boolean delete_production_image__c,
           java.lang.Boolean delete_the_Smoke_Test_Workspace__c,
           java.lang.String description_Comment__c,
           java.lang.Boolean description__c,
           java.lang.String design_of_Documentations__c,
           java.lang.String error_Comment__c,
           java.lang.Boolean error__c,
           java.lang.String escalation_Field_Comment__c,
           java.lang.Boolean escalation_Field__c,
           java.lang.Boolean export_production__c,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.Boolean image_the_native_document__c,
           java.lang.Boolean isDeleted,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.Boolean NET_3_5_SP1_or_higher_is_installed__c,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           java.lang.Double number_of_Users_in_the_Case__c,
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           java.lang.String parent_Ticket_Comment__c,
           java.lang.Boolean parent_Ticket__c,
           java.lang.Boolean pivot__c,
           java.lang.String points_of_Frustration_During_Setup__c,
           java.lang.Boolean print_the_image_including_redactions__c,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.Boolean purge_Batches__c,
           java.lang.Boolean QC_Articles_Checkbox__c,
           com.sforce.soap.enterprise.sobject.RecordType recordType,
           java.lang.String recordTypeId,
           java.lang.Boolean redact_the_image_using_new_markup_set__c,
           java.lang.String review_of_Templates__c,
           java.lang.String root_Cause_Comment__c,
           java.lang.Boolean root_Cause_checkbox__c,
           java.lang.Boolean run_a_keyword_Search_for__c,
           java.lang.Boolean run_a_mass_operation_to_Build_Word_Index__c,
           java.lang.Boolean run_a_mass_operation_to_Cluster__c,
           java.lang.Boolean run_a_search_using_the_Relativity_index__c,
           java.lang.Boolean run_a_simple_keyword_search__c,
           java.lang.Boolean run_the_production__c,
           java.lang.Boolean select_to_include_family_for_the_view__c,
           java.lang.Boolean set_up_auto_batch__c,
           java.lang.Boolean setup_Transform_Set__c,
           java.lang.String size_of_Case__c,
           java.lang.String status_Comment__c,
           java.lang.String status_Description_Comment__c,
           java.lang.Boolean status_Description__c,
           java.lang.Boolean status__c,
           java.lang.String subject_Comment__c,
           java.lang.Boolean subject__c,
           java.lang.String success_with_Setup_and_Use__c,
           java.util.Calendar systemModstamp,
           java.lang.String system_Change__c,
           com.sforce.soap.enterprise.sobject.System_Changes__c system_Change__r,
           java.lang.String ticket_Origin_Comment__c,
           java.lang.Boolean ticket_Origin__c,
           java.lang.String ticket__c,
           com.sforce.soap.enterprise.sobject._case ticket__r,
           java.lang.String type_Comments__c,
           java.lang.Boolean type__c,
           java.lang.String type_of_Case__c,
           java.lang.Boolean upgrading_5_09_read_help_arrow__c,
           java.lang.Boolean upload_the_test_data__c,
           java.lang.Boolean verify_all_actions_were_recorded__c,
           java.lang.Boolean verify_documents_are_clustered__c,
           java.lang.Boolean verify_that_the_correct_logo_displays__c,
           java.lang.Boolean verify_that_the_disclaimer_is_working__c,
           java.lang.Boolean verify_the_one_coded_doc_is_returned__c,
           java.lang.Boolean verify_the_production_mode_is_now_active__c,
           java.lang.Boolean verify_the_word_index_is_searchable__c,
           java.util.Date date_of_1St_Case_Load__c) {
        super(
            fieldsToNull,
            id);
        this.account_Comment__c = account_Comment__c;
        this.account__c = account__c;
        this.add_coded_doc_to_the_production_set__c = add_coded_doc_to_the_production_set__c;
        this.add_issues_field_to_object_layout__c = add_issues_field_to_object_layout__c;
        this.add_new_user_to_the_System_Admin_group__c = add_new_user_to_the_System_Admin_group__c;
        this.add_object_on_document_layout__c = add_object_on_document_layout__c;
        this.add_the_field_to_the_layout__c = add_the_field_to_the_layout__c;
        this.area_Comment__c = area_Comment__c;
        this.articles_Comment__c = articles_Comment__c;
        this.attachment_Comments__c = attachment_Comments__c;
        this.attachments = attachments;
        this.attachments_checkbox__c = attachments_checkbox__c;
        this.CLient_Last_Contacted_Comment__c = CLient_Last_Contacted_Comment__c;
        this.case_Time_Comment__c = case_Time_Comment__c;
        this.case_Time__c = case_Time__c;
        this.category_Comment__c = category_Comment__c;
        this.category__c = category__c;
        this.change_Control__c = change_Control__c;
        this.change_Control__r = change_Control__r;
        this.check_the_user_tab__c = check_the_user_tab__c;
        this.client_Last_Contacted_Comment_Checkbox__c = client_Last_Contacted_Comment_Checkbox__c;
        this.code_the_document_set_to_Responsive__c = code_the_document_set_to_Responsive__c;
        this.comments__c = comments__c;
        this.compare_two_non_duplicate_docs__c = compare_two_non_duplicate_docs__c;
        this.contact_Comment__c = contact_Comment__c;
        this.contact__c = contact__c;
        this.create_Begin_Bates_and_End_Bates_fields__c = create_Begin_Bates_and_End_Bates_fields__c;
        this.create_Similar_Documents__c = create_Similar_Documents__c;
        this.create_a_Production_Set__c = create_a_Production_Set__c;
        this.create_a_case__c = create_a_case__c;
        this.create_a_new_Analytics_Index__c = create_a_new_Analytics_Index__c;
        this.create_a_new_Case_object__c = create_a_new_Case_object__c;
        this.create_a_new_Summary_Report__c = create_a_new_Summary_Report__c;
        this.create_a_new_choice_for_the_above_field__c = create_a_new_choice_for_the_above_field__c;
        this.create_a_new_dtSearch_index__c = create_a_new_dtSearch_index__c;
        this.create_a_new_field_single_choice__c = create_a_new_field_single_choice__c;
        this.create_a_new_layout__c = create_a_new_layout__c;
        this.create_a_new_markup_set__c = create_a_new_markup_set__c;
        this.create_a_new_saved_search__c = create_a_new_saved_search__c;
        this.create_a_new_user__c = create_a_new_user__c;
        this.create_a_new_view__c = create_a_new_view__c;
        this.create_and_run_a_search_term_report__c = create_and_run_a_search_term_report__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.date_Time_Outage_Started_Restored__c = date_Time_Outage_Started_Restored__c;
        this.date_Time_out_Started_Restored_Commen__c = date_Time_out_Started_Restored_Commen__c;
        this.date_of_Deployment__c = date_of_Deployment__c;
        this.date_of_First_Case_Load__c = date_of_First_Case_Load__c;
        this.delete_production_image__c = delete_production_image__c;
        this.delete_the_Smoke_Test_Workspace__c = delete_the_Smoke_Test_Workspace__c;
        this.description_Comment__c = description_Comment__c;
        this.description__c = description__c;
        this.design_of_Documentations__c = design_of_Documentations__c;
        this.error_Comment__c = error_Comment__c;
        this.error__c = error__c;
        this.escalation_Field_Comment__c = escalation_Field_Comment__c;
        this.escalation_Field__c = escalation_Field__c;
        this.export_production__c = export_production__c;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.histories = histories;
        this.image_the_native_document__c = image_the_native_document__c;
        this.isDeleted = isDeleted;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.NET_3_5_SP1_or_higher_is_installed__c = NET_3_5_SP1_or_higher_is_installed__c;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.number_of_Users_in_the_Case__c = number_of_Users_in_the_Case__c;
        this.owner = owner;
        this.ownerId = ownerId;
        this.parent_Ticket_Comment__c = parent_Ticket_Comment__c;
        this.parent_Ticket__c = parent_Ticket__c;
        this.pivot__c = pivot__c;
        this.points_of_Frustration_During_Setup__c = points_of_Frustration_During_Setup__c;
        this.print_the_image_including_redactions__c = print_the_image_including_redactions__c;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.purge_Batches__c = purge_Batches__c;
        this.QC_Articles_Checkbox__c = QC_Articles_Checkbox__c;
        this.recordType = recordType;
        this.recordTypeId = recordTypeId;
        this.redact_the_image_using_new_markup_set__c = redact_the_image_using_new_markup_set__c;
        this.review_of_Templates__c = review_of_Templates__c;
        this.root_Cause_Comment__c = root_Cause_Comment__c;
        this.root_Cause_checkbox__c = root_Cause_checkbox__c;
        this.run_a_keyword_Search_for__c = run_a_keyword_Search_for__c;
        this.run_a_mass_operation_to_Build_Word_Index__c = run_a_mass_operation_to_Build_Word_Index__c;
        this.run_a_mass_operation_to_Cluster__c = run_a_mass_operation_to_Cluster__c;
        this.run_a_search_using_the_Relativity_index__c = run_a_search_using_the_Relativity_index__c;
        this.run_a_simple_keyword_search__c = run_a_simple_keyword_search__c;
        this.run_the_production__c = run_the_production__c;
        this.select_to_include_family_for_the_view__c = select_to_include_family_for_the_view__c;
        this.set_up_auto_batch__c = set_up_auto_batch__c;
        this.setup_Transform_Set__c = setup_Transform_Set__c;
        this.size_of_Case__c = size_of_Case__c;
        this.status_Comment__c = status_Comment__c;
        this.status_Description_Comment__c = status_Description_Comment__c;
        this.status_Description__c = status_Description__c;
        this.status__c = status__c;
        this.subject_Comment__c = subject_Comment__c;
        this.subject__c = subject__c;
        this.success_with_Setup_and_Use__c = success_with_Setup_and_Use__c;
        this.systemModstamp = systemModstamp;
        this.system_Change__c = system_Change__c;
        this.system_Change__r = system_Change__r;
        this.ticket_Origin_Comment__c = ticket_Origin_Comment__c;
        this.ticket_Origin__c = ticket_Origin__c;
        this.ticket__c = ticket__c;
        this.ticket__r = ticket__r;
        this.type_Comments__c = type_Comments__c;
        this.type__c = type__c;
        this.type_of_Case__c = type_of_Case__c;
        this.upgrading_5_09_read_help_arrow__c = upgrading_5_09_read_help_arrow__c;
        this.upload_the_test_data__c = upload_the_test_data__c;
        this.verify_all_actions_were_recorded__c = verify_all_actions_were_recorded__c;
        this.verify_documents_are_clustered__c = verify_documents_are_clustered__c;
        this.verify_that_the_correct_logo_displays__c = verify_that_the_correct_logo_displays__c;
        this.verify_that_the_disclaimer_is_working__c = verify_that_the_disclaimer_is_working__c;
        this.verify_the_one_coded_doc_is_returned__c = verify_the_one_coded_doc_is_returned__c;
        this.verify_the_production_mode_is_now_active__c = verify_the_production_mode_is_now_active__c;
        this.verify_the_word_index_is_searchable__c = verify_the_word_index_is_searchable__c;
        this.date_of_1St_Case_Load__c = date_of_1St_Case_Load__c;
    }


    /**
     * Gets the account_Comment__c value for this Checklist__c.
     * 
     * @return account_Comment__c
     */
    public java.lang.String getAccount_Comment__c() {
        return account_Comment__c;
    }


    /**
     * Sets the account_Comment__c value for this Checklist__c.
     * 
     * @param account_Comment__c
     */
    public void setAccount_Comment__c(java.lang.String account_Comment__c) {
        this.account_Comment__c = account_Comment__c;
    }


    /**
     * Gets the account__c value for this Checklist__c.
     * 
     * @return account__c
     */
    public java.lang.Boolean getAccount__c() {
        return account__c;
    }


    /**
     * Sets the account__c value for this Checklist__c.
     * 
     * @param account__c
     */
    public void setAccount__c(java.lang.Boolean account__c) {
        this.account__c = account__c;
    }


    /**
     * Gets the add_coded_doc_to_the_production_set__c value for this Checklist__c.
     * 
     * @return add_coded_doc_to_the_production_set__c
     */
    public java.lang.Boolean getAdd_coded_doc_to_the_production_set__c() {
        return add_coded_doc_to_the_production_set__c;
    }


    /**
     * Sets the add_coded_doc_to_the_production_set__c value for this Checklist__c.
     * 
     * @param add_coded_doc_to_the_production_set__c
     */
    public void setAdd_coded_doc_to_the_production_set__c(java.lang.Boolean add_coded_doc_to_the_production_set__c) {
        this.add_coded_doc_to_the_production_set__c = add_coded_doc_to_the_production_set__c;
    }


    /**
     * Gets the add_issues_field_to_object_layout__c value for this Checklist__c.
     * 
     * @return add_issues_field_to_object_layout__c
     */
    public java.lang.Boolean getAdd_issues_field_to_object_layout__c() {
        return add_issues_field_to_object_layout__c;
    }


    /**
     * Sets the add_issues_field_to_object_layout__c value for this Checklist__c.
     * 
     * @param add_issues_field_to_object_layout__c
     */
    public void setAdd_issues_field_to_object_layout__c(java.lang.Boolean add_issues_field_to_object_layout__c) {
        this.add_issues_field_to_object_layout__c = add_issues_field_to_object_layout__c;
    }


    /**
     * Gets the add_new_user_to_the_System_Admin_group__c value for this Checklist__c.
     * 
     * @return add_new_user_to_the_System_Admin_group__c
     */
    public java.lang.Boolean getAdd_new_user_to_the_System_Admin_group__c() {
        return add_new_user_to_the_System_Admin_group__c;
    }


    /**
     * Sets the add_new_user_to_the_System_Admin_group__c value for this Checklist__c.
     * 
     * @param add_new_user_to_the_System_Admin_group__c
     */
    public void setAdd_new_user_to_the_System_Admin_group__c(java.lang.Boolean add_new_user_to_the_System_Admin_group__c) {
        this.add_new_user_to_the_System_Admin_group__c = add_new_user_to_the_System_Admin_group__c;
    }


    /**
     * Gets the add_object_on_document_layout__c value for this Checklist__c.
     * 
     * @return add_object_on_document_layout__c
     */
    public java.lang.Boolean getAdd_object_on_document_layout__c() {
        return add_object_on_document_layout__c;
    }


    /**
     * Sets the add_object_on_document_layout__c value for this Checklist__c.
     * 
     * @param add_object_on_document_layout__c
     */
    public void setAdd_object_on_document_layout__c(java.lang.Boolean add_object_on_document_layout__c) {
        this.add_object_on_document_layout__c = add_object_on_document_layout__c;
    }


    /**
     * Gets the add_the_field_to_the_layout__c value for this Checklist__c.
     * 
     * @return add_the_field_to_the_layout__c
     */
    public java.lang.Boolean getAdd_the_field_to_the_layout__c() {
        return add_the_field_to_the_layout__c;
    }


    /**
     * Sets the add_the_field_to_the_layout__c value for this Checklist__c.
     * 
     * @param add_the_field_to_the_layout__c
     */
    public void setAdd_the_field_to_the_layout__c(java.lang.Boolean add_the_field_to_the_layout__c) {
        this.add_the_field_to_the_layout__c = add_the_field_to_the_layout__c;
    }


    /**
     * Gets the area_Comment__c value for this Checklist__c.
     * 
     * @return area_Comment__c
     */
    public java.lang.String getArea_Comment__c() {
        return area_Comment__c;
    }


    /**
     * Sets the area_Comment__c value for this Checklist__c.
     * 
     * @param area_Comment__c
     */
    public void setArea_Comment__c(java.lang.String area_Comment__c) {
        this.area_Comment__c = area_Comment__c;
    }


    /**
     * Gets the articles_Comment__c value for this Checklist__c.
     * 
     * @return articles_Comment__c
     */
    public java.lang.String getArticles_Comment__c() {
        return articles_Comment__c;
    }


    /**
     * Sets the articles_Comment__c value for this Checklist__c.
     * 
     * @param articles_Comment__c
     */
    public void setArticles_Comment__c(java.lang.String articles_Comment__c) {
        this.articles_Comment__c = articles_Comment__c;
    }


    /**
     * Gets the attachment_Comments__c value for this Checklist__c.
     * 
     * @return attachment_Comments__c
     */
    public java.lang.String getAttachment_Comments__c() {
        return attachment_Comments__c;
    }


    /**
     * Sets the attachment_Comments__c value for this Checklist__c.
     * 
     * @param attachment_Comments__c
     */
    public void setAttachment_Comments__c(java.lang.String attachment_Comments__c) {
        this.attachment_Comments__c = attachment_Comments__c;
    }


    /**
     * Gets the attachments value for this Checklist__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Checklist__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the attachments_checkbox__c value for this Checklist__c.
     * 
     * @return attachments_checkbox__c
     */
    public java.lang.Boolean getAttachments_checkbox__c() {
        return attachments_checkbox__c;
    }


    /**
     * Sets the attachments_checkbox__c value for this Checklist__c.
     * 
     * @param attachments_checkbox__c
     */
    public void setAttachments_checkbox__c(java.lang.Boolean attachments_checkbox__c) {
        this.attachments_checkbox__c = attachments_checkbox__c;
    }


    /**
     * Gets the CLient_Last_Contacted_Comment__c value for this Checklist__c.
     * 
     * @return CLient_Last_Contacted_Comment__c
     */
    public java.lang.String getCLient_Last_Contacted_Comment__c() {
        return CLient_Last_Contacted_Comment__c;
    }


    /**
     * Sets the CLient_Last_Contacted_Comment__c value for this Checklist__c.
     * 
     * @param CLient_Last_Contacted_Comment__c
     */
    public void setCLient_Last_Contacted_Comment__c(java.lang.String CLient_Last_Contacted_Comment__c) {
        this.CLient_Last_Contacted_Comment__c = CLient_Last_Contacted_Comment__c;
    }


    /**
     * Gets the case_Time_Comment__c value for this Checklist__c.
     * 
     * @return case_Time_Comment__c
     */
    public java.lang.String getCase_Time_Comment__c() {
        return case_Time_Comment__c;
    }


    /**
     * Sets the case_Time_Comment__c value for this Checklist__c.
     * 
     * @param case_Time_Comment__c
     */
    public void setCase_Time_Comment__c(java.lang.String case_Time_Comment__c) {
        this.case_Time_Comment__c = case_Time_Comment__c;
    }


    /**
     * Gets the case_Time__c value for this Checklist__c.
     * 
     * @return case_Time__c
     */
    public java.lang.Boolean getCase_Time__c() {
        return case_Time__c;
    }


    /**
     * Sets the case_Time__c value for this Checklist__c.
     * 
     * @param case_Time__c
     */
    public void setCase_Time__c(java.lang.Boolean case_Time__c) {
        this.case_Time__c = case_Time__c;
    }


    /**
     * Gets the category_Comment__c value for this Checklist__c.
     * 
     * @return category_Comment__c
     */
    public java.lang.String getCategory_Comment__c() {
        return category_Comment__c;
    }


    /**
     * Sets the category_Comment__c value for this Checklist__c.
     * 
     * @param category_Comment__c
     */
    public void setCategory_Comment__c(java.lang.String category_Comment__c) {
        this.category_Comment__c = category_Comment__c;
    }


    /**
     * Gets the category__c value for this Checklist__c.
     * 
     * @return category__c
     */
    public java.lang.Boolean getCategory__c() {
        return category__c;
    }


    /**
     * Sets the category__c value for this Checklist__c.
     * 
     * @param category__c
     */
    public void setCategory__c(java.lang.Boolean category__c) {
        this.category__c = category__c;
    }


    /**
     * Gets the change_Control__c value for this Checklist__c.
     * 
     * @return change_Control__c
     */
    public java.lang.String getChange_Control__c() {
        return change_Control__c;
    }


    /**
     * Sets the change_Control__c value for this Checklist__c.
     * 
     * @param change_Control__c
     */
    public void setChange_Control__c(java.lang.String change_Control__c) {
        this.change_Control__c = change_Control__c;
    }


    /**
     * Gets the change_Control__r value for this Checklist__c.
     * 
     * @return change_Control__r
     */
    public com.sforce.soap.enterprise.sobject.Change_Control__c getChange_Control__r() {
        return change_Control__r;
    }


    /**
     * Sets the change_Control__r value for this Checklist__c.
     * 
     * @param change_Control__r
     */
    public void setChange_Control__r(com.sforce.soap.enterprise.sobject.Change_Control__c change_Control__r) {
        this.change_Control__r = change_Control__r;
    }


    /**
     * Gets the check_the_user_tab__c value for this Checklist__c.
     * 
     * @return check_the_user_tab__c
     */
    public java.lang.Boolean getCheck_the_user_tab__c() {
        return check_the_user_tab__c;
    }


    /**
     * Sets the check_the_user_tab__c value for this Checklist__c.
     * 
     * @param check_the_user_tab__c
     */
    public void setCheck_the_user_tab__c(java.lang.Boolean check_the_user_tab__c) {
        this.check_the_user_tab__c = check_the_user_tab__c;
    }


    /**
     * Gets the client_Last_Contacted_Comment_Checkbox__c value for this Checklist__c.
     * 
     * @return client_Last_Contacted_Comment_Checkbox__c
     */
    public java.lang.Boolean getClient_Last_Contacted_Comment_Checkbox__c() {
        return client_Last_Contacted_Comment_Checkbox__c;
    }


    /**
     * Sets the client_Last_Contacted_Comment_Checkbox__c value for this Checklist__c.
     * 
     * @param client_Last_Contacted_Comment_Checkbox__c
     */
    public void setClient_Last_Contacted_Comment_Checkbox__c(java.lang.Boolean client_Last_Contacted_Comment_Checkbox__c) {
        this.client_Last_Contacted_Comment_Checkbox__c = client_Last_Contacted_Comment_Checkbox__c;
    }


    /**
     * Gets the code_the_document_set_to_Responsive__c value for this Checklist__c.
     * 
     * @return code_the_document_set_to_Responsive__c
     */
    public java.lang.Boolean getCode_the_document_set_to_Responsive__c() {
        return code_the_document_set_to_Responsive__c;
    }


    /**
     * Sets the code_the_document_set_to_Responsive__c value for this Checklist__c.
     * 
     * @param code_the_document_set_to_Responsive__c
     */
    public void setCode_the_document_set_to_Responsive__c(java.lang.Boolean code_the_document_set_to_Responsive__c) {
        this.code_the_document_set_to_Responsive__c = code_the_document_set_to_Responsive__c;
    }


    /**
     * Gets the comments__c value for this Checklist__c.
     * 
     * @return comments__c
     */
    public java.lang.String getComments__c() {
        return comments__c;
    }


    /**
     * Sets the comments__c value for this Checklist__c.
     * 
     * @param comments__c
     */
    public void setComments__c(java.lang.String comments__c) {
        this.comments__c = comments__c;
    }


    /**
     * Gets the compare_two_non_duplicate_docs__c value for this Checklist__c.
     * 
     * @return compare_two_non_duplicate_docs__c
     */
    public java.lang.Boolean getCompare_two_non_duplicate_docs__c() {
        return compare_two_non_duplicate_docs__c;
    }


    /**
     * Sets the compare_two_non_duplicate_docs__c value for this Checklist__c.
     * 
     * @param compare_two_non_duplicate_docs__c
     */
    public void setCompare_two_non_duplicate_docs__c(java.lang.Boolean compare_two_non_duplicate_docs__c) {
        this.compare_two_non_duplicate_docs__c = compare_two_non_duplicate_docs__c;
    }


    /**
     * Gets the contact_Comment__c value for this Checklist__c.
     * 
     * @return contact_Comment__c
     */
    public java.lang.String getContact_Comment__c() {
        return contact_Comment__c;
    }


    /**
     * Sets the contact_Comment__c value for this Checklist__c.
     * 
     * @param contact_Comment__c
     */
    public void setContact_Comment__c(java.lang.String contact_Comment__c) {
        this.contact_Comment__c = contact_Comment__c;
    }


    /**
     * Gets the contact__c value for this Checklist__c.
     * 
     * @return contact__c
     */
    public java.lang.Boolean getContact__c() {
        return contact__c;
    }


    /**
     * Sets the contact__c value for this Checklist__c.
     * 
     * @param contact__c
     */
    public void setContact__c(java.lang.Boolean contact__c) {
        this.contact__c = contact__c;
    }


    /**
     * Gets the create_Begin_Bates_and_End_Bates_fields__c value for this Checklist__c.
     * 
     * @return create_Begin_Bates_and_End_Bates_fields__c
     */
    public java.lang.Boolean getCreate_Begin_Bates_and_End_Bates_fields__c() {
        return create_Begin_Bates_and_End_Bates_fields__c;
    }


    /**
     * Sets the create_Begin_Bates_and_End_Bates_fields__c value for this Checklist__c.
     * 
     * @param create_Begin_Bates_and_End_Bates_fields__c
     */
    public void setCreate_Begin_Bates_and_End_Bates_fields__c(java.lang.Boolean create_Begin_Bates_and_End_Bates_fields__c) {
        this.create_Begin_Bates_and_End_Bates_fields__c = create_Begin_Bates_and_End_Bates_fields__c;
    }


    /**
     * Gets the create_Similar_Documents__c value for this Checklist__c.
     * 
     * @return create_Similar_Documents__c
     */
    public java.lang.Boolean getCreate_Similar_Documents__c() {
        return create_Similar_Documents__c;
    }


    /**
     * Sets the create_Similar_Documents__c value for this Checklist__c.
     * 
     * @param create_Similar_Documents__c
     */
    public void setCreate_Similar_Documents__c(java.lang.Boolean create_Similar_Documents__c) {
        this.create_Similar_Documents__c = create_Similar_Documents__c;
    }


    /**
     * Gets the create_a_Production_Set__c value for this Checklist__c.
     * 
     * @return create_a_Production_Set__c
     */
    public java.lang.Boolean getCreate_a_Production_Set__c() {
        return create_a_Production_Set__c;
    }


    /**
     * Sets the create_a_Production_Set__c value for this Checklist__c.
     * 
     * @param create_a_Production_Set__c
     */
    public void setCreate_a_Production_Set__c(java.lang.Boolean create_a_Production_Set__c) {
        this.create_a_Production_Set__c = create_a_Production_Set__c;
    }


    /**
     * Gets the create_a_case__c value for this Checklist__c.
     * 
     * @return create_a_case__c
     */
    public java.lang.Boolean getCreate_a_case__c() {
        return create_a_case__c;
    }


    /**
     * Sets the create_a_case__c value for this Checklist__c.
     * 
     * @param create_a_case__c
     */
    public void setCreate_a_case__c(java.lang.Boolean create_a_case__c) {
        this.create_a_case__c = create_a_case__c;
    }


    /**
     * Gets the create_a_new_Analytics_Index__c value for this Checklist__c.
     * 
     * @return create_a_new_Analytics_Index__c
     */
    public java.lang.Boolean getCreate_a_new_Analytics_Index__c() {
        return create_a_new_Analytics_Index__c;
    }


    /**
     * Sets the create_a_new_Analytics_Index__c value for this Checklist__c.
     * 
     * @param create_a_new_Analytics_Index__c
     */
    public void setCreate_a_new_Analytics_Index__c(java.lang.Boolean create_a_new_Analytics_Index__c) {
        this.create_a_new_Analytics_Index__c = create_a_new_Analytics_Index__c;
    }


    /**
     * Gets the create_a_new_Case_object__c value for this Checklist__c.
     * 
     * @return create_a_new_Case_object__c
     */
    public java.lang.Boolean getCreate_a_new_Case_object__c() {
        return create_a_new_Case_object__c;
    }


    /**
     * Sets the create_a_new_Case_object__c value for this Checklist__c.
     * 
     * @param create_a_new_Case_object__c
     */
    public void setCreate_a_new_Case_object__c(java.lang.Boolean create_a_new_Case_object__c) {
        this.create_a_new_Case_object__c = create_a_new_Case_object__c;
    }


    /**
     * Gets the create_a_new_Summary_Report__c value for this Checklist__c.
     * 
     * @return create_a_new_Summary_Report__c
     */
    public java.lang.Boolean getCreate_a_new_Summary_Report__c() {
        return create_a_new_Summary_Report__c;
    }


    /**
     * Sets the create_a_new_Summary_Report__c value for this Checklist__c.
     * 
     * @param create_a_new_Summary_Report__c
     */
    public void setCreate_a_new_Summary_Report__c(java.lang.Boolean create_a_new_Summary_Report__c) {
        this.create_a_new_Summary_Report__c = create_a_new_Summary_Report__c;
    }


    /**
     * Gets the create_a_new_choice_for_the_above_field__c value for this Checklist__c.
     * 
     * @return create_a_new_choice_for_the_above_field__c
     */
    public java.lang.Boolean getCreate_a_new_choice_for_the_above_field__c() {
        return create_a_new_choice_for_the_above_field__c;
    }


    /**
     * Sets the create_a_new_choice_for_the_above_field__c value for this Checklist__c.
     * 
     * @param create_a_new_choice_for_the_above_field__c
     */
    public void setCreate_a_new_choice_for_the_above_field__c(java.lang.Boolean create_a_new_choice_for_the_above_field__c) {
        this.create_a_new_choice_for_the_above_field__c = create_a_new_choice_for_the_above_field__c;
    }


    /**
     * Gets the create_a_new_dtSearch_index__c value for this Checklist__c.
     * 
     * @return create_a_new_dtSearch_index__c
     */
    public java.lang.Boolean getCreate_a_new_dtSearch_index__c() {
        return create_a_new_dtSearch_index__c;
    }


    /**
     * Sets the create_a_new_dtSearch_index__c value for this Checklist__c.
     * 
     * @param create_a_new_dtSearch_index__c
     */
    public void setCreate_a_new_dtSearch_index__c(java.lang.Boolean create_a_new_dtSearch_index__c) {
        this.create_a_new_dtSearch_index__c = create_a_new_dtSearch_index__c;
    }


    /**
     * Gets the create_a_new_field_single_choice__c value for this Checklist__c.
     * 
     * @return create_a_new_field_single_choice__c
     */
    public java.lang.Boolean getCreate_a_new_field_single_choice__c() {
        return create_a_new_field_single_choice__c;
    }


    /**
     * Sets the create_a_new_field_single_choice__c value for this Checklist__c.
     * 
     * @param create_a_new_field_single_choice__c
     */
    public void setCreate_a_new_field_single_choice__c(java.lang.Boolean create_a_new_field_single_choice__c) {
        this.create_a_new_field_single_choice__c = create_a_new_field_single_choice__c;
    }


    /**
     * Gets the create_a_new_layout__c value for this Checklist__c.
     * 
     * @return create_a_new_layout__c
     */
    public java.lang.Boolean getCreate_a_new_layout__c() {
        return create_a_new_layout__c;
    }


    /**
     * Sets the create_a_new_layout__c value for this Checklist__c.
     * 
     * @param create_a_new_layout__c
     */
    public void setCreate_a_new_layout__c(java.lang.Boolean create_a_new_layout__c) {
        this.create_a_new_layout__c = create_a_new_layout__c;
    }


    /**
     * Gets the create_a_new_markup_set__c value for this Checklist__c.
     * 
     * @return create_a_new_markup_set__c
     */
    public java.lang.Boolean getCreate_a_new_markup_set__c() {
        return create_a_new_markup_set__c;
    }


    /**
     * Sets the create_a_new_markup_set__c value for this Checklist__c.
     * 
     * @param create_a_new_markup_set__c
     */
    public void setCreate_a_new_markup_set__c(java.lang.Boolean create_a_new_markup_set__c) {
        this.create_a_new_markup_set__c = create_a_new_markup_set__c;
    }


    /**
     * Gets the create_a_new_saved_search__c value for this Checklist__c.
     * 
     * @return create_a_new_saved_search__c
     */
    public java.lang.Boolean getCreate_a_new_saved_search__c() {
        return create_a_new_saved_search__c;
    }


    /**
     * Sets the create_a_new_saved_search__c value for this Checklist__c.
     * 
     * @param create_a_new_saved_search__c
     */
    public void setCreate_a_new_saved_search__c(java.lang.Boolean create_a_new_saved_search__c) {
        this.create_a_new_saved_search__c = create_a_new_saved_search__c;
    }


    /**
     * Gets the create_a_new_user__c value for this Checklist__c.
     * 
     * @return create_a_new_user__c
     */
    public java.lang.Boolean getCreate_a_new_user__c() {
        return create_a_new_user__c;
    }


    /**
     * Sets the create_a_new_user__c value for this Checklist__c.
     * 
     * @param create_a_new_user__c
     */
    public void setCreate_a_new_user__c(java.lang.Boolean create_a_new_user__c) {
        this.create_a_new_user__c = create_a_new_user__c;
    }


    /**
     * Gets the create_a_new_view__c value for this Checklist__c.
     * 
     * @return create_a_new_view__c
     */
    public java.lang.Boolean getCreate_a_new_view__c() {
        return create_a_new_view__c;
    }


    /**
     * Sets the create_a_new_view__c value for this Checklist__c.
     * 
     * @param create_a_new_view__c
     */
    public void setCreate_a_new_view__c(java.lang.Boolean create_a_new_view__c) {
        this.create_a_new_view__c = create_a_new_view__c;
    }


    /**
     * Gets the create_and_run_a_search_term_report__c value for this Checklist__c.
     * 
     * @return create_and_run_a_search_term_report__c
     */
    public java.lang.Boolean getCreate_and_run_a_search_term_report__c() {
        return create_and_run_a_search_term_report__c;
    }


    /**
     * Sets the create_and_run_a_search_term_report__c value for this Checklist__c.
     * 
     * @param create_and_run_a_search_term_report__c
     */
    public void setCreate_and_run_a_search_term_report__c(java.lang.Boolean create_and_run_a_search_term_report__c) {
        this.create_and_run_a_search_term_report__c = create_and_run_a_search_term_report__c;
    }


    /**
     * Gets the createdBy value for this Checklist__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Checklist__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Checklist__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Checklist__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Checklist__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Checklist__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the date_Time_Outage_Started_Restored__c value for this Checklist__c.
     * 
     * @return date_Time_Outage_Started_Restored__c
     */
    public java.lang.Boolean getDate_Time_Outage_Started_Restored__c() {
        return date_Time_Outage_Started_Restored__c;
    }


    /**
     * Sets the date_Time_Outage_Started_Restored__c value for this Checklist__c.
     * 
     * @param date_Time_Outage_Started_Restored__c
     */
    public void setDate_Time_Outage_Started_Restored__c(java.lang.Boolean date_Time_Outage_Started_Restored__c) {
        this.date_Time_Outage_Started_Restored__c = date_Time_Outage_Started_Restored__c;
    }


    /**
     * Gets the date_Time_out_Started_Restored_Commen__c value for this Checklist__c.
     * 
     * @return date_Time_out_Started_Restored_Commen__c
     */
    public java.lang.String getDate_Time_out_Started_Restored_Commen__c() {
        return date_Time_out_Started_Restored_Commen__c;
    }


    /**
     * Sets the date_Time_out_Started_Restored_Commen__c value for this Checklist__c.
     * 
     * @param date_Time_out_Started_Restored_Commen__c
     */
    public void setDate_Time_out_Started_Restored_Commen__c(java.lang.String date_Time_out_Started_Restored_Commen__c) {
        this.date_Time_out_Started_Restored_Commen__c = date_Time_out_Started_Restored_Commen__c;
    }


    /**
     * Gets the date_of_Deployment__c value for this Checklist__c.
     * 
     * @return date_of_Deployment__c
     */
    public java.util.Date getDate_of_Deployment__c() {
        return date_of_Deployment__c;
    }


    /**
     * Sets the date_of_Deployment__c value for this Checklist__c.
     * 
     * @param date_of_Deployment__c
     */
    public void setDate_of_Deployment__c(java.util.Date date_of_Deployment__c) {
        this.date_of_Deployment__c = date_of_Deployment__c;
    }


    /**
     * Gets the date_of_First_Case_Load__c value for this Checklist__c.
     * 
     * @return date_of_First_Case_Load__c
     */
    public java.util.Date getDate_of_First_Case_Load__c() {
        return date_of_First_Case_Load__c;
    }


    /**
     * Sets the date_of_First_Case_Load__c value for this Checklist__c.
     * 
     * @param date_of_First_Case_Load__c
     */
    public void setDate_of_First_Case_Load__c(java.util.Date date_of_First_Case_Load__c) {
        this.date_of_First_Case_Load__c = date_of_First_Case_Load__c;
    }


    /**
     * Gets the delete_production_image__c value for this Checklist__c.
     * 
     * @return delete_production_image__c
     */
    public java.lang.Boolean getDelete_production_image__c() {
        return delete_production_image__c;
    }


    /**
     * Sets the delete_production_image__c value for this Checklist__c.
     * 
     * @param delete_production_image__c
     */
    public void setDelete_production_image__c(java.lang.Boolean delete_production_image__c) {
        this.delete_production_image__c = delete_production_image__c;
    }


    /**
     * Gets the delete_the_Smoke_Test_Workspace__c value for this Checklist__c.
     * 
     * @return delete_the_Smoke_Test_Workspace__c
     */
    public java.lang.Boolean getDelete_the_Smoke_Test_Workspace__c() {
        return delete_the_Smoke_Test_Workspace__c;
    }


    /**
     * Sets the delete_the_Smoke_Test_Workspace__c value for this Checklist__c.
     * 
     * @param delete_the_Smoke_Test_Workspace__c
     */
    public void setDelete_the_Smoke_Test_Workspace__c(java.lang.Boolean delete_the_Smoke_Test_Workspace__c) {
        this.delete_the_Smoke_Test_Workspace__c = delete_the_Smoke_Test_Workspace__c;
    }


    /**
     * Gets the description_Comment__c value for this Checklist__c.
     * 
     * @return description_Comment__c
     */
    public java.lang.String getDescription_Comment__c() {
        return description_Comment__c;
    }


    /**
     * Sets the description_Comment__c value for this Checklist__c.
     * 
     * @param description_Comment__c
     */
    public void setDescription_Comment__c(java.lang.String description_Comment__c) {
        this.description_Comment__c = description_Comment__c;
    }


    /**
     * Gets the description__c value for this Checklist__c.
     * 
     * @return description__c
     */
    public java.lang.Boolean getDescription__c() {
        return description__c;
    }


    /**
     * Sets the description__c value for this Checklist__c.
     * 
     * @param description__c
     */
    public void setDescription__c(java.lang.Boolean description__c) {
        this.description__c = description__c;
    }


    /**
     * Gets the design_of_Documentations__c value for this Checklist__c.
     * 
     * @return design_of_Documentations__c
     */
    public java.lang.String getDesign_of_Documentations__c() {
        return design_of_Documentations__c;
    }


    /**
     * Sets the design_of_Documentations__c value for this Checklist__c.
     * 
     * @param design_of_Documentations__c
     */
    public void setDesign_of_Documentations__c(java.lang.String design_of_Documentations__c) {
        this.design_of_Documentations__c = design_of_Documentations__c;
    }


    /**
     * Gets the error_Comment__c value for this Checklist__c.
     * 
     * @return error_Comment__c
     */
    public java.lang.String getError_Comment__c() {
        return error_Comment__c;
    }


    /**
     * Sets the error_Comment__c value for this Checklist__c.
     * 
     * @param error_Comment__c
     */
    public void setError_Comment__c(java.lang.String error_Comment__c) {
        this.error_Comment__c = error_Comment__c;
    }


    /**
     * Gets the error__c value for this Checklist__c.
     * 
     * @return error__c
     */
    public java.lang.Boolean getError__c() {
        return error__c;
    }


    /**
     * Sets the error__c value for this Checklist__c.
     * 
     * @param error__c
     */
    public void setError__c(java.lang.Boolean error__c) {
        this.error__c = error__c;
    }


    /**
     * Gets the escalation_Field_Comment__c value for this Checklist__c.
     * 
     * @return escalation_Field_Comment__c
     */
    public java.lang.String getEscalation_Field_Comment__c() {
        return escalation_Field_Comment__c;
    }


    /**
     * Sets the escalation_Field_Comment__c value for this Checklist__c.
     * 
     * @param escalation_Field_Comment__c
     */
    public void setEscalation_Field_Comment__c(java.lang.String escalation_Field_Comment__c) {
        this.escalation_Field_Comment__c = escalation_Field_Comment__c;
    }


    /**
     * Gets the escalation_Field__c value for this Checklist__c.
     * 
     * @return escalation_Field__c
     */
    public java.lang.Boolean getEscalation_Field__c() {
        return escalation_Field__c;
    }


    /**
     * Sets the escalation_Field__c value for this Checklist__c.
     * 
     * @param escalation_Field__c
     */
    public void setEscalation_Field__c(java.lang.Boolean escalation_Field__c) {
        this.escalation_Field__c = escalation_Field__c;
    }


    /**
     * Gets the export_production__c value for this Checklist__c.
     * 
     * @return export_production__c
     */
    public java.lang.Boolean getExport_production__c() {
        return export_production__c;
    }


    /**
     * Sets the export_production__c value for this Checklist__c.
     * 
     * @param export_production__c
     */
    public void setExport_production__c(java.lang.Boolean export_production__c) {
        this.export_production__c = export_production__c;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Checklist__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Checklist__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the histories value for this Checklist__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Checklist__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the image_the_native_document__c value for this Checklist__c.
     * 
     * @return image_the_native_document__c
     */
    public java.lang.Boolean getImage_the_native_document__c() {
        return image_the_native_document__c;
    }


    /**
     * Sets the image_the_native_document__c value for this Checklist__c.
     * 
     * @param image_the_native_document__c
     */
    public void setImage_the_native_document__c(java.lang.Boolean image_the_native_document__c) {
        this.image_the_native_document__c = image_the_native_document__c;
    }


    /**
     * Gets the isDeleted value for this Checklist__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Checklist__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this Checklist__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Checklist__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Checklist__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Checklist__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Checklist__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Checklist__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the NET_3_5_SP1_or_higher_is_installed__c value for this Checklist__c.
     * 
     * @return NET_3_5_SP1_or_higher_is_installed__c
     */
    public java.lang.Boolean getNET_3_5_SP1_or_higher_is_installed__c() {
        return NET_3_5_SP1_or_higher_is_installed__c;
    }


    /**
     * Sets the NET_3_5_SP1_or_higher_is_installed__c value for this Checklist__c.
     * 
     * @param NET_3_5_SP1_or_higher_is_installed__c
     */
    public void setNET_3_5_SP1_or_higher_is_installed__c(java.lang.Boolean NET_3_5_SP1_or_higher_is_installed__c) {
        this.NET_3_5_SP1_or_higher_is_installed__c = NET_3_5_SP1_or_higher_is_installed__c;
    }


    /**
     * Gets the name value for this Checklist__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Checklist__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Checklist__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Checklist__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Checklist__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Checklist__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the number_of_Users_in_the_Case__c value for this Checklist__c.
     * 
     * @return number_of_Users_in_the_Case__c
     */
    public java.lang.Double getNumber_of_Users_in_the_Case__c() {
        return number_of_Users_in_the_Case__c;
    }


    /**
     * Sets the number_of_Users_in_the_Case__c value for this Checklist__c.
     * 
     * @param number_of_Users_in_the_Case__c
     */
    public void setNumber_of_Users_in_the_Case__c(java.lang.Double number_of_Users_in_the_Case__c) {
        this.number_of_Users_in_the_Case__c = number_of_Users_in_the_Case__c;
    }


    /**
     * Gets the owner value for this Checklist__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Checklist__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Checklist__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Checklist__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the parent_Ticket_Comment__c value for this Checklist__c.
     * 
     * @return parent_Ticket_Comment__c
     */
    public java.lang.String getParent_Ticket_Comment__c() {
        return parent_Ticket_Comment__c;
    }


    /**
     * Sets the parent_Ticket_Comment__c value for this Checklist__c.
     * 
     * @param parent_Ticket_Comment__c
     */
    public void setParent_Ticket_Comment__c(java.lang.String parent_Ticket_Comment__c) {
        this.parent_Ticket_Comment__c = parent_Ticket_Comment__c;
    }


    /**
     * Gets the parent_Ticket__c value for this Checklist__c.
     * 
     * @return parent_Ticket__c
     */
    public java.lang.Boolean getParent_Ticket__c() {
        return parent_Ticket__c;
    }


    /**
     * Sets the parent_Ticket__c value for this Checklist__c.
     * 
     * @param parent_Ticket__c
     */
    public void setParent_Ticket__c(java.lang.Boolean parent_Ticket__c) {
        this.parent_Ticket__c = parent_Ticket__c;
    }


    /**
     * Gets the pivot__c value for this Checklist__c.
     * 
     * @return pivot__c
     */
    public java.lang.Boolean getPivot__c() {
        return pivot__c;
    }


    /**
     * Sets the pivot__c value for this Checklist__c.
     * 
     * @param pivot__c
     */
    public void setPivot__c(java.lang.Boolean pivot__c) {
        this.pivot__c = pivot__c;
    }


    /**
     * Gets the points_of_Frustration_During_Setup__c value for this Checklist__c.
     * 
     * @return points_of_Frustration_During_Setup__c
     */
    public java.lang.String getPoints_of_Frustration_During_Setup__c() {
        return points_of_Frustration_During_Setup__c;
    }


    /**
     * Sets the points_of_Frustration_During_Setup__c value for this Checklist__c.
     * 
     * @param points_of_Frustration_During_Setup__c
     */
    public void setPoints_of_Frustration_During_Setup__c(java.lang.String points_of_Frustration_During_Setup__c) {
        this.points_of_Frustration_During_Setup__c = points_of_Frustration_During_Setup__c;
    }


    /**
     * Gets the print_the_image_including_redactions__c value for this Checklist__c.
     * 
     * @return print_the_image_including_redactions__c
     */
    public java.lang.Boolean getPrint_the_image_including_redactions__c() {
        return print_the_image_including_redactions__c;
    }


    /**
     * Sets the print_the_image_including_redactions__c value for this Checklist__c.
     * 
     * @param print_the_image_including_redactions__c
     */
    public void setPrint_the_image_including_redactions__c(java.lang.Boolean print_the_image_including_redactions__c) {
        this.print_the_image_including_redactions__c = print_the_image_including_redactions__c;
    }


    /**
     * Gets the processInstances value for this Checklist__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Checklist__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Checklist__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Checklist__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the purge_Batches__c value for this Checklist__c.
     * 
     * @return purge_Batches__c
     */
    public java.lang.Boolean getPurge_Batches__c() {
        return purge_Batches__c;
    }


    /**
     * Sets the purge_Batches__c value for this Checklist__c.
     * 
     * @param purge_Batches__c
     */
    public void setPurge_Batches__c(java.lang.Boolean purge_Batches__c) {
        this.purge_Batches__c = purge_Batches__c;
    }


    /**
     * Gets the QC_Articles_Checkbox__c value for this Checklist__c.
     * 
     * @return QC_Articles_Checkbox__c
     */
    public java.lang.Boolean getQC_Articles_Checkbox__c() {
        return QC_Articles_Checkbox__c;
    }


    /**
     * Sets the QC_Articles_Checkbox__c value for this Checklist__c.
     * 
     * @param QC_Articles_Checkbox__c
     */
    public void setQC_Articles_Checkbox__c(java.lang.Boolean QC_Articles_Checkbox__c) {
        this.QC_Articles_Checkbox__c = QC_Articles_Checkbox__c;
    }


    /**
     * Gets the recordType value for this Checklist__c.
     * 
     * @return recordType
     */
    public com.sforce.soap.enterprise.sobject.RecordType getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this Checklist__c.
     * 
     * @param recordType
     */
    public void setRecordType(com.sforce.soap.enterprise.sobject.RecordType recordType) {
        this.recordType = recordType;
    }


    /**
     * Gets the recordTypeId value for this Checklist__c.
     * 
     * @return recordTypeId
     */
    public java.lang.String getRecordTypeId() {
        return recordTypeId;
    }


    /**
     * Sets the recordTypeId value for this Checklist__c.
     * 
     * @param recordTypeId
     */
    public void setRecordTypeId(java.lang.String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }


    /**
     * Gets the redact_the_image_using_new_markup_set__c value for this Checklist__c.
     * 
     * @return redact_the_image_using_new_markup_set__c
     */
    public java.lang.Boolean getRedact_the_image_using_new_markup_set__c() {
        return redact_the_image_using_new_markup_set__c;
    }


    /**
     * Sets the redact_the_image_using_new_markup_set__c value for this Checklist__c.
     * 
     * @param redact_the_image_using_new_markup_set__c
     */
    public void setRedact_the_image_using_new_markup_set__c(java.lang.Boolean redact_the_image_using_new_markup_set__c) {
        this.redact_the_image_using_new_markup_set__c = redact_the_image_using_new_markup_set__c;
    }


    /**
     * Gets the review_of_Templates__c value for this Checklist__c.
     * 
     * @return review_of_Templates__c
     */
    public java.lang.String getReview_of_Templates__c() {
        return review_of_Templates__c;
    }


    /**
     * Sets the review_of_Templates__c value for this Checklist__c.
     * 
     * @param review_of_Templates__c
     */
    public void setReview_of_Templates__c(java.lang.String review_of_Templates__c) {
        this.review_of_Templates__c = review_of_Templates__c;
    }


    /**
     * Gets the root_Cause_Comment__c value for this Checklist__c.
     * 
     * @return root_Cause_Comment__c
     */
    public java.lang.String getRoot_Cause_Comment__c() {
        return root_Cause_Comment__c;
    }


    /**
     * Sets the root_Cause_Comment__c value for this Checklist__c.
     * 
     * @param root_Cause_Comment__c
     */
    public void setRoot_Cause_Comment__c(java.lang.String root_Cause_Comment__c) {
        this.root_Cause_Comment__c = root_Cause_Comment__c;
    }


    /**
     * Gets the root_Cause_checkbox__c value for this Checklist__c.
     * 
     * @return root_Cause_checkbox__c
     */
    public java.lang.Boolean getRoot_Cause_checkbox__c() {
        return root_Cause_checkbox__c;
    }


    /**
     * Sets the root_Cause_checkbox__c value for this Checklist__c.
     * 
     * @param root_Cause_checkbox__c
     */
    public void setRoot_Cause_checkbox__c(java.lang.Boolean root_Cause_checkbox__c) {
        this.root_Cause_checkbox__c = root_Cause_checkbox__c;
    }


    /**
     * Gets the run_a_keyword_Search_for__c value for this Checklist__c.
     * 
     * @return run_a_keyword_Search_for__c
     */
    public java.lang.Boolean getRun_a_keyword_Search_for__c() {
        return run_a_keyword_Search_for__c;
    }


    /**
     * Sets the run_a_keyword_Search_for__c value for this Checklist__c.
     * 
     * @param run_a_keyword_Search_for__c
     */
    public void setRun_a_keyword_Search_for__c(java.lang.Boolean run_a_keyword_Search_for__c) {
        this.run_a_keyword_Search_for__c = run_a_keyword_Search_for__c;
    }


    /**
     * Gets the run_a_mass_operation_to_Build_Word_Index__c value for this Checklist__c.
     * 
     * @return run_a_mass_operation_to_Build_Word_Index__c
     */
    public java.lang.Boolean getRun_a_mass_operation_to_Build_Word_Index__c() {
        return run_a_mass_operation_to_Build_Word_Index__c;
    }


    /**
     * Sets the run_a_mass_operation_to_Build_Word_Index__c value for this Checklist__c.
     * 
     * @param run_a_mass_operation_to_Build_Word_Index__c
     */
    public void setRun_a_mass_operation_to_Build_Word_Index__c(java.lang.Boolean run_a_mass_operation_to_Build_Word_Index__c) {
        this.run_a_mass_operation_to_Build_Word_Index__c = run_a_mass_operation_to_Build_Word_Index__c;
    }


    /**
     * Gets the run_a_mass_operation_to_Cluster__c value for this Checklist__c.
     * 
     * @return run_a_mass_operation_to_Cluster__c
     */
    public java.lang.Boolean getRun_a_mass_operation_to_Cluster__c() {
        return run_a_mass_operation_to_Cluster__c;
    }


    /**
     * Sets the run_a_mass_operation_to_Cluster__c value for this Checklist__c.
     * 
     * @param run_a_mass_operation_to_Cluster__c
     */
    public void setRun_a_mass_operation_to_Cluster__c(java.lang.Boolean run_a_mass_operation_to_Cluster__c) {
        this.run_a_mass_operation_to_Cluster__c = run_a_mass_operation_to_Cluster__c;
    }


    /**
     * Gets the run_a_search_using_the_Relativity_index__c value for this Checklist__c.
     * 
     * @return run_a_search_using_the_Relativity_index__c
     */
    public java.lang.Boolean getRun_a_search_using_the_Relativity_index__c() {
        return run_a_search_using_the_Relativity_index__c;
    }


    /**
     * Sets the run_a_search_using_the_Relativity_index__c value for this Checklist__c.
     * 
     * @param run_a_search_using_the_Relativity_index__c
     */
    public void setRun_a_search_using_the_Relativity_index__c(java.lang.Boolean run_a_search_using_the_Relativity_index__c) {
        this.run_a_search_using_the_Relativity_index__c = run_a_search_using_the_Relativity_index__c;
    }


    /**
     * Gets the run_a_simple_keyword_search__c value for this Checklist__c.
     * 
     * @return run_a_simple_keyword_search__c
     */
    public java.lang.Boolean getRun_a_simple_keyword_search__c() {
        return run_a_simple_keyword_search__c;
    }


    /**
     * Sets the run_a_simple_keyword_search__c value for this Checklist__c.
     * 
     * @param run_a_simple_keyword_search__c
     */
    public void setRun_a_simple_keyword_search__c(java.lang.Boolean run_a_simple_keyword_search__c) {
        this.run_a_simple_keyword_search__c = run_a_simple_keyword_search__c;
    }


    /**
     * Gets the run_the_production__c value for this Checklist__c.
     * 
     * @return run_the_production__c
     */
    public java.lang.Boolean getRun_the_production__c() {
        return run_the_production__c;
    }


    /**
     * Sets the run_the_production__c value for this Checklist__c.
     * 
     * @param run_the_production__c
     */
    public void setRun_the_production__c(java.lang.Boolean run_the_production__c) {
        this.run_the_production__c = run_the_production__c;
    }


    /**
     * Gets the select_to_include_family_for_the_view__c value for this Checklist__c.
     * 
     * @return select_to_include_family_for_the_view__c
     */
    public java.lang.Boolean getSelect_to_include_family_for_the_view__c() {
        return select_to_include_family_for_the_view__c;
    }


    /**
     * Sets the select_to_include_family_for_the_view__c value for this Checklist__c.
     * 
     * @param select_to_include_family_for_the_view__c
     */
    public void setSelect_to_include_family_for_the_view__c(java.lang.Boolean select_to_include_family_for_the_view__c) {
        this.select_to_include_family_for_the_view__c = select_to_include_family_for_the_view__c;
    }


    /**
     * Gets the set_up_auto_batch__c value for this Checklist__c.
     * 
     * @return set_up_auto_batch__c
     */
    public java.lang.Boolean getSet_up_auto_batch__c() {
        return set_up_auto_batch__c;
    }


    /**
     * Sets the set_up_auto_batch__c value for this Checklist__c.
     * 
     * @param set_up_auto_batch__c
     */
    public void setSet_up_auto_batch__c(java.lang.Boolean set_up_auto_batch__c) {
        this.set_up_auto_batch__c = set_up_auto_batch__c;
    }


    /**
     * Gets the setup_Transform_Set__c value for this Checklist__c.
     * 
     * @return setup_Transform_Set__c
     */
    public java.lang.Boolean getSetup_Transform_Set__c() {
        return setup_Transform_Set__c;
    }


    /**
     * Sets the setup_Transform_Set__c value for this Checklist__c.
     * 
     * @param setup_Transform_Set__c
     */
    public void setSetup_Transform_Set__c(java.lang.Boolean setup_Transform_Set__c) {
        this.setup_Transform_Set__c = setup_Transform_Set__c;
    }


    /**
     * Gets the size_of_Case__c value for this Checklist__c.
     * 
     * @return size_of_Case__c
     */
    public java.lang.String getSize_of_Case__c() {
        return size_of_Case__c;
    }


    /**
     * Sets the size_of_Case__c value for this Checklist__c.
     * 
     * @param size_of_Case__c
     */
    public void setSize_of_Case__c(java.lang.String size_of_Case__c) {
        this.size_of_Case__c = size_of_Case__c;
    }


    /**
     * Gets the status_Comment__c value for this Checklist__c.
     * 
     * @return status_Comment__c
     */
    public java.lang.String getStatus_Comment__c() {
        return status_Comment__c;
    }


    /**
     * Sets the status_Comment__c value for this Checklist__c.
     * 
     * @param status_Comment__c
     */
    public void setStatus_Comment__c(java.lang.String status_Comment__c) {
        this.status_Comment__c = status_Comment__c;
    }


    /**
     * Gets the status_Description_Comment__c value for this Checklist__c.
     * 
     * @return status_Description_Comment__c
     */
    public java.lang.String getStatus_Description_Comment__c() {
        return status_Description_Comment__c;
    }


    /**
     * Sets the status_Description_Comment__c value for this Checklist__c.
     * 
     * @param status_Description_Comment__c
     */
    public void setStatus_Description_Comment__c(java.lang.String status_Description_Comment__c) {
        this.status_Description_Comment__c = status_Description_Comment__c;
    }


    /**
     * Gets the status_Description__c value for this Checklist__c.
     * 
     * @return status_Description__c
     */
    public java.lang.Boolean getStatus_Description__c() {
        return status_Description__c;
    }


    /**
     * Sets the status_Description__c value for this Checklist__c.
     * 
     * @param status_Description__c
     */
    public void setStatus_Description__c(java.lang.Boolean status_Description__c) {
        this.status_Description__c = status_Description__c;
    }


    /**
     * Gets the status__c value for this Checklist__c.
     * 
     * @return status__c
     */
    public java.lang.Boolean getStatus__c() {
        return status__c;
    }


    /**
     * Sets the status__c value for this Checklist__c.
     * 
     * @param status__c
     */
    public void setStatus__c(java.lang.Boolean status__c) {
        this.status__c = status__c;
    }


    /**
     * Gets the subject_Comment__c value for this Checklist__c.
     * 
     * @return subject_Comment__c
     */
    public java.lang.String getSubject_Comment__c() {
        return subject_Comment__c;
    }


    /**
     * Sets the subject_Comment__c value for this Checklist__c.
     * 
     * @param subject_Comment__c
     */
    public void setSubject_Comment__c(java.lang.String subject_Comment__c) {
        this.subject_Comment__c = subject_Comment__c;
    }


    /**
     * Gets the subject__c value for this Checklist__c.
     * 
     * @return subject__c
     */
    public java.lang.Boolean getSubject__c() {
        return subject__c;
    }


    /**
     * Sets the subject__c value for this Checklist__c.
     * 
     * @param subject__c
     */
    public void setSubject__c(java.lang.Boolean subject__c) {
        this.subject__c = subject__c;
    }


    /**
     * Gets the success_with_Setup_and_Use__c value for this Checklist__c.
     * 
     * @return success_with_Setup_and_Use__c
     */
    public java.lang.String getSuccess_with_Setup_and_Use__c() {
        return success_with_Setup_and_Use__c;
    }


    /**
     * Sets the success_with_Setup_and_Use__c value for this Checklist__c.
     * 
     * @param success_with_Setup_and_Use__c
     */
    public void setSuccess_with_Setup_and_Use__c(java.lang.String success_with_Setup_and_Use__c) {
        this.success_with_Setup_and_Use__c = success_with_Setup_and_Use__c;
    }


    /**
     * Gets the systemModstamp value for this Checklist__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Checklist__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the system_Change__c value for this Checklist__c.
     * 
     * @return system_Change__c
     */
    public java.lang.String getSystem_Change__c() {
        return system_Change__c;
    }


    /**
     * Sets the system_Change__c value for this Checklist__c.
     * 
     * @param system_Change__c
     */
    public void setSystem_Change__c(java.lang.String system_Change__c) {
        this.system_Change__c = system_Change__c;
    }


    /**
     * Gets the system_Change__r value for this Checklist__c.
     * 
     * @return system_Change__r
     */
    public com.sforce.soap.enterprise.sobject.System_Changes__c getSystem_Change__r() {
        return system_Change__r;
    }


    /**
     * Sets the system_Change__r value for this Checklist__c.
     * 
     * @param system_Change__r
     */
    public void setSystem_Change__r(com.sforce.soap.enterprise.sobject.System_Changes__c system_Change__r) {
        this.system_Change__r = system_Change__r;
    }


    /**
     * Gets the ticket_Origin_Comment__c value for this Checklist__c.
     * 
     * @return ticket_Origin_Comment__c
     */
    public java.lang.String getTicket_Origin_Comment__c() {
        return ticket_Origin_Comment__c;
    }


    /**
     * Sets the ticket_Origin_Comment__c value for this Checklist__c.
     * 
     * @param ticket_Origin_Comment__c
     */
    public void setTicket_Origin_Comment__c(java.lang.String ticket_Origin_Comment__c) {
        this.ticket_Origin_Comment__c = ticket_Origin_Comment__c;
    }


    /**
     * Gets the ticket_Origin__c value for this Checklist__c.
     * 
     * @return ticket_Origin__c
     */
    public java.lang.Boolean getTicket_Origin__c() {
        return ticket_Origin__c;
    }


    /**
     * Sets the ticket_Origin__c value for this Checklist__c.
     * 
     * @param ticket_Origin__c
     */
    public void setTicket_Origin__c(java.lang.Boolean ticket_Origin__c) {
        this.ticket_Origin__c = ticket_Origin__c;
    }


    /**
     * Gets the ticket__c value for this Checklist__c.
     * 
     * @return ticket__c
     */
    public java.lang.String getTicket__c() {
        return ticket__c;
    }


    /**
     * Sets the ticket__c value for this Checklist__c.
     * 
     * @param ticket__c
     */
    public void setTicket__c(java.lang.String ticket__c) {
        this.ticket__c = ticket__c;
    }


    /**
     * Gets the ticket__r value for this Checklist__c.
     * 
     * @return ticket__r
     */
    public com.sforce.soap.enterprise.sobject._case getTicket__r() {
        return ticket__r;
    }


    /**
     * Sets the ticket__r value for this Checklist__c.
     * 
     * @param ticket__r
     */
    public void setTicket__r(com.sforce.soap.enterprise.sobject._case ticket__r) {
        this.ticket__r = ticket__r;
    }


    /**
     * Gets the type_Comments__c value for this Checklist__c.
     * 
     * @return type_Comments__c
     */
    public java.lang.String getType_Comments__c() {
        return type_Comments__c;
    }


    /**
     * Sets the type_Comments__c value for this Checklist__c.
     * 
     * @param type_Comments__c
     */
    public void setType_Comments__c(java.lang.String type_Comments__c) {
        this.type_Comments__c = type_Comments__c;
    }


    /**
     * Gets the type__c value for this Checklist__c.
     * 
     * @return type__c
     */
    public java.lang.Boolean getType__c() {
        return type__c;
    }


    /**
     * Sets the type__c value for this Checklist__c.
     * 
     * @param type__c
     */
    public void setType__c(java.lang.Boolean type__c) {
        this.type__c = type__c;
    }


    /**
     * Gets the type_of_Case__c value for this Checklist__c.
     * 
     * @return type_of_Case__c
     */
    public java.lang.String getType_of_Case__c() {
        return type_of_Case__c;
    }


    /**
     * Sets the type_of_Case__c value for this Checklist__c.
     * 
     * @param type_of_Case__c
     */
    public void setType_of_Case__c(java.lang.String type_of_Case__c) {
        this.type_of_Case__c = type_of_Case__c;
    }


    /**
     * Gets the upgrading_5_09_read_help_arrow__c value for this Checklist__c.
     * 
     * @return upgrading_5_09_read_help_arrow__c
     */
    public java.lang.Boolean getUpgrading_5_09_read_help_arrow__c() {
        return upgrading_5_09_read_help_arrow__c;
    }


    /**
     * Sets the upgrading_5_09_read_help_arrow__c value for this Checklist__c.
     * 
     * @param upgrading_5_09_read_help_arrow__c
     */
    public void setUpgrading_5_09_read_help_arrow__c(java.lang.Boolean upgrading_5_09_read_help_arrow__c) {
        this.upgrading_5_09_read_help_arrow__c = upgrading_5_09_read_help_arrow__c;
    }


    /**
     * Gets the upload_the_test_data__c value for this Checklist__c.
     * 
     * @return upload_the_test_data__c
     */
    public java.lang.Boolean getUpload_the_test_data__c() {
        return upload_the_test_data__c;
    }


    /**
     * Sets the upload_the_test_data__c value for this Checklist__c.
     * 
     * @param upload_the_test_data__c
     */
    public void setUpload_the_test_data__c(java.lang.Boolean upload_the_test_data__c) {
        this.upload_the_test_data__c = upload_the_test_data__c;
    }


    /**
     * Gets the verify_all_actions_were_recorded__c value for this Checklist__c.
     * 
     * @return verify_all_actions_were_recorded__c
     */
    public java.lang.Boolean getVerify_all_actions_were_recorded__c() {
        return verify_all_actions_were_recorded__c;
    }


    /**
     * Sets the verify_all_actions_were_recorded__c value for this Checklist__c.
     * 
     * @param verify_all_actions_were_recorded__c
     */
    public void setVerify_all_actions_were_recorded__c(java.lang.Boolean verify_all_actions_were_recorded__c) {
        this.verify_all_actions_were_recorded__c = verify_all_actions_were_recorded__c;
    }


    /**
     * Gets the verify_documents_are_clustered__c value for this Checklist__c.
     * 
     * @return verify_documents_are_clustered__c
     */
    public java.lang.Boolean getVerify_documents_are_clustered__c() {
        return verify_documents_are_clustered__c;
    }


    /**
     * Sets the verify_documents_are_clustered__c value for this Checklist__c.
     * 
     * @param verify_documents_are_clustered__c
     */
    public void setVerify_documents_are_clustered__c(java.lang.Boolean verify_documents_are_clustered__c) {
        this.verify_documents_are_clustered__c = verify_documents_are_clustered__c;
    }


    /**
     * Gets the verify_that_the_correct_logo_displays__c value for this Checklist__c.
     * 
     * @return verify_that_the_correct_logo_displays__c
     */
    public java.lang.Boolean getVerify_that_the_correct_logo_displays__c() {
        return verify_that_the_correct_logo_displays__c;
    }


    /**
     * Sets the verify_that_the_correct_logo_displays__c value for this Checklist__c.
     * 
     * @param verify_that_the_correct_logo_displays__c
     */
    public void setVerify_that_the_correct_logo_displays__c(java.lang.Boolean verify_that_the_correct_logo_displays__c) {
        this.verify_that_the_correct_logo_displays__c = verify_that_the_correct_logo_displays__c;
    }


    /**
     * Gets the verify_that_the_disclaimer_is_working__c value for this Checklist__c.
     * 
     * @return verify_that_the_disclaimer_is_working__c
     */
    public java.lang.Boolean getVerify_that_the_disclaimer_is_working__c() {
        return verify_that_the_disclaimer_is_working__c;
    }


    /**
     * Sets the verify_that_the_disclaimer_is_working__c value for this Checklist__c.
     * 
     * @param verify_that_the_disclaimer_is_working__c
     */
    public void setVerify_that_the_disclaimer_is_working__c(java.lang.Boolean verify_that_the_disclaimer_is_working__c) {
        this.verify_that_the_disclaimer_is_working__c = verify_that_the_disclaimer_is_working__c;
    }


    /**
     * Gets the verify_the_one_coded_doc_is_returned__c value for this Checklist__c.
     * 
     * @return verify_the_one_coded_doc_is_returned__c
     */
    public java.lang.Boolean getVerify_the_one_coded_doc_is_returned__c() {
        return verify_the_one_coded_doc_is_returned__c;
    }


    /**
     * Sets the verify_the_one_coded_doc_is_returned__c value for this Checklist__c.
     * 
     * @param verify_the_one_coded_doc_is_returned__c
     */
    public void setVerify_the_one_coded_doc_is_returned__c(java.lang.Boolean verify_the_one_coded_doc_is_returned__c) {
        this.verify_the_one_coded_doc_is_returned__c = verify_the_one_coded_doc_is_returned__c;
    }


    /**
     * Gets the verify_the_production_mode_is_now_active__c value for this Checklist__c.
     * 
     * @return verify_the_production_mode_is_now_active__c
     */
    public java.lang.Boolean getVerify_the_production_mode_is_now_active__c() {
        return verify_the_production_mode_is_now_active__c;
    }


    /**
     * Sets the verify_the_production_mode_is_now_active__c value for this Checklist__c.
     * 
     * @param verify_the_production_mode_is_now_active__c
     */
    public void setVerify_the_production_mode_is_now_active__c(java.lang.Boolean verify_the_production_mode_is_now_active__c) {
        this.verify_the_production_mode_is_now_active__c = verify_the_production_mode_is_now_active__c;
    }


    /**
     * Gets the verify_the_word_index_is_searchable__c value for this Checklist__c.
     * 
     * @return verify_the_word_index_is_searchable__c
     */
    public java.lang.Boolean getVerify_the_word_index_is_searchable__c() {
        return verify_the_word_index_is_searchable__c;
    }


    /**
     * Sets the verify_the_word_index_is_searchable__c value for this Checklist__c.
     * 
     * @param verify_the_word_index_is_searchable__c
     */
    public void setVerify_the_word_index_is_searchable__c(java.lang.Boolean verify_the_word_index_is_searchable__c) {
        this.verify_the_word_index_is_searchable__c = verify_the_word_index_is_searchable__c;
    }


    /**
     * Gets the date_of_1St_Case_Load__c value for this Checklist__c.
     * 
     * @return date_of_1St_Case_Load__c
     */
    public java.util.Date getDate_of_1St_Case_Load__c() {
        return date_of_1St_Case_Load__c;
    }


    /**
     * Sets the date_of_1St_Case_Load__c value for this Checklist__c.
     * 
     * @param date_of_1St_Case_Load__c
     */
    public void setDate_of_1St_Case_Load__c(java.util.Date date_of_1St_Case_Load__c) {
        this.date_of_1St_Case_Load__c = date_of_1St_Case_Load__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Checklist__c)) return false;
        Checklist__c other = (Checklist__c) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.account_Comment__c==null && other.getAccount_Comment__c()==null) || 
             (this.account_Comment__c!=null &&
              this.account_Comment__c.equals(other.getAccount_Comment__c()))) &&
            ((this.account__c==null && other.getAccount__c()==null) || 
             (this.account__c!=null &&
              this.account__c.equals(other.getAccount__c()))) &&
            ((this.add_coded_doc_to_the_production_set__c==null && other.getAdd_coded_doc_to_the_production_set__c()==null) || 
             (this.add_coded_doc_to_the_production_set__c!=null &&
              this.add_coded_doc_to_the_production_set__c.equals(other.getAdd_coded_doc_to_the_production_set__c()))) &&
            ((this.add_issues_field_to_object_layout__c==null && other.getAdd_issues_field_to_object_layout__c()==null) || 
             (this.add_issues_field_to_object_layout__c!=null &&
              this.add_issues_field_to_object_layout__c.equals(other.getAdd_issues_field_to_object_layout__c()))) &&
            ((this.add_new_user_to_the_System_Admin_group__c==null && other.getAdd_new_user_to_the_System_Admin_group__c()==null) || 
             (this.add_new_user_to_the_System_Admin_group__c!=null &&
              this.add_new_user_to_the_System_Admin_group__c.equals(other.getAdd_new_user_to_the_System_Admin_group__c()))) &&
            ((this.add_object_on_document_layout__c==null && other.getAdd_object_on_document_layout__c()==null) || 
             (this.add_object_on_document_layout__c!=null &&
              this.add_object_on_document_layout__c.equals(other.getAdd_object_on_document_layout__c()))) &&
            ((this.add_the_field_to_the_layout__c==null && other.getAdd_the_field_to_the_layout__c()==null) || 
             (this.add_the_field_to_the_layout__c!=null &&
              this.add_the_field_to_the_layout__c.equals(other.getAdd_the_field_to_the_layout__c()))) &&
            ((this.area_Comment__c==null && other.getArea_Comment__c()==null) || 
             (this.area_Comment__c!=null &&
              this.area_Comment__c.equals(other.getArea_Comment__c()))) &&
            ((this.articles_Comment__c==null && other.getArticles_Comment__c()==null) || 
             (this.articles_Comment__c!=null &&
              this.articles_Comment__c.equals(other.getArticles_Comment__c()))) &&
            ((this.attachment_Comments__c==null && other.getAttachment_Comments__c()==null) || 
             (this.attachment_Comments__c!=null &&
              this.attachment_Comments__c.equals(other.getAttachment_Comments__c()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.attachments_checkbox__c==null && other.getAttachments_checkbox__c()==null) || 
             (this.attachments_checkbox__c!=null &&
              this.attachments_checkbox__c.equals(other.getAttachments_checkbox__c()))) &&
            ((this.CLient_Last_Contacted_Comment__c==null && other.getCLient_Last_Contacted_Comment__c()==null) || 
             (this.CLient_Last_Contacted_Comment__c!=null &&
              this.CLient_Last_Contacted_Comment__c.equals(other.getCLient_Last_Contacted_Comment__c()))) &&
            ((this.case_Time_Comment__c==null && other.getCase_Time_Comment__c()==null) || 
             (this.case_Time_Comment__c!=null &&
              this.case_Time_Comment__c.equals(other.getCase_Time_Comment__c()))) &&
            ((this.case_Time__c==null && other.getCase_Time__c()==null) || 
             (this.case_Time__c!=null &&
              this.case_Time__c.equals(other.getCase_Time__c()))) &&
            ((this.category_Comment__c==null && other.getCategory_Comment__c()==null) || 
             (this.category_Comment__c!=null &&
              this.category_Comment__c.equals(other.getCategory_Comment__c()))) &&
            ((this.category__c==null && other.getCategory__c()==null) || 
             (this.category__c!=null &&
              this.category__c.equals(other.getCategory__c()))) &&
            ((this.change_Control__c==null && other.getChange_Control__c()==null) || 
             (this.change_Control__c!=null &&
              this.change_Control__c.equals(other.getChange_Control__c()))) &&
            ((this.change_Control__r==null && other.getChange_Control__r()==null) || 
             (this.change_Control__r!=null &&
              this.change_Control__r.equals(other.getChange_Control__r()))) &&
            ((this.check_the_user_tab__c==null && other.getCheck_the_user_tab__c()==null) || 
             (this.check_the_user_tab__c!=null &&
              this.check_the_user_tab__c.equals(other.getCheck_the_user_tab__c()))) &&
            ((this.client_Last_Contacted_Comment_Checkbox__c==null && other.getClient_Last_Contacted_Comment_Checkbox__c()==null) || 
             (this.client_Last_Contacted_Comment_Checkbox__c!=null &&
              this.client_Last_Contacted_Comment_Checkbox__c.equals(other.getClient_Last_Contacted_Comment_Checkbox__c()))) &&
            ((this.code_the_document_set_to_Responsive__c==null && other.getCode_the_document_set_to_Responsive__c()==null) || 
             (this.code_the_document_set_to_Responsive__c!=null &&
              this.code_the_document_set_to_Responsive__c.equals(other.getCode_the_document_set_to_Responsive__c()))) &&
            ((this.comments__c==null && other.getComments__c()==null) || 
             (this.comments__c!=null &&
              this.comments__c.equals(other.getComments__c()))) &&
            ((this.compare_two_non_duplicate_docs__c==null && other.getCompare_two_non_duplicate_docs__c()==null) || 
             (this.compare_two_non_duplicate_docs__c!=null &&
              this.compare_two_non_duplicate_docs__c.equals(other.getCompare_two_non_duplicate_docs__c()))) &&
            ((this.contact_Comment__c==null && other.getContact_Comment__c()==null) || 
             (this.contact_Comment__c!=null &&
              this.contact_Comment__c.equals(other.getContact_Comment__c()))) &&
            ((this.contact__c==null && other.getContact__c()==null) || 
             (this.contact__c!=null &&
              this.contact__c.equals(other.getContact__c()))) &&
            ((this.create_Begin_Bates_and_End_Bates_fields__c==null && other.getCreate_Begin_Bates_and_End_Bates_fields__c()==null) || 
             (this.create_Begin_Bates_and_End_Bates_fields__c!=null &&
              this.create_Begin_Bates_and_End_Bates_fields__c.equals(other.getCreate_Begin_Bates_and_End_Bates_fields__c()))) &&
            ((this.create_Similar_Documents__c==null && other.getCreate_Similar_Documents__c()==null) || 
             (this.create_Similar_Documents__c!=null &&
              this.create_Similar_Documents__c.equals(other.getCreate_Similar_Documents__c()))) &&
            ((this.create_a_Production_Set__c==null && other.getCreate_a_Production_Set__c()==null) || 
             (this.create_a_Production_Set__c!=null &&
              this.create_a_Production_Set__c.equals(other.getCreate_a_Production_Set__c()))) &&
            ((this.create_a_case__c==null && other.getCreate_a_case__c()==null) || 
             (this.create_a_case__c!=null &&
              this.create_a_case__c.equals(other.getCreate_a_case__c()))) &&
            ((this.create_a_new_Analytics_Index__c==null && other.getCreate_a_new_Analytics_Index__c()==null) || 
             (this.create_a_new_Analytics_Index__c!=null &&
              this.create_a_new_Analytics_Index__c.equals(other.getCreate_a_new_Analytics_Index__c()))) &&
            ((this.create_a_new_Case_object__c==null && other.getCreate_a_new_Case_object__c()==null) || 
             (this.create_a_new_Case_object__c!=null &&
              this.create_a_new_Case_object__c.equals(other.getCreate_a_new_Case_object__c()))) &&
            ((this.create_a_new_Summary_Report__c==null && other.getCreate_a_new_Summary_Report__c()==null) || 
             (this.create_a_new_Summary_Report__c!=null &&
              this.create_a_new_Summary_Report__c.equals(other.getCreate_a_new_Summary_Report__c()))) &&
            ((this.create_a_new_choice_for_the_above_field__c==null && other.getCreate_a_new_choice_for_the_above_field__c()==null) || 
             (this.create_a_new_choice_for_the_above_field__c!=null &&
              this.create_a_new_choice_for_the_above_field__c.equals(other.getCreate_a_new_choice_for_the_above_field__c()))) &&
            ((this.create_a_new_dtSearch_index__c==null && other.getCreate_a_new_dtSearch_index__c()==null) || 
             (this.create_a_new_dtSearch_index__c!=null &&
              this.create_a_new_dtSearch_index__c.equals(other.getCreate_a_new_dtSearch_index__c()))) &&
            ((this.create_a_new_field_single_choice__c==null && other.getCreate_a_new_field_single_choice__c()==null) || 
             (this.create_a_new_field_single_choice__c!=null &&
              this.create_a_new_field_single_choice__c.equals(other.getCreate_a_new_field_single_choice__c()))) &&
            ((this.create_a_new_layout__c==null && other.getCreate_a_new_layout__c()==null) || 
             (this.create_a_new_layout__c!=null &&
              this.create_a_new_layout__c.equals(other.getCreate_a_new_layout__c()))) &&
            ((this.create_a_new_markup_set__c==null && other.getCreate_a_new_markup_set__c()==null) || 
             (this.create_a_new_markup_set__c!=null &&
              this.create_a_new_markup_set__c.equals(other.getCreate_a_new_markup_set__c()))) &&
            ((this.create_a_new_saved_search__c==null && other.getCreate_a_new_saved_search__c()==null) || 
             (this.create_a_new_saved_search__c!=null &&
              this.create_a_new_saved_search__c.equals(other.getCreate_a_new_saved_search__c()))) &&
            ((this.create_a_new_user__c==null && other.getCreate_a_new_user__c()==null) || 
             (this.create_a_new_user__c!=null &&
              this.create_a_new_user__c.equals(other.getCreate_a_new_user__c()))) &&
            ((this.create_a_new_view__c==null && other.getCreate_a_new_view__c()==null) || 
             (this.create_a_new_view__c!=null &&
              this.create_a_new_view__c.equals(other.getCreate_a_new_view__c()))) &&
            ((this.create_and_run_a_search_term_report__c==null && other.getCreate_and_run_a_search_term_report__c()==null) || 
             (this.create_and_run_a_search_term_report__c!=null &&
              this.create_and_run_a_search_term_report__c.equals(other.getCreate_and_run_a_search_term_report__c()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.date_Time_Outage_Started_Restored__c==null && other.getDate_Time_Outage_Started_Restored__c()==null) || 
             (this.date_Time_Outage_Started_Restored__c!=null &&
              this.date_Time_Outage_Started_Restored__c.equals(other.getDate_Time_Outage_Started_Restored__c()))) &&
            ((this.date_Time_out_Started_Restored_Commen__c==null && other.getDate_Time_out_Started_Restored_Commen__c()==null) || 
             (this.date_Time_out_Started_Restored_Commen__c!=null &&
              this.date_Time_out_Started_Restored_Commen__c.equals(other.getDate_Time_out_Started_Restored_Commen__c()))) &&
            ((this.date_of_Deployment__c==null && other.getDate_of_Deployment__c()==null) || 
             (this.date_of_Deployment__c!=null &&
              this.date_of_Deployment__c.equals(other.getDate_of_Deployment__c()))) &&
            ((this.date_of_First_Case_Load__c==null && other.getDate_of_First_Case_Load__c()==null) || 
             (this.date_of_First_Case_Load__c!=null &&
              this.date_of_First_Case_Load__c.equals(other.getDate_of_First_Case_Load__c()))) &&
            ((this.delete_production_image__c==null && other.getDelete_production_image__c()==null) || 
             (this.delete_production_image__c!=null &&
              this.delete_production_image__c.equals(other.getDelete_production_image__c()))) &&
            ((this.delete_the_Smoke_Test_Workspace__c==null && other.getDelete_the_Smoke_Test_Workspace__c()==null) || 
             (this.delete_the_Smoke_Test_Workspace__c!=null &&
              this.delete_the_Smoke_Test_Workspace__c.equals(other.getDelete_the_Smoke_Test_Workspace__c()))) &&
            ((this.description_Comment__c==null && other.getDescription_Comment__c()==null) || 
             (this.description_Comment__c!=null &&
              this.description_Comment__c.equals(other.getDescription_Comment__c()))) &&
            ((this.description__c==null && other.getDescription__c()==null) || 
             (this.description__c!=null &&
              this.description__c.equals(other.getDescription__c()))) &&
            ((this.design_of_Documentations__c==null && other.getDesign_of_Documentations__c()==null) || 
             (this.design_of_Documentations__c!=null &&
              this.design_of_Documentations__c.equals(other.getDesign_of_Documentations__c()))) &&
            ((this.error_Comment__c==null && other.getError_Comment__c()==null) || 
             (this.error_Comment__c!=null &&
              this.error_Comment__c.equals(other.getError_Comment__c()))) &&
            ((this.error__c==null && other.getError__c()==null) || 
             (this.error__c!=null &&
              this.error__c.equals(other.getError__c()))) &&
            ((this.escalation_Field_Comment__c==null && other.getEscalation_Field_Comment__c()==null) || 
             (this.escalation_Field_Comment__c!=null &&
              this.escalation_Field_Comment__c.equals(other.getEscalation_Field_Comment__c()))) &&
            ((this.escalation_Field__c==null && other.getEscalation_Field__c()==null) || 
             (this.escalation_Field__c!=null &&
              this.escalation_Field__c.equals(other.getEscalation_Field__c()))) &&
            ((this.export_production__c==null && other.getExport_production__c()==null) || 
             (this.export_production__c!=null &&
              this.export_production__c.equals(other.getExport_production__c()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
            ((this.image_the_native_document__c==null && other.getImage_the_native_document__c()==null) || 
             (this.image_the_native_document__c!=null &&
              this.image_the_native_document__c.equals(other.getImage_the_native_document__c()))) &&
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
            ((this.NET_3_5_SP1_or_higher_is_installed__c==null && other.getNET_3_5_SP1_or_higher_is_installed__c()==null) || 
             (this.NET_3_5_SP1_or_higher_is_installed__c!=null &&
              this.NET_3_5_SP1_or_higher_is_installed__c.equals(other.getNET_3_5_SP1_or_higher_is_installed__c()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.number_of_Users_in_the_Case__c==null && other.getNumber_of_Users_in_the_Case__c()==null) || 
             (this.number_of_Users_in_the_Case__c!=null &&
              this.number_of_Users_in_the_Case__c.equals(other.getNumber_of_Users_in_the_Case__c()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.parent_Ticket_Comment__c==null && other.getParent_Ticket_Comment__c()==null) || 
             (this.parent_Ticket_Comment__c!=null &&
              this.parent_Ticket_Comment__c.equals(other.getParent_Ticket_Comment__c()))) &&
            ((this.parent_Ticket__c==null && other.getParent_Ticket__c()==null) || 
             (this.parent_Ticket__c!=null &&
              this.parent_Ticket__c.equals(other.getParent_Ticket__c()))) &&
            ((this.pivot__c==null && other.getPivot__c()==null) || 
             (this.pivot__c!=null &&
              this.pivot__c.equals(other.getPivot__c()))) &&
            ((this.points_of_Frustration_During_Setup__c==null && other.getPoints_of_Frustration_During_Setup__c()==null) || 
             (this.points_of_Frustration_During_Setup__c!=null &&
              this.points_of_Frustration_During_Setup__c.equals(other.getPoints_of_Frustration_During_Setup__c()))) &&
            ((this.print_the_image_including_redactions__c==null && other.getPrint_the_image_including_redactions__c()==null) || 
             (this.print_the_image_including_redactions__c!=null &&
              this.print_the_image_including_redactions__c.equals(other.getPrint_the_image_including_redactions__c()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.purge_Batches__c==null && other.getPurge_Batches__c()==null) || 
             (this.purge_Batches__c!=null &&
              this.purge_Batches__c.equals(other.getPurge_Batches__c()))) &&
            ((this.QC_Articles_Checkbox__c==null && other.getQC_Articles_Checkbox__c()==null) || 
             (this.QC_Articles_Checkbox__c!=null &&
              this.QC_Articles_Checkbox__c.equals(other.getQC_Articles_Checkbox__c()))) &&
            ((this.recordType==null && other.getRecordType()==null) || 
             (this.recordType!=null &&
              this.recordType.equals(other.getRecordType()))) &&
            ((this.recordTypeId==null && other.getRecordTypeId()==null) || 
             (this.recordTypeId!=null &&
              this.recordTypeId.equals(other.getRecordTypeId()))) &&
            ((this.redact_the_image_using_new_markup_set__c==null && other.getRedact_the_image_using_new_markup_set__c()==null) || 
             (this.redact_the_image_using_new_markup_set__c!=null &&
              this.redact_the_image_using_new_markup_set__c.equals(other.getRedact_the_image_using_new_markup_set__c()))) &&
            ((this.review_of_Templates__c==null && other.getReview_of_Templates__c()==null) || 
             (this.review_of_Templates__c!=null &&
              this.review_of_Templates__c.equals(other.getReview_of_Templates__c()))) &&
            ((this.root_Cause_Comment__c==null && other.getRoot_Cause_Comment__c()==null) || 
             (this.root_Cause_Comment__c!=null &&
              this.root_Cause_Comment__c.equals(other.getRoot_Cause_Comment__c()))) &&
            ((this.root_Cause_checkbox__c==null && other.getRoot_Cause_checkbox__c()==null) || 
             (this.root_Cause_checkbox__c!=null &&
              this.root_Cause_checkbox__c.equals(other.getRoot_Cause_checkbox__c()))) &&
            ((this.run_a_keyword_Search_for__c==null && other.getRun_a_keyword_Search_for__c()==null) || 
             (this.run_a_keyword_Search_for__c!=null &&
              this.run_a_keyword_Search_for__c.equals(other.getRun_a_keyword_Search_for__c()))) &&
            ((this.run_a_mass_operation_to_Build_Word_Index__c==null && other.getRun_a_mass_operation_to_Build_Word_Index__c()==null) || 
             (this.run_a_mass_operation_to_Build_Word_Index__c!=null &&
              this.run_a_mass_operation_to_Build_Word_Index__c.equals(other.getRun_a_mass_operation_to_Build_Word_Index__c()))) &&
            ((this.run_a_mass_operation_to_Cluster__c==null && other.getRun_a_mass_operation_to_Cluster__c()==null) || 
             (this.run_a_mass_operation_to_Cluster__c!=null &&
              this.run_a_mass_operation_to_Cluster__c.equals(other.getRun_a_mass_operation_to_Cluster__c()))) &&
            ((this.run_a_search_using_the_Relativity_index__c==null && other.getRun_a_search_using_the_Relativity_index__c()==null) || 
             (this.run_a_search_using_the_Relativity_index__c!=null &&
              this.run_a_search_using_the_Relativity_index__c.equals(other.getRun_a_search_using_the_Relativity_index__c()))) &&
            ((this.run_a_simple_keyword_search__c==null && other.getRun_a_simple_keyword_search__c()==null) || 
             (this.run_a_simple_keyword_search__c!=null &&
              this.run_a_simple_keyword_search__c.equals(other.getRun_a_simple_keyword_search__c()))) &&
            ((this.run_the_production__c==null && other.getRun_the_production__c()==null) || 
             (this.run_the_production__c!=null &&
              this.run_the_production__c.equals(other.getRun_the_production__c()))) &&
            ((this.select_to_include_family_for_the_view__c==null && other.getSelect_to_include_family_for_the_view__c()==null) || 
             (this.select_to_include_family_for_the_view__c!=null &&
              this.select_to_include_family_for_the_view__c.equals(other.getSelect_to_include_family_for_the_view__c()))) &&
            ((this.set_up_auto_batch__c==null && other.getSet_up_auto_batch__c()==null) || 
             (this.set_up_auto_batch__c!=null &&
              this.set_up_auto_batch__c.equals(other.getSet_up_auto_batch__c()))) &&
            ((this.setup_Transform_Set__c==null && other.getSetup_Transform_Set__c()==null) || 
             (this.setup_Transform_Set__c!=null &&
              this.setup_Transform_Set__c.equals(other.getSetup_Transform_Set__c()))) &&
            ((this.size_of_Case__c==null && other.getSize_of_Case__c()==null) || 
             (this.size_of_Case__c!=null &&
              this.size_of_Case__c.equals(other.getSize_of_Case__c()))) &&
            ((this.status_Comment__c==null && other.getStatus_Comment__c()==null) || 
             (this.status_Comment__c!=null &&
              this.status_Comment__c.equals(other.getStatus_Comment__c()))) &&
            ((this.status_Description_Comment__c==null && other.getStatus_Description_Comment__c()==null) || 
             (this.status_Description_Comment__c!=null &&
              this.status_Description_Comment__c.equals(other.getStatus_Description_Comment__c()))) &&
            ((this.status_Description__c==null && other.getStatus_Description__c()==null) || 
             (this.status_Description__c!=null &&
              this.status_Description__c.equals(other.getStatus_Description__c()))) &&
            ((this.status__c==null && other.getStatus__c()==null) || 
             (this.status__c!=null &&
              this.status__c.equals(other.getStatus__c()))) &&
            ((this.subject_Comment__c==null && other.getSubject_Comment__c()==null) || 
             (this.subject_Comment__c!=null &&
              this.subject_Comment__c.equals(other.getSubject_Comment__c()))) &&
            ((this.subject__c==null && other.getSubject__c()==null) || 
             (this.subject__c!=null &&
              this.subject__c.equals(other.getSubject__c()))) &&
            ((this.success_with_Setup_and_Use__c==null && other.getSuccess_with_Setup_and_Use__c()==null) || 
             (this.success_with_Setup_and_Use__c!=null &&
              this.success_with_Setup_and_Use__c.equals(other.getSuccess_with_Setup_and_Use__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.system_Change__c==null && other.getSystem_Change__c()==null) || 
             (this.system_Change__c!=null &&
              this.system_Change__c.equals(other.getSystem_Change__c()))) &&
            ((this.system_Change__r==null && other.getSystem_Change__r()==null) || 
             (this.system_Change__r!=null &&
              this.system_Change__r.equals(other.getSystem_Change__r()))) &&
            ((this.ticket_Origin_Comment__c==null && other.getTicket_Origin_Comment__c()==null) || 
             (this.ticket_Origin_Comment__c!=null &&
              this.ticket_Origin_Comment__c.equals(other.getTicket_Origin_Comment__c()))) &&
            ((this.ticket_Origin__c==null && other.getTicket_Origin__c()==null) || 
             (this.ticket_Origin__c!=null &&
              this.ticket_Origin__c.equals(other.getTicket_Origin__c()))) &&
            ((this.ticket__c==null && other.getTicket__c()==null) || 
             (this.ticket__c!=null &&
              this.ticket__c.equals(other.getTicket__c()))) &&
            ((this.ticket__r==null && other.getTicket__r()==null) || 
             (this.ticket__r!=null &&
              this.ticket__r.equals(other.getTicket__r()))) &&
            ((this.type_Comments__c==null && other.getType_Comments__c()==null) || 
             (this.type_Comments__c!=null &&
              this.type_Comments__c.equals(other.getType_Comments__c()))) &&
            ((this.type__c==null && other.getType__c()==null) || 
             (this.type__c!=null &&
              this.type__c.equals(other.getType__c()))) &&
            ((this.type_of_Case__c==null && other.getType_of_Case__c()==null) || 
             (this.type_of_Case__c!=null &&
              this.type_of_Case__c.equals(other.getType_of_Case__c()))) &&
            ((this.upgrading_5_09_read_help_arrow__c==null && other.getUpgrading_5_09_read_help_arrow__c()==null) || 
             (this.upgrading_5_09_read_help_arrow__c!=null &&
              this.upgrading_5_09_read_help_arrow__c.equals(other.getUpgrading_5_09_read_help_arrow__c()))) &&
            ((this.upload_the_test_data__c==null && other.getUpload_the_test_data__c()==null) || 
             (this.upload_the_test_data__c!=null &&
              this.upload_the_test_data__c.equals(other.getUpload_the_test_data__c()))) &&
            ((this.verify_all_actions_were_recorded__c==null && other.getVerify_all_actions_were_recorded__c()==null) || 
             (this.verify_all_actions_were_recorded__c!=null &&
              this.verify_all_actions_were_recorded__c.equals(other.getVerify_all_actions_were_recorded__c()))) &&
            ((this.verify_documents_are_clustered__c==null && other.getVerify_documents_are_clustered__c()==null) || 
             (this.verify_documents_are_clustered__c!=null &&
              this.verify_documents_are_clustered__c.equals(other.getVerify_documents_are_clustered__c()))) &&
            ((this.verify_that_the_correct_logo_displays__c==null && other.getVerify_that_the_correct_logo_displays__c()==null) || 
             (this.verify_that_the_correct_logo_displays__c!=null &&
              this.verify_that_the_correct_logo_displays__c.equals(other.getVerify_that_the_correct_logo_displays__c()))) &&
            ((this.verify_that_the_disclaimer_is_working__c==null && other.getVerify_that_the_disclaimer_is_working__c()==null) || 
             (this.verify_that_the_disclaimer_is_working__c!=null &&
              this.verify_that_the_disclaimer_is_working__c.equals(other.getVerify_that_the_disclaimer_is_working__c()))) &&
            ((this.verify_the_one_coded_doc_is_returned__c==null && other.getVerify_the_one_coded_doc_is_returned__c()==null) || 
             (this.verify_the_one_coded_doc_is_returned__c!=null &&
              this.verify_the_one_coded_doc_is_returned__c.equals(other.getVerify_the_one_coded_doc_is_returned__c()))) &&
            ((this.verify_the_production_mode_is_now_active__c==null && other.getVerify_the_production_mode_is_now_active__c()==null) || 
             (this.verify_the_production_mode_is_now_active__c!=null &&
              this.verify_the_production_mode_is_now_active__c.equals(other.getVerify_the_production_mode_is_now_active__c()))) &&
            ((this.verify_the_word_index_is_searchable__c==null && other.getVerify_the_word_index_is_searchable__c()==null) || 
             (this.verify_the_word_index_is_searchable__c!=null &&
              this.verify_the_word_index_is_searchable__c.equals(other.getVerify_the_word_index_is_searchable__c()))) &&
            ((this.date_of_1St_Case_Load__c==null && other.getDate_of_1St_Case_Load__c()==null) || 
             (this.date_of_1St_Case_Load__c!=null &&
              this.date_of_1St_Case_Load__c.equals(other.getDate_of_1St_Case_Load__c())));
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
        if (getAccount_Comment__c() != null) {
            _hashCode += getAccount_Comment__c().hashCode();
        }
        if (getAccount__c() != null) {
            _hashCode += getAccount__c().hashCode();
        }
        if (getAdd_coded_doc_to_the_production_set__c() != null) {
            _hashCode += getAdd_coded_doc_to_the_production_set__c().hashCode();
        }
        if (getAdd_issues_field_to_object_layout__c() != null) {
            _hashCode += getAdd_issues_field_to_object_layout__c().hashCode();
        }
        if (getAdd_new_user_to_the_System_Admin_group__c() != null) {
            _hashCode += getAdd_new_user_to_the_System_Admin_group__c().hashCode();
        }
        if (getAdd_object_on_document_layout__c() != null) {
            _hashCode += getAdd_object_on_document_layout__c().hashCode();
        }
        if (getAdd_the_field_to_the_layout__c() != null) {
            _hashCode += getAdd_the_field_to_the_layout__c().hashCode();
        }
        if (getArea_Comment__c() != null) {
            _hashCode += getArea_Comment__c().hashCode();
        }
        if (getArticles_Comment__c() != null) {
            _hashCode += getArticles_Comment__c().hashCode();
        }
        if (getAttachment_Comments__c() != null) {
            _hashCode += getAttachment_Comments__c().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getAttachments_checkbox__c() != null) {
            _hashCode += getAttachments_checkbox__c().hashCode();
        }
        if (getCLient_Last_Contacted_Comment__c() != null) {
            _hashCode += getCLient_Last_Contacted_Comment__c().hashCode();
        }
        if (getCase_Time_Comment__c() != null) {
            _hashCode += getCase_Time_Comment__c().hashCode();
        }
        if (getCase_Time__c() != null) {
            _hashCode += getCase_Time__c().hashCode();
        }
        if (getCategory_Comment__c() != null) {
            _hashCode += getCategory_Comment__c().hashCode();
        }
        if (getCategory__c() != null) {
            _hashCode += getCategory__c().hashCode();
        }
        if (getChange_Control__c() != null) {
            _hashCode += getChange_Control__c().hashCode();
        }
        if (getChange_Control__r() != null) {
            _hashCode += getChange_Control__r().hashCode();
        }
        if (getCheck_the_user_tab__c() != null) {
            _hashCode += getCheck_the_user_tab__c().hashCode();
        }
        if (getClient_Last_Contacted_Comment_Checkbox__c() != null) {
            _hashCode += getClient_Last_Contacted_Comment_Checkbox__c().hashCode();
        }
        if (getCode_the_document_set_to_Responsive__c() != null) {
            _hashCode += getCode_the_document_set_to_Responsive__c().hashCode();
        }
        if (getComments__c() != null) {
            _hashCode += getComments__c().hashCode();
        }
        if (getCompare_two_non_duplicate_docs__c() != null) {
            _hashCode += getCompare_two_non_duplicate_docs__c().hashCode();
        }
        if (getContact_Comment__c() != null) {
            _hashCode += getContact_Comment__c().hashCode();
        }
        if (getContact__c() != null) {
            _hashCode += getContact__c().hashCode();
        }
        if (getCreate_Begin_Bates_and_End_Bates_fields__c() != null) {
            _hashCode += getCreate_Begin_Bates_and_End_Bates_fields__c().hashCode();
        }
        if (getCreate_Similar_Documents__c() != null) {
            _hashCode += getCreate_Similar_Documents__c().hashCode();
        }
        if (getCreate_a_Production_Set__c() != null) {
            _hashCode += getCreate_a_Production_Set__c().hashCode();
        }
        if (getCreate_a_case__c() != null) {
            _hashCode += getCreate_a_case__c().hashCode();
        }
        if (getCreate_a_new_Analytics_Index__c() != null) {
            _hashCode += getCreate_a_new_Analytics_Index__c().hashCode();
        }
        if (getCreate_a_new_Case_object__c() != null) {
            _hashCode += getCreate_a_new_Case_object__c().hashCode();
        }
        if (getCreate_a_new_Summary_Report__c() != null) {
            _hashCode += getCreate_a_new_Summary_Report__c().hashCode();
        }
        if (getCreate_a_new_choice_for_the_above_field__c() != null) {
            _hashCode += getCreate_a_new_choice_for_the_above_field__c().hashCode();
        }
        if (getCreate_a_new_dtSearch_index__c() != null) {
            _hashCode += getCreate_a_new_dtSearch_index__c().hashCode();
        }
        if (getCreate_a_new_field_single_choice__c() != null) {
            _hashCode += getCreate_a_new_field_single_choice__c().hashCode();
        }
        if (getCreate_a_new_layout__c() != null) {
            _hashCode += getCreate_a_new_layout__c().hashCode();
        }
        if (getCreate_a_new_markup_set__c() != null) {
            _hashCode += getCreate_a_new_markup_set__c().hashCode();
        }
        if (getCreate_a_new_saved_search__c() != null) {
            _hashCode += getCreate_a_new_saved_search__c().hashCode();
        }
        if (getCreate_a_new_user__c() != null) {
            _hashCode += getCreate_a_new_user__c().hashCode();
        }
        if (getCreate_a_new_view__c() != null) {
            _hashCode += getCreate_a_new_view__c().hashCode();
        }
        if (getCreate_and_run_a_search_term_report__c() != null) {
            _hashCode += getCreate_and_run_a_search_term_report__c().hashCode();
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
        if (getDate_Time_Outage_Started_Restored__c() != null) {
            _hashCode += getDate_Time_Outage_Started_Restored__c().hashCode();
        }
        if (getDate_Time_out_Started_Restored_Commen__c() != null) {
            _hashCode += getDate_Time_out_Started_Restored_Commen__c().hashCode();
        }
        if (getDate_of_Deployment__c() != null) {
            _hashCode += getDate_of_Deployment__c().hashCode();
        }
        if (getDate_of_First_Case_Load__c() != null) {
            _hashCode += getDate_of_First_Case_Load__c().hashCode();
        }
        if (getDelete_production_image__c() != null) {
            _hashCode += getDelete_production_image__c().hashCode();
        }
        if (getDelete_the_Smoke_Test_Workspace__c() != null) {
            _hashCode += getDelete_the_Smoke_Test_Workspace__c().hashCode();
        }
        if (getDescription_Comment__c() != null) {
            _hashCode += getDescription_Comment__c().hashCode();
        }
        if (getDescription__c() != null) {
            _hashCode += getDescription__c().hashCode();
        }
        if (getDesign_of_Documentations__c() != null) {
            _hashCode += getDesign_of_Documentations__c().hashCode();
        }
        if (getError_Comment__c() != null) {
            _hashCode += getError_Comment__c().hashCode();
        }
        if (getError__c() != null) {
            _hashCode += getError__c().hashCode();
        }
        if (getEscalation_Field_Comment__c() != null) {
            _hashCode += getEscalation_Field_Comment__c().hashCode();
        }
        if (getEscalation_Field__c() != null) {
            _hashCode += getEscalation_Field__c().hashCode();
        }
        if (getExport_production__c() != null) {
            _hashCode += getExport_production__c().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getHistories() != null) {
            _hashCode += getHistories().hashCode();
        }
        if (getImage_the_native_document__c() != null) {
            _hashCode += getImage_the_native_document__c().hashCode();
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
        if (getNET_3_5_SP1_or_higher_is_installed__c() != null) {
            _hashCode += getNET_3_5_SP1_or_higher_is_installed__c().hashCode();
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
        if (getNumber_of_Users_in_the_Case__c() != null) {
            _hashCode += getNumber_of_Users_in_the_Case__c().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getParent_Ticket_Comment__c() != null) {
            _hashCode += getParent_Ticket_Comment__c().hashCode();
        }
        if (getParent_Ticket__c() != null) {
            _hashCode += getParent_Ticket__c().hashCode();
        }
        if (getPivot__c() != null) {
            _hashCode += getPivot__c().hashCode();
        }
        if (getPoints_of_Frustration_During_Setup__c() != null) {
            _hashCode += getPoints_of_Frustration_During_Setup__c().hashCode();
        }
        if (getPrint_the_image_including_redactions__c() != null) {
            _hashCode += getPrint_the_image_including_redactions__c().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getPurge_Batches__c() != null) {
            _hashCode += getPurge_Batches__c().hashCode();
        }
        if (getQC_Articles_Checkbox__c() != null) {
            _hashCode += getQC_Articles_Checkbox__c().hashCode();
        }
        if (getRecordType() != null) {
            _hashCode += getRecordType().hashCode();
        }
        if (getRecordTypeId() != null) {
            _hashCode += getRecordTypeId().hashCode();
        }
        if (getRedact_the_image_using_new_markup_set__c() != null) {
            _hashCode += getRedact_the_image_using_new_markup_set__c().hashCode();
        }
        if (getReview_of_Templates__c() != null) {
            _hashCode += getReview_of_Templates__c().hashCode();
        }
        if (getRoot_Cause_Comment__c() != null) {
            _hashCode += getRoot_Cause_Comment__c().hashCode();
        }
        if (getRoot_Cause_checkbox__c() != null) {
            _hashCode += getRoot_Cause_checkbox__c().hashCode();
        }
        if (getRun_a_keyword_Search_for__c() != null) {
            _hashCode += getRun_a_keyword_Search_for__c().hashCode();
        }
        if (getRun_a_mass_operation_to_Build_Word_Index__c() != null) {
            _hashCode += getRun_a_mass_operation_to_Build_Word_Index__c().hashCode();
        }
        if (getRun_a_mass_operation_to_Cluster__c() != null) {
            _hashCode += getRun_a_mass_operation_to_Cluster__c().hashCode();
        }
        if (getRun_a_search_using_the_Relativity_index__c() != null) {
            _hashCode += getRun_a_search_using_the_Relativity_index__c().hashCode();
        }
        if (getRun_a_simple_keyword_search__c() != null) {
            _hashCode += getRun_a_simple_keyword_search__c().hashCode();
        }
        if (getRun_the_production__c() != null) {
            _hashCode += getRun_the_production__c().hashCode();
        }
        if (getSelect_to_include_family_for_the_view__c() != null) {
            _hashCode += getSelect_to_include_family_for_the_view__c().hashCode();
        }
        if (getSet_up_auto_batch__c() != null) {
            _hashCode += getSet_up_auto_batch__c().hashCode();
        }
        if (getSetup_Transform_Set__c() != null) {
            _hashCode += getSetup_Transform_Set__c().hashCode();
        }
        if (getSize_of_Case__c() != null) {
            _hashCode += getSize_of_Case__c().hashCode();
        }
        if (getStatus_Comment__c() != null) {
            _hashCode += getStatus_Comment__c().hashCode();
        }
        if (getStatus_Description_Comment__c() != null) {
            _hashCode += getStatus_Description_Comment__c().hashCode();
        }
        if (getStatus_Description__c() != null) {
            _hashCode += getStatus_Description__c().hashCode();
        }
        if (getStatus__c() != null) {
            _hashCode += getStatus__c().hashCode();
        }
        if (getSubject_Comment__c() != null) {
            _hashCode += getSubject_Comment__c().hashCode();
        }
        if (getSubject__c() != null) {
            _hashCode += getSubject__c().hashCode();
        }
        if (getSuccess_with_Setup_and_Use__c() != null) {
            _hashCode += getSuccess_with_Setup_and_Use__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getSystem_Change__c() != null) {
            _hashCode += getSystem_Change__c().hashCode();
        }
        if (getSystem_Change__r() != null) {
            _hashCode += getSystem_Change__r().hashCode();
        }
        if (getTicket_Origin_Comment__c() != null) {
            _hashCode += getTicket_Origin_Comment__c().hashCode();
        }
        if (getTicket_Origin__c() != null) {
            _hashCode += getTicket_Origin__c().hashCode();
        }
        if (getTicket__c() != null) {
            _hashCode += getTicket__c().hashCode();
        }
        if (getTicket__r() != null) {
            _hashCode += getTicket__r().hashCode();
        }
        if (getType_Comments__c() != null) {
            _hashCode += getType_Comments__c().hashCode();
        }
        if (getType__c() != null) {
            _hashCode += getType__c().hashCode();
        }
        if (getType_of_Case__c() != null) {
            _hashCode += getType_of_Case__c().hashCode();
        }
        if (getUpgrading_5_09_read_help_arrow__c() != null) {
            _hashCode += getUpgrading_5_09_read_help_arrow__c().hashCode();
        }
        if (getUpload_the_test_data__c() != null) {
            _hashCode += getUpload_the_test_data__c().hashCode();
        }
        if (getVerify_all_actions_were_recorded__c() != null) {
            _hashCode += getVerify_all_actions_were_recorded__c().hashCode();
        }
        if (getVerify_documents_are_clustered__c() != null) {
            _hashCode += getVerify_documents_are_clustered__c().hashCode();
        }
        if (getVerify_that_the_correct_logo_displays__c() != null) {
            _hashCode += getVerify_that_the_correct_logo_displays__c().hashCode();
        }
        if (getVerify_that_the_disclaimer_is_working__c() != null) {
            _hashCode += getVerify_that_the_disclaimer_is_working__c().hashCode();
        }
        if (getVerify_the_one_coded_doc_is_returned__c() != null) {
            _hashCode += getVerify_the_one_coded_doc_is_returned__c().hashCode();
        }
        if (getVerify_the_production_mode_is_now_active__c() != null) {
            _hashCode += getVerify_the_production_mode_is_now_active__c().hashCode();
        }
        if (getVerify_the_word_index_is_searchable__c() != null) {
            _hashCode += getVerify_the_word_index_is_searchable__c().hashCode();
        }
        if (getDate_of_1St_Case_Load__c() != null) {
            _hashCode += getDate_of_1St_Case_Load__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Checklist__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Checklist__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account_Comment__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account_Comment__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("add_coded_doc_to_the_production_set__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Add_coded_doc_to_the_production_set__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("add_issues_field_to_object_layout__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Add_issues_field_to_object_layout__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("add_new_user_to_the_System_Admin_group__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Add_new_user_to_the_System_Admin_group__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("add_object_on_document_layout__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Add_object_on_document_layout__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("add_the_field_to_the_layout__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Add_the_field_to_the_layout__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("area_Comment__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Area_Comment__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articles_Comment__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Articles_Comment__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachment_Comments__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attachment_Comments__c"));
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
        elemField.setFieldName("attachments_checkbox__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attachments_checkbox__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CLient_Last_Contacted_Comment__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CLient_Last_Contacted_Comment__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("case_Time_Comment__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case_Time_Comment__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("case_Time__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case_Time__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category_Comment__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Category_Comment__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Category__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("change_Control__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Change_Control__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("change_Control__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Change_Control__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Change_Control__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("check_the_user_tab__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Check_the_user_tab__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("client_Last_Contacted_Comment_Checkbox__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Client_Last_Contacted_Comment_Checkbox__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code_the_document_set_to_Responsive__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Code_the_document_set_to_Responsive__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Comments__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compare_two_non_duplicate_docs__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Compare_two_non_duplicate_docs__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact_Comment__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact_Comment__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("create_Begin_Bates_and_End_Bates_fields__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Create_Begin_Bates_and_End_Bates_fields__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("create_Similar_Documents__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Create_Similar_Documents__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("create_a_Production_Set__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Create_a_Production_Set__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("create_a_case__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Create_a_case__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("create_a_new_Analytics_Index__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Create_a_new_Analytics_Index__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("create_a_new_Case_object__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Create_a_new_Case_object__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("create_a_new_Summary_Report__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Create_a_new_Summary_Report__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("create_a_new_choice_for_the_above_field__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Create_a_new_choice_for_the_above_field__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("create_a_new_dtSearch_index__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Create_a_new_dtSearch_index__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("create_a_new_field_single_choice__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Create_a_new_field_single_choice__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("create_a_new_layout__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Create_a_new_layout__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("create_a_new_markup_set__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Create_a_new_markup_set__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("create_a_new_saved_search__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Create_a_new_saved_search__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("create_a_new_user__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Create_a_new_user__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("create_a_new_view__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Create_a_new_view__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("create_and_run_a_search_term_report__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Create_and_run_a_search_term_report__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("date_Time_Outage_Started_Restored__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Time_Outage_Started_Restored__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_Time_out_Started_Restored_Commen__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Time_out_Started_Restored_Commen__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_of_Deployment__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_of_Deployment__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_of_First_Case_Load__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_of_First_Case_Load__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delete_production_image__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Delete_production_image__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delete_the_Smoke_Test_Workspace__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Delete_the_Smoke_Test_Workspace__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description_Comment__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Description_Comment__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Description__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("design_of_Documentations__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Design_of_Documentations__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error_Comment__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Error_Comment__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Error__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalation_Field_Comment__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Escalation_Field_Comment__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalation_Field__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Escalation_Field__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("export_production__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Export_production__c"));
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
        elemField.setFieldName("image_the_native_document__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Image_the_native_document__c"));
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
        elemField.setFieldName("NET_3_5_SP1_or_higher_is_installed__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NET_3_5_SP1_or_higher_is_installed__c"));
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
        elemField.setFieldName("number_of_Users_in_the_Case__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Number_of_Users_in_the_Case__c"));
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
        elemField.setFieldName("parent_Ticket_Comment__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Parent_Ticket_Comment__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent_Ticket__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Parent_Ticket__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pivot__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pivot__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("points_of_Frustration_During_Setup__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Points_of_Frustration_During_Setup__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("print_the_image_including_redactions__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Print_the_image_including_redactions__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("purge_Batches__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Purge_Batches__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QC_Articles_Checkbox__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "QC_Articles_Checkbox__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("redact_the_image_using_new_markup_set__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Redact_the_image_using_new_markup_set__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("review_of_Templates__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Review_of_Templates__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("root_Cause_Comment__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Root_Cause_Comment__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("root_Cause_checkbox__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Root_Cause_checkbox__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("run_a_keyword_Search_for__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Run_a_keyword_Search_for__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("run_a_mass_operation_to_Build_Word_Index__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Run_a_mass_operation_to_Build_Word_Index__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("run_a_mass_operation_to_Cluster__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Run_a_mass_operation_to_Cluster__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("run_a_search_using_the_Relativity_index__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Run_a_search_using_the_Relativity_index__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("run_a_simple_keyword_search__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Run_a_simple_keyword_search__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("run_the_production__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Run_the_production__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("select_to_include_family_for_the_view__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Select_to_include_family_for_the_view__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("set_up_auto_batch__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Set_up_auto_batch__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setup_Transform_Set__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Setup_Transform_Set__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size_of_Case__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Size_of_Case__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status_Comment__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status_Comment__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status_Description_Comment__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status_Description_Comment__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status_Description__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status_Description__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject_Comment__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Subject_Comment__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Subject__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success_with_Setup_and_Use__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Success_with_Setup_and_Use__c"));
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
        elemField.setFieldName("system_Change__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "System_Change__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("system_Change__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "System_Change__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "System_Changes__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticket_Origin_Comment__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Ticket_Origin_Comment__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticket_Origin__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Ticket_Origin__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticket__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Ticket__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticket__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Ticket__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type_Comments__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Type_Comments__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type_of_Case__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Type_of_Case__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upgrading_5_09_read_help_arrow__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Upgrading_5_09_read_help_arrow__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upload_the_test_data__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Upload_the_test_data__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verify_all_actions_were_recorded__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Verify_all_actions_were_recorded__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verify_documents_are_clustered__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Verify_documents_are_clustered__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verify_that_the_correct_logo_displays__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Verify_that_the_correct_logo_displays__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verify_that_the_disclaimer_is_working__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Verify_that_the_disclaimer_is_working__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verify_the_one_coded_doc_is_returned__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Verify_the_one_coded_doc_is_returned__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verify_the_production_mode_is_now_active__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Verify_the_production_mode_is_now_active__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verify_the_word_index_is_searchable__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Verify_the_word_index_is_searchable__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_of_1St_Case_Load__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "date_of_1st_Case_Load__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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

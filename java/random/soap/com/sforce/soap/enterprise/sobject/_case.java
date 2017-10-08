/**
 * _case.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class _case  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String AM_PM__c;

    private com.sforce.soap.enterprise.sobject.Account account;

    private java.lang.String accountId;

    private java.lang.String account_Alert__c;

    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private java.lang.Double actual_Billable_Time__c;

    private java.lang.String add_to_Official_Doc_Set__c;

    private java.util.Calendar added_to_Backlog_Date__c;

    private java.lang.String admin_Contact__c;

    private java.lang.String applications_Installed__c;

    private java.lang.Boolean approved__c;

    private java.lang.Double approximate_Time_Spent__c;

    private java.lang.String area__c;

    private java.lang.String associated_Ticket_s__c;

    private com.sforce.soap.enterprise.QueryResult associated_Tickets__r;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String avoidance_Comments__c;

    private java.lang.String avoidance__c;

    private java.lang.Boolean BA_Tested__c;

    private java.lang.String BA_Ticket_Owner__c;

    private com.sforce.soap.enterprise.sobject.User BA_Ticket_Owner__r;

    private java.lang.String best_Time_to_Contact__c;

    private java.lang.String best_Way_to_Contact__c;

    private java.lang.String billable__c;

    private java.lang.String bug_Patch_Resolution_Notes__c;

    private com.sforce.soap.enterprise.sobject.BusinessHours businessHours;

    private java.lang.String businessHoursId;

    private java.lang.String CS_Management_User__c;

    private com.sforce.soap.enterprise.sobject.User CS_Management_User__r;

    private com.sforce.soap.enterprise.QueryResult caseArticles;

    private com.sforce.soap.enterprise.QueryResult caseComments;

    private com.sforce.soap.enterprise.QueryResult caseContactRoles;

    private java.lang.String caseNumber;

    private com.sforce.soap.enterprise.QueryResult caseSolutions;

    private java.lang.String case_Admin_2__c;

    private com.sforce.soap.enterprise.sobject.Contact case_Admin_2__r;

    private java.lang.String case_Admin_3__c;

    private com.sforce.soap.enterprise.sobject.Contact case_Admin_3__r;

    private java.lang.String case_Admin_4__c;

    private com.sforce.soap.enterprise.sobject.Contact case_Admin_4__r;

    private java.lang.Double case_Age_In_Business_Hours__c;

    private java.lang.Boolean case_Age_Update__c;

    private java.lang.Double case_Age__c;

    private com.sforce.soap.enterprise.QueryResult case_Migration_Differential_Copies__r;

    private java.lang.Boolean case_Status_Client_Active_Import_Export__c;

    private java.lang.Boolean case_Status_Client_Active__c;

    private java.lang.String case_Template__c;

    private com.sforce.soap.enterprise.sobject.Relativity_Case__c case_Template__r;

    private java.lang.String case_Time_Billable__c;

    private java.lang.String case_Time_Category__c;

    private com.sforce.soap.enterprise.QueryResult cases;

    private com.sforce.soap.enterprise.QueryResult cases__r;

    private java.lang.String category__c;

    private com.sforce.soap.enterprise.sobject.Category__c category__r;

    private java.lang.Boolean certified_Admin_Static__c;

    private java.lang.String certified_Admin__c;

    private com.sforce.soap.enterprise.QueryResult changeControlTicketAssociation__r;

    private com.sforce.soap.enterprise.QueryResult checklists__r;

    private java.lang.String client_Contact_Status__c;

    private java.util.Calendar client_Contacted__c;

    private java.lang.String client_Email_Addresses__c;

    private java.lang.String client_Inernal_Tracking_Number__c;

    private java.lang.Boolean client_Requested_Escalation__c;

    private java.lang.String client_Type__c;

    private java.util.Calendar closedDate;

    private java.lang.String closing_Note__c;

    private java.lang.String computer_Connected_To__c;

    private com.sforce.soap.enterprise.sobject.Contact contact;

    private java.lang.String contactId;

    private java.lang.String contact_1__c;

    private com.sforce.soap.enterprise.sobject.Contact contact_1__r;

    private java.lang.Double content_Updates__c;

    private java.lang.Double count_of_Case_Time_Records__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String customization_and_Consulting__c;

    private com.sforce.soap.enterprise.QueryResult data_Files__r;

    private java.lang.String database_Drive_Name__c;

    private java.util.Calendar date_Client_Requested_Escalation__c;

    private java.util.Calendar date_Escalated__c;

    private java.util.Calendar date_Escalated_for_Oracle_Defect_Review__c;

    private java.util.Calendar date_Escalated_for_PSI_Review__c;

    private java.util.Calendar date_Escalated_for_Problem_File_Review__c;

    private java.util.Calendar date_Escalated_for_Relativity_Bug_Review__c;

    private java.util.Calendar date_Escalated_for_bug_Review__c;

    private java.util.Calendar date_Escalated_to_Certification__c;

    private java.util.Calendar date_Escalated_to_Dev__c;

    private java.util.Calendar date_Escalated_to_Vendor__c;

    private java.util.Calendar date_Escalated_to_kIE__c;

    private java.util.Calendar date_Evaluated_For_Business_Impact__c;

    private java.util.Calendar date_KIE_Status_Completed__c;

    private java.util.Date date_Microsoft_case_opened__c;

    private java.lang.String date_Range__c;

    private java.util.Date date_Received__c;

    private java.util.Date date_Recommended_Upgrade__c;

    private java.util.Calendar date_Reviewed_for_KCD_Ticket__c;

    private java.util.Date date_Sent_to_Client__c;

    private java.util.Date date_Shipped_to_kCura__c;

    private java.util.Calendar date_Time_Outage_Started__c;

    private java.util.Calendar date_Time_Service_Restored__c;

    private java.util.Date date__c;

    private java.lang.Double days_of_Month__c;

    private java.util.Date deadline__c;

    private java.util.Calendar deadline_for_Access_Creation__c;

    private java.util.Date deliver_By__c;

    private java.lang.String department_Sub__c;

    private java.lang.String department__c;

    private java.lang.String description;

    private java.lang.String dev_Resource__c;

    private com.sforce.soap.enterprise.sobject.Contact dev_Resource__r;

    private java.lang.String dev_Status__c;

    private java.lang.String dev_on_call_response__c;

    private java.util.Date development_End__c;

    private java.util.Date development_Start__c;

    private java.lang.String development_User__c;

    private com.sforce.soap.enterprise.sobject.User development_User__r;

    private java.lang.String disclosure_and_Electronic_Signature__c;

    private java.lang.Boolean do_Not_Send_Priority_Alert_Email__c;

    private java.lang.Boolean do_Not_Send_Survey__c;

    private java.lang.String document_Format__c;

    private java.lang.String drive_Location__c;

    private java.lang.String drive_Name__c;

    private java.lang.String drive_Status__c;

    private java.util.Date due_Date__c;

    private java.lang.String effort_Estimate__c;

    private com.sforce.soap.enterprise.QueryResult emailMessages;

    private java.lang.String email_Address__c;

    private java.lang.String environment_Sub__c;

    private java.lang.String environment__c;

    private java.lang.String error_File_Type__c;

    private java.lang.String error_Reproducable__c;

    private java.lang.String error__c;

    private java.lang.Boolean escalate_to_Dev__c;

    private java.lang.String escalated_for_Bug_Review_By__c;

    private java.lang.Boolean escalated_for_Bug_Review__c;

    private java.lang.String escalated_for_Oracle_Defect_Review_By__c;

    private java.lang.Boolean escalated_for_Oracle_Defect_Review__c;

    private java.lang.String escalated_for_PSI_Review_By__c;

    private java.lang.Boolean escalated_for_PSI_Review__c;

    private java.lang.String escalated_for_Problem_File_Review_By__c;

    private java.lang.Boolean escalated_for_Problem_File_Review__c;

    private java.lang.String escalated_for_Relativity_Bug_Review_By__c;

    private java.lang.Boolean escalated_for_Relativity_Bug_Review__c;

    private java.lang.String escalated_to_Certification_By__c;

    private java.lang.Boolean escalated_to_Certification__c;

    private java.lang.String escalated_to_Dev_By__c;

    private java.lang.String escalated_to_KIE_By__c;

    private java.lang.String escalated_to_L2_Person__c;

    private java.lang.Boolean escalated_to_L2__c;

    private java.lang.String escalated_to_Vendor_By__c;

    private java.lang.Boolean escalated_to_Vendor__c;

    private java.lang.Boolean escalated_to_kIE__c;

    private java.lang.Double estimated_Billable_Time_alert__c;

    private java.lang.Double estimated_Time_High__c;

    private java.lang.Double estimated_Time_Low__c;

    private java.lang.String evaluated_for_Business_Impact_By__c;

    private com.sforce.soap.enterprise.QueryResult events;

    private java.util.Date expected_Load_Date__c;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult feedbacks__r;

    private com.sforce.soap.enterprise.QueryResult feeds;

    private java.lang.String file_Copy_Drive_Name__c;

    private java.lang.Double file_Count__c;

    private java.lang.String file_Pervasiveness__c;

    private java.lang.Double file_Size_GB__c;

    private java.lang.String follow_up_Items__c;

    private java.util.Calendar follow_up_Response_Deadline__c;

    private java.lang.String grouping__c;

    private java.lang.String groups_and_Users__c;

    private java.lang.String HCW_Ticket__c;

    private com.sforce.soap.enterprise.sobject._case HCW_Ticket__r;

    private java.lang.Boolean hasCommentsUnreadByOwner;

    private java.lang.Boolean hasSelfServiceComments;

    private java.lang.Double has_Custom_Solution__c;

    private java.lang.String has_Custom_Solution_old__c;

    private java.lang.String has_Non_Licensing_DLLs__c;

    private java.lang.String help_Group__c;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.util.Calendar hour_Entered_Pause_State__c;

    private java.lang.Double hour_in_Customer_Action__c;

    private java.lang.Double hours__c;

    private java.lang.String impact__c;

    private java.lang.Boolean impeded__c;

    private java.lang.String inbound_Tracking_Number__c;

    private java.util.Calendar initial_Client_Contact__c;

    private java.lang.String initial_Estimate__c;

    private java.lang.String instance__c;

    private com.sforce.soap.enterprise.sobject.Instance__c instance__r;

    private java.lang.Boolean isClosed;

    private java.lang.Boolean isDeleted;

    private java.lang.Boolean isEscalated;

    private java.lang.Boolean isVisibleInSelfService;

    private java.lang.String is_Admin_Contact__c;

    private java.lang.String issue_Description__c;

    private java.lang.String items_Delivered__c;

    private java.lang.Double KCD_Solution_Recipient__c;

    private com.sforce.soap.enterprise.QueryResult KCD_Solution_Recipients__r;

    private java.lang.Boolean known_Defect__c;

    private java.lang.Double lab__c;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.util.Calendar last_Status_Change__c;

    private java.lang.String location__c;

    private java.lang.String location_of_Document__c;

    private java.util.Date long_Term_Actual_Date__c;

    private java.lang.String long_Term_Corrective_Action__c;

    private java.util.Date long_Term_Scheduled_Date__c;

    private java.lang.Double MDF_Size_GB__c;

    private java.lang.String make__c;

    private com.sforce.soap.enterprise.QueryResult marketing_Surveys__r;

    private java.lang.String medium__c;

    private java.lang.String microsoft_Case_Owner_Email__c;

    private java.lang.String microsoft_Case_Owner_Tel__c;

    private java.lang.String microsoft_Case_Owner__c;

    private java.lang.String microsoft_Case__c;

    private java.lang.String microsoft_Severity_Level__c;

    private java.lang.String microsoft_Telephone_Number__c;

    private java.util.Calendar migration_End_Date__c;

    private java.util.Calendar migration_Initial_File_Copy_Start_Date__c;

    private java.lang.Double migration_Number_of_Files_Copied__c;

    private java.lang.Double migration_Size_GB__c;

    private java.lang.String missed_SLA_Deadline_Ticket_Owner__c;

    private java.lang.String model_Product_Number__c;

    private java.lang.String name__c;

    private java.lang.String name_of_Document__c;

    private java.lang.String needs_Immediate_Attention__c;

    private java.lang.String new_Case_Name__c;

    private java.lang.Boolean new_Comment__c;

    private java.lang.Boolean no_Show__c;

    private java.lang.String notes__c;

    private java.lang.Double number_of_Event_Handlers__c;

    private java.lang.Double number_of_Relativity_Analytics_Indexes__c;

    private java.lang.Double number_of_dtSearch_Indexes__c;

    private com.sforce.soap.enterprise.QueryResult openActivities;

    private java.lang.String opened_Day_of_the_Week__c;

    private java.lang.String opportunity__c;

    private com.sforce.soap.enterprise.sobject.Opportunity opportunity__r;

    private java.lang.String oracle_Bug_Number__c;

    private java.lang.String oracle_Status__c;

    private java.util.Date oracle_Ticket_Created_On__c;

    private java.lang.String origin;

    private java.lang.String original_Ticket__c;

    private java.lang.Double other__c;

    private java.lang.String outbound_Tracking_Number__c;

    private java.lang.String overnight_SLA__c;

    private java.lang.Boolean override_Account_Validation__c;

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private java.lang.String owner_Profile__c;

    private java.lang.String owner_Role__c;

    private java.lang.String PS_Defect_Class__c;

    private java.lang.String PS_QC_Comments__c;

    private java.lang.String PS_QC_Status__c;

    private com.sforce.soap.enterprise.sobject._case parent;

    private java.lang.String parentId;

    private com.sforce.soap.enterprise.QueryResult partner_Kickoffs__r;

    private java.lang.String patch_Number__c;

    private java.lang.String person_Returned_To__c;

    private com.sforce.soap.enterprise.sobject.Contact person_Returned_To__r;

    private java.lang.String person_Who_Shipped__c;

    private com.sforce.soap.enterprise.sobject.Contact person_Who_Shipped__r;

    private java.lang.String planned_File_Location__c;

    private java.lang.String pod_Account__c;

    private java.lang.String pod_User__c;

    private java.lang.String pod__c;

    private java.lang.String price_Per_User_2__c;

    private java.lang.String price_per_gb__c;

    private java.lang.String pricing_Schedule__c;

    private java.lang.String priority;

    private java.lang.Boolean problem_Management_Flag__c;

    private java.lang.String problem_Mgmt_Ticket__c;

    private com.sforce.soap.enterprise.sobject._case problem_Mgmt_Ticket__r;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.String product_Application__c;

    private java.lang.String product__c;

    private java.lang.String project_Phase__c;

    private java.lang.Boolean proposal_Approved__c;

    private java.lang.String QC_Comments__c;

    private java.util.Calendar QC_Date__c;

    private java.lang.String QC_Person__c;

    private com.sforce.soap.enterprise.sobject.User QC_Person__r;

    private java.lang.String QC_Status__c;

    private com.sforce.soap.enterprise.sobject.Question question;

    private java.lang.String questionId;

    private java.lang.Double quick_Guide__c;

    private java.util.Date RCA_Certified_Date__c;

    private java.lang.Double random_Sample__c;

    private java.lang.Boolean re_Work_From_Prior_Ticket__c;

    private java.lang.String reason_for_No_Survey__c;

    private java.lang.Boolean recommended_Upgrade__c;

    private com.sforce.soap.enterprise.sobject.RecordType recordType;

    private java.lang.String recordTypeId;

    private java.util.Calendar relAn_Date_Verified__c;

    private java.lang.String relAn_Drive_Name__c;

    private java.lang.String relativity_Case__c;

    private com.sforce.soap.enterprise.sobject.Relativity_Case__c relativity_Case__r;

    private java.lang.String relativity_Version_Fixed__c;

    private com.sforce.soap.enterprise.sobject.Release__c relativity_Version_Fixed__r;

    private java.lang.String relativity_Version__c;

    private java.lang.Boolean release_Verified__c;

    private java.lang.String release__c;

    private com.sforce.soap.enterprise.sobject.Release__c release__r;

    private java.lang.String report_Details__c;

    private java.lang.String request_Type__c;

    private java.util.Date requested_Due_Date__c;

    private java.lang.Double research__c;

    private java.lang.Boolean retail_Box_Incuded__c;

    private java.lang.Boolean return_with_Origninal_Shipping_Container__c;

    private java.lang.String review_for_KCD_By__c;

    private java.lang.Boolean review_for_KCD_Ticket__c;

    private java.lang.String root_Cause_Description__c;

    private java.lang.String root_Cause_Sub__c;

    private java.lang.String root_Cause__c;

    private com.sforce.soap.enterprise.QueryResult SFDC_Projects__r;

    private java.lang.Boolean SLA_Exceeded__c;

    private java.lang.String SLA_Missed_By__c;

    private java.util.Calendar SLA_Response_Deadline__c;

    private java.lang.Double SLA_Response_Time__c;

    private java.lang.String SR_Number__c;

    private java.lang.Boolean sales_Queue_Ownership__c;

    private java.lang.String sales_Queue__c;

    private java.lang.String sales_Type_Sub__c;

    private java.lang.String sales_Type__c;

    private java.util.Calendar scheduled__c;

    private java.lang.Double school_Program__c;

    private java.lang.Boolean send_Email_Survey__c;

    private java.lang.String serial_Number__c;

    private java.lang.String server_Application__c;

    private java.lang.String server_OS__c;

    private com.sforce.soap.enterprise.QueryResult shares;

    private java.util.Date shipped_Date__c;

    private java.util.Date short_Term_Actual_Date__c;

    private java.lang.String short_Term_Corrective_Action__c;

    private java.util.Date short_Term_Scheduled_Date__c;

    private java.lang.String signature__c;

    private java.lang.Boolean simple_Template__c;

    private com.sforce.soap.enterprise.QueryResult solutions;

    private java.lang.String special_Instructions__c;

    private java.lang.String specifics__c;

    private java.lang.String status;

    private java.util.Calendar status_Call_End_Date__c;

    private java.util.Calendar status_Call_Start_Date__c;

    private java.lang.String status_Description__c;

    private java.util.Calendar status_Last_Modified_del__c;

    private java.lang.String status_Meeting_Conference_Info__c;

    private java.lang.String status_Meeting_Notes__c;

    private java.lang.String status_Meeting__c;

    private com.sforce.soap.enterprise.sobject.Status_Meeting__c status_Meeting__r;

    private java.lang.Double study_Material__c;

    private java.lang.String subject;

    private java.lang.String suppliedEmail;

    private java.lang.String suppliedName;

    private java.lang.String support_Hours__c;

    private java.lang.Double support_Sample_Number__c;

    private java.lang.String support__c;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    private com.sforce.soap.enterprise.QueryResult teamMembers;

    private com.sforce.soap.enterprise.QueryResult teamTemplateRecords;

    private java.lang.String technical_Resource__c;

    private java.lang.String test_Case_to_Reproduce__c;

    private com.sforce.soap.enterprise.QueryResult ticketReleaseAssociations__r;

    private java.lang.Boolean ticket_ReOpened__c;

    private java.lang.String tier_1_User__c;

    private com.sforce.soap.enterprise.sobject.User tier_1_User__r;

    private java.lang.String tier_2_User__c;

    private com.sforce.soap.enterprise.sobject.User tier_2_User__r;

    private java.lang.String tier_Assignment_Flag__c;

    private java.lang.String tier_Assignment__c;

    private java.lang.Double time_Difference_Final__c;

    private java.lang.Double time_Spent_on_Ticket__c;

    private java.lang.String time_Tracking_Type__c;

    private java.lang.Double time_With_Customer__c;

    private java.lang.Double time_With_Support__c;

    private java.lang.Double time_in_Queue__c;

    private java.lang.String time_on_Case_del__c;

    private java.lang.Double total_Billable_Time__c;

    private java.lang.Double total_Data_Size_in_GB__c;

    private java.lang.String total_Escalated_Tickets__c;

    private java.lang.String total_Escalated_for_Bug_Review__c;

    private java.lang.String total_Escalated_to_Dev__c;

    private java.lang.String total_Evaluated_for_Business_Impact__c;

    private java.lang.Double total_Number_of_Deliverables__c;

    private java.lang.Double total_Time__c;

    private java.lang.Double trainer_Outline__c;

    private java.lang.String training_Category__c;

    private java.lang.Double training_PPT__c;

    private java.lang.Double training_Workbook__c;

    private java.lang.String transaction__c;

    private com.sforce.soap.enterprise.sobject.Transaction__c transaction__r;

    private java.lang.Double tutorial__c;

    private java.lang.String type;

    private java.lang.String type_Sub__c;

    private java.lang.String type_of_Document__c;

    private java.util.Date update_Interval_Start_Date__c;

    private java.lang.String update_Interval__c;

    private java.lang.String urgency__c;

    private java.lang.String user__c;

    private com.sforce.soap.enterprise.sobject.User user__r;

    private java.lang.String validated_In_Version__c;

    private java.lang.String vendor__c;

    private java.lang.String verify_Release__c;

    private java.lang.String version_Origin__c;

    private java.lang.String version__c;

    private java.lang.Double video__c;

    private java.lang.String viewer_Version_Fixed__c;

    private java.lang.Double webinar_Recording__c;

    private java.lang.Double webinar__c;

    private java.lang.String what__c;

    private java.lang.String where_is_drive__c;

    private com.sforce.soap.enterprise.sobject.Servers__c where_is_drive__r;

    private java.util.Date workaround_Actual_Date__c;

    private java.util.Date workaround_Scheduled_Date__c;

    private java.lang.String workaround__c;

    private java.lang.Double x24_Hour_Follow_up_Deadline_Missed__c;

    private java.util.Date x90_Day_Deployment_Checkup_Date__c;

    private java.lang.Double YTD_Total_Days__c;

    private java.util.Calendar dtSearch_Date_Verified__c;

    private java.lang.String dtSearch_Drive_Name__c;

    private java.lang.String kCura_Email_Addresses__c;

    private java.lang.Double kIE_Age__c;

    private java.lang.String kIE_Resource__c;

    private com.sforce.soap.enterprise.sobject.Contact kIE_Resource__r;

    private java.lang.String kIE_Status__c;

    private java.lang.Double time_in_new__c;

    private java.lang.Boolean xEvaluate_for_Business_Impact__c;

    public _case() {
    }

    public _case(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String AM_PM__c,
           com.sforce.soap.enterprise.sobject.Account account,
           java.lang.String accountId,
           java.lang.String account_Alert__c,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           java.lang.Double actual_Billable_Time__c,
           java.lang.String add_to_Official_Doc_Set__c,
           java.util.Calendar added_to_Backlog_Date__c,
           java.lang.String admin_Contact__c,
           java.lang.String applications_Installed__c,
           java.lang.Boolean approved__c,
           java.lang.Double approximate_Time_Spent__c,
           java.lang.String area__c,
           java.lang.String associated_Ticket_s__c,
           com.sforce.soap.enterprise.QueryResult associated_Tickets__r,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String avoidance_Comments__c,
           java.lang.String avoidance__c,
           java.lang.Boolean BA_Tested__c,
           java.lang.String BA_Ticket_Owner__c,
           com.sforce.soap.enterprise.sobject.User BA_Ticket_Owner__r,
           java.lang.String best_Time_to_Contact__c,
           java.lang.String best_Way_to_Contact__c,
           java.lang.String billable__c,
           java.lang.String bug_Patch_Resolution_Notes__c,
           com.sforce.soap.enterprise.sobject.BusinessHours businessHours,
           java.lang.String businessHoursId,
           java.lang.String CS_Management_User__c,
           com.sforce.soap.enterprise.sobject.User CS_Management_User__r,
           com.sforce.soap.enterprise.QueryResult caseArticles,
           com.sforce.soap.enterprise.QueryResult caseComments,
           com.sforce.soap.enterprise.QueryResult caseContactRoles,
           java.lang.String caseNumber,
           com.sforce.soap.enterprise.QueryResult caseSolutions,
           java.lang.String case_Admin_2__c,
           com.sforce.soap.enterprise.sobject.Contact case_Admin_2__r,
           java.lang.String case_Admin_3__c,
           com.sforce.soap.enterprise.sobject.Contact case_Admin_3__r,
           java.lang.String case_Admin_4__c,
           com.sforce.soap.enterprise.sobject.Contact case_Admin_4__r,
           java.lang.Double case_Age_In_Business_Hours__c,
           java.lang.Boolean case_Age_Update__c,
           java.lang.Double case_Age__c,
           com.sforce.soap.enterprise.QueryResult case_Migration_Differential_Copies__r,
           java.lang.Boolean case_Status_Client_Active_Import_Export__c,
           java.lang.Boolean case_Status_Client_Active__c,
           java.lang.String case_Template__c,
           com.sforce.soap.enterprise.sobject.Relativity_Case__c case_Template__r,
           java.lang.String case_Time_Billable__c,
           java.lang.String case_Time_Category__c,
           com.sforce.soap.enterprise.QueryResult cases,
           com.sforce.soap.enterprise.QueryResult cases__r,
           java.lang.String category__c,
           com.sforce.soap.enterprise.sobject.Category__c category__r,
           java.lang.Boolean certified_Admin_Static__c,
           java.lang.String certified_Admin__c,
           com.sforce.soap.enterprise.QueryResult changeControlTicketAssociation__r,
           com.sforce.soap.enterprise.QueryResult checklists__r,
           java.lang.String client_Contact_Status__c,
           java.util.Calendar client_Contacted__c,
           java.lang.String client_Email_Addresses__c,
           java.lang.String client_Inernal_Tracking_Number__c,
           java.lang.Boolean client_Requested_Escalation__c,
           java.lang.String client_Type__c,
           java.util.Calendar closedDate,
           java.lang.String closing_Note__c,
           java.lang.String computer_Connected_To__c,
           com.sforce.soap.enterprise.sobject.Contact contact,
           java.lang.String contactId,
           java.lang.String contact_1__c,
           com.sforce.soap.enterprise.sobject.Contact contact_1__r,
           java.lang.Double content_Updates__c,
           java.lang.Double count_of_Case_Time_Records__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String customization_and_Consulting__c,
           com.sforce.soap.enterprise.QueryResult data_Files__r,
           java.lang.String database_Drive_Name__c,
           java.util.Calendar date_Client_Requested_Escalation__c,
           java.util.Calendar date_Escalated__c,
           java.util.Calendar date_Escalated_for_Oracle_Defect_Review__c,
           java.util.Calendar date_Escalated_for_PSI_Review__c,
           java.util.Calendar date_Escalated_for_Problem_File_Review__c,
           java.util.Calendar date_Escalated_for_Relativity_Bug_Review__c,
           java.util.Calendar date_Escalated_for_bug_Review__c,
           java.util.Calendar date_Escalated_to_Certification__c,
           java.util.Calendar date_Escalated_to_Dev__c,
           java.util.Calendar date_Escalated_to_Vendor__c,
           java.util.Calendar date_Escalated_to_kIE__c,
           java.util.Calendar date_Evaluated_For_Business_Impact__c,
           java.util.Calendar date_KIE_Status_Completed__c,
           java.util.Date date_Microsoft_case_opened__c,
           java.lang.String date_Range__c,
           java.util.Date date_Received__c,
           java.util.Date date_Recommended_Upgrade__c,
           java.util.Calendar date_Reviewed_for_KCD_Ticket__c,
           java.util.Date date_Sent_to_Client__c,
           java.util.Date date_Shipped_to_kCura__c,
           java.util.Calendar date_Time_Outage_Started__c,
           java.util.Calendar date_Time_Service_Restored__c,
           java.util.Date date__c,
           java.lang.Double days_of_Month__c,
           java.util.Date deadline__c,
           java.util.Calendar deadline_for_Access_Creation__c,
           java.util.Date deliver_By__c,
           java.lang.String department_Sub__c,
           java.lang.String department__c,
           java.lang.String description,
           java.lang.String dev_Resource__c,
           com.sforce.soap.enterprise.sobject.Contact dev_Resource__r,
           java.lang.String dev_Status__c,
           java.lang.String dev_on_call_response__c,
           java.util.Date development_End__c,
           java.util.Date development_Start__c,
           java.lang.String development_User__c,
           com.sforce.soap.enterprise.sobject.User development_User__r,
           java.lang.String disclosure_and_Electronic_Signature__c,
           java.lang.Boolean do_Not_Send_Priority_Alert_Email__c,
           java.lang.Boolean do_Not_Send_Survey__c,
           java.lang.String document_Format__c,
           java.lang.String drive_Location__c,
           java.lang.String drive_Name__c,
           java.lang.String drive_Status__c,
           java.util.Date due_Date__c,
           java.lang.String effort_Estimate__c,
           com.sforce.soap.enterprise.QueryResult emailMessages,
           java.lang.String email_Address__c,
           java.lang.String environment_Sub__c,
           java.lang.String environment__c,
           java.lang.String error_File_Type__c,
           java.lang.String error_Reproducable__c,
           java.lang.String error__c,
           java.lang.Boolean escalate_to_Dev__c,
           java.lang.String escalated_for_Bug_Review_By__c,
           java.lang.Boolean escalated_for_Bug_Review__c,
           java.lang.String escalated_for_Oracle_Defect_Review_By__c,
           java.lang.Boolean escalated_for_Oracle_Defect_Review__c,
           java.lang.String escalated_for_PSI_Review_By__c,
           java.lang.Boolean escalated_for_PSI_Review__c,
           java.lang.String escalated_for_Problem_File_Review_By__c,
           java.lang.Boolean escalated_for_Problem_File_Review__c,
           java.lang.String escalated_for_Relativity_Bug_Review_By__c,
           java.lang.Boolean escalated_for_Relativity_Bug_Review__c,
           java.lang.String escalated_to_Certification_By__c,
           java.lang.Boolean escalated_to_Certification__c,
           java.lang.String escalated_to_Dev_By__c,
           java.lang.String escalated_to_KIE_By__c,
           java.lang.String escalated_to_L2_Person__c,
           java.lang.Boolean escalated_to_L2__c,
           java.lang.String escalated_to_Vendor_By__c,
           java.lang.Boolean escalated_to_Vendor__c,
           java.lang.Boolean escalated_to_kIE__c,
           java.lang.Double estimated_Billable_Time_alert__c,
           java.lang.Double estimated_Time_High__c,
           java.lang.Double estimated_Time_Low__c,
           java.lang.String evaluated_for_Business_Impact_By__c,
           com.sforce.soap.enterprise.QueryResult events,
           java.util.Date expected_Load_Date__c,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult feedbacks__r,
           com.sforce.soap.enterprise.QueryResult feeds,
           java.lang.String file_Copy_Drive_Name__c,
           java.lang.Double file_Count__c,
           java.lang.String file_Pervasiveness__c,
           java.lang.Double file_Size_GB__c,
           java.lang.String follow_up_Items__c,
           java.util.Calendar follow_up_Response_Deadline__c,
           java.lang.String grouping__c,
           java.lang.String groups_and_Users__c,
           java.lang.String HCW_Ticket__c,
           com.sforce.soap.enterprise.sobject._case HCW_Ticket__r,
           java.lang.Boolean hasCommentsUnreadByOwner,
           java.lang.Boolean hasSelfServiceComments,
           java.lang.Double has_Custom_Solution__c,
           java.lang.String has_Custom_Solution_old__c,
           java.lang.String has_Non_Licensing_DLLs__c,
           java.lang.String help_Group__c,
           com.sforce.soap.enterprise.QueryResult histories,
           java.util.Calendar hour_Entered_Pause_State__c,
           java.lang.Double hour_in_Customer_Action__c,
           java.lang.Double hours__c,
           java.lang.String impact__c,
           java.lang.Boolean impeded__c,
           java.lang.String inbound_Tracking_Number__c,
           java.util.Calendar initial_Client_Contact__c,
           java.lang.String initial_Estimate__c,
           java.lang.String instance__c,
           com.sforce.soap.enterprise.sobject.Instance__c instance__r,
           java.lang.Boolean isClosed,
           java.lang.Boolean isDeleted,
           java.lang.Boolean isEscalated,
           java.lang.Boolean isVisibleInSelfService,
           java.lang.String is_Admin_Contact__c,
           java.lang.String issue_Description__c,
           java.lang.String items_Delivered__c,
           java.lang.Double KCD_Solution_Recipient__c,
           com.sforce.soap.enterprise.QueryResult KCD_Solution_Recipients__r,
           java.lang.Boolean known_Defect__c,
           java.lang.Double lab__c,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.util.Calendar last_Status_Change__c,
           java.lang.String location__c,
           java.lang.String location_of_Document__c,
           java.util.Date long_Term_Actual_Date__c,
           java.lang.String long_Term_Corrective_Action__c,
           java.util.Date long_Term_Scheduled_Date__c,
           java.lang.Double MDF_Size_GB__c,
           java.lang.String make__c,
           com.sforce.soap.enterprise.QueryResult marketing_Surveys__r,
           java.lang.String medium__c,
           java.lang.String microsoft_Case_Owner_Email__c,
           java.lang.String microsoft_Case_Owner_Tel__c,
           java.lang.String microsoft_Case_Owner__c,
           java.lang.String microsoft_Case__c,
           java.lang.String microsoft_Severity_Level__c,
           java.lang.String microsoft_Telephone_Number__c,
           java.util.Calendar migration_End_Date__c,
           java.util.Calendar migration_Initial_File_Copy_Start_Date__c,
           java.lang.Double migration_Number_of_Files_Copied__c,
           java.lang.Double migration_Size_GB__c,
           java.lang.String missed_SLA_Deadline_Ticket_Owner__c,
           java.lang.String model_Product_Number__c,
           java.lang.String name__c,
           java.lang.String name_of_Document__c,
           java.lang.String needs_Immediate_Attention__c,
           java.lang.String new_Case_Name__c,
           java.lang.Boolean new_Comment__c,
           java.lang.Boolean no_Show__c,
           java.lang.String notes__c,
           java.lang.Double number_of_Event_Handlers__c,
           java.lang.Double number_of_Relativity_Analytics_Indexes__c,
           java.lang.Double number_of_dtSearch_Indexes__c,
           com.sforce.soap.enterprise.QueryResult openActivities,
           java.lang.String opened_Day_of_the_Week__c,
           java.lang.String opportunity__c,
           com.sforce.soap.enterprise.sobject.Opportunity opportunity__r,
           java.lang.String oracle_Bug_Number__c,
           java.lang.String oracle_Status__c,
           java.util.Date oracle_Ticket_Created_On__c,
           java.lang.String origin,
           java.lang.String original_Ticket__c,
           java.lang.Double other__c,
           java.lang.String outbound_Tracking_Number__c,
           java.lang.String overnight_SLA__c,
           java.lang.Boolean override_Account_Validation__c,
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           java.lang.String owner_Profile__c,
           java.lang.String owner_Role__c,
           java.lang.String PS_Defect_Class__c,
           java.lang.String PS_QC_Comments__c,
           java.lang.String PS_QC_Status__c,
           com.sforce.soap.enterprise.sobject._case parent,
           java.lang.String parentId,
           com.sforce.soap.enterprise.QueryResult partner_Kickoffs__r,
           java.lang.String patch_Number__c,
           java.lang.String person_Returned_To__c,
           com.sforce.soap.enterprise.sobject.Contact person_Returned_To__r,
           java.lang.String person_Who_Shipped__c,
           com.sforce.soap.enterprise.sobject.Contact person_Who_Shipped__r,
           java.lang.String planned_File_Location__c,
           java.lang.String pod_Account__c,
           java.lang.String pod_User__c,
           java.lang.String pod__c,
           java.lang.String price_Per_User_2__c,
           java.lang.String price_per_gb__c,
           java.lang.String pricing_Schedule__c,
           java.lang.String priority,
           java.lang.Boolean problem_Management_Flag__c,
           java.lang.String problem_Mgmt_Ticket__c,
           com.sforce.soap.enterprise.sobject._case problem_Mgmt_Ticket__r,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.String product_Application__c,
           java.lang.String product__c,
           java.lang.String project_Phase__c,
           java.lang.Boolean proposal_Approved__c,
           java.lang.String QC_Comments__c,
           java.util.Calendar QC_Date__c,
           java.lang.String QC_Person__c,
           com.sforce.soap.enterprise.sobject.User QC_Person__r,
           java.lang.String QC_Status__c,
           com.sforce.soap.enterprise.sobject.Question question,
           java.lang.String questionId,
           java.lang.Double quick_Guide__c,
           java.util.Date RCA_Certified_Date__c,
           java.lang.Double random_Sample__c,
           java.lang.Boolean re_Work_From_Prior_Ticket__c,
           java.lang.String reason_for_No_Survey__c,
           java.lang.Boolean recommended_Upgrade__c,
           com.sforce.soap.enterprise.sobject.RecordType recordType,
           java.lang.String recordTypeId,
           java.util.Calendar relAn_Date_Verified__c,
           java.lang.String relAn_Drive_Name__c,
           java.lang.String relativity_Case__c,
           com.sforce.soap.enterprise.sobject.Relativity_Case__c relativity_Case__r,
           java.lang.String relativity_Version_Fixed__c,
           com.sforce.soap.enterprise.sobject.Release__c relativity_Version_Fixed__r,
           java.lang.String relativity_Version__c,
           java.lang.Boolean release_Verified__c,
           java.lang.String release__c,
           com.sforce.soap.enterprise.sobject.Release__c release__r,
           java.lang.String report_Details__c,
           java.lang.String request_Type__c,
           java.util.Date requested_Due_Date__c,
           java.lang.Double research__c,
           java.lang.Boolean retail_Box_Incuded__c,
           java.lang.Boolean return_with_Origninal_Shipping_Container__c,
           java.lang.String review_for_KCD_By__c,
           java.lang.Boolean review_for_KCD_Ticket__c,
           java.lang.String root_Cause_Description__c,
           java.lang.String root_Cause_Sub__c,
           java.lang.String root_Cause__c,
           com.sforce.soap.enterprise.QueryResult SFDC_Projects__r,
           java.lang.Boolean SLA_Exceeded__c,
           java.lang.String SLA_Missed_By__c,
           java.util.Calendar SLA_Response_Deadline__c,
           java.lang.Double SLA_Response_Time__c,
           java.lang.String SR_Number__c,
           java.lang.Boolean sales_Queue_Ownership__c,
           java.lang.String sales_Queue__c,
           java.lang.String sales_Type_Sub__c,
           java.lang.String sales_Type__c,
           java.util.Calendar scheduled__c,
           java.lang.Double school_Program__c,
           java.lang.Boolean send_Email_Survey__c,
           java.lang.String serial_Number__c,
           java.lang.String server_Application__c,
           java.lang.String server_OS__c,
           com.sforce.soap.enterprise.QueryResult shares,
           java.util.Date shipped_Date__c,
           java.util.Date short_Term_Actual_Date__c,
           java.lang.String short_Term_Corrective_Action__c,
           java.util.Date short_Term_Scheduled_Date__c,
           java.lang.String signature__c,
           java.lang.Boolean simple_Template__c,
           com.sforce.soap.enterprise.QueryResult solutions,
           java.lang.String special_Instructions__c,
           java.lang.String specifics__c,
           java.lang.String status,
           java.util.Calendar status_Call_End_Date__c,
           java.util.Calendar status_Call_Start_Date__c,
           java.lang.String status_Description__c,
           java.util.Calendar status_Last_Modified_del__c,
           java.lang.String status_Meeting_Conference_Info__c,
           java.lang.String status_Meeting_Notes__c,
           java.lang.String status_Meeting__c,
           com.sforce.soap.enterprise.sobject.Status_Meeting__c status_Meeting__r,
           java.lang.Double study_Material__c,
           java.lang.String subject,
           java.lang.String suppliedEmail,
           java.lang.String suppliedName,
           java.lang.String support_Hours__c,
           java.lang.Double support_Sample_Number__c,
           java.lang.String support__c,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks,
           com.sforce.soap.enterprise.QueryResult teamMembers,
           com.sforce.soap.enterprise.QueryResult teamTemplateRecords,
           java.lang.String technical_Resource__c,
           java.lang.String test_Case_to_Reproduce__c,
           com.sforce.soap.enterprise.QueryResult ticketReleaseAssociations__r,
           java.lang.Boolean ticket_ReOpened__c,
           java.lang.String tier_1_User__c,
           com.sforce.soap.enterprise.sobject.User tier_1_User__r,
           java.lang.String tier_2_User__c,
           com.sforce.soap.enterprise.sobject.User tier_2_User__r,
           java.lang.String tier_Assignment_Flag__c,
           java.lang.String tier_Assignment__c,
           java.lang.Double time_Difference_Final__c,
           java.lang.Double time_Spent_on_Ticket__c,
           java.lang.String time_Tracking_Type__c,
           java.lang.Double time_With_Customer__c,
           java.lang.Double time_With_Support__c,
           java.lang.Double time_in_Queue__c,
           java.lang.String time_on_Case_del__c,
           java.lang.Double total_Billable_Time__c,
           java.lang.Double total_Data_Size_in_GB__c,
           java.lang.String total_Escalated_Tickets__c,
           java.lang.String total_Escalated_for_Bug_Review__c,
           java.lang.String total_Escalated_to_Dev__c,
           java.lang.String total_Evaluated_for_Business_Impact__c,
           java.lang.Double total_Number_of_Deliverables__c,
           java.lang.Double total_Time__c,
           java.lang.Double trainer_Outline__c,
           java.lang.String training_Category__c,
           java.lang.Double training_PPT__c,
           java.lang.Double training_Workbook__c,
           java.lang.String transaction__c,
           com.sforce.soap.enterprise.sobject.Transaction__c transaction__r,
           java.lang.Double tutorial__c,
           java.lang.String type,
           java.lang.String type_Sub__c,
           java.lang.String type_of_Document__c,
           java.util.Date update_Interval_Start_Date__c,
           java.lang.String update_Interval__c,
           java.lang.String urgency__c,
           java.lang.String user__c,
           com.sforce.soap.enterprise.sobject.User user__r,
           java.lang.String validated_In_Version__c,
           java.lang.String vendor__c,
           java.lang.String verify_Release__c,
           java.lang.String version_Origin__c,
           java.lang.String version__c,
           java.lang.Double video__c,
           java.lang.String viewer_Version_Fixed__c,
           java.lang.Double webinar_Recording__c,
           java.lang.Double webinar__c,
           java.lang.String what__c,
           java.lang.String where_is_drive__c,
           com.sforce.soap.enterprise.sobject.Servers__c where_is_drive__r,
           java.util.Date workaround_Actual_Date__c,
           java.util.Date workaround_Scheduled_Date__c,
           java.lang.String workaround__c,
           java.lang.Double x24_Hour_Follow_up_Deadline_Missed__c,
           java.util.Date x90_Day_Deployment_Checkup_Date__c,
           java.lang.Double YTD_Total_Days__c,
           java.util.Calendar dtSearch_Date_Verified__c,
           java.lang.String dtSearch_Drive_Name__c,
           java.lang.String kCura_Email_Addresses__c,
           java.lang.Double kIE_Age__c,
           java.lang.String kIE_Resource__c,
           com.sforce.soap.enterprise.sobject.Contact kIE_Resource__r,
           java.lang.String kIE_Status__c,
           java.lang.Double time_in_new__c,
           java.lang.Boolean xEvaluate_for_Business_Impact__c) {
        super(
            fieldsToNull,
            id);
        this.AM_PM__c = AM_PM__c;
        this.account = account;
        this.accountId = accountId;
        this.account_Alert__c = account_Alert__c;
        this.activityHistories = activityHistories;
        this.actual_Billable_Time__c = actual_Billable_Time__c;
        this.add_to_Official_Doc_Set__c = add_to_Official_Doc_Set__c;
        this.added_to_Backlog_Date__c = added_to_Backlog_Date__c;
        this.admin_Contact__c = admin_Contact__c;
        this.applications_Installed__c = applications_Installed__c;
        this.approved__c = approved__c;
        this.approximate_Time_Spent__c = approximate_Time_Spent__c;
        this.area__c = area__c;
        this.associated_Ticket_s__c = associated_Ticket_s__c;
        this.associated_Tickets__r = associated_Tickets__r;
        this.attachments = attachments;
        this.avoidance_Comments__c = avoidance_Comments__c;
        this.avoidance__c = avoidance__c;
        this.BA_Tested__c = BA_Tested__c;
        this.BA_Ticket_Owner__c = BA_Ticket_Owner__c;
        this.BA_Ticket_Owner__r = BA_Ticket_Owner__r;
        this.best_Time_to_Contact__c = best_Time_to_Contact__c;
        this.best_Way_to_Contact__c = best_Way_to_Contact__c;
        this.billable__c = billable__c;
        this.bug_Patch_Resolution_Notes__c = bug_Patch_Resolution_Notes__c;
        this.businessHours = businessHours;
        this.businessHoursId = businessHoursId;
        this.CS_Management_User__c = CS_Management_User__c;
        this.CS_Management_User__r = CS_Management_User__r;
        this.caseArticles = caseArticles;
        this.caseComments = caseComments;
        this.caseContactRoles = caseContactRoles;
        this.caseNumber = caseNumber;
        this.caseSolutions = caseSolutions;
        this.case_Admin_2__c = case_Admin_2__c;
        this.case_Admin_2__r = case_Admin_2__r;
        this.case_Admin_3__c = case_Admin_3__c;
        this.case_Admin_3__r = case_Admin_3__r;
        this.case_Admin_4__c = case_Admin_4__c;
        this.case_Admin_4__r = case_Admin_4__r;
        this.case_Age_In_Business_Hours__c = case_Age_In_Business_Hours__c;
        this.case_Age_Update__c = case_Age_Update__c;
        this.case_Age__c = case_Age__c;
        this.case_Migration_Differential_Copies__r = case_Migration_Differential_Copies__r;
        this.case_Status_Client_Active_Import_Export__c = case_Status_Client_Active_Import_Export__c;
        this.case_Status_Client_Active__c = case_Status_Client_Active__c;
        this.case_Template__c = case_Template__c;
        this.case_Template__r = case_Template__r;
        this.case_Time_Billable__c = case_Time_Billable__c;
        this.case_Time_Category__c = case_Time_Category__c;
        this.cases = cases;
        this.cases__r = cases__r;
        this.category__c = category__c;
        this.category__r = category__r;
        this.certified_Admin_Static__c = certified_Admin_Static__c;
        this.certified_Admin__c = certified_Admin__c;
        this.changeControlTicketAssociation__r = changeControlTicketAssociation__r;
        this.checklists__r = checklists__r;
        this.client_Contact_Status__c = client_Contact_Status__c;
        this.client_Contacted__c = client_Contacted__c;
        this.client_Email_Addresses__c = client_Email_Addresses__c;
        this.client_Inernal_Tracking_Number__c = client_Inernal_Tracking_Number__c;
        this.client_Requested_Escalation__c = client_Requested_Escalation__c;
        this.client_Type__c = client_Type__c;
        this.closedDate = closedDate;
        this.closing_Note__c = closing_Note__c;
        this.computer_Connected_To__c = computer_Connected_To__c;
        this.contact = contact;
        this.contactId = contactId;
        this.contact_1__c = contact_1__c;
        this.contact_1__r = contact_1__r;
        this.content_Updates__c = content_Updates__c;
        this.count_of_Case_Time_Records__c = count_of_Case_Time_Records__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.customization_and_Consulting__c = customization_and_Consulting__c;
        this.data_Files__r = data_Files__r;
        this.database_Drive_Name__c = database_Drive_Name__c;
        this.date_Client_Requested_Escalation__c = date_Client_Requested_Escalation__c;
        this.date_Escalated__c = date_Escalated__c;
        this.date_Escalated_for_Oracle_Defect_Review__c = date_Escalated_for_Oracle_Defect_Review__c;
        this.date_Escalated_for_PSI_Review__c = date_Escalated_for_PSI_Review__c;
        this.date_Escalated_for_Problem_File_Review__c = date_Escalated_for_Problem_File_Review__c;
        this.date_Escalated_for_Relativity_Bug_Review__c = date_Escalated_for_Relativity_Bug_Review__c;
        this.date_Escalated_for_bug_Review__c = date_Escalated_for_bug_Review__c;
        this.date_Escalated_to_Certification__c = date_Escalated_to_Certification__c;
        this.date_Escalated_to_Dev__c = date_Escalated_to_Dev__c;
        this.date_Escalated_to_Vendor__c = date_Escalated_to_Vendor__c;
        this.date_Escalated_to_kIE__c = date_Escalated_to_kIE__c;
        this.date_Evaluated_For_Business_Impact__c = date_Evaluated_For_Business_Impact__c;
        this.date_KIE_Status_Completed__c = date_KIE_Status_Completed__c;
        this.date_Microsoft_case_opened__c = date_Microsoft_case_opened__c;
        this.date_Range__c = date_Range__c;
        this.date_Received__c = date_Received__c;
        this.date_Recommended_Upgrade__c = date_Recommended_Upgrade__c;
        this.date_Reviewed_for_KCD_Ticket__c = date_Reviewed_for_KCD_Ticket__c;
        this.date_Sent_to_Client__c = date_Sent_to_Client__c;
        this.date_Shipped_to_kCura__c = date_Shipped_to_kCura__c;
        this.date_Time_Outage_Started__c = date_Time_Outage_Started__c;
        this.date_Time_Service_Restored__c = date_Time_Service_Restored__c;
        this.date__c = date__c;
        this.days_of_Month__c = days_of_Month__c;
        this.deadline__c = deadline__c;
        this.deadline_for_Access_Creation__c = deadline_for_Access_Creation__c;
        this.deliver_By__c = deliver_By__c;
        this.department_Sub__c = department_Sub__c;
        this.department__c = department__c;
        this.description = description;
        this.dev_Resource__c = dev_Resource__c;
        this.dev_Resource__r = dev_Resource__r;
        this.dev_Status__c = dev_Status__c;
        this.dev_on_call_response__c = dev_on_call_response__c;
        this.development_End__c = development_End__c;
        this.development_Start__c = development_Start__c;
        this.development_User__c = development_User__c;
        this.development_User__r = development_User__r;
        this.disclosure_and_Electronic_Signature__c = disclosure_and_Electronic_Signature__c;
        this.do_Not_Send_Priority_Alert_Email__c = do_Not_Send_Priority_Alert_Email__c;
        this.do_Not_Send_Survey__c = do_Not_Send_Survey__c;
        this.document_Format__c = document_Format__c;
        this.drive_Location__c = drive_Location__c;
        this.drive_Name__c = drive_Name__c;
        this.drive_Status__c = drive_Status__c;
        this.due_Date__c = due_Date__c;
        this.effort_Estimate__c = effort_Estimate__c;
        this.emailMessages = emailMessages;
        this.email_Address__c = email_Address__c;
        this.environment_Sub__c = environment_Sub__c;
        this.environment__c = environment__c;
        this.error_File_Type__c = error_File_Type__c;
        this.error_Reproducable__c = error_Reproducable__c;
        this.error__c = error__c;
        this.escalate_to_Dev__c = escalate_to_Dev__c;
        this.escalated_for_Bug_Review_By__c = escalated_for_Bug_Review_By__c;
        this.escalated_for_Bug_Review__c = escalated_for_Bug_Review__c;
        this.escalated_for_Oracle_Defect_Review_By__c = escalated_for_Oracle_Defect_Review_By__c;
        this.escalated_for_Oracle_Defect_Review__c = escalated_for_Oracle_Defect_Review__c;
        this.escalated_for_PSI_Review_By__c = escalated_for_PSI_Review_By__c;
        this.escalated_for_PSI_Review__c = escalated_for_PSI_Review__c;
        this.escalated_for_Problem_File_Review_By__c = escalated_for_Problem_File_Review_By__c;
        this.escalated_for_Problem_File_Review__c = escalated_for_Problem_File_Review__c;
        this.escalated_for_Relativity_Bug_Review_By__c = escalated_for_Relativity_Bug_Review_By__c;
        this.escalated_for_Relativity_Bug_Review__c = escalated_for_Relativity_Bug_Review__c;
        this.escalated_to_Certification_By__c = escalated_to_Certification_By__c;
        this.escalated_to_Certification__c = escalated_to_Certification__c;
        this.escalated_to_Dev_By__c = escalated_to_Dev_By__c;
        this.escalated_to_KIE_By__c = escalated_to_KIE_By__c;
        this.escalated_to_L2_Person__c = escalated_to_L2_Person__c;
        this.escalated_to_L2__c = escalated_to_L2__c;
        this.escalated_to_Vendor_By__c = escalated_to_Vendor_By__c;
        this.escalated_to_Vendor__c = escalated_to_Vendor__c;
        this.escalated_to_kIE__c = escalated_to_kIE__c;
        this.estimated_Billable_Time_alert__c = estimated_Billable_Time_alert__c;
        this.estimated_Time_High__c = estimated_Time_High__c;
        this.estimated_Time_Low__c = estimated_Time_Low__c;
        this.evaluated_for_Business_Impact_By__c = evaluated_for_Business_Impact_By__c;
        this.events = events;
        this.expected_Load_Date__c = expected_Load_Date__c;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.feedbacks__r = feedbacks__r;
        this.feeds = feeds;
        this.file_Copy_Drive_Name__c = file_Copy_Drive_Name__c;
        this.file_Count__c = file_Count__c;
        this.file_Pervasiveness__c = file_Pervasiveness__c;
        this.file_Size_GB__c = file_Size_GB__c;
        this.follow_up_Items__c = follow_up_Items__c;
        this.follow_up_Response_Deadline__c = follow_up_Response_Deadline__c;
        this.grouping__c = grouping__c;
        this.groups_and_Users__c = groups_and_Users__c;
        this.HCW_Ticket__c = HCW_Ticket__c;
        this.HCW_Ticket__r = HCW_Ticket__r;
        this.hasCommentsUnreadByOwner = hasCommentsUnreadByOwner;
        this.hasSelfServiceComments = hasSelfServiceComments;
        this.has_Custom_Solution__c = has_Custom_Solution__c;
        this.has_Custom_Solution_old__c = has_Custom_Solution_old__c;
        this.has_Non_Licensing_DLLs__c = has_Non_Licensing_DLLs__c;
        this.help_Group__c = help_Group__c;
        this.histories = histories;
        this.hour_Entered_Pause_State__c = hour_Entered_Pause_State__c;
        this.hour_in_Customer_Action__c = hour_in_Customer_Action__c;
        this.hours__c = hours__c;
        this.impact__c = impact__c;
        this.impeded__c = impeded__c;
        this.inbound_Tracking_Number__c = inbound_Tracking_Number__c;
        this.initial_Client_Contact__c = initial_Client_Contact__c;
        this.initial_Estimate__c = initial_Estimate__c;
        this.instance__c = instance__c;
        this.instance__r = instance__r;
        this.isClosed = isClosed;
        this.isDeleted = isDeleted;
        this.isEscalated = isEscalated;
        this.isVisibleInSelfService = isVisibleInSelfService;
        this.is_Admin_Contact__c = is_Admin_Contact__c;
        this.issue_Description__c = issue_Description__c;
        this.items_Delivered__c = items_Delivered__c;
        this.KCD_Solution_Recipient__c = KCD_Solution_Recipient__c;
        this.KCD_Solution_Recipients__r = KCD_Solution_Recipients__r;
        this.known_Defect__c = known_Defect__c;
        this.lab__c = lab__c;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.last_Status_Change__c = last_Status_Change__c;
        this.location__c = location__c;
        this.location_of_Document__c = location_of_Document__c;
        this.long_Term_Actual_Date__c = long_Term_Actual_Date__c;
        this.long_Term_Corrective_Action__c = long_Term_Corrective_Action__c;
        this.long_Term_Scheduled_Date__c = long_Term_Scheduled_Date__c;
        this.MDF_Size_GB__c = MDF_Size_GB__c;
        this.make__c = make__c;
        this.marketing_Surveys__r = marketing_Surveys__r;
        this.medium__c = medium__c;
        this.microsoft_Case_Owner_Email__c = microsoft_Case_Owner_Email__c;
        this.microsoft_Case_Owner_Tel__c = microsoft_Case_Owner_Tel__c;
        this.microsoft_Case_Owner__c = microsoft_Case_Owner__c;
        this.microsoft_Case__c = microsoft_Case__c;
        this.microsoft_Severity_Level__c = microsoft_Severity_Level__c;
        this.microsoft_Telephone_Number__c = microsoft_Telephone_Number__c;
        this.migration_End_Date__c = migration_End_Date__c;
        this.migration_Initial_File_Copy_Start_Date__c = migration_Initial_File_Copy_Start_Date__c;
        this.migration_Number_of_Files_Copied__c = migration_Number_of_Files_Copied__c;
        this.migration_Size_GB__c = migration_Size_GB__c;
        this.missed_SLA_Deadline_Ticket_Owner__c = missed_SLA_Deadline_Ticket_Owner__c;
        this.model_Product_Number__c = model_Product_Number__c;
        this.name__c = name__c;
        this.name_of_Document__c = name_of_Document__c;
        this.needs_Immediate_Attention__c = needs_Immediate_Attention__c;
        this.new_Case_Name__c = new_Case_Name__c;
        this.new_Comment__c = new_Comment__c;
        this.no_Show__c = no_Show__c;
        this.notes__c = notes__c;
        this.number_of_Event_Handlers__c = number_of_Event_Handlers__c;
        this.number_of_Relativity_Analytics_Indexes__c = number_of_Relativity_Analytics_Indexes__c;
        this.number_of_dtSearch_Indexes__c = number_of_dtSearch_Indexes__c;
        this.openActivities = openActivities;
        this.opened_Day_of_the_Week__c = opened_Day_of_the_Week__c;
        this.opportunity__c = opportunity__c;
        this.opportunity__r = opportunity__r;
        this.oracle_Bug_Number__c = oracle_Bug_Number__c;
        this.oracle_Status__c = oracle_Status__c;
        this.oracle_Ticket_Created_On__c = oracle_Ticket_Created_On__c;
        this.origin = origin;
        this.original_Ticket__c = original_Ticket__c;
        this.other__c = other__c;
        this.outbound_Tracking_Number__c = outbound_Tracking_Number__c;
        this.overnight_SLA__c = overnight_SLA__c;
        this.override_Account_Validation__c = override_Account_Validation__c;
        this.owner = owner;
        this.ownerId = ownerId;
        this.owner_Profile__c = owner_Profile__c;
        this.owner_Role__c = owner_Role__c;
        this.PS_Defect_Class__c = PS_Defect_Class__c;
        this.PS_QC_Comments__c = PS_QC_Comments__c;
        this.PS_QC_Status__c = PS_QC_Status__c;
        this.parent = parent;
        this.parentId = parentId;
        this.partner_Kickoffs__r = partner_Kickoffs__r;
        this.patch_Number__c = patch_Number__c;
        this.person_Returned_To__c = person_Returned_To__c;
        this.person_Returned_To__r = person_Returned_To__r;
        this.person_Who_Shipped__c = person_Who_Shipped__c;
        this.person_Who_Shipped__r = person_Who_Shipped__r;
        this.planned_File_Location__c = planned_File_Location__c;
        this.pod_Account__c = pod_Account__c;
        this.pod_User__c = pod_User__c;
        this.pod__c = pod__c;
        this.price_Per_User_2__c = price_Per_User_2__c;
        this.price_per_gb__c = price_per_gb__c;
        this.pricing_Schedule__c = pricing_Schedule__c;
        this.priority = priority;
        this.problem_Management_Flag__c = problem_Management_Flag__c;
        this.problem_Mgmt_Ticket__c = problem_Mgmt_Ticket__c;
        this.problem_Mgmt_Ticket__r = problem_Mgmt_Ticket__r;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.product_Application__c = product_Application__c;
        this.product__c = product__c;
        this.project_Phase__c = project_Phase__c;
        this.proposal_Approved__c = proposal_Approved__c;
        this.QC_Comments__c = QC_Comments__c;
        this.QC_Date__c = QC_Date__c;
        this.QC_Person__c = QC_Person__c;
        this.QC_Person__r = QC_Person__r;
        this.QC_Status__c = QC_Status__c;
        this.question = question;
        this.questionId = questionId;
        this.quick_Guide__c = quick_Guide__c;
        this.RCA_Certified_Date__c = RCA_Certified_Date__c;
        this.random_Sample__c = random_Sample__c;
        this.re_Work_From_Prior_Ticket__c = re_Work_From_Prior_Ticket__c;
        this.reason_for_No_Survey__c = reason_for_No_Survey__c;
        this.recommended_Upgrade__c = recommended_Upgrade__c;
        this.recordType = recordType;
        this.recordTypeId = recordTypeId;
        this.relAn_Date_Verified__c = relAn_Date_Verified__c;
        this.relAn_Drive_Name__c = relAn_Drive_Name__c;
        this.relativity_Case__c = relativity_Case__c;
        this.relativity_Case__r = relativity_Case__r;
        this.relativity_Version_Fixed__c = relativity_Version_Fixed__c;
        this.relativity_Version_Fixed__r = relativity_Version_Fixed__r;
        this.relativity_Version__c = relativity_Version__c;
        this.release_Verified__c = release_Verified__c;
        this.release__c = release__c;
        this.release__r = release__r;
        this.report_Details__c = report_Details__c;
        this.request_Type__c = request_Type__c;
        this.requested_Due_Date__c = requested_Due_Date__c;
        this.research__c = research__c;
        this.retail_Box_Incuded__c = retail_Box_Incuded__c;
        this.return_with_Origninal_Shipping_Container__c = return_with_Origninal_Shipping_Container__c;
        this.review_for_KCD_By__c = review_for_KCD_By__c;
        this.review_for_KCD_Ticket__c = review_for_KCD_Ticket__c;
        this.root_Cause_Description__c = root_Cause_Description__c;
        this.root_Cause_Sub__c = root_Cause_Sub__c;
        this.root_Cause__c = root_Cause__c;
        this.SFDC_Projects__r = SFDC_Projects__r;
        this.SLA_Exceeded__c = SLA_Exceeded__c;
        this.SLA_Missed_By__c = SLA_Missed_By__c;
        this.SLA_Response_Deadline__c = SLA_Response_Deadline__c;
        this.SLA_Response_Time__c = SLA_Response_Time__c;
        this.SR_Number__c = SR_Number__c;
        this.sales_Queue_Ownership__c = sales_Queue_Ownership__c;
        this.sales_Queue__c = sales_Queue__c;
        this.sales_Type_Sub__c = sales_Type_Sub__c;
        this.sales_Type__c = sales_Type__c;
        this.scheduled__c = scheduled__c;
        this.school_Program__c = school_Program__c;
        this.send_Email_Survey__c = send_Email_Survey__c;
        this.serial_Number__c = serial_Number__c;
        this.server_Application__c = server_Application__c;
        this.server_OS__c = server_OS__c;
        this.shares = shares;
        this.shipped_Date__c = shipped_Date__c;
        this.short_Term_Actual_Date__c = short_Term_Actual_Date__c;
        this.short_Term_Corrective_Action__c = short_Term_Corrective_Action__c;
        this.short_Term_Scheduled_Date__c = short_Term_Scheduled_Date__c;
        this.signature__c = signature__c;
        this.simple_Template__c = simple_Template__c;
        this.solutions = solutions;
        this.special_Instructions__c = special_Instructions__c;
        this.specifics__c = specifics__c;
        this.status = status;
        this.status_Call_End_Date__c = status_Call_End_Date__c;
        this.status_Call_Start_Date__c = status_Call_Start_Date__c;
        this.status_Description__c = status_Description__c;
        this.status_Last_Modified_del__c = status_Last_Modified_del__c;
        this.status_Meeting_Conference_Info__c = status_Meeting_Conference_Info__c;
        this.status_Meeting_Notes__c = status_Meeting_Notes__c;
        this.status_Meeting__c = status_Meeting__c;
        this.status_Meeting__r = status_Meeting__r;
        this.study_Material__c = study_Material__c;
        this.subject = subject;
        this.suppliedEmail = suppliedEmail;
        this.suppliedName = suppliedName;
        this.support_Hours__c = support_Hours__c;
        this.support_Sample_Number__c = support_Sample_Number__c;
        this.support__c = support__c;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
        this.teamMembers = teamMembers;
        this.teamTemplateRecords = teamTemplateRecords;
        this.technical_Resource__c = technical_Resource__c;
        this.test_Case_to_Reproduce__c = test_Case_to_Reproduce__c;
        this.ticketReleaseAssociations__r = ticketReleaseAssociations__r;
        this.ticket_ReOpened__c = ticket_ReOpened__c;
        this.tier_1_User__c = tier_1_User__c;
        this.tier_1_User__r = tier_1_User__r;
        this.tier_2_User__c = tier_2_User__c;
        this.tier_2_User__r = tier_2_User__r;
        this.tier_Assignment_Flag__c = tier_Assignment_Flag__c;
        this.tier_Assignment__c = tier_Assignment__c;
        this.time_Difference_Final__c = time_Difference_Final__c;
        this.time_Spent_on_Ticket__c = time_Spent_on_Ticket__c;
        this.time_Tracking_Type__c = time_Tracking_Type__c;
        this.time_With_Customer__c = time_With_Customer__c;
        this.time_With_Support__c = time_With_Support__c;
        this.time_in_Queue__c = time_in_Queue__c;
        this.time_on_Case_del__c = time_on_Case_del__c;
        this.total_Billable_Time__c = total_Billable_Time__c;
        this.total_Data_Size_in_GB__c = total_Data_Size_in_GB__c;
        this.total_Escalated_Tickets__c = total_Escalated_Tickets__c;
        this.total_Escalated_for_Bug_Review__c = total_Escalated_for_Bug_Review__c;
        this.total_Escalated_to_Dev__c = total_Escalated_to_Dev__c;
        this.total_Evaluated_for_Business_Impact__c = total_Evaluated_for_Business_Impact__c;
        this.total_Number_of_Deliverables__c = total_Number_of_Deliverables__c;
        this.total_Time__c = total_Time__c;
        this.trainer_Outline__c = trainer_Outline__c;
        this.training_Category__c = training_Category__c;
        this.training_PPT__c = training_PPT__c;
        this.training_Workbook__c = training_Workbook__c;
        this.transaction__c = transaction__c;
        this.transaction__r = transaction__r;
        this.tutorial__c = tutorial__c;
        this.type = type;
        this.type_Sub__c = type_Sub__c;
        this.type_of_Document__c = type_of_Document__c;
        this.update_Interval_Start_Date__c = update_Interval_Start_Date__c;
        this.update_Interval__c = update_Interval__c;
        this.urgency__c = urgency__c;
        this.user__c = user__c;
        this.user__r = user__r;
        this.validated_In_Version__c = validated_In_Version__c;
        this.vendor__c = vendor__c;
        this.verify_Release__c = verify_Release__c;
        this.version_Origin__c = version_Origin__c;
        this.version__c = version__c;
        this.video__c = video__c;
        this.viewer_Version_Fixed__c = viewer_Version_Fixed__c;
        this.webinar_Recording__c = webinar_Recording__c;
        this.webinar__c = webinar__c;
        this.what__c = what__c;
        this.where_is_drive__c = where_is_drive__c;
        this.where_is_drive__r = where_is_drive__r;
        this.workaround_Actual_Date__c = workaround_Actual_Date__c;
        this.workaround_Scheduled_Date__c = workaround_Scheduled_Date__c;
        this.workaround__c = workaround__c;
        this.x24_Hour_Follow_up_Deadline_Missed__c = x24_Hour_Follow_up_Deadline_Missed__c;
        this.x90_Day_Deployment_Checkup_Date__c = x90_Day_Deployment_Checkup_Date__c;
        this.YTD_Total_Days__c = YTD_Total_Days__c;
        this.dtSearch_Date_Verified__c = dtSearch_Date_Verified__c;
        this.dtSearch_Drive_Name__c = dtSearch_Drive_Name__c;
        this.kCura_Email_Addresses__c = kCura_Email_Addresses__c;
        this.kIE_Age__c = kIE_Age__c;
        this.kIE_Resource__c = kIE_Resource__c;
        this.kIE_Resource__r = kIE_Resource__r;
        this.kIE_Status__c = kIE_Status__c;
        this.time_in_new__c = time_in_new__c;
        this.xEvaluate_for_Business_Impact__c = xEvaluate_for_Business_Impact__c;
    }


    /**
     * Gets the AM_PM__c value for this _case.
     * 
     * @return AM_PM__c
     */
    public java.lang.String getAM_PM__c() {
        return AM_PM__c;
    }


    /**
     * Sets the AM_PM__c value for this _case.
     * 
     * @param AM_PM__c
     */
    public void setAM_PM__c(java.lang.String AM_PM__c) {
        this.AM_PM__c = AM_PM__c;
    }


    /**
     * Gets the account value for this _case.
     * 
     * @return account
     */
    public com.sforce.soap.enterprise.sobject.Account getAccount() {
        return account;
    }


    /**
     * Sets the account value for this _case.
     * 
     * @param account
     */
    public void setAccount(com.sforce.soap.enterprise.sobject.Account account) {
        this.account = account;
    }


    /**
     * Gets the accountId value for this _case.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this _case.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the account_Alert__c value for this _case.
     * 
     * @return account_Alert__c
     */
    public java.lang.String getAccount_Alert__c() {
        return account_Alert__c;
    }


    /**
     * Sets the account_Alert__c value for this _case.
     * 
     * @param account_Alert__c
     */
    public void setAccount_Alert__c(java.lang.String account_Alert__c) {
        this.account_Alert__c = account_Alert__c;
    }


    /**
     * Gets the activityHistories value for this _case.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this _case.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the actual_Billable_Time__c value for this _case.
     * 
     * @return actual_Billable_Time__c
     */
    public java.lang.Double getActual_Billable_Time__c() {
        return actual_Billable_Time__c;
    }


    /**
     * Sets the actual_Billable_Time__c value for this _case.
     * 
     * @param actual_Billable_Time__c
     */
    public void setActual_Billable_Time__c(java.lang.Double actual_Billable_Time__c) {
        this.actual_Billable_Time__c = actual_Billable_Time__c;
    }


    /**
     * Gets the add_to_Official_Doc_Set__c value for this _case.
     * 
     * @return add_to_Official_Doc_Set__c
     */
    public java.lang.String getAdd_to_Official_Doc_Set__c() {
        return add_to_Official_Doc_Set__c;
    }


    /**
     * Sets the add_to_Official_Doc_Set__c value for this _case.
     * 
     * @param add_to_Official_Doc_Set__c
     */
    public void setAdd_to_Official_Doc_Set__c(java.lang.String add_to_Official_Doc_Set__c) {
        this.add_to_Official_Doc_Set__c = add_to_Official_Doc_Set__c;
    }


    /**
     * Gets the added_to_Backlog_Date__c value for this _case.
     * 
     * @return added_to_Backlog_Date__c
     */
    public java.util.Calendar getAdded_to_Backlog_Date__c() {
        return added_to_Backlog_Date__c;
    }


    /**
     * Sets the added_to_Backlog_Date__c value for this _case.
     * 
     * @param added_to_Backlog_Date__c
     */
    public void setAdded_to_Backlog_Date__c(java.util.Calendar added_to_Backlog_Date__c) {
        this.added_to_Backlog_Date__c = added_to_Backlog_Date__c;
    }


    /**
     * Gets the admin_Contact__c value for this _case.
     * 
     * @return admin_Contact__c
     */
    public java.lang.String getAdmin_Contact__c() {
        return admin_Contact__c;
    }


    /**
     * Sets the admin_Contact__c value for this _case.
     * 
     * @param admin_Contact__c
     */
    public void setAdmin_Contact__c(java.lang.String admin_Contact__c) {
        this.admin_Contact__c = admin_Contact__c;
    }


    /**
     * Gets the applications_Installed__c value for this _case.
     * 
     * @return applications_Installed__c
     */
    public java.lang.String getApplications_Installed__c() {
        return applications_Installed__c;
    }


    /**
     * Sets the applications_Installed__c value for this _case.
     * 
     * @param applications_Installed__c
     */
    public void setApplications_Installed__c(java.lang.String applications_Installed__c) {
        this.applications_Installed__c = applications_Installed__c;
    }


    /**
     * Gets the approved__c value for this _case.
     * 
     * @return approved__c
     */
    public java.lang.Boolean getApproved__c() {
        return approved__c;
    }


    /**
     * Sets the approved__c value for this _case.
     * 
     * @param approved__c
     */
    public void setApproved__c(java.lang.Boolean approved__c) {
        this.approved__c = approved__c;
    }


    /**
     * Gets the approximate_Time_Spent__c value for this _case.
     * 
     * @return approximate_Time_Spent__c
     */
    public java.lang.Double getApproximate_Time_Spent__c() {
        return approximate_Time_Spent__c;
    }


    /**
     * Sets the approximate_Time_Spent__c value for this _case.
     * 
     * @param approximate_Time_Spent__c
     */
    public void setApproximate_Time_Spent__c(java.lang.Double approximate_Time_Spent__c) {
        this.approximate_Time_Spent__c = approximate_Time_Spent__c;
    }


    /**
     * Gets the area__c value for this _case.
     * 
     * @return area__c
     */
    public java.lang.String getArea__c() {
        return area__c;
    }


    /**
     * Sets the area__c value for this _case.
     * 
     * @param area__c
     */
    public void setArea__c(java.lang.String area__c) {
        this.area__c = area__c;
    }


    /**
     * Gets the associated_Ticket_s__c value for this _case.
     * 
     * @return associated_Ticket_s__c
     */
    public java.lang.String getAssociated_Ticket_s__c() {
        return associated_Ticket_s__c;
    }


    /**
     * Sets the associated_Ticket_s__c value for this _case.
     * 
     * @param associated_Ticket_s__c
     */
    public void setAssociated_Ticket_s__c(java.lang.String associated_Ticket_s__c) {
        this.associated_Ticket_s__c = associated_Ticket_s__c;
    }


    /**
     * Gets the associated_Tickets__r value for this _case.
     * 
     * @return associated_Tickets__r
     */
    public com.sforce.soap.enterprise.QueryResult getAssociated_Tickets__r() {
        return associated_Tickets__r;
    }


    /**
     * Sets the associated_Tickets__r value for this _case.
     * 
     * @param associated_Tickets__r
     */
    public void setAssociated_Tickets__r(com.sforce.soap.enterprise.QueryResult associated_Tickets__r) {
        this.associated_Tickets__r = associated_Tickets__r;
    }


    /**
     * Gets the attachments value for this _case.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this _case.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the avoidance_Comments__c value for this _case.
     * 
     * @return avoidance_Comments__c
     */
    public java.lang.String getAvoidance_Comments__c() {
        return avoidance_Comments__c;
    }


    /**
     * Sets the avoidance_Comments__c value for this _case.
     * 
     * @param avoidance_Comments__c
     */
    public void setAvoidance_Comments__c(java.lang.String avoidance_Comments__c) {
        this.avoidance_Comments__c = avoidance_Comments__c;
    }


    /**
     * Gets the avoidance__c value for this _case.
     * 
     * @return avoidance__c
     */
    public java.lang.String getAvoidance__c() {
        return avoidance__c;
    }


    /**
     * Sets the avoidance__c value for this _case.
     * 
     * @param avoidance__c
     */
    public void setAvoidance__c(java.lang.String avoidance__c) {
        this.avoidance__c = avoidance__c;
    }


    /**
     * Gets the BA_Tested__c value for this _case.
     * 
     * @return BA_Tested__c
     */
    public java.lang.Boolean getBA_Tested__c() {
        return BA_Tested__c;
    }


    /**
     * Sets the BA_Tested__c value for this _case.
     * 
     * @param BA_Tested__c
     */
    public void setBA_Tested__c(java.lang.Boolean BA_Tested__c) {
        this.BA_Tested__c = BA_Tested__c;
    }


    /**
     * Gets the BA_Ticket_Owner__c value for this _case.
     * 
     * @return BA_Ticket_Owner__c
     */
    public java.lang.String getBA_Ticket_Owner__c() {
        return BA_Ticket_Owner__c;
    }


    /**
     * Sets the BA_Ticket_Owner__c value for this _case.
     * 
     * @param BA_Ticket_Owner__c
     */
    public void setBA_Ticket_Owner__c(java.lang.String BA_Ticket_Owner__c) {
        this.BA_Ticket_Owner__c = BA_Ticket_Owner__c;
    }


    /**
     * Gets the BA_Ticket_Owner__r value for this _case.
     * 
     * @return BA_Ticket_Owner__r
     */
    public com.sforce.soap.enterprise.sobject.User getBA_Ticket_Owner__r() {
        return BA_Ticket_Owner__r;
    }


    /**
     * Sets the BA_Ticket_Owner__r value for this _case.
     * 
     * @param BA_Ticket_Owner__r
     */
    public void setBA_Ticket_Owner__r(com.sforce.soap.enterprise.sobject.User BA_Ticket_Owner__r) {
        this.BA_Ticket_Owner__r = BA_Ticket_Owner__r;
    }


    /**
     * Gets the best_Time_to_Contact__c value for this _case.
     * 
     * @return best_Time_to_Contact__c
     */
    public java.lang.String getBest_Time_to_Contact__c() {
        return best_Time_to_Contact__c;
    }


    /**
     * Sets the best_Time_to_Contact__c value for this _case.
     * 
     * @param best_Time_to_Contact__c
     */
    public void setBest_Time_to_Contact__c(java.lang.String best_Time_to_Contact__c) {
        this.best_Time_to_Contact__c = best_Time_to_Contact__c;
    }


    /**
     * Gets the best_Way_to_Contact__c value for this _case.
     * 
     * @return best_Way_to_Contact__c
     */
    public java.lang.String getBest_Way_to_Contact__c() {
        return best_Way_to_Contact__c;
    }


    /**
     * Sets the best_Way_to_Contact__c value for this _case.
     * 
     * @param best_Way_to_Contact__c
     */
    public void setBest_Way_to_Contact__c(java.lang.String best_Way_to_Contact__c) {
        this.best_Way_to_Contact__c = best_Way_to_Contact__c;
    }


    /**
     * Gets the billable__c value for this _case.
     * 
     * @return billable__c
     */
    public java.lang.String getBillable__c() {
        return billable__c;
    }


    /**
     * Sets the billable__c value for this _case.
     * 
     * @param billable__c
     */
    public void setBillable__c(java.lang.String billable__c) {
        this.billable__c = billable__c;
    }


    /**
     * Gets the bug_Patch_Resolution_Notes__c value for this _case.
     * 
     * @return bug_Patch_Resolution_Notes__c
     */
    public java.lang.String getBug_Patch_Resolution_Notes__c() {
        return bug_Patch_Resolution_Notes__c;
    }


    /**
     * Sets the bug_Patch_Resolution_Notes__c value for this _case.
     * 
     * @param bug_Patch_Resolution_Notes__c
     */
    public void setBug_Patch_Resolution_Notes__c(java.lang.String bug_Patch_Resolution_Notes__c) {
        this.bug_Patch_Resolution_Notes__c = bug_Patch_Resolution_Notes__c;
    }


    /**
     * Gets the businessHours value for this _case.
     * 
     * @return businessHours
     */
    public com.sforce.soap.enterprise.sobject.BusinessHours getBusinessHours() {
        return businessHours;
    }


    /**
     * Sets the businessHours value for this _case.
     * 
     * @param businessHours
     */
    public void setBusinessHours(com.sforce.soap.enterprise.sobject.BusinessHours businessHours) {
        this.businessHours = businessHours;
    }


    /**
     * Gets the businessHoursId value for this _case.
     * 
     * @return businessHoursId
     */
    public java.lang.String getBusinessHoursId() {
        return businessHoursId;
    }


    /**
     * Sets the businessHoursId value for this _case.
     * 
     * @param businessHoursId
     */
    public void setBusinessHoursId(java.lang.String businessHoursId) {
        this.businessHoursId = businessHoursId;
    }


    /**
     * Gets the CS_Management_User__c value for this _case.
     * 
     * @return CS_Management_User__c
     */
    public java.lang.String getCS_Management_User__c() {
        return CS_Management_User__c;
    }


    /**
     * Sets the CS_Management_User__c value for this _case.
     * 
     * @param CS_Management_User__c
     */
    public void setCS_Management_User__c(java.lang.String CS_Management_User__c) {
        this.CS_Management_User__c = CS_Management_User__c;
    }


    /**
     * Gets the CS_Management_User__r value for this _case.
     * 
     * @return CS_Management_User__r
     */
    public com.sforce.soap.enterprise.sobject.User getCS_Management_User__r() {
        return CS_Management_User__r;
    }


    /**
     * Sets the CS_Management_User__r value for this _case.
     * 
     * @param CS_Management_User__r
     */
    public void setCS_Management_User__r(com.sforce.soap.enterprise.sobject.User CS_Management_User__r) {
        this.CS_Management_User__r = CS_Management_User__r;
    }


    /**
     * Gets the caseArticles value for this _case.
     * 
     * @return caseArticles
     */
    public com.sforce.soap.enterprise.QueryResult getCaseArticles() {
        return caseArticles;
    }


    /**
     * Sets the caseArticles value for this _case.
     * 
     * @param caseArticles
     */
    public void setCaseArticles(com.sforce.soap.enterprise.QueryResult caseArticles) {
        this.caseArticles = caseArticles;
    }


    /**
     * Gets the caseComments value for this _case.
     * 
     * @return caseComments
     */
    public com.sforce.soap.enterprise.QueryResult getCaseComments() {
        return caseComments;
    }


    /**
     * Sets the caseComments value for this _case.
     * 
     * @param caseComments
     */
    public void setCaseComments(com.sforce.soap.enterprise.QueryResult caseComments) {
        this.caseComments = caseComments;
    }


    /**
     * Gets the caseContactRoles value for this _case.
     * 
     * @return caseContactRoles
     */
    public com.sforce.soap.enterprise.QueryResult getCaseContactRoles() {
        return caseContactRoles;
    }


    /**
     * Sets the caseContactRoles value for this _case.
     * 
     * @param caseContactRoles
     */
    public void setCaseContactRoles(com.sforce.soap.enterprise.QueryResult caseContactRoles) {
        this.caseContactRoles = caseContactRoles;
    }


    /**
     * Gets the caseNumber value for this _case.
     * 
     * @return caseNumber
     */
    public java.lang.String getCaseNumber() {
        return caseNumber;
    }


    /**
     * Sets the caseNumber value for this _case.
     * 
     * @param caseNumber
     */
    public void setCaseNumber(java.lang.String caseNumber) {
        this.caseNumber = caseNumber;
    }


    /**
     * Gets the caseSolutions value for this _case.
     * 
     * @return caseSolutions
     */
    public com.sforce.soap.enterprise.QueryResult getCaseSolutions() {
        return caseSolutions;
    }


    /**
     * Sets the caseSolutions value for this _case.
     * 
     * @param caseSolutions
     */
    public void setCaseSolutions(com.sforce.soap.enterprise.QueryResult caseSolutions) {
        this.caseSolutions = caseSolutions;
    }


    /**
     * Gets the case_Admin_2__c value for this _case.
     * 
     * @return case_Admin_2__c
     */
    public java.lang.String getCase_Admin_2__c() {
        return case_Admin_2__c;
    }


    /**
     * Sets the case_Admin_2__c value for this _case.
     * 
     * @param case_Admin_2__c
     */
    public void setCase_Admin_2__c(java.lang.String case_Admin_2__c) {
        this.case_Admin_2__c = case_Admin_2__c;
    }


    /**
     * Gets the case_Admin_2__r value for this _case.
     * 
     * @return case_Admin_2__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getCase_Admin_2__r() {
        return case_Admin_2__r;
    }


    /**
     * Sets the case_Admin_2__r value for this _case.
     * 
     * @param case_Admin_2__r
     */
    public void setCase_Admin_2__r(com.sforce.soap.enterprise.sobject.Contact case_Admin_2__r) {
        this.case_Admin_2__r = case_Admin_2__r;
    }


    /**
     * Gets the case_Admin_3__c value for this _case.
     * 
     * @return case_Admin_3__c
     */
    public java.lang.String getCase_Admin_3__c() {
        return case_Admin_3__c;
    }


    /**
     * Sets the case_Admin_3__c value for this _case.
     * 
     * @param case_Admin_3__c
     */
    public void setCase_Admin_3__c(java.lang.String case_Admin_3__c) {
        this.case_Admin_3__c = case_Admin_3__c;
    }


    /**
     * Gets the case_Admin_3__r value for this _case.
     * 
     * @return case_Admin_3__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getCase_Admin_3__r() {
        return case_Admin_3__r;
    }


    /**
     * Sets the case_Admin_3__r value for this _case.
     * 
     * @param case_Admin_3__r
     */
    public void setCase_Admin_3__r(com.sforce.soap.enterprise.sobject.Contact case_Admin_3__r) {
        this.case_Admin_3__r = case_Admin_3__r;
    }


    /**
     * Gets the case_Admin_4__c value for this _case.
     * 
     * @return case_Admin_4__c
     */
    public java.lang.String getCase_Admin_4__c() {
        return case_Admin_4__c;
    }


    /**
     * Sets the case_Admin_4__c value for this _case.
     * 
     * @param case_Admin_4__c
     */
    public void setCase_Admin_4__c(java.lang.String case_Admin_4__c) {
        this.case_Admin_4__c = case_Admin_4__c;
    }


    /**
     * Gets the case_Admin_4__r value for this _case.
     * 
     * @return case_Admin_4__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getCase_Admin_4__r() {
        return case_Admin_4__r;
    }


    /**
     * Sets the case_Admin_4__r value for this _case.
     * 
     * @param case_Admin_4__r
     */
    public void setCase_Admin_4__r(com.sforce.soap.enterprise.sobject.Contact case_Admin_4__r) {
        this.case_Admin_4__r = case_Admin_4__r;
    }


    /**
     * Gets the case_Age_In_Business_Hours__c value for this _case.
     * 
     * @return case_Age_In_Business_Hours__c
     */
    public java.lang.Double getCase_Age_In_Business_Hours__c() {
        return case_Age_In_Business_Hours__c;
    }


    /**
     * Sets the case_Age_In_Business_Hours__c value for this _case.
     * 
     * @param case_Age_In_Business_Hours__c
     */
    public void setCase_Age_In_Business_Hours__c(java.lang.Double case_Age_In_Business_Hours__c) {
        this.case_Age_In_Business_Hours__c = case_Age_In_Business_Hours__c;
    }


    /**
     * Gets the case_Age_Update__c value for this _case.
     * 
     * @return case_Age_Update__c
     */
    public java.lang.Boolean getCase_Age_Update__c() {
        return case_Age_Update__c;
    }


    /**
     * Sets the case_Age_Update__c value for this _case.
     * 
     * @param case_Age_Update__c
     */
    public void setCase_Age_Update__c(java.lang.Boolean case_Age_Update__c) {
        this.case_Age_Update__c = case_Age_Update__c;
    }


    /**
     * Gets the case_Age__c value for this _case.
     * 
     * @return case_Age__c
     */
    public java.lang.Double getCase_Age__c() {
        return case_Age__c;
    }


    /**
     * Sets the case_Age__c value for this _case.
     * 
     * @param case_Age__c
     */
    public void setCase_Age__c(java.lang.Double case_Age__c) {
        this.case_Age__c = case_Age__c;
    }


    /**
     * Gets the case_Migration_Differential_Copies__r value for this _case.
     * 
     * @return case_Migration_Differential_Copies__r
     */
    public com.sforce.soap.enterprise.QueryResult getCase_Migration_Differential_Copies__r() {
        return case_Migration_Differential_Copies__r;
    }


    /**
     * Sets the case_Migration_Differential_Copies__r value for this _case.
     * 
     * @param case_Migration_Differential_Copies__r
     */
    public void setCase_Migration_Differential_Copies__r(com.sforce.soap.enterprise.QueryResult case_Migration_Differential_Copies__r) {
        this.case_Migration_Differential_Copies__r = case_Migration_Differential_Copies__r;
    }


    /**
     * Gets the case_Status_Client_Active_Import_Export__c value for this _case.
     * 
     * @return case_Status_Client_Active_Import_Export__c
     */
    public java.lang.Boolean getCase_Status_Client_Active_Import_Export__c() {
        return case_Status_Client_Active_Import_Export__c;
    }


    /**
     * Sets the case_Status_Client_Active_Import_Export__c value for this _case.
     * 
     * @param case_Status_Client_Active_Import_Export__c
     */
    public void setCase_Status_Client_Active_Import_Export__c(java.lang.Boolean case_Status_Client_Active_Import_Export__c) {
        this.case_Status_Client_Active_Import_Export__c = case_Status_Client_Active_Import_Export__c;
    }


    /**
     * Gets the case_Status_Client_Active__c value for this _case.
     * 
     * @return case_Status_Client_Active__c
     */
    public java.lang.Boolean getCase_Status_Client_Active__c() {
        return case_Status_Client_Active__c;
    }


    /**
     * Sets the case_Status_Client_Active__c value for this _case.
     * 
     * @param case_Status_Client_Active__c
     */
    public void setCase_Status_Client_Active__c(java.lang.Boolean case_Status_Client_Active__c) {
        this.case_Status_Client_Active__c = case_Status_Client_Active__c;
    }


    /**
     * Gets the case_Template__c value for this _case.
     * 
     * @return case_Template__c
     */
    public java.lang.String getCase_Template__c() {
        return case_Template__c;
    }


    /**
     * Sets the case_Template__c value for this _case.
     * 
     * @param case_Template__c
     */
    public void setCase_Template__c(java.lang.String case_Template__c) {
        this.case_Template__c = case_Template__c;
    }


    /**
     * Gets the case_Template__r value for this _case.
     * 
     * @return case_Template__r
     */
    public com.sforce.soap.enterprise.sobject.Relativity_Case__c getCase_Template__r() {
        return case_Template__r;
    }


    /**
     * Sets the case_Template__r value for this _case.
     * 
     * @param case_Template__r
     */
    public void setCase_Template__r(com.sforce.soap.enterprise.sobject.Relativity_Case__c case_Template__r) {
        this.case_Template__r = case_Template__r;
    }


    /**
     * Gets the case_Time_Billable__c value for this _case.
     * 
     * @return case_Time_Billable__c
     */
    public java.lang.String getCase_Time_Billable__c() {
        return case_Time_Billable__c;
    }


    /**
     * Sets the case_Time_Billable__c value for this _case.
     * 
     * @param case_Time_Billable__c
     */
    public void setCase_Time_Billable__c(java.lang.String case_Time_Billable__c) {
        this.case_Time_Billable__c = case_Time_Billable__c;
    }


    /**
     * Gets the case_Time_Category__c value for this _case.
     * 
     * @return case_Time_Category__c
     */
    public java.lang.String getCase_Time_Category__c() {
        return case_Time_Category__c;
    }


    /**
     * Sets the case_Time_Category__c value for this _case.
     * 
     * @param case_Time_Category__c
     */
    public void setCase_Time_Category__c(java.lang.String case_Time_Category__c) {
        this.case_Time_Category__c = case_Time_Category__c;
    }


    /**
     * Gets the cases value for this _case.
     * 
     * @return cases
     */
    public com.sforce.soap.enterprise.QueryResult getCases() {
        return cases;
    }


    /**
     * Sets the cases value for this _case.
     * 
     * @param cases
     */
    public void setCases(com.sforce.soap.enterprise.QueryResult cases) {
        this.cases = cases;
    }


    /**
     * Gets the cases__r value for this _case.
     * 
     * @return cases__r
     */
    public com.sforce.soap.enterprise.QueryResult getCases__r() {
        return cases__r;
    }


    /**
     * Sets the cases__r value for this _case.
     * 
     * @param cases__r
     */
    public void setCases__r(com.sforce.soap.enterprise.QueryResult cases__r) {
        this.cases__r = cases__r;
    }


    /**
     * Gets the category__c value for this _case.
     * 
     * @return category__c
     */
    public java.lang.String getCategory__c() {
        return category__c;
    }


    /**
     * Sets the category__c value for this _case.
     * 
     * @param category__c
     */
    public void setCategory__c(java.lang.String category__c) {
        this.category__c = category__c;
    }


    /**
     * Gets the category__r value for this _case.
     * 
     * @return category__r
     */
    public com.sforce.soap.enterprise.sobject.Category__c getCategory__r() {
        return category__r;
    }


    /**
     * Sets the category__r value for this _case.
     * 
     * @param category__r
     */
    public void setCategory__r(com.sforce.soap.enterprise.sobject.Category__c category__r) {
        this.category__r = category__r;
    }


    /**
     * Gets the certified_Admin_Static__c value for this _case.
     * 
     * @return certified_Admin_Static__c
     */
    public java.lang.Boolean getCertified_Admin_Static__c() {
        return certified_Admin_Static__c;
    }


    /**
     * Sets the certified_Admin_Static__c value for this _case.
     * 
     * @param certified_Admin_Static__c
     */
    public void setCertified_Admin_Static__c(java.lang.Boolean certified_Admin_Static__c) {
        this.certified_Admin_Static__c = certified_Admin_Static__c;
    }


    /**
     * Gets the certified_Admin__c value for this _case.
     * 
     * @return certified_Admin__c
     */
    public java.lang.String getCertified_Admin__c() {
        return certified_Admin__c;
    }


    /**
     * Sets the certified_Admin__c value for this _case.
     * 
     * @param certified_Admin__c
     */
    public void setCertified_Admin__c(java.lang.String certified_Admin__c) {
        this.certified_Admin__c = certified_Admin__c;
    }


    /**
     * Gets the changeControlTicketAssociation__r value for this _case.
     * 
     * @return changeControlTicketAssociation__r
     */
    public com.sforce.soap.enterprise.QueryResult getChangeControlTicketAssociation__r() {
        return changeControlTicketAssociation__r;
    }


    /**
     * Sets the changeControlTicketAssociation__r value for this _case.
     * 
     * @param changeControlTicketAssociation__r
     */
    public void setChangeControlTicketAssociation__r(com.sforce.soap.enterprise.QueryResult changeControlTicketAssociation__r) {
        this.changeControlTicketAssociation__r = changeControlTicketAssociation__r;
    }


    /**
     * Gets the checklists__r value for this _case.
     * 
     * @return checklists__r
     */
    public com.sforce.soap.enterprise.QueryResult getChecklists__r() {
        return checklists__r;
    }


    /**
     * Sets the checklists__r value for this _case.
     * 
     * @param checklists__r
     */
    public void setChecklists__r(com.sforce.soap.enterprise.QueryResult checklists__r) {
        this.checklists__r = checklists__r;
    }


    /**
     * Gets the client_Contact_Status__c value for this _case.
     * 
     * @return client_Contact_Status__c
     */
    public java.lang.String getClient_Contact_Status__c() {
        return client_Contact_Status__c;
    }


    /**
     * Sets the client_Contact_Status__c value for this _case.
     * 
     * @param client_Contact_Status__c
     */
    public void setClient_Contact_Status__c(java.lang.String client_Contact_Status__c) {
        this.client_Contact_Status__c = client_Contact_Status__c;
    }


    /**
     * Gets the client_Contacted__c value for this _case.
     * 
     * @return client_Contacted__c
     */
    public java.util.Calendar getClient_Contacted__c() {
        return client_Contacted__c;
    }


    /**
     * Sets the client_Contacted__c value for this _case.
     * 
     * @param client_Contacted__c
     */
    public void setClient_Contacted__c(java.util.Calendar client_Contacted__c) {
        this.client_Contacted__c = client_Contacted__c;
    }


    /**
     * Gets the client_Email_Addresses__c value for this _case.
     * 
     * @return client_Email_Addresses__c
     */
    public java.lang.String getClient_Email_Addresses__c() {
        return client_Email_Addresses__c;
    }


    /**
     * Sets the client_Email_Addresses__c value for this _case.
     * 
     * @param client_Email_Addresses__c
     */
    public void setClient_Email_Addresses__c(java.lang.String client_Email_Addresses__c) {
        this.client_Email_Addresses__c = client_Email_Addresses__c;
    }


    /**
     * Gets the client_Inernal_Tracking_Number__c value for this _case.
     * 
     * @return client_Inernal_Tracking_Number__c
     */
    public java.lang.String getClient_Inernal_Tracking_Number__c() {
        return client_Inernal_Tracking_Number__c;
    }


    /**
     * Sets the client_Inernal_Tracking_Number__c value for this _case.
     * 
     * @param client_Inernal_Tracking_Number__c
     */
    public void setClient_Inernal_Tracking_Number__c(java.lang.String client_Inernal_Tracking_Number__c) {
        this.client_Inernal_Tracking_Number__c = client_Inernal_Tracking_Number__c;
    }


    /**
     * Gets the client_Requested_Escalation__c value for this _case.
     * 
     * @return client_Requested_Escalation__c
     */
    public java.lang.Boolean getClient_Requested_Escalation__c() {
        return client_Requested_Escalation__c;
    }


    /**
     * Sets the client_Requested_Escalation__c value for this _case.
     * 
     * @param client_Requested_Escalation__c
     */
    public void setClient_Requested_Escalation__c(java.lang.Boolean client_Requested_Escalation__c) {
        this.client_Requested_Escalation__c = client_Requested_Escalation__c;
    }


    /**
     * Gets the client_Type__c value for this _case.
     * 
     * @return client_Type__c
     */
    public java.lang.String getClient_Type__c() {
        return client_Type__c;
    }


    /**
     * Sets the client_Type__c value for this _case.
     * 
     * @param client_Type__c
     */
    public void setClient_Type__c(java.lang.String client_Type__c) {
        this.client_Type__c = client_Type__c;
    }


    /**
     * Gets the closedDate value for this _case.
     * 
     * @return closedDate
     */
    public java.util.Calendar getClosedDate() {
        return closedDate;
    }


    /**
     * Sets the closedDate value for this _case.
     * 
     * @param closedDate
     */
    public void setClosedDate(java.util.Calendar closedDate) {
        this.closedDate = closedDate;
    }


    /**
     * Gets the closing_Note__c value for this _case.
     * 
     * @return closing_Note__c
     */
    public java.lang.String getClosing_Note__c() {
        return closing_Note__c;
    }


    /**
     * Sets the closing_Note__c value for this _case.
     * 
     * @param closing_Note__c
     */
    public void setClosing_Note__c(java.lang.String closing_Note__c) {
        this.closing_Note__c = closing_Note__c;
    }


    /**
     * Gets the computer_Connected_To__c value for this _case.
     * 
     * @return computer_Connected_To__c
     */
    public java.lang.String getComputer_Connected_To__c() {
        return computer_Connected_To__c;
    }


    /**
     * Sets the computer_Connected_To__c value for this _case.
     * 
     * @param computer_Connected_To__c
     */
    public void setComputer_Connected_To__c(java.lang.String computer_Connected_To__c) {
        this.computer_Connected_To__c = computer_Connected_To__c;
    }


    /**
     * Gets the contact value for this _case.
     * 
     * @return contact
     */
    public com.sforce.soap.enterprise.sobject.Contact getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this _case.
     * 
     * @param contact
     */
    public void setContact(com.sforce.soap.enterprise.sobject.Contact contact) {
        this.contact = contact;
    }


    /**
     * Gets the contactId value for this _case.
     * 
     * @return contactId
     */
    public java.lang.String getContactId() {
        return contactId;
    }


    /**
     * Sets the contactId value for this _case.
     * 
     * @param contactId
     */
    public void setContactId(java.lang.String contactId) {
        this.contactId = contactId;
    }


    /**
     * Gets the contact_1__c value for this _case.
     * 
     * @return contact_1__c
     */
    public java.lang.String getContact_1__c() {
        return contact_1__c;
    }


    /**
     * Sets the contact_1__c value for this _case.
     * 
     * @param contact_1__c
     */
    public void setContact_1__c(java.lang.String contact_1__c) {
        this.contact_1__c = contact_1__c;
    }


    /**
     * Gets the contact_1__r value for this _case.
     * 
     * @return contact_1__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getContact_1__r() {
        return contact_1__r;
    }


    /**
     * Sets the contact_1__r value for this _case.
     * 
     * @param contact_1__r
     */
    public void setContact_1__r(com.sforce.soap.enterprise.sobject.Contact contact_1__r) {
        this.contact_1__r = contact_1__r;
    }


    /**
     * Gets the content_Updates__c value for this _case.
     * 
     * @return content_Updates__c
     */
    public java.lang.Double getContent_Updates__c() {
        return content_Updates__c;
    }


    /**
     * Sets the content_Updates__c value for this _case.
     * 
     * @param content_Updates__c
     */
    public void setContent_Updates__c(java.lang.Double content_Updates__c) {
        this.content_Updates__c = content_Updates__c;
    }


    /**
     * Gets the count_of_Case_Time_Records__c value for this _case.
     * 
     * @return count_of_Case_Time_Records__c
     */
    public java.lang.Double getCount_of_Case_Time_Records__c() {
        return count_of_Case_Time_Records__c;
    }


    /**
     * Sets the count_of_Case_Time_Records__c value for this _case.
     * 
     * @param count_of_Case_Time_Records__c
     */
    public void setCount_of_Case_Time_Records__c(java.lang.Double count_of_Case_Time_Records__c) {
        this.count_of_Case_Time_Records__c = count_of_Case_Time_Records__c;
    }


    /**
     * Gets the createdBy value for this _case.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this _case.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this _case.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this _case.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this _case.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this _case.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the customization_and_Consulting__c value for this _case.
     * 
     * @return customization_and_Consulting__c
     */
    public java.lang.String getCustomization_and_Consulting__c() {
        return customization_and_Consulting__c;
    }


    /**
     * Sets the customization_and_Consulting__c value for this _case.
     * 
     * @param customization_and_Consulting__c
     */
    public void setCustomization_and_Consulting__c(java.lang.String customization_and_Consulting__c) {
        this.customization_and_Consulting__c = customization_and_Consulting__c;
    }


    /**
     * Gets the data_Files__r value for this _case.
     * 
     * @return data_Files__r
     */
    public com.sforce.soap.enterprise.QueryResult getData_Files__r() {
        return data_Files__r;
    }


    /**
     * Sets the data_Files__r value for this _case.
     * 
     * @param data_Files__r
     */
    public void setData_Files__r(com.sforce.soap.enterprise.QueryResult data_Files__r) {
        this.data_Files__r = data_Files__r;
    }


    /**
     * Gets the database_Drive_Name__c value for this _case.
     * 
     * @return database_Drive_Name__c
     */
    public java.lang.String getDatabase_Drive_Name__c() {
        return database_Drive_Name__c;
    }


    /**
     * Sets the database_Drive_Name__c value for this _case.
     * 
     * @param database_Drive_Name__c
     */
    public void setDatabase_Drive_Name__c(java.lang.String database_Drive_Name__c) {
        this.database_Drive_Name__c = database_Drive_Name__c;
    }


    /**
     * Gets the date_Client_Requested_Escalation__c value for this _case.
     * 
     * @return date_Client_Requested_Escalation__c
     */
    public java.util.Calendar getDate_Client_Requested_Escalation__c() {
        return date_Client_Requested_Escalation__c;
    }


    /**
     * Sets the date_Client_Requested_Escalation__c value for this _case.
     * 
     * @param date_Client_Requested_Escalation__c
     */
    public void setDate_Client_Requested_Escalation__c(java.util.Calendar date_Client_Requested_Escalation__c) {
        this.date_Client_Requested_Escalation__c = date_Client_Requested_Escalation__c;
    }


    /**
     * Gets the date_Escalated__c value for this _case.
     * 
     * @return date_Escalated__c
     */
    public java.util.Calendar getDate_Escalated__c() {
        return date_Escalated__c;
    }


    /**
     * Sets the date_Escalated__c value for this _case.
     * 
     * @param date_Escalated__c
     */
    public void setDate_Escalated__c(java.util.Calendar date_Escalated__c) {
        this.date_Escalated__c = date_Escalated__c;
    }


    /**
     * Gets the date_Escalated_for_Oracle_Defect_Review__c value for this _case.
     * 
     * @return date_Escalated_for_Oracle_Defect_Review__c
     */
    public java.util.Calendar getDate_Escalated_for_Oracle_Defect_Review__c() {
        return date_Escalated_for_Oracle_Defect_Review__c;
    }


    /**
     * Sets the date_Escalated_for_Oracle_Defect_Review__c value for this _case.
     * 
     * @param date_Escalated_for_Oracle_Defect_Review__c
     */
    public void setDate_Escalated_for_Oracle_Defect_Review__c(java.util.Calendar date_Escalated_for_Oracle_Defect_Review__c) {
        this.date_Escalated_for_Oracle_Defect_Review__c = date_Escalated_for_Oracle_Defect_Review__c;
    }


    /**
     * Gets the date_Escalated_for_PSI_Review__c value for this _case.
     * 
     * @return date_Escalated_for_PSI_Review__c
     */
    public java.util.Calendar getDate_Escalated_for_PSI_Review__c() {
        return date_Escalated_for_PSI_Review__c;
    }


    /**
     * Sets the date_Escalated_for_PSI_Review__c value for this _case.
     * 
     * @param date_Escalated_for_PSI_Review__c
     */
    public void setDate_Escalated_for_PSI_Review__c(java.util.Calendar date_Escalated_for_PSI_Review__c) {
        this.date_Escalated_for_PSI_Review__c = date_Escalated_for_PSI_Review__c;
    }


    /**
     * Gets the date_Escalated_for_Problem_File_Review__c value for this _case.
     * 
     * @return date_Escalated_for_Problem_File_Review__c
     */
    public java.util.Calendar getDate_Escalated_for_Problem_File_Review__c() {
        return date_Escalated_for_Problem_File_Review__c;
    }


    /**
     * Sets the date_Escalated_for_Problem_File_Review__c value for this _case.
     * 
     * @param date_Escalated_for_Problem_File_Review__c
     */
    public void setDate_Escalated_for_Problem_File_Review__c(java.util.Calendar date_Escalated_for_Problem_File_Review__c) {
        this.date_Escalated_for_Problem_File_Review__c = date_Escalated_for_Problem_File_Review__c;
    }


    /**
     * Gets the date_Escalated_for_Relativity_Bug_Review__c value for this _case.
     * 
     * @return date_Escalated_for_Relativity_Bug_Review__c
     */
    public java.util.Calendar getDate_Escalated_for_Relativity_Bug_Review__c() {
        return date_Escalated_for_Relativity_Bug_Review__c;
    }


    /**
     * Sets the date_Escalated_for_Relativity_Bug_Review__c value for this _case.
     * 
     * @param date_Escalated_for_Relativity_Bug_Review__c
     */
    public void setDate_Escalated_for_Relativity_Bug_Review__c(java.util.Calendar date_Escalated_for_Relativity_Bug_Review__c) {
        this.date_Escalated_for_Relativity_Bug_Review__c = date_Escalated_for_Relativity_Bug_Review__c;
    }


    /**
     * Gets the date_Escalated_for_bug_Review__c value for this _case.
     * 
     * @return date_Escalated_for_bug_Review__c
     */
    public java.util.Calendar getDate_Escalated_for_bug_Review__c() {
        return date_Escalated_for_bug_Review__c;
    }


    /**
     * Sets the date_Escalated_for_bug_Review__c value for this _case.
     * 
     * @param date_Escalated_for_bug_Review__c
     */
    public void setDate_Escalated_for_bug_Review__c(java.util.Calendar date_Escalated_for_bug_Review__c) {
        this.date_Escalated_for_bug_Review__c = date_Escalated_for_bug_Review__c;
    }


    /**
     * Gets the date_Escalated_to_Certification__c value for this _case.
     * 
     * @return date_Escalated_to_Certification__c
     */
    public java.util.Calendar getDate_Escalated_to_Certification__c() {
        return date_Escalated_to_Certification__c;
    }


    /**
     * Sets the date_Escalated_to_Certification__c value for this _case.
     * 
     * @param date_Escalated_to_Certification__c
     */
    public void setDate_Escalated_to_Certification__c(java.util.Calendar date_Escalated_to_Certification__c) {
        this.date_Escalated_to_Certification__c = date_Escalated_to_Certification__c;
    }


    /**
     * Gets the date_Escalated_to_Dev__c value for this _case.
     * 
     * @return date_Escalated_to_Dev__c
     */
    public java.util.Calendar getDate_Escalated_to_Dev__c() {
        return date_Escalated_to_Dev__c;
    }


    /**
     * Sets the date_Escalated_to_Dev__c value for this _case.
     * 
     * @param date_Escalated_to_Dev__c
     */
    public void setDate_Escalated_to_Dev__c(java.util.Calendar date_Escalated_to_Dev__c) {
        this.date_Escalated_to_Dev__c = date_Escalated_to_Dev__c;
    }


    /**
     * Gets the date_Escalated_to_Vendor__c value for this _case.
     * 
     * @return date_Escalated_to_Vendor__c
     */
    public java.util.Calendar getDate_Escalated_to_Vendor__c() {
        return date_Escalated_to_Vendor__c;
    }


    /**
     * Sets the date_Escalated_to_Vendor__c value for this _case.
     * 
     * @param date_Escalated_to_Vendor__c
     */
    public void setDate_Escalated_to_Vendor__c(java.util.Calendar date_Escalated_to_Vendor__c) {
        this.date_Escalated_to_Vendor__c = date_Escalated_to_Vendor__c;
    }


    /**
     * Gets the date_Escalated_to_kIE__c value for this _case.
     * 
     * @return date_Escalated_to_kIE__c
     */
    public java.util.Calendar getDate_Escalated_to_kIE__c() {
        return date_Escalated_to_kIE__c;
    }


    /**
     * Sets the date_Escalated_to_kIE__c value for this _case.
     * 
     * @param date_Escalated_to_kIE__c
     */
    public void setDate_Escalated_to_kIE__c(java.util.Calendar date_Escalated_to_kIE__c) {
        this.date_Escalated_to_kIE__c = date_Escalated_to_kIE__c;
    }


    /**
     * Gets the date_Evaluated_For_Business_Impact__c value for this _case.
     * 
     * @return date_Evaluated_For_Business_Impact__c
     */
    public java.util.Calendar getDate_Evaluated_For_Business_Impact__c() {
        return date_Evaluated_For_Business_Impact__c;
    }


    /**
     * Sets the date_Evaluated_For_Business_Impact__c value for this _case.
     * 
     * @param date_Evaluated_For_Business_Impact__c
     */
    public void setDate_Evaluated_For_Business_Impact__c(java.util.Calendar date_Evaluated_For_Business_Impact__c) {
        this.date_Evaluated_For_Business_Impact__c = date_Evaluated_For_Business_Impact__c;
    }


    /**
     * Gets the date_KIE_Status_Completed__c value for this _case.
     * 
     * @return date_KIE_Status_Completed__c
     */
    public java.util.Calendar getDate_KIE_Status_Completed__c() {
        return date_KIE_Status_Completed__c;
    }


    /**
     * Sets the date_KIE_Status_Completed__c value for this _case.
     * 
     * @param date_KIE_Status_Completed__c
     */
    public void setDate_KIE_Status_Completed__c(java.util.Calendar date_KIE_Status_Completed__c) {
        this.date_KIE_Status_Completed__c = date_KIE_Status_Completed__c;
    }


    /**
     * Gets the date_Microsoft_case_opened__c value for this _case.
     * 
     * @return date_Microsoft_case_opened__c
     */
    public java.util.Date getDate_Microsoft_case_opened__c() {
        return date_Microsoft_case_opened__c;
    }


    /**
     * Sets the date_Microsoft_case_opened__c value for this _case.
     * 
     * @param date_Microsoft_case_opened__c
     */
    public void setDate_Microsoft_case_opened__c(java.util.Date date_Microsoft_case_opened__c) {
        this.date_Microsoft_case_opened__c = date_Microsoft_case_opened__c;
    }


    /**
     * Gets the date_Range__c value for this _case.
     * 
     * @return date_Range__c
     */
    public java.lang.String getDate_Range__c() {
        return date_Range__c;
    }


    /**
     * Sets the date_Range__c value for this _case.
     * 
     * @param date_Range__c
     */
    public void setDate_Range__c(java.lang.String date_Range__c) {
        this.date_Range__c = date_Range__c;
    }


    /**
     * Gets the date_Received__c value for this _case.
     * 
     * @return date_Received__c
     */
    public java.util.Date getDate_Received__c() {
        return date_Received__c;
    }


    /**
     * Sets the date_Received__c value for this _case.
     * 
     * @param date_Received__c
     */
    public void setDate_Received__c(java.util.Date date_Received__c) {
        this.date_Received__c = date_Received__c;
    }


    /**
     * Gets the date_Recommended_Upgrade__c value for this _case.
     * 
     * @return date_Recommended_Upgrade__c
     */
    public java.util.Date getDate_Recommended_Upgrade__c() {
        return date_Recommended_Upgrade__c;
    }


    /**
     * Sets the date_Recommended_Upgrade__c value for this _case.
     * 
     * @param date_Recommended_Upgrade__c
     */
    public void setDate_Recommended_Upgrade__c(java.util.Date date_Recommended_Upgrade__c) {
        this.date_Recommended_Upgrade__c = date_Recommended_Upgrade__c;
    }


    /**
     * Gets the date_Reviewed_for_KCD_Ticket__c value for this _case.
     * 
     * @return date_Reviewed_for_KCD_Ticket__c
     */
    public java.util.Calendar getDate_Reviewed_for_KCD_Ticket__c() {
        return date_Reviewed_for_KCD_Ticket__c;
    }


    /**
     * Sets the date_Reviewed_for_KCD_Ticket__c value for this _case.
     * 
     * @param date_Reviewed_for_KCD_Ticket__c
     */
    public void setDate_Reviewed_for_KCD_Ticket__c(java.util.Calendar date_Reviewed_for_KCD_Ticket__c) {
        this.date_Reviewed_for_KCD_Ticket__c = date_Reviewed_for_KCD_Ticket__c;
    }


    /**
     * Gets the date_Sent_to_Client__c value for this _case.
     * 
     * @return date_Sent_to_Client__c
     */
    public java.util.Date getDate_Sent_to_Client__c() {
        return date_Sent_to_Client__c;
    }


    /**
     * Sets the date_Sent_to_Client__c value for this _case.
     * 
     * @param date_Sent_to_Client__c
     */
    public void setDate_Sent_to_Client__c(java.util.Date date_Sent_to_Client__c) {
        this.date_Sent_to_Client__c = date_Sent_to_Client__c;
    }


    /**
     * Gets the date_Shipped_to_kCura__c value for this _case.
     * 
     * @return date_Shipped_to_kCura__c
     */
    public java.util.Date getDate_Shipped_to_kCura__c() {
        return date_Shipped_to_kCura__c;
    }


    /**
     * Sets the date_Shipped_to_kCura__c value for this _case.
     * 
     * @param date_Shipped_to_kCura__c
     */
    public void setDate_Shipped_to_kCura__c(java.util.Date date_Shipped_to_kCura__c) {
        this.date_Shipped_to_kCura__c = date_Shipped_to_kCura__c;
    }


    /**
     * Gets the date_Time_Outage_Started__c value for this _case.
     * 
     * @return date_Time_Outage_Started__c
     */
    public java.util.Calendar getDate_Time_Outage_Started__c() {
        return date_Time_Outage_Started__c;
    }


    /**
     * Sets the date_Time_Outage_Started__c value for this _case.
     * 
     * @param date_Time_Outage_Started__c
     */
    public void setDate_Time_Outage_Started__c(java.util.Calendar date_Time_Outage_Started__c) {
        this.date_Time_Outage_Started__c = date_Time_Outage_Started__c;
    }


    /**
     * Gets the date_Time_Service_Restored__c value for this _case.
     * 
     * @return date_Time_Service_Restored__c
     */
    public java.util.Calendar getDate_Time_Service_Restored__c() {
        return date_Time_Service_Restored__c;
    }


    /**
     * Sets the date_Time_Service_Restored__c value for this _case.
     * 
     * @param date_Time_Service_Restored__c
     */
    public void setDate_Time_Service_Restored__c(java.util.Calendar date_Time_Service_Restored__c) {
        this.date_Time_Service_Restored__c = date_Time_Service_Restored__c;
    }


    /**
     * Gets the date__c value for this _case.
     * 
     * @return date__c
     */
    public java.util.Date getDate__c() {
        return date__c;
    }


    /**
     * Sets the date__c value for this _case.
     * 
     * @param date__c
     */
    public void setDate__c(java.util.Date date__c) {
        this.date__c = date__c;
    }


    /**
     * Gets the days_of_Month__c value for this _case.
     * 
     * @return days_of_Month__c
     */
    public java.lang.Double getDays_of_Month__c() {
        return days_of_Month__c;
    }


    /**
     * Sets the days_of_Month__c value for this _case.
     * 
     * @param days_of_Month__c
     */
    public void setDays_of_Month__c(java.lang.Double days_of_Month__c) {
        this.days_of_Month__c = days_of_Month__c;
    }


    /**
     * Gets the deadline__c value for this _case.
     * 
     * @return deadline__c
     */
    public java.util.Date getDeadline__c() {
        return deadline__c;
    }


    /**
     * Sets the deadline__c value for this _case.
     * 
     * @param deadline__c
     */
    public void setDeadline__c(java.util.Date deadline__c) {
        this.deadline__c = deadline__c;
    }


    /**
     * Gets the deadline_for_Access_Creation__c value for this _case.
     * 
     * @return deadline_for_Access_Creation__c
     */
    public java.util.Calendar getDeadline_for_Access_Creation__c() {
        return deadline_for_Access_Creation__c;
    }


    /**
     * Sets the deadline_for_Access_Creation__c value for this _case.
     * 
     * @param deadline_for_Access_Creation__c
     */
    public void setDeadline_for_Access_Creation__c(java.util.Calendar deadline_for_Access_Creation__c) {
        this.deadline_for_Access_Creation__c = deadline_for_Access_Creation__c;
    }


    /**
     * Gets the deliver_By__c value for this _case.
     * 
     * @return deliver_By__c
     */
    public java.util.Date getDeliver_By__c() {
        return deliver_By__c;
    }


    /**
     * Sets the deliver_By__c value for this _case.
     * 
     * @param deliver_By__c
     */
    public void setDeliver_By__c(java.util.Date deliver_By__c) {
        this.deliver_By__c = deliver_By__c;
    }


    /**
     * Gets the department_Sub__c value for this _case.
     * 
     * @return department_Sub__c
     */
    public java.lang.String getDepartment_Sub__c() {
        return department_Sub__c;
    }


    /**
     * Sets the department_Sub__c value for this _case.
     * 
     * @param department_Sub__c
     */
    public void setDepartment_Sub__c(java.lang.String department_Sub__c) {
        this.department_Sub__c = department_Sub__c;
    }


    /**
     * Gets the department__c value for this _case.
     * 
     * @return department__c
     */
    public java.lang.String getDepartment__c() {
        return department__c;
    }


    /**
     * Sets the department__c value for this _case.
     * 
     * @param department__c
     */
    public void setDepartment__c(java.lang.String department__c) {
        this.department__c = department__c;
    }


    /**
     * Gets the description value for this _case.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this _case.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the dev_Resource__c value for this _case.
     * 
     * @return dev_Resource__c
     */
    public java.lang.String getDev_Resource__c() {
        return dev_Resource__c;
    }


    /**
     * Sets the dev_Resource__c value for this _case.
     * 
     * @param dev_Resource__c
     */
    public void setDev_Resource__c(java.lang.String dev_Resource__c) {
        this.dev_Resource__c = dev_Resource__c;
    }


    /**
     * Gets the dev_Resource__r value for this _case.
     * 
     * @return dev_Resource__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getDev_Resource__r() {
        return dev_Resource__r;
    }


    /**
     * Sets the dev_Resource__r value for this _case.
     * 
     * @param dev_Resource__r
     */
    public void setDev_Resource__r(com.sforce.soap.enterprise.sobject.Contact dev_Resource__r) {
        this.dev_Resource__r = dev_Resource__r;
    }


    /**
     * Gets the dev_Status__c value for this _case.
     * 
     * @return dev_Status__c
     */
    public java.lang.String getDev_Status__c() {
        return dev_Status__c;
    }


    /**
     * Sets the dev_Status__c value for this _case.
     * 
     * @param dev_Status__c
     */
    public void setDev_Status__c(java.lang.String dev_Status__c) {
        this.dev_Status__c = dev_Status__c;
    }


    /**
     * Gets the dev_on_call_response__c value for this _case.
     * 
     * @return dev_on_call_response__c
     */
    public java.lang.String getDev_on_call_response__c() {
        return dev_on_call_response__c;
    }


    /**
     * Sets the dev_on_call_response__c value for this _case.
     * 
     * @param dev_on_call_response__c
     */
    public void setDev_on_call_response__c(java.lang.String dev_on_call_response__c) {
        this.dev_on_call_response__c = dev_on_call_response__c;
    }


    /**
     * Gets the development_End__c value for this _case.
     * 
     * @return development_End__c
     */
    public java.util.Date getDevelopment_End__c() {
        return development_End__c;
    }


    /**
     * Sets the development_End__c value for this _case.
     * 
     * @param development_End__c
     */
    public void setDevelopment_End__c(java.util.Date development_End__c) {
        this.development_End__c = development_End__c;
    }


    /**
     * Gets the development_Start__c value for this _case.
     * 
     * @return development_Start__c
     */
    public java.util.Date getDevelopment_Start__c() {
        return development_Start__c;
    }


    /**
     * Sets the development_Start__c value for this _case.
     * 
     * @param development_Start__c
     */
    public void setDevelopment_Start__c(java.util.Date development_Start__c) {
        this.development_Start__c = development_Start__c;
    }


    /**
     * Gets the development_User__c value for this _case.
     * 
     * @return development_User__c
     */
    public java.lang.String getDevelopment_User__c() {
        return development_User__c;
    }


    /**
     * Sets the development_User__c value for this _case.
     * 
     * @param development_User__c
     */
    public void setDevelopment_User__c(java.lang.String development_User__c) {
        this.development_User__c = development_User__c;
    }


    /**
     * Gets the development_User__r value for this _case.
     * 
     * @return development_User__r
     */
    public com.sforce.soap.enterprise.sobject.User getDevelopment_User__r() {
        return development_User__r;
    }


    /**
     * Sets the development_User__r value for this _case.
     * 
     * @param development_User__r
     */
    public void setDevelopment_User__r(com.sforce.soap.enterprise.sobject.User development_User__r) {
        this.development_User__r = development_User__r;
    }


    /**
     * Gets the disclosure_and_Electronic_Signature__c value for this _case.
     * 
     * @return disclosure_and_Electronic_Signature__c
     */
    public java.lang.String getDisclosure_and_Electronic_Signature__c() {
        return disclosure_and_Electronic_Signature__c;
    }


    /**
     * Sets the disclosure_and_Electronic_Signature__c value for this _case.
     * 
     * @param disclosure_and_Electronic_Signature__c
     */
    public void setDisclosure_and_Electronic_Signature__c(java.lang.String disclosure_and_Electronic_Signature__c) {
        this.disclosure_and_Electronic_Signature__c = disclosure_and_Electronic_Signature__c;
    }


    /**
     * Gets the do_Not_Send_Priority_Alert_Email__c value for this _case.
     * 
     * @return do_Not_Send_Priority_Alert_Email__c
     */
    public java.lang.Boolean getDo_Not_Send_Priority_Alert_Email__c() {
        return do_Not_Send_Priority_Alert_Email__c;
    }


    /**
     * Sets the do_Not_Send_Priority_Alert_Email__c value for this _case.
     * 
     * @param do_Not_Send_Priority_Alert_Email__c
     */
    public void setDo_Not_Send_Priority_Alert_Email__c(java.lang.Boolean do_Not_Send_Priority_Alert_Email__c) {
        this.do_Not_Send_Priority_Alert_Email__c = do_Not_Send_Priority_Alert_Email__c;
    }


    /**
     * Gets the do_Not_Send_Survey__c value for this _case.
     * 
     * @return do_Not_Send_Survey__c
     */
    public java.lang.Boolean getDo_Not_Send_Survey__c() {
        return do_Not_Send_Survey__c;
    }


    /**
     * Sets the do_Not_Send_Survey__c value for this _case.
     * 
     * @param do_Not_Send_Survey__c
     */
    public void setDo_Not_Send_Survey__c(java.lang.Boolean do_Not_Send_Survey__c) {
        this.do_Not_Send_Survey__c = do_Not_Send_Survey__c;
    }


    /**
     * Gets the document_Format__c value for this _case.
     * 
     * @return document_Format__c
     */
    public java.lang.String getDocument_Format__c() {
        return document_Format__c;
    }


    /**
     * Sets the document_Format__c value for this _case.
     * 
     * @param document_Format__c
     */
    public void setDocument_Format__c(java.lang.String document_Format__c) {
        this.document_Format__c = document_Format__c;
    }


    /**
     * Gets the drive_Location__c value for this _case.
     * 
     * @return drive_Location__c
     */
    public java.lang.String getDrive_Location__c() {
        return drive_Location__c;
    }


    /**
     * Sets the drive_Location__c value for this _case.
     * 
     * @param drive_Location__c
     */
    public void setDrive_Location__c(java.lang.String drive_Location__c) {
        this.drive_Location__c = drive_Location__c;
    }


    /**
     * Gets the drive_Name__c value for this _case.
     * 
     * @return drive_Name__c
     */
    public java.lang.String getDrive_Name__c() {
        return drive_Name__c;
    }


    /**
     * Sets the drive_Name__c value for this _case.
     * 
     * @param drive_Name__c
     */
    public void setDrive_Name__c(java.lang.String drive_Name__c) {
        this.drive_Name__c = drive_Name__c;
    }


    /**
     * Gets the drive_Status__c value for this _case.
     * 
     * @return drive_Status__c
     */
    public java.lang.String getDrive_Status__c() {
        return drive_Status__c;
    }


    /**
     * Sets the drive_Status__c value for this _case.
     * 
     * @param drive_Status__c
     */
    public void setDrive_Status__c(java.lang.String drive_Status__c) {
        this.drive_Status__c = drive_Status__c;
    }


    /**
     * Gets the due_Date__c value for this _case.
     * 
     * @return due_Date__c
     */
    public java.util.Date getDue_Date__c() {
        return due_Date__c;
    }


    /**
     * Sets the due_Date__c value for this _case.
     * 
     * @param due_Date__c
     */
    public void setDue_Date__c(java.util.Date due_Date__c) {
        this.due_Date__c = due_Date__c;
    }


    /**
     * Gets the effort_Estimate__c value for this _case.
     * 
     * @return effort_Estimate__c
     */
    public java.lang.String getEffort_Estimate__c() {
        return effort_Estimate__c;
    }


    /**
     * Sets the effort_Estimate__c value for this _case.
     * 
     * @param effort_Estimate__c
     */
    public void setEffort_Estimate__c(java.lang.String effort_Estimate__c) {
        this.effort_Estimate__c = effort_Estimate__c;
    }


    /**
     * Gets the emailMessages value for this _case.
     * 
     * @return emailMessages
     */
    public com.sforce.soap.enterprise.QueryResult getEmailMessages() {
        return emailMessages;
    }


    /**
     * Sets the emailMessages value for this _case.
     * 
     * @param emailMessages
     */
    public void setEmailMessages(com.sforce.soap.enterprise.QueryResult emailMessages) {
        this.emailMessages = emailMessages;
    }


    /**
     * Gets the email_Address__c value for this _case.
     * 
     * @return email_Address__c
     */
    public java.lang.String getEmail_Address__c() {
        return email_Address__c;
    }


    /**
     * Sets the email_Address__c value for this _case.
     * 
     * @param email_Address__c
     */
    public void setEmail_Address__c(java.lang.String email_Address__c) {
        this.email_Address__c = email_Address__c;
    }


    /**
     * Gets the environment_Sub__c value for this _case.
     * 
     * @return environment_Sub__c
     */
    public java.lang.String getEnvironment_Sub__c() {
        return environment_Sub__c;
    }


    /**
     * Sets the environment_Sub__c value for this _case.
     * 
     * @param environment_Sub__c
     */
    public void setEnvironment_Sub__c(java.lang.String environment_Sub__c) {
        this.environment_Sub__c = environment_Sub__c;
    }


    /**
     * Gets the environment__c value for this _case.
     * 
     * @return environment__c
     */
    public java.lang.String getEnvironment__c() {
        return environment__c;
    }


    /**
     * Sets the environment__c value for this _case.
     * 
     * @param environment__c
     */
    public void setEnvironment__c(java.lang.String environment__c) {
        this.environment__c = environment__c;
    }


    /**
     * Gets the error_File_Type__c value for this _case.
     * 
     * @return error_File_Type__c
     */
    public java.lang.String getError_File_Type__c() {
        return error_File_Type__c;
    }


    /**
     * Sets the error_File_Type__c value for this _case.
     * 
     * @param error_File_Type__c
     */
    public void setError_File_Type__c(java.lang.String error_File_Type__c) {
        this.error_File_Type__c = error_File_Type__c;
    }


    /**
     * Gets the error_Reproducable__c value for this _case.
     * 
     * @return error_Reproducable__c
     */
    public java.lang.String getError_Reproducable__c() {
        return error_Reproducable__c;
    }


    /**
     * Sets the error_Reproducable__c value for this _case.
     * 
     * @param error_Reproducable__c
     */
    public void setError_Reproducable__c(java.lang.String error_Reproducable__c) {
        this.error_Reproducable__c = error_Reproducable__c;
    }


    /**
     * Gets the error__c value for this _case.
     * 
     * @return error__c
     */
    public java.lang.String getError__c() {
        return error__c;
    }


    /**
     * Sets the error__c value for this _case.
     * 
     * @param error__c
     */
    public void setError__c(java.lang.String error__c) {
        this.error__c = error__c;
    }


    /**
     * Gets the escalate_to_Dev__c value for this _case.
     * 
     * @return escalate_to_Dev__c
     */
    public java.lang.Boolean getEscalate_to_Dev__c() {
        return escalate_to_Dev__c;
    }


    /**
     * Sets the escalate_to_Dev__c value for this _case.
     * 
     * @param escalate_to_Dev__c
     */
    public void setEscalate_to_Dev__c(java.lang.Boolean escalate_to_Dev__c) {
        this.escalate_to_Dev__c = escalate_to_Dev__c;
    }


    /**
     * Gets the escalated_for_Bug_Review_By__c value for this _case.
     * 
     * @return escalated_for_Bug_Review_By__c
     */
    public java.lang.String getEscalated_for_Bug_Review_By__c() {
        return escalated_for_Bug_Review_By__c;
    }


    /**
     * Sets the escalated_for_Bug_Review_By__c value for this _case.
     * 
     * @param escalated_for_Bug_Review_By__c
     */
    public void setEscalated_for_Bug_Review_By__c(java.lang.String escalated_for_Bug_Review_By__c) {
        this.escalated_for_Bug_Review_By__c = escalated_for_Bug_Review_By__c;
    }


    /**
     * Gets the escalated_for_Bug_Review__c value for this _case.
     * 
     * @return escalated_for_Bug_Review__c
     */
    public java.lang.Boolean getEscalated_for_Bug_Review__c() {
        return escalated_for_Bug_Review__c;
    }


    /**
     * Sets the escalated_for_Bug_Review__c value for this _case.
     * 
     * @param escalated_for_Bug_Review__c
     */
    public void setEscalated_for_Bug_Review__c(java.lang.Boolean escalated_for_Bug_Review__c) {
        this.escalated_for_Bug_Review__c = escalated_for_Bug_Review__c;
    }


    /**
     * Gets the escalated_for_Oracle_Defect_Review_By__c value for this _case.
     * 
     * @return escalated_for_Oracle_Defect_Review_By__c
     */
    public java.lang.String getEscalated_for_Oracle_Defect_Review_By__c() {
        return escalated_for_Oracle_Defect_Review_By__c;
    }


    /**
     * Sets the escalated_for_Oracle_Defect_Review_By__c value for this _case.
     * 
     * @param escalated_for_Oracle_Defect_Review_By__c
     */
    public void setEscalated_for_Oracle_Defect_Review_By__c(java.lang.String escalated_for_Oracle_Defect_Review_By__c) {
        this.escalated_for_Oracle_Defect_Review_By__c = escalated_for_Oracle_Defect_Review_By__c;
    }


    /**
     * Gets the escalated_for_Oracle_Defect_Review__c value for this _case.
     * 
     * @return escalated_for_Oracle_Defect_Review__c
     */
    public java.lang.Boolean getEscalated_for_Oracle_Defect_Review__c() {
        return escalated_for_Oracle_Defect_Review__c;
    }


    /**
     * Sets the escalated_for_Oracle_Defect_Review__c value for this _case.
     * 
     * @param escalated_for_Oracle_Defect_Review__c
     */
    public void setEscalated_for_Oracle_Defect_Review__c(java.lang.Boolean escalated_for_Oracle_Defect_Review__c) {
        this.escalated_for_Oracle_Defect_Review__c = escalated_for_Oracle_Defect_Review__c;
    }


    /**
     * Gets the escalated_for_PSI_Review_By__c value for this _case.
     * 
     * @return escalated_for_PSI_Review_By__c
     */
    public java.lang.String getEscalated_for_PSI_Review_By__c() {
        return escalated_for_PSI_Review_By__c;
    }


    /**
     * Sets the escalated_for_PSI_Review_By__c value for this _case.
     * 
     * @param escalated_for_PSI_Review_By__c
     */
    public void setEscalated_for_PSI_Review_By__c(java.lang.String escalated_for_PSI_Review_By__c) {
        this.escalated_for_PSI_Review_By__c = escalated_for_PSI_Review_By__c;
    }


    /**
     * Gets the escalated_for_PSI_Review__c value for this _case.
     * 
     * @return escalated_for_PSI_Review__c
     */
    public java.lang.Boolean getEscalated_for_PSI_Review__c() {
        return escalated_for_PSI_Review__c;
    }


    /**
     * Sets the escalated_for_PSI_Review__c value for this _case.
     * 
     * @param escalated_for_PSI_Review__c
     */
    public void setEscalated_for_PSI_Review__c(java.lang.Boolean escalated_for_PSI_Review__c) {
        this.escalated_for_PSI_Review__c = escalated_for_PSI_Review__c;
    }


    /**
     * Gets the escalated_for_Problem_File_Review_By__c value for this _case.
     * 
     * @return escalated_for_Problem_File_Review_By__c
     */
    public java.lang.String getEscalated_for_Problem_File_Review_By__c() {
        return escalated_for_Problem_File_Review_By__c;
    }


    /**
     * Sets the escalated_for_Problem_File_Review_By__c value for this _case.
     * 
     * @param escalated_for_Problem_File_Review_By__c
     */
    public void setEscalated_for_Problem_File_Review_By__c(java.lang.String escalated_for_Problem_File_Review_By__c) {
        this.escalated_for_Problem_File_Review_By__c = escalated_for_Problem_File_Review_By__c;
    }


    /**
     * Gets the escalated_for_Problem_File_Review__c value for this _case.
     * 
     * @return escalated_for_Problem_File_Review__c
     */
    public java.lang.Boolean getEscalated_for_Problem_File_Review__c() {
        return escalated_for_Problem_File_Review__c;
    }


    /**
     * Sets the escalated_for_Problem_File_Review__c value for this _case.
     * 
     * @param escalated_for_Problem_File_Review__c
     */
    public void setEscalated_for_Problem_File_Review__c(java.lang.Boolean escalated_for_Problem_File_Review__c) {
        this.escalated_for_Problem_File_Review__c = escalated_for_Problem_File_Review__c;
    }


    /**
     * Gets the escalated_for_Relativity_Bug_Review_By__c value for this _case.
     * 
     * @return escalated_for_Relativity_Bug_Review_By__c
     */
    public java.lang.String getEscalated_for_Relativity_Bug_Review_By__c() {
        return escalated_for_Relativity_Bug_Review_By__c;
    }


    /**
     * Sets the escalated_for_Relativity_Bug_Review_By__c value for this _case.
     * 
     * @param escalated_for_Relativity_Bug_Review_By__c
     */
    public void setEscalated_for_Relativity_Bug_Review_By__c(java.lang.String escalated_for_Relativity_Bug_Review_By__c) {
        this.escalated_for_Relativity_Bug_Review_By__c = escalated_for_Relativity_Bug_Review_By__c;
    }


    /**
     * Gets the escalated_for_Relativity_Bug_Review__c value for this _case.
     * 
     * @return escalated_for_Relativity_Bug_Review__c
     */
    public java.lang.Boolean getEscalated_for_Relativity_Bug_Review__c() {
        return escalated_for_Relativity_Bug_Review__c;
    }


    /**
     * Sets the escalated_for_Relativity_Bug_Review__c value for this _case.
     * 
     * @param escalated_for_Relativity_Bug_Review__c
     */
    public void setEscalated_for_Relativity_Bug_Review__c(java.lang.Boolean escalated_for_Relativity_Bug_Review__c) {
        this.escalated_for_Relativity_Bug_Review__c = escalated_for_Relativity_Bug_Review__c;
    }


    /**
     * Gets the escalated_to_Certification_By__c value for this _case.
     * 
     * @return escalated_to_Certification_By__c
     */
    public java.lang.String getEscalated_to_Certification_By__c() {
        return escalated_to_Certification_By__c;
    }


    /**
     * Sets the escalated_to_Certification_By__c value for this _case.
     * 
     * @param escalated_to_Certification_By__c
     */
    public void setEscalated_to_Certification_By__c(java.lang.String escalated_to_Certification_By__c) {
        this.escalated_to_Certification_By__c = escalated_to_Certification_By__c;
    }


    /**
     * Gets the escalated_to_Certification__c value for this _case.
     * 
     * @return escalated_to_Certification__c
     */
    public java.lang.Boolean getEscalated_to_Certification__c() {
        return escalated_to_Certification__c;
    }


    /**
     * Sets the escalated_to_Certification__c value for this _case.
     * 
     * @param escalated_to_Certification__c
     */
    public void setEscalated_to_Certification__c(java.lang.Boolean escalated_to_Certification__c) {
        this.escalated_to_Certification__c = escalated_to_Certification__c;
    }


    /**
     * Gets the escalated_to_Dev_By__c value for this _case.
     * 
     * @return escalated_to_Dev_By__c
     */
    public java.lang.String getEscalated_to_Dev_By__c() {
        return escalated_to_Dev_By__c;
    }


    /**
     * Sets the escalated_to_Dev_By__c value for this _case.
     * 
     * @param escalated_to_Dev_By__c
     */
    public void setEscalated_to_Dev_By__c(java.lang.String escalated_to_Dev_By__c) {
        this.escalated_to_Dev_By__c = escalated_to_Dev_By__c;
    }


    /**
     * Gets the escalated_to_KIE_By__c value for this _case.
     * 
     * @return escalated_to_KIE_By__c
     */
    public java.lang.String getEscalated_to_KIE_By__c() {
        return escalated_to_KIE_By__c;
    }


    /**
     * Sets the escalated_to_KIE_By__c value for this _case.
     * 
     * @param escalated_to_KIE_By__c
     */
    public void setEscalated_to_KIE_By__c(java.lang.String escalated_to_KIE_By__c) {
        this.escalated_to_KIE_By__c = escalated_to_KIE_By__c;
    }


    /**
     * Gets the escalated_to_L2_Person__c value for this _case.
     * 
     * @return escalated_to_L2_Person__c
     */
    public java.lang.String getEscalated_to_L2_Person__c() {
        return escalated_to_L2_Person__c;
    }


    /**
     * Sets the escalated_to_L2_Person__c value for this _case.
     * 
     * @param escalated_to_L2_Person__c
     */
    public void setEscalated_to_L2_Person__c(java.lang.String escalated_to_L2_Person__c) {
        this.escalated_to_L2_Person__c = escalated_to_L2_Person__c;
    }


    /**
     * Gets the escalated_to_L2__c value for this _case.
     * 
     * @return escalated_to_L2__c
     */
    public java.lang.Boolean getEscalated_to_L2__c() {
        return escalated_to_L2__c;
    }


    /**
     * Sets the escalated_to_L2__c value for this _case.
     * 
     * @param escalated_to_L2__c
     */
    public void setEscalated_to_L2__c(java.lang.Boolean escalated_to_L2__c) {
        this.escalated_to_L2__c = escalated_to_L2__c;
    }


    /**
     * Gets the escalated_to_Vendor_By__c value for this _case.
     * 
     * @return escalated_to_Vendor_By__c
     */
    public java.lang.String getEscalated_to_Vendor_By__c() {
        return escalated_to_Vendor_By__c;
    }


    /**
     * Sets the escalated_to_Vendor_By__c value for this _case.
     * 
     * @param escalated_to_Vendor_By__c
     */
    public void setEscalated_to_Vendor_By__c(java.lang.String escalated_to_Vendor_By__c) {
        this.escalated_to_Vendor_By__c = escalated_to_Vendor_By__c;
    }


    /**
     * Gets the escalated_to_Vendor__c value for this _case.
     * 
     * @return escalated_to_Vendor__c
     */
    public java.lang.Boolean getEscalated_to_Vendor__c() {
        return escalated_to_Vendor__c;
    }


    /**
     * Sets the escalated_to_Vendor__c value for this _case.
     * 
     * @param escalated_to_Vendor__c
     */
    public void setEscalated_to_Vendor__c(java.lang.Boolean escalated_to_Vendor__c) {
        this.escalated_to_Vendor__c = escalated_to_Vendor__c;
    }


    /**
     * Gets the escalated_to_kIE__c value for this _case.
     * 
     * @return escalated_to_kIE__c
     */
    public java.lang.Boolean getEscalated_to_kIE__c() {
        return escalated_to_kIE__c;
    }


    /**
     * Sets the escalated_to_kIE__c value for this _case.
     * 
     * @param escalated_to_kIE__c
     */
    public void setEscalated_to_kIE__c(java.lang.Boolean escalated_to_kIE__c) {
        this.escalated_to_kIE__c = escalated_to_kIE__c;
    }


    /**
     * Gets the estimated_Billable_Time_alert__c value for this _case.
     * 
     * @return estimated_Billable_Time_alert__c
     */
    public java.lang.Double getEstimated_Billable_Time_alert__c() {
        return estimated_Billable_Time_alert__c;
    }


    /**
     * Sets the estimated_Billable_Time_alert__c value for this _case.
     * 
     * @param estimated_Billable_Time_alert__c
     */
    public void setEstimated_Billable_Time_alert__c(java.lang.Double estimated_Billable_Time_alert__c) {
        this.estimated_Billable_Time_alert__c = estimated_Billable_Time_alert__c;
    }


    /**
     * Gets the estimated_Time_High__c value for this _case.
     * 
     * @return estimated_Time_High__c
     */
    public java.lang.Double getEstimated_Time_High__c() {
        return estimated_Time_High__c;
    }


    /**
     * Sets the estimated_Time_High__c value for this _case.
     * 
     * @param estimated_Time_High__c
     */
    public void setEstimated_Time_High__c(java.lang.Double estimated_Time_High__c) {
        this.estimated_Time_High__c = estimated_Time_High__c;
    }


    /**
     * Gets the estimated_Time_Low__c value for this _case.
     * 
     * @return estimated_Time_Low__c
     */
    public java.lang.Double getEstimated_Time_Low__c() {
        return estimated_Time_Low__c;
    }


    /**
     * Sets the estimated_Time_Low__c value for this _case.
     * 
     * @param estimated_Time_Low__c
     */
    public void setEstimated_Time_Low__c(java.lang.Double estimated_Time_Low__c) {
        this.estimated_Time_Low__c = estimated_Time_Low__c;
    }


    /**
     * Gets the evaluated_for_Business_Impact_By__c value for this _case.
     * 
     * @return evaluated_for_Business_Impact_By__c
     */
    public java.lang.String getEvaluated_for_Business_Impact_By__c() {
        return evaluated_for_Business_Impact_By__c;
    }


    /**
     * Sets the evaluated_for_Business_Impact_By__c value for this _case.
     * 
     * @param evaluated_for_Business_Impact_By__c
     */
    public void setEvaluated_for_Business_Impact_By__c(java.lang.String evaluated_for_Business_Impact_By__c) {
        this.evaluated_for_Business_Impact_By__c = evaluated_for_Business_Impact_By__c;
    }


    /**
     * Gets the events value for this _case.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this _case.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the expected_Load_Date__c value for this _case.
     * 
     * @return expected_Load_Date__c
     */
    public java.util.Date getExpected_Load_Date__c() {
        return expected_Load_Date__c;
    }


    /**
     * Sets the expected_Load_Date__c value for this _case.
     * 
     * @param expected_Load_Date__c
     */
    public void setExpected_Load_Date__c(java.util.Date expected_Load_Date__c) {
        this.expected_Load_Date__c = expected_Load_Date__c;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this _case.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this _case.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the feedbacks__r value for this _case.
     * 
     * @return feedbacks__r
     */
    public com.sforce.soap.enterprise.QueryResult getFeedbacks__r() {
        return feedbacks__r;
    }


    /**
     * Sets the feedbacks__r value for this _case.
     * 
     * @param feedbacks__r
     */
    public void setFeedbacks__r(com.sforce.soap.enterprise.QueryResult feedbacks__r) {
        this.feedbacks__r = feedbacks__r;
    }


    /**
     * Gets the feeds value for this _case.
     * 
     * @return feeds
     */
    public com.sforce.soap.enterprise.QueryResult getFeeds() {
        return feeds;
    }


    /**
     * Sets the feeds value for this _case.
     * 
     * @param feeds
     */
    public void setFeeds(com.sforce.soap.enterprise.QueryResult feeds) {
        this.feeds = feeds;
    }


    /**
     * Gets the file_Copy_Drive_Name__c value for this _case.
     * 
     * @return file_Copy_Drive_Name__c
     */
    public java.lang.String getFile_Copy_Drive_Name__c() {
        return file_Copy_Drive_Name__c;
    }


    /**
     * Sets the file_Copy_Drive_Name__c value for this _case.
     * 
     * @param file_Copy_Drive_Name__c
     */
    public void setFile_Copy_Drive_Name__c(java.lang.String file_Copy_Drive_Name__c) {
        this.file_Copy_Drive_Name__c = file_Copy_Drive_Name__c;
    }


    /**
     * Gets the file_Count__c value for this _case.
     * 
     * @return file_Count__c
     */
    public java.lang.Double getFile_Count__c() {
        return file_Count__c;
    }


    /**
     * Sets the file_Count__c value for this _case.
     * 
     * @param file_Count__c
     */
    public void setFile_Count__c(java.lang.Double file_Count__c) {
        this.file_Count__c = file_Count__c;
    }


    /**
     * Gets the file_Pervasiveness__c value for this _case.
     * 
     * @return file_Pervasiveness__c
     */
    public java.lang.String getFile_Pervasiveness__c() {
        return file_Pervasiveness__c;
    }


    /**
     * Sets the file_Pervasiveness__c value for this _case.
     * 
     * @param file_Pervasiveness__c
     */
    public void setFile_Pervasiveness__c(java.lang.String file_Pervasiveness__c) {
        this.file_Pervasiveness__c = file_Pervasiveness__c;
    }


    /**
     * Gets the file_Size_GB__c value for this _case.
     * 
     * @return file_Size_GB__c
     */
    public java.lang.Double getFile_Size_GB__c() {
        return file_Size_GB__c;
    }


    /**
     * Sets the file_Size_GB__c value for this _case.
     * 
     * @param file_Size_GB__c
     */
    public void setFile_Size_GB__c(java.lang.Double file_Size_GB__c) {
        this.file_Size_GB__c = file_Size_GB__c;
    }


    /**
     * Gets the follow_up_Items__c value for this _case.
     * 
     * @return follow_up_Items__c
     */
    public java.lang.String getFollow_up_Items__c() {
        return follow_up_Items__c;
    }


    /**
     * Sets the follow_up_Items__c value for this _case.
     * 
     * @param follow_up_Items__c
     */
    public void setFollow_up_Items__c(java.lang.String follow_up_Items__c) {
        this.follow_up_Items__c = follow_up_Items__c;
    }


    /**
     * Gets the follow_up_Response_Deadline__c value for this _case.
     * 
     * @return follow_up_Response_Deadline__c
     */
    public java.util.Calendar getFollow_up_Response_Deadline__c() {
        return follow_up_Response_Deadline__c;
    }


    /**
     * Sets the follow_up_Response_Deadline__c value for this _case.
     * 
     * @param follow_up_Response_Deadline__c
     */
    public void setFollow_up_Response_Deadline__c(java.util.Calendar follow_up_Response_Deadline__c) {
        this.follow_up_Response_Deadline__c = follow_up_Response_Deadline__c;
    }


    /**
     * Gets the grouping__c value for this _case.
     * 
     * @return grouping__c
     */
    public java.lang.String getGrouping__c() {
        return grouping__c;
    }


    /**
     * Sets the grouping__c value for this _case.
     * 
     * @param grouping__c
     */
    public void setGrouping__c(java.lang.String grouping__c) {
        this.grouping__c = grouping__c;
    }


    /**
     * Gets the groups_and_Users__c value for this _case.
     * 
     * @return groups_and_Users__c
     */
    public java.lang.String getGroups_and_Users__c() {
        return groups_and_Users__c;
    }


    /**
     * Sets the groups_and_Users__c value for this _case.
     * 
     * @param groups_and_Users__c
     */
    public void setGroups_and_Users__c(java.lang.String groups_and_Users__c) {
        this.groups_and_Users__c = groups_and_Users__c;
    }


    /**
     * Gets the HCW_Ticket__c value for this _case.
     * 
     * @return HCW_Ticket__c
     */
    public java.lang.String getHCW_Ticket__c() {
        return HCW_Ticket__c;
    }


    /**
     * Sets the HCW_Ticket__c value for this _case.
     * 
     * @param HCW_Ticket__c
     */
    public void setHCW_Ticket__c(java.lang.String HCW_Ticket__c) {
        this.HCW_Ticket__c = HCW_Ticket__c;
    }


    /**
     * Gets the HCW_Ticket__r value for this _case.
     * 
     * @return HCW_Ticket__r
     */
    public com.sforce.soap.enterprise.sobject._case getHCW_Ticket__r() {
        return HCW_Ticket__r;
    }


    /**
     * Sets the HCW_Ticket__r value for this _case.
     * 
     * @param HCW_Ticket__r
     */
    public void setHCW_Ticket__r(com.sforce.soap.enterprise.sobject._case HCW_Ticket__r) {
        this.HCW_Ticket__r = HCW_Ticket__r;
    }


    /**
     * Gets the hasCommentsUnreadByOwner value for this _case.
     * 
     * @return hasCommentsUnreadByOwner
     */
    public java.lang.Boolean getHasCommentsUnreadByOwner() {
        return hasCommentsUnreadByOwner;
    }


    /**
     * Sets the hasCommentsUnreadByOwner value for this _case.
     * 
     * @param hasCommentsUnreadByOwner
     */
    public void setHasCommentsUnreadByOwner(java.lang.Boolean hasCommentsUnreadByOwner) {
        this.hasCommentsUnreadByOwner = hasCommentsUnreadByOwner;
    }


    /**
     * Gets the hasSelfServiceComments value for this _case.
     * 
     * @return hasSelfServiceComments
     */
    public java.lang.Boolean getHasSelfServiceComments() {
        return hasSelfServiceComments;
    }


    /**
     * Sets the hasSelfServiceComments value for this _case.
     * 
     * @param hasSelfServiceComments
     */
    public void setHasSelfServiceComments(java.lang.Boolean hasSelfServiceComments) {
        this.hasSelfServiceComments = hasSelfServiceComments;
    }


    /**
     * Gets the has_Custom_Solution__c value for this _case.
     * 
     * @return has_Custom_Solution__c
     */
    public java.lang.Double getHas_Custom_Solution__c() {
        return has_Custom_Solution__c;
    }


    /**
     * Sets the has_Custom_Solution__c value for this _case.
     * 
     * @param has_Custom_Solution__c
     */
    public void setHas_Custom_Solution__c(java.lang.Double has_Custom_Solution__c) {
        this.has_Custom_Solution__c = has_Custom_Solution__c;
    }


    /**
     * Gets the has_Custom_Solution_old__c value for this _case.
     * 
     * @return has_Custom_Solution_old__c
     */
    public java.lang.String getHas_Custom_Solution_old__c() {
        return has_Custom_Solution_old__c;
    }


    /**
     * Sets the has_Custom_Solution_old__c value for this _case.
     * 
     * @param has_Custom_Solution_old__c
     */
    public void setHas_Custom_Solution_old__c(java.lang.String has_Custom_Solution_old__c) {
        this.has_Custom_Solution_old__c = has_Custom_Solution_old__c;
    }


    /**
     * Gets the has_Non_Licensing_DLLs__c value for this _case.
     * 
     * @return has_Non_Licensing_DLLs__c
     */
    public java.lang.String getHas_Non_Licensing_DLLs__c() {
        return has_Non_Licensing_DLLs__c;
    }


    /**
     * Sets the has_Non_Licensing_DLLs__c value for this _case.
     * 
     * @param has_Non_Licensing_DLLs__c
     */
    public void setHas_Non_Licensing_DLLs__c(java.lang.String has_Non_Licensing_DLLs__c) {
        this.has_Non_Licensing_DLLs__c = has_Non_Licensing_DLLs__c;
    }


    /**
     * Gets the help_Group__c value for this _case.
     * 
     * @return help_Group__c
     */
    public java.lang.String getHelp_Group__c() {
        return help_Group__c;
    }


    /**
     * Sets the help_Group__c value for this _case.
     * 
     * @param help_Group__c
     */
    public void setHelp_Group__c(java.lang.String help_Group__c) {
        this.help_Group__c = help_Group__c;
    }


    /**
     * Gets the histories value for this _case.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this _case.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the hour_Entered_Pause_State__c value for this _case.
     * 
     * @return hour_Entered_Pause_State__c
     */
    public java.util.Calendar getHour_Entered_Pause_State__c() {
        return hour_Entered_Pause_State__c;
    }


    /**
     * Sets the hour_Entered_Pause_State__c value for this _case.
     * 
     * @param hour_Entered_Pause_State__c
     */
    public void setHour_Entered_Pause_State__c(java.util.Calendar hour_Entered_Pause_State__c) {
        this.hour_Entered_Pause_State__c = hour_Entered_Pause_State__c;
    }


    /**
     * Gets the hour_in_Customer_Action__c value for this _case.
     * 
     * @return hour_in_Customer_Action__c
     */
    public java.lang.Double getHour_in_Customer_Action__c() {
        return hour_in_Customer_Action__c;
    }


    /**
     * Sets the hour_in_Customer_Action__c value for this _case.
     * 
     * @param hour_in_Customer_Action__c
     */
    public void setHour_in_Customer_Action__c(java.lang.Double hour_in_Customer_Action__c) {
        this.hour_in_Customer_Action__c = hour_in_Customer_Action__c;
    }


    /**
     * Gets the hours__c value for this _case.
     * 
     * @return hours__c
     */
    public java.lang.Double getHours__c() {
        return hours__c;
    }


    /**
     * Sets the hours__c value for this _case.
     * 
     * @param hours__c
     */
    public void setHours__c(java.lang.Double hours__c) {
        this.hours__c = hours__c;
    }


    /**
     * Gets the impact__c value for this _case.
     * 
     * @return impact__c
     */
    public java.lang.String getImpact__c() {
        return impact__c;
    }


    /**
     * Sets the impact__c value for this _case.
     * 
     * @param impact__c
     */
    public void setImpact__c(java.lang.String impact__c) {
        this.impact__c = impact__c;
    }


    /**
     * Gets the impeded__c value for this _case.
     * 
     * @return impeded__c
     */
    public java.lang.Boolean getImpeded__c() {
        return impeded__c;
    }


    /**
     * Sets the impeded__c value for this _case.
     * 
     * @param impeded__c
     */
    public void setImpeded__c(java.lang.Boolean impeded__c) {
        this.impeded__c = impeded__c;
    }


    /**
     * Gets the inbound_Tracking_Number__c value for this _case.
     * 
     * @return inbound_Tracking_Number__c
     */
    public java.lang.String getInbound_Tracking_Number__c() {
        return inbound_Tracking_Number__c;
    }


    /**
     * Sets the inbound_Tracking_Number__c value for this _case.
     * 
     * @param inbound_Tracking_Number__c
     */
    public void setInbound_Tracking_Number__c(java.lang.String inbound_Tracking_Number__c) {
        this.inbound_Tracking_Number__c = inbound_Tracking_Number__c;
    }


    /**
     * Gets the initial_Client_Contact__c value for this _case.
     * 
     * @return initial_Client_Contact__c
     */
    public java.util.Calendar getInitial_Client_Contact__c() {
        return initial_Client_Contact__c;
    }


    /**
     * Sets the initial_Client_Contact__c value for this _case.
     * 
     * @param initial_Client_Contact__c
     */
    public void setInitial_Client_Contact__c(java.util.Calendar initial_Client_Contact__c) {
        this.initial_Client_Contact__c = initial_Client_Contact__c;
    }


    /**
     * Gets the initial_Estimate__c value for this _case.
     * 
     * @return initial_Estimate__c
     */
    public java.lang.String getInitial_Estimate__c() {
        return initial_Estimate__c;
    }


    /**
     * Sets the initial_Estimate__c value for this _case.
     * 
     * @param initial_Estimate__c
     */
    public void setInitial_Estimate__c(java.lang.String initial_Estimate__c) {
        this.initial_Estimate__c = initial_Estimate__c;
    }


    /**
     * Gets the instance__c value for this _case.
     * 
     * @return instance__c
     */
    public java.lang.String getInstance__c() {
        return instance__c;
    }


    /**
     * Sets the instance__c value for this _case.
     * 
     * @param instance__c
     */
    public void setInstance__c(java.lang.String instance__c) {
        this.instance__c = instance__c;
    }


    /**
     * Gets the instance__r value for this _case.
     * 
     * @return instance__r
     */
    public com.sforce.soap.enterprise.sobject.Instance__c getInstance__r() {
        return instance__r;
    }


    /**
     * Sets the instance__r value for this _case.
     * 
     * @param instance__r
     */
    public void setInstance__r(com.sforce.soap.enterprise.sobject.Instance__c instance__r) {
        this.instance__r = instance__r;
    }


    /**
     * Gets the isClosed value for this _case.
     * 
     * @return isClosed
     */
    public java.lang.Boolean getIsClosed() {
        return isClosed;
    }


    /**
     * Sets the isClosed value for this _case.
     * 
     * @param isClosed
     */
    public void setIsClosed(java.lang.Boolean isClosed) {
        this.isClosed = isClosed;
    }


    /**
     * Gets the isDeleted value for this _case.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this _case.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the isEscalated value for this _case.
     * 
     * @return isEscalated
     */
    public java.lang.Boolean getIsEscalated() {
        return isEscalated;
    }


    /**
     * Sets the isEscalated value for this _case.
     * 
     * @param isEscalated
     */
    public void setIsEscalated(java.lang.Boolean isEscalated) {
        this.isEscalated = isEscalated;
    }


    /**
     * Gets the isVisibleInSelfService value for this _case.
     * 
     * @return isVisibleInSelfService
     */
    public java.lang.Boolean getIsVisibleInSelfService() {
        return isVisibleInSelfService;
    }


    /**
     * Sets the isVisibleInSelfService value for this _case.
     * 
     * @param isVisibleInSelfService
     */
    public void setIsVisibleInSelfService(java.lang.Boolean isVisibleInSelfService) {
        this.isVisibleInSelfService = isVisibleInSelfService;
    }


    /**
     * Gets the is_Admin_Contact__c value for this _case.
     * 
     * @return is_Admin_Contact__c
     */
    public java.lang.String getIs_Admin_Contact__c() {
        return is_Admin_Contact__c;
    }


    /**
     * Sets the is_Admin_Contact__c value for this _case.
     * 
     * @param is_Admin_Contact__c
     */
    public void setIs_Admin_Contact__c(java.lang.String is_Admin_Contact__c) {
        this.is_Admin_Contact__c = is_Admin_Contact__c;
    }


    /**
     * Gets the issue_Description__c value for this _case.
     * 
     * @return issue_Description__c
     */
    public java.lang.String getIssue_Description__c() {
        return issue_Description__c;
    }


    /**
     * Sets the issue_Description__c value for this _case.
     * 
     * @param issue_Description__c
     */
    public void setIssue_Description__c(java.lang.String issue_Description__c) {
        this.issue_Description__c = issue_Description__c;
    }


    /**
     * Gets the items_Delivered__c value for this _case.
     * 
     * @return items_Delivered__c
     */
    public java.lang.String getItems_Delivered__c() {
        return items_Delivered__c;
    }


    /**
     * Sets the items_Delivered__c value for this _case.
     * 
     * @param items_Delivered__c
     */
    public void setItems_Delivered__c(java.lang.String items_Delivered__c) {
        this.items_Delivered__c = items_Delivered__c;
    }


    /**
     * Gets the KCD_Solution_Recipient__c value for this _case.
     * 
     * @return KCD_Solution_Recipient__c
     */
    public java.lang.Double getKCD_Solution_Recipient__c() {
        return KCD_Solution_Recipient__c;
    }


    /**
     * Sets the KCD_Solution_Recipient__c value for this _case.
     * 
     * @param KCD_Solution_Recipient__c
     */
    public void setKCD_Solution_Recipient__c(java.lang.Double KCD_Solution_Recipient__c) {
        this.KCD_Solution_Recipient__c = KCD_Solution_Recipient__c;
    }


    /**
     * Gets the KCD_Solution_Recipients__r value for this _case.
     * 
     * @return KCD_Solution_Recipients__r
     */
    public com.sforce.soap.enterprise.QueryResult getKCD_Solution_Recipients__r() {
        return KCD_Solution_Recipients__r;
    }


    /**
     * Sets the KCD_Solution_Recipients__r value for this _case.
     * 
     * @param KCD_Solution_Recipients__r
     */
    public void setKCD_Solution_Recipients__r(com.sforce.soap.enterprise.QueryResult KCD_Solution_Recipients__r) {
        this.KCD_Solution_Recipients__r = KCD_Solution_Recipients__r;
    }


    /**
     * Gets the known_Defect__c value for this _case.
     * 
     * @return known_Defect__c
     */
    public java.lang.Boolean getKnown_Defect__c() {
        return known_Defect__c;
    }


    /**
     * Sets the known_Defect__c value for this _case.
     * 
     * @param known_Defect__c
     */
    public void setKnown_Defect__c(java.lang.Boolean known_Defect__c) {
        this.known_Defect__c = known_Defect__c;
    }


    /**
     * Gets the lab__c value for this _case.
     * 
     * @return lab__c
     */
    public java.lang.Double getLab__c() {
        return lab__c;
    }


    /**
     * Sets the lab__c value for this _case.
     * 
     * @param lab__c
     */
    public void setLab__c(java.lang.Double lab__c) {
        this.lab__c = lab__c;
    }


    /**
     * Gets the lastModifiedBy value for this _case.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this _case.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this _case.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this _case.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this _case.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this _case.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the last_Status_Change__c value for this _case.
     * 
     * @return last_Status_Change__c
     */
    public java.util.Calendar getLast_Status_Change__c() {
        return last_Status_Change__c;
    }


    /**
     * Sets the last_Status_Change__c value for this _case.
     * 
     * @param last_Status_Change__c
     */
    public void setLast_Status_Change__c(java.util.Calendar last_Status_Change__c) {
        this.last_Status_Change__c = last_Status_Change__c;
    }


    /**
     * Gets the location__c value for this _case.
     * 
     * @return location__c
     */
    public java.lang.String getLocation__c() {
        return location__c;
    }


    /**
     * Sets the location__c value for this _case.
     * 
     * @param location__c
     */
    public void setLocation__c(java.lang.String location__c) {
        this.location__c = location__c;
    }


    /**
     * Gets the location_of_Document__c value for this _case.
     * 
     * @return location_of_Document__c
     */
    public java.lang.String getLocation_of_Document__c() {
        return location_of_Document__c;
    }


    /**
     * Sets the location_of_Document__c value for this _case.
     * 
     * @param location_of_Document__c
     */
    public void setLocation_of_Document__c(java.lang.String location_of_Document__c) {
        this.location_of_Document__c = location_of_Document__c;
    }


    /**
     * Gets the long_Term_Actual_Date__c value for this _case.
     * 
     * @return long_Term_Actual_Date__c
     */
    public java.util.Date getLong_Term_Actual_Date__c() {
        return long_Term_Actual_Date__c;
    }


    /**
     * Sets the long_Term_Actual_Date__c value for this _case.
     * 
     * @param long_Term_Actual_Date__c
     */
    public void setLong_Term_Actual_Date__c(java.util.Date long_Term_Actual_Date__c) {
        this.long_Term_Actual_Date__c = long_Term_Actual_Date__c;
    }


    /**
     * Gets the long_Term_Corrective_Action__c value for this _case.
     * 
     * @return long_Term_Corrective_Action__c
     */
    public java.lang.String getLong_Term_Corrective_Action__c() {
        return long_Term_Corrective_Action__c;
    }


    /**
     * Sets the long_Term_Corrective_Action__c value for this _case.
     * 
     * @param long_Term_Corrective_Action__c
     */
    public void setLong_Term_Corrective_Action__c(java.lang.String long_Term_Corrective_Action__c) {
        this.long_Term_Corrective_Action__c = long_Term_Corrective_Action__c;
    }


    /**
     * Gets the long_Term_Scheduled_Date__c value for this _case.
     * 
     * @return long_Term_Scheduled_Date__c
     */
    public java.util.Date getLong_Term_Scheduled_Date__c() {
        return long_Term_Scheduled_Date__c;
    }


    /**
     * Sets the long_Term_Scheduled_Date__c value for this _case.
     * 
     * @param long_Term_Scheduled_Date__c
     */
    public void setLong_Term_Scheduled_Date__c(java.util.Date long_Term_Scheduled_Date__c) {
        this.long_Term_Scheduled_Date__c = long_Term_Scheduled_Date__c;
    }


    /**
     * Gets the MDF_Size_GB__c value for this _case.
     * 
     * @return MDF_Size_GB__c
     */
    public java.lang.Double getMDF_Size_GB__c() {
        return MDF_Size_GB__c;
    }


    /**
     * Sets the MDF_Size_GB__c value for this _case.
     * 
     * @param MDF_Size_GB__c
     */
    public void setMDF_Size_GB__c(java.lang.Double MDF_Size_GB__c) {
        this.MDF_Size_GB__c = MDF_Size_GB__c;
    }


    /**
     * Gets the make__c value for this _case.
     * 
     * @return make__c
     */
    public java.lang.String getMake__c() {
        return make__c;
    }


    /**
     * Sets the make__c value for this _case.
     * 
     * @param make__c
     */
    public void setMake__c(java.lang.String make__c) {
        this.make__c = make__c;
    }


    /**
     * Gets the marketing_Surveys__r value for this _case.
     * 
     * @return marketing_Surveys__r
     */
    public com.sforce.soap.enterprise.QueryResult getMarketing_Surveys__r() {
        return marketing_Surveys__r;
    }


    /**
     * Sets the marketing_Surveys__r value for this _case.
     * 
     * @param marketing_Surveys__r
     */
    public void setMarketing_Surveys__r(com.sforce.soap.enterprise.QueryResult marketing_Surveys__r) {
        this.marketing_Surveys__r = marketing_Surveys__r;
    }


    /**
     * Gets the medium__c value for this _case.
     * 
     * @return medium__c
     */
    public java.lang.String getMedium__c() {
        return medium__c;
    }


    /**
     * Sets the medium__c value for this _case.
     * 
     * @param medium__c
     */
    public void setMedium__c(java.lang.String medium__c) {
        this.medium__c = medium__c;
    }


    /**
     * Gets the microsoft_Case_Owner_Email__c value for this _case.
     * 
     * @return microsoft_Case_Owner_Email__c
     */
    public java.lang.String getMicrosoft_Case_Owner_Email__c() {
        return microsoft_Case_Owner_Email__c;
    }


    /**
     * Sets the microsoft_Case_Owner_Email__c value for this _case.
     * 
     * @param microsoft_Case_Owner_Email__c
     */
    public void setMicrosoft_Case_Owner_Email__c(java.lang.String microsoft_Case_Owner_Email__c) {
        this.microsoft_Case_Owner_Email__c = microsoft_Case_Owner_Email__c;
    }


    /**
     * Gets the microsoft_Case_Owner_Tel__c value for this _case.
     * 
     * @return microsoft_Case_Owner_Tel__c
     */
    public java.lang.String getMicrosoft_Case_Owner_Tel__c() {
        return microsoft_Case_Owner_Tel__c;
    }


    /**
     * Sets the microsoft_Case_Owner_Tel__c value for this _case.
     * 
     * @param microsoft_Case_Owner_Tel__c
     */
    public void setMicrosoft_Case_Owner_Tel__c(java.lang.String microsoft_Case_Owner_Tel__c) {
        this.microsoft_Case_Owner_Tel__c = microsoft_Case_Owner_Tel__c;
    }


    /**
     * Gets the microsoft_Case_Owner__c value for this _case.
     * 
     * @return microsoft_Case_Owner__c
     */
    public java.lang.String getMicrosoft_Case_Owner__c() {
        return microsoft_Case_Owner__c;
    }


    /**
     * Sets the microsoft_Case_Owner__c value for this _case.
     * 
     * @param microsoft_Case_Owner__c
     */
    public void setMicrosoft_Case_Owner__c(java.lang.String microsoft_Case_Owner__c) {
        this.microsoft_Case_Owner__c = microsoft_Case_Owner__c;
    }


    /**
     * Gets the microsoft_Case__c value for this _case.
     * 
     * @return microsoft_Case__c
     */
    public java.lang.String getMicrosoft_Case__c() {
        return microsoft_Case__c;
    }


    /**
     * Sets the microsoft_Case__c value for this _case.
     * 
     * @param microsoft_Case__c
     */
    public void setMicrosoft_Case__c(java.lang.String microsoft_Case__c) {
        this.microsoft_Case__c = microsoft_Case__c;
    }


    /**
     * Gets the microsoft_Severity_Level__c value for this _case.
     * 
     * @return microsoft_Severity_Level__c
     */
    public java.lang.String getMicrosoft_Severity_Level__c() {
        return microsoft_Severity_Level__c;
    }


    /**
     * Sets the microsoft_Severity_Level__c value for this _case.
     * 
     * @param microsoft_Severity_Level__c
     */
    public void setMicrosoft_Severity_Level__c(java.lang.String microsoft_Severity_Level__c) {
        this.microsoft_Severity_Level__c = microsoft_Severity_Level__c;
    }


    /**
     * Gets the microsoft_Telephone_Number__c value for this _case.
     * 
     * @return microsoft_Telephone_Number__c
     */
    public java.lang.String getMicrosoft_Telephone_Number__c() {
        return microsoft_Telephone_Number__c;
    }


    /**
     * Sets the microsoft_Telephone_Number__c value for this _case.
     * 
     * @param microsoft_Telephone_Number__c
     */
    public void setMicrosoft_Telephone_Number__c(java.lang.String microsoft_Telephone_Number__c) {
        this.microsoft_Telephone_Number__c = microsoft_Telephone_Number__c;
    }


    /**
     * Gets the migration_End_Date__c value for this _case.
     * 
     * @return migration_End_Date__c
     */
    public java.util.Calendar getMigration_End_Date__c() {
        return migration_End_Date__c;
    }


    /**
     * Sets the migration_End_Date__c value for this _case.
     * 
     * @param migration_End_Date__c
     */
    public void setMigration_End_Date__c(java.util.Calendar migration_End_Date__c) {
        this.migration_End_Date__c = migration_End_Date__c;
    }


    /**
     * Gets the migration_Initial_File_Copy_Start_Date__c value for this _case.
     * 
     * @return migration_Initial_File_Copy_Start_Date__c
     */
    public java.util.Calendar getMigration_Initial_File_Copy_Start_Date__c() {
        return migration_Initial_File_Copy_Start_Date__c;
    }


    /**
     * Sets the migration_Initial_File_Copy_Start_Date__c value for this _case.
     * 
     * @param migration_Initial_File_Copy_Start_Date__c
     */
    public void setMigration_Initial_File_Copy_Start_Date__c(java.util.Calendar migration_Initial_File_Copy_Start_Date__c) {
        this.migration_Initial_File_Copy_Start_Date__c = migration_Initial_File_Copy_Start_Date__c;
    }


    /**
     * Gets the migration_Number_of_Files_Copied__c value for this _case.
     * 
     * @return migration_Number_of_Files_Copied__c
     */
    public java.lang.Double getMigration_Number_of_Files_Copied__c() {
        return migration_Number_of_Files_Copied__c;
    }


    /**
     * Sets the migration_Number_of_Files_Copied__c value for this _case.
     * 
     * @param migration_Number_of_Files_Copied__c
     */
    public void setMigration_Number_of_Files_Copied__c(java.lang.Double migration_Number_of_Files_Copied__c) {
        this.migration_Number_of_Files_Copied__c = migration_Number_of_Files_Copied__c;
    }


    /**
     * Gets the migration_Size_GB__c value for this _case.
     * 
     * @return migration_Size_GB__c
     */
    public java.lang.Double getMigration_Size_GB__c() {
        return migration_Size_GB__c;
    }


    /**
     * Sets the migration_Size_GB__c value for this _case.
     * 
     * @param migration_Size_GB__c
     */
    public void setMigration_Size_GB__c(java.lang.Double migration_Size_GB__c) {
        this.migration_Size_GB__c = migration_Size_GB__c;
    }


    /**
     * Gets the missed_SLA_Deadline_Ticket_Owner__c value for this _case.
     * 
     * @return missed_SLA_Deadline_Ticket_Owner__c
     */
    public java.lang.String getMissed_SLA_Deadline_Ticket_Owner__c() {
        return missed_SLA_Deadline_Ticket_Owner__c;
    }


    /**
     * Sets the missed_SLA_Deadline_Ticket_Owner__c value for this _case.
     * 
     * @param missed_SLA_Deadline_Ticket_Owner__c
     */
    public void setMissed_SLA_Deadline_Ticket_Owner__c(java.lang.String missed_SLA_Deadline_Ticket_Owner__c) {
        this.missed_SLA_Deadline_Ticket_Owner__c = missed_SLA_Deadline_Ticket_Owner__c;
    }


    /**
     * Gets the model_Product_Number__c value for this _case.
     * 
     * @return model_Product_Number__c
     */
    public java.lang.String getModel_Product_Number__c() {
        return model_Product_Number__c;
    }


    /**
     * Sets the model_Product_Number__c value for this _case.
     * 
     * @param model_Product_Number__c
     */
    public void setModel_Product_Number__c(java.lang.String model_Product_Number__c) {
        this.model_Product_Number__c = model_Product_Number__c;
    }


    /**
     * Gets the name__c value for this _case.
     * 
     * @return name__c
     */
    public java.lang.String getName__c() {
        return name__c;
    }


    /**
     * Sets the name__c value for this _case.
     * 
     * @param name__c
     */
    public void setName__c(java.lang.String name__c) {
        this.name__c = name__c;
    }


    /**
     * Gets the name_of_Document__c value for this _case.
     * 
     * @return name_of_Document__c
     */
    public java.lang.String getName_of_Document__c() {
        return name_of_Document__c;
    }


    /**
     * Sets the name_of_Document__c value for this _case.
     * 
     * @param name_of_Document__c
     */
    public void setName_of_Document__c(java.lang.String name_of_Document__c) {
        this.name_of_Document__c = name_of_Document__c;
    }


    /**
     * Gets the needs_Immediate_Attention__c value for this _case.
     * 
     * @return needs_Immediate_Attention__c
     */
    public java.lang.String getNeeds_Immediate_Attention__c() {
        return needs_Immediate_Attention__c;
    }


    /**
     * Sets the needs_Immediate_Attention__c value for this _case.
     * 
     * @param needs_Immediate_Attention__c
     */
    public void setNeeds_Immediate_Attention__c(java.lang.String needs_Immediate_Attention__c) {
        this.needs_Immediate_Attention__c = needs_Immediate_Attention__c;
    }


    /**
     * Gets the new_Case_Name__c value for this _case.
     * 
     * @return new_Case_Name__c
     */
    public java.lang.String getNew_Case_Name__c() {
        return new_Case_Name__c;
    }


    /**
     * Sets the new_Case_Name__c value for this _case.
     * 
     * @param new_Case_Name__c
     */
    public void setNew_Case_Name__c(java.lang.String new_Case_Name__c) {
        this.new_Case_Name__c = new_Case_Name__c;
    }


    /**
     * Gets the new_Comment__c value for this _case.
     * 
     * @return new_Comment__c
     */
    public java.lang.Boolean getNew_Comment__c() {
        return new_Comment__c;
    }


    /**
     * Sets the new_Comment__c value for this _case.
     * 
     * @param new_Comment__c
     */
    public void setNew_Comment__c(java.lang.Boolean new_Comment__c) {
        this.new_Comment__c = new_Comment__c;
    }


    /**
     * Gets the no_Show__c value for this _case.
     * 
     * @return no_Show__c
     */
    public java.lang.Boolean getNo_Show__c() {
        return no_Show__c;
    }


    /**
     * Sets the no_Show__c value for this _case.
     * 
     * @param no_Show__c
     */
    public void setNo_Show__c(java.lang.Boolean no_Show__c) {
        this.no_Show__c = no_Show__c;
    }


    /**
     * Gets the notes__c value for this _case.
     * 
     * @return notes__c
     */
    public java.lang.String getNotes__c() {
        return notes__c;
    }


    /**
     * Sets the notes__c value for this _case.
     * 
     * @param notes__c
     */
    public void setNotes__c(java.lang.String notes__c) {
        this.notes__c = notes__c;
    }


    /**
     * Gets the number_of_Event_Handlers__c value for this _case.
     * 
     * @return number_of_Event_Handlers__c
     */
    public java.lang.Double getNumber_of_Event_Handlers__c() {
        return number_of_Event_Handlers__c;
    }


    /**
     * Sets the number_of_Event_Handlers__c value for this _case.
     * 
     * @param number_of_Event_Handlers__c
     */
    public void setNumber_of_Event_Handlers__c(java.lang.Double number_of_Event_Handlers__c) {
        this.number_of_Event_Handlers__c = number_of_Event_Handlers__c;
    }


    /**
     * Gets the number_of_Relativity_Analytics_Indexes__c value for this _case.
     * 
     * @return number_of_Relativity_Analytics_Indexes__c
     */
    public java.lang.Double getNumber_of_Relativity_Analytics_Indexes__c() {
        return number_of_Relativity_Analytics_Indexes__c;
    }


    /**
     * Sets the number_of_Relativity_Analytics_Indexes__c value for this _case.
     * 
     * @param number_of_Relativity_Analytics_Indexes__c
     */
    public void setNumber_of_Relativity_Analytics_Indexes__c(java.lang.Double number_of_Relativity_Analytics_Indexes__c) {
        this.number_of_Relativity_Analytics_Indexes__c = number_of_Relativity_Analytics_Indexes__c;
    }


    /**
     * Gets the number_of_dtSearch_Indexes__c value for this _case.
     * 
     * @return number_of_dtSearch_Indexes__c
     */
    public java.lang.Double getNumber_of_dtSearch_Indexes__c() {
        return number_of_dtSearch_Indexes__c;
    }


    /**
     * Sets the number_of_dtSearch_Indexes__c value for this _case.
     * 
     * @param number_of_dtSearch_Indexes__c
     */
    public void setNumber_of_dtSearch_Indexes__c(java.lang.Double number_of_dtSearch_Indexes__c) {
        this.number_of_dtSearch_Indexes__c = number_of_dtSearch_Indexes__c;
    }


    /**
     * Gets the openActivities value for this _case.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this _case.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the opened_Day_of_the_Week__c value for this _case.
     * 
     * @return opened_Day_of_the_Week__c
     */
    public java.lang.String getOpened_Day_of_the_Week__c() {
        return opened_Day_of_the_Week__c;
    }


    /**
     * Sets the opened_Day_of_the_Week__c value for this _case.
     * 
     * @param opened_Day_of_the_Week__c
     */
    public void setOpened_Day_of_the_Week__c(java.lang.String opened_Day_of_the_Week__c) {
        this.opened_Day_of_the_Week__c = opened_Day_of_the_Week__c;
    }


    /**
     * Gets the opportunity__c value for this _case.
     * 
     * @return opportunity__c
     */
    public java.lang.String getOpportunity__c() {
        return opportunity__c;
    }


    /**
     * Sets the opportunity__c value for this _case.
     * 
     * @param opportunity__c
     */
    public void setOpportunity__c(java.lang.String opportunity__c) {
        this.opportunity__c = opportunity__c;
    }


    /**
     * Gets the opportunity__r value for this _case.
     * 
     * @return opportunity__r
     */
    public com.sforce.soap.enterprise.sobject.Opportunity getOpportunity__r() {
        return opportunity__r;
    }


    /**
     * Sets the opportunity__r value for this _case.
     * 
     * @param opportunity__r
     */
    public void setOpportunity__r(com.sforce.soap.enterprise.sobject.Opportunity opportunity__r) {
        this.opportunity__r = opportunity__r;
    }


    /**
     * Gets the oracle_Bug_Number__c value for this _case.
     * 
     * @return oracle_Bug_Number__c
     */
    public java.lang.String getOracle_Bug_Number__c() {
        return oracle_Bug_Number__c;
    }


    /**
     * Sets the oracle_Bug_Number__c value for this _case.
     * 
     * @param oracle_Bug_Number__c
     */
    public void setOracle_Bug_Number__c(java.lang.String oracle_Bug_Number__c) {
        this.oracle_Bug_Number__c = oracle_Bug_Number__c;
    }


    /**
     * Gets the oracle_Status__c value for this _case.
     * 
     * @return oracle_Status__c
     */
    public java.lang.String getOracle_Status__c() {
        return oracle_Status__c;
    }


    /**
     * Sets the oracle_Status__c value for this _case.
     * 
     * @param oracle_Status__c
     */
    public void setOracle_Status__c(java.lang.String oracle_Status__c) {
        this.oracle_Status__c = oracle_Status__c;
    }


    /**
     * Gets the oracle_Ticket_Created_On__c value for this _case.
     * 
     * @return oracle_Ticket_Created_On__c
     */
    public java.util.Date getOracle_Ticket_Created_On__c() {
        return oracle_Ticket_Created_On__c;
    }


    /**
     * Sets the oracle_Ticket_Created_On__c value for this _case.
     * 
     * @param oracle_Ticket_Created_On__c
     */
    public void setOracle_Ticket_Created_On__c(java.util.Date oracle_Ticket_Created_On__c) {
        this.oracle_Ticket_Created_On__c = oracle_Ticket_Created_On__c;
    }


    /**
     * Gets the origin value for this _case.
     * 
     * @return origin
     */
    public java.lang.String getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this _case.
     * 
     * @param origin
     */
    public void setOrigin(java.lang.String origin) {
        this.origin = origin;
    }


    /**
     * Gets the original_Ticket__c value for this _case.
     * 
     * @return original_Ticket__c
     */
    public java.lang.String getOriginal_Ticket__c() {
        return original_Ticket__c;
    }


    /**
     * Sets the original_Ticket__c value for this _case.
     * 
     * @param original_Ticket__c
     */
    public void setOriginal_Ticket__c(java.lang.String original_Ticket__c) {
        this.original_Ticket__c = original_Ticket__c;
    }


    /**
     * Gets the other__c value for this _case.
     * 
     * @return other__c
     */
    public java.lang.Double getOther__c() {
        return other__c;
    }


    /**
     * Sets the other__c value for this _case.
     * 
     * @param other__c
     */
    public void setOther__c(java.lang.Double other__c) {
        this.other__c = other__c;
    }


    /**
     * Gets the outbound_Tracking_Number__c value for this _case.
     * 
     * @return outbound_Tracking_Number__c
     */
    public java.lang.String getOutbound_Tracking_Number__c() {
        return outbound_Tracking_Number__c;
    }


    /**
     * Sets the outbound_Tracking_Number__c value for this _case.
     * 
     * @param outbound_Tracking_Number__c
     */
    public void setOutbound_Tracking_Number__c(java.lang.String outbound_Tracking_Number__c) {
        this.outbound_Tracking_Number__c = outbound_Tracking_Number__c;
    }


    /**
     * Gets the overnight_SLA__c value for this _case.
     * 
     * @return overnight_SLA__c
     */
    public java.lang.String getOvernight_SLA__c() {
        return overnight_SLA__c;
    }


    /**
     * Sets the overnight_SLA__c value for this _case.
     * 
     * @param overnight_SLA__c
     */
    public void setOvernight_SLA__c(java.lang.String overnight_SLA__c) {
        this.overnight_SLA__c = overnight_SLA__c;
    }


    /**
     * Gets the override_Account_Validation__c value for this _case.
     * 
     * @return override_Account_Validation__c
     */
    public java.lang.Boolean getOverride_Account_Validation__c() {
        return override_Account_Validation__c;
    }


    /**
     * Sets the override_Account_Validation__c value for this _case.
     * 
     * @param override_Account_Validation__c
     */
    public void setOverride_Account_Validation__c(java.lang.Boolean override_Account_Validation__c) {
        this.override_Account_Validation__c = override_Account_Validation__c;
    }


    /**
     * Gets the owner value for this _case.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this _case.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this _case.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this _case.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the owner_Profile__c value for this _case.
     * 
     * @return owner_Profile__c
     */
    public java.lang.String getOwner_Profile__c() {
        return owner_Profile__c;
    }


    /**
     * Sets the owner_Profile__c value for this _case.
     * 
     * @param owner_Profile__c
     */
    public void setOwner_Profile__c(java.lang.String owner_Profile__c) {
        this.owner_Profile__c = owner_Profile__c;
    }


    /**
     * Gets the owner_Role__c value for this _case.
     * 
     * @return owner_Role__c
     */
    public java.lang.String getOwner_Role__c() {
        return owner_Role__c;
    }


    /**
     * Sets the owner_Role__c value for this _case.
     * 
     * @param owner_Role__c
     */
    public void setOwner_Role__c(java.lang.String owner_Role__c) {
        this.owner_Role__c = owner_Role__c;
    }


    /**
     * Gets the PS_Defect_Class__c value for this _case.
     * 
     * @return PS_Defect_Class__c
     */
    public java.lang.String getPS_Defect_Class__c() {
        return PS_Defect_Class__c;
    }


    /**
     * Sets the PS_Defect_Class__c value for this _case.
     * 
     * @param PS_Defect_Class__c
     */
    public void setPS_Defect_Class__c(java.lang.String PS_Defect_Class__c) {
        this.PS_Defect_Class__c = PS_Defect_Class__c;
    }


    /**
     * Gets the PS_QC_Comments__c value for this _case.
     * 
     * @return PS_QC_Comments__c
     */
    public java.lang.String getPS_QC_Comments__c() {
        return PS_QC_Comments__c;
    }


    /**
     * Sets the PS_QC_Comments__c value for this _case.
     * 
     * @param PS_QC_Comments__c
     */
    public void setPS_QC_Comments__c(java.lang.String PS_QC_Comments__c) {
        this.PS_QC_Comments__c = PS_QC_Comments__c;
    }


    /**
     * Gets the PS_QC_Status__c value for this _case.
     * 
     * @return PS_QC_Status__c
     */
    public java.lang.String getPS_QC_Status__c() {
        return PS_QC_Status__c;
    }


    /**
     * Sets the PS_QC_Status__c value for this _case.
     * 
     * @param PS_QC_Status__c
     */
    public void setPS_QC_Status__c(java.lang.String PS_QC_Status__c) {
        this.PS_QC_Status__c = PS_QC_Status__c;
    }


    /**
     * Gets the parent value for this _case.
     * 
     * @return parent
     */
    public com.sforce.soap.enterprise.sobject._case getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this _case.
     * 
     * @param parent
     */
    public void setParent(com.sforce.soap.enterprise.sobject._case parent) {
        this.parent = parent;
    }


    /**
     * Gets the parentId value for this _case.
     * 
     * @return parentId
     */
    public java.lang.String getParentId() {
        return parentId;
    }


    /**
     * Sets the parentId value for this _case.
     * 
     * @param parentId
     */
    public void setParentId(java.lang.String parentId) {
        this.parentId = parentId;
    }


    /**
     * Gets the partner_Kickoffs__r value for this _case.
     * 
     * @return partner_Kickoffs__r
     */
    public com.sforce.soap.enterprise.QueryResult getPartner_Kickoffs__r() {
        return partner_Kickoffs__r;
    }


    /**
     * Sets the partner_Kickoffs__r value for this _case.
     * 
     * @param partner_Kickoffs__r
     */
    public void setPartner_Kickoffs__r(com.sforce.soap.enterprise.QueryResult partner_Kickoffs__r) {
        this.partner_Kickoffs__r = partner_Kickoffs__r;
    }


    /**
     * Gets the patch_Number__c value for this _case.
     * 
     * @return patch_Number__c
     */
    public java.lang.String getPatch_Number__c() {
        return patch_Number__c;
    }


    /**
     * Sets the patch_Number__c value for this _case.
     * 
     * @param patch_Number__c
     */
    public void setPatch_Number__c(java.lang.String patch_Number__c) {
        this.patch_Number__c = patch_Number__c;
    }


    /**
     * Gets the person_Returned_To__c value for this _case.
     * 
     * @return person_Returned_To__c
     */
    public java.lang.String getPerson_Returned_To__c() {
        return person_Returned_To__c;
    }


    /**
     * Sets the person_Returned_To__c value for this _case.
     * 
     * @param person_Returned_To__c
     */
    public void setPerson_Returned_To__c(java.lang.String person_Returned_To__c) {
        this.person_Returned_To__c = person_Returned_To__c;
    }


    /**
     * Gets the person_Returned_To__r value for this _case.
     * 
     * @return person_Returned_To__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getPerson_Returned_To__r() {
        return person_Returned_To__r;
    }


    /**
     * Sets the person_Returned_To__r value for this _case.
     * 
     * @param person_Returned_To__r
     */
    public void setPerson_Returned_To__r(com.sforce.soap.enterprise.sobject.Contact person_Returned_To__r) {
        this.person_Returned_To__r = person_Returned_To__r;
    }


    /**
     * Gets the person_Who_Shipped__c value for this _case.
     * 
     * @return person_Who_Shipped__c
     */
    public java.lang.String getPerson_Who_Shipped__c() {
        return person_Who_Shipped__c;
    }


    /**
     * Sets the person_Who_Shipped__c value for this _case.
     * 
     * @param person_Who_Shipped__c
     */
    public void setPerson_Who_Shipped__c(java.lang.String person_Who_Shipped__c) {
        this.person_Who_Shipped__c = person_Who_Shipped__c;
    }


    /**
     * Gets the person_Who_Shipped__r value for this _case.
     * 
     * @return person_Who_Shipped__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getPerson_Who_Shipped__r() {
        return person_Who_Shipped__r;
    }


    /**
     * Sets the person_Who_Shipped__r value for this _case.
     * 
     * @param person_Who_Shipped__r
     */
    public void setPerson_Who_Shipped__r(com.sforce.soap.enterprise.sobject.Contact person_Who_Shipped__r) {
        this.person_Who_Shipped__r = person_Who_Shipped__r;
    }


    /**
     * Gets the planned_File_Location__c value for this _case.
     * 
     * @return planned_File_Location__c
     */
    public java.lang.String getPlanned_File_Location__c() {
        return planned_File_Location__c;
    }


    /**
     * Sets the planned_File_Location__c value for this _case.
     * 
     * @param planned_File_Location__c
     */
    public void setPlanned_File_Location__c(java.lang.String planned_File_Location__c) {
        this.planned_File_Location__c = planned_File_Location__c;
    }


    /**
     * Gets the pod_Account__c value for this _case.
     * 
     * @return pod_Account__c
     */
    public java.lang.String getPod_Account__c() {
        return pod_Account__c;
    }


    /**
     * Sets the pod_Account__c value for this _case.
     * 
     * @param pod_Account__c
     */
    public void setPod_Account__c(java.lang.String pod_Account__c) {
        this.pod_Account__c = pod_Account__c;
    }


    /**
     * Gets the pod_User__c value for this _case.
     * 
     * @return pod_User__c
     */
    public java.lang.String getPod_User__c() {
        return pod_User__c;
    }


    /**
     * Sets the pod_User__c value for this _case.
     * 
     * @param pod_User__c
     */
    public void setPod_User__c(java.lang.String pod_User__c) {
        this.pod_User__c = pod_User__c;
    }


    /**
     * Gets the pod__c value for this _case.
     * 
     * @return pod__c
     */
    public java.lang.String getPod__c() {
        return pod__c;
    }


    /**
     * Sets the pod__c value for this _case.
     * 
     * @param pod__c
     */
    public void setPod__c(java.lang.String pod__c) {
        this.pod__c = pod__c;
    }


    /**
     * Gets the price_Per_User_2__c value for this _case.
     * 
     * @return price_Per_User_2__c
     */
    public java.lang.String getPrice_Per_User_2__c() {
        return price_Per_User_2__c;
    }


    /**
     * Sets the price_Per_User_2__c value for this _case.
     * 
     * @param price_Per_User_2__c
     */
    public void setPrice_Per_User_2__c(java.lang.String price_Per_User_2__c) {
        this.price_Per_User_2__c = price_Per_User_2__c;
    }


    /**
     * Gets the price_per_gb__c value for this _case.
     * 
     * @return price_per_gb__c
     */
    public java.lang.String getPrice_per_gb__c() {
        return price_per_gb__c;
    }


    /**
     * Sets the price_per_gb__c value for this _case.
     * 
     * @param price_per_gb__c
     */
    public void setPrice_per_gb__c(java.lang.String price_per_gb__c) {
        this.price_per_gb__c = price_per_gb__c;
    }


    /**
     * Gets the pricing_Schedule__c value for this _case.
     * 
     * @return pricing_Schedule__c
     */
    public java.lang.String getPricing_Schedule__c() {
        return pricing_Schedule__c;
    }


    /**
     * Sets the pricing_Schedule__c value for this _case.
     * 
     * @param pricing_Schedule__c
     */
    public void setPricing_Schedule__c(java.lang.String pricing_Schedule__c) {
        this.pricing_Schedule__c = pricing_Schedule__c;
    }


    /**
     * Gets the priority value for this _case.
     * 
     * @return priority
     */
    public java.lang.String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this _case.
     * 
     * @param priority
     */
    public void setPriority(java.lang.String priority) {
        this.priority = priority;
    }


    /**
     * Gets the problem_Management_Flag__c value for this _case.
     * 
     * @return problem_Management_Flag__c
     */
    public java.lang.Boolean getProblem_Management_Flag__c() {
        return problem_Management_Flag__c;
    }


    /**
     * Sets the problem_Management_Flag__c value for this _case.
     * 
     * @param problem_Management_Flag__c
     */
    public void setProblem_Management_Flag__c(java.lang.Boolean problem_Management_Flag__c) {
        this.problem_Management_Flag__c = problem_Management_Flag__c;
    }


    /**
     * Gets the problem_Mgmt_Ticket__c value for this _case.
     * 
     * @return problem_Mgmt_Ticket__c
     */
    public java.lang.String getProblem_Mgmt_Ticket__c() {
        return problem_Mgmt_Ticket__c;
    }


    /**
     * Sets the problem_Mgmt_Ticket__c value for this _case.
     * 
     * @param problem_Mgmt_Ticket__c
     */
    public void setProblem_Mgmt_Ticket__c(java.lang.String problem_Mgmt_Ticket__c) {
        this.problem_Mgmt_Ticket__c = problem_Mgmt_Ticket__c;
    }


    /**
     * Gets the problem_Mgmt_Ticket__r value for this _case.
     * 
     * @return problem_Mgmt_Ticket__r
     */
    public com.sforce.soap.enterprise.sobject._case getProblem_Mgmt_Ticket__r() {
        return problem_Mgmt_Ticket__r;
    }


    /**
     * Sets the problem_Mgmt_Ticket__r value for this _case.
     * 
     * @param problem_Mgmt_Ticket__r
     */
    public void setProblem_Mgmt_Ticket__r(com.sforce.soap.enterprise.sobject._case problem_Mgmt_Ticket__r) {
        this.problem_Mgmt_Ticket__r = problem_Mgmt_Ticket__r;
    }


    /**
     * Gets the processInstances value for this _case.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this _case.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this _case.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this _case.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the product_Application__c value for this _case.
     * 
     * @return product_Application__c
     */
    public java.lang.String getProduct_Application__c() {
        return product_Application__c;
    }


    /**
     * Sets the product_Application__c value for this _case.
     * 
     * @param product_Application__c
     */
    public void setProduct_Application__c(java.lang.String product_Application__c) {
        this.product_Application__c = product_Application__c;
    }


    /**
     * Gets the product__c value for this _case.
     * 
     * @return product__c
     */
    public java.lang.String getProduct__c() {
        return product__c;
    }


    /**
     * Sets the product__c value for this _case.
     * 
     * @param product__c
     */
    public void setProduct__c(java.lang.String product__c) {
        this.product__c = product__c;
    }


    /**
     * Gets the project_Phase__c value for this _case.
     * 
     * @return project_Phase__c
     */
    public java.lang.String getProject_Phase__c() {
        return project_Phase__c;
    }


    /**
     * Sets the project_Phase__c value for this _case.
     * 
     * @param project_Phase__c
     */
    public void setProject_Phase__c(java.lang.String project_Phase__c) {
        this.project_Phase__c = project_Phase__c;
    }


    /**
     * Gets the proposal_Approved__c value for this _case.
     * 
     * @return proposal_Approved__c
     */
    public java.lang.Boolean getProposal_Approved__c() {
        return proposal_Approved__c;
    }


    /**
     * Sets the proposal_Approved__c value for this _case.
     * 
     * @param proposal_Approved__c
     */
    public void setProposal_Approved__c(java.lang.Boolean proposal_Approved__c) {
        this.proposal_Approved__c = proposal_Approved__c;
    }


    /**
     * Gets the QC_Comments__c value for this _case.
     * 
     * @return QC_Comments__c
     */
    public java.lang.String getQC_Comments__c() {
        return QC_Comments__c;
    }


    /**
     * Sets the QC_Comments__c value for this _case.
     * 
     * @param QC_Comments__c
     */
    public void setQC_Comments__c(java.lang.String QC_Comments__c) {
        this.QC_Comments__c = QC_Comments__c;
    }


    /**
     * Gets the QC_Date__c value for this _case.
     * 
     * @return QC_Date__c
     */
    public java.util.Calendar getQC_Date__c() {
        return QC_Date__c;
    }


    /**
     * Sets the QC_Date__c value for this _case.
     * 
     * @param QC_Date__c
     */
    public void setQC_Date__c(java.util.Calendar QC_Date__c) {
        this.QC_Date__c = QC_Date__c;
    }


    /**
     * Gets the QC_Person__c value for this _case.
     * 
     * @return QC_Person__c
     */
    public java.lang.String getQC_Person__c() {
        return QC_Person__c;
    }


    /**
     * Sets the QC_Person__c value for this _case.
     * 
     * @param QC_Person__c
     */
    public void setQC_Person__c(java.lang.String QC_Person__c) {
        this.QC_Person__c = QC_Person__c;
    }


    /**
     * Gets the QC_Person__r value for this _case.
     * 
     * @return QC_Person__r
     */
    public com.sforce.soap.enterprise.sobject.User getQC_Person__r() {
        return QC_Person__r;
    }


    /**
     * Sets the QC_Person__r value for this _case.
     * 
     * @param QC_Person__r
     */
    public void setQC_Person__r(com.sforce.soap.enterprise.sobject.User QC_Person__r) {
        this.QC_Person__r = QC_Person__r;
    }


    /**
     * Gets the QC_Status__c value for this _case.
     * 
     * @return QC_Status__c
     */
    public java.lang.String getQC_Status__c() {
        return QC_Status__c;
    }


    /**
     * Sets the QC_Status__c value for this _case.
     * 
     * @param QC_Status__c
     */
    public void setQC_Status__c(java.lang.String QC_Status__c) {
        this.QC_Status__c = QC_Status__c;
    }


    /**
     * Gets the question value for this _case.
     * 
     * @return question
     */
    public com.sforce.soap.enterprise.sobject.Question getQuestion() {
        return question;
    }


    /**
     * Sets the question value for this _case.
     * 
     * @param question
     */
    public void setQuestion(com.sforce.soap.enterprise.sobject.Question question) {
        this.question = question;
    }


    /**
     * Gets the questionId value for this _case.
     * 
     * @return questionId
     */
    public java.lang.String getQuestionId() {
        return questionId;
    }


    /**
     * Sets the questionId value for this _case.
     * 
     * @param questionId
     */
    public void setQuestionId(java.lang.String questionId) {
        this.questionId = questionId;
    }


    /**
     * Gets the quick_Guide__c value for this _case.
     * 
     * @return quick_Guide__c
     */
    public java.lang.Double getQuick_Guide__c() {
        return quick_Guide__c;
    }


    /**
     * Sets the quick_Guide__c value for this _case.
     * 
     * @param quick_Guide__c
     */
    public void setQuick_Guide__c(java.lang.Double quick_Guide__c) {
        this.quick_Guide__c = quick_Guide__c;
    }


    /**
     * Gets the RCA_Certified_Date__c value for this _case.
     * 
     * @return RCA_Certified_Date__c
     */
    public java.util.Date getRCA_Certified_Date__c() {
        return RCA_Certified_Date__c;
    }


    /**
     * Sets the RCA_Certified_Date__c value for this _case.
     * 
     * @param RCA_Certified_Date__c
     */
    public void setRCA_Certified_Date__c(java.util.Date RCA_Certified_Date__c) {
        this.RCA_Certified_Date__c = RCA_Certified_Date__c;
    }


    /**
     * Gets the random_Sample__c value for this _case.
     * 
     * @return random_Sample__c
     */
    public java.lang.Double getRandom_Sample__c() {
        return random_Sample__c;
    }


    /**
     * Sets the random_Sample__c value for this _case.
     * 
     * @param random_Sample__c
     */
    public void setRandom_Sample__c(java.lang.Double random_Sample__c) {
        this.random_Sample__c = random_Sample__c;
    }


    /**
     * Gets the re_Work_From_Prior_Ticket__c value for this _case.
     * 
     * @return re_Work_From_Prior_Ticket__c
     */
    public java.lang.Boolean getRe_Work_From_Prior_Ticket__c() {
        return re_Work_From_Prior_Ticket__c;
    }


    /**
     * Sets the re_Work_From_Prior_Ticket__c value for this _case.
     * 
     * @param re_Work_From_Prior_Ticket__c
     */
    public void setRe_Work_From_Prior_Ticket__c(java.lang.Boolean re_Work_From_Prior_Ticket__c) {
        this.re_Work_From_Prior_Ticket__c = re_Work_From_Prior_Ticket__c;
    }


    /**
     * Gets the reason_for_No_Survey__c value for this _case.
     * 
     * @return reason_for_No_Survey__c
     */
    public java.lang.String getReason_for_No_Survey__c() {
        return reason_for_No_Survey__c;
    }


    /**
     * Sets the reason_for_No_Survey__c value for this _case.
     * 
     * @param reason_for_No_Survey__c
     */
    public void setReason_for_No_Survey__c(java.lang.String reason_for_No_Survey__c) {
        this.reason_for_No_Survey__c = reason_for_No_Survey__c;
    }


    /**
     * Gets the recommended_Upgrade__c value for this _case.
     * 
     * @return recommended_Upgrade__c
     */
    public java.lang.Boolean getRecommended_Upgrade__c() {
        return recommended_Upgrade__c;
    }


    /**
     * Sets the recommended_Upgrade__c value for this _case.
     * 
     * @param recommended_Upgrade__c
     */
    public void setRecommended_Upgrade__c(java.lang.Boolean recommended_Upgrade__c) {
        this.recommended_Upgrade__c = recommended_Upgrade__c;
    }


    /**
     * Gets the recordType value for this _case.
     * 
     * @return recordType
     */
    public com.sforce.soap.enterprise.sobject.RecordType getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this _case.
     * 
     * @param recordType
     */
    public void setRecordType(com.sforce.soap.enterprise.sobject.RecordType recordType) {
        this.recordType = recordType;
    }


    /**
     * Gets the recordTypeId value for this _case.
     * 
     * @return recordTypeId
     */
    public java.lang.String getRecordTypeId() {
        return recordTypeId;
    }


    /**
     * Sets the recordTypeId value for this _case.
     * 
     * @param recordTypeId
     */
    public void setRecordTypeId(java.lang.String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }


    /**
     * Gets the relAn_Date_Verified__c value for this _case.
     * 
     * @return relAn_Date_Verified__c
     */
    public java.util.Calendar getRelAn_Date_Verified__c() {
        return relAn_Date_Verified__c;
    }


    /**
     * Sets the relAn_Date_Verified__c value for this _case.
     * 
     * @param relAn_Date_Verified__c
     */
    public void setRelAn_Date_Verified__c(java.util.Calendar relAn_Date_Verified__c) {
        this.relAn_Date_Verified__c = relAn_Date_Verified__c;
    }


    /**
     * Gets the relAn_Drive_Name__c value for this _case.
     * 
     * @return relAn_Drive_Name__c
     */
    public java.lang.String getRelAn_Drive_Name__c() {
        return relAn_Drive_Name__c;
    }


    /**
     * Sets the relAn_Drive_Name__c value for this _case.
     * 
     * @param relAn_Drive_Name__c
     */
    public void setRelAn_Drive_Name__c(java.lang.String relAn_Drive_Name__c) {
        this.relAn_Drive_Name__c = relAn_Drive_Name__c;
    }


    /**
     * Gets the relativity_Case__c value for this _case.
     * 
     * @return relativity_Case__c
     */
    public java.lang.String getRelativity_Case__c() {
        return relativity_Case__c;
    }


    /**
     * Sets the relativity_Case__c value for this _case.
     * 
     * @param relativity_Case__c
     */
    public void setRelativity_Case__c(java.lang.String relativity_Case__c) {
        this.relativity_Case__c = relativity_Case__c;
    }


    /**
     * Gets the relativity_Case__r value for this _case.
     * 
     * @return relativity_Case__r
     */
    public com.sforce.soap.enterprise.sobject.Relativity_Case__c getRelativity_Case__r() {
        return relativity_Case__r;
    }


    /**
     * Sets the relativity_Case__r value for this _case.
     * 
     * @param relativity_Case__r
     */
    public void setRelativity_Case__r(com.sforce.soap.enterprise.sobject.Relativity_Case__c relativity_Case__r) {
        this.relativity_Case__r = relativity_Case__r;
    }


    /**
     * Gets the relativity_Version_Fixed__c value for this _case.
     * 
     * @return relativity_Version_Fixed__c
     */
    public java.lang.String getRelativity_Version_Fixed__c() {
        return relativity_Version_Fixed__c;
    }


    /**
     * Sets the relativity_Version_Fixed__c value for this _case.
     * 
     * @param relativity_Version_Fixed__c
     */
    public void setRelativity_Version_Fixed__c(java.lang.String relativity_Version_Fixed__c) {
        this.relativity_Version_Fixed__c = relativity_Version_Fixed__c;
    }


    /**
     * Gets the relativity_Version_Fixed__r value for this _case.
     * 
     * @return relativity_Version_Fixed__r
     */
    public com.sforce.soap.enterprise.sobject.Release__c getRelativity_Version_Fixed__r() {
        return relativity_Version_Fixed__r;
    }


    /**
     * Sets the relativity_Version_Fixed__r value for this _case.
     * 
     * @param relativity_Version_Fixed__r
     */
    public void setRelativity_Version_Fixed__r(com.sforce.soap.enterprise.sobject.Release__c relativity_Version_Fixed__r) {
        this.relativity_Version_Fixed__r = relativity_Version_Fixed__r;
    }


    /**
     * Gets the relativity_Version__c value for this _case.
     * 
     * @return relativity_Version__c
     */
    public java.lang.String getRelativity_Version__c() {
        return relativity_Version__c;
    }


    /**
     * Sets the relativity_Version__c value for this _case.
     * 
     * @param relativity_Version__c
     */
    public void setRelativity_Version__c(java.lang.String relativity_Version__c) {
        this.relativity_Version__c = relativity_Version__c;
    }


    /**
     * Gets the release_Verified__c value for this _case.
     * 
     * @return release_Verified__c
     */
    public java.lang.Boolean getRelease_Verified__c() {
        return release_Verified__c;
    }


    /**
     * Sets the release_Verified__c value for this _case.
     * 
     * @param release_Verified__c
     */
    public void setRelease_Verified__c(java.lang.Boolean release_Verified__c) {
        this.release_Verified__c = release_Verified__c;
    }


    /**
     * Gets the release__c value for this _case.
     * 
     * @return release__c
     */
    public java.lang.String getRelease__c() {
        return release__c;
    }


    /**
     * Sets the release__c value for this _case.
     * 
     * @param release__c
     */
    public void setRelease__c(java.lang.String release__c) {
        this.release__c = release__c;
    }


    /**
     * Gets the release__r value for this _case.
     * 
     * @return release__r
     */
    public com.sforce.soap.enterprise.sobject.Release__c getRelease__r() {
        return release__r;
    }


    /**
     * Sets the release__r value for this _case.
     * 
     * @param release__r
     */
    public void setRelease__r(com.sforce.soap.enterprise.sobject.Release__c release__r) {
        this.release__r = release__r;
    }


    /**
     * Gets the report_Details__c value for this _case.
     * 
     * @return report_Details__c
     */
    public java.lang.String getReport_Details__c() {
        return report_Details__c;
    }


    /**
     * Sets the report_Details__c value for this _case.
     * 
     * @param report_Details__c
     */
    public void setReport_Details__c(java.lang.String report_Details__c) {
        this.report_Details__c = report_Details__c;
    }


    /**
     * Gets the request_Type__c value for this _case.
     * 
     * @return request_Type__c
     */
    public java.lang.String getRequest_Type__c() {
        return request_Type__c;
    }


    /**
     * Sets the request_Type__c value for this _case.
     * 
     * @param request_Type__c
     */
    public void setRequest_Type__c(java.lang.String request_Type__c) {
        this.request_Type__c = request_Type__c;
    }


    /**
     * Gets the requested_Due_Date__c value for this _case.
     * 
     * @return requested_Due_Date__c
     */
    public java.util.Date getRequested_Due_Date__c() {
        return requested_Due_Date__c;
    }


    /**
     * Sets the requested_Due_Date__c value for this _case.
     * 
     * @param requested_Due_Date__c
     */
    public void setRequested_Due_Date__c(java.util.Date requested_Due_Date__c) {
        this.requested_Due_Date__c = requested_Due_Date__c;
    }


    /**
     * Gets the research__c value for this _case.
     * 
     * @return research__c
     */
    public java.lang.Double getResearch__c() {
        return research__c;
    }


    /**
     * Sets the research__c value for this _case.
     * 
     * @param research__c
     */
    public void setResearch__c(java.lang.Double research__c) {
        this.research__c = research__c;
    }


    /**
     * Gets the retail_Box_Incuded__c value for this _case.
     * 
     * @return retail_Box_Incuded__c
     */
    public java.lang.Boolean getRetail_Box_Incuded__c() {
        return retail_Box_Incuded__c;
    }


    /**
     * Sets the retail_Box_Incuded__c value for this _case.
     * 
     * @param retail_Box_Incuded__c
     */
    public void setRetail_Box_Incuded__c(java.lang.Boolean retail_Box_Incuded__c) {
        this.retail_Box_Incuded__c = retail_Box_Incuded__c;
    }


    /**
     * Gets the return_with_Origninal_Shipping_Container__c value for this _case.
     * 
     * @return return_with_Origninal_Shipping_Container__c
     */
    public java.lang.Boolean getReturn_with_Origninal_Shipping_Container__c() {
        return return_with_Origninal_Shipping_Container__c;
    }


    /**
     * Sets the return_with_Origninal_Shipping_Container__c value for this _case.
     * 
     * @param return_with_Origninal_Shipping_Container__c
     */
    public void setReturn_with_Origninal_Shipping_Container__c(java.lang.Boolean return_with_Origninal_Shipping_Container__c) {
        this.return_with_Origninal_Shipping_Container__c = return_with_Origninal_Shipping_Container__c;
    }


    /**
     * Gets the review_for_KCD_By__c value for this _case.
     * 
     * @return review_for_KCD_By__c
     */
    public java.lang.String getReview_for_KCD_By__c() {
        return review_for_KCD_By__c;
    }


    /**
     * Sets the review_for_KCD_By__c value for this _case.
     * 
     * @param review_for_KCD_By__c
     */
    public void setReview_for_KCD_By__c(java.lang.String review_for_KCD_By__c) {
        this.review_for_KCD_By__c = review_for_KCD_By__c;
    }


    /**
     * Gets the review_for_KCD_Ticket__c value for this _case.
     * 
     * @return review_for_KCD_Ticket__c
     */
    public java.lang.Boolean getReview_for_KCD_Ticket__c() {
        return review_for_KCD_Ticket__c;
    }


    /**
     * Sets the review_for_KCD_Ticket__c value for this _case.
     * 
     * @param review_for_KCD_Ticket__c
     */
    public void setReview_for_KCD_Ticket__c(java.lang.Boolean review_for_KCD_Ticket__c) {
        this.review_for_KCD_Ticket__c = review_for_KCD_Ticket__c;
    }


    /**
     * Gets the root_Cause_Description__c value for this _case.
     * 
     * @return root_Cause_Description__c
     */
    public java.lang.String getRoot_Cause_Description__c() {
        return root_Cause_Description__c;
    }


    /**
     * Sets the root_Cause_Description__c value for this _case.
     * 
     * @param root_Cause_Description__c
     */
    public void setRoot_Cause_Description__c(java.lang.String root_Cause_Description__c) {
        this.root_Cause_Description__c = root_Cause_Description__c;
    }


    /**
     * Gets the root_Cause_Sub__c value for this _case.
     * 
     * @return root_Cause_Sub__c
     */
    public java.lang.String getRoot_Cause_Sub__c() {
        return root_Cause_Sub__c;
    }


    /**
     * Sets the root_Cause_Sub__c value for this _case.
     * 
     * @param root_Cause_Sub__c
     */
    public void setRoot_Cause_Sub__c(java.lang.String root_Cause_Sub__c) {
        this.root_Cause_Sub__c = root_Cause_Sub__c;
    }


    /**
     * Gets the root_Cause__c value for this _case.
     * 
     * @return root_Cause__c
     */
    public java.lang.String getRoot_Cause__c() {
        return root_Cause__c;
    }


    /**
     * Sets the root_Cause__c value for this _case.
     * 
     * @param root_Cause__c
     */
    public void setRoot_Cause__c(java.lang.String root_Cause__c) {
        this.root_Cause__c = root_Cause__c;
    }


    /**
     * Gets the SFDC_Projects__r value for this _case.
     * 
     * @return SFDC_Projects__r
     */
    public com.sforce.soap.enterprise.QueryResult getSFDC_Projects__r() {
        return SFDC_Projects__r;
    }


    /**
     * Sets the SFDC_Projects__r value for this _case.
     * 
     * @param SFDC_Projects__r
     */
    public void setSFDC_Projects__r(com.sforce.soap.enterprise.QueryResult SFDC_Projects__r) {
        this.SFDC_Projects__r = SFDC_Projects__r;
    }


    /**
     * Gets the SLA_Exceeded__c value for this _case.
     * 
     * @return SLA_Exceeded__c
     */
    public java.lang.Boolean getSLA_Exceeded__c() {
        return SLA_Exceeded__c;
    }


    /**
     * Sets the SLA_Exceeded__c value for this _case.
     * 
     * @param SLA_Exceeded__c
     */
    public void setSLA_Exceeded__c(java.lang.Boolean SLA_Exceeded__c) {
        this.SLA_Exceeded__c = SLA_Exceeded__c;
    }


    /**
     * Gets the SLA_Missed_By__c value for this _case.
     * 
     * @return SLA_Missed_By__c
     */
    public java.lang.String getSLA_Missed_By__c() {
        return SLA_Missed_By__c;
    }


    /**
     * Sets the SLA_Missed_By__c value for this _case.
     * 
     * @param SLA_Missed_By__c
     */
    public void setSLA_Missed_By__c(java.lang.String SLA_Missed_By__c) {
        this.SLA_Missed_By__c = SLA_Missed_By__c;
    }


    /**
     * Gets the SLA_Response_Deadline__c value for this _case.
     * 
     * @return SLA_Response_Deadline__c
     */
    public java.util.Calendar getSLA_Response_Deadline__c() {
        return SLA_Response_Deadline__c;
    }


    /**
     * Sets the SLA_Response_Deadline__c value for this _case.
     * 
     * @param SLA_Response_Deadline__c
     */
    public void setSLA_Response_Deadline__c(java.util.Calendar SLA_Response_Deadline__c) {
        this.SLA_Response_Deadline__c = SLA_Response_Deadline__c;
    }


    /**
     * Gets the SLA_Response_Time__c value for this _case.
     * 
     * @return SLA_Response_Time__c
     */
    public java.lang.Double getSLA_Response_Time__c() {
        return SLA_Response_Time__c;
    }


    /**
     * Sets the SLA_Response_Time__c value for this _case.
     * 
     * @param SLA_Response_Time__c
     */
    public void setSLA_Response_Time__c(java.lang.Double SLA_Response_Time__c) {
        this.SLA_Response_Time__c = SLA_Response_Time__c;
    }


    /**
     * Gets the SR_Number__c value for this _case.
     * 
     * @return SR_Number__c
     */
    public java.lang.String getSR_Number__c() {
        return SR_Number__c;
    }


    /**
     * Sets the SR_Number__c value for this _case.
     * 
     * @param SR_Number__c
     */
    public void setSR_Number__c(java.lang.String SR_Number__c) {
        this.SR_Number__c = SR_Number__c;
    }


    /**
     * Gets the sales_Queue_Ownership__c value for this _case.
     * 
     * @return sales_Queue_Ownership__c
     */
    public java.lang.Boolean getSales_Queue_Ownership__c() {
        return sales_Queue_Ownership__c;
    }


    /**
     * Sets the sales_Queue_Ownership__c value for this _case.
     * 
     * @param sales_Queue_Ownership__c
     */
    public void setSales_Queue_Ownership__c(java.lang.Boolean sales_Queue_Ownership__c) {
        this.sales_Queue_Ownership__c = sales_Queue_Ownership__c;
    }


    /**
     * Gets the sales_Queue__c value for this _case.
     * 
     * @return sales_Queue__c
     */
    public java.lang.String getSales_Queue__c() {
        return sales_Queue__c;
    }


    /**
     * Sets the sales_Queue__c value for this _case.
     * 
     * @param sales_Queue__c
     */
    public void setSales_Queue__c(java.lang.String sales_Queue__c) {
        this.sales_Queue__c = sales_Queue__c;
    }


    /**
     * Gets the sales_Type_Sub__c value for this _case.
     * 
     * @return sales_Type_Sub__c
     */
    public java.lang.String getSales_Type_Sub__c() {
        return sales_Type_Sub__c;
    }


    /**
     * Sets the sales_Type_Sub__c value for this _case.
     * 
     * @param sales_Type_Sub__c
     */
    public void setSales_Type_Sub__c(java.lang.String sales_Type_Sub__c) {
        this.sales_Type_Sub__c = sales_Type_Sub__c;
    }


    /**
     * Gets the sales_Type__c value for this _case.
     * 
     * @return sales_Type__c
     */
    public java.lang.String getSales_Type__c() {
        return sales_Type__c;
    }


    /**
     * Sets the sales_Type__c value for this _case.
     * 
     * @param sales_Type__c
     */
    public void setSales_Type__c(java.lang.String sales_Type__c) {
        this.sales_Type__c = sales_Type__c;
    }


    /**
     * Gets the scheduled__c value for this _case.
     * 
     * @return scheduled__c
     */
    public java.util.Calendar getScheduled__c() {
        return scheduled__c;
    }


    /**
     * Sets the scheduled__c value for this _case.
     * 
     * @param scheduled__c
     */
    public void setScheduled__c(java.util.Calendar scheduled__c) {
        this.scheduled__c = scheduled__c;
    }


    /**
     * Gets the school_Program__c value for this _case.
     * 
     * @return school_Program__c
     */
    public java.lang.Double getSchool_Program__c() {
        return school_Program__c;
    }


    /**
     * Sets the school_Program__c value for this _case.
     * 
     * @param school_Program__c
     */
    public void setSchool_Program__c(java.lang.Double school_Program__c) {
        this.school_Program__c = school_Program__c;
    }


    /**
     * Gets the send_Email_Survey__c value for this _case.
     * 
     * @return send_Email_Survey__c
     */
    public java.lang.Boolean getSend_Email_Survey__c() {
        return send_Email_Survey__c;
    }


    /**
     * Sets the send_Email_Survey__c value for this _case.
     * 
     * @param send_Email_Survey__c
     */
    public void setSend_Email_Survey__c(java.lang.Boolean send_Email_Survey__c) {
        this.send_Email_Survey__c = send_Email_Survey__c;
    }


    /**
     * Gets the serial_Number__c value for this _case.
     * 
     * @return serial_Number__c
     */
    public java.lang.String getSerial_Number__c() {
        return serial_Number__c;
    }


    /**
     * Sets the serial_Number__c value for this _case.
     * 
     * @param serial_Number__c
     */
    public void setSerial_Number__c(java.lang.String serial_Number__c) {
        this.serial_Number__c = serial_Number__c;
    }


    /**
     * Gets the server_Application__c value for this _case.
     * 
     * @return server_Application__c
     */
    public java.lang.String getServer_Application__c() {
        return server_Application__c;
    }


    /**
     * Sets the server_Application__c value for this _case.
     * 
     * @param server_Application__c
     */
    public void setServer_Application__c(java.lang.String server_Application__c) {
        this.server_Application__c = server_Application__c;
    }


    /**
     * Gets the server_OS__c value for this _case.
     * 
     * @return server_OS__c
     */
    public java.lang.String getServer_OS__c() {
        return server_OS__c;
    }


    /**
     * Sets the server_OS__c value for this _case.
     * 
     * @param server_OS__c
     */
    public void setServer_OS__c(java.lang.String server_OS__c) {
        this.server_OS__c = server_OS__c;
    }


    /**
     * Gets the shares value for this _case.
     * 
     * @return shares
     */
    public com.sforce.soap.enterprise.QueryResult getShares() {
        return shares;
    }


    /**
     * Sets the shares value for this _case.
     * 
     * @param shares
     */
    public void setShares(com.sforce.soap.enterprise.QueryResult shares) {
        this.shares = shares;
    }


    /**
     * Gets the shipped_Date__c value for this _case.
     * 
     * @return shipped_Date__c
     */
    public java.util.Date getShipped_Date__c() {
        return shipped_Date__c;
    }


    /**
     * Sets the shipped_Date__c value for this _case.
     * 
     * @param shipped_Date__c
     */
    public void setShipped_Date__c(java.util.Date shipped_Date__c) {
        this.shipped_Date__c = shipped_Date__c;
    }


    /**
     * Gets the short_Term_Actual_Date__c value for this _case.
     * 
     * @return short_Term_Actual_Date__c
     */
    public java.util.Date getShort_Term_Actual_Date__c() {
        return short_Term_Actual_Date__c;
    }


    /**
     * Sets the short_Term_Actual_Date__c value for this _case.
     * 
     * @param short_Term_Actual_Date__c
     */
    public void setShort_Term_Actual_Date__c(java.util.Date short_Term_Actual_Date__c) {
        this.short_Term_Actual_Date__c = short_Term_Actual_Date__c;
    }


    /**
     * Gets the short_Term_Corrective_Action__c value for this _case.
     * 
     * @return short_Term_Corrective_Action__c
     */
    public java.lang.String getShort_Term_Corrective_Action__c() {
        return short_Term_Corrective_Action__c;
    }


    /**
     * Sets the short_Term_Corrective_Action__c value for this _case.
     * 
     * @param short_Term_Corrective_Action__c
     */
    public void setShort_Term_Corrective_Action__c(java.lang.String short_Term_Corrective_Action__c) {
        this.short_Term_Corrective_Action__c = short_Term_Corrective_Action__c;
    }


    /**
     * Gets the short_Term_Scheduled_Date__c value for this _case.
     * 
     * @return short_Term_Scheduled_Date__c
     */
    public java.util.Date getShort_Term_Scheduled_Date__c() {
        return short_Term_Scheduled_Date__c;
    }


    /**
     * Sets the short_Term_Scheduled_Date__c value for this _case.
     * 
     * @param short_Term_Scheduled_Date__c
     */
    public void setShort_Term_Scheduled_Date__c(java.util.Date short_Term_Scheduled_Date__c) {
        this.short_Term_Scheduled_Date__c = short_Term_Scheduled_Date__c;
    }


    /**
     * Gets the signature__c value for this _case.
     * 
     * @return signature__c
     */
    public java.lang.String getSignature__c() {
        return signature__c;
    }


    /**
     * Sets the signature__c value for this _case.
     * 
     * @param signature__c
     */
    public void setSignature__c(java.lang.String signature__c) {
        this.signature__c = signature__c;
    }


    /**
     * Gets the simple_Template__c value for this _case.
     * 
     * @return simple_Template__c
     */
    public java.lang.Boolean getSimple_Template__c() {
        return simple_Template__c;
    }


    /**
     * Sets the simple_Template__c value for this _case.
     * 
     * @param simple_Template__c
     */
    public void setSimple_Template__c(java.lang.Boolean simple_Template__c) {
        this.simple_Template__c = simple_Template__c;
    }


    /**
     * Gets the solutions value for this _case.
     * 
     * @return solutions
     */
    public com.sforce.soap.enterprise.QueryResult getSolutions() {
        return solutions;
    }


    /**
     * Sets the solutions value for this _case.
     * 
     * @param solutions
     */
    public void setSolutions(com.sforce.soap.enterprise.QueryResult solutions) {
        this.solutions = solutions;
    }


    /**
     * Gets the special_Instructions__c value for this _case.
     * 
     * @return special_Instructions__c
     */
    public java.lang.String getSpecial_Instructions__c() {
        return special_Instructions__c;
    }


    /**
     * Sets the special_Instructions__c value for this _case.
     * 
     * @param special_Instructions__c
     */
    public void setSpecial_Instructions__c(java.lang.String special_Instructions__c) {
        this.special_Instructions__c = special_Instructions__c;
    }


    /**
     * Gets the specifics__c value for this _case.
     * 
     * @return specifics__c
     */
    public java.lang.String getSpecifics__c() {
        return specifics__c;
    }


    /**
     * Sets the specifics__c value for this _case.
     * 
     * @param specifics__c
     */
    public void setSpecifics__c(java.lang.String specifics__c) {
        this.specifics__c = specifics__c;
    }


    /**
     * Gets the status value for this _case.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this _case.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the status_Call_End_Date__c value for this _case.
     * 
     * @return status_Call_End_Date__c
     */
    public java.util.Calendar getStatus_Call_End_Date__c() {
        return status_Call_End_Date__c;
    }


    /**
     * Sets the status_Call_End_Date__c value for this _case.
     * 
     * @param status_Call_End_Date__c
     */
    public void setStatus_Call_End_Date__c(java.util.Calendar status_Call_End_Date__c) {
        this.status_Call_End_Date__c = status_Call_End_Date__c;
    }


    /**
     * Gets the status_Call_Start_Date__c value for this _case.
     * 
     * @return status_Call_Start_Date__c
     */
    public java.util.Calendar getStatus_Call_Start_Date__c() {
        return status_Call_Start_Date__c;
    }


    /**
     * Sets the status_Call_Start_Date__c value for this _case.
     * 
     * @param status_Call_Start_Date__c
     */
    public void setStatus_Call_Start_Date__c(java.util.Calendar status_Call_Start_Date__c) {
        this.status_Call_Start_Date__c = status_Call_Start_Date__c;
    }


    /**
     * Gets the status_Description__c value for this _case.
     * 
     * @return status_Description__c
     */
    public java.lang.String getStatus_Description__c() {
        return status_Description__c;
    }


    /**
     * Sets the status_Description__c value for this _case.
     * 
     * @param status_Description__c
     */
    public void setStatus_Description__c(java.lang.String status_Description__c) {
        this.status_Description__c = status_Description__c;
    }


    /**
     * Gets the status_Last_Modified_del__c value for this _case.
     * 
     * @return status_Last_Modified_del__c
     */
    public java.util.Calendar getStatus_Last_Modified_del__c() {
        return status_Last_Modified_del__c;
    }


    /**
     * Sets the status_Last_Modified_del__c value for this _case.
     * 
     * @param status_Last_Modified_del__c
     */
    public void setStatus_Last_Modified_del__c(java.util.Calendar status_Last_Modified_del__c) {
        this.status_Last_Modified_del__c = status_Last_Modified_del__c;
    }


    /**
     * Gets the status_Meeting_Conference_Info__c value for this _case.
     * 
     * @return status_Meeting_Conference_Info__c
     */
    public java.lang.String getStatus_Meeting_Conference_Info__c() {
        return status_Meeting_Conference_Info__c;
    }


    /**
     * Sets the status_Meeting_Conference_Info__c value for this _case.
     * 
     * @param status_Meeting_Conference_Info__c
     */
    public void setStatus_Meeting_Conference_Info__c(java.lang.String status_Meeting_Conference_Info__c) {
        this.status_Meeting_Conference_Info__c = status_Meeting_Conference_Info__c;
    }


    /**
     * Gets the status_Meeting_Notes__c value for this _case.
     * 
     * @return status_Meeting_Notes__c
     */
    public java.lang.String getStatus_Meeting_Notes__c() {
        return status_Meeting_Notes__c;
    }


    /**
     * Sets the status_Meeting_Notes__c value for this _case.
     * 
     * @param status_Meeting_Notes__c
     */
    public void setStatus_Meeting_Notes__c(java.lang.String status_Meeting_Notes__c) {
        this.status_Meeting_Notes__c = status_Meeting_Notes__c;
    }


    /**
     * Gets the status_Meeting__c value for this _case.
     * 
     * @return status_Meeting__c
     */
    public java.lang.String getStatus_Meeting__c() {
        return status_Meeting__c;
    }


    /**
     * Sets the status_Meeting__c value for this _case.
     * 
     * @param status_Meeting__c
     */
    public void setStatus_Meeting__c(java.lang.String status_Meeting__c) {
        this.status_Meeting__c = status_Meeting__c;
    }


    /**
     * Gets the status_Meeting__r value for this _case.
     * 
     * @return status_Meeting__r
     */
    public com.sforce.soap.enterprise.sobject.Status_Meeting__c getStatus_Meeting__r() {
        return status_Meeting__r;
    }


    /**
     * Sets the status_Meeting__r value for this _case.
     * 
     * @param status_Meeting__r
     */
    public void setStatus_Meeting__r(com.sforce.soap.enterprise.sobject.Status_Meeting__c status_Meeting__r) {
        this.status_Meeting__r = status_Meeting__r;
    }


    /**
     * Gets the study_Material__c value for this _case.
     * 
     * @return study_Material__c
     */
    public java.lang.Double getStudy_Material__c() {
        return study_Material__c;
    }


    /**
     * Sets the study_Material__c value for this _case.
     * 
     * @param study_Material__c
     */
    public void setStudy_Material__c(java.lang.Double study_Material__c) {
        this.study_Material__c = study_Material__c;
    }


    /**
     * Gets the subject value for this _case.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this _case.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the suppliedEmail value for this _case.
     * 
     * @return suppliedEmail
     */
    public java.lang.String getSuppliedEmail() {
        return suppliedEmail;
    }


    /**
     * Sets the suppliedEmail value for this _case.
     * 
     * @param suppliedEmail
     */
    public void setSuppliedEmail(java.lang.String suppliedEmail) {
        this.suppliedEmail = suppliedEmail;
    }


    /**
     * Gets the suppliedName value for this _case.
     * 
     * @return suppliedName
     */
    public java.lang.String getSuppliedName() {
        return suppliedName;
    }


    /**
     * Sets the suppliedName value for this _case.
     * 
     * @param suppliedName
     */
    public void setSuppliedName(java.lang.String suppliedName) {
        this.suppliedName = suppliedName;
    }


    /**
     * Gets the support_Hours__c value for this _case.
     * 
     * @return support_Hours__c
     */
    public java.lang.String getSupport_Hours__c() {
        return support_Hours__c;
    }


    /**
     * Sets the support_Hours__c value for this _case.
     * 
     * @param support_Hours__c
     */
    public void setSupport_Hours__c(java.lang.String support_Hours__c) {
        this.support_Hours__c = support_Hours__c;
    }


    /**
     * Gets the support_Sample_Number__c value for this _case.
     * 
     * @return support_Sample_Number__c
     */
    public java.lang.Double getSupport_Sample_Number__c() {
        return support_Sample_Number__c;
    }


    /**
     * Sets the support_Sample_Number__c value for this _case.
     * 
     * @param support_Sample_Number__c
     */
    public void setSupport_Sample_Number__c(java.lang.Double support_Sample_Number__c) {
        this.support_Sample_Number__c = support_Sample_Number__c;
    }


    /**
     * Gets the support__c value for this _case.
     * 
     * @return support__c
     */
    public java.lang.String getSupport__c() {
        return support__c;
    }


    /**
     * Sets the support__c value for this _case.
     * 
     * @param support__c
     */
    public void setSupport__c(java.lang.String support__c) {
        this.support__c = support__c;
    }


    /**
     * Gets the systemModstamp value for this _case.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this _case.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this _case.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this _case.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the teamMembers value for this _case.
     * 
     * @return teamMembers
     */
    public com.sforce.soap.enterprise.QueryResult getTeamMembers() {
        return teamMembers;
    }


    /**
     * Sets the teamMembers value for this _case.
     * 
     * @param teamMembers
     */
    public void setTeamMembers(com.sforce.soap.enterprise.QueryResult teamMembers) {
        this.teamMembers = teamMembers;
    }


    /**
     * Gets the teamTemplateRecords value for this _case.
     * 
     * @return teamTemplateRecords
     */
    public com.sforce.soap.enterprise.QueryResult getTeamTemplateRecords() {
        return teamTemplateRecords;
    }


    /**
     * Sets the teamTemplateRecords value for this _case.
     * 
     * @param teamTemplateRecords
     */
    public void setTeamTemplateRecords(com.sforce.soap.enterprise.QueryResult teamTemplateRecords) {
        this.teamTemplateRecords = teamTemplateRecords;
    }


    /**
     * Gets the technical_Resource__c value for this _case.
     * 
     * @return technical_Resource__c
     */
    public java.lang.String getTechnical_Resource__c() {
        return technical_Resource__c;
    }


    /**
     * Sets the technical_Resource__c value for this _case.
     * 
     * @param technical_Resource__c
     */
    public void setTechnical_Resource__c(java.lang.String technical_Resource__c) {
        this.technical_Resource__c = technical_Resource__c;
    }


    /**
     * Gets the test_Case_to_Reproduce__c value for this _case.
     * 
     * @return test_Case_to_Reproduce__c
     */
    public java.lang.String getTest_Case_to_Reproduce__c() {
        return test_Case_to_Reproduce__c;
    }


    /**
     * Sets the test_Case_to_Reproduce__c value for this _case.
     * 
     * @param test_Case_to_Reproduce__c
     */
    public void setTest_Case_to_Reproduce__c(java.lang.String test_Case_to_Reproduce__c) {
        this.test_Case_to_Reproduce__c = test_Case_to_Reproduce__c;
    }


    /**
     * Gets the ticketReleaseAssociations__r value for this _case.
     * 
     * @return ticketReleaseAssociations__r
     */
    public com.sforce.soap.enterprise.QueryResult getTicketReleaseAssociations__r() {
        return ticketReleaseAssociations__r;
    }


    /**
     * Sets the ticketReleaseAssociations__r value for this _case.
     * 
     * @param ticketReleaseAssociations__r
     */
    public void setTicketReleaseAssociations__r(com.sforce.soap.enterprise.QueryResult ticketReleaseAssociations__r) {
        this.ticketReleaseAssociations__r = ticketReleaseAssociations__r;
    }


    /**
     * Gets the ticket_ReOpened__c value for this _case.
     * 
     * @return ticket_ReOpened__c
     */
    public java.lang.Boolean getTicket_ReOpened__c() {
        return ticket_ReOpened__c;
    }


    /**
     * Sets the ticket_ReOpened__c value for this _case.
     * 
     * @param ticket_ReOpened__c
     */
    public void setTicket_ReOpened__c(java.lang.Boolean ticket_ReOpened__c) {
        this.ticket_ReOpened__c = ticket_ReOpened__c;
    }


    /**
     * Gets the tier_1_User__c value for this _case.
     * 
     * @return tier_1_User__c
     */
    public java.lang.String getTier_1_User__c() {
        return tier_1_User__c;
    }


    /**
     * Sets the tier_1_User__c value for this _case.
     * 
     * @param tier_1_User__c
     */
    public void setTier_1_User__c(java.lang.String tier_1_User__c) {
        this.tier_1_User__c = tier_1_User__c;
    }


    /**
     * Gets the tier_1_User__r value for this _case.
     * 
     * @return tier_1_User__r
     */
    public com.sforce.soap.enterprise.sobject.User getTier_1_User__r() {
        return tier_1_User__r;
    }


    /**
     * Sets the tier_1_User__r value for this _case.
     * 
     * @param tier_1_User__r
     */
    public void setTier_1_User__r(com.sforce.soap.enterprise.sobject.User tier_1_User__r) {
        this.tier_1_User__r = tier_1_User__r;
    }


    /**
     * Gets the tier_2_User__c value for this _case.
     * 
     * @return tier_2_User__c
     */
    public java.lang.String getTier_2_User__c() {
        return tier_2_User__c;
    }


    /**
     * Sets the tier_2_User__c value for this _case.
     * 
     * @param tier_2_User__c
     */
    public void setTier_2_User__c(java.lang.String tier_2_User__c) {
        this.tier_2_User__c = tier_2_User__c;
    }


    /**
     * Gets the tier_2_User__r value for this _case.
     * 
     * @return tier_2_User__r
     */
    public com.sforce.soap.enterprise.sobject.User getTier_2_User__r() {
        return tier_2_User__r;
    }


    /**
     * Sets the tier_2_User__r value for this _case.
     * 
     * @param tier_2_User__r
     */
    public void setTier_2_User__r(com.sforce.soap.enterprise.sobject.User tier_2_User__r) {
        this.tier_2_User__r = tier_2_User__r;
    }


    /**
     * Gets the tier_Assignment_Flag__c value for this _case.
     * 
     * @return tier_Assignment_Flag__c
     */
    public java.lang.String getTier_Assignment_Flag__c() {
        return tier_Assignment_Flag__c;
    }


    /**
     * Sets the tier_Assignment_Flag__c value for this _case.
     * 
     * @param tier_Assignment_Flag__c
     */
    public void setTier_Assignment_Flag__c(java.lang.String tier_Assignment_Flag__c) {
        this.tier_Assignment_Flag__c = tier_Assignment_Flag__c;
    }


    /**
     * Gets the tier_Assignment__c value for this _case.
     * 
     * @return tier_Assignment__c
     */
    public java.lang.String getTier_Assignment__c() {
        return tier_Assignment__c;
    }


    /**
     * Sets the tier_Assignment__c value for this _case.
     * 
     * @param tier_Assignment__c
     */
    public void setTier_Assignment__c(java.lang.String tier_Assignment__c) {
        this.tier_Assignment__c = tier_Assignment__c;
    }


    /**
     * Gets the time_Difference_Final__c value for this _case.
     * 
     * @return time_Difference_Final__c
     */
    public java.lang.Double getTime_Difference_Final__c() {
        return time_Difference_Final__c;
    }


    /**
     * Sets the time_Difference_Final__c value for this _case.
     * 
     * @param time_Difference_Final__c
     */
    public void setTime_Difference_Final__c(java.lang.Double time_Difference_Final__c) {
        this.time_Difference_Final__c = time_Difference_Final__c;
    }


    /**
     * Gets the time_Spent_on_Ticket__c value for this _case.
     * 
     * @return time_Spent_on_Ticket__c
     */
    public java.lang.Double getTime_Spent_on_Ticket__c() {
        return time_Spent_on_Ticket__c;
    }


    /**
     * Sets the time_Spent_on_Ticket__c value for this _case.
     * 
     * @param time_Spent_on_Ticket__c
     */
    public void setTime_Spent_on_Ticket__c(java.lang.Double time_Spent_on_Ticket__c) {
        this.time_Spent_on_Ticket__c = time_Spent_on_Ticket__c;
    }


    /**
     * Gets the time_Tracking_Type__c value for this _case.
     * 
     * @return time_Tracking_Type__c
     */
    public java.lang.String getTime_Tracking_Type__c() {
        return time_Tracking_Type__c;
    }


    /**
     * Sets the time_Tracking_Type__c value for this _case.
     * 
     * @param time_Tracking_Type__c
     */
    public void setTime_Tracking_Type__c(java.lang.String time_Tracking_Type__c) {
        this.time_Tracking_Type__c = time_Tracking_Type__c;
    }


    /**
     * Gets the time_With_Customer__c value for this _case.
     * 
     * @return time_With_Customer__c
     */
    public java.lang.Double getTime_With_Customer__c() {
        return time_With_Customer__c;
    }


    /**
     * Sets the time_With_Customer__c value for this _case.
     * 
     * @param time_With_Customer__c
     */
    public void setTime_With_Customer__c(java.lang.Double time_With_Customer__c) {
        this.time_With_Customer__c = time_With_Customer__c;
    }


    /**
     * Gets the time_With_Support__c value for this _case.
     * 
     * @return time_With_Support__c
     */
    public java.lang.Double getTime_With_Support__c() {
        return time_With_Support__c;
    }


    /**
     * Sets the time_With_Support__c value for this _case.
     * 
     * @param time_With_Support__c
     */
    public void setTime_With_Support__c(java.lang.Double time_With_Support__c) {
        this.time_With_Support__c = time_With_Support__c;
    }


    /**
     * Gets the time_in_Queue__c value for this _case.
     * 
     * @return time_in_Queue__c
     */
    public java.lang.Double getTime_in_Queue__c() {
        return time_in_Queue__c;
    }


    /**
     * Sets the time_in_Queue__c value for this _case.
     * 
     * @param time_in_Queue__c
     */
    public void setTime_in_Queue__c(java.lang.Double time_in_Queue__c) {
        this.time_in_Queue__c = time_in_Queue__c;
    }


    /**
     * Gets the time_on_Case_del__c value for this _case.
     * 
     * @return time_on_Case_del__c
     */
    public java.lang.String getTime_on_Case_del__c() {
        return time_on_Case_del__c;
    }


    /**
     * Sets the time_on_Case_del__c value for this _case.
     * 
     * @param time_on_Case_del__c
     */
    public void setTime_on_Case_del__c(java.lang.String time_on_Case_del__c) {
        this.time_on_Case_del__c = time_on_Case_del__c;
    }


    /**
     * Gets the total_Billable_Time__c value for this _case.
     * 
     * @return total_Billable_Time__c
     */
    public java.lang.Double getTotal_Billable_Time__c() {
        return total_Billable_Time__c;
    }


    /**
     * Sets the total_Billable_Time__c value for this _case.
     * 
     * @param total_Billable_Time__c
     */
    public void setTotal_Billable_Time__c(java.lang.Double total_Billable_Time__c) {
        this.total_Billable_Time__c = total_Billable_Time__c;
    }


    /**
     * Gets the total_Data_Size_in_GB__c value for this _case.
     * 
     * @return total_Data_Size_in_GB__c
     */
    public java.lang.Double getTotal_Data_Size_in_GB__c() {
        return total_Data_Size_in_GB__c;
    }


    /**
     * Sets the total_Data_Size_in_GB__c value for this _case.
     * 
     * @param total_Data_Size_in_GB__c
     */
    public void setTotal_Data_Size_in_GB__c(java.lang.Double total_Data_Size_in_GB__c) {
        this.total_Data_Size_in_GB__c = total_Data_Size_in_GB__c;
    }


    /**
     * Gets the total_Escalated_Tickets__c value for this _case.
     * 
     * @return total_Escalated_Tickets__c
     */
    public java.lang.String getTotal_Escalated_Tickets__c() {
        return total_Escalated_Tickets__c;
    }


    /**
     * Sets the total_Escalated_Tickets__c value for this _case.
     * 
     * @param total_Escalated_Tickets__c
     */
    public void setTotal_Escalated_Tickets__c(java.lang.String total_Escalated_Tickets__c) {
        this.total_Escalated_Tickets__c = total_Escalated_Tickets__c;
    }


    /**
     * Gets the total_Escalated_for_Bug_Review__c value for this _case.
     * 
     * @return total_Escalated_for_Bug_Review__c
     */
    public java.lang.String getTotal_Escalated_for_Bug_Review__c() {
        return total_Escalated_for_Bug_Review__c;
    }


    /**
     * Sets the total_Escalated_for_Bug_Review__c value for this _case.
     * 
     * @param total_Escalated_for_Bug_Review__c
     */
    public void setTotal_Escalated_for_Bug_Review__c(java.lang.String total_Escalated_for_Bug_Review__c) {
        this.total_Escalated_for_Bug_Review__c = total_Escalated_for_Bug_Review__c;
    }


    /**
     * Gets the total_Escalated_to_Dev__c value for this _case.
     * 
     * @return total_Escalated_to_Dev__c
     */
    public java.lang.String getTotal_Escalated_to_Dev__c() {
        return total_Escalated_to_Dev__c;
    }


    /**
     * Sets the total_Escalated_to_Dev__c value for this _case.
     * 
     * @param total_Escalated_to_Dev__c
     */
    public void setTotal_Escalated_to_Dev__c(java.lang.String total_Escalated_to_Dev__c) {
        this.total_Escalated_to_Dev__c = total_Escalated_to_Dev__c;
    }


    /**
     * Gets the total_Evaluated_for_Business_Impact__c value for this _case.
     * 
     * @return total_Evaluated_for_Business_Impact__c
     */
    public java.lang.String getTotal_Evaluated_for_Business_Impact__c() {
        return total_Evaluated_for_Business_Impact__c;
    }


    /**
     * Sets the total_Evaluated_for_Business_Impact__c value for this _case.
     * 
     * @param total_Evaluated_for_Business_Impact__c
     */
    public void setTotal_Evaluated_for_Business_Impact__c(java.lang.String total_Evaluated_for_Business_Impact__c) {
        this.total_Evaluated_for_Business_Impact__c = total_Evaluated_for_Business_Impact__c;
    }


    /**
     * Gets the total_Number_of_Deliverables__c value for this _case.
     * 
     * @return total_Number_of_Deliverables__c
     */
    public java.lang.Double getTotal_Number_of_Deliverables__c() {
        return total_Number_of_Deliverables__c;
    }


    /**
     * Sets the total_Number_of_Deliverables__c value for this _case.
     * 
     * @param total_Number_of_Deliverables__c
     */
    public void setTotal_Number_of_Deliverables__c(java.lang.Double total_Number_of_Deliverables__c) {
        this.total_Number_of_Deliverables__c = total_Number_of_Deliverables__c;
    }


    /**
     * Gets the total_Time__c value for this _case.
     * 
     * @return total_Time__c
     */
    public java.lang.Double getTotal_Time__c() {
        return total_Time__c;
    }


    /**
     * Sets the total_Time__c value for this _case.
     * 
     * @param total_Time__c
     */
    public void setTotal_Time__c(java.lang.Double total_Time__c) {
        this.total_Time__c = total_Time__c;
    }


    /**
     * Gets the trainer_Outline__c value for this _case.
     * 
     * @return trainer_Outline__c
     */
    public java.lang.Double getTrainer_Outline__c() {
        return trainer_Outline__c;
    }


    /**
     * Sets the trainer_Outline__c value for this _case.
     * 
     * @param trainer_Outline__c
     */
    public void setTrainer_Outline__c(java.lang.Double trainer_Outline__c) {
        this.trainer_Outline__c = trainer_Outline__c;
    }


    /**
     * Gets the training_Category__c value for this _case.
     * 
     * @return training_Category__c
     */
    public java.lang.String getTraining_Category__c() {
        return training_Category__c;
    }


    /**
     * Sets the training_Category__c value for this _case.
     * 
     * @param training_Category__c
     */
    public void setTraining_Category__c(java.lang.String training_Category__c) {
        this.training_Category__c = training_Category__c;
    }


    /**
     * Gets the training_PPT__c value for this _case.
     * 
     * @return training_PPT__c
     */
    public java.lang.Double getTraining_PPT__c() {
        return training_PPT__c;
    }


    /**
     * Sets the training_PPT__c value for this _case.
     * 
     * @param training_PPT__c
     */
    public void setTraining_PPT__c(java.lang.Double training_PPT__c) {
        this.training_PPT__c = training_PPT__c;
    }


    /**
     * Gets the training_Workbook__c value for this _case.
     * 
     * @return training_Workbook__c
     */
    public java.lang.Double getTraining_Workbook__c() {
        return training_Workbook__c;
    }


    /**
     * Sets the training_Workbook__c value for this _case.
     * 
     * @param training_Workbook__c
     */
    public void setTraining_Workbook__c(java.lang.Double training_Workbook__c) {
        this.training_Workbook__c = training_Workbook__c;
    }


    /**
     * Gets the transaction__c value for this _case.
     * 
     * @return transaction__c
     */
    public java.lang.String getTransaction__c() {
        return transaction__c;
    }


    /**
     * Sets the transaction__c value for this _case.
     * 
     * @param transaction__c
     */
    public void setTransaction__c(java.lang.String transaction__c) {
        this.transaction__c = transaction__c;
    }


    /**
     * Gets the transaction__r value for this _case.
     * 
     * @return transaction__r
     */
    public com.sforce.soap.enterprise.sobject.Transaction__c getTransaction__r() {
        return transaction__r;
    }


    /**
     * Sets the transaction__r value for this _case.
     * 
     * @param transaction__r
     */
    public void setTransaction__r(com.sforce.soap.enterprise.sobject.Transaction__c transaction__r) {
        this.transaction__r = transaction__r;
    }


    /**
     * Gets the tutorial__c value for this _case.
     * 
     * @return tutorial__c
     */
    public java.lang.Double getTutorial__c() {
        return tutorial__c;
    }


    /**
     * Sets the tutorial__c value for this _case.
     * 
     * @param tutorial__c
     */
    public void setTutorial__c(java.lang.Double tutorial__c) {
        this.tutorial__c = tutorial__c;
    }


    /**
     * Gets the type value for this _case.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this _case.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the type_Sub__c value for this _case.
     * 
     * @return type_Sub__c
     */
    public java.lang.String getType_Sub__c() {
        return type_Sub__c;
    }


    /**
     * Sets the type_Sub__c value for this _case.
     * 
     * @param type_Sub__c
     */
    public void setType_Sub__c(java.lang.String type_Sub__c) {
        this.type_Sub__c = type_Sub__c;
    }


    /**
     * Gets the type_of_Document__c value for this _case.
     * 
     * @return type_of_Document__c
     */
    public java.lang.String getType_of_Document__c() {
        return type_of_Document__c;
    }


    /**
     * Sets the type_of_Document__c value for this _case.
     * 
     * @param type_of_Document__c
     */
    public void setType_of_Document__c(java.lang.String type_of_Document__c) {
        this.type_of_Document__c = type_of_Document__c;
    }


    /**
     * Gets the update_Interval_Start_Date__c value for this _case.
     * 
     * @return update_Interval_Start_Date__c
     */
    public java.util.Date getUpdate_Interval_Start_Date__c() {
        return update_Interval_Start_Date__c;
    }


    /**
     * Sets the update_Interval_Start_Date__c value for this _case.
     * 
     * @param update_Interval_Start_Date__c
     */
    public void setUpdate_Interval_Start_Date__c(java.util.Date update_Interval_Start_Date__c) {
        this.update_Interval_Start_Date__c = update_Interval_Start_Date__c;
    }


    /**
     * Gets the update_Interval__c value for this _case.
     * 
     * @return update_Interval__c
     */
    public java.lang.String getUpdate_Interval__c() {
        return update_Interval__c;
    }


    /**
     * Sets the update_Interval__c value for this _case.
     * 
     * @param update_Interval__c
     */
    public void setUpdate_Interval__c(java.lang.String update_Interval__c) {
        this.update_Interval__c = update_Interval__c;
    }


    /**
     * Gets the urgency__c value for this _case.
     * 
     * @return urgency__c
     */
    public java.lang.String getUrgency__c() {
        return urgency__c;
    }


    /**
     * Sets the urgency__c value for this _case.
     * 
     * @param urgency__c
     */
    public void setUrgency__c(java.lang.String urgency__c) {
        this.urgency__c = urgency__c;
    }


    /**
     * Gets the user__c value for this _case.
     * 
     * @return user__c
     */
    public java.lang.String getUser__c() {
        return user__c;
    }


    /**
     * Sets the user__c value for this _case.
     * 
     * @param user__c
     */
    public void setUser__c(java.lang.String user__c) {
        this.user__c = user__c;
    }


    /**
     * Gets the user__r value for this _case.
     * 
     * @return user__r
     */
    public com.sforce.soap.enterprise.sobject.User getUser__r() {
        return user__r;
    }


    /**
     * Sets the user__r value for this _case.
     * 
     * @param user__r
     */
    public void setUser__r(com.sforce.soap.enterprise.sobject.User user__r) {
        this.user__r = user__r;
    }


    /**
     * Gets the validated_In_Version__c value for this _case.
     * 
     * @return validated_In_Version__c
     */
    public java.lang.String getValidated_In_Version__c() {
        return validated_In_Version__c;
    }


    /**
     * Sets the validated_In_Version__c value for this _case.
     * 
     * @param validated_In_Version__c
     */
    public void setValidated_In_Version__c(java.lang.String validated_In_Version__c) {
        this.validated_In_Version__c = validated_In_Version__c;
    }


    /**
     * Gets the vendor__c value for this _case.
     * 
     * @return vendor__c
     */
    public java.lang.String getVendor__c() {
        return vendor__c;
    }


    /**
     * Sets the vendor__c value for this _case.
     * 
     * @param vendor__c
     */
    public void setVendor__c(java.lang.String vendor__c) {
        this.vendor__c = vendor__c;
    }


    /**
     * Gets the verify_Release__c value for this _case.
     * 
     * @return verify_Release__c
     */
    public java.lang.String getVerify_Release__c() {
        return verify_Release__c;
    }


    /**
     * Sets the verify_Release__c value for this _case.
     * 
     * @param verify_Release__c
     */
    public void setVerify_Release__c(java.lang.String verify_Release__c) {
        this.verify_Release__c = verify_Release__c;
    }


    /**
     * Gets the version_Origin__c value for this _case.
     * 
     * @return version_Origin__c
     */
    public java.lang.String getVersion_Origin__c() {
        return version_Origin__c;
    }


    /**
     * Sets the version_Origin__c value for this _case.
     * 
     * @param version_Origin__c
     */
    public void setVersion_Origin__c(java.lang.String version_Origin__c) {
        this.version_Origin__c = version_Origin__c;
    }


    /**
     * Gets the version__c value for this _case.
     * 
     * @return version__c
     */
    public java.lang.String getVersion__c() {
        return version__c;
    }


    /**
     * Sets the version__c value for this _case.
     * 
     * @param version__c
     */
    public void setVersion__c(java.lang.String version__c) {
        this.version__c = version__c;
    }


    /**
     * Gets the video__c value for this _case.
     * 
     * @return video__c
     */
    public java.lang.Double getVideo__c() {
        return video__c;
    }


    /**
     * Sets the video__c value for this _case.
     * 
     * @param video__c
     */
    public void setVideo__c(java.lang.Double video__c) {
        this.video__c = video__c;
    }


    /**
     * Gets the viewer_Version_Fixed__c value for this _case.
     * 
     * @return viewer_Version_Fixed__c
     */
    public java.lang.String getViewer_Version_Fixed__c() {
        return viewer_Version_Fixed__c;
    }


    /**
     * Sets the viewer_Version_Fixed__c value for this _case.
     * 
     * @param viewer_Version_Fixed__c
     */
    public void setViewer_Version_Fixed__c(java.lang.String viewer_Version_Fixed__c) {
        this.viewer_Version_Fixed__c = viewer_Version_Fixed__c;
    }


    /**
     * Gets the webinar_Recording__c value for this _case.
     * 
     * @return webinar_Recording__c
     */
    public java.lang.Double getWebinar_Recording__c() {
        return webinar_Recording__c;
    }


    /**
     * Sets the webinar_Recording__c value for this _case.
     * 
     * @param webinar_Recording__c
     */
    public void setWebinar_Recording__c(java.lang.Double webinar_Recording__c) {
        this.webinar_Recording__c = webinar_Recording__c;
    }


    /**
     * Gets the webinar__c value for this _case.
     * 
     * @return webinar__c
     */
    public java.lang.Double getWebinar__c() {
        return webinar__c;
    }


    /**
     * Sets the webinar__c value for this _case.
     * 
     * @param webinar__c
     */
    public void setWebinar__c(java.lang.Double webinar__c) {
        this.webinar__c = webinar__c;
    }


    /**
     * Gets the what__c value for this _case.
     * 
     * @return what__c
     */
    public java.lang.String getWhat__c() {
        return what__c;
    }


    /**
     * Sets the what__c value for this _case.
     * 
     * @param what__c
     */
    public void setWhat__c(java.lang.String what__c) {
        this.what__c = what__c;
    }


    /**
     * Gets the where_is_drive__c value for this _case.
     * 
     * @return where_is_drive__c
     */
    public java.lang.String getWhere_is_drive__c() {
        return where_is_drive__c;
    }


    /**
     * Sets the where_is_drive__c value for this _case.
     * 
     * @param where_is_drive__c
     */
    public void setWhere_is_drive__c(java.lang.String where_is_drive__c) {
        this.where_is_drive__c = where_is_drive__c;
    }


    /**
     * Gets the where_is_drive__r value for this _case.
     * 
     * @return where_is_drive__r
     */
    public com.sforce.soap.enterprise.sobject.Servers__c getWhere_is_drive__r() {
        return where_is_drive__r;
    }


    /**
     * Sets the where_is_drive__r value for this _case.
     * 
     * @param where_is_drive__r
     */
    public void setWhere_is_drive__r(com.sforce.soap.enterprise.sobject.Servers__c where_is_drive__r) {
        this.where_is_drive__r = where_is_drive__r;
    }


    /**
     * Gets the workaround_Actual_Date__c value for this _case.
     * 
     * @return workaround_Actual_Date__c
     */
    public java.util.Date getWorkaround_Actual_Date__c() {
        return workaround_Actual_Date__c;
    }


    /**
     * Sets the workaround_Actual_Date__c value for this _case.
     * 
     * @param workaround_Actual_Date__c
     */
    public void setWorkaround_Actual_Date__c(java.util.Date workaround_Actual_Date__c) {
        this.workaround_Actual_Date__c = workaround_Actual_Date__c;
    }


    /**
     * Gets the workaround_Scheduled_Date__c value for this _case.
     * 
     * @return workaround_Scheduled_Date__c
     */
    public java.util.Date getWorkaround_Scheduled_Date__c() {
        return workaround_Scheduled_Date__c;
    }


    /**
     * Sets the workaround_Scheduled_Date__c value for this _case.
     * 
     * @param workaround_Scheduled_Date__c
     */
    public void setWorkaround_Scheduled_Date__c(java.util.Date workaround_Scheduled_Date__c) {
        this.workaround_Scheduled_Date__c = workaround_Scheduled_Date__c;
    }


    /**
     * Gets the workaround__c value for this _case.
     * 
     * @return workaround__c
     */
    public java.lang.String getWorkaround__c() {
        return workaround__c;
    }


    /**
     * Sets the workaround__c value for this _case.
     * 
     * @param workaround__c
     */
    public void setWorkaround__c(java.lang.String workaround__c) {
        this.workaround__c = workaround__c;
    }


    /**
     * Gets the x24_Hour_Follow_up_Deadline_Missed__c value for this _case.
     * 
     * @return x24_Hour_Follow_up_Deadline_Missed__c
     */
    public java.lang.Double getX24_Hour_Follow_up_Deadline_Missed__c() {
        return x24_Hour_Follow_up_Deadline_Missed__c;
    }


    /**
     * Sets the x24_Hour_Follow_up_Deadline_Missed__c value for this _case.
     * 
     * @param x24_Hour_Follow_up_Deadline_Missed__c
     */
    public void setX24_Hour_Follow_up_Deadline_Missed__c(java.lang.Double x24_Hour_Follow_up_Deadline_Missed__c) {
        this.x24_Hour_Follow_up_Deadline_Missed__c = x24_Hour_Follow_up_Deadline_Missed__c;
    }


    /**
     * Gets the x90_Day_Deployment_Checkup_Date__c value for this _case.
     * 
     * @return x90_Day_Deployment_Checkup_Date__c
     */
    public java.util.Date getX90_Day_Deployment_Checkup_Date__c() {
        return x90_Day_Deployment_Checkup_Date__c;
    }


    /**
     * Sets the x90_Day_Deployment_Checkup_Date__c value for this _case.
     * 
     * @param x90_Day_Deployment_Checkup_Date__c
     */
    public void setX90_Day_Deployment_Checkup_Date__c(java.util.Date x90_Day_Deployment_Checkup_Date__c) {
        this.x90_Day_Deployment_Checkup_Date__c = x90_Day_Deployment_Checkup_Date__c;
    }


    /**
     * Gets the YTD_Total_Days__c value for this _case.
     * 
     * @return YTD_Total_Days__c
     */
    public java.lang.Double getYTD_Total_Days__c() {
        return YTD_Total_Days__c;
    }


    /**
     * Sets the YTD_Total_Days__c value for this _case.
     * 
     * @param YTD_Total_Days__c
     */
    public void setYTD_Total_Days__c(java.lang.Double YTD_Total_Days__c) {
        this.YTD_Total_Days__c = YTD_Total_Days__c;
    }


    /**
     * Gets the dtSearch_Date_Verified__c value for this _case.
     * 
     * @return dtSearch_Date_Verified__c
     */
    public java.util.Calendar getDtSearch_Date_Verified__c() {
        return dtSearch_Date_Verified__c;
    }


    /**
     * Sets the dtSearch_Date_Verified__c value for this _case.
     * 
     * @param dtSearch_Date_Verified__c
     */
    public void setDtSearch_Date_Verified__c(java.util.Calendar dtSearch_Date_Verified__c) {
        this.dtSearch_Date_Verified__c = dtSearch_Date_Verified__c;
    }


    /**
     * Gets the dtSearch_Drive_Name__c value for this _case.
     * 
     * @return dtSearch_Drive_Name__c
     */
    public java.lang.String getDtSearch_Drive_Name__c() {
        return dtSearch_Drive_Name__c;
    }


    /**
     * Sets the dtSearch_Drive_Name__c value for this _case.
     * 
     * @param dtSearch_Drive_Name__c
     */
    public void setDtSearch_Drive_Name__c(java.lang.String dtSearch_Drive_Name__c) {
        this.dtSearch_Drive_Name__c = dtSearch_Drive_Name__c;
    }


    /**
     * Gets the kCura_Email_Addresses__c value for this _case.
     * 
     * @return kCura_Email_Addresses__c
     */
    public java.lang.String getKCura_Email_Addresses__c() {
        return kCura_Email_Addresses__c;
    }


    /**
     * Sets the kCura_Email_Addresses__c value for this _case.
     * 
     * @param kCura_Email_Addresses__c
     */
    public void setKCura_Email_Addresses__c(java.lang.String kCura_Email_Addresses__c) {
        this.kCura_Email_Addresses__c = kCura_Email_Addresses__c;
    }


    /**
     * Gets the kIE_Age__c value for this _case.
     * 
     * @return kIE_Age__c
     */
    public java.lang.Double getKIE_Age__c() {
        return kIE_Age__c;
    }


    /**
     * Sets the kIE_Age__c value for this _case.
     * 
     * @param kIE_Age__c
     */
    public void setKIE_Age__c(java.lang.Double kIE_Age__c) {
        this.kIE_Age__c = kIE_Age__c;
    }


    /**
     * Gets the kIE_Resource__c value for this _case.
     * 
     * @return kIE_Resource__c
     */
    public java.lang.String getKIE_Resource__c() {
        return kIE_Resource__c;
    }


    /**
     * Sets the kIE_Resource__c value for this _case.
     * 
     * @param kIE_Resource__c
     */
    public void setKIE_Resource__c(java.lang.String kIE_Resource__c) {
        this.kIE_Resource__c = kIE_Resource__c;
    }


    /**
     * Gets the kIE_Resource__r value for this _case.
     * 
     * @return kIE_Resource__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getKIE_Resource__r() {
        return kIE_Resource__r;
    }


    /**
     * Sets the kIE_Resource__r value for this _case.
     * 
     * @param kIE_Resource__r
     */
    public void setKIE_Resource__r(com.sforce.soap.enterprise.sobject.Contact kIE_Resource__r) {
        this.kIE_Resource__r = kIE_Resource__r;
    }


    /**
     * Gets the kIE_Status__c value for this _case.
     * 
     * @return kIE_Status__c
     */
    public java.lang.String getKIE_Status__c() {
        return kIE_Status__c;
    }


    /**
     * Sets the kIE_Status__c value for this _case.
     * 
     * @param kIE_Status__c
     */
    public void setKIE_Status__c(java.lang.String kIE_Status__c) {
        this.kIE_Status__c = kIE_Status__c;
    }


    /**
     * Gets the time_in_new__c value for this _case.
     * 
     * @return time_in_new__c
     */
    public java.lang.Double getTime_in_new__c() {
        return time_in_new__c;
    }


    /**
     * Sets the time_in_new__c value for this _case.
     * 
     * @param time_in_new__c
     */
    public void setTime_in_new__c(java.lang.Double time_in_new__c) {
        this.time_in_new__c = time_in_new__c;
    }


    /**
     * Gets the xEvaluate_for_Business_Impact__c value for this _case.
     * 
     * @return xEvaluate_for_Business_Impact__c
     */
    public java.lang.Boolean getXEvaluate_for_Business_Impact__c() {
        return xEvaluate_for_Business_Impact__c;
    }


    /**
     * Sets the xEvaluate_for_Business_Impact__c value for this _case.
     * 
     * @param xEvaluate_for_Business_Impact__c
     */
    public void setXEvaluate_for_Business_Impact__c(java.lang.Boolean xEvaluate_for_Business_Impact__c) {
        this.xEvaluate_for_Business_Impact__c = xEvaluate_for_Business_Impact__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof _case)) return false;
        _case other = (_case) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.AM_PM__c==null && other.getAM_PM__c()==null) || 
             (this.AM_PM__c!=null &&
              this.AM_PM__c.equals(other.getAM_PM__c()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.account_Alert__c==null && other.getAccount_Alert__c()==null) || 
             (this.account_Alert__c!=null &&
              this.account_Alert__c.equals(other.getAccount_Alert__c()))) &&
            ((this.activityHistories==null && other.getActivityHistories()==null) || 
             (this.activityHistories!=null &&
              this.activityHistories.equals(other.getActivityHistories()))) &&
            ((this.actual_Billable_Time__c==null && other.getActual_Billable_Time__c()==null) || 
             (this.actual_Billable_Time__c!=null &&
              this.actual_Billable_Time__c.equals(other.getActual_Billable_Time__c()))) &&
            ((this.add_to_Official_Doc_Set__c==null && other.getAdd_to_Official_Doc_Set__c()==null) || 
             (this.add_to_Official_Doc_Set__c!=null &&
              this.add_to_Official_Doc_Set__c.equals(other.getAdd_to_Official_Doc_Set__c()))) &&
            ((this.added_to_Backlog_Date__c==null && other.getAdded_to_Backlog_Date__c()==null) || 
             (this.added_to_Backlog_Date__c!=null &&
              this.added_to_Backlog_Date__c.equals(other.getAdded_to_Backlog_Date__c()))) &&
            ((this.admin_Contact__c==null && other.getAdmin_Contact__c()==null) || 
             (this.admin_Contact__c!=null &&
              this.admin_Contact__c.equals(other.getAdmin_Contact__c()))) &&
            ((this.applications_Installed__c==null && other.getApplications_Installed__c()==null) || 
             (this.applications_Installed__c!=null &&
              this.applications_Installed__c.equals(other.getApplications_Installed__c()))) &&
            ((this.approved__c==null && other.getApproved__c()==null) || 
             (this.approved__c!=null &&
              this.approved__c.equals(other.getApproved__c()))) &&
            ((this.approximate_Time_Spent__c==null && other.getApproximate_Time_Spent__c()==null) || 
             (this.approximate_Time_Spent__c!=null &&
              this.approximate_Time_Spent__c.equals(other.getApproximate_Time_Spent__c()))) &&
            ((this.area__c==null && other.getArea__c()==null) || 
             (this.area__c!=null &&
              this.area__c.equals(other.getArea__c()))) &&
            ((this.associated_Ticket_s__c==null && other.getAssociated_Ticket_s__c()==null) || 
             (this.associated_Ticket_s__c!=null &&
              this.associated_Ticket_s__c.equals(other.getAssociated_Ticket_s__c()))) &&
            ((this.associated_Tickets__r==null && other.getAssociated_Tickets__r()==null) || 
             (this.associated_Tickets__r!=null &&
              this.associated_Tickets__r.equals(other.getAssociated_Tickets__r()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.avoidance_Comments__c==null && other.getAvoidance_Comments__c()==null) || 
             (this.avoidance_Comments__c!=null &&
              this.avoidance_Comments__c.equals(other.getAvoidance_Comments__c()))) &&
            ((this.avoidance__c==null && other.getAvoidance__c()==null) || 
             (this.avoidance__c!=null &&
              this.avoidance__c.equals(other.getAvoidance__c()))) &&
            ((this.BA_Tested__c==null && other.getBA_Tested__c()==null) || 
             (this.BA_Tested__c!=null &&
              this.BA_Tested__c.equals(other.getBA_Tested__c()))) &&
            ((this.BA_Ticket_Owner__c==null && other.getBA_Ticket_Owner__c()==null) || 
             (this.BA_Ticket_Owner__c!=null &&
              this.BA_Ticket_Owner__c.equals(other.getBA_Ticket_Owner__c()))) &&
            ((this.BA_Ticket_Owner__r==null && other.getBA_Ticket_Owner__r()==null) || 
             (this.BA_Ticket_Owner__r!=null &&
              this.BA_Ticket_Owner__r.equals(other.getBA_Ticket_Owner__r()))) &&
            ((this.best_Time_to_Contact__c==null && other.getBest_Time_to_Contact__c()==null) || 
             (this.best_Time_to_Contact__c!=null &&
              this.best_Time_to_Contact__c.equals(other.getBest_Time_to_Contact__c()))) &&
            ((this.best_Way_to_Contact__c==null && other.getBest_Way_to_Contact__c()==null) || 
             (this.best_Way_to_Contact__c!=null &&
              this.best_Way_to_Contact__c.equals(other.getBest_Way_to_Contact__c()))) &&
            ((this.billable__c==null && other.getBillable__c()==null) || 
             (this.billable__c!=null &&
              this.billable__c.equals(other.getBillable__c()))) &&
            ((this.bug_Patch_Resolution_Notes__c==null && other.getBug_Patch_Resolution_Notes__c()==null) || 
             (this.bug_Patch_Resolution_Notes__c!=null &&
              this.bug_Patch_Resolution_Notes__c.equals(other.getBug_Patch_Resolution_Notes__c()))) &&
            ((this.businessHours==null && other.getBusinessHours()==null) || 
             (this.businessHours!=null &&
              this.businessHours.equals(other.getBusinessHours()))) &&
            ((this.businessHoursId==null && other.getBusinessHoursId()==null) || 
             (this.businessHoursId!=null &&
              this.businessHoursId.equals(other.getBusinessHoursId()))) &&
            ((this.CS_Management_User__c==null && other.getCS_Management_User__c()==null) || 
             (this.CS_Management_User__c!=null &&
              this.CS_Management_User__c.equals(other.getCS_Management_User__c()))) &&
            ((this.CS_Management_User__r==null && other.getCS_Management_User__r()==null) || 
             (this.CS_Management_User__r!=null &&
              this.CS_Management_User__r.equals(other.getCS_Management_User__r()))) &&
            ((this.caseArticles==null && other.getCaseArticles()==null) || 
             (this.caseArticles!=null &&
              this.caseArticles.equals(other.getCaseArticles()))) &&
            ((this.caseComments==null && other.getCaseComments()==null) || 
             (this.caseComments!=null &&
              this.caseComments.equals(other.getCaseComments()))) &&
            ((this.caseContactRoles==null && other.getCaseContactRoles()==null) || 
             (this.caseContactRoles!=null &&
              this.caseContactRoles.equals(other.getCaseContactRoles()))) &&
            ((this.caseNumber==null && other.getCaseNumber()==null) || 
             (this.caseNumber!=null &&
              this.caseNumber.equals(other.getCaseNumber()))) &&
            ((this.caseSolutions==null && other.getCaseSolutions()==null) || 
             (this.caseSolutions!=null &&
              this.caseSolutions.equals(other.getCaseSolutions()))) &&
            ((this.case_Admin_2__c==null && other.getCase_Admin_2__c()==null) || 
             (this.case_Admin_2__c!=null &&
              this.case_Admin_2__c.equals(other.getCase_Admin_2__c()))) &&
            ((this.case_Admin_2__r==null && other.getCase_Admin_2__r()==null) || 
             (this.case_Admin_2__r!=null &&
              this.case_Admin_2__r.equals(other.getCase_Admin_2__r()))) &&
            ((this.case_Admin_3__c==null && other.getCase_Admin_3__c()==null) || 
             (this.case_Admin_3__c!=null &&
              this.case_Admin_3__c.equals(other.getCase_Admin_3__c()))) &&
            ((this.case_Admin_3__r==null && other.getCase_Admin_3__r()==null) || 
             (this.case_Admin_3__r!=null &&
              this.case_Admin_3__r.equals(other.getCase_Admin_3__r()))) &&
            ((this.case_Admin_4__c==null && other.getCase_Admin_4__c()==null) || 
             (this.case_Admin_4__c!=null &&
              this.case_Admin_4__c.equals(other.getCase_Admin_4__c()))) &&
            ((this.case_Admin_4__r==null && other.getCase_Admin_4__r()==null) || 
             (this.case_Admin_4__r!=null &&
              this.case_Admin_4__r.equals(other.getCase_Admin_4__r()))) &&
            ((this.case_Age_In_Business_Hours__c==null && other.getCase_Age_In_Business_Hours__c()==null) || 
             (this.case_Age_In_Business_Hours__c!=null &&
              this.case_Age_In_Business_Hours__c.equals(other.getCase_Age_In_Business_Hours__c()))) &&
            ((this.case_Age_Update__c==null && other.getCase_Age_Update__c()==null) || 
             (this.case_Age_Update__c!=null &&
              this.case_Age_Update__c.equals(other.getCase_Age_Update__c()))) &&
            ((this.case_Age__c==null && other.getCase_Age__c()==null) || 
             (this.case_Age__c!=null &&
              this.case_Age__c.equals(other.getCase_Age__c()))) &&
            ((this.case_Migration_Differential_Copies__r==null && other.getCase_Migration_Differential_Copies__r()==null) || 
             (this.case_Migration_Differential_Copies__r!=null &&
              this.case_Migration_Differential_Copies__r.equals(other.getCase_Migration_Differential_Copies__r()))) &&
            ((this.case_Status_Client_Active_Import_Export__c==null && other.getCase_Status_Client_Active_Import_Export__c()==null) || 
             (this.case_Status_Client_Active_Import_Export__c!=null &&
              this.case_Status_Client_Active_Import_Export__c.equals(other.getCase_Status_Client_Active_Import_Export__c()))) &&
            ((this.case_Status_Client_Active__c==null && other.getCase_Status_Client_Active__c()==null) || 
             (this.case_Status_Client_Active__c!=null &&
              this.case_Status_Client_Active__c.equals(other.getCase_Status_Client_Active__c()))) &&
            ((this.case_Template__c==null && other.getCase_Template__c()==null) || 
             (this.case_Template__c!=null &&
              this.case_Template__c.equals(other.getCase_Template__c()))) &&
            ((this.case_Template__r==null && other.getCase_Template__r()==null) || 
             (this.case_Template__r!=null &&
              this.case_Template__r.equals(other.getCase_Template__r()))) &&
            ((this.case_Time_Billable__c==null && other.getCase_Time_Billable__c()==null) || 
             (this.case_Time_Billable__c!=null &&
              this.case_Time_Billable__c.equals(other.getCase_Time_Billable__c()))) &&
            ((this.case_Time_Category__c==null && other.getCase_Time_Category__c()==null) || 
             (this.case_Time_Category__c!=null &&
              this.case_Time_Category__c.equals(other.getCase_Time_Category__c()))) &&
            ((this.cases==null && other.getCases()==null) || 
             (this.cases!=null &&
              this.cases.equals(other.getCases()))) &&
            ((this.cases__r==null && other.getCases__r()==null) || 
             (this.cases__r!=null &&
              this.cases__r.equals(other.getCases__r()))) &&
            ((this.category__c==null && other.getCategory__c()==null) || 
             (this.category__c!=null &&
              this.category__c.equals(other.getCategory__c()))) &&
            ((this.category__r==null && other.getCategory__r()==null) || 
             (this.category__r!=null &&
              this.category__r.equals(other.getCategory__r()))) &&
            ((this.certified_Admin_Static__c==null && other.getCertified_Admin_Static__c()==null) || 
             (this.certified_Admin_Static__c!=null &&
              this.certified_Admin_Static__c.equals(other.getCertified_Admin_Static__c()))) &&
            ((this.certified_Admin__c==null && other.getCertified_Admin__c()==null) || 
             (this.certified_Admin__c!=null &&
              this.certified_Admin__c.equals(other.getCertified_Admin__c()))) &&
            ((this.changeControlTicketAssociation__r==null && other.getChangeControlTicketAssociation__r()==null) || 
             (this.changeControlTicketAssociation__r!=null &&
              this.changeControlTicketAssociation__r.equals(other.getChangeControlTicketAssociation__r()))) &&
            ((this.checklists__r==null && other.getChecklists__r()==null) || 
             (this.checklists__r!=null &&
              this.checklists__r.equals(other.getChecklists__r()))) &&
            ((this.client_Contact_Status__c==null && other.getClient_Contact_Status__c()==null) || 
             (this.client_Contact_Status__c!=null &&
              this.client_Contact_Status__c.equals(other.getClient_Contact_Status__c()))) &&
            ((this.client_Contacted__c==null && other.getClient_Contacted__c()==null) || 
             (this.client_Contacted__c!=null &&
              this.client_Contacted__c.equals(other.getClient_Contacted__c()))) &&
            ((this.client_Email_Addresses__c==null && other.getClient_Email_Addresses__c()==null) || 
             (this.client_Email_Addresses__c!=null &&
              this.client_Email_Addresses__c.equals(other.getClient_Email_Addresses__c()))) &&
            ((this.client_Inernal_Tracking_Number__c==null && other.getClient_Inernal_Tracking_Number__c()==null) || 
             (this.client_Inernal_Tracking_Number__c!=null &&
              this.client_Inernal_Tracking_Number__c.equals(other.getClient_Inernal_Tracking_Number__c()))) &&
            ((this.client_Requested_Escalation__c==null && other.getClient_Requested_Escalation__c()==null) || 
             (this.client_Requested_Escalation__c!=null &&
              this.client_Requested_Escalation__c.equals(other.getClient_Requested_Escalation__c()))) &&
            ((this.client_Type__c==null && other.getClient_Type__c()==null) || 
             (this.client_Type__c!=null &&
              this.client_Type__c.equals(other.getClient_Type__c()))) &&
            ((this.closedDate==null && other.getClosedDate()==null) || 
             (this.closedDate!=null &&
              this.closedDate.equals(other.getClosedDate()))) &&
            ((this.closing_Note__c==null && other.getClosing_Note__c()==null) || 
             (this.closing_Note__c!=null &&
              this.closing_Note__c.equals(other.getClosing_Note__c()))) &&
            ((this.computer_Connected_To__c==null && other.getComputer_Connected_To__c()==null) || 
             (this.computer_Connected_To__c!=null &&
              this.computer_Connected_To__c.equals(other.getComputer_Connected_To__c()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.contactId==null && other.getContactId()==null) || 
             (this.contactId!=null &&
              this.contactId.equals(other.getContactId()))) &&
            ((this.contact_1__c==null && other.getContact_1__c()==null) || 
             (this.contact_1__c!=null &&
              this.contact_1__c.equals(other.getContact_1__c()))) &&
            ((this.contact_1__r==null && other.getContact_1__r()==null) || 
             (this.contact_1__r!=null &&
              this.contact_1__r.equals(other.getContact_1__r()))) &&
            ((this.content_Updates__c==null && other.getContent_Updates__c()==null) || 
             (this.content_Updates__c!=null &&
              this.content_Updates__c.equals(other.getContent_Updates__c()))) &&
            ((this.count_of_Case_Time_Records__c==null && other.getCount_of_Case_Time_Records__c()==null) || 
             (this.count_of_Case_Time_Records__c!=null &&
              this.count_of_Case_Time_Records__c.equals(other.getCount_of_Case_Time_Records__c()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.customization_and_Consulting__c==null && other.getCustomization_and_Consulting__c()==null) || 
             (this.customization_and_Consulting__c!=null &&
              this.customization_and_Consulting__c.equals(other.getCustomization_and_Consulting__c()))) &&
            ((this.data_Files__r==null && other.getData_Files__r()==null) || 
             (this.data_Files__r!=null &&
              this.data_Files__r.equals(other.getData_Files__r()))) &&
            ((this.database_Drive_Name__c==null && other.getDatabase_Drive_Name__c()==null) || 
             (this.database_Drive_Name__c!=null &&
              this.database_Drive_Name__c.equals(other.getDatabase_Drive_Name__c()))) &&
            ((this.date_Client_Requested_Escalation__c==null && other.getDate_Client_Requested_Escalation__c()==null) || 
             (this.date_Client_Requested_Escalation__c!=null &&
              this.date_Client_Requested_Escalation__c.equals(other.getDate_Client_Requested_Escalation__c()))) &&
            ((this.date_Escalated__c==null && other.getDate_Escalated__c()==null) || 
             (this.date_Escalated__c!=null &&
              this.date_Escalated__c.equals(other.getDate_Escalated__c()))) &&
            ((this.date_Escalated_for_Oracle_Defect_Review__c==null && other.getDate_Escalated_for_Oracle_Defect_Review__c()==null) || 
             (this.date_Escalated_for_Oracle_Defect_Review__c!=null &&
              this.date_Escalated_for_Oracle_Defect_Review__c.equals(other.getDate_Escalated_for_Oracle_Defect_Review__c()))) &&
            ((this.date_Escalated_for_PSI_Review__c==null && other.getDate_Escalated_for_PSI_Review__c()==null) || 
             (this.date_Escalated_for_PSI_Review__c!=null &&
              this.date_Escalated_for_PSI_Review__c.equals(other.getDate_Escalated_for_PSI_Review__c()))) &&
            ((this.date_Escalated_for_Problem_File_Review__c==null && other.getDate_Escalated_for_Problem_File_Review__c()==null) || 
             (this.date_Escalated_for_Problem_File_Review__c!=null &&
              this.date_Escalated_for_Problem_File_Review__c.equals(other.getDate_Escalated_for_Problem_File_Review__c()))) &&
            ((this.date_Escalated_for_Relativity_Bug_Review__c==null && other.getDate_Escalated_for_Relativity_Bug_Review__c()==null) || 
             (this.date_Escalated_for_Relativity_Bug_Review__c!=null &&
              this.date_Escalated_for_Relativity_Bug_Review__c.equals(other.getDate_Escalated_for_Relativity_Bug_Review__c()))) &&
            ((this.date_Escalated_for_bug_Review__c==null && other.getDate_Escalated_for_bug_Review__c()==null) || 
             (this.date_Escalated_for_bug_Review__c!=null &&
              this.date_Escalated_for_bug_Review__c.equals(other.getDate_Escalated_for_bug_Review__c()))) &&
            ((this.date_Escalated_to_Certification__c==null && other.getDate_Escalated_to_Certification__c()==null) || 
             (this.date_Escalated_to_Certification__c!=null &&
              this.date_Escalated_to_Certification__c.equals(other.getDate_Escalated_to_Certification__c()))) &&
            ((this.date_Escalated_to_Dev__c==null && other.getDate_Escalated_to_Dev__c()==null) || 
             (this.date_Escalated_to_Dev__c!=null &&
              this.date_Escalated_to_Dev__c.equals(other.getDate_Escalated_to_Dev__c()))) &&
            ((this.date_Escalated_to_Vendor__c==null && other.getDate_Escalated_to_Vendor__c()==null) || 
             (this.date_Escalated_to_Vendor__c!=null &&
              this.date_Escalated_to_Vendor__c.equals(other.getDate_Escalated_to_Vendor__c()))) &&
            ((this.date_Escalated_to_kIE__c==null && other.getDate_Escalated_to_kIE__c()==null) || 
             (this.date_Escalated_to_kIE__c!=null &&
              this.date_Escalated_to_kIE__c.equals(other.getDate_Escalated_to_kIE__c()))) &&
            ((this.date_Evaluated_For_Business_Impact__c==null && other.getDate_Evaluated_For_Business_Impact__c()==null) || 
             (this.date_Evaluated_For_Business_Impact__c!=null &&
              this.date_Evaluated_For_Business_Impact__c.equals(other.getDate_Evaluated_For_Business_Impact__c()))) &&
            ((this.date_KIE_Status_Completed__c==null && other.getDate_KIE_Status_Completed__c()==null) || 
             (this.date_KIE_Status_Completed__c!=null &&
              this.date_KIE_Status_Completed__c.equals(other.getDate_KIE_Status_Completed__c()))) &&
            ((this.date_Microsoft_case_opened__c==null && other.getDate_Microsoft_case_opened__c()==null) || 
             (this.date_Microsoft_case_opened__c!=null &&
              this.date_Microsoft_case_opened__c.equals(other.getDate_Microsoft_case_opened__c()))) &&
            ((this.date_Range__c==null && other.getDate_Range__c()==null) || 
             (this.date_Range__c!=null &&
              this.date_Range__c.equals(other.getDate_Range__c()))) &&
            ((this.date_Received__c==null && other.getDate_Received__c()==null) || 
             (this.date_Received__c!=null &&
              this.date_Received__c.equals(other.getDate_Received__c()))) &&
            ((this.date_Recommended_Upgrade__c==null && other.getDate_Recommended_Upgrade__c()==null) || 
             (this.date_Recommended_Upgrade__c!=null &&
              this.date_Recommended_Upgrade__c.equals(other.getDate_Recommended_Upgrade__c()))) &&
            ((this.date_Reviewed_for_KCD_Ticket__c==null && other.getDate_Reviewed_for_KCD_Ticket__c()==null) || 
             (this.date_Reviewed_for_KCD_Ticket__c!=null &&
              this.date_Reviewed_for_KCD_Ticket__c.equals(other.getDate_Reviewed_for_KCD_Ticket__c()))) &&
            ((this.date_Sent_to_Client__c==null && other.getDate_Sent_to_Client__c()==null) || 
             (this.date_Sent_to_Client__c!=null &&
              this.date_Sent_to_Client__c.equals(other.getDate_Sent_to_Client__c()))) &&
            ((this.date_Shipped_to_kCura__c==null && other.getDate_Shipped_to_kCura__c()==null) || 
             (this.date_Shipped_to_kCura__c!=null &&
              this.date_Shipped_to_kCura__c.equals(other.getDate_Shipped_to_kCura__c()))) &&
            ((this.date_Time_Outage_Started__c==null && other.getDate_Time_Outage_Started__c()==null) || 
             (this.date_Time_Outage_Started__c!=null &&
              this.date_Time_Outage_Started__c.equals(other.getDate_Time_Outage_Started__c()))) &&
            ((this.date_Time_Service_Restored__c==null && other.getDate_Time_Service_Restored__c()==null) || 
             (this.date_Time_Service_Restored__c!=null &&
              this.date_Time_Service_Restored__c.equals(other.getDate_Time_Service_Restored__c()))) &&
            ((this.date__c==null && other.getDate__c()==null) || 
             (this.date__c!=null &&
              this.date__c.equals(other.getDate__c()))) &&
            ((this.days_of_Month__c==null && other.getDays_of_Month__c()==null) || 
             (this.days_of_Month__c!=null &&
              this.days_of_Month__c.equals(other.getDays_of_Month__c()))) &&
            ((this.deadline__c==null && other.getDeadline__c()==null) || 
             (this.deadline__c!=null &&
              this.deadline__c.equals(other.getDeadline__c()))) &&
            ((this.deadline_for_Access_Creation__c==null && other.getDeadline_for_Access_Creation__c()==null) || 
             (this.deadline_for_Access_Creation__c!=null &&
              this.deadline_for_Access_Creation__c.equals(other.getDeadline_for_Access_Creation__c()))) &&
            ((this.deliver_By__c==null && other.getDeliver_By__c()==null) || 
             (this.deliver_By__c!=null &&
              this.deliver_By__c.equals(other.getDeliver_By__c()))) &&
            ((this.department_Sub__c==null && other.getDepartment_Sub__c()==null) || 
             (this.department_Sub__c!=null &&
              this.department_Sub__c.equals(other.getDepartment_Sub__c()))) &&
            ((this.department__c==null && other.getDepartment__c()==null) || 
             (this.department__c!=null &&
              this.department__c.equals(other.getDepartment__c()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.dev_Resource__c==null && other.getDev_Resource__c()==null) || 
             (this.dev_Resource__c!=null &&
              this.dev_Resource__c.equals(other.getDev_Resource__c()))) &&
            ((this.dev_Resource__r==null && other.getDev_Resource__r()==null) || 
             (this.dev_Resource__r!=null &&
              this.dev_Resource__r.equals(other.getDev_Resource__r()))) &&
            ((this.dev_Status__c==null && other.getDev_Status__c()==null) || 
             (this.dev_Status__c!=null &&
              this.dev_Status__c.equals(other.getDev_Status__c()))) &&
            ((this.dev_on_call_response__c==null && other.getDev_on_call_response__c()==null) || 
             (this.dev_on_call_response__c!=null &&
              this.dev_on_call_response__c.equals(other.getDev_on_call_response__c()))) &&
            ((this.development_End__c==null && other.getDevelopment_End__c()==null) || 
             (this.development_End__c!=null &&
              this.development_End__c.equals(other.getDevelopment_End__c()))) &&
            ((this.development_Start__c==null && other.getDevelopment_Start__c()==null) || 
             (this.development_Start__c!=null &&
              this.development_Start__c.equals(other.getDevelopment_Start__c()))) &&
            ((this.development_User__c==null && other.getDevelopment_User__c()==null) || 
             (this.development_User__c!=null &&
              this.development_User__c.equals(other.getDevelopment_User__c()))) &&
            ((this.development_User__r==null && other.getDevelopment_User__r()==null) || 
             (this.development_User__r!=null &&
              this.development_User__r.equals(other.getDevelopment_User__r()))) &&
            ((this.disclosure_and_Electronic_Signature__c==null && other.getDisclosure_and_Electronic_Signature__c()==null) || 
             (this.disclosure_and_Electronic_Signature__c!=null &&
              this.disclosure_and_Electronic_Signature__c.equals(other.getDisclosure_and_Electronic_Signature__c()))) &&
            ((this.do_Not_Send_Priority_Alert_Email__c==null && other.getDo_Not_Send_Priority_Alert_Email__c()==null) || 
             (this.do_Not_Send_Priority_Alert_Email__c!=null &&
              this.do_Not_Send_Priority_Alert_Email__c.equals(other.getDo_Not_Send_Priority_Alert_Email__c()))) &&
            ((this.do_Not_Send_Survey__c==null && other.getDo_Not_Send_Survey__c()==null) || 
             (this.do_Not_Send_Survey__c!=null &&
              this.do_Not_Send_Survey__c.equals(other.getDo_Not_Send_Survey__c()))) &&
            ((this.document_Format__c==null && other.getDocument_Format__c()==null) || 
             (this.document_Format__c!=null &&
              this.document_Format__c.equals(other.getDocument_Format__c()))) &&
            ((this.drive_Location__c==null && other.getDrive_Location__c()==null) || 
             (this.drive_Location__c!=null &&
              this.drive_Location__c.equals(other.getDrive_Location__c()))) &&
            ((this.drive_Name__c==null && other.getDrive_Name__c()==null) || 
             (this.drive_Name__c!=null &&
              this.drive_Name__c.equals(other.getDrive_Name__c()))) &&
            ((this.drive_Status__c==null && other.getDrive_Status__c()==null) || 
             (this.drive_Status__c!=null &&
              this.drive_Status__c.equals(other.getDrive_Status__c()))) &&
            ((this.due_Date__c==null && other.getDue_Date__c()==null) || 
             (this.due_Date__c!=null &&
              this.due_Date__c.equals(other.getDue_Date__c()))) &&
            ((this.effort_Estimate__c==null && other.getEffort_Estimate__c()==null) || 
             (this.effort_Estimate__c!=null &&
              this.effort_Estimate__c.equals(other.getEffort_Estimate__c()))) &&
            ((this.emailMessages==null && other.getEmailMessages()==null) || 
             (this.emailMessages!=null &&
              this.emailMessages.equals(other.getEmailMessages()))) &&
            ((this.email_Address__c==null && other.getEmail_Address__c()==null) || 
             (this.email_Address__c!=null &&
              this.email_Address__c.equals(other.getEmail_Address__c()))) &&
            ((this.environment_Sub__c==null && other.getEnvironment_Sub__c()==null) || 
             (this.environment_Sub__c!=null &&
              this.environment_Sub__c.equals(other.getEnvironment_Sub__c()))) &&
            ((this.environment__c==null && other.getEnvironment__c()==null) || 
             (this.environment__c!=null &&
              this.environment__c.equals(other.getEnvironment__c()))) &&
            ((this.error_File_Type__c==null && other.getError_File_Type__c()==null) || 
             (this.error_File_Type__c!=null &&
              this.error_File_Type__c.equals(other.getError_File_Type__c()))) &&
            ((this.error_Reproducable__c==null && other.getError_Reproducable__c()==null) || 
             (this.error_Reproducable__c!=null &&
              this.error_Reproducable__c.equals(other.getError_Reproducable__c()))) &&
            ((this.error__c==null && other.getError__c()==null) || 
             (this.error__c!=null &&
              this.error__c.equals(other.getError__c()))) &&
            ((this.escalate_to_Dev__c==null && other.getEscalate_to_Dev__c()==null) || 
             (this.escalate_to_Dev__c!=null &&
              this.escalate_to_Dev__c.equals(other.getEscalate_to_Dev__c()))) &&
            ((this.escalated_for_Bug_Review_By__c==null && other.getEscalated_for_Bug_Review_By__c()==null) || 
             (this.escalated_for_Bug_Review_By__c!=null &&
              this.escalated_for_Bug_Review_By__c.equals(other.getEscalated_for_Bug_Review_By__c()))) &&
            ((this.escalated_for_Bug_Review__c==null && other.getEscalated_for_Bug_Review__c()==null) || 
             (this.escalated_for_Bug_Review__c!=null &&
              this.escalated_for_Bug_Review__c.equals(other.getEscalated_for_Bug_Review__c()))) &&
            ((this.escalated_for_Oracle_Defect_Review_By__c==null && other.getEscalated_for_Oracle_Defect_Review_By__c()==null) || 
             (this.escalated_for_Oracle_Defect_Review_By__c!=null &&
              this.escalated_for_Oracle_Defect_Review_By__c.equals(other.getEscalated_for_Oracle_Defect_Review_By__c()))) &&
            ((this.escalated_for_Oracle_Defect_Review__c==null && other.getEscalated_for_Oracle_Defect_Review__c()==null) || 
             (this.escalated_for_Oracle_Defect_Review__c!=null &&
              this.escalated_for_Oracle_Defect_Review__c.equals(other.getEscalated_for_Oracle_Defect_Review__c()))) &&
            ((this.escalated_for_PSI_Review_By__c==null && other.getEscalated_for_PSI_Review_By__c()==null) || 
             (this.escalated_for_PSI_Review_By__c!=null &&
              this.escalated_for_PSI_Review_By__c.equals(other.getEscalated_for_PSI_Review_By__c()))) &&
            ((this.escalated_for_PSI_Review__c==null && other.getEscalated_for_PSI_Review__c()==null) || 
             (this.escalated_for_PSI_Review__c!=null &&
              this.escalated_for_PSI_Review__c.equals(other.getEscalated_for_PSI_Review__c()))) &&
            ((this.escalated_for_Problem_File_Review_By__c==null && other.getEscalated_for_Problem_File_Review_By__c()==null) || 
             (this.escalated_for_Problem_File_Review_By__c!=null &&
              this.escalated_for_Problem_File_Review_By__c.equals(other.getEscalated_for_Problem_File_Review_By__c()))) &&
            ((this.escalated_for_Problem_File_Review__c==null && other.getEscalated_for_Problem_File_Review__c()==null) || 
             (this.escalated_for_Problem_File_Review__c!=null &&
              this.escalated_for_Problem_File_Review__c.equals(other.getEscalated_for_Problem_File_Review__c()))) &&
            ((this.escalated_for_Relativity_Bug_Review_By__c==null && other.getEscalated_for_Relativity_Bug_Review_By__c()==null) || 
             (this.escalated_for_Relativity_Bug_Review_By__c!=null &&
              this.escalated_for_Relativity_Bug_Review_By__c.equals(other.getEscalated_for_Relativity_Bug_Review_By__c()))) &&
            ((this.escalated_for_Relativity_Bug_Review__c==null && other.getEscalated_for_Relativity_Bug_Review__c()==null) || 
             (this.escalated_for_Relativity_Bug_Review__c!=null &&
              this.escalated_for_Relativity_Bug_Review__c.equals(other.getEscalated_for_Relativity_Bug_Review__c()))) &&
            ((this.escalated_to_Certification_By__c==null && other.getEscalated_to_Certification_By__c()==null) || 
             (this.escalated_to_Certification_By__c!=null &&
              this.escalated_to_Certification_By__c.equals(other.getEscalated_to_Certification_By__c()))) &&
            ((this.escalated_to_Certification__c==null && other.getEscalated_to_Certification__c()==null) || 
             (this.escalated_to_Certification__c!=null &&
              this.escalated_to_Certification__c.equals(other.getEscalated_to_Certification__c()))) &&
            ((this.escalated_to_Dev_By__c==null && other.getEscalated_to_Dev_By__c()==null) || 
             (this.escalated_to_Dev_By__c!=null &&
              this.escalated_to_Dev_By__c.equals(other.getEscalated_to_Dev_By__c()))) &&
            ((this.escalated_to_KIE_By__c==null && other.getEscalated_to_KIE_By__c()==null) || 
             (this.escalated_to_KIE_By__c!=null &&
              this.escalated_to_KIE_By__c.equals(other.getEscalated_to_KIE_By__c()))) &&
            ((this.escalated_to_L2_Person__c==null && other.getEscalated_to_L2_Person__c()==null) || 
             (this.escalated_to_L2_Person__c!=null &&
              this.escalated_to_L2_Person__c.equals(other.getEscalated_to_L2_Person__c()))) &&
            ((this.escalated_to_L2__c==null && other.getEscalated_to_L2__c()==null) || 
             (this.escalated_to_L2__c!=null &&
              this.escalated_to_L2__c.equals(other.getEscalated_to_L2__c()))) &&
            ((this.escalated_to_Vendor_By__c==null && other.getEscalated_to_Vendor_By__c()==null) || 
             (this.escalated_to_Vendor_By__c!=null &&
              this.escalated_to_Vendor_By__c.equals(other.getEscalated_to_Vendor_By__c()))) &&
            ((this.escalated_to_Vendor__c==null && other.getEscalated_to_Vendor__c()==null) || 
             (this.escalated_to_Vendor__c!=null &&
              this.escalated_to_Vendor__c.equals(other.getEscalated_to_Vendor__c()))) &&
            ((this.escalated_to_kIE__c==null && other.getEscalated_to_kIE__c()==null) || 
             (this.escalated_to_kIE__c!=null &&
              this.escalated_to_kIE__c.equals(other.getEscalated_to_kIE__c()))) &&
            ((this.estimated_Billable_Time_alert__c==null && other.getEstimated_Billable_Time_alert__c()==null) || 
             (this.estimated_Billable_Time_alert__c!=null &&
              this.estimated_Billable_Time_alert__c.equals(other.getEstimated_Billable_Time_alert__c()))) &&
            ((this.estimated_Time_High__c==null && other.getEstimated_Time_High__c()==null) || 
             (this.estimated_Time_High__c!=null &&
              this.estimated_Time_High__c.equals(other.getEstimated_Time_High__c()))) &&
            ((this.estimated_Time_Low__c==null && other.getEstimated_Time_Low__c()==null) || 
             (this.estimated_Time_Low__c!=null &&
              this.estimated_Time_Low__c.equals(other.getEstimated_Time_Low__c()))) &&
            ((this.evaluated_for_Business_Impact_By__c==null && other.getEvaluated_for_Business_Impact_By__c()==null) || 
             (this.evaluated_for_Business_Impact_By__c!=null &&
              this.evaluated_for_Business_Impact_By__c.equals(other.getEvaluated_for_Business_Impact_By__c()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              this.events.equals(other.getEvents()))) &&
            ((this.expected_Load_Date__c==null && other.getExpected_Load_Date__c()==null) || 
             (this.expected_Load_Date__c!=null &&
              this.expected_Load_Date__c.equals(other.getExpected_Load_Date__c()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.feedbacks__r==null && other.getFeedbacks__r()==null) || 
             (this.feedbacks__r!=null &&
              this.feedbacks__r.equals(other.getFeedbacks__r()))) &&
            ((this.feeds==null && other.getFeeds()==null) || 
             (this.feeds!=null &&
              this.feeds.equals(other.getFeeds()))) &&
            ((this.file_Copy_Drive_Name__c==null && other.getFile_Copy_Drive_Name__c()==null) || 
             (this.file_Copy_Drive_Name__c!=null &&
              this.file_Copy_Drive_Name__c.equals(other.getFile_Copy_Drive_Name__c()))) &&
            ((this.file_Count__c==null && other.getFile_Count__c()==null) || 
             (this.file_Count__c!=null &&
              this.file_Count__c.equals(other.getFile_Count__c()))) &&
            ((this.file_Pervasiveness__c==null && other.getFile_Pervasiveness__c()==null) || 
             (this.file_Pervasiveness__c!=null &&
              this.file_Pervasiveness__c.equals(other.getFile_Pervasiveness__c()))) &&
            ((this.file_Size_GB__c==null && other.getFile_Size_GB__c()==null) || 
             (this.file_Size_GB__c!=null &&
              this.file_Size_GB__c.equals(other.getFile_Size_GB__c()))) &&
            ((this.follow_up_Items__c==null && other.getFollow_up_Items__c()==null) || 
             (this.follow_up_Items__c!=null &&
              this.follow_up_Items__c.equals(other.getFollow_up_Items__c()))) &&
            ((this.follow_up_Response_Deadline__c==null && other.getFollow_up_Response_Deadline__c()==null) || 
             (this.follow_up_Response_Deadline__c!=null &&
              this.follow_up_Response_Deadline__c.equals(other.getFollow_up_Response_Deadline__c()))) &&
            ((this.grouping__c==null && other.getGrouping__c()==null) || 
             (this.grouping__c!=null &&
              this.grouping__c.equals(other.getGrouping__c()))) &&
            ((this.groups_and_Users__c==null && other.getGroups_and_Users__c()==null) || 
             (this.groups_and_Users__c!=null &&
              this.groups_and_Users__c.equals(other.getGroups_and_Users__c()))) &&
            ((this.HCW_Ticket__c==null && other.getHCW_Ticket__c()==null) || 
             (this.HCW_Ticket__c!=null &&
              this.HCW_Ticket__c.equals(other.getHCW_Ticket__c()))) &&
            ((this.HCW_Ticket__r==null && other.getHCW_Ticket__r()==null) || 
             (this.HCW_Ticket__r!=null &&
              this.HCW_Ticket__r.equals(other.getHCW_Ticket__r()))) &&
            ((this.hasCommentsUnreadByOwner==null && other.getHasCommentsUnreadByOwner()==null) || 
             (this.hasCommentsUnreadByOwner!=null &&
              this.hasCommentsUnreadByOwner.equals(other.getHasCommentsUnreadByOwner()))) &&
            ((this.hasSelfServiceComments==null && other.getHasSelfServiceComments()==null) || 
             (this.hasSelfServiceComments!=null &&
              this.hasSelfServiceComments.equals(other.getHasSelfServiceComments()))) &&
            ((this.has_Custom_Solution__c==null && other.getHas_Custom_Solution__c()==null) || 
             (this.has_Custom_Solution__c!=null &&
              this.has_Custom_Solution__c.equals(other.getHas_Custom_Solution__c()))) &&
            ((this.has_Custom_Solution_old__c==null && other.getHas_Custom_Solution_old__c()==null) || 
             (this.has_Custom_Solution_old__c!=null &&
              this.has_Custom_Solution_old__c.equals(other.getHas_Custom_Solution_old__c()))) &&
            ((this.has_Non_Licensing_DLLs__c==null && other.getHas_Non_Licensing_DLLs__c()==null) || 
             (this.has_Non_Licensing_DLLs__c!=null &&
              this.has_Non_Licensing_DLLs__c.equals(other.getHas_Non_Licensing_DLLs__c()))) &&
            ((this.help_Group__c==null && other.getHelp_Group__c()==null) || 
             (this.help_Group__c!=null &&
              this.help_Group__c.equals(other.getHelp_Group__c()))) &&
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
            ((this.hour_Entered_Pause_State__c==null && other.getHour_Entered_Pause_State__c()==null) || 
             (this.hour_Entered_Pause_State__c!=null &&
              this.hour_Entered_Pause_State__c.equals(other.getHour_Entered_Pause_State__c()))) &&
            ((this.hour_in_Customer_Action__c==null && other.getHour_in_Customer_Action__c()==null) || 
             (this.hour_in_Customer_Action__c!=null &&
              this.hour_in_Customer_Action__c.equals(other.getHour_in_Customer_Action__c()))) &&
            ((this.hours__c==null && other.getHours__c()==null) || 
             (this.hours__c!=null &&
              this.hours__c.equals(other.getHours__c()))) &&
            ((this.impact__c==null && other.getImpact__c()==null) || 
             (this.impact__c!=null &&
              this.impact__c.equals(other.getImpact__c()))) &&
            ((this.impeded__c==null && other.getImpeded__c()==null) || 
             (this.impeded__c!=null &&
              this.impeded__c.equals(other.getImpeded__c()))) &&
            ((this.inbound_Tracking_Number__c==null && other.getInbound_Tracking_Number__c()==null) || 
             (this.inbound_Tracking_Number__c!=null &&
              this.inbound_Tracking_Number__c.equals(other.getInbound_Tracking_Number__c()))) &&
            ((this.initial_Client_Contact__c==null && other.getInitial_Client_Contact__c()==null) || 
             (this.initial_Client_Contact__c!=null &&
              this.initial_Client_Contact__c.equals(other.getInitial_Client_Contact__c()))) &&
            ((this.initial_Estimate__c==null && other.getInitial_Estimate__c()==null) || 
             (this.initial_Estimate__c!=null &&
              this.initial_Estimate__c.equals(other.getInitial_Estimate__c()))) &&
            ((this.instance__c==null && other.getInstance__c()==null) || 
             (this.instance__c!=null &&
              this.instance__c.equals(other.getInstance__c()))) &&
            ((this.instance__r==null && other.getInstance__r()==null) || 
             (this.instance__r!=null &&
              this.instance__r.equals(other.getInstance__r()))) &&
            ((this.isClosed==null && other.getIsClosed()==null) || 
             (this.isClosed!=null &&
              this.isClosed.equals(other.getIsClosed()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.isEscalated==null && other.getIsEscalated()==null) || 
             (this.isEscalated!=null &&
              this.isEscalated.equals(other.getIsEscalated()))) &&
            ((this.isVisibleInSelfService==null && other.getIsVisibleInSelfService()==null) || 
             (this.isVisibleInSelfService!=null &&
              this.isVisibleInSelfService.equals(other.getIsVisibleInSelfService()))) &&
            ((this.is_Admin_Contact__c==null && other.getIs_Admin_Contact__c()==null) || 
             (this.is_Admin_Contact__c!=null &&
              this.is_Admin_Contact__c.equals(other.getIs_Admin_Contact__c()))) &&
            ((this.issue_Description__c==null && other.getIssue_Description__c()==null) || 
             (this.issue_Description__c!=null &&
              this.issue_Description__c.equals(other.getIssue_Description__c()))) &&
            ((this.items_Delivered__c==null && other.getItems_Delivered__c()==null) || 
             (this.items_Delivered__c!=null &&
              this.items_Delivered__c.equals(other.getItems_Delivered__c()))) &&
            ((this.KCD_Solution_Recipient__c==null && other.getKCD_Solution_Recipient__c()==null) || 
             (this.KCD_Solution_Recipient__c!=null &&
              this.KCD_Solution_Recipient__c.equals(other.getKCD_Solution_Recipient__c()))) &&
            ((this.KCD_Solution_Recipients__r==null && other.getKCD_Solution_Recipients__r()==null) || 
             (this.KCD_Solution_Recipients__r!=null &&
              this.KCD_Solution_Recipients__r.equals(other.getKCD_Solution_Recipients__r()))) &&
            ((this.known_Defect__c==null && other.getKnown_Defect__c()==null) || 
             (this.known_Defect__c!=null &&
              this.known_Defect__c.equals(other.getKnown_Defect__c()))) &&
            ((this.lab__c==null && other.getLab__c()==null) || 
             (this.lab__c!=null &&
              this.lab__c.equals(other.getLab__c()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.last_Status_Change__c==null && other.getLast_Status_Change__c()==null) || 
             (this.last_Status_Change__c!=null &&
              this.last_Status_Change__c.equals(other.getLast_Status_Change__c()))) &&
            ((this.location__c==null && other.getLocation__c()==null) || 
             (this.location__c!=null &&
              this.location__c.equals(other.getLocation__c()))) &&
            ((this.location_of_Document__c==null && other.getLocation_of_Document__c()==null) || 
             (this.location_of_Document__c!=null &&
              this.location_of_Document__c.equals(other.getLocation_of_Document__c()))) &&
            ((this.long_Term_Actual_Date__c==null && other.getLong_Term_Actual_Date__c()==null) || 
             (this.long_Term_Actual_Date__c!=null &&
              this.long_Term_Actual_Date__c.equals(other.getLong_Term_Actual_Date__c()))) &&
            ((this.long_Term_Corrective_Action__c==null && other.getLong_Term_Corrective_Action__c()==null) || 
             (this.long_Term_Corrective_Action__c!=null &&
              this.long_Term_Corrective_Action__c.equals(other.getLong_Term_Corrective_Action__c()))) &&
            ((this.long_Term_Scheduled_Date__c==null && other.getLong_Term_Scheduled_Date__c()==null) || 
             (this.long_Term_Scheduled_Date__c!=null &&
              this.long_Term_Scheduled_Date__c.equals(other.getLong_Term_Scheduled_Date__c()))) &&
            ((this.MDF_Size_GB__c==null && other.getMDF_Size_GB__c()==null) || 
             (this.MDF_Size_GB__c!=null &&
              this.MDF_Size_GB__c.equals(other.getMDF_Size_GB__c()))) &&
            ((this.make__c==null && other.getMake__c()==null) || 
             (this.make__c!=null &&
              this.make__c.equals(other.getMake__c()))) &&
            ((this.marketing_Surveys__r==null && other.getMarketing_Surveys__r()==null) || 
             (this.marketing_Surveys__r!=null &&
              this.marketing_Surveys__r.equals(other.getMarketing_Surveys__r()))) &&
            ((this.medium__c==null && other.getMedium__c()==null) || 
             (this.medium__c!=null &&
              this.medium__c.equals(other.getMedium__c()))) &&
            ((this.microsoft_Case_Owner_Email__c==null && other.getMicrosoft_Case_Owner_Email__c()==null) || 
             (this.microsoft_Case_Owner_Email__c!=null &&
              this.microsoft_Case_Owner_Email__c.equals(other.getMicrosoft_Case_Owner_Email__c()))) &&
            ((this.microsoft_Case_Owner_Tel__c==null && other.getMicrosoft_Case_Owner_Tel__c()==null) || 
             (this.microsoft_Case_Owner_Tel__c!=null &&
              this.microsoft_Case_Owner_Tel__c.equals(other.getMicrosoft_Case_Owner_Tel__c()))) &&
            ((this.microsoft_Case_Owner__c==null && other.getMicrosoft_Case_Owner__c()==null) || 
             (this.microsoft_Case_Owner__c!=null &&
              this.microsoft_Case_Owner__c.equals(other.getMicrosoft_Case_Owner__c()))) &&
            ((this.microsoft_Case__c==null && other.getMicrosoft_Case__c()==null) || 
             (this.microsoft_Case__c!=null &&
              this.microsoft_Case__c.equals(other.getMicrosoft_Case__c()))) &&
            ((this.microsoft_Severity_Level__c==null && other.getMicrosoft_Severity_Level__c()==null) || 
             (this.microsoft_Severity_Level__c!=null &&
              this.microsoft_Severity_Level__c.equals(other.getMicrosoft_Severity_Level__c()))) &&
            ((this.microsoft_Telephone_Number__c==null && other.getMicrosoft_Telephone_Number__c()==null) || 
             (this.microsoft_Telephone_Number__c!=null &&
              this.microsoft_Telephone_Number__c.equals(other.getMicrosoft_Telephone_Number__c()))) &&
            ((this.migration_End_Date__c==null && other.getMigration_End_Date__c()==null) || 
             (this.migration_End_Date__c!=null &&
              this.migration_End_Date__c.equals(other.getMigration_End_Date__c()))) &&
            ((this.migration_Initial_File_Copy_Start_Date__c==null && other.getMigration_Initial_File_Copy_Start_Date__c()==null) || 
             (this.migration_Initial_File_Copy_Start_Date__c!=null &&
              this.migration_Initial_File_Copy_Start_Date__c.equals(other.getMigration_Initial_File_Copy_Start_Date__c()))) &&
            ((this.migration_Number_of_Files_Copied__c==null && other.getMigration_Number_of_Files_Copied__c()==null) || 
             (this.migration_Number_of_Files_Copied__c!=null &&
              this.migration_Number_of_Files_Copied__c.equals(other.getMigration_Number_of_Files_Copied__c()))) &&
            ((this.migration_Size_GB__c==null && other.getMigration_Size_GB__c()==null) || 
             (this.migration_Size_GB__c!=null &&
              this.migration_Size_GB__c.equals(other.getMigration_Size_GB__c()))) &&
            ((this.missed_SLA_Deadline_Ticket_Owner__c==null && other.getMissed_SLA_Deadline_Ticket_Owner__c()==null) || 
             (this.missed_SLA_Deadline_Ticket_Owner__c!=null &&
              this.missed_SLA_Deadline_Ticket_Owner__c.equals(other.getMissed_SLA_Deadline_Ticket_Owner__c()))) &&
            ((this.model_Product_Number__c==null && other.getModel_Product_Number__c()==null) || 
             (this.model_Product_Number__c!=null &&
              this.model_Product_Number__c.equals(other.getModel_Product_Number__c()))) &&
            ((this.name__c==null && other.getName__c()==null) || 
             (this.name__c!=null &&
              this.name__c.equals(other.getName__c()))) &&
            ((this.name_of_Document__c==null && other.getName_of_Document__c()==null) || 
             (this.name_of_Document__c!=null &&
              this.name_of_Document__c.equals(other.getName_of_Document__c()))) &&
            ((this.needs_Immediate_Attention__c==null && other.getNeeds_Immediate_Attention__c()==null) || 
             (this.needs_Immediate_Attention__c!=null &&
              this.needs_Immediate_Attention__c.equals(other.getNeeds_Immediate_Attention__c()))) &&
            ((this.new_Case_Name__c==null && other.getNew_Case_Name__c()==null) || 
             (this.new_Case_Name__c!=null &&
              this.new_Case_Name__c.equals(other.getNew_Case_Name__c()))) &&
            ((this.new_Comment__c==null && other.getNew_Comment__c()==null) || 
             (this.new_Comment__c!=null &&
              this.new_Comment__c.equals(other.getNew_Comment__c()))) &&
            ((this.no_Show__c==null && other.getNo_Show__c()==null) || 
             (this.no_Show__c!=null &&
              this.no_Show__c.equals(other.getNo_Show__c()))) &&
            ((this.notes__c==null && other.getNotes__c()==null) || 
             (this.notes__c!=null &&
              this.notes__c.equals(other.getNotes__c()))) &&
            ((this.number_of_Event_Handlers__c==null && other.getNumber_of_Event_Handlers__c()==null) || 
             (this.number_of_Event_Handlers__c!=null &&
              this.number_of_Event_Handlers__c.equals(other.getNumber_of_Event_Handlers__c()))) &&
            ((this.number_of_Relativity_Analytics_Indexes__c==null && other.getNumber_of_Relativity_Analytics_Indexes__c()==null) || 
             (this.number_of_Relativity_Analytics_Indexes__c!=null &&
              this.number_of_Relativity_Analytics_Indexes__c.equals(other.getNumber_of_Relativity_Analytics_Indexes__c()))) &&
            ((this.number_of_dtSearch_Indexes__c==null && other.getNumber_of_dtSearch_Indexes__c()==null) || 
             (this.number_of_dtSearch_Indexes__c!=null &&
              this.number_of_dtSearch_Indexes__c.equals(other.getNumber_of_dtSearch_Indexes__c()))) &&
            ((this.openActivities==null && other.getOpenActivities()==null) || 
             (this.openActivities!=null &&
              this.openActivities.equals(other.getOpenActivities()))) &&
            ((this.opened_Day_of_the_Week__c==null && other.getOpened_Day_of_the_Week__c()==null) || 
             (this.opened_Day_of_the_Week__c!=null &&
              this.opened_Day_of_the_Week__c.equals(other.getOpened_Day_of_the_Week__c()))) &&
            ((this.opportunity__c==null && other.getOpportunity__c()==null) || 
             (this.opportunity__c!=null &&
              this.opportunity__c.equals(other.getOpportunity__c()))) &&
            ((this.opportunity__r==null && other.getOpportunity__r()==null) || 
             (this.opportunity__r!=null &&
              this.opportunity__r.equals(other.getOpportunity__r()))) &&
            ((this.oracle_Bug_Number__c==null && other.getOracle_Bug_Number__c()==null) || 
             (this.oracle_Bug_Number__c!=null &&
              this.oracle_Bug_Number__c.equals(other.getOracle_Bug_Number__c()))) &&
            ((this.oracle_Status__c==null && other.getOracle_Status__c()==null) || 
             (this.oracle_Status__c!=null &&
              this.oracle_Status__c.equals(other.getOracle_Status__c()))) &&
            ((this.oracle_Ticket_Created_On__c==null && other.getOracle_Ticket_Created_On__c()==null) || 
             (this.oracle_Ticket_Created_On__c!=null &&
              this.oracle_Ticket_Created_On__c.equals(other.getOracle_Ticket_Created_On__c()))) &&
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin()))) &&
            ((this.original_Ticket__c==null && other.getOriginal_Ticket__c()==null) || 
             (this.original_Ticket__c!=null &&
              this.original_Ticket__c.equals(other.getOriginal_Ticket__c()))) &&
            ((this.other__c==null && other.getOther__c()==null) || 
             (this.other__c!=null &&
              this.other__c.equals(other.getOther__c()))) &&
            ((this.outbound_Tracking_Number__c==null && other.getOutbound_Tracking_Number__c()==null) || 
             (this.outbound_Tracking_Number__c!=null &&
              this.outbound_Tracking_Number__c.equals(other.getOutbound_Tracking_Number__c()))) &&
            ((this.overnight_SLA__c==null && other.getOvernight_SLA__c()==null) || 
             (this.overnight_SLA__c!=null &&
              this.overnight_SLA__c.equals(other.getOvernight_SLA__c()))) &&
            ((this.override_Account_Validation__c==null && other.getOverride_Account_Validation__c()==null) || 
             (this.override_Account_Validation__c!=null &&
              this.override_Account_Validation__c.equals(other.getOverride_Account_Validation__c()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.owner_Profile__c==null && other.getOwner_Profile__c()==null) || 
             (this.owner_Profile__c!=null &&
              this.owner_Profile__c.equals(other.getOwner_Profile__c()))) &&
            ((this.owner_Role__c==null && other.getOwner_Role__c()==null) || 
             (this.owner_Role__c!=null &&
              this.owner_Role__c.equals(other.getOwner_Role__c()))) &&
            ((this.PS_Defect_Class__c==null && other.getPS_Defect_Class__c()==null) || 
             (this.PS_Defect_Class__c!=null &&
              this.PS_Defect_Class__c.equals(other.getPS_Defect_Class__c()))) &&
            ((this.PS_QC_Comments__c==null && other.getPS_QC_Comments__c()==null) || 
             (this.PS_QC_Comments__c!=null &&
              this.PS_QC_Comments__c.equals(other.getPS_QC_Comments__c()))) &&
            ((this.PS_QC_Status__c==null && other.getPS_QC_Status__c()==null) || 
             (this.PS_QC_Status__c!=null &&
              this.PS_QC_Status__c.equals(other.getPS_QC_Status__c()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.parentId==null && other.getParentId()==null) || 
             (this.parentId!=null &&
              this.parentId.equals(other.getParentId()))) &&
            ((this.partner_Kickoffs__r==null && other.getPartner_Kickoffs__r()==null) || 
             (this.partner_Kickoffs__r!=null &&
              this.partner_Kickoffs__r.equals(other.getPartner_Kickoffs__r()))) &&
            ((this.patch_Number__c==null && other.getPatch_Number__c()==null) || 
             (this.patch_Number__c!=null &&
              this.patch_Number__c.equals(other.getPatch_Number__c()))) &&
            ((this.person_Returned_To__c==null && other.getPerson_Returned_To__c()==null) || 
             (this.person_Returned_To__c!=null &&
              this.person_Returned_To__c.equals(other.getPerson_Returned_To__c()))) &&
            ((this.person_Returned_To__r==null && other.getPerson_Returned_To__r()==null) || 
             (this.person_Returned_To__r!=null &&
              this.person_Returned_To__r.equals(other.getPerson_Returned_To__r()))) &&
            ((this.person_Who_Shipped__c==null && other.getPerson_Who_Shipped__c()==null) || 
             (this.person_Who_Shipped__c!=null &&
              this.person_Who_Shipped__c.equals(other.getPerson_Who_Shipped__c()))) &&
            ((this.person_Who_Shipped__r==null && other.getPerson_Who_Shipped__r()==null) || 
             (this.person_Who_Shipped__r!=null &&
              this.person_Who_Shipped__r.equals(other.getPerson_Who_Shipped__r()))) &&
            ((this.planned_File_Location__c==null && other.getPlanned_File_Location__c()==null) || 
             (this.planned_File_Location__c!=null &&
              this.planned_File_Location__c.equals(other.getPlanned_File_Location__c()))) &&
            ((this.pod_Account__c==null && other.getPod_Account__c()==null) || 
             (this.pod_Account__c!=null &&
              this.pod_Account__c.equals(other.getPod_Account__c()))) &&
            ((this.pod_User__c==null && other.getPod_User__c()==null) || 
             (this.pod_User__c!=null &&
              this.pod_User__c.equals(other.getPod_User__c()))) &&
            ((this.pod__c==null && other.getPod__c()==null) || 
             (this.pod__c!=null &&
              this.pod__c.equals(other.getPod__c()))) &&
            ((this.price_Per_User_2__c==null && other.getPrice_Per_User_2__c()==null) || 
             (this.price_Per_User_2__c!=null &&
              this.price_Per_User_2__c.equals(other.getPrice_Per_User_2__c()))) &&
            ((this.price_per_gb__c==null && other.getPrice_per_gb__c()==null) || 
             (this.price_per_gb__c!=null &&
              this.price_per_gb__c.equals(other.getPrice_per_gb__c()))) &&
            ((this.pricing_Schedule__c==null && other.getPricing_Schedule__c()==null) || 
             (this.pricing_Schedule__c!=null &&
              this.pricing_Schedule__c.equals(other.getPricing_Schedule__c()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.problem_Management_Flag__c==null && other.getProblem_Management_Flag__c()==null) || 
             (this.problem_Management_Flag__c!=null &&
              this.problem_Management_Flag__c.equals(other.getProblem_Management_Flag__c()))) &&
            ((this.problem_Mgmt_Ticket__c==null && other.getProblem_Mgmt_Ticket__c()==null) || 
             (this.problem_Mgmt_Ticket__c!=null &&
              this.problem_Mgmt_Ticket__c.equals(other.getProblem_Mgmt_Ticket__c()))) &&
            ((this.problem_Mgmt_Ticket__r==null && other.getProblem_Mgmt_Ticket__r()==null) || 
             (this.problem_Mgmt_Ticket__r!=null &&
              this.problem_Mgmt_Ticket__r.equals(other.getProblem_Mgmt_Ticket__r()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.product_Application__c==null && other.getProduct_Application__c()==null) || 
             (this.product_Application__c!=null &&
              this.product_Application__c.equals(other.getProduct_Application__c()))) &&
            ((this.product__c==null && other.getProduct__c()==null) || 
             (this.product__c!=null &&
              this.product__c.equals(other.getProduct__c()))) &&
            ((this.project_Phase__c==null && other.getProject_Phase__c()==null) || 
             (this.project_Phase__c!=null &&
              this.project_Phase__c.equals(other.getProject_Phase__c()))) &&
            ((this.proposal_Approved__c==null && other.getProposal_Approved__c()==null) || 
             (this.proposal_Approved__c!=null &&
              this.proposal_Approved__c.equals(other.getProposal_Approved__c()))) &&
            ((this.QC_Comments__c==null && other.getQC_Comments__c()==null) || 
             (this.QC_Comments__c!=null &&
              this.QC_Comments__c.equals(other.getQC_Comments__c()))) &&
            ((this.QC_Date__c==null && other.getQC_Date__c()==null) || 
             (this.QC_Date__c!=null &&
              this.QC_Date__c.equals(other.getQC_Date__c()))) &&
            ((this.QC_Person__c==null && other.getQC_Person__c()==null) || 
             (this.QC_Person__c!=null &&
              this.QC_Person__c.equals(other.getQC_Person__c()))) &&
            ((this.QC_Person__r==null && other.getQC_Person__r()==null) || 
             (this.QC_Person__r!=null &&
              this.QC_Person__r.equals(other.getQC_Person__r()))) &&
            ((this.QC_Status__c==null && other.getQC_Status__c()==null) || 
             (this.QC_Status__c!=null &&
              this.QC_Status__c.equals(other.getQC_Status__c()))) &&
            ((this.question==null && other.getQuestion()==null) || 
             (this.question!=null &&
              this.question.equals(other.getQuestion()))) &&
            ((this.questionId==null && other.getQuestionId()==null) || 
             (this.questionId!=null &&
              this.questionId.equals(other.getQuestionId()))) &&
            ((this.quick_Guide__c==null && other.getQuick_Guide__c()==null) || 
             (this.quick_Guide__c!=null &&
              this.quick_Guide__c.equals(other.getQuick_Guide__c()))) &&
            ((this.RCA_Certified_Date__c==null && other.getRCA_Certified_Date__c()==null) || 
             (this.RCA_Certified_Date__c!=null &&
              this.RCA_Certified_Date__c.equals(other.getRCA_Certified_Date__c()))) &&
            ((this.random_Sample__c==null && other.getRandom_Sample__c()==null) || 
             (this.random_Sample__c!=null &&
              this.random_Sample__c.equals(other.getRandom_Sample__c()))) &&
            ((this.re_Work_From_Prior_Ticket__c==null && other.getRe_Work_From_Prior_Ticket__c()==null) || 
             (this.re_Work_From_Prior_Ticket__c!=null &&
              this.re_Work_From_Prior_Ticket__c.equals(other.getRe_Work_From_Prior_Ticket__c()))) &&
            ((this.reason_for_No_Survey__c==null && other.getReason_for_No_Survey__c()==null) || 
             (this.reason_for_No_Survey__c!=null &&
              this.reason_for_No_Survey__c.equals(other.getReason_for_No_Survey__c()))) &&
            ((this.recommended_Upgrade__c==null && other.getRecommended_Upgrade__c()==null) || 
             (this.recommended_Upgrade__c!=null &&
              this.recommended_Upgrade__c.equals(other.getRecommended_Upgrade__c()))) &&
            ((this.recordType==null && other.getRecordType()==null) || 
             (this.recordType!=null &&
              this.recordType.equals(other.getRecordType()))) &&
            ((this.recordTypeId==null && other.getRecordTypeId()==null) || 
             (this.recordTypeId!=null &&
              this.recordTypeId.equals(other.getRecordTypeId()))) &&
            ((this.relAn_Date_Verified__c==null && other.getRelAn_Date_Verified__c()==null) || 
             (this.relAn_Date_Verified__c!=null &&
              this.relAn_Date_Verified__c.equals(other.getRelAn_Date_Verified__c()))) &&
            ((this.relAn_Drive_Name__c==null && other.getRelAn_Drive_Name__c()==null) || 
             (this.relAn_Drive_Name__c!=null &&
              this.relAn_Drive_Name__c.equals(other.getRelAn_Drive_Name__c()))) &&
            ((this.relativity_Case__c==null && other.getRelativity_Case__c()==null) || 
             (this.relativity_Case__c!=null &&
              this.relativity_Case__c.equals(other.getRelativity_Case__c()))) &&
            ((this.relativity_Case__r==null && other.getRelativity_Case__r()==null) || 
             (this.relativity_Case__r!=null &&
              this.relativity_Case__r.equals(other.getRelativity_Case__r()))) &&
            ((this.relativity_Version_Fixed__c==null && other.getRelativity_Version_Fixed__c()==null) || 
             (this.relativity_Version_Fixed__c!=null &&
              this.relativity_Version_Fixed__c.equals(other.getRelativity_Version_Fixed__c()))) &&
            ((this.relativity_Version_Fixed__r==null && other.getRelativity_Version_Fixed__r()==null) || 
             (this.relativity_Version_Fixed__r!=null &&
              this.relativity_Version_Fixed__r.equals(other.getRelativity_Version_Fixed__r()))) &&
            ((this.relativity_Version__c==null && other.getRelativity_Version__c()==null) || 
             (this.relativity_Version__c!=null &&
              this.relativity_Version__c.equals(other.getRelativity_Version__c()))) &&
            ((this.release_Verified__c==null && other.getRelease_Verified__c()==null) || 
             (this.release_Verified__c!=null &&
              this.release_Verified__c.equals(other.getRelease_Verified__c()))) &&
            ((this.release__c==null && other.getRelease__c()==null) || 
             (this.release__c!=null &&
              this.release__c.equals(other.getRelease__c()))) &&
            ((this.release__r==null && other.getRelease__r()==null) || 
             (this.release__r!=null &&
              this.release__r.equals(other.getRelease__r()))) &&
            ((this.report_Details__c==null && other.getReport_Details__c()==null) || 
             (this.report_Details__c!=null &&
              this.report_Details__c.equals(other.getReport_Details__c()))) &&
            ((this.request_Type__c==null && other.getRequest_Type__c()==null) || 
             (this.request_Type__c!=null &&
              this.request_Type__c.equals(other.getRequest_Type__c()))) &&
            ((this.requested_Due_Date__c==null && other.getRequested_Due_Date__c()==null) || 
             (this.requested_Due_Date__c!=null &&
              this.requested_Due_Date__c.equals(other.getRequested_Due_Date__c()))) &&
            ((this.research__c==null && other.getResearch__c()==null) || 
             (this.research__c!=null &&
              this.research__c.equals(other.getResearch__c()))) &&
            ((this.retail_Box_Incuded__c==null && other.getRetail_Box_Incuded__c()==null) || 
             (this.retail_Box_Incuded__c!=null &&
              this.retail_Box_Incuded__c.equals(other.getRetail_Box_Incuded__c()))) &&
            ((this.return_with_Origninal_Shipping_Container__c==null && other.getReturn_with_Origninal_Shipping_Container__c()==null) || 
             (this.return_with_Origninal_Shipping_Container__c!=null &&
              this.return_with_Origninal_Shipping_Container__c.equals(other.getReturn_with_Origninal_Shipping_Container__c()))) &&
            ((this.review_for_KCD_By__c==null && other.getReview_for_KCD_By__c()==null) || 
             (this.review_for_KCD_By__c!=null &&
              this.review_for_KCD_By__c.equals(other.getReview_for_KCD_By__c()))) &&
            ((this.review_for_KCD_Ticket__c==null && other.getReview_for_KCD_Ticket__c()==null) || 
             (this.review_for_KCD_Ticket__c!=null &&
              this.review_for_KCD_Ticket__c.equals(other.getReview_for_KCD_Ticket__c()))) &&
            ((this.root_Cause_Description__c==null && other.getRoot_Cause_Description__c()==null) || 
             (this.root_Cause_Description__c!=null &&
              this.root_Cause_Description__c.equals(other.getRoot_Cause_Description__c()))) &&
            ((this.root_Cause_Sub__c==null && other.getRoot_Cause_Sub__c()==null) || 
             (this.root_Cause_Sub__c!=null &&
              this.root_Cause_Sub__c.equals(other.getRoot_Cause_Sub__c()))) &&
            ((this.root_Cause__c==null && other.getRoot_Cause__c()==null) || 
             (this.root_Cause__c!=null &&
              this.root_Cause__c.equals(other.getRoot_Cause__c()))) &&
            ((this.SFDC_Projects__r==null && other.getSFDC_Projects__r()==null) || 
             (this.SFDC_Projects__r!=null &&
              this.SFDC_Projects__r.equals(other.getSFDC_Projects__r()))) &&
            ((this.SLA_Exceeded__c==null && other.getSLA_Exceeded__c()==null) || 
             (this.SLA_Exceeded__c!=null &&
              this.SLA_Exceeded__c.equals(other.getSLA_Exceeded__c()))) &&
            ((this.SLA_Missed_By__c==null && other.getSLA_Missed_By__c()==null) || 
             (this.SLA_Missed_By__c!=null &&
              this.SLA_Missed_By__c.equals(other.getSLA_Missed_By__c()))) &&
            ((this.SLA_Response_Deadline__c==null && other.getSLA_Response_Deadline__c()==null) || 
             (this.SLA_Response_Deadline__c!=null &&
              this.SLA_Response_Deadline__c.equals(other.getSLA_Response_Deadline__c()))) &&
            ((this.SLA_Response_Time__c==null && other.getSLA_Response_Time__c()==null) || 
             (this.SLA_Response_Time__c!=null &&
              this.SLA_Response_Time__c.equals(other.getSLA_Response_Time__c()))) &&
            ((this.SR_Number__c==null && other.getSR_Number__c()==null) || 
             (this.SR_Number__c!=null &&
              this.SR_Number__c.equals(other.getSR_Number__c()))) &&
            ((this.sales_Queue_Ownership__c==null && other.getSales_Queue_Ownership__c()==null) || 
             (this.sales_Queue_Ownership__c!=null &&
              this.sales_Queue_Ownership__c.equals(other.getSales_Queue_Ownership__c()))) &&
            ((this.sales_Queue__c==null && other.getSales_Queue__c()==null) || 
             (this.sales_Queue__c!=null &&
              this.sales_Queue__c.equals(other.getSales_Queue__c()))) &&
            ((this.sales_Type_Sub__c==null && other.getSales_Type_Sub__c()==null) || 
             (this.sales_Type_Sub__c!=null &&
              this.sales_Type_Sub__c.equals(other.getSales_Type_Sub__c()))) &&
            ((this.sales_Type__c==null && other.getSales_Type__c()==null) || 
             (this.sales_Type__c!=null &&
              this.sales_Type__c.equals(other.getSales_Type__c()))) &&
            ((this.scheduled__c==null && other.getScheduled__c()==null) || 
             (this.scheduled__c!=null &&
              this.scheduled__c.equals(other.getScheduled__c()))) &&
            ((this.school_Program__c==null && other.getSchool_Program__c()==null) || 
             (this.school_Program__c!=null &&
              this.school_Program__c.equals(other.getSchool_Program__c()))) &&
            ((this.send_Email_Survey__c==null && other.getSend_Email_Survey__c()==null) || 
             (this.send_Email_Survey__c!=null &&
              this.send_Email_Survey__c.equals(other.getSend_Email_Survey__c()))) &&
            ((this.serial_Number__c==null && other.getSerial_Number__c()==null) || 
             (this.serial_Number__c!=null &&
              this.serial_Number__c.equals(other.getSerial_Number__c()))) &&
            ((this.server_Application__c==null && other.getServer_Application__c()==null) || 
             (this.server_Application__c!=null &&
              this.server_Application__c.equals(other.getServer_Application__c()))) &&
            ((this.server_OS__c==null && other.getServer_OS__c()==null) || 
             (this.server_OS__c!=null &&
              this.server_OS__c.equals(other.getServer_OS__c()))) &&
            ((this.shares==null && other.getShares()==null) || 
             (this.shares!=null &&
              this.shares.equals(other.getShares()))) &&
            ((this.shipped_Date__c==null && other.getShipped_Date__c()==null) || 
             (this.shipped_Date__c!=null &&
              this.shipped_Date__c.equals(other.getShipped_Date__c()))) &&
            ((this.short_Term_Actual_Date__c==null && other.getShort_Term_Actual_Date__c()==null) || 
             (this.short_Term_Actual_Date__c!=null &&
              this.short_Term_Actual_Date__c.equals(other.getShort_Term_Actual_Date__c()))) &&
            ((this.short_Term_Corrective_Action__c==null && other.getShort_Term_Corrective_Action__c()==null) || 
             (this.short_Term_Corrective_Action__c!=null &&
              this.short_Term_Corrective_Action__c.equals(other.getShort_Term_Corrective_Action__c()))) &&
            ((this.short_Term_Scheduled_Date__c==null && other.getShort_Term_Scheduled_Date__c()==null) || 
             (this.short_Term_Scheduled_Date__c!=null &&
              this.short_Term_Scheduled_Date__c.equals(other.getShort_Term_Scheduled_Date__c()))) &&
            ((this.signature__c==null && other.getSignature__c()==null) || 
             (this.signature__c!=null &&
              this.signature__c.equals(other.getSignature__c()))) &&
            ((this.simple_Template__c==null && other.getSimple_Template__c()==null) || 
             (this.simple_Template__c!=null &&
              this.simple_Template__c.equals(other.getSimple_Template__c()))) &&
            ((this.solutions==null && other.getSolutions()==null) || 
             (this.solutions!=null &&
              this.solutions.equals(other.getSolutions()))) &&
            ((this.special_Instructions__c==null && other.getSpecial_Instructions__c()==null) || 
             (this.special_Instructions__c!=null &&
              this.special_Instructions__c.equals(other.getSpecial_Instructions__c()))) &&
            ((this.specifics__c==null && other.getSpecifics__c()==null) || 
             (this.specifics__c!=null &&
              this.specifics__c.equals(other.getSpecifics__c()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.status_Call_End_Date__c==null && other.getStatus_Call_End_Date__c()==null) || 
             (this.status_Call_End_Date__c!=null &&
              this.status_Call_End_Date__c.equals(other.getStatus_Call_End_Date__c()))) &&
            ((this.status_Call_Start_Date__c==null && other.getStatus_Call_Start_Date__c()==null) || 
             (this.status_Call_Start_Date__c!=null &&
              this.status_Call_Start_Date__c.equals(other.getStatus_Call_Start_Date__c()))) &&
            ((this.status_Description__c==null && other.getStatus_Description__c()==null) || 
             (this.status_Description__c!=null &&
              this.status_Description__c.equals(other.getStatus_Description__c()))) &&
            ((this.status_Last_Modified_del__c==null && other.getStatus_Last_Modified_del__c()==null) || 
             (this.status_Last_Modified_del__c!=null &&
              this.status_Last_Modified_del__c.equals(other.getStatus_Last_Modified_del__c()))) &&
            ((this.status_Meeting_Conference_Info__c==null && other.getStatus_Meeting_Conference_Info__c()==null) || 
             (this.status_Meeting_Conference_Info__c!=null &&
              this.status_Meeting_Conference_Info__c.equals(other.getStatus_Meeting_Conference_Info__c()))) &&
            ((this.status_Meeting_Notes__c==null && other.getStatus_Meeting_Notes__c()==null) || 
             (this.status_Meeting_Notes__c!=null &&
              this.status_Meeting_Notes__c.equals(other.getStatus_Meeting_Notes__c()))) &&
            ((this.status_Meeting__c==null && other.getStatus_Meeting__c()==null) || 
             (this.status_Meeting__c!=null &&
              this.status_Meeting__c.equals(other.getStatus_Meeting__c()))) &&
            ((this.status_Meeting__r==null && other.getStatus_Meeting__r()==null) || 
             (this.status_Meeting__r!=null &&
              this.status_Meeting__r.equals(other.getStatus_Meeting__r()))) &&
            ((this.study_Material__c==null && other.getStudy_Material__c()==null) || 
             (this.study_Material__c!=null &&
              this.study_Material__c.equals(other.getStudy_Material__c()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.suppliedEmail==null && other.getSuppliedEmail()==null) || 
             (this.suppliedEmail!=null &&
              this.suppliedEmail.equals(other.getSuppliedEmail()))) &&
            ((this.suppliedName==null && other.getSuppliedName()==null) || 
             (this.suppliedName!=null &&
              this.suppliedName.equals(other.getSuppliedName()))) &&
            ((this.support_Hours__c==null && other.getSupport_Hours__c()==null) || 
             (this.support_Hours__c!=null &&
              this.support_Hours__c.equals(other.getSupport_Hours__c()))) &&
            ((this.support_Sample_Number__c==null && other.getSupport_Sample_Number__c()==null) || 
             (this.support_Sample_Number__c!=null &&
              this.support_Sample_Number__c.equals(other.getSupport_Sample_Number__c()))) &&
            ((this.support__c==null && other.getSupport__c()==null) || 
             (this.support__c!=null &&
              this.support__c.equals(other.getSupport__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              this.tasks.equals(other.getTasks()))) &&
            ((this.teamMembers==null && other.getTeamMembers()==null) || 
             (this.teamMembers!=null &&
              this.teamMembers.equals(other.getTeamMembers()))) &&
            ((this.teamTemplateRecords==null && other.getTeamTemplateRecords()==null) || 
             (this.teamTemplateRecords!=null &&
              this.teamTemplateRecords.equals(other.getTeamTemplateRecords()))) &&
            ((this.technical_Resource__c==null && other.getTechnical_Resource__c()==null) || 
             (this.technical_Resource__c!=null &&
              this.technical_Resource__c.equals(other.getTechnical_Resource__c()))) &&
            ((this.test_Case_to_Reproduce__c==null && other.getTest_Case_to_Reproduce__c()==null) || 
             (this.test_Case_to_Reproduce__c!=null &&
              this.test_Case_to_Reproduce__c.equals(other.getTest_Case_to_Reproduce__c()))) &&
            ((this.ticketReleaseAssociations__r==null && other.getTicketReleaseAssociations__r()==null) || 
             (this.ticketReleaseAssociations__r!=null &&
              this.ticketReleaseAssociations__r.equals(other.getTicketReleaseAssociations__r()))) &&
            ((this.ticket_ReOpened__c==null && other.getTicket_ReOpened__c()==null) || 
             (this.ticket_ReOpened__c!=null &&
              this.ticket_ReOpened__c.equals(other.getTicket_ReOpened__c()))) &&
            ((this.tier_1_User__c==null && other.getTier_1_User__c()==null) || 
             (this.tier_1_User__c!=null &&
              this.tier_1_User__c.equals(other.getTier_1_User__c()))) &&
            ((this.tier_1_User__r==null && other.getTier_1_User__r()==null) || 
             (this.tier_1_User__r!=null &&
              this.tier_1_User__r.equals(other.getTier_1_User__r()))) &&
            ((this.tier_2_User__c==null && other.getTier_2_User__c()==null) || 
             (this.tier_2_User__c!=null &&
              this.tier_2_User__c.equals(other.getTier_2_User__c()))) &&
            ((this.tier_2_User__r==null && other.getTier_2_User__r()==null) || 
             (this.tier_2_User__r!=null &&
              this.tier_2_User__r.equals(other.getTier_2_User__r()))) &&
            ((this.tier_Assignment_Flag__c==null && other.getTier_Assignment_Flag__c()==null) || 
             (this.tier_Assignment_Flag__c!=null &&
              this.tier_Assignment_Flag__c.equals(other.getTier_Assignment_Flag__c()))) &&
            ((this.tier_Assignment__c==null && other.getTier_Assignment__c()==null) || 
             (this.tier_Assignment__c!=null &&
              this.tier_Assignment__c.equals(other.getTier_Assignment__c()))) &&
            ((this.time_Difference_Final__c==null && other.getTime_Difference_Final__c()==null) || 
             (this.time_Difference_Final__c!=null &&
              this.time_Difference_Final__c.equals(other.getTime_Difference_Final__c()))) &&
            ((this.time_Spent_on_Ticket__c==null && other.getTime_Spent_on_Ticket__c()==null) || 
             (this.time_Spent_on_Ticket__c!=null &&
              this.time_Spent_on_Ticket__c.equals(other.getTime_Spent_on_Ticket__c()))) &&
            ((this.time_Tracking_Type__c==null && other.getTime_Tracking_Type__c()==null) || 
             (this.time_Tracking_Type__c!=null &&
              this.time_Tracking_Type__c.equals(other.getTime_Tracking_Type__c()))) &&
            ((this.time_With_Customer__c==null && other.getTime_With_Customer__c()==null) || 
             (this.time_With_Customer__c!=null &&
              this.time_With_Customer__c.equals(other.getTime_With_Customer__c()))) &&
            ((this.time_With_Support__c==null && other.getTime_With_Support__c()==null) || 
             (this.time_With_Support__c!=null &&
              this.time_With_Support__c.equals(other.getTime_With_Support__c()))) &&
            ((this.time_in_Queue__c==null && other.getTime_in_Queue__c()==null) || 
             (this.time_in_Queue__c!=null &&
              this.time_in_Queue__c.equals(other.getTime_in_Queue__c()))) &&
            ((this.time_on_Case_del__c==null && other.getTime_on_Case_del__c()==null) || 
             (this.time_on_Case_del__c!=null &&
              this.time_on_Case_del__c.equals(other.getTime_on_Case_del__c()))) &&
            ((this.total_Billable_Time__c==null && other.getTotal_Billable_Time__c()==null) || 
             (this.total_Billable_Time__c!=null &&
              this.total_Billable_Time__c.equals(other.getTotal_Billable_Time__c()))) &&
            ((this.total_Data_Size_in_GB__c==null && other.getTotal_Data_Size_in_GB__c()==null) || 
             (this.total_Data_Size_in_GB__c!=null &&
              this.total_Data_Size_in_GB__c.equals(other.getTotal_Data_Size_in_GB__c()))) &&
            ((this.total_Escalated_Tickets__c==null && other.getTotal_Escalated_Tickets__c()==null) || 
             (this.total_Escalated_Tickets__c!=null &&
              this.total_Escalated_Tickets__c.equals(other.getTotal_Escalated_Tickets__c()))) &&
            ((this.total_Escalated_for_Bug_Review__c==null && other.getTotal_Escalated_for_Bug_Review__c()==null) || 
             (this.total_Escalated_for_Bug_Review__c!=null &&
              this.total_Escalated_for_Bug_Review__c.equals(other.getTotal_Escalated_for_Bug_Review__c()))) &&
            ((this.total_Escalated_to_Dev__c==null && other.getTotal_Escalated_to_Dev__c()==null) || 
             (this.total_Escalated_to_Dev__c!=null &&
              this.total_Escalated_to_Dev__c.equals(other.getTotal_Escalated_to_Dev__c()))) &&
            ((this.total_Evaluated_for_Business_Impact__c==null && other.getTotal_Evaluated_for_Business_Impact__c()==null) || 
             (this.total_Evaluated_for_Business_Impact__c!=null &&
              this.total_Evaluated_for_Business_Impact__c.equals(other.getTotal_Evaluated_for_Business_Impact__c()))) &&
            ((this.total_Number_of_Deliverables__c==null && other.getTotal_Number_of_Deliverables__c()==null) || 
             (this.total_Number_of_Deliverables__c!=null &&
              this.total_Number_of_Deliverables__c.equals(other.getTotal_Number_of_Deliverables__c()))) &&
            ((this.total_Time__c==null && other.getTotal_Time__c()==null) || 
             (this.total_Time__c!=null &&
              this.total_Time__c.equals(other.getTotal_Time__c()))) &&
            ((this.trainer_Outline__c==null && other.getTrainer_Outline__c()==null) || 
             (this.trainer_Outline__c!=null &&
              this.trainer_Outline__c.equals(other.getTrainer_Outline__c()))) &&
            ((this.training_Category__c==null && other.getTraining_Category__c()==null) || 
             (this.training_Category__c!=null &&
              this.training_Category__c.equals(other.getTraining_Category__c()))) &&
            ((this.training_PPT__c==null && other.getTraining_PPT__c()==null) || 
             (this.training_PPT__c!=null &&
              this.training_PPT__c.equals(other.getTraining_PPT__c()))) &&
            ((this.training_Workbook__c==null && other.getTraining_Workbook__c()==null) || 
             (this.training_Workbook__c!=null &&
              this.training_Workbook__c.equals(other.getTraining_Workbook__c()))) &&
            ((this.transaction__c==null && other.getTransaction__c()==null) || 
             (this.transaction__c!=null &&
              this.transaction__c.equals(other.getTransaction__c()))) &&
            ((this.transaction__r==null && other.getTransaction__r()==null) || 
             (this.transaction__r!=null &&
              this.transaction__r.equals(other.getTransaction__r()))) &&
            ((this.tutorial__c==null && other.getTutorial__c()==null) || 
             (this.tutorial__c!=null &&
              this.tutorial__c.equals(other.getTutorial__c()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.type_Sub__c==null && other.getType_Sub__c()==null) || 
             (this.type_Sub__c!=null &&
              this.type_Sub__c.equals(other.getType_Sub__c()))) &&
            ((this.type_of_Document__c==null && other.getType_of_Document__c()==null) || 
             (this.type_of_Document__c!=null &&
              this.type_of_Document__c.equals(other.getType_of_Document__c()))) &&
            ((this.update_Interval_Start_Date__c==null && other.getUpdate_Interval_Start_Date__c()==null) || 
             (this.update_Interval_Start_Date__c!=null &&
              this.update_Interval_Start_Date__c.equals(other.getUpdate_Interval_Start_Date__c()))) &&
            ((this.update_Interval__c==null && other.getUpdate_Interval__c()==null) || 
             (this.update_Interval__c!=null &&
              this.update_Interval__c.equals(other.getUpdate_Interval__c()))) &&
            ((this.urgency__c==null && other.getUrgency__c()==null) || 
             (this.urgency__c!=null &&
              this.urgency__c.equals(other.getUrgency__c()))) &&
            ((this.user__c==null && other.getUser__c()==null) || 
             (this.user__c!=null &&
              this.user__c.equals(other.getUser__c()))) &&
            ((this.user__r==null && other.getUser__r()==null) || 
             (this.user__r!=null &&
              this.user__r.equals(other.getUser__r()))) &&
            ((this.validated_In_Version__c==null && other.getValidated_In_Version__c()==null) || 
             (this.validated_In_Version__c!=null &&
              this.validated_In_Version__c.equals(other.getValidated_In_Version__c()))) &&
            ((this.vendor__c==null && other.getVendor__c()==null) || 
             (this.vendor__c!=null &&
              this.vendor__c.equals(other.getVendor__c()))) &&
            ((this.verify_Release__c==null && other.getVerify_Release__c()==null) || 
             (this.verify_Release__c!=null &&
              this.verify_Release__c.equals(other.getVerify_Release__c()))) &&
            ((this.version_Origin__c==null && other.getVersion_Origin__c()==null) || 
             (this.version_Origin__c!=null &&
              this.version_Origin__c.equals(other.getVersion_Origin__c()))) &&
            ((this.version__c==null && other.getVersion__c()==null) || 
             (this.version__c!=null &&
              this.version__c.equals(other.getVersion__c()))) &&
            ((this.video__c==null && other.getVideo__c()==null) || 
             (this.video__c!=null &&
              this.video__c.equals(other.getVideo__c()))) &&
            ((this.viewer_Version_Fixed__c==null && other.getViewer_Version_Fixed__c()==null) || 
             (this.viewer_Version_Fixed__c!=null &&
              this.viewer_Version_Fixed__c.equals(other.getViewer_Version_Fixed__c()))) &&
            ((this.webinar_Recording__c==null && other.getWebinar_Recording__c()==null) || 
             (this.webinar_Recording__c!=null &&
              this.webinar_Recording__c.equals(other.getWebinar_Recording__c()))) &&
            ((this.webinar__c==null && other.getWebinar__c()==null) || 
             (this.webinar__c!=null &&
              this.webinar__c.equals(other.getWebinar__c()))) &&
            ((this.what__c==null && other.getWhat__c()==null) || 
             (this.what__c!=null &&
              this.what__c.equals(other.getWhat__c()))) &&
            ((this.where_is_drive__c==null && other.getWhere_is_drive__c()==null) || 
             (this.where_is_drive__c!=null &&
              this.where_is_drive__c.equals(other.getWhere_is_drive__c()))) &&
            ((this.where_is_drive__r==null && other.getWhere_is_drive__r()==null) || 
             (this.where_is_drive__r!=null &&
              this.where_is_drive__r.equals(other.getWhere_is_drive__r()))) &&
            ((this.workaround_Actual_Date__c==null && other.getWorkaround_Actual_Date__c()==null) || 
             (this.workaround_Actual_Date__c!=null &&
              this.workaround_Actual_Date__c.equals(other.getWorkaround_Actual_Date__c()))) &&
            ((this.workaround_Scheduled_Date__c==null && other.getWorkaround_Scheduled_Date__c()==null) || 
             (this.workaround_Scheduled_Date__c!=null &&
              this.workaround_Scheduled_Date__c.equals(other.getWorkaround_Scheduled_Date__c()))) &&
            ((this.workaround__c==null && other.getWorkaround__c()==null) || 
             (this.workaround__c!=null &&
              this.workaround__c.equals(other.getWorkaround__c()))) &&
            ((this.x24_Hour_Follow_up_Deadline_Missed__c==null && other.getX24_Hour_Follow_up_Deadline_Missed__c()==null) || 
             (this.x24_Hour_Follow_up_Deadline_Missed__c!=null &&
              this.x24_Hour_Follow_up_Deadline_Missed__c.equals(other.getX24_Hour_Follow_up_Deadline_Missed__c()))) &&
            ((this.x90_Day_Deployment_Checkup_Date__c==null && other.getX90_Day_Deployment_Checkup_Date__c()==null) || 
             (this.x90_Day_Deployment_Checkup_Date__c!=null &&
              this.x90_Day_Deployment_Checkup_Date__c.equals(other.getX90_Day_Deployment_Checkup_Date__c()))) &&
            ((this.YTD_Total_Days__c==null && other.getYTD_Total_Days__c()==null) || 
             (this.YTD_Total_Days__c!=null &&
              this.YTD_Total_Days__c.equals(other.getYTD_Total_Days__c()))) &&
            ((this.dtSearch_Date_Verified__c==null && other.getDtSearch_Date_Verified__c()==null) || 
             (this.dtSearch_Date_Verified__c!=null &&
              this.dtSearch_Date_Verified__c.equals(other.getDtSearch_Date_Verified__c()))) &&
            ((this.dtSearch_Drive_Name__c==null && other.getDtSearch_Drive_Name__c()==null) || 
             (this.dtSearch_Drive_Name__c!=null &&
              this.dtSearch_Drive_Name__c.equals(other.getDtSearch_Drive_Name__c()))) &&
            ((this.kCura_Email_Addresses__c==null && other.getKCura_Email_Addresses__c()==null) || 
             (this.kCura_Email_Addresses__c!=null &&
              this.kCura_Email_Addresses__c.equals(other.getKCura_Email_Addresses__c()))) &&
            ((this.kIE_Age__c==null && other.getKIE_Age__c()==null) || 
             (this.kIE_Age__c!=null &&
              this.kIE_Age__c.equals(other.getKIE_Age__c()))) &&
            ((this.kIE_Resource__c==null && other.getKIE_Resource__c()==null) || 
             (this.kIE_Resource__c!=null &&
              this.kIE_Resource__c.equals(other.getKIE_Resource__c()))) &&
            ((this.kIE_Resource__r==null && other.getKIE_Resource__r()==null) || 
             (this.kIE_Resource__r!=null &&
              this.kIE_Resource__r.equals(other.getKIE_Resource__r()))) &&
            ((this.kIE_Status__c==null && other.getKIE_Status__c()==null) || 
             (this.kIE_Status__c!=null &&
              this.kIE_Status__c.equals(other.getKIE_Status__c()))) &&
            ((this.time_in_new__c==null && other.getTime_in_new__c()==null) || 
             (this.time_in_new__c!=null &&
              this.time_in_new__c.equals(other.getTime_in_new__c()))) &&
            ((this.xEvaluate_for_Business_Impact__c==null && other.getXEvaluate_for_Business_Impact__c()==null) || 
             (this.xEvaluate_for_Business_Impact__c!=null &&
              this.xEvaluate_for_Business_Impact__c.equals(other.getXEvaluate_for_Business_Impact__c())));
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
        if (getAM_PM__c() != null) {
            _hashCode += getAM_PM__c().hashCode();
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getAccount_Alert__c() != null) {
            _hashCode += getAccount_Alert__c().hashCode();
        }
        if (getActivityHistories() != null) {
            _hashCode += getActivityHistories().hashCode();
        }
        if (getActual_Billable_Time__c() != null) {
            _hashCode += getActual_Billable_Time__c().hashCode();
        }
        if (getAdd_to_Official_Doc_Set__c() != null) {
            _hashCode += getAdd_to_Official_Doc_Set__c().hashCode();
        }
        if (getAdded_to_Backlog_Date__c() != null) {
            _hashCode += getAdded_to_Backlog_Date__c().hashCode();
        }
        if (getAdmin_Contact__c() != null) {
            _hashCode += getAdmin_Contact__c().hashCode();
        }
        if (getApplications_Installed__c() != null) {
            _hashCode += getApplications_Installed__c().hashCode();
        }
        if (getApproved__c() != null) {
            _hashCode += getApproved__c().hashCode();
        }
        if (getApproximate_Time_Spent__c() != null) {
            _hashCode += getApproximate_Time_Spent__c().hashCode();
        }
        if (getArea__c() != null) {
            _hashCode += getArea__c().hashCode();
        }
        if (getAssociated_Ticket_s__c() != null) {
            _hashCode += getAssociated_Ticket_s__c().hashCode();
        }
        if (getAssociated_Tickets__r() != null) {
            _hashCode += getAssociated_Tickets__r().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getAvoidance_Comments__c() != null) {
            _hashCode += getAvoidance_Comments__c().hashCode();
        }
        if (getAvoidance__c() != null) {
            _hashCode += getAvoidance__c().hashCode();
        }
        if (getBA_Tested__c() != null) {
            _hashCode += getBA_Tested__c().hashCode();
        }
        if (getBA_Ticket_Owner__c() != null) {
            _hashCode += getBA_Ticket_Owner__c().hashCode();
        }
        if (getBA_Ticket_Owner__r() != null) {
            _hashCode += getBA_Ticket_Owner__r().hashCode();
        }
        if (getBest_Time_to_Contact__c() != null) {
            _hashCode += getBest_Time_to_Contact__c().hashCode();
        }
        if (getBest_Way_to_Contact__c() != null) {
            _hashCode += getBest_Way_to_Contact__c().hashCode();
        }
        if (getBillable__c() != null) {
            _hashCode += getBillable__c().hashCode();
        }
        if (getBug_Patch_Resolution_Notes__c() != null) {
            _hashCode += getBug_Patch_Resolution_Notes__c().hashCode();
        }
        if (getBusinessHours() != null) {
            _hashCode += getBusinessHours().hashCode();
        }
        if (getBusinessHoursId() != null) {
            _hashCode += getBusinessHoursId().hashCode();
        }
        if (getCS_Management_User__c() != null) {
            _hashCode += getCS_Management_User__c().hashCode();
        }
        if (getCS_Management_User__r() != null) {
            _hashCode += getCS_Management_User__r().hashCode();
        }
        if (getCaseArticles() != null) {
            _hashCode += getCaseArticles().hashCode();
        }
        if (getCaseComments() != null) {
            _hashCode += getCaseComments().hashCode();
        }
        if (getCaseContactRoles() != null) {
            _hashCode += getCaseContactRoles().hashCode();
        }
        if (getCaseNumber() != null) {
            _hashCode += getCaseNumber().hashCode();
        }
        if (getCaseSolutions() != null) {
            _hashCode += getCaseSolutions().hashCode();
        }
        if (getCase_Admin_2__c() != null) {
            _hashCode += getCase_Admin_2__c().hashCode();
        }
        if (getCase_Admin_2__r() != null) {
            _hashCode += getCase_Admin_2__r().hashCode();
        }
        if (getCase_Admin_3__c() != null) {
            _hashCode += getCase_Admin_3__c().hashCode();
        }
        if (getCase_Admin_3__r() != null) {
            _hashCode += getCase_Admin_3__r().hashCode();
        }
        if (getCase_Admin_4__c() != null) {
            _hashCode += getCase_Admin_4__c().hashCode();
        }
        if (getCase_Admin_4__r() != null) {
            _hashCode += getCase_Admin_4__r().hashCode();
        }
        if (getCase_Age_In_Business_Hours__c() != null) {
            _hashCode += getCase_Age_In_Business_Hours__c().hashCode();
        }
        if (getCase_Age_Update__c() != null) {
            _hashCode += getCase_Age_Update__c().hashCode();
        }
        if (getCase_Age__c() != null) {
            _hashCode += getCase_Age__c().hashCode();
        }
        if (getCase_Migration_Differential_Copies__r() != null) {
            _hashCode += getCase_Migration_Differential_Copies__r().hashCode();
        }
        if (getCase_Status_Client_Active_Import_Export__c() != null) {
            _hashCode += getCase_Status_Client_Active_Import_Export__c().hashCode();
        }
        if (getCase_Status_Client_Active__c() != null) {
            _hashCode += getCase_Status_Client_Active__c().hashCode();
        }
        if (getCase_Template__c() != null) {
            _hashCode += getCase_Template__c().hashCode();
        }
        if (getCase_Template__r() != null) {
            _hashCode += getCase_Template__r().hashCode();
        }
        if (getCase_Time_Billable__c() != null) {
            _hashCode += getCase_Time_Billable__c().hashCode();
        }
        if (getCase_Time_Category__c() != null) {
            _hashCode += getCase_Time_Category__c().hashCode();
        }
        if (getCases() != null) {
            _hashCode += getCases().hashCode();
        }
        if (getCases__r() != null) {
            _hashCode += getCases__r().hashCode();
        }
        if (getCategory__c() != null) {
            _hashCode += getCategory__c().hashCode();
        }
        if (getCategory__r() != null) {
            _hashCode += getCategory__r().hashCode();
        }
        if (getCertified_Admin_Static__c() != null) {
            _hashCode += getCertified_Admin_Static__c().hashCode();
        }
        if (getCertified_Admin__c() != null) {
            _hashCode += getCertified_Admin__c().hashCode();
        }
        if (getChangeControlTicketAssociation__r() != null) {
            _hashCode += getChangeControlTicketAssociation__r().hashCode();
        }
        if (getChecklists__r() != null) {
            _hashCode += getChecklists__r().hashCode();
        }
        if (getClient_Contact_Status__c() != null) {
            _hashCode += getClient_Contact_Status__c().hashCode();
        }
        if (getClient_Contacted__c() != null) {
            _hashCode += getClient_Contacted__c().hashCode();
        }
        if (getClient_Email_Addresses__c() != null) {
            _hashCode += getClient_Email_Addresses__c().hashCode();
        }
        if (getClient_Inernal_Tracking_Number__c() != null) {
            _hashCode += getClient_Inernal_Tracking_Number__c().hashCode();
        }
        if (getClient_Requested_Escalation__c() != null) {
            _hashCode += getClient_Requested_Escalation__c().hashCode();
        }
        if (getClient_Type__c() != null) {
            _hashCode += getClient_Type__c().hashCode();
        }
        if (getClosedDate() != null) {
            _hashCode += getClosedDate().hashCode();
        }
        if (getClosing_Note__c() != null) {
            _hashCode += getClosing_Note__c().hashCode();
        }
        if (getComputer_Connected_To__c() != null) {
            _hashCode += getComputer_Connected_To__c().hashCode();
        }
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getContactId() != null) {
            _hashCode += getContactId().hashCode();
        }
        if (getContact_1__c() != null) {
            _hashCode += getContact_1__c().hashCode();
        }
        if (getContact_1__r() != null) {
            _hashCode += getContact_1__r().hashCode();
        }
        if (getContent_Updates__c() != null) {
            _hashCode += getContent_Updates__c().hashCode();
        }
        if (getCount_of_Case_Time_Records__c() != null) {
            _hashCode += getCount_of_Case_Time_Records__c().hashCode();
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
        if (getCustomization_and_Consulting__c() != null) {
            _hashCode += getCustomization_and_Consulting__c().hashCode();
        }
        if (getData_Files__r() != null) {
            _hashCode += getData_Files__r().hashCode();
        }
        if (getDatabase_Drive_Name__c() != null) {
            _hashCode += getDatabase_Drive_Name__c().hashCode();
        }
        if (getDate_Client_Requested_Escalation__c() != null) {
            _hashCode += getDate_Client_Requested_Escalation__c().hashCode();
        }
        if (getDate_Escalated__c() != null) {
            _hashCode += getDate_Escalated__c().hashCode();
        }
        if (getDate_Escalated_for_Oracle_Defect_Review__c() != null) {
            _hashCode += getDate_Escalated_for_Oracle_Defect_Review__c().hashCode();
        }
        if (getDate_Escalated_for_PSI_Review__c() != null) {
            _hashCode += getDate_Escalated_for_PSI_Review__c().hashCode();
        }
        if (getDate_Escalated_for_Problem_File_Review__c() != null) {
            _hashCode += getDate_Escalated_for_Problem_File_Review__c().hashCode();
        }
        if (getDate_Escalated_for_Relativity_Bug_Review__c() != null) {
            _hashCode += getDate_Escalated_for_Relativity_Bug_Review__c().hashCode();
        }
        if (getDate_Escalated_for_bug_Review__c() != null) {
            _hashCode += getDate_Escalated_for_bug_Review__c().hashCode();
        }
        if (getDate_Escalated_to_Certification__c() != null) {
            _hashCode += getDate_Escalated_to_Certification__c().hashCode();
        }
        if (getDate_Escalated_to_Dev__c() != null) {
            _hashCode += getDate_Escalated_to_Dev__c().hashCode();
        }
        if (getDate_Escalated_to_Vendor__c() != null) {
            _hashCode += getDate_Escalated_to_Vendor__c().hashCode();
        }
        if (getDate_Escalated_to_kIE__c() != null) {
            _hashCode += getDate_Escalated_to_kIE__c().hashCode();
        }
        if (getDate_Evaluated_For_Business_Impact__c() != null) {
            _hashCode += getDate_Evaluated_For_Business_Impact__c().hashCode();
        }
        if (getDate_KIE_Status_Completed__c() != null) {
            _hashCode += getDate_KIE_Status_Completed__c().hashCode();
        }
        if (getDate_Microsoft_case_opened__c() != null) {
            _hashCode += getDate_Microsoft_case_opened__c().hashCode();
        }
        if (getDate_Range__c() != null) {
            _hashCode += getDate_Range__c().hashCode();
        }
        if (getDate_Received__c() != null) {
            _hashCode += getDate_Received__c().hashCode();
        }
        if (getDate_Recommended_Upgrade__c() != null) {
            _hashCode += getDate_Recommended_Upgrade__c().hashCode();
        }
        if (getDate_Reviewed_for_KCD_Ticket__c() != null) {
            _hashCode += getDate_Reviewed_for_KCD_Ticket__c().hashCode();
        }
        if (getDate_Sent_to_Client__c() != null) {
            _hashCode += getDate_Sent_to_Client__c().hashCode();
        }
        if (getDate_Shipped_to_kCura__c() != null) {
            _hashCode += getDate_Shipped_to_kCura__c().hashCode();
        }
        if (getDate_Time_Outage_Started__c() != null) {
            _hashCode += getDate_Time_Outage_Started__c().hashCode();
        }
        if (getDate_Time_Service_Restored__c() != null) {
            _hashCode += getDate_Time_Service_Restored__c().hashCode();
        }
        if (getDate__c() != null) {
            _hashCode += getDate__c().hashCode();
        }
        if (getDays_of_Month__c() != null) {
            _hashCode += getDays_of_Month__c().hashCode();
        }
        if (getDeadline__c() != null) {
            _hashCode += getDeadline__c().hashCode();
        }
        if (getDeadline_for_Access_Creation__c() != null) {
            _hashCode += getDeadline_for_Access_Creation__c().hashCode();
        }
        if (getDeliver_By__c() != null) {
            _hashCode += getDeliver_By__c().hashCode();
        }
        if (getDepartment_Sub__c() != null) {
            _hashCode += getDepartment_Sub__c().hashCode();
        }
        if (getDepartment__c() != null) {
            _hashCode += getDepartment__c().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDev_Resource__c() != null) {
            _hashCode += getDev_Resource__c().hashCode();
        }
        if (getDev_Resource__r() != null) {
            _hashCode += getDev_Resource__r().hashCode();
        }
        if (getDev_Status__c() != null) {
            _hashCode += getDev_Status__c().hashCode();
        }
        if (getDev_on_call_response__c() != null) {
            _hashCode += getDev_on_call_response__c().hashCode();
        }
        if (getDevelopment_End__c() != null) {
            _hashCode += getDevelopment_End__c().hashCode();
        }
        if (getDevelopment_Start__c() != null) {
            _hashCode += getDevelopment_Start__c().hashCode();
        }
        if (getDevelopment_User__c() != null) {
            _hashCode += getDevelopment_User__c().hashCode();
        }
        if (getDevelopment_User__r() != null) {
            _hashCode += getDevelopment_User__r().hashCode();
        }
        if (getDisclosure_and_Electronic_Signature__c() != null) {
            _hashCode += getDisclosure_and_Electronic_Signature__c().hashCode();
        }
        if (getDo_Not_Send_Priority_Alert_Email__c() != null) {
            _hashCode += getDo_Not_Send_Priority_Alert_Email__c().hashCode();
        }
        if (getDo_Not_Send_Survey__c() != null) {
            _hashCode += getDo_Not_Send_Survey__c().hashCode();
        }
        if (getDocument_Format__c() != null) {
            _hashCode += getDocument_Format__c().hashCode();
        }
        if (getDrive_Location__c() != null) {
            _hashCode += getDrive_Location__c().hashCode();
        }
        if (getDrive_Name__c() != null) {
            _hashCode += getDrive_Name__c().hashCode();
        }
        if (getDrive_Status__c() != null) {
            _hashCode += getDrive_Status__c().hashCode();
        }
        if (getDue_Date__c() != null) {
            _hashCode += getDue_Date__c().hashCode();
        }
        if (getEffort_Estimate__c() != null) {
            _hashCode += getEffort_Estimate__c().hashCode();
        }
        if (getEmailMessages() != null) {
            _hashCode += getEmailMessages().hashCode();
        }
        if (getEmail_Address__c() != null) {
            _hashCode += getEmail_Address__c().hashCode();
        }
        if (getEnvironment_Sub__c() != null) {
            _hashCode += getEnvironment_Sub__c().hashCode();
        }
        if (getEnvironment__c() != null) {
            _hashCode += getEnvironment__c().hashCode();
        }
        if (getError_File_Type__c() != null) {
            _hashCode += getError_File_Type__c().hashCode();
        }
        if (getError_Reproducable__c() != null) {
            _hashCode += getError_Reproducable__c().hashCode();
        }
        if (getError__c() != null) {
            _hashCode += getError__c().hashCode();
        }
        if (getEscalate_to_Dev__c() != null) {
            _hashCode += getEscalate_to_Dev__c().hashCode();
        }
        if (getEscalated_for_Bug_Review_By__c() != null) {
            _hashCode += getEscalated_for_Bug_Review_By__c().hashCode();
        }
        if (getEscalated_for_Bug_Review__c() != null) {
            _hashCode += getEscalated_for_Bug_Review__c().hashCode();
        }
        if (getEscalated_for_Oracle_Defect_Review_By__c() != null) {
            _hashCode += getEscalated_for_Oracle_Defect_Review_By__c().hashCode();
        }
        if (getEscalated_for_Oracle_Defect_Review__c() != null) {
            _hashCode += getEscalated_for_Oracle_Defect_Review__c().hashCode();
        }
        if (getEscalated_for_PSI_Review_By__c() != null) {
            _hashCode += getEscalated_for_PSI_Review_By__c().hashCode();
        }
        if (getEscalated_for_PSI_Review__c() != null) {
            _hashCode += getEscalated_for_PSI_Review__c().hashCode();
        }
        if (getEscalated_for_Problem_File_Review_By__c() != null) {
            _hashCode += getEscalated_for_Problem_File_Review_By__c().hashCode();
        }
        if (getEscalated_for_Problem_File_Review__c() != null) {
            _hashCode += getEscalated_for_Problem_File_Review__c().hashCode();
        }
        if (getEscalated_for_Relativity_Bug_Review_By__c() != null) {
            _hashCode += getEscalated_for_Relativity_Bug_Review_By__c().hashCode();
        }
        if (getEscalated_for_Relativity_Bug_Review__c() != null) {
            _hashCode += getEscalated_for_Relativity_Bug_Review__c().hashCode();
        }
        if (getEscalated_to_Certification_By__c() != null) {
            _hashCode += getEscalated_to_Certification_By__c().hashCode();
        }
        if (getEscalated_to_Certification__c() != null) {
            _hashCode += getEscalated_to_Certification__c().hashCode();
        }
        if (getEscalated_to_Dev_By__c() != null) {
            _hashCode += getEscalated_to_Dev_By__c().hashCode();
        }
        if (getEscalated_to_KIE_By__c() != null) {
            _hashCode += getEscalated_to_KIE_By__c().hashCode();
        }
        if (getEscalated_to_L2_Person__c() != null) {
            _hashCode += getEscalated_to_L2_Person__c().hashCode();
        }
        if (getEscalated_to_L2__c() != null) {
            _hashCode += getEscalated_to_L2__c().hashCode();
        }
        if (getEscalated_to_Vendor_By__c() != null) {
            _hashCode += getEscalated_to_Vendor_By__c().hashCode();
        }
        if (getEscalated_to_Vendor__c() != null) {
            _hashCode += getEscalated_to_Vendor__c().hashCode();
        }
        if (getEscalated_to_kIE__c() != null) {
            _hashCode += getEscalated_to_kIE__c().hashCode();
        }
        if (getEstimated_Billable_Time_alert__c() != null) {
            _hashCode += getEstimated_Billable_Time_alert__c().hashCode();
        }
        if (getEstimated_Time_High__c() != null) {
            _hashCode += getEstimated_Time_High__c().hashCode();
        }
        if (getEstimated_Time_Low__c() != null) {
            _hashCode += getEstimated_Time_Low__c().hashCode();
        }
        if (getEvaluated_for_Business_Impact_By__c() != null) {
            _hashCode += getEvaluated_for_Business_Impact_By__c().hashCode();
        }
        if (getEvents() != null) {
            _hashCode += getEvents().hashCode();
        }
        if (getExpected_Load_Date__c() != null) {
            _hashCode += getExpected_Load_Date__c().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getFeedbacks__r() != null) {
            _hashCode += getFeedbacks__r().hashCode();
        }
        if (getFeeds() != null) {
            _hashCode += getFeeds().hashCode();
        }
        if (getFile_Copy_Drive_Name__c() != null) {
            _hashCode += getFile_Copy_Drive_Name__c().hashCode();
        }
        if (getFile_Count__c() != null) {
            _hashCode += getFile_Count__c().hashCode();
        }
        if (getFile_Pervasiveness__c() != null) {
            _hashCode += getFile_Pervasiveness__c().hashCode();
        }
        if (getFile_Size_GB__c() != null) {
            _hashCode += getFile_Size_GB__c().hashCode();
        }
        if (getFollow_up_Items__c() != null) {
            _hashCode += getFollow_up_Items__c().hashCode();
        }
        if (getFollow_up_Response_Deadline__c() != null) {
            _hashCode += getFollow_up_Response_Deadline__c().hashCode();
        }
        if (getGrouping__c() != null) {
            _hashCode += getGrouping__c().hashCode();
        }
        if (getGroups_and_Users__c() != null) {
            _hashCode += getGroups_and_Users__c().hashCode();
        }
        if (getHCW_Ticket__c() != null) {
            _hashCode += getHCW_Ticket__c().hashCode();
        }
        if (getHCW_Ticket__r() != null) {
            _hashCode += getHCW_Ticket__r().hashCode();
        }
        if (getHasCommentsUnreadByOwner() != null) {
            _hashCode += getHasCommentsUnreadByOwner().hashCode();
        }
        if (getHasSelfServiceComments() != null) {
            _hashCode += getHasSelfServiceComments().hashCode();
        }
        if (getHas_Custom_Solution__c() != null) {
            _hashCode += getHas_Custom_Solution__c().hashCode();
        }
        if (getHas_Custom_Solution_old__c() != null) {
            _hashCode += getHas_Custom_Solution_old__c().hashCode();
        }
        if (getHas_Non_Licensing_DLLs__c() != null) {
            _hashCode += getHas_Non_Licensing_DLLs__c().hashCode();
        }
        if (getHelp_Group__c() != null) {
            _hashCode += getHelp_Group__c().hashCode();
        }
        if (getHistories() != null) {
            _hashCode += getHistories().hashCode();
        }
        if (getHour_Entered_Pause_State__c() != null) {
            _hashCode += getHour_Entered_Pause_State__c().hashCode();
        }
        if (getHour_in_Customer_Action__c() != null) {
            _hashCode += getHour_in_Customer_Action__c().hashCode();
        }
        if (getHours__c() != null) {
            _hashCode += getHours__c().hashCode();
        }
        if (getImpact__c() != null) {
            _hashCode += getImpact__c().hashCode();
        }
        if (getImpeded__c() != null) {
            _hashCode += getImpeded__c().hashCode();
        }
        if (getInbound_Tracking_Number__c() != null) {
            _hashCode += getInbound_Tracking_Number__c().hashCode();
        }
        if (getInitial_Client_Contact__c() != null) {
            _hashCode += getInitial_Client_Contact__c().hashCode();
        }
        if (getInitial_Estimate__c() != null) {
            _hashCode += getInitial_Estimate__c().hashCode();
        }
        if (getInstance__c() != null) {
            _hashCode += getInstance__c().hashCode();
        }
        if (getInstance__r() != null) {
            _hashCode += getInstance__r().hashCode();
        }
        if (getIsClosed() != null) {
            _hashCode += getIsClosed().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getIsEscalated() != null) {
            _hashCode += getIsEscalated().hashCode();
        }
        if (getIsVisibleInSelfService() != null) {
            _hashCode += getIsVisibleInSelfService().hashCode();
        }
        if (getIs_Admin_Contact__c() != null) {
            _hashCode += getIs_Admin_Contact__c().hashCode();
        }
        if (getIssue_Description__c() != null) {
            _hashCode += getIssue_Description__c().hashCode();
        }
        if (getItems_Delivered__c() != null) {
            _hashCode += getItems_Delivered__c().hashCode();
        }
        if (getKCD_Solution_Recipient__c() != null) {
            _hashCode += getKCD_Solution_Recipient__c().hashCode();
        }
        if (getKCD_Solution_Recipients__r() != null) {
            _hashCode += getKCD_Solution_Recipients__r().hashCode();
        }
        if (getKnown_Defect__c() != null) {
            _hashCode += getKnown_Defect__c().hashCode();
        }
        if (getLab__c() != null) {
            _hashCode += getLab__c().hashCode();
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
        if (getLast_Status_Change__c() != null) {
            _hashCode += getLast_Status_Change__c().hashCode();
        }
        if (getLocation__c() != null) {
            _hashCode += getLocation__c().hashCode();
        }
        if (getLocation_of_Document__c() != null) {
            _hashCode += getLocation_of_Document__c().hashCode();
        }
        if (getLong_Term_Actual_Date__c() != null) {
            _hashCode += getLong_Term_Actual_Date__c().hashCode();
        }
        if (getLong_Term_Corrective_Action__c() != null) {
            _hashCode += getLong_Term_Corrective_Action__c().hashCode();
        }
        if (getLong_Term_Scheduled_Date__c() != null) {
            _hashCode += getLong_Term_Scheduled_Date__c().hashCode();
        }
        if (getMDF_Size_GB__c() != null) {
            _hashCode += getMDF_Size_GB__c().hashCode();
        }
        if (getMake__c() != null) {
            _hashCode += getMake__c().hashCode();
        }
        if (getMarketing_Surveys__r() != null) {
            _hashCode += getMarketing_Surveys__r().hashCode();
        }
        if (getMedium__c() != null) {
            _hashCode += getMedium__c().hashCode();
        }
        if (getMicrosoft_Case_Owner_Email__c() != null) {
            _hashCode += getMicrosoft_Case_Owner_Email__c().hashCode();
        }
        if (getMicrosoft_Case_Owner_Tel__c() != null) {
            _hashCode += getMicrosoft_Case_Owner_Tel__c().hashCode();
        }
        if (getMicrosoft_Case_Owner__c() != null) {
            _hashCode += getMicrosoft_Case_Owner__c().hashCode();
        }
        if (getMicrosoft_Case__c() != null) {
            _hashCode += getMicrosoft_Case__c().hashCode();
        }
        if (getMicrosoft_Severity_Level__c() != null) {
            _hashCode += getMicrosoft_Severity_Level__c().hashCode();
        }
        if (getMicrosoft_Telephone_Number__c() != null) {
            _hashCode += getMicrosoft_Telephone_Number__c().hashCode();
        }
        if (getMigration_End_Date__c() != null) {
            _hashCode += getMigration_End_Date__c().hashCode();
        }
        if (getMigration_Initial_File_Copy_Start_Date__c() != null) {
            _hashCode += getMigration_Initial_File_Copy_Start_Date__c().hashCode();
        }
        if (getMigration_Number_of_Files_Copied__c() != null) {
            _hashCode += getMigration_Number_of_Files_Copied__c().hashCode();
        }
        if (getMigration_Size_GB__c() != null) {
            _hashCode += getMigration_Size_GB__c().hashCode();
        }
        if (getMissed_SLA_Deadline_Ticket_Owner__c() != null) {
            _hashCode += getMissed_SLA_Deadline_Ticket_Owner__c().hashCode();
        }
        if (getModel_Product_Number__c() != null) {
            _hashCode += getModel_Product_Number__c().hashCode();
        }
        if (getName__c() != null) {
            _hashCode += getName__c().hashCode();
        }
        if (getName_of_Document__c() != null) {
            _hashCode += getName_of_Document__c().hashCode();
        }
        if (getNeeds_Immediate_Attention__c() != null) {
            _hashCode += getNeeds_Immediate_Attention__c().hashCode();
        }
        if (getNew_Case_Name__c() != null) {
            _hashCode += getNew_Case_Name__c().hashCode();
        }
        if (getNew_Comment__c() != null) {
            _hashCode += getNew_Comment__c().hashCode();
        }
        if (getNo_Show__c() != null) {
            _hashCode += getNo_Show__c().hashCode();
        }
        if (getNotes__c() != null) {
            _hashCode += getNotes__c().hashCode();
        }
        if (getNumber_of_Event_Handlers__c() != null) {
            _hashCode += getNumber_of_Event_Handlers__c().hashCode();
        }
        if (getNumber_of_Relativity_Analytics_Indexes__c() != null) {
            _hashCode += getNumber_of_Relativity_Analytics_Indexes__c().hashCode();
        }
        if (getNumber_of_dtSearch_Indexes__c() != null) {
            _hashCode += getNumber_of_dtSearch_Indexes__c().hashCode();
        }
        if (getOpenActivities() != null) {
            _hashCode += getOpenActivities().hashCode();
        }
        if (getOpened_Day_of_the_Week__c() != null) {
            _hashCode += getOpened_Day_of_the_Week__c().hashCode();
        }
        if (getOpportunity__c() != null) {
            _hashCode += getOpportunity__c().hashCode();
        }
        if (getOpportunity__r() != null) {
            _hashCode += getOpportunity__r().hashCode();
        }
        if (getOracle_Bug_Number__c() != null) {
            _hashCode += getOracle_Bug_Number__c().hashCode();
        }
        if (getOracle_Status__c() != null) {
            _hashCode += getOracle_Status__c().hashCode();
        }
        if (getOracle_Ticket_Created_On__c() != null) {
            _hashCode += getOracle_Ticket_Created_On__c().hashCode();
        }
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        if (getOriginal_Ticket__c() != null) {
            _hashCode += getOriginal_Ticket__c().hashCode();
        }
        if (getOther__c() != null) {
            _hashCode += getOther__c().hashCode();
        }
        if (getOutbound_Tracking_Number__c() != null) {
            _hashCode += getOutbound_Tracking_Number__c().hashCode();
        }
        if (getOvernight_SLA__c() != null) {
            _hashCode += getOvernight_SLA__c().hashCode();
        }
        if (getOverride_Account_Validation__c() != null) {
            _hashCode += getOverride_Account_Validation__c().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getOwner_Profile__c() != null) {
            _hashCode += getOwner_Profile__c().hashCode();
        }
        if (getOwner_Role__c() != null) {
            _hashCode += getOwner_Role__c().hashCode();
        }
        if (getPS_Defect_Class__c() != null) {
            _hashCode += getPS_Defect_Class__c().hashCode();
        }
        if (getPS_QC_Comments__c() != null) {
            _hashCode += getPS_QC_Comments__c().hashCode();
        }
        if (getPS_QC_Status__c() != null) {
            _hashCode += getPS_QC_Status__c().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getParentId() != null) {
            _hashCode += getParentId().hashCode();
        }
        if (getPartner_Kickoffs__r() != null) {
            _hashCode += getPartner_Kickoffs__r().hashCode();
        }
        if (getPatch_Number__c() != null) {
            _hashCode += getPatch_Number__c().hashCode();
        }
        if (getPerson_Returned_To__c() != null) {
            _hashCode += getPerson_Returned_To__c().hashCode();
        }
        if (getPerson_Returned_To__r() != null) {
            _hashCode += getPerson_Returned_To__r().hashCode();
        }
        if (getPerson_Who_Shipped__c() != null) {
            _hashCode += getPerson_Who_Shipped__c().hashCode();
        }
        if (getPerson_Who_Shipped__r() != null) {
            _hashCode += getPerson_Who_Shipped__r().hashCode();
        }
        if (getPlanned_File_Location__c() != null) {
            _hashCode += getPlanned_File_Location__c().hashCode();
        }
        if (getPod_Account__c() != null) {
            _hashCode += getPod_Account__c().hashCode();
        }
        if (getPod_User__c() != null) {
            _hashCode += getPod_User__c().hashCode();
        }
        if (getPod__c() != null) {
            _hashCode += getPod__c().hashCode();
        }
        if (getPrice_Per_User_2__c() != null) {
            _hashCode += getPrice_Per_User_2__c().hashCode();
        }
        if (getPrice_per_gb__c() != null) {
            _hashCode += getPrice_per_gb__c().hashCode();
        }
        if (getPricing_Schedule__c() != null) {
            _hashCode += getPricing_Schedule__c().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getProblem_Management_Flag__c() != null) {
            _hashCode += getProblem_Management_Flag__c().hashCode();
        }
        if (getProblem_Mgmt_Ticket__c() != null) {
            _hashCode += getProblem_Mgmt_Ticket__c().hashCode();
        }
        if (getProblem_Mgmt_Ticket__r() != null) {
            _hashCode += getProblem_Mgmt_Ticket__r().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getProduct_Application__c() != null) {
            _hashCode += getProduct_Application__c().hashCode();
        }
        if (getProduct__c() != null) {
            _hashCode += getProduct__c().hashCode();
        }
        if (getProject_Phase__c() != null) {
            _hashCode += getProject_Phase__c().hashCode();
        }
        if (getProposal_Approved__c() != null) {
            _hashCode += getProposal_Approved__c().hashCode();
        }
        if (getQC_Comments__c() != null) {
            _hashCode += getQC_Comments__c().hashCode();
        }
        if (getQC_Date__c() != null) {
            _hashCode += getQC_Date__c().hashCode();
        }
        if (getQC_Person__c() != null) {
            _hashCode += getQC_Person__c().hashCode();
        }
        if (getQC_Person__r() != null) {
            _hashCode += getQC_Person__r().hashCode();
        }
        if (getQC_Status__c() != null) {
            _hashCode += getQC_Status__c().hashCode();
        }
        if (getQuestion() != null) {
            _hashCode += getQuestion().hashCode();
        }
        if (getQuestionId() != null) {
            _hashCode += getQuestionId().hashCode();
        }
        if (getQuick_Guide__c() != null) {
            _hashCode += getQuick_Guide__c().hashCode();
        }
        if (getRCA_Certified_Date__c() != null) {
            _hashCode += getRCA_Certified_Date__c().hashCode();
        }
        if (getRandom_Sample__c() != null) {
            _hashCode += getRandom_Sample__c().hashCode();
        }
        if (getRe_Work_From_Prior_Ticket__c() != null) {
            _hashCode += getRe_Work_From_Prior_Ticket__c().hashCode();
        }
        if (getReason_for_No_Survey__c() != null) {
            _hashCode += getReason_for_No_Survey__c().hashCode();
        }
        if (getRecommended_Upgrade__c() != null) {
            _hashCode += getRecommended_Upgrade__c().hashCode();
        }
        if (getRecordType() != null) {
            _hashCode += getRecordType().hashCode();
        }
        if (getRecordTypeId() != null) {
            _hashCode += getRecordTypeId().hashCode();
        }
        if (getRelAn_Date_Verified__c() != null) {
            _hashCode += getRelAn_Date_Verified__c().hashCode();
        }
        if (getRelAn_Drive_Name__c() != null) {
            _hashCode += getRelAn_Drive_Name__c().hashCode();
        }
        if (getRelativity_Case__c() != null) {
            _hashCode += getRelativity_Case__c().hashCode();
        }
        if (getRelativity_Case__r() != null) {
            _hashCode += getRelativity_Case__r().hashCode();
        }
        if (getRelativity_Version_Fixed__c() != null) {
            _hashCode += getRelativity_Version_Fixed__c().hashCode();
        }
        if (getRelativity_Version_Fixed__r() != null) {
            _hashCode += getRelativity_Version_Fixed__r().hashCode();
        }
        if (getRelativity_Version__c() != null) {
            _hashCode += getRelativity_Version__c().hashCode();
        }
        if (getRelease_Verified__c() != null) {
            _hashCode += getRelease_Verified__c().hashCode();
        }
        if (getRelease__c() != null) {
            _hashCode += getRelease__c().hashCode();
        }
        if (getRelease__r() != null) {
            _hashCode += getRelease__r().hashCode();
        }
        if (getReport_Details__c() != null) {
            _hashCode += getReport_Details__c().hashCode();
        }
        if (getRequest_Type__c() != null) {
            _hashCode += getRequest_Type__c().hashCode();
        }
        if (getRequested_Due_Date__c() != null) {
            _hashCode += getRequested_Due_Date__c().hashCode();
        }
        if (getResearch__c() != null) {
            _hashCode += getResearch__c().hashCode();
        }
        if (getRetail_Box_Incuded__c() != null) {
            _hashCode += getRetail_Box_Incuded__c().hashCode();
        }
        if (getReturn_with_Origninal_Shipping_Container__c() != null) {
            _hashCode += getReturn_with_Origninal_Shipping_Container__c().hashCode();
        }
        if (getReview_for_KCD_By__c() != null) {
            _hashCode += getReview_for_KCD_By__c().hashCode();
        }
        if (getReview_for_KCD_Ticket__c() != null) {
            _hashCode += getReview_for_KCD_Ticket__c().hashCode();
        }
        if (getRoot_Cause_Description__c() != null) {
            _hashCode += getRoot_Cause_Description__c().hashCode();
        }
        if (getRoot_Cause_Sub__c() != null) {
            _hashCode += getRoot_Cause_Sub__c().hashCode();
        }
        if (getRoot_Cause__c() != null) {
            _hashCode += getRoot_Cause__c().hashCode();
        }
        if (getSFDC_Projects__r() != null) {
            _hashCode += getSFDC_Projects__r().hashCode();
        }
        if (getSLA_Exceeded__c() != null) {
            _hashCode += getSLA_Exceeded__c().hashCode();
        }
        if (getSLA_Missed_By__c() != null) {
            _hashCode += getSLA_Missed_By__c().hashCode();
        }
        if (getSLA_Response_Deadline__c() != null) {
            _hashCode += getSLA_Response_Deadline__c().hashCode();
        }
        if (getSLA_Response_Time__c() != null) {
            _hashCode += getSLA_Response_Time__c().hashCode();
        }
        if (getSR_Number__c() != null) {
            _hashCode += getSR_Number__c().hashCode();
        }
        if (getSales_Queue_Ownership__c() != null) {
            _hashCode += getSales_Queue_Ownership__c().hashCode();
        }
        if (getSales_Queue__c() != null) {
            _hashCode += getSales_Queue__c().hashCode();
        }
        if (getSales_Type_Sub__c() != null) {
            _hashCode += getSales_Type_Sub__c().hashCode();
        }
        if (getSales_Type__c() != null) {
            _hashCode += getSales_Type__c().hashCode();
        }
        if (getScheduled__c() != null) {
            _hashCode += getScheduled__c().hashCode();
        }
        if (getSchool_Program__c() != null) {
            _hashCode += getSchool_Program__c().hashCode();
        }
        if (getSend_Email_Survey__c() != null) {
            _hashCode += getSend_Email_Survey__c().hashCode();
        }
        if (getSerial_Number__c() != null) {
            _hashCode += getSerial_Number__c().hashCode();
        }
        if (getServer_Application__c() != null) {
            _hashCode += getServer_Application__c().hashCode();
        }
        if (getServer_OS__c() != null) {
            _hashCode += getServer_OS__c().hashCode();
        }
        if (getShares() != null) {
            _hashCode += getShares().hashCode();
        }
        if (getShipped_Date__c() != null) {
            _hashCode += getShipped_Date__c().hashCode();
        }
        if (getShort_Term_Actual_Date__c() != null) {
            _hashCode += getShort_Term_Actual_Date__c().hashCode();
        }
        if (getShort_Term_Corrective_Action__c() != null) {
            _hashCode += getShort_Term_Corrective_Action__c().hashCode();
        }
        if (getShort_Term_Scheduled_Date__c() != null) {
            _hashCode += getShort_Term_Scheduled_Date__c().hashCode();
        }
        if (getSignature__c() != null) {
            _hashCode += getSignature__c().hashCode();
        }
        if (getSimple_Template__c() != null) {
            _hashCode += getSimple_Template__c().hashCode();
        }
        if (getSolutions() != null) {
            _hashCode += getSolutions().hashCode();
        }
        if (getSpecial_Instructions__c() != null) {
            _hashCode += getSpecial_Instructions__c().hashCode();
        }
        if (getSpecifics__c() != null) {
            _hashCode += getSpecifics__c().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStatus_Call_End_Date__c() != null) {
            _hashCode += getStatus_Call_End_Date__c().hashCode();
        }
        if (getStatus_Call_Start_Date__c() != null) {
            _hashCode += getStatus_Call_Start_Date__c().hashCode();
        }
        if (getStatus_Description__c() != null) {
            _hashCode += getStatus_Description__c().hashCode();
        }
        if (getStatus_Last_Modified_del__c() != null) {
            _hashCode += getStatus_Last_Modified_del__c().hashCode();
        }
        if (getStatus_Meeting_Conference_Info__c() != null) {
            _hashCode += getStatus_Meeting_Conference_Info__c().hashCode();
        }
        if (getStatus_Meeting_Notes__c() != null) {
            _hashCode += getStatus_Meeting_Notes__c().hashCode();
        }
        if (getStatus_Meeting__c() != null) {
            _hashCode += getStatus_Meeting__c().hashCode();
        }
        if (getStatus_Meeting__r() != null) {
            _hashCode += getStatus_Meeting__r().hashCode();
        }
        if (getStudy_Material__c() != null) {
            _hashCode += getStudy_Material__c().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getSuppliedEmail() != null) {
            _hashCode += getSuppliedEmail().hashCode();
        }
        if (getSuppliedName() != null) {
            _hashCode += getSuppliedName().hashCode();
        }
        if (getSupport_Hours__c() != null) {
            _hashCode += getSupport_Hours__c().hashCode();
        }
        if (getSupport_Sample_Number__c() != null) {
            _hashCode += getSupport_Sample_Number__c().hashCode();
        }
        if (getSupport__c() != null) {
            _hashCode += getSupport__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTasks() != null) {
            _hashCode += getTasks().hashCode();
        }
        if (getTeamMembers() != null) {
            _hashCode += getTeamMembers().hashCode();
        }
        if (getTeamTemplateRecords() != null) {
            _hashCode += getTeamTemplateRecords().hashCode();
        }
        if (getTechnical_Resource__c() != null) {
            _hashCode += getTechnical_Resource__c().hashCode();
        }
        if (getTest_Case_to_Reproduce__c() != null) {
            _hashCode += getTest_Case_to_Reproduce__c().hashCode();
        }
        if (getTicketReleaseAssociations__r() != null) {
            _hashCode += getTicketReleaseAssociations__r().hashCode();
        }
        if (getTicket_ReOpened__c() != null) {
            _hashCode += getTicket_ReOpened__c().hashCode();
        }
        if (getTier_1_User__c() != null) {
            _hashCode += getTier_1_User__c().hashCode();
        }
        if (getTier_1_User__r() != null) {
            _hashCode += getTier_1_User__r().hashCode();
        }
        if (getTier_2_User__c() != null) {
            _hashCode += getTier_2_User__c().hashCode();
        }
        if (getTier_2_User__r() != null) {
            _hashCode += getTier_2_User__r().hashCode();
        }
        if (getTier_Assignment_Flag__c() != null) {
            _hashCode += getTier_Assignment_Flag__c().hashCode();
        }
        if (getTier_Assignment__c() != null) {
            _hashCode += getTier_Assignment__c().hashCode();
        }
        if (getTime_Difference_Final__c() != null) {
            _hashCode += getTime_Difference_Final__c().hashCode();
        }
        if (getTime_Spent_on_Ticket__c() != null) {
            _hashCode += getTime_Spent_on_Ticket__c().hashCode();
        }
        if (getTime_Tracking_Type__c() != null) {
            _hashCode += getTime_Tracking_Type__c().hashCode();
        }
        if (getTime_With_Customer__c() != null) {
            _hashCode += getTime_With_Customer__c().hashCode();
        }
        if (getTime_With_Support__c() != null) {
            _hashCode += getTime_With_Support__c().hashCode();
        }
        if (getTime_in_Queue__c() != null) {
            _hashCode += getTime_in_Queue__c().hashCode();
        }
        if (getTime_on_Case_del__c() != null) {
            _hashCode += getTime_on_Case_del__c().hashCode();
        }
        if (getTotal_Billable_Time__c() != null) {
            _hashCode += getTotal_Billable_Time__c().hashCode();
        }
        if (getTotal_Data_Size_in_GB__c() != null) {
            _hashCode += getTotal_Data_Size_in_GB__c().hashCode();
        }
        if (getTotal_Escalated_Tickets__c() != null) {
            _hashCode += getTotal_Escalated_Tickets__c().hashCode();
        }
        if (getTotal_Escalated_for_Bug_Review__c() != null) {
            _hashCode += getTotal_Escalated_for_Bug_Review__c().hashCode();
        }
        if (getTotal_Escalated_to_Dev__c() != null) {
            _hashCode += getTotal_Escalated_to_Dev__c().hashCode();
        }
        if (getTotal_Evaluated_for_Business_Impact__c() != null) {
            _hashCode += getTotal_Evaluated_for_Business_Impact__c().hashCode();
        }
        if (getTotal_Number_of_Deliverables__c() != null) {
            _hashCode += getTotal_Number_of_Deliverables__c().hashCode();
        }
        if (getTotal_Time__c() != null) {
            _hashCode += getTotal_Time__c().hashCode();
        }
        if (getTrainer_Outline__c() != null) {
            _hashCode += getTrainer_Outline__c().hashCode();
        }
        if (getTraining_Category__c() != null) {
            _hashCode += getTraining_Category__c().hashCode();
        }
        if (getTraining_PPT__c() != null) {
            _hashCode += getTraining_PPT__c().hashCode();
        }
        if (getTraining_Workbook__c() != null) {
            _hashCode += getTraining_Workbook__c().hashCode();
        }
        if (getTransaction__c() != null) {
            _hashCode += getTransaction__c().hashCode();
        }
        if (getTransaction__r() != null) {
            _hashCode += getTransaction__r().hashCode();
        }
        if (getTutorial__c() != null) {
            _hashCode += getTutorial__c().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getType_Sub__c() != null) {
            _hashCode += getType_Sub__c().hashCode();
        }
        if (getType_of_Document__c() != null) {
            _hashCode += getType_of_Document__c().hashCode();
        }
        if (getUpdate_Interval_Start_Date__c() != null) {
            _hashCode += getUpdate_Interval_Start_Date__c().hashCode();
        }
        if (getUpdate_Interval__c() != null) {
            _hashCode += getUpdate_Interval__c().hashCode();
        }
        if (getUrgency__c() != null) {
            _hashCode += getUrgency__c().hashCode();
        }
        if (getUser__c() != null) {
            _hashCode += getUser__c().hashCode();
        }
        if (getUser__r() != null) {
            _hashCode += getUser__r().hashCode();
        }
        if (getValidated_In_Version__c() != null) {
            _hashCode += getValidated_In_Version__c().hashCode();
        }
        if (getVendor__c() != null) {
            _hashCode += getVendor__c().hashCode();
        }
        if (getVerify_Release__c() != null) {
            _hashCode += getVerify_Release__c().hashCode();
        }
        if (getVersion_Origin__c() != null) {
            _hashCode += getVersion_Origin__c().hashCode();
        }
        if (getVersion__c() != null) {
            _hashCode += getVersion__c().hashCode();
        }
        if (getVideo__c() != null) {
            _hashCode += getVideo__c().hashCode();
        }
        if (getViewer_Version_Fixed__c() != null) {
            _hashCode += getViewer_Version_Fixed__c().hashCode();
        }
        if (getWebinar_Recording__c() != null) {
            _hashCode += getWebinar_Recording__c().hashCode();
        }
        if (getWebinar__c() != null) {
            _hashCode += getWebinar__c().hashCode();
        }
        if (getWhat__c() != null) {
            _hashCode += getWhat__c().hashCode();
        }
        if (getWhere_is_drive__c() != null) {
            _hashCode += getWhere_is_drive__c().hashCode();
        }
        if (getWhere_is_drive__r() != null) {
            _hashCode += getWhere_is_drive__r().hashCode();
        }
        if (getWorkaround_Actual_Date__c() != null) {
            _hashCode += getWorkaround_Actual_Date__c().hashCode();
        }
        if (getWorkaround_Scheduled_Date__c() != null) {
            _hashCode += getWorkaround_Scheduled_Date__c().hashCode();
        }
        if (getWorkaround__c() != null) {
            _hashCode += getWorkaround__c().hashCode();
        }
        if (getX24_Hour_Follow_up_Deadline_Missed__c() != null) {
            _hashCode += getX24_Hour_Follow_up_Deadline_Missed__c().hashCode();
        }
        if (getX90_Day_Deployment_Checkup_Date__c() != null) {
            _hashCode += getX90_Day_Deployment_Checkup_Date__c().hashCode();
        }
        if (getYTD_Total_Days__c() != null) {
            _hashCode += getYTD_Total_Days__c().hashCode();
        }
        if (getDtSearch_Date_Verified__c() != null) {
            _hashCode += getDtSearch_Date_Verified__c().hashCode();
        }
        if (getDtSearch_Drive_Name__c() != null) {
            _hashCode += getDtSearch_Drive_Name__c().hashCode();
        }
        if (getKCura_Email_Addresses__c() != null) {
            _hashCode += getKCura_Email_Addresses__c().hashCode();
        }
        if (getKIE_Age__c() != null) {
            _hashCode += getKIE_Age__c().hashCode();
        }
        if (getKIE_Resource__c() != null) {
            _hashCode += getKIE_Resource__c().hashCode();
        }
        if (getKIE_Resource__r() != null) {
            _hashCode += getKIE_Resource__r().hashCode();
        }
        if (getKIE_Status__c() != null) {
            _hashCode += getKIE_Status__c().hashCode();
        }
        if (getTime_in_new__c() != null) {
            _hashCode += getTime_in_new__c().hashCode();
        }
        if (getXEvaluate_for_Business_Impact__c() != null) {
            _hashCode += getXEvaluate_for_Business_Impact__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(_case.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AM_PM__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AM_PM__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account_Alert__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account_Alert__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("actual_Billable_Time__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Actual_Billable_Time__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("add_to_Official_Doc_Set__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Add_to_Official_Doc_Set__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("added_to_Backlog_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Added_to_Backlog_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("admin_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Admin_Contact__c"));
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
        elemField.setFieldName("approved__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Approved__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approximate_Time_Spent__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Approximate_Time_Spent__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("area__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Area__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associated_Ticket_s__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Associated_Ticket_s__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associated_Tickets__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Associated_Tickets__r"));
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
        elemField.setFieldName("avoidance_Comments__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Avoidance_Comments__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avoidance__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Avoidance__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BA_Tested__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BA_Tested__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BA_Ticket_Owner__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BA_Ticket_Owner__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BA_Ticket_Owner__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BA_Ticket_Owner__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("best_Time_to_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Best_Time_to_Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("best_Way_to_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Best_Way_to_Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billable__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Billable__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bug_Patch_Resolution_Notes__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Bug_Patch_Resolution_Notes__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessHours");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BusinessHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BusinessHours"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessHoursId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BusinessHoursId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CS_Management_User__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CS_Management_User__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CS_Management_User__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CS_Management_User__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseArticles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseArticles"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseComments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseComments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseContactRoles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseContactRoles"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseSolutions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseSolutions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("case_Admin_2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case_Admin_2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("case_Admin_2__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case_Admin_2__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("case_Admin_3__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case_Admin_3__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("case_Admin_3__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case_Admin_3__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("case_Admin_4__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case_Admin_4__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("case_Admin_4__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case_Admin_4__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("case_Age_In_Business_Hours__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case_Age_In_Business_Hours__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("case_Age_Update__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case_Age_Update__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("case_Age__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case_Age__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("case_Migration_Differential_Copies__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case_Migration_Differential_Copies__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("case_Status_Client_Active_Import_Export__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case_Status_Client_Active_Import_Export__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("case_Status_Client_Active__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case_Status_Client_Active__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("case_Template__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case_Template__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("case_Template__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case_Template__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relativity_Case__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("case_Time_Billable__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case_Time_Billable__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("case_Time_Category__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case_Time_Category__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cases");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Cases"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cases__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Cases__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("certified_Admin_Static__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certified_Admin_Static__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certified_Admin__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certified_Admin__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeControlTicketAssociation__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ChangeControlTicketAssociation__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("client_Contact_Status__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Client_Contact_Status__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("client_Contacted__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Client_Contacted__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("client_Email_Addresses__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Client_Email_Addresses__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("client_Inernal_Tracking_Number__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Client_Inernal_Tracking_Number__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("client_Requested_Escalation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Client_Requested_Escalation__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("client_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Client_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ClosedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closing_Note__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Closing_Note__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("computer_Connected_To__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Computer_Connected_To__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContactId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact_1__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact_1__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact_1__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact_1__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content_Updates__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Content_Updates__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count_of_Case_Time_Records__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Count_of_Case_Time_Records__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("customization_and_Consulting__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Customization_and_Consulting__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data_Files__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Data_Files__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("database_Drive_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Database_Drive_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_Client_Requested_Escalation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Client_Requested_Escalation__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_Escalated__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Escalated__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_Escalated_for_Oracle_Defect_Review__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Escalated_for_Oracle_Defect_Review__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_Escalated_for_PSI_Review__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Escalated_for_PSI_Review__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_Escalated_for_Problem_File_Review__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Escalated_for_Problem_File_Review__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_Escalated_for_Relativity_Bug_Review__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Escalated_for_Relativity_Bug_Review__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_Escalated_for_bug_Review__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Escalated_for_bug_Review__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_Escalated_to_Certification__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Escalated_to_Certification__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_Escalated_to_Dev__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Escalated_to_Dev__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_Escalated_to_Vendor__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Escalated_to_Vendor__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_Escalated_to_kIE__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Escalated_to_kIE__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_Evaluated_For_Business_Impact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Evaluated_For_Business_Impact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_KIE_Status_Completed__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_KIE_Status_Completed__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_Microsoft_case_opened__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Microsoft_case_opened__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_Range__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Range__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_Received__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Received__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_Recommended_Upgrade__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Recommended_Upgrade__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_Reviewed_for_KCD_Ticket__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Reviewed_for_KCD_Ticket__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_Sent_to_Client__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Sent_to_Client__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_Shipped_to_kCura__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Shipped_to_kCura__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_Time_Outage_Started__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Time_Outage_Started__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_Time_Service_Restored__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date_Time_Service_Restored__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("days_of_Month__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Days_of_Month__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deadline__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Deadline__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deadline_for_Access_Creation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Deadline_for_Access_Creation__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliver_By__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Deliver_By__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department_Sub__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Department_Sub__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dev_Resource__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dev_Resource__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dev_Resource__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dev_Resource__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dev_Status__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dev_Status__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dev_on_call_response__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dev_on_call_response__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("development_End__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Development_End__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("development_Start__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Development_Start__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("development_User__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Development_User__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("development_User__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Development_User__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disclosure_and_Electronic_Signature__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Disclosure_and_Electronic_Signature__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("do_Not_Send_Priority_Alert_Email__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Do_Not_Send_Priority_Alert_Email__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("do_Not_Send_Survey__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Do_Not_Send_Survey__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("document_Format__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Document_Format__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drive_Location__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Drive_Location__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drive_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Drive_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drive_Status__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Drive_Status__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("due_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Due_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effort_Estimate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Effort_Estimate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailMessages");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailMessages"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("environment_Sub__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Environment_Sub__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environment__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Environment__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error_File_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Error_File_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error_Reproducable__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Error_Reproducable__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Error__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalate_to_Dev__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Escalate_to_Dev__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalated_for_Bug_Review_By__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Escalated_for_Bug_Review_By__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalated_for_Bug_Review__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Escalated_for_Bug_Review__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalated_for_Oracle_Defect_Review_By__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Escalated_for_Oracle_Defect_Review_By__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalated_for_Oracle_Defect_Review__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Escalated_for_Oracle_Defect_Review__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalated_for_PSI_Review_By__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Escalated_for_PSI_Review_By__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalated_for_PSI_Review__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Escalated_for_PSI_Review__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalated_for_Problem_File_Review_By__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Escalated_for_Problem_File_Review_By__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalated_for_Problem_File_Review__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Escalated_for_Problem_File_Review__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalated_for_Relativity_Bug_Review_By__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Escalated_for_Relativity_Bug_Review_By__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalated_for_Relativity_Bug_Review__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Escalated_for_Relativity_Bug_Review__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalated_to_Certification_By__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Escalated_to_Certification_By__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalated_to_Certification__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Escalated_to_Certification__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalated_to_Dev_By__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Escalated_to_Dev_By__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalated_to_KIE_By__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Escalated_to_KIE_By__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalated_to_L2_Person__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Escalated_to_L2_Person__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalated_to_L2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Escalated_to_L2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalated_to_Vendor_By__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Escalated_to_Vendor_By__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalated_to_Vendor__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Escalated_to_Vendor__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalated_to_kIE__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Escalated_to_kIE__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimated_Billable_Time_alert__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Estimated_Billable_Time_alert__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimated_Time_High__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Estimated_Time_High__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimated_Time_Low__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Estimated_Time_Low__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evaluated_for_Business_Impact_By__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Evaluated_for_Business_Impact_By__c"));
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
        elemField.setFieldName("expected_Load_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Expected_Load_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("feedbacks__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Feedbacks__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Feeds"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file_Copy_Drive_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "File_Copy_Drive_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file_Count__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "File_Count__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file_Pervasiveness__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "File_Pervasiveness__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file_Size_GB__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "File_Size_GB__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("follow_up_Items__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Follow_up_Items__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("follow_up_Response_Deadline__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Follow_up_Response_Deadline__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grouping__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Grouping__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groups_and_Users__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Groups_and_Users__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HCW_Ticket__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HCW_Ticket__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HCW_Ticket__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HCW_Ticket__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasCommentsUnreadByOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HasCommentsUnreadByOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasSelfServiceComments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HasSelfServiceComments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("has_Custom_Solution__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Has_Custom_Solution__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("has_Custom_Solution_old__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Has_Custom_Solution_old__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("has_Non_Licensing_DLLs__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Has_Non_Licensing_DLLs__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("help_Group__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Help_Group__c"));
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
        elemField.setFieldName("hour_Entered_Pause_State__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Hour_Entered_Pause_State__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hour_in_Customer_Action__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Hour_in_Customer_Action__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hours__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Hours__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Impact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impeded__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Impeded__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inbound_Tracking_Number__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Inbound_Tracking_Number__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initial_Client_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Initial_Client_Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initial_Estimate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Initial_Estimate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("isClosed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsClosed"));
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
        elemField.setFieldName("isEscalated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsEscalated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isVisibleInSelfService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsVisibleInSelfService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("is_Admin_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Is_Admin_Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issue_Description__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Issue_Description__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("items_Delivered__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Items_Delivered__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KCD_Solution_Recipient__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "KCD_Solution_Recipient__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KCD_Solution_Recipients__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "KCD_Solution_Recipients__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("known_Defect__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Known_Defect__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lab__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Lab__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("last_Status_Change__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Last_Status_Change__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("location_of_Document__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Location_of_Document__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("long_Term_Actual_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Long_Term_Actual_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("long_Term_Corrective_Action__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Long_Term_Corrective_Action__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("long_Term_Scheduled_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Long_Term_Scheduled_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MDF_Size_GB__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MDF_Size_GB__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("make__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Make__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketing_Surveys__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Marketing_Surveys__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medium__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Medium__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("microsoft_Case_Owner_Email__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Microsoft_Case_Owner_Email__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("microsoft_Case_Owner_Tel__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Microsoft_Case_Owner_Tel__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("microsoft_Case_Owner__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Microsoft_Case_Owner__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("microsoft_Case__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Microsoft_Case__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("microsoft_Severity_Level__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Microsoft_Severity_Level__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("microsoft_Telephone_Number__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Microsoft_Telephone_Number__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("migration_End_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Migration_End_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("migration_Initial_File_Copy_Start_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Migration_Initial_File_Copy_Start_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("migration_Number_of_Files_Copied__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Migration_Number_of_Files_Copied__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("migration_Size_GB__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Migration_Size_GB__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("missed_SLA_Deadline_Ticket_Owner__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Missed_SLA_Deadline_Ticket_Owner__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model_Product_Number__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Model_Product_Number__c"));
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
        elemField.setFieldName("name_of_Document__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name_of_Document__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("needs_Immediate_Attention__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Needs_Immediate_Attention__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("new_Case_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "New_Case_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("new_Comment__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "New_Comment__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("no_Show__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "No_Show__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("number_of_Event_Handlers__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Number_of_Event_Handlers__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number_of_Relativity_Analytics_Indexes__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Number_of_Relativity_Analytics_Indexes__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number_of_dtSearch_Indexes__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Number_of_dtSearch_Indexes__c"));
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
        elemField.setFieldName("opened_Day_of_the_Week__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Opened_Day_of_the_Week__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunity__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Opportunity__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunity__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Opportunity__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Opportunity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oracle_Bug_Number__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Oracle_Bug_Number__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oracle_Status__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Oracle_Status__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oracle_Ticket_Created_On__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Oracle_Ticket_Created_On__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Origin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("original_Ticket__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Original_Ticket__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("other__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Other__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outbound_Tracking_Number__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Outbound_Tracking_Number__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overnight_SLA__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Overnight_SLA__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("override_Account_Validation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Override_Account_Validation__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("owner_Profile__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Owner_Profile__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner_Role__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Owner_Role__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PS_Defect_Class__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PS_Defect_Class__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PS_QC_Comments__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PS_QC_Comments__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PS_QC_Status__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PS_QC_Status__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ParentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partner_Kickoffs__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Partner_Kickoffs__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patch_Number__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Patch_Number__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("person_Returned_To__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Person_Returned_To__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("person_Returned_To__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Person_Returned_To__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("person_Who_Shipped__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Person_Who_Shipped__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("person_Who_Shipped__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Person_Who_Shipped__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planned_File_Location__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Planned_File_Location__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pod_Account__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pod_Account__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pod_User__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pod_User__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pod__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pod__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price_Per_User_2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Price_Per_User_2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price_per_gb__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Price_per_gb__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricing_Schedule__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pricing_Schedule__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("problem_Management_Flag__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Problem_Management_Flag__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("problem_Mgmt_Ticket__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Problem_Mgmt_Ticket__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("problem_Mgmt_Ticket__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Problem_Mgmt_Ticket__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case"));
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
        elemField.setFieldName("product_Application__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Product_Application__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("project_Phase__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Project_Phase__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proposal_Approved__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Proposal_Approved__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QC_Comments__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "QC_Comments__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QC_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "QC_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QC_Person__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "QC_Person__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QC_Person__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "QC_Person__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QC_Status__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "QC_Status__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("question");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Question"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Question"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "QuestionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quick_Guide__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Quick_Guide__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RCA_Certified_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCA_Certified_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("random_Sample__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Random_Sample__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("re_Work_From_Prior_Ticket__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Re_Work_From_Prior_Ticket__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason_for_No_Survey__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Reason_for_No_Survey__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recommended_Upgrade__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Recommended_Upgrade__c"));
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
        elemField.setFieldName("relAn_Date_Verified__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RelAn_Date_Verified__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relAn_Drive_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RelAn_Drive_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relativity_Case__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relativity_Case__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relativity_Case__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relativity_Case__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relativity_Case__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relativity_Version_Fixed__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relativity_Version_Fixed__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relativity_Version_Fixed__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relativity_Version_Fixed__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Release__c"));
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
        elemField.setFieldName("release_Verified__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Release_Verified__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("release__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Release__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("release__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Release__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Release__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("report_Details__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Report_Details__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("request_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Request_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requested_Due_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Requested_Due_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("research__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Research__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retail_Box_Incuded__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Retail_Box_Incuded__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("return_with_Origninal_Shipping_Container__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Return_with_Origninal_Shipping_Container__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("review_for_KCD_By__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Review_for_KCD_By__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("review_for_KCD_Ticket__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Review_for_KCD_Ticket__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("root_Cause_Description__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Root_Cause_Description__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("root_Cause_Sub__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Root_Cause_Sub__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("root_Cause__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Root_Cause__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SFDC_Projects__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SFDC_Projects__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SLA_Exceeded__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SLA_Exceeded__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SLA_Missed_By__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SLA_Missed_By__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SLA_Response_Deadline__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SLA_Response_Deadline__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SLA_Response_Time__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SLA_Response_Time__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SR_Number__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SR_Number__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sales_Queue_Ownership__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Sales_Queue_Ownership__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sales_Queue__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Sales_Queue__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sales_Type_Sub__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Sales_Type_Sub__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sales_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Sales_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduled__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Scheduled__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("school_Program__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "School_Program__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("send_Email_Survey__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Send_Email_Survey__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serial_Number__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Serial_Number__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("server_Application__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Server_Application__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("server_OS__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Server_OS__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shares");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Shares"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipped_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Shipped_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("short_Term_Actual_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Short_Term_Actual_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("short_Term_Corrective_Action__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Short_Term_Corrective_Action__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("short_Term_Scheduled_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Short_Term_Scheduled_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signature__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Signature__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simple_Template__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Simple_Template__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solutions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Solutions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("special_Instructions__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Special_Instructions__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specifics__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Specifics__c"));
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
        elemField.setFieldName("status_Call_End_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status_Call_End_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status_Call_Start_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status_Call_Start_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status_Description__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status_Description__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status_Last_Modified_del__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status_Last_Modified_del__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status_Meeting_Conference_Info__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status_Meeting_Conference_Info__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status_Meeting_Notes__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status_Meeting_Notes__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status_Meeting__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status_Meeting__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status_Meeting__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status_Meeting__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status_Meeting__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("study_Material__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Study_Material__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suppliedEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SuppliedEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suppliedName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SuppliedName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("support_Hours__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Support_Hours__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("support_Sample_Number__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Support_Sample_Number__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("support__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Support__c"));
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
        elemField.setFieldName("teamMembers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TeamMembers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teamTemplateRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TeamTemplateRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("technical_Resource__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Technical_Resource__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("test_Case_to_Reproduce__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Test_Case_to_Reproduce__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketReleaseAssociations__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TicketReleaseAssociations__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticket_ReOpened__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Ticket_ReOpened__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tier_1_User__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tier_1_User__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tier_1_User__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tier_1_User__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tier_2_User__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tier_2_User__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tier_2_User__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tier_2_User__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tier_Assignment_Flag__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tier_Assignment_Flag__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tier_Assignment__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tier_Assignment__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time_Difference_Final__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Time_Difference_Final__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time_Spent_on_Ticket__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Time_Spent_on_Ticket__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time_Tracking_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Time_Tracking_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time_With_Customer__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Time_With_Customer__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time_With_Support__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Time_With_Support__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time_in_Queue__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Time_in_Queue__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time_on_Case_del__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Time_on_Case_del__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_Billable_Time__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Total_Billable_Time__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_Data_Size_in_GB__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Total_Data_Size_in_GB__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_Escalated_Tickets__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Total_Escalated_Tickets__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_Escalated_for_Bug_Review__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Total_Escalated_for_Bug_Review__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_Escalated_to_Dev__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Total_Escalated_to_Dev__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_Evaluated_for_Business_Impact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Total_Evaluated_for_Business_Impact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_Number_of_Deliverables__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Total_Number_of_Deliverables__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_Time__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Total_Time__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trainer_Outline__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Trainer_Outline__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("training_Category__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Category__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("training_PPT__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_PPT__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("training_Workbook__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Workbook__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("tutorial__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tutorial__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type_Sub__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Type_Sub__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type_of_Document__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Type_of_Document__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("update_Interval_Start_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Update_Interval_Start_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("update_Interval__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Update_Interval__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urgency__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Urgency__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validated_In_Version__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Validated_In_Version__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendor__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Vendor__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verify_Release__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Verify_Release__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version_Origin__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Version_Origin__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Version__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("video__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Video__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewer_Version_Fixed__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Viewer_Version_Fixed__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webinar_Recording__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Webinar_Recording__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webinar__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Webinar__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("what__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "What__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("where_is_drive__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Where_is_drive__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("where_is_drive__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Where_is_drive__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Servers__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workaround_Actual_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Workaround_Actual_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workaround_Scheduled_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Workaround_Scheduled_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workaround__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Workaround__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("x24_Hour_Follow_up_Deadline_Missed__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "X24_Hour_Follow_up_Deadline_Missed__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("x90_Day_Deployment_Checkup_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "X90_Day_Deployment_Checkup_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("YTD_Total_Days__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "YTD_Total_Days__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtSearch_Date_Verified__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "dtSearch_Date_Verified__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtSearch_Drive_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "dtSearch_Drive_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KCura_Email_Addresses__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "kCura_Email_Addresses__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KIE_Age__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "kIE_Age__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KIE_Resource__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "kIE_Resource__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KIE_Resource__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "kIE_Resource__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KIE_Status__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "kIE_Status__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time_in_new__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "time_in_new__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XEvaluate_for_Business_Impact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "xEvaluate_for_Business_Impact__c"));
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

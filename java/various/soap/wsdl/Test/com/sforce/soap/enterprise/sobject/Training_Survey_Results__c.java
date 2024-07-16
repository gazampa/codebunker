/**
 * Training_Survey_Results__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Training_Survey_Results__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String additional_comment_or_suggestions__c;

    private java.lang.String admin_Certification_Name__c;

    private com.sforce.soap.enterprise.sobject.Admin_Certification__c admin_Certification_Name__r;

    private java.lang.Double appropriate_Balance_Lecture_and_Hands_On__c;

    private java.lang.String are_our_manuals_compete__c;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.Double comparison_to_Other_Demos__c;

    private java.lang.Double content_Relevance_with_goals__c;

    private java.lang.Double content_relevance_for_role__c;

    private java.lang.Double course_Satisfaction__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String currently_use_Product__c;

    private java.lang.String DO_Content_Useful__c;

    private java.lang.String DO_Training_Content_Details__c;

    private java.lang.String demo_Meet_Expecations__c;

    private java.lang.String demo_Presenter__c;

    private java.lang.String demo_Type__c;

    private java.lang.String demo__c;

    private com.sforce.soap.enterprise.sobject.Demo__c demo__r;

    private java.lang.String did_Training_session_start_on_time__c;

    private java.lang.String facilities_Additional_Info__c;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.lang.String further_Follow_up_Required__c;

    private java.lang.String goToMeeting_Issue_Details__c;

    private java.lang.String go_ToMeeting_Issues__c;

    private java.lang.String how_can_we_improve_webinar__c;

    private java.lang.String how_could_experience_be_better__c;

    private java.lang.String how_could_this_training_be_improved__c;

    private java.lang.Double instructor_Knowledgeable__c;

    private java.lang.Double instructor_was_open_to_questions__c;

    private java.lang.Double interest_Admin_Case_Creation__c;

    private java.lang.Double interest_Admin_Importing_Data__c;

    private java.lang.Double interest_Admin_Productions__c;

    private java.lang.Double interest_Admin_Searching__c;

    private java.lang.Double interest_Admin_Security__c;

    private java.lang.Double interest_Analytics_Index_Creation__c;

    private java.lang.Double interest_Analytics_Index_Optimization__c;

    private java.lang.Double interest_Analytics_Workflow__c;

    private java.lang.Double interest_Analytics__c;

    private java.lang.Double interest_EU_Annotating_Redacting__c;

    private java.lang.Double interest_EU_Coding_Tagging__c;

    private java.lang.Double interest_EU_Navigation__c;

    private java.lang.Double interest_EU_Reviewer_Interface__c;

    private java.lang.Double interest_EU_Searching_Filtering__c;

    private java.lang.Double interest_Infr_Back_End_Architecture__c;

    private java.lang.Double interest_Infr_Maintenance__c;

    private java.lang.Double interest_Infr_Optimization__c;

    private java.lang.Double interest_Infr_Relativity_Agents__c;

    private java.lang.Double interest_Infr_Relativity_Databases__c;

    private java.lang.Double interest_Infr_SQL_Configuration__c;

    private java.lang.Double interest_Infr_Server_Roles__c;

    private java.lang.Double interest_Method_Class_Overview__c;

    private java.lang.Double interest_Method_Class_Setup_Libraries__c;

    private java.lang.Double interest_Method_Class_Strat_Planning__c;

    private java.lang.Double interest_Method_Class_Workflow__c;

    private java.lang.Double interest_Method_Custodian_Management__c;

    private java.lang.Double interest_Method_Interview_Portal__c;

    private java.lang.Double interest_Method_Managing_Hold__c;

    private java.lang.Double interest_Method_Questionnaire__c;

    private java.lang.Double interest_Method_Reporting__c;

    private java.lang.Double interest_Method_Template_Creation__c;

    private java.lang.Double interest_Method_Template_Setup__c;

    private java.lang.String intuitive_Software__c;

    private java.lang.Boolean isDeleted;

    private java.lang.String is_Relativity_an_intuitive_software_appl__c;

    private java.lang.String issue_that_Caused_Negative_Rating__c;

    private java.lang.String issue_with_Presentation__c;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String location__c;

    private java.lang.Double method_Intuitive__c;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private java.lang.String other_webinars_presented__c;

    private java.lang.String overall_Experience__c;

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private java.lang.Double presentation_Skills__c;

    private java.lang.String presenter_Knowledgeable__c;

    private java.lang.Double presenter_Showcased_Functionality__c;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.String product__c;

    private java.lang.Double provided_Valuable_Content__c;

    private java.lang.String RCA_Exam_Proctor__c;

    private java.lang.String RCA_Exam_Version__c;

    private java.lang.Double RCA_Experience_Hands_On_True_Test__c;

    private java.lang.Double RCA_Experience_Instructions_Clear__c;

    private java.lang.Double RCA_Experience_Questions_Fair__c;

    private java.lang.Double RCA_Experience_Time_Sufficient__c;

    private java.lang.Double RCA_Survey_Score__c;

    private java.lang.String RCA_Test_ID__c;

    private java.lang.String RCA_Use_Documentation_to_Study__c;

    private java.lang.String RCA_Was_Documentation_Comprehensive__c;

    private java.lang.String recommend_Training__c;

    private java.lang.Double recommend_to_Colleague__c;

    private com.sforce.soap.enterprise.sobject.RecordType recordType;

    private java.lang.String recordTypeId;

    private java.lang.String session_Start_Details__c;

    private java.lang.String survey_Object__c;

    private java.util.Calendar systemModstamp;

    private java.lang.String trainee_Email_Address__c;

    private java.lang.String trainingName__c;

    private java.lang.String training_Attendee__c;

    private com.sforce.soap.enterprise.sobject.Training_Attendee__c training_Attendee__r;

    private java.lang.String training_Content_Useful_Scenario__c;

    private java.lang.Double training_Covered_Requirements__c;

    private java.lang.String training_Instructor_Role__c;

    private java.lang.String training_Instructor__c;

    private java.lang.Double training_Met_My_Needs__c;

    private java.lang.String training_Name__c;

    private java.lang.String training_Session_Type__c;

    private java.lang.String training_Session__c;

    private com.sforce.soap.enterprise.sobject.Training_Relativity__c training_Session__r;

    private java.lang.Double training_docs_informative_and_complete__c;

    private java.lang.Double training_was_interesting__c;

    private java.lang.String tutorial_Name__c;

    private java.lang.String tutorial__c;

    private java.lang.String tutorial_like_or_dislike__c;

    private java.lang.String volume_of_Content__c;

    private java.lang.String were_facilities_properly_equipped__c;

    private java.lang.String what_could_be_done_better_next_time__c;

    private java.lang.String what_could_have_been_done_better__c;

    private java.lang.String what_did_you_like_best_or_find_the_most__c;

    private java.lang.String what_skills_did_you_learn_that_can_be_ap__c;

    private java.lang.Double workflow__c;

    private java.lang.Double instructor_answered_questions_in_a_way_I__c;

    private java.lang.Double presenter_Understood_Software_Evaluation__c;

    private java.lang.Double recommend_instructor_to_my_collegue__c;

    public Training_Survey_Results__c() {
    }

    public Training_Survey_Results__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String additional_comment_or_suggestions__c,
           java.lang.String admin_Certification_Name__c,
           com.sforce.soap.enterprise.sobject.Admin_Certification__c admin_Certification_Name__r,
           java.lang.Double appropriate_Balance_Lecture_and_Hands_On__c,
           java.lang.String are_our_manuals_compete__c,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.Double comparison_to_Other_Demos__c,
           java.lang.Double content_Relevance_with_goals__c,
           java.lang.Double content_relevance_for_role__c,
           java.lang.Double course_Satisfaction__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String currently_use_Product__c,
           java.lang.String DO_Content_Useful__c,
           java.lang.String DO_Training_Content_Details__c,
           java.lang.String demo_Meet_Expecations__c,
           java.lang.String demo_Presenter__c,
           java.lang.String demo_Type__c,
           java.lang.String demo__c,
           com.sforce.soap.enterprise.sobject.Demo__c demo__r,
           java.lang.String did_Training_session_start_on_time__c,
           java.lang.String facilities_Additional_Info__c,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.lang.String further_Follow_up_Required__c,
           java.lang.String goToMeeting_Issue_Details__c,
           java.lang.String go_ToMeeting_Issues__c,
           java.lang.String how_can_we_improve_webinar__c,
           java.lang.String how_could_experience_be_better__c,
           java.lang.String how_could_this_training_be_improved__c,
           java.lang.Double instructor_Knowledgeable__c,
           java.lang.Double instructor_was_open_to_questions__c,
           java.lang.Double interest_Admin_Case_Creation__c,
           java.lang.Double interest_Admin_Importing_Data__c,
           java.lang.Double interest_Admin_Productions__c,
           java.lang.Double interest_Admin_Searching__c,
           java.lang.Double interest_Admin_Security__c,
           java.lang.Double interest_Analytics_Index_Creation__c,
           java.lang.Double interest_Analytics_Index_Optimization__c,
           java.lang.Double interest_Analytics_Workflow__c,
           java.lang.Double interest_Analytics__c,
           java.lang.Double interest_EU_Annotating_Redacting__c,
           java.lang.Double interest_EU_Coding_Tagging__c,
           java.lang.Double interest_EU_Navigation__c,
           java.lang.Double interest_EU_Reviewer_Interface__c,
           java.lang.Double interest_EU_Searching_Filtering__c,
           java.lang.Double interest_Infr_Back_End_Architecture__c,
           java.lang.Double interest_Infr_Maintenance__c,
           java.lang.Double interest_Infr_Optimization__c,
           java.lang.Double interest_Infr_Relativity_Agents__c,
           java.lang.Double interest_Infr_Relativity_Databases__c,
           java.lang.Double interest_Infr_SQL_Configuration__c,
           java.lang.Double interest_Infr_Server_Roles__c,
           java.lang.Double interest_Method_Class_Overview__c,
           java.lang.Double interest_Method_Class_Setup_Libraries__c,
           java.lang.Double interest_Method_Class_Strat_Planning__c,
           java.lang.Double interest_Method_Class_Workflow__c,
           java.lang.Double interest_Method_Custodian_Management__c,
           java.lang.Double interest_Method_Interview_Portal__c,
           java.lang.Double interest_Method_Managing_Hold__c,
           java.lang.Double interest_Method_Questionnaire__c,
           java.lang.Double interest_Method_Reporting__c,
           java.lang.Double interest_Method_Template_Creation__c,
           java.lang.Double interest_Method_Template_Setup__c,
           java.lang.String intuitive_Software__c,
           java.lang.Boolean isDeleted,
           java.lang.String is_Relativity_an_intuitive_software_appl__c,
           java.lang.String issue_that_Caused_Negative_Rating__c,
           java.lang.String issue_with_Presentation__c,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String location__c,
           java.lang.Double method_Intuitive__c,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           java.lang.String other_webinars_presented__c,
           java.lang.String overall_Experience__c,
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           java.lang.Double presentation_Skills__c,
           java.lang.String presenter_Knowledgeable__c,
           java.lang.Double presenter_Showcased_Functionality__c,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.String product__c,
           java.lang.Double provided_Valuable_Content__c,
           java.lang.String RCA_Exam_Proctor__c,
           java.lang.String RCA_Exam_Version__c,
           java.lang.Double RCA_Experience_Hands_On_True_Test__c,
           java.lang.Double RCA_Experience_Instructions_Clear__c,
           java.lang.Double RCA_Experience_Questions_Fair__c,
           java.lang.Double RCA_Experience_Time_Sufficient__c,
           java.lang.Double RCA_Survey_Score__c,
           java.lang.String RCA_Test_ID__c,
           java.lang.String RCA_Use_Documentation_to_Study__c,
           java.lang.String RCA_Was_Documentation_Comprehensive__c,
           java.lang.String recommend_Training__c,
           java.lang.Double recommend_to_Colleague__c,
           com.sforce.soap.enterprise.sobject.RecordType recordType,
           java.lang.String recordTypeId,
           java.lang.String session_Start_Details__c,
           java.lang.String survey_Object__c,
           java.util.Calendar systemModstamp,
           java.lang.String trainee_Email_Address__c,
           java.lang.String trainingName__c,
           java.lang.String training_Attendee__c,
           com.sforce.soap.enterprise.sobject.Training_Attendee__c training_Attendee__r,
           java.lang.String training_Content_Useful_Scenario__c,
           java.lang.Double training_Covered_Requirements__c,
           java.lang.String training_Instructor_Role__c,
           java.lang.String training_Instructor__c,
           java.lang.Double training_Met_My_Needs__c,
           java.lang.String training_Name__c,
           java.lang.String training_Session_Type__c,
           java.lang.String training_Session__c,
           com.sforce.soap.enterprise.sobject.Training_Relativity__c training_Session__r,
           java.lang.Double training_docs_informative_and_complete__c,
           java.lang.Double training_was_interesting__c,
           java.lang.String tutorial_Name__c,
           java.lang.String tutorial__c,
           java.lang.String tutorial_like_or_dislike__c,
           java.lang.String volume_of_Content__c,
           java.lang.String were_facilities_properly_equipped__c,
           java.lang.String what_could_be_done_better_next_time__c,
           java.lang.String what_could_have_been_done_better__c,
           java.lang.String what_did_you_like_best_or_find_the_most__c,
           java.lang.String what_skills_did_you_learn_that_can_be_ap__c,
           java.lang.Double workflow__c,
           java.lang.Double instructor_answered_questions_in_a_way_I__c,
           java.lang.Double presenter_Understood_Software_Evaluation__c,
           java.lang.Double recommend_instructor_to_my_collegue__c) {
        super(
            fieldsToNull,
            id);
        this.additional_comment_or_suggestions__c = additional_comment_or_suggestions__c;
        this.admin_Certification_Name__c = admin_Certification_Name__c;
        this.admin_Certification_Name__r = admin_Certification_Name__r;
        this.appropriate_Balance_Lecture_and_Hands_On__c = appropriate_Balance_Lecture_and_Hands_On__c;
        this.are_our_manuals_compete__c = are_our_manuals_compete__c;
        this.attachments = attachments;
        this.comparison_to_Other_Demos__c = comparison_to_Other_Demos__c;
        this.content_Relevance_with_goals__c = content_Relevance_with_goals__c;
        this.content_relevance_for_role__c = content_relevance_for_role__c;
        this.course_Satisfaction__c = course_Satisfaction__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.currently_use_Product__c = currently_use_Product__c;
        this.DO_Content_Useful__c = DO_Content_Useful__c;
        this.DO_Training_Content_Details__c = DO_Training_Content_Details__c;
        this.demo_Meet_Expecations__c = demo_Meet_Expecations__c;
        this.demo_Presenter__c = demo_Presenter__c;
        this.demo_Type__c = demo_Type__c;
        this.demo__c = demo__c;
        this.demo__r = demo__r;
        this.did_Training_session_start_on_time__c = did_Training_session_start_on_time__c;
        this.facilities_Additional_Info__c = facilities_Additional_Info__c;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.further_Follow_up_Required__c = further_Follow_up_Required__c;
        this.goToMeeting_Issue_Details__c = goToMeeting_Issue_Details__c;
        this.go_ToMeeting_Issues__c = go_ToMeeting_Issues__c;
        this.how_can_we_improve_webinar__c = how_can_we_improve_webinar__c;
        this.how_could_experience_be_better__c = how_could_experience_be_better__c;
        this.how_could_this_training_be_improved__c = how_could_this_training_be_improved__c;
        this.instructor_Knowledgeable__c = instructor_Knowledgeable__c;
        this.instructor_was_open_to_questions__c = instructor_was_open_to_questions__c;
        this.interest_Admin_Case_Creation__c = interest_Admin_Case_Creation__c;
        this.interest_Admin_Importing_Data__c = interest_Admin_Importing_Data__c;
        this.interest_Admin_Productions__c = interest_Admin_Productions__c;
        this.interest_Admin_Searching__c = interest_Admin_Searching__c;
        this.interest_Admin_Security__c = interest_Admin_Security__c;
        this.interest_Analytics_Index_Creation__c = interest_Analytics_Index_Creation__c;
        this.interest_Analytics_Index_Optimization__c = interest_Analytics_Index_Optimization__c;
        this.interest_Analytics_Workflow__c = interest_Analytics_Workflow__c;
        this.interest_Analytics__c = interest_Analytics__c;
        this.interest_EU_Annotating_Redacting__c = interest_EU_Annotating_Redacting__c;
        this.interest_EU_Coding_Tagging__c = interest_EU_Coding_Tagging__c;
        this.interest_EU_Navigation__c = interest_EU_Navigation__c;
        this.interest_EU_Reviewer_Interface__c = interest_EU_Reviewer_Interface__c;
        this.interest_EU_Searching_Filtering__c = interest_EU_Searching_Filtering__c;
        this.interest_Infr_Back_End_Architecture__c = interest_Infr_Back_End_Architecture__c;
        this.interest_Infr_Maintenance__c = interest_Infr_Maintenance__c;
        this.interest_Infr_Optimization__c = interest_Infr_Optimization__c;
        this.interest_Infr_Relativity_Agents__c = interest_Infr_Relativity_Agents__c;
        this.interest_Infr_Relativity_Databases__c = interest_Infr_Relativity_Databases__c;
        this.interest_Infr_SQL_Configuration__c = interest_Infr_SQL_Configuration__c;
        this.interest_Infr_Server_Roles__c = interest_Infr_Server_Roles__c;
        this.interest_Method_Class_Overview__c = interest_Method_Class_Overview__c;
        this.interest_Method_Class_Setup_Libraries__c = interest_Method_Class_Setup_Libraries__c;
        this.interest_Method_Class_Strat_Planning__c = interest_Method_Class_Strat_Planning__c;
        this.interest_Method_Class_Workflow__c = interest_Method_Class_Workflow__c;
        this.interest_Method_Custodian_Management__c = interest_Method_Custodian_Management__c;
        this.interest_Method_Interview_Portal__c = interest_Method_Interview_Portal__c;
        this.interest_Method_Managing_Hold__c = interest_Method_Managing_Hold__c;
        this.interest_Method_Questionnaire__c = interest_Method_Questionnaire__c;
        this.interest_Method_Reporting__c = interest_Method_Reporting__c;
        this.interest_Method_Template_Creation__c = interest_Method_Template_Creation__c;
        this.interest_Method_Template_Setup__c = interest_Method_Template_Setup__c;
        this.intuitive_Software__c = intuitive_Software__c;
        this.isDeleted = isDeleted;
        this.is_Relativity_an_intuitive_software_appl__c = is_Relativity_an_intuitive_software_appl__c;
        this.issue_that_Caused_Negative_Rating__c = issue_that_Caused_Negative_Rating__c;
        this.issue_with_Presentation__c = issue_with_Presentation__c;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.location__c = location__c;
        this.method_Intuitive__c = method_Intuitive__c;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.other_webinars_presented__c = other_webinars_presented__c;
        this.overall_Experience__c = overall_Experience__c;
        this.owner = owner;
        this.ownerId = ownerId;
        this.presentation_Skills__c = presentation_Skills__c;
        this.presenter_Knowledgeable__c = presenter_Knowledgeable__c;
        this.presenter_Showcased_Functionality__c = presenter_Showcased_Functionality__c;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.product__c = product__c;
        this.provided_Valuable_Content__c = provided_Valuable_Content__c;
        this.RCA_Exam_Proctor__c = RCA_Exam_Proctor__c;
        this.RCA_Exam_Version__c = RCA_Exam_Version__c;
        this.RCA_Experience_Hands_On_True_Test__c = RCA_Experience_Hands_On_True_Test__c;
        this.RCA_Experience_Instructions_Clear__c = RCA_Experience_Instructions_Clear__c;
        this.RCA_Experience_Questions_Fair__c = RCA_Experience_Questions_Fair__c;
        this.RCA_Experience_Time_Sufficient__c = RCA_Experience_Time_Sufficient__c;
        this.RCA_Survey_Score__c = RCA_Survey_Score__c;
        this.RCA_Test_ID__c = RCA_Test_ID__c;
        this.RCA_Use_Documentation_to_Study__c = RCA_Use_Documentation_to_Study__c;
        this.RCA_Was_Documentation_Comprehensive__c = RCA_Was_Documentation_Comprehensive__c;
        this.recommend_Training__c = recommend_Training__c;
        this.recommend_to_Colleague__c = recommend_to_Colleague__c;
        this.recordType = recordType;
        this.recordTypeId = recordTypeId;
        this.session_Start_Details__c = session_Start_Details__c;
        this.survey_Object__c = survey_Object__c;
        this.systemModstamp = systemModstamp;
        this.trainee_Email_Address__c = trainee_Email_Address__c;
        this.trainingName__c = trainingName__c;
        this.training_Attendee__c = training_Attendee__c;
        this.training_Attendee__r = training_Attendee__r;
        this.training_Content_Useful_Scenario__c = training_Content_Useful_Scenario__c;
        this.training_Covered_Requirements__c = training_Covered_Requirements__c;
        this.training_Instructor_Role__c = training_Instructor_Role__c;
        this.training_Instructor__c = training_Instructor__c;
        this.training_Met_My_Needs__c = training_Met_My_Needs__c;
        this.training_Name__c = training_Name__c;
        this.training_Session_Type__c = training_Session_Type__c;
        this.training_Session__c = training_Session__c;
        this.training_Session__r = training_Session__r;
        this.training_docs_informative_and_complete__c = training_docs_informative_and_complete__c;
        this.training_was_interesting__c = training_was_interesting__c;
        this.tutorial_Name__c = tutorial_Name__c;
        this.tutorial__c = tutorial__c;
        this.tutorial_like_or_dislike__c = tutorial_like_or_dislike__c;
        this.volume_of_Content__c = volume_of_Content__c;
        this.were_facilities_properly_equipped__c = were_facilities_properly_equipped__c;
        this.what_could_be_done_better_next_time__c = what_could_be_done_better_next_time__c;
        this.what_could_have_been_done_better__c = what_could_have_been_done_better__c;
        this.what_did_you_like_best_or_find_the_most__c = what_did_you_like_best_or_find_the_most__c;
        this.what_skills_did_you_learn_that_can_be_ap__c = what_skills_did_you_learn_that_can_be_ap__c;
        this.workflow__c = workflow__c;
        this.instructor_answered_questions_in_a_way_I__c = instructor_answered_questions_in_a_way_I__c;
        this.presenter_Understood_Software_Evaluation__c = presenter_Understood_Software_Evaluation__c;
        this.recommend_instructor_to_my_collegue__c = recommend_instructor_to_my_collegue__c;
    }


    /**
     * Gets the additional_comment_or_suggestions__c value for this Training_Survey_Results__c.
     * 
     * @return additional_comment_or_suggestions__c
     */
    public java.lang.String getAdditional_comment_or_suggestions__c() {
        return additional_comment_or_suggestions__c;
    }


    /**
     * Sets the additional_comment_or_suggestions__c value for this Training_Survey_Results__c.
     * 
     * @param additional_comment_or_suggestions__c
     */
    public void setAdditional_comment_or_suggestions__c(java.lang.String additional_comment_or_suggestions__c) {
        this.additional_comment_or_suggestions__c = additional_comment_or_suggestions__c;
    }


    /**
     * Gets the admin_Certification_Name__c value for this Training_Survey_Results__c.
     * 
     * @return admin_Certification_Name__c
     */
    public java.lang.String getAdmin_Certification_Name__c() {
        return admin_Certification_Name__c;
    }


    /**
     * Sets the admin_Certification_Name__c value for this Training_Survey_Results__c.
     * 
     * @param admin_Certification_Name__c
     */
    public void setAdmin_Certification_Name__c(java.lang.String admin_Certification_Name__c) {
        this.admin_Certification_Name__c = admin_Certification_Name__c;
    }


    /**
     * Gets the admin_Certification_Name__r value for this Training_Survey_Results__c.
     * 
     * @return admin_Certification_Name__r
     */
    public com.sforce.soap.enterprise.sobject.Admin_Certification__c getAdmin_Certification_Name__r() {
        return admin_Certification_Name__r;
    }


    /**
     * Sets the admin_Certification_Name__r value for this Training_Survey_Results__c.
     * 
     * @param admin_Certification_Name__r
     */
    public void setAdmin_Certification_Name__r(com.sforce.soap.enterprise.sobject.Admin_Certification__c admin_Certification_Name__r) {
        this.admin_Certification_Name__r = admin_Certification_Name__r;
    }


    /**
     * Gets the appropriate_Balance_Lecture_and_Hands_On__c value for this Training_Survey_Results__c.
     * 
     * @return appropriate_Balance_Lecture_and_Hands_On__c
     */
    public java.lang.Double getAppropriate_Balance_Lecture_and_Hands_On__c() {
        return appropriate_Balance_Lecture_and_Hands_On__c;
    }


    /**
     * Sets the appropriate_Balance_Lecture_and_Hands_On__c value for this Training_Survey_Results__c.
     * 
     * @param appropriate_Balance_Lecture_and_Hands_On__c
     */
    public void setAppropriate_Balance_Lecture_and_Hands_On__c(java.lang.Double appropriate_Balance_Lecture_and_Hands_On__c) {
        this.appropriate_Balance_Lecture_and_Hands_On__c = appropriate_Balance_Lecture_and_Hands_On__c;
    }


    /**
     * Gets the are_our_manuals_compete__c value for this Training_Survey_Results__c.
     * 
     * @return are_our_manuals_compete__c
     */
    public java.lang.String getAre_our_manuals_compete__c() {
        return are_our_manuals_compete__c;
    }


    /**
     * Sets the are_our_manuals_compete__c value for this Training_Survey_Results__c.
     * 
     * @param are_our_manuals_compete__c
     */
    public void setAre_our_manuals_compete__c(java.lang.String are_our_manuals_compete__c) {
        this.are_our_manuals_compete__c = are_our_manuals_compete__c;
    }


    /**
     * Gets the attachments value for this Training_Survey_Results__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Training_Survey_Results__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the comparison_to_Other_Demos__c value for this Training_Survey_Results__c.
     * 
     * @return comparison_to_Other_Demos__c
     */
    public java.lang.Double getComparison_to_Other_Demos__c() {
        return comparison_to_Other_Demos__c;
    }


    /**
     * Sets the comparison_to_Other_Demos__c value for this Training_Survey_Results__c.
     * 
     * @param comparison_to_Other_Demos__c
     */
    public void setComparison_to_Other_Demos__c(java.lang.Double comparison_to_Other_Demos__c) {
        this.comparison_to_Other_Demos__c = comparison_to_Other_Demos__c;
    }


    /**
     * Gets the content_Relevance_with_goals__c value for this Training_Survey_Results__c.
     * 
     * @return content_Relevance_with_goals__c
     */
    public java.lang.Double getContent_Relevance_with_goals__c() {
        return content_Relevance_with_goals__c;
    }


    /**
     * Sets the content_Relevance_with_goals__c value for this Training_Survey_Results__c.
     * 
     * @param content_Relevance_with_goals__c
     */
    public void setContent_Relevance_with_goals__c(java.lang.Double content_Relevance_with_goals__c) {
        this.content_Relevance_with_goals__c = content_Relevance_with_goals__c;
    }


    /**
     * Gets the content_relevance_for_role__c value for this Training_Survey_Results__c.
     * 
     * @return content_relevance_for_role__c
     */
    public java.lang.Double getContent_relevance_for_role__c() {
        return content_relevance_for_role__c;
    }


    /**
     * Sets the content_relevance_for_role__c value for this Training_Survey_Results__c.
     * 
     * @param content_relevance_for_role__c
     */
    public void setContent_relevance_for_role__c(java.lang.Double content_relevance_for_role__c) {
        this.content_relevance_for_role__c = content_relevance_for_role__c;
    }


    /**
     * Gets the course_Satisfaction__c value for this Training_Survey_Results__c.
     * 
     * @return course_Satisfaction__c
     */
    public java.lang.Double getCourse_Satisfaction__c() {
        return course_Satisfaction__c;
    }


    /**
     * Sets the course_Satisfaction__c value for this Training_Survey_Results__c.
     * 
     * @param course_Satisfaction__c
     */
    public void setCourse_Satisfaction__c(java.lang.Double course_Satisfaction__c) {
        this.course_Satisfaction__c = course_Satisfaction__c;
    }


    /**
     * Gets the createdBy value for this Training_Survey_Results__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Training_Survey_Results__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Training_Survey_Results__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Training_Survey_Results__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Training_Survey_Results__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Training_Survey_Results__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the currently_use_Product__c value for this Training_Survey_Results__c.
     * 
     * @return currently_use_Product__c
     */
    public java.lang.String getCurrently_use_Product__c() {
        return currently_use_Product__c;
    }


    /**
     * Sets the currently_use_Product__c value for this Training_Survey_Results__c.
     * 
     * @param currently_use_Product__c
     */
    public void setCurrently_use_Product__c(java.lang.String currently_use_Product__c) {
        this.currently_use_Product__c = currently_use_Product__c;
    }


    /**
     * Gets the DO_Content_Useful__c value for this Training_Survey_Results__c.
     * 
     * @return DO_Content_Useful__c
     */
    public java.lang.String getDO_Content_Useful__c() {
        return DO_Content_Useful__c;
    }


    /**
     * Sets the DO_Content_Useful__c value for this Training_Survey_Results__c.
     * 
     * @param DO_Content_Useful__c
     */
    public void setDO_Content_Useful__c(java.lang.String DO_Content_Useful__c) {
        this.DO_Content_Useful__c = DO_Content_Useful__c;
    }


    /**
     * Gets the DO_Training_Content_Details__c value for this Training_Survey_Results__c.
     * 
     * @return DO_Training_Content_Details__c
     */
    public java.lang.String getDO_Training_Content_Details__c() {
        return DO_Training_Content_Details__c;
    }


    /**
     * Sets the DO_Training_Content_Details__c value for this Training_Survey_Results__c.
     * 
     * @param DO_Training_Content_Details__c
     */
    public void setDO_Training_Content_Details__c(java.lang.String DO_Training_Content_Details__c) {
        this.DO_Training_Content_Details__c = DO_Training_Content_Details__c;
    }


    /**
     * Gets the demo_Meet_Expecations__c value for this Training_Survey_Results__c.
     * 
     * @return demo_Meet_Expecations__c
     */
    public java.lang.String getDemo_Meet_Expecations__c() {
        return demo_Meet_Expecations__c;
    }


    /**
     * Sets the demo_Meet_Expecations__c value for this Training_Survey_Results__c.
     * 
     * @param demo_Meet_Expecations__c
     */
    public void setDemo_Meet_Expecations__c(java.lang.String demo_Meet_Expecations__c) {
        this.demo_Meet_Expecations__c = demo_Meet_Expecations__c;
    }


    /**
     * Gets the demo_Presenter__c value for this Training_Survey_Results__c.
     * 
     * @return demo_Presenter__c
     */
    public java.lang.String getDemo_Presenter__c() {
        return demo_Presenter__c;
    }


    /**
     * Sets the demo_Presenter__c value for this Training_Survey_Results__c.
     * 
     * @param demo_Presenter__c
     */
    public void setDemo_Presenter__c(java.lang.String demo_Presenter__c) {
        this.demo_Presenter__c = demo_Presenter__c;
    }


    /**
     * Gets the demo_Type__c value for this Training_Survey_Results__c.
     * 
     * @return demo_Type__c
     */
    public java.lang.String getDemo_Type__c() {
        return demo_Type__c;
    }


    /**
     * Sets the demo_Type__c value for this Training_Survey_Results__c.
     * 
     * @param demo_Type__c
     */
    public void setDemo_Type__c(java.lang.String demo_Type__c) {
        this.demo_Type__c = demo_Type__c;
    }


    /**
     * Gets the demo__c value for this Training_Survey_Results__c.
     * 
     * @return demo__c
     */
    public java.lang.String getDemo__c() {
        return demo__c;
    }


    /**
     * Sets the demo__c value for this Training_Survey_Results__c.
     * 
     * @param demo__c
     */
    public void setDemo__c(java.lang.String demo__c) {
        this.demo__c = demo__c;
    }


    /**
     * Gets the demo__r value for this Training_Survey_Results__c.
     * 
     * @return demo__r
     */
    public com.sforce.soap.enterprise.sobject.Demo__c getDemo__r() {
        return demo__r;
    }


    /**
     * Sets the demo__r value for this Training_Survey_Results__c.
     * 
     * @param demo__r
     */
    public void setDemo__r(com.sforce.soap.enterprise.sobject.Demo__c demo__r) {
        this.demo__r = demo__r;
    }


    /**
     * Gets the did_Training_session_start_on_time__c value for this Training_Survey_Results__c.
     * 
     * @return did_Training_session_start_on_time__c
     */
    public java.lang.String getDid_Training_session_start_on_time__c() {
        return did_Training_session_start_on_time__c;
    }


    /**
     * Sets the did_Training_session_start_on_time__c value for this Training_Survey_Results__c.
     * 
     * @param did_Training_session_start_on_time__c
     */
    public void setDid_Training_session_start_on_time__c(java.lang.String did_Training_session_start_on_time__c) {
        this.did_Training_session_start_on_time__c = did_Training_session_start_on_time__c;
    }


    /**
     * Gets the facilities_Additional_Info__c value for this Training_Survey_Results__c.
     * 
     * @return facilities_Additional_Info__c
     */
    public java.lang.String getFacilities_Additional_Info__c() {
        return facilities_Additional_Info__c;
    }


    /**
     * Sets the facilities_Additional_Info__c value for this Training_Survey_Results__c.
     * 
     * @param facilities_Additional_Info__c
     */
    public void setFacilities_Additional_Info__c(java.lang.String facilities_Additional_Info__c) {
        this.facilities_Additional_Info__c = facilities_Additional_Info__c;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Training_Survey_Results__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Training_Survey_Results__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the further_Follow_up_Required__c value for this Training_Survey_Results__c.
     * 
     * @return further_Follow_up_Required__c
     */
    public java.lang.String getFurther_Follow_up_Required__c() {
        return further_Follow_up_Required__c;
    }


    /**
     * Sets the further_Follow_up_Required__c value for this Training_Survey_Results__c.
     * 
     * @param further_Follow_up_Required__c
     */
    public void setFurther_Follow_up_Required__c(java.lang.String further_Follow_up_Required__c) {
        this.further_Follow_up_Required__c = further_Follow_up_Required__c;
    }


    /**
     * Gets the goToMeeting_Issue_Details__c value for this Training_Survey_Results__c.
     * 
     * @return goToMeeting_Issue_Details__c
     */
    public java.lang.String getGoToMeeting_Issue_Details__c() {
        return goToMeeting_Issue_Details__c;
    }


    /**
     * Sets the goToMeeting_Issue_Details__c value for this Training_Survey_Results__c.
     * 
     * @param goToMeeting_Issue_Details__c
     */
    public void setGoToMeeting_Issue_Details__c(java.lang.String goToMeeting_Issue_Details__c) {
        this.goToMeeting_Issue_Details__c = goToMeeting_Issue_Details__c;
    }


    /**
     * Gets the go_ToMeeting_Issues__c value for this Training_Survey_Results__c.
     * 
     * @return go_ToMeeting_Issues__c
     */
    public java.lang.String getGo_ToMeeting_Issues__c() {
        return go_ToMeeting_Issues__c;
    }


    /**
     * Sets the go_ToMeeting_Issues__c value for this Training_Survey_Results__c.
     * 
     * @param go_ToMeeting_Issues__c
     */
    public void setGo_ToMeeting_Issues__c(java.lang.String go_ToMeeting_Issues__c) {
        this.go_ToMeeting_Issues__c = go_ToMeeting_Issues__c;
    }


    /**
     * Gets the how_can_we_improve_webinar__c value for this Training_Survey_Results__c.
     * 
     * @return how_can_we_improve_webinar__c
     */
    public java.lang.String getHow_can_we_improve_webinar__c() {
        return how_can_we_improve_webinar__c;
    }


    /**
     * Sets the how_can_we_improve_webinar__c value for this Training_Survey_Results__c.
     * 
     * @param how_can_we_improve_webinar__c
     */
    public void setHow_can_we_improve_webinar__c(java.lang.String how_can_we_improve_webinar__c) {
        this.how_can_we_improve_webinar__c = how_can_we_improve_webinar__c;
    }


    /**
     * Gets the how_could_experience_be_better__c value for this Training_Survey_Results__c.
     * 
     * @return how_could_experience_be_better__c
     */
    public java.lang.String getHow_could_experience_be_better__c() {
        return how_could_experience_be_better__c;
    }


    /**
     * Sets the how_could_experience_be_better__c value for this Training_Survey_Results__c.
     * 
     * @param how_could_experience_be_better__c
     */
    public void setHow_could_experience_be_better__c(java.lang.String how_could_experience_be_better__c) {
        this.how_could_experience_be_better__c = how_could_experience_be_better__c;
    }


    /**
     * Gets the how_could_this_training_be_improved__c value for this Training_Survey_Results__c.
     * 
     * @return how_could_this_training_be_improved__c
     */
    public java.lang.String getHow_could_this_training_be_improved__c() {
        return how_could_this_training_be_improved__c;
    }


    /**
     * Sets the how_could_this_training_be_improved__c value for this Training_Survey_Results__c.
     * 
     * @param how_could_this_training_be_improved__c
     */
    public void setHow_could_this_training_be_improved__c(java.lang.String how_could_this_training_be_improved__c) {
        this.how_could_this_training_be_improved__c = how_could_this_training_be_improved__c;
    }


    /**
     * Gets the instructor_Knowledgeable__c value for this Training_Survey_Results__c.
     * 
     * @return instructor_Knowledgeable__c
     */
    public java.lang.Double getInstructor_Knowledgeable__c() {
        return instructor_Knowledgeable__c;
    }


    /**
     * Sets the instructor_Knowledgeable__c value for this Training_Survey_Results__c.
     * 
     * @param instructor_Knowledgeable__c
     */
    public void setInstructor_Knowledgeable__c(java.lang.Double instructor_Knowledgeable__c) {
        this.instructor_Knowledgeable__c = instructor_Knowledgeable__c;
    }


    /**
     * Gets the instructor_was_open_to_questions__c value for this Training_Survey_Results__c.
     * 
     * @return instructor_was_open_to_questions__c
     */
    public java.lang.Double getInstructor_was_open_to_questions__c() {
        return instructor_was_open_to_questions__c;
    }


    /**
     * Sets the instructor_was_open_to_questions__c value for this Training_Survey_Results__c.
     * 
     * @param instructor_was_open_to_questions__c
     */
    public void setInstructor_was_open_to_questions__c(java.lang.Double instructor_was_open_to_questions__c) {
        this.instructor_was_open_to_questions__c = instructor_was_open_to_questions__c;
    }


    /**
     * Gets the interest_Admin_Case_Creation__c value for this Training_Survey_Results__c.
     * 
     * @return interest_Admin_Case_Creation__c
     */
    public java.lang.Double getInterest_Admin_Case_Creation__c() {
        return interest_Admin_Case_Creation__c;
    }


    /**
     * Sets the interest_Admin_Case_Creation__c value for this Training_Survey_Results__c.
     * 
     * @param interest_Admin_Case_Creation__c
     */
    public void setInterest_Admin_Case_Creation__c(java.lang.Double interest_Admin_Case_Creation__c) {
        this.interest_Admin_Case_Creation__c = interest_Admin_Case_Creation__c;
    }


    /**
     * Gets the interest_Admin_Importing_Data__c value for this Training_Survey_Results__c.
     * 
     * @return interest_Admin_Importing_Data__c
     */
    public java.lang.Double getInterest_Admin_Importing_Data__c() {
        return interest_Admin_Importing_Data__c;
    }


    /**
     * Sets the interest_Admin_Importing_Data__c value for this Training_Survey_Results__c.
     * 
     * @param interest_Admin_Importing_Data__c
     */
    public void setInterest_Admin_Importing_Data__c(java.lang.Double interest_Admin_Importing_Data__c) {
        this.interest_Admin_Importing_Data__c = interest_Admin_Importing_Data__c;
    }


    /**
     * Gets the interest_Admin_Productions__c value for this Training_Survey_Results__c.
     * 
     * @return interest_Admin_Productions__c
     */
    public java.lang.Double getInterest_Admin_Productions__c() {
        return interest_Admin_Productions__c;
    }


    /**
     * Sets the interest_Admin_Productions__c value for this Training_Survey_Results__c.
     * 
     * @param interest_Admin_Productions__c
     */
    public void setInterest_Admin_Productions__c(java.lang.Double interest_Admin_Productions__c) {
        this.interest_Admin_Productions__c = interest_Admin_Productions__c;
    }


    /**
     * Gets the interest_Admin_Searching__c value for this Training_Survey_Results__c.
     * 
     * @return interest_Admin_Searching__c
     */
    public java.lang.Double getInterest_Admin_Searching__c() {
        return interest_Admin_Searching__c;
    }


    /**
     * Sets the interest_Admin_Searching__c value for this Training_Survey_Results__c.
     * 
     * @param interest_Admin_Searching__c
     */
    public void setInterest_Admin_Searching__c(java.lang.Double interest_Admin_Searching__c) {
        this.interest_Admin_Searching__c = interest_Admin_Searching__c;
    }


    /**
     * Gets the interest_Admin_Security__c value for this Training_Survey_Results__c.
     * 
     * @return interest_Admin_Security__c
     */
    public java.lang.Double getInterest_Admin_Security__c() {
        return interest_Admin_Security__c;
    }


    /**
     * Sets the interest_Admin_Security__c value for this Training_Survey_Results__c.
     * 
     * @param interest_Admin_Security__c
     */
    public void setInterest_Admin_Security__c(java.lang.Double interest_Admin_Security__c) {
        this.interest_Admin_Security__c = interest_Admin_Security__c;
    }


    /**
     * Gets the interest_Analytics_Index_Creation__c value for this Training_Survey_Results__c.
     * 
     * @return interest_Analytics_Index_Creation__c
     */
    public java.lang.Double getInterest_Analytics_Index_Creation__c() {
        return interest_Analytics_Index_Creation__c;
    }


    /**
     * Sets the interest_Analytics_Index_Creation__c value for this Training_Survey_Results__c.
     * 
     * @param interest_Analytics_Index_Creation__c
     */
    public void setInterest_Analytics_Index_Creation__c(java.lang.Double interest_Analytics_Index_Creation__c) {
        this.interest_Analytics_Index_Creation__c = interest_Analytics_Index_Creation__c;
    }


    /**
     * Gets the interest_Analytics_Index_Optimization__c value for this Training_Survey_Results__c.
     * 
     * @return interest_Analytics_Index_Optimization__c
     */
    public java.lang.Double getInterest_Analytics_Index_Optimization__c() {
        return interest_Analytics_Index_Optimization__c;
    }


    /**
     * Sets the interest_Analytics_Index_Optimization__c value for this Training_Survey_Results__c.
     * 
     * @param interest_Analytics_Index_Optimization__c
     */
    public void setInterest_Analytics_Index_Optimization__c(java.lang.Double interest_Analytics_Index_Optimization__c) {
        this.interest_Analytics_Index_Optimization__c = interest_Analytics_Index_Optimization__c;
    }


    /**
     * Gets the interest_Analytics_Workflow__c value for this Training_Survey_Results__c.
     * 
     * @return interest_Analytics_Workflow__c
     */
    public java.lang.Double getInterest_Analytics_Workflow__c() {
        return interest_Analytics_Workflow__c;
    }


    /**
     * Sets the interest_Analytics_Workflow__c value for this Training_Survey_Results__c.
     * 
     * @param interest_Analytics_Workflow__c
     */
    public void setInterest_Analytics_Workflow__c(java.lang.Double interest_Analytics_Workflow__c) {
        this.interest_Analytics_Workflow__c = interest_Analytics_Workflow__c;
    }


    /**
     * Gets the interest_Analytics__c value for this Training_Survey_Results__c.
     * 
     * @return interest_Analytics__c
     */
    public java.lang.Double getInterest_Analytics__c() {
        return interest_Analytics__c;
    }


    /**
     * Sets the interest_Analytics__c value for this Training_Survey_Results__c.
     * 
     * @param interest_Analytics__c
     */
    public void setInterest_Analytics__c(java.lang.Double interest_Analytics__c) {
        this.interest_Analytics__c = interest_Analytics__c;
    }


    /**
     * Gets the interest_EU_Annotating_Redacting__c value for this Training_Survey_Results__c.
     * 
     * @return interest_EU_Annotating_Redacting__c
     */
    public java.lang.Double getInterest_EU_Annotating_Redacting__c() {
        return interest_EU_Annotating_Redacting__c;
    }


    /**
     * Sets the interest_EU_Annotating_Redacting__c value for this Training_Survey_Results__c.
     * 
     * @param interest_EU_Annotating_Redacting__c
     */
    public void setInterest_EU_Annotating_Redacting__c(java.lang.Double interest_EU_Annotating_Redacting__c) {
        this.interest_EU_Annotating_Redacting__c = interest_EU_Annotating_Redacting__c;
    }


    /**
     * Gets the interest_EU_Coding_Tagging__c value for this Training_Survey_Results__c.
     * 
     * @return interest_EU_Coding_Tagging__c
     */
    public java.lang.Double getInterest_EU_Coding_Tagging__c() {
        return interest_EU_Coding_Tagging__c;
    }


    /**
     * Sets the interest_EU_Coding_Tagging__c value for this Training_Survey_Results__c.
     * 
     * @param interest_EU_Coding_Tagging__c
     */
    public void setInterest_EU_Coding_Tagging__c(java.lang.Double interest_EU_Coding_Tagging__c) {
        this.interest_EU_Coding_Tagging__c = interest_EU_Coding_Tagging__c;
    }


    /**
     * Gets the interest_EU_Navigation__c value for this Training_Survey_Results__c.
     * 
     * @return interest_EU_Navigation__c
     */
    public java.lang.Double getInterest_EU_Navigation__c() {
        return interest_EU_Navigation__c;
    }


    /**
     * Sets the interest_EU_Navigation__c value for this Training_Survey_Results__c.
     * 
     * @param interest_EU_Navigation__c
     */
    public void setInterest_EU_Navigation__c(java.lang.Double interest_EU_Navigation__c) {
        this.interest_EU_Navigation__c = interest_EU_Navigation__c;
    }


    /**
     * Gets the interest_EU_Reviewer_Interface__c value for this Training_Survey_Results__c.
     * 
     * @return interest_EU_Reviewer_Interface__c
     */
    public java.lang.Double getInterest_EU_Reviewer_Interface__c() {
        return interest_EU_Reviewer_Interface__c;
    }


    /**
     * Sets the interest_EU_Reviewer_Interface__c value for this Training_Survey_Results__c.
     * 
     * @param interest_EU_Reviewer_Interface__c
     */
    public void setInterest_EU_Reviewer_Interface__c(java.lang.Double interest_EU_Reviewer_Interface__c) {
        this.interest_EU_Reviewer_Interface__c = interest_EU_Reviewer_Interface__c;
    }


    /**
     * Gets the interest_EU_Searching_Filtering__c value for this Training_Survey_Results__c.
     * 
     * @return interest_EU_Searching_Filtering__c
     */
    public java.lang.Double getInterest_EU_Searching_Filtering__c() {
        return interest_EU_Searching_Filtering__c;
    }


    /**
     * Sets the interest_EU_Searching_Filtering__c value for this Training_Survey_Results__c.
     * 
     * @param interest_EU_Searching_Filtering__c
     */
    public void setInterest_EU_Searching_Filtering__c(java.lang.Double interest_EU_Searching_Filtering__c) {
        this.interest_EU_Searching_Filtering__c = interest_EU_Searching_Filtering__c;
    }


    /**
     * Gets the interest_Infr_Back_End_Architecture__c value for this Training_Survey_Results__c.
     * 
     * @return interest_Infr_Back_End_Architecture__c
     */
    public java.lang.Double getInterest_Infr_Back_End_Architecture__c() {
        return interest_Infr_Back_End_Architecture__c;
    }


    /**
     * Sets the interest_Infr_Back_End_Architecture__c value for this Training_Survey_Results__c.
     * 
     * @param interest_Infr_Back_End_Architecture__c
     */
    public void setInterest_Infr_Back_End_Architecture__c(java.lang.Double interest_Infr_Back_End_Architecture__c) {
        this.interest_Infr_Back_End_Architecture__c = interest_Infr_Back_End_Architecture__c;
    }


    /**
     * Gets the interest_Infr_Maintenance__c value for this Training_Survey_Results__c.
     * 
     * @return interest_Infr_Maintenance__c
     */
    public java.lang.Double getInterest_Infr_Maintenance__c() {
        return interest_Infr_Maintenance__c;
    }


    /**
     * Sets the interest_Infr_Maintenance__c value for this Training_Survey_Results__c.
     * 
     * @param interest_Infr_Maintenance__c
     */
    public void setInterest_Infr_Maintenance__c(java.lang.Double interest_Infr_Maintenance__c) {
        this.interest_Infr_Maintenance__c = interest_Infr_Maintenance__c;
    }


    /**
     * Gets the interest_Infr_Optimization__c value for this Training_Survey_Results__c.
     * 
     * @return interest_Infr_Optimization__c
     */
    public java.lang.Double getInterest_Infr_Optimization__c() {
        return interest_Infr_Optimization__c;
    }


    /**
     * Sets the interest_Infr_Optimization__c value for this Training_Survey_Results__c.
     * 
     * @param interest_Infr_Optimization__c
     */
    public void setInterest_Infr_Optimization__c(java.lang.Double interest_Infr_Optimization__c) {
        this.interest_Infr_Optimization__c = interest_Infr_Optimization__c;
    }


    /**
     * Gets the interest_Infr_Relativity_Agents__c value for this Training_Survey_Results__c.
     * 
     * @return interest_Infr_Relativity_Agents__c
     */
    public java.lang.Double getInterest_Infr_Relativity_Agents__c() {
        return interest_Infr_Relativity_Agents__c;
    }


    /**
     * Sets the interest_Infr_Relativity_Agents__c value for this Training_Survey_Results__c.
     * 
     * @param interest_Infr_Relativity_Agents__c
     */
    public void setInterest_Infr_Relativity_Agents__c(java.lang.Double interest_Infr_Relativity_Agents__c) {
        this.interest_Infr_Relativity_Agents__c = interest_Infr_Relativity_Agents__c;
    }


    /**
     * Gets the interest_Infr_Relativity_Databases__c value for this Training_Survey_Results__c.
     * 
     * @return interest_Infr_Relativity_Databases__c
     */
    public java.lang.Double getInterest_Infr_Relativity_Databases__c() {
        return interest_Infr_Relativity_Databases__c;
    }


    /**
     * Sets the interest_Infr_Relativity_Databases__c value for this Training_Survey_Results__c.
     * 
     * @param interest_Infr_Relativity_Databases__c
     */
    public void setInterest_Infr_Relativity_Databases__c(java.lang.Double interest_Infr_Relativity_Databases__c) {
        this.interest_Infr_Relativity_Databases__c = interest_Infr_Relativity_Databases__c;
    }


    /**
     * Gets the interest_Infr_SQL_Configuration__c value for this Training_Survey_Results__c.
     * 
     * @return interest_Infr_SQL_Configuration__c
     */
    public java.lang.Double getInterest_Infr_SQL_Configuration__c() {
        return interest_Infr_SQL_Configuration__c;
    }


    /**
     * Sets the interest_Infr_SQL_Configuration__c value for this Training_Survey_Results__c.
     * 
     * @param interest_Infr_SQL_Configuration__c
     */
    public void setInterest_Infr_SQL_Configuration__c(java.lang.Double interest_Infr_SQL_Configuration__c) {
        this.interest_Infr_SQL_Configuration__c = interest_Infr_SQL_Configuration__c;
    }


    /**
     * Gets the interest_Infr_Server_Roles__c value for this Training_Survey_Results__c.
     * 
     * @return interest_Infr_Server_Roles__c
     */
    public java.lang.Double getInterest_Infr_Server_Roles__c() {
        return interest_Infr_Server_Roles__c;
    }


    /**
     * Sets the interest_Infr_Server_Roles__c value for this Training_Survey_Results__c.
     * 
     * @param interest_Infr_Server_Roles__c
     */
    public void setInterest_Infr_Server_Roles__c(java.lang.Double interest_Infr_Server_Roles__c) {
        this.interest_Infr_Server_Roles__c = interest_Infr_Server_Roles__c;
    }


    /**
     * Gets the interest_Method_Class_Overview__c value for this Training_Survey_Results__c.
     * 
     * @return interest_Method_Class_Overview__c
     */
    public java.lang.Double getInterest_Method_Class_Overview__c() {
        return interest_Method_Class_Overview__c;
    }


    /**
     * Sets the interest_Method_Class_Overview__c value for this Training_Survey_Results__c.
     * 
     * @param interest_Method_Class_Overview__c
     */
    public void setInterest_Method_Class_Overview__c(java.lang.Double interest_Method_Class_Overview__c) {
        this.interest_Method_Class_Overview__c = interest_Method_Class_Overview__c;
    }


    /**
     * Gets the interest_Method_Class_Setup_Libraries__c value for this Training_Survey_Results__c.
     * 
     * @return interest_Method_Class_Setup_Libraries__c
     */
    public java.lang.Double getInterest_Method_Class_Setup_Libraries__c() {
        return interest_Method_Class_Setup_Libraries__c;
    }


    /**
     * Sets the interest_Method_Class_Setup_Libraries__c value for this Training_Survey_Results__c.
     * 
     * @param interest_Method_Class_Setup_Libraries__c
     */
    public void setInterest_Method_Class_Setup_Libraries__c(java.lang.Double interest_Method_Class_Setup_Libraries__c) {
        this.interest_Method_Class_Setup_Libraries__c = interest_Method_Class_Setup_Libraries__c;
    }


    /**
     * Gets the interest_Method_Class_Strat_Planning__c value for this Training_Survey_Results__c.
     * 
     * @return interest_Method_Class_Strat_Planning__c
     */
    public java.lang.Double getInterest_Method_Class_Strat_Planning__c() {
        return interest_Method_Class_Strat_Planning__c;
    }


    /**
     * Sets the interest_Method_Class_Strat_Planning__c value for this Training_Survey_Results__c.
     * 
     * @param interest_Method_Class_Strat_Planning__c
     */
    public void setInterest_Method_Class_Strat_Planning__c(java.lang.Double interest_Method_Class_Strat_Planning__c) {
        this.interest_Method_Class_Strat_Planning__c = interest_Method_Class_Strat_Planning__c;
    }


    /**
     * Gets the interest_Method_Class_Workflow__c value for this Training_Survey_Results__c.
     * 
     * @return interest_Method_Class_Workflow__c
     */
    public java.lang.Double getInterest_Method_Class_Workflow__c() {
        return interest_Method_Class_Workflow__c;
    }


    /**
     * Sets the interest_Method_Class_Workflow__c value for this Training_Survey_Results__c.
     * 
     * @param interest_Method_Class_Workflow__c
     */
    public void setInterest_Method_Class_Workflow__c(java.lang.Double interest_Method_Class_Workflow__c) {
        this.interest_Method_Class_Workflow__c = interest_Method_Class_Workflow__c;
    }


    /**
     * Gets the interest_Method_Custodian_Management__c value for this Training_Survey_Results__c.
     * 
     * @return interest_Method_Custodian_Management__c
     */
    public java.lang.Double getInterest_Method_Custodian_Management__c() {
        return interest_Method_Custodian_Management__c;
    }


    /**
     * Sets the interest_Method_Custodian_Management__c value for this Training_Survey_Results__c.
     * 
     * @param interest_Method_Custodian_Management__c
     */
    public void setInterest_Method_Custodian_Management__c(java.lang.Double interest_Method_Custodian_Management__c) {
        this.interest_Method_Custodian_Management__c = interest_Method_Custodian_Management__c;
    }


    /**
     * Gets the interest_Method_Interview_Portal__c value for this Training_Survey_Results__c.
     * 
     * @return interest_Method_Interview_Portal__c
     */
    public java.lang.Double getInterest_Method_Interview_Portal__c() {
        return interest_Method_Interview_Portal__c;
    }


    /**
     * Sets the interest_Method_Interview_Portal__c value for this Training_Survey_Results__c.
     * 
     * @param interest_Method_Interview_Portal__c
     */
    public void setInterest_Method_Interview_Portal__c(java.lang.Double interest_Method_Interview_Portal__c) {
        this.interest_Method_Interview_Portal__c = interest_Method_Interview_Portal__c;
    }


    /**
     * Gets the interest_Method_Managing_Hold__c value for this Training_Survey_Results__c.
     * 
     * @return interest_Method_Managing_Hold__c
     */
    public java.lang.Double getInterest_Method_Managing_Hold__c() {
        return interest_Method_Managing_Hold__c;
    }


    /**
     * Sets the interest_Method_Managing_Hold__c value for this Training_Survey_Results__c.
     * 
     * @param interest_Method_Managing_Hold__c
     */
    public void setInterest_Method_Managing_Hold__c(java.lang.Double interest_Method_Managing_Hold__c) {
        this.interest_Method_Managing_Hold__c = interest_Method_Managing_Hold__c;
    }


    /**
     * Gets the interest_Method_Questionnaire__c value for this Training_Survey_Results__c.
     * 
     * @return interest_Method_Questionnaire__c
     */
    public java.lang.Double getInterest_Method_Questionnaire__c() {
        return interest_Method_Questionnaire__c;
    }


    /**
     * Sets the interest_Method_Questionnaire__c value for this Training_Survey_Results__c.
     * 
     * @param interest_Method_Questionnaire__c
     */
    public void setInterest_Method_Questionnaire__c(java.lang.Double interest_Method_Questionnaire__c) {
        this.interest_Method_Questionnaire__c = interest_Method_Questionnaire__c;
    }


    /**
     * Gets the interest_Method_Reporting__c value for this Training_Survey_Results__c.
     * 
     * @return interest_Method_Reporting__c
     */
    public java.lang.Double getInterest_Method_Reporting__c() {
        return interest_Method_Reporting__c;
    }


    /**
     * Sets the interest_Method_Reporting__c value for this Training_Survey_Results__c.
     * 
     * @param interest_Method_Reporting__c
     */
    public void setInterest_Method_Reporting__c(java.lang.Double interest_Method_Reporting__c) {
        this.interest_Method_Reporting__c = interest_Method_Reporting__c;
    }


    /**
     * Gets the interest_Method_Template_Creation__c value for this Training_Survey_Results__c.
     * 
     * @return interest_Method_Template_Creation__c
     */
    public java.lang.Double getInterest_Method_Template_Creation__c() {
        return interest_Method_Template_Creation__c;
    }


    /**
     * Sets the interest_Method_Template_Creation__c value for this Training_Survey_Results__c.
     * 
     * @param interest_Method_Template_Creation__c
     */
    public void setInterest_Method_Template_Creation__c(java.lang.Double interest_Method_Template_Creation__c) {
        this.interest_Method_Template_Creation__c = interest_Method_Template_Creation__c;
    }


    /**
     * Gets the interest_Method_Template_Setup__c value for this Training_Survey_Results__c.
     * 
     * @return interest_Method_Template_Setup__c
     */
    public java.lang.Double getInterest_Method_Template_Setup__c() {
        return interest_Method_Template_Setup__c;
    }


    /**
     * Sets the interest_Method_Template_Setup__c value for this Training_Survey_Results__c.
     * 
     * @param interest_Method_Template_Setup__c
     */
    public void setInterest_Method_Template_Setup__c(java.lang.Double interest_Method_Template_Setup__c) {
        this.interest_Method_Template_Setup__c = interest_Method_Template_Setup__c;
    }


    /**
     * Gets the intuitive_Software__c value for this Training_Survey_Results__c.
     * 
     * @return intuitive_Software__c
     */
    public java.lang.String getIntuitive_Software__c() {
        return intuitive_Software__c;
    }


    /**
     * Sets the intuitive_Software__c value for this Training_Survey_Results__c.
     * 
     * @param intuitive_Software__c
     */
    public void setIntuitive_Software__c(java.lang.String intuitive_Software__c) {
        this.intuitive_Software__c = intuitive_Software__c;
    }


    /**
     * Gets the isDeleted value for this Training_Survey_Results__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Training_Survey_Results__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the is_Relativity_an_intuitive_software_appl__c value for this Training_Survey_Results__c.
     * 
     * @return is_Relativity_an_intuitive_software_appl__c
     */
    public java.lang.String getIs_Relativity_an_intuitive_software_appl__c() {
        return is_Relativity_an_intuitive_software_appl__c;
    }


    /**
     * Sets the is_Relativity_an_intuitive_software_appl__c value for this Training_Survey_Results__c.
     * 
     * @param is_Relativity_an_intuitive_software_appl__c
     */
    public void setIs_Relativity_an_intuitive_software_appl__c(java.lang.String is_Relativity_an_intuitive_software_appl__c) {
        this.is_Relativity_an_intuitive_software_appl__c = is_Relativity_an_intuitive_software_appl__c;
    }


    /**
     * Gets the issue_that_Caused_Negative_Rating__c value for this Training_Survey_Results__c.
     * 
     * @return issue_that_Caused_Negative_Rating__c
     */
    public java.lang.String getIssue_that_Caused_Negative_Rating__c() {
        return issue_that_Caused_Negative_Rating__c;
    }


    /**
     * Sets the issue_that_Caused_Negative_Rating__c value for this Training_Survey_Results__c.
     * 
     * @param issue_that_Caused_Negative_Rating__c
     */
    public void setIssue_that_Caused_Negative_Rating__c(java.lang.String issue_that_Caused_Negative_Rating__c) {
        this.issue_that_Caused_Negative_Rating__c = issue_that_Caused_Negative_Rating__c;
    }


    /**
     * Gets the issue_with_Presentation__c value for this Training_Survey_Results__c.
     * 
     * @return issue_with_Presentation__c
     */
    public java.lang.String getIssue_with_Presentation__c() {
        return issue_with_Presentation__c;
    }


    /**
     * Sets the issue_with_Presentation__c value for this Training_Survey_Results__c.
     * 
     * @param issue_with_Presentation__c
     */
    public void setIssue_with_Presentation__c(java.lang.String issue_with_Presentation__c) {
        this.issue_with_Presentation__c = issue_with_Presentation__c;
    }


    /**
     * Gets the lastModifiedBy value for this Training_Survey_Results__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Training_Survey_Results__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Training_Survey_Results__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Training_Survey_Results__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Training_Survey_Results__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Training_Survey_Results__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the location__c value for this Training_Survey_Results__c.
     * 
     * @return location__c
     */
    public java.lang.String getLocation__c() {
        return location__c;
    }


    /**
     * Sets the location__c value for this Training_Survey_Results__c.
     * 
     * @param location__c
     */
    public void setLocation__c(java.lang.String location__c) {
        this.location__c = location__c;
    }


    /**
     * Gets the method_Intuitive__c value for this Training_Survey_Results__c.
     * 
     * @return method_Intuitive__c
     */
    public java.lang.Double getMethod_Intuitive__c() {
        return method_Intuitive__c;
    }


    /**
     * Sets the method_Intuitive__c value for this Training_Survey_Results__c.
     * 
     * @param method_Intuitive__c
     */
    public void setMethod_Intuitive__c(java.lang.Double method_Intuitive__c) {
        this.method_Intuitive__c = method_Intuitive__c;
    }


    /**
     * Gets the name value for this Training_Survey_Results__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Training_Survey_Results__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Training_Survey_Results__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Training_Survey_Results__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Training_Survey_Results__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Training_Survey_Results__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the other_webinars_presented__c value for this Training_Survey_Results__c.
     * 
     * @return other_webinars_presented__c
     */
    public java.lang.String getOther_webinars_presented__c() {
        return other_webinars_presented__c;
    }


    /**
     * Sets the other_webinars_presented__c value for this Training_Survey_Results__c.
     * 
     * @param other_webinars_presented__c
     */
    public void setOther_webinars_presented__c(java.lang.String other_webinars_presented__c) {
        this.other_webinars_presented__c = other_webinars_presented__c;
    }


    /**
     * Gets the overall_Experience__c value for this Training_Survey_Results__c.
     * 
     * @return overall_Experience__c
     */
    public java.lang.String getOverall_Experience__c() {
        return overall_Experience__c;
    }


    /**
     * Sets the overall_Experience__c value for this Training_Survey_Results__c.
     * 
     * @param overall_Experience__c
     */
    public void setOverall_Experience__c(java.lang.String overall_Experience__c) {
        this.overall_Experience__c = overall_Experience__c;
    }


    /**
     * Gets the owner value for this Training_Survey_Results__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Training_Survey_Results__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Training_Survey_Results__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Training_Survey_Results__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the presentation_Skills__c value for this Training_Survey_Results__c.
     * 
     * @return presentation_Skills__c
     */
    public java.lang.Double getPresentation_Skills__c() {
        return presentation_Skills__c;
    }


    /**
     * Sets the presentation_Skills__c value for this Training_Survey_Results__c.
     * 
     * @param presentation_Skills__c
     */
    public void setPresentation_Skills__c(java.lang.Double presentation_Skills__c) {
        this.presentation_Skills__c = presentation_Skills__c;
    }


    /**
     * Gets the presenter_Knowledgeable__c value for this Training_Survey_Results__c.
     * 
     * @return presenter_Knowledgeable__c
     */
    public java.lang.String getPresenter_Knowledgeable__c() {
        return presenter_Knowledgeable__c;
    }


    /**
     * Sets the presenter_Knowledgeable__c value for this Training_Survey_Results__c.
     * 
     * @param presenter_Knowledgeable__c
     */
    public void setPresenter_Knowledgeable__c(java.lang.String presenter_Knowledgeable__c) {
        this.presenter_Knowledgeable__c = presenter_Knowledgeable__c;
    }


    /**
     * Gets the presenter_Showcased_Functionality__c value for this Training_Survey_Results__c.
     * 
     * @return presenter_Showcased_Functionality__c
     */
    public java.lang.Double getPresenter_Showcased_Functionality__c() {
        return presenter_Showcased_Functionality__c;
    }


    /**
     * Sets the presenter_Showcased_Functionality__c value for this Training_Survey_Results__c.
     * 
     * @param presenter_Showcased_Functionality__c
     */
    public void setPresenter_Showcased_Functionality__c(java.lang.Double presenter_Showcased_Functionality__c) {
        this.presenter_Showcased_Functionality__c = presenter_Showcased_Functionality__c;
    }


    /**
     * Gets the processInstances value for this Training_Survey_Results__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Training_Survey_Results__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Training_Survey_Results__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Training_Survey_Results__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the product__c value for this Training_Survey_Results__c.
     * 
     * @return product__c
     */
    public java.lang.String getProduct__c() {
        return product__c;
    }


    /**
     * Sets the product__c value for this Training_Survey_Results__c.
     * 
     * @param product__c
     */
    public void setProduct__c(java.lang.String product__c) {
        this.product__c = product__c;
    }


    /**
     * Gets the provided_Valuable_Content__c value for this Training_Survey_Results__c.
     * 
     * @return provided_Valuable_Content__c
     */
    public java.lang.Double getProvided_Valuable_Content__c() {
        return provided_Valuable_Content__c;
    }


    /**
     * Sets the provided_Valuable_Content__c value for this Training_Survey_Results__c.
     * 
     * @param provided_Valuable_Content__c
     */
    public void setProvided_Valuable_Content__c(java.lang.Double provided_Valuable_Content__c) {
        this.provided_Valuable_Content__c = provided_Valuable_Content__c;
    }


    /**
     * Gets the RCA_Exam_Proctor__c value for this Training_Survey_Results__c.
     * 
     * @return RCA_Exam_Proctor__c
     */
    public java.lang.String getRCA_Exam_Proctor__c() {
        return RCA_Exam_Proctor__c;
    }


    /**
     * Sets the RCA_Exam_Proctor__c value for this Training_Survey_Results__c.
     * 
     * @param RCA_Exam_Proctor__c
     */
    public void setRCA_Exam_Proctor__c(java.lang.String RCA_Exam_Proctor__c) {
        this.RCA_Exam_Proctor__c = RCA_Exam_Proctor__c;
    }


    /**
     * Gets the RCA_Exam_Version__c value for this Training_Survey_Results__c.
     * 
     * @return RCA_Exam_Version__c
     */
    public java.lang.String getRCA_Exam_Version__c() {
        return RCA_Exam_Version__c;
    }


    /**
     * Sets the RCA_Exam_Version__c value for this Training_Survey_Results__c.
     * 
     * @param RCA_Exam_Version__c
     */
    public void setRCA_Exam_Version__c(java.lang.String RCA_Exam_Version__c) {
        this.RCA_Exam_Version__c = RCA_Exam_Version__c;
    }


    /**
     * Gets the RCA_Experience_Hands_On_True_Test__c value for this Training_Survey_Results__c.
     * 
     * @return RCA_Experience_Hands_On_True_Test__c
     */
    public java.lang.Double getRCA_Experience_Hands_On_True_Test__c() {
        return RCA_Experience_Hands_On_True_Test__c;
    }


    /**
     * Sets the RCA_Experience_Hands_On_True_Test__c value for this Training_Survey_Results__c.
     * 
     * @param RCA_Experience_Hands_On_True_Test__c
     */
    public void setRCA_Experience_Hands_On_True_Test__c(java.lang.Double RCA_Experience_Hands_On_True_Test__c) {
        this.RCA_Experience_Hands_On_True_Test__c = RCA_Experience_Hands_On_True_Test__c;
    }


    /**
     * Gets the RCA_Experience_Instructions_Clear__c value for this Training_Survey_Results__c.
     * 
     * @return RCA_Experience_Instructions_Clear__c
     */
    public java.lang.Double getRCA_Experience_Instructions_Clear__c() {
        return RCA_Experience_Instructions_Clear__c;
    }


    /**
     * Sets the RCA_Experience_Instructions_Clear__c value for this Training_Survey_Results__c.
     * 
     * @param RCA_Experience_Instructions_Clear__c
     */
    public void setRCA_Experience_Instructions_Clear__c(java.lang.Double RCA_Experience_Instructions_Clear__c) {
        this.RCA_Experience_Instructions_Clear__c = RCA_Experience_Instructions_Clear__c;
    }


    /**
     * Gets the RCA_Experience_Questions_Fair__c value for this Training_Survey_Results__c.
     * 
     * @return RCA_Experience_Questions_Fair__c
     */
    public java.lang.Double getRCA_Experience_Questions_Fair__c() {
        return RCA_Experience_Questions_Fair__c;
    }


    /**
     * Sets the RCA_Experience_Questions_Fair__c value for this Training_Survey_Results__c.
     * 
     * @param RCA_Experience_Questions_Fair__c
     */
    public void setRCA_Experience_Questions_Fair__c(java.lang.Double RCA_Experience_Questions_Fair__c) {
        this.RCA_Experience_Questions_Fair__c = RCA_Experience_Questions_Fair__c;
    }


    /**
     * Gets the RCA_Experience_Time_Sufficient__c value for this Training_Survey_Results__c.
     * 
     * @return RCA_Experience_Time_Sufficient__c
     */
    public java.lang.Double getRCA_Experience_Time_Sufficient__c() {
        return RCA_Experience_Time_Sufficient__c;
    }


    /**
     * Sets the RCA_Experience_Time_Sufficient__c value for this Training_Survey_Results__c.
     * 
     * @param RCA_Experience_Time_Sufficient__c
     */
    public void setRCA_Experience_Time_Sufficient__c(java.lang.Double RCA_Experience_Time_Sufficient__c) {
        this.RCA_Experience_Time_Sufficient__c = RCA_Experience_Time_Sufficient__c;
    }


    /**
     * Gets the RCA_Survey_Score__c value for this Training_Survey_Results__c.
     * 
     * @return RCA_Survey_Score__c
     */
    public java.lang.Double getRCA_Survey_Score__c() {
        return RCA_Survey_Score__c;
    }


    /**
     * Sets the RCA_Survey_Score__c value for this Training_Survey_Results__c.
     * 
     * @param RCA_Survey_Score__c
     */
    public void setRCA_Survey_Score__c(java.lang.Double RCA_Survey_Score__c) {
        this.RCA_Survey_Score__c = RCA_Survey_Score__c;
    }


    /**
     * Gets the RCA_Test_ID__c value for this Training_Survey_Results__c.
     * 
     * @return RCA_Test_ID__c
     */
    public java.lang.String getRCA_Test_ID__c() {
        return RCA_Test_ID__c;
    }


    /**
     * Sets the RCA_Test_ID__c value for this Training_Survey_Results__c.
     * 
     * @param RCA_Test_ID__c
     */
    public void setRCA_Test_ID__c(java.lang.String RCA_Test_ID__c) {
        this.RCA_Test_ID__c = RCA_Test_ID__c;
    }


    /**
     * Gets the RCA_Use_Documentation_to_Study__c value for this Training_Survey_Results__c.
     * 
     * @return RCA_Use_Documentation_to_Study__c
     */
    public java.lang.String getRCA_Use_Documentation_to_Study__c() {
        return RCA_Use_Documentation_to_Study__c;
    }


    /**
     * Sets the RCA_Use_Documentation_to_Study__c value for this Training_Survey_Results__c.
     * 
     * @param RCA_Use_Documentation_to_Study__c
     */
    public void setRCA_Use_Documentation_to_Study__c(java.lang.String RCA_Use_Documentation_to_Study__c) {
        this.RCA_Use_Documentation_to_Study__c = RCA_Use_Documentation_to_Study__c;
    }


    /**
     * Gets the RCA_Was_Documentation_Comprehensive__c value for this Training_Survey_Results__c.
     * 
     * @return RCA_Was_Documentation_Comprehensive__c
     */
    public java.lang.String getRCA_Was_Documentation_Comprehensive__c() {
        return RCA_Was_Documentation_Comprehensive__c;
    }


    /**
     * Sets the RCA_Was_Documentation_Comprehensive__c value for this Training_Survey_Results__c.
     * 
     * @param RCA_Was_Documentation_Comprehensive__c
     */
    public void setRCA_Was_Documentation_Comprehensive__c(java.lang.String RCA_Was_Documentation_Comprehensive__c) {
        this.RCA_Was_Documentation_Comprehensive__c = RCA_Was_Documentation_Comprehensive__c;
    }


    /**
     * Gets the recommend_Training__c value for this Training_Survey_Results__c.
     * 
     * @return recommend_Training__c
     */
    public java.lang.String getRecommend_Training__c() {
        return recommend_Training__c;
    }


    /**
     * Sets the recommend_Training__c value for this Training_Survey_Results__c.
     * 
     * @param recommend_Training__c
     */
    public void setRecommend_Training__c(java.lang.String recommend_Training__c) {
        this.recommend_Training__c = recommend_Training__c;
    }


    /**
     * Gets the recommend_to_Colleague__c value for this Training_Survey_Results__c.
     * 
     * @return recommend_to_Colleague__c
     */
    public java.lang.Double getRecommend_to_Colleague__c() {
        return recommend_to_Colleague__c;
    }


    /**
     * Sets the recommend_to_Colleague__c value for this Training_Survey_Results__c.
     * 
     * @param recommend_to_Colleague__c
     */
    public void setRecommend_to_Colleague__c(java.lang.Double recommend_to_Colleague__c) {
        this.recommend_to_Colleague__c = recommend_to_Colleague__c;
    }


    /**
     * Gets the recordType value for this Training_Survey_Results__c.
     * 
     * @return recordType
     */
    public com.sforce.soap.enterprise.sobject.RecordType getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this Training_Survey_Results__c.
     * 
     * @param recordType
     */
    public void setRecordType(com.sforce.soap.enterprise.sobject.RecordType recordType) {
        this.recordType = recordType;
    }


    /**
     * Gets the recordTypeId value for this Training_Survey_Results__c.
     * 
     * @return recordTypeId
     */
    public java.lang.String getRecordTypeId() {
        return recordTypeId;
    }


    /**
     * Sets the recordTypeId value for this Training_Survey_Results__c.
     * 
     * @param recordTypeId
     */
    public void setRecordTypeId(java.lang.String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }


    /**
     * Gets the session_Start_Details__c value for this Training_Survey_Results__c.
     * 
     * @return session_Start_Details__c
     */
    public java.lang.String getSession_Start_Details__c() {
        return session_Start_Details__c;
    }


    /**
     * Sets the session_Start_Details__c value for this Training_Survey_Results__c.
     * 
     * @param session_Start_Details__c
     */
    public void setSession_Start_Details__c(java.lang.String session_Start_Details__c) {
        this.session_Start_Details__c = session_Start_Details__c;
    }


    /**
     * Gets the survey_Object__c value for this Training_Survey_Results__c.
     * 
     * @return survey_Object__c
     */
    public java.lang.String getSurvey_Object__c() {
        return survey_Object__c;
    }


    /**
     * Sets the survey_Object__c value for this Training_Survey_Results__c.
     * 
     * @param survey_Object__c
     */
    public void setSurvey_Object__c(java.lang.String survey_Object__c) {
        this.survey_Object__c = survey_Object__c;
    }


    /**
     * Gets the systemModstamp value for this Training_Survey_Results__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Training_Survey_Results__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the trainee_Email_Address__c value for this Training_Survey_Results__c.
     * 
     * @return trainee_Email_Address__c
     */
    public java.lang.String getTrainee_Email_Address__c() {
        return trainee_Email_Address__c;
    }


    /**
     * Sets the trainee_Email_Address__c value for this Training_Survey_Results__c.
     * 
     * @param trainee_Email_Address__c
     */
    public void setTrainee_Email_Address__c(java.lang.String trainee_Email_Address__c) {
        this.trainee_Email_Address__c = trainee_Email_Address__c;
    }


    /**
     * Gets the trainingName__c value for this Training_Survey_Results__c.
     * 
     * @return trainingName__c
     */
    public java.lang.String getTrainingName__c() {
        return trainingName__c;
    }


    /**
     * Sets the trainingName__c value for this Training_Survey_Results__c.
     * 
     * @param trainingName__c
     */
    public void setTrainingName__c(java.lang.String trainingName__c) {
        this.trainingName__c = trainingName__c;
    }


    /**
     * Gets the training_Attendee__c value for this Training_Survey_Results__c.
     * 
     * @return training_Attendee__c
     */
    public java.lang.String getTraining_Attendee__c() {
        return training_Attendee__c;
    }


    /**
     * Sets the training_Attendee__c value for this Training_Survey_Results__c.
     * 
     * @param training_Attendee__c
     */
    public void setTraining_Attendee__c(java.lang.String training_Attendee__c) {
        this.training_Attendee__c = training_Attendee__c;
    }


    /**
     * Gets the training_Attendee__r value for this Training_Survey_Results__c.
     * 
     * @return training_Attendee__r
     */
    public com.sforce.soap.enterprise.sobject.Training_Attendee__c getTraining_Attendee__r() {
        return training_Attendee__r;
    }


    /**
     * Sets the training_Attendee__r value for this Training_Survey_Results__c.
     * 
     * @param training_Attendee__r
     */
    public void setTraining_Attendee__r(com.sforce.soap.enterprise.sobject.Training_Attendee__c training_Attendee__r) {
        this.training_Attendee__r = training_Attendee__r;
    }


    /**
     * Gets the training_Content_Useful_Scenario__c value for this Training_Survey_Results__c.
     * 
     * @return training_Content_Useful_Scenario__c
     */
    public java.lang.String getTraining_Content_Useful_Scenario__c() {
        return training_Content_Useful_Scenario__c;
    }


    /**
     * Sets the training_Content_Useful_Scenario__c value for this Training_Survey_Results__c.
     * 
     * @param training_Content_Useful_Scenario__c
     */
    public void setTraining_Content_Useful_Scenario__c(java.lang.String training_Content_Useful_Scenario__c) {
        this.training_Content_Useful_Scenario__c = training_Content_Useful_Scenario__c;
    }


    /**
     * Gets the training_Covered_Requirements__c value for this Training_Survey_Results__c.
     * 
     * @return training_Covered_Requirements__c
     */
    public java.lang.Double getTraining_Covered_Requirements__c() {
        return training_Covered_Requirements__c;
    }


    /**
     * Sets the training_Covered_Requirements__c value for this Training_Survey_Results__c.
     * 
     * @param training_Covered_Requirements__c
     */
    public void setTraining_Covered_Requirements__c(java.lang.Double training_Covered_Requirements__c) {
        this.training_Covered_Requirements__c = training_Covered_Requirements__c;
    }


    /**
     * Gets the training_Instructor_Role__c value for this Training_Survey_Results__c.
     * 
     * @return training_Instructor_Role__c
     */
    public java.lang.String getTraining_Instructor_Role__c() {
        return training_Instructor_Role__c;
    }


    /**
     * Sets the training_Instructor_Role__c value for this Training_Survey_Results__c.
     * 
     * @param training_Instructor_Role__c
     */
    public void setTraining_Instructor_Role__c(java.lang.String training_Instructor_Role__c) {
        this.training_Instructor_Role__c = training_Instructor_Role__c;
    }


    /**
     * Gets the training_Instructor__c value for this Training_Survey_Results__c.
     * 
     * @return training_Instructor__c
     */
    public java.lang.String getTraining_Instructor__c() {
        return training_Instructor__c;
    }


    /**
     * Sets the training_Instructor__c value for this Training_Survey_Results__c.
     * 
     * @param training_Instructor__c
     */
    public void setTraining_Instructor__c(java.lang.String training_Instructor__c) {
        this.training_Instructor__c = training_Instructor__c;
    }


    /**
     * Gets the training_Met_My_Needs__c value for this Training_Survey_Results__c.
     * 
     * @return training_Met_My_Needs__c
     */
    public java.lang.Double getTraining_Met_My_Needs__c() {
        return training_Met_My_Needs__c;
    }


    /**
     * Sets the training_Met_My_Needs__c value for this Training_Survey_Results__c.
     * 
     * @param training_Met_My_Needs__c
     */
    public void setTraining_Met_My_Needs__c(java.lang.Double training_Met_My_Needs__c) {
        this.training_Met_My_Needs__c = training_Met_My_Needs__c;
    }


    /**
     * Gets the training_Name__c value for this Training_Survey_Results__c.
     * 
     * @return training_Name__c
     */
    public java.lang.String getTraining_Name__c() {
        return training_Name__c;
    }


    /**
     * Sets the training_Name__c value for this Training_Survey_Results__c.
     * 
     * @param training_Name__c
     */
    public void setTraining_Name__c(java.lang.String training_Name__c) {
        this.training_Name__c = training_Name__c;
    }


    /**
     * Gets the training_Session_Type__c value for this Training_Survey_Results__c.
     * 
     * @return training_Session_Type__c
     */
    public java.lang.String getTraining_Session_Type__c() {
        return training_Session_Type__c;
    }


    /**
     * Sets the training_Session_Type__c value for this Training_Survey_Results__c.
     * 
     * @param training_Session_Type__c
     */
    public void setTraining_Session_Type__c(java.lang.String training_Session_Type__c) {
        this.training_Session_Type__c = training_Session_Type__c;
    }


    /**
     * Gets the training_Session__c value for this Training_Survey_Results__c.
     * 
     * @return training_Session__c
     */
    public java.lang.String getTraining_Session__c() {
        return training_Session__c;
    }


    /**
     * Sets the training_Session__c value for this Training_Survey_Results__c.
     * 
     * @param training_Session__c
     */
    public void setTraining_Session__c(java.lang.String training_Session__c) {
        this.training_Session__c = training_Session__c;
    }


    /**
     * Gets the training_Session__r value for this Training_Survey_Results__c.
     * 
     * @return training_Session__r
     */
    public com.sforce.soap.enterprise.sobject.Training_Relativity__c getTraining_Session__r() {
        return training_Session__r;
    }


    /**
     * Sets the training_Session__r value for this Training_Survey_Results__c.
     * 
     * @param training_Session__r
     */
    public void setTraining_Session__r(com.sforce.soap.enterprise.sobject.Training_Relativity__c training_Session__r) {
        this.training_Session__r = training_Session__r;
    }


    /**
     * Gets the training_docs_informative_and_complete__c value for this Training_Survey_Results__c.
     * 
     * @return training_docs_informative_and_complete__c
     */
    public java.lang.Double getTraining_docs_informative_and_complete__c() {
        return training_docs_informative_and_complete__c;
    }


    /**
     * Sets the training_docs_informative_and_complete__c value for this Training_Survey_Results__c.
     * 
     * @param training_docs_informative_and_complete__c
     */
    public void setTraining_docs_informative_and_complete__c(java.lang.Double training_docs_informative_and_complete__c) {
        this.training_docs_informative_and_complete__c = training_docs_informative_and_complete__c;
    }


    /**
     * Gets the training_was_interesting__c value for this Training_Survey_Results__c.
     * 
     * @return training_was_interesting__c
     */
    public java.lang.Double getTraining_was_interesting__c() {
        return training_was_interesting__c;
    }


    /**
     * Sets the training_was_interesting__c value for this Training_Survey_Results__c.
     * 
     * @param training_was_interesting__c
     */
    public void setTraining_was_interesting__c(java.lang.Double training_was_interesting__c) {
        this.training_was_interesting__c = training_was_interesting__c;
    }


    /**
     * Gets the tutorial_Name__c value for this Training_Survey_Results__c.
     * 
     * @return tutorial_Name__c
     */
    public java.lang.String getTutorial_Name__c() {
        return tutorial_Name__c;
    }


    /**
     * Sets the tutorial_Name__c value for this Training_Survey_Results__c.
     * 
     * @param tutorial_Name__c
     */
    public void setTutorial_Name__c(java.lang.String tutorial_Name__c) {
        this.tutorial_Name__c = tutorial_Name__c;
    }


    /**
     * Gets the tutorial__c value for this Training_Survey_Results__c.
     * 
     * @return tutorial__c
     */
    public java.lang.String getTutorial__c() {
        return tutorial__c;
    }


    /**
     * Sets the tutorial__c value for this Training_Survey_Results__c.
     * 
     * @param tutorial__c
     */
    public void setTutorial__c(java.lang.String tutorial__c) {
        this.tutorial__c = tutorial__c;
    }


    /**
     * Gets the tutorial_like_or_dislike__c value for this Training_Survey_Results__c.
     * 
     * @return tutorial_like_or_dislike__c
     */
    public java.lang.String getTutorial_like_or_dislike__c() {
        return tutorial_like_or_dislike__c;
    }


    /**
     * Sets the tutorial_like_or_dislike__c value for this Training_Survey_Results__c.
     * 
     * @param tutorial_like_or_dislike__c
     */
    public void setTutorial_like_or_dislike__c(java.lang.String tutorial_like_or_dislike__c) {
        this.tutorial_like_or_dislike__c = tutorial_like_or_dislike__c;
    }


    /**
     * Gets the volume_of_Content__c value for this Training_Survey_Results__c.
     * 
     * @return volume_of_Content__c
     */
    public java.lang.String getVolume_of_Content__c() {
        return volume_of_Content__c;
    }


    /**
     * Sets the volume_of_Content__c value for this Training_Survey_Results__c.
     * 
     * @param volume_of_Content__c
     */
    public void setVolume_of_Content__c(java.lang.String volume_of_Content__c) {
        this.volume_of_Content__c = volume_of_Content__c;
    }


    /**
     * Gets the were_facilities_properly_equipped__c value for this Training_Survey_Results__c.
     * 
     * @return were_facilities_properly_equipped__c
     */
    public java.lang.String getWere_facilities_properly_equipped__c() {
        return were_facilities_properly_equipped__c;
    }


    /**
     * Sets the were_facilities_properly_equipped__c value for this Training_Survey_Results__c.
     * 
     * @param were_facilities_properly_equipped__c
     */
    public void setWere_facilities_properly_equipped__c(java.lang.String were_facilities_properly_equipped__c) {
        this.were_facilities_properly_equipped__c = were_facilities_properly_equipped__c;
    }


    /**
     * Gets the what_could_be_done_better_next_time__c value for this Training_Survey_Results__c.
     * 
     * @return what_could_be_done_better_next_time__c
     */
    public java.lang.String getWhat_could_be_done_better_next_time__c() {
        return what_could_be_done_better_next_time__c;
    }


    /**
     * Sets the what_could_be_done_better_next_time__c value for this Training_Survey_Results__c.
     * 
     * @param what_could_be_done_better_next_time__c
     */
    public void setWhat_could_be_done_better_next_time__c(java.lang.String what_could_be_done_better_next_time__c) {
        this.what_could_be_done_better_next_time__c = what_could_be_done_better_next_time__c;
    }


    /**
     * Gets the what_could_have_been_done_better__c value for this Training_Survey_Results__c.
     * 
     * @return what_could_have_been_done_better__c
     */
    public java.lang.String getWhat_could_have_been_done_better__c() {
        return what_could_have_been_done_better__c;
    }


    /**
     * Sets the what_could_have_been_done_better__c value for this Training_Survey_Results__c.
     * 
     * @param what_could_have_been_done_better__c
     */
    public void setWhat_could_have_been_done_better__c(java.lang.String what_could_have_been_done_better__c) {
        this.what_could_have_been_done_better__c = what_could_have_been_done_better__c;
    }


    /**
     * Gets the what_did_you_like_best_or_find_the_most__c value for this Training_Survey_Results__c.
     * 
     * @return what_did_you_like_best_or_find_the_most__c
     */
    public java.lang.String getWhat_did_you_like_best_or_find_the_most__c() {
        return what_did_you_like_best_or_find_the_most__c;
    }


    /**
     * Sets the what_did_you_like_best_or_find_the_most__c value for this Training_Survey_Results__c.
     * 
     * @param what_did_you_like_best_or_find_the_most__c
     */
    public void setWhat_did_you_like_best_or_find_the_most__c(java.lang.String what_did_you_like_best_or_find_the_most__c) {
        this.what_did_you_like_best_or_find_the_most__c = what_did_you_like_best_or_find_the_most__c;
    }


    /**
     * Gets the what_skills_did_you_learn_that_can_be_ap__c value for this Training_Survey_Results__c.
     * 
     * @return what_skills_did_you_learn_that_can_be_ap__c
     */
    public java.lang.String getWhat_skills_did_you_learn_that_can_be_ap__c() {
        return what_skills_did_you_learn_that_can_be_ap__c;
    }


    /**
     * Sets the what_skills_did_you_learn_that_can_be_ap__c value for this Training_Survey_Results__c.
     * 
     * @param what_skills_did_you_learn_that_can_be_ap__c
     */
    public void setWhat_skills_did_you_learn_that_can_be_ap__c(java.lang.String what_skills_did_you_learn_that_can_be_ap__c) {
        this.what_skills_did_you_learn_that_can_be_ap__c = what_skills_did_you_learn_that_can_be_ap__c;
    }


    /**
     * Gets the workflow__c value for this Training_Survey_Results__c.
     * 
     * @return workflow__c
     */
    public java.lang.Double getWorkflow__c() {
        return workflow__c;
    }


    /**
     * Sets the workflow__c value for this Training_Survey_Results__c.
     * 
     * @param workflow__c
     */
    public void setWorkflow__c(java.lang.Double workflow__c) {
        this.workflow__c = workflow__c;
    }


    /**
     * Gets the instructor_answered_questions_in_a_way_I__c value for this Training_Survey_Results__c.
     * 
     * @return instructor_answered_questions_in_a_way_I__c
     */
    public java.lang.Double getInstructor_answered_questions_in_a_way_I__c() {
        return instructor_answered_questions_in_a_way_I__c;
    }


    /**
     * Sets the instructor_answered_questions_in_a_way_I__c value for this Training_Survey_Results__c.
     * 
     * @param instructor_answered_questions_in_a_way_I__c
     */
    public void setInstructor_answered_questions_in_a_way_I__c(java.lang.Double instructor_answered_questions_in_a_way_I__c) {
        this.instructor_answered_questions_in_a_way_I__c = instructor_answered_questions_in_a_way_I__c;
    }


    /**
     * Gets the presenter_Understood_Software_Evaluation__c value for this Training_Survey_Results__c.
     * 
     * @return presenter_Understood_Software_Evaluation__c
     */
    public java.lang.Double getPresenter_Understood_Software_Evaluation__c() {
        return presenter_Understood_Software_Evaluation__c;
    }


    /**
     * Sets the presenter_Understood_Software_Evaluation__c value for this Training_Survey_Results__c.
     * 
     * @param presenter_Understood_Software_Evaluation__c
     */
    public void setPresenter_Understood_Software_Evaluation__c(java.lang.Double presenter_Understood_Software_Evaluation__c) {
        this.presenter_Understood_Software_Evaluation__c = presenter_Understood_Software_Evaluation__c;
    }


    /**
     * Gets the recommend_instructor_to_my_collegue__c value for this Training_Survey_Results__c.
     * 
     * @return recommend_instructor_to_my_collegue__c
     */
    public java.lang.Double getRecommend_instructor_to_my_collegue__c() {
        return recommend_instructor_to_my_collegue__c;
    }


    /**
     * Sets the recommend_instructor_to_my_collegue__c value for this Training_Survey_Results__c.
     * 
     * @param recommend_instructor_to_my_collegue__c
     */
    public void setRecommend_instructor_to_my_collegue__c(java.lang.Double recommend_instructor_to_my_collegue__c) {
        this.recommend_instructor_to_my_collegue__c = recommend_instructor_to_my_collegue__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Training_Survey_Results__c)) return false;
        Training_Survey_Results__c other = (Training_Survey_Results__c) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.additional_comment_or_suggestions__c==null && other.getAdditional_comment_or_suggestions__c()==null) || 
             (this.additional_comment_or_suggestions__c!=null &&
              this.additional_comment_or_suggestions__c.equals(other.getAdditional_comment_or_suggestions__c()))) &&
            ((this.admin_Certification_Name__c==null && other.getAdmin_Certification_Name__c()==null) || 
             (this.admin_Certification_Name__c!=null &&
              this.admin_Certification_Name__c.equals(other.getAdmin_Certification_Name__c()))) &&
            ((this.admin_Certification_Name__r==null && other.getAdmin_Certification_Name__r()==null) || 
             (this.admin_Certification_Name__r!=null &&
              this.admin_Certification_Name__r.equals(other.getAdmin_Certification_Name__r()))) &&
            ((this.appropriate_Balance_Lecture_and_Hands_On__c==null && other.getAppropriate_Balance_Lecture_and_Hands_On__c()==null) || 
             (this.appropriate_Balance_Lecture_and_Hands_On__c!=null &&
              this.appropriate_Balance_Lecture_and_Hands_On__c.equals(other.getAppropriate_Balance_Lecture_and_Hands_On__c()))) &&
            ((this.are_our_manuals_compete__c==null && other.getAre_our_manuals_compete__c()==null) || 
             (this.are_our_manuals_compete__c!=null &&
              this.are_our_manuals_compete__c.equals(other.getAre_our_manuals_compete__c()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.comparison_to_Other_Demos__c==null && other.getComparison_to_Other_Demos__c()==null) || 
             (this.comparison_to_Other_Demos__c!=null &&
              this.comparison_to_Other_Demos__c.equals(other.getComparison_to_Other_Demos__c()))) &&
            ((this.content_Relevance_with_goals__c==null && other.getContent_Relevance_with_goals__c()==null) || 
             (this.content_Relevance_with_goals__c!=null &&
              this.content_Relevance_with_goals__c.equals(other.getContent_Relevance_with_goals__c()))) &&
            ((this.content_relevance_for_role__c==null && other.getContent_relevance_for_role__c()==null) || 
             (this.content_relevance_for_role__c!=null &&
              this.content_relevance_for_role__c.equals(other.getContent_relevance_for_role__c()))) &&
            ((this.course_Satisfaction__c==null && other.getCourse_Satisfaction__c()==null) || 
             (this.course_Satisfaction__c!=null &&
              this.course_Satisfaction__c.equals(other.getCourse_Satisfaction__c()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.currently_use_Product__c==null && other.getCurrently_use_Product__c()==null) || 
             (this.currently_use_Product__c!=null &&
              this.currently_use_Product__c.equals(other.getCurrently_use_Product__c()))) &&
            ((this.DO_Content_Useful__c==null && other.getDO_Content_Useful__c()==null) || 
             (this.DO_Content_Useful__c!=null &&
              this.DO_Content_Useful__c.equals(other.getDO_Content_Useful__c()))) &&
            ((this.DO_Training_Content_Details__c==null && other.getDO_Training_Content_Details__c()==null) || 
             (this.DO_Training_Content_Details__c!=null &&
              this.DO_Training_Content_Details__c.equals(other.getDO_Training_Content_Details__c()))) &&
            ((this.demo_Meet_Expecations__c==null && other.getDemo_Meet_Expecations__c()==null) || 
             (this.demo_Meet_Expecations__c!=null &&
              this.demo_Meet_Expecations__c.equals(other.getDemo_Meet_Expecations__c()))) &&
            ((this.demo_Presenter__c==null && other.getDemo_Presenter__c()==null) || 
             (this.demo_Presenter__c!=null &&
              this.demo_Presenter__c.equals(other.getDemo_Presenter__c()))) &&
            ((this.demo_Type__c==null && other.getDemo_Type__c()==null) || 
             (this.demo_Type__c!=null &&
              this.demo_Type__c.equals(other.getDemo_Type__c()))) &&
            ((this.demo__c==null && other.getDemo__c()==null) || 
             (this.demo__c!=null &&
              this.demo__c.equals(other.getDemo__c()))) &&
            ((this.demo__r==null && other.getDemo__r()==null) || 
             (this.demo__r!=null &&
              this.demo__r.equals(other.getDemo__r()))) &&
            ((this.did_Training_session_start_on_time__c==null && other.getDid_Training_session_start_on_time__c()==null) || 
             (this.did_Training_session_start_on_time__c!=null &&
              this.did_Training_session_start_on_time__c.equals(other.getDid_Training_session_start_on_time__c()))) &&
            ((this.facilities_Additional_Info__c==null && other.getFacilities_Additional_Info__c()==null) || 
             (this.facilities_Additional_Info__c!=null &&
              this.facilities_Additional_Info__c.equals(other.getFacilities_Additional_Info__c()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.further_Follow_up_Required__c==null && other.getFurther_Follow_up_Required__c()==null) || 
             (this.further_Follow_up_Required__c!=null &&
              this.further_Follow_up_Required__c.equals(other.getFurther_Follow_up_Required__c()))) &&
            ((this.goToMeeting_Issue_Details__c==null && other.getGoToMeeting_Issue_Details__c()==null) || 
             (this.goToMeeting_Issue_Details__c!=null &&
              this.goToMeeting_Issue_Details__c.equals(other.getGoToMeeting_Issue_Details__c()))) &&
            ((this.go_ToMeeting_Issues__c==null && other.getGo_ToMeeting_Issues__c()==null) || 
             (this.go_ToMeeting_Issues__c!=null &&
              this.go_ToMeeting_Issues__c.equals(other.getGo_ToMeeting_Issues__c()))) &&
            ((this.how_can_we_improve_webinar__c==null && other.getHow_can_we_improve_webinar__c()==null) || 
             (this.how_can_we_improve_webinar__c!=null &&
              this.how_can_we_improve_webinar__c.equals(other.getHow_can_we_improve_webinar__c()))) &&
            ((this.how_could_experience_be_better__c==null && other.getHow_could_experience_be_better__c()==null) || 
             (this.how_could_experience_be_better__c!=null &&
              this.how_could_experience_be_better__c.equals(other.getHow_could_experience_be_better__c()))) &&
            ((this.how_could_this_training_be_improved__c==null && other.getHow_could_this_training_be_improved__c()==null) || 
             (this.how_could_this_training_be_improved__c!=null &&
              this.how_could_this_training_be_improved__c.equals(other.getHow_could_this_training_be_improved__c()))) &&
            ((this.instructor_Knowledgeable__c==null && other.getInstructor_Knowledgeable__c()==null) || 
             (this.instructor_Knowledgeable__c!=null &&
              this.instructor_Knowledgeable__c.equals(other.getInstructor_Knowledgeable__c()))) &&
            ((this.instructor_was_open_to_questions__c==null && other.getInstructor_was_open_to_questions__c()==null) || 
             (this.instructor_was_open_to_questions__c!=null &&
              this.instructor_was_open_to_questions__c.equals(other.getInstructor_was_open_to_questions__c()))) &&
            ((this.interest_Admin_Case_Creation__c==null && other.getInterest_Admin_Case_Creation__c()==null) || 
             (this.interest_Admin_Case_Creation__c!=null &&
              this.interest_Admin_Case_Creation__c.equals(other.getInterest_Admin_Case_Creation__c()))) &&
            ((this.interest_Admin_Importing_Data__c==null && other.getInterest_Admin_Importing_Data__c()==null) || 
             (this.interest_Admin_Importing_Data__c!=null &&
              this.interest_Admin_Importing_Data__c.equals(other.getInterest_Admin_Importing_Data__c()))) &&
            ((this.interest_Admin_Productions__c==null && other.getInterest_Admin_Productions__c()==null) || 
             (this.interest_Admin_Productions__c!=null &&
              this.interest_Admin_Productions__c.equals(other.getInterest_Admin_Productions__c()))) &&
            ((this.interest_Admin_Searching__c==null && other.getInterest_Admin_Searching__c()==null) || 
             (this.interest_Admin_Searching__c!=null &&
              this.interest_Admin_Searching__c.equals(other.getInterest_Admin_Searching__c()))) &&
            ((this.interest_Admin_Security__c==null && other.getInterest_Admin_Security__c()==null) || 
             (this.interest_Admin_Security__c!=null &&
              this.interest_Admin_Security__c.equals(other.getInterest_Admin_Security__c()))) &&
            ((this.interest_Analytics_Index_Creation__c==null && other.getInterest_Analytics_Index_Creation__c()==null) || 
             (this.interest_Analytics_Index_Creation__c!=null &&
              this.interest_Analytics_Index_Creation__c.equals(other.getInterest_Analytics_Index_Creation__c()))) &&
            ((this.interest_Analytics_Index_Optimization__c==null && other.getInterest_Analytics_Index_Optimization__c()==null) || 
             (this.interest_Analytics_Index_Optimization__c!=null &&
              this.interest_Analytics_Index_Optimization__c.equals(other.getInterest_Analytics_Index_Optimization__c()))) &&
            ((this.interest_Analytics_Workflow__c==null && other.getInterest_Analytics_Workflow__c()==null) || 
             (this.interest_Analytics_Workflow__c!=null &&
              this.interest_Analytics_Workflow__c.equals(other.getInterest_Analytics_Workflow__c()))) &&
            ((this.interest_Analytics__c==null && other.getInterest_Analytics__c()==null) || 
             (this.interest_Analytics__c!=null &&
              this.interest_Analytics__c.equals(other.getInterest_Analytics__c()))) &&
            ((this.interest_EU_Annotating_Redacting__c==null && other.getInterest_EU_Annotating_Redacting__c()==null) || 
             (this.interest_EU_Annotating_Redacting__c!=null &&
              this.interest_EU_Annotating_Redacting__c.equals(other.getInterest_EU_Annotating_Redacting__c()))) &&
            ((this.interest_EU_Coding_Tagging__c==null && other.getInterest_EU_Coding_Tagging__c()==null) || 
             (this.interest_EU_Coding_Tagging__c!=null &&
              this.interest_EU_Coding_Tagging__c.equals(other.getInterest_EU_Coding_Tagging__c()))) &&
            ((this.interest_EU_Navigation__c==null && other.getInterest_EU_Navigation__c()==null) || 
             (this.interest_EU_Navigation__c!=null &&
              this.interest_EU_Navigation__c.equals(other.getInterest_EU_Navigation__c()))) &&
            ((this.interest_EU_Reviewer_Interface__c==null && other.getInterest_EU_Reviewer_Interface__c()==null) || 
             (this.interest_EU_Reviewer_Interface__c!=null &&
              this.interest_EU_Reviewer_Interface__c.equals(other.getInterest_EU_Reviewer_Interface__c()))) &&
            ((this.interest_EU_Searching_Filtering__c==null && other.getInterest_EU_Searching_Filtering__c()==null) || 
             (this.interest_EU_Searching_Filtering__c!=null &&
              this.interest_EU_Searching_Filtering__c.equals(other.getInterest_EU_Searching_Filtering__c()))) &&
            ((this.interest_Infr_Back_End_Architecture__c==null && other.getInterest_Infr_Back_End_Architecture__c()==null) || 
             (this.interest_Infr_Back_End_Architecture__c!=null &&
              this.interest_Infr_Back_End_Architecture__c.equals(other.getInterest_Infr_Back_End_Architecture__c()))) &&
            ((this.interest_Infr_Maintenance__c==null && other.getInterest_Infr_Maintenance__c()==null) || 
             (this.interest_Infr_Maintenance__c!=null &&
              this.interest_Infr_Maintenance__c.equals(other.getInterest_Infr_Maintenance__c()))) &&
            ((this.interest_Infr_Optimization__c==null && other.getInterest_Infr_Optimization__c()==null) || 
             (this.interest_Infr_Optimization__c!=null &&
              this.interest_Infr_Optimization__c.equals(other.getInterest_Infr_Optimization__c()))) &&
            ((this.interest_Infr_Relativity_Agents__c==null && other.getInterest_Infr_Relativity_Agents__c()==null) || 
             (this.interest_Infr_Relativity_Agents__c!=null &&
              this.interest_Infr_Relativity_Agents__c.equals(other.getInterest_Infr_Relativity_Agents__c()))) &&
            ((this.interest_Infr_Relativity_Databases__c==null && other.getInterest_Infr_Relativity_Databases__c()==null) || 
             (this.interest_Infr_Relativity_Databases__c!=null &&
              this.interest_Infr_Relativity_Databases__c.equals(other.getInterest_Infr_Relativity_Databases__c()))) &&
            ((this.interest_Infr_SQL_Configuration__c==null && other.getInterest_Infr_SQL_Configuration__c()==null) || 
             (this.interest_Infr_SQL_Configuration__c!=null &&
              this.interest_Infr_SQL_Configuration__c.equals(other.getInterest_Infr_SQL_Configuration__c()))) &&
            ((this.interest_Infr_Server_Roles__c==null && other.getInterest_Infr_Server_Roles__c()==null) || 
             (this.interest_Infr_Server_Roles__c!=null &&
              this.interest_Infr_Server_Roles__c.equals(other.getInterest_Infr_Server_Roles__c()))) &&
            ((this.interest_Method_Class_Overview__c==null && other.getInterest_Method_Class_Overview__c()==null) || 
             (this.interest_Method_Class_Overview__c!=null &&
              this.interest_Method_Class_Overview__c.equals(other.getInterest_Method_Class_Overview__c()))) &&
            ((this.interest_Method_Class_Setup_Libraries__c==null && other.getInterest_Method_Class_Setup_Libraries__c()==null) || 
             (this.interest_Method_Class_Setup_Libraries__c!=null &&
              this.interest_Method_Class_Setup_Libraries__c.equals(other.getInterest_Method_Class_Setup_Libraries__c()))) &&
            ((this.interest_Method_Class_Strat_Planning__c==null && other.getInterest_Method_Class_Strat_Planning__c()==null) || 
             (this.interest_Method_Class_Strat_Planning__c!=null &&
              this.interest_Method_Class_Strat_Planning__c.equals(other.getInterest_Method_Class_Strat_Planning__c()))) &&
            ((this.interest_Method_Class_Workflow__c==null && other.getInterest_Method_Class_Workflow__c()==null) || 
             (this.interest_Method_Class_Workflow__c!=null &&
              this.interest_Method_Class_Workflow__c.equals(other.getInterest_Method_Class_Workflow__c()))) &&
            ((this.interest_Method_Custodian_Management__c==null && other.getInterest_Method_Custodian_Management__c()==null) || 
             (this.interest_Method_Custodian_Management__c!=null &&
              this.interest_Method_Custodian_Management__c.equals(other.getInterest_Method_Custodian_Management__c()))) &&
            ((this.interest_Method_Interview_Portal__c==null && other.getInterest_Method_Interview_Portal__c()==null) || 
             (this.interest_Method_Interview_Portal__c!=null &&
              this.interest_Method_Interview_Portal__c.equals(other.getInterest_Method_Interview_Portal__c()))) &&
            ((this.interest_Method_Managing_Hold__c==null && other.getInterest_Method_Managing_Hold__c()==null) || 
             (this.interest_Method_Managing_Hold__c!=null &&
              this.interest_Method_Managing_Hold__c.equals(other.getInterest_Method_Managing_Hold__c()))) &&
            ((this.interest_Method_Questionnaire__c==null && other.getInterest_Method_Questionnaire__c()==null) || 
             (this.interest_Method_Questionnaire__c!=null &&
              this.interest_Method_Questionnaire__c.equals(other.getInterest_Method_Questionnaire__c()))) &&
            ((this.interest_Method_Reporting__c==null && other.getInterest_Method_Reporting__c()==null) || 
             (this.interest_Method_Reporting__c!=null &&
              this.interest_Method_Reporting__c.equals(other.getInterest_Method_Reporting__c()))) &&
            ((this.interest_Method_Template_Creation__c==null && other.getInterest_Method_Template_Creation__c()==null) || 
             (this.interest_Method_Template_Creation__c!=null &&
              this.interest_Method_Template_Creation__c.equals(other.getInterest_Method_Template_Creation__c()))) &&
            ((this.interest_Method_Template_Setup__c==null && other.getInterest_Method_Template_Setup__c()==null) || 
             (this.interest_Method_Template_Setup__c!=null &&
              this.interest_Method_Template_Setup__c.equals(other.getInterest_Method_Template_Setup__c()))) &&
            ((this.intuitive_Software__c==null && other.getIntuitive_Software__c()==null) || 
             (this.intuitive_Software__c!=null &&
              this.intuitive_Software__c.equals(other.getIntuitive_Software__c()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.is_Relativity_an_intuitive_software_appl__c==null && other.getIs_Relativity_an_intuitive_software_appl__c()==null) || 
             (this.is_Relativity_an_intuitive_software_appl__c!=null &&
              this.is_Relativity_an_intuitive_software_appl__c.equals(other.getIs_Relativity_an_intuitive_software_appl__c()))) &&
            ((this.issue_that_Caused_Negative_Rating__c==null && other.getIssue_that_Caused_Negative_Rating__c()==null) || 
             (this.issue_that_Caused_Negative_Rating__c!=null &&
              this.issue_that_Caused_Negative_Rating__c.equals(other.getIssue_that_Caused_Negative_Rating__c()))) &&
            ((this.issue_with_Presentation__c==null && other.getIssue_with_Presentation__c()==null) || 
             (this.issue_with_Presentation__c!=null &&
              this.issue_with_Presentation__c.equals(other.getIssue_with_Presentation__c()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.location__c==null && other.getLocation__c()==null) || 
             (this.location__c!=null &&
              this.location__c.equals(other.getLocation__c()))) &&
            ((this.method_Intuitive__c==null && other.getMethod_Intuitive__c()==null) || 
             (this.method_Intuitive__c!=null &&
              this.method_Intuitive__c.equals(other.getMethod_Intuitive__c()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.other_webinars_presented__c==null && other.getOther_webinars_presented__c()==null) || 
             (this.other_webinars_presented__c!=null &&
              this.other_webinars_presented__c.equals(other.getOther_webinars_presented__c()))) &&
            ((this.overall_Experience__c==null && other.getOverall_Experience__c()==null) || 
             (this.overall_Experience__c!=null &&
              this.overall_Experience__c.equals(other.getOverall_Experience__c()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.presentation_Skills__c==null && other.getPresentation_Skills__c()==null) || 
             (this.presentation_Skills__c!=null &&
              this.presentation_Skills__c.equals(other.getPresentation_Skills__c()))) &&
            ((this.presenter_Knowledgeable__c==null && other.getPresenter_Knowledgeable__c()==null) || 
             (this.presenter_Knowledgeable__c!=null &&
              this.presenter_Knowledgeable__c.equals(other.getPresenter_Knowledgeable__c()))) &&
            ((this.presenter_Showcased_Functionality__c==null && other.getPresenter_Showcased_Functionality__c()==null) || 
             (this.presenter_Showcased_Functionality__c!=null &&
              this.presenter_Showcased_Functionality__c.equals(other.getPresenter_Showcased_Functionality__c()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.product__c==null && other.getProduct__c()==null) || 
             (this.product__c!=null &&
              this.product__c.equals(other.getProduct__c()))) &&
            ((this.provided_Valuable_Content__c==null && other.getProvided_Valuable_Content__c()==null) || 
             (this.provided_Valuable_Content__c!=null &&
              this.provided_Valuable_Content__c.equals(other.getProvided_Valuable_Content__c()))) &&
            ((this.RCA_Exam_Proctor__c==null && other.getRCA_Exam_Proctor__c()==null) || 
             (this.RCA_Exam_Proctor__c!=null &&
              this.RCA_Exam_Proctor__c.equals(other.getRCA_Exam_Proctor__c()))) &&
            ((this.RCA_Exam_Version__c==null && other.getRCA_Exam_Version__c()==null) || 
             (this.RCA_Exam_Version__c!=null &&
              this.RCA_Exam_Version__c.equals(other.getRCA_Exam_Version__c()))) &&
            ((this.RCA_Experience_Hands_On_True_Test__c==null && other.getRCA_Experience_Hands_On_True_Test__c()==null) || 
             (this.RCA_Experience_Hands_On_True_Test__c!=null &&
              this.RCA_Experience_Hands_On_True_Test__c.equals(other.getRCA_Experience_Hands_On_True_Test__c()))) &&
            ((this.RCA_Experience_Instructions_Clear__c==null && other.getRCA_Experience_Instructions_Clear__c()==null) || 
             (this.RCA_Experience_Instructions_Clear__c!=null &&
              this.RCA_Experience_Instructions_Clear__c.equals(other.getRCA_Experience_Instructions_Clear__c()))) &&
            ((this.RCA_Experience_Questions_Fair__c==null && other.getRCA_Experience_Questions_Fair__c()==null) || 
             (this.RCA_Experience_Questions_Fair__c!=null &&
              this.RCA_Experience_Questions_Fair__c.equals(other.getRCA_Experience_Questions_Fair__c()))) &&
            ((this.RCA_Experience_Time_Sufficient__c==null && other.getRCA_Experience_Time_Sufficient__c()==null) || 
             (this.RCA_Experience_Time_Sufficient__c!=null &&
              this.RCA_Experience_Time_Sufficient__c.equals(other.getRCA_Experience_Time_Sufficient__c()))) &&
            ((this.RCA_Survey_Score__c==null && other.getRCA_Survey_Score__c()==null) || 
             (this.RCA_Survey_Score__c!=null &&
              this.RCA_Survey_Score__c.equals(other.getRCA_Survey_Score__c()))) &&
            ((this.RCA_Test_ID__c==null && other.getRCA_Test_ID__c()==null) || 
             (this.RCA_Test_ID__c!=null &&
              this.RCA_Test_ID__c.equals(other.getRCA_Test_ID__c()))) &&
            ((this.RCA_Use_Documentation_to_Study__c==null && other.getRCA_Use_Documentation_to_Study__c()==null) || 
             (this.RCA_Use_Documentation_to_Study__c!=null &&
              this.RCA_Use_Documentation_to_Study__c.equals(other.getRCA_Use_Documentation_to_Study__c()))) &&
            ((this.RCA_Was_Documentation_Comprehensive__c==null && other.getRCA_Was_Documentation_Comprehensive__c()==null) || 
             (this.RCA_Was_Documentation_Comprehensive__c!=null &&
              this.RCA_Was_Documentation_Comprehensive__c.equals(other.getRCA_Was_Documentation_Comprehensive__c()))) &&
            ((this.recommend_Training__c==null && other.getRecommend_Training__c()==null) || 
             (this.recommend_Training__c!=null &&
              this.recommend_Training__c.equals(other.getRecommend_Training__c()))) &&
            ((this.recommend_to_Colleague__c==null && other.getRecommend_to_Colleague__c()==null) || 
             (this.recommend_to_Colleague__c!=null &&
              this.recommend_to_Colleague__c.equals(other.getRecommend_to_Colleague__c()))) &&
            ((this.recordType==null && other.getRecordType()==null) || 
             (this.recordType!=null &&
              this.recordType.equals(other.getRecordType()))) &&
            ((this.recordTypeId==null && other.getRecordTypeId()==null) || 
             (this.recordTypeId!=null &&
              this.recordTypeId.equals(other.getRecordTypeId()))) &&
            ((this.session_Start_Details__c==null && other.getSession_Start_Details__c()==null) || 
             (this.session_Start_Details__c!=null &&
              this.session_Start_Details__c.equals(other.getSession_Start_Details__c()))) &&
            ((this.survey_Object__c==null && other.getSurvey_Object__c()==null) || 
             (this.survey_Object__c!=null &&
              this.survey_Object__c.equals(other.getSurvey_Object__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.trainee_Email_Address__c==null && other.getTrainee_Email_Address__c()==null) || 
             (this.trainee_Email_Address__c!=null &&
              this.trainee_Email_Address__c.equals(other.getTrainee_Email_Address__c()))) &&
            ((this.trainingName__c==null && other.getTrainingName__c()==null) || 
             (this.trainingName__c!=null &&
              this.trainingName__c.equals(other.getTrainingName__c()))) &&
            ((this.training_Attendee__c==null && other.getTraining_Attendee__c()==null) || 
             (this.training_Attendee__c!=null &&
              this.training_Attendee__c.equals(other.getTraining_Attendee__c()))) &&
            ((this.training_Attendee__r==null && other.getTraining_Attendee__r()==null) || 
             (this.training_Attendee__r!=null &&
              this.training_Attendee__r.equals(other.getTraining_Attendee__r()))) &&
            ((this.training_Content_Useful_Scenario__c==null && other.getTraining_Content_Useful_Scenario__c()==null) || 
             (this.training_Content_Useful_Scenario__c!=null &&
              this.training_Content_Useful_Scenario__c.equals(other.getTraining_Content_Useful_Scenario__c()))) &&
            ((this.training_Covered_Requirements__c==null && other.getTraining_Covered_Requirements__c()==null) || 
             (this.training_Covered_Requirements__c!=null &&
              this.training_Covered_Requirements__c.equals(other.getTraining_Covered_Requirements__c()))) &&
            ((this.training_Instructor_Role__c==null && other.getTraining_Instructor_Role__c()==null) || 
             (this.training_Instructor_Role__c!=null &&
              this.training_Instructor_Role__c.equals(other.getTraining_Instructor_Role__c()))) &&
            ((this.training_Instructor__c==null && other.getTraining_Instructor__c()==null) || 
             (this.training_Instructor__c!=null &&
              this.training_Instructor__c.equals(other.getTraining_Instructor__c()))) &&
            ((this.training_Met_My_Needs__c==null && other.getTraining_Met_My_Needs__c()==null) || 
             (this.training_Met_My_Needs__c!=null &&
              this.training_Met_My_Needs__c.equals(other.getTraining_Met_My_Needs__c()))) &&
            ((this.training_Name__c==null && other.getTraining_Name__c()==null) || 
             (this.training_Name__c!=null &&
              this.training_Name__c.equals(other.getTraining_Name__c()))) &&
            ((this.training_Session_Type__c==null && other.getTraining_Session_Type__c()==null) || 
             (this.training_Session_Type__c!=null &&
              this.training_Session_Type__c.equals(other.getTraining_Session_Type__c()))) &&
            ((this.training_Session__c==null && other.getTraining_Session__c()==null) || 
             (this.training_Session__c!=null &&
              this.training_Session__c.equals(other.getTraining_Session__c()))) &&
            ((this.training_Session__r==null && other.getTraining_Session__r()==null) || 
             (this.training_Session__r!=null &&
              this.training_Session__r.equals(other.getTraining_Session__r()))) &&
            ((this.training_docs_informative_and_complete__c==null && other.getTraining_docs_informative_and_complete__c()==null) || 
             (this.training_docs_informative_and_complete__c!=null &&
              this.training_docs_informative_and_complete__c.equals(other.getTraining_docs_informative_and_complete__c()))) &&
            ((this.training_was_interesting__c==null && other.getTraining_was_interesting__c()==null) || 
             (this.training_was_interesting__c!=null &&
              this.training_was_interesting__c.equals(other.getTraining_was_interesting__c()))) &&
            ((this.tutorial_Name__c==null && other.getTutorial_Name__c()==null) || 
             (this.tutorial_Name__c!=null &&
              this.tutorial_Name__c.equals(other.getTutorial_Name__c()))) &&
            ((this.tutorial__c==null && other.getTutorial__c()==null) || 
             (this.tutorial__c!=null &&
              this.tutorial__c.equals(other.getTutorial__c()))) &&
            ((this.tutorial_like_or_dislike__c==null && other.getTutorial_like_or_dislike__c()==null) || 
             (this.tutorial_like_or_dislike__c!=null &&
              this.tutorial_like_or_dislike__c.equals(other.getTutorial_like_or_dislike__c()))) &&
            ((this.volume_of_Content__c==null && other.getVolume_of_Content__c()==null) || 
             (this.volume_of_Content__c!=null &&
              this.volume_of_Content__c.equals(other.getVolume_of_Content__c()))) &&
            ((this.were_facilities_properly_equipped__c==null && other.getWere_facilities_properly_equipped__c()==null) || 
             (this.were_facilities_properly_equipped__c!=null &&
              this.were_facilities_properly_equipped__c.equals(other.getWere_facilities_properly_equipped__c()))) &&
            ((this.what_could_be_done_better_next_time__c==null && other.getWhat_could_be_done_better_next_time__c()==null) || 
             (this.what_could_be_done_better_next_time__c!=null &&
              this.what_could_be_done_better_next_time__c.equals(other.getWhat_could_be_done_better_next_time__c()))) &&
            ((this.what_could_have_been_done_better__c==null && other.getWhat_could_have_been_done_better__c()==null) || 
             (this.what_could_have_been_done_better__c!=null &&
              this.what_could_have_been_done_better__c.equals(other.getWhat_could_have_been_done_better__c()))) &&
            ((this.what_did_you_like_best_or_find_the_most__c==null && other.getWhat_did_you_like_best_or_find_the_most__c()==null) || 
             (this.what_did_you_like_best_or_find_the_most__c!=null &&
              this.what_did_you_like_best_or_find_the_most__c.equals(other.getWhat_did_you_like_best_or_find_the_most__c()))) &&
            ((this.what_skills_did_you_learn_that_can_be_ap__c==null && other.getWhat_skills_did_you_learn_that_can_be_ap__c()==null) || 
             (this.what_skills_did_you_learn_that_can_be_ap__c!=null &&
              this.what_skills_did_you_learn_that_can_be_ap__c.equals(other.getWhat_skills_did_you_learn_that_can_be_ap__c()))) &&
            ((this.workflow__c==null && other.getWorkflow__c()==null) || 
             (this.workflow__c!=null &&
              this.workflow__c.equals(other.getWorkflow__c()))) &&
            ((this.instructor_answered_questions_in_a_way_I__c==null && other.getInstructor_answered_questions_in_a_way_I__c()==null) || 
             (this.instructor_answered_questions_in_a_way_I__c!=null &&
              this.instructor_answered_questions_in_a_way_I__c.equals(other.getInstructor_answered_questions_in_a_way_I__c()))) &&
            ((this.presenter_Understood_Software_Evaluation__c==null && other.getPresenter_Understood_Software_Evaluation__c()==null) || 
             (this.presenter_Understood_Software_Evaluation__c!=null &&
              this.presenter_Understood_Software_Evaluation__c.equals(other.getPresenter_Understood_Software_Evaluation__c()))) &&
            ((this.recommend_instructor_to_my_collegue__c==null && other.getRecommend_instructor_to_my_collegue__c()==null) || 
             (this.recommend_instructor_to_my_collegue__c!=null &&
              this.recommend_instructor_to_my_collegue__c.equals(other.getRecommend_instructor_to_my_collegue__c())));
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
        if (getAdditional_comment_or_suggestions__c() != null) {
            _hashCode += getAdditional_comment_or_suggestions__c().hashCode();
        }
        if (getAdmin_Certification_Name__c() != null) {
            _hashCode += getAdmin_Certification_Name__c().hashCode();
        }
        if (getAdmin_Certification_Name__r() != null) {
            _hashCode += getAdmin_Certification_Name__r().hashCode();
        }
        if (getAppropriate_Balance_Lecture_and_Hands_On__c() != null) {
            _hashCode += getAppropriate_Balance_Lecture_and_Hands_On__c().hashCode();
        }
        if (getAre_our_manuals_compete__c() != null) {
            _hashCode += getAre_our_manuals_compete__c().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getComparison_to_Other_Demos__c() != null) {
            _hashCode += getComparison_to_Other_Demos__c().hashCode();
        }
        if (getContent_Relevance_with_goals__c() != null) {
            _hashCode += getContent_Relevance_with_goals__c().hashCode();
        }
        if (getContent_relevance_for_role__c() != null) {
            _hashCode += getContent_relevance_for_role__c().hashCode();
        }
        if (getCourse_Satisfaction__c() != null) {
            _hashCode += getCourse_Satisfaction__c().hashCode();
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
        if (getCurrently_use_Product__c() != null) {
            _hashCode += getCurrently_use_Product__c().hashCode();
        }
        if (getDO_Content_Useful__c() != null) {
            _hashCode += getDO_Content_Useful__c().hashCode();
        }
        if (getDO_Training_Content_Details__c() != null) {
            _hashCode += getDO_Training_Content_Details__c().hashCode();
        }
        if (getDemo_Meet_Expecations__c() != null) {
            _hashCode += getDemo_Meet_Expecations__c().hashCode();
        }
        if (getDemo_Presenter__c() != null) {
            _hashCode += getDemo_Presenter__c().hashCode();
        }
        if (getDemo_Type__c() != null) {
            _hashCode += getDemo_Type__c().hashCode();
        }
        if (getDemo__c() != null) {
            _hashCode += getDemo__c().hashCode();
        }
        if (getDemo__r() != null) {
            _hashCode += getDemo__r().hashCode();
        }
        if (getDid_Training_session_start_on_time__c() != null) {
            _hashCode += getDid_Training_session_start_on_time__c().hashCode();
        }
        if (getFacilities_Additional_Info__c() != null) {
            _hashCode += getFacilities_Additional_Info__c().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getFurther_Follow_up_Required__c() != null) {
            _hashCode += getFurther_Follow_up_Required__c().hashCode();
        }
        if (getGoToMeeting_Issue_Details__c() != null) {
            _hashCode += getGoToMeeting_Issue_Details__c().hashCode();
        }
        if (getGo_ToMeeting_Issues__c() != null) {
            _hashCode += getGo_ToMeeting_Issues__c().hashCode();
        }
        if (getHow_can_we_improve_webinar__c() != null) {
            _hashCode += getHow_can_we_improve_webinar__c().hashCode();
        }
        if (getHow_could_experience_be_better__c() != null) {
            _hashCode += getHow_could_experience_be_better__c().hashCode();
        }
        if (getHow_could_this_training_be_improved__c() != null) {
            _hashCode += getHow_could_this_training_be_improved__c().hashCode();
        }
        if (getInstructor_Knowledgeable__c() != null) {
            _hashCode += getInstructor_Knowledgeable__c().hashCode();
        }
        if (getInstructor_was_open_to_questions__c() != null) {
            _hashCode += getInstructor_was_open_to_questions__c().hashCode();
        }
        if (getInterest_Admin_Case_Creation__c() != null) {
            _hashCode += getInterest_Admin_Case_Creation__c().hashCode();
        }
        if (getInterest_Admin_Importing_Data__c() != null) {
            _hashCode += getInterest_Admin_Importing_Data__c().hashCode();
        }
        if (getInterest_Admin_Productions__c() != null) {
            _hashCode += getInterest_Admin_Productions__c().hashCode();
        }
        if (getInterest_Admin_Searching__c() != null) {
            _hashCode += getInterest_Admin_Searching__c().hashCode();
        }
        if (getInterest_Admin_Security__c() != null) {
            _hashCode += getInterest_Admin_Security__c().hashCode();
        }
        if (getInterest_Analytics_Index_Creation__c() != null) {
            _hashCode += getInterest_Analytics_Index_Creation__c().hashCode();
        }
        if (getInterest_Analytics_Index_Optimization__c() != null) {
            _hashCode += getInterest_Analytics_Index_Optimization__c().hashCode();
        }
        if (getInterest_Analytics_Workflow__c() != null) {
            _hashCode += getInterest_Analytics_Workflow__c().hashCode();
        }
        if (getInterest_Analytics__c() != null) {
            _hashCode += getInterest_Analytics__c().hashCode();
        }
        if (getInterest_EU_Annotating_Redacting__c() != null) {
            _hashCode += getInterest_EU_Annotating_Redacting__c().hashCode();
        }
        if (getInterest_EU_Coding_Tagging__c() != null) {
            _hashCode += getInterest_EU_Coding_Tagging__c().hashCode();
        }
        if (getInterest_EU_Navigation__c() != null) {
            _hashCode += getInterest_EU_Navigation__c().hashCode();
        }
        if (getInterest_EU_Reviewer_Interface__c() != null) {
            _hashCode += getInterest_EU_Reviewer_Interface__c().hashCode();
        }
        if (getInterest_EU_Searching_Filtering__c() != null) {
            _hashCode += getInterest_EU_Searching_Filtering__c().hashCode();
        }
        if (getInterest_Infr_Back_End_Architecture__c() != null) {
            _hashCode += getInterest_Infr_Back_End_Architecture__c().hashCode();
        }
        if (getInterest_Infr_Maintenance__c() != null) {
            _hashCode += getInterest_Infr_Maintenance__c().hashCode();
        }
        if (getInterest_Infr_Optimization__c() != null) {
            _hashCode += getInterest_Infr_Optimization__c().hashCode();
        }
        if (getInterest_Infr_Relativity_Agents__c() != null) {
            _hashCode += getInterest_Infr_Relativity_Agents__c().hashCode();
        }
        if (getInterest_Infr_Relativity_Databases__c() != null) {
            _hashCode += getInterest_Infr_Relativity_Databases__c().hashCode();
        }
        if (getInterest_Infr_SQL_Configuration__c() != null) {
            _hashCode += getInterest_Infr_SQL_Configuration__c().hashCode();
        }
        if (getInterest_Infr_Server_Roles__c() != null) {
            _hashCode += getInterest_Infr_Server_Roles__c().hashCode();
        }
        if (getInterest_Method_Class_Overview__c() != null) {
            _hashCode += getInterest_Method_Class_Overview__c().hashCode();
        }
        if (getInterest_Method_Class_Setup_Libraries__c() != null) {
            _hashCode += getInterest_Method_Class_Setup_Libraries__c().hashCode();
        }
        if (getInterest_Method_Class_Strat_Planning__c() != null) {
            _hashCode += getInterest_Method_Class_Strat_Planning__c().hashCode();
        }
        if (getInterest_Method_Class_Workflow__c() != null) {
            _hashCode += getInterest_Method_Class_Workflow__c().hashCode();
        }
        if (getInterest_Method_Custodian_Management__c() != null) {
            _hashCode += getInterest_Method_Custodian_Management__c().hashCode();
        }
        if (getInterest_Method_Interview_Portal__c() != null) {
            _hashCode += getInterest_Method_Interview_Portal__c().hashCode();
        }
        if (getInterest_Method_Managing_Hold__c() != null) {
            _hashCode += getInterest_Method_Managing_Hold__c().hashCode();
        }
        if (getInterest_Method_Questionnaire__c() != null) {
            _hashCode += getInterest_Method_Questionnaire__c().hashCode();
        }
        if (getInterest_Method_Reporting__c() != null) {
            _hashCode += getInterest_Method_Reporting__c().hashCode();
        }
        if (getInterest_Method_Template_Creation__c() != null) {
            _hashCode += getInterest_Method_Template_Creation__c().hashCode();
        }
        if (getInterest_Method_Template_Setup__c() != null) {
            _hashCode += getInterest_Method_Template_Setup__c().hashCode();
        }
        if (getIntuitive_Software__c() != null) {
            _hashCode += getIntuitive_Software__c().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getIs_Relativity_an_intuitive_software_appl__c() != null) {
            _hashCode += getIs_Relativity_an_intuitive_software_appl__c().hashCode();
        }
        if (getIssue_that_Caused_Negative_Rating__c() != null) {
            _hashCode += getIssue_that_Caused_Negative_Rating__c().hashCode();
        }
        if (getIssue_with_Presentation__c() != null) {
            _hashCode += getIssue_with_Presentation__c().hashCode();
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
        if (getLocation__c() != null) {
            _hashCode += getLocation__c().hashCode();
        }
        if (getMethod_Intuitive__c() != null) {
            _hashCode += getMethod_Intuitive__c().hashCode();
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
        if (getOther_webinars_presented__c() != null) {
            _hashCode += getOther_webinars_presented__c().hashCode();
        }
        if (getOverall_Experience__c() != null) {
            _hashCode += getOverall_Experience__c().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getPresentation_Skills__c() != null) {
            _hashCode += getPresentation_Skills__c().hashCode();
        }
        if (getPresenter_Knowledgeable__c() != null) {
            _hashCode += getPresenter_Knowledgeable__c().hashCode();
        }
        if (getPresenter_Showcased_Functionality__c() != null) {
            _hashCode += getPresenter_Showcased_Functionality__c().hashCode();
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
        if (getProvided_Valuable_Content__c() != null) {
            _hashCode += getProvided_Valuable_Content__c().hashCode();
        }
        if (getRCA_Exam_Proctor__c() != null) {
            _hashCode += getRCA_Exam_Proctor__c().hashCode();
        }
        if (getRCA_Exam_Version__c() != null) {
            _hashCode += getRCA_Exam_Version__c().hashCode();
        }
        if (getRCA_Experience_Hands_On_True_Test__c() != null) {
            _hashCode += getRCA_Experience_Hands_On_True_Test__c().hashCode();
        }
        if (getRCA_Experience_Instructions_Clear__c() != null) {
            _hashCode += getRCA_Experience_Instructions_Clear__c().hashCode();
        }
        if (getRCA_Experience_Questions_Fair__c() != null) {
            _hashCode += getRCA_Experience_Questions_Fair__c().hashCode();
        }
        if (getRCA_Experience_Time_Sufficient__c() != null) {
            _hashCode += getRCA_Experience_Time_Sufficient__c().hashCode();
        }
        if (getRCA_Survey_Score__c() != null) {
            _hashCode += getRCA_Survey_Score__c().hashCode();
        }
        if (getRCA_Test_ID__c() != null) {
            _hashCode += getRCA_Test_ID__c().hashCode();
        }
        if (getRCA_Use_Documentation_to_Study__c() != null) {
            _hashCode += getRCA_Use_Documentation_to_Study__c().hashCode();
        }
        if (getRCA_Was_Documentation_Comprehensive__c() != null) {
            _hashCode += getRCA_Was_Documentation_Comprehensive__c().hashCode();
        }
        if (getRecommend_Training__c() != null) {
            _hashCode += getRecommend_Training__c().hashCode();
        }
        if (getRecommend_to_Colleague__c() != null) {
            _hashCode += getRecommend_to_Colleague__c().hashCode();
        }
        if (getRecordType() != null) {
            _hashCode += getRecordType().hashCode();
        }
        if (getRecordTypeId() != null) {
            _hashCode += getRecordTypeId().hashCode();
        }
        if (getSession_Start_Details__c() != null) {
            _hashCode += getSession_Start_Details__c().hashCode();
        }
        if (getSurvey_Object__c() != null) {
            _hashCode += getSurvey_Object__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTrainee_Email_Address__c() != null) {
            _hashCode += getTrainee_Email_Address__c().hashCode();
        }
        if (getTrainingName__c() != null) {
            _hashCode += getTrainingName__c().hashCode();
        }
        if (getTraining_Attendee__c() != null) {
            _hashCode += getTraining_Attendee__c().hashCode();
        }
        if (getTraining_Attendee__r() != null) {
            _hashCode += getTraining_Attendee__r().hashCode();
        }
        if (getTraining_Content_Useful_Scenario__c() != null) {
            _hashCode += getTraining_Content_Useful_Scenario__c().hashCode();
        }
        if (getTraining_Covered_Requirements__c() != null) {
            _hashCode += getTraining_Covered_Requirements__c().hashCode();
        }
        if (getTraining_Instructor_Role__c() != null) {
            _hashCode += getTraining_Instructor_Role__c().hashCode();
        }
        if (getTraining_Instructor__c() != null) {
            _hashCode += getTraining_Instructor__c().hashCode();
        }
        if (getTraining_Met_My_Needs__c() != null) {
            _hashCode += getTraining_Met_My_Needs__c().hashCode();
        }
        if (getTraining_Name__c() != null) {
            _hashCode += getTraining_Name__c().hashCode();
        }
        if (getTraining_Session_Type__c() != null) {
            _hashCode += getTraining_Session_Type__c().hashCode();
        }
        if (getTraining_Session__c() != null) {
            _hashCode += getTraining_Session__c().hashCode();
        }
        if (getTraining_Session__r() != null) {
            _hashCode += getTraining_Session__r().hashCode();
        }
        if (getTraining_docs_informative_and_complete__c() != null) {
            _hashCode += getTraining_docs_informative_and_complete__c().hashCode();
        }
        if (getTraining_was_interesting__c() != null) {
            _hashCode += getTraining_was_interesting__c().hashCode();
        }
        if (getTutorial_Name__c() != null) {
            _hashCode += getTutorial_Name__c().hashCode();
        }
        if (getTutorial__c() != null) {
            _hashCode += getTutorial__c().hashCode();
        }
        if (getTutorial_like_or_dislike__c() != null) {
            _hashCode += getTutorial_like_or_dislike__c().hashCode();
        }
        if (getVolume_of_Content__c() != null) {
            _hashCode += getVolume_of_Content__c().hashCode();
        }
        if (getWere_facilities_properly_equipped__c() != null) {
            _hashCode += getWere_facilities_properly_equipped__c().hashCode();
        }
        if (getWhat_could_be_done_better_next_time__c() != null) {
            _hashCode += getWhat_could_be_done_better_next_time__c().hashCode();
        }
        if (getWhat_could_have_been_done_better__c() != null) {
            _hashCode += getWhat_could_have_been_done_better__c().hashCode();
        }
        if (getWhat_did_you_like_best_or_find_the_most__c() != null) {
            _hashCode += getWhat_did_you_like_best_or_find_the_most__c().hashCode();
        }
        if (getWhat_skills_did_you_learn_that_can_be_ap__c() != null) {
            _hashCode += getWhat_skills_did_you_learn_that_can_be_ap__c().hashCode();
        }
        if (getWorkflow__c() != null) {
            _hashCode += getWorkflow__c().hashCode();
        }
        if (getInstructor_answered_questions_in_a_way_I__c() != null) {
            _hashCode += getInstructor_answered_questions_in_a_way_I__c().hashCode();
        }
        if (getPresenter_Understood_Software_Evaluation__c() != null) {
            _hashCode += getPresenter_Understood_Software_Evaluation__c().hashCode();
        }
        if (getRecommend_instructor_to_my_collegue__c() != null) {
            _hashCode += getRecommend_instructor_to_my_collegue__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Training_Survey_Results__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Survey_Results__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additional_comment_or_suggestions__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Additional_comment_or_suggestions__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("admin_Certification_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Admin_Certification_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("admin_Certification_Name__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Admin_Certification_Name__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Admin_Certification__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appropriate_Balance_Lecture_and_Hands_On__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Appropriate_Balance_Lecture_and_Hands_On__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("are_our_manuals_compete__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Are_our_manuals_compete__c"));
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
        elemField.setFieldName("comparison_to_Other_Demos__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Comparison_to_Other_Demos__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content_Relevance_with_goals__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Content_Relevance_with_goals__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content_relevance_for_role__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Content_relevance_for_role__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("course_Satisfaction__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Course_Satisfaction__c"));
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
        elemField.setFieldName("currently_use_Product__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Currently_use_Product__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DO_Content_Useful__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DO_Content_Useful__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DO_Training_Content_Details__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DO_Training_Content_Details__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("demo_Meet_Expecations__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Demo_Meet_Expecations__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("demo_Presenter__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Demo_Presenter__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("demo_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Demo_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("demo__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Demo__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("demo__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Demo__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Demo__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("did_Training_session_start_on_time__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Did_Training_session_start_on_time__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("facilities_Additional_Info__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Facilities_Additional_Info__c"));
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
        elemField.setFieldName("further_Follow_up_Required__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Further_Follow_up_Required__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("goToMeeting_Issue_Details__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "GoToMeeting_Issue_Details__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("go_ToMeeting_Issues__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Go_ToMeeting_Issues__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("how_can_we_improve_webinar__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "How_can_we_improve_webinar__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("how_could_experience_be_better__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "How_could_experience_be_better__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("how_could_this_training_be_improved__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "How_could_this_training_be_improved__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instructor_Knowledgeable__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Instructor_Knowledgeable__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instructor_was_open_to_questions__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Instructor_was_open_to_questions__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interest_Admin_Case_Creation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Interest_Admin_Case_Creation__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interest_Admin_Importing_Data__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Interest_Admin_Importing_Data__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interest_Admin_Productions__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Interest_Admin_Productions__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interest_Admin_Searching__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Interest_Admin_Searching__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interest_Admin_Security__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Interest_Admin_Security__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interest_Analytics_Index_Creation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Interest_Analytics_Index_Creation__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interest_Analytics_Index_Optimization__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Interest_Analytics_Index_Optimization__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interest_Analytics_Workflow__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Interest_Analytics_Workflow__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interest_Analytics__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Interest_Analytics__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interest_EU_Annotating_Redacting__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Interest_EU_Annotating_Redacting__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interest_EU_Coding_Tagging__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Interest_EU_Coding_Tagging__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interest_EU_Navigation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Interest_EU_Navigation__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interest_EU_Reviewer_Interface__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Interest_EU_Reviewer_Interface__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interest_EU_Searching_Filtering__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Interest_EU_Searching_Filtering__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interest_Infr_Back_End_Architecture__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Interest_Infr_Back_End_Architecture__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interest_Infr_Maintenance__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Interest_Infr_Maintenance__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interest_Infr_Optimization__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Interest_Infr_Optimization__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interest_Infr_Relativity_Agents__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Interest_Infr_Relativity_Agents__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interest_Infr_Relativity_Databases__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Interest_Infr_Relativity_Databases__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interest_Infr_SQL_Configuration__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Interest_Infr_SQL_Configuration__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interest_Infr_Server_Roles__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Interest_Infr_Server_Roles__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interest_Method_Class_Overview__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Interest_Method_Class_Overview__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interest_Method_Class_Setup_Libraries__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Interest_Method_Class_Setup_Libraries__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interest_Method_Class_Strat_Planning__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Interest_Method_Class_Strat_Planning__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interest_Method_Class_Workflow__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Interest_Method_Class_Workflow__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interest_Method_Custodian_Management__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Interest_Method_Custodian_Management__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interest_Method_Interview_Portal__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Interest_Method_Interview_Portal__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interest_Method_Managing_Hold__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Interest_Method_Managing_Hold__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interest_Method_Questionnaire__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Interest_Method_Questionnaire__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interest_Method_Reporting__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Interest_Method_Reporting__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interest_Method_Template_Creation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Interest_Method_Template_Creation__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interest_Method_Template_Setup__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Interest_Method_Template_Setup__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intuitive_Software__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Intuitive_Software__c"));
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
        elemField.setFieldName("is_Relativity_an_intuitive_software_appl__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Is_Relativity_an_intuitive_software_appl__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issue_that_Caused_Negative_Rating__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Issue_that_Caused_Negative_Rating__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issue_with_Presentation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Issue_with_Presentation__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("location__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Location__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("method_Intuitive__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Method_Intuitive__c"));
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
        elemField.setFieldName("other_webinars_presented__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Other_webinars_presented__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overall_Experience__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Overall_Experience__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("presentation_Skills__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Presentation_Skills__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presenter_Knowledgeable__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Presenter_Knowledgeable__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presenter_Showcased_Functionality__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Presenter_Showcased_Functionality__c"));
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
        elemField.setFieldName("product__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Product__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provided_Valuable_Content__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Provided_Valuable_Content__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RCA_Exam_Proctor__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCA_Exam_Proctor__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RCA_Exam_Version__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCA_Exam_Version__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RCA_Experience_Hands_On_True_Test__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCA_Experience_Hands_On_True_Test__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RCA_Experience_Instructions_Clear__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCA_Experience_Instructions_Clear__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RCA_Experience_Questions_Fair__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCA_Experience_Questions_Fair__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RCA_Experience_Time_Sufficient__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCA_Experience_Time_Sufficient__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RCA_Survey_Score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCA_Survey_Score__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RCA_Test_ID__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCA_Test_ID__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RCA_Use_Documentation_to_Study__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCA_Use_Documentation_to_Study__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RCA_Was_Documentation_Comprehensive__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCA_Was_Documentation_Comprehensive__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recommend_Training__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Recommend_Training__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recommend_to_Colleague__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Recommend_to_Colleague__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("session_Start_Details__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Session_Start_Details__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("survey_Object__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Survey_Object__c"));
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
        elemField.setFieldName("trainee_Email_Address__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Trainee_Email_Address__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trainingName__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TrainingName__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("training_Attendee__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Attendee__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("training_Attendee__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Attendee__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Attendee__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("training_Content_Useful_Scenario__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Content_Useful_Scenario__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("training_Covered_Requirements__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Covered_Requirements__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("training_Instructor_Role__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Instructor_Role__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("training_Instructor__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Instructor__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("training_Met_My_Needs__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Met_My_Needs__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("training_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("training_Session_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Session_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("training_Session__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Session__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("training_Session__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Session__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Relativity__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("training_docs_informative_and_complete__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_docs_informative_and_complete__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("training_was_interesting__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_was_interesting__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tutorial_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tutorial_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tutorial__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tutorial__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tutorial_like_or_dislike__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tutorial_like_or_dislike__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volume_of_Content__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Volume_of_Content__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("were_facilities_properly_equipped__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Were_facilities_properly_equipped__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("what_could_be_done_better_next_time__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "What_could_be_done_better_next_time__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("what_could_have_been_done_better__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "What_could_have_been_done_better__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("what_did_you_like_best_or_find_the_most__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "What_did_you_like_best_or_find_the_most__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("what_skills_did_you_learn_that_can_be_ap__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "What_skills_did_you_learn_that_can_be_ap__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflow__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Workflow__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instructor_answered_questions_in_a_way_I__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "instructor_answered_questions_in_a_way_I__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presenter_Understood_Software_Evaluation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "presenter_Understood_Software_Evaluation__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recommend_instructor_to_my_collegue__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "recommend_instructor_to_my_collegue__c"));
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

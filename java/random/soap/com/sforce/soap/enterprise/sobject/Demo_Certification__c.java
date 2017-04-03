/**
 * Demo_Certification__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Demo_Certification__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.Double accuracy_of_Answers__c;

    private java.lang.String answer_1__c;

    private java.lang.String answer_2__c;

    private java.lang.String answer_3__c;

    private java.lang.String answer_4__c;

    private java.lang.String answer_5__c;

    private java.lang.String answer_6__c;

    private java.lang.Double appropriate_Screen_Resolution_Use_of_F11__c;

    private java.lang.Double assisted_Review_Overview_Pivot_Profile__c;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.Double browsing_Case_Folders_Choice_Tree__c;

    private java.lang.Double case_List__c;

    private java.lang.Double case_Workspace__c;

    private java.lang.Double categorization__c;

    private java.lang.Double category_Overturn_Reports__c;

    private com.sforce.soap.enterprise.QueryResult certification_Contacts__r;

    private java.lang.String certification_Type__c;

    private com.sforce.soap.enterprise.sobject.Certification_Type__c certification_Type__r;

    private java.lang.Double clustering__c;

    private java.lang.String command_Comments__c;

    private java.lang.Double command_Total__c;

    private java.lang.String comments_10__c;

    private java.lang.String comments_11__c;

    private java.lang.String comments_12__c;

    private java.lang.String comments_13__c;

    private java.lang.String comments_14__c;

    private java.lang.String comments_15__c;

    private java.lang.String comments_16__c;

    private java.lang.String comments_17__c;

    private java.lang.String comments_18__c;

    private java.lang.String comments_19__c;

    private java.lang.String comments_1__c;

    private java.lang.String comments_20__c;

    private java.lang.String comments_21__c;

    private java.lang.String comments_22__c;

    private java.lang.String comments_23__c;

    private java.lang.String comments_2__c;

    private java.lang.String comments_3__c;

    private java.lang.String comments_4__c;

    private java.lang.String comments_5__c;

    private java.lang.String comments_6__c;

    private java.lang.String comments_7__c;

    private java.lang.String comments_8__c;

    private java.lang.String comments_9__c;

    private java.lang.String comments__c;

    private java.lang.Double connects_Features_to_Workflow_Value__c;

    private java.lang.String contact__c;

    private com.sforce.soap.enterprise.sobject.Contact contact__r;

    private java.lang.String correct_1__c;

    private java.lang.String correct_2__c;

    private java.lang.String correct_3__c;

    private java.lang.String correct_4__c;

    private java.lang.String correct_5__c;

    private java.lang.String correct_6__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.Double creating_Facts_on_the_Fly__c;

    private java.util.Date date__c;

    private java.lang.String demo_Presented__c;

    private com.sforce.soap.enterprise.sobject.Demo_Cert_Presentation__c demo_Presented__r;

    private java.lang.String demo_Type__c;

    private java.lang.Double deposition_Preparation__c;

    private java.lang.Double domain_Filtering_and_Data_Culling__c;

    private java.lang.Double efficiency_of_Answers__c;

    private java.lang.Double engaging_Asks_Questions__c;

    private java.lang.Double exam_Score__c;

    private java.lang.Double fact_Library_Manually_Entering_a_Fact__c;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.lang.Double final_Score__c;

    private java.lang.Double high_Energy__c;

    private java.lang.Double high_Level_Understanding_of_Data__c;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.Double how_Keywords_Intersect_with_Custodians__c;

    private java.lang.Double in_Line_Concept_Search__c;

    private java.lang.Double intro_Painting_the_Picture__c;

    private java.lang.Double intro_to_Relativity_Pivot__c;

    private java.lang.Double introduction__c;

    private java.lang.Boolean isDeleted;

    private java.lang.Double keyword_Expansion__c;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.Double layouts__c;

    private java.lang.Double mouse_Movements__c;

    private java.lang.String name;

    private java.lang.Double native_Files_1St_email__c;

    private java.lang.Double native_Files_Other__c;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private java.lang.Double orange_Round_Categorization_Snapshot__c;

    private java.lang.Double orange_Round_Coding__c;

    private java.lang.Double orange_Round_Create_Sample_Set__c;

    private java.lang.String pass_Fail__c;

    private java.lang.String passing_Score_Analytics__c;

    private java.lang.String passing_Score_Fact_Manager__c;

    private java.lang.String passing_Score_Pivot__c;

    private java.lang.String passing_Score_RAR__c;

    private java.lang.String passing_Score_Standard__c;

    private java.lang.String presentation_Comments__c;

    private java.lang.Double presentation_Total_Final__c;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.Double QC_Reviewer_Accuracy__c;

    private java.lang.Double QC_Round_Categorization_Snapshot__c;

    private java.lang.Double QC_Round_Coding__c;

    private java.lang.Double QC_Round_Create_Sample_Set__c;

    private java.lang.Double qualifying_Questions_Intro_Security__c;

    private java.lang.Double qualifying_Questions_Intro_to_Workspace__c;

    private java.lang.Double qualifying_Questions__c;

    private java.lang.String question_1__c;

    private java.lang.String question_2__c;

    private java.lang.String question_3__c;

    private java.lang.String question_4__c;

    private java.lang.String question_5__c;

    private java.lang.String question_6__c;

    private java.lang.Double question_Libraries__c;

    private java.lang.Double questions_Total__c;

    private java.lang.String quiz_Pass_Fail__c;

    private com.sforce.soap.enterprise.QueryResult RCE_Credits__r;

    private com.sforce.soap.enterprise.sobject.RecordType recordType;

    private java.lang.String recordTypeId;

    private java.lang.Double related_Items__c;

    private java.lang.Double report_Sets__c;

    private java.lang.Double searching_Advanced__c;

    private java.lang.Double searching_Basic__c;

    private java.lang.Double similar_Document_Detection__c;

    private java.lang.Double similar_Document_Groupings__c;

    private java.lang.Double summary__c;

    private java.util.Calendar systemModstamp;

    private java.lang.Double TIFFing_Redacting_Markup_Sets__c;

    private java.lang.Double tier_1_Reviewer_using_Reviewer2__c;

    private java.lang.String time__c;

    private java.lang.Double total_Command__c;

    private java.lang.Double total_Presentation__c;

    private java.lang.Double total_Questions__c;

    private java.lang.Double views_Mass_Actions__c;

    public Demo_Certification__c() {
    }

    public Demo_Certification__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.Double accuracy_of_Answers__c,
           java.lang.String answer_1__c,
           java.lang.String answer_2__c,
           java.lang.String answer_3__c,
           java.lang.String answer_4__c,
           java.lang.String answer_5__c,
           java.lang.String answer_6__c,
           java.lang.Double appropriate_Screen_Resolution_Use_of_F11__c,
           java.lang.Double assisted_Review_Overview_Pivot_Profile__c,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.Double browsing_Case_Folders_Choice_Tree__c,
           java.lang.Double case_List__c,
           java.lang.Double case_Workspace__c,
           java.lang.Double categorization__c,
           java.lang.Double category_Overturn_Reports__c,
           com.sforce.soap.enterprise.QueryResult certification_Contacts__r,
           java.lang.String certification_Type__c,
           com.sforce.soap.enterprise.sobject.Certification_Type__c certification_Type__r,
           java.lang.Double clustering__c,
           java.lang.String command_Comments__c,
           java.lang.Double command_Total__c,
           java.lang.String comments_10__c,
           java.lang.String comments_11__c,
           java.lang.String comments_12__c,
           java.lang.String comments_13__c,
           java.lang.String comments_14__c,
           java.lang.String comments_15__c,
           java.lang.String comments_16__c,
           java.lang.String comments_17__c,
           java.lang.String comments_18__c,
           java.lang.String comments_19__c,
           java.lang.String comments_1__c,
           java.lang.String comments_20__c,
           java.lang.String comments_21__c,
           java.lang.String comments_22__c,
           java.lang.String comments_23__c,
           java.lang.String comments_2__c,
           java.lang.String comments_3__c,
           java.lang.String comments_4__c,
           java.lang.String comments_5__c,
           java.lang.String comments_6__c,
           java.lang.String comments_7__c,
           java.lang.String comments_8__c,
           java.lang.String comments_9__c,
           java.lang.String comments__c,
           java.lang.Double connects_Features_to_Workflow_Value__c,
           java.lang.String contact__c,
           com.sforce.soap.enterprise.sobject.Contact contact__r,
           java.lang.String correct_1__c,
           java.lang.String correct_2__c,
           java.lang.String correct_3__c,
           java.lang.String correct_4__c,
           java.lang.String correct_5__c,
           java.lang.String correct_6__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.Double creating_Facts_on_the_Fly__c,
           java.util.Date date__c,
           java.lang.String demo_Presented__c,
           com.sforce.soap.enterprise.sobject.Demo_Cert_Presentation__c demo_Presented__r,
           java.lang.String demo_Type__c,
           java.lang.Double deposition_Preparation__c,
           java.lang.Double domain_Filtering_and_Data_Culling__c,
           java.lang.Double efficiency_of_Answers__c,
           java.lang.Double engaging_Asks_Questions__c,
           java.lang.Double exam_Score__c,
           java.lang.Double fact_Library_Manually_Entering_a_Fact__c,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.lang.Double final_Score__c,
           java.lang.Double high_Energy__c,
           java.lang.Double high_Level_Understanding_of_Data__c,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.Double how_Keywords_Intersect_with_Custodians__c,
           java.lang.Double in_Line_Concept_Search__c,
           java.lang.Double intro_Painting_the_Picture__c,
           java.lang.Double intro_to_Relativity_Pivot__c,
           java.lang.Double introduction__c,
           java.lang.Boolean isDeleted,
           java.lang.Double keyword_Expansion__c,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.Double layouts__c,
           java.lang.Double mouse_Movements__c,
           java.lang.String name,
           java.lang.Double native_Files_1St_email__c,
           java.lang.Double native_Files_Other__c,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           java.lang.Double orange_Round_Categorization_Snapshot__c,
           java.lang.Double orange_Round_Coding__c,
           java.lang.Double orange_Round_Create_Sample_Set__c,
           java.lang.String pass_Fail__c,
           java.lang.String passing_Score_Analytics__c,
           java.lang.String passing_Score_Fact_Manager__c,
           java.lang.String passing_Score_Pivot__c,
           java.lang.String passing_Score_RAR__c,
           java.lang.String passing_Score_Standard__c,
           java.lang.String presentation_Comments__c,
           java.lang.Double presentation_Total_Final__c,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.Double QC_Reviewer_Accuracy__c,
           java.lang.Double QC_Round_Categorization_Snapshot__c,
           java.lang.Double QC_Round_Coding__c,
           java.lang.Double QC_Round_Create_Sample_Set__c,
           java.lang.Double qualifying_Questions_Intro_Security__c,
           java.lang.Double qualifying_Questions_Intro_to_Workspace__c,
           java.lang.Double qualifying_Questions__c,
           java.lang.String question_1__c,
           java.lang.String question_2__c,
           java.lang.String question_3__c,
           java.lang.String question_4__c,
           java.lang.String question_5__c,
           java.lang.String question_6__c,
           java.lang.Double question_Libraries__c,
           java.lang.Double questions_Total__c,
           java.lang.String quiz_Pass_Fail__c,
           com.sforce.soap.enterprise.QueryResult RCE_Credits__r,
           com.sforce.soap.enterprise.sobject.RecordType recordType,
           java.lang.String recordTypeId,
           java.lang.Double related_Items__c,
           java.lang.Double report_Sets__c,
           java.lang.Double searching_Advanced__c,
           java.lang.Double searching_Basic__c,
           java.lang.Double similar_Document_Detection__c,
           java.lang.Double similar_Document_Groupings__c,
           java.lang.Double summary__c,
           java.util.Calendar systemModstamp,
           java.lang.Double TIFFing_Redacting_Markup_Sets__c,
           java.lang.Double tier_1_Reviewer_using_Reviewer2__c,
           java.lang.String time__c,
           java.lang.Double total_Command__c,
           java.lang.Double total_Presentation__c,
           java.lang.Double total_Questions__c,
           java.lang.Double views_Mass_Actions__c) {
        super(
            fieldsToNull,
            id);
        this.accuracy_of_Answers__c = accuracy_of_Answers__c;
        this.answer_1__c = answer_1__c;
        this.answer_2__c = answer_2__c;
        this.answer_3__c = answer_3__c;
        this.answer_4__c = answer_4__c;
        this.answer_5__c = answer_5__c;
        this.answer_6__c = answer_6__c;
        this.appropriate_Screen_Resolution_Use_of_F11__c = appropriate_Screen_Resolution_Use_of_F11__c;
        this.assisted_Review_Overview_Pivot_Profile__c = assisted_Review_Overview_Pivot_Profile__c;
        this.attachments = attachments;
        this.browsing_Case_Folders_Choice_Tree__c = browsing_Case_Folders_Choice_Tree__c;
        this.case_List__c = case_List__c;
        this.case_Workspace__c = case_Workspace__c;
        this.categorization__c = categorization__c;
        this.category_Overturn_Reports__c = category_Overturn_Reports__c;
        this.certification_Contacts__r = certification_Contacts__r;
        this.certification_Type__c = certification_Type__c;
        this.certification_Type__r = certification_Type__r;
        this.clustering__c = clustering__c;
        this.command_Comments__c = command_Comments__c;
        this.command_Total__c = command_Total__c;
        this.comments_10__c = comments_10__c;
        this.comments_11__c = comments_11__c;
        this.comments_12__c = comments_12__c;
        this.comments_13__c = comments_13__c;
        this.comments_14__c = comments_14__c;
        this.comments_15__c = comments_15__c;
        this.comments_16__c = comments_16__c;
        this.comments_17__c = comments_17__c;
        this.comments_18__c = comments_18__c;
        this.comments_19__c = comments_19__c;
        this.comments_1__c = comments_1__c;
        this.comments_20__c = comments_20__c;
        this.comments_21__c = comments_21__c;
        this.comments_22__c = comments_22__c;
        this.comments_23__c = comments_23__c;
        this.comments_2__c = comments_2__c;
        this.comments_3__c = comments_3__c;
        this.comments_4__c = comments_4__c;
        this.comments_5__c = comments_5__c;
        this.comments_6__c = comments_6__c;
        this.comments_7__c = comments_7__c;
        this.comments_8__c = comments_8__c;
        this.comments_9__c = comments_9__c;
        this.comments__c = comments__c;
        this.connects_Features_to_Workflow_Value__c = connects_Features_to_Workflow_Value__c;
        this.contact__c = contact__c;
        this.contact__r = contact__r;
        this.correct_1__c = correct_1__c;
        this.correct_2__c = correct_2__c;
        this.correct_3__c = correct_3__c;
        this.correct_4__c = correct_4__c;
        this.correct_5__c = correct_5__c;
        this.correct_6__c = correct_6__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.creating_Facts_on_the_Fly__c = creating_Facts_on_the_Fly__c;
        this.date__c = date__c;
        this.demo_Presented__c = demo_Presented__c;
        this.demo_Presented__r = demo_Presented__r;
        this.demo_Type__c = demo_Type__c;
        this.deposition_Preparation__c = deposition_Preparation__c;
        this.domain_Filtering_and_Data_Culling__c = domain_Filtering_and_Data_Culling__c;
        this.efficiency_of_Answers__c = efficiency_of_Answers__c;
        this.engaging_Asks_Questions__c = engaging_Asks_Questions__c;
        this.exam_Score__c = exam_Score__c;
        this.fact_Library_Manually_Entering_a_Fact__c = fact_Library_Manually_Entering_a_Fact__c;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.final_Score__c = final_Score__c;
        this.high_Energy__c = high_Energy__c;
        this.high_Level_Understanding_of_Data__c = high_Level_Understanding_of_Data__c;
        this.histories = histories;
        this.how_Keywords_Intersect_with_Custodians__c = how_Keywords_Intersect_with_Custodians__c;
        this.in_Line_Concept_Search__c = in_Line_Concept_Search__c;
        this.intro_Painting_the_Picture__c = intro_Painting_the_Picture__c;
        this.intro_to_Relativity_Pivot__c = intro_to_Relativity_Pivot__c;
        this.introduction__c = introduction__c;
        this.isDeleted = isDeleted;
        this.keyword_Expansion__c = keyword_Expansion__c;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.layouts__c = layouts__c;
        this.mouse_Movements__c = mouse_Movements__c;
        this.name = name;
        this.native_Files_1St_email__c = native_Files_1St_email__c;
        this.native_Files_Other__c = native_Files_Other__c;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.orange_Round_Categorization_Snapshot__c = orange_Round_Categorization_Snapshot__c;
        this.orange_Round_Coding__c = orange_Round_Coding__c;
        this.orange_Round_Create_Sample_Set__c = orange_Round_Create_Sample_Set__c;
        this.pass_Fail__c = pass_Fail__c;
        this.passing_Score_Analytics__c = passing_Score_Analytics__c;
        this.passing_Score_Fact_Manager__c = passing_Score_Fact_Manager__c;
        this.passing_Score_Pivot__c = passing_Score_Pivot__c;
        this.passing_Score_RAR__c = passing_Score_RAR__c;
        this.passing_Score_Standard__c = passing_Score_Standard__c;
        this.presentation_Comments__c = presentation_Comments__c;
        this.presentation_Total_Final__c = presentation_Total_Final__c;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.QC_Reviewer_Accuracy__c = QC_Reviewer_Accuracy__c;
        this.QC_Round_Categorization_Snapshot__c = QC_Round_Categorization_Snapshot__c;
        this.QC_Round_Coding__c = QC_Round_Coding__c;
        this.QC_Round_Create_Sample_Set__c = QC_Round_Create_Sample_Set__c;
        this.qualifying_Questions_Intro_Security__c = qualifying_Questions_Intro_Security__c;
        this.qualifying_Questions_Intro_to_Workspace__c = qualifying_Questions_Intro_to_Workspace__c;
        this.qualifying_Questions__c = qualifying_Questions__c;
        this.question_1__c = question_1__c;
        this.question_2__c = question_2__c;
        this.question_3__c = question_3__c;
        this.question_4__c = question_4__c;
        this.question_5__c = question_5__c;
        this.question_6__c = question_6__c;
        this.question_Libraries__c = question_Libraries__c;
        this.questions_Total__c = questions_Total__c;
        this.quiz_Pass_Fail__c = quiz_Pass_Fail__c;
        this.RCE_Credits__r = RCE_Credits__r;
        this.recordType = recordType;
        this.recordTypeId = recordTypeId;
        this.related_Items__c = related_Items__c;
        this.report_Sets__c = report_Sets__c;
        this.searching_Advanced__c = searching_Advanced__c;
        this.searching_Basic__c = searching_Basic__c;
        this.similar_Document_Detection__c = similar_Document_Detection__c;
        this.similar_Document_Groupings__c = similar_Document_Groupings__c;
        this.summary__c = summary__c;
        this.systemModstamp = systemModstamp;
        this.TIFFing_Redacting_Markup_Sets__c = TIFFing_Redacting_Markup_Sets__c;
        this.tier_1_Reviewer_using_Reviewer2__c = tier_1_Reviewer_using_Reviewer2__c;
        this.time__c = time__c;
        this.total_Command__c = total_Command__c;
        this.total_Presentation__c = total_Presentation__c;
        this.total_Questions__c = total_Questions__c;
        this.views_Mass_Actions__c = views_Mass_Actions__c;
    }


    /**
     * Gets the accuracy_of_Answers__c value for this Demo_Certification__c.
     * 
     * @return accuracy_of_Answers__c
     */
    public java.lang.Double getAccuracy_of_Answers__c() {
        return accuracy_of_Answers__c;
    }


    /**
     * Sets the accuracy_of_Answers__c value for this Demo_Certification__c.
     * 
     * @param accuracy_of_Answers__c
     */
    public void setAccuracy_of_Answers__c(java.lang.Double accuracy_of_Answers__c) {
        this.accuracy_of_Answers__c = accuracy_of_Answers__c;
    }


    /**
     * Gets the answer_1__c value for this Demo_Certification__c.
     * 
     * @return answer_1__c
     */
    public java.lang.String getAnswer_1__c() {
        return answer_1__c;
    }


    /**
     * Sets the answer_1__c value for this Demo_Certification__c.
     * 
     * @param answer_1__c
     */
    public void setAnswer_1__c(java.lang.String answer_1__c) {
        this.answer_1__c = answer_1__c;
    }


    /**
     * Gets the answer_2__c value for this Demo_Certification__c.
     * 
     * @return answer_2__c
     */
    public java.lang.String getAnswer_2__c() {
        return answer_2__c;
    }


    /**
     * Sets the answer_2__c value for this Demo_Certification__c.
     * 
     * @param answer_2__c
     */
    public void setAnswer_2__c(java.lang.String answer_2__c) {
        this.answer_2__c = answer_2__c;
    }


    /**
     * Gets the answer_3__c value for this Demo_Certification__c.
     * 
     * @return answer_3__c
     */
    public java.lang.String getAnswer_3__c() {
        return answer_3__c;
    }


    /**
     * Sets the answer_3__c value for this Demo_Certification__c.
     * 
     * @param answer_3__c
     */
    public void setAnswer_3__c(java.lang.String answer_3__c) {
        this.answer_3__c = answer_3__c;
    }


    /**
     * Gets the answer_4__c value for this Demo_Certification__c.
     * 
     * @return answer_4__c
     */
    public java.lang.String getAnswer_4__c() {
        return answer_4__c;
    }


    /**
     * Sets the answer_4__c value for this Demo_Certification__c.
     * 
     * @param answer_4__c
     */
    public void setAnswer_4__c(java.lang.String answer_4__c) {
        this.answer_4__c = answer_4__c;
    }


    /**
     * Gets the answer_5__c value for this Demo_Certification__c.
     * 
     * @return answer_5__c
     */
    public java.lang.String getAnswer_5__c() {
        return answer_5__c;
    }


    /**
     * Sets the answer_5__c value for this Demo_Certification__c.
     * 
     * @param answer_5__c
     */
    public void setAnswer_5__c(java.lang.String answer_5__c) {
        this.answer_5__c = answer_5__c;
    }


    /**
     * Gets the answer_6__c value for this Demo_Certification__c.
     * 
     * @return answer_6__c
     */
    public java.lang.String getAnswer_6__c() {
        return answer_6__c;
    }


    /**
     * Sets the answer_6__c value for this Demo_Certification__c.
     * 
     * @param answer_6__c
     */
    public void setAnswer_6__c(java.lang.String answer_6__c) {
        this.answer_6__c = answer_6__c;
    }


    /**
     * Gets the appropriate_Screen_Resolution_Use_of_F11__c value for this Demo_Certification__c.
     * 
     * @return appropriate_Screen_Resolution_Use_of_F11__c
     */
    public java.lang.Double getAppropriate_Screen_Resolution_Use_of_F11__c() {
        return appropriate_Screen_Resolution_Use_of_F11__c;
    }


    /**
     * Sets the appropriate_Screen_Resolution_Use_of_F11__c value for this Demo_Certification__c.
     * 
     * @param appropriate_Screen_Resolution_Use_of_F11__c
     */
    public void setAppropriate_Screen_Resolution_Use_of_F11__c(java.lang.Double appropriate_Screen_Resolution_Use_of_F11__c) {
        this.appropriate_Screen_Resolution_Use_of_F11__c = appropriate_Screen_Resolution_Use_of_F11__c;
    }


    /**
     * Gets the assisted_Review_Overview_Pivot_Profile__c value for this Demo_Certification__c.
     * 
     * @return assisted_Review_Overview_Pivot_Profile__c
     */
    public java.lang.Double getAssisted_Review_Overview_Pivot_Profile__c() {
        return assisted_Review_Overview_Pivot_Profile__c;
    }


    /**
     * Sets the assisted_Review_Overview_Pivot_Profile__c value for this Demo_Certification__c.
     * 
     * @param assisted_Review_Overview_Pivot_Profile__c
     */
    public void setAssisted_Review_Overview_Pivot_Profile__c(java.lang.Double assisted_Review_Overview_Pivot_Profile__c) {
        this.assisted_Review_Overview_Pivot_Profile__c = assisted_Review_Overview_Pivot_Profile__c;
    }


    /**
     * Gets the attachments value for this Demo_Certification__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Demo_Certification__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the browsing_Case_Folders_Choice_Tree__c value for this Demo_Certification__c.
     * 
     * @return browsing_Case_Folders_Choice_Tree__c
     */
    public java.lang.Double getBrowsing_Case_Folders_Choice_Tree__c() {
        return browsing_Case_Folders_Choice_Tree__c;
    }


    /**
     * Sets the browsing_Case_Folders_Choice_Tree__c value for this Demo_Certification__c.
     * 
     * @param browsing_Case_Folders_Choice_Tree__c
     */
    public void setBrowsing_Case_Folders_Choice_Tree__c(java.lang.Double browsing_Case_Folders_Choice_Tree__c) {
        this.browsing_Case_Folders_Choice_Tree__c = browsing_Case_Folders_Choice_Tree__c;
    }


    /**
     * Gets the case_List__c value for this Demo_Certification__c.
     * 
     * @return case_List__c
     */
    public java.lang.Double getCase_List__c() {
        return case_List__c;
    }


    /**
     * Sets the case_List__c value for this Demo_Certification__c.
     * 
     * @param case_List__c
     */
    public void setCase_List__c(java.lang.Double case_List__c) {
        this.case_List__c = case_List__c;
    }


    /**
     * Gets the case_Workspace__c value for this Demo_Certification__c.
     * 
     * @return case_Workspace__c
     */
    public java.lang.Double getCase_Workspace__c() {
        return case_Workspace__c;
    }


    /**
     * Sets the case_Workspace__c value for this Demo_Certification__c.
     * 
     * @param case_Workspace__c
     */
    public void setCase_Workspace__c(java.lang.Double case_Workspace__c) {
        this.case_Workspace__c = case_Workspace__c;
    }


    /**
     * Gets the categorization__c value for this Demo_Certification__c.
     * 
     * @return categorization__c
     */
    public java.lang.Double getCategorization__c() {
        return categorization__c;
    }


    /**
     * Sets the categorization__c value for this Demo_Certification__c.
     * 
     * @param categorization__c
     */
    public void setCategorization__c(java.lang.Double categorization__c) {
        this.categorization__c = categorization__c;
    }


    /**
     * Gets the category_Overturn_Reports__c value for this Demo_Certification__c.
     * 
     * @return category_Overturn_Reports__c
     */
    public java.lang.Double getCategory_Overturn_Reports__c() {
        return category_Overturn_Reports__c;
    }


    /**
     * Sets the category_Overturn_Reports__c value for this Demo_Certification__c.
     * 
     * @param category_Overturn_Reports__c
     */
    public void setCategory_Overturn_Reports__c(java.lang.Double category_Overturn_Reports__c) {
        this.category_Overturn_Reports__c = category_Overturn_Reports__c;
    }


    /**
     * Gets the certification_Contacts__r value for this Demo_Certification__c.
     * 
     * @return certification_Contacts__r
     */
    public com.sforce.soap.enterprise.QueryResult getCertification_Contacts__r() {
        return certification_Contacts__r;
    }


    /**
     * Sets the certification_Contacts__r value for this Demo_Certification__c.
     * 
     * @param certification_Contacts__r
     */
    public void setCertification_Contacts__r(com.sforce.soap.enterprise.QueryResult certification_Contacts__r) {
        this.certification_Contacts__r = certification_Contacts__r;
    }


    /**
     * Gets the certification_Type__c value for this Demo_Certification__c.
     * 
     * @return certification_Type__c
     */
    public java.lang.String getCertification_Type__c() {
        return certification_Type__c;
    }


    /**
     * Sets the certification_Type__c value for this Demo_Certification__c.
     * 
     * @param certification_Type__c
     */
    public void setCertification_Type__c(java.lang.String certification_Type__c) {
        this.certification_Type__c = certification_Type__c;
    }


    /**
     * Gets the certification_Type__r value for this Demo_Certification__c.
     * 
     * @return certification_Type__r
     */
    public com.sforce.soap.enterprise.sobject.Certification_Type__c getCertification_Type__r() {
        return certification_Type__r;
    }


    /**
     * Sets the certification_Type__r value for this Demo_Certification__c.
     * 
     * @param certification_Type__r
     */
    public void setCertification_Type__r(com.sforce.soap.enterprise.sobject.Certification_Type__c certification_Type__r) {
        this.certification_Type__r = certification_Type__r;
    }


    /**
     * Gets the clustering__c value for this Demo_Certification__c.
     * 
     * @return clustering__c
     */
    public java.lang.Double getClustering__c() {
        return clustering__c;
    }


    /**
     * Sets the clustering__c value for this Demo_Certification__c.
     * 
     * @param clustering__c
     */
    public void setClustering__c(java.lang.Double clustering__c) {
        this.clustering__c = clustering__c;
    }


    /**
     * Gets the command_Comments__c value for this Demo_Certification__c.
     * 
     * @return command_Comments__c
     */
    public java.lang.String getCommand_Comments__c() {
        return command_Comments__c;
    }


    /**
     * Sets the command_Comments__c value for this Demo_Certification__c.
     * 
     * @param command_Comments__c
     */
    public void setCommand_Comments__c(java.lang.String command_Comments__c) {
        this.command_Comments__c = command_Comments__c;
    }


    /**
     * Gets the command_Total__c value for this Demo_Certification__c.
     * 
     * @return command_Total__c
     */
    public java.lang.Double getCommand_Total__c() {
        return command_Total__c;
    }


    /**
     * Sets the command_Total__c value for this Demo_Certification__c.
     * 
     * @param command_Total__c
     */
    public void setCommand_Total__c(java.lang.Double command_Total__c) {
        this.command_Total__c = command_Total__c;
    }


    /**
     * Gets the comments_10__c value for this Demo_Certification__c.
     * 
     * @return comments_10__c
     */
    public java.lang.String getComments_10__c() {
        return comments_10__c;
    }


    /**
     * Sets the comments_10__c value for this Demo_Certification__c.
     * 
     * @param comments_10__c
     */
    public void setComments_10__c(java.lang.String comments_10__c) {
        this.comments_10__c = comments_10__c;
    }


    /**
     * Gets the comments_11__c value for this Demo_Certification__c.
     * 
     * @return comments_11__c
     */
    public java.lang.String getComments_11__c() {
        return comments_11__c;
    }


    /**
     * Sets the comments_11__c value for this Demo_Certification__c.
     * 
     * @param comments_11__c
     */
    public void setComments_11__c(java.lang.String comments_11__c) {
        this.comments_11__c = comments_11__c;
    }


    /**
     * Gets the comments_12__c value for this Demo_Certification__c.
     * 
     * @return comments_12__c
     */
    public java.lang.String getComments_12__c() {
        return comments_12__c;
    }


    /**
     * Sets the comments_12__c value for this Demo_Certification__c.
     * 
     * @param comments_12__c
     */
    public void setComments_12__c(java.lang.String comments_12__c) {
        this.comments_12__c = comments_12__c;
    }


    /**
     * Gets the comments_13__c value for this Demo_Certification__c.
     * 
     * @return comments_13__c
     */
    public java.lang.String getComments_13__c() {
        return comments_13__c;
    }


    /**
     * Sets the comments_13__c value for this Demo_Certification__c.
     * 
     * @param comments_13__c
     */
    public void setComments_13__c(java.lang.String comments_13__c) {
        this.comments_13__c = comments_13__c;
    }


    /**
     * Gets the comments_14__c value for this Demo_Certification__c.
     * 
     * @return comments_14__c
     */
    public java.lang.String getComments_14__c() {
        return comments_14__c;
    }


    /**
     * Sets the comments_14__c value for this Demo_Certification__c.
     * 
     * @param comments_14__c
     */
    public void setComments_14__c(java.lang.String comments_14__c) {
        this.comments_14__c = comments_14__c;
    }


    /**
     * Gets the comments_15__c value for this Demo_Certification__c.
     * 
     * @return comments_15__c
     */
    public java.lang.String getComments_15__c() {
        return comments_15__c;
    }


    /**
     * Sets the comments_15__c value for this Demo_Certification__c.
     * 
     * @param comments_15__c
     */
    public void setComments_15__c(java.lang.String comments_15__c) {
        this.comments_15__c = comments_15__c;
    }


    /**
     * Gets the comments_16__c value for this Demo_Certification__c.
     * 
     * @return comments_16__c
     */
    public java.lang.String getComments_16__c() {
        return comments_16__c;
    }


    /**
     * Sets the comments_16__c value for this Demo_Certification__c.
     * 
     * @param comments_16__c
     */
    public void setComments_16__c(java.lang.String comments_16__c) {
        this.comments_16__c = comments_16__c;
    }


    /**
     * Gets the comments_17__c value for this Demo_Certification__c.
     * 
     * @return comments_17__c
     */
    public java.lang.String getComments_17__c() {
        return comments_17__c;
    }


    /**
     * Sets the comments_17__c value for this Demo_Certification__c.
     * 
     * @param comments_17__c
     */
    public void setComments_17__c(java.lang.String comments_17__c) {
        this.comments_17__c = comments_17__c;
    }


    /**
     * Gets the comments_18__c value for this Demo_Certification__c.
     * 
     * @return comments_18__c
     */
    public java.lang.String getComments_18__c() {
        return comments_18__c;
    }


    /**
     * Sets the comments_18__c value for this Demo_Certification__c.
     * 
     * @param comments_18__c
     */
    public void setComments_18__c(java.lang.String comments_18__c) {
        this.comments_18__c = comments_18__c;
    }


    /**
     * Gets the comments_19__c value for this Demo_Certification__c.
     * 
     * @return comments_19__c
     */
    public java.lang.String getComments_19__c() {
        return comments_19__c;
    }


    /**
     * Sets the comments_19__c value for this Demo_Certification__c.
     * 
     * @param comments_19__c
     */
    public void setComments_19__c(java.lang.String comments_19__c) {
        this.comments_19__c = comments_19__c;
    }


    /**
     * Gets the comments_1__c value for this Demo_Certification__c.
     * 
     * @return comments_1__c
     */
    public java.lang.String getComments_1__c() {
        return comments_1__c;
    }


    /**
     * Sets the comments_1__c value for this Demo_Certification__c.
     * 
     * @param comments_1__c
     */
    public void setComments_1__c(java.lang.String comments_1__c) {
        this.comments_1__c = comments_1__c;
    }


    /**
     * Gets the comments_20__c value for this Demo_Certification__c.
     * 
     * @return comments_20__c
     */
    public java.lang.String getComments_20__c() {
        return comments_20__c;
    }


    /**
     * Sets the comments_20__c value for this Demo_Certification__c.
     * 
     * @param comments_20__c
     */
    public void setComments_20__c(java.lang.String comments_20__c) {
        this.comments_20__c = comments_20__c;
    }


    /**
     * Gets the comments_21__c value for this Demo_Certification__c.
     * 
     * @return comments_21__c
     */
    public java.lang.String getComments_21__c() {
        return comments_21__c;
    }


    /**
     * Sets the comments_21__c value for this Demo_Certification__c.
     * 
     * @param comments_21__c
     */
    public void setComments_21__c(java.lang.String comments_21__c) {
        this.comments_21__c = comments_21__c;
    }


    /**
     * Gets the comments_22__c value for this Demo_Certification__c.
     * 
     * @return comments_22__c
     */
    public java.lang.String getComments_22__c() {
        return comments_22__c;
    }


    /**
     * Sets the comments_22__c value for this Demo_Certification__c.
     * 
     * @param comments_22__c
     */
    public void setComments_22__c(java.lang.String comments_22__c) {
        this.comments_22__c = comments_22__c;
    }


    /**
     * Gets the comments_23__c value for this Demo_Certification__c.
     * 
     * @return comments_23__c
     */
    public java.lang.String getComments_23__c() {
        return comments_23__c;
    }


    /**
     * Sets the comments_23__c value for this Demo_Certification__c.
     * 
     * @param comments_23__c
     */
    public void setComments_23__c(java.lang.String comments_23__c) {
        this.comments_23__c = comments_23__c;
    }


    /**
     * Gets the comments_2__c value for this Demo_Certification__c.
     * 
     * @return comments_2__c
     */
    public java.lang.String getComments_2__c() {
        return comments_2__c;
    }


    /**
     * Sets the comments_2__c value for this Demo_Certification__c.
     * 
     * @param comments_2__c
     */
    public void setComments_2__c(java.lang.String comments_2__c) {
        this.comments_2__c = comments_2__c;
    }


    /**
     * Gets the comments_3__c value for this Demo_Certification__c.
     * 
     * @return comments_3__c
     */
    public java.lang.String getComments_3__c() {
        return comments_3__c;
    }


    /**
     * Sets the comments_3__c value for this Demo_Certification__c.
     * 
     * @param comments_3__c
     */
    public void setComments_3__c(java.lang.String comments_3__c) {
        this.comments_3__c = comments_3__c;
    }


    /**
     * Gets the comments_4__c value for this Demo_Certification__c.
     * 
     * @return comments_4__c
     */
    public java.lang.String getComments_4__c() {
        return comments_4__c;
    }


    /**
     * Sets the comments_4__c value for this Demo_Certification__c.
     * 
     * @param comments_4__c
     */
    public void setComments_4__c(java.lang.String comments_4__c) {
        this.comments_4__c = comments_4__c;
    }


    /**
     * Gets the comments_5__c value for this Demo_Certification__c.
     * 
     * @return comments_5__c
     */
    public java.lang.String getComments_5__c() {
        return comments_5__c;
    }


    /**
     * Sets the comments_5__c value for this Demo_Certification__c.
     * 
     * @param comments_5__c
     */
    public void setComments_5__c(java.lang.String comments_5__c) {
        this.comments_5__c = comments_5__c;
    }


    /**
     * Gets the comments_6__c value for this Demo_Certification__c.
     * 
     * @return comments_6__c
     */
    public java.lang.String getComments_6__c() {
        return comments_6__c;
    }


    /**
     * Sets the comments_6__c value for this Demo_Certification__c.
     * 
     * @param comments_6__c
     */
    public void setComments_6__c(java.lang.String comments_6__c) {
        this.comments_6__c = comments_6__c;
    }


    /**
     * Gets the comments_7__c value for this Demo_Certification__c.
     * 
     * @return comments_7__c
     */
    public java.lang.String getComments_7__c() {
        return comments_7__c;
    }


    /**
     * Sets the comments_7__c value for this Demo_Certification__c.
     * 
     * @param comments_7__c
     */
    public void setComments_7__c(java.lang.String comments_7__c) {
        this.comments_7__c = comments_7__c;
    }


    /**
     * Gets the comments_8__c value for this Demo_Certification__c.
     * 
     * @return comments_8__c
     */
    public java.lang.String getComments_8__c() {
        return comments_8__c;
    }


    /**
     * Sets the comments_8__c value for this Demo_Certification__c.
     * 
     * @param comments_8__c
     */
    public void setComments_8__c(java.lang.String comments_8__c) {
        this.comments_8__c = comments_8__c;
    }


    /**
     * Gets the comments_9__c value for this Demo_Certification__c.
     * 
     * @return comments_9__c
     */
    public java.lang.String getComments_9__c() {
        return comments_9__c;
    }


    /**
     * Sets the comments_9__c value for this Demo_Certification__c.
     * 
     * @param comments_9__c
     */
    public void setComments_9__c(java.lang.String comments_9__c) {
        this.comments_9__c = comments_9__c;
    }


    /**
     * Gets the comments__c value for this Demo_Certification__c.
     * 
     * @return comments__c
     */
    public java.lang.String getComments__c() {
        return comments__c;
    }


    /**
     * Sets the comments__c value for this Demo_Certification__c.
     * 
     * @param comments__c
     */
    public void setComments__c(java.lang.String comments__c) {
        this.comments__c = comments__c;
    }


    /**
     * Gets the connects_Features_to_Workflow_Value__c value for this Demo_Certification__c.
     * 
     * @return connects_Features_to_Workflow_Value__c
     */
    public java.lang.Double getConnects_Features_to_Workflow_Value__c() {
        return connects_Features_to_Workflow_Value__c;
    }


    /**
     * Sets the connects_Features_to_Workflow_Value__c value for this Demo_Certification__c.
     * 
     * @param connects_Features_to_Workflow_Value__c
     */
    public void setConnects_Features_to_Workflow_Value__c(java.lang.Double connects_Features_to_Workflow_Value__c) {
        this.connects_Features_to_Workflow_Value__c = connects_Features_to_Workflow_Value__c;
    }


    /**
     * Gets the contact__c value for this Demo_Certification__c.
     * 
     * @return contact__c
     */
    public java.lang.String getContact__c() {
        return contact__c;
    }


    /**
     * Sets the contact__c value for this Demo_Certification__c.
     * 
     * @param contact__c
     */
    public void setContact__c(java.lang.String contact__c) {
        this.contact__c = contact__c;
    }


    /**
     * Gets the contact__r value for this Demo_Certification__c.
     * 
     * @return contact__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getContact__r() {
        return contact__r;
    }


    /**
     * Sets the contact__r value for this Demo_Certification__c.
     * 
     * @param contact__r
     */
    public void setContact__r(com.sforce.soap.enterprise.sobject.Contact contact__r) {
        this.contact__r = contact__r;
    }


    /**
     * Gets the correct_1__c value for this Demo_Certification__c.
     * 
     * @return correct_1__c
     */
    public java.lang.String getCorrect_1__c() {
        return correct_1__c;
    }


    /**
     * Sets the correct_1__c value for this Demo_Certification__c.
     * 
     * @param correct_1__c
     */
    public void setCorrect_1__c(java.lang.String correct_1__c) {
        this.correct_1__c = correct_1__c;
    }


    /**
     * Gets the correct_2__c value for this Demo_Certification__c.
     * 
     * @return correct_2__c
     */
    public java.lang.String getCorrect_2__c() {
        return correct_2__c;
    }


    /**
     * Sets the correct_2__c value for this Demo_Certification__c.
     * 
     * @param correct_2__c
     */
    public void setCorrect_2__c(java.lang.String correct_2__c) {
        this.correct_2__c = correct_2__c;
    }


    /**
     * Gets the correct_3__c value for this Demo_Certification__c.
     * 
     * @return correct_3__c
     */
    public java.lang.String getCorrect_3__c() {
        return correct_3__c;
    }


    /**
     * Sets the correct_3__c value for this Demo_Certification__c.
     * 
     * @param correct_3__c
     */
    public void setCorrect_3__c(java.lang.String correct_3__c) {
        this.correct_3__c = correct_3__c;
    }


    /**
     * Gets the correct_4__c value for this Demo_Certification__c.
     * 
     * @return correct_4__c
     */
    public java.lang.String getCorrect_4__c() {
        return correct_4__c;
    }


    /**
     * Sets the correct_4__c value for this Demo_Certification__c.
     * 
     * @param correct_4__c
     */
    public void setCorrect_4__c(java.lang.String correct_4__c) {
        this.correct_4__c = correct_4__c;
    }


    /**
     * Gets the correct_5__c value for this Demo_Certification__c.
     * 
     * @return correct_5__c
     */
    public java.lang.String getCorrect_5__c() {
        return correct_5__c;
    }


    /**
     * Sets the correct_5__c value for this Demo_Certification__c.
     * 
     * @param correct_5__c
     */
    public void setCorrect_5__c(java.lang.String correct_5__c) {
        this.correct_5__c = correct_5__c;
    }


    /**
     * Gets the correct_6__c value for this Demo_Certification__c.
     * 
     * @return correct_6__c
     */
    public java.lang.String getCorrect_6__c() {
        return correct_6__c;
    }


    /**
     * Sets the correct_6__c value for this Demo_Certification__c.
     * 
     * @param correct_6__c
     */
    public void setCorrect_6__c(java.lang.String correct_6__c) {
        this.correct_6__c = correct_6__c;
    }


    /**
     * Gets the createdBy value for this Demo_Certification__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Demo_Certification__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Demo_Certification__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Demo_Certification__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Demo_Certification__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Demo_Certification__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the creating_Facts_on_the_Fly__c value for this Demo_Certification__c.
     * 
     * @return creating_Facts_on_the_Fly__c
     */
    public java.lang.Double getCreating_Facts_on_the_Fly__c() {
        return creating_Facts_on_the_Fly__c;
    }


    /**
     * Sets the creating_Facts_on_the_Fly__c value for this Demo_Certification__c.
     * 
     * @param creating_Facts_on_the_Fly__c
     */
    public void setCreating_Facts_on_the_Fly__c(java.lang.Double creating_Facts_on_the_Fly__c) {
        this.creating_Facts_on_the_Fly__c = creating_Facts_on_the_Fly__c;
    }


    /**
     * Gets the date__c value for this Demo_Certification__c.
     * 
     * @return date__c
     */
    public java.util.Date getDate__c() {
        return date__c;
    }


    /**
     * Sets the date__c value for this Demo_Certification__c.
     * 
     * @param date__c
     */
    public void setDate__c(java.util.Date date__c) {
        this.date__c = date__c;
    }


    /**
     * Gets the demo_Presented__c value for this Demo_Certification__c.
     * 
     * @return demo_Presented__c
     */
    public java.lang.String getDemo_Presented__c() {
        return demo_Presented__c;
    }


    /**
     * Sets the demo_Presented__c value for this Demo_Certification__c.
     * 
     * @param demo_Presented__c
     */
    public void setDemo_Presented__c(java.lang.String demo_Presented__c) {
        this.demo_Presented__c = demo_Presented__c;
    }


    /**
     * Gets the demo_Presented__r value for this Demo_Certification__c.
     * 
     * @return demo_Presented__r
     */
    public com.sforce.soap.enterprise.sobject.Demo_Cert_Presentation__c getDemo_Presented__r() {
        return demo_Presented__r;
    }


    /**
     * Sets the demo_Presented__r value for this Demo_Certification__c.
     * 
     * @param demo_Presented__r
     */
    public void setDemo_Presented__r(com.sforce.soap.enterprise.sobject.Demo_Cert_Presentation__c demo_Presented__r) {
        this.demo_Presented__r = demo_Presented__r;
    }


    /**
     * Gets the demo_Type__c value for this Demo_Certification__c.
     * 
     * @return demo_Type__c
     */
    public java.lang.String getDemo_Type__c() {
        return demo_Type__c;
    }


    /**
     * Sets the demo_Type__c value for this Demo_Certification__c.
     * 
     * @param demo_Type__c
     */
    public void setDemo_Type__c(java.lang.String demo_Type__c) {
        this.demo_Type__c = demo_Type__c;
    }


    /**
     * Gets the deposition_Preparation__c value for this Demo_Certification__c.
     * 
     * @return deposition_Preparation__c
     */
    public java.lang.Double getDeposition_Preparation__c() {
        return deposition_Preparation__c;
    }


    /**
     * Sets the deposition_Preparation__c value for this Demo_Certification__c.
     * 
     * @param deposition_Preparation__c
     */
    public void setDeposition_Preparation__c(java.lang.Double deposition_Preparation__c) {
        this.deposition_Preparation__c = deposition_Preparation__c;
    }


    /**
     * Gets the domain_Filtering_and_Data_Culling__c value for this Demo_Certification__c.
     * 
     * @return domain_Filtering_and_Data_Culling__c
     */
    public java.lang.Double getDomain_Filtering_and_Data_Culling__c() {
        return domain_Filtering_and_Data_Culling__c;
    }


    /**
     * Sets the domain_Filtering_and_Data_Culling__c value for this Demo_Certification__c.
     * 
     * @param domain_Filtering_and_Data_Culling__c
     */
    public void setDomain_Filtering_and_Data_Culling__c(java.lang.Double domain_Filtering_and_Data_Culling__c) {
        this.domain_Filtering_and_Data_Culling__c = domain_Filtering_and_Data_Culling__c;
    }


    /**
     * Gets the efficiency_of_Answers__c value for this Demo_Certification__c.
     * 
     * @return efficiency_of_Answers__c
     */
    public java.lang.Double getEfficiency_of_Answers__c() {
        return efficiency_of_Answers__c;
    }


    /**
     * Sets the efficiency_of_Answers__c value for this Demo_Certification__c.
     * 
     * @param efficiency_of_Answers__c
     */
    public void setEfficiency_of_Answers__c(java.lang.Double efficiency_of_Answers__c) {
        this.efficiency_of_Answers__c = efficiency_of_Answers__c;
    }


    /**
     * Gets the engaging_Asks_Questions__c value for this Demo_Certification__c.
     * 
     * @return engaging_Asks_Questions__c
     */
    public java.lang.Double getEngaging_Asks_Questions__c() {
        return engaging_Asks_Questions__c;
    }


    /**
     * Sets the engaging_Asks_Questions__c value for this Demo_Certification__c.
     * 
     * @param engaging_Asks_Questions__c
     */
    public void setEngaging_Asks_Questions__c(java.lang.Double engaging_Asks_Questions__c) {
        this.engaging_Asks_Questions__c = engaging_Asks_Questions__c;
    }


    /**
     * Gets the exam_Score__c value for this Demo_Certification__c.
     * 
     * @return exam_Score__c
     */
    public java.lang.Double getExam_Score__c() {
        return exam_Score__c;
    }


    /**
     * Sets the exam_Score__c value for this Demo_Certification__c.
     * 
     * @param exam_Score__c
     */
    public void setExam_Score__c(java.lang.Double exam_Score__c) {
        this.exam_Score__c = exam_Score__c;
    }


    /**
     * Gets the fact_Library_Manually_Entering_a_Fact__c value for this Demo_Certification__c.
     * 
     * @return fact_Library_Manually_Entering_a_Fact__c
     */
    public java.lang.Double getFact_Library_Manually_Entering_a_Fact__c() {
        return fact_Library_Manually_Entering_a_Fact__c;
    }


    /**
     * Sets the fact_Library_Manually_Entering_a_Fact__c value for this Demo_Certification__c.
     * 
     * @param fact_Library_Manually_Entering_a_Fact__c
     */
    public void setFact_Library_Manually_Entering_a_Fact__c(java.lang.Double fact_Library_Manually_Entering_a_Fact__c) {
        this.fact_Library_Manually_Entering_a_Fact__c = fact_Library_Manually_Entering_a_Fact__c;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Demo_Certification__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Demo_Certification__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the final_Score__c value for this Demo_Certification__c.
     * 
     * @return final_Score__c
     */
    public java.lang.Double getFinal_Score__c() {
        return final_Score__c;
    }


    /**
     * Sets the final_Score__c value for this Demo_Certification__c.
     * 
     * @param final_Score__c
     */
    public void setFinal_Score__c(java.lang.Double final_Score__c) {
        this.final_Score__c = final_Score__c;
    }


    /**
     * Gets the high_Energy__c value for this Demo_Certification__c.
     * 
     * @return high_Energy__c
     */
    public java.lang.Double getHigh_Energy__c() {
        return high_Energy__c;
    }


    /**
     * Sets the high_Energy__c value for this Demo_Certification__c.
     * 
     * @param high_Energy__c
     */
    public void setHigh_Energy__c(java.lang.Double high_Energy__c) {
        this.high_Energy__c = high_Energy__c;
    }


    /**
     * Gets the high_Level_Understanding_of_Data__c value for this Demo_Certification__c.
     * 
     * @return high_Level_Understanding_of_Data__c
     */
    public java.lang.Double getHigh_Level_Understanding_of_Data__c() {
        return high_Level_Understanding_of_Data__c;
    }


    /**
     * Sets the high_Level_Understanding_of_Data__c value for this Demo_Certification__c.
     * 
     * @param high_Level_Understanding_of_Data__c
     */
    public void setHigh_Level_Understanding_of_Data__c(java.lang.Double high_Level_Understanding_of_Data__c) {
        this.high_Level_Understanding_of_Data__c = high_Level_Understanding_of_Data__c;
    }


    /**
     * Gets the histories value for this Demo_Certification__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Demo_Certification__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the how_Keywords_Intersect_with_Custodians__c value for this Demo_Certification__c.
     * 
     * @return how_Keywords_Intersect_with_Custodians__c
     */
    public java.lang.Double getHow_Keywords_Intersect_with_Custodians__c() {
        return how_Keywords_Intersect_with_Custodians__c;
    }


    /**
     * Sets the how_Keywords_Intersect_with_Custodians__c value for this Demo_Certification__c.
     * 
     * @param how_Keywords_Intersect_with_Custodians__c
     */
    public void setHow_Keywords_Intersect_with_Custodians__c(java.lang.Double how_Keywords_Intersect_with_Custodians__c) {
        this.how_Keywords_Intersect_with_Custodians__c = how_Keywords_Intersect_with_Custodians__c;
    }


    /**
     * Gets the in_Line_Concept_Search__c value for this Demo_Certification__c.
     * 
     * @return in_Line_Concept_Search__c
     */
    public java.lang.Double getIn_Line_Concept_Search__c() {
        return in_Line_Concept_Search__c;
    }


    /**
     * Sets the in_Line_Concept_Search__c value for this Demo_Certification__c.
     * 
     * @param in_Line_Concept_Search__c
     */
    public void setIn_Line_Concept_Search__c(java.lang.Double in_Line_Concept_Search__c) {
        this.in_Line_Concept_Search__c = in_Line_Concept_Search__c;
    }


    /**
     * Gets the intro_Painting_the_Picture__c value for this Demo_Certification__c.
     * 
     * @return intro_Painting_the_Picture__c
     */
    public java.lang.Double getIntro_Painting_the_Picture__c() {
        return intro_Painting_the_Picture__c;
    }


    /**
     * Sets the intro_Painting_the_Picture__c value for this Demo_Certification__c.
     * 
     * @param intro_Painting_the_Picture__c
     */
    public void setIntro_Painting_the_Picture__c(java.lang.Double intro_Painting_the_Picture__c) {
        this.intro_Painting_the_Picture__c = intro_Painting_the_Picture__c;
    }


    /**
     * Gets the intro_to_Relativity_Pivot__c value for this Demo_Certification__c.
     * 
     * @return intro_to_Relativity_Pivot__c
     */
    public java.lang.Double getIntro_to_Relativity_Pivot__c() {
        return intro_to_Relativity_Pivot__c;
    }


    /**
     * Sets the intro_to_Relativity_Pivot__c value for this Demo_Certification__c.
     * 
     * @param intro_to_Relativity_Pivot__c
     */
    public void setIntro_to_Relativity_Pivot__c(java.lang.Double intro_to_Relativity_Pivot__c) {
        this.intro_to_Relativity_Pivot__c = intro_to_Relativity_Pivot__c;
    }


    /**
     * Gets the introduction__c value for this Demo_Certification__c.
     * 
     * @return introduction__c
     */
    public java.lang.Double getIntroduction__c() {
        return introduction__c;
    }


    /**
     * Sets the introduction__c value for this Demo_Certification__c.
     * 
     * @param introduction__c
     */
    public void setIntroduction__c(java.lang.Double introduction__c) {
        this.introduction__c = introduction__c;
    }


    /**
     * Gets the isDeleted value for this Demo_Certification__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Demo_Certification__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the keyword_Expansion__c value for this Demo_Certification__c.
     * 
     * @return keyword_Expansion__c
     */
    public java.lang.Double getKeyword_Expansion__c() {
        return keyword_Expansion__c;
    }


    /**
     * Sets the keyword_Expansion__c value for this Demo_Certification__c.
     * 
     * @param keyword_Expansion__c
     */
    public void setKeyword_Expansion__c(java.lang.Double keyword_Expansion__c) {
        this.keyword_Expansion__c = keyword_Expansion__c;
    }


    /**
     * Gets the lastModifiedBy value for this Demo_Certification__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Demo_Certification__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Demo_Certification__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Demo_Certification__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Demo_Certification__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Demo_Certification__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the layouts__c value for this Demo_Certification__c.
     * 
     * @return layouts__c
     */
    public java.lang.Double getLayouts__c() {
        return layouts__c;
    }


    /**
     * Sets the layouts__c value for this Demo_Certification__c.
     * 
     * @param layouts__c
     */
    public void setLayouts__c(java.lang.Double layouts__c) {
        this.layouts__c = layouts__c;
    }


    /**
     * Gets the mouse_Movements__c value for this Demo_Certification__c.
     * 
     * @return mouse_Movements__c
     */
    public java.lang.Double getMouse_Movements__c() {
        return mouse_Movements__c;
    }


    /**
     * Sets the mouse_Movements__c value for this Demo_Certification__c.
     * 
     * @param mouse_Movements__c
     */
    public void setMouse_Movements__c(java.lang.Double mouse_Movements__c) {
        this.mouse_Movements__c = mouse_Movements__c;
    }


    /**
     * Gets the name value for this Demo_Certification__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Demo_Certification__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the native_Files_1St_email__c value for this Demo_Certification__c.
     * 
     * @return native_Files_1St_email__c
     */
    public java.lang.Double getNative_Files_1St_email__c() {
        return native_Files_1St_email__c;
    }


    /**
     * Sets the native_Files_1St_email__c value for this Demo_Certification__c.
     * 
     * @param native_Files_1St_email__c
     */
    public void setNative_Files_1St_email__c(java.lang.Double native_Files_1St_email__c) {
        this.native_Files_1St_email__c = native_Files_1St_email__c;
    }


    /**
     * Gets the native_Files_Other__c value for this Demo_Certification__c.
     * 
     * @return native_Files_Other__c
     */
    public java.lang.Double getNative_Files_Other__c() {
        return native_Files_Other__c;
    }


    /**
     * Sets the native_Files_Other__c value for this Demo_Certification__c.
     * 
     * @param native_Files_Other__c
     */
    public void setNative_Files_Other__c(java.lang.Double native_Files_Other__c) {
        this.native_Files_Other__c = native_Files_Other__c;
    }


    /**
     * Gets the notes value for this Demo_Certification__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Demo_Certification__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Demo_Certification__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Demo_Certification__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the orange_Round_Categorization_Snapshot__c value for this Demo_Certification__c.
     * 
     * @return orange_Round_Categorization_Snapshot__c
     */
    public java.lang.Double getOrange_Round_Categorization_Snapshot__c() {
        return orange_Round_Categorization_Snapshot__c;
    }


    /**
     * Sets the orange_Round_Categorization_Snapshot__c value for this Demo_Certification__c.
     * 
     * @param orange_Round_Categorization_Snapshot__c
     */
    public void setOrange_Round_Categorization_Snapshot__c(java.lang.Double orange_Round_Categorization_Snapshot__c) {
        this.orange_Round_Categorization_Snapshot__c = orange_Round_Categorization_Snapshot__c;
    }


    /**
     * Gets the orange_Round_Coding__c value for this Demo_Certification__c.
     * 
     * @return orange_Round_Coding__c
     */
    public java.lang.Double getOrange_Round_Coding__c() {
        return orange_Round_Coding__c;
    }


    /**
     * Sets the orange_Round_Coding__c value for this Demo_Certification__c.
     * 
     * @param orange_Round_Coding__c
     */
    public void setOrange_Round_Coding__c(java.lang.Double orange_Round_Coding__c) {
        this.orange_Round_Coding__c = orange_Round_Coding__c;
    }


    /**
     * Gets the orange_Round_Create_Sample_Set__c value for this Demo_Certification__c.
     * 
     * @return orange_Round_Create_Sample_Set__c
     */
    public java.lang.Double getOrange_Round_Create_Sample_Set__c() {
        return orange_Round_Create_Sample_Set__c;
    }


    /**
     * Sets the orange_Round_Create_Sample_Set__c value for this Demo_Certification__c.
     * 
     * @param orange_Round_Create_Sample_Set__c
     */
    public void setOrange_Round_Create_Sample_Set__c(java.lang.Double orange_Round_Create_Sample_Set__c) {
        this.orange_Round_Create_Sample_Set__c = orange_Round_Create_Sample_Set__c;
    }


    /**
     * Gets the pass_Fail__c value for this Demo_Certification__c.
     * 
     * @return pass_Fail__c
     */
    public java.lang.String getPass_Fail__c() {
        return pass_Fail__c;
    }


    /**
     * Sets the pass_Fail__c value for this Demo_Certification__c.
     * 
     * @param pass_Fail__c
     */
    public void setPass_Fail__c(java.lang.String pass_Fail__c) {
        this.pass_Fail__c = pass_Fail__c;
    }


    /**
     * Gets the passing_Score_Analytics__c value for this Demo_Certification__c.
     * 
     * @return passing_Score_Analytics__c
     */
    public java.lang.String getPassing_Score_Analytics__c() {
        return passing_Score_Analytics__c;
    }


    /**
     * Sets the passing_Score_Analytics__c value for this Demo_Certification__c.
     * 
     * @param passing_Score_Analytics__c
     */
    public void setPassing_Score_Analytics__c(java.lang.String passing_Score_Analytics__c) {
        this.passing_Score_Analytics__c = passing_Score_Analytics__c;
    }


    /**
     * Gets the passing_Score_Fact_Manager__c value for this Demo_Certification__c.
     * 
     * @return passing_Score_Fact_Manager__c
     */
    public java.lang.String getPassing_Score_Fact_Manager__c() {
        return passing_Score_Fact_Manager__c;
    }


    /**
     * Sets the passing_Score_Fact_Manager__c value for this Demo_Certification__c.
     * 
     * @param passing_Score_Fact_Manager__c
     */
    public void setPassing_Score_Fact_Manager__c(java.lang.String passing_Score_Fact_Manager__c) {
        this.passing_Score_Fact_Manager__c = passing_Score_Fact_Manager__c;
    }


    /**
     * Gets the passing_Score_Pivot__c value for this Demo_Certification__c.
     * 
     * @return passing_Score_Pivot__c
     */
    public java.lang.String getPassing_Score_Pivot__c() {
        return passing_Score_Pivot__c;
    }


    /**
     * Sets the passing_Score_Pivot__c value for this Demo_Certification__c.
     * 
     * @param passing_Score_Pivot__c
     */
    public void setPassing_Score_Pivot__c(java.lang.String passing_Score_Pivot__c) {
        this.passing_Score_Pivot__c = passing_Score_Pivot__c;
    }


    /**
     * Gets the passing_Score_RAR__c value for this Demo_Certification__c.
     * 
     * @return passing_Score_RAR__c
     */
    public java.lang.String getPassing_Score_RAR__c() {
        return passing_Score_RAR__c;
    }


    /**
     * Sets the passing_Score_RAR__c value for this Demo_Certification__c.
     * 
     * @param passing_Score_RAR__c
     */
    public void setPassing_Score_RAR__c(java.lang.String passing_Score_RAR__c) {
        this.passing_Score_RAR__c = passing_Score_RAR__c;
    }


    /**
     * Gets the passing_Score_Standard__c value for this Demo_Certification__c.
     * 
     * @return passing_Score_Standard__c
     */
    public java.lang.String getPassing_Score_Standard__c() {
        return passing_Score_Standard__c;
    }


    /**
     * Sets the passing_Score_Standard__c value for this Demo_Certification__c.
     * 
     * @param passing_Score_Standard__c
     */
    public void setPassing_Score_Standard__c(java.lang.String passing_Score_Standard__c) {
        this.passing_Score_Standard__c = passing_Score_Standard__c;
    }


    /**
     * Gets the presentation_Comments__c value for this Demo_Certification__c.
     * 
     * @return presentation_Comments__c
     */
    public java.lang.String getPresentation_Comments__c() {
        return presentation_Comments__c;
    }


    /**
     * Sets the presentation_Comments__c value for this Demo_Certification__c.
     * 
     * @param presentation_Comments__c
     */
    public void setPresentation_Comments__c(java.lang.String presentation_Comments__c) {
        this.presentation_Comments__c = presentation_Comments__c;
    }


    /**
     * Gets the presentation_Total_Final__c value for this Demo_Certification__c.
     * 
     * @return presentation_Total_Final__c
     */
    public java.lang.Double getPresentation_Total_Final__c() {
        return presentation_Total_Final__c;
    }


    /**
     * Sets the presentation_Total_Final__c value for this Demo_Certification__c.
     * 
     * @param presentation_Total_Final__c
     */
    public void setPresentation_Total_Final__c(java.lang.Double presentation_Total_Final__c) {
        this.presentation_Total_Final__c = presentation_Total_Final__c;
    }


    /**
     * Gets the processInstances value for this Demo_Certification__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Demo_Certification__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Demo_Certification__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Demo_Certification__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the QC_Reviewer_Accuracy__c value for this Demo_Certification__c.
     * 
     * @return QC_Reviewer_Accuracy__c
     */
    public java.lang.Double getQC_Reviewer_Accuracy__c() {
        return QC_Reviewer_Accuracy__c;
    }


    /**
     * Sets the QC_Reviewer_Accuracy__c value for this Demo_Certification__c.
     * 
     * @param QC_Reviewer_Accuracy__c
     */
    public void setQC_Reviewer_Accuracy__c(java.lang.Double QC_Reviewer_Accuracy__c) {
        this.QC_Reviewer_Accuracy__c = QC_Reviewer_Accuracy__c;
    }


    /**
     * Gets the QC_Round_Categorization_Snapshot__c value for this Demo_Certification__c.
     * 
     * @return QC_Round_Categorization_Snapshot__c
     */
    public java.lang.Double getQC_Round_Categorization_Snapshot__c() {
        return QC_Round_Categorization_Snapshot__c;
    }


    /**
     * Sets the QC_Round_Categorization_Snapshot__c value for this Demo_Certification__c.
     * 
     * @param QC_Round_Categorization_Snapshot__c
     */
    public void setQC_Round_Categorization_Snapshot__c(java.lang.Double QC_Round_Categorization_Snapshot__c) {
        this.QC_Round_Categorization_Snapshot__c = QC_Round_Categorization_Snapshot__c;
    }


    /**
     * Gets the QC_Round_Coding__c value for this Demo_Certification__c.
     * 
     * @return QC_Round_Coding__c
     */
    public java.lang.Double getQC_Round_Coding__c() {
        return QC_Round_Coding__c;
    }


    /**
     * Sets the QC_Round_Coding__c value for this Demo_Certification__c.
     * 
     * @param QC_Round_Coding__c
     */
    public void setQC_Round_Coding__c(java.lang.Double QC_Round_Coding__c) {
        this.QC_Round_Coding__c = QC_Round_Coding__c;
    }


    /**
     * Gets the QC_Round_Create_Sample_Set__c value for this Demo_Certification__c.
     * 
     * @return QC_Round_Create_Sample_Set__c
     */
    public java.lang.Double getQC_Round_Create_Sample_Set__c() {
        return QC_Round_Create_Sample_Set__c;
    }


    /**
     * Sets the QC_Round_Create_Sample_Set__c value for this Demo_Certification__c.
     * 
     * @param QC_Round_Create_Sample_Set__c
     */
    public void setQC_Round_Create_Sample_Set__c(java.lang.Double QC_Round_Create_Sample_Set__c) {
        this.QC_Round_Create_Sample_Set__c = QC_Round_Create_Sample_Set__c;
    }


    /**
     * Gets the qualifying_Questions_Intro_Security__c value for this Demo_Certification__c.
     * 
     * @return qualifying_Questions_Intro_Security__c
     */
    public java.lang.Double getQualifying_Questions_Intro_Security__c() {
        return qualifying_Questions_Intro_Security__c;
    }


    /**
     * Sets the qualifying_Questions_Intro_Security__c value for this Demo_Certification__c.
     * 
     * @param qualifying_Questions_Intro_Security__c
     */
    public void setQualifying_Questions_Intro_Security__c(java.lang.Double qualifying_Questions_Intro_Security__c) {
        this.qualifying_Questions_Intro_Security__c = qualifying_Questions_Intro_Security__c;
    }


    /**
     * Gets the qualifying_Questions_Intro_to_Workspace__c value for this Demo_Certification__c.
     * 
     * @return qualifying_Questions_Intro_to_Workspace__c
     */
    public java.lang.Double getQualifying_Questions_Intro_to_Workspace__c() {
        return qualifying_Questions_Intro_to_Workspace__c;
    }


    /**
     * Sets the qualifying_Questions_Intro_to_Workspace__c value for this Demo_Certification__c.
     * 
     * @param qualifying_Questions_Intro_to_Workspace__c
     */
    public void setQualifying_Questions_Intro_to_Workspace__c(java.lang.Double qualifying_Questions_Intro_to_Workspace__c) {
        this.qualifying_Questions_Intro_to_Workspace__c = qualifying_Questions_Intro_to_Workspace__c;
    }


    /**
     * Gets the qualifying_Questions__c value for this Demo_Certification__c.
     * 
     * @return qualifying_Questions__c
     */
    public java.lang.Double getQualifying_Questions__c() {
        return qualifying_Questions__c;
    }


    /**
     * Sets the qualifying_Questions__c value for this Demo_Certification__c.
     * 
     * @param qualifying_Questions__c
     */
    public void setQualifying_Questions__c(java.lang.Double qualifying_Questions__c) {
        this.qualifying_Questions__c = qualifying_Questions__c;
    }


    /**
     * Gets the question_1__c value for this Demo_Certification__c.
     * 
     * @return question_1__c
     */
    public java.lang.String getQuestion_1__c() {
        return question_1__c;
    }


    /**
     * Sets the question_1__c value for this Demo_Certification__c.
     * 
     * @param question_1__c
     */
    public void setQuestion_1__c(java.lang.String question_1__c) {
        this.question_1__c = question_1__c;
    }


    /**
     * Gets the question_2__c value for this Demo_Certification__c.
     * 
     * @return question_2__c
     */
    public java.lang.String getQuestion_2__c() {
        return question_2__c;
    }


    /**
     * Sets the question_2__c value for this Demo_Certification__c.
     * 
     * @param question_2__c
     */
    public void setQuestion_2__c(java.lang.String question_2__c) {
        this.question_2__c = question_2__c;
    }


    /**
     * Gets the question_3__c value for this Demo_Certification__c.
     * 
     * @return question_3__c
     */
    public java.lang.String getQuestion_3__c() {
        return question_3__c;
    }


    /**
     * Sets the question_3__c value for this Demo_Certification__c.
     * 
     * @param question_3__c
     */
    public void setQuestion_3__c(java.lang.String question_3__c) {
        this.question_3__c = question_3__c;
    }


    /**
     * Gets the question_4__c value for this Demo_Certification__c.
     * 
     * @return question_4__c
     */
    public java.lang.String getQuestion_4__c() {
        return question_4__c;
    }


    /**
     * Sets the question_4__c value for this Demo_Certification__c.
     * 
     * @param question_4__c
     */
    public void setQuestion_4__c(java.lang.String question_4__c) {
        this.question_4__c = question_4__c;
    }


    /**
     * Gets the question_5__c value for this Demo_Certification__c.
     * 
     * @return question_5__c
     */
    public java.lang.String getQuestion_5__c() {
        return question_5__c;
    }


    /**
     * Sets the question_5__c value for this Demo_Certification__c.
     * 
     * @param question_5__c
     */
    public void setQuestion_5__c(java.lang.String question_5__c) {
        this.question_5__c = question_5__c;
    }


    /**
     * Gets the question_6__c value for this Demo_Certification__c.
     * 
     * @return question_6__c
     */
    public java.lang.String getQuestion_6__c() {
        return question_6__c;
    }


    /**
     * Sets the question_6__c value for this Demo_Certification__c.
     * 
     * @param question_6__c
     */
    public void setQuestion_6__c(java.lang.String question_6__c) {
        this.question_6__c = question_6__c;
    }


    /**
     * Gets the question_Libraries__c value for this Demo_Certification__c.
     * 
     * @return question_Libraries__c
     */
    public java.lang.Double getQuestion_Libraries__c() {
        return question_Libraries__c;
    }


    /**
     * Sets the question_Libraries__c value for this Demo_Certification__c.
     * 
     * @param question_Libraries__c
     */
    public void setQuestion_Libraries__c(java.lang.Double question_Libraries__c) {
        this.question_Libraries__c = question_Libraries__c;
    }


    /**
     * Gets the questions_Total__c value for this Demo_Certification__c.
     * 
     * @return questions_Total__c
     */
    public java.lang.Double getQuestions_Total__c() {
        return questions_Total__c;
    }


    /**
     * Sets the questions_Total__c value for this Demo_Certification__c.
     * 
     * @param questions_Total__c
     */
    public void setQuestions_Total__c(java.lang.Double questions_Total__c) {
        this.questions_Total__c = questions_Total__c;
    }


    /**
     * Gets the quiz_Pass_Fail__c value for this Demo_Certification__c.
     * 
     * @return quiz_Pass_Fail__c
     */
    public java.lang.String getQuiz_Pass_Fail__c() {
        return quiz_Pass_Fail__c;
    }


    /**
     * Sets the quiz_Pass_Fail__c value for this Demo_Certification__c.
     * 
     * @param quiz_Pass_Fail__c
     */
    public void setQuiz_Pass_Fail__c(java.lang.String quiz_Pass_Fail__c) {
        this.quiz_Pass_Fail__c = quiz_Pass_Fail__c;
    }


    /**
     * Gets the RCE_Credits__r value for this Demo_Certification__c.
     * 
     * @return RCE_Credits__r
     */
    public com.sforce.soap.enterprise.QueryResult getRCE_Credits__r() {
        return RCE_Credits__r;
    }


    /**
     * Sets the RCE_Credits__r value for this Demo_Certification__c.
     * 
     * @param RCE_Credits__r
     */
    public void setRCE_Credits__r(com.sforce.soap.enterprise.QueryResult RCE_Credits__r) {
        this.RCE_Credits__r = RCE_Credits__r;
    }


    /**
     * Gets the recordType value for this Demo_Certification__c.
     * 
     * @return recordType
     */
    public com.sforce.soap.enterprise.sobject.RecordType getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this Demo_Certification__c.
     * 
     * @param recordType
     */
    public void setRecordType(com.sforce.soap.enterprise.sobject.RecordType recordType) {
        this.recordType = recordType;
    }


    /**
     * Gets the recordTypeId value for this Demo_Certification__c.
     * 
     * @return recordTypeId
     */
    public java.lang.String getRecordTypeId() {
        return recordTypeId;
    }


    /**
     * Sets the recordTypeId value for this Demo_Certification__c.
     * 
     * @param recordTypeId
     */
    public void setRecordTypeId(java.lang.String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }


    /**
     * Gets the related_Items__c value for this Demo_Certification__c.
     * 
     * @return related_Items__c
     */
    public java.lang.Double getRelated_Items__c() {
        return related_Items__c;
    }


    /**
     * Sets the related_Items__c value for this Demo_Certification__c.
     * 
     * @param related_Items__c
     */
    public void setRelated_Items__c(java.lang.Double related_Items__c) {
        this.related_Items__c = related_Items__c;
    }


    /**
     * Gets the report_Sets__c value for this Demo_Certification__c.
     * 
     * @return report_Sets__c
     */
    public java.lang.Double getReport_Sets__c() {
        return report_Sets__c;
    }


    /**
     * Sets the report_Sets__c value for this Demo_Certification__c.
     * 
     * @param report_Sets__c
     */
    public void setReport_Sets__c(java.lang.Double report_Sets__c) {
        this.report_Sets__c = report_Sets__c;
    }


    /**
     * Gets the searching_Advanced__c value for this Demo_Certification__c.
     * 
     * @return searching_Advanced__c
     */
    public java.lang.Double getSearching_Advanced__c() {
        return searching_Advanced__c;
    }


    /**
     * Sets the searching_Advanced__c value for this Demo_Certification__c.
     * 
     * @param searching_Advanced__c
     */
    public void setSearching_Advanced__c(java.lang.Double searching_Advanced__c) {
        this.searching_Advanced__c = searching_Advanced__c;
    }


    /**
     * Gets the searching_Basic__c value for this Demo_Certification__c.
     * 
     * @return searching_Basic__c
     */
    public java.lang.Double getSearching_Basic__c() {
        return searching_Basic__c;
    }


    /**
     * Sets the searching_Basic__c value for this Demo_Certification__c.
     * 
     * @param searching_Basic__c
     */
    public void setSearching_Basic__c(java.lang.Double searching_Basic__c) {
        this.searching_Basic__c = searching_Basic__c;
    }


    /**
     * Gets the similar_Document_Detection__c value for this Demo_Certification__c.
     * 
     * @return similar_Document_Detection__c
     */
    public java.lang.Double getSimilar_Document_Detection__c() {
        return similar_Document_Detection__c;
    }


    /**
     * Sets the similar_Document_Detection__c value for this Demo_Certification__c.
     * 
     * @param similar_Document_Detection__c
     */
    public void setSimilar_Document_Detection__c(java.lang.Double similar_Document_Detection__c) {
        this.similar_Document_Detection__c = similar_Document_Detection__c;
    }


    /**
     * Gets the similar_Document_Groupings__c value for this Demo_Certification__c.
     * 
     * @return similar_Document_Groupings__c
     */
    public java.lang.Double getSimilar_Document_Groupings__c() {
        return similar_Document_Groupings__c;
    }


    /**
     * Sets the similar_Document_Groupings__c value for this Demo_Certification__c.
     * 
     * @param similar_Document_Groupings__c
     */
    public void setSimilar_Document_Groupings__c(java.lang.Double similar_Document_Groupings__c) {
        this.similar_Document_Groupings__c = similar_Document_Groupings__c;
    }


    /**
     * Gets the summary__c value for this Demo_Certification__c.
     * 
     * @return summary__c
     */
    public java.lang.Double getSummary__c() {
        return summary__c;
    }


    /**
     * Sets the summary__c value for this Demo_Certification__c.
     * 
     * @param summary__c
     */
    public void setSummary__c(java.lang.Double summary__c) {
        this.summary__c = summary__c;
    }


    /**
     * Gets the systemModstamp value for this Demo_Certification__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Demo_Certification__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the TIFFing_Redacting_Markup_Sets__c value for this Demo_Certification__c.
     * 
     * @return TIFFing_Redacting_Markup_Sets__c
     */
    public java.lang.Double getTIFFing_Redacting_Markup_Sets__c() {
        return TIFFing_Redacting_Markup_Sets__c;
    }


    /**
     * Sets the TIFFing_Redacting_Markup_Sets__c value for this Demo_Certification__c.
     * 
     * @param TIFFing_Redacting_Markup_Sets__c
     */
    public void setTIFFing_Redacting_Markup_Sets__c(java.lang.Double TIFFing_Redacting_Markup_Sets__c) {
        this.TIFFing_Redacting_Markup_Sets__c = TIFFing_Redacting_Markup_Sets__c;
    }


    /**
     * Gets the tier_1_Reviewer_using_Reviewer2__c value for this Demo_Certification__c.
     * 
     * @return tier_1_Reviewer_using_Reviewer2__c
     */
    public java.lang.Double getTier_1_Reviewer_using_Reviewer2__c() {
        return tier_1_Reviewer_using_Reviewer2__c;
    }


    /**
     * Sets the tier_1_Reviewer_using_Reviewer2__c value for this Demo_Certification__c.
     * 
     * @param tier_1_Reviewer_using_Reviewer2__c
     */
    public void setTier_1_Reviewer_using_Reviewer2__c(java.lang.Double tier_1_Reviewer_using_Reviewer2__c) {
        this.tier_1_Reviewer_using_Reviewer2__c = tier_1_Reviewer_using_Reviewer2__c;
    }


    /**
     * Gets the time__c value for this Demo_Certification__c.
     * 
     * @return time__c
     */
    public java.lang.String getTime__c() {
        return time__c;
    }


    /**
     * Sets the time__c value for this Demo_Certification__c.
     * 
     * @param time__c
     */
    public void setTime__c(java.lang.String time__c) {
        this.time__c = time__c;
    }


    /**
     * Gets the total_Command__c value for this Demo_Certification__c.
     * 
     * @return total_Command__c
     */
    public java.lang.Double getTotal_Command__c() {
        return total_Command__c;
    }


    /**
     * Sets the total_Command__c value for this Demo_Certification__c.
     * 
     * @param total_Command__c
     */
    public void setTotal_Command__c(java.lang.Double total_Command__c) {
        this.total_Command__c = total_Command__c;
    }


    /**
     * Gets the total_Presentation__c value for this Demo_Certification__c.
     * 
     * @return total_Presentation__c
     */
    public java.lang.Double getTotal_Presentation__c() {
        return total_Presentation__c;
    }


    /**
     * Sets the total_Presentation__c value for this Demo_Certification__c.
     * 
     * @param total_Presentation__c
     */
    public void setTotal_Presentation__c(java.lang.Double total_Presentation__c) {
        this.total_Presentation__c = total_Presentation__c;
    }


    /**
     * Gets the total_Questions__c value for this Demo_Certification__c.
     * 
     * @return total_Questions__c
     */
    public java.lang.Double getTotal_Questions__c() {
        return total_Questions__c;
    }


    /**
     * Sets the total_Questions__c value for this Demo_Certification__c.
     * 
     * @param total_Questions__c
     */
    public void setTotal_Questions__c(java.lang.Double total_Questions__c) {
        this.total_Questions__c = total_Questions__c;
    }


    /**
     * Gets the views_Mass_Actions__c value for this Demo_Certification__c.
     * 
     * @return views_Mass_Actions__c
     */
    public java.lang.Double getViews_Mass_Actions__c() {
        return views_Mass_Actions__c;
    }


    /**
     * Sets the views_Mass_Actions__c value for this Demo_Certification__c.
     * 
     * @param views_Mass_Actions__c
     */
    public void setViews_Mass_Actions__c(java.lang.Double views_Mass_Actions__c) {
        this.views_Mass_Actions__c = views_Mass_Actions__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Demo_Certification__c)) return false;
        Demo_Certification__c other = (Demo_Certification__c) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accuracy_of_Answers__c==null && other.getAccuracy_of_Answers__c()==null) || 
             (this.accuracy_of_Answers__c!=null &&
              this.accuracy_of_Answers__c.equals(other.getAccuracy_of_Answers__c()))) &&
            ((this.answer_1__c==null && other.getAnswer_1__c()==null) || 
             (this.answer_1__c!=null &&
              this.answer_1__c.equals(other.getAnswer_1__c()))) &&
            ((this.answer_2__c==null && other.getAnswer_2__c()==null) || 
             (this.answer_2__c!=null &&
              this.answer_2__c.equals(other.getAnswer_2__c()))) &&
            ((this.answer_3__c==null && other.getAnswer_3__c()==null) || 
             (this.answer_3__c!=null &&
              this.answer_3__c.equals(other.getAnswer_3__c()))) &&
            ((this.answer_4__c==null && other.getAnswer_4__c()==null) || 
             (this.answer_4__c!=null &&
              this.answer_4__c.equals(other.getAnswer_4__c()))) &&
            ((this.answer_5__c==null && other.getAnswer_5__c()==null) || 
             (this.answer_5__c!=null &&
              this.answer_5__c.equals(other.getAnswer_5__c()))) &&
            ((this.answer_6__c==null && other.getAnswer_6__c()==null) || 
             (this.answer_6__c!=null &&
              this.answer_6__c.equals(other.getAnswer_6__c()))) &&
            ((this.appropriate_Screen_Resolution_Use_of_F11__c==null && other.getAppropriate_Screen_Resolution_Use_of_F11__c()==null) || 
             (this.appropriate_Screen_Resolution_Use_of_F11__c!=null &&
              this.appropriate_Screen_Resolution_Use_of_F11__c.equals(other.getAppropriate_Screen_Resolution_Use_of_F11__c()))) &&
            ((this.assisted_Review_Overview_Pivot_Profile__c==null && other.getAssisted_Review_Overview_Pivot_Profile__c()==null) || 
             (this.assisted_Review_Overview_Pivot_Profile__c!=null &&
              this.assisted_Review_Overview_Pivot_Profile__c.equals(other.getAssisted_Review_Overview_Pivot_Profile__c()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.browsing_Case_Folders_Choice_Tree__c==null && other.getBrowsing_Case_Folders_Choice_Tree__c()==null) || 
             (this.browsing_Case_Folders_Choice_Tree__c!=null &&
              this.browsing_Case_Folders_Choice_Tree__c.equals(other.getBrowsing_Case_Folders_Choice_Tree__c()))) &&
            ((this.case_List__c==null && other.getCase_List__c()==null) || 
             (this.case_List__c!=null &&
              this.case_List__c.equals(other.getCase_List__c()))) &&
            ((this.case_Workspace__c==null && other.getCase_Workspace__c()==null) || 
             (this.case_Workspace__c!=null &&
              this.case_Workspace__c.equals(other.getCase_Workspace__c()))) &&
            ((this.categorization__c==null && other.getCategorization__c()==null) || 
             (this.categorization__c!=null &&
              this.categorization__c.equals(other.getCategorization__c()))) &&
            ((this.category_Overturn_Reports__c==null && other.getCategory_Overturn_Reports__c()==null) || 
             (this.category_Overturn_Reports__c!=null &&
              this.category_Overturn_Reports__c.equals(other.getCategory_Overturn_Reports__c()))) &&
            ((this.certification_Contacts__r==null && other.getCertification_Contacts__r()==null) || 
             (this.certification_Contacts__r!=null &&
              this.certification_Contacts__r.equals(other.getCertification_Contacts__r()))) &&
            ((this.certification_Type__c==null && other.getCertification_Type__c()==null) || 
             (this.certification_Type__c!=null &&
              this.certification_Type__c.equals(other.getCertification_Type__c()))) &&
            ((this.certification_Type__r==null && other.getCertification_Type__r()==null) || 
             (this.certification_Type__r!=null &&
              this.certification_Type__r.equals(other.getCertification_Type__r()))) &&
            ((this.clustering__c==null && other.getClustering__c()==null) || 
             (this.clustering__c!=null &&
              this.clustering__c.equals(other.getClustering__c()))) &&
            ((this.command_Comments__c==null && other.getCommand_Comments__c()==null) || 
             (this.command_Comments__c!=null &&
              this.command_Comments__c.equals(other.getCommand_Comments__c()))) &&
            ((this.command_Total__c==null && other.getCommand_Total__c()==null) || 
             (this.command_Total__c!=null &&
              this.command_Total__c.equals(other.getCommand_Total__c()))) &&
            ((this.comments_10__c==null && other.getComments_10__c()==null) || 
             (this.comments_10__c!=null &&
              this.comments_10__c.equals(other.getComments_10__c()))) &&
            ((this.comments_11__c==null && other.getComments_11__c()==null) || 
             (this.comments_11__c!=null &&
              this.comments_11__c.equals(other.getComments_11__c()))) &&
            ((this.comments_12__c==null && other.getComments_12__c()==null) || 
             (this.comments_12__c!=null &&
              this.comments_12__c.equals(other.getComments_12__c()))) &&
            ((this.comments_13__c==null && other.getComments_13__c()==null) || 
             (this.comments_13__c!=null &&
              this.comments_13__c.equals(other.getComments_13__c()))) &&
            ((this.comments_14__c==null && other.getComments_14__c()==null) || 
             (this.comments_14__c!=null &&
              this.comments_14__c.equals(other.getComments_14__c()))) &&
            ((this.comments_15__c==null && other.getComments_15__c()==null) || 
             (this.comments_15__c!=null &&
              this.comments_15__c.equals(other.getComments_15__c()))) &&
            ((this.comments_16__c==null && other.getComments_16__c()==null) || 
             (this.comments_16__c!=null &&
              this.comments_16__c.equals(other.getComments_16__c()))) &&
            ((this.comments_17__c==null && other.getComments_17__c()==null) || 
             (this.comments_17__c!=null &&
              this.comments_17__c.equals(other.getComments_17__c()))) &&
            ((this.comments_18__c==null && other.getComments_18__c()==null) || 
             (this.comments_18__c!=null &&
              this.comments_18__c.equals(other.getComments_18__c()))) &&
            ((this.comments_19__c==null && other.getComments_19__c()==null) || 
             (this.comments_19__c!=null &&
              this.comments_19__c.equals(other.getComments_19__c()))) &&
            ((this.comments_1__c==null && other.getComments_1__c()==null) || 
             (this.comments_1__c!=null &&
              this.comments_1__c.equals(other.getComments_1__c()))) &&
            ((this.comments_20__c==null && other.getComments_20__c()==null) || 
             (this.comments_20__c!=null &&
              this.comments_20__c.equals(other.getComments_20__c()))) &&
            ((this.comments_21__c==null && other.getComments_21__c()==null) || 
             (this.comments_21__c!=null &&
              this.comments_21__c.equals(other.getComments_21__c()))) &&
            ((this.comments_22__c==null && other.getComments_22__c()==null) || 
             (this.comments_22__c!=null &&
              this.comments_22__c.equals(other.getComments_22__c()))) &&
            ((this.comments_23__c==null && other.getComments_23__c()==null) || 
             (this.comments_23__c!=null &&
              this.comments_23__c.equals(other.getComments_23__c()))) &&
            ((this.comments_2__c==null && other.getComments_2__c()==null) || 
             (this.comments_2__c!=null &&
              this.comments_2__c.equals(other.getComments_2__c()))) &&
            ((this.comments_3__c==null && other.getComments_3__c()==null) || 
             (this.comments_3__c!=null &&
              this.comments_3__c.equals(other.getComments_3__c()))) &&
            ((this.comments_4__c==null && other.getComments_4__c()==null) || 
             (this.comments_4__c!=null &&
              this.comments_4__c.equals(other.getComments_4__c()))) &&
            ((this.comments_5__c==null && other.getComments_5__c()==null) || 
             (this.comments_5__c!=null &&
              this.comments_5__c.equals(other.getComments_5__c()))) &&
            ((this.comments_6__c==null && other.getComments_6__c()==null) || 
             (this.comments_6__c!=null &&
              this.comments_6__c.equals(other.getComments_6__c()))) &&
            ((this.comments_7__c==null && other.getComments_7__c()==null) || 
             (this.comments_7__c!=null &&
              this.comments_7__c.equals(other.getComments_7__c()))) &&
            ((this.comments_8__c==null && other.getComments_8__c()==null) || 
             (this.comments_8__c!=null &&
              this.comments_8__c.equals(other.getComments_8__c()))) &&
            ((this.comments_9__c==null && other.getComments_9__c()==null) || 
             (this.comments_9__c!=null &&
              this.comments_9__c.equals(other.getComments_9__c()))) &&
            ((this.comments__c==null && other.getComments__c()==null) || 
             (this.comments__c!=null &&
              this.comments__c.equals(other.getComments__c()))) &&
            ((this.connects_Features_to_Workflow_Value__c==null && other.getConnects_Features_to_Workflow_Value__c()==null) || 
             (this.connects_Features_to_Workflow_Value__c!=null &&
              this.connects_Features_to_Workflow_Value__c.equals(other.getConnects_Features_to_Workflow_Value__c()))) &&
            ((this.contact__c==null && other.getContact__c()==null) || 
             (this.contact__c!=null &&
              this.contact__c.equals(other.getContact__c()))) &&
            ((this.contact__r==null && other.getContact__r()==null) || 
             (this.contact__r!=null &&
              this.contact__r.equals(other.getContact__r()))) &&
            ((this.correct_1__c==null && other.getCorrect_1__c()==null) || 
             (this.correct_1__c!=null &&
              this.correct_1__c.equals(other.getCorrect_1__c()))) &&
            ((this.correct_2__c==null && other.getCorrect_2__c()==null) || 
             (this.correct_2__c!=null &&
              this.correct_2__c.equals(other.getCorrect_2__c()))) &&
            ((this.correct_3__c==null && other.getCorrect_3__c()==null) || 
             (this.correct_3__c!=null &&
              this.correct_3__c.equals(other.getCorrect_3__c()))) &&
            ((this.correct_4__c==null && other.getCorrect_4__c()==null) || 
             (this.correct_4__c!=null &&
              this.correct_4__c.equals(other.getCorrect_4__c()))) &&
            ((this.correct_5__c==null && other.getCorrect_5__c()==null) || 
             (this.correct_5__c!=null &&
              this.correct_5__c.equals(other.getCorrect_5__c()))) &&
            ((this.correct_6__c==null && other.getCorrect_6__c()==null) || 
             (this.correct_6__c!=null &&
              this.correct_6__c.equals(other.getCorrect_6__c()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.creating_Facts_on_the_Fly__c==null && other.getCreating_Facts_on_the_Fly__c()==null) || 
             (this.creating_Facts_on_the_Fly__c!=null &&
              this.creating_Facts_on_the_Fly__c.equals(other.getCreating_Facts_on_the_Fly__c()))) &&
            ((this.date__c==null && other.getDate__c()==null) || 
             (this.date__c!=null &&
              this.date__c.equals(other.getDate__c()))) &&
            ((this.demo_Presented__c==null && other.getDemo_Presented__c()==null) || 
             (this.demo_Presented__c!=null &&
              this.demo_Presented__c.equals(other.getDemo_Presented__c()))) &&
            ((this.demo_Presented__r==null && other.getDemo_Presented__r()==null) || 
             (this.demo_Presented__r!=null &&
              this.demo_Presented__r.equals(other.getDemo_Presented__r()))) &&
            ((this.demo_Type__c==null && other.getDemo_Type__c()==null) || 
             (this.demo_Type__c!=null &&
              this.demo_Type__c.equals(other.getDemo_Type__c()))) &&
            ((this.deposition_Preparation__c==null && other.getDeposition_Preparation__c()==null) || 
             (this.deposition_Preparation__c!=null &&
              this.deposition_Preparation__c.equals(other.getDeposition_Preparation__c()))) &&
            ((this.domain_Filtering_and_Data_Culling__c==null && other.getDomain_Filtering_and_Data_Culling__c()==null) || 
             (this.domain_Filtering_and_Data_Culling__c!=null &&
              this.domain_Filtering_and_Data_Culling__c.equals(other.getDomain_Filtering_and_Data_Culling__c()))) &&
            ((this.efficiency_of_Answers__c==null && other.getEfficiency_of_Answers__c()==null) || 
             (this.efficiency_of_Answers__c!=null &&
              this.efficiency_of_Answers__c.equals(other.getEfficiency_of_Answers__c()))) &&
            ((this.engaging_Asks_Questions__c==null && other.getEngaging_Asks_Questions__c()==null) || 
             (this.engaging_Asks_Questions__c!=null &&
              this.engaging_Asks_Questions__c.equals(other.getEngaging_Asks_Questions__c()))) &&
            ((this.exam_Score__c==null && other.getExam_Score__c()==null) || 
             (this.exam_Score__c!=null &&
              this.exam_Score__c.equals(other.getExam_Score__c()))) &&
            ((this.fact_Library_Manually_Entering_a_Fact__c==null && other.getFact_Library_Manually_Entering_a_Fact__c()==null) || 
             (this.fact_Library_Manually_Entering_a_Fact__c!=null &&
              this.fact_Library_Manually_Entering_a_Fact__c.equals(other.getFact_Library_Manually_Entering_a_Fact__c()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.final_Score__c==null && other.getFinal_Score__c()==null) || 
             (this.final_Score__c!=null &&
              this.final_Score__c.equals(other.getFinal_Score__c()))) &&
            ((this.high_Energy__c==null && other.getHigh_Energy__c()==null) || 
             (this.high_Energy__c!=null &&
              this.high_Energy__c.equals(other.getHigh_Energy__c()))) &&
            ((this.high_Level_Understanding_of_Data__c==null && other.getHigh_Level_Understanding_of_Data__c()==null) || 
             (this.high_Level_Understanding_of_Data__c!=null &&
              this.high_Level_Understanding_of_Data__c.equals(other.getHigh_Level_Understanding_of_Data__c()))) &&
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
            ((this.how_Keywords_Intersect_with_Custodians__c==null && other.getHow_Keywords_Intersect_with_Custodians__c()==null) || 
             (this.how_Keywords_Intersect_with_Custodians__c!=null &&
              this.how_Keywords_Intersect_with_Custodians__c.equals(other.getHow_Keywords_Intersect_with_Custodians__c()))) &&
            ((this.in_Line_Concept_Search__c==null && other.getIn_Line_Concept_Search__c()==null) || 
             (this.in_Line_Concept_Search__c!=null &&
              this.in_Line_Concept_Search__c.equals(other.getIn_Line_Concept_Search__c()))) &&
            ((this.intro_Painting_the_Picture__c==null && other.getIntro_Painting_the_Picture__c()==null) || 
             (this.intro_Painting_the_Picture__c!=null &&
              this.intro_Painting_the_Picture__c.equals(other.getIntro_Painting_the_Picture__c()))) &&
            ((this.intro_to_Relativity_Pivot__c==null && other.getIntro_to_Relativity_Pivot__c()==null) || 
             (this.intro_to_Relativity_Pivot__c!=null &&
              this.intro_to_Relativity_Pivot__c.equals(other.getIntro_to_Relativity_Pivot__c()))) &&
            ((this.introduction__c==null && other.getIntroduction__c()==null) || 
             (this.introduction__c!=null &&
              this.introduction__c.equals(other.getIntroduction__c()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.keyword_Expansion__c==null && other.getKeyword_Expansion__c()==null) || 
             (this.keyword_Expansion__c!=null &&
              this.keyword_Expansion__c.equals(other.getKeyword_Expansion__c()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.layouts__c==null && other.getLayouts__c()==null) || 
             (this.layouts__c!=null &&
              this.layouts__c.equals(other.getLayouts__c()))) &&
            ((this.mouse_Movements__c==null && other.getMouse_Movements__c()==null) || 
             (this.mouse_Movements__c!=null &&
              this.mouse_Movements__c.equals(other.getMouse_Movements__c()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.native_Files_1St_email__c==null && other.getNative_Files_1St_email__c()==null) || 
             (this.native_Files_1St_email__c!=null &&
              this.native_Files_1St_email__c.equals(other.getNative_Files_1St_email__c()))) &&
            ((this.native_Files_Other__c==null && other.getNative_Files_Other__c()==null) || 
             (this.native_Files_Other__c!=null &&
              this.native_Files_Other__c.equals(other.getNative_Files_Other__c()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.orange_Round_Categorization_Snapshot__c==null && other.getOrange_Round_Categorization_Snapshot__c()==null) || 
             (this.orange_Round_Categorization_Snapshot__c!=null &&
              this.orange_Round_Categorization_Snapshot__c.equals(other.getOrange_Round_Categorization_Snapshot__c()))) &&
            ((this.orange_Round_Coding__c==null && other.getOrange_Round_Coding__c()==null) || 
             (this.orange_Round_Coding__c!=null &&
              this.orange_Round_Coding__c.equals(other.getOrange_Round_Coding__c()))) &&
            ((this.orange_Round_Create_Sample_Set__c==null && other.getOrange_Round_Create_Sample_Set__c()==null) || 
             (this.orange_Round_Create_Sample_Set__c!=null &&
              this.orange_Round_Create_Sample_Set__c.equals(other.getOrange_Round_Create_Sample_Set__c()))) &&
            ((this.pass_Fail__c==null && other.getPass_Fail__c()==null) || 
             (this.pass_Fail__c!=null &&
              this.pass_Fail__c.equals(other.getPass_Fail__c()))) &&
            ((this.passing_Score_Analytics__c==null && other.getPassing_Score_Analytics__c()==null) || 
             (this.passing_Score_Analytics__c!=null &&
              this.passing_Score_Analytics__c.equals(other.getPassing_Score_Analytics__c()))) &&
            ((this.passing_Score_Fact_Manager__c==null && other.getPassing_Score_Fact_Manager__c()==null) || 
             (this.passing_Score_Fact_Manager__c!=null &&
              this.passing_Score_Fact_Manager__c.equals(other.getPassing_Score_Fact_Manager__c()))) &&
            ((this.passing_Score_Pivot__c==null && other.getPassing_Score_Pivot__c()==null) || 
             (this.passing_Score_Pivot__c!=null &&
              this.passing_Score_Pivot__c.equals(other.getPassing_Score_Pivot__c()))) &&
            ((this.passing_Score_RAR__c==null && other.getPassing_Score_RAR__c()==null) || 
             (this.passing_Score_RAR__c!=null &&
              this.passing_Score_RAR__c.equals(other.getPassing_Score_RAR__c()))) &&
            ((this.passing_Score_Standard__c==null && other.getPassing_Score_Standard__c()==null) || 
             (this.passing_Score_Standard__c!=null &&
              this.passing_Score_Standard__c.equals(other.getPassing_Score_Standard__c()))) &&
            ((this.presentation_Comments__c==null && other.getPresentation_Comments__c()==null) || 
             (this.presentation_Comments__c!=null &&
              this.presentation_Comments__c.equals(other.getPresentation_Comments__c()))) &&
            ((this.presentation_Total_Final__c==null && other.getPresentation_Total_Final__c()==null) || 
             (this.presentation_Total_Final__c!=null &&
              this.presentation_Total_Final__c.equals(other.getPresentation_Total_Final__c()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.QC_Reviewer_Accuracy__c==null && other.getQC_Reviewer_Accuracy__c()==null) || 
             (this.QC_Reviewer_Accuracy__c!=null &&
              this.QC_Reviewer_Accuracy__c.equals(other.getQC_Reviewer_Accuracy__c()))) &&
            ((this.QC_Round_Categorization_Snapshot__c==null && other.getQC_Round_Categorization_Snapshot__c()==null) || 
             (this.QC_Round_Categorization_Snapshot__c!=null &&
              this.QC_Round_Categorization_Snapshot__c.equals(other.getQC_Round_Categorization_Snapshot__c()))) &&
            ((this.QC_Round_Coding__c==null && other.getQC_Round_Coding__c()==null) || 
             (this.QC_Round_Coding__c!=null &&
              this.QC_Round_Coding__c.equals(other.getQC_Round_Coding__c()))) &&
            ((this.QC_Round_Create_Sample_Set__c==null && other.getQC_Round_Create_Sample_Set__c()==null) || 
             (this.QC_Round_Create_Sample_Set__c!=null &&
              this.QC_Round_Create_Sample_Set__c.equals(other.getQC_Round_Create_Sample_Set__c()))) &&
            ((this.qualifying_Questions_Intro_Security__c==null && other.getQualifying_Questions_Intro_Security__c()==null) || 
             (this.qualifying_Questions_Intro_Security__c!=null &&
              this.qualifying_Questions_Intro_Security__c.equals(other.getQualifying_Questions_Intro_Security__c()))) &&
            ((this.qualifying_Questions_Intro_to_Workspace__c==null && other.getQualifying_Questions_Intro_to_Workspace__c()==null) || 
             (this.qualifying_Questions_Intro_to_Workspace__c!=null &&
              this.qualifying_Questions_Intro_to_Workspace__c.equals(other.getQualifying_Questions_Intro_to_Workspace__c()))) &&
            ((this.qualifying_Questions__c==null && other.getQualifying_Questions__c()==null) || 
             (this.qualifying_Questions__c!=null &&
              this.qualifying_Questions__c.equals(other.getQualifying_Questions__c()))) &&
            ((this.question_1__c==null && other.getQuestion_1__c()==null) || 
             (this.question_1__c!=null &&
              this.question_1__c.equals(other.getQuestion_1__c()))) &&
            ((this.question_2__c==null && other.getQuestion_2__c()==null) || 
             (this.question_2__c!=null &&
              this.question_2__c.equals(other.getQuestion_2__c()))) &&
            ((this.question_3__c==null && other.getQuestion_3__c()==null) || 
             (this.question_3__c!=null &&
              this.question_3__c.equals(other.getQuestion_3__c()))) &&
            ((this.question_4__c==null && other.getQuestion_4__c()==null) || 
             (this.question_4__c!=null &&
              this.question_4__c.equals(other.getQuestion_4__c()))) &&
            ((this.question_5__c==null && other.getQuestion_5__c()==null) || 
             (this.question_5__c!=null &&
              this.question_5__c.equals(other.getQuestion_5__c()))) &&
            ((this.question_6__c==null && other.getQuestion_6__c()==null) || 
             (this.question_6__c!=null &&
              this.question_6__c.equals(other.getQuestion_6__c()))) &&
            ((this.question_Libraries__c==null && other.getQuestion_Libraries__c()==null) || 
             (this.question_Libraries__c!=null &&
              this.question_Libraries__c.equals(other.getQuestion_Libraries__c()))) &&
            ((this.questions_Total__c==null && other.getQuestions_Total__c()==null) || 
             (this.questions_Total__c!=null &&
              this.questions_Total__c.equals(other.getQuestions_Total__c()))) &&
            ((this.quiz_Pass_Fail__c==null && other.getQuiz_Pass_Fail__c()==null) || 
             (this.quiz_Pass_Fail__c!=null &&
              this.quiz_Pass_Fail__c.equals(other.getQuiz_Pass_Fail__c()))) &&
            ((this.RCE_Credits__r==null && other.getRCE_Credits__r()==null) || 
             (this.RCE_Credits__r!=null &&
              this.RCE_Credits__r.equals(other.getRCE_Credits__r()))) &&
            ((this.recordType==null && other.getRecordType()==null) || 
             (this.recordType!=null &&
              this.recordType.equals(other.getRecordType()))) &&
            ((this.recordTypeId==null && other.getRecordTypeId()==null) || 
             (this.recordTypeId!=null &&
              this.recordTypeId.equals(other.getRecordTypeId()))) &&
            ((this.related_Items__c==null && other.getRelated_Items__c()==null) || 
             (this.related_Items__c!=null &&
              this.related_Items__c.equals(other.getRelated_Items__c()))) &&
            ((this.report_Sets__c==null && other.getReport_Sets__c()==null) || 
             (this.report_Sets__c!=null &&
              this.report_Sets__c.equals(other.getReport_Sets__c()))) &&
            ((this.searching_Advanced__c==null && other.getSearching_Advanced__c()==null) || 
             (this.searching_Advanced__c!=null &&
              this.searching_Advanced__c.equals(other.getSearching_Advanced__c()))) &&
            ((this.searching_Basic__c==null && other.getSearching_Basic__c()==null) || 
             (this.searching_Basic__c!=null &&
              this.searching_Basic__c.equals(other.getSearching_Basic__c()))) &&
            ((this.similar_Document_Detection__c==null && other.getSimilar_Document_Detection__c()==null) || 
             (this.similar_Document_Detection__c!=null &&
              this.similar_Document_Detection__c.equals(other.getSimilar_Document_Detection__c()))) &&
            ((this.similar_Document_Groupings__c==null && other.getSimilar_Document_Groupings__c()==null) || 
             (this.similar_Document_Groupings__c!=null &&
              this.similar_Document_Groupings__c.equals(other.getSimilar_Document_Groupings__c()))) &&
            ((this.summary__c==null && other.getSummary__c()==null) || 
             (this.summary__c!=null &&
              this.summary__c.equals(other.getSummary__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.TIFFing_Redacting_Markup_Sets__c==null && other.getTIFFing_Redacting_Markup_Sets__c()==null) || 
             (this.TIFFing_Redacting_Markup_Sets__c!=null &&
              this.TIFFing_Redacting_Markup_Sets__c.equals(other.getTIFFing_Redacting_Markup_Sets__c()))) &&
            ((this.tier_1_Reviewer_using_Reviewer2__c==null && other.getTier_1_Reviewer_using_Reviewer2__c()==null) || 
             (this.tier_1_Reviewer_using_Reviewer2__c!=null &&
              this.tier_1_Reviewer_using_Reviewer2__c.equals(other.getTier_1_Reviewer_using_Reviewer2__c()))) &&
            ((this.time__c==null && other.getTime__c()==null) || 
             (this.time__c!=null &&
              this.time__c.equals(other.getTime__c()))) &&
            ((this.total_Command__c==null && other.getTotal_Command__c()==null) || 
             (this.total_Command__c!=null &&
              this.total_Command__c.equals(other.getTotal_Command__c()))) &&
            ((this.total_Presentation__c==null && other.getTotal_Presentation__c()==null) || 
             (this.total_Presentation__c!=null &&
              this.total_Presentation__c.equals(other.getTotal_Presentation__c()))) &&
            ((this.total_Questions__c==null && other.getTotal_Questions__c()==null) || 
             (this.total_Questions__c!=null &&
              this.total_Questions__c.equals(other.getTotal_Questions__c()))) &&
            ((this.views_Mass_Actions__c==null && other.getViews_Mass_Actions__c()==null) || 
             (this.views_Mass_Actions__c!=null &&
              this.views_Mass_Actions__c.equals(other.getViews_Mass_Actions__c())));
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
        if (getAccuracy_of_Answers__c() != null) {
            _hashCode += getAccuracy_of_Answers__c().hashCode();
        }
        if (getAnswer_1__c() != null) {
            _hashCode += getAnswer_1__c().hashCode();
        }
        if (getAnswer_2__c() != null) {
            _hashCode += getAnswer_2__c().hashCode();
        }
        if (getAnswer_3__c() != null) {
            _hashCode += getAnswer_3__c().hashCode();
        }
        if (getAnswer_4__c() != null) {
            _hashCode += getAnswer_4__c().hashCode();
        }
        if (getAnswer_5__c() != null) {
            _hashCode += getAnswer_5__c().hashCode();
        }
        if (getAnswer_6__c() != null) {
            _hashCode += getAnswer_6__c().hashCode();
        }
        if (getAppropriate_Screen_Resolution_Use_of_F11__c() != null) {
            _hashCode += getAppropriate_Screen_Resolution_Use_of_F11__c().hashCode();
        }
        if (getAssisted_Review_Overview_Pivot_Profile__c() != null) {
            _hashCode += getAssisted_Review_Overview_Pivot_Profile__c().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getBrowsing_Case_Folders_Choice_Tree__c() != null) {
            _hashCode += getBrowsing_Case_Folders_Choice_Tree__c().hashCode();
        }
        if (getCase_List__c() != null) {
            _hashCode += getCase_List__c().hashCode();
        }
        if (getCase_Workspace__c() != null) {
            _hashCode += getCase_Workspace__c().hashCode();
        }
        if (getCategorization__c() != null) {
            _hashCode += getCategorization__c().hashCode();
        }
        if (getCategory_Overturn_Reports__c() != null) {
            _hashCode += getCategory_Overturn_Reports__c().hashCode();
        }
        if (getCertification_Contacts__r() != null) {
            _hashCode += getCertification_Contacts__r().hashCode();
        }
        if (getCertification_Type__c() != null) {
            _hashCode += getCertification_Type__c().hashCode();
        }
        if (getCertification_Type__r() != null) {
            _hashCode += getCertification_Type__r().hashCode();
        }
        if (getClustering__c() != null) {
            _hashCode += getClustering__c().hashCode();
        }
        if (getCommand_Comments__c() != null) {
            _hashCode += getCommand_Comments__c().hashCode();
        }
        if (getCommand_Total__c() != null) {
            _hashCode += getCommand_Total__c().hashCode();
        }
        if (getComments_10__c() != null) {
            _hashCode += getComments_10__c().hashCode();
        }
        if (getComments_11__c() != null) {
            _hashCode += getComments_11__c().hashCode();
        }
        if (getComments_12__c() != null) {
            _hashCode += getComments_12__c().hashCode();
        }
        if (getComments_13__c() != null) {
            _hashCode += getComments_13__c().hashCode();
        }
        if (getComments_14__c() != null) {
            _hashCode += getComments_14__c().hashCode();
        }
        if (getComments_15__c() != null) {
            _hashCode += getComments_15__c().hashCode();
        }
        if (getComments_16__c() != null) {
            _hashCode += getComments_16__c().hashCode();
        }
        if (getComments_17__c() != null) {
            _hashCode += getComments_17__c().hashCode();
        }
        if (getComments_18__c() != null) {
            _hashCode += getComments_18__c().hashCode();
        }
        if (getComments_19__c() != null) {
            _hashCode += getComments_19__c().hashCode();
        }
        if (getComments_1__c() != null) {
            _hashCode += getComments_1__c().hashCode();
        }
        if (getComments_20__c() != null) {
            _hashCode += getComments_20__c().hashCode();
        }
        if (getComments_21__c() != null) {
            _hashCode += getComments_21__c().hashCode();
        }
        if (getComments_22__c() != null) {
            _hashCode += getComments_22__c().hashCode();
        }
        if (getComments_23__c() != null) {
            _hashCode += getComments_23__c().hashCode();
        }
        if (getComments_2__c() != null) {
            _hashCode += getComments_2__c().hashCode();
        }
        if (getComments_3__c() != null) {
            _hashCode += getComments_3__c().hashCode();
        }
        if (getComments_4__c() != null) {
            _hashCode += getComments_4__c().hashCode();
        }
        if (getComments_5__c() != null) {
            _hashCode += getComments_5__c().hashCode();
        }
        if (getComments_6__c() != null) {
            _hashCode += getComments_6__c().hashCode();
        }
        if (getComments_7__c() != null) {
            _hashCode += getComments_7__c().hashCode();
        }
        if (getComments_8__c() != null) {
            _hashCode += getComments_8__c().hashCode();
        }
        if (getComments_9__c() != null) {
            _hashCode += getComments_9__c().hashCode();
        }
        if (getComments__c() != null) {
            _hashCode += getComments__c().hashCode();
        }
        if (getConnects_Features_to_Workflow_Value__c() != null) {
            _hashCode += getConnects_Features_to_Workflow_Value__c().hashCode();
        }
        if (getContact__c() != null) {
            _hashCode += getContact__c().hashCode();
        }
        if (getContact__r() != null) {
            _hashCode += getContact__r().hashCode();
        }
        if (getCorrect_1__c() != null) {
            _hashCode += getCorrect_1__c().hashCode();
        }
        if (getCorrect_2__c() != null) {
            _hashCode += getCorrect_2__c().hashCode();
        }
        if (getCorrect_3__c() != null) {
            _hashCode += getCorrect_3__c().hashCode();
        }
        if (getCorrect_4__c() != null) {
            _hashCode += getCorrect_4__c().hashCode();
        }
        if (getCorrect_5__c() != null) {
            _hashCode += getCorrect_5__c().hashCode();
        }
        if (getCorrect_6__c() != null) {
            _hashCode += getCorrect_6__c().hashCode();
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
        if (getCreating_Facts_on_the_Fly__c() != null) {
            _hashCode += getCreating_Facts_on_the_Fly__c().hashCode();
        }
        if (getDate__c() != null) {
            _hashCode += getDate__c().hashCode();
        }
        if (getDemo_Presented__c() != null) {
            _hashCode += getDemo_Presented__c().hashCode();
        }
        if (getDemo_Presented__r() != null) {
            _hashCode += getDemo_Presented__r().hashCode();
        }
        if (getDemo_Type__c() != null) {
            _hashCode += getDemo_Type__c().hashCode();
        }
        if (getDeposition_Preparation__c() != null) {
            _hashCode += getDeposition_Preparation__c().hashCode();
        }
        if (getDomain_Filtering_and_Data_Culling__c() != null) {
            _hashCode += getDomain_Filtering_and_Data_Culling__c().hashCode();
        }
        if (getEfficiency_of_Answers__c() != null) {
            _hashCode += getEfficiency_of_Answers__c().hashCode();
        }
        if (getEngaging_Asks_Questions__c() != null) {
            _hashCode += getEngaging_Asks_Questions__c().hashCode();
        }
        if (getExam_Score__c() != null) {
            _hashCode += getExam_Score__c().hashCode();
        }
        if (getFact_Library_Manually_Entering_a_Fact__c() != null) {
            _hashCode += getFact_Library_Manually_Entering_a_Fact__c().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getFinal_Score__c() != null) {
            _hashCode += getFinal_Score__c().hashCode();
        }
        if (getHigh_Energy__c() != null) {
            _hashCode += getHigh_Energy__c().hashCode();
        }
        if (getHigh_Level_Understanding_of_Data__c() != null) {
            _hashCode += getHigh_Level_Understanding_of_Data__c().hashCode();
        }
        if (getHistories() != null) {
            _hashCode += getHistories().hashCode();
        }
        if (getHow_Keywords_Intersect_with_Custodians__c() != null) {
            _hashCode += getHow_Keywords_Intersect_with_Custodians__c().hashCode();
        }
        if (getIn_Line_Concept_Search__c() != null) {
            _hashCode += getIn_Line_Concept_Search__c().hashCode();
        }
        if (getIntro_Painting_the_Picture__c() != null) {
            _hashCode += getIntro_Painting_the_Picture__c().hashCode();
        }
        if (getIntro_to_Relativity_Pivot__c() != null) {
            _hashCode += getIntro_to_Relativity_Pivot__c().hashCode();
        }
        if (getIntroduction__c() != null) {
            _hashCode += getIntroduction__c().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getKeyword_Expansion__c() != null) {
            _hashCode += getKeyword_Expansion__c().hashCode();
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
        if (getLayouts__c() != null) {
            _hashCode += getLayouts__c().hashCode();
        }
        if (getMouse_Movements__c() != null) {
            _hashCode += getMouse_Movements__c().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNative_Files_1St_email__c() != null) {
            _hashCode += getNative_Files_1St_email__c().hashCode();
        }
        if (getNative_Files_Other__c() != null) {
            _hashCode += getNative_Files_Other__c().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getNotesAndAttachments() != null) {
            _hashCode += getNotesAndAttachments().hashCode();
        }
        if (getOrange_Round_Categorization_Snapshot__c() != null) {
            _hashCode += getOrange_Round_Categorization_Snapshot__c().hashCode();
        }
        if (getOrange_Round_Coding__c() != null) {
            _hashCode += getOrange_Round_Coding__c().hashCode();
        }
        if (getOrange_Round_Create_Sample_Set__c() != null) {
            _hashCode += getOrange_Round_Create_Sample_Set__c().hashCode();
        }
        if (getPass_Fail__c() != null) {
            _hashCode += getPass_Fail__c().hashCode();
        }
        if (getPassing_Score_Analytics__c() != null) {
            _hashCode += getPassing_Score_Analytics__c().hashCode();
        }
        if (getPassing_Score_Fact_Manager__c() != null) {
            _hashCode += getPassing_Score_Fact_Manager__c().hashCode();
        }
        if (getPassing_Score_Pivot__c() != null) {
            _hashCode += getPassing_Score_Pivot__c().hashCode();
        }
        if (getPassing_Score_RAR__c() != null) {
            _hashCode += getPassing_Score_RAR__c().hashCode();
        }
        if (getPassing_Score_Standard__c() != null) {
            _hashCode += getPassing_Score_Standard__c().hashCode();
        }
        if (getPresentation_Comments__c() != null) {
            _hashCode += getPresentation_Comments__c().hashCode();
        }
        if (getPresentation_Total_Final__c() != null) {
            _hashCode += getPresentation_Total_Final__c().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getQC_Reviewer_Accuracy__c() != null) {
            _hashCode += getQC_Reviewer_Accuracy__c().hashCode();
        }
        if (getQC_Round_Categorization_Snapshot__c() != null) {
            _hashCode += getQC_Round_Categorization_Snapshot__c().hashCode();
        }
        if (getQC_Round_Coding__c() != null) {
            _hashCode += getQC_Round_Coding__c().hashCode();
        }
        if (getQC_Round_Create_Sample_Set__c() != null) {
            _hashCode += getQC_Round_Create_Sample_Set__c().hashCode();
        }
        if (getQualifying_Questions_Intro_Security__c() != null) {
            _hashCode += getQualifying_Questions_Intro_Security__c().hashCode();
        }
        if (getQualifying_Questions_Intro_to_Workspace__c() != null) {
            _hashCode += getQualifying_Questions_Intro_to_Workspace__c().hashCode();
        }
        if (getQualifying_Questions__c() != null) {
            _hashCode += getQualifying_Questions__c().hashCode();
        }
        if (getQuestion_1__c() != null) {
            _hashCode += getQuestion_1__c().hashCode();
        }
        if (getQuestion_2__c() != null) {
            _hashCode += getQuestion_2__c().hashCode();
        }
        if (getQuestion_3__c() != null) {
            _hashCode += getQuestion_3__c().hashCode();
        }
        if (getQuestion_4__c() != null) {
            _hashCode += getQuestion_4__c().hashCode();
        }
        if (getQuestion_5__c() != null) {
            _hashCode += getQuestion_5__c().hashCode();
        }
        if (getQuestion_6__c() != null) {
            _hashCode += getQuestion_6__c().hashCode();
        }
        if (getQuestion_Libraries__c() != null) {
            _hashCode += getQuestion_Libraries__c().hashCode();
        }
        if (getQuestions_Total__c() != null) {
            _hashCode += getQuestions_Total__c().hashCode();
        }
        if (getQuiz_Pass_Fail__c() != null) {
            _hashCode += getQuiz_Pass_Fail__c().hashCode();
        }
        if (getRCE_Credits__r() != null) {
            _hashCode += getRCE_Credits__r().hashCode();
        }
        if (getRecordType() != null) {
            _hashCode += getRecordType().hashCode();
        }
        if (getRecordTypeId() != null) {
            _hashCode += getRecordTypeId().hashCode();
        }
        if (getRelated_Items__c() != null) {
            _hashCode += getRelated_Items__c().hashCode();
        }
        if (getReport_Sets__c() != null) {
            _hashCode += getReport_Sets__c().hashCode();
        }
        if (getSearching_Advanced__c() != null) {
            _hashCode += getSearching_Advanced__c().hashCode();
        }
        if (getSearching_Basic__c() != null) {
            _hashCode += getSearching_Basic__c().hashCode();
        }
        if (getSimilar_Document_Detection__c() != null) {
            _hashCode += getSimilar_Document_Detection__c().hashCode();
        }
        if (getSimilar_Document_Groupings__c() != null) {
            _hashCode += getSimilar_Document_Groupings__c().hashCode();
        }
        if (getSummary__c() != null) {
            _hashCode += getSummary__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTIFFing_Redacting_Markup_Sets__c() != null) {
            _hashCode += getTIFFing_Redacting_Markup_Sets__c().hashCode();
        }
        if (getTier_1_Reviewer_using_Reviewer2__c() != null) {
            _hashCode += getTier_1_Reviewer_using_Reviewer2__c().hashCode();
        }
        if (getTime__c() != null) {
            _hashCode += getTime__c().hashCode();
        }
        if (getTotal_Command__c() != null) {
            _hashCode += getTotal_Command__c().hashCode();
        }
        if (getTotal_Presentation__c() != null) {
            _hashCode += getTotal_Presentation__c().hashCode();
        }
        if (getTotal_Questions__c() != null) {
            _hashCode += getTotal_Questions__c().hashCode();
        }
        if (getViews_Mass_Actions__c() != null) {
            _hashCode += getViews_Mass_Actions__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Demo_Certification__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Demo_Certification__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accuracy_of_Answers__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Accuracy_of_Answers__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answer_1__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Answer_1__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answer_2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Answer_2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answer_3__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Answer_3__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answer_4__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Answer_4__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answer_5__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Answer_5__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answer_6__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Answer_6__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appropriate_Screen_Resolution_Use_of_F11__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Appropriate_Screen_Resolution_Use_of_F11__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assisted_Review_Overview_Pivot_Profile__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Assisted_Review_Overview_Pivot_Profile__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("browsing_Case_Folders_Choice_Tree__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Browsing_Case_Folders_Choice_Tree__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("case_List__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case_List__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("case_Workspace__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case_Workspace__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categorization__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Categorization__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category_Overturn_Reports__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Category_Overturn_Reports__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("clustering__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Clustering__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("command_Comments__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Command_Comments__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("command_Total__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Command_Total__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments_10__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Comments_10__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments_11__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Comments_11__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments_12__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Comments_12__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments_13__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Comments_13__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments_14__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Comments_14__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments_15__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Comments_15__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments_16__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Comments_16__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments_17__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Comments_17__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments_18__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Comments_18__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments_19__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Comments_19__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments_1__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Comments_1__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments_20__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Comments_20__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments_21__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Comments_21__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments_22__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Comments_22__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments_23__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Comments_23__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments_2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Comments_2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments_3__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Comments_3__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments_4__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Comments_4__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments_5__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Comments_5__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments_6__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Comments_6__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments_7__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Comments_7__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments_8__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Comments_8__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments_9__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Comments_9__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("connects_Features_to_Workflow_Value__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Connects_Features_to_Workflow_Value__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("correct_1__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Correct_1__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correct_2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Correct_2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correct_3__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Correct_3__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correct_4__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Correct_4__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correct_5__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Correct_5__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correct_6__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Correct_6__c"));
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
        elemField.setFieldName("creating_Facts_on_the_Fly__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Creating_Facts_on_the_Fly__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("demo_Presented__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Demo_Presented__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("demo_Presented__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Demo_Presented__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Demo_Cert_Presentation__c"));
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
        elemField.setFieldName("deposition_Preparation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Deposition_Preparation__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain_Filtering_and_Data_Culling__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Domain_Filtering_and_Data_Culling__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("efficiency_of_Answers__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Efficiency_of_Answers__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("engaging_Asks_Questions__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Engaging_Asks_Questions__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exam_Score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Exam_Score__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fact_Library_Manually_Entering_a_Fact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fact_Library_Manually_Entering_a_Fact__c"));
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
        elemField.setFieldName("final_Score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Final_Score__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("high_Energy__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "High_Energy__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("high_Level_Understanding_of_Data__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "High_Level_Understanding_of_Data__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("how_Keywords_Intersect_with_Custodians__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "How_Keywords_Intersect_with_Custodians__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("in_Line_Concept_Search__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "In_Line_Concept_Search__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intro_Painting_the_Picture__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Intro_Painting_the_Picture__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intro_to_Relativity_Pivot__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Intro_to_Relativity_Pivot__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("introduction__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Introduction__c"));
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
        elemField.setFieldName("keyword_Expansion__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Keyword_Expansion__c"));
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
        elemField.setFieldName("layouts__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Layouts__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mouse_Movements__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Mouse_Movements__c"));
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
        elemField.setFieldName("native_Files_1St_email__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Native_Files_1st_email__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("native_Files_Other__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Native_Files_Other__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("orange_Round_Categorization_Snapshot__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Orange_Round_Categorization_Snapshot__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orange_Round_Coding__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Orange_Round_Coding__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orange_Round_Create_Sample_Set__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Orange_Round_Create_Sample_Set__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pass_Fail__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pass_Fail__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passing_Score_Analytics__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Passing_Score_Analytics__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passing_Score_Fact_Manager__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Passing_Score_Fact_Manager__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passing_Score_Pivot__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Passing_Score_Pivot__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passing_Score_RAR__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Passing_Score_RAR__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passing_Score_Standard__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Passing_Score_Standard__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presentation_Comments__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Presentation_Comments__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presentation_Total_Final__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Presentation_Total_Final__c"));
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
        elemField.setFieldName("QC_Reviewer_Accuracy__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "QC_Reviewer_Accuracy__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QC_Round_Categorization_Snapshot__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "QC_Round_Categorization_Snapshot__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QC_Round_Coding__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "QC_Round_Coding__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QC_Round_Create_Sample_Set__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "QC_Round_Create_Sample_Set__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualifying_Questions_Intro_Security__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Qualifying_Questions_Intro_Security__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualifying_Questions_Intro_to_Workspace__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Qualifying_Questions_Intro_to_Workspace__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualifying_Questions__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Qualifying_Questions__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("question_1__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Question_1__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("question_2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Question_2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("question_3__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Question_3__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("question_4__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Question_4__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("question_5__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Question_5__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("question_6__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Question_6__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("question_Libraries__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Question_Libraries__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questions_Total__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Questions_Total__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quiz_Pass_Fail__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Quiz_Pass_Fail__c"));
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
        elemField.setFieldName("related_Items__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Related_Items__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("report_Sets__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Report_Sets__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searching_Advanced__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Searching_Advanced__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searching_Basic__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Searching_Basic__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("similar_Document_Detection__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Similar_Document_Detection__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("similar_Document_Groupings__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Similar_Document_Groupings__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summary__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Summary__c"));
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
        elemField.setFieldName("TIFFing_Redacting_Markup_Sets__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TIFFing_Redacting_Markup_Sets__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tier_1_Reviewer_using_Reviewer2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tier_1_Reviewer_using_Reviewer2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Time__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_Command__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Total_Command__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_Presentation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Total_Presentation__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_Questions__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Total_Questions__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("views_Mass_Actions__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Views_Mass_Actions__c"));
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

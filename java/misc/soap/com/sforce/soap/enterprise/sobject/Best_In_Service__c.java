/**
 * Best_In_Service__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Best_In_Service__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String account__c;

    private com.sforce.soap.enterprise.sobject.Account account__r;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.util.Date due_Date__c;

    private java.lang.String ease_of_Contact__c;

    private java.lang.String email__c;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.lang.String future_Engagement__c;

    private java.lang.Boolean isDeleted;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private java.lang.String oldCommunication_Skills__c;

    private java.lang.String oldDeadlines_Met__c;

    private java.lang.String oldDetail_Oriented__c;

    private java.lang.String oldEase_of_Contact_Project__c;

    private java.lang.String oldEase_of_Contact_Sales__c;

    private java.lang.String oldEase_of_Rollout__c;

    private java.lang.String oldFlexibility_Adaptibility__c;

    private java.lang.String oldFuture_Engagements__c;

    private java.lang.String oldProblem_Solving__c;

    private java.lang.String oldProduct_Knowledge_Sales__c;

    private java.lang.String oldProfessional_Behavior_Project__c;

    private java.lang.String oldProfessional_Behavior_Sales__c;

    private java.lang.String oldService_Oriented_Project__c;

    private java.lang.String oldService_Oriented_Sales__c;

    private java.lang.String oldShare_With_Service_Provider__c;

    private java.lang.Double oldSurvey_Score__c;

    private java.lang.String oldTechnical_Service_Availability__c;

    private java.lang.String oldTechnical_Skills_Other__c;

    private java.lang.String oldTechnical_Skills_Relativity__c;

    private java.lang.String oldTime_Management__c;

    private java.lang.String oldWork_Product_Quality__c;

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private java.lang.String phone__c;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.String product_Knowledge__c;

    private java.lang.String professional_Behavior__c;

    private java.lang.Double q10__c;

    private java.lang.Double q11__c;

    private java.lang.Double q12__c;

    private java.lang.Double q13__c;

    private java.lang.Double q14__c;

    private java.lang.Double q15__c;

    private java.lang.Double q16__c;

    private java.lang.Double q17__c;

    private java.lang.Double q18__c;

    private java.lang.Double q19__c;

    private java.lang.Double q1__c;

    private java.lang.Double q2__c;

    private java.lang.Double q3__c;

    private java.lang.Double q4__c;

    private java.lang.Double q5__c;

    private java.lang.Double q6__c;

    private java.lang.Double q7__c;

    private java.lang.Double q8__c;

    private java.lang.Double q9__c;

    private java.lang.String reference_Name__c;

    private java.lang.Boolean send_Reminder_Email__c;

    private java.lang.Boolean send_Survey__c;

    private java.lang.String service_Oriented__c;

    private java.util.Calendar systemModstamp;

    public Best_In_Service__c() {
    }

    public Best_In_Service__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String account__c,
           com.sforce.soap.enterprise.sobject.Account account__r,
           com.sforce.soap.enterprise.QueryResult attachments,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.util.Date due_Date__c,
           java.lang.String ease_of_Contact__c,
           java.lang.String email__c,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.lang.String future_Engagement__c,
           java.lang.Boolean isDeleted,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           java.lang.String oldCommunication_Skills__c,
           java.lang.String oldDeadlines_Met__c,
           java.lang.String oldDetail_Oriented__c,
           java.lang.String oldEase_of_Contact_Project__c,
           java.lang.String oldEase_of_Contact_Sales__c,
           java.lang.String oldEase_of_Rollout__c,
           java.lang.String oldFlexibility_Adaptibility__c,
           java.lang.String oldFuture_Engagements__c,
           java.lang.String oldProblem_Solving__c,
           java.lang.String oldProduct_Knowledge_Sales__c,
           java.lang.String oldProfessional_Behavior_Project__c,
           java.lang.String oldProfessional_Behavior_Sales__c,
           java.lang.String oldService_Oriented_Project__c,
           java.lang.String oldService_Oriented_Sales__c,
           java.lang.String oldShare_With_Service_Provider__c,
           java.lang.Double oldSurvey_Score__c,
           java.lang.String oldTechnical_Service_Availability__c,
           java.lang.String oldTechnical_Skills_Other__c,
           java.lang.String oldTechnical_Skills_Relativity__c,
           java.lang.String oldTime_Management__c,
           java.lang.String oldWork_Product_Quality__c,
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           java.lang.String phone__c,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.String product_Knowledge__c,
           java.lang.String professional_Behavior__c,
           java.lang.Double q10__c,
           java.lang.Double q11__c,
           java.lang.Double q12__c,
           java.lang.Double q13__c,
           java.lang.Double q14__c,
           java.lang.Double q15__c,
           java.lang.Double q16__c,
           java.lang.Double q17__c,
           java.lang.Double q18__c,
           java.lang.Double q19__c,
           java.lang.Double q1__c,
           java.lang.Double q2__c,
           java.lang.Double q3__c,
           java.lang.Double q4__c,
           java.lang.Double q5__c,
           java.lang.Double q6__c,
           java.lang.Double q7__c,
           java.lang.Double q8__c,
           java.lang.Double q9__c,
           java.lang.String reference_Name__c,
           java.lang.Boolean send_Reminder_Email__c,
           java.lang.Boolean send_Survey__c,
           java.lang.String service_Oriented__c,
           java.util.Calendar systemModstamp) {
        super(
            fieldsToNull,
            id);
        this.account__c = account__c;
        this.account__r = account__r;
        this.attachments = attachments;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.due_Date__c = due_Date__c;
        this.ease_of_Contact__c = ease_of_Contact__c;
        this.email__c = email__c;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.future_Engagement__c = future_Engagement__c;
        this.isDeleted = isDeleted;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.oldCommunication_Skills__c = oldCommunication_Skills__c;
        this.oldDeadlines_Met__c = oldDeadlines_Met__c;
        this.oldDetail_Oriented__c = oldDetail_Oriented__c;
        this.oldEase_of_Contact_Project__c = oldEase_of_Contact_Project__c;
        this.oldEase_of_Contact_Sales__c = oldEase_of_Contact_Sales__c;
        this.oldEase_of_Rollout__c = oldEase_of_Rollout__c;
        this.oldFlexibility_Adaptibility__c = oldFlexibility_Adaptibility__c;
        this.oldFuture_Engagements__c = oldFuture_Engagements__c;
        this.oldProblem_Solving__c = oldProblem_Solving__c;
        this.oldProduct_Knowledge_Sales__c = oldProduct_Knowledge_Sales__c;
        this.oldProfessional_Behavior_Project__c = oldProfessional_Behavior_Project__c;
        this.oldProfessional_Behavior_Sales__c = oldProfessional_Behavior_Sales__c;
        this.oldService_Oriented_Project__c = oldService_Oriented_Project__c;
        this.oldService_Oriented_Sales__c = oldService_Oriented_Sales__c;
        this.oldShare_With_Service_Provider__c = oldShare_With_Service_Provider__c;
        this.oldSurvey_Score__c = oldSurvey_Score__c;
        this.oldTechnical_Service_Availability__c = oldTechnical_Service_Availability__c;
        this.oldTechnical_Skills_Other__c = oldTechnical_Skills_Other__c;
        this.oldTechnical_Skills_Relativity__c = oldTechnical_Skills_Relativity__c;
        this.oldTime_Management__c = oldTime_Management__c;
        this.oldWork_Product_Quality__c = oldWork_Product_Quality__c;
        this.owner = owner;
        this.ownerId = ownerId;
        this.phone__c = phone__c;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.product_Knowledge__c = product_Knowledge__c;
        this.professional_Behavior__c = professional_Behavior__c;
        this.q10__c = q10__c;
        this.q11__c = q11__c;
        this.q12__c = q12__c;
        this.q13__c = q13__c;
        this.q14__c = q14__c;
        this.q15__c = q15__c;
        this.q16__c = q16__c;
        this.q17__c = q17__c;
        this.q18__c = q18__c;
        this.q19__c = q19__c;
        this.q1__c = q1__c;
        this.q2__c = q2__c;
        this.q3__c = q3__c;
        this.q4__c = q4__c;
        this.q5__c = q5__c;
        this.q6__c = q6__c;
        this.q7__c = q7__c;
        this.q8__c = q8__c;
        this.q9__c = q9__c;
        this.reference_Name__c = reference_Name__c;
        this.send_Reminder_Email__c = send_Reminder_Email__c;
        this.send_Survey__c = send_Survey__c;
        this.service_Oriented__c = service_Oriented__c;
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the account__c value for this Best_In_Service__c.
     * 
     * @return account__c
     */
    public java.lang.String getAccount__c() {
        return account__c;
    }


    /**
     * Sets the account__c value for this Best_In_Service__c.
     * 
     * @param account__c
     */
    public void setAccount__c(java.lang.String account__c) {
        this.account__c = account__c;
    }


    /**
     * Gets the account__r value for this Best_In_Service__c.
     * 
     * @return account__r
     */
    public com.sforce.soap.enterprise.sobject.Account getAccount__r() {
        return account__r;
    }


    /**
     * Sets the account__r value for this Best_In_Service__c.
     * 
     * @param account__r
     */
    public void setAccount__r(com.sforce.soap.enterprise.sobject.Account account__r) {
        this.account__r = account__r;
    }


    /**
     * Gets the attachments value for this Best_In_Service__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Best_In_Service__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the createdBy value for this Best_In_Service__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Best_In_Service__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Best_In_Service__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Best_In_Service__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Best_In_Service__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Best_In_Service__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the due_Date__c value for this Best_In_Service__c.
     * 
     * @return due_Date__c
     */
    public java.util.Date getDue_Date__c() {
        return due_Date__c;
    }


    /**
     * Sets the due_Date__c value for this Best_In_Service__c.
     * 
     * @param due_Date__c
     */
    public void setDue_Date__c(java.util.Date due_Date__c) {
        this.due_Date__c = due_Date__c;
    }


    /**
     * Gets the ease_of_Contact__c value for this Best_In_Service__c.
     * 
     * @return ease_of_Contact__c
     */
    public java.lang.String getEase_of_Contact__c() {
        return ease_of_Contact__c;
    }


    /**
     * Sets the ease_of_Contact__c value for this Best_In_Service__c.
     * 
     * @param ease_of_Contact__c
     */
    public void setEase_of_Contact__c(java.lang.String ease_of_Contact__c) {
        this.ease_of_Contact__c = ease_of_Contact__c;
    }


    /**
     * Gets the email__c value for this Best_In_Service__c.
     * 
     * @return email__c
     */
    public java.lang.String getEmail__c() {
        return email__c;
    }


    /**
     * Sets the email__c value for this Best_In_Service__c.
     * 
     * @param email__c
     */
    public void setEmail__c(java.lang.String email__c) {
        this.email__c = email__c;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Best_In_Service__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Best_In_Service__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the future_Engagement__c value for this Best_In_Service__c.
     * 
     * @return future_Engagement__c
     */
    public java.lang.String getFuture_Engagement__c() {
        return future_Engagement__c;
    }


    /**
     * Sets the future_Engagement__c value for this Best_In_Service__c.
     * 
     * @param future_Engagement__c
     */
    public void setFuture_Engagement__c(java.lang.String future_Engagement__c) {
        this.future_Engagement__c = future_Engagement__c;
    }


    /**
     * Gets the isDeleted value for this Best_In_Service__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Best_In_Service__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this Best_In_Service__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Best_In_Service__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Best_In_Service__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Best_In_Service__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Best_In_Service__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Best_In_Service__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this Best_In_Service__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Best_In_Service__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Best_In_Service__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Best_In_Service__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Best_In_Service__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Best_In_Service__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the oldCommunication_Skills__c value for this Best_In_Service__c.
     * 
     * @return oldCommunication_Skills__c
     */
    public java.lang.String getOldCommunication_Skills__c() {
        return oldCommunication_Skills__c;
    }


    /**
     * Sets the oldCommunication_Skills__c value for this Best_In_Service__c.
     * 
     * @param oldCommunication_Skills__c
     */
    public void setOldCommunication_Skills__c(java.lang.String oldCommunication_Skills__c) {
        this.oldCommunication_Skills__c = oldCommunication_Skills__c;
    }


    /**
     * Gets the oldDeadlines_Met__c value for this Best_In_Service__c.
     * 
     * @return oldDeadlines_Met__c
     */
    public java.lang.String getOldDeadlines_Met__c() {
        return oldDeadlines_Met__c;
    }


    /**
     * Sets the oldDeadlines_Met__c value for this Best_In_Service__c.
     * 
     * @param oldDeadlines_Met__c
     */
    public void setOldDeadlines_Met__c(java.lang.String oldDeadlines_Met__c) {
        this.oldDeadlines_Met__c = oldDeadlines_Met__c;
    }


    /**
     * Gets the oldDetail_Oriented__c value for this Best_In_Service__c.
     * 
     * @return oldDetail_Oriented__c
     */
    public java.lang.String getOldDetail_Oriented__c() {
        return oldDetail_Oriented__c;
    }


    /**
     * Sets the oldDetail_Oriented__c value for this Best_In_Service__c.
     * 
     * @param oldDetail_Oriented__c
     */
    public void setOldDetail_Oriented__c(java.lang.String oldDetail_Oriented__c) {
        this.oldDetail_Oriented__c = oldDetail_Oriented__c;
    }


    /**
     * Gets the oldEase_of_Contact_Project__c value for this Best_In_Service__c.
     * 
     * @return oldEase_of_Contact_Project__c
     */
    public java.lang.String getOldEase_of_Contact_Project__c() {
        return oldEase_of_Contact_Project__c;
    }


    /**
     * Sets the oldEase_of_Contact_Project__c value for this Best_In_Service__c.
     * 
     * @param oldEase_of_Contact_Project__c
     */
    public void setOldEase_of_Contact_Project__c(java.lang.String oldEase_of_Contact_Project__c) {
        this.oldEase_of_Contact_Project__c = oldEase_of_Contact_Project__c;
    }


    /**
     * Gets the oldEase_of_Contact_Sales__c value for this Best_In_Service__c.
     * 
     * @return oldEase_of_Contact_Sales__c
     */
    public java.lang.String getOldEase_of_Contact_Sales__c() {
        return oldEase_of_Contact_Sales__c;
    }


    /**
     * Sets the oldEase_of_Contact_Sales__c value for this Best_In_Service__c.
     * 
     * @param oldEase_of_Contact_Sales__c
     */
    public void setOldEase_of_Contact_Sales__c(java.lang.String oldEase_of_Contact_Sales__c) {
        this.oldEase_of_Contact_Sales__c = oldEase_of_Contact_Sales__c;
    }


    /**
     * Gets the oldEase_of_Rollout__c value for this Best_In_Service__c.
     * 
     * @return oldEase_of_Rollout__c
     */
    public java.lang.String getOldEase_of_Rollout__c() {
        return oldEase_of_Rollout__c;
    }


    /**
     * Sets the oldEase_of_Rollout__c value for this Best_In_Service__c.
     * 
     * @param oldEase_of_Rollout__c
     */
    public void setOldEase_of_Rollout__c(java.lang.String oldEase_of_Rollout__c) {
        this.oldEase_of_Rollout__c = oldEase_of_Rollout__c;
    }


    /**
     * Gets the oldFlexibility_Adaptibility__c value for this Best_In_Service__c.
     * 
     * @return oldFlexibility_Adaptibility__c
     */
    public java.lang.String getOldFlexibility_Adaptibility__c() {
        return oldFlexibility_Adaptibility__c;
    }


    /**
     * Sets the oldFlexibility_Adaptibility__c value for this Best_In_Service__c.
     * 
     * @param oldFlexibility_Adaptibility__c
     */
    public void setOldFlexibility_Adaptibility__c(java.lang.String oldFlexibility_Adaptibility__c) {
        this.oldFlexibility_Adaptibility__c = oldFlexibility_Adaptibility__c;
    }


    /**
     * Gets the oldFuture_Engagements__c value for this Best_In_Service__c.
     * 
     * @return oldFuture_Engagements__c
     */
    public java.lang.String getOldFuture_Engagements__c() {
        return oldFuture_Engagements__c;
    }


    /**
     * Sets the oldFuture_Engagements__c value for this Best_In_Service__c.
     * 
     * @param oldFuture_Engagements__c
     */
    public void setOldFuture_Engagements__c(java.lang.String oldFuture_Engagements__c) {
        this.oldFuture_Engagements__c = oldFuture_Engagements__c;
    }


    /**
     * Gets the oldProblem_Solving__c value for this Best_In_Service__c.
     * 
     * @return oldProblem_Solving__c
     */
    public java.lang.String getOldProblem_Solving__c() {
        return oldProblem_Solving__c;
    }


    /**
     * Sets the oldProblem_Solving__c value for this Best_In_Service__c.
     * 
     * @param oldProblem_Solving__c
     */
    public void setOldProblem_Solving__c(java.lang.String oldProblem_Solving__c) {
        this.oldProblem_Solving__c = oldProblem_Solving__c;
    }


    /**
     * Gets the oldProduct_Knowledge_Sales__c value for this Best_In_Service__c.
     * 
     * @return oldProduct_Knowledge_Sales__c
     */
    public java.lang.String getOldProduct_Knowledge_Sales__c() {
        return oldProduct_Knowledge_Sales__c;
    }


    /**
     * Sets the oldProduct_Knowledge_Sales__c value for this Best_In_Service__c.
     * 
     * @param oldProduct_Knowledge_Sales__c
     */
    public void setOldProduct_Knowledge_Sales__c(java.lang.String oldProduct_Knowledge_Sales__c) {
        this.oldProduct_Knowledge_Sales__c = oldProduct_Knowledge_Sales__c;
    }


    /**
     * Gets the oldProfessional_Behavior_Project__c value for this Best_In_Service__c.
     * 
     * @return oldProfessional_Behavior_Project__c
     */
    public java.lang.String getOldProfessional_Behavior_Project__c() {
        return oldProfessional_Behavior_Project__c;
    }


    /**
     * Sets the oldProfessional_Behavior_Project__c value for this Best_In_Service__c.
     * 
     * @param oldProfessional_Behavior_Project__c
     */
    public void setOldProfessional_Behavior_Project__c(java.lang.String oldProfessional_Behavior_Project__c) {
        this.oldProfessional_Behavior_Project__c = oldProfessional_Behavior_Project__c;
    }


    /**
     * Gets the oldProfessional_Behavior_Sales__c value for this Best_In_Service__c.
     * 
     * @return oldProfessional_Behavior_Sales__c
     */
    public java.lang.String getOldProfessional_Behavior_Sales__c() {
        return oldProfessional_Behavior_Sales__c;
    }


    /**
     * Sets the oldProfessional_Behavior_Sales__c value for this Best_In_Service__c.
     * 
     * @param oldProfessional_Behavior_Sales__c
     */
    public void setOldProfessional_Behavior_Sales__c(java.lang.String oldProfessional_Behavior_Sales__c) {
        this.oldProfessional_Behavior_Sales__c = oldProfessional_Behavior_Sales__c;
    }


    /**
     * Gets the oldService_Oriented_Project__c value for this Best_In_Service__c.
     * 
     * @return oldService_Oriented_Project__c
     */
    public java.lang.String getOldService_Oriented_Project__c() {
        return oldService_Oriented_Project__c;
    }


    /**
     * Sets the oldService_Oriented_Project__c value for this Best_In_Service__c.
     * 
     * @param oldService_Oriented_Project__c
     */
    public void setOldService_Oriented_Project__c(java.lang.String oldService_Oriented_Project__c) {
        this.oldService_Oriented_Project__c = oldService_Oriented_Project__c;
    }


    /**
     * Gets the oldService_Oriented_Sales__c value for this Best_In_Service__c.
     * 
     * @return oldService_Oriented_Sales__c
     */
    public java.lang.String getOldService_Oriented_Sales__c() {
        return oldService_Oriented_Sales__c;
    }


    /**
     * Sets the oldService_Oriented_Sales__c value for this Best_In_Service__c.
     * 
     * @param oldService_Oriented_Sales__c
     */
    public void setOldService_Oriented_Sales__c(java.lang.String oldService_Oriented_Sales__c) {
        this.oldService_Oriented_Sales__c = oldService_Oriented_Sales__c;
    }


    /**
     * Gets the oldShare_With_Service_Provider__c value for this Best_In_Service__c.
     * 
     * @return oldShare_With_Service_Provider__c
     */
    public java.lang.String getOldShare_With_Service_Provider__c() {
        return oldShare_With_Service_Provider__c;
    }


    /**
     * Sets the oldShare_With_Service_Provider__c value for this Best_In_Service__c.
     * 
     * @param oldShare_With_Service_Provider__c
     */
    public void setOldShare_With_Service_Provider__c(java.lang.String oldShare_With_Service_Provider__c) {
        this.oldShare_With_Service_Provider__c = oldShare_With_Service_Provider__c;
    }


    /**
     * Gets the oldSurvey_Score__c value for this Best_In_Service__c.
     * 
     * @return oldSurvey_Score__c
     */
    public java.lang.Double getOldSurvey_Score__c() {
        return oldSurvey_Score__c;
    }


    /**
     * Sets the oldSurvey_Score__c value for this Best_In_Service__c.
     * 
     * @param oldSurvey_Score__c
     */
    public void setOldSurvey_Score__c(java.lang.Double oldSurvey_Score__c) {
        this.oldSurvey_Score__c = oldSurvey_Score__c;
    }


    /**
     * Gets the oldTechnical_Service_Availability__c value for this Best_In_Service__c.
     * 
     * @return oldTechnical_Service_Availability__c
     */
    public java.lang.String getOldTechnical_Service_Availability__c() {
        return oldTechnical_Service_Availability__c;
    }


    /**
     * Sets the oldTechnical_Service_Availability__c value for this Best_In_Service__c.
     * 
     * @param oldTechnical_Service_Availability__c
     */
    public void setOldTechnical_Service_Availability__c(java.lang.String oldTechnical_Service_Availability__c) {
        this.oldTechnical_Service_Availability__c = oldTechnical_Service_Availability__c;
    }


    /**
     * Gets the oldTechnical_Skills_Other__c value for this Best_In_Service__c.
     * 
     * @return oldTechnical_Skills_Other__c
     */
    public java.lang.String getOldTechnical_Skills_Other__c() {
        return oldTechnical_Skills_Other__c;
    }


    /**
     * Sets the oldTechnical_Skills_Other__c value for this Best_In_Service__c.
     * 
     * @param oldTechnical_Skills_Other__c
     */
    public void setOldTechnical_Skills_Other__c(java.lang.String oldTechnical_Skills_Other__c) {
        this.oldTechnical_Skills_Other__c = oldTechnical_Skills_Other__c;
    }


    /**
     * Gets the oldTechnical_Skills_Relativity__c value for this Best_In_Service__c.
     * 
     * @return oldTechnical_Skills_Relativity__c
     */
    public java.lang.String getOldTechnical_Skills_Relativity__c() {
        return oldTechnical_Skills_Relativity__c;
    }


    /**
     * Sets the oldTechnical_Skills_Relativity__c value for this Best_In_Service__c.
     * 
     * @param oldTechnical_Skills_Relativity__c
     */
    public void setOldTechnical_Skills_Relativity__c(java.lang.String oldTechnical_Skills_Relativity__c) {
        this.oldTechnical_Skills_Relativity__c = oldTechnical_Skills_Relativity__c;
    }


    /**
     * Gets the oldTime_Management__c value for this Best_In_Service__c.
     * 
     * @return oldTime_Management__c
     */
    public java.lang.String getOldTime_Management__c() {
        return oldTime_Management__c;
    }


    /**
     * Sets the oldTime_Management__c value for this Best_In_Service__c.
     * 
     * @param oldTime_Management__c
     */
    public void setOldTime_Management__c(java.lang.String oldTime_Management__c) {
        this.oldTime_Management__c = oldTime_Management__c;
    }


    /**
     * Gets the oldWork_Product_Quality__c value for this Best_In_Service__c.
     * 
     * @return oldWork_Product_Quality__c
     */
    public java.lang.String getOldWork_Product_Quality__c() {
        return oldWork_Product_Quality__c;
    }


    /**
     * Sets the oldWork_Product_Quality__c value for this Best_In_Service__c.
     * 
     * @param oldWork_Product_Quality__c
     */
    public void setOldWork_Product_Quality__c(java.lang.String oldWork_Product_Quality__c) {
        this.oldWork_Product_Quality__c = oldWork_Product_Quality__c;
    }


    /**
     * Gets the owner value for this Best_In_Service__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Best_In_Service__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Best_In_Service__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Best_In_Service__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the phone__c value for this Best_In_Service__c.
     * 
     * @return phone__c
     */
    public java.lang.String getPhone__c() {
        return phone__c;
    }


    /**
     * Sets the phone__c value for this Best_In_Service__c.
     * 
     * @param phone__c
     */
    public void setPhone__c(java.lang.String phone__c) {
        this.phone__c = phone__c;
    }


    /**
     * Gets the processInstances value for this Best_In_Service__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Best_In_Service__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Best_In_Service__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Best_In_Service__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the product_Knowledge__c value for this Best_In_Service__c.
     * 
     * @return product_Knowledge__c
     */
    public java.lang.String getProduct_Knowledge__c() {
        return product_Knowledge__c;
    }


    /**
     * Sets the product_Knowledge__c value for this Best_In_Service__c.
     * 
     * @param product_Knowledge__c
     */
    public void setProduct_Knowledge__c(java.lang.String product_Knowledge__c) {
        this.product_Knowledge__c = product_Knowledge__c;
    }


    /**
     * Gets the professional_Behavior__c value for this Best_In_Service__c.
     * 
     * @return professional_Behavior__c
     */
    public java.lang.String getProfessional_Behavior__c() {
        return professional_Behavior__c;
    }


    /**
     * Sets the professional_Behavior__c value for this Best_In_Service__c.
     * 
     * @param professional_Behavior__c
     */
    public void setProfessional_Behavior__c(java.lang.String professional_Behavior__c) {
        this.professional_Behavior__c = professional_Behavior__c;
    }


    /**
     * Gets the q10__c value for this Best_In_Service__c.
     * 
     * @return q10__c
     */
    public java.lang.Double getQ10__c() {
        return q10__c;
    }


    /**
     * Sets the q10__c value for this Best_In_Service__c.
     * 
     * @param q10__c
     */
    public void setQ10__c(java.lang.Double q10__c) {
        this.q10__c = q10__c;
    }


    /**
     * Gets the q11__c value for this Best_In_Service__c.
     * 
     * @return q11__c
     */
    public java.lang.Double getQ11__c() {
        return q11__c;
    }


    /**
     * Sets the q11__c value for this Best_In_Service__c.
     * 
     * @param q11__c
     */
    public void setQ11__c(java.lang.Double q11__c) {
        this.q11__c = q11__c;
    }


    /**
     * Gets the q12__c value for this Best_In_Service__c.
     * 
     * @return q12__c
     */
    public java.lang.Double getQ12__c() {
        return q12__c;
    }


    /**
     * Sets the q12__c value for this Best_In_Service__c.
     * 
     * @param q12__c
     */
    public void setQ12__c(java.lang.Double q12__c) {
        this.q12__c = q12__c;
    }


    /**
     * Gets the q13__c value for this Best_In_Service__c.
     * 
     * @return q13__c
     */
    public java.lang.Double getQ13__c() {
        return q13__c;
    }


    /**
     * Sets the q13__c value for this Best_In_Service__c.
     * 
     * @param q13__c
     */
    public void setQ13__c(java.lang.Double q13__c) {
        this.q13__c = q13__c;
    }


    /**
     * Gets the q14__c value for this Best_In_Service__c.
     * 
     * @return q14__c
     */
    public java.lang.Double getQ14__c() {
        return q14__c;
    }


    /**
     * Sets the q14__c value for this Best_In_Service__c.
     * 
     * @param q14__c
     */
    public void setQ14__c(java.lang.Double q14__c) {
        this.q14__c = q14__c;
    }


    /**
     * Gets the q15__c value for this Best_In_Service__c.
     * 
     * @return q15__c
     */
    public java.lang.Double getQ15__c() {
        return q15__c;
    }


    /**
     * Sets the q15__c value for this Best_In_Service__c.
     * 
     * @param q15__c
     */
    public void setQ15__c(java.lang.Double q15__c) {
        this.q15__c = q15__c;
    }


    /**
     * Gets the q16__c value for this Best_In_Service__c.
     * 
     * @return q16__c
     */
    public java.lang.Double getQ16__c() {
        return q16__c;
    }


    /**
     * Sets the q16__c value for this Best_In_Service__c.
     * 
     * @param q16__c
     */
    public void setQ16__c(java.lang.Double q16__c) {
        this.q16__c = q16__c;
    }


    /**
     * Gets the q17__c value for this Best_In_Service__c.
     * 
     * @return q17__c
     */
    public java.lang.Double getQ17__c() {
        return q17__c;
    }


    /**
     * Sets the q17__c value for this Best_In_Service__c.
     * 
     * @param q17__c
     */
    public void setQ17__c(java.lang.Double q17__c) {
        this.q17__c = q17__c;
    }


    /**
     * Gets the q18__c value for this Best_In_Service__c.
     * 
     * @return q18__c
     */
    public java.lang.Double getQ18__c() {
        return q18__c;
    }


    /**
     * Sets the q18__c value for this Best_In_Service__c.
     * 
     * @param q18__c
     */
    public void setQ18__c(java.lang.Double q18__c) {
        this.q18__c = q18__c;
    }


    /**
     * Gets the q19__c value for this Best_In_Service__c.
     * 
     * @return q19__c
     */
    public java.lang.Double getQ19__c() {
        return q19__c;
    }


    /**
     * Sets the q19__c value for this Best_In_Service__c.
     * 
     * @param q19__c
     */
    public void setQ19__c(java.lang.Double q19__c) {
        this.q19__c = q19__c;
    }


    /**
     * Gets the q1__c value for this Best_In_Service__c.
     * 
     * @return q1__c
     */
    public java.lang.Double getQ1__c() {
        return q1__c;
    }


    /**
     * Sets the q1__c value for this Best_In_Service__c.
     * 
     * @param q1__c
     */
    public void setQ1__c(java.lang.Double q1__c) {
        this.q1__c = q1__c;
    }


    /**
     * Gets the q2__c value for this Best_In_Service__c.
     * 
     * @return q2__c
     */
    public java.lang.Double getQ2__c() {
        return q2__c;
    }


    /**
     * Sets the q2__c value for this Best_In_Service__c.
     * 
     * @param q2__c
     */
    public void setQ2__c(java.lang.Double q2__c) {
        this.q2__c = q2__c;
    }


    /**
     * Gets the q3__c value for this Best_In_Service__c.
     * 
     * @return q3__c
     */
    public java.lang.Double getQ3__c() {
        return q3__c;
    }


    /**
     * Sets the q3__c value for this Best_In_Service__c.
     * 
     * @param q3__c
     */
    public void setQ3__c(java.lang.Double q3__c) {
        this.q3__c = q3__c;
    }


    /**
     * Gets the q4__c value for this Best_In_Service__c.
     * 
     * @return q4__c
     */
    public java.lang.Double getQ4__c() {
        return q4__c;
    }


    /**
     * Sets the q4__c value for this Best_In_Service__c.
     * 
     * @param q4__c
     */
    public void setQ4__c(java.lang.Double q4__c) {
        this.q4__c = q4__c;
    }


    /**
     * Gets the q5__c value for this Best_In_Service__c.
     * 
     * @return q5__c
     */
    public java.lang.Double getQ5__c() {
        return q5__c;
    }


    /**
     * Sets the q5__c value for this Best_In_Service__c.
     * 
     * @param q5__c
     */
    public void setQ5__c(java.lang.Double q5__c) {
        this.q5__c = q5__c;
    }


    /**
     * Gets the q6__c value for this Best_In_Service__c.
     * 
     * @return q6__c
     */
    public java.lang.Double getQ6__c() {
        return q6__c;
    }


    /**
     * Sets the q6__c value for this Best_In_Service__c.
     * 
     * @param q6__c
     */
    public void setQ6__c(java.lang.Double q6__c) {
        this.q6__c = q6__c;
    }


    /**
     * Gets the q7__c value for this Best_In_Service__c.
     * 
     * @return q7__c
     */
    public java.lang.Double getQ7__c() {
        return q7__c;
    }


    /**
     * Sets the q7__c value for this Best_In_Service__c.
     * 
     * @param q7__c
     */
    public void setQ7__c(java.lang.Double q7__c) {
        this.q7__c = q7__c;
    }


    /**
     * Gets the q8__c value for this Best_In_Service__c.
     * 
     * @return q8__c
     */
    public java.lang.Double getQ8__c() {
        return q8__c;
    }


    /**
     * Sets the q8__c value for this Best_In_Service__c.
     * 
     * @param q8__c
     */
    public void setQ8__c(java.lang.Double q8__c) {
        this.q8__c = q8__c;
    }


    /**
     * Gets the q9__c value for this Best_In_Service__c.
     * 
     * @return q9__c
     */
    public java.lang.Double getQ9__c() {
        return q9__c;
    }


    /**
     * Sets the q9__c value for this Best_In_Service__c.
     * 
     * @param q9__c
     */
    public void setQ9__c(java.lang.Double q9__c) {
        this.q9__c = q9__c;
    }


    /**
     * Gets the reference_Name__c value for this Best_In_Service__c.
     * 
     * @return reference_Name__c
     */
    public java.lang.String getReference_Name__c() {
        return reference_Name__c;
    }


    /**
     * Sets the reference_Name__c value for this Best_In_Service__c.
     * 
     * @param reference_Name__c
     */
    public void setReference_Name__c(java.lang.String reference_Name__c) {
        this.reference_Name__c = reference_Name__c;
    }


    /**
     * Gets the send_Reminder_Email__c value for this Best_In_Service__c.
     * 
     * @return send_Reminder_Email__c
     */
    public java.lang.Boolean getSend_Reminder_Email__c() {
        return send_Reminder_Email__c;
    }


    /**
     * Sets the send_Reminder_Email__c value for this Best_In_Service__c.
     * 
     * @param send_Reminder_Email__c
     */
    public void setSend_Reminder_Email__c(java.lang.Boolean send_Reminder_Email__c) {
        this.send_Reminder_Email__c = send_Reminder_Email__c;
    }


    /**
     * Gets the send_Survey__c value for this Best_In_Service__c.
     * 
     * @return send_Survey__c
     */
    public java.lang.Boolean getSend_Survey__c() {
        return send_Survey__c;
    }


    /**
     * Sets the send_Survey__c value for this Best_In_Service__c.
     * 
     * @param send_Survey__c
     */
    public void setSend_Survey__c(java.lang.Boolean send_Survey__c) {
        this.send_Survey__c = send_Survey__c;
    }


    /**
     * Gets the service_Oriented__c value for this Best_In_Service__c.
     * 
     * @return service_Oriented__c
     */
    public java.lang.String getService_Oriented__c() {
        return service_Oriented__c;
    }


    /**
     * Sets the service_Oriented__c value for this Best_In_Service__c.
     * 
     * @param service_Oriented__c
     */
    public void setService_Oriented__c(java.lang.String service_Oriented__c) {
        this.service_Oriented__c = service_Oriented__c;
    }


    /**
     * Gets the systemModstamp value for this Best_In_Service__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Best_In_Service__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Best_In_Service__c)) return false;
        Best_In_Service__c other = (Best_In_Service__c) obj;
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
            ((this.due_Date__c==null && other.getDue_Date__c()==null) || 
             (this.due_Date__c!=null &&
              this.due_Date__c.equals(other.getDue_Date__c()))) &&
            ((this.ease_of_Contact__c==null && other.getEase_of_Contact__c()==null) || 
             (this.ease_of_Contact__c!=null &&
              this.ease_of_Contact__c.equals(other.getEase_of_Contact__c()))) &&
            ((this.email__c==null && other.getEmail__c()==null) || 
             (this.email__c!=null &&
              this.email__c.equals(other.getEmail__c()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.future_Engagement__c==null && other.getFuture_Engagement__c()==null) || 
             (this.future_Engagement__c!=null &&
              this.future_Engagement__c.equals(other.getFuture_Engagement__c()))) &&
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.oldCommunication_Skills__c==null && other.getOldCommunication_Skills__c()==null) || 
             (this.oldCommunication_Skills__c!=null &&
              this.oldCommunication_Skills__c.equals(other.getOldCommunication_Skills__c()))) &&
            ((this.oldDeadlines_Met__c==null && other.getOldDeadlines_Met__c()==null) || 
             (this.oldDeadlines_Met__c!=null &&
              this.oldDeadlines_Met__c.equals(other.getOldDeadlines_Met__c()))) &&
            ((this.oldDetail_Oriented__c==null && other.getOldDetail_Oriented__c()==null) || 
             (this.oldDetail_Oriented__c!=null &&
              this.oldDetail_Oriented__c.equals(other.getOldDetail_Oriented__c()))) &&
            ((this.oldEase_of_Contact_Project__c==null && other.getOldEase_of_Contact_Project__c()==null) || 
             (this.oldEase_of_Contact_Project__c!=null &&
              this.oldEase_of_Contact_Project__c.equals(other.getOldEase_of_Contact_Project__c()))) &&
            ((this.oldEase_of_Contact_Sales__c==null && other.getOldEase_of_Contact_Sales__c()==null) || 
             (this.oldEase_of_Contact_Sales__c!=null &&
              this.oldEase_of_Contact_Sales__c.equals(other.getOldEase_of_Contact_Sales__c()))) &&
            ((this.oldEase_of_Rollout__c==null && other.getOldEase_of_Rollout__c()==null) || 
             (this.oldEase_of_Rollout__c!=null &&
              this.oldEase_of_Rollout__c.equals(other.getOldEase_of_Rollout__c()))) &&
            ((this.oldFlexibility_Adaptibility__c==null && other.getOldFlexibility_Adaptibility__c()==null) || 
             (this.oldFlexibility_Adaptibility__c!=null &&
              this.oldFlexibility_Adaptibility__c.equals(other.getOldFlexibility_Adaptibility__c()))) &&
            ((this.oldFuture_Engagements__c==null && other.getOldFuture_Engagements__c()==null) || 
             (this.oldFuture_Engagements__c!=null &&
              this.oldFuture_Engagements__c.equals(other.getOldFuture_Engagements__c()))) &&
            ((this.oldProblem_Solving__c==null && other.getOldProblem_Solving__c()==null) || 
             (this.oldProblem_Solving__c!=null &&
              this.oldProblem_Solving__c.equals(other.getOldProblem_Solving__c()))) &&
            ((this.oldProduct_Knowledge_Sales__c==null && other.getOldProduct_Knowledge_Sales__c()==null) || 
             (this.oldProduct_Knowledge_Sales__c!=null &&
              this.oldProduct_Knowledge_Sales__c.equals(other.getOldProduct_Knowledge_Sales__c()))) &&
            ((this.oldProfessional_Behavior_Project__c==null && other.getOldProfessional_Behavior_Project__c()==null) || 
             (this.oldProfessional_Behavior_Project__c!=null &&
              this.oldProfessional_Behavior_Project__c.equals(other.getOldProfessional_Behavior_Project__c()))) &&
            ((this.oldProfessional_Behavior_Sales__c==null && other.getOldProfessional_Behavior_Sales__c()==null) || 
             (this.oldProfessional_Behavior_Sales__c!=null &&
              this.oldProfessional_Behavior_Sales__c.equals(other.getOldProfessional_Behavior_Sales__c()))) &&
            ((this.oldService_Oriented_Project__c==null && other.getOldService_Oriented_Project__c()==null) || 
             (this.oldService_Oriented_Project__c!=null &&
              this.oldService_Oriented_Project__c.equals(other.getOldService_Oriented_Project__c()))) &&
            ((this.oldService_Oriented_Sales__c==null && other.getOldService_Oriented_Sales__c()==null) || 
             (this.oldService_Oriented_Sales__c!=null &&
              this.oldService_Oriented_Sales__c.equals(other.getOldService_Oriented_Sales__c()))) &&
            ((this.oldShare_With_Service_Provider__c==null && other.getOldShare_With_Service_Provider__c()==null) || 
             (this.oldShare_With_Service_Provider__c!=null &&
              this.oldShare_With_Service_Provider__c.equals(other.getOldShare_With_Service_Provider__c()))) &&
            ((this.oldSurvey_Score__c==null && other.getOldSurvey_Score__c()==null) || 
             (this.oldSurvey_Score__c!=null &&
              this.oldSurvey_Score__c.equals(other.getOldSurvey_Score__c()))) &&
            ((this.oldTechnical_Service_Availability__c==null && other.getOldTechnical_Service_Availability__c()==null) || 
             (this.oldTechnical_Service_Availability__c!=null &&
              this.oldTechnical_Service_Availability__c.equals(other.getOldTechnical_Service_Availability__c()))) &&
            ((this.oldTechnical_Skills_Other__c==null && other.getOldTechnical_Skills_Other__c()==null) || 
             (this.oldTechnical_Skills_Other__c!=null &&
              this.oldTechnical_Skills_Other__c.equals(other.getOldTechnical_Skills_Other__c()))) &&
            ((this.oldTechnical_Skills_Relativity__c==null && other.getOldTechnical_Skills_Relativity__c()==null) || 
             (this.oldTechnical_Skills_Relativity__c!=null &&
              this.oldTechnical_Skills_Relativity__c.equals(other.getOldTechnical_Skills_Relativity__c()))) &&
            ((this.oldTime_Management__c==null && other.getOldTime_Management__c()==null) || 
             (this.oldTime_Management__c!=null &&
              this.oldTime_Management__c.equals(other.getOldTime_Management__c()))) &&
            ((this.oldWork_Product_Quality__c==null && other.getOldWork_Product_Quality__c()==null) || 
             (this.oldWork_Product_Quality__c!=null &&
              this.oldWork_Product_Quality__c.equals(other.getOldWork_Product_Quality__c()))) &&
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
            ((this.product_Knowledge__c==null && other.getProduct_Knowledge__c()==null) || 
             (this.product_Knowledge__c!=null &&
              this.product_Knowledge__c.equals(other.getProduct_Knowledge__c()))) &&
            ((this.professional_Behavior__c==null && other.getProfessional_Behavior__c()==null) || 
             (this.professional_Behavior__c!=null &&
              this.professional_Behavior__c.equals(other.getProfessional_Behavior__c()))) &&
            ((this.q10__c==null && other.getQ10__c()==null) || 
             (this.q10__c!=null &&
              this.q10__c.equals(other.getQ10__c()))) &&
            ((this.q11__c==null && other.getQ11__c()==null) || 
             (this.q11__c!=null &&
              this.q11__c.equals(other.getQ11__c()))) &&
            ((this.q12__c==null && other.getQ12__c()==null) || 
             (this.q12__c!=null &&
              this.q12__c.equals(other.getQ12__c()))) &&
            ((this.q13__c==null && other.getQ13__c()==null) || 
             (this.q13__c!=null &&
              this.q13__c.equals(other.getQ13__c()))) &&
            ((this.q14__c==null && other.getQ14__c()==null) || 
             (this.q14__c!=null &&
              this.q14__c.equals(other.getQ14__c()))) &&
            ((this.q15__c==null && other.getQ15__c()==null) || 
             (this.q15__c!=null &&
              this.q15__c.equals(other.getQ15__c()))) &&
            ((this.q16__c==null && other.getQ16__c()==null) || 
             (this.q16__c!=null &&
              this.q16__c.equals(other.getQ16__c()))) &&
            ((this.q17__c==null && other.getQ17__c()==null) || 
             (this.q17__c!=null &&
              this.q17__c.equals(other.getQ17__c()))) &&
            ((this.q18__c==null && other.getQ18__c()==null) || 
             (this.q18__c!=null &&
              this.q18__c.equals(other.getQ18__c()))) &&
            ((this.q19__c==null && other.getQ19__c()==null) || 
             (this.q19__c!=null &&
              this.q19__c.equals(other.getQ19__c()))) &&
            ((this.q1__c==null && other.getQ1__c()==null) || 
             (this.q1__c!=null &&
              this.q1__c.equals(other.getQ1__c()))) &&
            ((this.q2__c==null && other.getQ2__c()==null) || 
             (this.q2__c!=null &&
              this.q2__c.equals(other.getQ2__c()))) &&
            ((this.q3__c==null && other.getQ3__c()==null) || 
             (this.q3__c!=null &&
              this.q3__c.equals(other.getQ3__c()))) &&
            ((this.q4__c==null && other.getQ4__c()==null) || 
             (this.q4__c!=null &&
              this.q4__c.equals(other.getQ4__c()))) &&
            ((this.q5__c==null && other.getQ5__c()==null) || 
             (this.q5__c!=null &&
              this.q5__c.equals(other.getQ5__c()))) &&
            ((this.q6__c==null && other.getQ6__c()==null) || 
             (this.q6__c!=null &&
              this.q6__c.equals(other.getQ6__c()))) &&
            ((this.q7__c==null && other.getQ7__c()==null) || 
             (this.q7__c!=null &&
              this.q7__c.equals(other.getQ7__c()))) &&
            ((this.q8__c==null && other.getQ8__c()==null) || 
             (this.q8__c!=null &&
              this.q8__c.equals(other.getQ8__c()))) &&
            ((this.q9__c==null && other.getQ9__c()==null) || 
             (this.q9__c!=null &&
              this.q9__c.equals(other.getQ9__c()))) &&
            ((this.reference_Name__c==null && other.getReference_Name__c()==null) || 
             (this.reference_Name__c!=null &&
              this.reference_Name__c.equals(other.getReference_Name__c()))) &&
            ((this.send_Reminder_Email__c==null && other.getSend_Reminder_Email__c()==null) || 
             (this.send_Reminder_Email__c!=null &&
              this.send_Reminder_Email__c.equals(other.getSend_Reminder_Email__c()))) &&
            ((this.send_Survey__c==null && other.getSend_Survey__c()==null) || 
             (this.send_Survey__c!=null &&
              this.send_Survey__c.equals(other.getSend_Survey__c()))) &&
            ((this.service_Oriented__c==null && other.getService_Oriented__c()==null) || 
             (this.service_Oriented__c!=null &&
              this.service_Oriented__c.equals(other.getService_Oriented__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp())));
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
        if (getDue_Date__c() != null) {
            _hashCode += getDue_Date__c().hashCode();
        }
        if (getEase_of_Contact__c() != null) {
            _hashCode += getEase_of_Contact__c().hashCode();
        }
        if (getEmail__c() != null) {
            _hashCode += getEmail__c().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getFuture_Engagement__c() != null) {
            _hashCode += getFuture_Engagement__c().hashCode();
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getNotesAndAttachments() != null) {
            _hashCode += getNotesAndAttachments().hashCode();
        }
        if (getOldCommunication_Skills__c() != null) {
            _hashCode += getOldCommunication_Skills__c().hashCode();
        }
        if (getOldDeadlines_Met__c() != null) {
            _hashCode += getOldDeadlines_Met__c().hashCode();
        }
        if (getOldDetail_Oriented__c() != null) {
            _hashCode += getOldDetail_Oriented__c().hashCode();
        }
        if (getOldEase_of_Contact_Project__c() != null) {
            _hashCode += getOldEase_of_Contact_Project__c().hashCode();
        }
        if (getOldEase_of_Contact_Sales__c() != null) {
            _hashCode += getOldEase_of_Contact_Sales__c().hashCode();
        }
        if (getOldEase_of_Rollout__c() != null) {
            _hashCode += getOldEase_of_Rollout__c().hashCode();
        }
        if (getOldFlexibility_Adaptibility__c() != null) {
            _hashCode += getOldFlexibility_Adaptibility__c().hashCode();
        }
        if (getOldFuture_Engagements__c() != null) {
            _hashCode += getOldFuture_Engagements__c().hashCode();
        }
        if (getOldProblem_Solving__c() != null) {
            _hashCode += getOldProblem_Solving__c().hashCode();
        }
        if (getOldProduct_Knowledge_Sales__c() != null) {
            _hashCode += getOldProduct_Knowledge_Sales__c().hashCode();
        }
        if (getOldProfessional_Behavior_Project__c() != null) {
            _hashCode += getOldProfessional_Behavior_Project__c().hashCode();
        }
        if (getOldProfessional_Behavior_Sales__c() != null) {
            _hashCode += getOldProfessional_Behavior_Sales__c().hashCode();
        }
        if (getOldService_Oriented_Project__c() != null) {
            _hashCode += getOldService_Oriented_Project__c().hashCode();
        }
        if (getOldService_Oriented_Sales__c() != null) {
            _hashCode += getOldService_Oriented_Sales__c().hashCode();
        }
        if (getOldShare_With_Service_Provider__c() != null) {
            _hashCode += getOldShare_With_Service_Provider__c().hashCode();
        }
        if (getOldSurvey_Score__c() != null) {
            _hashCode += getOldSurvey_Score__c().hashCode();
        }
        if (getOldTechnical_Service_Availability__c() != null) {
            _hashCode += getOldTechnical_Service_Availability__c().hashCode();
        }
        if (getOldTechnical_Skills_Other__c() != null) {
            _hashCode += getOldTechnical_Skills_Other__c().hashCode();
        }
        if (getOldTechnical_Skills_Relativity__c() != null) {
            _hashCode += getOldTechnical_Skills_Relativity__c().hashCode();
        }
        if (getOldTime_Management__c() != null) {
            _hashCode += getOldTime_Management__c().hashCode();
        }
        if (getOldWork_Product_Quality__c() != null) {
            _hashCode += getOldWork_Product_Quality__c().hashCode();
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
        if (getProduct_Knowledge__c() != null) {
            _hashCode += getProduct_Knowledge__c().hashCode();
        }
        if (getProfessional_Behavior__c() != null) {
            _hashCode += getProfessional_Behavior__c().hashCode();
        }
        if (getQ10__c() != null) {
            _hashCode += getQ10__c().hashCode();
        }
        if (getQ11__c() != null) {
            _hashCode += getQ11__c().hashCode();
        }
        if (getQ12__c() != null) {
            _hashCode += getQ12__c().hashCode();
        }
        if (getQ13__c() != null) {
            _hashCode += getQ13__c().hashCode();
        }
        if (getQ14__c() != null) {
            _hashCode += getQ14__c().hashCode();
        }
        if (getQ15__c() != null) {
            _hashCode += getQ15__c().hashCode();
        }
        if (getQ16__c() != null) {
            _hashCode += getQ16__c().hashCode();
        }
        if (getQ17__c() != null) {
            _hashCode += getQ17__c().hashCode();
        }
        if (getQ18__c() != null) {
            _hashCode += getQ18__c().hashCode();
        }
        if (getQ19__c() != null) {
            _hashCode += getQ19__c().hashCode();
        }
        if (getQ1__c() != null) {
            _hashCode += getQ1__c().hashCode();
        }
        if (getQ2__c() != null) {
            _hashCode += getQ2__c().hashCode();
        }
        if (getQ3__c() != null) {
            _hashCode += getQ3__c().hashCode();
        }
        if (getQ4__c() != null) {
            _hashCode += getQ4__c().hashCode();
        }
        if (getQ5__c() != null) {
            _hashCode += getQ5__c().hashCode();
        }
        if (getQ6__c() != null) {
            _hashCode += getQ6__c().hashCode();
        }
        if (getQ7__c() != null) {
            _hashCode += getQ7__c().hashCode();
        }
        if (getQ8__c() != null) {
            _hashCode += getQ8__c().hashCode();
        }
        if (getQ9__c() != null) {
            _hashCode += getQ9__c().hashCode();
        }
        if (getReference_Name__c() != null) {
            _hashCode += getReference_Name__c().hashCode();
        }
        if (getSend_Reminder_Email__c() != null) {
            _hashCode += getSend_Reminder_Email__c().hashCode();
        }
        if (getSend_Survey__c() != null) {
            _hashCode += getSend_Survey__c().hashCode();
        }
        if (getService_Oriented__c() != null) {
            _hashCode += getService_Oriented__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Best_In_Service__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Best_In_Service__c"));
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
        elemField.setFieldName("due_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Due_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ease_of_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Ease_of_Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("feedSubscriptionsForEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedSubscriptionsForEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("future_Engagement__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Future_Engagement__c"));
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
        elemField.setFieldName("oldCommunication_Skills__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OldCommunication_Skills__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldDeadlines_Met__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OldDeadlines_Met__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldDetail_Oriented__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OldDetail_Oriented__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldEase_of_Contact_Project__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OldEase_of_Contact_Project__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldEase_of_Contact_Sales__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OldEase_of_Contact_Sales__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldEase_of_Rollout__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OldEase_of_Rollout__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldFlexibility_Adaptibility__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OldFlexibility_Adaptibility__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldFuture_Engagements__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OldFuture_Engagements__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldProblem_Solving__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OldProblem_Solving__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldProduct_Knowledge_Sales__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OldProduct_Knowledge_Sales__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldProfessional_Behavior_Project__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OldProfessional_Behavior_Project__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldProfessional_Behavior_Sales__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OldProfessional_Behavior_Sales__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldService_Oriented_Project__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OldService_Oriented_Project__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldService_Oriented_Sales__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OldService_Oriented_Sales__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldShare_With_Service_Provider__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OldShare_With_Service_Provider__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldSurvey_Score__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OldSurvey_Score__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldTechnical_Service_Availability__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OldTechnical_Service_Availability__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldTechnical_Skills_Other__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OldTechnical_Skills_Other__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldTechnical_Skills_Relativity__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OldTechnical_Skills_Relativity__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldTime_Management__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OldTime_Management__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldWork_Product_Quality__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OldWork_Product_Quality__c"));
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
        elemField.setFieldName("product_Knowledge__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Product_Knowledge__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("professional_Behavior__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Professional_Behavior__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q10__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q10__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q11__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q11__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q12__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q12__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q13__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q13__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q14__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q14__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q15__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q15__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q16__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q16__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q17__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q17__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q18__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q18__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q19__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q19__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q1__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q1__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q3__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q3__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q4__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q4__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q5__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q5__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q6__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q6__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q7__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q7__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q8__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q8__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q9__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Q9__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Reference_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("send_Reminder_Email__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Send_Reminder_Email__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("send_Survey__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Send_Survey__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service_Oriented__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Service_Oriented__c"));
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

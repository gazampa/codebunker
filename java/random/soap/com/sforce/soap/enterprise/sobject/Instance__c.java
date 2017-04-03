/**
 * Instance__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Instance__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String account__c;

    private com.sforce.soap.enterprise.sobject.Account account__r;

    private com.sforce.soap.enterprise.QueryResult accounts__r;

    private java.lang.String application_URL__c;

    private java.lang.String application_Version__c;

    private java.lang.String application__c;

    private java.lang.String applications_Installed__c;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String back_End_Access__c;

    private java.lang.String billing_Stats_Contact__c;

    private com.sforce.soap.enterprise.sobject.Contact billing_Stats_Contact__r;

    private java.lang.String CAP_Notes__c;

    private java.lang.String client_Contact_Name__c;

    private java.lang.String client_E_Mail_Address__c;

    private java.lang.String client_Type__c;

    private java.util.Date client_committed_to_send__c;

    private java.lang.String communication_Complete__c;

    private java.lang.String contract__c;

    private com.sforce.soap.enterprise.sobject.Contract contract__r;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String EDDSDBOADMIN_Password__c;

    private java.lang.String EDDSDBO_Password__c;

    private java.lang.String environment_Access_Removed__c;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.util.Date first_CS_e_mail_sent__c;

    private java.lang.Boolean follows_Environmental_Optimization_Guide__c;

    private java.lang.String front_End_Access__c;

    private java.util.Date go_Live_Date__c;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.String import_Method__c;

    private java.lang.String instance_Full_Name__c;

    private java.lang.Boolean isDeleted;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.util.Date last_Deployment_Date__c;

    private java.util.Date last_Import__c;

    private java.lang.String login_Notes__c;

    private java.lang.String method_Installed__c;

    private java.lang.String method_Release__c;

    private com.sforce.soap.enterprise.sobject.Release__c method_Release__r;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private java.lang.String owner_of_Communication_Individual__c;

    private com.sforce.soap.enterprise.sobject.User owner_of_Communication_Individual__r;

    private java.lang.String owner_of_Communication_Team__c;

    private java.lang.Boolean passed_Predeployment__c;

    private java.lang.String pre_Deployment_Check_Notes__c;

    private com.sforce.soap.enterprise.QueryResult pre_Deployments__r;

    private java.lang.Boolean primary_Instance__c;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private com.sforce.soap.enterprise.QueryResult RA_Monthly_Usages__r;

    private com.sforce.soap.enterprise.sobject.RecordType recordType;

    private java.lang.String recordTypeId;

    private java.lang.String relativity_Service_Account_Password__c;

    private java.lang.String relativity_Service_Account__c;

    private java.lang.String relativity_System_Admin_Account__c;

    private java.lang.String relativity_System_Admin_Password__c;

    private java.util.Date release_Last_Verified__c;

    private java.lang.Double release_Version_as_a_Number__c;

    private java.lang.String release__c;

    private com.sforce.soap.enterprise.sobject.Release__c release__r;

    private java.lang.String sales_Billing_Stats_Contact__c;

    private com.sforce.soap.enterprise.sobject.Contact sales_Billing_Stats_Contact__r;

    private java.lang.String salt_vs_Pepper_Deployed__c;

    private java.util.Date second_CS_e_mail_sent__c;

    private java.lang.Boolean send_Email__c;

    private com.sforce.soap.enterprise.QueryResult servers__r;

    private java.lang.String setup_Notes__c;

    private java.lang.String status__c;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tickets__r;

    private java.lang.String type__c;

    private java.lang.String type_of_Communication__c;

    private com.sforce.soap.enterprise.QueryResult unique_Users__r;

    private com.sforce.soap.enterprise.QueryResult VM_Instances__r;

    private java.lang.String VPN_Setup__c;

    private com.sforce.soap.enterprise.sobject.VPN_Setup__c VPN_Setup__r;

    private java.lang.String web_Service_URL__c;

    private java.lang.Boolean kCura_Internal__c;

    private java.lang.String kCura_Login_Account__c;

    private java.lang.String kCura_Login_Password__c;

    public Instance__c() {
    }

    public Instance__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String account__c,
           com.sforce.soap.enterprise.sobject.Account account__r,
           com.sforce.soap.enterprise.QueryResult accounts__r,
           java.lang.String application_URL__c,
           java.lang.String application_Version__c,
           java.lang.String application__c,
           java.lang.String applications_Installed__c,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String back_End_Access__c,
           java.lang.String billing_Stats_Contact__c,
           com.sforce.soap.enterprise.sobject.Contact billing_Stats_Contact__r,
           java.lang.String CAP_Notes__c,
           java.lang.String client_Contact_Name__c,
           java.lang.String client_E_Mail_Address__c,
           java.lang.String client_Type__c,
           java.util.Date client_committed_to_send__c,
           java.lang.String communication_Complete__c,
           java.lang.String contract__c,
           com.sforce.soap.enterprise.sobject.Contract contract__r,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String EDDSDBOADMIN_Password__c,
           java.lang.String EDDSDBO_Password__c,
           java.lang.String environment_Access_Removed__c,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.util.Date first_CS_e_mail_sent__c,
           java.lang.Boolean follows_Environmental_Optimization_Guide__c,
           java.lang.String front_End_Access__c,
           java.util.Date go_Live_Date__c,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.String import_Method__c,
           java.lang.String instance_Full_Name__c,
           java.lang.Boolean isDeleted,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.util.Date last_Deployment_Date__c,
           java.util.Date last_Import__c,
           java.lang.String login_Notes__c,
           java.lang.String method_Installed__c,
           java.lang.String method_Release__c,
           com.sforce.soap.enterprise.sobject.Release__c method_Release__r,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           java.lang.String owner_of_Communication_Individual__c,
           com.sforce.soap.enterprise.sobject.User owner_of_Communication_Individual__r,
           java.lang.String owner_of_Communication_Team__c,
           java.lang.Boolean passed_Predeployment__c,
           java.lang.String pre_Deployment_Check_Notes__c,
           com.sforce.soap.enterprise.QueryResult pre_Deployments__r,
           java.lang.Boolean primary_Instance__c,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           com.sforce.soap.enterprise.QueryResult RA_Monthly_Usages__r,
           com.sforce.soap.enterprise.sobject.RecordType recordType,
           java.lang.String recordTypeId,
           java.lang.String relativity_Service_Account_Password__c,
           java.lang.String relativity_Service_Account__c,
           java.lang.String relativity_System_Admin_Account__c,
           java.lang.String relativity_System_Admin_Password__c,
           java.util.Date release_Last_Verified__c,
           java.lang.Double release_Version_as_a_Number__c,
           java.lang.String release__c,
           com.sforce.soap.enterprise.sobject.Release__c release__r,
           java.lang.String sales_Billing_Stats_Contact__c,
           com.sforce.soap.enterprise.sobject.Contact sales_Billing_Stats_Contact__r,
           java.lang.String salt_vs_Pepper_Deployed__c,
           java.util.Date second_CS_e_mail_sent__c,
           java.lang.Boolean send_Email__c,
           com.sforce.soap.enterprise.QueryResult servers__r,
           java.lang.String setup_Notes__c,
           java.lang.String status__c,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tickets__r,
           java.lang.String type__c,
           java.lang.String type_of_Communication__c,
           com.sforce.soap.enterprise.QueryResult unique_Users__r,
           com.sforce.soap.enterprise.QueryResult VM_Instances__r,
           java.lang.String VPN_Setup__c,
           com.sforce.soap.enterprise.sobject.VPN_Setup__c VPN_Setup__r,
           java.lang.String web_Service_URL__c,
           java.lang.Boolean kCura_Internal__c,
           java.lang.String kCura_Login_Account__c,
           java.lang.String kCura_Login_Password__c) {
        super(
            fieldsToNull,
            id);
        this.account__c = account__c;
        this.account__r = account__r;
        this.accounts__r = accounts__r;
        this.application_URL__c = application_URL__c;
        this.application_Version__c = application_Version__c;
        this.application__c = application__c;
        this.applications_Installed__c = applications_Installed__c;
        this.attachments = attachments;
        this.back_End_Access__c = back_End_Access__c;
        this.billing_Stats_Contact__c = billing_Stats_Contact__c;
        this.billing_Stats_Contact__r = billing_Stats_Contact__r;
        this.CAP_Notes__c = CAP_Notes__c;
        this.client_Contact_Name__c = client_Contact_Name__c;
        this.client_E_Mail_Address__c = client_E_Mail_Address__c;
        this.client_Type__c = client_Type__c;
        this.client_committed_to_send__c = client_committed_to_send__c;
        this.communication_Complete__c = communication_Complete__c;
        this.contract__c = contract__c;
        this.contract__r = contract__r;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.EDDSDBOADMIN_Password__c = EDDSDBOADMIN_Password__c;
        this.EDDSDBO_Password__c = EDDSDBO_Password__c;
        this.environment_Access_Removed__c = environment_Access_Removed__c;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.first_CS_e_mail_sent__c = first_CS_e_mail_sent__c;
        this.follows_Environmental_Optimization_Guide__c = follows_Environmental_Optimization_Guide__c;
        this.front_End_Access__c = front_End_Access__c;
        this.go_Live_Date__c = go_Live_Date__c;
        this.histories = histories;
        this.import_Method__c = import_Method__c;
        this.instance_Full_Name__c = instance_Full_Name__c;
        this.isDeleted = isDeleted;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.last_Deployment_Date__c = last_Deployment_Date__c;
        this.last_Import__c = last_Import__c;
        this.login_Notes__c = login_Notes__c;
        this.method_Installed__c = method_Installed__c;
        this.method_Release__c = method_Release__c;
        this.method_Release__r = method_Release__r;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.owner_of_Communication_Individual__c = owner_of_Communication_Individual__c;
        this.owner_of_Communication_Individual__r = owner_of_Communication_Individual__r;
        this.owner_of_Communication_Team__c = owner_of_Communication_Team__c;
        this.passed_Predeployment__c = passed_Predeployment__c;
        this.pre_Deployment_Check_Notes__c = pre_Deployment_Check_Notes__c;
        this.pre_Deployments__r = pre_Deployments__r;
        this.primary_Instance__c = primary_Instance__c;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.RA_Monthly_Usages__r = RA_Monthly_Usages__r;
        this.recordType = recordType;
        this.recordTypeId = recordTypeId;
        this.relativity_Service_Account_Password__c = relativity_Service_Account_Password__c;
        this.relativity_Service_Account__c = relativity_Service_Account__c;
        this.relativity_System_Admin_Account__c = relativity_System_Admin_Account__c;
        this.relativity_System_Admin_Password__c = relativity_System_Admin_Password__c;
        this.release_Last_Verified__c = release_Last_Verified__c;
        this.release_Version_as_a_Number__c = release_Version_as_a_Number__c;
        this.release__c = release__c;
        this.release__r = release__r;
        this.sales_Billing_Stats_Contact__c = sales_Billing_Stats_Contact__c;
        this.sales_Billing_Stats_Contact__r = sales_Billing_Stats_Contact__r;
        this.salt_vs_Pepper_Deployed__c = salt_vs_Pepper_Deployed__c;
        this.second_CS_e_mail_sent__c = second_CS_e_mail_sent__c;
        this.send_Email__c = send_Email__c;
        this.servers__r = servers__r;
        this.setup_Notes__c = setup_Notes__c;
        this.status__c = status__c;
        this.systemModstamp = systemModstamp;
        this.tickets__r = tickets__r;
        this.type__c = type__c;
        this.type_of_Communication__c = type_of_Communication__c;
        this.unique_Users__r = unique_Users__r;
        this.VM_Instances__r = VM_Instances__r;
        this.VPN_Setup__c = VPN_Setup__c;
        this.VPN_Setup__r = VPN_Setup__r;
        this.web_Service_URL__c = web_Service_URL__c;
        this.kCura_Internal__c = kCura_Internal__c;
        this.kCura_Login_Account__c = kCura_Login_Account__c;
        this.kCura_Login_Password__c = kCura_Login_Password__c;
    }


    /**
     * Gets the account__c value for this Instance__c.
     * 
     * @return account__c
     */
    public java.lang.String getAccount__c() {
        return account__c;
    }


    /**
     * Sets the account__c value for this Instance__c.
     * 
     * @param account__c
     */
    public void setAccount__c(java.lang.String account__c) {
        this.account__c = account__c;
    }


    /**
     * Gets the account__r value for this Instance__c.
     * 
     * @return account__r
     */
    public com.sforce.soap.enterprise.sobject.Account getAccount__r() {
        return account__r;
    }


    /**
     * Sets the account__r value for this Instance__c.
     * 
     * @param account__r
     */
    public void setAccount__r(com.sforce.soap.enterprise.sobject.Account account__r) {
        this.account__r = account__r;
    }


    /**
     * Gets the accounts__r value for this Instance__c.
     * 
     * @return accounts__r
     */
    public com.sforce.soap.enterprise.QueryResult getAccounts__r() {
        return accounts__r;
    }


    /**
     * Sets the accounts__r value for this Instance__c.
     * 
     * @param accounts__r
     */
    public void setAccounts__r(com.sforce.soap.enterprise.QueryResult accounts__r) {
        this.accounts__r = accounts__r;
    }


    /**
     * Gets the application_URL__c value for this Instance__c.
     * 
     * @return application_URL__c
     */
    public java.lang.String getApplication_URL__c() {
        return application_URL__c;
    }


    /**
     * Sets the application_URL__c value for this Instance__c.
     * 
     * @param application_URL__c
     */
    public void setApplication_URL__c(java.lang.String application_URL__c) {
        this.application_URL__c = application_URL__c;
    }


    /**
     * Gets the application_Version__c value for this Instance__c.
     * 
     * @return application_Version__c
     */
    public java.lang.String getApplication_Version__c() {
        return application_Version__c;
    }


    /**
     * Sets the application_Version__c value for this Instance__c.
     * 
     * @param application_Version__c
     */
    public void setApplication_Version__c(java.lang.String application_Version__c) {
        this.application_Version__c = application_Version__c;
    }


    /**
     * Gets the application__c value for this Instance__c.
     * 
     * @return application__c
     */
    public java.lang.String getApplication__c() {
        return application__c;
    }


    /**
     * Sets the application__c value for this Instance__c.
     * 
     * @param application__c
     */
    public void setApplication__c(java.lang.String application__c) {
        this.application__c = application__c;
    }


    /**
     * Gets the applications_Installed__c value for this Instance__c.
     * 
     * @return applications_Installed__c
     */
    public java.lang.String getApplications_Installed__c() {
        return applications_Installed__c;
    }


    /**
     * Sets the applications_Installed__c value for this Instance__c.
     * 
     * @param applications_Installed__c
     */
    public void setApplications_Installed__c(java.lang.String applications_Installed__c) {
        this.applications_Installed__c = applications_Installed__c;
    }


    /**
     * Gets the attachments value for this Instance__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Instance__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the back_End_Access__c value for this Instance__c.
     * 
     * @return back_End_Access__c
     */
    public java.lang.String getBack_End_Access__c() {
        return back_End_Access__c;
    }


    /**
     * Sets the back_End_Access__c value for this Instance__c.
     * 
     * @param back_End_Access__c
     */
    public void setBack_End_Access__c(java.lang.String back_End_Access__c) {
        this.back_End_Access__c = back_End_Access__c;
    }


    /**
     * Gets the billing_Stats_Contact__c value for this Instance__c.
     * 
     * @return billing_Stats_Contact__c
     */
    public java.lang.String getBilling_Stats_Contact__c() {
        return billing_Stats_Contact__c;
    }


    /**
     * Sets the billing_Stats_Contact__c value for this Instance__c.
     * 
     * @param billing_Stats_Contact__c
     */
    public void setBilling_Stats_Contact__c(java.lang.String billing_Stats_Contact__c) {
        this.billing_Stats_Contact__c = billing_Stats_Contact__c;
    }


    /**
     * Gets the billing_Stats_Contact__r value for this Instance__c.
     * 
     * @return billing_Stats_Contact__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getBilling_Stats_Contact__r() {
        return billing_Stats_Contact__r;
    }


    /**
     * Sets the billing_Stats_Contact__r value for this Instance__c.
     * 
     * @param billing_Stats_Contact__r
     */
    public void setBilling_Stats_Contact__r(com.sforce.soap.enterprise.sobject.Contact billing_Stats_Contact__r) {
        this.billing_Stats_Contact__r = billing_Stats_Contact__r;
    }


    /**
     * Gets the CAP_Notes__c value for this Instance__c.
     * 
     * @return CAP_Notes__c
     */
    public java.lang.String getCAP_Notes__c() {
        return CAP_Notes__c;
    }


    /**
     * Sets the CAP_Notes__c value for this Instance__c.
     * 
     * @param CAP_Notes__c
     */
    public void setCAP_Notes__c(java.lang.String CAP_Notes__c) {
        this.CAP_Notes__c = CAP_Notes__c;
    }


    /**
     * Gets the client_Contact_Name__c value for this Instance__c.
     * 
     * @return client_Contact_Name__c
     */
    public java.lang.String getClient_Contact_Name__c() {
        return client_Contact_Name__c;
    }


    /**
     * Sets the client_Contact_Name__c value for this Instance__c.
     * 
     * @param client_Contact_Name__c
     */
    public void setClient_Contact_Name__c(java.lang.String client_Contact_Name__c) {
        this.client_Contact_Name__c = client_Contact_Name__c;
    }


    /**
     * Gets the client_E_Mail_Address__c value for this Instance__c.
     * 
     * @return client_E_Mail_Address__c
     */
    public java.lang.String getClient_E_Mail_Address__c() {
        return client_E_Mail_Address__c;
    }


    /**
     * Sets the client_E_Mail_Address__c value for this Instance__c.
     * 
     * @param client_E_Mail_Address__c
     */
    public void setClient_E_Mail_Address__c(java.lang.String client_E_Mail_Address__c) {
        this.client_E_Mail_Address__c = client_E_Mail_Address__c;
    }


    /**
     * Gets the client_Type__c value for this Instance__c.
     * 
     * @return client_Type__c
     */
    public java.lang.String getClient_Type__c() {
        return client_Type__c;
    }


    /**
     * Sets the client_Type__c value for this Instance__c.
     * 
     * @param client_Type__c
     */
    public void setClient_Type__c(java.lang.String client_Type__c) {
        this.client_Type__c = client_Type__c;
    }


    /**
     * Gets the client_committed_to_send__c value for this Instance__c.
     * 
     * @return client_committed_to_send__c
     */
    public java.util.Date getClient_committed_to_send__c() {
        return client_committed_to_send__c;
    }


    /**
     * Sets the client_committed_to_send__c value for this Instance__c.
     * 
     * @param client_committed_to_send__c
     */
    public void setClient_committed_to_send__c(java.util.Date client_committed_to_send__c) {
        this.client_committed_to_send__c = client_committed_to_send__c;
    }


    /**
     * Gets the communication_Complete__c value for this Instance__c.
     * 
     * @return communication_Complete__c
     */
    public java.lang.String getCommunication_Complete__c() {
        return communication_Complete__c;
    }


    /**
     * Sets the communication_Complete__c value for this Instance__c.
     * 
     * @param communication_Complete__c
     */
    public void setCommunication_Complete__c(java.lang.String communication_Complete__c) {
        this.communication_Complete__c = communication_Complete__c;
    }


    /**
     * Gets the contract__c value for this Instance__c.
     * 
     * @return contract__c
     */
    public java.lang.String getContract__c() {
        return contract__c;
    }


    /**
     * Sets the contract__c value for this Instance__c.
     * 
     * @param contract__c
     */
    public void setContract__c(java.lang.String contract__c) {
        this.contract__c = contract__c;
    }


    /**
     * Gets the contract__r value for this Instance__c.
     * 
     * @return contract__r
     */
    public com.sforce.soap.enterprise.sobject.Contract getContract__r() {
        return contract__r;
    }


    /**
     * Sets the contract__r value for this Instance__c.
     * 
     * @param contract__r
     */
    public void setContract__r(com.sforce.soap.enterprise.sobject.Contract contract__r) {
        this.contract__r = contract__r;
    }


    /**
     * Gets the createdBy value for this Instance__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Instance__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Instance__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Instance__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Instance__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Instance__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the EDDSDBOADMIN_Password__c value for this Instance__c.
     * 
     * @return EDDSDBOADMIN_Password__c
     */
    public java.lang.String getEDDSDBOADMIN_Password__c() {
        return EDDSDBOADMIN_Password__c;
    }


    /**
     * Sets the EDDSDBOADMIN_Password__c value for this Instance__c.
     * 
     * @param EDDSDBOADMIN_Password__c
     */
    public void setEDDSDBOADMIN_Password__c(java.lang.String EDDSDBOADMIN_Password__c) {
        this.EDDSDBOADMIN_Password__c = EDDSDBOADMIN_Password__c;
    }


    /**
     * Gets the EDDSDBO_Password__c value for this Instance__c.
     * 
     * @return EDDSDBO_Password__c
     */
    public java.lang.String getEDDSDBO_Password__c() {
        return EDDSDBO_Password__c;
    }


    /**
     * Sets the EDDSDBO_Password__c value for this Instance__c.
     * 
     * @param EDDSDBO_Password__c
     */
    public void setEDDSDBO_Password__c(java.lang.String EDDSDBO_Password__c) {
        this.EDDSDBO_Password__c = EDDSDBO_Password__c;
    }


    /**
     * Gets the environment_Access_Removed__c value for this Instance__c.
     * 
     * @return environment_Access_Removed__c
     */
    public java.lang.String getEnvironment_Access_Removed__c() {
        return environment_Access_Removed__c;
    }


    /**
     * Sets the environment_Access_Removed__c value for this Instance__c.
     * 
     * @param environment_Access_Removed__c
     */
    public void setEnvironment_Access_Removed__c(java.lang.String environment_Access_Removed__c) {
        this.environment_Access_Removed__c = environment_Access_Removed__c;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Instance__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Instance__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the first_CS_e_mail_sent__c value for this Instance__c.
     * 
     * @return first_CS_e_mail_sent__c
     */
    public java.util.Date getFirst_CS_e_mail_sent__c() {
        return first_CS_e_mail_sent__c;
    }


    /**
     * Sets the first_CS_e_mail_sent__c value for this Instance__c.
     * 
     * @param first_CS_e_mail_sent__c
     */
    public void setFirst_CS_e_mail_sent__c(java.util.Date first_CS_e_mail_sent__c) {
        this.first_CS_e_mail_sent__c = first_CS_e_mail_sent__c;
    }


    /**
     * Gets the follows_Environmental_Optimization_Guide__c value for this Instance__c.
     * 
     * @return follows_Environmental_Optimization_Guide__c
     */
    public java.lang.Boolean getFollows_Environmental_Optimization_Guide__c() {
        return follows_Environmental_Optimization_Guide__c;
    }


    /**
     * Sets the follows_Environmental_Optimization_Guide__c value for this Instance__c.
     * 
     * @param follows_Environmental_Optimization_Guide__c
     */
    public void setFollows_Environmental_Optimization_Guide__c(java.lang.Boolean follows_Environmental_Optimization_Guide__c) {
        this.follows_Environmental_Optimization_Guide__c = follows_Environmental_Optimization_Guide__c;
    }


    /**
     * Gets the front_End_Access__c value for this Instance__c.
     * 
     * @return front_End_Access__c
     */
    public java.lang.String getFront_End_Access__c() {
        return front_End_Access__c;
    }


    /**
     * Sets the front_End_Access__c value for this Instance__c.
     * 
     * @param front_End_Access__c
     */
    public void setFront_End_Access__c(java.lang.String front_End_Access__c) {
        this.front_End_Access__c = front_End_Access__c;
    }


    /**
     * Gets the go_Live_Date__c value for this Instance__c.
     * 
     * @return go_Live_Date__c
     */
    public java.util.Date getGo_Live_Date__c() {
        return go_Live_Date__c;
    }


    /**
     * Sets the go_Live_Date__c value for this Instance__c.
     * 
     * @param go_Live_Date__c
     */
    public void setGo_Live_Date__c(java.util.Date go_Live_Date__c) {
        this.go_Live_Date__c = go_Live_Date__c;
    }


    /**
     * Gets the histories value for this Instance__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Instance__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the import_Method__c value for this Instance__c.
     * 
     * @return import_Method__c
     */
    public java.lang.String getImport_Method__c() {
        return import_Method__c;
    }


    /**
     * Sets the import_Method__c value for this Instance__c.
     * 
     * @param import_Method__c
     */
    public void setImport_Method__c(java.lang.String import_Method__c) {
        this.import_Method__c = import_Method__c;
    }


    /**
     * Gets the instance_Full_Name__c value for this Instance__c.
     * 
     * @return instance_Full_Name__c
     */
    public java.lang.String getInstance_Full_Name__c() {
        return instance_Full_Name__c;
    }


    /**
     * Sets the instance_Full_Name__c value for this Instance__c.
     * 
     * @param instance_Full_Name__c
     */
    public void setInstance_Full_Name__c(java.lang.String instance_Full_Name__c) {
        this.instance_Full_Name__c = instance_Full_Name__c;
    }


    /**
     * Gets the isDeleted value for this Instance__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Instance__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this Instance__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Instance__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Instance__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Instance__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Instance__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Instance__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the last_Deployment_Date__c value for this Instance__c.
     * 
     * @return last_Deployment_Date__c
     */
    public java.util.Date getLast_Deployment_Date__c() {
        return last_Deployment_Date__c;
    }


    /**
     * Sets the last_Deployment_Date__c value for this Instance__c.
     * 
     * @param last_Deployment_Date__c
     */
    public void setLast_Deployment_Date__c(java.util.Date last_Deployment_Date__c) {
        this.last_Deployment_Date__c = last_Deployment_Date__c;
    }


    /**
     * Gets the last_Import__c value for this Instance__c.
     * 
     * @return last_Import__c
     */
    public java.util.Date getLast_Import__c() {
        return last_Import__c;
    }


    /**
     * Sets the last_Import__c value for this Instance__c.
     * 
     * @param last_Import__c
     */
    public void setLast_Import__c(java.util.Date last_Import__c) {
        this.last_Import__c = last_Import__c;
    }


    /**
     * Gets the login_Notes__c value for this Instance__c.
     * 
     * @return login_Notes__c
     */
    public java.lang.String getLogin_Notes__c() {
        return login_Notes__c;
    }


    /**
     * Sets the login_Notes__c value for this Instance__c.
     * 
     * @param login_Notes__c
     */
    public void setLogin_Notes__c(java.lang.String login_Notes__c) {
        this.login_Notes__c = login_Notes__c;
    }


    /**
     * Gets the method_Installed__c value for this Instance__c.
     * 
     * @return method_Installed__c
     */
    public java.lang.String getMethod_Installed__c() {
        return method_Installed__c;
    }


    /**
     * Sets the method_Installed__c value for this Instance__c.
     * 
     * @param method_Installed__c
     */
    public void setMethod_Installed__c(java.lang.String method_Installed__c) {
        this.method_Installed__c = method_Installed__c;
    }


    /**
     * Gets the method_Release__c value for this Instance__c.
     * 
     * @return method_Release__c
     */
    public java.lang.String getMethod_Release__c() {
        return method_Release__c;
    }


    /**
     * Sets the method_Release__c value for this Instance__c.
     * 
     * @param method_Release__c
     */
    public void setMethod_Release__c(java.lang.String method_Release__c) {
        this.method_Release__c = method_Release__c;
    }


    /**
     * Gets the method_Release__r value for this Instance__c.
     * 
     * @return method_Release__r
     */
    public com.sforce.soap.enterprise.sobject.Release__c getMethod_Release__r() {
        return method_Release__r;
    }


    /**
     * Sets the method_Release__r value for this Instance__c.
     * 
     * @param method_Release__r
     */
    public void setMethod_Release__r(com.sforce.soap.enterprise.sobject.Release__c method_Release__r) {
        this.method_Release__r = method_Release__r;
    }


    /**
     * Gets the name value for this Instance__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Instance__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Instance__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Instance__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Instance__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Instance__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the owner_of_Communication_Individual__c value for this Instance__c.
     * 
     * @return owner_of_Communication_Individual__c
     */
    public java.lang.String getOwner_of_Communication_Individual__c() {
        return owner_of_Communication_Individual__c;
    }


    /**
     * Sets the owner_of_Communication_Individual__c value for this Instance__c.
     * 
     * @param owner_of_Communication_Individual__c
     */
    public void setOwner_of_Communication_Individual__c(java.lang.String owner_of_Communication_Individual__c) {
        this.owner_of_Communication_Individual__c = owner_of_Communication_Individual__c;
    }


    /**
     * Gets the owner_of_Communication_Individual__r value for this Instance__c.
     * 
     * @return owner_of_Communication_Individual__r
     */
    public com.sforce.soap.enterprise.sobject.User getOwner_of_Communication_Individual__r() {
        return owner_of_Communication_Individual__r;
    }


    /**
     * Sets the owner_of_Communication_Individual__r value for this Instance__c.
     * 
     * @param owner_of_Communication_Individual__r
     */
    public void setOwner_of_Communication_Individual__r(com.sforce.soap.enterprise.sobject.User owner_of_Communication_Individual__r) {
        this.owner_of_Communication_Individual__r = owner_of_Communication_Individual__r;
    }


    /**
     * Gets the owner_of_Communication_Team__c value for this Instance__c.
     * 
     * @return owner_of_Communication_Team__c
     */
    public java.lang.String getOwner_of_Communication_Team__c() {
        return owner_of_Communication_Team__c;
    }


    /**
     * Sets the owner_of_Communication_Team__c value for this Instance__c.
     * 
     * @param owner_of_Communication_Team__c
     */
    public void setOwner_of_Communication_Team__c(java.lang.String owner_of_Communication_Team__c) {
        this.owner_of_Communication_Team__c = owner_of_Communication_Team__c;
    }


    /**
     * Gets the passed_Predeployment__c value for this Instance__c.
     * 
     * @return passed_Predeployment__c
     */
    public java.lang.Boolean getPassed_Predeployment__c() {
        return passed_Predeployment__c;
    }


    /**
     * Sets the passed_Predeployment__c value for this Instance__c.
     * 
     * @param passed_Predeployment__c
     */
    public void setPassed_Predeployment__c(java.lang.Boolean passed_Predeployment__c) {
        this.passed_Predeployment__c = passed_Predeployment__c;
    }


    /**
     * Gets the pre_Deployment_Check_Notes__c value for this Instance__c.
     * 
     * @return pre_Deployment_Check_Notes__c
     */
    public java.lang.String getPre_Deployment_Check_Notes__c() {
        return pre_Deployment_Check_Notes__c;
    }


    /**
     * Sets the pre_Deployment_Check_Notes__c value for this Instance__c.
     * 
     * @param pre_Deployment_Check_Notes__c
     */
    public void setPre_Deployment_Check_Notes__c(java.lang.String pre_Deployment_Check_Notes__c) {
        this.pre_Deployment_Check_Notes__c = pre_Deployment_Check_Notes__c;
    }


    /**
     * Gets the pre_Deployments__r value for this Instance__c.
     * 
     * @return pre_Deployments__r
     */
    public com.sforce.soap.enterprise.QueryResult getPre_Deployments__r() {
        return pre_Deployments__r;
    }


    /**
     * Sets the pre_Deployments__r value for this Instance__c.
     * 
     * @param pre_Deployments__r
     */
    public void setPre_Deployments__r(com.sforce.soap.enterprise.QueryResult pre_Deployments__r) {
        this.pre_Deployments__r = pre_Deployments__r;
    }


    /**
     * Gets the primary_Instance__c value for this Instance__c.
     * 
     * @return primary_Instance__c
     */
    public java.lang.Boolean getPrimary_Instance__c() {
        return primary_Instance__c;
    }


    /**
     * Sets the primary_Instance__c value for this Instance__c.
     * 
     * @param primary_Instance__c
     */
    public void setPrimary_Instance__c(java.lang.Boolean primary_Instance__c) {
        this.primary_Instance__c = primary_Instance__c;
    }


    /**
     * Gets the processInstances value for this Instance__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Instance__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Instance__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Instance__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the RA_Monthly_Usages__r value for this Instance__c.
     * 
     * @return RA_Monthly_Usages__r
     */
    public com.sforce.soap.enterprise.QueryResult getRA_Monthly_Usages__r() {
        return RA_Monthly_Usages__r;
    }


    /**
     * Sets the RA_Monthly_Usages__r value for this Instance__c.
     * 
     * @param RA_Monthly_Usages__r
     */
    public void setRA_Monthly_Usages__r(com.sforce.soap.enterprise.QueryResult RA_Monthly_Usages__r) {
        this.RA_Monthly_Usages__r = RA_Monthly_Usages__r;
    }


    /**
     * Gets the recordType value for this Instance__c.
     * 
     * @return recordType
     */
    public com.sforce.soap.enterprise.sobject.RecordType getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this Instance__c.
     * 
     * @param recordType
     */
    public void setRecordType(com.sforce.soap.enterprise.sobject.RecordType recordType) {
        this.recordType = recordType;
    }


    /**
     * Gets the recordTypeId value for this Instance__c.
     * 
     * @return recordTypeId
     */
    public java.lang.String getRecordTypeId() {
        return recordTypeId;
    }


    /**
     * Sets the recordTypeId value for this Instance__c.
     * 
     * @param recordTypeId
     */
    public void setRecordTypeId(java.lang.String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }


    /**
     * Gets the relativity_Service_Account_Password__c value for this Instance__c.
     * 
     * @return relativity_Service_Account_Password__c
     */
    public java.lang.String getRelativity_Service_Account_Password__c() {
        return relativity_Service_Account_Password__c;
    }


    /**
     * Sets the relativity_Service_Account_Password__c value for this Instance__c.
     * 
     * @param relativity_Service_Account_Password__c
     */
    public void setRelativity_Service_Account_Password__c(java.lang.String relativity_Service_Account_Password__c) {
        this.relativity_Service_Account_Password__c = relativity_Service_Account_Password__c;
    }


    /**
     * Gets the relativity_Service_Account__c value for this Instance__c.
     * 
     * @return relativity_Service_Account__c
     */
    public java.lang.String getRelativity_Service_Account__c() {
        return relativity_Service_Account__c;
    }


    /**
     * Sets the relativity_Service_Account__c value for this Instance__c.
     * 
     * @param relativity_Service_Account__c
     */
    public void setRelativity_Service_Account__c(java.lang.String relativity_Service_Account__c) {
        this.relativity_Service_Account__c = relativity_Service_Account__c;
    }


    /**
     * Gets the relativity_System_Admin_Account__c value for this Instance__c.
     * 
     * @return relativity_System_Admin_Account__c
     */
    public java.lang.String getRelativity_System_Admin_Account__c() {
        return relativity_System_Admin_Account__c;
    }


    /**
     * Sets the relativity_System_Admin_Account__c value for this Instance__c.
     * 
     * @param relativity_System_Admin_Account__c
     */
    public void setRelativity_System_Admin_Account__c(java.lang.String relativity_System_Admin_Account__c) {
        this.relativity_System_Admin_Account__c = relativity_System_Admin_Account__c;
    }


    /**
     * Gets the relativity_System_Admin_Password__c value for this Instance__c.
     * 
     * @return relativity_System_Admin_Password__c
     */
    public java.lang.String getRelativity_System_Admin_Password__c() {
        return relativity_System_Admin_Password__c;
    }


    /**
     * Sets the relativity_System_Admin_Password__c value for this Instance__c.
     * 
     * @param relativity_System_Admin_Password__c
     */
    public void setRelativity_System_Admin_Password__c(java.lang.String relativity_System_Admin_Password__c) {
        this.relativity_System_Admin_Password__c = relativity_System_Admin_Password__c;
    }


    /**
     * Gets the release_Last_Verified__c value for this Instance__c.
     * 
     * @return release_Last_Verified__c
     */
    public java.util.Date getRelease_Last_Verified__c() {
        return release_Last_Verified__c;
    }


    /**
     * Sets the release_Last_Verified__c value for this Instance__c.
     * 
     * @param release_Last_Verified__c
     */
    public void setRelease_Last_Verified__c(java.util.Date release_Last_Verified__c) {
        this.release_Last_Verified__c = release_Last_Verified__c;
    }


    /**
     * Gets the release_Version_as_a_Number__c value for this Instance__c.
     * 
     * @return release_Version_as_a_Number__c
     */
    public java.lang.Double getRelease_Version_as_a_Number__c() {
        return release_Version_as_a_Number__c;
    }


    /**
     * Sets the release_Version_as_a_Number__c value for this Instance__c.
     * 
     * @param release_Version_as_a_Number__c
     */
    public void setRelease_Version_as_a_Number__c(java.lang.Double release_Version_as_a_Number__c) {
        this.release_Version_as_a_Number__c = release_Version_as_a_Number__c;
    }


    /**
     * Gets the release__c value for this Instance__c.
     * 
     * @return release__c
     */
    public java.lang.String getRelease__c() {
        return release__c;
    }


    /**
     * Sets the release__c value for this Instance__c.
     * 
     * @param release__c
     */
    public void setRelease__c(java.lang.String release__c) {
        this.release__c = release__c;
    }


    /**
     * Gets the release__r value for this Instance__c.
     * 
     * @return release__r
     */
    public com.sforce.soap.enterprise.sobject.Release__c getRelease__r() {
        return release__r;
    }


    /**
     * Sets the release__r value for this Instance__c.
     * 
     * @param release__r
     */
    public void setRelease__r(com.sforce.soap.enterprise.sobject.Release__c release__r) {
        this.release__r = release__r;
    }


    /**
     * Gets the sales_Billing_Stats_Contact__c value for this Instance__c.
     * 
     * @return sales_Billing_Stats_Contact__c
     */
    public java.lang.String getSales_Billing_Stats_Contact__c() {
        return sales_Billing_Stats_Contact__c;
    }


    /**
     * Sets the sales_Billing_Stats_Contact__c value for this Instance__c.
     * 
     * @param sales_Billing_Stats_Contact__c
     */
    public void setSales_Billing_Stats_Contact__c(java.lang.String sales_Billing_Stats_Contact__c) {
        this.sales_Billing_Stats_Contact__c = sales_Billing_Stats_Contact__c;
    }


    /**
     * Gets the sales_Billing_Stats_Contact__r value for this Instance__c.
     * 
     * @return sales_Billing_Stats_Contact__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getSales_Billing_Stats_Contact__r() {
        return sales_Billing_Stats_Contact__r;
    }


    /**
     * Sets the sales_Billing_Stats_Contact__r value for this Instance__c.
     * 
     * @param sales_Billing_Stats_Contact__r
     */
    public void setSales_Billing_Stats_Contact__r(com.sforce.soap.enterprise.sobject.Contact sales_Billing_Stats_Contact__r) {
        this.sales_Billing_Stats_Contact__r = sales_Billing_Stats_Contact__r;
    }


    /**
     * Gets the salt_vs_Pepper_Deployed__c value for this Instance__c.
     * 
     * @return salt_vs_Pepper_Deployed__c
     */
    public java.lang.String getSalt_vs_Pepper_Deployed__c() {
        return salt_vs_Pepper_Deployed__c;
    }


    /**
     * Sets the salt_vs_Pepper_Deployed__c value for this Instance__c.
     * 
     * @param salt_vs_Pepper_Deployed__c
     */
    public void setSalt_vs_Pepper_Deployed__c(java.lang.String salt_vs_Pepper_Deployed__c) {
        this.salt_vs_Pepper_Deployed__c = salt_vs_Pepper_Deployed__c;
    }


    /**
     * Gets the second_CS_e_mail_sent__c value for this Instance__c.
     * 
     * @return second_CS_e_mail_sent__c
     */
    public java.util.Date getSecond_CS_e_mail_sent__c() {
        return second_CS_e_mail_sent__c;
    }


    /**
     * Sets the second_CS_e_mail_sent__c value for this Instance__c.
     * 
     * @param second_CS_e_mail_sent__c
     */
    public void setSecond_CS_e_mail_sent__c(java.util.Date second_CS_e_mail_sent__c) {
        this.second_CS_e_mail_sent__c = second_CS_e_mail_sent__c;
    }


    /**
     * Gets the send_Email__c value for this Instance__c.
     * 
     * @return send_Email__c
     */
    public java.lang.Boolean getSend_Email__c() {
        return send_Email__c;
    }


    /**
     * Sets the send_Email__c value for this Instance__c.
     * 
     * @param send_Email__c
     */
    public void setSend_Email__c(java.lang.Boolean send_Email__c) {
        this.send_Email__c = send_Email__c;
    }


    /**
     * Gets the servers__r value for this Instance__c.
     * 
     * @return servers__r
     */
    public com.sforce.soap.enterprise.QueryResult getServers__r() {
        return servers__r;
    }


    /**
     * Sets the servers__r value for this Instance__c.
     * 
     * @param servers__r
     */
    public void setServers__r(com.sforce.soap.enterprise.QueryResult servers__r) {
        this.servers__r = servers__r;
    }


    /**
     * Gets the setup_Notes__c value for this Instance__c.
     * 
     * @return setup_Notes__c
     */
    public java.lang.String getSetup_Notes__c() {
        return setup_Notes__c;
    }


    /**
     * Sets the setup_Notes__c value for this Instance__c.
     * 
     * @param setup_Notes__c
     */
    public void setSetup_Notes__c(java.lang.String setup_Notes__c) {
        this.setup_Notes__c = setup_Notes__c;
    }


    /**
     * Gets the status__c value for this Instance__c.
     * 
     * @return status__c
     */
    public java.lang.String getStatus__c() {
        return status__c;
    }


    /**
     * Sets the status__c value for this Instance__c.
     * 
     * @param status__c
     */
    public void setStatus__c(java.lang.String status__c) {
        this.status__c = status__c;
    }


    /**
     * Gets the systemModstamp value for this Instance__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Instance__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tickets__r value for this Instance__c.
     * 
     * @return tickets__r
     */
    public com.sforce.soap.enterprise.QueryResult getTickets__r() {
        return tickets__r;
    }


    /**
     * Sets the tickets__r value for this Instance__c.
     * 
     * @param tickets__r
     */
    public void setTickets__r(com.sforce.soap.enterprise.QueryResult tickets__r) {
        this.tickets__r = tickets__r;
    }


    /**
     * Gets the type__c value for this Instance__c.
     * 
     * @return type__c
     */
    public java.lang.String getType__c() {
        return type__c;
    }


    /**
     * Sets the type__c value for this Instance__c.
     * 
     * @param type__c
     */
    public void setType__c(java.lang.String type__c) {
        this.type__c = type__c;
    }


    /**
     * Gets the type_of_Communication__c value for this Instance__c.
     * 
     * @return type_of_Communication__c
     */
    public java.lang.String getType_of_Communication__c() {
        return type_of_Communication__c;
    }


    /**
     * Sets the type_of_Communication__c value for this Instance__c.
     * 
     * @param type_of_Communication__c
     */
    public void setType_of_Communication__c(java.lang.String type_of_Communication__c) {
        this.type_of_Communication__c = type_of_Communication__c;
    }


    /**
     * Gets the unique_Users__r value for this Instance__c.
     * 
     * @return unique_Users__r
     */
    public com.sforce.soap.enterprise.QueryResult getUnique_Users__r() {
        return unique_Users__r;
    }


    /**
     * Sets the unique_Users__r value for this Instance__c.
     * 
     * @param unique_Users__r
     */
    public void setUnique_Users__r(com.sforce.soap.enterprise.QueryResult unique_Users__r) {
        this.unique_Users__r = unique_Users__r;
    }


    /**
     * Gets the VM_Instances__r value for this Instance__c.
     * 
     * @return VM_Instances__r
     */
    public com.sforce.soap.enterprise.QueryResult getVM_Instances__r() {
        return VM_Instances__r;
    }


    /**
     * Sets the VM_Instances__r value for this Instance__c.
     * 
     * @param VM_Instances__r
     */
    public void setVM_Instances__r(com.sforce.soap.enterprise.QueryResult VM_Instances__r) {
        this.VM_Instances__r = VM_Instances__r;
    }


    /**
     * Gets the VPN_Setup__c value for this Instance__c.
     * 
     * @return VPN_Setup__c
     */
    public java.lang.String getVPN_Setup__c() {
        return VPN_Setup__c;
    }


    /**
     * Sets the VPN_Setup__c value for this Instance__c.
     * 
     * @param VPN_Setup__c
     */
    public void setVPN_Setup__c(java.lang.String VPN_Setup__c) {
        this.VPN_Setup__c = VPN_Setup__c;
    }


    /**
     * Gets the VPN_Setup__r value for this Instance__c.
     * 
     * @return VPN_Setup__r
     */
    public com.sforce.soap.enterprise.sobject.VPN_Setup__c getVPN_Setup__r() {
        return VPN_Setup__r;
    }


    /**
     * Sets the VPN_Setup__r value for this Instance__c.
     * 
     * @param VPN_Setup__r
     */
    public void setVPN_Setup__r(com.sforce.soap.enterprise.sobject.VPN_Setup__c VPN_Setup__r) {
        this.VPN_Setup__r = VPN_Setup__r;
    }


    /**
     * Gets the web_Service_URL__c value for this Instance__c.
     * 
     * @return web_Service_URL__c
     */
    public java.lang.String getWeb_Service_URL__c() {
        return web_Service_URL__c;
    }


    /**
     * Sets the web_Service_URL__c value for this Instance__c.
     * 
     * @param web_Service_URL__c
     */
    public void setWeb_Service_URL__c(java.lang.String web_Service_URL__c) {
        this.web_Service_URL__c = web_Service_URL__c;
    }


    /**
     * Gets the kCura_Internal__c value for this Instance__c.
     * 
     * @return kCura_Internal__c
     */
    public java.lang.Boolean getKCura_Internal__c() {
        return kCura_Internal__c;
    }


    /**
     * Sets the kCura_Internal__c value for this Instance__c.
     * 
     * @param kCura_Internal__c
     */
    public void setKCura_Internal__c(java.lang.Boolean kCura_Internal__c) {
        this.kCura_Internal__c = kCura_Internal__c;
    }


    /**
     * Gets the kCura_Login_Account__c value for this Instance__c.
     * 
     * @return kCura_Login_Account__c
     */
    public java.lang.String getKCura_Login_Account__c() {
        return kCura_Login_Account__c;
    }


    /**
     * Sets the kCura_Login_Account__c value for this Instance__c.
     * 
     * @param kCura_Login_Account__c
     */
    public void setKCura_Login_Account__c(java.lang.String kCura_Login_Account__c) {
        this.kCura_Login_Account__c = kCura_Login_Account__c;
    }


    /**
     * Gets the kCura_Login_Password__c value for this Instance__c.
     * 
     * @return kCura_Login_Password__c
     */
    public java.lang.String getKCura_Login_Password__c() {
        return kCura_Login_Password__c;
    }


    /**
     * Sets the kCura_Login_Password__c value for this Instance__c.
     * 
     * @param kCura_Login_Password__c
     */
    public void setKCura_Login_Password__c(java.lang.String kCura_Login_Password__c) {
        this.kCura_Login_Password__c = kCura_Login_Password__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Instance__c)) return false;
        Instance__c other = (Instance__c) obj;
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
            ((this.accounts__r==null && other.getAccounts__r()==null) || 
             (this.accounts__r!=null &&
              this.accounts__r.equals(other.getAccounts__r()))) &&
            ((this.application_URL__c==null && other.getApplication_URL__c()==null) || 
             (this.application_URL__c!=null &&
              this.application_URL__c.equals(other.getApplication_URL__c()))) &&
            ((this.application_Version__c==null && other.getApplication_Version__c()==null) || 
             (this.application_Version__c!=null &&
              this.application_Version__c.equals(other.getApplication_Version__c()))) &&
            ((this.application__c==null && other.getApplication__c()==null) || 
             (this.application__c!=null &&
              this.application__c.equals(other.getApplication__c()))) &&
            ((this.applications_Installed__c==null && other.getApplications_Installed__c()==null) || 
             (this.applications_Installed__c!=null &&
              this.applications_Installed__c.equals(other.getApplications_Installed__c()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.back_End_Access__c==null && other.getBack_End_Access__c()==null) || 
             (this.back_End_Access__c!=null &&
              this.back_End_Access__c.equals(other.getBack_End_Access__c()))) &&
            ((this.billing_Stats_Contact__c==null && other.getBilling_Stats_Contact__c()==null) || 
             (this.billing_Stats_Contact__c!=null &&
              this.billing_Stats_Contact__c.equals(other.getBilling_Stats_Contact__c()))) &&
            ((this.billing_Stats_Contact__r==null && other.getBilling_Stats_Contact__r()==null) || 
             (this.billing_Stats_Contact__r!=null &&
              this.billing_Stats_Contact__r.equals(other.getBilling_Stats_Contact__r()))) &&
            ((this.CAP_Notes__c==null && other.getCAP_Notes__c()==null) || 
             (this.CAP_Notes__c!=null &&
              this.CAP_Notes__c.equals(other.getCAP_Notes__c()))) &&
            ((this.client_Contact_Name__c==null && other.getClient_Contact_Name__c()==null) || 
             (this.client_Contact_Name__c!=null &&
              this.client_Contact_Name__c.equals(other.getClient_Contact_Name__c()))) &&
            ((this.client_E_Mail_Address__c==null && other.getClient_E_Mail_Address__c()==null) || 
             (this.client_E_Mail_Address__c!=null &&
              this.client_E_Mail_Address__c.equals(other.getClient_E_Mail_Address__c()))) &&
            ((this.client_Type__c==null && other.getClient_Type__c()==null) || 
             (this.client_Type__c!=null &&
              this.client_Type__c.equals(other.getClient_Type__c()))) &&
            ((this.client_committed_to_send__c==null && other.getClient_committed_to_send__c()==null) || 
             (this.client_committed_to_send__c!=null &&
              this.client_committed_to_send__c.equals(other.getClient_committed_to_send__c()))) &&
            ((this.communication_Complete__c==null && other.getCommunication_Complete__c()==null) || 
             (this.communication_Complete__c!=null &&
              this.communication_Complete__c.equals(other.getCommunication_Complete__c()))) &&
            ((this.contract__c==null && other.getContract__c()==null) || 
             (this.contract__c!=null &&
              this.contract__c.equals(other.getContract__c()))) &&
            ((this.contract__r==null && other.getContract__r()==null) || 
             (this.contract__r!=null &&
              this.contract__r.equals(other.getContract__r()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.EDDSDBOADMIN_Password__c==null && other.getEDDSDBOADMIN_Password__c()==null) || 
             (this.EDDSDBOADMIN_Password__c!=null &&
              this.EDDSDBOADMIN_Password__c.equals(other.getEDDSDBOADMIN_Password__c()))) &&
            ((this.EDDSDBO_Password__c==null && other.getEDDSDBO_Password__c()==null) || 
             (this.EDDSDBO_Password__c!=null &&
              this.EDDSDBO_Password__c.equals(other.getEDDSDBO_Password__c()))) &&
            ((this.environment_Access_Removed__c==null && other.getEnvironment_Access_Removed__c()==null) || 
             (this.environment_Access_Removed__c!=null &&
              this.environment_Access_Removed__c.equals(other.getEnvironment_Access_Removed__c()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.first_CS_e_mail_sent__c==null && other.getFirst_CS_e_mail_sent__c()==null) || 
             (this.first_CS_e_mail_sent__c!=null &&
              this.first_CS_e_mail_sent__c.equals(other.getFirst_CS_e_mail_sent__c()))) &&
            ((this.follows_Environmental_Optimization_Guide__c==null && other.getFollows_Environmental_Optimization_Guide__c()==null) || 
             (this.follows_Environmental_Optimization_Guide__c!=null &&
              this.follows_Environmental_Optimization_Guide__c.equals(other.getFollows_Environmental_Optimization_Guide__c()))) &&
            ((this.front_End_Access__c==null && other.getFront_End_Access__c()==null) || 
             (this.front_End_Access__c!=null &&
              this.front_End_Access__c.equals(other.getFront_End_Access__c()))) &&
            ((this.go_Live_Date__c==null && other.getGo_Live_Date__c()==null) || 
             (this.go_Live_Date__c!=null &&
              this.go_Live_Date__c.equals(other.getGo_Live_Date__c()))) &&
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
            ((this.import_Method__c==null && other.getImport_Method__c()==null) || 
             (this.import_Method__c!=null &&
              this.import_Method__c.equals(other.getImport_Method__c()))) &&
            ((this.instance_Full_Name__c==null && other.getInstance_Full_Name__c()==null) || 
             (this.instance_Full_Name__c!=null &&
              this.instance_Full_Name__c.equals(other.getInstance_Full_Name__c()))) &&
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
            ((this.last_Deployment_Date__c==null && other.getLast_Deployment_Date__c()==null) || 
             (this.last_Deployment_Date__c!=null &&
              this.last_Deployment_Date__c.equals(other.getLast_Deployment_Date__c()))) &&
            ((this.last_Import__c==null && other.getLast_Import__c()==null) || 
             (this.last_Import__c!=null &&
              this.last_Import__c.equals(other.getLast_Import__c()))) &&
            ((this.login_Notes__c==null && other.getLogin_Notes__c()==null) || 
             (this.login_Notes__c!=null &&
              this.login_Notes__c.equals(other.getLogin_Notes__c()))) &&
            ((this.method_Installed__c==null && other.getMethod_Installed__c()==null) || 
             (this.method_Installed__c!=null &&
              this.method_Installed__c.equals(other.getMethod_Installed__c()))) &&
            ((this.method_Release__c==null && other.getMethod_Release__c()==null) || 
             (this.method_Release__c!=null &&
              this.method_Release__c.equals(other.getMethod_Release__c()))) &&
            ((this.method_Release__r==null && other.getMethod_Release__r()==null) || 
             (this.method_Release__r!=null &&
              this.method_Release__r.equals(other.getMethod_Release__r()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.owner_of_Communication_Individual__c==null && other.getOwner_of_Communication_Individual__c()==null) || 
             (this.owner_of_Communication_Individual__c!=null &&
              this.owner_of_Communication_Individual__c.equals(other.getOwner_of_Communication_Individual__c()))) &&
            ((this.owner_of_Communication_Individual__r==null && other.getOwner_of_Communication_Individual__r()==null) || 
             (this.owner_of_Communication_Individual__r!=null &&
              this.owner_of_Communication_Individual__r.equals(other.getOwner_of_Communication_Individual__r()))) &&
            ((this.owner_of_Communication_Team__c==null && other.getOwner_of_Communication_Team__c()==null) || 
             (this.owner_of_Communication_Team__c!=null &&
              this.owner_of_Communication_Team__c.equals(other.getOwner_of_Communication_Team__c()))) &&
            ((this.passed_Predeployment__c==null && other.getPassed_Predeployment__c()==null) || 
             (this.passed_Predeployment__c!=null &&
              this.passed_Predeployment__c.equals(other.getPassed_Predeployment__c()))) &&
            ((this.pre_Deployment_Check_Notes__c==null && other.getPre_Deployment_Check_Notes__c()==null) || 
             (this.pre_Deployment_Check_Notes__c!=null &&
              this.pre_Deployment_Check_Notes__c.equals(other.getPre_Deployment_Check_Notes__c()))) &&
            ((this.pre_Deployments__r==null && other.getPre_Deployments__r()==null) || 
             (this.pre_Deployments__r!=null &&
              this.pre_Deployments__r.equals(other.getPre_Deployments__r()))) &&
            ((this.primary_Instance__c==null && other.getPrimary_Instance__c()==null) || 
             (this.primary_Instance__c!=null &&
              this.primary_Instance__c.equals(other.getPrimary_Instance__c()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.RA_Monthly_Usages__r==null && other.getRA_Monthly_Usages__r()==null) || 
             (this.RA_Monthly_Usages__r!=null &&
              this.RA_Monthly_Usages__r.equals(other.getRA_Monthly_Usages__r()))) &&
            ((this.recordType==null && other.getRecordType()==null) || 
             (this.recordType!=null &&
              this.recordType.equals(other.getRecordType()))) &&
            ((this.recordTypeId==null && other.getRecordTypeId()==null) || 
             (this.recordTypeId!=null &&
              this.recordTypeId.equals(other.getRecordTypeId()))) &&
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
            ((this.release_Last_Verified__c==null && other.getRelease_Last_Verified__c()==null) || 
             (this.release_Last_Verified__c!=null &&
              this.release_Last_Verified__c.equals(other.getRelease_Last_Verified__c()))) &&
            ((this.release_Version_as_a_Number__c==null && other.getRelease_Version_as_a_Number__c()==null) || 
             (this.release_Version_as_a_Number__c!=null &&
              this.release_Version_as_a_Number__c.equals(other.getRelease_Version_as_a_Number__c()))) &&
            ((this.release__c==null && other.getRelease__c()==null) || 
             (this.release__c!=null &&
              this.release__c.equals(other.getRelease__c()))) &&
            ((this.release__r==null && other.getRelease__r()==null) || 
             (this.release__r!=null &&
              this.release__r.equals(other.getRelease__r()))) &&
            ((this.sales_Billing_Stats_Contact__c==null && other.getSales_Billing_Stats_Contact__c()==null) || 
             (this.sales_Billing_Stats_Contact__c!=null &&
              this.sales_Billing_Stats_Contact__c.equals(other.getSales_Billing_Stats_Contact__c()))) &&
            ((this.sales_Billing_Stats_Contact__r==null && other.getSales_Billing_Stats_Contact__r()==null) || 
             (this.sales_Billing_Stats_Contact__r!=null &&
              this.sales_Billing_Stats_Contact__r.equals(other.getSales_Billing_Stats_Contact__r()))) &&
            ((this.salt_vs_Pepper_Deployed__c==null && other.getSalt_vs_Pepper_Deployed__c()==null) || 
             (this.salt_vs_Pepper_Deployed__c!=null &&
              this.salt_vs_Pepper_Deployed__c.equals(other.getSalt_vs_Pepper_Deployed__c()))) &&
            ((this.second_CS_e_mail_sent__c==null && other.getSecond_CS_e_mail_sent__c()==null) || 
             (this.second_CS_e_mail_sent__c!=null &&
              this.second_CS_e_mail_sent__c.equals(other.getSecond_CS_e_mail_sent__c()))) &&
            ((this.send_Email__c==null && other.getSend_Email__c()==null) || 
             (this.send_Email__c!=null &&
              this.send_Email__c.equals(other.getSend_Email__c()))) &&
            ((this.servers__r==null && other.getServers__r()==null) || 
             (this.servers__r!=null &&
              this.servers__r.equals(other.getServers__r()))) &&
            ((this.setup_Notes__c==null && other.getSetup_Notes__c()==null) || 
             (this.setup_Notes__c!=null &&
              this.setup_Notes__c.equals(other.getSetup_Notes__c()))) &&
            ((this.status__c==null && other.getStatus__c()==null) || 
             (this.status__c!=null &&
              this.status__c.equals(other.getStatus__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tickets__r==null && other.getTickets__r()==null) || 
             (this.tickets__r!=null &&
              this.tickets__r.equals(other.getTickets__r()))) &&
            ((this.type__c==null && other.getType__c()==null) || 
             (this.type__c!=null &&
              this.type__c.equals(other.getType__c()))) &&
            ((this.type_of_Communication__c==null && other.getType_of_Communication__c()==null) || 
             (this.type_of_Communication__c!=null &&
              this.type_of_Communication__c.equals(other.getType_of_Communication__c()))) &&
            ((this.unique_Users__r==null && other.getUnique_Users__r()==null) || 
             (this.unique_Users__r!=null &&
              this.unique_Users__r.equals(other.getUnique_Users__r()))) &&
            ((this.VM_Instances__r==null && other.getVM_Instances__r()==null) || 
             (this.VM_Instances__r!=null &&
              this.VM_Instances__r.equals(other.getVM_Instances__r()))) &&
            ((this.VPN_Setup__c==null && other.getVPN_Setup__c()==null) || 
             (this.VPN_Setup__c!=null &&
              this.VPN_Setup__c.equals(other.getVPN_Setup__c()))) &&
            ((this.VPN_Setup__r==null && other.getVPN_Setup__r()==null) || 
             (this.VPN_Setup__r!=null &&
              this.VPN_Setup__r.equals(other.getVPN_Setup__r()))) &&
            ((this.web_Service_URL__c==null && other.getWeb_Service_URL__c()==null) || 
             (this.web_Service_URL__c!=null &&
              this.web_Service_URL__c.equals(other.getWeb_Service_URL__c()))) &&
            ((this.kCura_Internal__c==null && other.getKCura_Internal__c()==null) || 
             (this.kCura_Internal__c!=null &&
              this.kCura_Internal__c.equals(other.getKCura_Internal__c()))) &&
            ((this.kCura_Login_Account__c==null && other.getKCura_Login_Account__c()==null) || 
             (this.kCura_Login_Account__c!=null &&
              this.kCura_Login_Account__c.equals(other.getKCura_Login_Account__c()))) &&
            ((this.kCura_Login_Password__c==null && other.getKCura_Login_Password__c()==null) || 
             (this.kCura_Login_Password__c!=null &&
              this.kCura_Login_Password__c.equals(other.getKCura_Login_Password__c())));
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
        if (getAccounts__r() != null) {
            _hashCode += getAccounts__r().hashCode();
        }
        if (getApplication_URL__c() != null) {
            _hashCode += getApplication_URL__c().hashCode();
        }
        if (getApplication_Version__c() != null) {
            _hashCode += getApplication_Version__c().hashCode();
        }
        if (getApplication__c() != null) {
            _hashCode += getApplication__c().hashCode();
        }
        if (getApplications_Installed__c() != null) {
            _hashCode += getApplications_Installed__c().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getBack_End_Access__c() != null) {
            _hashCode += getBack_End_Access__c().hashCode();
        }
        if (getBilling_Stats_Contact__c() != null) {
            _hashCode += getBilling_Stats_Contact__c().hashCode();
        }
        if (getBilling_Stats_Contact__r() != null) {
            _hashCode += getBilling_Stats_Contact__r().hashCode();
        }
        if (getCAP_Notes__c() != null) {
            _hashCode += getCAP_Notes__c().hashCode();
        }
        if (getClient_Contact_Name__c() != null) {
            _hashCode += getClient_Contact_Name__c().hashCode();
        }
        if (getClient_E_Mail_Address__c() != null) {
            _hashCode += getClient_E_Mail_Address__c().hashCode();
        }
        if (getClient_Type__c() != null) {
            _hashCode += getClient_Type__c().hashCode();
        }
        if (getClient_committed_to_send__c() != null) {
            _hashCode += getClient_committed_to_send__c().hashCode();
        }
        if (getCommunication_Complete__c() != null) {
            _hashCode += getCommunication_Complete__c().hashCode();
        }
        if (getContract__c() != null) {
            _hashCode += getContract__c().hashCode();
        }
        if (getContract__r() != null) {
            _hashCode += getContract__r().hashCode();
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
        if (getEDDSDBOADMIN_Password__c() != null) {
            _hashCode += getEDDSDBOADMIN_Password__c().hashCode();
        }
        if (getEDDSDBO_Password__c() != null) {
            _hashCode += getEDDSDBO_Password__c().hashCode();
        }
        if (getEnvironment_Access_Removed__c() != null) {
            _hashCode += getEnvironment_Access_Removed__c().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getFirst_CS_e_mail_sent__c() != null) {
            _hashCode += getFirst_CS_e_mail_sent__c().hashCode();
        }
        if (getFollows_Environmental_Optimization_Guide__c() != null) {
            _hashCode += getFollows_Environmental_Optimization_Guide__c().hashCode();
        }
        if (getFront_End_Access__c() != null) {
            _hashCode += getFront_End_Access__c().hashCode();
        }
        if (getGo_Live_Date__c() != null) {
            _hashCode += getGo_Live_Date__c().hashCode();
        }
        if (getHistories() != null) {
            _hashCode += getHistories().hashCode();
        }
        if (getImport_Method__c() != null) {
            _hashCode += getImport_Method__c().hashCode();
        }
        if (getInstance_Full_Name__c() != null) {
            _hashCode += getInstance_Full_Name__c().hashCode();
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
        if (getLast_Deployment_Date__c() != null) {
            _hashCode += getLast_Deployment_Date__c().hashCode();
        }
        if (getLast_Import__c() != null) {
            _hashCode += getLast_Import__c().hashCode();
        }
        if (getLogin_Notes__c() != null) {
            _hashCode += getLogin_Notes__c().hashCode();
        }
        if (getMethod_Installed__c() != null) {
            _hashCode += getMethod_Installed__c().hashCode();
        }
        if (getMethod_Release__c() != null) {
            _hashCode += getMethod_Release__c().hashCode();
        }
        if (getMethod_Release__r() != null) {
            _hashCode += getMethod_Release__r().hashCode();
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
        if (getOwner_of_Communication_Individual__c() != null) {
            _hashCode += getOwner_of_Communication_Individual__c().hashCode();
        }
        if (getOwner_of_Communication_Individual__r() != null) {
            _hashCode += getOwner_of_Communication_Individual__r().hashCode();
        }
        if (getOwner_of_Communication_Team__c() != null) {
            _hashCode += getOwner_of_Communication_Team__c().hashCode();
        }
        if (getPassed_Predeployment__c() != null) {
            _hashCode += getPassed_Predeployment__c().hashCode();
        }
        if (getPre_Deployment_Check_Notes__c() != null) {
            _hashCode += getPre_Deployment_Check_Notes__c().hashCode();
        }
        if (getPre_Deployments__r() != null) {
            _hashCode += getPre_Deployments__r().hashCode();
        }
        if (getPrimary_Instance__c() != null) {
            _hashCode += getPrimary_Instance__c().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getRA_Monthly_Usages__r() != null) {
            _hashCode += getRA_Monthly_Usages__r().hashCode();
        }
        if (getRecordType() != null) {
            _hashCode += getRecordType().hashCode();
        }
        if (getRecordTypeId() != null) {
            _hashCode += getRecordTypeId().hashCode();
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
        if (getRelease_Last_Verified__c() != null) {
            _hashCode += getRelease_Last_Verified__c().hashCode();
        }
        if (getRelease_Version_as_a_Number__c() != null) {
            _hashCode += getRelease_Version_as_a_Number__c().hashCode();
        }
        if (getRelease__c() != null) {
            _hashCode += getRelease__c().hashCode();
        }
        if (getRelease__r() != null) {
            _hashCode += getRelease__r().hashCode();
        }
        if (getSales_Billing_Stats_Contact__c() != null) {
            _hashCode += getSales_Billing_Stats_Contact__c().hashCode();
        }
        if (getSales_Billing_Stats_Contact__r() != null) {
            _hashCode += getSales_Billing_Stats_Contact__r().hashCode();
        }
        if (getSalt_vs_Pepper_Deployed__c() != null) {
            _hashCode += getSalt_vs_Pepper_Deployed__c().hashCode();
        }
        if (getSecond_CS_e_mail_sent__c() != null) {
            _hashCode += getSecond_CS_e_mail_sent__c().hashCode();
        }
        if (getSend_Email__c() != null) {
            _hashCode += getSend_Email__c().hashCode();
        }
        if (getServers__r() != null) {
            _hashCode += getServers__r().hashCode();
        }
        if (getSetup_Notes__c() != null) {
            _hashCode += getSetup_Notes__c().hashCode();
        }
        if (getStatus__c() != null) {
            _hashCode += getStatus__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTickets__r() != null) {
            _hashCode += getTickets__r().hashCode();
        }
        if (getType__c() != null) {
            _hashCode += getType__c().hashCode();
        }
        if (getType_of_Communication__c() != null) {
            _hashCode += getType_of_Communication__c().hashCode();
        }
        if (getUnique_Users__r() != null) {
            _hashCode += getUnique_Users__r().hashCode();
        }
        if (getVM_Instances__r() != null) {
            _hashCode += getVM_Instances__r().hashCode();
        }
        if (getVPN_Setup__c() != null) {
            _hashCode += getVPN_Setup__c().hashCode();
        }
        if (getVPN_Setup__r() != null) {
            _hashCode += getVPN_Setup__r().hashCode();
        }
        if (getWeb_Service_URL__c() != null) {
            _hashCode += getWeb_Service_URL__c().hashCode();
        }
        if (getKCura_Internal__c() != null) {
            _hashCode += getKCura_Internal__c().hashCode();
        }
        if (getKCura_Login_Account__c() != null) {
            _hashCode += getKCura_Login_Account__c().hashCode();
        }
        if (getKCura_Login_Password__c() != null) {
            _hashCode += getKCura_Login_Password__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Instance__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Instance__c"));
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
        elemField.setFieldName("accounts__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Accounts__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("application_Version__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Application_Version__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("application__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Application__c"));
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
        elemField.setFieldName("back_End_Access__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Back_End_Access__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billing_Stats_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Billing_Stats_Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billing_Stats_Contact__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Billing_Stats_Contact__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CAP_Notes__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CAP_Notes__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("client_Contact_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Client_Contact_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("client_E_Mail_Address__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Client_E_Mail_Address__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("client_committed_to_send__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Client_committed_to_send__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communication_Complete__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Communication_Complete__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contract__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contract__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contract__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contract__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contract"));
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
        elemField.setFieldName("EDDSDBOADMIN_Password__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EDDSDBOADMIN_Password__c"));
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
        elemField.setFieldName("environment_Access_Removed__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Environment_Access_Removed__c"));
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
        elemField.setFieldName("first_CS_e_mail_sent__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "First_CS_e_mail_sent__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("follows_Environmental_Optimization_Guide__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Follows_Environmental_Optimization_Guide__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("front_End_Access__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Front_End_Access__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("go_Live_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Go_Live_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("import_Method__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Import_Method__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instance_Full_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Instance_Full_Name__c"));
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
        elemField.setFieldName("last_Deployment_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Last_Deployment_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last_Import__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Last_Import__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login_Notes__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Login_Notes__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("method_Installed__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Method_Installed__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("method_Release__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Method_Release__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("method_Release__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Method_Release__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Release__c"));
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
        elemField.setFieldName("owner_of_Communication_Individual__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Owner_of_Communication_Individual__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner_of_Communication_Individual__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Owner_of_Communication_Individual__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner_of_Communication_Team__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Owner_of_Communication_Team__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passed_Predeployment__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Passed_Predeployment__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pre_Deployment_Check_Notes__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pre_Deployment_Check_Notes__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pre_Deployments__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pre_Deployments__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primary_Instance__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Primary_Instance__c"));
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
        elemField.setFieldName("RA_Monthly_Usages__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RA_Monthly_Usages__r"));
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
        elemField.setFieldName("release_Last_Verified__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Release_Last_Verified__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("release_Version_as_a_Number__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Release_Version_as_a_Number__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("sales_Billing_Stats_Contact__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Sales_Billing_Stats_Contact__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sales_Billing_Stats_Contact__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Sales_Billing_Stats_Contact__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salt_vs_Pepper_Deployed__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Salt_vs_Pepper_Deployed__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("second_CS_e_mail_sent__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Second_CS_e_mail_sent__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("send_Email__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Send_Email__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servers__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Servers__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setup_Notes__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Setup_Notes__c"));
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
        elemField.setFieldName("tickets__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tickets__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type_of_Communication__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Type_of_Communication__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unique_Users__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Unique_Users__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VM_Instances__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "VM_Instances__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VPN_Setup__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "VPN_Setup__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VPN_Setup__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "VPN_Setup__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "VPN_Setup__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("web_Service_URL__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Web_Service_URL__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KCura_Internal__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "kCura_Internal__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KCura_Login_Account__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "kCura_Login_Account__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KCura_Login_Password__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "kCura_Login_Password__c"));
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

/**
 * Profile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Profile  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String description;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String name;

    private java.lang.Boolean permissionsApiEnabled;

    private java.lang.Boolean permissionsApiUserOnly;

    private java.lang.Boolean permissionsAuthorApex;

    private java.lang.Boolean permissionsBulkApiHardDelete;

    private java.lang.Boolean permissionsCanInsertFeedSystemFields;

    private java.lang.Boolean permissionsCanUseNewDashboardBuilder;

    private java.lang.Boolean permissionsChatterFileLink;

    private java.lang.Boolean permissionsConvertLeads;

    private java.lang.Boolean permissionsCreateMultiforce;

    private java.lang.Boolean permissionsCustomizeApplication;

    private java.lang.Boolean permissionsDelegatedPortalUserAdmin;

    private java.lang.Boolean permissionsDistributeFromPersWksp;

    private java.lang.Boolean permissionsEditCaseComments;

    private java.lang.Boolean permissionsEditEvent;

    private java.lang.Boolean permissionsEditKnowledge;

    private java.lang.Boolean permissionsEditOppLineItemUnitPrice;

    private java.lang.Boolean permissionsEditOwnQuota;

    private java.lang.Boolean permissionsEditPublicDocuments;

    private java.lang.Boolean permissionsEditReadonlyFields;

    private java.lang.Boolean permissionsEditReports;

    private java.lang.Boolean permissionsEditTask;

    private java.lang.Boolean permissionsEmailAdministration;

    private java.lang.Boolean permissionsEmailTemplateManagement;

    private java.lang.Boolean permissionsEnableNotifications;

    private java.lang.Boolean permissionsFlowUFLRequired;

    private java.lang.Boolean permissionsImportLeads;

    private java.lang.Boolean permissionsInboundMigrationToolsUser;

    private java.lang.Boolean permissionsInstallMultiforce;

    private java.lang.Boolean permissionsManageAnalyticSnapshots;

    private java.lang.Boolean permissionsManageAuthProviders;

    private java.lang.Boolean permissionsManageBusinessHourHolidays;

    private java.lang.Boolean permissionsManageCallCenters;

    private java.lang.Boolean permissionsManageCases;

    private java.lang.Boolean permissionsManageCategories;

    private java.lang.Boolean permissionsManageChatterMessages;

    private java.lang.Boolean permissionsManageCssUsers;

    private java.lang.Boolean permissionsManageCustomReportTypes;

    private java.lang.Boolean permissionsManageDashboards;

    private java.lang.Boolean permissionsManageDataCategories;

    private java.lang.Boolean permissionsManageDataIntegrations;

    private java.lang.Boolean permissionsManageDynamicDashboards;

    private java.lang.Boolean permissionsManageEmailClientConfig;

    private java.lang.Boolean permissionsManageInteraction;

    private java.lang.Boolean permissionsManageKnowledge;

    private java.lang.Boolean permissionsManageKnowledgeImportExport;

    private java.lang.Boolean permissionsManageLeads;

    private java.lang.Boolean permissionsManageMobile;

    private java.lang.Boolean permissionsManageRemoteAccess;

    private java.lang.Boolean permissionsManageSelfService;

    private java.lang.Boolean permissionsManageSolutions;

    private java.lang.Boolean permissionsManageSynonyms;

    private java.lang.Boolean permissionsManageUsers;

    private java.lang.Boolean permissionsMassInlineEdit;

    private java.lang.Boolean permissionsModifyAllData;

    private java.lang.Boolean permissionsNewReportBuilder;

    private java.lang.Boolean permissionsOutboundMigrationToolsUser;

    private java.lang.Boolean permissionsOverrideForecasts;

    private java.lang.Boolean permissionsPasswordNeverExpires;

    private java.lang.Boolean permissionsPortalSuperUser;

    private java.lang.Boolean permissionsPublishMultiforce;

    private java.lang.Boolean permissionsResetPasswords;

    private java.lang.Boolean permissionsRunFlow;

    private java.lang.Boolean permissionsRunReports;

    private java.lang.Boolean permissionsScheduleJob;

    private java.lang.Boolean permissionsScheduleReports;

    private java.lang.Boolean permissionsSendSitRequests;

    private java.lang.Boolean permissionsSolutionImport;

    private java.lang.Boolean permissionsTransferAnyCase;

    private java.lang.Boolean permissionsTransferAnyEntity;

    private java.lang.Boolean permissionsTransferAnyLead;

    private java.lang.Boolean permissionsUseTeamReassignWizards;

    private java.lang.Boolean permissionsViewAllData;

    private java.lang.Boolean permissionsViewAllForecasts;

    private java.lang.Boolean permissionsViewDataCategories;

    private java.lang.Boolean permissionsViewMyTeamsDashboards;

    private java.lang.Boolean permissionsViewSetup;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.sobject.UserLicense userLicense;

    private java.lang.String userLicenseId;

    private java.lang.String userType;

    private com.sforce.soap.enterprise.QueryResult users;

    public Profile() {
    }

    public Profile(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String description,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String name,
           java.lang.Boolean permissionsApiEnabled,
           java.lang.Boolean permissionsApiUserOnly,
           java.lang.Boolean permissionsAuthorApex,
           java.lang.Boolean permissionsBulkApiHardDelete,
           java.lang.Boolean permissionsCanInsertFeedSystemFields,
           java.lang.Boolean permissionsCanUseNewDashboardBuilder,
           java.lang.Boolean permissionsChatterFileLink,
           java.lang.Boolean permissionsConvertLeads,
           java.lang.Boolean permissionsCreateMultiforce,
           java.lang.Boolean permissionsCustomizeApplication,
           java.lang.Boolean permissionsDelegatedPortalUserAdmin,
           java.lang.Boolean permissionsDistributeFromPersWksp,
           java.lang.Boolean permissionsEditCaseComments,
           java.lang.Boolean permissionsEditEvent,
           java.lang.Boolean permissionsEditKnowledge,
           java.lang.Boolean permissionsEditOppLineItemUnitPrice,
           java.lang.Boolean permissionsEditOwnQuota,
           java.lang.Boolean permissionsEditPublicDocuments,
           java.lang.Boolean permissionsEditReadonlyFields,
           java.lang.Boolean permissionsEditReports,
           java.lang.Boolean permissionsEditTask,
           java.lang.Boolean permissionsEmailAdministration,
           java.lang.Boolean permissionsEmailTemplateManagement,
           java.lang.Boolean permissionsEnableNotifications,
           java.lang.Boolean permissionsFlowUFLRequired,
           java.lang.Boolean permissionsImportLeads,
           java.lang.Boolean permissionsInboundMigrationToolsUser,
           java.lang.Boolean permissionsInstallMultiforce,
           java.lang.Boolean permissionsManageAnalyticSnapshots,
           java.lang.Boolean permissionsManageAuthProviders,
           java.lang.Boolean permissionsManageBusinessHourHolidays,
           java.lang.Boolean permissionsManageCallCenters,
           java.lang.Boolean permissionsManageCases,
           java.lang.Boolean permissionsManageCategories,
           java.lang.Boolean permissionsManageChatterMessages,
           java.lang.Boolean permissionsManageCssUsers,
           java.lang.Boolean permissionsManageCustomReportTypes,
           java.lang.Boolean permissionsManageDashboards,
           java.lang.Boolean permissionsManageDataCategories,
           java.lang.Boolean permissionsManageDataIntegrations,
           java.lang.Boolean permissionsManageDynamicDashboards,
           java.lang.Boolean permissionsManageEmailClientConfig,
           java.lang.Boolean permissionsManageInteraction,
           java.lang.Boolean permissionsManageKnowledge,
           java.lang.Boolean permissionsManageKnowledgeImportExport,
           java.lang.Boolean permissionsManageLeads,
           java.lang.Boolean permissionsManageMobile,
           java.lang.Boolean permissionsManageRemoteAccess,
           java.lang.Boolean permissionsManageSelfService,
           java.lang.Boolean permissionsManageSolutions,
           java.lang.Boolean permissionsManageSynonyms,
           java.lang.Boolean permissionsManageUsers,
           java.lang.Boolean permissionsMassInlineEdit,
           java.lang.Boolean permissionsModifyAllData,
           java.lang.Boolean permissionsNewReportBuilder,
           java.lang.Boolean permissionsOutboundMigrationToolsUser,
           java.lang.Boolean permissionsOverrideForecasts,
           java.lang.Boolean permissionsPasswordNeverExpires,
           java.lang.Boolean permissionsPortalSuperUser,
           java.lang.Boolean permissionsPublishMultiforce,
           java.lang.Boolean permissionsResetPasswords,
           java.lang.Boolean permissionsRunFlow,
           java.lang.Boolean permissionsRunReports,
           java.lang.Boolean permissionsScheduleJob,
           java.lang.Boolean permissionsScheduleReports,
           java.lang.Boolean permissionsSendSitRequests,
           java.lang.Boolean permissionsSolutionImport,
           java.lang.Boolean permissionsTransferAnyCase,
           java.lang.Boolean permissionsTransferAnyEntity,
           java.lang.Boolean permissionsTransferAnyLead,
           java.lang.Boolean permissionsUseTeamReassignWizards,
           java.lang.Boolean permissionsViewAllData,
           java.lang.Boolean permissionsViewAllForecasts,
           java.lang.Boolean permissionsViewDataCategories,
           java.lang.Boolean permissionsViewMyTeamsDashboards,
           java.lang.Boolean permissionsViewSetup,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.sobject.UserLicense userLicense,
           java.lang.String userLicenseId,
           java.lang.String userType,
           com.sforce.soap.enterprise.QueryResult users) {
        super(
            fieldsToNull,
            id);
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.description = description;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.name = name;
        this.permissionsApiEnabled = permissionsApiEnabled;
        this.permissionsApiUserOnly = permissionsApiUserOnly;
        this.permissionsAuthorApex = permissionsAuthorApex;
        this.permissionsBulkApiHardDelete = permissionsBulkApiHardDelete;
        this.permissionsCanInsertFeedSystemFields = permissionsCanInsertFeedSystemFields;
        this.permissionsCanUseNewDashboardBuilder = permissionsCanUseNewDashboardBuilder;
        this.permissionsChatterFileLink = permissionsChatterFileLink;
        this.permissionsConvertLeads = permissionsConvertLeads;
        this.permissionsCreateMultiforce = permissionsCreateMultiforce;
        this.permissionsCustomizeApplication = permissionsCustomizeApplication;
        this.permissionsDelegatedPortalUserAdmin = permissionsDelegatedPortalUserAdmin;
        this.permissionsDistributeFromPersWksp = permissionsDistributeFromPersWksp;
        this.permissionsEditCaseComments = permissionsEditCaseComments;
        this.permissionsEditEvent = permissionsEditEvent;
        this.permissionsEditKnowledge = permissionsEditKnowledge;
        this.permissionsEditOppLineItemUnitPrice = permissionsEditOppLineItemUnitPrice;
        this.permissionsEditOwnQuota = permissionsEditOwnQuota;
        this.permissionsEditPublicDocuments = permissionsEditPublicDocuments;
        this.permissionsEditReadonlyFields = permissionsEditReadonlyFields;
        this.permissionsEditReports = permissionsEditReports;
        this.permissionsEditTask = permissionsEditTask;
        this.permissionsEmailAdministration = permissionsEmailAdministration;
        this.permissionsEmailTemplateManagement = permissionsEmailTemplateManagement;
        this.permissionsEnableNotifications = permissionsEnableNotifications;
        this.permissionsFlowUFLRequired = permissionsFlowUFLRequired;
        this.permissionsImportLeads = permissionsImportLeads;
        this.permissionsInboundMigrationToolsUser = permissionsInboundMigrationToolsUser;
        this.permissionsInstallMultiforce = permissionsInstallMultiforce;
        this.permissionsManageAnalyticSnapshots = permissionsManageAnalyticSnapshots;
        this.permissionsManageAuthProviders = permissionsManageAuthProviders;
        this.permissionsManageBusinessHourHolidays = permissionsManageBusinessHourHolidays;
        this.permissionsManageCallCenters = permissionsManageCallCenters;
        this.permissionsManageCases = permissionsManageCases;
        this.permissionsManageCategories = permissionsManageCategories;
        this.permissionsManageChatterMessages = permissionsManageChatterMessages;
        this.permissionsManageCssUsers = permissionsManageCssUsers;
        this.permissionsManageCustomReportTypes = permissionsManageCustomReportTypes;
        this.permissionsManageDashboards = permissionsManageDashboards;
        this.permissionsManageDataCategories = permissionsManageDataCategories;
        this.permissionsManageDataIntegrations = permissionsManageDataIntegrations;
        this.permissionsManageDynamicDashboards = permissionsManageDynamicDashboards;
        this.permissionsManageEmailClientConfig = permissionsManageEmailClientConfig;
        this.permissionsManageInteraction = permissionsManageInteraction;
        this.permissionsManageKnowledge = permissionsManageKnowledge;
        this.permissionsManageKnowledgeImportExport = permissionsManageKnowledgeImportExport;
        this.permissionsManageLeads = permissionsManageLeads;
        this.permissionsManageMobile = permissionsManageMobile;
        this.permissionsManageRemoteAccess = permissionsManageRemoteAccess;
        this.permissionsManageSelfService = permissionsManageSelfService;
        this.permissionsManageSolutions = permissionsManageSolutions;
        this.permissionsManageSynonyms = permissionsManageSynonyms;
        this.permissionsManageUsers = permissionsManageUsers;
        this.permissionsMassInlineEdit = permissionsMassInlineEdit;
        this.permissionsModifyAllData = permissionsModifyAllData;
        this.permissionsNewReportBuilder = permissionsNewReportBuilder;
        this.permissionsOutboundMigrationToolsUser = permissionsOutboundMigrationToolsUser;
        this.permissionsOverrideForecasts = permissionsOverrideForecasts;
        this.permissionsPasswordNeverExpires = permissionsPasswordNeverExpires;
        this.permissionsPortalSuperUser = permissionsPortalSuperUser;
        this.permissionsPublishMultiforce = permissionsPublishMultiforce;
        this.permissionsResetPasswords = permissionsResetPasswords;
        this.permissionsRunFlow = permissionsRunFlow;
        this.permissionsRunReports = permissionsRunReports;
        this.permissionsScheduleJob = permissionsScheduleJob;
        this.permissionsScheduleReports = permissionsScheduleReports;
        this.permissionsSendSitRequests = permissionsSendSitRequests;
        this.permissionsSolutionImport = permissionsSolutionImport;
        this.permissionsTransferAnyCase = permissionsTransferAnyCase;
        this.permissionsTransferAnyEntity = permissionsTransferAnyEntity;
        this.permissionsTransferAnyLead = permissionsTransferAnyLead;
        this.permissionsUseTeamReassignWizards = permissionsUseTeamReassignWizards;
        this.permissionsViewAllData = permissionsViewAllData;
        this.permissionsViewAllForecasts = permissionsViewAllForecasts;
        this.permissionsViewDataCategories = permissionsViewDataCategories;
        this.permissionsViewMyTeamsDashboards = permissionsViewMyTeamsDashboards;
        this.permissionsViewSetup = permissionsViewSetup;
        this.systemModstamp = systemModstamp;
        this.userLicense = userLicense;
        this.userLicenseId = userLicenseId;
        this.userType = userType;
        this.users = users;
    }


    /**
     * Gets the createdBy value for this Profile.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Profile.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Profile.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Profile.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Profile.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Profile.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the description value for this Profile.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Profile.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the lastModifiedBy value for this Profile.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Profile.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Profile.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Profile.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Profile.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Profile.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this Profile.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Profile.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the permissionsApiEnabled value for this Profile.
     * 
     * @return permissionsApiEnabled
     */
    public java.lang.Boolean getPermissionsApiEnabled() {
        return permissionsApiEnabled;
    }


    /**
     * Sets the permissionsApiEnabled value for this Profile.
     * 
     * @param permissionsApiEnabled
     */
    public void setPermissionsApiEnabled(java.lang.Boolean permissionsApiEnabled) {
        this.permissionsApiEnabled = permissionsApiEnabled;
    }


    /**
     * Gets the permissionsApiUserOnly value for this Profile.
     * 
     * @return permissionsApiUserOnly
     */
    public java.lang.Boolean getPermissionsApiUserOnly() {
        return permissionsApiUserOnly;
    }


    /**
     * Sets the permissionsApiUserOnly value for this Profile.
     * 
     * @param permissionsApiUserOnly
     */
    public void setPermissionsApiUserOnly(java.lang.Boolean permissionsApiUserOnly) {
        this.permissionsApiUserOnly = permissionsApiUserOnly;
    }


    /**
     * Gets the permissionsAuthorApex value for this Profile.
     * 
     * @return permissionsAuthorApex
     */
    public java.lang.Boolean getPermissionsAuthorApex() {
        return permissionsAuthorApex;
    }


    /**
     * Sets the permissionsAuthorApex value for this Profile.
     * 
     * @param permissionsAuthorApex
     */
    public void setPermissionsAuthorApex(java.lang.Boolean permissionsAuthorApex) {
        this.permissionsAuthorApex = permissionsAuthorApex;
    }


    /**
     * Gets the permissionsBulkApiHardDelete value for this Profile.
     * 
     * @return permissionsBulkApiHardDelete
     */
    public java.lang.Boolean getPermissionsBulkApiHardDelete() {
        return permissionsBulkApiHardDelete;
    }


    /**
     * Sets the permissionsBulkApiHardDelete value for this Profile.
     * 
     * @param permissionsBulkApiHardDelete
     */
    public void setPermissionsBulkApiHardDelete(java.lang.Boolean permissionsBulkApiHardDelete) {
        this.permissionsBulkApiHardDelete = permissionsBulkApiHardDelete;
    }


    /**
     * Gets the permissionsCanInsertFeedSystemFields value for this Profile.
     * 
     * @return permissionsCanInsertFeedSystemFields
     */
    public java.lang.Boolean getPermissionsCanInsertFeedSystemFields() {
        return permissionsCanInsertFeedSystemFields;
    }


    /**
     * Sets the permissionsCanInsertFeedSystemFields value for this Profile.
     * 
     * @param permissionsCanInsertFeedSystemFields
     */
    public void setPermissionsCanInsertFeedSystemFields(java.lang.Boolean permissionsCanInsertFeedSystemFields) {
        this.permissionsCanInsertFeedSystemFields = permissionsCanInsertFeedSystemFields;
    }


    /**
     * Gets the permissionsCanUseNewDashboardBuilder value for this Profile.
     * 
     * @return permissionsCanUseNewDashboardBuilder
     */
    public java.lang.Boolean getPermissionsCanUseNewDashboardBuilder() {
        return permissionsCanUseNewDashboardBuilder;
    }


    /**
     * Sets the permissionsCanUseNewDashboardBuilder value for this Profile.
     * 
     * @param permissionsCanUseNewDashboardBuilder
     */
    public void setPermissionsCanUseNewDashboardBuilder(java.lang.Boolean permissionsCanUseNewDashboardBuilder) {
        this.permissionsCanUseNewDashboardBuilder = permissionsCanUseNewDashboardBuilder;
    }


    /**
     * Gets the permissionsChatterFileLink value for this Profile.
     * 
     * @return permissionsChatterFileLink
     */
    public java.lang.Boolean getPermissionsChatterFileLink() {
        return permissionsChatterFileLink;
    }


    /**
     * Sets the permissionsChatterFileLink value for this Profile.
     * 
     * @param permissionsChatterFileLink
     */
    public void setPermissionsChatterFileLink(java.lang.Boolean permissionsChatterFileLink) {
        this.permissionsChatterFileLink = permissionsChatterFileLink;
    }


    /**
     * Gets the permissionsConvertLeads value for this Profile.
     * 
     * @return permissionsConvertLeads
     */
    public java.lang.Boolean getPermissionsConvertLeads() {
        return permissionsConvertLeads;
    }


    /**
     * Sets the permissionsConvertLeads value for this Profile.
     * 
     * @param permissionsConvertLeads
     */
    public void setPermissionsConvertLeads(java.lang.Boolean permissionsConvertLeads) {
        this.permissionsConvertLeads = permissionsConvertLeads;
    }


    /**
     * Gets the permissionsCreateMultiforce value for this Profile.
     * 
     * @return permissionsCreateMultiforce
     */
    public java.lang.Boolean getPermissionsCreateMultiforce() {
        return permissionsCreateMultiforce;
    }


    /**
     * Sets the permissionsCreateMultiforce value for this Profile.
     * 
     * @param permissionsCreateMultiforce
     */
    public void setPermissionsCreateMultiforce(java.lang.Boolean permissionsCreateMultiforce) {
        this.permissionsCreateMultiforce = permissionsCreateMultiforce;
    }


    /**
     * Gets the permissionsCustomizeApplication value for this Profile.
     * 
     * @return permissionsCustomizeApplication
     */
    public java.lang.Boolean getPermissionsCustomizeApplication() {
        return permissionsCustomizeApplication;
    }


    /**
     * Sets the permissionsCustomizeApplication value for this Profile.
     * 
     * @param permissionsCustomizeApplication
     */
    public void setPermissionsCustomizeApplication(java.lang.Boolean permissionsCustomizeApplication) {
        this.permissionsCustomizeApplication = permissionsCustomizeApplication;
    }


    /**
     * Gets the permissionsDelegatedPortalUserAdmin value for this Profile.
     * 
     * @return permissionsDelegatedPortalUserAdmin
     */
    public java.lang.Boolean getPermissionsDelegatedPortalUserAdmin() {
        return permissionsDelegatedPortalUserAdmin;
    }


    /**
     * Sets the permissionsDelegatedPortalUserAdmin value for this Profile.
     * 
     * @param permissionsDelegatedPortalUserAdmin
     */
    public void setPermissionsDelegatedPortalUserAdmin(java.lang.Boolean permissionsDelegatedPortalUserAdmin) {
        this.permissionsDelegatedPortalUserAdmin = permissionsDelegatedPortalUserAdmin;
    }


    /**
     * Gets the permissionsDistributeFromPersWksp value for this Profile.
     * 
     * @return permissionsDistributeFromPersWksp
     */
    public java.lang.Boolean getPermissionsDistributeFromPersWksp() {
        return permissionsDistributeFromPersWksp;
    }


    /**
     * Sets the permissionsDistributeFromPersWksp value for this Profile.
     * 
     * @param permissionsDistributeFromPersWksp
     */
    public void setPermissionsDistributeFromPersWksp(java.lang.Boolean permissionsDistributeFromPersWksp) {
        this.permissionsDistributeFromPersWksp = permissionsDistributeFromPersWksp;
    }


    /**
     * Gets the permissionsEditCaseComments value for this Profile.
     * 
     * @return permissionsEditCaseComments
     */
    public java.lang.Boolean getPermissionsEditCaseComments() {
        return permissionsEditCaseComments;
    }


    /**
     * Sets the permissionsEditCaseComments value for this Profile.
     * 
     * @param permissionsEditCaseComments
     */
    public void setPermissionsEditCaseComments(java.lang.Boolean permissionsEditCaseComments) {
        this.permissionsEditCaseComments = permissionsEditCaseComments;
    }


    /**
     * Gets the permissionsEditEvent value for this Profile.
     * 
     * @return permissionsEditEvent
     */
    public java.lang.Boolean getPermissionsEditEvent() {
        return permissionsEditEvent;
    }


    /**
     * Sets the permissionsEditEvent value for this Profile.
     * 
     * @param permissionsEditEvent
     */
    public void setPermissionsEditEvent(java.lang.Boolean permissionsEditEvent) {
        this.permissionsEditEvent = permissionsEditEvent;
    }


    /**
     * Gets the permissionsEditKnowledge value for this Profile.
     * 
     * @return permissionsEditKnowledge
     */
    public java.lang.Boolean getPermissionsEditKnowledge() {
        return permissionsEditKnowledge;
    }


    /**
     * Sets the permissionsEditKnowledge value for this Profile.
     * 
     * @param permissionsEditKnowledge
     */
    public void setPermissionsEditKnowledge(java.lang.Boolean permissionsEditKnowledge) {
        this.permissionsEditKnowledge = permissionsEditKnowledge;
    }


    /**
     * Gets the permissionsEditOppLineItemUnitPrice value for this Profile.
     * 
     * @return permissionsEditOppLineItemUnitPrice
     */
    public java.lang.Boolean getPermissionsEditOppLineItemUnitPrice() {
        return permissionsEditOppLineItemUnitPrice;
    }


    /**
     * Sets the permissionsEditOppLineItemUnitPrice value for this Profile.
     * 
     * @param permissionsEditOppLineItemUnitPrice
     */
    public void setPermissionsEditOppLineItemUnitPrice(java.lang.Boolean permissionsEditOppLineItemUnitPrice) {
        this.permissionsEditOppLineItemUnitPrice = permissionsEditOppLineItemUnitPrice;
    }


    /**
     * Gets the permissionsEditOwnQuota value for this Profile.
     * 
     * @return permissionsEditOwnQuota
     */
    public java.lang.Boolean getPermissionsEditOwnQuota() {
        return permissionsEditOwnQuota;
    }


    /**
     * Sets the permissionsEditOwnQuota value for this Profile.
     * 
     * @param permissionsEditOwnQuota
     */
    public void setPermissionsEditOwnQuota(java.lang.Boolean permissionsEditOwnQuota) {
        this.permissionsEditOwnQuota = permissionsEditOwnQuota;
    }


    /**
     * Gets the permissionsEditPublicDocuments value for this Profile.
     * 
     * @return permissionsEditPublicDocuments
     */
    public java.lang.Boolean getPermissionsEditPublicDocuments() {
        return permissionsEditPublicDocuments;
    }


    /**
     * Sets the permissionsEditPublicDocuments value for this Profile.
     * 
     * @param permissionsEditPublicDocuments
     */
    public void setPermissionsEditPublicDocuments(java.lang.Boolean permissionsEditPublicDocuments) {
        this.permissionsEditPublicDocuments = permissionsEditPublicDocuments;
    }


    /**
     * Gets the permissionsEditReadonlyFields value for this Profile.
     * 
     * @return permissionsEditReadonlyFields
     */
    public java.lang.Boolean getPermissionsEditReadonlyFields() {
        return permissionsEditReadonlyFields;
    }


    /**
     * Sets the permissionsEditReadonlyFields value for this Profile.
     * 
     * @param permissionsEditReadonlyFields
     */
    public void setPermissionsEditReadonlyFields(java.lang.Boolean permissionsEditReadonlyFields) {
        this.permissionsEditReadonlyFields = permissionsEditReadonlyFields;
    }


    /**
     * Gets the permissionsEditReports value for this Profile.
     * 
     * @return permissionsEditReports
     */
    public java.lang.Boolean getPermissionsEditReports() {
        return permissionsEditReports;
    }


    /**
     * Sets the permissionsEditReports value for this Profile.
     * 
     * @param permissionsEditReports
     */
    public void setPermissionsEditReports(java.lang.Boolean permissionsEditReports) {
        this.permissionsEditReports = permissionsEditReports;
    }


    /**
     * Gets the permissionsEditTask value for this Profile.
     * 
     * @return permissionsEditTask
     */
    public java.lang.Boolean getPermissionsEditTask() {
        return permissionsEditTask;
    }


    /**
     * Sets the permissionsEditTask value for this Profile.
     * 
     * @param permissionsEditTask
     */
    public void setPermissionsEditTask(java.lang.Boolean permissionsEditTask) {
        this.permissionsEditTask = permissionsEditTask;
    }


    /**
     * Gets the permissionsEmailAdministration value for this Profile.
     * 
     * @return permissionsEmailAdministration
     */
    public java.lang.Boolean getPermissionsEmailAdministration() {
        return permissionsEmailAdministration;
    }


    /**
     * Sets the permissionsEmailAdministration value for this Profile.
     * 
     * @param permissionsEmailAdministration
     */
    public void setPermissionsEmailAdministration(java.lang.Boolean permissionsEmailAdministration) {
        this.permissionsEmailAdministration = permissionsEmailAdministration;
    }


    /**
     * Gets the permissionsEmailTemplateManagement value for this Profile.
     * 
     * @return permissionsEmailTemplateManagement
     */
    public java.lang.Boolean getPermissionsEmailTemplateManagement() {
        return permissionsEmailTemplateManagement;
    }


    /**
     * Sets the permissionsEmailTemplateManagement value for this Profile.
     * 
     * @param permissionsEmailTemplateManagement
     */
    public void setPermissionsEmailTemplateManagement(java.lang.Boolean permissionsEmailTemplateManagement) {
        this.permissionsEmailTemplateManagement = permissionsEmailTemplateManagement;
    }


    /**
     * Gets the permissionsEnableNotifications value for this Profile.
     * 
     * @return permissionsEnableNotifications
     */
    public java.lang.Boolean getPermissionsEnableNotifications() {
        return permissionsEnableNotifications;
    }


    /**
     * Sets the permissionsEnableNotifications value for this Profile.
     * 
     * @param permissionsEnableNotifications
     */
    public void setPermissionsEnableNotifications(java.lang.Boolean permissionsEnableNotifications) {
        this.permissionsEnableNotifications = permissionsEnableNotifications;
    }


    /**
     * Gets the permissionsFlowUFLRequired value for this Profile.
     * 
     * @return permissionsFlowUFLRequired
     */
    public java.lang.Boolean getPermissionsFlowUFLRequired() {
        return permissionsFlowUFLRequired;
    }


    /**
     * Sets the permissionsFlowUFLRequired value for this Profile.
     * 
     * @param permissionsFlowUFLRequired
     */
    public void setPermissionsFlowUFLRequired(java.lang.Boolean permissionsFlowUFLRequired) {
        this.permissionsFlowUFLRequired = permissionsFlowUFLRequired;
    }


    /**
     * Gets the permissionsImportLeads value for this Profile.
     * 
     * @return permissionsImportLeads
     */
    public java.lang.Boolean getPermissionsImportLeads() {
        return permissionsImportLeads;
    }


    /**
     * Sets the permissionsImportLeads value for this Profile.
     * 
     * @param permissionsImportLeads
     */
    public void setPermissionsImportLeads(java.lang.Boolean permissionsImportLeads) {
        this.permissionsImportLeads = permissionsImportLeads;
    }


    /**
     * Gets the permissionsInboundMigrationToolsUser value for this Profile.
     * 
     * @return permissionsInboundMigrationToolsUser
     */
    public java.lang.Boolean getPermissionsInboundMigrationToolsUser() {
        return permissionsInboundMigrationToolsUser;
    }


    /**
     * Sets the permissionsInboundMigrationToolsUser value for this Profile.
     * 
     * @param permissionsInboundMigrationToolsUser
     */
    public void setPermissionsInboundMigrationToolsUser(java.lang.Boolean permissionsInboundMigrationToolsUser) {
        this.permissionsInboundMigrationToolsUser = permissionsInboundMigrationToolsUser;
    }


    /**
     * Gets the permissionsInstallMultiforce value for this Profile.
     * 
     * @return permissionsInstallMultiforce
     */
    public java.lang.Boolean getPermissionsInstallMultiforce() {
        return permissionsInstallMultiforce;
    }


    /**
     * Sets the permissionsInstallMultiforce value for this Profile.
     * 
     * @param permissionsInstallMultiforce
     */
    public void setPermissionsInstallMultiforce(java.lang.Boolean permissionsInstallMultiforce) {
        this.permissionsInstallMultiforce = permissionsInstallMultiforce;
    }


    /**
     * Gets the permissionsManageAnalyticSnapshots value for this Profile.
     * 
     * @return permissionsManageAnalyticSnapshots
     */
    public java.lang.Boolean getPermissionsManageAnalyticSnapshots() {
        return permissionsManageAnalyticSnapshots;
    }


    /**
     * Sets the permissionsManageAnalyticSnapshots value for this Profile.
     * 
     * @param permissionsManageAnalyticSnapshots
     */
    public void setPermissionsManageAnalyticSnapshots(java.lang.Boolean permissionsManageAnalyticSnapshots) {
        this.permissionsManageAnalyticSnapshots = permissionsManageAnalyticSnapshots;
    }


    /**
     * Gets the permissionsManageAuthProviders value for this Profile.
     * 
     * @return permissionsManageAuthProviders
     */
    public java.lang.Boolean getPermissionsManageAuthProviders() {
        return permissionsManageAuthProviders;
    }


    /**
     * Sets the permissionsManageAuthProviders value for this Profile.
     * 
     * @param permissionsManageAuthProviders
     */
    public void setPermissionsManageAuthProviders(java.lang.Boolean permissionsManageAuthProviders) {
        this.permissionsManageAuthProviders = permissionsManageAuthProviders;
    }


    /**
     * Gets the permissionsManageBusinessHourHolidays value for this Profile.
     * 
     * @return permissionsManageBusinessHourHolidays
     */
    public java.lang.Boolean getPermissionsManageBusinessHourHolidays() {
        return permissionsManageBusinessHourHolidays;
    }


    /**
     * Sets the permissionsManageBusinessHourHolidays value for this Profile.
     * 
     * @param permissionsManageBusinessHourHolidays
     */
    public void setPermissionsManageBusinessHourHolidays(java.lang.Boolean permissionsManageBusinessHourHolidays) {
        this.permissionsManageBusinessHourHolidays = permissionsManageBusinessHourHolidays;
    }


    /**
     * Gets the permissionsManageCallCenters value for this Profile.
     * 
     * @return permissionsManageCallCenters
     */
    public java.lang.Boolean getPermissionsManageCallCenters() {
        return permissionsManageCallCenters;
    }


    /**
     * Sets the permissionsManageCallCenters value for this Profile.
     * 
     * @param permissionsManageCallCenters
     */
    public void setPermissionsManageCallCenters(java.lang.Boolean permissionsManageCallCenters) {
        this.permissionsManageCallCenters = permissionsManageCallCenters;
    }


    /**
     * Gets the permissionsManageCases value for this Profile.
     * 
     * @return permissionsManageCases
     */
    public java.lang.Boolean getPermissionsManageCases() {
        return permissionsManageCases;
    }


    /**
     * Sets the permissionsManageCases value for this Profile.
     * 
     * @param permissionsManageCases
     */
    public void setPermissionsManageCases(java.lang.Boolean permissionsManageCases) {
        this.permissionsManageCases = permissionsManageCases;
    }


    /**
     * Gets the permissionsManageCategories value for this Profile.
     * 
     * @return permissionsManageCategories
     */
    public java.lang.Boolean getPermissionsManageCategories() {
        return permissionsManageCategories;
    }


    /**
     * Sets the permissionsManageCategories value for this Profile.
     * 
     * @param permissionsManageCategories
     */
    public void setPermissionsManageCategories(java.lang.Boolean permissionsManageCategories) {
        this.permissionsManageCategories = permissionsManageCategories;
    }


    /**
     * Gets the permissionsManageChatterMessages value for this Profile.
     * 
     * @return permissionsManageChatterMessages
     */
    public java.lang.Boolean getPermissionsManageChatterMessages() {
        return permissionsManageChatterMessages;
    }


    /**
     * Sets the permissionsManageChatterMessages value for this Profile.
     * 
     * @param permissionsManageChatterMessages
     */
    public void setPermissionsManageChatterMessages(java.lang.Boolean permissionsManageChatterMessages) {
        this.permissionsManageChatterMessages = permissionsManageChatterMessages;
    }


    /**
     * Gets the permissionsManageCssUsers value for this Profile.
     * 
     * @return permissionsManageCssUsers
     */
    public java.lang.Boolean getPermissionsManageCssUsers() {
        return permissionsManageCssUsers;
    }


    /**
     * Sets the permissionsManageCssUsers value for this Profile.
     * 
     * @param permissionsManageCssUsers
     */
    public void setPermissionsManageCssUsers(java.lang.Boolean permissionsManageCssUsers) {
        this.permissionsManageCssUsers = permissionsManageCssUsers;
    }


    /**
     * Gets the permissionsManageCustomReportTypes value for this Profile.
     * 
     * @return permissionsManageCustomReportTypes
     */
    public java.lang.Boolean getPermissionsManageCustomReportTypes() {
        return permissionsManageCustomReportTypes;
    }


    /**
     * Sets the permissionsManageCustomReportTypes value for this Profile.
     * 
     * @param permissionsManageCustomReportTypes
     */
    public void setPermissionsManageCustomReportTypes(java.lang.Boolean permissionsManageCustomReportTypes) {
        this.permissionsManageCustomReportTypes = permissionsManageCustomReportTypes;
    }


    /**
     * Gets the permissionsManageDashboards value for this Profile.
     * 
     * @return permissionsManageDashboards
     */
    public java.lang.Boolean getPermissionsManageDashboards() {
        return permissionsManageDashboards;
    }


    /**
     * Sets the permissionsManageDashboards value for this Profile.
     * 
     * @param permissionsManageDashboards
     */
    public void setPermissionsManageDashboards(java.lang.Boolean permissionsManageDashboards) {
        this.permissionsManageDashboards = permissionsManageDashboards;
    }


    /**
     * Gets the permissionsManageDataCategories value for this Profile.
     * 
     * @return permissionsManageDataCategories
     */
    public java.lang.Boolean getPermissionsManageDataCategories() {
        return permissionsManageDataCategories;
    }


    /**
     * Sets the permissionsManageDataCategories value for this Profile.
     * 
     * @param permissionsManageDataCategories
     */
    public void setPermissionsManageDataCategories(java.lang.Boolean permissionsManageDataCategories) {
        this.permissionsManageDataCategories = permissionsManageDataCategories;
    }


    /**
     * Gets the permissionsManageDataIntegrations value for this Profile.
     * 
     * @return permissionsManageDataIntegrations
     */
    public java.lang.Boolean getPermissionsManageDataIntegrations() {
        return permissionsManageDataIntegrations;
    }


    /**
     * Sets the permissionsManageDataIntegrations value for this Profile.
     * 
     * @param permissionsManageDataIntegrations
     */
    public void setPermissionsManageDataIntegrations(java.lang.Boolean permissionsManageDataIntegrations) {
        this.permissionsManageDataIntegrations = permissionsManageDataIntegrations;
    }


    /**
     * Gets the permissionsManageDynamicDashboards value for this Profile.
     * 
     * @return permissionsManageDynamicDashboards
     */
    public java.lang.Boolean getPermissionsManageDynamicDashboards() {
        return permissionsManageDynamicDashboards;
    }


    /**
     * Sets the permissionsManageDynamicDashboards value for this Profile.
     * 
     * @param permissionsManageDynamicDashboards
     */
    public void setPermissionsManageDynamicDashboards(java.lang.Boolean permissionsManageDynamicDashboards) {
        this.permissionsManageDynamicDashboards = permissionsManageDynamicDashboards;
    }


    /**
     * Gets the permissionsManageEmailClientConfig value for this Profile.
     * 
     * @return permissionsManageEmailClientConfig
     */
    public java.lang.Boolean getPermissionsManageEmailClientConfig() {
        return permissionsManageEmailClientConfig;
    }


    /**
     * Sets the permissionsManageEmailClientConfig value for this Profile.
     * 
     * @param permissionsManageEmailClientConfig
     */
    public void setPermissionsManageEmailClientConfig(java.lang.Boolean permissionsManageEmailClientConfig) {
        this.permissionsManageEmailClientConfig = permissionsManageEmailClientConfig;
    }


    /**
     * Gets the permissionsManageInteraction value for this Profile.
     * 
     * @return permissionsManageInteraction
     */
    public java.lang.Boolean getPermissionsManageInteraction() {
        return permissionsManageInteraction;
    }


    /**
     * Sets the permissionsManageInteraction value for this Profile.
     * 
     * @param permissionsManageInteraction
     */
    public void setPermissionsManageInteraction(java.lang.Boolean permissionsManageInteraction) {
        this.permissionsManageInteraction = permissionsManageInteraction;
    }


    /**
     * Gets the permissionsManageKnowledge value for this Profile.
     * 
     * @return permissionsManageKnowledge
     */
    public java.lang.Boolean getPermissionsManageKnowledge() {
        return permissionsManageKnowledge;
    }


    /**
     * Sets the permissionsManageKnowledge value for this Profile.
     * 
     * @param permissionsManageKnowledge
     */
    public void setPermissionsManageKnowledge(java.lang.Boolean permissionsManageKnowledge) {
        this.permissionsManageKnowledge = permissionsManageKnowledge;
    }


    /**
     * Gets the permissionsManageKnowledgeImportExport value for this Profile.
     * 
     * @return permissionsManageKnowledgeImportExport
     */
    public java.lang.Boolean getPermissionsManageKnowledgeImportExport() {
        return permissionsManageKnowledgeImportExport;
    }


    /**
     * Sets the permissionsManageKnowledgeImportExport value for this Profile.
     * 
     * @param permissionsManageKnowledgeImportExport
     */
    public void setPermissionsManageKnowledgeImportExport(java.lang.Boolean permissionsManageKnowledgeImportExport) {
        this.permissionsManageKnowledgeImportExport = permissionsManageKnowledgeImportExport;
    }


    /**
     * Gets the permissionsManageLeads value for this Profile.
     * 
     * @return permissionsManageLeads
     */
    public java.lang.Boolean getPermissionsManageLeads() {
        return permissionsManageLeads;
    }


    /**
     * Sets the permissionsManageLeads value for this Profile.
     * 
     * @param permissionsManageLeads
     */
    public void setPermissionsManageLeads(java.lang.Boolean permissionsManageLeads) {
        this.permissionsManageLeads = permissionsManageLeads;
    }


    /**
     * Gets the permissionsManageMobile value for this Profile.
     * 
     * @return permissionsManageMobile
     */
    public java.lang.Boolean getPermissionsManageMobile() {
        return permissionsManageMobile;
    }


    /**
     * Sets the permissionsManageMobile value for this Profile.
     * 
     * @param permissionsManageMobile
     */
    public void setPermissionsManageMobile(java.lang.Boolean permissionsManageMobile) {
        this.permissionsManageMobile = permissionsManageMobile;
    }


    /**
     * Gets the permissionsManageRemoteAccess value for this Profile.
     * 
     * @return permissionsManageRemoteAccess
     */
    public java.lang.Boolean getPermissionsManageRemoteAccess() {
        return permissionsManageRemoteAccess;
    }


    /**
     * Sets the permissionsManageRemoteAccess value for this Profile.
     * 
     * @param permissionsManageRemoteAccess
     */
    public void setPermissionsManageRemoteAccess(java.lang.Boolean permissionsManageRemoteAccess) {
        this.permissionsManageRemoteAccess = permissionsManageRemoteAccess;
    }


    /**
     * Gets the permissionsManageSelfService value for this Profile.
     * 
     * @return permissionsManageSelfService
     */
    public java.lang.Boolean getPermissionsManageSelfService() {
        return permissionsManageSelfService;
    }


    /**
     * Sets the permissionsManageSelfService value for this Profile.
     * 
     * @param permissionsManageSelfService
     */
    public void setPermissionsManageSelfService(java.lang.Boolean permissionsManageSelfService) {
        this.permissionsManageSelfService = permissionsManageSelfService;
    }


    /**
     * Gets the permissionsManageSolutions value for this Profile.
     * 
     * @return permissionsManageSolutions
     */
    public java.lang.Boolean getPermissionsManageSolutions() {
        return permissionsManageSolutions;
    }


    /**
     * Sets the permissionsManageSolutions value for this Profile.
     * 
     * @param permissionsManageSolutions
     */
    public void setPermissionsManageSolutions(java.lang.Boolean permissionsManageSolutions) {
        this.permissionsManageSolutions = permissionsManageSolutions;
    }


    /**
     * Gets the permissionsManageSynonyms value for this Profile.
     * 
     * @return permissionsManageSynonyms
     */
    public java.lang.Boolean getPermissionsManageSynonyms() {
        return permissionsManageSynonyms;
    }


    /**
     * Sets the permissionsManageSynonyms value for this Profile.
     * 
     * @param permissionsManageSynonyms
     */
    public void setPermissionsManageSynonyms(java.lang.Boolean permissionsManageSynonyms) {
        this.permissionsManageSynonyms = permissionsManageSynonyms;
    }


    /**
     * Gets the permissionsManageUsers value for this Profile.
     * 
     * @return permissionsManageUsers
     */
    public java.lang.Boolean getPermissionsManageUsers() {
        return permissionsManageUsers;
    }


    /**
     * Sets the permissionsManageUsers value for this Profile.
     * 
     * @param permissionsManageUsers
     */
    public void setPermissionsManageUsers(java.lang.Boolean permissionsManageUsers) {
        this.permissionsManageUsers = permissionsManageUsers;
    }


    /**
     * Gets the permissionsMassInlineEdit value for this Profile.
     * 
     * @return permissionsMassInlineEdit
     */
    public java.lang.Boolean getPermissionsMassInlineEdit() {
        return permissionsMassInlineEdit;
    }


    /**
     * Sets the permissionsMassInlineEdit value for this Profile.
     * 
     * @param permissionsMassInlineEdit
     */
    public void setPermissionsMassInlineEdit(java.lang.Boolean permissionsMassInlineEdit) {
        this.permissionsMassInlineEdit = permissionsMassInlineEdit;
    }


    /**
     * Gets the permissionsModifyAllData value for this Profile.
     * 
     * @return permissionsModifyAllData
     */
    public java.lang.Boolean getPermissionsModifyAllData() {
        return permissionsModifyAllData;
    }


    /**
     * Sets the permissionsModifyAllData value for this Profile.
     * 
     * @param permissionsModifyAllData
     */
    public void setPermissionsModifyAllData(java.lang.Boolean permissionsModifyAllData) {
        this.permissionsModifyAllData = permissionsModifyAllData;
    }


    /**
     * Gets the permissionsNewReportBuilder value for this Profile.
     * 
     * @return permissionsNewReportBuilder
     */
    public java.lang.Boolean getPermissionsNewReportBuilder() {
        return permissionsNewReportBuilder;
    }


    /**
     * Sets the permissionsNewReportBuilder value for this Profile.
     * 
     * @param permissionsNewReportBuilder
     */
    public void setPermissionsNewReportBuilder(java.lang.Boolean permissionsNewReportBuilder) {
        this.permissionsNewReportBuilder = permissionsNewReportBuilder;
    }


    /**
     * Gets the permissionsOutboundMigrationToolsUser value for this Profile.
     * 
     * @return permissionsOutboundMigrationToolsUser
     */
    public java.lang.Boolean getPermissionsOutboundMigrationToolsUser() {
        return permissionsOutboundMigrationToolsUser;
    }


    /**
     * Sets the permissionsOutboundMigrationToolsUser value for this Profile.
     * 
     * @param permissionsOutboundMigrationToolsUser
     */
    public void setPermissionsOutboundMigrationToolsUser(java.lang.Boolean permissionsOutboundMigrationToolsUser) {
        this.permissionsOutboundMigrationToolsUser = permissionsOutboundMigrationToolsUser;
    }


    /**
     * Gets the permissionsOverrideForecasts value for this Profile.
     * 
     * @return permissionsOverrideForecasts
     */
    public java.lang.Boolean getPermissionsOverrideForecasts() {
        return permissionsOverrideForecasts;
    }


    /**
     * Sets the permissionsOverrideForecasts value for this Profile.
     * 
     * @param permissionsOverrideForecasts
     */
    public void setPermissionsOverrideForecasts(java.lang.Boolean permissionsOverrideForecasts) {
        this.permissionsOverrideForecasts = permissionsOverrideForecasts;
    }


    /**
     * Gets the permissionsPasswordNeverExpires value for this Profile.
     * 
     * @return permissionsPasswordNeverExpires
     */
    public java.lang.Boolean getPermissionsPasswordNeverExpires() {
        return permissionsPasswordNeverExpires;
    }


    /**
     * Sets the permissionsPasswordNeverExpires value for this Profile.
     * 
     * @param permissionsPasswordNeverExpires
     */
    public void setPermissionsPasswordNeverExpires(java.lang.Boolean permissionsPasswordNeverExpires) {
        this.permissionsPasswordNeverExpires = permissionsPasswordNeverExpires;
    }


    /**
     * Gets the permissionsPortalSuperUser value for this Profile.
     * 
     * @return permissionsPortalSuperUser
     */
    public java.lang.Boolean getPermissionsPortalSuperUser() {
        return permissionsPortalSuperUser;
    }


    /**
     * Sets the permissionsPortalSuperUser value for this Profile.
     * 
     * @param permissionsPortalSuperUser
     */
    public void setPermissionsPortalSuperUser(java.lang.Boolean permissionsPortalSuperUser) {
        this.permissionsPortalSuperUser = permissionsPortalSuperUser;
    }


    /**
     * Gets the permissionsPublishMultiforce value for this Profile.
     * 
     * @return permissionsPublishMultiforce
     */
    public java.lang.Boolean getPermissionsPublishMultiforce() {
        return permissionsPublishMultiforce;
    }


    /**
     * Sets the permissionsPublishMultiforce value for this Profile.
     * 
     * @param permissionsPublishMultiforce
     */
    public void setPermissionsPublishMultiforce(java.lang.Boolean permissionsPublishMultiforce) {
        this.permissionsPublishMultiforce = permissionsPublishMultiforce;
    }


    /**
     * Gets the permissionsResetPasswords value for this Profile.
     * 
     * @return permissionsResetPasswords
     */
    public java.lang.Boolean getPermissionsResetPasswords() {
        return permissionsResetPasswords;
    }


    /**
     * Sets the permissionsResetPasswords value for this Profile.
     * 
     * @param permissionsResetPasswords
     */
    public void setPermissionsResetPasswords(java.lang.Boolean permissionsResetPasswords) {
        this.permissionsResetPasswords = permissionsResetPasswords;
    }


    /**
     * Gets the permissionsRunFlow value for this Profile.
     * 
     * @return permissionsRunFlow
     */
    public java.lang.Boolean getPermissionsRunFlow() {
        return permissionsRunFlow;
    }


    /**
     * Sets the permissionsRunFlow value for this Profile.
     * 
     * @param permissionsRunFlow
     */
    public void setPermissionsRunFlow(java.lang.Boolean permissionsRunFlow) {
        this.permissionsRunFlow = permissionsRunFlow;
    }


    /**
     * Gets the permissionsRunReports value for this Profile.
     * 
     * @return permissionsRunReports
     */
    public java.lang.Boolean getPermissionsRunReports() {
        return permissionsRunReports;
    }


    /**
     * Sets the permissionsRunReports value for this Profile.
     * 
     * @param permissionsRunReports
     */
    public void setPermissionsRunReports(java.lang.Boolean permissionsRunReports) {
        this.permissionsRunReports = permissionsRunReports;
    }


    /**
     * Gets the permissionsScheduleJob value for this Profile.
     * 
     * @return permissionsScheduleJob
     */
    public java.lang.Boolean getPermissionsScheduleJob() {
        return permissionsScheduleJob;
    }


    /**
     * Sets the permissionsScheduleJob value for this Profile.
     * 
     * @param permissionsScheduleJob
     */
    public void setPermissionsScheduleJob(java.lang.Boolean permissionsScheduleJob) {
        this.permissionsScheduleJob = permissionsScheduleJob;
    }


    /**
     * Gets the permissionsScheduleReports value for this Profile.
     * 
     * @return permissionsScheduleReports
     */
    public java.lang.Boolean getPermissionsScheduleReports() {
        return permissionsScheduleReports;
    }


    /**
     * Sets the permissionsScheduleReports value for this Profile.
     * 
     * @param permissionsScheduleReports
     */
    public void setPermissionsScheduleReports(java.lang.Boolean permissionsScheduleReports) {
        this.permissionsScheduleReports = permissionsScheduleReports;
    }


    /**
     * Gets the permissionsSendSitRequests value for this Profile.
     * 
     * @return permissionsSendSitRequests
     */
    public java.lang.Boolean getPermissionsSendSitRequests() {
        return permissionsSendSitRequests;
    }


    /**
     * Sets the permissionsSendSitRequests value for this Profile.
     * 
     * @param permissionsSendSitRequests
     */
    public void setPermissionsSendSitRequests(java.lang.Boolean permissionsSendSitRequests) {
        this.permissionsSendSitRequests = permissionsSendSitRequests;
    }


    /**
     * Gets the permissionsSolutionImport value for this Profile.
     * 
     * @return permissionsSolutionImport
     */
    public java.lang.Boolean getPermissionsSolutionImport() {
        return permissionsSolutionImport;
    }


    /**
     * Sets the permissionsSolutionImport value for this Profile.
     * 
     * @param permissionsSolutionImport
     */
    public void setPermissionsSolutionImport(java.lang.Boolean permissionsSolutionImport) {
        this.permissionsSolutionImport = permissionsSolutionImport;
    }


    /**
     * Gets the permissionsTransferAnyCase value for this Profile.
     * 
     * @return permissionsTransferAnyCase
     */
    public java.lang.Boolean getPermissionsTransferAnyCase() {
        return permissionsTransferAnyCase;
    }


    /**
     * Sets the permissionsTransferAnyCase value for this Profile.
     * 
     * @param permissionsTransferAnyCase
     */
    public void setPermissionsTransferAnyCase(java.lang.Boolean permissionsTransferAnyCase) {
        this.permissionsTransferAnyCase = permissionsTransferAnyCase;
    }


    /**
     * Gets the permissionsTransferAnyEntity value for this Profile.
     * 
     * @return permissionsTransferAnyEntity
     */
    public java.lang.Boolean getPermissionsTransferAnyEntity() {
        return permissionsTransferAnyEntity;
    }


    /**
     * Sets the permissionsTransferAnyEntity value for this Profile.
     * 
     * @param permissionsTransferAnyEntity
     */
    public void setPermissionsTransferAnyEntity(java.lang.Boolean permissionsTransferAnyEntity) {
        this.permissionsTransferAnyEntity = permissionsTransferAnyEntity;
    }


    /**
     * Gets the permissionsTransferAnyLead value for this Profile.
     * 
     * @return permissionsTransferAnyLead
     */
    public java.lang.Boolean getPermissionsTransferAnyLead() {
        return permissionsTransferAnyLead;
    }


    /**
     * Sets the permissionsTransferAnyLead value for this Profile.
     * 
     * @param permissionsTransferAnyLead
     */
    public void setPermissionsTransferAnyLead(java.lang.Boolean permissionsTransferAnyLead) {
        this.permissionsTransferAnyLead = permissionsTransferAnyLead;
    }


    /**
     * Gets the permissionsUseTeamReassignWizards value for this Profile.
     * 
     * @return permissionsUseTeamReassignWizards
     */
    public java.lang.Boolean getPermissionsUseTeamReassignWizards() {
        return permissionsUseTeamReassignWizards;
    }


    /**
     * Sets the permissionsUseTeamReassignWizards value for this Profile.
     * 
     * @param permissionsUseTeamReassignWizards
     */
    public void setPermissionsUseTeamReassignWizards(java.lang.Boolean permissionsUseTeamReassignWizards) {
        this.permissionsUseTeamReassignWizards = permissionsUseTeamReassignWizards;
    }


    /**
     * Gets the permissionsViewAllData value for this Profile.
     * 
     * @return permissionsViewAllData
     */
    public java.lang.Boolean getPermissionsViewAllData() {
        return permissionsViewAllData;
    }


    /**
     * Sets the permissionsViewAllData value for this Profile.
     * 
     * @param permissionsViewAllData
     */
    public void setPermissionsViewAllData(java.lang.Boolean permissionsViewAllData) {
        this.permissionsViewAllData = permissionsViewAllData;
    }


    /**
     * Gets the permissionsViewAllForecasts value for this Profile.
     * 
     * @return permissionsViewAllForecasts
     */
    public java.lang.Boolean getPermissionsViewAllForecasts() {
        return permissionsViewAllForecasts;
    }


    /**
     * Sets the permissionsViewAllForecasts value for this Profile.
     * 
     * @param permissionsViewAllForecasts
     */
    public void setPermissionsViewAllForecasts(java.lang.Boolean permissionsViewAllForecasts) {
        this.permissionsViewAllForecasts = permissionsViewAllForecasts;
    }


    /**
     * Gets the permissionsViewDataCategories value for this Profile.
     * 
     * @return permissionsViewDataCategories
     */
    public java.lang.Boolean getPermissionsViewDataCategories() {
        return permissionsViewDataCategories;
    }


    /**
     * Sets the permissionsViewDataCategories value for this Profile.
     * 
     * @param permissionsViewDataCategories
     */
    public void setPermissionsViewDataCategories(java.lang.Boolean permissionsViewDataCategories) {
        this.permissionsViewDataCategories = permissionsViewDataCategories;
    }


    /**
     * Gets the permissionsViewMyTeamsDashboards value for this Profile.
     * 
     * @return permissionsViewMyTeamsDashboards
     */
    public java.lang.Boolean getPermissionsViewMyTeamsDashboards() {
        return permissionsViewMyTeamsDashboards;
    }


    /**
     * Sets the permissionsViewMyTeamsDashboards value for this Profile.
     * 
     * @param permissionsViewMyTeamsDashboards
     */
    public void setPermissionsViewMyTeamsDashboards(java.lang.Boolean permissionsViewMyTeamsDashboards) {
        this.permissionsViewMyTeamsDashboards = permissionsViewMyTeamsDashboards;
    }


    /**
     * Gets the permissionsViewSetup value for this Profile.
     * 
     * @return permissionsViewSetup
     */
    public java.lang.Boolean getPermissionsViewSetup() {
        return permissionsViewSetup;
    }


    /**
     * Sets the permissionsViewSetup value for this Profile.
     * 
     * @param permissionsViewSetup
     */
    public void setPermissionsViewSetup(java.lang.Boolean permissionsViewSetup) {
        this.permissionsViewSetup = permissionsViewSetup;
    }


    /**
     * Gets the systemModstamp value for this Profile.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Profile.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the userLicense value for this Profile.
     * 
     * @return userLicense
     */
    public com.sforce.soap.enterprise.sobject.UserLicense getUserLicense() {
        return userLicense;
    }


    /**
     * Sets the userLicense value for this Profile.
     * 
     * @param userLicense
     */
    public void setUserLicense(com.sforce.soap.enterprise.sobject.UserLicense userLicense) {
        this.userLicense = userLicense;
    }


    /**
     * Gets the userLicenseId value for this Profile.
     * 
     * @return userLicenseId
     */
    public java.lang.String getUserLicenseId() {
        return userLicenseId;
    }


    /**
     * Sets the userLicenseId value for this Profile.
     * 
     * @param userLicenseId
     */
    public void setUserLicenseId(java.lang.String userLicenseId) {
        this.userLicenseId = userLicenseId;
    }


    /**
     * Gets the userType value for this Profile.
     * 
     * @return userType
     */
    public java.lang.String getUserType() {
        return userType;
    }


    /**
     * Sets the userType value for this Profile.
     * 
     * @param userType
     */
    public void setUserType(java.lang.String userType) {
        this.userType = userType;
    }


    /**
     * Gets the users value for this Profile.
     * 
     * @return users
     */
    public com.sforce.soap.enterprise.QueryResult getUsers() {
        return users;
    }


    /**
     * Sets the users value for this Profile.
     * 
     * @param users
     */
    public void setUsers(com.sforce.soap.enterprise.QueryResult users) {
        this.users = users;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Profile)) return false;
        Profile other = (Profile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
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
            ((this.permissionsApiEnabled==null && other.getPermissionsApiEnabled()==null) || 
             (this.permissionsApiEnabled!=null &&
              this.permissionsApiEnabled.equals(other.getPermissionsApiEnabled()))) &&
            ((this.permissionsApiUserOnly==null && other.getPermissionsApiUserOnly()==null) || 
             (this.permissionsApiUserOnly!=null &&
              this.permissionsApiUserOnly.equals(other.getPermissionsApiUserOnly()))) &&
            ((this.permissionsAuthorApex==null && other.getPermissionsAuthorApex()==null) || 
             (this.permissionsAuthorApex!=null &&
              this.permissionsAuthorApex.equals(other.getPermissionsAuthorApex()))) &&
            ((this.permissionsBulkApiHardDelete==null && other.getPermissionsBulkApiHardDelete()==null) || 
             (this.permissionsBulkApiHardDelete!=null &&
              this.permissionsBulkApiHardDelete.equals(other.getPermissionsBulkApiHardDelete()))) &&
            ((this.permissionsCanInsertFeedSystemFields==null && other.getPermissionsCanInsertFeedSystemFields()==null) || 
             (this.permissionsCanInsertFeedSystemFields!=null &&
              this.permissionsCanInsertFeedSystemFields.equals(other.getPermissionsCanInsertFeedSystemFields()))) &&
            ((this.permissionsCanUseNewDashboardBuilder==null && other.getPermissionsCanUseNewDashboardBuilder()==null) || 
             (this.permissionsCanUseNewDashboardBuilder!=null &&
              this.permissionsCanUseNewDashboardBuilder.equals(other.getPermissionsCanUseNewDashboardBuilder()))) &&
            ((this.permissionsChatterFileLink==null && other.getPermissionsChatterFileLink()==null) || 
             (this.permissionsChatterFileLink!=null &&
              this.permissionsChatterFileLink.equals(other.getPermissionsChatterFileLink()))) &&
            ((this.permissionsConvertLeads==null && other.getPermissionsConvertLeads()==null) || 
             (this.permissionsConvertLeads!=null &&
              this.permissionsConvertLeads.equals(other.getPermissionsConvertLeads()))) &&
            ((this.permissionsCreateMultiforce==null && other.getPermissionsCreateMultiforce()==null) || 
             (this.permissionsCreateMultiforce!=null &&
              this.permissionsCreateMultiforce.equals(other.getPermissionsCreateMultiforce()))) &&
            ((this.permissionsCustomizeApplication==null && other.getPermissionsCustomizeApplication()==null) || 
             (this.permissionsCustomizeApplication!=null &&
              this.permissionsCustomizeApplication.equals(other.getPermissionsCustomizeApplication()))) &&
            ((this.permissionsDelegatedPortalUserAdmin==null && other.getPermissionsDelegatedPortalUserAdmin()==null) || 
             (this.permissionsDelegatedPortalUserAdmin!=null &&
              this.permissionsDelegatedPortalUserAdmin.equals(other.getPermissionsDelegatedPortalUserAdmin()))) &&
            ((this.permissionsDistributeFromPersWksp==null && other.getPermissionsDistributeFromPersWksp()==null) || 
             (this.permissionsDistributeFromPersWksp!=null &&
              this.permissionsDistributeFromPersWksp.equals(other.getPermissionsDistributeFromPersWksp()))) &&
            ((this.permissionsEditCaseComments==null && other.getPermissionsEditCaseComments()==null) || 
             (this.permissionsEditCaseComments!=null &&
              this.permissionsEditCaseComments.equals(other.getPermissionsEditCaseComments()))) &&
            ((this.permissionsEditEvent==null && other.getPermissionsEditEvent()==null) || 
             (this.permissionsEditEvent!=null &&
              this.permissionsEditEvent.equals(other.getPermissionsEditEvent()))) &&
            ((this.permissionsEditKnowledge==null && other.getPermissionsEditKnowledge()==null) || 
             (this.permissionsEditKnowledge!=null &&
              this.permissionsEditKnowledge.equals(other.getPermissionsEditKnowledge()))) &&
            ((this.permissionsEditOppLineItemUnitPrice==null && other.getPermissionsEditOppLineItemUnitPrice()==null) || 
             (this.permissionsEditOppLineItemUnitPrice!=null &&
              this.permissionsEditOppLineItemUnitPrice.equals(other.getPermissionsEditOppLineItemUnitPrice()))) &&
            ((this.permissionsEditOwnQuota==null && other.getPermissionsEditOwnQuota()==null) || 
             (this.permissionsEditOwnQuota!=null &&
              this.permissionsEditOwnQuota.equals(other.getPermissionsEditOwnQuota()))) &&
            ((this.permissionsEditPublicDocuments==null && other.getPermissionsEditPublicDocuments()==null) || 
             (this.permissionsEditPublicDocuments!=null &&
              this.permissionsEditPublicDocuments.equals(other.getPermissionsEditPublicDocuments()))) &&
            ((this.permissionsEditReadonlyFields==null && other.getPermissionsEditReadonlyFields()==null) || 
             (this.permissionsEditReadonlyFields!=null &&
              this.permissionsEditReadonlyFields.equals(other.getPermissionsEditReadonlyFields()))) &&
            ((this.permissionsEditReports==null && other.getPermissionsEditReports()==null) || 
             (this.permissionsEditReports!=null &&
              this.permissionsEditReports.equals(other.getPermissionsEditReports()))) &&
            ((this.permissionsEditTask==null && other.getPermissionsEditTask()==null) || 
             (this.permissionsEditTask!=null &&
              this.permissionsEditTask.equals(other.getPermissionsEditTask()))) &&
            ((this.permissionsEmailAdministration==null && other.getPermissionsEmailAdministration()==null) || 
             (this.permissionsEmailAdministration!=null &&
              this.permissionsEmailAdministration.equals(other.getPermissionsEmailAdministration()))) &&
            ((this.permissionsEmailTemplateManagement==null && other.getPermissionsEmailTemplateManagement()==null) || 
             (this.permissionsEmailTemplateManagement!=null &&
              this.permissionsEmailTemplateManagement.equals(other.getPermissionsEmailTemplateManagement()))) &&
            ((this.permissionsEnableNotifications==null && other.getPermissionsEnableNotifications()==null) || 
             (this.permissionsEnableNotifications!=null &&
              this.permissionsEnableNotifications.equals(other.getPermissionsEnableNotifications()))) &&
            ((this.permissionsFlowUFLRequired==null && other.getPermissionsFlowUFLRequired()==null) || 
             (this.permissionsFlowUFLRequired!=null &&
              this.permissionsFlowUFLRequired.equals(other.getPermissionsFlowUFLRequired()))) &&
            ((this.permissionsImportLeads==null && other.getPermissionsImportLeads()==null) || 
             (this.permissionsImportLeads!=null &&
              this.permissionsImportLeads.equals(other.getPermissionsImportLeads()))) &&
            ((this.permissionsInboundMigrationToolsUser==null && other.getPermissionsInboundMigrationToolsUser()==null) || 
             (this.permissionsInboundMigrationToolsUser!=null &&
              this.permissionsInboundMigrationToolsUser.equals(other.getPermissionsInboundMigrationToolsUser()))) &&
            ((this.permissionsInstallMultiforce==null && other.getPermissionsInstallMultiforce()==null) || 
             (this.permissionsInstallMultiforce!=null &&
              this.permissionsInstallMultiforce.equals(other.getPermissionsInstallMultiforce()))) &&
            ((this.permissionsManageAnalyticSnapshots==null && other.getPermissionsManageAnalyticSnapshots()==null) || 
             (this.permissionsManageAnalyticSnapshots!=null &&
              this.permissionsManageAnalyticSnapshots.equals(other.getPermissionsManageAnalyticSnapshots()))) &&
            ((this.permissionsManageAuthProviders==null && other.getPermissionsManageAuthProviders()==null) || 
             (this.permissionsManageAuthProviders!=null &&
              this.permissionsManageAuthProviders.equals(other.getPermissionsManageAuthProviders()))) &&
            ((this.permissionsManageBusinessHourHolidays==null && other.getPermissionsManageBusinessHourHolidays()==null) || 
             (this.permissionsManageBusinessHourHolidays!=null &&
              this.permissionsManageBusinessHourHolidays.equals(other.getPermissionsManageBusinessHourHolidays()))) &&
            ((this.permissionsManageCallCenters==null && other.getPermissionsManageCallCenters()==null) || 
             (this.permissionsManageCallCenters!=null &&
              this.permissionsManageCallCenters.equals(other.getPermissionsManageCallCenters()))) &&
            ((this.permissionsManageCases==null && other.getPermissionsManageCases()==null) || 
             (this.permissionsManageCases!=null &&
              this.permissionsManageCases.equals(other.getPermissionsManageCases()))) &&
            ((this.permissionsManageCategories==null && other.getPermissionsManageCategories()==null) || 
             (this.permissionsManageCategories!=null &&
              this.permissionsManageCategories.equals(other.getPermissionsManageCategories()))) &&
            ((this.permissionsManageChatterMessages==null && other.getPermissionsManageChatterMessages()==null) || 
             (this.permissionsManageChatterMessages!=null &&
              this.permissionsManageChatterMessages.equals(other.getPermissionsManageChatterMessages()))) &&
            ((this.permissionsManageCssUsers==null && other.getPermissionsManageCssUsers()==null) || 
             (this.permissionsManageCssUsers!=null &&
              this.permissionsManageCssUsers.equals(other.getPermissionsManageCssUsers()))) &&
            ((this.permissionsManageCustomReportTypes==null && other.getPermissionsManageCustomReportTypes()==null) || 
             (this.permissionsManageCustomReportTypes!=null &&
              this.permissionsManageCustomReportTypes.equals(other.getPermissionsManageCustomReportTypes()))) &&
            ((this.permissionsManageDashboards==null && other.getPermissionsManageDashboards()==null) || 
             (this.permissionsManageDashboards!=null &&
              this.permissionsManageDashboards.equals(other.getPermissionsManageDashboards()))) &&
            ((this.permissionsManageDataCategories==null && other.getPermissionsManageDataCategories()==null) || 
             (this.permissionsManageDataCategories!=null &&
              this.permissionsManageDataCategories.equals(other.getPermissionsManageDataCategories()))) &&
            ((this.permissionsManageDataIntegrations==null && other.getPermissionsManageDataIntegrations()==null) || 
             (this.permissionsManageDataIntegrations!=null &&
              this.permissionsManageDataIntegrations.equals(other.getPermissionsManageDataIntegrations()))) &&
            ((this.permissionsManageDynamicDashboards==null && other.getPermissionsManageDynamicDashboards()==null) || 
             (this.permissionsManageDynamicDashboards!=null &&
              this.permissionsManageDynamicDashboards.equals(other.getPermissionsManageDynamicDashboards()))) &&
            ((this.permissionsManageEmailClientConfig==null && other.getPermissionsManageEmailClientConfig()==null) || 
             (this.permissionsManageEmailClientConfig!=null &&
              this.permissionsManageEmailClientConfig.equals(other.getPermissionsManageEmailClientConfig()))) &&
            ((this.permissionsManageInteraction==null && other.getPermissionsManageInteraction()==null) || 
             (this.permissionsManageInteraction!=null &&
              this.permissionsManageInteraction.equals(other.getPermissionsManageInteraction()))) &&
            ((this.permissionsManageKnowledge==null && other.getPermissionsManageKnowledge()==null) || 
             (this.permissionsManageKnowledge!=null &&
              this.permissionsManageKnowledge.equals(other.getPermissionsManageKnowledge()))) &&
            ((this.permissionsManageKnowledgeImportExport==null && other.getPermissionsManageKnowledgeImportExport()==null) || 
             (this.permissionsManageKnowledgeImportExport!=null &&
              this.permissionsManageKnowledgeImportExport.equals(other.getPermissionsManageKnowledgeImportExport()))) &&
            ((this.permissionsManageLeads==null && other.getPermissionsManageLeads()==null) || 
             (this.permissionsManageLeads!=null &&
              this.permissionsManageLeads.equals(other.getPermissionsManageLeads()))) &&
            ((this.permissionsManageMobile==null && other.getPermissionsManageMobile()==null) || 
             (this.permissionsManageMobile!=null &&
              this.permissionsManageMobile.equals(other.getPermissionsManageMobile()))) &&
            ((this.permissionsManageRemoteAccess==null && other.getPermissionsManageRemoteAccess()==null) || 
             (this.permissionsManageRemoteAccess!=null &&
              this.permissionsManageRemoteAccess.equals(other.getPermissionsManageRemoteAccess()))) &&
            ((this.permissionsManageSelfService==null && other.getPermissionsManageSelfService()==null) || 
             (this.permissionsManageSelfService!=null &&
              this.permissionsManageSelfService.equals(other.getPermissionsManageSelfService()))) &&
            ((this.permissionsManageSolutions==null && other.getPermissionsManageSolutions()==null) || 
             (this.permissionsManageSolutions!=null &&
              this.permissionsManageSolutions.equals(other.getPermissionsManageSolutions()))) &&
            ((this.permissionsManageSynonyms==null && other.getPermissionsManageSynonyms()==null) || 
             (this.permissionsManageSynonyms!=null &&
              this.permissionsManageSynonyms.equals(other.getPermissionsManageSynonyms()))) &&
            ((this.permissionsManageUsers==null && other.getPermissionsManageUsers()==null) || 
             (this.permissionsManageUsers!=null &&
              this.permissionsManageUsers.equals(other.getPermissionsManageUsers()))) &&
            ((this.permissionsMassInlineEdit==null && other.getPermissionsMassInlineEdit()==null) || 
             (this.permissionsMassInlineEdit!=null &&
              this.permissionsMassInlineEdit.equals(other.getPermissionsMassInlineEdit()))) &&
            ((this.permissionsModifyAllData==null && other.getPermissionsModifyAllData()==null) || 
             (this.permissionsModifyAllData!=null &&
              this.permissionsModifyAllData.equals(other.getPermissionsModifyAllData()))) &&
            ((this.permissionsNewReportBuilder==null && other.getPermissionsNewReportBuilder()==null) || 
             (this.permissionsNewReportBuilder!=null &&
              this.permissionsNewReportBuilder.equals(other.getPermissionsNewReportBuilder()))) &&
            ((this.permissionsOutboundMigrationToolsUser==null && other.getPermissionsOutboundMigrationToolsUser()==null) || 
             (this.permissionsOutboundMigrationToolsUser!=null &&
              this.permissionsOutboundMigrationToolsUser.equals(other.getPermissionsOutboundMigrationToolsUser()))) &&
            ((this.permissionsOverrideForecasts==null && other.getPermissionsOverrideForecasts()==null) || 
             (this.permissionsOverrideForecasts!=null &&
              this.permissionsOverrideForecasts.equals(other.getPermissionsOverrideForecasts()))) &&
            ((this.permissionsPasswordNeverExpires==null && other.getPermissionsPasswordNeverExpires()==null) || 
             (this.permissionsPasswordNeverExpires!=null &&
              this.permissionsPasswordNeverExpires.equals(other.getPermissionsPasswordNeverExpires()))) &&
            ((this.permissionsPortalSuperUser==null && other.getPermissionsPortalSuperUser()==null) || 
             (this.permissionsPortalSuperUser!=null &&
              this.permissionsPortalSuperUser.equals(other.getPermissionsPortalSuperUser()))) &&
            ((this.permissionsPublishMultiforce==null && other.getPermissionsPublishMultiforce()==null) || 
             (this.permissionsPublishMultiforce!=null &&
              this.permissionsPublishMultiforce.equals(other.getPermissionsPublishMultiforce()))) &&
            ((this.permissionsResetPasswords==null && other.getPermissionsResetPasswords()==null) || 
             (this.permissionsResetPasswords!=null &&
              this.permissionsResetPasswords.equals(other.getPermissionsResetPasswords()))) &&
            ((this.permissionsRunFlow==null && other.getPermissionsRunFlow()==null) || 
             (this.permissionsRunFlow!=null &&
              this.permissionsRunFlow.equals(other.getPermissionsRunFlow()))) &&
            ((this.permissionsRunReports==null && other.getPermissionsRunReports()==null) || 
             (this.permissionsRunReports!=null &&
              this.permissionsRunReports.equals(other.getPermissionsRunReports()))) &&
            ((this.permissionsScheduleJob==null && other.getPermissionsScheduleJob()==null) || 
             (this.permissionsScheduleJob!=null &&
              this.permissionsScheduleJob.equals(other.getPermissionsScheduleJob()))) &&
            ((this.permissionsScheduleReports==null && other.getPermissionsScheduleReports()==null) || 
             (this.permissionsScheduleReports!=null &&
              this.permissionsScheduleReports.equals(other.getPermissionsScheduleReports()))) &&
            ((this.permissionsSendSitRequests==null && other.getPermissionsSendSitRequests()==null) || 
             (this.permissionsSendSitRequests!=null &&
              this.permissionsSendSitRequests.equals(other.getPermissionsSendSitRequests()))) &&
            ((this.permissionsSolutionImport==null && other.getPermissionsSolutionImport()==null) || 
             (this.permissionsSolutionImport!=null &&
              this.permissionsSolutionImport.equals(other.getPermissionsSolutionImport()))) &&
            ((this.permissionsTransferAnyCase==null && other.getPermissionsTransferAnyCase()==null) || 
             (this.permissionsTransferAnyCase!=null &&
              this.permissionsTransferAnyCase.equals(other.getPermissionsTransferAnyCase()))) &&
            ((this.permissionsTransferAnyEntity==null && other.getPermissionsTransferAnyEntity()==null) || 
             (this.permissionsTransferAnyEntity!=null &&
              this.permissionsTransferAnyEntity.equals(other.getPermissionsTransferAnyEntity()))) &&
            ((this.permissionsTransferAnyLead==null && other.getPermissionsTransferAnyLead()==null) || 
             (this.permissionsTransferAnyLead!=null &&
              this.permissionsTransferAnyLead.equals(other.getPermissionsTransferAnyLead()))) &&
            ((this.permissionsUseTeamReassignWizards==null && other.getPermissionsUseTeamReassignWizards()==null) || 
             (this.permissionsUseTeamReassignWizards!=null &&
              this.permissionsUseTeamReassignWizards.equals(other.getPermissionsUseTeamReassignWizards()))) &&
            ((this.permissionsViewAllData==null && other.getPermissionsViewAllData()==null) || 
             (this.permissionsViewAllData!=null &&
              this.permissionsViewAllData.equals(other.getPermissionsViewAllData()))) &&
            ((this.permissionsViewAllForecasts==null && other.getPermissionsViewAllForecasts()==null) || 
             (this.permissionsViewAllForecasts!=null &&
              this.permissionsViewAllForecasts.equals(other.getPermissionsViewAllForecasts()))) &&
            ((this.permissionsViewDataCategories==null && other.getPermissionsViewDataCategories()==null) || 
             (this.permissionsViewDataCategories!=null &&
              this.permissionsViewDataCategories.equals(other.getPermissionsViewDataCategories()))) &&
            ((this.permissionsViewMyTeamsDashboards==null && other.getPermissionsViewMyTeamsDashboards()==null) || 
             (this.permissionsViewMyTeamsDashboards!=null &&
              this.permissionsViewMyTeamsDashboards.equals(other.getPermissionsViewMyTeamsDashboards()))) &&
            ((this.permissionsViewSetup==null && other.getPermissionsViewSetup()==null) || 
             (this.permissionsViewSetup!=null &&
              this.permissionsViewSetup.equals(other.getPermissionsViewSetup()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.userLicense==null && other.getUserLicense()==null) || 
             (this.userLicense!=null &&
              this.userLicense.equals(other.getUserLicense()))) &&
            ((this.userLicenseId==null && other.getUserLicenseId()==null) || 
             (this.userLicenseId!=null &&
              this.userLicenseId.equals(other.getUserLicenseId()))) &&
            ((this.userType==null && other.getUserType()==null) || 
             (this.userType!=null &&
              this.userType.equals(other.getUserType()))) &&
            ((this.users==null && other.getUsers()==null) || 
             (this.users!=null &&
              this.users.equals(other.getUsers())));
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
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getCreatedById() != null) {
            _hashCode += getCreatedById().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
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
        if (getPermissionsApiEnabled() != null) {
            _hashCode += getPermissionsApiEnabled().hashCode();
        }
        if (getPermissionsApiUserOnly() != null) {
            _hashCode += getPermissionsApiUserOnly().hashCode();
        }
        if (getPermissionsAuthorApex() != null) {
            _hashCode += getPermissionsAuthorApex().hashCode();
        }
        if (getPermissionsBulkApiHardDelete() != null) {
            _hashCode += getPermissionsBulkApiHardDelete().hashCode();
        }
        if (getPermissionsCanInsertFeedSystemFields() != null) {
            _hashCode += getPermissionsCanInsertFeedSystemFields().hashCode();
        }
        if (getPermissionsCanUseNewDashboardBuilder() != null) {
            _hashCode += getPermissionsCanUseNewDashboardBuilder().hashCode();
        }
        if (getPermissionsChatterFileLink() != null) {
            _hashCode += getPermissionsChatterFileLink().hashCode();
        }
        if (getPermissionsConvertLeads() != null) {
            _hashCode += getPermissionsConvertLeads().hashCode();
        }
        if (getPermissionsCreateMultiforce() != null) {
            _hashCode += getPermissionsCreateMultiforce().hashCode();
        }
        if (getPermissionsCustomizeApplication() != null) {
            _hashCode += getPermissionsCustomizeApplication().hashCode();
        }
        if (getPermissionsDelegatedPortalUserAdmin() != null) {
            _hashCode += getPermissionsDelegatedPortalUserAdmin().hashCode();
        }
        if (getPermissionsDistributeFromPersWksp() != null) {
            _hashCode += getPermissionsDistributeFromPersWksp().hashCode();
        }
        if (getPermissionsEditCaseComments() != null) {
            _hashCode += getPermissionsEditCaseComments().hashCode();
        }
        if (getPermissionsEditEvent() != null) {
            _hashCode += getPermissionsEditEvent().hashCode();
        }
        if (getPermissionsEditKnowledge() != null) {
            _hashCode += getPermissionsEditKnowledge().hashCode();
        }
        if (getPermissionsEditOppLineItemUnitPrice() != null) {
            _hashCode += getPermissionsEditOppLineItemUnitPrice().hashCode();
        }
        if (getPermissionsEditOwnQuota() != null) {
            _hashCode += getPermissionsEditOwnQuota().hashCode();
        }
        if (getPermissionsEditPublicDocuments() != null) {
            _hashCode += getPermissionsEditPublicDocuments().hashCode();
        }
        if (getPermissionsEditReadonlyFields() != null) {
            _hashCode += getPermissionsEditReadonlyFields().hashCode();
        }
        if (getPermissionsEditReports() != null) {
            _hashCode += getPermissionsEditReports().hashCode();
        }
        if (getPermissionsEditTask() != null) {
            _hashCode += getPermissionsEditTask().hashCode();
        }
        if (getPermissionsEmailAdministration() != null) {
            _hashCode += getPermissionsEmailAdministration().hashCode();
        }
        if (getPermissionsEmailTemplateManagement() != null) {
            _hashCode += getPermissionsEmailTemplateManagement().hashCode();
        }
        if (getPermissionsEnableNotifications() != null) {
            _hashCode += getPermissionsEnableNotifications().hashCode();
        }
        if (getPermissionsFlowUFLRequired() != null) {
            _hashCode += getPermissionsFlowUFLRequired().hashCode();
        }
        if (getPermissionsImportLeads() != null) {
            _hashCode += getPermissionsImportLeads().hashCode();
        }
        if (getPermissionsInboundMigrationToolsUser() != null) {
            _hashCode += getPermissionsInboundMigrationToolsUser().hashCode();
        }
        if (getPermissionsInstallMultiforce() != null) {
            _hashCode += getPermissionsInstallMultiforce().hashCode();
        }
        if (getPermissionsManageAnalyticSnapshots() != null) {
            _hashCode += getPermissionsManageAnalyticSnapshots().hashCode();
        }
        if (getPermissionsManageAuthProviders() != null) {
            _hashCode += getPermissionsManageAuthProviders().hashCode();
        }
        if (getPermissionsManageBusinessHourHolidays() != null) {
            _hashCode += getPermissionsManageBusinessHourHolidays().hashCode();
        }
        if (getPermissionsManageCallCenters() != null) {
            _hashCode += getPermissionsManageCallCenters().hashCode();
        }
        if (getPermissionsManageCases() != null) {
            _hashCode += getPermissionsManageCases().hashCode();
        }
        if (getPermissionsManageCategories() != null) {
            _hashCode += getPermissionsManageCategories().hashCode();
        }
        if (getPermissionsManageChatterMessages() != null) {
            _hashCode += getPermissionsManageChatterMessages().hashCode();
        }
        if (getPermissionsManageCssUsers() != null) {
            _hashCode += getPermissionsManageCssUsers().hashCode();
        }
        if (getPermissionsManageCustomReportTypes() != null) {
            _hashCode += getPermissionsManageCustomReportTypes().hashCode();
        }
        if (getPermissionsManageDashboards() != null) {
            _hashCode += getPermissionsManageDashboards().hashCode();
        }
        if (getPermissionsManageDataCategories() != null) {
            _hashCode += getPermissionsManageDataCategories().hashCode();
        }
        if (getPermissionsManageDataIntegrations() != null) {
            _hashCode += getPermissionsManageDataIntegrations().hashCode();
        }
        if (getPermissionsManageDynamicDashboards() != null) {
            _hashCode += getPermissionsManageDynamicDashboards().hashCode();
        }
        if (getPermissionsManageEmailClientConfig() != null) {
            _hashCode += getPermissionsManageEmailClientConfig().hashCode();
        }
        if (getPermissionsManageInteraction() != null) {
            _hashCode += getPermissionsManageInteraction().hashCode();
        }
        if (getPermissionsManageKnowledge() != null) {
            _hashCode += getPermissionsManageKnowledge().hashCode();
        }
        if (getPermissionsManageKnowledgeImportExport() != null) {
            _hashCode += getPermissionsManageKnowledgeImportExport().hashCode();
        }
        if (getPermissionsManageLeads() != null) {
            _hashCode += getPermissionsManageLeads().hashCode();
        }
        if (getPermissionsManageMobile() != null) {
            _hashCode += getPermissionsManageMobile().hashCode();
        }
        if (getPermissionsManageRemoteAccess() != null) {
            _hashCode += getPermissionsManageRemoteAccess().hashCode();
        }
        if (getPermissionsManageSelfService() != null) {
            _hashCode += getPermissionsManageSelfService().hashCode();
        }
        if (getPermissionsManageSolutions() != null) {
            _hashCode += getPermissionsManageSolutions().hashCode();
        }
        if (getPermissionsManageSynonyms() != null) {
            _hashCode += getPermissionsManageSynonyms().hashCode();
        }
        if (getPermissionsManageUsers() != null) {
            _hashCode += getPermissionsManageUsers().hashCode();
        }
        if (getPermissionsMassInlineEdit() != null) {
            _hashCode += getPermissionsMassInlineEdit().hashCode();
        }
        if (getPermissionsModifyAllData() != null) {
            _hashCode += getPermissionsModifyAllData().hashCode();
        }
        if (getPermissionsNewReportBuilder() != null) {
            _hashCode += getPermissionsNewReportBuilder().hashCode();
        }
        if (getPermissionsOutboundMigrationToolsUser() != null) {
            _hashCode += getPermissionsOutboundMigrationToolsUser().hashCode();
        }
        if (getPermissionsOverrideForecasts() != null) {
            _hashCode += getPermissionsOverrideForecasts().hashCode();
        }
        if (getPermissionsPasswordNeverExpires() != null) {
            _hashCode += getPermissionsPasswordNeverExpires().hashCode();
        }
        if (getPermissionsPortalSuperUser() != null) {
            _hashCode += getPermissionsPortalSuperUser().hashCode();
        }
        if (getPermissionsPublishMultiforce() != null) {
            _hashCode += getPermissionsPublishMultiforce().hashCode();
        }
        if (getPermissionsResetPasswords() != null) {
            _hashCode += getPermissionsResetPasswords().hashCode();
        }
        if (getPermissionsRunFlow() != null) {
            _hashCode += getPermissionsRunFlow().hashCode();
        }
        if (getPermissionsRunReports() != null) {
            _hashCode += getPermissionsRunReports().hashCode();
        }
        if (getPermissionsScheduleJob() != null) {
            _hashCode += getPermissionsScheduleJob().hashCode();
        }
        if (getPermissionsScheduleReports() != null) {
            _hashCode += getPermissionsScheduleReports().hashCode();
        }
        if (getPermissionsSendSitRequests() != null) {
            _hashCode += getPermissionsSendSitRequests().hashCode();
        }
        if (getPermissionsSolutionImport() != null) {
            _hashCode += getPermissionsSolutionImport().hashCode();
        }
        if (getPermissionsTransferAnyCase() != null) {
            _hashCode += getPermissionsTransferAnyCase().hashCode();
        }
        if (getPermissionsTransferAnyEntity() != null) {
            _hashCode += getPermissionsTransferAnyEntity().hashCode();
        }
        if (getPermissionsTransferAnyLead() != null) {
            _hashCode += getPermissionsTransferAnyLead().hashCode();
        }
        if (getPermissionsUseTeamReassignWizards() != null) {
            _hashCode += getPermissionsUseTeamReassignWizards().hashCode();
        }
        if (getPermissionsViewAllData() != null) {
            _hashCode += getPermissionsViewAllData().hashCode();
        }
        if (getPermissionsViewAllForecasts() != null) {
            _hashCode += getPermissionsViewAllForecasts().hashCode();
        }
        if (getPermissionsViewDataCategories() != null) {
            _hashCode += getPermissionsViewDataCategories().hashCode();
        }
        if (getPermissionsViewMyTeamsDashboards() != null) {
            _hashCode += getPermissionsViewMyTeamsDashboards().hashCode();
        }
        if (getPermissionsViewSetup() != null) {
            _hashCode += getPermissionsViewSetup().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getUserLicense() != null) {
            _hashCode += getUserLicense().hashCode();
        }
        if (getUserLicenseId() != null) {
            _hashCode += getUserLicenseId().hashCode();
        }
        if (getUserType() != null) {
            _hashCode += getUserType().hashCode();
        }
        if (getUsers() != null) {
            _hashCode += getUsers().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Profile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Profile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Description"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsApiEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsApiEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsApiUserOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsApiUserOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsAuthorApex");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsAuthorApex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsBulkApiHardDelete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsBulkApiHardDelete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsCanInsertFeedSystemFields");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsCanInsertFeedSystemFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsCanUseNewDashboardBuilder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsCanUseNewDashboardBuilder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsChatterFileLink");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsChatterFileLink"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsConvertLeads");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsConvertLeads"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsCreateMultiforce");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsCreateMultiforce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsCustomizeApplication");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsCustomizeApplication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsDelegatedPortalUserAdmin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsDelegatedPortalUserAdmin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsDistributeFromPersWksp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsDistributeFromPersWksp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEditCaseComments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEditCaseComments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEditEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEditEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEditKnowledge");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEditKnowledge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEditOppLineItemUnitPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEditOppLineItemUnitPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEditOwnQuota");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEditOwnQuota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEditPublicDocuments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEditPublicDocuments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEditReadonlyFields");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEditReadonlyFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEditReports");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEditReports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEditTask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEditTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEmailAdministration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEmailAdministration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEmailTemplateManagement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEmailTemplateManagement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEnableNotifications");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEnableNotifications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsFlowUFLRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsFlowUFLRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsImportLeads");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsImportLeads"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsInboundMigrationToolsUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsInboundMigrationToolsUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsInstallMultiforce");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsInstallMultiforce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageAnalyticSnapshots");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageAnalyticSnapshots"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageAuthProviders");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageAuthProviders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageBusinessHourHolidays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageBusinessHourHolidays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageCallCenters");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageCallCenters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageCases");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageCases"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageCategories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageCategories"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageChatterMessages");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageChatterMessages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageCssUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageCssUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageCustomReportTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageCustomReportTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageDashboards");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageDashboards"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageDataCategories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageDataCategories"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageDataIntegrations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageDataIntegrations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageDynamicDashboards");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageDynamicDashboards"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageEmailClientConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageEmailClientConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageInteraction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageInteraction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageKnowledge");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageKnowledge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageKnowledgeImportExport");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageKnowledgeImportExport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageLeads");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageLeads"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageMobile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageMobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageRemoteAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageRemoteAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageSelfService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageSelfService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageSolutions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageSolutions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageSynonyms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageSynonyms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsMassInlineEdit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsMassInlineEdit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsModifyAllData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsModifyAllData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsNewReportBuilder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsNewReportBuilder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsOutboundMigrationToolsUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsOutboundMigrationToolsUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsOverrideForecasts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsOverrideForecasts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsPasswordNeverExpires");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsPasswordNeverExpires"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsPortalSuperUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsPortalSuperUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsPublishMultiforce");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsPublishMultiforce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsResetPasswords");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsResetPasswords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsRunFlow");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsRunFlow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsRunReports");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsRunReports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsScheduleJob");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsScheduleJob"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsScheduleReports");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsScheduleReports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsSendSitRequests");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsSendSitRequests"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsSolutionImport");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsSolutionImport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsTransferAnyCase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsTransferAnyCase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsTransferAnyEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsTransferAnyEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsTransferAnyLead");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsTransferAnyLead"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsUseTeamReassignWizards");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsUseTeamReassignWizards"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsViewAllData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsViewAllData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsViewAllForecasts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsViewAllForecasts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsViewDataCategories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsViewDataCategories"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsViewMyTeamsDashboards");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsViewMyTeamsDashboards"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsViewSetup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsViewSetup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("userLicense");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserLicense"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserLicense"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userLicenseId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserLicenseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("users");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Users"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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

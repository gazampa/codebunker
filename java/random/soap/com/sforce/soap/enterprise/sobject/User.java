/**
 * User.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class User  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String aboutMe;

    private java.lang.String accountId;

    private com.sforce.soap.enterprise.QueryResult accounts__r;

    private com.sforce.soap.enterprise.QueryResult admin_Certifications1__r;

    private com.sforce.soap.enterprise.QueryResult admin_Certifications__r;

    private java.lang.String alias;

    private com.sforce.soap.enterprise.QueryResult analytic_Snapshots__r;

    private com.sforce.soap.enterprise.QueryResult article_and_Category_Reporting1__r;

    private com.sforce.soap.enterprise.QueryResult article_and_Category_Reporting__r;

    private com.sforce.soap.enterprise.QueryResult CS_Management_Cases__r;

    private java.lang.String callCenterId;

    private com.sforce.soap.enterprise.QueryResult cases1__r;

    private com.sforce.soap.enterprise.QueryResult cases__r;

    private com.sforce.soap.enterprise.QueryResult change_Control__r;

    private com.sforce.soap.enterprise.QueryResult change_Controls1__r;

    private com.sforce.soap.enterprise.QueryResult change_Controls__r;

    private com.sforce.soap.enterprise.QueryResult channel_Manager_Outlines1__r;

    private com.sforce.soap.enterprise.QueryResult channel_Manager_Outlines__r;

    private java.lang.String city;

    private java.lang.String client_Type__c;

    private java.lang.String communityNickname;

    private java.lang.String companyName;

    private com.sforce.soap.enterprise.sobject.Contact contact;

    private java.lang.String contactId;

    private com.sforce.soap.enterprise.QueryResult content_Download_Notifications__r;

    private com.sforce.soap.enterprise.QueryResult contractsSigned;

    private java.lang.String country;

    private com.sforce.soap.enterprise.QueryResult courier1__Recipients__r;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String defaultGroupNotificationFrequency;

    private java.lang.String delegatedApproverId;

    private com.sforce.soap.enterprise.QueryResult delegatedUsers;

    private java.lang.String department;

    private com.sforce.soap.enterprise.QueryResult development_Cases__r;

    private java.lang.String digestFrequency;

    private java.lang.String division;

    private com.sforce.soap.enterprise.QueryResult dominu_Tasks1__r;

    private com.sforce.soap.enterprise.QueryResult dominu_Tasks2__r;

    private com.sforce.soap.enterprise.QueryResult dominu_Tasks__r;

    private java.lang.String email;

    private java.lang.String emailEncodingKey;

    private java.lang.String employeeNumber;

    private com.sforce.soap.enterprise.QueryResult eventRelations;

    private java.lang.String extension;

    private java.lang.String fax;

    private java.lang.String federationIdentifier;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptions;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult feedbacks__r;

    private com.sforce.soap.enterprise.QueryResult feeds;

    private java.lang.String firstName;

    private java.lang.Boolean forecastEnabled;

    private java.lang.String fullPhotoUrl;

    private com.sforce.soap.enterprise.QueryResult instances__r;

    private java.lang.Boolean isActive;

    private java.lang.Boolean isPortalEnabled;

    private java.lang.Boolean isPortalSelfRegistered;

    private java.lang.String languageLocaleKey;

    private java.util.Calendar lastLoginDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String lastName;

    private java.util.Calendar lastPasswordChangeDate;

    private java.lang.String localeSidKey;

    private com.sforce.soap.enterprise.sobject.User manager;

    private java.lang.String managerId;

    private java.lang.String mobilePhone;

    private java.lang.String name;

    private java.util.Calendar offlinePdaTrialExpirationDate;

    private java.util.Calendar offlineTrialExpirationDate;

    private com.sforce.soap.enterprise.QueryResult partner_Kickoffs1__r;

    private com.sforce.soap.enterprise.QueryResult partner_Kickoffs__r;

    private com.sforce.soap.enterprise.QueryResult permissionSetAssignments;

    private java.lang.String phone;

    private java.lang.String portalRole;

    private java.lang.String postalCode;

    private com.sforce.soap.enterprise.sobject.Profile profile;

    private java.lang.String profileId;

    private java.lang.Boolean receivesAdminInfoEmails;

    private java.lang.Boolean receivesInfoEmails;

    private java.lang.String regOnline__RegOnlineSessionID__c;

    private com.sforce.soap.enterprise.QueryResult SFDC_Projects__r;

    private java.lang.String smallPhotoUrl;

    private java.lang.String state;

    private com.sforce.soap.enterprise.QueryResult status_Meeting_Attendees__r;

    private java.lang.String street;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult system_Changes1__r;

    private com.sforce.soap.enterprise.QueryResult system_Changes2__r;

    private com.sforce.soap.enterprise.QueryResult system_Changes__r;

    private com.sforce.soap.enterprise.QueryResult tickets1__r;

    private com.sforce.soap.enterprise.QueryResult tier_1_Cases__r;

    private com.sforce.soap.enterprise.QueryResult tier_2_Cases__r;

    private java.lang.String timeZoneSidKey;

    private java.lang.String title;

    private com.sforce.soap.enterprise.QueryResult trainings1__r;

    private com.sforce.soap.enterprise.QueryResult trainings2__r;

    private com.sforce.soap.enterprise.QueryResult trainings3__r;

    private com.sforce.soap.enterprise.QueryResult trainings__r;

    private java.lang.Boolean userPermissionsAvantgoUser;

    private java.lang.Boolean userPermissionsCallCenterAutoLogin;

    private java.lang.Boolean userPermissionsInteractionUser;

    private java.lang.Boolean userPermissionsKnowledgeUser;

    private java.lang.Boolean userPermissionsMarketingUser;

    private java.lang.Boolean userPermissionsMobileUser;

    private java.lang.Boolean userPermissionsOfflineUser;

    private java.lang.Boolean userPermissionsSFContentUser;

    private java.lang.Boolean userPermissionsSupportUser;

    private com.sforce.soap.enterprise.QueryResult userPreferences;

    private java.lang.Boolean userPreferencesActivityRemindersPopup;

    private java.lang.Boolean userPreferencesApexPagesDeveloperMode;

    private java.lang.Boolean userPreferencesContentEmailAsAndWhen;

    private java.lang.Boolean userPreferencesContentNoEmail;

    private java.lang.Boolean userPreferencesDisCommentAfterLikeEmail;

    private java.lang.Boolean userPreferencesDisMentionsCommentEmail;

    private java.lang.Boolean userPreferencesDisProfPostCommentEmail;

    private java.lang.Boolean userPreferencesDisableAllFeedsEmail;

    private java.lang.Boolean userPreferencesDisableBookmarkEmail;

    private java.lang.Boolean userPreferencesDisableChangeCommentEmail;

    private java.lang.Boolean userPreferencesDisableFileShareNotificationsForApi;

    private java.lang.Boolean userPreferencesDisableFollowersEmail;

    private java.lang.Boolean userPreferencesDisableLaterCommentEmail;

    private java.lang.Boolean userPreferencesDisableLikeEmail;

    private java.lang.Boolean userPreferencesDisableMentionsPostEmail;

    private java.lang.Boolean userPreferencesDisableMessageEmail;

    private java.lang.Boolean userPreferencesDisableProfilePostEmail;

    private java.lang.Boolean userPreferencesDisableSharePostEmail;

    private java.lang.Boolean userPreferencesEnableAutoSubForFeeds;

    private java.lang.Boolean userPreferencesEventRemindersCheckboxDefault;

    private java.lang.Boolean userPreferencesHideCSNDesktopTask;

    private java.lang.Boolean userPreferencesHideCSNGetChatterMobileTask;

    private java.lang.Boolean userPreferencesOptOutOfTouch;

    private java.lang.Boolean userPreferencesReminderSoundOff;

    private java.lang.Boolean userPreferencesShowCityToExternalUsers;

    private java.lang.Boolean userPreferencesShowCountryToExternalUsers;

    private java.lang.Boolean userPreferencesShowEmailToExternalUsers;

    private java.lang.Boolean userPreferencesShowFaxToExternalUsers;

    private java.lang.Boolean userPreferencesShowManagerToExternalUsers;

    private java.lang.Boolean userPreferencesShowMobilePhoneToExternalUsers;

    private java.lang.Boolean userPreferencesShowPostalCodeToExternalUsers;

    private java.lang.Boolean userPreferencesShowStateToExternalUsers;

    private java.lang.Boolean userPreferencesShowStreetAddressToExternalUsers;

    private java.lang.Boolean userPreferencesShowTitleToExternalUsers;

    private java.lang.Boolean userPreferencesShowWorkPhoneToExternalUsers;

    private java.lang.Boolean userPreferencesTaskRemindersCheckboxDefault;

    private com.sforce.soap.enterprise.sobject.UserRole userRole;

    private java.lang.String userRoleId;

    private java.lang.String userType;

    private java.lang.String username;

    public User() {
    }

    public User(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String aboutMe,
           java.lang.String accountId,
           com.sforce.soap.enterprise.QueryResult accounts__r,
           com.sforce.soap.enterprise.QueryResult admin_Certifications1__r,
           com.sforce.soap.enterprise.QueryResult admin_Certifications__r,
           java.lang.String alias,
           com.sforce.soap.enterprise.QueryResult analytic_Snapshots__r,
           com.sforce.soap.enterprise.QueryResult article_and_Category_Reporting1__r,
           com.sforce.soap.enterprise.QueryResult article_and_Category_Reporting__r,
           com.sforce.soap.enterprise.QueryResult CS_Management_Cases__r,
           java.lang.String callCenterId,
           com.sforce.soap.enterprise.QueryResult cases1__r,
           com.sforce.soap.enterprise.QueryResult cases__r,
           com.sforce.soap.enterprise.QueryResult change_Control__r,
           com.sforce.soap.enterprise.QueryResult change_Controls1__r,
           com.sforce.soap.enterprise.QueryResult change_Controls__r,
           com.sforce.soap.enterprise.QueryResult channel_Manager_Outlines1__r,
           com.sforce.soap.enterprise.QueryResult channel_Manager_Outlines__r,
           java.lang.String city,
           java.lang.String client_Type__c,
           java.lang.String communityNickname,
           java.lang.String companyName,
           com.sforce.soap.enterprise.sobject.Contact contact,
           java.lang.String contactId,
           com.sforce.soap.enterprise.QueryResult content_Download_Notifications__r,
           com.sforce.soap.enterprise.QueryResult contractsSigned,
           java.lang.String country,
           com.sforce.soap.enterprise.QueryResult courier1__Recipients__r,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String defaultGroupNotificationFrequency,
           java.lang.String delegatedApproverId,
           com.sforce.soap.enterprise.QueryResult delegatedUsers,
           java.lang.String department,
           com.sforce.soap.enterprise.QueryResult development_Cases__r,
           java.lang.String digestFrequency,
           java.lang.String division,
           com.sforce.soap.enterprise.QueryResult dominu_Tasks1__r,
           com.sforce.soap.enterprise.QueryResult dominu_Tasks2__r,
           com.sforce.soap.enterprise.QueryResult dominu_Tasks__r,
           java.lang.String email,
           java.lang.String emailEncodingKey,
           java.lang.String employeeNumber,
           com.sforce.soap.enterprise.QueryResult eventRelations,
           java.lang.String extension,
           java.lang.String fax,
           java.lang.String federationIdentifier,
           com.sforce.soap.enterprise.QueryResult feedSubscriptions,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult feedbacks__r,
           com.sforce.soap.enterprise.QueryResult feeds,
           java.lang.String firstName,
           java.lang.Boolean forecastEnabled,
           java.lang.String fullPhotoUrl,
           com.sforce.soap.enterprise.QueryResult instances__r,
           java.lang.Boolean isActive,
           java.lang.Boolean isPortalEnabled,
           java.lang.Boolean isPortalSelfRegistered,
           java.lang.String languageLocaleKey,
           java.util.Calendar lastLoginDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String lastName,
           java.util.Calendar lastPasswordChangeDate,
           java.lang.String localeSidKey,
           com.sforce.soap.enterprise.sobject.User manager,
           java.lang.String managerId,
           java.lang.String mobilePhone,
           java.lang.String name,
           java.util.Calendar offlinePdaTrialExpirationDate,
           java.util.Calendar offlineTrialExpirationDate,
           com.sforce.soap.enterprise.QueryResult partner_Kickoffs1__r,
           com.sforce.soap.enterprise.QueryResult partner_Kickoffs__r,
           com.sforce.soap.enterprise.QueryResult permissionSetAssignments,
           java.lang.String phone,
           java.lang.String portalRole,
           java.lang.String postalCode,
           com.sforce.soap.enterprise.sobject.Profile profile,
           java.lang.String profileId,
           java.lang.Boolean receivesAdminInfoEmails,
           java.lang.Boolean receivesInfoEmails,
           java.lang.String regOnline__RegOnlineSessionID__c,
           com.sforce.soap.enterprise.QueryResult SFDC_Projects__r,
           java.lang.String smallPhotoUrl,
           java.lang.String state,
           com.sforce.soap.enterprise.QueryResult status_Meeting_Attendees__r,
           java.lang.String street,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult system_Changes1__r,
           com.sforce.soap.enterprise.QueryResult system_Changes2__r,
           com.sforce.soap.enterprise.QueryResult system_Changes__r,
           com.sforce.soap.enterprise.QueryResult tickets1__r,
           com.sforce.soap.enterprise.QueryResult tier_1_Cases__r,
           com.sforce.soap.enterprise.QueryResult tier_2_Cases__r,
           java.lang.String timeZoneSidKey,
           java.lang.String title,
           com.sforce.soap.enterprise.QueryResult trainings1__r,
           com.sforce.soap.enterprise.QueryResult trainings2__r,
           com.sforce.soap.enterprise.QueryResult trainings3__r,
           com.sforce.soap.enterprise.QueryResult trainings__r,
           java.lang.Boolean userPermissionsAvantgoUser,
           java.lang.Boolean userPermissionsCallCenterAutoLogin,
           java.lang.Boolean userPermissionsInteractionUser,
           java.lang.Boolean userPermissionsKnowledgeUser,
           java.lang.Boolean userPermissionsMarketingUser,
           java.lang.Boolean userPermissionsMobileUser,
           java.lang.Boolean userPermissionsOfflineUser,
           java.lang.Boolean userPermissionsSFContentUser,
           java.lang.Boolean userPermissionsSupportUser,
           com.sforce.soap.enterprise.QueryResult userPreferences,
           java.lang.Boolean userPreferencesActivityRemindersPopup,
           java.lang.Boolean userPreferencesApexPagesDeveloperMode,
           java.lang.Boolean userPreferencesContentEmailAsAndWhen,
           java.lang.Boolean userPreferencesContentNoEmail,
           java.lang.Boolean userPreferencesDisCommentAfterLikeEmail,
           java.lang.Boolean userPreferencesDisMentionsCommentEmail,
           java.lang.Boolean userPreferencesDisProfPostCommentEmail,
           java.lang.Boolean userPreferencesDisableAllFeedsEmail,
           java.lang.Boolean userPreferencesDisableBookmarkEmail,
           java.lang.Boolean userPreferencesDisableChangeCommentEmail,
           java.lang.Boolean userPreferencesDisableFileShareNotificationsForApi,
           java.lang.Boolean userPreferencesDisableFollowersEmail,
           java.lang.Boolean userPreferencesDisableLaterCommentEmail,
           java.lang.Boolean userPreferencesDisableLikeEmail,
           java.lang.Boolean userPreferencesDisableMentionsPostEmail,
           java.lang.Boolean userPreferencesDisableMessageEmail,
           java.lang.Boolean userPreferencesDisableProfilePostEmail,
           java.lang.Boolean userPreferencesDisableSharePostEmail,
           java.lang.Boolean userPreferencesEnableAutoSubForFeeds,
           java.lang.Boolean userPreferencesEventRemindersCheckboxDefault,
           java.lang.Boolean userPreferencesHideCSNDesktopTask,
           java.lang.Boolean userPreferencesHideCSNGetChatterMobileTask,
           java.lang.Boolean userPreferencesOptOutOfTouch,
           java.lang.Boolean userPreferencesReminderSoundOff,
           java.lang.Boolean userPreferencesShowCityToExternalUsers,
           java.lang.Boolean userPreferencesShowCountryToExternalUsers,
           java.lang.Boolean userPreferencesShowEmailToExternalUsers,
           java.lang.Boolean userPreferencesShowFaxToExternalUsers,
           java.lang.Boolean userPreferencesShowManagerToExternalUsers,
           java.lang.Boolean userPreferencesShowMobilePhoneToExternalUsers,
           java.lang.Boolean userPreferencesShowPostalCodeToExternalUsers,
           java.lang.Boolean userPreferencesShowStateToExternalUsers,
           java.lang.Boolean userPreferencesShowStreetAddressToExternalUsers,
           java.lang.Boolean userPreferencesShowTitleToExternalUsers,
           java.lang.Boolean userPreferencesShowWorkPhoneToExternalUsers,
           java.lang.Boolean userPreferencesTaskRemindersCheckboxDefault,
           com.sforce.soap.enterprise.sobject.UserRole userRole,
           java.lang.String userRoleId,
           java.lang.String userType,
           java.lang.String username) {
        super(
            fieldsToNull,
            id);
        this.aboutMe = aboutMe;
        this.accountId = accountId;
        this.accounts__r = accounts__r;
        this.admin_Certifications1__r = admin_Certifications1__r;
        this.admin_Certifications__r = admin_Certifications__r;
        this.alias = alias;
        this.analytic_Snapshots__r = analytic_Snapshots__r;
        this.article_and_Category_Reporting1__r = article_and_Category_Reporting1__r;
        this.article_and_Category_Reporting__r = article_and_Category_Reporting__r;
        this.CS_Management_Cases__r = CS_Management_Cases__r;
        this.callCenterId = callCenterId;
        this.cases1__r = cases1__r;
        this.cases__r = cases__r;
        this.change_Control__r = change_Control__r;
        this.change_Controls1__r = change_Controls1__r;
        this.change_Controls__r = change_Controls__r;
        this.channel_Manager_Outlines1__r = channel_Manager_Outlines1__r;
        this.channel_Manager_Outlines__r = channel_Manager_Outlines__r;
        this.city = city;
        this.client_Type__c = client_Type__c;
        this.communityNickname = communityNickname;
        this.companyName = companyName;
        this.contact = contact;
        this.contactId = contactId;
        this.content_Download_Notifications__r = content_Download_Notifications__r;
        this.contractsSigned = contractsSigned;
        this.country = country;
        this.courier1__Recipients__r = courier1__Recipients__r;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.defaultGroupNotificationFrequency = defaultGroupNotificationFrequency;
        this.delegatedApproverId = delegatedApproverId;
        this.delegatedUsers = delegatedUsers;
        this.department = department;
        this.development_Cases__r = development_Cases__r;
        this.digestFrequency = digestFrequency;
        this.division = division;
        this.dominu_Tasks1__r = dominu_Tasks1__r;
        this.dominu_Tasks2__r = dominu_Tasks2__r;
        this.dominu_Tasks__r = dominu_Tasks__r;
        this.email = email;
        this.emailEncodingKey = emailEncodingKey;
        this.employeeNumber = employeeNumber;
        this.eventRelations = eventRelations;
        this.extension = extension;
        this.fax = fax;
        this.federationIdentifier = federationIdentifier;
        this.feedSubscriptions = feedSubscriptions;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.feedbacks__r = feedbacks__r;
        this.feeds = feeds;
        this.firstName = firstName;
        this.forecastEnabled = forecastEnabled;
        this.fullPhotoUrl = fullPhotoUrl;
        this.instances__r = instances__r;
        this.isActive = isActive;
        this.isPortalEnabled = isPortalEnabled;
        this.isPortalSelfRegistered = isPortalSelfRegistered;
        this.languageLocaleKey = languageLocaleKey;
        this.lastLoginDate = lastLoginDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.lastName = lastName;
        this.lastPasswordChangeDate = lastPasswordChangeDate;
        this.localeSidKey = localeSidKey;
        this.manager = manager;
        this.managerId = managerId;
        this.mobilePhone = mobilePhone;
        this.name = name;
        this.offlinePdaTrialExpirationDate = offlinePdaTrialExpirationDate;
        this.offlineTrialExpirationDate = offlineTrialExpirationDate;
        this.partner_Kickoffs1__r = partner_Kickoffs1__r;
        this.partner_Kickoffs__r = partner_Kickoffs__r;
        this.permissionSetAssignments = permissionSetAssignments;
        this.phone = phone;
        this.portalRole = portalRole;
        this.postalCode = postalCode;
        this.profile = profile;
        this.profileId = profileId;
        this.receivesAdminInfoEmails = receivesAdminInfoEmails;
        this.receivesInfoEmails = receivesInfoEmails;
        this.regOnline__RegOnlineSessionID__c = regOnline__RegOnlineSessionID__c;
        this.SFDC_Projects__r = SFDC_Projects__r;
        this.smallPhotoUrl = smallPhotoUrl;
        this.state = state;
        this.status_Meeting_Attendees__r = status_Meeting_Attendees__r;
        this.street = street;
        this.systemModstamp = systemModstamp;
        this.system_Changes1__r = system_Changes1__r;
        this.system_Changes2__r = system_Changes2__r;
        this.system_Changes__r = system_Changes__r;
        this.tickets1__r = tickets1__r;
        this.tier_1_Cases__r = tier_1_Cases__r;
        this.tier_2_Cases__r = tier_2_Cases__r;
        this.timeZoneSidKey = timeZoneSidKey;
        this.title = title;
        this.trainings1__r = trainings1__r;
        this.trainings2__r = trainings2__r;
        this.trainings3__r = trainings3__r;
        this.trainings__r = trainings__r;
        this.userPermissionsAvantgoUser = userPermissionsAvantgoUser;
        this.userPermissionsCallCenterAutoLogin = userPermissionsCallCenterAutoLogin;
        this.userPermissionsInteractionUser = userPermissionsInteractionUser;
        this.userPermissionsKnowledgeUser = userPermissionsKnowledgeUser;
        this.userPermissionsMarketingUser = userPermissionsMarketingUser;
        this.userPermissionsMobileUser = userPermissionsMobileUser;
        this.userPermissionsOfflineUser = userPermissionsOfflineUser;
        this.userPermissionsSFContentUser = userPermissionsSFContentUser;
        this.userPermissionsSupportUser = userPermissionsSupportUser;
        this.userPreferences = userPreferences;
        this.userPreferencesActivityRemindersPopup = userPreferencesActivityRemindersPopup;
        this.userPreferencesApexPagesDeveloperMode = userPreferencesApexPagesDeveloperMode;
        this.userPreferencesContentEmailAsAndWhen = userPreferencesContentEmailAsAndWhen;
        this.userPreferencesContentNoEmail = userPreferencesContentNoEmail;
        this.userPreferencesDisCommentAfterLikeEmail = userPreferencesDisCommentAfterLikeEmail;
        this.userPreferencesDisMentionsCommentEmail = userPreferencesDisMentionsCommentEmail;
        this.userPreferencesDisProfPostCommentEmail = userPreferencesDisProfPostCommentEmail;
        this.userPreferencesDisableAllFeedsEmail = userPreferencesDisableAllFeedsEmail;
        this.userPreferencesDisableBookmarkEmail = userPreferencesDisableBookmarkEmail;
        this.userPreferencesDisableChangeCommentEmail = userPreferencesDisableChangeCommentEmail;
        this.userPreferencesDisableFileShareNotificationsForApi = userPreferencesDisableFileShareNotificationsForApi;
        this.userPreferencesDisableFollowersEmail = userPreferencesDisableFollowersEmail;
        this.userPreferencesDisableLaterCommentEmail = userPreferencesDisableLaterCommentEmail;
        this.userPreferencesDisableLikeEmail = userPreferencesDisableLikeEmail;
        this.userPreferencesDisableMentionsPostEmail = userPreferencesDisableMentionsPostEmail;
        this.userPreferencesDisableMessageEmail = userPreferencesDisableMessageEmail;
        this.userPreferencesDisableProfilePostEmail = userPreferencesDisableProfilePostEmail;
        this.userPreferencesDisableSharePostEmail = userPreferencesDisableSharePostEmail;
        this.userPreferencesEnableAutoSubForFeeds = userPreferencesEnableAutoSubForFeeds;
        this.userPreferencesEventRemindersCheckboxDefault = userPreferencesEventRemindersCheckboxDefault;
        this.userPreferencesHideCSNDesktopTask = userPreferencesHideCSNDesktopTask;
        this.userPreferencesHideCSNGetChatterMobileTask = userPreferencesHideCSNGetChatterMobileTask;
        this.userPreferencesOptOutOfTouch = userPreferencesOptOutOfTouch;
        this.userPreferencesReminderSoundOff = userPreferencesReminderSoundOff;
        this.userPreferencesShowCityToExternalUsers = userPreferencesShowCityToExternalUsers;
        this.userPreferencesShowCountryToExternalUsers = userPreferencesShowCountryToExternalUsers;
        this.userPreferencesShowEmailToExternalUsers = userPreferencesShowEmailToExternalUsers;
        this.userPreferencesShowFaxToExternalUsers = userPreferencesShowFaxToExternalUsers;
        this.userPreferencesShowManagerToExternalUsers = userPreferencesShowManagerToExternalUsers;
        this.userPreferencesShowMobilePhoneToExternalUsers = userPreferencesShowMobilePhoneToExternalUsers;
        this.userPreferencesShowPostalCodeToExternalUsers = userPreferencesShowPostalCodeToExternalUsers;
        this.userPreferencesShowStateToExternalUsers = userPreferencesShowStateToExternalUsers;
        this.userPreferencesShowStreetAddressToExternalUsers = userPreferencesShowStreetAddressToExternalUsers;
        this.userPreferencesShowTitleToExternalUsers = userPreferencesShowTitleToExternalUsers;
        this.userPreferencesShowWorkPhoneToExternalUsers = userPreferencesShowWorkPhoneToExternalUsers;
        this.userPreferencesTaskRemindersCheckboxDefault = userPreferencesTaskRemindersCheckboxDefault;
        this.userRole = userRole;
        this.userRoleId = userRoleId;
        this.userType = userType;
        this.username = username;
    }


    /**
     * Gets the aboutMe value for this User.
     * 
     * @return aboutMe
     */
    public java.lang.String getAboutMe() {
        return aboutMe;
    }


    /**
     * Sets the aboutMe value for this User.
     * 
     * @param aboutMe
     */
    public void setAboutMe(java.lang.String aboutMe) {
        this.aboutMe = aboutMe;
    }


    /**
     * Gets the accountId value for this User.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this User.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the accounts__r value for this User.
     * 
     * @return accounts__r
     */
    public com.sforce.soap.enterprise.QueryResult getAccounts__r() {
        return accounts__r;
    }


    /**
     * Sets the accounts__r value for this User.
     * 
     * @param accounts__r
     */
    public void setAccounts__r(com.sforce.soap.enterprise.QueryResult accounts__r) {
        this.accounts__r = accounts__r;
    }


    /**
     * Gets the admin_Certifications1__r value for this User.
     * 
     * @return admin_Certifications1__r
     */
    public com.sforce.soap.enterprise.QueryResult getAdmin_Certifications1__r() {
        return admin_Certifications1__r;
    }


    /**
     * Sets the admin_Certifications1__r value for this User.
     * 
     * @param admin_Certifications1__r
     */
    public void setAdmin_Certifications1__r(com.sforce.soap.enterprise.QueryResult admin_Certifications1__r) {
        this.admin_Certifications1__r = admin_Certifications1__r;
    }


    /**
     * Gets the admin_Certifications__r value for this User.
     * 
     * @return admin_Certifications__r
     */
    public com.sforce.soap.enterprise.QueryResult getAdmin_Certifications__r() {
        return admin_Certifications__r;
    }


    /**
     * Sets the admin_Certifications__r value for this User.
     * 
     * @param admin_Certifications__r
     */
    public void setAdmin_Certifications__r(com.sforce.soap.enterprise.QueryResult admin_Certifications__r) {
        this.admin_Certifications__r = admin_Certifications__r;
    }


    /**
     * Gets the alias value for this User.
     * 
     * @return alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this User.
     * 
     * @param alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the analytic_Snapshots__r value for this User.
     * 
     * @return analytic_Snapshots__r
     */
    public com.sforce.soap.enterprise.QueryResult getAnalytic_Snapshots__r() {
        return analytic_Snapshots__r;
    }


    /**
     * Sets the analytic_Snapshots__r value for this User.
     * 
     * @param analytic_Snapshots__r
     */
    public void setAnalytic_Snapshots__r(com.sforce.soap.enterprise.QueryResult analytic_Snapshots__r) {
        this.analytic_Snapshots__r = analytic_Snapshots__r;
    }


    /**
     * Gets the article_and_Category_Reporting1__r value for this User.
     * 
     * @return article_and_Category_Reporting1__r
     */
    public com.sforce.soap.enterprise.QueryResult getArticle_and_Category_Reporting1__r() {
        return article_and_Category_Reporting1__r;
    }


    /**
     * Sets the article_and_Category_Reporting1__r value for this User.
     * 
     * @param article_and_Category_Reporting1__r
     */
    public void setArticle_and_Category_Reporting1__r(com.sforce.soap.enterprise.QueryResult article_and_Category_Reporting1__r) {
        this.article_and_Category_Reporting1__r = article_and_Category_Reporting1__r;
    }


    /**
     * Gets the article_and_Category_Reporting__r value for this User.
     * 
     * @return article_and_Category_Reporting__r
     */
    public com.sforce.soap.enterprise.QueryResult getArticle_and_Category_Reporting__r() {
        return article_and_Category_Reporting__r;
    }


    /**
     * Sets the article_and_Category_Reporting__r value for this User.
     * 
     * @param article_and_Category_Reporting__r
     */
    public void setArticle_and_Category_Reporting__r(com.sforce.soap.enterprise.QueryResult article_and_Category_Reporting__r) {
        this.article_and_Category_Reporting__r = article_and_Category_Reporting__r;
    }


    /**
     * Gets the CS_Management_Cases__r value for this User.
     * 
     * @return CS_Management_Cases__r
     */
    public com.sforce.soap.enterprise.QueryResult getCS_Management_Cases__r() {
        return CS_Management_Cases__r;
    }


    /**
     * Sets the CS_Management_Cases__r value for this User.
     * 
     * @param CS_Management_Cases__r
     */
    public void setCS_Management_Cases__r(com.sforce.soap.enterprise.QueryResult CS_Management_Cases__r) {
        this.CS_Management_Cases__r = CS_Management_Cases__r;
    }


    /**
     * Gets the callCenterId value for this User.
     * 
     * @return callCenterId
     */
    public java.lang.String getCallCenterId() {
        return callCenterId;
    }


    /**
     * Sets the callCenterId value for this User.
     * 
     * @param callCenterId
     */
    public void setCallCenterId(java.lang.String callCenterId) {
        this.callCenterId = callCenterId;
    }


    /**
     * Gets the cases1__r value for this User.
     * 
     * @return cases1__r
     */
    public com.sforce.soap.enterprise.QueryResult getCases1__r() {
        return cases1__r;
    }


    /**
     * Sets the cases1__r value for this User.
     * 
     * @param cases1__r
     */
    public void setCases1__r(com.sforce.soap.enterprise.QueryResult cases1__r) {
        this.cases1__r = cases1__r;
    }


    /**
     * Gets the cases__r value for this User.
     * 
     * @return cases__r
     */
    public com.sforce.soap.enterprise.QueryResult getCases__r() {
        return cases__r;
    }


    /**
     * Sets the cases__r value for this User.
     * 
     * @param cases__r
     */
    public void setCases__r(com.sforce.soap.enterprise.QueryResult cases__r) {
        this.cases__r = cases__r;
    }


    /**
     * Gets the change_Control__r value for this User.
     * 
     * @return change_Control__r
     */
    public com.sforce.soap.enterprise.QueryResult getChange_Control__r() {
        return change_Control__r;
    }


    /**
     * Sets the change_Control__r value for this User.
     * 
     * @param change_Control__r
     */
    public void setChange_Control__r(com.sforce.soap.enterprise.QueryResult change_Control__r) {
        this.change_Control__r = change_Control__r;
    }


    /**
     * Gets the change_Controls1__r value for this User.
     * 
     * @return change_Controls1__r
     */
    public com.sforce.soap.enterprise.QueryResult getChange_Controls1__r() {
        return change_Controls1__r;
    }


    /**
     * Sets the change_Controls1__r value for this User.
     * 
     * @param change_Controls1__r
     */
    public void setChange_Controls1__r(com.sforce.soap.enterprise.QueryResult change_Controls1__r) {
        this.change_Controls1__r = change_Controls1__r;
    }


    /**
     * Gets the change_Controls__r value for this User.
     * 
     * @return change_Controls__r
     */
    public com.sforce.soap.enterprise.QueryResult getChange_Controls__r() {
        return change_Controls__r;
    }


    /**
     * Sets the change_Controls__r value for this User.
     * 
     * @param change_Controls__r
     */
    public void setChange_Controls__r(com.sforce.soap.enterprise.QueryResult change_Controls__r) {
        this.change_Controls__r = change_Controls__r;
    }


    /**
     * Gets the channel_Manager_Outlines1__r value for this User.
     * 
     * @return channel_Manager_Outlines1__r
     */
    public com.sforce.soap.enterprise.QueryResult getChannel_Manager_Outlines1__r() {
        return channel_Manager_Outlines1__r;
    }


    /**
     * Sets the channel_Manager_Outlines1__r value for this User.
     * 
     * @param channel_Manager_Outlines1__r
     */
    public void setChannel_Manager_Outlines1__r(com.sforce.soap.enterprise.QueryResult channel_Manager_Outlines1__r) {
        this.channel_Manager_Outlines1__r = channel_Manager_Outlines1__r;
    }


    /**
     * Gets the channel_Manager_Outlines__r value for this User.
     * 
     * @return channel_Manager_Outlines__r
     */
    public com.sforce.soap.enterprise.QueryResult getChannel_Manager_Outlines__r() {
        return channel_Manager_Outlines__r;
    }


    /**
     * Sets the channel_Manager_Outlines__r value for this User.
     * 
     * @param channel_Manager_Outlines__r
     */
    public void setChannel_Manager_Outlines__r(com.sforce.soap.enterprise.QueryResult channel_Manager_Outlines__r) {
        this.channel_Manager_Outlines__r = channel_Manager_Outlines__r;
    }


    /**
     * Gets the city value for this User.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this User.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the client_Type__c value for this User.
     * 
     * @return client_Type__c
     */
    public java.lang.String getClient_Type__c() {
        return client_Type__c;
    }


    /**
     * Sets the client_Type__c value for this User.
     * 
     * @param client_Type__c
     */
    public void setClient_Type__c(java.lang.String client_Type__c) {
        this.client_Type__c = client_Type__c;
    }


    /**
     * Gets the communityNickname value for this User.
     * 
     * @return communityNickname
     */
    public java.lang.String getCommunityNickname() {
        return communityNickname;
    }


    /**
     * Sets the communityNickname value for this User.
     * 
     * @param communityNickname
     */
    public void setCommunityNickname(java.lang.String communityNickname) {
        this.communityNickname = communityNickname;
    }


    /**
     * Gets the companyName value for this User.
     * 
     * @return companyName
     */
    public java.lang.String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this User.
     * 
     * @param companyName
     */
    public void setCompanyName(java.lang.String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the contact value for this User.
     * 
     * @return contact
     */
    public com.sforce.soap.enterprise.sobject.Contact getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this User.
     * 
     * @param contact
     */
    public void setContact(com.sforce.soap.enterprise.sobject.Contact contact) {
        this.contact = contact;
    }


    /**
     * Gets the contactId value for this User.
     * 
     * @return contactId
     */
    public java.lang.String getContactId() {
        return contactId;
    }


    /**
     * Sets the contactId value for this User.
     * 
     * @param contactId
     */
    public void setContactId(java.lang.String contactId) {
        this.contactId = contactId;
    }


    /**
     * Gets the content_Download_Notifications__r value for this User.
     * 
     * @return content_Download_Notifications__r
     */
    public com.sforce.soap.enterprise.QueryResult getContent_Download_Notifications__r() {
        return content_Download_Notifications__r;
    }


    /**
     * Sets the content_Download_Notifications__r value for this User.
     * 
     * @param content_Download_Notifications__r
     */
    public void setContent_Download_Notifications__r(com.sforce.soap.enterprise.QueryResult content_Download_Notifications__r) {
        this.content_Download_Notifications__r = content_Download_Notifications__r;
    }


    /**
     * Gets the contractsSigned value for this User.
     * 
     * @return contractsSigned
     */
    public com.sforce.soap.enterprise.QueryResult getContractsSigned() {
        return contractsSigned;
    }


    /**
     * Sets the contractsSigned value for this User.
     * 
     * @param contractsSigned
     */
    public void setContractsSigned(com.sforce.soap.enterprise.QueryResult contractsSigned) {
        this.contractsSigned = contractsSigned;
    }


    /**
     * Gets the country value for this User.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this User.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the courier1__Recipients__r value for this User.
     * 
     * @return courier1__Recipients__r
     */
    public com.sforce.soap.enterprise.QueryResult getCourier1__Recipients__r() {
        return courier1__Recipients__r;
    }


    /**
     * Sets the courier1__Recipients__r value for this User.
     * 
     * @param courier1__Recipients__r
     */
    public void setCourier1__Recipients__r(com.sforce.soap.enterprise.QueryResult courier1__Recipients__r) {
        this.courier1__Recipients__r = courier1__Recipients__r;
    }


    /**
     * Gets the createdBy value for this User.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this User.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this User.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this User.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this User.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this User.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the defaultGroupNotificationFrequency value for this User.
     * 
     * @return defaultGroupNotificationFrequency
     */
    public java.lang.String getDefaultGroupNotificationFrequency() {
        return defaultGroupNotificationFrequency;
    }


    /**
     * Sets the defaultGroupNotificationFrequency value for this User.
     * 
     * @param defaultGroupNotificationFrequency
     */
    public void setDefaultGroupNotificationFrequency(java.lang.String defaultGroupNotificationFrequency) {
        this.defaultGroupNotificationFrequency = defaultGroupNotificationFrequency;
    }


    /**
     * Gets the delegatedApproverId value for this User.
     * 
     * @return delegatedApproverId
     */
    public java.lang.String getDelegatedApproverId() {
        return delegatedApproverId;
    }


    /**
     * Sets the delegatedApproverId value for this User.
     * 
     * @param delegatedApproverId
     */
    public void setDelegatedApproverId(java.lang.String delegatedApproverId) {
        this.delegatedApproverId = delegatedApproverId;
    }


    /**
     * Gets the delegatedUsers value for this User.
     * 
     * @return delegatedUsers
     */
    public com.sforce.soap.enterprise.QueryResult getDelegatedUsers() {
        return delegatedUsers;
    }


    /**
     * Sets the delegatedUsers value for this User.
     * 
     * @param delegatedUsers
     */
    public void setDelegatedUsers(com.sforce.soap.enterprise.QueryResult delegatedUsers) {
        this.delegatedUsers = delegatedUsers;
    }


    /**
     * Gets the department value for this User.
     * 
     * @return department
     */
    public java.lang.String getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this User.
     * 
     * @param department
     */
    public void setDepartment(java.lang.String department) {
        this.department = department;
    }


    /**
     * Gets the development_Cases__r value for this User.
     * 
     * @return development_Cases__r
     */
    public com.sforce.soap.enterprise.QueryResult getDevelopment_Cases__r() {
        return development_Cases__r;
    }


    /**
     * Sets the development_Cases__r value for this User.
     * 
     * @param development_Cases__r
     */
    public void setDevelopment_Cases__r(com.sforce.soap.enterprise.QueryResult development_Cases__r) {
        this.development_Cases__r = development_Cases__r;
    }


    /**
     * Gets the digestFrequency value for this User.
     * 
     * @return digestFrequency
     */
    public java.lang.String getDigestFrequency() {
        return digestFrequency;
    }


    /**
     * Sets the digestFrequency value for this User.
     * 
     * @param digestFrequency
     */
    public void setDigestFrequency(java.lang.String digestFrequency) {
        this.digestFrequency = digestFrequency;
    }


    /**
     * Gets the division value for this User.
     * 
     * @return division
     */
    public java.lang.String getDivision() {
        return division;
    }


    /**
     * Sets the division value for this User.
     * 
     * @param division
     */
    public void setDivision(java.lang.String division) {
        this.division = division;
    }


    /**
     * Gets the dominu_Tasks1__r value for this User.
     * 
     * @return dominu_Tasks1__r
     */
    public com.sforce.soap.enterprise.QueryResult getDominu_Tasks1__r() {
        return dominu_Tasks1__r;
    }


    /**
     * Sets the dominu_Tasks1__r value for this User.
     * 
     * @param dominu_Tasks1__r
     */
    public void setDominu_Tasks1__r(com.sforce.soap.enterprise.QueryResult dominu_Tasks1__r) {
        this.dominu_Tasks1__r = dominu_Tasks1__r;
    }


    /**
     * Gets the dominu_Tasks2__r value for this User.
     * 
     * @return dominu_Tasks2__r
     */
    public com.sforce.soap.enterprise.QueryResult getDominu_Tasks2__r() {
        return dominu_Tasks2__r;
    }


    /**
     * Sets the dominu_Tasks2__r value for this User.
     * 
     * @param dominu_Tasks2__r
     */
    public void setDominu_Tasks2__r(com.sforce.soap.enterprise.QueryResult dominu_Tasks2__r) {
        this.dominu_Tasks2__r = dominu_Tasks2__r;
    }


    /**
     * Gets the dominu_Tasks__r value for this User.
     * 
     * @return dominu_Tasks__r
     */
    public com.sforce.soap.enterprise.QueryResult getDominu_Tasks__r() {
        return dominu_Tasks__r;
    }


    /**
     * Sets the dominu_Tasks__r value for this User.
     * 
     * @param dominu_Tasks__r
     */
    public void setDominu_Tasks__r(com.sforce.soap.enterprise.QueryResult dominu_Tasks__r) {
        this.dominu_Tasks__r = dominu_Tasks__r;
    }


    /**
     * Gets the email value for this User.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this User.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the emailEncodingKey value for this User.
     * 
     * @return emailEncodingKey
     */
    public java.lang.String getEmailEncodingKey() {
        return emailEncodingKey;
    }


    /**
     * Sets the emailEncodingKey value for this User.
     * 
     * @param emailEncodingKey
     */
    public void setEmailEncodingKey(java.lang.String emailEncodingKey) {
        this.emailEncodingKey = emailEncodingKey;
    }


    /**
     * Gets the employeeNumber value for this User.
     * 
     * @return employeeNumber
     */
    public java.lang.String getEmployeeNumber() {
        return employeeNumber;
    }


    /**
     * Sets the employeeNumber value for this User.
     * 
     * @param employeeNumber
     */
    public void setEmployeeNumber(java.lang.String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }


    /**
     * Gets the eventRelations value for this User.
     * 
     * @return eventRelations
     */
    public com.sforce.soap.enterprise.QueryResult getEventRelations() {
        return eventRelations;
    }


    /**
     * Sets the eventRelations value for this User.
     * 
     * @param eventRelations
     */
    public void setEventRelations(com.sforce.soap.enterprise.QueryResult eventRelations) {
        this.eventRelations = eventRelations;
    }


    /**
     * Gets the extension value for this User.
     * 
     * @return extension
     */
    public java.lang.String getExtension() {
        return extension;
    }


    /**
     * Sets the extension value for this User.
     * 
     * @param extension
     */
    public void setExtension(java.lang.String extension) {
        this.extension = extension;
    }


    /**
     * Gets the fax value for this User.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this User.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the federationIdentifier value for this User.
     * 
     * @return federationIdentifier
     */
    public java.lang.String getFederationIdentifier() {
        return federationIdentifier;
    }


    /**
     * Sets the federationIdentifier value for this User.
     * 
     * @param federationIdentifier
     */
    public void setFederationIdentifier(java.lang.String federationIdentifier) {
        this.federationIdentifier = federationIdentifier;
    }


    /**
     * Gets the feedSubscriptions value for this User.
     * 
     * @return feedSubscriptions
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptions() {
        return feedSubscriptions;
    }


    /**
     * Sets the feedSubscriptions value for this User.
     * 
     * @param feedSubscriptions
     */
    public void setFeedSubscriptions(com.sforce.soap.enterprise.QueryResult feedSubscriptions) {
        this.feedSubscriptions = feedSubscriptions;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this User.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this User.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the feedbacks__r value for this User.
     * 
     * @return feedbacks__r
     */
    public com.sforce.soap.enterprise.QueryResult getFeedbacks__r() {
        return feedbacks__r;
    }


    /**
     * Sets the feedbacks__r value for this User.
     * 
     * @param feedbacks__r
     */
    public void setFeedbacks__r(com.sforce.soap.enterprise.QueryResult feedbacks__r) {
        this.feedbacks__r = feedbacks__r;
    }


    /**
     * Gets the feeds value for this User.
     * 
     * @return feeds
     */
    public com.sforce.soap.enterprise.QueryResult getFeeds() {
        return feeds;
    }


    /**
     * Sets the feeds value for this User.
     * 
     * @param feeds
     */
    public void setFeeds(com.sforce.soap.enterprise.QueryResult feeds) {
        this.feeds = feeds;
    }


    /**
     * Gets the firstName value for this User.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this User.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the forecastEnabled value for this User.
     * 
     * @return forecastEnabled
     */
    public java.lang.Boolean getForecastEnabled() {
        return forecastEnabled;
    }


    /**
     * Sets the forecastEnabled value for this User.
     * 
     * @param forecastEnabled
     */
    public void setForecastEnabled(java.lang.Boolean forecastEnabled) {
        this.forecastEnabled = forecastEnabled;
    }


    /**
     * Gets the fullPhotoUrl value for this User.
     * 
     * @return fullPhotoUrl
     */
    public java.lang.String getFullPhotoUrl() {
        return fullPhotoUrl;
    }


    /**
     * Sets the fullPhotoUrl value for this User.
     * 
     * @param fullPhotoUrl
     */
    public void setFullPhotoUrl(java.lang.String fullPhotoUrl) {
        this.fullPhotoUrl = fullPhotoUrl;
    }


    /**
     * Gets the instances__r value for this User.
     * 
     * @return instances__r
     */
    public com.sforce.soap.enterprise.QueryResult getInstances__r() {
        return instances__r;
    }


    /**
     * Sets the instances__r value for this User.
     * 
     * @param instances__r
     */
    public void setInstances__r(com.sforce.soap.enterprise.QueryResult instances__r) {
        this.instances__r = instances__r;
    }


    /**
     * Gets the isActive value for this User.
     * 
     * @return isActive
     */
    public java.lang.Boolean getIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this User.
     * 
     * @param isActive
     */
    public void setIsActive(java.lang.Boolean isActive) {
        this.isActive = isActive;
    }


    /**
     * Gets the isPortalEnabled value for this User.
     * 
     * @return isPortalEnabled
     */
    public java.lang.Boolean getIsPortalEnabled() {
        return isPortalEnabled;
    }


    /**
     * Sets the isPortalEnabled value for this User.
     * 
     * @param isPortalEnabled
     */
    public void setIsPortalEnabled(java.lang.Boolean isPortalEnabled) {
        this.isPortalEnabled = isPortalEnabled;
    }


    /**
     * Gets the isPortalSelfRegistered value for this User.
     * 
     * @return isPortalSelfRegistered
     */
    public java.lang.Boolean getIsPortalSelfRegistered() {
        return isPortalSelfRegistered;
    }


    /**
     * Sets the isPortalSelfRegistered value for this User.
     * 
     * @param isPortalSelfRegistered
     */
    public void setIsPortalSelfRegistered(java.lang.Boolean isPortalSelfRegistered) {
        this.isPortalSelfRegistered = isPortalSelfRegistered;
    }


    /**
     * Gets the languageLocaleKey value for this User.
     * 
     * @return languageLocaleKey
     */
    public java.lang.String getLanguageLocaleKey() {
        return languageLocaleKey;
    }


    /**
     * Sets the languageLocaleKey value for this User.
     * 
     * @param languageLocaleKey
     */
    public void setLanguageLocaleKey(java.lang.String languageLocaleKey) {
        this.languageLocaleKey = languageLocaleKey;
    }


    /**
     * Gets the lastLoginDate value for this User.
     * 
     * @return lastLoginDate
     */
    public java.util.Calendar getLastLoginDate() {
        return lastLoginDate;
    }


    /**
     * Sets the lastLoginDate value for this User.
     * 
     * @param lastLoginDate
     */
    public void setLastLoginDate(java.util.Calendar lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }


    /**
     * Gets the lastModifiedBy value for this User.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this User.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this User.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this User.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this User.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this User.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lastName value for this User.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this User.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the lastPasswordChangeDate value for this User.
     * 
     * @return lastPasswordChangeDate
     */
    public java.util.Calendar getLastPasswordChangeDate() {
        return lastPasswordChangeDate;
    }


    /**
     * Sets the lastPasswordChangeDate value for this User.
     * 
     * @param lastPasswordChangeDate
     */
    public void setLastPasswordChangeDate(java.util.Calendar lastPasswordChangeDate) {
        this.lastPasswordChangeDate = lastPasswordChangeDate;
    }


    /**
     * Gets the localeSidKey value for this User.
     * 
     * @return localeSidKey
     */
    public java.lang.String getLocaleSidKey() {
        return localeSidKey;
    }


    /**
     * Sets the localeSidKey value for this User.
     * 
     * @param localeSidKey
     */
    public void setLocaleSidKey(java.lang.String localeSidKey) {
        this.localeSidKey = localeSidKey;
    }


    /**
     * Gets the manager value for this User.
     * 
     * @return manager
     */
    public com.sforce.soap.enterprise.sobject.User getManager() {
        return manager;
    }


    /**
     * Sets the manager value for this User.
     * 
     * @param manager
     */
    public void setManager(com.sforce.soap.enterprise.sobject.User manager) {
        this.manager = manager;
    }


    /**
     * Gets the managerId value for this User.
     * 
     * @return managerId
     */
    public java.lang.String getManagerId() {
        return managerId;
    }


    /**
     * Sets the managerId value for this User.
     * 
     * @param managerId
     */
    public void setManagerId(java.lang.String managerId) {
        this.managerId = managerId;
    }


    /**
     * Gets the mobilePhone value for this User.
     * 
     * @return mobilePhone
     */
    public java.lang.String getMobilePhone() {
        return mobilePhone;
    }


    /**
     * Sets the mobilePhone value for this User.
     * 
     * @param mobilePhone
     */
    public void setMobilePhone(java.lang.String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }


    /**
     * Gets the name value for this User.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this User.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the offlinePdaTrialExpirationDate value for this User.
     * 
     * @return offlinePdaTrialExpirationDate
     */
    public java.util.Calendar getOfflinePdaTrialExpirationDate() {
        return offlinePdaTrialExpirationDate;
    }


    /**
     * Sets the offlinePdaTrialExpirationDate value for this User.
     * 
     * @param offlinePdaTrialExpirationDate
     */
    public void setOfflinePdaTrialExpirationDate(java.util.Calendar offlinePdaTrialExpirationDate) {
        this.offlinePdaTrialExpirationDate = offlinePdaTrialExpirationDate;
    }


    /**
     * Gets the offlineTrialExpirationDate value for this User.
     * 
     * @return offlineTrialExpirationDate
     */
    public java.util.Calendar getOfflineTrialExpirationDate() {
        return offlineTrialExpirationDate;
    }


    /**
     * Sets the offlineTrialExpirationDate value for this User.
     * 
     * @param offlineTrialExpirationDate
     */
    public void setOfflineTrialExpirationDate(java.util.Calendar offlineTrialExpirationDate) {
        this.offlineTrialExpirationDate = offlineTrialExpirationDate;
    }


    /**
     * Gets the partner_Kickoffs1__r value for this User.
     * 
     * @return partner_Kickoffs1__r
     */
    public com.sforce.soap.enterprise.QueryResult getPartner_Kickoffs1__r() {
        return partner_Kickoffs1__r;
    }


    /**
     * Sets the partner_Kickoffs1__r value for this User.
     * 
     * @param partner_Kickoffs1__r
     */
    public void setPartner_Kickoffs1__r(com.sforce.soap.enterprise.QueryResult partner_Kickoffs1__r) {
        this.partner_Kickoffs1__r = partner_Kickoffs1__r;
    }


    /**
     * Gets the partner_Kickoffs__r value for this User.
     * 
     * @return partner_Kickoffs__r
     */
    public com.sforce.soap.enterprise.QueryResult getPartner_Kickoffs__r() {
        return partner_Kickoffs__r;
    }


    /**
     * Sets the partner_Kickoffs__r value for this User.
     * 
     * @param partner_Kickoffs__r
     */
    public void setPartner_Kickoffs__r(com.sforce.soap.enterprise.QueryResult partner_Kickoffs__r) {
        this.partner_Kickoffs__r = partner_Kickoffs__r;
    }


    /**
     * Gets the permissionSetAssignments value for this User.
     * 
     * @return permissionSetAssignments
     */
    public com.sforce.soap.enterprise.QueryResult getPermissionSetAssignments() {
        return permissionSetAssignments;
    }


    /**
     * Sets the permissionSetAssignments value for this User.
     * 
     * @param permissionSetAssignments
     */
    public void setPermissionSetAssignments(com.sforce.soap.enterprise.QueryResult permissionSetAssignments) {
        this.permissionSetAssignments = permissionSetAssignments;
    }


    /**
     * Gets the phone value for this User.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this User.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the portalRole value for this User.
     * 
     * @return portalRole
     */
    public java.lang.String getPortalRole() {
        return portalRole;
    }


    /**
     * Sets the portalRole value for this User.
     * 
     * @param portalRole
     */
    public void setPortalRole(java.lang.String portalRole) {
        this.portalRole = portalRole;
    }


    /**
     * Gets the postalCode value for this User.
     * 
     * @return postalCode
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this User.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the profile value for this User.
     * 
     * @return profile
     */
    public com.sforce.soap.enterprise.sobject.Profile getProfile() {
        return profile;
    }


    /**
     * Sets the profile value for this User.
     * 
     * @param profile
     */
    public void setProfile(com.sforce.soap.enterprise.sobject.Profile profile) {
        this.profile = profile;
    }


    /**
     * Gets the profileId value for this User.
     * 
     * @return profileId
     */
    public java.lang.String getProfileId() {
        return profileId;
    }


    /**
     * Sets the profileId value for this User.
     * 
     * @param profileId
     */
    public void setProfileId(java.lang.String profileId) {
        this.profileId = profileId;
    }


    /**
     * Gets the receivesAdminInfoEmails value for this User.
     * 
     * @return receivesAdminInfoEmails
     */
    public java.lang.Boolean getReceivesAdminInfoEmails() {
        return receivesAdminInfoEmails;
    }


    /**
     * Sets the receivesAdminInfoEmails value for this User.
     * 
     * @param receivesAdminInfoEmails
     */
    public void setReceivesAdminInfoEmails(java.lang.Boolean receivesAdminInfoEmails) {
        this.receivesAdminInfoEmails = receivesAdminInfoEmails;
    }


    /**
     * Gets the receivesInfoEmails value for this User.
     * 
     * @return receivesInfoEmails
     */
    public java.lang.Boolean getReceivesInfoEmails() {
        return receivesInfoEmails;
    }


    /**
     * Sets the receivesInfoEmails value for this User.
     * 
     * @param receivesInfoEmails
     */
    public void setReceivesInfoEmails(java.lang.Boolean receivesInfoEmails) {
        this.receivesInfoEmails = receivesInfoEmails;
    }


    /**
     * Gets the regOnline__RegOnlineSessionID__c value for this User.
     * 
     * @return regOnline__RegOnlineSessionID__c
     */
    public java.lang.String getRegOnline__RegOnlineSessionID__c() {
        return regOnline__RegOnlineSessionID__c;
    }


    /**
     * Sets the regOnline__RegOnlineSessionID__c value for this User.
     * 
     * @param regOnline__RegOnlineSessionID__c
     */
    public void setRegOnline__RegOnlineSessionID__c(java.lang.String regOnline__RegOnlineSessionID__c) {
        this.regOnline__RegOnlineSessionID__c = regOnline__RegOnlineSessionID__c;
    }


    /**
     * Gets the SFDC_Projects__r value for this User.
     * 
     * @return SFDC_Projects__r
     */
    public com.sforce.soap.enterprise.QueryResult getSFDC_Projects__r() {
        return SFDC_Projects__r;
    }


    /**
     * Sets the SFDC_Projects__r value for this User.
     * 
     * @param SFDC_Projects__r
     */
    public void setSFDC_Projects__r(com.sforce.soap.enterprise.QueryResult SFDC_Projects__r) {
        this.SFDC_Projects__r = SFDC_Projects__r;
    }


    /**
     * Gets the smallPhotoUrl value for this User.
     * 
     * @return smallPhotoUrl
     */
    public java.lang.String getSmallPhotoUrl() {
        return smallPhotoUrl;
    }


    /**
     * Sets the smallPhotoUrl value for this User.
     * 
     * @param smallPhotoUrl
     */
    public void setSmallPhotoUrl(java.lang.String smallPhotoUrl) {
        this.smallPhotoUrl = smallPhotoUrl;
    }


    /**
     * Gets the state value for this User.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this User.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the status_Meeting_Attendees__r value for this User.
     * 
     * @return status_Meeting_Attendees__r
     */
    public com.sforce.soap.enterprise.QueryResult getStatus_Meeting_Attendees__r() {
        return status_Meeting_Attendees__r;
    }


    /**
     * Sets the status_Meeting_Attendees__r value for this User.
     * 
     * @param status_Meeting_Attendees__r
     */
    public void setStatus_Meeting_Attendees__r(com.sforce.soap.enterprise.QueryResult status_Meeting_Attendees__r) {
        this.status_Meeting_Attendees__r = status_Meeting_Attendees__r;
    }


    /**
     * Gets the street value for this User.
     * 
     * @return street
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this User.
     * 
     * @param street
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the systemModstamp value for this User.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this User.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the system_Changes1__r value for this User.
     * 
     * @return system_Changes1__r
     */
    public com.sforce.soap.enterprise.QueryResult getSystem_Changes1__r() {
        return system_Changes1__r;
    }


    /**
     * Sets the system_Changes1__r value for this User.
     * 
     * @param system_Changes1__r
     */
    public void setSystem_Changes1__r(com.sforce.soap.enterprise.QueryResult system_Changes1__r) {
        this.system_Changes1__r = system_Changes1__r;
    }


    /**
     * Gets the system_Changes2__r value for this User.
     * 
     * @return system_Changes2__r
     */
    public com.sforce.soap.enterprise.QueryResult getSystem_Changes2__r() {
        return system_Changes2__r;
    }


    /**
     * Sets the system_Changes2__r value for this User.
     * 
     * @param system_Changes2__r
     */
    public void setSystem_Changes2__r(com.sforce.soap.enterprise.QueryResult system_Changes2__r) {
        this.system_Changes2__r = system_Changes2__r;
    }


    /**
     * Gets the system_Changes__r value for this User.
     * 
     * @return system_Changes__r
     */
    public com.sforce.soap.enterprise.QueryResult getSystem_Changes__r() {
        return system_Changes__r;
    }


    /**
     * Sets the system_Changes__r value for this User.
     * 
     * @param system_Changes__r
     */
    public void setSystem_Changes__r(com.sforce.soap.enterprise.QueryResult system_Changes__r) {
        this.system_Changes__r = system_Changes__r;
    }


    /**
     * Gets the tickets1__r value for this User.
     * 
     * @return tickets1__r
     */
    public com.sforce.soap.enterprise.QueryResult getTickets1__r() {
        return tickets1__r;
    }


    /**
     * Sets the tickets1__r value for this User.
     * 
     * @param tickets1__r
     */
    public void setTickets1__r(com.sforce.soap.enterprise.QueryResult tickets1__r) {
        this.tickets1__r = tickets1__r;
    }


    /**
     * Gets the tier_1_Cases__r value for this User.
     * 
     * @return tier_1_Cases__r
     */
    public com.sforce.soap.enterprise.QueryResult getTier_1_Cases__r() {
        return tier_1_Cases__r;
    }


    /**
     * Sets the tier_1_Cases__r value for this User.
     * 
     * @param tier_1_Cases__r
     */
    public void setTier_1_Cases__r(com.sforce.soap.enterprise.QueryResult tier_1_Cases__r) {
        this.tier_1_Cases__r = tier_1_Cases__r;
    }


    /**
     * Gets the tier_2_Cases__r value for this User.
     * 
     * @return tier_2_Cases__r
     */
    public com.sforce.soap.enterprise.QueryResult getTier_2_Cases__r() {
        return tier_2_Cases__r;
    }


    /**
     * Sets the tier_2_Cases__r value for this User.
     * 
     * @param tier_2_Cases__r
     */
    public void setTier_2_Cases__r(com.sforce.soap.enterprise.QueryResult tier_2_Cases__r) {
        this.tier_2_Cases__r = tier_2_Cases__r;
    }


    /**
     * Gets the timeZoneSidKey value for this User.
     * 
     * @return timeZoneSidKey
     */
    public java.lang.String getTimeZoneSidKey() {
        return timeZoneSidKey;
    }


    /**
     * Sets the timeZoneSidKey value for this User.
     * 
     * @param timeZoneSidKey
     */
    public void setTimeZoneSidKey(java.lang.String timeZoneSidKey) {
        this.timeZoneSidKey = timeZoneSidKey;
    }


    /**
     * Gets the title value for this User.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this User.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the trainings1__r value for this User.
     * 
     * @return trainings1__r
     */
    public com.sforce.soap.enterprise.QueryResult getTrainings1__r() {
        return trainings1__r;
    }


    /**
     * Sets the trainings1__r value for this User.
     * 
     * @param trainings1__r
     */
    public void setTrainings1__r(com.sforce.soap.enterprise.QueryResult trainings1__r) {
        this.trainings1__r = trainings1__r;
    }


    /**
     * Gets the trainings2__r value for this User.
     * 
     * @return trainings2__r
     */
    public com.sforce.soap.enterprise.QueryResult getTrainings2__r() {
        return trainings2__r;
    }


    /**
     * Sets the trainings2__r value for this User.
     * 
     * @param trainings2__r
     */
    public void setTrainings2__r(com.sforce.soap.enterprise.QueryResult trainings2__r) {
        this.trainings2__r = trainings2__r;
    }


    /**
     * Gets the trainings3__r value for this User.
     * 
     * @return trainings3__r
     */
    public com.sforce.soap.enterprise.QueryResult getTrainings3__r() {
        return trainings3__r;
    }


    /**
     * Sets the trainings3__r value for this User.
     * 
     * @param trainings3__r
     */
    public void setTrainings3__r(com.sforce.soap.enterprise.QueryResult trainings3__r) {
        this.trainings3__r = trainings3__r;
    }


    /**
     * Gets the trainings__r value for this User.
     * 
     * @return trainings__r
     */
    public com.sforce.soap.enterprise.QueryResult getTrainings__r() {
        return trainings__r;
    }


    /**
     * Sets the trainings__r value for this User.
     * 
     * @param trainings__r
     */
    public void setTrainings__r(com.sforce.soap.enterprise.QueryResult trainings__r) {
        this.trainings__r = trainings__r;
    }


    /**
     * Gets the userPermissionsAvantgoUser value for this User.
     * 
     * @return userPermissionsAvantgoUser
     */
    public java.lang.Boolean getUserPermissionsAvantgoUser() {
        return userPermissionsAvantgoUser;
    }


    /**
     * Sets the userPermissionsAvantgoUser value for this User.
     * 
     * @param userPermissionsAvantgoUser
     */
    public void setUserPermissionsAvantgoUser(java.lang.Boolean userPermissionsAvantgoUser) {
        this.userPermissionsAvantgoUser = userPermissionsAvantgoUser;
    }


    /**
     * Gets the userPermissionsCallCenterAutoLogin value for this User.
     * 
     * @return userPermissionsCallCenterAutoLogin
     */
    public java.lang.Boolean getUserPermissionsCallCenterAutoLogin() {
        return userPermissionsCallCenterAutoLogin;
    }


    /**
     * Sets the userPermissionsCallCenterAutoLogin value for this User.
     * 
     * @param userPermissionsCallCenterAutoLogin
     */
    public void setUserPermissionsCallCenterAutoLogin(java.lang.Boolean userPermissionsCallCenterAutoLogin) {
        this.userPermissionsCallCenterAutoLogin = userPermissionsCallCenterAutoLogin;
    }


    /**
     * Gets the userPermissionsInteractionUser value for this User.
     * 
     * @return userPermissionsInteractionUser
     */
    public java.lang.Boolean getUserPermissionsInteractionUser() {
        return userPermissionsInteractionUser;
    }


    /**
     * Sets the userPermissionsInteractionUser value for this User.
     * 
     * @param userPermissionsInteractionUser
     */
    public void setUserPermissionsInteractionUser(java.lang.Boolean userPermissionsInteractionUser) {
        this.userPermissionsInteractionUser = userPermissionsInteractionUser;
    }


    /**
     * Gets the userPermissionsKnowledgeUser value for this User.
     * 
     * @return userPermissionsKnowledgeUser
     */
    public java.lang.Boolean getUserPermissionsKnowledgeUser() {
        return userPermissionsKnowledgeUser;
    }


    /**
     * Sets the userPermissionsKnowledgeUser value for this User.
     * 
     * @param userPermissionsKnowledgeUser
     */
    public void setUserPermissionsKnowledgeUser(java.lang.Boolean userPermissionsKnowledgeUser) {
        this.userPermissionsKnowledgeUser = userPermissionsKnowledgeUser;
    }


    /**
     * Gets the userPermissionsMarketingUser value for this User.
     * 
     * @return userPermissionsMarketingUser
     */
    public java.lang.Boolean getUserPermissionsMarketingUser() {
        return userPermissionsMarketingUser;
    }


    /**
     * Sets the userPermissionsMarketingUser value for this User.
     * 
     * @param userPermissionsMarketingUser
     */
    public void setUserPermissionsMarketingUser(java.lang.Boolean userPermissionsMarketingUser) {
        this.userPermissionsMarketingUser = userPermissionsMarketingUser;
    }


    /**
     * Gets the userPermissionsMobileUser value for this User.
     * 
     * @return userPermissionsMobileUser
     */
    public java.lang.Boolean getUserPermissionsMobileUser() {
        return userPermissionsMobileUser;
    }


    /**
     * Sets the userPermissionsMobileUser value for this User.
     * 
     * @param userPermissionsMobileUser
     */
    public void setUserPermissionsMobileUser(java.lang.Boolean userPermissionsMobileUser) {
        this.userPermissionsMobileUser = userPermissionsMobileUser;
    }


    /**
     * Gets the userPermissionsOfflineUser value for this User.
     * 
     * @return userPermissionsOfflineUser
     */
    public java.lang.Boolean getUserPermissionsOfflineUser() {
        return userPermissionsOfflineUser;
    }


    /**
     * Sets the userPermissionsOfflineUser value for this User.
     * 
     * @param userPermissionsOfflineUser
     */
    public void setUserPermissionsOfflineUser(java.lang.Boolean userPermissionsOfflineUser) {
        this.userPermissionsOfflineUser = userPermissionsOfflineUser;
    }


    /**
     * Gets the userPermissionsSFContentUser value for this User.
     * 
     * @return userPermissionsSFContentUser
     */
    public java.lang.Boolean getUserPermissionsSFContentUser() {
        return userPermissionsSFContentUser;
    }


    /**
     * Sets the userPermissionsSFContentUser value for this User.
     * 
     * @param userPermissionsSFContentUser
     */
    public void setUserPermissionsSFContentUser(java.lang.Boolean userPermissionsSFContentUser) {
        this.userPermissionsSFContentUser = userPermissionsSFContentUser;
    }


    /**
     * Gets the userPermissionsSupportUser value for this User.
     * 
     * @return userPermissionsSupportUser
     */
    public java.lang.Boolean getUserPermissionsSupportUser() {
        return userPermissionsSupportUser;
    }


    /**
     * Sets the userPermissionsSupportUser value for this User.
     * 
     * @param userPermissionsSupportUser
     */
    public void setUserPermissionsSupportUser(java.lang.Boolean userPermissionsSupportUser) {
        this.userPermissionsSupportUser = userPermissionsSupportUser;
    }


    /**
     * Gets the userPreferences value for this User.
     * 
     * @return userPreferences
     */
    public com.sforce.soap.enterprise.QueryResult getUserPreferences() {
        return userPreferences;
    }


    /**
     * Sets the userPreferences value for this User.
     * 
     * @param userPreferences
     */
    public void setUserPreferences(com.sforce.soap.enterprise.QueryResult userPreferences) {
        this.userPreferences = userPreferences;
    }


    /**
     * Gets the userPreferencesActivityRemindersPopup value for this User.
     * 
     * @return userPreferencesActivityRemindersPopup
     */
    public java.lang.Boolean getUserPreferencesActivityRemindersPopup() {
        return userPreferencesActivityRemindersPopup;
    }


    /**
     * Sets the userPreferencesActivityRemindersPopup value for this User.
     * 
     * @param userPreferencesActivityRemindersPopup
     */
    public void setUserPreferencesActivityRemindersPopup(java.lang.Boolean userPreferencesActivityRemindersPopup) {
        this.userPreferencesActivityRemindersPopup = userPreferencesActivityRemindersPopup;
    }


    /**
     * Gets the userPreferencesApexPagesDeveloperMode value for this User.
     * 
     * @return userPreferencesApexPagesDeveloperMode
     */
    public java.lang.Boolean getUserPreferencesApexPagesDeveloperMode() {
        return userPreferencesApexPagesDeveloperMode;
    }


    /**
     * Sets the userPreferencesApexPagesDeveloperMode value for this User.
     * 
     * @param userPreferencesApexPagesDeveloperMode
     */
    public void setUserPreferencesApexPagesDeveloperMode(java.lang.Boolean userPreferencesApexPagesDeveloperMode) {
        this.userPreferencesApexPagesDeveloperMode = userPreferencesApexPagesDeveloperMode;
    }


    /**
     * Gets the userPreferencesContentEmailAsAndWhen value for this User.
     * 
     * @return userPreferencesContentEmailAsAndWhen
     */
    public java.lang.Boolean getUserPreferencesContentEmailAsAndWhen() {
        return userPreferencesContentEmailAsAndWhen;
    }


    /**
     * Sets the userPreferencesContentEmailAsAndWhen value for this User.
     * 
     * @param userPreferencesContentEmailAsAndWhen
     */
    public void setUserPreferencesContentEmailAsAndWhen(java.lang.Boolean userPreferencesContentEmailAsAndWhen) {
        this.userPreferencesContentEmailAsAndWhen = userPreferencesContentEmailAsAndWhen;
    }


    /**
     * Gets the userPreferencesContentNoEmail value for this User.
     * 
     * @return userPreferencesContentNoEmail
     */
    public java.lang.Boolean getUserPreferencesContentNoEmail() {
        return userPreferencesContentNoEmail;
    }


    /**
     * Sets the userPreferencesContentNoEmail value for this User.
     * 
     * @param userPreferencesContentNoEmail
     */
    public void setUserPreferencesContentNoEmail(java.lang.Boolean userPreferencesContentNoEmail) {
        this.userPreferencesContentNoEmail = userPreferencesContentNoEmail;
    }


    /**
     * Gets the userPreferencesDisCommentAfterLikeEmail value for this User.
     * 
     * @return userPreferencesDisCommentAfterLikeEmail
     */
    public java.lang.Boolean getUserPreferencesDisCommentAfterLikeEmail() {
        return userPreferencesDisCommentAfterLikeEmail;
    }


    /**
     * Sets the userPreferencesDisCommentAfterLikeEmail value for this User.
     * 
     * @param userPreferencesDisCommentAfterLikeEmail
     */
    public void setUserPreferencesDisCommentAfterLikeEmail(java.lang.Boolean userPreferencesDisCommentAfterLikeEmail) {
        this.userPreferencesDisCommentAfterLikeEmail = userPreferencesDisCommentAfterLikeEmail;
    }


    /**
     * Gets the userPreferencesDisMentionsCommentEmail value for this User.
     * 
     * @return userPreferencesDisMentionsCommentEmail
     */
    public java.lang.Boolean getUserPreferencesDisMentionsCommentEmail() {
        return userPreferencesDisMentionsCommentEmail;
    }


    /**
     * Sets the userPreferencesDisMentionsCommentEmail value for this User.
     * 
     * @param userPreferencesDisMentionsCommentEmail
     */
    public void setUserPreferencesDisMentionsCommentEmail(java.lang.Boolean userPreferencesDisMentionsCommentEmail) {
        this.userPreferencesDisMentionsCommentEmail = userPreferencesDisMentionsCommentEmail;
    }


    /**
     * Gets the userPreferencesDisProfPostCommentEmail value for this User.
     * 
     * @return userPreferencesDisProfPostCommentEmail
     */
    public java.lang.Boolean getUserPreferencesDisProfPostCommentEmail() {
        return userPreferencesDisProfPostCommentEmail;
    }


    /**
     * Sets the userPreferencesDisProfPostCommentEmail value for this User.
     * 
     * @param userPreferencesDisProfPostCommentEmail
     */
    public void setUserPreferencesDisProfPostCommentEmail(java.lang.Boolean userPreferencesDisProfPostCommentEmail) {
        this.userPreferencesDisProfPostCommentEmail = userPreferencesDisProfPostCommentEmail;
    }


    /**
     * Gets the userPreferencesDisableAllFeedsEmail value for this User.
     * 
     * @return userPreferencesDisableAllFeedsEmail
     */
    public java.lang.Boolean getUserPreferencesDisableAllFeedsEmail() {
        return userPreferencesDisableAllFeedsEmail;
    }


    /**
     * Sets the userPreferencesDisableAllFeedsEmail value for this User.
     * 
     * @param userPreferencesDisableAllFeedsEmail
     */
    public void setUserPreferencesDisableAllFeedsEmail(java.lang.Boolean userPreferencesDisableAllFeedsEmail) {
        this.userPreferencesDisableAllFeedsEmail = userPreferencesDisableAllFeedsEmail;
    }


    /**
     * Gets the userPreferencesDisableBookmarkEmail value for this User.
     * 
     * @return userPreferencesDisableBookmarkEmail
     */
    public java.lang.Boolean getUserPreferencesDisableBookmarkEmail() {
        return userPreferencesDisableBookmarkEmail;
    }


    /**
     * Sets the userPreferencesDisableBookmarkEmail value for this User.
     * 
     * @param userPreferencesDisableBookmarkEmail
     */
    public void setUserPreferencesDisableBookmarkEmail(java.lang.Boolean userPreferencesDisableBookmarkEmail) {
        this.userPreferencesDisableBookmarkEmail = userPreferencesDisableBookmarkEmail;
    }


    /**
     * Gets the userPreferencesDisableChangeCommentEmail value for this User.
     * 
     * @return userPreferencesDisableChangeCommentEmail
     */
    public java.lang.Boolean getUserPreferencesDisableChangeCommentEmail() {
        return userPreferencesDisableChangeCommentEmail;
    }


    /**
     * Sets the userPreferencesDisableChangeCommentEmail value for this User.
     * 
     * @param userPreferencesDisableChangeCommentEmail
     */
    public void setUserPreferencesDisableChangeCommentEmail(java.lang.Boolean userPreferencesDisableChangeCommentEmail) {
        this.userPreferencesDisableChangeCommentEmail = userPreferencesDisableChangeCommentEmail;
    }


    /**
     * Gets the userPreferencesDisableFileShareNotificationsForApi value for this User.
     * 
     * @return userPreferencesDisableFileShareNotificationsForApi
     */
    public java.lang.Boolean getUserPreferencesDisableFileShareNotificationsForApi() {
        return userPreferencesDisableFileShareNotificationsForApi;
    }


    /**
     * Sets the userPreferencesDisableFileShareNotificationsForApi value for this User.
     * 
     * @param userPreferencesDisableFileShareNotificationsForApi
     */
    public void setUserPreferencesDisableFileShareNotificationsForApi(java.lang.Boolean userPreferencesDisableFileShareNotificationsForApi) {
        this.userPreferencesDisableFileShareNotificationsForApi = userPreferencesDisableFileShareNotificationsForApi;
    }


    /**
     * Gets the userPreferencesDisableFollowersEmail value for this User.
     * 
     * @return userPreferencesDisableFollowersEmail
     */
    public java.lang.Boolean getUserPreferencesDisableFollowersEmail() {
        return userPreferencesDisableFollowersEmail;
    }


    /**
     * Sets the userPreferencesDisableFollowersEmail value for this User.
     * 
     * @param userPreferencesDisableFollowersEmail
     */
    public void setUserPreferencesDisableFollowersEmail(java.lang.Boolean userPreferencesDisableFollowersEmail) {
        this.userPreferencesDisableFollowersEmail = userPreferencesDisableFollowersEmail;
    }


    /**
     * Gets the userPreferencesDisableLaterCommentEmail value for this User.
     * 
     * @return userPreferencesDisableLaterCommentEmail
     */
    public java.lang.Boolean getUserPreferencesDisableLaterCommentEmail() {
        return userPreferencesDisableLaterCommentEmail;
    }


    /**
     * Sets the userPreferencesDisableLaterCommentEmail value for this User.
     * 
     * @param userPreferencesDisableLaterCommentEmail
     */
    public void setUserPreferencesDisableLaterCommentEmail(java.lang.Boolean userPreferencesDisableLaterCommentEmail) {
        this.userPreferencesDisableLaterCommentEmail = userPreferencesDisableLaterCommentEmail;
    }


    /**
     * Gets the userPreferencesDisableLikeEmail value for this User.
     * 
     * @return userPreferencesDisableLikeEmail
     */
    public java.lang.Boolean getUserPreferencesDisableLikeEmail() {
        return userPreferencesDisableLikeEmail;
    }


    /**
     * Sets the userPreferencesDisableLikeEmail value for this User.
     * 
     * @param userPreferencesDisableLikeEmail
     */
    public void setUserPreferencesDisableLikeEmail(java.lang.Boolean userPreferencesDisableLikeEmail) {
        this.userPreferencesDisableLikeEmail = userPreferencesDisableLikeEmail;
    }


    /**
     * Gets the userPreferencesDisableMentionsPostEmail value for this User.
     * 
     * @return userPreferencesDisableMentionsPostEmail
     */
    public java.lang.Boolean getUserPreferencesDisableMentionsPostEmail() {
        return userPreferencesDisableMentionsPostEmail;
    }


    /**
     * Sets the userPreferencesDisableMentionsPostEmail value for this User.
     * 
     * @param userPreferencesDisableMentionsPostEmail
     */
    public void setUserPreferencesDisableMentionsPostEmail(java.lang.Boolean userPreferencesDisableMentionsPostEmail) {
        this.userPreferencesDisableMentionsPostEmail = userPreferencesDisableMentionsPostEmail;
    }


    /**
     * Gets the userPreferencesDisableMessageEmail value for this User.
     * 
     * @return userPreferencesDisableMessageEmail
     */
    public java.lang.Boolean getUserPreferencesDisableMessageEmail() {
        return userPreferencesDisableMessageEmail;
    }


    /**
     * Sets the userPreferencesDisableMessageEmail value for this User.
     * 
     * @param userPreferencesDisableMessageEmail
     */
    public void setUserPreferencesDisableMessageEmail(java.lang.Boolean userPreferencesDisableMessageEmail) {
        this.userPreferencesDisableMessageEmail = userPreferencesDisableMessageEmail;
    }


    /**
     * Gets the userPreferencesDisableProfilePostEmail value for this User.
     * 
     * @return userPreferencesDisableProfilePostEmail
     */
    public java.lang.Boolean getUserPreferencesDisableProfilePostEmail() {
        return userPreferencesDisableProfilePostEmail;
    }


    /**
     * Sets the userPreferencesDisableProfilePostEmail value for this User.
     * 
     * @param userPreferencesDisableProfilePostEmail
     */
    public void setUserPreferencesDisableProfilePostEmail(java.lang.Boolean userPreferencesDisableProfilePostEmail) {
        this.userPreferencesDisableProfilePostEmail = userPreferencesDisableProfilePostEmail;
    }


    /**
     * Gets the userPreferencesDisableSharePostEmail value for this User.
     * 
     * @return userPreferencesDisableSharePostEmail
     */
    public java.lang.Boolean getUserPreferencesDisableSharePostEmail() {
        return userPreferencesDisableSharePostEmail;
    }


    /**
     * Sets the userPreferencesDisableSharePostEmail value for this User.
     * 
     * @param userPreferencesDisableSharePostEmail
     */
    public void setUserPreferencesDisableSharePostEmail(java.lang.Boolean userPreferencesDisableSharePostEmail) {
        this.userPreferencesDisableSharePostEmail = userPreferencesDisableSharePostEmail;
    }


    /**
     * Gets the userPreferencesEnableAutoSubForFeeds value for this User.
     * 
     * @return userPreferencesEnableAutoSubForFeeds
     */
    public java.lang.Boolean getUserPreferencesEnableAutoSubForFeeds() {
        return userPreferencesEnableAutoSubForFeeds;
    }


    /**
     * Sets the userPreferencesEnableAutoSubForFeeds value for this User.
     * 
     * @param userPreferencesEnableAutoSubForFeeds
     */
    public void setUserPreferencesEnableAutoSubForFeeds(java.lang.Boolean userPreferencesEnableAutoSubForFeeds) {
        this.userPreferencesEnableAutoSubForFeeds = userPreferencesEnableAutoSubForFeeds;
    }


    /**
     * Gets the userPreferencesEventRemindersCheckboxDefault value for this User.
     * 
     * @return userPreferencesEventRemindersCheckboxDefault
     */
    public java.lang.Boolean getUserPreferencesEventRemindersCheckboxDefault() {
        return userPreferencesEventRemindersCheckboxDefault;
    }


    /**
     * Sets the userPreferencesEventRemindersCheckboxDefault value for this User.
     * 
     * @param userPreferencesEventRemindersCheckboxDefault
     */
    public void setUserPreferencesEventRemindersCheckboxDefault(java.lang.Boolean userPreferencesEventRemindersCheckboxDefault) {
        this.userPreferencesEventRemindersCheckboxDefault = userPreferencesEventRemindersCheckboxDefault;
    }


    /**
     * Gets the userPreferencesHideCSNDesktopTask value for this User.
     * 
     * @return userPreferencesHideCSNDesktopTask
     */
    public java.lang.Boolean getUserPreferencesHideCSNDesktopTask() {
        return userPreferencesHideCSNDesktopTask;
    }


    /**
     * Sets the userPreferencesHideCSNDesktopTask value for this User.
     * 
     * @param userPreferencesHideCSNDesktopTask
     */
    public void setUserPreferencesHideCSNDesktopTask(java.lang.Boolean userPreferencesHideCSNDesktopTask) {
        this.userPreferencesHideCSNDesktopTask = userPreferencesHideCSNDesktopTask;
    }


    /**
     * Gets the userPreferencesHideCSNGetChatterMobileTask value for this User.
     * 
     * @return userPreferencesHideCSNGetChatterMobileTask
     */
    public java.lang.Boolean getUserPreferencesHideCSNGetChatterMobileTask() {
        return userPreferencesHideCSNGetChatterMobileTask;
    }


    /**
     * Sets the userPreferencesHideCSNGetChatterMobileTask value for this User.
     * 
     * @param userPreferencesHideCSNGetChatterMobileTask
     */
    public void setUserPreferencesHideCSNGetChatterMobileTask(java.lang.Boolean userPreferencesHideCSNGetChatterMobileTask) {
        this.userPreferencesHideCSNGetChatterMobileTask = userPreferencesHideCSNGetChatterMobileTask;
    }


    /**
     * Gets the userPreferencesOptOutOfTouch value for this User.
     * 
     * @return userPreferencesOptOutOfTouch
     */
    public java.lang.Boolean getUserPreferencesOptOutOfTouch() {
        return userPreferencesOptOutOfTouch;
    }


    /**
     * Sets the userPreferencesOptOutOfTouch value for this User.
     * 
     * @param userPreferencesOptOutOfTouch
     */
    public void setUserPreferencesOptOutOfTouch(java.lang.Boolean userPreferencesOptOutOfTouch) {
        this.userPreferencesOptOutOfTouch = userPreferencesOptOutOfTouch;
    }


    /**
     * Gets the userPreferencesReminderSoundOff value for this User.
     * 
     * @return userPreferencesReminderSoundOff
     */
    public java.lang.Boolean getUserPreferencesReminderSoundOff() {
        return userPreferencesReminderSoundOff;
    }


    /**
     * Sets the userPreferencesReminderSoundOff value for this User.
     * 
     * @param userPreferencesReminderSoundOff
     */
    public void setUserPreferencesReminderSoundOff(java.lang.Boolean userPreferencesReminderSoundOff) {
        this.userPreferencesReminderSoundOff = userPreferencesReminderSoundOff;
    }


    /**
     * Gets the userPreferencesShowCityToExternalUsers value for this User.
     * 
     * @return userPreferencesShowCityToExternalUsers
     */
    public java.lang.Boolean getUserPreferencesShowCityToExternalUsers() {
        return userPreferencesShowCityToExternalUsers;
    }


    /**
     * Sets the userPreferencesShowCityToExternalUsers value for this User.
     * 
     * @param userPreferencesShowCityToExternalUsers
     */
    public void setUserPreferencesShowCityToExternalUsers(java.lang.Boolean userPreferencesShowCityToExternalUsers) {
        this.userPreferencesShowCityToExternalUsers = userPreferencesShowCityToExternalUsers;
    }


    /**
     * Gets the userPreferencesShowCountryToExternalUsers value for this User.
     * 
     * @return userPreferencesShowCountryToExternalUsers
     */
    public java.lang.Boolean getUserPreferencesShowCountryToExternalUsers() {
        return userPreferencesShowCountryToExternalUsers;
    }


    /**
     * Sets the userPreferencesShowCountryToExternalUsers value for this User.
     * 
     * @param userPreferencesShowCountryToExternalUsers
     */
    public void setUserPreferencesShowCountryToExternalUsers(java.lang.Boolean userPreferencesShowCountryToExternalUsers) {
        this.userPreferencesShowCountryToExternalUsers = userPreferencesShowCountryToExternalUsers;
    }


    /**
     * Gets the userPreferencesShowEmailToExternalUsers value for this User.
     * 
     * @return userPreferencesShowEmailToExternalUsers
     */
    public java.lang.Boolean getUserPreferencesShowEmailToExternalUsers() {
        return userPreferencesShowEmailToExternalUsers;
    }


    /**
     * Sets the userPreferencesShowEmailToExternalUsers value for this User.
     * 
     * @param userPreferencesShowEmailToExternalUsers
     */
    public void setUserPreferencesShowEmailToExternalUsers(java.lang.Boolean userPreferencesShowEmailToExternalUsers) {
        this.userPreferencesShowEmailToExternalUsers = userPreferencesShowEmailToExternalUsers;
    }


    /**
     * Gets the userPreferencesShowFaxToExternalUsers value for this User.
     * 
     * @return userPreferencesShowFaxToExternalUsers
     */
    public java.lang.Boolean getUserPreferencesShowFaxToExternalUsers() {
        return userPreferencesShowFaxToExternalUsers;
    }


    /**
     * Sets the userPreferencesShowFaxToExternalUsers value for this User.
     * 
     * @param userPreferencesShowFaxToExternalUsers
     */
    public void setUserPreferencesShowFaxToExternalUsers(java.lang.Boolean userPreferencesShowFaxToExternalUsers) {
        this.userPreferencesShowFaxToExternalUsers = userPreferencesShowFaxToExternalUsers;
    }


    /**
     * Gets the userPreferencesShowManagerToExternalUsers value for this User.
     * 
     * @return userPreferencesShowManagerToExternalUsers
     */
    public java.lang.Boolean getUserPreferencesShowManagerToExternalUsers() {
        return userPreferencesShowManagerToExternalUsers;
    }


    /**
     * Sets the userPreferencesShowManagerToExternalUsers value for this User.
     * 
     * @param userPreferencesShowManagerToExternalUsers
     */
    public void setUserPreferencesShowManagerToExternalUsers(java.lang.Boolean userPreferencesShowManagerToExternalUsers) {
        this.userPreferencesShowManagerToExternalUsers = userPreferencesShowManagerToExternalUsers;
    }


    /**
     * Gets the userPreferencesShowMobilePhoneToExternalUsers value for this User.
     * 
     * @return userPreferencesShowMobilePhoneToExternalUsers
     */
    public java.lang.Boolean getUserPreferencesShowMobilePhoneToExternalUsers() {
        return userPreferencesShowMobilePhoneToExternalUsers;
    }


    /**
     * Sets the userPreferencesShowMobilePhoneToExternalUsers value for this User.
     * 
     * @param userPreferencesShowMobilePhoneToExternalUsers
     */
    public void setUserPreferencesShowMobilePhoneToExternalUsers(java.lang.Boolean userPreferencesShowMobilePhoneToExternalUsers) {
        this.userPreferencesShowMobilePhoneToExternalUsers = userPreferencesShowMobilePhoneToExternalUsers;
    }


    /**
     * Gets the userPreferencesShowPostalCodeToExternalUsers value for this User.
     * 
     * @return userPreferencesShowPostalCodeToExternalUsers
     */
    public java.lang.Boolean getUserPreferencesShowPostalCodeToExternalUsers() {
        return userPreferencesShowPostalCodeToExternalUsers;
    }


    /**
     * Sets the userPreferencesShowPostalCodeToExternalUsers value for this User.
     * 
     * @param userPreferencesShowPostalCodeToExternalUsers
     */
    public void setUserPreferencesShowPostalCodeToExternalUsers(java.lang.Boolean userPreferencesShowPostalCodeToExternalUsers) {
        this.userPreferencesShowPostalCodeToExternalUsers = userPreferencesShowPostalCodeToExternalUsers;
    }


    /**
     * Gets the userPreferencesShowStateToExternalUsers value for this User.
     * 
     * @return userPreferencesShowStateToExternalUsers
     */
    public java.lang.Boolean getUserPreferencesShowStateToExternalUsers() {
        return userPreferencesShowStateToExternalUsers;
    }


    /**
     * Sets the userPreferencesShowStateToExternalUsers value for this User.
     * 
     * @param userPreferencesShowStateToExternalUsers
     */
    public void setUserPreferencesShowStateToExternalUsers(java.lang.Boolean userPreferencesShowStateToExternalUsers) {
        this.userPreferencesShowStateToExternalUsers = userPreferencesShowStateToExternalUsers;
    }


    /**
     * Gets the userPreferencesShowStreetAddressToExternalUsers value for this User.
     * 
     * @return userPreferencesShowStreetAddressToExternalUsers
     */
    public java.lang.Boolean getUserPreferencesShowStreetAddressToExternalUsers() {
        return userPreferencesShowStreetAddressToExternalUsers;
    }


    /**
     * Sets the userPreferencesShowStreetAddressToExternalUsers value for this User.
     * 
     * @param userPreferencesShowStreetAddressToExternalUsers
     */
    public void setUserPreferencesShowStreetAddressToExternalUsers(java.lang.Boolean userPreferencesShowStreetAddressToExternalUsers) {
        this.userPreferencesShowStreetAddressToExternalUsers = userPreferencesShowStreetAddressToExternalUsers;
    }


    /**
     * Gets the userPreferencesShowTitleToExternalUsers value for this User.
     * 
     * @return userPreferencesShowTitleToExternalUsers
     */
    public java.lang.Boolean getUserPreferencesShowTitleToExternalUsers() {
        return userPreferencesShowTitleToExternalUsers;
    }


    /**
     * Sets the userPreferencesShowTitleToExternalUsers value for this User.
     * 
     * @param userPreferencesShowTitleToExternalUsers
     */
    public void setUserPreferencesShowTitleToExternalUsers(java.lang.Boolean userPreferencesShowTitleToExternalUsers) {
        this.userPreferencesShowTitleToExternalUsers = userPreferencesShowTitleToExternalUsers;
    }


    /**
     * Gets the userPreferencesShowWorkPhoneToExternalUsers value for this User.
     * 
     * @return userPreferencesShowWorkPhoneToExternalUsers
     */
    public java.lang.Boolean getUserPreferencesShowWorkPhoneToExternalUsers() {
        return userPreferencesShowWorkPhoneToExternalUsers;
    }


    /**
     * Sets the userPreferencesShowWorkPhoneToExternalUsers value for this User.
     * 
     * @param userPreferencesShowWorkPhoneToExternalUsers
     */
    public void setUserPreferencesShowWorkPhoneToExternalUsers(java.lang.Boolean userPreferencesShowWorkPhoneToExternalUsers) {
        this.userPreferencesShowWorkPhoneToExternalUsers = userPreferencesShowWorkPhoneToExternalUsers;
    }


    /**
     * Gets the userPreferencesTaskRemindersCheckboxDefault value for this User.
     * 
     * @return userPreferencesTaskRemindersCheckboxDefault
     */
    public java.lang.Boolean getUserPreferencesTaskRemindersCheckboxDefault() {
        return userPreferencesTaskRemindersCheckboxDefault;
    }


    /**
     * Sets the userPreferencesTaskRemindersCheckboxDefault value for this User.
     * 
     * @param userPreferencesTaskRemindersCheckboxDefault
     */
    public void setUserPreferencesTaskRemindersCheckboxDefault(java.lang.Boolean userPreferencesTaskRemindersCheckboxDefault) {
        this.userPreferencesTaskRemindersCheckboxDefault = userPreferencesTaskRemindersCheckboxDefault;
    }


    /**
     * Gets the userRole value for this User.
     * 
     * @return userRole
     */
    public com.sforce.soap.enterprise.sobject.UserRole getUserRole() {
        return userRole;
    }


    /**
     * Sets the userRole value for this User.
     * 
     * @param userRole
     */
    public void setUserRole(com.sforce.soap.enterprise.sobject.UserRole userRole) {
        this.userRole = userRole;
    }


    /**
     * Gets the userRoleId value for this User.
     * 
     * @return userRoleId
     */
    public java.lang.String getUserRoleId() {
        return userRoleId;
    }


    /**
     * Sets the userRoleId value for this User.
     * 
     * @param userRoleId
     */
    public void setUserRoleId(java.lang.String userRoleId) {
        this.userRoleId = userRoleId;
    }


    /**
     * Gets the userType value for this User.
     * 
     * @return userType
     */
    public java.lang.String getUserType() {
        return userType;
    }


    /**
     * Sets the userType value for this User.
     * 
     * @param userType
     */
    public void setUserType(java.lang.String userType) {
        this.userType = userType;
    }


    /**
     * Gets the username value for this User.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this User.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof User)) return false;
        User other = (User) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.aboutMe==null && other.getAboutMe()==null) || 
             (this.aboutMe!=null &&
              this.aboutMe.equals(other.getAboutMe()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.accounts__r==null && other.getAccounts__r()==null) || 
             (this.accounts__r!=null &&
              this.accounts__r.equals(other.getAccounts__r()))) &&
            ((this.admin_Certifications1__r==null && other.getAdmin_Certifications1__r()==null) || 
             (this.admin_Certifications1__r!=null &&
              this.admin_Certifications1__r.equals(other.getAdmin_Certifications1__r()))) &&
            ((this.admin_Certifications__r==null && other.getAdmin_Certifications__r()==null) || 
             (this.admin_Certifications__r!=null &&
              this.admin_Certifications__r.equals(other.getAdmin_Certifications__r()))) &&
            ((this.alias==null && other.getAlias()==null) || 
             (this.alias!=null &&
              this.alias.equals(other.getAlias()))) &&
            ((this.analytic_Snapshots__r==null && other.getAnalytic_Snapshots__r()==null) || 
             (this.analytic_Snapshots__r!=null &&
              this.analytic_Snapshots__r.equals(other.getAnalytic_Snapshots__r()))) &&
            ((this.article_and_Category_Reporting1__r==null && other.getArticle_and_Category_Reporting1__r()==null) || 
             (this.article_and_Category_Reporting1__r!=null &&
              this.article_and_Category_Reporting1__r.equals(other.getArticle_and_Category_Reporting1__r()))) &&
            ((this.article_and_Category_Reporting__r==null && other.getArticle_and_Category_Reporting__r()==null) || 
             (this.article_and_Category_Reporting__r!=null &&
              this.article_and_Category_Reporting__r.equals(other.getArticle_and_Category_Reporting__r()))) &&
            ((this.CS_Management_Cases__r==null && other.getCS_Management_Cases__r()==null) || 
             (this.CS_Management_Cases__r!=null &&
              this.CS_Management_Cases__r.equals(other.getCS_Management_Cases__r()))) &&
            ((this.callCenterId==null && other.getCallCenterId()==null) || 
             (this.callCenterId!=null &&
              this.callCenterId.equals(other.getCallCenterId()))) &&
            ((this.cases1__r==null && other.getCases1__r()==null) || 
             (this.cases1__r!=null &&
              this.cases1__r.equals(other.getCases1__r()))) &&
            ((this.cases__r==null && other.getCases__r()==null) || 
             (this.cases__r!=null &&
              this.cases__r.equals(other.getCases__r()))) &&
            ((this.change_Control__r==null && other.getChange_Control__r()==null) || 
             (this.change_Control__r!=null &&
              this.change_Control__r.equals(other.getChange_Control__r()))) &&
            ((this.change_Controls1__r==null && other.getChange_Controls1__r()==null) || 
             (this.change_Controls1__r!=null &&
              this.change_Controls1__r.equals(other.getChange_Controls1__r()))) &&
            ((this.change_Controls__r==null && other.getChange_Controls__r()==null) || 
             (this.change_Controls__r!=null &&
              this.change_Controls__r.equals(other.getChange_Controls__r()))) &&
            ((this.channel_Manager_Outlines1__r==null && other.getChannel_Manager_Outlines1__r()==null) || 
             (this.channel_Manager_Outlines1__r!=null &&
              this.channel_Manager_Outlines1__r.equals(other.getChannel_Manager_Outlines1__r()))) &&
            ((this.channel_Manager_Outlines__r==null && other.getChannel_Manager_Outlines__r()==null) || 
             (this.channel_Manager_Outlines__r!=null &&
              this.channel_Manager_Outlines__r.equals(other.getChannel_Manager_Outlines__r()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.client_Type__c==null && other.getClient_Type__c()==null) || 
             (this.client_Type__c!=null &&
              this.client_Type__c.equals(other.getClient_Type__c()))) &&
            ((this.communityNickname==null && other.getCommunityNickname()==null) || 
             (this.communityNickname!=null &&
              this.communityNickname.equals(other.getCommunityNickname()))) &&
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.contactId==null && other.getContactId()==null) || 
             (this.contactId!=null &&
              this.contactId.equals(other.getContactId()))) &&
            ((this.content_Download_Notifications__r==null && other.getContent_Download_Notifications__r()==null) || 
             (this.content_Download_Notifications__r!=null &&
              this.content_Download_Notifications__r.equals(other.getContent_Download_Notifications__r()))) &&
            ((this.contractsSigned==null && other.getContractsSigned()==null) || 
             (this.contractsSigned!=null &&
              this.contractsSigned.equals(other.getContractsSigned()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.courier1__Recipients__r==null && other.getCourier1__Recipients__r()==null) || 
             (this.courier1__Recipients__r!=null &&
              this.courier1__Recipients__r.equals(other.getCourier1__Recipients__r()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.defaultGroupNotificationFrequency==null && other.getDefaultGroupNotificationFrequency()==null) || 
             (this.defaultGroupNotificationFrequency!=null &&
              this.defaultGroupNotificationFrequency.equals(other.getDefaultGroupNotificationFrequency()))) &&
            ((this.delegatedApproverId==null && other.getDelegatedApproverId()==null) || 
             (this.delegatedApproverId!=null &&
              this.delegatedApproverId.equals(other.getDelegatedApproverId()))) &&
            ((this.delegatedUsers==null && other.getDelegatedUsers()==null) || 
             (this.delegatedUsers!=null &&
              this.delegatedUsers.equals(other.getDelegatedUsers()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.development_Cases__r==null && other.getDevelopment_Cases__r()==null) || 
             (this.development_Cases__r!=null &&
              this.development_Cases__r.equals(other.getDevelopment_Cases__r()))) &&
            ((this.digestFrequency==null && other.getDigestFrequency()==null) || 
             (this.digestFrequency!=null &&
              this.digestFrequency.equals(other.getDigestFrequency()))) &&
            ((this.division==null && other.getDivision()==null) || 
             (this.division!=null &&
              this.division.equals(other.getDivision()))) &&
            ((this.dominu_Tasks1__r==null && other.getDominu_Tasks1__r()==null) || 
             (this.dominu_Tasks1__r!=null &&
              this.dominu_Tasks1__r.equals(other.getDominu_Tasks1__r()))) &&
            ((this.dominu_Tasks2__r==null && other.getDominu_Tasks2__r()==null) || 
             (this.dominu_Tasks2__r!=null &&
              this.dominu_Tasks2__r.equals(other.getDominu_Tasks2__r()))) &&
            ((this.dominu_Tasks__r==null && other.getDominu_Tasks__r()==null) || 
             (this.dominu_Tasks__r!=null &&
              this.dominu_Tasks__r.equals(other.getDominu_Tasks__r()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.emailEncodingKey==null && other.getEmailEncodingKey()==null) || 
             (this.emailEncodingKey!=null &&
              this.emailEncodingKey.equals(other.getEmailEncodingKey()))) &&
            ((this.employeeNumber==null && other.getEmployeeNumber()==null) || 
             (this.employeeNumber!=null &&
              this.employeeNumber.equals(other.getEmployeeNumber()))) &&
            ((this.eventRelations==null && other.getEventRelations()==null) || 
             (this.eventRelations!=null &&
              this.eventRelations.equals(other.getEventRelations()))) &&
            ((this.extension==null && other.getExtension()==null) || 
             (this.extension!=null &&
              this.extension.equals(other.getExtension()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.federationIdentifier==null && other.getFederationIdentifier()==null) || 
             (this.federationIdentifier!=null &&
              this.federationIdentifier.equals(other.getFederationIdentifier()))) &&
            ((this.feedSubscriptions==null && other.getFeedSubscriptions()==null) || 
             (this.feedSubscriptions!=null &&
              this.feedSubscriptions.equals(other.getFeedSubscriptions()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.feedbacks__r==null && other.getFeedbacks__r()==null) || 
             (this.feedbacks__r!=null &&
              this.feedbacks__r.equals(other.getFeedbacks__r()))) &&
            ((this.feeds==null && other.getFeeds()==null) || 
             (this.feeds!=null &&
              this.feeds.equals(other.getFeeds()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.forecastEnabled==null && other.getForecastEnabled()==null) || 
             (this.forecastEnabled!=null &&
              this.forecastEnabled.equals(other.getForecastEnabled()))) &&
            ((this.fullPhotoUrl==null && other.getFullPhotoUrl()==null) || 
             (this.fullPhotoUrl!=null &&
              this.fullPhotoUrl.equals(other.getFullPhotoUrl()))) &&
            ((this.instances__r==null && other.getInstances__r()==null) || 
             (this.instances__r!=null &&
              this.instances__r.equals(other.getInstances__r()))) &&
            ((this.isActive==null && other.getIsActive()==null) || 
             (this.isActive!=null &&
              this.isActive.equals(other.getIsActive()))) &&
            ((this.isPortalEnabled==null && other.getIsPortalEnabled()==null) || 
             (this.isPortalEnabled!=null &&
              this.isPortalEnabled.equals(other.getIsPortalEnabled()))) &&
            ((this.isPortalSelfRegistered==null && other.getIsPortalSelfRegistered()==null) || 
             (this.isPortalSelfRegistered!=null &&
              this.isPortalSelfRegistered.equals(other.getIsPortalSelfRegistered()))) &&
            ((this.languageLocaleKey==null && other.getLanguageLocaleKey()==null) || 
             (this.languageLocaleKey!=null &&
              this.languageLocaleKey.equals(other.getLanguageLocaleKey()))) &&
            ((this.lastLoginDate==null && other.getLastLoginDate()==null) || 
             (this.lastLoginDate!=null &&
              this.lastLoginDate.equals(other.getLastLoginDate()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.lastPasswordChangeDate==null && other.getLastPasswordChangeDate()==null) || 
             (this.lastPasswordChangeDate!=null &&
              this.lastPasswordChangeDate.equals(other.getLastPasswordChangeDate()))) &&
            ((this.localeSidKey==null && other.getLocaleSidKey()==null) || 
             (this.localeSidKey!=null &&
              this.localeSidKey.equals(other.getLocaleSidKey()))) &&
            ((this.manager==null && other.getManager()==null) || 
             (this.manager!=null &&
              this.manager.equals(other.getManager()))) &&
            ((this.managerId==null && other.getManagerId()==null) || 
             (this.managerId!=null &&
              this.managerId.equals(other.getManagerId()))) &&
            ((this.mobilePhone==null && other.getMobilePhone()==null) || 
             (this.mobilePhone!=null &&
              this.mobilePhone.equals(other.getMobilePhone()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.offlinePdaTrialExpirationDate==null && other.getOfflinePdaTrialExpirationDate()==null) || 
             (this.offlinePdaTrialExpirationDate!=null &&
              this.offlinePdaTrialExpirationDate.equals(other.getOfflinePdaTrialExpirationDate()))) &&
            ((this.offlineTrialExpirationDate==null && other.getOfflineTrialExpirationDate()==null) || 
             (this.offlineTrialExpirationDate!=null &&
              this.offlineTrialExpirationDate.equals(other.getOfflineTrialExpirationDate()))) &&
            ((this.partner_Kickoffs1__r==null && other.getPartner_Kickoffs1__r()==null) || 
             (this.partner_Kickoffs1__r!=null &&
              this.partner_Kickoffs1__r.equals(other.getPartner_Kickoffs1__r()))) &&
            ((this.partner_Kickoffs__r==null && other.getPartner_Kickoffs__r()==null) || 
             (this.partner_Kickoffs__r!=null &&
              this.partner_Kickoffs__r.equals(other.getPartner_Kickoffs__r()))) &&
            ((this.permissionSetAssignments==null && other.getPermissionSetAssignments()==null) || 
             (this.permissionSetAssignments!=null &&
              this.permissionSetAssignments.equals(other.getPermissionSetAssignments()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.portalRole==null && other.getPortalRole()==null) || 
             (this.portalRole!=null &&
              this.portalRole.equals(other.getPortalRole()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.profile==null && other.getProfile()==null) || 
             (this.profile!=null &&
              this.profile.equals(other.getProfile()))) &&
            ((this.profileId==null && other.getProfileId()==null) || 
             (this.profileId!=null &&
              this.profileId.equals(other.getProfileId()))) &&
            ((this.receivesAdminInfoEmails==null && other.getReceivesAdminInfoEmails()==null) || 
             (this.receivesAdminInfoEmails!=null &&
              this.receivesAdminInfoEmails.equals(other.getReceivesAdminInfoEmails()))) &&
            ((this.receivesInfoEmails==null && other.getReceivesInfoEmails()==null) || 
             (this.receivesInfoEmails!=null &&
              this.receivesInfoEmails.equals(other.getReceivesInfoEmails()))) &&
            ((this.regOnline__RegOnlineSessionID__c==null && other.getRegOnline__RegOnlineSessionID__c()==null) || 
             (this.regOnline__RegOnlineSessionID__c!=null &&
              this.regOnline__RegOnlineSessionID__c.equals(other.getRegOnline__RegOnlineSessionID__c()))) &&
            ((this.SFDC_Projects__r==null && other.getSFDC_Projects__r()==null) || 
             (this.SFDC_Projects__r!=null &&
              this.SFDC_Projects__r.equals(other.getSFDC_Projects__r()))) &&
            ((this.smallPhotoUrl==null && other.getSmallPhotoUrl()==null) || 
             (this.smallPhotoUrl!=null &&
              this.smallPhotoUrl.equals(other.getSmallPhotoUrl()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.status_Meeting_Attendees__r==null && other.getStatus_Meeting_Attendees__r()==null) || 
             (this.status_Meeting_Attendees__r!=null &&
              this.status_Meeting_Attendees__r.equals(other.getStatus_Meeting_Attendees__r()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.system_Changes1__r==null && other.getSystem_Changes1__r()==null) || 
             (this.system_Changes1__r!=null &&
              this.system_Changes1__r.equals(other.getSystem_Changes1__r()))) &&
            ((this.system_Changes2__r==null && other.getSystem_Changes2__r()==null) || 
             (this.system_Changes2__r!=null &&
              this.system_Changes2__r.equals(other.getSystem_Changes2__r()))) &&
            ((this.system_Changes__r==null && other.getSystem_Changes__r()==null) || 
             (this.system_Changes__r!=null &&
              this.system_Changes__r.equals(other.getSystem_Changes__r()))) &&
            ((this.tickets1__r==null && other.getTickets1__r()==null) || 
             (this.tickets1__r!=null &&
              this.tickets1__r.equals(other.getTickets1__r()))) &&
            ((this.tier_1_Cases__r==null && other.getTier_1_Cases__r()==null) || 
             (this.tier_1_Cases__r!=null &&
              this.tier_1_Cases__r.equals(other.getTier_1_Cases__r()))) &&
            ((this.tier_2_Cases__r==null && other.getTier_2_Cases__r()==null) || 
             (this.tier_2_Cases__r!=null &&
              this.tier_2_Cases__r.equals(other.getTier_2_Cases__r()))) &&
            ((this.timeZoneSidKey==null && other.getTimeZoneSidKey()==null) || 
             (this.timeZoneSidKey!=null &&
              this.timeZoneSidKey.equals(other.getTimeZoneSidKey()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.trainings1__r==null && other.getTrainings1__r()==null) || 
             (this.trainings1__r!=null &&
              this.trainings1__r.equals(other.getTrainings1__r()))) &&
            ((this.trainings2__r==null && other.getTrainings2__r()==null) || 
             (this.trainings2__r!=null &&
              this.trainings2__r.equals(other.getTrainings2__r()))) &&
            ((this.trainings3__r==null && other.getTrainings3__r()==null) || 
             (this.trainings3__r!=null &&
              this.trainings3__r.equals(other.getTrainings3__r()))) &&
            ((this.trainings__r==null && other.getTrainings__r()==null) || 
             (this.trainings__r!=null &&
              this.trainings__r.equals(other.getTrainings__r()))) &&
            ((this.userPermissionsAvantgoUser==null && other.getUserPermissionsAvantgoUser()==null) || 
             (this.userPermissionsAvantgoUser!=null &&
              this.userPermissionsAvantgoUser.equals(other.getUserPermissionsAvantgoUser()))) &&
            ((this.userPermissionsCallCenterAutoLogin==null && other.getUserPermissionsCallCenterAutoLogin()==null) || 
             (this.userPermissionsCallCenterAutoLogin!=null &&
              this.userPermissionsCallCenterAutoLogin.equals(other.getUserPermissionsCallCenterAutoLogin()))) &&
            ((this.userPermissionsInteractionUser==null && other.getUserPermissionsInteractionUser()==null) || 
             (this.userPermissionsInteractionUser!=null &&
              this.userPermissionsInteractionUser.equals(other.getUserPermissionsInteractionUser()))) &&
            ((this.userPermissionsKnowledgeUser==null && other.getUserPermissionsKnowledgeUser()==null) || 
             (this.userPermissionsKnowledgeUser!=null &&
              this.userPermissionsKnowledgeUser.equals(other.getUserPermissionsKnowledgeUser()))) &&
            ((this.userPermissionsMarketingUser==null && other.getUserPermissionsMarketingUser()==null) || 
             (this.userPermissionsMarketingUser!=null &&
              this.userPermissionsMarketingUser.equals(other.getUserPermissionsMarketingUser()))) &&
            ((this.userPermissionsMobileUser==null && other.getUserPermissionsMobileUser()==null) || 
             (this.userPermissionsMobileUser!=null &&
              this.userPermissionsMobileUser.equals(other.getUserPermissionsMobileUser()))) &&
            ((this.userPermissionsOfflineUser==null && other.getUserPermissionsOfflineUser()==null) || 
             (this.userPermissionsOfflineUser!=null &&
              this.userPermissionsOfflineUser.equals(other.getUserPermissionsOfflineUser()))) &&
            ((this.userPermissionsSFContentUser==null && other.getUserPermissionsSFContentUser()==null) || 
             (this.userPermissionsSFContentUser!=null &&
              this.userPermissionsSFContentUser.equals(other.getUserPermissionsSFContentUser()))) &&
            ((this.userPermissionsSupportUser==null && other.getUserPermissionsSupportUser()==null) || 
             (this.userPermissionsSupportUser!=null &&
              this.userPermissionsSupportUser.equals(other.getUserPermissionsSupportUser()))) &&
            ((this.userPreferences==null && other.getUserPreferences()==null) || 
             (this.userPreferences!=null &&
              this.userPreferences.equals(other.getUserPreferences()))) &&
            ((this.userPreferencesActivityRemindersPopup==null && other.getUserPreferencesActivityRemindersPopup()==null) || 
             (this.userPreferencesActivityRemindersPopup!=null &&
              this.userPreferencesActivityRemindersPopup.equals(other.getUserPreferencesActivityRemindersPopup()))) &&
            ((this.userPreferencesApexPagesDeveloperMode==null && other.getUserPreferencesApexPagesDeveloperMode()==null) || 
             (this.userPreferencesApexPagesDeveloperMode!=null &&
              this.userPreferencesApexPagesDeveloperMode.equals(other.getUserPreferencesApexPagesDeveloperMode()))) &&
            ((this.userPreferencesContentEmailAsAndWhen==null && other.getUserPreferencesContentEmailAsAndWhen()==null) || 
             (this.userPreferencesContentEmailAsAndWhen!=null &&
              this.userPreferencesContentEmailAsAndWhen.equals(other.getUserPreferencesContentEmailAsAndWhen()))) &&
            ((this.userPreferencesContentNoEmail==null && other.getUserPreferencesContentNoEmail()==null) || 
             (this.userPreferencesContentNoEmail!=null &&
              this.userPreferencesContentNoEmail.equals(other.getUserPreferencesContentNoEmail()))) &&
            ((this.userPreferencesDisCommentAfterLikeEmail==null && other.getUserPreferencesDisCommentAfterLikeEmail()==null) || 
             (this.userPreferencesDisCommentAfterLikeEmail!=null &&
              this.userPreferencesDisCommentAfterLikeEmail.equals(other.getUserPreferencesDisCommentAfterLikeEmail()))) &&
            ((this.userPreferencesDisMentionsCommentEmail==null && other.getUserPreferencesDisMentionsCommentEmail()==null) || 
             (this.userPreferencesDisMentionsCommentEmail!=null &&
              this.userPreferencesDisMentionsCommentEmail.equals(other.getUserPreferencesDisMentionsCommentEmail()))) &&
            ((this.userPreferencesDisProfPostCommentEmail==null && other.getUserPreferencesDisProfPostCommentEmail()==null) || 
             (this.userPreferencesDisProfPostCommentEmail!=null &&
              this.userPreferencesDisProfPostCommentEmail.equals(other.getUserPreferencesDisProfPostCommentEmail()))) &&
            ((this.userPreferencesDisableAllFeedsEmail==null && other.getUserPreferencesDisableAllFeedsEmail()==null) || 
             (this.userPreferencesDisableAllFeedsEmail!=null &&
              this.userPreferencesDisableAllFeedsEmail.equals(other.getUserPreferencesDisableAllFeedsEmail()))) &&
            ((this.userPreferencesDisableBookmarkEmail==null && other.getUserPreferencesDisableBookmarkEmail()==null) || 
             (this.userPreferencesDisableBookmarkEmail!=null &&
              this.userPreferencesDisableBookmarkEmail.equals(other.getUserPreferencesDisableBookmarkEmail()))) &&
            ((this.userPreferencesDisableChangeCommentEmail==null && other.getUserPreferencesDisableChangeCommentEmail()==null) || 
             (this.userPreferencesDisableChangeCommentEmail!=null &&
              this.userPreferencesDisableChangeCommentEmail.equals(other.getUserPreferencesDisableChangeCommentEmail()))) &&
            ((this.userPreferencesDisableFileShareNotificationsForApi==null && other.getUserPreferencesDisableFileShareNotificationsForApi()==null) || 
             (this.userPreferencesDisableFileShareNotificationsForApi!=null &&
              this.userPreferencesDisableFileShareNotificationsForApi.equals(other.getUserPreferencesDisableFileShareNotificationsForApi()))) &&
            ((this.userPreferencesDisableFollowersEmail==null && other.getUserPreferencesDisableFollowersEmail()==null) || 
             (this.userPreferencesDisableFollowersEmail!=null &&
              this.userPreferencesDisableFollowersEmail.equals(other.getUserPreferencesDisableFollowersEmail()))) &&
            ((this.userPreferencesDisableLaterCommentEmail==null && other.getUserPreferencesDisableLaterCommentEmail()==null) || 
             (this.userPreferencesDisableLaterCommentEmail!=null &&
              this.userPreferencesDisableLaterCommentEmail.equals(other.getUserPreferencesDisableLaterCommentEmail()))) &&
            ((this.userPreferencesDisableLikeEmail==null && other.getUserPreferencesDisableLikeEmail()==null) || 
             (this.userPreferencesDisableLikeEmail!=null &&
              this.userPreferencesDisableLikeEmail.equals(other.getUserPreferencesDisableLikeEmail()))) &&
            ((this.userPreferencesDisableMentionsPostEmail==null && other.getUserPreferencesDisableMentionsPostEmail()==null) || 
             (this.userPreferencesDisableMentionsPostEmail!=null &&
              this.userPreferencesDisableMentionsPostEmail.equals(other.getUserPreferencesDisableMentionsPostEmail()))) &&
            ((this.userPreferencesDisableMessageEmail==null && other.getUserPreferencesDisableMessageEmail()==null) || 
             (this.userPreferencesDisableMessageEmail!=null &&
              this.userPreferencesDisableMessageEmail.equals(other.getUserPreferencesDisableMessageEmail()))) &&
            ((this.userPreferencesDisableProfilePostEmail==null && other.getUserPreferencesDisableProfilePostEmail()==null) || 
             (this.userPreferencesDisableProfilePostEmail!=null &&
              this.userPreferencesDisableProfilePostEmail.equals(other.getUserPreferencesDisableProfilePostEmail()))) &&
            ((this.userPreferencesDisableSharePostEmail==null && other.getUserPreferencesDisableSharePostEmail()==null) || 
             (this.userPreferencesDisableSharePostEmail!=null &&
              this.userPreferencesDisableSharePostEmail.equals(other.getUserPreferencesDisableSharePostEmail()))) &&
            ((this.userPreferencesEnableAutoSubForFeeds==null && other.getUserPreferencesEnableAutoSubForFeeds()==null) || 
             (this.userPreferencesEnableAutoSubForFeeds!=null &&
              this.userPreferencesEnableAutoSubForFeeds.equals(other.getUserPreferencesEnableAutoSubForFeeds()))) &&
            ((this.userPreferencesEventRemindersCheckboxDefault==null && other.getUserPreferencesEventRemindersCheckboxDefault()==null) || 
             (this.userPreferencesEventRemindersCheckboxDefault!=null &&
              this.userPreferencesEventRemindersCheckboxDefault.equals(other.getUserPreferencesEventRemindersCheckboxDefault()))) &&
            ((this.userPreferencesHideCSNDesktopTask==null && other.getUserPreferencesHideCSNDesktopTask()==null) || 
             (this.userPreferencesHideCSNDesktopTask!=null &&
              this.userPreferencesHideCSNDesktopTask.equals(other.getUserPreferencesHideCSNDesktopTask()))) &&
            ((this.userPreferencesHideCSNGetChatterMobileTask==null && other.getUserPreferencesHideCSNGetChatterMobileTask()==null) || 
             (this.userPreferencesHideCSNGetChatterMobileTask!=null &&
              this.userPreferencesHideCSNGetChatterMobileTask.equals(other.getUserPreferencesHideCSNGetChatterMobileTask()))) &&
            ((this.userPreferencesOptOutOfTouch==null && other.getUserPreferencesOptOutOfTouch()==null) || 
             (this.userPreferencesOptOutOfTouch!=null &&
              this.userPreferencesOptOutOfTouch.equals(other.getUserPreferencesOptOutOfTouch()))) &&
            ((this.userPreferencesReminderSoundOff==null && other.getUserPreferencesReminderSoundOff()==null) || 
             (this.userPreferencesReminderSoundOff!=null &&
              this.userPreferencesReminderSoundOff.equals(other.getUserPreferencesReminderSoundOff()))) &&
            ((this.userPreferencesShowCityToExternalUsers==null && other.getUserPreferencesShowCityToExternalUsers()==null) || 
             (this.userPreferencesShowCityToExternalUsers!=null &&
              this.userPreferencesShowCityToExternalUsers.equals(other.getUserPreferencesShowCityToExternalUsers()))) &&
            ((this.userPreferencesShowCountryToExternalUsers==null && other.getUserPreferencesShowCountryToExternalUsers()==null) || 
             (this.userPreferencesShowCountryToExternalUsers!=null &&
              this.userPreferencesShowCountryToExternalUsers.equals(other.getUserPreferencesShowCountryToExternalUsers()))) &&
            ((this.userPreferencesShowEmailToExternalUsers==null && other.getUserPreferencesShowEmailToExternalUsers()==null) || 
             (this.userPreferencesShowEmailToExternalUsers!=null &&
              this.userPreferencesShowEmailToExternalUsers.equals(other.getUserPreferencesShowEmailToExternalUsers()))) &&
            ((this.userPreferencesShowFaxToExternalUsers==null && other.getUserPreferencesShowFaxToExternalUsers()==null) || 
             (this.userPreferencesShowFaxToExternalUsers!=null &&
              this.userPreferencesShowFaxToExternalUsers.equals(other.getUserPreferencesShowFaxToExternalUsers()))) &&
            ((this.userPreferencesShowManagerToExternalUsers==null && other.getUserPreferencesShowManagerToExternalUsers()==null) || 
             (this.userPreferencesShowManagerToExternalUsers!=null &&
              this.userPreferencesShowManagerToExternalUsers.equals(other.getUserPreferencesShowManagerToExternalUsers()))) &&
            ((this.userPreferencesShowMobilePhoneToExternalUsers==null && other.getUserPreferencesShowMobilePhoneToExternalUsers()==null) || 
             (this.userPreferencesShowMobilePhoneToExternalUsers!=null &&
              this.userPreferencesShowMobilePhoneToExternalUsers.equals(other.getUserPreferencesShowMobilePhoneToExternalUsers()))) &&
            ((this.userPreferencesShowPostalCodeToExternalUsers==null && other.getUserPreferencesShowPostalCodeToExternalUsers()==null) || 
             (this.userPreferencesShowPostalCodeToExternalUsers!=null &&
              this.userPreferencesShowPostalCodeToExternalUsers.equals(other.getUserPreferencesShowPostalCodeToExternalUsers()))) &&
            ((this.userPreferencesShowStateToExternalUsers==null && other.getUserPreferencesShowStateToExternalUsers()==null) || 
             (this.userPreferencesShowStateToExternalUsers!=null &&
              this.userPreferencesShowStateToExternalUsers.equals(other.getUserPreferencesShowStateToExternalUsers()))) &&
            ((this.userPreferencesShowStreetAddressToExternalUsers==null && other.getUserPreferencesShowStreetAddressToExternalUsers()==null) || 
             (this.userPreferencesShowStreetAddressToExternalUsers!=null &&
              this.userPreferencesShowStreetAddressToExternalUsers.equals(other.getUserPreferencesShowStreetAddressToExternalUsers()))) &&
            ((this.userPreferencesShowTitleToExternalUsers==null && other.getUserPreferencesShowTitleToExternalUsers()==null) || 
             (this.userPreferencesShowTitleToExternalUsers!=null &&
              this.userPreferencesShowTitleToExternalUsers.equals(other.getUserPreferencesShowTitleToExternalUsers()))) &&
            ((this.userPreferencesShowWorkPhoneToExternalUsers==null && other.getUserPreferencesShowWorkPhoneToExternalUsers()==null) || 
             (this.userPreferencesShowWorkPhoneToExternalUsers!=null &&
              this.userPreferencesShowWorkPhoneToExternalUsers.equals(other.getUserPreferencesShowWorkPhoneToExternalUsers()))) &&
            ((this.userPreferencesTaskRemindersCheckboxDefault==null && other.getUserPreferencesTaskRemindersCheckboxDefault()==null) || 
             (this.userPreferencesTaskRemindersCheckboxDefault!=null &&
              this.userPreferencesTaskRemindersCheckboxDefault.equals(other.getUserPreferencesTaskRemindersCheckboxDefault()))) &&
            ((this.userRole==null && other.getUserRole()==null) || 
             (this.userRole!=null &&
              this.userRole.equals(other.getUserRole()))) &&
            ((this.userRoleId==null && other.getUserRoleId()==null) || 
             (this.userRoleId!=null &&
              this.userRoleId.equals(other.getUserRoleId()))) &&
            ((this.userType==null && other.getUserType()==null) || 
             (this.userType!=null &&
              this.userType.equals(other.getUserType()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername())));
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
        if (getAboutMe() != null) {
            _hashCode += getAboutMe().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getAccounts__r() != null) {
            _hashCode += getAccounts__r().hashCode();
        }
        if (getAdmin_Certifications1__r() != null) {
            _hashCode += getAdmin_Certifications1__r().hashCode();
        }
        if (getAdmin_Certifications__r() != null) {
            _hashCode += getAdmin_Certifications__r().hashCode();
        }
        if (getAlias() != null) {
            _hashCode += getAlias().hashCode();
        }
        if (getAnalytic_Snapshots__r() != null) {
            _hashCode += getAnalytic_Snapshots__r().hashCode();
        }
        if (getArticle_and_Category_Reporting1__r() != null) {
            _hashCode += getArticle_and_Category_Reporting1__r().hashCode();
        }
        if (getArticle_and_Category_Reporting__r() != null) {
            _hashCode += getArticle_and_Category_Reporting__r().hashCode();
        }
        if (getCS_Management_Cases__r() != null) {
            _hashCode += getCS_Management_Cases__r().hashCode();
        }
        if (getCallCenterId() != null) {
            _hashCode += getCallCenterId().hashCode();
        }
        if (getCases1__r() != null) {
            _hashCode += getCases1__r().hashCode();
        }
        if (getCases__r() != null) {
            _hashCode += getCases__r().hashCode();
        }
        if (getChange_Control__r() != null) {
            _hashCode += getChange_Control__r().hashCode();
        }
        if (getChange_Controls1__r() != null) {
            _hashCode += getChange_Controls1__r().hashCode();
        }
        if (getChange_Controls__r() != null) {
            _hashCode += getChange_Controls__r().hashCode();
        }
        if (getChannel_Manager_Outlines1__r() != null) {
            _hashCode += getChannel_Manager_Outlines1__r().hashCode();
        }
        if (getChannel_Manager_Outlines__r() != null) {
            _hashCode += getChannel_Manager_Outlines__r().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getClient_Type__c() != null) {
            _hashCode += getClient_Type__c().hashCode();
        }
        if (getCommunityNickname() != null) {
            _hashCode += getCommunityNickname().hashCode();
        }
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getContactId() != null) {
            _hashCode += getContactId().hashCode();
        }
        if (getContent_Download_Notifications__r() != null) {
            _hashCode += getContent_Download_Notifications__r().hashCode();
        }
        if (getContractsSigned() != null) {
            _hashCode += getContractsSigned().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getCourier1__Recipients__r() != null) {
            _hashCode += getCourier1__Recipients__r().hashCode();
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
        if (getDefaultGroupNotificationFrequency() != null) {
            _hashCode += getDefaultGroupNotificationFrequency().hashCode();
        }
        if (getDelegatedApproverId() != null) {
            _hashCode += getDelegatedApproverId().hashCode();
        }
        if (getDelegatedUsers() != null) {
            _hashCode += getDelegatedUsers().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getDevelopment_Cases__r() != null) {
            _hashCode += getDevelopment_Cases__r().hashCode();
        }
        if (getDigestFrequency() != null) {
            _hashCode += getDigestFrequency().hashCode();
        }
        if (getDivision() != null) {
            _hashCode += getDivision().hashCode();
        }
        if (getDominu_Tasks1__r() != null) {
            _hashCode += getDominu_Tasks1__r().hashCode();
        }
        if (getDominu_Tasks2__r() != null) {
            _hashCode += getDominu_Tasks2__r().hashCode();
        }
        if (getDominu_Tasks__r() != null) {
            _hashCode += getDominu_Tasks__r().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getEmailEncodingKey() != null) {
            _hashCode += getEmailEncodingKey().hashCode();
        }
        if (getEmployeeNumber() != null) {
            _hashCode += getEmployeeNumber().hashCode();
        }
        if (getEventRelations() != null) {
            _hashCode += getEventRelations().hashCode();
        }
        if (getExtension() != null) {
            _hashCode += getExtension().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getFederationIdentifier() != null) {
            _hashCode += getFederationIdentifier().hashCode();
        }
        if (getFeedSubscriptions() != null) {
            _hashCode += getFeedSubscriptions().hashCode();
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
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getForecastEnabled() != null) {
            _hashCode += getForecastEnabled().hashCode();
        }
        if (getFullPhotoUrl() != null) {
            _hashCode += getFullPhotoUrl().hashCode();
        }
        if (getInstances__r() != null) {
            _hashCode += getInstances__r().hashCode();
        }
        if (getIsActive() != null) {
            _hashCode += getIsActive().hashCode();
        }
        if (getIsPortalEnabled() != null) {
            _hashCode += getIsPortalEnabled().hashCode();
        }
        if (getIsPortalSelfRegistered() != null) {
            _hashCode += getIsPortalSelfRegistered().hashCode();
        }
        if (getLanguageLocaleKey() != null) {
            _hashCode += getLanguageLocaleKey().hashCode();
        }
        if (getLastLoginDate() != null) {
            _hashCode += getLastLoginDate().hashCode();
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
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getLastPasswordChangeDate() != null) {
            _hashCode += getLastPasswordChangeDate().hashCode();
        }
        if (getLocaleSidKey() != null) {
            _hashCode += getLocaleSidKey().hashCode();
        }
        if (getManager() != null) {
            _hashCode += getManager().hashCode();
        }
        if (getManagerId() != null) {
            _hashCode += getManagerId().hashCode();
        }
        if (getMobilePhone() != null) {
            _hashCode += getMobilePhone().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOfflinePdaTrialExpirationDate() != null) {
            _hashCode += getOfflinePdaTrialExpirationDate().hashCode();
        }
        if (getOfflineTrialExpirationDate() != null) {
            _hashCode += getOfflineTrialExpirationDate().hashCode();
        }
        if (getPartner_Kickoffs1__r() != null) {
            _hashCode += getPartner_Kickoffs1__r().hashCode();
        }
        if (getPartner_Kickoffs__r() != null) {
            _hashCode += getPartner_Kickoffs__r().hashCode();
        }
        if (getPermissionSetAssignments() != null) {
            _hashCode += getPermissionSetAssignments().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getPortalRole() != null) {
            _hashCode += getPortalRole().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getProfile() != null) {
            _hashCode += getProfile().hashCode();
        }
        if (getProfileId() != null) {
            _hashCode += getProfileId().hashCode();
        }
        if (getReceivesAdminInfoEmails() != null) {
            _hashCode += getReceivesAdminInfoEmails().hashCode();
        }
        if (getReceivesInfoEmails() != null) {
            _hashCode += getReceivesInfoEmails().hashCode();
        }
        if (getRegOnline__RegOnlineSessionID__c() != null) {
            _hashCode += getRegOnline__RegOnlineSessionID__c().hashCode();
        }
        if (getSFDC_Projects__r() != null) {
            _hashCode += getSFDC_Projects__r().hashCode();
        }
        if (getSmallPhotoUrl() != null) {
            _hashCode += getSmallPhotoUrl().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getStatus_Meeting_Attendees__r() != null) {
            _hashCode += getStatus_Meeting_Attendees__r().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getSystem_Changes1__r() != null) {
            _hashCode += getSystem_Changes1__r().hashCode();
        }
        if (getSystem_Changes2__r() != null) {
            _hashCode += getSystem_Changes2__r().hashCode();
        }
        if (getSystem_Changes__r() != null) {
            _hashCode += getSystem_Changes__r().hashCode();
        }
        if (getTickets1__r() != null) {
            _hashCode += getTickets1__r().hashCode();
        }
        if (getTier_1_Cases__r() != null) {
            _hashCode += getTier_1_Cases__r().hashCode();
        }
        if (getTier_2_Cases__r() != null) {
            _hashCode += getTier_2_Cases__r().hashCode();
        }
        if (getTimeZoneSidKey() != null) {
            _hashCode += getTimeZoneSidKey().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getTrainings1__r() != null) {
            _hashCode += getTrainings1__r().hashCode();
        }
        if (getTrainings2__r() != null) {
            _hashCode += getTrainings2__r().hashCode();
        }
        if (getTrainings3__r() != null) {
            _hashCode += getTrainings3__r().hashCode();
        }
        if (getTrainings__r() != null) {
            _hashCode += getTrainings__r().hashCode();
        }
        if (getUserPermissionsAvantgoUser() != null) {
            _hashCode += getUserPermissionsAvantgoUser().hashCode();
        }
        if (getUserPermissionsCallCenterAutoLogin() != null) {
            _hashCode += getUserPermissionsCallCenterAutoLogin().hashCode();
        }
        if (getUserPermissionsInteractionUser() != null) {
            _hashCode += getUserPermissionsInteractionUser().hashCode();
        }
        if (getUserPermissionsKnowledgeUser() != null) {
            _hashCode += getUserPermissionsKnowledgeUser().hashCode();
        }
        if (getUserPermissionsMarketingUser() != null) {
            _hashCode += getUserPermissionsMarketingUser().hashCode();
        }
        if (getUserPermissionsMobileUser() != null) {
            _hashCode += getUserPermissionsMobileUser().hashCode();
        }
        if (getUserPermissionsOfflineUser() != null) {
            _hashCode += getUserPermissionsOfflineUser().hashCode();
        }
        if (getUserPermissionsSFContentUser() != null) {
            _hashCode += getUserPermissionsSFContentUser().hashCode();
        }
        if (getUserPermissionsSupportUser() != null) {
            _hashCode += getUserPermissionsSupportUser().hashCode();
        }
        if (getUserPreferences() != null) {
            _hashCode += getUserPreferences().hashCode();
        }
        if (getUserPreferencesActivityRemindersPopup() != null) {
            _hashCode += getUserPreferencesActivityRemindersPopup().hashCode();
        }
        if (getUserPreferencesApexPagesDeveloperMode() != null) {
            _hashCode += getUserPreferencesApexPagesDeveloperMode().hashCode();
        }
        if (getUserPreferencesContentEmailAsAndWhen() != null) {
            _hashCode += getUserPreferencesContentEmailAsAndWhen().hashCode();
        }
        if (getUserPreferencesContentNoEmail() != null) {
            _hashCode += getUserPreferencesContentNoEmail().hashCode();
        }
        if (getUserPreferencesDisCommentAfterLikeEmail() != null) {
            _hashCode += getUserPreferencesDisCommentAfterLikeEmail().hashCode();
        }
        if (getUserPreferencesDisMentionsCommentEmail() != null) {
            _hashCode += getUserPreferencesDisMentionsCommentEmail().hashCode();
        }
        if (getUserPreferencesDisProfPostCommentEmail() != null) {
            _hashCode += getUserPreferencesDisProfPostCommentEmail().hashCode();
        }
        if (getUserPreferencesDisableAllFeedsEmail() != null) {
            _hashCode += getUserPreferencesDisableAllFeedsEmail().hashCode();
        }
        if (getUserPreferencesDisableBookmarkEmail() != null) {
            _hashCode += getUserPreferencesDisableBookmarkEmail().hashCode();
        }
        if (getUserPreferencesDisableChangeCommentEmail() != null) {
            _hashCode += getUserPreferencesDisableChangeCommentEmail().hashCode();
        }
        if (getUserPreferencesDisableFileShareNotificationsForApi() != null) {
            _hashCode += getUserPreferencesDisableFileShareNotificationsForApi().hashCode();
        }
        if (getUserPreferencesDisableFollowersEmail() != null) {
            _hashCode += getUserPreferencesDisableFollowersEmail().hashCode();
        }
        if (getUserPreferencesDisableLaterCommentEmail() != null) {
            _hashCode += getUserPreferencesDisableLaterCommentEmail().hashCode();
        }
        if (getUserPreferencesDisableLikeEmail() != null) {
            _hashCode += getUserPreferencesDisableLikeEmail().hashCode();
        }
        if (getUserPreferencesDisableMentionsPostEmail() != null) {
            _hashCode += getUserPreferencesDisableMentionsPostEmail().hashCode();
        }
        if (getUserPreferencesDisableMessageEmail() != null) {
            _hashCode += getUserPreferencesDisableMessageEmail().hashCode();
        }
        if (getUserPreferencesDisableProfilePostEmail() != null) {
            _hashCode += getUserPreferencesDisableProfilePostEmail().hashCode();
        }
        if (getUserPreferencesDisableSharePostEmail() != null) {
            _hashCode += getUserPreferencesDisableSharePostEmail().hashCode();
        }
        if (getUserPreferencesEnableAutoSubForFeeds() != null) {
            _hashCode += getUserPreferencesEnableAutoSubForFeeds().hashCode();
        }
        if (getUserPreferencesEventRemindersCheckboxDefault() != null) {
            _hashCode += getUserPreferencesEventRemindersCheckboxDefault().hashCode();
        }
        if (getUserPreferencesHideCSNDesktopTask() != null) {
            _hashCode += getUserPreferencesHideCSNDesktopTask().hashCode();
        }
        if (getUserPreferencesHideCSNGetChatterMobileTask() != null) {
            _hashCode += getUserPreferencesHideCSNGetChatterMobileTask().hashCode();
        }
        if (getUserPreferencesOptOutOfTouch() != null) {
            _hashCode += getUserPreferencesOptOutOfTouch().hashCode();
        }
        if (getUserPreferencesReminderSoundOff() != null) {
            _hashCode += getUserPreferencesReminderSoundOff().hashCode();
        }
        if (getUserPreferencesShowCityToExternalUsers() != null) {
            _hashCode += getUserPreferencesShowCityToExternalUsers().hashCode();
        }
        if (getUserPreferencesShowCountryToExternalUsers() != null) {
            _hashCode += getUserPreferencesShowCountryToExternalUsers().hashCode();
        }
        if (getUserPreferencesShowEmailToExternalUsers() != null) {
            _hashCode += getUserPreferencesShowEmailToExternalUsers().hashCode();
        }
        if (getUserPreferencesShowFaxToExternalUsers() != null) {
            _hashCode += getUserPreferencesShowFaxToExternalUsers().hashCode();
        }
        if (getUserPreferencesShowManagerToExternalUsers() != null) {
            _hashCode += getUserPreferencesShowManagerToExternalUsers().hashCode();
        }
        if (getUserPreferencesShowMobilePhoneToExternalUsers() != null) {
            _hashCode += getUserPreferencesShowMobilePhoneToExternalUsers().hashCode();
        }
        if (getUserPreferencesShowPostalCodeToExternalUsers() != null) {
            _hashCode += getUserPreferencesShowPostalCodeToExternalUsers().hashCode();
        }
        if (getUserPreferencesShowStateToExternalUsers() != null) {
            _hashCode += getUserPreferencesShowStateToExternalUsers().hashCode();
        }
        if (getUserPreferencesShowStreetAddressToExternalUsers() != null) {
            _hashCode += getUserPreferencesShowStreetAddressToExternalUsers().hashCode();
        }
        if (getUserPreferencesShowTitleToExternalUsers() != null) {
            _hashCode += getUserPreferencesShowTitleToExternalUsers().hashCode();
        }
        if (getUserPreferencesShowWorkPhoneToExternalUsers() != null) {
            _hashCode += getUserPreferencesShowWorkPhoneToExternalUsers().hashCode();
        }
        if (getUserPreferencesTaskRemindersCheckboxDefault() != null) {
            _hashCode += getUserPreferencesTaskRemindersCheckboxDefault().hashCode();
        }
        if (getUserRole() != null) {
            _hashCode += getUserRole().hashCode();
        }
        if (getUserRoleId() != null) {
            _hashCode += getUserRoleId().hashCode();
        }
        if (getUserType() != null) {
            _hashCode += getUserType().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(User.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aboutMe");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AboutMe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("accounts__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Accounts__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("admin_Certifications1__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Admin_Certifications1__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("admin_Certifications__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Admin_Certifications__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alias");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("analytic_Snapshots__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Analytic_Snapshots__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("article_and_Category_Reporting1__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Article_and_Category_Reporting1__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("article_and_Category_Reporting__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Article_and_Category_Reporting__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CS_Management_Cases__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CS_Management_Cases__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callCenterId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CallCenterId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cases1__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Cases1__r"));
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
        elemField.setFieldName("change_Control__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Change_Control__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("change_Controls1__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Change_Controls1__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("change_Controls__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Change_Controls__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel_Manager_Outlines1__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Channel_Manager_Outlines1__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel_Manager_Outlines__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Channel_Manager_Outlines__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "City"));
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
        elemField.setFieldName("communityNickname");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CommunityNickname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CompanyName"));
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
        elemField.setFieldName("content_Download_Notifications__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Content_Download_Notifications__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractsSigned");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContractsSigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courier1__Recipients__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Recipients__r"));
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
        elemField.setFieldName("defaultGroupNotificationFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DefaultGroupNotificationFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delegatedApproverId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DelegatedApproverId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delegatedUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DelegatedUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Department"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("development_Cases__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Development_Cases__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digestFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DigestFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("division");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Division"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dominu_Tasks1__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dominu_Tasks1__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dominu_Tasks2__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dominu_Tasks2__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dominu_Tasks__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dominu_Tasks__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailEncodingKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailEncodingKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmployeeNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventRelations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EventRelations"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extension");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Extension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("federationIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FederationIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedSubscriptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedSubscriptions"));
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
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forecastEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ForecastEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullPhotoUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FullPhotoUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instances__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Instances__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isActive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPortalEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsPortalEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPortalSelfRegistered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsPortalSelfRegistered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageLocaleKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LanguageLocaleKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastLoginDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastLoginDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPasswordChangeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastPasswordChangeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localeSidKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LocaleSidKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Manager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managerId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ManagerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobilePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MobilePhone"));
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
        elemField.setFieldName("offlinePdaTrialExpirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OfflinePdaTrialExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offlineTrialExpirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OfflineTrialExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partner_Kickoffs1__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Partner_Kickoffs1__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("permissionSetAssignments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionSetAssignments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portalRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PortalRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Profile"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Profile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivesAdminInfoEmails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ReceivesAdminInfoEmails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivesInfoEmails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ReceivesInfoEmails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regOnline__RegOnlineSessionID__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RegOnline__RegOnlineSessionID__c"));
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
        elemField.setFieldName("smallPhotoUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SmallPhotoUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status_Meeting_Attendees__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status_Meeting_Attendees__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Street"));
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
        elemField.setFieldName("system_Changes1__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "System_Changes1__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("system_Changes2__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "System_Changes2__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("system_Changes__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "System_Changes__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tickets1__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tickets1__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tier_1_Cases__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tier_1_Cases__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tier_2_Cases__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tier_2_Cases__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZoneSidKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TimeZoneSidKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trainings1__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Trainings1__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trainings2__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Trainings2__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trainings3__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Trainings3__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trainings__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Trainings__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPermissionsAvantgoUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPermissionsAvantgoUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPermissionsCallCenterAutoLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPermissionsCallCenterAutoLogin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPermissionsInteractionUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPermissionsInteractionUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPermissionsKnowledgeUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPermissionsKnowledgeUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPermissionsMarketingUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPermissionsMarketingUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPermissionsMobileUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPermissionsMobileUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPermissionsOfflineUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPermissionsOfflineUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPermissionsSFContentUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPermissionsSFContentUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPermissionsSupportUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPermissionsSupportUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferences");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesActivityRemindersPopup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesActivityRemindersPopup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesApexPagesDeveloperMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesApexPagesDeveloperMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesContentEmailAsAndWhen");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesContentEmailAsAndWhen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesContentNoEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesContentNoEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesDisCommentAfterLikeEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesDisCommentAfterLikeEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesDisMentionsCommentEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesDisMentionsCommentEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesDisProfPostCommentEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesDisProfPostCommentEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesDisableAllFeedsEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesDisableAllFeedsEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesDisableBookmarkEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesDisableBookmarkEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesDisableChangeCommentEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesDisableChangeCommentEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesDisableFileShareNotificationsForApi");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesDisableFileShareNotificationsForApi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesDisableFollowersEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesDisableFollowersEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesDisableLaterCommentEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesDisableLaterCommentEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesDisableLikeEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesDisableLikeEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesDisableMentionsPostEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesDisableMentionsPostEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesDisableMessageEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesDisableMessageEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesDisableProfilePostEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesDisableProfilePostEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesDisableSharePostEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesDisableSharePostEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesEnableAutoSubForFeeds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesEnableAutoSubForFeeds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesEventRemindersCheckboxDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesEventRemindersCheckboxDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesHideCSNDesktopTask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesHideCSNDesktopTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesHideCSNGetChatterMobileTask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesHideCSNGetChatterMobileTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesOptOutOfTouch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesOptOutOfTouch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesReminderSoundOff");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesReminderSoundOff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesShowCityToExternalUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesShowCityToExternalUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesShowCountryToExternalUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesShowCountryToExternalUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesShowEmailToExternalUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesShowEmailToExternalUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesShowFaxToExternalUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesShowFaxToExternalUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesShowManagerToExternalUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesShowManagerToExternalUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesShowMobilePhoneToExternalUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesShowMobilePhoneToExternalUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesShowPostalCodeToExternalUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesShowPostalCodeToExternalUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesShowStateToExternalUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesShowStateToExternalUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesShowStreetAddressToExternalUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesShowStreetAddressToExternalUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesShowTitleToExternalUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesShowTitleToExternalUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesShowWorkPhoneToExternalUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesShowWorkPhoneToExternalUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesTaskRemindersCheckboxDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesTaskRemindersCheckboxDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserRole"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userRoleId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserRoleId"));
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
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Username"));
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

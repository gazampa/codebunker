/**
 * IdeasSiteSetup__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class IdeasSiteSetup__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String aboutBannerImageUrl__c;

    private java.lang.String aboutBody__c;

    private java.lang.String aboutHeading__c;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.Double cacheMaxAge__c;

    private java.lang.String categories__c;

    private java.lang.String communityId__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String customCssUrl__c;

    private java.lang.String expertsGroupId__c;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.lang.String footerText__c;

    private java.lang.String forgotPasswordBody__c;

    private java.lang.String forgotPasswordHeading__c;

    private java.lang.String homeBannerImageUrl__c;

    private java.lang.String homeBody1__c;

    private java.lang.String homeBody2__c;

    private java.lang.String homeBody3__c;

    private java.lang.String homeBody4__c;

    private java.lang.String homeBody5__c;

    private java.lang.String homeHeading1__c;

    private java.lang.String homeHeading2__c;

    private java.lang.String homeHeading3__c;

    private java.lang.String homeHeading4__c;

    private java.lang.String homeHeading5__c;

    private java.lang.String homeRecentIdeasHeading__c;

    private java.lang.Boolean isDeleted;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String loginBody__c;

    private java.lang.String loginHeading__c;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private java.lang.String overrideIdeaAbout__c;

    private java.lang.String overrideIdeaAccountDetails__c;

    private java.lang.String overrideIdeaForgotPasswordConfirm__c;

    private java.lang.String overrideIdeaForgotPassword__c;

    private java.lang.String overrideIdeaHome__c;

    private java.lang.String overrideIdeaLayout__c;

    private java.lang.String overrideIdeaList__c;

    private java.lang.String overrideIdeaPost__c;

    private java.lang.String overrideIdeaProfileActivity__c;

    private java.lang.String overrideIdeaProfileList__c;

    private java.lang.String overrideIdeaSearchResults__c;

    private java.lang.String overrideIdeaSiteLogin__c;

    private java.lang.String overrideIdeaSiteRegister__c;

    private java.lang.String overrideIdeaView__c;

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private java.lang.String portalAccount__c;

    private com.sforce.soap.enterprise.sobject.Account portalAccount__r;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.String products__c;

    private java.lang.String registerBody__c;

    private java.lang.String registerHeading__c;

    private java.lang.String statuses__c;

    private java.util.Calendar systemModstamp;

    public IdeasSiteSetup__c() {
    }

    public IdeasSiteSetup__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String aboutBannerImageUrl__c,
           java.lang.String aboutBody__c,
           java.lang.String aboutHeading__c,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.Double cacheMaxAge__c,
           java.lang.String categories__c,
           java.lang.String communityId__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String customCssUrl__c,
           java.lang.String expertsGroupId__c,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.lang.String footerText__c,
           java.lang.String forgotPasswordBody__c,
           java.lang.String forgotPasswordHeading__c,
           java.lang.String homeBannerImageUrl__c,
           java.lang.String homeBody1__c,
           java.lang.String homeBody2__c,
           java.lang.String homeBody3__c,
           java.lang.String homeBody4__c,
           java.lang.String homeBody5__c,
           java.lang.String homeHeading1__c,
           java.lang.String homeHeading2__c,
           java.lang.String homeHeading3__c,
           java.lang.String homeHeading4__c,
           java.lang.String homeHeading5__c,
           java.lang.String homeRecentIdeasHeading__c,
           java.lang.Boolean isDeleted,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String loginBody__c,
           java.lang.String loginHeading__c,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           java.lang.String overrideIdeaAbout__c,
           java.lang.String overrideIdeaAccountDetails__c,
           java.lang.String overrideIdeaForgotPasswordConfirm__c,
           java.lang.String overrideIdeaForgotPassword__c,
           java.lang.String overrideIdeaHome__c,
           java.lang.String overrideIdeaLayout__c,
           java.lang.String overrideIdeaList__c,
           java.lang.String overrideIdeaPost__c,
           java.lang.String overrideIdeaProfileActivity__c,
           java.lang.String overrideIdeaProfileList__c,
           java.lang.String overrideIdeaSearchResults__c,
           java.lang.String overrideIdeaSiteLogin__c,
           java.lang.String overrideIdeaSiteRegister__c,
           java.lang.String overrideIdeaView__c,
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           java.lang.String portalAccount__c,
           com.sforce.soap.enterprise.sobject.Account portalAccount__r,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.String products__c,
           java.lang.String registerBody__c,
           java.lang.String registerHeading__c,
           java.lang.String statuses__c,
           java.util.Calendar systemModstamp) {
        super(
            fieldsToNull,
            id);
        this.aboutBannerImageUrl__c = aboutBannerImageUrl__c;
        this.aboutBody__c = aboutBody__c;
        this.aboutHeading__c = aboutHeading__c;
        this.attachments = attachments;
        this.cacheMaxAge__c = cacheMaxAge__c;
        this.categories__c = categories__c;
        this.communityId__c = communityId__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.customCssUrl__c = customCssUrl__c;
        this.expertsGroupId__c = expertsGroupId__c;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.footerText__c = footerText__c;
        this.forgotPasswordBody__c = forgotPasswordBody__c;
        this.forgotPasswordHeading__c = forgotPasswordHeading__c;
        this.homeBannerImageUrl__c = homeBannerImageUrl__c;
        this.homeBody1__c = homeBody1__c;
        this.homeBody2__c = homeBody2__c;
        this.homeBody3__c = homeBody3__c;
        this.homeBody4__c = homeBody4__c;
        this.homeBody5__c = homeBody5__c;
        this.homeHeading1__c = homeHeading1__c;
        this.homeHeading2__c = homeHeading2__c;
        this.homeHeading3__c = homeHeading3__c;
        this.homeHeading4__c = homeHeading4__c;
        this.homeHeading5__c = homeHeading5__c;
        this.homeRecentIdeasHeading__c = homeRecentIdeasHeading__c;
        this.isDeleted = isDeleted;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.loginBody__c = loginBody__c;
        this.loginHeading__c = loginHeading__c;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.overrideIdeaAbout__c = overrideIdeaAbout__c;
        this.overrideIdeaAccountDetails__c = overrideIdeaAccountDetails__c;
        this.overrideIdeaForgotPasswordConfirm__c = overrideIdeaForgotPasswordConfirm__c;
        this.overrideIdeaForgotPassword__c = overrideIdeaForgotPassword__c;
        this.overrideIdeaHome__c = overrideIdeaHome__c;
        this.overrideIdeaLayout__c = overrideIdeaLayout__c;
        this.overrideIdeaList__c = overrideIdeaList__c;
        this.overrideIdeaPost__c = overrideIdeaPost__c;
        this.overrideIdeaProfileActivity__c = overrideIdeaProfileActivity__c;
        this.overrideIdeaProfileList__c = overrideIdeaProfileList__c;
        this.overrideIdeaSearchResults__c = overrideIdeaSearchResults__c;
        this.overrideIdeaSiteLogin__c = overrideIdeaSiteLogin__c;
        this.overrideIdeaSiteRegister__c = overrideIdeaSiteRegister__c;
        this.overrideIdeaView__c = overrideIdeaView__c;
        this.owner = owner;
        this.ownerId = ownerId;
        this.portalAccount__c = portalAccount__c;
        this.portalAccount__r = portalAccount__r;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.products__c = products__c;
        this.registerBody__c = registerBody__c;
        this.registerHeading__c = registerHeading__c;
        this.statuses__c = statuses__c;
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the aboutBannerImageUrl__c value for this IdeasSiteSetup__c.
     * 
     * @return aboutBannerImageUrl__c
     */
    public java.lang.String getAboutBannerImageUrl__c() {
        return aboutBannerImageUrl__c;
    }


    /**
     * Sets the aboutBannerImageUrl__c value for this IdeasSiteSetup__c.
     * 
     * @param aboutBannerImageUrl__c
     */
    public void setAboutBannerImageUrl__c(java.lang.String aboutBannerImageUrl__c) {
        this.aboutBannerImageUrl__c = aboutBannerImageUrl__c;
    }


    /**
     * Gets the aboutBody__c value for this IdeasSiteSetup__c.
     * 
     * @return aboutBody__c
     */
    public java.lang.String getAboutBody__c() {
        return aboutBody__c;
    }


    /**
     * Sets the aboutBody__c value for this IdeasSiteSetup__c.
     * 
     * @param aboutBody__c
     */
    public void setAboutBody__c(java.lang.String aboutBody__c) {
        this.aboutBody__c = aboutBody__c;
    }


    /**
     * Gets the aboutHeading__c value for this IdeasSiteSetup__c.
     * 
     * @return aboutHeading__c
     */
    public java.lang.String getAboutHeading__c() {
        return aboutHeading__c;
    }


    /**
     * Sets the aboutHeading__c value for this IdeasSiteSetup__c.
     * 
     * @param aboutHeading__c
     */
    public void setAboutHeading__c(java.lang.String aboutHeading__c) {
        this.aboutHeading__c = aboutHeading__c;
    }


    /**
     * Gets the attachments value for this IdeasSiteSetup__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this IdeasSiteSetup__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the cacheMaxAge__c value for this IdeasSiteSetup__c.
     * 
     * @return cacheMaxAge__c
     */
    public java.lang.Double getCacheMaxAge__c() {
        return cacheMaxAge__c;
    }


    /**
     * Sets the cacheMaxAge__c value for this IdeasSiteSetup__c.
     * 
     * @param cacheMaxAge__c
     */
    public void setCacheMaxAge__c(java.lang.Double cacheMaxAge__c) {
        this.cacheMaxAge__c = cacheMaxAge__c;
    }


    /**
     * Gets the categories__c value for this IdeasSiteSetup__c.
     * 
     * @return categories__c
     */
    public java.lang.String getCategories__c() {
        return categories__c;
    }


    /**
     * Sets the categories__c value for this IdeasSiteSetup__c.
     * 
     * @param categories__c
     */
    public void setCategories__c(java.lang.String categories__c) {
        this.categories__c = categories__c;
    }


    /**
     * Gets the communityId__c value for this IdeasSiteSetup__c.
     * 
     * @return communityId__c
     */
    public java.lang.String getCommunityId__c() {
        return communityId__c;
    }


    /**
     * Sets the communityId__c value for this IdeasSiteSetup__c.
     * 
     * @param communityId__c
     */
    public void setCommunityId__c(java.lang.String communityId__c) {
        this.communityId__c = communityId__c;
    }


    /**
     * Gets the createdBy value for this IdeasSiteSetup__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this IdeasSiteSetup__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this IdeasSiteSetup__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this IdeasSiteSetup__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this IdeasSiteSetup__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this IdeasSiteSetup__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the customCssUrl__c value for this IdeasSiteSetup__c.
     * 
     * @return customCssUrl__c
     */
    public java.lang.String getCustomCssUrl__c() {
        return customCssUrl__c;
    }


    /**
     * Sets the customCssUrl__c value for this IdeasSiteSetup__c.
     * 
     * @param customCssUrl__c
     */
    public void setCustomCssUrl__c(java.lang.String customCssUrl__c) {
        this.customCssUrl__c = customCssUrl__c;
    }


    /**
     * Gets the expertsGroupId__c value for this IdeasSiteSetup__c.
     * 
     * @return expertsGroupId__c
     */
    public java.lang.String getExpertsGroupId__c() {
        return expertsGroupId__c;
    }


    /**
     * Sets the expertsGroupId__c value for this IdeasSiteSetup__c.
     * 
     * @param expertsGroupId__c
     */
    public void setExpertsGroupId__c(java.lang.String expertsGroupId__c) {
        this.expertsGroupId__c = expertsGroupId__c;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this IdeasSiteSetup__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this IdeasSiteSetup__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the footerText__c value for this IdeasSiteSetup__c.
     * 
     * @return footerText__c
     */
    public java.lang.String getFooterText__c() {
        return footerText__c;
    }


    /**
     * Sets the footerText__c value for this IdeasSiteSetup__c.
     * 
     * @param footerText__c
     */
    public void setFooterText__c(java.lang.String footerText__c) {
        this.footerText__c = footerText__c;
    }


    /**
     * Gets the forgotPasswordBody__c value for this IdeasSiteSetup__c.
     * 
     * @return forgotPasswordBody__c
     */
    public java.lang.String getForgotPasswordBody__c() {
        return forgotPasswordBody__c;
    }


    /**
     * Sets the forgotPasswordBody__c value for this IdeasSiteSetup__c.
     * 
     * @param forgotPasswordBody__c
     */
    public void setForgotPasswordBody__c(java.lang.String forgotPasswordBody__c) {
        this.forgotPasswordBody__c = forgotPasswordBody__c;
    }


    /**
     * Gets the forgotPasswordHeading__c value for this IdeasSiteSetup__c.
     * 
     * @return forgotPasswordHeading__c
     */
    public java.lang.String getForgotPasswordHeading__c() {
        return forgotPasswordHeading__c;
    }


    /**
     * Sets the forgotPasswordHeading__c value for this IdeasSiteSetup__c.
     * 
     * @param forgotPasswordHeading__c
     */
    public void setForgotPasswordHeading__c(java.lang.String forgotPasswordHeading__c) {
        this.forgotPasswordHeading__c = forgotPasswordHeading__c;
    }


    /**
     * Gets the homeBannerImageUrl__c value for this IdeasSiteSetup__c.
     * 
     * @return homeBannerImageUrl__c
     */
    public java.lang.String getHomeBannerImageUrl__c() {
        return homeBannerImageUrl__c;
    }


    /**
     * Sets the homeBannerImageUrl__c value for this IdeasSiteSetup__c.
     * 
     * @param homeBannerImageUrl__c
     */
    public void setHomeBannerImageUrl__c(java.lang.String homeBannerImageUrl__c) {
        this.homeBannerImageUrl__c = homeBannerImageUrl__c;
    }


    /**
     * Gets the homeBody1__c value for this IdeasSiteSetup__c.
     * 
     * @return homeBody1__c
     */
    public java.lang.String getHomeBody1__c() {
        return homeBody1__c;
    }


    /**
     * Sets the homeBody1__c value for this IdeasSiteSetup__c.
     * 
     * @param homeBody1__c
     */
    public void setHomeBody1__c(java.lang.String homeBody1__c) {
        this.homeBody1__c = homeBody1__c;
    }


    /**
     * Gets the homeBody2__c value for this IdeasSiteSetup__c.
     * 
     * @return homeBody2__c
     */
    public java.lang.String getHomeBody2__c() {
        return homeBody2__c;
    }


    /**
     * Sets the homeBody2__c value for this IdeasSiteSetup__c.
     * 
     * @param homeBody2__c
     */
    public void setHomeBody2__c(java.lang.String homeBody2__c) {
        this.homeBody2__c = homeBody2__c;
    }


    /**
     * Gets the homeBody3__c value for this IdeasSiteSetup__c.
     * 
     * @return homeBody3__c
     */
    public java.lang.String getHomeBody3__c() {
        return homeBody3__c;
    }


    /**
     * Sets the homeBody3__c value for this IdeasSiteSetup__c.
     * 
     * @param homeBody3__c
     */
    public void setHomeBody3__c(java.lang.String homeBody3__c) {
        this.homeBody3__c = homeBody3__c;
    }


    /**
     * Gets the homeBody4__c value for this IdeasSiteSetup__c.
     * 
     * @return homeBody4__c
     */
    public java.lang.String getHomeBody4__c() {
        return homeBody4__c;
    }


    /**
     * Sets the homeBody4__c value for this IdeasSiteSetup__c.
     * 
     * @param homeBody4__c
     */
    public void setHomeBody4__c(java.lang.String homeBody4__c) {
        this.homeBody4__c = homeBody4__c;
    }


    /**
     * Gets the homeBody5__c value for this IdeasSiteSetup__c.
     * 
     * @return homeBody5__c
     */
    public java.lang.String getHomeBody5__c() {
        return homeBody5__c;
    }


    /**
     * Sets the homeBody5__c value for this IdeasSiteSetup__c.
     * 
     * @param homeBody5__c
     */
    public void setHomeBody5__c(java.lang.String homeBody5__c) {
        this.homeBody5__c = homeBody5__c;
    }


    /**
     * Gets the homeHeading1__c value for this IdeasSiteSetup__c.
     * 
     * @return homeHeading1__c
     */
    public java.lang.String getHomeHeading1__c() {
        return homeHeading1__c;
    }


    /**
     * Sets the homeHeading1__c value for this IdeasSiteSetup__c.
     * 
     * @param homeHeading1__c
     */
    public void setHomeHeading1__c(java.lang.String homeHeading1__c) {
        this.homeHeading1__c = homeHeading1__c;
    }


    /**
     * Gets the homeHeading2__c value for this IdeasSiteSetup__c.
     * 
     * @return homeHeading2__c
     */
    public java.lang.String getHomeHeading2__c() {
        return homeHeading2__c;
    }


    /**
     * Sets the homeHeading2__c value for this IdeasSiteSetup__c.
     * 
     * @param homeHeading2__c
     */
    public void setHomeHeading2__c(java.lang.String homeHeading2__c) {
        this.homeHeading2__c = homeHeading2__c;
    }


    /**
     * Gets the homeHeading3__c value for this IdeasSiteSetup__c.
     * 
     * @return homeHeading3__c
     */
    public java.lang.String getHomeHeading3__c() {
        return homeHeading3__c;
    }


    /**
     * Sets the homeHeading3__c value for this IdeasSiteSetup__c.
     * 
     * @param homeHeading3__c
     */
    public void setHomeHeading3__c(java.lang.String homeHeading3__c) {
        this.homeHeading3__c = homeHeading3__c;
    }


    /**
     * Gets the homeHeading4__c value for this IdeasSiteSetup__c.
     * 
     * @return homeHeading4__c
     */
    public java.lang.String getHomeHeading4__c() {
        return homeHeading4__c;
    }


    /**
     * Sets the homeHeading4__c value for this IdeasSiteSetup__c.
     * 
     * @param homeHeading4__c
     */
    public void setHomeHeading4__c(java.lang.String homeHeading4__c) {
        this.homeHeading4__c = homeHeading4__c;
    }


    /**
     * Gets the homeHeading5__c value for this IdeasSiteSetup__c.
     * 
     * @return homeHeading5__c
     */
    public java.lang.String getHomeHeading5__c() {
        return homeHeading5__c;
    }


    /**
     * Sets the homeHeading5__c value for this IdeasSiteSetup__c.
     * 
     * @param homeHeading5__c
     */
    public void setHomeHeading5__c(java.lang.String homeHeading5__c) {
        this.homeHeading5__c = homeHeading5__c;
    }


    /**
     * Gets the homeRecentIdeasHeading__c value for this IdeasSiteSetup__c.
     * 
     * @return homeRecentIdeasHeading__c
     */
    public java.lang.String getHomeRecentIdeasHeading__c() {
        return homeRecentIdeasHeading__c;
    }


    /**
     * Sets the homeRecentIdeasHeading__c value for this IdeasSiteSetup__c.
     * 
     * @param homeRecentIdeasHeading__c
     */
    public void setHomeRecentIdeasHeading__c(java.lang.String homeRecentIdeasHeading__c) {
        this.homeRecentIdeasHeading__c = homeRecentIdeasHeading__c;
    }


    /**
     * Gets the isDeleted value for this IdeasSiteSetup__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this IdeasSiteSetup__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this IdeasSiteSetup__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this IdeasSiteSetup__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this IdeasSiteSetup__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this IdeasSiteSetup__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this IdeasSiteSetup__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this IdeasSiteSetup__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the loginBody__c value for this IdeasSiteSetup__c.
     * 
     * @return loginBody__c
     */
    public java.lang.String getLoginBody__c() {
        return loginBody__c;
    }


    /**
     * Sets the loginBody__c value for this IdeasSiteSetup__c.
     * 
     * @param loginBody__c
     */
    public void setLoginBody__c(java.lang.String loginBody__c) {
        this.loginBody__c = loginBody__c;
    }


    /**
     * Gets the loginHeading__c value for this IdeasSiteSetup__c.
     * 
     * @return loginHeading__c
     */
    public java.lang.String getLoginHeading__c() {
        return loginHeading__c;
    }


    /**
     * Sets the loginHeading__c value for this IdeasSiteSetup__c.
     * 
     * @param loginHeading__c
     */
    public void setLoginHeading__c(java.lang.String loginHeading__c) {
        this.loginHeading__c = loginHeading__c;
    }


    /**
     * Gets the name value for this IdeasSiteSetup__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this IdeasSiteSetup__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this IdeasSiteSetup__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this IdeasSiteSetup__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this IdeasSiteSetup__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this IdeasSiteSetup__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the overrideIdeaAbout__c value for this IdeasSiteSetup__c.
     * 
     * @return overrideIdeaAbout__c
     */
    public java.lang.String getOverrideIdeaAbout__c() {
        return overrideIdeaAbout__c;
    }


    /**
     * Sets the overrideIdeaAbout__c value for this IdeasSiteSetup__c.
     * 
     * @param overrideIdeaAbout__c
     */
    public void setOverrideIdeaAbout__c(java.lang.String overrideIdeaAbout__c) {
        this.overrideIdeaAbout__c = overrideIdeaAbout__c;
    }


    /**
     * Gets the overrideIdeaAccountDetails__c value for this IdeasSiteSetup__c.
     * 
     * @return overrideIdeaAccountDetails__c
     */
    public java.lang.String getOverrideIdeaAccountDetails__c() {
        return overrideIdeaAccountDetails__c;
    }


    /**
     * Sets the overrideIdeaAccountDetails__c value for this IdeasSiteSetup__c.
     * 
     * @param overrideIdeaAccountDetails__c
     */
    public void setOverrideIdeaAccountDetails__c(java.lang.String overrideIdeaAccountDetails__c) {
        this.overrideIdeaAccountDetails__c = overrideIdeaAccountDetails__c;
    }


    /**
     * Gets the overrideIdeaForgotPasswordConfirm__c value for this IdeasSiteSetup__c.
     * 
     * @return overrideIdeaForgotPasswordConfirm__c
     */
    public java.lang.String getOverrideIdeaForgotPasswordConfirm__c() {
        return overrideIdeaForgotPasswordConfirm__c;
    }


    /**
     * Sets the overrideIdeaForgotPasswordConfirm__c value for this IdeasSiteSetup__c.
     * 
     * @param overrideIdeaForgotPasswordConfirm__c
     */
    public void setOverrideIdeaForgotPasswordConfirm__c(java.lang.String overrideIdeaForgotPasswordConfirm__c) {
        this.overrideIdeaForgotPasswordConfirm__c = overrideIdeaForgotPasswordConfirm__c;
    }


    /**
     * Gets the overrideIdeaForgotPassword__c value for this IdeasSiteSetup__c.
     * 
     * @return overrideIdeaForgotPassword__c
     */
    public java.lang.String getOverrideIdeaForgotPassword__c() {
        return overrideIdeaForgotPassword__c;
    }


    /**
     * Sets the overrideIdeaForgotPassword__c value for this IdeasSiteSetup__c.
     * 
     * @param overrideIdeaForgotPassword__c
     */
    public void setOverrideIdeaForgotPassword__c(java.lang.String overrideIdeaForgotPassword__c) {
        this.overrideIdeaForgotPassword__c = overrideIdeaForgotPassword__c;
    }


    /**
     * Gets the overrideIdeaHome__c value for this IdeasSiteSetup__c.
     * 
     * @return overrideIdeaHome__c
     */
    public java.lang.String getOverrideIdeaHome__c() {
        return overrideIdeaHome__c;
    }


    /**
     * Sets the overrideIdeaHome__c value for this IdeasSiteSetup__c.
     * 
     * @param overrideIdeaHome__c
     */
    public void setOverrideIdeaHome__c(java.lang.String overrideIdeaHome__c) {
        this.overrideIdeaHome__c = overrideIdeaHome__c;
    }


    /**
     * Gets the overrideIdeaLayout__c value for this IdeasSiteSetup__c.
     * 
     * @return overrideIdeaLayout__c
     */
    public java.lang.String getOverrideIdeaLayout__c() {
        return overrideIdeaLayout__c;
    }


    /**
     * Sets the overrideIdeaLayout__c value for this IdeasSiteSetup__c.
     * 
     * @param overrideIdeaLayout__c
     */
    public void setOverrideIdeaLayout__c(java.lang.String overrideIdeaLayout__c) {
        this.overrideIdeaLayout__c = overrideIdeaLayout__c;
    }


    /**
     * Gets the overrideIdeaList__c value for this IdeasSiteSetup__c.
     * 
     * @return overrideIdeaList__c
     */
    public java.lang.String getOverrideIdeaList__c() {
        return overrideIdeaList__c;
    }


    /**
     * Sets the overrideIdeaList__c value for this IdeasSiteSetup__c.
     * 
     * @param overrideIdeaList__c
     */
    public void setOverrideIdeaList__c(java.lang.String overrideIdeaList__c) {
        this.overrideIdeaList__c = overrideIdeaList__c;
    }


    /**
     * Gets the overrideIdeaPost__c value for this IdeasSiteSetup__c.
     * 
     * @return overrideIdeaPost__c
     */
    public java.lang.String getOverrideIdeaPost__c() {
        return overrideIdeaPost__c;
    }


    /**
     * Sets the overrideIdeaPost__c value for this IdeasSiteSetup__c.
     * 
     * @param overrideIdeaPost__c
     */
    public void setOverrideIdeaPost__c(java.lang.String overrideIdeaPost__c) {
        this.overrideIdeaPost__c = overrideIdeaPost__c;
    }


    /**
     * Gets the overrideIdeaProfileActivity__c value for this IdeasSiteSetup__c.
     * 
     * @return overrideIdeaProfileActivity__c
     */
    public java.lang.String getOverrideIdeaProfileActivity__c() {
        return overrideIdeaProfileActivity__c;
    }


    /**
     * Sets the overrideIdeaProfileActivity__c value for this IdeasSiteSetup__c.
     * 
     * @param overrideIdeaProfileActivity__c
     */
    public void setOverrideIdeaProfileActivity__c(java.lang.String overrideIdeaProfileActivity__c) {
        this.overrideIdeaProfileActivity__c = overrideIdeaProfileActivity__c;
    }


    /**
     * Gets the overrideIdeaProfileList__c value for this IdeasSiteSetup__c.
     * 
     * @return overrideIdeaProfileList__c
     */
    public java.lang.String getOverrideIdeaProfileList__c() {
        return overrideIdeaProfileList__c;
    }


    /**
     * Sets the overrideIdeaProfileList__c value for this IdeasSiteSetup__c.
     * 
     * @param overrideIdeaProfileList__c
     */
    public void setOverrideIdeaProfileList__c(java.lang.String overrideIdeaProfileList__c) {
        this.overrideIdeaProfileList__c = overrideIdeaProfileList__c;
    }


    /**
     * Gets the overrideIdeaSearchResults__c value for this IdeasSiteSetup__c.
     * 
     * @return overrideIdeaSearchResults__c
     */
    public java.lang.String getOverrideIdeaSearchResults__c() {
        return overrideIdeaSearchResults__c;
    }


    /**
     * Sets the overrideIdeaSearchResults__c value for this IdeasSiteSetup__c.
     * 
     * @param overrideIdeaSearchResults__c
     */
    public void setOverrideIdeaSearchResults__c(java.lang.String overrideIdeaSearchResults__c) {
        this.overrideIdeaSearchResults__c = overrideIdeaSearchResults__c;
    }


    /**
     * Gets the overrideIdeaSiteLogin__c value for this IdeasSiteSetup__c.
     * 
     * @return overrideIdeaSiteLogin__c
     */
    public java.lang.String getOverrideIdeaSiteLogin__c() {
        return overrideIdeaSiteLogin__c;
    }


    /**
     * Sets the overrideIdeaSiteLogin__c value for this IdeasSiteSetup__c.
     * 
     * @param overrideIdeaSiteLogin__c
     */
    public void setOverrideIdeaSiteLogin__c(java.lang.String overrideIdeaSiteLogin__c) {
        this.overrideIdeaSiteLogin__c = overrideIdeaSiteLogin__c;
    }


    /**
     * Gets the overrideIdeaSiteRegister__c value for this IdeasSiteSetup__c.
     * 
     * @return overrideIdeaSiteRegister__c
     */
    public java.lang.String getOverrideIdeaSiteRegister__c() {
        return overrideIdeaSiteRegister__c;
    }


    /**
     * Sets the overrideIdeaSiteRegister__c value for this IdeasSiteSetup__c.
     * 
     * @param overrideIdeaSiteRegister__c
     */
    public void setOverrideIdeaSiteRegister__c(java.lang.String overrideIdeaSiteRegister__c) {
        this.overrideIdeaSiteRegister__c = overrideIdeaSiteRegister__c;
    }


    /**
     * Gets the overrideIdeaView__c value for this IdeasSiteSetup__c.
     * 
     * @return overrideIdeaView__c
     */
    public java.lang.String getOverrideIdeaView__c() {
        return overrideIdeaView__c;
    }


    /**
     * Sets the overrideIdeaView__c value for this IdeasSiteSetup__c.
     * 
     * @param overrideIdeaView__c
     */
    public void setOverrideIdeaView__c(java.lang.String overrideIdeaView__c) {
        this.overrideIdeaView__c = overrideIdeaView__c;
    }


    /**
     * Gets the owner value for this IdeasSiteSetup__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this IdeasSiteSetup__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this IdeasSiteSetup__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this IdeasSiteSetup__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the portalAccount__c value for this IdeasSiteSetup__c.
     * 
     * @return portalAccount__c
     */
    public java.lang.String getPortalAccount__c() {
        return portalAccount__c;
    }


    /**
     * Sets the portalAccount__c value for this IdeasSiteSetup__c.
     * 
     * @param portalAccount__c
     */
    public void setPortalAccount__c(java.lang.String portalAccount__c) {
        this.portalAccount__c = portalAccount__c;
    }


    /**
     * Gets the portalAccount__r value for this IdeasSiteSetup__c.
     * 
     * @return portalAccount__r
     */
    public com.sforce.soap.enterprise.sobject.Account getPortalAccount__r() {
        return portalAccount__r;
    }


    /**
     * Sets the portalAccount__r value for this IdeasSiteSetup__c.
     * 
     * @param portalAccount__r
     */
    public void setPortalAccount__r(com.sforce.soap.enterprise.sobject.Account portalAccount__r) {
        this.portalAccount__r = portalAccount__r;
    }


    /**
     * Gets the processInstances value for this IdeasSiteSetup__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this IdeasSiteSetup__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this IdeasSiteSetup__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this IdeasSiteSetup__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the products__c value for this IdeasSiteSetup__c.
     * 
     * @return products__c
     */
    public java.lang.String getProducts__c() {
        return products__c;
    }


    /**
     * Sets the products__c value for this IdeasSiteSetup__c.
     * 
     * @param products__c
     */
    public void setProducts__c(java.lang.String products__c) {
        this.products__c = products__c;
    }


    /**
     * Gets the registerBody__c value for this IdeasSiteSetup__c.
     * 
     * @return registerBody__c
     */
    public java.lang.String getRegisterBody__c() {
        return registerBody__c;
    }


    /**
     * Sets the registerBody__c value for this IdeasSiteSetup__c.
     * 
     * @param registerBody__c
     */
    public void setRegisterBody__c(java.lang.String registerBody__c) {
        this.registerBody__c = registerBody__c;
    }


    /**
     * Gets the registerHeading__c value for this IdeasSiteSetup__c.
     * 
     * @return registerHeading__c
     */
    public java.lang.String getRegisterHeading__c() {
        return registerHeading__c;
    }


    /**
     * Sets the registerHeading__c value for this IdeasSiteSetup__c.
     * 
     * @param registerHeading__c
     */
    public void setRegisterHeading__c(java.lang.String registerHeading__c) {
        this.registerHeading__c = registerHeading__c;
    }


    /**
     * Gets the statuses__c value for this IdeasSiteSetup__c.
     * 
     * @return statuses__c
     */
    public java.lang.String getStatuses__c() {
        return statuses__c;
    }


    /**
     * Sets the statuses__c value for this IdeasSiteSetup__c.
     * 
     * @param statuses__c
     */
    public void setStatuses__c(java.lang.String statuses__c) {
        this.statuses__c = statuses__c;
    }


    /**
     * Gets the systemModstamp value for this IdeasSiteSetup__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this IdeasSiteSetup__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdeasSiteSetup__c)) return false;
        IdeasSiteSetup__c other = (IdeasSiteSetup__c) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.aboutBannerImageUrl__c==null && other.getAboutBannerImageUrl__c()==null) || 
             (this.aboutBannerImageUrl__c!=null &&
              this.aboutBannerImageUrl__c.equals(other.getAboutBannerImageUrl__c()))) &&
            ((this.aboutBody__c==null && other.getAboutBody__c()==null) || 
             (this.aboutBody__c!=null &&
              this.aboutBody__c.equals(other.getAboutBody__c()))) &&
            ((this.aboutHeading__c==null && other.getAboutHeading__c()==null) || 
             (this.aboutHeading__c!=null &&
              this.aboutHeading__c.equals(other.getAboutHeading__c()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.cacheMaxAge__c==null && other.getCacheMaxAge__c()==null) || 
             (this.cacheMaxAge__c!=null &&
              this.cacheMaxAge__c.equals(other.getCacheMaxAge__c()))) &&
            ((this.categories__c==null && other.getCategories__c()==null) || 
             (this.categories__c!=null &&
              this.categories__c.equals(other.getCategories__c()))) &&
            ((this.communityId__c==null && other.getCommunityId__c()==null) || 
             (this.communityId__c!=null &&
              this.communityId__c.equals(other.getCommunityId__c()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.customCssUrl__c==null && other.getCustomCssUrl__c()==null) || 
             (this.customCssUrl__c!=null &&
              this.customCssUrl__c.equals(other.getCustomCssUrl__c()))) &&
            ((this.expertsGroupId__c==null && other.getExpertsGroupId__c()==null) || 
             (this.expertsGroupId__c!=null &&
              this.expertsGroupId__c.equals(other.getExpertsGroupId__c()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.footerText__c==null && other.getFooterText__c()==null) || 
             (this.footerText__c!=null &&
              this.footerText__c.equals(other.getFooterText__c()))) &&
            ((this.forgotPasswordBody__c==null && other.getForgotPasswordBody__c()==null) || 
             (this.forgotPasswordBody__c!=null &&
              this.forgotPasswordBody__c.equals(other.getForgotPasswordBody__c()))) &&
            ((this.forgotPasswordHeading__c==null && other.getForgotPasswordHeading__c()==null) || 
             (this.forgotPasswordHeading__c!=null &&
              this.forgotPasswordHeading__c.equals(other.getForgotPasswordHeading__c()))) &&
            ((this.homeBannerImageUrl__c==null && other.getHomeBannerImageUrl__c()==null) || 
             (this.homeBannerImageUrl__c!=null &&
              this.homeBannerImageUrl__c.equals(other.getHomeBannerImageUrl__c()))) &&
            ((this.homeBody1__c==null && other.getHomeBody1__c()==null) || 
             (this.homeBody1__c!=null &&
              this.homeBody1__c.equals(other.getHomeBody1__c()))) &&
            ((this.homeBody2__c==null && other.getHomeBody2__c()==null) || 
             (this.homeBody2__c!=null &&
              this.homeBody2__c.equals(other.getHomeBody2__c()))) &&
            ((this.homeBody3__c==null && other.getHomeBody3__c()==null) || 
             (this.homeBody3__c!=null &&
              this.homeBody3__c.equals(other.getHomeBody3__c()))) &&
            ((this.homeBody4__c==null && other.getHomeBody4__c()==null) || 
             (this.homeBody4__c!=null &&
              this.homeBody4__c.equals(other.getHomeBody4__c()))) &&
            ((this.homeBody5__c==null && other.getHomeBody5__c()==null) || 
             (this.homeBody5__c!=null &&
              this.homeBody5__c.equals(other.getHomeBody5__c()))) &&
            ((this.homeHeading1__c==null && other.getHomeHeading1__c()==null) || 
             (this.homeHeading1__c!=null &&
              this.homeHeading1__c.equals(other.getHomeHeading1__c()))) &&
            ((this.homeHeading2__c==null && other.getHomeHeading2__c()==null) || 
             (this.homeHeading2__c!=null &&
              this.homeHeading2__c.equals(other.getHomeHeading2__c()))) &&
            ((this.homeHeading3__c==null && other.getHomeHeading3__c()==null) || 
             (this.homeHeading3__c!=null &&
              this.homeHeading3__c.equals(other.getHomeHeading3__c()))) &&
            ((this.homeHeading4__c==null && other.getHomeHeading4__c()==null) || 
             (this.homeHeading4__c!=null &&
              this.homeHeading4__c.equals(other.getHomeHeading4__c()))) &&
            ((this.homeHeading5__c==null && other.getHomeHeading5__c()==null) || 
             (this.homeHeading5__c!=null &&
              this.homeHeading5__c.equals(other.getHomeHeading5__c()))) &&
            ((this.homeRecentIdeasHeading__c==null && other.getHomeRecentIdeasHeading__c()==null) || 
             (this.homeRecentIdeasHeading__c!=null &&
              this.homeRecentIdeasHeading__c.equals(other.getHomeRecentIdeasHeading__c()))) &&
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
            ((this.loginBody__c==null && other.getLoginBody__c()==null) || 
             (this.loginBody__c!=null &&
              this.loginBody__c.equals(other.getLoginBody__c()))) &&
            ((this.loginHeading__c==null && other.getLoginHeading__c()==null) || 
             (this.loginHeading__c!=null &&
              this.loginHeading__c.equals(other.getLoginHeading__c()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.overrideIdeaAbout__c==null && other.getOverrideIdeaAbout__c()==null) || 
             (this.overrideIdeaAbout__c!=null &&
              this.overrideIdeaAbout__c.equals(other.getOverrideIdeaAbout__c()))) &&
            ((this.overrideIdeaAccountDetails__c==null && other.getOverrideIdeaAccountDetails__c()==null) || 
             (this.overrideIdeaAccountDetails__c!=null &&
              this.overrideIdeaAccountDetails__c.equals(other.getOverrideIdeaAccountDetails__c()))) &&
            ((this.overrideIdeaForgotPasswordConfirm__c==null && other.getOverrideIdeaForgotPasswordConfirm__c()==null) || 
             (this.overrideIdeaForgotPasswordConfirm__c!=null &&
              this.overrideIdeaForgotPasswordConfirm__c.equals(other.getOverrideIdeaForgotPasswordConfirm__c()))) &&
            ((this.overrideIdeaForgotPassword__c==null && other.getOverrideIdeaForgotPassword__c()==null) || 
             (this.overrideIdeaForgotPassword__c!=null &&
              this.overrideIdeaForgotPassword__c.equals(other.getOverrideIdeaForgotPassword__c()))) &&
            ((this.overrideIdeaHome__c==null && other.getOverrideIdeaHome__c()==null) || 
             (this.overrideIdeaHome__c!=null &&
              this.overrideIdeaHome__c.equals(other.getOverrideIdeaHome__c()))) &&
            ((this.overrideIdeaLayout__c==null && other.getOverrideIdeaLayout__c()==null) || 
             (this.overrideIdeaLayout__c!=null &&
              this.overrideIdeaLayout__c.equals(other.getOverrideIdeaLayout__c()))) &&
            ((this.overrideIdeaList__c==null && other.getOverrideIdeaList__c()==null) || 
             (this.overrideIdeaList__c!=null &&
              this.overrideIdeaList__c.equals(other.getOverrideIdeaList__c()))) &&
            ((this.overrideIdeaPost__c==null && other.getOverrideIdeaPost__c()==null) || 
             (this.overrideIdeaPost__c!=null &&
              this.overrideIdeaPost__c.equals(other.getOverrideIdeaPost__c()))) &&
            ((this.overrideIdeaProfileActivity__c==null && other.getOverrideIdeaProfileActivity__c()==null) || 
             (this.overrideIdeaProfileActivity__c!=null &&
              this.overrideIdeaProfileActivity__c.equals(other.getOverrideIdeaProfileActivity__c()))) &&
            ((this.overrideIdeaProfileList__c==null && other.getOverrideIdeaProfileList__c()==null) || 
             (this.overrideIdeaProfileList__c!=null &&
              this.overrideIdeaProfileList__c.equals(other.getOverrideIdeaProfileList__c()))) &&
            ((this.overrideIdeaSearchResults__c==null && other.getOverrideIdeaSearchResults__c()==null) || 
             (this.overrideIdeaSearchResults__c!=null &&
              this.overrideIdeaSearchResults__c.equals(other.getOverrideIdeaSearchResults__c()))) &&
            ((this.overrideIdeaSiteLogin__c==null && other.getOverrideIdeaSiteLogin__c()==null) || 
             (this.overrideIdeaSiteLogin__c!=null &&
              this.overrideIdeaSiteLogin__c.equals(other.getOverrideIdeaSiteLogin__c()))) &&
            ((this.overrideIdeaSiteRegister__c==null && other.getOverrideIdeaSiteRegister__c()==null) || 
             (this.overrideIdeaSiteRegister__c!=null &&
              this.overrideIdeaSiteRegister__c.equals(other.getOverrideIdeaSiteRegister__c()))) &&
            ((this.overrideIdeaView__c==null && other.getOverrideIdeaView__c()==null) || 
             (this.overrideIdeaView__c!=null &&
              this.overrideIdeaView__c.equals(other.getOverrideIdeaView__c()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.portalAccount__c==null && other.getPortalAccount__c()==null) || 
             (this.portalAccount__c!=null &&
              this.portalAccount__c.equals(other.getPortalAccount__c()))) &&
            ((this.portalAccount__r==null && other.getPortalAccount__r()==null) || 
             (this.portalAccount__r!=null &&
              this.portalAccount__r.equals(other.getPortalAccount__r()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.products__c==null && other.getProducts__c()==null) || 
             (this.products__c!=null &&
              this.products__c.equals(other.getProducts__c()))) &&
            ((this.registerBody__c==null && other.getRegisterBody__c()==null) || 
             (this.registerBody__c!=null &&
              this.registerBody__c.equals(other.getRegisterBody__c()))) &&
            ((this.registerHeading__c==null && other.getRegisterHeading__c()==null) || 
             (this.registerHeading__c!=null &&
              this.registerHeading__c.equals(other.getRegisterHeading__c()))) &&
            ((this.statuses__c==null && other.getStatuses__c()==null) || 
             (this.statuses__c!=null &&
              this.statuses__c.equals(other.getStatuses__c()))) &&
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
        if (getAboutBannerImageUrl__c() != null) {
            _hashCode += getAboutBannerImageUrl__c().hashCode();
        }
        if (getAboutBody__c() != null) {
            _hashCode += getAboutBody__c().hashCode();
        }
        if (getAboutHeading__c() != null) {
            _hashCode += getAboutHeading__c().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getCacheMaxAge__c() != null) {
            _hashCode += getCacheMaxAge__c().hashCode();
        }
        if (getCategories__c() != null) {
            _hashCode += getCategories__c().hashCode();
        }
        if (getCommunityId__c() != null) {
            _hashCode += getCommunityId__c().hashCode();
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
        if (getCustomCssUrl__c() != null) {
            _hashCode += getCustomCssUrl__c().hashCode();
        }
        if (getExpertsGroupId__c() != null) {
            _hashCode += getExpertsGroupId__c().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getFooterText__c() != null) {
            _hashCode += getFooterText__c().hashCode();
        }
        if (getForgotPasswordBody__c() != null) {
            _hashCode += getForgotPasswordBody__c().hashCode();
        }
        if (getForgotPasswordHeading__c() != null) {
            _hashCode += getForgotPasswordHeading__c().hashCode();
        }
        if (getHomeBannerImageUrl__c() != null) {
            _hashCode += getHomeBannerImageUrl__c().hashCode();
        }
        if (getHomeBody1__c() != null) {
            _hashCode += getHomeBody1__c().hashCode();
        }
        if (getHomeBody2__c() != null) {
            _hashCode += getHomeBody2__c().hashCode();
        }
        if (getHomeBody3__c() != null) {
            _hashCode += getHomeBody3__c().hashCode();
        }
        if (getHomeBody4__c() != null) {
            _hashCode += getHomeBody4__c().hashCode();
        }
        if (getHomeBody5__c() != null) {
            _hashCode += getHomeBody5__c().hashCode();
        }
        if (getHomeHeading1__c() != null) {
            _hashCode += getHomeHeading1__c().hashCode();
        }
        if (getHomeHeading2__c() != null) {
            _hashCode += getHomeHeading2__c().hashCode();
        }
        if (getHomeHeading3__c() != null) {
            _hashCode += getHomeHeading3__c().hashCode();
        }
        if (getHomeHeading4__c() != null) {
            _hashCode += getHomeHeading4__c().hashCode();
        }
        if (getHomeHeading5__c() != null) {
            _hashCode += getHomeHeading5__c().hashCode();
        }
        if (getHomeRecentIdeasHeading__c() != null) {
            _hashCode += getHomeRecentIdeasHeading__c().hashCode();
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
        if (getLoginBody__c() != null) {
            _hashCode += getLoginBody__c().hashCode();
        }
        if (getLoginHeading__c() != null) {
            _hashCode += getLoginHeading__c().hashCode();
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
        if (getOverrideIdeaAbout__c() != null) {
            _hashCode += getOverrideIdeaAbout__c().hashCode();
        }
        if (getOverrideIdeaAccountDetails__c() != null) {
            _hashCode += getOverrideIdeaAccountDetails__c().hashCode();
        }
        if (getOverrideIdeaForgotPasswordConfirm__c() != null) {
            _hashCode += getOverrideIdeaForgotPasswordConfirm__c().hashCode();
        }
        if (getOverrideIdeaForgotPassword__c() != null) {
            _hashCode += getOverrideIdeaForgotPassword__c().hashCode();
        }
        if (getOverrideIdeaHome__c() != null) {
            _hashCode += getOverrideIdeaHome__c().hashCode();
        }
        if (getOverrideIdeaLayout__c() != null) {
            _hashCode += getOverrideIdeaLayout__c().hashCode();
        }
        if (getOverrideIdeaList__c() != null) {
            _hashCode += getOverrideIdeaList__c().hashCode();
        }
        if (getOverrideIdeaPost__c() != null) {
            _hashCode += getOverrideIdeaPost__c().hashCode();
        }
        if (getOverrideIdeaProfileActivity__c() != null) {
            _hashCode += getOverrideIdeaProfileActivity__c().hashCode();
        }
        if (getOverrideIdeaProfileList__c() != null) {
            _hashCode += getOverrideIdeaProfileList__c().hashCode();
        }
        if (getOverrideIdeaSearchResults__c() != null) {
            _hashCode += getOverrideIdeaSearchResults__c().hashCode();
        }
        if (getOverrideIdeaSiteLogin__c() != null) {
            _hashCode += getOverrideIdeaSiteLogin__c().hashCode();
        }
        if (getOverrideIdeaSiteRegister__c() != null) {
            _hashCode += getOverrideIdeaSiteRegister__c().hashCode();
        }
        if (getOverrideIdeaView__c() != null) {
            _hashCode += getOverrideIdeaView__c().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getPortalAccount__c() != null) {
            _hashCode += getPortalAccount__c().hashCode();
        }
        if (getPortalAccount__r() != null) {
            _hashCode += getPortalAccount__r().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getProducts__c() != null) {
            _hashCode += getProducts__c().hashCode();
        }
        if (getRegisterBody__c() != null) {
            _hashCode += getRegisterBody__c().hashCode();
        }
        if (getRegisterHeading__c() != null) {
            _hashCode += getRegisterHeading__c().hashCode();
        }
        if (getStatuses__c() != null) {
            _hashCode += getStatuses__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdeasSiteSetup__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IdeasSiteSetup__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aboutBannerImageUrl__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AboutBannerImageUrl__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aboutBody__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AboutBody__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aboutHeading__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AboutHeading__c"));
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
        elemField.setFieldName("cacheMaxAge__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CacheMaxAge__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categories__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Categories__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communityId__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CommunityId__c"));
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
        elemField.setFieldName("customCssUrl__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CustomCssUrl__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expertsGroupId__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ExpertsGroupId__c"));
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
        elemField.setFieldName("footerText__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FooterText__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forgotPasswordBody__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ForgotPasswordBody__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forgotPasswordHeading__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ForgotPasswordHeading__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeBannerImageUrl__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HomeBannerImageUrl__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeBody1__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HomeBody1__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeBody2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HomeBody2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeBody3__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HomeBody3__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeBody4__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HomeBody4__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeBody5__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HomeBody5__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeHeading1__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HomeHeading1__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeHeading2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HomeHeading2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeHeading3__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HomeHeading3__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeHeading4__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HomeHeading4__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeHeading5__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HomeHeading5__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeRecentIdeasHeading__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HomeRecentIdeasHeading__c"));
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
        elemField.setFieldName("loginBody__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LoginBody__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginHeading__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LoginHeading__c"));
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
        elemField.setFieldName("overrideIdeaAbout__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OverrideIdeaAbout__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideIdeaAccountDetails__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OverrideIdeaAccountDetails__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideIdeaForgotPasswordConfirm__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OverrideIdeaForgotPasswordConfirm__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideIdeaForgotPassword__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OverrideIdeaForgotPassword__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideIdeaHome__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OverrideIdeaHome__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideIdeaLayout__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OverrideIdeaLayout__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideIdeaList__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OverrideIdeaList__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideIdeaPost__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OverrideIdeaPost__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideIdeaProfileActivity__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OverrideIdeaProfileActivity__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideIdeaProfileList__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OverrideIdeaProfileList__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideIdeaSearchResults__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OverrideIdeaSearchResults__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideIdeaSiteLogin__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OverrideIdeaSiteLogin__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideIdeaSiteRegister__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OverrideIdeaSiteRegister__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideIdeaView__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OverrideIdeaView__c"));
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
        elemField.setFieldName("portalAccount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PortalAccount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portalAccount__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PortalAccount__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account"));
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
        elemField.setFieldName("products__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Products__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerBody__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RegisterBody__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerHeading__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RegisterHeading__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statuses__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Statuses__c"));
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

/**
 * Site.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Site  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.sobject.User admin;

    private java.lang.String adminId;

    private java.lang.String analyticsTrackingCode;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.Integer dailyBandwidthLimit;

    private java.lang.Integer dailyBandwidthUsed;

    private java.lang.Integer dailyRequestTimeLimit;

    private java.lang.Integer dailyRequestTimeUsed;

    private java.lang.String description;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult feeds;

    private com.sforce.soap.enterprise.QueryResult histories;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String masterLabel;

    private java.lang.Integer monthlyPageViewsEntitlement;

    private java.lang.String name;

    private java.lang.Boolean optionsAllowHomePage;

    private java.lang.Boolean optionsAllowStandardAnswersPages;

    private java.lang.Boolean optionsAllowStandardIdeasPages;

    private java.lang.Boolean optionsAllowStandardLookups;

    private java.lang.Boolean optionsAllowStandardSearch;

    private java.lang.Boolean optionsEnableFeeds;

    private com.sforce.soap.enterprise.QueryResult siteDomainPaths;

    private java.lang.String siteType;

    private java.lang.String status;

    private java.lang.String subdomain;

    private java.util.Calendar systemModstamp;

    private java.lang.String urlPathPrefix;

    public Site() {
    }

    public Site(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.sobject.User admin,
           java.lang.String adminId,
           java.lang.String analyticsTrackingCode,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.Integer dailyBandwidthLimit,
           java.lang.Integer dailyBandwidthUsed,
           java.lang.Integer dailyRequestTimeLimit,
           java.lang.Integer dailyRequestTimeUsed,
           java.lang.String description,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult feeds,
           com.sforce.soap.enterprise.QueryResult histories,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String masterLabel,
           java.lang.Integer monthlyPageViewsEntitlement,
           java.lang.String name,
           java.lang.Boolean optionsAllowHomePage,
           java.lang.Boolean optionsAllowStandardAnswersPages,
           java.lang.Boolean optionsAllowStandardIdeasPages,
           java.lang.Boolean optionsAllowStandardLookups,
           java.lang.Boolean optionsAllowStandardSearch,
           java.lang.Boolean optionsEnableFeeds,
           com.sforce.soap.enterprise.QueryResult siteDomainPaths,
           java.lang.String siteType,
           java.lang.String status,
           java.lang.String subdomain,
           java.util.Calendar systemModstamp,
           java.lang.String urlPathPrefix) {
        super(
            fieldsToNull,
            id);
        this.admin = admin;
        this.adminId = adminId;
        this.analyticsTrackingCode = analyticsTrackingCode;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.dailyBandwidthLimit = dailyBandwidthLimit;
        this.dailyBandwidthUsed = dailyBandwidthUsed;
        this.dailyRequestTimeLimit = dailyRequestTimeLimit;
        this.dailyRequestTimeUsed = dailyRequestTimeUsed;
        this.description = description;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.feeds = feeds;
        this.histories = histories;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.masterLabel = masterLabel;
        this.monthlyPageViewsEntitlement = monthlyPageViewsEntitlement;
        this.name = name;
        this.optionsAllowHomePage = optionsAllowHomePage;
        this.optionsAllowStandardAnswersPages = optionsAllowStandardAnswersPages;
        this.optionsAllowStandardIdeasPages = optionsAllowStandardIdeasPages;
        this.optionsAllowStandardLookups = optionsAllowStandardLookups;
        this.optionsAllowStandardSearch = optionsAllowStandardSearch;
        this.optionsEnableFeeds = optionsEnableFeeds;
        this.siteDomainPaths = siteDomainPaths;
        this.siteType = siteType;
        this.status = status;
        this.subdomain = subdomain;
        this.systemModstamp = systemModstamp;
        this.urlPathPrefix = urlPathPrefix;
    }


    /**
     * Gets the admin value for this Site.
     * 
     * @return admin
     */
    public com.sforce.soap.enterprise.sobject.User getAdmin() {
        return admin;
    }


    /**
     * Sets the admin value for this Site.
     * 
     * @param admin
     */
    public void setAdmin(com.sforce.soap.enterprise.sobject.User admin) {
        this.admin = admin;
    }


    /**
     * Gets the adminId value for this Site.
     * 
     * @return adminId
     */
    public java.lang.String getAdminId() {
        return adminId;
    }


    /**
     * Sets the adminId value for this Site.
     * 
     * @param adminId
     */
    public void setAdminId(java.lang.String adminId) {
        this.adminId = adminId;
    }


    /**
     * Gets the analyticsTrackingCode value for this Site.
     * 
     * @return analyticsTrackingCode
     */
    public java.lang.String getAnalyticsTrackingCode() {
        return analyticsTrackingCode;
    }


    /**
     * Sets the analyticsTrackingCode value for this Site.
     * 
     * @param analyticsTrackingCode
     */
    public void setAnalyticsTrackingCode(java.lang.String analyticsTrackingCode) {
        this.analyticsTrackingCode = analyticsTrackingCode;
    }


    /**
     * Gets the createdBy value for this Site.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Site.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Site.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Site.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Site.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Site.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the dailyBandwidthLimit value for this Site.
     * 
     * @return dailyBandwidthLimit
     */
    public java.lang.Integer getDailyBandwidthLimit() {
        return dailyBandwidthLimit;
    }


    /**
     * Sets the dailyBandwidthLimit value for this Site.
     * 
     * @param dailyBandwidthLimit
     */
    public void setDailyBandwidthLimit(java.lang.Integer dailyBandwidthLimit) {
        this.dailyBandwidthLimit = dailyBandwidthLimit;
    }


    /**
     * Gets the dailyBandwidthUsed value for this Site.
     * 
     * @return dailyBandwidthUsed
     */
    public java.lang.Integer getDailyBandwidthUsed() {
        return dailyBandwidthUsed;
    }


    /**
     * Sets the dailyBandwidthUsed value for this Site.
     * 
     * @param dailyBandwidthUsed
     */
    public void setDailyBandwidthUsed(java.lang.Integer dailyBandwidthUsed) {
        this.dailyBandwidthUsed = dailyBandwidthUsed;
    }


    /**
     * Gets the dailyRequestTimeLimit value for this Site.
     * 
     * @return dailyRequestTimeLimit
     */
    public java.lang.Integer getDailyRequestTimeLimit() {
        return dailyRequestTimeLimit;
    }


    /**
     * Sets the dailyRequestTimeLimit value for this Site.
     * 
     * @param dailyRequestTimeLimit
     */
    public void setDailyRequestTimeLimit(java.lang.Integer dailyRequestTimeLimit) {
        this.dailyRequestTimeLimit = dailyRequestTimeLimit;
    }


    /**
     * Gets the dailyRequestTimeUsed value for this Site.
     * 
     * @return dailyRequestTimeUsed
     */
    public java.lang.Integer getDailyRequestTimeUsed() {
        return dailyRequestTimeUsed;
    }


    /**
     * Sets the dailyRequestTimeUsed value for this Site.
     * 
     * @param dailyRequestTimeUsed
     */
    public void setDailyRequestTimeUsed(java.lang.Integer dailyRequestTimeUsed) {
        this.dailyRequestTimeUsed = dailyRequestTimeUsed;
    }


    /**
     * Gets the description value for this Site.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Site.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Site.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Site.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the feeds value for this Site.
     * 
     * @return feeds
     */
    public com.sforce.soap.enterprise.QueryResult getFeeds() {
        return feeds;
    }


    /**
     * Sets the feeds value for this Site.
     * 
     * @param feeds
     */
    public void setFeeds(com.sforce.soap.enterprise.QueryResult feeds) {
        this.feeds = feeds;
    }


    /**
     * Gets the histories value for this Site.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Site.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the lastModifiedBy value for this Site.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Site.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Site.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Site.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Site.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Site.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the masterLabel value for this Site.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this Site.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }


    /**
     * Gets the monthlyPageViewsEntitlement value for this Site.
     * 
     * @return monthlyPageViewsEntitlement
     */
    public java.lang.Integer getMonthlyPageViewsEntitlement() {
        return monthlyPageViewsEntitlement;
    }


    /**
     * Sets the monthlyPageViewsEntitlement value for this Site.
     * 
     * @param monthlyPageViewsEntitlement
     */
    public void setMonthlyPageViewsEntitlement(java.lang.Integer monthlyPageViewsEntitlement) {
        this.monthlyPageViewsEntitlement = monthlyPageViewsEntitlement;
    }


    /**
     * Gets the name value for this Site.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Site.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the optionsAllowHomePage value for this Site.
     * 
     * @return optionsAllowHomePage
     */
    public java.lang.Boolean getOptionsAllowHomePage() {
        return optionsAllowHomePage;
    }


    /**
     * Sets the optionsAllowHomePage value for this Site.
     * 
     * @param optionsAllowHomePage
     */
    public void setOptionsAllowHomePage(java.lang.Boolean optionsAllowHomePage) {
        this.optionsAllowHomePage = optionsAllowHomePage;
    }


    /**
     * Gets the optionsAllowStandardAnswersPages value for this Site.
     * 
     * @return optionsAllowStandardAnswersPages
     */
    public java.lang.Boolean getOptionsAllowStandardAnswersPages() {
        return optionsAllowStandardAnswersPages;
    }


    /**
     * Sets the optionsAllowStandardAnswersPages value for this Site.
     * 
     * @param optionsAllowStandardAnswersPages
     */
    public void setOptionsAllowStandardAnswersPages(java.lang.Boolean optionsAllowStandardAnswersPages) {
        this.optionsAllowStandardAnswersPages = optionsAllowStandardAnswersPages;
    }


    /**
     * Gets the optionsAllowStandardIdeasPages value for this Site.
     * 
     * @return optionsAllowStandardIdeasPages
     */
    public java.lang.Boolean getOptionsAllowStandardIdeasPages() {
        return optionsAllowStandardIdeasPages;
    }


    /**
     * Sets the optionsAllowStandardIdeasPages value for this Site.
     * 
     * @param optionsAllowStandardIdeasPages
     */
    public void setOptionsAllowStandardIdeasPages(java.lang.Boolean optionsAllowStandardIdeasPages) {
        this.optionsAllowStandardIdeasPages = optionsAllowStandardIdeasPages;
    }


    /**
     * Gets the optionsAllowStandardLookups value for this Site.
     * 
     * @return optionsAllowStandardLookups
     */
    public java.lang.Boolean getOptionsAllowStandardLookups() {
        return optionsAllowStandardLookups;
    }


    /**
     * Sets the optionsAllowStandardLookups value for this Site.
     * 
     * @param optionsAllowStandardLookups
     */
    public void setOptionsAllowStandardLookups(java.lang.Boolean optionsAllowStandardLookups) {
        this.optionsAllowStandardLookups = optionsAllowStandardLookups;
    }


    /**
     * Gets the optionsAllowStandardSearch value for this Site.
     * 
     * @return optionsAllowStandardSearch
     */
    public java.lang.Boolean getOptionsAllowStandardSearch() {
        return optionsAllowStandardSearch;
    }


    /**
     * Sets the optionsAllowStandardSearch value for this Site.
     * 
     * @param optionsAllowStandardSearch
     */
    public void setOptionsAllowStandardSearch(java.lang.Boolean optionsAllowStandardSearch) {
        this.optionsAllowStandardSearch = optionsAllowStandardSearch;
    }


    /**
     * Gets the optionsEnableFeeds value for this Site.
     * 
     * @return optionsEnableFeeds
     */
    public java.lang.Boolean getOptionsEnableFeeds() {
        return optionsEnableFeeds;
    }


    /**
     * Sets the optionsEnableFeeds value for this Site.
     * 
     * @param optionsEnableFeeds
     */
    public void setOptionsEnableFeeds(java.lang.Boolean optionsEnableFeeds) {
        this.optionsEnableFeeds = optionsEnableFeeds;
    }


    /**
     * Gets the siteDomainPaths value for this Site.
     * 
     * @return siteDomainPaths
     */
    public com.sforce.soap.enterprise.QueryResult getSiteDomainPaths() {
        return siteDomainPaths;
    }


    /**
     * Sets the siteDomainPaths value for this Site.
     * 
     * @param siteDomainPaths
     */
    public void setSiteDomainPaths(com.sforce.soap.enterprise.QueryResult siteDomainPaths) {
        this.siteDomainPaths = siteDomainPaths;
    }


    /**
     * Gets the siteType value for this Site.
     * 
     * @return siteType
     */
    public java.lang.String getSiteType() {
        return siteType;
    }


    /**
     * Sets the siteType value for this Site.
     * 
     * @param siteType
     */
    public void setSiteType(java.lang.String siteType) {
        this.siteType = siteType;
    }


    /**
     * Gets the status value for this Site.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Site.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the subdomain value for this Site.
     * 
     * @return subdomain
     */
    public java.lang.String getSubdomain() {
        return subdomain;
    }


    /**
     * Sets the subdomain value for this Site.
     * 
     * @param subdomain
     */
    public void setSubdomain(java.lang.String subdomain) {
        this.subdomain = subdomain;
    }


    /**
     * Gets the systemModstamp value for this Site.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Site.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the urlPathPrefix value for this Site.
     * 
     * @return urlPathPrefix
     */
    public java.lang.String getUrlPathPrefix() {
        return urlPathPrefix;
    }


    /**
     * Sets the urlPathPrefix value for this Site.
     * 
     * @param urlPathPrefix
     */
    public void setUrlPathPrefix(java.lang.String urlPathPrefix) {
        this.urlPathPrefix = urlPathPrefix;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Site)) return false;
        Site other = (Site) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.admin==null && other.getAdmin()==null) || 
             (this.admin!=null &&
              this.admin.equals(other.getAdmin()))) &&
            ((this.adminId==null && other.getAdminId()==null) || 
             (this.adminId!=null &&
              this.adminId.equals(other.getAdminId()))) &&
            ((this.analyticsTrackingCode==null && other.getAnalyticsTrackingCode()==null) || 
             (this.analyticsTrackingCode!=null &&
              this.analyticsTrackingCode.equals(other.getAnalyticsTrackingCode()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.dailyBandwidthLimit==null && other.getDailyBandwidthLimit()==null) || 
             (this.dailyBandwidthLimit!=null &&
              this.dailyBandwidthLimit.equals(other.getDailyBandwidthLimit()))) &&
            ((this.dailyBandwidthUsed==null && other.getDailyBandwidthUsed()==null) || 
             (this.dailyBandwidthUsed!=null &&
              this.dailyBandwidthUsed.equals(other.getDailyBandwidthUsed()))) &&
            ((this.dailyRequestTimeLimit==null && other.getDailyRequestTimeLimit()==null) || 
             (this.dailyRequestTimeLimit!=null &&
              this.dailyRequestTimeLimit.equals(other.getDailyRequestTimeLimit()))) &&
            ((this.dailyRequestTimeUsed==null && other.getDailyRequestTimeUsed()==null) || 
             (this.dailyRequestTimeUsed!=null &&
              this.dailyRequestTimeUsed.equals(other.getDailyRequestTimeUsed()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.feeds==null && other.getFeeds()==null) || 
             (this.feeds!=null &&
              this.feeds.equals(other.getFeeds()))) &&
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.masterLabel==null && other.getMasterLabel()==null) || 
             (this.masterLabel!=null &&
              this.masterLabel.equals(other.getMasterLabel()))) &&
            ((this.monthlyPageViewsEntitlement==null && other.getMonthlyPageViewsEntitlement()==null) || 
             (this.monthlyPageViewsEntitlement!=null &&
              this.monthlyPageViewsEntitlement.equals(other.getMonthlyPageViewsEntitlement()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.optionsAllowHomePage==null && other.getOptionsAllowHomePage()==null) || 
             (this.optionsAllowHomePage!=null &&
              this.optionsAllowHomePage.equals(other.getOptionsAllowHomePage()))) &&
            ((this.optionsAllowStandardAnswersPages==null && other.getOptionsAllowStandardAnswersPages()==null) || 
             (this.optionsAllowStandardAnswersPages!=null &&
              this.optionsAllowStandardAnswersPages.equals(other.getOptionsAllowStandardAnswersPages()))) &&
            ((this.optionsAllowStandardIdeasPages==null && other.getOptionsAllowStandardIdeasPages()==null) || 
             (this.optionsAllowStandardIdeasPages!=null &&
              this.optionsAllowStandardIdeasPages.equals(other.getOptionsAllowStandardIdeasPages()))) &&
            ((this.optionsAllowStandardLookups==null && other.getOptionsAllowStandardLookups()==null) || 
             (this.optionsAllowStandardLookups!=null &&
              this.optionsAllowStandardLookups.equals(other.getOptionsAllowStandardLookups()))) &&
            ((this.optionsAllowStandardSearch==null && other.getOptionsAllowStandardSearch()==null) || 
             (this.optionsAllowStandardSearch!=null &&
              this.optionsAllowStandardSearch.equals(other.getOptionsAllowStandardSearch()))) &&
            ((this.optionsEnableFeeds==null && other.getOptionsEnableFeeds()==null) || 
             (this.optionsEnableFeeds!=null &&
              this.optionsEnableFeeds.equals(other.getOptionsEnableFeeds()))) &&
            ((this.siteDomainPaths==null && other.getSiteDomainPaths()==null) || 
             (this.siteDomainPaths!=null &&
              this.siteDomainPaths.equals(other.getSiteDomainPaths()))) &&
            ((this.siteType==null && other.getSiteType()==null) || 
             (this.siteType!=null &&
              this.siteType.equals(other.getSiteType()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.subdomain==null && other.getSubdomain()==null) || 
             (this.subdomain!=null &&
              this.subdomain.equals(other.getSubdomain()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.urlPathPrefix==null && other.getUrlPathPrefix()==null) || 
             (this.urlPathPrefix!=null &&
              this.urlPathPrefix.equals(other.getUrlPathPrefix())));
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
        if (getAdmin() != null) {
            _hashCode += getAdmin().hashCode();
        }
        if (getAdminId() != null) {
            _hashCode += getAdminId().hashCode();
        }
        if (getAnalyticsTrackingCode() != null) {
            _hashCode += getAnalyticsTrackingCode().hashCode();
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
        if (getDailyBandwidthLimit() != null) {
            _hashCode += getDailyBandwidthLimit().hashCode();
        }
        if (getDailyBandwidthUsed() != null) {
            _hashCode += getDailyBandwidthUsed().hashCode();
        }
        if (getDailyRequestTimeLimit() != null) {
            _hashCode += getDailyRequestTimeLimit().hashCode();
        }
        if (getDailyRequestTimeUsed() != null) {
            _hashCode += getDailyRequestTimeUsed().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getFeeds() != null) {
            _hashCode += getFeeds().hashCode();
        }
        if (getHistories() != null) {
            _hashCode += getHistories().hashCode();
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
        if (getMasterLabel() != null) {
            _hashCode += getMasterLabel().hashCode();
        }
        if (getMonthlyPageViewsEntitlement() != null) {
            _hashCode += getMonthlyPageViewsEntitlement().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOptionsAllowHomePage() != null) {
            _hashCode += getOptionsAllowHomePage().hashCode();
        }
        if (getOptionsAllowStandardAnswersPages() != null) {
            _hashCode += getOptionsAllowStandardAnswersPages().hashCode();
        }
        if (getOptionsAllowStandardIdeasPages() != null) {
            _hashCode += getOptionsAllowStandardIdeasPages().hashCode();
        }
        if (getOptionsAllowStandardLookups() != null) {
            _hashCode += getOptionsAllowStandardLookups().hashCode();
        }
        if (getOptionsAllowStandardSearch() != null) {
            _hashCode += getOptionsAllowStandardSearch().hashCode();
        }
        if (getOptionsEnableFeeds() != null) {
            _hashCode += getOptionsEnableFeeds().hashCode();
        }
        if (getSiteDomainPaths() != null) {
            _hashCode += getSiteDomainPaths().hashCode();
        }
        if (getSiteType() != null) {
            _hashCode += getSiteType().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSubdomain() != null) {
            _hashCode += getSubdomain().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getUrlPathPrefix() != null) {
            _hashCode += getUrlPathPrefix().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Site.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Site"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("admin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Admin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adminId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AdminId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("analyticsTrackingCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AnalyticsTrackingCode"));
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
        elemField.setFieldName("dailyBandwidthLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DailyBandwidthLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dailyBandwidthUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DailyBandwidthUsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dailyRequestTimeLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DailyRequestTimeLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dailyRequestTimeUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DailyRequestTimeUsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("feedSubscriptionsForEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedSubscriptionsForEntity"));
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
        elemField.setFieldName("histories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Histories"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("masterLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MasterLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthlyPageViewsEntitlement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MonthlyPageViewsEntitlement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("optionsAllowHomePage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OptionsAllowHomePage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionsAllowStandardAnswersPages");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OptionsAllowStandardAnswersPages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionsAllowStandardIdeasPages");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OptionsAllowStandardIdeasPages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionsAllowStandardLookups");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OptionsAllowStandardLookups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionsAllowStandardSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OptionsAllowStandardSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionsEnableFeeds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OptionsEnableFeeds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteDomainPaths");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SiteDomainPaths"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SiteType"));
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
        elemField.setFieldName("subdomain");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Subdomain"));
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
        elemField.setFieldName("urlPathPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UrlPathPrefix"));
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

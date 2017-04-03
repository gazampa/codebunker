/**
 * Organization.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Organization  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String city;

    private java.lang.String complianceBccEmail;

    private java.lang.String country;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String defaultAccountAccess;

    private java.lang.String defaultCalendarAccess;

    private java.lang.String defaultCampaignAccess;

    private java.lang.String defaultCaseAccess;

    private java.lang.String defaultContactAccess;

    private java.lang.String defaultLeadAccess;

    private java.lang.String defaultLocaleSidKey;

    private java.lang.String defaultOpportunityAccess;

    private java.lang.String defaultPricebookAccess;

    private java.lang.String division;

    private java.lang.String fax;

    private java.lang.Integer fiscalYearStartMonth;

    private java.lang.String languageLocaleKey;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.Integer monthlyPageViewsEntitlement;

    private java.lang.Integer monthlyPageViewsUsed;

    private java.lang.String name;

    private java.lang.String organizationType;

    private java.lang.String phone;

    private java.lang.String postalCode;

    private java.lang.Boolean preferencesRequireOpportunityProducts;

    private java.lang.String primaryContact;

    private java.lang.Boolean receivesAdminInfoEmails;

    private java.lang.Boolean receivesInfoEmails;

    private java.lang.String state;

    private java.lang.String street;

    private java.util.Calendar systemModstamp;

    private java.util.Calendar trialExpirationDate;

    private java.lang.String uiSkin;

    private java.lang.Boolean usesStartDateAsFiscalYearName;

    private java.lang.String webToCaseDefaultOrigin;

    public Organization() {
    }

    public Organization(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String city,
           java.lang.String complianceBccEmail,
           java.lang.String country,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String defaultAccountAccess,
           java.lang.String defaultCalendarAccess,
           java.lang.String defaultCampaignAccess,
           java.lang.String defaultCaseAccess,
           java.lang.String defaultContactAccess,
           java.lang.String defaultLeadAccess,
           java.lang.String defaultLocaleSidKey,
           java.lang.String defaultOpportunityAccess,
           java.lang.String defaultPricebookAccess,
           java.lang.String division,
           java.lang.String fax,
           java.lang.Integer fiscalYearStartMonth,
           java.lang.String languageLocaleKey,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.Integer monthlyPageViewsEntitlement,
           java.lang.Integer monthlyPageViewsUsed,
           java.lang.String name,
           java.lang.String organizationType,
           java.lang.String phone,
           java.lang.String postalCode,
           java.lang.Boolean preferencesRequireOpportunityProducts,
           java.lang.String primaryContact,
           java.lang.Boolean receivesAdminInfoEmails,
           java.lang.Boolean receivesInfoEmails,
           java.lang.String state,
           java.lang.String street,
           java.util.Calendar systemModstamp,
           java.util.Calendar trialExpirationDate,
           java.lang.String uiSkin,
           java.lang.Boolean usesStartDateAsFiscalYearName,
           java.lang.String webToCaseDefaultOrigin) {
        super(
            fieldsToNull,
            id);
        this.city = city;
        this.complianceBccEmail = complianceBccEmail;
        this.country = country;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.defaultAccountAccess = defaultAccountAccess;
        this.defaultCalendarAccess = defaultCalendarAccess;
        this.defaultCampaignAccess = defaultCampaignAccess;
        this.defaultCaseAccess = defaultCaseAccess;
        this.defaultContactAccess = defaultContactAccess;
        this.defaultLeadAccess = defaultLeadAccess;
        this.defaultLocaleSidKey = defaultLocaleSidKey;
        this.defaultOpportunityAccess = defaultOpportunityAccess;
        this.defaultPricebookAccess = defaultPricebookAccess;
        this.division = division;
        this.fax = fax;
        this.fiscalYearStartMonth = fiscalYearStartMonth;
        this.languageLocaleKey = languageLocaleKey;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.monthlyPageViewsEntitlement = monthlyPageViewsEntitlement;
        this.monthlyPageViewsUsed = monthlyPageViewsUsed;
        this.name = name;
        this.organizationType = organizationType;
        this.phone = phone;
        this.postalCode = postalCode;
        this.preferencesRequireOpportunityProducts = preferencesRequireOpportunityProducts;
        this.primaryContact = primaryContact;
        this.receivesAdminInfoEmails = receivesAdminInfoEmails;
        this.receivesInfoEmails = receivesInfoEmails;
        this.state = state;
        this.street = street;
        this.systemModstamp = systemModstamp;
        this.trialExpirationDate = trialExpirationDate;
        this.uiSkin = uiSkin;
        this.usesStartDateAsFiscalYearName = usesStartDateAsFiscalYearName;
        this.webToCaseDefaultOrigin = webToCaseDefaultOrigin;
    }


    /**
     * Gets the city value for this Organization.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this Organization.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the complianceBccEmail value for this Organization.
     * 
     * @return complianceBccEmail
     */
    public java.lang.String getComplianceBccEmail() {
        return complianceBccEmail;
    }


    /**
     * Sets the complianceBccEmail value for this Organization.
     * 
     * @param complianceBccEmail
     */
    public void setComplianceBccEmail(java.lang.String complianceBccEmail) {
        this.complianceBccEmail = complianceBccEmail;
    }


    /**
     * Gets the country value for this Organization.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this Organization.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the createdBy value for this Organization.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Organization.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Organization.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Organization.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Organization.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Organization.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the defaultAccountAccess value for this Organization.
     * 
     * @return defaultAccountAccess
     */
    public java.lang.String getDefaultAccountAccess() {
        return defaultAccountAccess;
    }


    /**
     * Sets the defaultAccountAccess value for this Organization.
     * 
     * @param defaultAccountAccess
     */
    public void setDefaultAccountAccess(java.lang.String defaultAccountAccess) {
        this.defaultAccountAccess = defaultAccountAccess;
    }


    /**
     * Gets the defaultCalendarAccess value for this Organization.
     * 
     * @return defaultCalendarAccess
     */
    public java.lang.String getDefaultCalendarAccess() {
        return defaultCalendarAccess;
    }


    /**
     * Sets the defaultCalendarAccess value for this Organization.
     * 
     * @param defaultCalendarAccess
     */
    public void setDefaultCalendarAccess(java.lang.String defaultCalendarAccess) {
        this.defaultCalendarAccess = defaultCalendarAccess;
    }


    /**
     * Gets the defaultCampaignAccess value for this Organization.
     * 
     * @return defaultCampaignAccess
     */
    public java.lang.String getDefaultCampaignAccess() {
        return defaultCampaignAccess;
    }


    /**
     * Sets the defaultCampaignAccess value for this Organization.
     * 
     * @param defaultCampaignAccess
     */
    public void setDefaultCampaignAccess(java.lang.String defaultCampaignAccess) {
        this.defaultCampaignAccess = defaultCampaignAccess;
    }


    /**
     * Gets the defaultCaseAccess value for this Organization.
     * 
     * @return defaultCaseAccess
     */
    public java.lang.String getDefaultCaseAccess() {
        return defaultCaseAccess;
    }


    /**
     * Sets the defaultCaseAccess value for this Organization.
     * 
     * @param defaultCaseAccess
     */
    public void setDefaultCaseAccess(java.lang.String defaultCaseAccess) {
        this.defaultCaseAccess = defaultCaseAccess;
    }


    /**
     * Gets the defaultContactAccess value for this Organization.
     * 
     * @return defaultContactAccess
     */
    public java.lang.String getDefaultContactAccess() {
        return defaultContactAccess;
    }


    /**
     * Sets the defaultContactAccess value for this Organization.
     * 
     * @param defaultContactAccess
     */
    public void setDefaultContactAccess(java.lang.String defaultContactAccess) {
        this.defaultContactAccess = defaultContactAccess;
    }


    /**
     * Gets the defaultLeadAccess value for this Organization.
     * 
     * @return defaultLeadAccess
     */
    public java.lang.String getDefaultLeadAccess() {
        return defaultLeadAccess;
    }


    /**
     * Sets the defaultLeadAccess value for this Organization.
     * 
     * @param defaultLeadAccess
     */
    public void setDefaultLeadAccess(java.lang.String defaultLeadAccess) {
        this.defaultLeadAccess = defaultLeadAccess;
    }


    /**
     * Gets the defaultLocaleSidKey value for this Organization.
     * 
     * @return defaultLocaleSidKey
     */
    public java.lang.String getDefaultLocaleSidKey() {
        return defaultLocaleSidKey;
    }


    /**
     * Sets the defaultLocaleSidKey value for this Organization.
     * 
     * @param defaultLocaleSidKey
     */
    public void setDefaultLocaleSidKey(java.lang.String defaultLocaleSidKey) {
        this.defaultLocaleSidKey = defaultLocaleSidKey;
    }


    /**
     * Gets the defaultOpportunityAccess value for this Organization.
     * 
     * @return defaultOpportunityAccess
     */
    public java.lang.String getDefaultOpportunityAccess() {
        return defaultOpportunityAccess;
    }


    /**
     * Sets the defaultOpportunityAccess value for this Organization.
     * 
     * @param defaultOpportunityAccess
     */
    public void setDefaultOpportunityAccess(java.lang.String defaultOpportunityAccess) {
        this.defaultOpportunityAccess = defaultOpportunityAccess;
    }


    /**
     * Gets the defaultPricebookAccess value for this Organization.
     * 
     * @return defaultPricebookAccess
     */
    public java.lang.String getDefaultPricebookAccess() {
        return defaultPricebookAccess;
    }


    /**
     * Sets the defaultPricebookAccess value for this Organization.
     * 
     * @param defaultPricebookAccess
     */
    public void setDefaultPricebookAccess(java.lang.String defaultPricebookAccess) {
        this.defaultPricebookAccess = defaultPricebookAccess;
    }


    /**
     * Gets the division value for this Organization.
     * 
     * @return division
     */
    public java.lang.String getDivision() {
        return division;
    }


    /**
     * Sets the division value for this Organization.
     * 
     * @param division
     */
    public void setDivision(java.lang.String division) {
        this.division = division;
    }


    /**
     * Gets the fax value for this Organization.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this Organization.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the fiscalYearStartMonth value for this Organization.
     * 
     * @return fiscalYearStartMonth
     */
    public java.lang.Integer getFiscalYearStartMonth() {
        return fiscalYearStartMonth;
    }


    /**
     * Sets the fiscalYearStartMonth value for this Organization.
     * 
     * @param fiscalYearStartMonth
     */
    public void setFiscalYearStartMonth(java.lang.Integer fiscalYearStartMonth) {
        this.fiscalYearStartMonth = fiscalYearStartMonth;
    }


    /**
     * Gets the languageLocaleKey value for this Organization.
     * 
     * @return languageLocaleKey
     */
    public java.lang.String getLanguageLocaleKey() {
        return languageLocaleKey;
    }


    /**
     * Sets the languageLocaleKey value for this Organization.
     * 
     * @param languageLocaleKey
     */
    public void setLanguageLocaleKey(java.lang.String languageLocaleKey) {
        this.languageLocaleKey = languageLocaleKey;
    }


    /**
     * Gets the lastModifiedBy value for this Organization.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Organization.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Organization.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Organization.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Organization.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Organization.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the monthlyPageViewsEntitlement value for this Organization.
     * 
     * @return monthlyPageViewsEntitlement
     */
    public java.lang.Integer getMonthlyPageViewsEntitlement() {
        return monthlyPageViewsEntitlement;
    }


    /**
     * Sets the monthlyPageViewsEntitlement value for this Organization.
     * 
     * @param monthlyPageViewsEntitlement
     */
    public void setMonthlyPageViewsEntitlement(java.lang.Integer monthlyPageViewsEntitlement) {
        this.monthlyPageViewsEntitlement = monthlyPageViewsEntitlement;
    }


    /**
     * Gets the monthlyPageViewsUsed value for this Organization.
     * 
     * @return monthlyPageViewsUsed
     */
    public java.lang.Integer getMonthlyPageViewsUsed() {
        return monthlyPageViewsUsed;
    }


    /**
     * Sets the monthlyPageViewsUsed value for this Organization.
     * 
     * @param monthlyPageViewsUsed
     */
    public void setMonthlyPageViewsUsed(java.lang.Integer monthlyPageViewsUsed) {
        this.monthlyPageViewsUsed = monthlyPageViewsUsed;
    }


    /**
     * Gets the name value for this Organization.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Organization.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the organizationType value for this Organization.
     * 
     * @return organizationType
     */
    public java.lang.String getOrganizationType() {
        return organizationType;
    }


    /**
     * Sets the organizationType value for this Organization.
     * 
     * @param organizationType
     */
    public void setOrganizationType(java.lang.String organizationType) {
        this.organizationType = organizationType;
    }


    /**
     * Gets the phone value for this Organization.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this Organization.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the postalCode value for this Organization.
     * 
     * @return postalCode
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this Organization.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the preferencesRequireOpportunityProducts value for this Organization.
     * 
     * @return preferencesRequireOpportunityProducts
     */
    public java.lang.Boolean getPreferencesRequireOpportunityProducts() {
        return preferencesRequireOpportunityProducts;
    }


    /**
     * Sets the preferencesRequireOpportunityProducts value for this Organization.
     * 
     * @param preferencesRequireOpportunityProducts
     */
    public void setPreferencesRequireOpportunityProducts(java.lang.Boolean preferencesRequireOpportunityProducts) {
        this.preferencesRequireOpportunityProducts = preferencesRequireOpportunityProducts;
    }


    /**
     * Gets the primaryContact value for this Organization.
     * 
     * @return primaryContact
     */
    public java.lang.String getPrimaryContact() {
        return primaryContact;
    }


    /**
     * Sets the primaryContact value for this Organization.
     * 
     * @param primaryContact
     */
    public void setPrimaryContact(java.lang.String primaryContact) {
        this.primaryContact = primaryContact;
    }


    /**
     * Gets the receivesAdminInfoEmails value for this Organization.
     * 
     * @return receivesAdminInfoEmails
     */
    public java.lang.Boolean getReceivesAdminInfoEmails() {
        return receivesAdminInfoEmails;
    }


    /**
     * Sets the receivesAdminInfoEmails value for this Organization.
     * 
     * @param receivesAdminInfoEmails
     */
    public void setReceivesAdminInfoEmails(java.lang.Boolean receivesAdminInfoEmails) {
        this.receivesAdminInfoEmails = receivesAdminInfoEmails;
    }


    /**
     * Gets the receivesInfoEmails value for this Organization.
     * 
     * @return receivesInfoEmails
     */
    public java.lang.Boolean getReceivesInfoEmails() {
        return receivesInfoEmails;
    }


    /**
     * Sets the receivesInfoEmails value for this Organization.
     * 
     * @param receivesInfoEmails
     */
    public void setReceivesInfoEmails(java.lang.Boolean receivesInfoEmails) {
        this.receivesInfoEmails = receivesInfoEmails;
    }


    /**
     * Gets the state value for this Organization.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Organization.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the street value for this Organization.
     * 
     * @return street
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this Organization.
     * 
     * @param street
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the systemModstamp value for this Organization.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Organization.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the trialExpirationDate value for this Organization.
     * 
     * @return trialExpirationDate
     */
    public java.util.Calendar getTrialExpirationDate() {
        return trialExpirationDate;
    }


    /**
     * Sets the trialExpirationDate value for this Organization.
     * 
     * @param trialExpirationDate
     */
    public void setTrialExpirationDate(java.util.Calendar trialExpirationDate) {
        this.trialExpirationDate = trialExpirationDate;
    }


    /**
     * Gets the uiSkin value for this Organization.
     * 
     * @return uiSkin
     */
    public java.lang.String getUiSkin() {
        return uiSkin;
    }


    /**
     * Sets the uiSkin value for this Organization.
     * 
     * @param uiSkin
     */
    public void setUiSkin(java.lang.String uiSkin) {
        this.uiSkin = uiSkin;
    }


    /**
     * Gets the usesStartDateAsFiscalYearName value for this Organization.
     * 
     * @return usesStartDateAsFiscalYearName
     */
    public java.lang.Boolean getUsesStartDateAsFiscalYearName() {
        return usesStartDateAsFiscalYearName;
    }


    /**
     * Sets the usesStartDateAsFiscalYearName value for this Organization.
     * 
     * @param usesStartDateAsFiscalYearName
     */
    public void setUsesStartDateAsFiscalYearName(java.lang.Boolean usesStartDateAsFiscalYearName) {
        this.usesStartDateAsFiscalYearName = usesStartDateAsFiscalYearName;
    }


    /**
     * Gets the webToCaseDefaultOrigin value for this Organization.
     * 
     * @return webToCaseDefaultOrigin
     */
    public java.lang.String getWebToCaseDefaultOrigin() {
        return webToCaseDefaultOrigin;
    }


    /**
     * Sets the webToCaseDefaultOrigin value for this Organization.
     * 
     * @param webToCaseDefaultOrigin
     */
    public void setWebToCaseDefaultOrigin(java.lang.String webToCaseDefaultOrigin) {
        this.webToCaseDefaultOrigin = webToCaseDefaultOrigin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Organization)) return false;
        Organization other = (Organization) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.complianceBccEmail==null && other.getComplianceBccEmail()==null) || 
             (this.complianceBccEmail!=null &&
              this.complianceBccEmail.equals(other.getComplianceBccEmail()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.defaultAccountAccess==null && other.getDefaultAccountAccess()==null) || 
             (this.defaultAccountAccess!=null &&
              this.defaultAccountAccess.equals(other.getDefaultAccountAccess()))) &&
            ((this.defaultCalendarAccess==null && other.getDefaultCalendarAccess()==null) || 
             (this.defaultCalendarAccess!=null &&
              this.defaultCalendarAccess.equals(other.getDefaultCalendarAccess()))) &&
            ((this.defaultCampaignAccess==null && other.getDefaultCampaignAccess()==null) || 
             (this.defaultCampaignAccess!=null &&
              this.defaultCampaignAccess.equals(other.getDefaultCampaignAccess()))) &&
            ((this.defaultCaseAccess==null && other.getDefaultCaseAccess()==null) || 
             (this.defaultCaseAccess!=null &&
              this.defaultCaseAccess.equals(other.getDefaultCaseAccess()))) &&
            ((this.defaultContactAccess==null && other.getDefaultContactAccess()==null) || 
             (this.defaultContactAccess!=null &&
              this.defaultContactAccess.equals(other.getDefaultContactAccess()))) &&
            ((this.defaultLeadAccess==null && other.getDefaultLeadAccess()==null) || 
             (this.defaultLeadAccess!=null &&
              this.defaultLeadAccess.equals(other.getDefaultLeadAccess()))) &&
            ((this.defaultLocaleSidKey==null && other.getDefaultLocaleSidKey()==null) || 
             (this.defaultLocaleSidKey!=null &&
              this.defaultLocaleSidKey.equals(other.getDefaultLocaleSidKey()))) &&
            ((this.defaultOpportunityAccess==null && other.getDefaultOpportunityAccess()==null) || 
             (this.defaultOpportunityAccess!=null &&
              this.defaultOpportunityAccess.equals(other.getDefaultOpportunityAccess()))) &&
            ((this.defaultPricebookAccess==null && other.getDefaultPricebookAccess()==null) || 
             (this.defaultPricebookAccess!=null &&
              this.defaultPricebookAccess.equals(other.getDefaultPricebookAccess()))) &&
            ((this.division==null && other.getDivision()==null) || 
             (this.division!=null &&
              this.division.equals(other.getDivision()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.fiscalYearStartMonth==null && other.getFiscalYearStartMonth()==null) || 
             (this.fiscalYearStartMonth!=null &&
              this.fiscalYearStartMonth.equals(other.getFiscalYearStartMonth()))) &&
            ((this.languageLocaleKey==null && other.getLanguageLocaleKey()==null) || 
             (this.languageLocaleKey!=null &&
              this.languageLocaleKey.equals(other.getLanguageLocaleKey()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.monthlyPageViewsEntitlement==null && other.getMonthlyPageViewsEntitlement()==null) || 
             (this.monthlyPageViewsEntitlement!=null &&
              this.monthlyPageViewsEntitlement.equals(other.getMonthlyPageViewsEntitlement()))) &&
            ((this.monthlyPageViewsUsed==null && other.getMonthlyPageViewsUsed()==null) || 
             (this.monthlyPageViewsUsed!=null &&
              this.monthlyPageViewsUsed.equals(other.getMonthlyPageViewsUsed()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.organizationType==null && other.getOrganizationType()==null) || 
             (this.organizationType!=null &&
              this.organizationType.equals(other.getOrganizationType()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.preferencesRequireOpportunityProducts==null && other.getPreferencesRequireOpportunityProducts()==null) || 
             (this.preferencesRequireOpportunityProducts!=null &&
              this.preferencesRequireOpportunityProducts.equals(other.getPreferencesRequireOpportunityProducts()))) &&
            ((this.primaryContact==null && other.getPrimaryContact()==null) || 
             (this.primaryContact!=null &&
              this.primaryContact.equals(other.getPrimaryContact()))) &&
            ((this.receivesAdminInfoEmails==null && other.getReceivesAdminInfoEmails()==null) || 
             (this.receivesAdminInfoEmails!=null &&
              this.receivesAdminInfoEmails.equals(other.getReceivesAdminInfoEmails()))) &&
            ((this.receivesInfoEmails==null && other.getReceivesInfoEmails()==null) || 
             (this.receivesInfoEmails!=null &&
              this.receivesInfoEmails.equals(other.getReceivesInfoEmails()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.trialExpirationDate==null && other.getTrialExpirationDate()==null) || 
             (this.trialExpirationDate!=null &&
              this.trialExpirationDate.equals(other.getTrialExpirationDate()))) &&
            ((this.uiSkin==null && other.getUiSkin()==null) || 
             (this.uiSkin!=null &&
              this.uiSkin.equals(other.getUiSkin()))) &&
            ((this.usesStartDateAsFiscalYearName==null && other.getUsesStartDateAsFiscalYearName()==null) || 
             (this.usesStartDateAsFiscalYearName!=null &&
              this.usesStartDateAsFiscalYearName.equals(other.getUsesStartDateAsFiscalYearName()))) &&
            ((this.webToCaseDefaultOrigin==null && other.getWebToCaseDefaultOrigin()==null) || 
             (this.webToCaseDefaultOrigin!=null &&
              this.webToCaseDefaultOrigin.equals(other.getWebToCaseDefaultOrigin())));
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
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getComplianceBccEmail() != null) {
            _hashCode += getComplianceBccEmail().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
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
        if (getDefaultAccountAccess() != null) {
            _hashCode += getDefaultAccountAccess().hashCode();
        }
        if (getDefaultCalendarAccess() != null) {
            _hashCode += getDefaultCalendarAccess().hashCode();
        }
        if (getDefaultCampaignAccess() != null) {
            _hashCode += getDefaultCampaignAccess().hashCode();
        }
        if (getDefaultCaseAccess() != null) {
            _hashCode += getDefaultCaseAccess().hashCode();
        }
        if (getDefaultContactAccess() != null) {
            _hashCode += getDefaultContactAccess().hashCode();
        }
        if (getDefaultLeadAccess() != null) {
            _hashCode += getDefaultLeadAccess().hashCode();
        }
        if (getDefaultLocaleSidKey() != null) {
            _hashCode += getDefaultLocaleSidKey().hashCode();
        }
        if (getDefaultOpportunityAccess() != null) {
            _hashCode += getDefaultOpportunityAccess().hashCode();
        }
        if (getDefaultPricebookAccess() != null) {
            _hashCode += getDefaultPricebookAccess().hashCode();
        }
        if (getDivision() != null) {
            _hashCode += getDivision().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getFiscalYearStartMonth() != null) {
            _hashCode += getFiscalYearStartMonth().hashCode();
        }
        if (getLanguageLocaleKey() != null) {
            _hashCode += getLanguageLocaleKey().hashCode();
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
        if (getMonthlyPageViewsEntitlement() != null) {
            _hashCode += getMonthlyPageViewsEntitlement().hashCode();
        }
        if (getMonthlyPageViewsUsed() != null) {
            _hashCode += getMonthlyPageViewsUsed().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOrganizationType() != null) {
            _hashCode += getOrganizationType().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getPreferencesRequireOpportunityProducts() != null) {
            _hashCode += getPreferencesRequireOpportunityProducts().hashCode();
        }
        if (getPrimaryContact() != null) {
            _hashCode += getPrimaryContact().hashCode();
        }
        if (getReceivesAdminInfoEmails() != null) {
            _hashCode += getReceivesAdminInfoEmails().hashCode();
        }
        if (getReceivesInfoEmails() != null) {
            _hashCode += getReceivesInfoEmails().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTrialExpirationDate() != null) {
            _hashCode += getTrialExpirationDate().hashCode();
        }
        if (getUiSkin() != null) {
            _hashCode += getUiSkin().hashCode();
        }
        if (getUsesStartDateAsFiscalYearName() != null) {
            _hashCode += getUsesStartDateAsFiscalYearName().hashCode();
        }
        if (getWebToCaseDefaultOrigin() != null) {
            _hashCode += getWebToCaseDefaultOrigin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Organization.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Organization"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complianceBccEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ComplianceBccEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("defaultAccountAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DefaultAccountAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultCalendarAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DefaultCalendarAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultCampaignAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DefaultCampaignAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultCaseAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DefaultCaseAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultContactAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DefaultContactAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultLeadAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DefaultLeadAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultLocaleSidKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DefaultLocaleSidKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultOpportunityAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DefaultOpportunityAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultPricebookAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DefaultPricebookAccess"));
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
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fiscalYearStartMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FiscalYearStartMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("monthlyPageViewsEntitlement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MonthlyPageViewsEntitlement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthlyPageViewsUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MonthlyPageViewsUsed"));
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
        elemField.setFieldName("organizationType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OrganizationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferencesRequireOpportunityProducts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PreferencesRequireOpportunityProducts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryContact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PrimaryContact"));
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
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("trialExpirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TrialExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uiSkin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UiSkin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usesStartDateAsFiscalYearName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UsesStartDateAsFiscalYearName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webToCaseDefaultOrigin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "WebToCaseDefaultOrigin"));
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

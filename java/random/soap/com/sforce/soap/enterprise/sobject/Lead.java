/**
 * Lead.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Lead  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private java.lang.String additional_Info__c;

    private java.lang.String alliances_Partnerships__c;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String CEO__c;

    private com.sforce.soap.enterprise.sobject.Campaign campaign;

    private com.sforce.soap.enterprise.QueryResult campaignMembers;

    private java.lang.String city;

    private java.lang.String company;

    private java.lang.String company_Registered_State__c;

    private com.sforce.soap.enterprise.sobject.Account convertedAccount;

    private java.lang.String convertedAccountId;

    private com.sforce.soap.enterprise.sobject.Contact convertedContact;

    private java.lang.String convertedContactId;

    private java.util.Date convertedDate;

    private com.sforce.soap.enterprise.sobject.Opportunity convertedOpportunity;

    private java.lang.String convertedOpportunityId;

    private java.lang.String country;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String currently_Host_Relativity__c;

    private java.lang.String demo__c;

    private com.sforce.soap.enterprise.sobject.Demo__c demo__r;

    private java.lang.String description;

    private java.lang.String desired_Partnership_Benefits__c;

    private java.lang.String dev_Language_Other__c;

    private com.sforce.soap.enterprise.QueryResult dev_Partner_Products__r;

    private java.lang.String dev_Platform_Other__c;

    private java.lang.String development_Languages__c;

    private java.lang.String doing_Business_with_Relativity_Clients__c;

    private java.lang.String email;

    private java.util.Calendar emailBouncedDate;

    private java.lang.String emailBouncedReason;

    private com.sforce.soap.enterprise.QueryResult emailStatuses;

    private com.sforce.soap.enterprise.QueryResult eventRelations;

    private com.sforce.soap.enterprise.QueryResult events;

    private java.lang.String fax;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult feeds;

    private java.lang.String firstName;

    private java.lang.Boolean hasOptedOutOfEmail;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.String how_did_you_hear_about_program__c;

    private java.lang.String industry;

    private java.lang.Boolean isConverted;

    private java.lang.Boolean isDeleted;

    private java.lang.Boolean isUnreadByOwner;

    private java.lang.String jigsaw;

    private java.lang.String jigsawContactId;

    private java.util.Date lastActivityDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String lastName;

    private java.lang.String leadSource;

    private java.lang.String lead_Type__c;

    private com.sforce.soap.enterprise.sobject.Lead masterRecord;

    private java.lang.String masterRecordId;

    private java.lang.String mobilePhone;

    private java.lang.String name;

    private java.lang.String next_Steps__c;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private java.lang.Integer numberOfEmployees;

    private java.lang.Double number_of_Development_Resources__c;

    private com.sforce.soap.enterprise.QueryResult openActivities;

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private java.lang.String phone;

    private java.lang.String platform_Enhancements__c;

    private java.lang.String postalCode;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.String rating;

    private com.sforce.soap.enterprise.sobject.RecordType recordType;

    private java.lang.String recordTypeId;

    private java.lang.String relativity_Assisted_Review_Newsletter__c;

    private java.lang.String relativity_Fest_Newsletter__c;

    private java.lang.String salutation;

    private java.lang.String secondary_Contact_Email__c;

    private java.lang.String secondary_Contact_Name__c;

    private java.lang.String secondary_Contact_Phone__c;

    private java.lang.String secondary_Contact_Title__c;

    private com.sforce.soap.enterprise.QueryResult shares;

    private java.lang.String state;

    private java.lang.String status;

    private java.util.Calendar status_Last_Modified__c;

    private java.lang.String status__c;

    private java.lang.String street;

    private java.util.Calendar systemModstamp;

    private java.lang.String target_Dev_Platform__c;

    private com.sforce.soap.enterprise.QueryResult tasks;

    private java.lang.String title;

    private java.lang.String website;

    private java.lang.Double year_Established__c;

    private java.lang.String blonk_News_and_Press__c;

    private java.lang.Double of_Attorneys__c;

    public Lead() {
    }

    public Lead(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           java.lang.String additional_Info__c,
           java.lang.String alliances_Partnerships__c,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String CEO__c,
           com.sforce.soap.enterprise.sobject.Campaign campaign,
           com.sforce.soap.enterprise.QueryResult campaignMembers,
           java.lang.String city,
           java.lang.String company,
           java.lang.String company_Registered_State__c,
           com.sforce.soap.enterprise.sobject.Account convertedAccount,
           java.lang.String convertedAccountId,
           com.sforce.soap.enterprise.sobject.Contact convertedContact,
           java.lang.String convertedContactId,
           java.util.Date convertedDate,
           com.sforce.soap.enterprise.sobject.Opportunity convertedOpportunity,
           java.lang.String convertedOpportunityId,
           java.lang.String country,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String currently_Host_Relativity__c,
           java.lang.String demo__c,
           com.sforce.soap.enterprise.sobject.Demo__c demo__r,
           java.lang.String description,
           java.lang.String desired_Partnership_Benefits__c,
           java.lang.String dev_Language_Other__c,
           com.sforce.soap.enterprise.QueryResult dev_Partner_Products__r,
           java.lang.String dev_Platform_Other__c,
           java.lang.String development_Languages__c,
           java.lang.String doing_Business_with_Relativity_Clients__c,
           java.lang.String email,
           java.util.Calendar emailBouncedDate,
           java.lang.String emailBouncedReason,
           com.sforce.soap.enterprise.QueryResult emailStatuses,
           com.sforce.soap.enterprise.QueryResult eventRelations,
           com.sforce.soap.enterprise.QueryResult events,
           java.lang.String fax,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult feeds,
           java.lang.String firstName,
           java.lang.Boolean hasOptedOutOfEmail,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.String how_did_you_hear_about_program__c,
           java.lang.String industry,
           java.lang.Boolean isConverted,
           java.lang.Boolean isDeleted,
           java.lang.Boolean isUnreadByOwner,
           java.lang.String jigsaw,
           java.lang.String jigsawContactId,
           java.util.Date lastActivityDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String lastName,
           java.lang.String leadSource,
           java.lang.String lead_Type__c,
           com.sforce.soap.enterprise.sobject.Lead masterRecord,
           java.lang.String masterRecordId,
           java.lang.String mobilePhone,
           java.lang.String name,
           java.lang.String next_Steps__c,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           java.lang.Integer numberOfEmployees,
           java.lang.Double number_of_Development_Resources__c,
           com.sforce.soap.enterprise.QueryResult openActivities,
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           java.lang.String phone,
           java.lang.String platform_Enhancements__c,
           java.lang.String postalCode,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.String rating,
           com.sforce.soap.enterprise.sobject.RecordType recordType,
           java.lang.String recordTypeId,
           java.lang.String relativity_Assisted_Review_Newsletter__c,
           java.lang.String relativity_Fest_Newsletter__c,
           java.lang.String salutation,
           java.lang.String secondary_Contact_Email__c,
           java.lang.String secondary_Contact_Name__c,
           java.lang.String secondary_Contact_Phone__c,
           java.lang.String secondary_Contact_Title__c,
           com.sforce.soap.enterprise.QueryResult shares,
           java.lang.String state,
           java.lang.String status,
           java.util.Calendar status_Last_Modified__c,
           java.lang.String status__c,
           java.lang.String street,
           java.util.Calendar systemModstamp,
           java.lang.String target_Dev_Platform__c,
           com.sforce.soap.enterprise.QueryResult tasks,
           java.lang.String title,
           java.lang.String website,
           java.lang.Double year_Established__c,
           java.lang.String blonk_News_and_Press__c,
           java.lang.Double of_Attorneys__c) {
        super(
            fieldsToNull,
            id);
        this.activityHistories = activityHistories;
        this.additional_Info__c = additional_Info__c;
        this.alliances_Partnerships__c = alliances_Partnerships__c;
        this.attachments = attachments;
        this.CEO__c = CEO__c;
        this.campaign = campaign;
        this.campaignMembers = campaignMembers;
        this.city = city;
        this.company = company;
        this.company_Registered_State__c = company_Registered_State__c;
        this.convertedAccount = convertedAccount;
        this.convertedAccountId = convertedAccountId;
        this.convertedContact = convertedContact;
        this.convertedContactId = convertedContactId;
        this.convertedDate = convertedDate;
        this.convertedOpportunity = convertedOpportunity;
        this.convertedOpportunityId = convertedOpportunityId;
        this.country = country;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.currently_Host_Relativity__c = currently_Host_Relativity__c;
        this.demo__c = demo__c;
        this.demo__r = demo__r;
        this.description = description;
        this.desired_Partnership_Benefits__c = desired_Partnership_Benefits__c;
        this.dev_Language_Other__c = dev_Language_Other__c;
        this.dev_Partner_Products__r = dev_Partner_Products__r;
        this.dev_Platform_Other__c = dev_Platform_Other__c;
        this.development_Languages__c = development_Languages__c;
        this.doing_Business_with_Relativity_Clients__c = doing_Business_with_Relativity_Clients__c;
        this.email = email;
        this.emailBouncedDate = emailBouncedDate;
        this.emailBouncedReason = emailBouncedReason;
        this.emailStatuses = emailStatuses;
        this.eventRelations = eventRelations;
        this.events = events;
        this.fax = fax;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.feeds = feeds;
        this.firstName = firstName;
        this.hasOptedOutOfEmail = hasOptedOutOfEmail;
        this.histories = histories;
        this.how_did_you_hear_about_program__c = how_did_you_hear_about_program__c;
        this.industry = industry;
        this.isConverted = isConverted;
        this.isDeleted = isDeleted;
        this.isUnreadByOwner = isUnreadByOwner;
        this.jigsaw = jigsaw;
        this.jigsawContactId = jigsawContactId;
        this.lastActivityDate = lastActivityDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.lastName = lastName;
        this.leadSource = leadSource;
        this.lead_Type__c = lead_Type__c;
        this.masterRecord = masterRecord;
        this.masterRecordId = masterRecordId;
        this.mobilePhone = mobilePhone;
        this.name = name;
        this.next_Steps__c = next_Steps__c;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.numberOfEmployees = numberOfEmployees;
        this.number_of_Development_Resources__c = number_of_Development_Resources__c;
        this.openActivities = openActivities;
        this.owner = owner;
        this.ownerId = ownerId;
        this.phone = phone;
        this.platform_Enhancements__c = platform_Enhancements__c;
        this.postalCode = postalCode;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.rating = rating;
        this.recordType = recordType;
        this.recordTypeId = recordTypeId;
        this.relativity_Assisted_Review_Newsletter__c = relativity_Assisted_Review_Newsletter__c;
        this.relativity_Fest_Newsletter__c = relativity_Fest_Newsletter__c;
        this.salutation = salutation;
        this.secondary_Contact_Email__c = secondary_Contact_Email__c;
        this.secondary_Contact_Name__c = secondary_Contact_Name__c;
        this.secondary_Contact_Phone__c = secondary_Contact_Phone__c;
        this.secondary_Contact_Title__c = secondary_Contact_Title__c;
        this.shares = shares;
        this.state = state;
        this.status = status;
        this.status_Last_Modified__c = status_Last_Modified__c;
        this.status__c = status__c;
        this.street = street;
        this.systemModstamp = systemModstamp;
        this.target_Dev_Platform__c = target_Dev_Platform__c;
        this.tasks = tasks;
        this.title = title;
        this.website = website;
        this.year_Established__c = year_Established__c;
        this.blonk_News_and_Press__c = blonk_News_and_Press__c;
        this.of_Attorneys__c = of_Attorneys__c;
    }


    /**
     * Gets the activityHistories value for this Lead.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this Lead.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the additional_Info__c value for this Lead.
     * 
     * @return additional_Info__c
     */
    public java.lang.String getAdditional_Info__c() {
        return additional_Info__c;
    }


    /**
     * Sets the additional_Info__c value for this Lead.
     * 
     * @param additional_Info__c
     */
    public void setAdditional_Info__c(java.lang.String additional_Info__c) {
        this.additional_Info__c = additional_Info__c;
    }


    /**
     * Gets the alliances_Partnerships__c value for this Lead.
     * 
     * @return alliances_Partnerships__c
     */
    public java.lang.String getAlliances_Partnerships__c() {
        return alliances_Partnerships__c;
    }


    /**
     * Sets the alliances_Partnerships__c value for this Lead.
     * 
     * @param alliances_Partnerships__c
     */
    public void setAlliances_Partnerships__c(java.lang.String alliances_Partnerships__c) {
        this.alliances_Partnerships__c = alliances_Partnerships__c;
    }


    /**
     * Gets the attachments value for this Lead.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Lead.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the CEO__c value for this Lead.
     * 
     * @return CEO__c
     */
    public java.lang.String getCEO__c() {
        return CEO__c;
    }


    /**
     * Sets the CEO__c value for this Lead.
     * 
     * @param CEO__c
     */
    public void setCEO__c(java.lang.String CEO__c) {
        this.CEO__c = CEO__c;
    }


    /**
     * Gets the campaign value for this Lead.
     * 
     * @return campaign
     */
    public com.sforce.soap.enterprise.sobject.Campaign getCampaign() {
        return campaign;
    }


    /**
     * Sets the campaign value for this Lead.
     * 
     * @param campaign
     */
    public void setCampaign(com.sforce.soap.enterprise.sobject.Campaign campaign) {
        this.campaign = campaign;
    }


    /**
     * Gets the campaignMembers value for this Lead.
     * 
     * @return campaignMembers
     */
    public com.sforce.soap.enterprise.QueryResult getCampaignMembers() {
        return campaignMembers;
    }


    /**
     * Sets the campaignMembers value for this Lead.
     * 
     * @param campaignMembers
     */
    public void setCampaignMembers(com.sforce.soap.enterprise.QueryResult campaignMembers) {
        this.campaignMembers = campaignMembers;
    }


    /**
     * Gets the city value for this Lead.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this Lead.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the company value for this Lead.
     * 
     * @return company
     */
    public java.lang.String getCompany() {
        return company;
    }


    /**
     * Sets the company value for this Lead.
     * 
     * @param company
     */
    public void setCompany(java.lang.String company) {
        this.company = company;
    }


    /**
     * Gets the company_Registered_State__c value for this Lead.
     * 
     * @return company_Registered_State__c
     */
    public java.lang.String getCompany_Registered_State__c() {
        return company_Registered_State__c;
    }


    /**
     * Sets the company_Registered_State__c value for this Lead.
     * 
     * @param company_Registered_State__c
     */
    public void setCompany_Registered_State__c(java.lang.String company_Registered_State__c) {
        this.company_Registered_State__c = company_Registered_State__c;
    }


    /**
     * Gets the convertedAccount value for this Lead.
     * 
     * @return convertedAccount
     */
    public com.sforce.soap.enterprise.sobject.Account getConvertedAccount() {
        return convertedAccount;
    }


    /**
     * Sets the convertedAccount value for this Lead.
     * 
     * @param convertedAccount
     */
    public void setConvertedAccount(com.sforce.soap.enterprise.sobject.Account convertedAccount) {
        this.convertedAccount = convertedAccount;
    }


    /**
     * Gets the convertedAccountId value for this Lead.
     * 
     * @return convertedAccountId
     */
    public java.lang.String getConvertedAccountId() {
        return convertedAccountId;
    }


    /**
     * Sets the convertedAccountId value for this Lead.
     * 
     * @param convertedAccountId
     */
    public void setConvertedAccountId(java.lang.String convertedAccountId) {
        this.convertedAccountId = convertedAccountId;
    }


    /**
     * Gets the convertedContact value for this Lead.
     * 
     * @return convertedContact
     */
    public com.sforce.soap.enterprise.sobject.Contact getConvertedContact() {
        return convertedContact;
    }


    /**
     * Sets the convertedContact value for this Lead.
     * 
     * @param convertedContact
     */
    public void setConvertedContact(com.sforce.soap.enterprise.sobject.Contact convertedContact) {
        this.convertedContact = convertedContact;
    }


    /**
     * Gets the convertedContactId value for this Lead.
     * 
     * @return convertedContactId
     */
    public java.lang.String getConvertedContactId() {
        return convertedContactId;
    }


    /**
     * Sets the convertedContactId value for this Lead.
     * 
     * @param convertedContactId
     */
    public void setConvertedContactId(java.lang.String convertedContactId) {
        this.convertedContactId = convertedContactId;
    }


    /**
     * Gets the convertedDate value for this Lead.
     * 
     * @return convertedDate
     */
    public java.util.Date getConvertedDate() {
        return convertedDate;
    }


    /**
     * Sets the convertedDate value for this Lead.
     * 
     * @param convertedDate
     */
    public void setConvertedDate(java.util.Date convertedDate) {
        this.convertedDate = convertedDate;
    }


    /**
     * Gets the convertedOpportunity value for this Lead.
     * 
     * @return convertedOpportunity
     */
    public com.sforce.soap.enterprise.sobject.Opportunity getConvertedOpportunity() {
        return convertedOpportunity;
    }


    /**
     * Sets the convertedOpportunity value for this Lead.
     * 
     * @param convertedOpportunity
     */
    public void setConvertedOpportunity(com.sforce.soap.enterprise.sobject.Opportunity convertedOpportunity) {
        this.convertedOpportunity = convertedOpportunity;
    }


    /**
     * Gets the convertedOpportunityId value for this Lead.
     * 
     * @return convertedOpportunityId
     */
    public java.lang.String getConvertedOpportunityId() {
        return convertedOpportunityId;
    }


    /**
     * Sets the convertedOpportunityId value for this Lead.
     * 
     * @param convertedOpportunityId
     */
    public void setConvertedOpportunityId(java.lang.String convertedOpportunityId) {
        this.convertedOpportunityId = convertedOpportunityId;
    }


    /**
     * Gets the country value for this Lead.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this Lead.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the createdBy value for this Lead.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Lead.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Lead.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Lead.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Lead.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Lead.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the currently_Host_Relativity__c value for this Lead.
     * 
     * @return currently_Host_Relativity__c
     */
    public java.lang.String getCurrently_Host_Relativity__c() {
        return currently_Host_Relativity__c;
    }


    /**
     * Sets the currently_Host_Relativity__c value for this Lead.
     * 
     * @param currently_Host_Relativity__c
     */
    public void setCurrently_Host_Relativity__c(java.lang.String currently_Host_Relativity__c) {
        this.currently_Host_Relativity__c = currently_Host_Relativity__c;
    }


    /**
     * Gets the demo__c value for this Lead.
     * 
     * @return demo__c
     */
    public java.lang.String getDemo__c() {
        return demo__c;
    }


    /**
     * Sets the demo__c value for this Lead.
     * 
     * @param demo__c
     */
    public void setDemo__c(java.lang.String demo__c) {
        this.demo__c = demo__c;
    }


    /**
     * Gets the demo__r value for this Lead.
     * 
     * @return demo__r
     */
    public com.sforce.soap.enterprise.sobject.Demo__c getDemo__r() {
        return demo__r;
    }


    /**
     * Sets the demo__r value for this Lead.
     * 
     * @param demo__r
     */
    public void setDemo__r(com.sforce.soap.enterprise.sobject.Demo__c demo__r) {
        this.demo__r = demo__r;
    }


    /**
     * Gets the description value for this Lead.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Lead.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the desired_Partnership_Benefits__c value for this Lead.
     * 
     * @return desired_Partnership_Benefits__c
     */
    public java.lang.String getDesired_Partnership_Benefits__c() {
        return desired_Partnership_Benefits__c;
    }


    /**
     * Sets the desired_Partnership_Benefits__c value for this Lead.
     * 
     * @param desired_Partnership_Benefits__c
     */
    public void setDesired_Partnership_Benefits__c(java.lang.String desired_Partnership_Benefits__c) {
        this.desired_Partnership_Benefits__c = desired_Partnership_Benefits__c;
    }


    /**
     * Gets the dev_Language_Other__c value for this Lead.
     * 
     * @return dev_Language_Other__c
     */
    public java.lang.String getDev_Language_Other__c() {
        return dev_Language_Other__c;
    }


    /**
     * Sets the dev_Language_Other__c value for this Lead.
     * 
     * @param dev_Language_Other__c
     */
    public void setDev_Language_Other__c(java.lang.String dev_Language_Other__c) {
        this.dev_Language_Other__c = dev_Language_Other__c;
    }


    /**
     * Gets the dev_Partner_Products__r value for this Lead.
     * 
     * @return dev_Partner_Products__r
     */
    public com.sforce.soap.enterprise.QueryResult getDev_Partner_Products__r() {
        return dev_Partner_Products__r;
    }


    /**
     * Sets the dev_Partner_Products__r value for this Lead.
     * 
     * @param dev_Partner_Products__r
     */
    public void setDev_Partner_Products__r(com.sforce.soap.enterprise.QueryResult dev_Partner_Products__r) {
        this.dev_Partner_Products__r = dev_Partner_Products__r;
    }


    /**
     * Gets the dev_Platform_Other__c value for this Lead.
     * 
     * @return dev_Platform_Other__c
     */
    public java.lang.String getDev_Platform_Other__c() {
        return dev_Platform_Other__c;
    }


    /**
     * Sets the dev_Platform_Other__c value for this Lead.
     * 
     * @param dev_Platform_Other__c
     */
    public void setDev_Platform_Other__c(java.lang.String dev_Platform_Other__c) {
        this.dev_Platform_Other__c = dev_Platform_Other__c;
    }


    /**
     * Gets the development_Languages__c value for this Lead.
     * 
     * @return development_Languages__c
     */
    public java.lang.String getDevelopment_Languages__c() {
        return development_Languages__c;
    }


    /**
     * Sets the development_Languages__c value for this Lead.
     * 
     * @param development_Languages__c
     */
    public void setDevelopment_Languages__c(java.lang.String development_Languages__c) {
        this.development_Languages__c = development_Languages__c;
    }


    /**
     * Gets the doing_Business_with_Relativity_Clients__c value for this Lead.
     * 
     * @return doing_Business_with_Relativity_Clients__c
     */
    public java.lang.String getDoing_Business_with_Relativity_Clients__c() {
        return doing_Business_with_Relativity_Clients__c;
    }


    /**
     * Sets the doing_Business_with_Relativity_Clients__c value for this Lead.
     * 
     * @param doing_Business_with_Relativity_Clients__c
     */
    public void setDoing_Business_with_Relativity_Clients__c(java.lang.String doing_Business_with_Relativity_Clients__c) {
        this.doing_Business_with_Relativity_Clients__c = doing_Business_with_Relativity_Clients__c;
    }


    /**
     * Gets the email value for this Lead.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Lead.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the emailBouncedDate value for this Lead.
     * 
     * @return emailBouncedDate
     */
    public java.util.Calendar getEmailBouncedDate() {
        return emailBouncedDate;
    }


    /**
     * Sets the emailBouncedDate value for this Lead.
     * 
     * @param emailBouncedDate
     */
    public void setEmailBouncedDate(java.util.Calendar emailBouncedDate) {
        this.emailBouncedDate = emailBouncedDate;
    }


    /**
     * Gets the emailBouncedReason value for this Lead.
     * 
     * @return emailBouncedReason
     */
    public java.lang.String getEmailBouncedReason() {
        return emailBouncedReason;
    }


    /**
     * Sets the emailBouncedReason value for this Lead.
     * 
     * @param emailBouncedReason
     */
    public void setEmailBouncedReason(java.lang.String emailBouncedReason) {
        this.emailBouncedReason = emailBouncedReason;
    }


    /**
     * Gets the emailStatuses value for this Lead.
     * 
     * @return emailStatuses
     */
    public com.sforce.soap.enterprise.QueryResult getEmailStatuses() {
        return emailStatuses;
    }


    /**
     * Sets the emailStatuses value for this Lead.
     * 
     * @param emailStatuses
     */
    public void setEmailStatuses(com.sforce.soap.enterprise.QueryResult emailStatuses) {
        this.emailStatuses = emailStatuses;
    }


    /**
     * Gets the eventRelations value for this Lead.
     * 
     * @return eventRelations
     */
    public com.sforce.soap.enterprise.QueryResult getEventRelations() {
        return eventRelations;
    }


    /**
     * Sets the eventRelations value for this Lead.
     * 
     * @param eventRelations
     */
    public void setEventRelations(com.sforce.soap.enterprise.QueryResult eventRelations) {
        this.eventRelations = eventRelations;
    }


    /**
     * Gets the events value for this Lead.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Lead.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the fax value for this Lead.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this Lead.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Lead.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Lead.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the feeds value for this Lead.
     * 
     * @return feeds
     */
    public com.sforce.soap.enterprise.QueryResult getFeeds() {
        return feeds;
    }


    /**
     * Sets the feeds value for this Lead.
     * 
     * @param feeds
     */
    public void setFeeds(com.sforce.soap.enterprise.QueryResult feeds) {
        this.feeds = feeds;
    }


    /**
     * Gets the firstName value for this Lead.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this Lead.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the hasOptedOutOfEmail value for this Lead.
     * 
     * @return hasOptedOutOfEmail
     */
    public java.lang.Boolean getHasOptedOutOfEmail() {
        return hasOptedOutOfEmail;
    }


    /**
     * Sets the hasOptedOutOfEmail value for this Lead.
     * 
     * @param hasOptedOutOfEmail
     */
    public void setHasOptedOutOfEmail(java.lang.Boolean hasOptedOutOfEmail) {
        this.hasOptedOutOfEmail = hasOptedOutOfEmail;
    }


    /**
     * Gets the histories value for this Lead.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Lead.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the how_did_you_hear_about_program__c value for this Lead.
     * 
     * @return how_did_you_hear_about_program__c
     */
    public java.lang.String getHow_did_you_hear_about_program__c() {
        return how_did_you_hear_about_program__c;
    }


    /**
     * Sets the how_did_you_hear_about_program__c value for this Lead.
     * 
     * @param how_did_you_hear_about_program__c
     */
    public void setHow_did_you_hear_about_program__c(java.lang.String how_did_you_hear_about_program__c) {
        this.how_did_you_hear_about_program__c = how_did_you_hear_about_program__c;
    }


    /**
     * Gets the industry value for this Lead.
     * 
     * @return industry
     */
    public java.lang.String getIndustry() {
        return industry;
    }


    /**
     * Sets the industry value for this Lead.
     * 
     * @param industry
     */
    public void setIndustry(java.lang.String industry) {
        this.industry = industry;
    }


    /**
     * Gets the isConverted value for this Lead.
     * 
     * @return isConverted
     */
    public java.lang.Boolean getIsConverted() {
        return isConverted;
    }


    /**
     * Sets the isConverted value for this Lead.
     * 
     * @param isConverted
     */
    public void setIsConverted(java.lang.Boolean isConverted) {
        this.isConverted = isConverted;
    }


    /**
     * Gets the isDeleted value for this Lead.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Lead.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the isUnreadByOwner value for this Lead.
     * 
     * @return isUnreadByOwner
     */
    public java.lang.Boolean getIsUnreadByOwner() {
        return isUnreadByOwner;
    }


    /**
     * Sets the isUnreadByOwner value for this Lead.
     * 
     * @param isUnreadByOwner
     */
    public void setIsUnreadByOwner(java.lang.Boolean isUnreadByOwner) {
        this.isUnreadByOwner = isUnreadByOwner;
    }


    /**
     * Gets the jigsaw value for this Lead.
     * 
     * @return jigsaw
     */
    public java.lang.String getJigsaw() {
        return jigsaw;
    }


    /**
     * Sets the jigsaw value for this Lead.
     * 
     * @param jigsaw
     */
    public void setJigsaw(java.lang.String jigsaw) {
        this.jigsaw = jigsaw;
    }


    /**
     * Gets the jigsawContactId value for this Lead.
     * 
     * @return jigsawContactId
     */
    public java.lang.String getJigsawContactId() {
        return jigsawContactId;
    }


    /**
     * Sets the jigsawContactId value for this Lead.
     * 
     * @param jigsawContactId
     */
    public void setJigsawContactId(java.lang.String jigsawContactId) {
        this.jigsawContactId = jigsawContactId;
    }


    /**
     * Gets the lastActivityDate value for this Lead.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Lead.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this Lead.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Lead.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Lead.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Lead.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Lead.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Lead.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lastName value for this Lead.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this Lead.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the leadSource value for this Lead.
     * 
     * @return leadSource
     */
    public java.lang.String getLeadSource() {
        return leadSource;
    }


    /**
     * Sets the leadSource value for this Lead.
     * 
     * @param leadSource
     */
    public void setLeadSource(java.lang.String leadSource) {
        this.leadSource = leadSource;
    }


    /**
     * Gets the lead_Type__c value for this Lead.
     * 
     * @return lead_Type__c
     */
    public java.lang.String getLead_Type__c() {
        return lead_Type__c;
    }


    /**
     * Sets the lead_Type__c value for this Lead.
     * 
     * @param lead_Type__c
     */
    public void setLead_Type__c(java.lang.String lead_Type__c) {
        this.lead_Type__c = lead_Type__c;
    }


    /**
     * Gets the masterRecord value for this Lead.
     * 
     * @return masterRecord
     */
    public com.sforce.soap.enterprise.sobject.Lead getMasterRecord() {
        return masterRecord;
    }


    /**
     * Sets the masterRecord value for this Lead.
     * 
     * @param masterRecord
     */
    public void setMasterRecord(com.sforce.soap.enterprise.sobject.Lead masterRecord) {
        this.masterRecord = masterRecord;
    }


    /**
     * Gets the masterRecordId value for this Lead.
     * 
     * @return masterRecordId
     */
    public java.lang.String getMasterRecordId() {
        return masterRecordId;
    }


    /**
     * Sets the masterRecordId value for this Lead.
     * 
     * @param masterRecordId
     */
    public void setMasterRecordId(java.lang.String masterRecordId) {
        this.masterRecordId = masterRecordId;
    }


    /**
     * Gets the mobilePhone value for this Lead.
     * 
     * @return mobilePhone
     */
    public java.lang.String getMobilePhone() {
        return mobilePhone;
    }


    /**
     * Sets the mobilePhone value for this Lead.
     * 
     * @param mobilePhone
     */
    public void setMobilePhone(java.lang.String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }


    /**
     * Gets the name value for this Lead.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Lead.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the next_Steps__c value for this Lead.
     * 
     * @return next_Steps__c
     */
    public java.lang.String getNext_Steps__c() {
        return next_Steps__c;
    }


    /**
     * Sets the next_Steps__c value for this Lead.
     * 
     * @param next_Steps__c
     */
    public void setNext_Steps__c(java.lang.String next_Steps__c) {
        this.next_Steps__c = next_Steps__c;
    }


    /**
     * Gets the notes value for this Lead.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Lead.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Lead.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Lead.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the numberOfEmployees value for this Lead.
     * 
     * @return numberOfEmployees
     */
    public java.lang.Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }


    /**
     * Sets the numberOfEmployees value for this Lead.
     * 
     * @param numberOfEmployees
     */
    public void setNumberOfEmployees(java.lang.Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }


    /**
     * Gets the number_of_Development_Resources__c value for this Lead.
     * 
     * @return number_of_Development_Resources__c
     */
    public java.lang.Double getNumber_of_Development_Resources__c() {
        return number_of_Development_Resources__c;
    }


    /**
     * Sets the number_of_Development_Resources__c value for this Lead.
     * 
     * @param number_of_Development_Resources__c
     */
    public void setNumber_of_Development_Resources__c(java.lang.Double number_of_Development_Resources__c) {
        this.number_of_Development_Resources__c = number_of_Development_Resources__c;
    }


    /**
     * Gets the openActivities value for this Lead.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this Lead.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the owner value for this Lead.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Lead.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Lead.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Lead.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the phone value for this Lead.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this Lead.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the platform_Enhancements__c value for this Lead.
     * 
     * @return platform_Enhancements__c
     */
    public java.lang.String getPlatform_Enhancements__c() {
        return platform_Enhancements__c;
    }


    /**
     * Sets the platform_Enhancements__c value for this Lead.
     * 
     * @param platform_Enhancements__c
     */
    public void setPlatform_Enhancements__c(java.lang.String platform_Enhancements__c) {
        this.platform_Enhancements__c = platform_Enhancements__c;
    }


    /**
     * Gets the postalCode value for this Lead.
     * 
     * @return postalCode
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this Lead.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the processInstances value for this Lead.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Lead.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Lead.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Lead.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the rating value for this Lead.
     * 
     * @return rating
     */
    public java.lang.String getRating() {
        return rating;
    }


    /**
     * Sets the rating value for this Lead.
     * 
     * @param rating
     */
    public void setRating(java.lang.String rating) {
        this.rating = rating;
    }


    /**
     * Gets the recordType value for this Lead.
     * 
     * @return recordType
     */
    public com.sforce.soap.enterprise.sobject.RecordType getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this Lead.
     * 
     * @param recordType
     */
    public void setRecordType(com.sforce.soap.enterprise.sobject.RecordType recordType) {
        this.recordType = recordType;
    }


    /**
     * Gets the recordTypeId value for this Lead.
     * 
     * @return recordTypeId
     */
    public java.lang.String getRecordTypeId() {
        return recordTypeId;
    }


    /**
     * Sets the recordTypeId value for this Lead.
     * 
     * @param recordTypeId
     */
    public void setRecordTypeId(java.lang.String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }


    /**
     * Gets the relativity_Assisted_Review_Newsletter__c value for this Lead.
     * 
     * @return relativity_Assisted_Review_Newsletter__c
     */
    public java.lang.String getRelativity_Assisted_Review_Newsletter__c() {
        return relativity_Assisted_Review_Newsletter__c;
    }


    /**
     * Sets the relativity_Assisted_Review_Newsletter__c value for this Lead.
     * 
     * @param relativity_Assisted_Review_Newsletter__c
     */
    public void setRelativity_Assisted_Review_Newsletter__c(java.lang.String relativity_Assisted_Review_Newsletter__c) {
        this.relativity_Assisted_Review_Newsletter__c = relativity_Assisted_Review_Newsletter__c;
    }


    /**
     * Gets the relativity_Fest_Newsletter__c value for this Lead.
     * 
     * @return relativity_Fest_Newsletter__c
     */
    public java.lang.String getRelativity_Fest_Newsletter__c() {
        return relativity_Fest_Newsletter__c;
    }


    /**
     * Sets the relativity_Fest_Newsletter__c value for this Lead.
     * 
     * @param relativity_Fest_Newsletter__c
     */
    public void setRelativity_Fest_Newsletter__c(java.lang.String relativity_Fest_Newsletter__c) {
        this.relativity_Fest_Newsletter__c = relativity_Fest_Newsletter__c;
    }


    /**
     * Gets the salutation value for this Lead.
     * 
     * @return salutation
     */
    public java.lang.String getSalutation() {
        return salutation;
    }


    /**
     * Sets the salutation value for this Lead.
     * 
     * @param salutation
     */
    public void setSalutation(java.lang.String salutation) {
        this.salutation = salutation;
    }


    /**
     * Gets the secondary_Contact_Email__c value for this Lead.
     * 
     * @return secondary_Contact_Email__c
     */
    public java.lang.String getSecondary_Contact_Email__c() {
        return secondary_Contact_Email__c;
    }


    /**
     * Sets the secondary_Contact_Email__c value for this Lead.
     * 
     * @param secondary_Contact_Email__c
     */
    public void setSecondary_Contact_Email__c(java.lang.String secondary_Contact_Email__c) {
        this.secondary_Contact_Email__c = secondary_Contact_Email__c;
    }


    /**
     * Gets the secondary_Contact_Name__c value for this Lead.
     * 
     * @return secondary_Contact_Name__c
     */
    public java.lang.String getSecondary_Contact_Name__c() {
        return secondary_Contact_Name__c;
    }


    /**
     * Sets the secondary_Contact_Name__c value for this Lead.
     * 
     * @param secondary_Contact_Name__c
     */
    public void setSecondary_Contact_Name__c(java.lang.String secondary_Contact_Name__c) {
        this.secondary_Contact_Name__c = secondary_Contact_Name__c;
    }


    /**
     * Gets the secondary_Contact_Phone__c value for this Lead.
     * 
     * @return secondary_Contact_Phone__c
     */
    public java.lang.String getSecondary_Contact_Phone__c() {
        return secondary_Contact_Phone__c;
    }


    /**
     * Sets the secondary_Contact_Phone__c value for this Lead.
     * 
     * @param secondary_Contact_Phone__c
     */
    public void setSecondary_Contact_Phone__c(java.lang.String secondary_Contact_Phone__c) {
        this.secondary_Contact_Phone__c = secondary_Contact_Phone__c;
    }


    /**
     * Gets the secondary_Contact_Title__c value for this Lead.
     * 
     * @return secondary_Contact_Title__c
     */
    public java.lang.String getSecondary_Contact_Title__c() {
        return secondary_Contact_Title__c;
    }


    /**
     * Sets the secondary_Contact_Title__c value for this Lead.
     * 
     * @param secondary_Contact_Title__c
     */
    public void setSecondary_Contact_Title__c(java.lang.String secondary_Contact_Title__c) {
        this.secondary_Contact_Title__c = secondary_Contact_Title__c;
    }


    /**
     * Gets the shares value for this Lead.
     * 
     * @return shares
     */
    public com.sforce.soap.enterprise.QueryResult getShares() {
        return shares;
    }


    /**
     * Sets the shares value for this Lead.
     * 
     * @param shares
     */
    public void setShares(com.sforce.soap.enterprise.QueryResult shares) {
        this.shares = shares;
    }


    /**
     * Gets the state value for this Lead.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Lead.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the status value for this Lead.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Lead.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the status_Last_Modified__c value for this Lead.
     * 
     * @return status_Last_Modified__c
     */
    public java.util.Calendar getStatus_Last_Modified__c() {
        return status_Last_Modified__c;
    }


    /**
     * Sets the status_Last_Modified__c value for this Lead.
     * 
     * @param status_Last_Modified__c
     */
    public void setStatus_Last_Modified__c(java.util.Calendar status_Last_Modified__c) {
        this.status_Last_Modified__c = status_Last_Modified__c;
    }


    /**
     * Gets the status__c value for this Lead.
     * 
     * @return status__c
     */
    public java.lang.String getStatus__c() {
        return status__c;
    }


    /**
     * Sets the status__c value for this Lead.
     * 
     * @param status__c
     */
    public void setStatus__c(java.lang.String status__c) {
        this.status__c = status__c;
    }


    /**
     * Gets the street value for this Lead.
     * 
     * @return street
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this Lead.
     * 
     * @param street
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the systemModstamp value for this Lead.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Lead.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the target_Dev_Platform__c value for this Lead.
     * 
     * @return target_Dev_Platform__c
     */
    public java.lang.String getTarget_Dev_Platform__c() {
        return target_Dev_Platform__c;
    }


    /**
     * Sets the target_Dev_Platform__c value for this Lead.
     * 
     * @param target_Dev_Platform__c
     */
    public void setTarget_Dev_Platform__c(java.lang.String target_Dev_Platform__c) {
        this.target_Dev_Platform__c = target_Dev_Platform__c;
    }


    /**
     * Gets the tasks value for this Lead.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Lead.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the title value for this Lead.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Lead.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the website value for this Lead.
     * 
     * @return website
     */
    public java.lang.String getWebsite() {
        return website;
    }


    /**
     * Sets the website value for this Lead.
     * 
     * @param website
     */
    public void setWebsite(java.lang.String website) {
        this.website = website;
    }


    /**
     * Gets the year_Established__c value for this Lead.
     * 
     * @return year_Established__c
     */
    public java.lang.Double getYear_Established__c() {
        return year_Established__c;
    }


    /**
     * Sets the year_Established__c value for this Lead.
     * 
     * @param year_Established__c
     */
    public void setYear_Established__c(java.lang.Double year_Established__c) {
        this.year_Established__c = year_Established__c;
    }


    /**
     * Gets the blonk_News_and_Press__c value for this Lead.
     * 
     * @return blonk_News_and_Press__c
     */
    public java.lang.String getKCura_News_and_Press__c() {
        return blonk_News_and_Press__c;
    }


    /**
     * Sets the blonk_News_and_Press__c value for this Lead.
     * 
     * @param blonk_News_and_Press__c
     */
    public void setKCura_News_and_Press__c(java.lang.String blonk_News_and_Press__c) {
        this.blonk_News_and_Press__c = blonk_News_and_Press__c;
    }


    /**
     * Gets the of_Attorneys__c value for this Lead.
     * 
     * @return of_Attorneys__c
     */
    public java.lang.Double getOf_Attorneys__c() {
        return of_Attorneys__c;
    }


    /**
     * Sets the of_Attorneys__c value for this Lead.
     * 
     * @param of_Attorneys__c
     */
    public void setOf_Attorneys__c(java.lang.Double of_Attorneys__c) {
        this.of_Attorneys__c = of_Attorneys__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Lead)) return false;
        Lead other = (Lead) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.activityHistories==null && other.getActivityHistories()==null) || 
             (this.activityHistories!=null &&
              this.activityHistories.equals(other.getActivityHistories()))) &&
            ((this.additional_Info__c==null && other.getAdditional_Info__c()==null) || 
             (this.additional_Info__c!=null &&
              this.additional_Info__c.equals(other.getAdditional_Info__c()))) &&
            ((this.alliances_Partnerships__c==null && other.getAlliances_Partnerships__c()==null) || 
             (this.alliances_Partnerships__c!=null &&
              this.alliances_Partnerships__c.equals(other.getAlliances_Partnerships__c()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.CEO__c==null && other.getCEO__c()==null) || 
             (this.CEO__c!=null &&
              this.CEO__c.equals(other.getCEO__c()))) &&
            ((this.campaign==null && other.getCampaign()==null) || 
             (this.campaign!=null &&
              this.campaign.equals(other.getCampaign()))) &&
            ((this.campaignMembers==null && other.getCampaignMembers()==null) || 
             (this.campaignMembers!=null &&
              this.campaignMembers.equals(other.getCampaignMembers()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.company_Registered_State__c==null && other.getCompany_Registered_State__c()==null) || 
             (this.company_Registered_State__c!=null &&
              this.company_Registered_State__c.equals(other.getCompany_Registered_State__c()))) &&
            ((this.convertedAccount==null && other.getConvertedAccount()==null) || 
             (this.convertedAccount!=null &&
              this.convertedAccount.equals(other.getConvertedAccount()))) &&
            ((this.convertedAccountId==null && other.getConvertedAccountId()==null) || 
             (this.convertedAccountId!=null &&
              this.convertedAccountId.equals(other.getConvertedAccountId()))) &&
            ((this.convertedContact==null && other.getConvertedContact()==null) || 
             (this.convertedContact!=null &&
              this.convertedContact.equals(other.getConvertedContact()))) &&
            ((this.convertedContactId==null && other.getConvertedContactId()==null) || 
             (this.convertedContactId!=null &&
              this.convertedContactId.equals(other.getConvertedContactId()))) &&
            ((this.convertedDate==null && other.getConvertedDate()==null) || 
             (this.convertedDate!=null &&
              this.convertedDate.equals(other.getConvertedDate()))) &&
            ((this.convertedOpportunity==null && other.getConvertedOpportunity()==null) || 
             (this.convertedOpportunity!=null &&
              this.convertedOpportunity.equals(other.getConvertedOpportunity()))) &&
            ((this.convertedOpportunityId==null && other.getConvertedOpportunityId()==null) || 
             (this.convertedOpportunityId!=null &&
              this.convertedOpportunityId.equals(other.getConvertedOpportunityId()))) &&
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
            ((this.currently_Host_Relativity__c==null && other.getCurrently_Host_Relativity__c()==null) || 
             (this.currently_Host_Relativity__c!=null &&
              this.currently_Host_Relativity__c.equals(other.getCurrently_Host_Relativity__c()))) &&
            ((this.demo__c==null && other.getDemo__c()==null) || 
             (this.demo__c!=null &&
              this.demo__c.equals(other.getDemo__c()))) &&
            ((this.demo__r==null && other.getDemo__r()==null) || 
             (this.demo__r!=null &&
              this.demo__r.equals(other.getDemo__r()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.desired_Partnership_Benefits__c==null && other.getDesired_Partnership_Benefits__c()==null) || 
             (this.desired_Partnership_Benefits__c!=null &&
              this.desired_Partnership_Benefits__c.equals(other.getDesired_Partnership_Benefits__c()))) &&
            ((this.dev_Language_Other__c==null && other.getDev_Language_Other__c()==null) || 
             (this.dev_Language_Other__c!=null &&
              this.dev_Language_Other__c.equals(other.getDev_Language_Other__c()))) &&
            ((this.dev_Partner_Products__r==null && other.getDev_Partner_Products__r()==null) || 
             (this.dev_Partner_Products__r!=null &&
              this.dev_Partner_Products__r.equals(other.getDev_Partner_Products__r()))) &&
            ((this.dev_Platform_Other__c==null && other.getDev_Platform_Other__c()==null) || 
             (this.dev_Platform_Other__c!=null &&
              this.dev_Platform_Other__c.equals(other.getDev_Platform_Other__c()))) &&
            ((this.development_Languages__c==null && other.getDevelopment_Languages__c()==null) || 
             (this.development_Languages__c!=null &&
              this.development_Languages__c.equals(other.getDevelopment_Languages__c()))) &&
            ((this.doing_Business_with_Relativity_Clients__c==null && other.getDoing_Business_with_Relativity_Clients__c()==null) || 
             (this.doing_Business_with_Relativity_Clients__c!=null &&
              this.doing_Business_with_Relativity_Clients__c.equals(other.getDoing_Business_with_Relativity_Clients__c()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.emailBouncedDate==null && other.getEmailBouncedDate()==null) || 
             (this.emailBouncedDate!=null &&
              this.emailBouncedDate.equals(other.getEmailBouncedDate()))) &&
            ((this.emailBouncedReason==null && other.getEmailBouncedReason()==null) || 
             (this.emailBouncedReason!=null &&
              this.emailBouncedReason.equals(other.getEmailBouncedReason()))) &&
            ((this.emailStatuses==null && other.getEmailStatuses()==null) || 
             (this.emailStatuses!=null &&
              this.emailStatuses.equals(other.getEmailStatuses()))) &&
            ((this.eventRelations==null && other.getEventRelations()==null) || 
             (this.eventRelations!=null &&
              this.eventRelations.equals(other.getEventRelations()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              this.events.equals(other.getEvents()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.feeds==null && other.getFeeds()==null) || 
             (this.feeds!=null &&
              this.feeds.equals(other.getFeeds()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.hasOptedOutOfEmail==null && other.getHasOptedOutOfEmail()==null) || 
             (this.hasOptedOutOfEmail!=null &&
              this.hasOptedOutOfEmail.equals(other.getHasOptedOutOfEmail()))) &&
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
            ((this.how_did_you_hear_about_program__c==null && other.getHow_did_you_hear_about_program__c()==null) || 
             (this.how_did_you_hear_about_program__c!=null &&
              this.how_did_you_hear_about_program__c.equals(other.getHow_did_you_hear_about_program__c()))) &&
            ((this.industry==null && other.getIndustry()==null) || 
             (this.industry!=null &&
              this.industry.equals(other.getIndustry()))) &&
            ((this.isConverted==null && other.getIsConverted()==null) || 
             (this.isConverted!=null &&
              this.isConverted.equals(other.getIsConverted()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.isUnreadByOwner==null && other.getIsUnreadByOwner()==null) || 
             (this.isUnreadByOwner!=null &&
              this.isUnreadByOwner.equals(other.getIsUnreadByOwner()))) &&
            ((this.jigsaw==null && other.getJigsaw()==null) || 
             (this.jigsaw!=null &&
              this.jigsaw.equals(other.getJigsaw()))) &&
            ((this.jigsawContactId==null && other.getJigsawContactId()==null) || 
             (this.jigsawContactId!=null &&
              this.jigsawContactId.equals(other.getJigsawContactId()))) &&
            ((this.lastActivityDate==null && other.getLastActivityDate()==null) || 
             (this.lastActivityDate!=null &&
              this.lastActivityDate.equals(other.getLastActivityDate()))) &&
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
            ((this.leadSource==null && other.getLeadSource()==null) || 
             (this.leadSource!=null &&
              this.leadSource.equals(other.getLeadSource()))) &&
            ((this.lead_Type__c==null && other.getLead_Type__c()==null) || 
             (this.lead_Type__c!=null &&
              this.lead_Type__c.equals(other.getLead_Type__c()))) &&
            ((this.masterRecord==null && other.getMasterRecord()==null) || 
             (this.masterRecord!=null &&
              this.masterRecord.equals(other.getMasterRecord()))) &&
            ((this.masterRecordId==null && other.getMasterRecordId()==null) || 
             (this.masterRecordId!=null &&
              this.masterRecordId.equals(other.getMasterRecordId()))) &&
            ((this.mobilePhone==null && other.getMobilePhone()==null) || 
             (this.mobilePhone!=null &&
              this.mobilePhone.equals(other.getMobilePhone()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.next_Steps__c==null && other.getNext_Steps__c()==null) || 
             (this.next_Steps__c!=null &&
              this.next_Steps__c.equals(other.getNext_Steps__c()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.numberOfEmployees==null && other.getNumberOfEmployees()==null) || 
             (this.numberOfEmployees!=null &&
              this.numberOfEmployees.equals(other.getNumberOfEmployees()))) &&
            ((this.number_of_Development_Resources__c==null && other.getNumber_of_Development_Resources__c()==null) || 
             (this.number_of_Development_Resources__c!=null &&
              this.number_of_Development_Resources__c.equals(other.getNumber_of_Development_Resources__c()))) &&
            ((this.openActivities==null && other.getOpenActivities()==null) || 
             (this.openActivities!=null &&
              this.openActivities.equals(other.getOpenActivities()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.platform_Enhancements__c==null && other.getPlatform_Enhancements__c()==null) || 
             (this.platform_Enhancements__c!=null &&
              this.platform_Enhancements__c.equals(other.getPlatform_Enhancements__c()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.rating==null && other.getRating()==null) || 
             (this.rating!=null &&
              this.rating.equals(other.getRating()))) &&
            ((this.recordType==null && other.getRecordType()==null) || 
             (this.recordType!=null &&
              this.recordType.equals(other.getRecordType()))) &&
            ((this.recordTypeId==null && other.getRecordTypeId()==null) || 
             (this.recordTypeId!=null &&
              this.recordTypeId.equals(other.getRecordTypeId()))) &&
            ((this.relativity_Assisted_Review_Newsletter__c==null && other.getRelativity_Assisted_Review_Newsletter__c()==null) || 
             (this.relativity_Assisted_Review_Newsletter__c!=null &&
              this.relativity_Assisted_Review_Newsletter__c.equals(other.getRelativity_Assisted_Review_Newsletter__c()))) &&
            ((this.relativity_Fest_Newsletter__c==null && other.getRelativity_Fest_Newsletter__c()==null) || 
             (this.relativity_Fest_Newsletter__c!=null &&
              this.relativity_Fest_Newsletter__c.equals(other.getRelativity_Fest_Newsletter__c()))) &&
            ((this.salutation==null && other.getSalutation()==null) || 
             (this.salutation!=null &&
              this.salutation.equals(other.getSalutation()))) &&
            ((this.secondary_Contact_Email__c==null && other.getSecondary_Contact_Email__c()==null) || 
             (this.secondary_Contact_Email__c!=null &&
              this.secondary_Contact_Email__c.equals(other.getSecondary_Contact_Email__c()))) &&
            ((this.secondary_Contact_Name__c==null && other.getSecondary_Contact_Name__c()==null) || 
             (this.secondary_Contact_Name__c!=null &&
              this.secondary_Contact_Name__c.equals(other.getSecondary_Contact_Name__c()))) &&
            ((this.secondary_Contact_Phone__c==null && other.getSecondary_Contact_Phone__c()==null) || 
             (this.secondary_Contact_Phone__c!=null &&
              this.secondary_Contact_Phone__c.equals(other.getSecondary_Contact_Phone__c()))) &&
            ((this.secondary_Contact_Title__c==null && other.getSecondary_Contact_Title__c()==null) || 
             (this.secondary_Contact_Title__c!=null &&
              this.secondary_Contact_Title__c.equals(other.getSecondary_Contact_Title__c()))) &&
            ((this.shares==null && other.getShares()==null) || 
             (this.shares!=null &&
              this.shares.equals(other.getShares()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.status_Last_Modified__c==null && other.getStatus_Last_Modified__c()==null) || 
             (this.status_Last_Modified__c!=null &&
              this.status_Last_Modified__c.equals(other.getStatus_Last_Modified__c()))) &&
            ((this.status__c==null && other.getStatus__c()==null) || 
             (this.status__c!=null &&
              this.status__c.equals(other.getStatus__c()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.target_Dev_Platform__c==null && other.getTarget_Dev_Platform__c()==null) || 
             (this.target_Dev_Platform__c!=null &&
              this.target_Dev_Platform__c.equals(other.getTarget_Dev_Platform__c()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              this.tasks.equals(other.getTasks()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.website==null && other.getWebsite()==null) || 
             (this.website!=null &&
              this.website.equals(other.getWebsite()))) &&
            ((this.year_Established__c==null && other.getYear_Established__c()==null) || 
             (this.year_Established__c!=null &&
              this.year_Established__c.equals(other.getYear_Established__c()))) &&
            ((this.blonk_News_and_Press__c==null && other.getKCura_News_and_Press__c()==null) || 
             (this.blonk_News_and_Press__c!=null &&
              this.blonk_News_and_Press__c.equals(other.getKCura_News_and_Press__c()))) &&
            ((this.of_Attorneys__c==null && other.getOf_Attorneys__c()==null) || 
             (this.of_Attorneys__c!=null &&
              this.of_Attorneys__c.equals(other.getOf_Attorneys__c())));
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
        if (getActivityHistories() != null) {
            _hashCode += getActivityHistories().hashCode();
        }
        if (getAdditional_Info__c() != null) {
            _hashCode += getAdditional_Info__c().hashCode();
        }
        if (getAlliances_Partnerships__c() != null) {
            _hashCode += getAlliances_Partnerships__c().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getCEO__c() != null) {
            _hashCode += getCEO__c().hashCode();
        }
        if (getCampaign() != null) {
            _hashCode += getCampaign().hashCode();
        }
        if (getCampaignMembers() != null) {
            _hashCode += getCampaignMembers().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getCompany_Registered_State__c() != null) {
            _hashCode += getCompany_Registered_State__c().hashCode();
        }
        if (getConvertedAccount() != null) {
            _hashCode += getConvertedAccount().hashCode();
        }
        if (getConvertedAccountId() != null) {
            _hashCode += getConvertedAccountId().hashCode();
        }
        if (getConvertedContact() != null) {
            _hashCode += getConvertedContact().hashCode();
        }
        if (getConvertedContactId() != null) {
            _hashCode += getConvertedContactId().hashCode();
        }
        if (getConvertedDate() != null) {
            _hashCode += getConvertedDate().hashCode();
        }
        if (getConvertedOpportunity() != null) {
            _hashCode += getConvertedOpportunity().hashCode();
        }
        if (getConvertedOpportunityId() != null) {
            _hashCode += getConvertedOpportunityId().hashCode();
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
        if (getCurrently_Host_Relativity__c() != null) {
            _hashCode += getCurrently_Host_Relativity__c().hashCode();
        }
        if (getDemo__c() != null) {
            _hashCode += getDemo__c().hashCode();
        }
        if (getDemo__r() != null) {
            _hashCode += getDemo__r().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDesired_Partnership_Benefits__c() != null) {
            _hashCode += getDesired_Partnership_Benefits__c().hashCode();
        }
        if (getDev_Language_Other__c() != null) {
            _hashCode += getDev_Language_Other__c().hashCode();
        }
        if (getDev_Partner_Products__r() != null) {
            _hashCode += getDev_Partner_Products__r().hashCode();
        }
        if (getDev_Platform_Other__c() != null) {
            _hashCode += getDev_Platform_Other__c().hashCode();
        }
        if (getDevelopment_Languages__c() != null) {
            _hashCode += getDevelopment_Languages__c().hashCode();
        }
        if (getDoing_Business_with_Relativity_Clients__c() != null) {
            _hashCode += getDoing_Business_with_Relativity_Clients__c().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getEmailBouncedDate() != null) {
            _hashCode += getEmailBouncedDate().hashCode();
        }
        if (getEmailBouncedReason() != null) {
            _hashCode += getEmailBouncedReason().hashCode();
        }
        if (getEmailStatuses() != null) {
            _hashCode += getEmailStatuses().hashCode();
        }
        if (getEventRelations() != null) {
            _hashCode += getEventRelations().hashCode();
        }
        if (getEvents() != null) {
            _hashCode += getEvents().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getFeeds() != null) {
            _hashCode += getFeeds().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getHasOptedOutOfEmail() != null) {
            _hashCode += getHasOptedOutOfEmail().hashCode();
        }
        if (getHistories() != null) {
            _hashCode += getHistories().hashCode();
        }
        if (getHow_did_you_hear_about_program__c() != null) {
            _hashCode += getHow_did_you_hear_about_program__c().hashCode();
        }
        if (getIndustry() != null) {
            _hashCode += getIndustry().hashCode();
        }
        if (getIsConverted() != null) {
            _hashCode += getIsConverted().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getIsUnreadByOwner() != null) {
            _hashCode += getIsUnreadByOwner().hashCode();
        }
        if (getJigsaw() != null) {
            _hashCode += getJigsaw().hashCode();
        }
        if (getJigsawContactId() != null) {
            _hashCode += getJigsawContactId().hashCode();
        }
        if (getLastActivityDate() != null) {
            _hashCode += getLastActivityDate().hashCode();
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
        if (getLeadSource() != null) {
            _hashCode += getLeadSource().hashCode();
        }
        if (getLead_Type__c() != null) {
            _hashCode += getLead_Type__c().hashCode();
        }
        if (getMasterRecord() != null) {
            _hashCode += getMasterRecord().hashCode();
        }
        if (getMasterRecordId() != null) {
            _hashCode += getMasterRecordId().hashCode();
        }
        if (getMobilePhone() != null) {
            _hashCode += getMobilePhone().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNext_Steps__c() != null) {
            _hashCode += getNext_Steps__c().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getNotesAndAttachments() != null) {
            _hashCode += getNotesAndAttachments().hashCode();
        }
        if (getNumberOfEmployees() != null) {
            _hashCode += getNumberOfEmployees().hashCode();
        }
        if (getNumber_of_Development_Resources__c() != null) {
            _hashCode += getNumber_of_Development_Resources__c().hashCode();
        }
        if (getOpenActivities() != null) {
            _hashCode += getOpenActivities().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getPlatform_Enhancements__c() != null) {
            _hashCode += getPlatform_Enhancements__c().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getRating() != null) {
            _hashCode += getRating().hashCode();
        }
        if (getRecordType() != null) {
            _hashCode += getRecordType().hashCode();
        }
        if (getRecordTypeId() != null) {
            _hashCode += getRecordTypeId().hashCode();
        }
        if (getRelativity_Assisted_Review_Newsletter__c() != null) {
            _hashCode += getRelativity_Assisted_Review_Newsletter__c().hashCode();
        }
        if (getRelativity_Fest_Newsletter__c() != null) {
            _hashCode += getRelativity_Fest_Newsletter__c().hashCode();
        }
        if (getSalutation() != null) {
            _hashCode += getSalutation().hashCode();
        }
        if (getSecondary_Contact_Email__c() != null) {
            _hashCode += getSecondary_Contact_Email__c().hashCode();
        }
        if (getSecondary_Contact_Name__c() != null) {
            _hashCode += getSecondary_Contact_Name__c().hashCode();
        }
        if (getSecondary_Contact_Phone__c() != null) {
            _hashCode += getSecondary_Contact_Phone__c().hashCode();
        }
        if (getSecondary_Contact_Title__c() != null) {
            _hashCode += getSecondary_Contact_Title__c().hashCode();
        }
        if (getShares() != null) {
            _hashCode += getShares().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStatus_Last_Modified__c() != null) {
            _hashCode += getStatus_Last_Modified__c().hashCode();
        }
        if (getStatus__c() != null) {
            _hashCode += getStatus__c().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTarget_Dev_Platform__c() != null) {
            _hashCode += getTarget_Dev_Platform__c().hashCode();
        }
        if (getTasks() != null) {
            _hashCode += getTasks().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getWebsite() != null) {
            _hashCode += getWebsite().hashCode();
        }
        if (getYear_Established__c() != null) {
            _hashCode += getYear_Established__c().hashCode();
        }
        if (getKCura_News_and_Press__c() != null) {
            _hashCode += getKCura_News_and_Press__c().hashCode();
        }
        if (getOf_Attorneys__c() != null) {
            _hashCode += getOf_Attorneys__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Lead.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Lead"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityHistories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActivityHistories"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additional_Info__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Additional_Info__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alliances_Partnerships__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Alliances_Partnerships__c"));
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
        elemField.setFieldName("CEO__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CEO__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaign");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Campaign"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Campaign"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignMembers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CampaignMembers"));
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
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Company"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_Registered_State__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Company_Registered_State__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("convertedAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ConvertedAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("convertedAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ConvertedAccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("convertedContact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ConvertedContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("convertedContactId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ConvertedContactId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("convertedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ConvertedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("convertedOpportunity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ConvertedOpportunity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Opportunity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("convertedOpportunityId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ConvertedOpportunityId"));
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
        elemField.setFieldName("currently_Host_Relativity__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Currently_Host_Relativity__c"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desired_Partnership_Benefits__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Desired_Partnership_Benefits__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dev_Language_Other__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dev_Language_Other__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dev_Partner_Products__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dev_Partner_Products__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dev_Platform_Other__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dev_Platform_Other__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("development_Languages__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Development_Languages__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doing_Business_with_Relativity_Clients__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Doing_Business_with_Relativity_Clients__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("emailBouncedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailBouncedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailBouncedReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailBouncedReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailStatuses");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailStatuses"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("events");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Events"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasOptedOutOfEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HasOptedOutOfEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("how_did_you_hear_about_program__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "How_did_you_hear_about_program__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Industry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isConverted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsConverted"));
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
        elemField.setFieldName("isUnreadByOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsUnreadByOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jigsaw");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Jigsaw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jigsawContactId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "JigsawContactId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastActivityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastActivityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("leadSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LeadSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lead_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Lead_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MasterRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Lead"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterRecordId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MasterRecordId"));
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
        elemField.setFieldName("next_Steps__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Next_Steps__c"));
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
        elemField.setFieldName("numberOfEmployees");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NumberOfEmployees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number_of_Development_Resources__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Number_of_Development_Resources__c"));
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
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("platform_Enhancements__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Platform_Enhancements__c"));
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
        elemField.setFieldName("rating");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Rating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("relativity_Assisted_Review_Newsletter__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relativity_Assisted_Review_Newsletter__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relativity_Fest_Newsletter__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relativity_Fest_Newsletter__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salutation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Salutation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondary_Contact_Email__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Secondary_Contact_Email__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondary_Contact_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Secondary_Contact_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondary_Contact_Phone__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Secondary_Contact_Phone__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondary_Contact_Title__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Secondary_Contact_Title__c"));
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
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "State"));
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
        elemField.setFieldName("status_Last_Modified__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status_Last_Modified__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("target_Dev_Platform__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Target_Dev_Platform__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("website");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Website"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("year_Established__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Year_Established__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KCura_News_and_Press__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "blonk_News_and_Press__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("of_Attorneys__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "of_Attorneys__c"));
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

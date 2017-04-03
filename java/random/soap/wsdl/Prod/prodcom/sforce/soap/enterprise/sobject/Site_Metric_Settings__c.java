/**
 * Site_Metric_Settings__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Site_Metric_Settings__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.Boolean average_Time_on_Site__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String email__c;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.lang.Boolean isDeleted;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String name;

    private java.lang.String password__c;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private com.sforce.soap.enterprise.sobject.Name setupOwner;

    private java.lang.String setupOwnerId;

    private java.util.Calendar systemModstamp;

    private java.lang.String table_Id__c;

    private java.lang.Boolean track_New_Visits__c;

    private java.lang.Boolean track_Page_Views_Per_Visit__c;

    private java.lang.Boolean track_Visit_Bounce_Rate__c;

    private java.lang.Boolean track_Visitors__c;

    private java.lang.Boolean tracking_Average_Time_on_Site__c;

    private java.lang.Boolean tracking_New_Visits__c;

    private java.lang.Boolean tracking_Page_Views_Per_Visit__c;

    private java.lang.Boolean tracking_Visit_Bounce_Rate__c;

    private java.lang.Boolean tracking_Visitors__c;

    public Site_Metric_Settings__c() {
    }

    public Site_Metric_Settings__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.Boolean average_Time_on_Site__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String email__c,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.lang.Boolean isDeleted,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String name,
           java.lang.String password__c,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           com.sforce.soap.enterprise.sobject.Name setupOwner,
           java.lang.String setupOwnerId,
           java.util.Calendar systemModstamp,
           java.lang.String table_Id__c,
           java.lang.Boolean track_New_Visits__c,
           java.lang.Boolean track_Page_Views_Per_Visit__c,
           java.lang.Boolean track_Visit_Bounce_Rate__c,
           java.lang.Boolean track_Visitors__c,
           java.lang.Boolean tracking_Average_Time_on_Site__c,
           java.lang.Boolean tracking_New_Visits__c,
           java.lang.Boolean tracking_Page_Views_Per_Visit__c,
           java.lang.Boolean tracking_Visit_Bounce_Rate__c,
           java.lang.Boolean tracking_Visitors__c) {
        super(
            fieldsToNull,
            id);
        this.average_Time_on_Site__c = average_Time_on_Site__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.email__c = email__c;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.isDeleted = isDeleted;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.name = name;
        this.password__c = password__c;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.setupOwner = setupOwner;
        this.setupOwnerId = setupOwnerId;
        this.systemModstamp = systemModstamp;
        this.table_Id__c = table_Id__c;
        this.track_New_Visits__c = track_New_Visits__c;
        this.track_Page_Views_Per_Visit__c = track_Page_Views_Per_Visit__c;
        this.track_Visit_Bounce_Rate__c = track_Visit_Bounce_Rate__c;
        this.track_Visitors__c = track_Visitors__c;
        this.tracking_Average_Time_on_Site__c = tracking_Average_Time_on_Site__c;
        this.tracking_New_Visits__c = tracking_New_Visits__c;
        this.tracking_Page_Views_Per_Visit__c = tracking_Page_Views_Per_Visit__c;
        this.tracking_Visit_Bounce_Rate__c = tracking_Visit_Bounce_Rate__c;
        this.tracking_Visitors__c = tracking_Visitors__c;
    }


    /**
     * Gets the average_Time_on_Site__c value for this Site_Metric_Settings__c.
     * 
     * @return average_Time_on_Site__c
     */
    public java.lang.Boolean getAverage_Time_on_Site__c() {
        return average_Time_on_Site__c;
    }


    /**
     * Sets the average_Time_on_Site__c value for this Site_Metric_Settings__c.
     * 
     * @param average_Time_on_Site__c
     */
    public void setAverage_Time_on_Site__c(java.lang.Boolean average_Time_on_Site__c) {
        this.average_Time_on_Site__c = average_Time_on_Site__c;
    }


    /**
     * Gets the createdBy value for this Site_Metric_Settings__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Site_Metric_Settings__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Site_Metric_Settings__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Site_Metric_Settings__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Site_Metric_Settings__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Site_Metric_Settings__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the email__c value for this Site_Metric_Settings__c.
     * 
     * @return email__c
     */
    public java.lang.String getEmail__c() {
        return email__c;
    }


    /**
     * Sets the email__c value for this Site_Metric_Settings__c.
     * 
     * @param email__c
     */
    public void setEmail__c(java.lang.String email__c) {
        this.email__c = email__c;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Site_Metric_Settings__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Site_Metric_Settings__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the isDeleted value for this Site_Metric_Settings__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Site_Metric_Settings__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this Site_Metric_Settings__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Site_Metric_Settings__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Site_Metric_Settings__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Site_Metric_Settings__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Site_Metric_Settings__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Site_Metric_Settings__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this Site_Metric_Settings__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Site_Metric_Settings__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the password__c value for this Site_Metric_Settings__c.
     * 
     * @return password__c
     */
    public java.lang.String getPassword__c() {
        return password__c;
    }


    /**
     * Sets the password__c value for this Site_Metric_Settings__c.
     * 
     * @param password__c
     */
    public void setPassword__c(java.lang.String password__c) {
        this.password__c = password__c;
    }


    /**
     * Gets the processInstances value for this Site_Metric_Settings__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Site_Metric_Settings__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Site_Metric_Settings__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Site_Metric_Settings__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the setupOwner value for this Site_Metric_Settings__c.
     * 
     * @return setupOwner
     */
    public com.sforce.soap.enterprise.sobject.Name getSetupOwner() {
        return setupOwner;
    }


    /**
     * Sets the setupOwner value for this Site_Metric_Settings__c.
     * 
     * @param setupOwner
     */
    public void setSetupOwner(com.sforce.soap.enterprise.sobject.Name setupOwner) {
        this.setupOwner = setupOwner;
    }


    /**
     * Gets the setupOwnerId value for this Site_Metric_Settings__c.
     * 
     * @return setupOwnerId
     */
    public java.lang.String getSetupOwnerId() {
        return setupOwnerId;
    }


    /**
     * Sets the setupOwnerId value for this Site_Metric_Settings__c.
     * 
     * @param setupOwnerId
     */
    public void setSetupOwnerId(java.lang.String setupOwnerId) {
        this.setupOwnerId = setupOwnerId;
    }


    /**
     * Gets the systemModstamp value for this Site_Metric_Settings__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Site_Metric_Settings__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the table_Id__c value for this Site_Metric_Settings__c.
     * 
     * @return table_Id__c
     */
    public java.lang.String getTable_Id__c() {
        return table_Id__c;
    }


    /**
     * Sets the table_Id__c value for this Site_Metric_Settings__c.
     * 
     * @param table_Id__c
     */
    public void setTable_Id__c(java.lang.String table_Id__c) {
        this.table_Id__c = table_Id__c;
    }


    /**
     * Gets the track_New_Visits__c value for this Site_Metric_Settings__c.
     * 
     * @return track_New_Visits__c
     */
    public java.lang.Boolean getTrack_New_Visits__c() {
        return track_New_Visits__c;
    }


    /**
     * Sets the track_New_Visits__c value for this Site_Metric_Settings__c.
     * 
     * @param track_New_Visits__c
     */
    public void setTrack_New_Visits__c(java.lang.Boolean track_New_Visits__c) {
        this.track_New_Visits__c = track_New_Visits__c;
    }


    /**
     * Gets the track_Page_Views_Per_Visit__c value for this Site_Metric_Settings__c.
     * 
     * @return track_Page_Views_Per_Visit__c
     */
    public java.lang.Boolean getTrack_Page_Views_Per_Visit__c() {
        return track_Page_Views_Per_Visit__c;
    }


    /**
     * Sets the track_Page_Views_Per_Visit__c value for this Site_Metric_Settings__c.
     * 
     * @param track_Page_Views_Per_Visit__c
     */
    public void setTrack_Page_Views_Per_Visit__c(java.lang.Boolean track_Page_Views_Per_Visit__c) {
        this.track_Page_Views_Per_Visit__c = track_Page_Views_Per_Visit__c;
    }


    /**
     * Gets the track_Visit_Bounce_Rate__c value for this Site_Metric_Settings__c.
     * 
     * @return track_Visit_Bounce_Rate__c
     */
    public java.lang.Boolean getTrack_Visit_Bounce_Rate__c() {
        return track_Visit_Bounce_Rate__c;
    }


    /**
     * Sets the track_Visit_Bounce_Rate__c value for this Site_Metric_Settings__c.
     * 
     * @param track_Visit_Bounce_Rate__c
     */
    public void setTrack_Visit_Bounce_Rate__c(java.lang.Boolean track_Visit_Bounce_Rate__c) {
        this.track_Visit_Bounce_Rate__c = track_Visit_Bounce_Rate__c;
    }


    /**
     * Gets the track_Visitors__c value for this Site_Metric_Settings__c.
     * 
     * @return track_Visitors__c
     */
    public java.lang.Boolean getTrack_Visitors__c() {
        return track_Visitors__c;
    }


    /**
     * Sets the track_Visitors__c value for this Site_Metric_Settings__c.
     * 
     * @param track_Visitors__c
     */
    public void setTrack_Visitors__c(java.lang.Boolean track_Visitors__c) {
        this.track_Visitors__c = track_Visitors__c;
    }


    /**
     * Gets the tracking_Average_Time_on_Site__c value for this Site_Metric_Settings__c.
     * 
     * @return tracking_Average_Time_on_Site__c
     */
    public java.lang.Boolean getTracking_Average_Time_on_Site__c() {
        return tracking_Average_Time_on_Site__c;
    }


    /**
     * Sets the tracking_Average_Time_on_Site__c value for this Site_Metric_Settings__c.
     * 
     * @param tracking_Average_Time_on_Site__c
     */
    public void setTracking_Average_Time_on_Site__c(java.lang.Boolean tracking_Average_Time_on_Site__c) {
        this.tracking_Average_Time_on_Site__c = tracking_Average_Time_on_Site__c;
    }


    /**
     * Gets the tracking_New_Visits__c value for this Site_Metric_Settings__c.
     * 
     * @return tracking_New_Visits__c
     */
    public java.lang.Boolean getTracking_New_Visits__c() {
        return tracking_New_Visits__c;
    }


    /**
     * Sets the tracking_New_Visits__c value for this Site_Metric_Settings__c.
     * 
     * @param tracking_New_Visits__c
     */
    public void setTracking_New_Visits__c(java.lang.Boolean tracking_New_Visits__c) {
        this.tracking_New_Visits__c = tracking_New_Visits__c;
    }


    /**
     * Gets the tracking_Page_Views_Per_Visit__c value for this Site_Metric_Settings__c.
     * 
     * @return tracking_Page_Views_Per_Visit__c
     */
    public java.lang.Boolean getTracking_Page_Views_Per_Visit__c() {
        return tracking_Page_Views_Per_Visit__c;
    }


    /**
     * Sets the tracking_Page_Views_Per_Visit__c value for this Site_Metric_Settings__c.
     * 
     * @param tracking_Page_Views_Per_Visit__c
     */
    public void setTracking_Page_Views_Per_Visit__c(java.lang.Boolean tracking_Page_Views_Per_Visit__c) {
        this.tracking_Page_Views_Per_Visit__c = tracking_Page_Views_Per_Visit__c;
    }


    /**
     * Gets the tracking_Visit_Bounce_Rate__c value for this Site_Metric_Settings__c.
     * 
     * @return tracking_Visit_Bounce_Rate__c
     */
    public java.lang.Boolean getTracking_Visit_Bounce_Rate__c() {
        return tracking_Visit_Bounce_Rate__c;
    }


    /**
     * Sets the tracking_Visit_Bounce_Rate__c value for this Site_Metric_Settings__c.
     * 
     * @param tracking_Visit_Bounce_Rate__c
     */
    public void setTracking_Visit_Bounce_Rate__c(java.lang.Boolean tracking_Visit_Bounce_Rate__c) {
        this.tracking_Visit_Bounce_Rate__c = tracking_Visit_Bounce_Rate__c;
    }


    /**
     * Gets the tracking_Visitors__c value for this Site_Metric_Settings__c.
     * 
     * @return tracking_Visitors__c
     */
    public java.lang.Boolean getTracking_Visitors__c() {
        return tracking_Visitors__c;
    }


    /**
     * Sets the tracking_Visitors__c value for this Site_Metric_Settings__c.
     * 
     * @param tracking_Visitors__c
     */
    public void setTracking_Visitors__c(java.lang.Boolean tracking_Visitors__c) {
        this.tracking_Visitors__c = tracking_Visitors__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Site_Metric_Settings__c)) return false;
        Site_Metric_Settings__c other = (Site_Metric_Settings__c) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.average_Time_on_Site__c==null && other.getAverage_Time_on_Site__c()==null) || 
             (this.average_Time_on_Site__c!=null &&
              this.average_Time_on_Site__c.equals(other.getAverage_Time_on_Site__c()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.email__c==null && other.getEmail__c()==null) || 
             (this.email__c!=null &&
              this.email__c.equals(other.getEmail__c()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
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
            ((this.password__c==null && other.getPassword__c()==null) || 
             (this.password__c!=null &&
              this.password__c.equals(other.getPassword__c()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.setupOwner==null && other.getSetupOwner()==null) || 
             (this.setupOwner!=null &&
              this.setupOwner.equals(other.getSetupOwner()))) &&
            ((this.setupOwnerId==null && other.getSetupOwnerId()==null) || 
             (this.setupOwnerId!=null &&
              this.setupOwnerId.equals(other.getSetupOwnerId()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.table_Id__c==null && other.getTable_Id__c()==null) || 
             (this.table_Id__c!=null &&
              this.table_Id__c.equals(other.getTable_Id__c()))) &&
            ((this.track_New_Visits__c==null && other.getTrack_New_Visits__c()==null) || 
             (this.track_New_Visits__c!=null &&
              this.track_New_Visits__c.equals(other.getTrack_New_Visits__c()))) &&
            ((this.track_Page_Views_Per_Visit__c==null && other.getTrack_Page_Views_Per_Visit__c()==null) || 
             (this.track_Page_Views_Per_Visit__c!=null &&
              this.track_Page_Views_Per_Visit__c.equals(other.getTrack_Page_Views_Per_Visit__c()))) &&
            ((this.track_Visit_Bounce_Rate__c==null && other.getTrack_Visit_Bounce_Rate__c()==null) || 
             (this.track_Visit_Bounce_Rate__c!=null &&
              this.track_Visit_Bounce_Rate__c.equals(other.getTrack_Visit_Bounce_Rate__c()))) &&
            ((this.track_Visitors__c==null && other.getTrack_Visitors__c()==null) || 
             (this.track_Visitors__c!=null &&
              this.track_Visitors__c.equals(other.getTrack_Visitors__c()))) &&
            ((this.tracking_Average_Time_on_Site__c==null && other.getTracking_Average_Time_on_Site__c()==null) || 
             (this.tracking_Average_Time_on_Site__c!=null &&
              this.tracking_Average_Time_on_Site__c.equals(other.getTracking_Average_Time_on_Site__c()))) &&
            ((this.tracking_New_Visits__c==null && other.getTracking_New_Visits__c()==null) || 
             (this.tracking_New_Visits__c!=null &&
              this.tracking_New_Visits__c.equals(other.getTracking_New_Visits__c()))) &&
            ((this.tracking_Page_Views_Per_Visit__c==null && other.getTracking_Page_Views_Per_Visit__c()==null) || 
             (this.tracking_Page_Views_Per_Visit__c!=null &&
              this.tracking_Page_Views_Per_Visit__c.equals(other.getTracking_Page_Views_Per_Visit__c()))) &&
            ((this.tracking_Visit_Bounce_Rate__c==null && other.getTracking_Visit_Bounce_Rate__c()==null) || 
             (this.tracking_Visit_Bounce_Rate__c!=null &&
              this.tracking_Visit_Bounce_Rate__c.equals(other.getTracking_Visit_Bounce_Rate__c()))) &&
            ((this.tracking_Visitors__c==null && other.getTracking_Visitors__c()==null) || 
             (this.tracking_Visitors__c!=null &&
              this.tracking_Visitors__c.equals(other.getTracking_Visitors__c())));
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
        if (getAverage_Time_on_Site__c() != null) {
            _hashCode += getAverage_Time_on_Site__c().hashCode();
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
        if (getEmail__c() != null) {
            _hashCode += getEmail__c().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
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
        if (getPassword__c() != null) {
            _hashCode += getPassword__c().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getSetupOwner() != null) {
            _hashCode += getSetupOwner().hashCode();
        }
        if (getSetupOwnerId() != null) {
            _hashCode += getSetupOwnerId().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTable_Id__c() != null) {
            _hashCode += getTable_Id__c().hashCode();
        }
        if (getTrack_New_Visits__c() != null) {
            _hashCode += getTrack_New_Visits__c().hashCode();
        }
        if (getTrack_Page_Views_Per_Visit__c() != null) {
            _hashCode += getTrack_Page_Views_Per_Visit__c().hashCode();
        }
        if (getTrack_Visit_Bounce_Rate__c() != null) {
            _hashCode += getTrack_Visit_Bounce_Rate__c().hashCode();
        }
        if (getTrack_Visitors__c() != null) {
            _hashCode += getTrack_Visitors__c().hashCode();
        }
        if (getTracking_Average_Time_on_Site__c() != null) {
            _hashCode += getTracking_Average_Time_on_Site__c().hashCode();
        }
        if (getTracking_New_Visits__c() != null) {
            _hashCode += getTracking_New_Visits__c().hashCode();
        }
        if (getTracking_Page_Views_Per_Visit__c() != null) {
            _hashCode += getTracking_Page_Views_Per_Visit__c().hashCode();
        }
        if (getTracking_Visit_Bounce_Rate__c() != null) {
            _hashCode += getTracking_Visit_Bounce_Rate__c().hashCode();
        }
        if (getTracking_Visitors__c() != null) {
            _hashCode += getTracking_Visitors__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Site_Metric_Settings__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Site_Metric_Settings__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("average_Time_on_Site__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Average_Time_on_Site__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("password__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Password__c"));
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
        elemField.setFieldName("setupOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SetupOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setupOwnerId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SetupOwnerId"));
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
        elemField.setFieldName("table_Id__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Table_Id__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("track_New_Visits__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Track_New_Visits__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("track_Page_Views_Per_Visit__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Track_Page_Views_Per_Visit__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("track_Visit_Bounce_Rate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Track_Visit_Bounce_Rate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("track_Visitors__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Track_Visitors__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tracking_Average_Time_on_Site__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tracking_Average_Time_on_Site__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tracking_New_Visits__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tracking_New_Visits__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tracking_Page_Views_Per_Visit__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tracking_Page_Views_Per_Visit__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tracking_Visit_Bounce_Rate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tracking_Visit_Bounce_Rate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tracking_Visitors__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tracking_Visitors__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

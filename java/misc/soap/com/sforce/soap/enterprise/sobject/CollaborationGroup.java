/**
 * CollaborationGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class CollaborationGroup  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.Boolean canHaveGuests;

    private java.lang.String collaborationType;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String description;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult feeds;

    private java.lang.String fullPhotoUrl;

    private com.sforce.soap.enterprise.QueryResult groupMemberRequests;

    private com.sforce.soap.enterprise.QueryResult groupMembers;

    private java.lang.Boolean hasPrivateFieldsAccess;

    private java.lang.String informationBody;

    private java.lang.String informationTitle;

    private java.util.Calendar lastFeedModifiedDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.Integer memberCount;

    private java.lang.String name;

    private com.sforce.soap.enterprise.sobject.User owner;

    private java.lang.String ownerId;

    private java.lang.String smallPhotoUrl;

    private java.util.Calendar systemModstamp;

    public CollaborationGroup() {
    }

    public CollaborationGroup(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.Boolean canHaveGuests,
           java.lang.String collaborationType,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String description,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult feeds,
           java.lang.String fullPhotoUrl,
           com.sforce.soap.enterprise.QueryResult groupMemberRequests,
           com.sforce.soap.enterprise.QueryResult groupMembers,
           java.lang.Boolean hasPrivateFieldsAccess,
           java.lang.String informationBody,
           java.lang.String informationTitle,
           java.util.Calendar lastFeedModifiedDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.Integer memberCount,
           java.lang.String name,
           com.sforce.soap.enterprise.sobject.User owner,
           java.lang.String ownerId,
           java.lang.String smallPhotoUrl,
           java.util.Calendar systemModstamp) {
        super(
            fieldsToNull,
            id);
        this.canHaveGuests = canHaveGuests;
        this.collaborationType = collaborationType;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.description = description;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.feeds = feeds;
        this.fullPhotoUrl = fullPhotoUrl;
        this.groupMemberRequests = groupMemberRequests;
        this.groupMembers = groupMembers;
        this.hasPrivateFieldsAccess = hasPrivateFieldsAccess;
        this.informationBody = informationBody;
        this.informationTitle = informationTitle;
        this.lastFeedModifiedDate = lastFeedModifiedDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.memberCount = memberCount;
        this.name = name;
        this.owner = owner;
        this.ownerId = ownerId;
        this.smallPhotoUrl = smallPhotoUrl;
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the canHaveGuests value for this CollaborationGroup.
     * 
     * @return canHaveGuests
     */
    public java.lang.Boolean getCanHaveGuests() {
        return canHaveGuests;
    }


    /**
     * Sets the canHaveGuests value for this CollaborationGroup.
     * 
     * @param canHaveGuests
     */
    public void setCanHaveGuests(java.lang.Boolean canHaveGuests) {
        this.canHaveGuests = canHaveGuests;
    }


    /**
     * Gets the collaborationType value for this CollaborationGroup.
     * 
     * @return collaborationType
     */
    public java.lang.String getCollaborationType() {
        return collaborationType;
    }


    /**
     * Sets the collaborationType value for this CollaborationGroup.
     * 
     * @param collaborationType
     */
    public void setCollaborationType(java.lang.String collaborationType) {
        this.collaborationType = collaborationType;
    }


    /**
     * Gets the createdBy value for this CollaborationGroup.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this CollaborationGroup.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this CollaborationGroup.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this CollaborationGroup.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this CollaborationGroup.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CollaborationGroup.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the description value for this CollaborationGroup.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CollaborationGroup.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this CollaborationGroup.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this CollaborationGroup.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the feeds value for this CollaborationGroup.
     * 
     * @return feeds
     */
    public com.sforce.soap.enterprise.QueryResult getFeeds() {
        return feeds;
    }


    /**
     * Sets the feeds value for this CollaborationGroup.
     * 
     * @param feeds
     */
    public void setFeeds(com.sforce.soap.enterprise.QueryResult feeds) {
        this.feeds = feeds;
    }


    /**
     * Gets the fullPhotoUrl value for this CollaborationGroup.
     * 
     * @return fullPhotoUrl
     */
    public java.lang.String getFullPhotoUrl() {
        return fullPhotoUrl;
    }


    /**
     * Sets the fullPhotoUrl value for this CollaborationGroup.
     * 
     * @param fullPhotoUrl
     */
    public void setFullPhotoUrl(java.lang.String fullPhotoUrl) {
        this.fullPhotoUrl = fullPhotoUrl;
    }


    /**
     * Gets the groupMemberRequests value for this CollaborationGroup.
     * 
     * @return groupMemberRequests
     */
    public com.sforce.soap.enterprise.QueryResult getGroupMemberRequests() {
        return groupMemberRequests;
    }


    /**
     * Sets the groupMemberRequests value for this CollaborationGroup.
     * 
     * @param groupMemberRequests
     */
    public void setGroupMemberRequests(com.sforce.soap.enterprise.QueryResult groupMemberRequests) {
        this.groupMemberRequests = groupMemberRequests;
    }


    /**
     * Gets the groupMembers value for this CollaborationGroup.
     * 
     * @return groupMembers
     */
    public com.sforce.soap.enterprise.QueryResult getGroupMembers() {
        return groupMembers;
    }


    /**
     * Sets the groupMembers value for this CollaborationGroup.
     * 
     * @param groupMembers
     */
    public void setGroupMembers(com.sforce.soap.enterprise.QueryResult groupMembers) {
        this.groupMembers = groupMembers;
    }


    /**
     * Gets the hasPrivateFieldsAccess value for this CollaborationGroup.
     * 
     * @return hasPrivateFieldsAccess
     */
    public java.lang.Boolean getHasPrivateFieldsAccess() {
        return hasPrivateFieldsAccess;
    }


    /**
     * Sets the hasPrivateFieldsAccess value for this CollaborationGroup.
     * 
     * @param hasPrivateFieldsAccess
     */
    public void setHasPrivateFieldsAccess(java.lang.Boolean hasPrivateFieldsAccess) {
        this.hasPrivateFieldsAccess = hasPrivateFieldsAccess;
    }


    /**
     * Gets the informationBody value for this CollaborationGroup.
     * 
     * @return informationBody
     */
    public java.lang.String getInformationBody() {
        return informationBody;
    }


    /**
     * Sets the informationBody value for this CollaborationGroup.
     * 
     * @param informationBody
     */
    public void setInformationBody(java.lang.String informationBody) {
        this.informationBody = informationBody;
    }


    /**
     * Gets the informationTitle value for this CollaborationGroup.
     * 
     * @return informationTitle
     */
    public java.lang.String getInformationTitle() {
        return informationTitle;
    }


    /**
     * Sets the informationTitle value for this CollaborationGroup.
     * 
     * @param informationTitle
     */
    public void setInformationTitle(java.lang.String informationTitle) {
        this.informationTitle = informationTitle;
    }


    /**
     * Gets the lastFeedModifiedDate value for this CollaborationGroup.
     * 
     * @return lastFeedModifiedDate
     */
    public java.util.Calendar getLastFeedModifiedDate() {
        return lastFeedModifiedDate;
    }


    /**
     * Sets the lastFeedModifiedDate value for this CollaborationGroup.
     * 
     * @param lastFeedModifiedDate
     */
    public void setLastFeedModifiedDate(java.util.Calendar lastFeedModifiedDate) {
        this.lastFeedModifiedDate = lastFeedModifiedDate;
    }


    /**
     * Gets the lastModifiedBy value for this CollaborationGroup.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this CollaborationGroup.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this CollaborationGroup.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this CollaborationGroup.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this CollaborationGroup.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CollaborationGroup.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the memberCount value for this CollaborationGroup.
     * 
     * @return memberCount
     */
    public java.lang.Integer getMemberCount() {
        return memberCount;
    }


    /**
     * Sets the memberCount value for this CollaborationGroup.
     * 
     * @param memberCount
     */
    public void setMemberCount(java.lang.Integer memberCount) {
        this.memberCount = memberCount;
    }


    /**
     * Gets the name value for this CollaborationGroup.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CollaborationGroup.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the owner value for this CollaborationGroup.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.User getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this CollaborationGroup.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.User owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this CollaborationGroup.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this CollaborationGroup.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the smallPhotoUrl value for this CollaborationGroup.
     * 
     * @return smallPhotoUrl
     */
    public java.lang.String getSmallPhotoUrl() {
        return smallPhotoUrl;
    }


    /**
     * Sets the smallPhotoUrl value for this CollaborationGroup.
     * 
     * @param smallPhotoUrl
     */
    public void setSmallPhotoUrl(java.lang.String smallPhotoUrl) {
        this.smallPhotoUrl = smallPhotoUrl;
    }


    /**
     * Gets the systemModstamp value for this CollaborationGroup.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this CollaborationGroup.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CollaborationGroup)) return false;
        CollaborationGroup other = (CollaborationGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.canHaveGuests==null && other.getCanHaveGuests()==null) || 
             (this.canHaveGuests!=null &&
              this.canHaveGuests.equals(other.getCanHaveGuests()))) &&
            ((this.collaborationType==null && other.getCollaborationType()==null) || 
             (this.collaborationType!=null &&
              this.collaborationType.equals(other.getCollaborationType()))) &&
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
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.feeds==null && other.getFeeds()==null) || 
             (this.feeds!=null &&
              this.feeds.equals(other.getFeeds()))) &&
            ((this.fullPhotoUrl==null && other.getFullPhotoUrl()==null) || 
             (this.fullPhotoUrl!=null &&
              this.fullPhotoUrl.equals(other.getFullPhotoUrl()))) &&
            ((this.groupMemberRequests==null && other.getGroupMemberRequests()==null) || 
             (this.groupMemberRequests!=null &&
              this.groupMemberRequests.equals(other.getGroupMemberRequests()))) &&
            ((this.groupMembers==null && other.getGroupMembers()==null) || 
             (this.groupMembers!=null &&
              this.groupMembers.equals(other.getGroupMembers()))) &&
            ((this.hasPrivateFieldsAccess==null && other.getHasPrivateFieldsAccess()==null) || 
             (this.hasPrivateFieldsAccess!=null &&
              this.hasPrivateFieldsAccess.equals(other.getHasPrivateFieldsAccess()))) &&
            ((this.informationBody==null && other.getInformationBody()==null) || 
             (this.informationBody!=null &&
              this.informationBody.equals(other.getInformationBody()))) &&
            ((this.informationTitle==null && other.getInformationTitle()==null) || 
             (this.informationTitle!=null &&
              this.informationTitle.equals(other.getInformationTitle()))) &&
            ((this.lastFeedModifiedDate==null && other.getLastFeedModifiedDate()==null) || 
             (this.lastFeedModifiedDate!=null &&
              this.lastFeedModifiedDate.equals(other.getLastFeedModifiedDate()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.memberCount==null && other.getMemberCount()==null) || 
             (this.memberCount!=null &&
              this.memberCount.equals(other.getMemberCount()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.smallPhotoUrl==null && other.getSmallPhotoUrl()==null) || 
             (this.smallPhotoUrl!=null &&
              this.smallPhotoUrl.equals(other.getSmallPhotoUrl()))) &&
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
        if (getCanHaveGuests() != null) {
            _hashCode += getCanHaveGuests().hashCode();
        }
        if (getCollaborationType() != null) {
            _hashCode += getCollaborationType().hashCode();
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getFeeds() != null) {
            _hashCode += getFeeds().hashCode();
        }
        if (getFullPhotoUrl() != null) {
            _hashCode += getFullPhotoUrl().hashCode();
        }
        if (getGroupMemberRequests() != null) {
            _hashCode += getGroupMemberRequests().hashCode();
        }
        if (getGroupMembers() != null) {
            _hashCode += getGroupMembers().hashCode();
        }
        if (getHasPrivateFieldsAccess() != null) {
            _hashCode += getHasPrivateFieldsAccess().hashCode();
        }
        if (getInformationBody() != null) {
            _hashCode += getInformationBody().hashCode();
        }
        if (getInformationTitle() != null) {
            _hashCode += getInformationTitle().hashCode();
        }
        if (getLastFeedModifiedDate() != null) {
            _hashCode += getLastFeedModifiedDate().hashCode();
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
        if (getMemberCount() != null) {
            _hashCode += getMemberCount().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getSmallPhotoUrl() != null) {
            _hashCode += getSmallPhotoUrl().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CollaborationGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CollaborationGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canHaveGuests");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CanHaveGuests"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collaborationType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CollaborationType"));
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
        elemField.setFieldName("fullPhotoUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FullPhotoUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupMemberRequests");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "GroupMemberRequests"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupMembers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "GroupMembers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasPrivateFieldsAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HasPrivateFieldsAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("informationBody");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "InformationBody"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("informationTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "InformationTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastFeedModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastFeedModifiedDate"));
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
        elemField.setFieldName("memberCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MemberCount"));
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
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
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
        elemField.setFieldName("smallPhotoUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SmallPhotoUrl"));
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

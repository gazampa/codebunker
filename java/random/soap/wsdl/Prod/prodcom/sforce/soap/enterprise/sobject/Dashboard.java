/**
 * Dashboard.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Dashboard  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String backgroundDirection;

    private java.lang.Integer backgroundEnd;

    private java.lang.Integer backgroundStart;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private com.sforce.soap.enterprise.QueryResult dashboardComponents;

    private java.lang.String description;

    private java.lang.String developerName;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult feeds;

    private com.sforce.soap.enterprise.sobject.Folder folder;

    private java.lang.String folderId;

    private java.lang.Boolean isDeleted;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String leftSize;

    private java.lang.String middleSize;

    private java.lang.String namespacePrefix;

    private java.lang.String rightSize;

    private com.sforce.soap.enterprise.sobject.User runningUser;

    private java.lang.String runningUserId;

    private java.util.Calendar systemModstamp;

    private java.lang.Integer textColor;

    private java.lang.String title;

    private java.lang.Integer titleColor;

    private java.lang.Integer titleSize;

    private java.lang.String type;

    public Dashboard() {
    }

    public Dashboard(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String backgroundDirection,
           java.lang.Integer backgroundEnd,
           java.lang.Integer backgroundStart,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           com.sforce.soap.enterprise.QueryResult dashboardComponents,
           java.lang.String description,
           java.lang.String developerName,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult feeds,
           com.sforce.soap.enterprise.sobject.Folder folder,
           java.lang.String folderId,
           java.lang.Boolean isDeleted,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String leftSize,
           java.lang.String middleSize,
           java.lang.String namespacePrefix,
           java.lang.String rightSize,
           com.sforce.soap.enterprise.sobject.User runningUser,
           java.lang.String runningUserId,
           java.util.Calendar systemModstamp,
           java.lang.Integer textColor,
           java.lang.String title,
           java.lang.Integer titleColor,
           java.lang.Integer titleSize,
           java.lang.String type) {
        super(
            fieldsToNull,
            id);
        this.backgroundDirection = backgroundDirection;
        this.backgroundEnd = backgroundEnd;
        this.backgroundStart = backgroundStart;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.dashboardComponents = dashboardComponents;
        this.description = description;
        this.developerName = developerName;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.feeds = feeds;
        this.folder = folder;
        this.folderId = folderId;
        this.isDeleted = isDeleted;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.leftSize = leftSize;
        this.middleSize = middleSize;
        this.namespacePrefix = namespacePrefix;
        this.rightSize = rightSize;
        this.runningUser = runningUser;
        this.runningUserId = runningUserId;
        this.systemModstamp = systemModstamp;
        this.textColor = textColor;
        this.title = title;
        this.titleColor = titleColor;
        this.titleSize = titleSize;
        this.type = type;
    }


    /**
     * Gets the backgroundDirection value for this Dashboard.
     * 
     * @return backgroundDirection
     */
    public java.lang.String getBackgroundDirection() {
        return backgroundDirection;
    }


    /**
     * Sets the backgroundDirection value for this Dashboard.
     * 
     * @param backgroundDirection
     */
    public void setBackgroundDirection(java.lang.String backgroundDirection) {
        this.backgroundDirection = backgroundDirection;
    }


    /**
     * Gets the backgroundEnd value for this Dashboard.
     * 
     * @return backgroundEnd
     */
    public java.lang.Integer getBackgroundEnd() {
        return backgroundEnd;
    }


    /**
     * Sets the backgroundEnd value for this Dashboard.
     * 
     * @param backgroundEnd
     */
    public void setBackgroundEnd(java.lang.Integer backgroundEnd) {
        this.backgroundEnd = backgroundEnd;
    }


    /**
     * Gets the backgroundStart value for this Dashboard.
     * 
     * @return backgroundStart
     */
    public java.lang.Integer getBackgroundStart() {
        return backgroundStart;
    }


    /**
     * Sets the backgroundStart value for this Dashboard.
     * 
     * @param backgroundStart
     */
    public void setBackgroundStart(java.lang.Integer backgroundStart) {
        this.backgroundStart = backgroundStart;
    }


    /**
     * Gets the createdBy value for this Dashboard.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Dashboard.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Dashboard.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Dashboard.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Dashboard.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Dashboard.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the dashboardComponents value for this Dashboard.
     * 
     * @return dashboardComponents
     */
    public com.sforce.soap.enterprise.QueryResult getDashboardComponents() {
        return dashboardComponents;
    }


    /**
     * Sets the dashboardComponents value for this Dashboard.
     * 
     * @param dashboardComponents
     */
    public void setDashboardComponents(com.sforce.soap.enterprise.QueryResult dashboardComponents) {
        this.dashboardComponents = dashboardComponents;
    }


    /**
     * Gets the description value for this Dashboard.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Dashboard.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the developerName value for this Dashboard.
     * 
     * @return developerName
     */
    public java.lang.String getDeveloperName() {
        return developerName;
    }


    /**
     * Sets the developerName value for this Dashboard.
     * 
     * @param developerName
     */
    public void setDeveloperName(java.lang.String developerName) {
        this.developerName = developerName;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Dashboard.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Dashboard.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the feeds value for this Dashboard.
     * 
     * @return feeds
     */
    public com.sforce.soap.enterprise.QueryResult getFeeds() {
        return feeds;
    }


    /**
     * Sets the feeds value for this Dashboard.
     * 
     * @param feeds
     */
    public void setFeeds(com.sforce.soap.enterprise.QueryResult feeds) {
        this.feeds = feeds;
    }


    /**
     * Gets the folder value for this Dashboard.
     * 
     * @return folder
     */
    public com.sforce.soap.enterprise.sobject.Folder getFolder() {
        return folder;
    }


    /**
     * Sets the folder value for this Dashboard.
     * 
     * @param folder
     */
    public void setFolder(com.sforce.soap.enterprise.sobject.Folder folder) {
        this.folder = folder;
    }


    /**
     * Gets the folderId value for this Dashboard.
     * 
     * @return folderId
     */
    public java.lang.String getFolderId() {
        return folderId;
    }


    /**
     * Sets the folderId value for this Dashboard.
     * 
     * @param folderId
     */
    public void setFolderId(java.lang.String folderId) {
        this.folderId = folderId;
    }


    /**
     * Gets the isDeleted value for this Dashboard.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Dashboard.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this Dashboard.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Dashboard.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Dashboard.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Dashboard.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Dashboard.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Dashboard.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the leftSize value for this Dashboard.
     * 
     * @return leftSize
     */
    public java.lang.String getLeftSize() {
        return leftSize;
    }


    /**
     * Sets the leftSize value for this Dashboard.
     * 
     * @param leftSize
     */
    public void setLeftSize(java.lang.String leftSize) {
        this.leftSize = leftSize;
    }


    /**
     * Gets the middleSize value for this Dashboard.
     * 
     * @return middleSize
     */
    public java.lang.String getMiddleSize() {
        return middleSize;
    }


    /**
     * Sets the middleSize value for this Dashboard.
     * 
     * @param middleSize
     */
    public void setMiddleSize(java.lang.String middleSize) {
        this.middleSize = middleSize;
    }


    /**
     * Gets the namespacePrefix value for this Dashboard.
     * 
     * @return namespacePrefix
     */
    public java.lang.String getNamespacePrefix() {
        return namespacePrefix;
    }


    /**
     * Sets the namespacePrefix value for this Dashboard.
     * 
     * @param namespacePrefix
     */
    public void setNamespacePrefix(java.lang.String namespacePrefix) {
        this.namespacePrefix = namespacePrefix;
    }


    /**
     * Gets the rightSize value for this Dashboard.
     * 
     * @return rightSize
     */
    public java.lang.String getRightSize() {
        return rightSize;
    }


    /**
     * Sets the rightSize value for this Dashboard.
     * 
     * @param rightSize
     */
    public void setRightSize(java.lang.String rightSize) {
        this.rightSize = rightSize;
    }


    /**
     * Gets the runningUser value for this Dashboard.
     * 
     * @return runningUser
     */
    public com.sforce.soap.enterprise.sobject.User getRunningUser() {
        return runningUser;
    }


    /**
     * Sets the runningUser value for this Dashboard.
     * 
     * @param runningUser
     */
    public void setRunningUser(com.sforce.soap.enterprise.sobject.User runningUser) {
        this.runningUser = runningUser;
    }


    /**
     * Gets the runningUserId value for this Dashboard.
     * 
     * @return runningUserId
     */
    public java.lang.String getRunningUserId() {
        return runningUserId;
    }


    /**
     * Sets the runningUserId value for this Dashboard.
     * 
     * @param runningUserId
     */
    public void setRunningUserId(java.lang.String runningUserId) {
        this.runningUserId = runningUserId;
    }


    /**
     * Gets the systemModstamp value for this Dashboard.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Dashboard.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the textColor value for this Dashboard.
     * 
     * @return textColor
     */
    public java.lang.Integer getTextColor() {
        return textColor;
    }


    /**
     * Sets the textColor value for this Dashboard.
     * 
     * @param textColor
     */
    public void setTextColor(java.lang.Integer textColor) {
        this.textColor = textColor;
    }


    /**
     * Gets the title value for this Dashboard.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Dashboard.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the titleColor value for this Dashboard.
     * 
     * @return titleColor
     */
    public java.lang.Integer getTitleColor() {
        return titleColor;
    }


    /**
     * Sets the titleColor value for this Dashboard.
     * 
     * @param titleColor
     */
    public void setTitleColor(java.lang.Integer titleColor) {
        this.titleColor = titleColor;
    }


    /**
     * Gets the titleSize value for this Dashboard.
     * 
     * @return titleSize
     */
    public java.lang.Integer getTitleSize() {
        return titleSize;
    }


    /**
     * Sets the titleSize value for this Dashboard.
     * 
     * @param titleSize
     */
    public void setTitleSize(java.lang.Integer titleSize) {
        this.titleSize = titleSize;
    }


    /**
     * Gets the type value for this Dashboard.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Dashboard.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Dashboard)) return false;
        Dashboard other = (Dashboard) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.backgroundDirection==null && other.getBackgroundDirection()==null) || 
             (this.backgroundDirection!=null &&
              this.backgroundDirection.equals(other.getBackgroundDirection()))) &&
            ((this.backgroundEnd==null && other.getBackgroundEnd()==null) || 
             (this.backgroundEnd!=null &&
              this.backgroundEnd.equals(other.getBackgroundEnd()))) &&
            ((this.backgroundStart==null && other.getBackgroundStart()==null) || 
             (this.backgroundStart!=null &&
              this.backgroundStart.equals(other.getBackgroundStart()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.dashboardComponents==null && other.getDashboardComponents()==null) || 
             (this.dashboardComponents!=null &&
              this.dashboardComponents.equals(other.getDashboardComponents()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.developerName==null && other.getDeveloperName()==null) || 
             (this.developerName!=null &&
              this.developerName.equals(other.getDeveloperName()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.feeds==null && other.getFeeds()==null) || 
             (this.feeds!=null &&
              this.feeds.equals(other.getFeeds()))) &&
            ((this.folder==null && other.getFolder()==null) || 
             (this.folder!=null &&
              this.folder.equals(other.getFolder()))) &&
            ((this.folderId==null && other.getFolderId()==null) || 
             (this.folderId!=null &&
              this.folderId.equals(other.getFolderId()))) &&
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
            ((this.leftSize==null && other.getLeftSize()==null) || 
             (this.leftSize!=null &&
              this.leftSize.equals(other.getLeftSize()))) &&
            ((this.middleSize==null && other.getMiddleSize()==null) || 
             (this.middleSize!=null &&
              this.middleSize.equals(other.getMiddleSize()))) &&
            ((this.namespacePrefix==null && other.getNamespacePrefix()==null) || 
             (this.namespacePrefix!=null &&
              this.namespacePrefix.equals(other.getNamespacePrefix()))) &&
            ((this.rightSize==null && other.getRightSize()==null) || 
             (this.rightSize!=null &&
              this.rightSize.equals(other.getRightSize()))) &&
            ((this.runningUser==null && other.getRunningUser()==null) || 
             (this.runningUser!=null &&
              this.runningUser.equals(other.getRunningUser()))) &&
            ((this.runningUserId==null && other.getRunningUserId()==null) || 
             (this.runningUserId!=null &&
              this.runningUserId.equals(other.getRunningUserId()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.textColor==null && other.getTextColor()==null) || 
             (this.textColor!=null &&
              this.textColor.equals(other.getTextColor()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.titleColor==null && other.getTitleColor()==null) || 
             (this.titleColor!=null &&
              this.titleColor.equals(other.getTitleColor()))) &&
            ((this.titleSize==null && other.getTitleSize()==null) || 
             (this.titleSize!=null &&
              this.titleSize.equals(other.getTitleSize()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getBackgroundDirection() != null) {
            _hashCode += getBackgroundDirection().hashCode();
        }
        if (getBackgroundEnd() != null) {
            _hashCode += getBackgroundEnd().hashCode();
        }
        if (getBackgroundStart() != null) {
            _hashCode += getBackgroundStart().hashCode();
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
        if (getDashboardComponents() != null) {
            _hashCode += getDashboardComponents().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDeveloperName() != null) {
            _hashCode += getDeveloperName().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getFeeds() != null) {
            _hashCode += getFeeds().hashCode();
        }
        if (getFolder() != null) {
            _hashCode += getFolder().hashCode();
        }
        if (getFolderId() != null) {
            _hashCode += getFolderId().hashCode();
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
        if (getLeftSize() != null) {
            _hashCode += getLeftSize().hashCode();
        }
        if (getMiddleSize() != null) {
            _hashCode += getMiddleSize().hashCode();
        }
        if (getNamespacePrefix() != null) {
            _hashCode += getNamespacePrefix().hashCode();
        }
        if (getRightSize() != null) {
            _hashCode += getRightSize().hashCode();
        }
        if (getRunningUser() != null) {
            _hashCode += getRunningUser().hashCode();
        }
        if (getRunningUserId() != null) {
            _hashCode += getRunningUserId().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTextColor() != null) {
            _hashCode += getTextColor().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getTitleColor() != null) {
            _hashCode += getTitleColor().hashCode();
        }
        if (getTitleSize() != null) {
            _hashCode += getTitleSize().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Dashboard.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dashboard"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backgroundDirection");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BackgroundDirection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backgroundEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BackgroundEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backgroundStart");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BackgroundStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("dashboardComponents");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DashboardComponents"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("developerName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DeveloperName"));
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
        elemField.setFieldName("folder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Folder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Folder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folderId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FolderId"));
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
        elemField.setFieldName("leftSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LeftSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MiddleSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namespacePrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NamespacePrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rightSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RightSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runningUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RunningUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runningUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RunningUserId"));
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
        elemField.setFieldName("textColor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TextColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("titleColor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TitleColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titleSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TitleSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Type"));
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

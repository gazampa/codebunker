/**
 * WebLink.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class WebLink  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String description;

    private java.lang.String displayType;

    private java.lang.String encodingKey;

    private java.lang.Boolean hasMenubar;

    private java.lang.Boolean hasScrollbars;

    private java.lang.Boolean hasToolbar;

    private java.lang.Integer height;

    private java.lang.Boolean isProtected;

    private java.lang.Boolean isResizable;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String linkType;

    private com.sforce.soap.enterprise.QueryResult localization;

    private java.lang.String masterLabel;

    private java.lang.String name;

    private java.lang.String namespacePrefix;

    private java.lang.String openType;

    private java.lang.String pageOrSobjectType;

    private java.lang.String position;

    private java.lang.Boolean requireRowSelection;

    private java.lang.String scontrolId;

    private java.lang.Boolean showsLocation;

    private java.lang.Boolean showsStatus;

    private java.util.Calendar systemModstamp;

    private java.lang.String url;

    private java.lang.Integer width;

    public WebLink() {
    }

    public WebLink(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String description,
           java.lang.String displayType,
           java.lang.String encodingKey,
           java.lang.Boolean hasMenubar,
           java.lang.Boolean hasScrollbars,
           java.lang.Boolean hasToolbar,
           java.lang.Integer height,
           java.lang.Boolean isProtected,
           java.lang.Boolean isResizable,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String linkType,
           com.sforce.soap.enterprise.QueryResult localization,
           java.lang.String masterLabel,
           java.lang.String name,
           java.lang.String namespacePrefix,
           java.lang.String openType,
           java.lang.String pageOrSobjectType,
           java.lang.String position,
           java.lang.Boolean requireRowSelection,
           java.lang.String scontrolId,
           java.lang.Boolean showsLocation,
           java.lang.Boolean showsStatus,
           java.util.Calendar systemModstamp,
           java.lang.String url,
           java.lang.Integer width) {
        super(
            fieldsToNull,
            id);
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.description = description;
        this.displayType = displayType;
        this.encodingKey = encodingKey;
        this.hasMenubar = hasMenubar;
        this.hasScrollbars = hasScrollbars;
        this.hasToolbar = hasToolbar;
        this.height = height;
        this.isProtected = isProtected;
        this.isResizable = isResizable;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.linkType = linkType;
        this.localization = localization;
        this.masterLabel = masterLabel;
        this.name = name;
        this.namespacePrefix = namespacePrefix;
        this.openType = openType;
        this.pageOrSobjectType = pageOrSobjectType;
        this.position = position;
        this.requireRowSelection = requireRowSelection;
        this.scontrolId = scontrolId;
        this.showsLocation = showsLocation;
        this.showsStatus = showsStatus;
        this.systemModstamp = systemModstamp;
        this.url = url;
        this.width = width;
    }


    /**
     * Gets the createdBy value for this WebLink.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this WebLink.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this WebLink.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this WebLink.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this WebLink.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this WebLink.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the description value for this WebLink.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WebLink.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the displayType value for this WebLink.
     * 
     * @return displayType
     */
    public java.lang.String getDisplayType() {
        return displayType;
    }


    /**
     * Sets the displayType value for this WebLink.
     * 
     * @param displayType
     */
    public void setDisplayType(java.lang.String displayType) {
        this.displayType = displayType;
    }


    /**
     * Gets the encodingKey value for this WebLink.
     * 
     * @return encodingKey
     */
    public java.lang.String getEncodingKey() {
        return encodingKey;
    }


    /**
     * Sets the encodingKey value for this WebLink.
     * 
     * @param encodingKey
     */
    public void setEncodingKey(java.lang.String encodingKey) {
        this.encodingKey = encodingKey;
    }


    /**
     * Gets the hasMenubar value for this WebLink.
     * 
     * @return hasMenubar
     */
    public java.lang.Boolean getHasMenubar() {
        return hasMenubar;
    }


    /**
     * Sets the hasMenubar value for this WebLink.
     * 
     * @param hasMenubar
     */
    public void setHasMenubar(java.lang.Boolean hasMenubar) {
        this.hasMenubar = hasMenubar;
    }


    /**
     * Gets the hasScrollbars value for this WebLink.
     * 
     * @return hasScrollbars
     */
    public java.lang.Boolean getHasScrollbars() {
        return hasScrollbars;
    }


    /**
     * Sets the hasScrollbars value for this WebLink.
     * 
     * @param hasScrollbars
     */
    public void setHasScrollbars(java.lang.Boolean hasScrollbars) {
        this.hasScrollbars = hasScrollbars;
    }


    /**
     * Gets the hasToolbar value for this WebLink.
     * 
     * @return hasToolbar
     */
    public java.lang.Boolean getHasToolbar() {
        return hasToolbar;
    }


    /**
     * Sets the hasToolbar value for this WebLink.
     * 
     * @param hasToolbar
     */
    public void setHasToolbar(java.lang.Boolean hasToolbar) {
        this.hasToolbar = hasToolbar;
    }


    /**
     * Gets the height value for this WebLink.
     * 
     * @return height
     */
    public java.lang.Integer getHeight() {
        return height;
    }


    /**
     * Sets the height value for this WebLink.
     * 
     * @param height
     */
    public void setHeight(java.lang.Integer height) {
        this.height = height;
    }


    /**
     * Gets the isProtected value for this WebLink.
     * 
     * @return isProtected
     */
    public java.lang.Boolean getIsProtected() {
        return isProtected;
    }


    /**
     * Sets the isProtected value for this WebLink.
     * 
     * @param isProtected
     */
    public void setIsProtected(java.lang.Boolean isProtected) {
        this.isProtected = isProtected;
    }


    /**
     * Gets the isResizable value for this WebLink.
     * 
     * @return isResizable
     */
    public java.lang.Boolean getIsResizable() {
        return isResizable;
    }


    /**
     * Sets the isResizable value for this WebLink.
     * 
     * @param isResizable
     */
    public void setIsResizable(java.lang.Boolean isResizable) {
        this.isResizable = isResizable;
    }


    /**
     * Gets the lastModifiedBy value for this WebLink.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this WebLink.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this WebLink.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this WebLink.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this WebLink.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this WebLink.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the linkType value for this WebLink.
     * 
     * @return linkType
     */
    public java.lang.String getLinkType() {
        return linkType;
    }


    /**
     * Sets the linkType value for this WebLink.
     * 
     * @param linkType
     */
    public void setLinkType(java.lang.String linkType) {
        this.linkType = linkType;
    }


    /**
     * Gets the localization value for this WebLink.
     * 
     * @return localization
     */
    public com.sforce.soap.enterprise.QueryResult getLocalization() {
        return localization;
    }


    /**
     * Sets the localization value for this WebLink.
     * 
     * @param localization
     */
    public void setLocalization(com.sforce.soap.enterprise.QueryResult localization) {
        this.localization = localization;
    }


    /**
     * Gets the masterLabel value for this WebLink.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this WebLink.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }


    /**
     * Gets the name value for this WebLink.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this WebLink.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the namespacePrefix value for this WebLink.
     * 
     * @return namespacePrefix
     */
    public java.lang.String getNamespacePrefix() {
        return namespacePrefix;
    }


    /**
     * Sets the namespacePrefix value for this WebLink.
     * 
     * @param namespacePrefix
     */
    public void setNamespacePrefix(java.lang.String namespacePrefix) {
        this.namespacePrefix = namespacePrefix;
    }


    /**
     * Gets the openType value for this WebLink.
     * 
     * @return openType
     */
    public java.lang.String getOpenType() {
        return openType;
    }


    /**
     * Sets the openType value for this WebLink.
     * 
     * @param openType
     */
    public void setOpenType(java.lang.String openType) {
        this.openType = openType;
    }


    /**
     * Gets the pageOrSobjectType value for this WebLink.
     * 
     * @return pageOrSobjectType
     */
    public java.lang.String getPageOrSobjectType() {
        return pageOrSobjectType;
    }


    /**
     * Sets the pageOrSobjectType value for this WebLink.
     * 
     * @param pageOrSobjectType
     */
    public void setPageOrSobjectType(java.lang.String pageOrSobjectType) {
        this.pageOrSobjectType = pageOrSobjectType;
    }


    /**
     * Gets the position value for this WebLink.
     * 
     * @return position
     */
    public java.lang.String getPosition() {
        return position;
    }


    /**
     * Sets the position value for this WebLink.
     * 
     * @param position
     */
    public void setPosition(java.lang.String position) {
        this.position = position;
    }


    /**
     * Gets the requireRowSelection value for this WebLink.
     * 
     * @return requireRowSelection
     */
    public java.lang.Boolean getRequireRowSelection() {
        return requireRowSelection;
    }


    /**
     * Sets the requireRowSelection value for this WebLink.
     * 
     * @param requireRowSelection
     */
    public void setRequireRowSelection(java.lang.Boolean requireRowSelection) {
        this.requireRowSelection = requireRowSelection;
    }


    /**
     * Gets the scontrolId value for this WebLink.
     * 
     * @return scontrolId
     */
    public java.lang.String getScontrolId() {
        return scontrolId;
    }


    /**
     * Sets the scontrolId value for this WebLink.
     * 
     * @param scontrolId
     */
    public void setScontrolId(java.lang.String scontrolId) {
        this.scontrolId = scontrolId;
    }


    /**
     * Gets the showsLocation value for this WebLink.
     * 
     * @return showsLocation
     */
    public java.lang.Boolean getShowsLocation() {
        return showsLocation;
    }


    /**
     * Sets the showsLocation value for this WebLink.
     * 
     * @param showsLocation
     */
    public void setShowsLocation(java.lang.Boolean showsLocation) {
        this.showsLocation = showsLocation;
    }


    /**
     * Gets the showsStatus value for this WebLink.
     * 
     * @return showsStatus
     */
    public java.lang.Boolean getShowsStatus() {
        return showsStatus;
    }


    /**
     * Sets the showsStatus value for this WebLink.
     * 
     * @param showsStatus
     */
    public void setShowsStatus(java.lang.Boolean showsStatus) {
        this.showsStatus = showsStatus;
    }


    /**
     * Gets the systemModstamp value for this WebLink.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this WebLink.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the url value for this WebLink.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this WebLink.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the width value for this WebLink.
     * 
     * @return width
     */
    public java.lang.Integer getWidth() {
        return width;
    }


    /**
     * Sets the width value for this WebLink.
     * 
     * @param width
     */
    public void setWidth(java.lang.Integer width) {
        this.width = width;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WebLink)) return false;
        WebLink other = (WebLink) obj;
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
            ((this.displayType==null && other.getDisplayType()==null) || 
             (this.displayType!=null &&
              this.displayType.equals(other.getDisplayType()))) &&
            ((this.encodingKey==null && other.getEncodingKey()==null) || 
             (this.encodingKey!=null &&
              this.encodingKey.equals(other.getEncodingKey()))) &&
            ((this.hasMenubar==null && other.getHasMenubar()==null) || 
             (this.hasMenubar!=null &&
              this.hasMenubar.equals(other.getHasMenubar()))) &&
            ((this.hasScrollbars==null && other.getHasScrollbars()==null) || 
             (this.hasScrollbars!=null &&
              this.hasScrollbars.equals(other.getHasScrollbars()))) &&
            ((this.hasToolbar==null && other.getHasToolbar()==null) || 
             (this.hasToolbar!=null &&
              this.hasToolbar.equals(other.getHasToolbar()))) &&
            ((this.height==null && other.getHeight()==null) || 
             (this.height!=null &&
              this.height.equals(other.getHeight()))) &&
            ((this.isProtected==null && other.getIsProtected()==null) || 
             (this.isProtected!=null &&
              this.isProtected.equals(other.getIsProtected()))) &&
            ((this.isResizable==null && other.getIsResizable()==null) || 
             (this.isResizable!=null &&
              this.isResizable.equals(other.getIsResizable()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.linkType==null && other.getLinkType()==null) || 
             (this.linkType!=null &&
              this.linkType.equals(other.getLinkType()))) &&
            ((this.localization==null && other.getLocalization()==null) || 
             (this.localization!=null &&
              this.localization.equals(other.getLocalization()))) &&
            ((this.masterLabel==null && other.getMasterLabel()==null) || 
             (this.masterLabel!=null &&
              this.masterLabel.equals(other.getMasterLabel()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.namespacePrefix==null && other.getNamespacePrefix()==null) || 
             (this.namespacePrefix!=null &&
              this.namespacePrefix.equals(other.getNamespacePrefix()))) &&
            ((this.openType==null && other.getOpenType()==null) || 
             (this.openType!=null &&
              this.openType.equals(other.getOpenType()))) &&
            ((this.pageOrSobjectType==null && other.getPageOrSobjectType()==null) || 
             (this.pageOrSobjectType!=null &&
              this.pageOrSobjectType.equals(other.getPageOrSobjectType()))) &&
            ((this.position==null && other.getPosition()==null) || 
             (this.position!=null &&
              this.position.equals(other.getPosition()))) &&
            ((this.requireRowSelection==null && other.getRequireRowSelection()==null) || 
             (this.requireRowSelection!=null &&
              this.requireRowSelection.equals(other.getRequireRowSelection()))) &&
            ((this.scontrolId==null && other.getScontrolId()==null) || 
             (this.scontrolId!=null &&
              this.scontrolId.equals(other.getScontrolId()))) &&
            ((this.showsLocation==null && other.getShowsLocation()==null) || 
             (this.showsLocation!=null &&
              this.showsLocation.equals(other.getShowsLocation()))) &&
            ((this.showsStatus==null && other.getShowsStatus()==null) || 
             (this.showsStatus!=null &&
              this.showsStatus.equals(other.getShowsStatus()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.width==null && other.getWidth()==null) || 
             (this.width!=null &&
              this.width.equals(other.getWidth())));
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
        if (getDisplayType() != null) {
            _hashCode += getDisplayType().hashCode();
        }
        if (getEncodingKey() != null) {
            _hashCode += getEncodingKey().hashCode();
        }
        if (getHasMenubar() != null) {
            _hashCode += getHasMenubar().hashCode();
        }
        if (getHasScrollbars() != null) {
            _hashCode += getHasScrollbars().hashCode();
        }
        if (getHasToolbar() != null) {
            _hashCode += getHasToolbar().hashCode();
        }
        if (getHeight() != null) {
            _hashCode += getHeight().hashCode();
        }
        if (getIsProtected() != null) {
            _hashCode += getIsProtected().hashCode();
        }
        if (getIsResizable() != null) {
            _hashCode += getIsResizable().hashCode();
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
        if (getLinkType() != null) {
            _hashCode += getLinkType().hashCode();
        }
        if (getLocalization() != null) {
            _hashCode += getLocalization().hashCode();
        }
        if (getMasterLabel() != null) {
            _hashCode += getMasterLabel().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNamespacePrefix() != null) {
            _hashCode += getNamespacePrefix().hashCode();
        }
        if (getOpenType() != null) {
            _hashCode += getOpenType().hashCode();
        }
        if (getPageOrSobjectType() != null) {
            _hashCode += getPageOrSobjectType().hashCode();
        }
        if (getPosition() != null) {
            _hashCode += getPosition().hashCode();
        }
        if (getRequireRowSelection() != null) {
            _hashCode += getRequireRowSelection().hashCode();
        }
        if (getScontrolId() != null) {
            _hashCode += getScontrolId().hashCode();
        }
        if (getShowsLocation() != null) {
            _hashCode += getShowsLocation().hashCode();
        }
        if (getShowsStatus() != null) {
            _hashCode += getShowsStatus().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getWidth() != null) {
            _hashCode += getWidth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WebLink.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "WebLink"));
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
        elemField.setFieldName("displayType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DisplayType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encodingKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EncodingKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasMenubar");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HasMenubar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasScrollbars");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HasScrollbars"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasToolbar");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HasToolbar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("height");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isProtected");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsProtected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isResizable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsResizable"));
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
        elemField.setFieldName("linkType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LinkType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localization");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Localization"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name"));
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
        elemField.setFieldName("openType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpenType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageOrSobjectType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PageOrSobjectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("position");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requireRowSelection");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RequireRowSelection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scontrolId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ScontrolId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showsLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ShowsLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showsStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ShowsStatus"));
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
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Width"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

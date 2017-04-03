/**
 * CustomConsoleComponent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class CustomConsoleComponent  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.Integer absoluteHeight;

    private java.lang.Integer absoluteWidth;

    private java.lang.String buttonIconUrl;

    private java.lang.String buttonStyle;

    private java.lang.String buttonText;

    private java.lang.Integer buttonWidth;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String developerName;

    private java.lang.Boolean isDeleted;

    private java.lang.Boolean isHeightFixed;

    private java.lang.Boolean isHidden;

    private java.lang.Boolean isPopoutDisabled;

    private java.lang.Boolean isWidthFixed;

    private java.lang.String language;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String masterLabel;

    private java.lang.String namespacePrefix;

    private java.lang.Double relativeHeight;

    private java.lang.Double relativeWidth;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.sobject.ApexPage visualforcePage;

    private java.lang.String visualforcePageId;

    public CustomConsoleComponent() {
    }

    public CustomConsoleComponent(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.Integer absoluteHeight,
           java.lang.Integer absoluteWidth,
           java.lang.String buttonIconUrl,
           java.lang.String buttonStyle,
           java.lang.String buttonText,
           java.lang.Integer buttonWidth,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String developerName,
           java.lang.Boolean isDeleted,
           java.lang.Boolean isHeightFixed,
           java.lang.Boolean isHidden,
           java.lang.Boolean isPopoutDisabled,
           java.lang.Boolean isWidthFixed,
           java.lang.String language,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String masterLabel,
           java.lang.String namespacePrefix,
           java.lang.Double relativeHeight,
           java.lang.Double relativeWidth,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.sobject.ApexPage visualforcePage,
           java.lang.String visualforcePageId) {
        super(
            fieldsToNull,
            id);
        this.absoluteHeight = absoluteHeight;
        this.absoluteWidth = absoluteWidth;
        this.buttonIconUrl = buttonIconUrl;
        this.buttonStyle = buttonStyle;
        this.buttonText = buttonText;
        this.buttonWidth = buttonWidth;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.developerName = developerName;
        this.isDeleted = isDeleted;
        this.isHeightFixed = isHeightFixed;
        this.isHidden = isHidden;
        this.isPopoutDisabled = isPopoutDisabled;
        this.isWidthFixed = isWidthFixed;
        this.language = language;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.masterLabel = masterLabel;
        this.namespacePrefix = namespacePrefix;
        this.relativeHeight = relativeHeight;
        this.relativeWidth = relativeWidth;
        this.systemModstamp = systemModstamp;
        this.visualforcePage = visualforcePage;
        this.visualforcePageId = visualforcePageId;
    }


    /**
     * Gets the absoluteHeight value for this CustomConsoleComponent.
     * 
     * @return absoluteHeight
     */
    public java.lang.Integer getAbsoluteHeight() {
        return absoluteHeight;
    }


    /**
     * Sets the absoluteHeight value for this CustomConsoleComponent.
     * 
     * @param absoluteHeight
     */
    public void setAbsoluteHeight(java.lang.Integer absoluteHeight) {
        this.absoluteHeight = absoluteHeight;
    }


    /**
     * Gets the absoluteWidth value for this CustomConsoleComponent.
     * 
     * @return absoluteWidth
     */
    public java.lang.Integer getAbsoluteWidth() {
        return absoluteWidth;
    }


    /**
     * Sets the absoluteWidth value for this CustomConsoleComponent.
     * 
     * @param absoluteWidth
     */
    public void setAbsoluteWidth(java.lang.Integer absoluteWidth) {
        this.absoluteWidth = absoluteWidth;
    }


    /**
     * Gets the buttonIconUrl value for this CustomConsoleComponent.
     * 
     * @return buttonIconUrl
     */
    public java.lang.String getButtonIconUrl() {
        return buttonIconUrl;
    }


    /**
     * Sets the buttonIconUrl value for this CustomConsoleComponent.
     * 
     * @param buttonIconUrl
     */
    public void setButtonIconUrl(java.lang.String buttonIconUrl) {
        this.buttonIconUrl = buttonIconUrl;
    }


    /**
     * Gets the buttonStyle value for this CustomConsoleComponent.
     * 
     * @return buttonStyle
     */
    public java.lang.String getButtonStyle() {
        return buttonStyle;
    }


    /**
     * Sets the buttonStyle value for this CustomConsoleComponent.
     * 
     * @param buttonStyle
     */
    public void setButtonStyle(java.lang.String buttonStyle) {
        this.buttonStyle = buttonStyle;
    }


    /**
     * Gets the buttonText value for this CustomConsoleComponent.
     * 
     * @return buttonText
     */
    public java.lang.String getButtonText() {
        return buttonText;
    }


    /**
     * Sets the buttonText value for this CustomConsoleComponent.
     * 
     * @param buttonText
     */
    public void setButtonText(java.lang.String buttonText) {
        this.buttonText = buttonText;
    }


    /**
     * Gets the buttonWidth value for this CustomConsoleComponent.
     * 
     * @return buttonWidth
     */
    public java.lang.Integer getButtonWidth() {
        return buttonWidth;
    }


    /**
     * Sets the buttonWidth value for this CustomConsoleComponent.
     * 
     * @param buttonWidth
     */
    public void setButtonWidth(java.lang.Integer buttonWidth) {
        this.buttonWidth = buttonWidth;
    }


    /**
     * Gets the createdBy value for this CustomConsoleComponent.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this CustomConsoleComponent.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this CustomConsoleComponent.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this CustomConsoleComponent.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this CustomConsoleComponent.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CustomConsoleComponent.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the developerName value for this CustomConsoleComponent.
     * 
     * @return developerName
     */
    public java.lang.String getDeveloperName() {
        return developerName;
    }


    /**
     * Sets the developerName value for this CustomConsoleComponent.
     * 
     * @param developerName
     */
    public void setDeveloperName(java.lang.String developerName) {
        this.developerName = developerName;
    }


    /**
     * Gets the isDeleted value for this CustomConsoleComponent.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this CustomConsoleComponent.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the isHeightFixed value for this CustomConsoleComponent.
     * 
     * @return isHeightFixed
     */
    public java.lang.Boolean getIsHeightFixed() {
        return isHeightFixed;
    }


    /**
     * Sets the isHeightFixed value for this CustomConsoleComponent.
     * 
     * @param isHeightFixed
     */
    public void setIsHeightFixed(java.lang.Boolean isHeightFixed) {
        this.isHeightFixed = isHeightFixed;
    }


    /**
     * Gets the isHidden value for this CustomConsoleComponent.
     * 
     * @return isHidden
     */
    public java.lang.Boolean getIsHidden() {
        return isHidden;
    }


    /**
     * Sets the isHidden value for this CustomConsoleComponent.
     * 
     * @param isHidden
     */
    public void setIsHidden(java.lang.Boolean isHidden) {
        this.isHidden = isHidden;
    }


    /**
     * Gets the isPopoutDisabled value for this CustomConsoleComponent.
     * 
     * @return isPopoutDisabled
     */
    public java.lang.Boolean getIsPopoutDisabled() {
        return isPopoutDisabled;
    }


    /**
     * Sets the isPopoutDisabled value for this CustomConsoleComponent.
     * 
     * @param isPopoutDisabled
     */
    public void setIsPopoutDisabled(java.lang.Boolean isPopoutDisabled) {
        this.isPopoutDisabled = isPopoutDisabled;
    }


    /**
     * Gets the isWidthFixed value for this CustomConsoleComponent.
     * 
     * @return isWidthFixed
     */
    public java.lang.Boolean getIsWidthFixed() {
        return isWidthFixed;
    }


    /**
     * Sets the isWidthFixed value for this CustomConsoleComponent.
     * 
     * @param isWidthFixed
     */
    public void setIsWidthFixed(java.lang.Boolean isWidthFixed) {
        this.isWidthFixed = isWidthFixed;
    }


    /**
     * Gets the language value for this CustomConsoleComponent.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this CustomConsoleComponent.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the lastModifiedBy value for this CustomConsoleComponent.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this CustomConsoleComponent.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this CustomConsoleComponent.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this CustomConsoleComponent.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this CustomConsoleComponent.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CustomConsoleComponent.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the masterLabel value for this CustomConsoleComponent.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this CustomConsoleComponent.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }


    /**
     * Gets the namespacePrefix value for this CustomConsoleComponent.
     * 
     * @return namespacePrefix
     */
    public java.lang.String getNamespacePrefix() {
        return namespacePrefix;
    }


    /**
     * Sets the namespacePrefix value for this CustomConsoleComponent.
     * 
     * @param namespacePrefix
     */
    public void setNamespacePrefix(java.lang.String namespacePrefix) {
        this.namespacePrefix = namespacePrefix;
    }


    /**
     * Gets the relativeHeight value for this CustomConsoleComponent.
     * 
     * @return relativeHeight
     */
    public java.lang.Double getRelativeHeight() {
        return relativeHeight;
    }


    /**
     * Sets the relativeHeight value for this CustomConsoleComponent.
     * 
     * @param relativeHeight
     */
    public void setRelativeHeight(java.lang.Double relativeHeight) {
        this.relativeHeight = relativeHeight;
    }


    /**
     * Gets the relativeWidth value for this CustomConsoleComponent.
     * 
     * @return relativeWidth
     */
    public java.lang.Double getRelativeWidth() {
        return relativeWidth;
    }


    /**
     * Sets the relativeWidth value for this CustomConsoleComponent.
     * 
     * @param relativeWidth
     */
    public void setRelativeWidth(java.lang.Double relativeWidth) {
        this.relativeWidth = relativeWidth;
    }


    /**
     * Gets the systemModstamp value for this CustomConsoleComponent.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this CustomConsoleComponent.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the visualforcePage value for this CustomConsoleComponent.
     * 
     * @return visualforcePage
     */
    public com.sforce.soap.enterprise.sobject.ApexPage getVisualforcePage() {
        return visualforcePage;
    }


    /**
     * Sets the visualforcePage value for this CustomConsoleComponent.
     * 
     * @param visualforcePage
     */
    public void setVisualforcePage(com.sforce.soap.enterprise.sobject.ApexPage visualforcePage) {
        this.visualforcePage = visualforcePage;
    }


    /**
     * Gets the visualforcePageId value for this CustomConsoleComponent.
     * 
     * @return visualforcePageId
     */
    public java.lang.String getVisualforcePageId() {
        return visualforcePageId;
    }


    /**
     * Sets the visualforcePageId value for this CustomConsoleComponent.
     * 
     * @param visualforcePageId
     */
    public void setVisualforcePageId(java.lang.String visualforcePageId) {
        this.visualforcePageId = visualforcePageId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomConsoleComponent)) return false;
        CustomConsoleComponent other = (CustomConsoleComponent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.absoluteHeight==null && other.getAbsoluteHeight()==null) || 
             (this.absoluteHeight!=null &&
              this.absoluteHeight.equals(other.getAbsoluteHeight()))) &&
            ((this.absoluteWidth==null && other.getAbsoluteWidth()==null) || 
             (this.absoluteWidth!=null &&
              this.absoluteWidth.equals(other.getAbsoluteWidth()))) &&
            ((this.buttonIconUrl==null && other.getButtonIconUrl()==null) || 
             (this.buttonIconUrl!=null &&
              this.buttonIconUrl.equals(other.getButtonIconUrl()))) &&
            ((this.buttonStyle==null && other.getButtonStyle()==null) || 
             (this.buttonStyle!=null &&
              this.buttonStyle.equals(other.getButtonStyle()))) &&
            ((this.buttonText==null && other.getButtonText()==null) || 
             (this.buttonText!=null &&
              this.buttonText.equals(other.getButtonText()))) &&
            ((this.buttonWidth==null && other.getButtonWidth()==null) || 
             (this.buttonWidth!=null &&
              this.buttonWidth.equals(other.getButtonWidth()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.developerName==null && other.getDeveloperName()==null) || 
             (this.developerName!=null &&
              this.developerName.equals(other.getDeveloperName()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.isHeightFixed==null && other.getIsHeightFixed()==null) || 
             (this.isHeightFixed!=null &&
              this.isHeightFixed.equals(other.getIsHeightFixed()))) &&
            ((this.isHidden==null && other.getIsHidden()==null) || 
             (this.isHidden!=null &&
              this.isHidden.equals(other.getIsHidden()))) &&
            ((this.isPopoutDisabled==null && other.getIsPopoutDisabled()==null) || 
             (this.isPopoutDisabled!=null &&
              this.isPopoutDisabled.equals(other.getIsPopoutDisabled()))) &&
            ((this.isWidthFixed==null && other.getIsWidthFixed()==null) || 
             (this.isWidthFixed!=null &&
              this.isWidthFixed.equals(other.getIsWidthFixed()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
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
            ((this.namespacePrefix==null && other.getNamespacePrefix()==null) || 
             (this.namespacePrefix!=null &&
              this.namespacePrefix.equals(other.getNamespacePrefix()))) &&
            ((this.relativeHeight==null && other.getRelativeHeight()==null) || 
             (this.relativeHeight!=null &&
              this.relativeHeight.equals(other.getRelativeHeight()))) &&
            ((this.relativeWidth==null && other.getRelativeWidth()==null) || 
             (this.relativeWidth!=null &&
              this.relativeWidth.equals(other.getRelativeWidth()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.visualforcePage==null && other.getVisualforcePage()==null) || 
             (this.visualforcePage!=null &&
              this.visualforcePage.equals(other.getVisualforcePage()))) &&
            ((this.visualforcePageId==null && other.getVisualforcePageId()==null) || 
             (this.visualforcePageId!=null &&
              this.visualforcePageId.equals(other.getVisualforcePageId())));
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
        if (getAbsoluteHeight() != null) {
            _hashCode += getAbsoluteHeight().hashCode();
        }
        if (getAbsoluteWidth() != null) {
            _hashCode += getAbsoluteWidth().hashCode();
        }
        if (getButtonIconUrl() != null) {
            _hashCode += getButtonIconUrl().hashCode();
        }
        if (getButtonStyle() != null) {
            _hashCode += getButtonStyle().hashCode();
        }
        if (getButtonText() != null) {
            _hashCode += getButtonText().hashCode();
        }
        if (getButtonWidth() != null) {
            _hashCode += getButtonWidth().hashCode();
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
        if (getDeveloperName() != null) {
            _hashCode += getDeveloperName().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getIsHeightFixed() != null) {
            _hashCode += getIsHeightFixed().hashCode();
        }
        if (getIsHidden() != null) {
            _hashCode += getIsHidden().hashCode();
        }
        if (getIsPopoutDisabled() != null) {
            _hashCode += getIsPopoutDisabled().hashCode();
        }
        if (getIsWidthFixed() != null) {
            _hashCode += getIsWidthFixed().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
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
        if (getNamespacePrefix() != null) {
            _hashCode += getNamespacePrefix().hashCode();
        }
        if (getRelativeHeight() != null) {
            _hashCode += getRelativeHeight().hashCode();
        }
        if (getRelativeWidth() != null) {
            _hashCode += getRelativeWidth().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getVisualforcePage() != null) {
            _hashCode += getVisualforcePage().hashCode();
        }
        if (getVisualforcePageId() != null) {
            _hashCode += getVisualforcePageId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomConsoleComponent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CustomConsoleComponent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("absoluteHeight");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AbsoluteHeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("absoluteWidth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AbsoluteWidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buttonIconUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ButtonIconUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buttonStyle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ButtonStyle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buttonText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ButtonText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buttonWidth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ButtonWidth"));
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
        elemField.setFieldName("developerName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DeveloperName"));
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
        elemField.setFieldName("isHeightFixed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsHeightFixed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isHidden");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsHidden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPopoutDisabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsPopoutDisabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isWidthFixed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsWidthFixed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Language"));
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
        elemField.setFieldName("masterLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MasterLabel"));
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
        elemField.setFieldName("relativeHeight");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RelativeHeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relativeWidth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RelativeWidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("visualforcePage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "VisualforcePage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApexPage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visualforcePageId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "VisualforcePageId"));
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

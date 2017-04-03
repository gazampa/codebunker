/**
 * EmailServicesFunction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class EmailServicesFunction  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String addressInactiveAction;

    private com.sforce.soap.enterprise.QueryResult addresses;

    private java.lang.String apexClassId;

    private java.lang.String attachmentOption;

    private java.lang.String authenticationFailureAction;

    private java.lang.String authorizationFailureAction;

    private java.lang.String authorizedSenders;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String errorRoutingAddress;

    private java.lang.String functionInactiveAction;

    private java.lang.String functionName;

    private java.lang.Boolean isActive;

    private java.lang.Boolean isAuthenticationRequired;

    private java.lang.Boolean isErrorRoutingEnabled;

    private java.lang.Boolean isTextAttachmentsAsBinary;

    private java.lang.Boolean isTlsRequired;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String overLimitAction;

    private java.util.Calendar systemModstamp;

    public EmailServicesFunction() {
    }

    public EmailServicesFunction(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String addressInactiveAction,
           com.sforce.soap.enterprise.QueryResult addresses,
           java.lang.String apexClassId,
           java.lang.String attachmentOption,
           java.lang.String authenticationFailureAction,
           java.lang.String authorizationFailureAction,
           java.lang.String authorizedSenders,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String errorRoutingAddress,
           java.lang.String functionInactiveAction,
           java.lang.String functionName,
           java.lang.Boolean isActive,
           java.lang.Boolean isAuthenticationRequired,
           java.lang.Boolean isErrorRoutingEnabled,
           java.lang.Boolean isTextAttachmentsAsBinary,
           java.lang.Boolean isTlsRequired,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String overLimitAction,
           java.util.Calendar systemModstamp) {
        super(
            fieldsToNull,
            id);
        this.addressInactiveAction = addressInactiveAction;
        this.addresses = addresses;
        this.apexClassId = apexClassId;
        this.attachmentOption = attachmentOption;
        this.authenticationFailureAction = authenticationFailureAction;
        this.authorizationFailureAction = authorizationFailureAction;
        this.authorizedSenders = authorizedSenders;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.errorRoutingAddress = errorRoutingAddress;
        this.functionInactiveAction = functionInactiveAction;
        this.functionName = functionName;
        this.isActive = isActive;
        this.isAuthenticationRequired = isAuthenticationRequired;
        this.isErrorRoutingEnabled = isErrorRoutingEnabled;
        this.isTextAttachmentsAsBinary = isTextAttachmentsAsBinary;
        this.isTlsRequired = isTlsRequired;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.overLimitAction = overLimitAction;
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the addressInactiveAction value for this EmailServicesFunction.
     * 
     * @return addressInactiveAction
     */
    public java.lang.String getAddressInactiveAction() {
        return addressInactiveAction;
    }


    /**
     * Sets the addressInactiveAction value for this EmailServicesFunction.
     * 
     * @param addressInactiveAction
     */
    public void setAddressInactiveAction(java.lang.String addressInactiveAction) {
        this.addressInactiveAction = addressInactiveAction;
    }


    /**
     * Gets the addresses value for this EmailServicesFunction.
     * 
     * @return addresses
     */
    public com.sforce.soap.enterprise.QueryResult getAddresses() {
        return addresses;
    }


    /**
     * Sets the addresses value for this EmailServicesFunction.
     * 
     * @param addresses
     */
    public void setAddresses(com.sforce.soap.enterprise.QueryResult addresses) {
        this.addresses = addresses;
    }


    /**
     * Gets the apexClassId value for this EmailServicesFunction.
     * 
     * @return apexClassId
     */
    public java.lang.String getApexClassId() {
        return apexClassId;
    }


    /**
     * Sets the apexClassId value for this EmailServicesFunction.
     * 
     * @param apexClassId
     */
    public void setApexClassId(java.lang.String apexClassId) {
        this.apexClassId = apexClassId;
    }


    /**
     * Gets the attachmentOption value for this EmailServicesFunction.
     * 
     * @return attachmentOption
     */
    public java.lang.String getAttachmentOption() {
        return attachmentOption;
    }


    /**
     * Sets the attachmentOption value for this EmailServicesFunction.
     * 
     * @param attachmentOption
     */
    public void setAttachmentOption(java.lang.String attachmentOption) {
        this.attachmentOption = attachmentOption;
    }


    /**
     * Gets the authenticationFailureAction value for this EmailServicesFunction.
     * 
     * @return authenticationFailureAction
     */
    public java.lang.String getAuthenticationFailureAction() {
        return authenticationFailureAction;
    }


    /**
     * Sets the authenticationFailureAction value for this EmailServicesFunction.
     * 
     * @param authenticationFailureAction
     */
    public void setAuthenticationFailureAction(java.lang.String authenticationFailureAction) {
        this.authenticationFailureAction = authenticationFailureAction;
    }


    /**
     * Gets the authorizationFailureAction value for this EmailServicesFunction.
     * 
     * @return authorizationFailureAction
     */
    public java.lang.String getAuthorizationFailureAction() {
        return authorizationFailureAction;
    }


    /**
     * Sets the authorizationFailureAction value for this EmailServicesFunction.
     * 
     * @param authorizationFailureAction
     */
    public void setAuthorizationFailureAction(java.lang.String authorizationFailureAction) {
        this.authorizationFailureAction = authorizationFailureAction;
    }


    /**
     * Gets the authorizedSenders value for this EmailServicesFunction.
     * 
     * @return authorizedSenders
     */
    public java.lang.String getAuthorizedSenders() {
        return authorizedSenders;
    }


    /**
     * Sets the authorizedSenders value for this EmailServicesFunction.
     * 
     * @param authorizedSenders
     */
    public void setAuthorizedSenders(java.lang.String authorizedSenders) {
        this.authorizedSenders = authorizedSenders;
    }


    /**
     * Gets the createdBy value for this EmailServicesFunction.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this EmailServicesFunction.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this EmailServicesFunction.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this EmailServicesFunction.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this EmailServicesFunction.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this EmailServicesFunction.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the errorRoutingAddress value for this EmailServicesFunction.
     * 
     * @return errorRoutingAddress
     */
    public java.lang.String getErrorRoutingAddress() {
        return errorRoutingAddress;
    }


    /**
     * Sets the errorRoutingAddress value for this EmailServicesFunction.
     * 
     * @param errorRoutingAddress
     */
    public void setErrorRoutingAddress(java.lang.String errorRoutingAddress) {
        this.errorRoutingAddress = errorRoutingAddress;
    }


    /**
     * Gets the functionInactiveAction value for this EmailServicesFunction.
     * 
     * @return functionInactiveAction
     */
    public java.lang.String getFunctionInactiveAction() {
        return functionInactiveAction;
    }


    /**
     * Sets the functionInactiveAction value for this EmailServicesFunction.
     * 
     * @param functionInactiveAction
     */
    public void setFunctionInactiveAction(java.lang.String functionInactiveAction) {
        this.functionInactiveAction = functionInactiveAction;
    }


    /**
     * Gets the functionName value for this EmailServicesFunction.
     * 
     * @return functionName
     */
    public java.lang.String getFunctionName() {
        return functionName;
    }


    /**
     * Sets the functionName value for this EmailServicesFunction.
     * 
     * @param functionName
     */
    public void setFunctionName(java.lang.String functionName) {
        this.functionName = functionName;
    }


    /**
     * Gets the isActive value for this EmailServicesFunction.
     * 
     * @return isActive
     */
    public java.lang.Boolean getIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this EmailServicesFunction.
     * 
     * @param isActive
     */
    public void setIsActive(java.lang.Boolean isActive) {
        this.isActive = isActive;
    }


    /**
     * Gets the isAuthenticationRequired value for this EmailServicesFunction.
     * 
     * @return isAuthenticationRequired
     */
    public java.lang.Boolean getIsAuthenticationRequired() {
        return isAuthenticationRequired;
    }


    /**
     * Sets the isAuthenticationRequired value for this EmailServicesFunction.
     * 
     * @param isAuthenticationRequired
     */
    public void setIsAuthenticationRequired(java.lang.Boolean isAuthenticationRequired) {
        this.isAuthenticationRequired = isAuthenticationRequired;
    }


    /**
     * Gets the isErrorRoutingEnabled value for this EmailServicesFunction.
     * 
     * @return isErrorRoutingEnabled
     */
    public java.lang.Boolean getIsErrorRoutingEnabled() {
        return isErrorRoutingEnabled;
    }


    /**
     * Sets the isErrorRoutingEnabled value for this EmailServicesFunction.
     * 
     * @param isErrorRoutingEnabled
     */
    public void setIsErrorRoutingEnabled(java.lang.Boolean isErrorRoutingEnabled) {
        this.isErrorRoutingEnabled = isErrorRoutingEnabled;
    }


    /**
     * Gets the isTextAttachmentsAsBinary value for this EmailServicesFunction.
     * 
     * @return isTextAttachmentsAsBinary
     */
    public java.lang.Boolean getIsTextAttachmentsAsBinary() {
        return isTextAttachmentsAsBinary;
    }


    /**
     * Sets the isTextAttachmentsAsBinary value for this EmailServicesFunction.
     * 
     * @param isTextAttachmentsAsBinary
     */
    public void setIsTextAttachmentsAsBinary(java.lang.Boolean isTextAttachmentsAsBinary) {
        this.isTextAttachmentsAsBinary = isTextAttachmentsAsBinary;
    }


    /**
     * Gets the isTlsRequired value for this EmailServicesFunction.
     * 
     * @return isTlsRequired
     */
    public java.lang.Boolean getIsTlsRequired() {
        return isTlsRequired;
    }


    /**
     * Sets the isTlsRequired value for this EmailServicesFunction.
     * 
     * @param isTlsRequired
     */
    public void setIsTlsRequired(java.lang.Boolean isTlsRequired) {
        this.isTlsRequired = isTlsRequired;
    }


    /**
     * Gets the lastModifiedBy value for this EmailServicesFunction.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this EmailServicesFunction.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this EmailServicesFunction.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this EmailServicesFunction.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this EmailServicesFunction.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this EmailServicesFunction.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the overLimitAction value for this EmailServicesFunction.
     * 
     * @return overLimitAction
     */
    public java.lang.String getOverLimitAction() {
        return overLimitAction;
    }


    /**
     * Sets the overLimitAction value for this EmailServicesFunction.
     * 
     * @param overLimitAction
     */
    public void setOverLimitAction(java.lang.String overLimitAction) {
        this.overLimitAction = overLimitAction;
    }


    /**
     * Gets the systemModstamp value for this EmailServicesFunction.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this EmailServicesFunction.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmailServicesFunction)) return false;
        EmailServicesFunction other = (EmailServicesFunction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.addressInactiveAction==null && other.getAddressInactiveAction()==null) || 
             (this.addressInactiveAction!=null &&
              this.addressInactiveAction.equals(other.getAddressInactiveAction()))) &&
            ((this.addresses==null && other.getAddresses()==null) || 
             (this.addresses!=null &&
              this.addresses.equals(other.getAddresses()))) &&
            ((this.apexClassId==null && other.getApexClassId()==null) || 
             (this.apexClassId!=null &&
              this.apexClassId.equals(other.getApexClassId()))) &&
            ((this.attachmentOption==null && other.getAttachmentOption()==null) || 
             (this.attachmentOption!=null &&
              this.attachmentOption.equals(other.getAttachmentOption()))) &&
            ((this.authenticationFailureAction==null && other.getAuthenticationFailureAction()==null) || 
             (this.authenticationFailureAction!=null &&
              this.authenticationFailureAction.equals(other.getAuthenticationFailureAction()))) &&
            ((this.authorizationFailureAction==null && other.getAuthorizationFailureAction()==null) || 
             (this.authorizationFailureAction!=null &&
              this.authorizationFailureAction.equals(other.getAuthorizationFailureAction()))) &&
            ((this.authorizedSenders==null && other.getAuthorizedSenders()==null) || 
             (this.authorizedSenders!=null &&
              this.authorizedSenders.equals(other.getAuthorizedSenders()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.errorRoutingAddress==null && other.getErrorRoutingAddress()==null) || 
             (this.errorRoutingAddress!=null &&
              this.errorRoutingAddress.equals(other.getErrorRoutingAddress()))) &&
            ((this.functionInactiveAction==null && other.getFunctionInactiveAction()==null) || 
             (this.functionInactiveAction!=null &&
              this.functionInactiveAction.equals(other.getFunctionInactiveAction()))) &&
            ((this.functionName==null && other.getFunctionName()==null) || 
             (this.functionName!=null &&
              this.functionName.equals(other.getFunctionName()))) &&
            ((this.isActive==null && other.getIsActive()==null) || 
             (this.isActive!=null &&
              this.isActive.equals(other.getIsActive()))) &&
            ((this.isAuthenticationRequired==null && other.getIsAuthenticationRequired()==null) || 
             (this.isAuthenticationRequired!=null &&
              this.isAuthenticationRequired.equals(other.getIsAuthenticationRequired()))) &&
            ((this.isErrorRoutingEnabled==null && other.getIsErrorRoutingEnabled()==null) || 
             (this.isErrorRoutingEnabled!=null &&
              this.isErrorRoutingEnabled.equals(other.getIsErrorRoutingEnabled()))) &&
            ((this.isTextAttachmentsAsBinary==null && other.getIsTextAttachmentsAsBinary()==null) || 
             (this.isTextAttachmentsAsBinary!=null &&
              this.isTextAttachmentsAsBinary.equals(other.getIsTextAttachmentsAsBinary()))) &&
            ((this.isTlsRequired==null && other.getIsTlsRequired()==null) || 
             (this.isTlsRequired!=null &&
              this.isTlsRequired.equals(other.getIsTlsRequired()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.overLimitAction==null && other.getOverLimitAction()==null) || 
             (this.overLimitAction!=null &&
              this.overLimitAction.equals(other.getOverLimitAction()))) &&
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
        if (getAddressInactiveAction() != null) {
            _hashCode += getAddressInactiveAction().hashCode();
        }
        if (getAddresses() != null) {
            _hashCode += getAddresses().hashCode();
        }
        if (getApexClassId() != null) {
            _hashCode += getApexClassId().hashCode();
        }
        if (getAttachmentOption() != null) {
            _hashCode += getAttachmentOption().hashCode();
        }
        if (getAuthenticationFailureAction() != null) {
            _hashCode += getAuthenticationFailureAction().hashCode();
        }
        if (getAuthorizationFailureAction() != null) {
            _hashCode += getAuthorizationFailureAction().hashCode();
        }
        if (getAuthorizedSenders() != null) {
            _hashCode += getAuthorizedSenders().hashCode();
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
        if (getErrorRoutingAddress() != null) {
            _hashCode += getErrorRoutingAddress().hashCode();
        }
        if (getFunctionInactiveAction() != null) {
            _hashCode += getFunctionInactiveAction().hashCode();
        }
        if (getFunctionName() != null) {
            _hashCode += getFunctionName().hashCode();
        }
        if (getIsActive() != null) {
            _hashCode += getIsActive().hashCode();
        }
        if (getIsAuthenticationRequired() != null) {
            _hashCode += getIsAuthenticationRequired().hashCode();
        }
        if (getIsErrorRoutingEnabled() != null) {
            _hashCode += getIsErrorRoutingEnabled().hashCode();
        }
        if (getIsTextAttachmentsAsBinary() != null) {
            _hashCode += getIsTextAttachmentsAsBinary().hashCode();
        }
        if (getIsTlsRequired() != null) {
            _hashCode += getIsTlsRequired().hashCode();
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
        if (getOverLimitAction() != null) {
            _hashCode += getOverLimitAction().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmailServicesFunction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailServicesFunction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressInactiveAction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AddressInactiveAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addresses");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Addresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apexClassId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApexClassId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AttachmentOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenticationFailureAction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AuthenticationFailureAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationFailureAction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AuthorizationFailureAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizedSenders");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AuthorizedSenders"));
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
        elemField.setFieldName("errorRoutingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ErrorRoutingAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("functionInactiveAction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FunctionInactiveAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("functionName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FunctionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("isAuthenticationRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsAuthenticationRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isErrorRoutingEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsErrorRoutingEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTextAttachmentsAsBinary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsTextAttachmentsAsBinary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTlsRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsTlsRequired"));
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
        elemField.setFieldName("overLimitAction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OverLimitAction"));
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
